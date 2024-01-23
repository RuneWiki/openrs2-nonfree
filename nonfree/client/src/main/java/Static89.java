import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public static int anInt1687;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString48 = "Loaded input handler";

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString49 = "level: ";

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	public static void method1464() {
		Static163.aClass31_35.method856(5);
		Static190.aClass31_28.method856(5);
		Static55.aClass31_10.method856(5);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)I")
	public static int method1465(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void method1467() {
		Static196.method2977();
		Static98.anInt1879 = -1;
		Static206.aClass1_Sub2_Sub2_9 = null;
		Static115.method1779();
		Static96.aClass64_15.method1463();
		Static152.aClass169_1 = new Class169();
		((Class40_Sub1) Static208.anInterface4_1).method996();
		Static172.method2612();
		Static194.aClass72Array1 = new Class72[255];
		Static194.anInt3733 = 0;
		Static132.method2114();
		Static78.method1341();
		Static171.method2601();
		Static115.method1777(false);
		Static67.method1154();
		Static223.method3577();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(49) Class6_Sub6_Sub2 local49 = Static77.aClass6_Sub6_Sub2Array1[local42];
			if (local49 != null) {
				local49.anObject6 = null;
			}
		}
		if (Static240.aBoolean369) {
			Static78.method1344();
			Static260.method4026(Static41.aBoolean82);
			Static200.method3048();
		}
		Static77.method1325(Static39.aClass7_39, Static58.aClass7_58);
		Static222.method3549(Static58.aClass7_58);
		Static13.aClass1_Sub2_Sub2_7 = null;
		Static244.aClass1_Sub2_Sub2_11 = null;
		Static13.aClass1_Sub2_Sub2_8 = null;
		Static6.aClass1_Sub2_Sub2_1 = null;
		Static108.aClass1_Sub2_Sub2_5 = null;
		if (Static98.anInt1878 == 5) {
			Static223.method3575(Static58.aClass7_58);
		}
		if (Static98.anInt1878 == 10) {
			Static26.method442(false);
		}
		if (Static98.anInt1878 == 30) {
			Static299.method4554(25);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([III[[ILclient!fn;I[[F[[FLclient!hm;I[[F)V")
	public static void method1469(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) Class72 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9) {
		@Pc(15) int[] local15 = new int[arg0.length / 2];
		for (@Pc(21) int local21 = 0; local21 < local15.length; local21++) {
			@Pc(35) int local35 = arg0[local21 + local21];
			@Pc(43) int local43 = arg0[local21 + local21 + 1];
			@Pc(68) int local68;
			if (arg8 == 1) {
				local68 = local35;
				local35 = local43;
				local43 = 128 - local68;
			} else if (arg8 == 2) {
				local35 = 128 - local35;
				local43 = 128 - local43;
			} else if (arg8 == 3) {
				local68 = local35;
				local35 = 128 - local43;
				local43 = local68;
			}
			@Pc(138) float local138;
			@Pc(128) float local128;
			@Pc(118) float local118;
			if (local35 == 0 && local43 == 0) {
				local138 = arg9[arg2][arg1];
				local128 = arg6[arg2][arg1];
				local118 = arg5[arg2][arg1];
			} else if (local35 == 128 && local43 == 0) {
				local128 = arg6[arg2 + 1][arg1];
				local118 = arg5[arg2 + 1][arg1];
				local138 = arg9[arg2 + 1][arg1];
			} else if (local35 == 128 && local43 == 128) {
				local118 = arg5[arg2 + 1][arg1 + 1];
				local128 = arg6[arg2 + 1][arg1 + 1];
				local138 = arg9[arg2 + 1][arg1 + 1];
			} else if (local35 == 0 && local43 == 128) {
				local118 = arg5[arg2][arg1 + 1];
				local128 = arg6[arg2][arg1 + 1];
				local138 = arg9[arg2][arg1 + 1];
			} else {
				local128 = arg6[arg2][arg1];
				local138 = arg9[arg2][arg1];
				local118 = arg5[arg2][arg1];
				@Pc(173) float local173 = (float) local35 / 128.0F;
				@Pc(178) float local178 = (float) local43 / 128.0F;
				@Pc(193) float local193 = local138 + local173 * (arg9[arg2 + 1][arg1] - local138);
				@Pc(208) float local208 = local118 + local173 * (arg5[arg2 + 1][arg1] - local118);
				@Pc(223) float local223 = local128 + local173 * (arg6[arg2 + 1][arg1] - local128);
				@Pc(231) float local231 = arg9[arg2][arg1 + 1];
				@Pc(248) float local248 = local231 + local173 * (arg9[arg2 + 1][arg1 + 1] - local231);
				@Pc(256) float local256 = arg5[arg2][arg1 + 1];
				@Pc(273) float local273 = local256 + (arg5[arg2 + 1][arg1 + 1] - local256) * local173;
				local138 = local193 + local178 * (local248 - local193);
				local118 = local208 + (local273 - local208) * local178;
				@Pc(299) float local299 = arg6[arg2][arg1 + 1];
				@Pc(316) float local316 = local299 + local173 * (arg6[arg2 + 1][arg1 + 1] - local299);
				local128 = local223 + local178 * (local316 - local223);
			}
			@Pc(402) int local402 = local35 + (arg2 << 7);
			@Pc(410) int local410 = Static291.method4468(local35, arg2, arg1, local43, arg3);
			@Pc(416) int local416 = (arg1 << 7) + local43;
			local15[local21] = arg4.method1393(arg7, local402, local410, local416, local118, local138, local128);
		}
		arg4.method1395(local15);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
	public static void method1472(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(5, arg0);
		local8.method1853();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!og;I)V")
	public static void method1474(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class127 arg1) {
		@Pc(15) int local15 = arg1.anInt3631 == 0 ? arg1.anInt3567 : arg1.anInt3631;
		@Pc(24) int local24 = arg1.anInt3600 == 0 ? arg1.anInt3595 : arg1.anInt3600;
		Static277.method4260(local15, local24, arg0, arg1.anInt3574, Static86.aClass127ArrayArray1[arg1.anInt3574 >> 16]);
		if (arg1.aClass127Array1 != null) {
			Static277.method4260(local15, local24, arg0, arg1.anInt3574, arg1.aClass127Array1);
		}
		@Pc(84) Class1_Sub32 local84 = (Class1_Sub32) Static67.aClass22_7.method633((long) arg1.anInt3574);
		if (local84 != null) {
			Static236.method3749(local24, arg0, local84.anInt5665, local15);
		}
	}
}
