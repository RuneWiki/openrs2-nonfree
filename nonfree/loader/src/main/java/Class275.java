import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hi")
public final class Class275 {

	@OriginalMember(owner = "loader!hi", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!hi", name = "b", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "loader!hi", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!hi", name = "a", descriptor = "J")
	private final long aLong242;

	@OriginalMember(owner = "loader!hi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class275(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong241 = 0L;
		this.aFile2 = arg0;
		this.aLong242 = arg2;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!hi", name = "a", descriptor = "(JI)V")
	private void method6057(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1 == 0) {
			this.aLong241 = arg0;
		}
	}

	@OriginalMember(owner = "loader!hi", name = "a", descriptor = "(I)V")
	public void method6058() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!hi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6058();
		}
	}

	@OriginalMember(owner = "loader!hi", name = "a", descriptor = "([BIII)V")
	private void method6059(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg1 != 24238) {
			this.aLong241 = -103L;
		}
		if ((long) arg2 + this.aLong241 > this.aLong242) {
			this.aRandomAccessFile2.seek(this.aLong242);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg0, arg3, arg2);
			this.aLong241 += arg2;
		}
	}

	@OriginalMember(owner = "loader!hi", name = "a", descriptor = "([BIBI)I")
	private int method6060(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg1, arg3);
		if (arg2 < 97) {
			this.method6062();
		}
		if (local6 > 0) {
			this.aLong241 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!hi", name = "a", descriptor = "(Z)J")
	private long method6061(@OriginalArg(0) boolean arg0) throws IOException {
		return arg0 ? 59L : this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!hi", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method6062() {
		return this.aFile2;
	}
}
