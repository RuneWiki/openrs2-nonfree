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
public class Class73 {

	@OriginalMember(owner = "loader!unpack", name = "cache", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "()V")
	public Class73() {
	}

	@OriginalMember(owner = "loader!unpack", name = "<init>", descriptor = "([B)V")
	public Class73(@OriginalArg(0) byte[] arg0) throws IOException {
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
			@Pc(48) ByteArrayOutputStream local48 = new ByteArrayOutputStream();
			while (true) {
				@Pc(54) int local54 = local17.read(local9, 0, 1000);
				if (local54 == -1) {
					@Pc(68) byte[] local68 = local48.toByteArray();
					this.aHashtable2.put(local27, local68);
					break;
				}
				local48.write(local9, 0, local54);
			}
		}
	}

	@OriginalMember(owner = "loader!unpack", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	public final byte[] method2108(@OriginalArg(1) String arg0) {
		return (byte[]) this.aHashtable2.remove(arg0);
	}
}
