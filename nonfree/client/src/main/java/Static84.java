import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array17;

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lclient!sf;")
	public static Class5 aClass5_69;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array9;

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!pa", name = "gb", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array50;

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
	public static int anInt2215 = 0;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1197 = Static106.method1849("Password: ");

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "[I")
	public static int[] anIntArray372 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
	public static int anInt2216 = 0;

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
	public static int anInt2222 = 0;

	@OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
	public static int anInt2224 = 0;

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array18 = new Class66[500];

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "[I")
	public static int[] anIntArray373 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1198 = Static106.method1849("k");

	@OriginalMember(owner = "client!pa", name = "hb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1199 = aClass66_1197;

	@OriginalMember(owner = "client!pa", name = "ib", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1200 = Static106.method1849("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)V")
	public static void method1524(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static126.anInt2886; local21++) {
			if (arg0 == Static41.aLongArray4[local21]) {
				Static126.anInt2886--;
				for (@Pc(43) int local43 = local21; local43 < Static126.anInt2886; local43++) {
					Static41.aLongArray4[local43] = Static41.aLongArray4[local43 + 1];
					Static123.aClass66Array22[local43] = Static123.aClass66Array22[local43 + 1];
				}
				Static60.anInt1850 = Static112.anInt2674;
				Static127.aClass1_Sub12_Sub1_2.method1227(178);
				Static127.aClass1_Sub12_Sub1_2.method1195(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!sc;IIII)V")
	public static void method1526(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub10 local8 = Static127.method2030(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray8 != null) {
			@Pc(18) Class1_Sub5 local18 = new Class1_Sub5();
			local18.aClass1_Sub10_1 = local8;
			local18.anInt453 = arg1;
			local18.anObjectArray3 = local8.anObjectArray8;
			local18.aClass66_285 = arg0;
			Static38.method2005(local18);
		}
		@Pc(38) boolean local38 = true;
		if (local8.anInt1329 > 0) {
			local38 = Static11.method359(local8);
		}
		if (!local38 || !Static119.method1961(arg1 - 1, Static61.method1301(local8))) {
			return;
		}
		if (arg1 == 1) {
			Static127.aClass1_Sub12_Sub1_2.method1227(50);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 2) {
			Static127.aClass1_Sub12_Sub1_2.method1227(157);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 3) {
			Static127.aClass1_Sub12_Sub1_2.method1227(135);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 4) {
			Static127.aClass1_Sub12_Sub1_2.method1227(133);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 5) {
			Static127.aClass1_Sub12_Sub1_2.method1227(189);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 6) {
			Static127.aClass1_Sub12_Sub1_2.method1227(76);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 7) {
			Static127.aClass1_Sub12_Sub1_2.method1227(102);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 8) {
			Static127.aClass1_Sub12_Sub1_2.method1227(252);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 9) {
			Static127.aClass1_Sub12_Sub1_2.method1227(77);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
		if (arg1 == 10) {
			Static127.aClass1_Sub12_Sub1_2.method1227(94);
			Static127.aClass1_Sub12_Sub1_2.method1193(arg3);
			Static127.aClass1_Sub12_Sub1_2.method1175(arg2);
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	public static void method1527() {
		aClass66_1197 = null;
		aClass66_1198 = null;
		aClass1_Sub1_Sub2_Sub3Array9 = null;
		aClass66_1200 = null;
		aShortArrayArray8 = null;
		aClass1_Sub1_Sub2_Sub1Array50 = null;
		anIntArray372 = null;
		aClass5_69 = null;
		aClass66Array17 = null;
		aClass66_1199 = null;
		anIntArray373 = null;
		aClass66Array18 = null;
	}
}
