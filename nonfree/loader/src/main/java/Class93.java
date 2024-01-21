import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!qd")
public final class Class93 {

	@OriginalMember(owner = "loader!qd", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!qd", name = "a", descriptor = "J")
	private final long aLong140;

	@OriginalMember(owner = "loader!qd", name = "b", descriptor = "J")
	private final long aLong141;

	@OriginalMember(owner = "loader!qd", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile6;

	@OriginalMember(owner = "loader!qd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class93(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong140 = arg2;
		this.aLong141 = 0L;
		this.aFile6 = arg0;
		@Pc(35) int local35 = this.aRandomAccessFile2.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local35);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!qd", name = "a", descriptor = "(Z)V")
	public void method2741() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile6 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2741();
		}
	}
}
