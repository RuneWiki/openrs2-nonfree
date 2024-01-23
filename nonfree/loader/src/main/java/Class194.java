import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hm")
public final class Class194 {

	@OriginalMember(owner = "loader!hm", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "loader!hm", name = "a", descriptor = "Ljava/io/File;")
	private File aFile2;

	@OriginalMember(owner = "loader!hm", name = "c", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "loader!hm", name = "d", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "loader!hm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class194(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 < arg0.length()) {
			arg0.delete();
		}
		this.aRandomAccessFile2 = new RandomAccessFile(arg0, arg1);
		this.aFile2 = arg0;
		this.aLong215 = arg2;
		this.aLong216 = 0L;
		@Pc(35) int local35 = this.aRandomAccessFile2.read();
		if (local35 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile2.seek(0L);
			this.aRandomAccessFile2.write(local35);
		}
		this.aRandomAccessFile2.seek(0L);
	}

	@OriginalMember(owner = "loader!hm", name = "b", descriptor = "(I)V")
	private void method4738() throws IOException {
		if (this.aRandomAccessFile2 != null) {
			this.aRandomAccessFile2.close();
			this.aRandomAccessFile2 = null;
		}
	}

	@OriginalMember(owner = "loader!hm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.aRandomAccessFile2 != null) {
			System.out.println("Warning! fileondisk " + this.aFile2 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4738();
		}
	}
}
