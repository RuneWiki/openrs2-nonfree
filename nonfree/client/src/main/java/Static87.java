import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Lclient!fia;")
	public static Class45 aClass45_2;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public static int anInt1475 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!jc;B)V")
	public static void method1438(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(9) int local9 = arg0.method7728(-129);
		Static156.aClass105Array1 = new Class105[local9];
		for (@Pc(22) int local22 = 0; local22 < local9; local22++) {
			Static156.aClass105Array1[local22] = new Class105();
			Static156.aClass105Array1[local22].anInt2299 = arg0.method7728(-129);
			Static156.aClass105Array1[local22].aString31 = arg0.method7739();
		}
		Static625.anInt11173 = arg0.method7728(-129);
		Static377.anInt6656 = arg0.method7728(-129);
		Static396.anInt6953 = arg0.method7728(-129);
		Static590.aClass169_Sub1Array3 = new Class169_Sub1[Static377.anInt6656 + 1 - Static625.anInt11173];
		for (@Pc(76) int local76 = 0; local76 < Static396.anInt6953; local76++) {
			@Pc(86) int local86 = arg0.method7728(-129);
			@Pc(94) Class169_Sub1 local94 = Static590.aClass169_Sub1Array3[local86] = new Class169_Sub1();
			local94.anInt4667 = arg0.method7695(113);
			local94.anInt4662 = arg0.method7748();
			local94.anInt4675 = Static625.anInt11173 + local86;
			local94.aString56 = arg0.method7739();
			local94.aString57 = arg0.method7739();
		}
		Static408.anInt7044 = arg0.method7748();
		Static154.aBoolean164 = true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	public static void method1439() {
		for (@Pc(15) Class14_Sub27 local15 = (Class14_Sub27) Static445.aClass125_30.method2633(); local15 != null; local15 = (Class14_Sub27) Static445.aClass125_30.method2627()) {
			Static687.method9464(local15.anInt6684);
		}
	}
}
