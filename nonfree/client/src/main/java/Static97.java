import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!gba;")
	public static Class125 aClass125_5;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!dm;")
	public static Class78 aClass78_2 = null;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public static int anInt1908 = 2;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIBZ)Lclient!nl;")
	public static Class2_Sub37 method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class2_Sub37 local7 = new Class2_Sub37();
		local7.anInt6848 = arg1;
		local7.anInt6849 = arg0;
		Static206.aClass222_14.method5476(local7, (long) arg2);
		Static365.method5555(arg1);
		@Pc(28) Class78 local28 = Static180.method3291(arg2);
		if (local28 != null) {
			Static397.method6022(local28);
		}
		if (aClass78_2 != null) {
			Static397.method6022(aClass78_2);
			aClass78_2 = null;
		}
		Static450.method4869();
		if (local28 != null) {
			Static630.method8478(!arg3, local28);
		}
		if (!arg3) {
			Static639.method8547(arg1);
		}
		if (!arg3 && Static387.anInt6978 != -1) {
			Static446.method6622(1, Static387.anInt6978);
		}
		return local7;
	}
}
