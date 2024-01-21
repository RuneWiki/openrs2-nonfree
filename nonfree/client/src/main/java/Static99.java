import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static99 {

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "Lclient!bc;")
	public static Class1 aClass1_15;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "I")
	public static int anInt2091 = 0;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_848 = Static120.method1824("purple:");

	@OriginalMember(owner = "client!la", name = "S", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "Lclient!rd;")
	public static Class80 aClass80_849 = aClass80_848;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "I")
	public static int anInt2093 = 0;

	@OriginalMember(owner = "client!la", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_850 = aClass80_848;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
	public static void method1487(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static124.aBoolean108) {
			Static190.method3094();
		} else if (arg0 != -1 && (arg0 != Static151.anInt3396 || !Static102.method1536()) && Static187.anInt4245 != 0 && !Static124.aBoolean108) {
			Static42.method648(Static102.aClass1_Sub1_17, arg0, Static187.anInt4245);
		}
		Static151.anInt3396 = arg0;
	}
}
