import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public static int anInt1771;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "[Lclient!wq;")
	public static Class269[] aClass269Array1 = new Class269[50];

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "[Lclient!lq;")
	public static final Class139[] aClass139Array1 = new Class139[30];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	public static int method1546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	public static void method1547(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static202.aClass164ArrayArrayArray5 = Static2.aClass164ArrayArrayArray1;
			Static417.aClass65Array4 = Static285.aClass65Array3;
		} else {
			Static202.aClass164ArrayArrayArray5 = Static214.aClass164ArrayArrayArray4;
			Static417.aClass65Array4 = Static67.aClass65Array1;
		}
		Static235.anInt4487 = Static202.aClass164ArrayArrayArray5.length;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIILclient!ya;IIII)V")
	public static void method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface6 local11 = (Interface6) Static227.method3449(arg0, arg5, arg2);
		@Pc(20) Class202 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local11 != null) {
			local20 = Static267.aClass262_2.method5560(local11.method5350());
			local26 = local11.method5347() & 0x3;
			local30 = local11.method5354();
			if (local20.anInt5803 == -1) {
				local36 = arg1;
				if (local20.anInt5813 > 0) {
					local36 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method4240(arg3, 4, arg6, local36);
					} else if (local26 == 1) {
						arg4.method4256(4, arg3, arg6, local36);
					} else if (local26 == 2) {
						arg4.method4240(arg3, 4, arg6 + 3, local36);
					} else if (local26 == 3) {
						arg4.method4256(4, arg3 + 3, arg6, local36);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method4293(arg6, 1, arg3, local36, 1);
					} else if (local26 == 1) {
						arg4.method4293(arg6 + 3, 1, arg3, local36, 1);
					} else if (local26 == 2) {
						arg4.method4293(arg6 + 3, 1, arg3 + 3, local36, 1);
					} else if (local26 == 3) {
						arg4.method4293(arg6, 1, arg3 + 3, local36, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method4256(4, arg3, arg6, local36);
					} else if (local26 == 1) {
						arg4.method4240(arg3, 4, arg6 + 3, local36);
					} else if (local26 == 2) {
						arg4.method4256(4, arg3 + 3, arg6, local36);
					} else if (local26 == 3) {
						arg4.method4240(arg3, 4, arg6, local36);
					}
				}
			} else {
				Static300.method4094(arg4, local26, local20, arg3, arg6);
			}
		}
		local11 = (Interface6) Static36.method648(arg0, arg5, arg2, f.class);
		if (local11 != null) {
			local20 = Static267.aClass262_2.method5560(local11.method5350());
			local26 = local11.method5347() & 0x3;
			local30 = local11.method5354();
			if (local20.anInt5803 != -1) {
				Static300.method4094(arg4, local26, local20, arg3, arg6);
			} else if (local30 == 9) {
				local36 = -1118482;
				if (local20.anInt5813 > 0) {
					local36 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method4296(arg3 + 3, local36, arg6, arg3, arg6 + 3);
				} else {
					arg4.method4296(arg3, local36, arg6, arg3 + 3, arg6 + 3);
				}
			}
		}
		local11 = (Interface6) Static117.method2096(arg0, arg5, arg2);
		if (local11 == null) {
			return;
		}
		local20 = Static267.aClass262_2.method5560(local11.method5350());
		local26 = local11.method5347() & 0x3;
		if (local20.anInt5803 != -1) {
			Static300.method4094(arg4, local26, local20, arg3, arg6);
		}
	}
}
