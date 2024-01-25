import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ih")
public final class Class223 {

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ih", name = "c", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "loader!ih", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!ih", name = "b", descriptor = "J")
	private final long aLong236;

	@OriginalMember(owner = "loader!ih", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class223(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong237 = 0L;
		this.aFile2 = arg0;
		this.aLong236 = arg2;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "(IZI[B)V")
	private void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if ((long) arg2 + this.aLong237 > this.aLong236) {
			this.aRandomAccessFile2.seek(this.aLong236);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg3, arg0, arg2);
		if (!arg1) {
			this.method6078((byte) -41);
		}
		this.aLong237 += arg2;
	}

	@OriginalMember(owner = "loader!ih", name = "b", descriptor = "(I)V")
	public void method6077() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method6078(@OriginalArg(0) byte arg0) {
		if (arg0 > -45) {
			this.method6078((byte) -128);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "(I)J")
	private long method6079() throws IOException {
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!ih", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6077();
		}
	}

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "(IJ)V")
	private void method6080(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong237 = arg1;
		if (arg0 != 10795) {
			this.method6078((byte) 6);
		}
	}

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "([BBII)I")
	private int method6081(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg1 >= -20) {
			this.method6078((byte) 105);
		}
		@Pc(13) int local13 = this.aRandomAccessFile2.read(arg0, arg2, arg3);
		if (local13 > 0) {
			this.aLong237 += local13;
		}
		return local13;
	}
}
