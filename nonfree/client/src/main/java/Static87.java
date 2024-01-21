import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "Lclient!bf;")
	public static Class11 aClass11_53;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lclient!sd;")
	public static Class2 aClass2_16;

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "Lclient!te;")
	public static Class3_Sub1_Sub17 aClass3_Sub1_Sub17_3 = null;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!bf;BLclient!bf;Lclient!bf;)V")
	public static void method1473(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static58.aClass11_35 = arg1;
		Static101.aClass11_64 = arg2;
		Static61.aClass11_36 = arg0;
		Static31.aClass3_Sub1_Sub17ArrayArray3 = new Class3_Sub1_Sub17[Static101.aClass11_64.method1865()][];
		Static36.aBooleanArray21 = new boolean[Static101.aClass11_64.method1865()];
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!bf;Lclient!bf;)V")
	public static void method1474(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static70.aClass11_40 = arg0;
		Static43.aClass11_24 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1476() {
		aClass11_53 = null;
		aClass3_Sub1_Sub17_3 = null;
		aClass2_16 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method1481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class3_Sub11 local7 = null;
		for (@Pc(17) Class3_Sub11 local17 = (Class3_Sub11) Static17.aClass51_3.method1316(); local17 != null; local17 = (Class3_Sub11) Static17.aClass51_3.method1310()) {
			if (arg3 == local17.anInt2275 && local17.anInt2278 == arg8 && local17.anInt2285 == arg1 && arg6 == local17.anInt2279) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub11();
			local7.anInt2275 = arg3;
			local7.anInt2285 = arg1;
			local7.anInt2278 = arg8;
			local7.anInt2279 = arg6;
			Static110.method1918(local7);
			Static17.aClass51_3.method1303(local7);
		}
		local7.anInt2282 = arg4;
		local7.anInt2287 = arg0;
		local7.anInt2273 = arg2;
		local7.anInt2274 = arg5;
		local7.anInt2276 = arg7;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public static void method1482() {
		for (@Pc(18) Class3_Sub10 local18 = (Class3_Sub10) Static5.aClass51_1.method1316(); local18 != null; local18 = (Class3_Sub10) Static5.aClass51_1.method1310()) {
			if (local18.aClass3_Sub2_Sub2_1 != null) {
				Static1.aClass3_Sub2_Sub1_1.method343(local18.aClass3_Sub2_Sub2_1);
				local18.aClass3_Sub2_Sub2_1 = null;
			}
			if (local18.aClass3_Sub2_Sub2_2 != null) {
				Static1.aClass3_Sub2_Sub1_1.method343(local18.aClass3_Sub2_Sub2_2);
				local18.aClass3_Sub2_Sub2_2 = null;
			}
		}
		Static5.aClass51_1.method1300();
	}
}
