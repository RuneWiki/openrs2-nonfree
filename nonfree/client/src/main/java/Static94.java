import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_23;

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!vc", name = "nb", descriptor = "J")
	public static long aLong150;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!kc;III)V", line = 11)
	public static void method1638(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub12_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1 == arg1 || Class2_Sub6.anInt797 >= 400) {
			return;
		}
		@Pc(44) Class40 local44;
		if (arg1.anInt1373 == 0) {
			local44 = Static72.method1334(new Class40[] { arg1.aClass40_395, Static14.method1260(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378, arg1.anInt1378), Class2.aClass40_731, Static48.method859(arg1.anInt1378), Class56.aClass40_609 });
		} else {
			local44 = Static72.method1334(new Class40[] { arg1.aClass40_395, Class47.aClass40_556, Static48.method859(arg1.anInt1373), Class56.aClass40_609 });
		}
		@Pc(122) int local122;
		if (Class18.anInt1874 == 1) {
			Static20.method402(Static72.method1334(new Class40[] { Class20.aClass40_193, Class2_Sub2_Sub14.aClass40_601, Class2_Sub2_Sub12_Sub1.aClass40_657, local44 }), 25, arg0, arg2, arg3);
		} else if (Class2_Sub2_Sub5.anInt641 != 1) {
			for (local122 = 4; local122 >= 0; local122--) {
				if (Class11.aClass40Array6[local122] != null) {
					@Pc(134) short local134 = 0;
					@Pc(136) int local136 = 0;
					if (Class11.aClass40Array6[local122].method1199(Class64.aClass40_729)) {
						if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378 < arg1.anInt1378) {
							local134 = 2000;
						}
						if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1382 != 0 && arg1.anInt1382 != 0) {
							if (arg1.anInt1382 == Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1382) {
								local134 = 2000;
							} else {
								local134 = 0;
							}
						}
					} else if (Class2_Sub2.aBooleanArray41[local122]) {
						local134 = 2000;
					}
					if (local122 == 0) {
						local136 = local134 + 15;
					}
					if (local122 == 1) {
						local136 = local134 + 30;
					}
					if (local122 == 2) {
						local136 = local134 + 43;
					}
					if (local122 == 3) {
						local136 = local134 + 38;
					}
					if (local122 == 4) {
						local136 = local134 + 33;
					}
					Static20.method402(Static72.method1334(new Class40[] { Class11.aClass40Array6[local122], Class5_Sub1.aClass40_30, local44 }), local136, arg0, arg2, arg3);
				}
			}
		} else if ((Static78.anInt2027 & 0x8) == 8) {
			Static20.method402(Static72.method1334(new Class40[] { Class51.aClass40_567, Class5_Sub1.aClass40_30, local44 }), 36, arg0, arg2, arg3);
		}
		for (local122 = 0; local122 < Class2_Sub6.anInt797; local122++) {
			if (Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[local122] == 24) {
				Class15.aClass40Array8[local122] = Static72.method1334(new Class40[] { Class42.aClass40_526, local44 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V", line = 297)
	public static void method1643() {
		Class2_Sub2_Sub16.anIntArray546 = null;
		Class2_Sub2_Sub16.aClass40_713 = null;
		Class2_Sub2_Sub16.aClass40_708 = null;
		Class2_Sub2_Sub16.aClass40_712 = null;
		anIntArray544 = null;
		Class2_Sub2_Sub16.aClass40_709 = null;
		Class2_Sub2_Sub16.aClass40_711 = null;
		aClass2_Sub2_Sub2_Sub3_23 = null;
		Class2_Sub2_Sub16.aClass40_710 = null;
		Class2_Sub2_Sub16.aCRC32_2 = null;
		Class2_Sub2_Sub16.anIntArray545 = null;
	}
}
