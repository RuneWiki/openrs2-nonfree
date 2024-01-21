import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "Lclient!pa;")
	public static Class51 aClass51_61;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1296 = Static2.method66("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1299 = Static2.method66("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1297 = aClass39_1299;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1298 = Static2.method66("backtop1");

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1300 = Static2.method66("mapedge");

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1302 = Static2.method66("flash2:");

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1301 = aClass39_1302;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!jd;I)Z")
	public static boolean method2047(@OriginalArg(1) int arg0, @OriginalArg(2) Class36 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg1.method1761(arg2, arg0);
		if (local14 == null) {
			return false;
		} else {
			Static96.method1852(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ke;ILclient!ke;III)V")
	public static void method2048(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static101.anInt2753 >= 500) {
			return;
		}
		if (arg2.method1088() > 0) {
			Static26.aClass39Array7[Static101.anInt2753] = Static20.method431(new Class39[] { arg1, Static107.aClass39_1194, arg2 });
		} else {
			Static26.aClass39Array7[Static101.anInt2753] = arg1;
		}
		Static21.anIntArray326[Static101.anInt2753] = arg3;
		Static8.anIntArray27[Static101.anInt2753] = arg4;
		Static95.anIntArray313[Static101.anInt2753] = arg0;
		Static60.anIntArray215[Static101.anInt2753] = arg5;
		Static101.anInt2753++;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBLclient!ta;IIBZ)V")
	public static void method2049(@OriginalArg(0) int arg0, @OriginalArg(2) Class36_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) long local10 = (long) (arg0 + (arg3 << 16));
		@Pc(16) Class2_Sub1_Sub14 local16 = (Class2_Sub1_Sub14) Static76.aClass57_2.method1678(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub1_Sub14) Static80.aClass57_3.method1678(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub1_Sub14) Static56.aClass57_1.method1678(local10);
		if (local16 == null) {
			if (!arg5) {
				local16 = (Class2_Sub1_Sub14) Static97.aClass57_6.method1678(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub1_Sub14();
			local16.aClass36_Sub1_19 = arg1;
			local16.anInt2382 = arg2;
			local16.aByte3 = arg4;
			if (arg5) {
				Static76.aClass57_2.method1671(local10, local16);
				Static101.anInt2761++;
			} else {
				Static102.aClass28_2.method824(local16);
				Static56.aClass57_1.method1671(local10, local16);
				Static80.anInt2185++;
			}
		} else if (arg5) {
			local16.method2053();
			Static76.aClass57_2.method1671(local10, local16);
			Static101.anInt2761++;
			Static80.anInt2185--;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	public static void method2050() {
		aClass39_1298 = null;
		aClass39_1297 = null;
		aClass39_1301 = null;
		aClass51_61 = null;
		aClass39_1299 = null;
		aClass39_1296 = null;
		aClass39_1302 = null;
		aClass39_1300 = null;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public static void method2051() {
		if (Static38.anInt1157 == 0) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(12) Class2_Sub1_Sub4_Sub1 local12 = Static49.aClass2_Sub1_Sub4_Sub1_2;
		if (Static104.anInt2782 != 0) {
			local10 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static67.aClass39Array12[local21] != null) {
				@Pc(29) byte local29 = 0;
				@Pc(33) Class39 local33 = Static42.aClass39Array8[local21];
				@Pc(37) int local37 = Static40.anIntArray169[local21];
				if (local33 != null && local33.method1093(Static46.aClass39_575)) {
					local33 = local33.method1099(5);
					local29 = 1;
				}
				if (local33 != null && local33.method1093(Static18.aClass39_279)) {
					local29 = 2;
					local33 = local33.method1099(5);
				}
				@Pc(94) int local94;
				if ((local37 == 3 || local37 == 7) && (local37 == 7 || Static96.anInt2634 == 0 || Static96.anInt2634 == 1 && Static35.method2069(local33))) {
					local94 = 329 - local10 * 13;
					local10++;
					local12.method234(Static109.aClass39_1322, 4, local94, 0);
					local12.method234(Static109.aClass39_1322, 4, local94 - 1, 65535);
					@Pc(117) int local117 = local12.method241(Static109.aClass39_1322) + 4;
					local117 += local12.method250(32);
					if (local29 == 1) {
						Static45.aClass2_Sub1_Sub4_Sub3Array3[0].method1946(local117, local94 - 12);
						local117 += 14;
					}
					if (local29 == 2) {
						Static45.aClass2_Sub1_Sub4_Sub3Array3[1].method1946(local117, local94 - 12);
						local117 += 14;
					}
					local12.method234(Static20.method431(new Class39[] { local33, Static29.aClass39_381, Static67.aClass39Array12[local21] }), local117, local94, 0);
					local12.method234(Static20.method431(new Class39[] { local33, Static29.aClass39_381, Static67.aClass39Array12[local21] }), local117, local94 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
				if (local37 == 5 && Static96.anInt2634 < 2) {
					local94 = 329 - local10 * 13;
					local12.method234(Static67.aClass39Array12[local21], 4, local94, 0);
					local12.method234(Static67.aClass39Array12[local21], 4, local94 - 1, 65535);
					local10++;
					if (local10 >= 5) {
						return;
					}
				}
				if (local37 == 6 && Static96.anInt2634 < 2) {
					local94 = 329 - local10 * 13;
					local10++;
					local12.method234(Static20.method431(new Class39[] { Static46.aClass39_568, Static92.aClass39_1104, local33, Static29.aClass39_381, Static67.aClass39Array12[local21] }), 4, local94, 0);
					local12.method234(Static20.method431(new Class39[] { Static46.aClass39_568, Static92.aClass39_1104, local33, Static29.aClass39_381, Static67.aClass39Array12[local21] }), 4, local94 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public static void method2052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class34 local11 = Static55.aClass34ArrayArrayArray1[Static18.anInt560][arg1][arg0];
		if (local11 == null) {
			Static77.aClass43_1.method1186(Static18.anInt560, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(28) Class2_Sub1_Sub2_Sub5 local28 = null;
		@Pc(35) Class2_Sub1_Sub2_Sub5 local35;
		for (local35 = (Class2_Sub1_Sub2_Sub5) local11.method872(); local35 != null; local35 = (Class2_Sub1_Sub2_Sub5) local11.method879()) {
			@Pc(41) Class2_Sub1_Sub7 local41 = Static66.method1384(local35.anInt2154);
			@Pc(44) int local44 = local41.anInt1328;
			if (local41.aBoolean68) {
				local44 *= local35.anInt2151 + 1;
			}
			if (local21 < local44) {
				local28 = local35;
				local21 = local44;
			}
		}
		local11.method878(local28);
		@Pc(80) Class2_Sub1_Sub2_Sub5 local80 = null;
		local35 = (Class2_Sub1_Sub2_Sub5) local11.method872();
		@Pc(87) Class2_Sub1_Sub2_Sub5 local87 = null;
		@Pc(95) int local95 = (arg0 << 7) + arg1 + 1610612736;
		while (local35 != null) {
			if (local28.anInt2154 != local35.anInt2154 && local80 == null) {
				local80 = local35;
			}
			if (local35.anInt2154 != local28.anInt2154 && local80.anInt2154 != local35.anInt2154 && local87 == null) {
				local87 = local35;
			}
			local35 = (Class2_Sub1_Sub2_Sub5) local11.method879();
		}
		Static77.aClass43_1.method1187(Static18.anInt560, arg1, arg0, Static51.method1779(arg0 * 128 + 64, arg1 * 128 + 64, Static18.anInt560), local28, local95, local80, local87);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	public static void method2054() {
		Static22.aBoolean35 = true;
		Static23.method446();
		if (Static7.aBoolean5) {
			Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static86.aClass39_1052, 239, 40, 0);
			Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static20.method431(new Class39[] { Static86.aClass39_1056, Static90.aClass39_1094 }), 239, 60, 128);
		} else if (Static97.anInt2646 == 1) {
			Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static107.aClass39_1196, 239, 40, 0);
			Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static20.method431(new Class39[] { Static86.aClass39_1049, Static90.aClass39_1094 }), 239, 60, 128);
		} else if (Static97.anInt2646 == 2) {
			Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static60.aClass39_706, 239, 40, 0);
			Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static20.method431(new Class39[] { Static86.aClass39_1049, Static90.aClass39_1094 }), 239, 60, 128);
		} else {
			@Pc(66) Class2_Sub1_Sub4_Sub1 local66;
			@Pc(73) int local73;
			@Pc(83) int local83;
			if (Static97.anInt2646 == 3) {
				if (Static86.aClass39_1049 != Static86.aClass39_1054) {
					Static21.method1873(Static86.aClass39_1049);
					Static86.aClass39_1054 = Static86.aClass39_1049;
				}
				local66 = Static49.aClass2_Sub1_Sub4_Sub1_2;
				Static91.method2014(0, 0, 463, 77);
				for (local73 = 0; local73 < Static72.anInt2072; local73++) {
					local83 = local73 * 14 + 18 - Static67.anInt1957;
					if (local83 > 0 && local83 < 110) {
						local66.method244(Static5.aClass39Array1[local73], 239, local83, 0);
					}
				}
				Static91.method2009();
				if (Static72.anInt2072 > 5) {
					Static46.method874(Static67.anInt1957, Static72.anInt2072 * 14 + 7, 0, 463, 77);
				}
				if (Static86.aClass39_1049.method1088() == 0) {
					Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static58.aClass39_712, 239, 40, 255);
				} else if (Static72.anInt2072 == 0) {
					Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static17.aClass39_260, 239, 40, 0);
				}
				local66.method244(Static20.method431(new Class39[] { Static86.aClass39_1049, Static90.aClass39_1094 }), 239, 90, 0);
				Static91.method2019(0, 77, 479, 0);
			} else if (Static62.aClass39_785 == null) {
				@Pc(193) boolean local193;
				if (Static99.anInt2696 != -1) {
					local193 = Static6.method2060(479, 0, 0, Static99.anInt2696, -1, 0, 2, 96);
					if (!local193) {
						Static31.aBoolean91 = true;
					}
				} else if (Static41.anInt1197 == -1) {
					local66 = Static49.aClass2_Sub1_Sub4_Sub1_2;
					Static91.method2014(0, 0, 463, 77);
					local73 = 0;
					for (local83 = 0; local83 < 100; local83++) {
						if (Static67.aClass39Array12[local83] != null) {
							@Pc(220) int local220 = Static40.anIntArray169[local83];
							@Pc(229) int local229 = Static78.anInt2158 + 70 - local73 * 14;
							@Pc(233) Class39 local233 = Static42.aClass39Array8[local83];
							@Pc(235) byte local235 = 0;
							if (local233 != null && local233.method1093(Static46.aClass39_575)) {
								local235 = 1;
								local233 = local233.method1099(5);
							}
							if (local233 != null && local233.method1093(Static18.aClass39_279)) {
								local235 = 2;
								local233 = local233.method1099(5);
							}
							if (local220 == 0) {
								local73++;
								if (local229 > 0 && local229 < 110) {
									local66.method234(Static67.aClass39Array12[local83], 4, local229, 0);
								}
							}
							@Pc(315) int local315;
							if ((local220 == 1 || local220 == 2) && (local220 == 1 || Static6.anInt2870 == 0 || Static6.anInt2870 == 1 && Static35.method2069(local233))) {
								local73++;
								if (local229 > 0 && local229 < 110) {
									local315 = 4;
									if (local235 == 1) {
										Static45.aClass2_Sub1_Sub4_Sub3Array3[0].method1946(4, local229 - 12);
										local315 += 14;
									}
									if (local235 == 2) {
										Static45.aClass2_Sub1_Sub4_Sub3Array3[1].method1946(local315, local229 - 12);
										local315 += 14;
									}
									local66.method234(Static20.method431(new Class39[] { local233, Static10.aClass39_118 }), local315, local229, 0);
									local315 += local66.method241(local233) + 8;
									local66.method234(Static67.aClass39Array12[local83], local315, local229, 255);
								}
							}
							if ((local220 == 3 || local220 == 7) && Static38.anInt1157 == 0 && (local220 == 7 || Static96.anInt2634 == 0 || Static96.anInt2634 == 1 && Static35.method2069(local233))) {
								local73++;
								if (local229 > 0 && local229 < 110) {
									local66.method234(Static109.aClass39_1322, 4, local229, 0);
									local315 = local66.method241(Static109.aClass39_1322) + 4;
									local315 += local66.method250(32);
									if (local235 == 1) {
										Static45.aClass2_Sub1_Sub4_Sub3Array3[0].method1946(local315, local229 - 12);
										local315 += 14;
									}
									if (local235 == 2) {
										Static45.aClass2_Sub1_Sub4_Sub3Array3[1].method1946(local315, local229 - 12);
										local315 += 14;
									}
									local66.method234(Static20.method431(new Class39[] { local233, Static10.aClass39_118 }), local315, local229, 0);
									local315 += local66.method241(local233) + 8;
									local66.method234(Static67.aClass39Array12[local83], local315, local229, 8388608);
								}
							}
							if (local220 == 4 && (Static78.anInt2150 == 0 || Static78.anInt2150 == 1 && Static35.method2069(local233))) {
								local73++;
								if (local229 > 0 && local229 < 110) {
									local66.method234(Static20.method431(new Class39[] { local233, Static92.aClass39_1104, Static67.aClass39Array12[local83] }), 4, local229, 8388736);
								}
							}
							if (local220 == 5 && Static38.anInt1157 == 0 && Static96.anInt2634 < 2) {
								if (local229 > 0 && local229 < 110) {
									local66.method234(Static67.aClass39Array12[local83], 4, local229, 8388608);
								}
								local73++;
							}
							if (local220 == 6 && Static38.anInt1157 == 0 && Static96.anInt2634 < 2) {
								local73++;
								if (local229 > 0 && local229 < 110) {
									local66.method234(Static20.method431(new Class39[] { Static46.aClass39_568, Static92.aClass39_1104, local233, Static10.aClass39_118 }), 4, local229, 0);
									local66.method234(Static67.aClass39Array12[local83], local66.method241(Static20.method431(new Class39[] { Static46.aClass39_568, Static92.aClass39_1104, local233 })) + 12, local229, 8388608);
								}
							}
							if (local220 == 8 && (Static78.anInt2150 == 0 || Static78.anInt2150 == 1 && Static35.method2069(local233))) {
								if (local229 > 0 && local229 < 110) {
									local66.method234(Static20.method431(new Class39[] { local233, Static92.aClass39_1104, Static67.aClass39Array12[local83] }), 4, local229, 8270336);
								}
								local73++;
							}
						}
					}
					Static91.method2009();
					Static38.anInt1150 = local73 * 14 + 7;
					if (Static38.anInt1150 < 78) {
						Static38.anInt1150 = 78;
					}
					Static46.method874(Static38.anInt1150 - Static78.anInt2158 - 77, Static38.anInt1150, 0, 463, 77);
					@Pc(730) Class39 local730;
					if (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1 == null || Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass39_1182 == null) {
						local730 = Static22.aClass39_294;
					} else {
						local730 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass39_1182;
					}
					local66.method234(Static20.method431(new Class39[] { local730, Static10.aClass39_118 }), 4, 90, 0);
					local66.method234(Static20.method431(new Class39[] { Static86.aClass39_1053, Static90.aClass39_1094 }), local66.method241(Static20.method431(new Class39[] { local730, Static29.aClass39_381 })) + 6, 90, 255);
					Static91.method2019(0, 77, 479, 0);
				} else {
					local193 = Static6.method2060(479, 0, 0, Static41.anInt1197, -1, 0, 3, 96);
					if (!local193) {
						Static31.aBoolean91 = true;
					}
				}
			} else {
				Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static62.aClass39_785, 239, 40, 0);
				Static25.aClass2_Sub1_Sub4_Sub1_1.method244(Static88.aClass39_487, 239, 60, 128);
			}
		}
		if (Static22.aBoolean36 && Static7.anInt162 == 2) {
			Static23.method444();
		}
		Static26.method551();
	}
}
