import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_11;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1179 = Static122.method531("skill)2");

	@OriginalMember(owner = "client!lf", name = "gb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1183 = Static122.method531("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1180 = aClass73_1183;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1181 = aClass73_1179;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1182 = Static122.method531("<)4col>");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V")
	public static void method1619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		local8[0] = arg0;
		@Pc(24) int local24 = 1;
		local11[0] = arg1;
		for (@Pc(30) int local30 = 0; local30 < 4; local30++) {
			if (Static12.anIntArray13[local30] != arg0) {
				local8[local24] = Static12.anIntArray13[local30];
				local11[local24] = Static148.anIntArray363[local30];
				local24++;
			}
		}
		Static12.anIntArray13 = local8;
		Static148.anIntArray363 = local11;
		Static69.method1226(Static9.aClass62Array1, Static9.aClass62Array1.length - 1, 0, Static148.anIntArray363, Static12.anIntArray13);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	public static void method1621() {
		aClass73_1179 = null;
		aClass13_Sub1_11 = null;
		aClass73_1182 = null;
		aClass73_1183 = null;
		aClass73_1181 = null;
		aClass73_1180 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLclient!hb;Lclient!hb;)V")
	public static void method1622(@OriginalArg(1) Class3_Sub1_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub1_Sub1 arg1) {
		if (Static105.aBoolean159) {
			Static159.method2528(arg0, arg1);
			return;
		}
		if (Static25.anInt717 == 0 || Static25.anInt717 == 5) {
			arg1.method1072(Static5.aClass73_74, 382, 225, 16777215, -1);
			Static15.method2303(230, 233, 304, 34, 9179409);
			Static15.method2303(231, 234, 302, 32, 0);
			Static15.method2297(232, 235, Static135.anInt3086 * 3, 30, 9179409);
			Static15.method2297(Static135.anInt3086 * 3 + 232, 235, 300 - Static135.anInt3086 * 3, 30, 0);
			arg1.method1072(Static12.aClass73_173, 382, 256, 16777215, -1);
		}
		@Pc(95) short local95;
		@Pc(118) int local118;
		if (Static25.anInt717 == 20) {
			local95 = 211;
			Static38.aClass3_Sub1_Sub3_Sub3_13.method1493(382 - Static38.aClass3_Sub1_Sub3_Sub3_13.anInt1917 / 2, 271 - Static38.aClass3_Sub1_Sub3_Sub3_13.anInt1914 / 2);
			arg1.method1072(Static12.aClass73_168, 382, 211, 16776960, 0);
			local118 = local95 + 15;
			arg1.method1072(Static12.aClass73_166, 382, 226, 16776960, 0);
			@Pc(126) int local126 = local118 + 15;
			arg1.method1072(Static12.aClass73_170, 382, 241, 16776960, 0);
			@Pc(134) int local134 = local126 + 15;
			@Pc(135) int local135 = local134 + 10;
			arg1.method1069(Static19.method372(new Class73[] { Static74.aClass73_910, Static21.method1055(Static12.aClass73_171) }), 272, 266, 16777215, 0);
			@Pc(155) int local155 = local135 + 15;
			arg1.method1069(Static19.method372(new Class73[] { Static170.aClass73_1987, Static12.aClass73_172.method2428() }), 274, 281, 16777215, 0);
			@Pc(176) int local176 = local155 + 15;
		}
		if (Static25.anInt717 == 10) {
			Static38.aClass3_Sub1_Sub3_Sub3_13.method1493(202, 171);
			if (Static153.anInt3415 == 0) {
				local95 = 251;
				arg1.method1072(Static108.aClass73_1444, 382, 251, 16776960, 0);
				local118 = local95 + 30;
				Static143.aClass3_Sub1_Sub3_Sub3_14.method1493(229, 271);
				arg1.method1070(Static118.aClass73_2099, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static143.aClass3_Sub1_Sub3_Sub3_14.method1493(389, 271);
				arg1.method1070(Static51.aClass73_679, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static153.anInt3415 == 2) {
				local95 = 211;
				arg1.method1072(Static12.aClass73_168, 382, 211, 16776960, 0);
				local118 = local95 + 15;
				arg1.method1072(Static12.aClass73_166, 382, 226, 16776960, 0);
				local118 += 15;
				arg1.method1072(Static12.aClass73_170, 382, 241, 16776960, 0);
				@Pc(304) boolean local304;
				if (Static137.anInt3106 == 0 && Static44.anInt1024 % 40 < 20 && Static153.aBoolean226) {
					local304 = true;
				} else {
					local304 = false;
				}
				local118 += 15;
				local118 += 10;
				arg1.method1069(Static19.method372(new Class73[] { Static74.aClass73_910, Static21.method1055(Static12.aClass73_171), local304 ? Static99.aClass73_1260 : Static12.aClass73_167 }), 272, 266, 16777215, 0);
				local118 += 15;
				if (Static137.anInt3106 == 1 && Static44.anInt1024 % 40 < 20 && Static153.aBoolean226) {
					local304 = true;
				} else {
					local304 = false;
				}
				arg1.method1069(Static19.method372(new Class73[] { Static170.aClass73_1987, Static12.aClass73_172.method2428(), local304 ? Static99.aClass73_1260 : Static12.aClass73_167 }), 274, 281, 16777215, 0);
				Static143.aClass3_Sub1_Sub3_Sub3_14.method1493(229, 301);
				arg1.method1072(Static122.aClass73_393, 302, 326, 16777215, 0);
				local118 += 15;
				Static143.aClass3_Sub1_Sub3_Sub3_14.method1493(389, 301);
				arg1.method1072(Static28.aClass73_430, 462, 326, 16777215, 0);
			} else if (Static153.anInt3415 == 3) {
				arg1.method1072(Static147.aClass73_1811, 382, 211, 16776960, 0);
				local95 = 236;
				arg1.method1072(Static45.aClass73_617, 382, 236, 16777215, 0);
				local118 = local95 + 15;
				arg1.method1072(Static58.aClass73_754, 382, 251, 16777215, 0);
				local118 += 15;
				arg1.method1072(Static47.aClass73_960, 382, 266, 16777215, 0);
				local118 += 15;
				arg1.method1072(Static53.aClass73_2105, 382, 281, 16777215, 0);
				Static143.aClass3_Sub1_Sub3_Sub3_14.method1493(309, 301);
				arg1.method1072(Static28.aClass73_430, 382, 326, 16777215, 0);
				local118 += 15;
			}
		}
		if (Static159.anInt3490 != 1) {
			if (Static41.anInt992 > 0) {
				Static28.method566(Static41.anInt992);
				Static41.anInt992 = 0;
			}
			Static155.method2490();
		}
		Static12.aClass3_Sub1_Sub3_Sub3Array5[Static108.aBoolean170 ? 1 : 0].method1493(725, 463);
		if (Static25.anInt717 <= 5 || Static173.anInt3798 == 2 || Static104.anInt2351 != 0) {
			return;
		}
		if (Static170.aClass3_Sub1_Sub3_Sub3_15 == null) {
			Static170.aClass3_Sub1_Sub3_Sub3_15 = Static16.method298(Static12.aClass73_167, Static3.aClass13_Sub1_1, Static90.aClass73_1119);
			return;
		}
		Static170.aClass3_Sub1_Sub3_Sub3_15.method1493(5, 463);
		arg1.method1072(Static19.method372(new Class73[] { Static135.aClass73_1713, Static126.aClass73_1652, Static154.method2485(Static94.anInt2078) }), 55, 478, 16777215, 0);
		if (Static76.aClass27_1 == null) {
			arg0.method1072(Static43.aClass73_586, 55, 492, 16777215, 0);
		} else {
			arg0.method1072(Static14.aClass73_215, 55, 492, 16777215, 0);
		}
	}
}
