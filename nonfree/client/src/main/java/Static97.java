import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	public static int anInt2520;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!tj;")
	public static Class193 aClass193_34;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	public static int anInt2524;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "Lclient!tj;")
	public static Class193 aClass193_35;

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "Lclient!tj;")
	public static Class193 aClass193_36;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V")
	public static void method2225(@OriginalArg(1) int arg0) {
		Static243.anInt5991 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public static void method2226() {
		@Pc(9) int local9 = Static237.anInt6655 * 128 + 64;
		@Pc(15) int local15 = Static74.anInt1924 * 128 + 64;
		@Pc(23) int local23 = Static81.method2010(Static12.anInt267, local15, local9) - Static324.anInt6210;
		if (Static12.anInt271 >= 100) {
			Static240.anInt4829 = Static237.anInt6655 * 128 + 64;
			Static129.anInt3039 = Static74.anInt1924 * 128 + 64;
			Static112.anInt2705 = Static81.method2010(Static12.anInt267, Static129.anInt3039, Static240.anInt4829) - Static324.anInt6210;
		} else {
			if (Static240.anInt4829 < local9) {
				Static240.anInt4829 += Static161.anInt3461 + Static12.anInt271 * (local9 - Static240.anInt4829) / 1000;
				if (local9 < Static240.anInt4829) {
					Static240.anInt4829 = local9;
				}
			}
			if (Static112.anInt2705 < local23) {
				Static112.anInt2705 += Static161.anInt3461 + Static12.anInt271 * (local23 - Static112.anInt2705) / 1000;
				if (Static112.anInt2705 > local23) {
					Static112.anInt2705 = local23;
				}
			}
			if (local9 < Static240.anInt4829) {
				Static240.anInt4829 -= Static161.anInt3461 + (Static240.anInt4829 - local9) * Static12.anInt271 / 1000;
				if (local9 > Static240.anInt4829) {
					Static240.anInt4829 = local9;
				}
			}
			if (local23 < Static112.anInt2705) {
				Static112.anInt2705 -= Static12.anInt271 * (Static112.anInt2705 - local23) / 1000 + Static161.anInt3461;
				if (local23 > Static112.anInt2705) {
					Static112.anInt2705 = local23;
				}
			}
			if (Static129.anInt3039 < local15) {
				Static129.anInt3039 += Static161.anInt3461 + (local15 - Static129.anInt3039) * Static12.anInt271 / 1000;
				if (local15 < Static129.anInt3039) {
					Static129.anInt3039 = local15;
				}
			}
			if (Static129.anInt3039 > local15) {
				Static129.anInt3039 -= Static161.anInt3461 + (Static129.anInt3039 - local15) * Static12.anInt271 / 1000;
				if (Static129.anInt3039 < local15) {
					Static129.anInt3039 = local15;
				}
			}
		}
		local15 = Static124.anInt2958 * 128 + 64;
		local9 = Static63.anInt1629 * 128 + 64;
		local23 = Static81.method2010(Static12.anInt267, local15, local9) - Static149.anInt3929;
		@Pc(224) int local224 = local9 - Static240.anInt4829;
		@Pc(229) int local229 = local23 - Static112.anInt2705;
		@Pc(234) int local234 = local15 - Static129.anInt3039;
		@Pc(245) int local245 = (int) Math.sqrt((double) (local234 * local234 + local224 * local224));
		@Pc(256) int local256 = (int) (Math.atan2((double) local229, (double) local245) * 2607.5945876176133D) & 0x3FFF;
		if (local256 < 1024) {
			local256 = 1024;
		}
		@Pc(272) int local272 = (int) (Math.atan2((double) local224, (double) local234) * -2607.5945876176133D) & 0x3FFF;
		if (local256 > 3072) {
			local256 = 3072;
		}
		if (Static337.anInt6445 < local256) {
			Static337.anInt6445 += (local256 - Static337.anInt6445 >> 3) * Static30.anInt779 / 1000 + Static23.anInt459 << 3;
			if (local256 < Static337.anInt6445) {
				Static337.anInt6445 = local256;
			}
		}
		if (local256 < Static337.anInt6445) {
			Static337.anInt6445 -= Static23.anInt459 + Static30.anInt779 * (Static337.anInt6445 - local256 >> 3) / 1000 << 3;
			if (Static337.anInt6445 < local256) {
				Static337.anInt6445 = local256;
			}
		}
		@Pc(341) int local341 = local272 - Static217.anInt4437;
		if (local341 > 8192) {
			local341 -= 16384;
		}
		if (local341 < -8192) {
			local341 += 16384;
		}
		local341 >>= 0x3;
		if (local341 > 0) {
			Static217.anInt4437 += Static23.anInt459 + local341 * Static30.anInt779 / 1000 << 3;
			Static217.anInt4437 &= 0x3FFF;
		}
		if (local341 < 0) {
			Static217.anInt4437 -= Static23.anInt459 + -local341 * Static30.anInt779 / 1000 << 3;
			Static217.anInt4437 &= 0x3FFF;
		}
		@Pc(399) int local399 = local272 - Static217.anInt4437;
		if (local399 > 8192) {
			local399 -= 16384;
		}
		if (local399 < -8192) {
			local399 += 16384;
		}
		if (local399 < 0 && local341 > 0 || local399 > 0 && local341 < 0) {
			Static217.anInt4437 = local272;
		}
		Static80.anInt2124 = 0;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
	public static void method2228() {
		if (Static161.anInt3459 <= 0) {
			Static72.aString15 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static278.aStringArray85.length; local14++) {
			if (Static278.aStringArray85[local14].startsWith("--> ")) {
				local12++;
				if (local12 == Static161.anInt3459) {
					Static72.aString15 = Static278.aStringArray85[local14].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
	public static void method2231(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class4_Sub29 local10 = (Class4_Sub29) Static292.aClass116_43.method3270(); local10 != null; local10 = (Class4_Sub29) Static292.aClass116_43.method3272()) {
			if (local10.aClass4_Sub1_Sub1_1 != null) {
				Static196.aClass4_Sub1_Sub3_3.method3510(local10.aClass4_Sub1_Sub1_1);
				local10.aClass4_Sub1_Sub1_1 = null;
			}
			if (local10.aClass4_Sub1_Sub1_2 != null) {
				Static196.aClass4_Sub1_Sub3_3.method3510(local10.aClass4_Sub1_Sub1_2);
				local10.aClass4_Sub1_Sub1_2 = null;
			}
			local10.method5687();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class4_Sub29 local54 = (Class4_Sub29) Static114.aClass116_14.method3270(); local54 != null; local54 = (Class4_Sub29) Static114.aClass116_14.method3272()) {
			if (local54.aClass4_Sub1_Sub1_1 != null) {
				Static196.aClass4_Sub1_Sub3_3.method3510(local54.aClass4_Sub1_Sub1_1);
				local54.aClass4_Sub1_Sub1_1 = null;
			}
			local54.method5687();
		}
		for (@Pc(81) Class4_Sub29 local81 = (Class4_Sub29) Static74.aClass43_11.method1283(); local81 != null; local81 = (Class4_Sub29) Static74.aClass43_11.method1278()) {
			if (local81.aClass4_Sub1_Sub1_1 != null) {
				Static196.aClass4_Sub1_Sub3_3.method3510(local81.aClass4_Sub1_Sub1_1);
				local81.aClass4_Sub1_Sub1_1 = null;
			}
			local81.method5687();
		}
	}
}
