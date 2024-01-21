import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array10;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_12;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Lclient!he;")
	private static Class26 aClass26_1288 = Static6.method100("glow3:");

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!he;")
	public static Class26 aClass26_1285 = aClass26_1288;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_1286 = Static6.method100("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!he;")
	private static Class26 aClass26_1291 = Static6.method100(" has logged out)3");

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1287 = aClass26_1291;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_1289 = Static6.method100("Konfig geladen)3");

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1290 = Static6.method100("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1292 = aClass26_1288;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	public static int anInt2466 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!nc;I)I")
	public static int method1641(@OriginalArg(0) Class3_Sub14 arg0) {
		@Pc(13) Class3_Sub16 local13 = (Class3_Sub16) Static105.aClass17_19.method599(((long) arg0.anInt2154 << 32) + (long) arg0.anInt2150);
		return local13 == null ? arg0.anInt2199 : local13.anInt2511;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Lclient!nc;")
	public static Class3_Sub14 method1642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub14 local7 = Static100.method2212(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass3_Sub14Array2 == null || local7.aClass3_Sub14Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass3_Sub14Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1643() {
		aClass16_Sub1_12 = null;
		aClass26_1292 = null;
		aClass26_1290 = null;
		aClass3_Sub1_Sub4_Sub3Array10 = null;
		aClass26_1287 = null;
		aClass26_1286 = null;
		aClass26_1288 = null;
		aClass26_1285 = null;
		aClass26_1289 = null;
		aClass26_1291 = null;
	}
}
