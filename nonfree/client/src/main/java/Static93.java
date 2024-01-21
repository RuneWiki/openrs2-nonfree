import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!q", name = "n", descriptor = "[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array9;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "I")
	public static int anInt2527;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	public static int anInt2530;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[Lclient!ac;")
	public static Class4[] aClass4Array1 = new Class4[4];

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_1339 = Static6.method100("hel");

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!he;")
	private static Class26 aClass26_1340 = Static6.method100("Use");

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!sf;")
	public static Class66 aClass66_21 = new Class66(64);

	@OriginalMember(owner = "client!q", name = "k", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!q", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_1341 = Static6.method100("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!q", name = "t", descriptor = "I")
	public static int anInt2529 = 0;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "I")
	public static int anInt2533 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "[Lclient!rb;")
	public static Class3_Sub1_Sub5_Sub1_Sub2[] aClass3_Sub1_Sub5_Sub1_Sub2Array1 = new Class3_Sub1_Sub5_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!q", name = "E", descriptor = "Lclient!he;")
	public static Class26 aClass26_1342 = Static6.method100("Okay");

	@OriginalMember(owner = "client!q", name = "G", descriptor = "Lclient!he;")
	public static Class26 aClass26_1343 = aClass26_1340;

	@OriginalMember(owner = "client!q", name = "H", descriptor = "I")
	public static int anInt2538 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I")
	public static int method1685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(19) int local19 = arg0 - 1 & arg2;
		@Pc(23) int local23 = arg2 / arg0;
		@Pc(33) int local33 = Static80.method1397(local23, local7);
		@Pc(40) int local40 = Static80.method1397(local23, local7 + 1);
		@Pc(47) int local47 = Static80.method1397(local23 + 1, local7);
		@Pc(56) int local56 = Static80.method1397(local23 + 1, local7 + 1);
		@Pc(63) int local63 = Static25.method2159(local40, arg0, local33, local13);
		@Pc(70) int local70 = Static25.method2159(local56, arg0, local47, local13);
		return Static25.method2159(local70, arg0, local63, local19);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method1686() {
		for (@Pc(10) Class3_Sub8 local10 = (Class3_Sub8) Static99.aClass65_70.method1958(); local10 != null; local10 = (Class3_Sub8) Static99.aClass65_70.method1962()) {
			if (local10.anInt1142 > 0) {
				local10.anInt1142--;
			}
			if (local10.anInt1142 != 0) {
				if (local10.anInt1140 > 0) {
					local10.anInt1140--;
				}
				if (local10.anInt1140 == 0 && local10.anInt1141 >= 1 && local10.anInt1138 >= 1 && local10.anInt1141 <= 102 && local10.anInt1138 <= 102 && (local10.anInt1139 < 0 || Static96.method1777(local10.anInt1139, local10.anInt1136))) {
					Static42.method811(local10.anInt1139, local10.anInt1146, local10.anInt1141, local10.anInt1137, local10.anInt1136, local10.anInt1138, local10.anInt1145);
					local10.anInt1140 = -1;
					if (local10.anInt1139 == local10.anInt1144 && local10.anInt1144 == -1) {
						local10.method2201();
					} else if (local10.anInt1144 == local10.anInt1139 && local10.anInt1143 == local10.anInt1137 && local10.anInt1147 == local10.anInt1136) {
						local10.method2201();
					}
				}
			} else if (local10.anInt1144 < 0 || Static96.method1777(local10.anInt1144, local10.anInt1147)) {
				Static42.method811(local10.anInt1144, local10.anInt1146, local10.anInt1141, local10.anInt1143, local10.anInt1147, local10.anInt1138, local10.anInt1145);
				local10.method2201();
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method1687() {
		Static63.anInt1934 = 0;
		Static1.anInt8 = 0;
		Static65.anInt1955 = -1;
		Static107.aClass3_Sub11_Sub1_3.anInt1562 = 0;
		Static85.anInt2341 = -1;
		Static67.anInt2794 = -1;
		Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
		anInt2522 = 0;
		Static104.anInt2841 = 0;
		Static56.anInt1695 = 0;
		Static109.aBoolean162 = false;
		Static113.anInt3001 = 0;
		Static72.anInt2056 = -1;
		for (@Pc(40) int local40 = 0; local40 < Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1.length; local40++) {
			if (Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local40] != null) {
				Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local40].anInt2749 = -1;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < aClass3_Sub1_Sub5_Sub1_Sub2Array1.length; local62++) {
			if (aClass3_Sub1_Sub5_Sub1_Sub2Array1[local62] != null) {
				aClass3_Sub1_Sub5_Sub1_Sub2Array1[local62].anInt2749 = -1;
			}
		}
		Static46.method889();
		Static4.method62(30);
		for (@Pc(85) int local85 = 0; local85 < 100; local85++) {
			Static72.aBooleanArray19[local85] = true;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method1688() {
		@Pc(14) int local14;
		for (@Pc(7) int local7 = -1; local7 < Static62.anInt1885; local7++) {
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static117.anIntArray370[local7];
			}
			@Pc(24) Class3_Sub1_Sub5_Sub1_Sub1 local24 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local14];
			if (local24 != null && local24.anInt2719 > 0) {
				local24.anInt2719--;
				if (local24.anInt2719 == 0) {
					local24.aClass26_1479 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static133.anInt560; local14++) {
			@Pc(56) int local56 = Static48.anIntArray151[local14];
			@Pc(60) Class3_Sub1_Sub5_Sub1_Sub2 local60 = aClass3_Sub1_Sub5_Sub1_Sub2Array1[local56];
			if (local60 != null && local60.anInt2719 > 0) {
				local60.anInt2719--;
				if (local60.anInt2719 == 0) {
					local60.aClass26_1479 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!ef;Lclient!he;Lclient!he;)Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 method1689(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class26 arg2) {
		@Pc(14) int local14 = arg0.method574(arg1);
		@Pc(20) int local20 = arg0.method567(arg2, local14);
		return Static100.method2211(local20, local14, arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIIII)V")
	public static void method1690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static62.aClass69_1.method2042(arg0, arg1, arg4);
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(42) int local42;
		@Pc(28) int local28;
		@Pc(56) int local56;
		@Pc(62) int local62;
		if (local7 != 0) {
			local20 = Static62.aClass69_1.method2062(arg0, arg1, arg4, local7);
			local26 = local20 >> 6 & 0x3;
			local28 = arg3;
			if (local7 > 0) {
				local28 = arg2;
			}
			@Pc(38) int[] local38 = Static6.aClass3_Sub1_Sub4_Sub3_1.anIntArray308;
			local42 = local20 & 0x1F;
			local56 = (52736 - arg4 * 512) * 4 + arg1 * 4 + 24624;
			local62 = local7 >> 14 & 0x7FFF;
			@Pc(66) Class3_Sub1_Sub1 local66 = Static4.method68(local62);
			if (local66.anInt71 == -1) {
				if (local42 == 0 || local42 == 2) {
					if (local26 == 0) {
						local38[local56] = local28;
						local38[local56 + 512] = local28;
						local38[local56 + 1024] = local28;
						local38[local56 + 1536] = local28;
					} else if (local26 == 1) {
						local38[local56] = local28;
						local38[local56 + 1] = local28;
						local38[local56 + 2] = local28;
						local38[local56 + 3] = local28;
					} else if (local26 == 2) {
						local38[local56 + 3] = local28;
						local38[local56 + 515] = local28;
						local38[local56 + 1027] = local28;
						local38[local56 + 1539] = local28;
					} else if (local26 == 3) {
						local38[local56 + 1536] = local28;
						local38[local56 + 1537] = local28;
						local38[local56 + 1536 + 2] = local28;
						local38[local56 + 1536 + 3] = local28;
					}
				}
				if (local42 == 3) {
					if (local26 == 0) {
						local38[local56] = local28;
					} else if (local26 == 1) {
						local38[local56 + 3] = local28;
					} else if (local26 == 2) {
						local38[local56 + 1539] = local28;
					} else if (local26 == 3) {
						local38[local56 + 1536] = local28;
					}
				}
				if (local42 == 2) {
					if (local26 == 3) {
						local38[local56] = local28;
						local38[local56 + 512] = local28;
						local38[local56 + 1024] = local28;
						local38[local56 + 1536] = local28;
					} else if (local26 == 0) {
						local38[local56] = local28;
						local38[local56 + 1] = local28;
						local38[local56 + 2] = local28;
						local38[local56 + 3] = local28;
					} else if (local26 == 1) {
						local38[local56 + 3] = local28;
						local38[local56 + 512 + 3] = local28;
						local38[local56 + 1024 + 3] = local28;
						local38[local56 + 3 + 1536] = local28;
					} else if (local26 == 2) {
						local38[local56 + 1536] = local28;
						local38[local56 + 1537] = local28;
						local38[local56 + 1536 + 2] = local28;
						local38[local56 + 3 + 1536] = local28;
					}
				}
			} else {
				@Pc(370) Class3_Sub1_Sub4_Sub1 local370 = Static1.aClass3_Sub1_Sub4_Sub1Array1[local66.anInt71];
				if (local370 != null) {
					@Pc(383) int local383 = (local66.anInt86 * 4 - local370.anInt509) / 2;
					@Pc(394) int local394 = (local66.anInt96 * 4 - local370.anInt511) / 2;
					local370.method345(local383 + arg1 * 4 + 48, 48 - -((-local66.anInt96 + -arg4 + 104) * 4) - -local394);
				}
			}
		}
		local7 = Static62.aClass69_1.method2019(arg0, arg1, arg4);
		if (local7 != 0) {
			local20 = Static62.aClass69_1.method2062(arg0, arg1, arg4, local7);
			local26 = local20 >> 6 & 0x3;
			local42 = local20 & 0x1F;
			local28 = local7 >> 14 & 0x7FFF;
			@Pc(457) Class3_Sub1_Sub1 local457 = Static4.method68(local28);
			@Pc(488) int local488;
			if (local457.anInt71 != -1) {
				@Pc(557) Class3_Sub1_Sub4_Sub1 local557 = Static1.aClass3_Sub1_Sub4_Sub1Array1[local457.anInt71];
				if (local557 != null) {
					local62 = (local457.anInt86 * 4 - local557.anInt509) / 2;
					local488 = (local457.anInt96 * 4 - local557.anInt511) / 2;
					local557.method345(local62 + arg1 * 4 + 48, (-local457.anInt96 + (104 - arg4)) * 4 + 48 - -local488);
				}
			} else if (local42 == 9) {
				local56 = 15658734;
				@Pc(471) int[] local471 = Static6.aClass3_Sub1_Sub4_Sub3_1.anIntArray308;
				if (local7 > 0) {
					local56 = 15597568;
				}
				local488 = (103 - arg4) * 2048 + arg1 * 4 + 24624;
				if (local26 == 0 || local26 == 2) {
					local471[local488 + 1536] = local56;
					local471[local488 + 1024 + 1] = local56;
					local471[local488 + 512 + 2] = local56;
					local471[local488 + 3] = local56;
				} else {
					local471[local488] = local56;
					local471[local488 + 513] = local56;
					local471[local488 + 1024 + 2] = local56;
					local471[local488 + 1539] = local56;
				}
			}
		}
		local7 = Static62.aClass69_1.method2017(arg0, arg1, arg4);
		if (local7 == 0) {
			return;
		}
		local20 = local7 >> 14 & 0x7FFF;
		@Pc(621) Class3_Sub1_Sub1 local621 = Static4.method68(local20);
		if (local621.anInt71 == -1) {
			return;
		}
		@Pc(631) Class3_Sub1_Sub4_Sub1 local631 = Static1.aClass3_Sub1_Sub4_Sub1Array1[local621.anInt71];
		if (local631 != null) {
			@Pc(643) int local643 = (local621.anInt96 * 4 - local631.anInt511) / 2;
			local28 = (local621.anInt86 * 4 - local631.anInt509) / 2;
			local631.method345(local28 + arg1 * 4 + 48, local643 + (-local621.anInt96 + -arg4 + 104) * 4 + 48);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!he;Lclient!ef;ILclient!he;Lclient!ef;)Lclient!od;")
	public static Class3_Sub1_Sub4_Sub2_Sub1 method1691(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class16 arg3) {
		@Pc(16) int local16 = arg1.method574(arg0);
		@Pc(22) int local22 = arg1.method567(arg2, local16);
		return Static24.method512(arg3, arg1, local16, local22);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method1692() {
		aClass3_Sub1_Sub5_Sub1_Sub2Array1 = null;
		aClass26_1340 = null;
		aClass66_21 = null;
		aClass26_1342 = null;
		aClass26_1343 = null;
		aClass26_1341 = null;
		aClass3_Sub1_Sub4_Sub1Array9 = null;
		aClass26_1339 = null;
		aClass4Array1 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	public static int method1693(@OriginalArg(1) int arg0) {
		@Pc(5) Class3_Sub1_Sub6 local5 = Static35.method704(arg0);
		@Pc(12) int local12 = local5.anInt889;
		@Pc(15) int local15 = local5.anInt895;
		@Pc(22) int local22 = Class3_Sub1_Sub10.anIntArray177[local12 - local15];
		@Pc(25) int local25 = local5.anInt894;
		return Static52.anIntArray159[local25] >> local15 & local22;
	}
}
