import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Lclient!uv;")
	public static Class253 aClass253_35;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_38 = new Class2(80, -1);

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_34 = new Class253(38, 9);

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZI)V")
	public static void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static80.anInt1631 == 1) {
			Static2.aClass11Array1[Static339.anInt5511 / 100].method4394(Static237.anInt4073 - 8, Static86.anInt1689 + -8);
		}
		if (Static80.anInt1631 == 2) {
			Static2.aClass11Array1[Static339.anInt5511 / 100 + 4].method4394(Static237.anInt4073 - 8, Static86.anInt1689 + -8);
		}
		Static102.method1777();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Z")
	public static boolean method1665() {
		try {
			return Static165.method2391();
		} catch (@Pc(14) IOException local14) {
			Static16.method5106();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static316.aClass253_117 == null ? -1 : Static316.aClass253_117.method5225()) + "," + (Static210.aClass253_153 == null ? -1 : Static210.aClass253_153.method5225()) + "," + (Static417.aClass253_149 == null ? -1 : Static417.aClass253_149.method5225()) + " - " + Static205.anInt3627 + "," + (Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0] + Static359.anInt5713) + "," + (Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0] + Static314.anInt5181) + " - ";
			for (@Pc(79) int local79 = 0; Static205.anInt3627 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static210.aClass7_Sub14_Sub1_4.aByteArray75[local79] + ",";
			}
			Static419.method5247(local19, local77);
			Static362.method4646(false);
			return true;
		}
	}
}
