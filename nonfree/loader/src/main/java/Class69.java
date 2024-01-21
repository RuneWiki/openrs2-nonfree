import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!nb")
public final class Class69 {

	@OriginalMember(owner = "loader!nb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private final RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!nb", name = "a", descriptor = "J")
	private final long aLong84;

	@OriginalMember(owner = "loader!nb", name = "b", descriptor = "J")
	private final long aLong83;

	@OriginalMember(owner = "loader!nb", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!nb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class69(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong84 = 0L;
		this.aLong83 = arg2;
		this.aFile2 = arg0;
	}
}
