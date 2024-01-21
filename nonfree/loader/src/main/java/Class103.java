import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!t")
public final class Class103 {

	@OriginalMember(owner = "loader!t", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!t", name = "c", descriptor = "J")
	private final long aLong152;

	@OriginalMember(owner = "loader!t", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile6;

	@OriginalMember(owner = "loader!t", name = "a", descriptor = "J")
	private final long aLong151;

	@OriginalMember(owner = "loader!t", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class103(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong152 = arg2;
		this.aFile6 = arg0;
		this.aLong151 = 0L;
		@Pc(43) int local43 = this.aRandomAccessFile2.read();
		if (local43 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local43);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!t", name = "b", descriptor = "(B)V")
	public void method3349() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!t", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile6 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3349();
		}
	}
}
