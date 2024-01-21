import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!qe", name = "wb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_103;

	@OriginalMember(owner = "client!qe", name = "Fb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_104;

	@OriginalMember(owner = "client!qe", name = "xb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1150 = Static75.method1216("Enter name:");

	@OriginalMember(owner = "client!qe", name = "ub", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1149 = aClass4_1150;

	@OriginalMember(owner = "client!qe", name = "vb", descriptor = "Lclient!dd;")
	public static Class20 aClass20_10 = new Class20();

	@OriginalMember(owner = "client!qe", name = "yb", descriptor = "I")
	public static int anInt2035 = 10;

	@OriginalMember(owner = "client!qe", name = "zb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1151 = Static75.method1216("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!qe", name = "Ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1152 = Static75.method1216("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!qe", name = "Cb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1153 = Static75.method1216("weiss:");

	@OriginalMember(owner = "client!qe", name = "Db", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1154 = Static75.method1216("leuchten3:");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!rc;I)Z")
	public static boolean method1387(@OriginalArg(0) Class3_Sub1_Sub14 arg0) {
		@Pc(8) int local8 = arg0.anInt2087;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 < 101) {
				local8--;
			} else {
				local8 -= 101;
			}
			Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, Static21.aClass4Array2[local8] }), 29, Static18.aClass4_234, 0, 0, 0);
			Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, Static21.aClass4Array2[local8] }), 20, Static34.aClass4_523, 0, 0, 0);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, arg0.aClass4_1186 }), 61, Static18.aClass4_234, 0, 0, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lclient!je;")
	public static Class7 method1389() {
		try {
			return (Class7) Class.forName("Class7_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class7_Sub1();
		}
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public static void method1390() {
		if (Static85.aClass22_1 == null) {
			return;
		}
		@Pc(9) long local9 = Static82.method1291();
		if (local9 <= Static93.aLong77) {
			return;
		}
		Static85.aClass22_1.method992(local9);
		@Pc(27) int local27 = (int) (local9 - Static93.aLong77);
		Static93.aLong77 = local9;
		@Pc(46) Class local46 = qd.class;
		synchronized (qd.class) {
			Static89.anInt2050 += local27 * Static89.anInt2053;
			@Pc(63) int local63 = (Static89.anInt2050 - Static89.anInt2053 * 2000) / 1000;
			if (local63 > 0) {
				if (Static19.aClass3_Sub3_1 != null) {
					Static19.aClass3_Sub3_1.method1047(local63);
				}
				Static89.anInt2050 -= local63 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
	public static void method1391() {
		aClass4_1150 = null;
		aClass4_1149 = null;
		aClass20_10 = null;
		aClass25_103 = null;
		Class3_Sub1_Sub13.anIntArray263 = null;
		aClass4_1152 = null;
		aClass4_1154 = null;
		aClass4_1153 = null;
		aClass4_1151 = null;
		aClass25_104 = null;
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)I")
	public static int method1394() {
		return Static96.anInt1721++;
	}
}
