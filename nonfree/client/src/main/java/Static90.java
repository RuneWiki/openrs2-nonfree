import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "Lclient!vaa;")
	public static Class365 aClass365_2;

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "[Lclient!nfa;")
	public static final Interface18[] anInterface18Array1 = new Interface18[128];

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
	public static int anInt1507 = 0;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V")
	public static void method1397() {
		Static421.method6414();
		@Pc(10) int local10 = Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7578();
		if (local10 == 2) {
			Static385.method5647(Static316.anInt8165, Static563.anInt9176, Static563.aClass143_13);
		} else if (local10 == 3) {
			Static640.method8475(Static563.anInt9176, Static135.anInt2261, Static431.anInt7605, Static563.aClass143_13, Static316.anInt8165);
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7579()) {
			Static535.method8693(Static105.aCanvas2);
		}
		if (Static563.aClass143_13 != null) {
			Static304.method4152();
		}
		Static426.aBoolean555 = Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7578() != 0;
		Static305.aBoolean315 = Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7579();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZBJ)Ljava/lang/String;")
	public static String method1398(@OriginalArg(0) int arg0, @OriginalArg(3) long arg1) {
		Static188.method2732(arg1);
		@Pc(16) Calendar local16 = Static594.aCalendar2;
		@Pc(20) int local20 = local16.get(5);
		@Pc(26) int local26 = local16.get(2) + 1;
		@Pc(30) int local30 = local16.get(1);
		@Pc(34) int local34 = local16.get(11);
		@Pc(47) int local47 = local16.get(12);
		return Integer.toString(local20 / 10) + local20 % 10 + "/" + local26 / 10 + local26 % 10 + "/" + local30 % 100 / 10 + local30 % 10 + " " + local34 / 10 + local34 % 10 + ":" + local47 / 10 + local47 % 10;
	}
}
