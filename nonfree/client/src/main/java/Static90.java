import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "Lclient!pj;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public static int anInt2326;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
	public static int anInt2328;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!hf;[[BB)V")
	public static void method2165(@OriginalArg(0) Class118_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt3843; local13++) {
			Static443.method6413();
			for (@Pc(18) int local18 = 0; local18 < Static542.anInt9387 >> 3; local18++) {
				for (@Pc(21) int local21 = 0; local21 < Static36.anInt1324 >> 3; local21++) {
					@Pc(30) int local30 = Static131.anIntArrayArrayArray3[local13][local18][local21];
					if (local30 != -1) {
						@Pc(39) int local39 = local30 >> 24 & 0x3;
						if (!arg0.aBoolean242 || local39 == 0) {
							@Pc(53) int local53 = local30 >> 1 & 0x3;
							@Pc(59) int local59 = local30 >> 14 & 0x3FF;
							@Pc(65) int local65 = local30 >> 3 & 0x7FF;
							@Pc(76) int local76 = (local59 / 8 << 8) + (local65 / 8);
							for (@Pc(78) int local78 = 0; local78 < Static85.anIntArray178.length; local78++) {
								if (Static85.anIntArray178[local78] == local76 && arg1[local78] != null) {
									arg0.method3446(local21 * 8, (local65 & 0x7) * 8, local18 * 8, Static70.aClass299Array1, local53, (local59 & 0x7) * 8, Static478.aClass9_10, local39, local13, arg1[local78]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z")
	public static boolean method2166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static400.method6038(arg0, arg1) | Static477.method6910(arg0, arg1) | Static116.method2634(arg1, arg0)) & Static44.method1398(arg0, arg1);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
	public static void method2167(@OriginalArg(0) int arg0) {
		Static30.anInt1206 = arg0;
		@Pc(7) Class316 local7 = Static140.aClass316_16;
		synchronized (Static140.aClass316_16) {
			Static140.aClass316_16.method7794();
		}
		local7 = Static505.aClass316_61;
		synchronized (Static505.aClass316_61) {
			Static505.aClass316_61.method7794();
		}
	}
}
