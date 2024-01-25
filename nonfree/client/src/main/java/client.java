import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static554.method7555("Argument count");
			}
			Static330.aClass227_1 = new Class227();
			Static330.aClass227_1.anInt5547 = Integer.parseInt(arg0[0]);
			Static536.aClass227_4 = new Class227();
			Static536.aClass227_4.anInt5547 = Integer.parseInt(arg0[1]);
			Static553.aClass227_5 = new Class227();
			Static553.aClass227_5.anInt5547 = Integer.parseInt(arg0[2]);
			Static357.aClass308_6 = Static77.aClass308_2;
			if (arg0[3].equals("live")) {
				Static460.aClass283_5 = Static223.aClass283_2;
			} else if (arg0[3].equals("rc")) {
				Static460.aClass283_5 = Static198.aClass283_1;
			} else if (arg0[3].equals("wip")) {
				Static460.aClass283_5 = Static245.aClass283_3;
			} else {
				Static554.method7555("modewhat");
			}
			Static307.anInt5279 = Static458.method6318(arg0[4]);
			if (Static307.anInt5279 == -1) {
				if (arg0[4].equals("english")) {
					Static307.anInt5279 = 0;
				} else if (arg0[4].equals("german")) {
					Static307.anInt5279 = 1;
				} else {
					Static554.method7555("language");
				}
			}
			Static114.aBoolean166 = false;
			Static566.aBoolean734 = false;
			if (arg0[5].equals("game0")) {
				Static246.aClass195_2 = Static184.aClass195_1;
			} else if (arg0[5].equals("game1")) {
				Static246.aClass195_2 = Static586.aClass195_4;
			} else {
				Static554.method7555("game");
			}
			Static530.aBoolean692 = true;
			Static82.aBoolean143 = true;
			Static200.anInt3986 = 0;
			Static337.anInt8003 = Static246.aClass195_2.anInt4912;
			Static103.aBoolean162 = false;
			Static480.aLong248 = 0L;
			Static499.aString36 = "";
			Static47.anInt802 = 0;
			Static508.aString87 = null;
			Static590.anInt9609 = 0;
			Static194.aString33 = null;
			Static22.aBoolean26 = false;
			@Pc(167) client local167 = new client();
			Static399.aClient1 = local167;
			local167.method1131(Static460.aClass283_5.method6125() + 32, Static246.aClass195_2.aString45);
			Static142.aFrame1.setLocation(40, 40);
		} catch (@Pc(190) Exception local190) {
			Static345.method4708(local190, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1122()) {
			return;
		}
		Static330.aClass227_1 = new Class227();
		Static330.aClass227_1.anInt5547 = Integer.parseInt(this.getParameter("worldid"));
		Static536.aClass227_4 = new Class227();
		Static536.aClass227_4.anInt5547 = Integer.parseInt(this.getParameter("lobbyid"));
		Static536.aClass227_4.aString53 = this.getParameter("lobbyaddress");
		Static553.aClass227_5 = new Class227();
		Static553.aClass227_5.anInt5547 = Integer.parseInt(this.getParameter("demoid"));
		Static553.aClass227_5.aString53 = this.getParameter("demoaddress");
		Static357.aClass308_6 = Static356.method4859(Integer.parseInt(this.getParameter("modewhere")));
		if (Static357.aClass308_6 == Static77.aClass308_2) {
			Static357.aClass308_6 = Static354.aClass308_5;
		} else if (!Static527.method7250(Static357.aClass308_6) && Static357.aClass308_6 != Static199.aClass308_3) {
			Static357.aClass308_6 = Static199.aClass308_3;
		}
		Static460.aClass283_5 = Static503.method7039(Integer.parseInt(this.getParameter("modewhat")));
		if (Static245.aClass283_3 != Static460.aClass283_5 && Static460.aClass283_5 != Static198.aClass283_1 && Static460.aClass283_5 != Static223.aClass283_2) {
			Static460.aClass283_5 = Static223.aClass283_2;
		}
		try {
			Static307.anInt5279 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static307.anInt5279 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static114.aBoolean166 = true;
		} else {
			Static114.aBoolean166 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static566.aBoolean734 = true;
		} else {
			Static566.aBoolean734 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static484.aBoolean624 = true;
		} else {
			Static484.aBoolean624 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static246.aClass195_2 = Static184.aClass195_1;
			} else if (local152.equals("1")) {
				Static246.aClass195_2 = Static586.aClass195_4;
			}
		}
		try {
			Static47.anInt802 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static47.anInt802 = 0;
		}
		Static367.aString60 = this.getParameter("quiturl");
		Static499.aString36 = this.getParameter("settings");
		if (Static499.aString36 == null) {
			Static499.aString36 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static590.anInt9609 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static590.anInt9609 = 0;
			}
		}
		Static337.anInt8003 = Integer.parseInt(this.getParameter("colourid"));
		if (Static337.anInt8003 < 0 || Static337.anInt8003 >= Static341.aColorArray2.length) {
			Static337.anInt8003 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static530.aBoolean692 = true;
			Static82.aBoolean143 = true;
		}
		@Pc(234) String local234 = this.getParameter("frombilling");
		if (local234 != null && local234.equals("true")) {
			Static22.aBoolean26 = true;
		}
		Static194.aString33 = this.getParameter("sskey");
		if (Static194.aString33 != null && Static194.aString33.length() < 2) {
			Static194.aString33 = null;
		}
		@Pc(260) String local260 = this.getParameter("force64mb");
		if (local260 != null && local260.equals("true")) {
			Static103.aBoolean162 = true;
		}
		@Pc(272) String local272 = this.getParameter("worldflags");
		if (local272 != null) {
			try {
				Static200.anInt3986 = Integer.parseInt(local272);
			} catch (@Pc(279) Exception local279) {
			}
		}
		@Pc(284) String local284 = this.getParameter("userFlow");
		if (local284 != null) {
			try {
				Static480.aLong248 = Long.parseLong(local284);
			} catch (@Pc(291) NumberFormatException local291) {
			}
		}
		Static508.aString87 = this.getParameter("additionalInfo");
		if (Static508.aString87 != null && Static508.aString87.length() > 50) {
			Static508.aString87 = null;
		}
		if (Static246.aClass195_2 == Static184.aClass195_1) {
			Static103.anInt2084 = 503;
			Static573.anInt9475 = 765;
		} else if (Static586.aClass195_4 == Static246.aClass195_2) {
			Static573.anInt9475 = 640;
			Static103.anInt2084 = 480;
		}
		Static399.aClient1 = this;
		this.method1117(Static573.anInt9475, Static460.aClass283_5.method6125() + 32, Static246.aClass195_2.aString45, Static103.anInt2084);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1127() {
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1136() {
		if (Static396.aClass9_1.anInt190 > Static196.anInt3663) {
			Static382.aClass227_2.method4534();
			Static67.anInt1366 = (Static396.aClass9_1.anInt190 * 50 - 50) * 5;
			if (Static67.anInt1366 > 3000) {
				Static67.anInt1366 = 3000;
			}
			if (Static396.aClass9_1.anInt190 >= 2 && Static396.aClass9_1.anInt191 == 6) {
				this.method1119("js5connect_outofdate");
				Static216.anInt4135 = 14;
				return;
			}
			if (Static396.aClass9_1.anInt190 >= 4 && Static396.aClass9_1.anInt191 == -1) {
				this.method1119("js5crc");
				Static216.anInt4135 = 14;
				return;
			}
			if (Static396.aClass9_1.anInt190 >= 4 && Static179.method7292(Static216.anInt4135)) {
				if (Static396.aClass9_1.anInt191 == 7 || Static396.aClass9_1.anInt191 == 9) {
					this.method1119("js5connect_full");
				} else if (Static396.aClass9_1.anInt191 <= 0) {
					this.method1119("js5io");
				} else if (Static461.aString76 == null) {
					this.method1119("js5connect");
				} else {
					this.method1119("js5proxy_" + Static461.aString76.trim());
				}
				Static216.anInt4135 = 14;
				return;
			}
		}
		Static196.anInt3663 = Static396.aClass9_1.anInt190;
		if (Static67.anInt1366 > 0) {
			Static67.anInt1366--;
			return;
		}
		try {
			if (Static124.anInt6630 == 0) {
				Static111.aClass260_2 = Static382.aClass227_2.method4535(Static362.aClass109_5);
				Static124.anInt6630++;
			}
			if (Static124.anInt6630 == 1) {
				if (Static111.aClass260_2.anInt7041 == 2) {
					if (Static111.aClass260_2.anObject16 != null) {
						Static461.aString76 = (String) Static111.aClass260_2.anObject16;
					}
					this.method1144(1000);
					return;
				}
				if (Static111.aClass260_2.anInt7041 == 1) {
					Static124.anInt6630++;
				}
			}
			if (Static124.anInt6630 == 2) {
				Static105.aClass221_2 = new Class221((Socket) Static111.aClass260_2.anObject16, Static362.aClass109_5);
				@Pc(201) Class1_Sub35 local201 = new Class1_Sub35(5);
				local201.method5777(Static420.aClass128_2.anInt3034);
				local201.method5792(618);
				Static105.aClass221_2.method4414(local201.aByteArray85, 5);
				Static124.anInt6630++;
				Static102.aLong66 = Static413.method5668();
			}
			if (Static124.anInt6630 == 3) {
				if (Static179.method7292(Static216.anInt4135) || Static105.aClass221_2.method4420() > 0) {
					@Pc(241) int local241 = Static105.aClass221_2.method4418();
					if (local241 != 0) {
						this.method1144(local241);
						return;
					}
					Static124.anInt6630++;
				} else if (Static413.method5668() - Static102.aLong66 > 30000L) {
					this.method1144(1001);
					return;
				}
			}
			if (Static124.anInt6630 == 4) {
				@Pc(293) boolean local293 = Static179.method7292(Static216.anInt4135) || Static9.method101(Static216.anInt4135) || Static237.method3602(Static216.anInt4135);
				@Pc(296) Class138[] local296 = Static191.method2933();
				@Pc(304) Class1_Sub35 local304 = new Class1_Sub35(local296.length * 4);
				Static105.aClass221_2.method4413(local304.aByteArray85, local304.aByteArray85.length, 0);
				for (@Pc(315) int local315 = 0; local315 < local296.length; local315++) {
					local296[local315].method2935(local304.method5804());
				}
				Static396.aClass9_1.method141(!local293, Static105.aClass221_2);
				Static111.aClass260_2 = null;
				Static105.aClass221_2 = null;
				Static124.anInt6630 = 0;
			}
		} catch (@Pc(351) IOException local351) {
			this.method1144(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1139() {
		@Pc(32) int local32;
		if (Static216.anInt4135 == 7 && Static181.anInt3169 == 0) {
			if (Static388.anInt6676 > 1) {
				Static127.anInt2535 = Static233.anInt8002;
				Static388.anInt6676--;
			}
			if (!Static554.aBoolean708) {
				Static434.method6067();
			}
			for (local32 = 0; local32 < 100 && Static308.method4289(); local32++) {
			}
		}
		Static504.anInt5717++;
		Static195.method2979(null, -1, -1);
		Static265.method3804(-1, null, -1);
		Static275.method3877();
		Static233.anInt8002++;
		for (local32 = 0; local32 < Static35.anInt540; local32++) {
			@Pc(76) Class8_Sub3_Sub3_Sub1_Sub2 local76 = Static466.aClass1_Sub42Array1[local32].aClass8_Sub3_Sub3_Sub1_Sub2_2;
			if (local76 != null) {
				@Pc(82) byte local82 = local76.aClass20_1.aByte17;
				if ((local82 & 0x1) != 0) {
					@Pc(93) int local93 = local76.method5434();
					@Pc(117) int local117;
					if ((local82 & 0x2) != 0 && local76.anInt6859 == 0 && Math.random() * 1000.0D < 10.0D) {
						local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(125) int local125 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local117 != 0 || local125 != 0) {
							@Pc(139) int local139 = local117 + local76.anIntArray534[0];
							if (local139 < 0) {
								local139 = 0;
							} else if (local139 > Static71.anInt1410 - local93 - 1) {
								local139 = Static71.anInt1410 - local93 - 1;
							}
							@Pc(170) int local170 = local125 + local76.anIntArray533[0];
							if (local170 < 0) {
								local170 = 0;
							} else if (Static471.anInt8012 - local93 - 1 < local170) {
								local170 = Static471.anInt8012 - local93 - 1;
							}
							@Pc(224) int local224 = Static210.method3321(local76.anIntArray534[0], 0, local93, local76.anIntArray533[0], Static149.anIntArray231, Static478.aClass59Array2[local76.aByte123], local170, true, local139, local93, -1, 0, Static546.anIntArray686, local93);
							if (local224 > 0) {
								if (local224 > 9) {
									local224 = 9;
								}
								for (@Pc(236) int local236 = 0; local236 < local224; local236++) {
									local76.anIntArray534[local236] = Static546.anIntArray686[local224 - local236 - 1];
									local76.anIntArray533[local236] = Static149.anIntArray231[local224 - local236 - 1];
									local76.aByteArray82[local236] = 1;
								}
								local76.anInt6859 = local224;
							}
						}
					}
					Static243.method3636(true, local76);
					local117 = Static305.method4284(local76);
					Static561.method7603(local117, Static580.anInt9539, local76, Static380.anInt6324);
					Static427.method5931(local76, Static580.anInt9539);
					Static387.method5337(local76);
				}
			}
		}
		if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
			if (Static340.anInt5707 == 2) {
				Static329.method4512();
			} else {
				Static554.method7559();
			}
			if (Static405.anInt7085 >> 9 < 14 || Static71.anInt1410 - 14 <= Static405.anInt7085 >> 9 || Static59.anInt1132 >> 9 < 14 || Static59.anInt1132 >> 9 >= Static471.anInt8012 - 14) {
				Static338.method7634();
			}
		}
		while (true) {
			@Pc(357) Class1_Sub15 local357;
			@Pc(362) Class341 local362;
			@Pc(373) Class341 local373;
			do {
				local357 = (Class1_Sub15) Static373.aClass353_45.method7688();
				if (local357 == null) {
					while (true) {
						do {
							local357 = (Class1_Sub15) Static173.aClass353_14.method7688();
							if (local357 == null) {
								while (true) {
									do {
										local357 = (Class1_Sub15) Static567.aClass353_64.method7688();
										if (local357 == null) {
											if (Static93.aClass341_8 != null) {
												Static25.method274();
											}
											if (Static301.anInt5197 % 1500 == 0) {
												Static260.method3769();
											}
											if (Static216.anInt4135 == 7 && Static181.anInt3169 == 0) {
												Static243.method3639();
											}
											Static38.method541();
											if (Static151.aBoolean207 && Static172.aLong98 < Static413.method5668() - 60000L) {
												Static356.method4864();
											}
											for (@Pc(526) Class8_Sub2_Sub2 local526 = (Class8_Sub2_Sub2) Static378.aClass209_4.method4194(); local526 != null; local526 = (Class8_Sub2_Sub2) Static378.aClass209_4.method4191()) {
												if ((long) local526.anInt9076 < Static413.method5668() / 1000L - 5L) {
													if (local526.aShort124 > 0) {
														Static83.method1476(5, 0, "", "", "", local526.aString89 + Static568.aClass351_23.method7651(Static307.anInt5279));
													}
													if (local526.aShort124 == 0) {
														Static83.method1476(5, 0, "", "", "", local526.aString89 + Static568.aClass351_24.method7651(Static307.anInt5279));
													}
													local526.method7615();
												}
											}
											if (Static216.anInt4135 == 7 && Static181.anInt3169 == 0) {
												if (Static568.aClass149_2 == null) {
													Static424.method5868(false);
													return;
												}
												Static516.anInt8761++;
												if (Static516.anInt8761 > 50) {
													@Pc(635) Class1_Sub11 local635 = Static276.method3885(Static28.aClass70_6, Static481.aClass276_2);
													Static48.method743(local635);
												}
												try {
													Static173.method2438();
													return;
												} catch (@Pc(642) IOException local642) {
													Static424.method5868(false);
													return;
												}
											}
											return;
										}
										local362 = local357.aClass341_10;
										if (local362.anInt9270 < 0) {
											break;
										}
										local373 = Static350.method4758(local362.anInt9252);
									} while (local373 == null || local373.aClass341Array2 == null || local373.aClass341Array2.length <= local362.anInt9270 || local373.aClass341Array2[local362.anInt9270] != local362);
									Static80.method1451(local357);
								}
							}
							local362 = local357.aClass341_10;
							if (local362.anInt9270 < 0) {
								break;
							}
							local373 = Static350.method4758(local362.anInt9252);
						} while (local373 == null || local373.aClass341Array2 == null || local373.aClass341Array2.length <= local362.anInt9270 || local373.aClass341Array2[local362.anInt9270] != local362);
						Static80.method1451(local357);
					}
				}
				local362 = local357.aClass341_10;
				if (local362.anInt9270 < 0) {
					break;
				}
				local373 = Static350.method4758(local362.anInt9252);
			} while (local373 == null || local373.aClass341Array2 == null || local362.anInt9270 >= local373.aClass341Array2.length || local373.aClass341Array2[local362.anInt9270] != local362);
			Static80.method1451(local357);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1140() {
		if (Static216.anInt4135 == 14) {
			return;
		}
		Static301.anInt5197++;
		if (Static301.anInt5197 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static410.anInt7111 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static360.aRandom3.setSeed((long) Static410.anInt7111);
		}
		if (Static301.anInt5197 % 50 == 0) {
			Static159.anInt2868 = Static344.anInt5736;
			Static405.anInt7086 = Static256.anInt4626;
			Static344.anInt5736 = 0;
			Static256.anInt4626 = 0;
		}
		this.method1142();
		if (Static371.aClass298_1 != null) {
			Static371.aClass298_1.method6399();
		}
		Static311.method4314();
		Static137.aClass295_1.method7715();
		Static166.aClass25_1.method4781();
		if (Static16.aClass134_1 != null) {
			Static16.aClass134_1.method6925((int) Static413.method5668());
		}
		Static427.method5928();
		Static19.anInt242 = 0;
		Static594.anInt9654 = 0;
		for (@Pc(106) Interface22 local106 = Static137.aClass295_1.method7720(); local106 != null; local106 = Static137.aClass295_1.method7720()) {
			@Pc(112) int local112 = local106.method4451();
			if (local112 == 2 || local112 == 3) {
				@Pc(126) char local126 = local106.method4453();
				if (Static459.method6335() && (local126 == '`' || local126 == '§' || local126 == '²')) {
					if (Static394.method5441()) {
						Static45.method705();
					} else {
						Static218.method3381();
					}
				} else if (Static594.anInt9654 < 128) {
					Static398.anInterface22Array1[Static594.anInt9654] = local106;
					Static594.anInt9654++;
				}
			} else if (local112 == 0 && Static19.anInt242 < 75) {
				Static425.anInterface22Array2[Static19.anInt242] = local106;
				Static19.anInt242++;
			}
		}
		Static587.anInt9589 = 0;
		for (@Pc(191) Class1_Sub16 local191 = Static166.aClass25_1.method4782(); local191 != null; local191 = Static166.aClass25_1.method4782()) {
			@Pc(199) int local199 = local191.method3646();
			if (local199 == -1) {
				Static167.aClass353_13.method7679(local191);
			} else if (local199 == 6) {
				Static587.anInt9589 += local191.method3648();
			} else if (Static143.method2153(local199)) {
				Static587.aClass353_67.method7679(local191);
				if (Static587.aClass353_67.method7682() > 10) {
					Static587.aClass353_67.method7688();
				}
			}
		}
		if (Static394.method5441()) {
			Static293.method4120();
		}
		if (Static179.method7292(Static216.anInt4135)) {
			Static89.method1549();
			Static483.method6529();
		} else if (Static483.method6541(Static216.anInt4135)) {
			Static376.method5047();
		}
		if (Static9.method101(Static216.anInt4135) && !Static483.method6541(Static216.anInt4135)) {
			this.method1139();
			Static396.method5491();
			Static206.method3270();
		} else if (Static237.method3602(Static216.anInt4135) && !Static483.method6541(Static216.anInt4135)) {
			this.method1139();
			Static206.method3270();
		} else if (Static216.anInt4135 == 12) {
			Static206.method3270();
		} else if (Static443.method6122(Static216.anInt4135) && !Static483.method6541(Static216.anInt4135)) {
			Static233.method6434();
		} else if (Static216.anInt4135 == 13) {
			Static206.method3270();
			if (Static166.anInt2967 != -3 && Static166.anInt2967 != 2 && Static166.anInt2967 != 15) {
				Static424.method5868(false);
			}
		}
		Static187.method6744(Static16.aClass134_1);
		Static587.aClass353_67.method7688();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1126() {
		if (Static113.anInt2222 != 2) {
			this.method1145();
			return;
		}
		try {
			this.method1145();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static345.method4708(local22, local22.getMessage() + " (Recovered) " + this.method1124());
			Static523.method7235(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	@Override
	protected void method1133() {
		if (Static103.aBoolean162) {
			Static117.anInt2297 = 64;
		}
		@Pc(20) Frame local20 = new Frame("Jagex");
		local20.pack();
		local20.dispose();
		Static118.method1851();
		Static314.aClass229_1 = new Class229(Static362.aClass109_5);
		Static396.aClass9_1 = new Class9();
		Static541.method7391(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static199.aClass308_3 != Static357.aClass308_6) {
			Static154.aByteArrayArray14 = new byte[50][];
		}
		Static348.aClass1_Sub30_Sub1_1 = new Class1_Sub30_Sub1(Static362.aClass109_5);
		if (Static357.aClass308_6 == Static199.aClass308_3) {
			Static330.aClass227_1.aString53 = this.getCodeBase().getHost();
		} else if (Static527.method7250(Static357.aClass308_6)) {
			Static330.aClass227_1.aString53 = this.getCodeBase().getHost();
			Static330.aClass227_1.anInt5546 = Static330.aClass227_1.anInt5547 + 40000;
			Static536.aClass227_4.anInt5546 = Static536.aClass227_4.anInt5547 + 40000;
			Static330.aClass227_1.anInt5548 = Static330.aClass227_1.anInt5547 + 50000;
			Static553.aClass227_5.anInt5546 = Static553.aClass227_5.anInt5547 + 40000;
			Static536.aClass227_4.anInt5548 = Static536.aClass227_4.anInt5547 + 50000;
			Static553.aClass227_5.anInt5548 = Static553.aClass227_5.anInt5547 + 50000;
		} else if (Static77.aClass308_2 == Static357.aClass308_6) {
			Static330.aClass227_1.aString53 = "127.0.0.1";
			Static536.aClass227_4.aString53 = "127.0.0.1";
			Static553.aClass227_5.aString53 = "127.0.0.1";
			Static330.aClass227_1.anInt5546 = Static330.aClass227_1.anInt5547 + 40000;
			Static536.aClass227_4.anInt5546 = Static536.aClass227_4.anInt5547 + 40000;
			Static553.aClass227_5.anInt5546 = Static553.aClass227_5.anInt5547 + 40000;
			Static330.aClass227_1.anInt5548 = Static330.aClass227_1.anInt5547 + 50000;
			Static536.aClass227_4.anInt5548 = Static536.aClass227_4.anInt5547 + 50000;
			Static553.aClass227_5.anInt5548 = Static553.aClass227_5.anInt5547 + 50000;
		}
		Static382.aClass227_2 = Static330.aClass227_1;
		if (Static184.aClass195_1 == Static246.aClass195_2) {
			Static73.aBoolean60 = false;
		}
		if (Static586.aClass195_4 == Static246.aClass195_2) {
			Static197.aBoolean491 = true;
			Static324.anInt5457 = 0;
			Static177.aShortArrayArray2 = Static372.aShortArrayArray8;
			Static261.aShortArrayArrayArray1 = Static365.aShortArrayArrayArray2;
			Static191.anInt3566 = 16777215;
		} else {
			Static177.aShortArrayArray2 = Static15.aShortArrayArray1;
			Static261.aShortArrayArrayArray1 = Static526.aShortArrayArrayArray3;
		}
		Static433.aShortArray128 = Static57.aShortArray96 = Static179.aShortArray140 = Static537.aShortArray142 = new short[256];
		try {
			Static314.aClipboard1 = Static399.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(214) Exception local214) {
		}
		Static137.aClass295_1 = Static48.method741(Static499.aCanvas9);
		Static166.aClass25_1 = Static283.method3951(Static499.aCanvas9);
		try {
			if (Static362.aClass109_5.aClass91_1 != null) {
				Static306.aClass363_4 = new Class363(Static362.aClass109_5.aClass91_1, 5200, 0);
				for (@Pc(238) int local238 = 0; local238 < 35; local238++) {
					Static253.aClass363Array1[local238] = new Class363(Static362.aClass109_5.aClass91Array1[local238], 6000, 0);
				}
				Static335.aClass363_5 = new Class363(Static362.aClass109_5.aClass91_3, 6000, 0);
				Static565.aClass360_6 = new Class360(255, Static306.aClass363_4, Static335.aClass363_5, 500000);
				Static26.aClass363_1 = new Class363(Static362.aClass109_5.aClass91_2, 24, 0);
				Static362.aClass109_5.aClass91_2 = null;
				Static362.aClass109_5.aClass91_1 = null;
				Static362.aClass109_5.aClass91_3 = null;
				Static362.aClass109_5.aClass91Array1 = null;
			}
		} catch (@Pc(296) IOException local296) {
			Static306.aClass363_4 = null;
			Static26.aClass363_1 = null;
			Static565.aClass360_6 = null;
			Static335.aClass363_5 = null;
		}
		if (Static199.aClass308_3 != Static357.aClass308_6) {
			Static57.aBoolean487 = true;
		}
		if (Static246.aClass195_2 == Static184.aClass195_1) {
			Static410.aString70 = Static568.aClass351_3.method7651(Static307.anInt5279);
		} else if (Static586.aClass195_4 == Static246.aClass195_2) {
			Static410.aString70 = Static568.aClass351_4.method7651(Static307.anInt5279);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1124() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static541.anInt9058 + "," + Static116.anInt2289 + "," + Static71.anInt1410 + "," + Static471.anInt8012 + "|";
			if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 != null) {
				local7 = local7 + "2)" + Static433.anInt7592 + "," + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] + Static541.anInt9058) + "," + (Static116.anInt2289 + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0]) + "|";
			}
			local7 = local7 + "3)" + Static113.anInt2222 + "|4)" + Static348.aClass1_Sub30_Sub1_1.anInt4869 + "|5)" + Static195.method2980() + "|6)" + Static130.anInt2566 + "," + Static499.anInt4149 + "|";
			local7 = local7 + "7)" + Static348.aClass1_Sub30_Sub1_1.method3907(Static113.anInt2222) + "|";
			local7 = local7 + "8)" + Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222) + "|";
			local7 = local7 + "9)" + Static348.aClass1_Sub30_Sub1_1.aBoolean391 + "|";
			local7 = local7 + "10)" + Static348.aClass1_Sub30_Sub1_1.aBoolean397 + "|";
			local7 = local7 + "11)" + Static348.aClass1_Sub30_Sub1_1.aBoolean390 + "|";
			local7 = local7 + "12)" + Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222) + "|";
			local7 = local7 + "13)" + Static117.anInt2297 + "|";
			local7 = local7 + "14)" + Static216.anInt4135;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(229) Throwable local229) {
			}
			try {
				if (Static113.anInt2222 == 2) {
					@Pc(237) Class local237 = Class.forName("java.lang.ClassLoader");
					@Pc(241) Field local241 = local237.getDeclaredField("nativeLibraries");
					@Pc(244) Class local244 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(254) Method local254 = local244.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local254.invoke(local241, Boolean.TRUE);
					@Pc(277) Vector local277 = (Vector) local241.get(client.class.getClassLoader());
					for (@Pc(279) int local279 = 0; local277.size() > local279; local279++) {
						try {
							@Pc(285) Object local285 = local277.elementAt(local279);
							@Pc(290) Field local290 = local285.getClass().getDeclaredField("name");
							local254.invoke(local290, Boolean.TRUE);
							try {
								@Pc(305) String local305 = (String) local290.get(local285);
								if (local305 != null && local305.indexOf("sw3d.dll") != -1) {
									@Pc(317) Field local317 = local285.getClass().getDeclaredField("handle");
									local254.invoke(local317, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local317.getLong(local285));
									local254.invoke(local317, Boolean.FALSE);
								}
							} catch (@Pc(353) Throwable local353) {
							}
							local254.invoke(local290, Boolean.FALSE);
						} catch (@Pc(365) Throwable local365) {
						}
					}
				}
			} catch (@Pc(373) Throwable local373) {
			}
			local7 = local7 + "]";
		} catch (@Pc(384) Throwable local384) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method1142() {
		@Pc(7) boolean local7 = Static396.aClass9_1.method142();
		if (!local7) {
			this.method1136();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1144(@OriginalArg(0) int arg0) {
		Static111.aClass260_2 = null;
		Static396.aClass9_1.anInt191 = arg0;
		Static124.anInt6630 = 0;
		Static105.aClass221_2 = null;
		Static396.aClass9_1.anInt190++;
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1145() {
		if (Static216.anInt4135 == 14) {
			return;
		}
		@Pc(18) long local18 = Static91.method1614() / 1000000L - Static31.aLong26;
		Static31.aLong26 = Static91.method1614() / 1000000L;
		@Pc(26) boolean local26 = Static343.method4700();
		if (local26 && Static340.aBoolean451 && Static505.aClass177_2 != null) {
			Static505.aClass177_2.method7508();
		}
		if (Static557.method7586(Static216.anInt4135)) {
			if (Static12.aLong165 != 0L && Static413.method5668() > Static12.aLong165) {
				Static198.method2994(Static195.method2980(), Static348.aClass1_Sub30_Sub1_1.anInt4873, false, Static348.aClass1_Sub30_Sub1_1.anInt4860);
			} else if (!Static16.aClass134_1.method6951() && Static292.aBoolean411) {
				Static190.method2927();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static264.aFrame2 == null) {
			@Pc(76) Container local76;
			if (Static142.aFrame1 != null) {
				local76 = Static142.aFrame1;
			} else if (Static590.anApplet2 == null) {
				local76 = Static170.anApplet_Sub1_1;
			} else {
				local76 = Static590.anApplet2;
			}
			local88 = local76.getSize().width;
			local92 = local76.getSize().height;
			if (Static142.aFrame1 == local76) {
				@Pc(98) Insets local98 = Static142.aFrame1.getInsets();
				local92 -= local98.bottom + local98.top;
				local88 -= local98.left + local98.right;
			}
			if (Static493.anInt8493 != local88 || Static38.anInt603 != local92 || Static260.aBoolean351) {
				if (Static16.aClass134_1 == null || Static16.aClass134_1.method6900()) {
					Static118.method1851();
				} else {
					Static493.anInt8493 = local88;
					Static38.anInt603 = local92;
				}
				Static12.aLong165 = Static413.method5668() + 500L;
				Static260.aBoolean351 = false;
			}
		}
		if (Static264.aFrame2 != null && !Static161.aBoolean224 && Static557.method7586(Static216.anInt4135)) {
			Static198.method2994(Static348.aClass1_Sub30_Sub1_1.anInt4878, -1, false, -1);
		}
		@Pc(168) boolean local168 = false;
		if (Static573.aBoolean741) {
			local168 = true;
			Static573.aBoolean741 = false;
		}
		if (local168) {
			Static190.method2922();
		}
		if (Static16.aClass134_1 != null && Static16.aClass134_1.method6951() || Static195.method2980() != 1) {
			Static164.method7470();
		}
		if (Static179.method7292(Static216.anInt4135)) {
			Static299.method4184(local168);
		} else if (Static512.method7124(Static216.anInt4135)) {
			Static43.method637();
		} else if (Static535.method7313(Static216.anInt4135)) {
			Static43.method637();
		} else if (Static483.method6541(Static216.anInt4135)) {
			if (Static157.anInt2860 == 1) {
				if (Static201.anInt4028 < Static246.anInt4520) {
					Static201.anInt4028 = Static246.anInt4520;
				}
				local88 = (Static201.anInt4028 - Static246.anInt4520) * 50 / Static201.anInt4028;
				Static152.method2206(Static442.aClass64_12, true, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_16.method7651(Static307.anInt5279) + "<br>(" + local88 + "%)");
			} else if (Static157.anInt2860 == 2) {
				if (Static336.anInt5682 < Static2.anInt50) {
					Static336.anInt5682 = Static2.anInt50;
				}
				local88 = (Static336.anInt5682 - Static2.anInt50) * 50 / Static336.anInt5682 + 50;
				Static152.method2206(Static442.aClass64_12, true, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_16.method7651(Static307.anInt5279) + "<br>(" + local88 + "%)");
			} else {
				Static152.method2206(Static442.aClass64_12, true, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_16.method7651(Static307.anInt5279));
			}
		} else if (Static216.anInt4135 == 10) {
			Static372.method4995(local18);
		} else if (Static216.anInt4135 == 13) {
			Static152.method2206(Static442.aClass64_12, false, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_18.method7651(Static307.anInt5279) + "<br>" + Static568.aClass351_19.method7651(Static307.anInt5279));
		}
		if (Static305.anInt5270 == 3) {
			for (local88 = 0; local88 < Static367.anInt6098; local88++) {
				@Pc(381) Rectangle local381 = Class81.aRectangleArray1[local88];
				if (Static504.aBooleanArray14[local88]) {
					Static16.aClass134_1.method6929(local381.width, local381.y, local381.x, -1996553985, local381.height);
				} else if (Static544.aBooleanArray24[local88]) {
					Static16.aClass134_1.method6929(local381.width, local381.y, local381.x, -1996554240, local381.height);
				}
			}
		}
		if (Static394.method5441()) {
			Static553.method7539(Static16.aClass134_1);
		}
		if (Static362.aClass109_5.aBoolean205 && Static557.method7586(Static216.anInt4135) && Static305.anInt5270 == 0 && Static195.method2980() == 1 && !local168) {
			local88 = 0;
			for (local92 = 0; local92 < Static367.anInt6098; local92++) {
				if (Static544.aBooleanArray24[local92]) {
					Static544.aBooleanArray24[local92] = false;
					Static575.aRectangleArray2[local88++] = Class81.aRectangleArray1[local92];
				}
			}
			try {
				Static16.aClass134_1.method6914(Static575.aRectangleArray2, local88);
			} catch (@Pc(530) Exception_Sub1 local530) {
			}
		} else if (!Static179.method7292(Static216.anInt4135)) {
			for (local88 = 0; local88 < Static367.anInt6098; local88++) {
				Static544.aBooleanArray24[local88] = false;
			}
			try {
				Static16.aClass134_1.method6944();
			} catch (@Pc(472) Exception_Sub1 local472) {
				Static345.method4708(local472, local472.getMessage() + " (Recovered) " + this.method1124());
				Static523.method7235(0);
			}
		}
		if (Static348.aClass1_Sub30_Sub1_1.anInt4856 == 0) {
			Static391.method5400(15L);
		} else if (Static348.aClass1_Sub30_Sub1_1.anInt4856 == 1) {
			Static391.method5400(10L);
		} else if (Static348.aClass1_Sub30_Sub1_1.anInt4856 == 2) {
			Static391.method5400(5L);
		} else if (Static348.aClass1_Sub30_Sub1_1.anInt4856 == 3) {
			Static391.method5400(2L);
		}
		if (Static256.aBoolean347) {
			Static401.method5592();
		}
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean385 && Static216.anInt4135 == 3 && Static422.anInt7311 != -1) {
			Static348.aClass1_Sub30_Sub1_1.aBoolean385 = false;
			Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	public synchronized void method1132() {
		if (Static590.anApplet2 != null && Static499.aCanvas9 == null && !Static362.aClass109_5.aBoolean205) {
			try {
				@Pc(13) Class local13 = Static590.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static499.aCanvas9 = (Canvas) local17.get(Static590.anApplet2);
				local17.set(Static590.anApplet2, null);
				if (Static499.aCanvas9 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1132();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	protected void method1129() {
		if (Static151.aBoolean207) {
			Static356.method4864();
		}
		Static149.method2189();
		if (Static16.aClass134_1 != null) {
			Static16.aClass134_1.method6939();
		}
		if (Static264.aFrame2 != null) {
			Static448.method6203(Static362.aClass109_5, Static264.aFrame2);
			Static264.aFrame2 = null;
		}
		if (Static568.aClass149_2 != null) {
			Static568.aClass149_2.method3281();
			Static568.aClass149_2 = null;
		}
		Static394.method5446();
		Static396.aClass9_1.method131();
		Static314.aClass229_1.method4673();
		if (Static102.aClass216_1 != null) {
			Static102.aClass216_1.method4339();
			Static102.aClass216_1 = null;
		}
		try {
			Static306.aClass363_4.method7845();
			for (@Pc(61) int local61 = 0; local61 < 35; local61++) {
				Static253.aClass363Array1[local61].method7845();
			}
			Static335.aClass363_5.method7845();
			Static26.aClass363_1.method7845();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1128() {
		if (Static113.anInt2222 != 2) {
			this.method1140();
			return;
		}
		try {
			this.method1140();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static345.method4708(local22, local22.getMessage() + " (Recovered) " + this.method1124());
			Static523.method7235(0);
		}
	}
}
