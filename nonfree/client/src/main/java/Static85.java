import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "Lclient!ti;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_636 = Static64.method1101("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "Z")
	public static volatile boolean aBoolean88 = false;

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "S")
	public static short aShort10 = 1;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	public static void method1494() {
		if (Static161.anInt3480 == -1 || Static164.anInt3637 == -1) {
			return;
		}
		@Pc(25) int local25 = Static34.anInt805 + ((Static36.anInt873 - Static34.anInt805) * Static41.anInt971 >> 16);
		Static41.anInt971 += local25;
		@Pc(32) float[] local32 = new float[3];
		if (Static41.anInt971 >= 65535) {
			if (Static10.aBoolean9) {
				Static165.aBoolean169 = false;
			} else {
				Static165.aBoolean169 = true;
			}
			Static41.anInt971 = 65535;
			Static10.aBoolean9 = true;
		} else {
			Static165.aBoolean169 = false;
			Static10.aBoolean9 = false;
		}
		@Pc(58) float local58 = (float) Static41.anInt971 / 65535.0F;
		@Pc(62) int local62 = Static110.anInt1392 * 2;
		@Pc(78) int local78;
		@Pc(121) int local121;
		@Pc(144) int local144;
		@Pc(136) int local136;
		@Pc(131) int local131;
		@Pc(162) int local162;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			local78 = Static11.anIntArrayArrayArray1[Static161.anInt3480][local62 + 1][local64] * 3;
			@Pc(88) int local88 = Static11.anIntArrayArrayArray1[Static161.anInt3480][local62][local64] * 3;
			local121 = (Static11.anIntArrayArrayArray1[Static161.anInt3480][local62 + 2][local64] + Static11.anIntArrayArrayArray1[Static161.anInt3480][local62 + 2][local64] - Static11.anIntArrayArrayArray1[Static161.anInt3480][local62 + 3][local64]) * 3;
			local131 = local88 + local121 - local78 * 2;
			local136 = local78 - local88;
			local144 = Static11.anIntArrayArrayArray1[Static161.anInt3480][local62][local64];
			local162 = local78 + Static11.anIntArrayArrayArray1[Static161.anInt3480][local62 + 2][local64] - local121 - local144;
			local32[local64] = (float) local144 + local58 * ((float) local136 + (local58 * (float) local162 + (float) local131) * local58);
		}
		Static191.anInt4119 = (int) local32[1] * -1;
		@Pc(198) float[] local198 = new float[3];
		if (Static198.anInt4217 == 0 && Static118.anInt2541 == 0) {
			Static198.anInt4217 = ((int) local32[0] >> 10) * 8 - 48;
			Static118.anInt2541 = (((int) local32[2] >> 10) - 6) * 8;
		}
		Static118.anInt2544 = (int) local32[2] - Static118.anInt2541 * 128;
		Static122.anInt2706 = (int) local32[0] - Static198.anInt4217 * 128;
		local78 = Static18.anInt454 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local144 = Static11.anIntArrayArrayArray1[Static164.anInt3637][local78][local121] * 3;
			local136 = Static11.anIntArrayArrayArray1[Static164.anInt3637][local78 + 1][local121] * 3;
			local131 = (Static11.anIntArrayArrayArray1[Static164.anInt3637][local78 + 2][local121] + Static11.anIntArrayArrayArray1[Static164.anInt3637][local78 + 2][local121] - Static11.anIntArrayArrayArray1[Static164.anInt3637][local78 + 3][local121]) * 3;
			local162 = Static11.anIntArrayArrayArray1[Static164.anInt3637][local78][local121];
			@Pc(322) int local322 = local136 - local144;
			@Pc(331) int local331 = local131 + local144 - local136 * 2;
			@Pc(348) int local348 = Static11.anIntArrayArrayArray1[Static164.anInt3637][local78 + 2][local121] + local136 - local131 - local162;
			local198[local121] = (float) local162 + (((float) local331 + (float) local348 * local58) * local58 + (float) local322) * local58;
		}
		@Pc(380) float local380 = local198[0] - local32[0];
		@Pc(390) float local390 = (local198[1] - local32[1]) * -1.0F;
		@Pc(398) float local398 = local198[2] - local32[2];
		@Pc(408) double local408 = Math.sqrt((double) (local380 * local380 + local398 * local398));
		Static174.aFloat4 = (float) Math.atan2((double) local390, local408);
		Static104.aFloat2 = -((float) Math.atan2((double) local380, (double) local398));
		Static228.anInt4792 = (int) ((double) Static174.aFloat4 * 325.949D) & 0x7FF;
		Static207.anInt4426 = (int) ((double) Static104.aFloat2 * 325.949D) & 0x7FF;
	}
}
