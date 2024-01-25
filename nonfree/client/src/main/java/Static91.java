import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!cw", name = "J", descriptor = "[Lclient!haa;")
	public static Class4_Sub3[] aClass4_Sub3Array1;

	@OriginalMember(owner = "client!cw", name = "L", descriptor = "I")
	public static int anInt1594;

	@OriginalMember(owner = "client!cw", name = "M", descriptor = "I")
	public static int anInt1595;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLclient!paa;[[B)V")
	public static void method1528(@OriginalArg(1) Class49_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt7594; local11++) {
			Static599.method8480();
			for (@Pc(19) int local19 = 0; local19 < Static380.anInt6689 >> 3; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static542.anInt9214 >> 3; local23++) {
					@Pc(33) int local33 = Static646.anIntArrayArrayArray20[local11][local19][local23];
					if (local33 != -1) {
						@Pc(43) int local43 = local33 >> 24 & 0x3;
						if (!arg0.aBoolean534 || local43 == 0) {
							@Pc(56) int local56 = local33 >> 1 & 0x3;
							@Pc(62) int local62 = local33 >> 14 & 0x3FF;
							@Pc(68) int local68 = local33 >> 3 & 0x7FF;
							@Pc(78) int local78 = local68 / 8 + (local62 / 8 << 8);
							for (@Pc(80) int local80 = 0; local80 < Static365.anIntArray336.length; local80++) {
								if (local78 == Static365.anIntArray336[local80] && arg1[local80] != null) {
									arg0.method6733((local68 & 0x7) * 8, local19 * 8, Static103.aClass144_3, local23 * 8, local43, arg1[local80], local56, local11, (local62 & 0x7) * 8, Static40.aClass289Array1);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
