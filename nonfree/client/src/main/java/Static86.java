import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!ic;")
	private static Class34 aClass34_997 = Static56.method816("red:");

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!ic;")
	public static Class34 aClass34_998 = aClass34_997;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_999 = Static56.method816("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	public static int anInt2177 = 1;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1000 = Static56.method816("This computers address has been blocked");

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1001 = aClass34_997;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1002 = Static56.method816(" loggt sich ein)3");

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
	public static int anInt2178 = -1;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	public static int anInt2179 = -1;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "Lclient!lf;")
	public static Class48 aClass48_39 = new Class48(100);

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
	public static int anInt2180 = 0;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
	public static int anInt2181 = 0;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1003 = aClass34_1000;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)I")
	public static int method1301(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(15) int local15 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZILclient!dd;I)V")
	public static void method1302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class14 arg2, @OriginalArg(5) int arg3) {
		Static39.anInt956 = 10000;
		Static108.anInt2488 = arg1;
		Static69.aClass14_18 = arg2;
		Static106.anInt2456 = 1;
		Static125.anInt3000 = arg0;
		Static92.aBoolean85 = false;
		Static60.anInt1574 = arg3;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1303() {
		aClass34_1000 = null;
		aClass34_998 = null;
		aClass48_39 = null;
		aClass34_997 = null;
		aClass34_999 = null;
		aClass34_1001 = null;
		aClass34_1003 = null;
		aClass34_1002 = null;
	}
}
