import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bb")
public final class Class81 {

	@OriginalMember(owner = "loader!bb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!bb", name = "a", descriptor = "J")
	private final long aLong98;

	@OriginalMember(owner = "loader!bb", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile6;

	@OriginalMember(owner = "loader!bb", name = "b", descriptor = "J")
	private final long aLong99;

	@OriginalMember(owner = "loader!bb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class81(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong98 = arg2;
		this.aFile6 = arg0;
		this.aLong99 = 0L;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!bb", name = "b", descriptor = "(I)V")
	public void method2205() throws IOException {
		this.aRandomAccessFile2.close();
		this.aRandomAccessFile2 = null;
	}
}
