import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_25 = new Class303(4, -1);

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_26 = new Class303(52, 4);

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
	public static boolean aBoolean162 = true;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)Lclient!qq;")
	public static Class3_Sub42 method1756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub42 local5 = null;
		if (arg1 == 0) {
			local5 = Static591.method7910(Static9.aClass199_3, Static302.aClass303_60);
		}
		if (arg1 == 1) {
			local5 = Static591.method7910(Static9.aClass199_3, Static463.aClass303_82);
		}
		local5.aClass3_Sub11_Sub1_1.method5167(Static335.anInt5608 + arg0);
		local5.aClass3_Sub11_Sub1_1.method5201(arg2 + Static246.anInt4344);
		local5.aClass3_Sub11_Sub1_1.method5213(Static140.aClass195_1.method4499(82) ? 1 : 0);
		Static551.anInt8768 = arg0;
		Static125.anInt2831 = arg2;
		Static542.aBoolean666 = false;
		Static293.method3983();
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public static void method1757() {
		Static51.aClass6_5.method94();
		Static490.aClass6_60.method94();
		Static301.aClass6_34.method94();
		Static296.aClass6_32.method94();
	}
}
