import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fca")
public final class Class327 {

	@OriginalMember(owner = "loader!fca", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!fca", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!fca", name = "c", descriptor = "J")
	private final long aLong259;

	@OriginalMember(owner = "loader!fca", name = "a", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "loader!fca", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class327(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong259 = arg2;
		this.aLong258 = 0L;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!fca", name = "a", descriptor = "(JB)V")
	private void method7503(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1 != 17) {
			this.aFile2 = null;
		}
		this.aLong258 = arg0;
	}

	@OriginalMember(owner = "loader!fca", name = "a", descriptor = "([BIII)V")
	private void method7504(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong259 < this.aLong258 + (long) arg3) {
			this.aRandomAccessFile2.seek(this.aLong259);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else if (arg2 >= 113) {
			this.aRandomAccessFile2.write(arg0, arg1, arg3);
			this.aLong258 += arg3;
		}
	}

	@OriginalMember(owner = "loader!fca", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method7505(@OriginalArg(0) int arg0) {
		return arg0 == -7763 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!fca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method7508();
		}
	}

	@OriginalMember(owner = "loader!fca", name = "c", descriptor = "(I)J")
	private long method7506(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != 0) {
			this.method7505(36);
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!fca", name = "b", descriptor = "([BIII)I")
	private int method7507(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg3, arg1);
		if (local6 > 0) {
			this.aLong258 += local6;
		}
		if (arg2 >= -48) {
			this.aRandomAccessFile2 = null;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!fca", name = "b", descriptor = "(I)V")
	public void method7508() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
