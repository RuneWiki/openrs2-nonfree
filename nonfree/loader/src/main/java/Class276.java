import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!gq")
public final class Class276 {

	@OriginalMember(owner = "loader!gq", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!gq", name = "c", descriptor = "J")
	private final long aLong232;

	@OriginalMember(owner = "loader!gq", name = "b", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!gq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class276(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong232 = arg2;
		this.aLong231 = 0L;
		this.aFile2 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(II[BZ)I")
	private int method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) throws IOException {
		if (arg3) {
			return 80;
		}
		@Pc(10) int local10 = this.aRandomAccessFile2.read(arg2, arg0, arg1);
		if (local10 > 0) {
			this.aLong231 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "loader!gq", name = "c", descriptor = "(I)V")
	public void method5917() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(IBI[B)V")
	private void method5918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong232 < this.aLong231 + (long) arg1) {
			this.aRandomAccessFile2.seek(this.aLong232);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg2, arg0, arg1);
			this.aLong231 += arg1;
		}
	}

	@OriginalMember(owner = "loader!gq", name = "b", descriptor = "(I)J")
	private long method5919(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 < 36) {
			this.aLong231 = 80L;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5920(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!gq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5917();
		}
	}

	@OriginalMember(owner = "loader!gq", name = "a", descriptor = "(JB)V")
	private void method5921(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong231 = arg0;
	}
}
