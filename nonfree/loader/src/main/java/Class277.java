import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rp")
public final class Class277 {

	@OriginalMember(owner = "loader!rp", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!rp", name = "d", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "loader!rp", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!rp", name = "c", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "loader!rp", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class277(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong229 = arg2;
		this.aFile2 = arg0;
		this.aLong228 = 0L;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!rp", name = "a", descriptor = "(II[BB)I")
	private int method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte arg3) throws IOException {
		if (arg3 > -88) {
			this.aLong228 = -96L;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg2, arg0, arg1);
		if (local12 > 0) {
			this.aLong228 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "loader!rp", name = "a", descriptor = "(I)V")
	public void method5747() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!rp", name = "a", descriptor = "(JI)V")
	private void method5748(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 != 0) {
			this.aLong229 = -60L;
		}
		this.aRandomAccessFile2.seek(arg0);
		this.aLong228 = arg0;
	}

	@OriginalMember(owner = "loader!rp", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5749(@OriginalArg(0) int arg0) {
		if (arg0 >= -9) {
			this.aLong229 = -10L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!rp", name = "a", descriptor = "(II[BI)V")
	private void method5750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong228 + (long) arg1 > this.aLong229) {
			this.aRandomAccessFile2.seek(this.aLong229);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else if (arg3 == 1) {
			this.aRandomAccessFile2.write(arg2, arg0, arg1);
			this.aLong228 += arg1;
		}
	}

	@OriginalMember(owner = "loader!rp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5747();
		}
	}

	@OriginalMember(owner = "loader!rp", name = "c", descriptor = "(I)J")
	private long method5751(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != 74) {
			this.method5749(27);
		}
		return this.aRandomAccessFile2.length();
	}
}
