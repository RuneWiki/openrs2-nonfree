import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_19;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] aClass6_Sub3_Sub3_Sub2Array11;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
	public static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
	public static final int anInt2837 = 50;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
	public static int[] anIntArray298 = new int[anInt2837];

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array19 = new Class63[anInt2837];

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
	public static int[] anIntArray299 = new int[anInt2837];

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1542 = Static80.method1463("Create a free account");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1539 = aClass63_1542;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
	public static int[] anIntArray300 = new int[anInt2837];

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt2835 = -1;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1540 = Static80.method1463("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "[I")
	public static int[] anIntArray301 = new int[anInt2837];

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
	public static int[] anIntArray302 = new int[anInt2837];

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
	public static int[] anIntArray303 = new int[anInt2837];

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1541 = Static80.method1463("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
	public static int[] anIntArray304 = new int[anInt2837];

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1543 = Static80.method1463("Lade Texturen )2 ");

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
	public static int[] anIntArray306 = new int[50];

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
	public static int anInt2839 = -1;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1544 = aClass63_1540;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1545 = Static80.method1463("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1546 = Static80.method1463("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!p;IIII)V")
	public static void method1861(@OriginalArg(0) Class6_Sub3_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1 || Static18.anInt569 >= 400) {
			return;
		}
		@Pc(50) Class63 local50;
		if (arg0.anInt2360 == 0) {
			local50 = Static15.method374(new Class63[] { arg0.aClass63_1237, Static76.method1435(arg0.anInt2375, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2375), Static21.aClass63_441, Static90.aClass63_1333, Static118.method2114(arg0.anInt2375), Static113.aClass63_398 });
		} else {
			local50 = Static15.method374(new Class63[] { arg0.aClass63_1237, Static21.aClass63_441, Static14.aClass63_320, Static118.method2114(arg0.anInt2360), Static113.aClass63_398 });
		}
		@Pc(162) int local162;
		if (Static29.anInt939 == 1) {
			Static19.method501(arg2, Static15.method374(new Class63[] { Static1.aClass63_8, Static88.aClass63_1284, local50 }), arg1, arg3, 7, Static18.aClass63_385);
		} else if (!Static42.aBoolean63) {
			for (local162 = 4; local162 >= 0; local162--) {
				if (Static115.aClass63Array21[local162] != null) {
					@Pc(174) short local174 = 0;
					if (Static115.aClass63Array21[local162].method1822(Static119.aClass63_1743)) {
						if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2375 < arg0.anInt2375) {
							local174 = 2000;
						}
						if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2369 != 0 && arg0.anInt2369 != 0) {
							if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2369 == arg0.anInt2369) {
								local174 = 2000;
							} else {
								local174 = 0;
							}
						}
					} else if (Static87.aBooleanArray13[local162]) {
						local174 = 2000;
					}
					@Pc(219) int local219 = 0;
					if (local162 == 0) {
						local219 = local174 + 8;
					}
					if (local162 == 1) {
						local219 = local174 + 44;
					}
					if (local162 == 2) {
						local219 = local174 + 50;
					}
					if (local162 == 3) {
						local219 = local174 + 57;
					}
					if (local162 == 4) {
						local219 = local174 + 29;
					}
					Static19.method501(arg2, Static15.method374(new Class63[] { Static102.aClass63_1535, local50 }), arg1, arg3, local219, Static115.aClass63Array21[local162]);
				}
			}
		} else if ((Static72.anInt2049 & 0x8) == 8) {
			Static19.method501(arg2, Static15.method374(new Class63[] { Static50.aClass63_807, Static88.aClass63_1284, local50 }), arg1, arg3, 38, Static33.aClass63_613);
		}
		for (local162 = 0; local162 < Static18.anInt569; local162++) {
			if (Static69.anIntArray225[local162] == 51) {
				Static31.aClass63Array7[local162] = Static15.method374(new Class63[] { Static14.aClass63_321, Static33.aClass63_608, Static102.aClass63_1535, local50 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1862() {
		aByteArrayArray9 = null;
		anIntArray302 = null;
		aClass63_1545 = null;
		aClass6_Sub3_Sub3_Sub2Array11 = null;
		anIntArray305 = null;
		anIntArray300 = null;
		aClass63_1542 = null;
		aClass63_1544 = null;
		anIntArray299 = null;
		anIntArray306 = null;
		aClass63_1541 = null;
		aClass63_1539 = null;
		anIntArray301 = null;
		anIntArray298 = null;
		anIntArray307 = null;
		anIntArray303 = null;
		aClass63Array19 = null;
		aClass63_1546 = null;
		aClass7_Sub1_19 = null;
		aClass63_1540 = null;
		aClass63_1543 = null;
		anIntArray304 = null;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public static void method1864() {
		if (Static74.anInt2070 > 0) {
			Static42.method922();
		} else {
			Static73.method1392(40);
			Static31.aClass47_2 = Static100.aClass47_4;
			Static100.aClass47_4 = null;
		}
	}
}
