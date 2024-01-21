import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_22;

	@OriginalMember(owner = "client!r", name = "Sb", descriptor = "I")
	public static int anInt2254;

	@OriginalMember(owner = "client!r", name = "Jb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1095 = Static38.method736("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!r", name = "Wb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1098 = Static38.method736("K");

	@OriginalMember(owner = "client!r", name = "Mb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1096 = aClass71_1098;

	@OriginalMember(owner = "client!r", name = "Nb", descriptor = "I")
	public static volatile int anInt2251 = -1;

	@OriginalMember(owner = "client!r", name = "Ob", descriptor = "I")
	public static int anInt2252 = 0;

	@OriginalMember(owner = "client!r", name = "Qb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1097 = Static38.method736("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!r", name = "Rb", descriptor = "I")
	public static int anInt2253 = 1;

	@OriginalMember(owner = "client!r", name = "Yb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1099 = Static38.method736("::");

	@OriginalMember(owner = "client!r", name = "ac", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1100 = aClass71_1098;

	@OriginalMember(owner = "client!r", name = "bc", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1101 = Static38.method736("lila:");

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	public static void method1550() {
		if (Static53.aBooleanArray11[96]) {
			Static81.anInt1991 += (-Static81.anInt1991 - 24) / 2;
		} else if (Static53.aBooleanArray11[97]) {
			Static81.anInt1991 += (24 - Static81.anInt1991) / 2;
		} else {
			Static81.anInt1991 /= 2;
		}
		if (Static53.aBooleanArray11[98]) {
			Static71.anInt1738 += (12 - Static71.anInt1738) / 2;
		} else if (Static53.aBooleanArray11[99]) {
			Static71.anInt1738 += (-Static71.anInt1738 - 12) / 2;
		} else {
			Static71.anInt1738 /= 2;
		}
		Static88.anInt2060 = Static88.anInt2060 + Static81.anInt1991 / 2 & 0x7FF;
		Static41.anInt1067 += Static71.anInt1738 / 2;
		@Pc(91) int local91 = Static101.anInt2381 + Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474;
		if (Static41.anInt1067 < 128) {
			Static41.anInt1067 = 128;
		}
		@Pc(101) int local101 = Static110.anInt2628 + Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452;
		if (Static89.anInt2077 - local91 < -500 || Static89.anInt2077 - local91 > 500 || Static20.anInt676 - local101 < -500 || Static20.anInt676 - local101 > 500) {
			Static20.anInt676 = local101;
			Static89.anInt2077 = local91;
		}
		if (Static41.anInt1067 > 383) {
			Static41.anInt1067 = 383;
		}
		if (local91 != Static89.anInt2077) {
			Static89.anInt2077 += (local91 - Static89.anInt2077) / 16;
		}
		if (local101 != Static20.anInt676) {
			Static20.anInt676 += (local101 - Static20.anInt676) / 16;
		}
		@Pc(166) int local166 = Static20.anInt676 >> 7;
		@Pc(174) int local174 = Static89.anInt2077 >> 7;
		@Pc(180) int local180 = Static26.method989(Static89.anInt2077, Static23.anInt728, Static20.anInt676);
		@Pc(182) int local182 = 0;
		@Pc(202) int local202;
		if (local174 > 3 && local166 > 3 && local174 < 100 && local166 < 100) {
			for (local202 = local174 - 4; local202 <= local174 + 4; local202++) {
				for (@Pc(208) int local208 = local166 - 4; local208 <= local166 + 4; local208++) {
					@Pc(212) int local212 = Static23.anInt728;
					if (local212 < 3 && (Static59.aByteArrayArrayArray2[1][local202][local208] & 0x2) == 2) {
						local212++;
					}
					@Pc(240) int local240 = local180 - Static51.anIntArrayArrayArray3[local212][local202][local208];
					if (local182 < local240) {
						local182 = local240;
					}
				}
			}
		}
		local202 = local182 * 192;
		if (local202 > 98048) {
			local202 = 98048;
		}
		if (local202 < 32768) {
			local202 = 32768;
		}
		if (Static66.anInt1646 < local202) {
			Static66.anInt1646 += (local202 - Static66.anInt1646) / 24;
		} else if (local202 < Static66.anInt1646) {
			Static66.anInt1646 += (local202 - Static66.anInt1646) / 80;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(III)V")
	public static void method1552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
			if (Static31.aClass71Array9[local17] != null) {
				@Pc(27) int local27 = Static31.anIntArray104[local17];
				@Pc(37) int local37 = Static34.anInt970 + 70 + 4 - local7 * 14;
				if (local37 < -20) {
					break;
				}
				if (local27 == 0) {
					local7++;
				}
				@Pc(50) Class71 local50 = Static9.aClass71Array3[local17];
				if (local50 != null && local50.method1801(Static49.aClass71_712)) {
					local50 = local50.method1822(5);
				}
				if (local50 != null && local50.method1801(Static71.aClass71_861)) {
					local50 = local50.method1822(5);
				}
				if ((local27 == 1 || local27 == 2) && (local27 == 1 || Static16.anInt518 == 0 || Static16.anInt518 == 1 && Static14.method409(local50))) {
					if (arg0 > local37 - 14 && arg0 <= local37 && !local50.method1813(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass71_1236)) {
						if (Static9.anInt302 >= 1) {
							Static60.method1040(27, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static39.aClass71_582);
						}
						Static60.method1040(16, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static30.aClass71_462);
						Static60.method1040(36, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static97.aClass71_1145);
					}
					local7++;
				}
				if ((local27 == 3 || local27 == 7) && Static5.anInt204 == 0 && (local27 == 7 || Static60.anInt1551 == 0 || Static60.anInt1551 == 1 && Static14.method409(local50))) {
					local7++;
					if (arg0 > local37 - 14 && arg0 <= local37) {
						if (Static9.anInt302 >= 1) {
							Static60.method1040(27, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static39.aClass71_582);
						}
						Static60.method1040(16, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static30.aClass71_462);
						Static60.method1040(36, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static97.aClass71_1145);
					}
				}
				if (local27 == 4 && (anInt2252 == 0 || anInt2252 == 1 && Static14.method409(local50))) {
					if (arg0 > local37 - 14 && arg0 <= local37) {
						Static60.method1040(37, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static19.aClass71_361);
					}
					local7++;
				}
				if ((local27 == 5 || local27 == 6) && Static5.anInt204 == 0 && Static60.anInt1551 < 2) {
					local7++;
				}
				if (local27 == 8 && (anInt2252 == 0 || anInt2252 == 1 && Static14.method409(local50))) {
					if (arg0 > local37 - 14 && local37 >= arg0) {
						Static60.method1040(28, Static74.method677(new Class71[] { Static68.aClass71_824, local50 }), 0, 0, 0, Static101.aClass71_1182);
					}
					local7++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "s", descriptor = "(I)V")
	public static void method1557() {
		aClass71_1100 = null;
		aClass71_1096 = null;
		aClass71_1098 = null;
		aClass71_1095 = null;
		aClass5_Sub1_Sub10_Sub1_22 = null;
		aClass71_1097 = null;
		aClass71_1099 = null;
		aClass71_1101 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1558(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static35.method714(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static42.aClass29_4.anApplet1 != null) {
				@Pc(109) Class70 local109 = Static42.aClass29_4.method777(new URL(Static42.aClass29_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static39.anInt1027 + "&u=" + Static57.aLong54 + "&v1=" + Static43.aString2 + "&v2=" + Static43.aString1 + "&e=" + local7));
				while (local109.anInt2692 == 0) {
					Static23.method546(1L);
				}
				if (local109.anInt2692 == 1) {
					@Pc(128) DataInputStream local128 = (DataInputStream) local109.anObject3;
					local128.read();
					local128.close();
				}
			}
		} catch (@Pc(135) Exception local135) {
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I")
	public static int method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) ((arg1 << 16) + arg0);
		return Static5.aClass5_Sub1_Sub6_1 != null && local6 == Static5.aClass5_Sub1_Sub6_1.aLong118 ? Static20.aClass5_Sub11_2.anInt2233 * 99 / (Static20.aClass5_Sub11_2.aByteArray23.length - Static5.aClass5_Sub1_Sub6_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB[Lclient!ic;I[BI)V")
	public static void method1560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (local11 + arg3 > 0 && local11 + arg3 < 103 && arg0 + local15 > 0 && local15 + arg0 < 103) {
						arg2[local7].anIntArrayArray14[arg3 + local11][arg0 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(91) Class5_Sub11 local91 = new Class5_Sub11(arg4);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
					Static70.method1175(arg0 + local105, arg3 + local101, arg1, local91, local15, 0, arg5);
				}
			}
		}
	}
}
