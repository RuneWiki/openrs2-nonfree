import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int anInt1860;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt1862 = 0;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_785 = Static187.method3089("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	public static void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class11 local13 = Static173.method2744(arg2, arg1);
		if (local13 != null && local13.anObjectArray23 != null) {
			@Pc(22) Class1_Sub24 local22 = new Class1_Sub24();
			local22.aClass11_18 = local13;
			local22.anObjectArray28 = local13.anObjectArray23;
			Static45.method810(local22);
		}
		Static114.anInt2462 = arg1;
		Static14.anInt382 = arg2;
		Static19.anInt529 = arg0;
		Static72.aBoolean100 = true;
		Static73.method1118(local13);
	}
}
