import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "[I")
	public static int[] anIntArray260;

	@OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
	public static int anInt1989;

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "Lclient!qd;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "I")
	public static int anInt1994;

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "[I")
	public static int[] anIntArray261 = new int[25];

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1116 = Static75.method1216(")1");

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1117 = Static75.method1216("p11_full");

	@OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
	public static int anInt1990 = 1;

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1118 = Static75.method1216("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
	public static int anInt1991 = 0;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "I")
	public static int anInt1992 = 0;

	@OriginalMember(owner = "client!qb", name = "sb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1119 = Static75.method1216("Ausw-=hlen");

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1120 = Static75.method1216("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!qb", name = "ub", descriptor = "I")
	public static int anInt1995 = 0;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public static void method1365() {
		@Pc(7) Class4 local7 = null;
		for (@Pc(14) int local14 = 0; local14 < Static4.anInt204; local14++) {
			if (Static104.aClass4Array20[local14].method117(Static101.aClass4_1391) != -1) {
				local7 = Static104.aClass4Array20[local14].method137(Static104.aClass4Array20[local14].method117(Static101.aClass4_1391));
				break;
			}
		}
		if (local7 == null) {
			Static104.method1698();
			return;
		}
		@Pc(52) int local52 = Static39.anInt1072;
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(58) int local58 = Static75.anInt1788;
		@Pc(60) int local60 = Static9.anInt315;
		@Pc(62) int local62 = anInt1989;
		if (local62 > 190) {
			local62 = 190;
		}
		Static50.method1840(local52, local58, local62, local60, 6116423);
		Static50.method1840(local52 + 1, local58 + 1, local62 - 2, 16, 0);
		Static50.method1849(local52 + 1, local58 + 18, local62 - 2, local60 + -19, 0);
		Static113.aClass3_Sub1_Sub4_Sub4_3.method1868(local7, local52 + 3, local58 + 14, 6116423, false);
		@Pc(114) int local114 = Static22.anInt496;
		@Pc(116) int local116 = Static78.anInt420;
		if (Static76.anInt1815 == 0) {
			local114 -= 4;
			local116 -= 4;
		}
		if (Static76.anInt1815 == 1) {
			local116 -= 205;
			local114 -= 553;
		}
		if (Static76.anInt1815 == 2) {
			local114 -= 17;
			local116 -= 357;
		}
		for (@Pc(137) int local137 = 0; local137 < Static4.anInt204; local137++) {
			@Pc(141) int local141 = 16777215;
			@Pc(145) Class4 local145 = Static104.aClass4Array20[local137];
			@Pc(158) int local158 = local58 + (Static4.anInt204 - local137 - 1) * 15 + 31;
			if (local145.method141(local7)) {
				local145 = local145.method136(0, local145.method118() - local7.method118());
				if (local145.method141(Static4.aClass4_109)) {
					local145 = local145.method136(0, local145.method118() - Static4.aClass4_109.method118());
				}
			}
			if (local52 < local114 && local114 < local52 + local62 && local116 > local158 - 13 && local116 < local158 + 3) {
				local141 = 16776960;
			}
			Static113.aClass3_Sub1_Sub4_Sub4_3.method1868(local145, local52 + 3, local158, local141, true);
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public static void method1366() {
		aClass4_1116 = null;
		anIntArray260 = null;
		anIntArray261 = null;
		aClass4_1120 = null;
		aClass4_1117 = null;
		aClass4_1119 = null;
		aClass22_1 = null;
		aClass4_1118 = null;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	public static void method1367() {
		@Pc(10) int local10 = Static19.anInt477 + Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342;
		@Pc(15) int local15 = Static17.anInt378 + Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348;
		if (Static92.anInt2091 - local10 < -500 || Static92.anInt2091 - local10 > 500 || Static76.anInt1817 - local15 < -500 || Static76.anInt1817 - local15 > 500) {
			Static92.anInt2091 = local10;
			Static76.anInt1817 = local15;
		}
		if (Static92.anInt2091 != local10) {
			Static92.anInt2091 += (local10 - Static92.anInt2091) / 16;
		}
		if (Static76.anInt1817 != local15) {
			Static76.anInt1817 += (local15 - Static76.anInt1817) / 16;
		}
		if (Static39.aBooleanArray8[96]) {
			Static3.anInt2308 += (-Static3.anInt2308 - 24) / 2;
		} else if (Static39.aBooleanArray8[97]) {
			Static3.anInt2308 += (24 - Static3.anInt2308) / 2;
		} else {
			Static3.anInt2308 /= 2;
		}
		if (Static39.aBooleanArray8[98]) {
			Static15.anInt362 += (12 - Static15.anInt362) / 2;
		} else if (Static39.aBooleanArray8[99]) {
			Static15.anInt362 += (-Static15.anInt362 - 12) / 2;
		} else {
			Static15.anInt362 /= 2;
		}
		@Pc(152) int local152 = Static92.anInt2091 >> 7;
		@Pc(156) int local156 = Static76.anInt1817 >> 7;
		Static60.anInt1493 += Static15.anInt362 / 2;
		if (Static60.anInt1493 < 128) {
			Static60.anInt1493 = 128;
		}
		if (Static60.anInt1493 > 383) {
			Static60.anInt1493 = 383;
		}
		@Pc(174) int local174 = 0;
		Static109.anInt2749 = Static109.anInt2749 + Static3.anInt2308 / 2 & 0x7FF;
		@Pc(189) int local189 = Static82.method1293(Static92.anInt2091, Static49.anInt1203, Static76.anInt1817);
		@Pc(209) int local209;
		if (local152 > 3 && local156 > 3 && local152 < 100 && local156 < 100) {
			for (local209 = local152 - 4; local209 <= local152 + 4; local209++) {
				for (@Pc(215) int local215 = local156 - 4; local215 <= local156 + 4; local215++) {
					@Pc(219) int local219 = Static49.anInt1203;
					if (local219 < 3 && (Static11.aByteArrayArrayArray55[1][local209][local215] & 0x2) == 2) {
						local219++;
					}
					@Pc(245) int local245 = local189 - Static38.anIntArrayArrayArray36[local219][local209][local215];
					if (local174 < local245) {
						local174 = local245;
					}
				}
			}
		}
		local209 = local174 * 192;
		if (local209 > 98048) {
			local209 = 98048;
		}
		if (local209 < 32768) {
			local209 = 32768;
		}
		if (Static103.anInt2540 < local209) {
			Static103.anInt2540 += (local209 - Static103.anInt2540) / 24;
		} else if (Static103.anInt2540 > local209) {
			Static103.anInt2540 += (local209 - Static103.anInt2540) / 80;
			return;
		}
	}
}
