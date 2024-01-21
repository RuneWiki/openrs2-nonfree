import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "[S")
	public static short[] aShortArray47;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "Z")
	public static boolean aBoolean219;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1667 = Static169.method2903("M");

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1666 = aClass23_1667;

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1668 = Static169.method2903(": ");

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1669 = Static169.method2903("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1670 = Static169.method2903("Registrierter Benutzer");

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1671 = Static169.method2903("Spieler");

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1672 = Static169.method2903(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1673 = Static169.method2903("m");

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1674 = aClass23_1667;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V")
	public static void method3153() {
		aClass23_1670 = null;
		aClass23_1673 = null;
		aClass23_1669 = null;
		aClass23_1674 = null;
		aClass23_1671 = null;
		aClass23_1666 = null;
		aClass23_1672 = null;
		aShortArray47 = null;
		aClass23_1667 = null;
		aClass23_1668 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	public static void method3154(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static49.method916(arg0)) {
			return;
		}
		@Pc(20) Class60[] local20 = Static9.aClass60ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(28) Class60 local28 = local20[local22];
			if (local28.anObjectArray21 != null) {
				@Pc(35) Class1_Sub13 local35 = new Class1_Sub13();
				local35.anObjectArray3 = local28.anObjectArray21;
				local35.aClass60_6 = local28;
				Static124.method2202(2000000, local35);
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IB)Lclient!cb;")
	public static Class1_Sub1_Sub3 method3155(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = (Class1_Sub1_Sub3) Static163.aClass79_25.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static29.aClass30_15.method1301(6, arg0);
		local10 = new Class1_Sub1_Sub3();
		local10.anInt665 = arg0;
		if (local20 != null) {
			local10.method370(new Class1_Sub8(local20));
		}
		local10.method368();
		if (local10.aBoolean29) {
			local10.aBoolean27 = false;
			local10.anInt644 = 0;
		}
		Static163.aClass79_25.method2658((long) arg0, local10);
		return local10;
	}
}
