import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!mi")
public final class Class223 {

	@OriginalMember(owner = "loader!mi", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!mi", name = "c", descriptor = "J")
	private final long aLong220;

	@OriginalMember(owner = "loader!mi", name = "b", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "loader!mi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class223(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong220 = arg2;
		this.aLong221 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!mi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6041();
		}
	}

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(II[BI)I")
	private int method6037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg1 != -10022) {
			this.aFile2 = null;
		}
		@Pc(13) int local13 = this.aRandomAccessFile2.read(arg2, arg3, arg0);
		if (local13 > 0) {
			this.aLong221 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method6038(@OriginalArg(0) byte arg0) {
		return arg0 > -89 ? (File) null : this.aFile2;
	}

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(BJ)V")
	private void method6039(@OriginalArg(1) long arg0) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong221 = arg0;
	}

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "([BIII)V")
	private void method6040(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong221 + (long) arg1 > this.aLong220) {
			this.aRandomAccessFile2.seek(this.aLong220);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg0, arg3, arg1);
		if (arg2 != -16644) {
			this.method6038((byte) 105);
		}
		this.aLong221 += arg1;
	}

	@OriginalMember(owner = "loader!mi", name = "b", descriptor = "(I)V")
	public void method6041() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(I)J")
	private long method6042(@OriginalArg(0) int arg0) throws IOException {
		return arg0 == 13136 ? this.aRandomAccessFile2.length() : 123L;
	}
}
