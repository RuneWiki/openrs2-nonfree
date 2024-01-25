import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	public static int anInt1693;

	@OriginalMember(owner = "client!ct", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
	public static int anInt1710;

	@OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
	public static int anInt1709 = -1;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIIII)J")
	public static long method1653(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static379.aCalendar19.clear();
		Static379.aCalendar19.set(arg2, arg0, arg1, 12, 0, 0);
		return Static379.aCalendar19.getTime().getTime();
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)Lclient!dr;")
	public static Class3_Sub1_Sub3 method1655() {
		return Static366.aClass3_Sub1_Sub3_4;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	public static int method1656() {
		@Pc(20) byte local20;
		if (Static387.anInt6096 < 96) {
			Static62.method1305();
			local20 = 1;
		} else {
			@Pc(25) int local25 = Static42.method1066();
			if (local25 <= 100) {
				local20 = 4;
				Static129.method2438();
			} else if (local25 <= 500) {
				local20 = 3;
				Static111.method2092();
			} else if (local25 <= 1000) {
				Static575.method8118();
				local20 = 2;
			} else {
				Static62.method1305();
				local20 = 1;
			}
		}
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 0) {
			Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
			Static382.method5480(false, 0);
		}
		Static441.method6272();
		return local20;
	}
}
