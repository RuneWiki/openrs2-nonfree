import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!laa")
public final class Class327 {

	@OriginalMember(owner = "loader!laa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!laa", name = "b", descriptor = "J")
	private long aLong398;

	@OriginalMember(owner = "loader!laa", name = "d", descriptor = "J")
	private long aLong399;

	@OriginalMember(owner = "loader!laa", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!laa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class327(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong398 = arg2;
		this.aLong399 = 0L;
		this.aFile2 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!laa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7602();
		}
	}

	@OriginalMember(owner = "loader!laa", name = "b", descriptor = "(I)J")
	private long method7599(@OriginalArg(0) int arg0) throws IOException {
		return arg0 == -25730 ? this.aRandomAccessFile2.length() : 85L;
	}

	@OriginalMember(owner = "loader!laa", name = "a", descriptor = "(I[BII)I")
	private int method7600(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg3 > -51) {
			this.aLong399 = 69L;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg1, arg2, arg0);
		if (local12 > 0) {
			this.aLong399 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "loader!laa", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method7601(@OriginalArg(0) int arg0) {
		if (arg0 != 14357) {
			this.aLong399 = -40L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!laa", name = "c", descriptor = "(I)V")
	public void method7602() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!laa", name = "a", descriptor = "(JZ)V")
	private void method7603(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong399 = arg0;
		if (arg1) {
			this.aFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!laa", name = "a", descriptor = "(BI[BI)V")
	private void method7604(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong398 < this.aLong399 + (long) arg1) {
			this.aRandomAccessFile2.seek(this.aLong398);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg2, arg3, arg1);
		this.aLong399 += arg1;
		if (arg0 < 92) {
			this.aLong398 = -67L;
		}
	}
}
