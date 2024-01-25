import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "[I")
	public static final int[] anIntArray102 = new int[14];

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static final int anInt1707 = 50;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "S")
	public static short aShort12 = 320;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public static void method1374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg1, 6);
		local8.method2509();
		local8.anInt3054 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method1376() {
		if (Static295.anIntArray477 != null) {
			return;
		}
		Static295.anIntArray477 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(40) double local40 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(78) double local78;
				if (local58 < 0.5D) {
					local78 = local58 * (local51 + 1.0D);
				} else {
					local78 = local58 + local51 - local51 * local58;
				}
				@Pc(95) double local95 = local58 * 2.0D - local78;
				@Pc(99) double local99 = local40 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local40 - 0.3333333333333333D;
				if (local113 < 0.0D) {
					local113++;
				}
				if (local99 * 6.0D < 1.0D) {
					local60 = (local78 - local95) * 6.0D * local99 + local95;
				} else if (local99 * 2.0D < 1.0D) {
					local60 = local78;
				} else if (local99 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local99) * (-local95 + local78) * 6.0D + local95;
				} else {
					local60 = local95;
				}
				if (local40 * 6.0D < 1.0D) {
					local62 = (local78 - local95) * 6.0D * local40 + local95;
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local78;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = (local78 - local95) * 6.0D * (0.6666666666666666D - local40) + local95;
				} else {
					local62 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local64 = (local78 - local95) * 6.0D * local113 + local95;
				} else if (local113 * 2.0D < 1.0D) {
					local64 = local78;
				} else if (local113 * 3.0D < 2.0D) {
					local64 = (local78 - local95) * 6.0D * (0.6666666666666666D - local113) + local95;
				} else {
					local64 = local95;
				}
			}
			local60 = Math.pow(local60, local24);
			local62 = Math.pow(local62, local24);
			local64 = Math.pow(local64, local24);
			@Pc(293) int local293 = (int) (local60 * 256.0D);
			@Pc(298) int local298 = (int) (local62 * 256.0D);
			@Pc(303) int local303 = (int) (local64 * 256.0D);
			@Pc(314) int local314 = (local293 << 16) + (local298 << 8) + local303;
			Static295.anIntArray477[local26] = local314;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method1377() {
		@Pc(1) Class198 local1 = Static336.aClass198_61;
		synchronized (Static336.aClass198_61) {
			Static336.aClass198_61.method5236();
		}
		local1 = Static182.aClass198_31;
		synchronized (Static182.aClass198_31) {
			Static182.aClass198_31.method5236();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BZZ)V")
	public static void method1378(@OriginalArg(2) boolean arg0) {
		Static278.anInt5567--;
		if (Static278.anInt5567 == 0) {
			Static113.anIntArray533 = null;
		}
		if (arg0) {
			Static163.anInt3186--;
			if (Static163.anInt3186 == 0) {
				Static295.anIntArray477 = null;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	public static boolean method1379(@OriginalArg(1) int arg0) {
		if (arg0 == 29 || arg0 == 40 || arg0 == 38 || arg0 == 44 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 32 || arg0 == 28 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method1380() {
		@Pc(1) Class198 local1 = Static249.aClass198_43;
		synchronized (Static249.aClass198_43) {
			Static249.aClass198_43.method5236();
		}
		local1 = Static216.aClass198_40;
		synchronized (Static216.aClass198_40) {
			Static216.aClass198_40.method5236();
		}
		local1 = Static323.aClass198_56;
		synchronized (Static323.aClass198_56) {
			Static323.aClass198_56.method5236();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIZLclient!tj;[[I)V")
	public static void method1381(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int[][] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(18) int[][] local18;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg3 == null) {
				local18 = null;
			} else {
				local18 = new int[Static162.anInt2152 + 1][Static122.anInt2632 + 1];
				for (local30 = 0; local30 <= Static122.anInt2632; local30++) {
					for (local34 = 0; local34 <= Static162.anInt2152; local34++) {
						local18[local34][local30] = Static105.anIntArrayArrayArray2[local12][local34][local30] - arg3[local34][local30];
					}
				}
			}
			local30 = 0;
			local34 = 0;
			if (!arg1) {
				if (Static118.aBoolean141) {
					local30 = 2;
				}
				if (Static333.aBoolean435) {
					local34 = 8;
				}
				if (Static77.anInt1520 != 0) {
					if (local12 == 0 || Static26.anInt699 >= 96) {
						local34 |= 0x10;
					}
					local30 |= 0x1;
				}
			}
			if (Static118.aBoolean141) {
				local34 |= 0x7;
			}
			@Pc(119) Class22 local119 = arg2.method4773(Static162.anInt2152, Static122.anInt2632, Static105.anIntArrayArrayArray2[local12], local18, local30, local34);
			Static171.method2837(local12, local119);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIII)V")
	public static void method1382(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static138.aLong103 = 0L;
		@Pc(15) int local15 = Static205.method34();
		if (arg1 == 3 || local15 == 3) {
			arg0 = true;
		}
		if (!Static212.aClass122_2.method4748()) {
			arg0 = true;
		}
		Static171.method2839(local15, arg0, arg1, arg3, arg2);
	}
}
