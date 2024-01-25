import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static int anInt1540 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static void method1264(@OriginalArg(1) int arg0) {
		Static382.anInt6349 = arg0;
		Static350.aClass167_83.method3390();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method1265() {
		for (@Pc(7) int local7 = 0; local7 < Static353.anInt5858; local7++) {
			@Pc(13) Class98 local13 = Static104.aClass98Array2[local7];
			@Pc(15) boolean local15 = false;
			@Pc(135) int local135;
			if (local13.aClass1_Sub9_Sub1_1 == null) {
				local13.anInt2410--;
				if ((local13.aByte28 == 2 ? -1500 : -10) <= local13.anInt2410) {
					if (local13.aByte28 == 1 && local13.aClass39_1 == null) {
						local13.aClass39_1 = Static456.method736(Static12.aClass113_7, local13.anInt2404, 0);
						if (local13.aClass39_1 == null) {
							continue;
						}
						local13.anInt2410 += local13.aClass39_1.method737();
					} else if (local13.aByte28 == 2 && (local13.aClass1_Sub16_1 == null || local13.aClass1_Sub28_Sub1_1 == null)) {
						if (local13.aClass1_Sub16_1 == null) {
							local13.aClass1_Sub16_1 = Static134.method1811(Static224.aClass113_73, local13.anInt2404);
						}
						if (local13.aClass1_Sub16_1 == null) {
							continue;
						}
						if (local13.aClass1_Sub28_Sub1_1 == null) {
							local13.aClass1_Sub28_Sub1_1 = local13.aClass1_Sub16_1.method1808(new int[] { 22050 });
							if (local13.aClass1_Sub28_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local13.anInt2410 < 0) {
						if (local13.anInt2402 == 0) {
							local135 = Static336.aClass106_Sub1_1.anInt5696 * local13.anInt2403 >> 8;
						} else {
							@Pc(144) int local144 = local13.anInt2402 >> 24 & 0x3;
							if (Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 == local144) {
								@Pc(155) int local155 = (local13.anInt2402 & 0xFF) << 7;
								@Pc(162) int local162 = local13.anInt2402 >> 16 & 0xFF;
								@Pc(171) int local171 = (local162 << 7) - (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 - 64);
								if (local171 < 0) {
									local171 = -local171;
								}
								@Pc(183) int local183 = local13.anInt2402 >> 8 & 0xFF;
								@Pc(193) int local193 = (local183 << 7) + 64 - Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616;
								if (local193 < 0) {
									local193 = -local193;
								}
								@Pc(208) int local208 = local171 + local193 - 128;
								if (local155 < local208) {
									local13.anInt2410 = -99999;
									continue;
								}
								if (local208 < 0) {
									local208 = 0;
								}
								local135 = (local155 - local208) * Static336.aClass106_Sub1_1.anInt5682 * local13.anInt2403 / local155 >> 8;
							} else {
								local135 = 0;
							}
						}
						if (local135 > 0) {
							@Pc(249) Class1_Sub28_Sub1 local249 = null;
							if (local13.aByte28 == 1) {
								local249 = local13.aClass39_1.method738().method3469(Static80.aClass233_1);
							} else if (local13.aByte28 == 2) {
								local249 = local13.aClass1_Sub28_Sub1_1;
							}
							@Pc(279) Class1_Sub9_Sub1 local279 = local13.aClass1_Sub9_Sub1_1 = Static457.method942(local249, local135);
							local279.method934(local13.anInt2405 - 1);
							Static155.aClass1_Sub9_Sub2_1.method1036(local279);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass1_Sub9_Sub1_1.method5618()) {
				local15 = true;
			}
			if (local15) {
				Static353.anInt5858--;
				for (local135 = local7; local135 < Static353.anInt5858; local135++) {
					Static104.aClass98Array2[local135] = Static104.aClass98Array2[local135 + 1];
				}
				local7--;
			}
		}
		if (Static17.aBoolean28 && !Static169.method2132()) {
			if (Static336.aClass106_Sub1_1.anInt5694 != 0 && Static170.anInt2817 != -1) {
				Static299.method3903(Static116.aClass113_101, Static336.aClass106_Sub1_1.anInt5694, Static170.anInt2817);
			}
			Static17.aBoolean28 = false;
		} else if (Static336.aClass106_Sub1_1.anInt5694 != 0 && Static170.anInt2817 != -1 && !Static169.method2132()) {
			Static5.method94(Static117.aClass137_91);
			Static75.aClass1_Sub11_Sub1_1.method4450(Static170.anInt2817);
			Static170.anInt2817 = -1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method1266(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
