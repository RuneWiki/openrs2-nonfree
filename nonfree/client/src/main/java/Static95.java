import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!es", name = "P", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!es", name = "N", descriptor = "I")
	public static int anInt1872 = 0;

	@OriginalMember(owner = "client!es", name = "R", descriptor = "I")
	public static int anInt1875 = -1;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!ju;IBI)V")
	public static void method1512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub25 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt3567 == -1 && arg2.anIntArray290 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static327.aClass230_Sub1_1.anInt7306 * arg2.anInt3570 >> 8;
		if (arg2.anInt3565 < arg1) {
			local15 = arg1 - arg2.anInt3565;
		} else if (arg2.anInt3562 > arg1) {
			local15 = arg2.anInt3562 - arg1;
		}
		if (arg2.anInt3571 < arg0) {
			local15 += arg0 - arg2.anInt3571;
		} else if (arg0 < arg2.anInt3568) {
			local15 += arg2.anInt3568 - arg0;
		}
		if (arg2.anInt3563 == 0 || arg2.anInt3563 < local15 - 64 || Static327.aClass230_Sub1_1.anInt7306 == 0 || arg3 != arg2.anInt3566) {
			if (arg2.aClass1_Sub5_Sub2_3 != null) {
				Static292.aClass1_Sub5_Sub1_2.method423(arg2.aClass1_Sub5_Sub2_3);
				arg2.aClass1_Sub5_Sub2_3 = null;
			}
			if (arg2.aClass1_Sub5_Sub2_2 != null) {
				Static292.aClass1_Sub5_Sub1_2.method423(arg2.aClass1_Sub5_Sub2_2);
				arg2.aClass1_Sub5_Sub2_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(146) int local146 = (arg2.anInt3563 - local15) * local23 / arg2.anInt3563;
		if (arg2.aClass1_Sub5_Sub2_3 != null) {
			arg2.aClass1_Sub5_Sub2_3.method1995(local146);
		} else if (arg2.anInt3567 >= 0) {
			@Pc(167) Class215 local167 = Static463.method5099(Static453.aClass109_44, arg2.anInt3567, 0);
			if (local167 != null) {
				@Pc(174) Class1_Sub6_Sub1 local174 = local167.method5098().method537(Static139.aClass57_1);
				@Pc(179) Class1_Sub5_Sub2 local179 = Static460.method2004(local174, local146);
				local179.method1972(-1);
				Static292.aClass1_Sub5_Sub1_2.method422(local179);
				arg2.aClass1_Sub5_Sub2_3 = local179;
			}
		}
		if (arg2.aClass1_Sub5_Sub2_2 != null) {
			arg2.aClass1_Sub5_Sub2_2.method1995(local146);
			if (arg2.aClass1_Sub5_Sub2_2.method5966()) {
				return;
			}
			arg2.aClass1_Sub5_Sub2_2 = null;
		} else if (arg2.anIntArray290 != null && (arg2.anInt3573 -= arg4) <= 0) {
			@Pc(213) int local213 = (int) (Math.random() * (double) arg2.anIntArray290.length);
			@Pc(221) Class215 local221 = Static463.method5099(Static453.aClass109_44, arg2.anIntArray290[local213], 0);
			if (local221 != null) {
				@Pc(228) Class1_Sub6_Sub1 local228 = local221.method5098().method537(Static139.aClass57_1);
				@Pc(233) Class1_Sub5_Sub2 local233 = Static460.method2004(local228, local146);
				local233.method1972(0);
				Static292.aClass1_Sub5_Sub1_2.method422(local233);
				arg2.aClass1_Sub5_Sub2_2 = local233;
				arg2.anInt3573 = arg2.anInt3561 + (int) ((double) (arg2.anInt3575 - arg2.anInt3561) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)Z")
	public static boolean method1513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static378.aBoolean549) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static276.aClass229ArrayArray1[local13] == null || Static276.aClass229ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class229 local35 = Static276.aClass229ArrayArray1[local13][local17];
		@Pc(58) Class1_Sub3 local58;
		if (arg0 == -1 && local35.anInt6863 == 0) {
			for (local58 = (Class1_Sub3) Static251.aClass142_26.method3199(); local58 != null; local58 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
				if (local58.anInt227 == 30 || local58.anInt227 == 1002 || local58.anInt227 == 46 || local58.anInt227 == 15 || local58.anInt227 == 47) {
					for (@Pc(89) Class229 local89 = Static203.method1670(local58.anInt226); local89 != null; local89 = Static409.method5548(local89)) {
						if (local89.anInt6923 == local35.anInt6923) {
							return true;
						}
					}
				}
			}
		} else {
			for (local58 = (Class1_Sub3) Static251.aClass142_26.method3199(); local58 != null; local58 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
				if (local58.anInt230 == arg0 && local35.anInt6923 == local58.anInt226 && (local58.anInt227 == 30 || local58.anInt227 == 1002 || local58.anInt227 == 46 || local58.anInt227 == 15 || local58.anInt227 == 47)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public static void method1514(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 12);
		local8.method28();
	}
}
