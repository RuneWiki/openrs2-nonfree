import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wi")
public final class Class280 {

	@OriginalMember(owner = "loader!wi", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!wi", name = "c", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!wi", name = "b", descriptor = "J")
	private long aLong235;

	@OriginalMember(owner = "loader!wi", name = "d", descriptor = "J")
	private final long aLong236;

	@OriginalMember(owner = "loader!wi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class280(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong235 = 0L;
		this.aLong236 = arg2;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!wi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5869();
		}
	}

	@OriginalMember(owner = "loader!wi", name = "a", descriptor = "(IJ)V")
	private void method5867(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong235 = arg1;
		if (arg0 != 0) {
			this.aFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!wi", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method5868(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aRandomAccessFile2 = null;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!wi", name = "b", descriptor = "(I)V")
	public void method5869() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!wi", name = "a", descriptor = "(I[BII)I")
	private int method5870(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg1, arg0, arg3);
		if (local6 > arg2) {
			this.aLong235 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!wi", name = "a", descriptor = "(I)J")
	private long method5871(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 52) {
			this.aLong235 = -65L;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!wi", name = "a", descriptor = "(III[B)V")
	private void method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong235 + (long) arg2 > this.aLong236) {
			this.aRandomAccessFile2.seek(this.aLong236);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg3, arg0, arg2);
		this.aLong235 += arg2;
		if (arg1 != 0) {
			this.method5868(54);
		}
	}
}
