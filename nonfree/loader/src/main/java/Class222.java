import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hd")
public final class Class222 {

	@OriginalMember(owner = "loader!hd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!hd", name = "c", descriptor = "J")
	private long aLong225;

	@OriginalMember(owner = "loader!hd", name = "d", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!hd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class222(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong225 = arg2;
		this.aLong224 = 0L;
		this.aFile2 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "(I)V")
	public void method5723() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!hd", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5724(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!hd", name = "c", descriptor = "(I)J")
	private long method5725(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != 0) {
			this.aLong224 = 113L;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "([BIII)V")
	private void method5726(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg1 != -7120) {
			return;
		}
		if (this.aLong225 < (long) arg3 + this.aLong224) {
			this.aRandomAccessFile2.seek(this.aLong225);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg0, arg2, arg3);
			this.aLong224 += arg3;
		}
	}

	@OriginalMember(owner = "loader!hd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5723();
		}
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "(IJ)V")
	private void method5727(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong224 = arg1;
		if (arg0 != -15472) {
			this.aLong225 = -103L;
		}
	}

	@OriginalMember(owner = "loader!hd", name = "a", descriptor = "(Z[BII)I")
	private int method5728(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg1, arg2, arg3);
		if (local6 > 0) {
			this.aLong224 += local6;
		}
		return arg0 ? local6 : -98;
	}
}
