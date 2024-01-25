import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[128][128];

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "[Lclient!kw;")
	public static final Class8_Sub31[] aClass8_Sub31Array1 = new Class8_Sub31[300];

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIBI)I")
	public static int method2092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static489.anInt8687 < 100) {
			return -2;
		}
		@Pc(19) int local19 = -2;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg2 - Static110.anInt7708;
		@Pc(31) int local31 = arg1 - Static110.anInt7703;
		for (@Pc(36) Class8_Sub35 local36 = (Class8_Sub35) Static110.aClass43_49.method1422(); local36 != null; local36 = (Class8_Sub35) Static110.aClass43_49.method1426()) {
			if (arg0 == local36.anInt6533) {
				@Pc(49) int local49 = local36.anInt6532;
				@Pc(52) int local52 = local36.anInt6536;
				@Pc(62) int local62 = local52 + Static110.anInt7703 | Static110.anInt7708 + local49 << 14;
				@Pc(81) int local81 = (local26 - local49) * (-local49 + local26) + (local31 - local52) * (local31 + -local52);
				if (local19 < 0 || local21 > local81) {
					local21 = local81;
					local19 = local62;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)I")
	public static int method2096() {
		if (Static10.aClass331_3 == null) {
			if (!Static211.aBoolean370 && Static193.aClass8_Sub5_Sub7_1 != null) {
				return Static193.aClass8_Sub5_Sub7_1.anInt3778;
			}
			@Pc(20) int local20 = Static288.aClass35_6.method5764();
			@Pc(24) int local24 = Static288.aClass35_6.method5761();
			@Pc(44) int local44;
			@Pc(46) int local46;
			@Pc(62) int local62;
			@Pc(133) Class8_Sub5_Sub7 local133;
			if (Static577.aBoolean710) {
				@Pc(263) Class62 local263;
				if (Static465.anInt8462 < local20 && local20 < Static465.anInt8462 + Static306.anInt6216) {
					local44 = -1;
					for (local46 = 0; local46 < Static156.anInt3931; local46++) {
						if (Static238.aBoolean398) {
							local62 = Static122.anInt3308 + local46 * 16 + 33;
							if (local24 > local62 - 13 && local62 + 3 >= local24) {
								local44 = local46;
							}
						} else {
							local62 = local46 * 16 + Static122.anInt3308 + 31;
							if (local24 > local62 - 13 && local24 <= local62 + 3) {
								local44 = local46;
							}
						}
					}
					if (local44 != -1) {
						local62 = 0;
						local263 = new Class62(Static414.aClass302_11);
						for (@Pc(369) Class8_Sub5_Sub6 local369 = (Class8_Sub5_Sub6) local263.method2109(); local369 != null; local369 = (Class8_Sub5_Sub6) local263.method2112()) {
							if (local62++ == local44) {
								if (local369.anInt3391 == 1) {
									return ((Class8_Sub5_Sub7) local369.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66).anInt3778;
								}
								return -1;
							}
						}
					}
				} else if (Static479.aClass8_Sub5_Sub6_1 != null && Static264.anInt5648 < local20 && local20 < Static358.anInt6868 + Static264.anInt5648) {
					local44 = -1;
					for (local46 = 0; local46 < Static479.aClass8_Sub5_Sub6_1.anInt3391; local46++) {
						if (Static238.aBoolean398) {
							local62 = Static528.anInt9126 + local46 * 16 + 33;
							if (local24 > local62 - 13 && local24 <= local62 + 3) {
								local44 = local46;
							}
						} else {
							local62 = Static528.anInt9126 + local46 * 16 + 31;
							if (local62 - 13 < local24 && local24 <= local62 + 3) {
								local44 = local46;
							}
						}
					}
					if (local44 != -1) {
						local62 = 0;
						local263 = new Class62(Static479.aClass8_Sub5_Sub6_1.aClass302_2);
						for (local133 = (Class8_Sub5_Sub7) local263.method2109(); local133 != null; local133 = (Class8_Sub5_Sub7) local263.method2112()) {
							if (local62++ == local44) {
								return local133.anInt3778;
							}
						}
					}
				}
			} else if (Static465.anInt8462 < local20 && local20 < Static306.anInt6216 + Static465.anInt8462) {
				local44 = -1;
				for (local46 = 0; local46 < Static548.anInt9471; local46++) {
					if (Static238.aBoolean398) {
						local62 = (Static548.anInt9471 - local46 - 1) * 16 + Static122.anInt3308 + 33;
						if (local62 - 13 < local24 && local24 <= local62 + 3) {
							local44 = local46;
						}
					} else {
						local62 = Static122.anInt3308 + (Static548.anInt9471 - local46 + -1) * 16 + 31;
						if (local24 > local62 - 13 && local62 + 3 >= local24) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local62 = 0;
					@Pc(128) Class307 local128 = new Class307(Static72.aClass43_17);
					for (local133 = (Class8_Sub5_Sub7) local128.method7373(); local133 != null; local133 = (Class8_Sub5_Sub7) local128.method7375()) {
						if (local44 == local62++) {
							return local133.anInt3778;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)V")
	public static void method2098(@OriginalArg(1) int arg0) {
		if (Static334.anInt6594 == arg0) {
			return;
		}
		Static372.anInt7082 = Static218.anInt5023 = Static181.anIntArray235[arg0];
		Static45.method1364();
		Static194.anIntArrayArray25 = new int[Static372.anInt7082][Static218.anInt5023];
		Static346.anIntArrayArrayArray10 = new int[4][Static372.anInt7082 >> 3][Static218.anInt5023 >> 3];
		Static391.anIntArrayArray41 = new int[Static372.anInt7082][Static218.anInt5023];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static204.aClass48Array1[local40] = Static513.method7387(Static218.anInt5023, Static372.anInt7082);
		}
		Static28.aByteArrayArrayArray7 = new byte[4][Static372.anInt7082][Static218.anInt5023];
		Static259.method4572(Static372.anInt7082, Static218.anInt5023);
		Static252.method4536(Static372.anInt7082 >> 3, Static218.anInt5023 >> 3, Static171.aClass16_5);
		Static334.anInt6594 = arg0;
	}
}
