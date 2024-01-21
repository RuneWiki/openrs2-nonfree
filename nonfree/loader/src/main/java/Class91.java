import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!kc")
public final class Class91 {

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!kc", name = "b", descriptor = "Ljava/io/File;")
	private final File aFile4;

	@OriginalMember(owner = "loader!kc", name = "c", descriptor = "J")
	private final long aLong146;

	@OriginalMember(owner = "loader!kc", name = "d", descriptor = "J")
	private final long aLong147;

	@OriginalMember(owner = "loader!kc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class91(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile4 = arg0;
		this.aLong146 = 0L;
		this.aLong147 = arg2;
		@Pc(42) int local42 = this.aRandomAccessFile2.read();
		if (local42 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local42);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "(I)V")
	public void method3227() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!kc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile4 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3227();
		}
	}
}
