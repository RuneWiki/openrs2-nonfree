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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!ps;")
	public static final Class193 lb;

	static {
		new Class174("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
		lb = new Class193();
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static20.method5179("Argument count");
			}
			Static86.aClass241_1 = new Class241();
			Static86.aClass241_1.anInt6624 = Integer.parseInt(arg0[0]);
			Static293.aClass241_4 = new Class241();
			Static293.aClass241_4.anInt6624 = Integer.parseInt(arg0[1]);
			Static167.aClass241_3 = new Class241();
			Static167.aClass241_3.anInt6624 = Integer.parseInt(arg0[2]);
			Static230.aClass35_2 = Static238.aClass35_3;
			if (arg0[3].equals("live")) {
				Static415.aClass267_4 = Static325.aClass267_2;
			} else if (arg0[3].equals("rc")) {
				Static415.aClass267_4 = Static352.aClass267_3;
			} else if (arg0[3].equals("wip")) {
				Static415.aClass267_4 = Static13.aClass267_1;
			} else {
				Static20.method5179("modewhat");
			}
			Static300.anInt5192 = Static33.method585(arg0[4]);
			if (Static300.anInt5192 == -1) {
				if (arg0[4].equals("english")) {
					Static300.anInt5192 = 0;
				} else if (arg0[4].equals("german")) {
					Static300.anInt5192 = 1;
				} else {
					Static20.method5179("language");
				}
			}
			Static429.aBoolean487 = false;
			Static432.aBoolean492 = false;
			if (arg0[5].equals("game0")) {
				Static154.aClass113_3 = Static145.aClass113_2;
			} else if (arg0[5].equals("game1")) {
				Static154.aClass113_3 = Static427.aClass113_4;
			} else {
				Static20.method5179("game");
			}
			Static153.aString38 = "";
			Static59.anInt1131 = 0;
			Static294.aBoolean371 = true;
			Static279.aBoolean332 = true;
			Static203.anInt3616 = 0;
			Static114.anInt2017 = Static154.aClass113_3.anInt3360;
			Static252.aBoolean302 = false;
			@Pc(155) client local155 = new client();
			Static382.aClient1 = local155;
			local155.method1030(Static415.aClass267_4.method6153() + 32, Static154.aClass113_3.aString40);
			Static456.aFrame2.setLocation(40, 40);
		} catch (@Pc(178) Exception local178) {
			Static120.method1926(null, local178);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1046(@OriginalArg(1) int arg0) {
		Static371.anInt6310 = 0;
		Static61.aClass181_1 = null;
		Static199.aClass180_1 = null;
		Static338.aClass191_3.anInt5450++;
		Static338.aClass191_3.anInt5451 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method1047() {
		@Pc(6) int local6;
		if (!Static39.aClass79_Sub1_1.aBoolean146) {
			for (local6 = 0; local6 < Static179.anInt3325; local6++) {
				if (Static37.anInterface3Array1[local6].method417() == 's' || Static37.anInterface3Array1[local6].method417() == 'S') {
					Static39.aClass79_Sub1_1.aBoolean146 = true;
					break;
				}
			}
		}
		@Pc(63) int local63;
		if (Static385.anInt6506 == 0) {
			@Pc(54) Runtime local54 = Runtime.getRuntime();
			local63 = (int) ((local54.totalMemory() - local54.freeMemory()) / 1024L);
			@Pc(66) long local66 = Static354.method4966();
			if (Static256.aLong148 == 0L) {
				Static256.aLong148 = local66;
			}
			if (local63 > 16384 && local66 - Static256.aLong148 < 5000L) {
				if (local66 - Static373.aLong211 > 1000L) {
					System.gc();
					Static373.aLong211 = local66;
				}
				Static291.aString55 = Static135.aClass174_71.method4208(Static300.anInt5192);
				Static56.anInt1098 = 5;
			} else {
				Static291.aString55 = Static355.aClass174_128.method4208(Static300.anInt5192);
				Static385.anInt6506 = 10;
				Static56.anInt1098 = 5;
			}
		} else if (Static385.anInt6506 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static250.aClass128Array1[local6] = Static390.method5421(Static291.anInt5062, Static373.anInt6324);
			}
			Static291.aString55 = Static48.aClass174_30.method4208(Static300.anInt5192);
			Static385.anInt6506 = 20;
			Static56.anInt1098 = 10;
		} else if (Static385.anInt6506 == 20) {
			if (Static251.aClass107_3 == null) {
				Static251.aClass107_3 = new Class107(Static338.aClass191_3, Static280.aClass196_3);
			}
			if (Static251.aClass107_3.method2616()) {
				Static255.aClass250_63 = Static412.method5681(false, 0, true);
				Static101.aClass250_34 = Static412.method5681(false, 1, true);
				Static326.aClass250_81 = Static412.method5681(false, 2, true);
				Static90.aClass250_30 = Static412.method5681(false, 3, true);
				Static156.aClass250_45 = Static412.method5681(false, 4, true);
				Static92.aClass250_31 = Static412.method5681(true, 5, true);
				Static28.aClass250_12 = Static412.method5681(true, 6, false);
				Static119.aClass250_38 = Static412.method5681(false, 7, true);
				Static8.aClass250_2 = Static412.method5681(false, 8, true);
				Static126.aClass250_39 = Static412.method5681(false, 9, true);
				Static409.aClass250_98 = Static412.method5681(false, 10, true);
				Static145.aClass250_42 = Static412.method5681(false, 11, true);
				Static317.aClass250_79 = Static412.method5681(false, 12, true);
				Static351.aClass250_88 = Static412.method5681(false, 13, true);
				Static72.aClass250_24 = Static412.method5681(false, 14, false);
				Static464.aClass250_106 = Static412.method5681(false, 15, true);
				Static30.aClass250_13 = Static412.method5681(false, 16, true);
				Static333.aClass250_83 = Static412.method5681(false, 17, true);
				Static441.aClass250_102 = Static412.method5681(false, 18, true);
				Static171.aClass250_48 = Static412.method5681(false, 19, true);
				Static324.aClass250_80 = Static412.method5681(false, 20, true);
				Static6.aClass250_1 = Static412.method5681(false, 21, true);
				Static327.aClass250_82 = Static412.method5681(false, 22, true);
				Static171.aClass250_49 = Static412.method5681(true, 23, true);
				Static72.aClass250_23 = Static412.method5681(false, 24, true);
				Static180.aClass250_55 = Static412.method5681(false, 25, true);
				Static111.aClass250_37 = Static412.method5681(true, 26, true);
				Static339.aClass250_84 = Static412.method5681(false, 27, true);
				Static72.aClass250_25 = Static412.method5681(true, 28, true);
				Static158.aClass250_46 = Static412.method5681(false, 29, true);
				Static291.aString55 = Static329.aClass174_158.method4208(Static300.anInt5192);
				Static56.anInt1098 = 15;
				Static385.anInt6506 = 30;
			} else {
				Static291.aString55 = Static195.aClass174_108.method4208(Static300.anInt5192);
				Static56.anInt1098 = 12;
			}
		} else if (Static385.anInt6506 == 30) {
			local6 = 0;
			for (local63 = 0; local63 < 30; local63++) {
				local6 += Static311.aClass101_Sub1Array2[local63].method2465() * Static344.anIntArray357[local63] / 100;
			}
			if (local6 == 100) {
				Static291.aString55 = Static186.aClass174_102.method4208(Static300.anInt5192);
				Static56.anInt1098 = 20;
				Static292.method4189(Static8.aClass250_2);
				Static417.method5715(Static8.aClass250_2);
				Static385.anInt6506 = 40;
			} else {
				if (local6 != 0) {
					Static291.aString55 = Static344.aClass174_172.method4208(Static300.anInt5192) + local6 + "%";
				}
				Static56.anInt1098 = 20;
			}
		} else if (Static385.anInt6506 == 40) {
			if (Static72.aClass250_25.method5820()) {
				this.method1055(Static72.aClass250_25.method5814(1));
				Static291.aString55 = Static25.aClass174_17.method4208(Static300.anInt5192);
				Static56.anInt1098 = 25;
				Static385.anInt6506 = 50;
			} else {
				Static291.aString55 = Static317.aClass174_154.method4208(Static300.anInt5192) + Static72.aClass250_25.method5808() + "%";
				Static56.anInt1098 = 25;
			}
		} else if (Static385.anInt6506 == 50) {
			Static165.method2015();
			Static291.aString55 = Static392.aClass174_188.method4208(Static300.anInt5192);
			Static56.anInt1098 = 30;
			Static385.anInt6506 = 60;
		} else if (Static385.anInt6506 == 60) {
			local6 = Static7.method1786(Static8.aClass250_2, Static351.aClass250_88);
			local63 = Static83.method1500();
			if (local6 < local63) {
				Static291.aString55 = Static7.aClass174_61.method4208(Static300.anInt5192) + local6 * 100 / local63 + "%";
				Static56.anInt1098 = 35;
			} else {
				Static291.aString55 = Static27.aClass174_18.method4208(Static300.anInt5192);
				Static56.anInt1098 = 35;
				Static385.anInt6506 = 70;
			}
		} else if (Static385.anInt6506 == 70) {
			local6 = Static23.method420(Static8.aClass250_2);
			local63 = Static452.method6151();
			if (local6 < local63) {
				Static291.aString55 = Static95.aClass174_58.method4208(Static300.anInt5192) + local6 * 100 / local63 + "%";
				Static56.anInt1098 = 40;
			} else {
				Static291.aString55 = Static309.aClass174_150.method4208(Static300.anInt5192);
				Static56.anInt1098 = 40;
				Static385.anInt6506 = 80;
			}
		} else if (Static385.anInt6506 == 80) {
			if (Static111.aClass250_37.method5820()) {
				Static203.anInterface7_5 = new Class188(Static111.aClass250_37, Static126.aClass250_39, Static8.aClass250_2);
				Static291.aString55 = Static457.aClass174_214.method4208(Static300.anInt5192);
				Static56.anInt1098 = 45;
				Static385.anInt6506 = 90;
			} else {
				Static291.aString55 = Static28.aClass174_19.method4208(Static300.anInt5192) + Static111.aClass250_37.method5808() + "%";
				Static56.anInt1098 = 45;
			}
		} else if (Static385.anInt6506 == 90) {
			Static291.aString55 = Static359.aClass174_177.method4208(Static300.anInt5192);
			Static56.anInt1098 = 50;
			Static385.anInt6506 = 95;
		} else if (Static385.anInt6506 == 95) {
			if (Static39.aClass79_Sub1_1.aBoolean146) {
				Static39.aClass79_Sub1_1.anInt2159 = 0;
				Static39.aClass79_Sub1_1.anInt2161 = 0;
				Static39.aClass79_Sub1_1.anInt2150 = 1;
				Static39.aClass79_Sub1_1.anInt2145 = 0;
				Static39.aClass79_Sub1_1.anInt2157 = 0;
			}
			Static39.aClass79_Sub1_1.aBoolean146 = true;
			Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
			Static136.method2085(false, Static39.aClass79_Sub1_1.anInt2161);
			Static291.aString55 = Static160.aClass174_92.method4208(Static300.anInt5192);
			Static385.anInt6506 = 100;
			Static56.anInt1098 = 55;
		} else if (Static385.anInt6506 == 100) {
			Static54.method1048(Static8.aClass250_2, Static351.aClass250_88, Static413.aClass167_11);
			Static291.aString55 = Static394.aClass174_190.method4208(Static300.anInt5192);
			Static56.anInt1098 = 60;
			Static393.method5432(1);
			Static385.anInt6506 = 110;
		} else if (Static385.anInt6506 == 110) {
			Static326.aClass250_81.method5820();
			local6 = Static326.aClass250_81.method5808();
			Static30.aClass250_13.method5820();
			local6 += Static30.aClass250_13.method5808();
			Static333.aClass250_83.method5820();
			local6 += Static333.aClass250_83.method5808();
			Static441.aClass250_102.method5820();
			local6 += Static441.aClass250_102.method5808();
			Static171.aClass250_48.method5820();
			local6 += Static171.aClass250_48.method5808();
			Static324.aClass250_80.method5820();
			local6 += Static324.aClass250_80.method5808();
			Static6.aClass250_1.method5820();
			local6 += Static6.aClass250_1.method5808();
			Static327.aClass250_82.method5820();
			local6 += Static327.aClass250_82.method5808();
			Static72.aClass250_23.method5820();
			local6 += Static72.aClass250_23.method5808();
			Static180.aClass250_55.method5820();
			local6 += Static180.aClass250_55.method5808();
			Static339.aClass250_84.method5820();
			local6 += Static339.aClass250_84.method5808();
			Static158.aClass250_46.method5820();
			local6 += Static158.aClass250_46.method5808();
			if (local6 < 1200) {
				Static291.aString55 = Static453.aClass174_211.method4208(Static300.anInt5192) + local6 / 12 + "%";
				Static56.anInt1098 = 65;
			} else {
				Static70.aClass15_1 = new Class15(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static212.aClass238_1 = new Class238(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static57.aClass98_1 = new Class98(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81, Static8.aClass250_2);
				Static150.aClass218_1 = new Class218(Static154.aClass113_3, Static300.anInt5192, Static333.aClass250_83);
				Static301.aClass237_5 = new Class237(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static178.aClass231_4 = new Class231(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static421.aClass7_1 = new Class7(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81, Static119.aClass250_38);
				Static247.aClass46_2 = new Class46(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static84.aClass87_3 = new Class87(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static9.aClass149_1 = new Class149(Static154.aClass113_3, Static300.anInt5192, true, Static30.aClass250_13, Static119.aClass250_38);
				Static212.aClass45_3 = new Class45(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81, Static8.aClass250_2);
				Static462.aClass182_4 = new Class182(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81, Static8.aClass250_2);
				Static118.aClass19_1 = new Class19(Static154.aClass113_3, Static300.anInt5192, true, Static441.aClass250_102, Static119.aClass250_38);
				Static158.aClass272_1 = new Class272(Static154.aClass113_3, Static300.anInt5192, true, Static70.aClass15_1, Static171.aClass250_48, Static119.aClass250_38);
				Static113.aClass206_2 = new Class206(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static444.aClass59_3 = new Class59(Static154.aClass113_3, Static300.anInt5192, Static324.aClass250_80, Static255.aClass250_63, Static101.aClass250_34);
				Static335.aClass58_1 = new Class58(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static448.aClass172_1 = new Class172(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static387.aClass201_2 = new Class201(Static154.aClass113_3, Static300.anInt5192, Static6.aClass250_1, Static119.aClass250_38);
				Static227.aClass260_1 = new Class260(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static145.aClass48_1 = new Class48(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static62.aClass242_1 = new Class242(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static256.aClass112_1 = new Class112(Static154.aClass113_3, Static300.anInt5192, Static327.aClass250_82);
				Static208.aClass159_1 = new Class159(Static154.aClass113_3, Static300.anInt5192, Static326.aClass250_81);
				Static137.method2094(Static8.aClass250_2, Static119.aClass250_38, Static351.aClass250_88, Static90.aClass250_30);
				Static188.method2954(Static158.aClass250_46);
				Static202.aClass30_1 = new Class30(Static300.anInt5192, Static72.aClass250_23, Static180.aClass250_55);
				Static141.aClass61_1 = new Class61(Static300.anInt5192, Static72.aClass250_23, Static180.aClass250_55, new Class42());
				Static291.aString55 = Static103.aClass174_60.method4208(Static300.anInt5192);
				Static56.anInt1098 = 65;
				Static363.method5075();
				Static9.aClass149_1.method3568(!Static39.aClass79_Sub1_1.method1948(Static402.anInt6656));
				Static119.aClass47_1 = new Class47();
				Static444.method5197();
				Static112.method1822(Static339.aClass250_84);
				Static326.method4516(Static203.anInterface7_5, Static119.aClass250_38);
				Static385.anInt6506 = 120;
			}
		} else if (Static385.anInt6506 == 120) {
			local6 = Static324.method4494(Static8.aClass250_2);
			local63 = Static43.method4693();
			if (local63 > local6) {
				Static291.aString55 = Static44.aClass174_27.method4208(Static300.anInt5192) + local6 * 100 / local63 + "%";
				Static56.anInt1098 = 70;
			} else {
				Static285.method4134(Static413.aClass167_11, Static8.aClass250_2);
				Static291.method4181(Static353.aClass2Array19);
				Static291.aString55 = Static401.aClass174_191.method4208(Static300.anInt5192);
				Static385.anInt6506 = 130;
				Static56.anInt1098 = 70;
			}
		} else if (Static385.anInt6506 == 130) {
			if (Static409.aClass250_98.method5800("huffman", "")) {
				@Pc(1216) Class88 local1216 = new Class88(Static409.aClass250_98.method5795("", "huffman"));
				Static391.method5425(local1216);
				Static291.aString55 = Static191.aClass174_106.method4208(Static300.anInt5192);
				Static385.anInt6506 = 140;
				Static56.anInt1098 = 75;
			} else {
				Static291.aString55 = Static337.aClass174_163.method4208(Static300.anInt5192) + "0%";
				Static56.anInt1098 = 75;
			}
		} else if (Static385.anInt6506 == 140) {
			if (Static90.aClass250_30.method5820()) {
				Static291.aString55 = Static114.aClass174_62.method4208(Static300.anInt5192);
				Static56.anInt1098 = 80;
				Static385.anInt6506 = 150;
			} else {
				Static291.aString55 = Static150.aClass174_86.method4208(Static300.anInt5192) + Static90.aClass250_30.method5808() + "%";
				Static56.anInt1098 = 80;
			}
		} else if (Static385.anInt6506 == 150) {
			if (Static317.aClass250_79.method5820()) {
				Static291.aString55 = Static21.aClass174_217.method4208(Static300.anInt5192);
				Static385.anInt6506 = 160;
				Static56.anInt1098 = 82;
			} else {
				Static291.aString55 = Static359.aClass174_175.method4208(Static300.anInt5192) + Static317.aClass250_79.method5808() + "%";
				Static56.anInt1098 = 82;
			}
		} else if (Static385.anInt6506 == 160) {
			if (Static351.aClass250_88.method5820()) {
				Static291.aString55 = Static241.aClass174_122.method4208(Static300.anInt5192);
				Static385.anInt6506 = 170;
				Static56.anInt1098 = 85;
			} else {
				Static291.aString55 = Static241.aClass174_122.method4208(Static300.anInt5192) + Static351.aClass250_88.method5808() + "%";
				Static56.anInt1098 = 85;
			}
		} else if (Static385.anInt6506 == 170) {
			if (Static171.aClass250_49.method5810("details")) {
				Static211.method293(Static171.aClass250_49, Static301.aClass237_5, Static178.aClass231_4, Static9.aClass149_1, Static212.aClass45_3, Static462.aClass182_4, Static119.aClass47_1);
				Static291.aString55 = Static281.aClass174_135.method4208(Static300.anInt5192);
				Static385.anInt6506 = 190;
				Static56.anInt1098 = 89;
			} else {
				Static291.aString55 = Static83.aClass174_55.method4208(Static300.anInt5192) + Static171.aClass250_49.method5803("details") + "%";
				Static56.anInt1098 = 87;
			}
		} else if (Static385.anInt6506 == 190) {
			Static59.anIntArray56 = new int[Static62.aClass242_1.anInt6660];
			Static322.aBooleanArray19 = new boolean[Static62.aClass242_1.anInt6660];
			Static358.aStringArray38 = new String[Static145.aClass48_1.anInt1323];
			for (local6 = 0; local6 < Static62.aClass242_1.anInt6660; local6++) {
				if (Static62.aClass242_1.method5517(local6).anInt2283 == 0) {
					Static322.aBooleanArray19[local6] = true;
					Static351.anInt5923++;
				}
				Static59.anIntArray56[local6] = -1;
			}
			Static223.method3239();
			Static404.anInt6677 = Static90.aClass250_30.method5790("loginscreen");
			Static27.anInt487 = Static90.aClass250_30.method5790("lobbyscreen");
			Static92.aClass250_31.method5804(false);
			Static28.aClass250_12.method5804(true);
			Static8.aClass250_2.method5804(true);
			Static351.aClass250_88.method5804(true);
			Static409.aClass250_98.method5804(true);
			Static90.aClass250_30.method5804(true);
			Static326.aClass250_81.anInt7168 = 2;
			Static463.aBoolean519 = true;
			Static333.aClass250_83.anInt7168 = 2;
			Static30.aClass250_13.anInt7168 = 2;
			Static441.aClass250_102.anInt7168 = 2;
			Static171.aClass250_48.anInt7168 = 2;
			Static324.aClass250_80.anInt7168 = 2;
			Static6.aClass250_1.anInt7168 = 2;
			Static435.method5879(-1, Static39.aClass79_Sub1_1.anInt2150, -1, false);
			Static291.aString55 = Static212.aClass174_113.method4208(Static300.anInt5192);
			Static385.anInt6506 = 200;
			Static56.anInt1098 = 95;
		} else if (Static385.anInt6506 == 200) {
			Static393.method5432(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1028() {
		if (Static402.anInt6656 != 2) {
			this.method1051();
			return;
		}
		try {
			this.method1051();
		} catch (@Pc(11) Throwable local11) {
			Static120.method1926(local11.getMessage() + " (Recovered) " + this.method1037(), local11);
			Static299.method4264(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1049() {
		if (Class31.lb < Static338.aClass191_3.anInt5450) {
			Static367.aClass241_6.aBoolean448 = !Static367.aClass241_6.aBoolean448;
			Static442.anInt7406 = 5 * 50 * (Static338.aClass191_3.anInt5450 - 1);
			if (Static442.anInt7406 > 3000) {
				Static442.anInt7406 = 3000;
			}
			if (Static338.aClass191_3.anInt5450 >= 2 && Static338.aClass191_3.anInt5451 == 6) {
				this.method1042("js5connect_outofdate");
				Static345.anInt5823 = 13;
				return;
			}
			if (Static338.aClass191_3.anInt5450 >= 4 && Static338.aClass191_3.anInt5451 == -1) {
				this.method1042("js5crc");
				Static345.anInt5823 = 13;
				return;
			}
			if (Static338.aClass191_3.anInt5450 >= 4 && Static361.method5056(Static345.anInt5823)) {
				if (Static338.aClass191_3.anInt5451 == 7 || Static338.aClass191_3.anInt5451 == 9) {
					this.method1042("js5connect_full");
				} else if (Static338.aClass191_3.anInt5451 > 0) {
					this.method1042("js5connect");
				} else {
					this.method1042("js5io");
				}
				Static345.anInt5823 = 13;
				return;
			}
		}
		Class31.lb = Static338.aClass191_3.anInt5450;
		if (Static442.anInt7406 > 0) {
			Static442.anInt7406--;
			return;
		}
		try {
			if (Static371.anInt6310 == 0) {
				Static61.aClass181_1 = Static32.aClass51_1.method1375(Static367.aClass241_6.method5486(), Static367.aClass241_6.aString61);
				Static371.anInt6310++;
			}
			if (Static371.anInt6310 == 1) {
				if (Static61.aClass181_1.anInt5298 == 2) {
					this.method1046(1000);
					return;
				}
				if (Static61.aClass181_1.anInt5298 == 1) {
					Static371.anInt6310++;
				}
			}
			if (Static371.anInt6310 == 2) {
				Static199.aClass180_1 = new Class180((Socket) Static61.aClass181_1.anObject7, Static32.aClass51_1);
				@Pc(179) Class3_Sub25 local179 = new Class3_Sub25(5);
				local179.method4081(Static445.aClass235_26.anInt6547);
				local179.method4082(603);
				Static199.aClass180_1.method4358(5, local179.aByteArray88);
				Static371.anInt6310++;
				Static1.aLong247 = Static354.method4966();
			}
			if (Static371.anInt6310 == 3) {
				if (Static361.method5056(Static345.anInt5823) || Static199.aClass180_1.method4355() > 0) {
					@Pc(235) int local235 = Static199.aClass180_1.method4360();
					if (local235 != 0) {
						this.method1046(local235);
						return;
					}
					Static371.anInt6310++;
				} else if (Static354.method4966() - Static1.aLong247 > 30000L) {
					this.method1046(1001);
					return;
				}
			}
			if (Static371.anInt6310 == 4) {
				@Pc(264) boolean local264 = Static345.anInt5823 == 1 || Static48.method914(Static345.anInt5823) || Static213.method3197(Static345.anInt5823);
				Static338.aClass191_3.method4499(!local264, Static199.aClass180_1);
				Static371.anInt6310 = 0;
				Static199.aClass180_1 = null;
				Static61.aClass181_1 = null;
			}
		} catch (@Pc(281) IOException local281) {
			this.method1046(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1051() {
		if (Static345.anInt5823 == 13) {
			return;
		}
		@Pc(18) long local18 = Static327.method4533() / 1000000L - Static46.aLong31;
		Static46.aLong31 = Static327.method4533() / 1000000L;
		@Pc(26) boolean local26 = Static289.method3812();
		if (local26 && Static240.aBoolean428 && Static151.aClass96_2 != null) {
			Static151.aClass96_2.method3465();
		}
		if (Static97.method1673(Static345.anInt5823)) {
			if (Static410.aLong229 != 0L && Static354.method4966() > Static410.aLong229) {
				Static435.method5879(Static39.aClass79_Sub1_1.anInt2148, Static282.method3967(), Static39.aClass79_Sub1_1.anInt2146, false);
			} else if (!Static413.aClass167_11.method5977() && Static413.aBoolean473) {
				Static303.method4312();
			}
		}
		@Pc(95) int local95;
		@Pc(99) int local99;
		if (Static52.aFrame1 == null) {
			@Pc(86) Container local86;
			if (Static456.aFrame2 == null) {
				local86 = Static32.aClass51_1.anApplet1;
			} else {
				local86 = Static456.aFrame2;
			}
			local95 = local86.getSize().width;
			local99 = local86.getSize().height;
			if (Static456.aFrame2 == local86) {
				@Pc(105) Insets local105 = Static456.aFrame2.getInsets();
				local95 -= local105.right + local105.left;
				local99 -= local105.bottom + local105.top;
			}
			if (local95 != Static277.anInt5005 || local99 != Static199.anInt3571) {
				if (Static413.aClass167_11 == null || Static413.aClass167_11.method6027()) {
					Static51.method968();
				} else {
					Static277.anInt5005 = local95;
					Static199.anInt3571 = local99;
				}
				Static410.aLong229 = Static354.method4966() + 500L;
			}
		}
		if (Static52.aFrame1 != null && !Static58.aBoolean72 && Static97.method1673(Static345.anInt5823)) {
			Static435.method5879(-1, Static39.aClass79_Sub1_1.anInt2150, -1, false);
		}
		@Pc(166) boolean local166 = false;
		if (Static99.aBoolean112) {
			local166 = true;
			Static99.aBoolean112 = false;
		}
		if (local166) {
			Static277.method4114();
		}
		if (Static413.aClass167_11 != null && Static413.aClass167_11.method5977() || Static282.method3967() != 1) {
			Static174.method2784();
		}
		if (Static345.anInt5823 == 0) {
			Static3.method63(local166, Static218.aColorArray42[Static114.anInt2017], Static461.aColorArray43[Static114.anInt2017], Static291.aString55, Static135.aColorArray15[Static114.anInt2017], Static56.anInt1098);
		} else if (Static345.anInt5823 == 1) {
			Static203.method3112(Static413.aClass167_11.method5977() | local166, Static461.aColorArray43[Static114.anInt2017].getRGB(), Static266.aClass18_2, Static218.aColorArray42[Static114.anInt2017].getRGB(), Static413.aClass167_11, Static135.aColorArray15[Static114.anInt2017].getRGB());
		} else if (Static152.method6183(Static345.anInt5823)) {
			Static337.method4672();
		} else if (Static86.method1535(Static345.anInt5823)) {
			Static337.method4672();
		} else if (Static195.method3032(Static345.anInt5823)) {
			if (Static188.anInt3447 == 1) {
				if (Static266.anInt4438 > Static316.anInt5346) {
					Static316.anInt5346 = Static266.anInt4438;
				}
				local95 = (Static316.anInt5346 - Static266.anInt4438) * 50 / Static316.anInt5346;
				Static275.method3805(Static163.aClass174_199.method4208(Static300.anInt5192) + "<br>(" + local95 + "%)", true, Static244.aClass18_1);
			} else if (Static188.anInt3447 == 2) {
				if (Static84.anInt6077 < Static430.anInt7238) {
					Static84.anInt6077 = Static430.anInt7238;
				}
				local95 = (Static84.anInt6077 - Static430.anInt7238) * 50 / Static84.anInt6077 + 50;
				Static275.method3805(Static163.aClass174_199.method4208(Static300.anInt5192) + "<br>(" + local95 + "%)", true, Static244.aClass18_1);
			} else {
				Static275.method3805(Static163.aClass174_199.method4208(Static300.anInt5192), true, Static244.aClass18_1);
			}
		} else if (Static345.anInt5823 == 9) {
			Static401.method5485(local18);
		} else if (Static345.anInt5823 == 12) {
			Static275.method3805(Static344.aClass174_171.method4208(Static300.anInt5192) + "<br>" + Static268.aClass174_129.method4208(Static300.anInt5192), true, Static244.aClass18_1);
		}
		if (Static87.anInt1588 == 3) {
			for (local95 = 0; local95 < Static100.anInt1815; local95++) {
				@Pc(394) Rectangle local394 = Class43.aRectangleArray1[local95];
				if (Static375.aBooleanArray21[local95]) {
					Static413.aClass167_11.method5951(local394.height, local394.y, -1996553985, local394.x, local394.width);
				} else if (Static15.aBooleanArray3[local95]) {
					Static413.aClass167_11.method5951(local394.height, local394.y, -1996554240, local394.x, local394.width);
				}
			}
		}
		if (Static401.method5484()) {
			Static204.method3835(Static413.aClass167_11);
		}
		if (Static97.method1673(Static345.anInt5823) && Static87.anInt1588 == 0 && Static282.method3967() == 1 && !local166 && Static75.aString15.equals("1.1")) {
			local95 = 0;
			for (local99 = 0; local99 < Static100.anInt1815; local99++) {
				if (Static15.aBooleanArray3[local99]) {
					Static15.aBooleanArray3[local99] = false;
					Static162.aRectangleArray2[local95++] = Class43.aRectangleArray1[local99];
				}
			}
			Static413.aClass167_11.method6013(Static162.aRectangleArray2, local95);
		} else if (Static345.anInt5823 != 0) {
			Static413.aClass167_11.method5994();
			for (local95 = 0; local95 < Static100.anInt1815; local95++) {
				Static15.aBooleanArray3[local95] = false;
			}
		}
		if (Static39.aClass79_Sub1_1.anInt2156 == 0) {
			Static83.method1499(15L);
		} else if (Static39.aClass79_Sub1_1.anInt2156 == 1) {
			Static83.method1499(10L);
		} else if (Static39.aClass79_Sub1_1.anInt2156 == 2) {
			Static83.method1499(5L);
		} else if (Static39.aClass79_Sub1_1.anInt2156 == 3) {
			Static83.method1499(2L);
		}
		if (Static463.aBoolean519) {
			Static47.method889();
		}
		if (Static39.aClass79_Sub1_1.aBoolean146 && Static345.anInt5823 == 2 && Static343.anInt5785 != -1) {
			Static39.aClass79_Sub1_1.aBoolean146 = false;
			Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1025() {
		if (Static451.aBoolean505) {
			Static174.method2777();
		}
		if (Static413.aClass167_11 != null) {
			Static413.aClass167_11.method5958();
		}
		if (Static52.aFrame1 != null) {
			Static442.method6045(Static32.aClass51_1, Static52.aFrame1);
			Static52.aFrame1 = null;
		}
		if (Static328.aClass116_1 != null) {
			Static328.aClass116_1.method2920();
			Static328.aClass116_1 = null;
		}
		Static155.method2396();
		Static338.aClass191_3.method4513();
		Static280.aClass196_3.method4607();
		if (Static285.aClass126_1 != null) {
			Static285.aClass126_1.method3159();
			Static285.aClass126_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1052() {
		@Pc(26) int local26;
		if (Static345.anInt5823 == 6 && Static423.anInt7131 == 0) {
			if (Static245.anInt4185 > 1) {
				Static245.anInt4185--;
				Static457.anInt7712 = Static125.anInt2284;
			}
			if (!Static367.aBoolean425) {
				Static447.method6092();
			}
			for (local26 = 0; local26 < 100 && Static230.method3352(); local26++) {
			}
		}
		Static46.anInt814++;
		Static228.method3280(null, -1, -1);
		Static257.method3591(-1, -1, null);
		Static2.method52();
		Static125.anInt2284++;
		for (local26 = 0; local26 < Static76.anInt1390; local26++) {
			@Pc(72) Class1_Sub2_Sub6_Sub1 local72 = Static407.aClass3_Sub40Array1[local26].aClass1_Sub2_Sub6_Sub1_2;
			if (local72 != null) {
				@Pc(78) byte local78 = local72.aClass158_1.aByte52;
				if ((local78 & 0x1) != 0) {
					@Pc(89) int local89 = local72.method6204();
					@Pc(113) int local113;
					if ((local78 & 0x2) != 0 && local72.anInt7644 == 0 && Math.random() * 1000.0D < 10.0D) {
						local113 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(121) int local121 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local113 != 0 || local121 != 0) {
							@Pc(138) int local138 = local113 + local72.anIntArray510[0];
							if (local138 < 0) {
								local138 = 0;
							} else if (Static373.anInt6324 - local89 - 1 < local138) {
								local138 = Static373.anInt6324 - local89 - 1;
							}
							@Pc(169) int local169 = local72.anIntArray509[0] + local121;
							if (local169 < 0) {
								local169 = 0;
							} else if (Static291.anInt5062 - local89 - 1 < local169) {
								local169 = Static291.anInt5062 - local89 - 1;
							}
							@Pc(223) int local223 = Static454.method6201(Static226.anIntArray444, local89, local72.anIntArray509[0], local89, 0, -1, local169, true, local89, local138, Static296.anIntArray328, Static250.aClass128Array1[local72.aByte101], 0, local72.anIntArray510[0]);
							if (local223 > 0) {
								if (local223 > 9) {
									local223 = 9;
								}
								for (@Pc(237) int local237 = 0; local237 < local223; local237++) {
									local72.anIntArray510[local237] = Static296.anIntArray328[local223 - local237 - 1];
									local72.anIntArray509[local237] = Static226.anIntArray444[local223 - local237 - 1];
									local72.aByteArray122[local237] = 1;
								}
								local72.anInt7644 = local223;
							}
						}
					}
					Static110.method1808(true, local72);
					local113 = Static222.method4444(local72);
					Static283.method4053(local72, Static369.anInt6267, Static158.anInt2917, local113);
					Static128.method2022(local72);
				}
			}
		}
		if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
			if (Static27.anInt490 == 2) {
				Static53.method1004();
			} else {
				Static4.method65();
			}
			if (Static266.anInt4433 >> 7 < 14 || Static266.anInt4433 >> 7 >= Static373.anInt6324 - 14 || Static152.anInt7561 >> 7 < 14 || Static152.anInt7561 >> 7 >= Static291.anInt5062 - 14) {
				Static207.method3154();
			}
		}
		while (true) {
			@Pc(358) Class3_Sub15 local358;
			@Pc(363) Class82 local363;
			@Pc(376) Class82 local376;
			do {
				local358 = (Class3_Sub15) Static336.aClass193_56.method4521();
				if (local358 == null) {
					while (true) {
						do {
							local358 = (Class3_Sub15) Static93.aClass193_20.method4521();
							if (local358 == null) {
								while (true) {
									do {
										local358 = (Class3_Sub15) Static458.aClass193_69.method4521();
										if (local358 == null) {
											if (Static296.aClass82_16 != null) {
												Static444.method5198();
											}
											if (Static172.anInt3107 % 1500 == 0) {
												Static50.method930();
											}
											if (Static345.anInt5823 == 6 && Static423.anInt7131 == 0) {
												Static194.method3016();
											}
											Static284.method4126();
											if (Static451.aBoolean505 && Static235.aLong139 < Static354.method4966() - 60000L) {
												Static174.method2777();
											}
											for (@Pc(538) Class23_Sub1_Sub1 local538 = (Class23_Sub1_Sub1) Static268.aClass194_6.method4577(); local538 != null; local538 = (Class23_Sub1_Sub1) Static268.aClass194_6.method4580()) {
												if ((long) local538.anInt588 < Static354.method4966() / 1000L - 5L) {
													if (local538.aShort9 > 0) {
														Static349.method4875(0, "", 5, "", local538.aString3 + Static359.aClass174_176.method4208(Static300.anInt5192));
													}
													if (local538.aShort9 == 0) {
														Static349.method4875(0, "", 5, "", local538.aString3 + Static167.aClass174_93.method4208(Static300.anInt5192));
													}
													local538.method5853();
												}
											}
											if (Static345.anInt5823 == 6 && Static423.anInt7131 == 0) {
												if (Static328.aClass116_1 == null) {
													Static168.method2583(false);
													return;
												}
												Static15.anInt283++;
												if (Static15.anInt283 > 50) {
													Static307.method4633(Static266.aClass163_114);
												}
												try {
													if (Static328.aClass116_1 != null && Static243.aClass3_Sub25_Sub1_7.anInt4974 > 0) {
														Static254.anInt5709 += Static243.aClass3_Sub25_Sub1_7.anInt4974;
														Static328.aClass116_1.method2918(Static243.aClass3_Sub25_Sub1_7.anInt4974, Static243.aClass3_Sub25_Sub1_7.aByteArray88);
														Static15.anInt283 = 0;
														Static243.aClass3_Sub25_Sub1_7.anInt4974 = 0;
														return;
													}
												} catch (@Pc(667) IOException local667) {
													Static168.method2583(false);
													return;
												}
											}
											return;
										}
										local363 = local358.aClass82_1;
										if (local363.anInt2209 < 0) {
											break;
										}
										local376 = Static180.method2857(local363.anInt2259);
									} while (local376 == null || local376.aClass82Array1 == null || local376.aClass82Array1.length <= local363.anInt2209 || local376.aClass82Array1[local363.anInt2209] != local363);
									Static219.method3217(local358);
								}
							}
							local363 = local358.aClass82_1;
							if (local363.anInt2209 < 0) {
								break;
							}
							local376 = Static180.method2857(local363.anInt2259);
						} while (local376 == null || local376.aClass82Array1 == null || local376.aClass82Array1.length <= local363.anInt2209 || local376.aClass82Array1[local363.anInt2209] != local363);
						Static219.method3217(local358);
					}
				}
				local363 = local358.aClass82_1;
				if (local363.anInt2209 < 0) {
					break;
				}
				local376 = Static180.method2857(local363.anInt2259);
			} while (local376 == null || local376.aClass82Array1 == null || local376.aClass82Array1.length <= local363.anInt2209 || local376.aClass82Array1[local363.anInt2209] != local363);
			Static219.method3217(local358);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method1055(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class3_Sub25 local15 = new Class3_Sub25(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(19) int local19 = local15.method4096();
					if (local19 == 0) {
						return;
					}
					if (local19 == 1) {
						@Pc(109) int[] local109 = Static204.anIntArray312 = new int[6];
						local109[0] = local15.method4083();
						local109[1] = local15.method4083();
						local109[2] = local15.method4083();
						local109[3] = local15.method4083();
						local109[4] = local15.method4083();
						local109[5] = local15.method4083();
					} else {
						@Pc(40) int local40;
						@Pc(35) int local35;
						if (local19 == 4) {
							local35 = local15.method4096();
							Static31.anIntArray22 = new int[local35];
							for (local40 = 0; local40 < local35; local40++) {
								Static31.anIntArray22[local40] = local15.method4083();
								if (Static31.anIntArray22[local40] == 65535) {
									Static31.anIntArray22[local40] = -1;
								}
							}
						} else if (local19 == 5) {
							local35 = local15.method4096();
							Static37.anIntArray24 = new int[local35];
							for (local40 = 0; local40 < local35; local40++) {
								Static37.anIntArray24[local40] = local15.method4083();
								if (Static37.anIntArray24[local40] == 65535) {
									Static37.anIntArray24[local40] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1058() {
		@Pc(11) boolean local11 = Static338.aClass191_3.method4501();
		if (!local11) {
			this.method1049();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1038()) {
			return;
		}
		Static86.aClass241_1 = new Class241();
		Static86.aClass241_1.anInt6624 = Integer.parseInt(this.getParameter("worldid"));
		Static293.aClass241_4 = new Class241();
		Static293.aClass241_4.anInt6624 = Integer.parseInt(this.getParameter("lobbyid"));
		Static293.aClass241_4.aString61 = this.getParameter("lobbyaddress");
		Static167.aClass241_3 = new Class241();
		Static167.aClass241_3.anInt6624 = Integer.parseInt(this.getParameter("demoid"));
		Static167.aClass241_3.aString61 = this.getParameter("demoaddress");
		Static230.aClass35_2 = Static171.method2618(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static140.method2149(Static230.aClass35_2) && Static80.aClass35_1 != Static230.aClass35_2) {
			Static230.aClass35_2 = Static80.aClass35_1;
		}
		Static415.aClass267_4 = Static315.method4408(Integer.parseInt(this.getParameter("modewhat")));
		if (Static13.aClass267_1 != Static415.aClass267_4 && Static352.aClass267_3 != Static415.aClass267_4 && Static415.aClass267_4 != Static325.aClass267_2) {
			Static415.aClass267_4 = Static325.aClass267_2;
		}
		try {
			Static300.anInt5192 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static300.anInt5192 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static432.aBoolean492 = true;
		} else {
			Static432.aBoolean492 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static429.aBoolean487 = true;
		} else {
			Static429.aBoolean487 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static461.aBoolean516 = true;
		} else {
			Static461.aBoolean516 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static154.aClass113_3 = Static145.aClass113_2;
			} else if (local145.equals("1")) {
				Static154.aClass113_3 = Static427.aClass113_4;
			}
		}
		try {
			Static59.anInt1131 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static59.anInt1131 = 0;
		}
		Static84.aString59 = this.getParameter("quiturl");
		Static153.aString38 = this.getParameter("settings");
		if (Static153.aString38 == null) {
			Static153.aString38 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static203.anInt3616 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static203.anInt3616 = 0;
			}
		}
		Static114.anInt2017 = Integer.parseInt(this.getParameter("colourid"));
		if (Static114.anInt2017 < 0 || Static114.anInt2017 >= Static461.aColorArray43.length) {
			Static114.anInt2017 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static294.aBoolean371 = true;
			Static279.aBoolean332 = true;
		}
		@Pc(228) String local228 = this.getParameter("frombilling");
		if (local228 != null && local228.equals("true")) {
			Static252.aBoolean302 = true;
		}
		if (Static154.aClass113_3 == Static145.aClass113_2) {
			Static28.anInt495 = 765;
			Static459.anInt5917 = 503;
		} else if (Static154.aClass113_3 == Static427.aClass113_4) {
			Static28.anInt495 = 640;
			Static459.anInt5917 = 480;
		}
		Static382.aClient1 = this;
		this.method1032(Static459.anInt5917, Static415.aClass267_4.method6153() + 32, Static28.anInt495);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1034() {
		if (Static402.anInt6656 != 2) {
			this.method1062();
			return;
		}
		try {
			this.method1062();
		} catch (@Pc(13) Throwable local13) {
			Static120.method1926(local13.getMessage() + " (Recovered) " + this.method1037(), local13);
			Static299.method4264(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1037() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static59.anInt1127 + "," + Static49.anInt873 + "," + Static373.anInt6324 + "," + Static291.anInt5062 + "|";
			if (Static203.aClass1_Sub2_Sub6_Sub2_1 != null) {
				local7 = local7 + "2)" + Static276.anInt4606 + "," + (Static59.anInt1127 + Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0]) + "," + (Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0] + Static49.anInt873) + "|";
			}
			local7 = local7 + "3)" + Static402.anInt6656 + "|4)" + Static39.aClass79_Sub1_1.anInt2145 + "|5)" + Static282.method3967() + "|6)" + Static310.anInt5307 + "," + Static166.anInt3014 + "|";
			local7 = local7 + "7)" + Static39.aClass79_Sub1_1.method1939(Static402.anInt6656) + "|";
			local7 = local7 + "8)" + Static39.aClass79_Sub1_1.method1942(Static402.anInt6656) + "|";
			local7 = local7 + "9)" + Static39.aClass79_Sub1_1.aBoolean156 + "|";
			local7 = local7 + "10)" + Static39.aClass79_Sub1_1.aBoolean161 + "|";
			local7 = local7 + "11)" + Static39.aClass79_Sub1_1.aBoolean148 + "|";
			local7 = local7 + "12)" + Static39.aClass79_Sub1_1.method1948(Static402.anInt6656) + "|";
			local7 = local7 + "13)" + Static61.anInt1155 + "|";
			local7 = local7 + "14)" + Static345.anInt5823;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(223) Throwable local223) {
			}
			try {
				if (Static402.anInt6656 == 2) {
					@Pc(236) Class local236 = Class.forName("java.lang.ClassLoader");
					@Pc(240) Field local240 = local236.getDeclaredField("nativeLibraries");
					@Pc(243) Class local243 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(253) Method local253 = local243.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local253.invoke(local240, Boolean.TRUE);
					@Pc(276) Vector local276 = (Vector) local240.get(client.class.getClassLoader());
					for (@Pc(278) int local278 = 0; local276.size() > local278; local278++) {
						try {
							@Pc(284) Object local284 = local276.elementAt(local278);
							@Pc(289) Field local289 = local284.getClass().getDeclaredField("name");
							local253.invoke(local289, Boolean.TRUE);
							try {
								@Pc(304) String local304 = (String) local289.get(local284);
								if (local304 != null && local304.indexOf("sw3d.dll") != -1) {
									@Pc(317) Field local317 = local284.getClass().getDeclaredField("handle");
									local253.invoke(local317, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local317.getLong(local284));
									local253.invoke(local317, Boolean.FALSE);
								}
							} catch (@Pc(353) Throwable local353) {
							}
							local253.invoke(local289, Boolean.FALSE);
						} catch (@Pc(365) Throwable local365) {
						}
					}
				}
			} catch (@Pc(377) Throwable local377) {
			}
			local7 = local7 + "]";
		} catch (@Pc(388) Throwable local388) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1033() {
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1062() {
		if (Static345.anInt5823 == 13) {
			return;
		}
		Static172.anInt3107++;
		if (Static172.anInt3107 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static104.anInt1869 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static456.aRandom1.setSeed((long) Static104.anInt1869);
		}
		if (Static172.anInt3107 % 50 == 0) {
			Static369.anInt6265 = Static254.anInt5709;
			Static181.anInt5111 = Static128.anInt2337;
			Static254.anInt5709 = 0;
			Static128.anInt2337 = 0;
		}
		this.method1058();
		if (Static251.aClass107_3 != null) {
			Static251.aClass107_3.method2620();
		}
		Static53.method997();
		Static137.aClass143_1.method5473();
		Static171.aClass50_1.method4996();
		if (Static413.aClass167_11 != null) {
			Static413.aClass167_11.method6007((int) Static354.method4966());
		}
		Static288.method4161();
		Static179.anInt3325 = 0;
		Static49.anInt881 = 0;
		for (@Pc(99) Interface3 local99 = Static137.aClass143_1.method5470(); local99 != null; local99 = Static137.aClass143_1.method5470()) {
			@Pc(105) int local105 = local99.method419();
			if (local105 == 2 || local105 == 3) {
				@Pc(117) char local117 = local99.method417();
				if (Static20.method5174() && (local117 == '`' || local117 == '§')) {
					if (Static401.method5484()) {
						Static68.method1259();
					} else {
						Static46.method876();
					}
				} else if (Static179.anInt3325 < 128) {
					Static37.anInterface3Array1[Static179.anInt3325] = local99;
					Static179.anInt3325++;
				}
			} else if (local105 == 0 && Static49.anInt881 < 75) {
				Static305.anInterface3Array2[Static49.anInt881] = local99;
				Static49.anInt881++;
			}
		}
		Static461.anInt7758 = 0;
		for (@Pc(183) Class3_Sub5 local183 = Static171.aClass50_1.method4991(); local183 != null; local183 = Static171.aClass50_1.method4991()) {
			@Pc(191) int local191 = local183.method5404();
			if (local191 == -1) {
				Static374.aClass193_62.method4527(local183);
			} else if (local191 == 6) {
				Static461.anInt7758 += local183.method5409();
			} else if (Static101.method1702(local191)) {
				Static273.aClass193_38.method4527(local183);
				if (Static273.aClass193_38.method4520() > 10) {
					Static273.aClass193_38.method4521();
				}
			}
		}
		if (Static401.method5484()) {
			Static268.method3724();
		}
		if (Static345.anInt5823 == 0) {
			this.method1047();
			Static152.method6186();
		} else if (Static345.anInt5823 == 1) {
			this.method1047();
			Static152.method6186();
		} else if (Static195.method3032(Static345.anInt5823)) {
			Static186.method2926();
		}
		if (Static48.method914(Static345.anInt5823) && !Static195.method3032(Static345.anInt5823)) {
			this.method1052();
			Static322.method4453();
			Static383.method5317();
		} else if (Static213.method3197(Static345.anInt5823) && !Static195.method3032(Static345.anInt5823)) {
			this.method1052();
			Static383.method5317();
		} else if (Static345.anInt5823 == 11) {
			Static383.method5317();
		} else if (Static1.method6243(Static345.anInt5823) && !Static195.method3032(Static345.anInt5823)) {
			Static215.method3472();
		} else if (Static345.anInt5823 == 12) {
			Static383.method5317();
			if (Static237.anInt4058 != -3 && Static237.anInt4058 != 2 && Static237.anInt4058 != 15) {
				Static168.method2583(false);
			}
		}
		Static394.method5441(Static413.aClass167_11);
		Static273.aClass193_38.method4521();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1035() {
		@Pc(15) Frame local15 = new Frame("Jagex");
		local15.pack();
		local15.dispose();
		Static51.method968();
		Static280.aClass196_3 = new Class196(Static32.aClass51_1);
		Static338.aClass191_3 = new Class191();
		if (Static80.aClass35_1 != Static230.aClass35_2) {
			Static351.aByteArrayArray24 = new byte[50][];
		}
		Static39.aClass79_Sub1_1 = new Class79_Sub1(Static32.aClass51_1);
		if (Static230.aClass35_2 == Static80.aClass35_1) {
			Static86.aClass241_1.aString61 = this.getCodeBase().getHost();
		} else if (Static140.method2149(Static230.aClass35_2)) {
			Static86.aClass241_1.aString61 = this.getCodeBase().getHost();
			Static86.aClass241_1.anInt6626 = Static86.aClass241_1.anInt6624 + 40000;
			Static293.aClass241_4.anInt6626 = Static293.aClass241_4.anInt6624 + 40000;
			Static167.aClass241_3.anInt6626 = Static167.aClass241_3.anInt6624 + 40000;
			Static86.aClass241_1.anInt6630 = Static86.aClass241_1.anInt6624 + 50000;
			Static293.aClass241_4.anInt6630 = Static293.aClass241_4.anInt6624 + 50000;
			Static167.aClass241_3.anInt6630 = Static167.aClass241_3.anInt6624 + 50000;
		} else if (Static230.aClass35_2 == Static238.aClass35_3) {
			Static86.aClass241_1.aString61 = "127.0.0.1";
			Static293.aClass241_4.aString61 = "127.0.0.1";
			Static86.aClass241_1.anInt6626 = Static86.aClass241_1.anInt6624 + 40000;
			Static167.aClass241_3.aString61 = "127.0.0.1";
			Static293.aClass241_4.anInt6626 = Static293.aClass241_4.anInt6624 + 40000;
			Static86.aClass241_1.anInt6630 = Static86.aClass241_1.anInt6624 + 50000;
			Static167.aClass241_3.anInt6626 = Static167.aClass241_3.anInt6624 + 40000;
			Static293.aClass241_4.anInt6630 = Static293.aClass241_4.anInt6624 + 50000;
			Static167.aClass241_3.anInt6630 = Static167.aClass241_3.anInt6624 + 50000;
		}
		if (Static427.aClass113_4 == Static154.aClass113_3) {
			Static417.aShortArrayArray9 = Static259.aShortArrayArray4;
			Static310.aBoolean386 = true;
			Static424.anInt7154 = 16777215;
			Static212.aShortArrayArray3 = Static454.aShortArrayArray10;
			Static243.aShortArray113 = Static332.aShortArray71;
			Static424.aShortArray114 = Static180.aShortArray46;
			Static26.anInt449 = 0;
		} else {
			Static212.aShortArrayArray3 = Static365.aShortArrayArray5;
			Static417.aShortArrayArray9 = Static138.aShortArrayArray2;
			Static243.aShortArray113 = Static312.aShortArray70;
			Static424.aShortArray114 = Static198.aShortArray47;
		}
		Static207.aShortArray48 = Static406.aShortArray112 = Static67.aShortArray16 = Static7.aShortArray31 = new short[256];
		if (Static145.aClass113_2 == Static154.aClass113_3) {
			Static418.aBoolean477 = false;
		}
		Static367.aClass241_6 = Static86.aClass241_1;
		Static137.aClass143_1 = Static258.method3605(Static151.aCanvas2);
		Static171.aClass50_1 = Static47.method887(Static151.aCanvas2);
		Static135.anInt2395 = Static75.anInt1371;
		try {
			if (Static32.aClass51_1.aClass220_2 != null) {
				Static272.aClass176_3 = new Class176(Static32.aClass51_1.aClass220_2, 5200, 0);
				for (@Pc(216) int local216 = 0; local216 < 30; local216++) {
					Static118.aClass176Array1[local216] = new Class176(Static32.aClass51_1.aClass220Array1[local216], 6000, 0);
				}
				Static88.aClass176_1 = new Class176(Static32.aClass51_1.aClass220_1, 6000, 0);
				Static37.aClass253_1 = new Class253(255, Static272.aClass176_3, Static88.aClass176_1, 500000);
				Static207.aClass176_2 = new Class176(Static32.aClass51_1.aClass220_3, 24, 0);
				Static32.aClass51_1.aClass220_1 = null;
				Static32.aClass51_1.aClass220_2 = null;
				Static32.aClass51_1.aClass220Array1 = null;
				Static32.aClass51_1.aClass220_3 = null;
			}
		} catch (@Pc(274) IOException local274) {
			Static37.aClass253_1 = null;
			Static272.aClass176_3 = null;
			Static88.aClass176_1 = null;
			Static207.aClass176_2 = null;
		}
		if (Static230.aClass35_2 != Static80.aClass35_1) {
			Static38.aBoolean35 = true;
		}
		if (Static145.aClass113_2 == Static154.aClass113_3) {
			Static139.aString36 = Static437.aClass174_205.method4208(Static300.anInt5192);
		} else if (Static154.aClass113_3 == Static427.aClass113_4) {
			Static139.aString36 = Static168.aClass174_96.method4208(Static300.anInt5192);
			return;
		}
	}
}
