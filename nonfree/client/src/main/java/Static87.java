import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()V")
	public static void method2119() {
		@Pc(11) byte[] local11;
		if (aByteBuffer3 == null) {
			@Pc(5) Class20_Sub1_Sub1 local5 = new Class20_Sub1_Sub1();
			local11 = local5.method538();
			aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer3.position(0);
			aByteBuffer3.put(local11);
			aByteBuffer3.flip();
		}
		if (aByteBuffer4 != null) {
			return;
		}
		@Pc(32) Class20_Sub2_Sub1 local32 = new Class20_Sub2_Sub1();
		local11 = local32.method5512();
		aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer4.position(0);
		aByteBuffer4.put(local11);
		aByteBuffer4.flip();
	}
}
