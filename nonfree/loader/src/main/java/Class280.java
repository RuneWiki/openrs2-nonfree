import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!sh")
public final class Class280 {

	@OriginalMember(owner = "loader!sh", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!sh", name = "b", descriptor = "J")
	private final long aLong227;

	@OriginalMember(owner = "loader!sh", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!sh", name = "a", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "loader!sh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class280(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong227 = arg2;
		this.aFile2 = arg0;
		this.aLong226 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!sh", name = "a", descriptor = "(II[BI)I")
	private int method6083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg2, arg0, arg3);
		if (arg1 > ~local6) {
			this.aLong226 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!sh", name = "a", descriptor = "(IJ)V")
	private void method6084(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		if (arg0 != 0) {
			this.aRandomAccessFile2 = null;
		}
		this.aLong226 = arg1;
	}

	@OriginalMember(owner = "loader!sh", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6085() {
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!sh", name = "b", descriptor = "(I)V")
	public void method6086(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!sh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6086(-32307);
		}
	}

	@OriginalMember(owner = "loader!sh", name = "a", descriptor = "(B)J")
	private long method6087(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == -35 ? this.aRandomAccessFile2.length() : 65L;
	}

	@OriginalMember(owner = "loader!sh", name = "b", descriptor = "(II[BI)V")
	private void method6088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg1 >= -125) {
			return;
		}
		if (this.aLong227 < (long) arg0 + this.aLong226) {
			this.aRandomAccessFile2.seek(this.aLong227);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg2, arg3, arg0);
			this.aLong226 += arg0;
		}
	}
}
