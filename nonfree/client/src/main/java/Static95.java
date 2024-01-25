import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Lclient!ov;")
	public static Class282 aClass282_1;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[200];

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "Lclient!pka;")
	public static final Class292 aClass292_1 = new Class292();

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "[I")
	public static final int[] anIntArray119 = new int[2048];

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "Lclient!pka;")
	public static final Class292 aClass292_2 = new Class292();

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_19 = new Class144(57, 8);

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "[Lclient!pka;")
	public static final Class292[] aClass292Array1 = new Class292[] { aClass292_2, aClass292_1 };

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!kea;II)V")
	public static void method1960(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1) {
		if (Static486.aBoolean517) {
			Static486.aBoolean517 = false;
			arg1 = 0;
		}
		if (Static549.aClass208_5 != null && Static549.aClass208_5.method4839(arg0)) {
			return;
		}
		Static549.aClass208_5 = arg0;
		Static198.aLong129 = Static517.method6965();
		Static211.anInt10646 = arg1;
		Static246.anInt3873 = arg1;
		if (Static246.anInt3873 == 0) {
			Static91.method1927();
			return;
		}
		Static7.aClass113_1 = Static602.aClass113_3;
		Static442.anInt6793 = Static150.anInt2707;
		Static562.aFloat132 = Static26.aFloat7;
		Static425.anInt6494 = Static305.anInt4910;
		Static456.aFloat118 = Static590.aFloat137;
		Static413.aFloat102 = Static183.aFloat59;
		Static207.aFloat60 = Static120.aFloat44;
		Static190.anInt10865 = Static36.anInt1194;
		Static573.aFloat136 = Static559.aFloat130;
		Static341.aClass200_4 = Static538.aClass200_5;
		Static647.aFloat172 = Static101.aFloat41;
		if (Static538.aClass200_5 == null) {
			return;
		}
		if (Static538.aClass200_5.method4700()) {
			Static341.aClass200_4 = Static538.aClass200_5.method4696();
			Static538.aClass200_5 = Static341.aClass200_4;
		}
		if (Static538.aClass200_5 != null && Static538.aClass200_5 != Static549.aClass208_5.aClass200_3) {
			Static538.aClass200_5.method4707(Static549.aClass208_5.aClass200_3);
			return;
		}
	}
}
