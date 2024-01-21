import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 aClass4_Sub1_Sub7_Sub2_2;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "Lclient!nh;")
	public static Class62 aClass62_24;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "Lclient!nh;")
	public static Class62 aClass62_25;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_36 = new Class66(30);

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_847 = Static177.method3050("_");

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Lclient!db;")
	public static final Class20 aClass20_3 = new Class20(4096);

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_848 = Static177.method3050("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_849 = Static177.method3050("::fpsoff");

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_850 = Static177.method3050("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_851 = Static177.method3050("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "[Lclient!rf;")
	public static final Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array7 = new Class4_Sub1_Sub7_Sub2[1000];

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "[I")
	public static final int[] anIntArray223 = new int[50];

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "[I")
	public static final int[] anIntArray224 = new int[25];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLclient!kg;Z)V")
	public static void method1801(@OriginalArg(1) Class4_Sub14 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt2450;
		@Pc(10) int local10 = (int) arg0.aLong148;
		arg0.method3173();
		if (arg1) {
			Static76.method3019(local6);
		}
		Static85.method1707(local6);
		@Pc(25) Class1 local25 = Static154.method3136(local10);
		if (local25 != null) {
			Static3.method21(local25);
		}
		Static64.aBoolean76 = false;
		Static3.anInt86 = 0;
		Static149.method2557(Static185.anInt4084, Static9.anInt327, Static163.anInt3720, Static148.anInt3380);
		if (Static174.anInt3902 != -1) {
			Static73.method1504(Static174.anInt3902, 1);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)I")
	public static int method1802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(24) int local24 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local24;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
	public static void method1803() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt3222; local1++) {
			for (local4 = 0; local4 < Static57.anInt1408; local4++) {
				for (local7 = 0; local7 < Static84.anInt4112; local7++) {
					Static28.aClass4_Sub7ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static30.anInt764; local4++) {
			for (local7 = 0; local7 < Static30.anIntArray65[local4]; local7++) {
				Static30.aClass8ArrayArray1[local4][local7] = null;
			}
			Static30.anIntArray65[local4] = 0;
		}
		for (local7 = 0; local7 < Static111.anInt2730; local7++) {
			Static82.aClass86Array4[local7] = null;
		}
		Static111.anInt2730 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static154.aClass86Array5.length; local69++) {
			Static154.aClass86Array5[local69] = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public static void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static26.anInt647 == 0 || arg1 == 0 || Static57.anInt1406 >= 50 || arg0 == -1) {
			return;
		}
		Static50.anIntArray124[Static57.anInt1406] = arg0;
		Static67.anIntArray168[Static57.anInt1406] = arg1;
		Static186.anIntArray438[Static57.anInt1406] = arg2;
		Static6.aClass13Array1[Static57.anInt1406] = null;
		anIntArray223[Static57.anInt1406] = 0;
		Static57.anInt1406++;
	}
}
