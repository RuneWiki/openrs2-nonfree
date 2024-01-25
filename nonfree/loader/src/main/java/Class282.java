import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!kr")
public final class Class282 {

	@OriginalMember(owner = "loader!kr", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!kr", name = "a", descriptor = "J")
	private final long aLong231;

	@OriginalMember(owner = "loader!kr", name = "c", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!kr", name = "b", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "loader!kr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class282(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong231 = arg2;
		this.aFile2 = arg0;
		this.aLong232 = 0L;
		@Pc(40) int local40 = this.aRandomAccessFile2.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local40);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!kr", name = "a", descriptor = "(ZJ)V")
	private void method6361(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) throws IOException {
		if (!arg0) {
			this.aFile2 = null;
		}
		this.aRandomAccessFile2.seek(arg1);
		this.aLong232 = arg1;
	}

	@OriginalMember(owner = "loader!kr", name = "a", descriptor = "([BIII)I")
	private int method6362(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg3, arg1);
		if (local6 > 0) {
			this.aLong232 += local6;
		}
		return arg2 <= 114 ? -64 : local6;
	}

	@OriginalMember(owner = "loader!kr", name = "b", descriptor = "([BIII)V")
	private void method6363(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg3 != 0) {
			return;
		}
		if (this.aLong232 + (long) arg1 <= this.aLong231) {
			this.aRandomAccessFile2.write(arg0, arg2, arg1);
			this.aLong232 += arg1;
		} else {
			this.aRandomAccessFile2.seek(this.aLong231);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!kr", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method6364(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6364(true);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!kr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6366();
		}
	}

	@OriginalMember(owner = "loader!kr", name = "a", descriptor = "(B)J")
	private long method6365(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == 74 ? this.aRandomAccessFile2.length() : 5L;
	}

	@OriginalMember(owner = "loader!kr", name = "a", descriptor = "(I)V")
	public void method6366() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
