import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1 aClass2_Sub2_Sub16_Sub1_4;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "Lclient!wi;")
	public static Class108 aClass108_8 = new Class108();

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "[I")
	public static int[] anIntArray228 = new int[25];

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "[I")
	public static int[] anIntArray229 = new int[128];

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "Lclient!i;")
	public static Class41 aClass41_671 = Static184.method2923("welle2:");

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
	public static int anInt2287 = 0;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "Lclient!i;")
	public static Class41 aClass41_672 = Static184.method2923("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIBI)V")
	public static void method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg1 - arg3;
		@Pc(11) int local11 = arg4 - arg0;
		if (local11 == 0) {
			if (local6 != 0) {
				Static95.method1664(arg2, arg3, arg0, arg1);
			}
		} else if (local6 == 0) {
			Static42.method172(arg3, arg4, arg0, arg2);
		} else {
			if (local11 < 0) {
				local11 = -local11;
			}
			if (local6 < 0) {
				local6 = -local6;
			}
			@Pc(58) boolean local58 = local11 < local6;
			@Pc(62) int local62;
			@Pc(68) int local68;
			if (local58) {
				local62 = arg0;
				arg0 = arg3;
				arg3 = local62;
				local68 = arg4;
				arg4 = arg1;
				arg1 = local68;
			}
			if (arg4 < arg0) {
				local62 = arg0;
				local68 = arg3;
				arg3 = arg1;
				arg0 = arg4;
				arg1 = local68;
				arg4 = local62;
			}
			@Pc(92) int local92 = arg1 - arg3;
			local68 = arg4 - arg0;
			if (local92 < 0) {
				local92 = -local92;
			}
			local62 = arg3;
			@Pc(119) int local119 = -(local68 >> 1);
			@Pc(130) int local130 = arg3 < arg1 ? 1 : -1;
			@Pc(134) int local134;
			if (local58) {
				for (local134 = arg0; local134 <= arg4; local134++) {
					Static3.anIntArrayArray1[local134][local62] = arg2;
					local119 += local92;
					if (local119 > 0) {
						local62 += local130;
						local119 -= local68;
					}
				}
			} else {
				for (local134 = arg0; local134 <= arg4; local134++) {
					Static3.anIntArrayArray1[local62][local134] = arg2;
					local119 += local92;
					if (local119 > 0) {
						local119 -= local68;
						local62 += local130;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ea;Z)V")
	public static void method1619(@OriginalArg(0) Class2_Sub3 arg0) {
		if (Static157.aClass56_3 != null) {
			try {
				Static157.aClass56_3.method1794(0L);
				Static157.aClass56_3.method1782(arg0.aByteArray4, 24, arg0.anInt239);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt239 += 24;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Z")
	public static boolean method1620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)I")
	public static int method1623() {
		return Static100.anInt2446;
	}
}
