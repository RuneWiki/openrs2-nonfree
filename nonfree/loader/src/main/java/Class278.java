import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!km")
public final class Class278 {

	@OriginalMember(owner = "loader!km", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!km", name = "d", descriptor = "J")
	private long aLong239;

	@OriginalMember(owner = "loader!km", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!km", name = "a", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "loader!km", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class278(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong239 = 0L;
		this.aFile2 = arg0;
		this.aLong238 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!km", name = "a", descriptor = "(IJ)V")
	private void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong239 = arg1;
		if (arg0 <= 8) {
			this.method6134(18);
		}
	}

	@OriginalMember(owner = "loader!km", name = "a", descriptor = "(Z)V")
	public void method6130() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!km", name = "a", descriptor = "(B)J")
	private long method6131(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == 78 ? this.aRandomAccessFile2.length() : -8L;
	}

	@OriginalMember(owner = "loader!km", name = "a", descriptor = "(IBI[B)I")
	private int method6132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile2.read(arg2, arg1, arg0);
		if (local14 > 0) {
			this.aLong239 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "loader!km", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6130();
		}
	}

	@OriginalMember(owner = "loader!km", name = "a", descriptor = "([BZII)V")
	private void method6133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong238 < (long) arg3 + this.aLong239) {
			this.aRandomAccessFile2.seek(this.aLong238);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg0, arg2, arg3);
		if (!arg1) {
			this.method6134(36);
		}
		this.aLong239 += arg3;
	}

	@OriginalMember(owner = "loader!km", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6134(@OriginalArg(0) int arg0) {
		if (arg0 != 6387) {
			this.aLong238 = 64L;
		}
		return this.aFile2;
	}
}
