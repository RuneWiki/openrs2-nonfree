import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	public static int anInt2075;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "[Lclient!r;")
	public static Class73[] aClass73Array3;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_678 = Static200.method3116("::qa_op_test");

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	public static int anInt2073 = 0;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Lclient!kh;")
	public static Class60 aClass60_679 = Static200.method3116(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!j", name = "F", descriptor = "Lclient!kh;")
	public static Class60 aClass60_680 = Static200.method3116("underlay)3dat");

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!kh;")
	public static Class60 aClass60_681 = Static200.method3116("Lade)3)3)3");

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method1533() {
		Static121.aClass33_7 = new Class33(32);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)Lclient!r;")
	public static Class73 method1534() {
		@Pc(30) Class73_Sub1 local30 = new Class73_Sub1(Static97.anInt2261, Static176.anInt777, Static91.anIntArray251[0], Static97.anIntArray263[0], Static181.anIntArray504[0], Static10.anIntArray46[0], Static96.aByteArrayArray4[0], Static110.anIntArray317);
		Static43.method711();
		return local30;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	public static void method1536() {
		for (@Pc(6) Class1_Sub1_Sub8 local6 = (Class1_Sub1_Sub8) Static153.aClass19_14.method609(); local6 != null; local6 = (Class1_Sub1_Sub8) Static153.aClass19_14.method615()) {
			@Pc(11) Class9_Sub7 local11 = local6.aClass9_Sub7_1;
			if (Static180.anInt3841 != local11.anInt3636 || local11.anInt3624 < Static42.anInt910) {
				local6.method3530();
			} else if (local11.anInt3639 <= Static42.anInt910) {
				if (local11.anInt3630 > 0) {
					@Pc(37) Class9_Sub4_Sub2 local37 = Static1.aClass9_Sub4_Sub2Array1[local11.anInt3630 - 1];
					if (local37 != null && local37.anInt3925 >= 0 && local37.anInt3925 < 13312 && local37.anInt3903 >= 0 && local37.anInt3903 < 13312) {
						local11.method2740(local37.anInt3925, local37.anInt3903, Static42.anInt910, Static165.method2268(local37.anInt3903, local11.anInt3636, local37.anInt3925) - local11.anInt3627);
					}
				}
				if (local11.anInt3630 < 0) {
					@Pc(86) int local86 = -local11.anInt3630 - 1;
					@Pc(91) Class9_Sub4_Sub1 local91;
					if (Static65.anInt1615 == local86) {
						local91 = Static84.aClass9_Sub4_Sub1_2;
					} else {
						local91 = Static41.aClass9_Sub4_Sub1Array2[local86];
					}
					if (local91 != null && local91.anInt3925 >= 0 && local91.anInt3925 < 13312 && local91.anInt3903 >= 0 && local91.anInt3903 < 13312) {
						local11.method2740(local91.anInt3925, local91.anInt3903, Static42.anInt910, Static165.method2268(local91.anInt3903, local11.anInt3636, local91.anInt3925) - local11.anInt3627);
					}
				}
				local11.method2738(Static26.anInt594);
				Static54.method1049(Static180.anInt3841, (int) local11.aDouble3, (int) local11.aDouble8, (int) local11.aDouble6, 60, local11, local11.anInt3638, -1L, false);
			}
		}
	}
}
