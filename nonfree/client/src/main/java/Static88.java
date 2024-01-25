import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;Lclient!d;B)V")
	public static void method1476(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Interface4 arg1) {
		if (Static224.aClass14_Sub2_Sub10_2 == null) {
			return;
		}
		if (Static120.anInt1937 < 10) {
			if (!Static224.aClass310_21.method7783(Static224.aClass14_Sub2_Sub10_2.aString66)) {
				Static120.anInt1937 = Static123.aClass310_26.method7792(Static224.aClass14_Sub2_Sub10_2.aString66) / 10;
				return;
			}
			Static218.method3771();
			Static120.anInt1937 = 10;
		}
		if (Static120.anInt1937 == 10) {
			Static224.anInt1292 = Static224.aClass14_Sub2_Sub10_2.anInt4814 >> 6 << 6;
			Static224.anInt1291 = Static224.aClass14_Sub2_Sub10_2.anInt4809 >> 6 << 6;
			Static224.anInt1298 = (Static224.aClass14_Sub2_Sub10_2.anInt4811 >> 6 << 6) + 64 - Static224.anInt1292;
			Static224.anInt1295 = (Static224.aClass14_Sub2_Sub10_2.anInt4802 >> 6 << 6) + 64 - Static224.anInt1291;
			@Pc(84) int[] local84 = new int[3];
			@Pc(86) int local86 = -1;
			@Pc(88) int local88 = -1;
			if (Static224.aClass14_Sub2_Sub10_2.method4289(local84, (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >> 9) + Static550.anInt9242, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146, Static36.anInt617 + (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >> 9))) {
				local88 = local84[2] - Static224.anInt1292;
				local86 = local84[1] - Static224.anInt1291;
			}
			if (!Static229.aBoolean338 && local86 >= 0 && Static224.anInt1295 > local86 && local88 >= 0 && local88 < Static224.anInt1298) {
				local88 += (int) (Math.random() * 10.0D) - 5;
				local86 += (int) (Math.random() * 10.0D) - 5;
				Static381.anInt6704 = local88;
				Static97.anInt1683 = local86;
			} else if (Static33.anInt531 == -1 || Static256.anInt4826 == -1) {
				Static224.aClass14_Sub2_Sub10_2.method4293(Static224.aClass14_Sub2_Sub10_2.anInt4801 & 0x3FFF, local84, Static224.aClass14_Sub2_Sub10_2.anInt4801 >> 14 & 0x3FFF);
				Static97.anInt1683 = local84[1] - Static224.anInt1291;
				Static381.anInt6704 = local84[2] - Static224.anInt1292;
			} else {
				Static224.aClass14_Sub2_Sub10_2.method4293(Static256.anInt4826, local84, Static33.anInt531);
				Static229.aBoolean338 = false;
				Static256.anInt4826 = -1;
				Static33.anInt531 = -1;
				if (local84 != null) {
					Static97.anInt1683 = local84[1] - Static224.anInt1291;
					Static381.anInt6704 = local84[2] - Static224.anInt1292;
				}
			}
			if (Static224.aClass14_Sub2_Sub10_2.anInt4810 == 37) {
				Static224.aFloat10 = 3.0F;
				Static224.aFloat11 = 3.0F;
			} else if (Static224.aClass14_Sub2_Sub10_2.anInt4810 == 50) {
				Static224.aFloat10 = 4.0F;
				Static224.aFloat11 = 4.0F;
			} else if (Static224.aClass14_Sub2_Sub10_2.anInt4810 == 75) {
				Static224.aFloat10 = 6.0F;
				Static224.aFloat11 = 6.0F;
			} else if (Static224.aClass14_Sub2_Sub10_2.anInt4810 == 100) {
				Static224.aFloat10 = 8.0F;
				Static224.aFloat11 = 8.0F;
			} else if (Static224.aClass14_Sub2_Sub10_2.anInt4810 == 200) {
				Static224.aFloat10 = 16.0F;
				Static224.aFloat11 = 16.0F;
			} else {
				Static224.aFloat10 = 8.0F;
				Static224.aFloat11 = 8.0F;
			}
			Static224.anInt1285 = (int) Static224.aFloat10 >> 1;
			Static224.aByteArrayArrayArray8 = Static636.method8905(Static224.anInt1285);
			Static23.method331();
			Static224.method1316();
			Static216.aClass32_31 = new Class32();
			Static224.anInt1287 += (int) (Math.random() * 5.0D) - 2;
			if (Static224.anInt1287 < -8) {
				Static224.anInt1287 = -8;
			}
			Static224.anInt1286 += (int) (Math.random() * 5.0D) - 2;
			if (Static224.anInt1287 > 8) {
				Static224.anInt1287 = 8;
			}
			if (Static224.anInt1286 < -16) {
				Static224.anInt1286 = -16;
			}
			if (Static224.anInt1286 > 16) {
				Static224.anInt1286 = 16;
			}
			Static224.method1305(arg1, Static224.anInt1287 >> 2 << 10, Static224.anInt1286 >> 1);
			Static224.aClass274_2.method6612(1024, 256);
			Static224.aClass334_2.method8131(256, 256);
			Static224.aClass249_2.method6122(4096);
			Static431.aClass18_1.method280(256);
			Static120.anInt1937 = 20;
		} else if (Static120.anInt1937 == 20) {
			Static433.method6480(true);
			Static224.method1303(arg0, Static224.anInt1287, Static224.anInt1286);
			Static120.anInt1937 = 60;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 60) {
			if (Static224.aClass310_21.method7798(Static224.aClass14_Sub2_Sub10_2.aString66 + "_staticelements")) {
				if (!Static224.aClass310_21.method7783(Static224.aClass14_Sub2_Sub10_2.aString66 + "_staticelements")) {
					return;
				}
				Static224.aClass309_2 = Static256.method4307(Static224.aClass310_21, Static212.aBoolean270, Static224.aClass14_Sub2_Sub10_2.aString66 + "_staticelements");
			} else {
				Static224.aClass309_2 = new Class309(0);
			}
			Static224.method1317();
			Static120.anInt1937 = 70;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 70) {
			Static99.aClass228_2 = new Class228(arg0, 11, true, Static626.aCanvas12);
			Static120.anInt1937 = 73;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 73) {
			Static600.aClass228_8 = new Class228(arg0, 12, true, Static626.aCanvas12);
			Static120.anInt1937 = 76;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 76) {
			Static107.aClass228_3 = new Class228(arg0, 14, true, Static626.aCanvas12);
			Static120.anInt1937 = 79;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 79) {
			Static143.aClass228_4 = new Class228(arg0, 17, true, Static626.aCanvas12);
			Static120.anInt1937 = 82;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 82) {
			Static577.aClass228_7 = new Class228(arg0, 19, true, Static626.aCanvas12);
			Static120.anInt1937 = 85;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 85) {
			Static470.aClass228_6 = new Class228(arg0, 22, true, Static626.aCanvas12);
			Static120.anInt1937 = 88;
			Static433.method6480(true);
			Static459.method8984();
		} else if (Static120.anInt1937 == 88) {
			Static43.aClass228_1 = new Class228(arg0, 26, true, Static626.aCanvas12);
			Static120.anInt1937 = 91;
			Static433.method6480(true);
			Static459.method8984();
		} else {
			Static307.aClass228_5 = new Class228(arg0, 30, true, Static626.aCanvas12);
			Static120.anInt1937 = 100;
			Static433.method6480(true);
			Static459.method8984();
			System.gc();
		}
	}
}
