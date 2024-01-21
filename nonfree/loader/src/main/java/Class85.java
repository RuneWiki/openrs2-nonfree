import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ca")
public final class Class85 {

	@OriginalMember(owner = "loader!ca", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ca", name = "c", descriptor = "J")
	private final long aLong101;

	@OriginalMember(owner = "loader!ca", name = "b", descriptor = "J")
	private final long aLong100;

	@OriginalMember(owner = "loader!ca", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile4;

	@OriginalMember(owner = "loader!ca", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class85(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong101 = arg2;
		this.aLong100 = 0L;
		this.aFile4 = arg0;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile4 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2035();
		}
	}

	@OriginalMember(owner = "loader!ca", name = "a", descriptor = "(B)V")
	public void method2035() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
