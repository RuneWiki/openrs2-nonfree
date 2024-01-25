import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ob")
public final class Class325 {

	@OriginalMember(owner = "loader!ob", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ob", name = "c", descriptor = "J")
	private long aLong254;

	@OriginalMember(owner = "loader!ob", name = "b", descriptor = "J")
	private final long aLong255;

	@OriginalMember(owner = "loader!ob", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!ob", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class325(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong254 = 0L;
		this.aLong255 = arg2;
		this.aFile2 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ob", name = "a", descriptor = "(IJ)V")
	private void method8296(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong254 = arg0;
	}

	@OriginalMember(owner = "loader!ob", name = "a", descriptor = "(I)J")
	private long method8297(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != -1) {
			this.aLong254 = -37L;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!ob", name = "a", descriptor = "(I[BIB)V")
	private void method8298(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		if (arg3 <= 66) {
			return;
		}
		if (this.aLong255 >= this.aLong254 + (long) arg2) {
			this.aRandomAccessFile2.write(arg1, arg0, arg2);
			this.aLong254 += arg2;
		} else {
			this.aRandomAccessFile2.seek(this.aLong255);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!ob", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8300();
		}
	}

	@OriginalMember(owner = "loader!ob", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method8299(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!ob", name = "a", descriptor = "(B)V")
	public void method8300() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!ob", name = "a", descriptor = "(Z[BII)I")
	private int method8301(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg1, arg2, arg3);
		if (arg0) {
			this.method8299(false);
		}
		if (local6 > 0) {
			this.aLong254 += local6;
		}
		return local6;
	}
}
