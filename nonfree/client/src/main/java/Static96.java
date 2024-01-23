import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ha", name = "Sb", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!ha", name = "Gb", descriptor = "I")
	public static int anInt2062 = 0;

	@OriginalMember(owner = "client!ha", name = "Ib", descriptor = "Lclient!ui;")
	public static Class175 aClass175_14 = new Class175(30);

	@OriginalMember(owner = "client!ha", name = "Lb", descriptor = "Ljava/lang/String;")
	public static String aString70 = "Loading interfaces - ";

	@OriginalMember(owner = "client!ha", name = "Xb", descriptor = "I")
	public static int anInt2076 = 0;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "(I)V")
	public static void method1882() {
		Static125.anInt2513 = 0;
		Static128.anInt2549 = 0;
		Static312.method4645();
		Static145.method2523();
		Static223.method3598();
		Static248.method3891();
		@Pc(21) int local21;
		for (local21 = 0; local21 < Static128.anInt2549; local21++) {
			@Pc(28) int local28 = Static304.anIntArray601[local21];
			if (Static14.aClass11_Sub4_Sub1Array1[local28].anInt3822 != Static167.anInt637) {
				if (Static14.aClass11_Sub4_Sub1Array1[local28].anInt3005 > 0) {
					Static275.method4211(Static14.aClass11_Sub4_Sub1Array1[local28]);
				}
				Static14.aClass11_Sub4_Sub1Array1[local28] = null;
			}
		}
		if (Static5.anInt204 != Static10.aClass1_Sub13_Sub1_117.anInt2018) {
			throw new RuntimeException("gpp1 pos:" + Static10.aClass1_Sub13_Sub1_117.anInt2018 + " psize:" + Static5.anInt204);
		}
		for (local21 = 0; local21 < Static275.anInt5043; local21++) {
			if (Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local21]] == null) {
				throw new RuntimeException("gpp2 pos:" + local21 + " size:" + Static275.anInt5043);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "(II)V")
	public static void method1885(@OriginalArg(0) int arg0) {
		Static174.anIntArray612 = new int[arg0];
		Static26.anIntArray59 = new int[arg0];
		Static283.anIntArray564 = new int[arg0];
		Static117.anIntArray171 = new int[arg0];
		Static192.anIntArray397 = new int[arg0];
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIIII)V")
	public static void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static121.anInt2463++;
		Static176.method3008();
		@Pc(28) int local28;
		if (arg1) {
			Static39.method674(0, false, false);
		} else {
			Static81.method1671(0);
			Static39.method674(0, true, false);
			if (Static83.anInt1853 == 0) {
				for (local28 = 1; local28 <= 5; local28++) {
					Static39.method674(local28, false, false);
					Static39.method674(local28, false, true);
					Static81.method1671(local28);
				}
			} else {
				for (local28 = 1; local28 <= 5; local28++) {
					Static81.method1671(local28);
					Static39.method674(local28, false, false);
					Static39.method674(local28, false, true);
				}
			}
		}
		if (!arg1) {
			Static163.method2822();
		}
		Static95.method1805();
		if (Static71.aBoolean165) {
			Static56.method1015(arg4, arg2, arg3, true, arg0);
			arg3 = Static128.anInt2548;
			arg4 = Static214.anInt1383;
			arg2 = Static172.anInt3358;
			arg0 = Static111.anInt2282;
		}
		Static52.anInt1128 = arg0;
		Static52.anInt1126 = arg3;
		@Pc(129) int local129;
		if (Static228.anInt4270 == 1) {
			local129 = Static132.anInt2613 + (int) Static148.aFloat64 & 0x7FF;
			local28 = (int) Static8.aFloat4;
			if (local28 < Static221.anInt4151 / 256) {
				local28 = Static221.anInt4151 / 256;
			}
			if (Static311.aBooleanArray24[4] && Static225.anIntArray470[4] + 128 > local28) {
				local28 = Static225.anIntArray470[4] + 128;
			}
			Static313.method4662(local28 * 3 + 600, Static42.method768(Static138.aClass11_Sub4_Sub1_3.anInt3865, Static132.anInt2608, Static138.aClass11_Sub4_Sub1_3.anInt3856) + -50, local129, Static21.anInt443, local28, Static106.anInt3753, arg4);
		} else if (Static228.anInt4270 == 5) {
			Static14.method214(arg4);
		}
		local28 = Static273.anInt5035;
		@Pc(192) int local192 = Static87.anInt1875;
		local129 = Static283.anInt5144;
		@Pc(196) int local196 = Static53.anInt1161;
		@Pc(198) int local198 = Static305.anInt5484;
		@Pc(200) int local200;
		@Pc(245) int local245;
		for (local200 = 0; local200 < 5; local200++) {
			if (Static311.aBooleanArray24[local200]) {
				local245 = (int) (Math.random() * (double) (Static66.anIntArray108[local200] * 2 + 1) - (double) Static66.anIntArray108[local200] + Math.sin((double) Static221.anIntArray461[local200] / 100.0D * (double) Static217.anIntArray457[local200]) * (double) Static225.anIntArray470[local200]);
				if (local200 == 4) {
					Static53.anInt1161 += local245;
					if (Static53.anInt1161 < 128) {
						Static53.anInt1161 = 128;
					}
					if (Static53.anInt1161 > 383) {
						Static53.anInt1161 = 383;
					}
				}
				if (local200 == 0) {
					Static273.anInt5035 += local245;
				}
				if (local200 == 3) {
					Static305.anInt5484 = Static305.anInt5484 + local245 & 0x7FF;
				}
				if (local200 == 2) {
					Static87.anInt1875 += local245;
				}
				if (local200 == 1) {
					Static283.anInt5144 += local245;
				}
			}
		}
		Static74.method1487();
		@Pc(410) int local410;
		if (Static71.aBoolean165) {
			Static93.method1772(arg3, arg0, arg2 + arg3, arg0 - -arg4);
			@Pc(373) float local373 = (float) Static53.anInt1161 * 0.17578125F;
			@Pc(378) float local378 = (float) Static305.anInt5484 * 0.17578125F;
			if (Static228.anInt4270 == 3) {
				local373 = Static241.aFloat80 * 360.0F / 6.2831855F;
				local378 = Static138.aFloat82 * 360.0F / 6.2831855F;
			}
			if (Static97.anInt2087 == 10) {
				local410 = Static158.method3197(Static87.anInt1875 >> 10, Static273.anInt5035 >> 10, Static153.anInt2340, Static38.anInt722);
			} else {
				local410 = Static158.method3197(Static138.aClass11_Sub4_Sub1_3.anIntArray406[0] >> 3, Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] >> 3, Static153.anInt2340, Static38.anInt722);
			}
			if (Static57.anInt1224 >= 0) {
				Static71.method1407();
				@Pc(440) Class126 local440 = Static226.method3634(Static57.anInt1224, Static310.anInt5533, Static296.anInt828, Static277.anInt5091);
				local440.method3419(Static44.anInt1030, arg3, arg0, arg2, arg4, Static53.anInt1161, Static305.anInt5484, local410);
			} else {
				Static71.method1403(local410);
			}
			Static71.method1382(arg3, arg0, arg2, arg4, arg2 / 2 + arg3, arg4 / 2 + arg0, local373, local378, Static228.anInt4279, Static228.anInt4279);
			Static297.method4447(false);
			Static71.method1394();
			Static71.method1413(true);
			Static71.method1414(true);
		} else {
			Static77.method1587(arg3, arg0, arg3 + arg2, arg0 - -arg4);
			Static119.method2151();
			if (Static57.anInt1224 < 0) {
				Static77.method1596(arg3, arg0, arg2, arg4, 0);
			} else {
				@Pc(347) Class126 local347 = Static226.method3634(Static57.anInt1224, Static310.anInt5533, Static296.anInt828, Static277.anInt5091);
				local347.method3415(Static44.anInt1030, arg3, arg0, arg2, arg4, Static53.anInt1161, Static305.anInt5484);
			}
		}
		if (Static91.aBoolean183 || arg3 > Static35.anInt659 || arg3 + arg2 <= Static35.anInt659 || arg0 > Static146.anInt3019 || Static146.anInt3019 >= arg0 + arg4) {
			Static256.anInt4784 = 0;
			Static271.aBoolean475 = false;
		} else {
			Static271.aBoolean475 = true;
			Static256.anInt4784 = 0;
			@Pc(516) int local516 = Static143.anInt2793;
			local410 = Static196.anInt3909;
			local200 = Static163.anInt3267;
			local245 = Static264.anInt4880;
			Static226.anInt4237 = local410 + (Static146.anInt3019 - arg0) * (-local410 + local516) / arg4;
			Static42.anInt967 = local200 + (Static35.anInt659 - arg3) * (local245 - local200) / arg2;
		}
		Static246.method3875();
		@Pc(561) byte local561 = Static122.method2212() == 2 ? (byte) Static121.anInt2463 : 1;
		if (Static71.aBoolean165) {
			Static151.method2633(Static167.anInt637, !Static174.aBoolean528);
			Static228.method3655(Static305.anInt5484, Static273.anInt5035, Static87.anInt1875, Static283.anInt5144, Static53.anInt1161);
			Static71.anInt1545 = Static167.anInt637;
			Static9.method163(Static273.anInt5035, Static283.anInt5144, Static87.anInt1875, Static53.anInt1161, Static305.anInt5484, Static35.aByteArrayArrayArray2, Static283.anIntArray564, Static117.anIntArray171, Static192.anIntArray397, Static174.anIntArray612, Static26.anIntArray59, Static132.anInt2608 + 1, local561, Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7, Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7);
			Static172.aBoolean293 = true;
			Static151.method2644();
			Static228.method3655(0, 0, 0, 0, 0);
			Static246.method3875();
			Static94.method1804(arg3, arg0, arg4, arg2, Static228.anInt4279, Static228.anInt4279);
			Static133.method2329(Static228.anInt4279, arg0, arg4, arg3, arg2, Static228.anInt4279);
			Static3.method66();
		} else {
			Static9.method163(Static273.anInt5035, Static283.anInt5144, Static87.anInt1875, Static53.anInt1161, Static305.anInt5484, Static35.aByteArrayArrayArray2, Static283.anIntArray564, Static117.anIntArray171, Static192.anIntArray397, Static174.anIntArray612, Static26.anIntArray59, Static132.anInt2608 + 1, local561, Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7, Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7);
			Static246.method3875();
			Static3.method66();
			Static94.method1804(arg3, arg0, arg4, arg2, 256, 256);
			Static133.method2329(256, arg0, arg4, arg3, arg2, 256);
		}
		((Class52_Sub1) Static119.anInterface5_1).method1493(Static38.anInt722);
		Static68.method1306(arg3, arg4, arg2, arg0);
		Static53.anInt1161 = local196;
		Static283.anInt5144 = local129;
		Static305.anInt5484 = local198;
		Static87.anInt1875 = local192;
		Static273.anInt5035 = local28;
		if (Static176.aBoolean298 && Static136.aClass164_1.method4079() == 0) {
			Static176.aBoolean298 = false;
		}
		if (Static176.aBoolean298) {
			if (Static71.aBoolean165) {
				Static93.method1777(arg3, arg0, arg2, arg4, 0);
			} else {
				Static77.method1596(arg3, arg0, arg2, arg4, 0);
			}
			Static288.method4341(false, Static270.aString192);
		}
		if (!arg1 && !Static176.aBoolean298 && !Static91.aBoolean183 && Static35.anInt659 >= arg3 && Static35.anInt659 < arg3 + arg2 && Static146.anInt3019 >= arg0 && arg4 + arg0 > Static146.anInt3019) {
			Static9.method166(arg2, arg3, Static35.anInt659, Static146.anInt3019, arg0, arg4);
		}
	}
}
