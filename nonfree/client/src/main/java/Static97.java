import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
	public static int anInt6858;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_209 = new Class119(64);

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	public static int anInt6854 = 0;

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "Z")
	public static boolean aBoolean601 = false;

	@OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
	public static int anInt6861 = 0;

	@OriginalMember(owner = "client!fs", name = "D", descriptor = "Z")
	public static boolean aBoolean602 = false;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Z")
	public static boolean method5912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static255.anInt5037; local1++) {
			@Pc(6) Class184 local6 = Static277.aClass184Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5834 == 1) {
				local15 = local6.anInt5836 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5832 + (local6.anInt5841 * local15 >> 8);
					local37 = local6.anInt5829 + (local6.anInt5826 * local15 >> 8);
					local47 = local6.anInt5831 + (local6.anInt5839 * local15 >> 8);
					local57 = local6.anInt5828 + (local6.anInt5827 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5834 == 2) {
				local15 = arg0 - local6.anInt5836;
				if (local15 > 0) {
					local27 = local6.anInt5832 + (local6.anInt5841 * local15 >> 8);
					local37 = local6.anInt5829 + (local6.anInt5826 * local15 >> 8);
					local47 = local6.anInt5831 + (local6.anInt5839 * local15 >> 8);
					local57 = local6.anInt5828 + (local6.anInt5827 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5834 == 3) {
				local15 = local6.anInt5832 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5836 + (local6.anInt5840 * local15 >> 8);
					local37 = local6.anInt5835 + (local6.anInt5838 * local15 >> 8);
					local47 = local6.anInt5831 + (local6.anInt5839 * local15 >> 8);
					local57 = local6.anInt5828 + (local6.anInt5827 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5834 == 4) {
				local15 = arg2 - local6.anInt5832;
				if (local15 > 0) {
					local27 = local6.anInt5836 + (local6.anInt5840 * local15 >> 8);
					local37 = local6.anInt5835 + (local6.anInt5838 * local15 >> 8);
					local47 = local6.anInt5831 + (local6.anInt5839 * local15 >> 8);
					local57 = local6.anInt5828 + (local6.anInt5827 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5834 == 5) {
				local15 = arg1 - local6.anInt5831;
				if (local15 > 0) {
					local27 = local6.anInt5836 + (local6.anInt5840 * local15 >> 8);
					local37 = local6.anInt5835 + (local6.anInt5838 * local15 >> 8);
					local47 = local6.anInt5832 + (local6.anInt5841 * local15 >> 8);
					local57 = local6.anInt5829 + (local6.anInt5826 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZ)I")
	public static int method5913(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method5915(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static355.anInt6969 >= 100) {
			Static198.method3549(Static42.aClass93_13.method2819(Static21.anInt455));
			return;
		}
		@Pc(24) String local24 = Static335.method5804(arg0);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static355.anInt6969; local29++) {
			@Pc(37) String local37 = Static335.method5804(Static283.aStringArray51[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static198.method3549(arg0 + Static116.aClass93_49.method2819(Static21.anInt455));
				return;
			}
			if (Static266.aStringArray48[local29] != null) {
				local67 = Static335.method5804(Static266.aStringArray48[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static198.method3549(arg0 + Static116.aClass93_49.method2819(Static21.anInt455));
					return;
				}
			}
		}
		for (@Pc(93) int local93 = 0; local93 < Static296.anInt6002; local93++) {
			local67 = Static335.method5804(Static287.aStringArray53[local93]);
			if (local67 != null && local67.equals(local24)) {
				Static198.method3549(Static79.aClass93_27.method2819(Static21.anInt455) + arg0 + Static225.aClass93_87.method2819(Static21.anInt455));
				return;
			}
			if (Static110.aStringArray15[local93] != null) {
				@Pc(136) String local136 = Static335.method5804(Static110.aStringArray15[local93]);
				if (local136 != null && local136.equals(local24)) {
					Static198.method3549(Static79.aClass93_27.method2819(Static21.anInt455) + arg0 + Static225.aClass93_87.method2819(Static21.anInt455));
					return;
				}
			}
		}
		if (Static335.method5804(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48).equals(local24)) {
			Static198.method3549(Static44.aClass93_14.method2819(Static21.anInt455));
		} else {
			Static74.aClass2_Sub10_Sub1_2.method2049(70);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(arg0) + 1);
			Static74.aClass2_Sub10_Sub1_2.method4443(arg0);
			Static74.aClass2_Sub10_Sub1_2.method4430(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;III[BI)I")
	public static int method5916(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(9) int local9 = arg3;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(19) char local19 = arg0.charAt(local11);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				arg2[local11 + arg1] = (byte) local19;
			} else if (local19 == '€') {
				arg2[arg1 + local11] = -128;
			} else if (local19 == '‚') {
				arg2[local11 + arg1] = -126;
			} else if (local19 == 'ƒ') {
				arg2[arg1 + local11] = -125;
			} else if (local19 == '„') {
				arg2[local11 + arg1] = -124;
			} else if (local19 == '…') {
				arg2[arg1 + local11] = -123;
			} else if (local19 == '†') {
				arg2[arg1 + local11] = -122;
			} else if (local19 == '‡') {
				arg2[local11 + arg1] = -121;
			} else if (local19 == 'ˆ') {
				arg2[local11 + arg1] = -120;
			} else if (local19 == '‰') {
				arg2[local11 + arg1] = -119;
			} else if (local19 == 'Š') {
				arg2[arg1 + local11] = -118;
			} else if (local19 == '‹') {
				arg2[arg1 + local11] = -117;
			} else if (local19 == 'Œ') {
				arg2[local11 + arg1] = -116;
			} else if (local19 == 'Ž') {
				arg2[arg1 + local11] = -114;
			} else if (local19 == '‘') {
				arg2[local11 + arg1] = -111;
			} else if (local19 == '’') {
				arg2[arg1 + local11] = -110;
			} else if (local19 == '“') {
				arg2[arg1 + local11] = -109;
			} else if (local19 == '”') {
				arg2[arg1 + local11] = -108;
			} else if (local19 == '•') {
				arg2[local11 + arg1] = -107;
			} else if (local19 == '–') {
				arg2[local11 + arg1] = -106;
			} else if (local19 == '—') {
				arg2[local11 + arg1] = -105;
			} else if (local19 == '˜') {
				arg2[local11 + arg1] = -104;
			} else if (local19 == '™') {
				arg2[arg1 + local11] = -103;
			} else if (local19 == 'š') {
				arg2[arg1 + local11] = -102;
			} else if (local19 == '›') {
				arg2[local11 + arg1] = -101;
			} else if (local19 == 'œ') {
				arg2[arg1 + local11] = -100;
			} else if (local19 == 'ž') {
				arg2[arg1 + local11] = -98;
			} else if (local19 == 'Ÿ') {
				arg2[arg1 + local11] = -97;
			} else {
				arg2[local11 + arg1] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILclient!p;IIIIBII)Z")
	public static boolean method5918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg1;
		@Pc(23) int local23 = arg6 - 64;
		@Pc(28) int local28 = arg1 - 64;
		Static350.anIntArrayArray185[64][64] = 99;
		Static130.anIntArrayArray137[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static256.anIntArray386[0] = arg6;
		@Pc(51) int local51 = local42 + 1;
		Static104.anIntArray408[0] = arg1;
		@Pc(56) int[][] local56 = arg3.anIntArrayArray128;
		while (local44 != local51) {
			local9 = Static104.anIntArray408[local44];
			local7 = Static256.anIntArray386[local44];
			@Pc(71) int local71 = local7 - arg3.anInt4563;
			local44 = local44 + 1 & 0xFFF;
			@Pc(82) int local82 = local9 - local28;
			@Pc(87) int local87 = local7 - local23;
			@Pc(93) int local93 = local9 - arg3.anInt4572;
			if (arg2 == -4) {
				if (arg0 == local7 && local9 == arg5) {
					Static81.anInt1750 = local7;
					Static251.anInt4951 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static263.method4787(arg4, local9, 1, arg0, arg7, 1, local7, arg5)) {
					Static81.anInt1750 = local7;
					Static251.anInt4951 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg3.method4098(arg7, arg8, arg4, 1, arg0, local9, 1, local7, arg5)) {
					Static251.anInt4951 = local9;
					Static81.anInt1750 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg3.method4103(arg8, arg0, arg4, arg7, 1, local7, local9, arg5)) {
					Static81.anInt1750 = local7;
					Static251.anInt4951 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg3.method4105(local7, local9, arg5, 1, arg0, arg2, arg9)) {
					Static81.anInt1750 = local7;
					Static251.anInt4951 = local9;
					return true;
				}
			} else if (arg3.method4100(arg5, local9, arg2, arg0, 1, local7, arg9)) {
				Static81.anInt1750 = local7;
				Static251.anInt4951 = local9;
				return true;
			}
			@Pc(245) int local245 = Static130.anIntArrayArray137[local87][local82] + 1;
			if (local87 > 0 && Static350.anIntArrayArray185[local87 - 1][local82] == 0 && (local56[local71 - 1][local93] & 0x42240000) == 0) {
				Static256.anIntArray386[local51] = local7 - 1;
				Static104.anIntArray408[local51] = local9;
				Static350.anIntArrayArray185[local87 - 1][local82] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local87 - 1][local82] = local245;
			}
			if (local87 < 127 && Static350.anIntArrayArray185[local87 + 1][local82] == 0 && (local56[local71 + 1][local93] & 0x60240000) == 0) {
				Static256.anIntArray386[local51] = local7 + 1;
				Static104.anIntArray408[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local87 + 1][local82] = 8;
				Static130.anIntArrayArray137[local87 + 1][local82] = local245;
			}
			if (local82 > 0 && Static350.anIntArrayArray185[local87][local82 - 1] == 0 && (local56[local71][local93 - 1] & 0x40A40000) == 0) {
				Static256.anIntArray386[local51] = local7;
				Static104.anIntArray408[local51] = local9 - 1;
				Static350.anIntArrayArray185[local87][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local87][local82 - 1] = local245;
			}
			if (local82 < 127 && Static350.anIntArrayArray185[local87][local82 + 1] == 0 && (local56[local71][local93 + 1] & 0x48240000) == 0) {
				Static256.anIntArray386[local51] = local7;
				Static104.anIntArray408[local51] = local9 + 1;
				Static350.anIntArrayArray185[local87][local82 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local87][local82 + 1] = local245;
			}
			if (local87 > 0 && local82 > 0 && Static350.anIntArrayArray185[local87 - 1][local82 - 1] == 0 && (local56[local71 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local71 - 1][local93] & 0x42240000) == 0 && (local56[local71][local93 - 1] & 0x40A40000) == 0) {
				Static256.anIntArray386[local51] = local7 - 1;
				Static104.anIntArray408[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local87 - 1][local82 - 1] = 3;
				Static130.anIntArrayArray137[local87 - 1][local82 - 1] = local245;
			}
			if (local87 < 127 && local82 > 0 && Static350.anIntArrayArray185[local87 + 1][local82 - 1] == 0 && (local56[local71 + 1][local93 - 1] & 0x60E40000) == 0 && (local56[local71 + 1][local93] & 0x60240000) == 0 && (local56[local71][local93 - 1] & 0x40A40000) == 0) {
				Static256.anIntArray386[local51] = local7 + 1;
				Static104.anIntArray408[local51] = local9 - 1;
				Static350.anIntArrayArray185[local87 + 1][local82 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static130.anIntArrayArray137[local87 + 1][local82 - 1] = local245;
			}
			if (local87 > 0 && local82 < 127 && Static350.anIntArrayArray185[local87 - 1][local82 + 1] == 0 && (local56[local71 - 1][local93 + 1] & 0x4E240000) == 0 && (local56[local71 - 1][local93] & 0x42240000) == 0 && (local56[local71][local93 + 1] & 0x48240000) == 0) {
				Static256.anIntArray386[local51] = local7 - 1;
				Static104.anIntArray408[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local87 - 1][local82 + 1] = 6;
				Static130.anIntArrayArray137[local87 - 1][local82 + 1] = local245;
			}
			if (local87 < 127 && local82 < 127 && Static350.anIntArrayArray185[local87 + 1][local82 + 1] == 0 && (local56[local71 + 1][local93 + 1] & 0x78240000) == 0 && (local56[local71 + 1][local93] & 0x60240000) == 0 && (local56[local71][local93 + 1] & 0x48240000) == 0) {
				Static256.anIntArray386[local51] = local7 + 1;
				Static104.anIntArray408[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local87 + 1][local82 + 1] = 12;
				Static130.anIntArrayArray137[local87 + 1][local82 + 1] = local245;
			}
		}
		Static251.anInt4951 = local9;
		Static81.anInt1750 = local7;
		return false;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5919(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static90.anInt5360++;
		Static143.anInt2959 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static71.anInt1580; local7 < Static37.anInt696; local7++) {
			@Pc(12) Class8[][] local12 = Static275.aClass8ArrayArrayArray4[local7];
			for (local14 = Static30.anInt551; local14 < Static282.anInt5713; local14++) {
				for (@Pc(17) int local17 = Static156.anInt3176; local17 < Static301.anInt5009; local17++) {
					@Pc(24) Class8 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static207.aBooleanArrayArray25[local14 + Static206.anInt4000 - Static250.anInt4943][local17 + Static206.anInt4000 - Static230.anInt4394] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean22 = true;
							local24.aBoolean21 = true;
							if (local24.aClass172_1 == null) {
								local24.aBoolean23 = false;
							} else {
								local24.aBoolean23 = true;
							}
							Static143.anInt2959++;
						} else {
							local24.aBoolean22 = false;
							local24.aBoolean21 = false;
							local24.aByte8 = 0;
							if (local14 >= Static250.anInt4943 - 16 && local14 <= Static250.anInt4943 + 16 && local17 >= Static230.anInt4394 - 16 && local17 <= Static230.anInt4394 + 16 && (local24.aClass62_Sub4_2 != null || local24.aClass62_Sub4_1 != null || local24.aClass62_Sub5_2 != null || local24.aClass62_Sub5_1 != null || local24.aClass62_Sub3_1 != null || local24.aClass172_1 != null)) {
								Static42.aClass101_1.method3247(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static313.aClass73Array39 == Static301.aClass73Array31;
		for (local14 = Static71.anInt1580; local14 < Static37.anInt696; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static50.aClass4_5.method4297() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static207.aBooleanArrayArray25.length;
				if (Static30.anInt551 + Static207.aBooleanArrayArray25.length > Static223.anInt4280) {
					local172 -= Static30.anInt551 + Static207.aBooleanArrayArray25.length - Static223.anInt4280;
				}
				@Pc(192) int local192 = Static207.aBooleanArrayArray25[0].length;
				if (Static156.anInt3176 + Static207.aBooleanArrayArray25[0].length > Static160.anInt3244) {
					local192 -= Static156.anInt3176 + Static207.aBooleanArrayArray25[0].length - Static160.anInt3244;
				}
				@Pc(213) int local213 = Static320.anInt6197;
				while (true) {
					if (local213 >= local172) {
						Static42.aClass101_1.method3251(local14, true, local161, Static301.aClass73Array31[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static30.anInt551 - Static320.anInt6197;
					for (@Pc(222) int local222 = Static25.anInt1347; local222 < local192; local222++) {
						Static162.aBooleanArrayArray13[local213][local222] = false;
						if (Static207.aBooleanArrayArray25[local213][local222]) {
							@Pc(241) int local241 = local222 + Static156.anInt3176 - Static25.anInt1347;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static275.aClass8ArrayArrayArray4[local243][local220][local241] != null && Static275.aClass8ArrayArrayArray4[local243][local220][local241].aByte7 == local14) {
									Static162.aBooleanArrayArray13[local213][local222] = Static275.aClass8ArrayArrayArray4[local243][local220][local241].aBoolean22;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static42.aClass101_1.method3251(local14, false, local161, Static301.aClass73Array31[local14]);
			}
			Static42.aClass101_1.method3248();
		}
		if (!Static247.method4483(true)) {
			Static247.method4483(false);
		}
	}
}
