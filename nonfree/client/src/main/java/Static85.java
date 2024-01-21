import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
	public static int anInt2038;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
	public static int anInt2041;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 aClass5_Sub1_Sub10_Sub3_39;

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "Lclient!nb;")
	public static Class24 aClass24_16;

	@OriginalMember(owner = "client!pd", name = "sb", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1015 = Static38.method736("overlay_multiway");

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "[Lclient!tc;")
	public static Class5_Sub1_Sub1_Sub3_Sub2[] aClass5_Sub1_Sub1_Sub3_Sub2Array1 = new Class5_Sub1_Sub1_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1016 = Static38.method736(" )2>");

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1017 = Static38.method736("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1019 = Static38.method736("Username: ");

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1018 = aClass71_1019;

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1020 = Static38.method736("Verbindung mit");

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1021 = Static38.method736("leuchten2:");

	@OriginalMember(owner = "client!pd", name = "mb", descriptor = "[I")
	public static int[] anIntArray252 = new int[1000];

	@OriginalMember(owner = "client!pd", name = "nb", descriptor = "I")
	public static int anInt2048 = 0;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	public static void method1385(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !aBooleanArray14[arg0]) {
			return;
		}
		Static91.aClass24_19.method675(arg0);
		if (Static30.aClass5_Sub1_Sub11ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < Static30.aClass5_Sub1_Sub11ArrayArray1[arg0].length; local29++) {
			if (Static30.aClass5_Sub1_Sub11ArrayArray1[arg0][local29] != null) {
				if (Static30.aClass5_Sub1_Sub11ArrayArray1[arg0][local29].anInt1790 == 2) {
					local27 = false;
				} else {
					Static30.aClass5_Sub1_Sub11ArrayArray1[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			Static30.aClass5_Sub1_Sub11ArrayArray1[arg0] = null;
		}
		aBooleanArray14[arg0] = false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII[Lclient!me;III)V")
	public static void method1387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5_Sub1_Sub11[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 < arg2 || arg9 > arg1 || arg10 <= arg0 || arg8 <= arg1) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < arg7.length; local33++) {
			@Pc(39) Class5_Sub1_Sub11 local39 = arg7[local33];
			if (local39 != null && arg6 == local39.anInt1785 && (!local39.aBoolean75 || !Static6.method159(local39))) {
				@Pc(67) int local67 = local39.anInt1817 + arg9 - arg4;
				@Pc(76) int local76 = local39.anInt1804 + arg2 - arg3;
				if (local39.anInt1790 == 8 && local76 <= arg0 && arg1 >= local67 && local76 + local39.anInt1776 > arg0 && arg1 < local39.anInt1801 + local67) {
					Static33.anInt930 = local33;
				}
				if ((local39.anInt1784 >= 0 || local39.anInt1786 != 0) && arg0 >= local76 && local67 <= arg1 && arg0 < local76 + local39.anInt1776 && arg1 < local39.anInt1801 + local67) {
					if (local39.anInt1784 < 0) {
						Static7.anInt262 = local33;
					} else {
						Static7.anInt262 = local39.anInt1784;
					}
				}
				if (local39.anInt1790 == 0) {
					if (!local39.aBoolean75 && Static6.method159(local39) && !Static9.method198(arg5, local33)) {
						continue;
					}
					method1387(arg0, arg1, local76, local39.anInt1778, local39.anInt1774, arg5, local39.anInt1760, arg7, local39.anInt1801 + local67, local67, local39.anInt1776 + local76);
					if (local39.aClass5_Sub1_Sub11Array2 != null) {
						method1387(arg0, arg1, local76, local39.anInt1778, local39.anInt1774, arg5, local39.anInt1760, local39.aClass5_Sub1_Sub11Array2, local67 + local39.anInt1801, local67, local39.anInt1776 + local76);
					}
					if (local39.anInt1801 < local39.anInt1809 && !local39.aBoolean75) {
						Static95.method1578(local39, local39.anInt1801, local39.anInt1809, local76 + local39.anInt1776, arg5, arg1, arg0, local67);
					}
					if (!local39.aBoolean75) {
						continue;
					}
				}
				if (local39.anInt1772 == 1 && arg0 >= local76 && arg1 >= local67 && local39.anInt1776 + local76 > arg0 && arg1 < local67 + local39.anInt1801) {
					@Pc(285) boolean local285 = false;
					if (local39.anInt1764 != 0) {
						local285 = Static68.method1140(local39);
					}
					if (!local285) {
						Static60.method1040(6, Static38.aClass71_568, 0, 0, local39.anInt1760, local39.aClass71_878);
					}
				}
				if (local39.anInt1772 == 2 && !Static33.aBoolean40 && arg0 >= local76 && local67 <= arg1 && arg0 < local39.anInt1776 + local76 && local67 + local39.anInt1801 > arg1) {
					@Pc(348) Class71 local348 = Static92.method1542(local39);
					if (local348 != null) {
						Static60.method1040(56, Static74.method677(new Class71[] { Static28.aClass71_448, local39.aClass71_882 }), 0, -1, local39.anInt1760, local348);
					}
				}
				if (local39.anInt1772 == 3 && local76 <= arg0 && local67 <= arg1 && arg0 < local76 + local39.anInt1776 && local39.anInt1801 + local67 > arg1) {
					@Pc(429) byte local429;
					if (arg5 == 3) {
						local429 = 54;
					} else {
						local429 = 35;
					}
					Static60.method1040(local429, Static38.aClass71_568, 0, 0, local39.anInt1760, Static23.aClass71_417);
				}
				if (local39.anInt1772 == 4 && local76 <= arg0 && local67 <= arg1 && arg0 < local76 + local39.anInt1776 && arg1 < local67 + local39.anInt1801) {
					Static60.method1040(43, Static38.aClass71_568, 0, 0, local39.anInt1760, local39.aClass71_878);
				}
				if (local39.anInt1772 == 5 && arg0 >= local76 && local67 <= arg1 && arg0 < local39.anInt1776 + local76 && local67 + local39.anInt1801 > arg1) {
					Static60.method1040(41, Static38.aClass71_568, 0, 0, local39.anInt1760, local39.aClass71_878);
				}
				if (local39.anInt1772 == 6 && Static88.anInt2058 == -1 && arg0 >= local76 && local67 <= arg1 && arg0 < local39.anInt1776 + local76 && local39.anInt1801 + local67 > arg1) {
					Static60.method1040(2, Static38.aClass71_568, 0, -1, local39.anInt1760, local39.aClass71_878);
				}
				@Pc(590) int local590;
				@Pc(584) int local584;
				if (local39.anInt1790 == 2) {
					local584 = 0;
					for (@Pc(586) int local586 = 0; local586 < local39.anInt1801; local586++) {
						for (local590 = 0; local590 < local39.anInt1776; local590++) {
							@Pc(601) int local601 = local76 + local590 * (local39.anInt1779 + 32);
							@Pc(611) int local611 = local67 + (local39.anInt1822 + 32) * local586;
							if (local584 < 20) {
								local611 += local39.anIntArray223[local584];
								local601 += local39.anIntArray219[local584];
							}
							if (local601 <= arg0 && local611 <= arg1 && arg0 < local601 + 32 && arg1 < local611 + 32) {
								Static94.anInt2277 = local39.anInt1760;
								Static118.anInt2917 = local584;
								if (local39.anIntArray222[local584] > 0) {
									@Pc(678) Class5_Sub1_Sub17 local678 = Static33.method691(local39.anIntArray222[local584] - 1);
									if (Static81.anInt1990 == 1 && Static3.method65(Static23.method545(local39))) {
										if (local39.anInt1760 != Static116.anInt2808 || Static94.anInt2274 != local584) {
											Static60.method1040(53, Static74.method677(new Class71[] { Static94.aClass71_1106, Static6.aClass71_160, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, Static31.aClass71_480);
										}
									} else if (!Static33.aBoolean40 || !Static3.method65(Static23.method545(local39))) {
										@Pc(753) Class71[] local753 = local678.aClass71Array18;
										if (Static110.aBoolean119) {
											local753 = Static68.method1147(local753);
										}
										@Pc(767) int local767;
										@Pc(782) byte local782;
										if (Static3.method65(Static23.method545(local39))) {
											for (local767 = 4; local767 >= 3; local767--) {
												if (local753 != null && local753[local767] != null) {
													if (local767 == 3) {
														local782 = 7;
													} else {
														local782 = 5;
													}
													Static60.method1040(local782, Static74.method677(new Class71[] { Static82.aClass71_990, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, local753[local767]);
												} else if (local767 == 4) {
													Static60.method1040(5, Static74.method677(new Class71[] { Static82.aClass71_990, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, Static66.aClass71_818);
												}
											}
										}
										if (Static119.method1956(Static23.method545(local39))) {
											Static60.method1040(17, Static74.method677(new Class71[] { Static82.aClass71_990, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, Static31.aClass71_480);
										}
										if (Static3.method65(Static23.method545(local39)) && local753 != null) {
											for (local767 = 2; local767 >= 0; local767--) {
												if (local753[local767] != null) {
													local782 = 0;
													if (local767 == 0) {
														local782 = 14;
													}
													if (local767 == 1) {
														local782 = 19;
													}
													if (local767 == 2) {
														local782 = 29;
													}
													Static60.method1040(local782, Static74.method677(new Class71[] { Static82.aClass71_990, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, local753[local767]);
												}
											}
										}
										local753 = local39.aClass71Array11;
										if (Static110.aBoolean119) {
											local753 = Static68.method1147(local753);
										}
										if (local753 != null) {
											for (local767 = 4; local767 >= 0; local767--) {
												if (local753[local767] != null) {
													local782 = 0;
													if (local767 == 0) {
														local782 = 47;
													}
													if (local767 == 1) {
														local782 = 38;
													}
													if (local767 == 2) {
														local782 = 32;
													}
													if (local767 == 3) {
														local782 = 13;
													}
													if (local767 == 4) {
														local782 = 25;
													}
													Static60.method1040(local782, Static74.method677(new Class71[] { Static82.aClass71_990, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, local753[local767]);
												}
											}
										}
										Static60.method1040(1002, Static74.method677(new Class71[] { Static82.aClass71_990, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, Static73.aClass71_893);
									} else if ((Static24.anInt741 & 0x10) == 16) {
										Static60.method1040(11, Static74.method677(new Class71[] { Static10.aClass71_222, Static6.aClass71_160, local678.aClass71_1359 }), local678.anInt2906, local584, local39.anInt1760, Static82.aClass71_991);
									}
								}
							}
							local584++;
						}
					}
				}
				if (local39.aBoolean75) {
					if (Static33.aBoolean40) {
						if (Static91.method1429(Static23.method545(local39)) && (Static24.anInt741 & 0x20) == 32 && arg0 >= local76 && local67 <= arg1 && arg0 < local76 + local39.anInt1776 && arg1 < local67 + local39.anInt1801) {
							Static60.method1040(33, Static74.method677(new Class71[] { Static10.aClass71_222, Static89.aClass71_1041, local39.aClass71_876 }), 0, local39.anInt1769, local39.anInt1760, Static82.aClass71_991);
						}
					} else if (local76 <= arg0 && local67 <= arg1 && arg0 < local39.anInt1776 + local76 && arg1 < local39.anInt1801 + local67) {
						@Pc(1168) Class71 local1168;
						for (local584 = 9; local584 >= 5; local584--) {
							local1168 = Static82.method1349(local39, local584);
							if (local1168 != null) {
								Static60.method1040(49, local39.aClass71_876, local584 + 1, local39.anInt1769, local39.anInt1760, local1168);
							}
						}
						local1168 = Static92.method1542(local39);
						if (local1168 != null) {
							Static60.method1040(56, local39.aClass71_876, 0, local39.anInt1769, local39.anInt1760, local1168);
						}
						for (local590 = 4; local590 >= 0; local590--) {
							@Pc(1223) Class71 local1223 = Static82.method1349(local39, local590);
							if (local1223 != null) {
								Static60.method1040(49, local39.aClass71_876, local590 + 1, local39.anInt1769, local39.anInt1760, local1223);
							}
						}
						if (Static10.method213(Static23.method545(local39))) {
							Static60.method1040(2, Static38.aClass71_568, 0, -1, local39.anInt1760, local39.aClass71_878);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
	public static void method1390() {
		aClass5_Sub1_Sub1_Sub3_Sub2Array1 = null;
		aClass71_1016 = null;
		aClass71_1020 = null;
		aClass5_Sub1_Sub10_Sub3_39 = null;
		aClass71_1021 = null;
		aClass24_16 = null;
		aClass71_1015 = null;
		aClass71_1019 = null;
		anIntArray252 = null;
		aClass71_1018 = null;
		aClass71_1017 = null;
		aLongArray7 = null;
		aBooleanArray14 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!ha;BZ)Z")
	public static boolean method1391(@OriginalArg(1) Class29 arg0, @OriginalArg(3) boolean arg1) {
		return Static116.method1896(arg1, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)V")
	public static void method1393() {
		while (true) {
			if (Static86.aClass5_Sub11_Sub1_12.method1554(Static57.anInt1482) >= 27) {
				@Pc(18) int local18 = Static86.aClass5_Sub11_Sub1_12.method1555(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local18] == null) {
						local23 = true;
						Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local18] = new Class5_Sub1_Sub1_Sub3_Sub1();
					}
					@Pc(39) Class5_Sub1_Sub1_Sub3_Sub1 local39 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local18];
					Static61.anIntArray175[Static90.anInt3005++] = local18;
					local39.anInt2469 = Static95.anInt2285;
					@Pc(55) int local55 = Static86.aClass5_Sub11_Sub1_12.method1555(5);
					@Pc(60) int local60 = Static86.aClass5_Sub11_Sub1_12.method1555(5);
					if (local60 > 15) {
						local60 -= 32;
					}
					if (local55 > 15) {
						local55 -= 32;
					}
					@Pc(79) int local79 = Static6.anIntArray11[Static86.aClass5_Sub11_Sub1_12.method1555(3)];
					if (local23) {
						local39.anInt2456 = local79;
					}
					@Pc(89) int local89 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
					if (local89 == 1) {
						Static72.anIntArray224[Static57.anInt1493++] = local18;
					}
					@Pc(105) int local105 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
					local39.aClass5_Sub1_Sub16_1 = Static56.method994(Static86.aClass5_Sub11_Sub1_12.method1555(13));
					local39.anInt2479 = local39.aClass5_Sub1_Sub16_1.anInt2821;
					local39.anInt2487 = local39.aClass5_Sub1_Sub16_1.anInt2822;
					local39.anInt2443 = local39.aClass5_Sub1_Sub16_1.anInt2818;
					local39.anInt2478 = local39.aClass5_Sub1_Sub16_1.anInt2803;
					local39.anInt2448 = local39.aClass5_Sub1_Sub16_1.anInt2794;
					local39.anInt2439 = local39.aClass5_Sub1_Sub16_1.anInt2806;
					local39.anInt2485 = local39.aClass5_Sub1_Sub16_1.anInt2817;
					local39.anInt2475 = local39.aClass5_Sub1_Sub16_1.anInt2819;
					local39.anInt2453 = local39.aClass5_Sub1_Sub16_1.anInt2802;
					if (local39.anInt2443 == 0) {
						local39.anInt2456 = 0;
					}
					local39.method1678(local105 == 1, local55 + Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0] - -local60);
					continue;
				}
			}
			Static86.aClass5_Sub11_Sub1_12.method1562();
			return;
		}
	}
}
