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

	@OriginalMember(owner = "loader!vk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!vk", name = "c", descriptor = "J")
	private final long aLong236;

	@OriginalMember(owner = "loader!vk", name = "d", descriptor = "J")
	private long aLong237;

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
		this.aLong236 = arg2;
		this.aLong237 = 0L;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method5781(@OriginalArg(0) byte arg0) {
		if (arg0 <= 80) {
			this.method5781((byte) 62);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!vk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5784();
		}
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "([BBII)V")
	private void method5782(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong236 < this.aLong237 + (long) arg3) {
			this.aRandomAccessFile2.seek(this.aLong236);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else if (arg1 <= -43) {
			this.aRandomAccessFile2.write(arg0, arg2, arg3);
			this.aLong237 += arg3;
		}
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "(I)J")
	private long method5783(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != -1) {
			this.aRandomAccessFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!vk", name = "b", descriptor = "(I)V")
	public void method5784() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "([BIBI)I")
	private int method5785(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile2.read(arg0, arg2, arg1);
		if (local14 > 0) {
			this.aLong237 += local14;
		}
		return local14;
	}

	@OriginalMember(owner = "loader!vk", name = "a", descriptor = "(JI)V")
	private void method5786(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong237 = arg0;
	}
}
