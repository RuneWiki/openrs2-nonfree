import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rq")
public final class Class277 {

	@OriginalMember(owner = "loader!rq", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!rq", name = "b", descriptor = "J")
	private final long aLong232;

	@OriginalMember(owner = "loader!rq", name = "a", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "loader!rq", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!rq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class277(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong232 = arg2;
		this.aLong231 = 0L;
		this.aFile2 = arg0;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!rq", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method6137(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!rq", name = "a", descriptor = "(III[B)V")
	private void method6138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg2 != 1) {
			this.method6137(true);
		}
		if (this.aLong232 >= (long) arg0 + this.aLong231) {
			this.aRandomAccessFile2.write(arg3, arg1, arg0);
			this.aLong231 += arg0;
		} else {
			this.aRandomAccessFile2.seek(this.aLong232);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!rq", name = "b", descriptor = "(I)V")
	public void method6139(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!rq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6139(0);
		}
	}

	@OriginalMember(owner = "loader!rq", name = "a", descriptor = "(II[BI)I")
	private int method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong231 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!rq", name = "a", descriptor = "(I)J")
	private long method6141() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!rq", name = "a", descriptor = "(JI)V")
	private void method6142(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 != 0) {
			this.method6137(false);
		}
		this.aRandomAccessFile2.seek(arg0);
		this.aLong231 = arg0;
	}
}
