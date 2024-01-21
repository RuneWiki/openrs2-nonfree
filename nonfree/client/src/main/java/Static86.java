import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "Lclient!oa;")
	public static Class7 aClass7_89;

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "Lclient!r;")
	public static Class5_Sub11_Sub1 aClass5_Sub11_Sub1_12 = new Class5_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "[Lclient!od;")
	public static Class50[] aClass50Array10 = new Class50[50];

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "Lclient!rb;")
	public static Class57 aClass57_17 = new Class57(32);

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1416 = Static38.method736("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1417 = Static38.method736("red:");

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1418 = Static38.method736("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1419 = aClass71_1418;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1420 = aClass71_1417;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	public static void method1975() {
		aClass71_1419 = null;
		aClass71_1418 = null;
		aClass50Array10 = null;
		aClass7_89 = null;
		aClass57_17 = null;
		aClass71_1416 = null;
		aClass71_1420 = null;
		aClass5_Sub11_Sub1_12 = null;
		aClass71_1417 = null;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
	public static void method1978() {
		if (Static57.aClass3_1 == null) {
			return;
		}
		@Pc(9) long local9 = Static50.method959();
		if (Static94.aLong85 >= local9) {
			return;
		}
		Static57.aClass3_1.method1210(local9);
		@Pc(31) int local31 = (int) (local9 - Static94.aLong85);
		Static94.aLong85 = local9;
		@Pc(42) Class local42 = n.class;
		synchronized (n.class) {
			Static94.anInt2271 += local31 * Static72.anInt1825;
			@Pc(59) int local59 = (Static94.anInt2271 - Static72.anInt1825 * 2000) / 1000;
			if (local59 > 0) {
				if (Static119.aClass5_Sub2_4 != null) {
					Static119.aClass5_Sub2_4.method1117(local59);
				}
				Static94.anInt2271 -= local59 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!eb;)V")
	public static void method1979(@OriginalArg(1) Class5_Sub2 arg0) {
		arg0.aBoolean70 = false;
		if (arg0.aClass5_Sub15_3 != null) {
			arg0.aClass5_Sub15_3.anInt2840 = 0;
		}
		for (@Pc(26) Class5_Sub2 local26 = arg0.method1115(); local26 != null; local26 = arg0.method1114()) {
			method1979(local26);
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
	public static void method1980() {
		aClass5_Sub11_Sub1_12.method1556();
		@Pc(7) int local7 = aClass5_Sub11_Sub1_12.method1555(1);
		if (local7 == 0) {
			return;
		}
		@Pc(19) int local19 = aClass5_Sub11_Sub1_12.method1555(2);
		if (local19 == 0) {
			Static72.anIntArray224[Static57.anInt1493++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(57) int local57;
		if (local19 == 1) {
			local45 = aClass5_Sub11_Sub1_12.method1555(3);
			Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.method1679(false, local45);
			local57 = aClass5_Sub11_Sub1_12.method1555(1);
			if (local57 == 1) {
				Static72.anIntArray224[Static57.anInt1493++] = 2047;
			}
			return;
		}
		@Pc(101) int local101;
		if (local19 == 2) {
			local45 = aClass5_Sub11_Sub1_12.method1555(3);
			Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.method1679(true, local45);
			local57 = aClass5_Sub11_Sub1_12.method1555(3);
			Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.method1679(true, local57);
			local101 = aClass5_Sub11_Sub1_12.method1555(1);
			if (local101 == 1) {
				Static72.anIntArray224[Static57.anInt1493++] = 2047;
			}
		} else if (local19 == 3) {
			local45 = aClass5_Sub11_Sub1_12.method1555(7);
			Static23.anInt728 = aClass5_Sub11_Sub1_12.method1555(2);
			local57 = aClass5_Sub11_Sub1_12.method1555(1);
			local101 = aClass5_Sub11_Sub1_12.method1555(7);
			@Pc(143) int local143 = aClass5_Sub11_Sub1_12.method1555(1);
			if (local143 == 1) {
				Static72.anIntArray224[Static57.anInt1493++] = 2047;
			}
			Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.method1678(local57 == 1, local101, local45);
		}
	}
}
