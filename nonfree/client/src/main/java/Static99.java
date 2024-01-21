import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_997 = Static51.method932(":assist:");

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "[I")
	public static int[] anIntArray241 = new int[25];

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "Lclient!sa;")
	public static Class72 aClass72_18 = new Class72(64);

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_998 = Static51.method932(" is already on your friend list)3");

	@OriginalMember(owner = "client!mc", name = "db", descriptor = "Lclient!cd;")
	public static Class10 aClass10_999 = Static51.method932("gleiten:");

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1000 = aClass10_998;

	@OriginalMember(owner = "client!mc", name = "fb", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!mc", name = "gb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1001 = Static51.method932(":tradereq:");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!je;)V")
	public static void method1643(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static40.anInt976 != 1) {
			return;
		}
		if (Static62.anInt1534 >= 280 && Static62.anInt1534 <= 294 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(0, 0);
			return;
		}
		if (Static62.anInt1534 >= 295 && Static62.anInt1534 <= 360 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(1, 0);
			return;
		}
		if (Static62.anInt1534 >= 390 && Static62.anInt1534 <= 404 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(0, 1);
			return;
		}
		if (Static62.anInt1534 >= 405 && Static62.anInt1534 <= 470 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(1, 1);
			return;
		}
		if (Static62.anInt1534 >= 500 && Static62.anInt1534 <= 514 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(0, 2);
			return;
		}
		if (Static62.anInt1534 >= 515 && Static62.anInt1534 <= 580 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(1, 2);
			return;
		}
		if (Static62.anInt1534 >= 610 && Static62.anInt1534 <= 624 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(0, 3);
			return;
		}
		if (Static62.anInt1534 >= 625 && Static62.anInt1534 <= 690 && Static40.anInt977 >= 4 && Static40.anInt977 <= 18) {
			Static174.method2678(1, 3);
			return;
		}
		if (Static62.anInt1534 >= 708 && Static40.anInt977 >= 4 && Static62.anInt1534 <= 758 && Static40.anInt977 <= 20) {
			Static133.aBoolean132 = false;
			Static163.aClass2_Sub1_Sub4_Sub2_42.method716(0, 0);
			Static177.aClass2_Sub1_Sub4_Sub2_44.method716(382, 0);
			Static145.aClass2_Sub1_Sub4_Sub3_6.method1874(382 - Static145.aClass2_Sub1_Sub4_Sub3_6.anInt2635 / 2, 18);
			return;
		}
		if (Static67.anInt2916 == -1) {
			return;
		}
		@Pc(281) Class8 local281 = Static141.aClass8Array1[Static67.anInt2916];
		if (Static165.aBoolean157 == local281.aBoolean17) {
			@Pc(313) byte[] local313 = Static3.method36(new Class10[] { local281.aClass10_241, Static176.aClass10_1600 }).method359();
			Static87.aString1 = new String(local313, 0, local313.length);
			Static12.anInt363 = local281.anInt502;
			Static133.aBoolean132 = false;
			if (Static174.anInt3740 != 0) {
				Static174.anInt3740 = 0;
				Static159.anInt3394 = 43594;
				Static63.anInt1563 = 43594;
				Static103.anInt2370 = 443;
			}
			Static163.aClass2_Sub1_Sub4_Sub2_42.method716(0, 0);
			Static177.aClass2_Sub1_Sub4_Sub2_44.method716(382, 0);
			Static145.aClass2_Sub1_Sub4_Sub3_6.method1874(382 - Static145.aClass2_Sub1_Sub4_Sub3_6.anInt2635 / 2, 18);
			return;
		}
		@Pc(411) Class10 local411 = Static3.method36(new Class10[] { Static158.aClass10_1478, local281.aClass10_241, Static176.aClass10_1600, Static63.aClass10_684, Static96.aClass10_1583, Static164.method2485(Static170.aBoolean163 ? 1 : 0), Static55.aClass10_609, Static164.method2485(Static111.anInt2520), Static115.aClass10_1122, Static164.method2485(Static65.anInt1580) });
		try {
			arg0.getAppletContext().showDocument(local411.method369(), "_self");
			return;
		} catch (@Pc(420) Exception local420) {
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILclient!kh;)Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3 method1644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class29 arg2) {
		return Static111.method1762(arg1, arg0, arg2) ? Static10.method173() : null;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	public static void method1645() {
		aBooleanArray9 = null;
		aByteArrayArrayArray8 = null;
		aClass10_1000 = null;
		aClass10_999 = null;
		aClass72_18 = null;
		aClass10_998 = null;
		aClass10_1001 = null;
		anIntArray241 = null;
		aClass10_997 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)Lclient!mh;")
	public static Class2_Sub15 method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub15 local7 = new Class2_Sub15();
		local7.anInt2387 = arg0;
		local7.anInt2382 = arg2;
		Static30.aClass18_2.method685((long) arg1, local7);
		Static1.method1(arg0);
		Static141.method2231(arg0);
		@Pc(29) Class23 local29 = Static102.method2541(arg1);
		if (local29 != null) {
			Static3.method34(local29);
		}
		if (Static68.aClass23_6 != null) {
			Static3.method34(Static68.aClass23_6);
			Static68.aClass23_6 = null;
		}
		Static46.anInt1135 = 0;
		Static119.aBoolean119 = false;
		Static98.method1627(Static119.anInt2712, Static107.anInt2462, Static159.anInt3393, Static167.anInt2027);
		if (Static107.anInt2446 != -1) {
			Static144.method2255(Static107.anInt2446, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIII)Z")
	public static boolean method1647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static180.aClass60_1.method1803(Static56.anInt1432, arg0, arg2, arg1);
		if (local18 == -1) {
			return false;
		}
		@Pc(32) int local32 = local18 & 0x1F;
		@Pc(38) int local38 = local18 >> 6 & 0x3;
		if (local32 == 10 || local32 == 11 || local32 == 22) {
			@Pc(55) Class2_Sub1_Sub10 local55 = Static62.method1106(local11);
			@Pc(68) int local68;
			@Pc(65) int local65;
			if (local38 == 0 || local38 == 2) {
				local65 = local55.anInt2210;
				local68 = local55.anInt2225;
			} else {
				local68 = local55.anInt2210;
				local65 = local55.anInt2225;
			}
			@Pc(79) int local79 = local55.anInt2242;
			if (local38 != 0) {
				local79 = (local79 << local38 & 0xF) + (local79 >> 4 - local38);
			}
			Static165.method2527(local79, true, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], local65, arg0, 0, local68, 2, arg2, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
		} else {
			Static165.method2527(0, true, local32 + 1, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, arg0, local38, 0, 2, arg2, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
		}
		Static136.anInt3023 = Static40.anInt977;
		Static90.anInt2132 = 0;
		Static54.anInt1339 = 2;
		Static160.anInt3405 = Static62.anInt1534;
		return true;
	}
}
