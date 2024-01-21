import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pa", name = "W", descriptor = "Lclient!v;")
	public static Class2_Sub1_Sub9_Sub4 aClass2_Sub1_Sub9_Sub4_25;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array14 = new Class80[100];

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "Lclient!wd;")
	public static Class80 aClass80_852 = Static2.method59("l");

	@OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_855 = Static2.method59("Login");

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "Lclient!wd;")
	public static Class80 aClass80_853 = aClass80_855;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_854 = Static2.method59("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
	public static int anInt2161 = 1;

	@OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
	public static int anInt2162 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public static void method1316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static87.anInt2274 != 0 && arg1 != -1) {
			Static55.method712(Static87.anInt2274, 0, Static37.aClass11_Sub1_9, arg1);
			Static70.aBoolean132 = true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ff;Z)V")
	public static void method1318(@OriginalArg(0) Class11 arg0) {
		Static4.aClass11_3 = arg0;
		Static118.anInt3040 = Static4.aClass11_3.method387(16);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
	public static void method1319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
			for (local19 = 0; local19 < 8; local19++) {
				Static100.anIntArrayArrayArray5[arg0][local15 + arg2][local19 + arg1] = 0;
			}
		}
		if (arg2 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static100.anIntArrayArrayArray5[arg0][arg2][local19 + arg1] = Static100.anIntArrayArrayArray5[arg0][arg2 - 1][local19 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static100.anIntArrayArrayArray5[arg0][arg2 + local19][arg1] = Static100.anIntArrayArrayArray5[arg0][arg2 + local19][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static100.anIntArrayArrayArray5[arg0][arg2 - 1][arg1] != 0) {
			Static100.anIntArrayArrayArray5[arg0][arg2][arg1] = Static100.anIntArrayArrayArray5[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static100.anIntArrayArrayArray5[arg0][arg2][arg1 - 1] != 0) {
			Static100.anIntArrayArrayArray5[arg0][arg2][arg1] = Static100.anIntArrayArrayArray5[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static100.anIntArrayArrayArray5[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static100.anIntArrayArrayArray5[arg0][arg2][arg1] = Static100.anIntArrayArrayArray5[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Lclient!wd;")
	public static Class80 method1320(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static28.method1422(arg0);
		} else if (arg0 < 10000000) {
			return Static93.method1444(new Class80[] { Static28.method1422(arg0 / 1000), Static103.aClass80_1019 });
		} else {
			return Static93.method1444(new Class80[] { Static28.method1422(arg0 / 1000000), Static111.aClass80_1155 });
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	public static void method1322() {
		aClass80_852 = null;
		aClass80_853 = null;
		aClass80_855 = null;
		aClass80_854 = null;
		aClass2_Sub1_Sub9_Sub4_25 = null;
		aClass80Array14 = null;
	}
}
