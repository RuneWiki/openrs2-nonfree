import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public static int anInt2171;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_55;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt2163 = 0;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "J")
	public static long aLong68 = 0L;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_856 = Static2.method59("(U");

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!wd;")
	private static Class80 aClass80_859 = Static2.method59("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_857 = aClass80_859;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_858 = Static2.method59("backvmid2");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1324() {
		if (Static10.aBooleanArray2[98]) {
			Static45.anInt2101 += (12 - Static45.anInt2101) / 2;
		} else if (Static10.aBooleanArray2[99]) {
			Static45.anInt2101 += (-Static45.anInt2101 - 12) / 2;
		} else {
			Static45.anInt2101 /= 2;
		}
		@Pc(40) int local40 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 + Static8.anInt233;
		Static74.anInt1961 += Static45.anInt2101 / 2;
		if (Static10.aBooleanArray2[96]) {
			Static21.anInt923 += (-Static21.anInt923 - 24) / 2;
		} else if (Static10.aBooleanArray2[97]) {
			Static21.anInt923 += (24 - Static21.anInt923) / 2;
		} else {
			Static21.anInt923 /= 2;
		}
		@Pc(88) int local88 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 + Static37.anInt1212;
		Static124.anInt3139 = Static21.anInt923 / 2 + Static124.anInt3139 & 0x7FF;
		if (Static68.anInt1884 - local40 < -500 || Static68.anInt1884 - local40 > 500 || Static6.anInt177 - local88 < -500 || Static6.anInt177 - local88 > 500) {
			Static6.anInt177 = local88;
			Static68.anInt1884 = local40;
		}
		if (local40 != Static68.anInt1884) {
			Static68.anInt1884 += (local40 - Static68.anInt1884) / 16;
		}
		@Pc(142) int local142 = Static68.anInt1884 >> 7;
		@Pc(144) int local144 = 0;
		if (local88 != Static6.anInt177) {
			Static6.anInt177 += (local88 - Static6.anInt177) / 16;
		}
		@Pc(160) int local160 = Static6.anInt177 >> 7;
		if (Static74.anInt1961 < 128) {
			Static74.anInt1961 = 128;
		}
		if (Static74.anInt1961 > 383) {
			Static74.anInt1961 = 383;
		}
		@Pc(180) int local180 = Static24.method513(Static68.anInt1884, Static16.anInt444, Static6.anInt177);
		@Pc(202) int local202;
		if (local142 > 3 && local160 > 3 && local142 < 100 && local160 < 100) {
			for (local202 = local142 - 4; local202 <= local142 + 4; local202++) {
				for (@Pc(208) int local208 = local160 - 4; local208 <= local160 + 4; local208++) {
					@Pc(212) int local212 = Static16.anInt444;
					if (local212 < 3 && (Static108.aByteArrayArrayArray7[1][local202][local208] & 0x2) == 2) {
						local212++;
					}
					@Pc(239) int local239 = local180 - Static100.anIntArrayArrayArray5[local212][local202][local208];
					if (local239 > local144) {
						local144 = local239;
					}
				}
			}
		}
		local202 = local144 * 192;
		if (local202 > 98048) {
			local202 = 98048;
		}
		if (local202 < 32768) {
			local202 = 32768;
		}
		if (Static55.anInt1308 < local202) {
			Static55.anInt1308 += (local202 - Static55.anInt1308) / 24;
		} else if (local202 < Static55.anInt1308) {
			Static55.anInt1308 += (local202 - Static55.anInt1308) / 80;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method1327() {
		aClass80_856 = null;
		aClass80_859 = null;
		aClass80_857 = null;
		aClass80_858 = null;
		aClass2_Sub1_Sub9_Sub3_55 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIBLclient!rb;)V")
	public static void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub13 arg3) {
		if (Static103.anInt2679 >= 400) {
			return;
		}
		if (arg3.anIntArray331 != null) {
			arg3 = arg3.method1582();
		}
		if (arg3 == null || !arg3.aBoolean189) {
			return;
		}
		@Pc(33) Class80 local33 = arg3.aClass80_979;
		if (arg3.anInt2568 != 0) {
			local33 = Static93.method1444(new Class80[] { local33, Static57.method1026(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2387, arg3.anInt2568), Static87.aClass80_899, Static105.aClass80_909, Static28.method1422(arg3.anInt2568), Static43.aClass80_486 });
		}
		if (Static107.anInt2862 == 1) {
			Static59.method1043(arg2, 14, Static8.aClass80_109, arg0, Static93.method1444(new Class80[] { Static67.aClass80_712, Static104.aClass80_1036, local33 }), arg1);
		} else if (!Static76.aBoolean141) {
			@Pc(125) Class80[] local125 = arg3.aClass80Array15;
			if (Static24.aBoolean64) {
				local125 = Static33.method603(local125);
			}
			@Pc(135) int local135;
			if (local125 != null) {
				for (local135 = 4; local135 >= 0; local135--) {
					if (local125[local135] != null && !local125[local135].method2006(Static92.aClass80_883)) {
						@Pc(154) byte local154 = 0;
						if (local135 == 0) {
							local154 = 50;
						}
						if (local135 == 1) {
							local154 = 44;
						}
						if (local135 == 2) {
							local154 = 1;
						}
						if (local135 == 3) {
							local154 = 27;
						}
						if (local135 == 4) {
							local154 = 25;
						}
						Static59.method1043(arg2, local154, local125[local135], arg0, Static93.method1444(new Class80[] { Static115.aClass80_1124, local33 }), arg1);
					}
				}
			}
			if (local125 != null) {
				for (local135 = 4; local135 >= 0; local135--) {
					if (local125[local135] != null && local125[local135].method2006(Static92.aClass80_883)) {
						@Pc(232) short local232 = 0;
						if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2387 < arg3.anInt2568) {
							local232 = 2000;
						}
						@Pc(245) int local245 = 0;
						if (local135 == 0) {
							local245 = local232 + 50;
						}
						if (local135 == 1) {
							local245 = local232 + 44;
						}
						if (local135 == 2) {
							local245 = local232 + 1;
						}
						if (local135 == 3) {
							local245 = local232 + 27;
						}
						if (local135 == 4) {
							local245 = local232 + 25;
						}
						Static59.method1043(arg2, local245, local125[local135], arg0, Static93.method1444(new Class80[] { Static115.aClass80_1124, local33 }), arg1);
					}
				}
			}
			Static59.method1043(arg2, 1001, Static51.aClass80_558, arg0, Static93.method1444(new Class80[] { Static115.aClass80_1124, local33 }), arg1);
		} else if ((Static50.anInt1524 & 0x2) == 2) {
			Static59.method1043(arg2, 28, Static68.aClass80_721, arg0, Static93.method1444(new Class80[] { Static59.aClass80_631, Static104.aClass80_1036, local33 }), arg1);
			return;
		}
	}
}
