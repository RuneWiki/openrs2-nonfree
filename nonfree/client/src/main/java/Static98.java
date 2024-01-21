import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_18;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
	public static int anInt2773;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1496 = Static80.method1463(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1497 = Static80.method1463(" from your ignore list first");

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1498 = Static80.method1463("(Y ");

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1499 = aClass63_1497;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1500 = Static80.method1463("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
	public static int anInt2755 = 0;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1501 = Static80.method1463("mapscene");

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "[I")
	public static int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1502 = Static80.method1463("Von:");

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1503 = Static80.method1463("backvmid3");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!dc;)V")
	public static void method1797(@OriginalArg(1) Class6_Sub3_Sub1_Sub2 arg0) {
		arg0.anInt2302 = 0;
		if (arg0.anInt2316 == 0) {
			arg0.anInt2309 = 1024;
		}
		if (arg0.anInt2316 == 1) {
			arg0.anInt2309 = 1536;
		}
		@Pc(29) int local29 = arg0.anInt2331 - Static73.anInt2064;
		@Pc(40) int local40 = arg0.anInt2340 * 128 + arg0.anInt2296 * 64;
		if (arg0.anInt2316 == 2) {
			arg0.anInt2309 = 0;
		}
		@Pc(58) int local58 = arg0.anInt2294 * 128 + arg0.anInt2296 * 64;
		arg0.anInt2347 += (local58 - arg0.anInt2347) / local29;
		if (arg0.anInt2316 == 3) {
			arg0.anInt2309 = 512;
		}
		arg0.anInt2319 += (local40 - arg0.anInt2319) / local29;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Z")
	public static boolean method1812(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V")
	public static void method1816() {
		Static124.aClass29_26.method1431();
		Static76.aClass6_Sub3_Sub3_Sub3Array5[Static65.aBoolean101 ? 1 : 0].method1768(Static124.aClass29_26.anInt2115 - 40, Static124.aClass29_26.anInt2116 + -40);
		Static92.aBoolean135 = true;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
	public static void method1825() {
		Static74.aClass49_21.method1389();
		Static51.aClass49_15.method1389();
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)V")
	public static void method1828() {
		aClass7_Sub1_18 = null;
		aClass63_1498 = null;
		aByteArrayArray8 = null;
		anIntArray294 = null;
		aClass63_1499 = null;
		aClass63_1496 = null;
		aClass63_1500 = null;
		aClass63_1501 = null;
		aClass63_1503 = null;
		aClass63_1497 = null;
		aClass63_1502 = null;
	}
}
