import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "Z")
	public static boolean aBoolean120;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([[BILclient!ft;)V")
	public static void method1406(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt2142; local14++) {
			Static150.method2112();
			for (@Pc(22) int local22 = 0; local22 < Static337.anInt5497 >> 3; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static282.anInt4644 >> 3; local26++) {
					@Pc(30) boolean local30 = false;
					@Pc(38) int local38 = Static184.anIntArrayArrayArray3[local14][local22][local26];
					if (local38 != -1) {
						@Pc(48) int local48 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean148 || local48 == 0) {
							@Pc(59) int local59 = local38 >> 1 & 0x3;
							@Pc(65) int local65 = local38 >> 14 & 0x3FF;
							@Pc(71) int local71 = local38 >> 3 & 0x7FF;
							@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
							for (@Pc(83) int local83 = 0; local83 < Static91.anIntArray131.length; local83++) {
								if (local81 == Static91.anIntArray131[local83] && arg0[local83] != null) {
									@Pc(101) Class4_Sub9 local101 = new Class4_Sub9(arg0[local83]);
									arg1.method1706(local22 * 8, local14, local101, local71, local26 * 8, local65, local48, local59, Static409.aClass128Array1);
									local30 = true;
									arg1.method1719(local65, local101, local48, local59, local12[0] == -1 ? local12 : null, local71, local22 * 8, Static39.aClass135_1, local26 * 8, local14);
									break;
								}
							}
						}
					}
					if (!local30) {
						arg1.method1705(local22 * 8, local26 * 8, 8, 8, local14);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static113.aClass209_1 = Static344.aClass263_1.method5912(local12[2], local12[1], local12[3], Static28.aClass129_3, local12[0]);
			Static412.anInt6984 = local12[4];
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
	public static void method1407() {
		Static351.anInt5841 = 0;
		Static41.aClass244_2.method5264();
		Static41.aClass244_2.method5273(Static446.aClass4_Sub30_2);
		Static351.anInt5841++;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Ljava/lang/String;")
	public static String method1409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
