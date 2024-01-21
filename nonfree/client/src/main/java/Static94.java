import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "Lclient!ca;")
	public static Class10 aClass10_4;

	@OriginalMember(owner = "client!ta", name = "Cb", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_19;

	@OriginalMember(owner = "client!ta", name = "Db", descriptor = "Lclient!pa;")
	public static Class51 aClass51_51;

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1129 = Static2.method66("Cancel");

	@OriginalMember(owner = "client!ta", name = "hb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1130 = Static2.method66("Loading sprites )2 ");

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1131 = Static2.method66("Offline");

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1132 = Static2.method66("Mio");

	@OriginalMember(owner = "client!ta", name = "tb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1134 = Static2.method66("No response from server)3");

	@OriginalMember(owner = "client!ta", name = "nb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1133 = aClass39_1134;

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "I")
	public static int anInt2478 = 0;

	@OriginalMember(owner = "client!ta", name = "qb", descriptor = "I")
	public static int anInt2479 = 0;

	@OriginalMember(owner = "client!ta", name = "zb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1135 = Static2.method66(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!ta", name = "Gb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1136 = aClass39_1130;

	@OriginalMember(owner = "client!ta", name = "Hb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1137 = aClass39_1129;

	@OriginalMember(owner = "client!ta", name = "Ib", descriptor = "I")
	public static int anInt2489 = 0;

	@OriginalMember(owner = "client!ta", name = "Kb", descriptor = "[Lclient!g;")
	public static Class2_Sub5[] aClass2_Sub5Array1 = new Class2_Sub5[2048];

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method1784() {
		@Pc(5) Class29 local5 = Static105.aClass29_1;
		synchronized (Static105.aClass29_1) {
			Static7.anInt163 = Static44.anInt1232;
			Static80.anInt2188 = Static9.anInt198;
			Static45.anInt1237 = Static45.anInt1240;
			Static39.anInt1172 = Static44.anInt1230;
			Static2.anInt91 = Static55.anInt1561;
			Static93.anInt2442 = Static7.anInt143;
			Static49.aLong36 = Static102.aLong79;
			Static44.anInt1230 = 0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)V")
	public static void method1788() {
		@Pc(9) int local9 = Static25.aClass2_Sub1_Sub4_Sub1_1.method241(Static68.aClass39_888);
		@Pc(24) int local24;
		for (@Pc(16) int local16 = 0; local16 < Static101.anInt2753; local16++) {
			local24 = Static25.aClass2_Sub1_Sub4_Sub1_1.method249(Static26.aClass39Array7[local16]);
			if (local9 < local24) {
				local9 = local24;
			}
		}
		local9 += 8;
		local24 = Static101.anInt2753 * 15 + 21;
		@Pc(81) int local81;
		@Pc(85) int local85;
		if (Static2.anInt91 > 4 && Static93.anInt2442 > 4 && Static2.anInt91 < 516 && Static93.anInt2442 < 338) {
			Static7.anInt162 = 0;
			Static19.anInt568 = local9;
			Static92.anInt2405 = Static101.anInt2753 * 15 + 22;
			local81 = Static2.anInt91 - local9 / 2 - 4;
			local85 = Static93.anInt2442 - 4;
			if (local85 + local24 > 334) {
				local85 = 334 - local24;
			}
			if (local9 + local81 > 512) {
				local81 = 512 - local9;
			}
			if (local81 < 0) {
				local81 = 0;
			}
			Static22.aBoolean36 = true;
			if (local85 < 0) {
				local85 = 0;
			}
			Static46.anInt1260 = local81;
			Static82.anInt2219 = local85;
		}
		if (Static2.anInt91 > 553 && Static93.anInt2442 > 205 && Static2.anInt91 < 743 && Static93.anInt2442 < 466) {
			Static19.anInt568 = local9;
			Static7.anInt162 = 1;
			Static92.anInt2405 = Static101.anInt2753 * 15 + 22;
			Static22.aBoolean36 = true;
			local81 = Static2.anInt91 - local9 / 2 - 553;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 + local9 > 190) {
				local81 = 190 - local9;
			}
			Static46.anInt1260 = local81;
			local85 = Static93.anInt2442 - 205;
			if (local85 < 0) {
				local85 = 0;
			} else if (local24 + local85 > 261) {
				local85 = 261 - local24;
			}
			Static82.anInt2219 = local85;
		}
		if (Static2.anInt91 <= 17 || Static93.anInt2442 <= 357 || Static2.anInt91 >= 496 || Static93.anInt2442 >= 453) {
			return;
		}
		Static7.anInt162 = 2;
		Static22.aBoolean36 = true;
		Static19.anInt568 = local9;
		Static92.anInt2405 = Static101.anInt2753 * 15 + 22;
		local85 = Static93.anInt2442 - 357;
		if (local85 < 0) {
			local85 = 0;
		} else if (local85 + local24 > 96) {
			local85 = 96 - local24;
		}
		local81 = Static2.anInt91 - local9 / 2 - 17;
		Static82.anInt2219 = local85;
		if (local81 < 0) {
			local81 = 0;
		} else if (local81 + local9 > 479) {
			local81 = 479 - local9;
		}
		Static46.anInt1260 = local81;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(B)V")
	public static void method1790() {
		for (@Pc(1) int local1 = 0; local1 < Static60.anInt1626; local1++) {
			@Pc(6) int local6 = Static39.anIntArray167[local1];
			@Pc(10) Class2_Sub1_Sub2_Sub3_Sub1 local10 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local6];
			@Pc(14) int local14 = Static51.aClass2_Sub5_Sub1_4.method1281();
			if ((local14 & 0x1) != 0) {
				local14 += Static51.aClass2_Sub5_Sub1_4.method1281() << 8;
			}
			Static58.method1161(local6, local14, local10);
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	public static void method1791() {
		aClass2_Sub5Array1 = null;
		aClass2_Sub1_Sub4_Sub3_19 = null;
		aClass39_1137 = null;
		aClass39_1131 = null;
		aClass39_1130 = null;
		aClass51_51 = null;
		aClass39_1129 = null;
		aClass10_4 = null;
		aClass39_1135 = null;
		aClass39_1132 = null;
		aClass39_1134 = null;
		aClass39_1136 = null;
		aClass39_1133 = null;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(II)I")
	public static int method1793(@OriginalArg(1) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)I")
	public static int method1794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return arg2 / 2 + (arg1 / 32 << 7) + (arg0 / 4 << 10);
	}
}
