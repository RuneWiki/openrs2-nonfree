import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!u")
public final class Class94 {

	@OriginalMember(owner = "loader!u", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!u", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile6;

	@OriginalMember(owner = "loader!u", name = "b", descriptor = "J")
	private final long aLong244;

	@OriginalMember(owner = "loader!u", name = "a", descriptor = "J")
	private final long aLong243;

	@OriginalMember(owner = "loader!u", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class94(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile6 = arg0;
		this.aLong244 = 0L;
		this.aLong243 = arg2;
		@Pc(37) int local37 = this.aRandomAccessFile2.read();
		if (local37 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local37);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!u", name = "a", descriptor = "(Z)V")
	public void method2848() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!u", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile6 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2848();
		}
	}
}
