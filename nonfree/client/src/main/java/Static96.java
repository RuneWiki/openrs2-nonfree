import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1932;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!us;")
	public static final Class234 aClass234_42 = new Class234(17, 14);

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!us;")
	public static final Class234 aClass234_43 = new Class234(65, 12);

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(CB)C")
	public static char method1616(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!cj;IBI)V")
	public static void method1617(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static47.aClass138_7.aClass3_137 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt802;
		@Pc(18) int local18 = arg0.anInt801;
		@Pc(21) int local21 = arg0.anInt808;
		@Pc(25) int local25 = (int) arg0.aLong17;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong17;
		@Pc(41) Class28_Sub1_Sub1_Sub2 local41;
		if (local21 == 15) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static165.anInt2905 = arg1;
				Static214.anInt3764 = arg2;
				Static144.anInt2710 = 0;
				Static174.anInt3035 = 2;
				Static229.method3783(Static252.aClass244_60);
				Static23.aClass3_Sub5_Sub1_1.method2727(local25);
				Static23.aClass3_Sub5_Sub1_1.method2733(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		@Pc(101) Class28_Sub1_Sub1_Sub1 local101;
		if (local21 == 4) {
			local101 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local25];
			if (local101 != null) {
				Static174.anInt3035 = 2;
				Static214.anInt3764 = arg2;
				Static165.anInt2905 = arg1;
				Static144.anInt2710 = 0;
				Static229.method3783(Static84.aClass244_26);
				Static23.aClass3_Sub5_Sub1_1.method2732(local25);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local101.method4009(), 0, local101.anIntArray490[0], 0, local101.anIntArray491[0], local101.method4009());
			}
		}
		if (local21 == 57) {
			Static174.anInt3035 = 2;
			Static165.anInt2905 = arg1;
			Static144.anInt2710 = 0;
			Static214.anInt3764 = arg2;
			Static229.method3783(Static290.aClass244_69);
			Static23.aClass3_Sub5_Sub1_1.method2749(Static103.anInt2044 + local18);
			Static23.aClass3_Sub5_Sub1_1.method2749(Static21.anInt265 + local15);
			Static23.aClass3_Sub5_Sub1_1.method2732(local25);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static231.method3844(local18, local15);
		}
		if (local21 == 9) {
			local101 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local25];
			if (local101 != null) {
				Static214.anInt3764 = arg2;
				Static174.anInt3035 = 2;
				Static165.anInt2905 = arg1;
				Static144.anInt2710 = 0;
				Static229.method3783(Static340.aClass244_80);
				Static23.aClass3_Sub5_Sub1_1.method2749(local25);
				Static23.aClass3_Sub5_Sub1_1.method2733(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local101.method4009(), 0, local101.anIntArray490[0], 0, local101.anIntArray491[0], local101.method4009());
			}
		}
		if (local21 == 49) {
			Static174.anInt3035 = 2;
			Static144.anInt2710 = 0;
			Static165.anInt2905 = arg1;
			Static214.anInt3764 = arg2;
			Static229.method3783(Static375.aClass244_93);
			Static23.aClass3_Sub5_Sub1_1.method2758(Static242.anInt4268);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static127.anInt2413);
			Static23.aClass3_Sub5_Sub1_1.method2732(Static103.anInt2044 + local18);
			Static23.aClass3_Sub5_Sub1_1.method2732((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static23.aClass3_Sub5_Sub1_1.method2749(Static21.anInt265 + local15);
			Static23.aClass3_Sub5_Sub1_1.method2732(Static109.anInt2149);
			Static16.method202(local34, local18, local15);
		}
		@Pc(346) Class62 local346;
		if (local21 == 8) {
			local346 = Static80.method1338(local18, local15);
			if (local346 != null) {
				Static203.method3169();
				@Pc(353) Class3_Sub42 local353 = Static48.method915(local346);
				Static82.method1361(local346.anInt1519, local346.anInt1570, local353.method5603(), local18, local15, local353.anInt6288);
				Static208.aString38 = Static350.method5270(local346);
				if (Static208.aString38 == null) {
					Static208.aString38 = "Null";
				}
				Static356.aString8 = local346.aString18 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 51) {
			Static165.anInt2905 = arg1;
			Static174.anInt3035 = 2;
			Static214.anInt3764 = arg2;
			Static144.anInt2710 = 0;
			Static229.method3783(Static358.aClass244_89);
			Static23.aClass3_Sub5_Sub1_1.method2765(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2727(local25);
			Static23.aClass3_Sub5_Sub1_1.method2762(local18 + Static103.anInt2044);
			Static23.aClass3_Sub5_Sub1_1.method2749(Static21.anInt265 + local15);
			Static231.method3844(local18, local15);
		}
		if (local21 == 2 && Static53.aClass62_2 == null) {
			Static151.method2381(local18, local15);
			Static53.aClass62_2 = Static80.method1338(local18, local15);
			Static158.method2441(Static53.aClass62_2);
		}
		if (local21 == 17) {
			Static214.anInt3764 = arg2;
			Static165.anInt2905 = arg1;
			Static174.anInt3035 = 2;
			Static144.anInt2710 = 0;
			Static229.method3783(Static3.aClass244_1);
			Static23.aClass3_Sub5_Sub1_1.method2732(local25);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static103.anInt2044 + local18);
			Static23.aClass3_Sub5_Sub1_1.method2733(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2762(local15 + Static21.anInt265);
			Static231.method3844(local18, local15);
		}
		if (local21 == 1007) {
			Static174.anInt3035 = 2;
			Static165.anInt2905 = arg1;
			Static144.anInt2710 = 0;
			Static214.anInt3764 = arg2;
			Static229.method3783(Static90.aClass244_28);
			Static23.aClass3_Sub5_Sub1_1.method2749(local25);
		}
		if (local21 == 1008) {
			Static214.anInt3764 = arg2;
			Static174.anInt3035 = 2;
			Static165.anInt2905 = arg1;
			Static144.anInt2710 = 0;
			Static229.method3783(Static267.aClass244_81);
			Static23.aClass3_Sub5_Sub1_1.method2749(local25);
		}
		if (local21 == 44) {
			if (Static315.anInt5429 > 0 && Static322.aClass89_25.method1847(82) && Static322.aClass89_25.method1847(81)) {
				Static203.method3172(Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, local15 + Static21.anInt265, Static103.anInt2044 + local18);
			} else {
				Static214.anInt3764 = arg2;
				Static144.anInt2710 = 0;
				Static174.anInt3035 = 1;
				Static165.anInt2905 = arg1;
				Static229.method3783(Static88.aClass244_27);
				Static23.aClass3_Sub5_Sub1_1.method2727(local18 + Static103.anInt2044);
				Static23.aClass3_Sub5_Sub1_1.method2727(Static21.anInt265 + local15);
			}
		}
		if (local21 == 6) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static165.anInt2905 = arg1;
				Static144.anInt2710 = 0;
				Static174.anInt3035 = 2;
				Static214.anInt3764 = arg2;
				Static229.method3783(Static188.aClass244_46);
				Static23.aClass3_Sub5_Sub1_1.method2732(local25);
				Static23.aClass3_Sub5_Sub1_1.method2733(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 47) {
			if (Static315.anInt5429 > 0 && Static322.aClass89_25.method1847(82) && Static322.aClass89_25.method1847(81)) {
				Static203.method3172(Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, local15 + Static21.anInt265, local18 + Static103.anInt2044);
			} else {
				Static238.method3921(local15, local25, local18);
				if (local25 == 1) {
					Static23.aClass3_Sub5_Sub1_1.method2791(-1);
					Static23.aClass3_Sub5_Sub1_1.method2791(-1);
					Static23.aClass3_Sub5_Sub1_1.method2749((int) Static352.aFloat68);
					Static23.aClass3_Sub5_Sub1_1.method2791(57);
					Static23.aClass3_Sub5_Sub1_1.method2791(Static129.anInt2435);
					Static23.aClass3_Sub5_Sub1_1.method2791(Static187.anInt3396);
					Static23.aClass3_Sub5_Sub1_1.method2791(89);
					Static23.aClass3_Sub5_Sub1_1.method2749(Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774);
					Static23.aClass3_Sub5_Sub1_1.method2749(Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766);
					Static23.aClass3_Sub5_Sub1_1.method2791(63);
				} else {
					Static165.anInt2905 = arg1;
					Static174.anInt3035 = 1;
					Static214.anInt3764 = arg2;
					Static144.anInt2710 = 0;
				}
				Static165.method2523(true, -4, 1, 0, local18, 0, local15, 1);
			}
		}
		if (local21 == 5) {
			Static165.anInt2905 = arg1;
			Static144.anInt2710 = 0;
			Static214.anInt3764 = arg2;
			Static174.anInt3035 = 2;
			Static229.method3783(Static219.aClass244_54);
			Static23.aClass3_Sub5_Sub1_1.method2756(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2727(Static127.anInt2413);
			Static23.aClass3_Sub5_Sub1_1.method2749(local18 + Static103.anInt2044);
			Static23.aClass3_Sub5_Sub1_1.method2728(Static242.anInt4268);
			Static23.aClass3_Sub5_Sub1_1.method2762(local25);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static109.anInt2149);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static21.anInt265 + local15);
			Static231.method3844(local18, local15);
		}
		if (local21 == 19) {
			Static174.anInt3035 = 2;
			Static144.anInt2710 = 0;
			Static165.anInt2905 = arg1;
			Static214.anInt3764 = arg2;
			Static229.method3783(Static110.aClass244_35);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static21.anInt265 + local15);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2749((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static23.aClass3_Sub5_Sub1_1.method2762(local18 + Static103.anInt2044);
			Static16.method202(local34, local18, local15);
		}
		if (local21 == 20) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static174.anInt3035 = 2;
				Static144.anInt2710 = 0;
				Static214.anInt3764 = arg2;
				Static165.anInt2905 = arg1;
				Static229.method3783(Static74.aClass244_20);
				Static23.aClass3_Sub5_Sub1_1.method2765(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2762(local25);
				Static23.aClass3_Sub5_Sub1_1.method2727(Static127.anInt2413);
				Static23.aClass3_Sub5_Sub1_1.method2749(Static109.anInt2149);
				Static23.aClass3_Sub5_Sub1_1.method2790(Static242.anInt4268);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 21) {
			Static214.anInt3764 = arg2;
			Static165.anInt2905 = arg1;
			Static144.anInt2710 = 0;
			Static174.anInt3035 = 2;
			Static229.method3783(Static262.aClass244_16);
			Static23.aClass3_Sub5_Sub1_1.method2765(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2732(Static21.anInt265 + local15);
			Static23.aClass3_Sub5_Sub1_1.method2732(local18 + Static103.anInt2044);
			Static23.aClass3_Sub5_Sub1_1.method2727(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static16.method202(local34, local18, local15);
		}
		if (local21 == 11 || local21 == 1004) {
			Static274.method4277(arg0.aString12, local25, local15, local18);
		}
		if (local21 == 25) {
			Static165.anInt2905 = arg1;
			Static144.anInt2710 = 0;
			Static174.anInt3035 = 2;
			Static214.anInt3764 = arg2;
			Static229.method3783(Static105.aClass244_32);
			Static23.aClass3_Sub5_Sub1_1.method2765(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2749(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static23.aClass3_Sub5_Sub1_1.method2732(Static103.anInt2044 + local18);
			Static23.aClass3_Sub5_Sub1_1.method2732(local15 + Static21.anInt265);
			Static16.method202(local34, local18, local15);
		}
		if (local21 == 30) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static144.anInt2710 = 0;
				Static174.anInt3035 = 2;
				Static165.anInt2905 = arg1;
				Static214.anInt3764 = arg2;
				Static229.method3783(Static34.aClass244_11);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2732(local25);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 45) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static144.anInt2710 = 0;
				Static174.anInt3035 = 2;
				Static214.anInt3764 = arg2;
				Static165.anInt2905 = arg1;
				Static229.method3783(Static56.aClass244_14);
				Static23.aClass3_Sub5_Sub1_1.method2749(local25);
				Static23.aClass3_Sub5_Sub1_1.method2756(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 3) {
			local101 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local25];
			if (local101 != null) {
				Static214.anInt3764 = arg2;
				Static174.anInt3035 = 2;
				Static144.anInt2710 = 0;
				Static165.anInt2905 = arg1;
				Static229.method3783(Static361.aClass244_90);
				Static23.aClass3_Sub5_Sub1_1.method2732(Static109.anInt2149);
				Static23.aClass3_Sub5_Sub1_1.method2758(Static242.anInt4268);
				Static23.aClass3_Sub5_Sub1_1.method2732(local25);
				Static23.aClass3_Sub5_Sub1_1.method2727(Static127.anInt2413);
				Static23.aClass3_Sub5_Sub1_1.method2765(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local101.method4009(), 0, local101.anIntArray490[0], 0, local101.anIntArray491[0], local101.method4009());
			}
		}
		if (local21 == 23) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static144.anInt2710 = 0;
				Static165.anInt2905 = arg1;
				Static214.anInt3764 = arg2;
				Static174.anInt3035 = 2;
				Static229.method3783(Static372.aClass244_91);
				Static23.aClass3_Sub5_Sub1_1.method2762(local25);
				Static23.aClass3_Sub5_Sub1_1.method2733(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 18) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static214.anInt3764 = arg2;
				Static165.anInt2905 = arg1;
				Static144.anInt2710 = 0;
				Static174.anInt3035 = 2;
				Static229.method3783(Static352.aClass244_88);
				Static23.aClass3_Sub5_Sub1_1.method2733(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2732(local25);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 48) {
			Static165.anInt2905 = arg1;
			Static174.anInt3035 = 1;
			Static144.anInt2710 = 0;
			Static214.anInt3764 = arg2;
			Static229.method3783(Static92.aClass244_29);
			Static23.aClass3_Sub5_Sub1_1.method2727(Static109.anInt2149);
			Static23.aClass3_Sub5_Sub1_1.method2732(Static127.anInt2413);
			Static23.aClass3_Sub5_Sub1_1.method2749(Static103.anInt2044 + local18);
			Static23.aClass3_Sub5_Sub1_1.method2732(Static21.anInt265 + local15);
			Static23.aClass3_Sub5_Sub1_1.method2790(Static242.anInt4268);
			Static165.method2523(true, -4, 1, 0, local18, 0, local15, 1);
		}
		if (local21 == 60) {
			Static214.anInt3764 = arg2;
			Static144.anInt2710 = 0;
			Static165.anInt2905 = arg1;
			Static174.anInt3035 = 2;
			Static229.method3783(Static321.aClass244_45);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2727(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static23.aClass3_Sub5_Sub1_1.method2727(Static103.anInt2044 + local18);
			Static23.aClass3_Sub5_Sub1_1.method2727(Static21.anInt265 + local15);
			Static16.method202(local34, local18, local15);
		}
		if (local21 == 10) {
			local101 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local25];
			if (local101 != null) {
				Static174.anInt3035 = 2;
				Static144.anInt2710 = 0;
				Static214.anInt3764 = arg2;
				Static165.anInt2905 = arg1;
				Static229.method3783(Static49.aClass244_74);
				Static23.aClass3_Sub5_Sub1_1.method2756(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2732(local25);
				Static165.method2523(true, -2, local101.method4009(), 0, local101.anIntArray490[0], 0, local101.anIntArray491[0], local101.method4009());
			}
		}
		if (local21 == 1012) {
			Static214.anInt3764 = arg2;
			Static144.anInt2710 = 0;
			Static165.anInt2905 = arg1;
			Static174.anInt3035 = 2;
			local101 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local25];
			if (local101 != null) {
				@Pc(1621) Class61 local1621 = local101.aClass61_1;
				if (local1621.anIntArray142 != null) {
					local1621 = local1621.method1216(Static331.aClass115_1);
				}
				if (local1621 != null) {
					Static229.method3783(Static298.aClass244_72);
					Static23.aClass3_Sub5_Sub1_1.method2749(local1621.anInt1465);
				}
			}
		}
		if (local21 == 13) {
			Static144.anInt2710 = 0;
			Static174.anInt3035 = 2;
			Static214.anInt3764 = arg2;
			Static165.anInt2905 = arg1;
			Static229.method3783(Static313.aClass244_82);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2732(local25);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static21.anInt265 + local15);
			Static23.aClass3_Sub5_Sub1_1.method2732(local18 + Static103.anInt2044);
			Static231.method3844(local18, local15);
		}
		if (local21 == 22) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static214.anInt3764 = arg2;
				Static165.anInt2905 = arg1;
				Static174.anInt3035 = 2;
				Static144.anInt2710 = 0;
				Static229.method3783(Static80.aClass244_24);
				Static23.aClass3_Sub5_Sub1_1.method2733(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2732(local25);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 46) {
			local101 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local25];
			if (local101 != null) {
				Static174.anInt3035 = 2;
				Static144.anInt2710 = 0;
				Static214.anInt3764 = arg2;
				Static165.anInt2905 = arg1;
				Static229.method3783(Static69.aClass244_19);
				Static23.aClass3_Sub5_Sub1_1.method2756(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2762(local25);
				Static165.method2523(true, -2, local101.method4009(), 0, local101.anIntArray490[0], 0, local101.anIntArray491[0], local101.method4009());
			}
		}
		if (local21 == 12) {
			local346 = Static80.method1338(local18, local15);
			if (local346 != null) {
				Static329.method5026(local346);
			}
		}
		if (local21 == 58) {
			local101 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local25];
			if (local101 != null) {
				Static214.anInt3764 = arg2;
				Static144.anInt2710 = 0;
				Static174.anInt3035 = 2;
				Static165.anInt2905 = arg1;
				Static229.method3783(Static78.aClass244_22);
				Static23.aClass3_Sub5_Sub1_1.method2727(local25);
				Static23.aClass3_Sub5_Sub1_1.method2765(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static165.method2523(true, -2, local101.method4009(), 0, local101.anIntArray490[0], 0, local101.anIntArray491[0], local101.method4009());
			}
		}
		if (local21 == 1010 || local21 == 1001 || local21 == 1009 || local21 == 1006 || local21 == 1002) {
			Static260.method4182(local15, local21, local25);
		}
		if (local21 == 59) {
			local41 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local25];
			if (local41 != null) {
				Static165.anInt2905 = arg1;
				Static144.anInt2710 = 0;
				Static214.anInt3764 = arg2;
				Static174.anInt3035 = 2;
				Static229.method3783(Static344.aClass244_83);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2762(local25);
				Static165.method2523(true, -2, local41.method4009(), 0, local41.anIntArray490[0], 0, local41.anIntArray491[0], local41.method4009());
			}
		}
		if (local21 == 1003) {
			Static144.anInt2710 = 0;
			Static214.anInt3764 = arg2;
			Static174.anInt3035 = 2;
			Static165.anInt2905 = arg1;
			Static229.method3783(Static347.aClass244_84);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static103.anInt2044 + local18);
			Static23.aClass3_Sub5_Sub1_1.method2749(Static21.anInt265 + local15);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2732(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static16.method202(local34, local18, local15);
		}
		if (local21 == 50) {
			Static144.anInt2710 = 0;
			Static174.anInt3035 = 2;
			Static214.anInt3764 = arg2;
			Static165.anInt2905 = arg1;
			Static229.method3783(Static193.aClass244_50);
			Static23.aClass3_Sub5_Sub1_1.method2732(local25);
			Static23.aClass3_Sub5_Sub1_1.method2765(Static322.aClass89_25.method1847(82) ? 1 : 0);
			Static23.aClass3_Sub5_Sub1_1.method2732(local18 + Static103.anInt2044);
			Static23.aClass3_Sub5_Sub1_1.method2762(Static21.anInt265 + local15);
			Static231.method3844(local18, local15);
		}
		if (Static68.aBoolean81) {
			Static203.method3169();
		}
		if (Static393.aClass62_20 != null && Static285.anInt4992 == 0) {
			Static158.method2441(Static393.aClass62_20);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([[[Lclient!ct;I)V")
	public static void method1618(@OriginalArg(0) Class48[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class48[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class48 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass28_Sub2_2 instanceof Interface3) {
							((Interface3) local27.aClass28_Sub2_2).method5421();
						}
						if (local27.aClass28_Sub4_2 instanceof Interface3) {
							((Interface3) local27.aClass28_Sub4_2).method5421();
						}
						if (local27.aClass28_Sub4_1 instanceof Interface3) {
							((Interface3) local27.aClass28_Sub4_1).method5421();
						}
						if (local27.aClass28_Sub3_1 instanceof Interface3) {
							((Interface3) local27.aClass28_Sub3_1).method5421();
						}
						if (local27.aClass28_Sub3_2 instanceof Interface3) {
							((Interface3) local27.aClass28_Sub3_2).method5421();
						}
						for (@Pc(81) Class50 local81 = local27.aClass50_1; local81 != null; local81 = local81.aClass50_2) {
							@Pc(86) Class28_Sub1 local86 = local81.aClass28_Sub1_1;
							if (local86 instanceof Interface3) {
								((Interface3) local86).method5421();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)I")
	public static int method1620(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
