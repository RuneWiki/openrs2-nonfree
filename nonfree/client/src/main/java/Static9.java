import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public static int anInt105;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public static int anInt99 = 100;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static7.anInt93 && arg2 <= Static115.anInt2377 && Static7.anInt93 <= arg3 && Static115.anInt2377 >= arg3 && Static7.anInt93 <= arg1 && arg1 <= Static115.anInt2377 && arg5 >= Static7.anInt93 && arg5 <= Static115.anInt2377 && arg0 >= Static374.anInt5986 && Static84.anInt1667 >= arg0 && arg4 >= Static374.anInt5986 && Static84.anInt1667 >= arg4 && Static374.anInt5986 <= arg7 && Static84.anInt1667 >= arg7 && Static374.anInt5986 <= arg6 && Static84.anInt1667 >= arg6) {
			Static441.method6271(arg4, arg5, arg2, arg7, arg3, arg1, arg8, arg6, arg0);
		} else {
			Static611.method8672(arg5, arg4, arg3, arg6, arg0, arg7, arg1, arg8, arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static352.method5230(arg5, arg0, arg4)) {
			return false;
		}
		@Pc(15) int local15 = Static78.anIntArray317[1];
		@Pc(19) int local19 = Static78.anIntArray317[2];
		@Pc(23) int local23 = Static78.anIntArray317[0];
		if (!Static352.method5230(arg7, arg6, arg3)) {
			return false;
		}
		@Pc(35) int local35 = Static78.anIntArray317[2];
		@Pc(39) int local39 = Static78.anIntArray317[0];
		@Pc(43) int local43 = Static78.anIntArray317[1];
		if (Static352.method5230(arg8, arg2, arg1)) {
			@Pc(55) int local55 = Static78.anIntArray317[1];
			@Pc(59) int local59 = Static78.anIntArray317[2];
			@Pc(63) int local63 = Static78.anIntArray317[0];
			return Static385.method5505(local23, local63, local39, local35, local59, local55, local15, local43, local19);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V")
	public static void method161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(24) int local24 = arg0 - arg1;
		@Pc(28) int local28 = arg6 + arg1;
		for (@Pc(30) int local30 = arg6; local30 < local28; local30++) {
			Static483.method7014(Static392.anIntArrayArray39[local30], arg4, arg5, arg2);
		}
		@Pc(49) int local49 = arg5 - arg1;
		for (@Pc(51) int local51 = arg0; local51 > local24; local51--) {
			Static483.method7014(Static392.anIntArrayArray39[local51], arg4, arg5, arg2);
		}
		@Pc(69) int local69 = arg1 + arg4;
		for (@Pc(71) int local71 = local28; local71 <= local24; local71++) {
			@Pc(77) int[] local77 = Static392.anIntArrayArray39[local71];
			Static483.method7014(local77, arg4, local69, arg2);
			Static483.method7014(local77, local69, local49, arg3);
			Static483.method7014(local77, local49, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!aj;[ILclient!aj;B)V")
	public static void method162(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class15 arg2) {
		if (arg1 != null) {
			Static532.anIntArray747 = arg1;
		}
		Static330.aClass15_88 = arg0;
		Static81.aClass15_24 = arg2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method164() {
		@Pc(13) Class165 local13 = Static643.aClass165_77;
		synchronized (Static643.aClass165_77) {
			Static643.aClass165_77.method4403();
		}
		local13 = Static291.aClass165_34;
		synchronized (Static291.aClass165_34) {
			Static291.aClass165_34.method4403();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([FIIIII[FIZIF)V")
	public static void method165(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg5 - arg3;
		@Pc(9) int local9 = arg4 - arg7;
		@Pc(17) int local17 = arg2 - arg1;
		@Pc(38) float local38 = (float) local9 * arg6[2] + (float) local17 * arg6[0] + arg6[1] * (float) local5;
		@Pc(59) float local59 = arg6[5] * (float) local9 + (float) local17 * arg6[3] + arg6[4] * (float) local5;
		@Pc(80) float local80 = arg6[8] * (float) local9 + (float) local5 * arg6[7] + arg6[6] * (float) local17;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg9 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(129) float local129;
		if (arg8 == 1) {
			local129 = local111;
			local111 = -local124;
			local124 = local129;
		} else if (arg8 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg8 == 3) {
			local129 = local111;
			local111 = local124;
			local124 = -local129;
		}
		arg0[0] = local111;
		arg0[1] = local124;
	}
}
