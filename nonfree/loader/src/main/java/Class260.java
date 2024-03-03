import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rl")
public final class Class260 {

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!rl", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!rl", name = "b", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "loader!rl", name = "c", descriptor = "J")
	private long aLong236;

	@OriginalMember(owner = "loader!rl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
	public Class260(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong237 = 0L;
		this.aLong236 = arg2;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "(I)Ljava/io/File;", line = 5)
	private File method6554(@OriginalArg(0) int arg0) {
		return arg0 == 428 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "(B)V", line = 17)
	public void method6555() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "(I[BII)V", line = 31)
	private void method6556(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if ((long) arg2 + this.aLong237 > this.aLong236) {
			this.aRandomAccessFile2.seek(this.aLong236);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg1, arg3, arg2);
		this.aLong237 += arg2;
		if (arg0 != 0) {
			this.method6554(-45);
		}
	}

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "(II[BZ)I", line = 50)
	private int method6557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) throws IOException {
		if (!arg3) {
			this.aLong236 = -96L;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg2, arg1, arg0);
		if (local12 > 0) {
			this.aLong237 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "loader!rl", name = "b", descriptor = "(B)J", line = 66)
	private long method6558(@OriginalArg(0) byte arg0) throws IOException {
		if (arg0 != -127) {
			this.method6554(118);
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!rl", name = "finalize", descriptor = "()V", line = 77)
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6555();
		}
	}

	@OriginalMember(owner = "loader!rl", name = "a", descriptor = "(IJ)V", line = 91)
	private void method6559(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong237 = arg1;
		if (arg0 != 27836) {
			this.method6554(-23);
		}
	}
}
