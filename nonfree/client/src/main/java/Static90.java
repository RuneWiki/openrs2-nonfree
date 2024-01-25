import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static90 {

	@OriginalMember(owner = "client!fk", name = "W", descriptor = "[[I")
	public static int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!fk", name = "X", descriptor = "Lclient!tj;")
	public static Class193 aClass193_33;

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
	public static int anInt2481 = -1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZBII)V")
	public static void method2188(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static58.method1235(arg3, arg1, Static77.aClass10_Sub1Array1.length - 1, 0, arg0, arg2);
		Static223.aClass4_Sub35_1 = null;
		Static340.anInt6521 = 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!vq;Lclient!tj;)V")
	public static void method2190(@OriginalArg(1) Class47 arg0, @OriginalArg(2) Class193 arg1) {
		if (Static86.aBoolean171) {
			return;
		}
		arg0.method2728(0);
		Static22.aClass58_3 = arg0.method2677(Static362.method3090(arg1, Static340.anInt6522));
		Static22.aClass58_3.method4269((Static24.anInt496 - Static22.aClass58_3.method4282()) / 2, (Static23.anInt465 - Static22.aClass58_3.method4286()) / 2);
		Static220.aClass58_46 = arg0.method2677(Static362.method3090(arg1, Static271.anInt5402));
		Static220.aClass58_46.method4269((Static24.anInt496 - Static220.aClass58_46.method4282()) / 2, 18);
		Static86.aBoolean171 = true;
	}
}
