import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public static int anInt6948;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "I")
	public static int anInt6960;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
	public static final int[] anIntArray463 = new int[200];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
	public static boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static487.method6855(arg1, arg0) || Static244.method4141(arg1, arg0);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public static void method6070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static188.method3210(12, arg0);
		local13.method925();
		local13.anInt852 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIII)V")
	public static void method6082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(15) int local15 = arg2 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static285.method4534(arg1, arg3, arg0, arg4);
			}
		} else if (local10 == 0) {
			Static144.method2593(arg2, arg4, arg1, arg3);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(67) boolean local67 = local10 > local15;
			@Pc(71) int local71;
			@Pc(73) int local73;
			if (local67) {
				local71 = arg1;
				local73 = arg2;
				arg1 = arg4;
				arg4 = local71;
				arg2 = arg0;
				arg0 = local73;
			}
			if (arg1 > arg2) {
				local71 = arg1;
				arg1 = arg2;
				local73 = arg4;
				arg4 = arg0;
				arg2 = local71;
				arg0 = local73;
			}
			local71 = arg4;
			local73 = arg2 - arg1;
			@Pc(112) int local112 = arg0 - arg4;
			@Pc(117) int local117 = -(local73 >> 1);
			@Pc(124) int local124 = arg0 > arg4 ? 1 : -1;
			if (local112 < 0) {
				local112 = -local112;
			}
			@Pc(136) int local136;
			if (local67) {
				for (local136 = arg1; local136 <= arg2; local136++) {
					Static349.anIntArrayArray71[local136][local71] = arg3;
					local117 += local112;
					if (local117 > 0) {
						local117 -= local73;
						local71 += local124;
					}
				}
			} else {
				for (local136 = arg1; local136 <= arg2; local136++) {
					local117 += local112;
					Static349.anIntArrayArray71[local71][local136] = arg3;
					if (local117 > 0) {
						local71 += local124;
						local117 -= local73;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ha;IILclient!ac;II)V")
	public static void method6085(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class220 local9 = Static108.aClass79_1.method1974(arg3.anInt60);
		if (local9.anInt5984 == -1) {
			return;
		}
		if (arg3.aBoolean11) {
			@Pc(31) int local31 = arg2 + arg3.anInt97;
			arg2 = local31 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(43) Class31 local43 = local9.method5164(arg3.aBoolean6, arg2, arg0);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg3.anInt67;
		@Pc(52) int local52 = arg3.anInt72;
		if ((arg2 & 0x1) == 1) {
			local52 = arg3.anInt67;
			local49 = arg3.anInt72;
		}
		@Pc(68) int local68 = local43.method8788();
		@Pc(71) int local71 = local43.method8807();
		if (local9.aBoolean424) {
			local71 = local52 * 4;
			local68 = local49 * 4;
		}
		if (local9.anInt5983 == 0) {
			local43.method8795(arg4, arg1 + 4 - local52 * 4, local68, local71);
		} else {
			local43.method8797(arg4, arg1 + 4 - local52 * 4, local68, local71, 0, local9.anInt5983 | 0xFF000000, 1);
		}
	}
}
