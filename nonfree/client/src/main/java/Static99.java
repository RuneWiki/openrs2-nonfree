import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!oc;")
	public static Class34 aClass34_72;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1444 = Static15.method178("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	public static int anInt2541 = 0;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1445 = Static15.method178("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1446 = Static15.method178("T");

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1447 = Static15.method178("cross");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1659() {
		Static82.aClass45_7 = new Class45();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method1660() {
		aClass23_1447 = null;
		aClass23_1444 = null;
		aClass23_1446 = null;
		aClass34_72 = null;
		aClass23_1445 = null;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method1661() {
		for (@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) Static114.aClass45_10.method1299(); local8 != null; local8 = (Class1_Sub12) Static114.aClass45_10.method1288()) {
			if (local8.aClass1_Sub1_Sub4_1 != null) {
				local8.method1471();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1662(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static55.aClass61_1);
		arg0.removeMouseMotionListener(Static55.aClass61_1);
		arg0.removeFocusListener(Static55.aClass61_1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V")
	public static void method1663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static97.anInt2526 == 0 || arg1 == 0 || Static111.anInt2901 >= 50) {
			return;
		}
		Static68.anIntArray62[Static111.anInt2901] = arg0;
		Static43.anIntArray173[Static111.anInt2901] = arg1;
		Static7.anIntArray36[Static111.anInt2901] = arg2;
		Static55.aClass39Array1[Static111.anInt2901] = null;
		Static109.anIntArray394[Static111.anInt2901] = 0;
		Static111.anInt2901++;
	}
}
