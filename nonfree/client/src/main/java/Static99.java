import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!ta", name = "P", descriptor = "Lclient!bf;")
	public static Class11 aClass11_62;

	@OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
	public static int anInt2503;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1125 = Static56.method972("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1129 = Static56.method972("Trade)4compete");

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1126 = aClass5_1129;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1127 = aClass5_1125;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	public static int anInt2488 = 0;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1128 = Static56.method972("backbase1");

	@OriginalMember(owner = "client!ta", name = "R", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1130 = Static56.method972("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method1658() {
		aClass5_1128 = null;
		aClass5_1129 = null;
		aClass5_1126 = null;
		aClass5_1130 = null;
		aClass11_62 = null;
		aClass5_1127 = null;
		aClass5_1125 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!bf;BLclient!bf;Lclient!bb;Z)V")
	public static void method1659(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		Static79.aBoolean94 = arg3;
		Static5.aClass11_8 = arg0;
		Static47.aClass11_29 = arg1;
		Static58.anInt1613 = Static47.aClass11_29.method1875(10);
		Static95.aClass3_Sub1_Sub2_Sub1_4 = arg2;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZI)V")
	public static void method1660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (local12 = 0; local12 < 8; local12++) {
				Static111.anIntArrayArrayArray7[arg0][local8 + arg2][arg1 + local12] = 0;
			}
		}
		if (arg2 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static111.anIntArrayArrayArray7[arg0][arg2][arg1 + local12] = Static111.anIntArrayArrayArray7[arg0][arg2 - 1][arg1 + local12];
			}
		}
		if (arg1 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static111.anIntArrayArrayArray7[arg0][local12 + arg2][arg1] = Static111.anIntArrayArrayArray7[arg0][arg2 + local12][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static111.anIntArrayArrayArray7[arg0][arg2 - 1][arg1] != 0) {
			Static111.anIntArrayArrayArray7[arg0][arg2][arg1] = Static111.anIntArrayArrayArray7[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static111.anIntArrayArrayArray7[arg0][arg2][arg1 - 1] != 0) {
			Static111.anIntArrayArrayArray7[arg0][arg2][arg1] = Static111.anIntArrayArrayArray7[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static111.anIntArrayArrayArray7[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static111.anIntArrayArrayArray7[arg0][arg2][arg1] = Static111.anIntArrayArrayArray7[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!va;B)V")
	public static void method1661(@OriginalArg(0) Class3_Sub1_Sub2_Sub4 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static9.anIntArray51.length; local15++) {
			Static9.anIntArray51[local15] = 0;
		}
		@Pc(38) int local38;
		for (@Pc(28) int local28 = 0; local28 < 5000; local28++) {
			local38 = (int) ((double) 256 * 128.0D * Math.random());
			Static9.anIntArray51[local38] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(68) int local68;
		for (local38 = 0; local38 < 20; local38++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local68 = local59 + (local55 << 7);
					Static23.anIntArray92[local68] = (Static9.anIntArray51[local68 - 128] + Static9.anIntArray51[local68 - 1] + Static9.anIntArray51[local68 + 1] + Static9.anIntArray51[local68 + 128]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static9.anIntArray51;
			Static9.anIntArray51 = Static23.anIntArray92;
			Static23.anIntArray92 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt2810; local59++) {
			for (local68 = 0; local68 < arg0.anInt2809; local68++) {
				if (arg0.aByteArray24[local55++] != 0) {
					@Pc(151) int local151 = local68 + arg0.anInt2813 + 16;
					@Pc(158) int local158 = arg0.anInt2808 + local59 + 16;
					@Pc(164) int local164 = (local158 << 7) + local151;
					Static9.anIntArray51[local164] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)V")
	public static void method1662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static95.aClass3_Sub6_Sub1_3.method1645(153);
		Static95.aClass3_Sub6_Sub1_3.method1589(arg0);
		Static95.aClass3_Sub6_Sub1_3.method1611(arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 method1663() {
		@Pc(3) Class3_Sub1_Sub2_Sub4 local3 = new Class3_Sub1_Sub2_Sub4();
		local3.anIntArray364 = Static89.anIntArray256;
		local3.anInt2812 = Static80.anInt1994;
		local3.aByteArray24 = Static38.aByteArrayArray6[0];
		local3.anInt2808 = Static63.anIntArray375[0];
		local3.anInt2809 = Static56.anIntArray170[0];
		local3.anInt2811 = Static14.anInt2882;
		local3.anInt2810 = Static116.anIntArray382[0];
		local3.anInt2813 = Static50.anIntArray157[0];
		Static21.method436();
		return local3;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Z")
	public static boolean method1664() {
		if (Static58.aClass18_1 == null) {
			return false;
		}
		@Pc(149) int local149;
		try {
			@Pc(13) int local13 = Static58.aClass18_1.method408();
			if (local13 == 0) {
				return false;
			}
			if (Static5.anInt353 == -1) {
				local13--;
				Static58.aClass18_1.method404(1, Static75.aClass3_Sub6_Sub1_2.aByteArray17, 0);
				Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
				Static5.anInt353 = Static75.aClass3_Sub6_Sub1_2.method1647();
				Static61.anInt1652 = Static16.anIntArray65[Static5.anInt353];
			}
			if (Static61.anInt1652 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static58.aClass18_1.method404(1, Static75.aClass3_Sub6_Sub1_2.aByteArray17, 0);
				Static61.anInt1652 = Static75.aClass3_Sub6_Sub1_2.aByteArray17[0] & 0xFF;
			}
			if (Static61.anInt1652 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static58.aClass18_1.method404(2, Static75.aClass3_Sub6_Sub1_2.aByteArray17, 0);
				local13 -= 2;
				Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
				Static61.anInt1652 = Static75.aClass3_Sub6_Sub1_2.method1603();
			}
			if (local13 < Static61.anInt1652) {
				return false;
			}
			Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
			Static58.aClass18_1.method404(Static61.anInt1652, Static75.aClass3_Sub6_Sub1_2.aByteArray17, 0);
			Static33.anInt927 = Static108.anInt2843;
			Static108.anInt2843 = Static105.anInt2687;
			Static75.anInt1919 = 0;
			Static105.anInt2687 = Static5.anInt353;
			@Pc(126) int local126;
			if (Static5.anInt353 == 205) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1604();
				if (local126 == 65535) {
					local126 = -1;
				}
				Static74.method1219(local126);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 155) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1625();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1621();
				if (local149 == 65535) {
					local149 = -1;
				}
				Static58.method1007(local126, local149);
				Static5.anInt353 = -1;
				return true;
			}
			@Pc(181) int local181;
			@Pc(185) int local185;
			if (Static5.anInt353 == 156) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local185 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static73.aBooleanArray15[local126] = true;
				Static14.anIntArray372[local126] = local149;
				Static3.anIntArray35[local126] = local181;
				Static74.anIntArray216[local126] = local185;
				Static5.anIntArray37[local126] = 0;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 148) {
				Static27.anInt819 = Static75.aClass3_Sub6_Sub1_2.method1618();
				Static5.anInt353 = -1;
				if (Static27.anInt819 == Static60.anInt2979) {
					if (Static27.anInt819 == 3) {
						Static60.anInt2979 = 1;
					} else {
						Static60.anInt2979 = 3;
					}
					Static116.aBoolean157 = true;
				}
				return true;
			}
			@Pc(243) Class5 local243;
			if (Static5.anInt353 == 192) {
				local243 = Static75.aClass3_Sub6_Sub1_2.method1627();
				@Pc(250) Object[] local250 = new Object[local243.method144() + 1];
				for (local181 = local243.method144() - 1; local181 >= 0; local181--) {
					if (local243.method164(local181) == 115) {
						local250[local181 + 1] = Static75.aClass3_Sub6_Sub1_2.method1627();
					} else {
						local250[local181 + 1] = Integer.valueOf(Static75.aClass3_Sub6_Sub1_2.method1614());
					}
				}
				local250[0] = Integer.valueOf(Static75.aClass3_Sub6_Sub1_2.method1614());
				Static68.method997(0, local250, null, 0, null, 0);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 111) {
				Static38.aBoolean51 = true;
				Static42.anInt1187 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static37.anInt1017 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static74.anInt1896 = Static75.aClass3_Sub6_Sub1_2.method1603();
				Static50.anInt1365 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static70.anInt1830 = Static75.aClass3_Sub6_Sub1_2.method1587();
				if (Static70.anInt1830 >= 100) {
					Static89.anInt2280 = Static42.anInt1187 * 128 + 64;
					Static60.anInt2989 = Static37.anInt1017 * 128 + 64;
					Static85.anInt2111 = Static15.method358(Static60.anInt2989, Static12.anInt480, Static89.anInt2280) - Static74.anInt1896;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 41) {
				Static100.method1671();
				Static5.anInt353 = -1;
				return false;
			}
			@Pc(405) Class3_Sub1_Sub17 local405;
			if (Static5.anInt353 == 137) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1614();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1614();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1603();
				if (local181 == 65535) {
					local181 = -1;
				}
				local405 = Static58.method1009(local149);
				if (local405.aBoolean127) {
					local405.anInt2586 = local181;
					local405.anInt2660 = local126;
				} else if (local181 == -1) {
					Static5.anInt353 = -1;
					local405.anInt2594 = 0;
					return true;
				} else {
					@Pc(423) Class3_Sub1_Sub3 local423 = Static37.method694(local181);
					local405.anInt2594 = 4;
					local405.anInt2661 = local423.anInt683;
					local405.anInt2642 = local423.anInt664 * 100 / local126;
					local405.anInt2608 = local181;
					local405.anInt2598 = local423.anInt689;
				}
				Static5.anInt353 = -1;
				return true;
			}
			@Pc(484) int local484;
			if (Static5.anInt353 == 3) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1632();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1604();
				local181 = local149 >> 10 & 0x1F;
				local185 = local149 >> 5 & 0x1F;
				local484 = local149 & 0x1F;
				@Pc(488) Class3_Sub1_Sub17 local488 = Static58.method1009(local126);
				local488.anInt2645 = (local185 << 11) + (local181 << 19) + (local484 << 3);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 204) {
				Static47.method870(Static56.aClass23_3, Static61.anInt1652, Static75.aClass3_Sub6_Sub1_2);
				Static5.anInt353 = -1;
				return true;
			}
			@Pc(527) long local527;
			if (Static5.anInt353 == 77) {
				local527 = Static75.aClass3_Sub6_Sub1_2.method1598();
				@Pc(533) Class5 local533 = Static105.method1751(Static75.aClass3_Sub6_Sub1_2).method132();
				Static64.method1084(Static82.method1301(local527).method147(), local533, 6);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 58) {
				Static116.aBoolean157 = true;
				local126 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1591();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1615();
				Static116.anIntArray384[local126] = local181;
				Static47.anIntArray150[local126] = local149;
				Static103.anIntArray313[local126] = 1;
				for (local185 = 0; local185 < 98; local185++) {
					if (local181 >= Class55.anIntArray265[local185]) {
						Static103.anIntArray313[local126] = local185 + 2;
					}
				}
				Static16.anInt602 = Static3.anInt289;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 147) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1632();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1604();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1603();
				local185 = Static75.aClass3_Sub6_Sub1_2.method1636();
				@Pc(627) Class3_Sub1_Sub17 local627 = Static58.method1009(local126);
				local627.anInt2598 = local181;
				local627.anInt2642 = local149;
				local627.anInt2661 = local185;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 159) {
				Static17.anInt616 = Static61.anInt1652 / 8;
				for (local126 = 0; local126 < Static17.anInt616; local126++) {
					Static56.aLongArray4[local126] = Static75.aClass3_Sub6_Sub1_2.method1598();
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 74) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1615();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1603();
				Static40.anIntArray132[local149] = local126;
				if (local126 != Static110.anIntArray373[local149]) {
					Static110.anIntArray373[local149] = local126;
					Static60.method1961(local149);
					if (Static100.anInt2515 != -1) {
						Static15.aBoolean22 = true;
					}
					Static116.aBoolean157 = true;
				}
				Static5.anInt353 = -1;
				Static110.anInt2891 = Static3.anInt289;
				return true;
			}
			if (Static5.anInt353 == 29) {
				Static3.method128();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 221) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1603();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1636();
				Static55.method950(local126);
				if (local149 != -1) {
					Static55.method950(local149);
				}
				if (Static89.anInt2288 != -1) {
					Static67.method1174(Static89.anInt2288);
					Static89.anInt2288 = -1;
				}
				if (Static106.anInt2736 != -1) {
					Static67.method1174(Static106.anInt2736);
					Static106.anInt2736 = -1;
				}
				if (Static88.anInt2255 != -1) {
					Static67.method1174(Static88.anInt2255);
					Static88.anInt2255 = -1;
				}
				if (Static63.anInt2924 == local126) {
					Static60.method1963(Static63.anInt2924);
				} else {
					Static67.method1174(Static63.anInt2924);
					Static63.anInt2924 = local126;
					Static116.method1971(35);
				}
				if (local126 == Static27.anInt824) {
					Static60.method1963(Static27.anInt824);
				} else {
					Static67.method1174(Static27.anInt824);
					Static27.anInt824 = local149;
				}
				Static68.anInt1553 = 0;
				Static85.anInt2100 = -1;
				Static45.method851(Static63.anInt2924);
				Static45.method851(Static27.anInt824);
				Static5.anInt353 = -1;
				return true;
			}
			@Pc(841) Class3_Sub1_Sub17 local841;
			@Pc(886) int local886;
			@Pc(899) int local899;
			if (Static5.anInt353 == 228) {
				Static116.aBoolean157 = true;
				local126 = Static75.aClass3_Sub6_Sub1_2.method1614();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1603();
				if (local126 >= 0) {
					local841 = Static58.method1009(local126);
				} else {
					local841 = null;
				}
				if (local841 != null) {
					for (local185 = 0; local185 < local841.anIntArray309.length; local185++) {
						local841.anIntArray309[local185] = 0;
						local841.anIntArray308[local185] = 0;
					}
				}
				Static78.method1276(local149);
				local185 = Static75.aClass3_Sub6_Sub1_2.method1603();
				for (local484 = 0; local484 < local185; local484++) {
					local886 = Static75.aClass3_Sub6_Sub1_2.method1618();
					if (local886 == 255) {
						local886 = Static75.aClass3_Sub6_Sub1_2.method1614();
					}
					local899 = Static75.aClass3_Sub6_Sub1_2.method1603();
					if (local841 != null && local841.anIntArray309.length > local484) {
						local841.anIntArray309[local484] = local899;
						local841.anIntArray308[local484] = local886;
					}
					Static61.method1071(local484, local149, local899 - 1, local886);
				}
				Static5.anInt353 = -1;
				Static65.anInt2441 = Static3.anInt289;
				return true;
			}
			if (Static5.anInt353 == 57) {
				Static15.anInt524 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static5.anInt353 = -1;
				Static116.aBoolean157 = true;
				return true;
			}
			if (Static5.anInt353 == 109 || Static5.anInt353 == 79 || Static5.anInt353 == 129 || Static5.anInt353 == 94 || Static5.anInt353 == 115 || Static5.anInt353 == 101 || Static5.anInt353 == 84 || Static5.anInt353 == 207 || Static5.anInt353 == 170 || Static5.anInt353 == 69 || Static5.anInt353 == 122) {
				Static13.method324();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 146) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1636();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1603();
				if (Static88.anInt2255 != -1) {
					Static67.method1174(Static88.anInt2255);
					Static88.anInt2255 = -1;
					Static15.aBoolean22 = true;
				}
				if (Static63.anInt2924 != -1) {
					Static67.method1174(Static63.anInt2924);
					Static63.anInt2924 = -1;
					Static116.method1971(30);
				}
				if (Static27.anInt824 != -1) {
					Static67.method1174(Static27.anInt824);
					Static27.anInt824 = -1;
				}
				if (local126 == Static89.anInt2288) {
					Static60.method1963(Static89.anInt2288);
				} else {
					Static67.method1174(Static89.anInt2288);
					Static89.anInt2288 = local126;
				}
				if (local149 == Static106.anInt2736) {
					Static60.method1963(Static106.anInt2736);
				} else {
					Static67.method1174(Static106.anInt2736);
					Static106.anInt2736 = local149;
				}
				Static100.aBoolean123 = true;
				Static116.aBoolean157 = true;
				Static85.anInt2100 = -1;
				if (Static68.anInt1553 != 0) {
					Static68.anInt1553 = 0;
					Static15.aBoolean22 = true;
				}
				Static45.method851(Static89.anInt2288);
				Static45.method851(Static106.anInt2736);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 154) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1624();
				Static57.aClass58_5 = Static56.aClass23_3.method524(local126);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 179) {
				local527 = Static75.aClass3_Sub6_Sub1_2.method1598();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1603();
				@Pc(1134) Class5 local1134 = Static82.method1301(local527).method147();
				for (local484 = 0; local484 < Static5.anInt346; local484++) {
					if (Static94.aLongArray2[local484] == local527) {
						if (Static57.anIntArray183[local484] != local181) {
							Static57.anIntArray183[local484] = local181;
							Static116.aBoolean157 = true;
							if (local181 > 0) {
								Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { local1134, Static44.aClass5_584 }), 5);
							}
							if (local181 == 0) {
								Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { local1134, Static33.aClass5_429 }), 5);
							}
						}
						local1134 = null;
						break;
					}
				}
				@Pc(1207) boolean local1207 = false;
				if (local1134 != null && Static5.anInt346 < 200) {
					Static94.aLongArray2[Static5.anInt346] = local527;
					Static34.aClass5Array8[Static5.anInt346] = local1134;
					Static57.anIntArray183[Static5.anInt346] = local181;
					Static116.aBoolean157 = true;
					Static5.anInt346++;
				}
				while (!local1207) {
					local1207 = true;
					for (local899 = 0; local899 < Static5.anInt346 - 1; local899++) {
						if (Static57.anIntArray183[local899] != Static22.anInt715 && Static57.anIntArray183[local899 + 1] == Static22.anInt715 || Static57.anIntArray183[local899] == 0 && Static57.anIntArray183[local899 + 1] != 0) {
							local1207 = false;
							@Pc(1273) int local1273 = Static57.anIntArray183[local899];
							Static57.anIntArray183[local899] = Static57.anIntArray183[local899 + 1];
							Static57.anIntArray183[local899 + 1] = local1273;
							@Pc(1291) Class5 local1291 = Static34.aClass5Array8[local899];
							Static34.aClass5Array8[local899] = Static34.aClass5Array8[local899 + 1];
							Static34.aClass5Array8[local899 + 1] = local1291;
							@Pc(1309) long local1309 = Static94.aLongArray2[local899];
							Static94.aLongArray2[local899] = Static94.aLongArray2[local899 + 1];
							Static94.aLongArray2[local899 + 1] = local1309;
							Static116.aBoolean157 = true;
						}
					}
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 87) {
				Static53.anInt1403 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 72) {
				if (Static60.anInt2979 == 12) {
					Static116.aBoolean157 = true;
				}
				Static50.anInt1360 = Static75.aClass3_Sub6_Sub1_2.method1612();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 140) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1621();
				Static105.method1747(local126);
				Static5.anInt353 = -1;
				Static65.anInt2441 = Static3.anInt289;
				return true;
			}
			if (Static5.anInt353 == 104) {
				for (local126 = 0; local126 < Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1.length; local126++) {
					if (Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local126] != null) {
						Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local126].anInt1536 = -1;
					}
				}
				for (local149 = 0; local149 < Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1.length; local149++) {
					if (Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local149] != null) {
						Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local149].anInt1536 = -1;
					}
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 73) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1632();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1636();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1603();
				local405 = Static58.method1009(local126);
				local405.anInt2638 = local149 + (local181 << 16);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 88) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1632();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1621();
				local841 = Static58.method1009(local126);
				if (local841 != null && local841.anInt2658 == 0) {
					if (local149 < 0) {
						local149 = 0;
					}
					if (local149 > local841.anInt2659 - local841.anInt2600) {
						local149 = local841.anInt2659 - local841.anInt2600;
					}
					local841.anInt2583 = local149;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 219) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1595();
				if (local126 >= 0) {
					Static55.method950(local126);
				}
				if (local126 != Static37.anInt1024) {
					Static67.method1174(Static37.anInt1024);
					Static37.anInt1024 = local126;
				}
				Static45.method851(Static37.anInt1024);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 149) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1621();
				Static55.method950(local126);
				if (Static88.anInt2255 != -1) {
					Static67.method1174(Static88.anInt2255);
					Static88.anInt2255 = -1;
					Static15.aBoolean22 = true;
				}
				if (Static63.anInt2924 != -1) {
					Static67.method1174(Static63.anInt2924);
					Static63.anInt2924 = -1;
					Static116.method1971(30);
				}
				if (Static27.anInt824 != -1) {
					Static67.method1174(Static27.anInt824);
					Static27.anInt824 = -1;
				}
				if (Static89.anInt2288 != -1) {
					Static67.method1174(Static89.anInt2288);
					Static89.anInt2288 = -1;
				}
				if (Static106.anInt2736 == local126) {
					Static60.method1963(Static106.anInt2736);
				} else {
					Static67.method1174(Static106.anInt2736);
					Static106.anInt2736 = local126;
				}
				Static116.aBoolean157 = true;
				Static100.aBoolean123 = true;
				Static85.anInt2100 = -1;
				if (Static68.anInt1553 != 0) {
					Static15.aBoolean22 = true;
					Static68.anInt1553 = 0;
				}
				Static45.method851(Static106.anInt2736);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 160) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1621();
				Static55.method950(local126);
				if (Static106.anInt2736 != -1) {
					Static67.method1174(Static106.anInt2736);
					Static116.aBoolean157 = true;
					Static100.aBoolean123 = true;
					Static106.anInt2736 = -1;
				}
				if (Static88.anInt2255 != -1) {
					Static67.method1174(Static88.anInt2255);
					Static15.aBoolean22 = true;
					Static88.anInt2255 = -1;
				}
				if (Static63.anInt2924 != -1) {
					Static67.method1174(Static63.anInt2924);
					Static63.anInt2924 = -1;
					Static116.method1971(30);
				}
				if (Static27.anInt824 != -1) {
					Static67.method1174(Static27.anInt824);
					Static27.anInt824 = -1;
				}
				if (local126 == Static89.anInt2288) {
					Static60.method1963(Static89.anInt2288);
				} else {
					Static67.method1174(Static89.anInt2288);
					Static89.anInt2288 = local126;
				}
				Static85.anInt2100 = -1;
				if (Static68.anInt1553 != 0) {
					Static15.aBoolean22 = true;
					Static68.anInt1553 = 0;
				}
				Static45.method851(Static89.anInt2288);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 121) {
				Static35.method687(false);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 238) {
				Static116.method1968();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 62) {
				@Pc(1745) byte local1745 = Static75.aClass3_Sub6_Sub1_2.method1613();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1603();
				Static40.anIntArray132[local149] = local1745;
				if (Static110.anIntArray373[local149] != local1745) {
					Static110.anIntArray373[local149] = local1745;
					Static60.method1961(local149);
					if (Static100.anInt2515 != -1) {
						Static15.aBoolean22 = true;
					}
					Static116.aBoolean157 = true;
				}
				Static5.anInt353 = -1;
				Static110.anInt2891 = Static3.anInt289;
				return true;
			}
			if (Static5.anInt353 == 242) {
				Static38.aBoolean51 = false;
				for (local126 = 0; local126 < 5; local126++) {
					Static73.aBooleanArray15[local126] = false;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 230) {
				Static81.anInt2006 = Static75.aClass3_Sub6_Sub1_2.method1636();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 244) {
				Static60.anInt2984 = Static75.aClass3_Sub6_Sub1_2.method1618();
				Static100.anInt2507 = Static75.aClass3_Sub6_Sub1_2.method1587();
				while (Static75.aClass3_Sub6_Sub1_2.anInt2416 < Static61.anInt1652) {
					Static5.anInt353 = Static75.aClass3_Sub6_Sub1_2.method1587();
					Static13.method324();
				}
				Static5.anInt353 = -1;
				return true;
			}
			@Pc(1857) Class5 local1857;
			if (Static5.anInt353 == 130) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local1857 = Static75.aClass3_Sub6_Sub1_2.method1627();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1591();
				if (local126 >= 1 && local126 <= 5) {
					if (local1857.method171(Static54.aClass5_704)) {
						local1857 = null;
					}
					Static116.aClass5Array19[local126 - 1] = local1857;
					Static21.aBooleanArray7[local126 - 1] = local181 == 0;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 232) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1595();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1612();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1615();
				local405 = Static58.method1009(local181);
				Static5.anInt353 = -1;
				local405.anInt2603 = local405.anInt2606 + local126;
				local405.anInt2655 = local405.anInt2654 + local149;
				return true;
			}
			if (Static5.anInt353 == 199) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1607();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1618();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1618();
				Static12.anInt480 = local181 >> 1;
				Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.method991(local149, (local181 & 0x1) == 1, local126);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 163) {
				for (local126 = 0; local126 < Static90.anInt2310; local126++) {
					@Pc(1981) Class3_Sub1_Sub16 local1981 = Static104.method1159(local126);
					if (local1981 != null && local1981.anInt2547 == 0) {
						Static40.anIntArray132[local126] = 0;
						Static110.anIntArray373[local126] = 0;
					}
				}
				Static116.aBoolean157 = true;
				if (Static100.anInt2515 != -1) {
					Static15.aBoolean22 = true;
				}
				Static110.anInt2891 = Static3.anInt289;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 117) {
				Static69.anInt1818 = Static75.aClass3_Sub6_Sub1_2.method1621() * 30;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 96) {
				Static64.anInt1692 = Static75.aClass3_Sub6_Sub1_2.method1587();
				if (Static64.anInt1692 == 1) {
					Static46.anInt1283 = Static75.aClass3_Sub6_Sub1_2.method1603();
				}
				if (Static64.anInt1692 >= 2 && Static64.anInt1692 <= 6) {
					if (Static64.anInt1692 == 2) {
						Static70.anInt1836 = 64;
						Static112.anInt2933 = 64;
					}
					if (Static64.anInt1692 == 3) {
						Static112.anInt2933 = 64;
						Static70.anInt1836 = 0;
					}
					if (Static64.anInt1692 == 4) {
						Static112.anInt2933 = 64;
						Static70.anInt1836 = 128;
					}
					if (Static64.anInt1692 == 5) {
						Static112.anInt2933 = 0;
						Static70.anInt1836 = 64;
					}
					if (Static64.anInt1692 == 6) {
						Static112.anInt2933 = 128;
						Static70.anInt1836 = 64;
					}
					Static64.anInt1692 = 2;
					Static4.anInt316 = Static75.aClass3_Sub6_Sub1_2.method1603();
					Static35.anInt1011 = Static75.aClass3_Sub6_Sub1_2.method1603();
					Static110.anInt2893 = Static75.aClass3_Sub6_Sub1_2.method1587();
				}
				if (Static64.anInt1692 == 10) {
					Static51.anInt2382 = Static75.aClass3_Sub6_Sub1_2.method1603();
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 6) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1597();
				if (Static100.anInt2515 != local126) {
					Static67.method1174(Static100.anInt2515);
					Static100.anInt2515 = local126;
				}
				Static15.aBoolean22 = true;
				Static45.method851(Static100.anInt2515);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 90) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1621();
				if (local149 == 65535) {
					local149 = -1;
				}
				if (Static88.anIntArray255[local126] == local149) {
					Static60.method1963(Static88.anIntArray255[local126]);
				} else {
					Static67.method1174(Static88.anIntArray255[local126]);
					Static88.anIntArray255[local126] = local149;
				}
				Static100.aBoolean123 = true;
				Static116.aBoolean157 = true;
				Static45.method851(Static88.anIntArray255[local126]);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 15) {
				Static46.anInt1284 = 0;
				Static5.anInt353 = -1;
				return true;
			}
			@Pc(2224) Class3_Sub1_Sub17 local2224;
			if (Static5.anInt353 == 245) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1615();
				local2224 = Static58.method1009(local126);
				for (local181 = 0; local181 < local2224.anIntArray309.length; local181++) {
					local2224.anIntArray309[local181] = -1;
					local2224.anIntArray309[local181] = 0;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 10) {
				Static60.anInt2979 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static116.aBoolean157 = true;
				Static100.aBoolean123 = true;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 180) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1624();
				local1857 = Static75.aClass3_Sub6_Sub1_2.method1627();
				local841 = Static58.method1009(local126);
				local841.aClass5_1183 = local1857;
				if (local126 >> 16 == Static88.anIntArray255[Static60.anInt2979]) {
					Static116.aBoolean157 = true;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 234) {
				@Pc(2312) boolean local2312 = Static75.aClass3_Sub6_Sub1_2.method1591() == 1;
				local149 = Static75.aClass3_Sub6_Sub1_2.method1615();
				local841 = Static58.method1009(local149);
				Static5.anInt353 = -1;
				local841.aBoolean132 = local2312;
				return true;
			}
			@Pc(2341) long local2341;
			if (Static5.anInt353 == 25) {
				local527 = Static75.aClass3_Sub6_Sub1_2.method1598();
				local2341 = Static75.aClass3_Sub6_Sub1_2.method1603();
				@Pc(2346) long local2346 = (long) Static75.aClass3_Sub6_Sub1_2.method1596();
				local899 = Static75.aClass3_Sub6_Sub1_2.method1587();
				@Pc(2357) long local2357 = (local2341 << 32) + local2346;
				@Pc(2359) boolean local2359 = false;
				for (@Pc(2361) int local2361 = 0; local2361 < 100; local2361++) {
					if (Static69.aLongArray6[local2361] == local2357) {
						local2359 = true;
						break;
					}
				}
				if (local899 <= 1) {
					for (@Pc(2384) int local2384 = 0; local2384 < Static17.anInt616; local2384++) {
						if (local527 == Static56.aLongArray4[local2384]) {
							local2359 = true;
							break;
						}
					}
				}
				if (!local2359 && Static54.anInt1413 == 0) {
					Static69.aLongArray6[Static76.anInt2560] = local2357;
					Static76.anInt2560 = (Static76.anInt2560 + 1) % 100;
					@Pc(2427) Class5 local2427 = Static105.method1751(Static75.aClass3_Sub6_Sub1_2).method132();
					if (local899 == 2 || local899 == 3) {
						Static64.method1084(Static75.method1261(new Class5[] { Static91.aClass5_1071, Static82.method1301(local527).method147() }), local2427, 7);
					} else if (local899 == 1) {
						Static64.method1084(Static75.method1261(new Class5[] { Static58.aClass5_775, Static82.method1301(local527).method147() }), local2427, 7);
					} else {
						Static64.method1084(Static82.method1301(local527).method147(), local2427, 3);
					}
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 97) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1636();
				Static55.method950(local126);
				if (Static106.anInt2736 != -1) {
					Static67.method1174(Static106.anInt2736);
					Static106.anInt2736 = -1;
					Static116.aBoolean157 = true;
					Static100.aBoolean123 = true;
				}
				if (Static63.anInt2924 != -1) {
					Static67.method1174(Static63.anInt2924);
					Static63.anInt2924 = -1;
					Static116.method1971(30);
				}
				if (Static27.anInt824 != -1) {
					Static67.method1174(Static27.anInt824);
					Static27.anInt824 = -1;
				}
				if (Static89.anInt2288 != -1) {
					Static67.method1174(Static89.anInt2288);
					Static89.anInt2288 = -1;
				}
				if (local126 == Static88.anInt2255) {
					Static60.method1963(Static88.anInt2255);
				} else {
					Static67.method1174(Static88.anInt2255);
					Static88.anInt2255 = local126;
				}
				Static85.anInt2100 = -1;
				Static45.method851(Static88.anInt2255);
				Static15.aBoolean22 = true;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 213) {
				Static116.aBoolean157 = true;
				local126 = Static75.aClass3_Sub6_Sub1_2.method1614();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1603();
				if (local126 < 0) {
					local841 = null;
				} else {
					local841 = Static58.method1009(local126);
				}
				while (Static75.aClass3_Sub6_Sub1_2.anInt2416 < Static61.anInt1652) {
					local185 = Static75.aClass3_Sub6_Sub1_2.method1629();
					local484 = Static75.aClass3_Sub6_Sub1_2.method1603();
					local886 = 0;
					if (local484 != 0) {
						local886 = Static75.aClass3_Sub6_Sub1_2.method1587();
						if (local886 == 255) {
							local886 = Static75.aClass3_Sub6_Sub1_2.method1614();
						}
					}
					if (local841 != null && local185 >= 0 && local841.anIntArray309.length > local185) {
						local841.anIntArray309[local185] = local484;
						local841.anIntArray308[local185] = local886;
					}
					Static61.method1071(local185, local149, local484 - 1, local886);
				}
				Static65.anInt2441 = Static3.anInt289;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 82) {
				Static60.anInt2984 = Static75.aClass3_Sub6_Sub1_2.method1607();
				Static100.anInt2507 = Static75.aClass3_Sub6_Sub1_2.method1607();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 95) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1624();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1623();
				local841 = Static58.method1009(local126);
				if (local149 != local841.anInt2666 || local149 == -1) {
					local841.anInt2647 = 0;
					local841.anInt2666 = local149;
					local841.anInt2588 = 0;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 157) {
				local243 = Static75.aClass3_Sub6_Sub1_2.method1627();
				@Pc(2749) boolean local2749;
				if (local243.method158(Static108.aClass5_1281)) {
					local1857 = local243.method133(0, local243.method154(Static30.aClass5_400));
					local2341 = local1857.method146();
					local2749 = false;
					for (local886 = 0; local886 < Static17.anInt616; local886++) {
						if (local2341 == Static56.aLongArray4[local886]) {
							local2749 = true;
							break;
						}
					}
					if (!local2749 && Static54.anInt1413 == 0) {
						Static64.method1084(local1857, Static46.aClass5_607, 4);
					}
				} else if (local243.method158(Static51.aClass5_1100)) {
					local2749 = false;
					local1857 = local243.method133(0, local243.method154(Static30.aClass5_400));
					local2341 = local1857.method146();
					for (local886 = 0; local886 < Static17.anInt616; local886++) {
						if (Static56.aLongArray4[local886] == local2341) {
							local2749 = true;
							break;
						}
					}
					if (!local2749 && Static54.anInt1413 == 0) {
						Static64.method1084(local1857, Static100.aClass5_1132, 8);
					}
				} else if (local243.method158(Static64.aClass5_796)) {
					local1857 = local243.method133(0, local243.method154(Static30.aClass5_400));
					local2341 = local1857.method146();
					local2749 = false;
					for (local886 = 0; local886 < Static17.anInt616; local886++) {
						if (local2341 == Static56.aLongArray4[local886]) {
							local2749 = true;
							break;
						}
					}
					if (!local2749 && Static54.anInt1413 == 0) {
						@Pc(2866) Class5 local2866 = local243.method133(local243.method154(Static30.aClass5_400) + 1, local243.method144() + -9);
						Static64.method1084(local1857, local2866, 8);
					}
				} else {
					Static64.method1084(Static110.aClass5_1307, local243, 0);
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 193) {
				Static35.method687(true);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 24) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1604();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1632();
				local841 = Static58.method1009(local149);
				local841.anInt2608 = local126;
				local841.anInt2594 = 1;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 241) {
				Static38.aBoolean51 = true;
				Static91.anInt2351 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static112.anInt2930 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static33.anInt930 = Static75.aClass3_Sub6_Sub1_2.method1603();
				Static95.anInt2467 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static48.anInt1321 = Static75.aClass3_Sub6_Sub1_2.method1587();
				if (Static48.anInt1321 >= 100) {
					local126 = Static91.anInt2351 * 128 + 64;
					local149 = Static112.anInt2930 * 128 + 64;
					local181 = Static15.method358(local149, Static12.anInt480, local126) - Static33.anInt930;
					local185 = local126 - Static89.anInt2280;
					local484 = local181 - Static85.anInt2111;
					local886 = local149 - Static60.anInt2989;
					local899 = (int) Math.sqrt((double) (local185 * local185 + local886 * local886));
					Static70.anInt1827 = (int) (Math.atan2((double) local484, (double) local899) * 325.949D) & 0x7FF;
					Static68.anInt1577 = (int) (-325.949D * Math.atan2((double) local185, (double) local886)) & 0x7FF;
					if (Static70.anInt1827 < 128) {
						Static70.anInt1827 = 128;
					}
					if (Static70.anInt1827 > 383) {
						Static70.anInt1827 = 383;
					}
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 91) {
				anInt2488 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static12.anInt479 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static9.anInt428 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static68.aBoolean71 = true;
				Static15.aBoolean22 = true;
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 133) {
				Static100.anInt2507 = Static75.aClass3_Sub6_Sub1_2.method1591();
				Static60.anInt2984 = Static75.aClass3_Sub6_Sub1_2.method1607();
				for (local126 = Static60.anInt2984; local126 < Static60.anInt2984 + 8; local126++) {
					for (local149 = Static100.anInt2507; local149 < Static100.anInt2507 + 8; local149++) {
						if (Static24.aClass51ArrayArrayArray1[Static12.anInt480][local126][local149] != null) {
							Static24.aClass51ArrayArrayArray1[Static12.anInt480][local126][local149] = null;
							Static109.method1896(local126, local149);
						}
					}
				}
				for (@Pc(3167) Class3_Sub11 local3167 = (Class3_Sub11) Static17.aClass51_3.method1316(); local3167 != null; local3167 = (Class3_Sub11) Static17.aClass51_3.method1310()) {
					if (Static60.anInt2984 <= local3167.anInt2278 && Static60.anInt2984 + 8 > local3167.anInt2278 && Static100.anInt2507 <= local3167.anInt2285 && local3167.anInt2285 < Static100.anInt2507 + 8 && Static12.anInt480 == local3167.anInt2275) {
						local3167.anInt2273 = 0;
					}
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 226) {
				if (Static60.anInt2979 == 12) {
					Static116.aBoolean157 = true;
				}
				Static78.anInt1954 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 32) {
				if (Static88.anInt2255 != -1) {
					Static67.method1174(Static88.anInt2255);
					Static88.anInt2255 = -1;
				}
				Static5.anInt353 = -1;
				Static15.aBoolean22 = true;
				Static68.anInt1553 = 1;
				Static103.aBoolean141 = false;
				Static110.aClass5_1300 = Static110.aClass5_1307;
				return true;
			}
			if (Static5.anInt353 == 81) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1603();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1603();
				Static38.method699(local181, local149, local126);
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 236) {
				Static61.anInt1655 = Static75.aClass3_Sub6_Sub1_2.method1587();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 178) {
				if (Static106.anInt2736 != -1) {
					Static67.method1174(Static106.anInt2736);
					Static100.aBoolean123 = true;
					Static116.aBoolean157 = true;
					Static106.anInt2736 = -1;
				}
				if (Static88.anInt2255 != -1) {
					Static67.method1174(Static88.anInt2255);
					Static15.aBoolean22 = true;
					Static88.anInt2255 = -1;
				}
				if (Static63.anInt2924 != -1) {
					Static67.method1174(Static63.anInt2924);
					Static63.anInt2924 = -1;
					Static116.method1971(30);
				}
				if (Static27.anInt824 != -1) {
					Static67.method1174(Static27.anInt824);
					Static27.anInt824 = -1;
				}
				if (Static89.anInt2288 != -1) {
					Static67.method1174(Static89.anInt2288);
					Static89.anInt2288 = -1;
				}
				Static5.anInt353 = -1;
				Static85.anInt2100 = -1;
				if (Static68.anInt1553 != 0) {
					Static15.aBoolean22 = true;
					Static68.anInt1553 = 0;
				}
				return true;
			}
			if (Static5.anInt353 == 22) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1636();
				if (local126 == 65535) {
					local126 = -1;
				}
				local149 = Static75.aClass3_Sub6_Sub1_2.method1615();
				local181 = Static75.aClass3_Sub6_Sub1_2.method1624();
				local405 = Static67.method1171(local181, local126);
				if (local405 != null) {
					local405.anInt2620 = local149;
				}
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 220) {
				for (local126 = 0; local126 < Static110.anIntArray373.length; local126++) {
					if (Static40.anIntArray132[local126] != Static110.anIntArray373[local126]) {
						Static110.anIntArray373[local126] = Static40.anIntArray132[local126];
						Static60.method1961(local126);
						Static116.aBoolean157 = true;
					}
				}
				Static5.anInt353 = -1;
				Static110.anInt2891 = Static3.anInt289;
				return true;
			}
			if (Static5.anInt353 == 227) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1603();
				local149 = Static75.aClass3_Sub6_Sub1_2.method1614();
				local841 = Static58.method1009(local149);
				local841.anInt2608 = local126;
				Static5.anInt353 = -1;
				local841.anInt2594 = 2;
				return true;
			}
			if (Static5.anInt353 == 31) {
				local126 = Static75.aClass3_Sub6_Sub1_2.method1624();
				local2224 = Static58.method1009(local126);
				local2224.anInt2594 = 3;
				local2224.anInt2608 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass48_2.method1231();
				Static5.anInt353 = -1;
				return true;
			}
			if (Static5.anInt353 == 51) {
				if (Static88.anInt2255 != -1) {
					Static67.method1174(Static88.anInt2255);
					Static88.anInt2255 = -1;
				}
				Static5.anInt353 = -1;
				Static68.anInt1553 = 2;
				Static103.aBoolean141 = false;
				Static110.aClass5_1300 = Static110.aClass5_1307;
				Static15.aBoolean22 = true;
				return true;
			}
			Static69.method1187(null, "T1 - " + Static5.anInt353 + "," + Static108.anInt2843 + "," + Static33.anInt927 + " - " + Static61.anInt1652);
			Static100.method1671();
		} catch (@Pc(3546) IOException local3546) {
			Static58.method1010();
		} catch (@Pc(3550) Exception local3550) {
			@Pc(3590) String local3590 = "T2 - " + Static5.anInt353 + "," + Static108.anInt2843 + "," + Static33.anInt927 + " - " + Static61.anInt1652 + "," + (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0] + Static109.anInt2875) + "," + (Static52.anInt1378 + Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0]) + " - ";
			for (local149 = 0; local149 < Static61.anInt1652 && local149 < 50; local149++) {
				local3590 = local3590 + Static75.aClass3_Sub6_Sub1_2.aByteArray17[local149] + ",";
			}
			Static69.method1187(local3550, local3590);
			Static100.method1671();
		}
		return true;
	}
}
