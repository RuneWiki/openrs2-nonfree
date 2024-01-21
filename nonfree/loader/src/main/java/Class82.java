import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bc")
public final class Class82 {

	@OriginalMember(owner = "loader!bc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!bc", name = "d", descriptor = "J")
	private final long aLong185;

	@OriginalMember(owner = "loader!bc", name = "c", descriptor = "Ljava/io/File;")
	private final File aFile4;

	@OriginalMember(owner = "loader!bc", name = "a", descriptor = "J")
	private final long aLong186;

	@OriginalMember(owner = "loader!bc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class82(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong185 = arg2;
		this.aFile4 = arg0;
		this.aLong186 = 0L;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!bc", name = "a", descriptor = "(I)V")
	public void method2058() throws IOException {
		this.aRandomAccessFile2.close();
		this.aRandomAccessFile2 = null;
	}
}
