import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!unpack")
public class unpack {

	@OriginalMember(owner = "loader!unpack", name = "cache", descriptor = "Ljava/util/Hashtable;")
	private Hashtable cache = new Hashtable();

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "()V")
	public unpack() {
	}

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "([B)V")
	public unpack(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(9) byte[] local9 = new byte[1000];
		@Pc(17) ZipInputStream local17 = new ZipInputStream(new ByteArrayInputStream(arg0));
		while (true) {
			@Pc(27) String local27;
			do {
				@Pc(20) ZipEntry local20 = local17.getNextEntry();
				if (local20 == null) {
					local17.close();
					return;
				}
				local27 = local20.getName();
			} while (!local27.endsWith(".class"));
			local27 = local27.substring(0, local27.length() - 6);
			local27 = local27.replace('/', '.');
			@Pc(49) ByteArrayOutputStream local49 = new ByteArrayOutputStream();
			while (true) {
				@Pc(55) int local55 = local17.read(local9, 0, 1000);
				if (local55 == -1) {
					@Pc(67) byte[] local67 = local49.toByteArray();
					this.cache.put(local27, local67);
					break;
				}
				local49.write(local9, 0, local55);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public final byte[] method4773(@OriginalArg(0) String arg0) {
		return (byte[]) this.cache.remove(arg0);
	}
}
