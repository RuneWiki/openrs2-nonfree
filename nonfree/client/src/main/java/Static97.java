import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
	public static boolean aBoolean145;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
	public static int[] anIntArray218 = null;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt2213 = -1;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static int anInt2214 = -1;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
	public static int[] anIntArray219 = null;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	private static void method1628() {
		@Pc(1) GL local1 = Static294.aGL1;
		if (aBoolean145) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer7.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer7);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2213 = local6[0];
			Static113.anInt2465 += aByteBuffer7.limit() * 2;
			return;
		}
		anIntArray219 = new int[64];
		local1.glGenTextures(64, anIntArray219, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static294.method4486(anIntArray219[local65]);
			aByteBuffer7.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer7);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static113.anInt2465 += aByteBuffer7.limit() * 2;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
	public static void method1629() {
		aBoolean145 = Static294.aBoolean372;
		method1630();
		method1628();
		method1631();
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "()V")
	public static void method1630() {
		@Pc(11) byte[] local11;
		if (aByteBuffer7 == null) {
			@Pc(5) Class4_Sub1_Sub1 local5 = new Class4_Sub1_Sub1();
			local11 = local5.method206();
			aByteBuffer7 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer7.position(0);
			aByteBuffer7.put(local11);
			aByteBuffer7.flip();
		}
		if (aByteBuffer6 != null) {
			return;
		}
		@Pc(32) Class4_Sub2_Sub1 local32 = new Class4_Sub2_Sub1();
		local11 = local32.method292();
		aByteBuffer6 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer6.position(0);
		aByteBuffer6.put(local11);
		aByteBuffer6.flip();
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "()V")
	private static void method1631() {
		@Pc(1) GL local1 = Static294.aGL1;
		if (aBoolean145) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer6.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer6);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2214 = local6[0];
			Static113.anInt2465 += aByteBuffer6.limit() * 2;
			return;
		}
		anIntArray218 = new int[64];
		local1.glGenTextures(64, anIntArray218, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static294.method4486(anIntArray218[local65]);
			aByteBuffer6.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer6);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static113.anInt2465 += aByteBuffer6.limit() * 2;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "()V")
	public static void method1633() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt2213 != -1) {
			local4 = Static294.aGL1;
			local11 = new int[] { anInt2213 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2213 = -1;
			Static113.anInt2465 -= aByteBuffer7.limit() * 2;
		}
		if (anIntArray219 != null) {
			local4 = Static294.aGL1;
			local4.glDeleteTextures(64, anIntArray219, 0);
			anIntArray219 = null;
			Static113.anInt2465 -= aByteBuffer7.limit() * 2;
		}
		if (anInt2214 != -1) {
			local4 = Static294.aGL1;
			local11 = new int[] { anInt2214 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2214 = -1;
			Static113.anInt2465 -= aByteBuffer6.limit() * 2;
		}
		if (anIntArray218 != null) {
			local4 = Static294.aGL1;
			local4.glDeleteTextures(64, anIntArray218, 0);
			anIntArray218 = null;
			Static113.anInt2465 -= aByteBuffer6.limit() * 2;
		}
	}
}
