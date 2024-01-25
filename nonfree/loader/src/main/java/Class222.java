import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ib")
public final class Class222 {

	@OriginalMember(owner = "loader!ib", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ib", name = "c", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "loader!ib", name = "d", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!ib", name = "a", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "loader!ib", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class222(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong218 = arg2;
		this.aFile2 = arg0;
		this.aLong217 = 0L;
		@Pc(43) int local43 = this.aRandomAccessFile2.read();
		if (local43 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local43);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ib", name = "a", descriptor = "(I)J")
	private long method5713(@OriginalArg(0) int arg0) throws IOException {
		return arg0 == 0 ? this.aRandomAccessFile2.length() : 8L;
	}

	@OriginalMember(owner = "loader!ib", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method5714(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aFile2 = null;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!ib", name = "a", descriptor = "(III[B)I")
	private int method5715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg1 != 11150) {
			this.method5714(true);
		}
		@Pc(13) int local13 = this.aRandomAccessFile2.read(arg3, arg0, arg2);
		if (local13 > 0) {
			this.aLong217 += local13;
		}
		return local13;
	}

	@OriginalMember(owner = "loader!ib", name = "a", descriptor = "(JZ)V")
	private void method5716(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (!arg1) {
			this.aLong218 = -118L;
		}
		this.aLong217 = arg0;
	}

	@OriginalMember(owner = "loader!ib", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5717();
		}
	}

	@OriginalMember(owner = "loader!ib", name = "a", descriptor = "(B)V")
	public void method5717() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!ib", name = "a", descriptor = "(IZI[B)V")
	private void method5718(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if ((long) arg0 + this.aLong217 > this.aLong218) {
			this.aRandomAccessFile2.seek(this.aLong218);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg3, arg2, arg0);
		this.aLong217 += arg0;
		if (arg1) {
			this.aFile2 = null;
		}
	}
}
