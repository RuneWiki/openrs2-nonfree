import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!q", name = "C", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_22;

	@OriginalMember(owner = "client!q", name = "K", descriptor = "Lclient!pb;")
	public static Class41 aClass41_73;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "[Lclient!mc;")
	public static Class1_Sub2[] aClass1_Sub2Array4 = new Class1_Sub2[8];

	@OriginalMember(owner = "client!q", name = "y", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1761 = Static69.method1153("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!q", name = "E", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1762 = Static69.method1153("Freunde");

	@OriginalMember(owner = "client!q", name = "G", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1763 = Static69.method1153("Trade)4compete");

	@OriginalMember(owner = "client!q", name = "H", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1764 = Static69.method1153("Your account is already logged in)3");

	@OriginalMember(owner = "client!q", name = "J", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1765 = aClass64_1764;

	@OriginalMember(owner = "client!q", name = "L", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1766 = aClass64_1763;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)Z")
	public static boolean method2010(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(I)I")
	public static int method2011(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static60.anIntArray208[arg0];
		@Pc(11) int local11 = (local3 * Static101.anInt2260 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
	public static void method2013(@OriginalArg(0) int arg0) {
		Static74.method1231(arg0);
		Static3.method125(arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)V")
	public static void method2016(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!td;III)V")
	public static void method2018(@OriginalArg(0) Class1_Sub1_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((arg1 & 0x10) != 0) {
			arg0.aClass64_1528 = Static64.aClass1_Sub6_Sub1_2.method1831();
			if (arg0.aClass64_1528.method1476(0) == 126) {
				arg0.aClass64_1528 = arg0.aClass64_1528.method1481(1);
				Static71.method1178(arg0.aClass64_1543, arg0.aClass64_1528, 2);
			} else if (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1 == arg0) {
				Static71.method1178(arg0.aClass64_1543, arg0.aClass64_1528, 2);
			}
			arg0.anInt2405 = 150;
			arg0.anInt2365 = 0;
			arg0.anInt2374 = 0;
		}
		if ((arg1 & 0x200) != 0) {
			arg0.anInt2385 = Static64.aClass1_Sub6_Sub1_2.method1857();
			arg0.anInt2366 = Static64.aClass1_Sub6_Sub1_2.method1826();
			arg0.anInt2394 = Static64.aClass1_Sub6_Sub1_2.method1837();
			arg0.anInt2356 = Static64.aClass1_Sub6_Sub1_2.method1857();
			arg0.anInt2403 = Static64.aClass1_Sub6_Sub1_2.method1850() + Static15.anInt471;
			arg0.anInt2370 = Static64.aClass1_Sub6_Sub1_2.method1842() + Static15.anInt471;
			arg0.anInt2388 = Static64.aClass1_Sub6_Sub1_2.method1826();
			arg0.method1692();
		}
		if ((arg1 & 0x100) != 0) {
			arg0.anInt2382 = Static64.aClass1_Sub6_Sub1_2.method1832();
			@Pc(119) int local119 = Static64.aClass1_Sub6_Sub1_2.method1817();
			arg0.anInt2369 = Static15.anInt471 + (local119 & 0xFFFF);
			arg0.anInt2402 = 0;
			if (arg0.anInt2382 == 65535) {
				arg0.anInt2382 = -1;
			}
			arg0.anInt2391 = local119 >> 16;
			if (arg0.anInt2369 > Static15.anInt471) {
				arg0.anInt2402 = -1;
			}
			arg0.anInt2379 = 0;
		}
		if ((arg1 & 0x4) != 0) {
			arg0.anInt2372 = Static64.aClass1_Sub6_Sub1_2.method1842();
			if (arg0.anInt2372 == 65535) {
				arg0.anInt2372 = -1;
			}
		}
		@Pc(196) int local196;
		if ((arg1 & 0x1) != 0) {
			local196 = Static64.aClass1_Sub6_Sub1_2.method1826();
			@Pc(199) byte[] local199 = new byte[local196];
			@Pc(204) Class1_Sub6 local204 = new Class1_Sub6(local199);
			Static64.aClass1_Sub6_Sub1_2.method1848(local199, local196);
			Static98.aClass1_Sub6Array1[arg2] = local204;
			arg0.method1697(local204);
		}
		if ((arg1 & 0x40) != 0) {
			arg0.anInt2364 = Static64.aClass1_Sub6_Sub1_2.method1850();
			arg0.anInt2373 = Static64.aClass1_Sub6_Sub1_2.method1832();
		}
		@Pc(244) int local244;
		if ((arg1 & 0x20) != 0) {
			local196 = Static64.aClass1_Sub6_Sub1_2.method1850();
			local244 = Static64.aClass1_Sub6_Sub1_2.method1826();
			@Pc(248) int local248 = Static64.aClass1_Sub6_Sub1_2.method1826();
			@Pc(251) int local251 = Static64.aClass1_Sub6_Sub1_2.anInt2574;
			if (arg0.aClass64_1543 != null && arg0.aClass54_2 != null) {
				@Pc(262) long local262 = arg0.aClass64_1543.method1492();
				@Pc(264) boolean local264 = false;
				if (local244 <= 1) {
					for (@Pc(269) int local269 = 0; local269 < Static73.anInt1656; local269++) {
						if (local262 == Static69.aLongArray5[local269]) {
							local264 = true;
							break;
						}
					}
				}
				if (!local264 && Static17.anInt574 == 0) {
					Static14.aClass1_Sub6_1.anInt2574 = 0;
					Static64.aClass1_Sub6_Sub1_2.method1828(Static14.aClass1_Sub6_1.aByteArray27, local248);
					Static14.aClass1_Sub6_1.anInt2574 = 0;
					@Pc(312) Class64 local312 = Static49.method888(Static14.aClass1_Sub6_1).method1480();
					arg0.aClass64_1528 = local312.method1477();
					arg0.anInt2365 = local196 >> 8;
					arg0.anInt2374 = local196 & 0xFF;
					arg0.anInt2405 = 150;
					if (local244 == 2 || local244 == 3) {
						Static71.method1178(Static82.method1383(new Class64[] { Static66.aClass64_949, arg0.aClass64_1543 }), local312, 1);
					} else if (local244 == 1) {
						Static71.method1178(Static82.method1383(new Class64[] { Static41.aClass64_1692, arg0.aClass64_1543 }), local312, 1);
					} else {
						Static71.method1178(arg0.aClass64_1543, local312, 2);
					}
				}
			}
			Static64.aClass1_Sub6_Sub1_2.anInt2574 = local251 + local248;
		}
		if ((arg1 & 0x400) != 0) {
			local196 = Static64.aClass1_Sub6_Sub1_2.method1841();
			local244 = Static64.aClass1_Sub6_Sub1_2.method1857();
			arg0.method1686(Static15.anInt471, local244, local196);
			arg0.anInt2399 = Static15.anInt471 + 300;
			arg0.anInt2392 = Static64.aClass1_Sub6_Sub1_2.method1837();
			arg0.anInt2376 = Static64.aClass1_Sub6_Sub1_2.method1857();
		}
		if ((arg1 & 0x2) != 0) {
			local196 = Static64.aClass1_Sub6_Sub1_2.method1857();
			local244 = Static64.aClass1_Sub6_Sub1_2.method1826();
			arg0.method1686(Static15.anInt471, local244, local196);
			arg0.anInt2399 = Static15.anInt471 + 300;
			arg0.anInt2392 = Static64.aClass1_Sub6_Sub1_2.method1837();
			arg0.anInt2376 = Static64.aClass1_Sub6_Sub1_2.method1841();
		}
		if ((arg1 & 0x8) == 0) {
			return;
		}
		local196 = Static64.aClass1_Sub6_Sub1_2.method1850();
		local244 = Static64.aClass1_Sub6_Sub1_2.method1841();
		if (local196 == 65535) {
			local196 = -1;
		}
		Static61.method1080(local244, local196, arg0);
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
	public static void method2020() {
		aClass64_1764 = null;
		aClass41_Sub1_22 = null;
		aClass41_73 = null;
		aClass64_1765 = null;
		aClass64_1761 = null;
		aClass64_1766 = null;
		aClass64_1762 = null;
		aClass1_Sub2Array4 = null;
		aClass64_1763 = null;
	}
}
