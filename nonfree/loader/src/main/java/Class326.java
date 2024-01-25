import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hd")
public final class Class326 {

	@OriginalMember(owner = "loader!hd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!hd", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "J")
	private long aLong248;

	@OriginalMember(owner = "loader!hd", name = "c", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "loader!hd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class326(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong248 = 0L;
		this.aLong247 = arg2;
		@Pc(35) int local35 = this.aRandomAccessFile2.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local35);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!hd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8019();
		}
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "(B[BII)V")
	private void method8015(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong247 < (long) arg2 + this.aLong248) {
			this.aRandomAccessFile2.seek(this.aLong247);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg0 != -13) {
			this.method8016(-21);
		}
		this.aRandomAccessFile2.write(arg1, arg3, arg2);
		this.aLong248 += arg2;
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method8016(@OriginalArg(0) int arg0) {
		if (arg0 <= 63) {
			this.aLong247 = 40L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "(III[B)I")
	private int method8017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg0 <= 57) {
			this.aFile2 = null;
		}
		@Pc(13) int local13 = this.aRandomAccessFile2.read(arg3, arg2, arg1);
		if (local13 > 0) {
			this.aLong248 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "loader!hd", name = "c", descriptor = "(I)J")
	private long method8018() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!hd", name = "b", descriptor = "(I)V")
	public void method8019() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "(JI)V")
	private void method8020(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 > -76) {
			this.method8016(62);
		}
		this.aRandomAccessFile2.seek(arg0);
		this.aLong248 = arg0;
	}
}
