import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!jb;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "[Lclient!dc;")
	public static Class20[] aClass20Array13;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public static int anInt1966;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_728 = Static161.method2452("OFF");

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Lclient!dc;")
	public static Class20 aClass20_726 = aClass20_728;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	public static int anInt1963 = 0;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_727 = Static161.method2452("::");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBIII)V")
	public static void method1512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static27.method409(arg3 + arg4, arg0, Static9.anIntArrayArray1[arg1], arg4 - arg3);
		@Pc(24) int local24 = arg2;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(38) int local38 = local34 << 1;
		@Pc(42) int local42 = arg2 << 1;
		@Pc(46) int local46 = local28 << 1;
		@Pc(50) int local50 = local34 << 2;
		@Pc(59) int local59 = local34 - local46 * (local42 - 1);
		@Pc(68) int local68 = local28 * (1 - local42) + local38;
		@Pc(76) int local76 = ((arg2 << 1) - 3) * local46;
		@Pc(80) int local80 = local28 << 2;
		@Pc(88) int local88 = local38 * 3;
		@Pc(94) int local94 = local80 * (arg2 - 1);
		@Pc(100) int local100 = local50;
		while (local24 > 0) {
			local24--;
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local88;
					local59 += local100;
					local100 += local50;
					local88 += local50;
					local30++;
				}
			}
			@Pc(134) int local134 = arg1 - local24;
			@Pc(138) int local138 = local24 + arg1;
			if (local59 < 0) {
				local59 += local100;
				local100 += local50;
				local68 += local88;
				local30++;
				local88 += local50;
			}
			local68 += -local94;
			local94 -= local80;
			local59 += -local76;
			@Pc(178) int local178 = arg4 - local30;
			local76 -= local80;
			@Pc(187) int local187 = arg4 + local30;
			Static27.method409(local187, arg0, Static9.anIntArrayArray1[local134], local178);
			Static27.method409(local187, arg0, Static9.anIntArrayArray1[local138], local178);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([BIII)Lclient!dc;")
	public static Class20 method1513(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class20 local9 = new Class20();
		local9.aByteArray10 = new byte[arg1];
		local9.anInt712 = 0;
		for (@Pc(18) int local18 = arg2; local18 < arg1 + arg2; local18++) {
			if (arg0[local18] != 0) {
				local9.aByteArray10[local9.anInt712++] = arg0[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!mf;)V")
	public static void method1515(@OriginalArg(1) Class69 arg0) {
		@Pc(6) int local6 = arg0.anInt2550;
		if (local6 == 324) {
			if (Static9.anInt209 == -1) {
				Static9.anInt209 = arg0.anInt2505;
				Static136.anInt2848 = arg0.anInt2518;
			}
			if (Static159.aClass56_2.aBoolean93) {
				arg0.anInt2505 = Static9.anInt209;
			} else {
				arg0.anInt2505 = Static136.anInt2848;
			}
		} else if (local6 == 325) {
			if (Static9.anInt209 == -1) {
				Static9.anInt209 = arg0.anInt2505;
				Static136.anInt2848 = arg0.anInt2518;
			}
			if (Static159.aClass56_2.aBoolean93) {
				arg0.anInt2505 = Static136.anInt2848;
			} else {
				arg0.anInt2505 = Static9.anInt209;
			}
		} else if (local6 == 327) {
			arg0.anInt2529 = 150;
			arg0.anInt2531 = (int) (Math.sin((double) Static177.anInt3533 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2520 = -1;
			arg0.anInt2532 = 5;
		} else if (local6 == 328) {
			if (Static210.aClass1_Sub2_Sub2_2.aClass20_848 == null) {
				arg0.anInt2520 = 0;
			} else {
				arg0.anInt2529 = 150;
				arg0.anInt2531 = (int) (Math.sin((double) Static177.anInt3533 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2532 = 5;
				arg0.anInt2520 = ((int) Static210.aClass1_Sub2_Sub2_2.aClass20_848.method595() << 11) + 2047;
				arg0.anInt2476 = Static210.aClass1_Sub2_Sub2_2.anInt2215;
				arg0.anInt2525 = Static210.aClass1_Sub2_Sub2_2.anInt2222;
			}
		}
	}
}
