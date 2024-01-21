import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
	public static boolean aBoolean106;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!td;")
	private static Class54 aClass54_29;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!wd;")
	public static Class3_Sub11 aClass3_Sub11_5;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Lclient!pc;")
	public static Class12 aClass12_65;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "Lclient!db;")
	public static Class14 aClass14_6;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static int anInt2212 = 0;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1065 = Static87.method1648(" million");

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1060 = aClass27_1065;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt2213 = 0;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1066 = Static87.method1648("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1061 = aClass27_1066;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static volatile int anInt2216 = 0;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1062 = Static87.method1648("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1063 = Static87.method1648("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1067 = Static87.method1648("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1064 = aClass27_1067;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public static int anInt2220 = -1;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "[I")
	public static int[] anIntArray337 = new int[256];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class3_Sub3_Sub11 method1557(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub11 local10 = (Class3_Sub3_Sub11) Static16.aClass21_13.method658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = aClass54_29.method1615(13, arg0);
		local10 = new Class3_Sub3_Sub11();
		local10.anInt2488 = arg0;
		if (local20 != null) {
			local10.method1707(new Class3_Sub11(local20));
		}
		Static16.aClass21_13.method660(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public static void method1558() {
		Static56.method1073(Static55.anInt1446);
		if (Static92.anInt2543 != -1) {
			Static56.method1073(Static92.anInt2543);
		}
		Static39.anInt989 = 0;
		Static1.aClass12_1.method674();
		Static105.anIntArray398 = Static51.method1015(Static105.anIntArray398);
		Static95.method1320();
		Static28.method616(0, 0, -1, 765, 503, 0, 0, Static55.anInt1446);
		if (Static92.anInt2543 != -1) {
			Static28.method616(0, 0, -1, 765, 503, 0, 0, Static92.anInt2543);
		}
		if (Static12.aBoolean16) {
			Static48.method1672();
		} else {
			Static39.method755();
			Static10.method231();
		}
		try {
			@Pc(67) Graphics local67 = Static19.aCanvas1.getGraphics();
			Static1.aClass12_1.method671(0, local67, 0);
		} catch (@Pc(75) Exception local75) {
			Static19.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!td;BLclient!td;)V")
	public static void method1559(@OriginalArg(0) Class54 arg0, @OriginalArg(2) Class54 arg1) {
		Static39.aClass54_18 = arg0;
		aClass54_29 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1560() {
		aClass14_6 = null;
		aClass27_1066 = null;
		aClass27_1061 = null;
		aClass27_1063 = null;
		aClass27_1060 = null;
		anIntArray337 = null;
		aClass12_65 = null;
		aClass3_Sub11_5 = null;
		aClass27_1067 = null;
		anIntArray338 = null;
		aClass27_1065 = null;
		aClass27_1062 = null;
		aClass54_29 = null;
		aClass27_1064 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!r;Lclient!qd;II)V")
	public static void method1561(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class54_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class28 local9 = Static106.aClass28_7;
		synchronized (Static106.aClass28_7) {
			for (@Pc(16) Class3_Sub12 local16 = (Class3_Sub12) Static106.aClass28_7.method884(); local16 != null; local16 = (Class3_Sub12) Static106.aClass28_7.method875()) {
				if ((long) arg2 == local16.aLong83 && local16.aClass55_4 == arg0 && local16.anInt2521 == 0) {
					local7 = local16.aByteArray21;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(78) byte[] local78 = arg0.method1647(arg2);
			arg1.method1624(true, local78, arg0, arg2);
		} else {
			arg1.method1624(true, local7, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method1562() {
		if (Static88.aClass5_1 == null) {
			return;
		}
		if (Static39.anInt988 < 0) {
			if (Static15.anInt297 > 0) {
				Static15.anInt297--;
				if (Static15.anInt297 == 0) {
					if (Static22.aByteArray7 == null) {
						Static88.aClass5_1.method1233(256);
					} else {
						Static88.aClass5_1.method1233(Static83.anInt2364);
						Static39.anInt988 = Static83.anInt2364;
						Static88.aClass5_1.method1234(Static16.aBoolean23, Static83.anInt2364, Static22.aByteArray7);
						Static22.aByteArray7 = null;
					}
					Static78.anInt2155 = 0;
				}
			}
		} else if (Static15.anInt297 > 0) {
			Static78.anInt2155 += anInt2213;
			Static88.aClass5_1.method1226(Static78.anInt2155, Static39.anInt988);
			Static15.anInt297--;
			if (Static15.anInt297 == 0) {
				Static88.aClass5_1.method1231();
				Static39.anInt988 = -1;
				Static15.anInt297 = 20;
			}
		}
		Static88.aClass5_1.method1228();
	}
}
