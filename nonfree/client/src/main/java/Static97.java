import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 aClass5_Sub2_Sub1_Sub4_6;

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "Lclient!ff;")
	public static Class26 aClass26_21;

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
	public static int anInt2547 = 0;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "Lclient!qb;")
	public static Class58 aClass58_57 = new Class58();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "Lclient!r;")
	public static Class61 aClass61_755 = Static129.method2060(" <col=ffffff>");

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lclient!r;")
	public static Class61 aClass61_756 = Static129.method2060("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lclient!r;")
	public static Class61 aClass61_757 = Static129.method2060(":assistreq:");

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "Lclient!ef;")
	public static Class20 aClass20_9 = new Class20(512);

	@OriginalMember(owner = "client!qa", name = "gb", descriptor = "Lclient!r;")
	private static Class61 aClass61_760 = Static129.method2060("flash2:");

	@OriginalMember(owner = "client!qa", name = "eb", descriptor = "Lclient!r;")
	public static Class61 aClass61_758 = aClass61_760;

	@OriginalMember(owner = "client!qa", name = "fb", descriptor = "Lclient!r;")
	public static Class61 aClass61_759 = aClass61_760;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method1655() {
		if (!Static117.aBoolean105) {
			Static36.anInt1015 = 1;
			Static123.aClass61Array23[0] = Static76.aClass61_572;
			Static38.anIntArray223[0] = 1005;
			Static107.aClass61Array19[0] = Static96.aClass61_746;
		}
		if (Static44.anInt1133 != -1) {
			Static43.method768(Static44.anInt1133);
		}
		for (@Pc(30) int local30 = 0; local30 < Static129.anInt3251; local30++) {
			if (Static48.aBooleanArray5[local30]) {
				Static60.aBooleanArray8[local30] = true;
			}
			Static36.aBooleanArray4[local30] = Static48.aBooleanArray5[local30];
			Static48.aBooleanArray5[local30] = false;
		}
		Static123.anInt3069 = Static58.anInt1422;
		Static72.anInt1990 = -1;
		Static21.aClass5_Sub11_2 = null;
		Static13.anInt369 = -1;
		if (Static44.anInt1133 != -1) {
			Static129.anInt3251 = 0;
			Static76.method1229(765, Static44.anInt1133, 0, 503, 0, 0, 0, -1);
		}
		Static46.method2000();
		Static1.method3();
		if (Static117.aBoolean105) {
			Static89.method1570();
		} else if (Static72.anInt1990 != -1) {
			Static119.method1901(Static72.anInt1990, Static13.anInt369);
		}
		if (Static66.anInt1591 == 3) {
			for (@Pc(109) int local109 = 0; local109 < Static129.anInt3251; local109++) {
				if (Static36.aBooleanArray4[local109]) {
					Static46.method1993(Static82.anIntArray288[local109], Static40.anIntArray176[local109], Static56.anIntArray209[local109], Static81.anIntArray444[local109], 16711935, 128);
				} else if (Static60.aBooleanArray8[local109]) {
					Static46.method1993(Static82.anIntArray288[local109], Static40.anIntArray176[local109], Static56.anIntArray209[local109], Static81.anIntArray444[local109], 16711680, 128);
				}
			}
		}
		Static12.method242(Static8.anInt198, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875, Static93.anInt2428, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912);
		Static8.anInt198 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method1656() {
		aClass61_757 = null;
		aClass61_755 = null;
		aClass61_756 = null;
		aClass58_57 = null;
		aClass5_Sub2_Sub1_Sub4_6 = null;
		aClass61_760 = null;
		aClass20_9 = null;
		aClass61_759 = null;
		aClass26_21 = null;
		aClass61_758 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ea;IZ)V")
	public static void method1657(@OriginalArg(0) Class5_Sub2_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static58.method1016(arg0.anInt2912, arg0.anInt2875, arg1);
	}
}
