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
public class Class83 {

	@OriginalMember(owner = "loader!unpack", name = "cache", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "()V")
	public Class83() {
	}

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "([B)V")
	public Class83(@OriginalArg(0) byte[] arg0) throws IOException {
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
			@Pc(47) ByteArrayOutputStream local47 = new ByteArrayOutputStream();
			while (true) {
				@Pc(53) int local53 = local14.read(local17, 0, 1000);
				if (local53 == -1) {
					@Pc(66) byte[] local66 = local47.toByteArray();
					this.aHashtable3.put(local25, local66);
					break;
				}
				local47.write(local17, 0, local53);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public final byte[] method2061(@OriginalArg(0) String arg0) {
		return (byte[]) this.aHashtable3.remove(arg0);
	}
}
