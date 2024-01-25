import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vn")
public final class Class232 {

	@OriginalMember(owner = "loader!vn", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!vn", name = "a", descriptor = "J")
	private final long aLong223;

	@OriginalMember(owner = "loader!vn", name = "d", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "loader!vn", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!vn", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class232(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong223 = arg2;
		this.aLong224 = 0L;
		this.aFile2 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!vn", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5954(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!vn", name = "a", descriptor = "(JZ)V")
	private void method5955(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (!arg1) {
			this.method5954(58);
		}
		this.aLong224 = arg0;
	}

	@OriginalMember(owner = "loader!vn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5958();
		}
	}

	@OriginalMember(owner = "loader!vn", name = "a", descriptor = "(I[BII)I")
	private int method5956(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg1, arg2, arg3);
		if (local6 > arg0) {
			this.aLong224 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!vn", name = "b", descriptor = "(B)J")
	private long method5957(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == 71 ? this.aRandomAccessFile2.length() : -97L;
	}

	@OriginalMember(owner = "loader!vn", name = "a", descriptor = "(B)V")
	public void method5958() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!vn", name = "a", descriptor = "(I[BIZ)V")
	private void method5959(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) throws IOException {
		if (arg3) {
			this.aFile2 = null;
		}
		if (this.aLong224 + (long) arg0 > this.aLong223) {
			this.aRandomAccessFile2.seek(this.aLong223);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg1, arg2, arg0);
			this.aLong224 += arg0;
		}
	}
}
