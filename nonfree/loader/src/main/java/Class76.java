import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ne")
public final class Class76 {

	@OriginalMember(owner = "loader!ne", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile6;

	@OriginalMember(owner = "loader!ne", name = "c", descriptor = "J")
	private final long aLong90;

	@OriginalMember(owner = "loader!ne", name = "b", descriptor = "J")
	private final long aLong89;

	@OriginalMember(owner = "loader!ne", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class76(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile6 = arg0;
		this.aLong90 = 0L;
		this.aLong89 = arg2;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(I)V")
	public void method2144() throws IOException {
		this.aRandomAccessFile2.close();
		this.aRandomAccessFile2 = null;
	}
}
