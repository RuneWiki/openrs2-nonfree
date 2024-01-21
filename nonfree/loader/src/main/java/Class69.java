import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!sa")
public final class Class69 {

	@OriginalMember(owner = "loader!sa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private final RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!sa", name = "a", descriptor = "J")
	private final long aLong83;

	@OriginalMember(owner = "loader!sa", name = "d", descriptor = "J")
	private final long aLong84;

	@OriginalMember(owner = "loader!sa", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!sa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class69(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong83 = arg2;
		this.aLong84 = 0L;
		this.aFile2 = arg0;
	}
}
