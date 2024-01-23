import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!kg")
public final class Class110 {

	@OriginalMember(owner = "loader!kg", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!kg", name = "c", descriptor = "J")
	private long aLong152;

	@OriginalMember(owner = "loader!kg", name = "a", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "loader!kg", name = "b", descriptor = "Ljava/io/File;")
	private File aFile4;

	@OriginalMember(owner = "loader!kg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class110(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong152 = arg2;
		this.aLong151 = 0L;
		this.aFile4 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!kg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile4 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3543();
		}
	}

	@OriginalMember(owner = "loader!kg", name = "a", descriptor = "(Z)V")
	public void method3543() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
