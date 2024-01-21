import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!rb", name = "Wc", descriptor = "I")
	public static int anInt2754;

	@OriginalMember(owner = "client!rb", name = "Tc", descriptor = "Lclient!se;")
	public static Class65 aClass65_70 = new Class65();

	@OriginalMember(owner = "client!rb", name = "Vc", descriptor = "Lclient!he;")
	public static Class26 aClass26_1483 = Static6.method100("ams");

	@OriginalMember(owner = "client!rb", name = "Xc", descriptor = "Lclient!he;")
	private static Class26 aClass26_1484 = Static6.method100("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!rb", name = "Yc", descriptor = "Lclient!he;")
	public static Class26 aClass26_1485 = aClass26_1484;

	@OriginalMember(owner = "client!rb", name = "Zc", descriptor = "[I")
	public static int[] anIntArray330 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!rb", name = "ad", descriptor = "Lclient!he;")
	private static Class26 aClass26_1486 = Static6.method100("Players");

	@OriginalMember(owner = "client!rb", name = "bd", descriptor = "Lclient!he;")
	public static Class26 aClass26_1487 = aClass26_1486;

	@OriginalMember(owner = "client!rb", name = "cd", descriptor = "Lclient!he;")
	public static Class26 aClass26_1488 = Static6.method100("(U");

	@OriginalMember(owner = "client!rb", name = "dd", descriptor = "Lclient!he;")
	public static Class26 aClass26_1489 = Static6.method100("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!rb", name = "ed", descriptor = "Lclient!he;")
	private static Class26 aClass26_1490 = Static6.method100("Connecting to update server");

	@OriginalMember(owner = "client!rb", name = "fd", descriptor = "Lclient!he;")
	public static Class26 aClass26_1491 = aClass26_1490;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
	public static void method1886() {
		aClass26_1487 = null;
		aClass26_1490 = null;
		aClass26_1483 = null;
		anIntArray330 = null;
		aClass26_1485 = null;
		aClass65_70 = null;
		aClass26_1488 = null;
		aClass26_1484 = null;
		aClass26_1486 = null;
		aClass26_1491 = null;
		aClass26_1489 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)I")
	public static int method1887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(17) int local17 = method1887(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local17 *= arg0;
			}
			return local17;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}
}
