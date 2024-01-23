import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public static int anInt1797;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "F")
	private static float aFloat12;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
	public static int anInt1800;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "[F")
	public static float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
	private static int anInt1798 = -1;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	private static int anInt1799 = -1;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "F")
	private static float aFloat13 = -1.0F;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "F")
	private static float aFloat14 = -1.0F;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "[F")
	private static float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public static int anInt1801 = 13156520;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	public static int anInt1802 = 16777215;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[F")
	public static float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	private static int anInt1803 = -1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)V")
	public static void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt1803 == arg0 && anInt1798 == arg1) {
			return;
		}
		anInt1803 = arg0;
		anInt1798 = arg1;
		@Pc(14) GL local14 = Static291.aGL1;
		aFloatArray15[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray15[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray15[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray15, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()F")
	public static float method1389() {
		return aFloat12;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	public static void method1390() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray13, 0);
		local1.glLightfv(16385, 4611, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public static void method1392(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray13[0] == arg0 && aFloatArray13[1] == arg1 && aFloatArray13[2] == arg2) {
			return;
		}
		aFloatArray13[0] = arg0;
		aFloatArray13[1] = arg1;
		aFloatArray13[2] = arg2;
		aFloatArray14[0] = -arg0;
		aFloatArray14[1] = -arg1;
		aFloatArray14[2] = -arg2;
		anInt1797 = (int) (arg0 * 256.0F / arg1);
		anInt1800 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
	public static void method1393() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt1799 = -1;
		anInt1803 = -1;
		method1396();
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()F")
	public static float method1394() {
		return aFloat13;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([F)V")
	public static void method1395(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray15;
		}
		@Pc(5) GL local5 = Static291.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	private static void method1396() {
		method1397(anInt1802, 1.1523438F, 0.69921875F, 1.2F);
		method1392(-50.0F, -60.0F, -50.0F);
		method1388(anInt1801, 0, false);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IFFF)V")
	public static void method1397(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt1799 == arg0 && aFloat12 == arg1 && aFloat13 == arg2 && aFloat14 == arg3) {
			return;
		}
		anInt1799 = arg0;
		aFloat12 = arg1;
		aFloat13 = arg2;
		aFloat14 = arg3;
		@Pc(25) GL local25 = Static291.aGL1;
		@Pc(34) float local34 = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		@Pc(43) float local43 = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		@Pc(50) float local50 = (float) (arg0 & 0xFF) / 255.0F;
		@Pc(75) float[] local75 = new float[] { arg1 * local34, arg1 * local43, arg1 * local50, 1.0F };
		local25.glLightModelfv(2899, local75, 0);
		@Pc(105) float[] local105 = new float[] { arg2 * local34, arg2 * local43, arg2 * local50, 1.0F };
		local25.glLightfv(16384, 4609, local105, 0);
		@Pc(139) float[] local139 = new float[] { -arg3 * local34, -arg3 * local43, -arg3 * local50, 1.0F };
		local25.glLightfv(16385, 4609, local139, 0);
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "()I")
	public static int method1398() {
		return anInt1799;
	}
}
