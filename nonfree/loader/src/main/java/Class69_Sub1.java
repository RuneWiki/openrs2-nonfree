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

@OriginalClass("loader!c")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "([BZ)[B")
	private static byte[] method2111(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(5) byte[] local5 = new byte[arg0.length + 2];
		local5[0] = 31;
		local5[1] = -117;
		System.arraycopy(arg0, 0, local5, 2, arg0.length);
		@Pc(24) ByteArrayOutputStream local24 = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(local5)), new JarOutputStream(local24));
		return local24.toByteArray();
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "([B)V")
	public Class69_Sub1(@OriginalArg(0) byte[] arg0) throws IOException {
		super(method2111(arg0));
	}
}
