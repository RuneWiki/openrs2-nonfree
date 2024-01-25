import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!jo")
public final class Class276 {

	@OriginalMember(owner = "loader!jo", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!jo", name = "b", descriptor = "J")
	private final long aLong231;

	@OriginalMember(owner = "loader!jo", name = "c", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "loader!jo", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class276(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong231 = arg2;
		this.aLong230 = 0L;
		@Pc(40) int local40 = this.aRandomAccessFile2.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local40);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "(IIB[B)V")
	private void method6119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg2 != 26) {
			return;
		}
		if (this.aLong230 + (long) arg1 <= this.aLong231) {
			this.aRandomAccessFile2.write(arg3, arg0, arg1);
			this.aLong230 += arg1;
		} else {
			this.aRandomAccessFile2.seek(this.aLong231);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "loader!jo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6121();
		}
	}

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method6120(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method6120(94);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "(B)V")
	public void method6121() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "(JI)V")
	private void method6122(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 > 114) {
			this.aRandomAccessFile2.seek(arg0);
			this.aLong230 = arg0;
		}
	}

	@OriginalMember(owner = "loader!jo", name = "b", descriptor = "(I)J")
	private long method6123(@OriginalArg(0) int arg0) throws IOException {
		return arg0 == 1 ? this.aRandomAccessFile2.length() : -127L;
	}

	@OriginalMember(owner = "loader!jo", name = "a", descriptor = "(Z[BII)I")
	private int method6124(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg1, arg3, arg2);
		if (local6 > 0) {
			this.aLong230 += local6;
		}
		return arg0 ? -89 : local6;
	}
}
