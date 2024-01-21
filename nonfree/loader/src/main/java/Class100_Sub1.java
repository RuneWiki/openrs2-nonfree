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
public final class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "([BZ)[B")
	private static byte[] method3424(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(10) byte[] local10 = new byte[arg0.length + 2];
		local10[1] = -117;
		local10[0] = 31;
		System.arraycopy(arg0, 0, local10, 2, arg0.length);
		@Pc(29) ByteArrayOutputStream local29 = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(local10)), new JarOutputStream(local29));
		return local29.toByteArray();
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "([B)V")
	public Class100_Sub1(@OriginalArg(0) byte[] arg0) throws IOException {
		super(method3424(arg0));
	}
}
