import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "Lclient!dp;")
	public static Class53 aClass53_86;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_8 = new Class31(128);

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	public static int anInt2907 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!ri;)V")
	public static void method3104(@OriginalArg(1) Class44_Sub4_Sub4_Sub2 arg0) {
		for (@Pc(18) Class6_Sub39 local18 = (Class6_Sub39) Static113.aClass211_17.method5594(); local18 != null; local18 = (Class6_Sub39) Static113.aClass211_17.method5582()) {
			if (local18.aClass44_Sub4_Sub4_Sub2_1 == arg0) {
				if (local18.aClass6_Sub12_Sub4_3 != null) {
					Static241.aClass6_Sub12_Sub3_6.method4902(local18.aClass6_Sub12_Sub4_3);
					local18.aClass6_Sub12_Sub4_3 = null;
				}
				local18.method5756();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public static void method3105() {
		Static340.anInt657 = 0;
		Static299.anInt5652 = -1;
		Static238.anInt5126 = -1;
		Static24.anInt385 = -1;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!dp;I)V")
	public static void method3106(@OriginalArg(0) Class53 arg0) {
		Static156.aClass53_151 = arg0;
		Static226.anInt4220 = Static156.aClass53_151.method1011(4);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIILclient!pe;)V")
	public static void method3107(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class44_Sub4_Sub4 arg3) {
		Static144.method2691(arg2, 0, arg1, arg3.anInt6339, arg3.anInt6340, arg0);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBII)I")
	public static int method3108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(28) int local28 = Static87.method1481(local17, local7);
		@Pc(35) int local35 = Static87.method1481(local17, local7 + 1);
		@Pc(42) int local42 = Static87.method1481(local17 + 1, local7);
		@Pc(58) int local58 = Static87.method1481(local17 + 1, local7 + 1);
		@Pc(65) int local65 = Static218.method3882(arg0, local35, local13, local28);
		@Pc(72) int local72 = Static218.method3882(arg0, local58, local13, local42);
		return Static218.method3882(arg0, local72, local23, local65);
	}
}
