import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!je")
public final class Class277 {

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!je", name = "b", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "loader!je", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!je", name = "d", descriptor = "J")
	private final long aLong230;

	@OriginalMember(owner = "loader!je", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class277(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong229 = 0L;
		this.aFile2 = arg0;
		this.aLong230 = arg2;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!je", name = "b", descriptor = "(B)J")
	private long method6225() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "(B)V")
	public void method6226() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "(IJ)V")
	private void method6227(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		if (arg0 <= -44) {
			this.aRandomAccessFile2.seek(arg1);
			this.aLong229 = arg1;
		}
	}

	@OriginalMember(owner = "loader!je", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6226();
		}
	}

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "(II[BZ)I")
	private int method6228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) throws IOException {
		if (!arg3) {
			return -122;
		}
		@Pc(11) int local11 = this.aRandomAccessFile2.read(arg2, arg1, arg0);
		if (local11 > 0) {
			this.aLong229 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6229(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method6229(-57);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "(III[B)V")
	private void method6230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong229 + (long) arg1 > this.aLong230) {
			this.aRandomAccessFile2.seek(this.aLong230);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg0 != 0) {
			this.method6229(-54);
		}
		this.aRandomAccessFile2.write(arg3, arg2, arg1);
		this.aLong229 += arg1;
	}
}
