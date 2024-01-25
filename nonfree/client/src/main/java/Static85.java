import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	public static int anInt1316;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_19 = new Class286(23, 3);

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt1313 = 0;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "Lclient!av;")
	public static Class20 aClass20_5 = null;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 + arg0 > arg2 && arg2 + arg1 > arg0) {
			return arg5 + arg3 > arg7 && arg5 < arg4 + arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([[[Lclient!nt;I)V")
	public static void method1105(@OriginalArg(0) Class262[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class262[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class262 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass19_Sub1_Sub5_1 instanceof Interface19) {
							((Interface19) local32.aClass19_Sub1_Sub5_1).method9386();
						}
						if (local32.aClass19_Sub1_Sub1_2 instanceof Interface19) {
							((Interface19) local32.aClass19_Sub1_Sub1_2).method9386();
						}
						if (local32.aClass19_Sub1_Sub1_1 instanceof Interface19) {
							((Interface19) local32.aClass19_Sub1_Sub1_1).method9386();
						}
						if (local32.aClass19_Sub1_Sub2_2 instanceof Interface19) {
							((Interface19) local32.aClass19_Sub1_Sub2_2).method9386();
						}
						if (local32.aClass19_Sub1_Sub2_1 instanceof Interface19) {
							((Interface19) local32.aClass19_Sub1_Sub2_1).method9386();
						}
						for (@Pc(94) Class343 local94 = local32.aClass343_2; local94 != null; local94 = local94.aClass343_4) {
							@Pc(99) Class19_Sub1_Sub3 local99 = local94.aClass19_Sub1_Sub3_1;
							if (local99 instanceof Interface19) {
								((Interface19) local99).method9386();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIIIIIIII)V")
	public static void method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 >= anInt1313 && arg7 <= Static316.anInt6313 && arg5 >= anInt1313 && arg5 <= Static316.anInt6313 && arg6 >= anInt1313 && Static316.anInt6313 >= arg6 && anInt1313 <= arg8 && arg8 <= Static316.anInt6313 && Static280.anInt5114 <= arg0 && arg0 <= Static356.anInt6028 && arg4 >= Static280.anInt5114 && Static356.anInt6028 >= arg4 && Static280.anInt5114 <= arg1 && arg1 <= Static356.anInt6028 && Static280.anInt5114 <= arg2 && Static356.anInt6028 >= arg2) {
			Static24.method9445(arg1, arg2, arg4, arg3, arg7, arg6, arg5, arg0, arg8);
		} else {
			Static713.method9291(arg3, arg1, arg5, arg4, arg8, arg7, arg6, arg2, arg0);
		}
	}
}
