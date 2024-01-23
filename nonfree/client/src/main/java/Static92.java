import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static92 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_20;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_21;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1 aClass1_Sub1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public static int anInt1866 = 0;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!hh;")
	public static Class50 aClass50_591 = Static186.method3527("scrollen:");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBII)I")
	public static int method1433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 >= arg0) {
			return arg2 < arg1 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}
}
