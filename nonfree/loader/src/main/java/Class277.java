import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!sr")
public final class Class277 {

	@OriginalMember(owner = "loader!sr", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!sr", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!sr", name = "a", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "loader!sr", name = "d", descriptor = "J")
	private final long aLong232;

	@OriginalMember(owner = "loader!sr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class277(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong231 = 0L;
		this.aLong232 = arg2;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!sr", name = "a", descriptor = "([BIII)I")
	private int method6158(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg1, arg3);
		if (arg2 != 15596) {
			this.aLong231 = -94L;
		}
		if (local6 > 0) {
			this.aLong231 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!sr", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method6159(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aRandomAccessFile2 = null;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!sr", name = "a", descriptor = "(B)V")
	public void method6160() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!sr", name = "a", descriptor = "(JZ)V")
	private void method6161(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		this.aLong231 = arg0;
		if (arg1) {
			this.method6159(false);
		}
	}

	@OriginalMember(owner = "loader!sr", name = "a", descriptor = "(BI[BI)V")
	private void method6162(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong232 < (long) arg3 + this.aLong231) {
			this.aRandomAccessFile2.seek(this.aLong232);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		this.aRandomAccessFile2.write(arg2, arg1, arg3);
		if (arg0 != -60) {
			this.aLong231 = -56L;
		}
		this.aLong231 += arg3;
	}

	@OriginalMember(owner = "loader!sr", name = "a", descriptor = "(I)J")
	private long method6163(@OriginalArg(0) int arg0) throws IOException {
		return arg0 < 101 ? 19L : this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!sr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method6160();
		}
	}
}
