import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public static int anInt4536;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!u;")
	public static Class76 aClass76_136;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1584 = Static49.method1293("wave2:");

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1586 = Static49.method1293("Error loading your profile)3");

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1585 = aClass70_1586;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public static int anInt4537 = 0;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1587 = Static49.method1293("sl_flags");

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1588 = aClass70_1584;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1589 = Static49.method1293("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1590 = aClass70_1584;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public static void method3493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub12 local12 = Static121.method2473(arg0);
		@Pc(15) int local15 = local12.anInt2708;
		@Pc(18) int local18 = local12.anInt2713;
		@Pc(21) int local21 = local12.anInt2714;
		@Pc(28) int local28 = Class1_Sub21.anIntArray359[local18 - local21];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local21;
		Static133.anIntArray330[local15] = arg1 << local21 & local28 | Static133.anIntArray330[local15] & ~local28;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lclient!rf;")
	public static Class70 method3494(@OriginalArg(1) int arg0) {
		@Pc(3) Class70 local3 = new Class70();
		local3.anInt3915 = 0;
		local3.aByteArray46 = new byte[arg0];
		return local3;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!u;)V")
	public static void method3495(@OriginalArg(1) Class76 arg0) {
		Static117.aClass76_95 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLclient!ig;)Lclient!rf;")
	public static Class70 method3496(@OriginalArg(1) Class39 arg0) {
		if (Static81.method1836(Static20.method439(arg0)) == 0) {
			return null;
		} else if (arg0.aClass70_775 == null || arg0.aClass70_775.method2919().method2896() == 0) {
			return Static125.aBoolean134 ? Static117.aClass70_1072 : null;
		} else {
			return arg0.aClass70_775;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public static int method3497() {
		return Static138.anInt3623++;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method3498() {
		Static93.anInt2709 = -1;
		Static32.aBoolean47 = false;
		Static166.anInt4305 = 0;
		Static162.anInt4331 = 0;
		Static149.anInt3999 = -1;
		Static181.anInt4516 = -1;
		Static18.anInt491 = 0;
		Static69.anInt2127 = 0;
		Static105.anInt2980 = 0;
		Static131.aClass1_Sub9_Sub1_3.anInt1592 = 0;
		Static98.anInt2835 = -1;
		Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
		Static6.anInt276 = 0;
		for (@Pc(39) int local39 = 0; local39 < Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1.length; local39++) {
			if (Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local39] != null) {
				Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local39].anInt2050 = -1;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1.length; local61++) {
			if (Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local61] != null) {
				Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local61].anInt2050 = -1;
			}
		}
		Static66.method1542();
		Static77.method1751(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static161.aBooleanArray18[local84] = true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public static void method3500() {
		aClass76_136 = null;
		aClass70_1590 = null;
		aClass70_1586 = null;
		aClass70_1585 = null;
		aClass70_1588 = null;
		aClass70_1589 = null;
		aClass70_1587 = null;
		aClass70_1584 = null;
	}
}
