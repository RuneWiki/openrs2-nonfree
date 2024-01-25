import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!ls;")
	public static Class151 aClass151_2;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
	public static final int[] anIntArray449 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg1;
		@Pc(25) int local25 = arg3 - arg1;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = arg3 * arg3;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg3 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(74) int local74 = local45 + (1 - local61) * local29;
		@Pc(82) int local82 = local33 - (local61 - 1) * local49;
		@Pc(91) int local91 = local53 + local37 * (1 - local65);
		@Pc(100) int local100 = local41 - (local65 - 1) * local57;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = local49 * (local61 - 3);
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = (local65 - 3) * local57;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg3 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = local112 * (local25 - 1);
		@Pc(174) int local174;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (Static138.anInt932 <= arg6 && Static40.anInt818 >= arg6) {
			@Pc(166) int[] local166 = Static15.anIntArrayArray1[arg6];
			local174 = Static93.method1862(arg5 - arg0, Static235.anInt4193, Static243.anInt4326);
			local184 = Static93.method1862(arg5 + arg0, Static235.anInt4193, Static243.anInt4326);
			local193 = Static93.method1862(arg5 - local16, Static235.anInt4193, Static243.anInt4326);
			local201 = Static93.method1862(local16 + arg5, Static235.anInt4193, Static243.anInt4326);
			Static315.method4662(local193, local166, local174, arg4);
			Static315.method4662(local201, local166, local193, arg2);
			Static315.method4662(local184, local166, local201, arg4);
		}
		while (local9 > 0) {
			@Pc(232) boolean local232 = local25 >= local9;
			if (local74 < 0) {
				while (local74 < 0) {
					local74 += local120;
					local82 += local138;
					local120 += local108;
					local7++;
					local138 += local108;
				}
			}
			if (local232) {
				if (local91 < 0) {
					while (local91 < 0) {
						local100 += local146;
						local91 += local130;
						local130 += local116;
						local146 += local116;
						local11++;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local91 += local130;
					local146 += local116;
					local130 += local116;
					local11++;
				}
				local100 += -local136;
				local91 += -local152;
				local152 -= local112;
				local136 -= local112;
			}
			if (local82 < 0) {
				local82 += local138;
				local74 += local120;
				local120 += local108;
				local138 += local108;
				local7++;
			}
			local82 += -local126;
			local74 += -local144;
			local9--;
			local144 -= local104;
			local126 -= local104;
			local174 = arg6 - local9;
			local184 = arg6 + local9;
			if (Static138.anInt932 <= local184 && local174 <= Static40.anInt818) {
				local193 = Static93.method1862(local7 + arg5, Static235.anInt4193, Static243.anInt4326);
				local201 = Static93.method1862(arg5 - local7, Static235.anInt4193, Static243.anInt4326);
				if (local232) {
					@Pc(447) int local447 = Static93.method1862(local11 + arg5, Static235.anInt4193, Static243.anInt4326);
					@Pc(458) int local458 = Static93.method1862(arg5 - local11, Static235.anInt4193, Static243.anInt4326);
					@Pc(469) int[] local469;
					if (local174 >= Static138.anInt932) {
						local469 = Static15.anIntArrayArray1[local174];
						Static315.method4662(local458, local469, local201, arg4);
						Static315.method4662(local447, local469, local458, arg2);
						Static315.method4662(local193, local469, local447, arg4);
					}
					if (local184 <= Static40.anInt818) {
						local469 = Static15.anIntArrayArray1[local184];
						Static315.method4662(local458, local469, local201, arg4);
						Static315.method4662(local447, local469, local458, arg2);
						Static315.method4662(local193, local469, local447, arg4);
					}
				} else {
					if (Static138.anInt932 <= local174) {
						Static315.method4662(local193, Static15.anIntArrayArray1[local174], local201, arg4);
					}
					if (Static40.anInt818 >= local184) {
						Static315.method4662(local193, Static15.anIntArrayArray1[local184], local201, arg4);
					}
				}
			}
		}
	}
}
