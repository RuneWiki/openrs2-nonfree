import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!l", name = "qb", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
	public static int anInt2056 = 0;

	@OriginalMember(owner = "client!l", name = "cb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_718 = Static120.method2057("flash3:");

	@OriginalMember(owner = "client!l", name = "ib", descriptor = "Lclient!tg;")
	private static Class81 aClass81_721 = Static120.method2057("Create a free account");

	@OriginalMember(owner = "client!l", name = "db", descriptor = "Lclient!tg;")
	public static Class81 aClass81_719 = aClass81_721;

	@OriginalMember(owner = "client!l", name = "eb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_720 = aClass81_718;

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "I")
	public static int anInt2058 = 0;

	@OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
	public static int anInt2062 = 0;

	@OriginalMember(owner = "client!l", name = "mb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_722 = Static120.method2057("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!l", name = "nb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_723 = aClass81_718;

	@OriginalMember(owner = "client!l", name = "ob", descriptor = "Lclient!tg;")
	public static Class81 aClass81_724 = Static120.method2057("Hier wechseln");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBIIII)V")
	public static void method1572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = 2048 - arg1 & 0x7FF;
		@Pc(22) int local22 = 2048 - arg2 & 0x7FF;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = arg0;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(46) int local46;
		if (local6 != 0) {
			local32 = Class1_Sub2_Sub2_Sub1.anIntArray30[local6];
			local36 = Class1_Sub2_Sub2_Sub1.anIntArray33[local6];
			local46 = local36 * 0 - arg0 * local32 >> 16;
			local26 = local36 * arg0 + local32 * 0 >> 16;
			local24 = local46;
		}
		@Pc(60) int local60 = 0;
		if (local22 != 0) {
			local32 = Class1_Sub2_Sub2_Sub1.anIntArray30[local22];
			local36 = Class1_Sub2_Sub2_Sub1.anIntArray33[local22];
			local46 = local36 * 0 + local26 * local32 >> 16;
			local26 = local36 * local26 - local32 * 0 >> 16;
			local60 = local46;
		}
		Static53.anInt1289 = arg3 - local60;
		Static31.anInt838 = arg2;
		Static126.anInt2769 = arg5 - local24;
		Static106.anInt2331 = arg1;
		Static69.anInt1702 = arg4 - local26;
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
	public static void method1573() {
		Static61.aClass59_14.method1967();
		Static176.aClass59_29.method1967();
		Static37.aClass59_7.method1967();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZBII)Lclient!tg;")
	public static Class81 method1574(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(24) int local24 = 1;
		@Pc(28) int local28 = arg1 / 10;
		while (local28 != 0) {
			local28 /= 10;
			local24++;
		}
		@Pc(42) int local42 = local24;
		if (arg1 < 0 || arg0) {
			local42 = local24 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local42];
		if (arg1 < 0) {
			local62[0] = 45;
		} else if (arg0) {
			local62[0] = 43;
		}
		for (@Pc(81) int local81 = 0; local81 < local24; local81++) {
			@Pc(87) int local87 = arg1 % 10;
			if (local87 < 0) {
				local87 = -local87;
			}
			if (local87 > 9) {
				local87 += 39;
			}
			local62[local42 - local81 - 1] = (byte) (local87 + 48);
			arg1 /= 10;
		}
		@Pc(120) Class81 local120 = new Class81();
		local120.anInt3691 = local42;
		local120.aByteArray41 = local62;
		return local120;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!vb;Lclient!vb;Lclient!vb;)V")
	public static void method1575(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) Class82 arg2) {
		Static151.aClass82_63 = arg1;
		Static149.aClass82_60 = arg2;
		Static132.aClass82_52 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
	public static void method1576() {
		aClass81_721 = null;
		aClass81_719 = null;
		aClass81_720 = null;
		anIntArray232 = null;
		aClass81_724 = null;
		aClass81_722 = null;
		aClass81_723 = null;
		aClass81_718 = null;
	}
}
