import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!k")
public final class Class226 {

	@OriginalMember(owner = "loader!k", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!k", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!k", name = "b", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "J")
	private final long aLong219;

	@OriginalMember(owner = "loader!k", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class226(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong220 = 0L;
		this.aLong219 = arg2;
		@Pc(40) int local40 = this.aRandomAccessFile2.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local40);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "(IZI[B)V")
	private void method6065(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong219 < this.aLong220 + (long) arg0) {
			this.aRandomAccessFile2.seek(this.aLong219);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg3, arg2, arg0);
		this.aLong220 += arg0;
		if (!arg1) {
			this.method6070(38);
		}
	}

	@OriginalMember(owner = "loader!k", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6066();
		}
	}

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "(B)V")
	public void method6066() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!k", name = "b", descriptor = "(B)J")
	private long method6067(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == -56 ? this.aRandomAccessFile2.length() : 127L;
	}

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "(JB)V")
	private void method6068(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) throws IOException {
		if (arg1 > 0) {
			this.method6070(1);
		}
		this.aRandomAccessFile2.seek(arg0);
		this.aLong220 = arg0;
	}

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "(BI[BI)I")
	private int method6069(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg0 != 66) {
			return 108;
		}
		@Pc(11) int local11 = this.aRandomAccessFile2.read(arg2, arg1, arg3);
		if (local11 > 0) {
			this.aLong220 += local11;
		}
		return local11;
	}

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6070(@OriginalArg(0) int arg0) {
		if (arg0 != 6348) {
			this.method6070(-32);
		}
		return this.aFile2;
	}
}
