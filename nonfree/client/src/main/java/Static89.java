import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!m;")
	public static Class1_Sub1_Sub8_Sub2_Sub1 aClass1_Sub1_Sub8_Sub2_Sub1_25;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	public static int anInt2751;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!ea;")
	private static Class18 aClass18_680 = Static8.method128("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_681 = aClass18_680;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_682 = Static8.method128("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!rc;")
	public static Class66 aClass66_9 = new Class66(30);

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	public static int anInt2750 = 0;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "Lclient!ea;")
	public static Class18 aClass18_683 = Static8.method128("");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1923() {
		aClass18_680 = null;
		anIntArray238 = null;
		aClass18_681 = null;
		aClass18_682 = null;
		aClass66_9 = null;
		aClass18_683 = null;
		aClass1_Sub1_Sub8_Sub2_Sub1_25 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([BB)[B")
	public static byte[] method1924(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static185.method2279(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method1925(@OriginalArg(1) Class1_Sub6 arg0) {
		if (Static146.aClass44_4 != null) {
			try {
				Static146.aClass44_4.method2082(0L);
				Static146.aClass44_4.method2083(arg0.aByteArray3, arg0.anInt839, 24);
			} catch (@Pc(23) Exception local23) {
			}
		}
		arg0.anInt839 += 24;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ef;ZII)V")
	public static void method1926(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt1225 == 1) {
			Static15.method272(46, arg0.anInt1240, arg0.aClass18_297, 0, Static62.aClass18_472, 0);
		}
		if (arg0.anInt1225 == 2 && !Static21.aBoolean19) {
			@Pc(33) Class18 local33 = Static180.method3221(arg0);
			if (local33 != null) {
				Static15.method272(13, arg0.anInt1240, local33, -1, Static144.method2735(new Class18[] { Static166.aClass18_1169, arg0.aClass18_298 }), 0);
			}
		}
		if (arg0.anInt1225 == 3) {
			Static15.method272(14, arg0.anInt1240, Static108.aClass18_809, 0, Static62.aClass18_472, 0);
		}
		if (arg0.anInt1225 == 4) {
			Static15.method272(20, arg0.anInt1240, arg0.aClass18_297, 0, Static62.aClass18_472, 0);
		}
		if (arg0.anInt1225 == 5) {
			Static15.method272(10, arg0.anInt1240, arg0.aClass18_297, 0, Static62.aClass18_472, 0);
		}
		if (arg0.anInt1225 == 6 && Static161.aClass20_13 == null) {
			Static15.method272(25, arg0.anInt1240, arg0.aClass18_297, -1, Static62.aClass18_472, 0);
		}
		@Pc(162) int local162;
		@Pc(156) int local156;
		if (arg0.anInt1213 == 2) {
			local156 = 0;
			for (@Pc(158) int local158 = 0; local158 < arg0.anInt1212; local158++) {
				for (local162 = 0; local162 < arg0.anInt1260; local162++) {
					@Pc(171) int local171 = (arg0.anInt1252 + 32) * local162;
					@Pc(178) int local178 = (arg0.anInt1253 + 32) * local158;
					if (local156 < 20) {
						local178 += arg0.anIntArray83[local156];
						local171 += arg0.anIntArray85[local156];
					}
					if (arg1 >= local171 && local178 <= arg2 && local171 + 32 > arg1 && local178 + 32 > arg2) {
						Static154.anInt4251 = local156;
						Static11.aClass20_2 = arg0;
						if (arg0.anIntArray79[local156] > 0) {
							@Pc(241) Class1_Sub1_Sub1 local241 = Static101.method2134(arg0.anIntArray79[local156] - 1);
							if (Static98.anInt3018 == 1 && Static161.method2989(Static36.method758(arg0))) {
								if (arg0.anInt1240 != Static118.anInt3371 || local156 != Static20.anInt571) {
									Static15.method272(44, arg0.anInt1240, Static144.aClass18_1016, local156, Static144.method2735(new Class18[] { Static135.aClass18_967, Static177.aClass18_1226, local241.aClass18_28 }), local241.anInt76);
								}
							} else if (!Static21.aBoolean19 || !Static161.method2989(Static36.method758(arg0))) {
								@Pc(306) Class18[] local306 = local241.aClass18Array1;
								if (Static73.aBoolean74) {
									local306 = Static117.method2324(local306);
								}
								@Pc(320) int local320;
								@Pc(337) byte local337;
								if (Static161.method2989(Static36.method758(arg0))) {
									for (local320 = 4; local320 >= 3; local320--) {
										if (local306 != null && local306[local320] != null) {
											if (local320 == 3) {
												local337 = 43;
											} else {
												local337 = 57;
											}
											Static15.method272(local337, arg0.anInt1240, local306[local320], local156, Static144.method2735(new Class18[] { Static3.aClass18_64, local241.aClass18_28 }), local241.anInt76);
										} else if (local320 == 4) {
											Static15.method272(57, arg0.anInt1240, Static4.aClass18_66, local156, Static144.method2735(new Class18[] { Static3.aClass18_64, local241.aClass18_28 }), local241.anInt76);
										}
									}
								}
								if (Static132.method2563(Static36.method758(arg0))) {
									Static15.method272(5, arg0.anInt1240, Static144.aClass18_1016, local156, Static144.method2735(new Class18[] { Static3.aClass18_64, local241.aClass18_28 }), local241.anInt76);
								}
								if (Static161.method2989(Static36.method758(arg0)) && local306 != null) {
									for (local320 = 2; local320 >= 0; local320--) {
										if (local306[local320] != null) {
											local337 = 0;
											if (local320 == 0) {
												local337 = 38;
											}
											if (local320 == 1) {
												local337 = 30;
											}
											if (local320 == 2) {
												local337 = 12;
											}
											Static15.method272(local337, arg0.anInt1240, local306[local320], local156, Static144.method2735(new Class18[] { Static3.aClass18_64, local241.aClass18_28 }), local241.anInt76);
										}
									}
								}
								local306 = arg0.aClass18Array7;
								if (Static73.aBoolean74) {
									local306 = Static117.method2324(local306);
								}
								if (local306 != null) {
									for (local320 = 4; local320 >= 0; local320--) {
										if (local306[local320] != null) {
											local337 = 0;
											if (local320 == 0) {
												local337 = 37;
											}
											if (local320 == 1) {
												local337 = 39;
											}
											if (local320 == 2) {
												local337 = 41;
											}
											if (local320 == 3) {
												local337 = 58;
											}
											if (local320 == 4) {
												local337 = 21;
											}
											Static15.method272(local337, arg0.anInt1240, local306[local320], local156, Static144.method2735(new Class18[] { Static3.aClass18_64, local241.aClass18_28 }), local241.anInt76);
										}
									}
								}
								Static15.method272(1005, arg0.anInt1240, Static154.aClass18_1087, local156, Static144.method2735(new Class18[] { Static3.aClass18_64, local241.aClass18_28 }), local241.anInt76);
							} else if ((Static122.anInt3449 & 0x10) == 16) {
								Static15.method272(28, arg0.anInt1240, Static9.aClass18_106, local156, Static144.method2735(new Class18[] { Static127.aClass18_912, Static177.aClass18_1226, local241.aClass18_28 }), local241.anInt76);
							}
						}
					}
					local156++;
				}
			}
		}
		if (!arg0.aBoolean44) {
			return;
		}
		if (Static21.aBoolean19) {
			if (Static163.method3017(Static36.method758(arg0)) && (Static122.anInt3449 & 0x20) == 32) {
				Static15.method272(35, arg0.anInt1240, Static9.aClass18_106, arg0.anInt1200, Static144.method2735(new Class18[] { Static127.aClass18_912, Static125.aClass18_900, arg0.aClass18_295 }), 0);
				return;
			}
			return;
		}
		@Pc(728) Class18 local728;
		for (local156 = 9; local156 >= 5; local156--) {
			local728 = Static49.method1043(arg0, local156);
			if (local728 != null) {
				Static15.method272(1006, arg0.anInt1240, local728, arg0.anInt1200, arg0.aClass18_295, local156 + 1);
			}
		}
		local728 = Static180.method3221(arg0);
		if (local728 != null) {
			Static15.method272(13, arg0.anInt1240, local728, arg0.anInt1200, arg0.aClass18_295, 0);
		}
		for (local162 = 4; local162 >= 0; local162--) {
			@Pc(787) Class18 local787 = Static49.method1043(arg0, local162);
			if (local787 != null) {
				Static15.method272(16, arg0.anInt1240, local787, arg0.anInt1200, arg0.aClass18_295, local162 + 1);
			}
		}
		if (Static136.method2603(Static36.method758(arg0))) {
			Static15.method272(25, arg0.anInt1240, Static146.aClass18_1036, arg0.anInt1200, Static62.aClass18_472, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public static void method1927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static98.anInt3018 == 0 && !Static21.aBoolean19) {
			Static15.method272(2, arg3 - arg1, Static137.aClass18_979, arg2 - arg0, Static62.aClass18_472, 0);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < Static44.anInt1535; local31++) {
			@Pc(37) int local37 = Static44.anIntArray125[local31];
			@Pc(43) int local43 = local37 >> 7 & 0x7F;
			@Pc(49) int local49 = local37 >> 29 & 0x3;
			@Pc(55) int local55 = local37 >> 14 & 0x7FFF;
			@Pc(59) int local59 = local37 & 0x7F;
			if (local29 != local37) {
				local29 = local37;
				@Pc(146) int local146;
				if (local49 == 2 && Static87.aClass68_1.method2657(Static9.anInt295, local59, local43, local37) >= 0) {
					@Pc(81) Class1_Sub1_Sub11 local81 = Static62.method1274(local55);
					if (local81.anIntArray250 != null) {
						local81 = local81.method1961();
					}
					if (local81 == null) {
						continue;
					}
					if (Static98.anInt3018 == 1) {
						Static15.method272(50, local43, Static144.aClass18_1016, local59, Static144.method2735(new Class18[] { Static135.aClass18_967, Static171.aClass18_1200, local81.aClass18_699 }), local37);
					} else if (!Static21.aBoolean19) {
						@Pc(132) Class18[] local132 = local81.aClass18Array15;
						if (Static73.aBoolean74) {
							local132 = Static117.method2324(local132);
						}
						if (local132 != null) {
							for (local146 = 4; local146 >= 0; local146--) {
								if (local132[local146] != null) {
									@Pc(158) short local158 = 0;
									if (local146 == 0) {
										local158 = 48;
									}
									if (local146 == 1) {
										local158 = 11;
									}
									if (local146 == 2) {
										local158 = 19;
									}
									if (local146 == 3) {
										local158 = 17;
									}
									if (local146 == 4) {
										local158 = 1001;
									}
									Static15.method272(local158, local43, local132[local146], local59, Static144.method2735(new Class18[] { Static142.aClass18_993, local81.aClass18_699 }), local37);
								}
							}
						}
						Static15.method272(1003, local43, Static154.aClass18_1087, local59, Static144.method2735(new Class18[] { Static142.aClass18_993, local81.aClass18_699 }), local81.anInt2823 << 14);
					} else if ((Static122.anInt3449 & 0x4) == 4) {
						Static15.method272(23, local43, Static9.aClass18_106, local59, Static144.method2735(new Class18[] { Static127.aClass18_912, Static171.aClass18_1200, local81.aClass18_699 }), local37);
					}
				}
				@Pc(304) int local304;
				@Pc(312) Class1_Sub1_Sub5_Sub1_Sub1 local312;
				@Pc(361) Class1_Sub1_Sub5_Sub1_Sub2 local361;
				if (local49 == 1) {
					@Pc(281) Class1_Sub1_Sub5_Sub1_Sub1 local281 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local55];
					if (local281.aClass1_Sub1_Sub15_1.anInt3809 == 1 && (local281.anInt3579 & 0x7F) == 64 && (local281.anInt3558 & 0x7F) == 64) {
						for (local304 = 0; local304 < Static155.anInt4267; local304++) {
							local312 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[Static150.anIntArray382[local304]];
							if (local312 != null && local281 != local312 && local312.aClass1_Sub1_Sub15_1.anInt3809 == 1 && local312.anInt3579 == local281.anInt3579 && local281.anInt3558 == local312.anInt3558) {
								Static141.method1500(Static150.anIntArray382[local304], local59, local43, local312.aClass1_Sub1_Sub15_1);
							}
						}
						for (local146 = 0; local146 < Static45.anInt1553; local146++) {
							local361 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static58.anIntArray140[local146]];
							if (local361 != null && local361.anInt3579 == local281.anInt3579 && local281.anInt3558 == local361.anInt3558) {
								Static15.method271(local59, Static58.anIntArray140[local146], local43, local361);
							}
						}
					}
					Static141.method1500(local55, local59, local43, local281.aClass1_Sub1_Sub15_1);
				}
				if (local49 == 0) {
					@Pc(409) Class1_Sub1_Sub5_Sub1_Sub2 local409 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local55];
					if ((local409.anInt3579 & 0x7F) == 64 && (local409.anInt3558 & 0x7F) == 64) {
						for (local304 = 0; local304 < Static155.anInt4267; local304++) {
							local312 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[Static150.anIntArray382[local304]];
							if (local312 != null && local312.aClass1_Sub1_Sub15_1.anInt3809 == 1 && local312.anInt3579 == local409.anInt3579 && local409.anInt3558 == local312.anInt3558) {
								Static141.method1500(Static150.anIntArray382[local304], local59, local43, local312.aClass1_Sub1_Sub15_1);
							}
						}
						for (local146 = 0; local146 < Static45.anInt1553; local146++) {
							local361 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static58.anIntArray140[local146]];
							if (local361 != null && local409 != local361 && local409.anInt3579 == local361.anInt3579 && local361.anInt3558 == local409.anInt3558) {
								Static15.method271(local59, Static58.anIntArray140[local146], local43, local361);
							}
						}
					}
					Static15.method271(local59, local55, local43, local409);
				}
				if (local49 == 3) {
					@Pc(535) Class59 local535 = Static105.aClass59ArrayArrayArray1[Static9.anInt295][local59][local43];
					if (local535 != null) {
						for (@Pc(542) Class1_Sub1_Sub5_Sub3 local542 = (Class1_Sub1_Sub5_Sub3) local535.method2419(); local542 != null; local542 = (Class1_Sub1_Sub5_Sub3) local535.method2421()) {
							@Pc(549) Class1_Sub1_Sub1 local549 = Static101.method2134(local542.anInt1374);
							if (Static98.anInt3018 == 1) {
								Static15.method272(29, local43, Static144.aClass18_1016, local59, Static144.method2735(new Class18[] { Static135.aClass18_967, Static177.aClass18_1226, local549.aClass18_28 }), local542.anInt1374);
							} else if (!Static21.aBoolean19) {
								@Pc(594) Class18[] local594 = local549.aClass18Array2;
								if (Static73.aBoolean74) {
									local594 = Static117.method2324(local594);
								}
								for (@Pc(604) int local604 = 4; local604 >= 0; local604--) {
									if (local594 != null && local594[local604] != null) {
										@Pc(648) byte local648 = 0;
										if (local604 == 0) {
											local648 = 4;
										}
										if (local604 == 1) {
											local648 = 18;
										}
										if (local604 == 2) {
											local648 = 24;
										}
										if (local604 == 3) {
											local648 = 45;
										}
										if (local604 == 4) {
											local648 = 42;
										}
										Static15.method272(local648, local43, local594[local604], local59, Static144.method2735(new Class18[] { Static3.aClass18_64, local549.aClass18_28 }), local542.anInt1374);
									} else if (local604 == 2) {
										Static15.method272(24, local43, Static116.aClass18_835, local59, Static144.method2735(new Class18[] { Static3.aClass18_64, local549.aClass18_28 }), local542.anInt1374);
									}
								}
								Static15.method272(1002, local43, Static154.aClass18_1087, local59, Static144.method2735(new Class18[] { Static3.aClass18_64, local549.aClass18_28 }), local542.anInt1374);
							} else if ((Static122.anInt3449 & 0x1) == 1) {
								Static15.method272(31, local43, Static9.aClass18_106, local59, Static144.method2735(new Class18[] { Static127.aClass18_912, Static177.aClass18_1226, local549.aClass18_28 }), local542.anInt1374);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public static void method1928() {
		Static30.aClass66_4.method2604();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!c;B)V")
	public static void method1929(@OriginalArg(0) Class1_Sub1_Sub5_Sub1 arg0) {
		if (arg0.anInt3581 == 0) {
			return;
		}
		@Pc(31) int local31;
		@Pc(38) int local38;
		if (arg0.anInt3566 != -1 && arg0.anInt3566 < 32768) {
			@Pc(22) Class1_Sub1_Sub5_Sub1_Sub1 local22 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[arg0.anInt3566];
			if (local22 != null) {
				local31 = arg0.anInt3579 - local22.anInt3579;
				local38 = arg0.anInt3558 - local22.anInt3558;
				if (local31 != 0 || local38 != 0) {
					arg0.anInt3590 = (int) (Math.atan2((double) local31, (double) local38) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(63) int local63;
		if (arg0.anInt3566 >= 32768) {
			local63 = arg0.anInt3566 - 32768;
			if (Static40.anInt1308 == local63) {
				local63 = 2047;
			}
			@Pc(72) Class1_Sub1_Sub5_Sub1_Sub2 local72 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local63];
			if (local72 != null) {
				local38 = arg0.anInt3579 - local72.anInt3579;
				@Pc(87) int local87 = arg0.anInt3558 - local72.anInt3558;
				if (local38 != 0 || local87 != 0) {
					arg0.anInt3590 = (int) (Math.atan2((double) local38, (double) local87) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3595 != 0 || arg0.anInt3588 != 0) && (arg0.anInt3561 == 0 || arg0.anInt3578 > 0)) {
			local63 = arg0.anInt3579 - (arg0.anInt3595 - Static117.anInt3328 - Static117.anInt3328) * 64;
			local31 = arg0.anInt3558 - (arg0.anInt3588 - Static110.anInt3227 - Static110.anInt3227) * 64;
			if (local63 != 0 || local31 != 0) {
				arg0.anInt3590 = (int) (Math.atan2((double) local63, (double) local31) * 325.949D) & 0x7FF;
			}
			arg0.anInt3588 = 0;
			arg0.anInt3595 = 0;
		}
		local63 = arg0.anInt3590 - arg0.anInt3576 & 0x7FF;
		if (local63 == 0) {
			arg0.anInt3553 = 0;
			return;
		}
		arg0.anInt3553++;
		@Pc(214) boolean local214;
		if (local63 <= 1024) {
			arg0.anInt3576 += arg0.anInt3581;
			local214 = true;
			if (local63 < arg0.anInt3581 || local63 > 2048 - arg0.anInt3581) {
				arg0.anInt3576 = arg0.anInt3590;
				local214 = false;
			}
			if (arg0.anInt3607 == arg0.anInt3562 && (arg0.anInt3553 > 25 || local214)) {
				if (arg0.anInt3603 == -1) {
					arg0.anInt3562 = arg0.anInt3570;
				} else {
					arg0.anInt3562 = arg0.anInt3603;
				}
			}
		} else {
			arg0.anInt3576 -= arg0.anInt3581;
			local214 = true;
			if (local63 < arg0.anInt3581 || 2048 - arg0.anInt3581 < local63) {
				arg0.anInt3576 = arg0.anInt3590;
				local214 = false;
			}
			if (arg0.anInt3562 == arg0.anInt3607 && (arg0.anInt3553 > 25 || local214)) {
				if (arg0.anInt3594 == -1) {
					arg0.anInt3562 = arg0.anInt3570;
				} else {
					arg0.anInt3562 = arg0.anInt3594;
				}
			}
		}
		arg0.anInt3576 &= 0x7FF;
	}
}
