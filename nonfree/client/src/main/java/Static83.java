import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1426() {
		Static246.anInterface4Array1 = null;
		Static97.method1633();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	public static void method1427(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static268.aClass1_Sub3_Sub15_2 != null) {
			Static316.anInt6316 = Static268.aClass1_Sub3_Sub15_2.anInt3974;
		} else {
			Static316.anInt6316 = -1;
		}
		Static315.aClass26_62 = null;
		Static147.anInt3288 = 0;
		Static268.anIntArrayArrayArray5 = null;
		Static268.aByteArrayArrayArray13 = null;
		Static268.aByteArrayArrayArray10 = null;
		Static268.anIntArray269 = null;
		Static268.aByteArrayArrayArray9 = null;
		Static268.anIntArrayArrayArray6 = null;
		Static246.aClass191_12 = null;
		Static268.aByteArrayArrayArray12 = null;
		Static268.aClass1_Sub3_Sub15_2 = null;
		Static268.aByteArrayArrayArray11 = null;
		Static268.aClass108_11.method2757();
		Static84.aClass1_Sub3_Sub13_Sub2_2 = null;
		Static121.aClass27_11 = null;
		Static176.aClass27_22 = null;
		Static100.aClass1_Sub3_Sub13_5 = null;
		Static202.anInt4408 = -1;
		Static209.aClass27_30 = null;
		Static252.aClass27_35 = null;
		Static207.anInt4464 = -1;
		Static145.aClass27_42 = null;
		Static268.aClass174_2 = null;
		Static197.aClass27_26 = null;
		Static176.aClass27_23 = null;
		Static168.aClass27_20 = null;
		Static261.method3994();
		Static121.aClass72_1 = null;
		Static31.aClass186_3 = null;
		Static255.aClass186_22 = null;
		Static72.method1267(64, 128);
		Static159.method2556(64, 64);
		Static5.method2415(64);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!jh;BI)V")
	public static void method1428(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub16 local10 = (Class1_Sub16) Static125.aClass186_10.method4570((long) arg1);
		if (local10 == null) {
			return;
		}
		if (local10.aClass1_Sub10_Sub4_2 != null) {
			Static101.aClass1_Sub10_Sub2_2.method1864(local10.aClass1_Sub10_Sub4_2);
			local10.aClass1_Sub10_Sub4_2 = null;
		}
		local10.method4767();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg1 - 334;
		@Pc(18) int local18 = 2048 - arg0 & 0x7FF;
		@Pc(25) int local25 = 2048 - arg6 & 0x7FF;
		if (local11 < 0) {
			local11 = 0;
		} else if (local11 > 100) {
			local11 = 100;
		}
		@Pc(52) int local52 = (Static178.aShort61 - Static245.aShort74) * local11 / 100 + Static245.aShort74;
		@Pc(54) int local54 = 0;
		@Pc(60) int local60 = local52 * arg4 >> 8;
		@Pc(62) int local62 = local60;
		@Pc(64) int local64 = 0;
		@Pc(78) int local78;
		@Pc(74) int local74;
		if (local18 != 0) {
			local74 = Class146.anIntArray463[local18];
			local78 = Class146.anIntArray461[local18];
			local64 = -local60 * local78 >> 16;
			local62 = local60 * local74 >> 16;
		}
		if (local25 != 0) {
			local78 = Class146.anIntArray461[local25];
			local54 = local78 * local62 >> 16;
			local74 = Class146.anIntArray463[local25];
			local62 = local74 * local62 >> 16;
		}
		Static44.anInt1071 = arg0;
		Static94.anInt2161 = arg5 - local62;
		Static120.anInt6251 = arg6;
		Static315.anInt6297 = arg3 - local64;
		Static58.anInt1269 = arg2 - local54;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!tb;IIIIIIIZ)V")
	public static void method1430(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static215.anInt4665;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static2.anInt53;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static46.anIntArrayArrayArray1[arg1][arg6][arg7] - Static296.anInt5905;
		@Pc(49) int local49 = Static46.anIntArrayArrayArray1[arg1][arg6 + 1][arg7] - Static296.anInt5905;
		@Pc(63) int local63 = Static46.anIntArrayArrayArray1[arg1][arg6 + 1][arg7 + 1] - Static296.anInt5905;
		@Pc(75) int local75 = Static46.anIntArrayArrayArray1[arg1][arg6][arg7 + 1] - Static296.anInt5905;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static237.anInt4974 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static237.anInt4975 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static237.anInt4974 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static237.anInt4975 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static237.anInt4974 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static237.anInt4975 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static237.anInt4974 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static237.anInt4975 + (local85 << 9) / local261;
		Static237.anInt4973 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static161.aBoolean231 && Static251.method4183(Static206.anInt4450 + Static237.anInt4974, Static87.anInt2040 + Static237.anInt4975, local315, local331, local299, local307, local323, local291)) {
				Static118.anInt2549 = arg6;
				Static170.anInt3813 = arg7;
			}
			if (!Static294.aBoolean367 && !arg8) {
				Static237.aBoolean307 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static237.anInt4976 || local323 > Static237.anInt4976 || local291 > Static237.anInt4976) {
					Static237.aBoolean307 = true;
				}
				if (arg0.anInt5290 == -1) {
					if (arg0.anInt5298 != 12345678) {
						Static237.method3751(local315, local331, local299, local307, local323, local291, arg0.anInt5298, arg0.anInt5297, arg0.anInt5292);
					}
				} else if (!Static282.aBoolean355) {
					local475 = Static237.anInterface1_1.method4597(arg0.anInt5290);
					Static237.method3751(local315, local331, local299, local307, local323, local291, Static160.method2561(local475, arg0.anInt5298), Static160.method2561(local475, arg0.anInt5297), Static160.method2561(local475, arg0.anInt5292));
				} else if (arg0.aBoolean328) {
					Static237.method3739(local315, local331, local299, local307, local323, local291, arg0.anInt5298, arg0.anInt5297, arg0.anInt5292, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt5290);
				} else {
					Static237.method3739(local315, local331, local299, local307, local323, local291, arg0.anInt5298, arg0.anInt5297, arg0.anInt5292, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt5290);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static161.aBoolean231 && Static251.method4183(Static206.anInt4450 + Static237.anInt4974, Static87.anInt2040 + Static237.anInt4975, local283, local299, local331, local275, local291, local323)) {
			Static118.anInt2549 = arg6;
			Static170.anInt3813 = arg7;
		}
		if (Static294.aBoolean367 || arg8) {
			return;
		}
		Static237.aBoolean307 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static237.anInt4976 || local291 > Static237.anInt4976 || local323 > Static237.anInt4976) {
			Static237.aBoolean307 = true;
		}
		if (arg0.anInt5290 == -1) {
			if (arg0.anInt5291 != 12345678) {
				Static237.method3751(local283, local299, local331, local275, local291, local323, arg0.anInt5291, arg0.anInt5292, arg0.anInt5297);
			}
		} else if (Static282.aBoolean355) {
			Static237.method3739(local283, local299, local331, local275, local291, local323, arg0.anInt5291, arg0.anInt5292, arg0.anInt5297, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt5290);
		} else {
			local475 = Static237.anInterface1_1.method4597(arg0.anInt5290);
			Static237.method3751(local283, local299, local331, local275, local291, local323, Static160.method2561(local475, arg0.anInt5291), Static160.method2561(local475, arg0.anInt5292), Static160.method2561(local475, arg0.anInt5297));
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLclient!th;I)[Lclient!ml;")
	public static Class1_Sub3_Sub13[] method1431(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1) {
		return Static131.method2257(0, arg1, arg0) ? Static40.method815() : null;
	}
}
