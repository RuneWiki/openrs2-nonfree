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
				Static41.method735();
			}
			Static9.anInt4432 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static27.anInt645 = 0;
			} else if (arg0[1].equals("office")) {
				Static27.anInt645 = 1;
			} else if (arg0[1].equals("local")) {
				Static27.anInt645 = 2;
			} else {
				Static41.method735();
			}
			if (arg0[2].equals("live")) {
				Static7.anInt183 = 0;
			} else if (arg0[2].equals("rc")) {
				Static7.anInt183 = 1;
			} else if (arg0[2].equals("wip")) {
				Static7.anInt183 = 2;
			} else {
				Static41.method735();
			}
			if (arg0[3].equals("lowmem")) {
				Static207.method3215();
			} else if (arg0[3].equals("highmem")) {
				Static30.method551();
			} else {
				Static41.method735();
			}
			if (arg0[4].equals("free")) {
				Static202.aBoolean238 = false;
			} else if (arg0[4].equals("members")) {
				Static202.aBoolean238 = true;
			} else {
				Static41.method735();
			}
			if (arg0[5].equals("english")) {
				Static209.anInt4478 = 0;
			} else if (arg0[5].equals("german")) {
				Static84.method1043();
				Static209.anInt4478 = 1;
			} else {
				Static41.method735();
			}
			if (arg0[6].equals("game0")) {
				Static156.anInt3468 = 0;
			} else if (arg0[6].equals("game1")) {
				Static156.anInt3468 = 1;
			} else {
				Static41.method735();
			}
			Static4.aClass60_42 = Static149.aClass60_1155;
			Static162.anInt4652 = 0;
			Static178.aString6 = "127.0.0.1";
			@Pc(180) client local180 = new client();
			local180.method577(Static7.anInt183 + 32, "runescape");
			Static99.aFrame1.setLocation(40, 40);
		} catch (@Pc(197) Exception local197) {
			Static131.method2194(null, local197);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method588() {
		@Pc(18) int local18;
		if (Static156.anInt3474 == 0) {
			@Pc(9) Runtime local9 = Runtime.getRuntime();
			local18 = (int) ((local9.totalMemory() - local9.freeMemory()) / 1024L);
			@Pc(21) long local21 = Static3.method57();
			if (Static56.aLong44 == 0L) {
				Static56.aLong44 = local21;
			}
			if (local18 > 16384 && local21 - Static56.aLong44 < 5000L) {
				if (local21 - Static87.aLong61 > 1000L) {
					System.gc();
					Static87.aLong61 = local21;
				}
				Static12.aClass60_97 = Static135.aClass60_1016;
				Static105.anInt2388 = 5;
			} else {
				Static12.aClass60_97 = Static206.aClass60_1504;
				Static105.anInt2388 = 5;
				Static156.anInt3474 = 10;
			}
			return;
		}
		@Pc(73) int local73;
		if (Static156.anInt3474 == 10) {
			Static94.method1627();
			for (local73 = 0; local73 < 4; local73++) {
				Static153.aClass3Array1[local73] = new Class3(104, 104);
			}
			Static156.anInt3474 = 30;
			Static105.anInt2388 = 10;
			Static12.aClass60_97 = Static1.aClass60_25;
		} else if (Static156.anInt3474 == 30) {
			Static72.aClass7_Sub1_16 = Static11.method3528(0, true, true, false);
			Static195.aClass7_Sub1_29 = Static11.method3528(1, true, true, false);
			Static84.aClass7_Sub1_8 = Static11.method3528(2, true, false, true);
			Static62.aClass7_Sub1_10 = Static11.method3528(3, true, true, false);
			Static193.aClass7_Sub1_28 = Static11.method3528(4, true, true, false);
			Static71.aClass7_Sub1_15 = Static11.method3528(5, true, true, true);
			Static106.aClass7_Sub1_19 = Static11.method3528(6, false, true, true);
			Static71.aClass7_Sub1_14 = Static11.method3528(7, true, true, false);
			Static152.aClass7_Sub1_23 = Static11.method3528(8, true, true, false);
			Static56.aClass7_Sub1_9 = Static11.method3528(9, true, true, false);
			Static5.aClass7_Sub1_2 = Static11.method3528(10, true, true, false);
			Static4.aClass7_Sub1_1 = Static11.method3528(11, true, true, false);
			Static21.aClass7_Sub1_3 = Static11.method3528(12, true, true, false);
			Static125.aClass7_Sub1_20 = Static11.method3528(13, true, true, false);
			Static21.aClass7_Sub1_4 = Static11.method3528(14, false, true, false);
			Static71.aClass7_Sub1_13 = Static11.method3528(15, true, true, false);
			Static192.aClass7_Sub1_27 = Static11.method3528(16, true, true, false);
			Static64.aClass7_Sub1_11 = Static11.method3528(17, true, true, false);
			Static151.aClass7_Sub1_22 = Static11.method3528(18, true, true, false);
			Static103.aClass7_Sub1_18 = Static11.method3528(19, true, true, false);
			Static94.aClass7_Sub1_17 = Static11.method3528(20, true, true, false);
			Static26.aClass7_Sub1_5 = Static11.method3528(21, true, true, false);
			Static66.aClass7_Sub1_12 = Static11.method3528(22, true, true, false);
			Static198.aClass7_Sub1_30 = Static11.method3528(23, true, true, true);
			Static159.aClass7_Sub1_25 = Static11.method3528(24, true, true, false);
			Static155.aClass7_Sub1_24 = Static11.method3528(25, true, true, false);
			Static29.aClass7_Sub1_6 = Static11.method3528(26, true, true, true);
			Static105.anInt2388 = 15;
			Static156.anInt3474 = 40;
			Static12.aClass60_97 = Static121.aClass60_893;
		} else if (Static156.anInt3474 == 40) {
			local73 = Static72.aClass7_Sub1_16.method3258() * 4 / 100;
			local73 += Static195.aClass7_Sub1_29.method3258() * 4 / 100;
			local73 += Static84.aClass7_Sub1_8.method3258() / 100;
			local73 += Static62.aClass7_Sub1_10.method3258() * 2 / 100;
			local73 += Static193.aClass7_Sub1_28.method3258() * 6 / 100;
			local73 += Static71.aClass7_Sub1_15.method3258() * 4 / 100;
			local73 += Static106.aClass7_Sub1_19.method3258() * 2 / 100;
			local73 += Static71.aClass7_Sub1_14.method3258() * 50 / 100;
			local73 += Static152.aClass7_Sub1_23.method3258() * 2 / 100;
			local73 += Static56.aClass7_Sub1_9.method3258() * 2 / 100;
			local73 += Static5.aClass7_Sub1_2.method3258() * 2 / 100;
			local73 += Static4.aClass7_Sub1_1.method3258() * 2 / 100;
			local73 += Static21.aClass7_Sub1_3.method3258() * 2 / 100;
			local73 += Static125.aClass7_Sub1_20.method3258() * 2 / 100;
			local73 += Static21.aClass7_Sub1_4.method3258() * 2 / 100;
			local73 += Static71.aClass7_Sub1_13.method3258() * 2 / 100;
			local73 += Static192.aClass7_Sub1_27.method3258() / 100;
			local73 += Static64.aClass7_Sub1_11.method3258() / 100;
			local73 += Static151.aClass7_Sub1_22.method3258() / 100;
			local73 += Static103.aClass7_Sub1_18.method3258() / 100;
			local73 += Static94.aClass7_Sub1_17.method3258() / 100;
			local73 += Static26.aClass7_Sub1_5.method3258() / 100;
			local73 += Static66.aClass7_Sub1_12.method3258() / 100;
			local73 += Static198.aClass7_Sub1_30.method3258() / 100;
			local73 += Static159.aClass7_Sub1_25.method3258() / 100;
			local73 += Static155.aClass7_Sub1_24.method3258() / 100;
			local73 += Static29.aClass7_Sub1_6.method3258() / 100;
			if (local73 == 100) {
				Static12.aClass60_97 = Static186.aClass60_1342;
				Static105.anInt2388 = 20;
				Static91.method1588(Static106.aClass7_Sub1_19, Static5.aClass7_Sub1_2, Static152.aClass7_Sub1_23);
				Static156.anInt3474 = 45;
			} else {
				if (local73 != 0) {
					Static12.aClass60_97 = Static34.method611(new Class60[] { Static68.aClass60_537, Static40.method681(local73), Static38.aClass60_291 });
				}
				Static105.anInt2388 = 20;
			}
		} else if (Static156.anInt3474 == 45) {
			Static194.method3014(!Static148.aBoolean266);
			@Pc(609) Class1_Sub7_Sub3 local609 = new Class1_Sub7_Sub3();
			local609.method3416();
			Static77.aClass15_1 = Static160.method2692(0, 22050, Static116.aClass65_4, Static78.aCanvas1);
			Static77.aClass15_1.method1983(local609);
			Static6.method133(Static71.aClass7_Sub1_13, Static21.aClass7_Sub1_4, Static193.aClass7_Sub1_28, local609);
			Static205.aClass15_2 = Static160.method2692(1, 2048, Static116.aClass65_4, Static78.aCanvas1);
			Static166.aClass1_Sub7_Sub2_2 = new Class1_Sub7_Sub2();
			Static205.aClass15_2.method1983(Static166.aClass1_Sub7_Sub2_2);
			Static139.aClass53_1 = new Class53(22050, Static191.anInt4086);
			Static105.anInt2388 = 30;
			Static12.aClass60_97 = Static129.aClass60_377;
			Static156.anInt3474 = 50;
		} else if (Static156.anInt3474 == 50) {
			local73 = 0;
			if (Static152.aClass7_Sub1_23.method3221(Static152.aClass60_1174)) {
				local73++;
			}
			if (Static152.aClass7_Sub1_23.method3221(Static180.aClass60_1304)) {
				local73++;
			}
			if (Static152.aClass7_Sub1_23.method3221(Static121.aClass60_888)) {
				local73++;
			}
			if (Static125.aClass7_Sub1_20.method3221(Static152.aClass60_1174)) {
				local73++;
			}
			if (Static125.aClass7_Sub1_20.method3221(Static180.aClass60_1304)) {
				local73++;
			}
			if (Static125.aClass7_Sub1_20.method3221(Static121.aClass60_888)) {
				local73++;
			}
			if (local73 < 6) {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static30.aClass60_250, Static40.method681(local73 * 100 / 6), Static38.aClass60_291 });
				Static105.anInt2388 = 35;
			} else {
				Static105.anInt2388 = 35;
				Static156.anInt3474 = 60;
				Static12.aClass60_97 = Static194.aClass60_1401;
			}
		} else if (Static156.anInt3474 == 60) {
			local73 = Static65.method1171(Static5.aClass7_Sub1_2, Static152.aClass7_Sub1_23);
			local18 = Static24.method418();
			if (local73 < local18) {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static149.aClass60_1156, Static40.method681(local73 * 100 / local18), Static38.aClass60_291 });
				Static105.anInt2388 = 40;
			} else {
				Static12.aClass60_97 = Static96.aClass60_730;
				Static105.anInt2388 = 40;
				Static156.anInt3474 = 65;
			}
		} else if (Static156.anInt3474 == 65) {
			Static85.aClass1_Sub1_Sub14_4 = Static115.method1974(Static149.aClass60_1155, Static125.aClass7_Sub1_20, Static152.aClass60_1174, Static152.aClass7_Sub1_23);
			Static211.aClass1_Sub1_Sub14_Sub1_Sub1_6 = (Class1_Sub1_Sub14_Sub1_Sub1) Static85.aClass1_Sub1_Sub14_4;
			Static49.aClass1_Sub1_Sub14_3 = Static115.method1974(Static149.aClass60_1155, Static125.aClass7_Sub1_20, Static180.aClass60_1304, Static152.aClass7_Sub1_23);
			Static176.aClass1_Sub1_Sub14_2 = Static115.method1974(Static149.aClass60_1155, Static125.aClass7_Sub1_20, Static121.aClass60_888, Static152.aClass7_Sub1_23);
			Static12.aClass60_97 = Static77.aClass60_598;
			Static105.anInt2388 = 45;
			Static85.method1486(5);
			Static156.anInt3474 = 70;
		} else if (Static156.anInt3474 == 70) {
			Static84.aClass7_Sub1_8.method3243();
			local73 = Static84.aClass7_Sub1_8.method3234();
			Static192.aClass7_Sub1_27.method3243();
			local73 += Static192.aClass7_Sub1_27.method3234();
			Static64.aClass7_Sub1_11.method3243();
			local73 += Static64.aClass7_Sub1_11.method3234();
			Static151.aClass7_Sub1_22.method3243();
			local73 += Static151.aClass7_Sub1_22.method3234();
			Static103.aClass7_Sub1_18.method3243();
			local73 += Static103.aClass7_Sub1_18.method3234();
			Static94.aClass7_Sub1_17.method3243();
			local73 += Static94.aClass7_Sub1_17.method3234();
			Static26.aClass7_Sub1_5.method3243();
			local73 += Static26.aClass7_Sub1_5.method3234();
			Static66.aClass7_Sub1_12.method3243();
			local73 += Static66.aClass7_Sub1_12.method3234();
			Static159.aClass7_Sub1_25.method3243();
			local73 += Static159.aClass7_Sub1_25.method3234();
			Static155.aClass7_Sub1_24.method3243();
			local73 += Static155.aClass7_Sub1_24.method3234();
			if (local73 < 1000) {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static59.aClass60_465, Static40.method681(local73 / 10), Static38.aClass60_291 });
				Static105.anInt2388 = 50;
			} else {
				Static30.method548(Static84.aClass7_Sub1_8);
				Static178.method2854(Static84.aClass7_Sub1_8);
				Static87.method1516(Static84.aClass7_Sub1_8);
				Static195.method3027(Static84.aClass7_Sub1_8, Static71.aClass7_Sub1_14);
				Static77.method1382(Static148.aBoolean266, Static192.aClass7_Sub1_27, Static71.aClass7_Sub1_14, Static202.aBoolean238);
				Static75.method1349(Static151.aClass7_Sub1_22, Static71.aClass7_Sub1_14);
				Static201.method3122(Static103.aClass7_Sub1_18, Static211.aClass1_Sub1_Sub14_Sub1_Sub1_6, Static202.aBoolean238, Static71.aClass7_Sub1_14);
				Static42.method693(Static84.aClass7_Sub1_8);
				Static211.method2630(Static94.aClass7_Sub1_17, Static195.aClass7_Sub1_29, Static72.aClass7_Sub1_16);
				Static200.method3118(Static26.aClass7_Sub1_5, Static71.aClass7_Sub1_14);
				Static5.method85(Static66.aClass7_Sub1_12);
				Static149.method2557(Static84.aClass7_Sub1_8);
				Static195.method3026(Static125.aClass7_Sub1_20, Static152.aClass7_Sub1_23, Static62.aClass7_Sub1_10, Static71.aClass7_Sub1_14);
				Static133.method2215(Static84.aClass7_Sub1_8);
				Static35.method623(Static64.aClass7_Sub1_11);
				Static25.method428(new Class71(), Static159.aClass7_Sub1_25, Static155.aClass7_Sub1_24);
				Static56.method1065(Static155.aClass7_Sub1_24, Static159.aClass7_Sub1_25);
				Static105.anInt2388 = 50;
				Static12.aClass60_97 = Static12.aClass60_105;
				Static181.method2862();
				Static156.anInt3474 = 80;
			}
		} else if (Static156.anInt3474 == 80) {
			local73 = 0;
			if (Static128.aClass1_Sub1_Sub6_3 == null) {
				@Pc(1066) Class1_Sub1_Sub6_Sub1 local1066 = Static92.method1616(Static6.aClass60_63, Static152.aClass7_Sub1_23, Static149.aClass60_1155);
				if (local1066 != null) {
					local1066.method2171();
					Static128.aClass1_Sub1_Sub6_3 = local1066;
				}
			} else {
				local73++;
			}
			if (Static137.aClass73_Sub1Array3 == null) {
				Static137.aClass73_Sub1Array3 = Static213.method3331(Static149.aClass60_1155, Static152.aClass7_Sub1_23, Static139.aClass60_1092);
			} else {
				local73++;
			}
			if (Static1.aClass1_Sub1_Sub6_Sub1Array1 == null) {
				Static1.aClass1_Sub1_Sub6_Sub1Array1 = Static177.method2833(Static70.aClass60_546, Static152.aClass7_Sub1_23, Static149.aClass60_1155);
			} else {
				local73++;
			}
			if (Static52.aClass1_Sub1_Sub6Array2 == null) {
				Static52.aClass1_Sub1_Sub6Array2 = Static74.method1344(Static149.aClass60_1155, Static32.aClass60_268, Static152.aClass7_Sub1_23);
			} else {
				local73++;
			}
			if (Static63.aClass1_Sub1_Sub6Array4 == null) {
				Static63.aClass1_Sub1_Sub6Array4 = Static74.method1344(Static149.aClass60_1155, Static201.aClass60_1469, Static152.aClass7_Sub1_23);
			} else {
				local73++;
			}
			if (Static52.aClass1_Sub1_Sub6Array3 == null) {
				Static52.aClass1_Sub1_Sub6Array3 = Static74.method1344(Static149.aClass60_1155, Static51.aClass60_396, Static152.aClass7_Sub1_23);
			} else {
				local73++;
			}
			if (Static122.aClass1_Sub1_Sub6Array7 == null) {
				Static122.aClass1_Sub1_Sub6Array7 = Static74.method1344(Static149.aClass60_1155, Static99.aClass60_741, Static152.aClass7_Sub1_23);
			} else {
				local73++;
			}
			if (Static168.aClass1_Sub1_Sub6Array10 == null) {
				Static168.aClass1_Sub1_Sub6Array10 = Static74.method1344(Static149.aClass60_1155, Static1.aClass60_22, Static152.aClass7_Sub1_23);
			} else {
				local73++;
			}
			@Pc(1161) int local1161;
			if (Static157.aClass1_Sub1_Sub6Array9 == null) {
				@Pc(1157) Class1_Sub1_Sub6_Sub1[] local1157 = Static177.method2833(Static135.aClass60_1013, Static152.aClass7_Sub1_23, Static149.aClass60_1155);
				if (local1157 != null) {
					for (local1161 = 0; local1161 < local1157.length; local1161++) {
						local1157[local1161].method2171();
					}
					Static157.aClass1_Sub1_Sub6Array9 = local1157;
				}
			} else {
				local73++;
			}
			if (Static94.aClass1_Sub1_Sub6_2 == null) {
				Static94.aClass1_Sub1_Sub6_2 = Static191.method2991(Static152.aClass7_Sub1_23, Static149.aClass60_1155, Static45.aClass60_343);
			} else {
				local73++;
			}
			if (Static83.aClass1_Sub1_Sub6Array5 == null) {
				Static83.aClass1_Sub1_Sub6Array5 = Static74.method1344(Static149.aClass60_1155, Static133.aClass60_996, Static152.aClass7_Sub1_23);
			} else {
				local73++;
			}
			if (Static43.aClass1_Sub1_Sub6Array1 == null) {
				Static43.aClass1_Sub1_Sub6Array1 = Static74.method1344(Static149.aClass60_1155, Static187.aClass60_1348, Static152.aClass7_Sub1_23);
			} else {
				local73++;
			}
			if (Static130.aClass73Array6 == null) {
				Static130.aClass73Array6 = Static64.method1160(Static152.aClass7_Sub1_23, Static28.aClass60_979, Static149.aClass60_1155);
			} else {
				local73++;
			}
			if (Static108.aClass73Array4 == null) {
				Static108.aClass73Array4 = Static64.method1160(Static152.aClass7_Sub1_23, Static52.aClass60_415, Static149.aClass60_1155);
			} else {
				local73++;
			}
			local73++;
			if (local73 < 15) {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static38.aClass60_293, Static40.method681(local73 * 100 / 15), Static38.aClass60_291 });
				Static105.anInt2388 = 60;
			} else {
				Static85.aClass1_Sub1_Sub14_4.method3310(Static108.aClass73Array4, null);
				local1161 = (int) (Math.random() * 21.0D) - 10;
				Static49.aClass1_Sub1_Sub14_3.method3310(Static108.aClass73Array4, null);
				Static176.aClass1_Sub1_Sub14_2.method3310(Static108.aClass73Array4, null);
				@Pc(1288) int local1288 = (int) (Math.random() * 41.0D) - 20;
				@Pc(1295) int local1295 = (int) (Math.random() * 21.0D) - 10;
				local18 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1304) int local1304 = 0; local1304 < Static1.aClass1_Sub1_Sub6_Sub1Array1.length; local1304++) {
					Static1.aClass1_Sub1_Sub6_Sub1Array1[local1304].method2178(local18 + local1288, local1288 + local1161, local1288 + local1295);
				}
				Static137.aClass73_Sub1Array3[0].method2276(local1288 + local18, local1161 + local1288, local1288 + local1295);
				Static12.aClass60_97 = Static29.aClass60_242;
				Static156.anInt3474 = 90;
				Static111.aClass1_Sub1_Sub6Array6 = Static1.aClass1_Sub1_Sub6_Sub1Array1;
				Static105.anInt2388 = 60;
			}
		} else if (Static156.anInt3474 == 90) {
			if (Static29.aClass7_Sub1_6.method3243()) {
				@Pc(1386) Class40 local1386 = new Class40(Static56.aClass7_Sub1_9, Static29.aClass7_Sub1_6, Static152.aClass7_Sub1_23, 20, Static148.aBoolean266);
				Static81.method1442(local1386);
				Static81.method1432(0.7F);
				Static156.anInt3474 = 110;
				Static12.aClass60_97 = Static54.aClass60_441;
				Static105.anInt2388 = 70;
			} else {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static113.aClass60_850, Static40.method681(Static29.aClass7_Sub1_6.method3234()), Static38.aClass60_291 });
				Static105.anInt2388 = 70;
			}
		} else if (Static156.anInt3474 == 110) {
			Static180.aClass17_1 = new Class17();
			Static116.aClass65_4.method2005(10, Static180.aClass17_1);
			Static105.anInt2388 = 75;
			Static156.anInt3474 = 120;
			Static12.aClass60_97 = Static152.aClass60_1178;
		} else if (Static156.anInt3474 == 120) {
			if (Static5.aClass7_Sub1_2.method3230(Static149.aClass60_1155, Static184.aClass60_1333)) {
				@Pc(1455) Class101 local1455 = new Class101(Static5.aClass7_Sub1_2.method3245(Static149.aClass60_1155, Static184.aClass60_1333));
				Static130.method2188(local1455);
				Static156.anInt3474 = 130;
				Static105.anInt2388 = 80;
				Static12.aClass60_97 = Static219.aClass60_1645;
			} else {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static193.aClass60_1391, Static196.aClass60_1421 });
				Static105.anInt2388 = 80;
			}
		} else if (Static156.anInt3474 == 130) {
			if (!Static62.aClass7_Sub1_10.method3243()) {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static25.aClass60_190, Static40.method681(Static62.aClass7_Sub1_10.method3234() * 4 / 5), Static38.aClass60_291 });
				Static105.anInt2388 = 85;
			} else if (!Static21.aClass7_Sub1_3.method3243()) {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static25.aClass60_190, Static40.method681(Static21.aClass7_Sub1_3.method3234() / 6 + 80), Static38.aClass60_291 });
				Static105.anInt2388 = 85;
			} else if (Static125.aClass7_Sub1_20.method3243()) {
				Static105.anInt2388 = 100;
				Static156.anInt3474 = 140;
				Static12.aClass60_97 = Static210.aClass60_1327;
			} else {
				Static12.aClass60_97 = Static34.method611(new Class60[] { Static25.aClass60_190, Static40.method681(Static125.aClass7_Sub1_20.method3234() / 20 + 96), Static38.aClass60_291 });
				Static105.anInt2388 = 85;
			}
		} else if (Static156.anInt3474 == 140) {
			Static71.aClass7_Sub1_15.method3223(false);
			Static106.aClass7_Sub1_19.method3223(true);
			Static152.aClass7_Sub1_23.method3223(true);
			Static125.aClass7_Sub1_20.method3223(true);
			Static5.aClass7_Sub1_2.method3223(true);
			Static62.aClass7_Sub1_10.method3223(true);
			Static85.method1486(10);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method591() {
		if (Static134.anInt2902 != 1000) {
			@Pc(10) boolean local10 = Static157.method2657();
			if (!local10) {
				this.method595();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method584() {
		if (Static156.anInt3468 == 1) {
			Static116.aShortArrayArray5 = Static219.aShortArrayArray8;
			Static10.aShortArray3 = Static96.aShortArray25;
			Static190.aShortArrayArray7 = Static138.aShortArrayArray6;
			Static103.aShortArray31 = Static64.aShortArray22;
		} else {
			Static116.aShortArrayArray5 = Static10.aShortArrayArray3;
			Static103.aShortArray31 = Static146.aShortArray48;
			Static190.aShortArrayArray7 = Static61.aShortArrayArray4;
			Static10.aShortArray3 = Static54.aShortArray16;
		}
		Static103.aShortArray32 = Static61.aShortArray17 = Static170.aShortArray49 = Static6.aShortArray1 = new short[256];
		Static34.anInt831 = Static27.anInt645 == 0 ? 43594 : Static9.anInt4432 + 40000;
		Static40.anInt898 = Static34.anInt831;
		Static162.anInt4654 = Static27.anInt645 == 0 ? 443 : Static9.anInt4432 + 50000;
		Static149.method2553();
		Static214.method3357(Static78.aCanvas1);
		Static179.method3057(Static78.aCanvas1);
		Static207.aClass24_1 = Static202.method3134();
		if (Static207.aClass24_1 != null) {
			Static207.aClass24_1.method736(Static78.aCanvas1);
		}
		Static17.anInt439 = Static119.anInt2665;
		try {
			if (Static116.aClass65_4.aClass59_2 != null) {
				Static114.aClass66_2 = new Class66(Static116.aClass65_4.aClass59_2, 5200, 0);
				for (@Pc(90) int local90 = 0; local90 < 27; local90++) {
					Static15.aClass66Array1[local90] = new Class66(Static116.aClass65_4.aClass59Array1[local90], 6000, 0);
				}
				Static135.aClass66_3 = new Class66(Static116.aClass65_4.aClass59_3, 6000, 0);
				Static6.aClass90_1 = new Class90(255, Static114.aClass66_2, Static135.aClass66_3, 500000);
				Static80.aClass66_1 = new Class66(Static116.aClass65_4.aClass59_1, 24, 0);
				Static116.aClass65_4.aClass59Array1 = null;
				Static116.aClass65_4.aClass59_1 = null;
				Static116.aClass65_4.aClass59_2 = null;
				Static116.aClass65_4.aClass59_3 = null;
			}
		} catch (@Pc(152) IOException local152) {
			Static114.aClass66_2 = null;
			Static135.aClass66_3 = null;
			Static80.aClass66_1 = null;
			Static6.aClass90_1 = null;
		}
		Static42.aClass60_316 = Static5.aClass60_43;
		if (Static27.anInt645 != 0) {
			Static9.aBoolean249 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method592(@OriginalArg(0) int arg0) {
		if (Static40.anInt898 == Static34.anInt831) {
			Static40.anInt898 = Static162.anInt4654;
		} else {
			Static40.anInt898 = Static34.anInt831;
		}
		Static206.anInt4383 = 0;
		Static35.aClass55_1 = null;
		Static182.aClass36_8 = null;
		Static75.anInt1836++;
		if (Static75.anInt1836 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static134.anInt2902 <= 5) {
				this.method571("js5connect_full");
				Static134.anInt2902 = 1000;
			} else {
				Static203.anInt4323 = 3000;
			}
		} else if (Static75.anInt1836 >= 2 && arg0 == 6) {
			this.method571("js5connect_outofdate");
			Static134.anInt2902 = 1000;
		} else if (Static75.anInt1836 >= 4) {
			if (Static134.anInt2902 > 5) {
				Static203.anInt4323 = 3000;
			} else {
				this.method571("js5connect");
				Static134.anInt2902 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method586() {
		@Pc(8) boolean local8 = Static1.method29();
		if (local8 && Static105.aBoolean134 && Static77.aClass15_1 != null) {
			Static77.aClass15_1.method1997();
		}
		@Pc(19) boolean local19 = false;
		if (Static50.aBoolean100) {
			local19 = true;
			Static50.aBoolean100 = false;
		}
		if (Static134.anInt2902 == 0) {
			Static181.method2865(local19, Static105.anInt2388, Static12.aClass60_97, null);
		} else if (Static134.anInt2902 == 5 || Static134.anInt2902 == 10 || Static134.anInt2902 == 20) {
			Static3.method55(Static176.aClass1_Sub1_Sub14_2, Static85.aClass1_Sub1_Sub14_4);
		} else if (Static134.anInt2902 == 25) {
			@Pc(118) int local118;
			if (Static21.anInt493 == 1) {
				if (Static78.anInt1882 > Static37.anInt862) {
					Static37.anInt862 = Static78.anInt1882;
				}
				local118 = (Static37.anInt862 - Static78.anInt1882) * 50 / Static37.anInt862;
				Static199.method3114(Static34.method611(new Class60[] { Static56.aClass60_449, Static2.aClass60_30, Static40.method681(local118), Static163.aClass60_1233 }), false);
			} else if (Static21.anInt493 == 2) {
				if (Static3.anInt70 > Static189.anInt4072) {
					Static189.anInt4072 = Static3.anInt70;
				}
				local118 = (Static189.anInt4072 - Static3.anInt70) * 50 / Static189.anInt4072 + 50;
				Static199.method3114(Static34.method611(new Class60[] { Static56.aClass60_449, Static2.aClass60_30, Static40.method681(local118), Static163.aClass60_1233 }), false);
			} else {
				Static199.method3114(Static56.aClass60_449, false);
			}
		} else if (Static134.anInt2902 == 30) {
			Static128.method2140();
		} else if (Static134.anInt2902 == 40) {
			Static199.method3114(Static34.method611(new Class60[] { Static100.aClass60_755, Static201.aClass60_1465, Static40.aClass60_309 }), false);
		}
		@Pc(196) Canvas local196 = Static78.aCanvas1;
		@Pc(212) Graphics local212;
		@Pc(214) int local214;
		if (Static134.anInt2902 == 30 && Static84.anInt1466 == 0 && !local19) {
			try {
				local212 = local196.getGraphics();
				for (local214 = 0; local214 < Static124.anInt2763; local214++) {
					if (Static47.aBooleanArray4[local214]) {
						Static21.aClass5_1.method1980(Static34.anIntArray123[local214], Static1.anIntArray9[local214], Static6.anIntArray20[local214], Static91.anIntArray252[local214], local212);
						Static47.aBooleanArray4[local214] = false;
					}
				}
			} catch (@Pc(246) Exception local246) {
				local196.repaint();
			}
		} else if (Static134.anInt2902 > 0) {
			try {
				local212 = local196.getGraphics();
				Static21.aClass5_1.method1976(local212);
				for (local214 = 0; local214 < Static124.anInt2763; local214++) {
					Static47.aBooleanArray4[local214] = false;
				}
			} catch (@Pc(278) Exception local278) {
				local196.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method579() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method573()) {
			return;
		}
		Static9.anInt4432 = Integer.parseInt(this.getParameter("worldid"));
		Static7.anInt183 = Integer.parseInt(this.getParameter("modewhat"));
		Static27.anInt645 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static207.method3215();
		} else {
			Static30.method551();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static202.aBoolean238 = true;
		} else {
			Static202.aBoolean238 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static84.method1043();
			Static209.anInt4478 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static156.anInt3468 = 1;
		} else {
			Static156.anInt3468 = 0;
		}
		try {
			Static102.anInt2347 = Integer.parseInt(this.getParameter("js"));
			Static128.anInt2810 = Integer.parseInt(this.getParameter("plug"));
			Static162.anInt4652 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static4.aClass60_42 = Static22.aClass60_172.method1804(this);
		if (Static4.aClass60_42 == null) {
			Static4.aClass60_42 = Static149.aClass60_1155;
		}
		Static178.aString6 = this.getCodeBase().getHost();
		this.method583(Static7.anInt183 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method595() {
		if (Static1.anInt39 >= 4) {
			this.method571("js5crc");
			Static134.anInt2902 = 1000;
			return;
		}
		if (Static4.anInt104 >= 4) {
			if (Static134.anInt2902 <= 5) {
				this.method571("js5io");
				Static134.anInt2902 = 1000;
				return;
			}
			Static203.anInt4323 = 3000;
			Static4.anInt104 = 3;
		}
		if (Static203.anInt4323-- > 0) {
			return;
		}
		try {
			if (Static206.anInt4383 == 0) {
				Static182.aClass36_8 = Static116.aClass65_4.method2009(Static40.anInt898, Static178.aString6);
				Static206.anInt4383++;
			}
			if (Static206.anInt4383 == 1) {
				if (Static182.aClass36_8.anInt1500 == 2) {
					this.method592(-1);
					return;
				}
				if (Static182.aClass36_8.anInt1500 == 1) {
					Static206.anInt4383++;
				}
			}
			if (Static206.anInt4383 == 2) {
				Static35.aClass55_1 = new Class55((Socket) Static182.aClass36_8.anObject2, Static116.aClass65_4);
				@Pc(104) Class1_Sub9 local104 = new Class1_Sub9(5);
				local104.method899(15);
				local104.method921(499);
				Static35.aClass55_1.method1756(local104.aByteArray20, 5);
				Static206.anInt4383++;
				Static49.aLong41 = Static3.method57();
			}
			if (Static206.anInt4383 == 3) {
				if (Static134.anInt2902 <= 5 || Static35.aClass55_1.method1757() > 0) {
					@Pc(160) int local160 = Static35.aClass55_1.method1753();
					if (local160 != 0) {
						this.method592(local160);
						return;
					}
					Static206.anInt4383++;
				} else if (Static3.method57() - Static49.aLong41 > 30000L) {
					this.method592(-2);
					return;
				}
			}
			if (Static206.anInt4383 == 4) {
				Static115.method1972(Static35.aClass55_1, Static134.anInt2902 > 20);
				Static75.anInt1836 = 0;
				Static35.aClass55_1 = null;
				Static206.anInt4383 = 0;
				Static182.aClass36_8 = null;
			}
		} catch (@Pc(198) IOException local198) {
			this.method592(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method580() {
		if (Static180.aClass17_1 != null) {
			Static180.aClass17_1.aBoolean52 = false;
		}
		Static180.aClass17_1 = null;
		if (Static184.aClass55_3 != null) {
			Static184.aClass55_3.method1754();
			Static184.aClass55_3 = null;
		}
		Static159.method2685(Static78.aCanvas1);
		Static73.method1318(Static78.aCanvas1);
		if (Static207.aClass24_1 != null) {
			Static207.aClass24_1.method733(Static78.aCanvas1);
		}
		Static80.method1429();
		Static103.method1761();
		Static207.aClass24_1 = null;
		if (Static77.aClass15_1 != null) {
			Static77.aClass15_1.method1986();
		}
		if (Static205.aClass15_2 != null) {
			Static205.aClass15_2.method1986();
		}
		Static112.method1925();
		Static201.method3123();
		try {
			if (Static114.aClass66_2 != null) {
				Static114.aClass66_2.method2034();
			}
			if (Static15.aClass66Array1 != null) {
				for (@Pc(64) int local64 = 0; local64 < Static15.aClass66Array1.length; local64++) {
					if (Static15.aClass66Array1[local64] != null) {
						Static15.aClass66Array1[local64].method2034();
					}
				}
			}
			if (Static135.aClass66_3 != null) {
				Static135.aClass66_3.method2034();
			}
			if (Static80.aClass66_1 != null) {
				Static80.aClass66_1.method2034();
			}
		} catch (@Pc(96) IOException local96) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method582() {
		Static42.anInt910++;
		if (Static42.anInt910 % 1000 == 1) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static129.anInt1215 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static40.aRandom1.setSeed((long) Static129.anInt1215);
		}
		this.method591();
		Static12.method226();
		Static147.method2513();
		Static84.method1044();
		Static86.method1487();
		Static134.method2227();
		if (Static207.aClass24_1 != null) {
			@Pc(62) int local62 = Static207.aClass24_1.method731();
			Static172.anInt3717 = local62;
		}
		if (Static134.anInt2902 == 0) {
			this.method588();
			Static51.method969();
		} else if (Static134.anInt2902 == 5) {
			Static50.method1419(this);
			this.method588();
			Static51.method969();
		} else if (Static134.anInt2902 == 10) {
			Static50.method1419(this);
		} else if (Static134.anInt2902 == 20) {
			Static50.method1419(this);
			Static2.method50();
		} else if (Static134.anInt2902 == 25) {
			Static96.method1668();
		}
		if (Static134.anInt2902 == 30) {
			Static142.method2443();
		} else if (Static134.anInt2902 == 40) {
			Static2.method50();
		}
	}
}
