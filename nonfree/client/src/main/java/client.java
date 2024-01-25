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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!vh;")
	public static Class250 lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static153.method5068("argument count");
			}
			Static435.anInt7499 = Integer.parseInt(arg0[0]);
			Static221.aClass176_5 = Static224.aClass176_6;
			if (arg0[1].equals("live")) {
				Static423.aClass234_5 = Static439.aClass234_7;
			} else if (arg0[1].equals("rc")) {
				Static423.aClass234_5 = Static430.aClass234_6;
			} else if (arg0[1].equals("wip")) {
				Static423.aClass234_5 = Static113.aClass234_4;
			} else {
				Static153.method5068("modewhat");
			}
			Static167.anInt3118 = Static51.method862(arg0[2]);
			if (Static167.anInt3118 == -1) {
				if (arg0[2].equals("english")) {
					Static167.anInt3118 = 0;
				} else if (arg0[2].equals("german")) {
					Static167.anInt3118 = 1;
				} else {
					Static153.method5068("language");
				}
			}
			Static45.aBoolean36 = false;
			Static74.aBoolean70 = false;
			if (arg0[3].equals("game0")) {
				Static248.aClass145_2 = Static288.aClass145_3;
			} else if (arg0[3].equals("game1")) {
				Static248.aClass145_2 = Static96.aClass145_1;
			} else {
				Static153.method5068("game");
			}
			Static50.aBoolean41 = true;
			Static291.aBoolean333 = true;
			Static143.aString15 = "";
			Static15.anInt3203 = Static248.aClass145_2.anInt4110;
			Static253.anInt4554 = 0;
			Static87.anInt1715 = 0;
			@Pc(131) client local131 = new client();
			Static185.aClient1 = local131;
			local131.method911(Static248.aClass145_2.aString32, Static423.aClass234_5.method5421() + 32);
			Static97.aFrame1.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static315.method4700(local154, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method895() {
		if (Static151.anInt2579 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static405.method5579() / 1000000L - Static373.aLong194;
		Static373.aLong194 = Static405.method5579() / 1000000L;
		@Pc(25) boolean local25 = Static23.method432();
		if (local25 && Static94.aBoolean98 && Static239.aClass110_2 != null) {
			Static239.aClass110_2.method4776();
		}
		if (Static151.anInt2579 == 30 || Static151.anInt2579 == 10) {
			if (Static429.aLong216 != 0L && Static429.aLong216 < Static101.method1557()) {
				Static267.method3900(Static389.aClass128_Sub1_1.anInt3560, false, Static389.aClass128_Sub1_1.anInt3570, Static131.method5612());
			} else if (!Static276.aClass109_10.method4732() && Static448.aBoolean489) {
				Static423.method5679();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static421.aFrame2 == null) {
			@Pc(83) Container local83;
			if (Static97.aFrame1 == null) {
				local83 = Static119.aClass138_7.anApplet1;
			} else {
				local83 = Static97.aFrame1;
			}
			local92 = local83.getSize().width;
			local96 = local83.getSize().height;
			if (Static97.aFrame1 == local83) {
				@Pc(102) Insets local102 = Static97.aFrame1.getInsets();
				local96 -= local102.top + local102.bottom;
				local92 -= local102.right + local102.left;
			}
			if (local92 != Static288.anInt5035 || local96 != Static119.anInt7598) {
				if (Static276.aClass109_10 == null || Static276.aClass109_10.method4754()) {
					Static355.method4892();
				} else {
					Static288.anInt5035 = local92;
					Static119.anInt7598 = local96;
				}
				Static429.aLong216 = Static101.method1557() + 500L;
			}
		}
		if (Static421.aFrame2 != null && !Static40.aBoolean28 && (Static151.anInt2579 == 30 || Static151.anInt2579 == 10)) {
			Static267.method3900(-1, false, -1, Static389.aClass128_Sub1_1.anInt3566);
		}
		@Pc(166) boolean local166 = false;
		if (Static335.aBoolean59) {
			local166 = true;
			Static335.aBoolean59 = false;
		}
		if (local166) {
			Static191.method2911();
		}
		if (Static276.aClass109_10 != null && Static276.aClass109_10.method4732() || Static131.method5612() != 1) {
			Static353.method4882();
		}
		if (Static151.anInt2579 == 0) {
			Static355.method4894(Static385.aColorArray4[Static15.anInt3203], Static10.aColorArray1[Static15.anInt3203], Static364.aString42, Static317.aColorArray3[Static15.anInt3203], Static274.anInt4882, local166);
		} else if (Static151.anInt2579 == 5) {
			Static68.method1192(Static276.aClass109_10.method4732() | local166, Static139.aClass129_1, Static10.aColorArray1[Static15.anInt3203].getRGB(), Static385.aColorArray4[Static15.anInt3203].getRGB(), Static317.aColorArray3[Static15.anInt3203].getRGB(), Static276.aClass109_10);
		} else if (Static151.anInt2579 == 10) {
			Static45.method766();
		} else if (Static151.anInt2579 == 25 || Static151.anInt2579 == 28) {
			if (Static12.anInt324 == 1) {
				if (Static295.anInt5212 > Static135.anInt2312) {
					Static135.anInt2312 = Static295.anInt5212;
				}
				local92 = (Static135.anInt2312 - Static295.anInt5212) * 50 / Static135.anInt2312;
				Static289.method4079(Static372.aClass129_6, Static364.aClass84_84.method1678(Static167.anInt3118) + "<br>(" + local92 + "%)", true);
			} else if (Static12.anInt324 == 2) {
				if (Static120.anInt2114 > Static113.anInt5756) {
					Static113.anInt5756 = Static120.anInt2114;
				}
				local92 = (Static113.anInt5756 - Static120.anInt2114) * 50 / Static113.anInt5756 + 50;
				Static289.method4079(Static372.aClass129_6, Static364.aClass84_84.method1678(Static167.anInt3118) + "<br>(" + local92 + "%)", true);
			} else {
				Static289.method4079(Static372.aClass129_6, Static364.aClass84_84.method1678(Static167.anInt3118), true);
			}
		} else if (Static151.anInt2579 == 30) {
			Static271.method3945(local17);
		} else if (Static151.anInt2579 == 40) {
			Static289.method4079(Static372.aClass129_6, Static151.aClass84_40.method1678(Static167.anInt3118) + "<br>" + Static380.aClass84_88.method1678(Static167.anInt3118), true);
		}
		if (Static86.anInt1673 == 3) {
			for (local92 = 0; local92 < Static262.anInt4661; local92++) {
				@Pc(394) Rectangle local394 = Class1_Sub45.aRectangleArray2[local92];
				if (Static240.aBooleanArray15[local92]) {
					Static276.aClass109_10.method4743(local394.x, -1996553985, local394.y, local394.height, local394.width);
				} else if (Static108.aBooleanArray7[local92]) {
					Static276.aClass109_10.method4743(local394.x, -1996554240, local394.y, local394.height, local394.width);
				}
			}
		}
		if (Static173.method2717()) {
			Static4.method164(Static276.aClass109_10);
		}
		if ((Static151.anInt2579 == 30 || Static151.anInt2579 == 10) && Static86.anInt1673 == 0 && Static131.method5612() == 1 && !local166 && Static210.aString31.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static262.anInt4661; local96++) {
				if (Static108.aBooleanArray7[local96]) {
					Static108.aBooleanArray7[local96] = false;
					Static332.aRectangleArray1[local92++] = Class1_Sub45.aRectangleArray2[local96];
				}
			}
			Static276.aClass109_10.method4681(Static332.aRectangleArray1, local92);
		} else if (Static151.anInt2579 != 0) {
			Static276.aClass109_10.method4704();
			for (local92 = 0; local92 < Static262.anInt4661; local92++) {
				Static108.aBooleanArray7[local92] = false;
			}
		}
		if (Static389.aClass128_Sub1_1.anInt3563 == 0) {
			Static67.method1189(15L);
		} else if (Static389.aClass128_Sub1_1.anInt3563 == 1) {
			Static67.method1189(10L);
		} else if (Static389.aClass128_Sub1_1.anInt3563 == 2) {
			Static67.method1189(5L);
		} else if (Static389.aClass128_Sub1_1.anInt3563 == 3) {
			Static67.method1189(2L);
		}
		if (Static84.aBoolean85) {
			Static361.method4954();
		}
		if (Static389.aClass128_Sub1_1.aBoolean236 && Static151.anInt2579 == 10 && Static273.anInt4878 != -1) {
			Static389.aClass128_Sub1_1.aBoolean236 = false;
			Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method914() {
		Static9.anInt248++;
		Static429.method5745(-1, -1, null);
		Static425.method5709(-1, null, -1);
		Static330.method4638();
		Static337.anInt7419++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class26_Sub2_Sub2_Sub2 local33 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass66_1.aByte19;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method5535();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt7148 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(97) int local97 = local33.anIntArray590[0] + local74;
							@Pc(104) int local104 = local82 + local33.anIntArray589[0];
							if (local97 < 0) {
								local97 = 0;
							} else if (Static135.anInt2314 - local50 - 1 < local97) {
								local97 = Static135.anInt2314 - local50 - 1;
							}
							if (local104 < 0) {
								local104 = 0;
							} else if (Static352.anInt6022 - local50 - 1 < local104) {
								local104 = Static352.anInt6022 - local50 - 1;
							}
							@Pc(171) int local171 = Static119.method5888(local33.anIntArray589[0], local104, local50, 0, -1, true, Static353.anIntArray481, Static170.aClass112Array1[local33.aByte95], local33.anIntArray590[0], local50, local97, local50, 0, Static425.anIntArray630);
							if (local171 > 0) {
								if (local171 > 9) {
									local171 = 9;
								}
								for (@Pc(180) int local180 = 0; local180 < local171; local180++) {
									local33.anIntArray590[local180] = Static425.anIntArray630[local171 - local180 - 1];
									local33.anIntArray589[local180] = Static353.anIntArray481[local171 - local180 - 1];
									local33.aByteArray84[local180] = 1;
								}
								local33.anInt7148 = local171;
							}
						}
					}
					Static404.method5461(true, local33);
					local74 = Static123.method1836(local33);
					Static23.method426(Static64.anInt1341, local33, Static108.anInt1990, local74);
					Static150.method2264(local33);
				}
			}
		}
		if (Static296.anInt2704 == 0 && Static402.anInt6944 == 0) {
			if (Static310.anInt5540 == 2) {
				Static199.method3016();
			} else {
				Static64.method1126();
			}
			if (Static306.anInt5497 >> 7 < 14 || Static135.anInt2314 - 14 <= Static306.anInt5497 >> 7 || Static402.anInt6941 >> 7 < 14 || Static352.anInt6022 - 14 <= Static402.anInt6941 >> 7) {
				Static18.method362();
			}
		}
		while (true) {
			@Pc(303) Class1_Sub6 local303;
			@Pc(308) Class219 local308;
			@Pc(316) Class219 local316;
			do {
				local303 = (Class1_Sub6) Static420.aClass266_49.method5999();
				if (local303 == null) {
					while (true) {
						do {
							local303 = (Class1_Sub6) Static30.aClass266_8.method5999();
							if (local303 == null) {
								while (true) {
									do {
										local303 = (Class1_Sub6) Static59.aClass266_11.method5999();
										if (local303 == null) {
											if (Static442.aClass219_14 != null) {
												Static268.method4065();
											}
											if (Static403.anInt6978 % 1500 == 0) {
												Static9.method238();
											}
											Static45.method764();
											if (Static201.aBoolean257 && Static32.aLong21 < Static101.method1557() - 60000L) {
												Static86.method1449();
												return;
											}
											return;
										}
										local308 = local303.aClass219_4;
										if (local308.anInt6345 < 0) {
											break;
										}
										local316 = Static103.method1572(local308.anInt6379);
									} while (local316 == null || local316.aClass219Array3 == null || local308.anInt6345 >= local316.aClass219Array3.length || local308 != local316.aClass219Array3[local308.anInt6345]);
									Static104.method1608(local303);
								}
							}
							local308 = local303.aClass219_4;
							if (local308.anInt6345 < 0) {
								break;
							}
							local316 = Static103.method1572(local308.anInt6379);
						} while (local316 == null || local316.aClass219Array3 == null || local308.anInt6345 >= local316.aClass219Array3.length || local308 != local316.aClass219Array3[local308.anInt6345]);
						Static104.method1608(local303);
					}
				}
				local308 = local303.aClass219_4;
				if (local308.anInt6345 < 0) {
					break;
				}
				local316 = Static103.method1572(local308.anInt6379);
			} while (local316 == null || local316.aClass219Array3 == null || local308.anInt6345 >= local316.aClass219Array3.length || local308 != local316.aClass219Array3[local308.anInt6345]);
			Static104.method1608(local303);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method908()) {
			return;
		}
		Static435.anInt7499 = Integer.parseInt(this.getParameter("worldid"));
		Static221.aClass176_5 = Static107.method1653(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static370.method5089(Static221.aClass176_5) && Static221.aClass176_5 != Static234.aClass176_7) {
			Static221.aClass176_5 = Static234.aClass176_7;
		}
		Static423.aClass234_5 = Static181.method2786(Integer.parseInt(this.getParameter("modewhat")));
		if (Static113.aClass234_4 != Static423.aClass234_5 && Static423.aClass234_5 != Static430.aClass234_6 && Static439.aClass234_7 != Static423.aClass234_5) {
			Static423.aClass234_5 = Static439.aClass234_7;
		}
		try {
			Static167.anInt3118 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static167.anInt3118 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static74.aBoolean70 = true;
		} else {
			Static74.aBoolean70 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static45.aBoolean36 = true;
		} else {
			Static45.aBoolean36 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static235.aBoolean283 = true;
		} else {
			Static235.aBoolean283 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static248.aClass145_2 = Static96.aClass145_1;
		} else {
			Static248.aClass145_2 = Static288.aClass145_3;
		}
		try {
			Static253.anInt4554 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static253.anInt4554 = 0;
		}
		Static385.aString52 = this.getParameter("quiturl");
		Static143.aString15 = this.getParameter("settings");
		if (Static143.aString15 == null) {
			Static143.aString15 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static87.anInt1715 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static87.anInt1715 = 0;
			}
		}
		Static15.anInt3203 = Integer.parseInt(this.getParameter("colourid"));
		if (Static15.anInt3203 < 0 || Static15.anInt3203 >= Static10.aColorArray1.length) {
			Static15.anInt3203 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static50.aBoolean41 = true;
			Static291.aBoolean333 = true;
		}
		if (Static288.aClass145_3 == Static248.aClass145_2) {
			Static256.anInt4583 = 765;
			Static8.anInt239 = 503;
		} else if (Static248.aClass145_2 == Static96.aClass145_1) {
			Static8.anInt239 = 480;
			Static256.anInt4583 = 640;
		}
		Static185.aClient1 = this;
		this.method897(Static256.anInt4583, Static423.aClass234_5.method5421() + 32, Static8.anInt239);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method915(@OriginalArg(0) int arg0) {
		Static63.aClass94_2.anInt2298 = arg0;
		Static257.aClass100_9 = null;
		Static364.aClass161_3 = null;
		Static63.aClass94_2.anInt2299++;
		Static39.anInt731 = 0;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method902() {
		if (Static151.anInt2579 == 1000) {
			return;
		}
		Static403.anInt6978++;
		if (Static403.anInt6978 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static12.anInt318 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static301.aRandom3.setSeed((long) Static12.anInt318);
		}
		if (Static403.anInt6978 % 50 == 0) {
			Static361.anInt6132 = Static441.anInt7603;
			Static441.anInt7603 = 0;
			Static3.anInt170 = Static293.anInt5154;
			Static293.anInt5154 = 0;
		}
		this.method926();
		if (Static289.aClass203_1 != null) {
			Static289.aClass203_1.method4833();
		}
		Static311.method4456();
		Static102.aClass163_1.method3810();
		Static16.aClass228_1.method5484();
		if (Static153.aClass118_2 != null) {
			@Pc(81) int local81 = Static153.aClass118_2.method4488();
			Static257.anInt4626 = local81;
		}
		if (Static276.aClass109_10 != null) {
			Static276.aClass109_10.method4738((int) Static101.method1557());
		}
		Static327.method4603();
		Static242.anInt4339 = 0;
		for (@Pc(98) Class21 local98 = Static102.aClass163_1.method3805(); local98 != null && Static242.anInt4339 < 128; local98 = Static102.aClass163_1.method3805()) {
			if (local98.method3178() != 1) {
				@Pc(109) char local109 = local98.method3180();
				if (!Static102.method1567() || local109 != '`' && local109 != '§') {
					Static148.aClass21Array1[Static242.anInt4339] = local98;
					Static242.anInt4339++;
				} else if (Static173.method2717()) {
					Static133.method1912();
				} else {
					Static359.method4946();
				}
			}
		}
		for (@Pc(152) Class1_Sub27 local152 = Static16.aClass228_1.method5482(); local152 != null; local152 = Static16.aClass228_1.method5482()) {
			@Pc(158) int local158 = local152.method4578();
			if (local158 == -1) {
				Static381.aClass266_40.method5998(local152);
			} else if (Static370.method5090(local158)) {
				Static384.aClass266_45.method5998(local152);
			}
			if (Static384.aClass266_45.method5992() > 10) {
				Static384.aClass266_45.method5999();
			}
		}
		if (Static173.method2717()) {
			Static189.method2896();
		}
		if (Static151.anInt2579 == 0) {
			this.method923();
			Static194.method2942();
		} else if (Static151.anInt2579 == 5) {
			this.method923();
			Static194.method2942();
		} else if (Static151.anInt2579 == 25 || Static151.anInt2579 == 28) {
			Static134.method4395();
		}
		if (Static151.anInt2579 == 10) {
			this.method914();
			Static123.method1834();
			Static363.method5009();
			Static187.method3994();
		} else if (Static151.anInt2579 == 30) {
			Static301.method3330();
		} else if (Static151.anInt2579 == 40) {
			Static187.method3994();
			if (Static430.anInt7428 != -3 && Static430.anInt7428 != 2 && Static430.anInt7428 != 15) {
				Static234.method3459();
			}
		}
		Static108.method1664(Static276.aClass109_10);
		Static384.aClass266_45.method5999();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method918() {
		if (Static239.anInt4289 < Static63.aClass94_2.anInt2299) {
			Static302.anInt5364 = (Static63.aClass94_2.anInt2299 - 1) * 50 * 5;
			if (Static41.anInt7070 == Static163.anInt3040) {
				Static163.anInt3040 = Static58.anInt1248;
			} else {
				Static163.anInt3040 = Static41.anInt7070;
			}
			if (Static302.anInt5364 > 3000) {
				Static302.anInt5364 = 3000;
			}
			if (Static63.aClass94_2.anInt2299 >= 2 && Static63.aClass94_2.anInt2298 == 6) {
				this.method896("js5connect_outofdate");
				Static151.anInt2579 = 1000;
				return;
			}
			if (Static63.aClass94_2.anInt2299 >= 4 && Static63.aClass94_2.anInt2298 == -1) {
				this.method896("js5crc");
				Static151.anInt2579 = 1000;
				return;
			}
			if (Static63.aClass94_2.anInt2299 >= 4 && (Static151.anInt2579 == 0 || Static151.anInt2579 == 5)) {
				if (Static63.aClass94_2.anInt2298 == 7 || Static63.aClass94_2.anInt2298 == 9) {
					this.method896("js5connect_full");
				} else if (Static63.aClass94_2.anInt2298 > 0) {
					this.method896("js5connect");
				} else {
					this.method896("js5io");
				}
				Static151.anInt2579 = 1000;
				return;
			}
		}
		Static239.anInt4289 = Static63.aClass94_2.anInt2299;
		if (Static302.anInt5364 > 0) {
			Static302.anInt5364--;
			return;
		}
		try {
			if (Static39.anInt731 == 0) {
				Static257.aClass100_9 = Static119.aClass138_7.method3205(Static163.anInt3040, Static212.aString4);
				Static39.anInt731++;
			}
			if (Static39.anInt731 == 1) {
				if (Static257.aClass100_9.anInt2365 == 2) {
					this.method915(1000);
					return;
				}
				if (Static257.aClass100_9.anInt2365 == 1) {
					Static39.anInt731++;
				}
			}
			if (Static39.anInt731 == 2) {
				Static364.aClass161_3 = new Class161((Socket) Static257.aClass100_9.anObject4, Static119.aClass138_7);
				@Pc(174) Class1_Sub1 local174 = new Class1_Sub1(5);
				local174.method4115(Static20.aClass108_2.anInt2675);
				local174.method4105(586);
				Static364.aClass161_3.method3763(local174.aByteArray66, 5);
				Static39.anInt731++;
				Static335.aLong36 = Static101.method1557();
			}
			if (Static39.anInt731 == 3) {
				if (Static151.anInt2579 == 0 || Static151.anInt2579 == 5 || Static364.aClass161_3.method3765() > 0) {
					@Pc(225) int local225 = Static364.aClass161_3.method3770();
					if (local225 != 0) {
						this.method915(local225);
						return;
					}
					Static39.anInt731++;
				} else if (Static101.method1557() - Static335.aLong36 > 30000L) {
					this.method915(1001);
					return;
				}
			}
			if (Static39.anInt731 == 4) {
				@Pc(271) boolean local271 = Static151.anInt2579 == 5 || Static151.anInt2579 == 10 || Static151.anInt2579 == 28;
				Static63.aClass94_2.method1905(!local271, Static364.aClass161_3);
				Static39.anInt731 = 0;
				Static257.aClass100_9 = null;
				Static364.aClass161_3 = null;
			}
		} catch (@Pc(288) IOException local288) {
			this.method915(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V")
	private void method919(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub1 local10 = new Class1_Sub1(arg0);
		while (true) {
			@Pc(19) int local19;
			@Pc(44) int local44;
			@Pc(39) int local39;
			label45: do {
				while (true) {
					while (true) {
						local19 = local10.method4130();
						if (local19 == 0) {
							return;
						}
						if (local19 == 1) {
							@Pc(108) int[] local108 = Static227.anIntArray332 = new int[6];
							local108[0] = local10.method4093();
							local108[1] = local10.method4093();
							local108[2] = local10.method4093();
							local108[3] = local10.method4093();
							local108[4] = local10.method4093();
							local108[5] = local10.method4093();
						} else {
							if (local19 != 4) {
								continue label45;
							}
							local39 = local10.method4130();
							Static241.anIntArray346 = new int[local39];
							for (local44 = 0; local44 < local39; local44++) {
								Static241.anIntArray346[local44] = local10.method4093();
								if (Static241.anIntArray346[local44] == 65535) {
									Static241.anIntArray346[local44] = -1;
								}
							}
						}
					}
				}
			} while (local19 != 5);
			local39 = local10.method4130();
			Static175.anIntArray269 = new int[local39];
			for (local44 = 0; local44 < local39; local44++) {
				Static175.anIntArray269[local44] = local10.method4093();
				if (Static175.anIntArray269[local44] == 65535) {
					Static175.anIntArray269[local44] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method901() {
		if (Static201.aBoolean257) {
			Static86.method1449();
		}
		if (Static276.aClass109_10 != null) {
			Static276.aClass109_10.method4713();
		}
		if (Static421.aFrame2 != null) {
			Static32.method552(Static119.aClass138_7, Static421.aFrame2);
			Static421.aFrame2 = null;
		}
		if (Static372.aClass161_6 != null) {
			Static372.aClass161_6.method3764();
			Static372.aClass161_6 = null;
		}
		if (Static153.aClass118_2 != null) {
			Static153.aClass118_2.method4489(Static299.aCanvas5);
		}
		Static153.aClass118_2 = null;
		Static239.method3549();
		Static63.aClass94_2.method1911();
		Static11.aClass142_1.method3272();
		if (Static311.aClass213_1 != null) {
			Static311.aClass213_1.method5019();
			Static311.aClass213_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method923() {
		@Pc(10) int local10;
		if (!Static389.aClass128_Sub1_1.aBoolean236) {
			for (local10 = 0; local10 < Static242.anInt4339; local10++) {
				if (Static148.aClass21Array1[local10].method3180() == 's' || Static148.aClass21Array1[local10].method3180() == 'S') {
					Static389.aClass128_Sub1_1.aBoolean236 = true;
					break;
				}
			}
		}
		@Pc(49) int local49;
		if (Static341.anInt5936 == 0) {
			@Pc(40) Runtime local40 = Runtime.getRuntime();
			local49 = (int) ((local40.totalMemory() - local40.freeMemory()) / 1024L);
			@Pc(52) long local52 = Static101.method1557();
			if (Static217.aLong120 == 0L) {
				Static217.aLong120 = local52;
			}
			if (local49 > 16384 && local52 - Static217.aLong120 < 5000L) {
				if (local52 - Static4.aLong4 > 1000L) {
					System.gc();
					Static4.aLong4 = local52;
				}
				Static364.aString42 = Static53.aClass84_19.method1678(Static167.anInt3118);
				Static274.anInt4882 = 5;
			} else {
				Static364.aString42 = Static29.aClass84_10.method1678(Static167.anInt3118);
				Static341.anInt5936 = 10;
				Static274.anInt4882 = 5;
			}
		} else if (Static341.anInt5936 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static170.aClass112Array1[local10] = Static454.method6087(Static352.anInt6022, Static135.anInt2314);
			}
			Static364.aString42 = Static167.aClass84_44.method1678(Static167.anInt3118);
			Static274.anInt4882 = 10;
			Static341.anInt5936 = 20;
		} else if (Static341.anInt5936 == 20) {
			if (Static289.aClass203_1 == null) {
				Static289.aClass203_1 = new Class203(Static63.aClass94_2, Static11.aClass142_1);
			}
			if (Static289.aClass203_1.method4832()) {
				Static220.aClass250_51 = Static121.method1795(0, true, false);
				Static249.aClass250_55 = Static121.method1795(1, true, false);
				Static147.aClass250_27 = Static121.method1795(2, true, false);
				Static179.aClass250_40 = Static121.method1795(3, true, false);
				Static235.aClass250_53 = Static121.method1795(4, true, false);
				Static88.aClass250_19 = Static121.method1795(5, true, true);
				Static260.aClass250_56 = Static121.method1795(6, false, true);
				Static204.aClass250_47 = Static121.method1795(7, true, false);
				Static384.aClass250_76 = Static121.method1795(8, true, false);
				Static316.aClass250_61 = Static121.method1795(9, true, false);
				Static160.aClass250_35 = Static121.method1795(10, true, false);
				lb = Static121.method1795(11, true, false);
				Static215.aClass250_50 = Static121.method1795(12, true, false);
				Static420.aClass250_87 = Static121.method1795(13, true, false);
				Static334.aClass250_66 = Static121.method1795(14, false, false);
				Static234.aClass250_52 = Static121.method1795(15, true, false);
				Static82.aClass250_17 = Static121.method1795(16, true, false);
				Static96.aClass250_20 = Static121.method1795(17, true, false);
				Static181.aClass250_41 = Static121.method1795(18, true, false);
				Static383.aClass250_75 = Static121.method1795(19, true, false);
				Static10.aClass250_3 = Static121.method1795(20, true, false);
				Static412.aClass250_86 = Static121.method1795(21, true, false);
				Static84.aClass250_18 = Static121.method1795(22, true, false);
				Static243.aClass250_54 = Static121.method1795(23, true, true);
				Static68.aClass250_15 = Static121.method1795(24, true, false);
				Static276.aClass250_59 = Static121.method1795(25, true, false);
				Static48.aClass250_10 = Static121.method1795(26, true, true);
				Static19.aClass250_4 = Static121.method1795(27, true, false);
				Static37.aClass250_9 = Static121.method1795(28, true, true);
				Static116.aClass250_23 = Static121.method1795(29, true, false);
				Static364.aString42 = Static193.aClass84_17.method1678(Static167.anInt3118);
				Static341.anInt5936 = 30;
				Static274.anInt4882 = 15;
			} else {
				Static364.aString42 = Static80.aClass84_21.method1678(Static167.anInt3118);
				Static274.anInt4882 = 12;
			}
		} else if (Static341.anInt5936 == 30) {
			local10 = 0;
			for (local49 = 0; local49 < 30; local49++) {
				local10 += Static324.aClass16_Sub1Array1[local49].method407() * Static11.anIntArray18[local49] / 100;
			}
			if (local10 == 100) {
				Static364.aString42 = Static329.aClass84_74.method1678(Static167.anInt3118);
				Static274.anInt4882 = 20;
				Static359.method4944(Static384.aClass250_76);
				Static366.method4350(Static384.aClass250_76);
				Static341.anInt5936 = 40;
			} else {
				if (local10 != 0) {
					Static364.aString42 = Static233.aClass84_58.method1678(Static167.anInt3118) + local10 + "%";
				}
				Static274.anInt4882 = 20;
			}
		} else if (Static341.anInt5936 == 40) {
			if (Static37.aClass250_9.method5658()) {
				this.method919(Static37.aClass250_9.method5644(1));
				Static364.aString42 = Static105.aClass84_30.method1678(Static167.anInt3118);
				Static341.anInt5936 = 50;
				Static274.anInt4882 = 25;
			} else {
				Static364.aString42 = Static32.aClass84_11.method1678(Static167.anInt3118) + Static37.aClass250_9.method5665() + "%";
				Static274.anInt4882 = 25;
			}
		} else if (Static341.anInt5936 == 50) {
			Static355.method4896();
			Static364.aString42 = Static433.aClass84_99.method1678(Static167.anInt3118);
			Static274.anInt4882 = 30;
			Static341.anInt5936 = 60;
		} else if (Static341.anInt5936 == 60) {
			local10 = Static160.method2431(Static384.aClass250_76, Static420.aClass250_87);
			local49 = Static351.method4849();
			if (local49 > local10) {
				Static364.aString42 = Static230.aClass84_55.method1678(Static167.anInt3118) + local10 * 100 / local49 + "%";
				Static274.anInt4882 = 35;
			} else {
				Static364.aString42 = Static404.aClass84_92.method1678(Static167.anInt3118);
				Static274.anInt4882 = 35;
				Static341.anInt5936 = 70;
			}
		} else if (Static341.anInt5936 == 70) {
			local10 = Static67.method1187(Static384.aClass250_76);
			local49 = Static225.method3383();
			if (local49 > local10) {
				Static364.aString42 = Static367.aClass84_85.method1678(Static167.anInt3118) + local10 * 100 / local49 + "%";
				Static274.anInt4882 = 40;
			} else {
				Static364.aString42 = Static431.aClass84_98.method1678(Static167.anInt3118);
				Static274.anInt4882 = 40;
				Static341.anInt5936 = 80;
			}
		} else if (Static341.anInt5936 == 80) {
			if (Static48.aClass250_10.method5658()) {
				Static184.anInterface7_8 = new Class204(Static48.aClass250_10, Static316.aClass250_61, Static384.aClass250_76);
				Static364.aString42 = Static171.aClass84_45.method1678(Static167.anInt3118);
				Static341.anInt5936 = 90;
				Static274.anInt4882 = 45;
			} else {
				Static364.aString42 = Static424.aClass84_95.method1678(Static167.anInt3118) + Static48.aClass250_10.method5665() + "%";
				Static274.anInt4882 = 45;
			}
		} else if (Static341.anInt5936 == 90) {
			Static364.aString42 = Static409.aClass84_93.method1678(Static167.anInt3118);
			Static341.anInt5936 = 95;
			Static274.anInt4882 = 50;
		} else if (Static341.anInt5936 == 95) {
			if (Static389.aClass128_Sub1_1.aBoolean236) {
				Static389.aClass128_Sub1_1.anInt3574 = 0;
				Static389.aClass128_Sub1_1.anInt3572 = 0;
				Static389.aClass128_Sub1_1.anInt3566 = 1;
				Static389.aClass128_Sub1_1.anInt3561 = 0;
				Static389.aClass128_Sub1_1.anInt3576 = 0;
			}
			Static389.aClass128_Sub1_1.aBoolean236 = true;
			Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
			Static298.method4256(false, Static389.aClass128_Sub1_1.anInt3572);
			Static364.aString42 = Static16.aClass84_4.method1678(Static167.anInt3118);
			Static341.anInt5936 = 100;
			Static274.anInt4882 = 55;
		} else if (Static341.anInt5936 == 100) {
			Static108.method1659(Static420.aClass250_87, Static276.aClass109_10, Static384.aClass250_76);
			Static364.aString42 = Static96.aClass84_28.method1678(Static167.anInt3118);
			Static274.anInt4882 = 60;
			Static455.method4431(5);
			Static341.anInt5936 = 110;
		} else if (Static341.anInt5936 == 110) {
			Static147.aClass250_27.method5658();
			local10 = Static147.aClass250_27.method5665();
			Static82.aClass250_17.method5658();
			local10 += Static82.aClass250_17.method5665();
			Static96.aClass250_20.method5658();
			local10 += Static96.aClass250_20.method5665();
			Static181.aClass250_41.method5658();
			local10 += Static181.aClass250_41.method5665();
			Static383.aClass250_75.method5658();
			local10 += Static383.aClass250_75.method5665();
			Static10.aClass250_3.method5658();
			local10 += Static10.aClass250_3.method5665();
			Static412.aClass250_86.method5658();
			local10 += Static412.aClass250_86.method5665();
			Static84.aClass250_18.method5658();
			local10 += Static84.aClass250_18.method5665();
			Static68.aClass250_15.method5658();
			local10 += Static68.aClass250_15.method5665();
			Static276.aClass250_59.method5658();
			local10 += Static276.aClass250_59.method5665();
			Static19.aClass250_4.method5658();
			local10 += Static19.aClass250_4.method5665();
			Static116.aClass250_23.method5658();
			local10 += Static116.aClass250_23.method5665();
			if (local10 < 1200) {
				Static364.aString42 = Static398.aClass84_91.method1678(Static167.anInt3118) + local10 / 12 + "%";
				Static274.anInt4882 = 65;
			} else {
				Static228.aClass243_2 = new Class243(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static14.aClass193_1 = new Class193(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static199.aClass106_2 = new Class106(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27, Static384.aClass250_76);
				Static304.aClass15_1 = new Class15(Static248.aClass145_2, Static167.anInt3118, Static96.aClass250_20);
				Static35.aClass47_3 = new Class47(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static234.aClass107_3 = new Class107(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static46.aClass233_1 = new Class233(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27, Static204.aClass250_47);
				Static311.aClass19_1 = new Class19(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static445.aClass8_1 = new Class8(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static71.aClass105_6 = new Class105(Static248.aClass145_2, Static167.anInt3118, true, Static82.aClass250_17, Static204.aClass250_47);
				Static1.aClass224_1 = new Class224(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27, Static384.aClass250_76);
				Static231.aClass126_3 = new Class126(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27, Static384.aClass250_76);
				Static322.aClass187_2 = new Class187(Static248.aClass145_2, Static167.anInt3118, true, Static181.aClass250_41, Static204.aClass250_47);
				Static196.aClass139_1 = new Class139(Static248.aClass145_2, Static167.anInt3118, true, Static228.aClass243_2, Static383.aClass250_75, Static204.aClass250_47);
				Static105.aClass251_1 = new Class251(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static191.aClass28_1 = new Class28(Static248.aClass145_2, Static167.anInt3118, Static10.aClass250_3, Static220.aClass250_51, Static249.aClass250_55);
				Static141.aClass168_1 = new Class168(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static199.aClass134_1 = new Class134(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static168.aClass115_2 = new Class115(Static248.aClass145_2, Static167.anInt3118, Static412.aClass250_86, Static204.aClass250_47);
				Static446.aClass89_1 = new Class89(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static353.aClass186_1 = new Class186(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static60.aClass113_1 = new Class113(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static111.aClass170_1 = new Class170(Static248.aClass145_2, Static167.anInt3118, Static84.aClass250_18);
				Static80.aClass258_1 = new Class258(Static248.aClass145_2, Static167.anInt3118, Static147.aClass250_27);
				Static6.method200(Static420.aClass250_87, Static204.aClass250_47, Static384.aClass250_76, Static179.aClass250_40);
				Static30.method494(Static116.aClass250_23);
				Static449.aClass198_1 = new Class198(Static167.anInt3118, Static68.aClass250_15, Static276.aClass250_59);
				Static21.aClass245_1 = new Class245(Static167.anInt3118, Static68.aClass250_15, Static276.aClass250_59, new Class166());
				Static364.aString42 = Static188.aClass84_48.method1678(Static167.anInt3118);
				Static274.anInt4882 = 65;
				Static90.method1475();
				Static71.aClass105_6.method2340(!Static389.aClass128_Sub1_1.method2984(Static285.anInt7839));
				Static51.aClass79_1 = new Class79();
				Static91.method1478();
				Static223.method3358(Static19.aClass250_4);
				Static284.method4042(Static204.aClass250_47, Static184.anInterface7_8);
				Static341.anInt5936 = 120;
			}
		} else if (Static341.anInt5936 == 120) {
			local10 = Static125.method1866(Static384.aClass250_76);
			local49 = Static227.method3408();
			if (local10 < local49) {
				Static364.aString42 = Static46.aClass84_13.method1678(Static167.anInt3118) + local10 * 100 / local49 + "%";
				Static274.anInt4882 = 70;
			} else {
				Static243.method3590(Static276.aClass109_10, Static384.aClass250_76);
				Static75.method1281(Static201.aClass80Array7);
				Static364.aString42 = Static231.aClass84_56.method1678(Static167.anInt3118);
				Static274.anInt4882 = 70;
				Static341.anInt5936 = 130;
			}
		} else if (Static341.anInt5936 == 130) {
			if (Static160.aClass250_35.method5669("", "huffman")) {
				@Pc(1253) Class71 local1253 = new Class71(Static160.aClass250_35.method5663("huffman", ""));
				Static359.method4945(local1253);
				Static364.aString42 = Static51.aClass84_14.method1678(Static167.anInt3118);
				Static274.anInt4882 = 75;
				Static341.anInt5936 = 140;
			} else {
				Static364.aString42 = Static448.aClass84_104.method1678(Static167.anInt3118) + "0%";
				Static274.anInt4882 = 75;
			}
		} else if (Static341.anInt5936 == 140) {
			if (Static179.aClass250_40.method5658()) {
				Static364.aString42 = Static412.aClass84_94.method1678(Static167.anInt3118);
				Static274.anInt4882 = 80;
				Static341.anInt5936 = 150;
			} else {
				Static364.aString42 = Static17.aClass84_6.method1678(Static167.anInt3118) + Static179.aClass250_40.method5665() + "%";
				Static274.anInt4882 = 80;
			}
		} else if (Static341.anInt5936 == 150) {
			if (Static215.aClass250_50.method5658()) {
				Static364.aString42 = Static65.aClass84_20.method1678(Static167.anInt3118);
				Static341.anInt5936 = 160;
				Static274.anInt4882 = 82;
			} else {
				Static364.aString42 = Static379.aClass84_87.method1678(Static167.anInt3118) + Static215.aClass250_50.method5665() + "%";
				Static274.anInt4882 = 82;
			}
		} else if (Static341.anInt5936 == 160) {
			if (Static420.aClass250_87.method5658()) {
				Static364.aString42 = Static307.aClass84_72.method1678(Static167.anInt3118);
				Static274.anInt4882 = 85;
				Static341.anInt5936 = 170;
			} else {
				Static364.aString42 = Static307.aClass84_72.method1678(Static167.anInt3118) + Static420.aClass250_87.method5665() + "%";
				Static274.anInt4882 = 85;
			}
		} else if (Static341.anInt5936 == 170) {
			if (Static243.aClass250_54.method5656("details")) {
				Static7.method2266(Static243.aClass250_54, Static35.aClass47_3, Static234.aClass107_3, Static71.aClass105_6, Static1.aClass224_1, Static231.aClass126_3, Static51.aClass79_1);
				Static364.aString42 = Static134.aClass84_70.method1678(Static167.anInt3118);
				Static274.anInt4882 = 89;
				Static341.anInt5936 = 180;
			} else {
				Static364.aString42 = Static337.aClass84_97.method1678(Static167.anInt3118) + Static243.aClass250_54.method5664("details") + "%";
				Static274.anInt4882 = 87;
			}
		} else if (Static341.anInt5936 == 180) {
			local10 = Static261.method5973();
			if (local10 == -1) {
				Static364.aString42 = Static190.aClass84_49.method1678(Static167.anInt3118);
				Static274.anInt4882 = 90;
			} else if (local10 == 7 || local10 == 9) {
				this.method896("worldlistfull");
				Static455.method4431(1000);
			} else if (Static144.aBoolean133) {
				Static364.aString42 = Static53.aClass84_18.method1678(Static167.anInt3118);
				Static274.anInt4882 = 90;
				Static341.anInt5936 = 190;
			} else {
				this.method896("worldlistio_" + local10);
				Static455.method4431(1000);
			}
		} else if (Static341.anInt5936 == 190) {
			Static77.anIntArray142 = new int[Static60.aClass113_1.anInt3153];
			Static318.aBooleanArray18 = new boolean[Static60.aClass113_1.anInt3153];
			Static238.aStringArray39 = new String[Static353.aClass186_1.anInt5597];
			for (local10 = 0; local10 < Static60.aClass113_1.anInt3153; local10++) {
				if (Static60.aClass113_1.method2700(local10).anInt4158 == 0) {
					Static318.aBooleanArray18[local10] = true;
					Static393.anInt6823++;
				}
				Static77.anIntArray142[local10] = -1;
			}
			Static389.method5311();
			Static299.anInt5301 = Static179.aClass250_40.method5652("loginscreen");
			Static88.aClass250_19.method5675(false);
			Static260.aClass250_56.method5675(true);
			Static384.aClass250_76.method5675(true);
			Static420.aClass250_87.method5675(true);
			Static160.aClass250_35.method5675(true);
			Static179.aClass250_40.method5675(true);
			Static84.aBoolean85 = true;
			Static147.aClass250_27.anInt7316 = 2;
			Static96.aClass250_20.anInt7316 = 2;
			Static82.aClass250_17.anInt7316 = 2;
			Static181.aClass250_41.anInt7316 = 2;
			Static383.aClass250_75.anInt7316 = 2;
			Static10.aClass250_3.anInt7316 = 2;
			Static412.aClass250_86.anInt7316 = 2;
			Static267.method3900(-1, false, -1, Static389.aClass128_Sub1_1.anInt3566);
			Static364.aString42 = Static208.aClass84_53.method1678(Static167.anInt3118);
			Static341.anInt5936 = 200;
			Static274.anInt4882 = 95;
		} else if (Static341.anInt5936 == 200) {
			Static107.method1651(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method926() {
		@Pc(14) boolean local14 = Static63.aClass94_2.method1913();
		if (!local14) {
			this.method918();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method900() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static355.method4892();
		Static11.aClass142_1 = new Class142(Static119.aClass138_7);
		Static63.aClass94_2 = new Class94();
		if (Static221.aClass176_5 != Static234.aClass176_7) {
			Static276.aByteArrayArray96 = new byte[50][];
		}
		Static389.aClass128_Sub1_1 = new Class128_Sub1(Static119.aClass138_7);
		if (Static221.aClass176_5 == Static234.aClass176_7) {
			Static136.aString14 = this.getCodeBase().getHost();
			Static320.anInt5611 = 43594;
			Static194.anInt3509 = 443;
		} else if (Static370.method5089(Static221.aClass176_5)) {
			Static136.aString14 = this.getCodeBase().getHost();
			Static320.anInt5611 = Static435.anInt7499 + 40000;
			Static194.anInt3509 = Static435.anInt7499 + 50000;
		} else if (Static221.aClass176_5 == Static224.aClass176_6) {
			Static136.aString14 = "127.0.0.1";
			Static320.anInt5611 = Static435.anInt7499 + 40000;
			Static194.anInt3509 = Static435.anInt7499 + 50000;
		}
		Static41.anInt7070 = Static320.anInt5611;
		Static231.anInt4160 = Static320.anInt5611;
		Static58.anInt1248 = Static194.anInt3509;
		Static212.aString4 = Static136.aString14;
		if (Static96.aClass145_1 == Static248.aClass145_2) {
			Static40.aBoolean27 = true;
			Static281.anInt4959 = 0;
			Static32.aShortArray5 = Static270.aShortArray58;
			Static133.aShortArrayArray2 = Static69.aShortArrayArray1;
			Static267.anInt4801 = 16777215;
			Static284.aShortArray59 = Static371.aShortArray84;
			Static317.aShortArrayArray4 = Static340.aShortArrayArray7;
		} else {
			Static32.aShortArray5 = Static180.aShortArray51;
			Static317.aShortArrayArray4 = Static257.aShortArrayArray6;
			Static133.aShortArrayArray2 = Static356.aShortArrayArray8;
			Static284.aShortArray59 = Static114.aShortArray40;
		}
		Static163.anInt3040 = Static231.anInt4160;
		if (Static210.anInt3860 == 3) {
			Static193.anInt1052 = Static435.anInt7499;
		}
		Static13.aShortArray4 = Static348.aShortArray83 = Static339.aShortArray82 = Static309.aShortArray42 = new short[256];
		Static102.aClass163_1 = Static30.method498(Static299.aCanvas5);
		Static16.aClass228_1 = Static2.method155(Static299.aCanvas5);
		Static153.aClass118_2 = Static237.method3518();
		if (Static153.aClass118_2 != null) {
			Static153.aClass118_2.method4490(Static299.aCanvas5);
		}
		Static134.anInt5499 = Static210.anInt3860;
		try {
			if (Static119.aClass138_7.aClass133_3 != null) {
				Static158.aClass73_3 = new Class73(Static119.aClass138_7.aClass133_3, 5200, 0);
				for (@Pc(172) int local172 = 0; local172 < 30; local172++) {
					Static294.aClass73Array2[local172] = new Class73(Static119.aClass138_7.aClass133Array1[local172], 6000, 0);
				}
				Static160.aClass73_4 = new Class73(Static119.aClass138_7.aClass133_4, 6000, 0);
				Static62.aClass52_3 = new Class52(255, Static158.aClass73_3, Static160.aClass73_4, 500000);
				Static165.aClass73_5 = new Class73(Static119.aClass138_7.aClass133_2, 24, 0);
				Static119.aClass138_7.aClass133_3 = null;
				Static119.aClass138_7.aClass133Array1 = null;
				Static119.aClass138_7.aClass133_4 = null;
				Static119.aClass138_7.aClass133_2 = null;
			}
		} catch (@Pc(230) IOException local230) {
			Static165.aClass73_5 = null;
			Static158.aClass73_3 = null;
			Static62.aClass52_3 = null;
			Static160.aClass73_4 = null;
		}
		if (Static234.aClass176_7 != Static221.aClass176_5) {
			Static195.aBoolean209 = true;
		}
		Static365.aString43 = (Static288.aClass145_3 == Static248.aClass145_2 ? Static394.aClass84_89 : Static227.aClass84_54).method1678(Static167.anInt3118);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method903() {
	}
}
