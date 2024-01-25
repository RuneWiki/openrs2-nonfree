import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!el", name = "w", descriptor = "Lclient!ec;")
	public static Class68 aClass68_5;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "J")
	public static long aLong65;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_55 = new Class158(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!el", name = "u", descriptor = "F")
	public static float aFloat13 = 1.0F;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Lclient!ft;")
	public static Class41_Sub2 method1697() {
		@Pc(8) Class41_Sub2 local8 = (Class41_Sub2) Static156.aClass117_4.method2958();
		if (local8 == null) {
			return new Class41_Sub2();
		} else {
			Static93.anInt6565--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg4;
		@Pc(20) int local20 = arg5 - arg4;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(85) int local85 = local48 + (1 - local60) * local32;
		@Pc(93) int local93 = local36 - local52 * (local60 - 1);
		@Pc(97) int local97 = local24 << 2;
		@Pc(101) int local101 = local28 << 2;
		@Pc(105) int local105 = local32 << 2;
		@Pc(109) int local109 = local36 << 2;
		@Pc(113) int local113 = local40 * 3;
		@Pc(119) int local119 = (local56 - 3) * local44;
		@Pc(123) int local123 = local48 * 3;
		@Pc(129) int local129 = local52 * (local60 - 3);
		@Pc(131) int local131 = local101;
		@Pc(137) int local137 = local97 * (arg5 - 1);
		@Pc(139) int local139 = local109;
		@Pc(158) int local158;
		@Pc(166) int local166;
		@Pc(174) int local174;
		@Pc(183) int local183;
		if (Static362.anInt6654 <= arg0 && arg0 <= Static164.anInt6595) {
			@Pc(149) int[] local149 = Static60.anIntArrayArray14[arg0];
			local158 = Static337.method4744(arg2 - arg3, Static70.anInt1843, Static105.anInt2417);
			local166 = Static337.method4744(arg3 + arg2, Static70.anInt1843, Static105.anInt2417);
			local174 = Static337.method4744(arg2 - local16, Static70.anInt1843, Static105.anInt2417);
			local183 = Static337.method4744(arg2 + local16, Static70.anInt1843, Static105.anInt2417);
			Static228.method3480(local158, arg6, local149, local174);
			Static228.method3480(local174, arg1, local149, local183);
			Static228.method3480(local183, arg6, local149, local166);
		}
		@Pc(209) int local209 = (local20 - 1) * local105;
		while (local9 > 0) {
			@Pc(222) boolean local222 = local9 <= local20;
			if (local222) {
				if (local85 < 0) {
					while (local85 < 0) {
						local85 += local123;
						local93 += local139;
						local123 += local109;
						local11++;
						local139 += local109;
					}
				}
				if (local93 < 0) {
					local93 += local139;
					local85 += local123;
					local139 += local109;
					local123 += local109;
					local11++;
				}
				local85 += -local209;
				local93 += -local129;
				local209 -= local105;
				local129 -= local105;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local77 += local131;
					local69 += local113;
					local113 += local101;
					local131 += local101;
					local7++;
				}
			}
			if (local77 < 0) {
				local69 += local113;
				local77 += local131;
				local7++;
				local131 += local101;
				local113 += local101;
			}
			local77 += -local119;
			local69 += -local137;
			local119 -= local97;
			local9--;
			local137 -= local97;
			local158 = arg0 - local9;
			local166 = arg0 + local9;
			if (Static362.anInt6654 <= local166 && Static164.anInt6595 >= local158) {
				local174 = Static337.method4744(local7 + arg2, Static70.anInt1843, Static105.anInt2417);
				local183 = Static337.method4744(arg2 - local7, Static70.anInt1843, Static105.anInt2417);
				if (local222) {
					@Pc(432) int local432 = Static337.method4744(local11 + arg2, Static70.anInt1843, Static105.anInt2417);
					@Pc(440) int local440 = Static337.method4744(arg2 - local11, Static70.anInt1843, Static105.anInt2417);
					@Pc(451) int[] local451;
					if (Static362.anInt6654 <= local158) {
						local451 = Static60.anIntArrayArray14[local158];
						Static228.method3480(local183, arg6, local451, local440);
						Static228.method3480(local440, arg1, local451, local432);
						Static228.method3480(local432, arg6, local451, local174);
					}
					if (local166 <= Static164.anInt6595) {
						local451 = Static60.anIntArrayArray14[local166];
						Static228.method3480(local183, arg6, local451, local440);
						Static228.method3480(local440, arg1, local451, local432);
						Static228.method3480(local432, arg6, local451, local174);
					}
				} else {
					if (local158 >= Static362.anInt6654) {
						Static228.method3480(local183, arg6, Static60.anIntArrayArray14[local158], local174);
					}
					if (Static164.anInt6595 >= local166) {
						Static228.method3480(local183, arg6, Static60.anIntArrayArray14[local166], local174);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
	public static void method1700() {
		@Pc(8) Class1_Sub25 local8 = (Class1_Sub25) Static341.aClass203_43.method4548();
		@Pc(19) boolean local19 = Static404.aClass68_11 != null || Static209.anInt4285 > 0;
		if (local19) {
			Static448.anInt7868 = 1;
		}
		if (Static326.aBoolean381 && Static414.aClass48_1.method1119(81) && Static126.anInt2794 > 2) {
			if (local19) {
				Static306.aClass1_Sub35_2 = (Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263.aClass1_263;
			} else {
				Static78.method1447(local8.method3347(), (Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263.aClass1_263, local8.method3349());
			}
		} else if (local19) {
			Static306.aClass1_Sub35_2 = (Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263;
		} else {
			Static78.method1447(local8.method3347(), (Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263, local8.method3349());
		}
	}
}
