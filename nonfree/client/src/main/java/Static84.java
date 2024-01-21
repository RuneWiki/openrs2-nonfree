import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	public static int anInt4112;

	@OriginalMember(owner = "client!je", name = "H", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!je", name = "J", descriptor = "I")
	public static int anInt4123;

	@OriginalMember(owner = "client!je", name = "L", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_101;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	public static int anInt4113 = 0;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1506 = Static177.method3050("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
	public static final int[] anIntArray439 = new int[5];

	@OriginalMember(owner = "client!je", name = "x", descriptor = "[J")
	public static final long[] aLongArray50 = new long[200];

	@OriginalMember(owner = "client!je", name = "M", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1507 = Static177.method3050("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "Lclient!a;")
	public static Class1 aClass1_54 = null;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ud;II)V")
	public static void method3153(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static68.aClass4_Sub11_3 == null) {
			Static125.method2223(255, 0, (byte) 0, null, 255, true);
			Static27.aClass62_Sub1Array1[arg1] = arg0;
		} else {
			Static68.aClass4_Sub11_3.anInt1597 = arg1 * 8 + 5;
			@Pc(20) int local20 = Static68.aClass4_Sub11_3.method1263();
			@Pc(24) int local24 = Static68.aClass4_Sub11_3.method1263();
			arg0.method2890(local24, local20);
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	public static void method3154() {
		for (@Pc(7) int local7 = 0; local7 < Static182.anInt4082; local7++) {
			@Pc(13) int local13 = Static121.anIntArray276[local7];
			@Pc(17) Class4_Sub1_Sub1_Sub1_Sub1 local17 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local13];
			@Pc(21) int local21 = Static162.aClass4_Sub11_Sub1_3.method1253();
			if ((local21 & 0x2) != 0) {
				local21 += Static162.aClass4_Sub11_Sub1_3.method1253() << 8;
			}
			Static122.method2202(local21, local17, local13);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Lclient!se;")
	public static Class28 method3160() {
		try {
			return (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class28_Sub2();
		}
	}
}
