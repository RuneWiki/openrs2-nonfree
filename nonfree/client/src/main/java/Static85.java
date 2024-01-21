import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt2515 = 0;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_678 = Static158.method3034("<)4col> x");

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_679 = Static158.method3034(")2");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ra;I)I")
	public static int method1991(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1) {
		if (arg1.anIntArrayArray25 == null || arg1.anIntArrayArray25.length <= arg0) {
			return -2;
		}
		try {
			@Pc(26) int[] local26 = arg1.anIntArrayArray25[arg0];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(32) byte local32 = 0;
			while (true) {
				@Pc(37) int local37 = local26[local30++];
				@Pc(39) int local39 = 0;
				@Pc(41) byte local41 = 0;
				if (local37 == 0) {
					return local28;
				}
				if (local37 == 1) {
					local39 = Static37.anIntArray100[local26[local30++]];
				}
				if (local37 == 15) {
					local41 = 1;
				}
				if (local37 == 2) {
					local39 = Static64.anIntArray183[local26[local30++]];
				}
				if (local37 == 3) {
					local39 = Static39.anIntArray118[local26[local30++]];
				}
				@Pc(103) int local103;
				@Pc(114) Class72 local114;
				@Pc(119) int local119;
				@Pc(131) int local131;
				if (local37 == 4) {
					local103 = local26[local30++] << 16;
					@Pc(110) int local110 = local103 + local26[local30++];
					local114 = Static173.method3201(local110);
					local119 = local26[local30++];
					if (local119 != -1 && (!Static88.method2046(local119).aBoolean58 || Static107.aBoolean117)) {
						for (local131 = 0; local131 < local114.anIntArray436.length; local131++) {
							if (local114.anIntArray436[local131] == local119 + 1) {
								local39 += local114.anIntArray430[local131];
							}
						}
					}
				}
				if (local37 == 16) {
					local41 = 2;
				}
				if (local37 == 5) {
					local39 = Static163.anIntArray447[local26[local30++]];
				}
				if (local37 == 17) {
					local41 = 3;
				}
				if (local37 == 6) {
					local39 = Class21.anIntArray135[Static64.anIntArray183[local26[local30++]] - 1];
				}
				if (local37 == 7) {
					local39 = Static163.anIntArray447[local26[local30++]] * 100 / 46875;
				}
				if (local37 == 8) {
					local39 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1283;
				}
				if (local37 == 9) {
					for (local103 = 0; local103 < 25; local103++) {
						if (Static62.aBooleanArray8[local103]) {
							local39 += Static64.anIntArray183[local103];
						}
					}
				}
				if (local37 == 10) {
					local103 = local26[local30++] << 16;
					local103 += local26[local30++];
					local114 = Static173.method3201(local103);
					local119 = local26[local30++];
					if (local119 != -1 && (!Static88.method2046(local119).aBoolean58 || Static107.aBoolean117)) {
						for (local131 = 0; local131 < local114.anIntArray436.length; local131++) {
							if (local119 + 1 == local114.anIntArray436[local131]) {
								local39 = 999999999;
								break;
							}
						}
					}
				}
				if (local37 == 11) {
					local39 = Static99.anInt2866;
				}
				if (local37 == 12) {
					local39 = Static153.anInt3875;
				}
				if (local37 == 13) {
					local103 = Static163.anIntArray447[local26[local30++]];
					@Pc(327) int local327 = local26[local30++];
					local39 = (0x1 << local327 & local103) == 0 ? 0 : 1;
				}
				if (local37 == 14) {
					local103 = local26[local30++];
					local39 = Static7.method3570(local103);
				}
				if (local37 == 18) {
					local39 = Static76.anInt2319 + (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 >> 7);
				}
				if (local37 == 19) {
					local39 = Static76.anInt2317 + (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 >> 7);
				}
				if (local37 == 20) {
					local39 = local26[local30++];
				}
				if (local41 == 0) {
					if (local32 == 0) {
						local28 += local39;
					}
					if (local32 == 1) {
						local28 -= local39;
					}
					if (local32 == 2 && local39 != 0) {
						local28 /= local39;
					}
					if (local32 == 3) {
						local28 *= local39;
					}
					local32 = 0;
				} else {
					local32 = local41;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
	public static int method1992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(JB)V")
	public static void method1993(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static98.method2269(arg0 - 1L);
			Static98.method2269(1L);
		} else {
			Static98.method2269(arg0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[Lclient!hi;I[BII)V")
	public static void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg0 > 0 && arg0 + local7 < 103 && local11 + arg4 > 0 && arg4 + local11 < 103) {
						arg2[local3].anIntArrayArray14[local7 + arg0][arg4 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(94) Class2_Sub3 local94 = new Class2_Sub3(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static95.method2245(arg1, local100 + arg0, arg4 + local104, local11, arg5, local94, 0);
				}
			}
		}
	}
}
