import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ab")
public final class Class83 {

	@OriginalMember(owner = "loader!ab", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ab", name = "a", descriptor = "J")
	private final long aLong163;

	@OriginalMember(owner = "loader!ab", name = "c", descriptor = "J")
	private final long aLong164;

	@OriginalMember(owner = "loader!ab", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile4;

	@OriginalMember(owner = "loader!ab", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class83(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong163 = arg2;
		this.aLong164 = 0L;
		this.aFile4 = arg0;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ab", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile4 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2112();
		}
	}

	@OriginalMember(owner = "loader!ab", name = "a", descriptor = "(B)V")
	public void method2112() throws IOException {
		this.aRandomAccessFile2.close();
		this.aRandomAccessFile2 = null;
	}
}
