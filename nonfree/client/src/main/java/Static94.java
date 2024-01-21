import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!s", name = "pb", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_18;

	@OriginalMember(owner = "client!s", name = "Cb", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub14 aClass3_Sub1_Sub14_4;

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1231 = Static75.method1216("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!s", name = "nb", descriptor = "Lclient!bb;")
	public static Class8 aClass8_27 = new Class8(100);

	@OriginalMember(owner = "client!s", name = "tb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1232 = Static75.method1216(")3");

	@OriginalMember(owner = "client!s", name = "wb", descriptor = "I")
	public static int anInt2210 = 0;

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1233 = Static75.method1216("backleft1");

	@OriginalMember(owner = "client!s", name = "zb", descriptor = "Lclient!bb;")
	public static Class8 aClass8_28 = new Class8(64);

	@OriginalMember(owner = "client!s", name = "Bb", descriptor = "[I")
	public static int[] anIntArray282 = new int[50];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)Z")
	public static boolean method1479(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public static void method1480() {
		aClass4_1231 = null;
		aClass4_1233 = null;
		aClass3_Sub1_Sub14_4 = null;
		anIntArray282 = null;
		aClass4_1232 = null;
		aClass8_28 = null;
		aClass64_Sub1_18 = null;
		aClass8_27 = null;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
	public static void method1482() {
		Static5.aClass3_Sub4_Sub1_1.anInt627 = 0;
		Static1.anInt2 = 0;
		Static65.anInt1630 = 0;
		Static17.anInt379 = -1;
		Static7.anInt279 = 0;
		Static31.anInt954 = 0;
		Static32.aClass3_Sub4_Sub1_2.anInt627 = 0;
		Static39.anInt1076 = -1;
		Static11.anInt2850 = 0;
		Static4.anInt204 = 0;
		Static4.anInt201 = -1;
		Static106.aBoolean231 = false;
		Static3.anInt2346 = -1;
		for (@Pc(39) int local39 = 0; local39 < Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1.length; local39++) {
			if (Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local39] != null) {
				Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local39].anInt2288 = -1;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9.length; local61++) {
			if (Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local61] != null) {
				Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local61].anInt2288 = -1;
			}
		}
		Static60.method1007(30);
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method1483() {
		for (@Pc(18) Class3_Sub12 local18 = (Class3_Sub12) Static67.aClass20_8.method308(); local18 != null; local18 = (Class3_Sub12) Static67.aClass20_8.method309()) {
			if (local18.anInt2766 > 0) {
				local18.anInt2766--;
			}
			if (local18.anInt2766 != 0) {
				if (local18.anInt2778 > 0) {
					local18.anInt2778--;
				}
				if (local18.anInt2778 == 0 && local18.anInt2776 >= 1 && local18.anInt2767 >= 1 && local18.anInt2776 <= 102 && local18.anInt2767 <= 102 && (local18.anInt2773 < 0 || Static18.method280(local18.anInt2779, local18.anInt2773))) {
					Static111.method1897(local18.anInt2780, local18.anInt2773, local18.anInt2779, local18.anInt2776, local18.anInt2770, local18.anInt2767, local18.anInt2774);
					local18.anInt2778 = -1;
					if (local18.anInt2771 == local18.anInt2773 && local18.anInt2771 == -1) {
						local18.method1930();
					} else if (local18.anInt2773 == local18.anInt2771 && local18.anInt2780 == local18.anInt2765 && local18.anInt2768 == local18.anInt2779) {
						local18.method1930();
					}
				}
			} else if (local18.anInt2771 < 0 || Static18.method280(local18.anInt2768, local18.anInt2771)) {
				Static111.method1897(local18.anInt2765, local18.anInt2771, local18.anInt2768, local18.anInt2776, local18.anInt2770, local18.anInt2767, local18.anInt2774);
				local18.method1930();
			}
		}
	}
}
