import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dfa", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
	public static int anInt1440;

	@OriginalMember(owner = "client!dfa", name = "H", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_37 = new Class40(27, 8);

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)Lclient!maa;")
	public static Class6_Sub34 method1338() {
		if (Static349.aClass275_155 == null || Static21.aClass27_1 == null) {
			return null;
		}
		Static21.aClass27_1.method463(Static349.aClass275_155);
		@Pc(22) Class6_Sub34 local22 = (Class6_Sub34) Static21.aClass27_1.method458();
		if (local22 == null) {
			return null;
		} else {
			@Pc(32) Class179 local32 = Static349.aClass276_3.method6396(local22.anInt4907);
			return local32 != null && local32.aBoolean282 && local32.method3962(Static349.anInterface5_2) ? local22 : Static452.method6444();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(III)Z")
	public static boolean method1340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static204.method3009(arg1, arg0) | (arg1 & 0x40000) != 0 || Static85.method1344(arg0, arg1);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZI)[[[B")
	public static byte[][][] method1341(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local26 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local69 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(156) int local156;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local113 <= local156) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(205) int local205;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local156 >> 1 >= local205) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(247) int local247;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local247 = 0; local247 < arg0; local247++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local247 >= local205 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(309) int local309;
		for (local247 = 0; local247 < arg0; local247++) {
			for (local309 = arg0 - 1; local309 >= 0; local309--) {
				if (local247 >> 1 >= local309) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(355) int local355;
		for (local309 = arg0 - 1; local309 >= 0; local309--) {
			for (local355 = arg0 - 1; local355 >= 0; local355--) {
				if (local309 << 1 <= local355) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(399) int local399;
		for (local355 = arg0 - 1; local355 >= 0; local355--) {
			for (local399 = arg0 - 1; local399 >= 0; local399--) {
				if (local355 >> 1 >= local399) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(438) int local438;
		for (local399 = arg0 - 1; local399 >= 0; local399--) {
			for (local438 = 0; local438 < arg0; local438++) {
				if (local399 << 1 <= local438) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(479) int local479;
		for (local438 = 0; local438 < arg0; local438++) {
			for (local479 = 0; local479 < arg0; local479++) {
				if (local438 >> 1 >= local479) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(528) int local528;
		for (local479 = 0; local479 < arg0; local479++) {
			for (local528 = arg0 - 1; local528 >= 0; local528--) {
				if (local479 << 1 <= local528) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(572) int local572;
		for (local528 = arg0 - 1; local528 >= 0; local528--) {
			for (local572 = 0; local572 < arg0; local572++) {
				if (local572 >= local528 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(617) int local617;
		for (local572 = 0; local572 < arg0; local572++) {
			for (local617 = 0; local617 < arg0; local617++) {
				if (local617 <= local572 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(662) int local662;
		for (local617 = 0; local617 < arg0; local617++) {
			for (local662 = arg0 - 1; local662 >= 0; local662--) {
				if (local617 >> 1 <= local662) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(712) int local712;
		for (local662 = arg0 - 1; local662 >= 0; local662--) {
			for (local712 = arg0 - 1; local712 >= 0; local712--) {
				if (local662 << 1 >= local712) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(753) int local753;
		for (local712 = arg0 - 1; local712 >= 0; local712--) {
			for (local753 = arg0 - 1; local753 >= 0; local753--) {
				if (local753 >= local712 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(796) int local796;
		for (local753 = arg0 - 1; local753 >= 0; local753--) {
			for (local796 = 0; local796 < arg0; local796++) {
				if (local796 <= local753 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(838) int local838;
		for (local796 = 0; local796 < arg0; local796++) {
			for (local838 = 0; local838 < arg0; local838++) {
				if (local796 >> 1 <= local838) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(883) int local883;
		for (local838 = 0; local838 < arg0; local838++) {
			for (local883 = arg0 - 1; local883 >= 0; local883--) {
				if (local883 <= local838 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(925) int local925;
		for (local883 = 0; local883 < arg0; local883++) {
			for (local925 = 0; local925 < arg0; local925++) {
				if (arg0 / 2 >= local925) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(968) int local968;
		for (local925 = 0; local925 < arg0; local925++) {
			for (local968 = 0; local968 < arg0; local968++) {
				if (local925 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1011) int local1011;
		for (local968 = 0; local968 < arg0; local968++) {
			for (local1011 = 0; local1011 < arg0; local1011++) {
				if (arg0 / 2 <= local1011) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1058) int local1058;
		for (local1011 = 0; local1011 < arg0; local1011++) {
			for (local1058 = 0; local1058 < arg0; local1058++) {
				if (local1011 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1106) int local1106;
		for (local1058 = 0; local1058 < arg0; local1058++) {
			for (local1106 = 0; local1106 < arg0; local1106++) {
				if (local1106 <= local1058 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1158) int local1158;
		for (local1106 = arg0 - 1; local1106 >= 0; local1106--) {
			for (local1158 = 0; local1158 < arg0; local1158++) {
				if (local1158 <= local1106 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1207) int local1207;
		for (local1158 = arg0 - 1; local1158 >= 0; local1158--) {
			for (local1207 = arg0 - 1; local1207 >= 0; local1207--) {
				if (local1207 <= local1158 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1252) int local1252;
		for (local1207 = 0; local1207 < arg0; local1207++) {
			for (local1252 = arg0 - 1; local1252 >= 0; local1252--) {
				if (local1207 - arg0 / 2 >= local1252) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1300) int local1300;
		for (local1252 = 0; local1252 < arg0; local1252++) {
			for (local1300 = 0; local1300 < arg0; local1300++) {
				if (local1300 >= local1252 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1347) int local1347;
		for (local1300 = arg0 - 1; local1300 >= 0; local1300--) {
			for (local1347 = 0; local1347 < arg0; local1347++) {
				if (local1347 >= local1300 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1399) int local1399;
		for (local1347 = arg0 - 1; local1347 >= 0; local1347--) {
			for (local1399 = arg0 - 1; local1399 >= 0; local1399--) {
				if (local1347 - arg0 / 2 <= local1399) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1399 = 0; local1399 < arg0; local1399++) {
			for (@Pc(1448) int local1448 = arg0 - 1; local1448 >= 0; local1448--) {
				if (local1448 >= local1399 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!fca;IIZB)V")
	public static void method1342(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(16) int local16 = arg0.anInt2340;
		if (arg0.aByte42 == 0) {
			arg0.anInt2340 = arg0.anInt2276;
		} else if (arg0.aByte42 == 1) {
			arg0.anInt2340 = arg2 - arg0.anInt2276;
		} else if (arg0.aByte42 == 2) {
			arg0.anInt2340 = arg0.anInt2276 * arg2 >> 14;
		}
		@Pc(55) int local55 = arg0.anInt2305;
		if (arg0.aByte43 == 0) {
			arg0.anInt2305 = arg0.anInt2347;
		} else if (arg0.aByte43 == 1) {
			arg0.anInt2305 = arg1 - arg0.anInt2347;
		} else if (arg0.aByte43 == 2) {
			arg0.anInt2305 = arg0.anInt2347 * arg1 >> 14;
		}
		if (arg0.aByte42 == 4) {
			arg0.anInt2340 = arg0.anInt2305 * arg0.anInt2290 / arg0.anInt2284;
		}
		if (arg0.aByte43 == 4) {
			arg0.anInt2305 = arg0.anInt2284 * arg0.anInt2340 / arg0.anInt2290;
		}
		if (Static446.aBoolean529 && (Static65.method862(arg0).anInt7805 != 0 || arg0.anInt2264 == 0)) {
			if (arg0.anInt2305 < 5 && arg0.anInt2340 < 5) {
				arg0.anInt2305 = 5;
				arg0.anInt2340 = 5;
			} else {
				if (arg0.anInt2305 <= 0) {
					arg0.anInt2305 = 5;
				}
				if (arg0.anInt2340 <= 0) {
					arg0.anInt2340 = 5;
				}
			}
		}
		if (arg0.anInt2324 == Static197.anInt3440) {
			Static405.aClass97_11 = arg0;
		}
		if (arg3 && arg0.anObjectArray18 != null && (arg0.anInt2340 != local16 || local55 != arg0.anInt2305)) {
			@Pc(195) Class6_Sub36 local195 = new Class6_Sub36();
			local195.aClass97_7 = arg0;
			local195.anObjectArray34 = arg0.anObjectArray18;
			Static446.aClass275_163.method6370(local195);
		}
	}
}
