import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
	public static int anInt2376;

	@OriginalMember(owner = "client!kg", name = "ab", descriptor = "Lclient!ed;")
	public static Class23 aClass23_889 = Static169.method2903(" x ");

	@OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
	public static int anInt2373 = -1;

	@OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
	public static int anInt2374 = 0;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Lclient!nh;")
	public static Class1_Sub1_Sub13 method1569(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = (Class1_Sub1_Sub13) Static116.aClass79_19.method2657((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static99.aClass30_34.method1301(8, arg0);
		local8 = new Class1_Sub1_Sub13();
		if (local22 != null) {
			local8.method2002(new Class1_Sub8(local22));
		}
		Static116.aClass79_19.method2658((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
	public static void method1570() {
		aClass23_889 = null;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)Lclient!dc;")
	public static Class16 method1571() {
		try {
			return (Class16) Class.forName("Class16_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
