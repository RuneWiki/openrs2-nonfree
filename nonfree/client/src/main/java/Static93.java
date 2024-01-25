import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1678 = 0;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!es;")
	public static final Class73 aClass73_1 = new Class73("WTWIP", 3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lclient!t;")
	public static Class25_Sub2 method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class25_Sub2 local14 = local7.aClass25_Sub2_1;
			local7.aClass25_Sub2_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V")
	public static void method1366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg2 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(94) int local94;
		@Pc(103) int local103;
		if (Static194.anInt3448 <= arg4 && arg4 <= Static264.anInt4589) {
			local94 = Static140.method5231(arg0 + arg3, Static98.anInt1774, Static372.anInt1561);
			local103 = Static140.method5231(arg3 - arg0, Static98.anInt1774, Static372.anInt1561);
			Static382.method5419(Static369.anIntArrayArray35[arg4], local103, local94, arg1);
		}
		@Pc(117) int local117 = (arg2 - 1) * local50;
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local62;
					local46 += local76;
					local76 += local54;
					local62 += local54;
					local7++;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local37 += local62;
				local7++;
				local62 += local54;
				local76 += local54;
			}
			local37 += -local117;
			local46 += -local70;
			local70 -= local50;
			local9--;
			local117 -= local50;
			local94 = arg4 - local9;
			local103 = local9 + arg4;
			if (Static194.anInt3448 <= local103 && Static264.anInt4589 >= local94) {
				@Pc(213) int local213 = Static140.method5231(local7 + arg3, Static98.anInt1774, Static372.anInt1561);
				@Pc(222) int local222 = Static140.method5231(arg3 - local7, Static98.anInt1774, Static372.anInt1561);
				if (local94 >= Static194.anInt3448) {
					Static382.method5419(Static369.anIntArrayArray35[local94], local222, local213, arg1);
				}
				if (Static264.anInt4589 >= local103) {
					Static382.method5419(Static369.anIntArrayArray35[local103], local222, local213, arg1);
				}
			}
		}
	}
}
