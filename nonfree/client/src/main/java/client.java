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
				Static117.method2311("argument count");
			}
			Static249.anInt4834 = Integer.parseInt(arg0[0]);
			Static226.anInt4439 = 2;
			if (arg0[1].equals("live")) {
				Static54.anInt1335 = 0;
			} else if (arg0[1].equals("rc")) {
				Static54.anInt1335 = 1;
			} else if (arg0[1].equals("wip")) {
				Static54.anInt1335 = 2;
			} else {
				Static117.method2311("modewhat");
			}
			Static259.anInt3205 = Static226.method3909(arg0[2]);
			if (Static259.anInt3205 == -1) {
				if (arg0[2].equals("english")) {
					Static259.anInt3205 = 0;
				} else if (arg0[2].equals("german")) {
					Static259.anInt3205 = 1;
				} else {
					Static117.method2311("language");
				}
			}
			Static57.method1219(Static259.anInt3205);
			Static309.aBoolean444 = false;
			Static132.aBoolean191 = false;
			if (arg0[3].equals("game0")) {
				Static298.anInt5725 = 0;
			} else if (arg0[3].equals("game1")) {
				Static298.anInt5725 = 1;
			} else {
				Static117.method2311("game");
			}
			Static95.anInt6301 = Static298.anInt5725;
			Static31.aString51 = "";
			Static255.anInt4972 = 0;
			Static57.anInt1387 = 0;
			@Pc(128) client local128 = new client();
			Static334.aClient1 = local128;
			local128.method958(Static54.anInt1335 + 32, Static298.anInt5725 == 1 ? "stellardawn" : "runescape");
			Static168.aFrame2.setLocation(40, 40);
		} catch (@Pc(153) Exception local153) {
			Static113.method2252(local153, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method962() {
		Static260.anInt6423 = 0;
		while (Static133.method5820() && Static260.anInt6423 < 128) {
			if (!Static47.method1053() || Static74.aChar2 != '`' && Static74.aChar2 != '§') {
				Static57.anIntArray65[Static260.anInt6423] = Static46.anInt1195;
				Static88.anIntArray74[Static260.anInt6423] = Static74.aChar2;
				Static260.anInt6423++;
			} else if (Static129.method2472()) {
				Static66.method1396();
			} else {
				Static68.method1517();
			}
		}
		if (Static129.method2472()) {
			Static261.method4491();
		}
		Static346.anInt6449++;
		Static118.method2319(-1, null, -1);
		Static109.method2174(null, -1, -1);
		if (Static207.anInt4106 != -1) {
			Static32.method797(0, Static207.anInt4106, 0, Static17.anInt5991, 0, Static246.anInt4801, 0);
		}
		Static211.anInt4205++;
		for (@Pc(94) int local94 = 0; local94 < 32768; local94++) {
			@Pc(100) Class25_Sub1_Sub1_Sub2 local100 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local94];
			if (local100 != null) {
				@Pc(106) byte local106 = local100.aClass216_1.aByte73;
				if ((local106 & 0x1) != 0) {
					@Pc(114) int local114 = local100.method4646();
					@Pc(135) int local135;
					if ((local106 & 0x2) != 0 && local100.anInt5337 == 0 && Math.random() * 1000.0D < 10.0D) {
						local135 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(143) int local143 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local135 != 0 || local143 != 0) {
							@Pc(154) int local154 = local100.anIntArray402[0] + local135;
							@Pc(161) int local161 = local143 + local100.anIntArray401[0];
							if (local154 < 0) {
								local154 = 0;
							} else if (Static266.anInt5101 - local114 - 1 < local154) {
								local154 = Static266.anInt5101 - local114 - 1;
							}
							if (local161 < 0) {
								local161 = 0;
							} else if (local161 > Static339.anInt6352 - local114 - 1) {
								local161 = Static339.anInt6352 - local114 - 1;
							}
							@Pc(240) int local240 = Static345.method5685(0, local114, local114, 0, local114, Static117.aClass49Array1[local100.aByte62], local100.anIntArray402[0], local154, -1, local161, true, Static287.anIntArray414, local100.anIntArray401[0], Static232.anIntArray330);
							if (local240 > 0) {
								if (local240 > 9) {
									local240 = 9;
								}
								for (@Pc(251) int local251 = 0; local251 < local240; local251++) {
									local100.anIntArray402[local251] = Static287.anIntArray414[local240 - local251 - 1];
									local100.anIntArray401[local251] = Static232.anIntArray330[local240 - local251 - 1];
									local100.aByteArray75[local251] = 1;
								}
								local100.anInt5337 = local240;
							}
						}
					}
					Static40.method890(local100, true);
					local135 = Static44.method3564(local100);
					Static228.method3921(local135, Static275.anInt5381, local100, Static215.anInt4285);
					Static336.method4721(local100);
				}
			}
		}
		if (Static109.anInt2324 == 0 && Static88.anInt1583 == 0) {
			if (Static215.anInt4279 == 2) {
				Static175.method3302();
			} else {
				Static286.method4901();
			}
			if (Static347.anInt6472 >> 7 < 14 || Static347.anInt6472 >> 7 >= Static266.anInt5101 - 14 || Static347.anInt6471 >> 7 < 14 || Static347.anInt6471 >> 7 >= Static339.anInt6352 - 14) {
				Static25.method611();
			}
		}
		while (true) {
			@Pc(378) Class5_Sub12 local378;
			@Pc(383) Class96 local383;
			@Pc(396) Class96 local396;
			do {
				local378 = (Class5_Sub12) Static42.aClass211_2.method5596();
				if (local378 == null) {
					while (true) {
						do {
							local378 = (Class5_Sub12) Static237.aClass211_20.method5596();
							if (local378 == null) {
								while (true) {
									do {
										local378 = (Class5_Sub12) Static145.aClass211_39.method5596();
										if (local378 == null) {
											if (Static287.aClass96_16 != null) {
												Static293.method4975();
											}
											if (Static180.anInt3606 % 1500 == 0) {
												Static230.method3961();
											}
											Static172.method3269();
											if (Static236.aBoolean334 && Static284.method4783() - 60000L > Static287.aLong190) {
												Static123.method2411();
												return;
											}
											return;
										}
										local383 = local378.aClass96_4;
										if (local383.anInt2914 < 0) {
											break;
										}
										local396 = Static121.method2396(local383.anInt2929);
									} while (local396 == null || local396.aClass96Array1 == null || local383.anInt2914 >= local396.aClass96Array1.length || local396.aClass96Array1[local383.anInt2914] != local383);
									Static223.method3891(local378);
								}
							}
							local383 = local378.aClass96_4;
							if (local383.anInt2914 < 0) {
								break;
							}
							local396 = Static121.method2396(local383.anInt2929);
						} while (local396 == null || local396.aClass96Array1 == null || local383.anInt2914 >= local396.aClass96Array1.length || local396.aClass96Array1[local383.anInt2914] != local383);
						Static223.method3891(local378);
					}
				}
				local383 = local378.aClass96_4;
				if (local383.anInt2914 < 0) {
					break;
				}
				local396 = Static121.method2396(local383.anInt2929);
			} while (local396 == null || local396.aClass96Array1 == null || local383.anInt2914 >= local396.aClass96Array1.length || local383 != local396.aClass96Array1[local383.anInt2914]);
			Static223.method3891(local378);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method966(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class5_Sub1 local15 = new Class5_Sub1(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method1832();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(29) int[] local29 = Static2.anIntArray1 = new int[6];
					local29[0] = local15.method1845();
					local29[1] = local15.method1845();
					local29[2] = local15.method1845();
					local29[3] = local15.method1845();
					local29[4] = local15.method1845();
					local29[5] = local15.method1845();
				} else if (local19 == 4) {
					@Pc(74) int local74 = local15.method1832();
					Static279.anIntArray406 = new int[local74];
					for (@Pc(79) int local79 = 0; local79 < local74; local79++) {
						Static279.anIntArray406[local79] = local15.method1845();
						if (Static279.anIntArray406[local79] == 65535) {
							Static279.anIntArray406[local79] = -1;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method971() {
		@Pc(11) boolean local11 = Static159.aClass7_1.method242();
		if (!local11) {
			this.method978();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method948()) {
			return;
		}
		Static249.anInt4834 = Integer.parseInt(this.getParameter("worldid"));
		Static226.anInt4439 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static226.anInt4439 < 0 || Static226.anInt4439 > 1) {
			Static226.anInt4439 = 0;
		}
		Static54.anInt1335 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static54.anInt1335 < 0 || Static54.anInt1335 > 2) {
			Static54.anInt1335 = 0;
		}
		try {
			Static259.anInt3205 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(51) Exception local51) {
			Static259.anInt3205 = 0;
		}
		Static57.method1219(Static259.anInt3205);
		@Pc(60) String local60 = this.getParameter("objecttag");
		if (local60 != null && local60.equals("1")) {
			Static132.aBoolean191 = true;
		} else {
			Static132.aBoolean191 = false;
		}
		@Pc(76) String local76 = this.getParameter("js");
		if (local76 != null && local76.equals("1")) {
			Static309.aBoolean444 = true;
		} else {
			Static309.aBoolean444 = false;
		}
		@Pc(92) String local92 = this.getParameter("game");
		if (local92 != null && local92.equals("1")) {
			Static298.anInt5725 = 1;
		} else {
			Static298.anInt5725 = 0;
		}
		try {
			Static255.anInt4972 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(111) Exception local111) {
			Static255.anInt4972 = 0;
		}
		Static293.aString325 = this.getParameter("quiturl");
		Static31.aString51 = this.getParameter("settings");
		if (Static31.aString51 == null) {
			Static31.aString51 = "";
		}
		@Pc(129) String local129 = this.getParameter("country");
		if (local129 != null) {
			try {
				Static57.anInt1387 = Integer.parseInt(local129);
			} catch (@Pc(136) Exception local136) {
				Static57.anInt1387 = 0;
			}
		}
		Static95.anInt6301 = Integer.parseInt(this.getParameter("colourid"));
		if (Static95.anInt6301 < 0 || Static114.aColorArray1.length <= Static95.anInt6301) {
			Static95.anInt6301 = 0;
		}
		Static334.aClient1 = this;
		this.method945(Static54.anInt1335 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method946() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static162.method3000();
		Static154.aClass185_1 = new Class185(Static202.aClass10_3);
		Static159.aClass7_1 = new Class7();
		if (Static54.anInt1335 != 0) {
			Static269.aByteArrayArray17 = new byte[50][];
		}
		Static140.method2612(Static202.aClass10_3);
		if (Static226.anInt4439 == 0) {
			Static98.aString131 = this.getCodeBase().getHost();
			Static134.anInt2748 = 43594;
			Static108.anInt2320 = 443;
		} else if (Static226.anInt4439 == 1) {
			Static98.aString131 = this.getCodeBase().getHost();
			Static134.anInt2748 = Static249.anInt4834 + 40000;
			Static108.anInt2320 = Static249.anInt4834 + 50000;
		} else if (Static226.anInt4439 == 2) {
			Static98.aString131 = "127.0.0.1";
			Static108.anInt2320 = Static249.anInt4834 + 50000;
			Static134.anInt2748 = Static249.anInt4834 + 40000;
		}
		Static162.anInt3270 = Static134.anInt2748;
		Static62.anInt1434 = Static108.anInt2320;
		Static6.anInt195 = Static134.anInt2748;
		Static13.aString28 = Static98.aString131;
		if (Static11.anInt349 == 3) {
			Static315.anInt6021 = Static249.anInt4834;
		}
		if (Static298.anInt5725 == 1) {
			Static12.anInt376 = 16777215;
			Static306.aShortArray99 = Static241.aShortArray81;
			Static7.aBoolean6 = true;
			Static336.aShortArrayArray13 = Static208.aShortArrayArray11;
			Static165.aShortArrayArray9 = Static2.aShortArrayArray1;
			Static202.aShortArray47 = Static38.aShortArray5;
			Static28.anInt775 = 0;
		} else {
			Static306.aShortArray99 = Static48.aShortArray13;
			Static165.aShortArrayArray9 = Static288.aShortArrayArray14;
			Static336.aShortArrayArray13 = Static285.aShortArrayArray15;
			Static202.aShortArray47 = Static41.aShortArray6;
		}
		Static98.aShortArray18 = Static171.aShortArray37 = Static46.aShortArray12 = Static110.aShortArray19 = new short[256];
		Static312.anInt5956 = Static162.anInt3270;
		Static140.method2615();
		Static78.method1744(Static243.aCanvas3);
		Static306.method5239(Static243.aCanvas3);
		Static350.aClass79_1 = Static216.method3822();
		if (Static350.aClass79_1 != null) {
			Static350.aClass79_1.method2206(Static243.aCanvas3);
		}
		Static79.anInt1904 = Static11.anInt349;
		try {
			if (Static202.aClass10_3.aClass117_3 != null) {
				Static210.aClass35_4 = new Class35(Static202.aClass10_3.aClass117_3, 5200, 0);
				for (@Pc(172) int local172 = 0; local172 < 29; local172++) {
					Static253.aClass35Array1[local172] = new Class35(Static202.aClass10_3.aClass117Array1[local172], 6000, 0);
				}
				Static10.aClass35_1 = new Class35(Static202.aClass10_3.aClass117_1, 6000, 0);
				Static111.aClass219_2 = new Class219(255, Static210.aClass35_4, Static10.aClass35_1, 500000);
				Static243.aClass35_3 = new Class35(Static202.aClass10_3.aClass117_2, 24, 0);
				Static202.aClass10_3.aClass117_3 = null;
				Static202.aClass10_3.aClass117_1 = null;
				Static202.aClass10_3.aClass117_2 = null;
				Static202.aClass10_3.aClass117Array1 = null;
			}
		} catch (@Pc(228) IOException local228) {
			Static10.aClass35_1 = null;
			Static111.aClass219_2 = null;
			Static210.aClass35_4 = null;
			Static243.aClass35_3 = null;
		}
		if (Static298.anInt5725 == 0) {
			Static145.aString358 = Static35.aString55;
		} else if (Static298.anInt5725 == 1) {
			Static145.aString358 = Static341.aString366;
		}
		if (Static226.anInt4439 != 0) {
			Static336.aBoolean407 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method941() {
		if (Static247.anInt3874 == 1000) {
			return;
		}
		Static180.anInt3606++;
		if (Static180.anInt3606 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static1.anInt12 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static170.aRandom1.setSeed((long) Static1.anInt12);
		}
		this.method971();
		if (Static246.aClass195_1 != null) {
			Static246.aClass195_1.method5294();
		}
		Static19.method554();
		Static153.method2894();
		Static226.method3910();
		Static240.method4083();
		if (Static15.aClass59_1 != null) {
			Static15.aClass59_1.method4845((int) Static284.method4783());
		}
		if (Static350.aClass79_1 != null) {
			@Pc(84) int local84 = Static350.aClass79_1.method2204();
			Static175.anInt3555 = local84;
		}
		Static241.method4107();
		if (Static247.anInt3874 == 0) {
			this.method980();
			Static209.method3724();
		} else if (Static247.anInt3874 == 5) {
			this.method980();
			Static209.method3724();
		} else if (Static247.anInt3874 == 25 || Static247.anInt3874 == 28) {
			Static238.method4049();
		}
		if (Static247.anInt3874 == 10) {
			this.method962();
			Static6.method183();
			Static132.method2687();
			Static231.method3978();
		} else if (Static247.anInt3874 == 30) {
			Static229.method3949();
		} else if (Static247.anInt3874 == 40) {
			Static231.method3978();
			if (Static29.anInt782 != -3) {
				if (Static29.anInt782 == 15) {
					Static320.method5395();
				} else if (Static29.anInt782 != 2) {
					Static310.method5284();
				}
			}
		}
		Static104.method2063(Static15.aClass59_1);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method960() {
		if (Static236.aBoolean334) {
			Static123.method2411();
		}
		if (Static15.aClass59_1 != null) {
			Static15.aClass59_1.method4857();
		}
		if (Static30.aFrame1 != null) {
			Static138.method2590(Static30.aFrame1, Static202.aClass10_3);
			Static30.aFrame1 = null;
		}
		if (Static338.aClass198_3 != null) {
			Static338.aClass198_3.aBoolean452 = false;
		}
		Static338.aClass198_3 = null;
		if (Static95.aClass68_23 != null) {
			Static95.aClass68_23.method1994();
			Static95.aClass68_23 = null;
		}
		Static5.method177(Static243.aCanvas3);
		Static226.method3908(Static243.aCanvas3);
		if (Static350.aClass79_1 != null) {
			Static350.aClass79_1.method2207(Static243.aCanvas3);
		}
		Static117.method2312();
		Static163.method3006();
		Static350.aClass79_1 = null;
		if (Static112.aClass14_1 != null) {
			Static112.aClass14_1.method5483();
		}
		if (Static244.aClass14_2 != null) {
			Static244.aClass14_2.method5483();
		}
		Static159.aClass7_1.method247();
		Static154.aClass185_1.method4967();
		if (Static341.aClass171_1 != null) {
			Static341.aClass171_1.method4587();
			Static341.aClass171_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method977(@OriginalArg(0) int arg0) {
		Static16.anInt521 = 0;
		Static348.aClass60_8 = null;
		Static159.aClass7_1.anInt269++;
		Static114.aClass68_11 = null;
		Static159.aClass7_1.anInt270 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method978() {
		if (Static338.anInt3906 < Static159.aClass7_1.anInt269) {
			if (Static312.anInt5956 == Static6.anInt195) {
				Static312.anInt5956 = Static62.anInt1434;
			} else {
				Static312.anInt5956 = Static6.anInt195;
			}
			Static239.anInt4616 = (Static159.aClass7_1.anInt269 - 1) * 250;
			if (Static239.anInt4616 > 3000) {
				Static239.anInt4616 = 3000;
			}
			if (Static159.aClass7_1.anInt269 >= 2 && Static159.aClass7_1.anInt270 == 6) {
				this.method959("js5connect_outofdate");
				Static247.anInt3874 = 1000;
				return;
			}
			if (Static159.aClass7_1.anInt269 >= 4 && Static159.aClass7_1.anInt270 == -1) {
				this.method959("js5crc");
				Static247.anInt3874 = 1000;
				return;
			}
			if (Static159.aClass7_1.anInt269 >= 4 && (Static247.anInt3874 == 0 || Static247.anInt3874 == 5)) {
				if (Static159.aClass7_1.anInt270 == 7 || Static159.aClass7_1.anInt270 == 9) {
					this.method959("js5connect_full");
				} else if (Static159.aClass7_1.anInt270 > 0) {
					this.method959("js5connect");
				} else {
					this.method959("js5io");
				}
				Static247.anInt3874 = 1000;
				return;
			}
		}
		Static338.anInt3906 = Static159.aClass7_1.anInt269;
		if (Static239.anInt4616 > 0) {
			Static239.anInt4616--;
			return;
		}
		try {
			if (Static16.anInt521 == 0) {
				Static348.aClass60_8 = Static202.aClass10_3.method310(Static312.anInt5956, Static13.aString28);
				Static16.anInt521++;
			}
			if (Static16.anInt521 == 1) {
				if (Static348.aClass60_8.anInt1838 == 2) {
					this.method977(1000);
					return;
				}
				if (Static348.aClass60_8.anInt1838 == 1) {
					Static16.anInt521++;
				}
			}
			if (Static16.anInt521 == 2) {
				Static114.aClass68_11 = new Class68((Socket) Static348.aClass60_8.anObject2, Static202.aClass10_3);
				@Pc(180) Class5_Sub1 local180 = new Class5_Sub1(5);
				local180.method1886(15);
				local180.method1851(560);
				Static114.aClass68_11.method2002(5, local180.aByteArray18);
				Static16.anInt521++;
				Static237.aLong154 = Static284.method4783();
			}
			if (Static16.anInt521 == 3) {
				if (Static247.anInt3874 == 0 || Static247.anInt3874 == 5 || Static114.aClass68_11.method1999() > 0) {
					@Pc(240) int local240 = Static114.aClass68_11.method2000();
					if (local240 != 0) {
						this.method977(local240);
						return;
					}
					Static16.anInt521++;
				} else if (Static284.method4783() - Static237.aLong154 > 30000L) {
					this.method977(1001);
					return;
				}
			}
			if (Static16.anInt521 == 4) {
				@Pc(269) boolean local269 = Static247.anInt3874 == 5 || Static247.anInt3874 == 10 || Static247.anInt3874 == 28;
				Static159.aClass7_1.method239(!local269, Static114.aClass68_11);
				Static348.aClass60_8 = null;
				Static16.anInt521 = 0;
				Static114.aClass68_11 = null;
			}
		} catch (@Pc(286) IOException local286) {
			this.method977(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method947() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method980() {
		if (!Static140.aBoolean186) {
			label222: while (true) {
				do {
					if (!Static133.method5820()) {
						break label222;
					}
				} while (Static74.aChar2 != 's' && Static74.aChar2 != 'S');
				Static140.aBoolean186 = true;
			}
		}
		@Pc(36) int local36;
		if (Static106.anInt2305 == 0) {
			@Pc(26) Runtime local26 = Runtime.getRuntime();
			local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
			@Pc(39) long local39 = Static284.method4783();
			if (Static209.aLong145 == 0L) {
				Static209.aLong145 = local39;
			}
			if (local36 > 16384 && local39 - Static209.aLong145 < 5000L) {
				if (local39 - Static7.aLong6 > 1000L) {
					System.gc();
					Static7.aLong6 = local39;
				}
				Static158.anInt3137 = 5;
				Static130.aString173 = Static135.aString176;
			} else {
				Static106.anInt2305 = 10;
				Static158.anInt3137 = 5;
				Static130.aString173 = Static348.aString375;
			}
			return;
		}
		@Pc(89) int local89;
		if (Static106.anInt2305 == 10) {
			for (local89 = 0; local89 < 4; local89++) {
				Static117.aClass49Array1[local89] = Static1.method1(Static266.anInt5101, Static339.anInt6352);
			}
			Static158.anInt3137 = 10;
			Static106.anInt2305 = 20;
			Static130.aString173 = Static192.aString223;
		} else if (Static106.anInt2305 == 20) {
			if (Static246.aClass195_1 == null) {
				Static246.aClass195_1 = new Class195(Static159.aClass7_1, Static154.aClass185_1);
			}
			if (Static246.aClass195_1.method5291()) {
				Static177.aClass170_50 = Static122.method2408(0, false, true);
				Static350.aClass170_123 = Static122.method2408(1, false, true);
				Static65.aClass170_36 = Static122.method2408(2, false, true);
				Static309.aClass170_103 = Static122.method2408(3, false, true);
				Static101.aClass170_44 = Static122.method2408(4, false, true);
				Static2.aClass170_1 = Static122.method2408(5, true, true);
				Static305.aClass170_102 = Static122.method2408(6, true, false);
				Static276.aClass170_91 = Static122.method2408(7, false, true);
				Static317.aClass170_114 = Static122.method2408(8, false, true);
				Static247.aClass170_74 = Static122.method2408(9, false, true);
				Static98.aClass170_42 = Static122.method2408(10, false, true);
				Static226.aClass170_80 = Static122.method2408(11, false, true);
				Static262.aClass170_90 = Static122.method2408(12, false, true);
				Static202.aClass170_75 = Static122.method2408(13, false, true);
				Static51.aClass170_13 = Static122.method2408(14, false, false);
				Static92.aClass170_40 = Static122.method2408(15, false, true);
				Static303.aClass170_101 = Static122.method2408(16, false, true);
				Static101.aClass170_46 = Static122.method2408(17, false, true);
				Static145.aClass170_118 = Static122.method2408(18, false, true);
				Static176.aClass170_34 = Static122.method2408(19, false, true);
				Static310.aClass170_107 = Static122.method2408(20, false, true);
				Static183.aClass170_65 = Static122.method2408(21, false, true);
				Static332.aClass170_119 = Static122.method2408(22, false, true);
				Static117.aClass170_52 = Static122.method2408(23, true, true);
				Static336.aClass170_94 = Static122.method2408(24, false, true);
				Static297.aClass170_98 = Static122.method2408(25, false, true);
				Static250.aClass170_89 = Static122.method2408(26, true, true);
				Static130.aClass170_55 = Static122.method2408(27, false, true);
				Static134.aClass170_59 = Static122.method2408(28, true, true);
				Static130.aString173 = Static261.aString297;
				Static158.anInt3137 = 15;
				Static106.anInt2305 = 30;
			} else {
				Static158.anInt3137 = 12;
				Static130.aString173 = Static133.aString380;
			}
		} else if (Static106.anInt2305 == 30) {
			local89 = 0;
			for (local36 = 0; local36 < 29; local36++) {
				local89 += Static277.aClass159_Sub1Array1[local36].method4080() * Static300.anIntArray444[local36] / 100;
			}
			if (local89 == 100) {
				Static130.aString173 = Static117.aString157;
				Static158.anInt3137 = 20;
				Static105.method2139(Static317.aClass170_114);
				Static231.method3980(Static317.aClass170_114);
				Static106.anInt2305 = 40;
			} else {
				Static158.anInt3137 = 20;
				if (local89 != 0) {
					Static130.aString173 = Static336.aString312 + local89 + "%";
				}
			}
		} else if (Static106.anInt2305 == 40) {
			if (Static134.aClass170_59.method4580()) {
				this.method966(Static134.aClass170_59.method4571(1));
				Static130.aString173 = Static8.aString9;
				Static106.anInt2305 = 50;
				Static158.anInt3137 = 25;
			} else {
				Static130.aString173 = Static59.aString83 + Static134.aClass170_59.method4552() + "%";
				Static158.anInt3137 = 25;
			}
		} else if (Static106.anInt2305 == 50) {
			Static225.method3901(Static29.aBoolean56);
			Static194.aClass5_Sub17_Sub2_1 = new Class5_Sub17_Sub2();
			Static194.aClass5_Sub17_Sub2_1.method3193();
			Static112.aClass14_1 = Static244.method4158(Static202.aClass10_3, 22050, Static243.aCanvas3, 0);
			Static112.aClass14_1.method5480(Static194.aClass5_Sub17_Sub2_1);
			Static100.method2028(Static101.aClass170_44, Static92.aClass170_40, Static194.aClass5_Sub17_Sub2_1, Static51.aClass170_13);
			Static244.aClass14_2 = Static244.method4158(Static202.aClass10_3, 2048, Static243.aCanvas3, 1);
			Static5.aClass5_Sub17_Sub3_1 = new Class5_Sub17_Sub3();
			Static244.aClass14_2.method5480(Static5.aClass5_Sub17_Sub3_1);
			Static195.aClass186_1 = new Class186(22050, Static344.anInt1063);
			Static114.anInt2434 = Static305.aClass170_102.method4555("scape main");
			Static130.aString173 = Static231.aString264;
			Static158.anInt3137 = 30;
			Static106.anInt2305 = 60;
		} else if (Static106.anInt2305 == 60) {
			local89 = Static200.method5049(Static202.aClass170_75, Static317.aClass170_114);
			local36 = Static346.method5694();
			if (local36 > local89) {
				Static130.aString173 = Static199.aString230 + local89 * 100 / local36 + "%";
				Static158.anInt3137 = 35;
			} else {
				Static106.anInt2305 = 70;
				Static130.aString173 = Static180.aString213;
				Static158.anInt3137 = 35;
			}
		} else if (Static106.anInt2305 == 70) {
			local89 = Static9.method277(Static317.aClass170_114);
			local36 = Static76.method4849();
			if (local36 > local89) {
				Static130.aString173 = Static64.aString93 + local89 * 100 / local36 + "%";
				Static158.anInt3137 = 40;
			} else {
				Static106.anInt2305 = 80;
				Static130.aString173 = Static243.aString275;
				Static158.anInt3137 = 40;
			}
		} else if (Static106.anInt2305 == 80) {
			if (Static250.aClass170_89.method4580()) {
				Static112.anInterface1_2 = new Class69(Static250.aClass170_89, Static247.aClass170_74, Static317.aClass170_114);
				Static130.aString173 = Static118.aString158;
				Static158.anInt3137 = 45;
				Static106.anInt2305 = 90;
			} else {
				Static130.aString173 = Static287.aString321 + Static250.aClass170_89.method4552() + "%";
				Static158.anInt3137 = 45;
			}
		} else if (Static106.anInt2305 == 90) {
			Static130.aString173 = Static252.aString290;
			Static106.anInt2305 = 95;
			Static158.anInt3137 = 50;
		} else if (Static106.anInt2305 == 95) {
			if (Static140.aBoolean186) {
				Static326.anInt6197 = 1;
				Static32.anInt866 = 0;
				Static275.anInt5386 = 0;
				Static355.anInt6625 = 0;
				Static335.anInt6338 = 0;
			}
			Static140.aBoolean186 = true;
			Static287.method4908(Static202.aClass10_3);
			Static50.method1126();
			Static75.method1607(false, Static355.anInt6625);
			Static158.anInt3137 = 55;
			Static106.anInt2305 = 100;
			Static130.aString173 = Static122.aString169;
		} else if (Static106.anInt2305 == 100) {
			Static316.method5382(Static15.aClass59_1, Static317.aClass170_114, Static202.aClass170_75);
			Static158.anInt3137 = 60;
			Static130.aString173 = Static268.aString379;
			Static293.method4971(5);
			Static106.anInt2305 = 110;
		} else if (Static106.anInt2305 == 110) {
			Static65.aClass170_36.method4580();
			local89 = Static65.aClass170_36.method4552();
			Static303.aClass170_101.method4580();
			local89 += Static303.aClass170_101.method4552();
			Static101.aClass170_46.method4580();
			local89 += Static101.aClass170_46.method4552();
			Static145.aClass170_118.method4580();
			local89 += Static145.aClass170_118.method4552();
			Static176.aClass170_34.method4580();
			local89 += Static176.aClass170_34.method4552();
			Static310.aClass170_107.method4580();
			local89 += Static310.aClass170_107.method4552();
			Static183.aClass170_65.method4580();
			local89 += Static183.aClass170_65.method4552();
			Static332.aClass170_119.method4580();
			local89 += Static332.aClass170_119.method4552();
			Static336.aClass170_94.method4580();
			local89 += Static336.aClass170_94.method4552();
			Static297.aClass170_98.method4580();
			local89 += Static297.aClass170_98.method4552();
			Static130.aClass170_55.method4580();
			local89 += Static130.aClass170_55.method4552();
			if (local89 < 1100) {
				Static158.anInt3137 = 65;
				Static130.aString173 = Static158.aString195 + local89 / 11 + "%";
			} else {
				Static254.method4678(Static65.aClass170_36);
				Static348.method5753(Static65.aClass170_36);
				Static55.method1186(Static65.aClass170_36);
				Static157.method1195(Static65.aClass170_36, Static276.aClass170_91);
				Static161.method2994(Static303.aClass170_101, Static276.aClass170_91);
				Static321.method5421(Static276.aClass170_91, Static145.aClass170_118);
				Static336.method4724(Static276.aClass170_91, Static176.aClass170_34);
				Static208.method3702(Static65.aClass170_36);
				Static275.method4688(Static310.aClass170_107, Static350.aClass170_123, Static177.aClass170_50);
				Static43.method965(Static65.aClass170_36);
				Static150.method2872(Static183.aClass170_65, Static276.aClass170_91);
				Static12.method393(Static332.aClass170_119);
				Static184.method5544(Static65.aClass170_36);
				Static123.method2414(Static317.aClass170_114, Static309.aClass170_103, Static202.aClass170_75, Static276.aClass170_91);
				Static173.method3939(Static65.aClass170_36);
				Static34.method845(Static101.aClass170_46);
				Static79.method1758(new Class76(), Static336.aClass170_94, Static297.aClass170_98);
				Static159.method2974(Static297.aClass170_98, Static336.aClass170_94);
				Static355.method5835(Static65.aClass170_36);
				Static264.method2885(Static65.aClass170_36);
				Static312.method5292(Static65.aClass170_36);
				Static139.method5477(Static65.aClass170_36, Static317.aClass170_114);
				Static322.method5430(Static317.aClass170_114, Static65.aClass170_36);
				Static238.method4047(Static65.aClass170_36);
				Static282.method4774(Static65.aClass170_36, Static317.aClass170_114);
				Static209.method3726(Static65.aClass170_36);
				Static120.method2347(Static65.aClass170_36);
				Static130.aString173 = Static222.aString257;
				Static158.anInt3137 = 65;
				Static263.method4507();
				Static106.anInt2305 = 120;
			}
		} else if (Static106.anInt2305 == 120) {
			local89 = Static131.method2525(Static317.aClass170_114);
			local36 = Static159.method2975();
			if (local89 < local36) {
				Static158.anInt3137 = 70;
				Static130.aString173 = Static180.aString212 + local89 * 100 / local36 + "%";
			} else {
				Static338.method3594(Static317.aClass170_114, Static15.aClass59_1);
				Static141.method2636(Static29.aClass54Array1);
				Static130.aString173 = Static121.aString167;
				Static158.anInt3137 = 70;
				Static106.anInt2305 = 130;
			}
		} else if (Static106.anInt2305 == 130) {
			Static338.aClass198_3 = new Class198();
			Static202.aClass10_3.method316(10, Static338.aClass198_3);
			Static158.anInt3137 = 75;
			Static106.anInt2305 = 140;
			Static130.aString173 = Static67.aString96;
		} else if (Static106.anInt2305 == 140) {
			if (Static98.aClass170_42.method4563("huffman", "")) {
				@Pc(1054) Class110 local1054 = new Class110(Static98.aClass170_42.method4554("", "huffman"));
				Static271.method4588(local1054);
				Static130.aString173 = Static38.aString59;
				Static106.anInt2305 = 150;
				Static158.anInt3137 = 80;
			} else {
				Static130.aString173 = Static246.aString281 + "0%";
				Static158.anInt3137 = 80;
			}
		} else if (Static106.anInt2305 == 150) {
			if (!Static309.aClass170_103.method4580()) {
				Static130.aString173 = Static295.aString328 + Static309.aClass170_103.method4552() * 3 / 4 + "%";
				Static158.anInt3137 = 85;
			} else if (!Static262.aClass170_90.method4580()) {
				Static130.aString173 = Static295.aString328 + (Static262.aClass170_90.method4552() / 10 + 75) + "%";
				Static158.anInt3137 = 85;
			} else if (!Static202.aClass170_75.method4580()) {
				Static130.aString173 = Static295.aString328 + (Static202.aClass170_75.method4552() / 20 + 85) + "%";
				Static158.anInt3137 = 85;
			} else if (Static117.aClass170_52.method4549("details")) {
				Static186.method5356(Static117.aClass170_52);
				Static299.method5086(Static130.aClass170_55);
				Static270.method4553(Static112.anInterface1_2, Static276.aClass170_91);
				Static130.aString173 = Static285.aString334;
				Static158.anInt3137 = 85;
				Static106.anInt2305 = 160;
			} else {
				Static130.aString173 = Static295.aString328 + (Static117.aClass170_52.method4579("details") / 10 + 90) + "%";
				Static158.anInt3137 = 85;
			}
		} else if (Static106.anInt2305 == 160) {
			local89 = Static17.method5331();
			if (local89 == -1) {
				Static130.aString173 = Static4.aString1;
				Static158.anInt3137 = 90;
			} else if (local89 == 7 || local89 == 9) {
				this.method959("worldlistfull");
				Static293.method4971(1000);
			} else if (Static101.aBoolean142) {
				Static106.anInt2305 = 170;
				Static158.anInt3137 = 90;
				Static130.aString173 = Static273.aString307;
			} else {
				this.method959("worldlistio_" + local89);
				Static293.method4971(1000);
			}
		} else if (Static106.anInt2305 == 170) {
			Static286.anIntArray412 = new int[Static19.anInt542];
			Static291.aStringArray41 = new String[Static15.anInt500];
			Static161.aBooleanArray15 = new boolean[Static19.anInt542];
			for (local89 = 0; local89 < Static19.anInt542; local89++) {
				if (Static306.method5240(local89).anInt4993 == 0) {
					Static161.aBooleanArray15[local89] = true;
					Static140.anInt2796++;
				}
				Static286.anIntArray412[local89] = -1;
			}
			Static136.method2579();
			Static213.anInt4221 = Static309.aClass170_103.method4555("loginscreen");
			Static2.aClass170_1.method4570(false);
			Static305.aClass170_102.method4570(true);
			Static317.aClass170_114.method4570(true);
			Static202.aClass170_75.method4570(true);
			Static98.aClass170_42.method4570(true);
			Static309.aClass170_103.method4570(true);
			Static220.aBoolean320 = true;
			Static65.aClass170_36.anInt5179 = 2;
			Static101.aClass170_46.anInt5179 = 2;
			Static303.aClass170_101.anInt5179 = 2;
			Static145.aClass170_118.anInt5179 = 2;
			Static176.aClass170_34.anInt5179 = 2;
			Static310.aClass170_107.anInt5179 = 2;
			Static183.aClass170_65.anInt5179 = 2;
			Static56.method1201(-1, -1, Static326.anInt6197, false);
			Static158.anInt3137 = 95;
			Static130.aString173 = Static314.aString341;
			Static106.anInt2305 = 180;
		} else if (Static106.anInt2305 == 180) {
			Static199.method3527(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method952() {
		if (Static247.anInt3874 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static189.method3467() / 1000000L - Static134.aLong103;
		Static134.aLong103 = Static189.method3467() / 1000000L;
		@Pc(33) boolean local33 = Static60.method1248();
		if (local33 && Static46.aBoolean84 && Static112.aClass14_1 != null) {
			Static112.aClass14_1.method5479();
		}
		if (Static247.anInt3874 == 30 || Static247.anInt3874 == 10) {
			if (Static286.aLong188 != 0L && Static284.method4783() > Static286.aLong188) {
				Static56.method1201(Static229.anInt4486, Static45.anInt1175, Static315.method5371(), false);
			} else if (Static15.aClass59_1.method4865() && Static283.aBoolean413) {
				Static251.method4404();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static30.aFrame1 == null) {
			@Pc(83) Container local83;
			if (Static168.aFrame2 == null) {
				local83 = Static202.aClass10_3.anApplet1;
			} else {
				local83 = Static168.aFrame2;
			}
			local92 = local83.getSize().width;
			local96 = local83.getSize().height;
			if (local83 == Static168.aFrame2) {
				@Pc(102) Insets local102 = Static168.aFrame2.getInsets();
				local92 -= local102.left + local102.right;
				local96 -= local102.top + local102.bottom;
			}
			if (local92 != Static9.anInt307 || local96 != Static275.anInt5385) {
				if (Static15.aClass59_1 == null || Static15.aClass59_1.method4786()) {
					Static162.method3000();
				} else {
					Static275.anInt5385 = local96;
					Static9.anInt307 = local92;
				}
				Static286.aLong188 = Static284.method4783() + 500L;
			}
		}
		if (Static30.aFrame1 != null && !Static252.aBoolean378 && (Static247.anInt3874 == 30 || Static247.anInt3874 == 10)) {
			Static56.method1201(-1, -1, Static326.anInt6197, false);
		}
		@Pc(169) boolean local169 = false;
		if (Static303.aBoolean433) {
			local169 = true;
			Static303.aBoolean433 = false;
		}
		if (local169) {
			Static110.method2187();
		}
		if (Static15.aClass59_1 != null && Static15.aClass59_1.method4854() || Static315.method5371() != 1) {
			Static241.method4110();
		}
		if (Static247.anInt3874 == 0) {
			Static141.method2639(local169, Static158.anInt3137, Static219.aColorArray3[Static95.anInt6301], Static118.aColorArray2[Static95.anInt6301], Static130.aString173, Static114.aColorArray1[Static95.anInt6301]);
		} else if (Static247.anInt3874 == 5) {
			Static227.method3916(local169 | Static15.aClass59_1.method4854(), Static118.aColorArray2[Static95.anInt6301].getRGB(), Static190.aClass91_8, Static114.aColorArray1[Static95.anInt6301].getRGB(), Static219.aColorArray3[Static95.anInt6301].getRGB(), Static15.aClass59_1);
		} else if (Static247.anInt3874 == 10) {
			Static310.method5286();
		} else if (Static247.anInt3874 == 25 || Static247.anInt3874 == 28) {
			if (Static253.anInt4963 == 1) {
				if (Static324.anInt6150 > Static30.anInt819) {
					Static30.anInt819 = Static324.anInt6150;
				}
				local92 = (Static30.anInt819 - Static324.anInt6150) * 50 / Static30.anInt819;
				Static240.method4079(Static334.aString363 + "<br>(" + local92 + "%)", Static62.aClass91_3, true);
			} else if (Static253.anInt4963 == 2) {
				if (Static345.anInt6412 > Static9.anInt305) {
					Static9.anInt305 = Static345.anInt6412;
				}
				local92 = (Static9.anInt305 - Static345.anInt6412) * 50 / Static9.anInt305 + 50;
				Static240.method4079(Static334.aString363 + "<br>(" + local92 + "%)", Static62.aClass91_3, true);
			} else {
				Static240.method4079(Static334.aString363, Static62.aClass91_3, true);
			}
		} else if (Static247.anInt3874 == 30) {
			Static317.method5470(local17);
		} else if (Static247.anInt3874 == 40) {
			Static240.method4079(Static68.aString98 + "<br>" + Static63.aString87, Static62.aClass91_3, true);
		}
		if (Static138.anInt2773 == 3) {
			for (local92 = 0; local92 < Static169.anInt3450; local92++) {
				@Pc(373) Rectangle local373 = Class5_Sub3.aRectangleArray3[local92];
				if (Static177.aBooleanArray9[local92]) {
					Static15.aClass59_1.method4835(local373.y, local373.x, local373.height, local373.width, -1996553985);
				} else if (Static39.aBooleanArray3[local92]) {
					Static15.aClass59_1.method4835(local373.y, local373.x, local373.height, local373.width, -1996554240);
				}
			}
		}
		if (Static129.method2472()) {
			Static310.method5285(Static15.aClass59_1);
		}
		if ((Static247.anInt3874 == 30 || Static247.anInt3874 == 10) && Static138.anInt2773 == 0 && Static315.method5371() == 1 && !local169 && Static11.aString19.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static169.anInt3450; local96++) {
				if (Static39.aBooleanArray3[local96]) {
					Static39.aBooleanArray3[local96] = false;
					Static139.aRectangleArray4[local92++] = Class5_Sub3.aRectangleArray3[local96];
				}
			}
			Static15.aClass59_1.method4807(Static139.aRectangleArray4, local92);
		} else if (Static247.anInt3874 != 0) {
			Static15.aClass59_1.method4848();
			for (local92 = 0; local92 < Static169.anInt3450; local92++) {
				Static39.aBooleanArray3[local92] = false;
			}
		}
		if (Static220.aBoolean320) {
			Static35.method850();
		}
		if (Static140.aBoolean186 && Static247.anInt3874 == 10 && Static207.anInt4106 != -1) {
			Static140.aBoolean186 = false;
			Static287.method4908(Static202.aClass10_3);
		}
	}
}
