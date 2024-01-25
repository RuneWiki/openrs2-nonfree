import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_21 = new Class194(73, -1);

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([[BLclient!ks;I)V")
	public static void method1266(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class113_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt3751; local18++) {
			Static341.method4427();
			for (@Pc(24) int local24 = 0; local24 < Static433.anInt7210 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static418.anInt6969 >> 3; local28++) {
					@Pc(38) int local38 = Static403.anIntArrayArrayArray16[local18][local24][local28];
					if (local38 != -1) {
						@Pc(48) int local48 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean242 || local48 == 0) {
							@Pc(59) int local59 = local38 >> 1 & 0x3;
							@Pc(65) int local65 = local38 >> 14 & 0x3FF;
							@Pc(71) int local71 = local38 >> 3 & 0x7FF;
							@Pc(82) int local82 = (local65 / 8 << 8) + (local71 / 8);
							for (@Pc(84) int local84 = 0; local84 < Static362.anIntArray418.length; local84++) {
								if (local82 == Static362.anIntArray418[local84] && arg0[local84] != null) {
									@Pc(102) Class5_Sub15 local102 = new Class5_Sub15(arg0[local84]);
									arg1.method2974(local71, local48, local28 * 8, local24 * 8, Static163.aClass240Array1, local102, local65, local59, local18);
									arg1.method2985(local24 * 8, local48, local16[0] == -1 ? local16 : null, local59, local65, Static407.aClass200_9, local28 * 8, local18, local71, local102);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static51.aClass207_1 = Static42.aClass235_1.method5351(Static420.aClass175_2, local16[3], local16[1], local16[2], local16[0]);
			Static293.anInt4611 = local16[4];
		}
	}
}
