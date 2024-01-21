import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!wd;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_19;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean142 = true;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	public static int anInt2669 = -1;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!lc;")
	public static Class31 aClass31_920 = Static56.method1206("From ");

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!lc;")
	public static Class31 aClass31_921 = Static56.method1206("@yel@");

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_922 = Static56.method1206("cyan:");

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_923 = Static56.method1206("Please use a different world)3");

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public static int anInt2672 = 0;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	public static int anInt2673 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)I")
	public static int method1685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(11) int local11 = arg1 / arg2;
		@Pc(17) int local17 = arg2 - 1 & arg1;
		@Pc(23) int local23 = arg2 - 1 & arg0;
		@Pc(28) int local28 = Static105.method1745(local11, local3);
		@Pc(35) int local35 = Static105.method1745(local11, local3 + 1);
		@Pc(42) int local42 = Static105.method1745(local11 + 1, local3);
		@Pc(59) int local59 = Static105.method1745(local11 + 1, local3 - -1);
		@Pc(66) int local66 = Static63.method1320(local28, local23, local35, arg2);
		@Pc(73) int local73 = Static63.method1320(local42, local23, local59, arg2);
		return Static63.method1320(local66, local17, local73, arg2);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([IIIZZLjava/awt/Graphics;)V")
	public static void method1686(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Graphics arg4) {
		Static90.aClass9_25.method861();
		Static47.aClass2_Sub1_Sub3_Sub1_10.method291(0, 0);
		if (arg3) {
			if (arg0[arg2] != -1) {
				if (arg2 == 0) {
					Static98.aClass2_Sub1_Sub3_Sub1_7.method291(22, 10);
				}
				if (arg2 == 1) {
					Static100.aClass2_Sub1_Sub3_Sub1_20.method291(54, 8);
				}
				if (arg2 == 2) {
					Static100.aClass2_Sub1_Sub3_Sub1_20.method291(82, 8);
				}
				if (arg2 == 3) {
					Static69.aClass2_Sub1_Sub3_Sub1_12.method291(110, 8);
				}
				if (arg2 == 4) {
					Static93.aClass2_Sub1_Sub3_Sub1_17.method291(153, 8);
				}
				if (arg2 == 5) {
					Static93.aClass2_Sub1_Sub3_Sub1_17.method291(181, 8);
				}
				if (arg2 == 6) {
					Static96.aClass2_Sub1_Sub3_Sub1_18.method291(209, 9);
				}
			}
			if (arg0[0] != -1 && arg1 != 0) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[0].method291(29, 13);
			}
			if (arg0[1] != -1 && arg1 != 1) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[1].method291(53, 11);
			}
			if (arg0[2] != -1 && arg1 != 2) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[2].method291(82, 11);
			}
			if (arg0[3] != -1 && arg1 != 3) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[3].method291(115, 12);
			}
			if (arg0[4] != -1 && arg1 != 4) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[4].method291(153, 13);
			}
			if (arg0[5] != -1 && arg1 != 5) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[5].method291(180, 11);
			}
			if (arg0[6] != -1 && arg1 != 6) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[6].method291(208, 13);
			}
		}
		Static90.aClass9_25.method863(arg4, 160, 516);
		Static50.aClass9_4.method861();
		Static91.aClass2_Sub1_Sub3_Sub1_15.method291(0, 0);
		if (arg3) {
			if (arg0[arg2] != -1) {
				if (arg2 == 7) {
					Static28.aClass2_Sub1_Sub3_Sub1_6.method291(42, 0);
				}
				if (arg2 == 8) {
					Static10.aClass2_Sub1_Sub3_Sub1_3.method291(74, 0);
				}
				if (arg2 == 9) {
					Static10.aClass2_Sub1_Sub3_Sub1_3.method291(102, 0);
				}
				if (arg2 == 10) {
					Static13.aClass2_Sub1_Sub3_Sub1_4.method291(130, 1);
				}
				if (arg2 == 11) {
					Static47.aClass2_Sub1_Sub3_Sub1_9.method291(173, 0);
				}
				if (arg2 == 12) {
					Static47.aClass2_Sub1_Sub3_Sub1_9.method291(201, 0);
				}
				if (arg2 == 13) {
					Static38.aClass2_Sub1_Sub3_Sub1_8.method291(229, 0);
				}
			}
			if (arg0[8] != -1 && arg1 != 8) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[7].method291(74, 2);
			}
			if (arg0[9] != -1 && arg1 != 9) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[8].method291(102, 3);
			}
			if (arg0[10] != -1 && arg1 != 10) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[9].method291(137, 4);
			}
			if (arg0[11] != -1 && arg1 != 11) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[10].method291(174, 2);
			}
			if (arg0[12] != -1 && arg1 != 12) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[11].method291(201, 2);
			}
			if (arg0[13] != -1 && arg1 != 13) {
				Static23.aClass2_Sub1_Sub3_Sub1Array1[12].method291(226, 2);
			}
		}
		Static50.aClass9_4.method863(arg4, 466, 496);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)I")
	public static int method1687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + local13 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local13 * (arg2 & 0xFF00) + (arg0 * (arg1 & 0xFF00)) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method1688() {
		@Pc(8) int local8;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (Static76.anInt2256 == 118) {
			local8 = Static3.aClass2_Sub6_Sub1_1.method665();
			local16 = Static5.anInt155 + (local8 >> 4 & 0x7);
			local22 = (local8 & 0x7) + Static45.anInt1607;
			local26 = Static3.aClass2_Sub6_Sub1_1.method627();
			local30 = Static3.aClass2_Sub6_Sub1_1.method665();
			local36 = local30 >> 4 & 0xF;
			local40 = local30 & 0x7;
			if (local16 - local36 <= Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0] && Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0] <= local36 + local16 && local22 - local36 <= Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0] && local22 + local36 >= Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0] && Static86.anInt2325 != 0 && local40 > 0 && Static100.anInt2712 < 50) {
				Static39.anIntArray232[Static100.anInt2712] = local26;
				Static59.anIntArray287[Static100.anInt2712] = local40;
				Static78.anIntArray321[Static100.anInt2712] = 0;
				Static34.aClass10Array1[Static100.anInt2712] = null;
				Static100.anInt2712++;
			}
		}
		@Pc(157) int local157;
		@Pc(191) int local191;
		@Pc(230) int local230;
		@Pc(183) int local183;
		@Pc(203) int local203;
		@Pc(213) int local213;
		if (Static76.anInt2256 == 129) {
			local8 = Static3.aClass2_Sub6_Sub1_1.method633();
			local16 = Static3.aClass2_Sub6_Sub1_1.method671();
			local22 = local16 >> 2;
			local26 = local16 & 0x3;
			local30 = Static41.anIntArray244[local22];
			local36 = Static3.aClass2_Sub6_Sub1_1.method628();
			local40 = Static5.anInt155 + (local36 >> 4 & 0x7);
			local157 = Static45.anInt1607 + (local36 & 0x7);
			if (local40 >= 0 && local157 >= 0 && local40 < 103 && local157 < 103) {
				local183 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local40 + 1][local157];
				local191 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local40][local157];
				local203 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local40 + 1][local157 + 1];
				local213 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local40][local157 + 1];
				if (local30 == 0) {
					@Pc(221) Class57 local221 = aClass64_1.method1758(Static58.anInt1945, local40, local157);
					if (local221 != null) {
						local230 = local221.anInt2532 >> 14 & 0x7FFF;
						if (local22 == 2) {
							local221.aClass2_Sub1_Sub4_7 = new Class2_Sub1_Sub4_Sub3(local230, 2, local26 + 4, local191, local183, local203, local213, local8, false);
							local221.aClass2_Sub1_Sub4_8 = new Class2_Sub1_Sub4_Sub3(local230, 2, local26 + 1 & 0x3, local191, local183, local203, local213, local8, false);
						} else {
							local221.aClass2_Sub1_Sub4_7 = new Class2_Sub1_Sub4_Sub3(local230, local22, local26, local191, local183, local203, local213, local8, false);
						}
					}
				}
				if (local30 == 1) {
					@Pc(293) Class53 local293 = aClass64_1.method1756(Static58.anInt1945, local40, local157);
					if (local293 != null) {
						local293.aClass2_Sub1_Sub4_6 = new Class2_Sub1_Sub4_Sub3(local293.anInt2342 >> 14 & 0x7FFF, 4, 0, local191, local183, local203, local213, local8, false);
					}
				}
				if (local30 == 2) {
					if (local22 == 11) {
						local22 = 10;
					}
					@Pc(330) Class8 local330 = aClass64_1.method1785(Static58.anInt1945, local40, local157);
					if (local330 != null) {
						local330.aClass2_Sub1_Sub4_1 = new Class2_Sub1_Sub4_Sub3(local330.anInt308 >> 14 & 0x7FFF, local22, local26, local191, local183, local203, local213, local8, false);
					}
				}
				if (local30 == 3) {
					@Pc(360) Class13 local360 = aClass64_1.method1777(Static58.anInt1945, local40, local157);
					if (local360 != null) {
						local360.aClass2_Sub1_Sub4_2 = new Class2_Sub1_Sub4_Sub3(local360.anInt647 >> 14 & 0x7FFF, 22, local26, local191, local183, local203, local213, local8, false);
					}
				}
			}
		} else if (Static76.anInt2256 == 69) {
			local8 = Static3.aClass2_Sub6_Sub1_1.method665();
			local16 = Static5.anInt155 + (local8 >> 4 & 0x7);
			local22 = Static45.anInt1607 + (local8 & 0x7);
			local26 = Static3.aClass2_Sub6_Sub1_1.method673() + local16;
			local30 = Static3.aClass2_Sub6_Sub1_1.method673() + local22;
			local36 = Static3.aClass2_Sub6_Sub1_1.method657();
			local40 = Static3.aClass2_Sub6_Sub1_1.method627();
			local157 = Static3.aClass2_Sub6_Sub1_1.method665() * 4;
			local191 = Static3.aClass2_Sub6_Sub1_1.method665() * 4;
			local183 = Static3.aClass2_Sub6_Sub1_1.method627();
			local203 = Static3.aClass2_Sub6_Sub1_1.method627();
			local213 = Static3.aClass2_Sub6_Sub1_1.method665();
			@Pc(452) int local452 = Static3.aClass2_Sub6_Sub1_1.method665();
			if (local16 >= 0 && local22 >= 0 && local16 < 104 && local22 < 104 && local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && local40 != 65535) {
				local30 = local30 * 128 + 64;
				local26 = local26 * 128 + 64;
				local22 = local22 * 128 + 64;
				local16 = local16 * 128 + 64;
				@Pc(542) Class2_Sub1_Sub4_Sub2 local542 = new Class2_Sub1_Sub4_Sub2(local40, Static58.anInt1945, local16, local22, Static42.method1057(local16, local22, Static58.anInt1945) - local157, local183 + Static49.anInt2694, local203 + Static49.anInt2694, local213, local452, local36, local191);
				local542.method558(Static49.anInt2694 + local183, local26, local30, Static42.method1057(local26, local30, Static58.anInt1945) - local191);
				Static11.aClass36_1.method1362(local542);
			}
		} else if (Static76.anInt2256 == 135) {
			local8 = Static3.aClass2_Sub6_Sub1_1.method665();
			local22 = (local8 & 0x7) + Static45.anInt1607;
			local16 = Static5.anInt155 + (local8 >> 4 & 0x7);
			local26 = Static3.aClass2_Sub6_Sub1_1.method627();
			local30 = Static3.aClass2_Sub6_Sub1_1.method665();
			local36 = Static3.aClass2_Sub6_Sub1_1.method627();
			if (local16 >= 0 && local22 >= 0 && local16 < 104 && local22 < 104) {
				local22 = local22 * 128 + 64;
				local16 = local16 * 128 + 64;
				@Pc(643) Class2_Sub1_Sub4_Sub1 local643 = new Class2_Sub1_Sub4_Sub1(local26, Static58.anInt1945, local16, local22, Static42.method1057(local16, local22, Static58.anInt1945) - local30, local36, Static49.anInt2694);
				Static55.aClass36_4.method1362(local643);
			}
		} else if (Static76.anInt2256 == 35) {
			local8 = Static3.aClass2_Sub6_Sub1_1.method665();
			local16 = (local8 >> 4 & 0x7) + Static5.anInt155;
			local22 = Static45.anInt1607 + (local8 & 0x7);
			local26 = Static3.aClass2_Sub6_Sub1_1.method665();
			local30 = local26 >> 2;
			local36 = local26 & 0x3;
			local40 = Static41.anIntArray244[local30];
			if (local16 >= 0 && local22 >= 0 && local16 < 104 && local22 < 104) {
				Static34.method872(0, -1, Static58.anInt1945, local22, local16, -1, local30, local40, local36);
			}
		} else if (Static76.anInt2256 == 63) {
			local8 = Static3.aClass2_Sub6_Sub1_1.method665();
			local16 = Static5.anInt155 + (local8 >> 4 & 0x7);
			local22 = Static45.anInt1607 + (local8 & 0x7);
			local26 = Static3.aClass2_Sub6_Sub1_1.method627();
			local30 = Static3.aClass2_Sub6_Sub1_1.method627();
			local36 = Static3.aClass2_Sub6_Sub1_1.method627();
			if (local16 >= 0 && local22 >= 0 && local16 < 104 && local22 < 104) {
				@Pc(773) Class36 local773 = Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local16][local22];
				if (local773 != null) {
					for (@Pc(780) Class2_Sub1_Sub4_Sub4 local780 = (Class2_Sub1_Sub4_Sub4) local773.method1365(); local780 != null; local780 = (Class2_Sub1_Sub4_Sub4) local773.method1361()) {
						if ((local26 & 0x7FFF) == local780.anInt1149 && local780.anInt1154 == local30) {
							local780.anInt1154 = local36;
							break;
						}
					}
					Static67.method1355(local22, local16);
				}
			}
		} else if (Static76.anInt2256 == 46) {
			local8 = Static3.aClass2_Sub6_Sub1_1.method667();
			local16 = Static3.aClass2_Sub6_Sub1_1.method632();
			local22 = Static3.aClass2_Sub6_Sub1_1.method633();
			local26 = Static3.aClass2_Sub6_Sub1_1.method656();
			local30 = (local26 >> 4 & 0x7) + Static5.anInt155;
			local36 = (local26 & 0x7) + Static45.anInt1607;
			if (local30 >= 0 && local36 >= 0 && local30 < 104 && local36 < 104 && Static2.anInt99 != local16) {
				@Pc(869) Class2_Sub1_Sub4_Sub4 local869 = new Class2_Sub1_Sub4_Sub4();
				local869.anInt1149 = local22;
				local869.anInt1154 = local8;
				if (Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local30][local36] == null) {
					Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local30][local36] = new Class36();
				}
				Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local30][local36].method1362(local869);
				Static67.method1355(local36, local30);
			}
		} else {
			@Pc(955) Class2_Sub1_Sub4_Sub4 local955;
			if (Static76.anInt2256 == 56) {
				local8 = Static3.aClass2_Sub6_Sub1_1.method632();
				local16 = Static3.aClass2_Sub6_Sub1_1.method656();
				local22 = Static5.anInt155 + (local16 >> 4 & 0x7);
				local26 = (local16 & 0x7) + Static45.anInt1607;
				local30 = Static3.aClass2_Sub6_Sub1_1.method633();
				if (local22 >= 0 && local26 >= 0 && local22 < 104 && local26 < 104) {
					local955 = new Class2_Sub1_Sub4_Sub4();
					local955.anInt1149 = local8;
					local955.anInt1154 = local30;
					if (Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local22][local26] == null) {
						Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local22][local26] = new Class36();
					}
					Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local22][local26].method1362(local955);
					Static67.method1355(local26, local22);
				}
			} else {
				if (Static76.anInt2256 == 21) {
					local8 = Static3.aClass2_Sub6_Sub1_1.method632();
					local16 = Static3.aClass2_Sub6_Sub1_1.method628();
					local26 = Static45.anInt1607 + (local16 & 0x7);
					local22 = (local16 >> 4 & 0x7) + Static5.anInt155;
					local30 = Static3.aClass2_Sub6_Sub1_1.method667();
					local36 = Static3.aClass2_Sub6_Sub1_1.method628();
					local40 = local36 >> 2;
					local191 = Static41.anIntArray244[local40];
					local157 = local36 & 0x3;
					@Pc(1046) byte local1046 = Static3.aClass2_Sub6_Sub1_1.method662();
					@Pc(1050) byte local1050 = Static3.aClass2_Sub6_Sub1_1.method645();
					@Pc(1054) byte local1054 = Static3.aClass2_Sub6_Sub1_1.method673();
					@Pc(1058) byte local1058 = Static3.aClass2_Sub6_Sub1_1.method645();
					local230 = Static3.aClass2_Sub6_Sub1_1.method632();
					@Pc(1066) int local1066 = Static3.aClass2_Sub6_Sub1_1.method633();
					@Pc(1077) Class2_Sub1_Sub4_Sub6_Sub1 local1077;
					if (local8 == Static2.anInt99) {
						local1077 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1;
					} else {
						local1077 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local8];
					}
					if (local1077 != null) {
						@Pc(1087) Class2_Sub1_Sub16 local1087 = Static92.method1045(local230);
						@Pc(1095) int local1095 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local22][local26];
						@Pc(1105) int local1105 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local22 + 1][local26];
						@Pc(1115) int local1115 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local22][local26 + 1];
						@Pc(1127) int local1127 = Static16.anIntArrayArrayArray1[Static58.anInt1945][local22 + 1][local26 + 1];
						@Pc(1137) Class2_Sub1_Sub4_Sub5 local1137 = local1087.method1704(local1115, local40, local1095, local1105, local1127, local157);
						if (local1137 != null) {
							Static34.method872(local30 + 1, -1, Static58.anInt1945, local26, local22, local1066 + 1, 0, local191, 0);
							local1077.aClass2_Sub1_Sub4_Sub5_3 = local1137;
							@Pc(1160) int local1160 = local1087.anInt2698;
							@Pc(1163) int local1163 = local1087.anInt2699;
							local1077.anInt1731 = Static49.anInt2694 + local30;
							local1077.anInt1720 = Static49.anInt2694 + local1066;
							@Pc(1178) byte local1178;
							if (local1058 > local1050) {
								local1178 = local1058;
								local1058 = local1050;
								local1050 = local1178;
							}
							if (local157 == 1 || local157 == 3) {
								local1163 = local1087.anInt2698;
								local1160 = local1087.anInt2699;
							}
							local1077.anInt1724 = local1163 * 64 + local26 * 128;
							local1077.anInt1728 = local22 * 128 + local1160 * 64;
							if (local1046 < local1054) {
								local1178 = local1054;
								local1054 = local1046;
								local1046 = local1178;
							}
							local1077.anInt1719 = Static42.method1057(local1077.anInt1728, local1077.anInt1724, Static58.anInt1945);
							local1077.anInt1713 = local1058 + local22;
							local1077.anInt1715 = local1050 + local22;
							local1077.anInt1729 = local1046 + local26;
							local1077.anInt1721 = local1054 + local26;
						}
					}
				}
				if (Static76.anInt2256 == 244) {
					local8 = Static3.aClass2_Sub6_Sub1_1.method633();
					local16 = Static3.aClass2_Sub6_Sub1_1.method671();
					local26 = Static45.anInt1607 + (local16 & 0x7);
					local22 = (local16 >> 4 & 0x7) + Static5.anInt155;
					local30 = Static3.aClass2_Sub6_Sub1_1.method656();
					local40 = local30 & 0x3;
					local36 = local30 >> 2;
					local157 = Static41.anIntArray244[local36];
					if (local22 >= 0 && local26 >= 0 && local22 < 104 && local26 < 104) {
						Static34.method872(0, local8, Static58.anInt1945, local26, local22, -1, local36, local157, local40);
					}
				} else if (Static76.anInt2256 == 221) {
					local8 = Static3.aClass2_Sub6_Sub1_1.method628();
					local22 = Static45.anInt1607 + (local8 & 0x7);
					local16 = Static5.anInt155 + (local8 >> 4 & 0x7);
					local26 = Static3.aClass2_Sub6_Sub1_1.method627();
					if (local16 >= 0 && local22 >= 0 && local16 < 104 && local22 < 104) {
						@Pc(1380) Class36 local1380 = Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local16][local22];
						if (local1380 != null) {
							for (local955 = (Class2_Sub1_Sub4_Sub4) local1380.method1365(); local955 != null; local955 = (Class2_Sub1_Sub4_Sub4) local1380.method1361()) {
								if ((local26 & 0x7FFF) == local955.anInt1149) {
									local955.method1695();
									break;
								}
							}
							if (local1380.method1365() == null) {
								Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local16][local22] = null;
							}
							Static67.method1355(local22, local16);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	public static void method1689() {
		aClass31_923 = null;
		aClass31_921 = null;
		aClass64_1 = null;
		aClass31_922 = null;
		aClass31_920 = null;
		aClass2_Sub1_Sub3_Sub1_19 = null;
	}
}
