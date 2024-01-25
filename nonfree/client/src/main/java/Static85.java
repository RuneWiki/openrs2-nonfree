import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1464(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static383.anInt7249;
		@Pc(3) int[] local3 = Static404.anIntArray362;
		@Pc(11) int local11 = Static127.aBoolean182 ? local1 : local1 + Static532.anInt9330;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub3_Sub3_Sub1 local23;
			if (local13 < local1) {
				local23 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local13 - local1])).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			}
			if (local23.aByte142 == arg0) {
				local23.anInt3981 = 0;
				if (local23.anInt3975 < 0) {
					local23.aBoolean315 = false;
				} else {
					@Pc(54) int local54 = local23.method3690();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt11022 & 0x1FF) != 0 || (local23.anInt11024 & 0x1FF) != 0) {
							local23.aBoolean315 = false;
							continue;
						}
					} else if ((local23.anInt11022 & 0x1FF) != 256 || (local23.anInt11024 & 0x1FF) != 256) {
						local23.aBoolean315 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt11022 >> 9;
						local101 = local23.anInt11024 >> 9;
						if (local23.anInt3975 != Static236.anIntArrayArray14[local96][local101]) {
							local23.aBoolean315 = true;
							continue;
						}
						if (Static23.anIntArrayArray6[local96][local101] > 1) {
							local126 = Static23.anIntArrayArray6[local96][local101]--;
							local23.aBoolean315 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt11022 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt11024 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt11022 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt11024 + local96 >> 9;
						if (!Static566.method8588(local169, local162, local101, local23.anInt3975, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt3975 == Static236.anIntArrayArray14[local180][local183]) {
										local126 = Static23.anIntArrayArray6[local180][local183]--;
									}
								}
							}
							local23.aBoolean315 = true;
							continue;
						}
					}
					local23.aBoolean315 = false;
					local23.anInt11029 = Static10.method154(local23.anInt11024, local23.anInt11022, local23.aByte142);
					Static69.method1291(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1465() {
		@Pc(1) int local1 = Static383.anInt7249;
		@Pc(3) int[] local3 = Static404.anIntArray362;
		@Pc(11) int local11 = Static127.aBoolean182 ? local1 : local1 + Static532.anInt9330;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub3_Sub3_Sub1 local23;
			if (local13 < local1) {
				local23 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local13 - local1])).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			}
			if (local23.anInt3975 >= 0) {
				@Pc(43) int local43 = local23.method3690();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt11022 & 0x1FF) == 0 && (local23.anInt11024 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt11022 & 0x1FF) == 256 && (local23.anInt11024 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt11029 = Static10.method154(local23.anInt11024, local23.anInt11022, local23.aByte142);
				Static69.method1291(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!uf;)Lclient!bs;")
	public static Class2_Sub11 method1469(@OriginalArg(0) Class357 arg0) {
		@Pc(13) Class2_Sub11 local13 = (Class2_Sub11) Static375.aClass335_19.method8357(((long) arg0.anInt10460 << 32) + (long) arg0.anInt10432);
		return local13 == null ? arg0.aClass2_Sub11_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!uf;)Lclient!uf;")
	public static Class357 method1470(@OriginalArg(0) Class357 arg0) {
		@Pc(4) int local4 = method1469(arg0).method1136();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static647.method9532(arg0.anInt10449);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1471() {
		Static667.anInt10610 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static532.anInt9330; local3++) {
			@Pc(14) Class15_Sub3_Sub3_Sub1_Sub2 local14 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local3])).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			if (local14.aBoolean315 && local14.method3685() != -1) {
				@Pc(32) int local32 = (local14.method3690() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt11022 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt11024 - local32 >> 9;
				@Pc(53) Class15_Sub3_Sub3_Sub1 local53 = Static425.method7007(local14.aByte142, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt3977;
					if (local53 instanceof Class15_Sub3_Sub3_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt3981 == 0 && local53.method3685() != -1) {
						Static359.anIntArray327[Static667.anInt10610] = local58;
						Static447.anIntArray404[Static667.anInt10610] = local58;
						Static667.anInt10610++;
						local53.anInt3981++;
					}
					Static359.anIntArray327[Static667.anInt10610] = local58;
					Static447.anIntArray404[Static667.anInt10610] = local14.anInt3977 + 2048;
					Static667.anInt10610++;
					local53.anInt3981++;
				}
			}
		}
		Static488.method7739(Static667.anInt10610 - 1, Static359.anIntArray327, 0, Static447.anIntArray404);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1474(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static383.anInt7249;
		@Pc(3) int[] local3 = Static404.anIntArray362;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static532.anInt9330; local5++) {
			@Pc(15) Class15_Sub3_Sub3_Sub1 local15;
			if (local5 < local1) {
				local15 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local5 - local1])).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			}
			if (local15.aByte142 == arg0 && local15.anInt3975 >= 0) {
				@Pc(39) int local39 = local15.method3690();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt11022 & 0x1FF) != 0 || (local15.anInt11024 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt11022 & 0x1FF) != 256 || (local15.anInt11024 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt11022 >> 9;
					local80 = local15.anInt11024 >> 9;
					if (local15.anInt3975 > Static236.anIntArrayArray14[local75][local80]) {
						Static236.anIntArrayArray14[local75][local80] = local15.anInt3975;
						Static23.anIntArrayArray6[local75][local80] = 1;
					} else if (local15.anInt3975 == Static236.anIntArrayArray14[local75][local80]) {
						local116 = Static23.anIntArrayArray6[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt11022 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt11024 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt11022 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt11024 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt3975 > Static236.anIntArrayArray14[local158][local161]) {
								Static236.anIntArrayArray14[local158][local161] = local15.anInt3975;
								Static23.anIntArrayArray6[local158][local161] = 1;
							} else if (local15.anInt3975 == Static236.anIntArrayArray14[local158][local161]) {
								local116 = Static23.anIntArrayArray6[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!uf;IIIIIIIIIII)V")
	public static void method1475(@OriginalArg(0) Class357[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class357 local6 = arg0[local1];
			if (local6 != null && local6.anInt10449 == arg1) {
				@Pc(17) int local17 = local6.anInt10431 + arg6;
				@Pc(22) int local22 = local6.anInt10407 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt10430 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt10395;
					local45 = local22 + local6.anInt10465;
					if (local6.anInt10430 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt10430 == 0 || local6.aBoolean750 || method1469(local6).anInt1168 != 0 || local6 == Static539.aClass357_140 || local6.anInt10454 == Static97.anInt1734 || local6.anInt10454 == Static475.anInt8505) {
					if (!method1479(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static450.aBoolean606) {
							local40 = Static106.method1934();
							local45 = Static207.method3926();
						}
						if (local6 == Static267.aClass357_180 && Static418.method6900(Static267.aClass357_180) != null) {
							Static634.aBoolean788 = true;
							Static613.anInt10766 = local17;
							Static233.anInt4648 = local22;
						}
						if (local6.aBoolean761 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean752 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class2_Sub45 local168 = (Class2_Sub45) Static507.aClass271_51.method7177(); local168 != null; local168 = (Class2_Sub45) Static507.aClass271_51.method7175()) {
									if (local168.aBoolean653) {
										local168.method9825();
										local168.aClass357_131.aBoolean764 = false;
									}
								}
								if (Static407.anInt7587 == 0) {
									Static267.aClass357_180 = null;
									Static539.aClass357_140 = null;
								}
								Static429.anInt7877 = 0;
								Static178.aBoolean292 = false;
								Static226.aBoolean360 = false;
								if (!Static183.aBoolean305) {
									Static332.method5480();
								}
							}
							@Pc(232) boolean local232;
							if (Static7.aClass6_1.method7048() + local40 >= local28 && Static7.aClass6_1.method7049() + local45 >= local30 && Static7.aClass6_1.method7048() + local40 < local32 && Static7.aClass6_1.method7049() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static537.aBoolean683 && local232) {
								if (local6.anInt10468 >= 0) {
									Static113.anInt2045 = local6.anInt10468;
								} else if (local6.aBoolean752) {
									Static113.anInt2045 = -1;
								}
							}
							if (!Static183.aBoolean305 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static304.method8964(arg10 - local17, local6, arg11 - local22);
							}
							@Pc(276) boolean local276 = false;
							if (Static7.aClass6_1.method7047() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class2_Sub35 local291 = (Class2_Sub35) Static489.aClass271_50.method7177();
							if (local291 != null && local291.method9190() == 0 && local291.method9186() + local40 >= local28 && local291.method9185() + local45 >= local30 && local291.method9186() + local40 < local32 && local291.method9185() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray93 != null && !Static62.method1158()) {
								for (local335 = 0; local335 < local6.aByteArray93.length; local335++) {
									if (Static202.aClass191_1.method8963(local6.aByteArray93[local335])) {
										if (local6.anIntArray549 == null || Static62.anInt1184 >= local6.anIntArray549[local335]) {
											@Pc(367) byte local367 = local6.lb[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static202.aClass191_1.method8963(86) && !Static202.aClass191_1.method8963(82) && !Static202.aClass191_1.method8963(81)) && ((local367 & 0x2) == 0 || Static202.aClass191_1.method8963(86)) && ((local367 & 0x1) == 0 || Static202.aClass191_1.method8963(82)) && ((local367 & 0x4) == 0 || Static202.aClass191_1.method8963(81))) {
												if (local335 < 10) {
													Static158.method3194("", local335 + 1, local6.anInt10460, -1);
												} else if (local335 == 10) {
													Static417.method6895();
													@Pc(438) Class2_Sub11 local438 = method1469(local6);
													Static390.method6563(local438.method1142(), local438.anInt1160, local6);
													Static526.aString109 = Static181.method3540(local6);
													if (Static526.aString109 == null) {
														Static526.aString109 = "Null";
													}
													Static13.aString100 = local6.aString121 + "<col=ffffff>";
												}
												local469 = local6.anIntArray545[local335];
												if (local6.anIntArray549 == null) {
													local6.anIntArray549 = new int[local6.aByteArray93.length];
												}
												if (local469 == 0) {
													local6.anIntArray549[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray549[local335] = Static62.anInt1184 + local469;
												}
											}
										}
									} else if (local6.anIntArray549 != null) {
										local6.anIntArray549[local335] = 0;
									}
								}
							}
							if (local286) {
								Static465.method7460(local40 + local291.method9186() - local17, local6, local45 + local291.method9185() - local22);
							}
							if (Static267.aClass357_180 != null && Static267.aClass357_180 != local6 && local232 && method1469(local6).method1139()) {
								Static395.aClass357_105 = local6;
							}
							if (local6 == Static539.aClass357_140) {
								Static95.aBoolean119 = true;
								Static535.anInt9366 = local17;
								Static541.anInt9462 = local22;
							}
							if (local6.aBoolean750 || local6.anInt10454 != 0) {
								@Pc(558) Class2_Sub45 local558;
								if (local232 && Static511.anInt9099 != 0 && local6.anObjectArray17 != null) {
									local558 = new Class2_Sub45();
									local558.aBoolean653 = true;
									local558.aClass357_131 = local6;
									local558.anInt9038 = Static511.anInt9099;
									local558.anObjectArray2 = local6.anObjectArray17;
									Static507.aClass271_51.method7174(local558);
								}
								if (Static267.aClass357_180 != null || Static183.aBoolean305 || local6.anInt10454 != Static372.anInt7094 && Static429.anInt7877 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt10454 != 0) {
									if (local6.anInt10454 == Static496.anInt8843 || local6.anInt10454 == Static666.anInt11367) {
										Static615.aClass357_163 = local6;
										if (Static32.aClass251_1 != null) {
											Static32.aClass251_1.method6719(local6.anInt10465, Static607.aClass101_15);
										}
										if (local6.anInt10454 == Static496.anInt8843) {
											if (Static183.aBoolean305 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static372.method6350(Static607.aClass101_15, arg9, arg8);
											@Pc(641) Class15_Sub1 local641 = (Class15_Sub1) Static41.aClass60_1.method1547();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt322 && arg10 < local641.anInt325 && arg11 >= local641.anInt328 && arg11 < local641.anInt327) {
													Static332.method5480();
													Static125.method2261(local641.aClass15_Sub3_Sub3_Sub1_1);
												}
												local641 = (Class15_Sub1) Static41.aClass60_1.method1546();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt10454 == Static97.anInt1734) {
										if (local6.method8989(Static607.aClass101_15) == null || Static460.anInt11073 != 0 && Static460.anInt11073 != 3 || Static183.aBoolean305 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray543[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray550[local708]) {
											continue;
										}
										local335 -= local6.anInt10395 / 2;
										local708 -= local6.anInt10465 / 2;
										if (Static484.anInt8685 == 4) {
											local747 = (int) Static278.aFloat108 & 0x3FFF;
										} else {
											local747 = (int) Static278.aFloat108 + Static275.anInt5119 & 0x3FFF;
										}
										@Pc(759) int local759 = Class12_Sub2.anIntArray204[local747];
										@Pc(763) int local763 = Class12_Sub2.anIntArray203[local747];
										if (Static484.anInt8685 != 4) {
											local759 = local759 * (Static199.anInt4199 + 256) >> 8;
											local763 = local763 * (Static199.anInt4199 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static484.anInt8685 == 4) {
											local813 = (Static293.anInt7589 >> 9) + (local792 >> 2);
											local821 = (Static106.anInt1972 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() - 1) * 256;
											local813 = (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 - local830 >> 9) + (local792 >> 2);
											local821 = (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 - local830 >> 9) - (local802 >> 2);
										}
										if (Static537.aBoolean683 && (Static156.anInt3415 & 0x40) != 0) {
											@Pc(863) Class357 local863 = Static226.method4160(Static590.anInt10293, Static135.anInt2564);
											if (local863 == null) {
												Static417.method6895();
											} else {
												Static335.method5521(local6.anInt10396, true, 1L, " ->", local821, local813, false, true, Static397.anInt11031, (long) (local6.anInt10432 << 0 | local6.anInt10460), 48, Static526.aString109);
											}
											continue;
										}
										if (Static551.aClass229_15 == Static534.aClass229_16) {
											Static335.method5521(-1, true, 1L, "", local821, local813, false, true, -1, 0L, 45, Static205.aClass134_27.method3906(Static204.anInt8130));
										}
										Static335.method5521(-1, true, 1L, "", local821, local813, false, true, Static103.anInt1838, 0L, 2, Static249.aString59);
										continue;
									}
									if (local6.anInt10454 == Static372.anInt7094) {
										Static527.aClass357_137 = local6;
										if (local232) {
											Static178.aBoolean292 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method9186() - local17 - local6.anInt10395 / 2) * 2.0D / (double) Static331.aFloat187);
											local708 = (int) -((double) (local45 + local291.method9185() - local22 - local6.anInt10465 / 2) * 2.0D / (double) Static331.aFloat187);
											local469 = Static43.anInt8888 + local335 + Static331.anInt10589;
											local747 = Static609.anInt10718 + local708 + Static331.anInt10590;
											@Pc(994) Class2_Sub1_Sub9 local994 = Static95.method1628();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method4702(local999, local747, local469);
											if (local999 != null) {
												if (Static202.aClass191_1.method8963(82) && Static31.anInt530 > 0) {
													Static26.method458(local999[1], local999[0], local999[2]);
													continue;
												}
												Static226.aBoolean360 = true;
												Static282.anInt5211 = local999[0];
												Static230.anInt4628 = local999[1];
												Static673.anInt11039 = local999[2];
											}
											Static429.anInt7877 = 1;
											Static387.aBoolean547 = false;
											Static598.anInt10390 = Static7.aClass6_1.method7048();
											Static605.anInt10578 = Static7.aClass6_1.method7049();
											continue;
										}
										if (local276 && Static429.anInt7877 > 0) {
											if (Static429.anInt7877 == 1 && (Static598.anInt10390 != Static7.aClass6_1.method7048() || Static605.anInt10578 != Static7.aClass6_1.method7049())) {
												Static286.anInt5252 = Static43.anInt8888;
												Static616.anInt11226 = Static609.anInt10718;
												Static429.anInt7877 = 2;
											}
											if (Static429.anInt7877 == 2) {
												Static387.aBoolean547 = true;
												Static95.method1627(Static286.anInt5252 + (int) ((double) (Static598.anInt10390 - Static7.aClass6_1.method7048()) * 2.0D / (double) Static331.aFloat188));
												Static87.method1542(Static616.anInt11226 - (int) ((double) (Static605.anInt10578 - Static7.aClass6_1.method7049()) * 2.0D / (double) Static331.aFloat188));
											}
											continue;
										}
										if (Static429.anInt7877 > 0 && !Static387.aBoolean547) {
											if ((Static83.anInt1469 == 1 || Static307.method5029()) && Static276.anInt5124 > 2) {
												Static46.method954(Static605.anInt10578, Static598.anInt10390);
											} else if (Static203.method3892()) {
												Static46.method954(Static605.anInt10578, Static598.anInt10390);
											}
										}
										Static429.anInt7877 = 0;
										continue;
									}
									if (local6.anInt10454 == Static226.anInt4601) {
										if (local276) {
											Static65.method1186(local45 + Static7.aClass6_1.method7049() - local22, local6.anInt10395, local6.anInt10465, local40 + Static7.aClass6_1.method7048() - local17);
										}
										continue;
									}
									if (local6.anInt10454 == Static475.anInt8505) {
										Static500.method7872(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean755 && local286) {
									local6.aBoolean755 = true;
									if (local6.anObjectArray12 != null) {
										local558 = new Class2_Sub45();
										local558.aBoolean653 = true;
										local558.aClass357_131 = local6;
										local558.anInt9043 = local40 + local291.method9186() - local17;
										local558.anInt9038 = local45 + local291.method9185() - local22;
										local558.anObjectArray2 = local6.anObjectArray12;
										Static507.aClass271_51.method7174(local558);
									}
								}
								if (local6.aBoolean755 && local276 && local6.anObjectArray22 != null) {
									local558 = new Class2_Sub45();
									local558.aBoolean653 = true;
									local558.aClass357_131 = local6;
									local558.anInt9043 = local40 + Static7.aClass6_1.method7048() - local17;
									local558.anInt9038 = local45 + Static7.aClass6_1.method7049() - local22;
									local558.anObjectArray2 = local6.anObjectArray22;
									Static507.aClass271_51.method7174(local558);
								}
								if (local6.aBoolean755 && !local276) {
									local6.aBoolean755 = false;
									if (local6.anObjectArray19 != null) {
										local558 = new Class2_Sub45();
										local558.aBoolean653 = true;
										local558.aClass357_131 = local6;
										local558.anInt9043 = local40 + Static7.aClass6_1.method7048() - local17;
										local558.anInt9038 = local45 + Static7.aClass6_1.method7049() - local22;
										local558.anObjectArray2 = local6.anObjectArray19;
										Static165.aClass271_22.method7174(local558);
									}
								}
								if (local276 && local6.anObjectArray21 != null) {
									local558 = new Class2_Sub45();
									local558.aBoolean653 = true;
									local558.aClass357_131 = local6;
									local558.anInt9043 = local40 + Static7.aClass6_1.method7048() - local17;
									local558.anInt9038 = local45 + Static7.aClass6_1.method7049() - local22;
									local558.anObjectArray2 = local6.anObjectArray21;
									Static507.aClass271_51.method7174(local558);
								}
								if (!local6.aBoolean764 && local232) {
									local6.aBoolean764 = true;
									if (local6.anObjectArray8 != null) {
										local558 = new Class2_Sub45();
										local558.aBoolean653 = true;
										local558.aClass357_131 = local6;
										local558.anInt9043 = local40 + Static7.aClass6_1.method7048() - local17;
										local558.anInt9038 = local45 + Static7.aClass6_1.method7049() - local22;
										local558.anObjectArray2 = local6.anObjectArray8;
										Static507.aClass271_51.method7174(local558);
									}
								}
								if (local6.aBoolean764 && local232 && local6.anObjectArray3 != null) {
									local558 = new Class2_Sub45();
									local558.aBoolean653 = true;
									local558.aClass357_131 = local6;
									local558.anInt9043 = local40 + Static7.aClass6_1.method7048() - local17;
									local558.anInt9038 = local45 + Static7.aClass6_1.method7049() - local22;
									local558.anObjectArray2 = local6.anObjectArray3;
									Static507.aClass271_51.method7174(local558);
								}
								if (local6.aBoolean764 && !local232) {
									local6.aBoolean764 = false;
									if (local6.anObjectArray27 != null) {
										local558 = new Class2_Sub45();
										local558.aBoolean653 = true;
										local558.aClass357_131 = local6;
										local558.anInt9043 = local40 + Static7.aClass6_1.method7048() - local17;
										local558.anInt9038 = local45 + Static7.aClass6_1.method7049() - local22;
										local558.anObjectArray2 = local6.anObjectArray27;
										Static165.aClass271_22.method7174(local558);
									}
								}
								if (local6.anObjectArray20 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray20;
									Static280.aClass271_27.method7174(local558);
								}
								@Pc(1570) Class2_Sub45 local1570;
								if (local6.anObjectArray28 != null && Static461.anInt8264 > local6.anInt10436) {
									if (local6.anIntArray551 == null || Static461.anInt8264 - local6.anInt10436 > 32) {
										local558 = new Class2_Sub45();
										local558.aClass357_131 = local6;
										local558.anObjectArray2 = local6.anObjectArray28;
										Static507.aClass271_51.method7174(local558);
									} else {
										label699: for (local335 = local6.anInt10436; local335 < Static461.anInt8264; local335++) {
											local708 = Static515.anIntArray463[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray551.length; local469++) {
												if (local6.anIntArray551[local469] == local708) {
													local1570 = new Class2_Sub45();
													local1570.aClass357_131 = local6;
													local1570.anObjectArray2 = local6.anObjectArray28;
													Static507.aClass271_51.method7174(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt10436 = Static461.anInt8264;
								}
								if (local6.anObjectArray33 != null && Static438.anInt7964 > local6.anInt10427) {
									if (local6.anIntArray548 == null || Static438.anInt7964 - local6.anInt10427 > 32) {
										local558 = new Class2_Sub45();
										local558.aClass357_131 = local6;
										local558.anObjectArray2 = local6.anObjectArray33;
										Static507.aClass271_51.method7174(local558);
									} else {
										label675: for (local335 = local6.anInt10427; local335 < Static438.anInt7964; local335++) {
											local708 = Static367.anIntArray330[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray548.length; local469++) {
												if (local6.anIntArray548[local469] == local708) {
													local1570 = new Class2_Sub45();
													local1570.aClass357_131 = local6;
													local1570.anObjectArray2 = local6.anObjectArray33;
													Static507.aClass271_51.method7174(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt10427 = Static438.anInt7964;
								}
								if (local6.anObjectArray10 != null && Static115.anInt2100 > local6.anInt10409) {
									if (local6.anIntArray552 == null || Static115.anInt2100 - local6.anInt10409 > 32) {
										local558 = new Class2_Sub45();
										local558.aClass357_131 = local6;
										local558.anObjectArray2 = local6.anObjectArray10;
										Static507.aClass271_51.method7174(local558);
									} else {
										label651: for (local335 = local6.anInt10409; local335 < Static115.anInt2100; local335++) {
											local708 = Static584.anIntArray209[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray552.length; local469++) {
												if (local6.anIntArray552[local469] == local708) {
													local1570 = new Class2_Sub45();
													local1570.aClass357_131 = local6;
													local1570.anObjectArray2 = local6.anObjectArray10;
													Static507.aClass271_51.method7174(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt10409 = Static115.anInt2100;
								}
								if (local6.anObjectArray25 != null && Static207.anInt4309 > local6.anInt10434) {
									if (local6.anIntArray544 == null || Static207.anInt4309 - local6.anInt10434 > 32) {
										local558 = new Class2_Sub45();
										local558.aClass357_131 = local6;
										local558.anObjectArray2 = local6.anObjectArray25;
										Static507.aClass271_51.method7174(local558);
									} else {
										label627: for (local335 = local6.anInt10434; local335 < Static207.anInt4309; local335++) {
											local708 = Static608.anIntArray557[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray544.length; local469++) {
												if (local6.anIntArray544[local469] == local708) {
													local1570 = new Class2_Sub45();
													local1570.aClass357_131 = local6;
													local1570.anObjectArray2 = local6.anObjectArray25;
													Static507.aClass271_51.method7174(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt10434 = Static207.anInt4309;
								}
								if (local6.anObjectArray35 != null && Static592.anInt10733 > local6.anInt10406) {
									if (local6.anIntArray547 == null || Static592.anInt10733 - local6.anInt10406 > 32) {
										local558 = new Class2_Sub45();
										local558.aClass357_131 = local6;
										local558.anObjectArray2 = local6.anObjectArray35;
										Static507.aClass271_51.method7174(local558);
									} else {
										label603: for (local335 = local6.anInt10406; local335 < Static592.anInt10733; local335++) {
											local708 = Static615.anIntArray561[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray547.length; local469++) {
												if (local6.anIntArray547[local469] == local708) {
													local1570 = new Class2_Sub45();
													local1570.aClass357_131 = local6;
													local1570.anObjectArray2 = local6.anObjectArray35;
													Static507.aClass271_51.method7174(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt10406 = Static592.anInt10733;
								}
								if (Static385.anInt7281 > local6.anInt10453 && local6.anObjectArray13 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray13;
									Static507.aClass271_51.method7174(local558);
								}
								if (Static194.anInt4135 > local6.anInt10453 && local6.anObjectArray31 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray31;
									Static507.aClass271_51.method7174(local558);
								}
								if (Static333.anInt6062 > local6.anInt10453 && local6.anObjectArray4 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray4;
									Static507.aClass271_51.method7174(local558);
								}
								if (Static162.anInt3511 > local6.anInt10453 && local6.anObjectArray15 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray15;
									Static507.aClass271_51.method7174(local558);
								}
								if (Static476.anInt8576 > local6.anInt10453 && local6.anObjectArray18 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray18;
									Static507.aClass271_51.method7174(local558);
								}
								if (Static66.anInt1238 > local6.anInt10453 && local6.anObjectArray16 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray16;
									Static507.aClass271_51.method7174(local558);
								}
								if (Static301.anInt5476 > local6.anInt10453 && local6.anObjectArray32 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray32;
									Static507.aClass271_51.method7174(local558);
								}
								local6.anInt10453 = Static397.anInt11030;
								if (local6.anObjectArray11 != null) {
									for (local335 = 0; local335 < Static257.anInt4926; local335++) {
										@Pc(2082) Class2_Sub45 local2082 = new Class2_Sub45();
										local2082.aClass357_131 = local6;
										local2082.anInt9041 = Static595.anInterface21Array2[local335].method5149();
										local2082.anInt9044 = Static595.anInterface21Array2[local335].method5145();
										local2082.anObjectArray2 = local6.anObjectArray11;
										Static507.aClass271_51.method7174(local2082);
									}
								}
								if (Static628.aBoolean786 && local6.anObjectArray29 != null) {
									local558 = new Class2_Sub45();
									local558.aClass357_131 = local6;
									local558.anObjectArray2 = local6.anObjectArray29;
									Static507.aClass271_51.method7174(local558);
								}
							}
							if (local6.anInt10430 == 5 && local6.anInt10456 != -1) {
								local6.method8990(Static6.aClass176_1, Static462.aClass299_1).method6719(local6.anInt10465, Static607.aClass101_15);
							}
							Static43.method7857(local6);
							if (local6.anInt10430 == 0) {
								method1475(arg0, local6.anInt10460, local28, local30, local32, local34, local17 - local6.anInt10403, local22 - local6.anInt10458, arg8, arg9, arg10, arg11);
								if (local6.aClass357Array2 != null) {
									method1475(local6.aClass357Array2, local6.anInt10460, local28, local30, local32, local34, local17 - local6.anInt10403, local22 - local6.anInt10458, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class2_Sub20 local2208 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local6.anInt10460);
								if (local2208 != null) {
									if (Static551.aClass229_15 == Static19.aClass229_3 && local2208.anInt1668 == 0 && !Static183.aBoolean305 && local232 && !Static214.aBoolean351) {
										Static332.method5480();
									}
									Static424.method6957(local22, local2208.anInt1667, arg9, local30, arg11, local34, local17, arg10, arg8, local28, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static43.method7857(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	public static void method1476() {
		if (Static235.aClass37_5 != Static466.aClass37_9) {
			try {
				Static675.method1325(Static493.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1478() {
		@Pc(1) int local1 = Static383.anInt7249;
		@Pc(3) int[] local3 = Static404.anIntArray362;
		@Pc(8) int local8 = Static230.aClass2_Sub54_15.aClass4_Sub12_1.method3303();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class15_Sub3_Sub3_Sub1_Sub1 local32 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local3[local25]];
			if (!local32.method2229()) {
				local32.anInt3975 = -1;
			} else if (local32.aBoolean175) {
				local32.anInt3975 = -1;
			} else {
				local32.method5328();
				if (local32.aShort62 >= 0 && local32.aShort64 >= 0 && local32.aShort63 < Static222.anInt4533 && local32.aShort65 < Static668.anInt11370) {
					local32.aBoolean176 = local32.aBoolean314 ? local23 : false;
					if (local32 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2) {
						local32.anInt3975 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean315) {
							local85++;
						}
						if (local32.anInt4032 > Static62.anInt1184) {
							local85 += 2;
						}
						local85 += 5 - local32.method3690() << 2;
						if (local32.aBoolean172 || local32.aBoolean173) {
							local85 += 512;
						} else {
							if (Static36.anInt627 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt3975 = local85 + 1;
					}
				} else {
					local32.anInt3975 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static532.anInt9330; local129++) {
			@Pc(140) Class15_Sub3_Sub3_Sub1_Sub2 local140 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local129])).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			if (local140.method3700() && local140.aClass312_1.method7956(Static113.aClass282_1)) {
				local140.method5328();
				if (local140.aShort62 >= 0 && local140.aShort64 >= 0 && local140.aShort63 < Static222.anInt4533 && local140.aShort65 < Static668.anInt11370) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean315) {
						local177++;
					}
					if (local140.anInt4032 > Static62.anInt1184) {
						local177 += 2;
					}
					local177 += 5 - local140.method3690() << 2;
					if (Static36.anInt627 == 0) {
						if (local140.aClass312_1.aBoolean654) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static36.anInt627 == 1) {
						if (local140.aClass312_1.aBoolean654) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass312_1.aBoolean655) {
						local177 += 1024;
					} else if (!local140.aClass312_1.aBoolean661) {
						local177 += 256;
					}
					local140.anInt3975 = local177 + 1;
				} else {
					local140.anInt3975 = -1;
				}
			} else {
				local140.anInt3975 = -1;
			}
		}
		for (local85 = 0; local85 < Static382.aClass326Array3.length; local85++) {
			@Pc(243) Class326 local243 = Static382.aClass326Array3[local85];
			if (local243 != null) {
				if (local243.anInt9321 == 1) {
					@Pc(257) Class2_Sub6 local257 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local243.anInt9316);
					if (local257 != null) {
						@Pc(262) Class15_Sub3_Sub3_Sub1_Sub2 local262 = local257.aClass15_Sub3_Sub3_Sub1_Sub2_1;
						if (local262.anInt3975 >= 0) {
							local262.anInt3975 += 2048;
						}
					}
				} else if (local243.anInt9321 == 10) {
					@Pc(281) Class15_Sub3_Sub3_Sub1_Sub1 local281 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local243.anInt9316];
					if (local281 != null && local281 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 && local281.anInt3975 >= 0) {
						local281.anInt3975 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!uf;)Z")
	public static boolean method1479(@OriginalArg(0) Class357 arg0) {
		if (Static214.aBoolean351) {
			if (method1469(arg0).anInt1168 != 0) {
				return false;
			}
			if (arg0.anInt10430 == 0) {
				return false;
			}
		}
		return arg0.aBoolean762;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1480() {
		for (@Pc(1) int local1 = 0; local1 < Static222.anInt4533; local1++) {
			@Pc(6) int[] local6 = Static236.anIntArrayArray14[local1];
			for (@Pc(8) int local8 = 0; local8 < Static668.anInt11370; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1482() {
		Static656.aClass22_68.method461();
	}
}
