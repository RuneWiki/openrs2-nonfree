import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "[[[Lclient!tg;")
	public static Class217[][][] aClass217ArrayArrayArray2;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "Lclient!dn;")
	public static Class56 aClass56_22;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_76 = new Class184(91, 3);

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!dn;)V")
	public static void method1631(@OriginalArg(1) Class56 arg0) {
		Static394.aClass56_80 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method1632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg0 == arg3 && arg7 == arg1 && arg5 == arg8) {
			Static26.method716(arg4, arg2, arg7, arg8, arg0);
			return;
		}
		@Pc(32) int local32 = arg4;
		@Pc(34) int local34 = arg0;
		@Pc(38) int local38 = arg4 * 3;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(67) int local67 = local46 + arg7 - local54 - arg4;
		@Pc(76) int local76 = local50 + arg8 - local58 - arg0;
		@Pc(86) int local86 = local38 + local54 - local46 - local46;
		@Pc(96) int local96 = local42 + local58 - local50 - local50;
		@Pc(100) int local100 = local46 - local38;
		@Pc(105) int local105 = local50 - local42;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local107 * local115 >> 12;
			@Pc(125) int local125 = local121 * local67;
			@Pc(129) int local129 = local121 * local76;
			@Pc(133) int local133 = local115 * local86;
			@Pc(137) int local137 = local96 * local115;
			@Pc(141) int local141 = local107 * local100;
			@Pc(145) int local145 = local105 * local107;
			@Pc(155) int local155 = arg4 + (local141 + local133 + local125 >> 12);
			@Pc(165) int local165 = (local137 + local129 + local145 >> 12) + arg0;
			Static26.method716(local32, arg2, local155, local165, local34);
			local32 = local155;
			local34 = local165;
		}
	}
}
