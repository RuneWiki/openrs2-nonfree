import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Lclient!eb;")
	public static Class17 aClass17_45 = new Class17(64);

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!eb;")
	public static Class17 aClass17_46 = new Class17(128);

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1150 = Static59.method1195("Too many connections from your address)3");

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1149 = aClass60_1150;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public static volatile int anInt2642 = 0;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	public static int anInt2643 = 0;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1151 = Static59.method1195("hitmarks");

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array5 = new Class3_Sub1_Sub2_Sub3[1000];

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1152 = Static59.method1195("scape main");

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
	public static int[] anIntArray283 = new int[256];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	public static void method1710() {
		anIntArray283 = null;
		aClass3_Sub1_Sub2_Sub3Array5 = null;
		aClass17_45 = null;
		aClass17_46 = null;
		aClass60_1152 = null;
		aClass60_1150 = null;
		aClass60_1149 = null;
		aClass60_1151 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method1711() {
		Static130.anInt3484++;
		Static70.method1459(true);
		Static97.method1819(true);
		Static70.method1459(false);
		Static97.method1819(false);
		Static3.method77();
		Static103.method2016();
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (!Static62.aBoolean66) {
			local33 = Static107.anInt3040 + Static19.anInt3409 & 0x7FF;
			local35 = Static52.anInt1724;
			if (Static114.anInt3197 / 256 > local35) {
				local35 = Static114.anInt3197 / 256;
			}
			if (Static57.aBooleanArray71[4] && Static124.anIntArray344[4] + 128 > local35) {
				local35 = Static124.anIntArray344[4] + 128;
			}
			Static42.method964(Static24.anInt919, Static66.method1353(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524, Static119.anInt3243, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494) - 50, Static57.anInt3396, local35 * 3 + 600, local35, local33);
		}
		if (Static62.aBoolean66) {
			local35 = Static59.method1196();
		} else {
			local35 = Static118.method2140();
		}
		@Pc(96) int local96 = Static115.anInt3199;
		local33 = Static71.anInt1493;
		@Pc(100) int local100 = Static98.anInt2824;
		@Pc(102) int local102 = Static63.anInt2908;
		@Pc(104) int local104 = Static22.anInt871;
		for (@Pc(106) int local106 = 0; local106 < 5; local106++) {
			if (Static57.aBooleanArray71[local106]) {
				@Pc(148) int local148 = (int) ((double) -Static54.anIntArray196[local106] + (double) (Static54.anIntArray196[local106] * 2 + 1) * Math.random() + Math.sin((double) Static59.anIntArray204[local106] / 100.0D * (double) Static55.anIntArray197[local106]) * (double) Static124.anIntArray344[local106]);
				if (local106 == 2) {
					Static98.anInt2824 += local148;
				}
				if (local106 == 1) {
					Static115.anInt3199 += local148;
				}
				if (local106 == 4) {
					Static63.anInt2908 += local148;
					if (Static63.anInt2908 < 128) {
						Static63.anInt2908 = 128;
					}
					if (Static63.anInt2908 > 383) {
						Static63.anInt2908 = 383;
					}
				}
				if (local106 == 3) {
					Static22.anInt871 = local148 + Static22.anInt871 & 0x7FF;
				}
				if (local106 == 0) {
					Static71.anInt1493 += local148;
				}
			}
		}
		Static53.method1131();
		Static25.anInt974 = 0;
		Static25.aBoolean30 = true;
		Static25.anInt976 = Static122.anInt720 - 4;
		Static25.anInt973 = Static12.anInt374 - 4;
		Static100.method1983();
		Static40.method1886();
		Static100.method1983();
		Static13.aClass58_1.method1740(Static71.anInt1493, Static115.anInt3199, Static98.anInt2824, Static63.anInt2908, Static22.anInt871, local35);
		Static100.method1983();
		Static13.aClass58_1.method1757();
		Static45.method991();
		Static3.method76();
		((Class37) Static7.anInterface1_1).method1169(Static69.anInt2153);
		Static22.method567();
		if (Static96.aBoolean101 && Static74.method1546() == 0) {
			Static96.aBoolean101 = false;
		}
		if (Static96.aBoolean101) {
			Static53.method1131();
			Static40.method1886();
			Static99.method1974(Static62.aClass60_857, false, null);
		}
		Static100.method1983();
		Static129.method2298();
		Static63.anInt2908 = local102;
		Static22.anInt871 = local104;
		Static71.anInt1493 = local33;
		Static115.anInt3199 = local96;
		Static98.anInt2824 = local100;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!jb;)V")
	public static void method1712(@OriginalArg(1) Class25 arg0) {
		Static23.aClass25_25 = arg0;
		Static48.anInt1549 = Static23.aClass25_25.method911(16);
	}
}
