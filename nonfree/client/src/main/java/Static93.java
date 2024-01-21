import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_69;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2 aClass1_Sub2_Sub8_Sub2_2;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
	public static int[] anIntArray180;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array13 = new Class24[1000];

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_638 = Static81.method1507("Hidden");

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!dj;")
	public static Class24 aClass24_635 = aClass24_638;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_636 = Static81.method1507("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_637 = Static81.method1507("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public static int anInt2158 = 0;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!dj;")
	public static Class24 aClass24_639 = null;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public static void method1677() {
		if (!Static158.aBoolean163) {
			return;
		}
		Static63.anIntArray139 = null;
		aClass1_Sub2_Sub8_Sub2_2 = null;
		Static68.aClass1_Sub2_Sub8_Sub2Array9 = null;
		Static185.aClass1_Sub2_Sub8_Sub3_7 = null;
		Static172.aClass1_Sub2_Sub8_Sub2_4 = null;
		Static96.aClass1_Sub2_Sub8_Sub3Array11 = null;
		Static85.anIntArray286 = null;
		Static145.anIntArray272 = null;
		Static133.anIntArray242 = null;
		Static94.aClass1_Sub2_Sub8_Sub2_3 = null;
		Static57.aClass1_Sub2_Sub8_Sub3_1 = null;
		Static64.aClass1_Sub2_Sub8_Sub2_1 = null;
		Static132.anIntArray241 = null;
		Static183.aClass1_Sub2_Sub8_Sub3_6 = null;
		Static73.aClass1_Sub2_Sub8_Sub3_2 = null;
		Static77.anIntArray160 = null;
		Static79.aClass1_Sub2_Sub8_Sub2Array10 = null;
		Static65.aClass1_Sub2_Sub8_Sub2Array8 = null;
		Static193.aClass1_Sub2_Sub8_Sub2Array11 = null;
		Static158.anIntArray298 = null;
		Static48.aClass1_Sub2_Sub8_Sub2Array5 = null;
		Static52.anIntArray114 = null;
		Static122.method2067();
		Static151.method2594(true);
		Static158.aBoolean163 = false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
	public static int method1678(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBII)V")
	public static void method1679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg3) {
			Static105.method1829(arg0, arg2, arg1, arg4);
		} else if (arg1 - arg0 >= Static63.anInt1608 && Static63.anInt1595 >= arg0 + arg1 && arg2 - arg3 >= Static13.anInt308 && Static52.anInt1338 >= arg2 + arg3) {
			Static122.method2068(arg0, arg1, arg4, arg3, arg2);
		} else {
			Static48.method884(arg4, arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ld;I)V")
	public static void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		if (Static42.anInt1100 < arg1.anInt2451) {
			Static24.method507(arg1);
		} else if (Static42.anInt1100 <= arg1.anInt2452) {
			Static71.method1356(arg1);
		} else {
			Static165.method2819(arg1);
		}
		if (arg1.anInt2501 < 128 || arg1.anInt2448 < 128 || arg1.anInt2501 >= 13184 || arg1.anInt2448 >= 13184) {
			arg1.anInt2501 = arg1.anInt2480 * 64 + arg1.anIntArray199[0] * 128;
			arg1.anInt2485 = -1;
			arg1.anInt2451 = 0;
			arg1.anInt2458 = -1;
			arg1.anInt2452 = 0;
			arg1.anInt2448 = arg1.anIntArray196[0] * 128 + arg1.anInt2480 * 64;
			arg1.method1887();
		}
		if (arg1 == Static87.aClass5_Sub2_Sub1_1 && (arg1.anInt2501 < 1536 || arg1.anInt2448 < 1536 || arg1.anInt2501 >= 11776 || arg1.anInt2448 >= 11776)) {
			arg1.anInt2458 = -1;
			arg1.anInt2448 = arg1.anIntArray196[0] * 128 + arg1.anInt2480 * 64;
			arg1.anInt2485 = -1;
			arg1.anInt2452 = 0;
			arg1.anInt2451 = 0;
			arg1.anInt2501 = arg1.anInt2480 * 64 + arg1.anIntArray199[0] * 128;
			arg1.method1887();
		}
		Static187.method3222(arg1);
		Static56.method1091(arg1);
	}
}
