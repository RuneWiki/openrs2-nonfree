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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I[B)[B")
	private static byte[] method1808(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(13) byte[] local13 = new byte[arg0.length + 2];
		local13[0] = 31;
		local13[1] = -117;
		System.arraycopy(arg0, 0, local13, 2, arg0.length);
		@Pc(32) ByteArrayOutputStream local32 = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(local13)), new JarOutputStream(local32));
		return local32.toByteArray();
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "([B)V")
	public Class65_Sub1(@OriginalArg(0) byte[] arg0) throws IOException {
		super(method1808(arg0));
	}
}
