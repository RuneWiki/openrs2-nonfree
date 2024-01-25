import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vr")
public final class Class328 {

	@OriginalMember(owner = "loader!vr", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!vr", name = "b", descriptor = "J")
	private final long aLong252;

	@OriginalMember(owner = "loader!vr", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!vr", name = "d", descriptor = "J")
	private long aLong253;

	@OriginalMember(owner = "loader!vr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class328(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong252 = arg2;
		this.aFile2 = arg0;
		this.aLong253 = 0L;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!vr", name = "a", descriptor = "(JI)V")
	private void method8083(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1 == -27095) {
			this.aLong253 = arg0;
		}
	}

	@OriginalMember(owner = "loader!vr", name = "a", descriptor = "(IB[BI)V")
	private void method8084(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong252 < (long) arg0 + this.aLong253) {
			this.aRandomAccessFile2.seek(this.aLong252);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg1 > -107) {
			this.method8087(-45);
		}
		this.aRandomAccessFile2.write(arg2, arg3, arg0);
		this.aLong253 += arg0;
	}

	@OriginalMember(owner = "loader!vr", name = "a", descriptor = "(I)J")
	private long method8085(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != -2826) {
			this.method8087(-38);
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!vr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method8086(17981);
		}
	}

	@OriginalMember(owner = "loader!vr", name = "c", descriptor = "(I)V")
	public void method8086(@OriginalArg(0) int arg0) throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!vr", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method8087(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.aFile2 : (File) null;
	}

	@OriginalMember(owner = "loader!vr", name = "a", descriptor = "([BIII)I")
	private int method8088(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) int local14 = this.aRandomAccessFile2.read(arg0, arg2, arg1);
		if (local14 > 0) {
			this.aLong253 += local14;
		}
		return local14;
	}
}
