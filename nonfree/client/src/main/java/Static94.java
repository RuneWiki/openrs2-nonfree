import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
	public static int anInt2812;

	@OriginalMember(owner = "client!ke", name = "lb", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array8;

	@OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
	public static int anInt2816;

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "[I")
	public static final int[] anIntArray322 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
	public static int anInt2813 = -1;

	@OriginalMember(owner = "client!ke", name = "rb", descriptor = "[Lclient!eg;")
	public static final Class23[] aClass23Array1 = new Class23[50];

	@OriginalMember(owner = "client!ke", name = "sb", descriptor = "Z")
	public static volatile boolean aBoolean109 = true;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBIIII)V")
	public static void method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		Static165.method3105(arg0);
		@Pc(16) int local16 = arg0;
		@Pc(21) int local21 = arg0 - arg4;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(27) int local27 = local21;
		@Pc(30) int local30 = -arg0;
		@Pc(33) int local33 = -local21;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (arg1 >= Static36.anInt1076 && Static117.anInt951 >= arg1) {
			@Pc(51) int[] local51 = Static42.anIntArrayArray8[arg1];
			local59 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 - arg0);
			local67 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg0 + arg5);
			local76 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 - local21);
			local84 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 + local21);
			Static163.method3070(local76, local59, arg3, local51);
			Static163.method3070(local84, local76, arg2, local51);
			Static163.method3070(local67, local84, arg3, local51);
		}
		while (local16 > local11) {
			local35 += 2;
			local30 += local35;
			local37 += 2;
			local33 += local37;
			if (local33 >= 0 && local27 >= 1) {
				local27--;
				Static185.anIntArray482[local27] = local11;
				local33 -= local27 << 1;
			}
			local11++;
			@Pc(204) int local204;
			@Pc(213) int local213;
			@Pc(224) int[] local224;
			@Pc(143) int local143;
			if (local30 >= 0) {
				local16--;
				local143 = arg1 - local16;
				local30 -= local16 << 1;
				local59 = arg1 + local16;
				if (Static36.anInt1076 <= local59 && local143 <= Static117.anInt951) {
					if (local21 > local16) {
						local67 = Static185.anIntArray482[local16];
						local76 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, local11 + arg5);
						local84 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 - local11);
						local204 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, local67 + arg5);
						local213 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 - local67);
						if (Static117.anInt951 >= local59) {
							local224 = Static42.anIntArrayArray8[local59];
							Static163.method3070(local213, local84, arg3, local224);
							Static163.method3070(local204, local213, arg2, local224);
							Static163.method3070(local76, local204, arg3, local224);
						}
						if (local143 >= Static36.anInt1076) {
							local224 = Static42.anIntArrayArray8[local143];
							Static163.method3070(local213, local84, arg3, local224);
							Static163.method3070(local204, local213, arg2, local224);
							Static163.method3070(local76, local204, arg3, local224);
						}
					} else {
						local67 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 + local11);
						local76 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 - local11);
						if (Static117.anInt951 >= local59) {
							Static163.method3070(local67, local76, arg3, Static42.anIntArrayArray8[local59]);
						}
						if (Static36.anInt1076 <= local143) {
							Static163.method3070(local67, local76, arg3, Static42.anIntArrayArray8[local143]);
						}
					}
				}
			}
			local59 = local11 + arg1;
			local143 = arg1 - local11;
			if (Static36.anInt1076 <= local59 && local143 <= Static117.anInt951) {
				local67 = local16 + arg5;
				local76 = arg5 - local16;
				if (Static64.anInt1962 <= local67 && local76 <= Static123.anInt3379) {
					local67 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, local67);
					local76 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, local76);
					if (local21 > local11) {
						local84 = local27 >= local11 ? local27 : Static185.anIntArray482[local11];
						local204 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 + local84);
						local213 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 - local84);
						if (Static117.anInt951 >= local59) {
							local224 = Static42.anIntArrayArray8[local59];
							Static163.method3070(local213, local76, arg3, local224);
							Static163.method3070(local204, local213, arg2, local224);
							Static163.method3070(local67, local204, arg3, local224);
						}
						if (Static36.anInt1076 <= local143) {
							local224 = Static42.anIntArrayArray8[local143];
							Static163.method3070(local213, local76, arg3, local224);
							Static163.method3070(local204, local213, arg2, local224);
							Static163.method3070(local67, local204, arg3, local224);
						}
					} else {
						if (local59 <= Static117.anInt951) {
							Static163.method3070(local67, local76, arg3, Static42.anIntArrayArray8[local59]);
						}
						if (Static36.anInt1076 <= local143) {
							Static163.method3070(local67, local76, arg3, Static42.anIntArrayArray8[local143]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ud;II)V")
	public static void method2239(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt3263 > Static20.anInt580) {
			Static36.method828(arg0);
		} else if (arg0.anInt3295 >= Static20.anInt580) {
			Static161.method3041(arg0);
		} else {
			Static93.method2181(arg0);
		}
		if (arg0.anInt3302 < 128 || arg0.anInt3273 < 128 || arg0.anInt3302 >= 13184 || arg0.anInt3273 >= 13184) {
			arg0.anInt3302 = arg0.anIntArray369[0] * 128 + arg0.anInt3286 * 64;
			arg0.anInt3273 = arg0.anInt3286 * 64 + arg0.anIntArray371[0] * 128;
			arg0.anInt3295 = 0;
			arg0.anInt3263 = 0;
			arg0.anInt3270 = -1;
			arg0.anInt3249 = -1;
			arg0.method2560();
		}
		if (arg0 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1 && (arg0.anInt3302 < 1536 || arg0.anInt3273 < 1536 || arg0.anInt3302 >= 11776 || arg0.anInt3273 >= 11776)) {
			arg0.anInt3273 = arg0.anIntArray371[0] * 128 + arg0.anInt3286 * 64;
			arg0.anInt3249 = -1;
			arg0.anInt3295 = 0;
			arg0.anInt3270 = -1;
			arg0.anInt3263 = 0;
			arg0.anInt3302 = arg0.anInt3286 * 64 + arg0.anIntArray369[0] * 128;
			arg0.method2560();
		}
		Static132.method2766(arg0);
		Static126.method2643(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public static void method2241(@OriginalArg(1) int arg0) {
		Static178.anInt4327 += arg0 * 128;
		@Pc(20) int local20;
		if (Static178.anInt4327 > Static128.anIntArray401.length) {
			local20 = (int) (Math.random() * 12.0D);
			Static178.anInt4327 -= Static128.anIntArray401.length;
			Static177.method3323(Static197.aClass2_Sub1_Sub7_Sub2Array10[local20]);
		}
		local20 = 0;
		@Pc(40) int local40 = (256 - arg0) * 128;
		@Pc(44) int local44 = arg0 * 128;
		@Pc(70) int local70;
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			local70 = Static152.anIntArray320[local20 + local44] - arg0 * Static128.anIntArray401[local20 + Static178.anInt4327 & Static128.anIntArray401.length + -1] / 6;
			if (local70 < 0) {
				local70 = 0;
			}
			Static152.anIntArray320[local20++] = local70;
		}
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(110) int local110;
		for (local70 = 256 - arg0; local70 < 256; local70++) {
			local101 = local70 * 128;
			for (local103 = 0; local103 < 128; local103++) {
				local110 = (int) (Math.random() * 100.0D);
				if (local110 < 50 && local103 > 10 && local103 < 118) {
					Static152.anIntArray320[local101 + local103] = 255;
				} else {
					Static152.anIntArray320[local103 + local101] = 0;
				}
			}
		}
		if (Static134.anInt3572 > 0) {
			Static134.anInt3572 -= arg0 * 4;
		}
		if (Static169.anInt4154 > 0) {
			Static169.anInt4154 -= arg0 * 4;
		}
		if (Static134.anInt3572 == 0 && Static169.anInt4154 == 0) {
			local101 = (int) ((double) (2000 / arg0) * Math.random());
			if (local101 == 1) {
				Static169.anInt4154 = 1024;
			}
			if (local101 == 0) {
				Static134.anInt3572 = 1024;
			}
		}
		for (local101 = 0; local101 < 256 - arg0; local101++) {
			Static168.anIntArray455[local101] = Static168.anIntArray455[local101 + arg0];
		}
		for (local103 = 256 - arg0; local103 < 256; local103++) {
			Static168.anIntArray455[local103] = (int) (Math.sin((double) Static16.anInt522 / 14.0D) * 16.0D + Math.sin((double) Static16.anInt522 / 15.0D) * 14.0D + Math.sin((double) Static16.anInt522 / 16.0D) * 12.0D);
			Static16.anInt522++;
		}
		Static106.anInt3038 += arg0;
		local110 = ((Static20.anInt580 & 0x1) + arg0) / 2;
		if (local110 <= 0) {
			return;
		}
		@Pc(296) int local296;
		@Pc(289) int local289;
		for (@Pc(280) int local280 = 0; local280 < Static106.anInt3038 * 100; local280++) {
			local289 = (int) (Math.random() * 128.0D) + 128;
			local296 = (int) (Math.random() * 124.0D) + 2;
			Static152.anIntArray320[local296 + (local289 << 7)] = 192;
		}
		Static106.anInt3038 = 0;
		@Pc(325) int local325;
		@Pc(330) int local330;
		for (local296 = 0; local296 < 256; local296++) {
			local325 = local296 * 128;
			local289 = 0;
			for (local330 = -local110; local330 < 128; local330++) {
				if (local110 + local330 < 128) {
					local289 += Static152.anIntArray320[local110 + local330 + local325];
				}
				if (local330 - local110 - 1 >= 0) {
					local289 -= Static152.anIntArray320[local330 + local325 - local110 - 1];
				}
				if (local330 >= 0) {
					Static9.anIntArray28[local325 + local330] = local289 / (local110 * 2 + 1);
				}
			}
		}
		for (local289 = 0; local289 < 128; local289++) {
			local325 = 0;
			for (local330 = -local110; local330 < 256; local330++) {
				@Pc(410) int local410 = local330 * 128;
				if (local110 + local330 < 256) {
					local325 += Static9.anIntArray28[local110 * 128 + local410 + local289];
				}
				if (local330 - local110 - 1 >= 0) {
					local325 -= Static9.anIntArray28[local289 + local410 - (local110 - -1) * 128];
				}
				if (local330 >= 0) {
					Static152.anIntArray320[local289 + local410] = local325 / (local110 * 2 + 1);
				}
			}
		}
	}
}
