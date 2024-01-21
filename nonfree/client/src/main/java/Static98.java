import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_696 = Static38.method685("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
	public static int anInt2447 = 0;

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_697 = Static38.method685("weiss:");

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
	public static void method1607(@OriginalArg(1) int arg0) {
		if (arg0 == Static156.anInt3638) {
			return;
		}
		if (Static156.anInt3638 == 0) {
			Static16.method318();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static141.anInt3311 = 0;
			Static153.anInt3529 = 0;
			Static41.anInt1196 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static65.aClass43_2 != null) {
			Static65.aClass43_2.method1236();
			Static65.aClass43_2 = null;
		}
		if (Static156.anInt3638 == 25) {
			Static77.anInt1914 = 1;
			Static65.anInt1610 = 1;
			Static73.anInt1794 = 0;
			Static52.anInt1433 = 0;
			Static123.anInt2876 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static4.method50(Static6.aClass10_Sub1_7, Static132.aClass10_Sub1_13, Static121.aCanvas1);
		} else {
			Static116.method1870();
		}
		Static156.anInt3638 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public static void method1610() {
		aClass6_696 = null;
		aClass6_697 = null;
	}
}
