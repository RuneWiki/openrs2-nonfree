import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!wa;")
	public static Class23 aClass23_37;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
	public static final int[] anIntArray187 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_694 = Static161.method2452("Hidden)2");

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_695 = Static161.method2452("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!dc;")
	public static Class20 aClass20_696 = aClass20_695;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public static void method1472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass29_1 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1473() {
		if (Static170.anInt3428 > 0) {
			Static74.method1215();
		} else {
			Static208.method3109(40);
			Static180.aClass39_4 = Static157.aClass39_3;
			Static157.aClass39_3 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
	public static void method1474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class91 local11 = Static159.aClass91ArrayArrayArray1[Static111.anInt2327][arg0][arg1];
		if (local11 == null) {
			Static59.method1011(Static111.anInt2327, arg0, arg1);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(25) Class5_Sub2_Sub1 local25 = (Class5_Sub2_Sub1) local11.method2684();
		@Pc(27) Class5_Sub2_Sub1 local27 = null;
		while (local25 != null) {
			@Pc(34) Class5_Sub2_Sub11 local34 = Static196.method2908(local25.aClass1_Sub3_1.anInt1380);
			@Pc(37) int local37 = local34.anInt2354;
			if (local34.anInt2314 == 1) {
				local37 *= local25.aClass1_Sub3_1.anInt1383 + 1;
			}
			if (local37 > local20) {
				local27 = local25;
				local20 = local37;
			}
			local25 = (Class5_Sub2_Sub1) local11.method2678();
		}
		if (local27 == null) {
			Static59.method1011(Static111.anInt2327, arg0, arg1);
			return;
		}
		local11.method2681(local27);
		local25 = (Class5_Sub2_Sub1) local11.method2684();
		@Pc(92) Class1_Sub3 local92 = null;
		@Pc(94) Class1_Sub3 local94 = null;
		while (local25 != null) {
			@Pc(98) Class1_Sub3 local98 = local25.aClass1_Sub3_1;
			if (local98.anInt1380 != local27.aClass1_Sub3_1.anInt1380) {
				if (local92 == null) {
					local92 = local98;
				}
				if (local92.anInt1380 != local98.anInt1380 && local94 == null) {
					local94 = local98;
				}
			}
			local25 = (Class5_Sub2_Sub1) local11.method2678();
		}
		@Pc(141) long local141 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static82.method1414(Static111.anInt2327, arg0, arg1, Static128.method1999(Static111.anInt2327, arg0 * 128 + 64, arg1 * 128 + 64), local27.aClass1_Sub3_1, local141, local92, local94);
	}
}
