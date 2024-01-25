import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ia")
public final class Class257 {

	@OriginalMember(owner = "loader!ia", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ia", name = "a", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "loader!ia", name = "c", descriptor = "J")
	private long aLong242;

	@OriginalMember(owner = "loader!ia", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!ia", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class257(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong241 = arg2;
		this.aLong242 = 0L;
		this.aFile2 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5759();
		}
	}

	@OriginalMember(owner = "loader!ia", name = "a", descriptor = "(BII[B)I")
	private int method5758(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg0 != 46) {
			this.aFile2 = null;
		}
		@Pc(13) int local13 = this.aRandomAccessFile2.read(arg3, arg2, arg1);
		if (local13 > 0) {
			this.aLong242 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "loader!ia", name = "a", descriptor = "(B)V")
	public void method5759() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!ia", name = "b", descriptor = "(I)J")
	private long method5760(@OriginalArg(0) int arg0) throws IOException {
		return arg0 == 0 ? this.aRandomAccessFile2.length() : 120L;
	}

	@OriginalMember(owner = "loader!ia", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5761(@OriginalArg(0) int arg0) {
		if (arg0 < 38) {
			this.aLong241 = -119L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!ia", name = "a", descriptor = "(JI)V")
	private void method5762(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong242 = arg0;
		if (arg1 != 0) {
			this.aFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!ia", name = "a", descriptor = "(III[B)V")
	private void method5763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong241 < (long) arg0 + this.aLong242) {
			this.aRandomAccessFile2.seek(this.aLong241);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg3, arg2, arg0);
		this.aLong242 += arg0;
		if (arg1 != 401) {
			this.aLong241 = 9L;
		}
	}
}
