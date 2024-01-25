import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!mm;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_43 = new Class36(16, 4);

	@OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
	public static final int[] anIntArray121 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZI)V")
	public static void method1457(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static243.anInt4420--;
			if (Static243.anInt4420 == 0) {
				Static261.anIntArray393 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static374.anInt6580--;
		if (Static374.anInt6580 == 0) {
			Static154.anIntArray246 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Lclient!uf;")
	public static Class84_Sub1 method1459() {
		Static447.anInt7438 = 0;
		return Static196.method2831();
	}
}
