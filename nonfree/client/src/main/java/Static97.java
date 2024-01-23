import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!jg;")
	public static Class4_Sub2_Sub11 aClass4_Sub2_Sub11_10;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!lg;")
	public static Class97 aClass97_20;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString152 = "Drop";

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	public static int anInt4590 = 0;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	public static int anInt4591 = 0;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[I")
	public static int[] anIntArray371 = new int[50];

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
	public static int[] anIntArray372 = new int[5];

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!ua;")
	public static Class165 aClass165_2 = new Class165();

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public static int anInt4593 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Z")
	public static boolean aBoolean288 = true;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	public static void method3590(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static21.aBooleanArray7[arg0]) {
			return;
		}
		Static279.aClass22_97.method669(arg0);
		if (Static217.aClass97ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(33) boolean local33 = true;
		for (@Pc(35) int local35 = 0; local35 < Static217.aClass97ArrayArray1[arg0].length; local35++) {
			if (Static217.aClass97ArrayArray1[arg0][local35] != null) {
				if (Static217.aClass97ArrayArray1[arg0][local35].anInt3177 == 2) {
					local33 = false;
				} else {
					Static217.aClass97ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local33) {
			Static217.aClass97ArrayArray1[arg0] = null;
		}
		Static21.aBooleanArray7[arg0] = false;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public static void method3591() {
		@Pc(10) int local10 = Static65.anInt5705 * 128 + 64;
		@Pc(20) int local20 = Static89.anInt1797 * 128 + 64;
		@Pc(28) int local28 = Static58.method2504(local10, local20, Static222.anInt4467) - Static199.anInt2996;
		if (Static158.anInt3240 >= 100) {
			Static71.anInt1457 = Static89.anInt1797 * 128 + 64;
			Static248.anInt4865 = Static65.anInt5705 * 128 + 64;
			Static153.anInt3111 = Static58.method2504(Static248.anInt4865, Static71.anInt1457, Static222.anInt4467) - Static199.anInt2996;
		} else {
			if (local20 > Static71.anInt1457) {
				Static71.anInt1457 += (local20 - Static71.anInt1457) * Static158.anInt3240 / 1000 + Static158.anInt3234;
				if (local20 < Static71.anInt1457) {
					Static71.anInt1457 = local20;
				}
			}
			if (local10 > Static248.anInt4865) {
				Static248.anInt4865 += Static158.anInt3234 + Static158.anInt3240 * (local10 - Static248.anInt4865) / 1000;
				if (local10 < Static248.anInt4865) {
					Static248.anInt4865 = local10;
				}
			}
			if (Static248.anInt4865 > local10) {
				Static248.anInt4865 -= Static158.anInt3234 + (Static248.anInt4865 - local10) * Static158.anInt3240 / 1000;
				if (Static248.anInt4865 < local10) {
					Static248.anInt4865 = local10;
				}
			}
			if (Static71.anInt1457 > local20) {
				Static71.anInt1457 -= (Static71.anInt1457 - local20) * Static158.anInt3240 / 1000 + Static158.anInt3234;
				if (local20 > Static71.anInt1457) {
					Static71.anInt1457 = local20;
				}
			}
			if (Static153.anInt3111 < local28) {
				Static153.anInt3111 += Static158.anInt3240 * (local28 - Static153.anInt3111) / 1000 + Static158.anInt3234;
				if (Static153.anInt3111 > local28) {
					Static153.anInt3111 = local28;
				}
			}
			if (Static153.anInt3111 > local28) {
				Static153.anInt3111 -= Static158.anInt3234 + Static158.anInt3240 * (Static153.anInt3111 - local28) / 1000;
				if (Static153.anInt3111 < local28) {
					Static153.anInt3111 = local28;
				}
			}
		}
		local10 = Static183.anInt3660 * 128 + 64;
		local20 = Static308.anInt5870 * 128 + 64;
		local28 = Static58.method2504(local10, local20, Static222.anInt4467) - Static12.anInt283;
		@Pc(251) int local251 = local28 - Static153.anInt3111;
		@Pc(256) int local256 = local20 - Static71.anInt1457;
		@Pc(261) int local261 = local10 - Static248.anInt4865;
		@Pc(273) int local273 = (int) Math.sqrt((double) (local256 * local256 + local261 * local261));
		@Pc(284) int local284 = (int) (Math.atan2((double) local251, (double) local273) * 325.949D) & 0x7FF;
		if (local284 < 128) {
			local284 = 128;
		}
		if (local284 > 383) {
			local284 = 383;
		}
		@Pc(306) int local306 = (int) (Math.atan2((double) local256, (double) local261) * -325.949D) & 0x7FF;
		if (Static254.anInt4974 < local284) {
			Static254.anInt4974 += Static288.anInt5628 * (local284 - Static254.anInt4974) / 1000 + Static237.anInt4705;
			if (Static254.anInt4974 > local284) {
				Static254.anInt4974 = local284;
			}
		}
		if (Static254.anInt4974 > local284) {
			Static254.anInt4974 -= Static237.anInt4705 + (Static254.anInt4974 - local284) * Static288.anInt5628 / 1000;
			if (local284 > Static254.anInt4974) {
				Static254.anInt4974 = local284;
			}
		}
		@Pc(366) int local366 = local306 - Static56.anInt1258;
		if (local366 > 1024) {
			local366 -= 2048;
		}
		if (local366 < -1024) {
			local366 += 2048;
		}
		if (local366 > 0) {
			Static56.anInt1258 += Static288.anInt5628 * local366 / 1000 + Static237.anInt4705;
			Static56.anInt1258 &= 0x7FF;
		}
		if (local366 < 0) {
			Static56.anInt1258 -= Static288.anInt5628 * -local366 / 1000 + Static237.anInt4705;
			Static56.anInt1258 &= 0x7FF;
		}
		@Pc(421) int local421 = local306 - Static56.anInt1258;
		if (local421 > 1024) {
			local421 -= 2048;
		}
		if (local421 < -1024) {
			local421 += 2048;
		}
		if (local421 < 0 && local366 > 0 || local421 > 0 && local366 < 0) {
			Static56.anInt1258 = local306;
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
	public static void method3595() {
		Static133.aClass172_22.method4349(5);
	}
}
