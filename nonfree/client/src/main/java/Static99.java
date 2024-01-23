import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public static int anInt4483;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1432 = Static186.method3527("settings");

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1433 = Static186.method3527("Loading sprites )2 ");

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1434 = aClass50_1433;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1435 = Static186.method3527(":trade:");

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1436 = Static186.method3527("<img=1>");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIILclient!ta;IZJ)Z")
	public static boolean method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class20 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static119.anIntArrayArrayArray10 == Static72.anIntArrayArrayArray5;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (@Pc(13) int local13 = arg2; local13 < arg2 + arg4; local13++) {
				if (local10 < 0 || local13 < 0 || local10 >= Static12.anInt236 || local13 >= Static232.anInt4450) {
					return false;
				}
				@Pc(34) Class1_Sub11 local34 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][local10][local13];
				if (local34 != null && local34.anInt1072 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class94 local58 = new Class94();
		local58.aLong143 = arg11;
		local58.anInt3685 = arg0;
		local58.anInt3688 = arg5;
		local58.anInt3678 = arg6;
		local58.anInt3682 = arg7;
		local58.aClass20_5 = arg8;
		local58.anInt3687 = arg9;
		local58.anInt3686 = arg1;
		local58.anInt3683 = arg2;
		local58.anInt3692 = arg1 + arg3 - 1;
		local58.anInt3684 = arg2 + arg4 - 1;
		@Pc(104) int local104;
		@Pc(107) int local107;
		for (@Pc(101) int local101 = arg1; local101 < arg1 + arg3; local101++) {
			for (local104 = arg2; local104 < arg2 + arg4; local104++) {
				local107 = 0;
				if (local101 > arg1) {
					local107++;
				}
				if (local101 < arg1 + arg3 - 1) {
					local107 += 4;
				}
				if (local104 > arg2) {
					local107 += 8;
				}
				if (local104 < arg2 + arg4 - 1) {
					local107 += 2;
				}
				for (@Pc(133) int local133 = arg0; local133 >= 0; local133--) {
					if (Static56.aClass1_Sub11ArrayArrayArray3[local133][local101][local104] == null) {
						Static56.aClass1_Sub11ArrayArrayArray3[local133][local101][local104] = new Class1_Sub11(local133, local101, local104);
					}
				}
				@Pc(166) Class1_Sub11 local166 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][local101][local104];
				local166.aClass94Array1[local166.anInt1072] = local58;
				local166.anIntArray91[local166.anInt1072] = local107;
				local166.anInt1076 |= local107;
				local166.anInt1072++;
				if (local6 && Static228.anIntArrayArray38[local101][local104] != 0) {
					local8 = Static228.anIntArrayArray38[local101][local104];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local104 = arg1; local104 < arg1 + arg3; local104++) {
				for (local107 = arg2; local107 < arg2 + arg4; local107++) {
					if (Static228.anIntArrayArray38[local104][local107] == 0) {
						Static228.anIntArrayArray38[local104][local107] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static183.aClass94Array4[Static158.anInt3271++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)V")
	public static void method3533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static193.anInt3035 < 2 && Static123.anInt1750 == 0 && !Static234.aBoolean218) {
			return;
		}
		@Pc(51) Class50 local51;
		if (Static123.anInt1750 == 1 && Static193.anInt3035 < 2) {
			local51 = Static17.method257(new Class50[] { Static125.aClass50_864, Static222.aClass50_1369, Static234.aClass50_1437, Static146.aClass50_1015 });
		} else if (Static234.aBoolean218 && Static193.anInt3035 < 2) {
			local51 = Static17.method257(new Class50[] { Static148.aClass50_1016, Static222.aClass50_1369, Static191.aClass50_1261, Static146.aClass50_1015 });
		} else {
			local51 = Static98.method1549(Static193.anInt3035 - 1);
		}
		if (Static193.anInt3035 > 2) {
			local51 = Static17.method257(new Class50[] { local51, Static155.aClass50_1069, Static160.method2684(Static193.anInt3035 - 2), Static234.aClass50_1439 });
		}
		@Pc(128) int local128 = Static187.aClass1_Sub1_Sub10_3.method1814(local51, arg0 + 4, arg1 - -15, Static125.aRandom1, Static71.anInt1340);
		Static73.method2567(arg0 + 4, 15, Static187.aClass1_Sub1_Sub10_3.method1810(local51) + local128, arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!se;II)V")
	public static void method3534(@OriginalArg(1) int arg0, @OriginalArg(2) Class105 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static193.anInt3035 >= 400) {
			return;
		}
		if (arg1.anIntArray443 != null) {
			arg1 = arg1.method3127();
		}
		if (arg1 == null || !arg1.aBoolean181) {
			return;
		}
		@Pc(34) Class50 local34 = arg1.aClass50_1258;
		if (arg1.anInt3900 != 0) {
			local34 = Static17.method257(new Class50[] { local34, Static30.method438(arg1.anInt3900, Static230.aClass20_Sub3_Sub1_3.anInt1505), Static60.aClass50_424, Static117.aClass50_793, Static160.method2684(arg1.anInt3900), Static66.aClass50_472 });
		}
		if (Static123.anInt1750 == 1) {
			Static150.method2516(Static17.method257(new Class50[] { Static234.aClass50_1437, Static79.aClass50_1058, local34 }), arg3, (long) arg0, Static125.aClass50_864, (short) 29, arg2);
		} else if (!Static234.aBoolean218) {
			@Pc(123) Class50[] local123 = arg1.aClass50Array74;
			if (Static183.aBoolean172) {
				local123 = Static73.method2566(local123);
			}
			@Pc(133) int local133;
			if (local123 != null) {
				for (local133 = 4; local133 >= 0; local133--) {
					if (local123[local133] != null && (Static186.anInt4481 != 0 || !local123[local133].method1256(Static206.aClass50_1317))) {
						@Pc(154) byte local154 = 0;
						if (local133 == 0) {
							local154 = 10;
						}
						if (local133 == 1) {
							local154 = 46;
						}
						if (local133 == 2) {
							local154 = 39;
						}
						if (local133 == 3) {
							local154 = 23;
						}
						if (local133 == 4) {
							local154 = 11;
						}
						Static150.method2516(Static17.method257(new Class50[] { Static85.aClass50_556, local34 }), arg3, (long) arg0, local123[local133], local154, arg2);
					}
				}
			}
			if (Static186.anInt4481 == 0 && local123 != null) {
				for (local133 = 4; local133 >= 0; local133--) {
					if (local123[local133] != null && local123[local133].method1256(Static206.aClass50_1317)) {
						@Pc(238) short local238 = 0;
						@Pc(240) short local240 = 0;
						if (arg1.anInt3900 > Static230.aClass20_Sub3_Sub1_3.anInt1505) {
							local238 = 2000;
						}
						if (local133 == 0) {
							local240 = 10;
						}
						if (local133 == 1) {
							local240 = 46;
						}
						if (local133 == 2) {
							local240 = 39;
						}
						if (local133 == 3) {
							local240 = 23;
						}
						if (local133 == 4) {
							local240 = 11;
						}
						if (local240 != 0) {
							local240 += local238;
						}
						Static150.method2516(Static17.method257(new Class50[] { Static85.aClass50_556, local34 }), arg3, (long) arg0, local123[local133], local240, arg2);
					}
				}
			}
			Static150.method2516(Static17.method257(new Class50[] { Static85.aClass50_556, local34 }), arg3, (long) arg0, Static211.aClass50_1330, (short) 1001, arg2);
		} else if ((Static58.anInt1154 & 0x2) == 2) {
			Static150.method2516(Static17.method257(new Class50[] { Static191.aClass50_1261, Static79.aClass50_1058, local34 }), arg3, (long) arg0, Static148.aClass50_1016, (short) 28, arg2);
			return;
		}
	}
}
