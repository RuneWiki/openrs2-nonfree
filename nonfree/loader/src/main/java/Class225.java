import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!im")
public final class Class225 {

	@OriginalMember(owner = "loader!im", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!im", name = "d", descriptor = "J")
	private final long aLong215;

	@OriginalMember(owner = "loader!im", name = "c", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!im", name = "b", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "loader!im", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class225(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong215 = arg2;
		this.aFile2 = arg0;
		this.aLong216 = 0L;
		@Pc(40) int local40 = this.aRandomAccessFile2.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local40);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!im", name = "a", descriptor = "(I)V")
	public void method5893() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!im", name = "a", descriptor = "(B)J")
	private long method5894() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!im", name = "a", descriptor = "(Z[BII)V")
	private void method5895(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong215 < (long) arg2 + this.aLong216) {
			this.aRandomAccessFile2.seek(this.aLong215);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg1, arg3, arg2);
		this.aLong216 += arg2;
		if (arg0) {
			this.aFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!im", name = "a", descriptor = "(IJ)V")
	private void method5896(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		if (arg0 != 0) {
			this.aRandomAccessFile2 = null;
		}
		this.aRandomAccessFile2.seek(arg1);
		this.aLong216 = arg1;
	}

	@OriginalMember(owner = "loader!im", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5893();
		}
	}

	@OriginalMember(owner = "loader!im", name = "a", descriptor = "([BIII)I")
	private int method5897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg2 != -5921) {
			return 66;
		}
		@Pc(11) int local11 = this.aRandomAccessFile2.read(arg0, arg3, arg1);
		if (local11 > 0) {
			this.aLong216 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "loader!im", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5898(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.aFile2 : (File) null;
	}
}
