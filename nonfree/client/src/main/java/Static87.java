import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!rb;")
	public static Class314 aClass314_2;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt1440;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt1455;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Ljava/lang/Class;")
	public static Class aClass6;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	public static final int[] anIntArray89 = new int[6];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_24 = new Class186(22, 3);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1163() {
		@Pc(1) int local1 = Static558.anInt9284;
		@Pc(3) int[] local3 = Static408.anIntArray393;
		@Pc(9) int local9;
		if (Static334.anInt5845 == 3) {
			local9 = Static154.aClass11Array1.length;
		} else {
			local9 = Static471.aBoolean766 ? local1 : local1 + Static337.anInt5854;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class19_Sub1_Sub3_Sub2 local36;
			if (Static334.anInt5845 == 3) {
				@Pc(29) Class11 local29 = Static154.aClass11Array1[local21];
				if (!local29.aBoolean10) {
					continue;
				}
				local36 = local29.method295();
			} else {
				if (local21 < local1) {
					local36 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local3[local21]];
				} else {
					local36 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local21 - local1])).aClass19_Sub1_Sub3_Sub2_Sub1_2;
				}
				if (local36.anInt7774 < 0) {
					continue;
				}
			}
			@Pc(68) int local68 = local36.method6592();
			if ((local68 & 0x1) == 0) {
				if ((local36.anInt11204 & 0x1FF) == 0 && (local36.anInt11211 & 0x1FF) == 0) {
					continue;
				}
			} else if ((local36.anInt11204 & 0x1FF) == 256 && (local36.anInt11211 & 0x1FF) == 256) {
				continue;
			}
			local36.anInt11208 = Static505.method7237(local36.aByte146, local36.anInt11211, local36.anInt11204);
			Static137.method2240(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!av;)Lclient!jga;")
	public static Class3_Sub29 method1164(@OriginalArg(0) Class20 arg0) {
		@Pc(13) Class3_Sub29 local13 = (Class3_Sub29) Static356.aClass136_28.method3503(((long) arg0.anInt600 << 32) + (long) arg0.anInt583);
		return local13 == null ? arg0.aClass3_Sub29_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	public static void method1166() {
		@Pc(12) byte[] local12;
		if (Static583.anObject22 == null) {
			@Pc(5) Class12_Sub1_Sub1 local5 = new Class12_Sub1_Sub1();
			local12 = local5.method6282();
			Static583.anObject22 = Static710.method9254(local12);
		}
		if (Static95.anObject7 == null) {
			@Pc(32) Class12_Sub2_Sub2 local32 = new Class12_Sub2_Sub2();
			local12 = local32.method8806();
			Static95.anObject7 = Static710.method9254(local12);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1167() {
		for (@Pc(1) int local1 = 0; local1 < Static362.anInt8653; local1++) {
			@Pc(6) int[] local6 = Static84.anIntArrayArray9[local1];
			for (@Pc(8) int local8 = 0; local8 < Static206.anInt11291; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!av;IIIIIIIIIII)V")
	public static void method1168(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label908: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class20 local6 = arg0[local1];
			if (local6 != null && local6.anInt556 == arg1) {
				@Pc(19) int local19 = local6.anInt524 + arg6;
				@Pc(24) int local24 = local6.anInt574 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt532 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt509;
					local47 = local24 + local6.anInt569;
					if (local6.anInt532 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt532 == 0 || local6.aBoolean36 || method1164(local6).anInt5450 != 0 || local6 == Static85.aClass20_5 || local6.anInt552 == Static163.anInt3046 || local6.anInt552 == Static187.anInt3294 || local6.anInt552 == Static241.anInt4520 || local6.anInt552 == Static650.anInt10442) {
					if (!method1183(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static178.aBoolean264) {
							local42 = Static448.method6652();
							local47 = Static143.method2382();
						}
						if (local6 == Static509.aClass20_16 && Static182.method2795(Static509.aClass20_16) != null) {
							Static414.aBoolean572 = true;
							Static636.anInt10303 = local19;
							Static224.anInt4275 = local24;
						}
						if (local6.aBoolean37 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean38 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(220) Class3_Sub7 local220 = (Class3_Sub7) Static102.aClass357_6.method8391(); local220 != null; local220 = (Class3_Sub7) Static102.aClass357_6.method8392()) {
									if (local220.aBoolean13) {
										local220.method9446();
										local220.aClass20_2.aBoolean32 = false;
									}
								}
								if (Static349.anInt5938 == 0) {
									Static509.aClass20_16 = null;
									Static85.aClass20_5 = null;
								}
								Static618.anInt6009 = 0;
								Static615.aBoolean725 = false;
								Static638.aBoolean748 = false;
								if (!Static555.aBoolean678) {
									Static716.method9348();
								}
							}
							@Pc(308) boolean local308 = local6.aBoolean46 && local6.anInt532 == 5 && local6.anInt576 == 0 && local6.anInt541 < 0 && local6.anInt595 == -1 && local6.anInt557 == -1 && !local6.aBoolean45 && local6.anInt577 == 0;
							@Pc(310) boolean local310 = false;
							@Pc(402) int local402;
							if (Static714.aClass161_1.method8581() + local42 >= local30 && Static714.aClass161_1.method8573() + local47 >= local32 && Static714.aClass161_1.method8581() + local42 < local34 && Static714.aClass161_1.method8573() + local47 < local36) {
								if (local308) {
									@Pc(353) Class331 local353 = local6.method473(Static488.aClass67_12);
									if (local353 != null && local353.anInt9432 == local6.anInt509 && local353.anInt9431 == local6.anInt569) {
										@Pc(380) int local380 = Static714.aClass161_1.method8581() + local42 - local19;
										@Pc(388) int local388 = Static714.aClass161_1.method8573() + local47 - local24;
										if (local388 >= 0 && local388 < local353.anIntArray524.length) {
											local402 = local353.anIntArray524[local388];
											if (local380 >= local402 && local380 <= local402 + local353.anIntArray523[local388]) {
												local310 = true;
											}
										}
									} else {
										local310 = true;
									}
								} else {
									local310 = true;
								}
							}
							if (!Static212.aBoolean297 && local310) {
								if (local6.anInt530 >= 0) {
									Static355.anInt6021 = local6.anInt530;
								} else if (local6.aBoolean38) {
									Static355.anInt6021 = -1;
								}
							}
							if (!Static555.aBoolean678 && local310) {
								Static439.method6397(local6, arg10 - local19, arg10 - local24);
							}
							@Pc(462) boolean local462 = false;
							if (Static714.aClass161_1.method8579() && local310) {
								local462 = true;
							}
							@Pc(474) boolean local474 = false;
							@Pc(479) Class3_Sub14 local479 = (Class3_Sub14) Static641.aClass357_61.method8391();
							@Pc(549) int local549;
							@Pc(555) int local555;
							@Pc(569) int local569;
							@Pc(524) Class331 local524;
							if (local479 != null && local479.method4295() == 0 && local479.method4292() >= local30 && local479.method4294() >= local32 && local479.method4292() < local34 && local479.method4294() < local36) {
								if (local308) {
									local524 = local6.method473(Static488.aClass67_12);
									if (local524 != null && local524.anInt9432 == local6.anInt509 && local524.anInt9431 == local6.anInt569) {
										local549 = local479.method4292() - local19;
										local555 = local479.method4294() - local24;
										if (local555 >= 0 && local555 < local524.anIntArray524.length) {
											local569 = local524.anIntArray524[local555];
											if (local549 >= local569 && local549 <= local569 + local524.anIntArray523[local555]) {
												local474 = true;
											}
										}
									} else {
										local474 = true;
									}
								} else {
									local474 = true;
								}
							}
							if (local6.aByteArray7 != null && !Static92.method1254()) {
								for (local402 = 0; local402 < local6.aByteArray7.length; local402++) {
									if (Static419.aClass133_1.method3450(local6.aByteArray7[local402])) {
										if (local6.anIntArray29 == null || Static269.anInt4883 >= local6.anIntArray29[local402]) {
											@Pc(634) byte local634 = local6.aByteArray6[local402];
											if (local634 == 0 || ((local634 & 0x8) == 0 || !Static419.aClass133_1.method3450(86) && !Static419.aClass133_1.method3450(82) && !Static419.aClass133_1.method3450(81)) && ((local634 & 0x2) == 0 || Static419.aClass133_1.method3450(86)) && ((local634 & 0x1) == 0 || Static419.aClass133_1.method3450(82)) && ((local634 & 0x4) == 0 || Static419.aClass133_1.method3450(81))) {
												if (local402 < 10) {
													Static298.method3453(local402 + 1, "", local6.anInt600, -1);
												} else if (local402 == 10) {
													Static427.method6535();
													@Pc(726) Class3_Sub29 local726 = method1164(local6);
													Static229.method3585(local6, local726.anInt5441, local726.method4617());
													Static177.aString97 = Static182.method2796(local6);
													if (Static177.aString97 == null) {
														Static177.aString97 = "Null";
													}
													Static90.aString28 = local6.aString8 + "<col=ffffff>";
												}
												local555 = local6.anIntArray25[local402];
												if (local6.anIntArray29 == null) {
													local6.anIntArray29 = new int[local6.aByteArray7.length];
												}
												if (local555 == 0) {
													local6.anIntArray29[local402] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray29[local402] = Static269.anInt4883 + local555;
												}
											}
										}
									} else if (local6.anIntArray29 != null) {
										local6.anIntArray29[local402] = 0;
									}
								}
							}
							if (local474) {
								Static448.method6653(local6, local47 + local479.method4294() - local24, local42 + local479.method4292() - local19);
							}
							if (Static509.aClass20_16 != null && Static509.aClass20_16 != local6 && local310 && method1164(local6).method4619()) {
								Static704.aClass20_19 = local6;
							}
							if (local6 == Static85.aClass20_5) {
								Static89.aBoolean123 = true;
								Static535.anInt9010 = local19;
								Static162.anInt3022 = local24;
							}
							if (local6.aBoolean36 || local6.anInt552 != 0) {
								@Pc(877) Class3_Sub7 local877;
								if (local310 && Static217.anInt4222 != 0 && local6.anObjectArray22 != null) {
									local877 = new Class3_Sub7();
									local877.aBoolean13 = true;
									local877.aClass20_2 = local6;
									local877.anInt375 = Static217.anInt4222;
									local877.anObjectArray1 = local6.anObjectArray22;
									Static102.aClass357_6.method8401(local877);
								}
								if (Static509.aClass20_16 != null) {
									local474 = false;
									local462 = false;
								} else if (Static555.aBoolean678 || local6.anInt552 != Static638.anInt10345 && Static618.anInt6009 > 0) {
									local474 = false;
									local462 = false;
									local310 = false;
								}
								if (local6.anInt552 != 0) {
									if (local6.anInt552 == Static241.anInt4520 || local6.anInt552 == Static650.anInt10442) {
										Static474.aClass20_14 = local6;
										if (Static492.aClass275_4 != null) {
											Static492.aClass275_4.method6914(Static713.aClass3_Sub55_31.aClass15_Sub27_1.method9037(), Static488.aClass67_12, local6.anInt569);
										}
										if (local6.anInt552 == Static241.anInt4520) {
											if (Static555.aBoolean678 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static567.method7891(arg9, arg8, Static488.aClass67_12);
											@Pc(991) Class19_Sub2 local991 = (Class19_Sub2) Static624.aClass66_9.method1381();
											while (true) {
												if (local991 == null) {
													continue label908;
												}
												if (arg10 >= local991.anInt1541 && arg10 < local991.anInt1545 && arg11 >= local991.anInt1540 && arg11 < local991.anInt1539) {
													Static716.method9348();
													Static463.method6846(local991.aClass19_Sub1_Sub3_Sub2_1);
												}
												local991 = (Class19_Sub2) Static624.aClass66_9.method1380();
											}
										}
									}
									if (local6.anInt552 == Static163.anInt3046) {
										local524 = local6.method473(Static488.aClass67_12);
										if (local524 == null || Static412.anInt7313 != 0 && Static412.anInt7313 != 3 || Static555.aBoolean678 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local549 = arg10 - local19;
										local555 = arg11 - local24;
										local569 = local524.anIntArray524[local555];
										if (local549 < local569 || local549 > local569 + local524.anIntArray523[local555]) {
											continue;
										}
										local549 -= local6.anInt509 / 2;
										local555 -= local6.anInt569 / 2;
										@Pc(1125) int local1125;
										if (Static175.anInt10579 == 4) {
											local1125 = (int) Static658.aFloat196 & 0x3FFF;
										} else {
											local1125 = (int) Static658.aFloat196 + Static543.anInt9108 & 0x3FFF;
										}
										@Pc(1137) int local1137 = Class3_Sub2_Sub21.anIntArray358[local1125];
										@Pc(1141) int local1141 = Class3_Sub2_Sub21.anIntArray356[local1125];
										if (Static175.anInt10579 != 4) {
											local1137 = local1137 * (Static61.anInt953 + 256) >> 8;
											local1141 = local1141 * (Static61.anInt953 + 256) >> 8;
										}
										@Pc(1170) int local1170 = local555 * local1137 + local549 * local1141 >> 14;
										@Pc(1180) int local1180 = local555 * local1141 - local549 * local1137 >> 14;
										@Pc(1191) int local1191;
										@Pc(1199) int local1199;
										if (Static175.anInt10579 == 4) {
											local1191 = (Static599.anInt9774 >> 9) + (local1170 >> 2);
											local1199 = (Static46.anInt795 >> 9) - (local1180 >> 2);
										} else {
											@Pc(1208) int local1208 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() - 1) * 256;
											local1191 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 - local1208 >> 9) + (local1170 >> 2);
											local1199 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 - local1208 >> 9) - (local1180 >> 2);
										}
										if (Static212.aBoolean297 && (Static718.anInt11231 & 0x40) != 0) {
											@Pc(1243) Class20 local1243 = Static244.method3731(Static397.anInt7112, Static198.anInt3491);
											if (local1243 == null) {
												Static427.method6535();
											} else {
												Static91.method1249(Static27.anInt421, Static177.aString97, 1L, (long) (local6.anInt583 << 0 | local6.anInt600), 57, local1199, false, true, local1191, " ->", true, local6.anInt595);
											}
											continue;
										}
										if (Static667.aClass169_8 == Static726.aClass169_12) {
											Static91.method1249(-1, Static476.aClass279_27.method6992(Static141.anInt2658), 1L, 0L, 49, local1199, false, true, local1191, "", true, -1);
										}
										Static91.method1249(Static701.anInt10980, Static475.aString111, 1L, 0L, 45, local1199, false, true, local1191, "", true, -1);
										continue;
									}
									if (local6.anInt552 == Static638.anInt10345) {
										Static440.aClass20_13 = local6;
										if (local310) {
											Static615.aBoolean725 = true;
										}
										if (local474) {
											local402 = (int) ((double) (local42 + local479.method4292() - local19 - local6.anInt509 / 2) * 2.0D / (double) Static654.aFloat160);
											local549 = (int) -((double) (local47 + local479.method4294() - local24 - local6.anInt569 / 2) * 2.0D / (double) Static654.aFloat160);
											local555 = Static481.anInt8380 + local402 + Static654.anInt8153;
											local569 = Static442.anInt10084 + local549 + Static654.anInt8150;
											@Pc(1383) Class3_Sub4_Sub19 local1383 = Static90.method1215();
											if (local1383 == null) {
												continue;
											}
											@Pc(1388) int[] local1388 = new int[3];
											local1383.method7609(local569, local1388, local555);
											if (local1388 != null) {
												if (Static419.aClass133_1.method3450(82) && Static651.anInt10450 > 0) {
													Static405.method6054(local1388[2], local1388[0], local1388[1]);
													continue;
												}
												Static638.aBoolean748 = true;
												Static337.anInt5853 = local1388[0];
												Static78.anInt1228 = local1388[1];
												Static251.anInt4689 = local1388[2];
											}
											Static618.anInt6009 = 1;
											Static210.aBoolean295 = false;
											Static273.anInt5007 = Static714.aClass161_1.method8581();
											Static445.anInt7712 = Static714.aClass161_1.method8573();
											continue;
										}
										if (local462 && Static618.anInt6009 > 0) {
											if (Static618.anInt6009 == 1 && (Static273.anInt5007 != Static714.aClass161_1.method8581() || Static445.anInt7712 != Static714.aClass161_1.method8573())) {
												Static668.anInt3468 = Static481.anInt8380;
												Static37.anInt700 = Static442.anInt10084;
												Static618.anInt6009 = 2;
											}
											if (Static618.anInt6009 == 2) {
												Static210.aBoolean295 = true;
												Static613.method8356(Static668.anInt3468 + (int) ((double) (Static273.anInt5007 - Static714.aClass161_1.method8581()) * 2.0D / (double) Static654.aFloat159));
												Static435.method6370(Static37.anInt700 - (int) ((double) (Static445.anInt7712 - Static714.aClass161_1.method8573()) * 2.0D / (double) Static654.aFloat159), (byte) -20);
											}
											continue;
										}
										if (Static618.anInt6009 > 0 && !Static210.aBoolean295) {
											if ((Static78.anInt1229 == 1 || Static79.method1033()) && Static285.anInt5168 > 2) {
												Static34.method517(Static273.anInt5007, Static445.anInt7712);
											} else if (Static453.method6736()) {
												Static34.method517(Static273.anInt5007, Static445.anInt7712);
											}
										}
										Static618.anInt6009 = 0;
										continue;
									}
									if (local6.anInt552 == Static545.anInt7058) {
										if (local462) {
											Static606.method4293(local47 + Static714.aClass161_1.method8573() - local24, local42 + Static714.aClass161_1.method8581() - local19, local6.anInt569, local6.anInt509);
										}
										continue;
									}
									if (local6.anInt552 == Static187.anInt3294) {
										Static69.method855(local6, local19, local24);
										continue;
									}
								}
								if (!local6.aBoolean47 && local474) {
									local6.aBoolean47 = true;
									if (local6.anObjectArray10 != null) {
										local877 = new Class3_Sub7();
										local877.aBoolean13 = true;
										local877.aClass20_2 = local6;
										local877.anInt376 = local42 + local479.method4292() - local19;
										local877.anInt375 = local47 + local479.method4294() - local24;
										local877.anObjectArray1 = local6.anObjectArray10;
										Static102.aClass357_6.method8401(local877);
									}
								}
								if (local6.aBoolean47 && local462 && local6.anObjectArray19 != null) {
									local877 = new Class3_Sub7();
									local877.aBoolean13 = true;
									local877.aClass20_2 = local6;
									local877.anInt376 = local42 + Static714.aClass161_1.method8581() - local19;
									local877.anInt375 = local47 + Static714.aClass161_1.method8573() - local24;
									local877.anObjectArray1 = local6.anObjectArray19;
									Static102.aClass357_6.method8401(local877);
								}
								if (local6.aBoolean47 && !local462) {
									local6.aBoolean47 = false;
									if (local6.anObjectArray20 != null) {
										local877 = new Class3_Sub7();
										local877.aBoolean13 = true;
										local877.aClass20_2 = local6;
										local877.anInt376 = local42 + Static714.aClass161_1.method8581() - local19;
										local877.anInt375 = local47 + Static714.aClass161_1.method8573() - local24;
										local877.anObjectArray1 = local6.anObjectArray20;
										Static439.aClass357_44.method8401(local877);
									}
								}
								if (local462 && local6.anObjectArray25 != null) {
									local877 = new Class3_Sub7();
									local877.aBoolean13 = true;
									local877.aClass20_2 = local6;
									local877.anInt376 = local42 + Static714.aClass161_1.method8581() - local19;
									local877.anInt375 = local47 + Static714.aClass161_1.method8573() - local24;
									local877.anObjectArray1 = local6.anObjectArray25;
									Static102.aClass357_6.method8401(local877);
								}
								if (!local6.aBoolean32 && local310) {
									local6.aBoolean32 = true;
									if (local6.anObjectArray27 != null) {
										local877 = new Class3_Sub7();
										local877.aBoolean13 = true;
										local877.aClass20_2 = local6;
										local877.anInt376 = local42 + Static714.aClass161_1.method8581() - local19;
										local877.anInt375 = local47 + Static714.aClass161_1.method8573() - local24;
										local877.anObjectArray1 = local6.anObjectArray27;
										Static102.aClass357_6.method8401(local877);
									}
								}
								if (local6.aBoolean32 && local310 && local6.anObjectArray35 != null) {
									local877 = new Class3_Sub7();
									local877.aBoolean13 = true;
									local877.aClass20_2 = local6;
									local877.anInt376 = local42 + Static714.aClass161_1.method8581() - local19;
									local877.anInt375 = local47 + Static714.aClass161_1.method8573() - local24;
									local877.anObjectArray1 = local6.anObjectArray35;
									Static102.aClass357_6.method8401(local877);
								}
								if (local6.aBoolean32 && !local310) {
									local6.aBoolean32 = false;
									if (local6.anObjectArray9 != null) {
										local877 = new Class3_Sub7();
										local877.aBoolean13 = true;
										local877.aClass20_2 = local6;
										local877.anInt376 = local42 + Static714.aClass161_1.method8581() - local19;
										local877.anInt375 = local47 + Static714.aClass161_1.method8573() - local24;
										local877.anObjectArray1 = local6.anObjectArray9;
										Static439.aClass357_44.method8401(local877);
									}
								}
								if (local6.anObjectArray23 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray23;
									Static357.aClass357_32.method8401(local877);
								}
								@Pc(2022) Class3_Sub7 local2022;
								if (local6.anObjectArray21 != null && Static575.anInt9439 > local6.anInt539) {
									if (local6.anIntArray31 == null || Static575.anInt9439 - local6.anInt539 > 32) {
										local877 = new Class3_Sub7();
										local877.aClass20_2 = local6;
										local877.anObjectArray1 = local6.anObjectArray21;
										Static102.aClass357_6.method8401(local877);
									} else {
										label768: for (local402 = local6.anInt539; local402 < Static575.anInt9439; local402++) {
											local549 = Static556.anIntArray509[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray31.length; local555++) {
												if (local6.anIntArray31[local555] == local549) {
													local2022 = new Class3_Sub7();
													local2022.aClass20_2 = local6;
													local2022.anObjectArray1 = local6.anObjectArray21;
													Static102.aClass357_6.method8401(local2022);
													break label768;
												}
											}
										}
									}
									local6.anInt539 = Static575.anInt9439;
								}
								if (local6.anObjectArray32 != null && Static189.anInt3336 > local6.anInt586) {
									if (local6.anIntArray30 == null || Static189.anInt3336 - local6.anInt586 > 32) {
										local877 = new Class3_Sub7();
										local877.aClass20_2 = local6;
										local877.anObjectArray1 = local6.anObjectArray32;
										Static102.aClass357_6.method8401(local877);
									} else {
										label744: for (local402 = local6.anInt586; local402 < Static189.anInt3336; local402++) {
											local549 = Static413.anIntArray395[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray30.length; local555++) {
												if (local6.anIntArray30[local555] == local549) {
													local2022 = new Class3_Sub7();
													local2022.aClass20_2 = local6;
													local2022.anObjectArray1 = local6.anObjectArray32;
													Static102.aClass357_6.method8401(local2022);
													break label744;
												}
											}
										}
									}
									local6.anInt586 = Static189.anInt3336;
								}
								if (local6.anObjectArray8 != null && Static644.anInt10388 > local6.anInt529) {
									if (local6.anIntArray26 == null || Static644.anInt10388 - local6.anInt529 > 32) {
										local877 = new Class3_Sub7();
										local877.aClass20_2 = local6;
										local877.anObjectArray1 = local6.anObjectArray8;
										Static102.aClass357_6.method8401(local877);
									} else {
										label720: for (local402 = local6.anInt529; local402 < Static644.anInt10388; local402++) {
											local549 = Static311.anIntArray312[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray26.length; local555++) {
												if (local6.anIntArray26[local555] == local549) {
													local2022 = new Class3_Sub7();
													local2022.aClass20_2 = local6;
													local2022.anObjectArray1 = local6.anObjectArray8;
													Static102.aClass357_6.method8401(local2022);
													break label720;
												}
											}
										}
									}
									local6.anInt529 = Static644.anInt10388;
								}
								if (local6.anObjectArray14 != null && Static267.anInt4865 > local6.anInt587) {
									if (local6.anIntArray33 == null || Static267.anInt4865 - local6.anInt587 > 32) {
										local877 = new Class3_Sub7();
										local877.aClass20_2 = local6;
										local877.anObjectArray1 = local6.anObjectArray14;
										Static102.aClass357_6.method8401(local877);
									} else {
										label696: for (local402 = local6.anInt587; local402 < Static267.anInt4865; local402++) {
											local549 = Static162.anIntArray146[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray33.length; local555++) {
												if (local6.anIntArray33[local555] == local549) {
													local2022 = new Class3_Sub7();
													local2022.aClass20_2 = local6;
													local2022.anObjectArray1 = local6.anObjectArray14;
													Static102.aClass357_6.method8401(local2022);
													break label696;
												}
											}
										}
									}
									local6.anInt587 = Static267.anInt4865;
								}
								if (local6.anObjectArray7 != null && Static149.anInt2805 > local6.anInt565) {
									if (local6.anIntArray28 == null || Static149.anInt2805 - local6.anInt565 > 32) {
										local877 = new Class3_Sub7();
										local877.aClass20_2 = local6;
										local877.anObjectArray1 = local6.anObjectArray7;
										Static102.aClass357_6.method8401(local877);
									} else {
										label672: for (local402 = local6.anInt565; local402 < Static149.anInt2805; local402++) {
											local549 = Static465.anIntArray441[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray28.length; local555++) {
												if (local6.anIntArray28[local555] == local549) {
													local2022 = new Class3_Sub7();
													local2022.aClass20_2 = local6;
													local2022.anObjectArray1 = local6.anObjectArray7;
													Static102.aClass357_6.method8401(local2022);
													break label672;
												}
											}
										}
									}
									local6.anInt565 = Static149.anInt2805;
								}
								if (local6.anObjectArray5 != null && Static436.anInt7615 > local6.anInt575) {
									if (local6.anIntArray32 == null || Static436.anInt7615 - local6.anInt575 > 32) {
										local877 = new Class3_Sub7();
										local877.aClass20_2 = local6;
										local877.anObjectArray1 = local6.anObjectArray5;
										Static102.aClass357_6.method8401(local877);
									} else {
										label648: for (local402 = local6.anInt575; local402 < Static436.anInt7615; local402++) {
											local549 = Static298.anIntArray220[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray32.length; local555++) {
												if (local6.anIntArray32[local555] == local549) {
													local2022 = new Class3_Sub7();
													local2022.aClass20_2 = local6;
													local2022.anObjectArray1 = local6.anObjectArray5;
													Static102.aClass357_6.method8401(local2022);
													break label648;
												}
											}
										}
									}
									local6.anInt575 = Static436.anInt7615;
								}
								if (Static221.anInt4262 > local6.anInt562 && local6.anObjectArray2 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray2;
									Static102.aClass357_6.method8401(local877);
								}
								if (Static455.anInt8019 > local6.anInt562 && local6.anObjectArray11 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray11;
									Static102.aClass357_6.method8401(local877);
								}
								if (Static708.anInt11073 > local6.anInt562 && local6.anObjectArray31 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray31;
									Static102.aClass357_6.method8401(local877);
								}
								if (Static373.anInt6383 > local6.anInt562 && local6.anObjectArray13 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray13;
									Static102.aClass357_6.method8401(local877);
								}
								if (Static262.anInt4819 > local6.anInt562 && local6.anObjectArray15 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray15;
									Static102.aClass357_6.method8401(local877);
								}
								if (Static161.anInt2958 > local6.anInt562 && local6.anObjectArray26 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray26;
									Static102.aClass357_6.method8401(local877);
								}
								if (Static372.anInt6365 > local6.anInt562 && local6.anObjectArray3 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray3;
									Static102.aClass357_6.method8401(local877);
								}
								local6.anInt562 = Static210.anInt3647;
								if (local6.anObjectArray33 != null) {
									for (local402 = 0; local402 < Static225.anInt4285; local402++) {
										@Pc(2682) Class3_Sub7 local2682 = new Class3_Sub7();
										local2682.aClass20_2 = local6;
										local2682.anInt370 = Static165.anInterface3Array2[local402].method666();
										local2682.anInt372 = Static165.anInterface3Array2[local402].method668();
										local2682.anObjectArray1 = local6.anObjectArray33;
										Static102.aClass357_6.method8401(local2682);
									}
								}
								if (Static386.aBoolean417 && local6.anObjectArray6 != null) {
									local877 = new Class3_Sub7();
									local877.aClass20_2 = local6;
									local877.anObjectArray1 = local6.anObjectArray6;
									Static102.aClass357_6.method8401(local877);
								}
							}
							if (local6.anInt532 == 5 && local6.anInt541 != -1) {
								local6.method459(Static103.aClass114_1, Static102.aClass126_1).method6914(Static713.aClass3_Sub55_31.aClass15_Sub27_1.method9037(), Static488.aClass67_12, local6.anInt569);
							}
							Static318.method4780(local6);
							if (local6.anInt532 == 0) {
								method1168(arg0, local6.anInt600, local30, local32, local34, local36, local19 - local6.anInt537, local24 - local6.anInt554, arg8, arg9, arg10, arg11);
								if (local6.aClass20Array2 != null) {
									method1168(local6.aClass20Array2, local6.anInt600, local30, local32, local34, local36, local19 - local6.anInt537, local24 - local6.anInt554, arg8, arg9, arg10, arg11);
								}
								@Pc(2824) Class3_Sub52 local2824 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local6.anInt600);
								if (local2824 != null) {
									if (Static667.aClass169_8 == Static615.aClass169_7 && local2824.anInt10201 == 0 && !Static555.aBoolean678 && local310 && !Static632.aBoolean738) {
										Static716.method9348();
									}
									Static230.method3624(arg9, local36, arg11, arg8, local32, local34, local19, local24, local30, local2824.anInt10202, arg10);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static318.method4780(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	public static void method1170(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static558.anInt9284;
		@Pc(3) int[] local3 = Static408.anIntArray393;
		@Pc(9) int local9;
		if (Static334.anInt5845 == 3) {
			local9 = Static154.aClass11Array1.length;
		} else {
			local9 = local1 + Static337.anInt5854;
		}
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(31) Class19_Sub1_Sub3_Sub2 local31;
			if (Static334.anInt5845 == 3) {
				@Pc(24) Class11 local24 = Static154.aClass11Array1[local16];
				if (!local24.aBoolean10) {
					continue;
				}
				local31 = local24.method295();
			} else {
				if (local16 < local1) {
					local31 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local3[local16]];
				} else {
					local31 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local16 - local1])).aClass19_Sub1_Sub3_Sub2_Sub1_2;
				}
				if (local31.aByte146 != arg0 || local31.anInt7774 < 0) {
					continue;
				}
			}
			@Pc(69) int local69 = local31.method6592();
			if ((local69 & 0x1) == 0) {
				if ((local31.anInt11204 & 0x1FF) != 0 || (local31.anInt11211 & 0x1FF) != 0) {
					continue;
				}
			} else if ((local31.anInt11204 & 0x1FF) != 256 || (local31.anInt11211 & 0x1FF) != 256) {
				continue;
			}
			@Pc(113) int local113;
			@Pc(118) int local118;
			@Pc(155) int local155;
			if (local69 == 1) {
				local113 = local31.anInt11204 >> 9;
				local118 = local31.anInt11211 >> 9;
				if (local31.anInt7774 > Static84.anIntArrayArray9[local113][local118]) {
					Static84.anIntArrayArray9[local113][local118] = local31.anInt7774;
					Static723.anIntArrayArray63[local113][local118] = 1;
				} else if (local31.anInt7774 == Static84.anIntArrayArray9[local113][local118]) {
					local155 = Static723.anIntArrayArray63[local113][local118]++;
				}
			} else {
				local113 = (local69 - 1) * 256 + 60;
				local118 = local31.anInt11204 - local113 >> 9;
				@Pc(182) int local182 = local31.anInt11211 - local113 >> 9;
				@Pc(189) int local189 = local31.anInt11204 + local113 >> 9;
				@Pc(196) int local196 = local31.anInt11211 + local113 >> 9;
				for (@Pc(198) int local198 = local118; local198 <= local189; local198++) {
					for (@Pc(201) int local201 = local182; local201 <= local196; local201++) {
						if (local31.anInt7774 > Static84.anIntArrayArray9[local198][local201]) {
							Static84.anIntArrayArray9[local198][local201] = local31.anInt7774;
							Static723.anIntArrayArray63[local198][local201] = 1;
						} else if (local31.anInt7774 == Static84.anIntArrayArray9[local198][local201]) {
							local155 = Static723.anIntArrayArray63[local198][local201]++;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1171(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static558.anInt9284;
		@Pc(3) int[] local3 = Static408.anIntArray393;
		@Pc(9) int local9;
		if (Static334.anInt5845 == 3) {
			local9 = Static154.aClass11Array1.length;
		} else {
			local9 = Static471.aBoolean766 ? local1 : local1 + Static337.anInt5854;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class19_Sub1_Sub3_Sub2 local36;
			if (Static334.anInt5845 == 3) {
				@Pc(29) Class11 local29 = Static154.aClass11Array1[local21];
				if (!local29.aBoolean10) {
					continue;
				}
				local36 = local29.method295();
			} else {
				if (local21 < local1) {
					local36 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local3[local21]];
				} else {
					local36 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local21 - local1])).aClass19_Sub1_Sub3_Sub2_Sub1_2;
				}
				if (local36.aByte146 != arg0) {
					continue;
				}
				if (local36.anInt7774 < 0) {
					local36.aBoolean594 = false;
					continue;
				}
			}
			local36.anInt7804 = 0;
			@Pc(80) int local80 = local36.method6592();
			if ((local80 & 0x1) == 0) {
				if ((local36.anInt11204 & 0x1FF) != 0 || (local36.anInt11211 & 0x1FF) != 0) {
					local36.aBoolean594 = false;
					continue;
				}
			} else if ((local36.anInt11204 & 0x1FF) != 256 || (local36.anInt11211 & 0x1FF) != 256) {
				local36.aBoolean594 = false;
				continue;
			}
			if (Static334.anInt5845 != 3) {
				@Pc(135) int local135;
				@Pc(140) int local140;
				@Pc(166) int local166;
				if (local80 == 1) {
					local135 = local36.anInt11204 >> 9;
					local140 = local36.anInt11211 >> 9;
					if (local36.anInt7774 != Static84.anIntArrayArray9[local135][local140]) {
						local36.aBoolean594 = true;
						continue;
					}
					if (Static723.anIntArrayArray63[local135][local140] > 1) {
						local166 = Static723.anIntArrayArray63[local135][local140]--;
						local36.aBoolean594 = true;
						continue;
					}
				} else {
					local135 = (local80 - 1) * 256 + 252;
					local140 = local36.anInt11204 - local135 >> 9;
					@Pc(196) int local196 = local36.anInt11211 - local135 >> 9;
					@Pc(203) int local203 = local36.anInt11204 + local135 >> 9;
					@Pc(210) int local210 = local36.anInt11211 + local135 >> 9;
					if (!Static611.method7554(local36.anInt7774, local196, local203, local210, local140)) {
						for (@Pc(221) int local221 = local140; local221 <= local203; local221++) {
							for (@Pc(224) int local224 = local196; local224 <= local210; local224++) {
								if (local36.anInt7774 == Static84.anIntArrayArray9[local221][local224]) {
									local166 = Static723.anIntArrayArray63[local221][local224]--;
								}
							}
						}
						local36.aBoolean594 = true;
						continue;
					}
				}
			}
			local36.aBoolean594 = false;
			local36.anInt11208 = Static505.method7237(local36.aByte146, local36.anInt11211, local36.anInt11204);
			Static137.method2240(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!av;)Lclient!av;")
	public static Class20 method1173(@OriginalArg(0) Class20 arg0) {
		@Pc(4) int local4 = method1164(arg0).method4616();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static118.method2045(arg0.anInt556);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1174() {
		@Pc(1) int local1 = Static558.anInt9284;
		@Pc(3) int[] local3 = Static408.anIntArray393;
		@Pc(8) int local8 = Static713.aClass3_Sub55_31.aClass15_Sub9_1.method3122();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class19_Sub1_Sub3_Sub2_Sub2 local39 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local3[local32]];
			if (!local39.method6612()) {
				local39.anInt7774 = -1;
			} else if (local39.aBoolean602) {
				local39.anInt7774 = -1;
			} else {
				local39.method8182();
				if (local39.aShort121 >= 0 && local39.aShort124 >= 0 && local39.aShort123 < Static362.anInt8653 && local39.aShort122 < Static206.anInt11291) {
					local39.aBoolean603 = local39.aBoolean595 ? local30 : false;
					if (local39 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2) {
						local39.anInt7774 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean594) {
							local103++;
						}
						if (local39.anInt7782 > Static269.anInt4883) {
							local103 += 2;
						}
						local103 += 5 - local39.method6592() << 2;
						if (local39.aBoolean600 || local39.aBoolean599) {
							local103 += 512;
						} else {
							if (Static303.anInt5471 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt7774 = local103 + 1;
					}
				} else {
					local39.anInt7774 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static337.anInt5854; local155++) {
			@Pc(166) Class19_Sub1_Sub3_Sub2_Sub1 local166 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local155])).aClass19_Sub1_Sub3_Sub2_Sub1_2;
			if (local166.method3437() && local166.aClass18_1.method404(Static577.aClass362_1)) {
				local166.method8182();
				if (local166.aShort121 >= 0 && local166.aShort124 >= 0 && local166.aShort123 < Static362.anInt8653 && local166.aShort122 < Static206.anInt11291) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean594) {
						local213++;
					}
					if (local166.anInt7782 > Static269.anInt4883) {
						local213 += 2;
					}
					local213 += 5 - local166.method6592() << 2;
					if (Static303.anInt5471 == 0) {
						if (local166.aClass18_1.aBoolean23) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static303.anInt5471 == 1) {
						if (local166.aClass18_1.aBoolean23) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass18_1.aBoolean19) {
						local213 += 1024;
					} else if (!local166.aClass18_1.aBoolean21) {
						local213 += 256;
					}
					local166.anInt7774 = local213 + 1;
				} else {
					local166.anInt7774 = -1;
				}
			} else {
				local166.anInt7774 = -1;
			}
		}
		for (local103 = 0; local103 < Static672.aClass387Array1.length; local103++) {
			@Pc(292) Class387 local292 = Static672.aClass387Array1[local103];
			if (local292 != null) {
				if (local292.anInt10809 == 1) {
					@Pc(308) Class3_Sub13 local308 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local292.anInt10811);
					if (local308 != null) {
						@Pc(313) Class19_Sub1_Sub3_Sub2_Sub1 local313 = local308.aClass19_Sub1_Sub3_Sub2_Sub1_2;
						if (local313.anInt7774 >= 0) {
							local313.anInt7774 += 2048;
						}
					}
				} else if (local292.anInt10809 == 10) {
					@Pc(333) Class19_Sub1_Sub3_Sub2_Sub2 local333 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local292.anInt10811];
					if (local333 != null && local333 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 && local333.anInt7774 >= 0) {
						local333.anInt7774 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
	public static boolean method1177(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;IILjava/lang/String;ZI)V")
	public static void method1178(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static412.aClass221_119.anInt5968 = 1;
		@Pc(11) String local11 = arg3.toLowerCase();
		@Pc(21) short[] local21 = new short[16];
		@Pc(23) int local23 = -1;
		@Pc(25) String local25 = null;
		if (arg5 != -1) {
			@Pc(33) Class319 local33 = Static646.aClass106_1.method2677(arg5);
			if (local33 == null || local33.method7779() != arg0) {
				return;
			}
			if (local33.method7779()) {
				local25 = local33.aString121;
			} else {
				local23 = local33.anInt9232;
			}
		}
		@Pc(66) int local66 = 0;
		for (@Pc(68) int local68 = 0; local68 < Static243.aClass406_2.anInt11253; local68++) {
			@Pc(75) Class91 local75 = Static243.aClass406_2.method9394(local68);
			if ((!arg4 || local75.aBoolean224) && local75.anInt2681 == -1 && local75.anInt2678 == -1 && local75.anInt2732 == -1 && local75.anInt2677 == 0 && local75.aString47.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg0) {
						if (!arg1.equals(local75.method2363(arg5, local25))) {
							continue;
						}
					} else if (local75.method2368(local23, arg5) != arg2) {
						continue;
					}
				}
				if (local66 >= 250) {
					Static121.aShortArray35 = null;
					Static453.anInt8000 = -1;
					return;
				}
				if (local21.length <= local66) {
					@Pc(178) short[] local178 = new short[local21.length * 2];
					for (@Pc(180) int local180 = 0; local180 < local66; local180++) {
						local178[local180] = local21[local180];
					}
					local21 = local178;
				}
				local21[local66++] = (short) local68;
			}
		}
		Static453.anInt8000 = local66;
		Static121.aShortArray35 = local21;
		Static367.anInt6201 = 0;
		@Pc(220) String[] local220 = new String[Static453.anInt8000];
		for (@Pc(222) int local222 = 0; local222 < Static453.anInt8000; local222++) {
			local220[local222] = Static243.aClass406_2.method9394(local21[local222]).aString47;
		}
		Static415.method6178(local220, Static121.aShortArray35);
		Static412.aClass221_119.method5095();
		Static412.aClass221_119.anInt5968 = 2;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Z")
	public static boolean method1179(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 12 || arg0 == 10;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1180() {
		Static510.anInt10779 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static337.anInt5854; local3++) {
			@Pc(14) Class19_Sub1_Sub3_Sub2_Sub1 local14 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local3])).aClass19_Sub1_Sub3_Sub2_Sub1_2;
			if (local14.aBoolean594 && local14.method6603() != -1) {
				@Pc(34) int local34 = (local14.method6592() - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt11204 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt11211 - local34 >> 9;
				@Pc(55) Class19_Sub1_Sub3_Sub2 local55 = Static573.method7945(local41, local14.aByte146, local48);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt7796;
					if (local55 instanceof Class19_Sub1_Sub3_Sub2_Sub1) {
						local60 += 2048;
					}
					if (local55.anInt7804 == 0 && local55.method6603() != -1) {
						Static513.anIntArray586[Static510.anInt10779] = local60;
						Static613.anIntArray549[Static510.anInt10779] = local60;
						Static510.anInt10779++;
						local55.anInt7804++;
					}
					Static513.anIntArray586[Static510.anInt10779] = local60;
					Static613.anIntArray549[Static510.anInt10779] = local14.anInt7796 + 2048;
					Static510.anInt10779++;
					local55.anInt7804++;
				}
			}
		}
		Static483.method7047(0, Static513.anIntArray586, Static613.anIntArray549, Static510.anInt10779 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLclient!ha;II)V")
	public static void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.KA(arg3, arg0, arg3 + arg1, arg0 - -arg4);
		arg2.method7696(arg3, arg4, arg1, arg0, -16777216);
		if (Static193.anInt3390 < 100) {
			return;
		}
		@Pc(37) float local37 = (float) Static654.anInt8148 / (float) Static654.anInt8155;
		@Pc(39) int local39 = arg1;
		@Pc(41) int local41 = arg4;
		if (local37 < 1.0F) {
			local41 = (int) ((float) arg1 * local37);
		} else {
			local39 = (int) ((float) arg4 / local37);
		}
		@Pc(68) int local68 = arg3 + (arg1 - local39) / 2;
		@Pc(77) int local77 = arg0 + (arg4 - local41) / 2;
		if (Static297.aClass9_16 == null || Static297.aClass9_16.method8602() != arg1 || arg4 != Static297.aClass9_16.method8611()) {
			Static654.method6879(Static654.anInt8153, Static654.anInt8148 + Static654.anInt8150, Static654.anInt8155 + Static654.anInt8153, Static654.anInt8150, local68, local77, local68 + local39, local41 + local77);
			Static654.method6892(arg2);
			Static297.aClass9_16 = arg2.method7664(local68, local77, local39, local41, false);
		}
		Static297.aClass9_16.method8617(local68, local77);
		@Pc(138) int local138 = local39 * Static104.anInt1668 / Static654.anInt8155;
		@Pc(144) int local144 = Static716.anInt11194 * local41 / Static654.anInt8148;
		@Pc(152) int local152 = local68 + Static653.anInt10489 * local39 / Static654.anInt8155;
		@Pc(172) int local172 = local77 + local41 - Static69.anInt1062 * local41 / Static654.anInt8148 - local144;
		@Pc(174) int local174 = -1996554240;
		if (Static726.aClass169_12 == Static667.aClass169_8) {
			local174 = -1996488705;
		}
		arg2.aa(local152, local172, local138, local144, local174, 1);
		arg2.method7700(local152, local172, local138, local144, local174, 0);
		if (Static148.anInt2790 <= 0) {
			return;
		}
		@Pc(209) int local209;
		if (Static608.anInt9862 > 50) {
			local209 = (100 - Static608.anInt9862) * 5;
		} else {
			local209 = Static608.anInt9862 * 5;
		}
		for (@Pc(220) Class3_Sub12 local220 = (Class3_Sub12) Static654.aClass357_50.method8391(); local220 != null; local220 = (Class3_Sub12) Static654.aClass357_50.method8392()) {
			@Pc(228) Class105 local228 = Static654.aClass98_4.method2452(local220.anInt950);
			if (Static223.method3522(local228)) {
				@Pc(252) int local252;
				@Pc(264) int local264;
				if (Static143.anInt2734 == local220.anInt950) {
					local252 = local68 + local39 * local220.anInt952 / Static654.anInt8155;
					local264 = local41 * (Static654.anInt8148 - local220.anInt947) / Static654.anInt8148 + local77;
					arg2.method7696(local252 - 2, 4, 4, local264 - 2, local209 << 24 | 0xFFFF00);
				} else if (Static541.anInt6223 != -1 && Static541.anInt6223 == local228.anInt3089) {
					local252 = local68 + local220.anInt952 * local39 / Static654.anInt8155;
					local264 = local41 * (Static654.anInt8148 - local220.anInt947) / Static654.anInt8148 + local77;
					arg2.method7696(local252 - 2, 4, 4, local264 - 2, local209 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!av;)Z")
	public static boolean method1183(@OriginalArg(0) Class20 arg0) {
		if (Static632.aBoolean738) {
			if (method1164(arg0).anInt5450 != 0) {
				return false;
			}
			if (arg0.anInt532 == 0) {
				return false;
			}
		}
		return arg0.aBoolean42;
	}
}
