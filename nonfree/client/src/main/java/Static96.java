import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!le", name = "Jb", descriptor = "I")
	public static int anInt2436;

	@OriginalMember(owner = "client!le", name = "Ib", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1416 = Static107.method1838("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!le", name = "Kb", descriptor = "[I")
	public static int[] anIntArray229 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!le", name = "Rb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1417 = Static107.method1838("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!le", name = "Tb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1418 = Static107.method1838("<col=ff7000>");

	@OriginalMember(owner = "client!le", name = "Ub", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!le", name = "Xb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1419 = Static107.method1838("Take");

	@OriginalMember(owner = "client!le", name = "Yb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1420 = aClass28_1417;

	@OriginalMember(owner = "client!le", name = "Zb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1421 = aClass28_1419;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "(I)V")
	public static void method1712() {
		aClass28_1418 = null;
		aClass28_1416 = null;
		aClass28_1417 = null;
		anIntArray229 = null;
		aClass28_1419 = null;
		aClass28_1420 = null;
		aClass28_1421 = null;
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(Z)V")
	public static void method1715() {
		@Pc(1) Object local1 = Static165.anObject3;
		synchronized (Static165.anObject3) {
			if (Static170.anInt4050 != 0) {
				Static170.anInt4050 = 1;
				try {
					Static165.anObject3.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "t", descriptor = "(I)V")
	public static void method1718() {
		for (@Pc(3) int local3 = 0; local3 < Static83.anInt2114; local3++) {
			@Pc(9) int local9 = Static3.anIntArray228[local3];
			@Pc(13) Class2_Sub4_Sub1_Sub1_Sub2 local13 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = Static151.aClass2_Sub2_Sub1_3.method1698();
			if ((local17 & 0x80) != 0) {
				local17 += Static151.aClass2_Sub2_Sub1_3.method1698() << 8;
			}
			Static137.method2147(local9, local13, local17);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZIIILclient!jc;)V")
	public static void method1719(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class40 arg3) {
		Static90.anInt2314 = arg0;
		Static108.anInt2633 = 2;
		Static94.anInt2360 = arg2;
		Static43.anInt1114 = 1;
		Static84.aBoolean104 = false;
		Static135.anInt3102 = arg1;
		Static49.aClass40_14 = arg3;
	}
}
