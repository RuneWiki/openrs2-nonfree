import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static94 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_98;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1220 = Static87.method1648("mapback");

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt2552 = 0;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!fc;")
	public static Class21 aClass21_30 = new Class21(200);

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1222 = Static87.method1648("Login");

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1221 = aClass27_1222;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1223 = Static87.method1648("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt2554 = 0;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1224 = Static87.method1648("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method1753() {
		aClass27_1221 = null;
		aClass27_1223 = null;
		aClass27_1224 = null;
		aClass21_30 = null;
		aClass27_1220 = null;
		aClass3_Sub3_Sub2_Sub4_98 = null;
		aClass27_1222 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZI[B)V")
	public static void method1754(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static88.aClass5_1 == null) {
			return;
		}
		if (Static39.anInt988 >= 0) {
			Static88.aClass5_1.method1231();
			Static15.anInt297 = 20;
			Static78.anInt2155 = 0;
			Static39.anInt988 = -1;
			Static22.aByteArray7 = null;
		}
		if (arg2 == null) {
			return;
		}
		if (Static15.anInt297 > 0) {
			Static88.aClass5_1.method1233(arg1);
			Static15.anInt297 = 0;
		}
		Static39.anInt988 = arg1;
		Static88.aClass5_1.method1234(arg0, arg1, arg2);
	}
}
