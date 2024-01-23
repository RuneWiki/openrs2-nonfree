import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public static int anInt1707;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!oc;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!rn;")
	public static Class155 aClass155_40;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!rn;")
	public static Class155 aClass155_41;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
	public static int anInt1708 = 0;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	public static int anInt1711 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method1385(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static44.aString32 = arg2;
		Static132.aString93 = arg0;
		Static120.anInt2263 = arg1;
		if (Static132.aString93.equals("") || Static44.aString32.equals("")) {
			Static98.anInt1803 = 3;
		} else if (Static203.anInt3980 == -1) {
			Static51.anInt988 = 0;
			Static301.anInt5946 = 0;
			Static98.anInt1803 = -3;
			Static304.anInt5996 = 1;
			@Pc(42) Class3_Sub26 local42 = new Class3_Sub26(128);
			local42.method3907(10);
			local42.method3944((int) (Math.random() * 9.9999999E7D));
			local42.method3913(Static42.method615(Static132.aString93));
			local42.method3944((int) (Math.random() * 9.9999999E7D));
			local42.method3914(Static44.aString32);
			local42.method3944((int) (Math.random() * 9.9999999E7D));
			local42.method3902(Static47.aBigInteger3, Static58.aBigInteger2);
			Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
			Static215.aClass3_Sub26_Sub1_2.method3907(24);
			Static215.aClass3_Sub26_Sub1_2.method3907(local42.anInt4615 + 2);
			Static215.aClass3_Sub26_Sub1_2.method3938(554);
			Static215.aClass3_Sub26_Sub1_2.method3945(local42.anInt4615, local42.aByteArray64);
		} else {
			Static83.method1272();
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public static void method1386() {
		Static217.aClass98_37.method2571();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!rn;ILclient!rn;Lclient!lc;)V")
	public static void method1387(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) Interface5 arg2) {
		Static25.aClass155_20 = arg1;
		Static69.aClass155_34 = arg0;
		Static286.anInterface5_2 = arg2;
		if (Static69.aClass155_34 != null) {
			Static156.anInt2937 = Static69.aClass155_34.method4131(1);
		}
		if (Static25.aClass155_20 != null) {
			Static105.anInt1942 = Static25.aClass155_20.method4131(1);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I")
	public static int method1388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = Static16.anIntArray25[Static119.method1972(arg2, arg0)];
		if (arg1 > 0) {
			@Pc(32) int local32 = Static16.anInterface4_1.method2898(arg1 & 0xFFFF);
			@Pc(40) int local40;
			@Pc(69) int local69;
			if (local32 != 0) {
				if (arg0 < 0) {
					local40 = 0;
				} else if (arg0 > 127) {
					local40 = 16777215;
				} else {
					local40 = arg0 * 131586;
				}
				if (local32 == 256) {
					local19 = local40;
				} else {
					local69 = 256 - local32;
					local19 = (local32 * (local40 & 0xFF00) + (local19 & 0xFF00) * local69 & 0xFF0000) + ((local40 & 0xFF00FF) * local32 + ((local19 & 0xFF00FF) * local69) & 0xFF00FF00) >> 8;
				}
			}
			local40 = Static16.anInterface4_1.method2908(arg1 & 0xFFFF);
			if (local40 != 0) {
				local40 += 256;
				@Pc(122) int local122 = (local19 >> 16 & 0xFF) * local40;
				if (local122 > 65535) {
					local122 = 65535;
				}
				local69 = local40 * (local19 >> 8 & 0xFF);
				@Pc(141) int local141 = local40 * (local19 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				if (local69 > 65535) {
					local69 = 65535;
				}
				local19 = (local141 >> 8) + (local69 & 0xFF00) + ((local122 & 0xFC00FF00) << 8);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public static void method1389() {
		Static157.aClass98_24.method2572();
		Static148.aClass98_20.method2572();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
	public static void method1390(@OriginalArg(0) boolean arg0) {
		Static45.aBoolean71 = arg0;
		@Pc(138) boolean local138;
		@Pc(19) int local19;
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(36) int local36;
		@Pc(46) int local46;
		@Pc(150) int local150;
		@Pc(193) int local193;
		@Pc(198) int local198;
		@Pc(211) int local211;
		if (!Static45.aBoolean71) {
			local19 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local24 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local29 = (Static287.anInt5742 - Static249.aClass3_Sub26_Sub1_3.anInt4615) / 16;
			Static114.anIntArrayArray81 = new int[local29][4];
			for (local36 = 0; local36 < local29; local36++) {
				for (local46 = 0; local46 < 4; local46++) {
					Static114.anIntArrayArray81[local36][local46] = Static249.aClass3_Sub26_Sub1_3.method3891();
				}
			}
			local36 = Static249.aClass3_Sub26_Sub1_3.method3909();
			@Pc(427) boolean local427 = false;
			if ((local19 / 8 == 48 || local19 / 8 == 49) && local36 / 8 == 48) {
				local427 = true;
			}
			if (local19 / 8 == 48 && local36 / 8 == 148) {
				local427 = true;
			}
			local138 = Static39.method562(Static249.aClass3_Sub26_Sub1_3.method3921());
			local46 = Static249.aClass3_Sub26_Sub1_3.method3908();
			local150 = Static249.aClass3_Sub26_Sub1_3.method3895();
			Static205.anIntArray449 = new int[local29];
			Static168.anIntArray368 = new int[local29];
			Static48.anIntArray84 = null;
			Static249.aByteArrayArray111 = new byte[local29][];
			Static50.aByteArrayArray22 = new byte[local29][];
			Static297.anIntArray220 = new int[local29];
			Static124.anIntArray283 = new int[local29];
			Static272.aByteArrayArray75 = null;
			Static44.aByteArrayArray18 = new byte[local29][];
			Static302.aByteArrayArray126 = new byte[local29][];
			Static199.anIntArray442 = new int[local29];
			local29 = 0;
			for (local193 = (local19 - 6) / 8; local193 <= (local19 + 6) / 8; local193++) {
				for (local198 = (local36 - 6) / 8; local198 <= (local36 + 6) / 8; local198++) {
					local211 = (local193 << 8) + local198;
					if (local427 && (local198 == 49 || local198 == 149 || local198 == 147 || local193 == 50 || local193 == 49 && local198 == 47)) {
						Static297.anIntArray220[local29] = local211;
						Static124.anIntArray283[local29] = -1;
						Static205.anIntArray449[local29] = -1;
						Static199.anIntArray442[local29] = -1;
						Static168.anIntArray368[local29] = -1;
					} else {
						Static297.anIntArray220[local29] = local211;
						Static124.anIntArray283[local29] = Static62.aClass155_30.method4120("m" + local193 + "_" + local198);
						Static205.anIntArray449[local29] = Static62.aClass155_30.method4120("l" + local193 + "_" + local198);
						Static199.anIntArray442[local29] = Static62.aClass155_30.method4120("um" + local193 + "_" + local198);
						Static168.anIntArray368[local29] = Static62.aClass155_30.method4120("ul" + local193 + "_" + local198);
					}
					local29++;
				}
			}
			Static278.method4201(local150, local24, local19, local36, false, local46, local138);
			return;
		}
		local19 = Static249.aClass3_Sub26_Sub1_3.method3941();
		Static249.aClass3_Sub26_Sub1_3.method3960();
		for (local24 = 0; local24 < 4; local24++) {
			for (local29 = 0; local29 < 13; local29++) {
				for (local36 = 0; local36 < 13; local36++) {
					local46 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
					if (local46 == 1) {
						Static120.anIntArrayArrayArray9[local24][local29][local36] = Static249.aClass3_Sub26_Sub1_3.method3962(26);
					} else {
						Static120.anIntArrayArrayArray9[local24][local29][local36] = -1;
					}
				}
			}
		}
		Static249.aClass3_Sub26_Sub1_3.method3961();
		local24 = (Static287.anInt5742 - Static249.aClass3_Sub26_Sub1_3.anInt4615) / 16;
		Static114.anIntArrayArray81 = new int[local24][4];
		for (local29 = 0; local29 < local24; local29++) {
			for (local36 = 0; local36 < 4; local36++) {
				Static114.anIntArrayArray81[local29][local36] = Static249.aClass3_Sub26_Sub1_3.method3896();
			}
		}
		local29 = Static249.aClass3_Sub26_Sub1_3.method3908();
		local138 = Static39.method562(Static249.aClass3_Sub26_Sub1_3.method3921());
		local36 = Static249.aClass3_Sub26_Sub1_3.method3908();
		local46 = Static249.aClass3_Sub26_Sub1_3.method3908();
		local150 = Static249.aClass3_Sub26_Sub1_3.method3948();
		Static272.aByteArrayArray75 = null;
		Static297.anIntArray220 = new int[local24];
		Static249.aByteArrayArray111 = new byte[local24][];
		Static124.anIntArray283 = new int[local24];
		Static205.anIntArray449 = new int[local24];
		Static44.aByteArrayArray18 = new byte[local24][];
		Static302.aByteArrayArray126 = new byte[local24][];
		Static50.aByteArrayArray22 = new byte[local24][];
		Static168.anIntArray368 = new int[local24];
		Static48.anIntArray84 = null;
		Static199.anIntArray442 = new int[local24];
		local24 = 0;
		for (@Pc(186) int local186 = 0; local186 < 4; local186++) {
			for (local193 = 0; local193 < 13; local193++) {
				for (local198 = 0; local198 < 13; local198++) {
					local211 = Static120.anIntArrayArrayArray9[local186][local193][local198];
					if (local211 != -1) {
						@Pc(221) int local221 = local211 >> 14 & 0x3FF;
						@Pc(227) int local227 = local211 >> 3 & 0x7FF;
						@Pc(237) int local237 = (local221 / 8 << 8) + local227 / 8;
						@Pc(239) int local239;
						for (local239 = 0; local239 < local24; local239++) {
							if (local237 == Static297.anIntArray220[local239]) {
								local237 = -1;
								break;
							}
						}
						if (local237 != -1) {
							Static297.anIntArray220[local24] = local237;
							local239 = local237 >> 8 & 0xFF;
							@Pc(276) int local276 = local237 & 0xFF;
							Static124.anIntArray283[local24] = Static62.aClass155_30.method4120("m" + local239 + "_" + local276);
							Static205.anIntArray449[local24] = Static62.aClass155_30.method4120("l" + local239 + "_" + local276);
							Static199.anIntArray442[local24] = Static62.aClass155_30.method4120("um" + local239 + "_" + local276);
							Static168.anIntArray368[local24] = Static62.aClass155_30.method4120("ul" + local239 + "_" + local276);
							local24++;
						}
					}
				}
			}
		}
		Static278.method4201(local150, local19, local29, local46, false, local36, local138);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public static void method1391() {
		Static175.aClass98_27.method2572();
		Static218.aClass98_38.method2572();
	}
}
