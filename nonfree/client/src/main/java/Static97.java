import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!ja;")
	public static Class33 aClass33_27;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!pa;")
	public static Class47 aClass47_29;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1330 = Static23.method501(" )2> @cya@");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!he;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[I")
	public static int[] anIntArray373 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public static int anInt2472 = 0;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "[Lclient!mc;")
	public static Class42[] aClass42Array13 = new Class42[100];

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public static final int anInt2475 = 3353893;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1331 = Static23.method501("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1332 = Static23.method501("Malformed login packet)3");

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1333 = aClass42_1332;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1334 = Static23.method501("Stufe)2");

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	public static int anInt2477 = 0;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	public static int anInt2479 = 0;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	public static int anInt2484 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method1699() {
		@Pc(7) int local7 = Static50.anInt1724;
		@Pc(9) int local9 = Static91.anInt2407;
		@Pc(11) int local11 = Static81.anInt2119;
		@Pc(13) int local13 = Static27.anInt792;
		Static55.method1129(local9, local7, local11, local13, 6116423);
		Static55.method1129(local9 + 1, local7 + 1, local11 - 2, 16, 0);
		Static55.method1138(local9 + 1, local7 + 18, local11 - 2, local13 + -19, 0);
		Static3.aClass1_Sub1_Sub1_Sub3_1.method818(Static61.aClass42_793, local9 + 3, local7 + 14, 6116423);
		@Pc(59) int local59 = Static38.anInt948;
		@Pc(61) int local61 = Static73.anInt1884;
		if (Static73.anInt1891 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static73.anInt1891 == 1) {
			local61 -= 553;
			local59 -= 205;
		}
		if (Static73.anInt1891 == 2) {
			local61 -= 17;
			local59 -= 357;
		}
		for (@Pc(83) int local83 = 0; local83 < Static83.anInt2216; local83++) {
			@Pc(87) int local87 = 16777215;
			@Pc(100) int local100 = (Static83.anInt2216 - local83 - 1) * 15 + local7 + 31;
			if (local9 < local61 && local61 < local9 + local11 && local59 > local100 - 13 && local100 + 3 > local59) {
				local87 = 16776960;
			}
			Static3.aClass1_Sub1_Sub1_Sub3_1.method807(Static36.aClass42Array6[local83], local9 + 3, local100, local87, true);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public static synchronized void method1700() {
		if (Static15.method396()) {
			Static101.method1778();
			Static1.aBoolean1 = false;
			Static42.aClass33_29 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method1701() {
		aClass42_1333 = null;
		aClass42_1331 = null;
		aClass47_29 = null;
		aClass42_1334 = null;
		anIntArray373 = null;
		anIntArray374 = null;
		aClass42_1332 = null;
		aClass33_27 = null;
		aClass42_1330 = null;
		aClass42Array13 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!mc;ZLclient!mc;IILclient!ja;)V")
	public static synchronized void method1702(@OriginalArg(2) Class42 arg0, @OriginalArg(4) Class42 arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class33 arg3) {
		if (Static15.method396()) {
			@Pc(12) int local12 = arg3.method1302(arg1);
			@Pc(18) int local18 = arg3.method1320(arg0, local12);
			method1709(local12, arg3, arg2, local18);
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static synchronized void method1703() {
		if (Static15.method396()) {
			Static65.method1106();
			Static1.aBoolean1 = false;
			Static42.aClass33_29 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method1704() {
		while (true) {
			@Pc(9) Class22 local9 = Static72.aClass22_11;
			@Pc(16) Class1_Sub9 local16;
			synchronized (Static72.aClass22_11) {
				local16 = (Class1_Sub9) Static16.aClass22_4.method517();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass33_Sub1_13.method1332(local16.aByteArray16, (int) local16.aLong83, false, local16.aClass8_2);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Lclient!mc;")
	public static Class42 method1705(@OriginalArg(0) int arg0) {
		return Static57.method1822(new Class42[] { Static38.method642(arg0 >> 24 & 0xFF), Static48.aClass42_668, Static38.method642(arg0 >> 16 & 0xFF), Static48.aClass42_668, Static38.method642(arg0 >> 8 & 0xFF), Static48.aClass42_668, Static38.method642(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZZLclient!ja;II)V")
	public static synchronized void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class33 arg2, @OriginalArg(6) int arg3) {
		if (!Static15.method396()) {
			return;
		}
		Static15.aBoolean24 = false;
		Static1.aBoolean1 = true;
		Static37.anInt910 = 0;
		Static24.anInt719 = -1;
		Static1.anInt6 = -1;
		Static46.anInt1214 = arg1;
		Static19.anInt640 = arg3;
		Static42.aClass33_29 = arg2;
		Static3.anInt117 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static synchronized void method1707() {
		Static88.method1616();
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	public static synchronized void method1708() {
		if (!Static15.method396()) {
			return;
		}
		if (Static1.aBoolean1) {
			@Pc(18) byte[] local18 = Static34.method587(Static42.aClass33_29, Static46.anInt1214, Static3.anInt117, Static37.anInt910);
			if (local18 != null) {
				if (Static24.anInt719 >= 0) {
					Static69.method1239(Static15.aBoolean24, Static24.anInt719, Static19.anInt640, local18);
				} else if (Static1.anInt6 < 0) {
					Static1.method1(Static15.aBoolean24, Static19.anInt640, local18);
				} else {
					Static53.method1836(local18, Static15.aBoolean24, Static1.anInt6, Static19.anInt640);
				}
				Static1.aBoolean1 = false;
				Static42.aClass33_29 = null;
			}
		}
		Static101.method1773();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!ja;IIZBII)V")
	public static synchronized void method1709(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static15.method396()) {
			return;
		}
		Static37.anInt910 = arg3;
		Static46.anInt1214 = 0;
		Static1.anInt6 = -1;
		Static15.aBoolean24 = false;
		Static42.aClass33_29 = arg1;
		Static19.anInt640 = arg2;
		Static3.anInt117 = arg0;
		Static24.anInt719 = 10;
		Static1.aBoolean1 = true;
	}
}
