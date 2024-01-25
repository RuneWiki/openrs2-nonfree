import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
	public static int anInt2319;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
	public static int anInt2325 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILclient!os;)V")
	public static void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class17_Sub2 arg4) {
		arg4.anInt997 = (arg1 << 7) + 64;
		arg4.anInt988 = arg3;
		arg4.anInt995 = (arg2 << 7) + 64;
		@Pc(24) Class194 local24 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class126 local31 = local24.aClass126_2; local31 != null; local31 = local31.aClass126_1) {
				if (local31.aClass17_Sub1_1.aBoolean499) {
					@Pc(41) int local41 = local31.aClass17_Sub1_1.method4490();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt988 += local28;
				arg4.aBoolean96 = true;
			}
		}
		if (Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static269.method4738(arg0, arg1, arg2);
		}
		Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2].aClass17_Sub2_1 = arg4;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)I")
	public static int method2043(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIIIII)V")
	public static void method2044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg5);
		@Pc(21) int local21 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg3);
		@Pc(27) int local27 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg4);
		@Pc(33) int local33 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg0);
		@Pc(41) int local41 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg5 + arg2);
		@Pc(50) int local50 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg3 - arg2);
		for (@Pc(52) int local52 = local11; local52 < local41; local52++) {
			Static39.method919(arg1, Static344.anIntArrayArray65[local52], local33, local27);
		}
		for (@Pc(72) int local72 = local21; local72 > local50; local72--) {
			Static39.method919(arg1, Static344.anIntArrayArray65[local72], local33, local27);
		}
		@Pc(99) int local99 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg4 + arg2);
		@Pc(108) int local108 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg0 - arg2);
		for (@Pc(110) int local110 = local41; local110 <= local50; local110++) {
			@Pc(116) int[] local116 = Static344.anIntArrayArray65[local110];
			Static39.method919(arg1, local116, local99, local27);
			Static39.method919(arg1, local116, local33, local108);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!wo;)V")
	public static void method2045(@OriginalArg(1) Class216 arg0) {
		Static54.aClass216_15 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
	public static void method2046() {
		Static342.aClass1_Sub8_Sub1_7.method3229(19);
		for (@Pc(18) Class1_Sub37 local18 = (Class1_Sub37) Static351.aClass197_33.method5161(); local18 != null; local18 = (Class1_Sub37) Static351.aClass197_33.method5154()) {
			if (!local18.method5627()) {
				local18 = (Class1_Sub37) Static351.aClass197_33.method5161();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt6278 == 0) {
				Static107.method2331(true, true, local18);
			}
		}
		if (Static111.aClass12_7 != null) {
			Static6.method247(Static111.aClass12_7);
			Static111.aClass12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
	public static void method2047() {
		for (@Pc(10) Class1_Sub25 local10 = (Class1_Sub25) Static290.aClass16_35.method410(); local10 != null; local10 = (Class1_Sub25) Static290.aClass16_35.method419()) {
			if (local10.anInt3972 > 0) {
				local10.anInt3972--;
			}
			if (local10.anInt3972 != 0) {
				if (local10.anInt3969 > 0) {
					local10.anInt3969--;
				}
				if (local10.anInt3969 == 0 && local10.anInt3971 >= 1 && local10.anInt3977 >= 1 && Static233.anInt5573 - 2 >= local10.anInt3971 && Static134.anInt2971 - 2 >= local10.anInt3977 && (local10.anInt3973 < 0 || Static291.method4935(local10.anInt3973, local10.anInt3974))) {
					Static340.method5481(local10.anInt3971, local10.anInt3974, local10.anInt3965, -1, local10.anInt3967, local10.anInt3976, local10.anInt3977, local10.anInt3973);
					local10.anInt3969 = -1;
					if (local10.anInt3970 == local10.anInt3973 && local10.anInt3970 == -1) {
						local10.method5628();
					} else if (local10.anInt3970 == local10.anInt3973 && local10.anInt3967 == local10.anInt3975 && local10.anInt3966 == local10.anInt3974) {
						local10.method5628();
					}
				}
			} else if (local10.anInt3970 < 0 || Static291.method4935(local10.anInt3970, local10.anInt3966)) {
				Static340.method5481(local10.anInt3971, local10.anInt3966, local10.anInt3965, -1, local10.anInt3975, local10.anInt3976, local10.anInt3977, local10.anInt3970);
				local10.method5628();
			}
		}
	}
}
