import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	public static int anInt1968;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!rc;")
	public static Class74 aClass74_59 = new Class74(64);

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt1951 = -2;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!lf;")
	private static Class49 aClass49_948 = Static32.method683("Loading interfaces )2 ");

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_949 = aClass49_948;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!lf;")
	private static Class49 aClass49_953 = Static32.method683("Too many connections from your address)3");

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!lf;")
	public static Class49 aClass49_950 = aClass49_953;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!lf;")
	private static Class49 aClass49_951 = Static32.method683("Malformed login packet)3");

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_952 = aClass49_951;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!lf;")
	public static Class49 aClass49_954 = Static32.method683(")1j");

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!ja;")
	public static Class2_Sub13 aClass2_Sub13_2 = new Class2_Sub13(8);

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!lf;")
	public static Class49 aClass49_955 = Static32.method683("Spieler");

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	public static void method1591() {
		aClass49_948 = null;
		aClass74_59 = null;
		aClass49_949 = null;
		aClass49_953 = null;
		aClass49_955 = null;
		aClass49_952 = null;
		aClass49_950 = null;
		aClass49_951 = null;
		aClass49_954 = null;
		aClass2_Sub13_2 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
	public static void method1592(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static175.anInt3799; local18++) {
			if (arg0 == Static96.aLongArray12[local18]) {
				Static175.anInt3799--;
				for (@Pc(32) int local32 = local18; local32 < Static175.anInt3799; local32++) {
					Static101.aClass49Array14[local32] = Static101.aClass49Array14[local32 + 1];
					Static85.anIntArray188[local32] = Static85.anIntArray188[local32 + 1];
					Static96.aLongArray12[local32] = Static96.aLongArray12[local32 + 1];
					Static126.anIntArray261[local32] = Static126.anIntArray261[local32 + 1];
				}
				Static95.anInt2012 = Static69.anInt1431;
				Static176.aClass2_Sub13_Sub1_14.method2976(238);
				Static176.aClass2_Sub13_Sub1_14.method2956(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ja;II)Lclient!lf;")
	public static Class49 method1598(@OriginalArg(0) Class2_Sub13 arg0) {
		try {
			@Pc(7) Class49 local7 = new Class49();
			local7.anInt2058 = arg0.method2924();
			if (local7.anInt2058 > 32767) {
				local7.anInt2058 = 32767;
			}
			local7.aByteArray28 = new byte[local7.anInt2058];
			arg0.anInt3940 += Static18.aClass3_1.method55(local7.aByteArray28, arg0.anInt3940, local7.anInt2058, arg0.aByteArray49, 0);
			return local7;
		} catch (@Pc(46) Exception local46) {
			return Static54.aClass49_599;
		}
	}
}
