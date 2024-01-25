import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rv")
public final class Class277 {

	@OriginalMember(owner = "loader!rv", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!rv", name = "d", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "loader!rv", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!rv", name = "a", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "loader!rv", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class277(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong231 = arg2;
		this.aFile2 = arg0;
		this.aLong230 = 0L;
		@Pc(40) int local40 = this.aRandomAccessFile2.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local40);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!rv", name = "a", descriptor = "(B)J")
	private long method5706(@OriginalArg(0) byte arg0) throws IOException {
		if (arg0 >= -57) {
			this.method5709(false);
		}
		return this.aRandomAccessFile2.length();
	}

	@OriginalMember(owner = "loader!rv", name = "a", descriptor = "(I)V")
	public void method5707() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!rv", name = "a", descriptor = "(III[B)V")
	private void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		if (this.aLong230 + (long) arg0 > this.aLong231) {
			this.aRandomAccessFile2.seek(this.aLong231);
			this.aRandomAccessFile2.write(1);
			throw new EOFException();
		}
		if (arg2 >= -91) {
			this.aLong230 = -92L;
		}
		this.aRandomAccessFile2.write(arg3, arg1, arg0);
		this.aLong230 += arg0;
	}

	@OriginalMember(owner = "loader!rv", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method5709(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aLong231 = -93L;
		}
		return this.aFile2;
	}

	@OriginalMember(owner = "loader!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method5707();
		}
	}

	@OriginalMember(owner = "loader!rv", name = "a", descriptor = "(IJ)V")
	private void method5710(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) throws IOException {
		this.aRandomAccessFile2.seek(arg1);
		if (arg0 == -1) {
			this.aLong230 = arg1;
		}
	}

	@OriginalMember(owner = "loader!rv", name = "a", descriptor = "(IBI[B)I")
	private int method5711(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile2.read(arg3, arg0, arg2);
		if (arg1 >= -82) {
			return -122;
		} else {
			if (local6 > 0) {
				this.aLong230 += local6;
			}
			return local6;
		}
	}
}
