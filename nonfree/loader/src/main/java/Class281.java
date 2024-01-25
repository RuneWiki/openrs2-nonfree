import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!sf")
public final class Class281 {

	@OriginalMember(owner = "loader!sf", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!sf", name = "b", descriptor = "J")
	private final long aLong254;

	@OriginalMember(owner = "loader!sf", name = "a", descriptor = "J")
	private long aLong255;

	@OriginalMember(owner = "loader!sf", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!sf", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class281(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong254 = arg2;
		this.aLong255 = 0L;
		this.aFile2 = arg0;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!sf", name = "a", descriptor = "(JZ)V")
	private void method6397(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) throws IOException {
		if (!arg1) {
			this.aFile2 = null;
		}
		this.aRandomAccessFile2.seek(arg0);
		this.aLong255 = arg0;
	}

	@OriginalMember(owner = "loader!sf", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method6398(@OriginalArg(0) byte arg0) {
		if (arg0 <= 42) {
			this.aLong255 = -75L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!sf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6400();
		}
	}

	@OriginalMember(owner = "loader!sf", name = "a", descriptor = "(IIZ[B)I")
	private int method6399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg3, arg1, arg0);
		if (local6 > 0) {
			this.aLong255 += local6;
		}
		return arg2 ? local6 : -24;
	}

	@OriginalMember(owner = "loader!sf", name = "c", descriptor = "(B)V")
	public void method6400() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!sf", name = "b", descriptor = "(B)J")
	private long method6401(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 == 31 ? this.aRandomAccessFile2.length() : -48L;
	}

	@OriginalMember(owner = "loader!sf", name = "a", descriptor = "(II[BI)V")
	private void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong254 < (long) arg0 + this.aLong255) {
			this.aRandomAccessFile2.seek(this.aLong254);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg3 <= 122) {
			this.method6398((byte) 4);
		}
		this.aRandomAccessFile2.write(arg2, arg1, arg0);
		this.aLong255 += arg0;
	}
}
