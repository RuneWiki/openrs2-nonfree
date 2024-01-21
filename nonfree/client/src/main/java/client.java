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
				Static179.method959();
			}
			Static143.anInt2933 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static8.anInt189 = 0;
			} else if (arg0[1].equals("office")) {
				Static8.anInt189 = 1;
			} else if (arg0[1].equals("local")) {
				Static8.anInt189 = 2;
			} else {
				Static179.method959();
			}
			if (arg0[2].equals("live")) {
				Static76.anInt1502 = 0;
			} else if (arg0[2].equals("rc")) {
				Static76.anInt1502 = 1;
			} else if (arg0[2].equals("wip")) {
				Static76.anInt1502 = 2;
			} else {
				Static179.method959();
			}
			if (arg0[3].equals("lowmem")) {
				Static126.method1768();
			} else if (arg0[3].equals("highmem")) {
				Static29.method514();
			} else {
				Static179.method959();
			}
			if (arg0[4].equals("free")) {
				Static4.aBoolean5 = false;
			} else if (arg0[4].equals("members")) {
				Static4.aBoolean5 = true;
			} else {
				Static179.method959();
			}
			if (arg0[5].equals("english")) {
				Static203.anInt4141 = 0;
			} else if (arg0[5].equals("german")) {
				Static72.method1039();
				Static203.anInt4141 = 1;
			} else {
				Static179.method959();
			}
			if (arg0[6].equals("game0")) {
				Static55.anInt1196 = 0;
			} else if (arg0[6].equals("game1")) {
				Static55.anInt1196 = 1;
			} else {
				Static179.method959();
			}
			Static180.aString6 = "127.0.0.1";
			Static151.anInt3105 = 0;
			Static40.aClass70_424 = Static61.aClass70_596;
			@Pc(182) client local182 = new client();
			local182.method540(Static76.anInt1502 + 32, "runescape");
			Static88.aFrame1.setLocation(40, 40);
		} catch (@Pc(200) Exception local200) {
			Static208.method1860(null, local200);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method548() {
		if (Static15.anInt351 != 1000) {
			@Pc(12) boolean local12 = Static8.method214();
			if (!local12) {
				this.method553();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method549() {
		@Pc(18) int local18;
		if (Static27.anInt570 == 0) {
			Static55.method878(Static23.anIntArrayArrayArray4);
			for (local18 = 0; local18 < 4; local18++) {
				Static28.aClass77Array1[local18] = new Class77(104, 104);
			}
			Static19.aClass3_Sub3_Sub2_Sub1_1 = new Class3_Sub3_Sub2_Sub1(512, 512);
			Static27.anInt570 = 30;
			Static72.anInt1428 = 5;
			Static198.aClass70_1990 = Static187.aClass70_1846;
		} else if (Static27.anInt570 == 30) {
			Static156.aClass52_Sub1_21 = Static201.method3205(0, true, false, true);
			Static169.aClass52_Sub1_22 = Static201.method3205(1, true, false, true);
			Static112.aClass52_Sub1_17 = Static201.method3205(2, true, true, false);
			Static19.aClass52_Sub1_3 = Static201.method3205(3, true, false, true);
			Static199.aClass52_Sub1_26 = Static201.method3205(4, true, false, true);
			Static92.aClass52_Sub1_14 = Static201.method3205(5, true, true, true);
			Static10.aClass52_Sub1_2 = Static201.method3205(6, false, true, true);
			Static78.aClass52_Sub1_12 = Static201.method3205(7, true, false, true);
			Static138.aClass52_Sub1_20 = Static201.method3205(8, true, false, true);
			Static61.aClass52_Sub1_9 = Static201.method3205(9, true, true, false);
			Static118.aClass52_Sub1_19 = Static201.method3205(10, true, false, true);
			Static40.aClass52_Sub1_7 = Static201.method3205(11, true, false, true);
			Static113.aClass52_Sub1_18 = Static201.method3205(12, true, false, true);
			Static28.aClass52_Sub1_5 = Static201.method3205(13, true, true, false);
			Static90.aClass52_Sub1_13 = Static201.method3205(14, false, false, true);
			Static78.aClass52_Sub1_11 = Static201.method3205(15, true, false, true);
			Static184.aClass52_Sub1_23 = Static201.method3205(16, true, false, true);
			Static196.aClass52_Sub1_24 = Static201.method3205(17, true, false, true);
			Static199.aClass52_Sub1_25 = Static201.method3205(18, true, false, true);
			Static58.aClass52_Sub1_8 = Static201.method3205(19, true, false, true);
			Static103.aClass52_Sub1_15 = Static201.method3205(20, true, false, true);
			Static26.aClass52_Sub1_4 = Static201.method3205(21, true, false, true);
			Static30.aClass52_Sub1_6 = Static201.method3205(22, true, false, true);
			Static72.aClass52_Sub1_10 = Static201.method3205(23, true, true, true);
			Static27.anInt570 = 40;
			Static198.aClass70_1990 = Static33.aClass70_323;
			Static72.anInt1428 = 20;
		} else if (Static27.anInt570 == 40) {
			local18 = Static156.aClass52_Sub1_21.method1587() * 4 / 100;
			local18 += Static169.aClass52_Sub1_22.method1587() * 4 / 100;
			local18 += Static112.aClass52_Sub1_17.method1587() / 100;
			local18 += Static19.aClass52_Sub1_3.method1587() * 2 / 100;
			local18 += Static199.aClass52_Sub1_26.method1587() * 6 / 100;
			local18 += Static92.aClass52_Sub1_14.method1587() * 4 / 100;
			local18 += Static10.aClass52_Sub1_2.method1587() * 2 / 100;
			local18 += Static78.aClass52_Sub1_12.method1587() * 53 / 100;
			local18 += Static138.aClass52_Sub1_20.method1587() * 2 / 100;
			local18 += Static61.aClass52_Sub1_9.method1587() * 2 / 100;
			local18 += Static118.aClass52_Sub1_19.method1587() * 2 / 100;
			local18 += Static40.aClass52_Sub1_7.method1587() * 2 / 100;
			local18 += Static113.aClass52_Sub1_18.method1587() * 2 / 100;
			local18 += Static28.aClass52_Sub1_5.method1587() * 2 / 100;
			local18 += Static90.aClass52_Sub1_13.method1587() * 2 / 100;
			local18 += Static78.aClass52_Sub1_11.method1587() * 2 / 100;
			local18 += Static184.aClass52_Sub1_23.method1587() / 100;
			local18 += Static196.aClass52_Sub1_24.method1587() / 100;
			local18 += Static199.aClass52_Sub1_25.method1587() / 100;
			local18 += Static58.aClass52_Sub1_8.method1587() / 100;
			local18 += Static103.aClass52_Sub1_15.method1587() / 100;
			local18 += Static26.aClass52_Sub1_4.method1587() / 100;
			local18 += Static30.aClass52_Sub1_6.method1587() / 100;
			local18 += Static72.aClass52_Sub1_10.method1587() / 100;
			if (local18 == 100) {
				Static72.anInt1428 = 30;
				Static198.aClass70_1990 = Static193.aClass70_1913;
				Static170.method830(Static138.aClass52_Sub1_20, Static10.aClass52_Sub1_2, Static118.aClass52_Sub1_19);
				Static27.anInt570 = 45;
			} else {
				if (local18 != 0) {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static85.aClass70_894, Static107.method2404(local18), Static61.aClass70_595 });
				}
				Static72.anInt1428 = 30;
			}
		} else if (Static27.anInt570 == 45) {
			Static58.method923(!Static50.aBoolean66);
			@Pc(545) Class3_Sub19_Sub2 local545 = new Class3_Sub19_Sub2();
			local545.method2865();
			Static18.aClass56_1 = Static106.method1505(22050, Static211.aCanvas1, Static47.aClass47_1, 0);
			Static18.aClass56_1.method2456(local545);
			Static205.method3238(local545, Static199.aClass52_Sub1_26, Static78.aClass52_Sub1_11, Static90.aClass52_Sub1_13);
			Static29.aClass56_2 = Static106.method1505(2048, Static211.aCanvas1, Static47.aClass47_1, 1);
			Static169.aClass3_Sub19_Sub3_2 = new Class3_Sub19_Sub3();
			Static29.aClass56_2.method2456(Static169.aClass3_Sub19_Sub3_2);
			Static71.aClass58_1 = new Class58(22050, Static91.anInt1796);
			Static198.aClass70_1990 = Static155.aClass70_1529;
			Static72.anInt1428 = 35;
			Static27.anInt570 = 50;
		} else if (Static27.anInt570 == 50) {
			local18 = 0;
			if (Static1.aClass3_Sub3_Sub2_Sub4_Sub1_5 == null) {
				Static1.aClass3_Sub3_Sub2_Sub4_Sub1_5 = Static187.method2946(Static61.aClass70_596, Static28.aClass52_Sub1_5, Static201.aClass70_2043, Static138.aClass52_Sub1_20);
			} else {
				local18++;
			}
			if (Static77.aClass3_Sub3_Sub2_Sub4_Sub1_3 == null) {
				Static77.aClass3_Sub3_Sub2_Sub4_Sub1_3 = Static1.aClass3_Sub3_Sub2_Sub4_Sub1_5;
			} else {
				local18++;
			}
			if (Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4 == null) {
				Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4 = Static187.method2946(Static61.aClass70_596, Static28.aClass52_Sub1_5, Static30.aClass70_309, Static138.aClass52_Sub1_20);
			} else {
				local18++;
			}
			if (Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6 == null) {
				Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6 = Static187.method2946(Static61.aClass70_596, Static28.aClass52_Sub1_5, Static141.aClass70_1327, Static138.aClass52_Sub1_20);
			} else {
				local18++;
			}
			if (local18 < 4) {
				Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static67.aClass70_1538, Static107.method2404(local18 * 100 / 4), Static61.aClass70_595 });
				Static72.anInt1428 = 40;
			} else {
				Static72.anInt1428 = 40;
				Static27.anInt570 = 60;
				Static198.aClass70_1990 = Static108.aClass70_1093;
			}
		} else {
			@Pc(702) int local702;
			if (Static27.anInt570 == 60) {
				local18 = Static92.method1353(Static138.aClass52_Sub1_20, Static118.aClass52_Sub1_19);
				local702 = Static189.method2977();
				if (local702 > local18) {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static147.aClass70_1426, Static107.method2404(local18 * 100 / local702), Static61.aClass70_595 });
					Static72.anInt1428 = 50;
				} else {
					Static27.anInt570 = 65;
					Static72.anInt1428 = 50;
					Static198.aClass70_1990 = Static176.aClass70_1728;
				}
			} else if (Static27.anInt570 == 65) {
				Static72.anInt1428 = 50;
				Static198.aClass70_1990 = Static115.aClass70_1122;
				Static29.method515(5);
				Static27.anInt570 = 70;
			} else if (Static27.anInt570 == 70) {
				Static112.aClass52_Sub1_17.method1571();
				local18 = Static112.aClass52_Sub1_17.method1574();
				Static184.aClass52_Sub1_23.method1571();
				local18 += Static184.aClass52_Sub1_23.method1574();
				Static196.aClass52_Sub1_24.method1571();
				local18 += Static196.aClass52_Sub1_24.method1574();
				Static199.aClass52_Sub1_25.method1571();
				local18 += Static199.aClass52_Sub1_25.method1574();
				Static58.aClass52_Sub1_8.method1571();
				local18 += Static58.aClass52_Sub1_8.method1574();
				Static103.aClass52_Sub1_15.method1571();
				local18 += Static103.aClass52_Sub1_15.method1574();
				Static26.aClass52_Sub1_4.method1571();
				local18 += Static26.aClass52_Sub1_4.method1574();
				Static30.aClass52_Sub1_6.method1571();
				local18 += Static30.aClass52_Sub1_6.method1574();
				if (local18 < 800) {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static139.aClass70_2052, Static107.method2404(local18 / 8), Static61.aClass70_595 });
					Static72.anInt1428 = 60;
				} else {
					Static10.method245(Static112.aClass52_Sub1_17);
					Static187.method2948(Static112.aClass52_Sub1_17);
					Static87.method3323(Static112.aClass52_Sub1_17, Static78.aClass52_Sub1_12);
					Static137.method1960(Static78.aClass52_Sub1_12, Static184.aClass52_Sub1_23, Static50.aBoolean66, Static4.aBoolean5);
					Static189.method2976(Static78.aClass52_Sub1_12, Static199.aClass52_Sub1_25);
					Static207.method3298(Static77.aClass3_Sub3_Sub2_Sub4_Sub1_3, Static58.aClass52_Sub1_8, Static4.aBoolean5, Static78.aClass52_Sub1_12);
					Static110.method1592(Static169.aClass52_Sub1_22, Static156.aClass52_Sub1_21, Static103.aClass52_Sub1_15);
					Static205.method3235(Static78.aClass52_Sub1_12, Static26.aClass52_Sub1_4);
					Static23.method393(Static30.aClass52_Sub1_6);
					Static181.method2818(Static112.aClass52_Sub1_17);
					Static64.method984(Static138.aClass52_Sub1_20, Static28.aClass52_Sub1_5, Static19.aClass52_Sub1_3, Static78.aClass52_Sub1_12);
					Static31.method570(Static112.aClass52_Sub1_17);
					Static49.method767(Static196.aClass52_Sub1_24);
					Static72.method1040(Static112.aClass52_Sub1_17);
					Static74.method1059(Static112.aClass52_Sub1_17);
					Static72.anInt1428 = 60;
					Static198.aClass70_1990 = Static208.aClass70_1243;
					Static64.method986();
					Static27.anInt570 = 80;
				}
			} else if (Static27.anInt570 == 80) {
				local18 = 0;
				if (Static52.aClass3_Sub3_Sub2_Sub1_4 == null) {
					Static52.aClass3_Sub3_Sub2_Sub1_4 = Static43.method708(Static138.aClass52_Sub1_20, Static137.aClass70_1300, Static61.aClass70_596);
				} else {
					local18++;
				}
				if (Static186.aClass3_Sub3_Sub2_Sub2Array10 == null) {
					Static186.aClass3_Sub3_Sub2_Sub2Array10 = Static47.method745(Static138.aClass52_Sub1_20, Static61.aClass70_596, Static210.aClass70_2092);
				} else {
					local18++;
				}
				if (Static41.aClass3_Sub3_Sub2_Sub1Array6 == null) {
					Static41.aClass3_Sub3_Sub2_Sub1Array6 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static166.aClass70_1601);
				} else {
					local18++;
				}
				if (Static40.aClass3_Sub3_Sub2_Sub1Array5 == null) {
					Static40.aClass3_Sub3_Sub2_Sub1Array5 = Static41.aClass3_Sub3_Sub2_Sub1Array6;
				} else {
					local18++;
				}
				if (Static199.aClass3_Sub3_Sub2_Sub1Array12 == null) {
					Static199.aClass3_Sub3_Sub2_Sub1Array12 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static191.aClass70_1892);
				} else {
					local18++;
				}
				if (Static193.aClass3_Sub3_Sub2_Sub1Array11 == null) {
					Static193.aClass3_Sub3_Sub2_Sub1Array11 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static87.aClass70_2105);
				} else {
					local18++;
				}
				if (Static29.aClass3_Sub3_Sub2_Sub1Array2 == null) {
					Static29.aClass3_Sub3_Sub2_Sub1Array2 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static56.aClass70_567);
				} else {
					local18++;
				}
				if (Static208.aClass3_Sub3_Sub2_Sub1Array10 == null) {
					Static208.aClass3_Sub3_Sub2_Sub1Array10 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static170.aClass70_547);
				} else {
					local18++;
				}
				if (Static35.aClass3_Sub3_Sub2_Sub1Array3 == null) {
					Static35.aClass3_Sub3_Sub2_Sub1Array3 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static28.aClass70_283);
				} else {
					local18++;
				}
				if (Static29.aClass3_Sub3_Sub2_Sub1Array1 == null) {
					Static29.aClass3_Sub3_Sub2_Sub1Array1 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static210.aClass70_2095);
				} else {
					local18++;
				}
				if (Static160.aClass3_Sub3_Sub2_Sub1_7 == null) {
					Static160.aClass3_Sub3_Sub2_Sub1_7 = Static43.method708(Static138.aClass52_Sub1_20, Static120.aClass70_1146, Static61.aClass70_596);
				} else {
					local18++;
				}
				if (Static40.aClass3_Sub3_Sub2_Sub1Array4 == null) {
					Static40.aClass3_Sub3_Sub2_Sub1Array4 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static190.aClass70_1886);
				} else {
					local18++;
				}
				if (Static109.aClass3_Sub3_Sub2_Sub1Array9 == null) {
					Static109.aClass3_Sub3_Sub2_Sub1Array9 = Static136.method1943(Static61.aClass70_596, Static138.aClass52_Sub1_20, Static187.aClass70_1847);
				} else {
					local18++;
				}
				if (Static208.aClass3_Sub3_Sub2_Sub2Array7 == null) {
					Static208.aClass3_Sub3_Sub2_Sub2Array7 = Static47.method745(Static138.aClass52_Sub1_20, Static61.aClass70_596, Static57.aClass70_581);
				} else {
					local18++;
				}
				if (Static93.aClass3_Sub3_Sub2_Sub2Array6 == null) {
					Static93.aClass3_Sub3_Sub2_Sub2Array6 = Static47.method745(Static138.aClass52_Sub1_20, Static61.aClass70_596, Static189.aClass70_1875);
				} else {
					local18++;
				}
				local18++;
				if (local18 < 16) {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static150.aClass70_1446, Static107.method2404(local18 * 100 / 16), Static61.aClass70_595 });
					Static72.anInt1428 = 70;
				} else {
					Static1.aClass3_Sub3_Sub2_Sub4_Sub1_5.method3103(Static93.aClass3_Sub3_Sub2_Sub2Array6, null);
					Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3103(Static93.aClass3_Sub3_Sub2_Sub2Array6, null);
					Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3103(Static93.aClass3_Sub3_Sub2_Sub2Array6, null);
					if (Static1.aClass3_Sub3_Sub2_Sub4_Sub1_5 != Static77.aClass3_Sub3_Sub2_Sub4_Sub1_3) {
						Static77.aClass3_Sub3_Sub2_Sub4_Sub1_3.method3103(Static93.aClass3_Sub3_Sub2_Sub2Array6, null);
					}
					for (local702 = 0; local702 < Static29.aClass3_Sub3_Sub2_Sub1Array1.length; local702++) {
						Static29.aClass3_Sub3_Sub2_Sub1Array1[local702].method180();
					}
					Static52.aClass3_Sub3_Sub2_Sub1_4.method180();
					@Pc(1192) int local1192 = (int) (Math.random() * 21.0D) - 10;
					@Pc(1199) int local1199 = (int) (Math.random() * 21.0D) - 10;
					@Pc(1206) int local1206 = (int) (Math.random() * 21.0D) - 10;
					@Pc(1213) int local1213 = (int) (Math.random() * 41.0D) - 20;
					for (@Pc(1215) int local1215 = 0; local1215 < Static41.aClass3_Sub3_Sub2_Sub1Array6.length; local1215++) {
						Static41.aClass3_Sub3_Sub2_Sub1Array6[local1215].method193(local1213 + local1199, local1192 - -local1213, local1206 + local1213);
					}
					Static186.aClass3_Sub3_Sub2_Sub2Array10[0].method2328(local1199 + local1213, local1192 + local1213, local1213 + local1206);
					Static27.anInt570 = 90;
					Static198.aClass70_1990 = Static203.aClass70_2062;
					Static72.anInt1428 = 70;
				}
			} else if (Static27.anInt570 == 90) {
				if (Static61.aClass52_Sub1_9.method1571()) {
					@Pc(1305) Class19 local1305 = new Class19(Static61.aClass52_Sub1_9, Static138.aClass52_Sub1_20, 20, Static50.aBoolean66 ? 64 : 128);
					Static177.method2778(local1305);
					Static177.method2774(0.7F);
					Static27.anInt570 = 110;
					Static72.anInt1428 = 90;
					Static198.aClass70_1990 = Static192.aClass70_1907;
				} else {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static70.aClass70_663, Static107.method2404(Static61.aClass52_Sub1_9.method1574()), Static61.aClass70_595 });
					Static72.anInt1428 = 90;
				}
			} else if (Static27.anInt570 == 110) {
				Static34.aClass46_1 = new Class46();
				Static47.aClass47_1.method1363(Static34.aClass46_1, 10);
				Static27.anInt570 = 120;
				Static198.aClass70_1990 = Static208.aClass70_1240;
				Static72.anInt1428 = 94;
			} else if (Static27.anInt570 == 120) {
				if (Static118.aClass52_Sub1_19.method1576(Static52.aClass70_550, Static61.aClass70_596)) {
					@Pc(1372) Class25 local1372 = new Class25(Static118.aClass52_Sub1_19.method1566(Static61.aClass70_596, Static52.aClass70_550));
					Static110.method1591(local1372);
					Static72.anInt1428 = 96;
					Static198.aClass70_1990 = Static199.aClass70_2001;
					Static27.anInt570 = 130;
				} else {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static84.aClass70_854, Class80.aClass70_1581 });
					Static72.anInt1428 = 96;
				}
			} else if (Static27.anInt570 == 130) {
				if (!Static19.aClass52_Sub1_3.method1571()) {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static65.aClass70_634, Static107.method2404(Static19.aClass52_Sub1_3.method1574() * 4 / 5), Static61.aClass70_595 });
					Static72.anInt1428 = 100;
				} else if (!Static113.aClass52_Sub1_18.method1571()) {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static65.aClass70_634, Static107.method2404(Static113.aClass52_Sub1_18.method1574() / 6 + 80), Static61.aClass70_595 });
					Static72.anInt1428 = 100;
				} else if (Static28.aClass52_Sub1_5.method1571()) {
					Static27.anInt570 = 140;
					Static72.anInt1428 = 100;
					Static198.aClass70_1990 = Static212.aClass70_2124;
				} else {
					Static198.aClass70_1990 = Static207.method3296(new Class70[] { Static65.aClass70_634, Static107.method2404(Static28.aClass52_Sub1_5.method1574() / 20 + 96), Static61.aClass70_595 });
					Static72.anInt1428 = 100;
				}
			} else if (Static27.anInt570 == 140) {
				Static92.aClass52_Sub1_14.method1580(false);
				Static10.aClass52_Sub1_2.method1580(true);
				Static138.aClass52_Sub1_20.method1580(true);
				Static28.aClass52_Sub1_5.method1580(true);
				Static118.aClass52_Sub1_19.method1580(true);
				Static29.method515(10);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method534() {
		Static122.anInt2463 = Static8.anInt189 == 0 ? 443 : Static143.anInt2933 + 50000;
		Static127.anInt2499 = Static8.anInt189 == 0 ? 43594 : Static143.anInt2933 + 40000;
		if (Static55.anInt1196 == 1) {
			Static4.aShortArrayArray1 = Static65.aShortArrayArray4;
			Static122.aShortArrayArray6 = Static28.aShortArrayArray3;
			Static97.aShortArray25 = Static190.aShortArray61;
			Static134.aShortArray41 = Static106.aShortArray26;
		} else {
			Static97.aShortArray25 = Static204.aShortArray67;
			Static122.aShortArrayArray6 = Static68.aShortArrayArray5;
			Static134.aShortArray41 = Static65.aShortArray18;
			Static4.aShortArrayArray1 = Static17.aShortArrayArray2;
		}
		Static18.anInt369 = Static127.anInt2499;
		Static124.aShortArray62 = Static207.aShortArray68 = Static116.aShortArray55 = new short[256];
		Static174.method2698();
		Static153.method2264(Static211.aCanvas1);
		Static111.method1603(Static211.aCanvas1);
		Static112.aClass51_1 = Static55.method876();
		if (Static112.aClass51_1 != null) {
			Static112.aClass51_1.method2403(Static211.aCanvas1);
		}
		Static7.anInt125 = Static94.anInt1968;
		try {
			if (Static47.aClass47_1.aClass75_3 != null) {
				Static92.aClass82_3 = new Class82(Static47.aClass47_1.aClass75_3, 5200, 0);
				for (@Pc(95) int local95 = 0; local95 < 24; local95++) {
					Static118.aClass82Array1[local95] = new Class82(Static47.aClass47_1.aClass75Array1[local95], 6000, 0);
				}
				Static153.aClass82_5 = new Class82(Static47.aClass47_1.aClass75_1, 6000, 0);
				Static97.aClass18_1 = new Class18(255, Static92.aClass82_3, Static153.aClass82_5, 500000);
				Static152.aClass82_4 = new Class82(Static47.aClass47_1.aClass75_2, 24, 0);
				Static47.aClass47_1.aClass75Array1 = null;
				Static47.aClass47_1.aClass75_1 = null;
				Static47.aClass47_1.aClass75_2 = null;
				Static47.aClass47_1.aClass75_3 = null;
			}
		} catch (@Pc(153) IOException local153) {
			Static97.aClass18_1 = null;
			Static152.aClass82_4 = null;
			Static92.aClass82_3 = null;
			Static153.aClass82_5 = null;
		}
		if (Static8.anInt189 != 0) {
			Static165.aBoolean151 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method533()) {
			return;
		}
		Static143.anInt2933 = Integer.parseInt(this.getParameter("worldid"));
		Static76.anInt1502 = Integer.parseInt(this.getParameter("modewhat"));
		Static8.anInt189 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static126.method1768();
		} else {
			Static29.method514();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static4.aBoolean5 = true;
		} else {
			Static4.aBoolean5 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static72.method1039();
			Static203.anInt4141 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static55.anInt1196 = 1;
		} else {
			Static55.anInt1196 = 0;
		}
		try {
			Static172.anInt3461 = Integer.parseInt(this.getParameter("js"));
			Static17.anInt361 = Integer.parseInt(this.getParameter("plug"));
			Static151.anInt3105 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static40.aClass70_424 = Static123.aClass70_1185.method2043(this);
		if (Static40.aClass70_424 == null) {
			Static40.aClass70_424 = Static61.aClass70_596;
		}
		Static180.aString6 = this.getCodeBase().getHost();
		this.method531(Static76.anInt1502 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method542() {
		if (Static34.aClass46_1 != null) {
			Static34.aClass46_1.aBoolean101 = false;
		}
		Static34.aClass46_1 = null;
		if (Static148.aClass33_2 != null) {
			Static148.aClass33_2.method925();
			Static148.aClass33_2 = null;
		}
		Static209.method3299(Static211.aCanvas1);
		Static47.method747(Static211.aCanvas1);
		if (Static112.aClass51_1 != null) {
			Static112.aClass51_1.method2406(Static211.aCanvas1);
		}
		Static129.method1821();
		Static74.method1057();
		Static112.aClass51_1 = null;
		if (Static18.aClass56_1 != null) {
			Static18.aClass56_1.method2454();
		}
		if (Static29.aClass56_2 != null) {
			Static29.aClass56_2.method2454();
		}
		Static97.method1404();
		Static126.method1766();
		try {
			if (Static92.aClass82_3 != null) {
				Static92.aClass82_3.method2431();
			}
			if (Static118.aClass82Array1 != null) {
				for (@Pc(62) int local62 = 0; local62 < Static118.aClass82Array1.length; local62++) {
					if (Static118.aClass82Array1[local62] != null) {
						Static118.aClass82Array1[local62].method2431();
					}
				}
			}
			if (Static153.aClass82_5 != null) {
				Static153.aClass82_5.method2431();
			}
			if (Static152.aClass82_4 != null) {
				Static152.aClass82_4.method2431();
			}
		} catch (@Pc(90) IOException local90) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method553() {
		if (Static113.anInt2285 >= 4) {
			this.method538("js5crc");
			Static15.anInt351 = 1000;
			return;
		}
		if (Static54.anInt1163 >= 4) {
			if (Static15.anInt351 <= 5) {
				this.method538("js5io");
				Static15.anInt351 = 1000;
				return;
			}
			Static153.anInt3167 = 3000;
			Static54.anInt1163 = 3;
		}
		if (Static153.anInt3167-- > 0) {
			return;
		}
		try {
			if (Static136.anInt2776 == 0) {
				Static12.aClass29_1 = Static47.aClass47_1.method1368(Static18.anInt369, Static180.aString6);
				Static136.anInt2776++;
			}
			if (Static136.anInt2776 == 1) {
				if (Static12.aClass29_1.anInt973 == 2) {
					this.method555(-1);
					return;
				}
				if (Static12.aClass29_1.anInt973 == 1) {
					Static136.anInt2776++;
				}
			}
			if (Static136.anInt2776 == 2) {
				Static181.aClass33_4 = new Class33((Socket) Static12.aClass29_1.anObject2, Static47.aClass47_1);
				@Pc(106) Class3_Sub4 local106 = new Class3_Sub4(5);
				local106.method1239(15);
				local106.method1285(495);
				Static181.aClass33_4.method924(5, local106.aByteArray12);
				Static136.anInt2776++;
				Static180.aLong120 = Static210.method3307();
			}
			if (Static136.anInt2776 == 3) {
				if (Static15.anInt351 <= 5 || Static181.aClass33_4.method922() > 0) {
					@Pc(160) int local160 = Static181.aClass33_4.method920();
					if (local160 != 0) {
						this.method555(local160);
						return;
					}
					Static136.anInt2776++;
				} else if (Static210.method3307() - Static180.aLong120 > 30000L) {
					this.method555(-2);
					return;
				}
			}
			if (Static136.anInt2776 == 4) {
				Static129.method1822(Static181.aClass33_4, Static15.anInt351 > 20);
				Static129.anInt2544 = 0;
				Static136.anInt2776 = 0;
				Static181.aClass33_4 = null;
				Static12.aClass29_1 = null;
			}
		} catch (@Pc(195) IOException local195) {
			this.method555(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method544() {
		Static184.anInt3760++;
		if (Static184.anInt3760 % 1000 == 1) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static55.anInt1189 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static72.aRandom1.setSeed((long) Static55.anInt1189);
		}
		this.method548();
		Static74.method1060();
		Static30.method550();
		Static48.method3330();
		Static99.method1412();
		Static211.method3317();
		if (Static112.aClass51_1 != null) {
			@Pc(71) int local71 = Static112.aClass51_1.method2405();
			Static136.anInt2779 = local71;
		}
		if (Static15.anInt351 == 0) {
			this.method549();
			Static57.method906();
		} else if (Static15.anInt351 == 5) {
			Static91.method1317(this);
			this.method549();
			Static57.method906();
		} else if (Static15.anInt351 == 10) {
			Static91.method1317(this);
		} else if (Static15.anInt351 == 20) {
			Static91.method1317(this);
			Static127.method1770();
		} else if (Static15.anInt351 == 25) {
			Static12.method260();
		}
		if (Static15.anInt351 == 30) {
			Static183.method2097();
		} else if (Static15.anInt351 == 40) {
			Static127.method1770();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method555(@OriginalArg(1) int arg0) {
		Static12.aClass29_1 = null;
		Static136.anInt2776 = 0;
		Static129.anInt2544++;
		if (Static127.anInt2499 == Static18.anInt369) {
			Static18.anInt369 = Static122.anInt2463;
		} else {
			Static18.anInt369 = Static127.anInt2499;
		}
		Static181.aClass33_4 = null;
		if (Static129.anInt2544 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static15.anInt351 <= 5) {
				this.method538("js5connect_full");
				Static15.anInt351 = 1000;
			} else {
				Static153.anInt3167 = 3000;
			}
		} else if (Static129.anInt2544 >= 2 && arg0 == 6) {
			this.method538("js5connect_outofdate");
			Static15.anInt351 = 1000;
		} else if (Static129.anInt2544 >= 4) {
			if (Static15.anInt351 <= 5) {
				this.method538("js5connect");
				Static15.anInt351 = 1000;
			} else {
				Static153.anInt3167 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method537() {
		@Pc(4) boolean local4 = Static27.method487();
		@Pc(15) boolean local15 = false;
		if (local4 && Static80.aBoolean91 && Static18.aClass56_1 != null) {
			Static18.aClass56_1.method2445();
		}
		if (Static198.aBoolean182) {
			Static198.aBoolean182 = false;
			local15 = true;
		}
		if (Static15.anInt351 == 0) {
			Static29.method512(local15, Static198.aClass70_1990, null, Static72.anInt1428);
		} else if (Static15.anInt351 == 5 || Static15.anInt351 == 10 || Static15.anInt351 == 20) {
			Static212.method3342(Static1.aClass3_Sub3_Sub2_Sub4_Sub1_5, Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6);
		} else if (Static15.anInt351 == 25) {
			@Pc(118) int local118;
			if (Static186.anInt3809 == 1) {
				if (Static6.anInt117 > Static182.anInt3726) {
					Static182.anInt3726 = Static6.anInt117;
				}
				local118 = (Static182.anInt3726 - Static6.anInt117) * 50 / Static182.anInt3726;
				Static60.method2392(false, Static207.method3296(new Class70[] { Static92.aClass70_953, Static170.aClass70_549, Static107.method2404(local118), Static82.aClass70_803 }));
			} else if (Static186.anInt3809 == 2) {
				if (Static40.anInt858 < Static58.anInt1270) {
					Static40.anInt858 = Static58.anInt1270;
				}
				local118 = (Static40.anInt858 - Static58.anInt1270) * 50 / Static40.anInt858 + 50;
				Static60.method2392(false, Static207.method3296(new Class70[] { Static92.aClass70_953, Static170.aClass70_549, Static107.method2404(local118), Static82.aClass70_803 }));
			} else {
				Static60.method2392(false, Static92.aClass70_953);
			}
		} else if (Static15.anInt351 == 30) {
			Static23.method392();
		} else if (Static15.anInt351 == 40) {
			Static60.method2392(false, Static207.method3296(new Class70[] { Static83.aClass70_819, Static97.aClass70_994, Static48.aClass70_2112 }));
		}
		@Pc(203) Canvas local203 = Static211.aCanvas1;
		@Pc(218) Graphics local218;
		@Pc(226) int local226;
		if (Static15.anInt351 == 30 && Static116.anInt3351 == 0 && !local15) {
			try {
				local218 = local203.getGraphics();
				for (local226 = 0; local226 < Static127.anInt2495; local226++) {
					if (Static70.aBooleanArray3[local226]) {
						Static190.aClass22_1.method2342(Static59.anIntArray136[local226], local218, Static35.anIntArray38[local226], Static150.anIntArray225[local226], Static175.anIntArray292[local226]);
						Static70.aBooleanArray3[local226] = false;
					}
				}
			} catch (@Pc(282) Exception local282) {
				local203.repaint();
			}
		} else if (Static15.anInt351 > 0) {
			try {
				local218 = local203.getGraphics();
				Static190.aClass22_1.method2338(local218);
				for (local226 = 0; local226 < Static127.anInt2495; local226++) {
					Static70.aBooleanArray3[local226] = false;
				}
			} catch (@Pc(242) Exception local242) {
				local203.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method543() {
	}
}
