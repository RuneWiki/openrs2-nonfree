import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!h", name = "n", descriptor = "I")
	public static int anInt1922;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!fm;")
	public static Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
	public static int[] anIntArray206 = new int[5];

	@OriginalMember(owner = "client!h", name = "s", descriptor = "I")
	public static int anInt1927 = 0;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "[I")
	public static int[] anIntArray207 = new int[1000];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method1492() {
		anInterface1_1 = null;
		aBooleanArrayArray3 = null;
		anIntArray206 = null;
		anIntArray207 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(1) Class4_Sub30 local1 = null;
		for (@Pc(10) Class4_Sub30 local10 = (Class4_Sub30) Static231.aClass10_47.method190(); local10 != null; local10 = (Class4_Sub30) Static231.aClass10_47.method191()) {
			if (arg7 == local10.anInt5342 && arg1 == local10.anInt5329 && local10.anInt5331 == arg0 && local10.anInt5343 == arg8) {
				local1 = local10;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class4_Sub30();
			local1.anInt5331 = arg0;
			local1.anInt5329 = arg1;
			local1.anInt5343 = arg8;
			local1.anInt5342 = arg7;
			Static232.method3633(local1);
			Static231.aClass10_47.method184(local1);
		}
		local1.anInt5339 = arg5;
		local1.anInt5341 = arg3;
		local1.anInt5334 = arg4;
		local1.anInt5335 = arg6;
		local1.anInt5333 = arg2;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB[Lclient!cc;ZI)V")
	public static void method1495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class22[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(19) Class22 local19 = arg2[local7];
			if (local19 != null && arg4 == local19.anInt587) {
				Static57.method923(arg3, arg1, arg0, local19);
				Static140.method2282(local19, arg1, arg0);
				if (local19.anInt589 > local19.anInt544 - local19.anInt546) {
					local19.anInt589 = local19.anInt544 - local19.anInt546;
				}
				if (local19.anInt589 < 0) {
					local19.anInt589 = 0;
				}
				if (local19.anInt583 - local19.anInt602 < local19.anInt547) {
					local19.anInt547 = local19.anInt583 - local19.anInt602;
				}
				if (local19.anInt547 < 0) {
					local19.anInt547 = 0;
				}
				if (local19.anInt542 == 0) {
					Static161.method2514(local19, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(CI)Z")
	public static boolean method1496(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	public static void method1498() {
		while (true) {
			if (Static101.aClass4_Sub17_Sub1_4.method1900(Static131.anInt2781) >= 11) {
				@Pc(16) int local16 = Static101.aClass4_Sub17_Sub1_4.method1898(11);
				if (local16 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static257.aClass12_Sub3_Sub2Array1[local16] == null) {
						local25 = true;
						Static257.aClass12_Sub3_Sub2Array1[local16] = new Class12_Sub3_Sub2();
						if (Static102.aClass4_Sub17Array1[local16] != null) {
							Static257.aClass12_Sub3_Sub2Array1[local16].method3382(Static102.aClass4_Sub17Array1[local16]);
						}
					}
					Static85.anIntArray179[Static41.anInt856++] = local16;
					@Pc(61) Class12_Sub3_Sub2 local61 = Static257.aClass12_Sub3_Sub2Array1[local16];
					local61.anInt4167 = Static104.anInt2226;
					@Pc(69) int local69 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
					if (local69 == 1) {
						Static97.anIntArray219[Static84.anInt1709++] = local16;
					}
					@Pc(85) int local85 = Static101.aClass4_Sub17_Sub1_4.method1898(5);
					@Pc(90) int local90 = Static101.aClass4_Sub17_Sub1_4.method1898(5);
					if (local90 > 15) {
						local90 -= 32;
					}
					if (local85 > 15) {
						local85 -= 32;
					}
					@Pc(103) int local103 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
					@Pc(110) int local110 = Static103.anIntArray225[Static101.aClass4_Sub17_Sub1_4.method1898(3)];
					if (local25) {
						local61.anInt4136 = local61.anInt4121 = local110;
					}
					local61.method3383(local90 + Static239.aClass12_Sub3_Sub2_2.anIntArray376[0], Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] - -local85, local103 == 1);
					continue;
				}
			}
			Static101.aClass4_Sub17_Sub1_4.method1901();
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	public static String method1499(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (anInterface1_1 != null) {
			@Pc(18) String local18 = anInterface1_1.method921(arg0, arg2, arg1);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)Z")
	public static boolean method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class47 local3 = Static170.method2683(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local3.method1094(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([JIII[I)V")
	public static void method1501(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg1) / 2;
		@Pc(27) long local27 = arg0[local23];
		@Pc(29) int local29 = arg1;
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local27;
		@Pc(43) int local43 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local43;
		for (@Pc(55) int local55 = arg1; local55 < arg2; local55++) {
			if (arg0[local55] < local27 + (long) (local55 & 0x1)) {
				@Pc(78) long local78 = arg0[local55];
				arg0[local55] = arg0[local29];
				arg0[local29] = local78;
				@Pc(92) int local92 = arg3[local55];
				arg3[local55] = arg3[local29];
				arg3[local29++] = local92;
			}
		}
		arg0[arg2] = arg0[local29];
		arg0[local29] = local27;
		arg3[arg2] = arg3[local29];
		arg3[local29] = local43;
		method1501(arg0, arg1, local29 - 1, arg3);
		method1501(arg0, local29 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
	public static void method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static136.anIntArray250[arg0] = arg1;
		@Pc(17) Class4_Sub33 local17 = (Class4_Sub33) Static140.aClass97_12.method2360((long) arg0);
		if (local17 == null) {
			local17 = new Class4_Sub33(4611686018427387905L);
			Static140.aClass97_12.method2364(local17, (long) arg0);
		} else if (local17.aLong196 != 4611686018427387905L) {
			local17.aLong196 = Static133.method2163() + 500L | 0x4000000000000000L;
		}
	}
}
