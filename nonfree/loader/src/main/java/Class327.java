import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!in")
public final class Class327 {

	@OriginalMember(owner = "loader!in", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!in", name = "c", descriptor = "J")
	private final long aLong248;

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "loader!in", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!in", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class327(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong248 = arg2;
		this.aLong247 = 0L;
		this.aFile2 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(JZ)V")
	private void method7847(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1) {
			this.aFile2 = null;
		}
		this.aLong247 = arg0;
	}

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(I)V")
	public void method7848() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!in", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7848();
		}
	}

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(BII[B)V")
	private void method7849(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong248 < this.aLong247 + (long) arg2) {
			this.aRandomAccessFile2.seek(this.aLong248);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg3, arg1, arg2);
		this.aLong247 += arg2;
		if (arg0 != 37) {
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method7850() {
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!in", name = "b", descriptor = "(B)J")
	private long method7851(@OriginalArg(0) byte arg0) throws IOException {
		return arg0 < 67 ? -54L : this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!in", name = "a", descriptor = "(I[BBI)I")
	private int method7852(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile2.read(arg1, arg2, arg0);
		if (local14 > 0) {
			this.aLong247 += local14;
		}
		return local14;
	}
}
