import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!oa")
public final class Class87 {

	@OriginalMember(owner = "loader!oa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!oa", name = "d", descriptor = "J")
	private final long aLong102;

	@OriginalMember(owner = "loader!oa", name = "c", descriptor = "J")
	private final long aLong101;

	@OriginalMember(owner = "loader!oa", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile6;

	@OriginalMember(owner = "loader!oa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class87(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong102 = 0L;
		this.aLong101 = arg2;
		this.aFile6 = arg0;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile6 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2139();
		}
	}

	@OriginalMember(owner = "loader!oa", name = "a", descriptor = "(I)V")
	public void method2139() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
