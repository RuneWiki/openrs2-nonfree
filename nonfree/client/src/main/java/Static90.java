import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!jd;")
	public static Class84 aClass84_39;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString100 = "Allocated memory";

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt2002 = 0;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method1691() {
		while (true) {
			if (Static250.aClass2_Sub26_Sub1_2.method4281(Static4.anInt151) >= 11) {
				@Pc(18) int local18 = Static250.aClass2_Sub26_Sub1_2.method4278(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static212.aClass36_Sub3_Sub2Array1[local18] == null) {
						local25 = true;
						Static212.aClass36_Sub3_Sub2Array1[local18] = new Class36_Sub3_Sub2();
						if (Static294.aClass2_Sub26Array1[local18] != null) {
							Static212.aClass36_Sub3_Sub2Array1[local18].method4109(Static294.aClass2_Sub26Array1[local18]);
						}
					}
					Static33.anIntArray50[Static68.anInt1507++] = local18;
					@Pc(64) Class36_Sub3_Sub2 local64 = Static212.aClass36_Sub3_Sub2Array1[local18];
					local64.anInt5091 = Static148.anInt3168;
					@Pc(72) int local72 = Static250.aClass2_Sub26_Sub1_2.method4278(5);
					if (local72 > 15) {
						local72 -= 32;
					}
					@Pc(82) int local82 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
					if (local82 == 1) {
						Static161.anIntArray256[Static102.anInt2234++] = local18;
					}
					@Pc(99) int local99 = Static250.aClass2_Sub26_Sub1_2.method4278(5);
					if (local99 > 15) {
						local99 -= 32;
					}
					@Pc(110) int local110 = Static134.anIntArray204[Static250.aClass2_Sub26_Sub1_2.method4278(3)];
					if (local25) {
						local64.anInt5063 = local64.anInt5069 = local110;
					}
					@Pc(124) int local124 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
					local64.method4112(local124 == 1, local99 + Static111.aClass36_Sub3_Sub2_1.anIntArray468[0], local72 + Static111.aClass36_Sub3_Sub2_1.anIntArray465[0]);
					continue;
				}
			}
			Static250.aClass2_Sub26_Sub1_2.method4279();
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lclient!mn;")
	public static Class115 method1692(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xFFFF;
		@Pc(19) int local19 = arg0 >> 16;
		if (Static219.aClass115ArrayArray1[local19] == null || Static219.aClass115ArrayArray1[local19][local15] == null) {
			@Pc(35) boolean local35 = Static249.method3997(local19);
			if (!local35) {
				return null;
			}
		}
		return Static219.aClass115ArrayArray1[local19][local15];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method1693(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(25) char local25 = arg0.charAt(local13);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				local11[local13] = (byte) local25;
			} else if (local25 == '€') {
				local11[local13] = -128;
			} else if (local25 == '‚') {
				local11[local13] = -126;
			} else if (local25 == 'ƒ') {
				local11[local13] = -125;
			} else if (local25 == '„') {
				local11[local13] = -124;
			} else if (local25 == '…') {
				local11[local13] = -123;
			} else if (local25 == '†') {
				local11[local13] = -122;
			} else if (local25 == '‡') {
				local11[local13] = -121;
			} else if (local25 == 'ˆ') {
				local11[local13] = -120;
			} else if (local25 == '‰') {
				local11[local13] = -119;
			} else if (local25 == 'Š') {
				local11[local13] = -118;
			} else if (local25 == '‹') {
				local11[local13] = -117;
			} else if (local25 == 'Œ') {
				local11[local13] = -116;
			} else if (local25 == 'Ž') {
				local11[local13] = -114;
			} else if (local25 == '‘') {
				local11[local13] = -111;
			} else if (local25 == '’') {
				local11[local13] = -110;
			} else if (local25 == '“') {
				local11[local13] = -109;
			} else if (local25 == '”') {
				local11[local13] = -108;
			} else if (local25 == '•') {
				local11[local13] = -107;
			} else if (local25 == '–') {
				local11[local13] = -106;
			} else if (local25 == '—') {
				local11[local13] = -105;
			} else if (local25 == '˜') {
				local11[local13] = -104;
			} else if (local25 == '™') {
				local11[local13] = -103;
			} else if (local25 == 'š') {
				local11[local13] = -102;
			} else if (local25 == '›') {
				local11[local13] = -101;
			} else if (local25 == 'œ') {
				local11[local13] = -100;
			} else if (local25 == 'ž') {
				local11[local13] = -98;
			} else if (local25 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIBI)V")
	public static void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg1 + 1;
		Static133.method2321(arg0, arg3, Static274.anIntArrayArray50[arg1], arg4);
		@Pc(27) int local27 = arg2 - 1;
		Static133.method2321(arg0, arg3, Static274.anIntArrayArray50[arg2], arg4);
		for (@Pc(32) int local32 = local18; local32 <= local27; local32++) {
			@Pc(43) int[] local43 = Static274.anIntArrayArray50[local32];
			local43[arg3] = local43[arg0] = arg4;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	public static void method1695(@OriginalArg(0) int arg0) {
		if (Static131.anInt2692 == 0) {
			Static2.aClass2_Sub5_Sub3_4.method2761(arg0);
		} else {
			Static51.anInt1198 = arg0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)V")
	public static void method1696(@OriginalArg(0) boolean arg0) {
		Static136.aBoolean237 = arg0;
		@Pc(63) boolean local63;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(36) int local36;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(162) int local162;
		@Pc(179) int local179;
		@Pc(196) int local196;
		if (!Static136.aBoolean237) {
			local21 = (Static4.anInt151 - Static250.aClass2_Sub26_Sub1_2.anInt5328) / 16;
			Static181.anIntArrayArray33 = new int[local21][4];
			for (local27 = 0; local27 < local21; local27++) {
				for (local36 = 0; local36 < 4; local36++) {
					Static181.anIntArrayArray33[local27][local36] = Static250.aClass2_Sub26_Sub1_2.method4214();
				}
			}
			local63 = Static38.method732(Static250.aClass2_Sub26_Sub1_2.method4233());
			@Pc(65) boolean local65 = false;
			local27 = Static250.aClass2_Sub26_Sub1_2.method4247();
			local36 = Static250.aClass2_Sub26_Sub1_2.method4215();
			local79 = Static250.aClass2_Sub26_Sub1_2.method4242();
			local83 = Static250.aClass2_Sub26_Sub1_2.method4257();
			local87 = Static250.aClass2_Sub26_Sub1_2.method4215();
			Static43.aByteArrayArray23 = new byte[local21][];
			Static47.anIntArray91 = new int[local21];
			Static18.aByteArrayArray13 = null;
			Static75.aByteArrayArray34 = new byte[local21][];
			anIntArray147 = new int[local21];
			if ((local79 / 8 == 48 || local79 / 8 == 49) && (local87 / 8) == 48) {
				local65 = true;
			}
			if (local79 / 8 == 48 && local87 / 8 == 148) {
				local65 = true;
			}
			Static67.anIntArray522 = null;
			Static275.aByteArrayArray117 = new byte[local21][];
			Static293.anIntArray520 = new int[local21];
			Static63.anIntArray105 = new int[local21];
			Static218.anIntArray377 = new int[local21];
			Static155.aByteArrayArray126 = new byte[local21][];
			local21 = 0;
			for (local162 = (local79 - 6) / 8; local162 <= (local79 + 6) / 8; local162++) {
				for (local179 = (local87 - 6) / 8; local179 <= (local87 + 6) / 8; local179++) {
					local196 = (local162 << 8) + local179;
					if (local65 && (local179 == 49 || local179 == 149 || local179 == 147 || local162 == 50 || local162 == 49 && local179 == 47)) {
						Static63.anIntArray105[local21] = local196;
						Static293.anIntArray520[local21] = -1;
						Static47.anIntArray91[local21] = -1;
						anIntArray147[local21] = -1;
						Static218.anIntArray377[local21] = -1;
					} else {
						Static63.anIntArray105[local21] = local196;
						Static293.anIntArray520[local21] = Static11.aClass84_8.method2121("m" + local162 + "_" + local179);
						Static47.anIntArray91[local21] = Static11.aClass84_8.method2121("l" + local162 + "_" + local179);
						anIntArray147[local21] = Static11.aClass84_8.method2121("um" + local162 + "_" + local179);
						Static218.anIntArray377[local21] = Static11.aClass84_8.method2121("ul" + local162 + "_" + local179);
					}
					local21++;
				}
			}
			Static87.method1633(false, local27, local87, local63, local36, local79, local83);
			return;
		}
		local63 = Static38.method732(Static250.aClass2_Sub26_Sub1_2.method4233());
		local21 = Static250.aClass2_Sub26_Sub1_2.method4236();
		local27 = Static250.aClass2_Sub26_Sub1_2.method4215();
		local36 = Static250.aClass2_Sub26_Sub1_2.method4261();
		Static250.aClass2_Sub26_Sub1_2.method4282();
		@Pc(385) int local385;
		for (local79 = 0; local79 < 4; local79++) {
			for (local83 = 0; local83 < 13; local83++) {
				for (local87 = 0; local87 < 13; local87++) {
					local385 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
					if (local385 == 1) {
						Static173.anIntArrayArrayArray8[local79][local83][local87] = Static250.aClass2_Sub26_Sub1_2.method4278(26);
					} else {
						Static173.anIntArrayArrayArray8[local79][local83][local87] = -1;
					}
				}
			}
		}
		Static250.aClass2_Sub26_Sub1_2.method4279();
		local79 = (Static4.anInt151 - Static250.aClass2_Sub26_Sub1_2.anInt5328) / 16;
		Static181.anIntArrayArray33 = new int[local79][4];
		for (local83 = 0; local83 < local79; local83++) {
			for (local87 = 0; local87 < 4; local87++) {
				Static181.anIntArrayArray33[local83][local87] = Static250.aClass2_Sub26_Sub1_2.method4228();
			}
		}
		local83 = Static250.aClass2_Sub26_Sub1_2.method4242();
		local87 = Static250.aClass2_Sub26_Sub1_2.method4236();
		Static47.anIntArray91 = new int[local79];
		Static275.aByteArrayArray117 = new byte[local79][];
		Static75.aByteArrayArray34 = new byte[local79][];
		Static18.aByteArrayArray13 = null;
		Static63.anIntArray105 = new int[local79];
		Static43.aByteArrayArray23 = new byte[local79][];
		anIntArray147 = new int[local79];
		Static67.anIntArray522 = null;
		Static155.aByteArrayArray126 = new byte[local79][];
		Static218.anIntArray377 = new int[local79];
		Static293.anIntArray520 = new int[local79];
		local79 = 0;
		for (local385 = 0; local385 < 4; local385++) {
			for (local162 = 0; local162 < 13; local162++) {
				for (local179 = 0; local179 < 13; local179++) {
					local196 = Static173.anIntArrayArrayArray8[local385][local162][local179];
					if (local196 != -1) {
						@Pc(539) int local539 = local196 >> 14 & 0x3FF;
						@Pc(545) int local545 = local196 >> 3 & 0x7FF;
						@Pc(555) int local555 = local545 / 8 + (local539 / 8 << 8);
						@Pc(557) int local557;
						for (local557 = 0; local557 < local79; local557++) {
							if (Static63.anIntArray105[local557] == local555) {
								local555 = -1;
								break;
							}
						}
						if (local555 != -1) {
							Static63.anIntArray105[local79] = local555;
							local557 = local555 >> 8 & 0xFF;
							@Pc(595) int local595 = local555 & 0xFF;
							Static293.anIntArray520[local79] = Static11.aClass84_8.method2121("m" + local557 + "_" + local595);
							Static47.anIntArray91[local79] = Static11.aClass84_8.method2121("l" + local557 + "_" + local595);
							anIntArray147[local79] = Static11.aClass84_8.method2121("um" + local557 + "_" + local595);
							Static218.anIntArray377[local79] = Static11.aClass84_8.method2121("ul" + local557 + "_" + local595);
							local79++;
						}
					}
				}
			}
		}
		Static87.method1633(false, local36, local87, local63, local27, local21, local83);
	}
}
