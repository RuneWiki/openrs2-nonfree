import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "Lclient!ge;")
	public static Class39 aClass39_26 = new Class39(64);

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
	public static int anInt4431 = 0;

	@OriginalMember(owner = "client!ai", name = "db", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1512 = Static200.method3116("Use");

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1510 = aClass60_1512;

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1511 = Static200.method3116("Art");

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
	public static int anInt4432 = 1;

	@OriginalMember(owner = "client!ai", name = "fb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1513 = Static200.method3116(")2");

	@OriginalMember(owner = "client!ai", name = "hb", descriptor = "Lclient!ij;")
	public static Class50 aClass50_3 = new Class50();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)V")
	public static void method3228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static149.method2554(arg3);
		@Pc(6) int local6 = 0;
		@Pc(17) int local17 = -arg3;
		@Pc(22) int local22 = arg3 - arg4;
		if (local22 < 0) {
			local22 = 0;
		}
		@Pc(28) int local28 = -1;
		@Pc(31) int local31 = -local22;
		@Pc(50) int local50;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(75) int local75;
		if (Static141.anInt3163 <= arg2 && arg2 <= Static200.anInt4273) {
			@Pc(41) int[] local41 = Static148.anIntArrayArray78[arg2];
			local50 = Static107.method1863(Static214.anInt4572, arg5 - arg3, Static130.anInt2847);
			local58 = Static107.method1863(Static214.anInt4572, arg5 + arg3, Static130.anInt2847);
			local66 = Static107.method1863(Static214.anInt4572, arg5 - local22, Static130.anInt2847);
			local75 = Static107.method1863(Static214.anInt4572, arg5 + local22, Static130.anInt2847);
			Static104.method1768(local50, local66, arg1, local41);
			Static104.method1768(local66, local75, arg0, local41);
			Static104.method1768(local75, local58, arg1, local41);
		}
		@Pc(95) int local95 = arg3;
		@Pc(97) int local97 = -1;
		@Pc(99) int local99 = local22;
		while (local6 < local95) {
			local28 += 2;
			local97 += 2;
			local17 += local97;
			local31 += local28;
			if (local31 >= 0 && local99 >= 1) {
				local99--;
				local31 -= local99 << 1;
				Static56.anIntArray170[local99] = local6;
			}
			local6++;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(214) int[] local214;
			@Pc(145) int local145;
			if (local17 >= 0) {
				local95--;
				local50 = local95 + arg2;
				local145 = arg2 - local95;
				local17 -= local95 << 1;
				if (local50 >= Static141.anInt3163 && local145 <= Static200.anInt4273) {
					if (local95 < local22) {
						local58 = Static56.anIntArray170[local95];
						local66 = Static107.method1863(Static214.anInt4572, arg5 + local6, Static130.anInt2847);
						local75 = Static107.method1863(Static214.anInt4572, arg5 - local6, Static130.anInt2847);
						local198 = Static107.method1863(Static214.anInt4572, local58 + arg5, Static130.anInt2847);
						local207 = Static107.method1863(Static214.anInt4572, arg5 - local58, Static130.anInt2847);
						if (Static200.anInt4273 >= local50) {
							local214 = Static148.anIntArrayArray78[local50];
							Static104.method1768(local75, local207, arg1, local214);
							Static104.method1768(local207, local198, arg0, local214);
							Static104.method1768(local198, local66, arg1, local214);
						}
						if (Static141.anInt3163 <= local145) {
							local214 = Static148.anIntArrayArray78[local145];
							Static104.method1768(local75, local207, arg1, local214);
							Static104.method1768(local207, local198, arg0, local214);
							Static104.method1768(local198, local66, arg1, local214);
						}
					} else {
						local58 = Static107.method1863(Static214.anInt4572, arg5 + local6, Static130.anInt2847);
						local66 = Static107.method1863(Static214.anInt4572, arg5 - local6, Static130.anInt2847);
						if (Static200.anInt4273 >= local50) {
							Static104.method1768(local66, local58, arg1, Static148.anIntArrayArray78[local50]);
						}
						if (local145 >= Static141.anInt3163) {
							Static104.method1768(local66, local58, arg1, Static148.anIntArrayArray78[local145]);
						}
					}
				}
			}
			local50 = arg2 + local6;
			local145 = arg2 - local6;
			if (local50 >= Static141.anInt3163 && Static200.anInt4273 >= local145) {
				local58 = arg5 + local95;
				local66 = arg5 - local95;
				if (local58 >= Static214.anInt4572 && Static130.anInt2847 >= local66) {
					local58 = Static107.method1863(Static214.anInt4572, local58, Static130.anInt2847);
					local66 = Static107.method1863(Static214.anInt4572, local66, Static130.anInt2847);
					if (local22 > local6) {
						local75 = local99 >= local6 ? local99 : Static56.anIntArray170[local6];
						local198 = Static107.method1863(Static214.anInt4572, local75 + arg5, Static130.anInt2847);
						local207 = Static107.method1863(Static214.anInt4572, arg5 - local75, Static130.anInt2847);
						if (local50 <= Static200.anInt4273) {
							local214 = Static148.anIntArrayArray78[local50];
							Static104.method1768(local66, local207, arg1, local214);
							Static104.method1768(local207, local198, arg0, local214);
							Static104.method1768(local198, local58, arg1, local214);
						}
						if (local145 >= Static141.anInt3163) {
							local214 = Static148.anIntArrayArray78[local145];
							Static104.method1768(local66, local207, arg1, local214);
							Static104.method1768(local207, local198, arg0, local214);
							Static104.method1768(local198, local58, arg1, local214);
						}
					} else {
						if (Static200.anInt4273 >= local50) {
							Static104.method1768(local66, local58, arg1, Static148.anIntArrayArray78[local50]);
						}
						if (Static141.anInt3163 <= local145) {
							Static104.method1768(local66, local58, arg1, Static148.anIntArrayArray78[local145]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)Z")
	public static boolean method3231(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZ)V")
	public static void method3238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		@Pc(16) Class1_Sub1_Sub20 local16 = (Class1_Sub1_Sub20) Static25.aClass33_2.method1071(local6);
		if (local16 != null) {
			Static34.aClass52_1.method1675(local16);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
	public static void method3248(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub17 local6 = (Class1_Sub17) Static16.aClass19_2.method609(); local6 != null; local6 = (Class1_Sub17) Static16.aClass19_2.method615()) {
			if (local6.anInt2569 != -1 || local6.anIntArray323 != null) {
				@Pc(18) int local18 = 0;
				if (arg3 > local6.anInt2562) {
					local18 = arg3 - local6.anInt2562;
				} else if (arg3 < local6.anInt2566) {
					local18 = local6.anInt2566 - arg3;
				}
				if (local6.anInt2565 < arg0) {
					local18 += arg0 - local6.anInt2565;
				} else if (local6.anInt2559 > arg0) {
					local18 += local6.anInt2559 - arg0;
				}
				if (local18 - 64 > local6.anInt2561 || Static79.anInt1900 == 0 || arg1 != local6.anInt2558) {
					if (local6.aClass1_Sub7_Sub4_2 != null) {
						Static166.aClass1_Sub7_Sub2_2.method3374(local6.aClass1_Sub7_Sub4_2);
						local6.aClass1_Sub7_Sub4_2 = null;
					}
					if (local6.aClass1_Sub7_Sub4_3 != null) {
						Static166.aClass1_Sub7_Sub2_2.method3374(local6.aClass1_Sub7_Sub4_3);
						local6.aClass1_Sub7_Sub4_3 = null;
					}
				} else {
					local18 -= 64;
					if (local18 < 0) {
						local18 = 0;
					}
					@Pc(145) int local145 = (local6.anInt2561 - local18) * Static79.anInt1900 / local6.anInt2561;
					if (local6.aClass1_Sub7_Sub4_2 != null) {
						local6.aClass1_Sub7_Sub4_2.method3469(local145);
					} else if (local6.anInt2569 >= 0) {
						@Pc(160) Class30 local160 = Static223.method1057(Static193.aClass7_Sub1_28, local6.anInt2569, 0);
						if (local160 != null) {
							@Pc(167) Class1_Sub19_Sub1 local167 = local160.method1055().method2523(Static139.aClass53_1);
							@Pc(172) Class1_Sub7_Sub4 local172 = Static229.method3466(local167, local145);
							local172.method3470(-1);
							Static166.aClass1_Sub7_Sub2_2.method3378(local172);
							local6.aClass1_Sub7_Sub4_2 = local172;
						}
					}
					if (local6.aClass1_Sub7_Sub4_3 != null) {
						local6.aClass1_Sub7_Sub4_3.method3469(local145);
						if (!local6.aClass1_Sub7_Sub4_3.method3525()) {
							local6.aClass1_Sub7_Sub4_3 = null;
						}
					} else if (local6.anIntArray323 != null && (local6.anInt2568 -= arg2) <= 0) {
						@Pc(209) int local209 = (int) (Math.random() * (double) local6.anIntArray323.length);
						@Pc(217) Class30 local217 = Static223.method1057(Static193.aClass7_Sub1_28, local6.anIntArray323[local209], 0);
						if (local217 != null) {
							@Pc(224) Class1_Sub19_Sub1 local224 = local217.method1055().method2523(Static139.aClass53_1);
							@Pc(229) Class1_Sub7_Sub4 local229 = Static229.method3466(local224, local145);
							local229.method3470(0);
							Static166.aClass1_Sub7_Sub2_2.method3378(local229);
							local6.anInt2568 = local6.anInt2567 + (int) (Math.random() * (double) (local6.anInt2564 - local6.anInt2567));
							local6.aClass1_Sub7_Sub4_3 = local229;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IZ)V")
	public static void method3249(@OriginalArg(0) int arg0) {
		Static177.anInt3807 = 1000 / arg0;
	}
}
