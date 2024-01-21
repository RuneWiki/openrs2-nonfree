import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "Lclient!ff;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "Lclient!nd;")
	public static Class1_Sub1_Sub11 aClass1_Sub1_Sub11_4;

	@OriginalMember(owner = "client!sa", name = "qb", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_16;

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1382 = Static69.method1153("Message");

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1378 = aClass64_1382;

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1379 = Static69.method1153("Use");

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1380 = aClass64_1379;

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
	public static int anInt2166 = 0;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1381 = Static69.method1153("Loading )2 please wait)3");

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
	public static int anInt2167 = 0;

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "[I")
	public static int[] anIntArray315 = new int[500];

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "[I")
	public static int[] anIntArray316 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
	public static int anInt2170 = 0;

	@OriginalMember(owner = "client!sa", name = "tb", descriptor = "I")
	public static int anInt2172 = 1;

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "[I")
	public static int[] anIntArray317 = new int[1000];

	@OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
	public static int anInt2173 = 0;

	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
	public static int anInt2177 = -1;

	@OriginalMember(owner = "client!sa", name = "Bb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1383 = Static69.method1153("::gc");

	@OriginalMember(owner = "client!sa", name = "Fb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1384 = aClass64_1381;

	@OriginalMember(owner = "client!sa", name = "Gb", descriptor = "I")
	public static int anInt2181 = 0;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
	public static void method1558() {
		Static89.anInt2034++;
		Static13.method286(true);
		Static105.method1721(true);
		Static13.method286(false);
		Static105.method1721(false);
		Static81.method1061();
		Static106.method1742();
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (!Static9.aBoolean21) {
			local29 = Static72.anInt1640;
			local35 = Static74.anInt1750 + Static75.anInt1770 & 0x7FF;
			if (local29 < Static75.anInt1773 / 256) {
				local29 = Static75.anInt1773 / 256;
			}
			if (Static22.aBooleanArray4[4] && Static65.anIntArray230[4] + 128 > local29) {
				local29 = Static65.anIntArray230[4] + 128;
			}
			method1567(Static90.anInt545, local29, local35, Static114.method1996(Static15.anInt463, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412) - 50, Static101.anInt2273, local29 * 3 + 600);
		}
		if (Static9.aBoolean21) {
			local29 = Static18.method360();
		} else {
			local29 = Static55.method2071();
		}
		local35 = Static119.anInt2846;
		@Pc(103) int local103 = Static80.anInt1899;
		@Pc(105) int local105 = Static106.anInt2503;
		@Pc(107) int local107 = Static72.anInt1642;
		@Pc(109) int local109 = Static116.anInt2779;
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			if (Static22.aBooleanArray4[local111]) {
				@Pc(152) int local152 = (int) (Math.random() * (double) (Static45.anIntArray157[local111] * 2 + 1) - (double) Static45.anIntArray157[local111] + Math.sin((double) Static109.anIntArray382[local111] / 100.0D * (double) Static22.anIntArray84[local111]) * (double) Static65.anIntArray230[local111]);
				if (local111 == 0) {
					Static119.anInt2846 += local152;
				}
				if (local111 == 4) {
					Static72.anInt1642 += local152;
					if (Static72.anInt1642 < 128) {
						Static72.anInt1642 = 128;
					}
					if (Static72.anInt1642 > 383) {
						Static72.anInt1642 = 383;
					}
				}
				if (local111 == 1) {
					Static106.anInt2503 += local152;
				}
				if (local111 == 3) {
					Static116.anInt2779 = local152 + Static116.anInt2779 & 0x7FF;
				}
				if (local111 == 2) {
					Static80.anInt1899 += local152;
				}
			}
		}
		Static49.method891();
		Static111.anInt2690 = Static63.anInt1474 - 4;
		Static111.anInt2691 = 0;
		Static111.aBoolean158 = true;
		Static111.anInt2688 = Static81.anInt1404 - 4;
		Static47.method1948();
		Static82.aClass68_1.method1791(Static119.anInt2846, Static106.anInt2503, Static80.anInt1899, Static72.anInt1642, Static116.anInt2779, local29);
		Static82.aClass68_1.method1777();
		Static82.method1384();
		Static5.method138();
		((Class71) Static112.anInterface2_1).method2098(Static113.anInt1815);
		Static20.method403();
		if (Static45.aBoolean66 && Static37.method667() == 0) {
			Static45.aBoolean66 = false;
		}
		if (Static45.aBoolean66) {
			Static49.method891();
			Static47.method1948();
			Static74.method1233(null, false, aClass64_1384);
		}
		Static80.method1368();
		Static72.anInt1642 = local107;
		Static106.anInt2503 = local105;
		Static116.anInt2779 = local109;
		Static80.anInt1899 = local103;
		Static119.anInt2846 = local35;
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
	public static void method1559() {
		aClass64_1379 = null;
		aClass41_Sub1_16 = null;
		anIntArray316 = null;
		anIntArray317 = null;
		aClass64_1383 = null;
		aClass27_4 = null;
		aClass64_1380 = null;
		anIntArray315 = null;
		aClass64_1384 = null;
		aClass64_1378 = null;
		aClass1_Sub1_Sub11_4 = null;
		aClass64_1382 = null;
		aClass64_1381 = null;
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
	public static void method1560() {
		if (Static48.anInt2603 < 2 && Static121.anInt2872 == 0 && !Static103.aBoolean143) {
			return;
		}
		@Pc(49) Class64 local49;
		if (Static121.anInt2872 == 1 && Static48.anInt2603 < 2) {
			local49 = Static82.method1383(new Class64[] { aClass64_1380, Static52.aClass64_1821, Static13.aClass64_304, Static82.aClass64_1175 });
		} else if (Static103.aBoolean143 && Static48.anInt2603 < 2) {
			local49 = Static82.method1383(new Class64[] { Static98.aClass64_1399, Static52.aClass64_1821, Static27.aClass64_579, Static82.aClass64_1175 });
		} else {
			local49 = Static101.aClass64Array16[Static48.anInt2603 - 1];
		}
		if (Static48.anInt2603 > 2) {
			local49 = Static82.method1383(new Class64[] { local49, Static113.aClass64_1115, Static12.method1395(Static48.anInt2603 - 2), Static62.aClass64_905 });
		}
		Static17.aClass1_Sub1_Sub5_Sub1_2.method646(local49, 4, 16777215, Static15.anInt471 / 1000);
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)Z")
	public static boolean method1561() {
		@Pc(8) long local8 = Static80.method1369();
		@Pc(13) int local13 = (int) (local8 - Static38.aLong31);
		if (local13 > 200) {
			local13 = 200;
		}
		Static38.aLong31 = local8;
		Static53.anInt1231 += local13;
		if (Static98.anInt2200 == 0 && Static39.anInt915 == 0 && Static75.anInt1766 == 0 && Static121.anInt2873 == 0) {
			return true;
		} else if (Static53.aClass27_3 == null) {
			return false;
		} else {
			try {
				if (Static53.anInt1231 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class1_Sub1_Sub16 local61;
				@Pc(66) Class1_Sub6 local66;
				while (Static39.anInt915 < 20 && Static121.anInt2873 > 0) {
					local61 = (Class1_Sub1_Sub16) Static110.aClass58_7.method1373();
					local66 = new Class1_Sub6(4);
					local66.method1853(1);
					local66.method1838((int) local61.aLong87);
					Static53.aClass27_3.method560(4, local66.aByteArray27);
					Static93.aClass58_6.method1378(local61.aLong87, local61);
					Static121.anInt2873--;
					Static39.anInt915++;
				}
				while (Static98.anInt2200 < 20 && Static75.anInt1766 > 0) {
					local61 = (Class1_Sub1_Sub16) Static52.aClass10_33.method266();
					local66 = new Class1_Sub6(4);
					local66.method1853(0);
					local66.method1838((int) local61.aLong87);
					Static53.aClass27_3.method560(4, local66.aByteArray27);
					local61.method2079();
					Static89.aClass58_5.method1378(local61.aLong87, local61);
					Static75.anInt1766--;
					Static98.anInt2200++;
				}
				for (@Pc(157) int local157 = 0; local157 < 100; local157++) {
					@Pc(170) int local170 = Static53.aClass27_3.method559();
					if (local170 < 0) {
						throw new IOException();
					}
					if (local170 == 0) {
						break;
					}
					Static53.anInt1231 = 0;
					@Pc(182) byte local182 = 0;
					if (Static83.aClass1_Sub1_Sub16_1 == null) {
						local182 = 8;
					} else if (Static55.anInt2826 == 0) {
						local182 = 1;
					}
					@Pc(205) int local205;
					@Pc(229) int local229;
					@Pc(279) int local279;
					@Pc(294) int local294;
					if (local182 > 0) {
						local205 = local182 - Static117.aClass1_Sub6_5.anInt2574;
						if (local170 < local205) {
							local205 = local170;
						}
						Static53.aClass27_3.method563(Static117.aClass1_Sub6_5.anInt2574, Static117.aClass1_Sub6_5.aByteArray27, local205);
						if (Static98.aByte3 != 0) {
							for (local229 = 0; local229 < local205; local229++) {
								Static117.aClass1_Sub6_5.aByteArray27[local229 + Static117.aClass1_Sub6_5.anInt2574] ^= Static98.aByte3;
							}
						}
						Static117.aClass1_Sub6_5.anInt2574 += local205;
						if (local182 > Static117.aClass1_Sub6_5.anInt2574) {
							break;
						}
						if (Static83.aClass1_Sub1_Sub16_1 == null) {
							Static117.aClass1_Sub6_5.anInt2574 = 0;
							local229 = Static117.aClass1_Sub6_5.method1837();
							local279 = Static117.aClass1_Sub6_5.method1842();
							@Pc(286) long local286 = (long) (local279 + (local229 << 16));
							@Pc(290) int local290 = Static117.aClass1_Sub6_5.method1837();
							local294 = Static117.aClass1_Sub6_5.method1817();
							@Pc(300) Class1_Sub1_Sub16 local300 = (Class1_Sub1_Sub16) Static93.aClass58_6.method1380(local286);
							Static7.aBoolean20 = true;
							if (local300 == null) {
								local300 = (Class1_Sub1_Sub16) Static89.aClass58_5.method1380(local286);
								Static7.aBoolean20 = false;
							}
							if (local300 == null) {
								throw new IOException();
							}
							Static83.aClass1_Sub1_Sub16_1 = local300;
							@Pc(329) int local329 = local290 == 0 ? 5 : 9;
							Static105.aClass1_Sub6_4 = new Class1_Sub6(Static83.aClass1_Sub1_Sub16_1.aByte4 + local329 + local294);
							Static105.aClass1_Sub6_4.method1853(local290);
							Static105.aClass1_Sub6_4.method1851(local294);
							Static55.anInt2826 = 8;
							Static117.aClass1_Sub6_5.anInt2574 = 0;
						} else if (Static55.anInt2826 == 0) {
							if (Static117.aClass1_Sub6_5.aByteArray27[0] == -1) {
								Static117.aClass1_Sub6_5.anInt2574 = 0;
								Static55.anInt2826 = 1;
							} else {
								Static83.aClass1_Sub1_Sub16_1 = null;
							}
						}
					} else {
						local205 = Static105.aClass1_Sub6_4.aByteArray27.length - Static83.aClass1_Sub1_Sub16_1.aByte4;
						local229 = 512 - Static55.anInt2826;
						if (local229 > local205 - Static105.aClass1_Sub6_4.anInt2574) {
							local229 = local205 - Static105.aClass1_Sub6_4.anInt2574;
						}
						if (local170 < local229) {
							local229 = local170;
						}
						Static53.aClass27_3.method563(Static105.aClass1_Sub6_4.anInt2574, Static105.aClass1_Sub6_4.aByteArray27, local229);
						if (Static98.aByte3 != 0) {
							for (local279 = 0; local279 < local229; local279++) {
								Static105.aClass1_Sub6_4.aByteArray27[local279 + Static105.aClass1_Sub6_4.anInt2574] ^= Static98.aByte3;
							}
						}
						Static55.anInt2826 += local229;
						Static105.aClass1_Sub6_4.anInt2574 += local229;
						if (local205 == Static105.aClass1_Sub6_4.anInt2574) {
							if (Static83.aClass1_Sub1_Sub16_1.aLong87 == 16711935L) {
								Static72.aClass1_Sub6_2 = Static105.aClass1_Sub6_4;
								for (local279 = 0; local279 < 256; local279++) {
									@Pc(481) Class41_Sub1 local481 = Static104.aClass41_Sub1Array1[local279];
									if (local481 != null) {
										Static72.aClass1_Sub6_2.anInt2574 = local279 * 4 + 5;
										local294 = Static72.aClass1_Sub6_2.method1817();
										local481.method1079(local294);
									}
								}
							} else {
								Static119.aCRC32_2.reset();
								Static119.aCRC32_2.update(Static105.aClass1_Sub6_4.aByteArray27, 0, local205);
								local279 = (int) Static119.aCRC32_2.getValue();
								if (Static83.aClass1_Sub1_Sub16_1.anInt2501 != local279) {
									try {
										Static53.aClass27_3.method562();
									} catch (@Pc(525) Exception local525) {
									}
									Static44.anInt1048++;
									Static53.aClass27_3 = null;
									Static98.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static44.anInt1048 = 0;
								Static11.anInt427 = 0;
								Static83.aClass1_Sub1_Sub16_1.aClass41_Sub1_18.method1084(Static7.aBoolean20, (int) (Static83.aClass1_Sub1_Sub16_1.aLong87 & 0xFFFFL), Static105.aClass1_Sub6_4.aByteArray27, (Static83.aClass1_Sub1_Sub16_1.aLong87 & 0xFF0000L) == 16711680L);
							}
							Static83.aClass1_Sub1_Sub16_1.method2076();
							Static83.aClass1_Sub1_Sub16_1 = null;
							Static55.anInt2826 = 0;
							if (Static7.aBoolean20) {
								Static39.anInt915--;
							} else {
								Static98.anInt2200--;
							}
							Static105.aClass1_Sub6_4 = null;
						} else {
							if (Static55.anInt2826 != 512) {
								break;
							}
							Static55.anInt2826 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(599) IOException local599) {
				try {
					Static53.aClass27_3.method562();
				} catch (@Pc(604) Exception local604) {
				}
				Static11.anInt427++;
				Static53.aClass27_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(Z)V")
	public static void method1563() {
		if (Static11.aClass1_Sub1_Sub11_1 == null) {
			return;
		}
		@Pc(9) Class1_Sub1_Sub11 local9 = Static11.aClass1_Sub1_Sub11_1;
		@Pc(13) Class1_Sub1_Sub11 local13 = Static100.method1609(local9);
		if (local13 == null) {
			Static11.aClass1_Sub1_Sub11_1 = null;
			return;
		}
		Static108.anInt2550++;
		@Pc(26) int[] local26 = Static81.method1069(local13);
		@Pc(30) int[] local30 = Static81.method1069(local9);
		@Pc(35) int local35 = Static81.anInt1404 - Static51.anInt1205;
		@Pc(40) int local40 = Static63.anInt1474 - Static63.anInt1475;
		if (local35 <= local9.anInt1731 && -local9.anInt1731 <= local35 && local40 <= local9.anInt1731 && local40 >= -local9.anInt1731 && !Static13.aBoolean33) {
			local35 = 0;
			local40 = 0;
		} else if (Static108.anInt2550 > local9.anInt1708 || Static13.aBoolean33) {
			Static13.aBoolean33 = true;
		} else {
			local35 = 0;
			local40 = 0;
		}
		@Pc(95) int local95 = local35 + local30[0] - local26[0];
		@Pc(105) int local105 = local40 + local30[1] - local26[1];
		if (local95 < 0) {
			local95 = 0;
		}
		if (local105 < 0) {
			local105 = 0;
		}
		if (local9.anInt1707 + local105 > local13.anInt1707) {
			local105 = local13.anInt1707 - local9.anInt1707;
		}
		if (local13.anInt1700 < local9.anInt1700 + local95) {
			local95 = local13.anInt1700 - local9.anInt1700;
		}
		if (Static11.aClass1_Sub1_Sub11_1.anObjectArray11 != null && Static13.aBoolean33) {
			Static67.method1134(local9.anObjectArray11, local95, 0, local105, null, local9);
		}
		if (Static94.anInt2145 != 0) {
			return;
		}
		if (Static13.aBoolean33) {
			@Pc(169) int local169 = Static81.anInt1404 - local26[0];
			@Pc(176) int local176 = Static63.anInt1474 - local26[1];
			if (local176 < 0) {
				local176 = 0;
			}
			if (local169 < 0) {
				local169 = 0;
			}
			if (local13.anInt1700 - 1 < local169) {
				local169 = local13.anInt1700 - 1;
			}
			if (local13.anInt1707 - 1 < local176) {
				local176 = local13.anInt1707 - 1;
			}
			@Pc(220) Class1_Sub1_Sub11 local220 = Static16.method302(local13, local9, local169, local176);
			if (Static11.aClass1_Sub1_Sub11_1.anObjectArray3 != null) {
				Static67.method1134(local9.anObjectArray3, local95, 0, local105, local220, local9);
			}
			if (local220 != null && Static83.method1387(local9) != null) {
				Static49.aClass1_Sub6_Sub1_1.method1877(223);
				Static49.aClass1_Sub6_Sub1_1.method1871(local9.anInt1742);
				Static49.aClass1_Sub6_Sub1_1.method1864(local220.anInt1717);
				Static49.aClass1_Sub6_Sub1_1.method1816(local220.anInt1742);
				Static49.aClass1_Sub6_Sub1_1.method1864(local9.anInt1717);
			}
		} else {
			if (Static11.aClass1_Sub1_Sub11_1.anObjectArray14 != null) {
				Static67.method1134(local9.anObjectArray14, local95, 0, local105, null, local9);
			}
			if ((Static3.anInt116 == 1 || Static3.method127(Static48.anInt2603 - 1)) && Static48.anInt2603 > 2) {
				Static89.method1450();
			} else if (Static48.anInt2603 > 0) {
				Static19.method390(Static48.anInt2603 - 1);
			}
		}
		Static11.aClass1_Sub1_Sub11_1 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public static void method1565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(16) Class1_Sub1_Sub16 local16 = (Class1_Sub1_Sub16) Static58.aClass58_3.method1380(local10);
		if (local16 != null) {
			Static52.aClass10_33.method267(local16);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII)V")
	private static void method1567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 0;
		@Pc(12) int local12 = 2048 - arg2 & 0x7FF;
		@Pc(14) int local14 = arg5;
		@Pc(16) int local16 = 0;
		@Pc(23) int local23 = 2048 - arg1 & 0x7FF;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(46) int local46;
		if (local23 != 0) {
			local32 = Class1_Sub1_Sub5_Sub4.anIntArray427[local23];
			local36 = Class1_Sub1_Sub5_Sub4.anIntArray429[local23];
			local46 = local36 * 0 - arg5 * local32 >> 16;
			local14 = arg5 * local36 + local32 * 0 >> 16;
			local16 = local46;
		}
		if (local12 != 0) {
			local32 = Class1_Sub1_Sub5_Sub4.anIntArray427[local12];
			local36 = Class1_Sub1_Sub5_Sub4.anIntArray429[local12];
			local46 = local36 * 0 + local14 * local32 >> 16;
			local14 = local14 * local36 - local32 * 0 >> 16;
			local5 = local46;
		}
		Static72.anInt1642 = arg1;
		Static106.anInt2503 = arg3 - local16;
		Static80.anInt1899 = arg0 - local14;
		Static116.anInt2779 = arg2;
		Static119.anInt2846 = arg4 - local5;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
	public static int method1569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 - 1 & arg0;
		@Pc(13) int local13 = arg0 / arg2;
		@Pc(22) int local22 = arg1 / arg2;
		@Pc(28) int local28 = arg1 & arg2 - 1;
		@Pc(33) int local33 = Static20.method402(local13, local22);
		@Pc(40) int local40 = Static20.method402(local13 + 1, local22);
		@Pc(47) int local47 = Static20.method402(local13, local22 + 1);
		@Pc(56) int local56 = Static20.method402(local13 + 1, local22 + 1);
		@Pc(65) int local65 = Static89.method1449(local33, arg2, local9, local40);
		@Pc(72) int local72 = Static89.method1449(local47, arg2, local9, local56);
		return Static89.method1449(local65, arg2, local28, local72);
	}
}
