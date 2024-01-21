import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!b", name = "r", descriptor = "[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array3;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "[S")
	public static short[] aShortArray5;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	public static int anInt239 = 0;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_58 = Static120.method1824("Schlie-8en");

	@OriginalMember(owner = "client!b", name = "D", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_59 = Static120.method1824("Clientscript error in: ");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)Z")
	public static boolean method166(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
	public static int method168(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public static void method169() {
		if (Static57.anInt1252 > 0) {
			Static162.method2630();
		} else {
			Static132.method2019(40);
			Static120.aClass78_4 = Static31.aClass78_1;
			Static31.aClass78_1 = null;
		}
	}
}
