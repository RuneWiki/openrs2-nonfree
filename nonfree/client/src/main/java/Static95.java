import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public static int anInt2488;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!oc;")
	public static Class34 aClass34_69;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1401 = Static15.method178("backright2");

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1402 = Static15.method178("Duell akzeptieren");

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public static int anInt2496 = 0;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1403 = Static15.method178("Abbrechen");

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public static volatile int anInt2498 = 0;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public static int anInt2499 = -1;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1404 = Static15.method178(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	public static int anInt2504 = 0;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1405 = Static15.method178("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1406 = Static15.method178("@whi@");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public static void method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class1_Sub14 local6 = (Class1_Sub14) Static7.aClass14_2.method343((long) arg1);
		if (local6 == null) {
			local6 = new Class1_Sub14();
			Static7.aClass14_2.method345(local6, (long) arg1);
		}
		if (local6.anIntArray407.length <= arg2) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			for (@Pc(48) int local48 = 0; local48 < local6.anIntArray407.length; local48++) {
				local46[local48] = local6.anIntArray407[local48];
				local41[local48] = local6.anIntArray408[local48];
			}
			for (@Pc(73) int local73 = local6.anIntArray407.length; local73 < arg2; local73++) {
				local46[local73] = -1;
				local41[local73] = 0;
			}
			local6.anIntArray407 = local46;
			local6.anIntArray408 = local41;
		}
		local6.anIntArray407[arg2] = arg0;
		local6.anIntArray408[arg2] = arg3;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
	public static void method1616() {
		Static2.aClass5_49.method99();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method1621() {
		aClass23_1401 = null;
		aByteArrayArrayArray5 = null;
		aClass23_1402 = null;
		aClass23_1403 = null;
		aClass23_1405 = null;
		aClass23_1404 = null;
		aClass23_1406 = null;
		aClass34_69 = null;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method1624() {
		if (Static36.anInt1284 != 0) {
			return;
		}
		Static109.aClass23Array18[0] = Static98.aClass23_1436;
		Static34.anIntArray142[0] = 1004;
		Static40.anInt1400 = 1;
		if (Static77.anInt2096 != -1) {
			Static37.anInt1287 = -1;
			Static57.anInt1786 = -1;
			Static37.method747(Static110.anInt2872, 0, 0, Static32.anInt1007, 503, 765, 0, Static77.anInt2096);
			Static20.anInt690 = Static57.anInt1786;
			Static109.anInt2830 = Static37.anInt1287;
			return;
		}
		Static76.method1333();
		Static57.anInt1786 = -1;
		Static37.anInt1287 = -1;
		@Pc(49) boolean local49 = false;
		if (Static32.anInt1007 > 4 && Static110.anInt2872 > 4 && Static32.anInt1007 < 516 && Static110.anInt2872 < 338) {
			if (Static109.anInt2824 == -1) {
				Static9.method107();
			} else {
				Static37.method747(Static110.anInt2872, 4, 4, Static32.anInt1007, 338, 516, 0, Static109.anInt2824);
			}
		}
		Static20.anInt690 = Static57.anInt1786;
		Static109.anInt2830 = Static37.anInt1287;
		Static37.anInt1287 = -1;
		Static57.anInt1786 = -1;
		if (Static32.anInt1007 > 553 && Static110.anInt2872 > 205 && Static32.anInt1007 < 743 && Static110.anInt2872 < 466) {
			if (Static16.anInt335 != -1) {
				Static37.method747(Static110.anInt2872, 205, 553, Static32.anInt1007, 466, 743, 1, Static16.anInt335);
			} else if (Static90.anIntArray325[Static106.anInt2723] != -1) {
				Static37.method747(Static110.anInt2872, 205, 553, Static32.anInt1007, 466, 743, 1, Static90.anIntArray325[Static106.anInt2723]);
			}
		}
		if (Static57.anInt1786 != Static39.anInt1381) {
			Static34.aBoolean60 = true;
			Static39.anInt1381 = Static57.anInt1786;
		}
		if (Static37.anInt1287 != Static2.anInt2279) {
			Static2.anInt2279 = Static37.anInt1287;
			Static34.aBoolean60 = true;
		}
		Static57.anInt1786 = -1;
		Static37.anInt1287 = -1;
		if (Static32.anInt1007 > 17 && Static110.anInt2872 > 357 && Static32.anInt1007 < 496 && Static110.anInt2872 < 453) {
			if (Static92.anInt2913 != -1) {
				Static37.method747(Static110.anInt2872, 357, 17, Static32.anInt1007, 453, 496, 2, Static92.anInt2913);
			} else if (Static56.anInt1733 != -1) {
				Static37.method747(Static110.anInt2872, 357, 17, Static32.anInt1007, 453, 496, 3, Static56.anInt1733);
			} else if (Static110.anInt2872 < 434 && Static32.anInt1007 < 426) {
				Static31.method505(Static32.anInt1007 - 17, Static110.anInt2872 + -357);
			}
		}
		if ((Static92.anInt2913 != -1 || Static56.anInt1733 != -1) && Static57.anInt1786 != Static29.anInt882) {
			Static102.aBoolean123 = true;
			Static29.anInt882 = Static57.anInt1786;
		}
		if ((Static92.anInt2913 != -1 || Static56.anInt1733 != -1) && Static44.anInt1487 != Static37.anInt1287) {
			Static44.anInt1487 = Static37.anInt1287;
			Static102.aBoolean123 = true;
		}
		while (!local49) {
			local49 = true;
			for (@Pc(266) int local266 = 0; local266 < Static40.anInt1400 - 1; local266++) {
				if (Static34.anIntArray142[local266] < 1000 && Static34.anIntArray142[local266 + 1] > 1000) {
					local49 = false;
					@Pc(285) Class23 local285 = Static109.aClass23Array18[local266];
					Static109.aClass23Array18[local266] = Static109.aClass23Array18[local266 + 1];
					Static109.aClass23Array18[local266 + 1] = local285;
					@Pc(303) int local303 = Static34.anIntArray142[local266];
					Static34.anIntArray142[local266] = Static34.anIntArray142[local266 + 1];
					Static34.anIntArray142[local266 + 1] = local303;
					@Pc(321) int local321 = Static90.anIntArray327[local266];
					Static90.anIntArray327[local266] = Static90.anIntArray327[local266 + 1];
					Static90.anIntArray327[local266 + 1] = local321;
					@Pc(339) int local339 = Static18.anIntArray66[local266];
					Static18.anIntArray66[local266] = Static18.anIntArray66[local266 + 1];
					Static18.anIntArray66[local266 + 1] = local339;
					@Pc(357) int local357 = Static14.anIntArray48[local266];
					Static14.anIntArray48[local266] = Static14.anIntArray48[local266 + 1];
					Static14.anIntArray48[local266 + 1] = local357;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	public static void method1625() {
		Static82.anInt2314 = 0;
		Static37.anInt1299 = 0;
		Static57.method1096();
		Static88.method690();
		Static31.method506();
		@Pc(25) int local25;
		for (@Pc(20) int local20 = 0; local20 < Static82.anInt2314; local20++) {
			local25 = Static111.anIntArray403[local20];
			if (Static7.anInt176 != Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local25].anInt2224) {
				Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local25].aClass1_Sub1_Sub16_1 = null;
				Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static39.anInt1382 != Static83.aClass1_Sub5_Sub1_3.anInt1266) {
			throw new RuntimeException("gnp1 pos:" + Static83.aClass1_Sub5_Sub1_3.anInt1266 + " psize:" + Static39.anInt1382);
		}
		for (local25 = 0; local25 < Static20.anInt691; local25++) {
			if (Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static98.anIntArray346[local25]] == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static20.anInt691);
			}
		}
	}
}
