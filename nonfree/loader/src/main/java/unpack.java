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
			@Pc(25) String local25;
			do {
				@Pc(20) ZipEntry local20 = local14.getNextEntry();
				if (local20 == null) {
					local14.close();
					return;
				}
				local25 = local20.getName();
			} while (!local25.endsWith(".class"));
			local25 = local25.substring(0, local25.length() - 6);
			local25 = local25.replace('/', '.');
			@Pc(46) ByteArrayOutputStream local46 = new ByteArrayOutputStream();
			while (true) {
				@Pc(52) int local52 = local14.read(local17, 0, 1000);
				if (local52 == -1) {
					@Pc(66) byte[] local66 = local46.toByteArray();
					this.cache.put(local25, local66);
					break;
				}
				local46.write(local17, 0, local52);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public final byte[] method6079(@OriginalArg(0) String arg0) {
		return (byte[]) this.cache.remove(arg0);
	}
}
