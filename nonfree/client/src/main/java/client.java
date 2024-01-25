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
				Static320.method4946("argument count");
			}
			Static63.anInt1245 = Integer.parseInt(arg0[0]);
			Static91.aClass143_12 = Static186.aClass143_28;
			if (arg0[1].equals("live")) {
				Static249.aClass75_2 = Static276.aClass75_3;
			} else if (arg0[1].equals("rc")) {
				Static249.aClass75_2 = Static315.aClass75_4;
			} else if (arg0[1].equals("wip")) {
				Static249.aClass75_2 = Static228.aClass75_1;
			} else {
				Static320.method4946("modewhat");
			}
			Static189.anInt5185 = Static80.method1433(arg0[2]);
			if (Static189.anInt5185 == -1) {
				if (arg0[2].equals("english")) {
					Static189.anInt5185 = 0;
				} else if (arg0[2].equals("german")) {
					Static189.anInt5185 = 1;
				} else {
					Static320.method4946("language");
				}
			}
			Static374.aBoolean489 = false;
			Static214.aBoolean295 = false;
			if (arg0[3].equals("game0")) {
				Static209.aClass48_2 = Static311.aClass48_3;
			} else if (arg0[3].equals("game1")) {
				Static209.aClass48_2 = Static77.aClass48_1;
			} else {
				Static320.method4946("game");
			}
			Static277.anInt2677 = 0;
			Static196.anInt3591 = Static209.aClass48_2.anInt1208;
			Static358.aBoolean467 = true;
			Static118.aBoolean180 = true;
			Static324.anInt5683 = 0;
			Static209.aString33 = "";
			@Pc(126) client local126 = new client();
			Static384.aClient1 = local126;
			local126.method877(Static249.aClass75_2.method1779() + 32, Static209.aClass48_2.aString8);
			Static154.aFrame1.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static235.method3843(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method879() {
		@Pc(7) boolean local7 = Static93.aClass23_1.method643();
		if (!local7) {
			this.method892();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method863() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static341.method5231();
		Static244.aClass70_2 = new Class70(Static92.aClass53_2);
		Static93.aClass23_1 = new Class23();
		if (Static249.aClass75_2 != Static276.aClass75_3) {
			Static109.aByteArrayArray8 = new byte[50][];
		}
		Static371.method5581(Static92.aClass53_2);
		if (Static91.aClass143_12 == Static337.aClass143_27) {
			Static203.aString31 = this.getCodeBase().getHost();
			Static225.anInt4150 = 443;
			Static314.anInt5577 = 43594;
		} else if (Static295.method4663(Static91.aClass143_12)) {
			Static203.aString31 = this.getCodeBase().getHost();
			Static314.anInt5577 = Static63.anInt1245 + 40000;
			Static225.anInt4150 = Static63.anInt1245 + 50000;
		} else if (Static91.aClass143_12 == Static186.aClass143_28) {
			Static314.anInt5577 = Static63.anInt1245 + 40000;
			Static203.aString31 = "127.0.0.1";
			Static225.anInt4150 = Static63.anInt1245 + 50000;
		}
		Static329.aString57 = Static203.aString31;
		Static109.anInt2177 = Static314.anInt5577;
		Static230.anInt4259 = Static225.anInt4150;
		Static33.anInt704 = Static314.anInt5577;
		if (Static77.aClass48_1 == Static209.aClass48_2) {
			Static16.anInt401 = 16777215;
			Static125.anInt2377 = 0;
			Static298.aShortArray94 = Static183.aShortArray64;
			Static4.aShortArray1 = Static277.aShortArray54;
			Static40.aShortArrayArray48 = Static45.aShortArrayArray19;
			Static250.aShortArrayArray34 = Static211.aShortArrayArray28;
			Static251.aBoolean337 = true;
		} else {
			Static40.aShortArrayArray48 = Static370.aShortArrayArray47;
			Static4.aShortArray1 = Static216.aShortArray84;
			Static250.aShortArrayArray34 = Static120.aShortArrayArray15;
			Static298.aShortArray94 = Static106.aShortArray39;
		}
		if (Static65.anInt1255 == 3) {
			Static259.anInt4618 = Static63.anInt1245;
		}
		Static225.anInt4195 = Static109.anInt2177;
		Static243.aShortArray87 = Static216.aShortArray85 = Static25.aShortArray14 = Static255.aShortArray38 = new short[256];
		Static129.aClass149_1 = Static126.method2269(Static170.aCanvas4);
		Static138.aClass78_1 = Static63.method1164(Static170.aCanvas4);
		Static30.aClass93_1 = Static355.method5386();
		if (Static30.aClass93_1 != null) {
			Static30.aClass93_1.method5588(Static170.aCanvas4);
		}
		Static209.anInt3866 = Static65.anInt1255;
		try {
			if (Static92.aClass53_2.aClass202_2 != null) {
				Static176.aClass20_4 = new Class20(Static92.aClass53_2.aClass202_2, 5200, 0);
				for (@Pc(165) int local165 = 0; local165 < 29; local165++) {
					Static343.aClass20Array1[local165] = new Class20(Static92.aClass53_2.aClass202Array1[local165], 6000, 0);
				}
				Static386.aClass20_3 = new Class20(Static92.aClass53_2.aClass202_4, 6000, 0);
				Static78.aClass161_1 = new Class161(255, Static176.aClass20_4, Static386.aClass20_3, 500000);
				Static16.aClass20_1 = new Class20(Static92.aClass53_2.aClass202_3, 24, 0);
				Static92.aClass53_2.aClass202_3 = null;
				Static92.aClass53_2.aClass202_2 = null;
				Static92.aClass53_2.aClass202_4 = null;
				Static92.aClass53_2.aClass202Array1 = null;
			}
		} catch (@Pc(223) IOException local223) {
			Static16.aClass20_1 = null;
			Static386.aClass20_3 = null;
			Static176.aClass20_4 = null;
			Static78.aClass161_1 = null;
		}
		if (Static91.aClass143_12 != Static337.aClass143_27) {
			Static340.aBoolean454 = true;
		}
		Static389.aString64 = (Static311.aClass48_3 == Static209.aClass48_2 ? Static269.aClass221_168 : Static329.aClass221_202).method5229(Static189.anInt5185);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method883() {
		@Pc(5) int local5;
		if (!Static117.aBoolean178) {
			for (local5 = 0; local5 < Static267.anInt4715; local5++) {
				if (Static93.aClass15Array1[local5].method3593() == 's' || Static93.aClass15Array1[local5].method3593() == 'S') {
					Static117.aBoolean178 = true;
					break;
				}
			}
		}
		@Pc(52) int local52;
		if (Static195.anInt3560 == 0) {
			@Pc(43) Runtime local43 = Runtime.getRuntime();
			local52 = (int) ((local43.totalMemory() - local43.freeMemory()) / 1024L);
			@Pc(55) long local55 = Static51.method979();
			if (Static236.aLong142 == 0L) {
				Static236.aLong142 = local55;
			}
			if (local52 > 16384 && local55 - Static236.aLong142 < 5000L) {
				if (local55 - Static334.aLong181 > 1000L) {
					System.gc();
					Static334.aLong181 = local55;
				}
				Static68.aString16 = Static17.aClass221_14.method5229(Static189.anInt5185);
				Static368.anInt6425 = 5;
			} else {
				Static68.aString16 = Static263.aClass221_163.method5229(Static189.anInt5185);
				Static195.anInt3560 = 10;
				Static368.anInt6425 = 5;
			}
		} else if (Static195.anInt3560 == 10) {
			for (local5 = 0; local5 < 4; local5++) {
				Static190.aClass239Array1[local5] = Static84.method1486(Static392.anInt6751, Static307.anInt5484);
			}
			Static68.aString16 = Static158.aClass221_106.method5229(Static189.anInt5185);
			Static195.anInt3560 = 20;
			Static368.anInt6425 = 10;
		} else if (Static195.anInt3560 == 20) {
			if (Static344.aClass83_9 == null) {
				Static344.aClass83_9 = new Class83(Static93.aClass23_1, Static244.aClass70_2);
			}
			if (Static344.aClass83_9.method2075()) {
				Static64.aClass71_17 = Static58.method4850(0, false, true);
				Static323.aClass71_74 = Static58.method4850(1, false, true);
				Static262.aClass71_41 = Static58.method4850(2, false, true);
				Static237.aClass71_58 = Static58.method4850(3, false, true);
				Static14.aClass71_1 = Static58.method4850(4, false, true);
				Static200.aClass71_48 = Static58.method4850(5, true, true);
				Static161.aClass71_37 = Static58.method4850(6, true, false);
				Static278.aClass71_20 = Static58.method4850(7, false, true);
				Static119.aClass71_25 = Static58.method4850(8, false, true);
				Static122.aClass71_27 = Static58.method4850(9, false, true);
				Static121.aClass71_26 = Static58.method4850(10, false, true);
				Static209.aClass71_50 = Static58.method4850(11, false, true);
				Static15.aClass71_2 = Static58.method4850(12, false, true);
				Static382.aClass71_89 = Static58.method4850(13, false, true);
				Static226.aClass71_55 = Static58.method4850(14, false, false);
				Static140.aClass71_80 = Static58.method4850(15, false, true);
				Static330.aClass71_79 = Static58.method4850(16, false, true);
				Static38.aClass71_11 = Static58.method4850(17, false, true);
				Static187.aClass71_45 = Static58.method4850(18, false, true);
				Static193.aClass71_90 = Static58.method4850(19, false, true);
				Static136.aClass71_28 = Static58.method4850(20, false, true);
				Static143.aClass71_32 = Static58.method4850(21, false, true);
				Static149.aClass71_34 = Static58.method4850(22, false, true);
				Static71.aClass71_18 = Static58.method4850(23, true, true);
				Static251.aClass71_60 = Static58.method4850(24, false, true);
				Static342.aClass71_83 = Static58.method4850(25, false, true);
				Static323.aClass71_75 = Static58.method4850(26, true, true);
				Static22.aClass71_9 = Static58.method4850(27, false, true);
				Static280.aClass71_67 = Static58.method4850(28, true, true);
				Static68.aString16 = Static25.aClass221_22.method5229(Static189.anInt5185);
				Static368.anInt6425 = 15;
				Static195.anInt3560 = 30;
			} else {
				Static68.aString16 = Static120.aClass221_88.method5229(Static189.anInt5185);
				Static368.anInt6425 = 12;
			}
		} else {
			@Pc(379) int local379;
			if (Static195.anInt3560 == 30) {
				local52 = 0;
				for (local379 = 0; local379 < 29; local379++) {
					local52 += Static148.aClass106_Sub1Array2[local379].method3060() * Static54.anIntArray148[local379] / 100;
				}
				if (local52 == 100) {
					Static68.aString16 = Static233.aClass221_147.method5229(Static189.anInt5185);
					Static368.anInt6425 = 20;
					Static125.method2259(Static119.aClass71_25);
					Static347.method5297(Static119.aClass71_25);
					Static195.anInt3560 = 40;
				} else {
					if (local52 != 0) {
						Static68.aString16 = Static116.aClass221_85.method5229(Static189.anInt5185) + local52 + "%";
					}
					Static368.anInt6425 = 20;
				}
			} else if (Static195.anInt3560 == 40) {
				if (Static280.aClass71_67.method1565()) {
					this.method889(Static280.aClass71_67.method1564(1));
					Static68.aString16 = Static290.aClass221_176.method5229(Static189.anInt5185);
					Static195.anInt3560 = 50;
					Static368.anInt6425 = 25;
				} else {
					Static68.aString16 = Static172.aClass221_113.method5229(Static189.anInt5185) + Static280.aClass71_67.method1571() + "%";
					Static368.anInt6425 = 25;
				}
			} else if (Static195.anInt3560 == 50) {
				Static225.method3766(Static265.aBoolean343);
				Static228.aClass2_Sub2_Sub3_2 = new Class2_Sub2_Sub3();
				Static228.aClass2_Sub2_Sub3_2.method3417();
				Static124.aClass45_3 = Static126.method2267(Static170.aCanvas4, 22050, 0, Static92.aClass53_2);
				Static124.aClass45_3.method3363(Static228.aClass2_Sub2_Sub3_2);
				Static240.method3888(Static226.aClass71_55, Static228.aClass2_Sub2_Sub3_2, Static14.aClass71_1, Static140.aClass71_80);
				Static267.aClass45_2 = Static126.method2267(Static170.aCanvas4, 2048, 1, Static92.aClass53_2);
				Static339.aClass2_Sub2_Sub1_2 = new Class2_Sub2_Sub1();
				Static267.aClass45_2.method3363(Static339.aClass2_Sub2_Sub1_2);
				Static154.aClass76_1 = new Class76(22050, Static221.anInt4100);
				Static166.anInt2973 = Static161.aClass71_37.method1568("scape main");
				Static68.aString16 = Static124.aClass221_231.method5229(Static189.anInt5185);
				Static195.anInt3560 = 60;
				Static368.anInt6425 = 30;
			} else if (Static195.anInt3560 == 60) {
				local52 = Static390.method5736(Static119.aClass71_25, Static382.aClass71_89);
				local379 = Static195.method3259();
				if (local52 < local379) {
					Static68.aString16 = Static66.aClass221_185.method5229(Static189.anInt5185) + local52 * 100 / local379 + "%";
					Static368.anInt6425 = 35;
				} else {
					Static68.aString16 = Static335.aClass221_206.method5229(Static189.anInt5185);
					Static368.anInt6425 = 35;
					Static195.anInt3560 = 70;
				}
			} else if (Static195.anInt3560 == 70) {
				local52 = Static230.method3803(Static119.aClass71_25);
				local379 = Static50.method976();
				if (local52 < local379) {
					Static68.aString16 = Static17.aClass221_13.method5229(Static189.anInt5185) + local52 * 100 / local379 + "%";
					Static368.anInt6425 = 40;
				} else {
					Static68.aString16 = Static4.aClass221_8.method5229(Static189.anInt5185);
					Static195.anInt3560 = 80;
					Static368.anInt6425 = 40;
				}
			} else if (Static195.anInt3560 == 80) {
				if (Static323.aClass71_75.method1565()) {
					Static356.anInterface1_7 = new Class130(Static323.aClass71_75, Static122.aClass71_27, Static119.aClass71_25);
					Static68.aString16 = Static62.aClass221_41.method5229(Static189.anInt5185);
					Static368.anInt6425 = 45;
					Static195.anInt3560 = 90;
				} else {
					Static68.aString16 = Static2.aClass221_128.method5229(Static189.anInt5185) + Static323.aClass71_75.method1571() + "%";
					Static368.anInt6425 = 45;
				}
			} else if (Static195.anInt3560 == 90) {
				Static68.aString16 = Static254.aClass221_160.method5229(Static189.anInt5185);
				Static368.anInt6425 = 50;
				Static195.anInt3560 = 95;
			} else if (Static195.anInt3560 == 95) {
				if (Static117.aBoolean178) {
					Static1.anInt41 = 0;
					Static34.anInt734 = 0;
					Static301.anInt5429 = 0;
					Static193.anInt6668 = 0;
					Static365.anInt2296 = 1;
				}
				Static117.aBoolean178 = true;
				Static30.method724(Static92.aClass53_2);
				Static135.method2370(false, Static193.anInt6668);
				Static68.aString16 = Static281.aClass221_172.method5229(Static189.anInt5185);
				Static195.anInt3560 = 100;
				Static368.anInt6425 = 55;
			} else if (Static195.anInt3560 == 100) {
				Static163.method2691(Static304.aClass82_4, Static382.aClass71_89, Static119.aClass71_25);
				Static68.aString16 = Static345.aClass221_216.method5229(Static189.anInt5185);
				Static368.anInt6425 = 60;
				Static345.method5253(5);
				Static195.anInt3560 = 110;
			} else if (Static195.anInt3560 == 110) {
				Static262.aClass71_41.method1565();
				local52 = Static262.aClass71_41.method1571();
				Static330.aClass71_79.method1565();
				local52 += Static330.aClass71_79.method1571();
				Static38.aClass71_11.method1565();
				local52 += Static38.aClass71_11.method1571();
				Static187.aClass71_45.method1565();
				local52 += Static187.aClass71_45.method1571();
				Static193.aClass71_90.method1565();
				local52 += Static193.aClass71_90.method1571();
				Static136.aClass71_28.method1565();
				local52 += Static136.aClass71_28.method1571();
				Static143.aClass71_32.method1565();
				local52 += Static143.aClass71_32.method1571();
				Static149.aClass71_34.method1565();
				local52 += Static149.aClass71_34.method1571();
				Static251.aClass71_60.method1565();
				local52 += Static251.aClass71_60.method1571();
				Static342.aClass71_83.method1565();
				local52 += Static342.aClass71_83.method1571();
				Static22.aClass71_9.method1565();
				local52 += Static22.aClass71_9.method1571();
				if (local52 < 1100) {
					Static68.aString16 = Static35.aClass221_29.method5229(Static189.anInt5185) + local52 / 11 + "%";
					Static368.anInt6425 = 65;
				} else {
					Static82.aClass184_1 = new Class184(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static225.aClass47_1 = new Class47(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static391.aClass194_2 = new Class194(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41, Static119.aClass71_25);
					Static290.aClass105_1 = new Class105(Static209.aClass48_2, Static189.anInt5185, Static38.aClass71_11);
					Static236.aClass246_5 = new Class246(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static67.aClass108_3 = new Class108(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static8.aClass40_1 = new Class40(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41, Static278.aClass71_20);
					Static161.aClass185_1 = new Class185(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static336.aClass156_1 = new Class156(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static11.aClass123_5 = new Class123(Static209.aClass48_2, Static189.anInt5185, true, Static330.aClass71_79, Static278.aClass71_20);
					Static240.aClass211_4 = new Class211(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41, Static119.aClass71_25);
					Static201.aClass181_6 = new Class181(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41, Static119.aClass71_25);
					Static274.aClass151_4 = new Class151(Static209.aClass48_2, Static189.anInt5185, true, Static187.aClass71_45, Static278.aClass71_20);
					Static106.aClass250_1 = new Class250(Static209.aClass48_2, Static189.anInt5185, true, Static82.aClass184_1, Static193.aClass71_90, Static278.aClass71_20);
					Static284.aClass249_1 = new Class249(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static351.aClass175_3 = new Class175(Static209.aClass48_2, Static189.anInt5185, Static136.aClass71_28, Static64.aClass71_17, Static323.aClass71_74);
					Static189.aClass119_3 = new Class119(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static80.aClass171_1 = new Class171(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static168.aClass74_1 = new Class74(Static209.aClass48_2, Static189.anInt5185, Static143.aClass71_32, Static278.aClass71_20);
					Static283.aClass223_1 = new Class223(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static35.aClass212_1 = new Class212(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static165.aClass172_1 = new Class172(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static130.aClass162_1 = new Class162(Static209.aClass48_2, Static189.anInt5185, Static149.aClass71_34);
					Static235.aClass25_1 = new Class25(Static209.aClass48_2, Static189.anInt5185, Static262.aClass71_41);
					Static120.method2192(Static237.aClass71_58, Static278.aClass71_20, Static119.aClass71_25, Static382.aClass71_89);
					Static110.method2122(Static342.aClass71_83, Static251.aClass71_60, new Class35());
					Static135.method2375(Static342.aClass71_83, Static251.aClass71_60);
					Static68.aString16 = Static313.aClass221_193.method5229(Static189.anInt5185);
					Static368.anInt6425 = 65;
					Static80.method1436();
					Static11.aClass123_5.method2710(!Static43.method900());
					Static248.aClass125_1 = new Class125();
					Static6.method193();
					Static195.anInt3560 = 120;
				}
			} else if (Static195.anInt3560 == 120) {
				local52 = Static313.method4857(Static119.aClass71_25);
				local379 = Static183.method2985();
				if (local379 > local52) {
					Static68.aString16 = Static376.aClass221_234.method5229(Static189.anInt5185) + local52 * 100 / local379 + "%";
					Static368.anInt6425 = 70;
				} else {
					Static283.method4366(Static304.aClass82_4, Static119.aClass71_25);
					Static340.method5227(Static357.aClass5Array2);
					Static68.aString16 = Static197.aClass221_125.method5229(Static189.anInt5185);
					Static195.anInt3560 = 130;
					Static368.anInt6425 = 70;
				}
			} else if (Static195.anInt3560 == 130) {
				Static68.aString16 = Static363.aClass221_209.method5229(Static189.anInt5185);
				Static195.anInt3560 = 140;
				Static368.anInt6425 = 75;
			} else if (Static195.anInt3560 == 140) {
				if (Static121.aClass71_26.method1577("", "huffman")) {
					@Pc(1223) Class60 local1223 = new Class60(Static121.aClass71_26.method1550("", "huffman"));
					Static263.method4091(local1223);
					Static68.aString16 = Static343.aClass221_214.method5229(Static189.anInt5185);
					Static195.anInt3560 = 150;
					Static368.anInt6425 = 80;
				} else {
					Static68.aString16 = Static258.aClass221_139.method5229(Static189.anInt5185) + "0%";
					Static368.anInt6425 = 80;
				}
			} else if (Static195.anInt3560 == 150) {
				if (!Static237.aClass71_58.method1565()) {
					Static68.aString16 = Static305.aClass221_80.method5229(Static189.anInt5185) + Static237.aClass71_58.method1571() * 3 / 4 + "%";
					Static368.anInt6425 = 85;
				} else if (!Static15.aClass71_2.method1565()) {
					Static68.aString16 = Static305.aClass221_80.method5229(Static189.anInt5185) + (Static15.aClass71_2.method1571() / 10 + 75) + "%";
					Static368.anInt6425 = 85;
				} else if (!Static382.aClass71_89.method1565()) {
					Static68.aString16 = Static305.aClass221_80.method5229(Static189.anInt5185) + (Static382.aClass71_89.method1571() / 20 + 85) + "%";
					Static368.anInt6425 = 85;
				} else if (Static71.aClass71_18.method1578("details")) {
					Static302.method481(Static71.aClass71_18, Static236.aClass246_5, Static67.aClass108_3, Static11.aClass123_5, Static240.aClass211_4, Static201.aClass181_6, Static248.aClass125_1);
					Static171.method2807(Static22.aClass71_9);
					Static73.method1300(Static356.anInterface1_7, Static278.aClass71_20);
					Static68.aString16 = Static99.aClass221_75.method5229(Static189.anInt5185);
					Static368.anInt6425 = 85;
					Static195.anInt3560 = 160;
				} else {
					Static68.aString16 = Static305.aClass221_80.method5229(Static189.anInt5185) + (Static71.aClass71_18.method1575("details") / 10 + 90) + "%";
					Static368.anInt6425 = 85;
				}
			} else if (Static195.anInt3560 == 160) {
				local52 = Static373.method5597();
				if (local52 == -1) {
					Static68.aString16 = Static296.aClass221_179.method5229(Static189.anInt5185);
					Static368.anInt6425 = 90;
				} else if (local52 == 7 || local52 == 9) {
					this.method871("worldlistfull");
					Static345.method5253(1000);
				} else if (Static73.aBoolean115) {
					Static68.aString16 = Static26.aClass221_23.method5229(Static189.anInt5185);
					Static368.anInt6425 = 90;
					Static195.anInt3560 = 170;
				} else {
					this.method871("worldlistio_" + local52);
					Static345.method5253(1000);
				}
			} else if (Static195.anInt3560 == 170) {
				Static267.aBooleanArray110 = new boolean[Static165.aClass172_1.anInt4649];
				Static61.anIntArray162 = new int[Static165.aClass172_1.anInt4649];
				Static211.aStringArray22 = new String[Static35.aClass212_1.anInt5774];
				for (local52 = 0; local52 < Static165.aClass172_1.anInt4649; local52++) {
					if (Static165.aClass172_1.method4077(local52).anInt184 == 0) {
						Static267.aBooleanArray110[local52] = true;
						Static249.anInt4494++;
					}
					Static61.anIntArray162[local52] = -1;
				}
				Static100.method1789();
				Static197.anInt3622 = Static237.aClass71_58.method1568("loginscreen");
				Static200.aClass71_48.method1562(false);
				Static161.aClass71_37.method1562(true);
				Static119.aClass71_25.method1562(true);
				Static382.aClass71_89.method1562(true);
				Static121.aClass71_26.method1562(true);
				Static237.aClass71_58.method1562(true);
				Static262.aClass71_41.anInt1745 = 2;
				Static300.aBoolean425 = true;
				Static38.aClass71_11.anInt1745 = 2;
				Static330.aClass71_79.anInt1745 = 2;
				Static187.aClass71_45.anInt1745 = 2;
				Static193.aClass71_90.anInt1745 = 2;
				Static136.aClass71_28.anInt1745 = 2;
				Static143.aClass71_32.anInt1745 = 2;
				Static295.method4662(-1, Static365.anInt2296, false, -1);
				Static68.aString16 = Static266.aClass221_164.method5229(Static189.anInt5185);
				Static195.anInt3560 = 180;
				Static368.anInt6425 = 95;
			} else if (Static195.anInt3560 == 180) {
				Static204.method3427(true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method885() {
		Static346.anInt6113++;
		Static54.method1042(null, -1, -1);
		Static179.method2925(-1, -1, null);
		Static14.method433();
		Static180.anInt3216++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class12_Sub1_Sub2_Sub1 local33 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass240_1.aByte75;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4706();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt5380 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(94) int local94 = local33.anIntArray659[0] + local74;
							if (local94 < 0) {
								local94 = 0;
							} else if (local94 > Static392.anInt6751 - local50 - 1) {
								local94 = Static392.anInt6751 - local50 - 1;
							}
							@Pc(125) int local125 = local33.anIntArray658[0] + local82;
							if (local125 < 0) {
								local125 = 0;
							} else if (local125 > Static307.anInt5484 - local50 - 1) {
								local125 = Static307.anInt5484 - local50 - 1;
							}
							@Pc(176) int local176 = Static294.method4659(local33.anIntArray658[0], -1, local50, Static190.aClass239Array1[local33.aByte74], local94, local33.anIntArray659[0], true, local50, 0, Static315.anIntArray686, local125, 0, local50, Static360.anIntArray766);
							if (local176 > 0) {
								if (local176 > 9) {
									local176 = 9;
								}
								for (@Pc(188) int local188 = 0; local188 < local176; local188++) {
									local33.anIntArray659[local188] = Static360.anIntArray766[local176 - local188 - 1];
									local33.anIntArray658[local188] = Static315.anIntArray686[local176 - local188 - 1];
									local33.aByteArray84[local188] = 1;
								}
								local33.anInt5380 = local176;
							}
						}
					}
					Static54.method1044(local33, true);
					local74 = Static153.method2579(local33);
					Static211.method3583(Static106.anInt2066, Static253.anInt5659, local74, local33);
					Static351.method1595(local33);
				}
			}
		}
		if (Static251.anInt4517 == 0 && Static289.anInt5127 == 0) {
			if (Static283.anInt5017 == 2) {
				Static170.method2763();
			} else {
				Static144.method2461();
			}
			if (Static160.anInt2915 >> 7 < 14 || Static392.anInt6751 - 14 <= Static160.anInt2915 >> 7 || Static22.anInt547 >> 7 < 14 || Static22.anInt547 >> 7 >= Static307.anInt5484 - 14) {
				Static75.method1342();
			}
		}
		while (true) {
			@Pc(305) Class2_Sub24 local305;
			@Pc(310) Class155 local310;
			@Pc(318) Class155 local318;
			do {
				local305 = (Class2_Sub24) Static194.aClass210_26.method5039();
				if (local305 == null) {
					while (true) {
						do {
							local305 = (Class2_Sub24) Static283.aClass210_34.method5039();
							if (local305 == null) {
								while (true) {
									do {
										local305 = (Class2_Sub24) Static351.aClass210_15.method5039();
										if (local305 == null) {
											if (Static243.aClass155_26 != null) {
												Static384.method5703();
											}
											if (Static295.anInt5281 % 1500 == 0) {
												Static235.method3841();
											}
											Static77.method1395();
											if (Static243.aBoolean331 && Static51.method979() - 60000L > Static317.aLong174) {
												Static367.method5541();
												return;
											}
											return;
										}
										local310 = local305.aClass155_23;
										if (local310.anInt4135 < 0) {
											break;
										}
										local318 = Static240.method3886(local310.anInt4144);
									} while (local318 == null || local318.aClass155Array2 == null || local310.anInt4135 >= local318.aClass155Array2.length || local318.aClass155Array2[local310.anInt4135] != local310);
									Static157.method2604(local305);
								}
							}
							local310 = local305.aClass155_23;
							if (local310.anInt4135 < 0) {
								break;
							}
							local318 = Static240.method3886(local310.anInt4144);
						} while (local318 == null || local318.aClass155Array2 == null || local318.aClass155Array2.length <= local310.anInt4135 || local318.aClass155Array2[local310.anInt4135] != local310);
						Static157.method2604(local305);
					}
				}
				local310 = local305.aClass155_23;
				if (local310.anInt4135 < 0) {
					break;
				}
				local318 = Static240.method3886(local310.anInt4144);
			} while (local318 == null || local318.aClass155Array2 == null || local318.aClass155Array2.length <= local310.anInt4135 || local318.aClass155Array2[local310.anInt4135] != local310);
			Static157.method2604(local305);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method876() {
		if (Static344.anInt6327 == 1000) {
			return;
		}
		@Pc(23) long local23 = Static99.method1784() / 1000000L - Static153.aLong95;
		Static153.aLong95 = Static99.method1784() / 1000000L;
		@Pc(31) boolean local31 = Static108.method2081();
		if (local31 && Static327.aBoolean445 && Static124.aClass45_3 != null) {
			Static124.aClass45_3.method3366();
		}
		if (Static344.anInt6327 == 30 || Static344.anInt6327 == 10) {
			if (Static144.aLong84 != 0L && Static144.aLong84 < Static51.method979()) {
				Static295.method4662(Static11.anInt3910, Static238.method3868(), false, Static123.anInt2360);
			} else if (Static304.aClass82_4.method4550() && Static97.aBoolean150) {
				Static215.method3636();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static363.aFrame4 == null) {
			@Pc(80) Container local80;
			if (Static154.aFrame1 == null) {
				local80 = Static92.aClass53_2.anApplet1;
			} else {
				local80 = Static154.aFrame1;
			}
			local88 = local80.getSize().width;
			local92 = local80.getSize().height;
			if (Static154.aFrame1 == local80) {
				@Pc(98) Insets local98 = Static154.aFrame1.getInsets();
				local88 -= local98.right + local98.left;
				local92 -= local98.top + local98.bottom;
			}
			if (local88 != Static269.anInt4774 || Static388.anInt4032 != local92) {
				if (Static304.aClass82_4 == null || Static304.aClass82_4.method4551()) {
					Static341.method5231();
				} else {
					Static388.anInt4032 = local92;
					Static269.anInt4774 = local88;
				}
				Static144.aLong84 = Static51.method979() + 500L;
			}
		}
		if (Static363.aFrame4 != null && !Static144.aBoolean199 && (Static344.anInt6327 == 30 || Static344.anInt6327 == 10)) {
			Static295.method4662(-1, Static365.anInt2296, false, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static186.aBoolean473) {
			Static186.aBoolean473 = false;
			local169 = true;
		}
		if (local169) {
			Static353.method5355();
		}
		if (Static304.aClass82_4 != null && Static304.aClass82_4.method4554() || Static238.method3868() != 1) {
			Static303.method4753();
		}
		if (Static344.anInt6327 == 0) {
			Static17.method495(Static368.anInt6425, Static194.aColorArray2[Static196.anInt3591], Static43.aColorArray1[Static196.anInt3591], local169, Static238.aColorArray3[Static196.anInt3591], Static68.aString16);
		} else if (Static344.anInt6327 == 5) {
			Static79.method1416(Static194.aColorArray2[Static196.anInt3591].getRGB(), local169 | Static304.aClass82_4.method4554(), Static304.aClass82_4, Static43.aColorArray1[Static196.anInt3591].getRGB(), Static34.aClass13_1, Static238.aColorArray3[Static196.anInt3591].getRGB());
		} else if (Static344.anInt6327 == 10) {
			Static184.method5424();
		} else if (Static344.anInt6327 == 25 || Static344.anInt6327 == 28) {
			if (Static235.anInt4313 == 1) {
				if (Static251.anInt4519 < Static297.anInt5974) {
					Static251.anInt4519 = Static297.anInt5974;
				}
				local88 = (Static251.anInt4519 - Static297.anInt5974) * 50 / Static251.anInt4519;
				Static104.method1846(Static246.aClass13_4, Static303.aClass221_182.method5229(Static189.anInt5185) + "<br>(" + local88 + "%)", true);
			} else if (Static235.anInt4313 == 2) {
				if (Static171.anInt3057 > Static272.anInt4881) {
					Static272.anInt4881 = Static171.anInt3057;
				}
				local88 = (Static272.anInt4881 - Static171.anInt3057) * 50 / Static272.anInt4881 + 50;
				Static104.method1846(Static246.aClass13_4, Static303.aClass221_182.method5229(Static189.anInt5185) + "<br>(" + local88 + "%)", true);
			} else {
				Static104.method1846(Static246.aClass13_4, Static303.aClass221_182.method5229(Static189.anInt5185), true);
			}
		} else if (Static344.anInt6327 == 30) {
			Static212.method3597(local23);
		} else if (Static344.anInt6327 == 40) {
			Static104.method1846(Static246.aClass13_4, Static321.aClass221_200.method5229(Static189.anInt5185) + "<br>" + Static355.aClass221_226.method5229(Static189.anInt5185), true);
		}
		if (Static102.anInt2004 == 3) {
			for (local88 = 0; local88 < Static318.anInt4651; local88++) {
				@Pc(394) Rectangle local394 = Class2.aRectangleArray120[local88];
				if (Static5.aBooleanArray148[local88]) {
					Static304.aClass82_4.method4486(local394.height, local394.width, local394.x, -1996553985, local394.y);
				} else if (Static185.aBooleanArray73[local88]) {
					Static304.aClass82_4.method4486(local394.height, local394.width, local394.x, -1996554240, local394.y);
				}
			}
		}
		if (Static136.method2377()) {
			Static212.method3596(Static304.aClass82_4);
		}
		if ((Static344.anInt6327 == 30 || Static344.anInt6327 == 10) && Static102.anInt2004 == 0 && Static238.method3868() == 1 && !local169 && Static65.aString9.equals("1.1")) {
			local88 = 0;
			for (local92 = 0; local92 < Static318.anInt4651; local92++) {
				if (Static185.aBooleanArray73[local92]) {
					Static185.aBooleanArray73[local92] = false;
					Static209.aRectangleArray69[local88++] = Class2.aRectangleArray120[local92];
				}
			}
			Static304.aClass82_4.method4536(Static209.aRectangleArray69, local88);
		} else if (Static344.anInt6327 != 0) {
			Static304.aClass82_4.method4461();
			for (local88 = 0; local88 < Static318.anInt4651; local88++) {
				Static185.aBooleanArray73[local88] = false;
			}
		}
		if (Static244.anInt1013 == 0) {
			Static185.method3004(15L);
		} else if (Static244.anInt1013 == 1) {
			Static185.method3004(10L);
		} else if (Static244.anInt1013 == 2) {
			Static185.method3004(5L);
		} else if (Static244.anInt1013 == 3) {
			Static185.method3004(2L);
		}
		if (Static300.aBoolean425) {
			Static76.method1390();
		}
		if (Static117.aBoolean178 && Static344.anInt6327 == 10 && Static226.anInt4223 != -1) {
			Static117.aBoolean178 = false;
			Static30.method724(Static92.aClass53_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method887(@OriginalArg(1) int arg0) {
		Static93.aClass23_1.anInt568++;
		Static93.aClass23_1.anInt569 = arg0;
		Static370.aClass124_4 = null;
		Static135.anInt2531 = 0;
		Static94.aClass1_7 = null;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method868() {
		if (Static344.anInt6327 == 1000) {
			return;
		}
		Static295.anInt5281++;
		if (Static295.anInt5281 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static222.anInt4113 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static50.aRandom1.setSeed((long) Static222.anInt4113);
		}
		if (Static295.anInt5281 % 50 == 0) {
			Static291.anInt5149 = Static333.anInt5834;
			Static333.anInt5834 = 0;
			Static259.anInt4616 = Static200.anInt3681;
			Static200.anInt3681 = 0;
		}
		this.method879();
		if (Static344.aClass83_9 != null) {
			Static344.aClass83_9.method2078();
		}
		Static223.method3750();
		Static209.method3549();
		Static129.aClass149_1.method3684();
		Static138.aClass78_1.method1807();
		if (Static30.aClass93_1 != null) {
			@Pc(86) int local86 = Static30.aClass93_1.method5587();
			Static32.anInt6038 = local86;
		}
		if (Static304.aClass82_4 != null) {
			Static304.aClass82_4.method4517((int) Static51.method979());
		}
		Static54.method1047();
		Static267.anInt4715 = 0;
		for (@Pc(103) Class15 local103 = Static129.aClass149_1.method3683(); local103 != null && Static267.anInt4715 < 128; local103 = Static129.aClass149_1.method3683()) {
			if (local103.method3588() != 1) {
				@Pc(114) char local114 = local103.method3593();
				if (!Static376.method5649() || local114 != '`' && local114 != '§') {
					Static93.aClass15Array1[Static267.anInt4715] = local103;
					Static267.anInt4715++;
				} else if (Static136.method2377()) {
					Static332.method5085();
				} else {
					Static52.method3369();
				}
			}
		}
		Static345.aClass2_Sub10_1 = null;
		for (@Pc(163) Class2_Sub10 local163 = Static138.aClass78_1.method1812(); local163 != null; local163 = Static138.aClass78_1.method1812()) {
			@Pc(169) int local169 = local163.method1120();
			if (local169 == -1) {
				Static272.aClass210_33.method5044(local163);
			} else if (Static369.method5551(local169)) {
				Static345.aClass2_Sub10_1 = local163;
			}
		}
		if (Static136.method2377()) {
			Static215.method3629();
		}
		if (Static344.anInt6327 == 0) {
			this.method883();
			Static384.method5704();
		} else if (Static344.anInt6327 == 5) {
			this.method883();
			Static384.method5704();
		} else if (Static344.anInt6327 == 25 || Static344.anInt6327 == 28) {
			Static305.method2101();
		}
		if (Static344.anInt6327 == 10) {
			this.method885();
			Static125.method2257();
			Static333.method5093();
			Static374.method5601();
		} else if (Static344.anInt6327 == 30) {
			Static334.method5112();
		} else if (Static344.anInt6327 == 40) {
			Static374.method5601();
			if (Static217.anInt4042 != -3 && Static217.anInt4042 != 2 && Static217.anInt4042 != 15) {
				Static321.method4949();
			}
		}
		Static74.method3660(Static304.aClass82_4);
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method874()) {
			return;
		}
		Static63.anInt1245 = Integer.parseInt(this.getParameter("worldid"));
		Static91.aClass143_12 = Static67.method1240(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static295.method4663(Static91.aClass143_12) && Static91.aClass143_12 != Static337.aClass143_27) {
			Static91.aClass143_12 = Static337.aClass143_27;
		}
		Static249.aClass75_2 = Static153.method2576(Integer.parseInt(this.getParameter("modewhat")));
		if (Static228.aClass75_1 != Static249.aClass75_2 && Static315.aClass75_4 != Static249.aClass75_2 && Static249.aClass75_2 != Static276.aClass75_3) {
			Static249.aClass75_2 = Static276.aClass75_3;
		}
		try {
			Static189.anInt5185 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static189.anInt5185 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static214.aBoolean295 = true;
		} else {
			Static214.aBoolean295 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static374.aBoolean489 = true;
		} else {
			Static374.aBoolean489 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static275.aBoolean349 = true;
		} else {
			Static275.aBoolean349 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static209.aClass48_2 = Static77.aClass48_1;
		} else {
			Static209.aClass48_2 = Static311.aClass48_3;
		}
		try {
			Static277.anInt2677 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static277.anInt2677 = 0;
		}
		Static17.aString2 = this.getParameter("quiturl");
		Static209.aString33 = this.getParameter("settings");
		if (Static209.aString33 == null) {
			Static209.aString33 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static324.anInt5683 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static324.anInt5683 = 0;
			}
		}
		Static196.anInt3591 = Integer.parseInt(this.getParameter("colourid"));
		if (Static196.anInt3591 < 0 || Static196.anInt3591 >= Static43.aColorArray1.length) {
			Static196.anInt3591 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static358.aBoolean467 = true;
			Static118.aBoolean180 = true;
		}
		Static384.aClient1 = this;
		if (Static209.aClass48_2 == Static311.aClass48_3) {
			Static15.anInt364 = 503;
			Static155.anInt2779 = 765;
		} else if (Static209.aClass48_2 == Static77.aClass48_1) {
			Static15.anInt364 = 480;
			Static155.anInt2779 = 640;
		}
		this.method866(Static249.aClass75_2.method1779() + 32, Static15.anInt364, Static155.anInt2779);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method889(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(19) int local19 = local10.method4240();
					if (local19 == 0) {
						return;
					}
					if (local19 == 1) {
						@Pc(116) int[] local116 = Static145.anIntArray301 = new int[6];
						local116[0] = local10.method4245();
						local116[1] = local10.method4245();
						local116[2] = local10.method4245();
						local116[3] = local10.method4245();
						local116[4] = local10.method4245();
						local116[5] = local10.method4245();
					} else {
						@Pc(43) int local43;
						@Pc(38) int local38;
						if (local19 == 4) {
							local38 = local10.method4240();
							Static252.anIntArray561 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static252.anIntArray561[local43] = local10.method4245();
								if (Static252.anIntArray561[local43] == 65535) {
									Static252.anIntArray561[local43] = -1;
								}
							}
						} else if (local19 == 5) {
							local38 = local10.method4240();
							Static191.anIntArray379 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static191.anIntArray379[local43] = local10.method4245();
								if (Static191.anIntArray379[local43] == 65535) {
									Static191.anIntArray379[local43] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method875() {
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method892() {
		if (Static93.aClass23_1.anInt568 > Static362.anInt6401) {
			Static100.anInt1966 = (Static93.aClass23_1.anInt568 * 50 - 50) * 5;
			if (Static225.anInt4195 == Static33.anInt704) {
				Static225.anInt4195 = Static230.anInt4259;
			} else {
				Static225.anInt4195 = Static33.anInt704;
			}
			if (Static100.anInt1966 > 3000) {
				Static100.anInt1966 = 3000;
			}
			if (Static93.aClass23_1.anInt568 >= 2 && Static93.aClass23_1.anInt569 == 6) {
				this.method871("js5connect_outofdate");
				Static344.anInt6327 = 1000;
				return;
			}
			if (Static93.aClass23_1.anInt568 >= 4 && Static93.aClass23_1.anInt569 == -1) {
				this.method871("js5crc");
				Static344.anInt6327 = 1000;
				return;
			}
			if (Static93.aClass23_1.anInt568 >= 4 && (Static344.anInt6327 == 0 || Static344.anInt6327 == 5)) {
				if (Static93.aClass23_1.anInt569 == 7 || Static93.aClass23_1.anInt569 == 9) {
					this.method871("js5connect_full");
				} else if (Static93.aClass23_1.anInt569 > 0) {
					this.method871("js5connect");
				} else {
					this.method871("js5io");
				}
				Static344.anInt6327 = 1000;
				return;
			}
		}
		Static362.anInt6401 = Static93.aClass23_1.anInt568;
		if (Static100.anInt1966 > 0) {
			Static100.anInt1966--;
			return;
		}
		try {
			if (Static135.anInt2531 == 0) {
				Static94.aClass1_7 = Static92.aClass53_2.method1179(Static329.aString57, Static225.anInt4195);
				Static135.anInt2531++;
			}
			if (Static135.anInt2531 == 1) {
				if (Static94.aClass1_7.anInt2 == 2) {
					this.method887(1000);
					return;
				}
				if (Static94.aClass1_7.anInt2 == 1) {
					Static135.anInt2531++;
				}
			}
			if (Static135.anInt2531 == 2) {
				Static370.aClass124_4 = new Class124((Socket) Static94.aClass1_7.anObject1, Static92.aClass53_2);
				@Pc(176) Class2_Sub13 local176 = new Class2_Sub13(5);
				local176.method4207(Static74.aClass101_12.anInt2534);
				local176.method4218(572);
				Static370.aClass124_4.method2717(5, local176.aByteArray77);
				Static135.anInt2531++;
				Static384.aLong207 = Static51.method979();
			}
			if (Static135.anInt2531 == 3) {
				if (Static344.anInt6327 == 0 || Static344.anInt6327 == 5 || Static370.aClass124_4.method2716() > 0) {
					@Pc(228) int local228 = Static370.aClass124_4.method2712();
					if (local228 != 0) {
						this.method887(local228);
						return;
					}
					Static135.anInt2531++;
				} else if (Static51.method979() - Static384.aLong207 > 30000L) {
					this.method887(1001);
					return;
				}
			}
			if (Static135.anInt2531 == 4) {
				@Pc(276) boolean local276 = Static344.anInt6327 == 5 || Static344.anInt6327 == 10 || Static344.anInt6327 == 28;
				Static93.aClass23_1.method634(!local276, Static370.aClass124_4);
				Static135.anInt2531 = 0;
				Static94.aClass1_7 = null;
				Static370.aClass124_4 = null;
			}
		} catch (@Pc(293) IOException local293) {
			this.method887(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method872() {
		if (Static243.aBoolean331) {
			Static367.method5541();
		}
		if (Static304.aClass82_4 != null) {
			Static304.aClass82_4.method4553();
		}
		if (Static363.aFrame4 != null) {
			Static64.method1167(Static92.aClass53_2, Static363.aFrame4);
			Static363.aFrame4 = null;
		}
		if (Static169.aClass124_3 != null) {
			Static169.aClass124_3.method2714();
			Static169.aClass124_3 = null;
		}
		if (Static30.aClass93_1 != null) {
			Static30.aClass93_1.method5590(Static170.aCanvas4);
		}
		Static30.aClass93_1 = null;
		if (Static124.aClass45_3 != null) {
			Static124.aClass45_3.method3368();
		}
		if (Static267.aClass45_2 != null) {
			Static267.aClass45_2.method3368();
		}
		Static93.aClass23_1.method642();
		Static244.aClass70_2.method1544();
		if (Static237.aClass193_1 != null) {
			Static237.aClass193_1.method4678();
			Static237.aClass193_1 = null;
		}
	}
}
