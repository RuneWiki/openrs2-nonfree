import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 aClass1_Sub2_Sub5_Sub4_Sub1_3;

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1446 = Static118.method2249("::tele 0)1");

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1447 = Static118.method2249("hint_mapedge");

	@OriginalMember(owner = "client!ke", name = "ob", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1449 = Static118.method2249("Select a world");

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1448 = aClass65_1449;

	@OriginalMember(owner = "client!ke", name = "nb", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_42 = new Class87(128);

	@OriginalMember(owner = "client!ke", name = "wb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1451 = Static118.method2249("Existing User");

	@OriginalMember(owner = "client!ke", name = "tb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1450 = aClass65_1451;

	@OriginalMember(owner = "client!ke", name = "vb", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_43 = new Class87(16);

	@OriginalMember(owner = "client!ke", name = "xb", descriptor = "[I")
	public static final int[] anIntArray274 = new int[5];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)Z")
	public static boolean method1845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static206.method3278(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static9.method165(local10 + 1, Static206.anIntArrayArrayArray10[arg0][arg1][arg2] + arg3, local14 + 1) && Static9.method165(local10 + 128 - 1, Static206.anIntArrayArrayArray10[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static9.method165(local10 + 128 - 1, Static206.anIntArrayArrayArray10[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static9.method165(local10 + 1, Static206.anIntArrayArrayArray10[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public static void method1846(@OriginalArg(0) int arg0) {
		Static183.anInt3911 += arg0 * 128;
		@Pc(27) int local27;
		if (Static165.anIntArray434.length < Static183.anInt3911) {
			Static183.anInt3911 -= Static165.anIntArray434.length;
			local27 = (int) (Math.random() * 12.0D);
			Static126.method2388(Static201.aClass1_Sub2_Sub5_Sub1Array12[local27]);
		}
		local27 = 0;
		@Pc(38) int local38 = arg0 * 128;
		@Pc(44) int local44 = (256 - arg0) * 128;
		@Pc(70) int local70;
		for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
			local70 = Static168.anIntArray352[local27 + local38] - arg0 * Static165.anIntArray434[Static165.anIntArray434.length - 1 & Static183.anInt3911 + local27] / 6;
			if (local70 < 0) {
				local70 = 0;
			}
			Static168.anIntArray352[local27++] = local70;
		}
		@Pc(97) int local97;
		@Pc(99) int local99;
		@Pc(106) int local106;
		for (local70 = 256 - arg0; local70 < 256; local70++) {
			local97 = local70 * 128;
			for (local99 = 0; local99 < 128; local99++) {
				local106 = (int) (Math.random() * 100.0D);
				if (local106 < 50 && local99 > 10 && local99 < 118) {
					Static168.anIntArray352[local97 + local99] = 255;
				} else {
					Static168.anIntArray352[local97 + local99] = 0;
				}
			}
		}
		if (Static5.anInt96 > 0) {
			Static5.anInt96 -= arg0 * 4;
		}
		if (Static58.anInt1540 > 0) {
			Static58.anInt1540 -= arg0 * 4;
		}
		if (Static5.anInt96 == 0 && Static58.anInt1540 == 0) {
			local97 = (int) (Math.random() * (double) (2000 / arg0));
			if (local97 == 1) {
				Static58.anInt1540 = 1024;
			}
			if (local97 == 0) {
				Static5.anInt96 = 1024;
			}
		}
		for (local97 = 0; local97 < 256 - arg0; local97++) {
			Static57.anIntArray146[local97] = Static57.anIntArray146[local97 + arg0];
		}
		for (local99 = 256 - arg0; local99 < 256; local99++) {
			Static57.anIntArray146[local99] = (int) (Math.sin((double) Static24.anInt723 / 14.0D) * 16.0D + Math.sin((double) Static24.anInt723 / 15.0D) * 14.0D + Math.sin((double) Static24.anInt723 / 16.0D) * 12.0D);
			Static24.anInt723++;
		}
		Static19.anInt616 += arg0;
		local106 = ((Static174.anInt3887 & 0x1) + arg0) / 2;
		if (local106 <= 0) {
			return;
		}
		@Pc(291) int local291;
		@Pc(298) int local298;
		for (@Pc(282) int local282 = 0; local282 < Static19.anInt616 * 100; local282++) {
			local291 = (int) (Math.random() * 124.0D) + 2;
			local298 = (int) (Math.random() * 128.0D) + 128;
			Static168.anIntArray352[(local298 << 7) + local291] = 192;
		}
		Static19.anInt616 = 0;
		@Pc(328) int local328;
		@Pc(331) int local331;
		for (local291 = 0; local291 < 256; local291++) {
			local298 = 0;
			local328 = local291 * 128;
			for (local331 = -local106; local331 < 128; local331++) {
				if (local331 + local106 < 128) {
					local298 += Static168.anIntArray352[local328 + local331 + local106];
				}
				if (local331 - local106 - 1 >= 0) {
					local298 -= Static168.anIntArray352[local328 + local331 - local106 - 1];
				}
				if (local331 >= 0) {
					Static61.anIntArray155[local331 + local328] = local298 / (local106 * 2 + 1);
				}
			}
		}
		for (local298 = 0; local298 < 128; local298++) {
			local328 = 0;
			for (local331 = -local106; local331 < 256; local331++) {
				@Pc(415) int local415 = local331 * 128;
				if (local331 + local106 < 256) {
					local328 += Static61.anIntArray155[local298 + local415 + local106 * 128];
				}
				if (local331 - local106 - 1 >= 0) {
					local328 -= Static61.anIntArray155[local415 + local298 - local106 * 128 - 128];
				}
				if (local331 >= 0) {
					Static168.anIntArray352[local298 + local415] = local328 / (local106 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIII)I")
	public static int method1847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + (arg1 >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
	public static void method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg4 - arg0;
		@Pc(13) int local13 = arg3 - arg2;
		if (local4 == 0) {
			if (local13 != 0) {
				Static50.method918(arg3, arg0, arg1, arg2);
			}
		} else if (local13 == 0) {
			Static153.method2676(arg4, arg2, arg0, arg1);
		} else {
			if (local4 < 0) {
				local4 = -local4;
			}
			if (local13 < 0) {
				local13 = -local13;
			}
			@Pc(63) boolean local63 = local4 < local13;
			@Pc(73) int local73;
			@Pc(67) int local67;
			if (local63) {
				local67 = arg4;
				arg4 = arg3;
				arg3 = local67;
				local73 = arg0;
				arg0 = arg2;
				arg2 = local73;
			}
			if (arg0 > arg4) {
				local73 = arg0;
				arg0 = arg4;
				local67 = arg2;
				arg2 = arg3;
				arg3 = local67;
				arg4 = local73;
			}
			local73 = arg2;
			local67 = arg4 - arg0;
			@Pc(103) int local103 = -(local67 >> 1);
			@Pc(108) int local108 = arg3 - arg2;
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(123) int local123 = arg2 < arg3 ? 1 : -1;
			@Pc(127) int local127;
			if (local63) {
				for (local127 = arg0; local127 <= arg4; local127++) {
					local103 += local108;
					Static40.anIntArrayArray11[local127][local73] = arg1;
					if (local103 > 0) {
						local73 += local123;
						local103 -= local67;
					}
				}
			} else {
				for (local127 = arg0; local127 <= arg4; local127++) {
					local103 += local108;
					Static40.anIntArrayArray11[local73][local127] = arg1;
					if (local103 > 0) {
						local103 -= local67;
						local73 += local123;
					}
				}
			}
		}
	}
}
