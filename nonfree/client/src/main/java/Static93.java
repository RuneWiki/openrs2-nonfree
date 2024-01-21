import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public static final int anInt2526 = 2301979;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!wc;")
	public static Class81 aClass81_13 = new Class81(32);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_731 = Static60.method1113("(Udns");

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!ec;")
	private static Class22 aClass22_733 = Static60.method1113("Type");

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_732 = aClass22_733;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	public static boolean aBoolean223 = false;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "[I")
	public static int[] anIntArray281 = new int[50];

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!wd;")
	public static Class82 aClass82_9 = new Class82();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_734 = Static60.method1113("k");

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!ec;")
	public static Class22 aClass22_735 = Static60.method1113("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	public static int anInt2531 = 0;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_736 = Static60.method1113("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_737 = Static60.method1113("scrollen:");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!ea;Lclient!ea;Lclient!ec;Lclient!ec;)Lclient!nf;")
	public static Class4_Sub1_Sub2_Sub4_Sub1 method1621(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) Class22 arg3) {
		@Pc(4) int local4 = arg0.method592(arg3);
		@Pc(19) int local19 = arg0.method606(arg2, local4);
		return Static107.method1756(local4, arg1, arg0, local19);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public static void method1622() {
		aClass22_731 = null;
		aClass22_732 = null;
		anIntArray281 = null;
		aClass22_734 = null;
		aClass22_735 = null;
		aFontMetrics1 = null;
		aClass22_736 = null;
		aClass22_737 = null;
		aClass82_9 = null;
		aClass22_733 = null;
		aClass81_13 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ea;BLclient!ea;Ljava/awt/Component;)V")
	public static void method1623(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Component arg2) {
		if (Static114.aBoolean252) {
			return;
		}
		Static118.method1374();
		@Pc(15) byte[] local15 = arg0.method610(Static68.aClass22_144, Static61.aClass22_474);
		Static82.aClass4_Sub1_Sub2_Sub2_6 = new Class4_Sub1_Sub2_Sub2(local15, arg2);
		Static39.aClass4_Sub1_Sub2_Sub2_5 = Static82.aClass4_Sub1_Sub2_Sub2_6.method806();
		Static80.aClass4_Sub1_Sub2_Sub3_4 = Static114.method1820(Static61.aClass22_474, arg1, Static28.aClass22_185);
		Static4.aClass4_Sub1_Sub2_Sub3_1 = Static114.method1820(Static61.aClass22_474, arg1, Static56.aClass22_394);
		Static66.aClass4_Sub1_Sub2_Sub3_3 = Static114.method1820(Static61.aClass22_474, arg1, Static96.aClass22_717);
		Static61.aClass4_Sub1_Sub2_Sub3Array5 = Static48.method906(Static61.aClass22_474, Static58.aClass22_452, arg1);
		Static12.aClass4_Sub1_Sub2_Sub3Array1 = Static48.method906(Static61.aClass22_474, Static87.aClass22_663, arg1);
		Static78.anIntArray205 = new int[256];
		for (@Pc(64) int local64 = 0; local64 < 64; local64++) {
			Static78.anIntArray205[local64] = local64 * 262144;
		}
		for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
			Static78.anIntArray205[local80 + 64] = local80 * 1024 + 16711680;
		}
		for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
			Static78.anIntArray205[local100 + 128] = local100 * 4 + 16776960;
		}
		for (@Pc(120) int local120 = 0; local120 < 64; local120++) {
			Static78.anIntArray205[local120 + 192] = 16777215;
		}
		Static111.anIntArray304 = new int[256];
		for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
			Static111.anIntArray304[local137] = local137 * 1024;
		}
		for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
			Static111.anIntArray304[local153 + 64] = local153 * 4 + 65280;
		}
		for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
			Static111.anIntArray304[local173 + 128] = local173 * 262144 + 65535;
		}
		for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
			Static111.anIntArray304[local191 + 192] = 16777215;
		}
		Static103.anIntArray293 = new int[256];
		for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
			Static103.anIntArray293[local210] = local210 * 4;
		}
		for (@Pc(224) int local224 = 0; local224 < 64; local224++) {
			Static103.anIntArray293[local224 + 64] = local224 * 262144 + 255;
		}
		for (@Pc(242) int local242 = 0; local242 < 64; local242++) {
			Static103.anIntArray293[local242 + 128] = local242 * 1024 + 16711935;
		}
		for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
			Static103.anIntArray293[local261 + 192] = 16777215;
		}
		Static5.anIntArray5 = new int[32768];
		Static8.anIntArray274 = new int[32768];
		Static52.anIntArray148 = new int[256];
		Static58.method1096(null);
		Static61.aClass22_476 = Static61.aClass22_474;
		if (Static133.anInt3152 == 0) {
			Static26.aBoolean94 = true;
		} else {
			Static26.aBoolean94 = false;
		}
		Static9.anInt190 = 0;
		Static97.aBoolean228 = false;
		Static37.anIntArray105 = new int[32768];
		Static61.aClass22_470 = Static61.aClass22_474;
		Static3.anIntArray2 = new int[32768];
		if (Static26.aBoolean94) {
			Static129.method1980();
		} else {
			Static59.method1105(Static103.aClass20_Sub1_66, Static60.aClass22_467, Static61.aClass22_474);
		}
		Static78.method1298(false);
		Static114.aBoolean252 = true;
		Static82.aClass4_Sub1_Sub2_Sub2_6.method808(0, 0);
		Static39.aClass4_Sub1_Sub2_Sub2_5.method808(382, 0);
		Static80.aClass4_Sub1_Sub2_Sub3_4.method853(382 - Static80.aClass4_Sub1_Sub2_Sub3_4.anInt1206 / 2, 18);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	public static void method1624(@OriginalArg(0) int arg0) {
		Static68.method345();
		Static104.method1725();
		@Pc(18) int local18 = Static48.method903(arg0).anInt1404;
		if (local18 == 0) {
			return;
		}
		@Pc(28) int local28 = Static23.anIntArray61[arg0];
		if (local18 == 1) {
			if (local28 == 1) {
				Static6.method113(0.9D);
				((Class75) Static6.anInterface2_1).method1848(0.9D);
			}
			if (local28 == 2) {
				Static6.method113(0.8D);
				((Class75) Static6.anInterface2_1).method1848(0.8D);
			}
			if (local28 == 3) {
				Static6.method113(0.7D);
				((Class75) Static6.anInterface2_1).method1848(0.7D);
			}
			if (local28 == 4) {
				Static6.method113(0.6D);
				((Class75) Static6.anInterface2_1).method1848(0.6D);
			}
			Static87.method1541();
		}
		if (local18 == 3) {
			@Pc(88) short local88 = 0;
			if (local28 == 0) {
				local88 = 255;
			}
			if (local28 == 1) {
				local88 = 192;
			}
			if (local28 == 2) {
				local88 = 128;
			}
			if (local28 == 3) {
				local88 = 64;
			}
			if (local28 == 4) {
				local88 = 0;
			}
			if (Static133.anInt3152 != local88) {
				if (Static133.anInt3152 == 0 && Static10.anInt209 != -1) {
					Static130.method2009(Static103.aClass20_Sub1_66, Static10.anInt209, local88, 0);
					aBoolean223 = false;
				} else if (local88 == 0) {
					Static56.method1033();
					aBoolean223 = false;
				} else {
					Static56.method1036(local88);
				}
				Static133.anInt3152 = local88;
			}
		}
		if (local18 == 10) {
			if (local28 == 0) {
				Static95.anInt1927 = 127;
			}
			if (local28 == 1) {
				Static95.anInt1927 = 96;
			}
			if (local28 == 2) {
				Static95.anInt1927 = 64;
			}
			if (local28 == 3) {
				Static95.anInt1927 = 32;
			}
			if (local28 == 4) {
				Static95.anInt1927 = 0;
			}
		}
		if (local18 == 6) {
			Static38.anInt949 = local28;
		}
		if (local18 == 4) {
			if (local28 == 0) {
				Static57.anInt1729 = 127;
			}
			if (local28 == 1) {
				Static57.anInt1729 = 96;
			}
			if (local28 == 2) {
				Static57.anInt1729 = 64;
			}
			if (local28 == 3) {
				Static57.anInt1729 = 32;
			}
			if (local28 == 4) {
				Static57.anInt1729 = 0;
			}
		}
		if (local18 == 5) {
			Static104.anInt2626 = local28;
		}
		if (local18 == 9) {
			Static103.anInt2622 = local28;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
	public static int method1625() {
		return 6;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method1626(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static43.anInt1179 > 0) {
			local16 = Static49.aByteArrayArray2[--Static43.anInt1179];
			Static49.aByteArrayArray2[Static43.anInt1179] = null;
			return local16;
		} else if (arg0 == 5000 && Static94.anInt2535 > 0) {
			local16 = Static76.aByteArrayArray4[--Static94.anInt2535];
			Static76.aByteArrayArray4[Static94.anInt2535] = null;
			return local16;
		} else if (arg0 == 30000 && Static71.anInt1906 > 0) {
			local16 = Static131.aByteArrayArray10[--Static71.anInt1906];
			Static131.aByteArrayArray10[Static71.anInt1906] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}
}
