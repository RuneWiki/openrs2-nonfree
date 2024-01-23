import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ej")
public final class Class129 {

	@OriginalMember(owner = "loader!ej", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!ej", name = "d", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "loader!ej", name = "a", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "loader!ej", name = "c", descriptor = "Ljava/io/File;")
	private File aFile4;

	@OriginalMember(owner = "loader!ej", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class129(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aLong171 = arg2;
		this.aLong172 = 0L;
		this.aFile4 = arg0;
		@Pc(39) int local39 = this.aRandomAccessFile2.read();
		if (local39 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local39);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!ej", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile4 + " not closed correctly using close(). Auto-closing instead. ");
			this.method3843();
		}
	}

	@OriginalMember(owner = "loader!ej", name = "a", descriptor = "(I)V")
	public void method3843() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}
}
