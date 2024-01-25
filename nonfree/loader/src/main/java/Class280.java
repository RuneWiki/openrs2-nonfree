import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rh")
public final class Class280 {

	@OriginalMember(owner = "loader!rh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!rh", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "J")
	private long aLong404;

	@OriginalMember(owner = "loader!rh", name = "c", descriptor = "J")
	private long aLong405;

	@OriginalMember(owner = "loader!rh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class280(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong404 = 0L;
		this.aLong405 = arg2;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "(BJ)V")
	private void method6360(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) throws IOException {
		if (arg0 < 120) {
			this.method6362(17);
		}
		this.aRandomAccessFile2.seek(arg1);
		this.aLong404 = arg1;
	}

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "(ZI[BI)V")
	private void method6361(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong405 < this.aLong404 + (long) arg1) {
			this.aRandomAccessFile2.seek(this.aLong405);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (!arg0) {
			this.method6362(60);
		}
		this.aRandomAccessFile2.write(arg2, arg3, arg1);
		this.aLong404 += arg1;
	}

	@OriginalMember(owner = "loader!rh", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method6362(@OriginalArg(0) int arg0) {
		if (arg0 < 99) {
			this.aRandomAccessFile2 = null;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "(B)J")
	private long method6363() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "(I)V")
	public void method6364() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!rh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6364();
		}
	}

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "([BBII)I")
	private int method6365(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg2, arg3);
		if (local6 > 0) {
			this.aLong404 += local6;
		}
		if (arg1 != -108) {
			this.aLong405 = 110L;
		}
		return local6;
	}
}
