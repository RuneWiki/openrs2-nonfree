import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_14;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_15;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static volatile int anInt1721 = 0;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt1722 = 2;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!ad;")
	private static Class4 aClass4_911 = Static75.method1216("Enter object name");

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_912 = Static75.method1216("hitmarks");

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_913 = Static75.method1216("Lade Texturen )2 ");

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_914 = Static75.method1216("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	public static int anInt1729 = 0;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_915 = aClass4_911;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "Lclient!ad;")
	public static Class4 aClass4_916 = Static75.method1216("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ad;B)V")
	private static void method1158(@OriginalArg(0) Class4 arg0) {
		if (arg0 == null || arg0.method118() == 0) {
			Static47.anInt1179 = 0;
			return;
		}
		@Pc(24) Class4 local24 = arg0;
		@Pc(27) Class4[] local27 = new Class4[100];
		@Pc(29) int local29 = 0;
		while (true) {
			@Pc(34) int local34 = local24.method146();
			if (local34 == -1) {
				local24 = local24.method124();
				if (local24.method118() > 0) {
					local27[local29++] = local24.method153();
				}
				Static47.anInt1179 = 0;
				label46: for (local34 = 0; local34 < Static35.anInt672; local34++) {
					@Pc(91) Class3_Sub1_Sub2 local91 = Static3.method1550(local34);
					if (local91.anInt732 == -1 && local91.aClass4_347 != null) {
						@Pc(104) Class4 local104 = local91.aClass4_347.method153();
						for (@Pc(106) int local106 = 0; local106 < local29; local106++) {
							if (local104.method117(local27[local106]) == -1) {
								continue label46;
							}
						}
						Static9.aClass4Array1[Static47.anInt1179] = local104;
						Static10.anIntArray12[Static47.anInt1179] = local34;
						Static47.anInt1179++;
						if (Static47.anInt1179 >= Static9.aClass4Array1.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(45) Class4 local45 = local24.method136(0, local34).method124();
			if (local45.method118() > 0) {
				local27[local29++] = local45.method153();
			}
			local24 = local24.method137(local34 + 1);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1159() {
		aClass4_913 = null;
		aClass4_911 = null;
		aClass4_914 = null;
		aClass4_916 = null;
		aClass4_912 = null;
		anIntArray234 = null;
		aClass4_915 = null;
		aClass64_Sub1_15 = null;
		aClass64_Sub1_14 = null;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method1162() {
		for (@Pc(7) int local7 = 0; local7 < Static95.anInt2230; local7++) {
			@Pc(13) int local13 = Static12.anIntArray13[local7];
			@Pc(17) Class3_Sub1_Sub1_Sub1_Sub1 local17 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local13];
			@Pc(21) int local21 = Static32.aClass3_Sub4_Sub1_2.method446();
			@Pc(32) int local32;
			@Pc(36) int local36;
			if ((local21 & 0x1) != 0) {
				local32 = Static32.aClass3_Sub4_Sub1_2.method421();
				local36 = Static32.aClass3_Sub4_Sub1_2.method451();
				local17.method1547(Static60.anInt1489, local36, local32);
				local17.anInt2328 = Static60.anInt1489 + 300;
				local17.anInt2344 = Static32.aClass3_Sub4_Sub1_2.method449();
				local17.anInt2292 = Static32.aClass3_Sub4_Sub1_2.method421();
			}
			if ((local21 & 0x4) != 0) {
				local17.anInt2288 = Static32.aClass3_Sub4_Sub1_2.method414();
				if (local17.anInt2288 == 65535) {
					local17.anInt2288 = -1;
				}
			}
			if ((local21 & 0x10) != 0) {
				local17.aClass4_1294 = Static32.aClass3_Sub4_Sub1_2.method417();
				local17.anInt2330 = 100;
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt2335 = Static32.aClass3_Sub4_Sub1_2.method439();
				local32 = Static32.aClass3_Sub4_Sub1_2.method415();
				local17.anInt2309 = 0;
				local17.anInt2323 = local32 >> 16;
				if (local17.anInt2335 == 65535) {
					local17.anInt2335 = -1;
				}
				local17.anInt2338 = 0;
				local17.anInt2340 = Static60.anInt1489 + (local32 & 0xFFFF);
				if (Static60.anInt1489 < local17.anInt2340) {
					local17.anInt2338 = -1;
				}
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt2302 = Static32.aClass3_Sub4_Sub1_2.method459();
				local17.anInt2345 = Static32.aClass3_Sub4_Sub1_2.method452();
			}
			if ((local21 & 0x8) != 0) {
				local32 = Static32.aClass3_Sub4_Sub1_2.method452();
				if (local32 == 65535) {
					local32 = -1;
				}
				local36 = Static32.aClass3_Sub4_Sub1_2.method421();
				if (local32 == local17.anInt2320 && local32 != -1) {
					@Pc(186) int local186 = Static67.method1107(local32).anInt1596;
					if (local186 == 1) {
						local17.anInt2318 = local36;
						local17.anInt2297 = 0;
						local17.anInt2339 = 0;
						local17.anInt2286 = 0;
					}
					if (local186 == 2) {
						local17.anInt2286 = 0;
					}
				} else if (local32 == -1 || local17.anInt2320 == -1 || Static67.method1107(local32).anInt1590 >= Static67.method1107(local17.anInt2320).anInt1590) {
					local17.anInt2320 = local32;
					local17.anInt2315 = local17.anInt2317;
					local17.anInt2297 = 0;
					local17.anInt2318 = local36;
					local17.anInt2339 = 0;
					local17.anInt2286 = 0;
				}
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass3_Sub1_Sub17_1 = Static44.method810(Static32.aClass3_Sub4_Sub1_2.method414());
				local17.anInt2347 = local17.aClass3_Sub1_Sub17_1.anInt2495;
				local17.anInt2314 = local17.aClass3_Sub1_Sub17_1.anInt2496;
				local17.anInt2312 = local17.aClass3_Sub1_Sub17_1.anInt2499;
				local17.anInt2291 = local17.aClass3_Sub1_Sub17_1.anInt2523;
				local17.anInt2322 = local17.aClass3_Sub1_Sub17_1.anInt2493;
				local17.anInt2305 = local17.aClass3_Sub1_Sub17_1.anInt2519;
				local17.anInt2307 = local17.aClass3_Sub1_Sub17_1.anInt2498;
				local17.anInt2306 = local17.aClass3_Sub1_Sub17_1.anInt2504;
				local17.anInt2319 = local17.aClass3_Sub1_Sub17_1.anInt2516;
			}
			if ((local21 & 0x80) != 0) {
				local32 = Static32.aClass3_Sub4_Sub1_2.method421();
				local36 = Static32.aClass3_Sub4_Sub1_2.method421();
				local17.method1547(Static60.anInt1489, local36, local32);
				local17.anInt2328 = Static60.anInt1489 + 300;
				local17.anInt2344 = Static32.aClass3_Sub4_Sub1_2.method446();
				local17.anInt2292 = Static32.aClass3_Sub4_Sub1_2.method446();
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIZI)V")
	public static void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static64.aClass3_Sub1_Sub4_Sub3Array4[0].method1771(arg1, arg3);
		Static64.aClass3_Sub1_Sub4_Sub3Array4[1].method1771(arg1, arg3 + arg0 - 16);
		Static50.method1840(arg1, arg3 + 16, 16, arg0 - 32, Static113.anInt2856);
		@Pc(38) int local38 = (arg0 - 32) * arg0 / arg2;
		if (local38 < 8) {
			local38 = 8;
		}
		@Pc(59) int local59 = (arg0 - local38 - 32) * arg4 / (arg2 - arg0);
		Static50.method1840(arg1, arg3 + local59 + 16, 16, local38, Static24.anInt687);
		Static50.method1846(arg1, local59 + arg3 + 16, local38, Static113.anInt2857);
		Static50.method1846(arg1 + 1, local59 + 16 + arg3, local38, Static113.anInt2857);
		Static50.method1841(arg1, local59 + arg3 + 16, 16, Static113.anInt2857);
		Static50.method1841(arg1, local59 + arg3 + 17, 16, Static113.anInt2857);
		Static50.method1846(arg1 + 15, local59 + 16 + arg3, local38, Static13.anInt346);
		Static50.method1846(arg1 + 14, local59 + 17 + arg3, local38 - 1, Static13.anInt346);
		Static50.method1841(arg1, local59 + arg3 + local38 + 15, 16, Static13.anInt346);
		Static50.method1841(arg1 + 1, local38 + 14 + arg3 + local59, 15, Static13.anInt346);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!gd;)V")
	public static void method1164(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class31 arg1) {
		if (Static54.aClass31_4 != null) {
			try {
				Static54.aClass31_4.method717();
			} catch (@Pc(8) Exception local8) {
			}
			Static54.aClass31_4 = null;
		}
		Static54.aClass31_4 = arg1;
		Static70.method1137(arg0);
		Static23.aClass3_Sub4_2.anInt627 = 0;
		Static66.aClass3_Sub4_4 = null;
		Static104.anInt2548 = 0;
		Static86.aClass3_Sub1_Sub16_1 = null;
		while (true) {
			@Pc(38) Class3_Sub1_Sub16 local38 = (Class3_Sub1_Sub16) Static39.aClass34_4.method794();
			if (local38 == null) {
				while (true) {
					local38 = (Class3_Sub1_Sub16) Static28.aClass34_3.method794();
					if (local38 == null) {
						if (Static98.aByte3 != 0) {
							try {
								@Pc(90) Class3_Sub4 local90 = new Class3_Sub4(4);
								local90.method423(4);
								local90.method423(Static98.aByte3);
								local90.method455(0);
								Static54.aClass31_4.method716(4, local90.aByteArray4);
							} catch (@Pc(113) IOException local113) {
								try {
									Static54.aClass31_4.method717();
								} catch (@Pc(120) Exception local120) {
								}
								Static31.anInt958++;
								Static54.aClass31_4 = null;
							}
						}
						Static82.anInt1918 = 0;
						Static19.aLong13 = Static82.method1291();
						return;
					}
					Static51.aClass56_2.method1192(local38);
					Static92.aClass34_6.method792(local38.aLong88, local38);
					Static9.anInt317++;
					Static68.anInt1664--;
				}
			}
			Static55.aClass34_5.method792(local38.aLong88, local38);
			Static106.anInt2654++;
			Static46.anInt2739--;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lclient!ad;")
	public static Class4 method1165(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(43) byte[] local43 = new byte[local25];
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local25--;
				local43[local25] = Static6.aByteArray2[(int) (local50 - arg0 * 37L)];
			}
			@Pc(75) Class4 local75 = new Class4();
			local75.aByteArray1 = local43;
			local75.anInt238 = local43.length;
			return local75;
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public static void method1166() {
		Static42.aBoolean80 = true;
		Static54.method901();
		if (Static58.aBoolean103) {
			Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static113.aClass4_1601, 239, 40, 0);
			Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static60.method1012(new Class4[] { Static113.aClass4_1605, Static38.aClass4_1577 }), 239, 60, 128);
		} else if (Static85.anInt1991 == 1) {
			Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static75.aClass4_995, 239, 40, 0);
			Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static60.method1012(new Class4[] { Static113.aClass4_1603, Static38.aClass4_1577 }), 239, 60, 128);
		} else if (Static85.anInt1991 == 2) {
			Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static88.aClass4_1149, 239, 40, 0);
			Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static60.method1012(new Class4[] { Static113.aClass4_1603, Static38.aClass4_1577 }), 239, 60, 128);
		} else {
			@Pc(36) Class3_Sub1_Sub4_Sub4 local36;
			@Pc(43) int local43;
			@Pc(55) int local55;
			if (Static85.anInt1991 == 3) {
				if (Static113.aClass4_1600 != Static113.aClass4_1603) {
					method1158(Static113.aClass4_1603);
					Static113.aClass4_1600 = Static113.aClass4_1603;
				}
				local36 = Static71.aClass3_Sub1_Sub4_Sub4_2;
				Static50.method1851(0, 0, 463, 77);
				for (local43 = 0; local43 < Static47.anInt1179; local43++) {
					local55 = local43 * 14 + 18 - Static60.anInt1472;
					if (local55 > 0 && local55 < 110) {
						local36.method1869(Static9.aClass4Array1[local43], 239, local55, 0);
					}
				}
				Static50.method1847();
				if (Static47.anInt1179 > 5) {
					method1163(77, 463, Static47.anInt1179 * 14 + 7, 0, Static60.anInt1472);
				}
				if (Static113.aClass4_1603.method118() == 0) {
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(aClass4_915, 239, 40, 255);
				} else if (Static47.anInt1179 == 0) {
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static34.aClass4_520, 239, 40, 0);
				}
				local36.method1869(Static60.method1012(new Class4[] { Static113.aClass4_1603, Static38.aClass4_1577 }), 239, 90, 0);
				Static50.method1841(0, 77, 479, 0);
			} else if (Static29.aClass4_444 == null) {
				@Pc(167) boolean local167;
				if (Static6.anInt259 != -1) {
					local167 = Static73.method1186(96, 479, 2, Static6.anInt259);
					if (!local167) {
						Static86.aBoolean153 = true;
					}
				} else if (Static77.anInt1841 == -1) {
					local36 = Static71.aClass3_Sub1_Sub4_Sub4_2;
					Static50.method1851(0, 0, 463, 77);
					local43 = 0;
					for (local55 = 0; local55 < 100; local55++) {
						if (Static83.aClass4Array15[local55] != null) {
							@Pc(194) int local194 = Static42.anIntArray157[local55];
							@Pc(204) int local204 = Static24.anInt681 + 70 - local43 * 14;
							@Pc(208) Class4 local208 = Static100.aClass4Array18[local55];
							@Pc(210) byte local210 = 0;
							if (local208 != null && local208.method132(Static93.aClass4_1336)) {
								local208 = local208.method137(5);
								local210 = 1;
							}
							if (local208 != null && local208.method132(Static75.aClass4_996)) {
								local210 = 2;
								local208 = local208.method137(5);
							}
							if (local194 == 0) {
								local43++;
								if (local204 > 0 && local204 < 110) {
									local36.method1866(Static83.aClass4Array15[local55], 4, local204, 0);
								}
							}
							@Pc(287) int local287;
							if ((local194 == 1 || local194 == 2) && (local194 == 1 || Static58.anInt1429 == 0 || Static58.anInt1429 == 1 && Static111.method1898(local208))) {
								if (local204 > 0 && local204 < 110) {
									local287 = 4;
									if (local210 == 1) {
										Static100.aClass3_Sub1_Sub4_Sub3Array5[0].method1771(4, local204 - 12);
										local287 += 14;
									}
									if (local210 == 2) {
										Static100.aClass3_Sub1_Sub4_Sub3Array5[1].method1771(local287, local204 - 12);
										local287 += 14;
									}
									local36.method1866(Static60.method1012(new Class4[] { local208, Static25.aClass4_352 }), local287, local204, 0);
									local287 += local36.method1859(local208) + 8;
									local36.method1866(Static83.aClass4Array15[local55], local287, local204, 255);
								}
								local43++;
							}
							if ((local194 == 3 || local194 == 7) && Static112.anInt2829 == 0 && (local194 == 7 || Static55.anInt1391 == 0 || Static55.anInt1391 == 1 && Static111.method1898(local208))) {
								if (local204 > 0 && local204 < 110) {
									local36.method1866(Static45.aClass4_586, 4, local204, 0);
									local287 = local36.method1859(Static45.aClass4_586) + 4;
									local287 += local36.method1864(32);
									if (local210 == 1) {
										Static100.aClass3_Sub1_Sub4_Sub3Array5[0].method1771(local287, local204 - 12);
										local287 += 14;
									}
									if (local210 == 2) {
										Static100.aClass3_Sub1_Sub4_Sub3Array5[1].method1771(local287, local204 - 12);
										local287 += 14;
									}
									local36.method1866(Static60.method1012(new Class4[] { local208, Static25.aClass4_352 }), local287, local204, 0);
									local287 += local36.method1859(local208) + 8;
									local36.method1866(Static83.aClass4Array15[local55], local287, local204, 8388608);
								}
								local43++;
							}
							if (local194 == 4 && (Static44.anInt1146 == 0 || Static44.anInt1146 == 1 && Static111.method1898(local208))) {
								if (local204 > 0 && local204 < 110) {
									local36.method1866(Static60.method1012(new Class4[] { local208, Static23.aClass4_260, Static83.aClass4Array15[local55] }), 4, local204, 8388736);
								}
								local43++;
							}
							if (local194 == 5 && Static112.anInt2829 == 0 && Static55.anInt1391 < 2) {
								if (local204 > 0 && local204 < 110) {
									local36.method1866(Static83.aClass4Array15[local55], 4, local204, 8388608);
								}
								local43++;
							}
							if (local194 == 6 && Static112.anInt2829 == 0 && Static55.anInt1391 < 2) {
								if (local204 > 0 && local204 < 110) {
									local36.method1866(Static60.method1012(new Class4[] { Static82.aClass4_1075, Static23.aClass4_260, local208, Static25.aClass4_352 }), 4, local204, 0);
									local36.method1866(Static83.aClass4Array15[local55], local36.method1859(Static60.method1012(new Class4[] { Static82.aClass4_1075, Static23.aClass4_260, local208 })) + 12, local204, 8388608);
								}
								local43++;
							}
							if (local194 == 8 && (Static44.anInt1146 == 0 || Static44.anInt1146 == 1 && Static111.method1898(local208))) {
								local43++;
								if (local204 > 0 && local204 < 110) {
									local36.method1866(Static60.method1012(new Class4[] { local208, Static23.aClass4_260, Static83.aClass4Array15[local55] }), 4, local204, 8270336);
								}
							}
						}
					}
					Static50.method1847();
					Static93.anInt2443 = local43 * 14 + 7;
					if (Static93.anInt2443 < 78) {
						Static93.anInt2443 = 78;
					}
					method1163(77, 463, Static93.anInt2443, 0, Static93.anInt2443 - Static24.anInt681 - 77);
					@Pc(692) Class4 local692;
					if (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1 == null || Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass4_1302 == null) {
						local692 = Static95.aClass4_1260;
					} else {
						local692 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass4_1302;
					}
					local36.method1866(Static60.method1012(new Class4[] { local692, Static25.aClass4_352 }), 4, 90, 0);
					local36.method1866(Static60.method1012(new Class4[] { Static113.aClass4_1606, Static38.aClass4_1577 }), local36.method1859(Static60.method1012(new Class4[] { local692, Static4.aClass4_104 })) + 6, 90, 255);
					Static50.method1841(0, 77, 479, 0);
				} else {
					local167 = Static73.method1186(96, 479, 3, Static77.anInt1841);
					if (!local167) {
						Static86.aBoolean153 = true;
					}
				}
			} else {
				Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static29.aClass4_444, 239, 40, 0);
				Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(Static104.aClass4_1403, 239, 60, 128);
			}
		}
		if (Static106.aBoolean231 && Static76.anInt1815 == 2) {
			Static104.method1698();
		}
		Static24.method466();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method1167() {
		Static30.anInt942++;
		Static82.method1294(true);
		Static7.method172(true);
		Static82.method1294(false);
		Static7.method172(false);
		Static20.method293();
		Static103.method1694();
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (!Static103.aBoolean217) {
			local29 = Static60.anInt1493;
			local36 = Static109.anInt2749 + Static65.anInt1627 & 0x7FF;
			if (local29 < Static103.anInt2540 / 256) {
				local29 = Static103.anInt2540 / 256;
			}
			if (Static3.aBooleanArray14[4] && Static4.anIntArray8[4] + 128 > local29) {
				local29 = Static4.anIntArray8[4] + 128;
			}
			Static68.method1119(Static76.anInt1817, local29 * 3 + 600, Static82.method1293(Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342, Static49.anInt1203, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348) - 50, Static92.anInt2091, local36, local29);
		}
		if (Static103.aBoolean217) {
			local29 = Static92.method1426();
		} else {
			local29 = Static8.method193();
		}
		local36 = Static113.anInt2853;
		@Pc(96) int local96 = Static61.anInt1536;
		@Pc(98) int local98 = Static9.anInt314;
		@Pc(100) int local100 = Static106.anInt2666;
		@Pc(102) int local102 = Static47.anInt1186;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static3.aBooleanArray14[local104]) {
				@Pc(145) int local145 = (int) ((double) (Static44.anIntArray159[local104] * 2 + 1) * Math.random() - (double) Static44.anIntArray159[local104] + Math.sin((double) Static60.anIntArray211[local104] * ((double) Static36.anIntArray99[local104] / 100.0D)) * (double) Static4.anIntArray8[local104]);
				if (local104 == 3) {
					Static47.anInt1186 = Static47.anInt1186 + local145 & 0x7FF;
				}
				if (local104 == 0) {
					Static113.anInt2853 += local145;
				}
				if (local104 == 2) {
					Static9.anInt314 += local145;
				}
				if (local104 == 1) {
					Static61.anInt1536 += local145;
				}
				if (local104 == 4) {
					Static106.anInt2666 += local145;
					if (Static106.anInt2666 < 128) {
						Static106.anInt2666 = 128;
					}
					if (Static106.anInt2666 > 383) {
						Static106.anInt2666 = 383;
					}
				}
			}
		}
		Static12.method214();
		Static41.anInt1123 = Static78.anInt420 - 4;
		Static41.aBoolean79 = true;
		Static41.anInt1119 = Static22.anInt496 - 4;
		Static41.anInt1120 = 0;
		Static50.method1842();
		Static38.aClass61_30.method1327(Static113.anInt2853, Static61.anInt1536, Static9.anInt314, Static106.anInt2666, Static47.anInt1186, local29);
		Static38.aClass61_30.method1349();
		Static77.method1240();
		Static89.method1403();
		((Class44) Static99.anInterface2_1).method965(Static85.anInt1995);
		Static5.method144();
		if (Static100.aBoolean209 && Static6.method163() == 0) {
			Static100.aBoolean209 = false;
		}
		if (Static100.aBoolean209) {
			Static12.method214();
			Static50.method1842();
			Static63.method1086(false, Static60.aClass4_756, null);
		}
		Static52.method884();
		Static113.anInt2853 = local36;
		Static61.anInt1536 = local96;
		Static9.anInt314 = local98;
		Static47.anInt1186 = local102;
		Static106.anInt2666 = local100;
	}
}
