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
				Static169.method696();
			}
			Static120.anInt2639 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static94.anInt2013 = 0;
			} else if (arg0[1].equals("office")) {
				Static94.anInt2013 = 1;
			} else if (arg0[1].equals("local")) {
				Static94.anInt2013 = 2;
			} else {
				Static169.method696();
			}
			if (arg0[2].equals("live")) {
				Static145.anInt3190 = 0;
			} else if (arg0[2].equals("rc")) {
				Static145.anInt3190 = 1;
			} else if (arg0[2].equals("wip")) {
				Static145.anInt3190 = 2;
			} else {
				Static169.method696();
			}
			if (arg0[3].equals("lowmem")) {
				Static193.method3105();
			} else if (arg0[3].equals("highmem")) {
				Static177.method2839();
			} else {
				Static169.method696();
			}
			if (arg0[4].equals("free")) {
				Static156.aBoolean143 = false;
			} else if (arg0[4].equals("members")) {
				Static156.aBoolean143 = true;
			} else {
				Static169.method696();
			}
			if (arg0[5].equals("english")) {
				Static44.anInt1005 = 0;
			} else if (arg0[5].equals("german")) {
				Static194.method3139();
				Static44.anInt1005 = 1;
				Static185.aClass80_1640 = Static33.aClass80_256;
			} else {
				Static169.method696();
			}
			if (arg0[6].equals("game0")) {
				Static44.anInt1010 = 0;
			} else if (arg0[6].equals("game1")) {
				Static44.anInt1010 = 1;
			} else {
				Static169.method696();
			}
			Static145.anInt3182 = 0;
			Static53.aClass80_456 = Static185.aClass80_1637;
			Static46.aString2 = "127.0.0.1";
			@Pc(184) client local184 = new client();
			local184.method451(Static145.anInt3190 + 32, "runescape");
			Static29.aFrame1.setLocation(40, 40);
		} catch (@Pc(202) Exception local202) {
			Static67.method1005(local202, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method465() {
		@Pc(17) int local17;
		if (Static173.anInt3888 == 0) {
			Static188.method3070(Static42.anIntArrayArrayArray1);
			for (local17 = 0; local17 < 4; local17++) {
				Static32.aClass82Array11[local17] = new Class82(104, 104);
			}
			Static27.aClass3_Sub1_Sub4_Sub4_41 = new Class3_Sub1_Sub4_Sub4(512, 512);
			Static78.aClass80_672 = Static77.aClass80_717;
			Static173.anInt3888 = 20;
			Static78.anInt1720 = 5;
			return;
		}
		@Pc(61) int local61;
		@Pc(71) int local71;
		@Pc(81) int local81;
		@Pc(75) int local75;
		if (Static173.anInt3888 == 20) {
			@Pc(59) int[] local59 = new int[9];
			for (local61 = 0; local61 < 9; local61++) {
				local71 = local61 * 32 + 128 + 15;
				local75 = Class3_Sub1_Sub4_Sub2.anIntArray188[local71];
				local81 = local71 * 3 + 600;
				local59[local61] = local75 * local81 >> 16;
			}
			Static136.method2063(local59);
			Static78.aClass80_672 = Static44.aClass80_375;
			Static78.anInt1720 = 10;
			Static173.anInt3888 = 30;
		} else if (Static173.anInt3888 == 30) {
			Static156.aClass1_Sub1_24 = Static130.method1950(0, true, true, false);
			Static160.aClass1_Sub1_25 = Static130.method1950(1, true, true, false);
			Static36.aClass1_Sub1_4 = Static130.method1950(2, true, false, true);
			Static142.aClass1_Sub1_23 = Static130.method1950(3, true, true, false);
			Static67.aClass1_Sub1_10 = Static130.method1950(4, true, true, false);
			Static100.aClass1_Sub1_16 = Static130.method1950(5, true, true, true);
			Static102.aClass1_Sub1_17 = Static130.method1950(6, false, true, true);
			Static128.aClass1_Sub1_20 = Static130.method1950(7, true, true, false);
			Static130.aClass1_Sub1_21 = Static130.method1950(8, true, true, false);
			Static83.aClass1_Sub1_12 = Static130.method1950(9, true, false, true);
			Static166.aClass1_Sub1_28 = Static130.method1950(10, true, true, false);
			Static103.aClass1_Sub1_18 = Static130.method1950(11, true, true, false);
			Static48.aClass1_Sub1_6 = Static130.method1950(12, true, true, false);
			Static52.aClass1_Sub1_7 = Static130.method1950(13, true, false, true);
			Static6.aClass1_Sub1_1 = Static130.method1950(14, false, true, false);
			Static164.aClass1_Sub1_27 = Static130.method1950(15, true, true, false);
			Static97.aClass1_Sub1_15 = Static130.method1950(16, true, true, false);
			Static126.aClass1_Sub1_19 = Static130.method1950(17, true, true, false);
			Static35.aClass1_Sub1_13 = Static130.method1950(18, true, true, false);
			Static77.aClass1_Sub1_14 = Static130.method1950(19, true, true, false);
			Static13.aClass1_Sub1_2 = Static130.method1950(20, true, true, false);
			Static141.aClass1_Sub1_22 = Static130.method1950(21, true, true, false);
			Static162.aClass1_Sub1_26 = Static130.method1950(22, true, true, false);
			Static78.aClass80_672 = Static195.aClass80_1734;
			Static173.anInt3888 = 40;
			Static78.anInt1720 = 20;
		} else if (Static173.anInt3888 == 40) {
			local17 = Static156.aClass1_Sub1_24.method69() * 4 / 100;
			local17 += Static160.aClass1_Sub1_25.method69() * 4 / 100;
			local17 += Static36.aClass1_Sub1_4.method69() / 100;
			local17 += Static142.aClass1_Sub1_23.method69() * 2 / 100;
			local17 += Static67.aClass1_Sub1_10.method69() * 6 / 100;
			local17 += Static100.aClass1_Sub1_16.method69() * 4 / 100;
			local17 += Static102.aClass1_Sub1_17.method69() * 2 / 100;
			local17 += Static128.aClass1_Sub1_20.method69() * 54 / 100;
			local17 += Static130.aClass1_Sub1_21.method69() * 2 / 100;
			local17 += Static83.aClass1_Sub1_12.method69() * 2 / 100;
			local17 += Static166.aClass1_Sub1_28.method69() * 2 / 100;
			local17 += Static103.aClass1_Sub1_18.method69() * 2 / 100;
			local17 += Static48.aClass1_Sub1_6.method69() * 2 / 100;
			local17 += Static52.aClass1_Sub1_7.method69() * 2 / 100;
			local17 += Static6.aClass1_Sub1_1.method69() * 2 / 100;
			local17 += Static164.aClass1_Sub1_27.method69() * 2 / 100;
			local17 += Static97.aClass1_Sub1_15.method69() / 100;
			local17 += Static126.aClass1_Sub1_19.method69() / 100;
			local17 += Static35.aClass1_Sub1_13.method69() / 100;
			local17 += Static77.aClass1_Sub1_14.method69() / 100;
			local17 += Static13.aClass1_Sub1_2.method69() / 100;
			local17 += Static141.aClass1_Sub1_22.method69() / 100;
			local17 += Static162.aClass1_Sub1_26.method69() / 100;
			if (local17 == 100) {
				Static78.anInt1720 = 30;
				Static78.aClass80_672 = Static60.aClass80_523;
				Static126.method1863(Static166.aClass1_Sub1_28, Static130.aClass1_Sub1_21, Static102.aClass1_Sub1_17);
				Static173.anInt3888 = 45;
			} else {
				if (local17 != 0) {
					Static78.aClass80_672 = Static154.method2467(new Class80[] { Static35.aClass80_694, Static83.method1219(local17), Static19.aClass80_145 });
				}
				Static78.anInt1720 = 30;
			}
		} else if (Static173.anInt3888 == 45) {
			Static3.method112(!Static96.aBoolean83);
			@Pc(571) Class3_Sub4_Sub1 local571 = new Class3_Sub4_Sub1();
			local571.method200();
			Static126.aClass38_2 = Static6.method151(22050, 0, Static146.aCanvas1, Static58.aClass61_1);
			Static126.aClass38_2.method2943(local571);
			Static1.method63(Static6.aClass1_Sub1_1, local571, Static67.aClass1_Sub1_10, Static164.aClass1_Sub1_27);
			Static54.aClass38_1 = Static6.method151(2048, 1, Static146.aCanvas1, Static58.aClass61_1);
			Static152.aClass3_Sub4_Sub2_2 = new Class3_Sub4_Sub2();
			Static54.aClass38_1.method2943(Static152.aClass3_Sub4_Sub2_2);
			Static162.aClass15_1 = new Class15(22050, Static47.anInt1073);
			Static78.aClass80_672 = Static23.aClass80_174;
			Static78.anInt1720 = 35;
			Static173.anInt3888 = 50;
		} else if (Static173.anInt3888 == 50) {
			local17 = 0;
			if (Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1 == null) {
				Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1 = Static84.method3020(Static16.aClass80_118, Static52.aClass1_Sub1_7, Static185.aClass80_1637, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static121.aClass3_Sub1_Sub4_Sub3_Sub1_3 == null) {
				Static121.aClass3_Sub1_Sub4_Sub3_Sub1_3 = Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1;
			} else {
				local17++;
			}
			if (Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7 == null) {
				Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7 = Static84.method3020(Static187.aClass80_1667, Static52.aClass1_Sub1_7, Static185.aClass80_1637, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6 == null) {
				Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6 = Static84.method3020(Static143.aClass80_1200, Static52.aClass1_Sub1_7, Static185.aClass80_1637, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (local17 < 4) {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static155.aClass80_1343, Static83.method1219(local17 * 100 / 4), Static19.aClass80_145 });
				Static78.anInt1720 = 40;
			} else {
				Static78.aClass80_672 = Static68.aClass80_590;
				Static173.anInt3888 = 60;
				Static78.anInt1720 = 40;
			}
		} else if (Static173.anInt3888 == 60) {
			local17 = Static182.method2912(Static130.aClass1_Sub1_21, Static166.aClass1_Sub1_28);
			local61 = Static177.method2834();
			if (local61 > local17) {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static92.aClass80_1187, Static83.method1219(local17 * 100 / local61), Static19.aClass80_145 });
				Static78.anInt1720 = 50;
			} else {
				Static78.anInt1720 = 50;
				Static173.anInt3888 = 65;
				Static78.aClass80_672 = Static161.aClass80_1395;
			}
		} else if (Static173.anInt3888 == 65) {
			Static78.aClass80_672 = Static184.aClass80_1629;
			Static78.anInt1720 = 50;
			Static132.method2019(5);
			Static173.anInt3888 = 70;
		} else if (Static173.anInt3888 == 70) {
			Static36.aClass1_Sub1_4.method39();
			local17 = Static36.aClass1_Sub1_4.method44();
			Static97.aClass1_Sub1_15.method39();
			local17 += Static97.aClass1_Sub1_15.method44();
			Static126.aClass1_Sub1_19.method39();
			local17 += Static126.aClass1_Sub1_19.method44();
			Static35.aClass1_Sub1_13.method39();
			local17 += Static35.aClass1_Sub1_13.method44();
			Static77.aClass1_Sub1_14.method39();
			local17 += Static77.aClass1_Sub1_14.method44();
			Static13.aClass1_Sub1_2.method39();
			local17 += Static13.aClass1_Sub1_2.method44();
			Static141.aClass1_Sub1_22.method39();
			local17 += Static141.aClass1_Sub1_22.method44();
			Static162.aClass1_Sub1_26.method39();
			local17 += Static162.aClass1_Sub1_26.method44();
			if (local17 < 800) {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static98.aClass80_840, Static83.method1219(local17 / 8), Static19.aClass80_145 });
				Static78.anInt1720 = 60;
			} else {
				Static140.method2167(Static36.aClass1_Sub1_4);
				Static88.method1284(Static36.aClass1_Sub1_4);
				Static193.method3106(Static128.aClass1_Sub1_20, Static36.aClass1_Sub1_4);
				Static50.method744(Static97.aClass1_Sub1_15, Static96.aBoolean83, Static128.aClass1_Sub1_20);
				Static185.method2993(Static35.aClass1_Sub1_13, Static128.aClass1_Sub1_20);
				Static56.method823(Static156.aBoolean143, Static121.aClass3_Sub1_Sub4_Sub3_Sub1_3, Static77.aClass1_Sub1_14, Static128.aClass1_Sub1_20);
				Static103.method1551(Static160.aClass1_Sub1_25, Static156.aClass1_Sub1_24, Static13.aClass1_Sub1_2);
				Static78.method1190(Static128.aClass1_Sub1_20, Static141.aClass1_Sub1_22);
				Static51.method758(Static162.aClass1_Sub1_26);
				Static142.method2213(Static36.aClass1_Sub1_4);
				Static133.method2042(Static142.aClass1_Sub1_23, Static128.aClass1_Sub1_20, Static52.aClass1_Sub1_7, Static130.aClass1_Sub1_21);
				Static31.method497(Static36.aClass1_Sub1_4);
				Static170.method2732(Static126.aClass1_Sub1_19);
				Static78.anInt1720 = 60;
				Static78.aClass80_672 = Static33.aClass80_252;
				Static113.method1747();
				Static173.anInt3888 = 80;
			}
		} else if (Static173.anInt3888 == 80) {
			local17 = 0;
			if (Static64.aClass3_Sub1_Sub4_Sub4_15 == null) {
				Static64.aClass3_Sub1_Sub4_Sub4_15 = Static104.method1561(Static130.aClass1_Sub1_21, Static113.aClass80_1002, Static185.aClass80_1637);
			} else {
				local17++;
			}
			if (Static125.aClass3_Sub1_Sub4_Sub1Array5 == null) {
				Static125.aClass3_Sub1_Sub4_Sub1Array5 = Static171.method2758(Static130.aClass1_Sub1_21, Static161.aClass80_1394, Static185.aClass80_1637);
			} else {
				local17++;
			}
			if (Static42.aClass3_Sub1_Sub4_Sub4Array7 == null) {
				Static42.aClass3_Sub1_Sub4_Sub4Array7 = Static43.method654(Static185.aClass80_1637, Static68.aClass80_588, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static74.aClass3_Sub1_Sub4_Sub4Array14 == null) {
				Static74.aClass3_Sub1_Sub4_Sub4Array14 = Static43.method654(Static185.aClass80_1637, Static57.aClass80_494, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static23.aClass3_Sub1_Sub4_Sub4Array6 == null) {
				Static23.aClass3_Sub1_Sub4_Sub4Array6 = Static43.method654(Static185.aClass80_1637, Static42.aClass80_353, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static187.aClass3_Sub1_Sub4_Sub4Array16 == null) {
				Static187.aClass3_Sub1_Sub4_Sub4Array16 = Static43.method654(Static185.aClass80_1637, Static169.aClass80_387, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static181.aClass3_Sub1_Sub4_Sub4Array15 == null) {
				Static181.aClass3_Sub1_Sub4_Sub4Array15 = Static43.method654(Static185.aClass80_1637, Static187.aClass80_1668, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static12.aClass3_Sub1_Sub4_Sub4Array2 == null) {
				Static12.aClass3_Sub1_Sub4_Sub4Array2 = Static43.method654(Static185.aClass80_1637, Static17.aClass80_132, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static9.aClass3_Sub1_Sub4_Sub4Array3 == null) {
				Static9.aClass3_Sub1_Sub4_Sub4Array3 = Static43.method654(Static185.aClass80_1637, Static147.aClass80_1283, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static29.aClass3_Sub1_Sub4_Sub4_7 == null) {
				Static29.aClass3_Sub1_Sub4_Sub4_7 = Static104.method1561(Static130.aClass1_Sub1_21, Static47.aClass80_398, Static185.aClass80_1637);
			} else {
				local17++;
			}
			if (Static22.aClass3_Sub1_Sub4_Sub4Array5 == null) {
				Static22.aClass3_Sub1_Sub4_Sub4Array5 = Static43.method654(Static185.aClass80_1637, Static139.aClass80_1167, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static75.aClass3_Sub1_Sub4_Sub4Array10 == null) {
				Static75.aClass3_Sub1_Sub4_Sub4Array10 = Static43.method654(Static185.aClass80_1637, Static26.aClass80_204, Static130.aClass1_Sub1_21);
			} else {
				local17++;
			}
			if (Static75.aClass3_Sub1_Sub4_Sub1Array2 == null) {
				Static75.aClass3_Sub1_Sub4_Sub1Array2 = Static171.method2758(Static130.aClass1_Sub1_21, Static107.aClass80_943, Static185.aClass80_1637);
			} else {
				local17++;
			}
			if (Static44.aClass3_Sub1_Sub4_Sub1Array1 == null) {
				Static44.aClass3_Sub1_Sub4_Sub1Array1 = Static171.method2758(Static130.aClass1_Sub1_21, Static46.aClass80_397, Static185.aClass80_1637);
			} else {
				local17++;
			}
			if (Static185.aClass3_Sub1_Sub4_Sub1Array11 == null) {
				Static185.aClass3_Sub1_Sub4_Sub1Array11 = Static171.method2758(Static130.aClass1_Sub1_21, Static185.aClass80_1638, Static185.aClass80_1637);
			} else {
				local17++;
			}
			if (local17 < 15) {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static29.aClass80_227, Static83.method1219(local17 * 100 / 13), Static19.aClass80_145 });
				Static78.anInt1720 = 70;
			} else {
				Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1.method2267(Static44.aClass3_Sub1_Sub4_Sub1Array1, null);
				Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7.method2267(Static44.aClass3_Sub1_Sub4_Sub1Array1, null);
				Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2267(Static44.aClass3_Sub1_Sub4_Sub1Array1, null);
				if (Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1 != Static121.aClass3_Sub1_Sub4_Sub3_Sub1_3) {
					Static121.aClass3_Sub1_Sub4_Sub3_Sub1_3.method2267(Static44.aClass3_Sub1_Sub4_Sub1Array1, null);
				}
				for (local61 = 0; local61 < Static9.aClass3_Sub1_Sub4_Sub4Array3.length; local61++) {
					Static9.aClass3_Sub1_Sub4_Sub4Array3[local61].method2584();
				}
				for (local71 = 0; local71 < Static185.aClass3_Sub1_Sub4_Sub1Array11.length; local71++) {
					Static185.aClass3_Sub1_Sub4_Sub1Array11[local71].method566();
				}
				Static64.aClass3_Sub1_Sub4_Sub4_15.method2584();
				local81 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1229) int local1229 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1236) int local1236 = (int) (Math.random() * 41.0D) - 20;
				local75 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1245) int local1245 = 0; local1245 < Static42.aClass3_Sub1_Sub4_Sub4Array7.length; local1245++) {
					Static42.aClass3_Sub1_Sub4_Sub4Array7[local1245].method2593(local81 + local1236, local75 - -local1236, local1229 + local1236);
				}
				Static125.aClass3_Sub1_Sub4_Sub1Array5[0].method568(local81 + local1236, local75 + local1236, local1229 + local1236);
				Static78.aClass80_672 = Static13.aClass80_95;
				Static78.anInt1720 = 70;
				Static173.anInt3888 = 90;
			}
		} else if (Static173.anInt3888 == 90) {
			if (Static83.aClass1_Sub1_12.method39()) {
				@Pc(1332) Class86 local1332 = new Class86(Static83.aClass1_Sub1_12, Static130.aClass1_Sub1_21, 20, Static96.aBoolean83 ? 64 : 128);
				Static65.method965(local1332);
				Static65.method960(0.7F);
				Static78.anInt1720 = 90;
				Static78.aClass80_672 = Static152.aClass80_1332;
				Static173.anInt3888 = 110;
			} else {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static116.aClass80_1743, Static83.method1219(Static83.aClass1_Sub1_12.method44()), Static19.aClass80_145 });
				Static78.anInt1720 = 90;
			}
		} else if (Static173.anInt3888 == 110) {
			Static142.aClass2_1 = new Class2();
			Static58.aClass61_1.method1792(10, Static142.aClass2_1);
			Static173.anInt3888 = 120;
			Static78.aClass80_672 = Static109.aClass80_963;
			Static78.anInt1720 = 94;
		} else if (Static173.anInt3888 == 120) {
			if (Static166.aClass1_Sub1_28.method48(Static185.aClass80_1637, Static138.aClass80_1157)) {
				@Pc(1399) Class19 local1399 = new Class19(Static166.aClass1_Sub1_28.method38(Static185.aClass80_1637, Static138.aClass80_1157));
				Static153.method452(local1399);
				Static78.aClass80_672 = Static196.aClass80_1514;
				Static78.anInt1720 = 96;
				Static173.anInt3888 = 130;
			} else {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static157.aClass80_1359, Static166.aClass80_1430 });
				Static78.anInt1720 = 96;
			}
		} else if (Static173.anInt3888 == 130) {
			if (!Static142.aClass1_Sub1_23.method39()) {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static57.aClass80_493, Static83.method1219(Static142.aClass1_Sub1_23.method44() * 4 / 5), Static19.aClass80_145 });
				Static78.anInt1720 = 100;
			} else if (!Static48.aClass1_Sub1_6.method39()) {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static57.aClass80_493, Static83.method1219(Static48.aClass1_Sub1_6.method44() / 6 + 80), Static19.aClass80_145 });
				Static78.anInt1720 = 100;
			} else if (Static52.aClass1_Sub1_7.method39()) {
				Static78.anInt1720 = 100;
				Static78.aClass80_672 = Static88.aClass80_719;
				Static173.anInt3888 = 140;
			} else {
				Static78.aClass80_672 = Static154.method2467(new Class80[] { Static57.aClass80_493, Static83.method1219(Static52.aClass1_Sub1_7.method44() / 20 + 96), Static19.aClass80_145 });
				Static78.anInt1720 = 100;
			}
		} else if (Static173.anInt3888 == 140) {
			Static100.aClass1_Sub1_16.method54(false);
			Static102.aClass1_Sub1_17.method54(true);
			Static130.aClass1_Sub1_21.method54(true);
			Static52.aClass1_Sub1_7.method54(true);
			Static166.aClass1_Sub1_28.method54(true);
			Static132.method2019(10);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method466() {
		if (Static21.anInt516 != 1000) {
			@Pc(14) boolean local14 = Static134.method2365();
			if (!local14) {
				this.method467();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method467() {
		if (Static190.anInt4382 >= 4) {
			this.method445("js5crc");
			Static21.anInt516 = 1000;
			return;
		}
		if (Static112.anInt2525 >= 4) {
			if (Static21.anInt516 <= 5) {
				this.method445("js5io");
				Static21.anInt516 = 1000;
				return;
			}
			Static112.anInt2525 = 3;
			Static162.anInt3639 = 3000;
		}
		if (Static162.anInt3639-- > 0) {
			return;
		}
		try {
			if (Static133.anInt2863 == 0) {
				Static59.aClass94_2 = Static58.aClass61_1.method1790(Static60.anInt1320, Static46.aString2);
				Static133.anInt2863++;
			}
			if (Static133.anInt2863 == 1) {
				if (Static59.aClass94_2.anInt4472 == 2) {
					this.method468(-1);
					return;
				}
				if (Static59.aClass94_2.anInt4472 == 1) {
					Static133.anInt2863++;
				}
			}
			if (Static133.anInt2863 == 2) {
				Static89.aClass78_3 = new Class78((Socket) Static59.aClass94_2.anObject3, Static58.aClass61_1);
				@Pc(98) Class3_Sub17 local98 = new Class3_Sub17(5);
				local98.method2108(15);
				local98.method2131(489);
				Static89.aClass78_3.method2419(local98.aByteArray40, 5);
				Static133.anInt2863++;
				Static166.aLong124 = Static86.method1251();
			}
			if (Static133.anInt2863 == 3) {
				if (Static21.anInt516 <= 5 || Static89.aClass78_3.method2416() > 0) {
					@Pc(160) int local160 = Static89.aClass78_3.method2418();
					if (local160 != 0) {
						this.method468(local160);
						return;
					}
					Static133.anInt2863++;
				} else if (Static86.method1251() - Static166.aLong124 > 30000L) {
					this.method468(-2);
					return;
				}
			}
			if (Static133.anInt2863 == 4) {
				Static171.method2756(Static89.aClass78_3, Static21.anInt516 > 20);
				Static89.aClass78_3 = null;
				Static133.anInt2863 = 0;
				Static38.anInt863 = 0;
				Static59.aClass94_2 = null;
			}
		} catch (@Pc(200) IOException local200) {
			this.method468(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method450() {
		@Pc(4) boolean local4 = Static95.method2643();
		if (local4 && Static124.aBoolean108 && Static126.aClass38_2 != null) {
			Static126.aClass38_2.method2954();
		}
		if (Static19.aBoolean27) {
			Static98.method1467(Static146.aCanvas1);
			Static136.method2062(Static146.aCanvas1);
			if (Static143.aClass24_1 != null) {
				Static143.aClass24_1.method694(Static146.aCanvas1);
			}
			this.method459();
			Static27.method3146(Static146.aCanvas1);
			Static121.method1832(Static146.aCanvas1);
			if (Static143.aClass24_1 != null) {
				Static143.aClass24_1.method692(Static146.aCanvas1);
			}
		}
		if (Static21.anInt516 == 0) {
			Static72.method2938(null, Static78.aClass80_672, Static78.anInt1720);
		} else if (Static21.anInt516 == 5) {
			Static89.method1310(Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1, Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6);
		} else if (Static21.anInt516 == 10) {
			Static89.method1310(Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1, Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6);
		} else if (Static21.anInt516 == 20) {
			Static89.method1310(Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1, Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6);
		} else if (Static21.anInt516 == 25) {
			@Pc(110) int local110;
			if (Static106.anInt2202 == 1) {
				if (Static79.anInt1735 < Static175.anInt3942) {
					Static79.anInt1735 = Static175.anInt3942;
				}
				local110 = (Static79.anInt1735 - Static175.anInt3942) * 50 / Static79.anInt1735;
				Static126.method1869(Static154.method2467(new Class80[] { Static196.aClass80_1517, Static83.aClass80_684, Static83.method1219(local110), Static146.aClass80_1261 }), false);
			} else if (Static106.anInt2202 == 2) {
				if (Static46.anInt1063 < Static193.anInt4408) {
					Static46.anInt1063 = Static193.anInt4408;
				}
				local110 = (Static46.anInt1063 - Static193.anInt4408) * 50 / Static46.anInt1063 + 50;
				Static126.method1869(Static154.method2467(new Class80[] { Static196.aClass80_1517, Static83.aClass80_684, Static83.method1219(local110), Static146.aClass80_1261 }), false);
			} else {
				Static126.method1869(Static196.aClass80_1517, false);
			}
		} else if (Static21.anInt516 == 30) {
			Static191.method3098();
		} else if (Static21.anInt516 == 40) {
			Static126.method1869(Static154.method2467(new Class80[] { Static114.aClass80_1010, Static104.aClass80_887, Static28.aClass80_218 }), false);
		}
		@Pc(260) int local260;
		@Pc(250) Graphics local250;
		if (Static21.anInt516 == 30 && Static102.anInt2141 == 0 && !Static180.aBoolean158) {
			try {
				local250 = Static146.aCanvas1.getGraphics();
				for (local260 = 0; local260 < Static60.anInt1321; local260++) {
					if (Static158.aBooleanArray18[local260]) {
						Static60.aClass32_1.method1275(local250, Static130.anIntArray379[local260], Static33.anIntArray99[local260], Static148.anIntArray427[local260], Static160.anIntArray444[local260]);
						Static158.aBooleanArray18[local260] = false;
					}
				}
			} catch (@Pc(316) Exception local316) {
				Static146.aCanvas1.repaint();
			}
		} else if (Static21.anInt516 > 0) {
			try {
				local250 = Static146.aCanvas1.getGraphics();
				Static60.aClass32_1.method1278(local250);
				Static180.aBoolean158 = false;
				for (local260 = 0; local260 < Static60.anInt1321; local260++) {
					Static158.aBooleanArray18[local260] = false;
				}
			} catch (@Pc(272) Exception local272) {
				Static146.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method468(@OriginalArg(0) int arg0) {
		Static38.anInt863++;
		if (Static100.anInt2099 == Static60.anInt1320) {
			Static60.anInt1320 = Static22.anInt537;
		} else {
			Static60.anInt1320 = Static100.anInt2099;
		}
		Static59.aClass94_2 = null;
		Static133.anInt2863 = 0;
		Static89.aClass78_3 = null;
		if (Static38.anInt863 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static21.anInt516 <= 5) {
				this.method445("js5connect_full");
				Static21.anInt516 = 1000;
			} else {
				Static162.anInt3639 = 3000;
			}
		} else if (Static38.anInt863 >= 2 && arg0 == 6) {
			this.method445("js5connect_outofdate");
			Static21.anInt516 = 1000;
		} else if (Static38.anInt863 >= 4) {
			if (Static21.anInt516 > 5) {
				Static162.anInt3639 = 3000;
			} else {
				this.method445("js5connect");
				Static21.anInt516 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method461()) {
			return;
		}
		Static120.anInt2639 = Integer.parseInt(this.getParameter("worldid"));
		Static145.anInt3190 = Integer.parseInt(this.getParameter("modewhat"));
		Static94.anInt2013 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static193.method3105();
		} else {
			Static177.method2839();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static156.aBoolean143 = true;
		} else {
			Static156.aBoolean143 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static194.method3139();
			Static185.aClass80_1640 = Static33.aClass80_256;
			Static44.anInt1005 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static44.anInt1010 = 1;
		} else {
			Static44.anInt1010 = 0;
		}
		try {
			Static196.anInt3935 = Integer.parseInt(this.getParameter("js"));
			Static85.anInt1782 = Integer.parseInt(this.getParameter("plug"));
			Static145.anInt3182 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(106) Exception local106) {
		}
		Static53.aClass80_456 = Static177.aClass80_1531.method2435(this);
		if (Static53.aClass80_456 == null) {
			Static53.aClass80_456 = Static185.aClass80_1637;
		}
		Static46.aString2 = this.getCodeBase().getHost();
		this.method446(Static145.anInt3190 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method455() {
		if (Static142.aClass2_1 != null) {
			Static142.aClass2_1.aBoolean7 = false;
		}
		Static142.aClass2_1 = null;
		if (Static31.aClass78_1 != null) {
			Static31.aClass78_1.method2417();
			Static31.aClass78_1 = null;
		}
		Static98.method1467(Static146.aCanvas1);
		Static136.method2062(Static146.aCanvas1);
		if (Static143.aClass24_1 != null) {
			Static143.aClass24_1.method694(Static146.aCanvas1);
		}
		Static3.method119();
		Static88.method1282();
		Static143.aClass24_1 = null;
		if (Static126.aClass38_2 != null) {
			Static126.aClass38_2.method2941();
		}
		if (Static54.aClass38_1 != null) {
			Static54.aClass38_1.method2941();
		}
		Static69.method1036();
		Static74.method2636();
		try {
			if (Static180.aClass74_4 != null) {
				Static180.aClass74_4.method2075();
			}
			if (Static66.aClass74Array1 != null) {
				for (@Pc(68) int local68 = 0; local68 < Static66.aClass74Array1.length; local68++) {
					if (Static66.aClass74Array1[local68] != null) {
						Static66.aClass74Array1[local68].method2075();
					}
				}
			}
			if (Static170.aClass74_3 != null) {
				Static170.aClass74_3.method2075();
			}
			if (Static194.aClass74_5 != null) {
				Static194.aClass74_5.method2075();
			}
		} catch (@Pc(96) IOException local96) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method453() {
		Static193.anInt4411++;
		if (Static193.anInt4411 % 1000 == 1) {
			@Pc(14) GregorianCalendar local14 = new GregorianCalendar();
			Static66.anInt1443 = local14.get(11) * 600 + local14.get(12) * 10 + local14.get(13) / 6;
			Static113.aRandom1.setSeed((long) Static66.anInt1443);
		}
		this.method466();
		Static140.method2166();
		Static60.method892();
		Static174.method2812();
		Static181.method2900();
		Static128.method1940();
		if (Static143.aClass24_1 != null) {
			@Pc(67) int local67 = Static143.aClass24_1.method699();
			Static147.anInt3297 = local67;
		}
		if (Static21.anInt516 == 0) {
			this.method465();
			Static177.method2837();
		} else if (Static21.anInt516 == 5) {
			Static43.method658(this);
			this.method465();
			Static177.method2837();
		} else if (Static21.anInt516 == 10) {
			Static43.method658(this);
		} else if (Static21.anInt516 == 20) {
			Static43.method658(this);
			Static48.method730();
		} else if (Static21.anInt516 == 25) {
			Static75.method1112();
		}
		if (Static21.anInt516 == 30) {
			Static66.method980();
		} else if (Static21.anInt516 == 40) {
			Static48.method730();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method457() {
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method463() {
		Static22.anInt537 = Static94.anInt2013 == 0 ? 443 : Static120.anInt2639 + 50000;
		Static100.anInt2099 = Static94.anInt2013 == 0 ? 43594 : Static120.anInt2639 + 40000;
		if (Static44.anInt1010 == 1) {
			Static131.aShortArray53 = Static90.aShortArray18;
			Static47.aShortArray16 = Static168.aShortArray47;
			Static145.aShortArrayArray5 = Static187.aShortArrayArray6;
			Static140.aShortArrayArray4 = Static42.aShortArrayArray1;
		} else {
			Static131.aShortArray53 = Static169.aShortArray15;
			Static47.aShortArray16 = Static61.aShortArray17;
			Static145.aShortArrayArray5 = Static110.aShortArrayArray3;
			Static140.aShortArrayArray4 = Static46.aShortArrayArray2;
		}
		Static60.anInt1320 = Static100.anInt2099;
		Static27.method3149();
		Static27.method3146(Static146.aCanvas1);
		Static121.method1832(Static146.aCanvas1);
		Static143.aClass24_1 = Static152.method2422();
		if (Static143.aClass24_1 != null) {
			Static143.aClass24_1.method692(Static146.aCanvas1);
		}
		Static12.anInt42 = Static117.anInt2595;
		try {
			if (Static58.aClass61_1.aClass66_2 != null) {
				Static180.aClass74_4 = new Class74(Static58.aClass61_1.aClass66_2, 5200, 0);
				for (@Pc(91) int local91 = 0; local91 < 23; local91++) {
					Static66.aClass74Array1[local91] = new Class74(Static58.aClass61_1.aClass66Array1[local91], 6000, 0);
				}
				Static170.aClass74_3 = new Class74(Static58.aClass61_1.aClass66_1, 6000, 0);
				Static175.aClass53_4 = new Class53(255, Static180.aClass74_4, Static170.aClass74_3, 500000);
				Static194.aClass74_5 = new Class74(Static58.aClass61_1.aClass66_3, 24, 0);
				Static58.aClass61_1.aClass66Array1 = null;
				Static58.aClass61_1.aClass66_3 = null;
				Static58.aClass61_1.aClass66_1 = null;
				Static58.aClass61_1.aClass66_2 = null;
			}
		} catch (@Pc(147) IOException local147) {
			Static180.aClass74_4 = null;
			Static175.aClass53_4 = null;
			Static170.aClass74_3 = null;
			Static194.aClass74_5 = null;
		}
		if (Static94.anInt2013 != 0) {
			Static51.aBoolean49 = true;
		}
	}
}
