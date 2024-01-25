import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ve")
public final class Class277 {

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ve", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!ve", name = "d", descriptor = "J")
	private final long aLong239;

	@OriginalMember(owner = "loader!ve", name = "c", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "loader!ve", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class277(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong239 = arg2;
		this.aLong240 = 0L;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ve", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6071();
		}
	}

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "(II[BZ)I")
	private int method6066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong240 += local6;
		}
		if (arg3) {
			this.method6069(84);
		}
		return local6;
	}

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "(ZJ)V")
	private void method6067(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		if (arg0) {
			this.aFile2 = null;
		}
		this.aLong240 = arg1;
	}

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "([BIII)V")
	private void method6068(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong239 < this.aLong240 + (long) arg3) {
			this.aRandomAccessFile2.seek(this.aLong239);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else if (arg1 >= 124) {
			this.aRandomAccessFile2.write(arg0, arg2, arg3);
			this.aLong240 += arg3;
		}
	}

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6069(@OriginalArg(0) int arg0) {
		return arg0 == -21141 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "(Z)J")
	private long method6070(@OriginalArg(0) boolean arg0) throws IOException {
		if (arg0) {
			this.aFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "(B)V")
	public void method6071() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
