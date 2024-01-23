import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt1955;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt1962;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "[S")
	public static short[] aShortArray44;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "Lclient!rk;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
	public static int anInt1963;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!lh;")
	public static Class1_Sub11_Sub1 aClass1_Sub11_Sub1_1 = new Class1_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "[Lclient!la;")
	public static Class92[] aClass92Array1 = new Class92[4];

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "[I")
	public static int[] anIntArray180 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "F")
	public static float aFloat10 = 0.0F;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	public static void method1529() {
		@Pc(7) int local7 = Static67.method1221();
		if (local7 == 0) {
			Static35.aByteArrayArrayArray12 = null;
			Static3.method141(0);
		} else if (local7 == 1) {
			Static193.method3191((byte) 0);
			Static3.method141(512);
			if (Static260.aByteArrayArrayArray25 != null) {
				Static172.method2934();
			}
		} else {
			Static193.method3191((byte) (Static279.anInt5382 - 4 & 0xFF));
			Static3.method141(2);
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
	public static void method1530() {
		Static201.aClass135_22.method3320(5);
		Static47.aClass135_1.method3320(5);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method1532() {
		Static71.aClass135_5.method3317();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1533(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public static void method1534() {
		Static113.anInt2602 = -3;
		Static243.anInt4820 = 0;
		Static23.aBoolean38 = false;
		Static256.anInt5016 = 0;
		Static218.anInt4313 = 0;
		Static69.anInt1506 = 1;
		Static149.anInt3220 = -1;
	}
}
