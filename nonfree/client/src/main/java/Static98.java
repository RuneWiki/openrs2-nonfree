import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!s", name = "A", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1127 = Static63.method1251("Please try using a different world)3");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1122 = aClass45_1127;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1123 = Static63.method1251("(Y");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1124 = Static63.method1251("Loaded title screen");

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1125 = aClass45_1127;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1126 = aClass45_1127;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1128 = Static63.method1251("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1129 = Static63.method1251("Loading fonts )2 ");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1130 = aClass45_1129;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1131 = Static63.method1251("Trade)4compete");

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1132 = Static63.method1251("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!s", name = "q", descriptor = "I")
	public static int anInt2649 = -1;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "[I")
	public static int[] anIntArray401 = new int[5];

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	public static int anInt2653 = 0;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1133 = aClass45_1132;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1134 = aClass45_1127;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1135 = aClass45_1127;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1136 = aClass45_1131;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1137 = aClass45_1127;

	@OriginalMember(owner = "client!s", name = "G", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1138 = aClass45_1124;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method1808() {
		aClass45_1130 = null;
		aClass45_1122 = null;
		aClass45_1127 = null;
		aClass45_1138 = null;
		aClass45_1137 = null;
		aClass45_1124 = null;
		anIntArray401 = null;
		aClass45_1126 = null;
		aClass45_1129 = null;
		aClass45_1123 = null;
		aClass45_1134 = null;
		aClass45_1135 = null;
		aClass45_1136 = null;
		aClass45_1128 = null;
		anIntArray402 = null;
		aClass45_1132 = null;
		aClass45_1125 = null;
		aClass45_1131 = null;
		aClass45_1133 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
	public static void method1813(@OriginalArg(1) boolean arg0) {
		if (Static1.anInt6 == Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 >> 7 && Static31.anInt924 == Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 >> 7) {
			Static1.anInt6 = 0;
		}
		@Pc(26) int local26 = Static56.anInt1694;
		if (arg0) {
			local26 = 1;
		}
		for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
			@Pc(42) Class5_Sub2_Sub4_Sub3_Sub1 local42;
			@Pc(48) int local48;
			if (arg0) {
				local42 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1;
				local48 = 33538048;
			} else {
				local42 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static64.anIntArray283[local32]];
				local48 = Static64.anIntArray283[local32] << 14;
			}
			if (local42 != null && local42.method1614()) {
				local42.aBoolean79 = false;
				@Pc(68) int local68 = local42.anInt2417 >> 7;
				if ((Static103.aBoolean122 && Static56.anInt1694 > 50 || Static56.anInt1694 > 200) && !arg0 && local42.anInt2419 == local42.anInt2426) {
					local42.aBoolean79 = true;
				}
				@Pc(97) int local97 = local42.anInt2428 >> 7;
				if (local97 >= 0 && local97 < 104 && local68 >= 0 && local68 < 104) {
					if (local42.aClass5_Sub2_Sub4_Sub2_3 == null || local42.anInt1572 > Static3.anInt94 || local42.anInt1585 <= Static3.anInt94) {
						if ((local42.anInt2428 & 0x7F) == 64 && (local42.anInt2417 & 0x7F) == 64) {
							if (Static14.anInt421 == Static50.anIntArrayArray18[local97][local68]) {
								continue;
							}
							Static50.anIntArrayArray18[local97][local68] = Static14.anInt421;
						}
						local42.anInt1573 = Static32.method676(local42.anInt2428, local42.anInt2417, Static8.anInt262);
						Static110.aClass34_1.method923(Static8.anInt262, local42.anInt2428, local42.anInt2417, local42.anInt1573, 60, local42, local42.anInt2407, local48, local42.aBoolean109);
					} else {
						local42.aBoolean79 = false;
						local42.anInt1573 = Static32.method676(local42.anInt2428, local42.anInt2417, Static8.anInt262);
						Static110.aClass34_1.method895(Static8.anInt262, local42.anInt2428, local42.anInt2417, local42.anInt1573, local42, local42.anInt2407, local48, local42.anInt1571, local42.anInt1575, local42.anInt1587, local42.anInt1582);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[Lclient!mb;)Lclient!mb;")
	public static Class45 method1814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class45[] arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			if (arg2[arg1 + local7] == null) {
				arg2[arg1 + local7] = Static116.aClass45_1323;
			}
			local5 += arg2[local7 + arg1].anInt1925;
		}
		@Pc(36) byte[] local36 = new byte[local5];
		@Pc(38) int local38 = 0;
		@Pc(48) Class45 local48;
		for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
			local48 = arg2[arg1 + local40];
			Static127.method878(local48.aByteArray27, 0, local36, local38, local48.anInt1925);
			local38 += local48.anInt1925;
		}
		local48 = new Class45();
		local48.aByteArray27 = local36;
		local48.anInt1925 = local5;
		return local48;
	}
}
