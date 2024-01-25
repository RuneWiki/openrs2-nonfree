import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_26 = new Class142("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_65 = new Class67(9, 14);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static248.anInt4433++;
		Static97.anInt1300 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static193.anInt3335; local7 < Static112.anInt1710; local7++) {
			@Pc(12) Class216[][] local12 = Static259.aClass216ArrayArrayArray3[local7];
			for (local14 = Static61.anInt7290; local14 < Static9.anInt163; local14++) {
				for (@Pc(17) int local17 = Static260.anInt4567; local17 < Static267.anInt4664; local17++) {
					@Pc(24) Class216 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static84.aBooleanArrayArray3[local14 + Static99.anInt1331 - Static166.anInt2722][local17 + Static99.anInt1331 - Static44.anInt638] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean508 = true;
							local24.aBoolean507 = true;
							if (local24.aClass259_1 == null) {
								local24.aBoolean509 = false;
							} else {
								local24.aBoolean509 = true;
							}
							Static97.anInt1300++;
						} else {
							local24.aBoolean508 = false;
							local24.aBoolean507 = false;
							local24.aByte80 = 0;
							if (local14 >= Static166.anInt2722 - 16 && local14 <= Static166.anInt2722 + 16 && local17 >= Static44.anInt638 - 16 && local17 <= Static44.anInt638 + 16 && (local24.aClass11_Sub3_3 != null || local24.aClass11_Sub3_2 != null || local24.aClass11_Sub4_2 != null || local24.aClass11_Sub4_1 != null || local24.aClass11_Sub2_2 != null || local24.aClass259_1 != null)) {
								Static352.aClass12_1.method4086(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static397.aClass139Array2 == Static452.aClass139Array3;
		for (local14 = Static193.anInt3335; local14 < Static112.anInt1710; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static335.aClass117_6.method5689() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static84.aBooleanArrayArray3.length;
				if (Static61.anInt7290 + Static84.aBooleanArrayArray3.length > Static174.anInt2873) {
					local172 -= Static61.anInt7290 + Static84.aBooleanArrayArray3.length - Static174.anInt2873;
				}
				@Pc(192) int local192 = Static84.aBooleanArrayArray3[0].length;
				if (Static260.anInt4567 + Static84.aBooleanArrayArray3[0].length > Static325.anInt5351) {
					local192 -= Static260.anInt4567 + Static84.aBooleanArrayArray3[0].length - Static325.anInt5351;
				}
				@Pc(213) int local213 = Static81.anInt1126;
				while (true) {
					if (local213 >= local172) {
						Static352.aClass12_1.method4087(true, Static452.aClass139Array3[local14], local161, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static61.anInt7290 - Static81.anInt1126;
					for (@Pc(222) int local222 = Static14.anInt248; local222 < local192; local222++) {
						Static81.aBooleanArrayArray2[local213][local222] = false;
						if (Static84.aBooleanArrayArray3[local213][local222]) {
							@Pc(241) int local241 = local222 + Static260.anInt4567 - Static14.anInt248;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static259.aClass216ArrayArrayArray3[local243][local220][local241] != null && Static259.aClass216ArrayArrayArray3[local243][local220][local241].aByte79 == local14) {
									Static81.aBooleanArrayArray2[local213][local222] = Static259.aClass216ArrayArrayArray3[local243][local220][local241].aBoolean508;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static352.aClass12_1.method4087(false, Static452.aClass139Array3[local14], local161, local14);
			}
			Static352.aClass12_1.method4085();
		}
		if (!Static161.method2121(true)) {
			Static161.method2121(false);
		}
	}
}
