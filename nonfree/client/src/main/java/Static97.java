import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!vf;")
	public static Class78 aClass78_10 = new Class78();

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
	public static int anInt2253 = 0;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "Lclient!v;")
	public static Class76 aClass76_1027 = Static134.method2017("Texturen geladen)3");

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "Lclient!v;")
	public static Class76 aClass76_1028 = Static134.method2017("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "Lclient!v;")
	public static Class76 aClass76_1029 = Static134.method2017("0(U");

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
	public static void method1557() {
		Static2.aClass72_1.method1786();
		Static9.aClass72_7.method1786();
		Static38.aClass72_16.method1786();
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	public static void method1558() {
		aClass76_1027 = null;
		aClass76_1029 = null;
		aClass76_1028 = null;
		aClass78_10 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[Lclient!rd;I[III)V")
	public static void method1559(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class61[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= arg2) {
			return;
		}
		@Pc(16) int local16 = arg4 - 1;
		@Pc(20) int local20 = arg2 + 1;
		@Pc(27) int local27 = (arg4 + arg2) / 2;
		@Pc(31) Class61 local31 = arg1[local27];
		arg1[local27] = arg1[arg4];
		arg1[arg4] = local31;
		while (local20 > local16) {
			@Pc(45) boolean local45 = true;
			@Pc(48) int local48;
			@Pc(60) int local60;
			@Pc(63) int local63;
			do {
				local20--;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg3[local48] == 2) {
						local60 = arg1[local20].anInt2312;
						local63 = local31.anInt2312;
					} else if (arg3[local48] == 1) {
						local63 = local31.anInt2314;
						local60 = arg1[local20].anInt2314;
						if (local60 == -1 && arg0[local48] == 1) {
							local60 = 2001;
						}
						if (local63 == -1 && arg0[local48] == 1) {
							local63 = 2001;
						}
					} else if (arg3[local48] == 3) {
						local63 = local31.aBoolean136 ? 1 : 0;
						local60 = arg1[local20].aBoolean136 ? 1 : 0;
					} else {
						local60 = arg1[local20].anInt2309;
						local63 = local31.anInt2309;
					}
					if (local63 != local60) {
						if ((arg0[local48] != 1 || local60 <= local63) && (arg0[local48] != 0 || local60 >= local63)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			local45 = true;
			do {
				local16++;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg3[local48] == 2) {
						local63 = local31.anInt2312;
						local60 = arg1[local16].anInt2312;
					} else if (arg3[local48] == 1) {
						local63 = local31.anInt2314;
						if (local63 == -1 && arg0[local48] == 1) {
							local63 = 2001;
						}
						local60 = arg1[local16].anInt2314;
						if (local60 == -1 && arg0[local48] == 1) {
							local60 = 2001;
						}
					} else if (arg3[local48] == 3) {
						local63 = local31.aBoolean136 ? 1 : 0;
						local60 = arg1[local16].aBoolean136 ? 1 : 0;
					} else {
						local60 = arg1[local16].anInt2309;
						local63 = local31.anInt2309;
					}
					if (local63 != local60) {
						if ((arg0[local48] != 1 || local60 >= local63) && (arg0[local48] != 0 || local60 <= local63)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			if (local16 < local20) {
				@Pc(336) Class61 local336 = arg1[local16];
				arg1[local16] = arg1[local20];
				arg1[local20] = local336;
			}
		}
		method1559(arg0, arg1, local20, arg3, arg4);
		method1559(arg0, arg1, arg2, arg3, local20 + 1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[Lclient!dd;IIIBIII)V")
	public static void method1560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub8[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static46.method1828(arg8, arg0, arg6, arg3);
		Static37.method718();
		for (@Pc(17) int local17 = 0; local17 < arg2.length; local17++) {
			@Pc(23) Class4_Sub8 local23 = arg2[local17];
			if (local23 != null && (arg5 == local23.anInt489 || arg5 == -1412584499 && local23 == Static17.aClass4_Sub8_1)) {
				@Pc(48) int local48;
				if (arg1 == -1) {
					Static41.anIntArray131[Static77.anInt1960] = local23.anInt457 + arg7;
					Static126.anIntArray396[Static77.anInt1960] = arg4 + local23.anInt491;
					Static134.anIntArray409[Static77.anInt1960] = local23.anInt513;
					Static30.anIntArray185[Static77.anInt1960] = local23.anInt498;
					local48 = Static77.anInt1960++;
				} else {
					local48 = arg1;
				}
				local23.anInt480 = Static78.anInt1981;
				local23.anInt487 = local48;
				if (!local23.aBoolean37 || !Static31.method444(local23)) {
					if (local23.anInt458 > 0) {
						Static76.method1389(local23);
					}
					@Pc(108) int local108 = local23.anInt491 + arg4;
					@Pc(113) int local113 = arg7 + local23.anInt457;
					@Pc(116) int local116 = local23.anInt465;
					@Pc(141) int local141;
					@Pc(147) int local147;
					if (Static17.aClass4_Sub8_1 == local23) {
						if (arg5 != -1412584499 && !local23.aBoolean34) {
							Static29.anInt599 = arg4;
							Static69.anInt1765 = arg7;
							Static95.aClass4_Sub8Array2 = arg2;
							continue;
						}
						if (Static7.aBoolean6 && Static43.aBoolean17) {
							local141 = Static2.anInt31;
							local141 -= Static98.anInt2275;
							local147 = Static126.anInt2734;
							if (local141 < Static54.anInt2513) {
								local141 = Static54.anInt2513;
							}
							if (Static54.anInt2513 + Static55.aClass4_Sub8_11.anInt513 < local141 + local23.anInt513) {
								local141 = Static54.anInt2513 + Static55.aClass4_Sub8_11.anInt513 - local23.anInt513;
							}
							local147 -= Static105.anInt2347;
							local113 = local141;
							if (Static28.anInt586 > local147) {
								local147 = Static28.anInt586;
							}
							if (Static28.anInt586 + Static55.aClass4_Sub8_11.anInt498 < local147 - -local23.anInt498) {
								local147 = Static55.aClass4_Sub8_11.anInt498 + Static28.anInt586 - local23.anInt498;
							}
							local108 = local147;
						}
						if (!local23.aBoolean34) {
							local116 = 128;
						}
					}
					@Pc(220) int local220;
					@Pc(224) int local224;
					@Pc(234) int local234;
					@Pc(242) int local242;
					@Pc(240) int local240;
					@Pc(247) int local247;
					if (local23.anInt473 == 2) {
						local141 = arg8;
						local220 = arg6;
						local147 = arg0;
						local224 = arg3;
					} else if (local23.anInt473 == 9) {
						local234 = local113;
						local240 = local113 + local23.anInt513;
						local242 = local108;
						local247 = local108 + local23.anInt498;
						if (local113 > local240) {
							local234 = local240;
							local240 = local113;
						}
						local240++;
						local220 = local240 < arg6 ? local240 : arg6;
						local141 = arg8 < local234 ? local234 : arg8;
						if (local247 < local108) {
							local242 = local247;
							local247 = local108;
						}
						local147 = arg0 >= local242 ? arg0 : local242;
						local247++;
						local224 = arg3 <= local247 ? arg3 : local247;
					} else {
						local141 = local113 > arg8 ? local113 : arg8;
						local147 = local108 > arg0 ? local108 : arg0;
						local234 = local23.anInt513 + local113;
						local242 = local23.anInt498 + local108;
						local224 = local242 < arg3 ? local242 : arg3;
						local220 = arg6 > local234 ? local234 : arg6;
					}
					if (!local23.aBoolean37 || local220 > local141 && local224 > local147) {
						if (local23.anInt458 != 0) {
							if (local23.anInt458 == 1337) {
								Static3.anInt2202 = local108;
								Static32.anInt813 = local113;
								Static121.method1839(local23.anInt513, local108, local23.anInt498, local113);
								Static46.method1828(arg8, arg0, arg6, arg3);
								continue;
							}
							if (local23.anInt458 == 1338) {
								Static27.method2001(local48, local108, local113);
								Static46.method1828(arg8, arg0, arg6, arg3);
								continue;
							}
						}
						local234 = Static2.anInt31;
						local242 = Static126.anInt2734;
						if (!Static32.aBoolean56 && local234 >= local141 && local147 <= local242 && local220 > local234 && local224 > local242) {
							Static94.method1505(local234 - local113, -local108 + local242, local23);
						}
						if (local23.anInt473 == 0) {
							if (!local23.aBoolean37 && Static31.method444(local23) && Static40.aClass4_Sub8_8 != local23) {
								continue;
							}
							if (!local23.aBoolean37) {
								if (local23.anInt494 > local23.anInt482 - local23.anInt498) {
									local23.anInt494 = local23.anInt482 - local23.anInt498;
								}
								if (local23.anInt494 < 0) {
									local23.anInt494 = 0;
								}
							}
							method1560(local147, local48, arg2, local224, local108 - local23.anInt494, local23.anInt514, local220, local113 - local23.anInt492, local141);
							if (local23.aClass4_Sub8Array1 != null) {
								method1560(local147, local48, local23.aClass4_Sub8Array1, local224, local108 - local23.anInt494, local23.anInt514, local220, local113 - local23.anInt492, local141);
							}
							@Pc(546) Class4_Sub14 local546 = (Class4_Sub14) Static42.aClass28_3.method770((long) local23.anInt514);
							if (local546 != null) {
								if (local546.anInt1983 == 0 && Static2.anInt31 >= local141 && Static126.anInt2734 >= local147 && local220 > Static2.anInt31 && local224 > Static126.anInt2734 && !Static32.aBoolean56 && !Static99.aBoolean157) {
									Static114.aClass76Array26[0] = Static117.aClass76_1204;
									Static62.aClass76Array14[0] = Static133.aClass76_1322;
									Static95.anIntArray311[0] = 1002;
									Static10.anInt206 = 1;
								}
								Static45.method818(local113, local108, local546.anInt1980, local141, local48, local224, local220, local147);
							}
							Static46.method1828(arg8, arg0, arg6, arg3);
							Static37.method718();
						}
						if (Static21.aBooleanArray4[local48] || Static13.anInt223 > 1) {
							if (local23.anInt473 == 0 && !local23.aBoolean37 && local23.anInt482 > local23.anInt498) {
								Static19.method787(local23.anInt494, local23.anInt482, local108, local23.anInt513 + local113, local23.anInt498);
							}
							if (local23.anInt473 != 1) {
								@Pc(662) int local662;
								@Pc(673) int local673;
								@Pc(817) int local817;
								@Pc(721) int local721;
								@Pc(892) int local892;
								@Pc(683) int local683;
								@Pc(830) int local830;
								if (local23.anInt473 == 2) {
									local240 = 0;
									for (local247 = 0; local247 < local23.anInt498; local247++) {
										for (local662 = 0; local662 < local23.anInt513; local662++) {
											local673 = local113 + (local23.anInt469 + 32) * local662;
											local683 = local108 + local247 * (local23.anInt517 + 32);
											if (local240 < 20) {
												local673 += local23.anIntArray68[local240];
												local683 += local23.anIntArray73[local240];
											}
											if (local23.anIntArray71[local240] > 0) {
												local721 = local23.anIntArray71[local240] - 1;
												if (arg8 < local673 + 32 && local673 < arg6 && local683 + 32 > arg0 && local683 < arg3 || local23 == Static23.aClass4_Sub8_7 && Static94.anInt2168 == local240) {
													@Pc(780) Class4_Sub4_Sub5_Sub2 local780;
													if (Static39.anInt1125 == 1 && Static9.anInt174 == local240 && local23.anInt514 == Static130.anInt2777) {
														local780 = Static1.method2(local23.anIntArray66[local240], 2, 0, false, local721);
													} else {
														local780 = Static1.method2(local23.anIntArray66[local240], 1, 3153952, false, local721);
													}
													if (local780 == null) {
														Static63.method1095(local23);
													} else if (local23 == Static23.aClass4_Sub8_7 && local240 == Static94.anInt2168) {
														local817 = Static126.anInt2734 - Static111.anInt2443;
														if (local817 < 5 && local817 > -5) {
															local817 = 0;
														}
														local830 = Static2.anInt31 - Static42.anInt1163;
														if (local830 < 5 && local830 > -5) {
															local830 = 0;
														}
														if (Static36.anInt1011 < 5) {
															local830 = 0;
															local817 = 0;
														}
														local780.method914(local673 + local830, local817 + local683, 128);
														if (arg5 != -1) {
															@Pc(865) Class4_Sub8 local865 = arg2[arg5 & 0xFFFF];
															if (local683 + local817 < Static46.anInt2603 && local865.anInt494 > 0) {
																local892 = (Static46.anInt2603 - local817 - local683) * Static1.anInt5 / 3;
																if (local892 > Static1.anInt5 * 10) {
																	local892 = Static1.anInt5 * 10;
																}
																if (local892 > local865.anInt494) {
																	local892 = local865.anInt494;
																}
																local865.anInt494 -= local892;
																Static111.anInt2443 += local892;
																Static63.method1095(local865);
															}
															if (Static46.anInt2606 < local817 + local683 + 32 && local865.anInt482 - local865.anInt498 > local865.anInt494) {
																local892 = (local683 + local817 + 32 - Static46.anInt2606) * Static1.anInt5 / 3;
																if (Static1.anInt5 * 10 < local892) {
																	local892 = Static1.anInt5 * 10;
																}
																if (local892 > local865.anInt482 - local865.anInt498 - local865.anInt494) {
																	local892 = local865.anInt482 - local865.anInt498 - local865.anInt494;
																}
																Static111.anInt2443 -= local892;
																local865.anInt494 += local892;
																Static63.method1095(local865);
															}
														}
													} else if (local23 == Static123.aClass4_Sub8_15 && local240 == Static105.anInt2346) {
														local780.method914(local673, local683, 128);
													} else {
														local780.method903(local673, local683);
													}
												}
											} else if (local23.anIntArray74 != null && local240 < 20) {
												@Pc(1033) Class4_Sub4_Sub5_Sub2 local1033 = local23.method333(local240);
												if (local1033 != null) {
													local1033.method903(local673, local683);
												} else if (Static40.aBoolean69) {
													Static63.method1095(local23);
												}
											}
											local240++;
										}
									}
								} else if (local23.anInt473 == 3) {
									if (Static2.method14(local23)) {
										local240 = local23.anInt525;
										if (Static40.aClass4_Sub8_8 == local23 && local23.anInt459 != 0) {
											local240 = local23.anInt459;
										}
									} else {
										local240 = local23.anInt532;
										if (local23 == Static40.aClass4_Sub8_8 && local23.anInt520 != 0) {
											local240 = local23.anInt520;
										}
									}
									if (local116 == 0) {
										if (local23.aBoolean42) {
											Static46.method1823(local113, local108, local23.anInt513, local23.anInt498, local240);
										} else {
											Static46.method1832(local113, local108, local23.anInt513, local23.anInt498, local240);
										}
									} else if (local23.aBoolean42) {
										Static46.method1825(local113, local108, local23.anInt513, local23.anInt498, local240, 256 - (local116 & 0xFF));
									} else {
										Static46.method1824(local113, local108, local23.anInt513, local23.anInt498, local240, 256 - (local116 & 0xFF));
									}
								} else {
									@Pc(1172) Class4_Sub4_Sub5_Sub3_Sub1 local1172;
									if (local23.anInt473 == 4) {
										local1172 = local23.method331();
										if (local1172 != null) {
											@Pc(1184) Class76 local1184 = local23.aClass76_189;
											if (Static2.method14(local23)) {
												local247 = local23.anInt525;
												if (local23 == Static40.aClass4_Sub8_8 && local23.anInt459 != 0) {
													local247 = local23.anInt459;
												}
												if (local23.aClass76_195.method1851() > 0) {
													local1184 = local23.aClass76_195;
												}
											} else {
												local247 = local23.anInt532;
												if (local23 == Static40.aClass4_Sub8_8 && local23.anInt520 != 0) {
													local247 = local23.anInt520;
												}
											}
											if (local23.aBoolean37 && local23.anInt477 != -1) {
												@Pc(1241) Class4_Sub4_Sub7 local1241 = Static61.method1040(local23.anInt477);
												local1184 = local1241.aClass76_556;
												if (local1184 == null) {
													local1184 = Static107.aClass76_1111;
												}
												if ((local1241.anInt1270 == 1 || local23.anInt462 != 1) && local23.anInt462 != -1) {
													local1184 = Static59.method1017(new Class76[] { Static54.aClass76_1195, local1184, Static124.aClass76_1268, Static101.method1589(local23.anInt462) });
												}
											}
											if (Static65.aClass4_Sub8_5 == local23) {
												local1184 = Static45.aClass76_524;
												local247 = local23.anInt532;
											}
											if (!local23.aBoolean37) {
												local1184 = Static64.method1101(local1184, local23);
											}
											local1172.method1327(local1184, local113, local108, local23.anInt513, local23.anInt498, local247, local23.aBoolean40 ? 0 : -1, local23.anInt524, local23.anInt493, local23.anInt481);
										} else if (Static40.aBoolean69) {
											Static63.method1095(local23);
										}
									} else if (local23.anInt473 == 5) {
										@Pc(1347) Class4_Sub4_Sub5_Sub2 local1347;
										if (local23.aBoolean37) {
											if (local23.anInt477 == -1) {
												local1347 = local23.method336(false);
											} else {
												local1347 = Static1.method2(local23.anInt462, local23.anInt506, local23.anInt505, false, local23.anInt477);
											}
											if (local1347 != null) {
												local247 = local1347.anInt1333;
												local662 = local1347.anInt1334;
												if (local23.aBoolean31) {
													Static46.method1819(local113, local108, local23.anInt513 + local113, local23.anInt498 + local108);
													local673 = (local23.anInt513 + local247 - 1) / local247;
													local683 = (local662 + local23.anInt498 - 1) / local662;
													for (local830 = 0; local830 < local673; local830++) {
														for (local817 = 0; local817 < local683; local817++) {
															if (local23.anInt502 != 0) {
																local1347.method920(local247 / 2 + local247 * local830 + local113, local662 / 2 + local108 + local817 * local662, local23.anInt502, 4096);
															} else if (local116 == 0) {
																local1347.method903(local247 * local830 + local113, local108 - -(local662 * local817));
															} else {
																local1347.method914(local113 + local830 * local247, local662 * local817 + local108, 256 - (local116 & 0xFF));
															}
														}
													}
													Static46.method1828(arg8, arg0, arg6, arg3);
												} else {
													local673 = local23.anInt513 * 4096 / local247;
													if (local23.anInt502 != 0) {
														local1347.method920(local113 + local23.anInt513 / 2, local108 + local23.anInt498 / 2, local23.anInt502, local673);
													} else if (local116 != 0) {
														local1347.method917(local113, local108, local23.anInt513, local23.anInt498, 256 - (local116 & 0xFF));
													} else if (local247 == local23.anInt513 && local23.anInt498 == local662) {
														local1347.method903(local113, local108);
													} else {
														local1347.method905(local113, local108, local23.anInt513, local23.anInt498);
													}
												}
											} else if (Static40.aBoolean69) {
												Static63.method1095(local23);
											}
										} else {
											local1347 = local23.method336(Static2.method14(local23));
											if (local1347 != null) {
												local1347.method903(local113, local108);
											} else if (Static40.aBoolean69) {
												Static63.method1095(local23);
											}
										}
									} else {
										@Pc(1629) Class4_Sub4_Sub7 local1629;
										if (local23.anInt473 == 6) {
											@Pc(1606) boolean local1606 = Static2.method14(local23);
											local673 = 0;
											if (local1606) {
												local247 = local23.anInt521;
											} else {
												local247 = local23.anInt507;
											}
											@Pc(1620) Class4_Sub4_Sub3_Sub7 local1620 = null;
											if (local23.anInt477 != -1) {
												local1629 = Static61.method1040(local23.anInt477);
												if (local1629 != null) {
													local1629 = local1629.method858(local23.anInt462);
													local1620 = local1629.method851(1);
													if (local1620 == null) {
														Static63.method1095(local23);
													} else {
														local1620.method1767();
														local673 = local1620.anInt2514 / 2;
													}
												}
											} else if (local23.anInt530 == 5) {
												if (local23.anInt516 == 0) {
													local1620 = Static87.aClass26_4.method629(null, null, -1, -1);
												} else {
													local1620 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.method1754();
												}
											} else if (local247 == -1) {
												local1620 = local23.method337(-1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass26_3, local1606, null);
												if (local1620 == null && Static40.aBoolean69) {
													Static63.method1095(local23);
												}
											} else {
												@Pc(1685) Class4_Sub4_Sub9 local1685 = Static118.method1796(local247);
												local1620 = local23.method337(local23.anInt519, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass26_3, local1606, local1685);
												if (local1620 == null && Static40.aBoolean69) {
													Static63.method1095(local23);
												}
											}
											Static37.method717(local113 + local23.anInt513 / 2, local23.anInt498 / 2 + local108);
											local683 = Class4_Sub4_Sub5_Sub1.anIntArray118[local23.anInt509] * local23.anInt503 >> 16;
											local830 = local23.anInt503 * Class4_Sub4_Sub5_Sub1.anIntArray119[local23.anInt509] >> 16;
											if (local1620 != null) {
												if (local23.aBoolean37) {
													local1620.method1767();
													if (local23.aBoolean32) {
														local1620.method1764(local23.anInt470, local23.anInt478, local23.anInt509, local23.anInt510, local23.anInt526 + local673 + local683, local23.anInt526 + local830, local23.anInt503);
													} else {
														local1620.method1772(local23.anInt470, local23.anInt478, local23.anInt509, local23.anInt510, local23.anInt526 + local683 + local673, local23.anInt526 + local830);
													}
												} else {
													local1620.method1772(local23.anInt470, 0, local23.anInt509, 0, local683, local830);
												}
											}
											Static37.method713();
										} else {
											if (local23.anInt473 == 7) {
												local1172 = local23.method331();
												if (local1172 == null) {
													if (Static40.aBoolean69) {
														Static63.method1095(local23);
													}
													continue;
												}
												local247 = 0;
												for (local662 = 0; local662 < local23.anInt498; local662++) {
													for (local673 = 0; local673 < local23.anInt513; local673++) {
														if (local23.anIntArray71[local247] > 0) {
															local1629 = Static61.method1040(local23.anIntArray71[local247] - 1);
															@Pc(1905) Class76 local1905;
															if (local1629.anInt1270 != 1 && local23.anIntArray66[local247] == 1) {
																local1905 = Static59.method1017(new Class76[] { Static54.aClass76_1195, local1629.aClass76_556, Static10.aClass76_97 });
															} else {
																local1905 = Static59.method1017(new Class76[] { Static54.aClass76_1195, local1629.aClass76_556, Static124.aClass76_1268, Static101.method1589(local23.anIntArray66[local247]) });
															}
															local817 = local113 + local673 * (local23.anInt469 + 115);
															local721 = (local23.anInt517 + 12) * local662 + local108;
															if (local23.anInt524 == 0) {
																local1172.method1334(local1905, local817, local721, local23.anInt532, local23.aBoolean40 ? 0 : -1);
															} else if (local23.anInt524 == 1) {
																local1172.method1311(local1905, local817 + local23.anInt513 / 2, local721, local23.anInt532, local23.aBoolean40 ? 0 : -1);
															} else {
																local1172.method1331(local1905, local23.anInt513 + local817 - 1, local721, local23.anInt532, local23.aBoolean40 ? 0 : -1);
															}
														}
														local247++;
													}
												}
											}
											@Pc(2197) int local2197;
											if (local23.anInt473 == 8 && Static65.aClass4_Sub8_4 == local23 && Static120.anInt2589 == Static39.anInt1123) {
												local240 = 0;
												local247 = 0;
												@Pc(2044) Class4_Sub4_Sub5_Sub3_Sub1 local2044 = Static95.aClass4_Sub4_Sub5_Sub3_Sub1_5;
												@Pc(2047) Class76 local2047 = local23.aClass76_189;
												local2047 = Static64.method1101(local2047, local23);
												@Pc(2068) Class76 local2068;
												while (local2047.method1851() > 0) {
													local830 = local2047.method1861(Static95.aClass76_988);
													if (local830 == -1) {
														local2068 = local2047;
														local2047 = Static133.aClass76_1322;
													} else {
														local2068 = local2047.method1876(local830, 0);
														local2047 = local2047.method1874(local830 + 4);
													}
													local817 = local2044.method1317(local2068);
													local247 += local2044.anInt1871 + 1;
													if (local240 < local817) {
														local240 = local817;
													}
												}
												local817 = local108 + local23.anInt498 + 5;
												local240 += 6;
												local830 = local113 + local23.anInt513 - local240 - 5;
												if (local830 < local113 + 5) {
													local830 = local113 + 5;
												}
												local247 += 7;
												if (local817 + local247 > arg3) {
													local817 = arg3 - local247;
												}
												if (local240 + local830 > arg6) {
													local830 = arg6 - local240;
												}
												Static46.method1823(local830, local817, local240, local247, 16777120);
												Static46.method1832(local830, local817, local240, local247, 0);
												local721 = local817 + local2044.anInt1871 + 2;
												local2047 = local23.aClass76_189;
												local2047 = Static64.method1101(local2047, local23);
												while (local2047.method1851() > 0) {
													local2197 = local2047.method1861(Static95.aClass76_988);
													if (local2197 == -1) {
														local2068 = local2047;
														local2047 = Static133.aClass76_1322;
													} else {
														local2068 = local2047.method1876(local2197, 0);
														local2047 = local2047.method1874(local2197 + 4);
													}
													local2044.method1334(local2068, local830 + 3, local721, 0, -1);
													local721 += local2044.anInt1871 + 1;
												}
											}
											if (local23.anInt473 == 9) {
												if (local23.anInt468 == 1) {
													Static46.method1829(local113, local108, local113 + local23.anInt513, local108 + local23.anInt498, local23.anInt532);
												} else {
													local240 = local23.anInt513 < 0 ? -local23.anInt513 : local23.anInt513;
													local247 = local23.anInt498 >= 0 ? local23.anInt498 : -local23.anInt498;
													local662 = local240;
													if (local240 < local247) {
														local662 = local247;
													}
													if (local662 != 0) {
														local673 = (local23.anInt513 << 16) / local662;
														local683 = (local23.anInt498 << 16) / local662;
														if (local673 < local683) {
															local683 = -local683;
														} else {
															local673 = -local673;
														}
														local830 = local683 * local23.anInt468 >> 17;
														local817 = local23.anInt468 * local683 + 1 >> 17;
														local721 = local23.anInt468 * local673 >> 17;
														local2197 = local23.anInt468 * local673 + 1 >> 17;
														@Pc(2363) int local2363 = local113 + local830;
														@Pc(2372) int local2372 = local113 + local23.anInt513 - local817;
														@Pc(2379) int local2379 = local830 + local23.anInt513 + local113;
														@Pc(2388) int local2388 = local108 + local23.anInt498 - local2197;
														@Pc(2392) int local2392 = local108 - local2197;
														local892 = local113 - local817;
														@Pc(2401) int local2401 = local721 + local108;
														@Pc(2408) int local2408 = local721 + local23.anInt498 + local108;
														Static37.method711(local2363, local892, local2372);
														Static37.method729(local2401, local2392, local2388, local2363, local892, local2372, local23.anInt532);
														Static37.method711(local2363, local2372, local2379);
														Static37.method729(local2401, local2388, local2408, local2363, local2372, local2379, local23.anInt532);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
	public static void method1561() {
		Static60.aClass72_17.method1786();
	}
}
