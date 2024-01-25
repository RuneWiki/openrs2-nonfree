import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hh")
public final class Class279 {

	@OriginalMember(owner = "loader!hh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!hh", name = "d", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "loader!hh", name = "b", descriptor = "J")
	private long aLong235;

	@OriginalMember(owner = "loader!hh", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!hh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class279(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong234 = 0L;
		this.aLong235 = arg2;
		this.aFile2 = arg0;
		@Pc(40) int local40 = this.aRandomAccessFile2.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local40);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!hh", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6023(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method6023(-32);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!hh", name = "a", descriptor = "(III[B)V")
	private void method6024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg2 != 23609) {
			return;
		}
		if (this.aLong234 + (long) arg1 > this.aLong235) {
			this.aRandomAccessFile2.seek(this.aLong235);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg3, arg0, arg1);
			this.aLong234 += arg1;
		}
	}

	@OriginalMember(owner = "loader!hh", name = "b", descriptor = "(I)V")
	public void method6025(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!hh", name = "a", descriptor = "(B)J")
	private long method6026(@OriginalArg(0) byte arg0) throws IOException {
		if (arg0 != 86) {
			this.aRandomAccessFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!hh", name = "a", descriptor = "(IJ)V")
	private void method6027(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong234 = arg1;
		if (arg0 != -21004) {
			this.aLong235 = 26L;
		}
	}

	@OriginalMember(owner = "loader!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6025(-29827);
		}
	}

	@OriginalMember(owner = "loader!hh", name = "b", descriptor = "(III[B)I")
	private int method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg0 != 0) {
			this.aRandomAccessFile2 = null;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg3, arg2, arg1);
		if (local12 > 0) {
			this.aLong234 += local12;
		}
		return local12;
	}
}
