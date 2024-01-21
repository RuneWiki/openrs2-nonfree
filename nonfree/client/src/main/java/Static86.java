import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!ie;")
	public static Class35 aClass35_23;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean121 = true;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!id;")
	public static Class34 aClass34_1124 = Static9.method266("leuchten3:");

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1125 = Static9.method266("null");

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!id;")
	private static Class34 aClass34_1126 = Static9.method266("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
	public static int[] anIntArray295 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_1127 = aClass34_1126;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1462() {
		for (@Pc(17) Class1_Sub1_Sub1_Sub3 local17 = (Class1_Sub1_Sub1_Sub3) Static24.aClass38_7.method1034(); local17 != null; local17 = (Class1_Sub1_Sub1_Sub3) Static24.aClass38_7.method1038()) {
			if (Static42.anInt1208 != local17.anInt1936 || local17.anInt1946 < Static73.anInt1947) {
				local17.method2039();
			} else if (local17.anInt1943 <= Static73.anInt1947) {
				if (local17.anInt1942 > 0) {
					@Pc(49) Class1_Sub1_Sub1_Sub1_Sub2 local49 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local17.anInt1942 - 1];
					if (local49 != null && local49.anInt1428 >= 0 && local49.anInt1428 < 13312 && local49.anInt1405 >= 0 && local49.anInt1405 < 13312) {
						local17.method1290(local49.anInt1405, Static45.method1845(local17.anInt1936, local49.anInt1405, local49.anInt1428) - local17.anInt1926, Static73.anInt1947, local49.anInt1428);
					}
				}
				if (local17.anInt1942 < 0) {
					@Pc(101) int local101 = -local17.anInt1942 - 1;
					@Pc(106) Class1_Sub1_Sub1_Sub1_Sub1 local106;
					if (Static119.anInt2838 == local101) {
						local106 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1;
					} else {
						local106 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local101];
					}
					if (local106 != null && local106.anInt1428 >= 0 && local106.anInt1428 < 13312 && local106.anInt1405 >= 0 && local106.anInt1405 < 13312) {
						local17.method1290(local106.anInt1405, Static45.method1845(local17.anInt1936, local106.anInt1405, local106.anInt1428) - local17.anInt1926, Static73.anInt1947, local106.anInt1428);
					}
				}
				local17.method1289(Static67.anInt1767);
				Static39.aClass44_1.method1150(Static42.anInt1208, (int) local17.aDouble6, (int) local17.aDouble2, (int) local17.aDouble3, 60, local17, local17.anInt1935, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1463() {
		aClass34_1126 = null;
		aClass34_1127 = null;
		aClass34_1125 = null;
		aClass34_1124 = null;
		anIntArray295 = null;
		aClass35_23 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z")
	public static boolean method1464(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!ie;)V")
	public static void method1465(@OriginalArg(1) Class35 arg0) {
		Static62.aClass35_14 = arg0;
	}
}
