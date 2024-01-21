import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!k;")
	public static Class33 aClass33_33;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_12;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!ge;")
	public static Class21 aClass21_29 = new Class21(260);

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_893 = Static24.method441("_");

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!wb;")
	private static Class65 aClass65_894 = Static24.method441("Add ignore");

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!wb;")
	private static Class65 aClass65_902 = Static24.method441("Loading textures )2 ");

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_895 = aClass65_902;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public static int anInt1972 = 0;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!wb;")
	private static Class65 aClass65_897 = Static24.method441("Loaded config");

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_896 = aClass65_897;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public static int anInt1974 = 0;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!wb;")
	private static Class65 aClass65_898 = Static24.method441("skill)2");

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!wb;")
	private static Class65 aClass65_900 = Static24.method441("Loading ignore list");

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!wb;")
	public static Class65 aClass65_899 = aClass65_900;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_901 = aClass65_894;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!wb;")
	private static Class65 aClass65_903 = Static24.method441("wave2:");

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_904 = aClass65_903;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	public static int anInt1977 = -1;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "Lclient!wb;")
	public static Class65 aClass65_905 = Static24.method441("titlebox");

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "Lclient!wb;")
	public static Class65 aClass65_906 = aClass65_898;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ga;Z)V")
	public static synchronized void method1173(@OriginalArg(0) Class2_Sub10 arg0) {
		Static60.aClass2_Sub10_1 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
	public static synchronized void method1174() {
		if (Static60.aClass2_Sub10_1 != null) {
			Static60.aClass2_Sub10_1.method1669(256);
		}
		Static18.method1553(256);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)V")
	public static void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static61.anIntArrayArrayArray6[arg0][local3 + arg2][local7 + arg1] = 0;
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static61.anIntArrayArrayArray6[arg0][arg2][arg1 + local7] = Static61.anIntArrayArrayArray6[arg0][arg2 - 1][local7 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static61.anIntArrayArrayArray6[arg0][local7 + arg2][arg1] = Static61.anIntArrayArrayArray6[arg0][local7 + arg2][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static61.anIntArrayArrayArray6[arg0][arg2 - 1][arg1] != 0) {
			Static61.anIntArrayArrayArray6[arg0][arg2][arg1] = Static61.anIntArrayArrayArray6[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static61.anIntArrayArrayArray6[arg0][arg2][arg1 - 1] != 0) {
			Static61.anIntArrayArrayArray6[arg0][arg2][arg1] = Static61.anIntArrayArrayArray6[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static61.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static61.anIntArrayArrayArray6[arg0][arg2][arg1] = Static61.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1176() {
		if (Static24.anInt719 < 2 && Static80.anInt2291 == 0 && Static37.anInt1224 == 0) {
			return;
		}
		@Pc(44) Class65 local44;
		if (Static80.anInt2291 == 1 && Static24.anInt719 < 2) {
			local44 = Static13.method282(new Class65[] { Static22.aClass65_311, Static36.aClass65_517, Static99.aClass65_1144, Static104.aClass65_1282 });
		} else if (Static37.anInt1224 == 1 && Static24.anInt719 < 2) {
			local44 = Static13.method282(new Class65[] { Static80.aClass65_1042, Static36.aClass65_517, Static29.aClass65_387, Static104.aClass65_1282 });
		} else {
			local44 = Static89.aClass65Array12[Static24.anInt719 - 1];
		}
		if (Static24.anInt719 > 2) {
			local44 = Static13.method282(new Class65[] { local44, Static106.aClass65_1297, Static93.method1617(Static24.anInt719 - 2), Static79.aClass65_1033 });
		}
		Static38.aClass2_Sub1_Sub4_Sub4_1.method1827(local44, 4, 16777215, Static108.anInt2902 / 1000);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([II)V")
	public static synchronized void method1177(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static60.aClass2_Sub10_1 != null) {
			Static60.aClass2_Sub10_1.method1668(arg0, 0, local2);
		}
		Static18.method1553(local2);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method1181() {
		aClass65_903 = null;
		aClass65_898 = null;
		aClass65_897 = null;
		aClass65_905 = null;
		aClass65_901 = null;
		aClass65_900 = null;
		aClass65_899 = null;
		aClass2_Sub1_Sub4_Sub2_12 = null;
		aClass65_895 = null;
		aClass65_902 = null;
		aClass65_894 = null;
		aClass33_33 = null;
		aClass65_904 = null;
		aClass21_29 = null;
		aClass65_896 = null;
		aClass65_906 = null;
		aClass65_893 = null;
	}
}
