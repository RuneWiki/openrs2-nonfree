import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
	public static int anInt2156 = 0;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_904 = Static51.method932(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lclient!cd;")
	private static Class10 aClass10_906 = Static51.method932("Drop");

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_905 = aClass10_906;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_907 = Static51.method932("mapfunction");

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][13][13];

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public static void method1542() {
		aClass10_906 = null;
		Class2_Sub2_Sub19.anIntArray224 = null;
		aClass10_907 = null;
		aClass10_904 = null;
		anIntArrayArrayArray4 = null;
		aClass10_905 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!cd;Lclient!kh;ILclient!cd;)Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 method1543(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(13) int local13 = arg1.method1026(arg2);
		@Pc(19) int local19 = arg1.method1020(local13, arg0);
		return Static67.method2100(local13, local19, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBI)I")
	public static int method1544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static102.method2542(arg0 + 45365, arg1 + 91923, 4) + (Static102.method2542(arg0 + 10294, arg1 - -37821, 2) - 128 >> 1) + (Static102.method2542(arg0, arg1, 1) + -128 >> 2) - 128;
		local37 = (int) ((double) local37 * 0.3D) + 35;
		if (local37 < 10) {
			local37 = 10;
		} else if (local37 > 60) {
			local37 = 60;
		}
		return local37;
	}
}
