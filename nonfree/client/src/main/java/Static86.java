import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "Lclient!f;")
	public static Class38 aClass38_8;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "[Lclient!ut;")
	public static Class344[] aClass344Array1;

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "Lclient!f;")
	public static Class38 aClass38_9;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZII)Z")
	public static boolean method1272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)Z")
	public static boolean method1273(@OriginalArg(0) int arg0) {
		Static240.anInt9588 = arg0 + 1 & 0xFFFF;
		Static53.aBoolean782 = true;
		return true;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIBII)V")
	public static void method1275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static257.aClass2_Sub35_Sub1_1.anInt7505 != 0 && arg4 != 0 && Static276.anInt4784 < 50 && arg1 != -1) {
			Static537.aClass67Array1[Static276.anInt4784++] = new Class67((byte) 1, arg1, arg4, arg3, arg0, 0, arg2, null);
		}
	}
}
