import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt2288;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/Object;Z[I)V")
	public static void method2243(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static409.method5113(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!lea;)V")
	public static void method2245(@OriginalArg(1) Class2_Sub3_Sub1_Sub2_Sub2 arg0) {
		@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static470.aClass307_42.method7424((long) arg0.anInt6289);
		if (local15 == null) {
			return;
		}
		if (local15.aClass3_Sub7_Sub1_3 != null) {
			Static581.aClass3_Sub7_Sub3_2.method2210(local15.aClass3_Sub7_Sub1_3);
			local15.aClass3_Sub7_Sub1_3 = null;
		}
		local15.method8671();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method2249(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static529.method7521(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBI)Z")
	public static boolean method2250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static445.aClass47_7.method7868(arg0, arg2, arg1, Static446.anIntArray507);
		@Pc(13) int local13 = Static446.anIntArray507[2];
		if (local13 < 50) {
			return false;
		} else {
			Static446.anIntArray507[2] = local13;
			Static446.anIntArray507[0] = Static47.anInt1034 * Static446.anIntArray507[0] / local13 + Static290.anInt5910;
			Static446.anIntArray507[1] = Static352.anInt6886 + Static115.anInt9244 * Static446.anIntArray507[1] / local13;
			return true;
		}
	}
}
