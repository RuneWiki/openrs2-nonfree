import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!da")
public final class Class73 {

	@OriginalMember(owner = "loader!da", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private final RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!da", name = "c", descriptor = "J")
	private final long aLong91;

	@OriginalMember(owner = "loader!da", name = "d", descriptor = "J")
	private final long aLong92;

	@OriginalMember(owner = "loader!da", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile2;

	@OriginalMember(owner = "loader!da", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class73(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong91 = 0L;
		this.aLong92 = arg2;
		this.aFile2 = arg0;
	}
}
