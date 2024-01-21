import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!be")
public final class Class70 {

	@OriginalMember(owner = "loader!be", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private final RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!be", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!be", name = "a", descriptor = "J")
	private final long aLong87;

	@OriginalMember(owner = "loader!be", name = "b", descriptor = "J")
	private final long aLong86;

	@OriginalMember(owner = "loader!be", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class70(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong87 = arg2;
		this.aLong86 = 0L;
	}
}
