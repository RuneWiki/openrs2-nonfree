import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ri")
public final class Class232 {

	@OriginalMember(owner = "loader!ri", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ri", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!ri", name = "a", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "loader!ri", name = "d", descriptor = "J")
	private long aLong223;

	@OriginalMember(owner = "loader!ri", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class232(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong222 = 0L;
		this.aLong223 = arg2;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ri", name = "b", descriptor = "(B)V")
	public void method6148() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!ri", name = "a", descriptor = "(IJ)V")
	private void method6149(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong222 = arg0;
	}

	@OriginalMember(owner = "loader!ri", name = "a", descriptor = "(III[B)V")
	private void method6150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg2 < 0) {
			return;
		}
		if (this.aLong222 + (long) arg1 <= this.aLong223) {
			this.aRandomAccessFile2.write(arg3, arg0, arg1);
			this.aLong222 += arg1;
		} else {
			this.aRandomAccessFile2.seek(this.aLong223);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!ri", name = "a", descriptor = "(B)J")
	private long method6151(@OriginalArg(0) byte arg0) throws IOException {
		if (arg0 < 52) {
			this.method6153(-45);
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!ri", name = "a", descriptor = "(II[BI)I")
	private int method6152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg2, arg0, arg3);
		if (arg1 < local6) {
			this.aLong222 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!ri", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6148();
		}
	}

	@OriginalMember(owner = "loader!ri", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6153(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.aLong223 = 70L;
		}
		return this.aFile2;
	}
}
