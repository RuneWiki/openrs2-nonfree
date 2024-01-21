import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	public static int anInt2166;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "Lclient!oc;")
	public static Class56 aClass56_67;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "Lclient!oc;")
	public static Class56 aClass56_68;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1032 = Static78.method1313("<col=ffff00>");

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public static int anInt2168 = 0;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1033 = Static78.method1313("Unexpected server response");

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public static int anInt2175 = 0;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1034 = Static78.method1313("redstone1");

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "[I")
	public static int[] anIntArray385 = new int[2000];

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1035 = Static78.method1313("::");

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1036 = aClass25_1033;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)[B")
	public static byte[] method1597(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static132.method848(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Lclient!af;")
	public static Class1_Sub2_Sub1 method1598(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub1 local10 = (Class1_Sub2_Sub1) Static80.aClass63_15.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static38.aClass56_35.method1269(4, arg0);
		local10 = new Class1_Sub2_Sub1();
		if (local28 != null) {
			local10.method130(new Class1_Sub5(local28), arg0);
		}
		local10.method131();
		Static80.aClass63_15.method1520(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method1599() {
		aClass56_67 = null;
		aClass25_1036 = null;
		aClass25_1034 = null;
		aClass56_68 = null;
		aClass25_1035 = null;
		aClass25_1033 = null;
		aClass25_1032 = null;
		anIntArray385 = null;
	}
}
