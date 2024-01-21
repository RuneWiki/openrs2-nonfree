import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
	public static int anInt1852;

	@OriginalMember(owner = "client!ii", name = "gb", descriptor = "Lclient!hb;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static volatile int anInt1834 = 0;

	@OriginalMember(owner = "client!ii", name = "uc", descriptor = "[I")
	public static final int[] anIntArray173 = new int[128];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII)V")
	public static void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static15.anInt353 || arg2 < Static154.anInt3307) {
			return;
		}
		@Pc(20) boolean local20;
		if (arg3 < Static122.anInt2718) {
			local20 = false;
			arg3 = Static122.anInt2718;
		} else if (Static153.anInt3279 >= arg3) {
			local20 = true;
		} else {
			local20 = false;
			arg3 = Static153.anInt3279;
		}
		@Pc(46) boolean local46;
		if (Static122.anInt2718 > arg0) {
			arg0 = Static122.anInt2718;
			local46 = false;
		} else if (Static153.anInt3279 < arg0) {
			arg0 = Static153.anInt3279;
			local46 = false;
		} else {
			local46 = true;
		}
		if (arg4 < Static154.anInt3307) {
			arg4 = Static154.anInt3307;
		} else {
			Static19.method345(arg1, Static55.anIntArrayArray8[arg4++], arg3, arg0);
		}
		if (arg2 > Static15.anInt353) {
			arg2 = Static15.anInt353;
		} else {
			Static19.method345(arg1, Static55.anIntArrayArray8[arg2--], arg3, arg0);
		}
		@Pc(103) int local103;
		if (local20 && local46) {
			for (local103 = arg4; local103 <= arg2; local103++) {
				@Pc(147) int[] local147 = Static55.anIntArrayArray8[local103];
				local147[arg3] = local147[arg0] = arg1;
			}
		} else if (local20) {
			for (local103 = arg4; local103 <= arg2; local103++) {
				Static55.anIntArrayArray8[local103][arg3] = arg1;
			}
		} else if (local46) {
			for (local103 = arg4; local103 <= arg2; local103++) {
				Static55.anIntArrayArray8[local103][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)I")
	public static int method1238(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub1_Sub19 local7 = Static207.method3010(arg0);
		@Pc(10) int local10 = local7.anInt3467;
		@Pc(18) int local18 = local7.anInt3462;
		@Pc(21) int local21 = local7.anInt3463;
		@Pc(27) int local27 = Class2_Sub1_Sub25.anIntArray396[local21 - local18];
		return local27 & Static71.anIntArray123[local10] >> local18;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)I")
	public static int method1242(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!dh;B)V")
	public static void method1249(@OriginalArg(0) Class7_Sub2 arg0) {
		arg0.aBoolean135 = false;
		@Pc(18) Class2_Sub1_Sub25 local18;
		if (arg0.anInt3096 != -1) {
			local18 = Static90.method27(arg0.anInt3096);
			if (local18 == null || local18.anIntArray392 == null) {
				arg0.anInt3096 = -1;
			} else {
				arg0.anInt3080++;
				if (local18.anIntArray392.length > arg0.anInt3060 && local18.anIntArray389[arg0.anInt3060] < arg0.anInt3080) {
					arg0.anInt3080 = 1;
					arg0.anInt3060++;
					Static153.method2281(arg0.anInt3060, local18, arg0.anInt3046, Static186.aClass7_Sub2_Sub2_1 == arg0, arg0.anInt3085);
				}
				if (local18.anIntArray392.length <= arg0.anInt3060) {
					arg0.anInt3060 = 0;
					arg0.anInt3080 = 0;
					Static153.method2281(arg0.anInt3060, local18, arg0.anInt3046, arg0 == Static186.aClass7_Sub2_Sub2_1, arg0.anInt3085);
				}
			}
		}
		if (arg0.anInt3091 != -1 && arg0.anInt3070 <= Static25.anInt581) {
			if (arg0.anInt3099 < 0) {
				arg0.anInt3099 = 0;
			}
			@Pc(130) int local130 = Static99.method1597(arg0.anInt3091).anInt4000;
			if (local130 == -1) {
				arg0.anInt3091 = -1;
			} else {
				@Pc(138) Class2_Sub1_Sub25 local138 = Static90.method27(local130);
				if (local138 == null || local138.anIntArray392 == null) {
					arg0.anInt3091 = -1;
				} else {
					arg0.anInt3078++;
					if (local138.anIntArray392.length > arg0.anInt3099 && local138.anIntArray389[arg0.anInt3099] < arg0.anInt3078) {
						arg0.anInt3099++;
						arg0.anInt3078 = 1;
						Static153.method2281(arg0.anInt3099, local138, arg0.anInt3046, arg0 == Static186.aClass7_Sub2_Sub2_1, arg0.anInt3085);
					}
					if (local138.anIntArray392.length <= arg0.anInt3099) {
						arg0.anInt3091 = -1;
					}
				}
			}
		}
		if (arg0.anInt3062 != -1 && arg0.anInt3075 <= 1) {
			local18 = Static90.method27(arg0.anInt3062);
			if (local18.anInt4367 == 1 && arg0.anInt3086 > 0 && arg0.anInt3069 <= Static25.anInt581 && Static25.anInt581 > arg0.anInt3100) {
				arg0.anInt3075 = 1;
				return;
			}
		}
		if (arg0.anInt3062 != -1 && arg0.anInt3075 == 0) {
			local18 = Static90.method27(arg0.anInt3062);
			if (local18 == null || local18.anIntArray392 == null) {
				arg0.anInt3062 = -1;
			} else {
				arg0.anInt3055++;
				if (arg0.anInt3066 < local18.anIntArray392.length && arg0.anInt3055 > local18.anIntArray389[arg0.anInt3066]) {
					arg0.anInt3055 = 1;
					arg0.anInt3066++;
					Static153.method2281(arg0.anInt3066, local18, arg0.anInt3046, Static186.aClass7_Sub2_Sub2_1 == arg0, arg0.anInt3085);
				}
				if (arg0.anInt3066 >= local18.anIntArray392.length) {
					arg0.anInt3044++;
					arg0.anInt3066 -= local18.anInt4368;
					if (local18.anInt4370 <= arg0.anInt3044) {
						arg0.anInt3062 = -1;
					} else if (arg0.anInt3066 >= 0 && local18.anIntArray392.length > arg0.anInt3066) {
						Static153.method2281(arg0.anInt3066, local18, arg0.anInt3046, arg0 == Static186.aClass7_Sub2_Sub2_1, arg0.anInt3085);
					} else {
						arg0.anInt3062 = -1;
					}
				}
				arg0.aBoolean135 = local18.aBoolean188;
			}
		}
		if (arg0.anInt3075 > 0) {
			arg0.anInt3075--;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static51.method770(arg2);
		@Pc(6) int local6 = 0;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(31) int local31 = -local15;
		@Pc(33) int local33 = local15;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(72) int local72;
		@Pc(81) int local81;
		if (arg1 >= Static154.anInt3307 && Static15.anInt353 >= arg1) {
			@Pc(47) int[] local47 = Static55.anIntArrayArray8[arg1];
			local55 = Static144.method2183(arg5 - arg2, Static122.anInt2718, Static153.anInt3279);
			local63 = Static144.method2183(arg2 + arg5, Static122.anInt2718, Static153.anInt3279);
			local72 = Static144.method2183(arg5 - local15, Static122.anInt2718, Static153.anInt3279);
			local81 = Static144.method2183(arg5 + local15, Static122.anInt2718, Static153.anInt3279);
			Static19.method345(arg4, local47, local55, local72);
			Static19.method345(arg3, local47, local72, local81);
			Static19.method345(arg4, local47, local81, local63);
		}
		while (local6 < local17) {
			local35 += 2;
			local37 += 2;
			local20 += local37;
			local31 += local35;
			if (local31 >= 0 && local33 >= 1) {
				local33--;
				local31 -= local33 << 1;
				Static128.anIntArray13[local33] = local6;
			}
			local6++;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(223) int[] local223;
			@Pc(140) int local140;
			if (local20 >= 0) {
				local17--;
				local140 = arg1 - local17;
				local20 -= local17 << 1;
				local55 = arg1 + local17;
				if (local55 >= Static154.anInt3307 && Static15.anInt353 >= local140) {
					if (local17 < local15) {
						local63 = Static128.anIntArray13[local17];
						local72 = Static144.method2183(arg5 + local6, Static122.anInt2718, Static153.anInt3279);
						local81 = Static144.method2183(arg5 - local6, Static122.anInt2718, Static153.anInt3279);
						local203 = Static144.method2183(arg5 + local63, Static122.anInt2718, Static153.anInt3279);
						local212 = Static144.method2183(arg5 - local63, Static122.anInt2718, Static153.anInt3279);
						if (Static15.anInt353 >= local55) {
							local223 = Static55.anIntArrayArray8[local55];
							Static19.method345(arg4, local223, local81, local212);
							Static19.method345(arg3, local223, local212, local203);
							Static19.method345(arg4, local223, local203, local72);
						}
						if (local140 >= Static154.anInt3307) {
							local223 = Static55.anIntArrayArray8[local140];
							Static19.method345(arg4, local223, local81, local212);
							Static19.method345(arg3, local223, local212, local203);
							Static19.method345(arg4, local223, local203, local72);
						}
					} else {
						local63 = Static144.method2183(arg5 + local6, Static122.anInt2718, Static153.anInt3279);
						local72 = Static144.method2183(arg5 - local6, Static122.anInt2718, Static153.anInt3279);
						if (local55 <= Static15.anInt353) {
							Static19.method345(arg4, Static55.anIntArrayArray8[local55], local72, local63);
						}
						if (local140 >= Static154.anInt3307) {
							Static19.method345(arg4, Static55.anIntArrayArray8[local140], local72, local63);
						}
					}
				}
			}
			local140 = arg1 - local6;
			local55 = arg1 + local6;
			if (Static154.anInt3307 <= local55 && local140 <= Static15.anInt353) {
				local63 = arg5 + local17;
				local72 = arg5 - local17;
				if (local63 >= Static122.anInt2718 && Static153.anInt3279 >= local72) {
					local63 = Static144.method2183(local63, Static122.anInt2718, Static153.anInt3279);
					local72 = Static144.method2183(local72, Static122.anInt2718, Static153.anInt3279);
					if (local15 <= local6) {
						if (Static15.anInt353 >= local55) {
							Static19.method345(arg4, Static55.anIntArrayArray8[local55], local72, local63);
						}
						if (local140 >= Static154.anInt3307) {
							Static19.method345(arg4, Static55.anIntArrayArray8[local140], local72, local63);
						}
					} else {
						local81 = local6 <= local33 ? local33 : Static128.anIntArray13[local6];
						local203 = Static144.method2183(arg5 + local81, Static122.anInt2718, Static153.anInt3279);
						local212 = Static144.method2183(arg5 - local81, Static122.anInt2718, Static153.anInt3279);
						if (Static15.anInt353 >= local55) {
							local223 = Static55.anIntArrayArray8[local55];
							Static19.method345(arg4, local223, local72, local212);
							Static19.method345(arg3, local223, local212, local203);
							Static19.method345(arg4, local223, local203, local63);
						}
						if (local140 >= Static154.anInt3307) {
							local223 = Static55.anIntArrayArray8[local140];
							Static19.method345(arg4, local223, local72, local212);
							Static19.method345(arg3, local223, local212, local203);
							Static19.method345(arg4, local223, local203, local63);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public static void method1251() {
		@Pc(8) int[] local8 = new int[Static77.anInt3590];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static77.anInt3590; local12++) {
			@Pc(18) Class2_Sub1_Sub26 local18 = Static52.method774(local12);
			if (local18.anInt4516 >= 0 || local18.anInt4510 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static95.anIntArray202 = new int[local10];
		for (@Pc(52) int local52 = 0; local52 < local10; local52++) {
			Static95.anIntArray202[local52] = local8[local52];
		}
	}
}
