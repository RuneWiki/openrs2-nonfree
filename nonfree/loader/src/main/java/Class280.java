import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!st")
public final class Class280 {

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!st", name = "c", descriptor = "J")
	private final long aLong240;

	@OriginalMember(owner = "loader!st", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!st", name = "d", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "loader!st", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class280(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong240 = arg2;
		this.aFile2 = arg0;
		this.aLong241 = 0L;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(B)V")
	public void method6062() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(BII[B)V")
	private void method6063(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong240 < (long) arg2 + this.aLong241) {
			this.aRandomAccessFile2.seek(this.aLong240);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg3, arg1, arg2);
		this.aLong241 += arg2;
		if (arg0 > -86) {
			this.aFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(IB[BI)I")
	private int method6064(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg1 != 39) {
			return -69;
		}
		@Pc(11) int local11 = this.aRandomAccessFile2.read(arg2, arg0, arg3);
		if (local11 > 0) {
			this.aLong241 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "loader!st", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6062();
		}
	}

	@OriginalMember(owner = "loader!st", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method6065(@OriginalArg(0) byte arg0) {
		if (arg0 < 4) {
			this.aRandomAccessFile2 = null;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(JB)V")
	private void method6066(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong241 = arg0;
		if (arg1 != -99) {
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!st", name = "a", descriptor = "(I)J")
	private long method6067(@OriginalArg(0) int arg0) throws IOException {
		return arg0 < 15 ? 60L : this.aRandomAccessFile2.length();
	}
}
