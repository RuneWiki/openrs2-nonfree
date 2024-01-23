import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Z")
	public static boolean aBoolean5;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public static int anInt139 = -1;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
	public static int[] anIntArray8 = null;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	public static int anInt140 = -1;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "[I")
	public static int[] anIntArray9 = null;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	public static void method121() {
		@Pc(11) byte[] local11;
		if (aByteBuffer2 == null) {
			@Pc(5) Class37_Sub2_Sub1 local5 = new Class37_Sub2_Sub1();
			local11 = local5.method4729();
			aByteBuffer2 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer2.position(0);
			aByteBuffer2.put(local11);
			aByteBuffer2.flip();
		}
		if (aByteBuffer1 != null) {
			return;
		}
		@Pc(32) Class37_Sub1_Sub1 local32 = new Class37_Sub1_Sub1();
		local11 = local32.method2811();
		aByteBuffer1 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer1.position(0);
		aByteBuffer1.put(local11);
		aByteBuffer1.flip();
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "()V")
	public static void method122() {
		aBoolean5 = Static156.aBoolean200;
		method121();
		method126();
		method123();
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "()V")
	private static void method123() {
		@Pc(1) GL local1 = Static156.aGL1;
		if (aBoolean5) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer1.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer1);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt139 = local6[0];
			Static10.anInt141 += aByteBuffer1.limit() * 2;
			return;
		}
		anIntArray9 = new int[64];
		local1.glGenTextures(64, anIntArray9, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static156.method2699(anIntArray9[local65]);
			aByteBuffer1.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer1);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static10.anInt141 += aByteBuffer1.limit() * 2;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "()V")
	public static void method125() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt140 != -1) {
			local4 = Static156.aGL1;
			local11 = new int[] { anInt140 };
			local4.glDeleteTextures(1, local11, 0);
			anInt140 = -1;
			Static10.anInt141 -= aByteBuffer2.limit() * 2;
		}
		if (anIntArray8 != null) {
			local4 = Static156.aGL1;
			local4.glDeleteTextures(64, anIntArray8, 0);
			anIntArray8 = null;
			Static10.anInt141 -= aByteBuffer2.limit() * 2;
		}
		if (anInt139 != -1) {
			local4 = Static156.aGL1;
			local11 = new int[] { anInt139 };
			local4.glDeleteTextures(1, local11, 0);
			anInt139 = -1;
			Static10.anInt141 -= aByteBuffer1.limit() * 2;
		}
		if (anIntArray9 != null) {
			local4 = Static156.aGL1;
			local4.glDeleteTextures(64, anIntArray9, 0);
			anIntArray9 = null;
			Static10.anInt141 -= aByteBuffer1.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "()V")
	private static void method126() {
		@Pc(1) GL local1 = Static156.aGL1;
		if (aBoolean5) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer2.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt140 = local6[0];
			Static10.anInt141 += aByteBuffer2.limit() * 2;
			return;
		}
		anIntArray8 = new int[64];
		local1.glGenTextures(64, anIntArray8, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static156.method2699(anIntArray8[local65]);
			aByteBuffer2.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static10.anInt141 += aByteBuffer2.limit() * 2;
	}
}
