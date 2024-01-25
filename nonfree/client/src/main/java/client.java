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
				Static299.method5104("argument count");
			}
			Static233.anInt4718 = Integer.parseInt(arg0[0]);
			Static278.anInt6305 = 2;
			if (arg0[1].equals("live")) {
				Static156.anInt2987 = 0;
			} else if (arg0[1].equals("rc")) {
				Static156.anInt2987 = 1;
			} else if (arg0[1].equals("wip")) {
				Static156.anInt2987 = 2;
			} else {
				Static299.method5104("modewhat");
			}
			Static230.anInt4634 = Static349.method5644(arg0[2]);
			if (Static230.anInt4634 == -1) {
				if (arg0[2].equals("english")) {
					Static230.anInt4634 = 0;
				} else if (arg0[2].equals("german")) {
					Static230.anInt4634 = 1;
				} else {
					Static299.method5104("language");
				}
			}
			Static54.aBoolean64 = false;
			Static67.aBoolean77 = false;
			if (arg0[3].equals("game0")) {
				Static68.anInt1264 = 0;
			} else if (arg0[3].equals("game1")) {
				Static68.anInt1264 = 1;
			} else {
				Static299.method5104("game");
			}
			Static212.anInt4349 = 0;
			Static239.aString46 = "";
			Static186.anInt3765 = Static68.anInt1264;
			Static96.anInt1755 = 0;
			@Pc(123) client local123 = new client();
			Static210.aClient1 = local123;
			local123.method616(Static68.anInt1264 == 1 ? "stellardawn" : "runescape", Static156.anInt2987 + 32);
			Static241.aFrame2.setLocation(40, 40);
		} catch (@Pc(148) Exception local148) {
			Static38.method554(local148, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method629() {
		@Pc(12) boolean local12 = Static285.aClass172_3.method4574();
		if (!local12) {
			this.method644();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method627() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static247.method4334();
		Static101.aClass40_1 = new Class40(Static77.aClass118_7);
		Static285.aClass172_3 = new Class172();
		if (Static156.anInt2987 != 0) {
			Static168.aByteArrayArray23 = new byte[50][];
		}
		Static166.method2687(Static77.aClass118_7);
		if (Static278.anInt6305 == 0) {
			Static206.aString40 = this.getCodeBase().getHost();
			Static122.anInt2278 = 443;
			Static137.anInt2556 = 43594;
		} else if (Static278.anInt6305 == 1) {
			Static206.aString40 = this.getCodeBase().getHost();
			Static122.anInt2278 = Static233.anInt4718 + 50000;
			Static137.anInt2556 = Static233.anInt4718 + 40000;
		} else if (Static278.anInt6305 == 2) {
			Static137.anInt2556 = Static233.anInt4718 + 40000;
			Static206.aString40 = "127.0.0.1";
			Static122.anInt2278 = Static233.anInt4718 + 50000;
		}
		Static156.anInt2981 = Static122.anInt2278;
		Static68.anInt1253 = Static137.anInt2556;
		Static342.aString65 = Static206.aString40;
		Static201.anInt6769 = Static137.anInt2556;
		Static84.aShortArray41 = Static52.aShortArray90 = Static151.aShortArray51 = Static324.aShortArray113 = new short[256];
		Static11.anInt233 = Static68.anInt1253;
		if (Static68.anInt1264 == 1) {
			Static169.aShortArrayArray16 = Static115.aShortArrayArray3;
			Static339.anInt6543 = 0;
			Static45.aShortArray38 = Static124.aShortArray50;
			Static204.aBoolean280 = true;
			Static136.anInt6461 = 16777215;
			Static307.aShortArray92 = Static327.aShortArray105;
			Static229.aShortArrayArray12 = Static185.aShortArrayArray11;
		} else {
			Static307.aShortArray92 = Static33.aShortArray34;
			Static169.aShortArrayArray16 = Static13.aShortArrayArray1;
			Static45.aShortArray38 = Static247.aShortArray94;
			Static229.aShortArrayArray12 = Static160.aShortArrayArray15;
		}
		if (Static167.anInt3322 == 3) {
			Static155.anInt2961 = Static233.anInt4718;
		}
		Static278.aClass143_20 = Static281.method4704(Static34.aCanvas1);
		Static214.aClass29_1 = Static118.method1788(Static34.aCanvas1);
		Static242.aClass59_3 = Static250.method4387();
		if (Static242.aClass59_3 != null) {
			Static242.aClass59_3.method1022(Static34.aCanvas1);
		}
		Static188.anInt3856 = Static167.anInt3322;
		try {
			if (Static77.aClass118_7.aClass113_3 != null) {
				Static101.aClass69_3 = new Class69(Static77.aClass118_7.aClass113_3, 5200, 0);
				for (@Pc(161) int local161 = 0; local161 < 29; local161++) {
					Static157.aClass69Array1[local161] = new Class69(Static77.aClass118_7.aClass113Array1[local161], 6000, 0);
				}
				Static342.aClass69_6 = new Class69(Static77.aClass118_7.aClass113_2, 6000, 0);
				Static356.aClass171_4 = new Class171(255, Static101.aClass69_3, Static342.aClass69_6, 500000);
				Static91.aClass69_2 = new Class69(Static77.aClass118_7.aClass113_4, 24, 0);
				Static77.aClass118_7.aClass113_2 = null;
				Static77.aClass118_7.aClass113Array1 = null;
				Static77.aClass118_7.aClass113_3 = null;
				Static77.aClass118_7.aClass113_4 = null;
			}
		} catch (@Pc(219) IOException local219) {
			Static342.aClass69_6 = null;
			Static91.aClass69_2 = null;
			Static101.aClass69_3 = null;
			Static356.aClass171_4 = null;
		}
		if (Static278.anInt6305 != 0) {
			Static215.aBoolean293 = true;
		}
		if (Static68.anInt1264 == 0) {
			Static130.aString42 = Static148.aClass117_49.method2684(Static230.anInt4634);
		} else if (Static68.anInt1264 == 1) {
			Static130.aString42 = Static256.aClass117_87.method2684(Static230.anInt4634);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method630(@OriginalArg(1) int arg0) {
		Static285.aClass172_3.anInt5413++;
		Static43.aClass2_2 = null;
		Static243.aClass156_126 = null;
		Static285.aClass172_3.anInt5414 = arg0;
		Static2.anInt13 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method611() {
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method624() {
		if (Static240.aBoolean321) {
			Static62.method919();
		}
		if (Static107.aClass129_4 != null) {
			Static107.aClass129_4.method5010();
		}
		if (Static29.aFrame1 != null) {
			Static320.method5313(Static29.aFrame1, Static77.aClass118_7);
			Static29.aFrame1 = null;
		}
		if (Static291.aClass156_103 != null) {
			Static291.aClass156_103.method4190();
			Static291.aClass156_103 = null;
		}
		if (Static242.aClass59_3 != null) {
			Static242.aClass59_3.method1030(Static34.aCanvas1);
		}
		Static242.aClass59_3 = null;
		if (Static126.aClass78_4 != null) {
			Static126.aClass78_4.method5505();
		}
		if (Static143.aClass78_3 != null) {
			Static143.aClass78_3.method5505();
		}
		Static285.aClass172_3.method4579();
		Static101.aClass40_1.method591();
		if (Static232.aClass133_1 != null) {
			Static232.aClass133_1.method3561();
			Static232.aClass133_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method633() {
		@Pc(9) int local9;
		if (!Static279.aBoolean362) {
			for (local9 = 0; local9 < Static191.anInt6244; local9++) {
				if (Static10.aClass75Array1[local9].method1491() == 's' || Static10.aClass75Array1[local9].method1491() == 'S') {
					Static279.aBoolean362 = true;
					break;
				}
			}
		}
		@Pc(57) int local57;
		if (Static108.anInt2045 == 0) {
			@Pc(48) Runtime local48 = Runtime.getRuntime();
			local57 = (int) ((local48.totalMemory() - local48.freeMemory()) / 1024L);
			@Pc(60) long local60 = Static268.method4627();
			if (Static61.aLong36 == 0L) {
				Static61.aLong36 = local60;
			}
			if (local57 > 16384 && local60 - Static61.aLong36 < 5000L) {
				if (local60 - Static230.aLong132 > 1000L) {
					System.gc();
					Static230.aLong132 = local60;
				}
				Static329.aString62 = Static261.aClass117_89.method2684(Static230.anInt4634);
				Static122.anInt2279 = 5;
			} else {
				Static329.aString62 = Static20.aClass117_12.method2684(Static230.anInt4634);
				Static108.anInt2045 = 10;
				Static122.anInt2279 = 5;
			}
		} else if (Static108.anInt2045 == 10) {
			for (local9 = 0; local9 < 4; local9++) {
				Static211.aClass92Array1[local9] = Static232.method4151(Static240.anInt4832, Static24.anInt454);
			}
			Static329.aString62 = Static337.aClass117_117.method2684(Static230.anInt4634);
			Static108.anInt2045 = 20;
			Static122.anInt2279 = 10;
		} else if (Static108.anInt2045 == 20) {
			if (Static112.aClass127_1 == null) {
				Static112.aClass127_1 = new Class127(Static285.aClass172_3, Static101.aClass40_1);
			}
			if (Static112.aClass127_1.method3185()) {
				Static115.aClass144_37 = Static170.method2772(0, true, false);
				Static53.aClass144_20 = Static170.method2772(1, true, false);
				Static68.aClass144_25 = Static170.method2772(2, true, false);
				Static55.aClass144_21 = Static170.method2772(3, true, false);
				Static177.aClass144_45 = Static170.method2772(4, true, false);
				Static316.aClass144_100 = Static170.method2772(5, true, true);
				Static135.aClass144_38 = Static170.method2772(6, false, true);
				Static296.aClass144_94 = Static170.method2772(7, true, false);
				Static182.aClass144_49 = Static170.method2772(8, true, false);
				Static232.aClass144_77 = Static170.method2772(9, true, false);
				Static20.aClass144_6 = Static170.method2772(10, true, false);
				Static32.aClass144_9 = Static170.method2772(11, true, false);
				Static52.aClass144_79 = Static170.method2772(12, true, false);
				Static318.aClass144_101 = Static170.method2772(13, true, false);
				Static33.aClass144_11 = Static170.method2772(14, false, false);
				Static177.aClass144_47 = Static170.method2772(15, true, false);
				Static182.aClass144_50 = Static170.method2772(16, true, false);
				Static237.aClass144_81 = Static170.method2772(17, true, false);
				Static221.aClass144_70 = Static170.method2772(18, true, false);
				Static221.aClass144_72 = Static170.method2772(19, true, false);
				Static238.aClass144_82 = Static170.method2772(20, true, false);
				Static236.aClass144_80 = Static170.method2772(21, true, false);
				Static248.aClass144_86 = Static170.method2772(22, true, false);
				Static225.aClass144_74 = Static170.method2772(23, true, true);
				Static185.aClass144_51 = Static170.method2772(24, true, false);
				Static176.aClass144_44 = Static170.method2772(25, true, false);
				Static140.aClass144_39 = Static170.method2772(26, true, true);
				Static331.aClass144_106 = Static170.method2772(27, true, false);
				Static227.aClass144_75 = Static170.method2772(28, true, true);
				Static329.aString62 = Static67.aClass117_26.method2684(Static230.anInt4634);
				Static122.anInt2279 = 15;
				Static108.anInt2045 = 30;
			} else {
				Static329.aString62 = Static76.aClass117_96.method2684(Static230.anInt4634);
				Static122.anInt2279 = 12;
			}
		} else if (Static108.anInt2045 == 30) {
			local9 = 0;
			for (local57 = 0; local57 < 29; local57++) {
				local9 += Static350.aClass138_Sub1Array2[local57].method3700() * Static180.anIntArray367[local57] / 100;
			}
			if (local9 == 100) {
				Static329.aString62 = Static106.aClass117_40.method2684(Static230.anInt4634);
				Static122.anInt2279 = 20;
				Static319.method5308(Static182.aClass144_49);
				Static191.method5354(Static182.aClass144_49);
				Static108.anInt2045 = 40;
			} else {
				if (local9 != 0) {
					Static329.aString62 = Static306.aClass117_104.method2684(Static230.anInt4634) + local9 + "%";
				}
				Static122.anInt2279 = 20;
			}
		} else if (Static108.anInt2045 == 40) {
			if (Static227.aClass144_75.method3917()) {
				this.method643(Static227.aClass144_75.method3908(1));
				Static329.aString62 = Static246.aClass117_85.method2684(Static230.anInt4634);
				Static108.anInt2045 = 50;
				Static122.anInt2279 = 25;
			} else {
				Static329.aString62 = Static120.aClass117_36.method2684(Static230.anInt4634) + Static227.aClass144_75.method3905() + "%";
				Static122.anInt2279 = 25;
			}
		} else if (Static108.anInt2045 == 50) {
			Static310.method5247(Static210.aBoolean289);
			Static267.aClass11_Sub10_Sub4_2 = new Class11_Sub10_Sub4();
			Static267.aClass11_Sub10_Sub4_2.method4067();
			Static126.aClass78_4 = Static186.method3220(22050, Static34.aCanvas1, Static77.aClass118_7, 0);
			Static126.aClass78_4.method5507(Static267.aClass11_Sub10_Sub4_2);
			Static215.method3869(Static267.aClass11_Sub10_Sub4_2, Static177.aClass144_45, Static177.aClass144_47, Static33.aClass144_11);
			Static143.aClass78_3 = Static186.method3220(2048, Static34.aCanvas1, Static77.aClass118_7, 1);
			Static341.aClass11_Sub10_Sub3_2 = new Class11_Sub10_Sub3();
			Static143.aClass78_3.method5507(Static341.aClass11_Sub10_Sub3_2);
			Static107.aClass103_1 = new Class103(22050, Static352.anInt6698);
			Static244.anInt4938 = Static135.aClass144_38.method3902("scape main");
			Static329.aString62 = Static15.aClass117_94.method2684(Static230.anInt4634);
			Static122.anInt2279 = 30;
			Static108.anInt2045 = 60;
		} else if (Static108.anInt2045 == 60) {
			local9 = Static43.method653(Static182.aClass144_49, Static318.aClass144_101);
			local57 = Static64.method936();
			if (local9 < local57) {
				Static329.aString62 = Static270.aClass117_92.method2684(Static230.anInt4634) + local9 * 100 / local57 + "%";
				Static122.anInt2279 = 35;
			} else {
				Static329.aString62 = Static331.aClass117_113.method2684(Static230.anInt4634);
				Static108.anInt2045 = 70;
				Static122.anInt2279 = 35;
			}
		} else if (Static108.anInt2045 == 70) {
			local9 = Static257.method4462(Static182.aClass144_49);
			local57 = Static35.method514();
			if (local9 < local57) {
				Static329.aString62 = Static313.aClass117_106.method2684(Static230.anInt4634) + local9 * 100 / local57 + "%";
				Static122.anInt2279 = 40;
			} else {
				Static329.aString62 = Static56.aClass117_20.method2684(Static230.anInt4634);
				Static108.anInt2045 = 80;
				Static122.anInt2279 = 40;
			}
		} else if (Static108.anInt2045 == 80) {
			if (Static140.aClass144_39.method3917()) {
				Static76.anInterface2_6 = new Class110(Static140.aClass144_39, Static232.aClass144_77, Static182.aClass144_49);
				Static329.aString62 = Static160.aClass117_105.method2684(Static230.anInt4634);
				Static122.anInt2279 = 45;
				Static108.anInt2045 = 90;
			} else {
				Static329.aString62 = Static333.aClass117_116.method2684(Static230.anInt4634) + Static140.aClass144_39.method3905() + "%";
				Static122.anInt2279 = 45;
			}
		} else if (Static108.anInt2045 == 90) {
			Static329.aString62 = Static89.aClass117_34.method2684(Static230.anInt4634);
			Static108.anInt2045 = 95;
			Static122.anInt2279 = 50;
		} else if (Static108.anInt2045 == 95) {
			if (Static279.aBoolean362) {
				Static344.anInt6591 = 0;
				Static70.anInt1316 = 1;
				Static82.anInt1504 = 0;
				Static17.anInt285 = 0;
				Static276.anInt5525 = 0;
			}
			Static279.aBoolean362 = true;
			Static38.method553(Static77.aClass118_7);
			Static111.method1665();
			Static195.method3969(false, Static276.anInt5525);
			Static329.aString62 = Static185.aClass117_66.method2684(Static230.anInt4634);
			Static122.anInt2279 = 55;
			Static108.anInt2045 = 100;
		} else if (Static108.anInt2045 == 100) {
			Static96.method1451(Static182.aClass144_49, Static318.aClass144_101, Static107.aClass129_4);
			Static329.aString62 = Static30.aClass117_15.method2684(Static230.anInt4634);
			Static122.anInt2279 = 60;
			Static284.method4731(5);
			Static108.anInt2045 = 110;
		} else if (Static108.anInt2045 == 110) {
			Static68.aClass144_25.method3917();
			local9 = Static68.aClass144_25.method3905();
			Static182.aClass144_50.method3917();
			local9 += Static182.aClass144_50.method3905();
			Static237.aClass144_81.method3917();
			local9 += Static237.aClass144_81.method3905();
			Static221.aClass144_70.method3917();
			local9 += Static221.aClass144_70.method3905();
			Static221.aClass144_72.method3917();
			local9 += Static221.aClass144_72.method3905();
			Static238.aClass144_82.method3917();
			local9 += Static238.aClass144_82.method3905();
			Static236.aClass144_80.method3917();
			local9 += Static236.aClass144_80.method3905();
			Static248.aClass144_86.method3917();
			local9 += Static248.aClass144_86.method3905();
			Static185.aClass144_51.method3917();
			local9 += Static185.aClass144_51.method3905();
			Static176.aClass144_44.method3917();
			local9 += Static176.aClass144_44.method3905();
			Static331.aClass144_106.method3917();
			local9 += Static331.aClass144_106.method3905();
			if (local9 < 1100) {
				Static329.aString62 = Static279.aClass117_97.method2684(Static230.anInt4634) + local9 / 11 + "%";
				Static122.anInt2279 = 65;
			} else {
				Static279.method4701(Static68.aClass144_25);
				Static349.method5641(Static68.aClass144_25);
				Static31.method441(Static68.aClass144_25);
				Static126.method3669(Static296.aClass144_94, Static68.aClass144_25);
				Static177.method2850(Static230.anInt4634, Static182.aClass144_50, Static296.aClass144_94);
				Static45.method677(Static296.aClass144_94, Static230.anInt4634, Static221.aClass144_70);
				Static59.method891(Static221.aClass144_72, Static296.aClass144_94, Static230.anInt4634);
				Static2.method8(Static68.aClass144_25);
				Static164.method2605(Static115.aClass144_37, Static238.aClass144_82, Static53.aClass144_20);
				Static266.method4622(Static68.aClass144_25);
				Static337.method5496(Static296.aClass144_94, Static236.aClass144_80);
				Static98.method1461(Static248.aClass144_86);
				Static184.method3183(Static68.aClass144_25);
				Static115.method1774(Static182.aClass144_49, Static318.aClass144_101, Static296.aClass144_94, Static55.aClass144_21);
				Static14.method208(Static68.aClass144_25);
				Static285.method4752(Static237.aClass144_81);
				Static220.method3942(new Class159(), Static185.aClass144_51, Static176.aClass144_44);
				Static202.method3624(Static185.aClass144_51, Static176.aClass144_44);
				Static214.method3863(Static68.aClass144_25);
				Static216.method4854(Static68.aClass144_25);
				Static122.method1900(Static68.aClass144_25);
				Static215.method3875(Static68.aClass144_25, Static182.aClass144_49);
				Static315.method5278(Static182.aClass144_49, Static68.aClass144_25);
				Static23.method326(Static68.aClass144_25);
				Static62.method921(Static182.aClass144_49, Static68.aClass144_25);
				Static156.method2519(Static68.aClass144_25);
				Static278.method5405(Static68.aClass144_25);
				Static329.aString62 = Static234.aClass117_73.method2684(Static230.anInt4634);
				Static122.anInt2279 = 65;
				Static115.method1773();
				Static108.anInt2045 = 120;
			}
		} else if (Static108.anInt2045 == 120) {
			local9 = Static57.method866(Static182.aClass144_49);
			local57 = Static329.method5423();
			if (local57 > local9) {
				Static329.aString62 = Static306.aClass117_103.method2684(Static230.anInt4634) + local9 * 100 / local57 + "%";
				Static122.anInt2279 = 70;
			} else {
				Static106.method1617(Static182.aClass144_49, Static107.aClass129_4);
				Static81.method1213(Static213.aClass97Array17);
				Static329.aString62 = Static129.aClass117_48.method2684(Static230.anInt4634);
				Static108.anInt2045 = 130;
				Static122.anInt2279 = 70;
			}
		} else if (Static108.anInt2045 == 130) {
			Static329.aString62 = Static119.aClass117_46.method2684(Static230.anInt4634);
			Static108.anInt2045 = 140;
			Static122.anInt2279 = 75;
		} else if (Static108.anInt2045 == 140) {
			if (Static20.aClass144_6.method3909("huffman", "")) {
				@Pc(1172) Class150 local1172 = new Class150(Static20.aClass144_6.method3888("", "huffman"));
				Static308.method5157(local1172);
				Static329.aString62 = Static275.aClass117_95.method2684(Static230.anInt4634);
				Static122.anInt2279 = 80;
				Static108.anInt2045 = 150;
			} else {
				Static329.aString62 = Static85.aClass117_31.method2684(Static230.anInt4634) + "0%";
				Static122.anInt2279 = 80;
			}
		} else if (Static108.anInt2045 == 150) {
			if (!Static55.aClass144_21.method3917()) {
				Static329.aString62 = Static218.aClass117_55.method2684(Static230.anInt4634) + Static55.aClass144_21.method3905() * 3 / 4 + "%";
				Static122.anInt2279 = 85;
			} else if (!Static52.aClass144_79.method3917()) {
				Static329.aString62 = Static218.aClass117_55.method2684(Static230.anInt4634) + (Static52.aClass144_79.method3905() / 10 + 75) + "%";
				Static122.anInt2279 = 85;
			} else if (!Static318.aClass144_101.method3917()) {
				Static329.aString62 = Static218.aClass117_55.method2684(Static230.anInt4634) + (Static318.aClass144_101.method3905() / 20 + 85) + "%";
				Static122.anInt2279 = 85;
			} else if (Static225.aClass144_74.method3900("details")) {
				Static271.method3820(Static225.aClass144_74);
				Static342.method5585(Static331.aClass144_106);
				Static193.method3531(Static296.aClass144_94, Static76.anInterface2_6);
				Static329.aString62 = Static97.aClass117_38.method2684(Static230.anInt4634);
				Static122.anInt2279 = 85;
				Static108.anInt2045 = 160;
			} else {
				Static329.aString62 = Static218.aClass117_55.method2684(Static230.anInt4634) + (Static225.aClass144_74.method3889("details") / 10 + 90) + "%";
				Static122.anInt2279 = 85;
			}
		} else if (Static108.anInt2045 == 160) {
			local9 = Static258.method4484();
			if (local9 == -1) {
				Static329.aString62 = Static171.aClass117_58.method2684(Static230.anInt4634);
				Static122.anInt2279 = 90;
			} else if (local9 == 7 || local9 == 9) {
				this.method622("worldlistfull");
				Static284.method4731(1000);
			} else if (Static103.aBoolean113) {
				Static329.aString62 = Static99.aClass117_17.method2684(Static230.anInt4634);
				Static108.anInt2045 = 170;
				Static122.anInt2279 = 90;
			} else {
				this.method622("worldlistio_" + local9);
				Static284.method4731(1000);
			}
		} else if (Static108.anInt2045 == 170) {
			Static218.aStringArray23 = new String[Static49.anInt943];
			Static25.anIntArray516 = new int[Static306.anInt6039];
			Static315.aBooleanArray25 = new boolean[Static306.anInt6039];
			for (local9 = 0; local9 < Static306.anInt6039; local9++) {
				if (Static297.method4916(local9).anInt2986 == 0) {
					Static315.aBooleanArray25[local9] = true;
					Static8.anInt89++;
				}
				Static25.anIntArray516[local9] = -1;
			}
			Static141.method2179();
			Static153.anInt2899 = Static55.aClass144_21.method3902("loginscreen");
			Static316.aClass144_100.method3897(false);
			Static135.aClass144_38.method3897(true);
			Static182.aClass144_49.method3897(true);
			Static318.aClass144_101.method3897(true);
			Static20.aClass144_6.method3897(true);
			Static55.aClass144_21.method3897(true);
			Static68.aClass144_25.anInt4430 = 2;
			Static284.aBoolean363 = true;
			Static237.aClass144_81.anInt4430 = 2;
			Static182.aClass144_50.anInt4430 = 2;
			Static221.aClass144_70.anInt4430 = 2;
			Static221.aClass144_72.anInt4430 = 2;
			Static238.aClass144_82.anInt4430 = 2;
			Static236.aClass144_80.anInt4430 = 2;
			Static226.method4030(-1, false, Static70.anInt1316, -1);
			Static329.aString62 = Static211.aClass117_75.method2684(Static230.anInt4634);
			Static122.anInt2279 = 95;
			Static108.anInt2045 = 180;
		} else if (Static108.anInt2045 == 180) {
			Static136.method5520(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method621() {
		if (Static245.anInt6561 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static176.method2846() / 1000000L - Static266.aLong159;
		Static266.aLong159 = Static176.method2846() / 1000000L;
		@Pc(25) boolean local25 = Static291.method4846();
		if (local25 && Static120.aBoolean103 && Static126.aClass78_4 != null) {
			Static126.aClass78_4.method5509();
		}
		if (Static245.anInt6561 == 30 || Static245.anInt6561 == 10) {
			if (Static115.aLong76 != 0L && Static115.aLong76 < Static268.method4627()) {
				Static226.method4030(Static9.anInt151, false, Static104.method1587(), Static285.anInt5644);
			} else if (Static107.aClass129_4.method4959() && Static269.aBoolean356) {
				Static119.method1791();
			}
		}
		@Pc(82) int local82;
		@Pc(86) int local86;
		if (Static29.aFrame1 == null) {
			@Pc(74) Container local74;
			if (Static241.aFrame2 == null) {
				local74 = Static77.aClass118_7.anApplet1;
			} else {
				local74 = Static241.aFrame2;
			}
			local82 = local74.getSize().width;
			local86 = local74.getSize().height;
			if (Static241.aFrame2 == local74) {
				@Pc(92) Insets local92 = Static241.aFrame2.getInsets();
				local86 -= local92.top + local92.bottom;
				local82 -= local92.right + local92.left;
			}
			if (Static264.anInt5404 != local82 || local86 != Static319.anInt6199) {
				if (Static107.aClass129_4 == null || Static107.aClass129_4.method4987()) {
					Static247.method4334();
				} else {
					Static319.anInt6199 = local86;
					Static264.anInt5404 = local82;
				}
				Static115.aLong76 = Static268.method4627() + 500L;
			}
		}
		if (Static29.aFrame1 != null && !Static224.aBoolean407 && (Static245.anInt6561 == 30 || Static245.anInt6561 == 10)) {
			Static226.method4030(-1, false, Static70.anInt1316, -1);
		}
		@Pc(155) boolean local155 = false;
		if (Static153.aBoolean190) {
			local155 = true;
			Static153.aBoolean190 = false;
		}
		if (local155) {
			Static220.method3946();
		}
		if (Static107.aClass129_4 != null && Static107.aClass129_4.method4956() || Static104.method1587() != 1) {
			Static239.method4236();
		}
		if (Static245.anInt6561 == 0) {
			Static171.method2789(Static354.aColorArray6[Static186.anInt3765], local155, Static122.anInt2279, Static224.aColorArray5[Static186.anInt3765], Static329.aString62, Static120.aColorArray2[Static186.anInt3765]);
		} else if (Static245.anInt6561 == 5) {
			Static132.method2064(Static224.aColorArray5[Static186.anInt3765].getRGB(), Static120.aColorArray2[Static186.anInt3765].getRGB(), Static354.aColorArray6[Static186.anInt3765].getRGB(), Static107.aClass129_4, Static107.aClass129_4.method4956() | local155, Static106.aClass9_2);
		} else if (Static245.anInt6561 == 10) {
			Static217.method3895();
		} else if (Static245.anInt6561 == 25 || Static245.anInt6561 == 28) {
			if (Static252.anInt5975 == 1) {
				if (Static204.anInt4168 < Static9.anInt154) {
					Static204.anInt4168 = Static9.anInt154;
				}
				local82 = (Static204.anInt4168 - Static9.anInt154) * 50 / Static204.anInt4168;
				Static151.method2279(Static30.aClass9_1, true, Static349.aClass117_119.method2684(Static230.anInt4634) + "<br>(" + local82 + "%)");
			} else if (Static252.anInt5975 == 2) {
				if (Static242.anInt5710 < Static106.anInt1980) {
					Static242.anInt5710 = Static106.anInt1980;
				}
				local82 = (Static242.anInt5710 - Static106.anInt1980) * 50 / Static242.anInt5710 + 50;
				Static151.method2279(Static30.aClass9_1, true, Static349.aClass117_119.method2684(Static230.anInt4634) + "<br>(" + local82 + "%)");
			} else {
				Static151.method2279(Static30.aClass9_1, true, Static349.aClass117_119.method2684(Static230.anInt4634));
			}
		} else if (Static245.anInt6561 == 30) {
			Static294.method4879(local17);
		} else if (Static245.anInt6561 == 40) {
			Static151.method2279(Static30.aClass9_1, true, Static112.aClass117_43.method2684(Static230.anInt4634) + "<br>" + Static220.aClass117_79.method2684(Static230.anInt4634));
		}
		if (Static204.anInt4166 == 3) {
			for (local82 = 0; local82 < Static280.anInt219; local82++) {
				@Pc(384) Rectangle local384 = Class157.aRectangleArray3[local82];
				if (Static83.aBooleanArray8[local82]) {
					Static107.aClass129_4.method4941(local384.x, local384.y, local384.width, -1996553985, local384.height);
				} else if (Static18.aBooleanArray1[local82]) {
					Static107.aClass129_4.method4941(local384.x, local384.y, local384.width, -1996554240, local384.height);
				}
			}
		}
		if (Static86.method1243()) {
			Static237.method4196(Static107.aClass129_4);
		}
		if ((Static245.anInt6561 == 30 || Static245.anInt6561 == 10) && Static204.anInt4166 == 0 && Static104.method1587() == 1 && !local155 && Static167.aString31.equals("1.1")) {
			local82 = 0;
			for (local86 = 0; local86 < Static280.anInt219; local86++) {
				if (Static18.aBooleanArray1[local86]) {
					Static18.aBooleanArray1[local86] = false;
					Static207.aRectangleArray1[local82++] = Class157.aRectangleArray3[local86];
				}
			}
			Static107.aClass129_4.method4997(Static207.aRectangleArray1, local82);
		} else if (Static245.anInt6561 != 0) {
			Static107.aClass129_4.method5009();
			for (local82 = 0; local82 < Static280.anInt219; local82++) {
				Static18.aBooleanArray1[local82] = false;
			}
		}
		if (Static150.anInt2727 == 0) {
			Static244.method4311(15L);
		} else if (Static150.anInt2727 == 1) {
			Static244.method4311(10L);
		} else if (Static150.anInt2727 == 2) {
			Static244.method4311(5L);
		} else if (Static150.anInt2727 == 3) {
			Static244.method4311(2L);
		}
		if (Static284.aBoolean363) {
			Static151.method2278();
		}
		if (Static279.aBoolean362 && Static245.anInt6561 == 10 && Static270.anInt5491 != -1) {
			Static279.aBoolean362 = false;
			Static38.method553(Static77.aClass118_7);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method643(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class11_Sub25 local10 = new Class11_Sub25(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(20) int local20 = local10.method5185();
					if (local20 == 0) {
						return;
					}
					if (local20 == 1) {
						@Pc(111) int[] local111 = Static245.anIntArray541 = new int[6];
						local111[0] = local10.method5187();
						local111[1] = local10.method5187();
						local111[2] = local10.method5187();
						local111[3] = local10.method5187();
						local111[4] = local10.method5187();
						local111[5] = local10.method5187();
					} else {
						@Pc(40) int local40;
						@Pc(35) int local35;
						if (local20 == 4) {
							local35 = local10.method5185();
							Static84.anIntArray102 = new int[local35];
							for (local40 = 0; local40 < local35; local40++) {
								Static84.anIntArray102[local40] = local10.method5187();
								if (Static84.anIntArray102[local40] == 65535) {
									Static84.anIntArray102[local40] = -1;
								}
							}
						} else if (local20 == 5) {
							local35 = local10.method5185();
							Static164.anIntArray205 = new int[local35];
							for (local40 = 0; local40 < local35; local40++) {
								Static164.anIntArray205[local40] = local10.method5187();
								if (Static164.anIntArray205[local40] == 65535) {
									Static164.anIntArray205[local40] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method625() {
		if (Static245.anInt6561 == 1000) {
			return;
		}
		Static293.anInt5807++;
		if (Static293.anInt5807 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static74.anInt1412 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static118.aRandom1.setSeed((long) Static74.anInt1412);
		}
		this.method629();
		if (Static112.aClass127_1 != null) {
			Static112.aClass127_1.method3189();
		}
		Static202.method3626();
		Static168.method2723();
		Static278.aClass143_20.method4851();
		Static214.aClass29_1.method382();
		if (Static242.aClass59_3 != null) {
			@Pc(72) int local72 = Static242.aClass59_3.method1025();
			Static180.anInt4653 = local72;
		}
		if (Static107.aClass129_4 != null) {
			Static107.aClass129_4.method4969((int) Static268.method4627());
		}
		Static43.method657();
		Static191.anInt6244 = 0;
		for (@Pc(95) Class75 local95 = Static278.aClass143_20.method4856(); local95 != null && Static191.anInt6244 < 128; local95 = Static278.aClass143_20.method4856()) {
			if (local95.method1490() != 1) {
				@Pc(106) char local106 = local95.method1491();
				if (!Static101.method1502() || local106 != '`' && local106 != '§') {
					Static10.aClass75Array1[Static191.anInt6244] = local95;
					Static191.anInt6244++;
				} else if (Static86.method1243()) {
					Static101.method1496();
				} else {
					Static277.method4682();
				}
			}
		}
		Static182.aClass11_Sub39_1 = null;
		for (@Pc(157) Class11_Sub39 local157 = Static214.aClass29_1.method386(); local157 != null; local157 = Static214.aClass29_1.method386()) {
			@Pc(163) int local163 = local157.method5600();
			if (local163 == -1) {
				Static251.aClass16_41.method190(local157);
			} else if (Static180.method4114(local163)) {
				Static182.aClass11_Sub39_1 = local157;
			}
		}
		if (Static86.method1243()) {
			Static175.method2826();
		}
		if (Static245.anInt6561 == 0) {
			this.method633();
			Static277.method4683();
		} else if (Static245.anInt6561 == 5) {
			this.method633();
			Static277.method4683();
		} else if (Static245.anInt6561 == 25 || Static245.anInt6561 == 28) {
			Static44.method663();
		}
		if (Static245.anInt6561 == 10) {
			this.method647();
			Static197.method3593();
			Static242.method4805();
			Static71.method1076();
		} else if (Static245.anInt6561 == 30) {
			Static330.method5435();
		} else if (Static245.anInt6561 == 40) {
			Static71.method1076();
			if (Static243.anInt6755 != -3) {
				if (Static243.anInt6755 == 15) {
					Static253.method4419();
				} else if (Static243.anInt6755 != 2) {
					Static25.method5367();
				}
			}
		}
		Static131.method2020(Static107.aClass129_4);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method644() {
		if (Static285.aClass172_3.anInt5413 > Static96.anInt1756) {
			Static63.anInt1162 = (Static285.aClass172_3.anInt5413 * 50 - 50) * 5;
			if (Static201.anInt6769 == Static11.anInt233) {
				Static11.anInt233 = Static156.anInt2981;
			} else {
				Static11.anInt233 = Static201.anInt6769;
			}
			if (Static63.anInt1162 > 3000) {
				Static63.anInt1162 = 3000;
			}
			if (Static285.aClass172_3.anInt5413 >= 2 && Static285.aClass172_3.anInt5414 == 6) {
				this.method622("js5connect_outofdate");
				Static245.anInt6561 = 1000;
				return;
			}
			if (Static285.aClass172_3.anInt5413 >= 4 && Static285.aClass172_3.anInt5414 == -1) {
				this.method622("js5crc");
				Static245.anInt6561 = 1000;
				return;
			}
			if (Static285.aClass172_3.anInt5413 >= 4 && (Static245.anInt6561 == 0 || Static245.anInt6561 == 5)) {
				if (Static285.aClass172_3.anInt5414 == 7 || Static285.aClass172_3.anInt5414 == 9) {
					this.method622("js5connect_full");
				} else if (Static285.aClass172_3.anInt5414 <= 0) {
					this.method622("js5io");
				} else {
					this.method622("js5connect");
				}
				Static245.anInt6561 = 1000;
				return;
			}
		}
		Static96.anInt1756 = Static285.aClass172_3.anInt5413;
		if (Static63.anInt1162 > 0) {
			Static63.anInt1162--;
			return;
		}
		try {
			if (Static2.anInt13 == 0) {
				Static43.aClass2_2 = Static77.aClass118_7.method2708(Static11.anInt233, Static342.aString65);
				Static2.anInt13++;
			}
			if (Static2.anInt13 == 1) {
				if (Static43.aClass2_2.anInt6 == 2) {
					this.method630(1000);
					return;
				}
				if (Static43.aClass2_2.anInt6 == 1) {
					Static2.anInt13++;
				}
			}
			if (Static2.anInt13 == 2) {
				Static243.aClass156_126 = new Class156((Socket) Static43.aClass2_2.anObject1, Static77.aClass118_7);
				@Pc(169) Class11_Sub25 local169 = new Class11_Sub25(5);
				local169.method5186(15);
				local169.method5168(567);
				Static243.aClass156_126.method4183(local169.aByteArray93, 5);
				Static2.anInt13++;
				Static294.aLong177 = Static268.method4627();
			}
			if (Static2.anInt13 == 3) {
				if (Static245.anInt6561 == 0 || Static245.anInt6561 == 5 || Static243.aClass156_126.method4193() > 0) {
					@Pc(223) int local223 = Static243.aClass156_126.method4187();
					if (local223 != 0) {
						this.method630(local223);
						return;
					}
					Static2.anInt13++;
				} else if (Static268.method4627() - Static294.aLong177 > 30000L) {
					this.method630(1001);
					return;
				}
			}
			if (Static2.anInt13 == 4) {
				@Pc(272) boolean local272 = Static245.anInt6561 == 5 || Static245.anInt6561 == 10 || Static245.anInt6561 == 28;
				Static285.aClass172_3.method4580(!local272, Static243.aClass156_126);
				Static243.aClass156_126 = null;
				Static2.anInt13 = 0;
				Static43.aClass2_2 = null;
			}
		} catch (@Pc(289) IOException local289) {
			this.method630(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method619()) {
			return;
		}
		Static233.anInt4718 = Integer.parseInt(this.getParameter("worldid"));
		Static278.anInt6305 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static278.anInt6305 < 0 || Static278.anInt6305 > 1) {
			Static278.anInt6305 = 0;
		}
		Static156.anInt2987 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static156.anInt2987 < 0 || Static156.anInt2987 > 2) {
			Static156.anInt2987 = 0;
		}
		try {
			Static230.anInt4634 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(51) Exception local51) {
			Static230.anInt4634 = 0;
		}
		@Pc(57) String local57 = this.getParameter("objecttag");
		if (local57 != null && local57.equals("1")) {
			Static54.aBoolean64 = true;
		} else {
			Static54.aBoolean64 = false;
		}
		@Pc(73) String local73 = this.getParameter("js");
		if (local73 != null && local73.equals("1")) {
			Static67.aBoolean77 = true;
		} else {
			Static67.aBoolean77 = false;
		}
		@Pc(89) String local89 = this.getParameter("game");
		if (local89 != null && local89.equals("1")) {
			Static68.anInt1264 = 1;
		} else {
			Static68.anInt1264 = 0;
		}
		try {
			Static96.anInt1755 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(108) Exception local108) {
			Static96.anInt1755 = 0;
		}
		Static258.aString52 = this.getParameter("quiturl");
		Static239.aString46 = this.getParameter("settings");
		if (Static239.aString46 == null) {
			Static239.aString46 = "";
		}
		@Pc(126) String local126 = this.getParameter("country");
		if (local126 != null) {
			try {
				Static212.anInt4349 = Integer.parseInt(local126);
			} catch (@Pc(133) Exception local133) {
				Static212.anInt4349 = 0;
			}
		}
		Static186.anInt3765 = Integer.parseInt(this.getParameter("colourid"));
		if (Static186.anInt3765 < 0 || Static224.aColorArray5.length <= Static186.anInt3765) {
			Static186.anInt3765 = 0;
		}
		Static210.aClient1 = this;
		this.method623(Static156.anInt2987 + 32);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method647() {
		Static244.anInt4932++;
		Static19.method1624(-1, null, -1);
		Static88.method1285(-1, -1, null);
		Static336.method5483();
		Static301.anInt5969++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class67_Sub3_Sub3_Sub1 local33 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass82_1.aByte13;
				if ((local39 & 0x1) != 0) {
					@Pc(47) int local47 = local33.method4368();
					@Pc(68) int local68;
					if ((local39 & 0x2) != 0 && local33.anInt5074 == 0 && Math.random() * 1000.0D < 10.0D) {
						local68 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(76) int local76 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local68 != 0 || local76 != 0) {
							@Pc(93) int local93 = local68 + local33.anIntArray391[0];
							@Pc(100) int local100 = local76 + local33.anIntArray392[0];
							if (local93 < 0) {
								local93 = 0;
							} else if (local93 > Static24.anInt454 - local47 - 1) {
								local93 = Static24.anInt454 - local47 - 1;
							}
							if (local100 < 0) {
								local100 = 0;
							} else if (local100 > Static240.anInt4832 - local47 - 1) {
								local100 = Static240.anInt4832 - local47 - 1;
							}
							@Pc(170) int local170 = Static215.method3876(true, Static270.anIntArray417, local47, Static41.anIntArray59, -1, local33.anIntArray391[0], 0, local47, local33.anIntArray392[0], local100, local47, 0, local93, Static211.aClass92Array1[local33.aByte73]);
							if (local170 > 0) {
								if (local170 > 9) {
									local170 = 9;
								}
								for (@Pc(181) int local181 = 0; local181 < local170; local181++) {
									local33.anIntArray391[local181] = Static41.anIntArray59[local170 - local181 - 1];
									local33.anIntArray392[local181] = Static270.anIntArray417[local170 - local181 - 1];
									local33.aByteArray87[local181] = 1;
								}
								local33.anInt5074 = local170;
							}
						}
					}
					Static278.method5402(true, local33);
					local68 = Static59.method898(local33);
					Static330.method5436(Static191.anInt6243, local33, Static166.anInt3311, local68);
					Static348.method5638(local33);
				}
			}
		}
		if (Static262.anInt5359 == 0 && Static136.anInt6476 == 0) {
			if (Static81.anInt1498 == 2) {
				Static332.method5450();
			} else {
				Static193.method3528();
			}
			if (Static190.anInt3870 >> 7 < 14 || Static190.anInt3870 >> 7 >= Static24.anInt454 - 14 || Static316.anInt6169 >> 7 < 14 || Static316.anInt6169 >> 7 >= Static240.anInt4832 - 14) {
				Static134.method2076();
			}
		}
		while (true) {
			@Pc(304) Class11_Sub13 local304;
			@Pc(309) Class137 local309;
			@Pc(322) Class137 local322;
			do {
				local304 = (Class11_Sub13) Static356.aClass16_54.method180();
				if (local304 == null) {
					while (true) {
						do {
							local304 = (Class11_Sub13) Static151.aClass16_25.method180();
							if (local304 == null) {
								while (true) {
									do {
										local304 = (Class11_Sub13) Static284.aClass16_43.method180();
										if (local304 == null) {
											if (Static45.aClass137_4 != null) {
												Static135.method2126();
											}
											if (Static293.anInt5807 % 1500 == 0) {
												Static227.method4035();
											}
											Static251.method4411();
											if (Static240.aBoolean321 && Static268.method4627() - 60000L > Static320.aLong189) {
												Static62.method919();
												return;
											}
											return;
										}
										local309 = local304.aClass137_5;
										if (local309.anInt4095 < 0) {
											break;
										}
										local322 = Static166.method2688(local309.anInt4124);
									} while (local322 == null || local322.aClass137Array2 == null || local309.anInt4095 >= local322.aClass137Array2.length || local309 != local322.aClass137Array2[local309.anInt4095]);
									Static93.method1353(local304);
								}
							}
							local309 = local304.aClass137_5;
							if (local309.anInt4095 < 0) {
								break;
							}
							local322 = Static166.method2688(local309.anInt4124);
						} while (local322 == null || local322.aClass137Array2 == null || local309.anInt4095 >= local322.aClass137Array2.length || local309 != local322.aClass137Array2[local309.anInt4095]);
						Static93.method1353(local304);
					}
				}
				local309 = local304.aClass137_5;
				if (local309.anInt4095 < 0) {
					break;
				}
				local322 = Static166.method2688(local309.anInt4124);
			} while (local322 == null || local322.aClass137Array2 == null || local309.anInt4095 >= local322.aClass137Array2.length || local322.aClass137Array2[local309.anInt4095] != local309);
			Static93.method1353(local304);
		}
	}
}
