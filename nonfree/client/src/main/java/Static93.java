import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public static void method1257() {
		if (Static481.aClass344_2 != null) {
			Static720.aClass264_1 = new Class264();
			Static720.aClass264_1.method6401(Static481.aClass344_2, Static481.aClass344_2.aClass279_63.method6992(Static141.anInt2658), Static481.aClass344_2.anInt9660, Static21.aLong372);
			Static578.aThread5 = new Thread(Static720.aClass264_1, "");
			Static578.aThread5.start();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!wk;)Lclient!wk;")
	public static Class3_Sub22_Sub5 method1258(@OriginalArg(1) Class3_Sub22_Sub5 arg0) {
		@Pc(21) Class3_Sub22_Sub5 local21 = arg0 == null ? new Class3_Sub22_Sub5() : new Class3_Sub22_Sub5(arg0);
		local21.method9338();
		return local21;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public static void method1259() {
		for (@Pc(12) int local12 = 0; local12 < Static581.anInt9508; local12++) {
			@Pc(18) Class239 local18 = Static326.aClass239Array1[local12];
			@Pc(20) boolean local20 = false;
			@Pc(270) int local270;
			if (local18.aClass3_Sub22_Sub1_1 == null) {
				local18.anInt7040--;
				if (local18.anInt7040 < (local18.method5906() ? -1500 : -10)) {
					local20 = true;
				} else {
					if (local18.aByte108 == 1 && local18.aClass292_1 == null) {
						local18.aClass292_1 = Static731.method7197(Static401.aClass221_114, local18.anInt7041, 0);
						if (local18.aClass292_1 == null) {
							continue;
						}
						local18.anInt7040 += local18.aClass292_1.method7194();
					} else if (local18.method5906() && (local18.aClass3_Sub36_1 == null || local18.aClass3_Sub33_Sub1_1 == null)) {
						if (local18.aClass3_Sub36_1 == null) {
							local18.aClass3_Sub36_1 = Static446.method6555(Static89.aClass221_17, local18.anInt7041);
						}
						if (local18.aClass3_Sub36_1 == null) {
							continue;
						}
						if (local18.aClass3_Sub33_Sub1_1 == null) {
							local18.aClass3_Sub33_Sub1_1 = local18.aClass3_Sub36_1.method6550(new int[] { 22050 });
							if (local18.aClass3_Sub33_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local18.anInt7040 < 0) {
						@Pc(158) int local158 = 8192;
						if (local18.anInt7042 == 0) {
							local270 = local18.anInt7043 * (local18.aByte108 == 3 ? Static713.aClass3_Sub55_31.aClass15_Sub8_1.method2888() : Static713.aClass3_Sub55_31.aClass15_Sub8_4.method2888()) >> 2;
						} else {
							@Pc(168) int local168 = local18.anInt7042 >> 24 & 0x3;
							if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 == local168) {
								@Pc(183) int local183 = (local18.anInt7042 & 0xFF) << 9;
								@Pc(191) int local191 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() << 8;
								@Pc(198) int local198 = local18.anInt7042 >> 16 & 0xFF;
								@Pc(210) int local210 = local191 + (local198 << 9) + 256 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204;
								@Pc(217) int local217 = local18.anInt7042 >> 8 & 0xFF;
								@Pc(229) int local229 = local191 + (local217 << 9) + 256 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211;
								@Pc(238) int local238 = Math.abs(local210) + Math.abs(local229) - 512;
								if (local183 < local238) {
									local18.anInt7040 = -99999;
									continue;
								}
								if (local238 < 0) {
									local238 = 0;
								}
								local270 = (local183 - local238) * Static713.aClass3_Sub55_31.aClass15_Sub8_2.method2888() * local18.anInt7043 / local183 >> 2;
								if (local18.aClass19_Sub1_15 != null && local18.aClass19_Sub1_15 instanceof Class19_Sub1_Sub3) {
									@Pc(283) Class19_Sub1_Sub3 local283 = (Class19_Sub1_Sub3) local18.aClass19_Sub1_15;
									@Pc(286) short local286 = local283.aShort124;
									@Pc(289) short local289 = local283.aShort121;
								}
								if (local210 != 0 || local229 != 0) {
									@Pc(315) int local315 = -Static703.anInt10997 - (int) (Math.atan2((double) local210, (double) local229) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local315 > 8192) {
										local315 = 16384 - local315;
									}
									@Pc(335) int local335;
									if (local238 <= 0) {
										local335 = 8192;
									} else if (local238 >= 4096) {
										local335 = 16384;
									} else {
										local335 = (8192 - local238) / 4096 + 8192;
									}
									local158 = local335 * local315 / 8192 + (16384 - local335 >> 1);
								}
							} else {
								local270 = 0;
							}
						}
						if (local270 > 0) {
							@Pc(396) Class3_Sub33_Sub1 local396 = null;
							if (local18.aByte108 == 1) {
								local396 = local18.aClass292_1.method7195().method5801(Static68.aClass272_1);
							} else if (local18.method5906()) {
								local396 = local18.aClass3_Sub33_Sub1_1;
							}
							@Pc(424) Class3_Sub22_Sub1 local424 = local18.aClass3_Sub22_Sub1_1 = Static727.method3896(local396, local18.anInt7039, local270, local158);
							local424.method3881(local18.anInt7046 - 1);
							Static155.aClass3_Sub22_Sub4_1.method9058(local424);
						}
					}
				}
			} else if (!local18.aClass3_Sub22_Sub1_1.method9443()) {
				local20 = true;
			}
			if (local20) {
				Static581.anInt9508--;
				for (local270 = local12; local270 < Static581.anInt9508; local270++) {
					Static326.aClass239Array1[local270] = Static326.aClass239Array1[local270 + 1];
				}
				local12--;
			}
		}
		if (Static578.aBoolean688 && !Static404.method6048(-68)) {
			if (Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888() != 0 && Static491.anInt8476 != -1) {
				if (Static235.aClass3_Sub22_Sub5_1 == null) {
					Static152.method2444(Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888(), Static191.aClass221_51, Static491.anInt8476);
				} else {
					Static423.method6241(Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888(), Static235.aClass3_Sub22_Sub5_1, Static491.anInt8476, Static191.aClass221_51);
				}
			}
			Static578.aBoolean688 = false;
			Static235.aClass3_Sub22_Sub5_1 = null;
		} else if (Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888() != 0 && Static491.anInt8476 != -1 && !Static404.method6048(-115)) {
			@Pc(567) Class3_Sub48 local567 = Static89.method1200(Static395.aClass286_68, Static532.aClass400_3.aClass399_2);
			local567.aClass3_Sub28_Sub2_1.method5311(Static491.anInt8476);
			Static532.aClass400_3.method9223(local567);
			Static491.anInt8476 = -1;
		}
	}
}
