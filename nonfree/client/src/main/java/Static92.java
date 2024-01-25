import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
	public static int anInt2098 = -1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!ika;)V")
	public static void method1939(@OriginalArg(1) Class3_Sub2 arg0) {
		if (arg0.aByteArray20.length - arg0.anInt2178 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method2048(255);
		if (local20 < 0 || local20 > 1 || arg0.aByteArray20.length - arg0.anInt2178 < 2) {
			return;
		}
		@Pc(52) int local52 = arg0.method2028(-14795);
		if (arg0.aByteArray20.length - arg0.anInt2178 < local52 * 6) {
			return;
		}
		for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
			@Pc(77) int local77 = arg0.method2028(-14795);
			@Pc(81) int local81 = arg0.method2036();
			if (Static227.anIntArray269.length > local77 && Static317.aBooleanArray10[local77] && (Static95.aClass282_1.method6510(local77).aChar7 != '1' || local81 >= -1 && local81 <= 1)) {
				Static227.anIntArray269[local77] = local81;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)I")
	public static int method1941(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = arg0 - 1;
		@Pc(16) int local16 = local10 | local10 >>> 1;
		@Pc(22) int local22 = local16 | local16 >>> 2;
		@Pc(28) int local28 = local22 | local22 >>> 4;
		@Pc(34) int local34 = local28 | local28 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	public static void method1942() {
		Static126.aClass22_3.xa(((float) Static580.aClass3_Sub22_24.aClass21_Sub18_1.method5634() * 0.1F + 0.7F) * Static101.aFloat41);
		Static126.aClass22_3.ZA(Static305.anInt4910, Static183.aFloat59, Static120.aFloat44, (float) (Static717.anInt11159 << 2), (float) (Static214.anInt3521 << 2), (float) (Static544.anInt9947 << 2));
		Static126.aClass22_3.method9333(Static602.aClass113_3);
	}
}
