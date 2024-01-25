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
				Static4.method25("argument count");
			}
			Static240.anInt4578 = Integer.parseInt(arg0[0]);
			Static10.aClass182_1 = Static205.aClass182_7;
			if (arg0[1].equals("live")) {
				Static201.aClass134_5 = Static138.aClass134_4;
			} else if (arg0[1].equals("rc")) {
				Static201.aClass134_5 = Static47.aClass134_3;
			} else if (arg0[1].equals("wip")) {
				Static201.aClass134_5 = Static320.aClass134_6;
			} else {
				Static4.method25("modewhat");
			}
			Static53.anInt1454 = Static12.method291(arg0[2]);
			if (Static53.anInt1454 == -1) {
				if (arg0[2].equals("english")) {
					Static53.anInt1454 = 0;
				} else if (arg0[2].equals("german")) {
					Static53.anInt1454 = 1;
				} else {
					Static4.method25("language");
				}
			}
			Static364.aBoolean534 = false;
			Static386.aBoolean556 = false;
			if (arg0[3].equals("game0")) {
				Static57.aClass183_3 = Static300.aClass183_5;
			} else if (arg0[3].equals("game1")) {
				Static57.aClass183_3 = Static297.aClass183_4;
			} else {
				Static4.method25("game");
			}
			Static17.anInt475 = 0;
			Static383.anInt6369 = 0;
			Static200.aBoolean330 = true;
			Static17.aBoolean33 = true;
			Static114.anInt2480 = Static57.aClass183_3.anInt5280;
			Static152.aString21 = "";
			@Pc(124) client local124 = new client();
			Static332.aClient1 = local124;
			local124.method1096(Static57.aClass183_3.aString51, Static201.aClass134_5.method3265() + 32);
			Static10.aFrame1.setLocation(40, 40);
		} catch (@Pc(147) Exception local147) {
			Static324.method5974(local147, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1103() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static428.method5557();
		Static212.aClass46_2 = new Class46(Static66.aClass143_2);
		Static265.aClass257_2 = new Class257();
		if (Static191.aClass182_6 != Static10.aClass182_1) {
			Static257.aByteArrayArray10 = new byte[50][];
		}
		Static374.aClass20_Sub1_1 = new Class20_Sub1(Static66.aClass143_2);
		if (Static191.aClass182_6 == Static10.aClass182_1) {
			Static241.aString38 = this.getCodeBase().getHost();
			Static339.anInt5769 = 43594;
			Static312.anInt5519 = 443;
		} else if (Static342.method4537(Static10.aClass182_1)) {
			Static241.aString38 = this.getCodeBase().getHost();
			Static339.anInt5769 = Static240.anInt4578 + 40000;
			Static312.anInt5519 = Static240.anInt4578 + 50000;
		} else if (Static205.aClass182_7 == Static10.aClass182_1) {
			Static241.aString38 = "127.0.0.1";
			Static312.anInt5519 = Static240.anInt4578 + 50000;
			Static339.anInt5769 = Static240.anInt4578 + 40000;
		}
		Static219.anInt4144 = Static312.anInt5519;
		Static306.anInt5453 = Static339.anInt5769;
		Static452.aString67 = Static241.aString38;
		Static192.anInt3847 = Static339.anInt5769;
		if (Static297.aClass183_4 == Static57.aClass183_3) {
			Static331.aShortArray158 = Static189.aShortArray68;
			Static293.aShortArray92 = Static300.aShortArray96;
			Static348.aBoolean510 = true;
			Static251.aShortArrayArray3 = Static229.aShortArrayArray2;
			Static109.aShortArrayArray1 = Static278.aShortArrayArray4;
			Static219.anInt4146 = 0;
			Static407.anInt6698 = 16777215;
		} else {
			Static331.aShortArray158 = Static115.aShortArray32;
			Static293.aShortArray92 = Static334.aShortArray116;
			Static251.aShortArrayArray3 = Static377.aShortArrayArray6;
			Static109.aShortArrayArray1 = Static432.aShortArrayArray7;
		}
		Static6.aShortArray1 = Static212.aShortArray63 = Static426.aShortArray143 = Static52.aShortArray20 = new short[256];
		Static417.anInt6845 = Static192.anInt3847;
		if (Static227.anInt4227 == 3) {
			Static101.anInt6819 = Static240.anInt4578;
		}
		Static263.aClass10_1 = Static296.method4147(Static392.aCanvas6);
		Static290.aClass100_1 = Static405.method5231(Static392.aCanvas6);
		Static130.aClass234_2 = Static132.method2049();
		if (Static130.aClass234_2 != null) {
			Static130.aClass234_2.method5930(Static392.aCanvas6);
		}
		Static312.anInt5524 = Static227.anInt4227;
		try {
			if (Static66.aClass143_2.aClass256_3 != null) {
				Static136.aClass103_1 = new Class103(Static66.aClass143_2.aClass256_3, 5200, 0);
				for (@Pc(172) int local172 = 0; local172 < 30; local172++) {
					Static148.aClass103Array1[local172] = new Class103(Static66.aClass143_2.aClass256Array1[local172], 6000, 0);
				}
				Static152.aClass103_2 = new Class103(Static66.aClass143_2.aClass256_2, 6000, 0);
				Static94.aClass228_4 = new Class228(255, Static136.aClass103_1, Static152.aClass103_2, 500000);
				Static415.aClass103_5 = new Class103(Static66.aClass143_2.aClass256_4, 24, 0);
				Static66.aClass143_2.aClass256_3 = null;
				Static66.aClass143_2.aClass256Array1 = null;
				Static66.aClass143_2.aClass256_2 = null;
				Static66.aClass143_2.aClass256_4 = null;
			}
		} catch (@Pc(230) IOException local230) {
			Static94.aClass228_4 = null;
			Static152.aClass103_2 = null;
			Static415.aClass103_5 = null;
			Static136.aClass103_1 = null;
		}
		if (Static191.aClass182_6 != Static10.aClass182_1) {
			Static188.aBoolean323 = true;
		}
		Static47.aString5 = (Static57.aClass183_3 == Static300.aClass183_5 ? Static242.aClass189_146 : Static121.aClass189_83).method4262(Static53.anInt1454);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1101() {
		if (Static120.anInt2584 == 1000) {
			return;
		}
		Static253.anInt4787++;
		if (Static253.anInt4787 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static124.anInt7634 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static396.aRandom1.setSeed((long) Static124.anInt7634);
		}
		if (Static253.anInt4787 % 50 == 0) {
			Static293.anInt5277 = Static295.anInt5288;
			Static420.anInt6876 = Static66.anInt1701;
			Static295.anInt5288 = 0;
			Static66.anInt1701 = 0;
		}
		this.method1115();
		if (Static430.aClass198_2 != null) {
			Static430.aClass198_2.method4351();
		}
		Static278.method3930();
		Static263.aClass10_1.method305();
		Static290.aClass100_1.method3214();
		if (Static130.aClass234_2 != null) {
			@Pc(82) int local82 = Static130.aClass234_2.method5929();
			Static316.anInt5563 = local82;
		}
		if (Static121.aClass172_3 != null) {
			Static121.aClass172_3.method5544((int) Static118.method1934());
		}
		Static216.method3292();
		Static43.anInt1138 = 0;
		for (@Pc(104) Class60 local104 = Static263.aClass10_1.method302(); local104 != null && Static43.anInt1138 < 128; local104 = Static263.aClass10_1.method302()) {
			if (local104.method3173() != 1) {
				@Pc(115) char local115 = local104.method3179();
				if (!Static205.method3196() || local115 != '`' && local115 != '§') {
					Static188.aClass60Array1[Static43.anInt1138] = local104;
					Static43.anInt1138++;
				} else if (Static392.method5075()) {
					Static443.method3577();
				} else {
					Static62.method1247();
				}
			}
		}
		for (@Pc(164) Class3_Sub23 local164 = Static290.aClass100_1.method3209(); local164 != null; local164 = Static290.aClass100_1.method3209()) {
			@Pc(170) int local170 = local164.method3478();
			if (local170 == -1) {
				Static337.aClass243_35.method5198(local164);
			} else if (Static165.method2719(local170)) {
				Static79.aClass243_34.method5198(local164);
			}
			if (Static79.aClass243_34.method5201() > 10) {
				Static79.aClass243_34.method5204();
			}
		}
		if (Static392.method5075()) {
			Static377.method4936();
		}
		if (Static120.anInt2584 == 0) {
			this.method1111();
			Static333.method4463();
		} else if (Static120.anInt2584 == 5) {
			this.method1111();
			Static333.method4463();
		} else if (Static120.anInt2584 == 25 || Static120.anInt2584 == 28) {
			Static106.method1829();
		}
		if (Static120.anInt2584 == 10) {
			this.method1113();
			Static43.method832();
			Static246.method3707();
			Static143.method1465();
		} else if (Static120.anInt2584 == 30) {
			Static40.method781();
		} else if (Static120.anInt2584 == 40) {
			Static143.method1465();
			if (Static97.anInt2201 != -3 && Static97.anInt2201 != 2 && Static97.anInt2201 != 15) {
				Static24.method583();
			}
		}
		Static455.method5991(Static121.aClass172_3);
		Static79.aClass243_34.method5204();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1095()) {
			return;
		}
		Static240.anInt4578 = Integer.parseInt(this.getParameter("worldid"));
		Static10.aClass182_1 = Static283.method4035(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static342.method4537(Static10.aClass182_1) && Static10.aClass182_1 != Static191.aClass182_6) {
			Static10.aClass182_1 = Static191.aClass182_6;
		}
		Static201.aClass134_5 = Static201.method4109(Integer.parseInt(this.getParameter("modewhat")));
		if (Static320.aClass134_6 != Static201.aClass134_5 && Static201.aClass134_5 != Static47.aClass134_3 && Static201.aClass134_5 != Static138.aClass134_4) {
			Static201.aClass134_5 = Static138.aClass134_4;
		}
		try {
			Static53.anInt1454 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static53.anInt1454 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static386.aBoolean556 = true;
		} else {
			Static386.aBoolean556 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static364.aBoolean534 = true;
		} else {
			Static364.aBoolean534 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static233.aBoolean386 = true;
		} else {
			Static233.aBoolean386 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static57.aClass183_3 = Static297.aClass183_4;
		} else {
			Static57.aClass183_3 = Static300.aClass183_5;
		}
		try {
			Static17.anInt475 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static17.anInt475 = 0;
		}
		Static57.aString45 = this.getParameter("quiturl");
		Static152.aString21 = this.getParameter("settings");
		if (Static152.aString21 == null) {
			Static152.aString21 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static383.anInt6369 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static383.anInt6369 = 0;
			}
		}
		Static114.anInt2480 = Integer.parseInt(this.getParameter("colourid"));
		if (Static114.anInt2480 < 0 || Static442.aColorArray3.length <= Static114.anInt2480) {
			Static114.anInt2480 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static200.aBoolean330 = true;
			Static17.aBoolean33 = true;
		}
		if (Static57.aClass183_3 == Static300.aClass183_5) {
			Static349.anInt5940 = 765;
			Static213.anInt4087 = 503;
		} else if (Static57.aClass183_3 == Static297.aClass183_4) {
			Static349.anInt5940 = 640;
			Static213.anInt4087 = 480;
		}
		Static332.aClient1 = this;
		this.method1105(Static213.anInt4087, Static201.aClass134_5.method3265() + 32, Static349.anInt5940);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/lang/String;")
	@Override
	protected String method1100() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static223.anInt7618 + "," + Static57.anInt5085 + "," + Static40.anInt1089 + "," + Static44.anInt7276 + "|";
			if (Static379.aClass7_Sub2_Sub3_Sub2_2 != null) {
				local5 = local5 + "2)" + Static6.anInt93 + "," + (Static223.anInt7618 + Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0]) + "," + (Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0] + Static57.anInt5085) + "|";
			}
			local5 = local5 + "3)" + Static105.anInt2382 + "|4)" + Static374.aClass20_Sub1_1.anInt2350 + "|5)" + Static391.method5269() + "|6)" + Static333.anInt5712 + "," + Static123.anInt2625 + "|";
			local5 = local5 + "7)" + Static374.aClass20_Sub1_1.method1805(Static105.anInt2382) + "|";
			local5 = local5 + "8)" + Static374.aClass20_Sub1_1.method1806(Static105.anInt2382) + "|";
			local5 = local5 + "9)" + Static374.aClass20_Sub1_1.aBoolean198 + "|";
			local5 = local5 + "10)" + Static374.aClass20_Sub1_1.aBoolean193 + "|";
			local5 = local5 + "11)" + Static374.aClass20_Sub1_1.aBoolean197 + "|";
			local5 = local5 + "12)" + Static374.aClass20_Sub1_1.method1814(Static105.anInt2382) + "|";
			local5 = local5 + "13)" + Static286.anInt1448 + "]";
		} catch (@Pc(201) Throwable local201) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1111() {
		@Pc(6) int local6;
		if (!Static374.aClass20_Sub1_1.aBoolean189) {
			for (local6 = 0; local6 < Static43.anInt1138; local6++) {
				if (Static188.aClass60Array1[local6].method3179() == 's' || Static188.aClass60Array1[local6].method3179() == 'S') {
					Static374.aClass20_Sub1_1.aBoolean189 = true;
					break;
				}
			}
		}
		@Pc(56) int local56;
		if (Static167.anInt3388 == 0) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local56 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static118.method1934();
			if (Static325.aLong167 == 0L) {
				Static325.aLong167 = local59;
			}
			if (local56 > 16384 && local59 - Static325.aLong167 < 5000L) {
				if (local59 - Static146.aLong92 > 1000L) {
					System.gc();
					Static146.aLong92 = local59;
				}
				Static75.aString10 = Static154.aClass189_98.method4262(Static53.anInt1454);
				Static260.anInt6188 = 5;
			} else {
				Static75.aString10 = Static109.aClass189_79.method4262(Static53.anInt1454);
				Static260.anInt6188 = 5;
				Static167.anInt3388 = 10;
			}
		} else if (Static167.anInt3388 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static382.aClass29Array3[local6] = Static89.method1671(Static40.anInt1089, Static44.anInt7276);
			}
			Static75.aString10 = Static318.aClass189_230.method4262(Static53.anInt1454);
			Static167.anInt3388 = 20;
			Static260.anInt6188 = 10;
		} else if (Static167.anInt3388 == 20) {
			if (Static430.aClass198_2 == null) {
				Static430.aClass198_2 = new Class198(Static265.aClass257_2, Static212.aClass46_2);
			}
			if (Static430.aClass198_2.method4350()) {
				Static305.aClass32_70 = Static224.method3356(0, false, true);
				Static416.aClass32_83 = Static224.method3356(1, false, true);
				Static13.aClass32_4 = Static224.method3356(2, false, true);
				Static295.aClass32_67 = Static224.method3356(3, false, true);
				Static69.aClass32_30 = Static224.method3356(4, false, true);
				Static64.aClass32_28 = Static224.method3356(5, true, true);
				Static149.aClass32_43 = Static224.method3356(6, true, false);
				Static104.aClass32_35 = Static224.method3356(7, false, true);
				Static405.aClass32_82 = Static224.method3356(8, false, true);
				Static188.aClass32_46 = Static224.method3356(9, false, true);
				Static38.aClass32_13 = Static224.method3356(10, false, true);
				Static280.aClass32_65 = Static224.method3356(11, false, true);
				Static46.aClass32_17 = Static224.method3356(12, false, true);
				Static56.aClass32_26 = Static224.method3356(13, false, true);
				Static9.aClass32_3 = Static224.method3356(14, false, false);
				Static316.aClass32_71 = Static224.method3356(15, false, true);
				Static172.aClass32_45 = Static224.method3356(16, false, true);
				Static5.aClass32_1 = Static224.method3356(17, false, true);
				Static333.aClass32_72 = Static224.method3356(18, false, true);
				Static50.aClass32_20 = Static224.method3356(19, false, true);
				Static14.aClass32_5 = Static224.method3356(20, false, true);
				Static66.aClass32_29 = Static224.method3356(21, false, true);
				Static71.aClass32_31 = Static224.method3356(22, false, true);
				Static419.aClass32_84 = Static224.method3356(23, true, true);
				Static141.aClass32_41 = Static224.method3356(24, false, true);
				Static286.aClass32_23 = Static224.method3356(25, false, true);
				Static99.aClass32_34 = Static224.method3356(26, true, true);
				Static346.aClass32_76 = Static224.method3356(27, false, true);
				Static246.aClass32_56 = Static224.method3356(28, true, true);
				Static62.aClass32_27 = Static224.method3356(29, false, true);
				Static75.aString10 = Static324.aClass189_244.method4262(Static53.anInt1454);
				Static167.anInt3388 = 30;
				Static260.anInt6188 = 15;
			} else {
				Static75.aString10 = Static245.aClass189_149.method4262(Static53.anInt1454);
				Static260.anInt6188 = 12;
			}
		} else if (Static167.anInt3388 == 30) {
			local6 = 0;
			for (local56 = 0; local56 < 30; local56++) {
				local6 += Static438.aClass25_Sub1Array2[local56].method674() * Static217.anIntArray273[local56] / 100;
			}
			if (local6 == 100) {
				Static75.aString10 = Static444.aClass189_238.method4262(Static53.anInt1454);
				Static260.anInt6188 = 20;
				Static135.method2144(Static405.aClass32_82);
				Static58.method1218(Static405.aClass32_82);
				Static167.anInt3388 = 40;
			} else {
				if (local6 != 0) {
					Static75.aString10 = Static105.aClass189_76.method4262(Static53.anInt1454) + local6 + "%";
				}
				Static260.anInt6188 = 20;
			}
		} else if (Static167.anInt3388 == 40) {
			if (Static246.aClass32_56.method810()) {
				this.method1117(Static246.aClass32_56.method811(1));
				Static75.aString10 = Static52.aClass189_37.method4262(Static53.anInt1454);
				Static167.anInt3388 = 50;
				Static260.anInt6188 = 25;
			} else {
				Static75.aString10 = Static432.aClass189_231.method4262(Static53.anInt1454) + Static246.aClass32_56.method796() + "%";
				Static260.anInt6188 = 25;
			}
		} else if (Static167.anInt3388 == 50) {
			Static454.method5988();
			Static75.aString10 = Static33.aClass189_26.method4262(Static53.anInt1454);
			Static260.anInt6188 = 30;
			Static167.anInt3388 = 60;
		} else if (Static167.anInt3388 == 60) {
			local6 = Static428.method5590(Static56.aClass32_26, Static405.aClass32_82);
			local56 = Static332.method4456();
			if (local6 < local56) {
				Static75.aString10 = Static201.aClass189_168.method4262(Static53.anInt1454) + local6 * 100 / local56 + "%";
				Static260.anInt6188 = 35;
			} else {
				Static75.aString10 = Static358.aClass189_196.method4262(Static53.anInt1454);
				Static167.anInt3388 = 70;
				Static260.anInt6188 = 35;
			}
		} else if (Static167.anInt3388 == 70) {
			local6 = Static361.method4771(Static405.aClass32_82);
			local56 = Static31.method4737();
			if (local56 > local6) {
				Static75.aString10 = Static12.aClass189_9.method4262(Static53.anInt1454) + local6 * 100 / local56 + "%";
				Static260.anInt6188 = 40;
			} else {
				Static75.aString10 = Static17.aClass189_11.method4262(Static53.anInt1454);
				Static167.anInt3388 = 80;
				Static260.anInt6188 = 40;
			}
		} else if (Static167.anInt3388 == 80) {
			if (Static99.aClass32_34.method810()) {
				Static180.anInterface5_4 = new Class169(Static99.aClass32_34, Static188.aClass32_46, Static405.aClass32_82);
				Static75.aString10 = Static445.aClass189_240.method4262(Static53.anInt1454);
				Static260.anInt6188 = 45;
				Static167.anInt3388 = 90;
			} else {
				Static75.aString10 = Static113.aClass189_179.method4262(Static53.anInt1454) + Static99.aClass32_34.method796() + "%";
				Static260.anInt6188 = 45;
			}
		} else if (Static167.anInt3388 == 90) {
			Static75.aString10 = Static41.aClass189_30.method4262(Static53.anInt1454);
			Static260.anInt6188 = 50;
			Static167.anInt3388 = 95;
		} else if (Static167.anInt3388 == 95) {
			if (Static374.aClass20_Sub1_1.aBoolean189) {
				Static374.aClass20_Sub1_1.anInt2352 = 0;
				Static374.aClass20_Sub1_1.anInt2351 = 0;
				Static374.aClass20_Sub1_1.anInt2347 = 0;
				Static374.aClass20_Sub1_1.anInt2350 = 0;
				Static374.aClass20_Sub1_1.anInt2353 = 1;
			}
			Static374.aClass20_Sub1_1.aBoolean189 = true;
			Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
			Static194.method3106(false, Static374.aClass20_Sub1_1.anInt2347);
			Static75.aString10 = Static200.aClass189_118.method4262(Static53.anInt1454);
			Static260.anInt6188 = 55;
			Static167.anInt3388 = 100;
		} else if (Static167.anInt3388 == 100) {
			Static323.method844(Static56.aClass32_26, Static405.aClass32_82, Static121.aClass172_3);
			Static75.aString10 = Static23.aClass189_17.method4262(Static53.anInt1454);
			Static260.anInt6188 = 60;
			Static230.method3465(5);
			Static167.anInt3388 = 110;
		} else if (Static167.anInt3388 == 110) {
			Static13.aClass32_4.method810();
			local6 = Static13.aClass32_4.method796();
			Static172.aClass32_45.method810();
			local6 += Static172.aClass32_45.method796();
			Static5.aClass32_1.method810();
			local6 += Static5.aClass32_1.method796();
			Static333.aClass32_72.method810();
			local6 += Static333.aClass32_72.method796();
			Static50.aClass32_20.method810();
			local6 += Static50.aClass32_20.method796();
			Static14.aClass32_5.method810();
			local6 += Static14.aClass32_5.method796();
			Static66.aClass32_29.method810();
			local6 += Static66.aClass32_29.method796();
			Static71.aClass32_31.method810();
			local6 += Static71.aClass32_31.method796();
			Static141.aClass32_41.method810();
			local6 += Static141.aClass32_41.method796();
			Static286.aClass32_23.method810();
			local6 += Static286.aClass32_23.method796();
			Static346.aClass32_76.method810();
			local6 += Static346.aClass32_76.method796();
			Static62.aClass32_27.method810();
			local6 += Static62.aClass32_27.method796();
			if (local6 < 1200) {
				Static75.aString10 = Static120.aClass189_82.method4262(Static53.anInt1454) + local6 / 12 + "%";
				Static260.anInt6188 = 65;
			} else {
				Static318.aClass26_5 = new Class26(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static432.aClass73_1 = new Class73(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static239.aClass263_2 = new Class263(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4, Static405.aClass32_82);
				Static106.aClass211_1 = new Class211(Static57.aClass183_3, Static53.anInt1454, Static5.aClass32_1);
				Static124.aClass226_15 = new Class226(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static26.aClass106_1 = new Class106(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static24.aClass69_1 = new Class69(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4, Static104.aClass32_35);
				Static77.aClass142_1 = new Class142(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static36.aClass242_1 = new Class242(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static435.aClass30_4 = new Class30(Static57.aClass183_3, Static53.anInt1454, true, Static172.aClass32_45, Static104.aClass32_35);
				Static168.aClass171_3 = new Class171(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4, Static405.aClass32_82);
				Static326.aClass164_3 = new Class164(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4, Static405.aClass32_82);
				Static364.aClass96_2 = new Class96(Static57.aClass183_3, Static53.anInt1454, true, Static333.aClass32_72, Static104.aClass32_35);
				Static314.aClass12_2 = new Class12(Static57.aClass183_3, Static53.anInt1454, true, Static318.aClass26_5, Static50.aClass32_20, Static104.aClass32_35);
				Static65.aClass253_1 = new Class253(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static301.aClass170_3 = new Class170(Static57.aClass183_3, Static53.anInt1454, Static14.aClass32_5, Static305.aClass32_70, Static416.aClass32_83);
				Static212.aClass184_1 = new Class184(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static353.aClass212_1 = new Class212(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static96.aClass41_2 = new Class41(Static57.aClass183_3, Static53.anInt1454, Static66.aClass32_29, Static104.aClass32_35);
				Static106.aClass124_1 = new Class124(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static60.aClass85_1 = new Class85(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static369.aClass254_1 = new Class254(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static99.aClass36_1 = new Class36(Static57.aClass183_3, Static53.anInt1454, Static71.aClass32_31);
				Static20.aClass168_1 = new Class168(Static57.aClass183_3, Static53.anInt1454, Static13.aClass32_4);
				Static242.method3659(Static405.aClass32_82, Static104.aClass32_35, Static295.aClass32_67, Static56.aClass32_26);
				Static247.method3715(Static62.aClass32_27);
				Static225.aClass38_1 = new Class38(Static53.anInt1454, Static141.aClass32_41, Static286.aClass32_23);
				Static104.aClass262_1 = new Class262(Static53.anInt1454, Static141.aClass32_41, Static286.aClass32_23, new Class213());
				Static75.aString10 = Static269.aClass189_159.method4262(Static53.anInt1454);
				Static260.anInt6188 = 65;
				Static145.method4742();
				Static435.aClass30_4.method767(!Static374.aClass20_Sub1_1.method1814(Static105.anInt2382));
				Static85.aClass49_1 = new Class49();
				Static176.method2814();
				Static365.method4812(Static346.aClass32_76);
				Static278.method3932(Static180.anInterface5_4, Static104.aClass32_35);
				Static167.anInt3388 = 120;
			}
		} else if (Static167.anInt3388 == 120) {
			local6 = Static84.method1634(Static405.aClass32_82);
			local56 = Static343.method4542();
			if (local6 < local56) {
				Static75.aString10 = Static334.aClass189_183.method4262(Static53.anInt1454) + local6 * 100 / local56 + "%";
				Static260.anInt6188 = 70;
			} else {
				Static104.method1820(Static121.aClass172_3, Static405.aClass32_82);
				Static252.method3756(Static260.aClass8Array170);
				Static75.aString10 = Static257.aClass189_154.method4262(Static53.anInt1454);
				Static260.anInt6188 = 70;
				Static167.anInt3388 = 130;
			}
		} else if (Static167.anInt3388 == 130) {
			if (Static38.aClass32_13.method812("", "huffman")) {
				@Pc(1203) Class33 local1203 = new Class33(Static38.aClass32_13.method813("huffman", ""));
				Static201.method4111(local1203);
				Static75.aString10 = Static262.aClass189_156.method4262(Static53.anInt1454);
				Static167.anInt3388 = 140;
				Static260.anInt6188 = 75;
			} else {
				Static75.aString10 = Static226.aClass189_136.method4262(Static53.anInt1454) + "0%";
				Static260.anInt6188 = 75;
			}
		} else if (Static167.anInt3388 == 140) {
			if (Static295.aClass32_67.method810()) {
				Static75.aString10 = Static140.aClass189_91.method4262(Static53.anInt1454);
				Static260.anInt6188 = 80;
				Static167.anInt3388 = 150;
			} else {
				Static75.aString10 = Static141.aClass189_92.method4262(Static53.anInt1454) + Static295.aClass32_67.method796() + "%";
				Static260.anInt6188 = 80;
			}
		} else if (Static167.anInt3388 == 150) {
			if (Static46.aClass32_17.method810()) {
				Static75.aString10 = Static250.aClass189_152.method4262(Static53.anInt1454);
				Static260.anInt6188 = 82;
				Static167.anInt3388 = 160;
			} else {
				Static75.aString10 = Static163.aClass189_206.method4262(Static53.anInt1454) + Static46.aClass32_17.method796() + "%";
				Static260.anInt6188 = 82;
			}
		} else if (Static167.anInt3388 == 160) {
			if (Static56.aClass32_26.method810()) {
				Static75.aString10 = Static210.aClass189_130.method4262(Static53.anInt1454);
				Static167.anInt3388 = 170;
				Static260.anInt6188 = 85;
			} else {
				Static75.aString10 = Static210.aClass189_130.method4262(Static53.anInt1454) + Static56.aClass32_26.method796() + "%";
				Static260.anInt6188 = 85;
			}
		} else if (Static167.anInt3388 == 170) {
			if (Static419.aClass32_84.method804("details")) {
				Static144.method4243(Static419.aClass32_84, Static124.aClass226_15, Static26.aClass106_1, Static435.aClass30_4, Static168.aClass171_3, Static326.aClass164_3, Static85.aClass49_1);
				Static75.aString10 = Static315.aClass189_175.method4262(Static53.anInt1454);
				Static260.anInt6188 = 89;
				Static167.anInt3388 = 180;
			} else {
				Static75.aString10 = Static132.aClass189_87.method4262(Static53.anInt1454) + Static419.aClass32_84.method788("details") + "%";
				Static260.anInt6188 = 87;
			}
		} else if (Static167.anInt3388 == 180) {
			local6 = Static306.method4283();
			if (local6 == -1) {
				Static75.aString10 = Static18.aClass189_106.method4262(Static53.anInt1454);
				Static260.anInt6188 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method1094("worldlistfull");
				Static230.method3465(1000);
			} else if (Static422.aBoolean593) {
				Static75.aString10 = Static420.aClass189_227.method4262(Static53.anInt1454);
				Static260.anInt6188 = 90;
				Static167.anInt3388 = 190;
			} else {
				this.method1094("worldlistio_" + local6);
				Static230.method3465(1000);
			}
		} else if (Static167.anInt3388 == 190) {
			Static20.aBooleanArray4 = new boolean[Static369.aClass254_1.anInt6889];
			Static71.aStringArray12 = new String[Static60.aClass85_1.anInt2628];
			Static407.anIntArray453 = new int[Static369.aClass254_1.anInt6889];
			for (local6 = 0; local6 < Static369.aClass254_1.anInt6889; local6++) {
				if (Static369.aClass254_1.method5382(local6).anInt2173 == 0) {
					Static20.aBooleanArray4[local6] = true;
					Static162.anInt3325++;
				}
				Static407.anIntArray453[local6] = -1;
			}
			Static99.method1743();
			Static446.anInt7545 = Static295.aClass32_67.method807("loginscreen");
			Static64.aClass32_28.method791(false);
			Static149.aClass32_43.method791(true);
			Static405.aClass32_82.method791(true);
			Static56.aClass32_26.method791(true);
			Static38.aClass32_13.method791(true);
			Static295.aClass32_67.method791(true);
			Static13.aClass32_4.anInt1093 = 2;
			Static121.aBoolean227 = true;
			Static5.aClass32_1.anInt1093 = 2;
			Static172.aClass32_45.anInt1093 = 2;
			Static333.aClass32_72.anInt1093 = 2;
			Static50.aClass32_20.anInt1093 = 2;
			Static14.aClass32_5.anInt1093 = 2;
			Static66.aClass32_29.anInt1093 = 2;
			Static387.method5031(Static374.aClass20_Sub1_1.anInt2353, -1, -1, false);
			Static75.aString10 = Static277.aClass189_163.method4262(Static53.anInt1454);
			Static167.anInt3388 = 200;
			Static260.anInt6188 = 95;
		} else if (Static167.anInt3388 == 200) {
			Static435.method5708(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1097() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1113() {
		Static115.anInt2498++;
		Static51.method1056(-1, null, -1);
		Static261.method660(-1, null, -1);
		Static176.method2812();
		Static301.anInt2459++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class7_Sub2_Sub3_Sub1 local33 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass47_1.aByte28;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method3499();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt4404 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(96) int local96 = local33.anIntArray287[0] + local74;
							@Pc(103) int local103 = local82 + local33.anIntArray288[0];
							if (local96 < 0) {
								local96 = 0;
							} else if (Static40.anInt1089 - local50 - 1 < local96) {
								local96 = Static40.anInt1089 - local50 - 1;
							}
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > Static44.anInt7276 - local50 - 1) {
								local103 = Static44.anInt7276 - local50 - 1;
							}
							@Pc(184) int local184 = Static140.method2190(-1, local33.anIntArray287[0], true, local96, local50, Static382.aClass29Array3[local33.aByte77], local50, local33.anIntArray288[0], local103, local50, 0, Static92.anIntArray129, Static102.anIntArray136, 0);
							if (local184 > 0) {
								if (local184 > 9) {
									local184 = 9;
								}
								for (@Pc(195) int local195 = 0; local195 < local184; local195++) {
									local33.anIntArray287[local195] = Static102.anIntArray136[local184 - local195 - 1];
									local33.anIntArray288[local195] = Static92.anIntArray129[local184 - local195 - 1];
									local33.aByteArray52[local195] = 1;
								}
								local33.anInt4404 = local184;
							}
						}
					}
					Static401.method5178(local33, true);
					local74 = Static325.method4384(local33);
					Static277.method3923(Static112.anInt2457, local33, local74, Static159.anInt3197);
					Static109.method1852(local33);
				}
			}
		}
		if (Static254.anInt4793 == 0 && Static116.anInt5389 == 0) {
			if (Static161.anInt3316 == 2) {
				Static346.method4585();
			} else {
				Static124.method5962();
			}
			if (Static276.anInt5105 >> 7 < 14 || Static276.anInt5105 >> 7 >= Static40.anInt1089 - 14 || Static265.anInt5008 >> 7 < 14 || Static265.anInt5008 >> 7 >= Static44.anInt7276 - 14) {
				Static21.method464();
			}
		}
		while (true) {
			@Pc(321) Class3_Sub31 local321;
			@Pc(326) Class156 local326;
			@Pc(337) Class156 local337;
			do {
				local321 = (Class3_Sub31) Static196.aClass243_22.method5204();
				if (local321 == null) {
					while (true) {
						do {
							local321 = (Class3_Sub31) Static165.aClass243_20.method5204();
							if (local321 == null) {
								while (true) {
									do {
										local321 = (Class3_Sub31) Static221.aClass243_26.method5204();
										if (local321 == null) {
											if (Static238.aClass156_9 != null) {
												Static251.method3749();
											}
											if (Static253.anInt4787 % 1500 == 0) {
												Static377.method4937();
											}
											Static360.method4757();
											if (Static321.aBoolean480 && Static5.aLong3 < Static118.method1934() - 60000L) {
												Static40.method775();
												return;
											}
											return;
										}
										local326 = local321.aClass156_11;
										if (local326.anInt4868 < 0) {
											break;
										}
										local337 = Static435.method5705(local326.anInt4839);
									} while (local337 == null || local337.aClass156Array2 == null || local326.anInt4868 >= local337.aClass156Array2.length || local337.aClass156Array2[local326.anInt4868] != local326);
									Static285.method4059(local321);
								}
							}
							local326 = local321.aClass156_11;
							if (local326.anInt4868 < 0) {
								break;
							}
							local337 = Static435.method5705(local326.anInt4839);
						} while (local337 == null || local337.aClass156Array2 == null || local326.anInt4868 >= local337.aClass156Array2.length || local326 != local337.aClass156Array2[local326.anInt4868]);
						Static285.method4059(local321);
					}
				}
				local326 = local321.aClass156_11;
				if (local326.anInt4868 < 0) {
					break;
				}
				local337 = Static435.method5705(local326.anInt4839);
			} while (local337 == null || local337.aClass156Array2 == null || local337.aClass156Array2.length <= local326.anInt4868 || local337.aClass156Array2[local326.anInt4868] != local326);
			Static285.method4059(local321);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method1115() {
		@Pc(12) boolean local12 = Static265.aClass257_2.method5393();
		if (!local12) {
			this.method1116();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1116() {
		if (Static265.aClass257_2.anInt6910 > Static182.anInt3624) {
			Static184.anInt3684 = (Static265.aClass257_2.anInt6910 * 50 - 50) * 5;
			if (Static417.anInt6845 == Static306.anInt5453) {
				Static417.anInt6845 = Static219.anInt4144;
			} else {
				Static417.anInt6845 = Static306.anInt5453;
			}
			if (Static184.anInt3684 > 3000) {
				Static184.anInt3684 = 3000;
			}
			if (Static265.aClass257_2.anInt6910 >= 2 && Static265.aClass257_2.anInt6911 == 6) {
				this.method1094("js5connect_outofdate");
				Static120.anInt2584 = 1000;
				return;
			}
			if (Static265.aClass257_2.anInt6910 >= 4 && Static265.aClass257_2.anInt6911 == -1) {
				this.method1094("js5crc");
				Static120.anInt2584 = 1000;
				return;
			}
			if (Static265.aClass257_2.anInt6910 >= 4 && (Static120.anInt2584 == 0 || Static120.anInt2584 == 5)) {
				if (Static265.aClass257_2.anInt6911 == 7 || Static265.aClass257_2.anInt6911 == 9) {
					this.method1094("js5connect_full");
				} else if (Static265.aClass257_2.anInt6911 <= 0) {
					this.method1094("js5io");
				} else {
					this.method1094("js5connect");
				}
				Static120.anInt2584 = 1000;
				return;
			}
		}
		Static182.anInt3624 = Static265.aClass257_2.anInt6910;
		if (Static184.anInt3684 > 0) {
			Static184.anInt3684--;
			return;
		}
		try {
			if (Static196.anInt3898 == 0) {
				Static7.aClass43_1 = Static66.aClass143_2.method3390(Static417.anInt6845, Static452.aString67);
				Static196.anInt3898++;
			}
			if (Static196.anInt3898 == 1) {
				if (Static7.aClass43_1.anInt1521 == 2) {
					this.method1121(1000);
					return;
				}
				if (Static7.aClass43_1.anInt1521 == 1) {
					Static196.anInt3898++;
				}
			}
			if (Static196.anInt3898 == 2) {
				Static26.aClass251_1 = new Class251((Socket) Static7.aClass43_1.anObject3, Static66.aClass143_2);
				@Pc(178) Class3_Sub7 local178 = new Class3_Sub7(5);
				local178.method2628(Static184.aClass187_2.anInt5402);
				local178.method2636(590);
				Static26.aClass251_1.method5344(local178.aByteArray46, 5);
				Static196.anInt3898++;
				Static84.aLong72 = Static118.method1934();
			}
			if (Static196.anInt3898 == 3) {
				if (Static120.anInt2584 == 0 || Static120.anInt2584 == 5 || Static26.aClass251_1.method5348() > 0) {
					@Pc(225) int local225 = Static26.aClass251_1.method5349();
					if (local225 != 0) {
						this.method1121(local225);
						return;
					}
					Static196.anInt3898++;
				} else if (Static118.method1934() - Static84.aLong72 > 30000L) {
					this.method1121(1001);
					return;
				}
			}
			if (Static196.anInt3898 == 4) {
				@Pc(267) boolean local267 = Static120.anInt2584 == 5 || Static120.anInt2584 == 10 || Static120.anInt2584 == 28;
				Static265.aClass257_2.method5395(!local267, Static26.aClass251_1);
				Static26.aClass251_1 = null;
				Static7.aClass43_1 = null;
				Static196.anInt3898 = 0;
			}
		} catch (@Pc(284) IOException local284) {
			this.method1121(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
	private void method1117(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub7 local10 = new Class3_Sub7(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method2582();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(24) int[] local24 = Static369.anIntArray401 = new int[6];
					local24[0] = local10.method2588();
					local24[1] = local10.method2588();
					local24[2] = local10.method2588();
					local24[3] = local10.method2588();
					local24[4] = local10.method2588();
					local24[5] = local10.method2588();
				} else {
					@Pc(69) int local69;
					@Pc(74) int local74;
					if (local14 == 4) {
						local69 = local10.method2582();
						Static416.anIntArray497 = new int[local69];
						for (local74 = 0; local74 < local69; local74++) {
							Static416.anIntArray497[local74] = local10.method2588();
							if (Static416.anIntArray497[local74] == 65535) {
								Static416.anIntArray497[local74] = -1;
							}
						}
					} else if (local14 == 5) {
						local69 = local10.method2582();
						Static217.anIntArray274 = new int[local69];
						for (local74 = 0; local74 < local69; local74++) {
							Static217.anIntArray274[local74] = local10.method2588();
							if (Static217.anIntArray274[local74] == 65535) {
								Static217.anIntArray274[local74] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1121(@OriginalArg(0) int arg0) {
		Static265.aClass257_2.anInt6910++;
		Static26.aClass251_1 = null;
		Static196.anInt3898 = 0;
		Static7.aClass43_1 = null;
		Static265.aClass257_2.anInt6911 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1091() {
		if (Static120.anInt2584 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static452.method5955() / 1000000L - Static75.aLong66;
		Static75.aLong66 = Static452.method5955() / 1000000L;
		@Pc(25) boolean local25 = Static426.method5439();
		if (local25 && Static24.aBoolean64 && Static47.aClass16_2 != null) {
			Static47.aClass16_2.method4122();
		}
		if (Static120.anInt2584 == 30 || Static120.anInt2584 == 10) {
			if (Static18.aLong106 != 0L && Static18.aLong106 < Static118.method1934()) {
				Static387.method5031(Static391.method5269(), Static374.aClass20_Sub1_1.anInt2359, Static374.aClass20_Sub1_1.anInt2344, false);
			} else if (!Static121.aClass172_3.method5475() && Static205.aBoolean346) {
				Static1.method6();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static438.aFrame2 == null) {
			@Pc(81) Container local81;
			if (Static10.aFrame1 == null) {
				local81 = Static66.aClass143_2.anApplet1;
			} else {
				local81 = Static10.aFrame1;
			}
			local90 = local81.getSize().width;
			local94 = local81.getSize().height;
			if (Static10.aFrame1 == local81) {
				@Pc(100) Insets local100 = Static10.aFrame1.getInsets();
				local90 -= local100.left + local100.right;
				local94 -= local100.top + local100.bottom;
			}
			if (local90 != Static301.anInt2468 || Static348.anInt5912 != local94) {
				if (Static121.aClass172_3 == null || Static121.aClass172_3.method5474()) {
					Static428.method5557();
				} else {
					Static348.anInt5912 = local94;
					Static301.anInt2468 = local90;
				}
				Static18.aLong106 = Static118.method1934() + 500L;
			}
		}
		if (Static438.aFrame2 != null && !Static168.aBoolean289 && (Static120.anInt2584 == 30 || Static120.anInt2584 == 10)) {
			Static387.method5031(Static374.aClass20_Sub1_1.anInt2353, -1, -1, false);
		}
		@Pc(174) boolean local174 = false;
		if (Static180.aBoolean307) {
			local174 = true;
			Static180.aBoolean307 = false;
		}
		if (local174) {
			Static134.method2068();
		}
		if (Static121.aClass172_3 != null && Static121.aClass172_3.method5475() || Static391.method5269() != 1) {
			Static36.method725();
		}
		if (Static120.anInt2584 == 0) {
			Static382.method1460(Static442.aColorArray3[Static114.anInt2480], Static428.aColorArray2[Static114.anInt2480], local174, Static75.aString10, Static260.anInt6188, Static413.aColorArray1[Static114.anInt2480]);
		} else if (Static120.anInt2584 == 5) {
			Static126.method2008(Static413.aColorArray1[Static114.anInt2480].getRGB(), Static442.aColorArray3[Static114.anInt2480].getRGB(), Static121.aClass172_3, Static428.aColorArray2[Static114.anInt2480].getRGB(), Static121.aClass172_3.method5475() | local174, Static321.aClass59_4);
		} else if (Static120.anInt2584 == 10) {
			Static185.method2974();
		} else if (Static120.anInt2584 == 25 || Static120.anInt2584 == 28) {
			if (Static268.anInt5044 == 1) {
				if (Static162.anInt3324 > Static44.anInt7278) {
					Static44.anInt7278 = Static162.anInt3324;
				}
				local90 = (Static44.anInt7278 - Static162.anInt3324) * 50 / Static44.anInt7278;
				Static53.method1120(true, Static21.aClass189_14.method4262(Static53.anInt1454) + "<br>(" + local90 + "%)", Static299.aClass59_3);
			} else if (Static268.anInt5044 == 2) {
				if (Static407.anInt6700 < Static180.anInt3570) {
					Static407.anInt6700 = Static180.anInt3570;
				}
				local90 = (Static407.anInt6700 - Static180.anInt3570) * 50 / Static407.anInt6700 + 50;
				Static53.method1120(true, Static21.aClass189_14.method4262(Static53.anInt1454) + "<br>(" + local90 + "%)", Static299.aClass59_3);
			} else {
				Static53.method1120(true, Static21.aClass189_14.method4262(Static53.anInt1454), Static299.aClass59_3);
			}
		} else if (Static120.anInt2584 == 30) {
			Static444.method5855(local17);
		} else if (Static120.anInt2584 == 40) {
			Static53.method1120(true, Static170.aClass189_107.method4262(Static53.anInt1454) + "<br>" + Static193.aClass189_120.method4262(Static53.anInt1454), Static299.aClass59_3);
		}
		if (Static350.anInt3652 == 3) {
			for (local90 = 0; local90 < Static246.anInt4693; local90++) {
				@Pc(393) Rectangle local393 = Class7_Sub5_Sub1.aRectangleArray1[local90];
				if (Static128.aBooleanArray12[local90]) {
					Static121.aClass172_3.method5507(-1996553985, local393.height, local393.x, local393.y, local393.width);
				} else if (Static78.aBooleanArray11[local90]) {
					Static121.aClass172_3.method5507(-1996554240, local393.height, local393.x, local393.y, local393.width);
				}
			}
		}
		if (Static392.method5075()) {
			Static26.method594(Static121.aClass172_3);
		}
		if ((Static120.anInt2584 == 30 || Static120.anInt2584 == 10) && Static350.anInt3652 == 0 && Static391.method5269() == 1 && !local174 && Static227.aString29.equals("1.1")) {
			local90 = 0;
			for (local94 = 0; local94 < Static246.anInt4693; local94++) {
				if (Static78.aBooleanArray11[local94]) {
					Static78.aBooleanArray11[local94] = false;
					Static415.aRectangleArray2[local90++] = Class7_Sub5_Sub1.aRectangleArray1[local94];
				}
			}
			Static121.aClass172_3.method5473(Static415.aRectangleArray2, local90);
		} else if (Static120.anInt2584 != 0) {
			Static121.aClass172_3.method5515();
			for (local90 = 0; local90 < Static246.anInt4693; local90++) {
				Static78.aBooleanArray11[local90] = false;
			}
		}
		if (Static374.aClass20_Sub1_1.anInt2357 == 0) {
			Static360.method4758(15L);
		} else if (Static374.aClass20_Sub1_1.anInt2357 == 1) {
			Static360.method4758(10L);
		} else if (Static374.aClass20_Sub1_1.anInt2357 == 2) {
			Static360.method4758(5L);
		} else if (Static374.aClass20_Sub1_1.anInt2357 == 3) {
			Static360.method4758(2L);
		}
		if (Static121.aBoolean227) {
			Static139.method5913();
		}
		if (Static374.aClass20_Sub1_1.aBoolean189 && Static120.anInt2584 == 10 && Static226.anInt4225 != -1) {
			Static374.aClass20_Sub1_1.aBoolean189 = false;
			Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1090() {
		if (Static321.aBoolean480) {
			Static40.method775();
		}
		if (Static121.aClass172_3 != null) {
			Static121.aClass172_3.method5538();
		}
		if (Static438.aFrame2 != null) {
			Static225.method3375(Static66.aClass143_2, Static438.aFrame2);
			Static438.aFrame2 = null;
		}
		if (Static88.aClass251_2 != null) {
			Static88.aClass251_2.method5345();
			Static88.aClass251_2 = null;
		}
		if (Static130.aClass234_2 != null) {
			Static130.aClass234_2.method5931(Static392.aCanvas6);
		}
		Static130.aClass234_2 = null;
		Static418.method304();
		Static265.aClass257_2.method5401();
		Static212.aClass46_2.method1232();
		if (Static369.aClass151_1 != null) {
			Static369.aClass151_1.method3710();
			Static369.aClass151_1 = null;
		}
	}
}
