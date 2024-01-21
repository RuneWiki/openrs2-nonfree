import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!nb;")
	public static Class24 aClass24_3;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] aClass5_Sub1_Sub10_Sub3Array3;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public static int anInt296;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "[B")
	public static byte[] aByteArray1;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_216 = Static38.method736("chatback");

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static volatile int anInt291 = 0;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!vc;")
	private static Class71 aClass71_219 = Static38.method736("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_217 = aClass71_219;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	public static int anInt293 = 0;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_218 = Static38.method736("welle2:");

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!qa;")
	public static Class54 aClass54_4 = new Class54(64);

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public static int anInt298 = 0;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public static int anInt301 = 0;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "[Lclient!vc;")
	public static Class71[] aClass71Array3 = new Class71[100];

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public static int anInt302 = 0;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!vc;")
	private static Class71 aClass71_220 = Static38.method736("skill)2");

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public static int anInt303 = 127;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_221 = aClass71_220;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZI[B)V")
	public static void method197(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (Static119.aClass11_1 == null) {
			return;
		}
		if (Static118.anInt2916 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			Static40.anInt717 = arg2;
			if (Static118.anInt2916 == 0) {
				Static50.anInt1406 = 0;
			} else {
				@Pc(37) int local37 = Static23.method551(Static118.anInt2916);
				@Pc(41) int local41 = local37 - anInt293;
				Static50.anInt1406 = (local41 + arg2 + 3600 - 1) / arg2;
			}
			Static102.anInt2389 = arg0;
			Static108.aBoolean118 = arg1;
			aByteArray1 = arg3;
		} else if (Static40.anInt717 == 0) {
			Static90.method2005(arg3, arg1, arg0);
		} else {
			Static108.aBoolean118 = arg1;
			aByteArray1 = arg3;
			Static102.anInt2389 = arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)Z")
	public static boolean method198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static37.anInt601 == arg1) {
			return true;
		} else if (arg0 == 1 && Static41.anInt1066 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static73.anInt1834;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method199() {
		if (Static73.aBoolean87) {
			Static73.aBoolean87 = false;
			Static59.method1036();
			Static16.aBoolean22 = true;
			Static99.aBoolean103 = true;
			Static28.aBoolean33 = true;
			Static68.aBoolean72 = true;
		}
		Static102.method1646();
		if (Static65.aBoolean71 && Static90.anInt2998 == 1) {
			Static28.aBoolean33 = true;
		}
		@Pc(37) boolean local37;
		if (Static95.anInt2286 != -1) {
			local37 = Static72.method1207(Static95.anInt2286);
			if (local37) {
				Static28.aBoolean33 = true;
			}
		}
		if (Static48.anInt1378 == 2) {
			Static28.aBoolean33 = true;
		}
		if (Static75.anInt1855 == 2) {
			Static28.aBoolean33 = true;
		}
		if (Static28.aBoolean33) {
			Static28.aBoolean33 = false;
			Static112.method1755();
		}
		@Pc(104) int local104;
		if (Static62.anInt1577 == -1) {
			Static38.aClass5_Sub1_Sub11_2.anInt1774 = Static66.anInt1648 - Static34.anInt970 - 77;
			if (Static107.anInt2563 > 17 && Static107.anInt2563 < 560 && Static26.anInt1440 > 332) {
				Static95.method1578(Static38.aClass5_Sub1_Sub11_2, 77, Static66.anInt1648, 463, -1, Static26.anInt1440 - 357, Static107.anInt2563 - 17, 0);
			}
			local104 = Static66.anInt1648 - Static38.aClass5_Sub1_Sub11_2.anInt1774 - 77;
			if (local104 < 0) {
				local104 = 0;
			}
			if (local104 > Static66.anInt1648 - 77) {
				local104 = Static66.anInt1648 - 77;
			}
			if (local104 != Static34.anInt970) {
				Static68.aBoolean72 = true;
				Static34.anInt970 = local104;
			}
		}
		if (Static62.anInt1577 == -1 && Static77.anInt1917 == 3) {
			Static38.aClass5_Sub1_Sub11_2.anInt1774 = Static98.anInt1925;
			local104 = Static32.anInt853 * 14 + 7;
			if (Static107.anInt2563 > 17 && Static107.anInt2563 < 560 && Static26.anInt1440 > 332) {
				Static95.method1578(Static38.aClass5_Sub1_Sub11_2, 77, local104, 463, -1, Static26.anInt1440 - 357, Static107.anInt2563 + -17, 0);
			}
			@Pc(179) int local179 = Static38.aClass5_Sub1_Sub11_2.anInt1774;
			if (local179 < 0) {
				local179 = 0;
			}
			if (local179 > local104 - 77) {
				local179 = local104 - 77;
			}
			if (Static98.anInt1925 != local179) {
				Static98.anInt1925 = local179;
				Static68.aBoolean72 = true;
			}
		}
		if (Static62.anInt1577 != -1) {
			local37 = Static72.method1207(Static62.anInt1577);
			if (local37) {
				Static68.aBoolean72 = true;
			}
		}
		if (Static48.anInt1378 == 3) {
			Static68.aBoolean72 = true;
		}
		if (Static75.anInt1855 == 3) {
			Static68.aBoolean72 = true;
		}
		if (Static48.aClass71_709 != null) {
			Static68.aBoolean72 = true;
		}
		if (Static65.aBoolean71 && Static90.anInt2998 == 2) {
			Static68.aBoolean72 = true;
		}
		if (Static68.aBoolean72) {
			Static68.aBoolean72 = false;
			Static57.method1021();
		}
		Static33.method685();
		if (Static69.anInt1701 != -1) {
			Static16.aBoolean22 = true;
		}
		if (Static16.aBoolean22) {
			if (Static69.anInt1701 != -1 && Static64.anInt2489 == Static69.anInt1701) {
				Static69.anInt1701 = -1;
				Static61.aClass5_Sub11_Sub1_8.method1553(104);
				Static61.aClass5_Sub11_Sub1_8.method1545(Static64.anInt2489);
			}
			Static16.aBoolean22 = false;
			Static57.aBoolean61 = true;
			Static89.method1410(Static95.anInt2285 % 20 < 10 ? -1 : Static69.anInt1701, Static95.anInt2286 == -1, Static64.anInt2489, Static26.anIntArray168);
		}
		if (Static99.aBoolean103) {
			Static57.aBoolean61 = true;
			Static99.aBoolean103 = false;
			Static59.method1035(Static60.anInt1551, Static93.anInt2252, Static64.aClass5_Sub1_Sub10_Sub4_6, Static16.anInt518);
		}
		Static3.method66(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452, Static23.anInt728, Static58.anInt1515, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474);
		Static58.anInt1515 = 0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method200() {
		aClass71Array3 = null;
		aClass71_219 = null;
		aClass54_4 = null;
		aClass24_3 = null;
		aClass71_216 = null;
		aClass71_218 = null;
		anIntArrayArray2 = null;
		aClass71_220 = null;
		aClass71_217 = null;
		aByteArray1 = null;
		aClass71_221 = null;
		aClass5_Sub1_Sub10_Sub3Array3 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method201(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static41.aClass48_1);
		arg0.removeMouseMotionListener(Static41.aClass48_1);
		arg0.removeFocusListener(Static41.aClass48_1);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!nb;Lclient!nb;)V")
	public static void method202(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		Static27.aClass24_6 = arg0;
		Static59.aClass24_14 = arg1;
		Static98.anInt1927 = Static27.aClass24_6.method660(3);
	}
}
