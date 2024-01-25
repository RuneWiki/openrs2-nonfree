import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hl")
public final class Class277 {

	@OriginalMember(owner = "loader!hl", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!hl", name = "d", descriptor = "J")
	private long aLong267;

	@OriginalMember(owner = "loader!hl", name = "a", descriptor = "J")
	private final long aLong266;

	@OriginalMember(owner = "loader!hl", name = "b", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!hl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class277(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong267 = 0L;
		this.aLong266 = arg2;
		this.aFile2 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!hl", name = "a", descriptor = "(Z)J")
	private long method6128(@OriginalArg(0) boolean arg0) throws IOException {
		if (arg0) {
			this.aFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!hl", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method6129(@OriginalArg(0) byte arg0) {
		if (arg0 != 13) {
			this.method6129((byte) -1);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!hl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6131();
		}
	}

	@OriginalMember(owner = "loader!hl", name = "a", descriptor = "(I[BII)I")
	private int method6130(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg2 != -1) {
			this.aLong267 = 70L;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg1, arg0, arg3);
		if (local12 > 0) {
			this.aLong267 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "loader!hl", name = "a", descriptor = "(I)V")
	public void method6131() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!hl", name = "a", descriptor = "([BIII)V")
	private void method6132(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong266 < (long) arg2 + this.aLong267) {
			this.aRandomAccessFile2.seek(this.aLong266);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg0, arg1, arg2);
			if (arg3 == 0) {
				this.aLong267 += arg2;
			}
		}
	}

	@OriginalMember(owner = "loader!hl", name = "a", descriptor = "(JB)V")
	private void method6133(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong267 = arg0;
	}
}
