import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!kf;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_1413 = Static72.method1077("Okay");

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1414 = Static72.method1077("@red@");

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!oe;")
	public static Class58 aClass58_53 = new Class58(512);

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
	public static int anInt2115 = -1;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
	public static int anInt2117 = 0;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Lclient!u;")
	private static Class74 aClass74_1417 = Static72.method1077("flash2:");

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Lclient!u;")
	public static Class74 aClass74_1416 = aClass74_1417;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_1418 = aClass74_1417;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
	public static int anInt2118 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
	public static int[] anIntArray309 = new int[5];

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Z")
	public static boolean method1468(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method1469() {
		Static63.aClass16_52.method485();
		Static95.aClass16_74.method485();
		Static49.aClass16_39.method485();
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public static void method1470() {
		aClass22_2 = null;
		aBooleanArray9 = null;
		aClass74_1414 = null;
		aClass74_1418 = null;
		aClass58_53 = null;
		aClass74_1416 = null;
		anIntArray309 = null;
		aClass74_1417 = null;
		aClass74_1413 = null;
	}
}
