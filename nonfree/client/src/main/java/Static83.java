import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass30;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public static int anInt11170 = 0;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[I")
	public static final int[] anIntArray793 = new int[500];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(JJ)J")
	public static long method9515(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method9523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg4 < 0 || arg3 >= Static497.anInt7926 - 1 || Static646.anInt9979 - 1 <= arg4 || Static448.aClass364ArrayArrayArray2 == null) {
			return;
		}
		@Pc(77) Interface9 local77;
		if (arg5 == 0) {
			local77 = (Interface9) Static518.method6967(arg0, arg3, arg4);
			@Pc(282) Interface9 local282 = (Interface9) Static574.method7432(arg0, arg3, arg4);
			if (local77 != null && arg1 != 2) {
				if (local77 instanceof Class9_Sub1_Sub2_Sub2) {
					((Class9_Sub1_Sub2_Sub2) local77).aClass136_1.method3105(arg6);
				} else {
					Static5.method228(arg4, arg1, arg3, arg0, arg6, arg5, local77.method9107(), arg2);
				}
			}
			if (local282 == null) {
				return;
			}
			if (!(local282 instanceof Class9_Sub1_Sub2_Sub2)) {
				Static5.method228(arg4, arg1, arg3, arg0, arg6, arg5, local282.method9107(), arg2);
				return;
			}
			((Class9_Sub1_Sub2_Sub2) local282).aClass136_1.method3105(arg6);
		} else if (arg5 == 1) {
			local77 = (Interface9) Static233.method3389(arg0, arg3, arg4);
			if (local77 != null) {
				if (!(local77 instanceof Class9_Sub1_Sub3_Sub2)) {
					@Pc(166) int local166 = local77.method9107();
					if (arg1 != 4 && arg1 != 5) {
						if (arg1 == 6) {
							Static5.method228(arg4, 4, arg3, arg0, arg6, arg5, local166, arg2 + 4);
							return;
						}
						if (arg1 == 7) {
							Static5.method228(arg4, 4, arg3, arg0, arg6, arg5, local166, (arg2 + 2 & 0x3) + 4);
							return;
						}
						if (arg1 == 8) {
							Static5.method228(arg4, 4, arg3, arg0, arg6, arg5, local166, arg2 + 4);
							Static5.method228(arg4, 4, arg3, arg0, arg6, arg5, local166, (arg2 + 2 & 0x3) + 4);
							return;
						}
						return;
					}
					Static5.method228(arg4, 4, arg3, arg0, arg6, arg5, local166, arg2);
					return;
				}
				((Class9_Sub1_Sub3_Sub2) local77).aClass136_3.method3105(arg6);
				return;
			}
		} else {
			if (arg5 == 2) {
				local77 = (Interface9) Static405.method5449(arg0, arg3, arg4, aClass30 == null ? (aClass30 = Class58.a("et")) : aClass30);
				if (local77 != null) {
					if (arg1 == 11) {
						arg1 = 10;
					}
					if (!(local77 instanceof Class9_Sub1_Sub1_Sub5)) {
						Static5.method228(arg4, arg1, arg3, arg0, arg6, arg5, local77.method9107(), arg2);
						return;
					}
					((Class9_Sub1_Sub1_Sub5) local77).aClass136_4.method3105(arg6);
					return;
				}
			} else if (arg5 == 3) {
				local77 = (Interface9) Static198.method3049(arg0, arg3, arg4);
				if (local77 == null) {
					return;
				}
				if (local77 instanceof Class9_Sub1_Sub4_Sub1) {
					((Class9_Sub1_Sub4_Sub1) local77).aClass136_2.method3105(arg6);
					return;
				}
				Static5.method228(arg4, arg1, arg3, arg0, arg6, arg5, local77.method9107(), arg2);
			} else {
				return;
			}
			return;
		}
	}
}
