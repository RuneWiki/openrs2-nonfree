import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!of", name = "db", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!of", name = "Kb", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array73;

	@OriginalMember(owner = "client!of", name = "Ob", descriptor = "Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_13;

	@OriginalMember(owner = "client!of", name = "Ub", descriptor = "I")
	public static int anInt2250;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "Lclient!je;")
	private static Class40 aClass40_1159 = Static69.method1231("button near the top of that page)3");

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_1160 = aClass40_1159;

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!of", name = "nb", descriptor = "[I")
	public static int[] anIntArray246 = new int[128];

	@OriginalMember(owner = "client!of", name = "pb", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!of", name = "sb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1162 = Static69.method1231("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!of", name = "wb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1163 = Static69.method1231("<col=00ff00>");

	@OriginalMember(owner = "client!of", name = "Db", descriptor = "I")
	public static int anInt2237 = 0;

	@OriginalMember(owner = "client!of", name = "Lb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1164 = Static69.method1231("AUS");

	@OriginalMember(owner = "client!of", name = "ac", descriptor = "Lclient!je;")
	public static Class40 aClass40_1165 = Static69.method1231("event_opbase");

	@OriginalMember(owner = "client!of", name = "bc", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1 = new Class49();

	@OriginalMember(owner = "client!of", name = "ic", descriptor = "I")
	public static int anInt2259 = 0;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	public static void method1571() {
		Static57.aClass2_Sub9_Sub1_2.anInt976 = 0;
		Static58.anInt1520 = 0;
		Static39.anInt1057 = -1;
		Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
		Static1.anInt9 = 0;
		Static116.anInt2705 = -1;
		Static57.anInt1500 = 0;
		Static8.aBoolean21 = false;
		Static130.anInt3009 = 0;
		Static27.anInt680 = 0;
		Static15.anInt297 = -1;
		Static66.anInt1743 = 0;
		Static35.anInt825 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2.length; local35++) {
			if (Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local35] != null) {
				Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local35].anInt1815 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1.length; local53++) {
			if (Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local53] != null) {
				Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local53].anInt1815 = -1;
			}
		}
		Static28.method437();
		Static21.method402(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static64.aBooleanArray17[local84] = true;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!fd;BLclient!fd;I)Lclient!oe;")
	public static Class2_Sub1_Sub2_Sub3_Sub1 method1572(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) int arg3) {
		return Static125.method2076(arg1, arg3, arg0) ? Static36.method667(arg2.method1931(arg3, arg0)) : null;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	public static void method1577() {
		aClass49_1 = null;
		aClass40_1159 = null;
		aBooleanArray21 = null;
		aClass2_Sub1_Sub2_Sub1_13 = null;
		aBooleanArray22 = null;
		aClass40_1163 = null;
		aClass2_Sub1_Sub2_Sub1Array73 = null;
		aClass40_1162 = null;
		anIntArray245 = null;
		aClass40_1160 = null;
		aClass40_1164 = null;
		aClass40_1165 = null;
		anIntArray246 = null;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)I")
	public static int method1581(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(29) int local29 = (local19 >>> 2 & 0x73333333) + (local19 & 0x33333333);
		@Pc(38) int local38 = local29 + (local29 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
