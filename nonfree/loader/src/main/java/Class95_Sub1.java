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

@OriginalClass("loader!b")
public final class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "([BB)[B")
	private static byte[] method3200(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(5) byte[] local5 = new byte[arg0.length + 2];
		local5[1] = -117;
		local5[0] = 31;
		System.arraycopy(arg0, 0, local5, 2, arg0.length);
		@Pc(32) ByteArrayOutputStream local32 = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(local5)), new JarOutputStream(local32));
		return local32.toByteArray();
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "([B)V")
	public Class95_Sub1(@OriginalArg(0) byte[] arg0) throws IOException {
		super(method3200(arg0));
	}
}
