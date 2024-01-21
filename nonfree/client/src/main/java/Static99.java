import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!we;")
	public static Class62 aClass62_19;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!ge;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public static int anInt2345;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_1134 = Static109.method1737("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_1135 = Static109.method1737("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!na;")
	private static Class53 aClass53_1136 = Static109.method1737("Attack");

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_1137 = aClass53_1135;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	public static int anInt2344 = 128;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_1138 = Static109.method1737("mapfunction");

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_1139 = Static109.method1737("::qa_op_test");

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_1140 = aClass53_1136;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
	public static int anInt2346 = 0;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
	public static int anInt2348 = 0;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
	public static int anInt2349 = 0;

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array17 = new Class53[500];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method1638() {
		aClass53Array17 = null;
		aClass53_1134 = null;
		aClass62_19 = null;
		aClass53_1136 = null;
		aClass53_1135 = null;
		aClass53_1139 = null;
		aClass28_1 = null;
		aClass53_1140 = null;
		aClass53_1138 = null;
		aClass53_1137 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Z")
	public static boolean method1639() {
		if (Static40.aClass37_2 == null) {
			return false;
		}
		@Pc(221) int local221;
		try {
			@Pc(13) int local13 = Static40.aClass37_2.method949();
			if (local13 == 0) {
				return false;
			}
			if (Static51.anInt1329 == -1) {
				local13--;
				Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, 1, 0);
				Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
				Static51.anInt1329 = Static62.aClass3_Sub7_Sub1_2.method656();
				Static37.anInt2211 = Static123.anIntArray414[Static51.anInt1329];
			}
			if (Static37.anInt2211 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, 1, 0);
				Static37.anInt2211 = Static62.aClass3_Sub7_Sub1_2.aByteArray15[0] & 0xFF;
				local13--;
			}
			if (Static37.anInt2211 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, 2, 0);
				Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
				Static37.anInt2211 = Static62.aClass3_Sub7_Sub1_2.method602();
				local13 -= 2;
			}
			if (Static37.anInt2211 > local13) {
				return false;
			}
			Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
			Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, Static37.anInt2211, 0);
			Static5.anInt192 = 0;
			Static52.anInt1342 = Static56.anInt1493;
			Static56.anInt1493 = Static66.anInt1681;
			Static66.anInt1681 = Static51.anInt1329;
			if (Static51.anInt1329 == 53) {
				Static120.anInt2807 = Static62.aClass3_Sub7_Sub1_2.method611() * 30;
				Static51.anInt1329 = -1;
				return true;
			}
			@Pc(150) int local150;
			@Pc(137) Class53 local137;
			if (Static51.anInt1329 == 214) {
				local137 = Static62.aClass3_Sub7_Sub1_2.method605();
				@Pc(144) Object[] local144 = new Object[local137.method1294() + 1];
				for (local150 = local137.method1294() - 1; local150 >= 0; local150--) {
					if (local137.method1258(local150) == 115) {
						local144[local150 + 1] = Static62.aClass3_Sub7_Sub1_2.method605();
					} else {
						local144[local150 + 1] = Integer.valueOf(Static62.aClass3_Sub7_Sub1_2.method638());
					}
				}
				local144[0] = Integer.valueOf(Static62.aClass3_Sub7_Sub1_2.method638());
				Static12.method188(0, 0, null, 0, null, local144);
				Static51.anInt1329 = -1;
				return true;
			}
			@Pc(239) int local239;
			@Pc(217) int local217;
			if (Static51.anInt1329 == 15) {
				Static36.aBoolean40 = true;
				local217 = Static62.aClass3_Sub7_Sub1_2.method604();
				local221 = Static62.aClass3_Sub7_Sub1_2.method612();
				local150 = Static62.aClass3_Sub7_Sub1_2.method600();
				Static108.anIntArray329[local221] = local150;
				Static97.anIntArray311[local221] = local217;
				Static9.anIntArray21[local221] = 1;
				for (local239 = 0; local239 < 98; local239++) {
					if (Class24.anIntArray111[local239] <= local150) {
						Static9.anIntArray21[local221] = local239 + 2;
					}
				}
				Static80.anInt2033 = Static27.anInt843;
				Static51.anInt1329 = -1;
				return true;
			}
			@Pc(294) Class3_Sub1_Sub15 local294;
			@Pc(309) int local309;
			@Pc(307) int local307;
			if (Static51.anInt1329 == 228) {
				Static36.aBoolean40 = true;
				local217 = Static62.aClass3_Sub7_Sub1_2.method638();
				local221 = Static62.aClass3_Sub7_Sub1_2.method602();
				if (local217 < -70000) {
					local221 += 32768;
				}
				if (local217 >= 0) {
					local294 = Static30.method666(local217);
				} else {
					local294 = null;
				}
				while (Static62.aClass3_Sub7_Sub1_2.anInt964 < Static37.anInt2211) {
					local239 = Static62.aClass3_Sub7_Sub1_2.method619();
					local307 = Static62.aClass3_Sub7_Sub1_2.method602();
					local309 = 0;
					if (local307 != 0) {
						local309 = Static62.aClass3_Sub7_Sub1_2.method647();
						if (local309 == 255) {
							local309 = Static62.aClass3_Sub7_Sub1_2.method638();
						}
					}
					if (local294 != null && local239 >= 0 && local294.anIntArray383.length > local239) {
						local294.anIntArray383[local239] = local307;
						local294.anIntArray381[local239] = local309;
					}
					Static66.method1137(local309, local221, local239, local307 - 1);
				}
				Static51.anInt1329 = -1;
				Static103.anInt2416 = Static27.anInt843;
				return true;
			}
			if (Static51.anInt1329 == 94) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method614();
				if (Static30.anInt1019 != local217) {
					Static8.method131(Static30.anInt1019);
					Static30.anInt1019 = local217;
				}
				Static52.aBoolean50 = true;
				Static31.method691(Static30.anInt1019);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 10) {
				Static119.anInt444 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 192) {
				Static31.method695(true);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 163) {
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static123.anInt2865 = -1;
				}
				Static68.aBoolean62 = false;
				Static51.anInt1329 = -1;
				Static105.anInt2427 = 2;
				Static52.aBoolean50 = true;
				Static35.aClass53_479 = Static35.aClass53_476;
				return true;
			}
			if (Static51.anInt1329 == 104) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method617();
				Static72.method1226(local217);
				Static103.anInt2416 = Static27.anInt843;
				Static51.anInt1329 = -1;
				return true;
			}
			@Pc(487) Class3_Sub1_Sub15 local487;
			if (Static51.anInt1329 == 183) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method606();
				local221 = Static62.aClass3_Sub7_Sub1_2.method606();
				local150 = Static62.aClass3_Sub7_Sub1_2.method602();
				if (local150 == 65535) {
					local150 = -1;
				}
				local487 = Static30.method666(local221);
				@Pc(500) Class3_Sub1_Sub8 local500;
				if (local487.aBoolean112) {
					local487.anInt2681 = local150;
					local487.anInt2713 = local217;
					local500 = Static2.method38(local150);
					local487.anInt2723 = local500.anInt1603;
					local487.anInt2690 = local500.anInt1598;
					local487.anInt2674 = local500.anInt1604;
					local487.anInt2717 = local500.anInt1577;
					if (local487.anInt2727 > 0) {
						local487.anInt2690 = local487.anInt2690 * 32 / local487.anInt2727;
					}
					local487.anInt2706 = local500.anInt1596;
					local487.anInt2689 = local500.anInt1591;
					Static3.method48(local487);
				} else if (local150 == -1) {
					local487.anInt2700 = 0;
					Static51.anInt1329 = -1;
					return true;
				} else {
					local500 = Static2.method38(local150);
					local487.anInt2723 = local500.anInt1603;
					local487.anInt2690 = local500.anInt1598 * 100 / local217;
					local487.anInt2721 = local150;
					local487.anInt2700 = 4;
					local487.anInt2717 = local500.anInt1577;
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 249) {
				Static119.method280(Static4.aClass6_1, Static62.aClass3_Sub7_Sub1_2, Static37.anInt2211);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 147) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method602();
				Static63.method1116(local217);
				if (Static111.anInt2574 != -1) {
					Static8.method131(Static111.anInt2574);
					Static36.aBoolean40 = true;
					Static12.aBoolean18 = true;
					Static111.anInt2574 = -1;
				}
				if (Static123.anInt2858 != -1) {
					Static8.method131(Static123.anInt2858);
					Static123.anInt2858 = -1;
					Static103.method1692(30);
				}
				if (Static54.anInt2856 != -1) {
					Static8.method131(Static54.anInt2856);
					Static54.anInt2856 = -1;
				}
				if (Static111.anInt2556 != -1) {
					Static8.method131(Static111.anInt2556);
					Static111.anInt2556 = -1;
				}
				if (Static123.anInt2865 == local217) {
					Static65.method1134(Static123.anInt2865);
				} else {
					Static8.method131(Static123.anInt2865);
					Static123.anInt2865 = local217;
				}
				Static41.anInt1206 = -1;
				Static31.method691(Static123.anInt2865);
				Static52.aBoolean50 = true;
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 125) {
				Static22.anInt713 = Static62.aClass3_Sub7_Sub1_2.method612();
				Static36.aBoolean40 = true;
				Static12.aBoolean18 = true;
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 30) {
				Static70.aBoolean65 = true;
				Static40.anInt1189 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static96.anInt1468 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static97.anInt2308 = Static62.aClass3_Sub7_Sub1_2.method602();
				Static4.anInt120 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static105.anInt2430 = Static62.aClass3_Sub7_Sub1_2.method647();
				if (Static105.anInt2430 >= 100) {
					Static115.anInt2618 = Static96.anInt1468 * 128 + 64;
					Static39.anInt1177 = Static40.anInt1189 * 128 + 64;
					Static95.anInt2273 = Static77.method1355(Static115.anInt2618, Static72.anInt1813, Static39.anInt1177) - Static97.anInt2308;
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 59) {
				anInt2345 = Static62.aClass3_Sub7_Sub1_2.method612();
				Static111.anInt2565 = Static62.aClass3_Sub7_Sub1_2.method604();
				for (local217 = anInt2345; local217 < anInt2345 + 8; local217++) {
					for (local221 = Static111.anInt2565; local221 < Static111.anInt2565 + 8; local221++) {
						if (Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local217][local221] != null) {
							Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local217][local221] = null;
							Static59.method1069(local217, local221);
						}
					}
				}
				for (@Pc(805) Class3_Sub16 local805 = (Class3_Sub16) Static49.aClass11_7.method189(); local805 != null; local805 = (Class3_Sub16) Static49.aClass11_7.method187()) {
					if (anInt2345 <= local805.anInt2507 && anInt2345 + 8 > local805.anInt2507 && Static111.anInt2565 <= local805.anInt2496 && local805.anInt2496 < Static111.anInt2565 + 8 && Static72.anInt1813 == local805.anInt2493) {
						local805.anInt2509 = 0;
					}
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 140) {
				Static51.anInt1329 = -1;
				Static68.anInt1730 = 0;
				return true;
			}
			if (Static51.anInt1329 == 251) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method617();
				local221 = Static62.aClass3_Sub7_Sub1_2.method606();
				local239 = local217 >> 5 & 0x1F;
				local150 = local217 >> 10 & 0x1F;
				local307 = local217 & 0x1F;
				@Pc(893) Class3_Sub1_Sub15 local893 = Static30.method666(local221);
				Static51.anInt1329 = -1;
				local893.anInt2672 = (local150 << 19) + ((local239 << 11) + (local307 << 3));
				return true;
			}
			@Pc(1114) long local1114;
			@Pc(918) long local918;
			if (Static51.anInt1329 == 187) {
				local918 = Static62.aClass3_Sub7_Sub1_2.method607();
				local150 = Static62.aClass3_Sub7_Sub1_2.method602();
				local239 = Static62.aClass3_Sub7_Sub1_2.method647();
				@Pc(932) Class53 local932 = Static106.method1712(local918).method1263();
				for (local309 = 0; local309 < Static68.anInt1724; local309++) {
					if (Static2.aLongArray1[local309] == local918) {
						if (local150 != Static120.anIntArray405[local309]) {
							Static120.anIntArray405[local309] = local150;
							Static36.aBoolean40 = true;
							if (local150 > 0) {
								Static73.method1234(5, Static35.aClass53_476, Static103.method1689(new Class53[] { local932, Static102.aClass53_1174 }));
							}
							if (local150 == 0) {
								Static73.method1234(5, Static35.aClass53_476, Static103.method1689(new Class53[] { local932, Static7.aClass53_86 }));
							}
						}
						Static75.anIntArray250[local309] = local239;
						local932 = null;
						break;
					}
				}
				@Pc(1009) boolean local1009 = false;
				if (local932 != null && Static68.anInt1724 < 200) {
					Static2.aLongArray1[Static68.anInt1724] = local918;
					Static52.aClass53Array11[Static68.anInt1724] = local932;
					Static120.anIntArray405[Static68.anInt1724] = local150;
					Static75.anIntArray250[Static68.anInt1724] = local239;
					Static36.aBoolean40 = true;
					Static68.anInt1724++;
					Static44.anInt1240 = Static27.anInt843;
				}
				while (!local1009) {
					local1009 = true;
					for (@Pc(1044) int local1044 = 0; local1044 < Static68.anInt1724 - 1; local1044++) {
						if (Static31.anInt1056 != Static120.anIntArray405[local1044] && Static120.anIntArray405[local1044 + 1] == Static31.anInt1056 || Static120.anIntArray405[local1044] == 0 && Static120.anIntArray405[local1044 + 1] != 0) {
							local1009 = false;
							@Pc(1078) int local1078 = Static120.anIntArray405[local1044];
							Static120.anIntArray405[local1044] = Static120.anIntArray405[local1044 + 1];
							Static120.anIntArray405[local1044 + 1] = local1078;
							@Pc(1096) Class53 local1096 = Static52.aClass53Array11[local1044];
							Static52.aClass53Array11[local1044] = Static52.aClass53Array11[local1044 + 1];
							Static52.aClass53Array11[local1044 + 1] = local1096;
							local1114 = Static2.aLongArray1[local1044];
							Static2.aLongArray1[local1044] = Static2.aLongArray1[local1044 + 1];
							Static2.aLongArray1[local1044 + 1] = local1114;
							@Pc(1132) int local1132 = Static75.anIntArray250[local1044];
							Static75.anIntArray250[local1044] = Static75.anIntArray250[local1044 + 1];
							Static75.anIntArray250[local1044 + 1] = local1132;
							Static36.aBoolean40 = true;
						}
					}
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 96) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method617();
				Static63.method1116(local217);
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static123.anInt2865 = -1;
					Static52.aBoolean50 = true;
				}
				if (Static123.anInt2858 != -1) {
					Static8.method131(Static123.anInt2858);
					Static123.anInt2858 = -1;
					Static103.method1692(30);
				}
				if (Static54.anInt2856 != -1) {
					Static8.method131(Static54.anInt2856);
					Static54.anInt2856 = -1;
				}
				if (Static111.anInt2556 != -1) {
					Static8.method131(Static111.anInt2556);
					Static111.anInt2556 = -1;
				}
				if (local217 == Static111.anInt2574) {
					Static65.method1134(Static111.anInt2574);
				} else {
					Static8.method131(Static111.anInt2574);
					Static111.anInt2574 = local217;
				}
				if (Static105.anInt2427 != 0) {
					Static105.anInt2427 = 0;
					Static52.aBoolean50 = true;
				}
				Static41.anInt1206 = -1;
				Static12.aBoolean18 = true;
				Static36.aBoolean40 = true;
				Static31.method691(Static111.anInt2574);
				Static51.anInt1329 = -1;
				return true;
			}
			@Pc(1279) long local1279;
			@Pc(1269) long local1269;
			if (Static51.anInt1329 == 21) {
				local918 = Static62.aClass3_Sub7_Sub1_2.method607();
				@Pc(1265) byte local1265 = Static62.aClass3_Sub7_Sub1_2.method624();
				local1269 = Static62.aClass3_Sub7_Sub1_2.method607();
				@Pc(1274) long local1274 = (long) Static62.aClass3_Sub7_Sub1_2.method602();
				local1279 = Static62.aClass3_Sub7_Sub1_2.method639();
				@Pc(1283) int local1283 = Static62.aClass3_Sub7_Sub1_2.method647();
				local1114 = local1279 + (local1274 << 32);
				@Pc(1291) boolean local1291 = false;
				for (@Pc(1293) int local1293 = 0; local1293 < 100; local1293++) {
					if (Static4.aLongArray2[local1293] == local1114) {
						local1291 = true;
						break;
					}
				}
				if (local1283 <= 1) {
					for (@Pc(1316) int local1316 = 0; local1316 < Static23.anInt737; local1316++) {
						if (local918 == Static39.aLongArray4[local1316]) {
							local1291 = true;
							break;
						}
					}
				}
				if (!local1291 && Static48.anInt1301 == 0) {
					Static4.aLongArray2[Static75.anInt1854] = local1114;
					Static75.anInt1854 = (Static75.anInt1854 + 1) % 100;
					@Pc(1359) Class53 local1359 = Static50.method1918(Static62.aClass3_Sub7_Sub1_2).method1284();
					@Pc(1388) Class53 local1388 = Static103.method1689(new Class53[] { Static91.aClass53_1052, Static106.method1712(local1269), Static104.aClass53_1283, Static108.method1725(local1265), Static35.aClass53_471 });
					if (local1283 == 2 || local1283 == 3) {
						Static73.method1234(7, Static103.method1689(new Class53[] { local1388, Static126.aClass53_1045, Static106.method1712(local918).method1263() }), local1359);
					} else if (local1283 == 1) {
						Static73.method1234(7, Static103.method1689(new Class53[] { local1388, Static40.aClass53_516, Static106.method1712(local918).method1263() }), local1359);
					} else {
						Static73.method1234(3, Static103.method1689(new Class53[] { local1388, Static106.method1712(local918).method1263() }), local1359);
					}
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 115) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method617();
				local221 = Static62.aClass3_Sub7_Sub1_2.method638();
				local294 = Static30.method666(local221);
				local294.anInt2700 = 2;
				Static51.anInt1329 = -1;
				local294.anInt2721 = local217;
				return true;
			}
			if (Static51.anInt1329 == 58) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method602();
				local221 = Static62.aClass3_Sub7_Sub1_2.method600();
				local294 = Static30.method666(local221);
				local294.anInt2721 = local217;
				local294.anInt2700 = 1;
				Static51.anInt1329 = -1;
				return true;
			}
			@Pc(1602) int local1602;
			if (Static51.anInt1329 == 33) {
				Static70.aBoolean65 = true;
				Static75.anInt1863 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static90.anInt2126 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static48.anInt1296 = Static62.aClass3_Sub7_Sub1_2.method602();
				Static16.anInt373 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static50.anInt2783 = Static62.aClass3_Sub7_Sub1_2.method647();
				if (Static50.anInt2783 >= 100) {
					local217 = Static75.anInt1863 * 128 + 64;
					local221 = Static90.anInt2126 * 128 + 64;
					local150 = Static77.method1355(local221, Static72.anInt1813, local217) - Static48.anInt1296;
					local307 = local150 - Static95.anInt2273;
					local239 = local217 - Static39.anInt1177;
					local309 = local221 - Static115.anInt2618;
					local1602 = (int) Math.sqrt((double) (local309 * local309 + local239 * local239));
					Static48.anInt1302 = (int) (Math.atan2((double) local307, (double) local1602) * 325.949D) & 0x7FF;
					Static72.anInt1807 = (int) (Math.atan2((double) local239, (double) local309) * -325.949D) & 0x7FF;
					if (Static48.anInt1302 < 128) {
						Static48.anInt1302 = 128;
					}
					if (Static48.anInt1302 > 383) {
						Static48.anInt1302 = 383;
					}
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 124) {
				local137 = Static62.aClass3_Sub7_Sub1_2.method605();
				local221 = Static62.aClass3_Sub7_Sub1_2.method600();
				local294 = Static30.method666(local221);
				local294.aClass53_1346 = local137;
				if (local221 >> 16 == Static60.anIntArray194[Static22.anInt713]) {
					Static36.aBoolean40 = true;
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 197) {
				Static65.anInt1661 = Static62.aClass3_Sub7_Sub1_2.method602();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 80) {
				Static31.method695(false);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 173) {
				Static35.aClass53_474 = Static62.aClass3_Sub7_Sub1_2.method605();
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static123.anInt2865 = -1;
				}
				Static68.aBoolean62 = false;
				Static35.aClass53_479 = Static35.aClass53_476;
				Static51.anInt1329 = -1;
				Static105.anInt2427 = 4;
				Static52.aBoolean50 = true;
				return true;
			}
			if (Static51.anInt1329 == 23) {
				Static59.method1066();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 31) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method611();
				local221 = Static62.aClass3_Sub7_Sub1_2.method617();
				local150 = Static62.aClass3_Sub7_Sub1_2.method600();
				local487 = Static30.method666(local150);
				local487.anInt2663 = (local221 << 16) + local217;
				Static51.anInt1329 = -1;
				return true;
			}
			@Pc(1781) long local1781;
			if (Static51.anInt1329 == 47) {
				local918 = Static62.aClass3_Sub7_Sub1_2.method607();
				local1781 = Static62.aClass3_Sub7_Sub1_2.method602();
				@Pc(1786) long local1786 = (long) Static62.aClass3_Sub7_Sub1_2.method639();
				local1279 = (local1781 << 32) + local1786;
				local1602 = Static62.aClass3_Sub7_Sub1_2.method647();
				@Pc(1798) boolean local1798 = false;
				for (@Pc(1800) int local1800 = 0; local1800 < 100; local1800++) {
					if (Static4.aLongArray2[local1800] == local1279) {
						local1798 = true;
						break;
					}
				}
				if (local1602 <= 1) {
					for (@Pc(1821) int local1821 = 0; local1821 < Static23.anInt737; local1821++) {
						if (local918 == Static39.aLongArray4[local1821]) {
							local1798 = true;
							break;
						}
					}
				}
				if (!local1798 && Static48.anInt1301 == 0) {
					Static4.aLongArray2[Static75.anInt1854] = local1279;
					Static75.anInt1854 = (Static75.anInt1854 + 1) % 100;
					@Pc(1864) Class53 local1864 = Static50.method1918(Static62.aClass3_Sub7_Sub1_2).method1284();
					if (local1602 == 2 || local1602 == 3) {
						Static73.method1234(7, Static103.method1689(new Class53[] { Static126.aClass53_1045, Static106.method1712(local918).method1263() }), local1864);
					} else if (local1602 == 1) {
						Static73.method1234(7, Static103.method1689(new Class53[] { Static40.aClass53_516, Static106.method1712(local918).method1263() }), local1864);
					} else {
						Static73.method1234(3, Static106.method1712(local918).method1263(), local1864);
					}
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 130) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method606();
				local221 = Static62.aClass3_Sub7_Sub1_2.method610();
				local150 = Static62.aClass3_Sub7_Sub1_2.method614();
				local487 = Static30.method666(local217);
				Static51.anInt1329 = -1;
				local487.anInt2708 = local487.anInt2673 + local150;
				local487.anInt2677 = local221 + local487.anInt2730;
				return true;
			}
			if (Static51.anInt1329 == 72) {
				if (Static22.anInt713 == 12) {
					Static36.aBoolean40 = true;
				}
				Static65.anInt1668 = Static62.aClass3_Sub7_Sub1_2.method649();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 112) {
				if (Static111.anInt2574 != -1) {
					Static8.method131(Static111.anInt2574);
					Static111.anInt2574 = -1;
					Static12.aBoolean18 = true;
					Static36.aBoolean40 = true;
				}
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static123.anInt2865 = -1;
					Static52.aBoolean50 = true;
				}
				if (Static123.anInt2858 != -1) {
					Static8.method131(Static123.anInt2858);
					Static123.anInt2858 = -1;
					Static103.method1692(30);
				}
				if (Static54.anInt2856 != -1) {
					Static8.method131(Static54.anInt2856);
					Static54.anInt2856 = -1;
				}
				if (Static111.anInt2556 != -1) {
					Static8.method131(Static111.anInt2556);
					Static111.anInt2556 = -1;
				}
				Static41.anInt1206 = -1;
				Static51.anInt1329 = -1;
				if (Static105.anInt2427 != 0) {
					Static105.anInt2427 = 0;
					Static52.aBoolean50 = true;
				}
				return true;
			}
			if (Static51.anInt1329 == 156) {
				Static36.aBoolean40 = true;
				local217 = Static62.aClass3_Sub7_Sub1_2.method638();
				local221 = Static62.aClass3_Sub7_Sub1_2.method602();
				if (local217 >= 0) {
					local294 = Static30.method666(local217);
				} else {
					local294 = null;
				}
				if (local217 < -70000) {
					local221 += 32768;
				}
				if (local294 != null) {
					for (local239 = 0; local239 < local294.anIntArray383.length; local239++) {
						local294.anIntArray383[local239] = 0;
						local294.anIntArray381[local239] = 0;
					}
				}
				Static97.method1630(local221);
				local239 = Static62.aClass3_Sub7_Sub1_2.method602();
				for (local307 = 0; local307 < local239; local307++) {
					local309 = Static62.aClass3_Sub7_Sub1_2.method612();
					if (local309 == 255) {
						local309 = Static62.aClass3_Sub7_Sub1_2.method606();
					}
					local1602 = Static62.aClass3_Sub7_Sub1_2.method617();
					if (local294 != null && local307 < local294.anIntArray383.length) {
						local294.anIntArray383[local307] = local1602;
						local294.anIntArray381[local307] = local309;
					}
					Static66.method1137(local309, local221, local307, local1602 - 1);
				}
				Static103.anInt2416 = Static27.anInt843;
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 136) {
				Static119.anInt457 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 2) {
				local137 = Static62.aClass3_Sub7_Sub1_2.method605();
				local221 = Static62.aClass3_Sub7_Sub1_2.method612();
				local150 = Static62.aClass3_Sub7_Sub1_2.method647();
				if (local221 >= 1 && local221 <= 5) {
					if (local137.method1274(Static122.aClass53_1411)) {
						local137 = null;
					}
					Static45.aClass53Array10[local221 - 1] = local137;
					Static66.aBooleanArray8[local221 - 1] = local150 == 0;
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 87) {
				local137 = Static62.aClass3_Sub7_Sub1_2.method605();
				@Pc(2264) boolean local2264;
				@Pc(2273) Class53 local2273;
				if (local137.method1290(Static97.aClass53_1108)) {
					local2273 = local137.method1267(local137.method1281(Static107.aClass53_1235), 0);
					local2264 = false;
					local1781 = local2273.method1286();
					for (local309 = 0; local309 < Static23.anInt737; local309++) {
						if (local1781 == Static39.aLongArray4[local309]) {
							local2264 = true;
							break;
						}
					}
					if (!local2264 && Static48.anInt1301 == 0) {
						Static73.method1234(4, local2273, Static79.aClass53_902);
					}
				} else if (local137.method1290(Static3.aClass53_18)) {
					local2264 = false;
					local2273 = local137.method1267(local137.method1281(Static107.aClass53_1235), 0);
					local1781 = local2273.method1286();
					for (local309 = 0; local309 < Static23.anInt737; local309++) {
						if (local1781 == Static39.aLongArray4[local309]) {
							local2264 = true;
							break;
						}
					}
					if (!local2264 && Static48.anInt1301 == 0) {
						Static73.method1234(8, local2273, Static27.aClass53_355);
					}
				} else if (local137.method1290(Static82.aClass53_381)) {
					local2273 = local137.method1267(local137.method1281(Static107.aClass53_1235), 0);
					local2264 = false;
					local1781 = local2273.method1286();
					for (local309 = 0; local309 < Static23.anInt737; local309++) {
						if (local1781 == Static39.aLongArray4[local309]) {
							local2264 = true;
							break;
						}
					}
					if (!local2264 && Static48.anInt1301 == 0) {
						@Pc(2377) Class53 local2377 = local137.method1267(local137.method1294() - 9, local137.method1281(Static107.aClass53_1235) + 1);
						Static73.method1234(8, local2273, local2377);
					}
				} else {
					Static73.method1234(0, Static35.aClass53_476, local137);
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 27) {
				Static70.aBoolean65 = false;
				for (local217 = 0; local217 < 5; local217++) {
					Static115.aBooleanArray17[local217] = false;
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 227) {
				Static15.anInt335 = Static62.aClass3_Sub7_Sub1_2.method647();
				if (Static15.anInt335 == 1) {
					Static79.anInt1982 = Static62.aClass3_Sub7_Sub1_2.method602();
				}
				if (Static15.anInt335 >= 2 && Static15.anInt335 <= 6) {
					if (Static15.anInt335 == 2) {
						Static18.anInt471 = 64;
						Static23.anInt738 = 64;
					}
					if (Static15.anInt335 == 3) {
						Static18.anInt471 = 0;
						Static23.anInt738 = 64;
					}
					if (Static15.anInt335 == 4) {
						Static23.anInt738 = 64;
						Static18.anInt471 = 128;
					}
					if (Static15.anInt335 == 5) {
						Static23.anInt738 = 0;
						Static18.anInt471 = 64;
					}
					if (Static15.anInt335 == 6) {
						Static18.anInt471 = 64;
						Static23.anInt738 = 128;
					}
					Static15.anInt335 = 2;
					Static119.anInt432 = Static62.aClass3_Sub7_Sub1_2.method602();
					Static73.anInt1833 = Static62.aClass3_Sub7_Sub1_2.method602();
					Static38.anInt1139 = Static62.aClass3_Sub7_Sub1_2.method647();
				}
				if (Static15.anInt335 == 10) {
					Static41.anInt1203 = Static62.aClass3_Sub7_Sub1_2.method602();
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 142) {
				anInt2345 = Static62.aClass3_Sub7_Sub1_2.method604();
				Static111.anInt2565 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 70) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method632();
				local221 = Static62.aClass3_Sub7_Sub1_2.method611();
				Static121.anIntArray408[local221] = local217;
				if (Static13.anIntArray31[local221] != local217) {
					Static13.anIntArray31[local221] = local217;
					Static54.method1953(local221);
					if (Static30.anInt1019 != -1) {
						Static52.aBoolean50 = true;
					}
					Static36.aBoolean40 = true;
				}
				Static51.anInt1329 = -1;
				Static44.anInt1240 = Static27.anInt843;
				return true;
			}
			if (Static51.anInt1329 == 75) {
				for (local217 = 0; local217 < Static13.anIntArray31.length; local217++) {
					if (Static13.anIntArray31[local217] != Static121.anIntArray408[local217]) {
						Static13.anIntArray31[local217] = Static121.anIntArray408[local217];
						Static54.method1953(local217);
						Static36.aBoolean40 = true;
					}
				}
				Static51.anInt1329 = -1;
				Static44.anInt1240 = Static27.anInt843;
				return true;
			}
			if (Static51.anInt1329 == 45) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method602();
				local221 = Static62.aClass3_Sub7_Sub1_2.method651();
				Static63.method1116(local221);
				if (local217 != -1) {
					Static63.method1116(local217);
				}
				if (Static111.anInt2556 != -1) {
					Static8.method131(Static111.anInt2556);
					Static111.anInt2556 = -1;
				}
				if (Static111.anInt2574 != -1) {
					Static8.method131(Static111.anInt2574);
					Static111.anInt2574 = -1;
				}
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static123.anInt2865 = -1;
				}
				if (local221 == Static123.anInt2858) {
					Static65.method1134(Static123.anInt2858);
				} else {
					Static8.method131(Static123.anInt2858);
					Static123.anInt2858 = local221;
					Static103.method1692(35);
				}
				if (Static54.anInt2856 == local221) {
					Static65.method1134(Static54.anInt2856);
				} else {
					Static8.method131(Static54.anInt2856);
					Static54.anInt2856 = local217;
				}
				Static41.anInt1206 = -1;
				Static105.anInt2427 = 0;
				Static31.method691(Static123.anInt2858);
				Static31.method691(Static54.anInt2856);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 201) {
				anInt2345 = Static62.aClass3_Sub7_Sub1_2.method652();
				Static111.anInt2565 = Static62.aClass3_Sub7_Sub1_2.method604();
				while (Static37.anInt2211 > Static62.aClass3_Sub7_Sub1_2.anInt964) {
					Static51.anInt1329 = Static62.aClass3_Sub7_Sub1_2.method647();
					Static48.method924();
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 29) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method647();
				local221 = Static62.aClass3_Sub7_Sub1_2.method647();
				local150 = Static62.aClass3_Sub7_Sub1_2.method647();
				local239 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static115.aBooleanArray17[local217] = true;
				Static4.anIntArray13[local217] = local221;
				Static79.anIntArray262[local217] = local150;
				Static59.anIntArray191[local217] = local239;
				Static8.anIntArray20[local217] = 0;
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 230) {
				local918 = Static62.aClass3_Sub7_Sub1_2.method607();
				@Pc(2833) Class53 local2833 = Static50.method1918(Static62.aClass3_Sub7_Sub1_2).method1284();
				Static73.method1234(6, Static106.method1712(local918).method1263(), local2833);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 35) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method632();
				local221 = Static62.aClass3_Sub7_Sub1_2.method600();
				local150 = Static62.aClass3_Sub7_Sub1_2.method617();
				if (local150 == 65535) {
					local150 = -1;
				}
				local1269 = (long) local150 + ((long) local217 << 32);
				@Pc(2879) Class3 local2879 = Static44.aClass77_6.method1805(local1269);
				if (local2879 != null) {
					local2879.method1962();
				}
				Static44.aClass77_6.method1810(new Class3_Sub8(local221), local1269);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 14) {
				if (Static22.anInt713 == 12) {
					Static36.aBoolean40 = true;
				}
				Static3.anInt72 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 199) {
				Static81.anInt2046 = Static62.aClass3_Sub7_Sub1_2.method604();
				Static51.anInt1329 = -1;
				if (Static81.anInt2046 == Static22.anInt713) {
					if (Static81.anInt2046 == 3) {
						Static22.anInt713 = 1;
					} else {
						Static22.anInt713 = 3;
					}
					Static36.aBoolean40 = true;
				}
				return true;
			}
			@Pc(2952) Class3_Sub1_Sub15 local2952;
			if (Static51.anInt1329 == 146) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method600();
				local2952 = Static30.method666(local217);
				local2952.anInt2700 = 3;
				local2952.anInt2721 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass34_1.method882();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 194) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method638();
				Static16.aClass22_3 = Static4.aClass6_1.method119(local217);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 224) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method632();
				local2952 = Static30.method666(local217);
				for (local150 = 0; local150 < local2952.anIntArray383.length; local150++) {
					local2952.anIntArray383[local150] = -1;
					local2952.anIntArray383[local150] = 0;
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 161) {
				Static68.anInt1720 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static9.anInt237 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static88.anInt2106 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static52.aBoolean50 = true;
				Static119.aBoolean25 = true;
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 18) {
				Static43.method867();
				Static51.anInt1329 = -1;
				return false;
			}
			if (Static51.anInt1329 == 215) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method602();
				local221 = Static62.aClass3_Sub7_Sub1_2.method647();
				local150 = Static62.aClass3_Sub7_Sub1_2.method602();
				Static124.method1966(local217, local221, local150);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 186 || Static51.anInt1329 == 103 || Static51.anInt1329 == 195 || Static51.anInt1329 == 51 || Static51.anInt1329 == 241 || Static51.anInt1329 == 6 || Static51.anInt1329 == 128 || Static51.anInt1329 == 149 || Static51.anInt1329 == 167 || Static51.anInt1329 == 178 || Static51.anInt1329 == 153) {
				Static48.method924();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 188) {
				@Pc(3141) boolean local3141 = Static62.aClass3_Sub7_Sub1_2.method647() == 1;
				local221 = Static62.aClass3_Sub7_Sub1_2.method632();
				local294 = Static30.method666(local221);
				local294.aBoolean113 = local3141;
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 223) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method638();
				local221 = Static62.aClass3_Sub7_Sub1_2.method649();
				local294 = Static30.method666(local217);
				Static51.anInt1329 = -1;
				if (local294.anInt2716 != local221 || local221 == -1) {
					local294.anInt2698 = 0;
					local294.anInt2716 = local221;
					local294.anInt2697 = 0;
				}
				return true;
			}
			if (Static51.anInt1329 == 171) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method617();
				local221 = Static62.aClass3_Sub7_Sub1_2.method651();
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static52.aBoolean50 = true;
					Static123.anInt2865 = -1;
				}
				if (Static123.anInt2858 != -1) {
					Static8.method131(Static123.anInt2858);
					Static123.anInt2858 = -1;
					Static103.method1692(30);
				}
				if (Static54.anInt2856 != -1) {
					Static8.method131(Static54.anInt2856);
					Static54.anInt2856 = -1;
				}
				if (local217 == Static111.anInt2556) {
					Static65.method1134(Static111.anInt2556);
				} else {
					Static8.method131(Static111.anInt2556);
					Static111.anInt2556 = local217;
				}
				if (Static111.anInt2574 == local221) {
					Static65.method1134(Static111.anInt2574);
				} else {
					Static8.method131(Static111.anInt2574);
					Static111.anInt2574 = local221;
				}
				Static36.aBoolean40 = true;
				Static41.anInt1206 = -1;
				if (Static105.anInt2427 != 0) {
					Static52.aBoolean50 = true;
					Static105.anInt2427 = 0;
				}
				Static12.aBoolean18 = true;
				Static31.method691(Static111.anInt2556);
				Static31.method691(Static111.anInt2574);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 254) {
				Static23.anInt737 = Static37.anInt2211 / 8;
				for (local217 = 0; local217 < Static23.anInt737; local217++) {
					Static39.aLongArray4[local217] = Static62.aClass3_Sub7_Sub1_2.method607();
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 141) {
				@Pc(3323) byte local3323 = Static62.aClass3_Sub7_Sub1_2.method599();
				local221 = Static62.aClass3_Sub7_Sub1_2.method617();
				Static121.anIntArray408[local221] = local3323;
				if (Static13.anIntArray31[local221] != local3323) {
					Static13.anIntArray31[local221] = local3323;
					Static54.method1953(local221);
					Static36.aBoolean40 = true;
					if (Static30.anInt1019 != -1) {
						Static52.aBoolean50 = true;
					}
				}
				Static44.anInt1240 = Static27.anInt843;
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 91) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method649();
				if (local217 >= 0) {
					Static63.method1116(local217);
				}
				if (local217 != Static96.anInt1464) {
					Static8.method131(Static96.anInt1464);
					Static96.anInt1464 = local217;
				}
				Static31.method691(Static96.anInt1464);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 99) {
				for (local217 = 0; local217 < Static81.anInt2047; local217++) {
					@Pc(3404) Class3_Sub1_Sub17 local3404 = Static23.method404(local217);
					if (local3404 != null && local3404.anInt2860 == 0) {
						Static121.anIntArray408[local217] = 0;
						Static13.anIntArray31[local217] = 0;
					}
				}
				Static51.anInt1329 = -1;
				if (Static30.anInt1019 != -1) {
					Static52.aBoolean50 = true;
				}
				Static36.aBoolean40 = true;
				Static44.anInt1240 = Static27.anInt843;
				return true;
			}
			if (Static51.anInt1329 == 81) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method611();
				Static63.method1116(local217);
				if (Static111.anInt2574 != -1) {
					Static8.method131(Static111.anInt2574);
					Static12.aBoolean18 = true;
					Static36.aBoolean40 = true;
					Static111.anInt2574 = -1;
				}
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static52.aBoolean50 = true;
					Static123.anInt2865 = -1;
				}
				if (Static123.anInt2858 != -1) {
					Static8.method131(Static123.anInt2858);
					Static123.anInt2858 = -1;
					Static103.method1692(30);
				}
				if (Static54.anInt2856 != -1) {
					Static8.method131(Static54.anInt2856);
					Static54.anInt2856 = -1;
				}
				if (Static111.anInt2556 == local217) {
					Static65.method1134(Static111.anInt2556);
				} else {
					Static8.method131(Static111.anInt2556);
					Static111.anInt2556 = local217;
				}
				if (Static105.anInt2427 != 0) {
					Static105.anInt2427 = 0;
					Static52.aBoolean50 = true;
				}
				Static41.anInt1206 = -1;
				Static31.method691(Static111.anInt2556);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 127) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method611();
				local221 = Static62.aClass3_Sub7_Sub1_2.method606();
				local294 = Static30.method666(local221);
				if (local294 != null && local294.anInt2707 == 0) {
					if (local217 > local294.anInt2669 - local294.anInt2703) {
						local217 = local294.anInt2669 - local294.anInt2703;
					}
					if (local217 < 0) {
						local217 = 0;
					}
					local294.anInt2724 = local217;
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 240) {
				Static20.method375();
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 74) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method604();
				local221 = Static62.aClass3_Sub7_Sub1_2.method652();
				local150 = Static62.aClass3_Sub7_Sub1_2.method612();
				Static72.anInt1813 = local217 >> 1;
				Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.method1032(local150, (local217 & 0x1) == 1, local221);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 67) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method602();
				if (local217 == 65535) {
					local217 = -1;
				}
				method1645(local217);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 209) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method603();
				local221 = Static62.aClass3_Sub7_Sub1_2.method602();
				if (local221 == 65535) {
					local221 = -1;
				}
				Static29.method663(local217, local221);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 38) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method602();
				local221 = Static62.aClass3_Sub7_Sub1_2.method617();
				local150 = Static62.aClass3_Sub7_Sub1_2.method638();
				local239 = Static62.aClass3_Sub7_Sub1_2.method611();
				@Pc(3697) Class3_Sub1_Sub15 local3697 = Static30.method666(local150);
				local3697.anInt2723 = local239;
				local3697.anInt2690 = local217;
				Static51.anInt1329 = -1;
				local3697.anInt2717 = local221;
				return true;
			}
			if (Static51.anInt1329 == 235) {
				local217 = Static62.aClass3_Sub7_Sub1_2.method611();
				if (local217 == 65535) {
					local217 = -1;
				}
				local221 = Static62.aClass3_Sub7_Sub1_2.method604();
				if (Static60.anIntArray194[local221] == local217) {
					Static65.method1134(Static60.anIntArray194[local221]);
				} else {
					Static8.method131(Static60.anIntArray194[local221]);
					Static60.anIntArray194[local221] = local217;
				}
				Static12.aBoolean18 = true;
				Static36.aBoolean40 = true;
				Static31.method691(Static60.anIntArray194[local221]);
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 42) {
				Static44.anInt1256 = Static62.aClass3_Sub7_Sub1_2.method647();
				Static36.aBoolean40 = true;
				Static51.anInt1329 = -1;
				Static44.anInt1240 = Static27.anInt843;
				return true;
			}
			if (Static51.anInt1329 == 19) {
				for (local217 = 0; local217 < Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1.length; local217++) {
					if (Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local217] != null) {
						Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local217].anInt1442 = -1;
					}
				}
				for (local221 = 0; local221 < Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1.length; local221++) {
					if (Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local221] != null) {
						Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local221].anInt1442 = -1;
					}
				}
				Static51.anInt1329 = -1;
				return true;
			}
			if (Static51.anInt1329 == 41) {
				if (Static123.anInt2865 != -1) {
					Static8.method131(Static123.anInt2865);
					Static123.anInt2865 = -1;
				}
				Static35.aClass53_479 = Static35.aClass53_476;
				Static51.anInt1329 = -1;
				Static105.anInt2427 = 1;
				Static68.aBoolean62 = false;
				Static52.aBoolean50 = true;
				return true;
			}
			Static10.method172("T1 - " + Static51.anInt1329 + "," + Static56.anInt1493 + "," + Static52.anInt1342 + " - " + Static37.anInt2211, null);
			Static43.method867();
		} catch (@Pc(3875) IOException local3875) {
			Static113.method1804();
		} catch (@Pc(3879) Exception local3879) {
			@Pc(3920) String local3920 = "T2 - " + Static51.anInt1329 + "," + Static56.anInt1493 + "," + Static52.anInt1342 + " - " + Static37.anInt2211 + "," + (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0] + Static80.anInt2029) + "," + (Static4.anInt145 + Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]) + " - ";
			for (local221 = 0; local221 < Static37.anInt2211 && local221 < 50; local221++) {
				local3920 = local3920 + Static62.aClass3_Sub7_Sub1_2.aByteArray15[local221] + ",";
			}
			Static10.method172(local3920, local3879);
			Static43.method867();
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIIII)Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 method1641(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg2 << 38) + ((long) arg4 << 16) + (long) arg1 + ((long) arg3 << 40);
		@Pc(31) Class3_Sub1_Sub5_Sub4 local31;
		if (!arg0) {
			local31 = (Class3_Sub1_Sub5_Sub4) Static95.aClass75_62.method1728(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(41) Class3_Sub1_Sub8 local41 = Static2.method38(arg1);
		if (arg4 > 1 && local41.anIntArray198 != null) {
			@Pc(51) int local51 = -1;
			for (@Pc(53) int local53 = 0; local53 < 10; local53++) {
				if (local41.anIntArray197[local53] <= arg4 && local41.anIntArray197[local53] != 0) {
					local51 = local41.anIntArray198[local53];
				}
			}
			if (local51 != -1) {
				local41 = Static2.method38(local51);
			}
		}
		@Pc(87) Class3_Sub1_Sub4_Sub7 local87 = local41.method1103(1);
		if (local87 == null) {
			return null;
		}
		@Pc(93) Class3_Sub1_Sub5_Sub4 local93 = null;
		if (local41.anInt1608 != -1) {
			local93 = method1641(true, local41.anInt1584, 1, 0, 10);
			if (local93 == null) {
				return null;
			}
		}
		@Pc(112) int local112 = Static84.anInt1934;
		@Pc(114) int[] local114 = Static84.anIntArray256;
		@Pc(116) int local116 = Static84.anInt1935;
		@Pc(118) int local118 = Static84.anInt1933;
		@Pc(120) int local120 = Static84.anInt1937;
		@Pc(122) int local122 = Static84.anInt1936;
		@Pc(124) int local124 = Static84.anInt1932;
		@Pc(126) int[] local126 = Static24.method464();
		@Pc(128) int local128 = Static24.anInt780;
		@Pc(130) int local130 = Static24.anInt784;
		local31 = new Class3_Sub1_Sub5_Sub4(36, 32);
		Static84.method1312(local31.anIntArray257, 36, 32);
		Static90.anIntArray277 = Static24.method475(Static90.anIntArray277);
		Static84.method1316(0, 0, 36, 32, 0);
		Static24.aBoolean31 = false;
		Static24.method461(16, 16);
		@Pc(158) int local158 = local41.anInt1598;
		if (arg0) {
			local158 = (int) ((double) local158 * 1.5D);
		} else if (arg2 == 2) {
			local158 = (int) ((double) local158 * 1.04D);
		}
		@Pc(186) int local186 = Class3_Sub1_Sub5_Sub1.anIntArray84[local41.anInt1603] * local158 >> 16;
		@Pc(195) int local195 = local158 * Class3_Sub1_Sub5_Sub1.anIntArray86[local41.anInt1603] >> 16;
		local87.method1761();
		local87.method1766(local41.anInt1577, local41.anInt1596, local41.anInt1603, local41.anInt1591, local87.anInt2525 / 2 + local195 + local41.anInt1604, local186 - -local41.anInt1604);
		if (arg2 >= 1) {
			local31.method1338(1);
		}
		if (arg2 >= 2) {
			local31.method1338(16777215);
		}
		if (arg3 != 0) {
			local31.method1344(arg3);
		}
		Static84.method1312(local31.anIntArray257, 36, 32);
		if (local41.anInt1608 != -1) {
			local93.method1347(0, 0);
		}
		if (!arg0 && (local41.anInt1587 == 1 || arg4 != 1) && arg4 != -1) {
			Static60.aClass3_Sub1_Sub5_Sub2_2.method746(Static54.method1951(arg4), 1, 10, 1);
			Static60.aClass3_Sub1_Sub5_Sub2_2.method746(Static54.method1951(arg4), 0, 9, 16776960);
		}
		if (!arg0) {
			Static95.aClass75_62.method1730(local31, local23);
		}
		Static84.method1312(local114, local112, local118);
		Static84.method1317(local116, local122, local120, local124);
		Static24.method475(local126);
		Static24.anInt784 = local130;
		Static24.anInt780 = local128;
		Static24.method473();
		Static24.aBoolean31 = true;
		return local31;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public static void method1642() {
		try {
			@Pc(6) Graphics local6 = Static87.aCanvas1.getGraphics();
			Static111.aClass27_39.method1536(4, local6, 0);
			Static54.aClass27_48.method1536(357, local6, 0);
			Static111.aClass27_40.method1536(4, local6, 722);
			Static75.aClass27_30.method1536(205, local6, 743);
			Static62.aClass27_24.method1536(0, local6, 0);
			Static58.aClass27_21.method1536(4, local6, 516);
			Static114.aClass27_41.method1536(205, local6, 516);
			Static68.aClass27_27.method1536(357, local6, 496);
			Static27.aClass27_13.method1536(338, local6, 0);
		} catch (@Pc(70) Exception local70) {
			Static87.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1643() {
		Static25.aClass75_20.method1724();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ad;ZII)V")
	public static void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static36.anInt1122 >= 400) {
			return;
		}
		if (arg1.anIntArray11 != null) {
			arg1 = arg1.method77();
		}
		if (arg1 == null || !arg1.aBoolean6) {
			return;
		}
		@Pc(26) Class53 local26 = arg1.aClass53_50;
		if (arg1.anInt131 != 0) {
			local26 = Static103.method1689(new Class53[] { local26, Static21.method384(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1489, arg1.anInt131), Static22.aClass53_272, Static76.aClass53_846, Static108.method1725(arg1.anInt131), Static46.aClass53_1436 });
		}
		if (Static91.anInt2201 == 1) {
			Static59.method1075(51, Static94.aClass53_1084, Static103.method1689(new Class53[] { Static5.aClass53_81, Static124.aClass53_1445, local26 }), arg0, arg3, arg2);
		} else if (!Static117.aBoolean119) {
			@Pc(117) Class53[] local117 = arg1.aClass53Array1;
			if (Static120.aBoolean126) {
				local117 = Static53.method1447(local117);
			}
			@Pc(127) int local127;
			if (local117 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local117[local127] != null && !local117[local127].method1274(aClass53_1140)) {
						@Pc(142) byte local142 = 0;
						if (local127 == 0) {
							local142 = 28;
						}
						if (local127 == 1) {
							local142 = 8;
						}
						if (local127 == 2) {
							local142 = 34;
						}
						if (local127 == 3) {
							local142 = 16;
						}
						if (local127 == 4) {
							local142 = 56;
						}
						Static59.method1075(local142, local117[local127], Static103.method1689(new Class53[] { Static66.aClass53_746, local26 }), arg0, arg3, arg2);
					}
				}
			}
			if (local117 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local117[local127] != null && local117[local127].method1274(aClass53_1140)) {
						@Pc(225) short local225 = 0;
						@Pc(227) int local227 = 0;
						if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1489 < arg1.anInt131) {
							local225 = 2000;
						}
						if (local127 == 0) {
							local227 = local225 + 28;
						}
						if (local127 == 1) {
							local227 = local225 + 8;
						}
						if (local127 == 2) {
							local227 = local225 + 34;
						}
						if (local127 == 3) {
							local227 = local225 + 16;
						}
						if (local127 == 4) {
							local227 = local225 + 56;
						}
						Static59.method1075(local227, local117[local127], Static103.method1689(new Class53[] { Static66.aClass53_746, local26 }), arg0, arg3, arg2);
					}
				}
			}
			Static59.method1075(1006, Static115.aClass53_1316, Static103.method1689(new Class53[] { Static66.aClass53_746, local26 }), arg0, arg3, arg2);
		} else if ((Static104.anInt2535 & 0x2) == 2) {
			Static59.method1075(2, Static57.aClass53_672, Static103.method1689(new Class53[] { Static102.aClass53_1162, Static124.aClass53_1445, local26 }), arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method1645(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static58.aBoolean56) {
			Static86.method1440();
		} else if (arg0 != -1 && arg0 != Static27.anInt856 && Static96.anInt1448 != 0 && !Static58.aBoolean56) {
			Static9.method143(0, Static96.anInt1448, arg0, Static109.aClass62_Sub1_17);
		}
		Static27.anInt856 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	public static void method1646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) ((arg1 << 16) + arg0);
		@Pc(21) Class3_Sub1_Sub12 local21 = (Class3_Sub1_Sub12) Static56.aClass77_7.method1805(local15);
		if (local21 != null) {
			Static35.aClass41_1.method1073(local21);
		}
	}
}
