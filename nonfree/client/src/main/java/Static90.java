import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!fa;")
	public static Class63 aClass63_3;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "[Lclient!oo;")
	public static Class104_Sub1[] aClass104_Sub1Array3 = new Class104_Sub1[0];

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	public static int anInt2274 = -1;

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_71 = new Class34("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(21) int local21 = arg5 - arg3;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(89) int local89 = (1 - local61) * local33 + local49;
		@Pc(98) int local98 = local37 - local53 * (local61 - 1);
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(115) int local115 = local33 << 2;
		@Pc(119) int local119 = local37 << 2;
		@Pc(123) int local123 = local41 * 3;
		@Pc(129) int local129 = (local57 - 3) * local45;
		@Pc(133) int local133 = local49 * 3;
		@Pc(139) int local139 = (local61 - 3) * local53;
		@Pc(141) int local141 = local106;
		@Pc(147) int local147 = local102 * (arg5 - 1);
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = (local21 - 1) * local115;
		@Pc(159) int[] local159 = Static344.anIntArrayArray65[arg1];
		Static39.method919(arg4, local159, arg2 - local16, -arg0 + arg2);
		Static39.method919(arg6, local159, local16 + arg2, arg2 - local16);
		Static39.method919(arg4, local159, arg2 + arg0, arg2 + local16);
		while (local9 > 0) {
			@Pc(203) boolean local203 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local123;
					local79 += local141;
					local7++;
					local123 += local106;
					local141 += local106;
				}
			}
			if (local203) {
				if (local89 < 0) {
					while (local89 < 0) {
						local98 += local149;
						local89 += local133;
						local133 += local119;
						local11++;
						local149 += local119;
					}
				}
				if (local98 < 0) {
					local98 += local149;
					local89 += local133;
					local149 += local119;
					local133 += local119;
					local11++;
				}
				local98 += -local139;
				local89 += -local155;
				local139 -= local115;
				local155 -= local115;
			}
			if (local79 < 0) {
				local79 += local141;
				local70 += local123;
				local7++;
				local141 += local106;
				local123 += local106;
			}
			local70 += -local147;
			local79 += -local129;
			local147 -= local102;
			local9--;
			local129 -= local102;
			@Pc(342) int local342 = arg1 - local9;
			@Pc(347) int local347 = arg1 + local9;
			@Pc(351) int local351 = arg2 + local7;
			@Pc(356) int local356 = arg2 - local7;
			if (local203) {
				@Pc(384) int local384 = local11 + arg2;
				@Pc(389) int local389 = arg2 - local11;
				Static39.method919(arg4, Static344.anIntArrayArray65[local342], local389, local356);
				Static39.method919(arg6, Static344.anIntArrayArray65[local342], local384, local389);
				Static39.method919(arg4, Static344.anIntArrayArray65[local342], local351, local384);
				Static39.method919(arg4, Static344.anIntArrayArray65[local347], local389, local356);
				Static39.method919(arg6, Static344.anIntArrayArray65[local347], local384, local389);
				Static39.method919(arg4, Static344.anIntArrayArray65[local347], local351, local384);
			} else {
				Static39.method919(arg4, Static344.anIntArrayArray65[local342], local351, local356);
				Static39.method919(arg4, Static344.anIntArrayArray65[local347], local351, local356);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
	public static boolean method1960(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 23 || arg0 == 22 || arg0 == 49 || arg0 == 5) {
			return true;
		} else {
			return arg0 == 4 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1961(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
