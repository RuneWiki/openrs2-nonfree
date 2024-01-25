import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!jp")
public final class Class223 {

	@OriginalMember(owner = "loader!jp", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!jp", name = "b", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "loader!jp", name = "c", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!jp", name = "d", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "loader!jp", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class223(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong217 = arg2;
		this.aFile2 = arg0;
		this.aLong216 = 0L;
		@Pc(43) int local43 = this.aRandomAccessFile2.read();
		if (local43 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local43);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!jp", name = "a", descriptor = "(I[BII)V")
	private void method5750(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong217 < (long) arg3 + this.aLong216) {
			this.aRandomAccessFile2.seek(this.aLong217);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg2 <= 1) {
			this.aLong217 = 43L;
		}
		this.aRandomAccessFile2.write(arg1, arg0, arg3);
		this.aLong216 += arg3;
	}

	@OriginalMember(owner = "loader!jp", name = "b", descriptor = "(I)J")
	private long method5751(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 >= -10) {
			this.aFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!jp", name = "a", descriptor = "(JB)V")
	private void method5752(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong216 = arg0;
	}

	@OriginalMember(owner = "loader!jp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5755(0);
		}
	}

	@OriginalMember(owner = "loader!jp", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5753(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method5753(-36);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!jp", name = "b", descriptor = "(I[BII)I")
	private int method5754(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg1, arg0, arg2);
		if (local6 > arg3) {
			this.aLong216 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!jp", name = "c", descriptor = "(I)V")
	public void method5755(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
