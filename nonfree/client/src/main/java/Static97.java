import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_23 = new Class194(3, 16);

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_2 = new Class163(1, 2);

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "[I")
	public static final int[] anIntArray78 = new int[5];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V")
	public static void method1365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static3.anInt46 < arg2 || Static356.anInt5817 > arg3) {
			return;
		}
		@Pc(18) boolean local18;
		if (arg4 < Static3.anInt45) {
			arg4 = Static3.anInt45;
			local18 = false;
		} else if (arg4 <= Static112.anInt1900) {
			local18 = true;
		} else {
			arg4 = Static112.anInt1900;
			local18 = false;
		}
		@Pc(42) boolean local42;
		if (Static3.anInt45 > arg0) {
			arg0 = Static3.anInt45;
			local42 = false;
		} else if (Static112.anInt1900 >= arg0) {
			local42 = true;
		} else {
			arg0 = Static112.anInt1900;
			local42 = false;
		}
		if (Static356.anInt5817 <= arg2) {
			Static291.method3606(arg0, Static133.anIntArrayArray15[arg2++], arg1, arg4);
		} else {
			arg2 = Static356.anInt5817;
		}
		if (arg3 > Static3.anInt46) {
			arg3 = Static3.anInt46;
		} else {
			Static291.method3606(arg0, Static133.anIntArrayArray15[arg3--], arg1, arg4);
		}
		@Pc(97) int local97;
		if (local18 && local42) {
			for (local97 = arg2; local97 <= arg3; local97++) {
				@Pc(103) int[] local103 = Static133.anIntArrayArray15[local97];
				local103[arg4] = local103[arg0] = arg1;
			}
		} else if (local18) {
			for (local97 = arg2; local97 <= arg3; local97++) {
				Static133.anIntArrayArray15[local97][arg4] = arg1;
			}
		} else if (local42) {
			for (local97 = arg2; local97 <= arg3; local97++) {
				Static133.anIntArrayArray15[local97][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg1 - arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(69) int local69 = (1 - local57) * local25 + local41;
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = (1 - local61) * local33 + local49;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = (local57 - 3) * local45;
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = (local61 - 3) * local53;
		@Pc(135) int local135 = local105;
		@Pc(146) int local146 = local101 * (arg1 - 1);
		@Pc(148) int local148 = local113;
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(190) int local190;
		@Pc(198) int local198;
		if (arg5 >= Static356.anInt5817 && Static3.anInt46 >= arg5) {
			@Pc(162) int[] local162 = Static133.anIntArrayArray15[arg5];
			local171 = Static391.method5106(Static3.anInt45, arg6 - arg3, Static112.anInt1900);
			local179 = Static391.method5106(Static3.anInt45, arg3 + arg6, Static112.anInt1900);
			local190 = Static391.method5106(Static3.anInt45, arg6 - local16, Static112.anInt1900);
			local198 = Static391.method5106(Static3.anInt45, local16 + arg6, Static112.anInt1900);
			Static291.method3606(local190, local162, arg4, local171);
			Static291.method3606(local198, local162, arg0, local190);
			Static291.method3606(local179, local162, arg4, local198);
		}
		@Pc(222) int local222 = (local21 - 1) * local109;
		while (local9 > 0) {
			@Pc(235) boolean local235 = local21 >= local9;
			if (local235) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local148;
						local11++;
						local148 += local113;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local88 += local127;
					local97 += local148;
					local11++;
					local127 += local113;
					local148 += local113;
				}
				local88 += -local222;
				local97 += -local133;
				local222 -= local109;
				local133 -= local109;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local117;
					local78 += local135;
					local117 += local105;
					local135 += local105;
					local7++;
				}
			}
			if (local78 < 0) {
				local78 += local135;
				local69 += local117;
				local135 += local105;
				local117 += local105;
				local7++;
			}
			local78 += -local123;
			local69 += -local146;
			local123 -= local101;
			local9--;
			local146 -= local101;
			local171 = arg5 - local9;
			local179 = local9 + arg5;
			if (Static356.anInt5817 <= local179 && local171 <= Static3.anInt46) {
				local190 = Static391.method5106(Static3.anInt45, local7 + arg6, Static112.anInt1900);
				local198 = Static391.method5106(Static3.anInt45, arg6 - local7, Static112.anInt1900);
				if (local235) {
					@Pc(445) int local445 = Static391.method5106(Static3.anInt45, arg6 + local11, Static112.anInt1900);
					@Pc(456) int local456 = Static391.method5106(Static3.anInt45, arg6 - local11, Static112.anInt1900);
					@Pc(463) int[] local463;
					if (local171 >= Static356.anInt5817) {
						local463 = Static133.anIntArrayArray15[local171];
						Static291.method3606(local456, local463, arg4, local198);
						Static291.method3606(local445, local463, arg0, local456);
						Static291.method3606(local190, local463, arg4, local445);
					}
					if (Static3.anInt46 >= local179) {
						local463 = Static133.anIntArrayArray15[local179];
						Static291.method3606(local456, local463, arg4, local198);
						Static291.method3606(local445, local463, arg0, local456);
						Static291.method3606(local190, local463, arg4, local445);
					}
				} else {
					if (local171 >= Static356.anInt5817) {
						Static291.method3606(local190, Static133.anIntArrayArray15[local171], arg4, local198);
					}
					if (local179 <= Static3.anInt46) {
						Static291.method3606(local190, Static133.anIntArrayArray15[local179], arg4, local198);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	public static void method1368() {
		Static373.method4882((long) Static85.anInt1536, Static407.aClass200_9);
		if (Static199.anInt3319 != -1) {
			Static308.method3811(Static199.anInt3319);
		}
		for (@Pc(19) int local19 = 0; local19 < Static343.anInt5618; local19++) {
			if (Static99.aBooleanArray5[local19]) {
				Static371.aBooleanArray21[local19] = true;
			}
			Static39.aBooleanArray3[local19] = Static99.aBooleanArray5[local19];
			Static99.aBooleanArray5[local19] = false;
		}
		Static59.anInt1107 = Static85.anInt1536;
		if (Static407.aClass200_9.method5832()) {
			Static456.aBoolean502 = true;
		}
		if (Static199.anInt3319 != -1) {
			Static343.anInt5618 = 0;
			Static86.method1259();
		}
		Static407.aClass200_9.va();
		Static141.method4120(Static407.aClass200_9);
		@Pc(66) int local66 = Static394.method5132();
		if (local66 == -1) {
			local66 = Static333.anInt5333;
		}
		if (local66 == -1) {
			local66 = Static449.anInt7378;
		}
		Static390.method5094(local66);
		Static173.anInt2946 = 0;
	}
}
