import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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
				Static230.method3687("argument count");
			}
			Static23.anInt488 = Integer.parseInt(arg0[0]);
			Static210.anInt4011 = 2;
			if (arg0[1].equals("live")) {
				Static106.anInt3751 = 0;
			} else if (arg0[1].equals("rc")) {
				Static106.anInt3751 = 1;
			} else if (arg0[1].equals("wip")) {
				Static106.anInt3751 = 2;
			} else {
				Static230.method3687("modewhat");
			}
			Static258.aBoolean463 = false;
			Static114.anInt2343 = Static225.method3630(arg0[2]);
			if (Static114.anInt2343 == -1) {
				if (arg0[2].equals("english")) {
					Static114.anInt2343 = 0;
				} else if (arg0[2].equals("german")) {
					Static114.anInt2343 = 1;
				} else {
					Static230.method3687("language");
				}
			}
			Static104.method1982(Static114.anInt2343);
			Static292.aBoolean498 = false;
			Static274.aBoolean479 = false;
			if (arg0[3].equals("game0")) {
				Static272.anInt5005 = 0;
			} else if (arg0[3].equals("game1")) {
				Static272.anInt5005 = 1;
			} else {
				Static230.method3687("game");
			}
			Static66.aBoolean134 = false;
			Static258.aString177 = "";
			Static18.anInt391 = 0;
			Static158.anInt3622 = 0;
			@Pc(133) client local133 = new client();
			Static222.aClient1 = local133;
			local133.method755(Static272.anInt5005 == 1 ? "mechscape" : "runescape", Static106.anInt3751 + 32);
			Static311.aFrame2.setLocation(40, 40);
		} catch (@Pc(160) Exception local160) {
			Static6.method4140(local160, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method769(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class1_Sub13 local6 = new Class1_Sub13(arg0);
		while (true) {
			@Pc(14) int local14 = local6.method1853();
			if (local14 == 0) {
				return;
			}
			if (local14 == 1) {
				@Pc(27) int[] local27 = Static69.anIntArray120 = new int[6];
				local27[0] = local6.method1879();
				local27[1] = local6.method1879();
				local27[2] = local6.method1879();
				local27[3] = local6.method1879();
				local27[4] = local6.method1879();
				local27[5] = local6.method1879();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method756()) {
			return;
		}
		Static23.anInt488 = Integer.parseInt(this.getParameter("worldid"));
		Static210.anInt4011 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static210.anInt4011 < 0 || Static210.anInt4011 > 1) {
			Static210.anInt4011 = 0;
		}
		Static106.anInt3751 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static106.anInt3751 < 0 || Static106.anInt3751 > 2) {
			Static106.anInt3751 = 0;
		}
		@Pc(46) String local46 = this.getParameter("advertsuppressed");
		if (local46 != null && local46.equals("1")) {
			Static258.aBoolean463 = true;
		} else {
			Static258.aBoolean463 = false;
		}
		try {
			Static114.anInt2343 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(65) Exception local65) {
			Static114.anInt2343 = 0;
		}
		Static104.method1982(Static114.anInt2343);
		@Pc(74) String local74 = this.getParameter("objecttag");
		if (local74 != null && local74.equals("1")) {
			Static292.aBoolean498 = true;
		} else {
			Static292.aBoolean498 = false;
		}
		@Pc(91) String local91 = this.getParameter("js");
		if (local91 != null && local91.equals("1")) {
			Static274.aBoolean479 = true;
		} else {
			Static274.aBoolean479 = false;
		}
		@Pc(108) String local108 = this.getParameter("game");
		if (local108 != null && local108.equals("1")) {
			Static272.anInt5005 = 1;
		} else {
			Static272.anInt5005 = 0;
		}
		try {
			Static158.anInt3622 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(128) Exception local128) {
			Static158.anInt3622 = 0;
		}
		Static258.aString177 = this.getParameter("settings");
		if (Static258.aString177 == null) {
			Static258.aString177 = "";
		}
		@Pc(143) String local143 = this.getParameter("country");
		if (local143 != null) {
			try {
				Static18.anInt391 = Integer.parseInt(local143);
			} catch (@Pc(151) Exception local151) {
				Static18.anInt391 = 0;
			}
		}
		@Pc(157) String local157 = this.getParameter("haveie6");
		if (local157 != null && local157.equals("1")) {
			Static66.aBoolean134 = true;
		} else {
			Static66.aBoolean134 = false;
		}
		Static222.aClient1 = this;
		this.method757(Static106.anInt3751 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method771() {
		if (!Static286.aBoolean489) {
			label257: while (true) {
				do {
					if (!Static115.method2107()) {
						break label257;
					}
				} while (Static264.aChar4 != 's' && Static264.aChar4 != 'S');
				Static286.aBoolean489 = true;
			}
		}
		@Pc(42) int local42;
		if (Static122.anInt2474 == 0) {
			@Pc(32) Runtime local32 = Runtime.getRuntime();
			local42 = (int) ((local32.totalMemory() - local32.freeMemory()) / 1024L);
			@Pc(45) long local45 = Static244.method3859();
			if (Static299.aLong205 == 0L) {
				Static299.aLong205 = local45;
			}
			if (local42 > 16384 && local45 - Static299.aLong205 < 5000L) {
				if (local45 - Static137.aLong96 > 1000L) {
					System.gc();
					Static137.aLong96 = local45;
				}
				Static193.anInt3756 = 5;
				Static284.aString200 = Static68.aString53;
			} else {
				Static284.aString200 = Static25.aString176;
				Static122.anInt2474 = 10;
				Static193.anInt3756 = 5;
			}
		} else if (Static122.anInt2474 == 10) {
			for (@Pc(99) int local99 = 0; local99 < 4; local99++) {
				Static122.aClass60Array1[local99] = new Class60(104, 104);
			}
			Static193.anInt3756 = 10;
			Static284.aString200 = Static35.aString27;
			Static122.anInt2474 = 30;
		} else if (Static122.anInt2474 == 30) {
			if (Static209.aClass147_1 == null) {
				Static209.aClass147_1 = new Class147(Static136.aClass164_1, Static6.aClass178_8);
			}
			if (Static209.aClass147_1.method3852()) {
				Static270.aClass119_84 = Static260.method4033(0, true, true, false);
				Static103.aClass119_39 = Static260.method4033(1, true, true, false);
				Static160.aClass119_60 = Static260.method4033(2, false, true, true);
				Static34.aClass119_13 = Static260.method4033(3, true, true, false);
				Static125.aClass119_46 = Static260.method4033(4, true, true, false);
				Static67.aClass119_20 = Static260.method4033(5, true, true, true);
				Static197.aClass119_68 = Static260.method4033(6, true, false, true);
				Static58.aClass119_18 = Static260.method4033(7, true, true, false);
				Static45.aClass119_15 = Static260.method4033(8, true, true, false);
				Static276.aClass119_86 = Static260.method4033(9, true, true, false);
				Static121.aClass119_45 = Static260.method4033(10, true, true, false);
				Static265.aClass119_83 = Static260.method4033(11, true, true, false);
				Static21.aClass119_6 = Static260.method4033(12, true, true, false);
				Static110.aClass119_42 = Static260.method4033(13, true, true, false);
				Static68.aClass119_21 = Static260.method4033(14, true, false, false);
				Static240.aClass119_77 = Static260.method4033(15, true, true, false);
				Static25.aClass119_80 = Static260.method4033(16, true, true, false);
				Static120.aClass119_44 = Static260.method4033(17, true, true, false);
				Static197.aClass119_69 = Static260.method4033(18, true, true, false);
				Static218.aClass119_74 = Static260.method4033(19, true, true, false);
				Static18.aClass119_5 = Static260.method4033(20, true, true, false);
				Static291.aClass119_89 = Static260.method4033(21, true, true, false);
				Static314.aClass119_96 = Static260.method4033(22, true, true, false);
				Static74.aClass119_28 = Static260.method4033(23, true, true, true);
				Static68.aClass119_22 = Static260.method4033(24, true, true, false);
				Static166.aClass119_61 = Static260.method4033(25, true, true, false);
				Static167.aClass119_11 = Static260.method4033(26, true, true, true);
				Static212.aClass119_73 = Static260.method4033(27, true, true, false);
				Static145.aClass119_53 = Static260.method4033(28, true, true, true);
				Static284.aString200 = Static198.aString129;
				Static193.anInt3756 = 15;
				Static122.anInt2474 = 40;
			} else {
				Static193.anInt3756 = 12;
				Static284.aString200 = Static236.aString157;
			}
		} else {
			@Pc(370) int local370;
			if (Static122.anInt2474 == 40) {
				local42 = 0;
				for (local370 = 0; local370 < 29; local370++) {
					local42 += Static129.aClass53_Sub1Array1[local370].method3994() * Static29.anIntArray62[local370] / 100;
				}
				if (local42 == 100) {
					Static284.aString200 = Static293.aString211;
					Static193.anInt3756 = 20;
					Static98.method1904(Static45.aClass119_15);
					Static219.method3543(Static45.aClass119_15);
					Static261.method4040(Static45.aClass119_15);
					Static122.anInt2474 = 41;
				} else {
					Static193.anInt3756 = 20;
					if (local42 != 0) {
						Static284.aString200 = Static101.aString73 + local42 + "%";
					}
				}
			} else if (Static122.anInt2474 == 41) {
				if (Static145.aClass119_53.method3222()) {
					this.method769(Static145.aClass119_53.method3244(1));
					Static284.aString200 = Static176.aString114;
					Static122.anInt2474 = 45;
					Static193.anInt3756 = 25;
				} else {
					Static284.aString200 = Static264.aString186 + Static145.aClass119_53.method3236() + "%";
					Static193.anInt3756 = 25;
				}
			} else if (Static122.anInt2474 == 45) {
				Static222.method3591(Static230.aBoolean388);
				Static84.aClass1_Sub7_Sub2_1 = new Class1_Sub7_Sub2();
				Static84.aClass1_Sub7_Sub2_1.method2763();
				Static129.aClass121_2 = Static58.method1032(0, 22050, Static222.aClass176_3, Static229.aCanvas2);
				Static129.aClass121_2.method3581(Static84.aClass1_Sub7_Sub2_1);
				Static88.method1729(Static125.aClass119_46, Static68.aClass119_21, Static84.aClass1_Sub7_Sub2_1, Static240.aClass119_77);
				Static13.aClass121_1 = Static58.method1032(1, 2048, Static222.aClass176_3, Static229.aCanvas2);
				Static173.aClass1_Sub7_Sub3_1 = new Class1_Sub7_Sub3();
				Static13.aClass121_1.method3581(Static173.aClass1_Sub7_Sub3_1);
				Static250.aClass55_1 = new Class55(22050, Static69.anInt1498);
				Static109.anInt2273 = Static197.aClass119_68.method3241("scape main");
				Static122.anInt2474 = 50;
				Static193.anInt3756 = 30;
				Static284.aString200 = Static115.aString81;
			} else if (Static122.anInt2474 == 50) {
				local42 = Static173.method2974(Static45.aClass119_15, Static110.aClass119_42);
				local370 = Static27.method502();
				if (local370 <= local42) {
					Static122.anInt2474 = 60;
					Static193.anInt3756 = 35;
					Static284.aString200 = Static266.aString188;
				} else {
					Static193.anInt3756 = 35;
					Static284.aString200 = Static201.aString135 + local42 * 100 / local370 + "%";
				}
			} else if (Static122.anInt2474 == 60) {
				local42 = Static106.method3315(Static45.aClass119_15);
				local370 = Static99.method1923();
				if (local370 > local42) {
					Static284.aString200 = Static174.aString220 + local42 * 100 / local370 + "%";
					Static193.anInt3756 = 40;
				} else {
					Static122.anInt2474 = 65;
					Static193.anInt3756 = 40;
					Static284.aString200 = Static117.aString82;
				}
			} else if (Static122.anInt2474 == 65) {
				Static295.method4419(Static110.aClass119_42, Static45.aClass119_15);
				Static193.anInt3756 = 45;
				Static284.aString200 = Static212.aString138;
				Static197.method3406(5);
				Static122.anInt2474 = 70;
			} else if (Static122.anInt2474 == 70) {
				Static160.aClass119_60.method3222();
				local42 = Static160.aClass119_60.method3236();
				Static25.aClass119_80.method3222();
				local42 += Static25.aClass119_80.method3236();
				Static120.aClass119_44.method3222();
				local42 += Static120.aClass119_44.method3236();
				Static197.aClass119_69.method3222();
				local42 += Static197.aClass119_69.method3236();
				Static218.aClass119_74.method3222();
				local42 += Static218.aClass119_74.method3236();
				Static18.aClass119_5.method3222();
				local42 += Static18.aClass119_5.method3236();
				Static291.aClass119_89.method3222();
				local42 += Static291.aClass119_89.method3236();
				Static314.aClass119_96.method3222();
				local42 += Static314.aClass119_96.method3236();
				Static68.aClass119_22.method3222();
				local42 += Static68.aClass119_22.method3236();
				Static166.aClass119_61.method3222();
				local42 += Static166.aClass119_61.method3236();
				Static212.aClass119_73.method3222();
				local42 += Static212.aClass119_73.method3236();
				if (local42 < 1100) {
					Static284.aString200 = Static128.aString87 + local42 / 11 + "%";
					Static193.anInt3756 = 50;
				} else {
					Static45.method874(Static160.aClass119_60);
					Static24.method475(Static160.aClass119_60);
					Static203.method2968(Static160.aClass119_60);
					Static189.method3221(Static160.aClass119_60, Static58.aClass119_18);
					Static10.method4569(Static58.aClass119_18, Static25.aClass119_80);
					Static49.method906(Static58.aClass119_18, Static197.aClass119_69);
					Static23.method470(Static58.aClass119_18, Static286.aClass1_Sub5_Sub9_Sub2_2, Static218.aClass119_74);
					Static186.method3152(Static160.aClass119_60);
					Static299.method4471(Static18.aClass119_5, Static270.aClass119_84, Static103.aClass119_39);
					Static167.method596(Static160.aClass119_60);
					Static159.method2718(Static58.aClass119_18, Static291.aClass119_89);
					Static221.method3569(Static314.aClass119_96);
					Static39.method678(Static160.aClass119_60);
					Static83.method1690(Static58.aClass119_18, Static34.aClass119_13, Static45.aClass119_15, Static110.aClass119_42);
					Static315.method4678(Static160.aClass119_60);
					Static6.method4141(Static120.aClass119_44);
					Static174.method4657(new Class102(), Static166.aClass119_61, Static68.aClass119_22);
					Static26.method497(Static166.aClass119_61, Static68.aClass119_22);
					Static280.method4272(Static160.aClass119_60);
					Static224.method3622(Static160.aClass119_60);
					Static104.method1984(Static160.aClass119_60);
					Static43.method785(Static45.aClass119_15, Static160.aClass119_60);
					Static182.method3105(Static160.aClass119_60, Static45.aClass119_15);
					Static292.method4395(Static45.aClass119_15, Static160.aClass119_60);
					Static193.anInt3756 = 50;
					Static284.aString200 = Static283.aString199;
					Static158.method3203();
					Static122.anInt2474 = 80;
				}
			} else if (Static122.anInt2474 == 80) {
				local42 = Static68.method1296(Static45.aClass119_15);
				local370 = Static238.method3358();
				if (local370 <= local42) {
					Static132.method2306(Static45.aClass119_15);
					Static284.aString200 = Static146.aString100;
					Static122.anInt2474 = 90;
					Static193.anInt3756 = 60;
				} else {
					Static193.anInt3756 = 60;
					Static284.aString200 = Static89.aString69 + local42 * 100 / local370 + "%";
				}
			} else if (Static122.anInt2474 == 90) {
				if (Static167.aClass119_11.method3222()) {
					@Pc(967) Class52_Sub1 local967 = new Class52_Sub1(Static276.aClass119_86, Static167.aClass119_11, Static45.aClass119_15, 20, !Static286.aBoolean488);
					Static119.method2166(local967);
					if (Static153.anInt2340 == 1) {
						Static119.method2167(0.9F);
					}
					if (Static153.anInt2340 == 2) {
						Static119.method2167(0.8F);
					}
					if (Static153.anInt2340 == 3) {
						Static119.method2167(0.7F);
					}
					if (Static153.anInt2340 == 4) {
						Static119.method2167(0.6F);
					}
					Static122.anInt2474 = 100;
					Static284.aString200 = Static213.aString218;
					Static193.anInt3756 = 70;
				} else {
					Static284.aString200 = Static234.aString154 + Static167.aClass119_11.method3236() + "%";
					Static193.anInt3756 = 70;
				}
			} else if (Static122.anInt2474 == 100) {
				if (Static73.method1439(Static45.aClass119_15)) {
					Static122.anInt2474 = 110;
				}
			} else if (Static122.anInt2474 == 110) {
				Static299.aClass30_1 = new Class30();
				Static222.aClass176_3.method4373(10, Static299.aClass30_1);
				Static193.anInt3756 = 75;
				Static122.anInt2474 = 120;
				Static284.aString200 = Static98.aString71;
			} else if (Static122.anInt2474 == 120) {
				if (Static121.aClass119_45.method3233("huffman", "")) {
					@Pc(1067) Class169 local1067 = new Class169(Static121.aClass119_45.method3220("", "huffman"));
					Static129.method2273(local1067);
					Static284.aString200 = Static168.aString108;
					Static193.anInt3756 = 80;
					Static122.anInt2474 = 130;
				} else {
					Static284.aString200 = Static51.aString41 + "0%";
					Static193.anInt3756 = 80;
				}
			} else if (Static122.anInt2474 == 130) {
				if (!Static34.aClass119_13.method3222()) {
					Static284.aString200 = Static96.aString70 + Static34.aClass119_13.method3236() * 3 / 4 + "%";
					Static193.anInt3756 = 85;
				} else if (!Static21.aClass119_6.method3222()) {
					Static284.aString200 = Static96.aString70 + (Static21.aClass119_6.method3236() / 10 + 75) + "%";
					Static193.anInt3756 = 85;
				} else if (!Static110.aClass119_42.method3222()) {
					Static284.aString200 = Static96.aString70 + (Static110.aClass119_42.method3236() / 20 + 85) + "%";
					Static193.anInt3756 = 85;
				} else if (Static74.aClass119_28.method3248("details")) {
					Static249.method4631(Static74.aClass119_28);
					Static52.method959(Static212.aClass119_73);
					Static200.method3417(Static58.aClass119_18);
					Static284.aString200 = Static109.aString76;
					Static193.anInt3756 = 95;
					Static122.anInt2474 = 135;
				} else {
					Static284.aString200 = Static96.aString70 + (Static74.aClass119_28.method3238("details") / 10 + 90) + "%";
					Static193.anInt3756 = 85;
				}
			} else if (Static122.anInt2474 == 135) {
				local42 = Static117.method2131();
				if (local42 == -1) {
					Static284.aString200 = Static247.aString59;
					Static193.anInt3756 = 95;
				} else if (local42 == 7 || local42 == 9) {
					this.method759("worldlistfull");
					Static197.method3406(1000);
				} else if (Static179.aBoolean302) {
					Static193.anInt3756 = 96;
					Static122.anInt2474 = 140;
					Static284.aString200 = Static235.aString156;
				} else {
					this.method759("worldlistio_" + local42);
					Static197.method3406(1000);
				}
			} else if (Static122.anInt2474 == 140) {
				Static276.anInt5071 = Static34.aClass119_13.method3241("loginscreen");
				Static67.aClass119_20.method3247(false);
				Static197.aClass119_68.method3247(true);
				Static45.aClass119_15.method3247(true);
				Static110.aClass119_42.method3247(true);
				Static121.aClass119_45.method3247(true);
				Static34.aClass119_13.method3247(true);
				Static193.anInt3756 = 97;
				Static284.aString200 = Static164.aString107;
				Static66.aBoolean133 = true;
				Static122.anInt2474 = 150;
			} else if (Static122.anInt2474 == 150) {
				Static251.method3926();
				if (Static286.aBoolean489) {
					Static40.anInt844 = 0;
					Static296.anInt842 = 0;
					Static271.anInt4996 = 0;
					Static19.anInt422 = 0;
				}
				Static286.aBoolean489 = true;
				Static304.method4550(Static222.aClass176_3);
				Static122.method2210(-1, false, -1, Static271.anInt4996);
				Static122.anInt2474 = 160;
				Static193.anInt3756 = 100;
				Static284.aString200 = Static225.aString144;
			} else if (Static122.anInt2474 == 160) {
				Static124.method563(true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method772() {
		@Pc(14) boolean local14 = Static136.aClass164_1.method4075();
		if (!local14) {
			this.method780();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	protected void method765() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method775(@OriginalArg(1) int arg0) {
		Static43.aClass49_1 = null;
		Static136.aClass164_1.anInt4892++;
		Static136.aClass164_1.anInt4891 = arg0;
		Static280.anInt5133 = 0;
		Static5.aClass153_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method776() {
		for (Static23.anInt483 = 0; Static115.method2107() && Static23.anInt483 < 128; Static23.anInt483++) {
			Static293.anIntArray583[Static23.anInt483] = Static100.anInt5565;
			Static254.anIntArray536[Static23.anInt483] = Static264.aChar4;
		}
		Static38.anInt722++;
		if (Static315.anInt5636 != -1) {
			Static23.method462(Static315.anInt5636, 0, Static288.anInt5232, Static194.anInt3876, 0, 0, 0);
		}
		Static149.anInt950++;
		if (Static71.aBoolean165) {
			label197: for (@Pc(63) int local63 = 0; local63 < 32768; local63++) {
				@Pc(72) Class11_Sub4_Sub2 local72 = Static138.aClass11_Sub4_Sub2Array2[local63];
				if (local72 != null) {
					@Pc(79) byte local79 = local72.aClass183_1.aByte20;
					if ((local79 & 0x2) > 0 && local72.anInt3863 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(114) int local114 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local106 != 0 || local114 != 0) {
							local72.anIntArray407[0] = local106 + (local72.anInt3865 >> 7);
							local72.anIntArray406[0] = (local72.anInt3856 >> 7) + local114;
							local72.aByteArray127[0] = 1;
							Static122.aClass60Array1[Static132.anInt2608].method1697(false, local72.anInt3865 >> 7, local72.anInt3856 >> 7, local72.method3347(), 0, local72.method3347(), false);
							if (local72.anIntArray407[0] >= 0 && local72.anIntArray407[0] <= 104 - local72.method3347() && local72.anIntArray406[0] >= 0 && local72.anIntArray406[0] <= 104 - local72.method3347() && Static122.aClass60Array1[Static132.anInt2608].method1695(local72.anInt3865 >> 7, local72.anIntArray407[0], local72.anIntArray406[0], local72.anInt3856 >> 7)) {
								if (local72.method3347() > 1) {
									for (@Pc(244) int local244 = local72.anIntArray407[0]; local72.anIntArray407[0] + local72.method3347() > local244; local244++) {
										for (@Pc(264) int local264 = local72.anIntArray406[0]; local72.anIntArray406[0] + local72.method3347() > local264; local264++) {
											if ((Static122.aClass60Array1[Static132.anInt2608].anIntArrayArray12[local244][local264] & 0x2401FF) != 0) {
												continue label197;
											}
										}
									}
								}
								local72.anInt3863 = 1;
							}
						}
					}
					Static266.method4111(local72);
					Static294.method947(local72);
					Static8.method143(local72);
					Static122.aClass60Array1[Static132.anInt2608].method1698(local72.anInt3856 >> 7, local72.method3347(), local72.anInt3865 >> 7, local72.method3347(), false, false);
				}
			}
		}
		if (!Static71.aBoolean165 && Static272.anInt5005 == 0) {
			Static144.method2515();
		} else if (Static129.anInt2552 == 0 && Static74.anInt1611 == 0) {
			if (Static228.anInt4270 == 2) {
				Static299.method4474();
			} else {
				Static31.method535();
			}
			if (Static273.anInt5035 >> 7 < 14 || Static273.anInt5035 >> 7 >= 90 || Static87.anInt1875 >> 7 < 14 || Static87.anInt1875 >> 7 >= 90) {
				Static219.method3545();
			}
		}
		while (true) {
			@Pc(381) Class1_Sub29 local381;
			@Pc(389) Class157 local389;
			@Pc(398) Class157 local398;
			do {
				local381 = (Class1_Sub29) Static128.aClass96_7.method2339();
				if (local381 == null) {
					while (true) {
						do {
							local381 = (Class1_Sub29) Static76.aClass96_23.method2339();
							if (local381 == null) {
								while (true) {
									do {
										local381 = (Class1_Sub29) Static145.aClass96_8.method2339();
										if (local381 == null) {
											if (Static64.aClass157_5 != null) {
												Static79.method1636();
											}
											if (Static44.aClass153_3 != null && Static44.aClass153_3.anInt4614 == 1) {
												if (Static44.aClass153_3.anObject6 != null) {
													Static245.method3860(Static284.aBoolean487, Static37.aString31);
												}
												Static37.aString31 = null;
												Static44.aClass153_3 = null;
												Static284.aBoolean487 = false;
											}
											if (Static167.anInt637 % 1500 == 0) {
												Static168.method2836();
											}
											return;
										}
										local389 = local381.aClass157_13;
										if (local389.anInt4692 < 0) {
											break;
										}
										local398 = Static206.method3444(local389.anInt4671);
									} while (local398 == null || local398.aClass157Array2 == null || local389.anInt4692 >= local398.aClass157Array2.length || local389 != local398.aClass157Array2[local389.anInt4692]);
									Static5.method104(local381);
								}
							}
							local389 = local381.aClass157_13;
							if (local389.anInt4692 < 0) {
								break;
							}
							local398 = Static206.method3444(local389.anInt4671);
						} while (local398 == null || local398.aClass157Array2 == null || local389.anInt4692 >= local398.aClass157Array2.length || local389 != local398.aClass157Array2[local389.anInt4692]);
						Static5.method104(local381);
					}
				}
				local389 = local381.aClass157_13;
				if (local389.anInt4692 < 0) {
					break;
				}
				local398 = Static206.method3444(local389.anInt4671);
			} while (local398 == null || local398.aClass157Array2 == null || local389.anInt4692 >= local398.aClass157Array2.length || local389 != local398.aClass157Array2[local389.anInt4692]);
			Static5.method104(local381);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method754() {
		if (Static71.aBoolean165) {
			Static71.method1389();
		}
		if (Static196.aFrame1 != null) {
			Static258.method4025(Static222.aClass176_3, Static196.aFrame1);
			Static196.aFrame1 = null;
		}
		if (Static299.aClass30_1 != null) {
			Static299.aClass30_1.aBoolean97 = false;
		}
		Static299.aClass30_1 = null;
		if (Static97.aClass49_2 != null) {
			Static97.aClass49_2.method1307();
			Static97.aClass49_2 = null;
		}
		Static148.method2589(Static229.aCanvas2);
		Static155.method2674(Static229.aCanvas2);
		if (Static9.aClass47_1 != null) {
			Static9.aClass47_1.method1166(Static229.aCanvas2);
		}
		Static292.method4400();
		Static267.method4131();
		Static9.aClass47_1 = null;
		if (Static129.aClass121_2 != null) {
			Static129.aClass121_2.method3576();
		}
		if (Static13.aClass121_1 != null) {
			Static13.aClass121_1.method3576();
		}
		Static136.aClass164_1.method4081();
		Static6.aClass178_8.method4418();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method767() {
		if (Static97.anInt2087 == 1000) {
			return;
		}
		Static167.anInt637++;
		if (Static167.anInt637 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static35.anInt657 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static103.aRandom1.setSeed((long) Static35.anInt657);
		}
		this.method772();
		if (Static209.aClass147_1 != null) {
			Static209.aClass147_1.method3857();
		}
		Static135.method2344();
		Static246.method3875();
		Static313.method4661();
		Static298.method4466();
		if (Static71.aBoolean165) {
			Static162.method2795();
		}
		if (Static9.aClass47_1 != null) {
			@Pc(81) int local81 = Static9.aClass47_1.method1165();
			Static205.anInt3960 = local81;
		}
		if (Static97.anInt2087 == 0) {
			this.method771();
			Static165.method4610();
		} else if (Static97.anInt2087 == 5) {
			this.method771();
			Static165.method4610();
		} else if (Static97.anInt2087 == 25 || Static97.anInt2087 == 28) {
			Static124.method565();
		}
		if (Static97.anInt2087 == 10) {
			this.method776();
			Static206.method3442();
			Static89.method1731();
			Static4.method77();
		} else if (Static97.anInt2087 == 30) {
			Static245.method3863();
		} else if (Static97.anInt2087 == 40) {
			Static4.method77();
			if (Static13.anInt282 != -3) {
				if (Static13.anInt282 == 15) {
					Static228.method3660();
				} else if (Static13.anInt282 != 2) {
					Static218.method3536();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method780() {
		if (Static154.anInt3090 < Static136.aClass164_1.anInt4892) {
			Static270.anInt4987 = (Static136.aClass164_1.anInt4892 * 50 - 50) * 5;
			if (Static270.anInt4987 > 3000) {
				Static270.anInt4987 = 3000;
			}
			if (Static23.anInt472 == Static8.anInt235) {
				Static8.anInt235 = Static287.anInt5204;
			} else {
				Static8.anInt235 = Static23.anInt472;
			}
			if (Static136.aClass164_1.anInt4892 >= 2 && Static136.aClass164_1.anInt4891 == 6) {
				this.method759("js5connect_outofdate");
				Static97.anInt2087 = 1000;
				return;
			}
			if (Static136.aClass164_1.anInt4892 >= 4 && Static136.aClass164_1.anInt4891 == -1) {
				this.method759("js5crc");
				Static97.anInt2087 = 1000;
				return;
			}
			if (Static136.aClass164_1.anInt4892 >= 4 && (Static97.anInt2087 == 0 || Static97.anInt2087 == 5)) {
				if (Static136.aClass164_1.anInt4891 == 7 || Static136.aClass164_1.anInt4891 == 9) {
					this.method759("js5connect_full");
				} else if (Static136.aClass164_1.anInt4891 > 0) {
					this.method759("js5connect");
				} else {
					this.method759("js5io");
				}
				Static97.anInt2087 = 1000;
				return;
			}
		}
		Static154.anInt3090 = Static136.aClass164_1.anInt4892;
		if (Static270.anInt4987 > 0) {
			Static270.anInt4987--;
			return;
		}
		try {
			if (Static280.anInt5133 == 0) {
				Static5.aClass153_1 = Static222.aClass176_3.method4371(Static252.aString164, Static8.anInt235);
				Static280.anInt5133++;
			}
			if (Static280.anInt5133 == 1) {
				if (Static5.aClass153_1.anInt4614 == 2) {
					this.method775(1000);
					return;
				}
				if (Static5.aClass153_1.anInt4614 == 1) {
					Static280.anInt5133++;
				}
			}
			if (Static280.anInt5133 == 2) {
				Static43.aClass49_1 = new Class49((Socket) Static5.aClass153_1.anObject6, Static222.aClass176_3);
				@Pc(195) Class1_Sub13 local195 = new Class1_Sub13(5);
				local195.method1822(15);
				local195.method1851(548);
				Static43.aClass49_1.method1302(local195.aByteArray63, 5);
				Static280.anInt5133++;
				Static222.aLong160 = Static244.method3859();
			}
			if (Static280.anInt5133 == 3) {
				if (Static97.anInt2087 == 0 || Static97.anInt2087 == 5 || Static43.aClass49_1.method1300() > 0) {
					@Pc(254) int local254 = Static43.aClass49_1.method1301();
					if (local254 != 0) {
						this.method775(local254);
						return;
					}
					Static280.anInt5133++;
				} else if (Static244.method3859() - Static222.aLong160 > 30000L) {
					this.method775(1001);
					return;
				}
			}
			if (Static280.anInt5133 == 4) {
				@Pc(286) boolean local286 = Static97.anInt2087 == 5 || Static97.anInt2087 == 10 || Static97.anInt2087 == 28;
				Static136.aClass164_1.method4077(Static43.aClass49_1, !local286);
				Static280.anInt5133 = 0;
				Static5.aClass153_1 = null;
				Static43.aClass49_1 = null;
			}
		} catch (@Pc(303) IOException local303) {
			this.method775(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method753() {
		if (Static97.anInt2087 == 1000) {
			return;
		}
		@Pc(24) long local24 = Static21.method440() / 1000000L - Static160.aLong113;
		Static160.aLong113 = Static21.method440() / 1000000L;
		@Pc(32) boolean local32 = Static82.method1686();
		if (local32 && Static197.aBoolean347 && Static129.aClass121_2 != null) {
			Static129.aClass121_2.method3580();
		}
		if ((Static97.anInt2087 == 30 || Static97.anInt2087 == 10) && (Static300.aBoolean509 || Static76.aLong182 != 0L && Static244.method3859() > Static76.aLong182)) {
			Static122.method2210(Static80.anInt1772, Static300.aBoolean509, Static299.anInt5384, Static269.method4147());
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static196.aFrame1 == null) {
			@Pc(78) Container local78;
			if (Static196.aFrame1 != null) {
				local78 = Static196.aFrame1;
			} else if (Static311.aFrame2 == null) {
				local78 = Static222.aClass176_3.anApplet1;
			} else {
				local78 = Static311.aFrame2;
			}
			local94 = local78.getSize().width;
			local98 = local78.getSize().height;
			if (Static311.aFrame2 == local78) {
				@Pc(104) Insets local104 = Static311.aFrame2.getInsets();
				local98 -= local104.top + local104.bottom;
				local94 -= local104.right + local104.left;
			}
			if (local94 != Static187.anInt3577 || local98 != Static253.anInt4653) {
				if (Static290.aString209.startsWith("mac")) {
					Static253.anInt4653 = local98;
					Static187.anInt3577 = local94;
				} else {
					Static314.method4672();
				}
				Static76.aLong182 = Static244.method3859() + 500L;
			}
		}
		if (Static196.aFrame1 != null && !Static295.aBoolean500 && (Static97.anInt2087 == 30 || Static97.anInt2087 == 10)) {
			Static122.method2210(-1, false, -1, Static271.anInt4996);
		}
		@Pc(166) boolean local166 = false;
		if (Static183.aBoolean309) {
			local166 = true;
			Static183.aBoolean309 = false;
		}
		if (local166) {
			Static51.method940();
		}
		if (Static71.aBoolean165) {
			for (local94 = 0; local94 < 100; local94++) {
				Static166.aBooleanArray11[local94] = true;
			}
		}
		if (Static97.anInt2087 == 0) {
			Static155.method2673(Static193.anInt3756, local166, Static284.aString200, null);
		} else if (Static97.anInt2087 == 5) {
			Static58.method1042(Static19.aClass1_Sub5_Sub9_1, false);
		} else if (Static97.anInt2087 == 10) {
			Static48.method902();
		} else if (Static97.anInt2087 == 25 || Static97.anInt2087 == 28) {
			if (Static58.anInt1248 == 1) {
				if (Static82.anInt1811 > Static154.anInt3089) {
					Static154.anInt3089 = Static82.anInt1811;
				}
				local94 = (Static154.anInt3089 - Static82.anInt1811) * 50 / Static154.anInt3089;
				Static288.method4341(false, Static270.aString192 + "<br>(" + local94 + "%)");
			} else if (Static58.anInt1248 == 2) {
				if (Static132.anInt2603 > Static42.anInt956) {
					Static42.anInt956 = Static132.anInt2603;
				}
				local94 = (Static42.anInt956 - Static132.anInt2603) * 50 / Static42.anInt956 + 50;
				Static288.method4341(false, Static270.aString192 + "<br>(" + local94 + "%)");
			} else {
				Static288.method4341(false, Static270.aString192);
			}
		} else if (Static97.anInt2087 == 30) {
			Static295.method4414(local24);
		} else if (Static97.anInt2087 == 40) {
			Static288.method4341(false, Static83.aString64 + "<br>" + Static229.aString190);
		}
		if (Static71.aBoolean165 && Static97.anInt2087 != 0) {
			Static71.method1375();
			for (local94 = 0; local94 < Static37.anInt686; local94++) {
				Static88.aBooleanArray5[local94] = false;
			}
		} else {
			@Pc(369) Graphics local369;
			if ((Static97.anInt2087 == 30 || Static97.anInt2087 == 10) && Static18.anInt394 == 0 && !local166) {
				try {
					local369 = Static229.aCanvas2.getGraphics();
					for (local98 = 0; local98 < Static37.anInt686; local98++) {
						if (Static88.aBooleanArray5[local98]) {
							Static82.aClass130_1.method4487(Static282.anIntArray563[local98], Static23.anIntArray54[local98], Static35.anIntArray69[local98], local369, Static313.anIntArray613[local98]);
							Static88.aBooleanArray5[local98] = false;
						}
					}
				} catch (@Pc(434) Exception local434) {
					Static229.aCanvas2.repaint();
				}
			} else if (Static97.anInt2087 != 0) {
				try {
					local369 = Static229.aCanvas2.getGraphics();
					Static82.aClass130_1.method4486(local369);
					for (local98 = 0; local98 < Static37.anInt686; local98++) {
						Static88.aBooleanArray5[local98] = false;
					}
				} catch (@Pc(389) Exception local389) {
					Static229.aCanvas2.repaint();
				}
			}
		}
		if (Static66.aBoolean133) {
			Static120.method2193();
		}
		if (Static286.aBoolean489 && Static97.anInt2087 == 10 && Static315.anInt5636 != -1) {
			Static286.aBoolean489 = false;
			Static304.method4550(Static222.aClass176_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method758() {
		Static314.method4672();
		Static6.aClass178_8 = new Class178();
		Static136.aClass164_1 = new Class164();
		if (Static106.anInt3751 != 0) {
			Static158.aByteArrayArray14 = new byte[50][];
		}
		Static58.method1034(Static222.aClass176_3);
		if (Static210.anInt4011 == 0) {
			Static292.aString210 = this.getCodeBase().getHost();
			Static245.anInt4509 = 43594;
			Static103.anInt2200 = 443;
		} else if (Static210.anInt4011 == 1) {
			Static292.aString210 = this.getCodeBase().getHost();
			Static103.anInt2200 = Static23.anInt488 + 50000;
			Static245.anInt4509 = Static23.anInt488 + 40000;
		} else if (Static210.anInt4011 == 2) {
			Static292.aString210 = "127.0.0.1";
			Static103.anInt2200 = Static23.anInt488 + 50000;
			Static245.anInt4509 = Static23.anInt488 + 40000;
		}
		Static203.anInt3367 = Static245.anInt4509;
		Static287.anInt5204 = Static103.anInt2200;
		Static135.aShortArray54 = Static136.aShortArray55 = Static275.aShortArray84 = Static255.aShortArray82 = new short[256];
		Static23.anInt472 = Static245.anInt4509;
		Static252.aString164 = Static292.aString210;
		Static8.anInt235 = Static203.anInt3367;
		if (Static290.anInt5261 == 3 && Static210.anInt4011 != 2) {
			Static124.anInt596 = Static23.anInt488;
		}
		if (Static272.anInt5005 == 1) {
			Static65.anInt1348 = 0;
			Static65.anInt1351 = 16777215;
			Static17.aBoolean36 = true;
			Static293.aShortArray85 = Static250.aShortArray81;
			Static55.aShortArrayArray4 = Static142.aShortArrayArray6;
			Static150.aShortArray56 = Static233.aShortArray76;
			Static222.aShortArrayArray8 = Static35.aShortArrayArray1;
		} else {
			Static55.aShortArrayArray4 = Static155.aShortArrayArray7;
			Static293.aShortArray85 = Static270.aShortArray83;
			Static222.aShortArrayArray8 = Static63.aShortArrayArray5;
			Static150.aShortArray56 = Static222.aShortArray75;
		}
		Static56.method1016();
		Static142.method2503(Static229.aCanvas2);
		Static156.method2692(Static229.aCanvas2);
		Static9.aClass47_1 = Static67.method1156();
		if (Static9.aClass47_1 != null) {
			Static9.aClass47_1.method1169(Static229.aCanvas2);
		}
		Static228.anInt4266 = Static290.anInt5261;
		try {
			if (Static222.aClass176_3.aClass48_4 != null) {
				Static91.aClass38_2 = new Class38(Static222.aClass176_3.aClass48_4, 5200, 0);
				for (@Pc(167) int local167 = 0; local167 < 29; local167++) {
					Static42.aClass38Array1[local167] = new Class38(Static222.aClass176_3.aClass48Array1[local167], 6000, 0);
				}
				Static28.aClass38_1 = new Class38(Static222.aClass176_3.aClass48_3, 6000, 0);
				Static132.aClass141_1 = new Class141(255, Static91.aClass38_2, Static28.aClass38_1, 500000);
				Static298.aClass38_5 = new Class38(Static222.aClass176_3.aClass48_2, 24, 0);
				Static222.aClass176_3.aClass48_2 = null;
				Static222.aClass176_3.aClass48_3 = null;
				Static222.aClass176_3.aClass48Array1 = null;
				Static222.aClass176_3.aClass48_4 = null;
			}
		} catch (@Pc(225) IOException local225) {
			Static91.aClass38_2 = null;
			Static132.aClass141_1 = null;
			Static28.aClass38_1 = null;
			Static298.aClass38_5 = null;
		}
		if (Static210.anInt4011 != 0) {
			Static248.aBoolean415 = true;
		}
		if (Static272.anInt5005 == 0) {
			Static35.aString28 = Static74.aString60;
		} else if (Static272.anInt5005 == 1) {
			Static35.aString28 = Static273.aString193;
		}
	}
}
