import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_6;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_13;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
	public static int anInt1399;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!wb;")
	private static Class65 aClass65_629 = Static24.method441("wave:");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!wb;")
	public static Class65 aClass65_622 = aClass65_629;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!wb;")
	private static Class65 aClass65_627 = Static24.method441("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_623 = aClass65_627;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!wb;")
	public static Class65 aClass65_624 = Static24.method441("scape main");

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_625 = Static24.method441("huffman");

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!wb;")
	private static Class65 aClass65_628 = Static24.method441("Drop");

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_626 = aClass65_628;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!ie;")
	public static Class28 aClass28_4 = new Class28();

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_630 = Static24.method441("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!wb;")
	private static Class65 aClass65_631 = Static24.method441("button near the top of that page)3");

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "Lclient!wb;")
	public static Class65 aClass65_632 = aClass65_631;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZIIIIIIII)V")
	public static void method830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static46.method816(arg2) || (arg9 > arg3 || arg5 > arg4 || arg3 >= arg1 || arg4 >= arg0)) {
			return;
		}
		@Pc(50) Class2_Sub1_Sub2[] local50 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg2];
		for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
			@Pc(58) Class2_Sub1_Sub2 local58 = local50[local52];
			if (local58 != null && local58.anInt155 == arg8) {
				@Pc(71) int local71 = arg9 + local58.anInt203;
				@Pc(79) int local79 = arg5 + local58.anInt166 - arg7;
				if (local58.anInt179 == 8 && local71 <= arg3 && local79 <= arg4 && local58.anInt161 + local71 > arg3 && local58.anInt170 + local79 > arg4) {
					Static61.anInt1856 = local52;
				}
				if ((local58.anInt191 >= 0 || local58.anInt206 != 0) && arg3 >= local71 && local79 <= arg4 && arg3 < local71 + local58.anInt161 && local58.anInt170 + local79 > arg4) {
					if (local58.anInt191 < 0) {
						Static77.anInt2244 = local52;
					} else {
						Static77.anInt2244 = local58.anInt191;
					}
				}
				if (local58.anInt179 != 0) {
					if (local58.anInt159 == 1 && local71 <= arg3 && arg4 >= local79 && local58.anInt161 + local71 > arg3 && local58.anInt170 + local79 > arg4) {
						@Pc(262) boolean local262 = false;
						if (local58.anInt180 != 0) {
							local262 = Static55.method979(local58);
						}
						if (!local262) {
							Static47.method820((arg2 << 16) + local52, 0, local58.aClass65_86, Static8.aClass65_145, 22, 0);
						}
					}
					if (local58.anInt159 == 2 && Static37.anInt1224 == 0 && arg3 >= local71 && local79 <= arg4 && local58.anInt161 + local71 > arg3 && local79 + local58.anInt170 > arg4) {
						Static47.method820((arg2 << 16) + local52, 0, local58.aClass65_84, Static13.method282(new Class65[] { Static47.aClass65_621, local58.aClass65_85 }), 20, 0);
					}
					if (local58.anInt159 == 3 && local71 <= arg3 && local79 <= arg4 && local58.anInt161 + local71 > arg3 && local79 + local58.anInt170 > arg4) {
						@Pc(396) byte local396;
						if (arg6 == 3) {
							local396 = 54;
						} else {
							local396 = 21;
						}
						Static47.method820(local52 + (arg2 << 16), 0, Static93.aClass65_1178, Static8.aClass65_145, local396, 0);
					}
					if (local58.anInt159 == 4 && arg3 >= local71 && arg4 >= local79 && local71 + local58.anInt161 > arg3 && arg4 < local58.anInt170 + local79) {
						Static47.method820((arg2 << 16) + local52, 0, local58.aClass65_86, Static8.aClass65_145, 29, 0);
					}
					if (local58.anInt159 == 5 && arg3 >= local71 && arg4 >= local79 && local71 + local58.anInt161 > arg3 && arg4 < local79 + local58.anInt170) {
						Static47.method820(local52 + (arg2 << 16), 0, local58.aClass65_86, Static8.aClass65_145, 33, 0);
					}
					if (local58.anInt159 == 6 && Static85.anInt2453 == -1 && local71 <= arg3 && arg4 >= local79 && arg3 < local58.anInt161 + local71 && arg4 < local79 + local58.anInt170) {
						Static47.method820((arg2 << 16) + local52, 0, local58.aClass65_86, Static8.aClass65_145, 40, 0);
					}
					if (local58.anInt179 == 2) {
						@Pc(576) int local576 = 0;
						for (@Pc(578) int local578 = 0; local578 < local58.anInt170; local578++) {
							for (@Pc(582) int local582 = 0; local582 < local58.anInt161; local582++) {
								@Pc(595) int local595 = local79 + local578 * (local58.anInt171 + 32);
								@Pc(604) int local604 = local71 + local582 * (local58.anInt175 + 32);
								if (local576 < 20) {
									local595 += local58.anIntArray21[local576];
									local604 += local58.anIntArray24[local576];
								}
								if (arg3 >= local604 && arg4 >= local595 && arg3 < local604 + 32 && local595 + 32 > arg4) {
									Static7.anInt287 = (arg2 << 16) + local52;
									Static101.anInt2792 = local576;
									if (local58.anIntArray19[local576] > 0) {
										@Pc(662) Class2_Sub1_Sub8 local662 = Static70.method1263(local58.anIntArray19[local576] - 1);
										if (Static80.anInt2291 == 1 && local58.aBoolean10) {
											if (Static79.anInt2279 != local52 + (arg2 << 16) || local576 != Static76.anInt2216) {
												Static47.method820(local52 + (arg2 << 16), local662.anInt1822, Static22.aClass65_311, Static13.method282(new Class65[] { Static99.aClass65_1144, Static5.aClass65_111, local662.aClass65_820 }), 19, local576);
											}
										} else if (Static37.anInt1224 != 1 || !local58.aBoolean10) {
											@Pc(738) Class65[] local738 = local662.aClass65Array8;
											if (Static55.aBoolean91) {
												local738 = Static78.method346(local738);
											}
											@Pc(749) int local749;
											@Pc(766) byte local766;
											if (local58.aBoolean10) {
												for (local749 = 4; local749 >= 3; local749--) {
													if (local738 != null && local738[local749] != null) {
														if (local749 == 3) {
															local766 = 10;
														} else {
															local766 = 50;
														}
														Static47.method820(local52 + (arg2 << 16), local662.anInt1822, local738[local749], Static13.method282(new Class65[] { Static42.aClass65_597, local662.aClass65_820 }), local766, local576);
													} else if (local749 == 4) {
														Static47.method820(local52 + (arg2 << 16), local662.anInt1822, aClass65_626, Static13.method282(new Class65[] { Static42.aClass65_597, local662.aClass65_820 }), 50, local576);
													}
												}
											}
											if (local58.aBoolean14) {
												Static47.method820(local52 + (arg2 << 16), local662.anInt1822, Static22.aClass65_311, Static13.method282(new Class65[] { Static42.aClass65_597, local662.aClass65_820 }), 37, local576);
											}
											if (local58.aBoolean10 && local738 != null) {
												for (local749 = 2; local749 >= 0; local749--) {
													if (local738[local749] != null) {
														local766 = 0;
														if (local749 == 0) {
															local766 = 8;
														}
														if (local749 == 1) {
															local766 = 18;
														}
														if (local749 == 2) {
															local766 = 5;
														}
														Static47.method820(local52 + (arg2 << 16), local662.anInt1822, local738[local749], Static13.method282(new Class65[] { Static42.aClass65_597, local662.aClass65_820 }), local766, local576);
													}
												}
											}
											local738 = local58.aClass65Array2;
											if (Static55.aBoolean91) {
												local738 = Static78.method346(local738);
											}
											if (local738 != null) {
												for (local749 = 4; local749 >= 0; local749--) {
													if (local738[local749] != null) {
														local766 = 0;
														if (local749 == 0) {
															local766 = 38;
														}
														if (local749 == 1) {
															local766 = 2;
														}
														if (local749 == 2) {
															local766 = 56;
														}
														if (local749 == 3) {
															local766 = 43;
														}
														if (local749 == 4) {
															local766 = 17;
														}
														Static47.method820(local52 + (arg2 << 16), local662.anInt1822, local738[local749], Static13.method282(new Class65[] { Static42.aClass65_597, local662.aClass65_820 }), local766, local576);
													}
												}
											}
											Static47.method820((arg2 << 16) + local52, local662.anInt1822, Static85.aClass65_1102, Static13.method282(new Class65[] { Static42.aClass65_597, local662.aClass65_820 }), 1002, local576);
										} else if ((Static39.anInt1259 & 0x10) == 16) {
											Static47.method820(local52 + (arg2 << 16), local662.anInt1822, Static80.aClass65_1042, Static13.method282(new Class65[] { Static29.aClass65_387, Static5.aClass65_111, local662.aClass65_820 }), 41, local576);
										}
									}
								}
								local576++;
							}
						}
					}
				} else if (!local58.aBoolean8 || Static110.method1840(arg6, local52) || Static9.aBoolean25) {
					method830(local79 + local58.anInt170, local71 - -local58.anInt161, arg2, arg3, arg4, local79, arg6, local58.anInt192, local52, local71);
					if (local58.anInt153 > local58.anInt170) {
						Static23.method422(arg3, local79, arg4, local58.anInt153, local58.anInt170, local58.anInt161 + local71, arg6, local58);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!fe;II)Lclient!wb;")
	public static Class65 method832(@OriginalArg(0) Class2_Sub8 arg0) {
		try {
			@Pc(12) Class65 local12 = new Class65();
			local12.anInt2878 = arg0.method1376();
			if (local12.anInt2878 > 32767) {
				local12.anInt2878 = 32767;
			}
			local12.aByteArray70 = new byte[local12.anInt2878];
			arg0.anInt2342 += Static74.aClass1_3.method4(local12.anInt2878, local12.aByteArray70, arg0.anInt2342, 0, arg0.aByteArray59);
			return local12;
		} catch (@Pc(51) Exception local51) {
			return Static77.aClass65_1012;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!k;ILclient!k;)I")
	public static int method833(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(20) int local20 = 0;
		if (arg1.method1152(Static105.aClass65_1291, Static101.aClass65_1249)) {
			local20++;
		}
		if (arg0.method1152(Static105.aClass65_1291, Static42.aClass65_595)) {
			local20++;
		}
		if (arg0.method1152(Static105.aClass65_1291, Static95.aClass65_905)) {
			local20++;
		}
		if (arg0.method1152(Static105.aClass65_1291, Static70.aClass65_976)) {
			local20++;
		}
		if (arg0.method1152(Static105.aClass65_1291, Static71.aClass65_999)) {
			local20++;
		}
		return local20;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method835() {
		if (Static68.aClass31_1 != null) {
			Static68.aClass31_1.method1180();
			Static68.aClass31_1 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
	public static boolean method836(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!wb;ILclient!wb;Lclient!k;)[Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3[] method837(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(13) int local13 = arg2.method1149(arg0);
		@Pc(19) int local19 = arg2.method1144(arg1, local13);
		return Static67.method1208(arg2, local13, local19);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
	public static void method839() {
		aClass2_Sub1_Sub4_Sub2_6 = null;
		aClass65_632 = null;
		aClass65_628 = null;
		aClass65_626 = null;
		aClass65_622 = null;
		anIntArray196 = null;
		aClass65_623 = null;
		aClass28_4 = null;
		aClass65_624 = null;
		aClass65_627 = null;
		anIntArray195 = null;
		aClass65_631 = null;
		aClass65_630 = null;
		aClass65_625 = null;
		aClass2_Sub1_Sub4_Sub3_13 = null;
		aClass65_629 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method840(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
