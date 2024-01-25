import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
	public static int anInt231;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "Lclient!vc;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!ah", name = "N", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
	public static int anInt240 = 0;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	public static void method165() {
		if (Static104.anInt2186 == -1 || Static147.anInt2903 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static132.anInt2757 - Static217.anInt6837) * Static98.anInt2073 >> 16) + Static217.anInt6837;
		Static98.anInt2073 += local24;
		if (Static98.anInt2073 >= 65535) {
			Static98.anInt2073 = 65535;
			if (Static237.aBoolean270) {
				Static254.aBoolean288 = false;
			} else {
				Static254.aBoolean288 = true;
			}
			Static237.aBoolean270 = true;
		} else {
			Static237.aBoolean270 = false;
			Static254.aBoolean288 = false;
		}
		@Pc(56) float local56 = (float) Static98.anInt2073 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static231.anInt4678 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(144) int local144;
		@Pc(162) int local162;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static169.anIntArrayArrayArray5[Static104.anInt2186][local63][local65] * 3;
			local89 = Static169.anIntArrayArrayArray5[Static104.anInt2186][local63 + 1][local65] * 3;
			local122 = (Static169.anIntArrayArrayArray5[Static104.anInt2186][local63 + 2][local65] + Static169.anIntArrayArrayArray5[Static104.anInt2186][local63 + 2][local65] - Static169.anIntArrayArrayArray5[Static104.anInt2186][local63 + 3][local65]) * 3;
			local130 = Static169.anIntArrayArrayArray5[Static104.anInt2186][local63][local65];
			local135 = local89 - local77;
			local144 = local77 + local122 - local89 * 2;
			local162 = local89 + Static169.anIntArrayArrayArray5[Static104.anInt2186][local63 + 2][local65] - local122 - local130;
			local59[local65] = (float) local130 + local56 * (local56 * ((float) local162 * local56 + (float) local144) + (float) local135);
		}
		Static210.anInt4317 = (int) local59[2] - Static296.anInt5889 * 128;
		Static175.anInt3631 = (int) local59[1] * -1;
		Static110.anInt2324 = (int) local59[0] - Static186.anInt3094 * 128;
		@Pc(215) float[] local215 = new float[3];
		local89 = Static4.anInt76 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static169.anIntArrayArrayArray5[Static147.anInt2903][local89][local122] * 3;
			local135 = Static169.anIntArrayArrayArray5[Static147.anInt2903][local89 + 1][local122] * 3;
			local144 = (Static169.anIntArrayArrayArray5[Static147.anInt2903][local89 + 2][local122] + Static169.anIntArrayArrayArray5[Static147.anInt2903][local89 + 2][local122] - Static169.anIntArrayArrayArray5[Static147.anInt2903][local89 + 3][local122]) * 3;
			local162 = Static169.anIntArrayArrayArray5[Static147.anInt2903][local89][local122];
			@Pc(289) int local289 = local135 - local130;
			@Pc(299) int local299 = local130 + local144 - local135 * 2;
			@Pc(316) int local316 = Static169.anIntArrayArrayArray5[Static147.anInt2903][local89 + 2][local122] + local135 - local144 - local162;
			local215[local122] = (float) local162 + local56 * ((float) local289 + local56 * (local56 * (float) local316 + (float) local299));
		}
		@Pc(354) float local354 = local215[0] - local59[0];
		@Pc(365) float local365 = -1.0F * (local215[1] - local59[1]);
		@Pc(374) float local374 = local215[2] - local59[2];
		@Pc(384) double local384 = Math.sqrt((double) (local374 * local374 + local354 * local354));
		Static154.anInt6368 = (int) (Math.atan2((double) local365, local384) * 2607.5945876176133D) & 0x3FFF;
		Static350.anInt6797 = (int) (-Math.atan2((double) local354, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static40.anInt6448 = (Static98.anInt2073 * (Static169.anIntArrayArrayArray5[Static104.anInt2186][local63 + 2][3] - Static169.anIntArrayArrayArray5[Static104.anInt2186][local63][3]) >> 16) + Static169.anIntArrayArrayArray5[Static104.anInt2186][local63][3];
	}
}
