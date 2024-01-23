import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fi")
public final class Class132 {

	@OriginalMember(owner = "loader!fi", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!fi", name = "c", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "loader!fi", name = "a", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "loader!fi", name = "d", descriptor = "Ljava/io/File;")
	private File aFile6;

	@OriginalMember(owner = "loader!fi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class132(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong179 = arg2;
		this.aLong178 = 0L;
		this.aFile6 = arg0;
		@Pc(38) int local38 = this.aRandomAccessFile2.read();
		if (local38 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local38);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!fi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile6 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3775();
		}
	}

	@OriginalMember(owner = "loader!fi", name = "a", descriptor = "(Z)V")
	public void method3775() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
