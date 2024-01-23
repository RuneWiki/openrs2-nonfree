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
			@Pc(26) String local26;
			do {
				@Pc(20) ZipEntry local20 = local17.getNextEntry();
				if (local20 == null) {
					local17.close();
					return;
				}
				local26 = local20.getName();
			} while (!local26.endsWith(".class"));
			local26 = local26.substring(0, local26.length() - 6);
			local26 = local26.replace('/', '.');
			@Pc(47) ByteArrayOutputStream local47 = new ByteArrayOutputStream();
			while (true) {
				@Pc(53) int local53 = local17.read(local9, 0, 1000);
				if (local53 == -1) {
					@Pc(65) byte[] local65 = local47.toByteArray();
					this.cache.put(local26, local65);
					break;
				}
				local47.write(local9, 0, local53);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public final byte[] method4789(@OriginalArg(0) String arg0) {
		return (byte[]) this.cache.remove(arg0);
	}
}
