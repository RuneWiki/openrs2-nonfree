import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	public static int anInt6381;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!aq;")
	public static Class15 aClass15_9;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)[Lclient!kq;")
	public static Class151[] method5074() {
		if (Static143.aClass151Array1 == null) {
			@Pc(20) Class151[] local20 = Static303.method3589(Static138.aClass194_2);
			@Pc(24) Class151[] local24 = new Class151[local20.length];
			@Pc(26) int local26 = 0;
			@Pc(74) int local74;
			@Pc(80) Class151 local80;
			label63: for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
				@Pc(34) Class151 local34 = local20[local28];
				if ((local34.anInt3727 <= 0 || local34.anInt3727 >= 24) && local34.anInt3724 >= 800 && local34.anInt3725 >= 600 && (Static170.anInt3068 >= 96 || Static404.anInt2752 != 0 || local34.anInt3724 <= 1024 && local34.anInt3725 <= 768)) {
					for (local74 = 0; local74 < local26; local74++) {
						local80 = local24[local74];
						if (local34.anInt3724 == local80.anInt3724 && local80.anInt3725 == local34.anInt3725) {
							if (local34.anInt3727 > local80.anInt3727) {
								local24[local74] = local34;
							}
							continue label63;
						}
					}
					local24[local26] = local34;
					local26++;
				}
			}
			Static143.aClass151Array1 = new Class151[local26];
			Static472.method5024(local24, 0, Static143.aClass151Array1, 0, local26);
			@Pc(136) int[] local136 = new int[Static143.aClass151Array1.length];
			for (local74 = 0; local74 < Static143.aClass151Array1.length; local74++) {
				local80 = Static143.aClass151Array1[local74];
				local136[local74] = local80.anInt3725 * local80.anInt3724;
			}
			Static303.method3588(local136, Static143.aClass151Array1);
		}
		return Static143.aClass151Array1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!hw;I)Lclient!mw;")
	public static Class105_Sub2 method5075(@OriginalArg(0) Class2_Sub17 arg0) {
		return new Class105_Sub2(arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6145(), arg0.method6138());
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public static void method5078() {
		Static457.aClass227_6.method5239();
		Static171.aClass210_6.method4900();
		Static421.aClass174_2.method3694();
		Static249.aClass39_2.method751();
		Static227.aClass54_2.method1129();
		Static413.aClass271_2.method6192();
		Static37.aClass80_1.method1872();
		Static399.aClass100_2.method2200();
		Static371.aClass211_1.method4911();
		Static361.aClass267_1.method6047();
		Static257.aClass262_1.method5908();
		Static54.aClass84_2.method1950();
		Static386.aClass230_7.method5256();
		Static275.aClass235_1.method5379();
		Static461.aClass34_1.method625();
		Static174.aClass147_1.method3052();
		Static388.aClass35_1.method655();
		Static379.aClass152_2.method3073();
		Static39.aClass73_1.method1452();
		Static236.aClass55_1.method1132();
		Static187.method2716();
		Static251.method3485();
		Static370.method5164();
		Static15.method336();
		Static348.aClass188_47.method4169(5);
		Static59.aClass188_48.method4169(5);
		Static452.aClass188_10.method4169(5);
		Static442.aClass188_57.method4169(5);
		Static76.aClass188_16.method4169(5);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(FI)F")
	public static float method5079(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!mn;I)V")
	public static void method5082(@OriginalArg(0) Class171 arg0) {
		Static237.aClass171_53 = arg0;
	}
}
