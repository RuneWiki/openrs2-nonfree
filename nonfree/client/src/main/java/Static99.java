import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_20;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public static int anInt2146 = 2301979;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	public static int anInt2151 = 0;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_478 = Static199.method3560("Null");

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILclient!mj;)V")
	public static void method1694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64 arg2) {
		if (Static227.aClass64_17 != null || Static202.aBoolean194 || (arg2 == null || Static57.method454(arg2) == null)) {
			return;
		}
		Static227.aClass64_17 = arg2;
		Static223.aClass64_14 = Static57.method454(arg2);
		Static148.anInt3382 = arg1;
		Static225.anInt4887 = 0;
		Static60.aBoolean39 = false;
		Static114.anInt2545 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
	public static int method1695(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	public static void method1696(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static202.aBooleanArray124[arg0]) {
			return;
		}
		Static11.aClass72_19.method3180(arg0);
		if (Static181.aClass64ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < Static181.aClass64ArrayArray1[arg0].length; local29++) {
			if (Static181.aClass64ArrayArray1[arg0][local29] != null) {
				if (Static181.aClass64ArrayArray1[arg0][local29].anInt3051 == 2) {
					local27 = false;
				} else {
					Static181.aClass64ArrayArray1[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			Static181.aClass64ArrayArray1[arg0] = null;
		}
		Static202.aBooleanArray124[arg0] = false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = Static80.method1342(arg4, Static73.anInt1576, Static137.anInt3137);
		@Pc(21) int local21 = Static80.method1342(arg5, Static73.anInt1576, Static137.anInt3137);
		@Pc(27) int local27 = Static80.method1342(arg0, Static6.anInt187, Static101.anInt2213);
		@Pc(33) int local33 = Static80.method1342(arg3, Static6.anInt187, Static101.anInt2213);
		@Pc(41) int local41 = Static80.method1342(arg4 + arg1, Static73.anInt1576, Static137.anInt3137);
		@Pc(49) int local49 = Static80.method1342(arg5 - arg1, Static73.anInt1576, Static137.anInt3137);
		for (@Pc(51) int local51 = local15; local51 < local41; local51++) {
			Static221.method3893(arg6, local27, Static183.anIntArrayArray40[local51], local33);
		}
		for (@Pc(67) int local67 = local21; local67 > local49; local67--) {
			Static221.method3893(arg6, local27, Static183.anIntArrayArray40[local67], local33);
		}
		@Pc(90) int local90 = Static80.method1342(arg0 + arg1, Static6.anInt187, Static101.anInt2213);
		@Pc(99) int local99 = Static80.method1342(arg3 - arg1, Static6.anInt187, Static101.anInt2213);
		for (@Pc(101) int local101 = local41; local101 <= local49; local101++) {
			@Pc(107) int[] local107 = Static183.anIntArrayArray40[local101];
			Static221.method3893(arg6, local27, local107, local90);
			Static221.method3893(arg2, local90, local107, local99);
			Static221.method3893(arg6, local99, local107, local33);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[S[Lclient!qe;I)V")
	public static void method1701(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) Class78[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(13) int local13 = (arg3 + arg0) / 2;
		@Pc(17) Class78 local17 = arg2[local13];
		@Pc(19) int local19 = arg3;
		arg2[local13] = arg2[arg0];
		arg2[arg0] = local17;
		@Pc(33) short local33 = arg1[local13];
		arg1[local13] = arg1[arg0];
		arg1[arg0] = local33;
		for (@Pc(45) int local45 = arg3; local45 < arg0; local45++) {
			if (local17 == null || arg2[local45] != null && arg2[local45].method3047(local17) < (local45 & 0x1)) {
				@Pc(66) Class78 local66 = arg2[local45];
				arg2[local45] = arg2[local19];
				arg2[local19] = local66;
				@Pc(80) short local80 = arg1[local45];
				arg1[local45] = arg1[local19];
				arg1[local19++] = local80;
			}
		}
		arg2[arg0] = arg2[local19];
		arg2[local19] = local17;
		arg1[arg0] = arg1[local19];
		arg1[local19] = local33;
		method1701(local19 - 1, arg1, arg2, arg3);
		method1701(arg0, arg1, arg2, local19 + 1);
	}
}
