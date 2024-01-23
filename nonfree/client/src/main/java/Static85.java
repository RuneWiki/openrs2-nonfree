import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!hh", name = "uc", descriptor = "I")
	public static int anInt1909;

	@OriginalMember(owner = "client!hh", name = "Ac", descriptor = "Lclient!qe;")
	public static Class78 aClass78_427;

	@OriginalMember(owner = "client!hh", name = "Rb", descriptor = "I")
	public static int anInt1886 = -1;

	@OriginalMember(owner = "client!hh", name = "nc", descriptor = "Lclient!wj;")
	public static Class2_Sub28 aClass2_Sub28_1 = new Class2_Sub28(0, 0);

	@OriginalMember(owner = "client!hh", name = "wc", descriptor = "Lclient!qe;")
	private static Class78 aClass78_425 = Static199.method3560("Discard");

	@OriginalMember(owner = "client!hh", name = "vc", descriptor = "Lclient!qe;")
	public static Class78 aClass78_424 = aClass78_425;

	@OriginalMember(owner = "client!hh", name = "xc", descriptor = "Lclient!qe;")
	public static Class78 aClass78_426 = Static199.method3560("<)4col> x");

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBII)Lclient!dc;")
	public static Class2_Sub11 method1491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class2_Sub11 local3 = new Class2_Sub11();
		local3.anInt729 = arg2;
		local3.anInt726 = arg0;
		Static12.aClass103_4.method3665((long) arg1, local3);
		Static148.method2648(arg0);
		@Pc(28) Class64 local28 = Static204.method3618(arg1);
		if (local28 != null) {
			Static70.method2259(local28);
		}
		if (Static119.aClass64_9 != null) {
			Static70.method2259(Static119.aClass64_9);
			Static119.aClass64_9 = null;
		}
		Static138.anInt3182 = 0;
		Static202.aBoolean194 = false;
		Static169.method3108(Static100.anInt2201, Static189.anInt4406, Static224.anInt4847, Static207.anInt4608);
		if (local28 != null) {
			Static109.method1892(false, local28);
		}
		Static86.method1522(arg0);
		if (Static166.anInt1143 != -1) {
			Static161.method2899(Static166.anInt1143, 1);
		}
		return local3;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	public static void method1492() {
		@Pc(9) int local9 = Static49.anInt903 * 128 + 64;
		@Pc(15) int local15 = Static73.anInt1578 * 128 + 64;
		@Pc(24) int local24 = Static208.method3667(local15, Static137.anInt3136, local9) - Static196.anInt4471;
		if (Static5.anInt142 >= 100) {
			Static71.anInt1394 = Static49.anInt903 * 128 + 64;
			Static39.anInt727 = Static73.anInt1578 * 128 + 64;
			Static107.anInt2348 = Static208.method3667(Static39.anInt727, Static137.anInt3136, Static71.anInt1394) - Static196.anInt4471;
		} else {
			if (Static71.anInt1394 < local9) {
				Static71.anInt1394 += Static59.anInt1032 + Static5.anInt142 * (local9 - Static71.anInt1394) / 1000;
				if (Static71.anInt1394 > local9) {
					Static71.anInt1394 = local9;
				}
			}
			if (local15 > Static39.anInt727) {
				Static39.anInt727 += Static59.anInt1032 + (local15 - Static39.anInt727) * Static5.anInt142 / 1000;
				if (Static39.anInt727 > local15) {
					Static39.anInt727 = local15;
				}
			}
			if (local24 > Static107.anInt2348) {
				Static107.anInt2348 += (local24 - Static107.anInt2348) * Static5.anInt142 / 1000 + Static59.anInt1032;
				if (Static107.anInt2348 > local24) {
					Static107.anInt2348 = local24;
				}
			}
			if (local9 < Static71.anInt1394) {
				Static71.anInt1394 -= Static5.anInt142 * (Static71.anInt1394 - local9) / 1000 + Static59.anInt1032;
				if (local9 > Static71.anInt1394) {
					Static71.anInt1394 = local9;
				}
			}
			if (Static39.anInt727 > local15) {
				Static39.anInt727 -= Static5.anInt142 * (Static39.anInt727 - local15) / 1000 + Static59.anInt1032;
				if (Static39.anInt727 < local15) {
					Static39.anInt727 = local15;
				}
			}
			if (local24 < Static107.anInt2348) {
				Static107.anInt2348 -= Static5.anInt142 * (Static107.anInt2348 - local24) / 1000 + Static59.anInt1032;
				if (local24 > Static107.anInt2348) {
					Static107.anInt2348 = local24;
				}
			}
		}
		local9 = Static198.anInt4484 * 128 + 64;
		local15 = Static33.anInt571 * 128 + 64;
		local24 = Static208.method3667(local15, Static137.anInt3136, local9) - Static106.anInt2312;
		@Pc(233) int local233 = local9 - Static71.anInt1394;
		@Pc(238) int local238 = local15 - Static39.anInt727;
		@Pc(243) int local243 = local24 - Static107.anInt2348;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local238 * local238 + local233 * local233));
		@Pc(265) int local265 = (int) (Math.atan2((double) local243, (double) local254) * 325.949D) & 0x7FF;
		if (local265 < 128) {
			local265 = 128;
		}
		@Pc(283) int local283 = (int) (Math.atan2((double) local238, (double) local233) * -325.949D) & 0x7FF;
		if (local265 > 383) {
			local265 = 383;
		}
		if (local265 > Static15.anInt335) {
			Static15.anInt335 += (local265 - Static15.anInt335) * Static211.anInt4652 / 1000 + Static81.anInt1738;
			if (Static15.anInt335 > local265) {
				Static15.anInt335 = local265;
			}
		}
		@Pc(314) int local314 = local283 - Static138.anInt3181;
		if (Static15.anInt335 > local265) {
			Static15.anInt335 -= (Static15.anInt335 - local265) * Static211.anInt4652 / 1000 + Static81.anInt1738;
			if (Static15.anInt335 < local265) {
				Static15.anInt335 = local265;
			}
		}
		if (local314 > 1024) {
			local314 -= 2048;
		}
		if (local314 < -1024) {
			local314 += 2048;
		}
		if (local314 > 0) {
			Static138.anInt3181 += local314 * Static211.anInt4652 / 1000 + Static81.anInt1738;
			Static138.anInt3181 &= 0x7FF;
		}
		if (local314 < 0) {
			Static138.anInt3181 -= Static81.anInt1738 + -local314 * Static211.anInt4652 / 1000;
			Static138.anInt3181 &= 0x7FF;
		}
		@Pc(387) int local387 = local283 - Static138.anInt3181;
		if (local387 > 1024) {
			local387 -= 2048;
		}
		if (local387 < -1024) {
			local387 += 2048;
		}
		if (local387 < 0 && local314 > 0 || local387 > 0 && local314 < 0) {
			Static138.anInt3181 = local283;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)V")
	public static void method1494() {
		Static144.anIntArrayArrayArray7 = Static11.anIntArrayArrayArray1;
		Static226.aClass2_Sub12ArrayArrayArray3 = Static198.aClass2_Sub12ArrayArrayArray2;
		Static78.anInt1716 = Static226.aClass2_Sub12ArrayArrayArray3.length;
	}
}
