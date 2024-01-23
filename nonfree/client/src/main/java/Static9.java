import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!ed;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "Lclient!qh;")
	public static Class93 aClass93_9;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_86 = Static186.method3527(")3runescape)3com");

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_87 = Static186.method3527(")1 ");

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_88 = Static186.method3527("Freie Welt");

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	public static int anInt193 = 2;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "[I")
	public static int[] anIntArray21 = new int[500];

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_89 = Static186.method3527("blaugr-Un:");

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!pa;IB)Lclient!ne;")
	public static Class78 method151(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		return Static116.method1858(arg1, arg0) ? Static206.method3253() : null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public static void method153() {
		for (@Pc(6) Class1_Sub16 local6 = (Class1_Sub16) Static198.aClass75_20.method2239(); local6 != null; local6 = (Class1_Sub16) Static198.aClass75_20.method2238()) {
			if (local6.aBoolean84) {
				local6.method1466();
			}
		}
		for (@Pc(28) Class1_Sub16 local28 = (Class1_Sub16) Static158.aClass75_17.method2239(); local28 != null; local28 = (Class1_Sub16) Static158.aClass75_17.method2238()) {
			if (local28.aBoolean84) {
				local28.method1466();
			}
		}
	}
}
