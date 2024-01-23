import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "[Lclient!pf;")
	public static Interface4[] anInterface4Array3;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	public static int anInt3434;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt3437;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int anInt3439;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Lclient!gk;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public static int anInt3443;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
	public static int anInt3445;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
	public static boolean aBoolean232 = true;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	public static int anInt3442 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!nk;)Z")
	public static boolean method2969(@OriginalArg(1) Class121 arg0) {
		return arg0.method3140(Static209.anInt3974);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
	public static void method2970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg1 + arg5;
		@Pc(15) int local15 = arg0 - arg5;
		@Pc(19) int local19 = arg3 - arg5;
		@Pc(21) int local21;
		for (local21 = arg1; local21 < local10; local21++) {
			Static273.method4257(arg4, Static183.anIntArrayArray26[local21], arg2, arg3);
		}
		for (local21 = arg0; local21 > local15; local21--) {
			Static273.method4257(arg4, Static183.anIntArrayArray26[local21], arg2, arg3);
		}
		@Pc(59) int local59 = arg4 + arg5;
		for (local21 = local10; local21 <= local15; local21++) {
			@Pc(72) int[] local72 = Static183.anIntArrayArray26[local21];
			Static273.method4257(arg4, local72, arg2, local59);
			Static273.method4257(local19, local72, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!wd;Lclient!nk;ILclient!nk;Lclient!nk;)Z")
	public static boolean method2972(@OriginalArg(0) Class1_Sub24_Sub4 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(3) Class121 arg2, @OriginalArg(4) Class121 arg3) {
		Static155.aClass121_75 = arg2;
		Static217.aClass1_Sub24_Sub4_3 = arg0;
		Static11.aClass121_7 = arg3;
		Static166.aClass121_80 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method2975() {
		@Pc(8) Class111 local8 = Static16.aClass111_115;
		synchronized (Static16.aClass111_115) {
			Static255.anInt4623++;
			Static293.anInt5261 = Static96.anInt1957;
			@Pc(22) int local22;
			if (Static221.anInt4095 < 0) {
				for (local22 = 0; local22 < 112; local22++) {
					Static32.aBooleanArray9[local22] = false;
				}
				Static221.anInt4095 = Static46.anInt940;
			} else {
				while (Static221.anInt4095 != Static46.anInt940) {
					local22 = Static80.anIntArray139[Static46.anInt940];
					Static46.anInt940 = Static46.anInt940 + 1 & 0x7F;
					if (local22 >= 0) {
						Static32.aBooleanArray9[local22] = true;
					} else {
						Static32.aBooleanArray9[~local22] = false;
					}
				}
			}
			Static96.anInt1957 = Static24.anInt406;
		}
	}
}
