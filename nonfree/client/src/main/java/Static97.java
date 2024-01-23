import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "[Lclient!qb;")
	public static Class20_Sub1_Sub1[] aClass20_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
	public static int anInt2310;

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "Lclient!di;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
	public static int anInt2314;

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
	public static int anInt2316;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!gl", name = "ab", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!gl", name = "ib", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	public static int anInt2311 = 0;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
	public static int anInt2312 = 0;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
	public static int anInt2313 = 0;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "Lclient!tj;")
	public static Class169 aClass169_1 = new Class169(8);

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
	public static int anInt2317 = 0;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
	public static int anInt2318 = 0;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
	public static int anInt2319 = 2;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "Lclient!oe;")
	public static Class2_Sub16 aClass2_Sub16_6 = new Class2_Sub16(131056);

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[8];

	@OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
	public static int anInt2329 = 0;

	@OriginalMember(owner = "client!gl", name = "hb", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[8];

	@OriginalMember(owner = "client!gl", name = "jb", descriptor = "F")
	public static float aFloat10 = 1.0F;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
	public static void method1681() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (local1.isExtensionAvailable("GL_ARB_point_parameters")) {
			@Pc(20) float[] local20 = new float[] { 1.0F, 0.0F, 5.0E-7F };
			local1.glPointParameterfvARB(33065, local20, 0);
			@Pc(28) FloatBuffer local28 = FloatBuffer.allocate(1);
			local1.glGetFloatv(33063, local28);
			@Pc(36) float local36 = local28.get(0);
			if (local36 > 64.0F) {
				local36 = 64.0F;
			}
			local1.glPointParameterfARB(33062, 1.0F);
			local1.glPointParameterfARB(33063, local36);
		}
		if (local1.isExtensionAvailable("GL_ARB_point_sprite")) {
			aBoolean152 = true;
		}
		aShortArrayArray3 = new short[1600][32];
		aShortArrayArray4 = new short[32][768];
		anIntArray203 = new int[1600];
		anIntArray204 = new int[32];
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "()V")
	public static void method1685() {
		aClass169_1 = new Class169(8);
		anInt2318 = 0;
		for (@Pc(11) Class20_Sub2 local11 = (Class20_Sub2) aClass33_2.method978(); local11 != null; local11 = (Class20_Sub2) aClass33_2.method980()) {
			local11.method1694();
		}
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(II)V")
	public static void method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat10 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ek;)V")
	public static void method1695(@OriginalArg(0) Class42 arg0) {
		anInt2311 = 0;
		anInt2317 = 0;
		aClass33_2 = new Class33();
		aClass20_Sub1_Sub1Array1 = new Class20_Sub1_Sub1[1024];
		Static134.method2456(arg0);
		Static241.method3862(arg0);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public static void method1696(@OriginalArg(0) int arg0) {
		anInt2319 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "()I")
	public static int method1697() {
		return anInt2319;
	}

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "()V")
	public static void method1698() {
		aShortArrayArray3 = null;
		aShortArrayArray4 = null;
		anIntArray203 = null;
		anIntArray204 = null;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(J)V")
	public static void method1700(@OriginalArg(0) long arg0) {
		anInt2312 = anInt2310;
		anInt2313 = 0;
		anInt2310 = 0;
		@Pc(8) long local8 = Static221.method3670();
		for (@Pc(13) Class20_Sub2 local13 = (Class20_Sub2) aClass33_2.method978(); local13 != null; local13 = (Class20_Sub2) aClass33_2.method980()) {
			if (local13.method1692(arg0)) {
				anInt2313++;
			}
		}
		if (aBoolean151 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass33_2.method982() + ", running: " + anInt2313 + ". Particles: " + anInt2310 + ". Time taken: " + (Static221.method3670() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "()V")
	public static void method1701() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (Static265.aBoolean348) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static116.aBoolean177) {
			local1.glEnable(2912);
		}
		if (aBoolean152) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	public static void method1702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static116.aGL1;
		if (aBoolean152) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static118.method1991(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static197.aFloatArray11, 0);
		if (Static265.aBoolean348) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static116.aBoolean177) {
			local1.glDisable(2912);
		}
	}
}
