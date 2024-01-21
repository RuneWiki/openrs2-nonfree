import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!ga;")
	public static Class30 aClass30_34;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_9;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static int anInt2523;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
	public static int[] anIntArray313 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	public static int anInt2515 = 0;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!ed;")
	private static Class23 aClass23_971 = Static169.method2903("Prepared sound engine");

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_969 = aClass23_971;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[5];

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "Lclient!ed;")
	private static Class23 aClass23_976 = Static169.method2903("Please try using a different world)3");

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_970 = aClass23_976;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "[I")
	public static int[] anIntArray314 = new int[25];

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
	public static int anInt2524 = 0;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	public static int anInt2527 = 0;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_972 = aClass23_976;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!ed;")
	public static Class23 aClass23_973 = aClass23_976;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "Lclient!ed;")
	public static Class23 aClass23_974 = aClass23_976;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "Lclient!ed;")
	public static Class23 aClass23_975 = aClass23_976;

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "Lclient!ed;")
	public static Class23 aClass23_977 = aClass23_976;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method1675() {
		Static133.aClass79_21.method2659();
		Static115.aClass79_18.method2659();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z")
	public static boolean method1676(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method1678() {
		if (Static129.aClass35_1 != null) {
			@Pc(8) Class35 local8 = Static129.aClass35_1;
			synchronized (Static129.aClass35_1) {
				Static129.aClass35_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
	public static int method1680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(27) int local27 = arg1 & 0x7F;
		@Pc(29) int local29 = arg2;
		if (arg2 < 3 && (Static12.aByteArrayArrayArray11[1][local7][local11] & 0x2) == 2) {
			local29 = arg2 + 1;
		}
		@Pc(48) int local48 = arg0 & 0x7F;
		@Pc(82) int local82 = Static141.anIntArrayArrayArray3[local29][local7 + 1][local11] * local27 + Static141.anIntArrayArrayArray3[local29][local7][local11] * (128 - local27) >> 7;
		@Pc(112) int local112 = local27 * Static141.anIntArrayArrayArray3[local29][local7 + 1][local11 + 1] + (128 - local27) * Static141.anIntArrayArrayArray3[local29][local7][local11 - -1] >> 7;
		return local82 * (128 - local48) + local48 * local112 >> 7;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public static void method1681() {
		aClass23_972 = null;
		aBooleanArray13 = null;
		aClass30_34 = null;
		aClass23_973 = null;
		aClass23_969 = null;
		aClass23_971 = null;
		aClass30_Sub1_9 = null;
		aClass23_970 = null;
		anIntArray314 = null;
		aClass23_977 = null;
		aClass23_976 = null;
		aClass23_974 = null;
		anIntArray313 = null;
		aFont1 = null;
		aClass23_975 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)V")
	public static void method1683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static38.anInt1035 != 0 && arg0 != -1) {
			Static181.method3134(arg0, Static38.anInt1035, Static72.aClass30_Sub1_7, 0);
			Static37.aBoolean48 = true;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ed;Lclient!ed;Lclient!ga;Lclient!ga;B)Lclient!wc;")
	public static Class1_Sub1_Sub12_Sub3_Sub1 method1684(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) Class30 arg3) {
		@Pc(4) int local4 = arg2.method1281(arg0);
		@Pc(19) int local19 = arg2.method1296(arg1, local4);
		return Static182.method3158(arg2, local19, arg3, local4);
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
	public static void method1685() {
		if (Static143.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static104.anIntArray359[192] = 58;
			Static104.anIntArray359[189] = 26;
			Static104.anIntArray359[220] = 74;
			Static104.anIntArray359[219] = 42;
			Static104.anIntArray359[186] = 57;
			Static104.anIntArray359[187] = 27;
			Static104.anIntArray359[188] = 71;
			Static104.anIntArray359[191] = 73;
			Static104.anIntArray359[223] = 28;
			Static104.anIntArray359[190] = 72;
			Static104.anIntArray359[222] = 59;
			Static104.anIntArray359[221] = 43;
			return;
		}
		Static104.anIntArray359[91] = 42;
		Static104.anIntArray359[59] = 57;
		Static104.anIntArray359[46] = 72;
		if (Static143.aMethod2 == null) {
			Static104.anIntArray359[222] = 59;
			Static104.anIntArray359[192] = 58;
		} else {
			Static104.anIntArray359[520] = 59;
			Static104.anIntArray359[192] = 28;
			Static104.anIntArray359[222] = 58;
		}
		Static104.anIntArray359[44] = 71;
		Static104.anIntArray359[93] = 43;
		Static104.anIntArray359[47] = 73;
		Static104.anIntArray359[61] = 27;
		Static104.anIntArray359[45] = 26;
		Static104.anIntArray359[92] = 74;
	}
}
