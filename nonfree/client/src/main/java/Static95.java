import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_35;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!ce;")
	public static Class1_Sub8 aClass1_Sub8_3;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!wh;")
	public static Class1_Sub25 aClass1_Sub25_1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_880 = Static161.method2971("_");

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_881 = Static161.method2971(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Z")
	public static boolean aBoolean208 = false;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public static int anInt2766 = 0;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "I")
	public static int anInt2769 = -1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Lclient!dd;")
	public static Class13 method1980(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static57.method1349(new Class13[] { Static113.aClass13_1021, Static3.method75(arg0), Static34.aClass13_399 });
		} else if (arg0 < 10000000) {
			return Static57.method1349(new Class13[] { Static141.aClass13_1204, Static3.method75(arg0 / 1000), Static50.aClass13_552, Static34.aClass13_399 });
		} else {
			return Static57.method1349(new Class13[] { Static83.aClass13_781, Static3.method75(arg0 / 1000000), Static32.aClass13_1425, Static34.aClass13_399 });
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method1983() {
		aClass13_880 = null;
		aClass4_Sub1_35 = null;
		aClass1_Sub25_1 = null;
		aClass1_Sub8_3 = null;
		aFont1 = null;
		aClass13_881 = null;
	}
}
