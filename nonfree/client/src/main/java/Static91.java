import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_45 = new Class119("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "(I)Z")
	public static boolean method1450() {
		try {
			if (Static255.anInt1147 == 2) {
				if (Static34.aClass1_Sub31_1 == null) {
					Static34.aClass1_Sub31_1 = Static462.method3480(Static2.aClass82_1, Static303.anInt7492, Static72.anInt1316);
					if (Static34.aClass1_Sub31_1 == null) {
						return false;
					}
				}
				if (Static83.aClass36_1 == null) {
					Static83.aClass36_1 = new Class36(Static151.aClass82_41, Static459.aClass82_99);
				}
				if (Static420.aClass1_Sub6_Sub2_3.method4484(Static83.aClass36_1, Static34.aClass1_Sub31_1, Static53.aClass82_15)) {
					Static420.aClass1_Sub6_Sub2_3.method4450();
					Static420.aClass1_Sub6_Sub2_3.method4479(Static48.anInt814);
					Static420.aClass1_Sub6_Sub2_3.method4466(Static128.aBoolean263, Static34.aClass1_Sub31_1);
					Static2.aClass82_1 = null;
					Static83.aClass36_1 = null;
					Static255.anInt1147 = 0;
					Static34.aClass1_Sub31_1 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static420.aClass1_Sub6_Sub2_3.method4478();
			Static83.aClass36_1 = null;
			Static2.aClass82_1 = null;
			Static34.aClass1_Sub31_1 = null;
			Static255.anInt1147 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Z")
	public static boolean method1452(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
