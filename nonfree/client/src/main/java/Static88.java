import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_31 = new Class15("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method1371(@OriginalArg(0) int arg0) {
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
		@Pc(112) int local112;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local73 <= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(163) int local163;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local112 <= local163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(201) int local201;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local201 = 0; local201 < arg0; local201++) {
				if (local163 >> 1 >= local201) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(243) int local243;
		for (local201 = 0; local201 < arg0; local201++) {
			for (local243 = 0; local243 < arg0; local243++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local243 >= local201 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(300) int local300;
		for (local243 = 0; local243 < arg0; local243++) {
			for (local300 = arg0 - 1; local300 >= 0; local300--) {
				if (local300 <= local243 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(349) int local349;
		for (local300 = arg0 - 1; local300 >= 0; local300--) {
			for (local349 = arg0 - 1; local349 >= 0; local349--) {
				if (local300 << 1 <= local349) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(393) int local393;
		for (local349 = arg0 - 1; local349 >= 0; local349--) {
			for (local393 = arg0 - 1; local393 >= 0; local393--) {
				if (local393 <= local349 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(438) int local438;
		for (local393 = arg0 - 1; local393 >= 0; local393--) {
			for (local438 = 0; local438 < arg0; local438++) {
				if (local438 >= local393 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(476) int local476;
		for (local438 = 0; local438 < arg0; local438++) {
			for (local476 = 0; local476 < arg0; local476++) {
				if (local476 <= local438 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(521) int local521;
		for (local476 = 0; local476 < arg0; local476++) {
			for (local521 = arg0 - 1; local521 >= 0; local521--) {
				if (local476 << 1 <= local521) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(565) int local565;
		for (local521 = arg0 - 1; local521 >= 0; local521--) {
			for (local565 = 0; local565 < arg0; local565++) {
				if (local565 >= local521 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(611) int local611;
		for (local565 = 0; local565 < arg0; local565++) {
			for (local611 = 0; local611 < arg0; local611++) {
				if (local565 << 1 >= local611) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(656) int local656;
		for (local611 = 0; local611 < arg0; local611++) {
			for (local656 = arg0 - 1; local656 >= 0; local656--) {
				if (local656 >= local611 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(701) int local701;
		for (local656 = arg0 - 1; local656 >= 0; local656--) {
			for (local701 = arg0 - 1; local701 >= 0; local701--) {
				if (local656 << 1 >= local701) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(746) int local746;
		for (local701 = arg0 - 1; local701 >= 0; local701--) {
			for (local746 = arg0 - 1; local746 >= 0; local746--) {
				if (local701 >> 1 <= local746) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(792) int local792;
		for (local746 = arg0 - 1; local746 >= 0; local746--) {
			for (local792 = 0; local792 < arg0; local792++) {
				if (local792 <= local746 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(841) int local841;
		for (local792 = 0; local792 < arg0; local792++) {
			for (local841 = 0; local841 < arg0; local841++) {
				if (local841 >= local792 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(890) int local890;
		for (local841 = 0; local841 < arg0; local841++) {
			for (local890 = arg0 - 1; local890 >= 0; local890--) {
				if (local841 << 1 >= local890) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(931) int local931;
		for (local890 = 0; local890 < arg0; local890++) {
			for (local931 = 0; local931 < arg0; local931++) {
				if (arg0 / 2 >= local931) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(974) int local974;
		for (local931 = 0; local931 < arg0; local931++) {
			for (local974 = 0; local974 < arg0; local974++) {
				if (arg0 / 2 >= local931) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1021) int local1021;
		for (local974 = 0; local974 < arg0; local974++) {
			for (local1021 = 0; local1021 < arg0; local1021++) {
				if (local1021 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1068) int local1068;
		for (local1021 = 0; local1021 < arg0; local1021++) {
			for (local1068 = 0; local1068 < arg0; local1068++) {
				if (local1021 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1119) int local1119;
		for (local1068 = 0; local1068 < arg0; local1068++) {
			for (local1119 = 0; local1119 < arg0; local1119++) {
				if (local1068 - arg0 / 2 >= local1119) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1171) int local1171;
		for (local1119 = arg0 - 1; local1119 >= 0; local1119--) {
			for (local1171 = 0; local1171 < arg0; local1171++) {
				if (local1171 <= local1119 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1223) int local1223;
		for (local1171 = arg0 - 1; local1171 >= 0; local1171--) {
			for (local1223 = arg0 - 1; local1223 >= 0; local1223--) {
				if (local1171 - arg0 / 2 >= local1223) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1268) int local1268;
		for (local1223 = 0; local1223 < arg0; local1223++) {
			for (local1268 = arg0 - 1; local1268 >= 0; local1268--) {
				if (local1268 <= local1223 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1317) int local1317;
		for (local1268 = 0; local1268 < arg0; local1268++) {
			for (local1317 = 0; local1317 < arg0; local1317++) {
				if (local1317 >= local1268 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1369) int local1369;
		for (local1317 = arg0 - 1; local1317 >= 0; local1317--) {
			for (local1369 = 0; local1369 < arg0; local1369++) {
				if (local1369 >= local1317 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1425) int local1425;
		for (local1369 = arg0 - 1; local1369 >= 0; local1369--) {
			for (local1425 = arg0 - 1; local1425 >= 0; local1425--) {
				if (local1369 - arg0 / 2 <= local1425) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1425 = 0; local1425 < arg0; local1425++) {
			for (@Pc(1470) int local1470 = arg0 - 1; local1470 >= 0; local1470--) {
				if (local1470 >= local1425 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
