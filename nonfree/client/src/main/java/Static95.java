import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!sb", name = "ac", descriptor = "Lclient!bb;")
	public static Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!sb", name = "jc", descriptor = "Z")
	public static boolean aBoolean122;

	@OriginalMember(owner = "client!sb", name = "mc", descriptor = "Lclient!sd;")
	public static Class2 aClass2_20;

	@OriginalMember(owner = "client!sb", name = "nc", descriptor = "I")
	public static int anInt2467;

	@OriginalMember(owner = "client!sb", name = "Tb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1117 = Static56.method972("glow1:");

	@OriginalMember(owner = "client!sb", name = "Ub", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1118 = Static56.method972("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!sb", name = "Vb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1119 = aClass5_1117;

	@OriginalMember(owner = "client!sb", name = "Xb", descriptor = "Lclient!sb;")
	public static Class3_Sub6_Sub1 aClass3_Sub6_Sub1_3 = new Class3_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!sb", name = "Yb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1120 = Static56.method972("@lre@");

	@OriginalMember(owner = "client!sb", name = "cc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1121 = Static56.method972("redstone3");

	@OriginalMember(owner = "client!sb", name = "ec", descriptor = "[I")
	public static int[] anIntArray274 = new int[50];

	@OriginalMember(owner = "client!sb", name = "gc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1122 = Static56.method972("null");

	@OriginalMember(owner = "client!sb", name = "ic", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1123 = Static56.method972("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!sb", name = "lc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1124 = Static56.method972("b12_full");

	@OriginalMember(owner = "client!sb", name = "qc", descriptor = "I")
	public static int anInt2470 = 0;

	@OriginalMember(owner = "client!sb", name = "sc", descriptor = "Lclient!bd;")
	public static Class9 aClass9_23 = new Class9(64);

	@OriginalMember(owner = "client!sb", name = "tc", descriptor = "I")
	public static int anInt2472 = 0;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(Z)V")
	public static void method1642() {
		aClass3_Sub1_Sub2_Sub1_4 = null;
		aClass5_1124 = null;
		aClass2_20 = null;
		anIntArray274 = null;
		aClass5_1123 = null;
		aClass3_Sub6_Sub1_3 = null;
		aClass5_1117 = null;
		aClass9_23 = null;
		aClass5_1120 = null;
		aClass5_1118 = null;
		aClass5_1122 = null;
		aClass5_1119 = null;
		aClass5_1121 = null;
	}

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "(I)V")
	public static void method1643() {
		Static3.aClass9_3.method283();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZIII)Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = (long) arg0 + ((long) arg3 << 16) + ((long) arg4 << 38) + ((long) arg1 << 40);
		@Pc(32) Class3_Sub1_Sub2_Sub3 local32;
		if (!arg2) {
			local32 = (Class3_Sub1_Sub2_Sub3) Static19.aClass9_8.method282(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class3_Sub1_Sub3 local40 = Static37.method694(arg0);
		if (arg3 > 1 && local40.anIntArray73 != null) {
			@Pc(48) int local48 = -1;
			for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
				if (local40.anIntArray71[local50] <= arg3 && local40.anIntArray71[local50] != 0) {
					local48 = local40.anIntArray73[local50];
				}
			}
			if (local48 != -1) {
				local40 = Static37.method694(local48);
			}
		}
		@Pc(95) Class3_Sub1_Sub1_Sub6 local95 = local40.method425(1, true);
		if (local95 == null) {
			return null;
		}
		@Pc(101) Class3_Sub1_Sub2_Sub3 local101 = null;
		if (local40.anInt657 != -1) {
			local101 = method1644(local40.anInt666, 0, true, 10, 1);
			if (local101 == null) {
				return null;
			}
		}
		@Pc(121) int[] local121 = Static66.anIntArray363;
		@Pc(123) int local123 = Static66.anInt2804;
		@Pc(125) int local125 = Static66.anInt2805;
		@Pc(132) int local132 = Static66.anInt2806;
		@Pc(134) int local134 = Static66.anInt2807;
		@Pc(136) int local136 = Static66.anInt2803;
		@Pc(138) int local138 = Static66.anInt2802;
		@Pc(140) int[] local140 = Static25.method511();
		@Pc(142) int local142 = Static25.anInt782;
		@Pc(144) int local144 = Static25.anInt784;
		local32 = new Class3_Sub1_Sub2_Sub3(36, 32);
		Static66.method1838(local32.anIntArray237, 36, 32);
		Static101.anIntArray296 = Static25.method507(Static101.anIntArray296);
		Static66.method1839(0, 0, 36, 32, 0);
		Static25.aBoolean39 = false;
		Static25.method509(16, 16);
		@Pc(172) int local172 = local40.anInt664;
		if (arg2) {
			local172 = (int) ((double) local172 * 1.5D);
		} else if (arg4 == 2) {
			local172 = (int) ((double) local172 * 1.04D);
		}
		@Pc(200) int local200 = Class3_Sub1_Sub2_Sub2.anIntArray98[local40.anInt683] * local172 >> 16;
		@Pc(209) int local209 = Class3_Sub1_Sub2_Sub2.anIntArray101[local40.anInt683] * local172 >> 16;
		local95.method1800();
		local95.method1807(local40.anInt689, local40.anInt670, local40.anInt683, local40.anInt685, local209 + local95.anInt2758 / 2 + local40.anInt668, local40.anInt668 + local200);
		if (arg4 >= 1) {
			local32.method1450(1);
		}
		if (arg4 >= 2) {
			local32.method1450(16777215);
		}
		if (arg1 != 0) {
			local32.method1439(arg1);
		}
		Static66.method1838(local32.anIntArray237, 36, 32);
		if (local40.anInt657 != -1) {
			local101.method1437(0, 0);
		}
		if (!arg2 && (local40.anInt676 == 1 || arg3 != 1) && arg3 != -1) {
			aClass3_Sub1_Sub2_Sub1_4.method277(Static73.method1214(arg3), 1, 10, 1);
			aClass3_Sub1_Sub2_Sub1_4.method277(Static73.method1214(arg3), 0, 9, 16776960);
		}
		if (!arg2) {
			Static19.aClass9_8.method284(local32, local24);
		}
		Static66.method1838(local121, local123, local125);
		Static66.method1847(local134, local136, local132, local138);
		Static25.method507(local140);
		Static25.anInt784 = local144;
		Static25.anInt782 = local142;
		Static25.method504();
		Static25.aBoolean39 = true;
		return local32;
	}
}
