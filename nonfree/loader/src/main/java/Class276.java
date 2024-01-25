import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!en")
public final class Class276 {

	@OriginalMember(owner = "loader!en", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!en", name = "c", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "loader!en", name = "d", descriptor = "J")
	private final long aLong229;

	@OriginalMember(owner = "loader!en", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class276(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong228 = 0L;
		this.aLong229 = arg2;
		@Pc(43) int local43 = this.aRandomAccessFile2.read();
		if (local43 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local43);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!en", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6081();
		}
	}

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(JI)V")
	private void method6077(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong228 = arg0;
		if (arg1 != 0) {
			this.aLong228 = -103L;
		}
	}

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6078(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method6078(67);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(II[BI)I")
	private int method6079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg2, arg1, arg3);
		if (arg0 != 0) {
			this.aFile2 = null;
		}
		if (local6 > 0) {
			this.aLong228 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(I[BII)V")
	private void method6080(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg0 != 1) {
			return;
		}
		if (this.aLong229 >= this.aLong228 + (long) arg2) {
			this.aRandomAccessFile2.write(arg1, arg3, arg2);
			this.aLong228 += arg2;
		} else {
			this.aRandomAccessFile2.seek(this.aLong229);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!en", name = "a", descriptor = "(B)V")
	public void method6081() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!en", name = "b", descriptor = "(I)J")
	private long method6082(@OriginalArg(0) int arg0) throws IOException {
		return arg0 == 0 ? this.aRandomAccessFile2.length() : -62L;
	}
}
