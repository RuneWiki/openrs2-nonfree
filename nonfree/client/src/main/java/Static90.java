import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
	public static int anInt2117;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 aClass4_Sub4_Sub5_Sub2_3;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!v;")
	private static Class76 aClass76_938 = Static134.method2017("shake:");

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_939 = aClass76_938;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_940 = Static134.method2017("Standort");

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!v;")
	private static Class76 aClass76_946 = Static134.method2017("green:");

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_941 = aClass76_946;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
	public static int[] anIntArray298 = new int[32];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!v;")
	private static Class76 aClass76_942 = Static134.method2017("To create a new account you need to");

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_943 = Static134.method2017("::fpsoff");

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_944 = aClass76_942;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_945 = aClass76_938;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "Lclient!v;")
	public static Class76 aClass76_947 = aClass76_946;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!v;")
	public static Class76 aClass76_948 = Static134.method2017("<col=40ff00>");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
	public static void method1479(@OriginalArg(0) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static76.anInt1935; local7++) {
			@Pc(15) Class4_Sub4_Sub3_Sub1_Sub1 local15 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[Static47.anIntArray153[local7]];
			@Pc(23) int local23 = (Static47.anIntArray153[local7] << 14) + 536870912;
			if (local15 != null && local15.method969() && local15.aClass4_Sub4_Sub10_1.aBoolean106 == arg0 && local15.aClass4_Sub4_Sub10_1.method1128()) {
				@Pc(46) int local46 = local15.anInt1393 >> 7;
				@Pc(51) int local51 = local15.anInt1416 >> 7;
				if (local46 >= 0 && local46 < 104 && local51 >= 0 && local51 < 104) {
					if (local15.anInt1382 == 1 && (local15.anInt1393 & 0x7F) == 64 && (local15.anInt1416 & 0x7F) == 64) {
						if (Static20.anInt445 == Static32.anIntArrayArray7[local46][local51]) {
							continue;
						}
						Static32.anIntArrayArray7[local46][local51] = Static20.anInt445;
					}
					if (!local15.aClass4_Sub4_Sub10_1.aBoolean105) {
						local23 += Integer.MIN_VALUE;
					}
					Static54.aClass81_10.method1975(Static124.anInt2712, local15.anInt1393, local15.anInt1416, Static67.method1133(Static124.anInt2712, local15.anInt1393 + (local15.anInt1382 - 1) * 64, (local15.anInt1382 + -1) * 64 + local15.anInt1416), (local15.anInt1382 - 1) * 64 + 60, local15, local15.anInt1395, local23, local15.aBoolean81);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method1480() {
		@Pc(5) int local5 = Static77.anInt1961 * 128 + 64;
		@Pc(15) int local15 = Static95.anInt2208 * 128 + 64;
		@Pc(23) int local23 = Static67.method1133(Static124.anInt2712, local5, local15) - Static107.anInt2360;
		if (Static120.anInt2582 < local15) {
			Static120.anInt2582 += (local15 - Static120.anInt2582) * Static3.anInt2205 / 1000 + Static102.anInt2315;
			if (Static120.anInt2582 > local15) {
				Static120.anInt2582 = local15;
			}
		}
		if (Static106.anInt2354 < local5) {
			Static106.anInt2354 += Static102.anInt2315 + Static3.anInt2205 * (local5 - Static106.anInt2354) / 1000;
			if (local5 < Static106.anInt2354) {
				Static106.anInt2354 = local5;
			}
		}
		if (local15 < Static120.anInt2582) {
			Static120.anInt2582 -= Static102.anInt2315 + Static3.anInt2205 * (Static120.anInt2582 - local15) / 1000;
			if (Static120.anInt2582 < local15) {
				Static120.anInt2582 = local15;
			}
		}
		if (local23 > Static96.anInt2222) {
			Static96.anInt2222 += Static102.anInt2315 + Static3.anInt2205 * (local23 - Static96.anInt2222) / 1000;
			if (Static96.anInt2222 > local23) {
				Static96.anInt2222 = local23;
			}
		}
		if (local23 < Static96.anInt2222) {
			Static96.anInt2222 -= (Static96.anInt2222 - local23) * Static3.anInt2205 / 1000 + Static102.anInt2315;
			if (Static96.anInt2222 < local23) {
				Static96.anInt2222 = local23;
			}
		}
		if (local5 < Static106.anInt2354) {
			Static106.anInt2354 -= (Static106.anInt2354 - local5) * Static3.anInt2205 / 1000 + Static102.anInt2315;
			if (Static106.anInt2354 < local5) {
				Static106.anInt2354 = local5;
			}
		}
		local5 = Static124.anInt2723 * 128 + 64;
		local15 = Static117.anInt2539 * 128 + 64;
		local23 = Static67.method1133(Static124.anInt2712, local5, local15) - Static100.anInt2292;
		@Pc(200) int local200 = local15 - Static120.anInt2582;
		@Pc(204) int local204 = local23 - Static96.anInt2222;
		@Pc(209) int local209 = local5 - Static106.anInt2354;
		@Pc(220) int local220 = (int) Math.sqrt((double) (local200 * local200 + local209 * local209));
		@Pc(231) int local231 = (int) (Math.atan2((double) local204, (double) local220) * 325.949D) & 0x7FF;
		if (local231 < 128) {
			local231 = 128;
		}
		@Pc(247) int local247 = (int) (-325.949D * Math.atan2((double) local209, (double) local200)) & 0x7FF;
		if (local231 > 383) {
			local231 = 383;
		}
		if (Static74.anInt1911 < local231) {
			Static74.anInt1911 += (local231 - Static74.anInt1911) * Static124.anInt2720 / 1000 + Static103.anInt2318;
			if (Static74.anInt1911 > local231) {
				Static74.anInt1911 = local231;
			}
		}
		@Pc(278) int local278 = local247 - Static103.anInt2317;
		if (local278 > 1024) {
			local278 -= 2048;
		}
		if (local278 < -1024) {
			local278 += 2048;
		}
		if (local278 > 0) {
			Static103.anInt2317 += Static124.anInt2720 * local278 / 1000 + Static103.anInt2318;
			Static103.anInt2317 &= 0x7FF;
		}
		if (Static74.anInt1911 > local231) {
			Static74.anInt1911 -= Static103.anInt2318 + (Static74.anInt1911 - local231) * Static124.anInt2720 / 1000;
			if (local231 > Static74.anInt1911) {
				Static74.anInt1911 = local231;
			}
		}
		if (local278 < 0) {
			Static103.anInt2317 -= Static124.anInt2720 * -local278 / 1000 + Static103.anInt2318;
			Static103.anInt2317 &= 0x7FF;
		}
		@Pc(360) int local360 = local247 - Static103.anInt2317;
		if (local360 > 1024) {
			local360 -= 2048;
		}
		if (local360 < -1024) {
			local360 += 2048;
		}
		if (local360 < 0 && local278 > 0 || local360 > 0 && local278 < 0) {
			Static103.anInt2317 = local247;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method1481() {
		aClass76_948 = null;
		aClass76_947 = null;
		aClass76_944 = null;
		aClass76_943 = null;
		aClass76_945 = null;
		aClass76_946 = null;
		aClass76_939 = null;
		aClass76_941 = null;
		aClass76_938 = null;
		aClass76_942 = null;
		aClass4_Sub4_Sub5_Sub2_3 = null;
		aClass76_940 = null;
		anIntArray298 = null;
	}
}
