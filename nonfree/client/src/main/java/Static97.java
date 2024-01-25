import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public static int anInt2233 = -1;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public static int anInt2234 = -1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method2120() {
		while (true) {
			if (Static30.aClass3_Sub3_Sub2_1.method4272(Static272.anInt4948) >= 15) {
				@Pc(16) int local16 = Static30.aClass3_Sub3_Sub2_1.method4276(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class3_Sub28 local30 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local16);
					@Pc(36) Class4_Sub1_Sub2_Sub1_Sub1 local36;
					if (local30 == null) {
						local36 = new Class4_Sub1_Sub2_Sub1_Sub1();
						local36.anInt5759 = local16;
						local30 = new Class3_Sub28(local36);
						Static551.aClass280_43.method7109(local30, (long) local16);
						local23 = true;
						Static28.aClass3_Sub28Array1[Static294.anInt5193++] = local30;
					}
					local36 = local30.aClass4_Sub1_Sub2_Sub1_Sub1_2;
					Static520.anIntArray594[Static94.anInt2209++] = local16;
					local36.anInt5721 = Static590.anInt9681;
					if (local36.aClass109_1 != null && local36.aClass109_1.method2811()) {
						Static325.method5300(local36);
					}
					@Pc(90) int local90 = Static30.aClass3_Sub3_Sub2_1.method4276(1);
					if (local90 == 1) {
						Static131.anIntArray128[Static605.anInt9850++] = local16;
					}
					@Pc(108) int local108 = Static30.aClass3_Sub3_Sub2_1.method4276(5);
					if (local108 > 15) {
						local108 -= 32;
					}
					@Pc(119) int local119 = Static30.aClass3_Sub3_Sub2_1.method4276(1);
					@Pc(124) int local124 = Static30.aClass3_Sub3_Sub2_1.method4276(5);
					if (local124 > 15) {
						local124 -= 32;
					}
					@Pc(133) int local133 = Static30.aClass3_Sub3_Sub2_1.method4276(2);
					@Pc(144) int local144 = (Static30.aClass3_Sub3_Sub2_1.method4276(3) + 4 & 0x94600007) << 11;
					local36.method3334(Static547.aClass177_2.method4471(Static30.aClass3_Sub3_Sub2_1.method4276(14)));
					local36.method5072(local36.aClass109_1.anInt3032);
					local36.anInt5739 = local36.aClass109_1.anInt3036 << 3;
					if (local23) {
						local36.method5067(local144, true);
					}
					local36.method3336(local108 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0], local133, local124 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0], local36.method5059(), local119 == 1);
					if (local36.aClass109_1.method2811()) {
						Static380.method6113(local36.anIntArray309[0], local36, local36.anIntArray310[0], null, null, local36.aByte123, 0);
					}
					continue;
				}
			}
			Static30.aClass3_Sub3_Sub2_1.method4278();
			return;
		}
	}
}
