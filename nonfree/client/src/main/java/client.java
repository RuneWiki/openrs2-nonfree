import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static307.method4211("Argument count");
			}
			Static72.aClass265_2 = new Class265();
			Static72.aClass265_2.anInt7137 = Integer.parseInt(arg0[0]);
			Static447.aClass265_5 = new Class265();
			Static447.aClass265_5.anInt7137 = Integer.parseInt(arg0[1]);
			Static149.aClass265_4 = new Class265();
			Static149.aClass265_4.anInt7137 = Integer.parseInt(arg0[2]);
			Static260.aClass258_7 = Static236.aClass258_6;
			if (arg0[3].equals("live")) {
				Static163.aClass60_1 = Static232.aClass60_2;
			} else if (arg0[3].equals("rc")) {
				Static163.aClass60_1 = Static303.aClass60_3;
			} else if (arg0[3].equals("wip")) {
				Static163.aClass60_1 = Static381.aClass60_4;
			} else {
				Static307.method4211("modewhat");
			}
			Static331.anInt5597 = Static430.method5386(arg0[4]);
			if (Static331.anInt5597 == -1) {
				if (arg0[4].equals("english")) {
					Static331.anInt5597 = 0;
				} else if (arg0[4].equals("german")) {
					Static331.anInt5597 = 1;
				} else {
					Static307.method4211("language");
				}
			}
			Static359.aBoolean442 = false;
			Static79.aBoolean118 = false;
			if (arg0[5].equals("game0")) {
				Static118.aClass4_1 = Static193.aClass4_2;
			} else if (arg0[5].equals("game1")) {
				Static118.aClass4_1 = Static270.aClass4_3;
			} else {
				Static307.method4211("game");
			}
			Static235.anInt3810 = 0;
			Static460.anInt7063 = Static118.aClass4_1.anInt73;
			Static294.anInt979 = 0;
			Static59.aBoolean185 = false;
			Static47.aBoolean72 = true;
			Static291.aBoolean337 = true;
			Static182.aString95 = "";
			@Pc(156) client local156 = new client();
			Static320.aClient1 = local156;
			local156.method795(Static163.aClass60_1.method1385() + 32, Static118.aClass4_1.aString6);
			Static261.aFrame3.setLocation(40, 40);
		} catch (@Pc(179) Exception local179) {
			Static434.method5460(local179, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method797() {
		@Pc(6) int local6;
		if (!Static2.aClass148_Sub1_1.aBoolean262) {
			for (local6 = 0; local6 < Static380.anInt440; local6++) {
				if (Static55.aClass7Array1[local6].method136() == 's' || Static55.aClass7Array1[local6].method136() == 'S') {
					Static2.aClass148_Sub1_1.aBoolean262 = true;
					break;
				}
			}
		}
		@Pc(49) int local49;
		if (Static59.anInt3108 == 0) {
			@Pc(39) Runtime local39 = Runtime.getRuntime();
			local49 = (int) ((local39.totalMemory() - local39.freeMemory()) / 1024L);
			@Pc(52) long local52 = Static110.method1702();
			if (Static22.aLong9 == 0L) {
				Static22.aLong9 = local52;
			}
			if (local49 > 16384 && local52 - Static22.aLong9 < 5000L) {
				if (local52 - Static224.aLong119 > 1000L) {
					System.gc();
					Static224.aLong119 = local52;
				}
				Static378.aString175 = Static176.aClass134_4.method2720(Static331.anInt5597);
				Static13.anInt178 = 5;
			} else {
				Static378.aString175 = Static440.aClass134_103.method2720(Static331.anInt5597);
				Static13.anInt178 = 5;
				Static59.anInt3108 = 10;
			}
		} else if (Static59.anInt3108 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static361.aClass71Array1[local6] = Static338.method4532(Static426.anInt6923, Static166.anInt2852);
			}
			Static378.aString175 = Static276.aClass134_68.method2720(Static331.anInt5597);
			Static59.anInt3108 = 20;
			Static13.anInt178 = 10;
		} else if (Static59.anInt3108 == 20) {
			if (Static325.aClass168_1 == null) {
				Static325.aClass168_1 = new Class168(Static24.aClass84_1, Static197.aClass70_1);
			}
			if (Static325.aClass168_1.method3633()) {
				Static37.aClass54_106 = Static79.method1165(0, true, false);
				Static222.aClass54_94 = Static79.method1165(1, true, false);
				Static24.aClass54_5 = Static79.method1165(2, true, false);
				Static134.aClass54_39 = Static79.method1165(3, true, false);
				Static427.aClass54_115 = Static79.method1165(4, true, false);
				Static309.aClass54_84 = Static79.method1165(5, true, true);
				Static120.aClass54_36 = Static79.method1165(6, false, true);
				Static145.aClass54_44 = Static79.method1165(7, true, false);
				Static103.aClass54_28 = Static79.method1165(8, true, false);
				Static385.aClass54_105 = Static79.method1165(9, true, false);
				Static294.aClass54_21 = Static79.method1165(10, true, false);
				Static11.aClass54_3 = Static79.method1165(11, true, false);
				Static96.aClass54_29 = Static79.method1165(12, true, false);
				Static77.aClass54_26 = Static79.method1165(13, true, false);
				Static217.aClass54_64 = Static79.method1165(14, false, false);
				Static335.aClass54_92 = Static79.method1165(15, true, false);
				Static307.aClass54_83 = Static79.method1165(16, true, false);
				Static363.aClass54_100 = Static79.method1165(17, true, false);
				Static37.aClass54_107 = Static79.method1165(18, true, false);
				Static208.aClass54_60 = Static79.method1165(19, true, false);
				Static172.aClass54_50 = Static79.method1165(20, true, false);
				Static33.aClass54_11 = Static79.method1165(21, true, false);
				Static231.aClass54_69 = Static79.method1165(22, true, false);
				Static280.aClass54_78 = Static79.method1165(23, true, true);
				Static179.aClass54_51 = Static79.method1165(24, true, false);
				Static411.aClass54_110 = Static79.method1165(25, true, false);
				Static381.aClass54_104 = Static79.method1165(26, true, true);
				Static409.aClass54_109 = Static79.method1165(27, true, false);
				Static221.aClass54_67 = Static79.method1165(28, true, true);
				Static102.aClass54_31 = Static79.method1165(29, true, false);
				Static378.aString175 = Static77.aClass134_24.method2720(Static331.anInt5597);
				Static13.anInt178 = 15;
				Static59.anInt3108 = 30;
			} else {
				Static378.aString175 = Static258.aClass134_64.method2720(Static331.anInt5597);
				Static13.anInt178 = 12;
			}
		} else if (Static59.anInt3108 == 30) {
			local6 = 0;
			for (local49 = 0; local49 < 30; local49++) {
				local6 += Static87.aClass14_Sub1Array5[local49].method2739() * Static260.anIntArray362[local49] / 100;
			}
			if (local6 == 100) {
				Static378.aString175 = Static268.aClass134_65.method2720(Static331.anInt5597);
				Static13.anInt178 = 20;
				Static302.method3971(Static103.aClass54_28);
				Static382.method4914(Static103.aClass54_28);
				Static59.anInt3108 = 40;
			} else {
				if (local6 != 0) {
					Static378.aString175 = Static78.aClass134_25.method2720(Static331.anInt5597) + local6 + "%";
				}
				Static13.anInt178 = 20;
			}
		} else if (Static59.anInt3108 == 40) {
			if (Static221.aClass54_67.method1111()) {
				this.method805(Static221.aClass54_67.method1110(1));
				Static378.aString175 = Static3.aClass134_2.method2720(Static331.anInt5597);
				Static59.anInt3108 = 50;
				Static13.anInt178 = 25;
			} else {
				Static378.aString175 = Static75.aClass134_23.method2720(Static331.anInt5597) + Static221.aClass54_67.method1127() + "%";
				Static13.anInt178 = 25;
			}
		} else if (Static59.anInt3108 == 50) {
			Static127.method1894();
			Static378.aString175 = Static413.aClass134_98.method2720(Static331.anInt5597);
			Static59.anInt3108 = 60;
			Static13.anInt178 = 30;
		} else if (Static59.anInt3108 == 60) {
			local6 = Static90.method1415(Static103.aClass54_28, Static77.aClass54_26);
			local49 = Static16.method203();
			if (local49 > local6) {
				Static378.aString175 = Static193.aClass134_56.method2720(Static331.anInt5597) + local6 * 100 / local49 + "%";
				Static13.anInt178 = 35;
			} else {
				Static378.aString175 = Static217.aClass134_58.method2720(Static331.anInt5597);
				Static59.anInt3108 = 70;
				Static13.anInt178 = 35;
			}
		} else if (Static59.anInt3108 == 70) {
			local6 = Static124.method880(Static103.aClass54_28);
			local49 = Static288.method3842();
			if (local6 < local49) {
				Static378.aString175 = Static270.aClass134_66.method2720(Static331.anInt5597) + local6 * 100 / local49 + "%";
				Static13.anInt178 = 40;
			} else {
				Static378.aString175 = Static120.aClass134_41.method2720(Static331.anInt5597);
				Static59.anInt3108 = 80;
				Static13.anInt178 = 40;
			}
		} else if (Static59.anInt3108 == 80) {
			if (Static381.aClass54_104.method1111()) {
				Static65.anInterface9_6 = new Class79(Static381.aClass54_104, Static385.aClass54_105, Static103.aClass54_28);
				Static378.aString175 = Static133.aClass134_44.method2720(Static331.anInt5597);
				Static13.anInt178 = 45;
				Static59.anInt3108 = 90;
			} else {
				Static378.aString175 = Static350.aClass134_83.method2720(Static331.anInt5597) + Static381.aClass54_104.method1127() + "%";
				Static13.anInt178 = 45;
			}
		} else if (Static59.anInt3108 == 90) {
			Static378.aString175 = Static308.aClass134_74.method2720(Static331.anInt5597);
			Static59.anInt3108 = 95;
			Static13.anInt178 = 50;
		} else if (Static59.anInt3108 == 95) {
			if (Static2.aClass148_Sub1_1.aBoolean262) {
				Static2.aClass148_Sub1_1.anInt3796 = 0;
				Static2.aClass148_Sub1_1.anInt3795 = 0;
				Static2.aClass148_Sub1_1.anInt3781 = 0;
				Static2.aClass148_Sub1_1.anInt3776 = 0;
				Static2.aClass148_Sub1_1.anInt3787 = 1;
			}
			Static2.aClass148_Sub1_1.aBoolean262 = true;
			Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
			Static405.method5143(Static2.aClass148_Sub1_1.anInt3795, false);
			Static378.aString175 = Static354.aClass134_84.method2720(Static331.anInt5597);
			Static13.anInt178 = 55;
			Static59.anInt3108 = 100;
		} else if (Static59.anInt3108 == 100) {
			Static272.method3656(Static103.aClass54_28, Static82.aClass163_1, Static77.aClass54_26);
			Static378.aString175 = Static323.aClass134_39.method2720(Static331.anInt5597);
			Static13.anInt178 = 60;
			Static37.method5022(1);
			Static59.anInt3108 = 110;
		} else if (Static59.anInt3108 == 110) {
			Static24.aClass54_5.method1111();
			local6 = Static24.aClass54_5.method1127();
			Static307.aClass54_83.method1111();
			local6 += Static307.aClass54_83.method1127();
			Static363.aClass54_100.method1111();
			local6 += Static363.aClass54_100.method1127();
			Static37.aClass54_107.method1111();
			local6 += Static37.aClass54_107.method1127();
			Static208.aClass54_60.method1111();
			local6 += Static208.aClass54_60.method1127();
			Static172.aClass54_50.method1111();
			local6 += Static172.aClass54_50.method1127();
			Static33.aClass54_11.method1111();
			local6 += Static33.aClass54_11.method1127();
			Static231.aClass54_69.method1111();
			local6 += Static231.aClass54_69.method1127();
			Static179.aClass54_51.method1111();
			local6 += Static179.aClass54_51.method1127();
			Static411.aClass54_110.method1111();
			local6 += Static411.aClass54_110.method1127();
			Static409.aClass54_109.method1111();
			local6 += Static409.aClass54_109.method1127();
			Static102.aClass54_31.method1111();
			local6 += Static102.aClass54_31.method1127();
			if (local6 < 1200) {
				Static378.aString175 = Static412.aClass134_95.method2720(Static331.anInt5597) + local6 / 12 + "%";
				Static13.anInt178 = 65;
			} else {
				Static234.aClass135_1 = new Class135(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static56.aClass150_1 = new Class150(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static185.aClass201_2 = new Class201(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5, Static103.aClass54_28);
				Static128.aClass11_1 = new Class11(Static118.aClass4_1, Static331.anInt5597, Static363.aClass54_100);
				Static323.aClass218_2 = new Class218(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static246.aClass153_4 = new Class153(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static394.aClass47_2 = new Class47(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5, Static145.aClass54_44);
				Static331.aClass271_1 = new Class271(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static206.aClass176_1 = new Class176(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static50.aClass190_1 = new Class190(Static118.aClass4_1, Static331.anInt5597, true, Static307.aClass54_83, Static145.aClass54_44);
				Static193.aClass120_2 = new Class120(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5, Static103.aClass54_28);
				Static70.aClass97_1 = new Class97(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5, Static103.aClass54_28);
				Static155.aClass263_1 = new Class263(Static118.aClass4_1, Static331.anInt5597, true, Static37.aClass54_107, Static145.aClass54_44);
				Static384.aClass164_2 = new Class164(Static118.aClass4_1, Static331.anInt5597, true, Static234.aClass135_1, Static208.aClass54_60, Static145.aClass54_44);
				Static19.aClass96_1 = new Class96(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static334.aClass62_2 = new Class62(Static118.aClass4_1, Static331.anInt5597, Static172.aClass54_50, Static37.aClass54_106, Static222.aClass54_94);
				Static91.aClass180_1 = new Class180(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static231.aClass129_1 = new Class129(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static431.aClass36_2 = new Class36(Static118.aClass4_1, Static331.anInt5597, Static33.aClass54_11, Static145.aClass54_44);
				Static343.aClass27_1 = new Class27(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static75.aClass69_1 = new Class69(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static343.aClass23_1 = new Class23(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static291.aClass8_1 = new Class8(Static118.aClass4_1, Static331.anInt5597, Static231.aClass54_69);
				Static275.aClass138_1 = new Class138(Static118.aClass4_1, Static331.anInt5597, Static24.aClass54_5);
				Static289.method3853(Static145.aClass54_44, Static134.aClass54_39, Static103.aClass54_28, Static77.aClass54_26);
				Static243.method475(Static102.aClass54_31);
				Static456.aClass198_1 = new Class198(Static331.anInt5597, Static179.aClass54_51, Static411.aClass54_110);
				Static216.aClass219_1 = new Class219(Static331.anInt5597, Static179.aClass54_51, Static411.aClass54_110, new Class257());
				Static378.aString175 = Static103.aClass134_33.method2720(Static331.anInt5597);
				Static13.anInt178 = 65;
				Static145.method2126();
				Static50.aClass190_1.method4214(!Static2.aClass148_Sub1_1.method3047(Static288.anInt4743));
				Static138.aClass268_1 = new Class268();
				Static361.method4755();
				Static197.method2654(Static409.aClass54_109);
				Static133.method1985(Static145.aClass54_44, Static65.anInterface9_6);
				Static59.anInt3108 = 120;
			}
		} else if (Static59.anInt3108 == 120) {
			local6 = Static138.method2026(Static103.aClass54_28);
			local49 = Static167.method2365();
			if (local6 < local49) {
				Static378.aString175 = Static292.aClass134_71.method2720(Static331.anInt5597) + local6 * 100 / local49 + "%";
				Static13.anInt178 = 70;
			} else {
				Static449.method5643(Static103.aClass54_28, Static82.aClass163_1);
				Static111.method1710(Static108.aClass13Array5);
				Static378.aString175 = Static175.aClass134_55.method2720(Static331.anInt5597);
				Static59.anInt3108 = 130;
				Static13.anInt178 = 70;
			}
		} else if (Static59.anInt3108 == 130) {
			if (Static294.aClass54_21.method1128("huffman", "")) {
				@Pc(1230) Class131 local1230 = new Class131(Static294.aClass54_21.method1104("", "huffman"));
				Static176.method72(local1230);
				Static378.aString175 = Static407.aClass134_93.method2720(Static331.anInt5597);
				Static13.anInt178 = 75;
				Static59.anInt3108 = 140;
			} else {
				Static378.aString175 = Static278.aClass134_69.method2720(Static331.anInt5597) + "0%";
				Static13.anInt178 = 75;
			}
		} else if (Static59.anInt3108 == 140) {
			if (Static134.aClass54_39.method1111()) {
				Static378.aString175 = Static459.aClass134_63.method2720(Static331.anInt5597);
				Static59.anInt3108 = 150;
				Static13.anInt178 = 80;
			} else {
				Static378.aString175 = Static375.aClass134_86.method2720(Static331.anInt5597) + Static134.aClass54_39.method1127() + "%";
				Static13.anInt178 = 80;
			}
		} else if (Static59.anInt3108 == 150) {
			if (Static96.aClass54_29.method1111()) {
				Static378.aString175 = Static108.aClass134_35.method2720(Static331.anInt5597);
				Static59.anInt3108 = 160;
				Static13.anInt178 = 82;
			} else {
				Static378.aString175 = Static48.aClass134_16.method2720(Static331.anInt5597) + Static96.aClass54_29.method1127() + "%";
				Static13.anInt178 = 82;
			}
		} else if (Static59.anInt3108 == 160) {
			if (Static77.aClass54_26.method1111()) {
				Static378.aString175 = Static433.aClass134_102.method2720(Static331.anInt5597);
				Static13.anInt178 = 85;
				Static59.anInt3108 = 170;
			} else {
				Static378.aString175 = Static433.aClass134_102.method2720(Static331.anInt5597) + Static77.aClass54_26.method1127() + "%";
				Static13.anInt178 = 85;
			}
		} else if (Static59.anInt3108 == 170) {
			if (Static280.aClass54_78.method1105("details")) {
				Static282.method2787(Static280.aClass54_78, Static323.aClass218_2, Static246.aClass153_4, Static50.aClass190_1, Static193.aClass120_2, Static70.aClass97_1, Static138.aClass268_1);
				Static378.aString175 = Static406.aClass134_92.method2720(Static331.anInt5597);
				Static13.anInt178 = 89;
				Static59.anInt3108 = 190;
			} else {
				Static378.aString175 = Static6.aClass134_6.method2720(Static331.anInt5597) + Static280.aClass54_78.method1108("details") + "%";
				Static13.anInt178 = 87;
			}
		} else if (Static59.anInt3108 == 190) {
			Static270.aBooleanArray18 = new boolean[Static343.aClass23_1.anInt582];
			Static178.aStringArray32 = new String[Static75.aClass69_1.anInt1894];
			Static400.anIntArray551 = new int[Static343.aClass23_1.anInt582];
			for (local6 = 0; local6 < Static343.aClass23_1.anInt582; local6++) {
				if (Static343.aClass23_1.method459(local6).anInt2510 == 0) {
					Static270.aBooleanArray18[local6] = true;
					Static39.anInt748++;
				}
				Static400.anIntArray551[local6] = -1;
			}
			Static404.method5116();
			Static286.anInt4704 = Static134.aClass54_39.method1102("loginscreen");
			Static354.anInt6054 = Static134.aClass54_39.method1102("lobbyscreen");
			Static309.aClass54_84.method1125(false);
			Static120.aClass54_36.method1125(true);
			Static103.aClass54_28.method1125(true);
			Static77.aClass54_26.method1125(true);
			Static294.aClass54_21.method1125(true);
			Static134.aClass54_39.method1125(true);
			Static370.aBoolean446 = true;
			Static24.aClass54_5.anInt1425 = 2;
			Static363.aClass54_100.anInt1425 = 2;
			Static307.aClass54_83.anInt1425 = 2;
			Static37.aClass54_107.anInt1425 = 2;
			Static208.aClass54_60.anInt1425 = 2;
			Static172.aClass54_50.anInt1425 = 2;
			Static33.aClass54_11.anInt1425 = 2;
			Static354.method4724(Static2.aClass148_Sub1_1.anInt3787, false, -1, -1);
			Static378.aString175 = Static385.aClass134_87.method2720(Static331.anInt5597);
			Static59.anInt3108 = 200;
			Static13.anInt178 = 95;
		} else if (Static59.anInt3108 == 200) {
			Static37.method5022(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method787() {
		try {
			this.method806();
		} catch (@Pc(8) Error local8) {
			if (Static288.anInt4743 != 2) {
				throw local8;
			}
			Static424.method5112(0);
			Static434.method5460(local8, local8.getMessage() + " (Recovered) " + this.method790());
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method801() {
		@Pc(9) boolean local9 = Static24.aClass84_1.method1902();
		if (!local9) {
			this.method814();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method804() {
		if (Static290.anInt4777 == 13) {
			return;
		}
		Static266.anInt4392++;
		if (Static266.anInt4392 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static7.anInt126 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static250.aRandom1.setSeed((long) Static7.anInt126);
		}
		if (Static266.anInt4392 % 50 == 0) {
			Static420.anInt6868 = Static221.anInt3653;
			Static221.anInt3653 = 0;
			Static333.anInt5635 = Static401.anInt6548;
			Static401.anInt6548 = 0;
		}
		this.method801();
		if (Static325.aClass168_1 != null) {
			Static325.aClass168_1.method3634();
		}
		Static111.method1711();
		Static218.aClass181_1.method3864();
		Static376.aClass203_1.method4917();
		if (Static400.aClass56_1 != null) {
			@Pc(84) int local84 = Static400.aClass56_1.method3756();
			Static95.anInt2403 = local84;
		}
		if (Static82.aClass163_1 != null) {
			Static82.aClass163_1.method5510((int) Static110.method1702());
		}
		Static255.method3254();
		Static380.anInt440 = 0;
		for (@Pc(106) Class7 local106 = Static218.aClass181_1.method3862(); local106 != null && Static380.anInt440 < 128; local106 = Static218.aClass181_1.method3862()) {
			if (local106.method140() != 1) {
				@Pc(119) char local119 = local106.method136();
				if (!Static401.method5075() || local119 != '`' && local119 != '§') {
					Static55.aClass7Array1[Static380.anInt440] = local106;
					Static380.anInt440++;
				} else if (Static379.method5321()) {
					Static325.method4389();
				} else {
					Static148.method2149();
				}
			}
		}
		for (@Pc(162) Class2_Sub14 local162 = Static376.aClass203_1.method4922(); local162 != null; local162 = Static376.aClass203_1.method4922()) {
			@Pc(168) int local168 = local162.method5381();
			if (local168 == -1) {
				Static281.aClass156_35.method3157(local162);
			} else if (Static68.method4004(local168)) {
				Static57.aClass156_8.method3157(local162);
			}
			if (Static57.aClass156_8.method3164() > 10) {
				Static57.aClass156_8.method3152();
			}
		}
		if (Static379.method5321()) {
			Static187.method2540();
		}
		if (Static290.anInt4777 == 0) {
			this.method797();
			Static93.method1469();
		} else if (Static290.anInt4777 == 1) {
			this.method797();
			Static93.method1469();
		} else if (Static202.method2703(Static290.anInt4777)) {
			Static114.method1738();
		}
		if (Static458.method5729(Static290.anInt4777) && !Static202.method2703(Static290.anInt4777)) {
			this.method811();
			Static458.method5732();
			Static160.method2245();
		} else if (Static4.method76(Static290.anInt4777) && !Static202.method2703(Static290.anInt4777)) {
			this.method811();
			Static160.method2245();
		} else if (Static290.anInt4777 == 11) {
			Static160.method2245();
		} else if (Static343.method4586(Static290.anInt4777) && !Static202.method2703(Static290.anInt4777)) {
			Static327.method4407();
		} else if (Static290.anInt4777 == 12) {
			Static160.method2245();
			if (Static252.anInt4057 != -3 && Static252.anInt4057 != 2 && Static252.anInt4057 != 15) {
				Static312.method4252(false);
			}
		}
		Static454.method5700(Static82.aClass163_1);
		Static57.aClass156_8.method3152();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method792() {
		try {
			this.method804();
		} catch (@Pc(16) Error local16) {
			if (Static288.anInt4743 != 2) {
				throw local16;
			}
			Static424.method5112(0);
			Static434.method5460(local16, local16.getMessage() + " (Recovered) " + this.method790());
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method793() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method785()) {
			return;
		}
		Static72.aClass265_2 = new Class265();
		Static72.aClass265_2.anInt7137 = Integer.parseInt(this.getParameter("worldid"));
		Static447.aClass265_5 = new Class265();
		Static447.aClass265_5.anInt7137 = Integer.parseInt(this.getParameter("lobbyid"));
		Static447.aClass265_5.aString199 = this.getParameter("lobbyaddress");
		Static149.aClass265_4 = new Class265();
		Static149.aClass265_4.anInt7137 = Integer.parseInt(this.getParameter("demoid"));
		Static149.aClass265_4.aString199 = this.getParameter("demoaddress");
		Static260.aClass258_7 = Static48.method681(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static317.method5169(Static260.aClass258_7) && Static60.aClass258_1 != Static260.aClass258_7) {
			Static260.aClass258_7 = Static60.aClass258_1;
		}
		Static163.aClass60_1 = Static56.method818(Integer.parseInt(this.getParameter("modewhat")));
		if (Static381.aClass60_4 != Static163.aClass60_1 && Static303.aClass60_3 != Static163.aClass60_1 && Static232.aClass60_2 != Static163.aClass60_1) {
			Static163.aClass60_1 = Static232.aClass60_2;
		}
		try {
			Static331.anInt5597 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static331.anInt5597 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static79.aBoolean118 = true;
		} else {
			Static79.aBoolean118 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static359.aBoolean442 = true;
		} else {
			Static359.aBoolean442 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static113.aBoolean140 = true;
		} else {
			Static113.aBoolean140 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static118.aClass4_1 = Static193.aClass4_2;
			} else if (local145.equals("1")) {
				Static118.aClass4_1 = Static270.aClass4_3;
			}
		}
		try {
			Static294.anInt979 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static294.anInt979 = 0;
		}
		Static32.aString25 = this.getParameter("quiturl");
		Static182.aString95 = this.getParameter("settings");
		if (Static182.aString95 == null) {
			Static182.aString95 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static235.anInt3810 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static235.anInt3810 = 0;
			}
		}
		Static460.anInt7063 = Integer.parseInt(this.getParameter("colourid"));
		if (Static460.anInt7063 < 0 || Static460.anInt7063 >= Static130.aColorArray1.length) {
			Static460.anInt7063 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static47.aBoolean72 = true;
			Static291.aBoolean337 = true;
		}
		@Pc(223) String local223 = this.getParameter("frombilling");
		if (local223 != null && local223.equals("true")) {
			Static59.aBoolean185 = true;
		}
		if (Static118.aClass4_1 == Static193.aClass4_2) {
			Static90.anInt1755 = 765;
			Static18.anInt3419 = 503;
		} else if (Static270.aClass4_3 == Static118.aClass4_1) {
			Static90.anInt1755 = 640;
			Static18.anInt3419 = 480;
		}
		Static320.aClient1 = this;
		this.method778(Static163.aClass60_1.method1385() + 32, Static90.anInt1755, Static18.anInt3419);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method805(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.method3580();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(109) int[] local109 = Static4.anIntArray7 = new int[6];
						local109[0] = local14.method3555();
						local109[1] = local14.method3555();
						local109[2] = local14.method3555();
						local109[3] = local14.method3555();
						local109[4] = local14.method3555();
						local109[5] = local14.method3555();
					} else {
						@Pc(36) int local36;
						@Pc(31) int local31;
						if (local18 == 4) {
							local31 = local14.method3580();
							Static132.anIntArray185 = new int[local31];
							for (local36 = 0; local36 < local31; local36++) {
								Static132.anIntArray185[local36] = local14.method3555();
								if (Static132.anIntArray185[local36] == 65535) {
									Static132.anIntArray185[local36] = -1;
								}
							}
						} else if (local18 == 5) {
							local31 = local14.method3580();
							Static338.anIntArray507 = new int[local31];
							for (local36 = 0; local36 < local31; local36++) {
								Static338.anIntArray507[local36] = local14.method3555();
								if (Static338.anIntArray507[local36] == 65535) {
									Static338.anIntArray507[local36] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method779() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static277.method3721();
		Static197.aClass70_1 = new Class70(Static79.aClass183_2);
		Static24.aClass84_1 = new Class84();
		if (Static260.aClass258_7 != Static60.aClass258_1) {
			Static397.aByteArrayArray55 = new byte[50][];
		}
		Static2.aClass148_Sub1_1 = new Class148_Sub1(Static79.aClass183_2);
		if (Static60.aClass258_1 == Static260.aClass258_7) {
			Static72.aClass265_2.aString199 = this.getCodeBase().getHost();
		} else if (Static317.method5169(Static260.aClass258_7)) {
			Static72.aClass265_2.aString199 = this.getCodeBase().getHost();
			Static72.aClass265_2.anInt7133 = Static72.aClass265_2.anInt7137 + 40000;
			Static447.aClass265_5.anInt7133 = Static447.aClass265_5.anInt7137 + 40000;
			Static72.aClass265_2.anInt7134 = Static72.aClass265_2.anInt7137 + 50000;
			Static149.aClass265_4.anInt7133 = Static149.aClass265_4.anInt7137 + 40000;
			Static447.aClass265_5.anInt7134 = Static447.aClass265_5.anInt7137 + 50000;
			Static149.aClass265_4.anInt7134 = Static149.aClass265_4.anInt7137 + 50000;
		} else if (Static260.aClass258_7 == Static236.aClass258_6) {
			Static72.aClass265_2.aString199 = "127.0.0.1";
			Static447.aClass265_5.aString199 = "127.0.0.1";
			Static72.aClass265_2.anInt7133 = Static72.aClass265_2.anInt7137 + 40000;
			Static149.aClass265_4.aString199 = "127.0.0.1";
			Static447.aClass265_5.anInt7133 = Static447.aClass265_5.anInt7137 + 40000;
			Static149.aClass265_4.anInt7133 = Static149.aClass265_4.anInt7137 + 40000;
			Static72.aClass265_2.anInt7134 = Static72.aClass265_2.anInt7137 + 50000;
			Static447.aClass265_5.anInt7134 = Static447.aClass265_5.anInt7137 + 50000;
			Static149.aClass265_4.anInt7134 = Static149.aClass265_4.anInt7137 + 50000;
		}
		if (Static118.aClass4_1 == Static193.aClass4_2) {
			Static131.aBoolean155 = false;
		}
		Static14.aClass265_1 = Static72.aClass265_2;
		if (Static270.aClass4_3 == Static118.aClass4_1) {
			Static245.aBoolean275 = true;
			Static171.aShortArray24 = Static165.aShortArray23;
			Static287.aShortArrayArray6 = Static329.aShortArrayArray8;
			Static319.anInt5482 = 16777215;
			Static104.aShortArrayArray1 = Static150.aShortArrayArray3;
			Static306.aShortArray54 = Static295.aShortArray53;
			Static340.anInt6975 = 0;
		} else {
			Static171.aShortArray24 = Static132.aShortArray5;
			Static306.aShortArray54 = Static136.aShortArray9;
			Static287.aShortArrayArray6 = Static185.aShortArrayArray4;
			Static104.aShortArrayArray1 = Static441.aShortArrayArray9;
		}
		Static185.aShortArray25 = Static323.aShortArray4 = Static163.aShortArray22 = Static292.aShortArray52 = new short[256];
		Static218.aClass181_1 = Static241.method3079(Static286.aCanvas4);
		Static376.aClass203_1 = Static235.method3043(Static286.aCanvas4);
		Static400.aClass56_1 = Static261.method1848();
		if (Static400.aClass56_1 != null) {
			Static400.aClass56_1.method3755(Static286.aCanvas4);
		}
		Static15.anInt191 = Static293.anInt4810;
		try {
			if (Static79.aClass183_2.aClass178_4 != null) {
				Static14.aClass110_1 = new Class110(Static79.aClass183_2.aClass178_4, 5200, 0);
				for (@Pc(225) int local225 = 0; local225 < 30; local225++) {
					Static417.aClass110Array1[local225] = new Class110(Static79.aClass183_2.aClass178Array1[local225], 6000, 0);
				}
				Static123.aClass110_31 = new Class110(Static79.aClass183_2.aClass178_3, 6000, 0);
				Static283.aClass217_4 = new Class217(255, Static14.aClass110_1, Static123.aClass110_31, 500000);
				Static29.aClass110_2 = new Class110(Static79.aClass183_2.aClass178_2, 24, 0);
				Static79.aClass183_2.aClass178Array1 = null;
				Static79.aClass183_2.aClass178_3 = null;
				Static79.aClass183_2.aClass178_2 = null;
				Static79.aClass183_2.aClass178_4 = null;
			}
		} catch (@Pc(281) IOException local281) {
			Static123.aClass110_31 = null;
			Static283.aClass217_4 = null;
			Static29.aClass110_2 = null;
			Static14.aClass110_1 = null;
		}
		if (Static60.aClass258_1 != Static260.aClass258_7) {
			Static199.aBoolean203 = true;
		}
		if (Static193.aClass4_2 == Static118.aClass4_1) {
			Static87.aString208 = Static348.aClass134_81.method2720(Static331.anInt5597);
		} else if (Static118.aClass4_1 == Static270.aClass4_3) {
			Static87.aString208 = Static278.aClass134_70.method2720(Static331.anInt5597);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method806() {
		if (Static290.anInt4777 == 13) {
			return;
		}
		@Pc(18) long local18 = Static375.method4873() / 1000000L - Static303.aLong166;
		Static303.aLong166 = Static375.method4873() / 1000000L;
		@Pc(28) boolean local28 = Static295.method3926();
		if (local28 && Static372.aBoolean448 && Static356.aClass38_1 != null) {
			Static356.aClass38_1.method1479();
		}
		if (Static137.method5153(Static290.anInt4777)) {
			if (Static428.aLong208 != 0L && Static110.method1702() > Static428.aLong208) {
				Static354.method4724(Static284.method3772(), false, Static2.aClass148_Sub1_1.anInt3777, Static2.aClass148_Sub1_1.anInt3779);
			} else if (!Static82.aClass163_1.method5491() && Static200.aBoolean205) {
				Static105.method1619();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static300.aFrame4 == null) {
			@Pc(80) Container local80;
			if (Static261.aFrame3 == null) {
				local80 = Static79.aClass183_2.anApplet1;
			} else {
				local80 = Static261.aFrame3;
			}
			local89 = local80.getSize().width;
			local93 = local80.getSize().height;
			if (Static261.aFrame3 == local80) {
				@Pc(99) Insets local99 = Static261.aFrame3.getInsets();
				local93 -= local99.bottom + local99.top;
				local89 -= local99.right + local99.left;
			}
			if (Static155.anInt2673 != local89 || local93 != Static324.anInt5540) {
				if (Static82.aClass163_1 == null || Static82.aClass163_1.method5528()) {
					Static277.method3721();
				} else {
					Static155.anInt2673 = local89;
					Static324.anInt5540 = local93;
				}
				Static428.aLong208 = Static110.method1702() + 500L;
			}
		}
		if (Static300.aFrame4 != null && !Static26.aBoolean45 && Static137.method5153(Static290.anInt4777)) {
			Static354.method4724(Static2.aClass148_Sub1_1.anInt3787, false, -1, -1);
		}
		@Pc(156) boolean local156 = false;
		if (Static307.aBoolean391) {
			local156 = true;
			Static307.aBoolean391 = false;
		}
		if (local156) {
			Static61.method903();
		}
		if (Static82.aClass163_1 != null && Static82.aClass163_1.method5491() || Static284.method3772() != 1) {
			Static204.method2721();
		}
		if (Static290.anInt4777 == 0) {
			Static254.method3216(Static157.aColorArray2[Static460.anInt7063], local156, Static276.aColorArray3[Static460.anInt7063], Static378.aString175, Static130.aColorArray1[Static460.anInt7063], Static13.anInt178);
		} else if (Static290.anInt4777 == 1) {
			Static36.method535(Static276.aColorArray3[Static460.anInt7063].getRGB(), Static143.aClass92_3, local156 | Static82.aClass163_1.method5491(), Static130.aColorArray1[Static460.anInt7063].getRGB(), Static157.aColorArray2[Static460.anInt7063].getRGB(), Static82.aClass163_1);
		} else if (Static320.method4349(Static290.anInt4777)) {
			Static141.method2085();
		} else if (Static215.method2851(Static290.anInt4777)) {
			Static141.method2085();
		} else if (Static202.method2703(Static290.anInt4777)) {
			if (Static113.anInt2085 == 1) {
				if (Static202.anInt3394 < Static395.anInt6501) {
					Static202.anInt3394 = Static395.anInt6501;
				}
				local89 = (Static202.anInt3394 - Static395.anInt6501) * 50 / Static202.anInt3394;
				Static3.method33(Static244.aClass134_61.method2720(Static331.anInt5597) + "<br>(" + local89 + "%)", Static43.aClass92_1, true);
			} else if (Static113.anInt2085 == 2) {
				if (Static153.anInt2664 > Static214.anInt3526) {
					Static214.anInt3526 = Static153.anInt2664;
				}
				local89 = (Static214.anInt3526 - Static153.anInt2664) * 50 / Static214.anInt3526 + 50;
				Static3.method33(Static244.aClass134_61.method2720(Static331.anInt5597) + "<br>(" + local89 + "%)", Static43.aClass92_1, true);
			} else {
				Static3.method33(Static244.aClass134_61.method2720(Static331.anInt5597), Static43.aClass92_1, true);
			}
		} else if (Static290.anInt4777 == 9) {
			Static76.method1136(local18);
		} else if (Static290.anInt4777 == 12) {
			Static3.method33(Static315.aClass134_75.method2720(Static331.anInt5597) + "<br>" + Static412.aClass134_97.method2720(Static331.anInt5597), Static43.aClass92_1, true);
		}
		if (Static340.anInt6976 == 3) {
			for (local89 = 0; local89 < Static398.anInt6535; local89++) {
				@Pc(379) Rectangle local379 = Class2_Sub15.aRectangleArray1[local89];
				if (Static263.aBooleanArray14[local89]) {
					Static82.aClass163_1.method5545(local379.height, -1996553985, local379.width, local379.y, local379.x);
				} else if (Static442.aBooleanArray27[local89]) {
					Static82.aClass163_1.method5545(local379.height, -1996554240, local379.width, local379.y, local379.x);
				}
			}
		}
		if (Static379.method5321()) {
			Static382.method4912(Static82.aClass163_1);
		}
		if (Static137.method5153(Static290.anInt4777) && Static340.anInt6976 == 0 && Static284.method3772() == 1 && !local156 && Static293.aString140.equals("1.1")) {
			local89 = 0;
			for (local93 = 0; local93 < Static398.anInt6535; local93++) {
				if (Static442.aBooleanArray27[local93]) {
					Static442.aBooleanArray27[local93] = false;
					Static386.aRectangleArray2[local89++] = Class2_Sub15.aRectangleArray1[local93];
				}
			}
			Static82.aClass163_1.method5535(Static386.aRectangleArray2, local89);
		} else if (Static290.anInt4777 != 0) {
			Static82.aClass163_1.method5562();
			for (local89 = 0; local89 < Static398.anInt6535; local89++) {
				Static442.aBooleanArray27[local89] = false;
			}
		}
		if (Static2.aClass148_Sub1_1.anInt3793 == 0) {
			Static429.method5376(15L);
		} else if (Static2.aClass148_Sub1_1.anInt3793 == 1) {
			Static429.method5376(10L);
		} else if (Static2.aClass148_Sub1_1.anInt3793 == 2) {
			Static429.method5376(5L);
		} else if (Static2.aClass148_Sub1_1.anInt3793 == 3) {
			Static429.method5376(2L);
		}
		if (Static370.aBoolean446) {
			Static228.method2982();
		}
		if (Static2.aClass148_Sub1_1.aBoolean262 && Static290.anInt4777 == 2 && Static142.anInt2523 != -1) {
			Static2.aClass148_Sub1_1.aBoolean262 = false;
			Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/lang/String;")
	@Override
	public String method790() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static275.anInt4506 + "," + Static209.anInt3497 + "," + Static166.anInt2852 + "," + Static426.anInt6923 + "|";
			if (Static60.aClass3_Sub4_Sub1_Sub2_1 != null) {
				local7 = local7 + "2)" + Static61.anInt1129 + "," + (Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0] + Static275.anInt4506) + "," + (Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0] + Static209.anInt3497) + "|";
			}
			local7 = local7 + "3)" + Static288.anInt4743 + "|4)" + Static2.aClass148_Sub1_1.anInt3796 + "|5)" + Static284.method3772() + "|6)" + Static141.anInt2513 + "," + Static314.anInt5426 + "|";
			local7 = local7 + "7)" + Static2.aClass148_Sub1_1.method3040(Static288.anInt4743) + "|";
			local7 = local7 + "8)" + Static2.aClass148_Sub1_1.method3036(Static288.anInt4743) + "|";
			local7 = local7 + "9)" + Static2.aClass148_Sub1_1.aBoolean247 + "|";
			local7 = local7 + "10)" + Static2.aClass148_Sub1_1.aBoolean260 + "|";
			local7 = local7 + "11)" + Static2.aClass148_Sub1_1.aBoolean261 + "|";
			local7 = local7 + "12)" + Static2.aClass148_Sub1_1.method3047(Static288.anInt4743) + "|";
			local7 = local7 + "13)" + Static177.anInt3052 + "|";
			local7 = local7 + "14)" + Static290.anInt4777;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(221) Throwable local221) {
			}
			try {
				if (Static288.anInt4743 == 2) {
					@Pc(229) Class local229 = Class.forName("java.lang.ClassLoader");
					@Pc(233) Field local233 = local229.getDeclaredField("nativeLibraries");
					@Pc(236) Class local236 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(246) Method local246 = local236.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local246.invoke(local233, Boolean.TRUE);
					@Pc(269) Vector local269 = (Vector) local233.get(client.class.getClassLoader());
					for (@Pc(271) int local271 = 0; local271 < local269.size(); local271++) {
						try {
							@Pc(277) Object local277 = local269.elementAt(local271);
							@Pc(282) Field local282 = local277.getClass().getDeclaredField("name");
							local246.invoke(local282, Boolean.TRUE);
							try {
								@Pc(297) String local297 = (String) local282.get(local277);
								if (local297 != null && local297.indexOf("sw3d.dll") != -1) {
									@Pc(309) Field local309 = local277.getClass().getDeclaredField("handle");
									local246.invoke(local309, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local309.getLong(local277));
									local246.invoke(local309, Boolean.FALSE);
								}
							} catch (@Pc(345) Throwable local345) {
							}
							local246.invoke(local282, Boolean.FALSE);
						} catch (@Pc(357) Throwable local357) {
						}
					}
				}
			} catch (@Pc(369) Throwable local369) {
			}
			local7 = local7 + "]";
		} catch (@Pc(380) Throwable local380) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method811() {
		@Pc(36) int local36;
		if (Static290.anInt4777 == 6 && Static450.anInt7195 == 0) {
			if (Static345.anInt5892 > 0) {
				Static345.anInt5892--;
			}
			if (Static375.anInt6248 > 1) {
				Static345.anInt5891 = Static234.anInt3754;
				Static375.anInt6248--;
			}
			if (!Static126.aBoolean52) {
				Static337.method4522();
			}
			for (local36 = 0; local36 < 100 && Static229.method3013(); local36++) {
			}
		}
		Static233.anInt6983++;
		Static423.method5346(-1, null, -1);
		Static339.method4552(-1, -1, null);
		Static11.method150();
		Static234.anInt3754++;
		for (local36 = 0; local36 < Static384.anInt6329; local36++) {
			@Pc(83) Class3_Sub4_Sub1_Sub1 local83 = Static332.aClass2_Sub28Array1[local36].aClass3_Sub4_Sub1_Sub1_1;
			if (local83 != null) {
				@Pc(89) byte local89 = local83.aClass245_1.aByte82;
				if ((local89 & 0x1) != 0) {
					@Pc(97) int local97 = local83.method4009();
					@Pc(124) int local124;
					if ((local89 & 0x2) != 0 && local83.anInt4977 == 0 && Math.random() * 1000.0D < 10.0D) {
						local124 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(132) int local132 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local124 != 0 || local132 != 0) {
							@Pc(146) int local146 = local83.anIntArray425[0] + local124;
							if (local146 < 0) {
								local146 = 0;
							} else if (local146 > Static166.anInt2852 - local97 - 1) {
								local146 = Static166.anInt2852 - local97 - 1;
							}
							@Pc(177) int local177 = local83.anIntArray424[0] + local132;
							if (local177 < 0) {
								local177 = 0;
							} else if (Static426.anInt6923 - local97 - 1 < local177) {
								local177 = Static426.anInt6923 - local97 - 1;
							}
							@Pc(228) int local228 = Static460.method5540(local83.anIntArray424[0], local177, true, local83.anIntArray425[0], Static361.aClass71Array1[local83.aByte91], 0, Static254.anIntArray351, local97, local146, -1, 0, local97, local97, Static375.anIntArray539);
							if (local228 > 0) {
								if (local228 > 9) {
									local228 = 9;
								}
								for (@Pc(237) int local237 = 0; local237 < local228; local237++) {
									local83.anIntArray425[local237] = Static375.anIntArray539[local228 - local237 - 1];
									local83.anIntArray424[local237] = Static254.anIntArray351[local228 - local237 - 1];
									local83.aByteArray64[local237] = 1;
								}
								local83.anInt4977 = local228;
							}
						}
					}
					Static125.method1835(local83, true);
					local124 = Static454.method5701(local83);
					Static131.method1960(local83, Static361.anInt6087, Static179.anInt3085, local124);
					Static105.method1608(local83);
				}
			}
		}
		if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
			if (Static414.anInt6776 == 2) {
				Static214.method2832();
			} else {
				Static223.method5278();
			}
			if (Static174.anInt3028 >> 7 < 14 || Static174.anInt3028 >> 7 >= Static166.anInt2852 - 14 || Static143.anInt2544 >> 7 < 14 || Static143.anInt2544 >> 7 >= Static426.anInt6923 - 14) {
				Static93.method1468();
			}
		}
		while (true) {
			@Pc(358) Class2_Sub44 local358;
			@Pc(363) Class16 local363;
			@Pc(374) Class16 local374;
			do {
				local358 = (Class2_Sub44) Static334.aClass156_49.method3152();
				if (local358 == null) {
					while (true) {
						do {
							local358 = (Class2_Sub44) Static154.aClass156_16.method3152();
							if (local358 == null) {
								while (true) {
									do {
										local358 = (Class2_Sub44) Static37.aClass156_54.method3152();
										if (local358 == null) {
											if (Static336.aClass16_18 != null) {
												Static283.method3765();
											}
											if (Static266.anInt4392 % 1500 == 0) {
												Static340.method5395();
											}
											if (Static290.anInt4777 == 6 && Static450.anInt7195 == 0) {
												Static404.method5121();
											}
											Static22.method268();
											if (Static255.aBoolean290 && Static110.method1702() - 60000L > Static446.aLong221) {
												Static336.method4489();
											}
											for (@Pc(529) Class21_Sub1_Sub2 local529 = (Class21_Sub1_Sub2) Static457.aClass93_8.method2080(); local529 != null; local529 = (Class21_Sub1_Sub2) Static457.aClass93_8.method2081()) {
												if ((long) local529.anInt2423 < Static110.method1702() / 1000L - 5L) {
													if (local529.aShort23 > 0) {
														Static166.method2340("", 0, 5, local529.aString76 + Static359.aClass134_85.method2720(Static331.anInt5597), "");
													}
													if (local529.aShort23 == 0) {
														Static166.method2340("", 0, 5, local529.aString76 + Static393.aClass134_89.method2720(Static331.anInt5597), "");
													}
													local529.method5593();
												}
											}
											if (Static290.anInt4777 == 6 && Static450.anInt7195 == 0) {
												if (Static375.aClass160_3 == null) {
													Static312.method4252(false);
													return;
												}
												Static415.anInt6793++;
												if (Static415.anInt6793 > 50) {
													Static29.method451(Static452.aClass102_219);
												}
												try {
													if (Static375.aClass160_3 != null && Static456.aClass2_Sub13_Sub2_2.anInt4347 > 0) {
														Static221.anInt3653 += Static456.aClass2_Sub13_Sub2_2.anInt4347;
														Static375.aClass160_3.method3210(Static456.aClass2_Sub13_Sub2_2.anInt4347, Static456.aClass2_Sub13_Sub2_2.aByteArray52);
														Static415.anInt6793 = 0;
														Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
														return;
													}
												} catch (@Pc(649) IOException local649) {
													Static312.method4252(false);
													return;
												}
											}
											return;
										}
										local363 = local358.aClass16_20;
										if (local363.anInt320 < 0) {
											break;
										}
										local374 = Static338.method4534(local363.anInt324);
									} while (local374 == null || local374.aClass16Array1 == null || local363.anInt320 >= local374.aClass16Array1.length || local374.aClass16Array1[local363.anInt320] != local363);
									Static191.method2562(local358);
								}
							}
							local363 = local358.aClass16_20;
							if (local363.anInt320 < 0) {
								break;
							}
							local374 = Static338.method4534(local363.anInt324);
						} while (local374 == null || local374.aClass16Array1 == null || local374.aClass16Array1.length <= local363.anInt320 || local374.aClass16Array1[local363.anInt320] != local363);
						Static191.method2562(local358);
					}
				}
				local363 = local358.aClass16_20;
				if (local363.anInt320 < 0) {
					break;
				}
				local374 = Static338.method4534(local363.anInt324);
			} while (local374 == null || local374.aClass16Array1 == null || local374.aClass16Array1.length <= local363.anInt320 || local374.aClass16Array1[local363.anInt320] != local363);
			Static191.method2562(local358);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method812(@OriginalArg(0) int arg0) {
		Static387.aClass160_4 = null;
		Static313.anInt5416 = 0;
		Static24.aClass84_1.anInt2312 = arg0;
		Static24.aClass84_1.anInt2311++;
		Static171.aClass91_3 = null;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method791() {
		if (Static255.aBoolean290) {
			Static336.method4489();
		}
		if (Static82.aClass163_1 != null) {
			Static82.aClass163_1.method5554();
		}
		if (Static300.aFrame4 != null) {
			Static128.method1909(Static300.aFrame4, Static79.aClass183_2);
			Static300.aFrame4 = null;
		}
		if (Static375.aClass160_3 != null) {
			Static375.aClass160_3.method3202();
			Static375.aClass160_3 = null;
		}
		if (Static400.aClass56_1 != null) {
			Static400.aClass56_1.method3754(Static286.aCanvas4);
		}
		Static400.aClass56_1 = null;
		Static142.method2087();
		Static24.aClass84_1.method1901();
		Static197.aClass70_1.method1546();
		if (Static229.aClass202_1 != null) {
			Static229.aClass202_1.method4386();
			Static229.aClass202_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method814() {
		if (Static208.anInt3487 < Static24.aClass84_1.anInt2311) {
			Static14.aClass265_1.aBoolean518 = !Static14.aClass265_1.aBoolean518;
			Static264.anInt4298 = (Static24.aClass84_1.anInt2311 * 50 - 50) * 5;
			if (Static264.anInt4298 > 3000) {
				Static264.anInt4298 = 3000;
			}
			if (Static24.aClass84_1.anInt2311 >= 2 && Static24.aClass84_1.anInt2312 == 6) {
				this.method789("js5connect_outofdate");
				Static290.anInt4777 = 13;
				return;
			}
			if (Static24.aClass84_1.anInt2311 >= 4 && Static24.aClass84_1.anInt2312 == -1) {
				this.method789("js5crc");
				Static290.anInt4777 = 13;
				return;
			}
			if (Static24.aClass84_1.anInt2311 >= 4 && Static425.method5365(Static290.anInt4777)) {
				if (Static24.aClass84_1.anInt2312 == 7 || Static24.aClass84_1.anInt2312 == 9) {
					this.method789("js5connect_full");
				} else if (Static24.aClass84_1.anInt2312 <= 0) {
					this.method789("js5io");
				} else {
					this.method789("js5connect");
				}
				Static290.anInt4777 = 13;
				return;
			}
		}
		Static208.anInt3487 = Static24.aClass84_1.anInt2311;
		if (Static264.anInt4298 > 0) {
			Static264.anInt4298--;
			return;
		}
		try {
			if (Static313.anInt5416 == 0) {
				Static171.aClass91_3 = Static79.aClass183_2.method3903(Static14.aClass265_1.aString199, Static14.aClass265_1.method5616());
				Static313.anInt5416++;
			}
			if (Static313.anInt5416 == 1) {
				if (Static171.aClass91_3.anInt2446 == 2) {
					this.method812(1000);
					return;
				}
				if (Static171.aClass91_3.anInt2446 == 1) {
					Static313.anInt5416++;
				}
			}
			if (Static313.anInt5416 == 2) {
				Static387.aClass160_4 = new Class160((Socket) Static171.aClass91_3.anObject3, Static79.aClass183_2);
				@Pc(186) Class2_Sub13 local186 = new Class2_Sub13(5);
				local186.method3602(Static167.aClass236_2.anInt6448);
				local186.method3569(599);
				Static387.aClass160_4.method3210(5, local186.aByteArray52);
				Static313.anInt5416++;
				Static153.aLong88 = Static110.method1702();
			}
			if (Static313.anInt5416 == 3) {
				if (Static425.method5365(Static290.anInt4777) || Static387.aClass160_4.method3211() > 0) {
					@Pc(239) int local239 = Static387.aClass160_4.method3205();
					if (local239 != 0) {
						this.method812(local239);
						return;
					}
					Static313.anInt5416++;
				} else if (Static110.method1702() - Static153.aLong88 > 30000L) {
					this.method812(1001);
					return;
				}
			}
			if (Static313.anInt5416 == 4) {
				@Pc(268) boolean local268 = Static290.anInt4777 == 1 || Static458.method5729(Static290.anInt4777) || Static4.method76(Static290.anInt4777);
				Static24.aClass84_1.method1904(Static387.aClass160_4, !local268);
				Static171.aClass91_3 = null;
				Static313.anInt5416 = 0;
				Static387.aClass160_4 = null;
			}
		} catch (@Pc(285) IOException local285) {
			this.method812(1002);
		}
	}
}
