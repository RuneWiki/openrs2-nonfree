import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!wf;")
	public static Class15_Sub5_Sub2 aClass15_Sub5_Sub2_2;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static int anInt1746;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
	public static int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!c;BIII)V")
	public static void method1647(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt512 == -1 && arg1.anIntArray29 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		if (arg1.anInt509 < arg0) {
			local16 = arg0 - arg1.anInt509;
		} else if (arg1.anInt507 > arg0) {
			local16 = arg1.anInt507 - arg0;
		}
		@Pc(49) int local49 = Static294.anInt5275 * arg1.anInt523 >> 8;
		if (arg1.anInt522 < arg4) {
			local16 += arg4 - arg1.anInt522;
		} else if (arg1.anInt508 > arg4) {
			local16 += arg1.anInt508 - arg4;
		}
		if (arg1.anInt510 == 0 || local16 - 64 > arg1.anInt510 || Static294.anInt5275 == 0 || arg2 != arg1.anInt519) {
			if (arg1.aClass1_Sub24_Sub2_1 != null) {
				Static205.aClass1_Sub24_Sub3_1.method4518(arg1.aClass1_Sub24_Sub2_1);
				arg1.aClass1_Sub24_Sub2_1 = null;
			}
			if (arg1.aClass1_Sub24_Sub2_2 != null) {
				Static205.aClass1_Sub24_Sub3_1.method4518(arg1.aClass1_Sub24_Sub2_2);
				arg1.aClass1_Sub24_Sub2_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(153) int local153 = (arg1.anInt510 - local16) * local49 / arg1.anInt510;
		if (arg1.aClass1_Sub24_Sub2_1 != null) {
			arg1.aClass1_Sub24_Sub2_1.method3739(local153);
		} else if (arg1.anInt512 >= 0) {
			@Pc(175) Class169 local175 = Static326.method4205(Static15.aClass121_12, arg1.anInt512, 0);
			if (local175 != null) {
				@Pc(183) Class1_Sub5_Sub1 local183 = local175.method4206().method1592(Static84.aClass117_1);
				@Pc(188) Class1_Sub24_Sub2 local188 = Static323.method3729(local183, local153);
				local188.method3722(-1);
				Static205.aClass1_Sub24_Sub3_1.method4514(local188);
				arg1.aClass1_Sub24_Sub2_1 = local188;
			}
		}
		if (arg1.aClass1_Sub24_Sub2_2 != null) {
			arg1.aClass1_Sub24_Sub2_2.method3739(local153);
			if (!arg1.aClass1_Sub24_Sub2_2.method4782()) {
				arg1.aClass1_Sub24_Sub2_2 = null;
			}
		} else if (arg1.anIntArray29 != null && (arg1.anInt520 -= arg3) <= 0) {
			@Pc(238) int local238 = (int) ((double) arg1.anIntArray29.length * Math.random());
			@Pc(246) Class169 local246 = Static326.method4205(Static15.aClass121_12, arg1.anIntArray29[local238], 0);
			if (local246 != null) {
				@Pc(253) Class1_Sub5_Sub1 local253 = local246.method4206().method1592(Static84.aClass117_1);
				@Pc(258) Class1_Sub24_Sub2 local258 = Static323.method3729(local253, local153);
				local258.method3722(0);
				Static205.aClass1_Sub24_Sub3_1.method4514(local258);
				arg1.anInt520 = (int) ((double) (arg1.anInt515 - arg1.anInt513) * Math.random()) + arg1.anInt513;
				arg1.aClass1_Sub24_Sub2_2 = local258;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public static void method1648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static187.aBoolean243) {
			arg1 = 2;
			arg0 = 2;
		}
		if (Static182.anInt3489 != arg1) {
			if (Static222.aBoolean284) {
				return;
			}
			if (Static182.anInt3489 != 0) {
				Static94.anInterface4Array3[Static182.anInt3489].method4405();
			}
			if (arg1 != 0) {
				@Pc(46) Interface4 local46 = Static94.anInterface4Array3[arg1];
				local46.method4403();
				local46.method4406(arg0);
			}
			Static182.anInt3489 = arg1;
			Static73.anInt1540 = arg0;
		} else if (arg1 != 0 && Static73.anInt1540 != arg0) {
			Static94.anInterface4Array3[arg1].method4406(arg0);
			Static73.anInt1540 = arg0;
		}
	}
}
