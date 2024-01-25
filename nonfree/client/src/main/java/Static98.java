import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!fq", name = "M", descriptor = "Lclient!uh;")
	public static Class201 aClass201_1;

	@OriginalMember(owner = "client!fq", name = "L", descriptor = "Lclient!bo;")
	public static Class24 aClass24_9 = new Class24(16);

	@OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
	public static int anInt2072 = -1;

	@OriginalMember(owner = "client!fq", name = "R", descriptor = "I")
	public static int anInt2073 = 0;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!ir;)V")
	public static void method1677(@OriginalArg(1) Class100 arg0) {
		Static69.aClass100_24 = arg0;
		Static127.anInt2722 = Static69.aClass100_24.method2309(4);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III[Lclient!sj;IIIIII)V")
	public static void method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class181[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
		for (@Pc(21) int local21 = 0; local21 < arg3.length; local21++) {
			@Pc(27) Class181 local27 = arg3[local21];
			if (local27 != null && (local27.anInt5734 == arg5 || arg5 == -1412584499 && Static328.aClass181_50 == local27)) {
				@Pc(48) int local48;
				if (arg4 == -1) {
					Class3.aRectangleArray122[Static312.anInt6281].setBounds(local27.anInt5687 + arg8, local27.anInt5690 + arg2, local27.anInt5704, local27.anInt5721);
					local48 = Static312.anInt6281++;
				} else {
					local48 = arg4;
				}
				local27.anInt5682 = Static51.anInt1101;
				local27.anInt5735 = local48;
				if (!local27.aBoolean381 || !Static47.method818(local27)) {
					if (local27.anInt5755 > 0) {
						Static174.method2867(local27);
					}
					@Pc(98) int local98 = arg8 + local27.anInt5687;
					@Pc(103) int local103 = arg2 + local27.anInt5690;
					@Pc(106) int local106 = local27.anInt5759;
					if (Static212.aBoolean98 && (Static47.method819(local27).anInt1455 != 0 || local27.anInt5715 == 0) && local106 > 127) {
						local106 = 127;
					}
					@Pc(153) int local153;
					@Pc(155) int local155;
					if (local27 == Static328.aClass181_50) {
						if (arg5 != -1412584499 && !local27.aBoolean384) {
							Static90.anInt1794 = arg8;
							Static94.anInt1921 = arg2;
							Static67.aClass181Array1 = arg3;
							continue;
						}
						if (!local27.aBoolean384) {
							local106 = 128;
						}
						if (Static3.aBoolean7 && Static61.aBoolean62) {
							local153 = Static192.anInt4000;
							local155 = Static221.anInt4562;
							local153 -= Static45.anInt926;
							local155 -= Static337.anInt6550;
							if (local153 < anInt2072) {
								local153 = anInt2072;
							}
							if (local155 < Static105.anInt2212) {
								local155 = Static105.anInt2212;
							}
							if (Static163.aClass181_28.anInt5704 + anInt2072 < local27.anInt5704 + local153) {
								local153 = anInt2072 + Static163.aClass181_28.anInt5704 - local27.anInt5704;
							}
							local98 = local153;
							if (Static105.anInt2212 + Static163.aClass181_28.anInt5721 < local27.anInt5721 + local155) {
								local155 = Static163.aClass181_28.anInt5721 + Static105.anInt2212 - local27.anInt5721;
							}
							local103 = local155;
						}
					}
					@Pc(241) int local241;
					@Pc(235) int local235;
					@Pc(249) int local249;
					@Pc(254) int local254;
					if (local27.anInt5715 == 2) {
						local235 = arg1;
						local153 = arg6;
						local155 = arg7;
						local241 = arg0;
					} else {
						local249 = local98 + local27.anInt5704;
						local254 = local27.anInt5721 + local103;
						local155 = arg7 >= local103 ? arg7 : local103;
						local153 = arg6 < local98 ? local98 : arg6;
						if (local27.anInt5715 == 9) {
							local249++;
							local254++;
						}
						local241 = local249 < arg0 ? local249 : arg0;
						local235 = local254 >= arg1 ? arg1 : local254;
					}
					if (!local27.aBoolean381 || local153 < local241 && local155 < local235) {
						@Pc(519) int local519;
						@Pc(576) int local576;
						@Pc(578) int local578;
						@Pc(580) int local580;
						@Pc(582) int local582;
						@Pc(624) int local624;
						@Pc(521) int local521;
						@Pc(550) int local550;
						if (local27.anInt5755 != 0) {
							if (local27.anInt5755 == 1337 || local27.anInt5755 == 1403) {
								Static255.method5161(local98, local27.anInt5721, local27.anInt5704, local103, local27.anInt5755 == 1403);
								Static159.aBooleanArray13[local48] = true;
								Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
								continue;
							}
							if (local27.anInt5755 == 1338) {
								if (local27.method4918(Static212.aClass122_2) != null) {
									Static123.method2158();
									Static144.method2365(local103, local98, Static212.aClass122_2, local27);
									Static28.aBooleanArray1[local48] = true;
									Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
								}
								continue;
							}
							if (local27.anInt5755 == 1339) {
								if (local27.method4918(Static212.aClass122_2) != null) {
									Static128.method2210(local27, local98, local103);
									Static28.aBooleanArray1[local48] = true;
									Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
								}
								continue;
							}
							if (local27.anInt5755 == 1400) {
								Static284.method4888(Static212.aClass122_2, local98, local103, Static127.anInterface9_3, local27.anInt5721, local27.anInt5704);
								Static159.aBooleanArray13[local48] = true;
								Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
								continue;
							}
							if (local27.anInt5755 == 1401) {
								Static197.method3458(Static212.aClass122_2, local103, local27.anInt5721, local98, local27.anInt5704);
								Static159.aBooleanArray13[local48] = true;
								Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
								continue;
							}
							if (local27.anInt5755 == 1405) {
								if (!Static276.aBoolean345 && !Static109.aBoolean120) {
									continue;
								}
								local249 = local27.anInt5704 + local98;
								local254 = local103 + 15;
								if (Static276.aBoolean345) {
									Static83.aClass120_1.method5544(-256, "Fps:" + Static115.anInt2445, local249, local254);
									local254 += 15;
									@Pc(510) Runtime local510 = Runtime.getRuntime();
									local519 = (int) ((local510.totalMemory() - local510.freeMemory()) / 1024L);
									local521 = -256;
									if (local519 > 65536) {
										local521 = -65536;
									}
									Static83.aClass120_1.method5544(local521, "Mem:" + local519 + "k", local249, local254);
									local254 += 15;
									local550 = Static212.aClass122_2.method4707() / 1024;
									Static83.aClass120_1.method5544(local550 > 65536 ? -65536 : -256, "Offheap:" + local550 + "k", local249, local254);
									local254 += 15;
									local576 = 0;
									local578 = 0;
									local580 = 0;
									for (local582 = 0; local582 < 29; local582++) {
										local576 += Static72.aClass152_Sub1Array1[local582].method3977();
										local578 += Static72.aClass152_Sub1Array1[local582].method3976();
										local580 += Static72.aClass152_Sub1Array1[local582].method3967();
									}
									@Pc(618) int local618 = local580 * 100 / local576;
									local624 = local578 * 10000 / local576;
									@Pc(644) String local644 = "Cache:" + Static76.method1160((long) local624, 0, 2, true) + "% (" + local618 + "%)";
									Static232.aClass120_5.method5544(-256, local644, local249, local254);
									local254 += 12;
								}
								if (Static137.anInt2561 > 0) {
									Static232.aClass120_5.method5544(-256, "Particles: " + Static224.anInt4583 + " / " + Static137.anInt2561, local249, local254);
								}
								local254 += 12;
								if (Static109.aBoolean120) {
									Static232.aClass120_5.method5544(-256, "Polys: " + Static212.aClass122_2.method4703() + " Models: " + Static212.aClass122_2.method4708(), local249, local254);
									local254 += 12;
									Static232.aClass120_5.method5544(-256, "Ls: " + Static268.anInt5405 + " La: " + Static232.anInt4687 + " NPC: " + Static143.anInt6718 + " Pl: " + Static180.anInt3865, local249, local254);
									Static346.method5643();
									local254 += 12;
								}
								Static159.aBooleanArray13[local48] = true;
								continue;
							}
						}
						if (local27.anInt5715 == 0) {
							if (!local27.aBoolean381 && Static47.method818(local27) && Static118.aClass181_22 != local27) {
								continue;
							}
							if (!local27.aBoolean381) {
								if (local27.anInt5724 - local27.anInt5721 < local27.anInt5685) {
									local27.anInt5685 = local27.anInt5724 - local27.anInt5721;
								}
								if (local27.anInt5685 < 0) {
									local27.anInt5685 = 0;
								}
							}
							if (local27.anInt5755 == 1407 && Static212.aClass122_2.method4774()) {
								Static212.aClass122_2.method4798(local98, local103, local27.anInt5704, local27.anInt5721);
							}
							method1678(local241, local235, local103 - local27.anInt5685, arg3, local48, local27.anInt5761, local153, local155, local98 - local27.anInt5717);
							if (local27.aClass181Array2 != null) {
								method1678(local241, local235, local103 - local27.anInt5685, local27.aClass181Array2, local48, local27.anInt5761, local153, local155, local98 - local27.anInt5717);
							}
							@Pc(849) Class3_Sub32 local849 = (Class3_Sub32) Static188.aClass24_21.method609((long) local27.anInt5761);
							if (local849 != null) {
								Static23.method438(local849.anInt4348, local155, local48, local235, local103, local153, local98, local241);
							}
							if (local27.anInt5755 == 1407 && Static212.aClass122_2.method4774()) {
								Static212.aClass122_2.method4733();
								Static284.aBoolean377 = true;
							}
							Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
						}
						if (Static330.aBooleanArray30[local48] || Static350.anInt6810 > 1) {
							if (local27.anInt5715 == 0 && !local27.aBoolean381 && local27.anInt5721 < local27.anInt5724) {
								Static47.method828(local98 + local27.anInt5704, local103, local27.anInt5685, local27.anInt5721, local27.anInt5724);
							}
							if (local27.anInt5715 != 1) {
								@Pc(933) int local933;
								if (local27.anInt5715 == 2) {
									local249 = 0;
									for (local254 = 0; local254 < local27.anInt5773; local254++) {
										for (local933 = 0; local933 < local27.anInt5723; local933++) {
											local519 = (local27.anInt5697 + 32) * local933 + local98;
											local521 = local103 + (local27.anInt5775 + 32) * local254;
											if (local249 < 20) {
												local521 += local27.anIntArray467[local249];
												local519 += local27.anIntArray465[local249];
											}
											if (local27.anIntArray469[local249] > 0) {
												local578 = local27.anIntArray469[local249] - 1;
												if (arg6 < local519 + 32 && local519 < arg0 && local521 + 32 > arg7 && arg1 > local521 || local27 == Static262.aClass181_59 && local249 == Static164.anInt6261) {
													@Pc(1087) Class57 local1087;
													if (Static235.anInt4719 == 1 && Static67.anInt1361 == local249 && Static331.anInt6460 == local27.anInt5761) {
														local1087 = Static263.method4429(local27.anIntArray456[local249], 0, null, local27.anInt5746, Static212.aClass122_2, 2, local578);
													} else {
														local1087 = Static263.method4429(local27.anIntArray456[local249], -13623264, null, local27.anInt5746, Static212.aClass122_2, 1, local578);
													}
													if (local1087 == null) {
														Static316.method5250(local27);
													} else if (local27 == Static262.aClass181_59 && Static164.anInt6261 == local249) {
														local576 = Static221.anInt4562 - Static13.anInt354;
														local550 = Static192.anInt4000 - Static35.anInt2863;
														if (local550 < 5 && local550 > -5) {
															local550 = 0;
														}
														if (local576 < 5 && local576 > -5) {
															local576 = 0;
														}
														if (Static255.anInt6077 < 5) {
															local550 = 0;
															local576 = 0;
														}
														local1087.method5446(local519 + local550, local521 + local576, 0, -2013265920);
														if (arg5 != -1) {
															@Pc(1172) Class181 local1172 = arg3[arg5 & 0xFFFF];
															@Pc(1175) int[] local1175 = new int[4];
															Static212.aClass122_2.method4796(local1175);
															local624 = local1175[1];
															@Pc(1186) int local1186 = local1175[3];
															@Pc(1213) int local1213;
															if (local521 + local576 < local624 && local1172.anInt5685 > 0) {
																local1213 = (local624 - local521 - local576) * Static347.anInt6759 / 3;
																if (Static347.anInt6759 * 10 < local1213) {
																	local1213 = Static347.anInt6759 * 10;
																}
																if (local1172.anInt5685 < local1213) {
																	local1213 = local1172.anInt5685;
																}
																local1172.anInt5685 -= local1213;
																Static13.anInt354 += local1213;
																Static316.method5250(local1172);
															}
															if (local521 + local576 + 32 > local1186 && local1172.anInt5685 < local1172.anInt5724 - local1172.anInt5721) {
																local1213 = (local521 + local576 + 32 - local1186) * Static347.anInt6759 / 3;
																if (local1213 > Static347.anInt6759 * 10) {
																	local1213 = Static347.anInt6759 * 10;
																}
																if (local1172.anInt5724 - local1172.anInt5685 - local1172.anInt5721 < local1213) {
																	local1213 = local1172.anInt5724 - local1172.anInt5721 - local1172.anInt5685;
																}
																Static13.anInt354 -= local1213;
																local1172.anInt5685 += local1213;
																Static316.method5250(local1172);
															}
														}
													} else if (Static201.aClass181_37 == local27 && Static190.anInt3978 == local249) {
														local1087.method5446(local519, local521, 0, -2013265920);
													} else {
														local1087.method5448(local519, local521);
													}
												}
											} else if (local27.anIntArray453 != null && local249 < 20) {
												@Pc(993) Class57 local993 = local27.method4917(local249, Static212.aClass122_2);
												if (local993 != null) {
													local993.method5448(local519, local521);
												} else if (Static274.aBoolean401) {
													Static316.method5250(local27);
												}
											}
											local249++;
										}
									}
								} else if (local27.anInt5715 == 3) {
									if (Static203.method3545(local27)) {
										local249 = local27.anInt5743;
										if (Static118.aClass181_22 == local27 && local27.anInt5732 != 0) {
											local249 = local27.anInt5732;
										}
									} else {
										local249 = local27.anInt5679;
										if (local27 == Static118.aClass181_22 && local27.anInt5742 != 0) {
											local249 = local27.anInt5742;
										}
									}
									if (local106 == 0) {
										if (local27.aBoolean395) {
											Static212.aClass122_2.method4732(local98, local103, local27.anInt5704, local27.anInt5721, local249, 0);
										} else {
											Static212.aClass122_2.method4728(local98, local103, local27.anInt5704, local27.anInt5721, local249, 0);
										}
									} else if (local27.aBoolean395) {
										Static212.aClass122_2.method4732(local98, local103, local27.anInt5704, local27.anInt5721, local249 & 0xFFFFFF | 255 - (local106 & 0xFF) << 24, 1);
									} else {
										Static212.aClass122_2.method4728(local98, local103, local27.anInt5704, local27.anInt5721, local249 & 0xFFFFFF | 255 - (local106 & 0xFF) << 24, 1);
									}
								} else {
									@Pc(1500) Class120 local1500;
									if (local27.anInt5715 == 4) {
										local1500 = local27.method4920(Static212.aClass122_2);
										if (local1500 != null) {
											@Pc(1512) String local1512 = local27.aString207;
											if (Static203.method3545(local27)) {
												local254 = local27.anInt5743;
												if (Static118.aClass181_22 == local27 && local27.anInt5732 != 0) {
													local254 = local27.anInt5732;
												}
												if (local27.aString203.length() > 0) {
													local1512 = local27.aString203;
												}
											} else {
												local254 = local27.anInt5679;
												if (local27 == Static118.aClass181_22 && local27.anInt5742 != 0) {
													local254 = local27.anInt5742;
												}
											}
											if (local27.aBoolean381 && local27.anInt5684 != -1) {
												@Pc(1565) Class41 local1565 = Static230.method5537(local27.anInt5684);
												local1512 = local1565.aString36;
												if (local1512 == null) {
													local1512 = "null";
												}
												if ((local1565.anInt1175 == 1 || local27.anInt5707 != 1) && local27.anInt5707 != -1) {
													local1512 = "<col=ff9040>" + local1512 + "</col> x" + Static32.method622(local27.anInt5707);
												}
											}
											if (local27 == Static346.aClass181_57) {
												local254 = local27.anInt5679;
												local1512 = Static92.aString62;
											}
											if (!local27.aBoolean381) {
												local1512 = Static340.method5560(local1512, local27);
											}
											if (Static172.aBoolean195) {
												Static212.aClass122_2.method4704(local98, local103, local27.anInt5704 + local98, local103 + local27.anInt5721);
											}
											local1500.method5538(local98, local27.anInt5721, 0, local254 | 0xFF000000, local1512, null, local103, 0, local27.anInt5772, null, local27.anInt5718, Static153.aClass57Array10, local27.aBoolean385 ? -16777216 : -1, local27.anInt5704, local27.anInt5766);
											if (Static172.aBoolean195) {
												Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
											}
										} else if (Static274.aBoolean401) {
											Static316.method5250(local27);
										}
									} else if (local27.anInt5715 == 5) {
										@Pc(1719) Class57 local1719;
										if (!local27.aBoolean381) {
											local1719 = local27.method4925(Static212.aClass122_2, Static203.method3545(local27));
											if (local1719 != null) {
												local1719.method5448(local98, local103);
											} else if (Static274.aBoolean401) {
												Static316.method5250(local27);
											}
										} else if (local27.anInt5702 >= 0) {
											local27.method4931().method618(0, local27.anInt5721, local27.anInt5729 << 3, local98, Static212.aClass122_2, local103, local27.anInt5711 << 3, local27.anInt5704, 0);
										} else {
											if (local27.anInt5684 == -1) {
												local1719 = local27.method4925(Static212.aClass122_2, false);
											} else {
												@Pc(1729) Class174 local1729 = local27.aBoolean389 ? Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1 : null;
												local1719 = Static263.method4429(local27.anInt5707, local27.anInt5736 | 0xFF000000, local1729, local27.anInt5746, Static212.aClass122_2, local27.anInt5710, local27.anInt5684);
											}
											if (local1719 != null) {
												local254 = local1719.method5433();
												local933 = local1719.method5441();
												if (local27.aBoolean382) {
													Static212.aClass122_2.method4704(local98, local103, local27.anInt5704 + local98, local27.anInt5721 + local103);
													if (local27.anInt5703 != 0) {
														local519 = (local27.anInt5704 + local254 - 1) / local254;
														local521 = (local933 + local27.anInt5721 - 1) / local933;
														for (local550 = 0; local550 < local519; local550++) {
															for (local576 = 0; local576 < local521; local576++) {
																local1719.method5435((float) (local98 + local550 * local254) + (float) local254 / 2.0F, (float) (local933 * local576 + local103) + (float) local933 / 2.0F, 4096, local27.anInt5703);
															}
														}
													} else if (local106 == 0) {
														local1719.method5443(local98, local103, local27.anInt5704, local27.anInt5721, 0, 0);
													} else {
														local1719.method5443(local98, local103, local27.anInt5704, local27.anInt5721, 1, 255 - (local106 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
												} else if (local106 != 0) {
													local519 = 255 - (local106 & 0xFF) << 24 | 0xFFFFFF;
													if (local27.anInt5703 != 0) {
														local1719.method5437((float) local27.anInt5704 / 2.0F + (float) local98, (float) local27.anInt5721 / 2.0F + (float) local103, local27.anInt5704 * 4096 / local254, local27.anInt5703, local519);
													} else if (local254 == local27.anInt5704 && local933 == local27.anInt5721) {
														local1719.method5446(local98, local103, 1, local519);
													} else {
														local1719.method5449(local98, local103, local27.anInt5704, local27.anInt5721, 1, local519, 1);
													}
												} else if (local27.anInt5703 != 0) {
													local1719.method5435((float) local98 + (float) local27.anInt5704 / 2.0F, (float) local103 + (float) local27.anInt5721 / 2.0F, local27.anInt5704 * 4096 / local254, local27.anInt5703);
												} else if (local27.anInt5704 == local254 && local27.anInt5721 == local933) {
													local1719.method5448(local98, local103);
												} else {
													local1719.method5431(local98, local103, local27.anInt5704, local27.anInt5721);
												}
											} else if (Static274.aBoolean401) {
												Static316.method5250(local27);
											}
										}
									} else {
										@Pc(2295) Class41 local2295;
										if (local27.anInt5715 == 6) {
											@Pc(2063) boolean local2063 = Static203.method3545(local27);
											if (local2063) {
												local254 = local27.anInt5776;
											} else {
												local254 = local27.anInt5741;
											}
											Static298.method5056();
											@Pc(2077) Class124 local2077 = null;
											local519 = 0;
											@Pc(2264) Class174 local2264;
											@Pc(2254) Class131 local2254;
											if (local27.anInt5684 != -1) {
												local2295 = Static230.method5537(local27.anInt5684);
												if (local2295 != null) {
													local2295 = local2295.method932(local27.anInt5707);
													local2254 = local254 == -1 ? null : Static343.method5604(local254);
													local2264 = local27.aBoolean389 ? Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1 : null;
													local2077 = local2295.method938(Static212.aClass122_2, local27.anInt5744, local27.anInt5774, 1, local2264, local2254, local27.anInt5754, 1024);
													if (local2077 == null) {
														Static316.method5250(local27);
													} else {
														local519 = -local2077.method4106() / 2;
													}
												}
											} else if (local27.anInt5706 == 5) {
												if (local27.anInt5762 == -1) {
													local2077 = Static249.aClass174_3.method4556(0, -1, Static212.aClass122_2, 0, -1, -1, null, -1, 1024, null, null);
												} else {
													local521 = local27.anInt5762;
													@Pc(2118) Class5_Sub4_Sub4_Sub1 local2118;
													if (Static312.anInt6280 == local521) {
														local2118 = Static349.aClass5_Sub4_Sub4_Sub1_2;
													} else {
														local2118 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local521];
													}
													@Pc(2133) Class131 local2133 = local254 == -1 ? null : Static343.method5604(local254);
													if (local2118 != null && (local521 == 2047 || Static15.method386(local2118.aString126) == local27.anInt5765)) {
														local2077 = local2118.aClass174_1.method4556(0, 0, Static212.aClass122_2, local27.anInt5774, local27.anInt5754, local27.anInt5744, null, -1, 1024, local2133, null);
													}
												}
											} else if (local27.anInt5706 == 8 || local27.anInt5706 == 9) {
												@Pc(2244) Class3_Sub43 local2244 = Static7.method150(local27.anInt5762);
												local2254 = local254 == -1 ? null : Static343.method5604(local254);
												if (local2244 != null) {
													local2264 = local27.aBoolean389 ? Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1 : null;
													local2077 = local2244.method5613(local27.anInt5774, local2264, Static212.aClass122_2, local27.anInt5706 == 9, local27.anInt5744, local27.anInt5765, local27.anInt5754, local2254);
												}
											} else if (local254 == -1) {
												local2077 = local27.method4926(1024, local2063, 0, null, -1, -1, Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1, Static212.aClass122_2);
												if (local2077 == null && Static274.aBoolean401) {
													Static316.method5250(local27);
												}
											} else {
												@Pc(2190) Class131 local2190 = Static343.method5604(local254);
												local2077 = local27.method4926(1024, local2063, local27.anInt5774, local2190, local27.anInt5744, local27.anInt5754, Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1, Static212.aClass122_2);
												if (local2077 == null && Static274.aBoolean401) {
													Static316.method5250(local27);
												}
											}
											if (local2077 != null) {
												if (local27.anInt5719 > 0) {
													local521 = (local27.anInt5704 << 9) / local27.anInt5719;
												} else {
													local521 = 512;
												}
												if (local27.anInt5714 > 0) {
													local550 = (local27.anInt5721 << 9) / local27.anInt5714;
												} else {
													local550 = 512;
												}
												local576 = local27.anInt5704 / 2 + local98 + (local521 * local27.anInt5779 >> 9);
												local578 = local103 + local27.anInt5721 / 2 + (local27.anInt5692 * local550 >> 9);
												Static200.aClass56_3.method4695();
												Static212.aClass122_2.method4785(Static200.aClass56_3);
												local580 = Class19.anIntArray20[local27.anInt5745 << 3] * local27.anInt5700 >> 15;
												local582 = Class19.anIntArray21[local27.anInt5745 << 3] * local27.anInt5700 >> 15;
												Static212.aClass122_2.method4772(local576, local578, local521, local550);
												Static212.aClass122_2.method4744((float) local27.aShort84, local27.aBoolean378 ? (float) local27.aShort85 : (float) local27.aShort85 * 1.5F);
												if (Static284.aBoolean377) {
													Static212.aClass122_2.method4734();
													Static212.aClass122_2.method4777();
													Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
													Static284.aBoolean377 = false;
												}
												if (local27.aBoolean394) {
													Static212.aClass122_2.method4705(false);
												}
												if (local27.aBoolean381) {
													Static25.aClass56_1.method4698(-local27.anInt5753 << 3);
													Static25.aClass56_1.method4690(local27.anInt5712 << 3);
													Static25.aClass56_1.method4691(local27.anInt5731, local519 + local580 + local27.anInt5769, local27.anInt5769 + local582);
												} else {
													Static25.aClass56_1.method4688(local27.anInt5712 << 3);
													Static25.aClass56_1.method4691(0, local580, local582);
												}
												Static25.aClass56_1.method4694(local27.anInt5745 << 3);
												if (Static172.aBoolean195) {
													Static212.aClass122_2.method4704(local98, local103, local98 + local27.anInt5704, local27.anInt5721 + local103);
												}
												if (local27.aBoolean378) {
													local2077.method4098(Static25.aClass56_1, null, local27.anInt5700);
												} else {
													local2077.method4079(Static25.aClass56_1, null, 1);
												}
												if (Static172.aBoolean195) {
													Static212.aClass122_2.method4768(arg6, arg7, arg0, arg1);
												}
												if (local27.aBoolean394) {
													Static212.aClass122_2.method4705(true);
												}
											}
										} else {
											if (local27.anInt5715 == 7) {
												local1500 = local27.method4920(Static212.aClass122_2);
												if (local1500 == null) {
													if (Static274.aBoolean401) {
														Static316.method5250(local27);
													}
													continue;
												}
												local254 = 0;
												for (local933 = 0; local933 < local27.anInt5773; local933++) {
													for (local519 = 0; local519 < local27.anInt5723; local519++) {
														if (local27.anIntArray469[local254] > 0) {
															local2295 = Static230.method5537(local27.anIntArray469[local254] - 1);
															@Pc(2663) String local2663;
															if (local2295.anInt1175 != 1 && local27.anIntArray456[local254] == 1) {
																local2663 = "<col=ff9040>" + local2295.aString36 + "</col>";
															} else {
																local2663 = "<col=ff9040>" + local2295.aString36 + "</col> x" + Static32.method622(local27.anIntArray456[local254]);
															}
															local576 = (local27.anInt5697 + 115) * local519 + local98;
															local578 = local103 + local933 * (local27.anInt5775 + 12);
															if (local27.anInt5772 == 0) {
																local1500.method5524(local576, null, local27.aBoolean385 ? -16777216 : -1, local27.anInt5679 | 0xFF000000, Static153.aClass57Array10, local578, local2663);
															} else if (local27.anInt5772 == 1) {
																local1500.method5545(null, Static153.aClass57Array10, local27.aBoolean385 ? -16777216 : -1, local576 + 57, local27.anInt5679 | 0xFF000000, local578, local2663);
															} else {
																local1500.method5539(local2663, local578, local27.anInt5679 | 0xFF000000, Static153.aClass57Array10, local576 + 114, null, local27.aBoolean385 ? -16777216 : -1);
															}
														}
														local254++;
													}
												}
											}
											if (local27.anInt5715 == 8 && Static188.aClass181_32 == local27 && Static85.anInt1707 == Static283.anInt4484) {
												local249 = 0;
												local254 = 0;
												@Pc(2801) Class120 local2801 = Static83.aClass120_1;
												@Pc(2804) String local2804 = local27.aString207;
												local2804 = Static340.method5560(local2804, local27);
												@Pc(2824) String local2824;
												while (local2804.length() > 0) {
													local550 = local2804.indexOf("<br>");
													if (local550 == -1) {
														local2824 = local2804;
														local2804 = "";
													} else {
														local2824 = local2804.substring(0, local550);
														local2804 = local2804.substring(local550 + 4);
													}
													local576 = Static303.aClass209_9.method5510(local2824);
													local254 += Static303.aClass209_9.anInt6519 + 1;
													if (local249 < local576) {
														local249 = local576;
													}
												}
												local249 += 6;
												local254 += 7;
												local550 = local27.anInt5704 + local98 - local249 - 5;
												if (local98 + 5 > local550) {
													local550 = local98 + 5;
												}
												local576 = local103 + local27.anInt5721 + 5;
												if (local249 + local550 > arg0) {
													local550 = arg0 - local249;
												}
												if (arg1 < local576 + local254) {
													local576 = arg1 - local254;
												}
												Static212.aClass122_2.method4732(local550, local576, local249, local254, -96, 0);
												Static212.aClass122_2.method4728(local550, local576, local249, local254, -16777216, 0);
												local2804 = local27.aString207;
												local578 = local576 + Static303.aClass209_9.anInt6519 + 2;
												local2804 = Static340.method5560(local2804, local27);
												while (local2804.length() > 0) {
													local580 = local2804.indexOf("<br>");
													if (local580 == -1) {
														local2824 = local2804;
														local2804 = "";
													} else {
														local2824 = local2804.substring(0, local580);
														local2804 = local2804.substring(local580 + 4);
													}
													local2801.method5528(local2824, -1, local578, -16777216, local550 + 3);
													local578 += Static303.aClass209_9.anInt6519 + 1;
												}
											}
											if (local27.anInt5715 == 9) {
												if (local27.aBoolean383) {
													local933 = local98 + local27.anInt5704;
													local254 = local27.anInt5721 + local103;
													local519 = local103;
												} else {
													local519 = local27.anInt5721 + local103;
													local254 = local103;
													local933 = local27.anInt5704 + local98;
												}
												if (local27.anInt5681 == 1) {
													Static212.aClass122_2.method4723(local98, local254, local933, local519, local27.anInt5679, 0);
												} else {
													Static212.aClass122_2.method4765(local98, local254, local933, local519, local27.anInt5679, local27.anInt5681);
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

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII)V")
	public static void method1679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg2, 11);
		local8.method2509();
		local8.anInt3053 = arg0;
		local8.anInt3054 = arg1;
	}
}
