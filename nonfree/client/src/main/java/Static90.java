import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Lclient!ka;")
	public static Class1_Sub8 aClass1_Sub8_5;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array39;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "[Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array6;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public static final int anInt2390 = 50;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
	public static int[] anIntArray362 = new int[anInt2390];

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
	public static int[] anIntArray363 = new int[anInt2390];

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
	public static int[] anIntArray364 = new int[anInt2390];

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "[Lclient!mc;")
	public static Class42[] aClass42Array11 = new Class42[anInt2390];

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1289 = Static23.method501("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "[Lclient!ac;")
	public static Class3[] aClass3Array1 = new Class3[50];

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "[I")
	public static int[] anIntArray365 = new int[anInt2390];

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "[Lclient!mc;")
	public static Class42[] aClass42Array12 = new Class42[100];

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
	public static int anInt2395 = 0;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "[I")
	public static int[] anIntArray366 = new int[anInt2390];

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
	public static int[] anIntArray367 = new int[anInt2390];

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "[I")
	public static int[] anIntArray368 = new int[anInt2390];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method1655() {
		Static84.aClass31_30.method996();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method1656() {
		aClass42_1289 = null;
		anIntArray369 = null;
		anIntArray363 = null;
		anIntArray367 = null;
		aClass42Array12 = null;
		aClass1_Sub8_5 = null;
		anIntArray365 = null;
		anIntArray368 = null;
		aClass42Array11 = null;
		aClass1_Sub1_Sub1_Sub1Array39 = null;
		anIntArray364 = null;
		aClass1_Sub1_Sub1_Sub4Array6 = null;
		anIntArray362 = null;
		anIntArray366 = null;
		aClass3Array1 = null;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public static void method1657() {
		for (@Pc(3) int local3 = 0; local3 < Static65.anInt1577; local3++) {
			@Pc(9) int local9 = Static29.anIntArray97[local3]--;
			if (Static29.anIntArray97[local3] >= -10) {
				@Pc(80) Class3 local80 = aClass3Array1[local3];
				if (local80 == null) {
					local80 = Static111.method89(Static7.aClass33_Sub1_1, Static81.anIntArray324[local3]);
					if (local80 == null) {
						continue;
					}
					Static29.anIntArray97[local3] += local80.method91();
					aClass3Array1[local3] = local80;
				}
				if (Static29.anIntArray97[local3] < 0) {
					@Pc(113) int local113 = Static62.anInt1488;
					if (Static48.anIntArray185[local3] != 0) {
						@Pc(125) int local125 = (Static48.anIntArray185[local3] & 0xFF) * 128;
						@Pc(133) int local133 = Static48.anIntArray185[local3] >> 16 & 0xFF;
						@Pc(143) int local143 = local133 * 128 + 64 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576;
						if (local143 < 0) {
							local143 = -local143;
						}
						@Pc(156) int local156 = Static48.anIntArray185[local3] >> 8 & 0xFF;
						@Pc(166) int local166 = local156 * 128 + 64 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583;
						if (local166 < 0) {
							local166 = -local166;
						}
						@Pc(177) int local177 = local166 + local143 - 128;
						if (local125 < local177) {
							Static29.anIntArray97[local3] = -100;
							continue;
						}
						if (local177 < 0) {
							local177 = 0;
						}
						local113 = (local125 - local177) * Static62.anInt1488 / local125;
					}
					@Pc(207) Class1_Sub10_Sub1 local207 = local80.method88().method1093(Static27.aClass16_1);
					@Pc(212) Class1_Sub12_Sub2 local212 = Static117.method1789(local207, local113);
					local212.method1797(Static60.anIntArray218[local3] - 1);
					Static91.aClass1_Sub12_Sub1_1.method1591(local212);
					Static29.anIntArray97[local3] = -100;
				}
			} else {
				Static65.anInt1577--;
				for (@Pc(23) int local23 = local3; local23 < Static65.anInt1577; local23++) {
					Static81.anIntArray324[local23] = Static81.anIntArray324[local23 + 1];
					aClass3Array1[local23] = aClass3Array1[local23 + 1];
					Static60.anIntArray218[local23] = Static60.anIntArray218[local23 + 1];
					Static29.anIntArray97[local23] = Static29.anIntArray97[local23 + 1];
					Static48.anIntArray185[local23] = Static48.anIntArray185[local23 + 1];
				}
				local3--;
			}
		}
		if (Static58.anInt1434 <= 0) {
			return;
		}
		Static58.anInt1434 -= 20;
		if (Static58.anInt1434 < 0) {
			Static58.anInt1434 = 0;
		}
		if (Static58.anInt1434 == 0 && Static20.anInt655 != 0 && Static108.anInt2750 != -1) {
			Static97.method1706(Static108.anInt2750, 0, Static7.aClass33_Sub1_2, Static20.anInt655);
			return;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	public static void method1658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class22 local11 = Static93.aClass22ArrayArrayArray1[Static82.anInt2165][arg1][arg0];
		if (local11 == null) {
			Static88.aClass20_1.method492(Static82.anInt2165, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub8_Sub2 local23 = null;
		@Pc(28) Class1_Sub1_Sub8_Sub2 local28;
		for (local28 = (Class1_Sub1_Sub8_Sub2) local11.method515(); local28 != null; local28 = (Class1_Sub1_Sub8_Sub2) local11.method519()) {
			@Pc(34) Class1_Sub1_Sub2 local34 = Static36.method617(local28.anInt1827);
			@Pc(37) int local37 = local34.anInt210;
			if (local34.aBoolean8) {
				local37 *= local28.anInt1824 + 1;
			}
			if (local37 > local21) {
				local23 = local28;
				local21 = local37;
			}
		}
		if (local23 == null) {
			Static88.aClass20_1.method492(Static82.anInt2165, arg1, arg0);
			return;
		}
		local11.method513(local23);
		@Pc(80) Class1_Sub1_Sub8_Sub2 local80 = null;
		@Pc(82) Class1_Sub1_Sub8_Sub2 local82 = null;
		for (local28 = (Class1_Sub1_Sub8_Sub2) local11.method515(); local28 != null; local28 = (Class1_Sub1_Sub8_Sub2) local11.method519()) {
			if (local23.anInt1827 != local28.anInt1827) {
				if (local82 == null) {
					local82 = local28;
				}
				if (local82.anInt1827 != local28.anInt1827 && local80 == null) {
					local80 = local28;
				}
			}
		}
		@Pc(121) int local121 = arg1 + (arg0 << 7) + 1610612736;
		Static88.aClass20_1.method475(Static82.anInt2165, arg1, arg0, Static104.method1821(arg0 * 128 + 64, Static82.anInt2165, arg1 * 128 + 64), local23, local121, local82, local80);
	}
}
