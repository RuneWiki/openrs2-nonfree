import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static99 {

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array50;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "[B")
	public static byte[] aByteArray72 = new byte[520];

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "Ljava/lang/Object;")
	public static Object anObject35 = new Object();

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "Lclient!v;")
	public static Class76 aClass76_1300 = Static134.method2017("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "Lclient!v;")
	private static Class76 aClass76_1301 = Static134.method2017("Ok");

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "Lclient!v;")
	public static Class76 aClass76_1302 = aClass76_1301;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "Lclient!v;")
	public static Class76 aClass76_1303 = Static134.method2017("hitmarks");

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	public static int anInt2770 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	public static void method1942() {
		aClass76_1303 = null;
		anObject35 = null;
		aClass4_Sub4_Sub5_Sub2Array50 = null;
		aClass76_1300 = null;
		aClass76_1302 = null;
		aClass76_1301 = null;
		aByteArray72 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILclient!la;Z)V")
	public static void method1943(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class17 arg3) {
		Static28.aClass17_6 = arg3;
		Static65.anInt422 = arg0;
		Static20.aBoolean28 = false;
		Static48.anInt1229 = 1;
		Static100.anInt2289 = arg2;
		Static110.anInt2401 = arg1;
		Static55.anInt1458 = 10000;
	}
}
