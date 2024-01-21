import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public static int anInt1989;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!tg;")
	private static Class81 aClass81_694 = Static120.method2057("Please try again)3");

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
	public static int[] anIntArray221 = new int[2048];

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_695 = Static120.method2057(": ");

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Lclient!tg;")
	private static Class81 aClass81_696 = Static120.method2057("Prepared sound engine");

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Lclient!tg;")
	public static Class81 aClass81_697 = aClass81_696;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "Lclient!tg;")
	private static Class81 aClass81_699 = Static120.method2057("Login server offline)3");

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "Lclient!tg;")
	public static Class81 aClass81_698 = aClass81_699;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "Lclient!tg;")
	public static Class81 aClass81_700 = aClass81_694;

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "Lclient!tg;")
	public static Class81 aClass81_701 = Static120.method2057("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public static void method1512() {
		aClass81_694 = null;
		aClass81_697 = null;
		aClass81_700 = null;
		aClass81_699 = null;
		aClass81_701 = null;
		anIntArray221 = null;
		aClass81_698 = null;
		aLongArray4 = null;
		aClass81_695 = null;
		aClass81_696 = null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method1513(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static26.method569(local18) : local18;
		} else if (arg0 instanceof Class69) {
			@Pc(32) Class69 local32 = (Class69) arg0;
			return local32.method2241();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
