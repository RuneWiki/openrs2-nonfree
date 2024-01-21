import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!nb;")
	public static Class24 aClass24_20;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
	public static int[] anIntArray257;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt2334;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!oa;")
	public static Class7 aClass7_69;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!rb;")
	public static Class57 aClass57_14 = new Class57(4096);

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1150 = Static38.method736("@gr3@");

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1151 = Static38.method736("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	public static int anInt2340 = -1;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	public static final int anInt2341 = 0;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1152 = Static38.method736("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!s", name = "x", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1153 = Static38.method736("scape main");

	@OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1154 = aClass71_1152;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1613() {
		aClass71_1150 = null;
		aClass71_1153 = null;
		aClass71_1152 = null;
		aClass24_20 = null;
		anIntArray257 = null;
		aClass71_1154 = null;
		aClass7_69 = null;
		aClass71_1151 = null;
		aClass57_14 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BILclient!vd;I)V")
	public static void method1614(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub10_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 * arg0 + arg2 * arg2;
		if (local12 <= 4225 || local12 >= 90000) {
			Static118.method1936(arg1, arg0, arg2);
			return;
		}
		@Pc(37) int local37 = Static88.anInt2060 + Static101.anInt2378 & 0x7FF;
		@Pc(41) int local41 = Class5_Sub1_Sub10_Sub2.anIntArray240[local37];
		@Pc(49) int local49 = local41 * 256 / (Static66.anInt1651 + 256);
		@Pc(53) int local53 = Class5_Sub1_Sub10_Sub2.anIntArray241[local37];
		@Pc(61) int local61 = local53 * 256 / (Static66.anInt1651 + 256);
		@Pc(71) int local71 = arg2 * local49 + local61 * arg0 >> 16;
		@Pc(82) int local82 = arg0 * local49 - arg2 * local61 >> 16;
		@Pc(88) double local88 = Math.atan2((double) local71, (double) local82);
		@Pc(94) int local94 = (int) (Math.sin(local88) * 63.0D);
		@Pc(100) int local100 = (int) (Math.cos(local88) * 57.0D);
		Static85.aClass5_Sub1_Sub10_Sub3_39.method1853(local94 + 88, -local100 + 83 + -20, local88);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!tc;III)V")
	public static void method1615(@OriginalArg(0) Class5_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		if ((arg2 & 0x8) != 0) {
			local9 = Static86.aClass5_Sub11_Sub1_12.method1529();
			local13 = Static86.aClass5_Sub11_Sub1_12.method1533();
			@Pc(17) int local17 = Static86.aClass5_Sub11_Sub1_12.method1502();
			@Pc(20) int local20 = Static86.aClass5_Sub11_Sub1_12.anInt2233;
			if (arg0.aClass71_1236 != null && arg0.aClass32_2 != null) {
				@Pc(31) long local31 = arg0.aClass71_1236.method1817();
				@Pc(33) boolean local33 = false;
				if (local13 <= 1) {
					for (@Pc(40) int local40 = 0; local40 < Static33.anInt935; local40++) {
						if (Static78.aLongArray4[local40] == local31) {
							local33 = true;
							break;
						}
					}
				}
				if (!local33 && Static65.anInt1637 == 0) {
					Static5.aClass5_Sub11_1.anInt2233 = 0;
					Static86.aClass5_Sub11_Sub1_12.method1515(Static5.aClass5_Sub11_1.aByteArray23, local17);
					Static5.aClass5_Sub11_1.anInt2233 = 0;
					@Pc(79) Class71 local79 = Static66.method1130(Static5.aClass5_Sub11_1).method1797();
					arg0.aClass71_1229 = local79.method1821();
					arg0.anInt2491 = local9 & 0xFF;
					arg0.anInt2462 = 150;
					arg0.anInt2455 = local9 >> 8;
					if (local13 == 2 || local13 == 3) {
						Static92.method1500(1, local79, Static74.method677(new Class71[] { Static71.aClass71_861, arg0.aClass71_1236 }));
					} else if (local13 == 1) {
						Static92.method1500(1, local79, Static74.method677(new Class71[] { Static49.aClass71_712, arg0.aClass71_1236 }));
					} else {
						Static92.method1500(2, local79, arg0.aClass71_1236);
					}
				}
			}
			Static86.aClass5_Sub11_Sub1_12.anInt2233 = local17 + local20;
		}
		if ((arg2 & 0x10) != 0) {
			local9 = Static86.aClass5_Sub11_Sub1_12.method1533();
			@Pc(171) byte[] local171 = new byte[local9];
			@Pc(176) Class5_Sub11 local176 = new Class5_Sub11(local171);
			Static86.aClass5_Sub11_Sub1_12.method1515(local171, local9);
			Static66.aClass5_Sub11Array1[arg1] = local176;
			arg0.method1691(local176);
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt2437 = Static86.aClass5_Sub11_Sub1_12.method1516();
			arg0.anInt2472 = Static86.aClass5_Sub11_Sub1_12.method1546();
			arg0.anInt2444 = Static86.aClass5_Sub11_Sub1_12.method1533();
			arg0.anInt2483 = Static86.aClass5_Sub11_Sub1_12.method1533();
			arg0.anInt2447 = Static86.aClass5_Sub11_Sub1_12.method1539() + Static95.anInt2285;
			arg0.anInt2460 = Static86.aClass5_Sub11_Sub1_12.method1539() + Static95.anInt2285;
			arg0.anInt2442 = Static86.aClass5_Sub11_Sub1_12.method1516();
			arg0.method1677();
		}
		if ((arg2 & 0x100) != 0) {
			local9 = Static86.aClass5_Sub11_Sub1_12.method1516();
			local13 = Static86.aClass5_Sub11_Sub1_12.method1502();
			arg0.method1682(local13, local9, Static95.anInt2285);
			arg0.anInt2445 = Static95.anInt2285 + 300;
			arg0.anInt2473 = Static86.aClass5_Sub11_Sub1_12.method1502();
			arg0.anInt2468 = Static86.aClass5_Sub11_Sub1_12.method1516();
		}
		if ((arg2 & 0x2) != 0) {
			arg0.anInt2480 = Static86.aClass5_Sub11_Sub1_12.method1549();
			arg0.anInt2465 = Static86.aClass5_Sub11_Sub1_12.method1549();
		}
		if ((arg2 & 0x40) != 0) {
			local9 = Static86.aClass5_Sub11_Sub1_12.method1516();
			local13 = Static86.aClass5_Sub11_Sub1_12.method1502();
			arg0.method1682(local13, local9, Static95.anInt2285);
			arg0.anInt2445 = Static95.anInt2285 + 300;
			arg0.anInt2473 = Static86.aClass5_Sub11_Sub1_12.method1516();
			arg0.anInt2468 = Static86.aClass5_Sub11_Sub1_12.method1502();
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt2436 = Static86.aClass5_Sub11_Sub1_12.method1539();
			if (arg0.anInt2436 == 65535) {
				arg0.anInt2436 = -1;
			}
		}
		if ((arg2 & 0x80) != 0) {
			arg0.aClass71_1229 = Static86.aClass5_Sub11_Sub1_12.method1541();
			if (arg0.aClass71_1229.method1804(0) == 126) {
				arg0.aClass71_1229 = arg0.aClass71_1229.method1822(1);
				Static92.method1500(2, arg0.aClass71_1229, arg0.aClass71_1236);
			} else if (arg0 == Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1) {
				Static92.method1500(2, arg0.aClass71_1229, arg0.aClass71_1236);
			}
			arg0.anInt2462 = 150;
			arg0.anInt2491 = 0;
			arg0.anInt2455 = 0;
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt2459 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local9 = Static86.aClass5_Sub11_Sub1_12.method1540();
			if (arg0.anInt2459 == 65535) {
				arg0.anInt2459 = -1;
			}
			arg0.anInt2433 = 0;
			arg0.anInt2464 = 0;
			arg0.anInt2432 = local9 >> 16;
			arg0.anInt2476 = Static95.anInt2285 + (local9 & 0xFFFF);
			if (Static95.anInt2285 < arg0.anInt2476) {
				arg0.anInt2464 = -1;
			}
		}
		if ((arg2 & 0x4) == 0) {
			return;
		}
		local9 = Static86.aClass5_Sub11_Sub1_12.method1543();
		if (local9 == 65535) {
			local9 = -1;
		}
		local13 = Static86.aClass5_Sub11_Sub1_12.method1502();
		Static78.method696(local9, local13, arg0);
	}
}
