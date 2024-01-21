import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt2513;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_27;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public static int anInt2514;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "[[Lclient!qd;")
	public static Class2_Sub1_Sub14[][] aClass2_Sub1_Sub14ArrayArray1;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!ba;")
	public static Class2_Sub3 aClass2_Sub3_5 = new Class2_Sub3(new byte[5000]);

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public static int anInt2515 = 0;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!a;")
	private static Class1 aClass1_2624 = Static94.method1596("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!re;")
	public static Class55 aClass55_1 = new Class55();

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "[I")
	public static int[] anIntArray311 = new int[500];

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!a;")
	private static Class1 aClass1_2625 = Static94.method1596("Hidden");

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Lclient!a;")
	public static Class1 aClass1_2626 = Static94.method1596("backbase1");

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!a;")
	public static Class1 aClass1_2627 = aClass1_2625;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[J")
	public static long[] aLongArray6 = new long[200];

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!a;")
	public static Class1 aClass1_2628 = aClass1_2624;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method1659() {
		if (Static59.anInt1826 > 0) {
			Static81.method1495();
		} else {
			Static29.method759(40);
			Static57.aClass65_3 = Static50.aClass65_1;
			Static50.aClass65_1 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method1660() {
		Static3.aBoolean9 = true;
		Static77.aBoolean113 = true;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public static void method1661() {
		if (Static8.aClass14_1 == null) {
			return;
		}
		if (Static103.anInt2605 >= 0) {
			if (Static53.anInt1751 > 0) {
				Static68.anInt1945 += Static7.anInt1200;
				Static8.aClass14_1.method1080(Static103.anInt2605, Static68.anInt1945);
				Static53.anInt1751--;
				if (Static53.anInt1751 == 0) {
					Static8.aClass14_1.method1079();
					Static103.anInt2605 = -1;
					Static53.anInt1751 = 20;
				}
			}
		} else if (Static53.anInt1751 > 0) {
			Static53.anInt1751--;
			if (Static53.anInt1751 == 0) {
				if (Static2.aByteArray2 == null) {
					Static8.aClass14_1.method1077(256);
				} else {
					Static8.aClass14_1.method1077(Static31.anInt1223);
					Static103.anInt2605 = Static31.anInt1223;
					Static8.aClass14_1.method1076(Static2.aByteArray2, Static57.aBoolean98, Static31.anInt1223);
					Static2.aByteArray2 = null;
				}
				Static68.anInt1945 = 0;
			}
		}
		Static8.aClass14_1.method1078();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method1662() {
		aClass2_Sub3_5 = null;
		aClass2_Sub1_Sub14ArrayArray1 = null;
		anIntArray312 = null;
		aClass1_2625 = null;
		aClass2_Sub1_Sub2_Sub2_27 = null;
		aClass1_2628 = null;
		aLongArray6 = null;
		aClass1_2626 = null;
		aClass55_1 = null;
		aClass1_2624 = null;
		aClass1_2627 = null;
		anIntArray311 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)I")
	public static int method1663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static29.aByteArrayArrayArray2[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static29.aByteArrayArrayArray2[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
