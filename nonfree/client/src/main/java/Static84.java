import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_944 = Static56.method972("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public static int anInt2058 = 0;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_945 = Static56.method972("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method1333() {
		for (@Pc(14) Class3_Sub1_Sub1_Sub2 local14 = (Class3_Sub1_Sub1_Sub2) Static32.aClass51_8.method1316(); local14 != null; local14 = (Class3_Sub1_Sub1_Sub2) Static32.aClass51_8.method1310()) {
			if (Static12.anInt480 != local14.anInt968 || local14.anInt979 < Static3.anInt289) {
				local14.method1966();
			} else if (local14.anInt976 <= Static3.anInt289) {
				if (local14.anInt972 > 0) {
					@Pc(46) Class3_Sub1_Sub1_Sub1_Sub1 local46 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local14.anInt972 - 1];
					if (local46 != null && local46.anInt1567 >= 0 && local46.anInt1567 < 13312 && local46.anInt1543 >= 0 && local46.anInt1543 < 13312) {
						local14.method674(Static15.method358(local46.anInt1543, local14.anInt968, local46.anInt1567) - local14.anInt973, local46.anInt1543, Static3.anInt289, local46.anInt1567);
					}
				}
				if (local14.anInt972 < 0) {
					@Pc(99) int local99 = -local14.anInt972 - 1;
					@Pc(110) Class3_Sub1_Sub1_Sub1_Sub2 local110;
					if (Static114.anInt2962 == local99) {
						local110 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1;
					} else {
						local110 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local99];
					}
					if (local110 != null && local110.anInt1567 >= 0 && local110.anInt1567 < 13312 && local110.anInt1543 >= 0 && local110.anInt1543 < 13312) {
						local14.method674(Static15.method358(local110.anInt1543, local14.anInt968, local110.anInt1567) - local14.anInt973, local110.anInt1543, Static3.anInt289, local110.anInt1567);
					}
				}
				local14.method675(Static74.anInt1893);
				Static73.aClass42_1.method1031(Static12.anInt480, (int) local14.aDouble3, (int) local14.aDouble4, (int) local14.aDouble5, 60, local14, local14.anInt980, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIII)V")
	public static void method1334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static73.aClass42_1.method1035(arg0, arg2, arg3);
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(24) int local24;
		@Pc(51) int local51;
		@Pc(49) int local49;
		@Pc(57) int local57;
		if (local11 != 0) {
			local20 = Static73.aClass42_1.method1015(arg0, arg2, arg3, local11);
			local24 = local20 & 0x1F;
			local30 = local20 >> 6 & 0x3;
			@Pc(33) int[] local33 = Static40.aClass3_Sub1_Sub2_Sub3_3.anIntArray237;
			local49 = arg2 * 4 + (-(arg3 * 512) + 52736) * 4 + 24624;
			local51 = arg1;
			local57 = local11 >> 14 & 0x7FFF;
			if (local11 > 0) {
				local51 = arg4;
			}
			@Pc(68) Class3_Sub1_Sub15 local68 = Static72.method1211(local57);
			if (local68.anInt2342 == -1) {
				if (local24 == 0 || local24 == 2) {
					if (local30 == 0) {
						local33[local49] = local51;
						local33[local49 + 512] = local51;
						local33[local49 + 1024] = local51;
						local33[local49 + 1536] = local51;
					} else if (local30 == 1) {
						local33[local49] = local51;
						local33[local49 + 1] = local51;
						local33[local49 + 2] = local51;
						local33[local49 + 3] = local51;
					} else if (local30 == 2) {
						local33[local49 + 3] = local51;
						local33[local49 + 515] = local51;
						local33[local49 + 1024 + 3] = local51;
						local33[local49 + 1536 + 3] = local51;
					} else if (local30 == 3) {
						local33[local49 + 1536] = local51;
						local33[local49 + 1536 + 1] = local51;
						local33[local49 + 2 + 1536] = local51;
						local33[local49 + 1539] = local51;
					}
				}
				if (local24 == 3) {
					if (local30 == 0) {
						local33[local49] = local51;
					} else if (local30 == 1) {
						local33[local49 + 3] = local51;
					} else if (local30 == 2) {
						local33[local49 + 1539] = local51;
					} else if (local30 == 3) {
						local33[local49 + 1536] = local51;
					}
				}
				if (local24 == 2) {
					if (local30 == 3) {
						local33[local49] = local51;
						local33[local49 + 512] = local51;
						local33[local49 + 1024] = local51;
						local33[local49 + 1536] = local51;
					} else if (local30 == 0) {
						local33[local49] = local51;
						local33[local49 + 1] = local51;
						local33[local49 + 2] = local51;
						local33[local49 + 3] = local51;
					} else if (local30 == 1) {
						local33[local49 + 3] = local51;
						local33[local49 + 3 + 512] = local51;
						local33[local49 + 1024 + 3] = local51;
						local33[local49 + 1536 + 3] = local51;
					} else if (local30 == 2) {
						local33[local49 + 1536] = local51;
						local33[local49 + 1 + 1536] = local51;
						local33[local49 + 2 + 1536] = local51;
						local33[local49 + 3 + 1536] = local51;
					}
				}
			} else {
				@Pc(392) Class3_Sub1_Sub2_Sub4 local392 = Static108.aClass3_Sub1_Sub2_Sub4Array7[local68.anInt2342];
				if (local392 != null) {
					@Pc(404) int local404 = (local68.anInt2312 * 4 - local392.anInt2809) / 2;
					@Pc(415) int local415 = (local68.anInt2331 * 4 - local392.anInt2810) / 2;
					local392.method1857(arg2 * 4 + local404 + 48, 48 - -((104 - arg3 + -local68.anInt2331) * 4) - -local415);
				}
			}
		}
		local11 = Static73.aClass42_1.method1040(arg0, arg2, arg3);
		if (local11 != 0) {
			local20 = Static73.aClass42_1.method1015(arg0, arg2, arg3, local11);
			local51 = local11 >> 14 & 0x7FFF;
			local24 = local20 & 0x1F;
			local30 = local20 >> 6 & 0x3;
			@Pc(478) Class3_Sub1_Sub15 local478 = Static72.method1211(local51);
			@Pc(505) int local505;
			if (local478.anInt2342 != -1) {
				@Pc(574) Class3_Sub1_Sub2_Sub4 local574 = Static108.aClass3_Sub1_Sub2_Sub4Array7[local478.anInt2342];
				if (local574 != null) {
					local57 = (local478.anInt2312 * 4 - local574.anInt2809) / 2;
					local505 = (local478.anInt2331 * 4 - local574.anInt2810) / 2;
					local574.method1857(arg2 * 4 + local57 + 48, local505 + 48 - -((-local478.anInt2331 + -arg3 + 104) * 4));
				}
			} else if (local24 == 9) {
				local49 = 15658734;
				@Pc(490) int[] local490 = Static40.aClass3_Sub1_Sub2_Sub3_3.anIntArray237;
				local505 = (52736 - arg3 * 512) * 4 + arg2 * 4 + 24624;
				if (local11 > 0) {
					local49 = 15597568;
				}
				if (local30 == 0 || local30 == 2) {
					local490[local505 + 1536] = local49;
					local490[local505 + 1025] = local49;
					local490[local505 + 514] = local49;
					local490[local505 + 3] = local49;
				} else {
					local490[local505] = local49;
					local490[local505 + 513] = local49;
					local490[local505 + 1024 + 2] = local49;
					local490[local505 + 1539] = local49;
				}
			}
		}
		local11 = Static73.aClass42_1.method1060(arg0, arg2, arg3);
		if (local11 == 0) {
			return;
		}
		local20 = local11 >> 14 & 0x7FFF;
		@Pc(645) Class3_Sub1_Sub15 local645 = Static72.method1211(local20);
		if (local645.anInt2342 == -1) {
			return;
		}
		@Pc(655) Class3_Sub1_Sub2_Sub4 local655 = Static108.aClass3_Sub1_Sub2_Sub4Array7[local645.anInt2342];
		if (local655 != null) {
			local51 = (local645.anInt2312 * 4 - local655.anInt2809) / 2;
			@Pc(679) int local679 = (local645.anInt2331 * 4 - local655.anInt2810) / 2;
			local655.method1857(arg2 * 4 + local51 + 48, (-arg3 + 104 + -local645.anInt2331) * 4 + (48 - -local679));
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!te;ILclient!ae;)Lclient!ae;")
	public static Class5 method1335(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.method154(Static112.aClass5_1331) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(18) int local18 = arg1.method154(Static33.aClass5_430);
			if (local18 == -1) {
				while (true) {
					local18 = arg1.method154(Static24.aClass5_330);
					if (local18 == -1) {
						while (true) {
							local18 = arg1.method154(Static102.aClass5_1191);
							if (local18 == -1) {
								while (true) {
									local18 = arg1.method154(Static100.aClass5_1133);
									if (local18 == -1) {
										while (true) {
											local18 = arg1.method154(Static2.aClass5_84);
											if (local18 == -1) {
												while (true) {
													local18 = arg1.method154(Static5.aClass5_115);
													if (local18 == -1) {
														return arg1;
													}
													@Pc(248) Class5 local248 = Static110.aClass5_1307;
													if (Static57.aClass58_5 != null) {
														local248 = method1338(Static57.aClass58_5.anInt2475);
														try {
															if (Static57.aClass58_5.anObject4 != null) {
																@Pc(264) byte[] local264 = ((String) Static57.aClass58_5.anObject4).getBytes("ISO-8859-1");
																local248 = Static23.method454(local264, 0, local264.length);
															}
														} catch (@Pc(273) UnsupportedEncodingException local273) {
														}
													}
													arg1 = Static75.method1261(new Class5[] { arg1.method133(0, local18), local248, arg1.method159(local18 + 4) });
												}
											}
											arg1 = Static75.method1261(new Class5[] { arg1.method133(0, local18), Static2.method108(Static113.method1942(4, arg0)), arg1.method159(local18 + 2) });
										}
									}
									arg1 = Static75.method1261(new Class5[] { arg1.method133(0, local18), Static2.method108(Static113.method1942(3, arg0)), arg1.method159(local18 + 2) });
								}
							}
							arg1 = Static75.method1261(new Class5[] { arg1.method133(0, local18), Static2.method108(Static113.method1942(2, arg0)), arg1.method159(local18 + 2) });
						}
					}
					arg1 = Static75.method1261(new Class5[] { arg1.method133(0, local18), Static2.method108(Static113.method1942(1, arg0)), arg1.method159(local18 + 2) });
				}
			}
			arg1 = Static75.method1261(new Class5[] { arg1.method133(0, local18), Static2.method108(Static113.method1942(0, arg0)), arg1.method159(local18 + 2) });
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1336() {
		aClass5_945 = null;
		aClass5_944 = null;
		aBooleanArray16 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(JB)V")
	public static void method1337(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(10) InterruptedException local10) {
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lclient!ae;")
	private static Class5 method1338(@OriginalArg(0) int arg0) {
		return Static75.method1261(new Class5[] { Static96.method1319(arg0 >> 24 & 0xFF), Static45.aClass5_604, Static96.method1319(arg0 >> 16 & 0xFF), Static45.aClass5_604, Static96.method1319(arg0 >> 8 & 0xFF), Static45.aClass5_604, Static96.method1319(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I")
	public static int method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local10 ^ local10 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
