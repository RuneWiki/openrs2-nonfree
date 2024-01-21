import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
	public static int anInt2135;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "Lclient!jd;")
	public static Class37 aClass37_29;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_15;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "Lclient!pb;")
	public static Class41 aClass41_51;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "Z")
	public static boolean aBoolean131;

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1352 = Static69.method1153("glow3:");

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1353 = aClass64_1352;

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1354 = Static69.method1153("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "Lclient!o;")
	public static Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!s", name = "qb", descriptor = "J")
	public static long aLong66 = 0L;

	@OriginalMember(owner = "client!s", name = "rb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1355 = Static69.method1153("Mem:");

	@OriginalMember(owner = "client!s", name = "ub", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!s", name = "vb", descriptor = "Lclient!dd;")
	public static Class19 aClass19_78 = new Class19(100);

	@OriginalMember(owner = "client!s", name = "wb", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array15 = new Class64[5];

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "[I")
	public static int[] anIntArray311 = new int[128];

	@OriginalMember(owner = "client!s", name = "zb", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!s", name = "Ab", descriptor = "Lclient!dd;")
	public static Class19 aClass19_79 = new Class19(200);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method1540() {
		anIntArray310 = null;
		aClass37_29 = null;
		aClass64_1354 = null;
		aClass41_Sub1_15 = null;
		aClass54_1 = null;
		aClass41_51 = null;
		aClass64_1353 = null;
		aClass64_1352 = null;
		aClass64Array15 = null;
		aClass19_79 = null;
		aClass19_78 = null;
		anIntArray311 = null;
		aClass64_1355 = null;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public static void method1542() {
		if (Static79.aClass17_1 == null) {
			return;
		}
		Static15.method299();
		if (Static90.anInt560 > 0) {
			Static79.aClass17_1.method2009(256);
			Static90.anInt560 = 0;
		}
		Static79.aClass17_1.method2008();
		Static79.aClass17_1 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!nd;B)Z")
	public static boolean method1543(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		@Pc(8) int local8 = arg0.anInt1709;
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
			Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, Static3.aClass64Array1[local8] }), 0, 9, Static72.aClass64_1031, 0);
			Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, Static3.aClass64Array1[local8] }), 0, 40, Static95.aClass64_1378, 0);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, arg0.aClass64_1064 }), 0, 21, Static72.aClass64_1031, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Z")
	public static boolean method1544(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
