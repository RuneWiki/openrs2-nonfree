import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "[J")
	public static long[] aLongArray2;

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
	public static int anInt2291;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIZ)I")
	public static int method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= arg0) {
			return arg1 >= arg2 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIII[Lclient!is;III)V")
	public static void method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class155[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(24) Class155 local24 = arg5[local13];
			if (local24 != null && (arg8 == local24.anInt4769 || arg8 == -1412584499 && Static292.aClass155_7 == local24)) {
				@Pc(50) int local50;
				if (arg0 == -1) {
					Class5.aRectangleArray5[Static365.anInt7047].setBounds(arg6 + local24.anInt4795, arg1 + local24.anInt4799, local24.anInt4806, local24.anInt4831);
					local50 = Static365.anInt7047++;
				} else {
					local50 = arg0;
				}
				local24.anInt4792 = Static306.anInt6122;
				local24.anInt4829 = local50;
				if (!Static70.method1547(local24)) {
					if (local24.anInt4825 != 0) {
						Static323.method5018(local24);
					}
					@Pc(95) int local95 = local24.anInt4795 + arg6;
					@Pc(101) int local101 = local24.anInt4799 + arg1;
					@Pc(104) int local104 = local24.anInt4772;
					if (Static80.aBoolean170 && (Static70.method1542(local24).anInt8126 != 0 || local24.anInt4796 == 0) && local104 > 127) {
						local104 = 127;
					}
					@Pc(160) int local160;
					@Pc(166) int local166;
					if (local24 == Static292.aClass155_7) {
						if (arg8 != -1412584499 && (Static294.anInt5992 == local24.anInt4753 || local24.anInt4753 == Static204.anInt8818)) {
							Static529.anInt9711 = arg6;
							Static245.anInt5069 = arg1;
							Static215.aClass155Array1 = arg5;
							continue;
						}
						if (Static383.aBoolean553 && Static325.aBoolean436) {
							local160 = Static294.aClass83_1.method6895();
							local166 = Static294.aClass83_1.method6896();
							local166 -= Static487.anInt9232;
							local160 -= Static221.anInt1106;
							if (local160 < Static505.anInt9451) {
								local160 = Static505.anInt9451;
							}
							if (local24.anInt4806 + local160 > Static95.aClass155_1.anInt4806 + Static505.anInt9451) {
								local160 = Static95.aClass155_1.anInt4806 + Static505.anInt9451 - local24.anInt4806;
							}
							if (Static344.anInt6632 > local166) {
								local166 = Static344.anInt6632;
							}
							if (Static95.aClass155_1.anInt4831 + Static344.anInt6632 < local166 + local24.anInt4831) {
								local166 = Static344.anInt6632 + Static95.aClass155_1.anInt4831 - local24.anInt4831;
							}
							local95 = local160;
							local101 = local166;
						}
						if (Static204.anInt8818 == local24.anInt4753) {
							local104 = 128;
						}
					}
					@Pc(255) int local255;
					@Pc(253) int local253;
					@Pc(263) int local263;
					@Pc(268) int local268;
					if (local24.anInt4796 == 2) {
						local166 = arg3;
						local160 = arg2;
						local253 = arg4;
						local255 = arg7;
					} else {
						local263 = local95 + local24.anInt4806;
						local268 = local101 + local24.anInt4831;
						local160 = arg2 >= local95 ? arg2 : local95;
						local166 = local101 <= arg3 ? arg3 : local101;
						if (local24.anInt4796 == 9) {
							local263++;
							local268++;
						}
						local253 = arg4 <= local268 ? arg4 : local268;
						local255 = local263 < arg7 ? local263 : arg7;
					}
					if (local255 > local160 && local166 < local253) {
						@Pc(547) int local547;
						@Pc(560) int local560;
						@Pc(654) int local654;
						@Pc(511) int local511;
						@Pc(545) int local545;
						if (local24.anInt4825 != 0) {
							if (local24.anInt4825 == Static175.anInt3712 || local24.anInt4825 == Static396.anInt7773) {
								Static413.method6234(local24.anInt4825 == Static396.anInt7773, local101, local24.anInt4806, local24.anInt4831, local95);
								Static155.aBooleanArray6[local50] = true;
								Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
								continue;
							}
							if (local24.anInt4825 == Static169.anInt3517) {
								if (local24.method3701(Static39.aClass7_2) != null) {
									Static487.method7088();
									Static57.method1328(local24, local95, Static39.aClass7_2, local101);
									Static322.aBooleanArray15[local50] = true;
									Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
								}
								continue;
							}
							if (local24.anInt4825 == Static30.anInt1126) {
								if (local24.method3701(Static39.aClass7_2) != null) {
									Static114.method2104(local95, local24, local101);
									Static322.aBooleanArray15[local50] = true;
									Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
								}
								continue;
							}
							if (local24.anInt4825 == Static307.anInt6125) {
								Static563.method7954(local101, Static39.aClass7_2, local24.anInt4831, local95, local24.anInt4806, Static361.anInterface7_8);
								Static155.aBooleanArray6[local50] = true;
								Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
								continue;
							}
							if (local24.anInt4825 == Static4.anInt1832) {
								Static407.method6145(local95, local101, Static39.aClass7_2, local24.anInt4831, local24.anInt4806);
								Static155.aBooleanArray6[local50] = true;
								Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
								continue;
							}
							if (local24.anInt4825 == Static205.anInt4325) {
								if (!Static370.aBoolean508 && !Static546.aBoolean690) {
									continue;
								}
								local263 = local24.anInt4806 + local95;
								local268 = local101 + 15;
								if (Static370.aBoolean508) {
									local511 = -256;
									if (Static90.anInt2299 < 20) {
										local511 = -65536;
									}
									Static127.aClass45_1.method4853(local511, local268, local263, -1, "Fps:" + Static90.anInt2299);
									local268 += 15;
									@Pc(535) Runtime local535 = Runtime.getRuntime();
									local545 = (int) ((local535.totalMemory() - local535.freeMemory()) / 1024L);
									local547 = -256;
									if (local545 > 98304) {
										local547 = -65536;
										if (Static29.aBoolean102) {
											Static85.method1795();
											for (local560 = 0; local560 < 10; local560++) {
												System.gc();
											}
											local545 = (int) ((local535.totalMemory() - local535.freeMemory()) / 1024L);
											if (local545 > 65536) {
												Static412.method6231("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static127.aClass45_1.method4853(local547, local268, local263, -1, "Mem:" + local545 + "k");
									local268 += 15;
									Static127.aClass45_1.method4853(-256, local268, local263, -1, "In:" + Static139.anInt3066 + "B/s Out:" + Static447.anInt10079 + "B/s");
									local268 += 15;
									local560 = Static39.aClass7_2.b() / 1024;
									Static127.aClass45_1.method4853(local560 > 65536 ? -65536 : -256, local268, local263, -1, "Offheap:" + local560 + "k");
									local268 += 15;
									local654 = 0;
									@Pc(656) int local656 = 0;
									@Pc(658) int local658 = 0;
									for (@Pc(660) int local660 = 0; local660 < 35; local660++) {
										if (Static519.aClass240_Sub1Array2[local660] != null) {
											local654 += Static519.aClass240_Sub1Array2[local660].method5491();
											local656 += Static519.aClass240_Sub1Array2[local660].method5495();
											local658 += Static519.aClass240_Sub1Array2[local660].method5499();
										}
									}
									@Pc(700) int local700 = local658 * 100 / local654;
									@Pc(706) int local706 = local656 * 10000 / local654;
									@Pc(728) String local728 = "Cache:" + Static271.method4404(2, 0, true, (long) local706) + "% (" + local700 + "%)";
									Static464.aClass45_9.method4853(-256, local268, local263, -1, local728);
									local268 += 12;
								}
								if (Static430.anInt8212 > 0) {
									Static464.aClass45_9.method4853(-256, local268, local263, -1, "Particles: " + Static158.anInt3338 + " / " + Static430.anInt8212);
								}
								local268 += 12;
								if (Static546.aBoolean690) {
									Static464.aClass45_9.method4853(-256, local268, local263, -1, "Polys: " + Static39.aClass7_2.DA() + " Models: " + Static39.aClass7_2.T());
									local268 += 12;
									Static464.aClass45_9.method4853(-256, local268, local263, -1, "Ls: " + Static38.anInt1241 + " La: " + Static32.anInt1167 + " NPC: " + Static199.anInt4129 + " Pl: " + Static324.anInt6377);
									local268 += 12;
									Static197.method3235();
								}
								Static155.aBooleanArray6[local50] = true;
								continue;
							}
						}
						if (local24.anInt4796 == 0) {
							if (local24.anInt4825 == Static184.anInt3858 && Static39.aClass7_2.method7850()) {
								Static39.aClass7_2.method7785(local95, local101, local24.anInt4806, local24.anInt4831);
							}
							method1818(local50, local101 - local24.anInt4762, local160, local166, local253, arg5, local95 - local24.anInt4758, local255, local24.anInt4793);
							if (local24.aClass155Array2 != null) {
								method1818(local50, local101 - local24.anInt4762, local160, local166, local253, local24.aClass155Array2, local95 - local24.anInt4758, local255, local24.anInt4793);
							}
							@Pc(894) Class4_Sub45 local894 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local24.anInt4793);
							if (local894 != null) {
								Static505.method7286(local253, local95, local50, local166, local894.anInt9096, local160, local255, local101);
							}
							if (local24.anInt4825 == Static184.anInt3858 && Static39.aClass7_2.method7850()) {
								Static39.aClass7_2.method7780();
							}
							Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
						}
						if (Static222.aBooleanArray13[local50] || Static266.anInt5358 > 1) {
							if (local24.anInt4796 == 3) {
								if (local104 == 0) {
									if (local24.aBoolean325) {
										Static39.aClass7_2.J(local95, local101, local24.anInt4806, local24.anInt4831, local24.anInt4794, 0);
									} else {
										Static39.aClass7_2.method7824(local95, local101, local24.anInt4806, local24.anInt4831, local24.anInt4794, 0);
									}
								} else if (local24.aBoolean325) {
									Static39.aClass7_2.J(local95, local101, local24.anInt4806, local24.anInt4831, local24.anInt4794 & 0xFFFFFF | 255 - (local104 & 0xFF) << 24, 1);
								} else {
									Static39.aClass7_2.method7824(local95, local101, local24.anInt4806, local24.anInt4831, local24.anInt4794 & 0xFFFFFF | 255 - (local104 & 0xFF) << 24, 1);
								}
							} else if (local24.anInt4796 == 4) {
								@Pc(1028) Class45 local1028 = local24.method3698(Static39.aClass7_2);
								if (local1028 != null) {
									local268 = local24.anInt4794;
									@Pc(1045) String local1045 = local24.aString99;
									if (local24.anInt4785 != -1) {
										@Pc(1056) Class236 local1056 = Static338.aClass29_1.method977(local24.anInt4785);
										local1045 = local1056.aString139;
										if (local1045 == null) {
											local1045 = "null";
										}
										if ((local1056.anInt6824 == 1 || local24.anInt4742 != 1) && local24.anInt4742 != -1) {
											local1045 = "<col=ff9040>" + local1045 + "</col> x" + Static469.method6819(local24.anInt4742);
										}
									}
									if (local24 == Static238.aClass155_6) {
										local1045 = Static223.aClass152_35.method3624(Static142.anInt3088);
										local268 = local24.anInt4794;
									}
									if (Static393.aBoolean559) {
										Static39.aClass7_2.V(local95, local101, local95 + local24.anInt4806, local24.anInt4831 + local101);
									}
									local1028.method4837(null, local101, local24.anInt4831, local24.anInt4828, 255 - (local104 & 0xFF) << 24 | local268, local24.anInt4818, null, local24.anInt4782, 0, local24.aBoolean338 ? 255 - (local104 & 0xFF) << 24 : -1, local24.anInt4777, local1045, local24.anInt4806, local95, 0, Static571.aClass88Array15);
									if (Static393.aBoolean559) {
										Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
									}
								} else if (Static46.aBoolean115) {
									Static368.method5060(local24);
								}
							} else {
								@Pc(1252) int local1252;
								if (local24.anInt4796 == 5) {
									if (local24.anInt4788 < 0) {
										@Pc(1215) Class88 local1215;
										if (local24.anInt4785 == -1) {
											local1215 = local24.method3691(Static39.aClass7_2);
										} else {
											@Pc(1197) Class206 local1197 = local24.aBoolean335 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1 : null;
											local1215 = Static338.aClass29_1.method981(local24.anInt4745, local24.anInt4742, local24.anInt4823 | 0xFF000000, local1197, Static39.aClass7_2, local24.anInt4749, local24.anInt4785);
										}
										if (local1215 != null) {
											local268 = local1215.A();
											local511 = local1215.ca();
											local1252 = (local24.anInt4794 == 0 ? 16777215 : local24.anInt4794 & 0xFFFFFF) | 255 - (local104 & 0xFF) << 24;
											if (local24.aBoolean336) {
												Static39.aClass7_2.V(local95, local101, local95 + local24.anInt4806, local24.anInt4831 + local101);
												if (local24.anInt4826 != 0) {
													local545 = (local268 + local24.anInt4806 - 1) / local268;
													local547 = (local24.anInt4831 + local511 - 1) / local511;
													for (local560 = 0; local560 < local545; local560++) {
														for (local654 = 0; local654 < local547; local654++) {
															if (local24.anInt4794 == 0) {
																local1215.method8050((float) local268 / 2.0F + (float) (local268 * local560 + local95), (float) (local101 + local654 * local511) + (float) local511 / 2.0F, 4096, local24.anInt4826);
															} else {
																local1215.method8044((float) local268 / 2.0F + (float) (local560 * local268 + local95), (float) (local654 * local511 + local101) + (float) local511 / 2.0F, 4096, local24.anInt4826, local1252);
															}
														}
													}
												} else if (local24.anInt4794 == 0 && local104 == 0) {
													local1215.method8043(local95, local101, local24.anInt4806, local24.anInt4831);
												} else {
													local1215.DA(local95, local101, local24.anInt4806, local24.anInt4831, 0, local1252, 1);
												}
												Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
											} else if (local24.anInt4794 == 0 && local104 == 0) {
												if (local24.anInt4826 != 0) {
													local1215.method8050((float) local95 + (float) local24.anInt4806 / 2.0F, (float) local24.anInt4831 / 2.0F + (float) local101, local24.anInt4806 * 4096 / local268, local24.anInt4826);
												} else if (local268 == local24.anInt4806 && local24.anInt4831 == local511) {
													local1215.method8051(local95, local101);
												} else {
													local1215.method8046(local95, local101, local24.anInt4806, local24.anInt4831);
												}
											} else if (local24.anInt4826 != 0) {
												local1215.method8044((float) local24.anInt4806 / 2.0F + (float) local95, (float) local101 + (float) local24.anInt4831 / 2.0F, local24.anInt4806 * 4096 / local268, local24.anInt4826, local1252);
											} else if (local24.anInt4806 == local268 && local511 == local24.anInt4831) {
												local1215.V(local95, local101, 0, local1252, 1);
											} else {
												local1215.method8049(local95, local101, local24.anInt4806, local24.anInt4831, 0, local1252, 1);
											}
										} else if (Static46.aBoolean115) {
											Static368.method5060(local24);
										}
									} else {
										local24.method3696(Static240.aClass175_1, Static145.aClass56_1).method6106(local24.anInt4817 << 3, local24.anInt4830 << 3, local24.anInt4806, Static39.aClass7_2, local24.anInt4831, 0, local101, local95, 0);
									}
								} else if (local24.anInt4796 == 6) {
									Static241.method3901();
									@Pc(1585) Class65 local1585 = null;
									local268 = 0;
									@Pc(1617) Class111 local1617;
									@Pc(1625) Class206 local1625;
									if (local24.anInt4785 != -1) {
										@Pc(1597) Class236 local1597 = Static338.aClass29_1.method977(local24.anInt4785);
										if (local1597 != null) {
											local1597 = local1597.method5328(local24.anInt4742);
											local1617 = local24.anInt4805 == -1 ? null : Static17.aClass254_1.method5936(local24.anInt4805);
											local1625 = local24.aBoolean335 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1 : null;
											local1585 = local1597.method5327(local1625, local1617, local24.anInt4747, local24.anInt4775, 2048, 1, Static39.aClass7_2, local24.anInt4773);
											if (local1585 == null) {
												Static368.method5060(local24);
											} else {
												local268 = -local1585.J() >> 1;
											}
										}
									} else if (local24.anInt4764 == 5) {
										local511 = local24.anInt4802;
										if (local511 >= 0 && local511 < 2048) {
											@Pc(1811) Class21_Sub1_Sub1_Sub1_Sub2 local1811 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local511];
											@Pc(1824) Class111 local1824 = local24.anInt4805 == -1 ? null : Static17.aClass254_1.method5936(local24.anInt4805);
											if (local1811 != null && (Static1.anInt5011 == local511 || Static208.method3404(local1811.aString87) == local24.anInt4814)) {
												local1585 = local1811.aClass206_1.method4886(0, Static338.aClass29_1, null, local24.anInt4775, Static203.aClass230_1, null, Static523.aClass173_1, local24.anInt4773, local1824, 2048, Static39.aClass7_2, Class21_Sub1_Sub2_Sub1.lb, local24.anInt4747, 0, -1, Static17.aClass254_1, 0, Static516.aClass127_2, null);
											}
										}
									} else if (local24.anInt4764 == 8 || local24.anInt4764 == 9) {
										@Pc(1751) Class4_Sub30 local1751 = Static289.method4604(local24.anInt4802, false);
										local1617 = local24.anInt4805 == -1 ? null : Static17.aClass254_1.method5936(local24.anInt4805);
										if (local1751 != null) {
											local1625 = local24.aBoolean335 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1 : null;
											local1585 = local1751.method4760(local1625, local1617, Static39.aClass7_2, local24.anInt4764 == 9, local24.anInt4775, local24.anInt4773, local24.anInt4814, local24.anInt4747);
										}
									} else if (local24.anInt4805 == -1) {
										local1585 = local24.method3695(Static523.aClass173_1, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1, Static516.aClass127_2, Static338.aClass29_1, null, Static17.aClass254_1, Static203.aClass230_1, 0, -1, Class21_Sub1_Sub2_Sub1.lb, Static39.aClass7_2, -1, 2048);
										if (local1585 == null && Static46.aBoolean115) {
											Static368.method5060(local24);
										}
									} else {
										@Pc(1712) Class111 local1712 = Static17.aClass254_1.method5936(local24.anInt4805);
										local1585 = local24.method3695(Static523.aClass173_1, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1, Static516.aClass127_2, Static338.aClass29_1, local1712, Static17.aClass254_1, Static203.aClass230_1, local24.anInt4773, local24.anInt4747, Class21_Sub1_Sub2_Sub1.lb, Static39.aClass7_2, local24.anInt4775, 2048);
										if (local1585 == null && Static46.aBoolean115) {
											Static368.method5060(local24);
										}
									}
									if (local1585 != null) {
										if (local24.anInt4827 <= 0) {
											local511 = 512;
										} else {
											local511 = (local24.anInt4806 << 9) / local24.anInt4827;
										}
										if (local24.anInt4807 <= 0) {
											local1252 = 512;
										} else {
											local1252 = (local24.anInt4831 << 9) / local24.anInt4807;
										}
										local545 = local24.anInt4806 / 2 + local95;
										local547 = local101 + local24.anInt4831 / 2;
										if (!local24.aBoolean334) {
											local545 += local24.anInt4812 * local511 >> 9;
											local547 += local24.anInt4744 * local1252 >> 9;
										}
										Static566.aClass81_6.Y();
										Static39.aClass7_2.method7794(Static566.aClass81_6);
										Static39.aClass7_2.la(local545, local547, local511, local1252);
										Static39.aClass7_2.ya();
										if (local24.aBoolean332) {
											Static39.aClass7_2.ZA(false);
										}
										if (local24.aBoolean334) {
											Static313.aClass81_5.oa(local24.anInt4789);
											Static313.aClass81_5.ZA(local24.anInt4809);
											Static313.aClass81_5.AA(local24.anInt4813);
											Static313.aClass81_5.U(local24.anInt4812, local24.anInt4744, local24.anInt4781);
										} else {
											local560 = (local24.anInt4797 << 2) * Class262.anIntArray420[local24.anInt4789 << 3] >> 14;
											local654 = Class262.anIntArray421[local24.anInt4789 << 3] * (local24.anInt4797 << 2) >> 14;
											Static313.aClass81_5.J(-local24.anInt4813 << 3);
											Static313.aClass81_5.ZA(local24.anInt4809 << 3);
											Static313.aClass81_5.U(local24.anInt4776 << 2, (local24.anInt4810 << 2) + (local560 + local268), local654 - -(local24.anInt4810 << 2));
											Static313.aClass81_5.w(local24.anInt4789 << 3);
										}
										local24.method3705(Static39.aClass7_2, Static306.anInt6122, local1585, Static313.aClass81_5);
										if (Static393.aBoolean559) {
											Static39.aClass7_2.V(local95, local101, local24.anInt4806 + local95, local24.anInt4831 + local101);
										}
										if (local24.aBoolean334) {
											if (local24.aBoolean324) {
												local1585.method7686(Static313.aClass81_5, null, local24.anInt4797, 1);
											} else {
												local1585.method7679(Static313.aClass81_5, null, 1);
												if (local24.aClass21_Sub5_6 != null) {
													Static39.aClass7_2.method7777(local24.aClass21_Sub5_6.method3041());
												}
											}
										} else if (local24.aBoolean324) {
											local1585.method7686(Static313.aClass81_5, null, local24.anInt4797 << 2, 1);
										} else {
											local1585.method7679(Static313.aClass81_5, null, 1);
											if (local24.aClass21_Sub5_6 != null) {
												Static39.aClass7_2.method7777(local24.aClass21_Sub5_6.method3041());
											}
										}
										if (Static393.aBoolean559) {
											Static39.aClass7_2.da(arg2, arg3, arg7, arg4);
										}
										if (local24.aBoolean332) {
											Static39.aClass7_2.ZA(true);
										}
									}
								} else if (local24.anInt4796 == 9) {
									if (local24.aBoolean328) {
										local511 = local24.anInt4806 + local95;
										local268 = local24.anInt4831 + local101;
										local1252 = local101;
									} else {
										local268 = local101;
										local1252 = local24.anInt4831 + local101;
										local511 = local24.anInt4806 + local95;
									}
									if (local24.anInt4750 == 1) {
										Static39.aClass7_2.method7817(local95, local268, local511, local1252, local24.anInt4794, 0);
									} else {
										Static39.aClass7_2.method7783(local95, local268, local511, local1252, local24.anInt4794, local24.anInt4750);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ek;I)Lclient!ai;")
	public static Class4_Sub2 method1819(@OriginalArg(0) Class4_Sub13 arg0) {
		arg0.method7004();
		@Pc(18) int local18 = arg0.method7004();
		@Pc(22) Class4_Sub2 local22 = Static542.method7595(local18);
		local22.anInt10522 = arg0.method7004();
		@Pc(31) int local31 = arg0.method7004();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method7004();
			local22.method8206(arg0, local39);
		}
		local22.method8210();
		return local22;
	}
}
