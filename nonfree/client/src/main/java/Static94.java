import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
	public static int[] anIntArray308;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!v;")
	private static Class76 aClass76_978 = Static134.method2017("Please enter your username)3");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_973 = aClass76_978;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "[I")
	public static int[] anIntArray306 = new int[1000];

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!gf;")
	public static Class28 aClass28_8 = new Class28(4096);

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!v;")
	private static Class76 aClass76_979 = Static134.method2017("Loaded config");

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_974 = aClass76_979;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[I")
	public static int[] anIntArray307 = new int[128];

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_975 = Static134.method2017("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public static int anInt2168 = 0;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_976 = Static134.method2017(":assistreq:");

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_977 = Static134.method2017("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Lclient!v;")
	public static Class76 aClass76_980 = Static134.method2017("<col=ffff00>*V");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!dd;I)V")
	public static void method1505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub8 arg2) {
		if (arg2.anInt488 == 1) {
			Static79.method551(6, 0, arg2.anInt514, 0, arg2.aClass76_193, Static133.aClass76_1322);
		}
		if (arg2.anInt488 == 2 && !Static18.aBoolean21) {
			@Pc(33) Class76 local33 = Static43.method217(arg2);
			if (local33 != null) {
				Static79.method551(2, 0, arg2.anInt514, -1, local33, Static59.method1017(new Class76[] { Static50.aClass76_566, arg2.aClass76_202 }));
			}
		}
		if (arg2.anInt488 == 3) {
			Static79.method551(19, 0, arg2.anInt514, 0, Static32.aClass76_328, Static133.aClass76_1322);
		}
		if (arg2.anInt488 == 4) {
			Static79.method551(44, 0, arg2.anInt514, 0, arg2.aClass76_193, Static133.aClass76_1322);
		}
		if (arg2.anInt488 == 5) {
			Static79.method551(20, 0, arg2.anInt514, 0, arg2.aClass76_193, Static133.aClass76_1322);
		}
		if (arg2.anInt488 == 6 && Static65.aClass4_Sub8_5 == null) {
			Static79.method551(48, 0, arg2.anInt514, -1, arg2.aClass76_193, Static133.aClass76_1322);
		}
		@Pc(152) int local152;
		@Pc(146) int local146;
		if (arg2.anInt473 == 2) {
			local146 = 0;
			for (@Pc(148) int local148 = 0; local148 < arg2.anInt498; local148++) {
				for (local152 = 0; local152 < arg2.anInt513; local152++) {
					@Pc(161) int local161 = (arg2.anInt469 + 32) * local152;
					@Pc(169) int local169 = local148 * (arg2.anInt517 + 32);
					if (local146 < 20) {
						local161 += arg2.anIntArray68[local146];
						local169 += arg2.anIntArray73[local146];
					}
					if (arg0 >= local161 && arg1 >= local169 && arg0 < local161 + 32 && arg1 < local169 + 32) {
						Static106.anInt2352 = local146;
						Static132.aClass4_Sub8_16 = arg2;
						if (arg2.anIntArray71[local146] > 0) {
							@Pc(228) Class4_Sub4_Sub7 local228 = Static61.method1040(arg2.anIntArray71[local146] - 1);
							if (Static39.anInt1125 == 1 && Static55.method978(Static35.method627(arg2))) {
								if (arg2.anInt514 != Static130.anInt2777 || Static9.anInt174 != local146) {
									Static79.method551(46, local228.anInt1254, arg2.anInt514, local146, Static73.aClass76_814, Static59.method1017(new Class76[] { Static49.aClass76_557, Static101.aClass76_1062, local228.aClass76_556 }));
								}
							} else if (!Static18.aBoolean21 || !Static55.method978(Static35.method627(arg2))) {
								@Pc(287) Class76[] local287 = local228.aClass76Array10;
								if (Static55.aBoolean83) {
									local287 = Static63.method1091(local287);
								}
								@Pc(303) int local303;
								@Pc(351) byte local351;
								if (Static55.method978(Static35.method627(arg2))) {
									for (local303 = 4; local303 >= 3; local303--) {
										if (local287 != null && local287[local303] != null) {
											if (local303 == 3) {
												local351 = 43;
											} else {
												local351 = 7;
											}
											Static79.method551(local351, local228.anInt1254, arg2.anInt514, local146, local287[local303], Static59.method1017(new Class76[] { Static54.aClass76_1195, local228.aClass76_556 }));
										} else if (local303 == 4) {
											Static79.method551(7, local228.anInt1254, arg2.anInt514, local146, Static62.aClass76_676, Static59.method1017(new Class76[] { Static54.aClass76_1195, local228.aClass76_556 }));
										}
									}
								}
								if (Static122.method1852(Static35.method627(arg2))) {
									Static79.method551(33, local228.anInt1254, arg2.anInt514, local146, Static73.aClass76_814, Static59.method1017(new Class76[] { Static54.aClass76_1195, local228.aClass76_556 }));
								}
								if (Static55.method978(Static35.method627(arg2)) && local287 != null) {
									for (local303 = 2; local303 >= 0; local303--) {
										if (local287[local303] != null) {
											local351 = 0;
											if (local303 == 0) {
												local351 = 57;
											}
											if (local303 == 1) {
												local351 = 28;
											}
											if (local303 == 2) {
												local351 = 25;
											}
											Static79.method551(local351, local228.anInt1254, arg2.anInt514, local146, local287[local303], Static59.method1017(new Class76[] { Static54.aClass76_1195, local228.aClass76_556 }));
										}
									}
								}
								local287 = arg2.aClass76Array4;
								if (Static55.aBoolean83) {
									local287 = Static63.method1091(local287);
								}
								if (local287 != null) {
									for (local303 = 4; local303 >= 0; local303--) {
										if (local287[local303] != null) {
											local351 = 0;
											if (local303 == 0) {
												local351 = 47;
											}
											if (local303 == 1) {
												local351 = 51;
											}
											if (local303 == 2) {
												local351 = 31;
											}
											if (local303 == 3) {
												local351 = 58;
											}
											if (local303 == 4) {
												local351 = 26;
											}
											Static79.method551(local351, local228.anInt1254, arg2.anInt514, local146, local287[local303], Static59.method1017(new Class76[] { Static54.aClass76_1195, local228.aClass76_556 }));
										}
									}
								}
								Static79.method551(1005, local228.anInt1254, arg2.anInt514, local146, Static130.aClass76_1306, Static59.method1017(new Class76[] { Static54.aClass76_1195, local228.aClass76_556 }));
							} else if ((Static119.anInt2563 & 0x10) == 16) {
								Static79.method551(50, local228.anInt1254, arg2.anInt514, local146, Static102.aClass76_1086, Static59.method1017(new Class76[] { Static117.aClass76_1203, Static101.aClass76_1062, local228.aClass76_556 }));
							}
						}
					}
					local146++;
				}
			}
		}
		if (!arg2.aBoolean37) {
			return;
		}
		if (Static18.aBoolean21) {
			if (Static49.method862(Static35.method627(arg2)) && (Static119.anInt2563 & 0x20) == 32) {
				Static79.method551(10, 0, arg2.anInt514, arg2.anInt466, Static102.aClass76_1086, Static59.method1017(new Class76[] { Static117.aClass76_1203, Static127.aClass76_1293, arg2.aClass76_200 }));
				return;
			}
			return;
		}
		@Pc(713) Class76 local713;
		for (local146 = 9; local146 >= 5; local146--) {
			local713 = Static113.method1721(arg2, local146);
			if (local713 != null) {
				Static79.method551(1004, local146 + 1, arg2.anInt514, arg2.anInt466, local713, arg2.aClass76_200);
			}
		}
		local713 = Static43.method217(arg2);
		if (local713 != null) {
			Static79.method551(2, 0, arg2.anInt514, arg2.anInt466, local713, arg2.aClass76_200);
		}
		for (local152 = 4; local152 >= 0; local152--) {
			@Pc(768) Class76 local768 = Static113.method1721(arg2, local152);
			if (local768 != null) {
				Static79.method551(13, local152 + 1, arg2.anInt514, arg2.anInt466, local768, arg2.aClass76_200);
			}
		}
		if (Static21.method334(Static35.method627(arg2))) {
			Static79.method551(48, 0, arg2.anInt514, arg2.anInt466, Static36.aClass76_436, Static133.aClass76_1322);
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!v;)Z")
	public static boolean method1506(@OriginalArg(1) Class76 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static104.anInt2337; local11++) {
			if (arg0.method1882(Static51.aClass76Array23[local11])) {
				return true;
			}
		}
		return arg0.method1882(Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass76_612);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BBI)Lclient!v;")
	public static Class76 method1510(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class76 local9 = new Class76();
		local9.aByteArray71 = new byte[arg2];
		local9.anInt2668 = 0;
		for (@Pc(18) int local18 = arg0; local18 < arg0 + arg2; local18++) {
			if (arg1[local18] != 0) {
				local9.aByteArray71[local9.anInt2668++] = arg1[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([BB)V")
	public static void method1511(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub10 local10 = new Class4_Sub10(arg0);
		local10.anInt931 = arg0.length - 2;
		Static3.anInt2206 = local10.method604();
		Static102.anIntArray321 = new int[Static3.anInt2206];
		Static34.anIntArray107 = new int[Static3.anInt2206];
		Static25.anIntArray80 = new int[Static3.anInt2206];
		Static31.anIntArray96 = new int[Static3.anInt2206];
		Static38.aByteArrayArray3 = new byte[Static3.anInt2206][];
		local10.anInt931 = arg0.length - Static3.anInt2206 * 8 - 7;
		Static55.anInt1464 = local10.method604();
		Static18.anInt350 = local10.method604();
		@Pc(70) int local70 = (local10.method599() & 0xFF) + 1;
		for (@Pc(72) int local72 = 0; local72 < Static3.anInt2206; local72++) {
			Static31.anIntArray96[local72] = local10.method604();
		}
		for (@Pc(86) int local86 = 0; local86 < Static3.anInt2206; local86++) {
			Static102.anIntArray321[local86] = local10.method604();
		}
		for (@Pc(104) int local104 = 0; local104 < Static3.anInt2206; local104++) {
			Static34.anIntArray107[local104] = local10.method604();
		}
		for (@Pc(118) int local118 = 0; local118 < Static3.anInt2206; local118++) {
			Static25.anIntArray80[local118] = local10.method604();
		}
		local10.anInt931 = arg0.length - Static3.anInt2206 * 8 - (local70 + -1) * 3 - 7;
		Static49.anIntArray159 = new int[local70];
		for (@Pc(151) int local151 = 1; local151 < local70; local151++) {
			Static49.anIntArray159[local151] = local10.method572();
			if (Static49.anIntArray159[local151] == 0) {
				Static49.anIntArray159[local151] = 1;
			}
		}
		local10.anInt931 = 0;
		for (@Pc(176) int local176 = 0; local176 < Static3.anInt2206; local176++) {
			@Pc(182) int local182 = Static34.anIntArray107[local176];
			@Pc(186) int local186 = Static25.anIntArray80[local176];
			@Pc(190) int local190 = local182 * local186;
			@Pc(193) byte[] local193 = new byte[local190];
			Static38.aByteArrayArray3[local176] = local193;
			@Pc(201) int local201 = local10.method599();
			@Pc(210) int local210;
			if (local201 == 0) {
				for (local210 = 0; local210 < local190; local210++) {
					local193[local210] = local10.method579();
				}
			} else if (local201 == 1) {
				for (local210 = 0; local210 < local182; local210++) {
					for (@Pc(214) int local214 = 0; local214 < local186; local214++) {
						local193[local210 + local214 * local182] = local10.method579();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public static void method1512() {
		aClass28_8 = null;
		aClass76_980 = null;
		aClass76_974 = null;
		aClass76_975 = null;
		aClass76_976 = null;
		aClass76_978 = null;
		aClass76_973 = null;
		anIntArray306 = null;
		anIntArray308 = null;
		anIntArray307 = null;
		aClass76_977 = null;
		aClass76_979 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!v;Ljava/awt/Color;B)V")
	public static void method1513(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Color arg2) {
		try {
			@Pc(11) Graphics local11 = Static1.aCanvas1.getGraphics();
			if (Static95.aFont1 == null) {
				Static95.aFont1 = new Font("Helvetica", 1, 13);
				Static105.aFontMetrics1 = Static1.aCanvas1.getFontMetrics(Static95.aFont1);
			}
			if (Static104.aBoolean138) {
				Static104.aBoolean138 = false;
				local11.setColor(Color.black);
				local11.fillRect(0, 0, Static79.anInt946, Static30.anInt1429);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static76.anImage3 == null) {
					Static76.anImage3 = Static1.aCanvas1.createImage(304, 34);
				}
				@Pc(56) Graphics local56 = Static76.anImage3.getGraphics();
				local56.setColor(arg2);
				local56.drawRect(0, 0, 303, 33);
				local56.fillRect(2, 2, arg0 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(1, 1, 301, 31);
				local56.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local56.setFont(Static95.aFont1);
				local56.setColor(Color.white);
				arg1.method1864(local56, (304 - arg1.method1875(Static105.aFontMetrics1)) / 2, 22);
				local11.drawImage(Static76.anImage3, Static79.anInt946 / 2 - 152, Static30.anInt1429 / 2 + -18, null);
			} catch (@Pc(135) Exception local135) {
				@Pc(141) int local141 = Static79.anInt946 / 2 - 152;
				@Pc(147) int local147 = Static30.anInt1429 / 2 - 18;
				local11.setColor(arg2);
				local11.drawRect(local141, local147, 303, 33);
				local11.fillRect(local141 + 2, local147 + 2, arg0 * 3, 30);
				local11.setColor(Color.black);
				local11.drawRect(local141 + 1, local147 + 1, 301, 31);
				local11.fillRect(local141 + arg0 * 3 + 2, local147 - -2, 300 - arg0 * 3, 30);
				local11.setFont(Static95.aFont1);
				local11.setColor(Color.white);
				arg1.method1864(local11, (304 - arg1.method1875(Static105.aFontMetrics1)) / 2 + local141, local147 - -22);
			}
		} catch (@Pc(226) Exception local226) {
			Static1.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!hc;)V")
	public static void method1514(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static103.aBoolean137) {
			Static5.method73(arg0);
			return;
		}
		if (Static38.anInt1093 == 1 && Static75.anInt1928 >= 715 && Static20.anInt427 >= 453) {
			Static85.aBoolean124 = !Static85.aBoolean124;
			if (Static85.aBoolean124) {
				Static84.method1425();
			} else {
				Static10.method132(Static111.aClass76_1153, Static106.aClass76_1109, Static50.aClass17_Sub1_12);
			}
		}
		if (Static39.anInt1113 == 5) {
			return;
		}
		Static63.anInt1643++;
		if (Static39.anInt1113 != 10) {
			return;
		}
		if (Static132.anInt2821 != 2 && Static55.anInt1445 == 0) {
			if (Static38.anInt1093 == 1 && Static75.anInt1928 >= 5 && Static75.anInt1928 <= 105 && Static20.anInt427 >= 463 && Static20.anInt427 <= 498) {
				Static128.method1930();
				return;
			}
			if (Static79.aClass22_2 != null) {
				Static128.method1930();
			}
		}
		@Pc(109) int local109 = Static75.anInt1928;
		@Pc(115) int local115 = Static38.anInt1093;
		@Pc(117) int local117 = Static20.anInt427;
		if (Static60.anInt1571 == 0) {
			if (local115 == 1 && local109 >= 227 && local109 <= 377 && local117 >= 271 && local117 <= 311) {
				Static1.anInt4 = 0;
				Static60.anInt1571 = 3;
			}
			if (local115 == 1 && local109 >= 387 && local109 <= 537 && local117 >= 271 && local117 <= 311) {
				Static60.anInt1571 = 2;
				Static111.aClass76_1151 = Static65.aClass76_172;
				Static111.aClass76_1154 = Static33.aClass76_405;
				Static111.aClass76_1156 = Static33.aClass76_371;
				Static1.anInt4 = 0;
				return;
			}
		} else if (Static60.anInt1571 == 2) {
			@Pc(255) short local255 = 231;
			@Pc(258) int local258 = local255 + 30;
			if (local115 == 1 && local117 >= 246 && local117 < 261) {
				Static1.anInt4 = 0;
			}
			local258 += 15;
			if (local115 == 1 && local117 >= 261 && local117 < 276) {
				Static1.anInt4 = 1;
			}
			local258 += 15;
			if (local115 == 1 && local109 >= 227 && local109 <= 377 && local117 >= 301 && local117 <= 341) {
				Static111.aClass76_1146 = Static111.aClass76_1146.method1885().method1858();
				if (Static111.aClass76_1146.method1851() == 0) {
					Static15.method180(Static33.aClass76_394, Static33.aClass76_383, aClass76_973);
					return;
				}
				if (Static111.aClass76_1145.method1851() == 0) {
					Static15.method180(Static33.aClass76_375, Static33.aClass76_409, Static45.aClass76_521);
					return;
				}
				Static15.method180(Static33.aClass76_379, Static33.aClass76_374, Static57.aClass76_635);
				Static73.method1363(20);
				return;
			}
			if (local115 == 1 && local109 >= 387 && local109 <= 537 && local117 >= 301 && local117 <= 341) {
				Static111.aClass76_1146 = Static111.aClass76_1153;
				Static111.aClass76_1145 = Static111.aClass76_1153;
				Static60.anInt1571 = 0;
			}
			while (true) {
				while (Static45.method812()) {
					@Pc(420) boolean local420 = false;
					for (@Pc(422) int local422 = 0; Static6.aClass76_47.method1851() > local422; local422++) {
						if (Static78.anInt1984 == Static6.aClass76_47.method1860(local422)) {
							local420 = true;
							break;
						}
					}
					if (Static1.anInt4 == 0) {
						if (Static28.anInt589 == 85 && Static111.aClass76_1146.method1851() > 0) {
							Static111.aClass76_1146 = Static111.aClass76_1146.method1876(Static111.aClass76_1146.method1851() - 1, 0);
						}
						if (Static28.anInt589 == 84 || Static28.anInt589 == 80) {
							Static1.anInt4 = 1;
						}
						if (local420 && Static111.aClass76_1146.method1851() < 12) {
							Static111.aClass76_1146 = Static111.aClass76_1146.method1867(Static78.anInt1984);
						}
					} else if (Static1.anInt4 == 1) {
						if (Static28.anInt589 == 85 && Static111.aClass76_1145.method1851() > 0) {
							Static111.aClass76_1145 = Static111.aClass76_1145.method1876(Static111.aClass76_1145.method1851() - 1, 0);
						}
						if (Static28.anInt589 == 84 || Static28.anInt589 == 80) {
							Static1.anInt4 = 0;
						}
						if (Static21.anInt508 == 2 && Static28.anInt589 == 84) {
							Static111.aClass76_1146 = Static111.aClass76_1146.method1885().method1858();
							if (Static111.aClass76_1146.method1851() == 0) {
								Static15.method180(Static33.aClass76_394, Static33.aClass76_383, aClass76_973);
								return;
							}
							if (Static111.aClass76_1145.method1851() == 0) {
								Static15.method180(Static33.aClass76_375, Static33.aClass76_409, Static45.aClass76_521);
								return;
							}
							Static15.method180(Static33.aClass76_379, Static33.aClass76_374, Static57.aClass76_635);
							Static73.method1363(20);
							return;
						}
						if (local420 && Static111.aClass76_1145.method1851() < 20) {
							Static111.aClass76_1145 = Static111.aClass76_1145.method1867(Static78.anInt1984);
						}
					}
				}
				return;
			}
		} else if (Static60.anInt1571 == 3 && local115 == 1 && local109 >= 307 && local109 <= 457 && local117 >= 301 && local117 <= 341) {
			Static60.anInt1571 = 0;
			return;
		}
	}
}
