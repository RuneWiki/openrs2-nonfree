import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray55;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1328 = Static118.method2249("logo");

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static volatile int anInt2182 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(16) int local16 = arg5;
		@Pc(20) int local20 = arg6 - arg0;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(29) int local29 = arg5 - arg0;
		@Pc(33) int local33 = local20 * local20;
		@Pc(37) int local37 = local29 * local29;
		@Pc(41) int local41 = arg5 * arg5;
		@Pc(45) int local45 = local41 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local24 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(61) int local61 = arg5 << 1;
		@Pc(65) int local65 = local29 << 1;
		@Pc(74) int local74 = local45 + local24 * (1 - local61);
		@Pc(83) int local83 = local41 - local53 * (local61 - 1);
		@Pc(92) int local92 = local33 * (1 - local65) + local49;
		@Pc(96) int local96 = local33 << 2;
		@Pc(100) int local100 = local24 << 2;
		@Pc(109) int local109 = local37 - local57 * (local65 - 1);
		@Pc(113) int local113 = local41 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local45 * 3;
		@Pc(127) int local127 = local53 * (local61 - 3);
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = local57 * (local65 - 3);
		@Pc(143) int local143 = local100 * (arg5 - 1);
		@Pc(145) int local145 = local113;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local96 * (local29 - 1);
		@Pc(157) int[] local157 = Static40.anIntArrayArray11[arg3];
		Static51.method893(arg4, local157, arg1 - local20, -arg6 + arg1);
		Static51.method893(arg2, local157, local20 + arg1, -local20 + arg1);
		Static51.method893(arg4, local157, arg6 + arg1, arg1 + local20);
		while (local16 > 0) {
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local145;
					local74 += local121;
					local145 += local113;
					local7++;
					local121 += local113;
				}
			}
			if (local83 < 0) {
				local7++;
				local83 += local145;
				local74 += local121;
				local145 += local113;
				local121 += local113;
			}
			@Pc(248) boolean local248 = local29 >= local16;
			local74 += -local143;
			@Pc(257) int local257 = arg1 + local7;
			local16--;
			local143 -= local100;
			@Pc(266) int local266 = local16 + arg3;
			@Pc(271) int local271 = arg3 - local16;
			if (local248) {
				if (local92 < 0) {
					while (local92 < 0) {
						local9++;
						local109 += local147;
						local92 += local131;
						local147 += local117;
						local131 += local117;
					}
				}
				if (local109 < 0) {
					local92 += local131;
					local109 += local147;
					local147 += local117;
					local131 += local117;
					local9++;
				}
				local109 += -local137;
				local137 -= local96;
				local92 += -local153;
				local153 -= local96;
			}
			@Pc(346) int local346 = arg1 - local7;
			local83 += -local127;
			if (local248) {
				@Pc(376) int local376 = arg1 - local9;
				@Pc(381) int local381 = arg1 + local9;
				Static51.method893(arg4, Static40.anIntArrayArray11[local271], local376, local346);
				Static51.method893(arg2, Static40.anIntArrayArray11[local271], local381, local376);
				Static51.method893(arg4, Static40.anIntArrayArray11[local271], local257, local381);
				Static51.method893(arg4, Static40.anIntArrayArray11[local266], local376, local346);
				Static51.method893(arg2, Static40.anIntArrayArray11[local266], local381, local376);
				Static51.method893(arg4, Static40.anIntArrayArray11[local266], local257, local381);
			} else {
				Static51.method893(arg4, Static40.anIntArrayArray11[local271], local257, local346);
				Static51.method893(arg4, Static40.anIntArrayArray11[local266], local257, local346);
			}
			local127 -= local100;
		}
	}
}
