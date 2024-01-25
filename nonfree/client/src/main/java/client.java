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
				Static193.method3521("argument count");
			}
			Static329.anInt6058 = Integer.parseInt(arg0[0]);
			Static306.aClass49_7 = Static348.aClass49_8;
			if (arg0[1].equals("live")) {
				Static115.aClass225_2 = Static18.aClass225_1;
			} else if (arg0[1].equals("rc")) {
				Static115.aClass225_2 = Static281.aClass225_3;
			} else if (arg0[1].equals("wip")) {
				Static115.aClass225_2 = Static391.aClass225_4;
			} else {
				Static193.method3521("modewhat");
			}
			Static200.anInt4144 = Static132.method2297(arg0[2]);
			if (Static200.anInt4144 == -1) {
				if (arg0[2].equals("english")) {
					Static200.anInt4144 = 0;
				} else if (arg0[2].equals("german")) {
					Static200.anInt4144 = 1;
				} else {
					Static193.method3521("language");
				}
			}
			Static199.aBoolean301 = false;
			Static271.aBoolean375 = false;
			if (arg0[3].equals("game0")) {
				Static85.aClass38_1 = Static255.aClass38_3;
			} else if (arg0[3].equals("game1")) {
				Static85.aClass38_1 = Static202.aClass38_2;
			} else {
				Static193.method3521("game");
			}
			Static217.anInt4400 = Static85.aClass38_1.anInt765;
			Static320.anInt7073 = 0;
			Static369.anInt6788 = 0;
			Static60.aString14 = "";
			Static102.aBoolean167 = true;
			Static294.aBoolean401 = true;
			@Pc(130) client local130 = new client();
			Static12.aClient1 = local130;
			local130.method762(Static115.aClass225_2.method5539() + 32, Static85.aClass38_1.aString8);
			Static115.aFrame3.setLocation(40, 40);
		} catch (@Pc(153) Exception local153) {
			Static346.method5531(local153, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method768() {
		if (Static176.aBoolean269) {
			Static209.method3787();
		}
		if (Static383.aClass48_9 != null) {
			Static383.aClass48_9.method2479();
		}
		if (Static33.aFrame2 != null) {
			Static108.method1966(Static154.aClass123_2, Static33.aFrame2);
			Static33.aFrame2 = null;
		}
		if (Static386.aClass226_4 != null) {
			Static386.aClass226_4.method5543();
			Static386.aClass226_4 = null;
		}
		if (Static366.aClass29_1 != null) {
			Static366.aClass29_1.method509(Static343.aCanvas5);
		}
		Static366.aClass29_1 = null;
		if (Static42.aClass89_1 != null) {
			Static42.aClass89_1.method5863();
		}
		if (Static157.aClass89_2 != null) {
			Static157.aClass89_2.method5863();
		}
		Static364.aClass222_3.method5519();
		Static64.aClass221_2.method5497();
		if (Static359.aClass145_1 != null) {
			Static359.aClass145_1.method3769();
			Static359.aClass145_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method775() {
		@Pc(5) int local5;
		if (!Static70.aBoolean117) {
			for (local5 = 0; local5 < Static154.anInt3218; local5++) {
				if (Static286.aClass13Array1[local5].method120() == 's' || Static286.aClass13Array1[local5].method120() == 'S') {
					Static70.aBoolean117 = true;
					break;
				}
			}
		}
		@Pc(60) int local60;
		if (Static380.anInt6937 == 0) {
			@Pc(50) Runtime local50 = Runtime.getRuntime();
			local60 = (int) ((local50.totalMemory() - local50.freeMemory()) / 1024L);
			@Pc(65) long local65 = Static101.method1805();
			if (Static261.aLong156 == 0L) {
				Static261.aLong156 = local65;
			}
			if (local60 > 16384 && local65 - Static261.aLong156 < 5000L) {
				if (local65 - Static251.aLong148 > 1000L) {
					System.gc();
					Static251.aLong148 = local65;
				}
				Static119.aString20 = Static202.aClass62_148.method1389(Static200.anInt4144);
				Static385.anInt7000 = 5;
			} else {
				Static119.aString20 = Static369.aClass62_233.method1389(Static200.anInt4144);
				Static385.anInt7000 = 5;
				Static380.anInt6937 = 10;
			}
		} else if (Static380.anInt6937 == 10) {
			for (local5 = 0; local5 < 4; local5++) {
				Static165.aClass178Array1[local5] = Static348.method5548(Static89.anInt1891, Static85.anInt1839);
			}
			Static119.aString20 = Static292.aClass62_196.method1389(Static200.anInt4144);
			Static385.anInt7000 = 10;
			Static380.anInt6937 = 20;
		} else if (Static380.anInt6937 == 20) {
			if (Static115.aClass45_1 == null) {
				Static115.aClass45_1 = new Class45(Static364.aClass222_3, Static64.aClass221_2);
			}
			if (Static115.aClass45_1.method882()) {
				Static45.aClass83_117 = Static350.method5580(0, false, true);
				Static235.aClass83_85 = Static350.method5580(1, false, true);
				Static48.aClass83_29 = Static350.method5580(2, false, true);
				Static208.aClass83_76 = Static350.method5580(3, false, true);
				Static141.aClass83_59 = Static350.method5580(4, false, true);
				Static90.aClass83_42 = Static350.method5580(5, true, true);
				Static279.aClass83_95 = Static350.method5580(6, true, false);
				Static88.aClass83_41 = Static350.method5580(7, false, true);
				Static324.aClass83_116 = Static350.method5580(8, false, true);
				Static169.aClass83_110 = Static350.method5580(9, false, true);
				Static130.aClass83_119 = Static350.method5580(10, false, true);
				Static311.aClass83_61 = Static350.method5580(11, false, true);
				Static51.aClass83_30 = Static350.method5580(12, false, true);
				Static381.aClass83_125 = Static350.method5580(13, false, true);
				Static316.aClass83_113 = Static350.method5580(14, false, false);
				Static280.aClass83_98 = Static350.method5580(15, false, true);
				Static221.aClass83_129 = Static350.method5580(16, false, true);
				Static350.aClass83_122 = Static350.method5580(17, false, true);
				Static97.aClass83_46 = Static350.method5580(18, false, true);
				Static1.aClass83_131 = Static350.method5580(19, false, true);
				Static281.aClass83_99 = Static350.method5580(20, false, true);
				Static210.aClass83_127 = Static350.method5580(21, false, true);
				Static33.aClass83_5 = Static350.method5580(22, false, true);
				Static86.aClass83_38 = Static350.method5580(23, true, true);
				Static235.aClass83_84 = Static350.method5580(24, false, true);
				Static12.aClass83_6 = Static350.method5580(25, false, true);
				Static48.aClass83_28 = Static350.method5580(26, true, true);
				Static301.aClass83_108 = Static350.method5580(27, false, true);
				Static222.aClass83_79 = Static350.method5580(28, true, true);
				Static119.aString20 = Static57.aClass62_38.method1389(Static200.anInt4144);
				Static380.anInt6937 = 30;
				Static385.anInt7000 = 15;
			} else {
				Static119.aString20 = Static375.aClass62_240.method1389(Static200.anInt4144);
				Static385.anInt7000 = 12;
			}
		} else if (Static380.anInt6937 == 30) {
			local5 = 0;
			for (local60 = 0; local60 < 29; local60++) {
				local5 += Static378.aClass135_Sub1Array6[local60].method4414() * Static9.anIntArray17[local60] / 100;
			}
			if (local5 == 100) {
				Static119.aString20 = Static28.aClass62_14.method1389(Static200.anInt4144);
				Static385.anInt7000 = 20;
				Static312.method5047(Static324.aClass83_116);
				Static265.method4508(Static324.aClass83_116);
				Static380.anInt6937 = 40;
			} else {
				if (local5 != 0) {
					Static119.aString20 = Static379.aClass62_241.method1389(Static200.anInt4144) + local5 + "%";
				}
				Static385.anInt7000 = 20;
			}
		} else if (Static380.anInt6937 == 40) {
			if (Static222.aClass83_79.method1948()) {
				this.method793(Static222.aClass83_79.method1979(1));
				Static119.aString20 = Static189.aClass62_22.method1389(Static200.anInt4144);
				Static385.anInt7000 = 25;
				Static380.anInt6937 = 50;
			} else {
				Static119.aString20 = Static191.aClass62_177.method1389(Static200.anInt4144) + Static222.aClass83_79.method1957() + "%";
				Static385.anInt7000 = 25;
			}
		} else if (Static380.anInt6937 == 50) {
			Static1.method6018(Static41.aBoolean51);
			Static310.aClass2_Sub11_Sub1_3 = new Class2_Sub11_Sub1();
			Static310.aClass2_Sub11_Sub1_3.method1796();
			Static42.aClass89_1 = Static390.method6112(0, 22050, Static343.aCanvas5, Static154.aClass123_2);
			Static42.aClass89_1.method5864(Static310.aClass2_Sub11_Sub1_3);
			Static295.method4835(Static280.aClass83_98, Static310.aClass2_Sub11_Sub1_3, Static316.aClass83_113, Static141.aClass83_59);
			Static157.aClass89_2 = Static390.method6112(1, 2048, Static343.aCanvas5, Static154.aClass123_2);
			Static192.aClass2_Sub11_Sub4_1 = new Class2_Sub11_Sub4();
			Static157.aClass89_2.method5864(Static192.aClass2_Sub11_Sub4_1);
			Static322.aClass113_1 = new Class113(22050, Static392.anInt7144);
			Static41.anInt729 = Static279.aClass83_95.method1961("scape main");
			Static119.aString20 = Static231.aClass62_165.method1389(Static200.anInt4144);
			Static380.anInt6937 = 60;
			Static385.anInt7000 = 30;
		} else if (Static380.anInt6937 == 60) {
			local5 = Static124.method3773(Static324.aClass83_116, Static381.aClass83_125);
			local60 = Static248.method4328();
			if (local60 > local5) {
				Static119.aString20 = Static36.aClass62_98.method1389(Static200.anInt4144) + local5 * 100 / local60 + "%";
				Static385.anInt7000 = 35;
			} else {
				Static119.aString20 = Static296.aClass62_198.method1389(Static200.anInt4144);
				Static380.anInt6937 = 70;
				Static385.anInt7000 = 35;
			}
		} else if (Static380.anInt6937 == 70) {
			local5 = Static41.method584(Static324.aClass83_116);
			local60 = Static30.method349();
			if (local5 < local60) {
				Static119.aString20 = Static136.aClass62_184.method1389(Static200.anInt4144) + local5 * 100 / local60 + "%";
				Static385.anInt7000 = 40;
			} else {
				Static119.aString20 = Static158.aClass62_112.method1389(Static200.anInt4144);
				Static380.anInt6937 = 80;
				Static385.anInt7000 = 40;
			}
		} else if (Static380.anInt6937 == 80) {
			if (Static48.aClass83_28.method1948()) {
				Static332.anInterface3_7 = new Class56(Static48.aClass83_28, Static169.aClass83_110, Static324.aClass83_116);
				Static119.aString20 = Static293.aClass62_32.method1389(Static200.anInt4144);
				Static385.anInt7000 = 45;
				Static380.anInt6937 = 90;
			} else {
				Static119.aString20 = Static63.aClass62_42.method1389(Static200.anInt4144) + Static48.aClass83_28.method1957() + "%";
				Static385.anInt7000 = 45;
			}
		} else if (Static380.anInt6937 == 90) {
			Static119.aString20 = Static333.aClass62_221.method1389(Static200.anInt4144);
			Static380.anInt6937 = 95;
			Static385.anInt7000 = 50;
		} else if (Static380.anInt6937 == 95) {
			if (Static70.aBoolean117) {
				Static202.anInt4200 = 1;
				Static87.anInt1875 = 0;
				Static42.anInt733 = 0;
				Static11.anInt210 = 0;
				Static232.anInt4637 = 0;
			}
			Static70.aBoolean117 = true;
			Static237.method4219(Static154.aClass123_2);
			Static94.method1600(Static232.anInt4637, false);
			Static119.aString20 = Static86.aClass62_58.method1389(Static200.anInt4144);
			Static385.anInt7000 = 55;
			Static380.anInt6937 = 100;
		} else if (Static380.anInt6937 == 100) {
			Static187.method3440(Static383.aClass48_9, Static324.aClass83_116, Static381.aClass83_125);
			Static119.aString20 = Static229.aClass62_160.method1389(Static200.anInt4144);
			Static385.anInt7000 = 60;
			Static181.method3326(5);
			Static380.anInt6937 = 110;
		} else if (Static380.anInt6937 == 110) {
			Static48.aClass83_29.method1948();
			local5 = Static48.aClass83_29.method1957();
			Static221.aClass83_129.method1948();
			local5 += Static221.aClass83_129.method1957();
			Static350.aClass83_122.method1948();
			local5 += Static350.aClass83_122.method1957();
			Static97.aClass83_46.method1948();
			local5 += Static97.aClass83_46.method1957();
			Static1.aClass83_131.method1948();
			local5 += Static1.aClass83_131.method1957();
			Static281.aClass83_99.method1948();
			local5 += Static281.aClass83_99.method1957();
			Static210.aClass83_127.method1948();
			local5 += Static210.aClass83_127.method1957();
			Static33.aClass83_5.method1948();
			local5 += Static33.aClass83_5.method1957();
			Static235.aClass83_84.method1948();
			local5 += Static235.aClass83_84.method1957();
			Static12.aClass83_6.method1948();
			local5 += Static12.aClass83_6.method1957();
			Static301.aClass83_108.method1948();
			local5 += Static301.aClass83_108.method1957();
			if (local5 < 1100) {
				Static119.aString20 = Static292.aClass62_197.method1389(Static200.anInt4144) + local5 / 11 + "%";
				Static385.anInt7000 = 65;
			} else {
				Static57.aClass79_1 = new Class79(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static59.aClass194_1 = new Class194(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static253.aClass67_2 = new Class67(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29, Static324.aClass83_116);
				Static25.aClass84_3 = new Class84(Static85.aClass38_1, Static200.anInt4144, Static350.aClass83_122);
				Static313.aClass126_5 = new Class126(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static14.aClass233_1 = new Class233(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static182.aClass170_2 = new Class170(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29, Static88.aClass83_41);
				Static40.aClass146_1 = new Class146(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static15.aClass36_1 = new Class36(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static230.aClass96_4 = new Class96(Static85.aClass38_1, Static200.anInt4144, true, Static221.aClass83_129, Static88.aClass83_41);
				Static78.aClass195_2 = new Class195(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29, Static324.aClass83_116);
				Static197.aClass30_2 = new Class30(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29, Static324.aClass83_116);
				Static207.aClass32_1 = new Class32(Static85.aClass38_1, Static200.anInt4144, true, Static97.aClass83_46, Static88.aClass83_41);
				Static57.aClass196_1 = new Class196(Static85.aClass38_1, Static200.anInt4144, true, Static57.aClass79_1, Static1.aClass83_131, Static88.aClass83_41);
				Static261.aClass97_1 = new Class97(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static333.aClass50_2 = new Class50(Static85.aClass38_1, Static200.anInt4144, Static281.aClass83_99, Static45.aClass83_117, Static235.aClass83_85);
				Static194.aClass52_1 = new Class52(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static371.aClass162_1 = new Class162(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static153.aClass116_1 = new Class116(Static85.aClass38_1, Static200.anInt4144, Static210.aClass83_127, Static88.aClass83_41);
				Static80.aClass172_1 = new Class172(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static136.aClass140_2 = new Class140(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static230.aClass71_1 = new Class71(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static19.aClass132_1 = new Class132(Static85.aClass38_1, Static200.anInt4144, Static33.aClass83_5);
				Static179.aClass204_1 = new Class204(Static85.aClass38_1, Static200.anInt4144, Static48.aClass83_29);
				Static28.method327(Static381.aClass83_125, Static208.aClass83_76, Static324.aClass83_116, Static88.aClass83_41);
				Static30.method348(Static235.aClass83_84, new Class107(), Static12.aClass83_6);
				Static326.method5248(Static12.aClass83_6, Static235.aClass83_84);
				Static119.aString20 = Static91.aClass62_65.method1389(Static200.anInt4144);
				Static385.anInt7000 = 65;
				Static344.method5500();
				Static230.aClass96_4.method2300(!Static40.method575());
				Static179.aClass115_1 = new Class115();
				Static77.method1330();
				Static380.anInt6937 = 120;
			}
		} else if (Static380.anInt6937 == 120) {
			local5 = Static392.method6137(Static324.aClass83_116);
			local60 = Static339.method5449();
			if (local5 < local60) {
				Static119.aString20 = Static224.aClass62_157.method1389(Static200.anInt4144) + local5 * 100 / local60 + "%";
				Static385.anInt7000 = 70;
			} else {
				Static344.method5504(Static324.aClass83_116, Static383.aClass48_9);
				Static181.method3325(Static221.aClass27Array60);
				Static119.aString20 = Static146.aClass62_105.method1389(Static200.anInt4144);
				Static385.anInt7000 = 70;
				Static380.anInt6937 = 130;
			}
		} else if (Static380.anInt6937 == 130) {
			Static119.aString20 = Static263.aClass62_182.method1389(Static200.anInt4144);
			Static380.anInt6937 = 140;
			Static385.anInt7000 = 75;
		} else if (Static380.anInt6937 == 140) {
			if (Static130.aClass83_119.method1964("huffman", "")) {
				@Pc(1251) Class25 local1251 = new Class25(Static130.aClass83_119.method1953("huffman", ""));
				Static112.method1692(local1251);
				Static119.aString20 = Static276.aClass62_250.method1389(Static200.anInt4144);
				Static380.anInt6937 = 150;
				Static385.anInt7000 = 80;
			} else {
				Static119.aString20 = Static261.aClass62_180.method1389(Static200.anInt4144) + "0%";
				Static385.anInt7000 = 80;
			}
		} else if (Static380.anInt6937 == 150) {
			if (!Static208.aClass83_76.method1948()) {
				Static119.aString20 = Static53.aClass62_35.method1389(Static200.anInt4144) + Static208.aClass83_76.method1957() * 3 / 4 + "%";
				Static385.anInt7000 = 85;
			} else if (!Static51.aClass83_30.method1948()) {
				Static119.aString20 = Static53.aClass62_35.method1389(Static200.anInt4144) + (Static51.aClass83_30.method1957() / 10 + 75) + "%";
				Static385.anInt7000 = 85;
			} else if (!Static381.aClass83_125.method1948()) {
				Static119.aString20 = Static53.aClass62_35.method1389(Static200.anInt4144) + (Static381.aClass83_125.method1957() / 20 + 85) + "%";
				Static385.anInt7000 = 85;
			} else if (Static86.aClass83_38.method1963("details")) {
				Static20.method4162(Static86.aClass83_38, Static313.aClass126_5, Static14.aClass233_1, Static230.aClass96_4, Static78.aClass195_2, Static197.aClass30_2, Static179.aClass115_1);
				Static380.method5989(Static301.aClass83_108);
				Static321.method5186(Static332.anInterface3_7, Static88.aClass83_41);
				Static119.aString20 = Static249.aClass62_173.method1389(Static200.anInt4144);
				Static385.anInt7000 = 85;
				Static380.anInt6937 = 160;
			} else {
				Static119.aString20 = Static53.aClass62_35.method1389(Static200.anInt4144) + (Static86.aClass83_38.method1982("details") / 10 + 90) + "%";
				Static385.anInt7000 = 85;
			}
		} else if (Static380.anInt6937 == 160) {
			local5 = Static125.method2192();
			if (local5 == -1) {
				Static119.aString20 = Static248.aClass62_172.method1389(Static200.anInt4144);
				Static385.anInt7000 = 90;
			} else if (local5 == 7 || local5 == 9) {
				this.method767("worldlistfull");
				Static181.method3326(1000);
			} else if (Static108.aBoolean179) {
				Static119.aString20 = Static202.aClass62_147.method1389(Static200.anInt4144);
				Static385.anInt7000 = 90;
				Static380.anInt6937 = 170;
			} else {
				this.method767("worldlistio_" + local5);
				Static181.method3326(1000);
			}
		} else if (Static380.anInt6937 == 170) {
			Static197.aStringArray20 = new String[Static136.aClass140_2.anInt4110];
			Static318.anIntArray509 = new int[Static230.aClass71_1.anInt1975];
			Static137.aBooleanArray7 = new boolean[Static230.aClass71_1.anInt1975];
			for (local5 = 0; local5 < Static230.aClass71_1.anInt1975; local5++) {
				if (Static230.aClass71_1.method1558(local5).anInt5675 == 0) {
					Static137.aBooleanArray7[local5] = true;
					Static350.anInt6469++;
				}
				Static318.anIntArray509[local5] = -1;
			}
			Static7.method67();
			Static383.anInt6965 = Static208.aClass83_76.method1961("loginscreen");
			Static90.aClass83_42.method1980(false);
			Static279.aClass83_95.method1980(true);
			Static324.aClass83_116.method1980(true);
			Static381.aClass83_125.method1980(true);
			Static130.aClass83_119.method1980(true);
			Static208.aClass83_76.method1980(true);
			Static48.aClass83_29.anInt2413 = 2;
			Static128.aBoolean192 = true;
			Static350.aClass83_122.anInt2413 = 2;
			Static221.aClass83_129.anInt2413 = 2;
			Static97.aClass83_46.anInt2413 = 2;
			Static1.aClass83_131.anInt2413 = 2;
			Static281.aClass83_99.anInt2413 = 2;
			Static210.aClass83_127.anInt2413 = 2;
			Static314.method5081(-1, Static202.anInt4200, false, -1);
			Static119.aString20 = Static120.aClass62_89.method1389(Static200.anInt4144);
			Static385.anInt7000 = 95;
			Static380.anInt6937 = 180;
		} else if (Static380.anInt6937 == 180) {
			Static324.method5231(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method770() {
		if (Static121.anInt6774 == 1000) {
			return;
		}
		Static339.anInt6265++;
		if (Static339.anInt6265 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static131.anInt2859 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static224.aRandom1.setSeed((long) Static131.anInt2859);
		}
		if (Static339.anInt6265 % 50 == 0) {
			Static328.anInt6050 = Static261.anInt4992;
			Static261.anInt4992 = 0;
			Static71.anInt1602 = Static347.anInt6376;
			Static347.anInt6376 = 0;
		}
		this.method783();
		if (Static115.aClass45_1 != null) {
			Static115.aClass45_1.method886();
		}
		Static194.method3544();
		Static131.method2293();
		Static68.aClass98_1.method4514();
		Static136.aClass91_2.method5217();
		if (Static366.aClass29_1 != null) {
			@Pc(91) int local91 = Static366.aClass29_1.method514();
			Static256.anInt4912 = local91;
		}
		if (Static383.aClass48_9 != null) {
			Static383.aClass48_9.method2501((int) Static101.method1805());
		}
		Static276.method6127();
		Static154.anInt3218 = 0;
		for (@Pc(108) Class13 local108 = Static68.aClass98_1.method4513(); local108 != null && Static154.anInt3218 < 128; local108 = Static68.aClass98_1.method4513()) {
			if (local108.method119() != 1) {
				@Pc(121) char local121 = local108.method120();
				if (!Static192.method3515() || local121 != '`' && local121 != '§') {
					Static286.aClass13Array1[Static154.anInt3218] = local108;
					Static154.anInt3218++;
				} else if (Static327.method5270()) {
					Static185.method3423();
				} else {
					Static6.method63();
				}
			}
		}
		Static248.aClass2_Sub17_1 = null;
		for (@Pc(170) Class2_Sub17 local170 = Static136.aClass91_2.method5219(); local170 != null; local170 = Static136.aClass91_2.method5219()) {
			@Pc(176) int local176 = local170.method2187();
			if (local176 == -1) {
				Static142.aClass238_9.method5796(local170);
			} else if (Static139.method2408(local176)) {
				Static248.aClass2_Sub17_1 = local170;
			}
		}
		if (Static327.method5270()) {
			Static184.method3413();
		}
		if (Static121.anInt6774 == 0) {
			this.method775();
			Static119.method2131();
		} else if (Static121.anInt6774 == 5) {
			this.method775();
			Static119.method2131();
		} else if (Static121.anInt6774 == 25 || Static121.anInt6774 == 28) {
			Static359.method5671();
		}
		if (Static121.anInt6774 == 10) {
			this.method777();
			Static199.method3646();
			Static75.method1312();
			Static337.method5437();
		} else if (Static121.anInt6774 == 30) {
			Static112.method1691();
		} else if (Static121.anInt6774 == 40) {
			Static337.method5437();
			if (Static228.anInt4595 != -3 && Static228.anInt4595 != 2 && Static228.anInt4595 != 15) {
				Static241.method2190();
			}
		}
		Static68.method1233(Static383.aClass48_9);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method777() {
		Static278.anInt5166++;
		Static315.method5101(-1, -1, null);
		Static38.method534(-1, null, -1);
		Static215.method3853();
		Static245.anInt4796++;
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			@Pc(37) Class1_Sub2_Sub1_Sub2 local37 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local31];
			if (local37 != null) {
				@Pc(43) byte local43 = local37.aClass197_1.aByte55;
				if ((local43 & 0x1) != 0) {
					@Pc(54) int local54 = local37.method4792();
					@Pc(81) int local81;
					if ((local43 & 0x2) != 0 && local37.anInt5432 == 0 && Math.random() * 1000.0D < 10.0D) {
						local81 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(89) int local89 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local81 != 0 || local89 != 0) {
							@Pc(103) int local103 = local81 + local37.anIntArray466[0];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > Static89.anInt1891 - local54 - 1) {
								local103 = Static89.anInt1891 - local54 - 1;
							}
							@Pc(136) int local136 = local89 + local37.anIntArray465[0];
							if (local136 < 0) {
								local136 = 0;
							} else if (Static85.anInt1839 - local54 - 1 < local136) {
								local136 = Static85.anInt1839 - local54 - 1;
							}
							@Pc(182) int local182 = Static40.method572(Static165.aClass178Array1[local37.aByte73], local54, local54, 0, 0, local37.anIntArray465[0], local103, local37.anIntArray466[0], true, local54, -1, Static132.anIntArray219, local136, Static365.anIntArray570);
							if (local182 > 0) {
								if (local182 > 9) {
									local182 = 9;
								}
								for (@Pc(193) int local193 = 0; local193 < local182; local193++) {
									local37.anIntArray466[local193] = Static132.anIntArray219[local182 - local193 - 1];
									local37.anIntArray465[local193] = Static365.anIntArray570[local182 - local193 - 1];
									local37.aByteArray78[local193] = 1;
								}
								local37.anInt5432 = local182;
							}
						}
					}
					Static328.method5288(local37, true);
					local81 = Static69.method1259(local37);
					Static381.method5694(local37, Static263.anInt5015, local81, Static209.anInt4255);
					Static288.method4745(local37);
				}
			}
		}
		if (Static147.anInt3137 == 0 && Static35.anInt619 == 0) {
			if (Static198.anInt4108 == 2) {
				Static224.method3965();
			} else {
				Static287.method4734();
			}
			if (Static145.anInt5345 >> 7 < 14 || Static145.anInt5345 >> 7 >= Static89.anInt1891 - 14 || Static27.anInt2842 >> 7 < 14 || Static85.anInt1839 - 14 <= Static27.anInt2842 >> 7) {
				Static388.method6093();
			}
		}
		while (true) {
			@Pc(305) Class2_Sub5 local305;
			@Pc(310) Class3 local310;
			@Pc(321) Class3 local321;
			do {
				local305 = (Class2_Sub5) Static342.aClass238_41.method5803();
				if (local305 == null) {
					while (true) {
						do {
							local305 = (Class2_Sub5) Static207.aClass238_18.method5803();
							if (local305 == null) {
								while (true) {
									do {
										local305 = (Class2_Sub5) Static269.aClass238_30.method5803();
										if (local305 == null) {
											if (Static268.aClass3_13 != null) {
												Static339.method5457();
											}
											if (Static339.anInt6265 % 1500 == 0) {
												Static8.method375();
											}
											Static127.method2225();
											if (Static176.aBoolean269 && Static194.aLong117 < Static101.method1805() - 60000L) {
												Static209.method3787();
												return;
											}
											return;
										}
										local310 = local305.aClass3_4;
										if (local310.anInt45 < 0) {
											break;
										}
										local321 = Static380.method5987(local310.anInt87);
									} while (local321 == null || local321.aClass3Array1 == null || local310.anInt45 >= local321.aClass3Array1.length || local321.aClass3Array1[local310.anInt45] != local310);
									Static351.method5589(local305);
								}
							}
							local310 = local305.aClass3_4;
							if (local310.anInt45 < 0) {
								break;
							}
							local321 = Static380.method5987(local310.anInt87);
						} while (local321 == null || local321.aClass3Array1 == null || local321.aClass3Array1.length <= local310.anInt45 || local321.aClass3Array1[local310.anInt45] != local310);
						Static351.method5589(local305);
					}
				}
				local310 = local305.aClass3_4;
				if (local310.anInt45 < 0) {
					break;
				}
				local321 = Static380.method5987(local310.anInt87);
			} while (local321 == null || local321.aClass3Array1 == null || local310.anInt45 >= local321.aClass3Array1.length || local310 != local321.aClass3Array1[local310.anInt45]);
			Static351.method5589(local305);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method758() {
		if (Static121.anInt6774 == 1000) {
			return;
		}
		@Pc(23) long local23 = Static231.method4177() / 1000000L - Static286.aLong160;
		Static286.aLong160 = Static231.method4177() / 1000000L;
		@Pc(31) boolean local31 = Static118.method4788();
		if (local31 && Static361.aBoolean293 && Static42.aClass89_1 != null) {
			Static42.aClass89_1.method5865();
		}
		if (Static121.anInt6774 == 30 || Static121.anInt6774 == 10) {
			if (Static345.aLong187 != 0L && Static101.method1805() > Static345.aLong187) {
				Static314.method5081(Static120.anInt2646, Static195.method3553(), false, Static260.anInt4975);
			} else if (Static383.aClass48_9.method2488() && Static192.aBoolean287) {
				Static33.method123();
			}
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static33.aFrame2 == null) {
			@Pc(85) Container local85;
			if (Static115.aFrame3 == null) {
				local85 = Static154.aClass123_2.anApplet1;
			} else {
				local85 = Static115.aFrame3;
			}
			local94 = local85.getSize().width;
			local98 = local85.getSize().height;
			if (local85 == Static115.aFrame3) {
				@Pc(104) Insets local104 = Static115.aFrame3.getInsets();
				local94 -= local104.left + local104.right;
				local98 -= local104.top + local104.bottom;
			}
			if (local94 != Static316.anInt5775 || local98 != Static72.anInt1616) {
				if (Static383.aClass48_9 == null || Static383.aClass48_9.method2481()) {
					Static141.method2425();
				} else {
					Static316.anInt5775 = local94;
					Static72.anInt1616 = local98;
				}
				Static345.aLong187 = Static101.method1805() + 500L;
			}
		}
		if (Static33.aFrame2 != null && !Static174.aBoolean267 && (Static121.anInt6774 == 30 || Static121.anInt6774 == 10)) {
			Static314.method5081(-1, Static202.anInt4200, false, -1);
		}
		@Pc(164) boolean local164 = false;
		if (Static347.aBoolean459) {
			Static347.aBoolean459 = false;
			local164 = true;
		}
		if (local164) {
			Static215.method3857();
		}
		if (Static383.aClass48_9 != null && Static383.aClass48_9.method2544() || Static195.method3553() != 1) {
			Static59.method899();
		}
		if (Static121.anInt6774 == 0) {
			Static15.method176(Static385.anInt7000, Static183.aColorArray1[Static217.anInt4400], local164, Static330.aColorArray3[Static217.anInt4400], Static257.aColorArray2[Static217.anInt4400], Static119.aString20);
		} else if (Static121.anInt6774 == 5) {
			Static59.method901(Static180.aClass44_4, Static257.aColorArray2[Static217.anInt4400].getRGB(), Static383.aClass48_9, Static183.aColorArray1[Static217.anInt4400].getRGB(), local164 | Static383.aClass48_9.method2544(), Static330.aColorArray3[Static217.anInt4400].getRGB());
		} else if (Static121.anInt6774 == 10) {
			Static38.method540();
		} else if (Static121.anInt6774 == 25 || Static121.anInt6774 == 28) {
			if (Static23.anInt364 == 1) {
				if (Static51.anInt1104 > Static350.anInt6467) {
					Static350.anInt6467 = Static51.anInt1104;
				}
				local94 = (Static350.anInt6467 - Static51.anInt1104) * 50 / Static350.anInt6467;
				Static88.method1497(true, Static31.aClass44_1, Static87.aClass62_60.method1389(Static200.anInt4144) + "<br>(" + local94 + "%)");
			} else if (Static23.anInt364 == 2) {
				if (Static202.anInt4204 > Static382.anInt6949) {
					Static382.anInt6949 = Static202.anInt4204;
				}
				local94 = (Static382.anInt6949 - Static202.anInt4204) * 50 / Static382.anInt6949 + 50;
				Static88.method1497(true, Static31.aClass44_1, Static87.aClass62_60.method1389(Static200.anInt4144) + "<br>(" + local94 + "%)");
			} else {
				Static88.method1497(true, Static31.aClass44_1, Static87.aClass62_60.method1389(Static200.anInt4144));
			}
		} else if (Static121.anInt6774 == 30) {
			Static235.method4214(local23);
		} else if (Static121.anInt6774 == 40) {
			Static88.method1497(true, Static31.aClass44_1, Static88.aClass62_62.method1389(Static200.anInt4144) + "<br>" + Static68.aClass62_47.method1389(Static200.anInt4144));
		}
		if (Static208.anInt4248 == 3) {
			for (local94 = 0; local94 < Static198.anInt4111; local94++) {
				@Pc(396) Rectangle local396 = Class196.aRectangleArray1[local94];
				if (Static52.aBooleanArray13[local94]) {
					Static383.aClass48_9.method2509(local396.height, local396.width, local396.y, -1996553985, local396.x);
				} else if (Static71.aBooleanArray8[local94]) {
					Static383.aClass48_9.method2509(local396.height, local396.width, local396.y, -1996554240, local396.x);
				}
			}
		}
		if (Static327.method5270()) {
			Static142.method2433(Static383.aClass48_9);
		}
		if ((Static121.anInt6774 == 30 || Static121.anInt6774 == 10) && Static208.anInt4248 == 0 && Static195.method3553() == 1 && !local164 && Static175.aString31.equals("1.1")) {
			local94 = 0;
			for (local98 = 0; local98 < Static198.anInt4111; local98++) {
				if (Static71.aBooleanArray8[local98]) {
					Static71.aBooleanArray8[local98] = false;
					Static297.aRectangleArray2[local94++] = Class196.aRectangleArray1[local98];
				}
			}
			Static383.aClass48_9.method2480(Static297.aRectangleArray2, local94);
		} else if (Static121.anInt6774 != 0) {
			Static383.aClass48_9.method2538();
			for (local94 = 0; local94 < Static198.anInt4111; local94++) {
				Static71.aBooleanArray8[local94] = false;
			}
		}
		if (Static71.anInt1579 == 0) {
			Static215.method3855(15L);
		} else if (Static71.anInt1579 == 1) {
			Static215.method3855(10L);
		} else if (Static71.anInt1579 == 2) {
			Static215.method3855(5L);
		} else if (Static71.anInt1579 == 3) {
			Static215.method3855(2L);
		}
		if (Static128.aBoolean192) {
			Static142.method2435();
		}
		if (Static70.aBoolean117 && Static121.anInt6774 == 10 && Static388.anInt7080 != -1) {
			Static70.aBoolean117 = false;
			Static237.method4219(Static154.aClass123_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method769() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static141.method2425();
		Static64.aClass221_2 = new Class221(Static154.aClass123_2);
		Static364.aClass222_3 = new Class222();
		if (Static158.aClass49_3 != Static306.aClass49_7) {
			Static132.aByteArrayArray10 = new byte[50][];
		}
		Static379.method5965(Static154.aClass123_2);
		if (Static158.aClass49_3 == Static306.aClass49_7) {
			Static79.aString18 = this.getCodeBase().getHost();
			Static327.anInt6033 = 43594;
			Static236.anInt4682 = 443;
		} else if (Static32.method368(Static306.aClass49_7)) {
			Static79.aString18 = this.getCodeBase().getHost();
			Static236.anInt4682 = Static329.anInt6058 + 50000;
			Static327.anInt6033 = Static329.anInt6058 + 40000;
		} else if (Static348.aClass49_8 == Static306.aClass49_7) {
			Static79.aString18 = "127.0.0.1";
			Static236.anInt4682 = Static329.anInt6058 + 50000;
			Static327.anInt6033 = Static329.anInt6058 + 40000;
		}
		Static283.aString49 = Static79.aString18;
		Static292.anInt5460 = Static327.anInt6033;
		Static114.anInt2525 = Static327.anInt6033;
		Static167.anInt3451 = Static236.anInt4682;
		Static53.aShortArray9 = Static388.aShortArray118 = Static44.aShortArray8 = Static249.aShortArray79 = new short[256];
		if (Static175.anInt3717 == 3) {
			Static4.anInt134 = Static329.anInt6058;
		}
		if (Static202.aClass38_2 == Static85.aClass38_1) {
			Static257.aShortArray90 = Static346.aShortArray114;
			Static228.aBoolean332 = true;
			Static46.anInt5338 = 0;
			Static57.aShortArray10 = Static305.aShortArray117;
			Static64.aShortArrayArray8 = Static23.aShortArrayArray4;
			Static39.anInt671 = 16777215;
			Static1.aShortArrayArray30 = Static139.aShortArrayArray12;
		} else {
			Static257.aShortArray90 = Static284.aShortArray99;
			Static64.aShortArrayArray8 = Static181.aShortArrayArray15;
			Static57.aShortArray10 = Static380.aShortArray116;
			Static1.aShortArrayArray30 = Static357.aShortArrayArray27;
		}
		Static384.anInt6975 = Static292.anInt5460;
		Static68.aClass98_1 = Static178.method3287(Static343.aCanvas5);
		Static136.aClass91_2 = Static104.method1849(Static343.aCanvas5);
		Static366.aClass29_1 = Static193.method3518();
		if (Static366.aClass29_1 != null) {
			Static366.aClass29_1.method513(Static343.aCanvas5);
		}
		Static134.anInt2936 = Static175.anInt3717;
		try {
			if (Static154.aClass123_2.aClass248_4 != null) {
				Static164.aClass70_5 = new Class70(Static154.aClass123_2.aClass248_4, 5200, 0);
				for (@Pc(167) int local167 = 0; local167 < 29; local167++) {
					Static33.aClass70Array2[local167] = new Class70(Static154.aClass123_2.aClass248Array1[local167], 6000, 0);
				}
				Static54.aClass70_1 = new Class70(Static154.aClass123_2.aClass248_2, 6000, 0);
				Static324.aClass93_4 = new Class93(255, Static164.aClass70_5, Static54.aClass70_1, 500000);
				Static151.aClass70_6 = new Class70(Static154.aClass123_2.aClass248_3, 24, 0);
				Static154.aClass123_2.aClass248_2 = null;
				Static154.aClass123_2.aClass248Array1 = null;
				Static154.aClass123_2.aClass248_4 = null;
				Static154.aClass123_2.aClass248_3 = null;
			}
		} catch (@Pc(225) IOException local225) {
			Static54.aClass70_1 = null;
			Static164.aClass70_5 = null;
			Static151.aClass70_6 = null;
			Static324.aClass93_4 = null;
		}
		if (Static158.aClass49_3 != Static306.aClass49_7) {
			Static25.aBoolean303 = true;
		}
		Static326.aString57 = (Static255.aClass38_3 == Static85.aClass38_1 ? Static14.aClass62_10 : Static77.aClass62_51).method1389(Static200.anInt4144);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method772() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method764()) {
			return;
		}
		Static329.anInt6058 = Integer.parseInt(this.getParameter("worldid"));
		Static306.aClass49_7 = Static203.method3458(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static32.method368(Static306.aClass49_7) && Static306.aClass49_7 != Static158.aClass49_3) {
			Static306.aClass49_7 = Static158.aClass49_3;
		}
		Static115.aClass225_2 = Static194.method3546(Integer.parseInt(this.getParameter("modewhat")));
		if (Static391.aClass225_4 != Static115.aClass225_2 && Static115.aClass225_2 != Static281.aClass225_3 && Static115.aClass225_2 != Static18.aClass225_1) {
			Static115.aClass225_2 = Static18.aClass225_1;
		}
		try {
			Static200.anInt4144 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static200.anInt4144 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static199.aBoolean301 = true;
		} else {
			Static199.aBoolean301 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static271.aBoolean375 = true;
		} else {
			Static271.aBoolean375 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static217.aBoolean315 = true;
		} else {
			Static217.aBoolean315 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static85.aClass38_1 = Static202.aClass38_2;
		} else {
			Static85.aClass38_1 = Static255.aClass38_3;
		}
		try {
			Static369.anInt6788 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static369.anInt6788 = 0;
		}
		Static65.aString15 = this.getParameter("quiturl");
		Static60.aString14 = this.getParameter("settings");
		if (Static60.aString14 == null) {
			Static60.aString14 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static320.anInt7073 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static320.anInt7073 = 0;
			}
		}
		Static217.anInt4400 = Integer.parseInt(this.getParameter("colourid"));
		if (Static217.anInt4400 < 0 || Static217.anInt4400 >= Static183.aColorArray1.length) {
			Static217.anInt4400 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static102.aBoolean167 = true;
			Static294.aBoolean401 = true;
		}
		if (Static255.aClass38_3 == Static85.aClass38_1) {
			Static125.anInt2718 = 503;
			Static26.anInt374 = 765;
		} else if (Static202.aClass38_2 == Static85.aClass38_1) {
			Static26.anInt374 = 640;
			Static125.anInt2718 = 480;
		}
		Static12.aClient1 = this;
		this.method765(Static115.aClass225_2.method5539() + 32, Static26.anInt374, Static125.anInt2718);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method783() {
		@Pc(7) boolean local7 = Static364.aClass222_3.method5530();
		if (!local7) {
			this.method785();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method785() {
		if (Static364.aClass222_3.anInt6359 > Static253.anInt4866) {
			Static360.anInt6723 = (Static364.aClass222_3.anInt6359 * 50 - 50) * 5;
			if (Static114.anInt2525 == Static384.anInt6975) {
				Static384.anInt6975 = Static167.anInt3451;
			} else {
				Static384.anInt6975 = Static114.anInt2525;
			}
			if (Static360.anInt6723 > 3000) {
				Static360.anInt6723 = 3000;
			}
			if (Static364.aClass222_3.anInt6359 >= 2 && Static364.aClass222_3.anInt6358 == 6) {
				this.method767("js5connect_outofdate");
				Static121.anInt6774 = 1000;
				return;
			}
			if (Static364.aClass222_3.anInt6359 >= 4 && Static364.aClass222_3.anInt6358 == -1) {
				this.method767("js5crc");
				Static121.anInt6774 = 1000;
				return;
			}
			if (Static364.aClass222_3.anInt6359 >= 4 && (Static121.anInt6774 == 0 || Static121.anInt6774 == 5)) {
				if (Static364.aClass222_3.anInt6358 == 7 || Static364.aClass222_3.anInt6358 == 9) {
					this.method767("js5connect_full");
				} else if (Static364.aClass222_3.anInt6358 <= 0) {
					this.method767("js5io");
				} else {
					this.method767("js5connect");
				}
				Static121.anInt6774 = 1000;
				return;
			}
		}
		Static253.anInt4866 = Static364.aClass222_3.anInt6359;
		if (Static360.anInt6723 > 0) {
			Static360.anInt6723--;
			return;
		}
		try {
			if (Static275.anInt6180 == 0) {
				Static372.aClass86_11 = Static154.aClass123_2.method3269(Static384.anInt6975, Static283.aString49);
				Static275.anInt6180++;
			}
			if (Static275.anInt6180 == 1) {
				if (Static372.aClass86_11.anInt2590 == 2) {
					this.method789(1000);
					return;
				}
				if (Static372.aClass86_11.anInt2590 == 1) {
					Static275.anInt6180++;
				}
			}
			if (Static275.anInt6180 == 2) {
				Static91.aClass226_1 = new Class226((Socket) Static372.aClass86_11.anObject2, Static154.aClass123_2);
				@Pc(183) Class2_Sub24 local183 = new Class2_Sub24(5);
				local183.method5746(Static290.aClass15_2.anInt268);
				local183.method5734(574);
				Static91.aClass226_1.method5549(5, local183.aByteArray100);
				Static275.anInt6180++;
				Static361.aLong121 = Static101.method1805();
			}
			if (Static275.anInt6180 == 3) {
				if (Static121.anInt6774 == 0 || Static121.anInt6774 == 5 || Static91.aClass226_1.method5550() > 0) {
					@Pc(230) int local230 = Static91.aClass226_1.method5547();
					if (local230 != 0) {
						this.method789(local230);
						return;
					}
					Static275.anInt6180++;
				} else if (Static101.method1805() - Static361.aLong121 > 30000L) {
					this.method789(1001);
					return;
				}
			}
			if (Static275.anInt6180 == 4) {
				@Pc(283) boolean local283 = Static121.anInt6774 == 5 || Static121.anInt6774 == 10 || Static121.anInt6774 == 28;
				Static364.aClass222_3.method5518(!local283, Static91.aClass226_1);
				Static275.anInt6180 = 0;
				Static372.aClass86_11 = null;
				Static91.aClass226_1 = null;
			}
		} catch (@Pc(300) IOException local300) {
			this.method789(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method789(@OriginalArg(1) int arg0) {
		Static364.aClass222_3.anInt6359++;
		Static91.aClass226_1 = null;
		Static275.anInt6180 = 0;
		Static364.aClass222_3.anInt6358 = arg0;
		Static372.aClass86_11 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method793(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class2_Sub24 local18 = new Class2_Sub24(arg0);
		while (true) {
			while (true) {
				@Pc(22) int local22 = local18.method5732();
				if (local22 == 0) {
					return;
				}
				if (local22 == 1) {
					@Pc(35) int[] local35 = Static360.anIntArray572 = new int[6];
					local35[0] = local18.method5753();
					local35[1] = local18.method5753();
					local35[2] = local18.method5753();
					local35[3] = local18.method5753();
					local35[4] = local18.method5753();
					local35[5] = local18.method5753();
				} else {
					@Pc(85) int local85;
					@Pc(90) int local90;
					if (local22 == 4) {
						local85 = local18.method5732();
						Static65.anIntArray110 = new int[local85];
						for (local90 = 0; local90 < local85; local90++) {
							Static65.anIntArray110[local90] = local18.method5753();
							if (Static65.anIntArray110[local90] == 65535) {
								Static65.anIntArray110[local90] = -1;
							}
						}
					} else if (local22 == 5) {
						local85 = local18.method5732();
						Static353.anIntArray553 = new int[local85];
						for (local90 = 0; local90 < local85; local90++) {
							Static353.anIntArray553[local90] = local18.method5753();
							if (Static353.anIntArray553[local90] == 65535) {
								Static353.anIntArray553[local90] = -1;
							}
						}
					}
				}
			}
		}
	}
}
