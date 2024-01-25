import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	public static int anInt1897;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public static int anInt1900;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!go;Lclient!ya;I)V")
	public static void method1630(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(31) boolean local31 = Static259.aClass206_2.method4324(arg0.anInt2609, arg0.anInt2599, arg0.anInt2596 | 0xFF000000, arg0.anInt2604, arg0.anInt2648, arg1, arg0.aBoolean151 ? Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1 : null) == null;
		if (local31) {
			Static1.aClass85_2.method2011(new Class7_Sub28(arg0.anInt2599, arg0.anInt2604, arg0.anInt2648, arg0.anInt2596 | 0xFF000000, arg0.anInt2609, arg0.aBoolean151));
			Static413.method5189(arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method1631() {
		Static55.aClass164_6.method3509();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
	public static void method1632(@OriginalArg(1) int arg0) {
		if (!Static252.method3355(arg0)) {
			return;
		}
		@Pc(14) Class95[] local14 = Static294.aClass95ArrayArray3[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class95 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2582 = 0;
				local22.anInt2621 = 0;
				local22.anInt2639 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
	public static boolean method1633(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 - arg2;
		@Pc(13) int local13 = arg5 + arg2;
		for (@Pc(15) int local15 = arg5; local15 < local13; local15++) {
			Static404.method5769(Static353.anIntArrayArray48[local15], arg6, arg1, arg0);
		}
		for (@Pc(40) int local40 = arg4; local40 > local9; local40--) {
			Static404.method5769(Static353.anIntArrayArray48[local40], arg6, arg1, arg0);
		}
		@Pc(58) int local58 = arg2 + arg6;
		@Pc(63) int local63 = arg1 - arg2;
		for (@Pc(65) int local65 = local13; local65 <= local9; local65++) {
			@Pc(71) int[] local71 = Static353.anIntArrayArray48[local65];
			Static404.method5769(local71, arg6, local58, arg0);
			Static404.method5769(local71, local58, local63, arg3);
			Static404.method5769(local71, local63, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V")
	public static void method1635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static35.aClass57_13.method1387(Static448.aClass55_146.method1205(Static5.anInt20));
		@Pc(24) int local24;
		for (@Pc(18) Class7_Sub39 local18 = (Class7_Sub39) Static237.aClass85_26.method2010(); local18 != null; local18 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			local24 = Static218.method3068(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static102.anInt2085 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > Static251.anInt4258) {
			local54 = Static251.anInt4258 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(73) int local73 = arg1;
		if (Static286.anInt4051 < arg1 + local24) {
			local73 = Static286.anInt4051 - local24;
		}
		Static415.anInt6598 = local54;
		if (local73 < 0) {
			local73 = 0;
		}
		Static351.anInt5637 = local73;
		Static171.anInt3077 = local13;
		Static253.anInt4289 = (Static425.aBoolean471 ? 26 : 22) + Static102.anInt2085 * 16;
		Static331.aBoolean372 = true;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I")
	public static int method1636(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
