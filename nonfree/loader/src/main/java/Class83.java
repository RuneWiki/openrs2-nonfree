import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ic")
public final class Class83 {

	@OriginalMember(owner = "loader!ic", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ic", name = "c", descriptor = "J")
	private final long aLong99;

	@OriginalMember(owner = "loader!ic", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile4;

	@OriginalMember(owner = "loader!ic", name = "d", descriptor = "J")
	private final long aLong100;

	@OriginalMember(owner = "loader!ic", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class83(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong99 = arg2;
		this.aFile4 = arg0;
		this.aLong100 = 0L;
		@Pc(43) int local43 = this.aRandomAccessFile2.read();
		if (local43 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local43);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ic", name = "a", descriptor = "(I)V")
	public void method2224() throws IOException {
		this.aRandomAccessFile2.close();
		this.aRandomAccessFile2 = null;
	}
}
