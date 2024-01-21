import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt2034;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	public static final int anInt2025 = 20;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_834 = Static121.method2047("Benutzername: ");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_835 = Static121.method2047("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_836 = Static121.method2047("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	public static int anInt2032 = 0;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
	public static int[] anIntArray204 = new int[50];

	@OriginalMember(owner = "client!p", name = "p", descriptor = "[I")
	public static int[] anIntArray205 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLclient!ib;IIII)V")
	public static void method1495(@OriginalArg(1) Class4_Sub4_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		@Pc(16) int local16 = Static129.anInt3002 + Static52.anInt1339 & 0x7FF;
		@Pc(24) int local24 = arg2 * arg2 + arg3 * arg3;
		if (local24 > 6400) {
			return;
		}
		@Pc(32) int local32 = Class4_Sub4_Sub3_Sub3.anIntArray214[local16];
		@Pc(36) int local36 = Class4_Sub4_Sub3_Sub3.anIntArray217[local16];
		@Pc(44) int local44 = local32 * 256 / (Static17.anInt453 + 256);
		@Pc(52) int local52 = local36 * 256 / (Static17.anInt453 + 256);
		@Pc(62) int local62 = local44 * arg2 + arg3 * local52 >> 16;
		@Pc(73) int local73 = arg2 * local52 - arg3 * local44 >> 16;
		if (local24 > 2500) {
			arg0.method913(Static89.aClass4_Sub4_Sub3_Sub1_5, local62 + arg1 + 98 - arg0.anInt1269 / 2, -local73 + -4 + (arg4 - (-83 - -(arg0.anInt1267 / 2))));
		} else {
			arg0.method912(arg1 + local62 + 94 + 4 - arg0.anInt1269 / 2, -(arg0.anInt1267 / 2) + 83 + arg4 + -local73 - 4);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!lc;BZLclient!lc;)V")
	public static void method1496(@OriginalArg(0) Class40 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class40 arg2) {
		Static131.aClass40_91 = arg0;
		Static81.aBoolean80 = arg1;
		Static55.aClass40_43 = arg2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1497(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1498() {
		aClass60_836 = null;
		aClass60_835 = null;
		anIntArray204 = null;
		aClass60_834 = null;
		anIntArray205 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1499() {
		@Pc(12) int local12;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(20) int local20;
		@Pc(62) Class4_Sub4_Sub1_Sub5 local62;
		if (Static115.anInt2762 == 67) {
			local12 = Static105.aClass4_Sub13_Sub1_3.method1229();
			local20 = Static89.anInt2077 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static74.anInt1854;
			local30 = Static105.aClass4_Sub13_Sub1_3.method1244();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(53) Class70 local53 = Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local20][local26];
				if (local53 != null) {
					for (local62 = (Class4_Sub4_Sub1_Sub5) local53.method1939(); local62 != null; local62 = (Class4_Sub4_Sub1_Sub5) local53.method1936()) {
						if (local62.anInt1411 == (local30 & 0x7FFF)) {
							local62.method2124();
							break;
						}
					}
					if (local53.method1939() == null) {
						Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local20][local26] = null;
					}
					Static45.method813(local20, local26);
				}
			}
			return;
		}
		@Pc(138) int local138;
		@Pc(142) int local142;
		@Pc(146) int local146;
		@Pc(152) int local152;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(158) int local158;
		@Pc(162) int local162;
		@Pc(166) int local166;
		if (Static115.anInt2762 == 241) {
			local12 = Static105.aClass4_Sub13_Sub1_3.method1223();
			local20 = (local12 >> 4 & 0x7) + Static89.anInt2077;
			local26 = Static74.anInt1854 + (local12 & 0x7);
			local30 = local20 + Static105.aClass4_Sub13_Sub1_3.method1224();
			local138 = Static105.aClass4_Sub13_Sub1_3.method1224() + local26;
			local142 = Static105.aClass4_Sub13_Sub1_3.method1246();
			local146 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local152 = Static105.aClass4_Sub13_Sub1_3.method1223() * 4;
			local158 = Static105.aClass4_Sub13_Sub1_3.method1223() * 4;
			local162 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local166 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local172 = Static105.aClass4_Sub13_Sub1_3.method1223();
			local176 = Static105.aClass4_Sub13_Sub1_3.method1223();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && local30 >= 0 && local138 >= 0 && local30 < 104 && local138 < 104 && local146 != 65535) {
				local138 = local138 * 128 + 64;
				local26 = local26 * 128 + 64;
				local30 = local30 * 128 + 64;
				local20 = local20 * 128 + 64;
				@Pc(257) Class4_Sub4_Sub1_Sub4 local257 = new Class4_Sub4_Sub1_Sub4(local146, Static129.anInt3003, local20, local26, Static54.method1001(local20, local26, Static129.anInt3003) - local152, Static81.anInt1944 + local162, Static81.anInt1944 + local166, local172, local176, local142, local158);
				local257.method673(Static54.method1001(local30, local138, Static129.anInt3003) - local158, local30, local138, Static81.anInt1944 + local162);
				Static129.aClass70_19.method1931(local257);
			}
		} else if (Static115.anInt2762 == 193) {
			local12 = Static105.aClass4_Sub13_Sub1_3.method1223();
			local20 = (local12 >> 4 & 0x7) + Static89.anInt2077;
			local26 = (local12 & 0x7) + Static74.anInt1854;
			local30 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local138 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local142 = Static105.aClass4_Sub13_Sub1_3.method1244();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(338) Class70 local338 = Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local20][local26];
				if (local338 != null) {
					for (@Pc(347) Class4_Sub4_Sub1_Sub5 local347 = (Class4_Sub4_Sub1_Sub5) local338.method1939(); local347 != null; local347 = (Class4_Sub4_Sub1_Sub5) local338.method1936()) {
						if (local347.anInt1411 == (local30 & 0x7FFF) && local347.anInt1408 == local138) {
							local347.anInt1408 = local142;
							break;
						}
					}
					Static45.method813(local20, local26);
				}
			}
		} else if (Static115.anInt2762 == 16) {
			local12 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local20 = Static105.aClass4_Sub13_Sub1_3.method1210();
			local26 = Static105.aClass4_Sub13_Sub1_3.method1232();
			local30 = Static105.aClass4_Sub13_Sub1_3.method1223();
			local138 = Static89.anInt2077 + (local30 >> 4 & 0x7);
			local142 = (local30 & 0x7) + Static74.anInt1854;
			if (local138 >= 0 && local142 >= 0 && local138 < 104 && local142 < 104 && local26 != Static18.anInt467) {
				@Pc(446) Class4_Sub4_Sub1_Sub5 local446 = new Class4_Sub4_Sub1_Sub5();
				local446.anInt1411 = local20;
				local446.anInt1408 = local12;
				if (Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local138][local142] == null) {
					Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local138][local142] = new Class70();
				}
				Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local138][local142].method1931(local446);
				Static45.method813(local138, local142);
			}
		} else if (Static115.anInt2762 == 96) {
			local12 = Static105.aClass4_Sub13_Sub1_3.method1223();
			local26 = Static74.anInt1854 + (local12 & 0x7);
			local20 = Static89.anInt2077 + (local12 >> 4 & 0x7);
			local30 = Static105.aClass4_Sub13_Sub1_3.method1236();
			local138 = Static105.aClass4_Sub13_Sub1_3.method1236();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local62 = new Class4_Sub4_Sub1_Sub5();
				local62.anInt1411 = local30;
				local62.anInt1408 = local138;
				if (Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local20][local26] == null) {
					Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local20][local26] = new Class70();
				}
				Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local20][local26].method1931(local62);
				Static45.method813(local20, local26);
			}
		} else if (Static115.anInt2762 == 41) {
			local12 = Static105.aClass4_Sub13_Sub1_3.method1255();
			local20 = local12 >> 2;
			local30 = Static45.anIntArray112[local20];
			local26 = local12 & 0x3;
			local138 = Static105.aClass4_Sub13_Sub1_3.method1235();
			local142 = (local138 >> 4 & 0x7) + Static89.anInt2077;
			local146 = (local138 & 0x7) + Static74.anInt1854;
			if (local142 >= 0 && local146 >= 0 && local142 < 104 && local146 < 104) {
				Static114.method1928(-1, 0, local26, local20, local30, local146, local142, -1, Static129.anInt3003);
			}
		} else {
			@Pc(709) int local709;
			if (Static115.anInt2762 == 33) {
				local12 = Static105.aClass4_Sub13_Sub1_3.method1244();
				@Pc(651) byte local651 = Static105.aClass4_Sub13_Sub1_3.method1227();
				local26 = Static105.aClass4_Sub13_Sub1_3.method1229();
				local30 = local26 >> 2;
				local138 = local26 & 0x3;
				local142 = Static45.anIntArray112[local30];
				local146 = Static105.aClass4_Sub13_Sub1_3.method1232();
				local152 = Static105.aClass4_Sub13_Sub1_3.method1210();
				@Pc(679) byte local679 = Static105.aClass4_Sub13_Sub1_3.method1211();
				@Pc(683) byte local683 = Static105.aClass4_Sub13_Sub1_3.method1224();
				@Pc(687) byte local687 = Static105.aClass4_Sub13_Sub1_3.method1227();
				local172 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local176 = Static105.aClass4_Sub13_Sub1_3.method1223();
				@Pc(701) int local701 = (local176 & 0x7) + Static74.anInt1854;
				local709 = Static89.anInt2077 + (local176 >> 4 & 0x7);
				@Pc(720) Class4_Sub4_Sub1_Sub2_Sub2 local720;
				if (local12 == Static18.anInt467) {
					local720 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1;
				} else {
					local720 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local12];
				}
				if (local720 != null) {
					@Pc(730) Class4_Sub4_Sub5 local730 = Static24.method477(local152);
					@Pc(738) int local738 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local709][local701];
					@Pc(748) int local748 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local709 + 1][local701];
					@Pc(760) int local760 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local709 + 1][local701 + 1];
					@Pc(770) int local770 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local709][local701 + 1];
					@Pc(780) Class4_Sub4_Sub1_Sub6 local780 = local730.method728(local138, local748, local760, local30, local738, local770);
					if (local780 != null) {
						Static114.method1928(local172 + 1, local146 + 1, 0, 0, local142, local701, local709, -1, Static129.anInt3003);
						local720.anInt2661 = local172 + Static81.anInt1944;
						local720.anInt2656 = Static81.anInt1944 + local146;
						local720.aClass4_Sub4_Sub1_Sub6_3 = local780;
						@Pc(813) int local813 = local730.anInt1075;
						@Pc(816) int local816 = local730.anInt1085;
						if (local138 == 1 || local138 == 3) {
							local813 = local730.anInt1085;
							local816 = local730.anInt1075;
						}
						@Pc(835) byte local835;
						if (local683 < local687) {
							local835 = local687;
							local687 = local683;
							local683 = local835;
						}
						local720.anInt2666 = local701 * 128 + local816 * 64;
						local720.anInt2652 = local709 * 128 + local813 * 64;
						if (local651 > local679) {
							local835 = local651;
							local651 = local679;
							local679 = local835;
						}
						local720.anInt2663 = Static54.method1001(local720.anInt2652, local720.anInt2666, Static129.anInt3003);
						local720.anInt2662 = local683 + local709;
						local720.anInt2659 = local701 + local679;
						local720.anInt2667 = local709 + local687;
						local720.anInt2654 = local701 + local651;
					}
				}
			}
			if (Static115.anInt2762 == 127) {
				local12 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local20 = (local12 >> 4 & 0x7) + Static89.anInt2077;
				local26 = Static74.anInt1854 + (local12 & 0x7);
				local30 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local138 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local142 = local138 >> 4 & 0xF;
				local146 = local138 & 0x7;
				local152 = Static105.aClass4_Sub13_Sub1_3.method1223();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					local158 = local142 + 1;
					if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0] >= local20 - local158 && local20 + local158 >= Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0] && local26 - local158 <= Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0] && local26 + local158 >= Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0] && Static107.anInt2537 != 0 && local146 > 0 && Static130.anInt3022 < 50) {
						Static131.anIntArray339[Static130.anInt3022] = local30;
						Static87.anIntArray206[Static130.anInt3022] = local146;
						anIntArray204[Static130.anInt3022] = local152;
						Static20.aClass73Array1[Static130.anInt3022] = null;
						Static87.anIntArray207[Static130.anInt3022] = (local20 << 16) - (-(local26 << 8) - local142);
						Static130.anInt3022++;
					}
				}
			}
			if (Static115.anInt2762 == 72) {
				local12 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local20 = (local12 >> 4 & 0x7) + Static89.anInt2077;
				local26 = (local12 & 0x7) + Static74.anInt1854;
				local30 = Static105.aClass4_Sub13_Sub1_3.method1235();
				local142 = local30 & 0x3;
				local138 = local30 >> 2;
				local146 = Static45.anIntArray112[local138];
				local152 = Static105.aClass4_Sub13_Sub1_3.method1210();
				if (local20 >= 0 && local26 >= 0 && local20 < 103 && local26 < 103) {
					local158 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local20][local26];
					local162 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local20 + 1][local26];
					local172 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local20][local26 + 1];
					local166 = Static58.anIntArrayArrayArray5[Static129.anInt3003][local20 + 1][local26 + 1];
					if (local146 == 0) {
						@Pc(1165) Class14 local1165 = Static7.aClass28_3.method764(Static129.anInt3003, local20, local26);
						if (local1165 != null) {
							local709 = local1165.anInt456 >> 14 & 0x7FFF;
							if (local138 == 2) {
								local1165.aClass4_Sub4_Sub1_3 = new Class4_Sub4_Sub1_Sub3(local709, 2, local142 + 4, local158, local162, local166, local172, local152, false, local1165.aClass4_Sub4_Sub1_3);
								local1165.aClass4_Sub4_Sub1_2 = new Class4_Sub4_Sub1_Sub3(local709, 2, local142 + 1 & 0x3, local158, local162, local166, local172, local152, false, local1165.aClass4_Sub4_Sub1_2);
							} else {
								local1165.aClass4_Sub4_Sub1_3 = new Class4_Sub4_Sub1_Sub3(local709, local138, local142, local158, local162, local166, local172, local152, false, local1165.aClass4_Sub4_Sub1_3);
							}
						}
					}
					if (local146 == 1) {
						@Pc(1246) Class24 local1246 = Static7.aClass28_3.method761(Static129.anInt3003, local20, local26);
						if (local1246 != null) {
							local1246.aClass4_Sub4_Sub1_4 = new Class4_Sub4_Sub1_Sub3(local1246.anInt935 >> 14 & 0x7FFF, 4, 0, local158, local162, local166, local172, local152, false, local1246.aClass4_Sub4_Sub1_4);
						}
					}
					if (local146 == 2) {
						if (local138 == 11) {
							local138 = 10;
						}
						@Pc(1285) Class59 local1285 = Static7.aClass28_3.method773(Static129.anInt3003, local20, local26);
						if (local1285 != null) {
							local1285.aClass4_Sub4_Sub1_8 = new Class4_Sub4_Sub1_Sub3(local1285.anInt2274 >> 14 & 0x7FFF, local138, local142, local158, local162, local166, local172, local152, false, local1285.aClass4_Sub4_Sub1_8);
						}
					}
					if (local146 == 3) {
						@Pc(1317) Class6 local1317 = Static7.aClass28_3.method758(Static129.anInt3003, local20, local26);
						if (local1317 != null) {
							local1317.aClass4_Sub4_Sub1_1 = new Class4_Sub4_Sub1_Sub3(local1317.anInt65 >> 14 & 0x7FFF, 22, local142, local158, local162, local166, local172, local152, false, local1317.aClass4_Sub4_Sub1_1);
						}
					}
				}
			} else if (Static115.anInt2762 == 222) {
				local12 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local20 = Static89.anInt2077 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static74.anInt1854;
				local30 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local138 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local142 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					local26 = local26 * 128 + 64;
					local20 = local20 * 128 + 64;
					@Pc(1419) Class4_Sub4_Sub1_Sub1 local1419 = new Class4_Sub4_Sub1_Sub1(local30, Static129.anInt3003, local20, local26, Static54.method1001(local20, local26, Static129.anInt3003) - local138, local142, Static81.anInt1944);
					Static127.aClass70_18.method1931(local1419);
				}
			} else if (Static115.anInt2762 == 122) {
				local12 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local20 = (local12 >> 4 & 0x7) + Static89.anInt2077;
				local26 = Static74.anInt1854 + (local12 & 0x7);
				local30 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local138 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local142 = local138 >> 2;
				local152 = Static45.anIntArray112[local142];
				local146 = local138 & 0x3;
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					Static114.method1928(-1, 0, local146, local142, local152, local26, local20, local30, Static129.anInt3003);
				}
			}
		}
	}
}
