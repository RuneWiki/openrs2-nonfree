import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!jc")
public final class Class225 {

	@OriginalMember(owner = "loader!jc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!jc", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "loader!jc", name = "c", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "loader!jc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class225(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong218 = arg2;
		this.aLong217 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method5758(@OriginalArg(0) boolean arg0) {
		return arg0 ? (File) null : this.aFile2;
	}

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "(II[BB)V")
	private void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong217 <= this.aLong218) {
			this.aRandomAccessFile2.write(arg2, arg0, arg1);
			this.aLong217 += arg1;
		} else {
			this.aRandomAccessFile2.seek(this.aLong218);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "(I)J")
	private long method5760(@OriginalArg(0) int arg0) throws IOException {
		return arg0 == -6067 ? this.aRandomAccessFile2.length() : -100L;
	}

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "(IJ)V")
	private void method5761(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		if (arg0 != 0) {
			this.aLong218 = 12L;
		}
		this.aLong217 = arg1;
	}

	@OriginalMember(owner = "loader!jc", name = "b", descriptor = "(I)V")
	public void method5762(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "([BIII)I")
	private int method5763(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg2 < 35) {
			this.method5758(false);
		}
		@Pc(13) int local13 = this.aRandomAccessFile2.read(arg0, arg1, arg3);
		if (local13 > 0) {
			this.aLong217 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "loader!jc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5762(-8060);
		}
	}
}
