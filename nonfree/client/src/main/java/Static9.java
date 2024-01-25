import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!ss;")
	public static final Class340 aClass340_1 = new Class340("", 16);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method139() {
		Static478.aClass357Array1 = null;
		if (Static450.aBoolean606 && Static255.method4444() != 1) {
			Static443.method7176(0, 0, Static178.method3493(), Static579.anInt10049 == 3 || Static579.anInt10049 == 7, Static23.method432());
		}
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		if (Static450.aBoolean606) {
			local36 = Static106.method1934();
			local38 = Static207.method3926();
		}
		Static365.method6184(local36, local36, -1, Static406.anInt7570 + local36, local38 - -Static19.anInt352, local38, local38, Static567.anInt9844);
		if (Static478.aClass357Array1 != null) {
			Static643.method9508(Static406.anInt7570 + local36, Static73.anInt1410, local38 + Static19.anInt352, true, Static504.anInt8988, Static478.aClass357Array1, Static539.aClass357_140.anInt10421, -1412584499, local38, local36);
			Static478.aClass357Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
	public static boolean method146(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
