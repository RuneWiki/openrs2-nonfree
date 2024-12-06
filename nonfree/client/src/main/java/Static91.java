import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
	public static int anInt2416 = 0;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "Lclient!ec;")
	public static JagString aClass22_702 = Static60.method1113("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
	public static int anInt2418 = 0;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[I")
	public static int[] anIntArray275 = new int[5];

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "Lclient!ec;")
	public static JagString aClass22_703 = Static60.method1113("<br>(X100(U(Y");

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "Lclient!ec;")
	public static JagString aClass22_704 = Static60.method1113("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
	public static void method1589() {
		Static38.aClass4_Sub11_Sub1_1.method752(113);
		for (@Pc(23) ComponentPointer local23 = (ComponentPointer) Static90.aClass81_11.method2017(); local23 != null; local23 = (ComponentPointer) Static90.aClass81_11.method2013()) {
			if (local23.anInt2946 == 0 || local23.anInt2946 == 3) {
				Static112.method1794(true, local23);
			}
		}
		if (Static43.aClass4_Sub7_9 != null) {
			Static110.method1772(Static43.aClass4_Sub7_9);
			Static43.aClass4_Sub7_9 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
	public static void method1590() {
		Static79.anInt2177 = 0;
		@Pc(18) int local18 = (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 >> 7) + Static59.anInt1769;
		@Pc(25) int local25 = (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 >> 7) + Static98.anInt2584;
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static79.anInt2177 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static79.anInt2177 = 1;
		}
		if (Static79.anInt2177 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static79.anInt2177 = 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
	public static void method1591() {
		aClass22_703 = null;
		aClass22_702 = null;
		anIntArray275 = null;
		aClass22_704 = null;
	}
}
