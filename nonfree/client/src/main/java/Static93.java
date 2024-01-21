import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!e;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt2154 = 1;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_969 = Static134.method2017("Konfig geladen)3");

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!v;")
	private static Class76 aClass76_970 = Static134.method2017("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!q", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_971 = Static134.method2017("headicons_pk");

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_972 = aClass76_970;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "[I")
	public static int[] anIntArray305 = new int[200];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method1500() {
		aClass76_970 = null;
		anIntArray305 = null;
		aClass76_972 = null;
		aClass20_1 = null;
		aClass76_971 = null;
		aClass76_969 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method1501() {
		if (Static39.anInt1120 > 0) {
			Static20.method303();
		} else {
			Static73.method1363(40);
			Static79.aClass75_3 = Static48.aClass75_4;
			Static48.aClass75_4 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method1502() {
		while (true) {
			if (Static24.aClass4_Sub10_Sub1_1.method609(Static30.anInt1437) >= 11) {
				@Pc(20) int local20 = Static24.aClass4_Sub10_Sub1_1.method608(11);
				if (local20 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local20] == null) {
						Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local20] = new Class4_Sub4_Sub3_Sub1_Sub2();
						if (Static73.aClass4_Sub10Array1[local20] != null) {
							Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local20].method977(Static73.aClass4_Sub10Array1[local20]);
						}
						local25 = true;
					}
					Static113.anIntArray348[Static106.anInt2357++] = local20;
					@Pc(63) Class4_Sub4_Sub3_Sub1_Sub2 local63 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local20];
					local63.anInt1391 = Static78.anInt1981;
					@Pc(71) int local71 = Static24.aClass4_Sub10_Sub1_1.method608(1);
					@Pc(76) int local76 = Static24.aClass4_Sub10_Sub1_1.method608(5);
					@Pc(85) int local85 = Static98.anIntArray319[Static24.aClass4_Sub10_Sub1_1.method608(3)];
					if (local76 > 15) {
						local76 -= 32;
					}
					if (local25) {
						local63.anInt1409 = local63.anInt1395 = local85;
					}
					@Pc(102) int local102 = Static24.aClass4_Sub10_Sub1_1.method608(5);
					if (local102 > 15) {
						local102 -= 32;
					}
					@Pc(113) int local113 = Static24.aClass4_Sub10_Sub1_1.method608(1);
					if (local113 == 1) {
						Static60.anIntArray201[Static48.anInt1228++] = local20;
					}
					local63.method967(local71 == 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0] + local76, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0] - -local102);
					continue;
				}
			}
			Static24.aClass4_Sub10_Sub1_1.method606();
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
	public static void method1503() {
		Static19.anIntArray132 = new int[33];
		Static67.anIntArray233 = new int[33];
		Static125.anIntArray394 = new int[151];
		Static92.anIntArray304 = new int[151];
		@Pc(21) int local21;
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < 33; local15++) {
			@Pc(19) int local19 = 999;
			local21 = 0;
			for (local23 = 0; local23 < 34; local23++) {
				if (Static65.aClass4_Sub4_Sub5_Sub4_2.aByteArray69[local15 * Static65.aClass4_Sub4_Sub5_Sub4_2.anInt2607 + local23] == 0) {
					if (local19 == 999) {
						local19 = local23;
					}
				} else if (local19 != 999) {
					local21 = local23;
					break;
				}
			}
			Static19.anIntArray132[local15] = local19;
			Static67.anIntArray233[local15] = local21 - local19;
		}
		for (local21 = 5; local21 < 156; local21++) {
			local23 = 999;
			@Pc(81) int local81 = 0;
			for (@Pc(83) int local83 = 25; local83 < 172; local83++) {
				if (Static65.aClass4_Sub4_Sub5_Sub4_2.aByteArray69[local83 + Static65.aClass4_Sub4_Sub5_Sub4_2.anInt2607 * local21] == 0 && (local83 > 34 || local21 > 34)) {
					if (local23 == 999) {
						local23 = local83;
					}
				} else if (local23 != 999) {
					local81 = local83;
					break;
				}
			}
			Static125.anIntArray394[local21 - 5] = local23 - 25;
			Static92.anIntArray304[local21 - 5] = local81 - local23;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZZZ)I")
	public static int method1504() {
		return Static59.anInt1537 + Static121.anInt2620;
	}
}
