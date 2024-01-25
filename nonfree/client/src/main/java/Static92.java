import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ec", name = "Eb", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_51 = new Class263(60, -1);

	@OriginalMember(owner = "client!ec", name = "ob", descriptor = "Ljava/lang/String;")
	public static String aString19 = "";

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIII)V")
	public static void method1567(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(20) Class1_Sub46 local20 = (Class1_Sub46) Static261.aClass38_26.method765(local14);
		if (local20 == null) {
			local20 = new Class1_Sub46();
			Static261.aClass38_26.method766(local20, local14);
		}
		if (arg1 >= local20.anIntArray750.length) {
			@Pc(45) int[] local45 = new int[arg1 + 1];
			@Pc(50) int[] local50 = new int[arg1 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray750.length; local52++) {
				local45[local52] = local20.anIntArray750[local52];
				local50[local52] = local20.anIntArray751[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray750.length; local78 < arg1; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray751 = local50;
			local20.anIntArray750 = local45;
		}
		local20.anIntArray750[arg1] = arg4;
		local20.anIntArray751[arg1] = arg3;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	public static void method1569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1004) {
			Static178.method3004(Static393.aClass65_10, arg1, arg2);
		} else if (arg0 == 1001) {
			Static178.method3004(Static54.aClass65_1, arg1, arg2);
		} else if (arg0 == 1003) {
			Static178.method3004(Static184.aClass65_5, arg1, arg2);
		} else if (arg0 == 1008) {
			Static178.method3004(Static341.aClass65_8, arg1, arg2);
			return;
		} else if (arg0 == 1012) {
			Static178.method3004(Static293.aClass65_6, arg1, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!za;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method1570(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static227.aClass106_8 = arg0;
		Static293.anInt4678 = arg1;
		Static272.aClass40_3 = arg3;
		Static421.aBoolean482 = Static227.aClass106_8.method5928() > 0;
		Static166.anInt3464 = arg4 >> Static198.anInt7947;
		Static31.anInt2066 = arg6 >> Static198.anInt7947;
		Static17.anInt393 = arg4;
		Static237.anInt4683 = arg6;
		Static379.anInt6891 = arg5;
		Static329.anInt6070 = Static166.anInt3464 - Static235.anInt4661;
		if (Static329.anInt6070 < 0) {
			Static249.anInt4822 = -Static329.anInt6070;
			Static329.anInt6070 = 0;
		} else {
			Static249.anInt4822 = 0;
		}
		Static272.anInt5271 = Static31.anInt2066 - Static235.anInt4661;
		if (Static272.anInt5271 < 0) {
			Static38.anInt1008 = -Static272.anInt5271;
			Static272.anInt5271 = 0;
		} else {
			Static38.anInt1008 = 0;
		}
		Static182.anInt3942 = Static166.anInt3464 + Static235.anInt4661;
		if (Static182.anInt3942 > Static216.anInt4346) {
			Static182.anInt3942 = Static216.anInt4346;
		}
		Static418.anInt7456 = Static31.anInt2066 + Static235.anInt4661;
		if (Static418.anInt7456 > Static198.anInt7949) {
			Static418.anInt7456 = Static198.anInt7949;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static235.anInt4661 + Static235.anInt4661 + 2; local74++) {
			for (local77 = 0; local77 < Static235.anInt4661 + Static235.anInt4661 + 2; local77++) {
				local84 = Static166.anInt3464 + local74 - Static235.anInt4661;
				local90 = Static31.anInt2066 + local77 - Static235.anInt4661;
				if (local84 >= 0 && local90 >= 0 && local84 < Static216.anInt4346 && local90 < Static198.anInt7949) {
					@Pc(104) int local104 = local84 << Static198.anInt7947;
					@Pc(108) int local108 = local90 << Static198.anInt7947;
					@Pc(124) int local124 = Static262.aClass96Array3[Static262.aClass96Array3.length - 1].ua(local84, local90) - (0x3E8 << Static198.anInt7947 - 7);
					@Pc(144) int local144 = Static221.aClass96Array4 == null ? Static262.aClass96Array3[0].ua(local84, local90) + Static251.anInt4890 : Static221.aClass96Array4[0].ua(local84, local90) + Static251.anInt4890;
					Static166.aBooleanArrayArray2[local74][local77] = Static227.aClass106_8.VA(local104, local124, local108, local104, local144, local108);
				} else {
					Static166.aBooleanArrayArray2[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static235.anInt4661 + Static235.anInt4661 + 1; local77++) {
			for (local84 = 0; local84 < Static235.anInt4661 + Static235.anInt4661 + 1; local84++) {
				Static335.aBooleanArrayArray4[local77][local84] = Static166.aBooleanArrayArray2[local77][local84] || Static166.aBooleanArrayArray2[local77 + 1][local84] || Static166.aBooleanArrayArray2[local77][local84 + 1] || Static166.aBooleanArrayArray2[local77 + 1][local84 + 1];
			}
		}
		Static309.anIntArray740 = arg8;
		Static445.anIntArray720 = arg9;
		Static19.anIntArray33 = arg10;
		Static42.anIntArray107 = arg11;
		Static83.anIntArray218 = arg12;
		Static266.method3954();
		Static417.method5676();
		for (@Pc(260) Class41_Sub7 local260 = (Class41_Sub7) Static43.aClass117_2.method2967(); local260 != null; local260 = (Class41_Sub7) Static43.aClass117_2.method2970()) {
			local260.method5447();
			Static367.method5120(local260);
		}
		if (Static421.aBoolean482) {
			for (local90 = 0; local90 < Static315.anInt5904; local90++) {
				Static135.aClass75Array1[local90].method1702(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static227.aClass106_8.method5915(0);
			if (Static47.aClass9_3 == null || Static47.aClass9_3 instanceof Class9_Sub1) {
				Static47.aClass9_3 = new Class9_Sub2();
			}
		} else if (Static47.aClass9_3 == null || Static47.aClass9_3 instanceof Class9_Sub2) {
			Static47.aClass9_3 = new Class9_Sub1();
		}
		Static47.aClass9_3.method6067(arg2);
		Static47.aClass9_3.method6063();
		if (Static53.aClass252ArrayArrayArray1 != null) {
			Static272.method4042(true);
			Static47.aClass9_3.method6069(22);
			Static304.method4394(arg2, null, 0, (byte) 0, arg15, arg16);
			Static47.aClass9_3.method6063();
			Static47.aClass9_3.method6069(23);
			Static272.method4042(false);
		}
		Static304.method4394(arg2, arg7, arg13, arg14, arg15, arg16);
		Static47.aClass9_3.method6063();
		Static47.aClass9_3.method6061();
		Static47.aClass9_3.method6063();
		if (arg2 > 1) {
			Static227.aClass106_8.method5978(0);
		}
		Static227.aClass106_8.method5956(0, null);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(CB)Z")
	public static boolean method1576(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZII)V")
	public static void method1587(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static30.aClass106_3 = Static461.method5919(Static443.aCanvas33, Static150.aClass183_3, Static12.aClass34_Sub1_1.anInt7161 * 2, Static284.anInterface7_4, arg1);
		} else {
			if (arg0) {
				Static30.aClass106_3 = Static461.method5919(Static443.aCanvas33, Static150.aClass183_3, 0, Static284.anInterface7_4, 0);
				Static30.aClass106_3.t(0);
				@Pc(24) Class209 local24 = Static341.method4804(Static24.aClass211_8, Static125.anInt2790);
				@Pc(33) Class20 local33 = Static30.aClass106_3.method5968(local24, Static470.method6051(Static140.aClass211_38, Static125.anInt2790));
				Static338.method5238(true, Static374.aClass158_147.method3594(Static365.anInt6682), local33);
				Static30.aClass106_3.method5977();
				Static57.method1073();
				Static30.aClass106_3.method5966();
			}
			try {
				Static30.aClass106_3 = Static461.method5919(Static443.aCanvas33, Static150.aClass183_3, Static12.aClass34_Sub1_1.anInt7161 * 2, Static284.anInterface7_4, arg1);
				if (Static30.aClass106_3.method5953()) {
					@Pc(64) boolean local64 = true;
					try {
						local64 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(74) Throwable local74) {
					}
					@Pc(80) Class1_Sub11 local80;
					if (local64) {
						local80 = Static30.aClass106_3.method5940(146800640);
					} else {
						local80 = Static30.aClass106_3.method5940(104857600);
					}
					Static30.aClass106_3.method5970(local80);
				}
			} catch (@Pc(90) Throwable local90) {
				arg1 = 0;
				Static30.aClass106_3 = Static461.method5919(Static443.aCanvas33, Static150.aClass183_3, 0, Static284.anInterface7_4, 0);
			}
		}
		Static262.anInt2805 = arg1;
		Static343.method4833();
		if (!Static30.aClass106_3.method5980()) {
			Static453.anInt7926 = 1;
		}
		Static30.aClass106_3.method5911(Static453.anInt7926);
		Static30.aClass106_3.method5978(0);
		Static30.aClass106_3.ya(8);
		Static343.aClass40_4 = Static30.aClass106_3.method5944();
		Static97.aClass40_1 = Static30.aClass106_3.method5944();
		Static318.method4535();
		Static30.aClass106_3.method5982(!Static12.aClass34_Sub1_1.aBoolean448);
		if (Static30.aClass106_3.method5960()) {
			Static211.method3322(Static12.aClass34_Sub1_1.aBoolean453);
		}
		Static128.method2104(Static209.anInt4283 >> 3, Static30.aClass106_3, Static211.anInt4295 >> 3);
		Static448.method6102();
		Static399.aBoolean22 = false;
	}
}
