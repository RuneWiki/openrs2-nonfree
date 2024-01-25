import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!wc;")
	public static Class394 aClass394_3;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!af;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!tt;")
	public static Class2_Sub6_Sub20 aClass2_Sub6_Sub20_2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "M", descriptor = "Ljava/lang/Class;")
	public static Class aClass14;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	public static int anInt1623 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIII)V")
	public static void method1396(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) long local15 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(21) Class2_Sub3 local21 = (Class2_Sub3) Static710.aClass218_45.method5095(local15, 0);
		if (local21 == null) {
			local21 = new Class2_Sub3();
			Static710.aClass218_45.method5099(local21, local15);
		}
		if (arg2 >= local21.anIntArray28.length) {
			@Pc(49) int[] local49 = new int[arg2 + 1];
			@Pc(54) int[] local54 = new int[arg2 + 1];
			for (@Pc(56) int local56 = 0; local56 < local21.anIntArray28.length; local56++) {
				local49[local56] = local21.anIntArray28[local56];
				local54[local56] = local21.anIntArray29[local56];
			}
			for (@Pc(88) int local88 = local21.anIntArray28.length; local88 < arg2; local88++) {
				local49[local88] = -1;
				local54[local88] = 0;
			}
			local21.anIntArray28 = local49;
			local21.anIntArray29 = local54;
		}
		local21.anIntArray28[arg2] = arg4;
		local21.anIntArray29[arg2] = arg3;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1397() {
		@Pc(1) int local1 = Static268.anInt4162;
		@Pc(3) int[] local3 = Static597.anIntArray677;
		@Pc(8) int local8 = Static650.aClass2_Sub30_29.aClass11_Sub24_1.method7746();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class4_Sub2_Sub1_Sub2_Sub1 local39 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local3[local32]];
			if (!local39.method739()) {
				local39.anInt2315 = -1;
			} else if (local39.aBoolean104) {
				local39.anInt2315 = -1;
			} else {
				local39.method8985();
				if (local39.aShort130 >= 0 && local39.aShort127 >= 0 && local39.aShort128 < Static426.anInt6942 && local39.aShort129 < Static280.anInt6752) {
					local39.aBoolean103 = local39.aBoolean248 ? local30 : false;
					if (local39 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2) {
						local39.anInt2315 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean247) {
							local103++;
						}
						if (local39.anInt2333 > Static528.anInt8386) {
							local103 += 2;
						}
						local103 += 5 - local39.method2046() << 2;
						if (local39.aBoolean102 || local39.aBoolean99) {
							local103 += 512;
						} else {
							if (Static450.anInt7298 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt2315 = local103 + 1;
					}
				} else {
					local39.anInt2315 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static217.anInt3445; local155++) {
			@Pc(166) Class4_Sub2_Sub1_Sub2_Sub2 local166 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local155], 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
			if (local166.method2073() && local166.aClass261_1.method6268(Static396.aClass107_1)) {
				local166.method8985();
				if (local166.aShort130 >= 0 && local166.aShort127 >= 0 && local166.aShort128 < Static426.anInt6942 && local166.aShort129 < Static280.anInt6752) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean247) {
						local213++;
					}
					if (local166.anInt2333 > Static528.anInt8386) {
						local213 += 2;
					}
					local213 += 5 - local166.method2046() << 2;
					if (Static450.anInt7298 == 0) {
						if (local166.aClass261_1.aBoolean587) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static450.anInt7298 == 1) {
						if (local166.aClass261_1.aBoolean587) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass261_1.aBoolean592) {
						local213 += 1024;
					} else if (!local166.aClass261_1.aBoolean588) {
						local213 += 256;
					}
					local166.anInt2315 = local213 + 1;
				} else {
					local166.anInt2315 = -1;
				}
			} else {
				local166.anInt2315 = -1;
			}
		}
		for (local103 = 0; local103 < Static690.aClass350Array1.length; local103++) {
			@Pc(292) Class350 local292 = Static690.aClass350Array1[local103];
			if (local292 != null) {
				if (local292.anInt9441 == 1) {
					@Pc(308) Class2_Sub49 local308 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local292.anInt9439, 0);
					if (local308 != null) {
						@Pc(313) Class4_Sub2_Sub1_Sub2_Sub2 local313 = local308.aClass4_Sub2_Sub1_Sub2_Sub2_3;
						if (local313.anInt2315 >= 0) {
							local313.anInt2315 += 2048;
						}
					}
				} else if (local292.anInt9441 == 10) {
					@Pc(333) Class4_Sub2_Sub1_Sub2_Sub1 local333 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local292.anInt9439];
					if (local333 != null && local333 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 && local333.anInt2315 >= 0) {
						local333.anInt2315 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!oh;)Z")
	public static boolean method1398(@OriginalArg(0) Class273 arg0) {
		if (Static311.aBoolean411) {
			if (method1412(arg0).anInt3441 != 0) {
				return false;
			}
			if (arg0.anInt7371 == 0) {
				return false;
			}
		}
		return arg0.aBoolean631;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!oh;)Lclient!oh;")
	public static Class273 method1399(@OriginalArg(0) Class273 arg0) {
		@Pc(4) int local4 = method1412(arg0).method3012();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static417.method6111(arg0.anInt7392);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!oh;IIIIIIIIIII)V")
	public static void method1400(@OriginalArg(0) Class273[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label908: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class273 local6 = arg0[local1];
			if (local6 != null && local6.anInt7392 == arg1) {
				@Pc(19) int local19 = local6.anInt7373 + arg6;
				@Pc(24) int local24 = local6.anInt7346 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt7371 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt7402;
					local47 = local24 + local6.anInt7385;
					if (local6.anInt7371 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt7371 == 0 || local6.aBoolean628 || method1412(local6).anInt3441 != 0 || local6 == Static175.aClass273_18 || local6.anInt7401 == Static406.anInt6699 || local6.anInt7401 == Static716.anInt10909 || local6.anInt7401 == Static138.anInt2277 || local6.anInt7401 == Static262.anInt4076) {
					if (!method1398(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static392.aBoolean549) {
							local42 = Static637.method3733();
							local47 = Static400.method5900();
						}
						if (local6 == Static650.aClass273_17 && Static346.method4804(Static650.aClass273_17) != null) {
							Static515.aBoolean708 = true;
							Static154.anInt2563 = local19;
							Static238.anInt3744 = local24;
						}
						if (local6.aBoolean626 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean635 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(220) Class2_Sub36 local220 = (Class2_Sub36) Static592.aClass60_189.method1226(7); local220 != null; local220 = (Class2_Sub36) Static592.aClass60_189.method1228()) {
									if (local220.aBoolean433) {
										local220.method9872();
										local220.aClass273_6.aBoolean629 = false;
									}
								}
								if (Static278.anInt4344 == 0) {
									Static650.aClass273_17 = null;
									Static175.aClass273_18 = null;
								}
								Static230.anInt3651 = 0;
								Static517.aBoolean713 = false;
								Static520.aBoolean716 = false;
								if (!Static189.aBoolean301) {
									Static8.method114();
								}
							}
							@Pc(308) boolean local308 = local6.aBoolean637 && local6.anInt7371 == 5 && local6.anInt7355 == 0 && local6.anInt7424 < 0 && local6.anInt7415 == -1 && local6.anInt7367 == -1 && !local6.aBoolean627 && local6.anInt7340 == 0;
							@Pc(310) boolean local310 = false;
							@Pc(402) int local402;
							if (Static402.aClass138_1.method4767() + local42 >= local30 && Static402.aClass138_1.method4771() + local47 >= local32 && Static402.aClass138_1.method4767() + local42 < local34 && Static402.aClass138_1.method4771() + local47 < local36) {
								if (local308) {
									@Pc(353) Class114 local353 = local6.method6608(Static396.aClass145_6);
									if (local353 != null && local353.anInt2886 == local6.anInt7402 && local353.anInt2887 == local6.anInt7385) {
										@Pc(380) int local380 = Static402.aClass138_1.method4767() + local42 - local19;
										@Pc(388) int local388 = Static402.aClass138_1.method4771() + local47 - local24;
										if (local388 >= 0 && local388 < local353.anIntArray216.length) {
											local402 = local353.anIntArray216[local388];
											if (local380 >= local402 && local380 <= local402 + local353.anIntArray215[local388]) {
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
							if (!Static581.aBoolean787 && local310) {
								if (local6.anInt7333 >= 0) {
									Static85.anInt1436 = local6.anInt7333;
								} else if (local6.aBoolean635) {
									Static85.anInt1436 = -1;
								}
							}
							if (!Static189.aBoolean301 && local310) {
								Static522.method7374(arg10 - local24, local6, arg10 - local19);
							}
							@Pc(462) boolean local462 = false;
							if (Static402.aClass138_1.method4769() && local310) {
								local462 = true;
							}
							@Pc(474) boolean local474 = false;
							@Pc(479) Class2_Sub18 local479 = (Class2_Sub18) Static171.aClass60_55.method1226(7);
							@Pc(549) int local549;
							@Pc(555) int local555;
							@Pc(569) int local569;
							@Pc(524) Class114 local524;
							if (local479 != null && local479.method7126() == 0 && local479.method7122() >= local30 && local479.method7124() >= local32 && local479.method7122() < local34 && local479.method7124() < local36) {
								if (local308) {
									local524 = local6.method6608(Static396.aClass145_6);
									if (local524 != null && local524.anInt2886 == local6.anInt7402 && local524.anInt2887 == local6.anInt7385) {
										local549 = local479.method7122() - local19;
										local555 = local479.method7124() - local24;
										if (local555 >= 0 && local555 < local524.anIntArray216.length) {
											local569 = local524.anIntArray216[local555];
											if (local549 >= local569 && local549 <= local569 + local524.anIntArray215[local555]) {
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
							if (local6.aByteArray96 != null && !Static20.method277()) {
								for (local402 = 0; local402 < local6.aByteArray96.length; local402++) {
									if (Static102.aClass184_1.method6058(local6.aByteArray96[local402])) {
										if (local6.anIntArray529 == null || Static528.anInt8386 >= local6.anIntArray529[local402]) {
											@Pc(634) byte local634 = local6.aByteArray95[local402];
											if (local634 == 0 || ((local634 & 0x8) == 0 || !Static102.aClass184_1.method6058(86) && !Static102.aClass184_1.method6058(82) && !Static102.aClass184_1.method6058(81)) && ((local634 & 0x2) == 0 || Static102.aClass184_1.method6058(86)) && ((local634 & 0x1) == 0 || Static102.aClass184_1.method6058(82)) && ((local634 & 0x4) == 0 || Static102.aClass184_1.method6058(81))) {
												if (local402 < 10) {
													Static411.method6030(local402 + 1, "", local6.anInt7350, -1);
												} else if (local402 == 10) {
													Static643.method8704();
													@Pc(726) Class2_Sub31 local726 = method1412(local6);
													Static498.method7107(local726.method3010(), local6, local726.anInt3442);
													Static175.aString127 = Static83.method1240(local6);
													if (Static175.aString127 == null) {
														Static175.aString127 = "Null";
													}
													Static701.aString94 = local6.aString82 + "<col=ffffff>";
												}
												local555 = local6.anIntArray525[local402];
												if (local6.anIntArray529 == null) {
													local6.anIntArray529 = new int[local6.aByteArray96.length];
												}
												if (local555 == 0) {
													local6.anIntArray529[local402] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray529[local402] = Static528.anInt8386 + local555;
												}
											}
										}
									} else if (local6.anIntArray529 != null) {
										local6.anIntArray529[local402] = 0;
									}
								}
							}
							if (local474) {
								Static289.method4070(local42 + local479.method7122() - local19, local6, local47 + local479.method7124() - local24);
							}
							if (Static650.aClass273_17 != null && Static650.aClass273_17 != local6 && local310 && method1412(local6).method3009()) {
								Static121.aClass273_2 = local6;
							}
							if (local6 == Static175.aClass273_18) {
								Static168.aBoolean286 = true;
								Static460.anInt10191 = local19;
								Static184.anInt3049 = local24;
							}
							if (local6.aBoolean628 || local6.anInt7401 != 0) {
								@Pc(877) Class2_Sub36 local877;
								if (local310 && Static204.anInt3328 != 0 && local6.anObjectArray4 != null) {
									local877 = new Class2_Sub36();
									local877.aBoolean433 = true;
									local877.aClass273_6 = local6;
									local877.anInt5073 = Static204.anInt3328;
									local877.anObjectArray2 = local6.anObjectArray4;
									Static592.aClass60_189.method1233(local877);
								}
								if (Static650.aClass273_17 != null) {
									local474 = false;
									local462 = false;
								} else if (Static189.aBoolean301 || local6.anInt7401 != Static547.anInt8632 && Static230.anInt3651 > 0) {
									local474 = false;
									local462 = false;
									local310 = false;
								}
								if (local6.anInt7401 != 0) {
									if (local6.anInt7401 == Static138.anInt2277 || local6.anInt7401 == Static262.anInt4076) {
										Static291.aClass273_5 = local6;
										if (Static315.aClass358_20 != null) {
											Static315.aClass358_20.method8432(Static650.aClass2_Sub30_29.aClass11_Sub17_1.method4360(), Static396.aClass145_6, local6.anInt7385);
										}
										if (local6.anInt7401 == Static138.anInt2277) {
											if (Static189.aBoolean301 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static364.method5229(arg9, arg8, Static396.aClass145_6);
											@Pc(991) Class4_Sub5 local991 = (Class4_Sub5) Static363.aClass320_4.method7605();
											while (true) {
												if (local991 == null) {
													continue label908;
												}
												if (arg10 >= local991.anInt1782 && arg10 < local991.anInt1784 && arg11 >= local991.anInt1778 && arg11 < local991.anInt1776) {
													Static8.method114();
													Static126.method1855(local991.aClass4_Sub2_Sub1_Sub2_1);
												}
												local991 = (Class4_Sub5) Static363.aClass320_4.method7608();
											}
										}
									}
									if (local6.anInt7401 == Static406.anInt6699) {
										local524 = local6.method6608(Static396.aClass145_6);
										if (local524 == null || Static238.anInt3745 != 0 && Static238.anInt3745 != 3 || Static189.aBoolean301 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local549 = arg10 - local19;
										local555 = arg11 - local24;
										local569 = local524.anIntArray216[local555];
										if (local549 < local569 || local549 > local569 + local524.anIntArray215[local555]) {
											continue;
										}
										local549 -= local6.anInt7402 / 2;
										local555 -= local6.anInt7385 / 2;
										@Pc(1125) int local1125;
										if (Static60.anInt1040 == 4) {
											local1125 = (int) Static213.aFloat46 & 0x3FFF;
										} else {
											local1125 = (int) Static213.aFloat46 + anInt1623 & 0x3FFF;
										}
										@Pc(1137) int local1137 = Class145_Sub1.anIntArray761[local1125];
										@Pc(1141) int local1141 = Class145_Sub1.anIntArray760[local1125];
										if (Static60.anInt1040 != 4) {
											local1137 = local1137 * (Static505.anInt8017 + 256) >> 8;
											local1141 = local1141 * (Static505.anInt8017 + 256) >> 8;
										}
										@Pc(1170) int local1170 = local555 * local1137 + local549 * local1141 >> 14;
										@Pc(1180) int local1180 = local555 * local1141 - local549 * local1137 >> 14;
										@Pc(1191) int local1191;
										@Pc(1199) int local1199;
										if (Static60.anInt1040 == 4) {
											local1191 = (Static670.anInt10429 >> 9) + (local1170 >> 2);
											local1199 = (Static712.anInt10863 >> 9) - (local1180 >> 2);
										} else {
											@Pc(1208) int local1208 = (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() - 1) * 256;
											local1191 = (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 - local1208 >> 9) + (local1170 >> 2);
											local1199 = (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 - local1208 >> 9) - (local1180 >> 2);
										}
										if (Static581.aBoolean787 && (Static523.anInt6605 & 0x40) != 0) {
											@Pc(1243) Class273 local1243 = Static147.method2144(Static203.anInt3318, Static166.anInt2883);
											if (local1243 == null) {
												Static643.method8704();
											} else {
												Static27.method371(Static96.anInt1729, (long) (local6.anInt7410 << 0 | local6.anInt7350), true, local6.anInt7415, Static175.aString127, true, 49, false, " ->", 1L, local1199, local1191);
											}
											continue;
										}
										if (Static249.aClass150_6 == Static174.aClass150_3) {
											Static27.method371(-1, 0L, true, -1, Static289.aClass191_27.method4067(Static414.anInt9485), true, 3, false, "", 1L, local1199, local1191);
										}
										Static27.method371(Static240.anInt10698, 0L, true, -1, Static612.aString104, true, 6, false, "", 1L, local1199, local1191);
										continue;
									}
									if (local6.anInt7401 == Static547.anInt8632) {
										Static388.aClass273_10 = local6;
										if (local310) {
											Static517.aBoolean713 = true;
										}
										if (local474) {
											local402 = (int) ((double) (local42 + local479.method7122() - local19 - local6.anInt7402 / 2) * 2.0D / (double) Static90.aFloat43);
											local549 = (int) -((double) (local47 + local479.method7124() - local24 - local6.anInt7385 / 2) * 2.0D / (double) Static90.aFloat43);
											local555 = Static681.anInt10509 + local402 + Static90.anInt3353;
											local569 = Static704.anInt10775 + local549 + Static90.anInt3348;
											@Pc(1383) Class2_Sub6_Sub21 local1383 = Static199.method2816();
											if (local1383 == null) {
												continue;
											}
											@Pc(1388) int[] local1388 = new int[3];
											local1383.method8514(local569, local1388, local555);
											if (local1388 != null) {
												if (Static102.aClass184_1.method6058(82) && Static565.anInt8888 > 0) {
													Static233.method3334(local1388[1], local1388[0], local1388[2]);
													continue;
												}
												Static520.aBoolean716 = true;
												Static104.anInt1801 = local1388[0];
												Static716.anInt10910 = local1388[1];
												Static645.anInt9906 = local1388[2];
											}
											Static230.anInt3651 = 1;
											Static263.aBoolean361 = false;
											Static497.anInt7962 = Static402.aClass138_1.method4767();
											Static358.anInt5727 = Static402.aClass138_1.method4771();
											continue;
										}
										if (local462 && Static230.anInt3651 > 0) {
											if (Static230.anInt3651 == 1 && (Static497.anInt7962 != Static402.aClass138_1.method4767() || Static358.anInt5727 != Static402.aClass138_1.method4771())) {
												Static76.anInt1342 = Static681.anInt10509;
												Static673.anInt10474 = Static704.anInt10775;
												Static230.anInt3651 = 2;
											}
											if (Static230.anInt3651 == 2) {
												Static263.aBoolean361 = true;
												Static347.method4811(Static76.anInt1342 + (int) ((double) (Static497.anInt7962 - Static402.aClass138_1.method4767()) * 2.0D / (double) Static90.aFloat42));
												Static20.method278(Static673.anInt10474 - (int) ((double) (Static358.anInt5727 - Static402.aClass138_1.method4771()) * 2.0D / (double) Static90.aFloat42));
											}
											continue;
										}
										if (Static230.anInt3651 > 0 && !Static263.aBoolean361) {
											if ((Static410.anInt6714 == 1 || Static174.method2605()) && Static535.anInt8486 > 2) {
												Static726.method9868(Static497.anInt7962, Static358.anInt5727);
											} else if (Static710.method9458()) {
												Static726.method9868(Static497.anInt7962, Static358.anInt5727);
											}
										}
										Static230.anInt3651 = 0;
										continue;
									}
									if (local6.anInt7401 == Static80.anInt1370) {
										if (local462) {
											Static132.method1923(local6.anInt7385, local42 + Static402.aClass138_1.method4767() - local19, local6.anInt7402, local47 + Static402.aClass138_1.method4771() - local24);
										}
										continue;
									}
									if (local6.anInt7401 == Static716.anInt10909) {
										Static366.method5264(local6, local19, local24);
										continue;
									}
								}
								if (!local6.aBoolean638 && local474) {
									local6.aBoolean638 = true;
									if (local6.anObjectArray20 != null) {
										local877 = new Class2_Sub36();
										local877.aBoolean433 = true;
										local877.aClass273_6 = local6;
										local877.anInt5077 = local42 + local479.method7122() - local19;
										local877.anInt5073 = local47 + local479.method7124() - local24;
										local877.anObjectArray2 = local6.anObjectArray20;
										Static592.aClass60_189.method1233(local877);
									}
								}
								if (local6.aBoolean638 && local462 && local6.anObjectArray28 != null) {
									local877 = new Class2_Sub36();
									local877.aBoolean433 = true;
									local877.aClass273_6 = local6;
									local877.anInt5077 = local42 + Static402.aClass138_1.method4767() - local19;
									local877.anInt5073 = local47 + Static402.aClass138_1.method4771() - local24;
									local877.anObjectArray2 = local6.anObjectArray28;
									Static592.aClass60_189.method1233(local877);
								}
								if (local6.aBoolean638 && !local462) {
									local6.aBoolean638 = false;
									if (local6.anObjectArray33 != null) {
										local877 = new Class2_Sub36();
										local877.aBoolean433 = true;
										local877.aClass273_6 = local6;
										local877.anInt5077 = local42 + Static402.aClass138_1.method4767() - local19;
										local877.anInt5073 = local47 + Static402.aClass138_1.method4771() - local24;
										local877.anObjectArray2 = local6.anObjectArray33;
										Static238.aClass60_79.method1233(local877);
									}
								}
								if (local462 && local6.anObjectArray19 != null) {
									local877 = new Class2_Sub36();
									local877.aBoolean433 = true;
									local877.aClass273_6 = local6;
									local877.anInt5077 = local42 + Static402.aClass138_1.method4767() - local19;
									local877.anInt5073 = local47 + Static402.aClass138_1.method4771() - local24;
									local877.anObjectArray2 = local6.anObjectArray19;
									Static592.aClass60_189.method1233(local877);
								}
								if (!local6.aBoolean629 && local310) {
									local6.aBoolean629 = true;
									if (local6.anObjectArray17 != null) {
										local877 = new Class2_Sub36();
										local877.aBoolean433 = true;
										local877.aClass273_6 = local6;
										local877.anInt5077 = local42 + Static402.aClass138_1.method4767() - local19;
										local877.anInt5073 = local47 + Static402.aClass138_1.method4771() - local24;
										local877.anObjectArray2 = local6.anObjectArray17;
										Static592.aClass60_189.method1233(local877);
									}
								}
								if (local6.aBoolean629 && local310 && local6.anObjectArray25 != null) {
									local877 = new Class2_Sub36();
									local877.aBoolean433 = true;
									local877.aClass273_6 = local6;
									local877.anInt5077 = local42 + Static402.aClass138_1.method4767() - local19;
									local877.anInt5073 = local47 + Static402.aClass138_1.method4771() - local24;
									local877.anObjectArray2 = local6.anObjectArray25;
									Static592.aClass60_189.method1233(local877);
								}
								if (local6.aBoolean629 && !local310) {
									local6.aBoolean629 = false;
									if (local6.anObjectArray37 != null) {
										local877 = new Class2_Sub36();
										local877.aBoolean433 = true;
										local877.aClass273_6 = local6;
										local877.anInt5077 = local42 + Static402.aClass138_1.method4767() - local19;
										local877.anInt5073 = local47 + Static402.aClass138_1.method4771() - local24;
										local877.anObjectArray2 = local6.anObjectArray37;
										Static238.aClass60_79.method1233(local877);
									}
								}
								if (local6.anObjectArray31 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray31;
									Static574.aClass60_184.method1233(local877);
								}
								@Pc(2022) Class2_Sub36 local2022;
								if (local6.anObjectArray26 != null && Static13.anInt194 > local6.anInt7344) {
									if (local6.anIntArray532 == null || Static13.anInt194 - local6.anInt7344 > 32) {
										local877 = new Class2_Sub36();
										local877.aClass273_6 = local6;
										local877.anObjectArray2 = local6.anObjectArray26;
										Static592.aClass60_189.method1233(local877);
									} else {
										label768: for (local402 = local6.anInt7344; local402 < Static13.anInt194; local402++) {
											local549 = Static36.anIntArray48[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray532.length; local555++) {
												if (local6.anIntArray532[local555] == local549) {
													local2022 = new Class2_Sub36();
													local2022.aClass273_6 = local6;
													local2022.anObjectArray2 = local6.anObjectArray26;
													Static592.aClass60_189.method1233(local2022);
													break label768;
												}
											}
										}
									}
									local6.anInt7344 = Static13.anInt194;
								}
								if (local6.anObjectArray5 != null && Static11.anInt180 > local6.anInt7361) {
									if (local6.anIntArray526 == null || Static11.anInt180 - local6.anInt7361 > 32) {
										local877 = new Class2_Sub36();
										local877.aClass273_6 = local6;
										local877.anObjectArray2 = local6.anObjectArray5;
										Static592.aClass60_189.method1233(local877);
									} else {
										label744: for (local402 = local6.anInt7361; local402 < Static11.anInt180; local402++) {
											local549 = Static492.anIntArray560[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray526.length; local555++) {
												if (local6.anIntArray526[local555] == local549) {
													local2022 = new Class2_Sub36();
													local2022.aClass273_6 = local6;
													local2022.anObjectArray2 = local6.anObjectArray5;
													Static592.aClass60_189.method1233(local2022);
													break label744;
												}
											}
										}
									}
									local6.anInt7361 = Static11.anInt180;
								}
								if (local6.anObjectArray14 != null && Static49.anInt646 > local6.anInt7398) {
									if (local6.anIntArray528 == null || Static49.anInt646 - local6.anInt7398 > 32) {
										local877 = new Class2_Sub36();
										local877.aClass273_6 = local6;
										local877.anObjectArray2 = local6.anObjectArray14;
										Static592.aClass60_189.method1233(local877);
									} else {
										label720: for (local402 = local6.anInt7398; local402 < Static49.anInt646; local402++) {
											local549 = Static526.anIntArray596[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray528.length; local555++) {
												if (local6.anIntArray528[local555] == local549) {
													local2022 = new Class2_Sub36();
													local2022.aClass273_6 = local6;
													local2022.anObjectArray2 = local6.anObjectArray14;
													Static592.aClass60_189.method1233(local2022);
													break label720;
												}
											}
										}
									}
									local6.anInt7398 = Static49.anInt646;
								}
								if (local6.anObjectArray9 != null && Static167.anInt2888 > local6.anInt7418) {
									if (local6.anIntArray527 == null || Static167.anInt2888 - local6.anInt7418 > 32) {
										local877 = new Class2_Sub36();
										local877.aClass273_6 = local6;
										local877.anObjectArray2 = local6.anObjectArray9;
										Static592.aClass60_189.method1233(local877);
									} else {
										label696: for (local402 = local6.anInt7418; local402 < Static167.anInt2888; local402++) {
											local549 = Static183.anIntArray227[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray527.length; local555++) {
												if (local6.anIntArray527[local555] == local549) {
													local2022 = new Class2_Sub36();
													local2022.aClass273_6 = local6;
													local2022.anObjectArray2 = local6.anObjectArray9;
													Static592.aClass60_189.method1233(local2022);
													break label696;
												}
											}
										}
									}
									local6.anInt7418 = Static167.anInt2888;
								}
								if (local6.anObjectArray29 != null && Static365.anInt5846 > local6.anInt7345) {
									if (local6.anIntArray533 == null || Static365.anInt5846 - local6.anInt7345 > 32) {
										local877 = new Class2_Sub36();
										local877.aClass273_6 = local6;
										local877.anObjectArray2 = local6.anObjectArray29;
										Static592.aClass60_189.method1233(local877);
									} else {
										label672: for (local402 = local6.anInt7345; local402 < Static365.anInt5846; local402++) {
											local549 = Static571.anIntArray656[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray533.length; local555++) {
												if (local6.anIntArray533[local555] == local549) {
													local2022 = new Class2_Sub36();
													local2022.aClass273_6 = local6;
													local2022.anObjectArray2 = local6.anObjectArray29;
													Static592.aClass60_189.method1233(local2022);
													break label672;
												}
											}
										}
									}
									local6.anInt7345 = Static365.anInt5846;
								}
								if (local6.anObjectArray35 != null && Static462.anInt7504 > local6.anInt7403) {
									if (local6.anIntArray530 == null || Static462.anInt7504 - local6.anInt7403 > 32) {
										local877 = new Class2_Sub36();
										local877.aClass273_6 = local6;
										local877.anObjectArray2 = local6.anObjectArray35;
										Static592.aClass60_189.method1233(local877);
									} else {
										label648: for (local402 = local6.anInt7403; local402 < Static462.anInt7504; local402++) {
											local549 = Static271.anIntArray309[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray530.length; local555++) {
												if (local6.anIntArray530[local555] == local549) {
													local2022 = new Class2_Sub36();
													local2022.aClass273_6 = local6;
													local2022.anObjectArray2 = local6.anObjectArray35;
													Static592.aClass60_189.method1233(local2022);
													break label648;
												}
											}
										}
									}
									local6.anInt7403 = Static462.anInt7504;
								}
								if (Static143.anInt2459 > local6.anInt7389 && local6.anObjectArray24 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray24;
									Static592.aClass60_189.method1233(local877);
								}
								if (Static459.anInt7473 > local6.anInt7389 && local6.anObjectArray27 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray27;
									Static592.aClass60_189.method1233(local877);
								}
								if (Static44.anInt591 > local6.anInt7389 && local6.anObjectArray30 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray30;
									Static592.aClass60_189.method1233(local877);
								}
								if (Static133.anInt2219 > local6.anInt7389 && local6.anObjectArray11 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray11;
									Static592.aClass60_189.method1233(local877);
								}
								if (Static210.anInt3379 > local6.anInt7389 && local6.anObjectArray16 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray16;
									Static592.aClass60_189.method1233(local877);
								}
								if (Static500.anInt7992 > local6.anInt7389 && local6.anObjectArray7 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray7;
									Static592.aClass60_189.method1233(local877);
								}
								if (Static539.anInt8520 > local6.anInt7389 && local6.anObjectArray18 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray18;
									Static592.aClass60_189.method1233(local877);
								}
								local6.anInt7389 = Static602.anInt10526;
								if (local6.anObjectArray22 != null) {
									for (local402 = 0; local402 < Static510.anInt8118; local402++) {
										@Pc(2682) Class2_Sub36 local2682 = new Class2_Sub36();
										local2682.aClass273_6 = local6;
										local2682.anInt5075 = Static176.anInterface21Array2[local402].method9556();
										local2682.anInt5076 = Static176.anInterface21Array2[local402].method9558();
										local2682.anObjectArray2 = local6.anObjectArray22;
										Static592.aClass60_189.method1233(local2682);
									}
								}
								if (Static439.aBoolean606 && local6.anObjectArray21 != null) {
									local877 = new Class2_Sub36();
									local877.aClass273_6 = local6;
									local877.anObjectArray2 = local6.anObjectArray21;
									Static592.aClass60_189.method1233(local877);
								}
							}
							if (local6.anInt7371 == 5 && local6.anInt7424 != -1) {
								local6.method6599(Static271.aClass25_1, Static120.aClass232_1).method8432(Static650.aClass2_Sub30_29.aClass11_Sub17_1.method4360(), Static396.aClass145_6, local6.anInt7385);
							}
							Static614.method8345(local6);
							if (local6.anInt7371 == 0) {
								method1400(arg0, local6.anInt7350, local30, local32, local34, local36, local19 - local6.anInt7347, local24 - local6.anInt7342, arg8, arg9, arg10, arg11);
								if (local6.aClass273Array3 != null) {
									method1400(local6.aClass273Array3, local6.anInt7350, local30, local32, local34, local36, local19 - local6.anInt7347, local24 - local6.anInt7342, arg8, arg9, arg10, arg11);
								}
								@Pc(2824) Class2_Sub26 local2824 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local6.anInt7350, 0);
								if (local2824 != null) {
									if (Static249.aClass150_6 == Static395.aClass150_8 && local2824.anInt3019 == 0 && !Static189.aBoolean301 && local310 && !Static311.aBoolean411) {
										Static8.method114();
									}
									Static34.method7590(arg8, local36, arg9, arg11, local24, local2824.anInt3020, local34, local19, local30, arg10, local32);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static614.method8345(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
	public static void method1401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static617.anInt9501 <= arg3 && Static519.anInt8267 >= arg3) {
			@Pc(25) int local25 = Static67.method9535(Static8.anInt99, arg1, Static14.anInt206);
			@Pc(31) int local31 = Static67.method9535(Static8.anInt99, arg2, Static14.anInt206);
			Static96.method1494(local25, arg0, local31, arg3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1402() {
		@Pc(1) int local1 = Static268.anInt4162;
		@Pc(3) int[] local3 = Static597.anIntArray677;
		@Pc(9) int local9;
		if (Static166.anInt2884 == 3) {
			local9 = Static199.aClass61Array1.length;
		} else {
			local9 = Static362.aBoolean492 ? local1 : local1 + Static217.anInt3445;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class4_Sub2_Sub1_Sub2 local36;
			if (Static166.anInt2884 == 3) {
				@Pc(29) Class61 local29 = Static199.aClass61Array1[local21];
				if (!local29.aBoolean151) {
					continue;
				}
				local36 = local29.method1238();
			} else {
				if (local21 < local1) {
					local36 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local3[local21]];
				} else {
					local36 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local21 - local1], 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
				}
				if (local36.anInt2315 < 0) {
					continue;
				}
			}
			@Pc(68) int local68 = local36.method2046();
			if ((local68 & 0x1) == 0) {
				if ((local36.anInt10229 & 0x1FF) == 0 && (local36.anInt10228 & 0x1FF) == 0) {
					continue;
				}
			} else if ((local36.anInt10229 & 0x1FF) == 256 && (local36.anInt10228 & 0x1FF) == 256) {
				continue;
			}
			local36.anInt10234 = Static324.method4554(local36.aByte133, local36.anInt10229, local36.anInt10228);
			Static432.method6282(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)I")
	public static int method1403(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1404() {
		Static623.anInt9548 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static217.anInt3445; local3++) {
			@Pc(14) Class4_Sub2_Sub1_Sub2_Sub2 local14 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local3], 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
			if (local14.aBoolean247 && local14.method2042() != -1) {
				@Pc(34) int local34 = (local14.method2046() - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt10229 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt10228 - local34 >> 9;
				@Pc(55) Class4_Sub2_Sub1_Sub2 local55 = Static474.method6819(local48, local41, local14.aByte133);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt2320;
					if (local55 instanceof Class4_Sub2_Sub1_Sub2_Sub2) {
						local60 += 2048;
					}
					if (local55.anInt2331 == 0 && local55.method2042() != -1) {
						Static101.anIntArray645[Static623.anInt9548] = local60;
						Static467.anIntArray540[Static623.anInt9548] = local60;
						Static623.anInt9548++;
						local55.anInt2331++;
					}
					Static101.anIntArray645[Static623.anInt9548] = local60;
					Static467.anIntArray540[Static623.anInt9548] = local14.anInt2320 + 2048;
					Static623.anInt9548++;
					local55.anInt2331++;
				}
			}
		}
		Static238.method3366(Static467.anIntArray540, Static101.anIntArray645, 0, Static623.anInt9548 - 1);
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	public static void method1405(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static268.anInt4162;
		@Pc(3) int[] local3 = Static597.anIntArray677;
		@Pc(9) int local9;
		if (Static166.anInt2884 == 3) {
			local9 = Static199.aClass61Array1.length;
		} else {
			local9 = Static362.aBoolean492 ? local1 : local1 + Static217.anInt3445;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class4_Sub2_Sub1_Sub2 local36;
			if (Static166.anInt2884 == 3) {
				@Pc(29) Class61 local29 = Static199.aClass61Array1[local21];
				if (!local29.aBoolean151) {
					continue;
				}
				local36 = local29.method1238();
			} else {
				if (local21 < local1) {
					local36 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local3[local21]];
				} else {
					local36 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local21 - local1], 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
				}
				if (local36.aByte133 != arg0) {
					continue;
				}
				if (local36.anInt2315 < 0) {
					local36.aBoolean247 = false;
					continue;
				}
			}
			local36.anInt2331 = 0;
			@Pc(80) int local80 = local36.method2046();
			if ((local80 & 0x1) == 0) {
				if ((local36.anInt10229 & 0x1FF) != 0 || (local36.anInt10228 & 0x1FF) != 0) {
					local36.aBoolean247 = false;
					continue;
				}
			} else if ((local36.anInt10229 & 0x1FF) != 256 || (local36.anInt10228 & 0x1FF) != 256) {
				local36.aBoolean247 = false;
				continue;
			}
			if (Static166.anInt2884 != 3) {
				@Pc(135) int local135;
				@Pc(140) int local140;
				@Pc(166) int local166;
				if (local80 == 1) {
					local135 = local36.anInt10229 >> 9;
					local140 = local36.anInt10228 >> 9;
					if (local36.anInt2315 != Static506.anIntArrayArray50[local135][local140]) {
						local36.aBoolean247 = true;
						continue;
					}
					if (Static648.anIntArrayArray62[local135][local140] > 1) {
						local166 = Static648.anIntArrayArray62[local135][local140]--;
						local36.aBoolean247 = true;
						continue;
					}
				} else {
					local135 = (local80 - 1) * 256 + 252;
					local140 = local36.anInt10229 - local135 >> 9;
					@Pc(196) int local196 = local36.anInt10228 - local135 >> 9;
					@Pc(203) int local203 = local36.anInt10229 + local135 >> 9;
					@Pc(210) int local210 = local36.anInt10228 + local135 >> 9;
					if (!Static464.method6717(local196, local203, local140, local210, local36.anInt2315)) {
						for (@Pc(221) int local221 = local140; local221 <= local203; local221++) {
							for (@Pc(224) int local224 = local196; local224 <= local210; local224++) {
								if (local36.anInt2315 == Static506.anIntArrayArray50[local221][local224]) {
									local166 = Static648.anIntArrayArray62[local221][local224]--;
								}
							}
						}
						local36.aBoolean247 = true;
						continue;
					}
				}
			}
			local36.aBoolean247 = false;
			local36.anInt10234 = Static324.method4554(local36.aByte133, local36.anInt10229, local36.anInt10228);
			Static432.method6282(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)V")
	public static void method1408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1) * arg2 >> 8;
		if (local19 == 0 || arg1 == -1) {
			return;
		}
		if (!Static366.aBoolean494 && Static717.anInt10936 != -1 && Static156.method2243(-1) && !Static65.method992()) {
			Static429.aClass2_Sub23_Sub5_2 = Static232.method3319();
			@Pc(54) Class2_Sub23_Sub5 local54 = Static667.method9088(Static429.aClass2_Sub23_Sub5_2);
			Static641.method8681(local54);
		}
		Static704.method9423(local19, Static727.aClass254_174, arg1);
		Static11.method200(255, -1);
		Static366.aBoolean494 = true;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)I")
	public static int method1409() {
		return Static324.anInt5011;
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	public static void method1410(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static268.anInt4162;
		@Pc(3) int[] local3 = Static597.anIntArray677;
		@Pc(9) int local9;
		if (Static166.anInt2884 == 3) {
			local9 = Static199.aClass61Array1.length;
		} else {
			local9 = local1 + Static217.anInt3445;
		}
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(31) Class4_Sub2_Sub1_Sub2 local31;
			if (Static166.anInt2884 == 3) {
				@Pc(24) Class61 local24 = Static199.aClass61Array1[local16];
				if (!local24.aBoolean151) {
					continue;
				}
				local31 = local24.method1238();
			} else {
				if (local16 < local1) {
					local31 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local3[local16]];
				} else {
					local31 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local16 - local1], 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
				}
				if (local31.aByte133 != arg0 || local31.anInt2315 < 0) {
					continue;
				}
			}
			@Pc(69) int local69 = local31.method2046();
			if ((local69 & 0x1) == 0) {
				if ((local31.anInt10229 & 0x1FF) != 0 || (local31.anInt10228 & 0x1FF) != 0) {
					continue;
				}
			} else if ((local31.anInt10229 & 0x1FF) != 256 || (local31.anInt10228 & 0x1FF) != 256) {
				continue;
			}
			@Pc(113) int local113;
			@Pc(118) int local118;
			@Pc(155) int local155;
			if (local69 == 1) {
				local113 = local31.anInt10229 >> 9;
				local118 = local31.anInt10228 >> 9;
				if (local31.anInt2315 > Static506.anIntArrayArray50[local113][local118]) {
					Static506.anIntArrayArray50[local113][local118] = local31.anInt2315;
					Static648.anIntArrayArray62[local113][local118] = 1;
				} else if (local31.anInt2315 == Static506.anIntArrayArray50[local113][local118]) {
					local155 = Static648.anIntArrayArray62[local113][local118]++;
				}
			} else {
				local113 = (local69 - 1) * 256 + 60;
				local118 = local31.anInt10229 - local113 >> 9;
				@Pc(182) int local182 = local31.anInt10228 - local113 >> 9;
				@Pc(189) int local189 = local31.anInt10229 + local113 >> 9;
				@Pc(196) int local196 = local31.anInt10228 + local113 >> 9;
				for (@Pc(198) int local198 = local118; local198 <= local189; local198++) {
					for (@Pc(201) int local201 = local182; local201 <= local196; local201++) {
						if (local31.anInt2315 > Static506.anIntArrayArray50[local198][local201]) {
							Static506.anIntArrayArray50[local198][local201] = local31.anInt2315;
							Static648.anIntArrayArray62[local198][local201] = 1;
						} else if (local31.anInt2315 == Static506.anIntArrayArray50[local198][local201]) {
							local155 = Static648.anIntArrayArray62[local198][local201]++;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!oh;)Lclient!gn;")
	public static Class2_Sub31 method1412(@OriginalArg(0) Class273 arg0) {
		@Pc(13) Class2_Sub31 local13 = (Class2_Sub31) Static345.aClass218_24.method5095(((long) arg0.anInt7350 << 32) + (long) arg0.anInt7410, 0);
		return local13 == null ? arg0.aClass2_Sub31_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lclient!eg;")
	public static Class4_Sub2_Sub3 method1414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_Sub3_2;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1417() {
		for (@Pc(1) int local1 = 0; local1 < Static426.anInt6942; local1++) {
			@Pc(6) int[] local6 = Static506.anIntArrayArray50[local1];
			for (@Pc(8) int local8 = 0; local8 < Static280.anInt6752; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
