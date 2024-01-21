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
public class Class90 {

	@OriginalMember(owner = "loader!unpack", name = "cache", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "()V")
	public Class90() {
	}

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "([B)V")
	public Class90(@OriginalArg(0) byte[] arg0) throws IOException {
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
			@Pc(48) ByteArrayOutputStream local48 = new ByteArrayOutputStream();
			while (true) {
				@Pc(54) int local54 = local14.read(local17, 0, 1000);
				if (local54 == -1) {
					@Pc(66) byte[] local66 = local48.toByteArray();
					this.aHashtable3.put(local26, local66);
					break;
				}
				local48.write(local17, 0, local54);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public final byte[] method3226(@OriginalArg(0) String arg0) {
		return (byte[]) this.aHashtable3.remove(arg0);
	}
}
