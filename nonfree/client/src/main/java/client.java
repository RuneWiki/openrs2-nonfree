import java.awt.Color;
import java.awt.Graphics;
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
			if (arg0.length < 7 || arg0.length > 8) {
				Static7.method103();
			}
			Static192.anInt4159 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static147.anInt3191 = 0;
			} else if (arg0[1].equals("office")) {
				Static147.anInt3191 = 1;
			} else if (arg0[1].equals("local")) {
				Static147.anInt3191 = 2;
			} else {
				Static7.method103();
			}
			if (arg0[2].equals("live")) {
				Static186.anInt4025 = 0;
			} else if (arg0[2].equals("rc")) {
				Static186.anInt4025 = 1;
			} else if (arg0[2].equals("wip")) {
				Static186.anInt4025 = 2;
			} else {
				Static7.method103();
			}
			if (arg0[4].equals("free")) {
				Static206.aBoolean199 = false;
			} else if (arg0[4].equals("members")) {
				Static206.aBoolean199 = true;
			} else {
				Static7.method103();
			}
			if (arg0[5].equals("english")) {
				Static179.anInt3919 = 0;
			} else if (arg0[5].equals("german")) {
				Static222.method3648();
				Static179.anInt3919 = 1;
			} else {
				Static7.method103();
			}
			if (arg0[6].equals("game0")) {
				Static135.anInt3032 = 0;
			} else if (arg0[6].equals("game1")) {
				Static135.anInt3032 = 1;
			} else {
				Static7.method103();
			}
			if (arg0.length != 8) {
				Static100.aBoolean92 = false;
			} else if (arg0[7].equals("safemode")) {
				Static100.aBoolean92 = true;
			} else {
				Static7.method103();
			}
			Static161.aString6 = "127.0.0.1";
			Static14.anInt340 = 0;
			Static154.aClass51_1193 = Static81.aClass51_607;
			@Pc(178) client local178 = new client();
			local178.method568("runescape", Static186.anInt4025 + 32);
			Static95.aFrame1.setLocation(40, 40);
		} catch (@Pc(195) Exception local195) {
			Static34.method595(null, local195);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method572() {
		if (Static47.anInt1142 == 1000) {
			return;
		}
		Static109.anInt2430++;
		if (Static109.anInt2430 % 1000 == 1) {
			@Pc(29) GregorianCalendar local29 = new GregorianCalendar();
			Static113.anInt2475 = local29.get(11) * 600 + local29.get(12) * 10 + local29.get(13) / 6;
			Static57.aRandom1.setSeed((long) Static113.anInt2475);
		}
		this.method590();
		Static182.method3081();
		Static76.method1309();
		Static208.method3447();
		Static27.method514();
		Static98.method1643();
		if (Static119.aClass64_25 != null) {
			@Pc(72) int local72 = Static119.aClass64_25.method1850();
			Static105.anInt2335 = local72;
		}
		if (Static47.anInt1142 == 0) {
			this.method585();
			Static160.method2700();
		} else if (Static47.anInt1142 == 5) {
			this.method585();
			Static160.method2700();
		} else if (Static47.anInt1142 == 10) {
			this.method581();
			Static131.method2274();
			return;
		} else if (Static47.anInt1142 == 20) {
			this.method581();
			Static189.method3164();
		} else if (Static47.anInt1142 == 25) {
			Static18.method365();
		} else if (Static47.anInt1142 == 28) {
			Static18.method365();
			Static131.method2274();
		}
		if (Static47.anInt1142 == 30) {
			Static54.method938();
		} else if (Static47.anInt1142 == 10) {
			this.method581();
			return;
		} else if (Static47.anInt1142 == 40) {
			Static189.method3164();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method569() {
		if (Static157.aBrowsercontrol1 != null) {
			Static157.aBrowsercontrol1.method2339();
		}
		if (Static51.aClass72_3 != null) {
			Static51.aClass72_3.method2249(this.getClass());
		}
		if (Static3.aClass26_1 != null) {
			Static3.aClass26_1.aBoolean28 = false;
		}
		Static3.aClass26_1 = null;
		if (Static192.aClass11_36 != null) {
			Static192.aClass11_36.method271();
			Static192.aClass11_36 = null;
		}
		Static16.method294(Static36.aCanvas1);
		Static109.method1858(Static36.aCanvas1);
		if (Static119.aClass64_25 != null) {
			Static119.aClass64_25.method1851(Static36.aCanvas1);
		}
		Static161.method2719();
		Static64.method1104();
		Static119.aClass64_25 = null;
		if (Static200.aClass42_2 != null) {
			Static200.aClass42_2.method2730();
		}
		if (Static92.aClass42_1 != null) {
			Static92.aClass42_1.method2730();
		}
		Static22.method471();
		Static113.method1896();
		try {
			if (Static85.aClass112_1 != null) {
				Static85.aClass112_1.method3286();
			}
			if (Static195.aClass112Array3 != null) {
				for (@Pc(77) int local77 = 0; local77 < Static195.aClass112Array3.length; local77++) {
					if (Static195.aClass112Array3[local77] != null) {
						Static195.aClass112Array3[local77].method3286();
					}
				}
			}
			if (Static197.aClass112_3 != null) {
				Static197.aClass112_3.method3286();
			}
			if (Static114.aClass112_4 != null) {
				Static114.aClass112_4.method3286();
			}
		} catch (@Pc(105) IOException local105) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method581() {
		Static200.method3302(this);
		for (Static125.anInt3560 = 0; Static13.method276() && Static125.anInt3560 < 128; Static125.anInt3560++) {
			Static187.anIntArray306[Static125.anInt3560] = Static16.anInt385;
			Static13.anIntArray15[Static125.anInt3560] = Static199.anInt4229;
		}
		Static48.anInt1156++;
		if (Static9.anInt179 != -1) {
			Static147.method2525(0, Static9.anInt179, Static185.anInt4016, 0, 0, Static90.anInt4701, 0);
		}
		Static27.anInt651++;
		Static42.method3753();
		while (true) {
			@Pc(63) Class1_Sub21 local63;
			@Pc(68) Class71 local68;
			@Pc(79) Class71 local79;
			do {
				local63 = (Class1_Sub21) Static39.aClass105_5.method3117();
				if (local63 == null) {
					while (true) {
						do {
							local63 = (Class1_Sub21) Static68.aClass105_8.method3117();
							if (local63 == null) {
								while (true) {
									do {
										local63 = (Class1_Sub21) Static152.aClass105_17.method3117();
										if (local63 == null) {
											if (Static111.aClass71_22 != null) {
												Static124.method3527();
												return;
											}
											return;
										}
										local68 = local63.aClass71_25;
										if (local68.anInt2788 < 0) {
											break;
										}
										local79 = Static7.method102(local68.anInt2785);
									} while (local79 == null || local79.aClass71Array2 == null || local79.aClass71Array2.length <= local68.anInt2788 || local79.aClass71Array2[local68.anInt2788] != local68);
									Static65.method1119(local63);
								}
							}
							local68 = local63.aClass71_25;
							if (local68.anInt2788 < 0) {
								break;
							}
							local79 = Static7.method102(local68.anInt2785);
						} while (local79 == null || local79.aClass71Array2 == null || local68.anInt2788 >= local79.aClass71Array2.length || local79.aClass71Array2[local68.anInt2788] != local68);
						Static65.method1119(local63);
					}
				}
				local68 = local63.aClass71_25;
				if (local68.anInt2788 < 0) {
					break;
				}
				local79 = Static7.method102(local68.anInt2785);
			} while (local79 == null || local79.aClass71Array2 == null || local79.aClass71Array2.length <= local68.anInt2788 || local68 != local79.aClass71Array2[local68.anInt2788]);
			Static65.method1119(local63);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method565()) {
			return;
		}
		Static192.anInt4159 = Integer.parseInt(this.getParameter("worldid"));
		Static186.anInt4025 = Integer.parseInt(this.getParameter("modewhat"));
		Static147.anInt3191 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("safemode");
		if (local29 != null && local29.equals("1")) {
			Static100.aBoolean92 = true;
		} else {
			Static100.aBoolean92 = false;
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static206.aBoolean199 = true;
		} else {
			Static206.aBoolean199 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static222.method3648();
			Static179.anInt3919 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static135.anInt3032 = 1;
		} else {
			Static135.anInt3032 = 0;
		}
		try {
			Static222.anInt4662 = Integer.parseInt(this.getParameter("js"));
			Static24.anInt606 = Integer.parseInt(this.getParameter("plug"));
			Static14.anInt340 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static154.aClass51_1193 = Static224.aClass51_1608.method1412(this);
		if (Static154.aClass51_1193 == null) {
			Static154.aClass51_1193 = Static81.aClass51_607;
		}
		@Pc(117) String local117 = this.getParameter("advert");
		if (local117 != null) {
			@Pc(122) byte[] local122 = local117.getBytes();
			@Pc(129) Class51 local129 = Static191.method3197(local122.length, 0, local122);
			@Pc(133) boolean local133 = Static134.method2404(local129);
		}
		Static161.aString6 = this.getCodeBase().getHost();
		this.method573(Static186.anInt4025 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method564() {
		if (Static47.anInt1142 == 1000) {
			return;
		}
		@Pc(19) boolean local19 = Static24.method480();
		if (local19 && Static178.aBoolean183 && Static200.aClass42_2 != null) {
			Static200.aClass42_2.method2737();
		}
		@Pc(30) boolean local30 = false;
		if (Static85.aBoolean88 && (Static47.anInt1142 == 30 || Static47.anInt1142 == 10)) {
			Static80.method1385();
		}
		if (Static88.aBoolean89) {
			Static88.aBoolean89 = false;
			local30 = true;
		}
		if (Static47.anInt1142 == 0) {
			Static176.method2993(local30, null, Static174.anInt3862, Static12.aClass51_107);
		} else if (Static47.anInt1142 == 5) {
			Static36.method638(Static80.aClass1_Sub2_Sub11_2);
		} else if (Static47.anInt1142 == 10 || Static47.anInt1142 == 20) {
			Static100.method1672();
		} else if (Static47.anInt1142 == 25 || Static47.anInt1142 == 28) {
			@Pc(94) int local94;
			if (Static50.anInt1201 == 1) {
				if (Static227.anInt4786 < Static11.anInt235) {
					Static227.anInt4786 = Static11.anInt235;
				}
				local94 = (Static227.anInt4786 - Static11.anInt235) * 50 / Static227.anInt4786;
				Static211.method3502(Static150.method2574(new Class51[] { Static30.aClass51_737, Static211.aClass51_1558, Static27.method511(local94), Static205.aClass51_1498 }), false);
			} else if (Static50.anInt1201 == 2) {
				if (Static98.anInt2136 > Static184.anInt3991) {
					Static184.anInt3991 = Static98.anInt2136;
				}
				local94 = (Static184.anInt3991 - Static98.anInt2136) * 50 / Static184.anInt3991 + 50;
				Static211.method3502(Static150.method2574(new Class51[] { Static30.aClass51_737, Static211.aClass51_1558, Static27.method511(local94), Static205.aClass51_1498 }), false);
			} else {
				Static211.method3502(Static30.aClass51_737, false);
			}
		} else if (Static47.anInt1142 == 30) {
			Static73.method1281();
		} else if (Static47.anInt1142 == 40) {
			Static211.method3502(Static150.method2574(new Class51[] { Static150.aClass51_1157, Static147.aClass51_1127, Static180.aClass51_1348 }), false);
		}
		@Pc(229) int local229;
		@Pc(227) Graphics local227;
		if ((Static47.anInt1142 == 30 || Static47.anInt1142 == 10) && Static36.anInt871 == 0 && !local30) {
			try {
				local227 = Static36.aCanvas1.getGraphics();
				for (local229 = 0; local229 < Static127.anInt2862; local229++) {
					if (Static22.aBooleanArray8[local229]) {
						Static210.aClass19_1.method882(Static187.anIntArray305[local229], Static62.anIntArray93[local229], Static33.anIntArray48[local229], Static164.anIntArray239[local229], local227);
						Static22.aBooleanArray8[local229] = false;
					}
				}
			} catch (@Pc(261) Exception local261) {
				Static36.aCanvas1.repaint();
			}
		} else if (Static47.anInt1142 > 0) {
			try {
				local227 = Static36.aCanvas1.getGraphics();
				Static210.aClass19_1.method888(local227);
				for (local229 = 0; local229 < Static127.anInt2862; local229++) {
					Static22.aBooleanArray8[local229] = false;
				}
			} catch (@Pc(294) Exception local294) {
				Static36.aCanvas1.repaint();
			}
		}
		if (Static60.aBoolean69) {
			Static156.method2677();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method585() {
		@Pc(18) int local18;
		if (Static163.anInt3533 == 0) {
			@Pc(9) Runtime local9 = Runtime.getRuntime();
			local18 = (int) ((local9.totalMemory() - local9.freeMemory()) / 1024L);
			@Pc(23) long local23 = Static144.method2489();
			if (Static99.aLong78 == 0L) {
				Static99.aLong78 = local23;
			}
			if (local18 > 16384 && local23 - Static99.aLong78 < 5000L) {
				if (local23 - Static7.aLong4 > 1000L) {
					System.gc();
					Static7.aLong4 = local23;
				}
				Static12.aClass51_107 = Static198.aClass51_1452;
				Static174.anInt3862 = 5;
			} else {
				Static174.anInt3862 = 5;
				Static163.anInt3533 = 10;
				Static12.aClass51_107 = Static181.aClass51_1352;
			}
			return;
		}
		@Pc(77) int local77;
		if (Static163.anInt3533 == 10) {
			Static158.method2685();
			for (local77 = 0; local77 < 4; local77++) {
				Static228.aClass90Array1[local77] = new Class90(104, 104);
			}
			Static163.anInt3533 = 30;
			Static12.aClass51_107 = Static127.aClass51_986;
			Static174.anInt3862 = 10;
		} else if (Static163.anInt3533 == 30) {
			Static43.aClass70_Sub1_12 = Static55.method957(true, true, false, 0);
			Static103.aClass70_Sub1_70 = Static55.method957(true, true, false, 1);
			Static115.aClass70_Sub1_34 = Static55.method957(true, false, true, 2);
			Static104.aClass70_Sub1_28 = Static55.method957(true, true, false, 3);
			Static128.aClass70_Sub1_69 = Static55.method957(true, true, false, 4);
			Static199.aClass70_Sub1_59 = Static55.method957(true, true, true, 5);
			Static8.aClass70_Sub1_3 = Static55.method957(false, true, true, 6);
			Static181.aClass70_Sub1_51 = Static55.method957(true, true, false, 7);
			Static77.aClass70_Sub1_20 = Static55.method957(true, true, false, 8);
			Static176.aClass70_Sub1_49 = Static55.method957(true, true, false, 9);
			Static183.aClass70_Sub1_53 = Static55.method957(true, true, false, 10);
			Static225.aClass70_Sub1_68 = Static55.method957(true, true, false, 11);
			Static188.aClass70_Sub1_57 = Static55.method957(true, true, false, 12);
			Static216.aClass70_Sub1_66 = Static55.method957(true, true, false, 13);
			Static83.aClass70_Sub1_22 = Static55.method957(false, true, false, 14);
			Static111.aClass70_Sub1_32 = Static55.method957(true, true, false, 15);
			Static186.aClass70_Sub1_55 = Static55.method957(true, true, false, 16);
			Static153.aClass70_Sub1_42 = Static55.method957(true, true, false, 17);
			Static161.aClass70_Sub1_46 = Static55.method957(true, true, false, 18);
			Static184.aClass70_Sub1_54 = Static55.method957(true, true, false, 19);
			Static158.aClass70_Sub1_45 = Static55.method957(true, true, false, 20);
			Static101.aClass70_Sub1_25 = Static55.method957(true, true, false, 21);
			Static28.aClass70_Sub1_8 = Static55.method957(true, true, false, 22);
			Static211.aClass70_Sub1_65 = Static55.method957(true, true, true, 23);
			Static105.aClass70_Sub1_30 = Static55.method957(true, true, false, 24);
			Static16.aClass70_Sub1_5 = Static55.method957(true, true, false, 25);
			Static103.aClass70_Sub1_71 = Static55.method957(true, true, true, 26);
			Static12.aClass51_107 = Static198.aClass51_1453;
			Static163.anInt3533 = 40;
			Static174.anInt3862 = 15;
		} else if (Static163.anInt3533 == 40) {
			local77 = Static43.aClass70_Sub1_12.method3541() * 4 / 100;
			local77 += Static103.aClass70_Sub1_70.method3541() * 4 / 100;
			local77 += Static115.aClass70_Sub1_34.method3541() / 100;
			local77 += Static104.aClass70_Sub1_28.method3541() * 2 / 100;
			local77 += Static128.aClass70_Sub1_69.method3541() * 6 / 100;
			local77 += Static199.aClass70_Sub1_59.method3541() * 4 / 100;
			local77 += Static8.aClass70_Sub1_3.method3541() * 2 / 100;
			local77 += Static181.aClass70_Sub1_51.method3541() * 50 / 100;
			local77 += Static77.aClass70_Sub1_20.method3541() * 2 / 100;
			local77 += Static176.aClass70_Sub1_49.method3541() * 2 / 100;
			local77 += Static183.aClass70_Sub1_53.method3541() * 2 / 100;
			local77 += Static225.aClass70_Sub1_68.method3541() * 2 / 100;
			local77 += Static188.aClass70_Sub1_57.method3541() * 2 / 100;
			local77 += Static216.aClass70_Sub1_66.method3541() * 2 / 100;
			local77 += Static83.aClass70_Sub1_22.method3541() * 2 / 100;
			local77 += Static111.aClass70_Sub1_32.method3541() * 2 / 100;
			local77 += Static186.aClass70_Sub1_55.method3541() / 100;
			local77 += Static153.aClass70_Sub1_42.method3541() / 100;
			local77 += Static161.aClass70_Sub1_46.method3541() / 100;
			local77 += Static184.aClass70_Sub1_54.method3541() / 100;
			local77 += Static158.aClass70_Sub1_45.method3541() / 100;
			local77 += Static101.aClass70_Sub1_25.method3541() / 100;
			local77 += Static28.aClass70_Sub1_8.method3541() / 100;
			local77 += Static211.aClass70_Sub1_65.method3541() / 100;
			local77 += Static105.aClass70_Sub1_30.method3541() / 100;
			local77 += Static16.aClass70_Sub1_5.method3541() / 100;
			local77 += Static103.aClass70_Sub1_71.method3541() / 100;
			if (local77 == 100) {
				Static174.anInt3862 = 20;
				Static12.aClass51_107 = Static13.aClass51_109;
				Static61.method1079(Static77.aClass70_Sub1_20);
				Static129.method2240(Static77.aClass70_Sub1_20);
				Static63.method1097(Static77.aClass70_Sub1_20);
				Static13.method267(Static77.aClass70_Sub1_20);
				Static163.anInt3533 = 45;
			} else {
				if (local77 != 0) {
					Static12.aClass51_107 = Static150.method2574(new Class51[] { Static127.aClass51_991, Static27.method511(local77), Static25.aClass51_199 });
				}
				Static174.anInt3862 = 20;
			}
		} else if (Static163.anInt3533 == 45) {
			Static185.method3102(Static18.aBoolean16);
			Static120.aClass1_Sub4_Sub1_2 = new Class1_Sub4_Sub1();
			Static120.aClass1_Sub4_Sub1_2.method395();
			Static200.aClass42_2 = Static148.method2541(Static36.aCanvas1, 22050, Static51.aClass72_3, 0);
			Static200.aClass42_2.method2728(Static120.aClass1_Sub4_Sub1_2);
			Static41.method720(Static128.aClass70_Sub1_69, Static83.aClass70_Sub1_22, Static111.aClass70_Sub1_32, Static120.aClass1_Sub4_Sub1_2);
			Static92.aClass42_1 = Static148.method2541(Static36.aCanvas1, 2048, Static51.aClass72_3, 1);
			Static111.aClass1_Sub4_Sub3_2 = new Class1_Sub4_Sub3();
			Static92.aClass42_1.method2728(Static111.aClass1_Sub4_Sub3_2);
			Static65.aClass23_1 = new Class23(22050, Static31.anInt702);
			Static140.anInt3107 = Static8.aClass70_Sub1_3.method3523(Static113.aClass51_823);
			Static163.anInt3533 = 50;
			Static12.aClass51_107 = Static112.aClass51_810;
			Static174.anInt3862 = 30;
		} else if (Static163.anInt3533 == 50) {
			local77 = Static168.method2870(Static77.aClass70_Sub1_20, Static216.aClass70_Sub1_66);
			local18 = Static151.method2613();
			if (local77 < local18) {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static51.aClass51_378, Static27.method511(local77 * 100 / local18), Static25.aClass51_199 });
				Static174.anInt3862 = 35;
			} else {
				Static163.anInt3533 = 60;
				Static12.aClass51_107 = Static30.aClass51_740;
				Static174.anInt3862 = 35;
			}
		} else if (Static163.anInt3533 == 60) {
			local77 = Static16.method299(Static77.aClass70_Sub1_20);
			local18 = Static201.method3307();
			if (local77 < local18) {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static58.aClass51_419, Static27.method511(local77 * 100 / local18), Static25.aClass51_199 });
				Static174.anInt3862 = 40;
			} else {
				Static174.anInt3862 = 40;
				Static12.aClass51_107 = Static158.aClass51_1215;
				Static163.anInt3533 = 65;
			}
		} else if (Static163.anInt3533 == 65) {
			Static43.method758(Static77.aClass70_Sub1_20, Static216.aClass70_Sub1_66);
			Static12.aClass51_107 = Static20.aClass51_179;
			Static174.anInt3862 = 45;
			Static142.method2482(5);
			Static163.anInt3533 = 70;
		} else if (Static163.anInt3533 == 70) {
			Static115.aClass70_Sub1_34.method3539();
			local77 = Static115.aClass70_Sub1_34.method3513();
			Static186.aClass70_Sub1_55.method3539();
			local77 += Static186.aClass70_Sub1_55.method3513();
			Static153.aClass70_Sub1_42.method3539();
			local77 += Static153.aClass70_Sub1_42.method3513();
			Static161.aClass70_Sub1_46.method3539();
			local77 += Static161.aClass70_Sub1_46.method3513();
			Static184.aClass70_Sub1_54.method3539();
			local77 += Static184.aClass70_Sub1_54.method3513();
			Static158.aClass70_Sub1_45.method3539();
			local77 += Static158.aClass70_Sub1_45.method3513();
			Static101.aClass70_Sub1_25.method3539();
			local77 += Static101.aClass70_Sub1_25.method3513();
			Static28.aClass70_Sub1_8.method3539();
			local77 += Static28.aClass70_Sub1_8.method3513();
			Static105.aClass70_Sub1_30.method3539();
			local77 += Static105.aClass70_Sub1_30.method3513();
			Static16.aClass70_Sub1_5.method3539();
			local77 += Static16.aClass70_Sub1_5.method3513();
			if (local77 < 1000) {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static7.aClass51_53, Static27.method511(local77 / 10), Static25.aClass51_199 });
				Static174.anInt3862 = 50;
			} else {
				Static207.method3438(Static115.aClass70_Sub1_34);
				Static78.method1356(Static115.aClass70_Sub1_34);
				Static5.method2792(Static115.aClass70_Sub1_34);
				Static60.method1056(Static181.aClass70_Sub1_51, Static115.aClass70_Sub1_34);
				Static193.method3241(Static206.aBoolean199, Static186.aClass70_Sub1_55, Static181.aClass70_Sub1_51);
				Static99.method1648(Static161.aClass70_Sub1_46, Static181.aClass70_Sub1_51);
				Static97.method1637(Static181.aClass70_Sub1_51, Static168.aClass1_Sub2_Sub11_Sub1_Sub1_2, Static184.aClass70_Sub1_54, Static206.aBoolean199);
				Static137.method2448(Static115.aClass70_Sub1_34);
				Static11.method163(Static158.aClass70_Sub1_45, Static43.aClass70_Sub1_12, Static103.aClass70_Sub1_70);
				Static192.method3227(Static181.aClass70_Sub1_51, Static101.aClass70_Sub1_25);
				Static169.method2895(Static28.aClass70_Sub1_8);
				Static197.method1854(Static115.aClass70_Sub1_34);
				Static17.method323(Static216.aClass70_Sub1_66, Static104.aClass70_Sub1_28, Static77.aClass70_Sub1_20, Static181.aClass70_Sub1_51);
				Static7.method105(Static115.aClass70_Sub1_34);
				Static193.method3237(Static153.aClass70_Sub1_42);
				Static178.method3023(new Class117(), Static16.aClass70_Sub1_5, Static105.aClass70_Sub1_30);
				Static184.method3095(Static16.aClass70_Sub1_5, Static105.aClass70_Sub1_30);
				Static12.aClass51_107 = Static39.aClass51_277;
				Static174.anInt3862 = 50;
				Static163.method2755();
				Static163.anInt3533 = 80;
			}
		} else if (Static163.anInt3533 == 80) {
			local77 = Static199.method3292(Static77.aClass70_Sub1_20);
			local18 = Static208.method3442();
			if (local18 > local77) {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static34.aClass51_226, Static27.method511(local77 * 100 / local18), Static25.aClass51_199 });
				Static174.anInt3862 = 60;
			} else {
				Static79.method1373(Static77.aClass70_Sub1_20);
				Static12.aClass51_107 = Static95.aClass51_718;
				Static174.anInt3862 = 60;
				Static163.anInt3533 = 90;
			}
		} else if (Static163.anInt3533 == 90) {
			if (Static103.aClass70_Sub1_71.method3539()) {
				@Pc(1166) Class9 local1166 = new Class9(Static176.aClass70_Sub1_49, Static103.aClass70_Sub1_71, Static77.aClass70_Sub1_20, 20, !Static18.aBoolean17);
				Static171.method2957(local1166);
				if (Static42.anInt4800 == 1) {
					Static171.method2955(0.9F);
				}
				if (Static42.anInt4800 == 2) {
					Static171.method2955(0.8F);
				}
				if (Static42.anInt4800 == 3) {
					Static171.method2955(0.7F);
				}
				if (Static42.anInt4800 == 4) {
					Static171.method2955(0.6F);
				}
				Static163.anInt3533 = 100;
				Static12.aClass51_107 = Static209.aClass51_1539;
				Static174.anInt3862 = 70;
			} else {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static78.aClass51_597, Static27.method511(Static103.aClass70_Sub1_71.method3513()), Static25.aClass51_199 });
				Static174.anInt3862 = 70;
			}
		} else if (Static163.anInt3533 == 100) {
			if (Static205.method3383(Static77.aClass70_Sub1_20)) {
				Static163.anInt3533 = 110;
			}
		} else if (Static163.anInt3533 == 110) {
			Static3.aClass26_1 = new Class26();
			Static51.aClass72_3.method2246(Static3.aClass26_1, 10);
			Static174.anInt3862 = 75;
			Static163.anInt3533 = 120;
			Static12.aClass51_107 = Static223.aClass51_1596;
		} else if (Static163.anInt3533 == 120) {
			if (Static183.aClass70_Sub1_53.method3515(Static81.aClass51_607, Static95.aClass51_717)) {
				@Pc(1270) Class98 local1270 = new Class98(Static183.aClass70_Sub1_53.method3525(Static81.aClass51_607, Static95.aClass51_717));
				Static79.method1377(local1270);
				Static174.anInt3862 = 80;
				Static12.aClass51_107 = Static64.aClass51_463;
				Static163.anInt3533 = 130;
			} else {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static18.aClass51_156, Static135.aClass51_1062 });
				Static174.anInt3862 = 80;
			}
		} else if (Static163.anInt3533 == 130) {
			if (!Static104.aClass70_Sub1_28.method3539()) {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static204.aClass51_1482, Static27.method511(Static104.aClass70_Sub1_28.method3513() * 4 / 5), Static25.aClass51_199 });
				Static174.anInt3862 = 85;
			} else if (!Static188.aClass70_Sub1_57.method3539()) {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static204.aClass51_1482, Static27.method511(Static188.aClass70_Sub1_57.method3513() / 6 + 80), Static25.aClass51_199 });
				Static174.anInt3862 = 85;
			} else if (Static216.aClass70_Sub1_66.method3539()) {
				Static174.anInt3862 = 100;
				Static163.anInt3533 = 140;
				Static12.aClass51_107 = Static28.aClass51_213;
			} else {
				Static12.aClass51_107 = Static150.method2574(new Class51[] { Static204.aClass51_1482, Static27.method511(Static216.aClass70_Sub1_66.method3513() / 20 + 96), Static25.aClass51_199 });
				Static174.anInt3862 = 85;
			}
		} else if (Static163.anInt3533 == 140) {
			Static157.anInt3437 = Static104.aClass70_Sub1_28.method3523(Static199.aClass51_1455);
			Static199.aClass70_Sub1_59.method3526(false);
			Static8.aClass70_Sub1_3.method3526(true);
			Static77.aClass70_Sub1_20.method3526(true);
			Static216.aClass70_Sub1_66.method3526(true);
			Static183.aClass70_Sub1_53.method3526(true);
			Static104.aClass70_Sub1_28.method3526(true);
			Static60.aBoolean69 = true;
			Static142.method2482(8);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method586() {
		if (Static157.anInt3434 >= 4) {
			this.method566("js5crc");
			Static47.anInt1142 = 1000;
			return;
		}
		if (Static71.anInt1634 >= 4) {
			if (Static47.anInt1142 <= 5) {
				this.method566("js5io");
				Static47.anInt1142 = 1000;
				return;
			}
			Static201.anInt4267 = 3000;
			Static71.anInt1634 = 3;
		}
		if (Static201.anInt4267-- > 0) {
			return;
		}
		try {
			if (Static29.anInt681 == 0) {
				Static141.aClass38_8 = Static51.aClass72_3.method2254(Static161.aString6, Static192.anInt4167);
				Static29.anInt681++;
			}
			if (Static29.anInt681 == 1) {
				if (Static141.aClass38_8.anInt1236 == 2) {
					this.method589(-1);
					return;
				}
				if (Static141.aClass38_8.anInt1236 == 1) {
					Static29.anInt681++;
				}
			}
			if (Static29.anInt681 == 2) {
				Static230.aClass11_44 = new Class11((Socket) Static141.aClass38_8.anObject3, Static51.aClass72_3);
				@Pc(100) Class1_Sub16 local100 = new Class1_Sub16(5);
				local100.method3765(15);
				local100.method3808(503);
				Static230.aClass11_44.method269(5, local100.aByteArray62);
				Static29.anInt681++;
				Static112.aLong89 = Static144.method2489();
			}
			if (Static29.anInt681 == 3) {
				if (Static47.anInt1142 <= 5 || Static230.aClass11_44.method273() > 0) {
					@Pc(159) int local159 = Static230.aClass11_44.method275();
					if (local159 != 0) {
						this.method589(local159);
						return;
					}
					Static29.anInt681++;
				} else if (Static144.method2489() - Static112.aLong89 > 30000L) {
					this.method589(-2);
					return;
				}
			}
			if (Static29.anInt681 == 4) {
				Static226.method3701(Static47.anInt1142 > 20, Static230.aClass11_44);
				Static29.anInt681 = 0;
				Static126.anInt2769 = 0;
				Static230.aClass11_44 = null;
				Static141.aClass38_8 = null;
			}
		} catch (@Pc(198) IOException local198) {
			this.method589(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method571() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method589(@OriginalArg(0) int arg0) {
		Static29.anInt681 = 0;
		if (Static13.anInt329 == Static192.anInt4167) {
			Static192.anInt4167 = Static216.anInt4590;
		} else {
			Static192.anInt4167 = Static13.anInt329;
		}
		Static126.anInt2769++;
		Static230.aClass11_44 = null;
		Static141.aClass38_8 = null;
		if (Static126.anInt2769 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static47.anInt1142 > 5) {
				Static201.anInt4267 = 3000;
			} else {
				this.method566("js5connect_full");
				Static47.anInt1142 = 1000;
			}
		} else if (Static126.anInt2769 >= 2 && arg0 == 6) {
			this.method566("js5connect_outofdate");
			Static47.anInt1142 = 1000;
		} else if (Static126.anInt2769 >= 4) {
			if (Static47.anInt1142 <= 5) {
				this.method566("js5connect");
				Static47.anInt1142 = 1000;
			} else {
				Static201.anInt4267 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method575() {
		Static203.method3261(Static51.aClass72_3, Static100.aBoolean92);
		Static86.aShortArray20 = Static199.aShortArray46 = Static149.aShortArray21 = Static192.aShortArray45 = new short[256];
		if (Static135.anInt3032 == 1) {
			Static83.aShortArray15 = Static59.aShortArray11;
			Static81.aShortArray14 = Static227.aShortArray60;
			Static131.aShortArrayArray3 = Static188.aShortArrayArray4;
			Static212.aShortArrayArray6 = Static36.aShortArrayArray1;
		} else {
			Static131.aShortArrayArray3 = Static83.aShortArrayArray2;
			Static81.aShortArray14 = Static183.aShortArray44;
			Static212.aShortArrayArray6 = Static189.aShortArrayArray5;
			Static83.aShortArray15 = Static161.aShortArray26;
		}
		Static13.anInt329 = Static147.anInt3191 == 0 ? 43594 : Static192.anInt4159 + 40000;
		Static216.anInt4590 = Static147.anInt3191 == 0 ? 443 : Static192.anInt4159 + 50000;
		Static192.anInt4167 = Static13.anInt329;
		Static137.method2449();
		Static60.method1060(Static36.aCanvas1);
		Static31.method538(Static36.aCanvas1);
		Static119.aClass64_25 = Static66.method1131();
		if (Static119.aClass64_25 != null) {
			Static119.aClass64_25.method1852(Static36.aCanvas1);
		}
		Static212.anInt4513 = Static130.anInt2912;
		try {
			if (Static51.aClass72_3.aClass35_3 != null) {
				Static85.aClass112_1 = new Class112(Static51.aClass72_3.aClass35_3, 5200, 0);
				for (@Pc(97) int local97 = 0; local97 < 27; local97++) {
					Static195.aClass112Array3[local97] = new Class112(Static51.aClass72_3.aClass35Array1[local97], 6000, 0);
				}
				Static197.aClass112_3 = new Class112(Static51.aClass72_3.aClass35_1, 6000, 0);
				Static42.aClass100_102 = new Class100(255, Static85.aClass112_1, Static197.aClass112_3, 500000);
				Static114.aClass112_4 = new Class112(Static51.aClass72_3.aClass35_2, 24, 0);
				Static51.aClass72_3.aClass35_3 = null;
				Static51.aClass72_3.aClass35Array1 = null;
				Static51.aClass72_3.aClass35_2 = null;
				Static51.aClass72_3.aClass35_1 = null;
			}
		} catch (@Pc(155) IOException local155) {
			Static42.aClass100_102 = null;
			Static85.aClass112_1 = null;
			Static197.aClass112_3 = null;
			Static114.aClass112_4 = null;
		}
		Static208.aClass51_1536 = Static183.aClass51_1369;
		if (Static147.anInt3191 != 0) {
			Static48.aBoolean56 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method590() {
		@Pc(2) boolean local2 = Static154.method2647();
		if (!local2) {
			this.method586();
		}
	}
}
