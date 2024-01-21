import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!s", name = "nb", descriptor = "Lclient!ed;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1245 = Static23.method501("No response from server)3");

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1246 = Static23.method501(")1");

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1247 = aClass42_1245;

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
	public static int anInt2319 = 0;

	@OriginalMember(owner = "client!s", name = "sb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_23 = new Class37(10);

	@OriginalMember(owner = "client!s", name = "vb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1248 = Static23.method501("null");

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1249 = Static23.method501("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1250 = Static23.method501("backvmid2");

	@OriginalMember(owner = "client!s", name = "zb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1251 = Static23.method501("Loaded gamescreen");

	@OriginalMember(owner = "client!s", name = "Ab", descriptor = "I")
	public static int anInt2328 = 0;

	@OriginalMember(owner = "client!s", name = "Db", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1253 = Static23.method501("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!s", name = "Cb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1252 = aClass42_1253;

	@OriginalMember(owner = "client!s", name = "Fb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1254 = Static23.method501(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!s", name = "Hb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1255 = aClass42_1251;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method1610() {
		aClass42_1248 = null;
		aClass42_1254 = null;
		aClass42_1245 = null;
		aClass20_1 = null;
		aClass42_1255 = null;
		aClass42_1251 = null;
		aClass42_1249 = null;
		aClass42_1247 = null;
		aClass42_1250 = null;
		aClass42_1246 = null;
		aClass42_1253 = null;
		aClass42_1252 = null;
		aClass37_23 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V")
	public static void method1613(@OriginalArg(0) int arg0) {
		if (Static30.aClass14_1 == null) {
			return;
		}
		if (Static61.anInt1457 == 0) {
			if (Static74.anInt1895 < 0) {
				return;
			}
			Static74.anInt1895 = arg0;
			Static30.aClass14_1.method1423(0, arg0);
		} else if (Static45.aByteArray25 != null) {
			Static36.anInt904 = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	public static void method1614() {
		if (Static97.anInt2477 > 0) {
			Static97.anInt2477--;
		}
		if (Static25.anInt732 > 1) {
			Static25.anInt732--;
		}
		if (Static27.aBoolean37) {
			Static27.aBoolean37 = false;
			Static101.method1777();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static30.method573(); local29++) {
		}
		if (Static91.anInt2400 != 30 && Static91.anInt2400 != 35) {
			return;
		}
		@Pc(64) int local64;
		if (Static34.aBoolean43 && Static91.anInt2400 == 30) {
			Static80.anInt2104 = 0;
			Static18.anInt614 = 0;
			while (Static80.method1479()) {
			}
			for (local64 = 0; local64 < Static59.aBooleanArray14.length; local64++) {
				Static59.aBooleanArray14[local64] = false;
			}
		}
		Static38.method643(Static98.aClass1_Sub8_Sub1_3);
		@Pc(86) Object local86 = Static33.aClass38_1.anObject1;
		@Pc(123) int local123;
		@Pc(120) int local120;
		@Pc(125) int local125;
		@Pc(147) int local147;
		synchronized (Static33.aClass38_1.anObject1) {
			if (!Static95.aBoolean137) {
				Static33.aClass38_1.anInt1431 = 0;
			} else if (Static80.anInt2104 != 0 || Static33.aClass38_1.anInt1431 >= 40) {
				Static98.aClass1_Sub8_Sub1_3.method1236(230);
				Static98.aClass1_Sub8_Sub1_3.method1185(0);
				local120 = 0;
				local123 = Static98.aClass1_Sub8_Sub1_3.anInt1692;
				@Pc(141) int local141;
				for (local125 = 0; local125 < Static33.aClass38_1.anInt1431 && Static98.aClass1_Sub8_Sub1_3.anInt1692 - local123 < 240; local125++) {
					local141 = Static33.aClass38_1.anIntArray216[local125];
					local120++;
					local147 = Static33.aClass38_1.anIntArray215[local125];
					if (local147 < 0) {
						local147 = 0;
					} else if (local147 > 764) {
						local147 = 764;
					}
					if (local141 < 0) {
						local141 = 0;
					} else if (local141 > 502) {
						local141 = 502;
					}
					@Pc(178) int local178 = local147 + local141 * 765;
					if (Static33.aClass38_1.anIntArray216[local125] == -1 && Static33.aClass38_1.anIntArray215[local125] == -1) {
						local147 = -1;
						local141 = -1;
						local178 = 524287;
					}
					if (Static64.anInt1561 != local147 || local141 != Static29.anInt815) {
						@Pc(218) int local218 = local147 - Static64.anInt1561;
						@Pc(223) int local223 = local141 - Static29.anInt815;
						Static29.anInt815 = local141;
						Static64.anInt1561 = local147;
						if (Static107.anInt2709 < 8 && local218 >= -32 && local218 <= 31 && local223 >= -32 && local223 <= 31) {
							local223 += 32;
							local218 += 32;
							Static98.aClass1_Sub8_Sub1_3.method1222(local223 + (Static107.anInt2709 << 12) + (local218 << 6));
							Static107.anInt2709 = 0;
						} else if (Static107.anInt2709 < 8) {
							Static98.aClass1_Sub8_Sub1_3.method1225(local178 + (Static107.anInt2709 << 19) + 8388608);
							Static107.anInt2709 = 0;
						} else {
							Static98.aClass1_Sub8_Sub1_3.method1218(local178 + (Static107.anInt2709 << 19) - 1073741824);
							Static107.anInt2709 = 0;
						}
					} else if (Static107.anInt2709 < 2047) {
						Static107.anInt2709++;
					}
				}
				Static98.aClass1_Sub8_Sub1_3.method1230(Static98.aClass1_Sub8_Sub1_3.anInt1692 - local123);
				if (Static33.aClass38_1.anInt1431 <= local120) {
					Static33.aClass38_1.anInt1431 = 0;
				} else {
					Static33.aClass38_1.anInt1431 -= local120;
					for (local141 = 0; local141 < Static33.aClass38_1.anInt1431; local141++) {
						Static33.aClass38_1.anIntArray215[local141] = Static33.aClass38_1.anIntArray215[local120 + local141];
						Static33.aClass38_1.anIntArray216[local141] = Static33.aClass38_1.anIntArray216[local120 + local141];
					}
				}
			}
		}
		if (Static80.anInt2104 != 0) {
			@Pc(385) long local385 = (Static45.aLong62 - Static75.aLong43) / 50L;
			local123 = Static59.anInt1998;
			Static75.aLong43 = Static45.aLong62;
			if (local385 > 4095L) {
				local385 = 4095L;
			}
			if (local123 < 0) {
				local123 = 0;
			} else if (local123 > 502) {
				local123 = 502;
			}
			local120 = Static8.anInt247;
			if (local120 < 0) {
				local120 = 0;
			} else if (local120 > 764) {
				local120 = 764;
			}
			local125 = local120 + local123 * 765;
			@Pc(436) byte local436 = 0;
			if (Static80.anInt2104 == 2) {
				local436 = 1;
			}
			Static98.aClass1_Sub8_Sub1_3.method1236(26);
			local147 = (int) local385;
			Static98.aClass1_Sub8_Sub1_3.method1183((local147 << 20) + ((local436 << 19) + local125));
		}
		if (Static4.anInt124 > 0) {
			Static4.anInt124--;
		}
		if (Static59.aBooleanArray14[96] || Static59.aBooleanArray14[97] || Static59.aBooleanArray14[98] || Static59.aBooleanArray14[99]) {
			Static51.aBoolean82 = true;
		}
		if (Static51.aBoolean82 && Static4.anInt124 <= 0) {
			Static51.aBoolean82 = false;
			Static4.anInt124 = 20;
			Static98.aClass1_Sub8_Sub1_3.method1236(32);
			Static98.aClass1_Sub8_Sub1_3.method1222(Static36.anInt897);
			Static98.aClass1_Sub8_Sub1_3.method1198(Static62.anInt1467);
		}
		if (Static52.aBoolean83 && !Static52.aBoolean84) {
			Static52.aBoolean84 = true;
			Static98.aClass1_Sub8_Sub1_3.method1236(77);
			Static98.aClass1_Sub8_Sub1_3.method1185(1);
		}
		if (!Static52.aBoolean83 && Static52.aBoolean84) {
			Static52.aBoolean84 = false;
			Static98.aClass1_Sub8_Sub1_3.method1236(77);
			Static98.aClass1_Sub8_Sub1_3.method1185(0);
		}
		Static104.method1819();
		if (Static91.anInt2400 != 30 && Static91.anInt2400 != 35) {
			return;
		}
		Static48.method860();
		Static90.method1657();
		Static6.anInt140++;
		if (Static6.anInt140 > 750) {
			Static101.method1777();
			return;
		}
		Static1.method4();
		Static33.method582();
		Static50.method1191();
		if (Static37.anInt921 != 0) {
			Static68.anInt1666++;
			if (Static68.anInt1666 >= 15) {
				if (Static37.anInt921 == 2) {
					Static89.aBoolean132 = true;
				}
				if (Static37.anInt921 == 3) {
					Static28.aBoolean41 = true;
				}
				Static37.anInt921 = 0;
			}
		}
		if (Static17.anInt592 != 0) {
			Static56.anInt1426 += 20;
			if (Static56.anInt1426 >= 400) {
				Static17.anInt592 = 0;
			}
		}
		Static59.anInt1992++;
		if (Static30.anInt828 != 0) {
			Static91.anInt2401++;
			if (Static13.anInt459 + 5 < Static73.anInt1884 || Static73.anInt1884 < Static13.anInt459 - 5 || Static5.anInt138 + 5 < Static38.anInt948 || Static38.anInt948 < Static5.anInt138 - 5) {
				Static16.aBoolean25 = true;
			}
			if (Static18.anInt614 == 0) {
				if (Static30.anInt828 == 2) {
					Static89.aBoolean132 = true;
				}
				if (Static30.anInt828 == 3) {
					Static28.aBoolean41 = true;
				}
				Static30.anInt828 = 0;
				if (Static16.aBoolean25 && Static91.anInt2401 >= 5) {
					Static109.anInt2762 = -1;
					Static42.method1764();
					if (Static109.anInt2762 == Static25.anInt729 && Static109.anInt2754 != Static98.anInt2491) {
						@Pc(760) Class1_Sub1_Sub12 local760 = Static33.method578(Static25.anInt729);
						@Pc(762) byte local762 = 0;
						if (Static17.anInt587 == 1 && local760.anInt2160 == 206) {
							local762 = 1;
						}
						if (local760.anIntArray332[Static98.anInt2491] <= 0) {
							local762 = 0;
						}
						if (local760.aBoolean121) {
							local123 = Static109.anInt2754;
							local120 = Static98.anInt2491;
							local760.anIntArray332[local120] = local760.anIntArray332[local123];
							local760.anIntArray330[local120] = local760.anIntArray330[local123];
							local760.anIntArray332[local123] = -1;
							local760.anIntArray330[local123] = 0;
						} else if (local762 == 1) {
							local123 = Static109.anInt2754;
							local120 = Static98.anInt2491;
							while (local123 != local120) {
								if (local123 > local120) {
									local760.method1506(local123, local123 - 1);
									local123--;
								} else if (local120 > local123) {
									local760.method1506(local123, local123 + 1);
									local123++;
								}
							}
						} else {
							local760.method1506(Static109.anInt2754, Static98.anInt2491);
						}
						Static98.aClass1_Sub8_Sub1_3.method1236(51);
						Static98.aClass1_Sub8_Sub1_3.method1200(local762);
						Static98.aClass1_Sub8_Sub1_3.method1222(Static109.anInt2754);
						Static98.aClass1_Sub8_Sub1_3.method1218(Static25.anInt729);
						Static98.aClass1_Sub8_Sub1_3.method1197(Static98.anInt2491);
					}
				} else if ((Static64.anInt1564 == 1 || Static99.method1730(Static83.anInt2216 - 1)) && Static83.anInt2216 > 2) {
					Static2.method86();
				} else if (Static83.anInt2216 > 0) {
					Static37.method621(Static83.anInt2216 - 1);
				}
				Static68.anInt1666 = 10;
				Static80.anInt2104 = 0;
			}
		}
		@Pc(903) int local903;
		if (Static22.anInt692 != -1) {
			local64 = Static22.anInt692;
			local903 = Static22.anInt671;
			@Pc(923) boolean local923 = Static92.method1680(0, 0, local64, 0, 0, true, 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local903);
			Static22.anInt692 = -1;
			if (local923) {
				anInt2319 = Static8.anInt247;
				Static17.anInt592 = 1;
				Static103.anInt2676 = Static59.anInt1998;
				Static56.anInt1426 = 0;
			}
		}
		if (Static80.anInt2104 == 1 && Static25.aClass42_396 != null) {
			Static25.aClass42_396 = null;
			Static28.aBoolean41 = true;
			Static80.anInt2104 = 0;
		}
		Static7.method155();
		if (Static43.anInt1144 == -1) {
			Static105.method1841();
			Static70.method1257();
			Static103.method1815();
		}
		if (Static18.anInt614 == 1 || Static80.anInt2104 == 1) {
			Static21.anInt667++;
		}
		if (Static64.anInt1563 == -1 && Static101.anInt2641 == -1 && Static11.anInt356 == -1) {
			if (Static69.anInt1756 > 0) {
				Static69.anInt1756--;
			}
		} else if (Static57.anInt2699 > Static69.anInt1756) {
			Static69.anInt1756++;
			if (Static69.anInt1756 == Static57.anInt2699) {
				if (Static64.anInt1563 != -1) {
					Static28.aBoolean41 = true;
				}
				if (Static101.anInt2641 != -1) {
					Static89.aBoolean132 = true;
				}
			}
		}
		Static101.method1770();
		if (Static107.aBoolean147) {
			Static34.method592();
		}
		for (local64 = 0; local64 < 5; local64++) {
			@Pc(1031) int local1031 = Static53.anIntArray403[local64]++;
		}
		Static81.method1486();
		local903 = Static95.method1686();
		local123 = Static79.method1445();
		if (local903 > 4500 && local123 > 4500) {
			Static97.anInt2477 = 250;
			Static24.method507(4000);
			Static98.aClass1_Sub8_Sub1_3.method1236(100);
		}
		Static105.anInt2733++;
		Static17.anInt601++;
		if (Static17.anInt601 > 500) {
			Static17.anInt601 = 0;
			local120 = (int) (Math.random() * 8.0D);
			if ((local120 & 0x4) == 4) {
				Static68.anInt1662 += Static15.anInt544;
			}
			if ((local120 & 0x2) == 2) {
				Static31.anInt2252 += Static9.anInt254;
			}
			if ((local120 & 0x1) == 1) {
				Static105.anInt2732 += Static33.anInt849;
			}
		}
		Static34.anInt859++;
		if (Static105.anInt2732 < -50) {
			Static33.anInt849 = 2;
		}
		if (Static34.anInt859 > 500) {
			local120 = (int) (Math.random() * 8.0D);
			Static34.anInt859 = 0;
			if ((local120 & 0x1) == 1) {
				Static80.anInt2116 += Static2.anInt100;
			}
			if ((local120 & 0x2) == 2) {
				Static74.anInt1894 += Static70.anInt1778;
			}
		}
		if (Static74.anInt1894 < -20) {
			Static70.anInt1778 = 1;
		}
		if (Static68.anInt1662 < -40) {
			Static15.anInt544 = 1;
		}
		if (Static74.anInt1894 > 10) {
			Static70.anInt1778 = -1;
		}
		if (Static68.anInt1662 > 40) {
			Static15.anInt544 = -1;
		}
		if (Static31.anInt2252 < -55) {
			Static9.anInt254 = 2;
		}
		if (Static80.anInt2116 < -60) {
			Static2.anInt100 = 2;
		}
		if (Static80.anInt2116 > 60) {
			Static2.anInt100 = -2;
		}
		if (Static31.anInt2252 > 55) {
			Static9.anInt254 = -2;
		}
		if (Static105.anInt2732 > 50) {
			Static33.anInt849 = -2;
		}
		if (Static105.anInt2733 > 50) {
			Static98.aClass1_Sub8_Sub1_3.method1236(195);
		}
		try {
			if (Static58.aClass47_17 != null && Static98.aClass1_Sub8_Sub1_3.anInt1692 > 0) {
				Static58.aClass47_17.method1343(Static98.aClass1_Sub8_Sub1_3.anInt1692, Static98.aClass1_Sub8_Sub1_3.aByteArray24);
				Static98.aClass1_Sub8_Sub1_3.anInt1692 = 0;
				Static105.anInt2733 = 0;
			}
		} catch (@Pc(1261) IOException local1261) {
			Static101.method1777();
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V")
	public static void method1616() {
		if (Static30.aClass14_1 == null) {
			return;
		}
		Static65.method1106();
		if (Static61.anInt1457 > 0) {
			Static30.aClass14_1.method1425(256);
			Static61.anInt1457 = 0;
		}
		Static30.aClass14_1.method1420();
		Static30.aClass14_1 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIZIBLclient!p;)V")
	public static void method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) Class33_Sub1 arg5) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg2);
		@Pc(16) Class1_Sub1_Sub13 local16 = (Class1_Sub1_Sub13) Static83.aClass41_5.method1020(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub13) Static25.aClass41_3.method1020(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub13) Static101.aClass41_6.method1020(local10);
		if (local16 == null) {
			if (!arg3) {
				local16 = (Class1_Sub1_Sub13) Static19.aClass41_2.method1020(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub1_Sub13();
			local16.aClass33_Sub1_17 = arg5;
			local16.anInt2239 = arg1;
			local16.aByte3 = arg4;
			if (arg3) {
				Static83.aClass41_5.method1019(local10, local16);
				Static9.anInt253++;
			} else {
				Static13.aClass5_1.method110(local16);
				Static101.aClass41_6.method1019(local10, local16);
				Static11.anInt357++;
			}
		} else if (arg3) {
			local16.method1828();
			Static83.aClass41_5.method1019(local10, local16);
			Static11.anInt357--;
			Static9.anInt253++;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public static void method1622() {
		@Pc(5) Object local5 = Static61.anObject2;
		synchronized (Static61.anObject2) {
			if (Static63.anInt1531 != 0) {
				Static63.anInt1531 = 1;
				try {
					Static61.anObject2.wait();
				} catch (@Pc(15) InterruptedException local15) {
				}
			}
		}
	}
}
