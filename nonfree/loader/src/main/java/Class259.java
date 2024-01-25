import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!sb")
public final class Class259 {

	@OriginalMember(owner = "loader!sb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "loader!sb", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!sb", name = "b", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "loader!sb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class259(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong213 = 0L;
		this.aFile2 = arg0;
		this.aLong214 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(I)J")
	private long method5823(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 >= -123) {
			this.aRandomAccessFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(IIZ[B)I")
	private int method5824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (!arg2) {
			this.aLong213 = 117L;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg3, arg1, arg0);
		if (local12 > 0) {
			this.aLong213 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "loader!sb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5828();
		}
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(I[BIZ)V")
	private void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws IOException {
		if ((long) arg2 + this.aLong213 <= this.aLong214) {
			this.aRandomAccessFile2.write(arg1, arg0, arg2);
			if (!arg3) {
				this.aLong213 += arg2;
			}
		} else {
			this.aRandomAccessFile2.seek(this.aLong214);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method5826(@OriginalArg(0) byte arg0) {
		return arg0 < 16 ? (File) null : this.aFile2;
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(IJ)V")
	private void method5827(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		if (arg0 != 0) {
			this.aLong214 = -127L;
		}
		this.aRandomAccessFile2.seek(arg1);
		this.aLong213 = arg1;
	}

	@OriginalMember(owner = "loader!sb", name = "a", descriptor = "(Z)V")
	public void method5828() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
