import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!ag;")
	public static Class4 aClass4_55;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!ag;")
	public static Class4 aClass4_56;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_777 = Static161.method2971(": ");

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[104][104];

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_778 = Static161.method2971("scape main");

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!dd;")
	public static Class13 aClass13_779 = Static161.method2971("<col=ff7000>");

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_780 = Static161.method2971("Weiter");

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!fd;")
	public static Class20 aClass20_6 = null;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_781 = Static161.method2971("<col=00ff80>");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1776() {
		aClass13_781 = null;
		aClass13_778 = null;
		aClass4_56 = null;
		aClass13_780 = null;
		aClass13_779 = null;
		aClass4_55 = null;
		anIntArrayArray19 = null;
		aClass20_6 = null;
		aClass13_777 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[BZIIIII[Lclient!d;)V")
	public static void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class12[] arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg0 > 0 && local3 + arg0 < 103 && local7 + arg3 > 0 && local7 + arg3 < 103) {
					arg8[arg6].anIntArrayArray7[local3 + arg0][local7 + arg3] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(77) Class1_Sub8 local77 = new Class1_Sub8(arg2);
		for (@Pc(87) int local87 = 0; local87 < 4; local87++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					if (local87 == arg5 && local91 >= arg4 && local91 < arg4 + 8 && local95 >= arg1 && arg1 + 8 > local95) {
						Static39.method1023(arg3 + Static94.method1974(arg7, local95 & 0x7, local91 & 0x7), arg7, 0, Static148.method2590(local91 & 0x7, arg7, local95 & 0x7) + arg0, local77, arg6, 0);
					} else {
						Static39.method1023(-1, 0, 0, -1, local77, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method1778() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (Static184.anInt4077 == 232) {
			local12 = Static153.aClass1_Sub8_Sub1_2.method1600();
			local20 = (local12 >> 4 & 0x7) + Static10.anInt392;
			local27 = Static108.anInt2954 + (local12 & 0x7);
			local31 = Static153.aClass1_Sub8_Sub1_2.method1603();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local43 = Static51.anIntArray178[local35];
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				Static71.method1487(local27, -1, local39, local20, 0, Static156.anInt3696, local35, local43, -1);
			}
		} else if (Static184.anInt4077 == 130) {
			local12 = Static153.aClass1_Sub8_Sub1_2.method1636();
			local20 = Static153.aClass1_Sub8_Sub1_2.method1603();
			local31 = (local20 & 0x7) + Static108.anInt2954;
			local27 = (local20 >> 4 & 0x7) + Static10.anInt392;
			local35 = Static153.aClass1_Sub8_Sub1_2.method1636();
			local39 = Static153.aClass1_Sub8_Sub1_2.method1636();
			if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && Static26.anInt947 != local35) {
				@Pc(133) Class1_Sub2_Sub2_Sub7 local133 = new Class1_Sub2_Sub2_Sub7();
				local133.anInt3717 = local39;
				local133.anInt3719 = local12;
				if (Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local27][local31] == null) {
					Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local27][local31] = new Class82();
				}
				Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local27][local31].method2853(local133);
				Static162.method2778(local31, local27);
			}
		} else if (Static184.anInt4077 == 84) {
			local12 = Static153.aClass1_Sub8_Sub1_2.method1607();
			local20 = (local12 >> 4 & 0x7) + Static10.anInt392;
			local27 = Static108.anInt2954 + (local12 & 0x7);
			local31 = Static153.aClass1_Sub8_Sub1_2.method1642();
			local35 = Static153.aClass1_Sub8_Sub1_2.method1607();
			local39 = Static153.aClass1_Sub8_Sub1_2.method1642();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				local20 = local20 * 128 + 64;
				local27 = local27 * 128 + 64;
				@Pc(249) Class1_Sub2_Sub2_Sub4 local249 = new Class1_Sub2_Sub2_Sub4(local31, Static156.anInt3696, local20, local27, Static66.method1449(Static156.anInt3696, local27, local20) - local35, local39, Static78.anInt2168);
				Static21.aClass82_3.method2853(local249);
			}
		} else if (Static184.anInt4077 == 97) {
			local12 = Static153.aClass1_Sub8_Sub1_2.method1607();
			local27 = (local12 & 0x7) + Static108.anInt2954;
			local20 = Static10.anInt392 + (local12 >> 4 & 0x7);
			local31 = Static153.aClass1_Sub8_Sub1_2.method1642();
			local35 = Static153.aClass1_Sub8_Sub1_2.method1642();
			local39 = Static153.aClass1_Sub8_Sub1_2.method1642();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				@Pc(315) Class82 local315 = Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local20][local27];
				if (local315 != null) {
					for (@Pc(322) Class1_Sub2_Sub2_Sub7 local322 = (Class1_Sub2_Sub2_Sub7) local315.method2849(); local322 != null; local322 = (Class1_Sub2_Sub2_Sub7) local315.method2855()) {
						if (local322.anInt3717 == (local31 & 0x7FFF) && local35 == local322.anInt3719) {
							local322.anInt3719 = local39;
							break;
						}
					}
					Static162.method2778(local27, local20);
				}
			}
		} else {
			@Pc(392) int local392;
			if (Static184.anInt4077 == 85) {
				local12 = Static153.aClass1_Sub8_Sub1_2.method1638();
				local27 = (local12 & 0x7) + Static108.anInt2954;
				local20 = Static10.anInt392 + (local12 >> 4 & 0x7);
				local31 = Static153.aClass1_Sub8_Sub1_2.method1636();
				local35 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local39 = local35 >> 2;
				local392 = Static51.anIntArray178[local39];
				local43 = local35 & 0x3;
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					Static71.method1487(local27, -1, local43, local20, 0, Static156.anInt3696, local39, local392, local31);
				}
			} else {
				@Pc(493) int local493;
				if (Static184.anInt4077 == 235) {
					local12 = Static153.aClass1_Sub8_Sub1_2.method1607();
					local20 = (local12 >> 4 & 0x7) + Static10.anInt392;
					local27 = (local12 & 0x7) + Static108.anInt2954;
					local31 = Static153.aClass1_Sub8_Sub1_2.method1642();
					if (local31 == 65535) {
						local31 = -1;
					}
					local35 = Static153.aClass1_Sub8_Sub1_2.method1607();
					local39 = local35 >> 4 & 0xF;
					local392 = Static153.aClass1_Sub8_Sub1_2.method1607();
					local43 = local35 & 0x7;
					if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
						local493 = local39 + 1;
						if (local20 - local493 <= Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0] && Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0] <= local493 + local20 && Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0] >= local27 - local493 && local493 + local27 >= Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0] && Static21.anInt786 != 0 && local43 > 0 && Static175.anInt3994 < 50 && local31 != -1) {
							Static156.anIntArray383[Static175.anInt3994] = local31;
							Static17.anIntArray100[Static175.anInt3994] = local43;
							Static70.anIntArray212[Static175.anInt3994] = local392;
							Static114.aClass83Array1[Static175.anInt3994] = null;
							Static167.anIntArray434[Static175.anInt3994] = (local20 << 16) - (-(local27 << 8) - local39);
							Static175.anInt3994++;
						}
					}
				}
				@Pc(635) Class1_Sub2_Sub2_Sub7 local635;
				if (Static184.anInt4077 == 32) {
					local12 = Static153.aClass1_Sub8_Sub1_2.method1642();
					local20 = Static153.aClass1_Sub8_Sub1_2.method1634();
					local27 = Static153.aClass1_Sub8_Sub1_2.method1600();
					local35 = Static108.anInt2954 + (local27 & 0x7);
					local31 = Static10.anInt392 + (local27 >> 4 & 0x7);
					if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104) {
						local635 = new Class1_Sub2_Sub2_Sub7();
						local635.anInt3717 = local20;
						local635.anInt3719 = local12;
						if (Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local31][local35] == null) {
							Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local31][local35] = new Class82();
						}
						Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local31][local35].method2853(local635);
						Static162.method2778(local35, local31);
					}
				} else if (Static184.anInt4077 == 200) {
					local12 = Static153.aClass1_Sub8_Sub1_2.method1634();
					local20 = Static153.aClass1_Sub8_Sub1_2.method1638();
					local31 = Static108.anInt2954 + (local20 & 0x7);
					local27 = Static10.anInt392 + (local20 >> 4 & 0x7);
					if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104) {
						@Pc(730) Class82 local730 = Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local27][local31];
						if (local730 != null) {
							for (local635 = (Class1_Sub2_Sub2_Sub7) local730.method2849(); local635 != null; local635 = (Class1_Sub2_Sub2_Sub7) local730.method2855()) {
								if (local635.anInt3717 == (local12 & 0x7FFF)) {
									local635.method3056();
									break;
								}
							}
							if (local730.method2849() == null) {
								Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local27][local31] = null;
							}
							Static162.method2778(local31, local27);
						}
					}
				} else {
					@Pc(828) int local828;
					@Pc(832) int local832;
					@Pc(836) int local836;
					@Pc(859) int local859;
					if (Static184.anInt4077 == 170) {
						@Pc(785) byte local785 = Static153.aClass1_Sub8_Sub1_2.method1611();
						@Pc(789) byte local789 = Static153.aClass1_Sub8_Sub1_2.method1648();
						@Pc(793) byte local793 = Static153.aClass1_Sub8_Sub1_2.method1647();
						local31 = Static153.aClass1_Sub8_Sub1_2.method1638();
						local39 = Static108.anInt2954 + (local31 & 0x7);
						local35 = (local31 >> 4 & 0x7) + Static10.anInt392;
						@Pc(816) byte local816 = Static153.aClass1_Sub8_Sub1_2.method1647();
						local392 = Static153.aClass1_Sub8_Sub1_2.method1634();
						local493 = Static153.aClass1_Sub8_Sub1_2.method1642();
						local828 = Static153.aClass1_Sub8_Sub1_2.method1636();
						local832 = Static153.aClass1_Sub8_Sub1_2.method1634();
						local836 = Static153.aClass1_Sub8_Sub1_2.method1638();
						@Pc(847) Class1_Sub2_Sub2_Sub2_Sub2 local847;
						if (Static26.anInt947 == local493) {
							local847 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1;
						} else {
							local847 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local493];
						}
						@Pc(855) int local855 = local836 & 0x3;
						local859 = local836 >> 2;
						@Pc(863) int local863 = Static51.anIntArray178[local859];
						if (local847 != null) {
							@Pc(869) Class1_Sub2_Sub14 local869 = Static4.method79(local832);
							@Pc(878) int local878;
							@Pc(881) int local881;
							if (local855 == 1 || local855 == 3) {
								local878 = local869.anInt3314;
								local881 = local869.anInt3302;
							} else {
								local881 = local869.anInt3314;
								local878 = local869.anInt3302;
							}
							@Pc(896) int local896 = local35 + (local878 >> 1);
							@Pc(905) int local905 = local35 + (local878 + 1 >> 1);
							@Pc(913) int local913 = (local881 + 1 >> 1) + local39;
							@Pc(919) int local919 = (local881 >> 1) + local39;
							@Pc(923) int[][] local923 = Static183.anIntArrayArrayArray8[Static156.anInt3696];
							@Pc(950) int local950 = local923[local905][local913] + local923[local905][local919] + local923[local896][local919] + local923[local896][local913] >> 2;
							@Pc(958) int local958 = (local35 << 7) + (local878 << 6);
							@Pc(966) int local966 = (local39 << 7) + (local881 << 6);
							@Pc(976) Class1_Sub2_Sub2_Sub5 local976 = local869.method2373(local855, local950, local923, local966, local859, local958);
							if (local976 != null) {
								Static71.method1487(local39, local392 + 1, 0, local35, local828 + 1, Static156.anInt3696, 0, local863, -1);
								local847.aClass1_Sub2_Sub2_Sub5_1 = local976;
								local847.anInt2608 = Static78.anInt2168 + local828;
								local847.anInt2612 = local39 * 128 + local881 * 64;
								@Pc(1016) byte local1016;
								if (local793 > local816) {
									local1016 = local793;
									local793 = local816;
									local816 = local1016;
								}
								local847.anInt2617 = local950;
								local847.anInt2611 = local793 + local35;
								if (local785 < local789) {
									local1016 = local789;
									local789 = local785;
									local785 = local1016;
								}
								local847.anInt2625 = Static78.anInt2168 + local392;
								local847.anInt2622 = local816 + local35;
								local847.anInt2634 = local785 + local39;
								local847.anInt2633 = local789 + local39;
								local847.anInt2627 = local35 * 128 + local878 * 64;
							}
						}
					}
					if (Static184.anInt4077 == 148) {
						local12 = Static153.aClass1_Sub8_Sub1_2.method1607();
						local20 = (local12 >> 4 & 0x7) + Static10.anInt392;
						local27 = (local12 & 0x7) + Static108.anInt2954;
						local31 = Static153.aClass1_Sub8_Sub1_2.method1611() + local20;
						local35 = local27 + Static153.aClass1_Sub8_Sub1_2.method1611();
						local39 = Static153.aClass1_Sub8_Sub1_2.method1627();
						local43 = Static153.aClass1_Sub8_Sub1_2.method1642();
						local392 = Static153.aClass1_Sub8_Sub1_2.method1607() * 4;
						local493 = Static153.aClass1_Sub8_Sub1_2.method1607() * 4;
						local828 = Static153.aClass1_Sub8_Sub1_2.method1642();
						local832 = Static153.aClass1_Sub8_Sub1_2.method1642();
						local836 = Static153.aClass1_Sub8_Sub1_2.method1607();
						local859 = Static153.aClass1_Sub8_Sub1_2.method1607();
						if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local43 != 65535) {
							local35 = local35 * 128 + 64;
							local20 = local20 * 128 + 64;
							local31 = local31 * 128 + 64;
							local27 = local27 * 128 + 64;
							@Pc(1224) Class1_Sub2_Sub2_Sub3 local1224 = new Class1_Sub2_Sub2_Sub3(local43, Static156.anInt3696, local20, local27, Static66.method1449(Static156.anInt3696, local27, local20) - local392, local828 - -Static78.anInt2168, Static78.anInt2168 + local832, local836, local859, local39, local493);
							local1224.method684(local828 + Static78.anInt2168, local31, local35, Static66.method1449(Static156.anInt3696, local35, local31) - local493);
							Static4.aClass82_1.method2853(local1224);
						}
					} else if (Static184.anInt4077 == 206) {
						local12 = Static153.aClass1_Sub8_Sub1_2.method1600();
						local27 = local12 & 0x3;
						local20 = local12 >> 2;
						local31 = Static51.anIntArray178[local20];
						local35 = Static153.aClass1_Sub8_Sub1_2.method1634();
						local39 = Static153.aClass1_Sub8_Sub1_2.method1638();
						local392 = Static108.anInt2954 + (local39 & 0x7);
						local43 = (local39 >> 4 & 0x7) + Static10.anInt392;
						if (local43 >= 0 && local392 >= 0 && local43 < 103 && local392 < 103) {
							if (local31 == 0) {
								@Pc(1309) Class7 local1309 = Static12.method461(Static156.anInt3696, local43, local392);
								if (local1309 != null) {
									local828 = (int) (local1309.aLong33 >>> 32) & Integer.MAX_VALUE;
									if (local20 == 2) {
										local1309.aClass1_Sub2_Sub2_2 = new Class1_Sub2_Sub2_Sub6(local828, 2, local27 + 4, Static156.anInt3696, local43, local392, local35, false, local1309.aClass1_Sub2_Sub2_2);
										local1309.aClass1_Sub2_Sub2_1 = new Class1_Sub2_Sub2_Sub6(local828, 2, local27 + 1 & 0x3, Static156.anInt3696, local43, local392, local35, false, local1309.aClass1_Sub2_Sub2_1);
									} else {
										local1309.aClass1_Sub2_Sub2_2 = new Class1_Sub2_Sub2_Sub6(local828, local20, local27, Static156.anInt3696, local43, local392, local35, false, local1309.aClass1_Sub2_Sub2_2);
									}
								}
							}
							if (local31 == 1) {
								@Pc(1383) Class69 local1383 = Static88.method1850(Static156.anInt3696, local43, local392);
								if (local1383 != null) {
									local828 = Integer.MAX_VALUE & (int) (local1383.aLong114 >>> 32);
									if (local20 == 4 || local20 == 5) {
										local1383.aClass1_Sub2_Sub2_10 = new Class1_Sub2_Sub2_Sub6(local828, 4, local27, Static156.anInt3696, local43, local392, local35, false, local1383.aClass1_Sub2_Sub2_10);
									} else if (local20 == 6) {
										local1383.aClass1_Sub2_Sub2_10 = new Class1_Sub2_Sub2_Sub6(local828, 4, local27 + 4, Static156.anInt3696, local43, local392, local35, false, local1383.aClass1_Sub2_Sub2_10);
									} else if (local20 == 7) {
										local1383.aClass1_Sub2_Sub2_10 = new Class1_Sub2_Sub2_Sub6(local828, 4, (local27 + 2 & 0x3) + 4, Static156.anInt3696, local43, local392, local35, false, local1383.aClass1_Sub2_Sub2_10);
									} else if (local20 == 8) {
										local1383.aClass1_Sub2_Sub2_10 = new Class1_Sub2_Sub2_Sub6(local828, 4, local27 + 4, Static156.anInt3696, local43, local392, local35, false, local1383.aClass1_Sub2_Sub2_10);
										local1383.aClass1_Sub2_Sub2_9 = new Class1_Sub2_Sub2_Sub6(local828, 4, (local27 + 2 & 0x3) + 4, Static156.anInt3696, local43, local392, local35, false, local1383.aClass1_Sub2_Sub2_9);
									}
								}
							}
							if (local31 == 2) {
								@Pc(1521) Class59 local1521 = Static20.method681(Static156.anInt3696, local43, local392);
								if (local20 == 11) {
									local20 = 10;
								}
								if (local1521 != null) {
									local1521.aClass1_Sub2_Sub2_7 = new Class1_Sub2_Sub2_Sub6(Integer.MAX_VALUE & (int) (local1521.aLong106 >>> 32), local20, local27, Static156.anInt3696, local43, local392, local35, false, local1521.aClass1_Sub2_Sub2_7);
								}
							}
							if (local31 == 3) {
								@Pc(1557) Class56 local1557 = Static14.method533(Static156.anInt3696, local43, local392);
								if (local1557 != null) {
									local1557.aClass1_Sub2_Sub2_6 = new Class1_Sub2_Sub2_Sub6((int) (local1557.aLong104 >>> 32) & Integer.MAX_VALUE, 22, local27, Static156.anInt3696, local43, local392, local35, false, local1557.aClass1_Sub2_Sub2_6);
								}
							}
						}
					}
				}
			}
		}
	}
}
