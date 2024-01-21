import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!qa", name = "Y", descriptor = "Lclient!fd;")
	public static Class24 aClass24_26;

	@OriginalMember(owner = "client!qa", name = "hb", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_15;

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "Lclient!je;")
	public static Class40 aClass40_1217 = Static69.method1231("<col=ffffff>");

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
	public static int anInt2332 = -1;

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!qa", name = "pb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1218 = Static69.method1231(":chalreq:");

	@OriginalMember(owner = "client!qa", name = "Gb", descriptor = "Lclient!je;")
	private static Class40 aClass40_1221 = Static69.method1231("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!qa", name = "Eb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1220 = aClass40_1221;

	@OriginalMember(owner = "client!qa", name = "Ib", descriptor = "Lclient!je;")
	private static Class40 aClass40_1222 = Static69.method1231("Unexpected server response");

	@OriginalMember(owner = "client!qa", name = "Qb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1223 = aClass40_1222;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public static void method1658() {
		aClass40_1221 = null;
		aClass40_1217 = null;
		aClass40_1222 = null;
		aClass24_Sub1_15 = null;
		aClass40_1220 = null;
		aClass40_1218 = null;
		aClass24_26 = null;
		aClass40_1223 = null;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)I")
	public static int method1659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static12.method2204(arg1 - 1, arg0 - 1) + Static12.method2204(arg1 - 1, arg0 + 1) + Static12.method2204(arg1 + 1, arg0 + -1) + Static12.method2204(arg1 + 1, arg0 + 1);
		@Pc(81) int local81 = Static12.method2204(arg1, arg0 - 1) + Static12.method2204(arg1, arg0 + 1) + Static12.method2204(arg1 + -1, arg0) + Static12.method2204(arg1 + 1, arg0);
		@Pc(86) int local86 = Static12.method2204(arg1, arg0);
		return local81 / 8 + local42 / 16 + local86 / 4;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1662(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static88.method1593(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static134.aClass59_2.anApplet1 != null) {
				@Pc(109) Class26 local109 = Static134.aClass59_2.method1645(new URL(Static134.aClass59_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static130.anInt3005 + "&u=" + Static33.aLong75 + "&v1=" + Static91.aString4 + "&v2=" + Static91.aString3 + "&e=" + local7));
				while (local109.anInt831 == 0) {
					Static85.method1582(1L);
				}
				if (local109.anInt831 == 1) {
					@Pc(128) DataInputStream local128 = (DataInputStream) local109.anObject2;
					local128.read();
					local128.close();
				}
			}
		} catch (@Pc(135) Exception local135) {
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!na;ILclient!q;I)V")
	public static void method1666(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2) {
		@Pc(9) Class2_Sub10 local9 = new Class2_Sub10();
		local9.anInt1205 = arg0.method640();
		local9.anInt1210 = arg0.method622();
		local9.aByteArrayArrayArray7 = new byte[local9.anInt1205][][];
		local9.aClass26Array2 = new Class26[local9.anInt1205];
		local9.anIntArray134 = new int[local9.anInt1205];
		local9.anIntArray133 = new int[local9.anInt1205];
		local9.aClass26Array1 = new Class26[local9.anInt1205];
		local9.anIntArray130 = new int[local9.anInt1205];
		for (@Pc(61) int local61 = 0; local61 < local9.anInt1205; local61++) {
			try {
				@Pc(67) int local67 = arg0.method640();
				@Pc(93) String local93;
				@Pc(102) String local102;
				@Pc(106) int local106;
				if (local67 == 0 || local67 == 1 || local67 == 2) {
					local93 = new String(arg0.method625().method952());
					local106 = 0;
					local102 = new String(arg0.method625().method952());
					if (local67 == 1) {
						local106 = arg0.method622();
					}
					local9.anIntArray134[local61] = local67;
					local9.anIntArray133[local61] = local106;
					local9.aClass26Array2[local61] = arg2.method1643(local102, Static29.method458(local93));
				} else if (local67 == 3 || local67 == 4) {
					local93 = new String(arg0.method625().method952());
					local102 = new String(arg0.method625().method952());
					local106 = arg0.method640();
					@Pc(109) String[] local109 = new String[local106];
					for (@Pc(111) int local111 = 0; local111 < local106; local111++) {
						local109[local111] = new String(arg0.method625().method952());
					}
					@Pc(131) byte[][] local131 = new byte[local106][];
					@Pc(144) int local144;
					if (local67 == 3) {
						for (@Pc(138) int local138 = 0; local138 < local106; local138++) {
							local144 = arg0.method622();
							local131[local138] = new byte[local144];
							arg0.method643(local131[local138], local144);
						}
					}
					local9.anIntArray134[local61] = local67;
					@Pc(169) Class[] local169 = new Class[local106];
					for (local144 = 0; local144 < local106; local144++) {
						local169[local144] = Static29.method458(local109[local144]);
					}
					local9.aClass26Array1[local61] = arg2.method1639(local169, Static29.method458(local93), local102);
					local9.aByteArrayArrayArray7[local61] = local131;
				}
			} catch (@Pc(260) ClassNotFoundException local260) {
				local9.anIntArray130[local61] = -1;
			} catch (@Pc(267) SecurityException local267) {
				local9.anIntArray130[local61] = -2;
			} catch (@Pc(274) NullPointerException local274) {
				local9.anIntArray130[local61] = -3;
			} catch (@Pc(281) Exception local281) {
				local9.anIntArray130[local61] = -4;
			} catch (@Pc(288) Throwable local288) {
				local9.anIntArray130[local61] = -5;
			}
		}
		Static88.aClass3_14.method75(local9);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hb;[Lclient!ee;IIZ[B)V")
	public static void method1668(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(11) int local11 = -1;
		@Pc(16) Class2_Sub9 local16 = new Class2_Sub9(arg4);
		while (true) {
			@Pc(20) int local20 = local16.method653();
			if (local20 == 0) {
				return;
			}
			local11 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local16.method653();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(49) int local49 = local28 >> 6 & 0x3F;
				@Pc(53) int local53 = local28 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(65) int local65 = local16.method640();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(77) int local77 = local49 + arg3;
				@Pc(81) int local81 = arg2 + local53;
				if (local77 > 0 && local81 > 0 && local77 < 103 && local81 < 103) {
					@Pc(97) int local97 = local57;
					if ((Static66.aByteArrayArrayArray10[1][local77][local81] & 0x2) == 2) {
						local97 = local57 - 1;
					}
					@Pc(111) Class20 local111 = null;
					if (local97 >= 0) {
						local111 = arg1[local97];
					}
					Static15.method239(local69, arg0, local57, local11, local81, local77, local73, local111);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZII)V")
	public static void method1670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static111.anInt2597 == 0 && !Static31.aBoolean53) {
			Static46.method830(arg3 - arg2, -arg1 + arg0, Static43.aClass40_568, 0, 22, Static134.aClass40_804);
		}
		@Pc(32) int local32 = -1;
		for (@Pc(38) int local38 = 0; local38 < Static4.anInt149; local38++) {
			@Pc(44) int local44 = Static4.anIntArray26[local38];
			@Pc(48) int local48 = local44 & 0x7F;
			@Pc(54) int local54 = local44 >> 7 & 0x7F;
			@Pc(60) int local60 = local44 >> 14 & 0x7FFF;
			@Pc(66) int local66 = local44 >> 29 & 0x3;
			if (local44 != local32) {
				local32 = local44;
				@Pc(146) int local146;
				if (local66 == 2 && Static111.aClass30_1.method779(Static105.anInt2531, local48, local54, local44) >= 0) {
					@Pc(85) Class2_Sub1_Sub4 local85 = Static107.method1839(local60);
					if (local85.anIntArray103 != null) {
						local85 = local85.method705();
					}
					if (local85 == null) {
						continue;
					}
					if (Static111.anInt2597 == 1) {
						Static46.method830(local54, local48, Static40.method722(new Class40[] { Static2.aClass40_72, Static55.aClass40_722, local85.aClass40_551 }), local44, 4, Static70.aClass40_936);
					} else if (!Static31.aBoolean53) {
						@Pc(136) Class40[] local136 = local85.aClass40Array3;
						if (Static12.aBoolean249) {
							local136 = Static16.method300(local136);
						}
						if (local136 != null) {
							for (local146 = 4; local146 >= 0; local146--) {
								if (local136[local146] != null) {
									@Pc(158) short local158 = 0;
									if (local146 == 0) {
										local158 = 1;
									}
									if (local146 == 1) {
										local158 = 7;
									}
									if (local146 == 2) {
										local158 = 3;
									}
									if (local146 == 3) {
										local158 = 30;
									}
									if (local146 == 4) {
										local158 = 1002;
									}
									Static46.method830(local54, local48, Static40.method722(new Class40[] { Static5.aClass40_104, local85.aClass40_551 }), local44, local158, local136[local146]);
								}
							}
						}
						Static46.method830(local54, local48, Static40.method722(new Class40[] { Static5.aClass40_104, local85.aClass40_551 }), local85.anInt1030 << 14, 1006, Static111.aClass40_1406);
					} else if ((Static95.anInt2422 & 0x4) == 4) {
						Static46.method830(local54, local48, Static40.method722(new Class40[] { Static118.aClass40_1491, Static55.aClass40_722, local85.aClass40_551 }), local44, 15, Static34.aClass40_471);
					}
				}
				@Pc(303) int local303;
				@Pc(311) Class2_Sub1_Sub1_Sub3_Sub1 local311;
				@Pc(364) Class2_Sub1_Sub1_Sub3_Sub2 local364;
				if (local66 == 1) {
					@Pc(284) Class2_Sub1_Sub1_Sub3_Sub1 local284 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local60];
					if (local284.aClass2_Sub1_Sub11_1.anInt2343 == 1 && (local284.anInt1788 & 0x7F) == 64 && (local284.anInt1792 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static102.anInt2484; local303++) {
							local311 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[Static37.anIntArray97[local303]];
							if (local311 != null && local284 != local311 && local311.aClass2_Sub1_Sub11_1.anInt2343 == 1 && local284.anInt1788 == local311.anInt1788 && local284.anInt1792 == local311.anInt1792) {
								Static47.method866(Static37.anIntArray97[local303], local311.aClass2_Sub1_Sub11_1, local48, local54);
							}
						}
						for (local146 = 0; local146 < Static130.anInt3007; local146++) {
							local364 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static126.anIntArray347[local146]];
							if (local364 != null && local364.anInt1788 == local284.anInt1788 && local364.anInt1792 == local284.anInt1792) {
								Static107.method1837(local364, local54, local48, Static126.anIntArray347[local146]);
							}
						}
					}
					Static47.method866(local60, local284.aClass2_Sub1_Sub11_1, local48, local54);
				}
				if (local66 == 0) {
					@Pc(408) Class2_Sub1_Sub1_Sub3_Sub2 local408 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local60];
					if ((local408.anInt1788 & 0x7F) == 64 && (local408.anInt1792 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static102.anInt2484; local303++) {
							local311 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[Static37.anIntArray97[local303]];
							if (local311 != null && local311.aClass2_Sub1_Sub11_1.anInt2343 == 1 && local408.anInt1788 == local311.anInt1788 && local311.anInt1792 == local408.anInt1792) {
								Static47.method866(Static37.anIntArray97[local303], local311.aClass2_Sub1_Sub11_1, local48, local54);
							}
						}
						for (local146 = 0; local146 < Static130.anInt3007; local146++) {
							local364 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static126.anIntArray347[local146]];
							if (local364 != null && local408 != local364 && local364.anInt1788 == local408.anInt1788 && local408.anInt1792 == local364.anInt1792) {
								Static107.method1837(local364, local54, local48, Static126.anIntArray347[local146]);
							}
						}
					}
					Static107.method1837(local408, local54, local48, local60);
				}
				if (local66 == 3) {
					@Pc(532) Class3 local532 = Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local48][local54];
					if (local532 != null) {
						for (@Pc(539) Class2_Sub1_Sub1_Sub4 local539 = (Class2_Sub1_Sub1_Sub4) local532.method80(); local539 != null; local539 = (Class2_Sub1_Sub1_Sub4) local532.method73()) {
							@Pc(546) Class2_Sub1_Sub10 local546 = Static102.method1800(local539.anInt771);
							if (Static111.anInt2597 == 1) {
								Static46.method830(local54, local48, Static40.method722(new Class40[] { Static2.aClass40_72, Static83.aClass40_1109, local546.aClass40_1161 }), local539.anInt771, 12, Static70.aClass40_936);
							} else if (!Static31.aBoolean53) {
								@Pc(596) Class40[] local596 = local546.aClass40Array15;
								if (Static12.aBoolean249) {
									local596 = Static16.method300(local596);
								}
								for (@Pc(604) int local604 = 4; local604 >= 0; local604--) {
									if (local596 != null && local596[local604] != null) {
										@Pc(618) byte local618 = 0;
										if (local604 == 0) {
											local618 = 49;
										}
										if (local604 == 1) {
											local618 = 44;
										}
										if (local604 == 2) {
											local618 = 29;
										}
										if (local604 == 3) {
											local618 = 24;
										}
										if (local604 == 4) {
											local618 = 26;
										}
										Static46.method830(local54, local48, Static40.method722(new Class40[] { Static112.aClass40_1411, local546.aClass40_1161 }), local539.anInt771, local618, local596[local604]);
									} else if (local604 == 2) {
										Static46.method830(local54, local48, Static40.method722(new Class40[] { Static112.aClass40_1411, local546.aClass40_1161 }), local539.anInt771, 29, Static106.aClass40_1363);
									}
								}
								Static46.method830(local54, local48, Static40.method722(new Class40[] { Static112.aClass40_1411, local546.aClass40_1161 }), local539.anInt771, 1007, Static111.aClass40_1406);
							} else if ((Static95.anInt2422 & 0x1) == 1) {
								Static46.method830(local54, local48, Static40.method722(new Class40[] { Static118.aClass40_1491, Static83.aClass40_1109, local546.aClass40_1161 }), local539.anInt771, 58, Static34.aClass40_471);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(B)V")
	public static void method1671() {
		try {
			if (Static77.anInt2023 == 1) {
				@Pc(12) int local12 = Static129.aClass2_Sub5_Sub4_2.method1983();
				if (local12 > 0 && Static129.aClass2_Sub5_Sub4_2.method1972()) {
					local12 -= Static70.anInt1896;
					if (local12 < 0) {
						local12 = 0;
					}
					Static129.aClass2_Sub5_Sub4_2.method1974(local12);
					return;
				}
				Static129.aClass2_Sub5_Sub4_2.method1967();
				Static129.aClass2_Sub5_Sub4_2.method1965();
				Static93.aClass1_1 = null;
				if (Static122.aClass24_32 == null) {
					Static77.anInt2023 = 0;
				} else {
					Static77.anInt2023 = 2;
				}
				Static29.aClass2_Sub18_1 = null;
			}
		} catch (@Pc(53) Exception local53) {
			local53.printStackTrace();
			Static129.aClass2_Sub5_Sub4_2.method1967();
			Static29.aClass2_Sub18_1 = null;
			Static77.anInt2023 = 0;
			Static122.aClass24_32 = null;
			Static93.aClass1_1 = null;
		}
	}
}
