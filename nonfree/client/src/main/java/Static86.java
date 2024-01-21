import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "Lclient!fc;")
	public static Class21 aClass21_19;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_999 = Static34.method846("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1000 = null;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1001 = Static34.method846("invback");

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
	public static int anInt2443 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIBLclient!rc;Lclient!rc;I)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class55 arg3, @OriginalArg(5) Class55 arg4, @OriginalArg(6) int arg5) {
		if (Static94.anInt2645 >= 500) {
			return;
		}
		if (arg3.method1674() <= 0) {
			Static76.aClass55Array20[Static94.anInt2645] = arg4;
		} else {
			Static76.aClass55Array20[Static94.anInt2645] = Static89.method1698(new Class55[] { arg4, Static52.aClass55_637, arg3 });
		}
		Static10.anIntArray43[Static94.anInt2645] = arg0;
		Static52.anIntArray160[Static94.anInt2645] = arg2;
		Static107.anIntArray290[Static94.anInt2645] = arg5;
		Static77.anIntArray216[Static94.anInt2645] = arg1;
		Static94.anInt2645++;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	public static void method1660() {
		aClass55_1000 = null;
		aClass55_1001 = null;
		aClass21_19 = null;
		aClass55_999 = null;
		anImage4 = null;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V")
	public static void method1675() {
		Static107.aClass21_24.method1445();
	}
}
