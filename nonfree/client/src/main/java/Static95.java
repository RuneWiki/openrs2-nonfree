import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!q", name = "Oc", descriptor = "Lclient!de;")
	public static Class15 aClass15_46;

	@OriginalMember(owner = "client!q", name = "Pc", descriptor = "Lclient!e;")
	public static Class16 aClass16_74 = new Class16(50);

	@OriginalMember(owner = "client!q", name = "Qc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1393 = Static72.method1077("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!q", name = "Xc", descriptor = "I")
	public static int anInt2093 = 0;

	@OriginalMember(owner = "client!q", name = "Zc", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!q", name = "bd", descriptor = "Lclient!u;")
	private static Class74 aClass74_1394 = Static72.method1077("Loading textures )2 ");

	@OriginalMember(owner = "client!q", name = "cd", descriptor = "Lclient!u;")
	public static Class74 aClass74_1395 = aClass74_1394;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!vd;IIII)V")
	public static void method1443(@OriginalArg(0) Class2_Sub2_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1 || Static112.anInt2421 >= 400) {
			return;
		}
		@Pc(49) Class74 local49;
		if (arg0.anInt2727 == 0) {
			local49 = Static91.method1340(new Class74[] { arg0.aClass74_1661, Static107.method1600(arg0.anInt2734, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2734), Static34.aClass74_624, Static15.aClass74_409, Static56.method940(arg0.anInt2734), Static61.aClass74_1109 });
		} else {
			local49 = Static91.method1340(new Class74[] { arg0.aClass74_1661, Static34.aClass74_624, Static38.aClass74_677, Static56.method940(arg0.anInt2727), Static61.aClass74_1109 });
		}
		@Pc(132) int local132;
		if (Static40.anInt960 == 1) {
			Static79.method1250(arg1, arg2, Static91.method1340(new Class74[] { Static121.aClass74_1619, Static111.aClass74_1540, local49 }), Static92.aClass74_1315, arg3, 32);
		} else if (!Static6.aBoolean7) {
			for (local132 = 4; local132 >= 0; local132--) {
				if (Static63.aClass74Array9[local132] != null) {
					@Pc(144) short local144 = 0;
					if (Static63.aClass74Array9[local132].method1701(Static67.aClass74_1045)) {
						if (arg0.anInt2734 > Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2734) {
							local144 = 2000;
						}
						if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2752 != 0 && arg0.anInt2752 != 0) {
							if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2752 == arg0.anInt2752) {
								local144 = 2000;
							} else {
								local144 = 0;
							}
						}
					} else if (Static62.aBooleanArray2[local132]) {
						local144 = 2000;
					}
					@Pc(195) int local195 = 0;
					if (local132 == 0) {
						local195 = local144 + 53;
					}
					if (local132 == 1) {
						local195 = local144 + 50;
					}
					if (local132 == 2) {
						local195 = local144 + 20;
					}
					if (local132 == 3) {
						local195 = local144 + 30;
					}
					if (local132 == 4) {
						local195 = local144 + 23;
					}
					Static79.method1250(arg1, arg2, Static91.method1340(new Class74[] { Static42.aClass74_702, local49 }), Static63.aClass74Array9[local132], arg3, local195);
				}
			}
		} else if ((Static65.anInt1451 & 0x8) == 8) {
			Static79.method1250(arg1, arg2, Static91.method1340(new Class74[] { Static4.aClass74_41, Static111.aClass74_1540, local49 }), Static25.aClass74_526, arg3, 16);
		}
		for (local132 = 0; local132 < Static112.anInt2421; local132++) {
			if (Static57.anIntArray159[local132] == 35) {
				Static92.aClass74Array14[local132] = Static91.method1340(new Class74[] { Static83.aClass74_1237, Static48.aClass74_834, Static42.aClass74_702, local49 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!g;II)Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 method1444(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1) {
		return Static119.method1758(arg1, arg0) ? Static89.method1328() : null;
	}

	@OriginalMember(owner = "client!q", name = "i", descriptor = "(I)V")
	public static void method1445() {
		aClass74_1394 = null;
		aClass74_1393 = null;
		aClass15_46 = null;
		aClass16_74 = null;
		aClass74_1395 = null;
	}

	@OriginalMember(owner = "client!q", name = "j", descriptor = "(I)V")
	public static void method1446() {
		@Pc(1) Object local1 = Static52.anObject1;
		synchronized (Static52.anObject1) {
			if (Static77.anInt1675 != 0) {
				Static77.anInt1675 = 1;
				try {
					Static52.anObject1.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
	public static void method1447(@OriginalArg(0) int arg0) {
		Static126.anInt2863 = arg0;
	}
}
