import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	public static final int[] anIntArray83 = new int[2];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!uq;I)V")
	public static void method1366(@OriginalArg(0) Class362 arg0) {
		Static91.aClass362_21 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ofa;)Z")
	public static boolean method1367(@OriginalArg(0) Class265 arg0) {
		if (Static97.aBoolean153) {
			if (method1383(arg0).anInt7824 != 0) {
				return false;
			}
			if (arg0.anInt6967 == 0) {
				return false;
			}
		}
		return arg0.aBoolean495;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1368() {
		Static70.method1234();
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static609.aClass110Array1[local15].method2365();
		}
		Static443.method6041();
		Static655.method8761();
		Static492.method742();
		System.gc();
		Static119.aClass95_4.ya();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1369() {
		@Pc(1) int local1 = Static439.anInt7133;
		@Pc(3) int[] local3 = Static294.anIntArray593;
		@Pc(8) int local8 = Static336.aClass3_Sub41_18.aClass14_Sub4_1.method1810();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class34_Sub1_Sub1_Sub2_Sub1 local32 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local3[local25]];
			if (!local32.method1491()) {
				local32.anInt9670 = -1;
			} else if (local32.aBoolean145) {
				local32.anInt9670 = -1;
			} else {
				local32.method7856();
				if (local32.aShort98 >= 0 && local32.aShort99 >= 0 && local32.aShort97 < Static98.anInt361 && local32.aShort96 < Static438.anInt7120) {
					local32.aBoolean142 = local32.aBoolean673 ? local23 : false;
					if (local32 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1) {
						local32.anInt9670 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean674) {
							local85++;
						}
						if (local32.anInt9692 > Static122.anInt2190) {
							local85 += 2;
						}
						local85 += 5 - local32.method7866() << 2;
						if (local32.aBoolean144 || local32.aBoolean146) {
							local85 += 512;
						} else {
							if (Static375.anInt7471 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt9670 = local85 + 1;
					}
				} else {
					local32.anInt9670 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static52.anInt1140; local129++) {
			@Pc(140) Class34_Sub1_Sub1_Sub2_Sub2 local140 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local129])).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			if (local140.method7882() && local140.aClass261_1.method5765(Static210.aClass262_1)) {
				local140.method7856();
				if (local140.aShort98 >= 0 && local140.aShort99 >= 0 && local140.aShort97 < Static98.anInt361 && local140.aShort96 < Static438.anInt7120) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean674) {
						local177++;
					}
					if (local140.anInt9692 > Static122.anInt2190) {
						local177 += 2;
					}
					local177 += 5 - local140.method7866() << 2;
					if (Static375.anInt7471 == 0) {
						if (local140.aClass261_1.aBoolean479) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static375.anInt7471 == 1) {
						if (local140.aClass261_1.aBoolean479) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass261_1.aBoolean477) {
						local177 += 1024;
					} else if (!local140.aClass261_1.aBoolean480) {
						local177 += 256;
					}
					local140.anInt9670 = local177 + 1;
				} else {
					local140.anInt9670 = -1;
				}
			} else {
				local140.anInt9670 = -1;
			}
		}
		for (local85 = 0; local85 < Static171.aClass252Array1.length; local85++) {
			@Pc(243) Class252 local243 = Static171.aClass252Array1[local85];
			if (local243 != null) {
				if (local243.anInt6681 == 1) {
					@Pc(257) Class3_Sub52 local257 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local243.anInt6678);
					if (local257 != null) {
						@Pc(262) Class34_Sub1_Sub1_Sub2_Sub2 local262 = local257.aClass34_Sub1_Sub1_Sub2_Sub2_2;
						if (local262.anInt9670 >= 0) {
							local262.anInt9670 += 2048;
						}
					}
				} else if (local243.anInt6681 == 10) {
					@Pc(281) Class34_Sub1_Sub1_Sub2_Sub1 local281 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local243.anInt6678];
					if (local281 != null && local281 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 && local281.anInt9670 >= 0) {
						local281.anInt9670 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1370(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static439.anInt7133;
		@Pc(3) int[] local3 = Static294.anIntArray593;
		@Pc(11) int local11 = Static331.aBoolean358 ? local1 : local1 + Static52.anInt1140;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class34_Sub1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local13 - local1])).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			}
			if (local23.aByte132 == arg0) {
				local23.anInt9650 = 0;
				if (local23.anInt9670 < 0) {
					local23.aBoolean674 = false;
				} else {
					@Pc(54) int local54 = local23.method7866();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9614 & 0x1FF) != 0 || (local23.anInt9619 & 0x1FF) != 0) {
							local23.aBoolean674 = false;
							continue;
						}
					} else if ((local23.anInt9614 & 0x1FF) != 256 || (local23.anInt9619 & 0x1FF) != 256) {
						local23.aBoolean674 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9614 >> 9;
						local101 = local23.anInt9619 >> 9;
						if (local23.anInt9670 != Static514.anIntArrayArray48[local96][local101]) {
							local23.aBoolean674 = true;
							continue;
						}
						if (Static187.anIntArrayArray23[local96][local101] > 1) {
							local126 = Static187.anIntArrayArray23[local96][local101]--;
							local23.aBoolean674 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9614 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9619 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9614 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9619 + local96 >> 9;
						if (!Static587.method7785(local162, local23.anInt9670, local101, local169, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt9670 == Static514.anIntArrayArray48[local180][local183]) {
										local126 = Static187.anIntArrayArray23[local180][local183]--;
									}
								}
							}
							local23.aBoolean674 = true;
							continue;
						}
					}
					local23.aBoolean674 = false;
					local23.anInt9622 = Static662.method8831(local23.anInt9619, local23.anInt9614, local23.aByte132);
					Static92.method1530(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ofa;IIIIIIIIIII)V")
	public static void method1372(@OriginalArg(0) Class265[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class265 local6 = arg0[local1];
			if (local6 != null && local6.anInt6985 == arg1) {
				@Pc(17) int local17 = local6.anInt6993 + arg6;
				@Pc(22) int local22 = local6.anInt6968 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt6967 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt7024;
					local45 = local22 + local6.anInt6997;
					if (local6.anInt6967 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6967 == 0 || local6.aBoolean496 || method1383(local6).anInt7824 != 0 || local6 == Static478.aClass265_12 || local6.anInt7015 == Static210.anInt3654 || local6.anInt7015 == Static3.anInt16) {
					if (!method1367(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static498.aBoolean757) {
							local40 = Static84.method1336();
							local45 = Static614.method8324();
						}
						if (local6 == Static264.aClass265_8 && Static474.method6317(Static264.aClass265_8) != null) {
							Static464.aBoolean528 = true;
							Static340.anInt5862 = local17;
							Static292.anInt5089 = local22;
						}
						if (local6.aBoolean504 || local28 < local32 && local30 < local34) {
							if (local6.lb && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class3_Sub53 local168 = (Class3_Sub53) Static221.aClass302_22.method6603(); local168 != null; local168 = (Class3_Sub53) Static221.aClass302_22.method6605()) {
									if (local168.aBoolean739) {
										local168.method9034();
										local168.aClass265_16.aBoolean491 = false;
									}
								}
								if (Static310.anInt5192 == 0) {
									Static264.aClass265_8 = null;
									Static478.aClass265_12 = null;
								}
								Static263.anInt2105 = 0;
								Static323.aBoolean351 = false;
								Static292.aBoolean339 = false;
								if (!Static532.aBoolean580) {
									Static79.method1311();
								}
							}
							@Pc(232) boolean local232;
							if (Static627.aClass48_1.method7512() + local40 >= local28 && Static627.aClass48_1.method7511() + local45 >= local30 && Static627.aClass48_1.method7512() + local40 < local32 && Static627.aClass48_1.method7511() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static47.aBoolean59 && local232) {
								if (local6.anInt7001 >= 0) {
									Static530.anInt8325 = local6.anInt7001;
								} else if (local6.lb) {
									Static530.anInt8325 = -1;
								}
							}
							if (!Static532.aBoolean580 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static405.method5595(local6, arg11 - local22, arg10 - local17);
							}
							@Pc(276) boolean local276 = false;
							if (Static627.aClass48_1.method7514() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class3_Sub6 local291 = (Class3_Sub6) Static388.aClass302_43.method6603();
							if (local291 != null && local291.method5326() == 0 && local291.method5324() + local40 >= local28 && local291.method5323() + local45 >= local30 && local291.method5324() + local40 < local32 && local291.method5323() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray65 != null && !Static38.method606()) {
								for (local335 = 0; local335 < local6.aByteArray65.length; local335++) {
									if (Static413.aClass154_1.method5014(local6.aByteArray65[local335])) {
										if (local6.anIntArray379 == null || Static122.anInt2190 >= local6.anIntArray379[local335]) {
											@Pc(367) byte local367 = local6.aByteArray64[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static413.aClass154_1.method5014(86) && !Static413.aClass154_1.method5014(82) && !Static413.aClass154_1.method5014(81)) && ((local367 & 0x2) == 0 || Static413.aClass154_1.method5014(86)) && ((local367 & 0x1) == 0 || Static413.aClass154_1.method5014(82)) && ((local367 & 0x4) == 0 || Static413.aClass154_1.method5014(81))) {
												if (local335 < 10) {
													Static272.method4018(-1, local6.anInt7032, "", local335 + 1);
												} else if (local335 == 10) {
													Static252.method3806();
													@Pc(438) Class3_Sub40 local438 = method1383(local6);
													Static410.method5612(local438.anInt7828, local6, local438.method6484());
													Static36.aString12 = Static316.method4544(local6);
													if (Static36.aString12 == null) {
														Static36.aString12 = "Null";
													}
													Static225.aString51 = local6.aString90 + "<col=ffffff>";
												}
												local469 = local6.anIntArray375[local335];
												if (local6.anIntArray379 == null) {
													local6.anIntArray379 = new int[local6.aByteArray65.length];
												}
												if (local469 == 0) {
													local6.anIntArray379[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray379[local335] = Static122.anInt2190 + local469;
												}
											}
										}
									} else if (local6.anIntArray379 != null) {
										local6.anIntArray379[local335] = 0;
									}
								}
							}
							if (local286) {
								Static22.method531(local40 + local291.method5324() - local17, local45 + local291.method5323() - local22, local6);
							}
							if (Static264.aClass265_8 != null && Static264.aClass265_8 != local6 && local232 && method1383(local6).method6483()) {
								Static630.aClass265_14 = local6;
							}
							if (local6 == Static478.aClass265_12) {
								Static52.aBoolean75 = true;
								Static381.anInt6391 = local17;
								Static450.anInt7241 = local22;
							}
							if (local6.aBoolean496 || local6.anInt7015 != 0) {
								@Pc(558) Class3_Sub53 local558;
								if (local232 && Static565.anInt9132 != 0 && local6.anObjectArray8 != null) {
									local558 = new Class3_Sub53();
									local558.aBoolean739 = true;
									local558.aClass265_16 = local6;
									local558.anInt10767 = Static565.anInt9132;
									local558.anObjectArray35 = local6.anObjectArray8;
									Static221.aClass302_22.method6613(local558);
								}
								if (Static264.aClass265_8 != null || Static532.aBoolean580 || local6.anInt7015 != Static97.anInt1960 && Static263.anInt2105 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt7015 != 0) {
									if (local6.anInt7015 == Static377.anInt7881 || local6.anInt7015 == Static652.anInt10661) {
										Static434.aClass265_11 = local6;
										if (Static481.aClass118_2 != null) {
											Static481.aClass118_2.method2800(Static119.aClass95_4, local6.anInt6997);
										}
										if (local6.anInt7015 == Static377.anInt7881) {
											if (Static532.aBoolean580 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static251.method3804(arg8, Static119.aClass95_4, arg9);
											@Pc(641) Class34_Sub4 local641 = (Class34_Sub4) Static122.aClass317_2.method6891();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt3653 && arg10 < local641.anInt3658 && arg11 >= local641.anInt3655 && arg11 < local641.anInt3656) {
													Static79.method1311();
													Static678.method9025(local641.aClass34_Sub1_Sub1_Sub2_1);
												}
												local641 = (Class34_Sub4) Static122.aClass317_2.method6894();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt7015 == Static210.anInt3654) {
										if (local6.method5906(Static119.aClass95_4) == null || Static585.anInt9524 != 0 && Static585.anInt9524 != 3 || Static532.aBoolean580 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray381[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray378[local708]) {
											continue;
										}
										local335 -= local6.anInt7024 / 2;
										local708 -= local6.anInt6997 / 2;
										if (Static451.anInt7263 == 4) {
											local747 = (int) Static318.aFloat81 & 0x3FFF;
										} else {
											local747 = (int) Static318.aFloat81 + Static234.anInt4142 & 0x3FFF;
										}
										@Pc(759) int local759 = Class94.anIntArray561[local747];
										@Pc(763) int local763 = Class94.anIntArray560[local747];
										if (Static451.anInt7263 != 4) {
											local759 = local759 * (Static30.anInt1549 + 256) >> 8;
											local763 = local763 * (Static30.anInt1549 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static451.anInt7263 == 4) {
											local813 = (Static82.anInt1511 >> 9) + (local792 >> 2);
											local821 = (Static8.anInt108 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() - 1) * 256;
											local813 = (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 - local830 >> 9) + (local792 >> 2);
											local821 = (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 - local830 >> 9) - (local802 >> 2);
										}
										if (Static47.aBoolean59 && (Static344.anInt5895 & 0x40) != 0) {
											@Pc(863) Class265 local863 = Static212.method3145(Static376.anInt5867, Static284.anInt4811);
											if (local863 == null) {
												Static252.method3806();
											} else {
												Static390.method5454(local6.anInt7005, true, Static36.aString12, 1L, 3, local821, " ->", (long) (local6.anInt7004 << 0 | local6.anInt7032), true, local813, Static213.anInt3686, false);
											}
											continue;
										}
										if (Static227.aClass203_4 == Static499.aClass203_8) {
											Static390.method5454(-1, true, Static114.aClass84_27.method1729(Static654.anInt10668), 1L, 9, local821, "", 0L, true, local813, -1, false);
										}
										Static390.method5454(-1, true, Static344.aString76, 1L, 8, local821, "", 0L, true, local813, Static69.anInt9578, false);
										continue;
									}
									if (local6.anInt7015 == Static97.anInt1960) {
										Static118.aClass265_13 = local6;
										if (local232) {
											Static323.aBoolean351 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method5324() - local17 - local6.anInt7024 / 2) * 2.0D / (double) Static671.aFloat183);
											local708 = (int) -((double) (local45 + local291.method5323() - local22 - local6.anInt6997 / 2) * 2.0D / (double) Static671.aFloat183);
											local469 = Static81.anInt10273 + local335 + Static671.anInt9357;
											local747 = Static594.anInt9606 + local708 + Static671.anInt9358;
											@Pc(994) Class3_Sub5_Sub4 local994 = Static420.method5784();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method1152(local469, local999, local747);
											if (local999 != null) {
												if (Static413.aClass154_1.method5014(82) && Static512.anInt8070 > 0) {
													Static290.method4178(local999[0], local999[1], local999[2]);
													continue;
												}
												Static292.aBoolean339 = true;
												Static367.anInt10957 = local999[0];
												Static276.anInt4708 = local999[1];
												Static62.anInt1291 = local999[2];
											}
											Static263.anInt2105 = 1;
											Static216.aBoolean259 = false;
											Static548.anInt8559 = Static627.aClass48_1.method7512();
											Static260.anInt4561 = Static627.aClass48_1.method7511();
											continue;
										}
										if (local276 && Static263.anInt2105 > 0) {
											if (Static263.anInt2105 == 1 && (Static548.anInt8559 != Static627.aClass48_1.method7512() || Static260.anInt4561 != Static627.aClass48_1.method7511())) {
												Static246.anInt4347 = Static81.anInt10273;
												Static633.anInt10478 = Static594.anInt9606;
												Static263.anInt2105 = 2;
											}
											if (Static263.anInt2105 == 2) {
												Static216.aBoolean259 = true;
												Static613.method8314(Static246.anInt4347 + (int) ((double) (Static548.anInt8559 - Static627.aClass48_1.method7512()) * 2.0D / (double) Static671.aFloat182));
												Static135.method2275(Static633.anInt10478 - (int) ((double) (Static260.anInt4561 - Static627.aClass48_1.method7511()) * 2.0D / (double) Static671.aFloat182));
											}
											continue;
										}
										if (Static263.anInt2105 > 0 && !Static216.aBoolean259) {
											if ((Static218.anInt3740 == 1 || Static619.method8378()) && Static166.anInt3037 > 2) {
												Static476.method5364(Static548.anInt8559, Static260.anInt4561);
											} else if (Static620.method8393()) {
												Static476.method5364(Static548.anInt8559, Static260.anInt4561);
											}
										}
										Static263.anInt2105 = 0;
										continue;
									}
									if (local6.anInt7015 == Static527.anInt8310) {
										if (local276) {
											Static97.method1621(local6.anInt6997, local40 + Static627.aClass48_1.method7512() - local17, local6.anInt7024, local45 + Static627.aClass48_1.method7511() - local22);
										}
										continue;
									}
									if (local6.anInt7015 == Static3.anInt16) {
										Static421.method5795(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean492 && local286) {
									local6.aBoolean492 = true;
									if (local6.anObjectArray22 != null) {
										local558 = new Class3_Sub53();
										local558.aBoolean739 = true;
										local558.aClass265_16 = local6;
										local558.anInt10769 = local40 + local291.method5324() - local17;
										local558.anInt10767 = local45 + local291.method5323() - local22;
										local558.anObjectArray35 = local6.anObjectArray22;
										Static221.aClass302_22.method6613(local558);
									}
								}
								if (local6.aBoolean492 && local276 && local6.anObjectArray5 != null) {
									local558 = new Class3_Sub53();
									local558.aBoolean739 = true;
									local558.aClass265_16 = local6;
									local558.anInt10769 = local40 + Static627.aClass48_1.method7512() - local17;
									local558.anInt10767 = local45 + Static627.aClass48_1.method7511() - local22;
									local558.anObjectArray35 = local6.anObjectArray5;
									Static221.aClass302_22.method6613(local558);
								}
								if (local6.aBoolean492 && !local276) {
									local6.aBoolean492 = false;
									if (local6.anObjectArray3 != null) {
										local558 = new Class3_Sub53();
										local558.aBoolean739 = true;
										local558.aClass265_16 = local6;
										local558.anInt10769 = local40 + Static627.aClass48_1.method7512() - local17;
										local558.anInt10767 = local45 + Static627.aClass48_1.method7511() - local22;
										local558.anObjectArray35 = local6.anObjectArray3;
										Static538.aClass302_53.method6613(local558);
									}
								}
								if (local276 && local6.anObjectArray4 != null) {
									local558 = new Class3_Sub53();
									local558.aBoolean739 = true;
									local558.aClass265_16 = local6;
									local558.anInt10769 = local40 + Static627.aClass48_1.method7512() - local17;
									local558.anInt10767 = local45 + Static627.aClass48_1.method7511() - local22;
									local558.anObjectArray35 = local6.anObjectArray4;
									Static221.aClass302_22.method6613(local558);
								}
								if (!local6.aBoolean491 && local232) {
									local6.aBoolean491 = true;
									if (local6.anObjectArray27 != null) {
										local558 = new Class3_Sub53();
										local558.aBoolean739 = true;
										local558.aClass265_16 = local6;
										local558.anInt10769 = local40 + Static627.aClass48_1.method7512() - local17;
										local558.anInt10767 = local45 + Static627.aClass48_1.method7511() - local22;
										local558.anObjectArray35 = local6.anObjectArray27;
										Static221.aClass302_22.method6613(local558);
									}
								}
								if (local6.aBoolean491 && local232 && local6.anObjectArray6 != null) {
									local558 = new Class3_Sub53();
									local558.aBoolean739 = true;
									local558.aClass265_16 = local6;
									local558.anInt10769 = local40 + Static627.aClass48_1.method7512() - local17;
									local558.anInt10767 = local45 + Static627.aClass48_1.method7511() - local22;
									local558.anObjectArray35 = local6.anObjectArray6;
									Static221.aClass302_22.method6613(local558);
								}
								if (local6.aBoolean491 && !local232) {
									local6.aBoolean491 = false;
									if (local6.anObjectArray33 != null) {
										local558 = new Class3_Sub53();
										local558.aBoolean739 = true;
										local558.aClass265_16 = local6;
										local558.anInt10769 = local40 + Static627.aClass48_1.method7512() - local17;
										local558.anInt10767 = local45 + Static627.aClass48_1.method7511() - local22;
										local558.anObjectArray35 = local6.anObjectArray33;
										Static538.aClass302_53.method6613(local558);
									}
								}
								if (local6.anObjectArray28 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray28;
									Static432.aClass302_46.method6613(local558);
								}
								@Pc(1570) Class3_Sub53 local1570;
								if (local6.anObjectArray15 != null && Static113.anInt2068 > local6.anInt6996) {
									if (local6.anIntArray374 == null || Static113.anInt2068 - local6.anInt6996 > 32) {
										local558 = new Class3_Sub53();
										local558.aClass265_16 = local6;
										local558.anObjectArray35 = local6.anObjectArray15;
										Static221.aClass302_22.method6613(local558);
									} else {
										label699: for (local335 = local6.anInt6996; local335 < Static113.anInt2068; local335++) {
											local708 = Static678.anIntArray632[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray374.length; local469++) {
												if (local6.anIntArray374[local469] == local708) {
													local1570 = new Class3_Sub53();
													local1570.aClass265_16 = local6;
													local1570.anObjectArray35 = local6.anObjectArray15;
													Static221.aClass302_22.method6613(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt6996 = Static113.anInt2068;
								}
								if (local6.anObjectArray16 != null && Static179.anInt9618 > local6.anInt7052) {
									if (local6.anIntArray377 == null || Static179.anInt9618 - local6.anInt7052 > 32) {
										local558 = new Class3_Sub53();
										local558.aClass265_16 = local6;
										local558.anObjectArray35 = local6.anObjectArray16;
										Static221.aClass302_22.method6613(local558);
									} else {
										label675: for (local335 = local6.anInt7052; local335 < Static179.anInt9618; local335++) {
											local708 = Static318.anIntArray299[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray377.length; local469++) {
												if (local6.anIntArray377[local469] == local708) {
													local1570 = new Class3_Sub53();
													local1570.aClass265_16 = local6;
													local1570.anObjectArray35 = local6.anObjectArray16;
													Static221.aClass302_22.method6613(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt7052 = Static179.anInt9618;
								}
								if (local6.anObjectArray29 != null && Static473.anInt7527 > local6.anInt7009) {
									if (local6.anIntArray376 == null || Static473.anInt7527 - local6.anInt7009 > 32) {
										local558 = new Class3_Sub53();
										local558.aClass265_16 = local6;
										local558.anObjectArray35 = local6.anObjectArray29;
										Static221.aClass302_22.method6613(local558);
									} else {
										label651: for (local335 = local6.anInt7009; local335 < Static473.anInt7527; local335++) {
											local708 = Static146.anIntArray150[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray376.length; local469++) {
												if (local6.anIntArray376[local469] == local708) {
													local1570 = new Class3_Sub53();
													local1570.aClass265_16 = local6;
													local1570.anObjectArray35 = local6.anObjectArray29;
													Static221.aClass302_22.method6613(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt7009 = Static473.anInt7527;
								}
								if (local6.anObjectArray18 != null && Static387.anInt6465 > local6.anInt6995) {
									if (local6.anIntArray382 == null || Static387.anInt6465 - local6.anInt6995 > 32) {
										local558 = new Class3_Sub53();
										local558.aClass265_16 = local6;
										local558.anObjectArray35 = local6.anObjectArray18;
										Static221.aClass302_22.method6613(local558);
									} else {
										label627: for (local335 = local6.anInt6995; local335 < Static387.anInt6465; local335++) {
											local708 = Static143.anIntArray147[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray382.length; local469++) {
												if (local6.anIntArray382[local469] == local708) {
													local1570 = new Class3_Sub53();
													local1570.aClass265_16 = local6;
													local1570.anObjectArray35 = local6.anObjectArray18;
													Static221.aClass302_22.method6613(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt6995 = Static387.anInt6465;
								}
								if (local6.anObjectArray23 != null && Static416.anInt6762 > local6.anInt6981) {
									if (local6.anIntArray383 == null || Static416.anInt6762 - local6.anInt6981 > 32) {
										local558 = new Class3_Sub53();
										local558.aClass265_16 = local6;
										local558.anObjectArray35 = local6.anObjectArray23;
										Static221.aClass302_22.method6613(local558);
									} else {
										label603: for (local335 = local6.anInt6981; local335 < Static416.anInt6762; local335++) {
											local708 = Static333.anIntArray310[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray383.length; local469++) {
												if (local6.anIntArray383[local469] == local708) {
													local1570 = new Class3_Sub53();
													local1570.aClass265_16 = local6;
													local1570.anObjectArray35 = local6.anObjectArray23;
													Static221.aClass302_22.method6613(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt6981 = Static416.anInt6762;
								}
								if (Static35.anInt820 > local6.anInt7054 && local6.anObjectArray14 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray14;
									Static221.aClass302_22.method6613(local558);
								}
								if (Static321.anInt10318 > local6.anInt7054 && local6.anObjectArray11 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray11;
									Static221.aClass302_22.method6613(local558);
								}
								if (Static384.anInt6406 > local6.anInt7054 && local6.anObjectArray31 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray31;
									Static221.aClass302_22.method6613(local558);
								}
								if (Static215.anInt3719 > local6.anInt7054 && local6.anObjectArray1 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray1;
									Static221.aClass302_22.method6613(local558);
								}
								if (Static232.anInt4116 > local6.anInt7054 && local6.anObjectArray21 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray21;
									Static221.aClass302_22.method6613(local558);
								}
								if (Static627.anInt10390 > local6.anInt7054 && local6.anObjectArray9 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray9;
									Static221.aClass302_22.method6613(local558);
								}
								if (Static70.anInt1402 > local6.anInt7054 && local6.anObjectArray24 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray24;
									Static221.aClass302_22.method6613(local558);
								}
								local6.anInt7054 = Static156.anInt2887;
								if (local6.anObjectArray17 != null) {
									for (local335 = 0; local335 < Static310.anInt5197; local335++) {
										@Pc(2082) Class3_Sub53 local2082 = new Class3_Sub53();
										local2082.aClass265_16 = local6;
										local2082.anInt10770 = Static54.anInterface18Array1[local335].method3023();
										local2082.anInt10773 = Static54.anInterface18Array1[local335].method3024();
										local2082.anObjectArray35 = local6.anObjectArray17;
										Static221.aClass302_22.method6613(local2082);
									}
								}
								if (Static24.aBoolean33 && local6.anObjectArray32 != null) {
									local558 = new Class3_Sub53();
									local558.aClass265_16 = local6;
									local558.anObjectArray35 = local6.anObjectArray32;
									Static221.aClass302_22.method6613(local558);
								}
							}
							if (local6.anInt6967 == 5 && local6.anInt6962 != -1) {
								local6.method5910(Static300.aClass332_1, Static73.aClass64_3).method2800(Static119.aClass95_4, local6.anInt6997);
							}
							Static123.method1841(local6);
							if (local6.anInt6967 == 0) {
								method1372(arg0, local6.anInt7032, local28, local30, local32, local34, local17 - local6.anInt7033, local22 - local6.anInt7002, arg8, arg9, arg10, arg11);
								if (local6.aClass265Array4 != null) {
									method1372(local6.aClass265Array4, local6.anInt7032, local28, local30, local32, local34, local17 - local6.anInt7033, local22 - local6.anInt7002, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class3_Sub25 local2208 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local6.anInt7032);
								if (local2208 != null) {
									if (Static227.aClass203_4 == Static342.aClass203_6 && local2208.anInt3966 == 0 && !Static532.aBoolean580 && local232 && !Static97.aBoolean153) {
										Static79.method1311();
									}
									Static74.method1277(local32, local28, arg8, arg11, local17, arg10, local22, local2208.anInt3959, local34, arg9, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static123.method1841(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1373(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static439.anInt7133;
		@Pc(3) int[] local3 = Static294.anIntArray593;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static52.anInt1140; local5++) {
			@Pc(15) Class34_Sub1_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local5 - local1])).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			}
			if (local15.aByte132 == arg0 && local15.anInt9670 >= 0) {
				@Pc(39) int local39 = local15.method7866();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9614 & 0x1FF) != 0 || (local15.anInt9619 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9614 & 0x1FF) != 256 || (local15.anInt9619 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9614 >> 9;
					local80 = local15.anInt9619 >> 9;
					if (local15.anInt9670 > Static514.anIntArrayArray48[local75][local80]) {
						Static514.anIntArrayArray48[local75][local80] = local15.anInt9670;
						Static187.anIntArrayArray23[local75][local80] = 1;
					} else if (local15.anInt9670 == Static514.anIntArrayArray48[local75][local80]) {
						local116 = Static187.anIntArrayArray23[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9614 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9619 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9614 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9619 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt9670 > Static514.anIntArrayArray48[local158][local161]) {
								Static514.anIntArrayArray48[local158][local161] = local15.anInt9670;
								Static187.anIntArrayArray23[local158][local161] = 1;
							} else if (local15.anInt9670 == Static514.anIntArrayArray48[local158][local161]) {
								local116 = Static187.anIntArrayArray23[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ofa;)Lclient!ofa;")
	public static Class265 method1374(@OriginalArg(0) Class265 arg0) {
		@Pc(4) int local4 = method1383(arg0).method6485();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static223.method3278(arg0.anInt6985);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1376() {
		@Pc(1) int local1 = Static439.anInt7133;
		@Pc(3) int[] local3 = Static294.anIntArray593;
		@Pc(11) int local11 = Static331.aBoolean358 ? local1 : local1 + Static52.anInt1140;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class34_Sub1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local13 - local1])).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			}
			if (local23.anInt9670 >= 0) {
				@Pc(43) int local43 = local23.method7866();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9614 & 0x1FF) == 0 && (local23.anInt9619 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9614 & 0x1FF) == 256 && (local23.anInt9619 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9622 = Static662.method8831(local23.anInt9619, local23.anInt9614, local23.aByte132);
				Static92.method1530(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1377() {
		Static387.anInt6472 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static52.anInt1140; local3++) {
			@Pc(14) Class34_Sub1_Sub1_Sub2_Sub2 local14 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local3])).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			if (local14.aBoolean674 && local14.method7871() != -1) {
				@Pc(32) int local32 = (local14.method7866() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9614 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9619 - local32 >> 9;
				@Pc(53) Class34_Sub1_Sub1_Sub2 local53 = Static40.method757(local46, local14.aByte132, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt9671;
					if (local53 instanceof Class34_Sub1_Sub1_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt9650 == 0 && local53.method7871() != -1) {
						Static64.anIntArray68[Static387.anInt6472] = local58;
						Static312.anIntArray295[Static387.anInt6472] = local58;
						Static387.anInt6472++;
						local53.anInt9650++;
					}
					Static64.anIntArray68[Static387.anInt6472] = local58;
					Static312.anIntArray295[Static387.anInt6472] = local14.anInt9671 + 2048;
					Static387.anInt6472++;
					local53.anInt9650++;
				}
			}
		}
		Static305.method4422(Static64.anIntArray68, 0, Static387.anInt6472 - 1, Static312.anIntArray295);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1378() {
		for (@Pc(1) int local1 = 0; local1 < Static98.anInt361; local1++) {
			@Pc(6) int[] local6 = Static514.anIntArrayArray48[local1];
			for (@Pc(8) int local8 = 0; local8 < Static438.anInt7120; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method1379(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static31.anInt753; local16++) {
			if (arg0.equalsIgnoreCase(Static459.aStringArray54[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static133.aStringArray21[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ofa;)Lclient!qja;")
	public static Class3_Sub40 method1383(@OriginalArg(0) Class265 arg0) {
		@Pc(13) Class3_Sub40 local13 = (Class3_Sub40) Static26.aClass333_3.method7489(((long) arg0.anInt7032 << 32) + (long) arg0.anInt7004);
		return local13 == null ? arg0.aClass3_Sub40_3 : local13;
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	public static void method1384() {
		Static559.anIntArray478 = null;
		Static97.anIntArray115 = null;
		Static335.aBoolean359 = false;
		Static655.anIntArray583 = null;
		Static206.anIntArray200 = null;
		Static311.anIntArray294 = null;
	}
}
