import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_44;

	@OriginalMember(owner = "client!qd", name = "V", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array10;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1190 = Static108.method1915("logo");

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lclient!ta;")
	public static Class70 aClass70_9 = new Class70(4096);

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1191 = Static108.method1915("mod_icons");

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1192 = Static108.method1915("Hierhin gehen");

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "Lclient!tc;")
	public static Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1193 = Static108.method1915("Fps:");

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
	public static int anInt2390 = 1;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
	public static int anInt2391 = 0;

	@OriginalMember(owner = "client!qd", name = "mb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1194 = Static108.method1915("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!qd", name = "nb", descriptor = "[I")
	public static int[] anIntArray361 = new int[2000];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!kd;)Z")
	public static boolean method1718(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static12.anInt502; local11++) {
			if (arg0.method1158(Static117.aClass39Array29[local11])) {
				return true;
			}
		}
		return arg0.method1158(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass39_1234);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLclient!a;)Z")
	public static boolean method1719(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		if (arg0.anIntArray17 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray17.length; local19++) {
			@Pc(26) int local26 = Static126.method2117(local19, arg0);
			@Pc(31) int local31 = arg0.anIntArray15[local19];
			if (arg0.anIntArray17[local19] == 2) {
				if (local26 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray17[local19] == 3) {
				if (local31 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray17[local19] == 4) {
				if (local31 == local26) {
					return false;
				}
			} else if (local26 != local31) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)V")
	public static void method1720() {
		Static49.anInt1364 = 2;
		Static90.aClass62_26 = null;
		Static13.aBoolean48 = false;
		Static29.anInt972 = -1;
		Static35.anInt1070 = -1;
		Static25.anInt837 = 1;
		Static121.anInt2969 = 0;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method1721() {
		aClass70_9 = null;
		aClass1_Sub1_Sub4_Sub4Array10 = null;
		aBigInteger2 = null;
		aClass39_1191 = null;
		aClass39_1193 = null;
		aClass39_1194 = null;
		anIntArray361 = null;
		aClass39_1190 = null;
		aClass39_1192 = null;
		aClass1_Sub1_Sub4_Sub1_44 = null;
		aClass71_1 = null;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
	public static void method1723(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static100.anIntArray390[arg0];
		@Pc(19) int local19 = Static67.anIntArray250[arg0];
		@Pc(23) int local23 = Static66.anIntArray246[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(31) int local31 = Static12.anIntArray90[arg0];
		if (Static2.anInt133 != 0 && local23 != 1002) {
			Static113.aBoolean226 = true;
			Static2.anInt133 = 0;
		}
		if (local23 == 23) {
			Static56.method1007(local15, local31, local19);
		}
		if (local23 == 32) {
			Static18.method358(local31, local19, local15);
			Static103.aClass1_Sub18_Sub1_5.method2203(130);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static103.anInt2610 + local19);
			Static103.aClass1_Sub18_Sub1_5.method2148(local31 >> 14 & 0x7FFF);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static71.anInt1795 + local15);
		}
		if (local23 == 7) {
			Static103.aClass1_Sub18_Sub1_5.method2203(196);
			Static103.aClass1_Sub18_Sub1_5.method2138(local19);
			Static103.aClass1_Sub18_Sub1_5.method2148(local31);
			Static103.aClass1_Sub18_Sub1_5.method2159(local15);
			Static79.anInt2480 = local19;
			Static62.anInt2923 = 0;
			Static91.anInt2127 = 2;
			Static113.anInt2825 = local15;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 6 && Static18.method358(local31, local19, local15)) {
			Static103.aClass1_Sub18_Sub1_5.method2203(178);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static52.anInt1456);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static40.anInt1170);
			Static103.aClass1_Sub18_Sub1_5.method2144(Static62.anInt2928);
			Static103.aClass1_Sub18_Sub1_5.method2140(local31 >> 14 & 0x7FFF);
			Static103.aClass1_Sub18_Sub1_5.method2159(Static103.anInt2610 + local19);
			Static103.aClass1_Sub18_Sub1_5.method2140(local15 + Static71.anInt1795);
		}
		@Pc(212) Class1_Sub1_Sub2_Sub1_Sub1 local212;
		if (local23 == 1004) {
			Static77.anInt1930 = 2;
			Static95.anInt2879 = 0;
			Static66.anInt1726 = Static38.anInt1157;
			Static104.anInt2644 = Static89.anInt2109;
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				@Pc(217) Class1_Sub1_Sub5 local217 = local212.aClass1_Sub1_Sub5_1;
				if (local217.anIntArray130 != null) {
					local217 = local217.method514();
				}
				if (local217 != null) {
					Static103.aClass1_Sub18_Sub1_5.method2203(46);
					Static103.aClass1_Sub18_Sub1_5.method2140(local217.anInt903);
				}
			}
		}
		if (local23 == 27) {
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local212.anIntArray389[0], local212.anIntArray387[0], 0, 1, false);
				Static77.anInt1930 = 2;
				Static104.anInt2644 = Static89.anInt2109;
				Static95.anInt2879 = 0;
				Static66.anInt1726 = Static38.anInt1157;
				Static103.aClass1_Sub18_Sub1_5.method2203(32);
				Static103.aClass1_Sub18_Sub1_5.method2148(local31);
			}
		}
		if (local23 == 4) {
			Static103.aClass1_Sub18_Sub1_5.method2203(21);
			Static103.aClass1_Sub18_Sub1_5.method2140(local15);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			Static103.aClass1_Sub18_Sub1_5.method2148(local31);
			Static113.anInt2825 = local15;
			Static91.anInt2127 = 2;
			if (Static48.anInt1318 == local19 >> 16) {
				Static91.anInt2127 = 1;
			}
			Static62.anInt2923 = 0;
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
			Static79.anInt2480 = local19;
		}
		@Pc(382) long local382;
		@Pc(371) int local371;
		@Pc(358) Class39 local358;
		@Pc(365) int local365;
		if (local23 == 29) {
			local358 = Static50.aClass39Array13[arg0];
			local365 = local358.method1166(Static20.aClass39_352);
			if (local365 != -1) {
				local371 = -1;
				local382 = local358.method1181(local365 + 12).method1183().method1186();
				for (@Pc(384) int local384 = 0; local384 < Static12.anInt502; local384++) {
					if (local382 == Static45.aLongArray3[local384]) {
						local371 = local384;
						break;
					}
				}
				if (local371 != -1 && Static14.anIntArray93[local371] > 0) {
					Static113.aBoolean226 = true;
					Static64.anInt1672 = 3;
					Static90.aBoolean179 = true;
					Static2.anInt133 = 0;
					Static8.aClass39_148 = Static8.aClass39_147;
					Static62.aLong96 = Static45.aLongArray3[local371];
					Static8.aClass39_155 = Static30.method601(new Class39[] { Static92.aClass39_1107, Static117.aClass39Array29[local371] });
				}
			}
		}
		@Pc(445) Class1_Sub1_Sub2_Sub1_Sub2 local445;
		if (local23 == 13) {
			local445 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local31];
			if (local445 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local445.anIntArray389[0], local445.anIntArray387[0], 0, 1, false);
				Static104.anInt2644 = Static89.anInt2109;
				Static66.anInt1726 = Static38.anInt1157;
				Static77.anInt1930 = 2;
				Static95.anInt2879 = 0;
				Static103.aClass1_Sub18_Sub1_5.method2203(57);
				Static103.aClass1_Sub18_Sub1_5.method2140(local31);
			}
		}
		if (local23 == 38) {
			Static103.aClass1_Sub18_Sub1_5.method2203(41);
			Static103.aClass1_Sub18_Sub1_5.method2140(local15);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			Static103.aClass1_Sub18_Sub1_5.method2159(local31);
			Static62.anInt2923 = 0;
			Static91.anInt2127 = 2;
			if (Static48.anInt1318 == local19 >> 16) {
				Static91.anInt2127 = 1;
			}
			if (local19 >> 16 == Static110.anInt2786) {
				Static91.anInt2127 = 3;
			}
			Static79.anInt2480 = local19;
			Static113.anInt2825 = local15;
		}
		if (local23 == 19) {
			Static25.method458();
			Static40.anInt1170 = local31;
			Static89.anInt2107 = 1;
			Static52.anInt1456 = local15;
			Static62.anInt2928 = local19;
			Static35.aBoolean96 = true;
			Static4.aClass39_66 = Static30.method601(new Class39[] { Static112.aClass39_1346, Static8.method224(local31).aClass39_1321, Static20.aClass39_352 });
			if (Static4.aClass39_66 == null) {
				Static4.aClass39_66 = Static16.aClass39_1218;
			}
			return;
		}
		if (local23 == 28) {
			local445 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local31];
			if (local445 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local445.anIntArray389[0], local445.anIntArray387[0], 0, 1, false);
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static95.anInt2879 = 0;
				Static66.anInt1726 = Static38.anInt1157;
				Static103.aClass1_Sub18_Sub1_5.method2203(60);
				Static103.aClass1_Sub18_Sub1_5.method2163(Static62.anInt2928);
				Static103.aClass1_Sub18_Sub1_5.method2148(Static40.anInt1170);
				Static103.aClass1_Sub18_Sub1_5.method2148(Static52.anInt1456);
				Static103.aClass1_Sub18_Sub1_5.method2159(local31);
			}
		}
		@Pc(666) Class1_Sub1_Sub1 local666;
		if (local23 == 57) {
			@Pc(662) boolean local662 = true;
			local666 = Static41.method2106(local19);
			if (local666.anInt93 > 0) {
				local662 = Static63.method1136(local666);
			}
			if (local662) {
				Static103.aClass1_Sub18_Sub1_5.method2203(67);
				Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			}
		}
		if (local23 == 3) {
			local445 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local31];
			if (local445 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local445.anIntArray389[0], local445.anIntArray387[0], 0, 1, false);
				Static66.anInt1726 = Static38.anInt1157;
				Static95.anInt2879 = 0;
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static103.aClass1_Sub18_Sub1_5.method2203(136);
				Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			}
		}
		@Pc(769) boolean local769;
		if (local23 == 10) {
			local769 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 0, false);
			if (!local769) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 1, false);
			}
			Static66.anInt1726 = Static38.anInt1157;
			Static95.anInt2879 = 0;
			Static104.anInt2644 = Static89.anInt2109;
			Static77.anInt1930 = 2;
			Static103.aClass1_Sub18_Sub1_5.method2203(186);
			Static103.aClass1_Sub18_Sub1_5.method2140(local15 + Static71.anInt1795);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static103.aClass1_Sub18_Sub1_5.method2148(local19 + Static103.anInt2610);
		}
		if (local23 == 5) {
			Static103.aClass1_Sub18_Sub1_5.method2203(67);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			local666 = Static41.method2106(local19);
			if (local666.anIntArrayArray1 != null && local666.anIntArrayArray1[0][0] == 5) {
				local365 = local666.anIntArrayArray1[0][1];
				if (Static44.anIntArray175[local365] != local666.anIntArray15[0]) {
					Static44.anIntArray175[local365] = local666.anIntArray15[0];
					Static24.method454(local365);
					Static35.aBoolean96 = true;
				}
			}
		}
		if (local23 == 48) {
			if (Static13.aBoolean47) {
				Static32.aClass5_2.method111(Static9.anInt2983, local15 - 4, local19 - 4);
			} else {
				Static32.aClass5_2.method111(Static9.anInt2983, Static89.anInt2109 - 4, Static38.anInt1157 + -4);
			}
		}
		if (local23 == 36) {
			local445 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local31];
			if (local445 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local445.anIntArray389[0], local445.anIntArray387[0], 0, 1, false);
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static66.anInt1726 = Static38.anInt1157;
				Static95.anInt2879 = 0;
				Static103.aClass1_Sub18_Sub1_5.method2203(6);
				Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			}
		}
		if (local23 == 43) {
			local769 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 0, false);
			if (!local769) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 1, false);
			}
			Static104.anInt2644 = Static89.anInt2109;
			Static77.anInt1930 = 2;
			Static95.anInt2879 = 0;
			Static66.anInt1726 = Static38.anInt1157;
			Static103.aClass1_Sub18_Sub1_5.method2203(83);
			Static103.aClass1_Sub18_Sub1_5.method2140(local31);
			Static103.aClass1_Sub18_Sub1_5.method2148(Static71.anInt1795 + local15);
			Static103.aClass1_Sub18_Sub1_5.method2159(local19 + Static103.anInt2610);
			Static103.aClass1_Sub18_Sub1_5.method2163(Static123.anInt2998);
			Static103.aClass1_Sub18_Sub1_5.method2140(Static76.anInt1918);
		}
		if (local23 == 1) {
			Static103.aClass1_Sub18_Sub1_5.method2203(99);
			Static103.aClass1_Sub18_Sub1_5.method2148(local15);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static91.anInt2127 = 2;
			Static79.anInt2480 = local19;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			Static62.anInt2923 = 0;
			if (local19 >> 16 == Static110.anInt2786) {
				Static91.anInt2127 = 3;
			}
			Static113.anInt2825 = local15;
		}
		if (local23 == 24) {
			Static103.aClass1_Sub18_Sub1_5.method2203(149);
			Static103.aClass1_Sub18_Sub1_5.method2140(local31);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			Static103.aClass1_Sub18_Sub1_5.method2159(local15);
			Static91.anInt2127 = 2;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
			Static79.anInt2480 = local19;
			Static62.anInt2923 = 0;
			Static113.anInt2825 = local15;
		}
		if (local23 == 1006) {
			Static18.method358(local31, local19, local15);
			Static103.aClass1_Sub18_Sub1_5.method2203(233);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31 >> 14 & 0x7FFF);
			Static103.aClass1_Sub18_Sub1_5.method2177(local19 + Static103.anInt2610);
			Static103.aClass1_Sub18_Sub1_5.method2177(local15 + Static71.anInt1795);
		}
		if (local23 == 11) {
			local769 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 0, false);
			if (!local769) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 1, false);
			}
			Static104.anInt2644 = Static89.anInt2109;
			Static77.anInt1930 = 2;
			Static66.anInt1726 = Static38.anInt1157;
			Static95.anInt2879 = 0;
			Static103.aClass1_Sub18_Sub1_5.method2203(193);
			Static103.aClass1_Sub18_Sub1_5.method2140(local19 + Static103.anInt2610);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static71.anInt1795 + local15);
			Static103.aClass1_Sub18_Sub1_5.method2140(local31);
		}
		if (local23 == 41) {
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local212.anIntArray389[0], local212.anIntArray387[0], 0, 1, false);
				Static95.anInt2879 = 0;
				Static66.anInt1726 = Static38.anInt1157;
				Static77.anInt1930 = 2;
				Static104.anInt2644 = Static89.anInt2109;
				Static103.aClass1_Sub18_Sub1_5.method2203(94);
				Static103.aClass1_Sub18_Sub1_5.method2148(local31);
				Static103.aClass1_Sub18_Sub1_5.method2177(Static76.anInt1918);
				Static103.aClass1_Sub18_Sub1_5.method2149(Static123.anInt2998);
			}
		}
		if (local23 == 26 || local23 == 33) {
			local358 = Static50.aClass39Array13[arg0];
			local365 = local358.method1166(Static20.aClass39_352);
			if (local365 != -1) {
				local358 = local358.method1181(local365 + 12).method1183();
				@Pc(1376) Class39 local1376 = local358.method1152().method1153();
				@Pc(1378) boolean local1378 = false;
				for (local371 = 0; local371 < Static57.anInt1547; local371++) {
					@Pc(1388) Class1_Sub1_Sub2_Sub1_Sub2 local1388 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static12.anIntArray91[local371]];
					if (local1388 != null && local1388.aClass39_1234 != null && local1388.aClass39_1234.method1158(local1376)) {
						Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local1388.anIntArray389[0], local1388.anIntArray387[0], 0, 1, false);
						if (local23 == 26) {
							Static103.aClass1_Sub18_Sub1_5.method2203(136);
							Static103.aClass1_Sub18_Sub1_5.method2177(Static12.anIntArray91[local371]);
						}
						if (local23 == 33) {
							Static103.aClass1_Sub18_Sub1_5.method2203(139);
							Static103.aClass1_Sub18_Sub1_5.method2140(Static12.anIntArray91[local371]);
						}
						local1378 = true;
						break;
					}
				}
				if (!local1378) {
					Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { Static108.aClass39_1322, local1376 }), 0);
				}
			}
		}
		if (local23 == 1005) {
			local666 = Static41.method2106(local19);
			if (local666 == null || local666.anIntArray14[local15] < 100000) {
				Static103.aClass1_Sub18_Sub1_5.method2203(33);
				Static103.aClass1_Sub18_Sub1_5.method2148(local31);
			} else {
				Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { Static69.method1226(local666.anIntArray14[local15]), Static53.aClass39_704, Static8.method224(local31).aClass39_1321 }), 0);
			}
			Static91.anInt2127 = 2;
			Static79.anInt2480 = local19;
			Static62.anInt2923 = 0;
			Static113.anInt2825 = local15;
			if (Static48.anInt1318 == local19 >> 16) {
				Static91.anInt2127 = 1;
			}
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 40) {
			Static103.aClass1_Sub18_Sub1_5.method2203(43);
			Static103.aClass1_Sub18_Sub1_5.method2177(local15);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static103.aClass1_Sub18_Sub1_5.method2148(Static40.anInt1170);
			Static103.aClass1_Sub18_Sub1_5.method2163(local19);
			Static103.aClass1_Sub18_Sub1_5.method2138(Static62.anInt2928);
			Static103.aClass1_Sub18_Sub1_5.method2159(Static52.anInt1456);
			Static79.anInt2480 = local19;
			Static62.anInt2923 = 0;
			Static113.anInt2825 = local15;
			Static91.anInt2127 = 2;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 14) {
			Static18.method358(local31, local19, local15);
			Static103.aClass1_Sub18_Sub1_5.method2203(185);
			Static103.aClass1_Sub18_Sub1_5.method2159(local31 >> 14 & 0x7FFF);
			Static103.aClass1_Sub18_Sub1_5.method2159(local15 + Static71.anInt1795);
			Static103.aClass1_Sub18_Sub1_5.method2177(local19 + Static103.anInt2610);
		}
		if (local23 == 22) {
			Static103.aClass1_Sub18_Sub1_5.method2203(102);
			Static103.aClass1_Sub18_Sub1_5.method2140(local31);
			Static103.aClass1_Sub18_Sub1_5.method2140(local15);
			Static103.aClass1_Sub18_Sub1_5.method2138(local19);
			Static113.anInt2825 = local15;
			Static62.anInt2923 = 0;
			Static91.anInt2127 = 2;
			Static79.anInt2480 = local19;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 47) {
			Static18.method358(local31, local19, local15);
			Static103.aClass1_Sub18_Sub1_5.method2203(183);
			Static103.aClass1_Sub18_Sub1_5.method2148(Static103.anInt2610 + local19);
			Static103.aClass1_Sub18_Sub1_5.method2148(local31 >> 14 & 0x7FFF);
			Static103.aClass1_Sub18_Sub1_5.method2159(Static71.anInt1795 + local15);
		}
		if (local23 == 8) {
			local358 = Static50.aClass39Array13[arg0];
			local365 = local358.method1166(Static20.aClass39_352);
			if (local365 != -1) {
				if (Static48.anInt1318 == -1) {
					Static20.method408();
					if (Static76.anInt1913 != -1) {
						Static8.aClass39_152 = local358.method1181(local365 + 12).method1183();
						Static46.aBoolean221 = false;
						Static52.anInt1457 = Static48.anInt1318 = Static76.anInt1913;
					}
				} else {
					Static66.method1189(Static8.aClass39_147, Static103.aClass39_1270, 0);
					if (Static23.aClass39_402 != null) {
						Static66.method1189(Static8.aClass39_147, Static23.aClass39_402, 0);
					}
				}
			}
		}
		if (local23 == 45) {
			local445 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local31];
			if (local445 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local445.anIntArray389[0], local445.anIntArray387[0], 0, 1, false);
				Static66.anInt1726 = Static38.anInt1157;
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static95.anInt2879 = 0;
				Static103.aClass1_Sub18_Sub1_5.method2203(121);
				Static103.aClass1_Sub18_Sub1_5.method2148(local31);
			}
		}
		if (local23 == 15) {
			Static103.aClass1_Sub18_Sub1_5.method2203(67);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			local666 = Static41.method2106(local19);
			if (local666.anIntArrayArray1 != null && local666.anIntArrayArray1[0][0] == 5) {
				local365 = local666.anIntArrayArray1[0][1];
				Static44.anIntArray175[local365] = 1 - Static44.anIntArray175[local365];
				Static24.method454(local365);
				Static35.aBoolean96 = true;
			}
		}
		if (local23 == 16) {
			local769 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 0, false);
			if (!local769) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 1, false);
			}
			Static77.anInt1930 = 2;
			Static66.anInt1726 = Static38.anInt1157;
			Static104.anInt2644 = Static89.anInt2109;
			Static95.anInt2879 = 0;
			Static103.aClass1_Sub18_Sub1_5.method2203(126);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static103.aClass1_Sub18_Sub1_5.method2177(local19 + Static103.anInt2610);
			Static103.aClass1_Sub18_Sub1_5.method2159(Static71.anInt1795 + local15);
		}
		if (local23 == 18) {
			Static103.aClass1_Sub18_Sub1_5.method2203(84);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			Static103.aClass1_Sub18_Sub1_5.method2159(local15);
			Static91.anInt2127 = 2;
			Static79.anInt2480 = local19;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			Static62.anInt2923 = 0;
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
			Static113.anInt2825 = local15;
		}
		if (local23 == 34) {
			Static103.aClass1_Sub18_Sub1_5.method2203(219);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static103.aClass1_Sub18_Sub1_5.method2177(local15);
			Static103.aClass1_Sub18_Sub1_5.method2163(local19);
			Static113.anInt2825 = local15;
			Static91.anInt2127 = 2;
			Static62.anInt2923 = 0;
			if (Static48.anInt1318 == local19 >> 16) {
				Static91.anInt2127 = 1;
			}
			Static79.anInt2480 = local19;
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 39) {
			Static18.method358(local31, local19, local15);
			Static103.aClass1_Sub18_Sub1_5.method2203(187);
			Static103.aClass1_Sub18_Sub1_5.method2148(local19 + Static103.anInt2610);
			Static103.aClass1_Sub18_Sub1_5.method2159(local31 >> 14 & 0x7FFF);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static71.anInt1795 + local15);
		}
		if (local23 == 1001) {
			Static77.anInt1930 = 2;
			Static95.anInt2879 = 0;
			Static104.anInt2644 = Static89.anInt2109;
			Static66.anInt1726 = Static38.anInt1157;
			Static103.aClass1_Sub18_Sub1_5.method2203(54);
			Static103.aClass1_Sub18_Sub1_5.method2140(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 1003) {
			Static66.anInt1726 = Static38.anInt1157;
			Static95.anInt2879 = 0;
			Static104.anInt2644 = Static89.anInt2109;
			Static77.anInt1930 = 2;
			Static103.aClass1_Sub18_Sub1_5.method2203(33);
			Static103.aClass1_Sub18_Sub1_5.method2148(local31);
		}
		if (local23 == 37) {
			Static103.aClass1_Sub18_Sub1_5.method2203(48);
			Static103.aClass1_Sub18_Sub1_5.method2144(local19);
			Static103.aClass1_Sub18_Sub1_5.method2159(local15);
			Static103.aClass1_Sub18_Sub1_5.method2159(local31);
			Static62.anInt2923 = 0;
			Static79.anInt2480 = local19;
			Static113.anInt2825 = local15;
			Static91.anInt2127 = 2;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 56) {
			local666 = Static32.method393(local19, local15);
			if (local666 != null) {
				Static25.method458();
				Static20.method409(Static54.method989(Static129.method2213(local666)), local15, local19);
				Static89.anInt2107 = 0;
				Static35.aBoolean96 = true;
				Static52.aClass39_695 = Static68.method1215(local666);
				if (Static52.aClass39_695 == null) {
					Static52.aClass39_695 = Static58.aClass39_760;
				}
				if (local666.aBoolean14) {
					Static103.aClass39_1273 = Static30.method601(new Class39[] { local666.aClass39_35, Static20.aClass39_352 });
				} else {
					Static103.aClass39_1273 = Static30.method601(new Class39[] { Static75.aClass39_924, local666.aClass39_34, Static20.aClass39_352 });
				}
				if (Static82.anInt1996 == 16 && !local666.aBoolean14) {
					Static126.aBoolean247 = true;
					Static120.anInt3073 = 3;
					Static35.aBoolean96 = true;
				}
			}
			return;
		}
		if (local23 == 54) {
			local445 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local31];
			if (local445 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local445.anIntArray389[0], local445.anIntArray387[0], 0, 1, false);
				Static66.anInt1726 = Static38.anInt1157;
				Static95.anInt2879 = 0;
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static103.aClass1_Sub18_Sub1_5.method2203(251);
				Static103.aClass1_Sub18_Sub1_5.method2148(local31);
				Static103.aClass1_Sub18_Sub1_5.method2148(Static76.anInt1918);
				Static103.aClass1_Sub18_Sub1_5.method2163(Static123.anInt2998);
			}
		}
		if (local23 == 52) {
			Static49.method857(Static9.anInt2991);
			Static9.anInt2991 = -1;
			Static113.aBoolean226 = true;
		}
		if (local23 == 42) {
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local212.anIntArray389[0], local212.anIntArray387[0], 0, 1, false);
				Static95.anInt2879 = 0;
				Static77.anInt1930 = 2;
				Static104.anInt2644 = Static89.anInt2109;
				Static66.anInt1726 = Static38.anInt1157;
				Static103.aClass1_Sub18_Sub1_5.method2203(56);
				Static103.aClass1_Sub18_Sub1_5.method2138(Static62.anInt2928);
				Static103.aClass1_Sub18_Sub1_5.method2177(Static40.anInt1170);
				Static103.aClass1_Sub18_Sub1_5.method2177(local31);
				Static103.aClass1_Sub18_Sub1_5.method2177(Static52.anInt1456);
			}
		}
		if (local23 == 44) {
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local212.anIntArray389[0], local212.anIntArray387[0], 0, 1, false);
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static95.anInt2879 = 0;
				Static66.anInt1726 = Static38.anInt1157;
				Static103.aClass1_Sub18_Sub1_5.method2203(111);
				Static103.aClass1_Sub18_Sub1_5.method2148(local31);
			}
		}
		if (local23 == 46) {
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local212.anIntArray389[0], local212.anIntArray387[0], 0, 1, false);
				Static95.anInt2879 = 0;
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static66.anInt1726 = Static38.anInt1157;
				Static103.aClass1_Sub18_Sub1_5.method2203(106);
				Static103.aClass1_Sub18_Sub1_5.method2159(local31);
			}
		}
		if (local23 == 31) {
			Static103.aClass1_Sub18_Sub1_5.method2203(2);
			Static103.aClass1_Sub18_Sub1_5.method2140(Static76.anInt1918);
			Static103.aClass1_Sub18_Sub1_5.method2140(local15);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static103.aClass1_Sub18_Sub1_5.method2144(local19);
			Static103.aClass1_Sub18_Sub1_5.method2163(Static123.anInt2998);
			Static113.anInt2825 = local15;
			Static62.anInt2923 = 0;
			Static91.anInt2127 = 2;
			Static79.anInt2480 = local19;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			if (local19 >> 16 == Static110.anInt2786) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 50) {
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local212.anIntArray389[0], local212.anIntArray387[0], 0, 1, false);
				Static77.anInt1930 = 2;
				Static104.anInt2644 = Static89.anInt2109;
				Static66.anInt1726 = Static38.anInt1157;
				Static95.anInt2879 = 0;
				Static103.aClass1_Sub18_Sub1_5.method2203(86);
				Static103.aClass1_Sub18_Sub1_5.method2159(local31);
			}
		}
		if (local23 == 58) {
			local769 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 0, false);
			if (!local769) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 1, false);
			}
			Static95.anInt2879 = 0;
			Static104.anInt2644 = Static89.anInt2109;
			Static66.anInt1726 = Static38.anInt1157;
			Static77.anInt1930 = 2;
			Static103.aClass1_Sub18_Sub1_5.method2203(174);
			Static103.aClass1_Sub18_Sub1_5.method2140(local31);
			Static103.aClass1_Sub18_Sub1_5.method2159(local15 + Static71.anInt1795);
			Static103.aClass1_Sub18_Sub1_5.method2177(local19 + Static103.anInt2610);
		}
		if (local23 == 20) {
			local769 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 0, false);
			if (!local769) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 1, false);
			}
			Static95.anInt2879 = 0;
			Static66.anInt1726 = Static38.anInt1157;
			Static104.anInt2644 = Static89.anInt2109;
			Static77.anInt1930 = 2;
			Static103.aClass1_Sub18_Sub1_5.method2203(59);
			Static103.aClass1_Sub18_Sub1_5.method2159(Static103.anInt2610 + local19);
			Static103.aClass1_Sub18_Sub1_5.method2159(local15 + Static71.anInt1795);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
		}
		if (local23 == 35 && Static122.anInt2982 == -1) {
			Static97.method2164(local19, local15);
			Static122.anInt2982 = local19;
			Static49.anInt1370 = local15;
		}
		if (local23 == 2) {
			local212 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31];
			if (local212 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local212.anIntArray389[0], local212.anIntArray387[0], 0, 1, false);
				Static66.anInt1726 = Static38.anInt1157;
				Static95.anInt2879 = 0;
				Static77.anInt1930 = 2;
				Static104.anInt2644 = Static89.anInt2109;
				Static103.aClass1_Sub18_Sub1_5.method2203(201);
				Static103.aClass1_Sub18_Sub1_5.method2148(local31);
			}
		}
		if (local23 == 9) {
			Static103.aClass1_Sub18_Sub1_5.method2203(181);
			Static103.aClass1_Sub18_Sub1_5.method2177(local15);
			Static103.aClass1_Sub18_Sub1_5.method2138(local19);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31);
			Static91.anInt2127 = 2;
			if (local19 >> 16 == Static48.anInt1318) {
				Static91.anInt2127 = 1;
			}
			Static62.anInt2923 = 0;
			Static79.anInt2480 = local19;
			Static113.anInt2825 = local15;
			if (Static110.anInt2786 == local19 >> 16) {
				Static91.anInt2127 = 3;
			}
		}
		if (local23 == 51) {
			Static103.aClass1_Sub18_Sub1_5.method2203(49);
			Static103.aClass1_Sub18_Sub1_5.method2148(Static76.anInt1918);
			Static103.aClass1_Sub18_Sub1_5.method2149(local19);
			Static103.aClass1_Sub18_Sub1_5.method2148(local15);
			Static103.aClass1_Sub18_Sub1_5.method2163(Static123.anInt2998);
		}
		if (local23 == 55) {
			local445 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local31];
			if (local445 != null) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local445.anIntArray389[0], local445.anIntArray387[0], 0, 1, false);
				Static66.anInt1726 = Static38.anInt1157;
				Static104.anInt2644 = Static89.anInt2109;
				Static77.anInt1930 = 2;
				Static95.anInt2879 = 0;
				Static103.aClass1_Sub18_Sub1_5.method2203(139);
				Static103.aClass1_Sub18_Sub1_5.method2140(local31);
			}
		}
		if (local23 == 17) {
			local769 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 0, false);
			if (!local769) {
				Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 1, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, local15, local19, 0, 1, false);
			}
			Static66.anInt1726 = Static38.anInt1157;
			Static77.anInt1930 = 2;
			Static104.anInt2644 = Static89.anInt2109;
			Static95.anInt2879 = 0;
			Static103.aClass1_Sub18_Sub1_5.method2203(22);
			Static103.aClass1_Sub18_Sub1_5.method2159(local31);
			Static103.aClass1_Sub18_Sub1_5.method2159(local19 + Static103.anInt2610);
			Static103.aClass1_Sub18_Sub1_5.method2138(Static62.anInt2928);
			Static103.aClass1_Sub18_Sub1_5.method2148(Static52.anInt1456);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static40.anInt1170);
			Static103.aClass1_Sub18_Sub1_5.method2177(local15 + Static71.anInt1795);
		}
		if (local23 == 30) {
			Static20.method408();
		}
		if (local23 == 12 && Static18.method358(local31, local19, local15)) {
			Static103.aClass1_Sub18_Sub1_5.method2203(164);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static71.anInt1795 + local15);
			Static103.aClass1_Sub18_Sub1_5.method2138(Static123.anInt2998);
			Static103.aClass1_Sub18_Sub1_5.method2177(local31 >> 14 & 0x7FFF);
			Static103.aClass1_Sub18_Sub1_5.method2140(Static103.anInt2610 + local19);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static76.anInt1918);
		}
		if (local23 == 49 || local23 == 53 || local23 == 21 || local23 == 25) {
			local358 = Static50.aClass39Array13[arg0];
			local365 = local358.method1166(Static20.aClass39_352);
			if (local365 != -1) {
				local382 = local358.method1181(local365 + 12).method1183().method1186();
				if (local23 == 49) {
					Static51.method880(local382);
				}
				if (local23 == 53) {
					Static94.method1583(local382);
				}
				if (local23 == 21) {
					Static18.method356(local382);
				}
				if (local23 == 25) {
					Static120.method2134(local382);
				}
			}
		}
		if (Static89.anInt2107 != 0) {
			Static35.aBoolean96 = true;
			Static89.anInt2107 = 0;
		}
		if (Static46.aBoolean222) {
			Static25.method458();
			Static35.aBoolean96 = true;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBIIII)V")
	public static void method1724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == Static8.anInt430 && arg2 == Static124.anInt2999 && (arg4 == Static94.anInt2217 || !Static68.aBoolean149)) {
			return;
		}
		Static94.anInt2217 = arg4;
		Static124.anInt2999 = arg2;
		Static8.anInt430 = arg0;
		if (!Static68.aBoolean149) {
			Static94.anInt2217 = 0;
		}
		Static41.method2108(25);
		Static9.method2066(Static117.aClass39_1399, false, null);
		@Pc(49) int local49 = Static103.anInt2610;
		@Pc(51) int local51 = Static71.anInt1795;
		Static71.anInt1795 = arg0 * 8 - 48;
		Static103.anInt2610 = arg2 * 8 - 48;
		@Pc(68) int local68 = Static103.anInt2610 - local49;
		@Pc(73) int local73 = Static71.anInt1795 - local51;
		for (@Pc(79) int local79 = 0; local79 < 32768; local79++) {
			@Pc(85) Class1_Sub1_Sub2_Sub1_Sub1 local85 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < 10; local89++) {
					local85.anIntArray389[local89] -= local73;
					local85.anIntArray387[local89] -= local68;
				}
				local85.anInt2508 -= local68 * 128;
				local85.anInt2521 -= local73 * 128;
			}
		}
		for (@Pc(135) int local135 = 0; local135 < 2048; local135++) {
			@Pc(141) Class1_Sub1_Sub2_Sub1_Sub2 local141 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local135];
			if (local141 != null) {
				for (@Pc(145) int local145 = 0; local145 < 10; local145++) {
					local141.anIntArray389[local145] -= local73;
					local141.anIntArray387[local145] -= local68;
				}
				local141.anInt2508 -= local68 * 128;
				local141.anInt2521 -= local73 * 128;
			}
		}
		Static9.anInt2983 = arg4;
		@Pc(195) byte local195 = 104;
		Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1803(arg3, arg1, false);
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 1;
		if (local73 < 0) {
			local195 = -1;
			local205 = -1;
			local203 = 103;
		}
		@Pc(215) byte local215 = 0;
		@Pc(217) byte local217 = 104;
		@Pc(219) byte local219 = 1;
		if (local68 < 0) {
			local215 = 103;
			local219 = -1;
			local217 = -1;
		}
		for (@Pc(229) int local229 = local203; local229 != local195; local229 += local205) {
			for (@Pc(233) int local233 = local215; local233 != local217; local233 += local219) {
				@Pc(239) int local239 = local73 + local229;
				@Pc(244) int local244 = local233 + local68;
				for (@Pc(246) int local246 = 0; local246 < 4; local246++) {
					if (local239 >= 0 && local244 >= 0 && local239 < 104 && local244 < 104) {
						Static100.aClass31ArrayArrayArray1[local246][local229][local233] = Static100.aClass31ArrayArrayArray1[local246][local239][local244];
					} else {
						Static100.aClass31ArrayArrayArray1[local246][local229][local233] = null;
					}
				}
			}
		}
		for (@Pc(319) Class1_Sub19 local319 = (Class1_Sub19) Static96.aClass31_54.method1000(); local319 != null; local319 = (Class1_Sub19) Static96.aClass31_54.method1003()) {
			local319.anInt2830 -= local73;
			local319.anInt2818 -= local68;
			if (local319.anInt2830 < 0 || local319.anInt2818 < 0 || local319.anInt2830 >= 104 || local319.anInt2818 >= 104) {
				local319.method2128();
			}
		}
		if (Static35.anInt1069 != 0) {
			Static32.anInt684 -= local68;
			Static35.anInt1069 -= local73;
		}
		Static29.aBoolean86 = false;
		Static117.anInt2909 = -1;
		Static56.anInt1518 = 0;
		Static53.aClass31_32.method995();
		Static81.aClass31_47.method995();
	}
}
