import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vl")
public final class Class259 {

	@OriginalMember(owner = "loader!vl", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!vl", name = "d", descriptor = "J")
	private final long aLong211;

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!vl", name = "b", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "loader!vl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class259(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong211 = arg2;
		this.aFile2 = arg0;
		this.aLong210 = 0L;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!vl", name = "b", descriptor = "(B)J")
	private long method5651() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!vl", name = "c", descriptor = "(B)V")
	public void method5652() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method5653(@OriginalArg(0) byte arg0) {
		if (arg0 != 16) {
			this.aRandomAccessFile2 = null;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!vl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5652();
		}
	}

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "(B[BII)V")
	private void method5654(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong211 < (long) arg2 + this.aLong210) {
			this.aRandomAccessFile2.seek(this.aLong211);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg1, arg3, arg2);
		this.aLong210 += arg2;
		if (arg0 <= 29) {
			this.method5653((byte) -88);
		}
	}

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "(ZJ)V")
	private void method5655(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong210 = arg1;
		if (!arg0) {
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "(I[BII)I")
	private int method5656(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg0 >= -114) {
			this.aLong210 = -72L;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg1, arg3, arg2);
		if (local12 > 0) {
			this.aLong210 += local12;
		}
		return local12;
	}
}
