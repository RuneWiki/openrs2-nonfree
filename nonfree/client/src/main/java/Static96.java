import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "Lclient!jd;")
	public static Class34 aClass34_6;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
	public static int anInt2558;

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array46;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
	public static int anInt2559;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
	public static int anInt2561;

	@OriginalMember(owner = "client!sd", name = "ob", descriptor = "Lclient!ta;")
	public static Class14 aClass14_31;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1230 = Static14.method2017("Please try using a different world)3");

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1239 = Static14.method2017("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1231 = aClass36_1239;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1232 = aClass36_1230;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1233 = aClass36_1230;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
	public static int anInt2557 = 0;

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1234 = aClass36_1230;

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1235 = Static14.method2017("@lre@");

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1236 = Static14.method2017("Bad session id)3");

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1237 = aClass36_1236;

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1238 = aClass36_1230;

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1240 = aClass36_1230;

	@OriginalMember(owner = "client!sd", name = "vb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1242 = Static14.method2017("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!sd", name = "ub", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1241 = aClass36_1242;

	@OriginalMember(owner = "client!sd", name = "xb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1243 = aClass36_1230;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)I")
	public static int method1806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub13 local8 = (Class2_Sub13) Static66.aClass31_3.method905((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(30) int local30 = 0; local30 < local8.anIntArray248.length; local30++) {
				if (local8.anIntArray249[local30] == arg1) {
					local23 += local8.anIntArray248[local30];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
	public static void method1808() {
		aClass36_1233 = null;
		aClass36_1234 = null;
		aClass36_1235 = null;
		aClass34_6 = null;
		aClass36_1243 = null;
		aClass36_1237 = null;
		aClass36_1242 = null;
		aClass36_1239 = null;
		aClass36_1240 = null;
		aClass36_1241 = null;
		aClass2_Sub1_Sub1_Sub1Array46 = null;
		aClass14_31 = null;
		aClass36_1231 = null;
		aClass36_1236 = null;
		aClass36_1238 = null;
		aClass36_1230 = null;
		aClass36_1232 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!wd;BI)Lclient!kc;")
	public static Class36 method1810(@OriginalArg(0) Class2_Sub12 arg0) {
		try {
			@Pc(7) Class36 local7 = new Class36();
			local7.anInt1442 = arg0.method1397();
			if (local7.anInt1442 > 32767) {
				local7.anInt1442 = 32767;
			}
			local7.aByteArray9 = new byte[local7.anInt1442];
			arg0.anInt1939 += Static79.aClass18_1.method494(local7.anInt1442, local7.aByteArray9, arg0.anInt1939, arg0.aByteArray20, 0);
			return local7;
		} catch (@Pc(56) Exception local56) {
			return Static23.aClass36_317;
		}
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V")
	public static void method1811() {
		Static105.aClass22_38.method716();
	}
}
