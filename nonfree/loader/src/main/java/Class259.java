import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wj")
public final class Class259 {

	@OriginalMember(owner = "loader!wj", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "J")
	private final long aLong217;

	@OriginalMember(owner = "loader!wj", name = "c", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!wj", name = "b", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "loader!wj", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class259(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong217 = arg2;
		this.aFile2 = arg0;
		this.aLong218 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6200(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!wj", name = "b", descriptor = "(B)J")
	private long method6201(@OriginalArg(0) byte arg0) throws IOException {
		if (arg0 != -45) {
			this.aRandomAccessFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "(I[BBI)I")
	private int method6202(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg2 < 8) {
			this.method6200(58);
		}
		@Pc(13) int local13 = this.aRandomAccessFile2.read(arg1, arg0, arg3);
		if (local13 > 0) {
			this.aLong218 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "loader!wj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6205();
		}
	}

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "(IJ)V")
	private void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		if (arg0 != 0) {
			this.aLong218 = 119L;
		}
		this.aLong218 = arg1;
	}

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "([BIII)V")
	private void method6204(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong217 < this.aLong218 + (long) arg1) {
			this.aRandomAccessFile2.seek(this.aLong217);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg0, arg2, arg1);
		this.aLong218 += arg1;
		if (arg3 < 28) {
			this.aFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!wj", name = "a", descriptor = "(B)V")
	public void method6205() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
