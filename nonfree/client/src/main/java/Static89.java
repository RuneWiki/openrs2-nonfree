import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!bc;")
	public static Class6 aClass6_16;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "I")
	public static int anInt2108;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public static int anInt2105 = 0;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	public static int anInt2107 = 0;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1065 = Static108.method1915("::clientdrop");

	@OriginalMember(owner = "client!of", name = "j", descriptor = "I")
	public static int anInt2109 = 0;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1066 = Static108.method1915("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1067 = Static108.method1915("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
	public static int method1474() {
		return 6;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public static void method1475() {
		Static76.aClass1_Sub8_Sub4_2.method1750();
		Static25.anInt837 = 1;
		Static90.aClass62_26 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method1476() {
		@Pc(12) int local12;
		@Pc(26) int local26;
		@Pc(18) int local18;
		@Pc(30) int local30;
		@Pc(65) Class1_Sub1_Sub2_Sub3 local65;
		if (Static121.anInt2967 == 24) {
			local12 = Static79.aClass1_Sub18_Sub1_3.method2169();
			local18 = (local12 & 0x7) + Static17.anInt577;
			local26 = (local12 >> 4 & 0x7) + Static75.anInt1892;
			local30 = Static79.aClass1_Sub18_Sub1_3.method2146();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				@Pc(58) Class31 local58 = Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local26][local18];
				if (local58 != null) {
					for (local65 = (Class1_Sub1_Sub2_Sub3) local58.method1000(); local65 != null; local65 = (Class1_Sub1_Sub2_Sub3) local58.method1003()) {
						if (local65.anInt806 == (local30 & 0x7FFF)) {
							local65.method2128();
							break;
						}
					}
					if (local58.method1000() == null) {
						Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local26][local18] = null;
					}
					Static33.method630(local26, local18);
				}
			}
			return;
		}
		@Pc(145) int local145;
		@Pc(141) int local141;
		@Pc(149) int local149;
		@Pc(153) int local153;
		if (Static121.anInt2967 == 190) {
			local12 = Static79.aClass1_Sub18_Sub1_3.method2171();
			local26 = (local12 >> 4 & 0x7) + Static75.anInt1892;
			local18 = (local12 & 0x7) + Static17.anInt577;
			local30 = Static79.aClass1_Sub18_Sub1_3.method2174();
			local141 = local30 & 0x3;
			local145 = local30 >> 2;
			local149 = Static45.anIntArray176[local145];
			local153 = Static79.aClass1_Sub18_Sub1_3.method2146();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				Static72.method1251(Static9.anInt2983, local153, 0, local149, local145, -1, local141, local26, local18);
			}
		} else if (Static121.anInt2967 == 31) {
			local12 = Static79.aClass1_Sub18_Sub1_3.method2150();
			local26 = Static75.anInt1892 + (local12 >> 4 & 0x7);
			local18 = Static17.anInt577 + (local12 & 0x7);
			local30 = Static79.aClass1_Sub18_Sub1_3.method2174();
			local145 = local30 >> 2;
			local141 = local30 & 0x3;
			local149 = Static45.anIntArray176[local145];
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				Static72.method1251(Static9.anInt2983, -1, 0, local149, local145, -1, local141, local26, local18);
			}
		} else if (Static121.anInt2967 == 123) {
			local12 = Static79.aClass1_Sub18_Sub1_3.method2150();
			local26 = (local12 >> 4 & 0x7) + Static75.anInt1892;
			local18 = (local12 & 0x7) + Static17.anInt577;
			local30 = Static79.aClass1_Sub18_Sub1_3.method2170();
			local145 = Static79.aClass1_Sub18_Sub1_3.method2156();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				local65 = new Class1_Sub1_Sub2_Sub3();
				local65.anInt802 = local145;
				local65.anInt806 = local30;
				if (Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local26][local18] == null) {
					Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local26][local18] = new Class31();
				}
				Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local26][local18].method1005(local65);
				Static33.method630(local26, local18);
			}
		} else {
			@Pc(395) int local395;
			if (Static121.anInt2967 == 54) {
				local12 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local26 = Static75.anInt1892 + (local12 >> 4 & 0x7);
				local18 = (local12 & 0x7) + Static17.anInt577;
				local30 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local145 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local141 = local145 >> 4 & 0xF;
				local153 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local149 = local145 & 0x7;
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
					local395 = local141 + 1;
					if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0] >= local26 - local395 && Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0] <= local395 + local26 && local18 - local395 <= Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0] && Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0] <= local18 + local395 && Static86.anInt2059 != 0 && local149 > 0 && Static56.anInt1518 < 50) {
						Static18.anIntArray103[Static56.anInt1518] = local30;
						Static127.anIntArray481[Static56.anInt1518] = local149;
						Static35.anIntArray155[Static56.anInt1518] = local153;
						Static2.aClass51Array1[Static56.anInt1518] = null;
						Static38.anIntArray166[Static56.anInt1518] = (local18 << 8) + ((local26 << 16) + local141);
						Static56.anInt1518++;
					}
				}
			}
			@Pc(529) int local529;
			@Pc(537) int local537;
			@Pc(543) int local543;
			if (Static121.anInt2967 == 199) {
				@Pc(493) byte local493 = Static79.aClass1_Sub18_Sub1_3.method2178();
				local26 = Static79.aClass1_Sub18_Sub1_3.method2146();
				local18 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local30 = local18 >> 2;
				local141 = Static45.anIntArray176[local30];
				local145 = local18 & 0x3;
				local149 = Static79.aClass1_Sub18_Sub1_3.method2146();
				@Pc(521) byte local521 = Static79.aClass1_Sub18_Sub1_3.method2173();
				local395 = Static79.aClass1_Sub18_Sub1_3.method2146();
				local529 = Static79.aClass1_Sub18_Sub1_3.method2174();
				local537 = Static75.anInt1892 + (local529 >> 4 & 0x7);
				local543 = (local529 & 0x7) + Static17.anInt577;
				@Pc(547) byte local547 = Static79.aClass1_Sub18_Sub1_3.method2147();
				@Pc(551) byte local551 = Static79.aClass1_Sub18_Sub1_3.method2147();
				@Pc(555) int local555 = Static79.aClass1_Sub18_Sub1_3.method2141();
				@Pc(566) Class1_Sub1_Sub2_Sub1_Sub2 local566;
				if (local555 == Static69.anInt1770) {
					local566 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1;
				} else {
					local566 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local555];
				}
				if (local566 != null) {
					@Pc(576) Class1_Sub1_Sub18 local576 = Static104.method1862(local149);
					@Pc(588) int local588 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local537 + 1][local543 + 1];
					@Pc(596) int local596 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local537][local543];
					@Pc(606) int local606 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local537 + 1][local543];
					@Pc(616) int local616 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local537][local543 + 1];
					@Pc(626) Class1_Sub1_Sub2_Sub7 local626 = local576.method2111(local596, local616, local145, local606, local588, local30);
					if (local626 != null) {
						Static72.method1251(Static9.anInt2983, -1, local395 + 1, local141, 0, local26 + 1, 0, local537, local543);
						local566.aClass1_Sub1_Sub2_Sub7_3 = local626;
						local566.anInt2558 = Static45.anInt1256 + local26;
						local566.anInt2559 = local395 + Static45.anInt1256;
						@Pc(662) byte local662;
						if (local551 > local521) {
							local662 = local551;
							local551 = local521;
							local521 = local662;
						}
						if (local547 > local493) {
							local662 = local547;
							local547 = local493;
							local493 = local662;
						}
						@Pc(682) int local682 = local576.anInt3029;
						@Pc(685) int local685 = local576.anInt3039;
						if (local145 == 1 || local145 == 3) {
							local685 = local576.anInt3029;
							local682 = local576.anInt3039;
						}
						local566.anInt2538 = local537 * 128 + local685 * 64;
						local566.anInt2547 = local682 * 64 + local543 * 128;
						local566.anInt2555 = Static62.method2035(Static9.anInt2983, local566.anInt2538, local566.anInt2547);
						local566.anInt2544 = local547 + local543;
						local566.anInt2541 = local543 + local493;
						local566.anInt2553 = local537 + local521;
						local566.anInt2548 = local537 + local551;
					}
				}
			}
			if (Static121.anInt2967 == 136) {
				local12 = Static79.aClass1_Sub18_Sub1_3.method2171();
				local18 = local12 & 0x3;
				local26 = local12 >> 2;
				local30 = Static45.anIntArray176[local26];
				local145 = Static79.aClass1_Sub18_Sub1_3.method2171();
				local141 = (local145 >> 4 & 0x7) + Static75.anInt1892;
				local149 = Static17.anInt577 + (local145 & 0x7);
				local153 = Static79.aClass1_Sub18_Sub1_3.method2141();
				if (local141 >= 0 && local149 >= 0 && local141 < 103 && local149 < 103) {
					local395 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local141][local149];
					local529 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local141 + 1][local149];
					local537 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local141 + 1][local149 + 1];
					local543 = Static51.anIntArrayArrayArray6[Static9.anInt2983][local141][local149 + 1];
					if (local30 == 0) {
						@Pc(859) Class57 local859 = Static32.aClass5_2.method121(Static9.anInt2983, local141, local149);
						if (local859 != null) {
							@Pc(868) int local868 = local859.anInt2103 >> 14 & 0x7FFF;
							if (local26 == 2) {
								local859.aClass1_Sub1_Sub2_8 = new Class1_Sub1_Sub2_Sub4(local868, 2, local18 + 4, local395, local529, local537, local543, local153, false, local859.aClass1_Sub1_Sub2_8);
								local859.aClass1_Sub1_Sub2_7 = new Class1_Sub1_Sub2_Sub4(local868, 2, local18 + 1 & 0x3, local395, local529, local537, local543, local153, false, local859.aClass1_Sub1_Sub2_7);
							} else {
								local859.aClass1_Sub1_Sub2_8 = new Class1_Sub1_Sub2_Sub4(local868, local26, local18, local395, local529, local537, local543, local153, false, local859.aClass1_Sub1_Sub2_8);
							}
						}
					}
					if (local30 == 1) {
						@Pc(936) Class9 local936 = Static32.aClass5_2.method126(Static9.anInt2983, local141, local149);
						if (local936 != null) {
							local936.aClass1_Sub1_Sub2_4 = new Class1_Sub1_Sub2_Sub4(local936.anInt541 >> 14 & 0x7FFF, 4, 0, local395, local529, local537, local543, local153, false, local936.aClass1_Sub1_Sub2_4);
						}
					}
					if (local30 == 2) {
						if (local26 == 11) {
							local26 = 10;
						}
						@Pc(975) Class19 local975 = Static32.aClass5_2.method143(Static9.anInt2983, local141, local149);
						if (local975 != null) {
							local975.aClass1_Sub1_Sub2_6 = new Class1_Sub1_Sub2_Sub4(local975.anInt1086 >> 14 & 0x7FFF, local26, local18, local395, local529, local537, local543, local153, false, local975.aClass1_Sub1_Sub2_6);
						}
					}
					if (local30 == 3) {
						@Pc(1007) Class13 local1007 = Static32.aClass5_2.method97(Static9.anInt2983, local141, local149);
						if (local1007 != null) {
							local1007.aClass1_Sub1_Sub2_5 = new Class1_Sub1_Sub2_Sub4(local1007.anInt839 >> 14 & 0x7FFF, 22, local18, local395, local529, local537, local543, local153, false, local1007.aClass1_Sub1_Sub2_5);
						}
					}
				}
			} else if (Static121.anInt2967 == 147) {
				local12 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local26 = (local12 >> 4 & 0x7) + Static75.anInt1892;
				local18 = Static17.anInt577 + (local12 & 0x7);
				local30 = Static79.aClass1_Sub18_Sub1_3.method2178() + local26;
				local145 = Static79.aClass1_Sub18_Sub1_3.method2178() + local18;
				local141 = Static79.aClass1_Sub18_Sub1_3.method2157();
				local149 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local153 = Static79.aClass1_Sub18_Sub1_3.method2169() * 4;
				local395 = Static79.aClass1_Sub18_Sub1_3.method2169() * 4;
				local529 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local537 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local543 = Static79.aClass1_Sub18_Sub1_3.method2169();
				@Pc(1102) int local1102 = Static79.aClass1_Sub18_Sub1_3.method2169();
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104 && local30 >= 0 && local145 >= 0 && local30 < 104 && local145 < 104 && local149 != 65535) {
					local18 = local18 * 128 + 64;
					local30 = local30 * 128 + 64;
					local145 = local145 * 128 + 64;
					local26 = local26 * 128 + 64;
					@Pc(1189) Class1_Sub1_Sub2_Sub6 local1189 = new Class1_Sub1_Sub2_Sub6(local149, Static9.anInt2983, local26, local18, Static62.method2035(Static9.anInt2983, local26, local18) - local153, local529 - -Static45.anInt1256, Static45.anInt1256 + local537, local543, local1102, local141, local395);
					local1189.method1280(Static45.anInt1256 + local529, local145, local30, Static62.method2035(Static9.anInt2983, local30, local145) - local395);
					Static81.aClass31_47.method1005(local1189);
				}
			} else if (Static121.anInt2967 == 114) {
				local12 = Static79.aClass1_Sub18_Sub1_3.method2146();
				local26 = Static79.aClass1_Sub18_Sub1_3.method2141();
				local18 = Static79.aClass1_Sub18_Sub1_3.method2174();
				local30 = (local18 >> 4 & 0x7) + Static75.anInt1892;
				local145 = (local18 & 0x7) + Static17.anInt577;
				local141 = Static79.aClass1_Sub18_Sub1_3.method2156();
				if (local30 >= 0 && local145 >= 0 && local30 < 104 && local145 < 104 && local26 != Static69.anInt1770) {
					@Pc(1273) Class1_Sub1_Sub2_Sub3 local1273 = new Class1_Sub1_Sub2_Sub3();
					local1273.anInt806 = local141;
					local1273.anInt802 = local12;
					if (Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local30][local145] == null) {
						Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local30][local145] = new Class31();
					}
					Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local30][local145].method1005(local1273);
					Static33.method630(local30, local145);
				}
			} else if (Static121.anInt2967 == 27) {
				local12 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local26 = Static75.anInt1892 + (local12 >> 4 & 0x7);
				local18 = Static17.anInt577 + (local12 & 0x7);
				local30 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local145 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local141 = Static79.aClass1_Sub18_Sub1_3.method2156();
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
					local18 = local18 * 128 + 64;
					local26 = local26 * 128 + 64;
					@Pc(1395) Class1_Sub1_Sub2_Sub2 local1395 = new Class1_Sub1_Sub2_Sub2(local30, Static9.anInt2983, local26, local18, Static62.method2035(Static9.anInt2983, local26, local18) - local145, local141, Static45.anInt1256);
					Static53.aClass31_32.method1005(local1395);
				}
			} else if (Static121.anInt2967 == 57) {
				local12 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local26 = (local12 >> 4 & 0x7) + Static75.anInt1892;
				local18 = (local12 & 0x7) + Static17.anInt577;
				local30 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local145 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local141 = Static79.aClass1_Sub18_Sub1_3.method2156();
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
					@Pc(1456) Class31 local1456 = Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local26][local18];
					if (local1456 != null) {
						for (@Pc(1463) Class1_Sub1_Sub2_Sub3 local1463 = (Class1_Sub1_Sub2_Sub3) local1456.method1000(); local1463 != null; local1463 = (Class1_Sub1_Sub2_Sub3) local1456.method1003()) {
							if (local1463.anInt806 == (local30 & 0x7FFF) && local145 == local1463.anInt802) {
								local1463.anInt802 = local141;
								break;
							}
						}
						Static33.method630(local26, local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)V")
	public static void method1477(@OriginalArg(0) boolean arg0) {
		Static81.aBoolean165 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(125) int local125;
		@Pc(133) int local133;
		@Pc(142) int local142;
		if (!Static81.aBoolean165) {
			local13 = Static79.aClass1_Sub18_Sub1_3.method2169();
			local17 = Static79.aClass1_Sub18_Sub1_3.method2141();
			local25 = (Static72.anInt1801 - Static79.aClass1_Sub18_Sub1_3.anInt3078) / 16;
			Static33.anIntArrayArray7 = new int[local25][4];
			for (local31 = 0; local31 < local25; local31++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static33.anIntArrayArray7[local31][local35] = Static79.aClass1_Sub18_Sub1_3.method2158();
				}
			}
			local35 = Static79.aClass1_Sub18_Sub1_3.method2156();
			local65 = Static79.aClass1_Sub18_Sub1_3.method2156();
			local69 = Static79.aClass1_Sub18_Sub1_3.method2141();
			Static2.aByteArrayArray1 = new byte[local25][];
			Static35.aByteArrayArray3 = new byte[local25][];
			Static114.anIntArray437 = new int[local25];
			Static53.anIntArray207 = new int[local25];
			Static16.anIntArray383 = new int[local25];
			@Pc(86) boolean local86 = false;
			if ((local65 / 8 == 48 || local65 / 8 == 49) && local35 / 8 == 48) {
				local86 = true;
			}
			local25 = 0;
			if (local65 / 8 == 48 && local35 / 8 == 148) {
				local86 = true;
			}
			for (local125 = (local65 - 6) / 8; local125 <= (local65 + 6) / 8; local125++) {
				for (local133 = (local35 - 6) / 8; local133 <= (local35 + 6) / 8; local133++) {
					local142 = (local125 << 8) + local133;
					if (!local86 || local133 != 49 && local133 != 149 && local133 != 147 && local125 != 50 && (local125 != 49 || local133 != 47)) {
						Static53.anIntArray207[local25] = local142;
						Static114.anIntArray437[local25] = Static126.aClass62_Sub1_75.method2015(Static30.method601(new Class39[] { Static36.aClass39_506, Static69.method1226(local125), Static22.aClass39_377, Static69.method1226(local133) }));
						Static16.anIntArray383[local25] = Static126.aClass62_Sub1_75.method2015(Static30.method601(new Class39[] { Static72.aClass39_888, Static69.method1226(local125), Static22.aClass39_377, Static69.method1226(local133) }));
						local25++;
					}
				}
			}
			Static98.method1724(local65, local69, local35, local17, local13);
			return;
		}
		local13 = Static79.aClass1_Sub18_Sub1_3.method2156();
		local17 = Static79.aClass1_Sub18_Sub1_3.method2171();
		local25 = Static79.aClass1_Sub18_Sub1_3.method2146();
		Static79.aClass1_Sub18_Sub1_3.method2193();
		for (local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < 13; local35++) {
				for (local65 = 0; local65 < 13; local65++) {
					local69 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
					if (local69 == 1) {
						Static30.anIntArrayArrayArray5[local31][local35][local65] = Static79.aClass1_Sub18_Sub1_3.method2199(26);
					} else {
						Static30.anIntArrayArrayArray5[local31][local35][local65] = -1;
					}
				}
			}
		}
		Static79.aClass1_Sub18_Sub1_3.method2198();
		local35 = (Static72.anInt1801 - Static79.aClass1_Sub18_Sub1_3.anInt3078) / 16;
		Static33.anIntArrayArray7 = new int[local35][4];
		for (local65 = 0; local65 < local35; local65++) {
			for (local69 = 0; local69 < 4; local69++) {
				Static33.anIntArrayArray7[local65][local69] = Static79.aClass1_Sub18_Sub1_3.method2158();
			}
		}
		local69 = Static79.aClass1_Sub18_Sub1_3.method2170();
		@Pc(395) int local395 = Static79.aClass1_Sub18_Sub1_3.method2141();
		Static2.aByteArrayArray1 = new byte[local35][];
		Static53.anIntArray207 = new int[local35];
		Static16.anIntArray383 = new int[local35];
		Static35.aByteArrayArray3 = new byte[local35][];
		Static114.anIntArray437 = new int[local35];
		local35 = 0;
		for (local125 = 0; local125 < 4; local125++) {
			for (local133 = 0; local133 < 13; local133++) {
				for (local142 = 0; local142 < 13; local142++) {
					@Pc(432) int local432 = Static30.anIntArrayArrayArray5[local125][local133][local142];
					if (local432 != -1) {
						@Pc(441) int local441 = local432 >> 14 & 0x3FF;
						@Pc(447) int local447 = local432 >> 3 & 0x7FF;
						@Pc(458) int local458 = (local441 / 8 << 8) + (local447 / 8);
						for (@Pc(460) int local460 = 0; local460 < local35; local460++) {
							if (local458 == Static53.anIntArray207[local460]) {
								local458 = -1;
								break;
							}
						}
						if (local458 != -1) {
							@Pc(488) int local488 = local458 >> 8 & 0xFF;
							Static53.anIntArray207[local35] = local458;
							@Pc(496) int local496 = local458 & 0xFF;
							Static114.anIntArray437[local35] = Static126.aClass62_Sub1_75.method2015(Static30.method601(new Class39[] { Static36.aClass39_506, Static69.method1226(local488), Static22.aClass39_377, Static69.method1226(local496) }));
							Static16.anIntArray383[local35] = Static126.aClass62_Sub1_75.method2015(Static30.method601(new Class39[] { Static72.aClass39_888, Static69.method1226(local488), Static22.aClass39_377, Static69.method1226(local496) }));
							local35++;
						}
					}
				}
			}
		}
		Static98.method1724(local69, local13, local395, local25, local17);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1478(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (!Static71.method1248(arg2)) {
			return false;
		}
		Static50.aClass1_Sub1_Sub1Array2 = null;
		@Pc(30) boolean local30 = Static43.method772(0, 0, arg1, arg0, 0, -1, arg3, Static102.aClass1_Sub1_Sub1ArrayArray1[arg2], 0);
		if (Static50.aClass1_Sub1_Sub1Array2 != null) {
			Static43.method772(Static75.anInt1893, 0, arg1, arg0, Static102.anInt2581, -1412584499, arg3, Static50.aClass1_Sub1_Sub1Array2, 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method1479() {
		aClass6_16 = null;
		aClass39_1067 = null;
		aClass39_1065 = null;
		aClass39_1066 = null;
	}
}
