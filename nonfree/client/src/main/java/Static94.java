import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
	public static int anInt2475;

	@OriginalMember(owner = "client!sb", name = "sb", descriptor = "I")
	public static int anInt2478;

	@OriginalMember(owner = "client!sb", name = "ub", descriptor = "Lclient!ta;")
	public static Class14 aClass14_29;

	@OriginalMember(owner = "client!sb", name = "Fb", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1171 = Static14.method2017("null");

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1172 = Static14.method2017("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1173 = Static14.method2017("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1174 = Static14.method2017("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "J")
	public static volatile long aLong74 = 0L;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
	public static int anInt2471 = -1;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Z")
	public static boolean aBoolean110 = true;

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1175 = Static14.method2017("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1176 = aClass36_1175;

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1177 = Static14.method2017("Classic");

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1178 = Static14.method2017("Loaded input handler");

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1179 = Static14.method2017("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!sb", name = "rb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1180 = Static14.method2017("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
	public static int anInt2479 = 0;

	@OriginalMember(owner = "client!sb", name = "zb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1181 = Static14.method2017("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!sb", name = "Cb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1182 = aClass36_1178;

	@OriginalMember(owner = "client!sb", name = "Db", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1183 = Static14.method2017("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)I")
	public static int method1756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
	public static void method1757() {
		aClass36_1171 = null;
		aClass36_1172 = null;
		aClass36_1177 = null;
		aClass36_1181 = null;
		aClass36_1173 = null;
		aClass36_1180 = null;
		aClass36_1176 = null;
		aClass36_1183 = null;
		aClass14_29 = null;
		aClass36_1178 = null;
		aClass36_1174 = null;
		anIntArray310 = null;
		aClass36_1175 = null;
		aClass36_1182 = null;
		aClass36_1179 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
	public static void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = arg2; local7 <= arg1 + arg2; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg0 + arg3; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static35.aByteArrayArrayArray5[0][local11][local7] = 127;
					if (arg3 == local11 && local11 > 0) {
						Static27.anIntArrayArrayArray4[0][local11][local7] = Static27.anIntArrayArrayArray4[0][local11 - 1][local7];
					}
					if (arg3 + arg0 == local11 && local11 < 103) {
						Static27.anIntArrayArrayArray4[0][local11][local7] = Static27.anIntArrayArrayArray4[0][local11 + 1][local7];
					}
					if (arg2 == local7 && local7 > 0) {
						Static27.anIntArrayArrayArray4[0][local11][local7] = Static27.anIntArrayArrayArray4[0][local11][local7 - 1];
					}
					if (arg2 + arg1 == local7 && local7 < 103) {
						Static27.anIntArrayArrayArray4[0][local11][local7] = Static27.anIntArrayArrayArray4[0][local11][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
	public static void method1759() {
		Static67.aClass27_1.method1924();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static64.aLongArray5[local10] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static24.aLongArray3[local26] = 0L;
		}
		Static66.anInt1693 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Z")
	public static boolean method1762() {
		@Pc(10) Class9 local10 = Static77.aClass9_1;
		synchronized (Static77.aClass9_1) {
			if (Static6.anInt153 == Static19.anInt2912) {
				return false;
			} else {
				Static50.anInt1322 = Static77.anIntArray240[Static19.anInt2912];
				Static62.anInt1617 = Static1.anIntArray2[Static19.anInt2912];
				Static19.anInt2912 = Static19.anInt2912 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
	public static void method1763() {
		for (@Pc(15) Class2_Sub1_Sub4_Sub4 local15 = (Class2_Sub1_Sub4_Sub4) Static71.aClass8_5.method175(); local15 != null; local15 = (Class2_Sub1_Sub4_Sub4) Static71.aClass8_5.method173()) {
			if (Static92.anInt2412 != local15.anInt2528 || local15.aBoolean111) {
				local15.method2073();
			} else if (local15.anInt2517 <= Static113.anInt2952) {
				local15.method1790(Static100.anInt2609);
				if (local15.aBoolean111) {
					local15.method2073();
				} else {
					Static85.aClass61_1.method1688(local15.anInt2528, local15.anInt2532, local15.anInt2525, local15.anInt2526, 60, local15, 0, -1, false);
				}
			}
		}
	}
}
