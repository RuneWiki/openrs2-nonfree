import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "Lclient!ui;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "I")
	public static int anInt2070 = 0;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	public static int anInt2072 = 0;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method1576() {
		if (!Static116.aBoolean188 || Static176.aBoolean290) {
			return;
		}
		@Pc(13) Class8_Sub27[][][] local13 = Static178.aClass8_Sub27ArrayArrayArray1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(27) Class8_Sub27[][] local27 = local13[local15];
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				for (@Pc(35) int local35 = 0; local35 < local27[local29].length; local35++) {
					@Pc(51) Class8_Sub27 local51 = local27[local29][local35];
					if (local51 != null) {
						@Pc(69) Class36_Sub2_Sub1 local69;
						if (local51.aClass120_1 != null && local51.aClass120_1.aClass36_5 instanceof Class36_Sub2_Sub1) {
							local69 = (Class36_Sub2_Sub1) local51.aClass120_1.aClass36_5;
							if ((local51.aClass120_1.aLong127 & Long.MIN_VALUE) == 0L) {
								local69.method3251(false, true, true, false, true, true);
							} else {
								local69.method3251(true, true, true, true, true, true);
							}
						}
						if (local51.aClass141_1 != null) {
							if (local51.aClass141_1.aClass36_8 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass141_1.aClass36_8;
								if ((Long.MIN_VALUE & local51.aClass141_1.aLong166) == 0L) {
									local69.method3251(false, true, true, false, true, true);
								} else {
									local69.method3251(true, true, true, true, true, true);
								}
							}
							if (local51.aClass141_1.aClass36_9 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass141_1.aClass36_9;
								if ((Long.MIN_VALUE & local51.aClass141_1.aLong166) == 0L) {
									local69.method3251(false, true, true, false, true, true);
								} else {
									local69.method3251(true, true, true, true, true, true);
								}
							}
						}
						if (local51.aClass134_1 != null) {
							if (local51.aClass134_1.aClass36_6 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass134_1.aClass36_6;
								if ((Long.MIN_VALUE & local51.aClass134_1.aLong147) == 0L) {
									local69.method3251(false, true, true, false, true, true);
								} else {
									local69.method3251(true, true, true, true, true, true);
								}
							}
							if (local51.aClass134_1.aClass36_7 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass134_1.aClass36_7;
								if ((local51.aClass134_1.aLong147 & Long.MIN_VALUE) == 0L) {
									local69.method3251(false, true, true, false, true, true);
								} else {
									local69.method3251(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(266) int local266 = 0; local266 < local51.anInt4857; local266++) {
							if (local51.aClass170Array3[local266].aClass36_10 instanceof Class36_Sub2_Sub1) {
								@Pc(288) Class36_Sub2_Sub1 local288 = (Class36_Sub2_Sub1) local51.aClass170Array3[local266].aClass36_10;
								if ((local51.aClass170Array3[local266].aLong196 & Long.MIN_VALUE) == 0L) {
									local288.method3251(false, true, true, false, true, true);
								} else {
									local288.method3251(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static176.aBoolean290 = true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static249.anIntArrayArrayArray14[arg0][local16][local20] == -Static258.anInt5165) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static195.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!Static124.method1979(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static124.method1979(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static124.method1979(local16, local156, local182)) {
				return false;
			} else if (Static124.method1979(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static125.method1985(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static124.method1979(local16 + 1, Static195.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local20 + 1) && Static124.method1979(local16 + 128 - 1, Static195.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static124.method1979(local16 + 128 - 1, Static195.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static124.method1979(local16 + 1, Static195.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
	public static int method1585() {
		if (Static58.aFrame2 != null) {
			return 3;
		} else if (Static116.aBoolean188 && Static76.aBoolean116) {
			return 2;
		} else if (Static116.aBoolean188 && !Static76.aBoolean116) {
			return 1;
		} else {
			return 0;
		}
	}
}
