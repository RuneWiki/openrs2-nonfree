import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!hc", name = "nc", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!hc", name = "yc", descriptor = "I")
	public static int anInt2064;

	@OriginalMember(owner = "client!hc", name = "kc", descriptor = "[Lclient!ge;")
	public static Class53_Sub1[] aClass53_Sub1Array1 = new Class53_Sub1[0];

	@OriginalMember(owner = "client!hc", name = "lc", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[112];

	@OriginalMember(owner = "client!hc", name = "xc", descriptor = "Lclient!s;")
	public static Class151 aClass151_1 = new Class151();

	@OriginalMember(owner = "client!hc", name = "zc", descriptor = "F")
	public static float aFloat16 = 128.0F;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(B)V")
	public static void method1557() {
		Static287.aClass33_20.method839();
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public static void method1558() {
		aClass53_Sub1Array1 = null;
		aBooleanArray15 = null;
		aClass151_1 = null;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)I")
	public static int method1559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static250.anIntArrayArrayArray13 == null) {
			return 0;
		}
		@Pc(18) int local18 = arg2 >> 7;
		@Pc(22) int local22 = arg1 >> 7;
		if (local18 < 0 || local22 < 0 || local18 > 103 || local22 > 103) {
			return 0;
		}
		@Pc(41) int local41 = arg0;
		@Pc(45) int local45 = arg2 & 0x7F;
		if (arg0 < 3 && (Static46.aByteArrayArrayArray2[1][local18][local22] & 0x2) == 2) {
			local41 = arg0 + 1;
		}
		@Pc(66) int local66 = arg1 & 0x7F;
		@Pc(92) int local92 = Static250.anIntArrayArrayArray13[local41][local18][local22] * (128 - local45) + local45 * Static250.anIntArrayArrayArray13[local41][local18 + 1][local22] >> 7;
		@Pc(123) int local123 = local45 * Static250.anIntArrayArrayArray13[local41][local18 + 1][local22 + 1] + Static250.anIntArrayArrayArray13[local41][local18][local22 + 1] * (128 - local45) >> 7;
		return local123 * local66 + (128 - local66) * local92 >> 7;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!p;)V")
	public static void method1560(@OriginalArg(1) Class4_Sub17 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static174.anInt3435; local11++) {
			@Pc(18) int local18 = arg0.method1856();
			@Pc(22) int local22 = arg0.method1837();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static148.aClass53_Sub1Array2[local18] != null) {
				Static148.aClass53_Sub1Array2[local18].anInt1771 = local22;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method1561(@OriginalArg(0) Class98 arg0) {
		if (Static219.aBoolean288) {
			return;
		}
		if (Static178.aBoolean216) {
			Static186.method2967();
		} else {
			Static166.method2619();
		}
		Static222.aClass4_Sub2_Sub1_7 = Static265.method3985(arg0, Static294.anInt4284);
		@Pc(19) int local19 = Static216.anInt4287;
		@Pc(25) int local25 = local19 * 956 / 503;
		Static222.aClass4_Sub2_Sub1_7.method3462((Static111.anInt2450 - local25) / 2, 0, local25, local19);
		Static22.aClass59_1 = Static102.method1651(arg0, Static16.anInt314);
		Static22.aClass59_1.method3790(Static111.anInt2450 / 2 - Static22.aClass59_1.anInt4748 / 2, 18);
		Static219.aBoolean288 = true;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)Z")
	public static boolean method1563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static220.anInt4353; local1++) {
			@Pc(8) Class145 local8 = Static11.aClass145Array1[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt4469 == 1) {
				local17 = local8.anInt4481 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt4477 + (local8.anInt4461 * local17 >> 8);
					local39 = local8.anInt4479 + (local8.anInt4468 * local17 >> 8);
					local49 = local8.anInt4478 + (local8.anInt4458 * local17 >> 8);
					local59 = local8.anInt4470 + (local8.anInt4459 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4469 == 2) {
				local17 = arg0 - local8.anInt4481;
				if (local17 > 0) {
					local29 = local8.anInt4477 + (local8.anInt4461 * local17 >> 8);
					local39 = local8.anInt4479 + (local8.anInt4468 * local17 >> 8);
					local49 = local8.anInt4478 + (local8.anInt4458 * local17 >> 8);
					local59 = local8.anInt4470 + (local8.anInt4459 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4469 == 3) {
				local17 = local8.anInt4477 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt4481 + (local8.anInt4472 * local17 >> 8);
					local39 = local8.anInt4457 + (local8.anInt4460 * local17 >> 8);
					local49 = local8.anInt4478 + (local8.anInt4458 * local17 >> 8);
					local59 = local8.anInt4470 + (local8.anInt4459 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4469 == 4) {
				local17 = arg2 - local8.anInt4477;
				if (local17 > 0) {
					local29 = local8.anInt4481 + (local8.anInt4472 * local17 >> 8);
					local39 = local8.anInt4457 + (local8.anInt4460 * local17 >> 8);
					local49 = local8.anInt4478 + (local8.anInt4458 * local17 >> 8);
					local59 = local8.anInt4470 + (local8.anInt4459 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4469 == 5) {
				local17 = arg1 - local8.anInt4478;
				if (local17 > 0) {
					local29 = local8.anInt4481 + (local8.anInt4472 * local17 >> 8);
					local39 = local8.anInt4457 + (local8.anInt4460 * local17 >> 8);
					local49 = local8.anInt4477 + (local8.anInt4461 * local17 >> 8);
					local59 = local8.anInt4479 + (local8.anInt4468 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
