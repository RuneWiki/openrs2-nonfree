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
				Static166.method2850("argument count");
			}
			Static269.anInt5585 = Integer.parseInt(arg0[0]);
			Static7.anInt237 = 2;
			if (arg0[1].equals("live")) {
				Static113.anInt2429 = 0;
			} else if (arg0[1].equals("rc")) {
				Static113.anInt2429 = 1;
			} else if (arg0[1].equals("wip")) {
				Static113.anInt2429 = 2;
			} else {
				Static166.method2850("modewhat");
			}
			Static295.aBoolean487 = false;
			Static206.anInt4309 = Static163.method2823(arg0[2]);
			if (Static206.anInt4309 == -1) {
				if (arg0[2].equals("english")) {
					Static206.anInt4309 = 0;
				} else if (arg0[2].equals("german")) {
					Static206.anInt4309 = 1;
				} else {
					Static166.method2850("language");
				}
			}
			Static77.method1386(Static206.anInt4309);
			Static54.aBoolean95 = false;
			Static19.aBoolean39 = false;
			if (arg0[3].equals("game0")) {
				Static84.anInt825 = 0;
			} else if (arg0[3].equals("game1")) {
				Static84.anInt825 = 1;
			} else {
				Static166.method2850("game");
			}
			Static16.aString23 = "";
			Static163.anInt3428 = 0;
			Static136.anInt2976 = 0;
			Static53.aBoolean90 = false;
			@Pc(129) client local129 = new client();
			Static262.aClient41 = local129;
			local129.method688("runescape", Static113.anInt2429 + 32);
			Static298.aFrame3.setLocation(40, 40);
		} catch (@Pc(149) Exception local149) {
			Static108.method2009(local149, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method694(@OriginalArg(1) int arg0) {
		Static139.aClass78_2.anInt2283 = arg0;
		Static58.aClass28_4 = null;
		Static208.aClass45_3 = null;
		Static139.aClass78_2.anInt2282++;
		Static209.anInt1845 = 0;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method693()) {
			return;
		}
		Static269.anInt5585 = Integer.parseInt(this.getParameter("worldid"));
		Static7.anInt237 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static7.anInt237 < 0 || Static7.anInt237 > 1) {
			Static7.anInt237 = 0;
		}
		Static113.anInt2429 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static113.anInt2429 < 0 || Static113.anInt2429 > 2) {
			Static113.anInt2429 = 0;
		}
		@Pc(50) String local50 = this.getParameter("advertsuppressed");
		if (local50 != null && local50.equals("1")) {
			Static295.aBoolean487 = true;
		} else {
			Static295.aBoolean487 = false;
		}
		try {
			Static206.anInt4309 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(69) Exception local69) {
			Static206.anInt4309 = 0;
		}
		Static77.method1386(Static206.anInt4309);
		@Pc(78) String local78 = this.getParameter("objecttag");
		if (local78 != null && local78.equals("1")) {
			Static19.aBoolean39 = true;
		} else {
			Static19.aBoolean39 = false;
		}
		@Pc(95) String local95 = this.getParameter("js");
		if (local95 != null && local95.equals("1")) {
			Static54.aBoolean95 = true;
		} else {
			Static54.aBoolean95 = false;
		}
		@Pc(112) String local112 = this.getParameter("game");
		if (local112 != null && local112.equals("1")) {
			Static84.anInt825 = 1;
		} else {
			Static84.anInt825 = 0;
		}
		try {
			Static136.anInt2976 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(132) Exception local132) {
			Static136.anInt2976 = 0;
		}
		Static16.aString23 = this.getParameter("settings");
		if (Static16.aString23 == null) {
			Static16.aString23 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static163.anInt3428 = Integer.parseInt(local147);
			} catch (@Pc(155) Exception local155) {
				Static163.anInt3428 = 0;
			}
		}
		@Pc(161) String local161 = this.getParameter("haveie6");
		if (local161 != null && local161.equals("1")) {
			Static53.aBoolean90 = true;
		} else {
			Static53.aBoolean90 = false;
		}
		Static262.aClient41 = this;
		this.method681(Static113.anInt2429 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method687() {
		Static72.method1335();
		Static249.aClass12_3 = new Class12();
		Static139.aClass78_2 = new Class78();
		if (Static113.anInt2429 != 0) {
			Static91.aByteArrayArray46 = new byte[50][];
		}
		Static231.method3886(Static299.aClass177_5);
		if (Static7.anInt237 == 0) {
			Static141.aString142 = this.getCodeBase().getHost();
			Static106.anInt2314 = 443;
			Static251.anInt5003 = 43594;
		} else if (Static7.anInt237 == 1) {
			Static141.aString142 = this.getCodeBase().getHost();
			Static251.anInt5003 = Static269.anInt5585 + 40000;
			Static106.anInt2314 = Static269.anInt5585 + 50000;
		} else if (Static7.anInt237 == 2) {
			Static106.anInt2314 = Static269.anInt5585 + 50000;
			Static141.aString142 = "127.0.0.1";
			Static251.anInt5003 = Static269.anInt5585 + 40000;
		}
		Static2.anInt5943 = Static106.anInt2314;
		if (Static84.anInt825 == 1) {
			Static233.aShortArrayArray5 = Static162.aShortArrayArray3;
			Static28.aShortArray5 = Static183.aShortArray41;
			Static215.aShortArrayArray4 = Static126.aShortArrayArray2;
			Static117.anInt2495 = 16777215;
			Static117.anInt2494 = 0;
			Static42.aBoolean74 = true;
			Static32.aShortArray6 = Static27.aShortArray3;
		} else {
			Static215.aShortArrayArray4 = Static38.aShortArrayArray1;
			Static28.aShortArray5 = Static86.aShortArray31;
			Static233.aShortArrayArray5 = Static285.aShortArrayArray6;
			Static32.aShortArray6 = Static86.aShortArray32;
		}
		Static88.aShortArray56 = Static8.aShortArray1 = Static55.aShortArray26 = Static13.aShortArray2 = new short[256];
		Static26.anInt553 = Static251.anInt5003;
		if (Static282.anInt5835 == 3 && Static7.anInt237 != 2) {
			Static186.anInt3934 = Static269.anInt5585;
		}
		Static139.anInt3001 = Static251.anInt5003;
		Static205.anInt4279 = Static26.anInt553;
		Static186.aString197 = Static141.aString142;
		Static101.method4817();
		Static281.method4664(Static105.aCanvas1);
		Static8.method242(Static105.aCanvas1);
		Static260.aClass19_1 = Static203.method3423();
		if (Static260.aClass19_1 != null) {
			Static260.aClass19_1.method1063(Static105.aCanvas1);
		}
		Static209.anInt1846 = Static282.anInt5835;
		try {
			if (Static299.aClass177_5.aClass110_4 != null) {
				Static243.aClass135_6 = new Class135(Static299.aClass177_5.aClass110_4, 5200, 0);
				for (@Pc(163) int local163 = 0; local163 < 29; local163++) {
					Static248.aClass135Array1[local163] = new Class135(Static299.aClass177_5.aClass110Array1[local163], 6000, 0);
				}
				Static219.aClass135_7 = new Class135(Static299.aClass177_5.aClass110_3, 6000, 0);
				Static73.aClass35_1 = new Class35(255, Static243.aClass135_6, Static219.aClass135_7, 500000);
				Static40.aClass135_3 = new Class135(Static299.aClass177_5.aClass110_2, 24, 0);
				Static299.aClass177_5.aClass110Array1 = null;
				Static299.aClass177_5.aClass110_4 = null;
				Static299.aClass177_5.aClass110_2 = null;
				Static299.aClass177_5.aClass110_3 = null;
			}
		} catch (@Pc(221) IOException local221) {
			Static243.aClass135_6 = null;
			Static219.aClass135_7 = null;
			Static73.aClass35_1 = null;
			Static40.aClass135_3 = null;
		}
		Static87.aString94 = Static58.aString67;
		if (Static7.anInt237 != 0) {
			Static173.aBoolean307 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method696(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub26 local10 = new Class2_Sub26(arg0);
		while (true) {
			@Pc(14) int local14 = local10.method4261();
			if (local14 == 0) {
				return;
			}
			if (local14 == 1) {
				@Pc(28) int[] local28 = Static174.anIntArray299 = new int[6];
				local28[0] = local10.method4242();
				local28[1] = local10.method4242();
				local28[2] = local10.method4242();
				local28[3] = local10.method4242();
				local28[4] = local10.method4242();
				local28[5] = local10.method4242();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method697() {
		if (!Static133.aBoolean220) {
			label265: while (true) {
				do {
					if (!Static73.method1366()) {
						break label265;
					}
				} while (Static251.aChar4 != 's' && Static251.aChar4 != 'S');
				Static133.aBoolean220 = true;
			}
		}
		@Pc(40) int local40;
		if (Static8.anInt274 == 0) {
			@Pc(30) Runtime local30 = Runtime.getRuntime();
			local40 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
			@Pc(43) long local43 = Static6.method126();
			if (Static176.aLong199 == 0L) {
				Static176.aLong199 = local43;
			}
			if (local40 > 16384 && local43 - Static176.aLong199 < 5000L) {
				if (local43 - Static185.aLong210 > 1000L) {
					System.gc();
					Static185.aLong210 = local43;
				}
				Static125.aString275 = Static205.aString212;
				Static153.anInt3237 = 5;
			} else {
				Static125.aString275 = Static90.aString100;
				Static8.anInt274 = 10;
				Static153.anInt3237 = 5;
			}
			return;
		}
		@Pc(98) int local98;
		if (Static8.anInt274 == 10) {
			Static128.method2278();
			for (local98 = 0; local98 < 4; local98++) {
				Static98.aClass52Array1[local98] = new Class52(104, 104);
			}
			Static125.aString275 = Static185.aString196;
			Static8.anInt274 = 30;
			Static153.anInt3237 = 10;
		} else if (Static8.anInt274 == 30) {
			if (Static157.aClass91_1 == null) {
				Static157.aClass91_1 = new Class91(Static139.aClass78_2, Static249.aClass12_3);
			}
			if (Static157.aClass91_1.method2260()) {
				Static294.aClass84_132 = Static36.method718(false, true, true, 0);
				Static150.aClass84_60 = Static36.method718(false, true, true, 1);
				Static73.aClass84_32 = Static36.method718(true, true, false, 2);
				Static88.aClass84_103 = Static36.method718(false, true, true, 3);
				Static115.aClass84_50 = Static36.method718(false, true, true, 4);
				Static11.aClass84_8 = Static36.method718(true, true, true, 5);
				Static152.aClass84_61 = Static36.method718(true, false, true, 6);
				Static233.aClass84_105 = Static36.method718(false, true, true, 7);
				Static201.aClass84_85 = Static36.method718(false, true, true, 8);
				Static227.aClass84_104 = Static36.method718(false, true, true, 9);
				Static42.aClass84_20 = Static36.method718(false, true, true, 10);
				Static233.aClass84_106 = Static36.method718(false, true, true, 11);
				Static171.aClass84_68 = Static36.method718(false, true, true, 12);
				Static107.aClass84_46 = Static36.method718(false, true, true, 13);
				Static63.aClass84_29 = Static36.method718(false, false, true, 14);
				Static75.aClass84_33 = Static36.method718(false, true, true, 15);
				Static291.aClass84_130 = Static36.method718(false, true, true, 16);
				Static101.aClass84_128 = Static36.method718(false, true, true, 17);
				Static42.aClass84_19 = Static36.method718(false, true, true, 18);
				Static197.aClass84_83 = Static36.method718(false, true, true, 19);
				Static174.aClass84_72 = Static36.method718(false, true, true, 20);
				Static140.aClass84_57 = Static36.method718(false, true, true, 21);
				Static172.aClass84_69 = Static36.method718(false, true, true, 22);
				Static164.aClass84_65 = Static36.method718(true, true, true, 23);
				Static180.aClass84_75 = Static36.method718(false, true, true, 24);
				Static270.aClass84_114 = Static36.method718(false, true, true, 25);
				Static15.aClass84_9 = Static36.method718(true, true, true, 26);
				Static136.aClass84_55 = Static36.method718(false, true, true, 27);
				Static159.aClass84_64 = Static36.method718(true, true, true, 28);
				Static8.anInt274 = 40;
				Static125.aString275 = Static243.aString187;
				Static153.anInt3237 = 15;
			} else {
				Static125.aString275 = Static296.aString300;
				Static153.anInt3237 = 12;
			}
		} else if (Static8.anInt274 == 40) {
			local98 = 0;
			for (local40 = 0; local40 < 29; local40++) {
				local98 += Static172.aClass63_Sub1Array2[local40].method3802() * Static182.anIntArray308[local40] / 100;
			}
			if (local98 == 100) {
				Static153.anInt3237 = 20;
				Static125.aString275 = Static216.aString226;
				Static104.method1943(Static201.aClass84_85);
				Static283.method4711(Static201.aClass84_85);
				Static285.method4728(Static201.aClass84_85);
				Static8.anInt274 = 41;
			} else {
				Static153.anInt3237 = 20;
				if (local98 != 0) {
					Static125.aString275 = Static88.aString235 + local98 + "%";
				}
			}
		} else if (Static8.anInt274 == 41) {
			if (Static159.aClass84_64.method2137()) {
				this.method696(Static159.aClass84_64.method2146(1));
				Static153.anInt3237 = 25;
				Static125.aString275 = Static11.aString14;
				Static8.anInt274 = 45;
			} else {
				Static125.aString275 = Static241.aString241 + Static159.aClass84_64.method2148() + "%";
				Static153.anInt3237 = 25;
			}
		} else if (Static8.anInt274 == 45) {
			Static122.method2221(Static183.aBoolean332);
			Static272.aClass2_Sub5_Sub3_3 = new Class2_Sub5_Sub3();
			Static272.aClass2_Sub5_Sub3_3.method2759();
			Static107.aClass3_2 = Static145.method2560(0, Static299.aClass177_5, Static105.aCanvas1, 22050);
			Static107.aClass3_2.method2228(Static272.aClass2_Sub5_Sub3_3);
			Static71.method1331(Static272.aClass2_Sub5_Sub3_3, Static115.aClass84_50, Static63.aClass84_29, Static75.aClass84_33);
			Static68.aClass3_1 = Static145.method2560(1, Static299.aClass177_5, Static105.aCanvas1, 2048);
			Static43.aClass2_Sub5_Sub1_1 = new Class2_Sub5_Sub1();
			Static68.aClass3_1.method2228(Static43.aClass2_Sub5_Sub1_1);
			Static171.aClass9_1 = new Class9(22050, Static110.anInt2380);
			Static74.anInt1604 = Static152.aClass84_61.method2121("scape main");
			Static153.anInt3237 = 30;
			Static8.anInt274 = 50;
			Static125.aString275 = Static105.aString115;
		} else if (Static8.anInt274 == 50) {
			local98 = Static109.method2015(Static201.aClass84_85, Static107.aClass84_46);
			local40 = Static49.method987();
			if (local98 >= local40) {
				Static153.anInt3237 = 35;
				Static125.aString275 = Static198.aString207;
				Static8.anInt274 = 60;
			} else {
				Static153.anInt3237 = 35;
				Static125.aString275 = Static149.aString152 + local98 * 100 / local40 + "%";
			}
		} else if (Static8.anInt274 == 60) {
			local98 = Static231.method3887(Static201.aClass84_85);
			local40 = Static122.method2222();
			if (local98 >= local40) {
				Static8.anInt274 = 65;
				Static153.anInt3237 = 40;
				Static125.aString275 = Static221.aString230;
			} else {
				Static153.anInt3237 = 40;
				Static125.aString275 = Static205.aString213 + local98 * 100 / local40 + "%";
			}
		} else if (Static8.anInt274 == 65) {
			Static253.method4073(Static201.aClass84_85, Static107.aClass84_46);
			Static125.aString275 = Static106.aString120;
			Static153.anInt3237 = 45;
			Static21.method453(5);
			Static8.anInt274 = 70;
		} else if (Static8.anInt274 == 70) {
			Static73.aClass84_32.method2137();
			local98 = Static73.aClass84_32.method2148();
			Static291.aClass84_130.method2137();
			local98 += Static291.aClass84_130.method2148();
			Static101.aClass84_128.method2137();
			local98 += Static101.aClass84_128.method2148();
			Static42.aClass84_19.method2137();
			local98 += Static42.aClass84_19.method2148();
			Static197.aClass84_83.method2137();
			local98 += Static197.aClass84_83.method2148();
			Static174.aClass84_72.method2137();
			local98 += Static174.aClass84_72.method2148();
			Static140.aClass84_57.method2137();
			local98 += Static140.aClass84_57.method2148();
			Static172.aClass84_69.method2137();
			local98 += Static172.aClass84_69.method2148();
			Static180.aClass84_75.method2137();
			local98 += Static180.aClass84_75.method2148();
			Static270.aClass84_114.method2137();
			local98 += Static270.aClass84_114.method2148();
			Static136.aClass84_55.method2137();
			local98 += Static136.aClass84_55.method2148();
			if (local98 < 1100) {
				Static125.aString275 = Static293.aString296 + local98 / 11 + "%";
				Static153.anInt3237 = 50;
			} else {
				Static39.method743(Static73.aClass84_32);
				Static137.method2428(Static73.aClass84_32);
				Static106.method1979(Static73.aClass84_32);
				Static12.method275(Static233.aClass84_105, Static73.aClass84_32);
				Static227.method3806(Static233.aClass84_105, Static291.aClass84_130);
				Static157.method2697(Static233.aClass84_105, Static42.aClass84_19);
				Static29.method633(Static234.aClass2_Sub3_Sub5_Sub1_2, Static197.aClass84_83, Static233.aClass84_105);
				Static95.method1826(Static73.aClass84_32);
				Static291.method4821(Static294.aClass84_132, Static150.aClass84_60, Static174.aClass84_72);
				Static195.method3282(Static73.aClass84_32);
				Static295.method4898(Static140.aClass84_57, Static233.aClass84_105);
				Static169.method2901(Static172.aClass84_69);
				Static272.method4554(Static73.aClass84_32);
				Static83.method1593(Static107.aClass84_46, Static88.aClass84_103, Static233.aClass84_105, Static201.aClass84_85);
				Static126.method2255(Static73.aClass84_32);
				Static254.method4115(Static101.aClass84_128);
				Static219.method3701(new Class175(), Static270.aClass84_114, Static180.aClass84_75);
				Static64.method1250(Static270.aClass84_114, Static180.aClass84_75);
				Static112.method2080(Static73.aClass84_32);
				Static134.method2325(Static73.aClass84_32);
				Static213.method3619(Static73.aClass84_32);
				Static176.method3061(Static73.aClass84_32, Static201.aClass84_85);
				Static16.method350(Static73.aClass84_32, Static201.aClass84_85);
				Static153.anInt3237 = 50;
				Static125.aString275 = Static14.aString21;
				Static102.method1926();
				Static8.anInt274 = 80;
			}
		} else if (Static8.anInt274 == 80) {
			local98 = Static222.method3721(Static201.aClass84_85);
			local40 = Static294.method4875();
			if (local98 < local40) {
				Static153.anInt3237 = 60;
				Static125.aString275 = Static55.aString63 + local98 * 100 / local40 + "%";
			} else {
				Static81.method1535(Static201.aClass84_85);
				Static125.aString275 = Static121.aString130;
				Static8.anInt274 = 90;
				Static153.anInt3237 = 60;
			}
		} else if (Static8.anInt274 == 90) {
			if (Static15.aClass84_9.method2137()) {
				@Pc(963) Class127_Sub1 local963 = new Class127_Sub1(Static227.aClass84_104, Static15.aClass84_9, Static201.aClass84_85, 20, !Static126.aBoolean211);
				Static93.method1740(local963);
				if (Static105.anInt2269 == 1) {
					Static93.method1743(0.9F);
				}
				if (Static105.anInt2269 == 2) {
					Static93.method1743(0.8F);
				}
				if (Static105.anInt2269 == 3) {
					Static93.method1743(0.7F);
				}
				if (Static105.anInt2269 == 4) {
					Static93.method1743(0.6F);
				}
				Static8.anInt274 = 100;
				Static153.anInt3237 = 70;
				Static125.aString275 = Static47.aString54;
			} else {
				Static125.aString275 = Static230.aString191 + Static15.aClass84_9.method2148() + "%";
				Static153.anInt3237 = 70;
			}
		} else if (Static8.anInt274 == 100) {
			if (Static281.method4667(Static201.aClass84_85)) {
				Static8.anInt274 = 110;
			}
		} else if (Static8.anInt274 == 110) {
			Static113.aClass54_1 = new Class54();
			Static299.aClass177_5.method4678(Static113.aClass54_1, 10);
			Static153.anInt3237 = 75;
			Static125.aString275 = Static162.aString165;
			Static8.anInt274 = 120;
		} else if (Static8.anInt274 == 120) {
			if (Static42.aClass84_20.method2133("", "huffman")) {
				@Pc(1066) Class124 local1066 = new Class124(Static42.aClass84_20.method2142("huffman", ""));
				Static92.method1718(local1066);
				Static125.aString275 = Static5.aString7;
				Static153.anInt3237 = 80;
				Static8.anInt274 = 130;
			} else {
				Static125.aString275 = Static37.aString46 + "0%";
				Static153.anInt3237 = 80;
			}
		} else if (Static8.anInt274 == 130) {
			if (!Static88.aClass84_103.method2137()) {
				Static125.aString275 = Static100.aString112 + Static88.aClass84_103.method2148() * 3 / 4 + "%";
				Static153.anInt3237 = 85;
			} else if (!Static171.aClass84_68.method2137()) {
				Static125.aString275 = Static100.aString112 + (Static171.aClass84_68.method2148() / 10 + 75) + "%";
				Static153.anInt3237 = 85;
			} else if (!Static107.aClass84_46.method2137()) {
				Static125.aString275 = Static100.aString112 + (Static107.aClass84_46.method2148() / 20 + 85) + "%";
				Static153.anInt3237 = 85;
			} else if (Static164.aClass84_65.method2117("details")) {
				Static183.method3140(Static164.aClass84_65, Static58.aClass2_Sub3_Sub1_Sub1Array1);
				Static204.method3427(Static233.aClass84_105);
				Static8.anInt274 = 135;
				Static125.aString275 = Static267.aString204;
				Static153.anInt3237 = 95;
			} else {
				Static125.aString275 = Static100.aString112 + (Static164.aClass84_65.method2135("details") / 10 + 90) + "%";
				Static153.anInt3237 = 85;
			}
		} else if (Static8.anInt274 == 135) {
			local98 = Static199.method3362();
			if (local98 == -1) {
				Static153.anInt3237 = 95;
				Static125.aString275 = Static142.aString147;
			} else if (local98 == 7 || local98 == 9) {
				this.method691("worldlistfull");
				Static21.method453(1000);
			} else if (Static145.aBoolean256) {
				Static125.aString275 = Static17.aString25;
				Static153.anInt3237 = 96;
				Static8.anInt274 = 140;
			} else {
				this.method691("worldlistio_" + local98);
				Static21.method453(1000);
			}
		} else if (Static8.anInt274 == 140) {
			Static57.anInt1998 = Static88.aClass84_103.method2121("loginscreen");
			Static11.aClass84_8.method2131(false);
			Static152.aClass84_61.method2131(true);
			Static201.aClass84_85.method2131(true);
			Static107.aClass84_46.method2131(true);
			Static42.aClass84_20.method2131(true);
			Static88.aClass84_103.method2131(true);
			Static72.aBoolean127 = true;
			Static8.anInt274 = 150;
			Static153.anInt3237 = 97;
			Static125.aString275 = Static230.aString192;
		} else if (Static8.anInt274 == 150) {
			Static132.method2291();
			if (Static133.aBoolean220) {
				Static171.anInt3648 = 0;
				Static84.anInt817 = 0;
				Static287.anInt5952 = 0;
				Static2.anInt5946 = 0;
			}
			Static133.aBoolean220 = true;
			Static67.method4884(Static299.aClass177_5);
			Static190.method3495(-1, Static2.anInt5946, false, -1);
			Static153.anInt3237 = 100;
			Static8.anInt274 = 160;
			Static125.aString275 = Static11.aString15;
		} else if (Static8.anInt274 == 160) {
			Static254.method4108(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method699() {
		@Pc(7) boolean local7 = Static139.aClass78_2.method1953();
		if (!local7) {
			this.method703();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method680() {
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method703() {
		if (Static231.anInt4772 < Static139.aClass78_2.anInt2282) {
			Static212.anInt4449 = (Static139.aClass78_2.anInt2282 * 50 - 50) * 5;
			if (Static212.anInt4449 > 3000) {
				Static212.anInt4449 = 3000;
			}
			if (Static205.anInt4279 == Static139.anInt3001) {
				Static205.anInt4279 = Static2.anInt5943;
			} else {
				Static205.anInt4279 = Static139.anInt3001;
			}
			if (Static139.aClass78_2.anInt2282 >= 2 && Static139.aClass78_2.anInt2283 == 6) {
				this.method691("js5connect_outofdate");
				Static236.anInt4804 = 1000;
				return;
			}
			if (Static139.aClass78_2.anInt2282 >= 4 && Static139.aClass78_2.anInt2283 == -1) {
				this.method691("js5crc");
				Static236.anInt4804 = 1000;
				return;
			}
			if (Static139.aClass78_2.anInt2282 >= 4 && (Static236.anInt4804 == 0 || Static236.anInt4804 == 5)) {
				if (Static139.aClass78_2.anInt2283 == 7 || Static139.aClass78_2.anInt2283 == 9) {
					this.method691("js5connect_full");
				} else if (Static139.aClass78_2.anInt2283 > 0) {
					this.method691("js5connect");
				} else {
					this.method691("js5io");
				}
				Static236.anInt4804 = 1000;
				return;
			}
		}
		Static231.anInt4772 = Static139.aClass78_2.anInt2282;
		if (Static212.anInt4449 > 0) {
			Static212.anInt4449--;
			return;
		}
		try {
			if (Static209.anInt1845 == 0) {
				Static58.aClass28_4 = Static299.aClass177_5.method4686(Static205.anInt4279, Static186.aString197);
				Static209.anInt1845++;
			}
			if (Static209.anInt1845 == 1) {
				if (Static58.aClass28_4.anInt726 == 2) {
					this.method694(1000);
					return;
				}
				if (Static58.aClass28_4.anInt726 == 1) {
					Static209.anInt1845++;
				}
			}
			if (Static209.anInt1845 == 2) {
				Static208.aClass45_3 = new Class45((Socket) Static58.aClass28_4.anObject2, Static299.aClass177_5);
				@Pc(187) Class2_Sub26 local187 = new Class2_Sub26(5);
				local187.method4239(15);
				local187.method4260(543);
				Static208.aClass45_3.method1043(5, local187.aByteArray72);
				Static209.anInt1845++;
				Static153.aLong158 = Static6.method126();
			}
			if (Static209.anInt1845 == 3) {
				if (Static236.anInt4804 == 0 || Static236.anInt4804 == 5 || Static208.aClass45_3.method1040() > 0) {
					@Pc(247) int local247 = Static208.aClass45_3.method1047();
					if (local247 != 0) {
						this.method694(local247);
						return;
					}
					Static209.anInt1845++;
				} else if (Static6.method126() - Static153.aLong158 > 30000L) {
					this.method694(1001);
					return;
				}
			}
			if (Static209.anInt1845 == 4) {
				@Pc(282) boolean local282 = Static236.anInt4804 == 5 || Static236.anInt4804 == 10 || Static236.anInt4804 == 28;
				Static139.aClass78_2.method1963(Static208.aClass45_3, !local282);
				Static58.aClass28_4 = null;
				Static208.aClass45_3 = null;
				Static209.anInt1845 = 0;
			}
		} catch (@Pc(299) IOException local299) {
			this.method694(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method689() {
		if (Static236.anInt4804 == 1000) {
			return;
		}
		Static148.anInt3168++;
		if (Static148.anInt3168 % 1000 == 1) {
			@Pc(29) GregorianCalendar local29 = new GregorianCalendar();
			Static176.anInt3788 = local29.get(11) * 600 + local29.get(12) * 10 + local29.get(13) / 6;
			Static169.aRandom1.setSeed((long) Static176.anInt3788);
		}
		this.method699();
		if (Static157.aClass91_1 != null) {
			Static157.aClass91_1.method2257();
		}
		Static155.method4933();
		Static203.method3422();
		Static154.method2677();
		Static153.method2652();
		if (Static60.aBoolean106) {
			Static256.method4128();
		}
		if (Static260.aClass19_1 != null) {
			@Pc(79) int local79 = Static260.aClass19_1.method1066();
			Static205.anInt4276 = local79;
		}
		if (Static236.anInt4804 == 0) {
			this.method697();
			Static192.method3212();
		} else if (Static236.anInt4804 == 5) {
			this.method697();
			Static192.method3212();
		} else if (Static236.anInt4804 == 25 || Static236.anInt4804 == 28) {
			Static18.method410();
		}
		if (Static236.anInt4804 == 10) {
			this.method705();
			Static176.method3060();
			Static114.method1189();
			Static229.method4370();
		} else if (Static236.anInt4804 == 30) {
			Static113.method2088();
		} else if (Static236.anInt4804 == 40) {
			Static229.method4370();
			if (Static231.anInt4770 != -3) {
				if (Static231.anInt4770 == 15) {
					Static261.method4344();
				} else if (Static231.anInt4770 != 2) {
					Static226.method1673();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method705() {
		for (Static263.anInt5394 = 0; Static73.method1366() && Static263.anInt5394 < 128; Static263.anInt5394++) {
			Static196.anIntArray337[Static263.anInt5394] = Static213.anInt4465;
			Static290.anIntArray515[Static263.anInt5394] = Static251.aChar4;
		}
		Static37.anInt906++;
		if (Static17.anInt427 != -1) {
			Static243.method3056(Static17.anInt427, 0, 0, Static20.anInt1235, 0, Static257.anInt5343, 0);
		}
		Static13.anInt334++;
		if (Static60.aBoolean106) {
			label194: for (@Pc(54) int local54 = 0; local54 < 32768; local54++) {
				@Pc(61) Class36_Sub3_Sub1 local61 = Static201.aClass36_Sub3_Sub1Array1[local54];
				if (local61 != null) {
					@Pc(68) byte local68 = local61.aClass33_1.aByte5;
					if ((local68 & 0x2) > 0 && local61.anInt5096 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(91) int local91 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(99) int local99 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local91 != 0 || local99 != 0) {
							local61.aByteArray70[0] = 1;
							local61.anIntArray465[0] = (local61.anInt5093 >> 7) + local91;
							local61.anIntArray468[0] = (local61.anInt5109 >> 7) + local99;
							Static98.aClass52Array1[Static208.anInt4335].method1248(false, local61.anInt5093 >> 7, local61.anInt5109 >> 7, 0, local61.method4097(), local61.method4097(), false);
							if (local61.anIntArray465[0] >= 0 && local61.anIntArray465[0] <= 104 - local61.method4097() && local61.anIntArray468[0] >= 0 && local61.anIntArray468[0] <= 104 - local61.method4097() && Static98.aClass52Array1[Static208.anInt4335].method1247(local61.anInt5109 >> 7, local61.anInt5093 >> 7, local61.anIntArray465[0], local61.anIntArray468[0])) {
								if (local61.method4097() > 1) {
									for (@Pc(228) int local228 = local61.anIntArray465[0]; local228 < local61.anIntArray465[0] + local61.method4097(); local228++) {
										for (@Pc(249) int local249 = local61.anIntArray468[0]; local61.anIntArray468[0] + local61.method4097() > local249; local249++) {
											if ((Static98.aClass52Array1[Static208.anInt4335].anIntArrayArray14[local228][local249] & 0x2401FF) != 0) {
												continue label194;
											}
										}
									}
								}
								local61.anInt5096 = 1;
							}
						}
					}
					Static136.method2416(local61);
					Static212.method3614(local61);
					Static54.method1075(local61);
					Static98.aClass52Array1[Static208.anInt4335].method1253(false, local61.method4097(), local61.anInt5093 >> 7, local61.anInt5109 >> 7, local61.method4097(), false);
				}
			}
		}
		if (!Static60.aBoolean106) {
			Static143.method2541();
		} else if (Static91.anInt2032 == 0 && Static260.anInt5416 == 0) {
			if (Static101.anInt6027 == 2) {
				Static92.method1721();
			} else {
				Static19.method418();
			}
			if (Static271.anInt5632 >> 7 < 14 || Static271.anInt5632 >> 7 >= 90 || Static255.anInt5182 >> 7 < 14 || Static255.anInt5182 >> 7 >= 90) {
				Static199.method3365();
			}
		}
		while (true) {
			@Pc(368) Class2_Sub6 local368;
			@Pc(374) Class115 local374;
			@Pc(383) Class115 local383;
			do {
				local368 = (Class2_Sub6) Static221.aClass1_19.method3();
				if (local368 == null) {
					while (true) {
						do {
							local368 = (Class2_Sub6) Static219.aClass1_17.method3();
							if (local368 == null) {
								while (true) {
									do {
										local368 = (Class2_Sub6) Static225.aClass1_20.method3();
										if (local368 == null) {
											if (Static23.aClass115_3 != null) {
												Static150.method2611();
											}
											if (Static77.aClass28_6 != null && Static77.aClass28_6.anInt726 == 1) {
												if (Static77.aClass28_6.anObject2 != null) {
													Static247.method3966(Static53.aBoolean91, Static192.aString200);
												}
												Static192.aString200 = null;
												Static77.aClass28_6 = null;
												Static53.aBoolean91 = false;
											}
											if (Static148.anInt3168 % 1500 == 0) {
												Static58.method1123();
											}
											return;
										}
										local374 = local368.aClass115_4;
										if (local374.anInt3499 < 0) {
											break;
										}
										local383 = Static90.method1692(local374.anInt3525);
									} while (local383 == null || local383.aClass115Array1 == null || local374.anInt3499 >= local383.aClass115Array1.length || local374 != local383.aClass115Array1[local374.anInt3499]);
									Static73.method1363(local368);
								}
							}
							local374 = local368.aClass115_4;
							if (local374.anInt3499 < 0) {
								break;
							}
							local383 = Static90.method1692(local374.anInt3525);
						} while (local383 == null || local383.aClass115Array1 == null || local374.anInt3499 >= local383.aClass115Array1.length || local374 != local383.aClass115Array1[local374.anInt3499]);
						Static73.method1363(local368);
					}
				}
				local374 = local368.aClass115_4;
				if (local374.anInt3499 < 0) {
					break;
				}
				local383 = Static90.method1692(local374.anInt3525);
			} while (local383 == null || local383.aClass115Array1 == null || local374.anInt3499 >= local383.aClass115Array1.length || local374 != local383.aClass115Array1[local374.anInt3499]);
			Static73.method1363(local368);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method679() {
		if (Static60.aBoolean106) {
			Static60.method1162();
		}
		if (Static8.aFrame1 != null) {
			Static42.method829(Static8.aFrame1, Static299.aClass177_5);
			Static8.aFrame1 = null;
		}
		if (Static299.aClass177_5 != null) {
			Static299.aClass177_5.method4681(this.getClass());
		}
		if (Static113.aClass54_1 != null) {
			Static113.aClass54_1.aBoolean125 = false;
		}
		Static113.aClass54_1 = null;
		if (Static42.aClass45_1 != null) {
			Static42.aClass45_1.method1045();
			Static42.aClass45_1 = null;
		}
		Static299.method2234(Static105.aCanvas1);
		Static171.method2954(Static105.aCanvas1);
		if (Static260.aClass19_1 != null) {
			Static260.aClass19_1.method1060(Static105.aCanvas1);
		}
		Static145.method2559();
		Static50.method1010();
		Static260.aClass19_1 = null;
		if (Static107.aClass3_2 != null) {
			Static107.aClass3_2.method2225();
		}
		if (Static68.aClass3_1 != null) {
			Static68.aClass3_1.method2225();
		}
		Static139.aClass78_2.method1959();
		Static249.aClass12_3.method312();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method692() {
		if (Static236.anInt4804 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static8.method244() / 1000000L - Static165.aLong180;
		Static165.aLong180 = Static8.method244() / 1000000L;
		@Pc(26) boolean local26 = Static96.method1834();
		if (local26 && Static145.aBoolean257 && Static107.aClass3_2 != null) {
			Static107.aClass3_2.method2240();
		}
		if ((Static236.anInt4804 == 30 || Static236.anInt4804 == 10) && (Static52.aBoolean89 || Static89.aLong100 != 0L && Static89.aLong100 < Static6.method126())) {
			Static190.method3495(Static163.anInt3419, Static293.method4858(), Static52.aBoolean89, Static267.anInt4121);
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static8.aFrame1 == null) {
			@Pc(74) Container local74;
			if (Static8.aFrame1 != null) {
				local74 = Static8.aFrame1;
			} else if (Static298.aFrame3 == null) {
				local74 = Static299.aClass177_5.anApplet1;
			} else {
				local74 = Static298.aFrame3;
			}
			local90 = local74.getSize().width;
			local94 = local74.getSize().height;
			if (local74 == Static298.aFrame3) {
				@Pc(101) Insets local101 = Static298.aFrame3.getInsets();
				local90 -= local101.right + local101.left;
				local94 -= local101.top + local101.bottom;
			}
			if (Static7.anInt240 != local90 || local94 != Static112.anInt2423) {
				if (Static282.aString285.startsWith("mac")) {
					Static112.anInt2423 = local94;
					Static7.anInt240 = local90;
				} else {
					Static72.method1335();
				}
				Static89.aLong100 = Static6.method126() + 500L;
			}
		}
		if (Static8.aFrame1 != null && !Static283.aBoolean474 && (Static236.anInt4804 == 30 || Static236.anInt4804 == 10)) {
			Static190.method3495(-1, Static2.anInt5946, false, -1);
		}
		@Pc(168) boolean local168 = false;
		if (Static248.aBoolean415) {
			Static248.aBoolean415 = false;
			local168 = true;
		}
		if (local168) {
			Static241.method3944();
		}
		if (Static60.aBoolean106) {
			for (local90 = 0; local90 < 100; local90++) {
				Static165.aBooleanArray16[local90] = true;
			}
		}
		if (Static236.anInt4804 == 0) {
			Static151.method2615(Static153.anInt3237, null, local168, Static125.aString275);
		} else if (Static236.anInt4804 == 5) {
			Static231.method3884(false, Static153.aClass2_Sub3_Sub5_1);
		} else if (Static236.anInt4804 == 10) {
			Static148.method2599();
		} else if (Static236.anInt4804 == 25 || Static236.anInt4804 == 28) {
			if (Static44.anInt1074 == 1) {
				if (Static281.anInt5834 < Static268.anInt5542) {
					Static281.anInt5834 = Static268.anInt5542;
				}
				local90 = (Static281.anInt5834 - Static268.anInt5542) * 50 / Static281.anInt5834;
				Static264.method4420(false, Static245.aString256 + "<br>(" + local90 + "%)");
			} else if (Static44.anInt1074 == 2) {
				if (Static148.anInt3167 > Static34.anInt1964) {
					Static34.anInt1964 = Static148.anInt3167;
				}
				local90 = (Static34.anInt1964 - Static148.anInt3167) * 50 / Static34.anInt1964 + 50;
				Static264.method4420(false, Static245.aString256 + "<br>(" + local90 + "%)");
			} else {
				Static264.method4420(false, Static245.aString256);
			}
		} else if (Static236.anInt4804 == 30) {
			Static288.method4795(local18);
		} else if (Static236.anInt4804 == 40) {
			Static264.method4420(false, Static246.aString247 + "<br>" + Static217.aString228);
		}
		if (Static60.aBoolean106 && Static236.anInt4804 != 0) {
			Static60.method1165();
			for (local90 = 0; local90 < Static231.anInt4776; local90++) {
				Static90.aBooleanArray9[local90] = false;
			}
		} else {
			@Pc(380) Graphics local380;
			if ((Static236.anInt4804 == 30 || Static236.anInt4804 == 10) && Static219.anInt4589 == 0 && !local168) {
				try {
					local380 = Static105.aCanvas1.getGraphics();
					for (local94 = 0; local94 < Static231.anInt4776; local94++) {
						if (Static90.aBooleanArray9[local94]) {
							Static170.aClass14_1.method1190(Static113.anIntArray166[local94], Static295.anIntArray526[local94], Static264.anIntArray483[local94], local380, Static12.anIntArray14[local94]);
							Static90.aBooleanArray9[local94] = false;
						}
					}
				} catch (@Pc(441) Exception local441) {
					Static105.aCanvas1.repaint();
				}
			} else if (Static236.anInt4804 != 0) {
				try {
					local380 = Static105.aCanvas1.getGraphics();
					Static170.aClass14_1.method1194(local380);
					for (local94 = 0; local94 < Static231.anInt4776; local94++) {
						Static90.aBooleanArray9[local94] = false;
					}
				} catch (@Pc(400) Exception local400) {
					Static105.aCanvas1.repaint();
				}
			}
		}
		if (Static72.aBoolean127) {
			Static22.method289();
		}
		if (Static133.aBoolean220 && Static236.anInt4804 == 10 && Static17.anInt427 != -1) {
			Static133.aBoolean220 = false;
			Static67.method4884(Static299.aClass177_5);
		}
	}
}
