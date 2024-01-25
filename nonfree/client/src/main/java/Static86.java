import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "Lclient!kha;")
	public static final Class189 aClass189_6 = new Class189();

	@OriginalMember(owner = "client!dba", name = "y", descriptor = "Lclient!hda;")
	public static Class136 aClass136_37 = null;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZII)I")
	public static int method1349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 1);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method1350(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(116) int local116;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local116 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(163) int local163;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local116 <= local163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(204) int local204;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local204 = 0; local204 < arg0; local204++) {
				if (local204 <= local163 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(250) int local250;
		for (local204 = 0; local204 < arg0; local204++) {
			for (local250 = 0; local250 < arg0; local250++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local204 << 1 <= local250) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(308) int local308;
		for (local250 = 0; local250 < arg0; local250++) {
			for (local308 = arg0 - 1; local308 >= 0; local308--) {
				if (local308 <= local250 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(354) int local354;
		for (local308 = arg0 - 1; local308 >= 0; local308--) {
			for (local354 = arg0 - 1; local354 >= 0; local354--) {
				if (local308 << 1 <= local354) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(398) int local398;
		for (local354 = arg0 - 1; local354 >= 0; local354--) {
			for (local398 = arg0 - 1; local398 >= 0; local398--) {
				if (local398 <= local354 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(443) int local443;
		for (local398 = arg0 - 1; local398 >= 0; local398--) {
			for (local443 = 0; local443 < arg0; local443++) {
				if (local398 << 1 <= local443) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(481) int local481;
		for (local443 = 0; local443 < arg0; local443++) {
			for (local481 = 0; local481 < arg0; local481++) {
				if (local443 >> 1 >= local481) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(534) int local534;
		for (local481 = 0; local481 < arg0; local481++) {
			for (local534 = arg0 - 1; local534 >= 0; local534--) {
				if (local481 << 1 <= local534) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(581) int local581;
		for (local534 = arg0 - 1; local534 >= 0; local534--) {
			for (local581 = 0; local581 < arg0; local581++) {
				if (local581 >= local534 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(626) int local626;
		for (local581 = 0; local581 < arg0; local581++) {
			for (local626 = 0; local626 < arg0; local626++) {
				if (local581 << 1 >= local626) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(679) int local679;
		for (local626 = 0; local626 < arg0; local626++) {
			for (local679 = arg0 - 1; local679 >= 0; local679--) {
				if (local679 >= local626 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(725) int local725;
		for (local679 = arg0 - 1; local679 >= 0; local679--) {
			for (local725 = arg0 - 1; local725 >= 0; local725--) {
				if (local679 << 1 >= local725) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(773) int local773;
		for (local725 = arg0 - 1; local725 >= 0; local725--) {
			for (local773 = arg0 - 1; local773 >= 0; local773--) {
				if (local773 >= local725 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(819) int local819;
		for (local773 = arg0 - 1; local773 >= 0; local773--) {
			for (local819 = 0; local819 < arg0; local819++) {
				if (local773 << 1 >= local819) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(861) int local861;
		for (local819 = 0; local819 < arg0; local819++) {
			for (local861 = 0; local861 < arg0; local861++) {
				if (local819 >> 1 <= local861) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(906) int local906;
		for (local861 = 0; local861 < arg0; local861++) {
			for (local906 = arg0 - 1; local906 >= 0; local906--) {
				if (local906 <= local861 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(955) int local955;
		for (local906 = 0; local906 < arg0; local906++) {
			for (local955 = 0; local955 < arg0; local955++) {
				if (arg0 / 2 >= local955) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(998) int local998;
		for (local955 = 0; local955 < arg0; local955++) {
			for (local998 = 0; local998 < arg0; local998++) {
				if (arg0 / 2 >= local955) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1045) int local1045;
		for (local998 = 0; local998 < arg0; local998++) {
			for (local1045 = 0; local1045 < arg0; local1045++) {
				if (arg0 / 2 <= local1045) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1088) int local1088;
		for (local1045 = 0; local1045 < arg0; local1045++) {
			for (local1088 = 0; local1088 < arg0; local1088++) {
				if (local1045 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1131) int local1131;
		for (local1088 = 0; local1088 < arg0; local1088++) {
			for (local1131 = 0; local1131 < arg0; local1131++) {
				if (local1088 - arg0 / 2 >= local1131) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1183) int local1183;
		for (local1131 = arg0 - 1; local1131 >= 0; local1131--) {
			for (local1183 = 0; local1183 < arg0; local1183++) {
				if (local1131 - arg0 / 2 >= local1183) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1235) int local1235;
		for (local1183 = arg0 - 1; local1183 >= 0; local1183--) {
			for (local1235 = arg0 - 1; local1235 >= 0; local1235--) {
				if (local1235 <= local1183 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1280) int local1280;
		for (local1235 = 0; local1235 < arg0; local1235++) {
			for (local1280 = arg0 - 1; local1280 >= 0; local1280--) {
				if (local1235 - arg0 / 2 >= local1280) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1323) int local1323;
		for (local1280 = 0; local1280 < arg0; local1280++) {
			for (local1323 = 0; local1323 < arg0; local1323++) {
				if (local1280 - arg0 / 2 <= local1323) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1370) int local1370;
		for (local1323 = arg0 - 1; local1323 >= 0; local1323--) {
			for (local1370 = 0; local1370 < arg0; local1370++) {
				if (local1323 - arg0 / 2 <= local1370) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1419) int local1419;
		for (local1370 = arg0 - 1; local1370 >= 0; local1370--) {
			for (local1419 = arg0 - 1; local1419 >= 0; local1419--) {
				if (local1370 - arg0 / 2 <= local1419) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1419 = 0; local1419 < arg0; local1419++) {
			for (@Pc(1468) int local1468 = arg0 - 1; local1468 >= 0; local1468--) {
				if (local1468 >= local1419 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg4);
		@Pc(17) int local17 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg3);
		@Pc(23) int local23 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg6);
		@Pc(29) int local29 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2);
		@Pc(37) int local37 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg5 + arg4);
		@Pc(46) int local46 = Static84.method1337(Static231.anInt3977, Static304.anInt4824, arg3 - arg5);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static260.method3979(arg1, local23, Static267.anIntArrayArray20[local48], local29);
		}
		for (@Pc(69) int local69 = local17; local69 > local46; local69--) {
			Static260.method3979(arg1, local23, Static267.anIntArrayArray20[local69], local29);
		}
		@Pc(91) int local91 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 + arg6);
		@Pc(100) int local100 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2 - arg5);
		for (@Pc(102) int local102 = local37; local102 <= local46; local102++) {
			@Pc(108) int[] local108 = Static267.anIntArrayArray20[local102];
			Static260.method3979(arg1, local23, local108, local91);
			Static260.method3979(arg0, local91, local108, local100);
			Static260.method3979(arg1, local100, local108, local29);
		}
	}
}
