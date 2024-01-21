import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_11 = Static151.method2243("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Lclient!lf;")
	public static Class2_Sub1_Sub15 method26(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) Static173.aClass53_22.method1648((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static50.aClass71_10.method2130(28, arg0);
		local10 = new Class2_Sub1_Sub15();
		if (local25 != null) {
			local10.method1742(new Class2_Sub11(local25));
		}
		Static173.aClass53_22.method1645((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)Lclient!wb;")
	public static Class2_Sub1_Sub25 method27(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub25 local10 = (Class2_Sub1_Sub25) Static92.aClass53_9.method1648((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static6.aClass71_1.method2130(Static8.method147(arg0), Static18.method340(arg0));
		local10 = new Class2_Sub1_Sub25();
		if (local26 != null) {
			local10.method3051(new Class2_Sub11(local26));
		}
		local10.method3052();
		Static92.aClass53_9.method1645((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(III)V")
	public static void method28(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg1;
		@Pc(15) int[] local15 = new int[4];
		local15[0] = arg0;
		@Pc(21) int local21 = 1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg1 != Static209.anIntArray395[local23]) {
				local4[local21] = Static209.anIntArray395[local23];
				local15[local21] = Static131.anIntArray129[local23];
				local21++;
			}
		}
		Static131.anIntArray129 = local15;
		Static209.anIntArray395 = local4;
		Static12.method229(Static187.aClass38Array1, 0, Static187.aClass38Array1.length - 1);
	}
}
