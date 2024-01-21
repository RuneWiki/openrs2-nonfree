import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
	public static int anInt2431;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_24;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "Lclient!qc;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_1 = new Class1_Sub1_Sub12();

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1310 = Static23.method501("logo");

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1311 = Static23.method501("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1312 = Static23.method501("leuchten2:");

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_26 = new Class37(64);

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1313 = Static23.method501("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public static void method1676(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg2; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg3 + arg1; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static52.aByteArrayArrayArray6[0][local11][local7] = 127;
					if (local11 == arg3 && local11 > 0) {
						Static10.anIntArrayArrayArray1[0][local11][local7] = Static10.anIntArrayArrayArray1[0][local11 - 1][local7];
					}
					if (local11 == arg3 + arg1 && local11 < 103) {
						Static10.anIntArrayArrayArray1[0][local11][local7] = Static10.anIntArrayArrayArray1[0][local11 + 1][local7];
					}
					if (arg0 == local7 && local7 > 0) {
						Static10.anIntArrayArrayArray1[0][local11][local7] = Static10.anIntArrayArrayArray1[0][local11][local7 - 1];
					}
					if (local7 == arg0 + arg2 && local7 < 103) {
						Static10.anIntArrayArrayArray1[0][local11][local7] = Static10.anIntArrayArrayArray1[0][local11][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public static void method1677() {
		aClass42_1312 = null;
		aClass1_Sub1_Sub12_1 = null;
		aClass37_26 = null;
		aClass42_1310 = null;
		aClass42_1311 = null;
		aClass1_Sub1_Sub1_Sub4_24 = null;
		aClass42_1313 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIIIIIZIIIII)Z")
	public static boolean method1680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static79.anIntArrayArray25[local7][local11] = 0;
				Static62.anIntArrayArray16[local7][local11] = 99999999;
			}
		}
		local11 = arg9;
		Static79.anIntArrayArray25[arg9][arg7] = 99;
		Static62.anIntArrayArray16[arg9][arg7] = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) boolean local55 = false;
		@Pc(57) int local57 = arg7;
		@Pc(59) byte local59 = 0;
		Static43.anIntArray164[0] = arg9;
		@Pc(71) int local71 = local59 + 1;
		Static53.anIntArray402[0] = arg7;
		@Pc(78) int[][] local78 = Static91.aClass6Array1[Static82.anInt2165].anIntArrayArray1;
		@Pc(81) int local81 = Static43.anIntArray164.length;
		@Pc(189) int local189;
		while (local71 != local53) {
			local57 = Static53.anIntArray402[local53];
			local11 = Static43.anIntArray164[local53];
			local53 = (local53 + 1) % local81;
			if (arg2 == local11 && arg10 == local57) {
				local55 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static91.aClass6Array1[Static82.anInt2165].method115(arg0, arg1 - 1, arg2, local11, arg10, local57)) {
					local55 = true;
					break;
				}
				if (arg1 < 10 && Static91.aClass6Array1[Static82.anInt2165].method126(arg10, arg0, arg2, local11, local57, arg1 - 1)) {
					local55 = true;
					break;
				}
			}
			if (arg3 != 0 && arg8 != 0 && Static91.aClass6Array1[Static82.anInt2165].method121(local57, arg3, arg10, arg8, arg4, local11, arg2)) {
				local55 = true;
				break;
			}
			local189 = Static62.anIntArrayArray16[local11][local57] + 1;
			if (local11 > 0 && Static79.anIntArrayArray25[local11 - 1][local57] == 0 && (local78[local11 - 1][local57] & 0x1280108) == 0) {
				Static43.anIntArray164[local71] = local11 - 1;
				Static53.anIntArray402[local71] = local57;
				Static79.anIntArrayArray25[local11 - 1][local57] = 2;
				local71 = (local71 + 1) % local81;
				Static62.anIntArrayArray16[local11 - 1][local57] = local189;
			}
			if (local11 < 103 && Static79.anIntArrayArray25[local11 + 1][local57] == 0 && (local78[local11 + 1][local57] & 0x1280180) == 0) {
				Static43.anIntArray164[local71] = local11 + 1;
				Static53.anIntArray402[local71] = local57;
				local71 = (local71 + 1) % local81;
				Static79.anIntArrayArray25[local11 + 1][local57] = 8;
				Static62.anIntArrayArray16[local11 + 1][local57] = local189;
			}
			if (local57 > 0 && Static79.anIntArrayArray25[local11][local57 - 1] == 0 && (local78[local11][local57 - 1] & 0x1280102) == 0) {
				Static43.anIntArray164[local71] = local11;
				Static53.anIntArray402[local71] = local57 - 1;
				local71 = (local71 + 1) % local81;
				Static79.anIntArrayArray25[local11][local57 - 1] = 1;
				Static62.anIntArrayArray16[local11][local57 - 1] = local189;
			}
			if (local57 < 103 && Static79.anIntArrayArray25[local11][local57 + 1] == 0 && (local78[local11][local57 + 1] & 0x1280120) == 0) {
				Static43.anIntArray164[local71] = local11;
				Static53.anIntArray402[local71] = local57 + 1;
				local71 = (local71 + 1) % local81;
				Static79.anIntArrayArray25[local11][local57 + 1] = 4;
				Static62.anIntArrayArray16[local11][local57 + 1] = local189;
			}
			if (local11 > 0 && local57 > 0 && Static79.anIntArrayArray25[local11 - 1][local57 - 1] == 0 && (local78[local11 - 1][local57 - 1] & 0x128010E) == 0 && (local78[local11 - 1][local57] & 0x1280108) == 0 && (local78[local11][local57 - 1] & 0x1280102) == 0) {
				Static43.anIntArray164[local71] = local11 - 1;
				Static53.anIntArray402[local71] = local57 - 1;
				Static79.anIntArrayArray25[local11 - 1][local57 - 1] = 3;
				Static62.anIntArrayArray16[local11 - 1][local57 - 1] = local189;
				local71 = (local71 + 1) % local81;
			}
			if (local11 < 103 && local57 > 0 && Static79.anIntArrayArray25[local11 + 1][local57 - 1] == 0 && (local78[local11 + 1][local57 - 1] & 0x1280183) == 0 && (local78[local11 + 1][local57] & 0x1280180) == 0 && (local78[local11][local57 - 1] & 0x1280102) == 0) {
				Static43.anIntArray164[local71] = local11 + 1;
				Static53.anIntArray402[local71] = local57 - 1;
				local71 = (local71 + 1) % local81;
				Static79.anIntArrayArray25[local11 + 1][local57 - 1] = 9;
				Static62.anIntArrayArray16[local11 + 1][local57 - 1] = local189;
			}
			if (local11 > 0 && local57 < 103 && Static79.anIntArrayArray25[local11 - 1][local57 + 1] == 0 && (local78[local11 - 1][local57 + 1] & 0x1280138) == 0 && (local78[local11 - 1][local57] & 0x1280108) == 0 && (local78[local11][local57 + 1] & 0x1280120) == 0) {
				Static43.anIntArray164[local71] = local11 - 1;
				Static53.anIntArray402[local71] = local57 + 1;
				local71 = (local71 + 1) % local81;
				Static79.anIntArrayArray25[local11 - 1][local57 + 1] = 6;
				Static62.anIntArrayArray16[local11 - 1][local57 + 1] = local189;
			}
			if (local11 < 103 && local57 < 103 && Static79.anIntArrayArray25[local11 + 1][local57 + 1] == 0 && (local78[local11 + 1][local57 + 1] & 0x12801E0) == 0 && (local78[local11 + 1][local57] & 0x1280180) == 0 && (local78[local11][local57 + 1] & 0x1280120) == 0) {
				Static43.anIntArray164[local71] = local11 + 1;
				Static53.anIntArray402[local71] = local57 + 1;
				Static79.anIntArrayArray25[local11 + 1][local57 + 1] = 12;
				local71 = (local71 + 1) % local81;
				Static62.anIntArrayArray16[local11 + 1][local57 + 1] = local189;
			}
		}
		Static56.anInt1428 = 0;
		@Pc(808) int local808;
		@Pc(815) int local815;
		@Pc(822) int local822;
		if (!local55) {
			if (!arg5) {
				return false;
			}
			local189 = 1000;
			local808 = 100;
			for (local815 = arg2 - 10; local815 <= arg2 + 10; local815++) {
				for (local822 = arg10 - 10; local822 <= arg10 + 10; local822++) {
					if (local815 >= 0 && local822 >= 0 && local815 < 104 && local822 < 104 && Static62.anIntArrayArray16[local815][local822] < 100) {
						@Pc(848) int local848 = 0;
						@Pc(850) int local850 = 0;
						if (local815 < arg2) {
							local848 = arg2 - local815;
						} else if (arg3 + arg2 - 1 < local815) {
							local848 = local815 + 1 - arg2 - arg3;
						}
						if (arg10 > local822) {
							local850 = arg10 - local822;
						} else if (local822 > arg8 + arg10 - 1) {
							local850 = local822 + 1 - arg10 - arg8;
						}
						@Pc(922) int local922 = local850 * local850 + local848 * local848;
						if (local189 > local922 || local922 == local189 && Static62.anIntArrayArray16[local815][local822] < local808) {
							local189 = local922;
							local808 = Static62.anIntArrayArray16[local815][local822];
							local57 = local822;
							local11 = local815;
						}
					}
				}
			}
			if (local189 == 1000) {
				return false;
			}
			if (local11 == arg9 && local57 == arg7) {
				return false;
			}
			Static56.anInt1428 = 1;
		}
		@Pc(992) byte local992 = 0;
		Static43.anIntArray164[0] = local11;
		local53 = local992 + 1;
		Static53.anIntArray402[0] = local57;
		local189 = local808 = Static79.anIntArrayArray25[local11][local57];
		while (arg9 != local11 || arg7 != local57) {
			if (local808 != local189) {
				local808 = local189;
				Static43.anIntArray164[local53] = local11;
				Static53.anIntArray402[local53++] = local57;
			}
			if ((local189 & 0x2) != 0) {
				local11++;
			} else if ((local189 & 0x8) != 0) {
				local11--;
			}
			if ((local189 & 0x1) != 0) {
				local57++;
			} else if ((local189 & 0x4) != 0) {
				local57--;
			}
			local189 = Static79.anIntArrayArray25[local11][local57];
		}
		if (local53 > 0) {
			local81 = local53;
			if (local53 > 25) {
				local81 = 25;
			}
			local53--;
			@Pc(1093) int local1093 = Static43.anIntArray164[local53];
			local815 = Static53.anIntArray402[local53];
			if (arg6 == 0) {
				Static98.aClass1_Sub8_Sub1_3.method1236(105);
				Static98.aClass1_Sub8_Sub1_3.method1185(local81 + local81 + 3);
			}
			if (arg6 == 1) {
				Static98.aClass1_Sub8_Sub1_3.method1236(211);
				Static98.aClass1_Sub8_Sub1_3.method1185(local81 + local81 + 3 + 14);
			}
			if (arg6 == 2) {
				Static98.aClass1_Sub8_Sub1_3.method1236(95);
				Static98.aClass1_Sub8_Sub1_3.method1185(local81 + local81 + 3);
			}
			Static61.anInt1459 = Static43.anIntArray164[0];
			Static30.anInt833 = Static53.anIntArray402[0];
			for (local822 = 1; local822 < local81; local822++) {
				local53--;
				Static98.aClass1_Sub8_Sub1_3.method1200(Static43.anIntArray164[local53] - local1093);
				Static98.aClass1_Sub8_Sub1_3.method1221(Static53.anIntArray402[local53] - local815);
			}
			Static98.aClass1_Sub8_Sub1_3.method1222(local1093 + Static51.anInt1373);
			Static98.aClass1_Sub8_Sub1_3.method1200(Static59.aBooleanArray14[82] ? 1 : 0);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static45.anInt1843 + local815);
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
