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
				Static217.method3976("argument count");
			}
			Static236.anInt4638 = Integer.parseInt(arg0[0]);
			Static123.anInt2380 = 2;
			if (arg0[1].equals("live")) {
				Static50.anInt1155 = 0;
			} else if (arg0[1].equals("rc")) {
				Static50.anInt1155 = 1;
			} else if (arg0[1].equals("wip")) {
				Static50.anInt1155 = 2;
			} else {
				Static217.method3976("modewhat");
			}
			Static257.anInt5015 = Static156.method2952(arg0[2]);
			if (Static257.anInt5015 == -1) {
				if (arg0[2].equals("english")) {
					Static257.anInt5015 = 0;
				} else if (arg0[2].equals("german")) {
					Static257.anInt5015 = 1;
				} else {
					Static217.method3976("language");
				}
			}
			Static335.method5574(Static257.anInt5015);
			Static4.aBoolean16 = false;
			Static102.aBoolean180 = false;
			if (arg0[3].equals("game0")) {
				Static341.anInt2259 = 0;
			} else if (arg0[3].equals("game1")) {
				Static341.anInt2259 = 1;
			} else {
				Static217.method3976("game");
			}
			Static119.aString76 = "";
			Static61.anInt1330 = 0;
			Static327.anInt6272 = Static341.anInt2259;
			Static8.anInt216 = 0;
			@Pc(123) client local123 = new client();
			Static242.aClient1 = local123;
			local123.method1065(Static50.anInt1155 + 32, Static341.anInt2259 == 1 ? "stellardawn" : "runescape");
			Static232.aFrame3.setLocation(40, 40);
		} catch (@Pc(148) Exception local148) {
			Static152.method2899(null, local148);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method1075(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub7 local10 = new Class1_Sub7(arg0);
		while (true) {
			while (true) {
				@Pc(20) int local20 = local10.method3141();
				if (local20 == 0) {
					return;
				}
				if (local20 == 1) {
					@Pc(33) int[] local33 = Static268.anIntArray652 = new int[6];
					local33[0] = local10.method3115();
					local33[1] = local10.method3115();
					local33[2] = local10.method3115();
					local33[3] = local10.method3115();
					local33[4] = local10.method3115();
					local33[5] = local10.method3115();
				} else if (local20 == 4) {
					@Pc(82) int local82 = local10.method3141();
					Static350.anIntArray806 = new int[local82];
					for (@Pc(87) int local87 = 0; local87 < local82; local87++) {
						Static350.anIntArray806[local87] = local10.method3115();
						if (Static350.anIntArray806[local87] == 65535) {
							Static350.anIntArray806[local87] = -1;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1077() {
		if (!Static166.aBoolean296) {
			label222: while (true) {
				do {
					if (!Static245.method4340()) {
						break label222;
					}
				} while (Static316.aChar3 != 's' && Static316.aChar3 != 'S');
				Static166.aBoolean296 = true;
			}
		}
		@Pc(38) int local38;
		if (Static161.anInt3324 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(41) long local41 = Static349.method5647();
			if (Static70.aLong60 == 0L) {
				Static70.aLong60 = local41;
			}
			if (local38 > 16384 && local41 - Static70.aLong60 < 5000L) {
				if (local41 - Static236.aLong160 > 1000L) {
					System.gc();
					Static236.aLong160 = local41;
				}
				Static220.anInt4304 = 5;
				Static211.aString172 = Static75.aString59;
			} else {
				Static211.aString172 = Static74.aString131;
				Static161.anInt3324 = 10;
				Static220.anInt4304 = 5;
			}
			return;
		}
		@Pc(91) int local91;
		if (Static161.anInt3324 == 10) {
			for (local91 = 0; local91 < 4; local91++) {
				Static24.aClass91Array1[local91] = Static249.method4440(Static48.anInt1107, Static337.anInt6402);
			}
			Static211.aString172 = Static88.aString70;
			Static220.anInt4304 = 10;
			Static161.anInt3324 = 20;
		} else if (Static161.anInt3324 == 20) {
			if (Static144.aClass115_1 == null) {
				Static144.aClass115_1 = new Class115(Static253.aClass205_3, Static86.aClass135_2);
			}
			if (Static144.aClass115_1.method3450()) {
				Static316.aClass165_95 = Static30.method855(false, 0, true);
				Static334.aClass165_102 = Static30.method855(false, 1, true);
				Static324.aClass165_98 = Static30.method855(false, 2, true);
				Static82.aClass165_26 = Static30.method855(false, 3, true);
				Static301.aClass165_92 = Static30.method855(false, 4, true);
				Static316.aClass165_94 = Static30.method855(true, 5, true);
				Static242.aClass165_74 = Static30.method855(true, 6, false);
				Static28.aClass165_10 = Static30.method855(false, 7, true);
				Static297.aClass165_88 = Static30.method855(false, 8, true);
				Static348.aClass165_57 = Static30.method855(false, 9, true);
				Static328.aClass165_100 = Static30.method855(false, 10, true);
				Static334.aClass165_103 = Static30.method855(false, 11, true);
				Static274.aClass165_82 = Static30.method855(false, 12, true);
				Static236.aClass165_72 = Static30.method855(false, 13, true);
				Static128.aClass165_47 = Static30.method855(false, 14, false);
				Static138.aClass165_49 = Static30.method855(false, 15, true);
				Static68.aClass165_24 = Static30.method855(false, 16, true);
				Static285.aClass165_85 = Static30.method855(false, 17, true);
				Static57.aClass165_22 = Static30.method855(false, 18, true);
				Static240.aClass165_73 = Static30.method855(false, 19, true);
				Static194.aClass165_61 = Static30.method855(false, 20, true);
				Static34.aClass165_13 = Static30.method855(false, 21, true);
				Static340.aClass165_60 = Static30.method855(false, 22, true);
				Static119.aClass165_41 = Static30.method855(true, 23, true);
				Static221.aClass165_69 = Static30.method855(false, 24, true);
				Static117.aClass165_45 = Static30.method855(false, 25, true);
				Static129.aClass165_48 = Static30.method855(true, 26, true);
				Static145.aClass165_51 = Static30.method855(false, 27, true);
				Static206.aClass165_64 = Static30.method855(true, 28, true);
				Static211.aString172 = Static351.aString258;
				Static220.anInt4304 = 15;
				Static161.anInt3324 = 30;
			} else {
				Static211.aString172 = Static84.aString64;
				Static220.anInt4304 = 12;
			}
		} else if (Static161.anInt3324 == 30) {
			local91 = 0;
			for (local38 = 0; local38 < 29; local38++) {
				local91 += Static111.aClass56_Sub1Array1[local38].method1651() * Static120.anIntArray287[local38] / 100;
			}
			if (local91 == 100) {
				Static220.anInt4304 = 20;
				Static211.aString172 = Static283.aString221;
				Static228.method4135(Static297.aClass165_88);
				Static277.method5442(Static297.aClass165_88);
				Static161.anInt3324 = 40;
			} else {
				Static220.anInt4304 = 20;
				if (local91 != 0) {
					Static211.aString172 = Static54.aString138 + local91 + "%";
				}
			}
		} else if (Static161.anInt3324 == 40) {
			if (Static206.aClass165_64.method4491()) {
				this.method1075(Static206.aClass165_64.method4492(1));
				Static220.anInt4304 = 25;
				Static161.anInt3324 = 50;
				Static211.aString172 = Static274.aString215;
			} else {
				Static211.aString172 = Static191.aString124 + Static206.aClass165_64.method4484() + "%";
				Static220.anInt4304 = 25;
			}
		} else if (Static161.anInt3324 == 50) {
			Static32.method869(Static337.aBoolean564);
			Static299.aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1();
			Static299.aClass1_Sub6_Sub1_3.method568();
			Static210.aClass174_2 = Static123.method2196(22050, 0, Static180.aClass110_6, Static261.aCanvas4);
			Static210.aClass174_2.method5521(Static299.aClass1_Sub6_Sub1_3);
			Static19.method440(Static128.aClass165_47, Static299.aClass1_Sub6_Sub1_3, Static301.aClass165_92, Static138.aClass165_49);
			Static108.aClass174_1 = Static123.method2196(2048, 1, Static180.aClass110_6, Static261.aCanvas4);
			Static170.aClass1_Sub6_Sub4_2 = new Class1_Sub6_Sub4();
			Static108.aClass174_1.method5521(Static170.aClass1_Sub6_Sub4_2);
			Static49.aClass213_1 = new Class213(22050, Static184.anInt3834);
			Static183.anInt3794 = Static242.aClass165_74.method4502("scape main");
			Static220.anInt4304 = 30;
			Static211.aString172 = Static194.aString159;
			Static161.anInt3324 = 60;
		} else if (Static161.anInt3324 == 60) {
			local91 = Static10.method291(Static297.aClass165_88, Static236.aClass165_72);
			local38 = Static234.method4207();
			if (local38 > local91) {
				Static211.aString172 = Static106.aString83 + local91 * 100 / local38 + "%";
				Static220.anInt4304 = 35;
			} else {
				Static220.anInt4304 = 35;
				Static211.aString172 = Static101.aString80;
				Static161.anInt3324 = 70;
			}
		} else if (Static161.anInt3324 == 70) {
			local91 = Static234.method4211(Static297.aClass165_88);
			local38 = Static72.method1425();
			if (local91 < local38) {
				Static211.aString172 = Static103.aString81 + local91 * 100 / local38 + "%";
				Static220.anInt4304 = 40;
			} else {
				Static211.aString172 = Static185.aString32;
				Static220.anInt4304 = 40;
				Static161.anInt3324 = 80;
			}
		} else if (Static161.anInt3324 == 80) {
			if (Static129.aClass165_48.method4491()) {
				Static62.anInterface7_1 = new Class102(Static129.aClass165_48, Static348.aClass165_57, Static297.aClass165_88);
				Static211.aString172 = Static270.aString212;
				Static161.anInt3324 = 90;
				Static220.anInt4304 = 45;
			} else {
				Static211.aString172 = Static63.aString54 + Static129.aClass165_48.method4484() + "%";
				Static220.anInt4304 = 45;
			}
		} else if (Static161.anInt3324 == 90) {
			Static161.anInt3324 = 95;
			Static211.aString172 = Static49.aString38;
			Static220.anInt4304 = 50;
		} else if (Static161.anInt3324 == 95) {
			if (Static166.aBoolean296) {
				Static75.anInt1518 = 0;
				Static158.anInt3151 = 0;
				Static142.anInt3154 = 1;
				Static123.anInt2389 = 0;
				Static335.anInt6377 = 0;
			}
			Static166.aBoolean296 = true;
			Static114.method2086(Static180.aClass110_6);
			Static275.method4781();
			Static142.method2986(false, Static335.anInt6377);
			Static161.anInt3324 = 100;
			Static220.anInt4304 = 55;
			Static211.aString172 = Static54.aString137;
		} else if (Static161.anInt3324 == 100) {
			Static214.method3953(Static297.aClass165_88, Static236.aClass165_72, Static34.aClass2_6);
			Static220.anInt4304 = 60;
			Static211.aString172 = Static140.aString109;
			Static72.method1427(5);
			Static161.anInt3324 = 110;
		} else if (Static161.anInt3324 == 110) {
			Static324.aClass165_98.method4491();
			local91 = Static324.aClass165_98.method4484();
			Static68.aClass165_24.method4491();
			local91 += Static68.aClass165_24.method4484();
			Static285.aClass165_85.method4491();
			local91 += Static285.aClass165_85.method4484();
			Static57.aClass165_22.method4491();
			local91 += Static57.aClass165_22.method4484();
			Static240.aClass165_73.method4491();
			local91 += Static240.aClass165_73.method4484();
			Static194.aClass165_61.method4491();
			local91 += Static194.aClass165_61.method4484();
			Static34.aClass165_13.method4491();
			local91 += Static34.aClass165_13.method4484();
			Static340.aClass165_60.method4491();
			local91 += Static340.aClass165_60.method4484();
			Static221.aClass165_69.method4491();
			local91 += Static221.aClass165_69.method4484();
			Static117.aClass165_45.method4491();
			local91 += Static117.aClass165_45.method4484();
			Static145.aClass165_51.method4491();
			local91 += Static145.aClass165_51.method4484();
			if (local91 < 1100) {
				Static220.anInt4304 = 65;
				Static211.aString172 = Static19.aString12 + local91 / 11 + "%";
			} else {
				Static181.method3548(Static324.aClass165_98);
				Static105.method1976(Static324.aClass165_98);
				Static291.method4960(Static324.aClass165_98);
				Static143.method2716(Static324.aClass165_98, Static28.aClass165_10);
				Static202.method3771(Static68.aClass165_24, Static28.aClass165_10);
				Static299.method5094(Static28.aClass165_10, Static57.aClass165_22);
				Static28.method825(Static240.aClass165_73, Static28.aClass165_10);
				Static317.method5335(Static324.aClass165_98);
				Static92.method1720(Static316.aClass165_95, Static194.aClass165_61, Static334.aClass165_102);
				Static67.method1691(Static324.aClass165_98);
				Static300.method5113(Static34.aClass165_13, Static28.aClass165_10);
				Static144.method2739(Static340.aClass165_60);
				Static315.method5320(Static324.aClass165_98);
				Static166.method3219(Static28.aClass165_10, Static82.aClass165_26, Static297.aClass165_88, Static236.aClass165_72);
				Static241.method4292(Static324.aClass165_98);
				Static159.method2989(Static285.aClass165_85);
				Static157.method2973(new Class104(), Static221.aClass165_69, Static117.aClass165_45);
				Static194.method3675(Static221.aClass165_69, Static117.aClass165_45);
				Static193.method3670(Static324.aClass165_98);
				Static94.method1748(Static324.aClass165_98);
				Static337.method5603(Static324.aClass165_98);
				Static270.method4716(Static297.aClass165_88, Static324.aClass165_98);
				Static151.method3584(Static324.aClass165_98, Static297.aClass165_88);
				Static23.method588(Static324.aClass165_98);
				Static2.method3290(Static324.aClass165_98, Static297.aClass165_88);
				Static201.method3756(Static324.aClass165_98);
				Static90.method1715(Static324.aClass165_98);
				Static211.aString172 = Static214.aString176;
				Static220.anInt4304 = 65;
				Static24.method734();
				Static161.anInt3324 = 120;
			}
		} else if (Static161.anInt3324 == 120) {
			local91 = Static283.method4876(Static297.aClass165_88);
			local38 = Static282.method4868();
			if (local38 > local91) {
				Static211.aString172 = Static89.aString71 + local91 * 100 / local38 + "%";
				Static220.anInt4304 = 70;
			} else {
				Static108.method2024(Static34.aClass2_6, Static297.aClass165_88);
				Static201.method3757(Static233.aClass90Array12);
				Static211.aString172 = Static160.aString125;
				Static161.anInt3324 = 130;
				Static220.anInt4304 = 70;
			}
		} else if (Static161.anInt3324 == 130) {
			Static29.aClass189_1 = new Class189();
			Static180.aClass110_6.method3379(10, Static29.aClass189_1);
			Static220.anInt4304 = 75;
			Static211.aString172 = Static140.aString108;
			Static161.anInt3324 = 140;
		} else if (Static161.anInt3324 == 140) {
			if (Static328.aClass165_100.method4477("", "huffman")) {
				@Pc(1074) Class147 local1074 = new Class147(Static328.aClass165_100.method4480("huffman", ""));
				Static13.method321(local1074);
				Static161.anInt3324 = 150;
				Static211.aString172 = Static24.aString20;
				Static220.anInt4304 = 80;
			} else {
				Static211.aString172 = Static240.aString185 + "0%";
				Static220.anInt4304 = 80;
			}
		} else if (Static161.anInt3324 == 150) {
			if (!Static82.aClass165_26.method4491()) {
				Static211.aString172 = Static290.aString224 + Static82.aClass165_26.method4484() * 3 / 4 + "%";
				Static220.anInt4304 = 85;
			} else if (!Static274.aClass165_82.method4491()) {
				Static211.aString172 = Static290.aString224 + (Static274.aClass165_82.method4484() / 10 + 75) + "%";
				Static220.anInt4304 = 85;
			} else if (!Static236.aClass165_72.method4491()) {
				Static211.aString172 = Static290.aString224 + (Static236.aClass165_72.method4484() / 20 + 85) + "%";
				Static220.anInt4304 = 85;
			} else if (Static119.aClass165_41.method4494("details")) {
				Static342.method1966(Static119.aClass165_41);
				Static140.method2698(Static145.aClass165_51);
				Static290.method4944(Static62.anInterface7_1, Static28.aClass165_10);
				Static211.aString172 = Static151.aString156;
				Static161.anInt3324 = 160;
				Static220.anInt4304 = 85;
			} else {
				Static211.aString172 = Static290.aString224 + (Static119.aClass165_41.method4501("details") / 10 + 90) + "%";
				Static220.anInt4304 = 85;
			}
		} else if (Static161.anInt3324 == 160) {
			local91 = Static292.method5013();
			if (local91 == -1) {
				Static220.anInt4304 = 90;
				Static211.aString172 = Static122.aString98;
			} else if (local91 == 7 || local91 == 9) {
				this.method1064("worldlistfull");
				Static72.method1427(1000);
			} else if (Static293.aBoolean499) {
				Static220.anInt4304 = 90;
				Static211.aString172 = Static41.aString27;
				Static161.anInt3324 = 170;
			} else {
				this.method1064("worldlistio_" + local91);
				Static72.method1427(1000);
			}
		} else if (Static161.anInt3324 == 170) {
			Static302.anIntArray607 = new int[Static45.anInt991];
			Static290.aStringArray39 = new String[Static145.anInt2849];
			Static162.aBooleanArray13 = new boolean[Static45.anInt991];
			for (local91 = 0; local91 < Static45.anInt991; local91++) {
				if (Static205.method3812(local91).anInt1413 == 0) {
					Static162.aBooleanArray13[local91] = true;
					Static177.anInt3675++;
				}
				Static302.anIntArray607[local91] = -1;
			}
			Static334.method5573();
			Static317.anInt6091 = Static82.aClass165_26.method4502("loginscreen");
			Static316.aClass165_94.method4490(false);
			Static242.aClass165_74.method4490(true);
			Static297.aClass165_88.method4490(true);
			Static236.aClass165_72.method4490(true);
			Static328.aClass165_100.method4490(true);
			Static82.aClass165_26.method4490(true);
			Static241.aBoolean395 = true;
			Static324.aClass165_98.anInt4890 = 2;
			Static285.aClass165_85.anInt4890 = 2;
			Static68.aClass165_24.anInt4890 = 2;
			Static57.aClass165_22.anInt4890 = 2;
			Static240.aClass165_73.anInt4890 = 2;
			Static194.aClass165_61.anInt4890 = 2;
			Static34.aClass165_13.anInt4890 = 2;
			Static294.method5056(-1, false, Static142.anInt3154, -1);
			Static161.anInt3324 = 180;
			Static211.aString172 = Static77.aString61;
			Static220.anInt4304 = 95;
		} else if (Static161.anInt3324 == 180) {
			Static211.method3873(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1061() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1069()) {
			return;
		}
		Static236.anInt4638 = Integer.parseInt(this.getParameter("worldid"));
		Static123.anInt2380 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static123.anInt2380 < 0 || Static123.anInt2380 > 1) {
			Static123.anInt2380 = 0;
		}
		Static50.anInt1155 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static50.anInt1155 < 0 || Static50.anInt1155 > 2) {
			Static50.anInt1155 = 0;
		}
		try {
			Static257.anInt5015 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(51) Exception local51) {
			Static257.anInt5015 = 0;
		}
		Static335.method5574(Static257.anInt5015);
		@Pc(60) String local60 = this.getParameter("objecttag");
		if (local60 != null && local60.equals("1")) {
			Static102.aBoolean180 = true;
		} else {
			Static102.aBoolean180 = false;
		}
		@Pc(76) String local76 = this.getParameter("js");
		if (local76 != null && local76.equals("1")) {
			Static4.aBoolean16 = true;
		} else {
			Static4.aBoolean16 = false;
		}
		@Pc(92) String local92 = this.getParameter("game");
		if (local92 != null && local92.equals("1")) {
			Static341.anInt2259 = 1;
		} else {
			Static341.anInt2259 = 0;
		}
		try {
			Static61.anInt1330 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(111) Exception local111) {
			Static61.anInt1330 = 0;
		}
		Static3.aString3 = this.getParameter("quiturl");
		Static119.aString76 = this.getParameter("settings");
		if (Static119.aString76 == null) {
			Static119.aString76 = "";
		}
		@Pc(129) String local129 = this.getParameter("country");
		if (local129 != null) {
			try {
				Static8.anInt216 = Integer.parseInt(local129);
			} catch (@Pc(136) Exception local136) {
				Static8.anInt216 = 0;
			}
		}
		Static327.anInt6272 = Integer.parseInt(this.getParameter("colourid"));
		if (Static327.anInt6272 < 0 || Static327.anInt6272 >= Static267.aColorArray12.length) {
			Static327.anInt6272 = 0;
		}
		Static242.aClient1 = this;
		this.method1072(Static50.anInt1155 + 32);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1079() {
		if (Static236.anInt4639 < Static253.aClass205_3.anInt6111) {
			if (Static298.anInt5962 == Static211.anInt4206) {
				Static298.anInt5962 = Static2.anInt3510;
			} else {
				Static298.anInt5962 = Static211.anInt4206;
			}
			Static186.anInt3865 = (Static253.aClass205_3.anInt6111 - 1) * 50 * 5;
			if (Static186.anInt3865 > 3000) {
				Static186.anInt3865 = 3000;
			}
			if (Static253.aClass205_3.anInt6111 >= 2 && Static253.aClass205_3.anInt6110 == 6) {
				this.method1064("js5connect_outofdate");
				Static239.anInt4649 = 1000;
				return;
			}
			if (Static253.aClass205_3.anInt6111 >= 4 && Static253.aClass205_3.anInt6110 == -1) {
				this.method1064("js5crc");
				Static239.anInt4649 = 1000;
				return;
			}
			if (Static253.aClass205_3.anInt6111 >= 4 && (Static239.anInt4649 == 0 || Static239.anInt4649 == 5)) {
				if (Static253.aClass205_3.anInt6110 == 7 || Static253.aClass205_3.anInt6110 == 9) {
					this.method1064("js5connect_full");
				} else if (Static253.aClass205_3.anInt6110 > 0) {
					this.method1064("js5connect");
				} else {
					this.method1064("js5io");
				}
				Static239.anInt4649 = 1000;
				return;
			}
		}
		Static236.anInt4639 = Static253.aClass205_3.anInt6111;
		if (Static186.anInt3865 > 0) {
			Static186.anInt3865--;
			return;
		}
		try {
			if (Static234.anInt4602 == 0) {
				Static202.aClass134_6 = Static180.aClass110_6.method3357(Static91.aString73, Static298.anInt5962);
				Static234.anInt4602++;
			}
			if (Static234.anInt4602 == 1) {
				if (Static202.aClass134_6.anInt4033 == 2) {
					this.method1087(1000);
					return;
				}
				if (Static202.aClass134_6.anInt4033 == 1) {
					Static234.anInt4602++;
				}
			}
			if (Static234.anInt4602 == 2) {
				Static72.aClass158_1 = new Class158((Socket) Static202.aClass134_6.anObject6, Static180.aClass110_6);
				@Pc(182) Class1_Sub7 local182 = new Class1_Sub7(5);
				local182.method3108(15);
				local182.method3098(563);
				Static72.aClass158_1.method4325(local182.aByteArray58, 5);
				Static234.anInt4602++;
				Static12.aLong14 = Static349.method5647();
			}
			if (Static234.anInt4602 == 3) {
				if (Static239.anInt4649 == 0 || Static239.anInt4649 == 5 || Static72.aClass158_1.method4326() > 0) {
					@Pc(231) int local231 = Static72.aClass158_1.method4337();
					if (local231 != 0) {
						this.method1087(local231);
						return;
					}
					Static234.anInt4602++;
				} else if (Static349.method5647() - Static12.aLong14 > 30000L) {
					this.method1087(1001);
					return;
				}
			}
			if (Static234.anInt4602 == 4) {
				@Pc(293) boolean local293 = Static239.anInt4649 == 5 || Static239.anInt4649 == 10 || Static239.anInt4649 == 28;
				Static253.aClass205_3.method5342(!local293, Static72.aClass158_1);
				Static234.anInt4602 = 0;
				Static202.aClass134_6 = null;
				Static72.aClass158_1 = null;
			}
		} catch (@Pc(310) IOException local310) {
			this.method1087(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1058() {
		if (Static131.aBoolean235) {
			Static44.method1007();
		}
		if (Static34.aClass2_6 != null) {
			Static34.aClass2_6.method3324();
		}
		if (Static292.aFrame2 != null) {
			Static282.method4874(Static180.aClass110_6, Static292.aFrame2);
			Static292.aFrame2 = null;
		}
		if (Static29.aClass189_1 != null) {
			Static29.aClass189_1.aBoolean487 = false;
		}
		Static29.aClass189_1 = null;
		if (Static153.aClass158_2 != null) {
			Static153.aClass158_2.method4339();
			Static153.aClass158_2 = null;
		}
		Static186.method3616(Static261.aCanvas4);
		Static68.method1387(Static261.aCanvas4);
		if (Static297.aClass153_1 != null) {
			Static297.aClass153_1.method5540(Static261.aCanvas4);
		}
		Static287.method4921();
		Static175.method3449();
		Static297.aClass153_1 = null;
		if (Static210.aClass174_2 != null) {
			Static210.aClass174_2.method5515();
		}
		if (Static108.aClass174_1 != null) {
			Static108.aClass174_1.method5515();
		}
		Static253.aClass205_3.method5345();
		Static86.aClass135_2.method3739();
		if (Static198.aClass216_1 != null) {
			Static198.aClass216_1.method5617();
			Static198.aClass216_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1086() {
		@Pc(12) boolean local12 = Static253.aClass205_3.method5343();
		if (!local12) {
			this.method1079();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1074() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static11.method4790();
		Static86.aClass135_2 = new Class135(Static180.aClass110_6);
		Static253.aClass205_3 = new Class205();
		if (Static50.anInt1155 != 0) {
			Static152.aByteArrayArray10 = new byte[50][];
		}
		Static347.method4025(Static180.aClass110_6);
		if (Static123.anInt2380 == 0) {
			Static148.aString201 = this.getCodeBase().getHost();
			Static102.anInt2099 = 443;
			Static223.anInt4433 = 43594;
		} else if (Static123.anInt2380 == 1) {
			Static148.aString201 = this.getCodeBase().getHost();
			Static102.anInt2099 = Static236.anInt4638 + 50000;
			Static223.anInt4433 = Static236.anInt4638 + 40000;
		} else if (Static123.anInt2380 == 2) {
			Static223.anInt4433 = Static236.anInt4638 + 40000;
			Static148.aString201 = "127.0.0.1";
			Static102.anInt2099 = Static236.anInt4638 + 50000;
		}
		Static91.aString73 = Static148.aString201;
		Static2.anInt3510 = Static102.anInt2099;
		Static194.anInt3960 = Static223.anInt4433;
		Static211.anInt4206 = Static223.anInt4433;
		Static298.anInt5962 = Static194.anInt3960;
		if (Static168.anInt3543 == 3) {
			Static232.anInt6331 = Static236.anInt4638;
		}
		if (Static341.anInt2259 == 1) {
			Static172.aShortArrayArray8 = Static267.aShortArrayArray7;
			Static314.aShortArray95 = Static154.aShortArray44;
			Static172.anInt5803 = 16777215;
			Static93.aBoolean161 = true;
			Static226.anInt4463 = 0;
			Static86.aShortArrayArray3 = Static334.aShortArrayArray9;
			Static204.aShortArray56 = Static249.aShortArray88;
		} else {
			Static172.aShortArrayArray8 = Static236.aShortArrayArray6;
			Static204.aShortArray56 = Static123.aShortArray43;
			Static86.aShortArrayArray3 = Static84.aShortArrayArray2;
			Static314.aShortArray95 = Static351.aShortArray113;
		}
		Static305.aShortArray94 = Static226.aShortArray68 = Static111.aShortArray42 = Static297.aShortArray93 = new short[256];
		Static219.method3984();
		Static197.method5561(Static261.aCanvas4);
		Static205.method3809(Static261.aCanvas4);
		Static297.aClass153_1 = Static162.method3079();
		if (Static297.aClass153_1 != null) {
			Static297.aClass153_1.method5541(Static261.aCanvas4);
		}
		Static271.anInt4832 = Static168.anInt3543;
		try {
			if (Static180.aClass110_6.aClass99_2 != null) {
				Static70.aClass69_1 = new Class69(Static180.aClass110_6.aClass99_2, 5200, 0);
				for (@Pc(168) int local168 = 0; local168 < 29; local168++) {
					Static143.aClass69Array1[local168] = new Class69(Static180.aClass110_6.aClass99Array1[local168], 6000, 0);
				}
				Static148.aClass69_4 = new Class69(Static180.aClass110_6.aClass99_3, 6000, 0);
				Static38.aClass173_6 = new Class173(255, Static70.aClass69_1, Static148.aClass69_4, 500000);
				Static346.aClass69_7 = new Class69(Static180.aClass110_6.aClass99_4, 24, 0);
				Static180.aClass110_6.aClass99_2 = null;
				Static180.aClass110_6.aClass99_3 = null;
				Static180.aClass110_6.aClass99Array1 = null;
				Static180.aClass110_6.aClass99_4 = null;
			}
		} catch (@Pc(224) IOException local224) {
			Static38.aClass173_6 = null;
			Static148.aClass69_4 = null;
			Static70.aClass69_1 = null;
			Static346.aClass69_7 = null;
		}
		if (Static123.anInt2380 != 0) {
			Static118.aBoolean403 = true;
		}
		if (Static341.anInt2259 == 0) {
			Static240.aString186 = Static313.aString242;
		} else if (Static341.anInt2259 == 1) {
			Static240.aString186 = Static107.aString85;
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1062() {
		if (Static239.anInt4649 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static196.method3693() / 1000000L - Static38.aLong127;
		Static38.aLong127 = Static196.method3693() / 1000000L;
		@Pc(31) boolean local31 = Static324.method5448();
		if (local31 && Static275.aBoolean463 && Static210.aClass174_2 != null) {
			Static210.aClass174_2.method5518();
		}
		if (Static239.anInt4649 == 30 || Static239.anInt4649 == 10) {
			if (Static215.aLong148 != 0L && Static215.aLong148 < Static349.method5647()) {
				Static294.method5056(Static176.anInt3649, false, Static295.method5063(), Static114.anInt2288);
			} else if (Static34.aClass2_6.method3274() && Static239.aBoolean390) {
				Static311.method5241();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static292.aFrame2 == null) {
			@Pc(83) Container local83;
			if (Static232.aFrame3 == null) {
				local83 = Static180.aClass110_6.anApplet1;
			} else {
				local83 = Static232.aFrame3;
			}
			local92 = local83.getSize().width;
			local96 = local83.getSize().height;
			if (local83 == Static232.aFrame3) {
				@Pc(102) Insets local102 = Static232.aFrame3.getInsets();
				local92 -= local102.left + local102.right;
				local96 -= local102.bottom + local102.top;
			}
			if (local92 != Static328.anInt6274 || local96 != Static262.anInt5078) {
				if (Static34.aClass2_6 == null || Static34.aClass2_6.method3255()) {
					Static11.method4790();
				} else {
					Static328.anInt6274 = local92;
					Static262.anInt5078 = local96;
				}
				Static215.aLong148 = Static349.method5647() + 500L;
			}
		}
		if (Static292.aFrame2 != null && !Static20.aBoolean41 && (Static239.anInt4649 == 30 || Static239.anInt4649 == 10)) {
			Static294.method5056(-1, false, Static142.anInt3154, -1);
		}
		@Pc(165) boolean local165 = false;
		if (Static181.aBoolean317) {
			Static181.aBoolean317 = false;
			local165 = true;
		}
		if (local165) {
			Static99.method1804();
		}
		if (Static34.aClass2_6 != null && Static34.aClass2_6.method3237() || Static295.method5063() != 1) {
			Static228.method4134();
		}
		if (Static239.anInt4649 == 0) {
			Static314.method5304(Static220.anInt4304, local165, Static267.aColorArray12[Static327.anInt6272], Static277.aColorArray13[Static327.anInt6272], Static211.aString172, Static91.aColorArray5[Static327.anInt6272]);
		} else if (Static239.anInt4649 == 5) {
			Static97.method1785(Static302.aClass13_7, Static34.aClass2_6, Static34.aClass2_6.method3237() | local165, Static267.aColorArray12[Static327.anInt6272].getRGB(), Static91.aColorArray5[Static327.anInt6272].getRGB(), Static277.aColorArray13[Static327.anInt6272].getRGB());
		} else if (Static239.anInt4649 == 10) {
			Static155.method2951();
		} else if (Static239.anInt4649 == 25 || Static239.anInt4649 == 28) {
			if (Static285.anInt5517 == 1) {
				if (Static185.anInt1069 > Static235.anInt4616) {
					Static235.anInt4616 = Static185.anInt1069;
				}
				local92 = (Static235.anInt4616 - Static185.anInt1069) * 50 / Static235.anInt4616;
				Static56.method1211(Static118.aString194 + "<br>(" + local92 + "%)", true, Static9.aClass13_1);
			} else if (Static285.anInt5517 == 2) {
				if (Static111.anInt2268 < Static108.anInt2195) {
					Static111.anInt2268 = Static108.anInt2195;
				}
				local92 = (Static111.anInt2268 - Static108.anInt2195) * 50 / Static111.anInt2268 + 50;
				Static56.method1211(Static118.aString194 + "<br>(" + local92 + "%)", true, Static9.aClass13_1);
			} else {
				Static56.method1211(Static118.aString194, true, Static9.aClass13_1);
			}
		} else if (Static239.anInt4649 == 30) {
			Static63.method1319(local16);
		} else if (Static239.anInt4649 == 40) {
			Static56.method1211(Static153.aString119 + "<br>" + Static339.aString255, true, Static9.aClass13_1);
		}
		if (Static142.anInt3156 == 3) {
			for (local92 = 0; local92 < Static118.anInt4791; local92++) {
				@Pc(369) Rectangle local369 = Class1_Sub2_Sub3.aRectangleArray1[local92];
				if (Static30.aBooleanArray4[local92]) {
					Static34.aClass2_6.method3277(local369.y, local369.height, local369.x, -1996553985, local369.width);
				} else if (Static253.aBooleanArray27[local92]) {
					Static34.aClass2_6.method3277(local369.y, local369.height, local369.x, -1996554240, local369.width);
				}
			}
		}
		if (Static108.method2021()) {
			Static163.method3160(Static34.aClass2_6);
		}
		if ((Static239.anInt4649 == 30 || Static239.anInt4649 == 10) && Static142.anInt3156 == 0 && Static295.method5063() == 1 && !local165 && Static168.aString142.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static118.anInt4791; local96++) {
				if (Static253.aBooleanArray27[local96]) {
					Static253.aBooleanArray27[local96] = false;
					Static70.aRectangleArray2[local92++] = Class1_Sub2_Sub3.aRectangleArray1[local96];
				}
			}
			Static34.aClass2_6.method3314(Static70.aRectangleArray2, local92);
		} else if (Static239.anInt4649 != 0) {
			Static34.aClass2_6.method3264();
			for (local92 = 0; local92 < Static118.anInt4791; local92++) {
				Static253.aBooleanArray27[local92] = false;
			}
		}
		if (Static241.aBoolean395) {
			Static251.method5682();
		}
		if (Static166.aBoolean296 && Static239.anInt4649 == 10 && Static100.anInt2086 != -1) {
			Static166.aBoolean296 = false;
			Static114.method2086(Static180.aClass110_6);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1087(@OriginalArg(0) int arg0) {
		Static234.anInt4602 = 0;
		Static253.aClass205_3.anInt6111++;
		Static202.aClass134_6 = null;
		Static253.aClass205_3.anInt6110 = arg0;
		Static72.aClass158_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method1088() {
		Static184.anInt3829 = 0;
		while (Static245.method4340() && Static184.anInt3829 < 128) {
			if (!Static186.method3618() || Static316.aChar3 != '`' && Static316.aChar3 != '§') {
				Static81.anIntArray185[Static184.anInt3829] = Static320.anInt6137;
				Static184.anIntArray454[Static184.anInt3829] = Static316.aChar3;
				Static184.anInt3829++;
			} else if (Static108.method2021()) {
				Static39.method960();
			} else {
				Static12.method314();
			}
		}
		if (Static108.method2021()) {
			Static334.method5572();
		}
		Static78.anInt1579++;
		Static81.method1557(-1, null, -1);
		Static99.method1807(-1, null, -1);
		Static42.method1002();
		Static119.anInt2038++;
		for (@Pc(84) int local84 = 0; local84 < 32768; local84++) {
			@Pc(90) Class5_Sub3_Sub3_Sub2 local90 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local84];
			if (local90 != null) {
				@Pc(96) byte local96 = local90.aClass122_1.aByte36;
				if ((local96 & 0x1) != 0) {
					@Pc(107) int local107 = local90.method4541();
					@Pc(131) int local131;
					if ((local96 & 0x2) != 0 && local90.anInt4985 == 0 && Math.random() * 1000.0D < 10.0D) {
						local131 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(139) int local139 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local131 != 0 || local139 != 0) {
							@Pc(153) int local153 = local131 + local90.anIntArray638[0];
							@Pc(160) int local160 = local90.anIntArray637[0] + local139;
							if (local153 < 0) {
								local153 = 0;
							} else if (local153 > Static48.anInt1107 - local107 - 1) {
								local153 = Static48.anInt1107 - local107 - 1;
							}
							if (local160 < 0) {
								local160 = 0;
							} else if (local160 > Static337.anInt6402 - local107 - 1) {
								local160 = Static337.anInt6402 - local107 - 1;
							}
							@Pc(232) int local232 = Static61.method1285(Static314.anIntArray757, local153, Static24.aClass91Array1[local90.aByte53], -1, 0, true, local107, Static92.anIntArray223, local107, local160, 0, local107, local90.anIntArray638[0], local90.anIntArray637[0]);
							if (local232 > 0) {
								if (local232 > 9) {
									local232 = 9;
								}
								for (@Pc(244) int local244 = 0; local244 < local232; local244++) {
									local90.anIntArray638[local244] = Static92.anIntArray223[local232 - local244 - 1];
									local90.anIntArray637[local244] = Static314.anIntArray757[local232 - local244 - 1];
									local90.aByteArray82[local244] = 1;
								}
								local90.anInt4985 = local232;
							}
						}
					}
					Static87.method1672(local90, true);
					local131 = Static332.method5565(local90);
					Static306.method5161(Static145.anInt2839, local90, local131, Static55.anInt1237);
					Static155.method2946(local90);
				}
			}
		}
		if (Static24.anInt674 == 0 && Static76.anInt1538 == 0) {
			if (Static81.anInt1609 == 2) {
				Static181.method3549();
			} else {
				Static245.method4331();
			}
			if (Static221.anInt4363 >> 7 < 14 || Static221.anInt4363 >> 7 >= Static48.anInt1107 - 14 || Static164.anInt3425 >> 7 < 14 || Static337.anInt6402 - 14 <= Static164.anInt3425 >> 7) {
				Static227.method4128();
			}
		}
		while (true) {
			@Pc(366) Class1_Sub19 local366;
			@Pc(371) Class177 local371;
			@Pc(382) Class177 local382;
			do {
				local366 = (Class1_Sub19) Static17.aClass195_1.method5031();
				if (local366 == null) {
					while (true) {
						do {
							local366 = (Class1_Sub19) Static120.aClass195_21.method5031();
							if (local366 == null) {
								while (true) {
									do {
										local366 = (Class1_Sub19) Static138.aClass195_31.method5031();
										if (local366 == null) {
											if (Static317.aClass177_22 != null) {
												Static116.method2096();
											}
											if (Static215.anInt4246 % 1500 == 0) {
												Static192.method5708();
											}
											Static255.method4553();
											if (Static131.aBoolean235 && Static349.method5647() - 60000L > Static74.aLong117) {
												Static44.method1007();
												return;
											}
											return;
										}
										local371 = local366.aClass177_9;
										if (local371.anInt5239 < 0) {
											break;
										}
										local382 = Static140.method2694(local371.anInt5236);
									} while (local382 == null || local382.aClass177Array2 == null || local382.aClass177Array2.length <= local371.anInt5239 || local382.aClass177Array2[local371.anInt5239] != local371);
									Static98.method1797(local366);
								}
							}
							local371 = local366.aClass177_9;
							if (local371.anInt5239 < 0) {
								break;
							}
							local382 = Static140.method2694(local371.anInt5236);
						} while (local382 == null || local382.aClass177Array2 == null || local371.anInt5239 >= local382.aClass177Array2.length || local371 != local382.aClass177Array2[local371.anInt5239]);
						Static98.method1797(local366);
					}
				}
				local371 = local366.aClass177_9;
				if (local371.anInt5239 < 0) {
					break;
				}
				local382 = Static140.method2694(local371.anInt5236);
			} while (local382 == null || local382.aClass177Array2 == null || local382.aClass177Array2.length <= local371.anInt5239 || local382.aClass177Array2[local371.anInt5239] != local371);
			Static98.method1797(local366);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1066() {
		if (Static239.anInt4649 == 1000) {
			return;
		}
		Static215.anInt4246++;
		if (Static215.anInt4246 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static202.anInt4092 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static248.aRandom1.setSeed((long) Static202.anInt4092);
		}
		this.method1086();
		if (Static144.aClass115_1 != null) {
			Static144.aClass115_1.method3448();
		}
		Static331.method5554();
		Static278.method4804();
		Static1.method45();
		Static159.method2991();
		if (Static297.aClass153_1 != null) {
			@Pc(70) int local70 = Static297.aClass153_1.method5542();
			Static325.anInt4689 = local70;
		}
		if (Static34.aClass2_6 != null) {
			Static34.aClass2_6.method3241((int) Static349.method5647());
		}
		Static184.method3576();
		if (Static239.anInt4649 == 0) {
			this.method1077();
			Static72.method1432();
		} else if (Static239.anInt4649 == 5) {
			this.method1077();
			Static72.method1432();
		} else if (Static239.anInt4649 == 25 || Static239.anInt4649 == 28) {
			Static162.method3078();
		}
		if (Static239.anInt4649 == 10) {
			this.method1088();
			Static297.method5090();
			Static249.method4441();
			Static138.method2660();
		} else if (Static239.anInt4649 == 30) {
			Static123.method2198();
		} else if (Static239.anInt4649 == 40) {
			Static138.method2660();
			if (Static82.anInt1642 != -3) {
				if (Static82.anInt1642 == 15) {
					Static282.method4870();
				} else if (Static82.anInt1642 != 2) {
					Static55.method1208();
				}
			}
		}
		Static265.method4617(Static34.aClass2_6);
	}
}
