import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!cs")
public final class Class223 {

	@OriginalMember(owner = "loader!cs", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!cs", name = "b", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "loader!cs", name = "d", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "loader!cs", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!cs", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class223(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong215 = arg2;
		this.aLong214 = 0L;
		this.aFile2 = arg0;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!cs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5758();
		}
	}

	@OriginalMember(owner = "loader!cs", name = "a", descriptor = "(I)J")
	private long method5754(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != 0) {
			this.method5755(65);
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!cs", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5755(@OriginalArg(0) int arg0) {
		if (arg0 != 18791) {
			this.method5755(-108);
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!cs", name = "a", descriptor = "(III[B)V")
	private void method5756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong215 < (long) arg0 + this.aLong214) {
			this.aRandomAccessFile2.seek(this.aLong215);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg1 != 1) {
			this.method5755(86);
		}
		this.aRandomAccessFile2.write(arg3, arg2, arg0);
		this.aLong214 += arg0;
	}

	@OriginalMember(owner = "loader!cs", name = "a", descriptor = "(BJ)V")
	private void method5757(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		this.aLong214 = arg1;
		if (arg0 > -48) {
			this.aLong215 = 107L;
		}
	}

	@OriginalMember(owner = "loader!cs", name = "a", descriptor = "(B)V")
	public void method5758() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!cs", name = "a", descriptor = "(IIB[B)I")
	private int method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg2, arg0, arg1);
		if (local6 > 0) {
			this.aLong214 += local6;
		}
		return local6;
	}
}
