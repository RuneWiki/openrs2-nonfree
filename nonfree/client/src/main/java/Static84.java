import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	public static int anInt2100;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public static int anInt2098 = 0;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
	public static int[] anIntArray221 = new int[50];

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
	public static int anInt2105 = 0;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	public static int anInt2107 = 0;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1082 = Static28.method504("gr-Un:");

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1083 = Static28.method504(":");

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
	public static int anInt2111 = 0;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public static void method1515() {
		aClass39_1083 = null;
		aClass39_1082 = null;
		anIntArray221 = null;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)Z")
	public static boolean method1516() {
		if (Static49.aClass69_3 == null) {
			return false;
		}
		@Pc(184) int local184;
		try {
			@Pc(13) int local13 = Static49.aClass69_3.method1863();
			if (local13 == 0) {
				return false;
			}
			if (Static103.anInt2562 == -1) {
				Static49.aClass69_3.method1855(1, 0, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
				local13--;
				Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
				Static103.anInt2562 = Static35.aClass4_Sub16_Sub1_1.method1495();
				Static97.anInt2446 = Static96.anIntArray269[Static103.anInt2562];
			}
			if (Static97.anInt2446 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static49.aClass69_3.method1855(1, 0, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
				Static97.anInt2446 = Static35.aClass4_Sub16_Sub1_1.aByteArray22[0] & 0xFF;
			}
			if (Static97.anInt2446 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static49.aClass69_3.method1855(2, 0, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
				local13 -= 2;
				Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
				Static97.anInt2446 = Static35.aClass4_Sub16_Sub1_1.method1490();
			}
			if (local13 < Static97.anInt2446) {
				return false;
			}
			Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
			Static49.aClass69_3.method1855(Static97.anInt2446, 0, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
			Static117.anInt2947 = 0;
			Static55.anInt1508 = Static122.anInt3028;
			Static122.anInt3028 = Static47.anInt1184;
			Static47.anInt1184 = Static103.anInt2562;
			if (Static103.anInt2562 == 131) {
				Static35.aClass4_Sub16_Sub1_1.method1487();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 171) {
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(147) long local147;
			@Pc(154) Class39 local154;
			if (Static103.anInt2562 == 89) {
				local147 = Static35.aClass4_Sub16_Sub1_1.method1479();
				local154 = Static76.method1263(Static114.method1991(Static35.aClass4_Sub16_Sub1_1).method942());
				Static40.method672(6, local154, Static94.method1699(local147).method955());
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(174) int local174;
			if (Static103.anInt2562 == 32) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1471();
				Static115.anInt2882 = local174;
				Static42.method709(local174);
				Static93.method2207(Static115.anInt2882);
				for (local184 = 0; local184 < 100; local184++) {
					Static13.aBooleanArray3[local184] = true;
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 51) {
				Static14.anInt366 = Static35.aClass4_Sub16_Sub1_1.method1472();
				Static52.anInt1358 = Static35.aClass4_Sub16_Sub1_1.method1474();
				while (Static35.aClass4_Sub16_Sub1_1.anInt2019 < Static97.anInt2446) {
					Static103.anInt2562 = Static35.aClass4_Sub16_Sub1_1.method1474();
					Static27.method493();
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 189) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1445();
				Static87.aClass16_7 = Static126.aClass29_63.method600(local174);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 82) {
				Static115.method2015();
				Static2.anInt18 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static103.anInt2562 = -1;
				Static49.anInt1281 = Static129.anInt3153;
				return true;
			}
			if (Static103.anInt2562 == 70) {
				Static35.aClass4_Sub16_Sub1_1.method1474();
				Static35.aClass4_Sub16_Sub1_1.method1471();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 20) {
				Static35.aClass4_Sub16_Sub1_1.method1453();
				Static35.aClass4_Sub16_Sub1_1.method1467();
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(305) int local305;
			@Pc(337) int local337;
			@Pc(433) int local433;
			@Pc(422) int local422;
			@Pc(307) boolean local307;
			if (Static103.anInt2562 == 137) {
				local147 = Static35.aClass4_Sub16_Sub1_1.method1479();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local307 = false;
				if ((local147 & Long.MIN_VALUE) != 0L) {
					local307 = true;
				}
				@Pc(321) byte local321 = Static35.aClass4_Sub16_Sub1_1.method1477();
				if (local307) {
					if (Static97.anInt2431 == 0) {
						Static103.anInt2562 = -1;
						return true;
					}
					local147 &= Long.MAX_VALUE;
					for (local337 = 0; Static97.anInt2431 > local337 && (local147 != Static32.aClass4_Sub20Array1[local337].aLong155 || Static32.aClass4_Sub20Array1[local337].anInt2785 != local305); local337++) {
					}
					if (Static97.anInt2431 > local337) {
						while (Static97.anInt2431 - 1 > local337) {
							Static32.aClass4_Sub20Array1[local337] = Static32.aClass4_Sub20Array1[local337 + 1];
							local337++;
						}
						Static32.aClass4_Sub20Array1[Static97.anInt2431] = null;
						Static97.anInt2431--;
					}
				} else {
					@Pc(403) Class4_Sub20 local403 = new Class4_Sub20();
					local403.aLong155 = local147;
					local403.aClass39_1464 = Static94.method1699(local403.aLong155);
					local403.anInt2785 = local305;
					local403.aByte6 = local321;
					for (local422 = Static97.anInt2431 - 1; local422 >= 0; local422--) {
						local433 = Static32.aClass4_Sub20Array1[local422].aClass39_1464.method963(local403.aClass39_1464);
						if (local433 == 0) {
							Static32.aClass4_Sub20Array1[local422].anInt2785 = local305;
							Static32.aClass4_Sub20Array1[local422].aByte6 = local321;
							if (local147 == Static120.aLong143) {
								Static106.aByte5 = local321;
							}
							Static103.anInt2562 = -1;
							return true;
						}
						if (local433 < 0) {
							break;
						}
					}
					if (Static97.anInt2431 >= Static32.aClass4_Sub20Array1.length) {
						Static103.anInt2562 = -1;
						return true;
					}
					for (local433 = Static97.anInt2431 - 1; local433 > local422; local433--) {
						Static32.aClass4_Sub20Array1[local433 + 1] = Static32.aClass4_Sub20Array1[local433];
					}
					if (Static97.anInt2431 == 0) {
						Static32.aClass4_Sub20Array1 = new Class4_Sub20[100];
					}
					Static32.aClass4_Sub20Array1[local422 + 1] = local403;
					if (Static120.aLong143 == local147) {
						Static106.aByte5 = local321;
					}
					Static97.anInt2431++;
				}
				Static103.anInt2562 = -1;
				Static75.anInt1796 = Static71.anInt1738;
				return true;
			}
			if (Static103.anInt2562 == 114) {
				Static23.anInt653 = Static35.aClass4_Sub16_Sub1_1.method1467() * 30;
				Static103.anInt2562 = -1;
				Static49.anInt1281 = Static129.anInt3153;
				return true;
			}
			if (Static103.anInt2562 == 182) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1486();
				@Pc(555) Class4_Sub10 local555 = (Class4_Sub10) Static15.aClass42_4.method1055((long) local174);
				if (local555 != null) {
					Static114.method1993(local555, true);
				}
				if (Static101.aClass4_Sub5_55 != null) {
					Static19.method344(Static101.aClass4_Sub5_55);
					Static101.aClass4_Sub5_55 = null;
				}
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(603) int local603;
			if (Static103.anInt2562 == 37) {
				Static115.method2015();
				local174 = Static35.aClass4_Sub16_Sub1_1.method1472();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1481();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static35.anIntArray99[local305] = local184;
				Static1.anIntArray1[local305] = local174;
				Static39.anIntArray105[local305] = 1;
				for (local603 = 0; local603 < 98; local603++) {
					if (Class4_Sub2_Sub11.anIntArray220[local603] <= local184) {
						Static39.anIntArray105[local305] = local603 + 2;
					}
				}
				Static85.anIntArray222[Static53.anInt1419++ & 0x1F] = local305;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 222) {
				Static35.aClass4_Sub16_Sub1_1.method1444();
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(679) Class4_Sub5 local679;
			@Pc(718) int local718;
			if (Static103.anInt2562 == 124) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1486();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1490();
				if (local174 < -70000) {
					local184 += 32768;
				}
				if (local174 >= 0) {
					local679 = Static54.method949(local174);
				} else {
					local679 = null;
				}
				if (local679 != null) {
					for (local603 = 0; local603 < local679.anIntArray130.length; local603++) {
						local679.anIntArray130[local603] = 0;
						local679.anIntArray134[local603] = 0;
					}
				}
				Static103.method1849(local184);
				local603 = Static35.aClass4_Sub16_Sub1_1.method1490();
				for (local718 = 0; local718 < local603; local718++) {
					local337 = Static35.aClass4_Sub16_Sub1_1.method1471();
					local422 = Static35.aClass4_Sub16_Sub1_1.method1438();
					if (local422 == 255) {
						local422 = Static35.aClass4_Sub16_Sub1_1.method1481();
					}
					if (local679 != null && local718 < local679.anIntArray130.length) {
						local679.anIntArray130[local718] = local337;
						local679.anIntArray134[local718] = local422;
					}
					Static53.method923(local184, local718, local337 - 1, local422);
				}
				if (local679 != null) {
					Static19.method344(local679);
				}
				Static115.method2015();
				Static55.anIntArray148[Static75.anInt1800++ & 0x1F] = local184 & 0x7FFF;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 54) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1486();
				local679 = Static54.method949(local184);
				if (local679.anInt1200 != 2 || local174 != local679.anInt1248) {
					local679.anInt1248 = local174;
					local679.anInt1200 = 2;
					Static19.method344(local679);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 99) {
				Static52.anInt1358 = Static35.aClass4_Sub16_Sub1_1.method1444();
				Static14.anInt366 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 24) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1453();
				local305 = local174 >> 10 & 0x1F;
				local184 = Static35.aClass4_Sub16_Sub1_1.method1469();
				local603 = local174 >> 5 & 0x1F;
				local718 = local174 & 0x1F;
				local337 = (local603 << 11) + (local305 << 19) + (local718 << 3);
				@Pc(906) Class4_Sub5 local906 = Static54.method949(local184);
				if (local906.anInt1211 != local337) {
					local906.anInt1211 = local337;
					Static19.method344(local906);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 55) {
				Static35.aClass4_Sub16_Sub1_1.method1464();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 44) {
				Static35.aClass4_Sub16_Sub1_1.method1453();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 126) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1445();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1471();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local603 = Static35.aClass4_Sub16_Sub1_1.method1453();
				@Pc(967) Class4_Sub5 local967 = Static54.method949(local174);
				if (local967.anInt1217 != local305 || local967.anInt1227 != local603 || local184 != local967.anInt1242) {
					local967.anInt1227 = local603;
					local967.anInt1217 = local305;
					local967.anInt1242 = local184;
					Static19.method344(local967);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 120) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1472();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1444();
				local154 = Static35.aClass4_Sub16_Sub1_1.method1464();
				if (local184 >= 1 && local184 <= 5) {
					if (local154.method954(Static99.aClass39_1290)) {
						local154 = null;
					}
					Static1.aClass39Array1[local184 - 1] = local154;
					Static13.aBooleanArray2[local184 - 1] = local174 == 0;
				}
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(1076) Class4_Sub5 local1076;
			if (Static103.anInt2562 == 3) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1476();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1480();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1469();
				local1076 = Static54.method949(local305);
				local718 = local184 + local1076.anInt1222;
				local337 = local1076.anInt1209 + local174;
				if (local1076.anInt1245 != local718 || local337 != local1076.anInt1201) {
					local1076.anInt1201 = local337;
					local1076.anInt1245 = local718;
					Static19.method344(local1076);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(1154) long local1154;
			@Pc(1150) Class39 local1150;
			@Pc(1115) Class39 local1115;
			if (Static103.anInt2562 == 242) {
				local1115 = Static35.aClass4_Sub16_Sub1_1.method1464();
				if (local1115.method931(Static55.aClass39_810)) {
					local1150 = local1115.method938(local1115.method960(aClass39_1083), 0);
					local1154 = local1150.method941();
					local307 = false;
					for (local337 = 0; local337 < Static83.anInt2086; local337++) {
						if (Static42.aLongArray3[local337] == local1154) {
							local307 = true;
							break;
						}
					}
					if (!local307 && Static28.anInt759 == 0) {
						Static40.method672(4, Static106.aClass39_1351, local1150);
					}
				} else if (local1115.method931(Static85.aClass39_1084)) {
					local1150 = local1115.method938(local1115.method960(aClass39_1083), 0);
					local1154 = local1150.method941();
					local307 = false;
					for (local337 = 0; local337 < Static83.anInt2086; local337++) {
						if (Static42.aLongArray3[local337] == local1154) {
							local307 = true;
							break;
						}
					}
					if (!local307 && Static28.anInt759 == 0) {
						Static40.method672(8, Static106.aClass39_1346, local1150);
					}
				} else if (local1115.method931(Static14.aClass39_248)) {
					local1150 = local1115.method938(local1115.method960(aClass39_1083), 0);
					local1154 = local1150.method941();
					local307 = false;
					for (local337 = 0; local337 < Static83.anInt2086; local337++) {
						if (Static42.aLongArray3[local337] == local1154) {
							local307 = true;
							break;
						}
					}
					if (!local307 && Static28.anInt759 == 0) {
						@Pc(1200) Class39 local1200 = local1115.method938(local1115.method953() - 9, local1115.method960(aClass39_1083) + 1);
						Static40.method672(8, local1200, local1150);
					}
				} else {
					Static40.method672(0, local1115, Static72.aClass39_423);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 2) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1453();
				@Pc(1324) byte local1324 = Static35.aClass4_Sub16_Sub1_1.method1449();
				Static53.anIntArray146[local174] = local1324;
				if (Static22.anIntArray64[local174] != local1324) {
					Static22.anIntArray64[local174] = local1324;
					Static20.method383(local174);
				}
				Static39.anIntArray104[Static69.anInt1722++ & 0x1F] = local174;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 245) {
				Static42.aBoolean48 = true;
				Static53.anInt1392 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static19.anInt514 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static92.anInt736 = Static35.aClass4_Sub16_Sub1_1.method1490();
				Static1.anInt11 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static52.anInt1347 = Static35.aClass4_Sub16_Sub1_1.method1474();
				if (Static52.anInt1347 >= 100) {
					Static69.anInt1723 = Static53.anInt1392 * 128 + 64;
					Static119.anInt3113 = Static19.anInt514 * 128 + 64;
					Static97.anInt2445 = Static94.method1708(Static69.anInt1723, Static119.anInt3113, Static131.anInt3202) - Static92.anInt736;
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 142) {
				for (local174 = 0; local174 < anInt2100; local174++) {
					@Pc(1423) Class4_Sub2_Sub9 local1423 = Static91.method1639(local174);
					if (local1423 != null && local1423.anInt1305 == 0) {
						Static53.anIntArray146[local174] = 0;
						Static22.anIntArray64[local174] = 0;
					}
				}
				Static115.method2015();
				Static69.anInt1722 += 32;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 38) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local603 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static131.aBooleanArray19[local174] = true;
				Static103.anIntArray283[local174] = local184;
				Static40.anIntArray107[local174] = local305;
				Static23.anIntArray65[local174] = local603;
				Static127.anIntArray360[local174] = 0;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 16) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1445();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1481();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1453();
				if (local305 == 65535) {
					local305 = -1;
				}
				local603 = Static35.aClass4_Sub16_Sub1_1.method1490();
				if (local603 == 65535) {
					local603 = -1;
				}
				for (local718 = local305; local718 <= local603; local718++) {
					@Pc(1541) long local1541 = ((long) local184 << 32) + ((long) local718);
					@Pc(1546) Class4 local1546 = Static109.aClass42_11.method1055(local1541);
					if (local1546 != null) {
						local1546.method2189();
					}
					Static109.aClass42_11.method1056(new Class4_Sub9(local174), local1541);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 85) {
				@Pc(1585) boolean local1585 = Static35.aClass4_Sub16_Sub1_1.method1472() == 1;
				local184 = Static35.aClass4_Sub16_Sub1_1.method1469();
				local679 = Static54.method949(local184);
				if (local679.aBoolean56 != local1585) {
					local679.aBoolean56 = local1585;
					Static19.method344(local679);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(1630) long local1630;
			if (Static103.anInt2562 == 169) {
				local147 = Static35.aClass4_Sub16_Sub1_1.method1479();
				local1154 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local1630 = Static35.aClass4_Sub16_Sub1_1.method1475();
				@Pc(1636) long local1636 = local1630 + (local1154 << 32);
				local422 = Static35.aClass4_Sub16_Sub1_1.method1474();
				@Pc(1642) boolean local1642 = false;
				for (@Pc(1644) int local1644 = 0; local1644 < 100; local1644++) {
					if (local1636 == Static14.aLongArray2[local1644]) {
						local1642 = true;
						break;
					}
				}
				if (local422 <= 1) {
					for (@Pc(1669) int local1669 = 0; local1669 < Static83.anInt2086; local1669++) {
						if (local147 == Static42.aLongArray3[local1669]) {
							local1642 = true;
							break;
						}
					}
				}
				if (!local1642 && Static28.anInt759 == 0) {
					Static14.aLongArray2[Static126.anInt3163] = local1636;
					Static126.anInt3163 = (Static126.anInt3163 + 1) % 100;
					@Pc(1713) Class39 local1713 = Static76.method1263(Static114.method1991(Static35.aClass4_Sub16_Sub1_1).method942());
					if (local422 == 2 || local422 == 3) {
						Static40.method672(7, local1713, Static62.method1123(new Class39[] { Static14.aClass39_252, Static94.method1699(local147).method955() }));
					} else if (local422 == 1) {
						Static40.method672(7, local1713, Static62.method1123(new Class39[] { Static38.aClass39_487, Static94.method1699(local147).method955() }));
					} else {
						Static40.method672(3, local1713, Static94.method1699(local147).method955());
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 194) {
				Static74.anInt1779 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static69.anInt1720 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static99.anInt2486 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 208) {
				Static98.anInt1022 = Static35.aClass4_Sub16_Sub1_1.method1474();
				if (Static98.anInt1022 == 1) {
					Static103.anInt2556 = Static35.aClass4_Sub16_Sub1_1.method1490();
				}
				if (Static98.anInt1022 >= 2 && Static98.anInt1022 <= 6) {
					if (Static98.anInt1022 == 2) {
						Static104.anInt2569 = 64;
						Static43.anInt1113 = 64;
					}
					if (Static98.anInt1022 == 3) {
						Static43.anInt1113 = 0;
						Static104.anInt2569 = 64;
					}
					if (Static98.anInt1022 == 4) {
						Static104.anInt2569 = 64;
						Static43.anInt1113 = 128;
					}
					if (Static98.anInt1022 == 5) {
						Static104.anInt2569 = 0;
						Static43.anInt1113 = 64;
					}
					if (Static98.anInt1022 == 6) {
						Static43.anInt1113 = 64;
						Static104.anInt2569 = 128;
					}
					Static98.anInt1022 = 2;
					Static70.anInt1732 = Static35.aClass4_Sub16_Sub1_1.method1490();
					Static123.anInt3042 = Static35.aClass4_Sub16_Sub1_1.method1490();
					Static129.anInt3148 = Static35.aClass4_Sub16_Sub1_1.method1474();
				}
				if (Static98.anInt1022 == 10) {
					Static51.anInt2458 = Static35.aClass4_Sub16_Sub1_1.method1490();
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 213) {
				Static83.anInt2086 = Static97.anInt2446 / 8;
				for (local174 = 0; local174 < Static83.anInt2086; local174++) {
					Static42.aLongArray3[local174] = Static35.aClass4_Sub16_Sub1_1.method1479();
				}
				Static103.anInt2562 = -1;
				Static4.anInt88 = Static129.anInt3153;
				return true;
			}
			if (Static103.anInt2562 == 66) {
				Static125.anInt3127 = 0;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 68) {
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 231) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1471();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1469();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1467();
				local1076 = Static54.method949(local184);
				Static103.anInt2562 = -1;
				local1076.anInt1234 = local174 + (local305 << 16);
				return true;
			}
			if (Static103.anInt2562 == 160) {
				Static32.method547();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 50) {
				Static42.method707(Static126.aClass29_63, Static97.anInt2446, Static35.aClass4_Sub16_Sub1_1);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 62) {
				local1115 = Static35.aClass4_Sub16_Sub1_1.method1464();
				@Pc(2014) Object[] local2014 = new Object[local1115.method953() + 1];
				for (local305 = local1115.method953() - 1; local305 >= 0; local305--) {
					if (local1115.method939(local305) == 115) {
						local2014[local305 + 1] = Static35.aClass4_Sub16_Sub1_1.method1464();
					} else {
						local2014[local305 + 1] = Integer.valueOf(Static35.aClass4_Sub16_Sub1_1.method1486());
					}
				}
				local2014[0] = Integer.valueOf(Static35.aClass4_Sub16_Sub1_1.method1486());
				@Pc(2065) Class4_Sub17 local2065 = new Class4_Sub17();
				local2065.anObjectArray27 = local2014;
				Static104.method1857(local2065);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 128) {
				Static42.aBoolean48 = true;
				Static92.anInt735 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static73.anInt1762 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static20.anInt560 = Static35.aClass4_Sub16_Sub1_1.method1490();
				Static116.anInt2887 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static51.anInt2475 = Static35.aClass4_Sub16_Sub1_1.method1474();
				if (Static51.anInt2475 >= 100) {
					local174 = Static92.anInt735 * 128 + 64;
					local184 = Static73.anInt1762 * 128 + 64;
					local305 = Static94.method1708(local174, local184, Static131.anInt3202) - Static20.anInt560;
					local337 = local184 - Static119.anInt3113;
					local718 = local305 - Static97.anInt2445;
					local603 = local174 - Static69.anInt1723;
					local422 = (int) Math.sqrt((double) (local603 * local603 + local337 * local337));
					Static18.anInt423 = (int) (Math.atan2((double) local718, (double) local422) * 325.949D) & 0x7FF;
					Static121.anInt3006 = (int) (-325.949D * Math.atan2((double) local603, (double) local337)) & 0x7FF;
					if (Static18.anInt423 < 128) {
						Static18.anInt423 = 128;
					}
					if (Static18.anInt423 > 383) {
						Static18.anInt423 = 383;
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 77) {
				Static115.method2015();
				Static122.anInt3024 = Static35.aClass4_Sub16_Sub1_1.method1476();
				Static103.anInt2562 = -1;
				Static49.anInt1281 = Static129.anInt3153;
				return true;
			}
			if (Static103.anInt2562 == 101) {
				Static14.anInt371 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 216) {
				Static35.aClass4_Sub16_Sub1_1.method1453();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 153) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1486();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1490();
				if (local174 < -70000) {
					local184 += 32768;
				}
				if (local174 >= 0) {
					local679 = Static54.method949(local174);
				} else {
					local679 = null;
				}
				while (Static35.aClass4_Sub16_Sub1_1.anInt2019 < Static97.anInt2446) {
					local337 = 0;
					local603 = Static35.aClass4_Sub16_Sub1_1.method1450();
					local718 = Static35.aClass4_Sub16_Sub1_1.method1490();
					if (local718 != 0) {
						local337 = Static35.aClass4_Sub16_Sub1_1.method1474();
						if (local337 == 255) {
							local337 = Static35.aClass4_Sub16_Sub1_1.method1486();
						}
					}
					if (local679 != null && local603 >= 0 && local679.anIntArray130.length > local603) {
						local679.anIntArray130[local603] = local718;
						local679.anIntArray134[local603] = local337;
					}
					Static53.method923(local184, local603, local718 - 1, local337);
				}
				if (local679 != null) {
					Static19.method344(local679);
				}
				Static115.method2015();
				Static55.anIntArray148[Static75.anInt1800++ & 0x1F] = local184 & 0x7FFF;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 227) {
				Static35.aClass4_Sub16_Sub1_1.method1474();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 232) {
				Static26.method433();
				Static103.anInt2562 = -1;
				return false;
			}
			if (Static103.anInt2562 == 211) {
				Static42.aBoolean48 = false;
				for (local174 = 0; local174 < 5; local174++) {
					Static131.aBooleanArray19[local174] = false;
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 26) {
				Static2.method9(true);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 206) {
				Static35.aClass4_Sub16_Sub1_1.method1438();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 110) {
				Static35.aClass4_Sub16_Sub1_1.method1453();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 196) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1481();
				Static53.anIntArray146[local174] = local184;
				if (local184 != Static22.anIntArray64[local174]) {
					Static22.anIntArray64[local174] = local184;
					Static20.method383(local174);
				}
				Static39.anIntArray104[Static69.anInt1722++ & 0x1F] = local174;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 100) {
				local174 = Static35.aClass4_Sub16_Sub1_1.anInt2019 + Static97.anInt2446;
				local184 = Static35.aClass4_Sub16_Sub1_1.method1490();
				if (Static115.anInt2882 != local184) {
					Static115.anInt2882 = local184;
					Static42.method709(Static115.anInt2882);
					Static93.method2207(Static115.anInt2882);
					for (local305 = 0; local305 < 100; local305++) {
						Static13.aBooleanArray3[local305] = true;
					}
				}
				while (Static35.aClass4_Sub16_Sub1_1.anInt2019 < local174) {
					local305 = Static35.aClass4_Sub16_Sub1_1.method1486();
					local603 = Static35.aClass4_Sub16_Sub1_1.method1490();
					local718 = Static35.aClass4_Sub16_Sub1_1.method1474();
					@Pc(2526) Class4_Sub10 local2526 = (Class4_Sub10) Static15.aClass42_4.method1055((long) local305);
					if (local2526 != null && local603 != local2526.anInt1724) {
						Static114.method1993(local2526, true);
						local2526 = null;
					}
					if (local2526 == null) {
						local2526 = Static106.method1873(local603, local305, local718);
					}
					local2526.aBoolean97 = true;
				}
				for (@Pc(2558) Class4_Sub10 local2558 = (Class4_Sub10) Static15.aClass42_4.method1049(); local2558 != null; local2558 = (Class4_Sub10) Static15.aClass42_4.method1054()) {
					if (local2558.aBoolean97) {
						local2558.aBoolean97 = false;
					} else {
						Static114.method1993(local2558, true);
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(2710) int local2710;
			if (Static103.anInt2562 == 223) {
				Static75.anInt1796 = Static71.anInt1738;
				local147 = Static35.aClass4_Sub16_Sub1_1.method1479();
				if (local147 == 0L) {
					Static97.anInt2431 = 0;
					Static103.anInt2562 = -1;
					Static102.aClass39_1326 = null;
					Static32.aClass4_Sub20Array1 = null;
					return true;
				}
				Static102.aClass39_1326 = Static94.method1699(local147);
				Static33.aByte2 = Static35.aClass4_Sub16_Sub1_1.method1477();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1474();
				if (local305 == 255) {
					Static103.anInt2562 = -1;
					return true;
				}
				@Pc(2632) Class4_Sub20[] local2632 = new Class4_Sub20[100];
				Static97.anInt2431 = local305;
				for (local718 = 0; local718 < Static97.anInt2431; local718++) {
					local2632[local718] = new Class4_Sub20();
					local2632[local718].aLong155 = Static35.aClass4_Sub16_Sub1_1.method1479();
					local2632[local718].aClass39_1464 = Static94.method1699(local2632[local718].aLong155);
					local2632[local718].anInt2785 = Static35.aClass4_Sub16_Sub1_1.method1490();
					local2632[local718].aByte6 = Static35.aClass4_Sub16_Sub1_1.method1477();
					if (Static120.aLong143 == local2632[local718].aLong155) {
						Static106.aByte5 = local2632[local718].aByte6;
					}
				}
				local433 = Static97.anInt2431;
				while (local433 > 0) {
					local433--;
					@Pc(2708) boolean local2708 = true;
					for (local2710 = 0; local2710 < local433; local2710++) {
						if (local2632[local2710].aClass39_1464.method963(local2632[local2710 + 1].aClass39_1464) > 0) {
							@Pc(2732) Class4_Sub20 local2732 = local2632[local2710];
							local2708 = false;
							local2632[local2710] = local2632[local2710 + 1];
							local2632[local2710 + 1] = local2732;
						}
					}
					if (local2708) {
						break;
					}
				}
				Static32.aClass4_Sub20Array1 = local2632;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 244) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static131.anInt3202 = local305 >> 1;
				Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1913(local184, local174, (local305 & 0x1) == 1);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 203) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1467();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1445();
				local679 = Static54.method949(local184);
				if (local679.anInt1200 != 1 || local679.anInt1248 != local174) {
					local679.anInt1248 = local174;
					local679.anInt1200 = 1;
					Static19.method344(local679);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 210) {
				for (local174 = 0; local174 < Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1.length; local174++) {
					if (Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local174] != null) {
						Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local174].anInt2678 = -1;
					}
				}
				for (local184 = 0; local184 < Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1.length; local184++) {
					if (Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local184] != null) {
						Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local184].anInt2678 = -1;
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 13) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1467();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1481();
				local679 = Static54.method949(local184);
				if (local679 != null && local679.anInt1225 == 0) {
					if (local174 > local679.anInt1251 - local679.anInt1259) {
						local174 = local679.anInt1251 - local679.anInt1259;
					}
					if (local174 < 0) {
						local174 = 0;
					}
					if (local679.anInt1214 != local174) {
						local679.anInt1214 = local174;
						Static19.method344(local679);
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 35) {
				Static101.method1816();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 0) {
				for (local174 = 0; local174 < Static22.anIntArray64.length; local174++) {
					if (Static53.anIntArray146[local174] != Static22.anIntArray64[local174]) {
						Static22.anIntArray64[local174] = Static53.anIntArray146[local174];
						Static20.method383(local174);
						Static39.anIntArray104[Static69.anInt1722++ & 0x1F] = local174;
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 202) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1453();
				if (local174 == 65535) {
					local174 = -1;
				}
				Static26.method439(local174);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 234) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1471();
				if (local174 == 65535) {
					local174 = -1;
				}
				local184 = Static35.aClass4_Sub16_Sub1_1.method1475();
				Static14.method241(local184, local174);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 200) {
				Static118.aBoolean146 = true;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 53) {
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 71) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1486();
				local1150 = Static35.aClass4_Sub16_Sub1_1.method1464();
				local679 = Static54.method949(local174);
				if (!local1150.method968(local679.aClass39_722)) {
					local679.aClass39_722 = local1150;
					Static19.method344(local679);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(3173) int local3173;
			if (Static103.anInt2562 == 119) {
				local147 = Static35.aClass4_Sub16_Sub1_1.method1479();
				Static35.aClass4_Sub16_Sub1_1.method1477();
				local1154 = Static35.aClass4_Sub16_Sub1_1.method1479();
				local1630 = Static35.aClass4_Sub16_Sub1_1.method1490();
				@Pc(3136) long local3136 = (long) Static35.aClass4_Sub16_Sub1_1.method1475();
				local2710 = Static35.aClass4_Sub16_Sub1_1.method1474();
				@Pc(3146) long local3146 = local3136 + (local1630 << 32);
				@Pc(3148) boolean local3148 = false;
				for (@Pc(3150) int local3150 = 0; local3150 < 100; local3150++) {
					if (local3146 == Static14.aLongArray2[local3150]) {
						local3148 = true;
						break;
					}
				}
				if (local2710 <= 1) {
					for (local3173 = 0; local3173 < Static83.anInt2086; local3173++) {
						if (local147 == Static42.aLongArray3[local3173]) {
							local3148 = true;
							break;
						}
					}
				}
				if (!local3148 && Static28.anInt759 == 0) {
					Static14.aLongArray2[Static126.anInt3163] = local3146;
					Static126.anInt3163 = (Static126.anInt3163 + 1) % 100;
					@Pc(3218) Class39 local3218 = Static76.method1263(Static114.method1991(Static35.aClass4_Sub16_Sub1_1).method942());
					if (local2710 == 2 || local2710 == 3) {
						Static85.method1521(Static62.method1123(new Class39[] { Static14.aClass39_252, Static94.method1699(local147).method955() }), Static94.method1699(local1154), 9, local3218);
					} else if (local2710 == 1) {
						Static85.method1521(Static62.method1123(new Class39[] { Static38.aClass39_487, Static94.method1699(local147).method955() }), Static94.method1699(local1154), 9, local3218);
					} else {
						Static85.method1521(Static94.method1699(local147).method955(), Static94.method1699(local1154), 9, local3218);
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 145) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1445();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1487();
				local679 = Static54.method949(local174);
				if (local679.anInt1206 != local184 || local184 == -1) {
					local679.anInt1261 = 0;
					local679.anInt1206 = local184;
					local679.anInt1226 = 0;
					Static19.method344(local679);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 167) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1490();
				Static119.method2167(local184, local174, local305);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 61) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1486();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1471();
				if (local184 == 65535) {
					local184 = -1;
				}
				local305 = Static35.aClass4_Sub16_Sub1_1.method1481();
				local1076 = Static54.method949(local305);
				@Pc(3406) Class4_Sub2_Sub5 local3406;
				if (local1076.aBoolean63) {
					local1076.anInt1219 = local174;
					local1076.anInt1208 = local184;
					local3406 = Static119.method2166(local184);
					local1076.anInt1213 = local3406.anInt630;
					local1076.anInt1243 = local3406.anInt599;
					local1076.anInt1216 = local3406.anInt612;
					local1076.anInt1217 = local3406.anInt610;
					local1076.anInt1227 = local3406.anInt604;
					local1076.anInt1242 = local3406.anInt632;
					if (local1076.anInt1244 > 0) {
						local1076.anInt1242 = local1076.anInt1242 * 32 / local1076.anInt1244;
					}
					Static19.method344(local1076);
				} else if (local184 == -1) {
					local1076.anInt1200 = 0;
					Static103.anInt2562 = -1;
					return true;
				} else {
					local3406 = Static119.method2166(local184);
					local1076.anInt1242 = local3406.anInt632 * 100 / local174;
					local1076.anInt1200 = 4;
					local1076.anInt1227 = local3406.anInt604;
					local1076.anInt1217 = local3406.anInt610;
					local1076.anInt1248 = local184;
					Static19.method344(local1076);
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 30) {
				Static6.anInt243 = Static35.aClass4_Sub16_Sub1_1.method1474();
				Static103.anInt2562 = -1;
				Static4.anInt88 = Static129.anInt3153;
				return true;
			}
			if (Static103.anInt2562 == 6) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1445();
				local184 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1474();
				@Pc(3521) Class4_Sub10 local3521 = (Class4_Sub10) Static15.aClass42_4.method1055((long) local174);
				if (local3521 != null) {
					Static114.method1993(local3521, local3521.anInt1724 != local184);
				}
				Static106.method1873(local184, local174, local305);
				Static103.anInt2562 = -1;
				return true;
			}
			@Pc(3558) Class4_Sub5 local3558;
			if (Static103.anInt2562 == 33) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1486();
				local3558 = Static54.method949(local174);
				for (local305 = 0; local305 < local3558.anIntArray130.length; local305++) {
					local3558.anIntArray130[local305] = -1;
					local3558.anIntArray130[local305] = 0;
				}
				Static19.method344(local3558);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 146) {
				local147 = Static35.aClass4_Sub16_Sub1_1.method1479();
				local305 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local603 = Static35.aClass4_Sub16_Sub1_1.method1474();
				@Pc(3612) Class39 local3612 = Static94.method1699(local147).method955();
				for (local337 = 0; local337 < Static48.anInt1254; local337++) {
					if (Static80.aLongArray4[local337] == local147) {
						if (local305 != Static114.anIntArray307[local337]) {
							Static114.anIntArray307[local337] = local305;
							if (local305 > 0) {
								Static40.method672(5, Static62.method1123(new Class39[] { local3612, Static99.aClass39_1288 }), Static72.aClass39_423);
							}
							if (local305 == 0) {
								Static40.method672(5, Static62.method1123(new Class39[] { local3612, Static108.aClass39_1419 }), Static72.aClass39_423);
							}
						}
						local3612 = null;
						Static32.anIntArray93[local337] = local603;
						break;
					}
				}
				if (local3612 != null && Static48.anInt1254 < 200) {
					Static80.aLongArray4[Static48.anInt1254] = local147;
					Static131.aClass39Array23[Static48.anInt1254] = local3612;
					Static114.anIntArray307[Static48.anInt1254] = local305;
					Static32.anIntArray93[Static48.anInt1254] = local603;
					Static48.anInt1254++;
				}
				local433 = Static48.anInt1254;
				Static4.anInt88 = Static129.anInt3153;
				while (local433 > 0) {
					@Pc(3720) boolean local3720 = true;
					local433--;
					for (local2710 = 0; local2710 < local433; local2710++) {
						if (Static49.anInt1283 != Static114.anIntArray307[local2710] && Static114.anIntArray307[local2710 + 1] == Static49.anInt1283 || Static114.anIntArray307[local2710] == 0 && Static114.anIntArray307[local2710 + 1] != 0) {
							@Pc(3761) int local3761 = Static114.anIntArray307[local2710];
							Static114.anIntArray307[local2710] = Static114.anIntArray307[local2710 + 1];
							local3720 = false;
							Static114.anIntArray307[local2710 + 1] = local3761;
							@Pc(3781) Class39 local3781 = Static131.aClass39Array23[local2710];
							Static131.aClass39Array23[local2710] = Static131.aClass39Array23[local2710 + 1];
							Static131.aClass39Array23[local2710 + 1] = local3781;
							@Pc(3799) long local3799 = Static80.aLongArray4[local2710];
							Static80.aLongArray4[local2710] = Static80.aLongArray4[local2710 + 1];
							Static80.aLongArray4[local2710 + 1] = local3799;
							local3173 = Static32.anIntArray93[local2710];
							Static32.anIntArray93[local2710] = Static32.anIntArray93[local2710 + 1];
							Static32.anIntArray93[local2710 + 1] = local3173;
						}
					}
					if (local3720) {
						break;
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 170) {
				Static14.anInt366 = Static35.aClass4_Sub16_Sub1_1.method1472();
				Static52.anInt1358 = Static35.aClass4_Sub16_Sub1_1.method1474();
				for (local174 = Static52.anInt1358; local174 < Static52.anInt1358 + 8; local174++) {
					for (local184 = Static14.anInt366; local184 < Static14.anInt366 + 8; local184++) {
						if (Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local174][local184] != null) {
							Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local174][local184] = null;
							Static77.method1293(local174, local184);
						}
					}
				}
				for (@Pc(3909) Class4_Sub19 local3909 = (Class4_Sub19) Static117.aClass61_15.method1628(); local3909 != null; local3909 = (Class4_Sub19) Static117.aClass61_15.method1629()) {
					if (Static52.anInt1358 <= local3909.anInt2719 && local3909.anInt2719 < Static52.anInt1358 + 8 && local3909.anInt2727 >= Static14.anInt366 && local3909.anInt2727 < Static14.anInt366 + 8 && local3909.anInt2728 == Static131.anInt3202) {
						local3909.anInt2721 = 0;
					}
				}
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 224) {
				Static35.aClass4_Sub16_Sub1_1.method1490();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 22 || Static103.anInt2562 == 113 || Static103.anInt2562 == 8 || Static103.anInt2562 == 148 || Static103.anInt2562 == 9 || Static103.anInt2562 == 92 || Static103.anInt2562 == 132 || Static103.anInt2562 == 144 || Static103.anInt2562 == 252 || Static103.anInt2562 == 27 || Static103.anInt2562 == 48) {
				Static27.method493();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 187) {
				Static35.aClass4_Sub16_Sub1_1.method1476();
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 69) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1445();
				local3558 = Static54.method949(local174);
				local3558.anInt1200 = 3;
				local3558.anInt1248 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass63_2.method1696();
				Static19.method344(local3558);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 65) {
				Static2.method9(false);
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 212) {
				local174 = Static35.aClass4_Sub16_Sub1_1.method1453();
				Static32.method546(local174);
				Static55.anIntArray148[Static75.anInt1800++ & 0x1F] = local174 & 0x7FFF;
				Static103.anInt2562 = -1;
				return true;
			}
			if (Static103.anInt2562 == 19) {
				Static35.aClass4_Sub16_Sub1_1.method1490();
				Static35.aClass4_Sub16_Sub1_1.method1453();
				Static103.anInt2562 = -1;
				return true;
			}
			Static77.method1294(null, "T1 - " + Static103.anInt2562 + "," + Static122.anInt3028 + "," + Static55.anInt1508 + " - " + Static97.anInt2446);
			Static26.method433();
		} catch (@Pc(4134) IOException local4134) {
			Static43.method738();
		} catch (@Pc(4138) Exception local4138) {
			@Pc(4178) String local4178 = "T2 - " + Static103.anInt2562 + "," + Static122.anInt3028 + "," + Static55.anInt1508 + " - " + Static97.anInt2446 + "," + (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0] + Static36.anInt909) + "," + (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0] + Static24.anInt503) + " - ";
			for (local184 = 0; local184 < Static97.anInt2446 && local184 < 50; local184++) {
				local4178 = local4178 + Static35.aClass4_Sub16_Sub1_1.aByteArray22[local184] + ",";
			}
			Static77.method1294(local4138, local4178);
			Static26.method433();
		}
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ja;Lclient!ja;ILclient!pd;)Lclient!mf;")
	public static Class4_Sub2_Sub3_Sub3 method1517(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(8) int local8 = arg2.method484(arg1);
		@Pc(22) int local22 = arg2.method475(arg0, local8);
		return Static121.method2080(arg2, local22, local8);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1518() {
		for (@Pc(15) int local15 = -1; local15 < Static122.anInt3021; local15++) {
			@Pc(24) int local24;
			if (local15 == -1) {
				local24 = 2047;
			} else {
				local24 = Static116.anIntArray312[local15];
			}
			@Pc(32) Class4_Sub2_Sub1_Sub1_Sub1 local32 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local24];
			if (local32 != null) {
				Static23.method426(1, local32);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!ja;")
	public static Class39 method1519(@OriginalArg(1) int arg0) {
		return Static52.aClass39Array11[arg0].method953() > 0 ? Static62.method1123(new Class39[] { Static47.aClass39Array8[arg0], Static123.aClass39_1633, Static52.aClass39Array11[arg0] }) : Static47.aClass39Array8[arg0];
	}
}
