import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!um")
public final class Class227 {

	@OriginalMember(owner = "loader!um", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!um", name = "a", descriptor = "J")
	private final long aLong225;

	@OriginalMember(owner = "loader!um", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!um", name = "d", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "loader!um", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class227(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong225 = arg2;
		this.aFile2 = arg0;
		this.aLong226 = 0L;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!um", name = "a", descriptor = "(JB)V")
	private void method5866(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) throws IOException {
		if (arg1 < -127) {
			this.aRandomAccessFile2.seek(arg0);
			this.aLong226 = arg0;
		}
	}

	@OriginalMember(owner = "loader!um", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method5867(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			this.aLong226 = -41L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!um", name = "b", descriptor = "(I)J")
	private long method5868(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != -1) {
			this.aLong226 = -52L;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!um", name = "a", descriptor = "(I)V")
	public void method5869() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!um", name = "a", descriptor = "(II[BI)I")
	private int method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg2, arg3, arg0);
		if (local6 > 0) {
			this.aLong226 += local6;
		}
		if (arg1 < 85) {
			this.method5867((byte) 53);
		}
		return local6;
	}

	@OriginalMember(owner = "loader!um", name = "b", descriptor = "(II[BI)V")
	private void method5871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong225 < (long) arg0 + this.aLong226) {
			this.aRandomAccessFile2.seek(this.aLong225);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg2, arg1, arg0);
			if (arg3 == 1) {
				this.aLong226 += arg0;
			}
		}
	}

	@OriginalMember(owner = "loader!um", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5869();
		}
	}
}
