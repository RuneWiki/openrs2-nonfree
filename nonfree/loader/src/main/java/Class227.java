import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!le")
public final class Class227 {

	@OriginalMember(owner = "loader!le", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!le", name = "c", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!le", name = "b", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "loader!le", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class227(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong220 = arg2;
		this.aFile2 = arg0;
		this.aLong221 = 0L;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(III[B)V")
	private void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong220 < (long) arg1 + this.aLong221) {
			this.aRandomAccessFile2.seek(this.aLong220);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg0 != -1) {
			this.aLong221 = 100L;
		}
		this.aRandomAccessFile2.write(arg3, arg2, arg1);
		this.aLong221 += arg1;
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(B)V")
	public void method5895() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!le", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5895();
		}
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(JI)V")
	private void method5896(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg0);
		if (arg1 != -1) {
			this.aRandomAccessFile2 = null;
		}
		this.aLong221 = arg0;
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "([BBII)I")
	private int method5897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg0, arg2, arg3);
		if (arg1 != -51) {
			this.aLong220 = 17L;
		}
		if (local6 > 0) {
			this.aLong221 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(I)J")
	private long method5898(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != 0) {
			this.aFile2 = null;
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method5899(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aFile2 = null;
		}
		return this.aFile2;
	}
}
