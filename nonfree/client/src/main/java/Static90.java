import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!eq;")
	public static Class97 aClass97_20;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
	public static int anInt1824 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I")
	public static int method1584(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIIII)V")
	public static void method1586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static496.anInt8422;
		@Pc(7) int local7 = Static212.anInt4408;
		if (Static558.aBoolean680) {
			local5 += Static257.method4233();
			local7 += Static290.method4545();
		}
		@Pc(28) Class20 local28;
		if (Static419.anInt7641 == 1) {
			local28 = Static268.aClass20Array7[Static76.anInt1679 / 100];
			local28.method4582(local5 - 8, local7 + -8);
			Static233.method3884(local28.method4576() + local7 - 8, local7 + -8, local5 - 8, local28.method4588() + local5 + -8);
		}
		if (Static419.anInt7641 == 2) {
			local28 = Static268.aClass20Array7[Static76.anInt1679 / 100 + 4];
			local28.method4582(local5 - 8, local7 - 8);
			Static233.method3884(local28.method4576() + local7 - 8, local7 + -8, local5 - 8, local5 - 8 - -local28.method4588());
		}
		Static592.method8163();
	}
}
