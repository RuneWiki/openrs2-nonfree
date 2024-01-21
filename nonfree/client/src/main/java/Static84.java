import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Z")
	public static boolean aBoolean154;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Lclient!re;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt2049 = 0;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!wd;")
	private static Class80 aClass80_808 = Static2.method59("Jun");

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_809 = Static2.method59("Icons redrawn");

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!wd;")
	private static Class80 aClass80_810 = Static2.method59("Jul");

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!wd;")
	private static Class80 aClass80_811 = Static2.method59("Dec");

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!wd;")
	private static Class80 aClass80_822 = Static2.method59("Jan");

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_814 = Static2.method59("Feb");

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!wd;")
	private static Class80 aClass80_815 = Static2.method59("Mar");

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!wd;")
	private static Class80 aClass80_816 = Static2.method59("Apr");

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!wd;")
	private static Class80 aClass80_818 = Static2.method59("May");

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!wd;")
	private static Class80 aClass80_819 = Static2.method59("Aug");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!wd;")
	private static Class80 aClass80_812 = Static2.method59("Sep");

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!wd;")
	private static Class80 aClass80_813 = Static2.method59("Oct");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!wd;")
	private static Class80 aClass80_817 = Static2.method59("Nov");

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array13 = new Class80[] { aClass80_822, aClass80_814, aClass80_815, aClass80_816, aClass80_818, aClass80_808, aClass80_810, aClass80_819, aClass80_812, aClass80_813, aClass80_817, aClass80_811 };

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_820 = Static2.method59("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_821 = Static2.method59("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!wd;")
	public static Class80 aClass80_823 = Static2.method59("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Lclient!wd;")
	public static Class80 aClass80_824 = Static2.method59("@gre@");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1251() {
		if (Static71.aClass45_1 != null) {
			@Pc(3) Class45 local3 = Static71.aClass45_1;
			synchronized (Static71.aClass45_1) {
				Static71.aClass45_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method1252() {
		aClass80_816 = null;
		aClass80_808 = null;
		aClass80_819 = null;
		aClass80_813 = null;
		aClass63_1 = null;
		aClass80Array13 = null;
		aClass80_823 = null;
		aClass80_820 = null;
		aClass80_817 = null;
		aClass80_824 = null;
		aClass80_810 = null;
		aClass80_811 = null;
		aClass80_818 = null;
		aClass80_814 = null;
		aClass80_815 = null;
		aClass80_812 = null;
		aClass80_809 = null;
		aClass80_822 = null;
		aClass80_821 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIIIB)Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1 method1255(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(24) long local24 = ((long) arg2 << 40) + ((long) arg3 << 38) + (long) arg1 + ((long) arg4 << 16);
		@Pc(32) Class2_Sub1_Sub9_Sub1 local32;
		if (!arg0) {
			local32 = (Class2_Sub1_Sub9_Sub1) Static36.aClass32_21.method887(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class2_Sub1_Sub5 local40 = Static4.method95(arg1);
		if (arg4 > 1 && local40.anIntArray97 != null) {
			@Pc(48) int local48 = -1;
			for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
				if (local40.anIntArray98[local50] <= arg4 && local40.anIntArray98[local50] != 0) {
					local48 = local40.anIntArray97[local50];
				}
			}
			if (local48 != -1) {
				local40 = Static4.method95(local48);
			}
		}
		@Pc(92) Class2_Sub1_Sub1_Sub2 local92 = local40.method438(1);
		if (local92 == null) {
			return null;
		}
		@Pc(98) Class2_Sub1_Sub9_Sub1 local98 = null;
		if (local40.anInt797 != -1) {
			local98 = method1255(true, local40.anInt783, 0, 1, 10);
			if (local98 == null) {
				return null;
			}
		}
		@Pc(117) int local117 = Static99.anInt2978;
		@Pc(120) int[] local120 = new int[4];
		@Pc(122) int[] local122 = Static99.anIntArray388;
		@Pc(124) int local124 = Static99.anInt2975;
		Static99.method1895(local120);
		local32 = new Class2_Sub1_Sub9_Sub1(36, 32);
		Static99.method1901(local32.anIntArray185, 36, 32);
		Static99.method1900();
		Static52.method929();
		Static52.method933(16, 16);
		Static52.aBoolean103 = false;
		@Pc(147) int local147 = local40.anInt774;
		if (arg0) {
			local147 = (int) ((double) local147 * 1.5D);
		} else if (arg3 == 2) {
			local147 = (int) ((double) local147 * 1.04D);
		}
		@Pc(175) int local175 = Class2_Sub1_Sub9_Sub2.anIntArray202[local40.anInt773] * local147 >> 16;
		@Pc(184) int local184 = Class2_Sub1_Sub9_Sub2.anIntArray198[local40.anInt773] * local147 >> 16;
		local92.method221();
		local92.method203(local40.anInt802, local40.anInt817, local40.anInt773, local40.anInt776, local40.anInt818 + local92.anInt2306 / 2 + local175, local40.anInt818 + local184);
		if (arg3 >= 1) {
			local32.method827(1);
		}
		if (arg3 >= 2) {
			local32.method827(16777215);
		}
		if (arg2 != 0) {
			local32.method829(arg2);
		}
		Static99.method1901(local32.anIntArray185, 36, 32);
		if (local40.anInt797 != -1) {
			local98.method825(0, 0);
		}
		if (!arg0 && (local40.anInt792 == 1 || arg4 != 1) && arg4 != -1) {
			Static73.aClass2_Sub1_Sub9_Sub4_23.method1925(Static88.method1320(arg4), 1, 10, 1);
			Static73.aClass2_Sub1_Sub9_Sub4_23.method1925(Static88.method1320(arg4), 0, 9, 16776960);
		}
		if (!arg0) {
			Static36.aClass32_21.method880(local32, local24);
		}
		Static99.method1901(local122, local117, local124);
		Static99.method1890(local120);
		Static52.method929();
		Static52.aBoolean103 = true;
		return local32;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLclient!ff;)[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] method1256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static123.method1974(arg2, arg1, arg0) ? Static2.method60() : null;
	}
}
