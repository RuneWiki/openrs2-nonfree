import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vk")
public final class Class228 {

	@OriginalMember(owner = "loader!vk", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!vk", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!vk", name = "c", descriptor = "J")
	private long aLong264;

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "J")
	private final long aLong263;

	@OriginalMember(owner = "loader!vk", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class228(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong264 = 0L;
		this.aLong263 = arg2;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "([BIIB)I")
	private int method5783(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile2.read(arg0, arg1, arg2);
		if (local14 > 0) {
			this.aLong264 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "(JB)V")
	private void method5784(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) throws IOException {
		if (arg1 <= 42) {
			this.method5785(-52);
		}
		this.aRandomAccessFile2.seek(arg0);
		this.aLong264 = arg0;
	}

	@OriginalMember(owner = "loader!vk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5786();
		}
	}

	@OriginalMember(owner = "loader!vk", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method5785(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!vk", name = "b", descriptor = "(I)V")
	public void method5786() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "(I)J")
	private long method5787(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != -1) {
			this.aLong264 = -11L;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "(II[BI)V")
	private void method5788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if ((long) arg1 + this.aLong264 <= this.aLong263) {
			this.aRandomAccessFile2.write(arg2, arg0, arg1);
			this.aLong264 += arg1;
		} else {
			this.aRandomAccessFile2.seek(this.aLong263);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}
}
