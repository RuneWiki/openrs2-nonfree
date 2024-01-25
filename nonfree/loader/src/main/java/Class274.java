import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ko")
public final class Class274 {

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ko", name = "b", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "loader!ko", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!ko", name = "c", descriptor = "J")
	private final long aLong223;

	@OriginalMember(owner = "loader!ko", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class274(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong222 = 0L;
		this.aFile2 = arg0;
		this.aLong223 = arg2;
		@Pc(40) int local40 = this.aRandomAccessFile2.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local40);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "([BIII)I")
	private int method6037(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg1, arg2);
		if (~local6 < arg3) {
			this.aLong222 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method6038(@OriginalArg(0) byte arg0) {
		return arg0 >= -99 ? (File) null : this.aFile2;
	}

	@OriginalMember(owner = "loader!ko", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6040();
		}
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(II[BI)V")
	private void method6039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong223 < (long) arg0 + this.aLong222) {
			this.aRandomAccessFile2.seek(this.aLong223);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg1 != 25525) {
			this.method6038((byte) -3);
		}
		this.aRandomAccessFile2.write(arg2, arg3, arg0);
		this.aLong222 += arg0;
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(I)V")
	public void method6040() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!ko", name = "b", descriptor = "(B)J")
	private long method6041(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 > -73 ? 105L : this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!ko", name = "a", descriptor = "(JI)V")
	private void method6042(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong222 = arg0;
		if (arg1 != 0) {
			this.aFile2 = null;
		}
	}
}
