import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!k", name = "v", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_8;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "[Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3[] aClass1_Sub1_Sub1_Sub3Array6;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "I")
	public static int anInt2601 = 0;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "Lclient!rf;")
	private static Class70 aClass70_863 = Static49.method1293("Loading )2 please wait)3");

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!rf;")
	public static Class70 aClass70_862 = aClass70_863;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	public static void method1930() {
		aClass1_Sub1_Sub1_Sub3Array6 = null;
		aClass70_862 = null;
		aClass76_Sub1_8 = null;
		aClass70_863 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)V")
	public static void method1931(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static25.anInt695 >= 100) {
			Static41.method1036(Static55.aClass70_561, Static35.aClass70_632, 0);
			return;
		}
		@Pc(27) Class70 local27 = Static108.method2267(arg0).method2898();
		for (@Pc(29) int local29 = 0; local29 < Static25.anInt695; local29++) {
			if (Static120.aLongArray7[local29] == arg0) {
				Static41.method1036(Static160.method3210(new Class70[] { local27, Static106.aClass70_969 }), Static35.aClass70_632, 0);
				return;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < Static164.anInt4267; local60++) {
			if (arg0 == Static79.aLongArray4[local60]) {
				Static41.method1036(Static160.method3210(new Class70[] { Static142.aClass70_1284, local27, Static183.aClass70_1594 }), Static35.aClass70_632, 0);
				return;
			}
		}
		if (local27.method2910(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408)) {
			Static41.method1036(Static160.aClass70_1419, Static35.aClass70_632, 0);
			return;
		}
		Static120.aLongArray7[Static25.anInt695] = arg0;
		Static51.aClass70Array8[Static25.anInt695++] = Static108.method2267(arg0);
		Static102.anInt2901 = Static58.anInt1875;
		Static131.aClass1_Sub9_Sub1_3.method1283(117);
		Static131.aClass1_Sub9_Sub1_3.method1263(arg0);
	}
}
