import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ee")
public final class Class83 {

	@OriginalMember(owner = "loader!ee", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ee", name = "c", descriptor = "J")
	private final long aLong98;

	@OriginalMember(owner = "loader!ee", name = "d", descriptor = "J")
	private final long aLong99;

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "Ljava/io/File;")
	private final File aFile4;

	@OriginalMember(owner = "loader!ee", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class83(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong98 = 0L;
		this.aLong99 = arg2;
		this.aFile4 = arg0;
		@Pc(41) int local41 = this.aRandomAccessFile2.read();
		if (local41 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local41);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ee", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile4 + " not closed correctly using close(). Auto-closing instead. ");
			this.method2273();
		}
	}

	@OriginalMember(owner = "loader!ee", name = "a", descriptor = "(I)V")
	public void method2273() throws IOException {
		this.aRandomAccessFile2.close();
		this.aRandomAccessFile2 = null;
	}
}
