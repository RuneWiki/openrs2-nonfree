import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!dda", name = "o", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIBI)V")
	public static void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static240.anInt4543;
		@Pc(7) int local7 = Static523.anInt5721;
		if (Static649.aBoolean735) {
			local5 += Static359.method5380();
			local7 += Static265.method7952();
		}
		@Pc(33) Class102 local33;
		if (Static405.anInt6914 == 1) {
			local33 = Static55.aClass102Array4[Static426.anInt7218 / 100];
			local33.method6961(local5 - 8, local7 - 8);
			Static120.method2177(local5 - 8, local5 + -8 + local33.method6951(), local7 - 8, local7 + -8 + local33.method6958());
		}
		if (Static405.anInt6914 == 2) {
			local33 = Static55.aClass102Array4[Static426.anInt7218 / 100 + 4];
			local33.method6961(local5 - 8, local7 + -8);
			Static120.method2177(local5 - 8, local33.method6951() + local5 - 8, local7 - 8, local7 - 8 - -local33.method6958());
		}
		Static435.method6379();
	}

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(B)V")
	public static void method1957() {
		if (Static499.aClass231_4.aBoolean482 && Static429.aClass161_5.anInt4423 != -1) {
			Static447.method6464(Static429.aClass161_5.aString54, Static429.aClass161_5.anInt4423);
		}
	}
}
