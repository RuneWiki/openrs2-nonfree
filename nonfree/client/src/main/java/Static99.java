import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
	public static boolean aBoolean145;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array6;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1257 = Static122.method531("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[[[Lclient!sc;")
	public static Class72[][][] aClass72ArrayArrayArray1 = new Class72[4][104][104];

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt2198 = 0;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Z")
	public static boolean aBoolean146 = true;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1258 = aClass73_1257;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
	public static int[] anIntArray226 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1259 = Static122.method531("Versteckt");

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1260 = Static122.method531("<col=ffff00>*V");

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1261 = Static122.method531("Hidden)2");

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1263 = Static122.method531("Attack");

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1262 = aClass73_1263;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
	public static int method1700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) Static69.aClass16_6.method554((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local12.anIntArray306.length) {
			return local12.anIntArray306[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1707() {
		Static139.aClass3_Sub12_Sub1_3.anInt1793 = 0;
		Static59.anInt2722 = 0;
		Static94.anInt2079 = 0;
		Static17.anInt3783 = 0;
		Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
		Static132.anInt3019 = -1;
		Static101.anInt2290 = -1;
		Static169.aBoolean245 = false;
		Static142.anInt3262 = 0;
		Static144.anInt3454 = -1;
		Static14.anInt354 = 0;
		Static100.anInt2226 = 0;
		Static58.anInt1360 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1.length; local35++) {
			if (Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local35] != null) {
				Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local35].anInt3145 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1.length; local57++) {
			if (Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local57] != null) {
				Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local57].anInt3145 = -1;
			}
		}
		Static26.method553();
		Static78.method1320(30);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static27.aBooleanArray3[local80] = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method1708() {
		anIntArray226 = null;
		aClass73_1262 = null;
		aClass73_1257 = null;
		aClass73_1259 = null;
		aClass73_1258 = null;
		aClass72ArrayArrayArray1 = null;
		aClass73_1260 = null;
		aClass3_Sub1_Sub3_Sub4Array6 = null;
		aClass73_1261 = null;
		aClass73_1263 = null;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	public static void method1709() {
		for (@Pc(3) int local3 = -1; local3 < Static6.anInt158; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static47.anIntArray184[local3];
			}
			@Pc(21) Class3_Sub1_Sub4_Sub7_Sub1 local21 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local11];
			if (local21 != null) {
				Static176.method2727(1, local21);
			}
		}
	}
}
