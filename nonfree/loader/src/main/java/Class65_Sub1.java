import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "([BI)[B", line = 8)
	private static byte[] method1747(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(5) byte[] local5 = new byte[arg0.length + 2];
		local5[0] = 31;
		local5[1] = -117;
		System.arraycopy(arg0, 0, local5, 2, arg0.length);
		@Pc(24) ByteArrayOutputStream local24 = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(local5)), new JarOutputStream(local24));
		return local24.toByteArray();
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "([B)V", line = 22)
	public Class65_Sub1(@OriginalArg(0) byte[] arg0) throws IOException {
		super(method1747(arg0));
	}
}
