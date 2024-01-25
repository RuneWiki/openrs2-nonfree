import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public static int anInt1028;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZIII)V")
	public static void method821(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg3 == Static96.anInt5953 && Static372.anInt6696 == arg2 && (Static232.anInt4221 == Static388.anInt6870 || Static291.aClass28_Sub1_1.method832(Static294.anInt5208))) {
			return;
		}
		Static372.anInt6696 = arg2;
		Static96.anInt5953 = arg3;
		Static232.anInt4221 = Static388.anInt6870;
		if (Static291.aClass28_Sub1_1.method832(Static294.anInt5208)) {
			Static232.anInt4221 = 0;
		}
		if (arg1) {
			Static100.method1818(28);
		} else {
			Static100.method1818(25);
		}
		Static134.method2374(Static35.aClass29_1, Static54.aClass267_20.method6581(Static161.anInt3239), true);
		@Pc(65) int local65 = Static2.anInt6396;
		@Pc(67) int local67 = Static348.anInt6273;
		Static2.anInt6396 = (Static96.anInt5953 - (Static181.anInt3574 >> 4)) * 8;
		Static348.anInt6273 = (Static372.anInt6696 - (Static117.anInt2450 >> 4)) * 8;
		Static96.aClass6_Sub2_Sub15_5 = Static7.method923(Static96.anInt5953 * 8, Static372.anInt6696 * 8);
		Static39.aClass202_3 = null;
		@Pc(103) int local103 = Static2.anInt6396 - local65;
		@Pc(107) int local107 = Static348.anInt6273 - local67;
		@Pc(111) int local111;
		@Pc(121) int local121;
		if (arg1) {
			Static136.anInt2887 = 0;
			local111 = (Static181.anInt3574 - 1) * 128;
			@Pc(181) int local181 = Static117.anInt2450 * 128 - 128;
			for (local121 = 0; local121 < 32768; local121++) {
				@Pc(189) Class3_Sub2_Sub1_Sub1 local189 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local121];
				if (local189 != null) {
					local189.anInt7202 -= local103 * 128;
					local189.anInt7207 -= local107 * 128;
					if (local189.anInt7202 >= 0 && local189.anInt7202 <= local111 && local189.anInt7207 >= 0 && local189.anInt7207 <= local181) {
						@Pc(234) boolean local234 = true;
						for (@Pc(236) int local236 = 0; local236 < 10; local236++) {
							local189.anIntArray458[local236] -= local103;
							local189.anIntArray459[local236] -= local107;
							if (local189.anIntArray458[local236] < 0 || local189.anIntArray458[local236] >= Static181.anInt3574 || local189.anIntArray459[local236] < 0 || local189.anIntArray459[local236] >= Static117.anInt2450) {
								local234 = false;
							}
						}
						if (local234) {
							Static66.anIntArray102[Static136.anInt2887++] = local121;
						} else {
							Static308.aClass3_Sub2_Sub1_Sub1Array1[local121].method1318(null);
							Static308.aClass3_Sub2_Sub1_Sub1Array1[local121] = null;
						}
					} else {
						Static308.aClass3_Sub2_Sub1_Sub1Array1[local121].method1318(null);
						Static308.aClass3_Sub2_Sub1_Sub1Array1[local121] = null;
					}
				}
			}
		} else {
			for (local111 = 0; local111 < 32768; local111++) {
				@Pc(117) Class3_Sub2_Sub1_Sub1 local117 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local111];
				if (local117 != null) {
					for (local121 = 0; local121 < 10; local121++) {
						local117.anIntArray458[local121] -= local103;
						local117.anIntArray459[local121] -= local107;
					}
					local117.anInt7202 -= local103 * 128;
					local117.anInt7207 -= local107 * 128;
				}
			}
		}
		for (local111 = 0; local111 < 2048; local111++) {
			@Pc(330) Class3_Sub2_Sub1_Sub2 local330 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local111];
			if (local330 != null) {
				for (local121 = 0; local121 < 10; local121++) {
					local330.anIntArray458[local121] -= local103;
					local330.anIntArray459[local121] -= local107;
				}
				local330.anInt7207 -= local107 * 128;
				local330.anInt7202 -= local103 * 128;
			}
		}
		@Pc(380) Class17[] local380 = Static122.aClass17Array1;
		for (local121 = 0; local121 < local380.length; local121++) {
			@Pc(388) Class17 local388 = local380[local121];
			if (local388 != null) {
				local388.anInt533 -= local103 * 128;
				local388.anInt535 -= local107 * 128;
			}
		}
		Static266.method1439(local103, local107);
		for (@Pc(424) Class6_Sub23 local424 = (Class6_Sub23) Static428.aClass244_45.method5976(); local424 != null; local424 = (Class6_Sub23) Static428.aClass244_45.method5964()) {
			local424.anInt4215 -= local107;
			local424.anInt4218 -= local103;
			if (Static98.anInt6276 != 3 && (local424.anInt4218 < 0 || local424.anInt4215 < 0 || local424.anInt4218 >= Static181.anInt3574 || Static117.anInt2450 <= local424.anInt4215)) {
				local424.method6525();
			}
		}
		if (Static114.anInt5655 != 0) {
			Static114.anInt5655 -= local103;
			Static346.anInt6243 -= local107;
		}
		Static95.method1697();
		if (arg1) {
			Static229.anInt4187 -= local107 * 128;
			Static315.anInt5489 -= local107;
			Static106.anInt2294 -= local107;
			Static157.anInt3220 -= local103 * 128;
			Static294.anInt5207 -= local103;
			Static345.anInt6218 -= local103;
			if (Math.abs(local103) > Static181.anInt3574 || Math.abs(local107) > Static117.anInt2450) {
				Static245.method3817();
			}
		} else if (Static429.anInt7656 == 4) {
			Static14.anInt435 -= local103 * 128;
			Static390.anInt6891 -= local107 * 128;
			Static261.anInt4746 -= local103 * 128;
			Static202.anInt3800 -= local107 * 128;
		} else {
			Static429.anInt7656 = 1;
		}
		Static365.method5493();
		Static245.method3818();
		Static446.aClass244_47.method5969();
		Static5.aClass244_3.method5969();
		Static298.aClass111_4.method2693();
		Static335.method4883();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)Z")
	public static boolean method822(@OriginalArg(0) int arg0) {
		if (arg0 == 3 || arg0 == 17 || arg0 == 12 || arg0 == 49 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 23 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public static void method823() {
		if (Static36.anInt1129 == -1) {
			return;
		}
		@Pc(11) int local11 = Static186.aClass50_1.method1436();
		@Pc(15) int local15 = Static186.aClass50_1.method1446();
		@Pc(20) Class6_Sub33 local20 = (Class6_Sub33) Static124.aClass244_13.method5976();
		if (local20 != null) {
			local11 = local20.method5290();
			local15 = local20.method5287();
		}
		Static22.method650(Static348.anInt6272, 0, local15, Static36.anInt1129, 0, 0, 0, Static199.anInt3767, local11);
		if (Static396.aClass239_10 != null) {
			Static74.method1487(local15, local11);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method824() {
		@Pc(10) Class44 local10 = Static320.aClass44_43;
		synchronized (Static320.aClass44_43) {
			Static320.aClass44_43.method1351();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Lclient!et;")
	public static Class3_Sub3 method825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub3_2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZB)I")
	public static int method826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(15) Class6_Sub37 local15 = Static375.method5604(arg2, arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray409.length; local29++) {
				if (arg0 == local15.anIntArray408[local29]) {
					local27 += local15.anIntArray409[local29];
				}
			}
			return local27;
		}
	}
}
