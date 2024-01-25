import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static115.method2440("argument count");
			}
			Static56.anInt1376 = Integer.parseInt(arg0[0]);
			Static322.anInt6208 = 2;
			if (arg0[1].equals("live")) {
				Static131.anInt1769 = 0;
			} else if (arg0[1].equals("rc")) {
				Static131.anInt1769 = 1;
			} else if (arg0[1].equals("wip")) {
				Static131.anInt1769 = 2;
			} else {
				Static115.method2440("modewhat");
			}
			Static201.anInt4054 = Static49.method1194(arg0[2]);
			if (Static201.anInt4054 == -1) {
				if (arg0[2].equals("english")) {
					Static201.anInt4054 = 0;
				} else if (arg0[2].equals("german")) {
					Static201.anInt4054 = 1;
				} else {
					Static115.method2440("language");
				}
			}
			Static155.method3047(Static201.anInt4054);
			Static237.aBoolean305 = false;
			Static76.aBoolean124 = false;
			if (arg0[3].equals("game0")) {
				Static45.anInt1136 = 0;
			} else if (arg0[3].equals("game1")) {
				Static45.anInt1136 = 1;
			} else {
				Static115.method2440("game");
			}
			Static81.anInt2000 = Static45.anInt1136;
			Static47.anInt1198 = 0;
			Static74.anInt5346 = 0;
			Static323.aString38 = "";
			@Pc(124) client local124 = new client();
			Static353.aClient1 = local124;
			local124.method1021(Static131.anInt1769 + 32, Static45.anInt1136 == 1 ? "stellardawn" : "runescape");
			Static277.aFrame2.setLocation(40, 40);
		} catch (@Pc(151) Exception local151) {
			Static47.method1149(local151, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method1030(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class14_Sub4 local15 = new Class14_Sub4(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method2548();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(33) int[] local33 = Static288.anIntArray503 = new int[6];
					local33[0] = local15.method2498();
					local33[1] = local15.method2498();
					local33[2] = local15.method2498();
					local33[3] = local15.method2498();
					local33[4] = local15.method2498();
					local33[5] = local15.method2498();
				} else if (local19 == 4) {
					@Pc(80) int local80 = local15.method2548();
					Static135.anIntArray261 = new int[local80];
					for (@Pc(85) int local85 = 0; local85 < local80; local85++) {
						Static135.anIntArray261[local85] = local15.method2498();
						if (Static135.anIntArray261[local85] == 65535) {
							Static135.anIntArray261[local85] = -1;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1035() {
		@Pc(14) boolean local14 = Static155.aClass35_2.method1142();
		if (!local14) {
			this.method1044();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1019() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1026() {
		if (Static8.aBoolean8) {
			Static189.method5490();
		}
		if (Static218.aClass46_5 != null) {
			Static218.aClass46_5.method5158();
		}
		if (Static267.aFrame1 != null) {
			Static34.method3923(Static105.aClass15_2, Static267.aFrame1);
			Static267.aFrame1 = null;
		}
		if (Static16.aClass197_1 != null) {
			Static16.aClass197_1.aBoolean419 = false;
		}
		Static16.aClass197_1 = null;
		if (Static138.aClass159_3 != null) {
			Static138.aClass159_3.method4079();
			Static138.aClass159_3 = null;
		}
		Static84.method2079(Static95.aCanvas2);
		Static288.method4958(Static95.aCanvas2);
		if (Static293.aClass72_1 != null) {
			Static293.aClass72_1.method2198(Static95.aCanvas2);
		}
		Static190.method3624();
		Static106.method2300();
		Static293.aClass72_1 = null;
		if (Static115.aClass26_7 != null) {
			Static115.aClass26_7.method4225();
		}
		if (Static311.aClass26_12 != null) {
			Static311.aClass26_12.method4225();
		}
		Static155.aClass35_2.method1140();
		Static40.aClass21_1.method650();
		if (Static274.aClass97_1 != null) {
			Static274.aClass97_1.method2756();
			Static274.aClass97_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1027() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static65.method5181();
		Static40.aClass21_1 = new Class21(Static105.aClass15_2);
		Static155.aClass35_2 = new Class35();
		if (Static131.anInt1769 != 0) {
			Static192.aByteArrayArray12 = new byte[50][];
		}
		Static298.method5084(Static105.aClass15_2);
		if (Static322.anInt6208 == 0) {
			Static274.aString196 = this.getCodeBase().getHost();
			Static214.anInt4285 = 443;
			Static40.anInt978 = 43594;
		} else if (Static322.anInt6208 == 1) {
			Static274.aString196 = this.getCodeBase().getHost();
			Static214.anInt4285 = Static56.anInt1376 + 50000;
			Static40.anInt978 = Static56.anInt1376 + 40000;
		} else if (Static322.anInt6208 == 2) {
			Static274.aString196 = "127.0.0.1";
			Static40.anInt978 = Static56.anInt1376 + 40000;
			Static214.anInt4285 = Static56.anInt1376 + 50000;
		}
		Static165.anInt5083 = Static40.anInt978;
		Static164.anInt3456 = Static40.anInt978;
		Static273.anInt5185 = Static214.anInt4285;
		Static46.aString46 = Static274.aString196;
		if (Static45.anInt1136 == 1) {
			Static67.aShortArray23 = Static92.aShortArray43;
			Static259.anInt4951 = 16777215;
			Static257.aShortArrayArray7 = Static270.aShortArrayArray10;
			Static49.anInt1233 = 0;
			Static81.aShortArray42 = Static261.aShortArray93;
			Static153.aBoolean211 = true;
			Static325.aShortArrayArray11 = Static84.aShortArrayArray1;
		} else {
			Static67.aShortArray23 = Static167.aShortArray108;
			Static81.aShortArray42 = Static217.aShortArray94;
			Static257.aShortArrayArray7 = Static133.aShortArrayArray9;
			Static325.aShortArrayArray11 = Static124.aShortArrayArray2;
		}
		Static233.aShortArray95 = Static280.aShortArray122 = Static111.aShortArray62 = Static348.aShortArray105 = new short[256];
		if (Static12.anInt244 == 3) {
			Static296.anInt5689 = Static56.anInt1376;
		}
		Static109.anInt2429 = Static164.anInt3456;
		Static148.method2972();
		Static100.method2244(Static95.aCanvas2);
		Static245.method3562(Static95.aCanvas2);
		Static293.aClass72_1 = Static288.method4961();
		if (Static293.aClass72_1 != null) {
			Static293.aClass72_1.method2201(Static95.aCanvas2);
		}
		Static68.anInt1627 = Static12.anInt244;
		try {
			if (Static105.aClass15_2.aClass110_1 != null) {
				Static307.aClass107_3 = new Class107(Static105.aClass15_2.aClass110_1, 5200, 0);
				for (@Pc(164) int local164 = 0; local164 < 29; local164++) {
					Static316.aClass107Array2[local164] = new Class107(Static105.aClass15_2.aClass110Array1[local164], 6000, 0);
				}
				Static27.aClass107_1 = new Class107(Static105.aClass15_2.aClass110_2, 6000, 0);
				Static47.aClass199_1 = new Class199(255, Static307.aClass107_3, Static27.aClass107_1, 500000);
				Static231.aClass107_4 = new Class107(Static105.aClass15_2.aClass110_3, 24, 0);
				Static105.aClass15_2.aClass110_1 = null;
				Static105.aClass15_2.aClass110_3 = null;
				Static105.aClass15_2.aClass110Array1 = null;
				Static105.aClass15_2.aClass110_2 = null;
			}
		} catch (@Pc(222) IOException local222) {
			Static307.aClass107_3 = null;
			Static231.aClass107_4 = null;
			Static47.aClass199_1 = null;
			Static27.aClass107_1 = null;
		}
		if (Static45.anInt1136 == 0) {
			Static31.aString28 = Static173.aString126;
		} else if (Static45.anInt1136 == 1) {
			Static31.aString28 = Static355.aString254;
		}
		if (Static322.anInt6208 != 0) {
			Static66.aBoolean104 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method1038() {
		Static38.anInt907 = 0;
		while (Static64.method1507() && Static38.anInt907 < 128) {
			if (!Static183.method3533() || Static81.aChar2 != '`' && Static81.aChar2 != '§') {
				Static347.anIntArray640[Static38.anInt907] = Static251.anInt3169;
				Static331.anIntArray609[Static38.anInt907] = Static81.aChar2;
				Static38.anInt907++;
			} else if (Static151.method3009()) {
				Static45.method1109();
			} else {
				Static331.method5694();
			}
		}
		if (Static151.method3009()) {
			Static297.method5070();
		}
		Static71.anInt5636++;
		Static14.method336(-1, -1, null);
		Static138.method2792(null, -1, -1);
		Static155.method3045();
		Static348.anInt5338++;
		for (@Pc(80) int local80 = 0; local80 < 32768; local80++) {
			@Pc(86) Class10_Sub3_Sub3_Sub1 local86 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local80];
			if (local86 != null) {
				@Pc(92) byte local92 = local86.aClass192_1.aByte59;
				if ((local92 & 0x1) != 0) {
					@Pc(103) int local103 = local86.method5353();
					@Pc(124) int local124;
					if ((local92 & 0x2) != 0 && local86.anInt5986 == 0 && Math.random() * 1000.0D < 10.0D) {
						local124 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(132) int local132 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local124 != 0 || local132 != 0) {
							@Pc(146) int local146 = local124 + local86.anIntArray535[0];
							@Pc(154) int local154 = local86.anIntArray536[0] + local132;
							if (local146 < 0) {
								local146 = 0;
							} else if (local146 > Static195.anInt3965 - local103 - 1) {
								local146 = Static195.anInt3965 - local103 - 1;
							}
							if (local154 < 0) {
								local154 = 0;
							} else if (Static298.anInt5716 - local103 - 1 < local154) {
								local154 = Static298.anInt5716 - local103 - 1;
							}
							@Pc(227) int local227 = Static323.method978(local154, Static332.anIntArray613, local103, local103, Static188.anIntArray331, local86.anIntArray535[0], local146, Static75.aClass65Array1[local86.aByte64], -1, 0, local103, true, 0, local86.anIntArray536[0]);
							if (local227 > 0) {
								if (local227 > 9) {
									local227 = 9;
								}
								for (@Pc(241) int local241 = 0; local241 < local227; local241++) {
									local86.anIntArray535[local241] = Static188.anIntArray331[local227 - local241 - 1];
									local86.anIntArray536[local241] = Static332.anIntArray613[local227 - local241 - 1];
									local86.aByteArray188[local241] = 1;
								}
								local86.anInt5986 = local227;
							}
						}
					}
					Static50.method1216(local86, true);
					local124 = Static100.method2241(local86);
					Static347.method5908(local86, local124, Static130.anInt2814, Static141.anInt2989);
					Static271.method4611(local86);
				}
			}
		}
		if (Static44.anInt1104 == 0 && Static108.anInt2423 == 0) {
			if (Static205.anInt4115 == 2) {
				Static317.method5476();
			} else {
				Static171.method3336();
			}
			if (Static124.anInt2717 >> 7 < 14 || Static195.anInt3965 - 14 <= Static124.anInt2717 >> 7 || Static141.anInt2986 >> 7 < 14 || Static141.anInt2986 >> 7 >= Static298.anInt5716 - 14) {
				Static178.method3460();
			}
		}
		while (true) {
			@Pc(361) Class14_Sub15 local361;
			@Pc(366) Class146 local366;
			@Pc(377) Class146 local377;
			do {
				local361 = (Class14_Sub15) Static142.aClass18_14.method454();
				if (local361 == null) {
					while (true) {
						do {
							local361 = (Class14_Sub15) Static336.aClass18_46.method454();
							if (local361 == null) {
								while (true) {
									do {
										local361 = (Class14_Sub15) Static307.aClass18_11.method454();
										if (local361 == null) {
											if (Static94.aClass146_21 != null) {
												Static123.method5338();
											}
											if (Static153.anInt3257 % 1500 == 0) {
												Static319.method5486();
											}
											Static80.method1966();
											if (Static8.aBoolean8 && Static168.method3300() - 60000L > Static26.aLong17) {
												Static189.method5490();
												return;
											}
											return;
										}
										local366 = local361.aClass146_22;
										if (local366.anInt4126 < 0) {
											break;
										}
										local377 = Static273.method4632(local366.anInt4146);
									} while (local377 == null || local377.aClass146Array2 == null || local377.aClass146Array2.length <= local366.anInt4126 || local377.aClass146Array2[local366.anInt4126] != local366);
									Static10.method223(local361);
								}
							}
							local366 = local361.aClass146_22;
							if (local366.anInt4126 < 0) {
								break;
							}
							local377 = Static273.method4632(local366.anInt4146);
						} while (local377 == null || local377.aClass146Array2 == null || local377.aClass146Array2.length <= local366.anInt4126 || local366 != local377.aClass146Array2[local366.anInt4126]);
						Static10.method223(local361);
					}
				}
				local366 = local361.aClass146_22;
				if (local366.anInt4126 < 0) {
					break;
				}
				local377 = Static273.method4632(local366.anInt4146);
			} while (local377 == null || local377.aClass146Array2 == null || local366.anInt4126 >= local377.aClass146Array2.length || local366 != local377.aClass146Array2[local366.anInt4126]);
			Static10.method223(local361);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1012() {
		if (Static302.anInt5842 == 1000) {
			return;
		}
		@Pc(19) long local19 = Static188.method3594() / 1000000L - Static136.aLong86;
		Static136.aLong86 = Static188.method3594() / 1000000L;
		@Pc(27) boolean local27 = Static223.method5292();
		if (local27 && Static134.aBoolean192 && Static115.aClass26_7 != null) {
			Static115.aClass26_7.method4227();
		}
		if (Static302.anInt5842 == 30 || Static302.anInt5842 == 10) {
			if (Static345.aLong213 != 0L && Static168.method3300() > Static345.aLong213) {
				Static288.method4959(false, Static106.anInt2354, Static237.method4149(), Static325.anInt6256);
			} else if (Static218.aClass46_5.method5102() && Static308.aBoolean298) {
				Static338.method5824();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static267.aFrame1 == null) {
			@Pc(81) Container local81;
			if (Static277.aFrame2 == null) {
				local81 = Static105.aClass15_2.anApplet1;
			} else {
				local81 = Static277.aFrame2;
			}
			local90 = local81.getSize().width;
			local94 = local81.getSize().height;
			if (local81 == Static277.aFrame2) {
				@Pc(100) Insets local100 = Static277.aFrame2.getInsets();
				local90 -= local100.right + local100.left;
				local94 -= local100.bottom + local100.top;
			}
			if (Static2.anInt104 != local90 || local94 != Static218.anInt4396) {
				if (Static218.aClass46_5 == null || Static218.aClass46_5.method5088()) {
					Static65.method5181();
				} else {
					Static2.anInt104 = local90;
					Static218.anInt4396 = local94;
				}
				Static345.aLong213 = Static168.method3300() + 500L;
			}
		}
		if (Static267.aFrame1 != null && !Static131.aBoolean115 && (Static302.anInt5842 == 30 || Static302.anInt5842 == 10)) {
			Static288.method4959(false, -1, Static333.anInt6446, -1);
		}
		@Pc(168) boolean local168 = false;
		if (Static116.aBoolean180) {
			local168 = true;
			Static116.aBoolean180 = false;
		}
		if (local168) {
			Static102.method2261();
		}
		if (Static218.aClass46_5 != null && Static218.aClass46_5.method5134() || Static237.method4149() != 1) {
			Static7.method206();
		}
		if (Static302.anInt5842 == 0) {
			Static56.method1293(Static309.aColorArray2[Static81.anInt2000], Static353.aColorArray3[Static81.anInt2000], Static60.aColorArray1[Static81.anInt2000], Static339.aString93, local168, Static74.anInt5350);
		} else if (Static302.anInt5842 == 5) {
			Static4.method121(Static218.aClass46_5.method5134() | local168, Static164.aClass30_5, Static218.aClass46_5, Static60.aColorArray1[Static81.anInt2000].getRGB(), Static309.aColorArray2[Static81.anInt2000].getRGB(), Static353.aColorArray3[Static81.anInt2000].getRGB());
		} else if (Static302.anInt5842 == 10) {
			Static132.method2703();
		} else if (Static302.anInt5842 == 25 || Static302.anInt5842 == 28) {
			if (Static70.anInt1686 == 1) {
				if (Static60.anInt1455 < Static207.anInt4120) {
					Static60.anInt1455 = Static207.anInt4120;
				}
				local90 = (Static60.anInt1455 - Static207.anInt4120) * 50 / Static60.anInt1455;
				Static162.method3226(Static84.aString78 + "<br>(" + local90 + "%)", true, Static245.aClass30_7);
			} else if (Static70.anInt1686 == 2) {
				if (Static194.anInt3956 > Static105.anInt2338) {
					Static105.anInt2338 = Static194.anInt3956;
				}
				local90 = (Static105.anInt2338 - Static194.anInt3956) * 50 / Static105.anInt2338 + 50;
				Static162.method3226(Static84.aString78 + "<br>(" + local90 + "%)", true, Static245.aClass30_7);
			} else {
				Static162.method3226(Static84.aString78, true, Static245.aClass30_7);
			}
		} else if (Static302.anInt5842 == 30) {
			Static74.method4761(local19);
		} else if (Static302.anInt5842 == 40) {
			Static162.method3226(Static89.aString80 + "<br>" + Static355.aString253, true, Static245.aClass30_7);
		}
		if (Static9.anInt209 == 3) {
			for (local90 = 0; local90 < Static304.anInt5859; local90++) {
				@Pc(378) Rectangle local378 = Class14_Sub2_Sub17.aRectangleArray4[local90];
				if (Static127.aBooleanArray14[local90]) {
					Static218.aClass46_5.method5108(local378.width, local378.x, local378.height, -1996553985, local378.y);
				} else if (Static194.aBooleanArray17[local90]) {
					Static218.aClass46_5.method5108(local378.width, local378.x, local378.height, -1996554240, local378.y);
				}
			}
		}
		if (Static151.method3009()) {
			Static200.method3726(Static218.aClass46_5);
		}
		if ((Static302.anInt5842 == 30 || Static302.anInt5842 == 10) && Static9.anInt209 == 0 && Static237.method4149() == 1 && !local168 && Static12.aString8.equals("1.1")) {
			local90 = 0;
			for (local94 = 0; local94 < Static304.anInt5859; local94++) {
				if (Static194.aBooleanArray17[local94]) {
					Static194.aBooleanArray17[local94] = false;
					Static213.aRectangleArray1[local90++] = Class14_Sub2_Sub17.aRectangleArray4[local94];
				}
			}
			Static218.aClass46_5.method5142(Static213.aRectangleArray1, local90);
		} else if (Static302.anInt5842 != 0) {
			Static218.aClass46_5.method5118();
			for (local90 = 0; local90 < Static304.anInt5859; local90++) {
				Static194.aBooleanArray17[local90] = false;
			}
		}
		if (Static153.anInt3264 == 0) {
			Static15.method5425(15L);
		} else if (Static153.anInt3264 == 1) {
			Static15.method5425(10L);
		} else if (Static153.anInt3264 == 2) {
			Static15.method5425(5L);
		} else if (Static153.anInt3264 == 3) {
			Static15.method5425(2L);
		}
		if (Static147.aBoolean184) {
			Static54.method1260();
		}
		if (Static198.aBoolean251 && Static302.anInt5842 == 10 && Static324.anInt6226 != -1) {
			Static198.aBoolean251 = false;
			Static324.method5568(Static105.aClass15_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1041(@OriginalArg(0) int arg0) {
		Static285.anInt5448 = 0;
		Static64.aClass205_4 = null;
		Static155.aClass35_2.anInt1201++;
		Static155.aClass35_2.anInt1200 = arg0;
		Static70.aClass159_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1020() {
		if (Static302.anInt5842 == 1000) {
			return;
		}
		Static153.anInt3257++;
		if (Static153.anInt3257 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static2.anInt105 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static196.aRandom1.setSeed((long) Static2.anInt105);
		}
		this.method1035();
		if (Static243.aClass61_1 != null) {
			Static243.aClass61_1.method2083();
		}
		Static330.method5665();
		Static151.method3006();
		Static103.method2267();
		Static292.method4998();
		if (Static293.aClass72_1 != null) {
			@Pc(77) int local77 = Static293.aClass72_1.method2197();
			Static5.anInt4507 = local77;
		}
		if (Static218.aClass46_5 != null) {
			Static218.aClass46_5.method5104((int) Static168.method3300());
		}
		Static58.method1311();
		if (Static302.anInt5842 == 0) {
			this.method1046();
			Static187.method3587();
		} else if (Static302.anInt5842 == 5) {
			this.method1046();
			Static187.method3587();
		} else if (Static302.anInt5842 == 25 || Static302.anInt5842 == 28) {
			Static330.method5664();
		}
		if (Static302.anInt5842 == 10) {
			this.method1038();
			Static130.method2679();
			Static124.method2599();
			Static228.method4031();
		} else if (Static302.anInt5842 == 30) {
			Static132.method2705();
		} else if (Static302.anInt5842 == 40) {
			Static228.method4031();
			if (Static276.anInt5254 != -3) {
				if (Static276.anInt5254 == 15) {
					Static78.method1948();
				} else if (Static276.anInt5254 != 2) {
					Static198.method3705();
				}
			}
		}
		Static259.method4440(Static218.aClass46_5);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1044() {
		if (Static155.aClass35_2.anInt1201 > Static126.anInt2743) {
			Static182.anInt3769 = (Static155.aClass35_2.anInt1201 * 50 - 50) * 5;
			if (Static165.anInt5083 == Static109.anInt2429) {
				Static109.anInt2429 = Static273.anInt5185;
			} else {
				Static109.anInt2429 = Static165.anInt5083;
			}
			if (Static182.anInt3769 > 3000) {
				Static182.anInt3769 = 3000;
			}
			if (Static155.aClass35_2.anInt1201 >= 2 && Static155.aClass35_2.anInt1200 == 6) {
				this.method1017("js5connect_outofdate");
				Static302.anInt5842 = 1000;
				return;
			}
			if (Static155.aClass35_2.anInt1201 >= 4 && Static155.aClass35_2.anInt1200 == -1) {
				this.method1017("js5crc");
				Static302.anInt5842 = 1000;
				return;
			}
			if (Static155.aClass35_2.anInt1201 >= 4 && (Static302.anInt5842 == 0 || Static302.anInt5842 == 5)) {
				if (Static155.aClass35_2.anInt1200 == 7 || Static155.aClass35_2.anInt1200 == 9) {
					this.method1017("js5connect_full");
				} else if (Static155.aClass35_2.anInt1200 <= 0) {
					this.method1017("js5io");
				} else {
					this.method1017("js5connect");
				}
				Static302.anInt5842 = 1000;
				return;
			}
		}
		Static126.anInt2743 = Static155.aClass35_2.anInt1201;
		if (Static182.anInt3769 > 0) {
			Static182.anInt3769--;
			return;
		}
		try {
			if (Static285.anInt5448 == 0) {
				Static64.aClass205_4 = Static105.aClass15_2.method284(Static46.aString46, Static109.anInt2429);
				Static285.anInt5448++;
			}
			if (Static285.anInt5448 == 1) {
				if (Static64.aClass205_4.anInt6370 == 2) {
					this.method1041(1000);
					return;
				}
				if (Static64.aClass205_4.anInt6370 == 1) {
					Static285.anInt5448++;
				}
			}
			if (Static285.anInt5448 == 2) {
				Static70.aClass159_2 = new Class159((Socket) Static64.aClass205_4.anObject7, Static105.aClass15_2);
				@Pc(168) Class14_Sub4 local168 = new Class14_Sub4(5);
				local168.method2538(15);
				local168.method2541(564);
				Static70.aClass159_2.method4082(local168.aByteArray74, 5);
				Static285.anInt5448++;
				Static93.aLong62 = Static168.method3300();
			}
			if (Static285.anInt5448 == 3) {
				if (Static302.anInt5842 == 0 || Static302.anInt5842 == 5 || Static70.aClass159_2.method4083() > 0) {
					@Pc(226) int local226 = Static70.aClass159_2.method4086();
					if (local226 != 0) {
						this.method1041(local226);
						return;
					}
					Static285.anInt5448++;
				} else if (Static168.method3300() - Static93.aLong62 > 30000L) {
					this.method1041(1001);
					return;
				}
			}
			if (Static285.anInt5448 == 4) {
				@Pc(257) boolean local257 = Static302.anInt5842 == 5 || Static302.anInt5842 == 10 || Static302.anInt5842 == 28;
				Static155.aClass35_2.method1155(!local257, Static70.aClass159_2);
				Static285.anInt5448 = 0;
				Static64.aClass205_4 = null;
				Static70.aClass159_2 = null;
			}
		} catch (@Pc(274) IOException local274) {
			this.method1041(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1046() {
		if (!Static198.aBoolean251) {
			label222: while (true) {
				do {
					if (!Static64.method1507()) {
						break label222;
					}
				} while (Static81.aChar2 != 's' && Static81.aChar2 != 'S');
				Static198.aBoolean251 = true;
			}
		}
		@Pc(36) int local36;
		if (Static191.anInt3907 == 0) {
			@Pc(27) Runtime local27 = Runtime.getRuntime();
			local36 = (int) ((local27.totalMemory() - local27.freeMemory()) / 1024L);
			@Pc(39) long local39 = Static168.method3300();
			if (Static133.aLong140 == 0L) {
				Static133.aLong140 = local39;
			}
			if (local36 > 16384 && local39 - Static133.aLong140 < 5000L) {
				if (local39 - Static60.aLong50 > 1000L) {
					System.gc();
					Static60.aLong50 = local39;
				}
				Static339.aString93 = Static227.aString165;
				Static74.anInt5350 = 5;
			} else {
				Static339.aString93 = Static243.aString177;
				Static74.anInt5350 = 5;
				Static191.anInt3907 = 10;
			}
			return;
		}
		@Pc(82) int local82;
		if (Static191.anInt3907 == 10) {
			for (local82 = 0; local82 < 4; local82++) {
				Static75.aClass65Array1[local82] = Static46.method1138(Static195.anInt3965, Static298.anInt5716);
			}
			Static74.anInt5350 = 10;
			Static339.aString93 = Static325.aString232;
			Static191.anInt3907 = 20;
		} else if (Static191.anInt3907 == 20) {
			if (Static243.aClass61_1 == null) {
				Static243.aClass61_1 = new Class61(Static155.aClass35_2, Static40.aClass21_1);
			}
			if (Static243.aClass61_1.method2078()) {
				Static346.aClass143_116 = Static20.method450(true, 0, false);
				Static237.aClass143_89 = Static20.method450(true, 1, false);
				Static185.aClass143_75 = Static20.method450(true, 2, false);
				Static92.aClass143_51 = Static20.method450(true, 3, false);
				Static54.aClass143_38 = Static20.method450(true, 4, false);
				Static231.aClass143_85 = Static20.method450(true, 5, true);
				Static304.aClass143_106 = Static20.method450(false, 6, true);
				Static338.aClass143_114 = Static20.method450(true, 7, false);
				Static348.aClass143_98 = Static20.method450(true, 8, false);
				Static302.aClass143_105 = Static20.method450(true, 9, false);
				Static86.aClass143_49 = Static20.method450(true, 10, false);
				Static69.aClass143_42 = Static20.method450(true, 11, false);
				Static9.aClass143_8 = Static20.method450(true, 12, false);
				Static332.aClass143_111 = Static20.method450(true, 13, false);
				Static233.aClass143_86 = Static20.method450(false, 14, false);
				Static80.aClass143_48 = Static20.method450(true, 15, false);
				Static213.aClass143_80 = Static20.method450(true, 16, false);
				Static99.aClass143_53 = Static20.method450(true, 17, false);
				Static39.aClass143_25 = Static20.method450(true, 18, false);
				Static272.aClass143_96 = Static20.method450(true, 19, false);
				Static192.aClass143_77 = Static20.method450(true, 20, false);
				Static127.aClass143_59 = Static20.method450(true, 21, false);
				Static44.aClass143_30 = Static20.method450(true, 22, false);
				Static53.aClass143_37 = Static20.method450(true, 23, true);
				Static202.aClass143_79 = Static20.method450(true, 24, false);
				Static46.aClass143_32 = Static20.method450(true, 25, false);
				Static277.aClass143_97 = Static20.method450(true, 26, true);
				Static48.aClass143_34 = Static20.method450(true, 27, false);
				Static27.aClass143_18 = Static20.method450(true, 28, true);
				Static74.anInt5350 = 15;
				Static339.aString93 = Static327.aString235;
				Static191.anInt3907 = 30;
			} else {
				Static339.aString93 = Static47.aString49;
				Static74.anInt5350 = 12;
			}
		} else if (Static191.anInt3907 == 30) {
			local82 = 0;
			for (local36 = 0; local36 < 29; local36++) {
				local82 += Static329.aClass121_Sub1Array2[local36].method3320() * Static303.anIntArray650[local36] / 100;
			}
			if (local82 == 100) {
				Static74.anInt5350 = 20;
				Static339.aString93 = Static56.aString54;
				Static194.method3666(Static348.aClass143_98);
				Static31.method759(Static348.aClass143_98);
				Static191.anInt3907 = 40;
			} else {
				Static74.anInt5350 = 20;
				if (local82 != 0) {
					Static339.aString93 = Static24.aString24 + local82 + "%";
				}
			}
		} else if (Static191.anInt3907 == 40) {
			if (Static27.aClass143_18.method3752()) {
				this.method1030(Static27.aClass143_18.method3750(1));
				Static191.anInt3907 = 50;
				Static74.anInt5350 = 25;
				Static339.aString93 = Static312.aString226;
			} else {
				Static339.aString93 = Static347.aString248 + Static27.aClass143_18.method3755() + "%";
				Static74.anInt5350 = 25;
			}
		} else if (Static191.anInt3907 == 50) {
			Static275.method4678(Static181.aBoolean239);
			Static174.aClass14_Sub19_Sub4_3 = new Class14_Sub19_Sub4();
			Static174.aClass14_Sub19_Sub4_3.method5538();
			Static115.aClass26_7 = Static240.method5766(Static95.aCanvas2, 0, Static105.aClass15_2, 22050);
			Static115.aClass26_7.method4215(Static174.aClass14_Sub19_Sub4_3);
			Static27.method695(Static54.aClass143_38, Static174.aClass14_Sub19_Sub4_3, Static233.aClass143_86, Static80.aClass143_48);
			Static311.aClass26_12 = Static240.method5766(Static95.aCanvas2, 1, Static105.aClass15_2, 2048);
			Static49.aClass14_Sub19_Sub2_1 = new Class14_Sub19_Sub2();
			Static311.aClass26_12.method4215(Static49.aClass14_Sub19_Sub2_1);
			Static290.aClass204_1 = new Class204(22050, Static223.anInt5818);
			Static50.anInt1270 = Static304.aClass143_106.method3765("scape main");
			Static74.anInt5350 = 30;
			Static339.aString93 = Static254.aString184;
			Static191.anInt3907 = 60;
		} else if (Static191.anInt3907 == 60) {
			local82 = Static349.method5913(Static332.aClass143_111, Static348.aClass143_98);
			local36 = Static345.method5870();
			if (local82 < local36) {
				Static74.anInt5350 = 35;
				Static339.aString93 = Static38.aString36 + local82 * 100 / local36 + "%";
			} else {
				Static74.anInt5350 = 35;
				Static339.aString93 = Static140.aString108;
				Static191.anInt3907 = 70;
			}
		} else if (Static191.anInt3907 == 70) {
			local82 = Static98.method2215(Static348.aClass143_98);
			local36 = Static330.method5666();
			if (local36 > local82) {
				Static339.aString93 = Static47.aString48 + local82 * 100 / local36 + "%";
				Static74.anInt5350 = 40;
			} else {
				Static339.aString93 = Static115.aString95;
				Static191.anInt3907 = 80;
				Static74.anInt5350 = 40;
			}
		} else if (Static191.anInt3907 == 80) {
			if (Static277.aClass143_97.method3752()) {
				Static220.anInterface2_4 = new Class5(Static277.aClass143_97, Static302.aClass143_105, Static348.aClass143_98);
				Static191.anInt3907 = 90;
				Static74.anInt5350 = 45;
				Static339.aString93 = Static352.aString250;
			} else {
				Static339.aString93 = Static51.aString52 + Static277.aClass143_97.method3755() + "%";
				Static74.anInt5350 = 45;
			}
		} else if (Static191.anInt3907 == 90) {
			Static191.anInt3907 = 95;
			Static339.aString93 = Static223.aString217;
			Static74.anInt5350 = 50;
		} else if (Static191.anInt3907 == 95) {
			if (Static198.aBoolean251) {
				Static95.anInt2209 = 0;
				Static203.anInt6246 = 0;
				Static228.anInt4497 = 0;
				Static333.anInt6446 = 1;
				Static217.anInt4358 = 0;
			}
			Static198.aBoolean251 = true;
			Static324.method5568(Static105.aClass15_2);
			Static130.method2677();
			Static71.method5021(false, Static203.anInt6246);
			Static191.anInt3907 = 100;
			Static74.anInt5350 = 55;
			Static339.aString93 = Static180.aString130;
		} else if (Static191.anInt3907 == 100) {
			Static328.method5650(Static218.aClass46_5, Static348.aClass143_98, Static332.aClass143_111);
			Static74.anInt5350 = 60;
			Static339.aString93 = Static274.aString197;
			Static67.method1662(5);
			Static191.anInt3907 = 110;
		} else if (Static191.anInt3907 == 110) {
			Static185.aClass143_75.method3752();
			local82 = Static185.aClass143_75.method3755();
			Static213.aClass143_80.method3752();
			local82 += Static213.aClass143_80.method3755();
			Static99.aClass143_53.method3752();
			local82 += Static99.aClass143_53.method3755();
			Static39.aClass143_25.method3752();
			local82 += Static39.aClass143_25.method3755();
			Static272.aClass143_96.method3752();
			local82 += Static272.aClass143_96.method3755();
			Static192.aClass143_77.method3752();
			local82 += Static192.aClass143_77.method3755();
			Static127.aClass143_59.method3752();
			local82 += Static127.aClass143_59.method3755();
			Static44.aClass143_30.method3752();
			local82 += Static44.aClass143_30.method3755();
			Static202.aClass143_79.method3752();
			local82 += Static202.aClass143_79.method3755();
			Static46.aClass143_32.method3752();
			local82 += Static46.aClass143_32.method3755();
			Static48.aClass143_34.method3752();
			local82 += Static48.aClass143_34.method3755();
			if (local82 < 1100) {
				Static339.aString93 = Static31.aString29 + local82 / 11 + "%";
				Static74.anInt5350 = 65;
			} else {
				Static220.method3962(Static185.aClass143_75);
				Static269.method4581(Static185.aClass143_75);
				Static255.method4394(Static185.aClass143_75);
				Static41.method987(Static185.aClass143_75, Static338.aClass143_114);
				Static59.method1338(Static213.aClass143_80, Static338.aClass143_114);
				Static221.method3970(Static39.aClass143_25, Static338.aClass143_114);
				Static144.method2889(Static338.aClass143_114, Static272.aClass143_96);
				Static303.method5990(Static185.aClass143_75);
				Static85.method2091(Static346.aClass143_116, Static237.aClass143_89, Static192.aClass143_77);
				Static175.method3432(Static185.aClass143_75);
				Static47.method1148(Static338.aClass143_114, Static127.aClass143_59);
				Static343.method5857(Static44.aClass143_30);
				Static281.method4771(Static185.aClass143_75);
				Static170.method3322(Static348.aClass143_98, Static332.aClass143_111, Static338.aClass143_114, Static92.aClass143_51);
				Static190.method3628(Static185.aClass143_75);
				Static34.method3918(Static99.aClass143_53);
				Static224.method4013(new Class49(), Static46.aClass143_32, Static202.aClass143_79);
				Static288.method4952(Static46.aClass143_32, Static202.aClass143_79);
				Static237.method4152(Static185.aClass143_75);
				Static258.method4429(Static185.aClass143_75);
				Static100.method2245(Static185.aClass143_75);
				Static286.method4897(Static185.aClass143_75, Static348.aClass143_98);
				Static1.method5707(Static348.aClass143_98, Static185.aClass143_75);
				Static238.method4176(Static185.aClass143_75);
				Static24.method656(Static348.aClass143_98, Static185.aClass143_75);
				Static157.method3072(Static185.aClass143_75);
				Static104.method2274(Static185.aClass143_75);
				Static339.aString93 = Static137.aString104;
				Static74.anInt5350 = 65;
				Static63.method1498();
				Static191.anInt3907 = 120;
			}
		} else if (Static191.anInt3907 == 120) {
			local82 = Static181.method3502(Static348.aClass143_98);
			local36 = Static197.method3698();
			if (local82 < local36) {
				Static74.anInt5350 = 70;
				Static339.aString93 = Static250.aString182 + local82 * 100 / local36 + "%";
			} else {
				Static153.method3015(Static348.aClass143_98, Static218.aClass46_5);
				Static145.method5357(Static18.aClass2Array3);
				Static339.aString93 = Static15.aString227;
				Static191.anInt3907 = 130;
				Static74.anInt5350 = 70;
			}
		} else if (Static191.anInt3907 == 130) {
			Static16.aClass197_1 = new Class197();
			Static105.aClass15_2.method287(10, Static16.aClass197_1);
			Static74.anInt5350 = 75;
			Static339.aString93 = Static141.aString109;
			Static191.anInt3907 = 140;
		} else if (Static191.anInt3907 == 140) {
			if (Static86.aClass143_49.method3762("", "huffman")) {
				@Pc(1028) Class218 local1028 = new Class218(Static86.aClass143_49.method3746("huffman", ""));
				Static97.method2211(local1028);
				Static191.anInt3907 = 150;
				Static339.aString93 = Static340.aString240;
				Static74.anInt5350 = 80;
			} else {
				Static74.anInt5350 = 80;
				Static339.aString93 = Static345.aString245 + "0%";
			}
		} else if (Static191.anInt3907 == 150) {
			if (!Static92.aClass143_51.method3752()) {
				Static339.aString93 = Static301.aString216 + Static92.aClass143_51.method3755() * 3 / 4 + "%";
				Static74.anInt5350 = 85;
			} else if (!Static9.aClass143_8.method3752()) {
				Static339.aString93 = Static301.aString216 + (Static9.aClass143_8.method3755() / 10 + 75) + "%";
				Static74.anInt5350 = 85;
			} else if (!Static332.aClass143_111.method3752()) {
				Static339.aString93 = Static301.aString216 + (Static332.aClass143_111.method3755() / 20 + 85) + "%";
				Static74.anInt5350 = 85;
			} else if (Static53.aClass143_37.method3754("details")) {
				Static241.method5051(Static53.aClass143_37);
				Static189.method5491(Static48.aClass143_34);
				Static149.method2997(Static338.aClass143_114, Static220.anInterface2_4);
				Static339.aString93 = Static140.aString107;
				Static74.anInt5350 = 85;
				Static191.anInt3907 = 160;
			} else {
				Static339.aString93 = Static301.aString216 + (Static53.aClass143_37.method3731("details") / 10 + 90) + "%";
				Static74.anInt5350 = 85;
			}
		} else if (Static191.anInt3907 == 160) {
			local82 = Static302.method5296();
			if (local82 == -1) {
				Static74.anInt5350 = 90;
				Static339.aString93 = Static347.aString247;
			} else if (local82 == 7 || local82 == 9) {
				this.method1017("worldlistfull");
				Static67.method1662(1000);
			} else if (Static232.aBoolean154) {
				Static339.aString93 = Static243.aString176;
				Static74.anInt5350 = 90;
				Static191.anInt3907 = 170;
			} else {
				this.method1017("worldlistio_" + local82);
				Static67.method1662(1000);
			}
		} else if (Static191.anInt3907 == 170) {
			Static120.aBooleanArray12 = new boolean[Static46.anInt1172];
			Static30.anIntArray45 = new int[Static46.anInt1172];
			Static147.aStringArray35 = new String[Static355.anInt6754];
			for (local82 = 0; local82 < Static46.anInt1172; local82++) {
				if (Static77.method1919(local82).anInt896 == 0) {
					Static120.aBooleanArray12[local82] = true;
					Static142.anInt3017++;
				}
				Static30.anIntArray45[local82] = -1;
			}
			Static121.method2585();
			Static332.anInt6436 = Static92.aClass143_51.method3765("loginscreen");
			Static231.aClass143_85.method3757(false);
			Static304.aClass143_106.method3757(true);
			Static348.aClass143_98.method3757(true);
			Static332.aClass143_111.method3757(true);
			Static86.aClass143_49.method3757(true);
			Static92.aClass143_51.method3757(true);
			Static185.aClass143_75.anInt4082 = 2;
			Static147.aBoolean184 = true;
			Static99.aClass143_53.anInt4082 = 2;
			Static213.aClass143_80.anInt4082 = 2;
			Static39.aClass143_25.anInt4082 = 2;
			Static272.aClass143_96.anInt4082 = 2;
			Static192.aClass143_77.anInt4082 = 2;
			Static127.aClass143_59.anInt4082 = 2;
			Static288.method4959(false, -1, Static333.anInt6446, -1);
			Static191.anInt3907 = 180;
			Static74.anInt5350 = 95;
			Static339.aString93 = Static206.aString252;
		} else if (Static191.anInt3907 == 180) {
			Static351.method5919(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1014()) {
			return;
		}
		Static56.anInt1376 = Integer.parseInt(this.getParameter("worldid"));
		Static322.anInt6208 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static322.anInt6208 < 0 || Static322.anInt6208 > 1) {
			Static322.anInt6208 = 0;
		}
		Static131.anInt1769 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static131.anInt1769 < 0 || Static131.anInt1769 > 2) {
			Static131.anInt1769 = 0;
		}
		try {
			Static201.anInt4054 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(46) Exception local46) {
			Static201.anInt4054 = 0;
		}
		Static155.method3047(Static201.anInt4054);
		@Pc(55) String local55 = this.getParameter("objecttag");
		if (local55 != null && local55.equals("1")) {
			Static237.aBoolean305 = true;
		} else {
			Static237.aBoolean305 = false;
		}
		@Pc(71) String local71 = this.getParameter("js");
		if (local71 != null && local71.equals("1")) {
			Static76.aBoolean124 = true;
		} else {
			Static76.aBoolean124 = false;
		}
		@Pc(87) String local87 = this.getParameter("game");
		if (local87 != null && local87.equals("1")) {
			Static45.anInt1136 = 1;
		} else {
			Static45.anInt1136 = 0;
		}
		try {
			Static74.anInt5346 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(106) Exception local106) {
			Static74.anInt5346 = 0;
		}
		Static65.aString212 = this.getParameter("quiturl");
		Static323.aString38 = this.getParameter("settings");
		if (Static323.aString38 == null) {
			Static323.aString38 = "";
		}
		@Pc(124) String local124 = this.getParameter("country");
		if (local124 != null) {
			try {
				Static47.anInt1198 = Integer.parseInt(local124);
			} catch (@Pc(131) Exception local131) {
				Static47.anInt1198 = 0;
			}
		}
		Static81.anInt2000 = Integer.parseInt(this.getParameter("colourid"));
		if (Static81.anInt2000 < 0 || Static60.aColorArray1.length <= Static81.anInt2000) {
			Static81.anInt2000 = 0;
		}
		Static353.aClient1 = this;
		this.method1009(Static131.anInt1769 + 32);
	}
}
