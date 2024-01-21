import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!se", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "Lclient!bd;")
	public static Class8 aClass8_23;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public static int anInt2364 = 0;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!a;")
	private static Class1 aClass1_2470 = method1596("Message");

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_2468 = aClass1_2470;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
	public static int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!a;")
	public static Class1 aClass1_2469 = method1596("::clientdrop");

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!cb;")
	public static Class11 aClass11_24 = new Class11(64);

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	public static int anInt2376 = 0;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!a;")
	public static Class1 aClass1_2471 = method1596("backvmid1");

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	public static int anInt2377 = -1;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Lclient!a;")
	public static Class1 aClass1_2472 = method1596("Chat panel redrawn");

	@OriginalMember(owner = "client!se", name = "E", descriptor = "[I")
	public static int[] anIntArray295 = new int[2000];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!qd;)V")
	public static void method1594(@OriginalArg(1) Class2_Sub1_Sub14 arg0) {
		@Pc(8) int local8 = arg0.anInt2169;
		@Pc(73) int local73;
		if (local8 >= 1 && local8 <= 100 || local8 >= 701 && local8 <= 800) {
			if (local8 == 1 && Static21.anInt915 == 0) {
				arg0.aClass1_2333 = Static22.aClass1_853;
				arg0.anInt2203 = 0;
			} else if (local8 == 1 && Static21.anInt915 == 1) {
				arg0.aClass1_2333 = Static111.aClass1_2891;
				arg0.anInt2203 = 0;
			} else if (local8 == 2 && Static21.anInt915 != 2) {
				arg0.anInt2203 = 0;
				arg0.aClass1_2333 = Static31.aClass1_1205;
			} else {
				local73 = Static51.anInt1703;
				if (local8 > 700) {
					local8 -= 601;
				} else {
					local8--;
				}
				if (Static21.anInt915 != 2) {
					local73 = 0;
				}
				if (local73 <= local8) {
					arg0.aClass1_2333 = Static111.aClass1_2898;
					arg0.anInt2203 = 0;
				} else {
					arg0.aClass1_2333 = Static100.aClass1Array25[local8];
					arg0.anInt2203 = 1;
				}
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 <= 800) {
				local8 -= 101;
			} else {
				local8 -= 701;
			}
			local73 = Static51.anInt1703;
			if (Static21.anInt915 != 2) {
				local73 = 0;
			}
			if (local8 >= local73) {
				arg0.aClass1_2333 = Static111.aClass1_2898;
				arg0.anInt2203 = 0;
			} else {
				if (Static61.anIntArray197[local8] == 0) {
					arg0.aClass1_2333 = Static97.method1655(new Class1[] { Static46.aClass1_1506, Static54.aClass1_1834 });
				} else if (Static61.anIntArray197[local8] < 5000) {
					if (Static22.anInt921 == Static61.anIntArray197[local8]) {
						arg0.aClass1_2333 = Static97.method1655(new Class1[] { Static84.aClass1_2356, Static47.aClass1_1518, Static43.method994(Static61.anIntArray197[local8]) });
					} else {
						arg0.aClass1_2333 = Static97.method1655(new Class1[] { Static89.aClass1_2440, Static47.aClass1_1518, Static43.method994(Static61.anIntArray197[local8]) });
					}
				} else if (Static61.anIntArray197[local8] == Static22.anInt921) {
					arg0.aClass1_2333 = Static97.method1655(new Class1[] { Static84.aClass1_2356, Static13.aClass1_603, Static43.method994(Static61.anIntArray197[local8] - 5000) });
				} else {
					arg0.aClass1_2333 = Static97.method1655(new Class1[] { Static89.aClass1_2440, Static13.aClass1_603, Static43.method994(Static61.anIntArray197[local8] - 5000) });
				}
				arg0.anInt2203 = 1;
			}
		} else {
			@Pc(319) int local319;
			if (local8 == 203) {
				local319 = Static51.anInt1703;
				if (Static21.anInt915 != 2) {
					local319 = 0;
				}
				arg0.anInt2208 = local319 * 15 + 20;
				if (arg0.anInt2171 >= arg0.anInt2208) {
					arg0.anInt2208 = arg0.anInt2171 + 1;
				}
			} else if (local8 >= 401 && local8 <= 500) {
				local8 -= 401;
				if (local8 == 0 && Static21.anInt915 == 0) {
					arg0.aClass1_2333 = Static82.aClass1_2280;
					arg0.anInt2203 = 0;
				} else if (local8 == 1 && Static21.anInt915 == 0) {
					arg0.aClass1_2333 = Static31.aClass1_1205;
					arg0.anInt2203 = 0;
				} else {
					local319 = Static71.anInt1968;
					if (Static21.anInt915 == 0) {
						local319 = 0;
					}
					if (local319 <= local8) {
						arg0.anInt2203 = 0;
						arg0.aClass1_2333 = Static111.aClass1_2898;
					} else {
						arg0.aClass1_2333 = Static99.method1668(Static88.aLongArray5[local8]).method36();
						arg0.anInt2203 = 1;
					}
				}
			} else if (local8 == 503) {
				arg0.anInt2208 = Static71.anInt1968 * 15 + 20;
				if (arg0.anInt2171 >= arg0.anInt2208) {
					arg0.anInt2208 = arg0.anInt2171 + 1;
				}
			} else if (local8 == 324) {
				if (Static108.anInt2669 == -1) {
					Static108.anInt2669 = arg0.anInt2226;
					Static17.anInt779 = arg0.anInt2188;
				}
				if (Static76.aClass33_2.aBoolean97) {
					arg0.anInt2226 = Static108.anInt2669;
				} else {
					arg0.anInt2226 = Static17.anInt779;
				}
			} else if (local8 == 325) {
				if (Static108.anInt2669 == -1) {
					Static17.anInt779 = arg0.anInt2188;
					Static108.anInt2669 = arg0.anInt2226;
				}
				if (Static76.aClass33_2.aBoolean97) {
					arg0.anInt2226 = Static17.anInt779;
				} else {
					arg0.anInt2226 = Static108.anInt2669;
				}
			} else if (local8 == 327) {
				arg0.anInt2195 = 150;
				arg0.anInt2181 = (int) (Math.sin((double) Static69.anInt2806 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2189 = 0;
				arg0.anInt2193 = 5;
			} else if (local8 == 328) {
				arg0.anInt2195 = 150;
				arg0.anInt2181 = (int) (Math.sin((double) Static69.anInt2806 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2189 = 1;
				arg0.anInt2193 = 5;
			} else if (local8 == 600) {
				arg0.aClass1_2333 = Static97.method1655(new Class1[] { Static111.aClass1_2890, Static104.aClass1_1586 });
			} else if (local8 == 620) {
				if (Static32.anInt1240 < 1) {
					arg0.aClass1_2333 = Static111.aClass1_2898;
				} else if (Static112.aBoolean161) {
					arg0.anInt2173 = 16711680;
					arg0.aClass1_2333 = Static37.aClass1_1312;
				} else {
					arg0.anInt2173 = 16777215;
					arg0.aClass1_2333 = Static77.aClass1_2150;
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!bd;Lclient!bd;)V")
	public static void method1595(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		Static54.aClass8_19 = arg1;
		Static82.aClass8_22 = arg0;
		Static31.anInt1222 = Static82.aClass8_22.method1702(3);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;)Lclient!a;")
	public static Class1 method1596(@OriginalArg(1) String arg0) {
		@Pc(13) byte[] local13 = arg0.getBytes();
		@Pc(16) int local16 = local13.length;
		@Pc(20) Class1 local20 = new Class1();
		@Pc(22) int local22 = 0;
		local20.aByteArray1 = new byte[local16];
		while (local16 > local22) {
			@Pc(34) int local34 = local13[local22++] & 0xFF;
			if (local34 <= 45 && local34 >= 40) {
				if (local22 >= local16) {
					break;
				}
				@Pc(69) int local69 = local13[local22++] & 0xFF;
				local20.aByteArray1[local20.anInt23++] = (byte) (local69 + (local34 + -40) * 43 - 48);
			} else if (local34 != 0) {
				local20.aByteArray1[local20.anInt23++] = (byte) local34;
			}
		}
		local20.method28();
		return local20.method17();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public static void method1597() {
		Static10.aBoolean150 = true;
		Static40.method1081();
		if (Static32.aBoolean54) {
			Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static111.aClass1_2896, 239, 40, 0);
			Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static97.method1655(new Class1[] { Static111.aClass1_2897, Static32.aClass1_1210 }), 239, 60, 128);
		} else if (Static95.anInt2396 == 1) {
			Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static84.aClass1_2361, 239, 40, 0);
			Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static97.method1655(new Class1[] { Static111.aClass1_2886, Static32.aClass1_1210 }), 239, 60, 128);
		} else if (Static95.anInt2396 == 2) {
			Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static41.aClass1_1377, 239, 40, 0);
			Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static97.method1655(new Class1[] { Static111.aClass1_2886, Static32.aClass1_1210 }), 239, 60, 128);
		} else {
			@Pc(71) int local71;
			@Pc(80) int local80;
			@Pc(73) Class2_Sub1_Sub2_Sub1 local73;
			if (Static95.anInt2396 == 3) {
				if (Static111.aClass1_2886 != Static111.aClass1_2885) {
					Static48.method1072(Static111.aClass1_2886);
					Static111.aClass1_2885 = Static111.aClass1_2886;
				}
				local73 = Static88.aClass2_Sub1_Sub2_Sub1_1;
				Static92.method1119(0, 0, 463, 77);
				for (local71 = 0; local71 < Static77.anInt2076; local71++) {
					local80 = local71 * 14 + 18 - Static47.anInt1557;
					if (local80 > 0 && local80 < 110) {
						local73.method371(Static33.aClass1Array11[local71], 239, local80, 0);
					}
				}
				Static92.method1126();
				if (Static77.anInt2076 > 5) {
					Static54.method1221(Static47.anInt1557, Static77.anInt2076 * 14 + 7, 463, 77, 0);
				}
				if (Static111.aClass1_2886.method10() == 0) {
					Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static63.aClass1_1919, 239, 40, 255);
				} else if (Static77.anInt2076 == 0) {
					Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static50.aClass1_1640, 239, 40, 0);
				}
				local73.method371(Static97.method1655(new Class1[] { Static111.aClass1_2886, Static32.aClass1_1210 }), 239, 90, 0);
				Static92.method1123(0, 77, 479, 0);
			} else if (Static55.aClass1_665 == null) {
				@Pc(63) boolean local63;
				if (Static72.anInt1978 != -1) {
					local63 = Static41.method960(Static72.anInt1978, 96, 2, 479);
					if (!local63) {
						Static87.aBoolean137 = true;
					}
				} else if (Static81.anInt2140 == -1) {
					local71 = 0;
					local73 = Static88.aClass2_Sub1_Sub2_Sub1_1;
					Static92.method1119(0, 0, 463, 77);
					for (local80 = 0; local80 < 100; local80++) {
						if (Static67.aClass1Array29[local80] != null) {
							@Pc(90) int local90 = Static111.anIntArray351[local80];
							@Pc(94) Class1 local94 = Static107.aClass1Array28[local80];
							@Pc(103) int local103 = Static44.anInt1515 + 70 - local71 * 14;
							@Pc(105) byte local105 = 0;
							if (local94 != null && local94.method26(Static85.aClass1_2374)) {
								local94 = local94.method1(5);
								local105 = 1;
							}
							if (local94 != null && local94.method26(Static83.aClass1_2344)) {
								local94 = local94.method1(5);
								local105 = 2;
							}
							if (local90 == 0) {
								local71++;
								if (local103 > 0 && local103 < 110) {
									local73.method375(Static67.aClass1Array29[local80], 4, local103, 0);
								}
							}
							@Pc(185) int local185;
							if ((local90 == 1 || local90 == 2) && (local90 == 1 || Static63.anInt1889 == 0 || Static63.anInt1889 == 1 && Static11.method410(local94))) {
								if (local103 > 0 && local103 < 110) {
									local185 = 4;
									if (local105 == 1) {
										Static86.aClass2_Sub1_Sub2_Sub2Array8[0].method637(4, local103 - 12);
										local185 += 14;
									}
									if (local105 == 2) {
										Static86.aClass2_Sub1_Sub2_Sub2Array8[1].method637(local185, local103 - 12);
										local185 += 14;
									}
									local73.method375(Static97.method1655(new Class1[] { local94, Static72.aClass1_2045 }), local185, local103, 0);
									local185 += local73.method370(local94) + 8;
									local73.method375(Static67.aClass1Array29[local80], local185, local103, 255);
								}
								local71++;
							}
							if ((local90 == 3 || local90 == 7) && Static5.anInt403 == 0 && (local90 == 7 || Static6.anInt409 == 0 || Static6.anInt409 == 1 && Static11.method410(local94))) {
								local71++;
								if (local103 > 0 && local103 < 110) {
									local73.method375(Static41.aClass1_1380, 4, local103, 0);
									local185 = local73.method370(Static41.aClass1_1380) + 4;
									local185 += local73.method374(32);
									if (local105 == 1) {
										Static86.aClass2_Sub1_Sub2_Sub2Array8[0].method637(local185, local103 - 12);
										local185 += 14;
									}
									if (local105 == 2) {
										Static86.aClass2_Sub1_Sub2_Sub2Array8[1].method637(local185, local103 - 12);
										local185 += 14;
									}
									local73.method375(Static97.method1655(new Class1[] { local94, Static72.aClass1_2045 }), local185, local103, 0);
									local185 += local73.method370(local94) + 8;
									local73.method375(Static67.aClass1Array29[local80], local185, local103, 8388608);
								}
							}
							if (local90 == 4 && (Static96.anInt2420 == 0 || Static96.anInt2420 == 1 && Static11.method410(local94))) {
								local71++;
								if (local103 > 0 && local103 < 110) {
									local73.method375(Static97.method1655(new Class1[] { local94, Static81.aClass1_2273, Static67.aClass1Array29[local80] }), 4, local103, 8388736);
								}
							}
							if (local90 == 5 && Static5.anInt403 == 0 && Static6.anInt409 < 2) {
								if (local103 > 0 && local103 < 110) {
									local73.method375(Static67.aClass1Array29[local80], 4, local103, 8388608);
								}
								local71++;
							}
							if (local90 == 6 && Static5.anInt403 == 0 && Static6.anInt409 < 2) {
								if (local103 > 0 && local103 < 110) {
									local73.method375(Static97.method1655(new Class1[] { Static14.aClass1_650, Static81.aClass1_2273, local94, Static72.aClass1_2045 }), 4, local103, 0);
									local73.method375(Static67.aClass1Array29[local80], local73.method370(Static97.method1655(new Class1[] { Static14.aClass1_650, Static81.aClass1_2273, local94 })) + 12, local103, 8388608);
								}
								local71++;
							}
							if (local90 == 8 && (Static96.anInt2420 == 0 || Static96.anInt2420 == 1 && Static11.method410(local94))) {
								local71++;
								if (local103 > 0 && local103 < 110) {
									local73.method375(Static97.method1655(new Class1[] { local94, Static81.aClass1_2273, Static67.aClass1Array29[local80] }), 4, local103, 8270336);
								}
							}
						}
					}
					Static92.method1126();
					Static103.anInt2618 = local71 * 14 + 7;
					if (Static103.anInt2618 < 78) {
						Static103.anInt2618 = 78;
					}
					Static54.method1221(Static103.anInt2618 - Static44.anInt1515 - 77, Static103.anInt2618, 463, 77, 0);
					@Pc(579) Class1 local579;
					if (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1 == null || Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass1_264 == null) {
						local579 = Static104.aClass1_1593;
					} else {
						local579 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass1_264;
					}
					local73.method375(Static97.method1655(new Class1[] { local579, Static72.aClass1_2045 }), 4, 90, 0);
					local73.method375(Static97.method1655(new Class1[] { Static111.aClass1_2894, Static32.aClass1_1210 }), local73.method370(Static97.method1655(new Class1[] { local579, Static34.aClass1_1236 })) + 6, 90, 255);
					Static92.method1123(0, 77, 479, 0);
				} else {
					local63 = Static41.method960(Static81.anInt2140, 96, 3, 479);
					if (!local63) {
						Static87.aBoolean137 = true;
					}
				}
			} else {
				Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static55.aClass1_665, 239, 40, 0);
				Static97.aClass2_Sub1_Sub2_Sub1_3.method371(Static62.aClass1_1909, 239, 60, 128);
			}
		}
		if (Static6.aBoolean11 && Static18.anInt835 == 2) {
			Static41.method965();
		}
		Static76.method1441();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!bd;ZLclient!bd;)V")
	public static void method1598(@OriginalArg(1) Class8 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class8 arg2) {
		Static20.aClass8_8 = arg2;
		Static63.aBoolean101 = arg1;
		Static1.aClass8_1 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method1599() {
		aClass1_2468 = null;
		anIntArray295 = null;
		aByteArrayArray9 = null;
		aClass1_2470 = null;
		aClass1_2471 = null;
		aClass11_24 = null;
		anIntArray294 = null;
		aByteArrayArray8 = null;
		aClass1_2472 = null;
		aClass1_2469 = null;
		aClass8_23 = null;
	}
}
