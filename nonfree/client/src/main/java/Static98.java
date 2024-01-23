import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array6;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
	public static boolean aBoolean80;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_472 = Static199.method3560("sl_flags");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!qe;")
	public static Class78 aClass78_473 = Static199.method3560("Konfig geladen)3");

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!qe;")
	private static Class78 aClass78_476 = Static199.method3560(" is already on your friend list)3");

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_474 = aClass78_476;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!qe;")
	private static Class78 aClass78_475 = Static199.method3560("Loading title screen )2 ");

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!jh;")
	public static Class53 aClass53_8 = new Class53(50);

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_477 = aClass78_475;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1692() {
		for (@Pc(7) int local7 = 0; local7 < Static143.anInt3258; local7++) {
			@Pc(13) int local13 = Static116.anIntArray449[local7]--;
			if (Static116.anIntArray449[local7] >= -10) {
				@Pc(84) Class66 local84 = Static215.aClass66Array1[local7];
				if (local84 == null) {
					local84 = Static233.method2452(Static124.aClass72_Sub1_24, Static126.anIntArray474[local7], 0);
					if (local84 == null) {
						continue;
					}
					Static116.anIntArray449[local7] += local84.method2451();
					Static215.aClass66Array1[local7] = local84;
				}
				if (Static116.anIntArray449[local7] < 0) {
					@Pc(207) int local207;
					if (Static25.anIntArray75[local7] == 0) {
						local207 = Static11.anInt311;
					} else {
						@Pc(130) int local130 = (Static25.anIntArray75[local7] & 0xFF) * 128;
						@Pc(138) int local138 = Static25.anIntArray75[local7] >> 16 & 0xFF;
						@Pc(146) int local146 = Static25.anIntArray75[local7] >> 8 & 0xFF;
						@Pc(156) int local156 = local138 * 128 + 64 - Static31.aClass5_Sub2_Sub2_1.anInt1849;
						if (local156 < 0) {
							local156 = -local156;
						}
						@Pc(171) int local171 = local146 * 128 + 64 - Static31.aClass5_Sub2_Sub2_1.anInt1827;
						if (local171 < 0) {
							local171 = -local171;
						}
						@Pc(185) int local185 = local171 + local156 - 128;
						if (local130 < local185) {
							Static116.anIntArray449[local7] = -100;
							continue;
						}
						if (local185 < 0) {
							local185 = 0;
						}
						local207 = (local130 - local185) * Static110.anInt2433 / local130;
					}
					if (local207 > 0) {
						@Pc(218) Class2_Sub22_Sub1 local218 = local84.method2450().method1956(Static181.aClass96_1);
						@Pc(223) Class2_Sub21_Sub4 local223 = Static237.method3862(local218, local207);
						local223.method3849(Static201.anIntArray726[local7] - 1);
						Static23.aClass2_Sub21_Sub3_1.method3388(local223);
					}
					Static116.anIntArray449[local7] = -100;
				}
			} else {
				Static143.anInt3258--;
				for (@Pc(27) int local27 = local7; local27 < Static143.anInt3258; local27++) {
					Static126.anIntArray474[local27] = Static126.anIntArray474[local27 + 1];
					Static215.aClass66Array1[local27] = Static215.aClass66Array1[local27 + 1];
					Static201.anIntArray726[local27] = Static201.anIntArray726[local27 + 1];
					Static116.anIntArray449[local27] = Static116.anIntArray449[local27 + 1];
					Static25.anIntArray75[local27] = Static25.anIntArray75[local27 + 1];
				}
				local7--;
			}
		}
		if (Static2.aBoolean2 && !Static127.method3917()) {
			if (Static89.anInt1999 != 0 && Static162.anInt3745 != -1) {
				Static93.method1622(Static162.anInt3745, Static90.aClass72_Sub1_17, Static89.anInt1999);
			}
			Static2.aBoolean2 = false;
		} else if (Static89.anInt1999 != 0 && Static162.anInt3745 != -1 && !Static127.method3917()) {
			Static161.aClass2_Sub23_Sub1_5.method2155(80);
			Static161.aClass2_Sub23_Sub1_5.method2134(Static162.anInt3745);
			Static162.anInt3745 = -1;
		}
	}
}
