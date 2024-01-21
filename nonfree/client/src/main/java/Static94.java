import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!jb;")
	public static Class34 aClass34_31;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "Lclient!m;")
	public static Class41 aClass41_4;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public static int anInt2490 = 10;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "[B")
	public static byte[] aByteArray23 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!v;")
	public static Class62 aClass62_1138 = Static45.method753("Lade Konfig )2 ");

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Lclient!v;")
	private static Class62 aClass62_1140 = Static45.method753("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_1139 = aClass62_1140;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	public static int anInt2496 = -1;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!v;")
	public static Class62 aClass62_1141 = Static45.method753("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V")
	public static void method1591(@OriginalArg(1) boolean arg0) {
		Static35.aBoolean63 = arg0;
		@Pc(20) int local20;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(40) int local40;
		@Pc(135) int local135;
		@Pc(139) int local139;
		@Pc(162) int local162;
		@Pc(166) int local166;
		@Pc(170) int local170;
		if (!Static35.aBoolean63) {
			local20 = (Static63.anInt2386 - Static10.aClass3_Sub8_Sub1_5.anInt2704) / 16;
			Static85.anIntArrayArray23 = new int[local20][4];
			for (local25 = 0; local25 < local20; local25++) {
				for (local29 = 0; local29 < 4; local29++) {
					Static85.anIntArrayArray23[local25][local29] = Static10.aClass3_Sub8_Sub1_5.method1768();
				}
			}
			local29 = Static10.aClass3_Sub8_Sub1_5.method1789();
			@Pc(371) boolean local371 = false;
			local33 = Static10.aClass3_Sub8_Sub1_5.method1785();
			local40 = Static10.aClass3_Sub8_Sub1_5.method1813();
			local135 = Static10.aClass3_Sub8_Sub1_5.method1791();
			local139 = Static10.aClass3_Sub8_Sub1_5.method1785();
			Static106.anIntArray312 = new int[local20];
			Static26.aByteArrayArray2 = new byte[local20][];
			Static18.anIntArray53 = new int[local20];
			Static29.aByteArrayArray3 = new byte[local20][];
			Static41.anIntArray84 = new int[local20];
			local20 = 0;
			if ((local135 / 8 == 48 || local135 / 8 == 49) && local29 / 8 == 48) {
				local371 = true;
			}
			if (local135 / 8 == 48 && local29 / 8 == 148) {
				local371 = true;
			}
			for (local162 = (local135 - 6) / 8; local162 <= (local135 + 6) / 8; local162++) {
				for (local166 = (local29 - 6) / 8; local166 <= (local29 + 6) / 8; local166++) {
					local170 = (local162 << 8) + local166;
					if (!local371 || local166 != 49 && local166 != 149 && local166 != 147 && local162 != 50 && (local162 != 49 || local166 != 47)) {
						Static18.anIntArray53[local20] = local170;
						Static41.anIntArray84[local20] = Static49.aClass42_Sub1_28.method1521(Static49.method782(new Class62[] { Static14.aClass62_214, Static99.method1662(local162), Static36.aClass62_474, Static99.method1662(local166) }));
						Static106.anIntArray312[local20] = Static49.aClass42_Sub1_28.method1521(Static49.method782(new Class62[] { Static9.aClass62_812, Static99.method1662(local162), Static36.aClass62_474, Static99.method1662(local166) }));
						local20++;
					}
				}
			}
			Static28.method578(local40, local135, local33, local29, local139);
			return;
		}
		local20 = Static10.aClass3_Sub8_Sub1_5.method1789();
		Static10.aClass3_Sub8_Sub1_5.method1816();
		for (local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < 13; local29++) {
				for (local33 = 0; local33 < 13; local33++) {
					local40 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
					if (local40 == 1) {
						Static102.anIntArrayArrayArray7[local25][local29][local33] = Static10.aClass3_Sub8_Sub1_5.method1822(26);
					} else {
						Static102.anIntArrayArrayArray7[local25][local29][local33] = -1;
					}
				}
			}
		}
		Static10.aClass3_Sub8_Sub1_5.method1823();
		local29 = (Static63.anInt2386 - Static10.aClass3_Sub8_Sub1_5.anInt2704) / 16;
		Static85.anIntArrayArray23 = new int[local29][4];
		for (local33 = 0; local33 < local29; local33++) {
			for (local40 = 0; local40 < 4; local40++) {
				Static85.anIntArrayArray23[local33][local40] = Static10.aClass3_Sub8_Sub1_5.method1768();
			}
		}
		local40 = Static10.aClass3_Sub8_Sub1_5.method1777();
		local135 = Static10.aClass3_Sub8_Sub1_5.method1789();
		local139 = Static10.aClass3_Sub8_Sub1_5.method1791();
		@Pc(143) int local143 = Static10.aClass3_Sub8_Sub1_5.method1791();
		Static106.anIntArray312 = new int[local29];
		Static41.anIntArray84 = new int[local29];
		Static18.anIntArray53 = new int[local29];
		Static26.aByteArrayArray2 = new byte[local29][];
		Static29.aByteArrayArray3 = new byte[local29][];
		local29 = 0;
		for (local162 = 0; local162 < 4; local162++) {
			for (local166 = 0; local166 < 13; local166++) {
				for (local170 = 0; local170 < 13; local170++) {
					@Pc(180) int local180 = Static102.anIntArrayArrayArray7[local162][local166][local170];
					if (local180 != -1) {
						@Pc(189) int local189 = local180 >> 14 & 0x3FF;
						@Pc(195) int local195 = local180 >> 3 & 0x7FF;
						@Pc(205) int local205 = (local189 / 8 << 8) + local195 / 8;
						for (@Pc(207) int local207 = 0; local207 < local29; local207++) {
							if (local205 == Static18.anIntArray53[local207]) {
								local205 = -1;
								break;
							}
						}
						if (local205 != -1) {
							@Pc(236) int local236 = local205 >> 8 & 0xFF;
							Static18.anIntArray53[local29] = local205;
							@Pc(244) int local244 = local205 & 0xFF;
							Static41.anIntArray84[local29] = Static49.aClass42_Sub1_28.method1521(Static49.method782(new Class62[] { Static14.aClass62_214, Static99.method1662(local236), Static36.aClass62_474, Static99.method1662(local244) }));
							Static106.anIntArray312[local29] = Static49.aClass42_Sub1_28.method1521(Static49.method782(new Class62[] { Static9.aClass62_812, Static99.method1662(local236), Static36.aClass62_474, Static99.method1662(local244) }));
							local29++;
						}
					}
				}
			}
		}
		Static28.method578(local40, local143, local139, local20, local135);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
	public static int method1592(@OriginalArg(1) KeyEvent arg0) {
		@Pc(13) int local13 = arg0.getKeyChar();
		if (local13 <= 0 || local13 >= 256) {
			local13 = -1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method1593() {
		aClass62_1141 = null;
		aClass62_1140 = null;
		aClass41_4 = null;
		aClass34_31 = null;
		aClass62_1138 = null;
		aClass62_1139 = null;
		aByteArray23 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1594(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static12.aClass29_1);
		arg0.removeFocusListener(Static12.aClass29_1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void method1595() {
		Static10.aClass3_Sub8_Sub1_5.method1816();
		@Pc(12) int local12 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
		if (local12 == 0) {
			return;
		}
		@Pc(24) int local24 = Static10.aClass3_Sub8_Sub1_5.method1822(2);
		if (local24 == 0) {
			Static98.anIntArray283[Static90.anInt2427++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local24 == 1) {
			local43 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
			Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1154(local43, false);
			local53 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
			if (local53 == 1) {
				Static98.anIntArray283[Static90.anInt2427++] = 2047;
			}
			return;
		}
		@Pc(95) int local95;
		if (local24 == 2) {
			local43 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
			Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1154(local43, true);
			local53 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
			Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1154(local53, true);
			local95 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
			if (local95 == 1) {
				Static98.anIntArray283[Static90.anInt2427++] = 2047;
			}
		} else if (local24 == 3) {
			local43 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
			local53 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
			if (local53 == 1) {
				Static98.anIntArray283[Static90.anInt2427++] = 2047;
			}
			Static27.anInt818 = Static10.aClass3_Sub8_Sub1_5.method1822(2);
			local95 = Static10.aClass3_Sub8_Sub1_5.method1822(7);
			@Pc(150) int local150 = Static10.aClass3_Sub8_Sub1_5.method1822(7);
			Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1150(local95, local150, local43 == 1);
		}
	}
}
