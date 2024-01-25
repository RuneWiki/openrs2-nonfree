import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bt")
public final class Class253 {

	@OriginalMember(owner = "loader!bt", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!bt", name = "b", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "loader!bt", name = "c", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "loader!bt", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!bt", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class253(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong211 = 0L;
		this.aLong210 = arg2;
		this.aFile2 = arg0;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!bt", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method5678(@OriginalArg(0) boolean arg0) {
		return arg0 ? (File) null : this.aFile2;
	}

	@OriginalMember(owner = "loader!bt", name = "a", descriptor = "(BJ)V")
	private void method5679(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) throws IOException {
		if (arg0 != 91) {
			this.method5678(true);
		}
		this.aRandomAccessFile2.seek(arg1);
		this.aLong211 = arg1;
	}

	@OriginalMember(owner = "loader!bt", name = "a", descriptor = "(I)J")
	private long method5680() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!bt", name = "a", descriptor = "([BIII)V")
	private void method5681(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg1 <= 0) {
			this.aLong210 = -127L;
		}
		if (this.aLong210 >= (long) arg2 + this.aLong211) {
			this.aRandomAccessFile2.write(arg0, arg3, arg2);
			this.aLong211 += arg2;
		} else {
			this.aRandomAccessFile2.seek(this.aLong210);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!bt", name = "b", descriptor = "(I)V")
	public void method5682() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!bt", name = "a", descriptor = "(II[BI)I")
	private int method5683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg0 != 0) {
			return -60;
		}
		@Pc(10) int local10 = this.aRandomAccessFile2.read(arg2, arg3, arg1);
		if (local10 > 0) {
			this.aLong211 += local10;
		}
		return local10;
	}

	@OriginalMember(owner = "loader!bt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5682();
		}
	}
}
