import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ub")
public final class Class80 {

	@OriginalMember(owner = "loader!ub", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ub", name = "c", descriptor = "J")
	private final long aLong150;

	@OriginalMember(owner = "loader!ub", name = "d", descriptor = "J")
	private final long aLong149;

	@OriginalMember(owner = "loader!ub", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile4;

	@OriginalMember(owner = "loader!ub", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class80(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong150 = 0L;
		this.aLong149 = arg2;
		this.aFile4 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ub", name = "a", descriptor = "(B)V")
	public void method2194() throws IOException {
		this.aRandomAccessFile2.close();
		this.aRandomAccessFile2 = null;
	}
}
