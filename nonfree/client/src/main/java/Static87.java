import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_2420 = Static94.method1596(" @whi@(X");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean136 = true;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!a;")
	private static Class1 aClass1_2421 = Static94.method1596("New User");

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!a;")
	private static Class1 aClass1_2426 = Static94.method1596("Connection timed out)3");

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_2422 = aClass1_2426;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_2423 = aClass1_2421;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_2424 = Static94.method1596("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!a;")
	public static Class1 aClass1_2425 = Static94.method1596("headicons_hint");

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	public static int anInt2299 = 0;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_2427 = Static94.method1596("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Lclient!a;")
	public static Class1 aClass1_2428 = Static94.method1596("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!bc;II)V")
	public static void method1555(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static111.aClass4_63.method1527();
		Static93.aClass2_Sub1_Sub2_Sub2_24.method637(0, 0);
		arg1.method373(Static32.aClass1_1213, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.method373(Static109.aClass1_2879, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.method373(Static95.aClass1_2521, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.method373(Static57.aClass1_1840, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg1.method373(Static80.aClass1_2267, 55, 41, 65535, true);
		}
		arg1.method373(Static1.aClass1_5, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.method373(Static109.aClass1_2879, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.method373(Static95.aClass1_2521, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.method373(Static57.aClass1_1840, 184, 41, 16711680, true);
		}
		arg1.method373(Static57.aClass1_1844, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.method373(Static109.aClass1_2879, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.method373(Static95.aClass1_2521, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.method373(Static57.aClass1_1840, 324, 41, 16711680, true);
		}
		arg1.method357(Static33.aClass1_1229, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(162) Graphics local162 = Static103.aCanvas1.getGraphics();
			Static111.aClass4_63.method1525(0, local162, 453);
		} catch (@Pc(170) Exception local170) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BILclient!bd;I)[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] method1556(@OriginalArg(1) int arg0, @OriginalArg(2) Class8 arg1, @OriginalArg(3) int arg2) {
		return method1560(arg2, arg0, arg1) ? Static104.method1091() : null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Static77.aBoolean113 && Static2.anInt287 != arg6) {
			return;
		}
		@Pc(36) int local36 = 0;
		if (arg5 == 0) {
			local36 = Static109.aClass3_1.method154(arg6, arg2, arg0);
		}
		if (arg5 == 1) {
			local36 = Static109.aClass3_1.method123(arg6, arg2, arg0);
		}
		if (arg5 == 2) {
			local36 = Static109.aClass3_1.method142(arg6, arg2, arg0);
		}
		if (arg5 == 3) {
			local36 = Static109.aClass3_1.method125(arg6, arg2, arg0);
		}
		@Pc(102) int local102;
		if (local36 != 0) {
			@Pc(95) int local95 = local36 >> 14 & 0x7FFF;
			local102 = Static109.aClass3_1.method173(arg6, arg2, arg0, local36);
			@Pc(108) int local108 = local102 >> 6 & 0x3;
			@Pc(112) int local112 = local102 & 0x1F;
			@Pc(126) Class2_Sub1_Sub10 local126;
			if (arg5 == 0) {
				Static109.aClass3_1.method156(arg6, arg2, arg0);
				local126 = Static28.method739(local95);
				if (local126.aBoolean75) {
					Static84.aClass5Array1[arg6].method200(arg2, local108, local126.aBoolean79, arg0, local112);
				}
			}
			if (arg5 == 1) {
				Static109.aClass3_1.method159(arg6, arg2, arg0);
			}
			if (arg5 == 2) {
				Static109.aClass3_1.method167(arg6, arg2, arg0);
				local126 = Static28.method739(local95);
				if (arg2 + local126.anInt1481 > 103 || arg0 + local126.anInt1481 > 103 || arg2 + local126.anInt1491 > 103 || local126.anInt1491 + arg0 > 103) {
					return;
				}
				if (local126.aBoolean75) {
					Static84.aClass5Array1[arg6].method201(local126.aBoolean79, arg0, arg2, local108, local126.anInt1481, local126.anInt1491);
				}
			}
			if (arg5 == 3) {
				Static109.aClass3_1.method163(arg6, arg2, arg0);
				local126 = Static28.method739(local95);
				if (local126.aBoolean75 && local126.anInt1508 == 1) {
					Static84.aClass5Array1[arg6].method197(arg0, arg2);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		local102 = arg6;
		if (arg6 < 3 && (Static29.aByteArrayArrayArray2[1][arg2][arg0] & 0x2) == 2) {
			local102 = arg6 + 1;
		}
		Static14.method448(Static84.aClass5Array1[arg6], arg1, local102, arg6, arg3, Static109.aClass3_1, arg4, arg0, arg2);
		return;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method1558() {
		aClass1_2420 = null;
		aClass1_2428 = null;
		aClass1_2424 = null;
		aClass1_2427 = null;
		aClass1_2423 = null;
		aClass1_2426 = null;
		aByteArrayArray7 = null;
		aClass1_2422 = null;
		aClass1_2421 = null;
		aClass1_2425 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1559() {
		@Pc(1) Object local1 = Static5.anObject1;
		synchronized (Static5.anObject1) {
			if (Static7.anInt1203 != 0) {
				Static7.anInt1203 = 1;
				try {
					Static5.anObject1.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!bd;I)Z")
	public static boolean method1560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		@Pc(14) byte[] local14 = arg2.method1684(arg0, arg1);
		if (local14 == null) {
			return false;
		} else {
			Static10.method1696(local14);
			return true;
		}
	}
}
