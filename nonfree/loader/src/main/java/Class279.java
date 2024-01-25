import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!oh")
public final class Class279 {

	@OriginalMember(owner = "loader!oh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!oh", name = "a", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "loader!oh", name = "c", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "loader!oh", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!oh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class279(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong229 = 0L;
		this.aLong230 = arg2;
		this.aFile2 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile2.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local35);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!oh", name = "a", descriptor = "(I)V")
	public void method5784(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!oh", name = "a", descriptor = "(III[B)I")
	private int method5785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile2.read(arg2, arg0, arg1);
		if (local14 > 0) {
			this.aLong229 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "loader!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5784(-1);
		}
	}

	@OriginalMember(owner = "loader!oh", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5786(@OriginalArg(0) int arg0) {
		if (arg0 != -27008) {
			this.method5786(-123);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!oh", name = "a", descriptor = "(B)J")
	private long method5787(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == -51 ? this.aRandomAccessFile2.length() : 46L;
	}

	@OriginalMember(owner = "loader!oh", name = "a", descriptor = "(IB[BI)V")
	private void method5788(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aLong229 + (long) arg0 > this.aLong230) {
			this.aRandomAccessFile2.seek(this.aLong230);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg1, arg2, arg0);
			this.aLong229 += arg0;
		}
	}

	@OriginalMember(owner = "loader!oh", name = "a", descriptor = "(JB)V")
	private void method5789(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1 != 36) {
			this.aLong230 = -101L;
		}
		this.aLong229 = arg0;
	}
}
