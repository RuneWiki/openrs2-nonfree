import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	public static volatile int anInt2018 = -1;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "J")
	public static long aLong38 = -1L;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
	public static void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static81.method1222(local7.aClass28_Sub1_Sub2_1);
			if (local7.aClass28_Sub1_Sub2_1 != null) {
				local7.aClass28_Sub1_Sub2_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
	public static int method1812() {
		return Static406.anInt7204;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1814() {
		@Pc(1) int local1 = Static105.anInt2258;
		@Pc(3) int[] local3 = Static321.anIntArray339;
		@Pc(11) int local11 = Static628.aBoolean873 ? local1 : local1 + Static36.anInt607;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class28_Sub1_Sub4_Sub2 local23;
			if (local13 < local1) {
				local23 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local13 - local1])).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			}
			if (local23.anInt5470 >= 0) {
				@Pc(43) int local43 = local23.method4599();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10781 & 0x1FF) == 0 && (local23.anInt10784 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10781 & 0x1FF) == 256 && (local23.anInt10784 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10779 = Static441.method6444(local23.aByte145, local23.anInt10781, local23.anInt10784);
				Static308.method4867(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JIZI)V")
	public static void method1815(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static274.method4253(arg2, local22, arg1, 0, local10, 0, 0, true);
			return;
		}
		@Pc(59) Class164 local59 = Static568.aClass315_5.method7511(local29);
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (local22 == 0 || local22 == 2) {
			local73 = local59.anInt4634;
			local70 = local59.anInt4645;
		} else {
			local70 = local59.anInt4634;
			local73 = local59.anInt4645;
		}
		@Pc(84) int local84 = local59.anInt4663;
		if (local22 != 0) {
			local84 = (local84 << local22 & 0xF) + (local84 >> 4 - local22);
		}
		Static274.method4253(arg2, 0, arg1, local73, 0, local84, local70, true);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!uaa;)Z")
	public static boolean method1816(@OriginalArg(0) Class345 arg0) {
		if (Static202.aBoolean307) {
			if (method1822(arg0).anInt507 != 0) {
				return false;
			}
			if (arg0.anInt9591 == 0) {
				return false;
			}
		}
		return arg0.aBoolean809;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!uaa;)Lclient!uaa;")
	public static Class345 method1817(@OriginalArg(0) Class345 arg0) {
		@Pc(4) int local4 = method1822(arg0).method455();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static264.method4120(arg0.anInt9657);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1818(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static105.anInt2258;
		@Pc(3) int[] local3 = Static321.anIntArray339;
		@Pc(11) int local11 = Static628.aBoolean873 ? local1 : local1 + Static36.anInt607;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class28_Sub1_Sub4_Sub2 local23;
			if (local13 < local1) {
				local23 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local13 - local1])).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			}
			if (local23.aByte145 == arg0) {
				local23.anInt5508 = 0;
				if (local23.anInt5470 < 0) {
					local23.aBoolean468 = false;
				} else {
					@Pc(54) int local54 = local23.method4599();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10781 & 0x1FF) != 0 || (local23.anInt10784 & 0x1FF) != 0) {
							local23.aBoolean468 = false;
							continue;
						}
					} else if ((local23.anInt10781 & 0x1FF) != 256 || (local23.anInt10784 & 0x1FF) != 256) {
						local23.aBoolean468 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10781 >> 9;
						local101 = local23.anInt10784 >> 9;
						if (local23.anInt5470 != Static89.anIntArrayArray5[local96][local101]) {
							local23.aBoolean468 = true;
							continue;
						}
						if (Static500.anIntArrayArray43[local96][local101] > 1) {
							local126 = Static500.anIntArrayArray43[local96][local101]--;
							local23.aBoolean468 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10781 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10784 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10781 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10784 + local96 >> 9;
						if (!Static278.method4502(local23.anInt5470, local162, local169, local101, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt5470 == Static89.anIntArrayArray5[local180][local183]) {
										local126 = Static500.anIntArrayArray43[local180][local183]--;
									}
								}
							}
							local23.aBoolean468 = true;
							continue;
						}
					}
					local23.aBoolean468 = false;
					local23.anInt10779 = Static441.method6444(local23.aByte145, local23.anInt10781, local23.anInt10784);
					Static308.method4867(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!uaa;)Lclient!b;")
	public static Class5_Sub5 method1822(@OriginalArg(0) Class345 arg0) {
		@Pc(13) Class5_Sub5 local13 = (Class5_Sub5) Static9.aClass300_48.method7188(((long) arg0.anInt9664 << 32) + (long) arg0.anInt9611);
		return local13 == null ? arg0.aClass5_Sub5_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1823() {
		Static213.anInt9562 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static36.anInt607; local3++) {
			@Pc(14) Class28_Sub1_Sub4_Sub2_Sub1 local14 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local3])).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			if (local14.aBoolean468 && local14.method4591() != -1) {
				@Pc(32) int local32 = (local14.method4599() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10781 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10784 - local32 >> 9;
				@Pc(53) Class28_Sub1_Sub4_Sub2 local53 = Static654.method8790(local14.aByte145, local46, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt5512;
					if (local53 instanceof Class28_Sub1_Sub4_Sub2_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt5508 == 0 && local53.method4591() != -1) {
						Static208.anIntArray197[Static213.anInt9562] = local58;
						Static454.anIntArray433[Static213.anInt9562] = local58;
						Static213.anInt9562++;
						local53.anInt5508++;
					}
					Static208.anIntArray197[Static213.anInt9562] = local58;
					Static454.anIntArray433[Static213.anInt9562] = local14.anInt5512 + 2048;
					Static213.anInt9562++;
					local53.anInt5508++;
				}
			}
		}
		Static633.method8530(0, Static208.anIntArray197, Static213.anInt9562 - 1, Static454.anIntArray433);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!uaa;IIIIIIIIIII)V")
	public static void method1824(@OriginalArg(0) Class345[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class345 local6 = arg0[local1];
			if (local6 != null && local6.anInt9657 == arg1) {
				@Pc(17) int local17 = local6.anInt9651 + arg6;
				@Pc(22) int local22 = local6.anInt9588 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt9591 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt9649;
					local45 = local22 + local6.anInt9606;
					if (local6.anInt9591 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9591 == 0 || local6.aBoolean816 || method1822(local6).anInt507 != 0 || local6 == Static303.aClass345_8 || local6.anInt9644 == Static20.anInt300 || local6.anInt9644 == Static412.anInt7319) {
					if (!method1816(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static66.aBoolean570) {
							local40 = Static106.method2037();
							local45 = Static660.method8815();
						}
						if (local6 == Static383.aClass345_10 && Static491.method7048(Static383.aClass345_10) != null) {
							Static213.aBoolean807 = true;
							Static28.anInt392 = local17;
							Static582.anInt10820 = local22;
						}
						if (local6.aBoolean813 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean820 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class5_Sub22 local168 = (Class5_Sub22) Static637.aClass114_66.method2805(); local168 != null; local168 = (Class5_Sub22) Static637.aClass114_66.method2814()) {
									if (local168.aBoolean277) {
										local168.method9052();
										local168.aClass345_1.aBoolean815 = false;
									}
								}
								if (Static365.anInt6630 == 0) {
									Static383.aClass345_10 = null;
									Static303.aClass345_8 = null;
								}
								Static101.anInt2198 = 0;
								Static558.aBoolean633 = false;
								Static557.aBoolean777 = false;
								if (!Static493.aBoolean702) {
									Static447.method6475();
								}
							}
							@Pc(232) boolean local232;
							if (Static359.aClass11_1.method6141() + local40 >= local28 && Static359.aClass11_1.method6144() + local45 >= local30 && Static359.aClass11_1.method6141() + local40 < local32 && Static359.aClass11_1.method6144() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static55.aBoolean60 && local232) {
								if (local6.anInt9666 >= 0) {
									Static105.anInt2256 = local6.anInt9666;
								} else if (local6.aBoolean820) {
									Static105.anInt2256 = -1;
								}
							}
							if (!Static493.aBoolean702 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static328.method5086(arg10 - local17, arg11 - local22, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static359.aClass11_1.method6146() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class5_Sub7 local291 = (Class5_Sub7) Static223.aClass114_23.method2805();
							if (local291 != null && local291.method8705() == 0 && local291.method8703() + local40 >= local28 && local291.method8702() + local45 >= local30 && local291.method8703() + local40 < local32 && local291.method8702() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray96 != null && !Static202.method3285()) {
								for (local335 = 0; local335 < local6.aByteArray96.length; local335++) {
									if (Static17.aClass252_1.method8818(local6.aByteArray96[local335])) {
										if (local6.lb == null || Static26.anInt350 >= local6.lb[local335]) {
											@Pc(367) byte local367 = local6.aByteArray97[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static17.aClass252_1.method8818(86) && !Static17.aClass252_1.method8818(82) && !Static17.aClass252_1.method8818(81)) && ((local367 & 0x2) == 0 || Static17.aClass252_1.method8818(86)) && ((local367 & 0x1) == 0 || Static17.aClass252_1.method8818(82)) && ((local367 & 0x4) == 0 || Static17.aClass252_1.method8818(81))) {
												if (local335 < 10) {
													Static43.method600(local335 + 1, "", local6.anInt9664, -1);
												} else if (local335 == 10) {
													Static424.method6285();
													@Pc(438) Class5_Sub5 local438 = method1822(local6);
													Static30.method365(local6, local438.anInt508, local438.method457());
													Static421.aString59 = Static531.method7465(local6);
													if (Static421.aString59 == null) {
														Static421.aString59 = "Null";
													}
													Static199.aString28 = local6.aString90 + "<col=ffffff>";
												}
												local469 = local6.anIntArray532[local335];
												if (local6.lb == null) {
													local6.lb = new int[local6.aByteArray96.length];
												}
												if (local469 == 0) {
													local6.lb[local335] = Integer.MAX_VALUE;
												} else {
													local6.lb[local335] = Static26.anInt350 + local469;
												}
											}
										}
									} else if (local6.lb != null) {
										local6.lb[local335] = 0;
									}
								}
							}
							if (local286) {
								Static446.method6473(local6, local45 + local291.method8702() - local22, local40 + local291.method8703() - local17);
							}
							if (Static383.aClass345_10 != null && Static383.aClass345_10 != local6 && local232 && method1822(local6).method456()) {
								Static262.aClass345_6 = local6;
							}
							if (local6 == Static303.aClass345_8) {
								Static134.aBoolean183 = true;
								Static401.anInt7135 = local17;
								Static216.anInt4043 = local22;
							}
							if (local6.aBoolean816 || local6.anInt9644 != 0) {
								@Pc(558) Class5_Sub22 local558;
								if (local232 && Static133.anInt2650 != 0 && local6.anObjectArray13 != null) {
									local558 = new Class5_Sub22();
									local558.aBoolean277 = true;
									local558.aClass345_1 = local6;
									local558.anInt3436 = Static133.anInt2650;
									local558.anObjectArray1 = local6.anObjectArray13;
									Static637.aClass114_66.method2807(local558);
								}
								if (Static383.aClass345_10 != null || Static493.aBoolean702 || local6.anInt9644 != Static207.anInt3884 && Static101.anInt2198 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt9644 != 0) {
									if (local6.anInt9644 == Static299.anInt5765 || local6.anInt9644 == Static243.anInt4490) {
										Static655.aClass345_15 = local6;
										if (Static424.aClass20_1 != null) {
											Static424.aClass20_1.method284(local6.anInt9606, Static208.aClass65_7);
										}
										if (local6.anInt9644 == Static299.anInt5765) {
											if (Static493.aBoolean702 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static40.method582(arg9, Static208.aClass65_7, arg8);
											@Pc(641) Class28_Sub8 local641 = (Class28_Sub8) Static439.aClass156_7.method3776();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt10185 && arg10 < local641.anInt10190 && arg11 >= local641.anInt10186 && arg11 < local641.anInt10188) {
													Static447.method6475();
													Static268.method4153(local641.aClass28_Sub1_Sub4_Sub2_1);
												}
												local641 = (Class28_Sub8) Static439.aClass156_7.method3783();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt9644 == Static20.anInt300) {
										if (local6.method8063(Static208.aClass65_7) == null || Static595.anInt9783 != 0 && Static595.anInt9783 != 3 || Static493.aBoolean702 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray528[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray530[local708]) {
											continue;
										}
										local335 -= local6.anInt9649 / 2;
										local708 -= local6.anInt9606 / 2;
										if (Static660.anInt10605 == 4) {
											local747 = (int) Static157.aFloat83 & 0x3FFF;
										} else {
											local747 = (int) Static157.aFloat83 + Static213.anInt9568 & 0x3FFF;
										}
										@Pc(759) int local759 = Class200.anIntArray337[local747];
										@Pc(763) int local763 = Class200.anIntArray338[local747];
										if (Static660.anInt10605 != 4) {
											local759 = local759 * (Static569.anInt9215 + 256) >> 8;
											local763 = local763 * (Static569.anInt9215 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static660.anInt10605 == 4) {
											local813 = (Static251.anInt4573 >> 9) + (local792 >> 2);
											local821 = (Static599.anInt9833 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() - 1) * 256;
											local813 = (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 - local830 >> 9) + (local792 >> 2);
											local821 = (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 - local830 >> 9) - (local802 >> 2);
										}
										if (Static55.aBoolean60 && (Static24.anInt7340 & 0x40) != 0) {
											@Pc(863) Class345 local863 = Static144.method2595(Static549.anInt9003, Static353.anInt6392);
											if (local863 == null) {
												Static424.method6285();
											} else {
												Static282.method4539(Static421.aString59, false, local6.anInt9654, Static233.anInt4241, true, 1L, local821, 5, (long) (local6.anInt9611 << 0 | local6.anInt9664), local813, " ->", true);
											}
											continue;
										}
										if (Static218.aClass98_2 == Static409.aClass98_3) {
											Static282.method4539(Static64.aClass52_27.method907(Static544.anInt8937), false, -1, -1, true, 1L, local821, 4, 0L, local813, "", true);
										}
										Static282.method4539(Static634.aString107, false, -1, Static98.anInt2166, true, 1L, local821, 16, 0L, local813, "", true);
										continue;
									}
									if (local6.anInt9644 == Static207.anInt3884) {
										Static378.aClass345_9 = local6;
										if (local232) {
											Static558.aBoolean633 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method8703() - local17 - local6.anInt9649 / 2) * 2.0D / (double) Static330.aFloat8);
											local708 = (int) -((double) (local45 + local291.method8702() - local22 - local6.anInt9606 / 2) * 2.0D / (double) Static330.aFloat8);
											local469 = Static193.anInt3730 + local335 + Static330.anInt764;
											local747 = Static241.anInt4462 + local708 + Static330.anInt759;
											@Pc(994) Class5_Sub3_Sub16 local994 = Static213.method8049();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method7162(local999, local469, local747);
											if (local999 != null) {
												if (Static17.aClass252_1.method8818(82) && Static105.anInt2257 > 0) {
													Static442.method6446(local999[1], local999[2], local999[0]);
													continue;
												}
												Static557.aBoolean777 = true;
												Static570.anInt9300 = local999[0];
												Static477.anInt8038 = local999[1];
												Static308.anInt5858 = local999[2];
											}
											Static101.anInt2198 = 1;
											Static625.aBoolean872 = false;
											Static637.anInt10351 = Static359.aClass11_1.method6141();
											Static316.anInt5982 = Static359.aClass11_1.method6144();
											continue;
										}
										if (local276 && Static101.anInt2198 > 0) {
											if (Static101.anInt2198 == 1 && (Static637.anInt10351 != Static359.aClass11_1.method6141() || Static316.anInt5982 != Static359.aClass11_1.method6144())) {
												Static644.anInt10423 = Static193.anInt3730;
												Static584.anInt9539 = Static241.anInt4462;
												Static101.anInt2198 = 2;
											}
											if (Static101.anInt2198 == 2) {
												Static625.aBoolean872 = true;
												Static300.method8600(Static644.anInt10423 + (int) ((double) (Static637.anInt10351 - Static359.aClass11_1.method6141()) * 2.0D / (double) Static330.aFloat9));
												Static555.method5141(Static584.anInt9539 - (int) ((double) (Static316.anInt5982 - Static359.aClass11_1.method6144()) * 2.0D / (double) Static330.aFloat9));
											}
											continue;
										}
										if (Static101.anInt2198 > 0 && !Static625.aBoolean872) {
											if ((Static51.anInt734 == 1 || Static565.method7758()) && Static483.anInt8099 > 2) {
												Static262.method4100(Static316.anInt5982, Static637.anInt10351);
											} else if (Static170.method2962()) {
												Static262.method4100(Static316.anInt5982, Static637.anInt10351);
											}
										}
										Static101.anInt2198 = 0;
										continue;
									}
									if (local6.anInt9644 == Static290.anInt5660) {
										if (local276) {
											Static621.method8428(local40 + Static359.aClass11_1.method6141() - local17, local6.anInt9649, local6.anInt9606, local45 + Static359.aClass11_1.method6144() - local22);
										}
										continue;
									}
									if (local6.anInt9644 == Static412.anInt7319) {
										Static269.method4158(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean812 && local286) {
									local6.aBoolean812 = true;
									if (local6.anObjectArray34 != null) {
										local558 = new Class5_Sub22();
										local558.aBoolean277 = true;
										local558.aClass345_1 = local6;
										local558.anInt3430 = local40 + local291.method8703() - local17;
										local558.anInt3436 = local45 + local291.method8702() - local22;
										local558.anObjectArray1 = local6.anObjectArray34;
										Static637.aClass114_66.method2807(local558);
									}
								}
								if (local6.aBoolean812 && local276 && local6.anObjectArray26 != null) {
									local558 = new Class5_Sub22();
									local558.aBoolean277 = true;
									local558.aClass345_1 = local6;
									local558.anInt3430 = local40 + Static359.aClass11_1.method6141() - local17;
									local558.anInt3436 = local45 + Static359.aClass11_1.method6144() - local22;
									local558.anObjectArray1 = local6.anObjectArray26;
									Static637.aClass114_66.method2807(local558);
								}
								if (local6.aBoolean812 && !local276) {
									local6.aBoolean812 = false;
									if (local6.anObjectArray9 != null) {
										local558 = new Class5_Sub22();
										local558.aBoolean277 = true;
										local558.aClass345_1 = local6;
										local558.anInt3430 = local40 + Static359.aClass11_1.method6141() - local17;
										local558.anInt3436 = local45 + Static359.aClass11_1.method6144() - local22;
										local558.anObjectArray1 = local6.anObjectArray9;
										Static562.aClass114_62.method2807(local558);
									}
								}
								if (local276 && local6.anObjectArray29 != null) {
									local558 = new Class5_Sub22();
									local558.aBoolean277 = true;
									local558.aClass345_1 = local6;
									local558.anInt3430 = local40 + Static359.aClass11_1.method6141() - local17;
									local558.anInt3436 = local45 + Static359.aClass11_1.method6144() - local22;
									local558.anObjectArray1 = local6.anObjectArray29;
									Static637.aClass114_66.method2807(local558);
								}
								if (!local6.aBoolean815 && local232) {
									local6.aBoolean815 = true;
									if (local6.anObjectArray6 != null) {
										local558 = new Class5_Sub22();
										local558.aBoolean277 = true;
										local558.aClass345_1 = local6;
										local558.anInt3430 = local40 + Static359.aClass11_1.method6141() - local17;
										local558.anInt3436 = local45 + Static359.aClass11_1.method6144() - local22;
										local558.anObjectArray1 = local6.anObjectArray6;
										Static637.aClass114_66.method2807(local558);
									}
								}
								if (local6.aBoolean815 && local232 && local6.anObjectArray18 != null) {
									local558 = new Class5_Sub22();
									local558.aBoolean277 = true;
									local558.aClass345_1 = local6;
									local558.anInt3430 = local40 + Static359.aClass11_1.method6141() - local17;
									local558.anInt3436 = local45 + Static359.aClass11_1.method6144() - local22;
									local558.anObjectArray1 = local6.anObjectArray18;
									Static637.aClass114_66.method2807(local558);
								}
								if (local6.aBoolean815 && !local232) {
									local6.aBoolean815 = false;
									if (local6.anObjectArray15 != null) {
										local558 = new Class5_Sub22();
										local558.aBoolean277 = true;
										local558.aClass345_1 = local6;
										local558.anInt3430 = local40 + Static359.aClass11_1.method6141() - local17;
										local558.anInt3436 = local45 + Static359.aClass11_1.method6144() - local22;
										local558.anObjectArray1 = local6.anObjectArray15;
										Static562.aClass114_62.method2807(local558);
									}
								}
								if (local6.anObjectArray25 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray25;
									Static203.aClass114_22.method2807(local558);
								}
								@Pc(1570) Class5_Sub22 local1570;
								if (local6.anObjectArray7 != null && Static306.anInt5852 > local6.anInt9578) {
									if (local6.anIntArray529 == null || Static306.anInt5852 - local6.anInt9578 > 32) {
										local558 = new Class5_Sub22();
										local558.aClass345_1 = local6;
										local558.anObjectArray1 = local6.anObjectArray7;
										Static637.aClass114_66.method2807(local558);
									} else {
										label699: for (local335 = local6.anInt9578; local335 < Static306.anInt5852; local335++) {
											local708 = Static202.anIntArray194[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray529.length; local469++) {
												if (local6.anIntArray529[local469] == local708) {
													local1570 = new Class5_Sub22();
													local1570.aClass345_1 = local6;
													local1570.anObjectArray1 = local6.anObjectArray7;
													Static637.aClass114_66.method2807(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt9578 = Static306.anInt5852;
								}
								if (local6.anObjectArray23 != null && Static199.anInt3806 > local6.anInt9594) {
									if (local6.anIntArray525 == null || Static199.anInt3806 - local6.anInt9594 > 32) {
										local558 = new Class5_Sub22();
										local558.aClass345_1 = local6;
										local558.anObjectArray1 = local6.anObjectArray23;
										Static637.aClass114_66.method2807(local558);
									} else {
										label675: for (local335 = local6.anInt9594; local335 < Static199.anInt3806; local335++) {
											local708 = Static610.anIntArray550[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray525.length; local469++) {
												if (local6.anIntArray525[local469] == local708) {
													local1570 = new Class5_Sub22();
													local1570.aClass345_1 = local6;
													local1570.anObjectArray1 = local6.anObjectArray23;
													Static637.aClass114_66.method2807(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt9594 = Static199.anInt3806;
								}
								if (local6.anObjectArray10 != null && Static548.anInt8995 > local6.anInt9615) {
									if (local6.anIntArray527 == null || Static548.anInt8995 - local6.anInt9615 > 32) {
										local558 = new Class5_Sub22();
										local558.aClass345_1 = local6;
										local558.anObjectArray1 = local6.anObjectArray10;
										Static637.aClass114_66.method2807(local558);
									} else {
										label651: for (local335 = local6.anInt9615; local335 < Static548.anInt8995; local335++) {
											local708 = Static253.anIntArray242[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray527.length; local469++) {
												if (local6.anIntArray527[local469] == local708) {
													local1570 = new Class5_Sub22();
													local1570.aClass345_1 = local6;
													local1570.anObjectArray1 = local6.anObjectArray10;
													Static637.aClass114_66.method2807(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt9615 = Static548.anInt8995;
								}
								if (local6.anObjectArray2 != null && Static30.anInt402 > local6.anInt9600) {
									if (local6.anIntArray531 == null || Static30.anInt402 - local6.anInt9600 > 32) {
										local558 = new Class5_Sub22();
										local558.aClass345_1 = local6;
										local558.anObjectArray1 = local6.anObjectArray2;
										Static637.aClass114_66.method2807(local558);
									} else {
										label627: for (local335 = local6.anInt9600; local335 < Static30.anInt402; local335++) {
											local708 = Static77.anIntArray64[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray531.length; local469++) {
												if (local6.anIntArray531[local469] == local708) {
													local1570 = new Class5_Sub22();
													local1570.aClass345_1 = local6;
													local1570.anObjectArray1 = local6.anObjectArray2;
													Static637.aClass114_66.method2807(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt9600 = Static30.anInt402;
								}
								if (local6.anObjectArray21 != null && Static416.anInt7351 > local6.anInt9608) {
									if (local6.anIntArray524 == null || Static416.anInt7351 - local6.anInt9608 > 32) {
										local558 = new Class5_Sub22();
										local558.aClass345_1 = local6;
										local558.anObjectArray1 = local6.anObjectArray21;
										Static637.aClass114_66.method2807(local558);
									} else {
										label603: for (local335 = local6.anInt9608; local335 < Static416.anInt7351; local335++) {
											local708 = Static284.anIntArray297[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray524.length; local469++) {
												if (local6.anIntArray524[local469] == local708) {
													local1570 = new Class5_Sub22();
													local1570.aClass345_1 = local6;
													local1570.anObjectArray1 = local6.anObjectArray21;
													Static637.aClass114_66.method2807(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt9608 = Static416.anInt7351;
								}
								if (Static401.anInt7137 > local6.anInt9630 && local6.anObjectArray20 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray20;
									Static637.aClass114_66.method2807(local558);
								}
								if (Static467.anInt7868 > local6.anInt9630 && local6.anObjectArray3 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray3;
									Static637.aClass114_66.method2807(local558);
								}
								if (Static628.anInt10248 > local6.anInt9630 && local6.anObjectArray4 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray4;
									Static637.aClass114_66.method2807(local558);
								}
								if (Static269.anInt4977 > local6.anInt9630 && local6.anObjectArray19 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray19;
									Static637.aClass114_66.method2807(local558);
								}
								if (Static326.anInt6096 > local6.anInt9630 && local6.anObjectArray27 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray27;
									Static637.aClass114_66.method2807(local558);
								}
								if (Static354.anInt6411 > local6.anInt9630 && local6.anObjectArray22 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray22;
									Static637.aClass114_66.method2807(local558);
								}
								if (Static605.anInt9948 > local6.anInt9630 && local6.anObjectArray17 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray17;
									Static637.aClass114_66.method2807(local558);
								}
								local6.anInt9630 = Static370.anInt8567;
								if (local6.anObjectArray28 != null) {
									for (local335 = 0; local335 < Static276.anInt10228; local335++) {
										@Pc(2082) Class5_Sub22 local2082 = new Class5_Sub22();
										local2082.aClass345_1 = local6;
										local2082.anInt3431 = Static340.anInterface16Array2[local335].method7500();
										local2082.anInt3433 = Static340.anInterface16Array2[local335].method7501();
										local2082.anObjectArray1 = local6.anObjectArray28;
										Static637.aClass114_66.method2807(local2082);
									}
								}
								if (Static431.aBoolean647 && local6.anObjectArray11 != null) {
									local558 = new Class5_Sub22();
									local558.aClass345_1 = local6;
									local558.anObjectArray1 = local6.anObjectArray11;
									Static637.aClass114_66.method2807(local558);
								}
							}
							if (local6.anInt9591 == 5 && local6.anInt9595 != -1) {
								local6.method8074(Static62.aClass393_1, Static230.aClass122_1).method284(local6.anInt9606, Static208.aClass65_7);
							}
							Static602.method8250(local6);
							if (local6.anInt9591 == 0) {
								method1824(arg0, local6.anInt9664, local28, local30, local32, local34, local17 - local6.anInt9583, local22 - local6.anInt9577, arg8, arg9, arg10, arg11);
								if (local6.aClass345Array1 != null) {
									method1824(local6.aClass345Array1, local6.anInt9664, local28, local30, local32, local34, local17 - local6.anInt9583, local22 - local6.anInt9577, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class5_Sub39 local2208 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local6.anInt9664);
								if (local2208 != null) {
									if (Static218.aClass98_2 == Static599.aClass98_6 && local2208.anInt6236 == 0 && !Static493.aBoolean702 && local232 && !Static202.aBoolean307) {
										Static447.method6475();
									}
									Static158.method2804(arg9, local28, local32, local30, arg11, arg8, local17, local34, local22, arg10, local2208.anInt6238);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static602.method8250(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1826(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static105.anInt2258;
		@Pc(3) int[] local3 = Static321.anIntArray339;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static36.anInt607; local5++) {
			@Pc(15) Class28_Sub1_Sub4_Sub2 local15;
			if (local5 < local1) {
				local15 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local3[local5]];
			} else {
				local15 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local5 - local1])).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			}
			if (local15.aByte145 == arg0 && local15.anInt5470 >= 0) {
				@Pc(39) int local39 = local15.method4599();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10781 & 0x1FF) != 0 || (local15.anInt10784 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10781 & 0x1FF) != 256 || (local15.anInt10784 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10781 >> 9;
					local80 = local15.anInt10784 >> 9;
					if (local15.anInt5470 > Static89.anIntArrayArray5[local75][local80]) {
						Static89.anIntArrayArray5[local75][local80] = local15.anInt5470;
						Static500.anIntArrayArray43[local75][local80] = 1;
					} else if (local15.anInt5470 == Static89.anIntArrayArray5[local75][local80]) {
						local116 = Static500.anIntArrayArray43[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10781 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10784 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10781 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10784 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt5470 > Static89.anIntArrayArray5[local158][local161]) {
								Static89.anIntArrayArray5[local158][local161] = local15.anInt5470;
								Static500.anIntArrayArray43[local158][local161] = 1;
							} else if (local15.anInt5470 == Static89.anIntArrayArray5[local158][local161]) {
								local116 = Static500.anIntArrayArray43[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1827() {
		for (@Pc(1) int local1 = 0; local1 < Static201.anInt3834; local1++) {
			@Pc(6) int[] local6 = Static89.anIntArrayArray5[local1];
			for (@Pc(8) int local8 = 0; local8 < Static626.anInt10238; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1828() {
		@Pc(1) int local1 = Static105.anInt2258;
		@Pc(3) int[] local3 = Static321.anIntArray339;
		@Pc(8) int local8 = Static172.aClass5_Sub50_14.aClass12_Sub11_1.method2913();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class28_Sub1_Sub4_Sub2_Sub2 local32 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local3[local25]];
			if (!local32.method4608()) {
				local32.anInt5470 = -1;
			} else if (local32.aBoolean478) {
				local32.anInt5470 = -1;
			} else {
				local32.method8981();
				if (local32.aShort124 >= 0 && local32.aShort121 >= 0 && local32.aShort122 < Static201.anInt3834 && local32.aShort123 < Static626.anInt10238) {
					local32.aBoolean473 = local32.aBoolean470 ? local23 : false;
					if (local32 == Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1) {
						local32.anInt5470 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean468) {
							local85++;
						}
						if (local32.anInt5464 > Static26.anInt350) {
							local85 += 2;
						}
						local85 += 5 - local32.method4599() << 2;
						if (local32.aBoolean475 || local32.aBoolean476) {
							local85 += 512;
						} else {
							if (Static147.anInt3019 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt5470 = local85 + 1;
					}
				} else {
					local32.anInt5470 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static36.anInt607; local129++) {
			@Pc(140) Class28_Sub1_Sub4_Sub2_Sub1 local140 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local129])).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			if (local140.method3066() && local140.aClass134_1.method3270(Static161.aClass237_3)) {
				local140.method8981();
				if (local140.aShort124 >= 0 && local140.aShort121 >= 0 && local140.aShort122 < Static201.anInt3834 && local140.aShort123 < Static626.anInt10238) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean468) {
						local177++;
					}
					if (local140.anInt5464 > Static26.anInt350) {
						local177 += 2;
					}
					local177 += 5 - local140.method4599() << 2;
					if (Static147.anInt3019 == 0) {
						if (local140.aClass134_1.aBoolean306) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static147.anInt3019 == 1) {
						if (local140.aClass134_1.aBoolean306) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass134_1.aBoolean301) {
						local177 += 1024;
					} else if (!local140.aClass134_1.aBoolean304) {
						local177 += 256;
					}
					local140.anInt5470 = local177 + 1;
				} else {
					local140.anInt5470 = -1;
				}
			} else {
				local140.anInt5470 = -1;
			}
		}
		for (local85 = 0; local85 < Static564.aClass371Array6.length; local85++) {
			@Pc(243) Class371 local243 = Static564.aClass371Array6[local85];
			if (local243 != null) {
				if (local243.anInt10324 == 1) {
					@Pc(257) Class5_Sub25 local257 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local243.anInt10325);
					if (local257 != null) {
						@Pc(262) Class28_Sub1_Sub4_Sub2_Sub1 local262 = local257.aClass28_Sub1_Sub4_Sub2_Sub1_1;
						if (local262.anInt5470 >= 0) {
							local262.anInt5470 += 2048;
						}
					}
				} else if (local243.anInt10324 == 10) {
					@Pc(281) Class28_Sub1_Sub4_Sub2_Sub2 local281 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local243.anInt10325];
					if (local281 != null && local281 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 && local281.anInt5470 >= 0) {
						local281.anInt5470 += 2048;
					}
				}
			}
		}
	}
}
