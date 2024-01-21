import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1363 = Static107.method1838("Loading sprites )2 ");

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1362 = aClass28_1363;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
	public static int anInt2276 = 20;

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1365 = Static107.method1838("as it was used to break our rules)3");

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1364 = aClass28_1365;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method1594() {
		aClass28_1364 = null;
		aClass28_1363 = null;
		aClass28_1362 = null;
		aClass28_1365 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!ff;)Lclient!gg;")
	public static Class28 method1595(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1) {
		if (!Static64.method1173(arg0, Static10.method323(arg1)) && arg1.anObjectArray5 == null) {
			return null;
		} else if (arg1.aClass28Array17 == null || arg0 >= arg1.aClass28Array17.length || arg1.aClass28Array17[arg0] == null || arg1.aClass28Array17[arg0].method1117().method1121() == 0) {
			return Static29.aBoolean34 ? Static83.method1481(new Class28[] { Static73.aClass28_1141, Static158.method2411(arg0) }) : null;
		} else {
			return arg1.aClass28Array17[arg0];
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ff;I)Z")
	public static boolean method1596(@OriginalArg(0) Class24 arg0) {
		if (arg0.anIntArray123 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray123.length; local17++) {
			@Pc(24) int local24 = Static5.method154(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray124[local17];
			if (arg0.anIntArray123[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray123[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray123[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}
}
