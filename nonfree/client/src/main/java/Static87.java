import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
	public static int anInt2058;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_18;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "Lclient!pd;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lclient!o;")
	public static Class40 aClass40_600 = Static13.method257("Last password change:*6n@gre@Never changed");

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lclient!o;")
	public static Class40 aClass40_601 = null;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	private static void method1396() {
		Static7.aClass45_5.method1476();
		Static15.aClass2_Sub2_Sub2_Sub3_19.method1320(0, 0);
		Static3.anIntArray4 = Static6.method175(Static3.anIntArray4);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ob;I)V")
	public static void method1397(@OriginalArg(0) Class42 arg0) {
		Static97.aClass42_1 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
	public static void method1398() {
		aClass5_Sub1_18 = null;
		aClass40_601 = null;
		aClass40_600 = null;
		aClass18_1 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!bb;Z)Z")
	public static boolean method1400(@OriginalArg(2) Class7 arg0, @OriginalArg(3) boolean arg1) {
		return Static30.method585(arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
	public static void method1401() {
		Static5.aBoolean13 = true;
		method1396();
		@Pc(29) boolean local29;
		if (Static66.anInt1654 != -1) {
			local29 = Static21.method403(0, -1, Static66.anInt1654, 1, 0, 261, 0, 190);
			if (!local29) {
				Static33.aBoolean59 = true;
			}
		} else if (Static2.anIntArray2[Static62.anInt1551] != -1) {
			local29 = Static21.method403(0, -1, Static2.anIntArray2[Static62.anInt1551], 1, 0, 261, 0, 190);
			if (!local29) {
				Static33.aBoolean59 = true;
			}
		}
		if (Static97.aBoolean175 && Static1.anInt16 == 1) {
			Static23.method480();
		}
		Static73.method1207(Static24.aGraphics1);
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
	public static void method1402() {
		Static19.aClass47_4.method1330();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[Lclient!o;)[Lclient!o;")
	public static Class40[] method1404(@OriginalArg(1) Class40[] arg0) {
		@Pc(4) Class40[] local4 = new Class40[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local4[local15] = Static80.method1334(new Class40[] { Static53.method859(local15), Static1.aClass40_4 });
			if (arg0 != null && arg0[local15] != null) {
				local4[local15] = Static80.method1334(new Class40[] { local4[local15], arg0[local15] });
			}
		}
		return local4;
	}
}
