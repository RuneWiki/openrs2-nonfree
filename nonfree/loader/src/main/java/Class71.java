import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!tc")
public final class Class71 {

	@OriginalMember(owner = "loader!tc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private final RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!tc", name = "d", descriptor = "J")
	private final long aLong86;

	@OriginalMember(owner = "loader!tc", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!tc", name = "c", descriptor = "J")
	private final long aLong87;

	@OriginalMember(owner = "loader!tc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class71(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong86 = 0L;
		this.aFile2 = arg0;
		this.aLong87 = arg2;
	}
}
