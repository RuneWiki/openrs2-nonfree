import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
	public static int anInt1894;

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "Lclient!la;")
	public static Class54 aClass54_6;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_2 = new Class68();

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_3 = new Class68();

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_4 = new Class68();

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_23 = new Class303(15, 8);

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_49 = new Class56(74, 2);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	public static byte[] method1710(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static169.method3032(arg0.charAt(local20 - 2)) == -1) {
			local31 -= 2;
		} else if (local20 - 1 >= local6 || Static169.method3032(arg0.charAt(local20 - 1)) == -1) {
			local31--;
		}
		@Pc(66) byte[] local66 = new byte[local31];
		Static189.method3216(arg0, local66, 0);
		return local66;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	public static void method1711() {
		Static472.method6508();
		Static585.method7831(Static405.aClass3_Sub3_Sub1_1.aBoolean586);
		Static9.aClass8_3 = Static298.method4426(Static387.aCanvas9, Static237.aClass258_3, 0, 22050);
		Static9.aClass8_3.method5515(Static292.aClass3_Sub4_Sub3_1);
		Static241.aClass8_2 = Static298.method4426(Static387.aCanvas9, Static237.aClass258_3, 1, 2048);
		Static241.aClass8_2.method5515(Static353.aClass3_Sub4_Sub2_1);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII[Lclient!wp;IIIII)V")
	public static void method1712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class361[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(24) Class361 local24 = arg3[local18];
			if (local24 != null && (arg6 == local24.anInt9663 || arg6 == -1412584499 && local24 == Static283.aClass361_8)) {
				@Pc(49) int local49;
				if (arg4 == -1) {
					Class72_Sub6.aRectangleArray1[Static488.anInt7959].setBounds(arg7 + local24.anInt9606, arg8 + local24.anInt9659, local24.anInt9668, local24.anInt9650);
					local49 = Static488.anInt7959++;
				} else {
					local49 = arg4;
				}
				local24.anInt9578 = local49;
				local24.anInt9646 = Static506.anInt8251;
				if (!Static71.method1519(local24)) {
					if (local24.anInt9591 != 0) {
						Static214.method3433(local24);
					}
					@Pc(94) int local94 = local24.anInt9606 + arg7;
					@Pc(99) int local99 = local24.anInt9659 + arg8;
					@Pc(102) int local102 = local24.anInt9626;
					if (Static425.aBoolean541 && (Static71.method1520(local24).anInt6063 != 0 || local24.anInt9665 == 0) && local102 > 127) {
						local102 = 127;
					}
					@Pc(164) int local164;
					@Pc(168) int local168;
					if (Static283.aClass361_8 == local24) {
						if (arg6 != -1412584499 && (local24.anInt9612 == Static346.anInt6069 || local24.anInt9612 == Static542.anInt8662)) {
							Static155.anInt3253 = arg7;
							Static317.anInt5410 = arg8;
							Static54.aClass361Array1 = arg3;
							continue;
						}
						if (Static202.aBoolean282 && Static82.aBoolean667) {
							local164 = Static465.aClass86_1.method7267();
							local168 = Static465.aClass86_1.method7265();
							local168 -= Static380.anInt6521;
							local164 -= Static495.anInt8057;
							if (Static328.anInt5531 > local164) {
								local164 = Static328.anInt5531;
							}
							if (Static504.aClass361_14.anInt9668 + Static328.anInt5531 < local164 + local24.anInt9668) {
								local164 = Static328.anInt5531 + Static504.aClass361_14.anInt9668 - local24.anInt9668;
							}
							if (Static436.anInt7281 > local168) {
								local168 = Static436.anInt7281;
							}
							if (local168 + local24.anInt9650 > Static436.anInt7281 - -Static504.aClass361_14.anInt9650) {
								local168 = Static436.anInt7281 + Static504.aClass361_14.anInt9650 - local24.anInt9650;
							}
							local94 = local164;
							local99 = local168;
						}
						if (Static542.anInt8662 == local24.anInt9612) {
							local102 = 128;
						}
					}
					@Pc(296) int local296;
					@Pc(285) int local285;
					@Pc(248) int local248;
					@Pc(254) int local254;
					if (local24.anInt9665 == 2) {
						local296 = arg2;
						local285 = arg0;
						local168 = arg1;
						local164 = arg5;
					} else {
						local248 = local24.anInt9668 + local94;
						local254 = local99 + local24.anInt9650;
						local164 = arg5 >= local94 ? arg5 : local94;
						local168 = arg1 < local99 ? local99 : arg1;
						if (local24.anInt9665 == 9) {
							local254++;
							local248++;
						}
						local285 = local254 >= arg0 ? arg0 : local254;
						local296 = arg2 <= local248 ? arg2 : local248;
					}
					if (local164 < local296 && local285 > local168) {
						@Pc(505) int local505;
						@Pc(538) int local538;
						@Pc(549) int local549;
						@Pc(647) int local647;
						@Pc(536) int local536;
						if (local24.anInt9591 != 0) {
							if (local24.anInt9591 == Static36.anInt656 || Static317.anInt5414 == local24.anInt9591) {
								Static280.method4133(local24.anInt9668, local99, local94, local24.anInt9650, local24.anInt9591 == Static317.anInt5414);
								Static319.aBooleanArray17[local49] = true;
								Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
								continue;
							}
							if (local24.anInt9591 == Static581.anInt8142) {
								if (local24.method7897(Static505.aClass45_11) != null) {
									Static236.method3658();
									Static519.method6962(local99, local24, local94, Static505.aClass45_11);
									Static93.aBooleanArray4[local49] = true;
									Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
								}
								continue;
							}
							if (local24.anInt9591 == Static503.anInt8176) {
								if (local24.method7897(Static505.aClass45_11) != null) {
									Static443.method6034(local99, local24, local94);
									Static93.aBooleanArray4[local49] = true;
									Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
								}
								continue;
							}
							if (Static7.anInt3429 == local24.anInt9591) {
								Static368.method5395(Static505.aClass45_11, local24.anInt9650, local24.anInt9668, local94, Static173.anInterface3_6, local99);
								Static319.aBooleanArray17[local49] = true;
								Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
								continue;
							}
							if (local24.anInt9591 == Static278.anInt4854) {
								Static140.method2712(Static505.aClass45_11, local24.anInt9668, local24.anInt9650, local99, local94);
								Static319.aBooleanArray17[local49] = true;
								Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
								continue;
							}
							if (Static409.anInt7026 == local24.anInt9591) {
								if (!Static25.aBoolean45 && !Static292.aBoolean364) {
									continue;
								}
								local248 = local24.anInt9668 + local94;
								local254 = local99 + 15;
								if (Static25.aBoolean45) {
									local505 = -256;
									if (Static286.anInt4910 < 20) {
										local505 = -65536;
									}
									Static569.aClass54_9.method7789(local505, local248, "Fps:" + Static286.anInt4910, -1, local254);
									local254 += 15;
									@Pc(527) Runtime local527 = Runtime.getRuntime();
									local536 = (int) ((local527.totalMemory() - local527.freeMemory()) / 1024L);
									local538 = -256;
									if (local536 > 98304) {
										if (Static413.aBoolean529) {
											Static593.method7933();
											for (local549 = 0; local549 < 10; local549++) {
												System.gc();
											}
											local536 = (int) ((local527.totalMemory() - local527.freeMemory()) / 1024L);
											if (local536 > 65536) {
												Static550.method7295("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local538 = -65536;
									}
									Static569.aClass54_9.method7789(local538, local248, "Mem:" + local536 + "k", -1, local254);
									local254 += 15;
									Static569.aClass54_9.method7789(-256, local248, "In:" + Static559.anInt9106 + "B/s Out:" + Static130.anInt7192 + "B/s", -1, local254);
									local254 += 15;
									local549 = Static505.aClass45_11.b() / 1024;
									Static569.aClass54_9.method7789(local549 <= 65536 ? -256 : -65536, local248, "Offheap:" + local549 + "k", -1, local254);
									local254 += 15;
									local647 = 0;
									@Pc(649) int local649 = 0;
									@Pc(651) int local651 = 0;
									for (@Pc(653) int local653 = 0; local653 < 35; local653++) {
										if (Static184.aClass30_Sub1Array1[local653] != null) {
											local647 += Static184.aClass30_Sub1Array1[local653].method580();
											local649 += Static184.aClass30_Sub1Array1[local653].method585();
											local651 += Static184.aClass30_Sub1Array1[local653].method584();
										}
									}
									@Pc(693) int local693 = local651 * 100 / local647;
									@Pc(699) int local699 = local649 * 10000 / local647;
									@Pc(721) String local721 = "Cache:" + Static443.method6035(0, 2, (long) local699, true) + "% (" + local693 + "%)";
									Static544.aClass54_15.method7789(-256, local248, local721, -1, local254);
									local254 += 12;
								}
								if (Static440.anInt7351 > 0) {
									Static544.aClass54_15.method7789(-256, local248, "Particles: " + Static519.anInt8370 + " / " + Static440.anInt7351, -1, local254);
								}
								local254 += 12;
								if (Static292.aBoolean364) {
									Static544.aClass54_15.method7789(-256, local248, "Polys: " + Static505.aClass45_11.DA() + " Models: " + Static505.aClass45_11.T(), -1, local254);
									local254 += 12;
									Static544.aClass54_15.method7789(-256, local248, "Ls: " + Static172.anInt9422 + " La: " + Static323.anInt5466 + " NPC: " + Static313.anInt5338 + " Pl: " + Static334.anInt5596, -1, local254);
									Static2.method41();
									local254 += 12;
								}
								Static319.aBooleanArray17[local49] = true;
								continue;
							}
						}
						if (local24.anInt9665 == 0) {
							if (Static204.anInt3749 == local24.anInt9591 && Static505.aClass45_11.method7363()) {
								Static505.aClass45_11.method7356(local94, local99, local24.anInt9668, local24.anInt9650);
							}
							method1712(local285, local168, local296, arg3, local49, local164, local24.anInt9594, local94 - local24.anInt9633, -local24.anInt9655 + local99);
							if (local24.aClass361Array2 != null) {
								method1712(local285, local168, local296, local24.aClass361Array2, local49, local164, local24.anInt9594, local94 - local24.anInt9633, local99 - local24.anInt9655);
							}
							@Pc(882) Class3_Sub49 local882 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local24.anInt9594);
							if (local882 != null) {
								Static406.method5862(local296, local285, local882.anInt8836, local94, local168, local99, local49, local164);
							}
							if (Static204.anInt3749 == local24.anInt9591 && Static505.aClass45_11.method7363()) {
								Static505.aClass45_11.method7426();
							}
							Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
						}
						if (Static326.aBooleanArray18[local49] || Static475.anInt7861 > 1) {
							if (local24.anInt9665 == 3) {
								if (local102 == 0) {
									if (local24.aBoolean758) {
										Static505.aClass45_11.J(local94, local99, local24.anInt9668, local24.anInt9650, local24.anInt9593, 0);
									} else {
										Static505.aClass45_11.method7402(local94, local99, local24.anInt9668, local24.anInt9650, local24.anInt9593, 0);
									}
								} else if (local24.aBoolean758) {
									Static505.aClass45_11.J(local94, local99, local24.anInt9668, local24.anInt9650, local24.anInt9593 & 0xFFFFFF | 255 - (local102 & 0xFF) << 24, 1);
								} else {
									Static505.aClass45_11.method7402(local94, local99, local24.anInt9668, local24.anInt9650, 255 - (local102 & 0xFF) << 24 | local24.anInt9593 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt9665 == 4) {
								@Pc(1018) Class54 local1018 = local24.method7902(Static505.aClass45_11);
								if (local1018 != null) {
									local254 = local24.anInt9593;
									@Pc(1033) String local1033 = local24.aString100;
									if (local24.anInt9645 != -1) {
										@Pc(1043) Class197 local1043 = Static6.aClass92_1.method2673(local24.anInt9645);
										local1033 = local1043.aString38;
										if (local1033 == null) {
											local1033 = "null";
										}
										if ((local1043.anInt5238 == 1 || local24.anInt9607 != 1) && local24.anInt9607 != -1) {
											local1033 = "<col=ff9040>" + local1033 + "</col> x" + Static368.method5397(local24.anInt9607);
										}
									}
									if (local24 == Static19.aClass361_1) {
										local1033 = Static544.aClass343_35.method7222(Static256.anInt4535);
										local254 = local24.anInt9593;
									}
									if (Static424.aBoolean540) {
										Static505.aClass45_11.V(local94, local99, local94 + local24.anInt9668, local99 - -local24.anInt9650);
									}
									local1018.method7797(local24.anInt9668, 0, null, local24.anInt9592, local24.aBoolean759 ? 255 - (local102 & 0xFF) << 24 : -1, Static494.aClass14Array14, local99, local24.anInt9650, local1033, local24.anInt9630, local94, 255 - (local102 & 0xFF) << 24 | local254, local24.anInt9598, 0, null, local24.anInt9602);
									if (Static424.aBoolean540) {
										Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
									}
								} else if (Static112.aBoolean171) {
									Static186.method3170(local24);
								}
							} else {
								@Pc(1246) int local1246;
								if (local24.anInt9665 == 5) {
									if (local24.anInt9618 < 0) {
										@Pc(1182) Class14 local1182;
										if (local24.anInt9645 == -1) {
											local1182 = local24.method7894(Static505.aClass45_11);
										} else {
											@Pc(1192) Class78 local1192 = local24.aBoolean750 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1 : null;
											local1182 = Static6.aClass92_1.method2672(local24.anInt9653 | 0xFF000000, Static505.aClass45_11, local24.anInt9623, local24.anInt9607, local24.anInt9645, local1192, local24.anInt9627);
										}
										if (local1182 != null) {
											local254 = local1182.A();
											local505 = local1182.ca();
											local1246 = 255 - (local102 & 0xFF) << 24 | (local24.anInt9593 == 0 ? 16777215 : local24.anInt9593 & 0xFFFFFF);
											if (local24.aBoolean755) {
												Static505.aClass45_11.V(local94, local99, local24.anInt9668 + local94, local24.anInt9650 + local99);
												if (local24.anInt9597 != 0) {
													local536 = (local254 + local24.anInt9668 - 1) / local254;
													local538 = (local505 + local24.anInt9650 - 1) / local505;
													for (local549 = 0; local549 < local536; local549++) {
														for (local647 = 0; local647 < local538; local647++) {
															if (local24.anInt9593 == 0) {
																local1182.method7678((float) (local94 + local254 * local549) + (float) local254 / 2.0F, (float) (local505 * local647 + local99) + (float) local505 / 2.0F, 4096, local24.anInt9597);
															} else {
																local1182.method7677((float) (local549 * local254 + local94) + (float) local254 / 2.0F, (float) local505 / 2.0F + (float) (local99 - -(local505 * local647)), 4096, local24.anInt9597, local1246);
															}
														}
													}
												} else if (local24.anInt9593 == 0 && local102 == 0) {
													local1182.method7682(local94, local99, local24.anInt9668, local24.anInt9650);
												} else {
													local1182.DA(local94, local99, local24.anInt9668, local24.anInt9650, 0, local1246, 1);
												}
												Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
											} else if (local24.anInt9593 == 0 && local102 == 0) {
												if (local24.anInt9597 != 0) {
													local1182.method7678((float) local94 + (float) local24.anInt9668 / 2.0F, (float) local99 + (float) local24.anInt9650 / 2.0F, local24.anInt9668 * 4096 / local254, local24.anInt9597);
												} else if (local24.anInt9668 == local254 && local24.anInt9650 == local505) {
													local1182.method7680(local94, local99);
												} else {
													local1182.method7681(local94, local99, local24.anInt9668, local24.anInt9650);
												}
											} else if (local24.anInt9597 != 0) {
												local1182.method7677((float) local94 + (float) local24.anInt9668 / 2.0F, (float) local24.anInt9650 / 2.0F + (float) local99, local24.anInt9668 * 4096 / local254, local24.anInt9597, local1246);
											} else if (local24.anInt9668 == local254 && local24.anInt9650 == local505) {
												local1182.V(local94, local99, 0, local1246, 1);
											} else {
												local1182.method7676(local94, local99, local24.anInt9668, local24.anInt9650, 0, local1246, 1);
											}
										} else if (Static112.aBoolean171) {
											Static186.method3170(local24);
										}
									} else {
										local24.method7885(Static420.aClass356_1, Static508.aClass232_1).method7337(local24.anInt9634 << 3, local24.anInt9668, local24.anInt9650, local99, Static505.aClass45_11, 0, local24.anInt9641 << 3, 0, local94);
									}
								} else if (local24.anInt9665 == 6) {
									Static57.method1008();
									@Pc(1582) Class60 local1582 = null;
									local254 = 0;
									@Pc(1695) Class185 local1695;
									@Pc(1705) Class78 local1705;
									if (local24.anInt9645 != -1) {
										@Pc(1802) Class197 local1802 = Static6.aClass92_1.method2673(local24.anInt9645);
										if (local1802 != null) {
											local1802 = local1802.method4517(local24.anInt9607);
											local1695 = local24.lb == -1 ? null : Static545.aClass240_2.method5680(local24.lb);
											local1705 = local24.aBoolean750 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1 : null;
											local1582 = local1802.method4530(2048, local24.anInt9596, local1695, local1705, local24.anInt9644, local24.anInt9664, 1, Static505.aClass45_11);
											if (local1582 == null) {
												Static186.method3170(local24);
											} else {
												local254 = -local1582.J() >> 1;
											}
										}
									} else if (local24.anInt9582 == 5) {
										local505 = local24.anInt9628;
										if (local505 >= 0 && local505 < 2048) {
											@Pc(1609) Class41_Sub2_Sub1_Sub4_Sub2 local1609 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local505];
											@Pc(1622) Class185 local1622 = local24.lb == -1 ? null : Static545.aClass240_2.method5680(local24.lb);
											if (local1609 != null && (local505 == Static166.anInt3327 || Static381.method5573(local1609.aString95) == local24.anInt9629)) {
												local1582 = local1609.aClass78_1.method1908(null, Static6.aClass92_1, Static43.aClass23_1, null, Static491.aClass318_1, local24.anInt9664, 0, Static505.aClass45_11, Static545.aClass240_2, 2048, Static401.aClass33_1, local24.anInt9596, Static361.aClass229_13, local1622, local24.anInt9644, 0, -1);
											}
										}
									} else if (local24.anInt9582 == 8 || local24.anInt9582 == 9) {
										@Pc(1683) Class3_Sub45 local1683 = Static162.method826(local24.anInt9628, false);
										local1695 = local24.lb == -1 ? null : Static545.aClass240_2.method5680(local24.lb);
										if (local1683 != null) {
											local1705 = local24.aBoolean750 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1 : null;
											local1582 = local1683.method6643(local1695, local24.anInt9664, local24.anInt9644, local24.anInt9629, local24.anInt9582 == 9, local1705, local24.anInt9596, Static505.aClass45_11);
										}
									} else if (local24.lb == -1) {
										local1582 = local24.method7895(Static505.aClass45_11, Static6.aClass92_1, Static545.aClass240_2, 2048, Static361.aClass229_13, 0, Static401.aClass33_1, Static491.aClass318_1, null, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1, -1, Static43.aClass23_1, -1);
										if (local1582 == null && Static112.aBoolean171) {
											Static186.method3170(local24);
										}
									} else {
										@Pc(1767) Class185 local1767 = Static545.aClass240_2.method5680(local24.lb);
										local1582 = local24.method7895(Static505.aClass45_11, Static6.aClass92_1, Static545.aClass240_2, 2048, Static361.aClass229_13, local24.anInt9596, Static401.aClass33_1, Static491.aClass318_1, local1767, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1, local24.anInt9664, Static43.aClass23_1, local24.anInt9644);
										if (local1582 == null && Static112.aBoolean171) {
											Static186.method3170(local24);
										}
									}
									if (local1582 != null) {
										if (local24.anInt9604 <= 0) {
											local505 = 512;
										} else {
											local505 = (local24.anInt9668 << 9) / local24.anInt9604;
										}
										if (local24.anInt9658 > 0) {
											local1246 = (local24.anInt9650 << 9) / local24.anInt9658;
										} else {
											local1246 = 512;
										}
										local536 = local24.anInt9668 / 2 + local94;
										local538 = local24.anInt9650 / 2 + local99;
										if (!local24.aBoolean756) {
											local538 += local24.anInt9625 * local1246 >> 9;
											local536 += local505 * local24.anInt9581 >> 9;
										}
										Static472.aClass11_6.Y();
										Static505.aClass45_11.method7367(Static472.aClass11_6);
										Static505.aClass45_11.la(local536, local538, local505, local1246);
										Static505.aClass45_11.ya();
										if (local24.aBoolean753) {
											Static505.aClass45_11.ZA(false);
										}
										if (local24.aBoolean756) {
											Static338.aClass11_4.oa(local24.anInt9667);
											Static338.aClass11_4.ZA(local24.anInt9639);
											Static338.aClass11_4.AA(local24.anInt9588);
											Static338.aClass11_4.U(local24.anInt9581, local24.anInt9625, local24.anInt9580);
										} else {
											local549 = Class356.anIntArray597[local24.anInt9667 << 3] * (local24.anInt9615 << 2) >> 14;
											local647 = Class356.anIntArray598[local24.anInt9667 << 3] * (local24.anInt9615 << 2) >> 14;
											Static338.aClass11_4.J(-local24.anInt9588 << 3);
											Static338.aClass11_4.ZA(local24.anInt9639 << 3);
											Static338.aClass11_4.U(local24.anInt9636 << 2, local254 + (local24.anInt9622 << 2) + local549, local647 + (local24.anInt9622 << 2));
											Static338.aClass11_4.w(local24.anInt9667 << 3);
										}
										local24.method7899(Static338.aClass11_4, Static505.aClass45_11, Static506.anInt8251, local1582);
										if (Static424.aBoolean540) {
											Static505.aClass45_11.V(local94, local99, local24.anInt9668 + local94, local99 - -local24.anInt9650);
										}
										if (local24.aBoolean756) {
											if (local24.aBoolean754) {
												local1582.method7224(Static338.aClass11_4, null, local24.anInt9615, 1);
											} else {
												local1582.method7230(Static338.aClass11_4, null, 1);
												if (local24.aClass41_Sub9_7 != null) {
													Static505.aClass45_11.method7396(local24.aClass41_Sub9_7.method7735());
												}
											}
										} else if (local24.aBoolean754) {
											local1582.method7224(Static338.aClass11_4, null, local24.anInt9615 << 2, 1);
										} else {
											local1582.method7230(Static338.aClass11_4, null, 1);
											if (local24.aClass41_Sub9_7 != null) {
												Static505.aClass45_11.method7396(local24.aClass41_Sub9_7.method7735());
											}
										}
										if (Static424.aBoolean540) {
											Static505.aClass45_11.da(arg5, arg1, arg2, arg0);
										}
										if (local24.aBoolean753) {
											Static505.aClass45_11.ZA(true);
										}
									}
								} else if (local24.anInt9665 == 9) {
									if (local24.aBoolean762) {
										local505 = local24.anInt9668 + local94;
										local1246 = local99;
										local254 = local99 + local24.anInt9650;
									} else {
										local254 = local99;
										local505 = local94 + local24.anInt9668;
										local1246 = local99 + local24.anInt9650;
									}
									if (local24.anInt9640 == 1) {
										Static505.aClass45_11.method7376(local94, local254, local505, local1246, local24.anInt9593, 0);
									} else {
										Static505.aClass45_11.method7364(local94, local254, local505, local1246, local24.anInt9593, local24.anInt9640);
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
