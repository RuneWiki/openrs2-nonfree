import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(II)V")
	public static void method1687(@OriginalArg(1) int arg0) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 14);
		local8.method4710();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == arg4) {
			Static400.method4734(arg6, arg0, arg5, arg4, arg2, arg3);
		} else if (arg5 - arg4 >= Static293.anInt4886 && Static137.anInt2576 >= arg4 + arg5 && Static316.anInt5188 <= arg6 - arg1 && Static82.anInt1667 >= arg6 + arg1) {
			Static387.method2754(arg0, arg2, arg1, arg3, arg6, arg5, arg4);
		} else {
			Static90.method1612(arg4, arg3, arg5, arg0, arg1, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BIILclient!ok;ZI)V")
	public static void method1689(@OriginalArg(1) int arg0, @OriginalArg(3) Class178 arg1, @OriginalArg(5) int arg2) {
		Static20.anInt2216 = arg0;
		Static351.anInt5638 = 1;
		Static195.anInt3458 = arg2;
		Static455.anInt6328 = 0;
		Static415.anInt6610 = 10000;
		Static286.aBoolean251 = false;
		Static126.aClass178_41 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method1690(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static212.anInt3800;
		for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
			@Pc(34) Class191 local34 = Static138.aClass122_1.method2725(arg0[local25]);
			if (local34.anInt5120 != -1) {
				@Pc(49) Class11 local49 = (Class11) Static270.aClass126_38.method2822((long) local34.anInt5120);
				if (local49 == null) {
					@Pc(57) Class246 local57 = Static469.method5145(Static25.aClass178_9, local34.anInt5120, 0);
					if (local57 != null) {
						local49 = Static269.aClass51_9.method5308(local57);
						Static270.aClass126_38.method2824((long) local34.anInt5120, local49);
					}
				}
				if (local49 != null) {
					Static423.aClass11Array15[local11] = local49;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
