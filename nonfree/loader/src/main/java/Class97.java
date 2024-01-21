import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!qa")
public final class Class97 {

	@OriginalMember(owner = "loader!qa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!qa", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile6;

	@OriginalMember(owner = "loader!qa", name = "b", descriptor = "J")
	private final long aLong160;

	@OriginalMember(owner = "loader!qa", name = "c", descriptor = "J")
	private final long aLong159;

	@OriginalMember(owner = "loader!qa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class97(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile6 = arg0;
		this.aLong160 = arg2;
		this.aLong159 = 0L;
		@Pc(36) int local36 = this.aRandomAccessFile2.read();
		if (local36 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local36);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile6 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3098();
		}
	}

	@OriginalMember(owner = "loader!qa", name = "a", descriptor = "(I)V")
	public void method3098() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
