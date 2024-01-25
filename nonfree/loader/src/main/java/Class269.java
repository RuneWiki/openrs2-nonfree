import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!de")
public final class Class269 {

	@OriginalMember(owner = "loader!de", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "J")
	private final long aLong233;

	@OriginalMember(owner = "loader!de", name = "c", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "loader!de", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class269(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong233 = arg2;
		this.aLong232 = 0L;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(JB)V")
	private void method6620(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1 <= -102) {
			this.aLong232 = arg0;
		}
	}

	@OriginalMember(owner = "loader!de", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6624();
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(III[B)V")
	private void method6621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong233 < this.aLong232 + (long) arg0) {
			this.aRandomAccessFile2.seek(this.aLong233);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else if (arg1 == 1) {
			this.aRandomAccessFile2.write(arg3, arg2, arg0);
			this.aLong232 += arg0;
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "([BIIB)I")
	private int method6622(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong232 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(B)J")
	private long method6623(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == -17 ? this.aRandomAccessFile2.length() : 99L;
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(I)V")
	public void method6624() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method6625(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aLong232 = -10L;
		}
		return this.aFile2;
	}
}
