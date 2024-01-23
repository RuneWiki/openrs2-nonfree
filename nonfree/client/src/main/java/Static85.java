import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "[S")
	public static short[] aShortArray45;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!ui;")
	public static Class175 aClass175_12 = new Class175(2);

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString66 = "K";

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIILclient!si;)V")
	public static void method1714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class157 arg2) {
		if (arg2.anInt4708 == 1) {
			Static69.method1328("", 0, (short) 3, -1, arg2.aString173, arg2.anInt4672, 0L);
		}
		@Pc(38) String local38;
		if (arg2.anInt4708 == 2 && !Static187.aBoolean318) {
			local38 = Static315.method4680(arg2);
			if (local38 != null) {
				Static69.method1328("<col=00ff00>" + arg2.aString171, -1, (short) 28, -1, local38, arg2.anInt4672, 0L);
			}
		}
		if (arg2.anInt4708 == 3) {
			Static69.method1328("", 0, (short) 57, -1, Static18.aString11, arg2.anInt4672, 0L);
		}
		if (arg2.anInt4708 == 4) {
			Static69.method1328("", 0, (short) 47, -1, arg2.aString173, arg2.anInt4672, 0L);
		}
		if (arg2.anInt4708 == 5) {
			Static69.method1328("", 0, (short) 11, -1, arg2.aString173, arg2.anInt4672, 0L);
		}
		if (arg2.anInt4708 == 6 && Static26.aClass157_2 == null) {
			Static69.method1328("", -1, (short) 33, -1, arg2.aString173, arg2.anInt4672, 0L);
		}
		@Pc(157) int local157;
		@Pc(155) int local155;
		if (arg2.anInt4748 == 2) {
			local155 = 0;
			for (local157 = 0; local157 < arg2.anInt4704; local157++) {
				for (@Pc(163) int local163 = 0; local163 < arg2.anInt4665; local163++) {
					@Pc(179) int local179 = (arg2.anInt4734 + 32) * local163;
					@Pc(187) int local187 = (arg2.anInt4741 + 32) * local157;
					if (local155 < 20) {
						local187 += arg2.anIntArray528[local155];
						local179 += arg2.anIntArray526[local155];
					}
					if (arg0 >= local179 && arg1 >= local187 && local179 + 32 > arg0 && local187 + 32 > arg1) {
						Static279.anInt5131 = local155;
						Static134.aClass157_11 = arg2;
						if (arg2.anIntArray538[local155] > 0) {
							@Pc(242) Class1_Sub11 local242 = Static42.method777(arg2);
							@Pc(251) Class3 local251 = Static69.method1330(arg2.anIntArray538[local155] - 1);
							if (Static101.anInt2152 == 1 && local242.method1118()) {
								if (Static154.anInt3091 != arg2.anInt4672 || local155 != Static254.anInt4750) {
									Static69.method1328(Static199.aString133 + " -> <col=ff9040>" + local251.aString3, local155, (short) 50, -1, Static253.aString167, arg2.anInt4672, (long) local251.anInt122);
								}
							} else if (Static187.aBoolean318 && local242.method1118()) {
								@Pc(551) Class1_Sub5_Sub2 local551 = Static273.anInt5036 == -1 ? null : Static283.method4279(Static273.anInt5036);
								if ((Static96.anInt2071 & 0x10) != 0 && (local551 == null || local251.method76(Static273.anInt5036, local551.anInt484) != local551.anInt484)) {
									Static69.method1328(Static176.aString113 + " -> <col=ff9040>" + local251.aString3, local155, (short) 5, Static144.anInt2797, Static132.aString88, arg2.anInt4672, (long) local251.anInt122);
								}
							} else {
								@Pc(269) String[] local269 = local251.aStringArray1;
								if (Static13.aBoolean26) {
									local269 = Static181.method3085(local269);
								}
								@Pc(283) int local283;
								@Pc(303) byte local303;
								if (local242.method1118()) {
									for (local283 = 4; local283 >= 3; local283--) {
										if (local269 != null && local269[local283] != null) {
											if (local283 == 3) {
												local303 = 24;
											} else {
												local303 = 22;
											}
											Static69.method1328("<col=ff9040>" + local251.aString3, local155, local303, -1, local269[local283], arg2.anInt4672, (long) local251.anInt122);
										}
									}
								}
								if (local242.method1123()) {
									Static69.method1328("<col=ff9040>" + local251.aString3, local155, (short) 46, Static150.anInt3066, Static253.aString167, arg2.anInt4672, (long) local251.anInt122);
								}
								if (local242.method1118() && local269 != null) {
									for (local283 = 2; local283 >= 0; local283--) {
										if (local269[local283] != null) {
											local303 = 0;
											if (local283 == 0) {
												local303 = 7;
											}
											if (local283 == 1) {
												local303 = 34;
											}
											if (local283 == 2) {
												local303 = 17;
											}
											Static69.method1328("<col=ff9040>" + local251.aString3, local155, local303, -1, local269[local283], arg2.anInt4672, (long) local251.anInt122);
										}
									}
								}
								local269 = arg2.aStringArray30;
								if (Static13.aBoolean26) {
									local269 = Static181.method3085(local269);
								}
								if (local269 != null) {
									for (local283 = 4; local283 >= 0; local283--) {
										if (local269[local283] != null) {
											local303 = 0;
											if (local283 == 0) {
												local303 = 18;
											}
											if (local283 == 1) {
												local303 = 26;
											}
											if (local283 == 2) {
												local303 = 13;
											}
											if (local283 == 3) {
												local303 = 41;
											}
											if (local283 == 4) {
												local303 = 39;
											}
											Static69.method1328("<col=ff9040>" + local251.aString3, local155, local303, -1, local269[local283], arg2.anInt4672, (long) local251.anInt122);
										}
									}
								}
								Static69.method1328("<col=ff9040>" + local251.aString3, local155, (short) 1002, Static314.anInt5630, Static34.aString26, arg2.anInt4672, (long) local251.anInt122);
							}
						}
					}
					local155++;
				}
			}
		}
		if (!arg2.aBoolean445) {
			return;
		}
		if (!Static187.aBoolean318) {
			for (local155 = 9; local155 >= 5; local155--) {
				@Pc(698) String local698 = Static302.method4519(arg2, local155);
				if (local698 != null) {
					Static69.method1328(arg2.aString170, arg2.anInt4692, (short) 1004, Static167.method595(arg2, local155), local698, arg2.anInt4672, (long) (local155 + 1));
				}
			}
			local38 = Static315.method4680(arg2);
			if (local38 != null) {
				Static69.method1328(arg2.aString170, arg2.anInt4692, (short) 28, -1, local38, arg2.anInt4672, 0L);
			}
			for (local157 = 4; local157 >= 0; local157--) {
				@Pc(762) String local762 = Static302.method4519(arg2, local157);
				if (local762 != null) {
					Static69.method1328(arg2.aString170, arg2.anInt4692, (short) 16, Static167.method595(arg2, local157), local762, arg2.anInt4672, (long) (local157 + 1));
				}
			}
			if (Static42.method777(arg2).method1131()) {
				if (arg2.aString172 == null) {
					Static69.method1328("", arg2.anInt4692, (short) 33, -1, Static219.aString143, arg2.anInt4672, 0L);
				} else {
					Static69.method1328("", arg2.anInt4692, (short) 33, -1, arg2.aString172, arg2.anInt4672, 0L);
				}
			}
		} else if (Static42.method777(arg2).method1122() && (Static96.anInt2071 & 0x20) != 0) {
			Static69.method1328(Static176.aString113 + " -> " + arg2.aString170, arg2.anInt4692, (short) 49, Static144.anInt2797, Static132.aString88, arg2.anInt4672, 0L);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1715(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static56.method1018(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
