import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ih", name = "Cb", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_13;

	@OriginalMember(owner = "client!ih", name = "Fb", descriptor = "I")
	public static int anInt1778;

	@OriginalMember(owner = "client!ih", name = "Db", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_917 = Static193.method3027("Neuer Benutzer");

	@OriginalMember(owner = "client!ih", name = "Sb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_920 = Static193.method3027("Take");

	@OriginalMember(owner = "client!ih", name = "Eb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_918 = aClass70_920;

	@OriginalMember(owner = "client!ih", name = "Kb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_919 = Static193.method3027("loc)3dat");

	@OriginalMember(owner = "client!ih", name = "Rb", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(B)V")
	public static void method1300() {
		Static54.aClass85_10.method2557();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V")
	public static void method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static52.anInt1117 || arg0 < Static26.anInt554) {
			return;
		}
		@Pc(35) boolean local35;
		if (Static119.anInt2428 > arg3) {
			arg3 = Static119.anInt2428;
			local35 = false;
		} else if (Static200.anInt4074 < arg3) {
			local35 = false;
			arg3 = Static200.anInt4074;
		} else {
			local35 = true;
		}
		@Pc(63) boolean local63;
		if (Static119.anInt2428 > arg2) {
			arg2 = Static119.anInt2428;
			local63 = false;
		} else if (arg2 <= Static200.anInt4074) {
			local63 = true;
		} else {
			arg2 = Static200.anInt4074;
			local63 = false;
		}
		if (arg4 >= Static26.anInt554) {
			Static16.method302(arg1, arg3, arg2, Static157.anIntArrayArray24[arg4++]);
		} else {
			arg4 = Static26.anInt554;
		}
		if (arg0 > Static52.anInt1117) {
			arg0 = Static52.anInt1117;
		} else {
			Static16.method302(arg1, arg3, arg2, Static157.anIntArrayArray24[arg0--]);
		}
		@Pc(115) int local115;
		if (local35 && local63) {
			for (local115 = arg4; local115 <= arg0; local115++) {
				@Pc(157) int[] local157 = Static157.anIntArrayArray24[local115];
				local157[arg3] = local157[arg2] = arg1;
			}
			return;
		}
		if (local35) {
			for (local115 = arg4; local115 <= arg0; local115++) {
				Static157.anIntArrayArray24[local115][arg3] = arg1;
			}
			return;
		}
		if (local63) {
			for (local115 = arg4; local115 <= arg0; local115++) {
				Static157.anIntArrayArray24[local115][arg2] = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "(I)V")
	public static void method1304() {
		@Pc(9) int local9 = Static58.anInt1276 * 128 + 64;
		@Pc(15) int local15 = Static167.anInt3406 * 128 + 64;
		@Pc(23) int local23 = Static107.method2399(local15, local9, Static137.anInt2795) - Static69.anInt1395;
		if (local23 > Static118.anInt2400) {
			Static118.anInt2400 += (local23 - Static118.anInt2400) * Static167.anInt3404 / 1000 + Static6.anInt122;
			if (local23 < Static118.anInt2400) {
				Static118.anInt2400 = local23;
			}
		}
		if (Static118.anInt2400 > local23) {
			Static118.anInt2400 -= Static6.anInt122 + (Static118.anInt2400 - local23) * Static167.anInt3404 / 1000;
			if (Static118.anInt2400 < local23) {
				Static118.anInt2400 = local23;
			}
		}
		if (local9 > Static130.anInt2546) {
			Static130.anInt2546 += (local9 - Static130.anInt2546) * Static167.anInt3404 / 1000 + Static6.anInt122;
			if (local9 < Static130.anInt2546) {
				Static130.anInt2546 = local9;
			}
		}
		if (Static130.anInt2546 > local9) {
			Static130.anInt2546 -= Static167.anInt3404 * (Static130.anInt2546 - local9) / 1000 + Static6.anInt122;
			if (Static130.anInt2546 < local9) {
				Static130.anInt2546 = local9;
			}
		}
		local9 = Static136.anInt2773 * 128 + 64;
		if (local15 > Static54.anInt1158) {
			Static54.anInt1158 += Static167.anInt3404 * (local15 - Static54.anInt1158) / 1000 + Static6.anInt122;
			if (Static54.anInt1158 > local15) {
				Static54.anInt1158 = local15;
			}
		}
		if (Static54.anInt1158 > local15) {
			Static54.anInt1158 -= (Static54.anInt1158 - local15) * Static167.anInt3404 / 1000 + Static6.anInt122;
			if (Static54.anInt1158 < local15) {
				Static54.anInt1158 = local15;
			}
		}
		local15 = Static57.anInt1238 * 128 + 64;
		local23 = Static107.method2399(local15, local9, Static137.anInt2795) - Static47.anInt970;
		@Pc(199) int local199 = local9 - Static130.anInt2546;
		@Pc(204) int local204 = local23 - Static118.anInt2400;
		@Pc(209) int local209 = local15 - Static54.anInt1158;
		@Pc(220) int local220 = (int) Math.sqrt((double) (local199 * local199 + local209 * local209));
		@Pc(231) int local231 = (int) (Math.atan2((double) local204, (double) local220) * 325.949D) & 0x7FF;
		@Pc(242) int local242 = (int) (-325.949D * Math.atan2((double) local199, (double) local209)) & 0x7FF;
		if (local231 < 128) {
			local231 = 128;
		}
		if (local231 > 383) {
			local231 = 383;
		}
		@Pc(257) int local257 = local242 - Static183.anInt2962;
		if (local257 > 1024) {
			local257 -= 2048;
		}
		if (local231 > Static122.anInt2464) {
			Static122.anInt2464 += Static45.anInt957 + (local231 - Static122.anInt2464) * Static50.anInt1042 / 1000;
			if (local231 < Static122.anInt2464) {
				Static122.anInt2464 = local231;
			}
		}
		if (Static122.anInt2464 > local231) {
			Static122.anInt2464 -= Static45.anInt957 + (Static122.anInt2464 - local231) * Static50.anInt1042 / 1000;
			if (local231 > Static122.anInt2464) {
				Static122.anInt2464 = local231;
			}
		}
		if (local257 < -1024) {
			local257 += 2048;
		}
		if (local257 > 0) {
			Static183.anInt2962 += Static45.anInt957 + local257 * Static50.anInt1042 / 1000;
			Static183.anInt2962 &= 0x7FF;
		}
		if (local257 < 0) {
			Static183.anInt2962 -= -local257 * Static50.anInt1042 / 1000 + Static45.anInt957;
			Static183.anInt2962 &= 0x7FF;
		}
		@Pc(358) int local358 = local242 - Static183.anInt2962;
		if (local358 > 1024) {
			local358 -= 2048;
		}
		if (local358 < -1024) {
			local358 += 2048;
		}
		if (local358 < 0 && local257 > 0 || local358 > 0 && local257 < 0) {
			Static183.anInt2962 = local242;
		}
	}
}
