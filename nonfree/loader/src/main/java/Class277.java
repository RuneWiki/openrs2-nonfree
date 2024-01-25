import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!me")
public final class Class277 {

	@OriginalMember(owner = "loader!me", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!me", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!me", name = "a", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "loader!me", name = "b", descriptor = "J")
	private final long aLong230;

	@OriginalMember(owner = "loader!me", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
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
		this.aLong230 = arg2;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!me", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method5947(@OriginalArg(0) byte arg0) {
		return arg0 < 28 ? (File) null : this.aFile2;
	}

	@OriginalMember(owner = "loader!me", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5948();
		}
	}

	@OriginalMember(owner = "loader!me", name = "b", descriptor = "(B)V")
	public void method5948() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!me", name = "a", descriptor = "(IIB[B)I")
	private int method5949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (arg2 != 25) {
			this.aLong231 = 109L;
		}
		@Pc(12) int local12 = this.aRandomAccessFile2.read(arg3, arg0, arg1);
		if (local12 > 0) {
			this.aLong231 += local12;
		}
		return local12;
	}

	@OriginalMember(owner = "loader!me", name = "a", descriptor = "(ZI[BI)V")
	private void method5950(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) throws IOException {
		if (this.aLong230 < this.aLong231 + (long) arg1) {
			this.aRandomAccessFile2.seek(this.aLong230);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile2.write(arg2, arg3, arg1);
			if (!arg0) {
				this.aLong231 += arg1;
			}
		}
	}

	@OriginalMember(owner = "loader!me", name = "a", descriptor = "(JI)V")
	private void method5951(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 == 0) {
			this.aRandomAccessFile2.seek(arg0);
			this.aLong231 = arg0;
		}
	}

	@OriginalMember(owner = "loader!me", name = "a", descriptor = "(I)J")
	private long method5952(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 != 0) {
			this.method5947((byte) 95);
		}
		return this.aRandomAccessFile2.length();
	}
}
