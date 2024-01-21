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
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I[B)[B")
	private static byte[] method3589(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(11) byte[] local11 = new byte[arg0.length + 2];
		local11[1] = -117;
		local11[0] = 31;
		System.arraycopy(arg0, 0, local11, 2, arg0.length);
		@Pc(30) ByteArrayOutputStream local30 = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(local11)), new JarOutputStream(local30));
		return local30.toByteArray();
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "([B)V")
	public Class102_Sub1(@OriginalArg(0) byte[] arg0) throws IOException {
		super(method3589(arg0));
	}
}
