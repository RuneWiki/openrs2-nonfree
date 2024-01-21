import java.awt.Canvas;
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
			if (arg0.length != 7) {
				Static67.method1324();
			}
			Static162.anInt3573 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static212.anInt4707 = 0;
			} else if (arg0[1].equals("office")) {
				Static212.anInt4707 = 1;
			} else if (arg0[1].equals("local")) {
				Static212.anInt4707 = 2;
			} else {
				Static67.method1324();
			}
			if (arg0[2].equals("live")) {
				Static82.anInt1957 = 0;
			} else if (arg0[2].equals("rc")) {
				Static82.anInt1957 = 1;
			} else if (arg0[2].equals("wip")) {
				Static82.anInt1957 = 2;
			} else {
				Static67.method1324();
			}
			if (arg0[3].equals("lowmem")) {
				Static153.method2624();
			} else if (arg0[3].equals("highmem")) {
				Static82.method1514();
			} else {
				Static67.method1324();
			}
			if (arg0[4].equals("free")) {
				Static155.aBoolean139 = false;
			} else if (arg0[4].equals("members")) {
				Static155.aBoolean139 = true;
			} else {
				Static67.method1324();
			}
			if (arg0[5].equals("english")) {
				Static107.anInt2426 = 0;
			} else if (arg0[5].equals("german")) {
				Static201.method3404();
				Static107.anInt2426 = 1;
			} else {
				Static67.method1324();
			}
			if (arg0[6].equals("game0")) {
				Static5.anInt123 = 0;
			} else if (arg0[6].equals("game1")) {
				Static5.anInt123 = 1;
			} else {
				Static67.method1324();
			}
			Static93.aClass24_639 = Static85.aClass24_1000;
			Static2.aString1 = "127.0.0.1";
			Static65.anInt1649 = 0;
			@Pc(178) client local178 = new client();
			local178.method606("runescape", Static82.anInt1957 + 32);
			Static32.aFrame1.setLocation(40, 40);
		} catch (@Pc(195) Exception local195) {
			Static151.method2591(null, local195);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method608() {
		if (Static147.aClass85_1 != null) {
			Static147.aClass85_1.aBoolean169 = false;
		}
		Static147.aClass85_1 = null;
		if (Static91.aClass53_2 != null) {
			Static91.aClass53_2.method1713();
			Static91.aClass53_2 = null;
		}
		Static80.method1482(Static8.aCanvas1);
		Static194.method3313(Static8.aCanvas1);
		if (Static111.aClass39_1 != null) {
			Static111.aClass39_1.method2487(Static8.aCanvas1);
		}
		Static127.method2124();
		Static138.method2411();
		Static111.aClass39_1 = null;
		if (Static36.aClass42_1 != null) {
			Static36.aClass42_1.method2429();
		}
		if (Static42.aClass42_2 != null) {
			Static42.aClass42_2.method2429();
		}
		Static145.method2522();
		Static44.method821();
		try {
			if (Static210.aClass10_4 != null) {
				Static210.aClass10_4.method315();
			}
			if (Static45.aClass10Array1 != null) {
				for (@Pc(69) int local69 = 0; local69 < Static45.aClass10Array1.length; local69++) {
					if (Static45.aClass10Array1[local69] != null) {
						Static45.aClass10Array1[local69].method315();
					}
				}
			}
			if (Static157.aClass10_3 != null) {
				Static157.aClass10_3.method315();
			}
			if (Static210.aClass10_5 != null) {
				Static210.aClass10_5.method315();
			}
		} catch (@Pc(101) IOException local101) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method611(@OriginalArg(0) int arg0) {
		if (Static73.anInt1755 == Static147.anInt3278) {
			Static73.anInt1755 = Static93.anInt2157;
		} else {
			Static73.anInt1755 = Static147.anInt3278;
		}
		Static148.aClass53_4 = null;
		Static65.anInt1646++;
		Static78.aClass82_2 = null;
		Static106.anInt2404 = 0;
		if (Static65.anInt1646 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static160.anInt4679 <= 5) {
				this.method597("js5connect_full");
				Static160.anInt4679 = 1000;
			} else {
				Static125.anInt2748 = 3000;
			}
		} else if (Static65.anInt1646 >= 2 && arg0 == 6) {
			this.method597("js5connect_outofdate");
			Static160.anInt4679 = 1000;
		} else if (Static65.anInt1646 >= 4) {
			if (Static160.anInt4679 <= 5) {
				this.method597("js5connect");
				Static160.anInt4679 = 1000;
			} else {
				Static125.anInt2748 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method614() {
		if (Static160.anInt4679 != 1000) {
			@Pc(18) boolean local18 = Static76.method1419();
			if (!local18) {
				this.method616();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method615() {
		@Pc(15) int local15;
		if (Static197.anInt4420 == 0) {
			Static32.method625(Static186.anIntArrayArrayArray2);
			for (local15 = 0; local15 < 4; local15++) {
				Static66.aClass93Array1[local15] = new Class93(104, 104);
			}
			Static169.aClass1_Sub2_Sub8_Sub3_3 = new Class1_Sub2_Sub8_Sub3(512, 512);
			Static159.aClass24_1030 = Static42.aClass24_265;
			Static50.anInt1256 = 5;
			Static197.anInt4420 = 30;
		} else if (Static197.anInt4420 == 30) {
			Static18.aClass69_Sub1_128 = Static71.method1358(true, false, 0, true);
			Static98.aClass69_Sub1_72 = Static71.method1358(true, false, 1, true);
			Static201.aClass69_Sub1_151 = Static71.method1358(false, true, 2, true);
			Static177.aClass69_Sub1_130 = Static71.method1358(true, false, 3, true);
			Static57.aClass69_Sub1_49 = Static71.method1358(true, false, 4, true);
			Static184.aClass69_Sub1_139 = Static71.method1358(true, true, 5, true);
			Static186.aClass69_Sub1_26 = Static71.method1358(true, true, 6, false);
			Static74.aClass69_Sub1_56 = Static71.method1358(true, false, 7, true);
			Static44.aClass69_Sub1_34 = Static71.method1358(true, false, 8, true);
			Static176.aClass69_Sub1_162 = Static71.method1358(false, true, 9, true);
			Static101.aClass69_Sub1_75 = Static71.method1358(true, false, 10, true);
			Static92.aClass69_Sub1_68 = Static71.method1358(true, false, 11, true);
			Static56.aClass69_Sub1_48 = Static71.method1358(true, false, 12, true);
			Static128.aClass69_Sub1_98 = Static71.method1358(false, true, 13, true);
			Static145.aClass69_Sub1_112 = Static71.method1358(true, false, 14, false);
			Static93.aClass69_Sub1_69 = Static71.method1358(true, false, 15, true);
			Static160.aClass69_Sub1_163 = Static71.method1358(true, false, 16, true);
			Static32.aClass69_Sub1_28 = Static71.method1358(true, false, 17, true);
			Static156.aClass69_Sub1_118 = Static71.method1358(true, false, 18, true);
			Static53.aClass69_Sub1_46 = Static71.method1358(true, false, 19, true);
			Static200.aClass69_Sub1_149 = Static71.method1358(true, false, 20, true);
			Static108.aClass69_Sub1_84 = Static71.method1358(true, false, 21, true);
			Static209.aClass69_Sub1_160 = Static71.method1358(true, false, 22, true);
			Static129.aClass69_Sub1_99 = Static71.method1358(true, true, 23, true);
			Static50.anInt1256 = 20;
			Static197.anInt4420 = 40;
			Static159.aClass24_1030 = Static179.aClass24_1155;
		} else if (Static197.anInt4420 == 40) {
			local15 = Static18.aClass69_Sub1_128.method2228() * 4 / 100;
			local15 += Static98.aClass69_Sub1_72.method2228() * 4 / 100;
			local15 += Static201.aClass69_Sub1_151.method2228() / 100;
			local15 += Static177.aClass69_Sub1_130.method2228() * 2 / 100;
			local15 += Static57.aClass69_Sub1_49.method2228() * 6 / 100;
			local15 += Static184.aClass69_Sub1_139.method2228() * 4 / 100;
			local15 += Static186.aClass69_Sub1_26.method2228() * 2 / 100;
			local15 += Static74.aClass69_Sub1_56.method2228() * 53 / 100;
			local15 += Static44.aClass69_Sub1_34.method2228() * 2 / 100;
			local15 += Static176.aClass69_Sub1_162.method2228() * 2 / 100;
			local15 += Static101.aClass69_Sub1_75.method2228() * 2 / 100;
			local15 += Static92.aClass69_Sub1_68.method2228() * 2 / 100;
			local15 += Static56.aClass69_Sub1_48.method2228() * 2 / 100;
			local15 += Static128.aClass69_Sub1_98.method2228() * 2 / 100;
			local15 += Static145.aClass69_Sub1_112.method2228() * 2 / 100;
			local15 += Static93.aClass69_Sub1_69.method2228() * 2 / 100;
			local15 += Static160.aClass69_Sub1_163.method2228() / 100;
			local15 += Static32.aClass69_Sub1_28.method2228() / 100;
			local15 += Static156.aClass69_Sub1_118.method2228() / 100;
			local15 += Static53.aClass69_Sub1_46.method2228() / 100;
			local15 += Static200.aClass69_Sub1_149.method2228() / 100;
			local15 += Static108.aClass69_Sub1_84.method2228() / 100;
			local15 += Static209.aClass69_Sub1_160.method2228() / 100;
			local15 += Static129.aClass69_Sub1_99.method2228() / 100;
			if (local15 == 100) {
				Static159.aClass24_1030 = Static108.aClass24_728;
				Static50.anInt1256 = 30;
				Static152.method2597(Static44.aClass69_Sub1_34, Static186.aClass69_Sub1_26, Static101.aClass69_Sub1_75);
				Static197.anInt4420 = 45;
			} else {
				if (local15 != 0) {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static96.aClass24_654, Static175.method3020(local15), Static77.aClass24_560 });
				}
				Static50.anInt1256 = 30;
			}
		} else if (Static197.anInt4420 == 45) {
			Static150.method2587(!Static30.aBoolean35);
			@Pc(508) Class1_Sub3_Sub4 local508 = new Class1_Sub3_Sub4();
			local508.method2883();
			Static36.aClass42_1 = Static84.method1558(22050, Static76.aClass99_1, 0, Static8.aCanvas1);
			Static36.aClass42_1.method2426(local508);
			Static75.method3570(Static93.aClass69_Sub1_69, Static145.aClass69_Sub1_112, Static57.aClass69_Sub1_49, local508);
			Static42.aClass42_2 = Static84.method1558(2048, Static76.aClass99_1, 1, Static8.aCanvas1);
			Static33.aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1();
			Static42.aClass42_2.method2426(Static33.aClass1_Sub3_Sub1_1);
			Static121.aClass4_1 = new Class4(22050, Static148.anInt3288);
			Static159.aClass24_1030 = Static158.aClass24_1025;
			Static197.anInt4420 = 50;
			Static50.anInt1256 = 35;
		} else if (Static197.anInt4420 == 50) {
			local15 = 0;
			if (Static18.aClass1_Sub2_Sub8_Sub1_Sub1_7 == null) {
				Static18.aClass1_Sub2_Sub8_Sub1_Sub1_7 = Static2.method85(Static85.aClass24_1000, Static49.aClass24_310, Static128.aClass69_Sub1_98, Static44.aClass69_Sub1_34);
			} else {
				local15++;
			}
			if (Static70.aClass1_Sub2_Sub8_Sub1_Sub1_6 == null) {
				Static70.aClass1_Sub2_Sub8_Sub1_Sub1_6 = Static18.aClass1_Sub2_Sub8_Sub1_Sub1_7;
			} else {
				local15++;
			}
			if (Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2 == null) {
				Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2 = Static2.method85(Static85.aClass24_1000, Static112.aClass24_732, Static128.aClass69_Sub1_98, Static44.aClass69_Sub1_34);
			} else {
				local15++;
			}
			if (Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5 == null) {
				Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5 = Static2.method85(Static85.aClass24_1000, Static202.aClass24_1284, Static128.aClass69_Sub1_98, Static44.aClass69_Sub1_34);
			} else {
				local15++;
			}
			if (local15 < 4) {
				Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static10.aClass24_410, Static175.method3020(local15 * 100 / 4), Static77.aClass24_560 });
				Static50.anInt1256 = 40;
			} else {
				Static197.anInt4420 = 60;
				Static50.anInt1256 = 40;
				Static159.aClass24_1030 = Static144.aClass24_951;
			}
		} else {
			@Pc(658) int local658;
			if (Static197.anInt4420 == 60) {
				local15 = Static112.method1891(Static101.aClass69_Sub1_75, Static44.aClass69_Sub1_34);
				local658 = Static62.method1203();
				if (local658 > local15) {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static53.aClass24_371, Static175.method3020(local15 * 100 / local658), Static77.aClass24_560 });
					Static50.anInt1256 = 50;
				} else {
					Static159.aClass24_1030 = Static133.aClass24_898;
					Static197.anInt4420 = 65;
					Static50.anInt1256 = 50;
				}
			} else if (Static197.anInt4420 == 65) {
				Static50.anInt1256 = 50;
				Static159.aClass24_1030 = Static163.aClass24_1052;
				Static57.method1099(5);
				Static197.anInt4420 = 70;
			} else if (Static197.anInt4420 == 70) {
				Static201.aClass69_Sub1_151.method2221();
				local15 = Static201.aClass69_Sub1_151.method2212();
				Static160.aClass69_Sub1_163.method2221();
				local15 += Static160.aClass69_Sub1_163.method2212();
				Static32.aClass69_Sub1_28.method2221();
				local15 += Static32.aClass69_Sub1_28.method2212();
				Static156.aClass69_Sub1_118.method2221();
				local15 += Static156.aClass69_Sub1_118.method2212();
				Static53.aClass69_Sub1_46.method2221();
				local15 += Static53.aClass69_Sub1_46.method2212();
				Static200.aClass69_Sub1_149.method2221();
				local15 += Static200.aClass69_Sub1_149.method2212();
				Static108.aClass69_Sub1_84.method2221();
				local15 += Static108.aClass69_Sub1_84.method2212();
				Static209.aClass69_Sub1_160.method2221();
				local15 += Static209.aClass69_Sub1_160.method2212();
				if (local15 < 800) {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static164.aClass24_1061, Static175.method3020(local15 / 8), Static77.aClass24_560 });
					Static50.anInt1256 = 60;
				} else {
					Static103.method1783(Static201.aClass69_Sub1_151);
					Static83.method1542(Static201.aClass69_Sub1_151);
					Static30.method577(Static74.aClass69_Sub1_56, Static201.aClass69_Sub1_151);
					Static125.method2096(Static155.aBoolean139, Static74.aClass69_Sub1_56, Static30.aBoolean35, Static160.aClass69_Sub1_163);
					Static172.method2979(Static156.aClass69_Sub1_118, Static74.aClass69_Sub1_56);
					Static204.method3447(Static74.aClass69_Sub1_56, Static53.aClass69_Sub1_46, Static155.aBoolean139, Static70.aClass1_Sub2_Sub8_Sub1_Sub1_6);
					Static16.method369(Static98.aClass69_Sub1_72, Static18.aClass69_Sub1_128, Static200.aClass69_Sub1_149);
					Static53.method1053(Static108.aClass69_Sub1_84, Static74.aClass69_Sub1_56);
					Static104.method1808(Static209.aClass69_Sub1_160);
					Static42.method794(Static201.aClass69_Sub1_151);
					Static3.method96(Static74.aClass69_Sub1_56, Static177.aClass69_Sub1_130, Static44.aClass69_Sub1_34, Static128.aClass69_Sub1_98);
					Static81.method1508(Static201.aClass69_Sub1_151);
					Static160.method3567(Static32.aClass69_Sub1_28);
					Static32.method627(Static201.aClass69_Sub1_151);
					Static59.method1108(Static201.aClass69_Sub1_151);
					Static159.aClass24_1030 = Static120.aClass24_785;
					Static50.anInt1256 = 60;
					Static80.method1484();
					Static197.anInt4420 = 80;
				}
			} else if (Static197.anInt4420 == 80) {
				local15 = 0;
				if (Static174.aClass1_Sub2_Sub8_Sub3_5 == null) {
					Static174.aClass1_Sub2_Sub8_Sub3_5 = Static120.method2030(Static17.aClass24_136, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static186.aClass1_Sub2_Sub8_Sub2Array2 == null) {
					Static186.aClass1_Sub2_Sub8_Sub2Array2 = Static74.method1398(Static85.aClass24_1000, Static24.aClass24_179, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static134.aClass1_Sub2_Sub8_Sub3Array15 == null) {
					Static134.aClass1_Sub2_Sub8_Sub3Array15 = Static9.method234(Static192.aClass24_1237, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static138.aClass1_Sub2_Sub8_Sub3Array18 == null) {
					Static138.aClass1_Sub2_Sub8_Sub3Array18 = Static134.aClass1_Sub2_Sub8_Sub3Array15;
				} else {
					local15++;
				}
				if (Static48.aClass1_Sub2_Sub8_Sub3Array9 == null) {
					Static48.aClass1_Sub2_Sub8_Sub3Array9 = Static9.method234(Static53.aClass24_369, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static186.aClass1_Sub2_Sub8_Sub3Array8 == null) {
					Static186.aClass1_Sub2_Sub8_Sub3Array8 = Static9.method234(Static58.aClass24_387, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static119.aClass1_Sub2_Sub8_Sub3Array13 == null) {
					Static119.aClass1_Sub2_Sub8_Sub3Array13 = Static9.method234(Static149.aClass24_980, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static135.aClass1_Sub2_Sub8_Sub3Array16 == null) {
					Static135.aClass1_Sub2_Sub8_Sub3Array16 = Static9.method234(Static197.aClass24_1262, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static135.aClass1_Sub2_Sub8_Sub3Array17 == null) {
					Static135.aClass1_Sub2_Sub8_Sub3Array17 = Static9.method234(Static104.aClass24_700, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static52.aClass1_Sub2_Sub8_Sub3Array10 == null) {
					Static52.aClass1_Sub2_Sub8_Sub3Array10 = Static9.method234(Static194.aClass24_1247, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static172.aClass1_Sub2_Sub8_Sub3_4 == null) {
					Static172.aClass1_Sub2_Sub8_Sub3_4 = Static120.method2030(Static207.aClass24_1177, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static26.aClass1_Sub2_Sub8_Sub3Array6 == null) {
					Static26.aClass1_Sub2_Sub8_Sub3Array6 = Static9.method234(Static89.aClass24_622, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static207.aClass1_Sub2_Sub8_Sub3Array22 == null) {
					Static207.aClass1_Sub2_Sub8_Sub3Array22 = Static9.method234(Static143.aClass24_944, Static85.aClass24_1000, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static46.aClass1_Sub2_Sub8_Sub2Array4 == null) {
					Static46.aClass1_Sub2_Sub8_Sub2Array4 = Static74.method1398(Static85.aClass24_1000, Static33.aClass24_218, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				if (Static33.aClass1_Sub2_Sub8_Sub2Array3 == null) {
					Static33.aClass1_Sub2_Sub8_Sub2Array3 = Static74.method1398(Static85.aClass24_1000, Static109.aClass24_738, Static44.aClass69_Sub1_34);
				} else {
					local15++;
				}
				local15++;
				if (local15 < 16) {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static105.aClass24_708, Static175.method3020(local15 * 100 / 16), Static77.aClass24_560 });
					Static50.anInt1256 = 70;
				} else {
					Static18.aClass1_Sub2_Sub8_Sub1_Sub1_7.method1272(Static33.aClass1_Sub2_Sub8_Sub2Array3, null);
					Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1272(Static33.aClass1_Sub2_Sub8_Sub2Array3, null);
					Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1272(Static33.aClass1_Sub2_Sub8_Sub2Array3, null);
					if (Static18.aClass1_Sub2_Sub8_Sub1_Sub1_7 != Static70.aClass1_Sub2_Sub8_Sub1_Sub1_6) {
						Static70.aClass1_Sub2_Sub8_Sub1_Sub1_6.method1272(Static33.aClass1_Sub2_Sub8_Sub2Array3, null);
					}
					for (local658 = 0; local658 < Static52.aClass1_Sub2_Sub8_Sub3Array10.length; local658++) {
						Static52.aClass1_Sub2_Sub8_Sub3Array10[local658].method2351();
					}
					Static174.aClass1_Sub2_Sub8_Sub3_5.method2351();
					@Pc(1130) int local1130 = (int) (Math.random() * 21.0D) - 10;
					@Pc(1137) int local1137 = (int) (Math.random() * 21.0D) - 10;
					@Pc(1144) int local1144 = (int) (Math.random() * 21.0D) - 10;
					@Pc(1151) int local1151 = (int) (Math.random() * 41.0D) - 20;
					for (@Pc(1153) int local1153 = 0; local1153 < Static134.aClass1_Sub2_Sub8_Sub3Array15.length; local1153++) {
						Static134.aClass1_Sub2_Sub8_Sub3Array15[local1153].method2360(local1130 + local1151, local1137 + local1151, local1144 + local1151);
					}
					Static186.aClass1_Sub2_Sub8_Sub2Array2[0].method1957(local1151 + local1130, local1151 + local1137, local1151 + local1144);
					Static197.anInt4420 = 90;
					Static50.anInt1256 = 70;
					Static159.aClass24_1030 = Static64.aClass24_460;
				}
			} else if (Static197.anInt4420 == 90) {
				if (Static176.aClass69_Sub1_162.method2221()) {
					@Pc(1239) Class36 local1239 = new Class36(Static176.aClass69_Sub1_162, Static44.aClass69_Sub1_34, 20, Static30.aBoolean35 ? 64 : 128);
					Static182.method3153(local1239);
					Static182.method3143(0.7F);
					Static197.anInt4420 = 110;
					Static50.anInt1256 = 90;
					Static159.aClass24_1030 = Static82.aClass24_588;
				} else {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static170.aClass24_1089, Static175.method3020(Static176.aClass69_Sub1_162.method2212()), Static77.aClass24_560 });
					Static50.anInt1256 = 90;
				}
			} else if (Static197.anInt4420 == 110) {
				Static147.aClass85_1 = new Class85();
				Static76.aClass99_1.method3421(10, Static147.aClass85_1);
				Static50.anInt1256 = 94;
				Static197.anInt4420 = 120;
				Static159.aClass24_1030 = Static119.aClass24_782;
			} else if (Static197.anInt4420 == 120) {
				if (Static101.aClass69_Sub1_75.method2215(Static127.aClass24_841, Static85.aClass24_1000)) {
					@Pc(1304) Class97 local1304 = new Class97(Static101.aClass69_Sub1_75.method2214(Static85.aClass24_1000, Static127.aClass24_841));
					Static7.method186(local1304);
					Static50.anInt1256 = 96;
					Static159.aClass24_1030 = Static168.aClass24_1078;
					Static197.anInt4420 = 130;
				} else {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static167.aClass24_1072, Static35.aClass24_1198 });
					Static50.anInt1256 = 96;
				}
			} else if (Static197.anInt4420 == 130) {
				if (!Static177.aClass69_Sub1_130.method2221()) {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static149.aClass24_979, Static175.method3020(Static177.aClass69_Sub1_130.method2212() * 4 / 5), Static77.aClass24_560 });
					Static50.anInt1256 = 100;
				} else if (!Static56.aClass69_Sub1_48.method2221()) {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static149.aClass24_979, Static175.method3020(Static56.aClass69_Sub1_48.method2212() / 6 + 80), Static77.aClass24_560 });
					Static50.anInt1256 = 100;
				} else if (Static128.aClass69_Sub1_98.method2221()) {
					Static159.aClass24_1030 = Static131.aClass24_879;
					Static50.anInt1256 = 100;
					Static197.anInt4420 = 140;
				} else {
					Static159.aClass24_1030 = Static63.method1281(new Class24[] { Static149.aClass24_979, Static175.method3020(Static128.aClass69_Sub1_98.method2212() / 20 + 96), Static77.aClass24_560 });
					Static50.anInt1256 = 100;
				}
			} else if (Static197.anInt4420 == 140) {
				Static184.aClass69_Sub1_139.method2207(false);
				Static186.aClass69_Sub1_26.method2207(true);
				Static44.aClass69_Sub1_34.method2207(true);
				Static128.aClass69_Sub1_98.method2207(true);
				Static101.aClass69_Sub1_75.method2207(true);
				Static57.method1099(10);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method598() {
		Static42.anInt1100++;
		if (Static42.anInt1100 % 1000 == 1) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static96.anInt2204 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static91.aRandom1.setSeed((long) Static96.anInt2204);
		}
		this.method614();
		Static2.method87();
		Static190.method3270();
		Static67.method1334();
		Static143.method2481();
		Static50.method909();
		if (Static111.aClass39_1 != null) {
			@Pc(67) int local67 = Static111.aClass39_1.method2485();
			Static188.anInt4177 = local67;
		}
		if (Static160.anInt4679 == 0) {
			this.method615();
			Static49.method901();
		} else if (Static160.anInt4679 == 5) {
			Static168.method2891(this);
			this.method615();
			Static49.method901();
		} else if (Static160.anInt4679 == 10) {
			Static168.method2891(this);
		} else if (Static160.anInt4679 == 20) {
			Static168.method2891(this);
			Static128.method2154();
		} else if (Static160.anInt4679 == 25) {
			Static47.method859();
		}
		if (Static160.anInt4679 == 30) {
			Static212.method3582();
		} else if (Static160.anInt4679 == 40) {
			Static128.method2154();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method616() {
		if (Static50.anInt1253 >= 4) {
			this.method597("js5crc");
			Static160.anInt4679 = 1000;
			return;
		}
		if (Static49.anInt1249 >= 4) {
			if (Static160.anInt4679 <= 5) {
				this.method597("js5io");
				Static160.anInt4679 = 1000;
				return;
			}
			Static125.anInt2748 = 3000;
			Static49.anInt1249 = 3;
		}
		if (Static125.anInt2748-- > 0) {
			return;
		}
		try {
			if (Static106.anInt2404 == 0) {
				Static78.aClass82_2 = Static76.aClass99_1.method3422(Static2.aString1, Static73.anInt1755);
				Static106.anInt2404++;
			}
			if (Static106.anInt2404 == 1) {
				if (Static78.aClass82_2.anInt3421 == 2) {
					this.method611(-1);
					return;
				}
				if (Static78.aClass82_2.anInt3421 == 1) {
					Static106.anInt2404++;
				}
			}
			if (Static106.anInt2404 == 2) {
				Static148.aClass53_4 = new Class53((Socket) Static78.aClass82_2.anObject2, Static76.aClass99_1);
				@Pc(108) Class1_Sub7 local108 = new Class1_Sub7(5);
				local108.method2753(15);
				local108.method2754(494);
				Static148.aClass53_4.method1717(local108.aByteArray38, 5);
				Static106.anInt2404++;
				Static114.aLong81 = Static24.method503();
			}
			if (Static106.anInt2404 == 3) {
				if (Static160.anInt4679 <= 5 || Static148.aClass53_4.method1718() > 0) {
					@Pc(146) int local146 = Static148.aClass53_4.method1716();
					if (local146 != 0) {
						this.method611(local146);
						return;
					}
					Static106.anInt2404++;
				} else if (Static24.method503() - Static114.aLong81 > 30000L) {
					this.method611(-2);
					return;
				}
			}
			if (Static106.anInt2404 == 4) {
				Static72.method1367(Static160.anInt4679 > 20, Static148.aClass53_4);
				Static106.anInt2404 = 0;
				Static78.aClass82_2 = null;
				Static148.aClass53_4 = null;
				Static65.anInt1646 = 0;
			}
		} catch (@Pc(194) IOException local194) {
			this.method611(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method609() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method604()) {
			return;
		}
		Static162.anInt3573 = Integer.parseInt(this.getParameter("worldid"));
		Static82.anInt1957 = Integer.parseInt(this.getParameter("modewhat"));
		Static212.anInt4707 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static153.method2624();
		} else {
			Static82.method1514();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static155.aBoolean139 = true;
		} else {
			Static155.aBoolean139 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static201.method3404();
			Static107.anInt2426 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static5.anInt123 = 1;
		} else {
			Static5.anInt123 = 0;
		}
		try {
			Static87.anInt2058 = Integer.parseInt(this.getParameter("js"));
			Static83.anInt2000 = Integer.parseInt(this.getParameter("plug"));
			Static65.anInt1649 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static93.aClass24_639 = Static137.aClass24_920.method775(this);
		if (Static93.aClass24_639 == null) {
			Static93.aClass24_639 = Static85.aClass24_1000;
		}
		Static2.aString1 = this.getCodeBase().getHost();
		this.method601(Static82.anInt1957 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method600() {
		if (Static5.anInt123 == 1) {
			Static10.aShortArray27 = Static174.aShortArray50;
			Static142.aShortArrayArray28 = Static118.aShortArrayArray24;
			Static126.aShortArray35 = Static24.aShortArray19;
			Static205.aShortArrayArray45 = Static62.aShortArrayArray14;
		} else {
			Static205.aShortArrayArray45 = Static188.aShortArrayArray40;
			Static10.aShortArray27 = Static126.aShortArray36;
			Static142.aShortArrayArray28 = Static75.aShortArrayArray46;
			Static126.aShortArray35 = Static145.aShortArray38;
		}
		Static93.anInt2157 = Static212.anInt4707 == 0 ? 443 : Static162.anInt3573 + 50000;
		Static147.anInt3278 = Static212.anInt4707 == 0 ? 43594 : Static162.anInt3573 + 40000;
		Static73.anInt1755 = Static147.anInt3278;
		Static3.aShortArray2 = Static166.aShortArray41 = Static133.aShortArray37 = new short[256];
		Static76.method1421();
		Static115.method1987(Static8.aCanvas1);
		Static45.method840(Static8.aCanvas1);
		Static111.aClass39_1 = Static195.method3318();
		if (Static111.aClass39_1 != null) {
			Static111.aClass39_1.method2490(Static8.aCanvas1);
		}
		Static44.anInt1132 = Static203.anInt4526;
		try {
			if (Static76.aClass99_1.aClass56_3 != null) {
				Static210.aClass10_4 = new Class10(Static76.aClass99_1.aClass56_3, 5200, 0);
				for (@Pc(94) int local94 = 0; local94 < 24; local94++) {
					Static45.aClass10Array1[local94] = new Class10(Static76.aClass99_1.aClass56Array1[local94], 6000, 0);
				}
				Static157.aClass10_3 = new Class10(Static76.aClass99_1.aClass56_2, 6000, 0);
				Static158.aClass6_3 = new Class6(255, Static210.aClass10_4, Static157.aClass10_3, 500000);
				Static210.aClass10_5 = new Class10(Static76.aClass99_1.aClass56_4, 24, 0);
				Static76.aClass99_1.aClass56_2 = null;
				Static76.aClass99_1.aClass56_3 = null;
				Static76.aClass99_1.aClass56_4 = null;
				Static76.aClass99_1.aClass56Array1 = null;
			}
		} catch (@Pc(152) IOException local152) {
			Static158.aClass6_3 = null;
			Static210.aClass10_5 = null;
			Static210.aClass10_4 = null;
			Static157.aClass10_3 = null;
		}
		if (Static212.anInt4707 != 0) {
			Static43.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method596() {
		@Pc(8) boolean local8 = Static8.method210();
		if (local8 && Static173.aBoolean177 && Static36.aClass42_1 != null) {
			Static36.aClass42_1.method2418();
		}
		@Pc(19) boolean local19 = false;
		if (Static63.aBoolean81) {
			local19 = true;
			Static63.aBoolean81 = false;
		}
		if (Static160.anInt4679 == 0) {
			Static119.method2027(Static159.aClass24_1030, null, Static50.anInt1256, local19);
		} else if (Static160.anInt4679 == 5 || Static160.anInt4679 == 10 || Static160.anInt4679 == 20) {
			Static169.method2917(Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5, Static18.aClass1_Sub2_Sub8_Sub1_Sub1_7);
		} else if (Static160.anInt4679 == 25) {
			@Pc(73) int local73;
			if (Static58.anInt1427 == 1) {
				if (Static170.anInt3802 < Static104.anInt2346) {
					Static170.anInt3802 = Static104.anInt2346;
				}
				local73 = (Static170.anInt3802 - Static104.anInt2346) * 50 / Static170.anInt3802;
				Static132.method2262(false, Static63.method1281(new Class24[] { Static150.aClass24_988, Static53.aClass24_374, Static175.method3020(local73), Static152.aClass24_992 }));
			} else if (Static58.anInt1427 == 2) {
				if (Static128.anInt2830 > Static79.anInt1893) {
					Static79.anInt1893 = Static128.anInt2830;
				}
				local73 = (Static79.anInt1893 - Static128.anInt2830) * 50 / Static79.anInt1893 + 50;
				Static132.method2262(false, Static63.method1281(new Class24[] { Static150.aClass24_988, Static53.aClass24_374, Static175.method3020(local73), Static152.aClass24_992 }));
			} else {
				Static132.method2262(false, Static150.aClass24_988);
			}
		} else if (Static160.anInt4679 == 30) {
			Static187.method3225();
		} else if (Static160.anInt4679 == 40) {
			Static132.method2262(false, Static63.method1281(new Class24[] { Static69.aClass24_494, Static76.aClass24_558, Static188.aClass24_1207 }));
		}
		@Pc(203) Canvas local203 = Static8.aCanvas1;
		@Pc(215) Graphics local215;
		@Pc(223) int local223;
		if (Static160.anInt4679 == 30 && Static93.anInt2158 == 0 && !local19) {
			try {
				local215 = local203.getGraphics();
				for (local223 = 0; local223 < Static26.anInt679; local223++) {
					if (Static163.aBooleanArray17[local223]) {
						Static25.aClass7_1.method1184(local215, Static150.anIntArray283[local223], Static138.anIntArray253[local223], Static114.anIntArray203[local223], Static145.anIntArray274[local223]);
						Static163.aBooleanArray17[local223] = false;
					}
				}
			} catch (@Pc(281) Exception local281) {
				local203.repaint();
			}
		} else if (Static160.anInt4679 > 0) {
			try {
				local215 = local203.getGraphics();
				Static25.aClass7_1.method1186(local215);
				for (local223 = 0; local223 < Static26.anInt679; local223++) {
					Static163.aBooleanArray17[local223] = false;
				}
			} catch (@Pc(235) Exception local235) {
				local203.repaint();
			}
		}
	}
}
