import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	public static int anInt1086;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[S")
	public static short[] aShortArray13 = new short[256];

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "[Lclient!sj;")
	public static final Class225[] aClass225Array2 = new Class225[4];

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public static void method963() {
		@Pc(9) int local9 = Static412.anInt7076 * 128 + 64;
		@Pc(15) int local15 = Static281.anInt4446 * 128 + 64;
		@Pc(24) int local24 = Static365.method3535(Static204.anInt3498, local9, local15) - Static361.anInt6407;
		if (Static397.anInt6873 >= 100) {
			Static263.anInt4619 = Static412.anInt7076 * 128 + 64;
			Static120.anInt2052 = Static281.anInt4446 * 128 + 64;
			Static260.anInt4601 = Static365.method3535(Static204.anInt3498, Static263.anInt4619, Static120.anInt2052) - Static361.anInt6407;
		} else {
			if (Static263.anInt4619 < local9) {
				Static263.anInt4619 += Static230.anInt3824 + Static397.anInt6873 * (local9 - Static263.anInt4619) / 1000;
				if (Static263.anInt4619 > local9) {
					Static263.anInt4619 = local9;
				}
			}
			if (Static263.anInt4619 > local9) {
				Static263.anInt4619 -= Static230.anInt3824 + (Static263.anInt4619 - local9) * Static397.anInt6873 / 1000;
				if (Static263.anInt4619 < local9) {
					Static263.anInt4619 = local9;
				}
			}
			if (local24 > Static260.anInt4601) {
				Static260.anInt4601 += Static230.anInt3824 + (local24 - Static260.anInt4601) * Static397.anInt6873 / 1000;
				if (local24 < Static260.anInt4601) {
					Static260.anInt4601 = local24;
				}
			}
			if (local15 > Static120.anInt2052) {
				Static120.anInt2052 += (local15 - Static120.anInt2052) * Static397.anInt6873 / 1000 + Static230.anInt3824;
				if (Static120.anInt2052 > local15) {
					Static120.anInt2052 = local15;
				}
			}
			if (local24 < Static260.anInt4601) {
				Static260.anInt4601 -= Static230.anInt3824 + (Static260.anInt4601 - local24) * Static397.anInt6873 / 1000;
				if (local24 > Static260.anInt4601) {
					Static260.anInt4601 = local24;
				}
			}
			if (Static120.anInt2052 > local15) {
				Static120.anInt2052 -= Static230.anInt3824 + (Static120.anInt2052 - local15) * Static397.anInt6873 / 1000;
				if (Static120.anInt2052 < local15) {
					Static120.anInt2052 = local15;
				}
			}
		}
		local15 = Static258.anInt4504 * 128 + 64;
		local9 = Static101.anInt1574 * 128 + 64;
		local24 = Static365.method3535(Static204.anInt3498, local9, local15) - Static129.anInt2190;
		@Pc(226) int local226 = local9 - Static263.anInt4619;
		@Pc(231) int local231 = local24 - Static260.anInt4601;
		@Pc(236) int local236 = local15 - Static120.anInt2052;
		@Pc(247) int local247 = (int) Math.sqrt((double) (local236 * local236 + local226 * local226));
		@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 2607.5945876176133D) & 0x3FFF;
		@Pc(269) int local269 = (int) (Math.atan2((double) local226, (double) local236) * -2607.5945876176133D) & 0x3FFF;
		if (local258 < 1024) {
			local258 = 1024;
		}
		if (local258 > 3072) {
			local258 = 3072;
		}
		if (Static213.anInt3662 < local258) {
			Static213.anInt3662 += Static385.anInt6689 + (local258 - Static213.anInt3662 >> 3) * Static419.anInt7190 / 1000 << 3;
			if (Static213.anInt3662 > local258) {
				Static213.anInt3662 = local258;
			}
		}
		if (local258 < Static213.anInt3662) {
			Static213.anInt3662 -= Static385.anInt6689 + Static419.anInt7190 * (Static213.anInt3662 - local258 >> 3) / 1000 << 3;
			if (local258 > Static213.anInt3662) {
				Static213.anInt3662 = local258;
			}
		}
		@Pc(343) int local343 = local269 - Static144.anInt2665;
		if (local343 > 8192) {
			local343 -= 16384;
		}
		if (local343 < -8192) {
			local343 += 16384;
		}
		local343 >>= 0x3;
		if (local343 > 0) {
			Static144.anInt2665 += Static385.anInt6689 + Static419.anInt7190 * local343 / 1000 << 3;
			Static144.anInt2665 &= 0x3FFF;
		}
		if (local343 < 0) {
			Static144.anInt2665 -= Static385.anInt6689 + Static419.anInt7190 * -local343 / 1000 << 3;
			Static144.anInt2665 &= 0x3FFF;
		}
		@Pc(400) int local400 = local269 - Static144.anInt2665;
		if (local400 > 8192) {
			local400 -= 16384;
		}
		if (local400 < -8192) {
			local400 += 16384;
		}
		if (local400 < 0 && local343 > 0 || local400 > 0 && local343 < 0) {
			Static144.anInt2665 = local269;
		}
		Static68.anInt1160 = 0;
	}
}
