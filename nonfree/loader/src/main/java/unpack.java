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
	private final Hashtable cache = new Hashtable();

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "()V")
	public unpack() {
	}

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "([B)V")
	public unpack(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(14) ZipInputStream local14 = new ZipInputStream(new ByteArrayInputStream(arg0));
		@Pc(17) byte[] local17 = new byte[1000];
		while (true) {
			@Pc(26) String local26;
			do {
				@Pc(20) ZipEntry local20 = local14.getNextEntry();
				if (local20 == null) {
					local14.close();
					return;
				}
				local26 = local20.getName();
			} while (!local26.endsWith(".class"));
			local26 = local26.substring(0, local26.length() - 6);
			local26 = local26.replace('/', '.');
			@Pc(47) ByteArrayOutputStream local47 = new ByteArrayOutputStream();
			while (true) {
				@Pc(53) int local53 = local14.read(local17, 0, 1000);
				if (local53 == -1) {
					@Pc(65) byte[] local65 = local47.toByteArray();
					this.cache.put(local26, local65);
					break;
				}
				local47.write(local17, 0, local53);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public final byte[] method6021(@OriginalArg(1) String arg0) {
		return (byte[]) this.cache.remove(arg0);
	}
}
