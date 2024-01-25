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

	static {
		new Class57("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static219.method3672("argument count");
			}
			Static247.anInt4444 = Integer.parseInt(arg0[0]);
			Static291.aClass171_5 = Static310.aClass171_6;
			if (arg0[1].equals("live")) {
				Static270.aClass213_17 = Static351.aClass213_11;
			} else if (arg0[1].equals("rc")) {
				Static270.aClass213_17 = Static341.aClass213_16;
			} else if (arg0[1].equals("wip")) {
				Static270.aClass213_17 = Static136.aClass213_10;
			} else {
				Static219.method3672("modewhat");
			}
			Static66.anInt1307 = Static61.method1095(arg0[2]);
			if (Static66.anInt1307 == -1) {
				if (arg0[2].equals("english")) {
					Static66.anInt1307 = 0;
				} else if (arg0[2].equals("german")) {
					Static66.anInt1307 = 1;
				} else {
					Static219.method3672("language");
				}
			}
			Static153.aBoolean211 = false;
			Static199.aBoolean259 = false;
			if (arg0[3].equals("game0")) {
				Static121.aClass63_2 = Static17.aClass63_1;
			} else if (arg0[3].equals("game1")) {
				Static121.aClass63_2 = Static340.aClass63_3;
			} else {
				Static219.method3672("game");
			}
			Static68.anInt1341 = 0;
			Static368.aString57 = "";
			Static207.aBoolean172 = true;
			Static220.aBoolean317 = true;
			Static155.anInt2789 = 0;
			Static183.anInt3244 = Static121.aClass63_2.anInt1618;
			@Pc(126) client local126 = new client();
			Static144.aClient1 = local126;
			local126.method890(Static270.aClass213_17.method4814() + 32, Static121.aClass63_2.aString23);
			Static34.aFrame1.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static355.method5328(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method907() {
		if (Static238.anInt4220 < Static328.aClass11_3.anInt177) {
			if (Static269.anInt4741 == Static303.anInt5267) {
				Static269.anInt4741 = Static174.anInt3041;
			} else {
				Static269.anInt4741 = Static303.anInt5267;
			}
			Static105.anInt2075 = (Static328.aClass11_3.anInt177 * 50 - 50) * 5;
			if (Static105.anInt2075 > 3000) {
				Static105.anInt2075 = 3000;
			}
			if (Static328.aClass11_3.anInt177 >= 2 && Static328.aClass11_3.anInt176 == 6) {
				this.method886("js5connect_outofdate");
				Static348.anInt4439 = 1000;
				return;
			}
			if (Static328.aClass11_3.anInt177 >= 4 && Static328.aClass11_3.anInt176 == -1) {
				this.method886("js5crc");
				Static348.anInt4439 = 1000;
				return;
			}
			if (Static328.aClass11_3.anInt177 >= 4 && (Static348.anInt4439 == 0 || Static348.anInt4439 == 5)) {
				if (Static328.aClass11_3.anInt176 == 7 || Static328.aClass11_3.anInt176 == 9) {
					this.method886("js5connect_full");
				} else if (Static328.aClass11_3.anInt176 <= 0) {
					this.method886("js5io");
				} else {
					this.method886("js5connect");
				}
				Static348.anInt4439 = 1000;
				return;
			}
		}
		Static238.anInt4220 = Static328.aClass11_3.anInt177;
		if (Static105.anInt2075 > 0) {
			Static105.anInt2075--;
			return;
		}
		try {
			if (Static123.anInt2360 == 0) {
				Static194.aClass133_5 = Static61.aClass156_1.method3642(Static200.aString35, Static269.anInt4741);
				Static123.anInt2360++;
			}
			if (Static123.anInt2360 == 1) {
				if (Static194.aClass133_5.anInt3257 == 2) {
					this.method914(1000);
					return;
				}
				if (Static194.aClass133_5.anInt3257 == 1) {
					Static123.anInt2360++;
				}
			}
			if (Static123.anInt2360 == 2) {
				Static6.aClass145_1 = new Class145((Socket) Static194.aClass133_5.anObject3, Static61.aClass156_1);
				@Pc(192) Class3_Sub5 local192 = new Class3_Sub5(5);
				local192.method2791(Static56.aClass76_2.anInt1930);
				local192.method2782(577);
				Static6.aClass145_1.method3143(5, local192.aByteArray42);
				Static123.anInt2360++;
				Static314.aLong198 = Static288.method4512();
			}
			if (Static123.anInt2360 == 3) {
				if (Static348.anInt4439 == 0 || Static348.anInt4439 == 5 || Static6.aClass145_1.method3139() > 0) {
					@Pc(238) int local238 = Static6.aClass145_1.method3137();
					if (local238 != 0) {
						this.method914(local238);
						return;
					}
					Static123.anInt2360++;
				} else if (Static288.method4512() - Static314.aLong198 > 30000L) {
					this.method914(1001);
					return;
				}
			}
			if (Static123.anInt2360 == 4) {
				@Pc(285) boolean local285 = Static348.anInt4439 == 5 || Static348.anInt4439 == 10 || Static348.anInt4439 == 28;
				Static328.aClass11_3.method159(Static6.aClass145_1, !local285);
				Static123.anInt2360 = 0;
				Static194.aClass133_5 = null;
				Static6.aClass145_1 = null;
			}
		} catch (@Pc(302) IOException local302) {
			this.method914(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method901() {
		if (Static348.anInt4439 == 1000) {
			return;
		}
		Static76.anInt1617++;
		if (Static76.anInt1617 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static355.anInt5980 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static165.aRandom1.setSeed((long) Static355.anInt5980);
		}
		if (Static76.anInt1617 % 50 == 0) {
			Static225.anInt3986 = Static133.anInt2514;
			Static216.anInt6070 = Static84.anInt1725;
			Static133.anInt2514 = 0;
			Static84.anInt1725 = 0;
		}
		this.method917();
		if (Static267.aClass165_2 != null) {
			Static267.aClass165_2.method3847();
		}
		Static33.method523();
		Static381.method5665();
		Static322.aClass89_25.method1849();
		Static200.aClass10_1.method5241();
		if (Static289.aClass52_1 != null) {
			@Pc(91) int local91 = Static289.aClass52_1.method1038();
			Static115.anInt2219 = local91;
		}
		if (Static347.aClass155_9 != null) {
			Static347.aClass155_9.method4935((int) Static288.method4512());
		}
		Static387.method5693();
		Static153.anInt2778 = 0;
		for (@Pc(108) Class70 local108 = Static322.aClass89_25.method1842(); local108 != null && Static153.anInt2778 < 128; local108 = Static322.aClass89_25.method1842()) {
			if (local108.method1436() != 1) {
				@Pc(121) char local121 = local108.method1431();
				if (!Static186.method2924() || local121 != '`' && local121 != '§') {
					Static251.aClass70Array1[Static153.anInt2778] = local108;
					Static153.anInt2778++;
				} else if (Static221.method3683()) {
					Static152.method2386();
				} else {
					Static385.method5690();
				}
			}
		}
		Static46.aClass3_Sub33_1 = null;
		for (@Pc(168) Class3_Sub33 local168 = Static200.aClass10_1.method5236(); local168 != null; local168 = Static200.aClass10_1.method5236()) {
			@Pc(174) int local174 = local168.method5158();
			if (local174 == -1) {
				Static392.aClass138_47.method3053(local168);
			} else if (Static101.method4667(local174)) {
				Static46.aClass3_Sub33_1 = local168;
			}
		}
		if (Static221.method3683()) {
			Static5.method88();
		}
		if (Static348.anInt4439 == 0) {
			this.method913();
			Static194.method3071();
		} else if (Static348.anInt4439 == 5) {
			this.method913();
			Static194.method3071();
		} else if (Static348.anInt4439 == 25 || Static348.anInt4439 == 28) {
			Static328.method5017();
		}
		if (Static348.anInt4439 == 10) {
			this.method919();
			Static114.method1857();
			Static61.method1097();
			Static156.method2406();
		} else if (Static348.anInt4439 == 30) {
			Static212.method3301();
		} else if (Static348.anInt4439 == 40) {
			Static156.method2406();
			if (Static158.anInt2849 != -3 && Static158.anInt2849 != 2 && Static158.anInt2849 != 15) {
				Static53.method988();
			}
		}
		Static163.method2305(Static347.aClass155_9);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method892() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static389.method5695();
		Static250.aClass40_4 = new Class40(Static61.aClass156_1);
		Static328.aClass11_3 = new Class11();
		if (Static238.aClass171_4 != Static291.aClass171_5) {
			Static140.aByteArrayArray7 = new byte[50][];
		}
		Static164.aClass154_Sub1_1 = new Class154_Sub1(Static61.aClass156_1);
		if (Static238.aClass171_4 == Static291.aClass171_5) {
			Static165.aString29 = this.getCodeBase().getHost();
			Static1.anInt11 = 443;
			Static222.anInt3950 = 43594;
		} else if (Static373.method5560(Static291.aClass171_5)) {
			Static165.aString29 = this.getCodeBase().getHost();
			Static1.anInt11 = Static247.anInt4444 + 50000;
			Static222.anInt3950 = Static247.anInt4444 + 40000;
		} else if (Static310.aClass171_6 == Static291.aClass171_5) {
			Static165.aString29 = "127.0.0.1";
			Static222.anInt3950 = Static247.anInt4444 + 40000;
			Static1.anInt11 = Static247.anInt4444 + 50000;
		}
		Static174.anInt3041 = Static1.anInt11;
		Static253.anInt4563 = Static222.anInt3950;
		Static303.anInt5267 = Static222.anInt3950;
		Static200.aString35 = Static165.aString29;
		Static66.aShortArray29 = Static115.aShortArray43 = Static276.aShortArray78 = Static197.aShortArray62 = new short[256];
		if (Static340.aClass63_3 == Static121.aClass63_2) {
			Static282.aBoolean391 = true;
			Static38.aShortArrayArray2 = Static189.aShortArrayArray4;
			Static162.anInt2896 = 0;
			Static103.anInt2049 = 16777215;
			Static191.aShortArray61 = Static202.aShortArray63;
			Static183.aShortArrayArray3 = Static315.aShortArrayArray7;
			Static100.aShortArray40 = Static271.aShortArray117;
		} else {
			Static38.aShortArrayArray2 = Static310.aShortArrayArray6;
			Static100.aShortArray40 = Static223.aShortArray69;
			Static191.aShortArray61 = Static351.aShortArray60;
			Static183.aShortArrayArray3 = Static282.aShortArrayArray5;
		}
		if (Static218.anInt3887 == 3) {
			Static41.anInt765 = Static247.anInt4444;
		}
		Static269.anInt4741 = Static253.anInt4563;
		Static322.aClass89_25 = Static261.method4205(Static173.aCanvas2);
		Static200.aClass10_1 = Static8.method5701(Static173.aCanvas2);
		Static289.aClass52_1 = Static55.method1004();
		if (Static289.aClass52_1 != null) {
			Static289.aClass52_1.method1043(Static173.aCanvas2);
		}
		Static236.anInt4206 = Static218.anInt3887;
		try {
			if (Static61.aClass156_1.aClass106_1 != null) {
				Static23.aClass246_2 = new Class246(Static61.aClass156_1.aClass106_1, 5200, 0);
				for (@Pc(168) int local168 = 0; local168 < 29; local168++) {
					Static207.aClass246Array2[local168] = new Class246(Static61.aClass156_1.aClass106Array1[local168], 6000, 0);
				}
				Static243.aClass246_3 = new Class246(Static61.aClass156_1.aClass106_3, 6000, 0);
				Static251.aClass204_4 = new Class204(255, Static23.aClass246_2, Static243.aClass246_3, 500000);
				Static16.aClass246_1 = new Class246(Static61.aClass156_1.aClass106_2, 24, 0);
				Static61.aClass156_1.aClass106_3 = null;
				Static61.aClass156_1.aClass106_1 = null;
				Static61.aClass156_1.aClass106_2 = null;
				Static61.aClass156_1.aClass106Array1 = null;
			}
		} catch (@Pc(224) IOException local224) {
			Static23.aClass246_2 = null;
			Static251.aClass204_4 = null;
			Static243.aClass246_3 = null;
			Static16.aClass246_1 = null;
		}
		if (Static291.aClass171_5 != Static238.aClass171_4) {
			Static383.aBoolean500 = true;
		}
		Static181.aString32 = (Static121.aClass63_2 == Static17.aClass63_1 ? Static170.aClass57_53 : Static380.aClass57_101).method1122(Static66.anInt1307);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method904() {
		if (Static348.anInt4439 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static135.method2154() / 1000000L - Static192.aLong134;
		Static192.aLong134 = Static135.method2154() / 1000000L;
		@Pc(26) boolean local26 = Static391.method1848();
		if (local26 && Static298.aBoolean402 && Static25.aClass119_1 != null) {
			Static25.aClass119_1.method4986();
		}
		if (Static348.anInt4439 == 30 || Static348.anInt4439 == 10) {
			if (Static171.aLong117 != 0L && Static171.aLong117 < Static288.method4512()) {
				Static175.method2696(Static200.method3135(), Static164.aClass154_Sub1_1.anInt6062, false, Static164.aClass154_Sub1_1.anInt6067);
			} else if (Static347.aClass155_9.method4861() && Static175.aBoolean237) {
				Static204.method4472();
			}
		}
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (Static225.aFrame2 == null) {
			@Pc(84) Container local84;
			if (Static34.aFrame1 == null) {
				local84 = Static61.aClass156_1.anApplet1;
			} else {
				local84 = Static34.aFrame1;
			}
			local93 = local84.getSize().width;
			local97 = local84.getSize().height;
			if (local84 == Static34.aFrame1) {
				@Pc(103) Insets local103 = Static34.aFrame1.getInsets();
				local97 -= local103.bottom + local103.top;
				local93 -= local103.left + local103.right;
			}
			if (local93 != Static276.anInt4800 || local97 != Static177.anInt3088) {
				if (Static347.aClass155_9 == null || Static347.aClass155_9.method4889()) {
					Static389.method5695();
				} else {
					Static276.anInt4800 = local93;
					Static177.anInt3088 = local97;
				}
				Static171.aLong117 = Static288.method4512() + 500L;
			}
		}
		if (Static225.aFrame2 != null && !Static245.aBoolean344 && (Static348.anInt4439 == 30 || Static348.anInt4439 == 10)) {
			Static175.method2696(Static164.aClass154_Sub1_1.anInt6068, -1, false, -1);
		}
		@Pc(172) boolean local172 = false;
		if (Static122.aBoolean179) {
			local172 = true;
			Static122.aBoolean179 = false;
		}
		if (local172) {
			Static122.method1947();
		}
		if (Static347.aClass155_9 != null && Static347.aClass155_9.method4875() || Static200.method3135() != 1) {
			Static71.method1197();
		}
		if (Static348.anInt4439 == 0) {
			Static384.method5677(Static374.aColorArray3[Static183.anInt3244], local172, Static354.aColorArray2[Static183.anInt3244], Static187.aString34, Static212.anInt3744, Static81.aColorArray1[Static183.anInt3244]);
		} else if (Static348.anInt4439 == 5) {
			Static303.method4699(Static81.aColorArray1[Static183.anInt3244].getRGB(), local172 | Static347.aClass155_9.method4875(), Static374.aColorArray3[Static183.anInt3244].getRGB(), Static354.aColorArray2[Static183.anInt3244].getRGB(), Static347.aClass155_9, Static95.aClass150_6);
		} else if (Static348.anInt4439 == 10) {
			Static315.method4827();
		} else if (Static348.anInt4439 == 25 || Static348.anInt4439 == 28) {
			if (Static241.anInt4239 == 1) {
				if (Static176.anInt3532 < Static135.anInt2589) {
					Static176.anInt3532 = Static135.anInt2589;
				}
				local93 = (Static176.anInt3532 - Static135.anInt2589) * 50 / Static176.anInt3532;
				Static289.method4519(Static140.aClass150_3, Static28.aClass57_13.method1122(Static66.anInt1307) + "<br>(" + local93 + "%)", true);
			} else if (Static241.anInt4239 == 2) {
				if (Static55.anInt1126 > Static83.anInt1723) {
					Static83.anInt1723 = Static55.anInt1126;
				}
				local93 = (Static83.anInt1723 - Static55.anInt1126) * 50 / Static83.anInt1723 + 50;
				Static289.method4519(Static140.aClass150_3, Static28.aClass57_13.method1122(Static66.anInt1307) + "<br>(" + local93 + "%)", true);
			} else {
				Static289.method4519(Static140.aClass150_3, Static28.aClass57_13.method1122(Static66.anInt1307), true);
			}
		} else if (Static348.anInt4439 == 30) {
			Static333.method5076(local18);
		} else if (Static348.anInt4439 == 40) {
			Static289.method4519(Static140.aClass150_3, Static121.aClass57_38.method1122(Static66.anInt1307) + "<br>" + Static138.aClass57_47.method1122(Static66.anInt1307), true);
		}
		if (Static247.anInt4443 == 3) {
			for (local93 = 0; local93 < Static298.anInt5150; local93++) {
				@Pc(407) Rectangle local407 = Class3_Sub1_Sub15.aRectangleArray4[local93];
				if (Static245.aBooleanArray106[local93]) {
					Static347.aClass155_9.method4954(local407.height, local407.y, local407.width, local407.x, -1996553985);
				} else if (Static160.aBooleanArray129[local93]) {
					Static347.aClass155_9.method4954(local407.height, local407.y, local407.width, local407.x, -1996554240);
				}
			}
		}
		if (Static221.method3683()) {
			Static17.method209(Static347.aClass155_9);
		}
		if ((Static348.anInt4439 == 30 || Static348.anInt4439 == 10) && Static247.anInt4443 == 0 && Static200.method3135() == 1 && !local172 && Static218.aString42.equals("1.1")) {
			local93 = 0;
			for (local97 = 0; local97 < Static298.anInt5150; local97++) {
				if (Static160.aBooleanArray129[local97]) {
					Static160.aBooleanArray129[local97] = false;
					Static239.aRectangleArray10[local93++] = Class3_Sub1_Sub15.aRectangleArray4[local97];
				}
			}
			Static347.aClass155_9.method4854(Static239.aRectangleArray10, local93);
		} else if (Static348.anInt4439 != 0) {
			Static347.aClass155_9.method4894();
			for (local93 = 0; local93 < Static298.anInt5150; local93++) {
				Static160.aBooleanArray129[local93] = false;
			}
		}
		if (Static164.aClass154_Sub1_1.anInt6061 == 0) {
			Static37.method613(15L);
		} else if (Static164.aClass154_Sub1_1.anInt6061 == 1) {
			Static37.method613(10L);
		} else if (Static164.aClass154_Sub1_1.anInt6061 == 2) {
			Static37.method613(5L);
		} else if (Static164.aClass154_Sub1_1.anInt6061 == 3) {
			Static37.method613(2L);
		}
		if (Static322.aBoolean499) {
			Static120.method1910();
		}
		if (Static164.aClass154_Sub1_1.aBoolean465 && Static348.anInt4439 == 10 && Static68.anInt1346 != -1) {
			Static164.aClass154_Sub1_1.aBoolean465 = false;
			Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method913() {
		@Pc(10) int local10;
		if (!Static164.aClass154_Sub1_1.aBoolean465) {
			for (local10 = 0; local10 < Static153.anInt2778; local10++) {
				if (Static251.aClass70Array1[local10].method1431() == 's' || Static251.aClass70Array1[local10].method1431() == 'S') {
					Static164.aClass154_Sub1_1.aBoolean465 = true;
					break;
				}
			}
		}
		@Pc(54) int local54;
		if (Static262.anInt1205 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local54 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static288.method4512();
			if (Static127.aLong94 == 0L) {
				Static127.aLong94 = local59;
			}
			if (local54 > 16384 && local59 - Static127.aLong94 < 5000L) {
				if (local59 - Static175.aLong121 > 1000L) {
					System.gc();
					Static175.aLong121 = local59;
				}
				Static187.aString34 = Static357.aClass57_92.method1122(Static66.anInt1307);
				Static212.anInt3744 = 5;
			} else {
				Static187.aString34 = Static89.aClass57_93.method1122(Static66.anInt1307);
				Static212.anInt3744 = 5;
				Static262.anInt1205 = 10;
			}
		} else if (Static262.anInt1205 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static160.aClass67Array3[local10] = Static272.method4269(Static44.anInt787, Static12.anInt161);
			}
			Static187.aString34 = Static258.aClass57_71.method1122(Static66.anInt1307);
			Static212.anInt3744 = 10;
			Static262.anInt1205 = 20;
		} else if (Static262.anInt1205 == 20) {
			if (Static267.aClass165_2 == null) {
				Static267.aClass165_2 = new Class165(Static328.aClass11_3, Static250.aClass40_4);
			}
			if (Static267.aClass165_2.method3845()) {
				Static171.aClass20_43 = Static154.method5409(false, 0, true);
				Static338.aClass20_87 = Static154.method5409(false, 1, true);
				Static32.aClass20_14 = Static154.method5409(false, 2, true);
				Static4.aClass20_1 = Static154.method5409(false, 3, true);
				Static389.aClass20_98 = Static154.method5409(false, 4, true);
				Static179.aClass20_44 = Static154.method5409(true, 5, true);
				Static103.aClass20_26 = Static154.method5409(true, 6, false);
				Static299.aClass20_73 = Static154.method5409(false, 7, true);
				Static77.aClass20_19 = Static154.method5409(false, 8, true);
				Static116.aClass20_34 = Static154.method5409(false, 9, true);
				Static86.aClass20_21 = Static154.method5409(false, 10, true);
				Static352.aClass20_93 = Static154.method5409(false, 11, true);
				Static104.aClass20_28 = Static154.method5409(false, 12, true);
				Static368.aClass20_95 = Static154.method5409(false, 13, true);
				Static246.aClass20_57 = Static154.method5409(false, 14, false);
				Static278.aClass20_63 = Static154.method5409(false, 15, true);
				Static103.aClass20_25 = Static154.method5409(false, 16, true);
				Static289.aClass20_70 = Static154.method5409(false, 17, true);
				Static370.aClass20_96 = Static154.method5409(false, 18, true);
				Static109.aClass20_32 = Static154.method5409(false, 19, true);
				Static198.aClass20_50 = Static154.method5409(false, 20, true);
				Static340.aClass20_88 = Static154.method5409(false, 21, true);
				Static32.aClass20_15 = Static154.method5409(false, 22, true);
				Static270.aClass20_92 = Static154.method5409(true, 23, true);
				Static205.aClass20_8 = Static154.method5409(false, 24, true);
				Static229.aClass20_53 = Static154.method5409(false, 25, true);
				Static188.aClass20_47 = Static154.method5409(true, 26, true);
				Static122.aClass20_35 = Static154.method5409(false, 27, true);
				Static142.aClass20_40 = Static154.method5409(true, 28, true);
				Static187.aString34 = Static274.aClass57_75.method1122(Static66.anInt1307);
				Static212.anInt3744 = 15;
				Static262.anInt1205 = 30;
			} else {
				Static187.aString34 = Static156.aClass57_50.method1122(Static66.anInt1307);
				Static212.anInt3744 = 12;
			}
		} else if (Static262.anInt1205 == 30) {
			local10 = 0;
			for (local54 = 0; local54 < 29; local54++) {
				local10 += Static95.aClass135_Sub1Array4[local54].method2989() * Static48.anIntArray91[local54] / 100;
			}
			if (local10 == 100) {
				Static187.aString34 = Static23.aClass57_8.method1122(Static66.anInt1307);
				Static212.anInt3744 = 20;
				Static165.method2520(Static77.aClass20_19);
				Static378.method5605(Static77.aClass20_19);
				Static262.anInt1205 = 40;
			} else {
				if (local10 != 0) {
					Static187.aString34 = Static5.aClass57_1.method1122(Static66.anInt1307) + local10 + "%";
				}
				Static212.anInt3744 = 20;
			}
		} else if (Static262.anInt1205 == 40) {
			if (Static142.aClass20_40.method247()) {
				this.method916(Static142.aClass20_40.method224(1));
				Static187.aString34 = Static181.aClass57_57.method1122(Static66.anInt1307);
				Static262.anInt1205 = 50;
				Static212.anInt3744 = 25;
			} else {
				Static187.aString34 = Static302.aClass57_78.method1122(Static66.anInt1307) + Static142.aClass20_40.method225() + "%";
				Static212.anInt3744 = 25;
			}
		} else if (Static262.anInt1205 == 50) {
			Static233.method3862(Static164.aClass154_Sub1_1.aBoolean462);
			Static352.aClass3_Sub8_Sub4_3 = new Class3_Sub8_Sub4();
			Static352.aClass3_Sub8_Sub4_3.method2156();
			Static25.aClass119_1 = Static160.method4992(0, 22050, Static173.aCanvas2, Static61.aClass156_1);
			Static25.aClass119_1.method4991(Static352.aClass3_Sub8_Sub4_3);
			Static95.method5491(Static352.aClass3_Sub8_Sub4_3, Static246.aClass20_57, Static389.aClass20_98, Static278.aClass20_63);
			Static275.aClass119_2 = Static160.method4992(1, 2048, Static173.aCanvas2, Static61.aClass156_1);
			Static137.aClass3_Sub8_Sub2_2 = new Class3_Sub8_Sub2();
			Static275.aClass119_2.method4991(Static137.aClass3_Sub8_Sub2_2);
			Static257.aClass41_1 = new Class41(22050, Static374.anInt6244);
			Static66.anInt1301 = Static103.aClass20_26.method230("scape main");
			Static187.aString34 = Static345.aClass57_87.method1122(Static66.anInt1307);
			Static212.anInt3744 = 30;
			Static262.anInt1205 = 60;
		} else if (Static262.anInt1205 == 60) {
			local10 = Static131.method2063(Static368.aClass20_95, Static77.aClass20_19);
			local54 = Static175.method2692();
			if (local10 < local54) {
				Static187.aString34 = Static370.aClass57_96.method1122(Static66.anInt1307) + local10 * 100 / local54 + "%";
				Static212.anInt3744 = 35;
			} else {
				Static187.aString34 = Static377.aClass57_98.method1122(Static66.anInt1307);
				Static212.anInt3744 = 35;
				Static262.anInt1205 = 70;
			}
		} else if (Static262.anInt1205 == 70) {
			local10 = Static229.method3784(Static77.aClass20_19);
			local54 = Static117.method1872();
			if (local10 < local54) {
				Static187.aString34 = Static393.aClass57_104.method1122(Static66.anInt1307) + local10 * 100 / local54 + "%";
				Static212.anInt3744 = 40;
			} else {
				Static187.aString34 = Static90.aClass57_35.method1122(Static66.anInt1307);
				Static262.anInt1205 = 80;
				Static212.anInt3744 = 40;
			}
		} else if (Static262.anInt1205 == 80) {
			if (Static188.aClass20_47.method247()) {
				Static12.anInterface10_1 = new Class14(Static188.aClass20_47, Static116.aClass20_34, Static77.aClass20_19);
				Static187.aString34 = Static205.aClass57_11.method1122(Static66.anInt1307);
				Static212.anInt3744 = 45;
				Static262.anInt1205 = 90;
			} else {
				Static187.aString34 = Static164.aClass57_51.method1122(Static66.anInt1307) + Static188.aClass20_47.method225() + "%";
				Static212.anInt3744 = 45;
			}
		} else if (Static262.anInt1205 == 90) {
			Static187.aString34 = Static342.aClass57_86.method1122(Static66.anInt1307);
			Static212.anInt3744 = 50;
			Static262.anInt1205 = 95;
		} else if (Static262.anInt1205 == 95) {
			if (Static164.aClass154_Sub1_1.aBoolean465) {
				Static164.aClass154_Sub1_1.anInt6060 = 0;
				Static164.aClass154_Sub1_1.anInt6059 = 0;
				Static164.aClass154_Sub1_1.anInt6068 = 1;
				Static164.aClass154_Sub1_1.anInt6063 = 0;
				Static164.aClass154_Sub1_1.anInt6058 = 0;
			}
			Static164.aClass154_Sub1_1.aBoolean465 = true;
			Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
			Static290.method4521(false, Static164.aClass154_Sub1_1.anInt6060);
			Static187.aString34 = Static222.aClass57_64.method1122(Static66.anInt1307);
			Static212.anInt3744 = 55;
			Static262.anInt1205 = 100;
		} else if (Static262.anInt1205 == 100) {
			Static277.method4348(Static347.aClass155_9, Static77.aClass20_19, Static368.aClass20_95);
			Static187.aString34 = Static122.aClass57_39.method1122(Static66.anInt1307);
			Static212.anInt3744 = 60;
			Static310.method4763(5);
			Static262.anInt1205 = 110;
		} else if (Static262.anInt1205 == 110) {
			Static32.aClass20_14.method247();
			local10 = Static32.aClass20_14.method225();
			Static103.aClass20_25.method247();
			local10 += Static103.aClass20_25.method225();
			Static289.aClass20_70.method247();
			local10 += Static289.aClass20_70.method225();
			Static370.aClass20_96.method247();
			local10 += Static370.aClass20_96.method225();
			Static109.aClass20_32.method247();
			local10 += Static109.aClass20_32.method225();
			Static198.aClass20_50.method247();
			local10 += Static198.aClass20_50.method225();
			Static340.aClass20_88.method247();
			local10 += Static340.aClass20_88.method225();
			Static32.aClass20_15.method247();
			local10 += Static32.aClass20_15.method225();
			Static205.aClass20_8.method247();
			local10 += Static205.aClass20_8.method225();
			Static229.aClass20_53.method247();
			local10 += Static229.aClass20_53.method225();
			Static122.aClass20_35.method247();
			local10 += Static122.aClass20_35.method225();
			if (local10 < 1100) {
				Static187.aString34 = Static126.aClass57_43.method1122(Static66.anInt1307) + local10 / 11 + "%";
				Static212.anInt3744 = 65;
			} else {
				Static255.aClass187_2 = new Class187(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static79.aClass124_1 = new Class124(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static205.aClass224_2 = new Class224(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14, Static77.aClass20_19);
				Static194.aClass103_1 = new Class103(Static121.aClass63_2, Static66.anInt1307, Static289.aClass20_70);
				Static125.aClass134_3 = new Class134(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static147.aClass210_3 = new Class210(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static102.aClass223_1 = new Class223(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14, Static299.aClass20_73);
				Static12.aClass142_1 = new Class142(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static13.aClass97_3 = new Class97(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static97.aClass217_4 = new Class217(Static121.aClass63_2, Static66.anInt1307, true, Static103.aClass20_25, Static299.aClass20_73);
				Static326.aClass195_4 = new Class195(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14, Static77.aClass20_19);
				Static319.aClass24_4 = new Class24(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14, Static77.aClass20_19);
				Static90.aClass83_2 = new Class83(Static121.aClass63_2, Static66.anInt1307, true, Static370.aClass20_96, Static299.aClass20_73);
				Static176.aClass78_3 = new Class78(Static121.aClass63_2, Static66.anInt1307, true, Static255.aClass187_2, Static109.aClass20_32, Static299.aClass20_73);
				Static330.aClass26_1 = new Class26(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static176.aClass43_2 = new Class43(Static121.aClass63_2, Static66.anInt1307, Static198.aClass20_50, Static171.aClass20_43, Static338.aClass20_87);
				Static66.aClass182_1 = new Class182(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static253.aClass218_1 = new Class218(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static224.aClass203_2 = new Class203(Static121.aClass63_2, Static66.anInt1307, Static340.aClass20_88, Static299.aClass20_73);
				Static125.aClass212_1 = new Class212(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static372.aClass211_1 = new Class211(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static380.aClass17_1 = new Class17(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static139.aClass163_1 = new Class163(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_15);
				Static131.aClass183_1 = new Class183(Static121.aClass63_2, Static66.anInt1307, Static32.aClass20_14);
				Static21.method258(Static299.aClass20_73, Static77.aClass20_19, Static368.aClass20_95, Static4.aClass20_1);
				Static160.method4994(Static229.aClass20_53, new Class59(), Static205.aClass20_8);
				Static365.method5446(Static205.aClass20_8, Static229.aClass20_53);
				Static187.aString34 = Static273.aClass57_74.method1122(Static66.anInt1307);
				Static212.anInt3744 = 65;
				Static72.method1209();
				Static97.aClass217_4.method5001(!Static164.aClass154_Sub1_1.method5400(Static2.anInt68));
				Static331.aClass115_1 = new Class115();
				Static182.method2843();
				Static200.method3132(Static122.aClass20_35);
				Static38.method623(Static12.anInterface10_1, Static299.aClass20_73);
				Static262.anInt1205 = 120;
			}
		} else if (Static262.anInt1205 == 120) {
			local10 = Static169.method2613(Static77.aClass20_19);
			local54 = Static262.method1041();
			if (local54 > local10) {
				Static187.aString34 = Static201.aClass57_62.method1122(Static66.anInt1307) + local10 * 100 / local54 + "%";
				Static212.anInt3744 = 70;
			} else {
				Static164.method2515(Static77.aClass20_19, Static347.aClass155_9);
				Static272.method4266(Static110.aClass110Array4);
				Static187.aString34 = Static232.aClass57_67.method1122(Static66.anInt1307);
				Static212.anInt3744 = 70;
				Static262.anInt1205 = 130;
			}
		} else if (Static262.anInt1205 == 130) {
			if (Static86.aClass20_21.method255("huffman", "")) {
				@Pc(1279) Class198 local1279 = new Class198(Static86.aClass20_21.method241("huffman", ""));
				Static144.method2281(local1279);
				Static187.aString34 = Static182.aClass57_58.method1122(Static66.anInt1307);
				Static262.anInt1205 = 140;
				Static212.anInt3744 = 75;
			} else {
				Static187.aString34 = Static77.aClass57_29.method1122(Static66.anInt1307) + "0%";
				Static212.anInt3744 = 75;
			}
		} else if (Static262.anInt1205 == 140) {
			if (Static4.aClass20_1.method247()) {
				Static187.aString34 = Static340.aClass57_84.method1122(Static66.anInt1307);
				Static262.anInt1205 = 150;
				Static212.anInt3744 = 80;
			} else {
				Static187.aString34 = Static71.aClass57_26.method1122(Static66.anInt1307) + Static4.aClass20_1.method225() + "%";
				Static212.anInt3744 = 80;
			}
		} else if (Static262.anInt1205 == 150) {
			if (Static104.aClass20_28.method247()) {
				Static187.aString34 = Static380.aClass57_100.method1122(Static66.anInt1307);
				Static212.anInt3744 = 82;
				Static262.anInt1205 = 160;
			} else {
				Static187.aString34 = Static356.aClass57_15.method1122(Static66.anInt1307) + Static104.aClass20_28.method225() + "%";
				Static212.anInt3744 = 82;
			}
		} else if (Static262.anInt1205 == 160) {
			if (Static368.aClass20_95.method247()) {
				Static187.aString34 = Static23.aClass57_9.method1122(Static66.anInt1307);
				Static212.anInt3744 = 85;
				Static262.anInt1205 = 170;
			} else {
				Static187.aString34 = Static23.aClass57_9.method1122(Static66.anInt1307) + Static368.aClass20_95.method225() + "%";
				Static212.anInt3744 = 85;
			}
		} else if (Static262.anInt1205 == 170) {
			if (Static270.aClass20_92.method249("details")) {
				Static42.method454(Static270.aClass20_92, Static125.aClass134_3, Static147.aClass210_3, Static97.aClass217_4, Static326.aClass195_4, Static319.aClass24_4, Static331.aClass115_1);
				Static187.aString34 = Static267.aClass57_85.method1122(Static66.anInt1307);
				Static212.anInt3744 = 89;
				Static262.anInt1205 = 180;
			} else {
				Static187.aString34 = Static387.aClass57_103.method1122(Static66.anInt1307) + Static270.aClass20_92.method251("details") + "%";
				Static212.anInt3744 = 87;
			}
		} else if (Static262.anInt1205 == 180) {
			local10 = Static361.method5391();
			if (local10 == -1) {
				Static187.aString34 = Static347.aClass57_88.method1122(Static66.anInt1307);
				Static212.anInt3744 = 90;
			} else if (local10 == 7 || local10 == 9) {
				this.method886("worldlistfull");
				Static310.method4763(1000);
			} else if (Static52.aBoolean58) {
				Static187.aString34 = Static178.aClass57_55.method1122(Static66.anInt1307);
				Static262.anInt1205 = 190;
				Static212.anInt3744 = 90;
			} else {
				this.method886("worldlistio_" + local10);
				Static310.method4763(1000);
			}
		} else if (Static262.anInt1205 == 190) {
			Static29.aBooleanArray105 = new boolean[Static380.aClass17_1.anInt214];
			Static138.aStringArray22 = new String[Static372.aClass211_1.anInt5378];
			Static97.anIntArray196 = new int[Static380.aClass17_1.anInt214];
			for (local10 = 0; local10 < Static380.aClass17_1.anInt214; local10++) {
				if (Static380.aClass17_1.method208(local10).anInt5693 == 0) {
					Static29.aBooleanArray105[local10] = true;
					Static348.anInt4438++;
				}
				Static97.anIntArray196[local10] = -1;
			}
			Static82.method1364();
			Static350.anInt5894 = Static4.aClass20_1.method230("loginscreen");
			Static179.aClass20_44.method237(false);
			Static103.aClass20_26.method237(true);
			Static77.aClass20_19.method237(true);
			Static368.aClass20_95.method237(true);
			Static86.aClass20_21.method237(true);
			Static4.aClass20_1.method237(true);
			Static322.aBoolean499 = true;
			Static32.aClass20_14.anInt223 = 2;
			Static289.aClass20_70.anInt223 = 2;
			Static103.aClass20_25.anInt223 = 2;
			Static370.aClass20_96.anInt223 = 2;
			Static109.aClass20_32.anInt223 = 2;
			Static198.aClass20_50.anInt223 = 2;
			Static340.aClass20_88.anInt223 = 2;
			Static175.method2696(Static164.aClass154_Sub1_1.anInt6068, -1, false, -1);
			Static187.aString34 = Static45.aClass57_20.method1122(Static66.anInt1307);
			Static212.anInt3744 = 95;
			Static262.anInt1205 = 200;
		} else if (Static262.anInt1205 == 200) {
			Static275.method4304(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method914(@OriginalArg(1) int arg0) {
		Static123.anInt2360 = 0;
		Static328.aClass11_3.anInt177++;
		Static328.aClass11_3.anInt176 = arg0;
		Static194.aClass133_5 = null;
		Static6.aClass145_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
	private void method916(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub5 local10 = new Class3_Sub5(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method2739();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(27) int[] local27 = Static240.anIntArray597 = new int[6];
					local27[0] = local10.method2767();
					local27[1] = local10.method2767();
					local27[2] = local10.method2767();
					local27[3] = local10.method2767();
					local27[4] = local10.method2767();
					local27[5] = local10.method2767();
				} else {
					@Pc(75) int local75;
					@Pc(80) int local80;
					if (local14 == 4) {
						local75 = local10.method2739();
						Static341.anIntArray622 = new int[local75];
						for (local80 = 0; local80 < local75; local80++) {
							Static341.anIntArray622[local80] = local10.method2767();
							if (Static341.anIntArray622[local80] == 65535) {
								Static341.anIntArray622[local80] = -1;
							}
						}
					} else if (local14 == 5) {
						local75 = local10.method2739();
						Static8.anIntArray703 = new int[local75];
						for (local80 = 0; local80 < local75; local80++) {
							Static8.anIntArray703[local80] = local10.method2767();
							if (Static8.anIntArray703[local80] == 65535) {
								Static8.anIntArray703[local80] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method917() {
		@Pc(13) boolean local13 = Static328.aClass11_3.method163();
		if (!local13) {
			this.method907();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method897()) {
			return;
		}
		Static247.anInt4444 = Integer.parseInt(this.getParameter("worldid"));
		Static291.aClass171_5 = Static135.method2164(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static373.method5560(Static291.aClass171_5) && Static238.aClass171_4 != Static291.aClass171_5) {
			Static291.aClass171_5 = Static238.aClass171_4;
		}
		Static270.aClass213_17 = Static361.method5392(Integer.parseInt(this.getParameter("modewhat")));
		if (Static136.aClass213_10 != Static270.aClass213_17 && Static270.aClass213_17 != Static341.aClass213_16 && Static270.aClass213_17 != Static351.aClass213_11) {
			Static270.aClass213_17 = Static351.aClass213_11;
		}
		try {
			Static66.anInt1307 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static66.anInt1307 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static199.aBoolean259 = true;
		} else {
			Static199.aBoolean259 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static153.aBoolean211 = true;
		} else {
			Static153.aBoolean211 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static1.aBoolean3 = true;
		} else {
			Static1.aBoolean3 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static121.aClass63_2 = Static340.aClass63_3;
		} else {
			Static121.aClass63_2 = Static17.aClass63_1;
		}
		try {
			Static68.anInt1341 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static68.anInt1341 = 0;
		}
		Static14.aString1 = this.getParameter("quiturl");
		Static368.aString57 = this.getParameter("settings");
		if (Static368.aString57 == null) {
			Static368.aString57 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static155.anInt2789 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static155.anInt2789 = 0;
			}
		}
		Static183.anInt3244 = Integer.parseInt(this.getParameter("colourid"));
		if (Static183.anInt3244 < 0 || Static183.anInt3244 >= Static374.aColorArray3.length) {
			Static183.anInt3244 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static207.aBoolean172 = true;
			Static220.aBoolean317 = true;
		}
		if (Static121.aClass63_2 == Static17.aClass63_1) {
			Static174.anInt3036 = 503;
			Static196.anInt5198 = 765;
		} else if (Static340.aClass63_3 == Static121.aClass63_2) {
			Static196.anInt5198 = 640;
			Static174.anInt3036 = 480;
		}
		Static144.aClient1 = this;
		this.method900(Static174.anInt3036, Static270.aClass213_17.method4814() + 32, Static196.anInt5198);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method919() {
		Static38.anInt702++;
		Static55.method1001(-1, null, -1);
		Static239.method5185(null, -1, -1);
		Static85.method1418();
		Static28.anInt360++;
		for (@Pc(41) int local41 = 0; local41 < 32768; local41++) {
			@Pc(47) Class28_Sub1_Sub1_Sub1 local47 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local41];
			if (local47 != null) {
				@Pc(53) byte local53 = local47.aClass61_1.aByte18;
				if ((local53 & 0x1) != 0) {
					@Pc(65) int local65 = local47.method4009();
					@Pc(89) int local89;
					if ((local53 & 0x2) != 0 && local47.anInt4378 == 0 && Math.random() * 1000.0D < 10.0D) {
						local89 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(97) int local97 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local89 != 0 || local97 != 0) {
							@Pc(109) int local109 = local47.anIntArray491[0] + local89;
							if (local109 < 0) {
								local109 = 0;
							} else if (Static12.anInt161 - local65 - 1 < local109) {
								local109 = Static12.anInt161 - local65 - 1;
							}
							@Pc(136) int local136 = local47.anIntArray490[0] + local97;
							if (local136 < 0) {
								local136 = 0;
							} else if (Static44.anInt787 - local65 - 1 < local136) {
								local136 = Static44.anInt787 - local65 - 1;
							}
							@Pc(183) int local183 = Static34.method529(true, local109, local65, Static151.anIntArray298, local47.anIntArray491[0], 0, local136, Static271.anIntArray696, local65, 0, local65, -1, Static160.aClass67Array3[local47.aByte73], local47.anIntArray490[0]);
							if (local183 > 0) {
								if (local183 > 9) {
									local183 = 9;
								}
								for (@Pc(197) int local197 = 0; local197 < local183; local197++) {
									local47.anIntArray491[local197] = Static151.anIntArray298[local183 - local197 - 1];
									local47.anIntArray490[local197] = Static271.anIntArray696[local183 - local197 - 1];
									local47.aByteArray56[local197] = 1;
								}
								local47.anInt4378 = local183;
							}
						}
					}
					Static319.method4841(local47, true);
					local89 = Static318.method1785(local47);
					Static67.method1153(Static366.anInt4859, local89, local47, Static385.anInt6435);
					Static312.method4797(local47);
				}
			}
		}
		if (Static193.anInt3497 == 0 && Static270.anInt5905 == 0) {
			if (Static88.anInt1815 == 2) {
				Static47.method863();
			} else {
				Static126.method2019();
			}
			if (Static206.anInt3639 >> 7 < 14 || Static206.anInt3639 >> 7 >= Static12.anInt161 - 14 || Static339.anInt5726 >> 7 < 14 || Static44.anInt787 - 14 <= Static339.anInt5726 >> 7) {
				Static162.method2512();
			}
		}
		while (true) {
			@Pc(304) Class3_Sub23 local304;
			@Pc(309) Class62 local309;
			@Pc(320) Class62 local320;
			do {
				local304 = (Class3_Sub23) Static255.aClass138_35.method3047();
				if (local304 == null) {
					while (true) {
						do {
							local304 = (Class3_Sub23) Static345.aClass138_41.method3047();
							if (local304 == null) {
								while (true) {
									do {
										local304 = (Class3_Sub23) Static352.aClass138_44.method3047();
										if (local304 == null) {
											if (Static313.aClass62_18 != null) {
												Static342.method5173();
											}
											if (Static76.anInt1617 % 1500 == 0) {
												Static185.method2923();
											}
											Static145.method2287();
											if (Static363.aBoolean483 && Static150.aLong165 < Static288.method4512() - 60000L) {
												Static314.method4813();
												return;
											}
											return;
										}
										local309 = local304.aClass62_11;
										if (local309.anInt1510 < 0) {
											break;
										}
										local320 = Static115.method1862(local309.anInt1506);
									} while (local320 == null || local320.aClass62Array1 == null || local309.anInt1510 >= local320.aClass62Array1.length || local320.aClass62Array1[local309.anInt1510] != local309);
									Static124.method2006(local304);
								}
							}
							local309 = local304.aClass62_11;
							if (local309.anInt1510 < 0) {
								break;
							}
							local320 = Static115.method1862(local309.anInt1506);
						} while (local320 == null || local320.aClass62Array1 == null || local309.anInt1510 >= local320.aClass62Array1.length || local309 != local320.aClass62Array1[local309.anInt1510]);
						Static124.method2006(local304);
					}
				}
				local309 = local304.aClass62_11;
				if (local309.anInt1510 < 0) {
					break;
				}
				local320 = Static115.method1862(local309.anInt1506);
			} while (local320 == null || local320.aClass62Array1 == null || local320.aClass62Array1.length <= local309.anInt1510 || local309 != local320.aClass62Array1[local309.anInt1510]);
			Static124.method2006(local304);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method889() {
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method895() {
		if (Static363.aBoolean483) {
			Static314.method4813();
		}
		if (Static347.aClass155_9 != null) {
			Static347.aClass155_9.method4929();
		}
		if (Static225.aFrame2 != null) {
			Static20.method223(Static225.aFrame2, Static61.aClass156_1);
			Static225.aFrame2 = null;
		}
		if (Static12.aClass145_2 != null) {
			Static12.aClass145_2.method3136();
			Static12.aClass145_2 = null;
		}
		if (Static289.aClass52_1 != null) {
			Static289.aClass52_1.method1044(Static173.aCanvas2);
		}
		Static289.aClass52_1 = null;
		if (Static25.aClass119_1 != null) {
			Static25.aClass119_1.method4982();
		}
		if (Static275.aClass119_2 != null) {
			Static275.aClass119_2.method4982();
		}
		Static328.aClass11_3.method170();
		Static250.aClass40_4.method692();
		if (Static335.aClass72_1 != null) {
			Static335.aClass72_1.method1541();
			Static335.aClass72_1 = null;
		}
	}
}
