import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ta", name = "Mb", descriptor = "I")
	public static int anInt2434;

	@OriginalMember(owner = "client!ta", name = "rc", descriptor = "I")
	public static int anInt2462;

	@OriginalMember(owner = "client!ta", name = "zc", descriptor = "I")
	public static int anInt2469;

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
	public static int anInt2420 = 0;

	@OriginalMember(owner = "client!ta", name = "vb", descriptor = "I")
	public static int anInt2421 = 0;

	@OriginalMember(owner = "client!ta", name = "Lb", descriptor = "[I")
	public static int[] anIntArray301 = new int[50];

	@OriginalMember(owner = "client!ta", name = "vc", descriptor = "I")
	public static int anInt2465 = -1;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
	public static void method1628() {
		try {
			@Pc(2) Graphics local2 = Static103.aCanvas1.getGraphics();
			Static84.aClass4_51.method1525(0, local2, 4);
			Static14.aClass4_13.method1525(0, local2, 357);
			Static68.aClass4_45.method1525(722, local2, 4);
			Static48.aClass4_34.method1525(743, local2, 205);
			Static97.aClass4_59.method1525(0, local2, 0);
			Static61.aClass4_42.method1525(516, local2, 4);
			Static102.aClass4_60.method1525(516, local2, 205);
			Static57.aClass4_41.method1525(496, local2, 357);
			Static27.aClass4_18.method1525(0, local2, 338);
		} catch (@Pc(64) Exception local64) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method1630() {
		if (Static98.aClass55_1 != null) {
			@Pc(7) Class55 local7 = Static98.aClass55_1;
			synchronized (Static98.aClass55_1) {
				Static98.aClass55_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V")
	public static void method1631() {
		anIntArray301 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLclient!qd;)Z")
	public static boolean method1632(@OriginalArg(1) Class2_Sub1_Sub14 arg0) {
		if (arg0.anIntArray282 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray282.length; local17++) {
			@Pc(24) int local24 = Static111.method1806(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray277[local17];
			if (arg0.anIntArray282[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray282[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray282[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZI)V")
	public static void method1634(@OriginalArg(1) int arg0) {
		for (Static107.anInt2700 += arg0; Static107.anInt2700 >= Static5.anInt382; Static107.anInt2700 -= Static5.anInt382) {
			Static39.anInt2689 -= Static39.anInt2689 >> 2;
		}
		Static39.anInt2689 -= arg0 * 1000;
		if (Static39.anInt2689 < 0) {
			Static39.anInt2689 = 0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(ZI)V")
	public static void method1635(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt1516; local3++) {
			@Pc(11) Class2_Sub1_Sub1_Sub1_Sub2 local11 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[Static20.anIntArray89[local3]];
			@Pc(19) int local19 = (Static20.anIntArray89[local3] << 14) + 536870912;
			if (local11 != null && local11.method1783() && arg0 == local11.aClass2_Sub1_Sub7_1.aBoolean67 && local11.aClass2_Sub1_Sub7_1.method933()) {
				@Pc(44) int local44 = local11.anInt2724 >> 7;
				@Pc(49) int local49 = local11.anInt2717 >> 7;
				if (local44 >= 0 && local44 < 104 && local49 >= 0 && local49 < 104) {
					if (local11.anInt2722 == 1 && (local11.anInt2724 & 0x7F) == 64 && (local11.anInt2717 & 0x7F) == 64) {
						if (Static80.anInt2129 == Static102.anIntArrayArray25[local44][local49]) {
							continue;
						}
						Static102.anIntArrayArray25[local44][local49] = Static80.anInt2129;
					}
					if (!local11.aClass2_Sub1_Sub7_1.aBoolean66) {
						local19 += Integer.MIN_VALUE;
					}
					Static109.aClass3_1.method166(Static2.anInt287, local11.anInt2724, local11.anInt2717, Static65.method1338(Static2.anInt287, local11.anInt2724 + (local11.anInt2722 - 1) * 64, local11.anInt2722 * 64 + -64 + local11.anInt2717), local11.anInt2722 * 64 + 60 - 64, local11, local11.anInt2741, local19, local11.aBoolean158);
				}
			}
		}
	}
}
