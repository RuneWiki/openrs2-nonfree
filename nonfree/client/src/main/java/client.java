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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!f;")
	public static Class76 lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static177.method2780("argument count");
			}
			Static213.anInt4106 = Integer.parseInt(arg0[0]);
			Static343.aClass269_11 = Static300.aClass269_9;
			if (arg0[1].equals("live")) {
				Static395.aClass223_5 = Static99.aClass223_2;
			} else if (arg0[1].equals("rc")) {
				Static395.aClass223_5 = Static164.aClass223_4;
			} else if (arg0[1].equals("wip")) {
				Static395.aClass223_5 = Static110.aClass223_3;
			} else {
				Static177.method2780("modewhat");
			}
			Static272.anInt7537 = Static127.method1850(arg0[2]);
			if (Static272.anInt7537 == -1) {
				if (arg0[2].equals("english")) {
					Static272.anInt7537 = 0;
				} else if (arg0[2].equals("german")) {
					Static272.anInt7537 = 1;
				} else {
					Static177.method2780("language");
				}
			}
			Static187.aBoolean588 = false;
			Static41.aBoolean94 = false;
			if (arg0[3].equals("game0")) {
				Static107.aClass209_1 = Static407.aClass209_3;
			} else if (arg0[3].equals("game1")) {
				Static107.aClass209_1 = Static389.aClass209_2;
			} else {
				Static177.method2780("game");
			}
			Static446.aBoolean666 = true;
			Static168.aBoolean279 = true;
			Static160.anInt3171 = 0;
			Static438.aString70 = "";
			Static438.anInt7647 = 0;
			Static25.anInt556 = Static107.aClass209_1.anInt5938;
			@Pc(127) client local127 = new client();
			Static405.aClient1 = local127;
			local127.method1108(Static107.aClass209_1.aString50, Static395.aClass223_5.method5067() + 32);
			Static373.aFrame2.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static80.method1410(local150, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	protected void method1102() {
		if (Static442.aBoolean663) {
			Static211.method3261();
		}
		if (Static387.aClass26_9 != null) {
			Static387.aClass26_9.method2258();
		}
		if (Static140.aFrame12 != null) {
			Static9.method189(Static140.aFrame12, Static303.aClass131_4);
			Static140.aFrame12 = null;
		}
		if (Static423.aClass199_11 != null) {
			Static423.aClass199_11.method4490();
			Static423.aClass199_11 = null;
		}
		if (Static6.aClass170_1 != null) {
			Static6.aClass170_1.method5631(Static118.aCanvas3);
		}
		Static6.aClass170_1 = null;
		Static180.method2820();
		Static239.aClass179_1.method4133();
		Static354.aClass87_1.method1752();
		if (Static316.aClass153_1 != null) {
			Static316.aClass153_1.method3558();
			Static316.aClass153_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1096() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1103()) {
			return;
		}
		Static213.anInt4106 = Integer.parseInt(this.getParameter("worldid"));
		Static343.aClass269_11 = Static406.method5506(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static371.method5224(Static343.aClass269_11) && Static293.aClass269_10 != Static343.aClass269_11) {
			Static343.aClass269_11 = Static293.aClass269_10;
		}
		Static395.aClass223_5 = Static322.method4614(Integer.parseInt(this.getParameter("modewhat")));
		if (Static110.aClass223_3 != Static395.aClass223_5 && Static395.aClass223_5 != Static164.aClass223_4 && Static395.aClass223_5 != Static99.aClass223_2) {
			Static395.aClass223_5 = Static99.aClass223_2;
		}
		try {
			Static272.anInt7537 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static272.anInt7537 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static41.aBoolean94 = true;
		} else {
			Static41.aBoolean94 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static187.aBoolean588 = true;
		} else {
			Static187.aBoolean588 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static254.aBoolean595 = true;
		} else {
			Static254.aBoolean595 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static107.aClass209_1 = Static389.aClass209_2;
		} else {
			Static107.aClass209_1 = Static407.aClass209_3;
		}
		try {
			Static160.anInt3171 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static160.anInt3171 = 0;
		}
		Static220.aString37 = this.getParameter("quiturl");
		Static438.aString70 = this.getParameter("settings");
		if (Static438.aString70 == null) {
			Static438.aString70 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static438.anInt7647 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static438.anInt7647 = 0;
			}
		}
		Static25.anInt556 = Integer.parseInt(this.getParameter("colourid"));
		if (Static25.anInt556 < 0 || Static67.aColorArray1.length <= Static25.anInt556) {
			Static25.anInt556 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static446.aBoolean666 = true;
			Static168.aBoolean279 = true;
		}
		Static405.aClient1 = this;
		if (Static407.aClass209_3 == Static107.aClass209_1) {
			Static400.anInt6970 = 503;
			Static355.anInt6274 = 765;
		} else if (Static389.aClass209_2 == Static107.aClass209_1) {
			Static400.anInt6970 = 480;
			Static355.anInt6274 = 640;
		}
		this.method1090(Static400.anInt6970, Static395.aClass223_5.method5067() + 32, Static355.anInt6274);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	private void method1110() {
		if (Static93.anInt2132 < Static239.aClass179_1.anInt5124) {
			if (Static276.anInt5074 == Static219.anInt4190) {
				Static219.anInt4190 = Static133.anInt2586;
			} else {
				Static219.anInt4190 = Static276.anInt5074;
			}
			Static187.anInt6938 = (Static239.aClass179_1.anInt5124 - 1) * 250;
			if (Static187.anInt6938 > 3000) {
				Static187.anInt6938 = 3000;
			}
			if (Static239.aClass179_1.anInt5124 >= 2 && Static239.aClass179_1.anInt5123 == 6) {
				this.method1093("js5connect_outofdate");
				Static297.anInt5339 = 1000;
				return;
			}
			if (Static239.aClass179_1.anInt5124 >= 4 && Static239.aClass179_1.anInt5123 == -1) {
				this.method1093("js5crc");
				Static297.anInt5339 = 1000;
				return;
			}
			if (Static239.aClass179_1.anInt5124 >= 4 && (Static297.anInt5339 == 0 || Static297.anInt5339 == 5)) {
				if (Static239.aClass179_1.anInt5123 == 7 || Static239.aClass179_1.anInt5123 == 9) {
					this.method1093("js5connect_full");
				} else if (Static239.aClass179_1.anInt5123 <= 0) {
					this.method1093("js5io");
				} else {
					this.method1093("js5connect");
				}
				Static297.anInt5339 = 1000;
				return;
			}
		}
		Static93.anInt2132 = Static239.aClass179_1.anInt5124;
		if (Static187.anInt6938 > 0) {
			Static187.anInt6938--;
			return;
		}
		try {
			if (Static391.anInt6865 == 0) {
				Static443.aClass128_9 = Static303.aClass131_4.method3068(Static219.anInt4190, Static373.aString7);
				Static391.anInt6865++;
			}
			if (Static391.anInt6865 == 1) {
				if (Static443.aClass128_9.anInt3727 == 2) {
					this.method1127(1000);
					return;
				}
				if (Static443.aClass128_9.anInt3727 == 1) {
					Static391.anInt6865++;
				}
			}
			if (Static391.anInt6865 == 2) {
				Static71.aClass199_3 = new Class199((Socket) Static443.aClass128_9.anObject4, Static303.aClass131_4);
				@Pc(175) Class2_Sub20 local175 = new Class2_Sub20(5);
				local175.method3699(Static119.aClass254_2.anInt7355);
				local175.method3713(585);
				Static71.aClass199_3.method4484(local175.aByteArray136, 5);
				Static391.anInt6865++;
				Static374.aLong194 = Static208.method3182();
			}
			if (Static391.anInt6865 == 3) {
				if (Static297.anInt5339 == 0 || Static297.anInt5339 == 5 || Static71.aClass199_3.method4483() > 0) {
					@Pc(236) int local236 = Static71.aClass199_3.method4491();
					if (local236 != 0) {
						this.method1127(local236);
						return;
					}
					Static391.anInt6865++;
				} else if (Static208.method3182() - Static374.aLong194 > 30000L) {
					this.method1127(1001);
					return;
				}
			}
			if (Static391.anInt6865 == 4) {
				@Pc(270) boolean local270 = Static297.anInt5339 == 5 || Static297.anInt5339 == 10 || Static297.anInt5339 == 28;
				Static239.aClass179_1.method4131(!local270, Static71.aClass199_3);
				Static71.aClass199_3 = null;
				Static443.aClass128_9 = null;
				Static391.anInt6865 = 0;
			}
		} catch (@Pc(287) IOException local287) {
			this.method1127(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1089() {
		if (Static297.anInt5339 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static292.method4289() / 1000000L - Static158.aLong81;
		Static158.aLong81 = Static292.method4289() / 1000000L;
		@Pc(26) boolean local26 = Static438.method5926();
		if (local26 && Static256.aBoolean398 && Static105.aClass141_2 != null) {
			Static105.aClass141_2.method5187();
		}
		if (Static297.anInt5339 == 30 || Static297.anInt5339 == 10) {
			if (Static239.aLong133 != 0L && Static208.method3182() > Static239.aLong133) {
				Static168.method2626(false, Static399.aClass167_Sub1_1.anInt5561, Static399.aClass167_Sub1_1.anInt5569, Static405.method5498());
			} else if (!Static387.aClass26_9.method2240() && Static396.aBoolean587) {
				Static6.method143();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static140.aFrame12 == null) {
			@Pc(81) Container local81;
			if (Static373.aFrame2 == null) {
				local81 = Static303.aClass131_4.anApplet1;
			} else {
				local81 = Static373.aFrame2;
			}
			local89 = local81.getSize().width;
			local93 = local81.getSize().height;
			if (Static373.aFrame2 == local81) {
				@Pc(99) Insets local99 = Static373.aFrame2.getInsets();
				local93 -= local99.top + local99.bottom;
				local89 -= local99.right + local99.left;
			}
			if (Static203.anInt3944 != local89 || local93 != Static13.anInt316) {
				if (Static387.aClass26_9 == null || Static387.aClass26_9.method2238()) {
					Static37.method711();
				} else {
					Static13.anInt316 = local93;
					Static203.anInt3944 = local89;
				}
				Static239.aLong133 = Static208.method3182() + 500L;
			}
		}
		if (Static140.aFrame12 != null && !Static30.aBoolean591 && (Static297.anInt5339 == 30 || Static297.anInt5339 == 10)) {
			Static168.method2626(false, -1, -1, Static399.aClass167_Sub1_1.anInt5557);
		}
		@Pc(166) boolean local166 = false;
		if (Static153.aBoolean263) {
			Static153.aBoolean263 = false;
			local166 = true;
		}
		if (local166) {
			Static285.method4204();
		}
		if (Static387.aClass26_9 != null && Static387.aClass26_9.method2240() || Static405.method5498() != 1) {
			Static8.method183();
		}
		if (Static297.anInt5339 == 0) {
			Static150.method2215(Static390.aString58, local166, Static298.aColorArray3[Static25.anInt556], Static31.anInt3272, Static439.aColorArray4[Static25.anInt556], Static67.aColorArray1[Static25.anInt556]);
		} else if (Static297.anInt5339 == 5) {
			Static62.method1216(Static439.aColorArray4[Static25.anInt556].getRGB(), local166 | Static387.aClass26_9.method2240(), Static67.aColorArray1[Static25.anInt556].getRGB(), Static387.aClass26_9, Static193.aClass56_3, Static298.aColorArray3[Static25.anInt556].getRGB());
		} else if (Static297.anInt5339 == 10) {
			Static5.method141();
		} else if (Static297.anInt5339 == 25 || Static297.anInt5339 == 28) {
			if (Static302.anInt4904 == 1) {
				if (Static389.anInt6846 < Static271.anInt4993) {
					Static389.anInt6846 = Static271.anInt4993;
				}
				local89 = (Static389.anInt6846 - Static271.anInt4993) * 50 / Static389.anInt6846;
				Static32.method437(Static345.aClass256_76.method5720(Static272.anInt7537) + "<br>(" + local89 + "%)", Static184.aClass56_2, true);
			} else if (Static302.anInt4904 == 2) {
				if (Static88.anInt2012 > Static305.anInt1350) {
					Static305.anInt1350 = Static88.anInt2012;
				}
				local89 = (Static305.anInt1350 - Static88.anInt2012) * 50 / Static305.anInt1350 + 50;
				Static32.method437(Static345.aClass256_76.method5720(Static272.anInt7537) + "<br>(" + local89 + "%)", Static184.aClass56_2, true);
			} else {
				Static32.method437(Static345.aClass256_76.method5720(Static272.anInt7537), Static184.aClass56_2, true);
			}
		} else if (Static297.anInt5339 == 30) {
			Static331.method4711(local18);
		} else if (Static297.anInt5339 == 40) {
			Static32.method437(Static408.aClass256_146.method5720(Static272.anInt7537) + "<br>" + Static265.aClass256_151.method5720(Static272.anInt7537), Static184.aClass56_2, true);
		}
		if (Static198.anInt3846 == 3) {
			for (local89 = 0; local89 < Static66.anInt1689; local89++) {
				@Pc(392) Rectangle local392 = Class2_Sub20_Sub1.aRectangleArray2[local89];
				if (Static16.aBooleanArray6[local89]) {
					Static387.aClass26_9.method2245(local392.height, local392.x, local392.y, local392.width, -1996553985);
				} else if (Static378.aBooleanArray47[local89]) {
					Static387.aClass26_9.method2245(local392.height, local392.x, local392.y, local392.width, -1996554240);
				}
			}
		}
		if (Static348.method4894()) {
			Static299.method4340(Static387.aClass26_9);
		}
		if ((Static297.anInt5339 == 30 || Static297.anInt5339 == 10) && Static198.anInt3846 == 0 && Static405.method5498() == 1 && !local166 && Static197.aString30.equals("1.1")) {
			local89 = 0;
			for (local93 = 0; local93 < Static66.anInt1689; local93++) {
				if (Static378.aBooleanArray47[local93]) {
					Static378.aBooleanArray47[local93] = false;
					Static38.aRectangleArray1[local89++] = Class2_Sub20_Sub1.aRectangleArray2[local93];
				}
			}
			Static387.aClass26_9.method2233(Static38.aRectangleArray1, local89);
		} else if (Static297.anInt5339 != 0) {
			Static387.aClass26_9.method2220();
			for (local89 = 0; local89 < Static66.anInt1689; local89++) {
				Static378.aBooleanArray47[local89] = false;
			}
		}
		if (Static399.aClass167_Sub1_1.anInt5563 == 0) {
			Static443.method5991(15L);
		} else if (Static399.aClass167_Sub1_1.anInt5563 == 1) {
			Static443.method5991(10L);
		} else if (Static399.aClass167_Sub1_1.anInt5563 == 2) {
			Static443.method5991(5L);
		} else if (Static399.aClass167_Sub1_1.anInt5563 == 3) {
			Static443.method5991(2L);
		}
		if (Static8.aBoolean27) {
			Static39.method724();
		}
		if (Static399.aClass167_Sub1_1.aBoolean481 && Static297.anInt5339 == 10 && Static108.anInt2264 != -1) {
			Static399.aClass167_Sub1_1.aBoolean481 = false;
			Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method1114() {
		@Pc(6) int local6;
		if (!Static399.aClass167_Sub1_1.aBoolean481) {
			for (local6 = 0; local6 < Static357.anInt3690; local6++) {
				if (Static347.aClass42Array1[local6].method1201() == 's' || Static347.aClass42Array1[local6].method1201() == 'S') {
					Static399.aClass167_Sub1_1.aBoolean481 = true;
					break;
				}
			}
		}
		@Pc(50) int local50;
		if (Static302.anInt4903 == 0) {
			@Pc(41) Runtime local41 = Runtime.getRuntime();
			local50 = (int) ((local41.totalMemory() - local41.freeMemory()) / 1024L);
			@Pc(53) long local53 = Static208.method3182();
			if (Static385.aLong201 == 0L) {
				Static385.aLong201 = local53;
			}
			if (local50 > 16384 && local53 - Static385.aLong201 < 5000L) {
				if (local53 - Static12.aLong14 > 1000L) {
					System.gc();
					Static12.aLong14 = local53;
				}
				Static390.aString58 = Static364.aClass256_128.method5720(Static272.anInt7537);
				Static31.anInt3272 = 5;
			} else {
				Static390.aString58 = Static76.aClass256_36.method5720(Static272.anInt7537);
				Static31.anInt3272 = 5;
				Static302.anInt4903 = 10;
			}
		} else if (Static302.anInt4903 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static332.aClass37Array1[local6] = Static446.method6041(Static81.anInt1950, Static171.anInt3288);
			}
			Static390.aString58 = Static369.aClass256_132.method5720(Static272.anInt7537);
			Static302.anInt4903 = 20;
			Static31.anInt3272 = 10;
		} else if (Static302.anInt4903 == 20) {
			if (Static451.aClass232_2 == null) {
				Static451.aClass232_2 = new Class232(Static239.aClass179_1, Static354.aClass87_1);
			}
			if (Static451.aClass232_2.method5332()) {
				Static260.aClass188_70 = Static54.method1051(0, false, true);
				Static285.aClass188_77 = Static54.method1051(1, false, true);
				Static102.aClass188_33 = Static54.method1051(2, false, true);
				Static203.aClass188_55 = Static54.method1051(3, false, true);
				Static310.aClass188_83 = Static54.method1051(4, false, true);
				Static438.aClass188_126 = Static54.method1051(5, true, true);
				Static329.aClass188_90 = Static54.method1051(6, true, false);
				Static155.aClass188_43 = Static54.method1051(7, false, true);
				Static351.aClass188_97 = Static54.method1051(8, false, true);
				Static373.aClass188_22 = Static54.method1051(9, false, true);
				Static381.aClass188_109 = Static54.method1051(10, false, true);
				Static22.aClass188_10 = Static54.method1051(11, false, true);
				Static317.aClass188_86 = Static54.method1051(12, false, true);
				Static48.aClass188_23 = Static54.method1051(13, false, true);
				Static10.aClass188_6 = Static54.method1051(14, false, false);
				Static88.aClass188_28 = Static54.method1051(15, false, true);
				Static419.aClass188_123 = Static54.method1051(16, false, true);
				Static96.aClass188_32 = Static54.method1051(17, false, true);
				Static444.aClass188_128 = Static54.method1051(18, false, true);
				Static269.aClass188_72 = Static54.method1051(19, false, true);
				Static1.aClass188_1 = Static54.method1051(20, false, true);
				Static317.aClass188_87 = Static54.method1051(21, false, true);
				Static153.aClass188_42 = Static54.method1051(22, false, true);
				Static309.aClass188_82 = Static54.method1051(23, true, true);
				Static349.aClass188_96 = Static54.method1051(24, false, true);
				Static348.aClass188_95 = Static54.method1051(25, false, true);
				Static299.aClass188_79 = Static54.method1051(26, true, true);
				Static260.aClass188_69 = Static54.method1051(27, false, true);
				Static397.aClass188_116 = Static54.method1051(28, true, true);
				Static46.aClass188_20 = Static54.method1051(29, false, true);
				Static390.aString58 = Static284.aClass256_106.method5720(Static272.anInt7537);
				Static302.anInt4903 = 30;
				Static31.anInt3272 = 15;
			} else {
				Static390.aString58 = Static327.aClass256_117.method5720(Static272.anInt7537);
				Static31.anInt3272 = 12;
			}
		} else if (Static302.anInt4903 == 30) {
			local6 = 0;
			for (local50 = 0; local50 < 30; local50++) {
				local6 += Static29.aClass176_Sub1Array1[local50].method5870() * Static396.anIntArray459[local50] / 100;
			}
			if (local6 == 100) {
				Static390.aString58 = Static413.aClass256_149.method5720(Static272.anInt7537);
				Static31.anInt3272 = 20;
				Static351.method4906(Static351.aClass188_97);
				Static326.method4674(Static351.aClass188_97);
				Static302.anInt4903 = 40;
			} else {
				if (local6 != 0) {
					Static390.aString58 = Static387.aClass256_139.method5720(Static272.anInt7537) + local6 + "%";
				}
				Static31.anInt3272 = 20;
			}
		} else if (Static302.anInt4903 == 40) {
			if (Static397.aClass188_116.method4274()) {
				this.method1126(Static397.aClass188_116.method4282(1));
				Static390.aString58 = Static42.aClass256_21.method5720(Static272.anInt7537);
				Static31.anInt3272 = 25;
				Static302.anInt4903 = 50;
			} else {
				Static390.aString58 = Static296.aClass256_109.method5720(Static272.anInt7537) + Static397.aClass188_116.method4292() + "%";
				Static31.anInt3272 = 25;
			}
		} else if (Static302.anInt4903 == 50) {
			Static35.method5985();
			Static390.aString58 = Static287.aClass256_107.method5720(Static272.anInt7537);
			Static31.anInt3272 = 30;
			Static302.anInt4903 = 60;
		} else if (Static302.anInt4903 == 60) {
			local6 = Static233.method3559(Static351.aClass188_97, Static48.aClass188_23);
			local50 = Static26.method372();
			if (local6 < local50) {
				Static390.aString58 = Static278.aClass256_103.method5720(Static272.anInt7537) + local6 * 100 / local50 + "%";
				Static31.anInt3272 = 35;
			} else {
				Static390.aString58 = Static421.aClass256_157.method5720(Static272.anInt7537);
				Static31.anInt3272 = 35;
				Static302.anInt4903 = 70;
			}
		} else if (Static302.anInt4903 == 70) {
			local6 = Static314.method4493(Static351.aClass188_97);
			local50 = Static437.method5921();
			if (local6 < local50) {
				Static390.aString58 = Static418.aClass256_154.method5720(Static272.anInt7537) + local6 * 100 / local50 + "%";
				Static31.anInt3272 = 40;
			} else {
				Static390.aString58 = Static292.aClass256_108.method5720(Static272.anInt7537);
				Static31.anInt3272 = 40;
				Static302.anInt4903 = 80;
			}
		} else if (Static302.anInt4903 == 80) {
			if (Static299.aClass188_79.method4274()) {
				Static152.anInterface8_6 = new Class163(Static299.aClass188_79, Static373.aClass188_22, Static351.aClass188_97);
				Static390.aString58 = Static265.aClass256_152.method5720(Static272.anInt7537);
				Static31.anInt3272 = 45;
				Static302.anInt4903 = 90;
			} else {
				Static390.aString58 = Static87.aClass256_38.method5720(Static272.anInt7537) + Static299.aClass188_79.method4292() + "%";
				Static31.anInt3272 = 45;
			}
		} else if (Static302.anInt4903 == 90) {
			Static390.aString58 = Static3.aClass256_3.method5720(Static272.anInt7537);
			Static302.anInt4903 = 95;
			Static31.anInt3272 = 50;
		} else if (Static302.anInt4903 == 95) {
			if (Static399.aClass167_Sub1_1.aBoolean481) {
				Static399.aClass167_Sub1_1.anInt5566 = 0;
				Static399.aClass167_Sub1_1.anInt5559 = 0;
				Static399.aClass167_Sub1_1.anInt5553 = 0;
				Static399.aClass167_Sub1_1.anInt5560 = 0;
				Static399.aClass167_Sub1_1.anInt5557 = 1;
			}
			Static399.aClass167_Sub1_1.aBoolean481 = true;
			Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
			Static421.method5714(false, Static399.aClass167_Sub1_1.anInt5553);
			Static390.aString58 = Static374.aClass256_136.method5720(Static272.anInt7537);
			Static31.anInt3272 = 55;
			Static302.anInt4903 = 100;
		} else if (Static302.anInt4903 == 100) {
			Static350.method4899(Static387.aClass26_9, Static351.aClass188_97, Static48.aClass188_23);
			Static390.aString58 = Static267.aClass256_100.method5720(Static272.anInt7537);
			Static31.anInt3272 = 60;
			Static446.method6043(5);
			Static302.anInt4903 = 110;
		} else if (Static302.anInt4903 == 110) {
			Static102.aClass188_33.method4274();
			local6 = Static102.aClass188_33.method4292();
			Static419.aClass188_123.method4274();
			local6 += Static419.aClass188_123.method4292();
			Static96.aClass188_32.method4274();
			local6 += Static96.aClass188_32.method4292();
			Static444.aClass188_128.method4274();
			local6 += Static444.aClass188_128.method4292();
			Static269.aClass188_72.method4274();
			local6 += Static269.aClass188_72.method4292();
			Static1.aClass188_1.method4274();
			local6 += Static1.aClass188_1.method4292();
			Static317.aClass188_87.method4274();
			local6 += Static317.aClass188_87.method4292();
			Static153.aClass188_42.method4274();
			local6 += Static153.aClass188_42.method4292();
			Static349.aClass188_96.method4274();
			local6 += Static349.aClass188_96.method4292();
			Static348.aClass188_95.method4274();
			local6 += Static348.aClass188_95.method4292();
			Static260.aClass188_69.method4274();
			local6 += Static260.aClass188_69.method4292();
			Static46.aClass188_20.method4274();
			local6 += Static46.aClass188_20.method4292();
			if (local6 < 1200) {
				Static390.aString58 = Static391.aClass256_141.method5720(Static272.anInt7537) + local6 / 12 + "%";
				Static31.anInt3272 = 65;
			} else {
				Static150.aClass43_1 = new Class43(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static4.aClass136_1 = new Class136(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static164.aClass246_2 = new Class246(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33, Static351.aClass188_97);
				Static293.aClass24_6 = new Class24(Static107.aClass209_1, Static272.anInt7537, Static96.aClass188_32);
				Static20.aClass245_1 = new Class245(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static400.aClass239_5 = new Class239(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static10.aClass61_1 = new Class61(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33, Static155.aClass188_43);
				Static93.aClass130_1 = new Class130(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static48.aClass97_1 = new Class97(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static406.aClass150_3 = new Class150(Static107.aClass209_1, Static272.anInt7537, true, Static419.aClass188_123, Static155.aClass188_43);
				Static304.aClass173_4 = new Class173(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33, Static351.aClass188_97);
				Static325.aClass221_4 = new Class221(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33, Static351.aClass188_97);
				Static417.aClass234_2 = new Class234(Static107.aClass209_1, Static272.anInt7537, true, Static444.aClass188_128, Static155.aClass188_43);
				Static350.aClass149_2 = new Class149(Static107.aClass209_1, Static272.anInt7537, true, Static150.aClass43_1, Static269.aClass188_72, Static155.aClass188_43);
				Static31.aClass93_2 = new Class93(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static9.aClass194_1 = new Class194(Static107.aClass209_1, Static272.anInt7537, Static1.aClass188_1, Static260.aClass188_70, Static285.aClass188_77);
				Static303.aClass35_1 = new Class35(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static148.aClass123_1 = new Class123(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static137.aClass16_2 = new Class16(Static107.aClass209_1, Static272.anInt7537, Static317.aClass188_87, Static155.aClass188_43);
				Static56.aClass252_1 = new Class252(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static98.aClass8_1 = new Class8(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static275.aClass79_2 = new Class79(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static363.aClass165_1 = new Class165(Static107.aClass209_1, Static272.anInt7537, Static153.aClass188_42);
				Static417.aClass237_1 = new Class237(Static107.aClass209_1, Static272.anInt7537, Static102.aClass188_33);
				Static23.method323(Static203.aClass188_55, Static48.aClass188_23, Static351.aClass188_97, Static155.aClass188_43);
				Static451.method1157(Static46.aClass188_20);
				Static264.aClass28_1 = new Class28(Static272.anInt7537, Static349.aClass188_96, Static348.aClass188_95);
				Static446.aClass228_2 = new Class228(Static272.anInt7537, Static349.aClass188_96, Static348.aClass188_95, new Class45());
				Static390.aString58 = Static212.aClass256_72.method5720(Static272.anInt7537);
				Static31.anInt3272 = 65;
				Static132.method1917();
				Static406.aClass150_3.method3510(!Static399.aClass167_Sub1_1.method4528(Static281.anInt5126));
				Static215.aClass225_1 = new Class225();
				Static196.method4361();
				Static1.method3(Static260.aClass188_69);
				Static436.method5909(Static152.anInterface8_6, Static155.aClass188_43);
				Static302.anInt4903 = 120;
			}
		} else if (Static302.anInt4903 == 120) {
			local6 = Static9.method192(Static351.aClass188_97);
			local50 = Static211.method3258();
			if (local6 < local50) {
				Static390.aString58 = Static111.aClass256_44.method5720(Static272.anInt7537) + local6 * 100 / local50 + "%";
				Static31.anInt3272 = 70;
			} else {
				Static365.method5073(Static351.aClass188_97, Static387.aClass26_9);
				Static256.method3905(Static119.aClass76Array11);
				Static390.aString58 = Static235.aClass256_84.method5720(Static272.anInt7537);
				Static31.anInt3272 = 70;
				Static302.anInt4903 = 130;
			}
		} else if (Static302.anInt4903 == 130) {
			if (Static381.aClass188_109.method4273("huffman", "")) {
				@Pc(1214) Class248 local1214 = new Class248(Static381.aClass188_109.method4271("", "huffman"));
				Static94.method1586(local1214);
				Static390.aString58 = Static96.aClass256_41.method5720(Static272.anInt7537);
				Static31.anInt3272 = 75;
				Static302.anInt4903 = 140;
			} else {
				Static390.aString58 = Static407.aClass256_145.method5720(Static272.anInt7537) + "0%";
				Static31.anInt3272 = 75;
			}
		} else if (Static302.anInt4903 == 140) {
			if (Static203.aClass188_55.method4274()) {
				Static390.aString58 = Static430.aClass256_160.method5720(Static272.anInt7537);
				Static302.anInt4903 = 150;
				Static31.anInt3272 = 80;
			} else {
				Static390.aString58 = Static265.aClass256_153.method5720(Static272.anInt7537) + Static203.aClass188_55.method4292() + "%";
				Static31.anInt3272 = 80;
			}
		} else if (Static302.anInt4903 == 150) {
			if (Static317.aClass188_86.method4274()) {
				Static390.aString58 = Static317.aClass256_114.method5720(Static272.anInt7537);
				Static302.anInt4903 = 160;
				Static31.anInt3272 = 82;
			} else {
				Static390.aString58 = Static170.aClass256_58.method5720(Static272.anInt7537) + Static317.aClass188_86.method4292() + "%";
				Static31.anInt3272 = 82;
			}
		} else if (Static302.anInt4903 == 160) {
			if (Static48.aClass188_23.method4274()) {
				Static390.aString58 = Static350.aClass256_124.method5720(Static272.anInt7537);
				Static302.anInt4903 = 170;
				Static31.anInt3272 = 85;
			} else {
				Static390.aString58 = Static350.aClass256_124.method5720(Static272.anInt7537) + Static48.aClass188_23.method4292() + "%";
				Static31.anInt3272 = 85;
			}
		} else if (Static302.anInt4903 == 170) {
			if (Static309.aClass188_82.method4277("details")) {
				Static169.method2546(Static309.aClass188_82, Static20.aClass245_1, Static400.aClass239_5, Static406.aClass150_3, Static304.aClass173_4, Static325.aClass221_4, Static215.aClass225_1);
				Static390.aString58 = Static250.aClass256_70.method5720(Static272.anInt7537);
				Static31.anInt3272 = 89;
				Static302.anInt4903 = 180;
			} else {
				Static390.aString58 = Static143.aClass256_161.method5720(Static272.anInt7537) + Static309.aClass188_82.method4276("details") + "%";
				Static31.anInt3272 = 87;
			}
		} else if (Static302.anInt4903 == 180) {
			local6 = Static110.method1687();
			if (local6 == -1) {
				Static390.aString58 = Static28.aClass256_15.method5720(Static272.anInt7537);
				Static31.anInt3272 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method1093("worldlistfull");
				Static446.method6043(1000);
			} else if (Static293.aBoolean500) {
				Static390.aString58 = Static305.aClass256_24.method5720(Static272.anInt7537);
				Static302.anInt4903 = 190;
				Static31.anInt3272 = 90;
			} else {
				this.method1093("worldlistio_" + local6);
				Static446.method6043(1000);
			}
		} else if (Static302.anInt4903 == 190) {
			Static299.anIntArray357 = new int[Static275.aClass79_2.anInt2282];
			Static381.aBooleanArray48 = new boolean[Static275.aClass79_2.anInt2282];
			Static227.aStringArray21 = new String[Static98.aClass8_1.anInt275];
			for (local6 = 0; local6 < Static275.aClass79_2.anInt2282; local6++) {
				if (Static275.aClass79_2.method1686(local6).anInt7471 == 0) {
					Static381.aBooleanArray48[local6] = true;
					Static403.anInt7008++;
				}
				Static299.anIntArray357[local6] = -1;
			}
			Static181.method2830();
			Static342.anInt6033 = Static203.aClass188_55.method4279("loginscreen");
			Static438.aClass188_126.method4290(false);
			Static329.aClass188_90.method4290(true);
			Static351.aClass188_97.method4290(true);
			Static48.aClass188_23.method4290(true);
			Static381.aClass188_109.method4290(true);
			Static203.aClass188_55.method4290(true);
			Static8.aBoolean27 = true;
			Static102.aClass188_33.anInt5309 = 2;
			Static96.aClass188_32.anInt5309 = 2;
			Static419.aClass188_123.anInt5309 = 2;
			Static444.aClass188_128.anInt5309 = 2;
			Static269.aClass188_72.anInt5309 = 2;
			Static1.aClass188_1.anInt5309 = 2;
			Static317.aClass188_87.anInt5309 = 2;
			Static168.method2626(false, -1, -1, Static399.aClass167_Sub1_1.anInt5557);
			Static390.aString58 = Static354.aClass256_126.method5720(Static272.anInt7537);
			Static302.anInt4903 = 200;
			Static31.anInt3272 = 95;
		} else if (Static302.anInt4903 == 200) {
			Static243.method3669(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1091() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static37.method711();
		Static354.aClass87_1 = new Class87(Static303.aClass131_4);
		Static239.aClass179_1 = new Class179();
		if (Static343.aClass269_11 != Static293.aClass269_10) {
			Static34.aByteArrayArray1 = new byte[50][];
		}
		Static399.aClass167_Sub1_1 = new Class167_Sub1(Static303.aClass131_4);
		if (Static293.aClass269_10 == Static343.aClass269_11) {
			Static78.aString16 = this.getCodeBase().getHost();
			Static135.anInt2654 = 443;
			Static427.anInt7456 = 43594;
		} else if (Static371.method5224(Static343.aClass269_11)) {
			Static78.aString16 = this.getCodeBase().getHost();
			Static135.anInt2654 = Static213.anInt4106 + 50000;
			Static427.anInt7456 = Static213.anInt4106 + 40000;
		} else if (Static300.aClass269_9 == Static343.aClass269_11) {
			Static427.anInt7456 = Static213.anInt4106 + 40000;
			Static78.aString16 = "127.0.0.1";
			Static135.anInt2654 = Static213.anInt4106 + 50000;
		}
		Static373.aString7 = Static78.aString16;
		Static11.anInt311 = Static427.anInt7456;
		Static133.anInt2586 = Static135.anInt2654;
		Static276.anInt5074 = Static427.anInt7456;
		if (Static197.anInt3816 == 3) {
			Static62.anInt1710 = Static213.anInt4106;
		}
		if (Static389.aClass209_2 == Static107.aClass209_1) {
			Static32.aShortArray4 = Static76.aShortArray17;
			Static75.anInt1859 = 0;
			Static339.aShortArrayArray5 = Static334.aShortArrayArray4;
			Static174.aShortArrayArray3 = Static431.aShortArrayArray7;
			Static119.aShortArray27 = Static175.aShortArray44;
			Static243.aBoolean380 = true;
			Static166.anInt3219 = 16777215;
		} else {
			Static174.aShortArrayArray3 = Static110.aShortArrayArray1;
			Static32.aShortArray4 = Static42.aShortArray9;
			Static119.aShortArray27 = Static433.aShortArray104;
			Static339.aShortArrayArray5 = Static122.aShortArrayArray2;
		}
		Static401.aShortArray88 = Static94.aShortArray18 = Static238.aShortArray49 = Static219.aShortArray45 = new short[256];
		Static219.anInt4190 = Static11.anInt311;
		Static428.aClass52_1 = Static375.method5258(Static118.aCanvas3);
		Static304.aClass40_1 = Static396.method5441(Static118.aCanvas3);
		Static6.aClass170_1 = Static450.method6079();
		if (Static6.aClass170_1 != null) {
			Static6.aClass170_1.method5632(Static118.aCanvas3);
		}
		Static452.anInt7846 = Static197.anInt3816;
		try {
			if (Static303.aClass131_4.aClass224_4 != null) {
				Static307.aClass85_6 = new Class85(Static303.aClass131_4.aClass224_4, 5200, 0);
				for (@Pc(172) int local172 = 0; local172 < 30; local172++) {
					Static166.aClass85Array1[local172] = new Class85(Static303.aClass131_4.aClass224Array1[local172], 6000, 0);
				}
				Static227.aClass85_3 = new Class85(Static303.aClass131_4.aClass224_2, 6000, 0);
				Static398.aClass175_3 = new Class175(255, Static307.aClass85_6, Static227.aClass85_3, 500000);
				Static451.aClass85_2 = new Class85(Static303.aClass131_4.aClass224_3, 24, 0);
				Static303.aClass131_4.aClass224_2 = null;
				Static303.aClass131_4.aClass224_3 = null;
				Static303.aClass131_4.aClass224_4 = null;
				Static303.aClass131_4.aClass224Array1 = null;
			}
		} catch (@Pc(228) IOException local228) {
			Static227.aClass85_3 = null;
			Static398.aClass175_3 = null;
			Static307.aClass85_6 = null;
			Static451.aClass85_2 = null;
		}
		if (Static343.aClass269_11 != Static293.aClass269_10) {
			Static408.aBoolean598 = true;
		}
		Static431.aString68 = (Static107.aClass209_1 == Static407.aClass209_3 ? Static337.aClass256_120 : Static397.aClass256_143).method5720(Static272.anInt7537);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method1116() {
		@Pc(12) boolean local12 = Static239.aClass179_1.method4130();
		if (!local12) {
			this.method1110();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method1122() {
		Static305.anInt1351++;
		Static112.method1693(null, -1, -1);
		Static189.method2982(-1, null, -1);
		Static320.method6027();
		Static331.anInt5891++;
		for (@Pc(33) int local33 = 0; local33 < 32768; local33++) {
			@Pc(39) Class4_Sub2_Sub2_Sub2 local39 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local33];
			if (local39 != null) {
				@Pc(45) byte local45 = local39.aClass215_1.aByte79;
				if ((local45 & 0x1) != 0) {
					@Pc(53) int local53 = local39.method5118();
					@Pc(77) int local77;
					if ((local45 & 0x2) != 0 && local39.anInt6524 == 0 && Math.random() * 1000.0D < 10.0D) {
						local77 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(85) int local85 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local77 != 0 || local85 != 0) {
							@Pc(102) int local102 = local39.anIntArray436[0] + local77;
							if (local102 < 0) {
								local102 = 0;
							} else if (local102 > Static81.anInt1950 - local53 - 1) {
								local102 = Static81.anInt1950 - local53 - 1;
							}
							@Pc(137) int local137 = local85 + local39.anIntArray437[0];
							if (local137 < 0) {
								local137 = 0;
							} else if (local137 > Static171.anInt3288 - local53 - 1) {
								local137 = Static171.anInt3288 - local53 - 1;
							}
							@Pc(188) int local188 = Static408.method5530(0, local53, 0, local137, local39.anIntArray436[0], -1, local39.anIntArray437[0], Static332.aClass37Array1[local39.aByte92], Static150.anIntArray199, local53, Static174.anIntArray222, local102, local53, true);
							if (local188 > 0) {
								if (local188 > 9) {
									local188 = 9;
								}
								for (@Pc(199) int local199 = 0; local199 < local188; local199++) {
									local39.anIntArray436[local199] = Static174.anIntArray222[local188 - local199 - 1];
									local39.anIntArray437[local199] = Static150.anIntArray199[local188 - local199 - 1];
									local39.aByteArray181[local199] = 1;
								}
								local39.anInt6524 = local188;
							}
						}
					}
					Static323.method4619(local39, true);
					local77 = Static177.method2779(local39);
					Static205.method3170(Static279.anInt5105, local77, Static150.anInt2861, local39);
					Static95.method1597(local39);
				}
			}
		}
		if (Static398.anInt5978 == 0 && Static375.anInt6694 == 0) {
			if (Static65.anInt7824 == 2) {
				Static317.method4543();
			} else {
				Static180.method2819();
			}
			if (Static225.anInt4310 >> 7 < 14 || Static81.anInt1950 - 14 <= Static225.anInt4310 >> 7 || Static293.anInt5621 >> 7 < 14 || Static293.anInt5621 >> 7 >= Static171.anInt3288 - 14) {
				Static128.method1857();
			}
		}
		while (true) {
			@Pc(315) Class2_Sub14 local315;
			@Pc(320) Class41 local320;
			@Pc(328) Class41 local328;
			do {
				local315 = (Class2_Sub14) Static237.aClass265_37.method5995();
				if (local315 == null) {
					while (true) {
						do {
							local315 = (Class2_Sub14) Static275.aClass265_52.method5995();
							if (local315 == null) {
								while (true) {
									do {
										local315 = (Class2_Sub14) Static200.aClass265_55.method5995();
										if (local315 == null) {
											if (Static191.aClass41_7 != null) {
												Static119.method1743();
											}
											if (Static164.anInt3206 % 1500 == 0) {
												Static137.method1996();
											}
											Static166.method2606();
											if (Static442.aBoolean663 && Static256.aLong143 < Static208.method3182() - 60000L) {
												Static211.method3261();
												return;
											}
											return;
										}
										local320 = local315.aClass41_5;
										if (local320.anInt1683 < 0) {
											break;
										}
										local328 = Static160.method2564(local320.anInt1663);
									} while (local328 == null || local328.aClass41Array1 == null || local320.anInt1683 >= local328.aClass41Array1.length || local328.aClass41Array1[local320.anInt1683] != local320);
									Static290.method4227(local315);
								}
							}
							local320 = local315.aClass41_5;
							if (local320.anInt1683 < 0) {
								break;
							}
							local328 = Static160.method2564(local320.anInt1663);
						} while (local328 == null || local328.aClass41Array1 == null || local328.aClass41Array1.length <= local320.anInt1683 || local328.aClass41Array1[local320.anInt1683] != local320);
						Static290.method4227(local315);
					}
				}
				local320 = local315.aClass41_5;
				if (local320.anInt1683 < 0) {
					break;
				}
				local328 = Static160.method2564(local320.anInt1663);
			} while (local328 == null || local328.aClass41Array1 == null || local320.anInt1683 >= local328.aClass41Array1.length || local328.aClass41Array1[local320.anInt1683] != local320);
			Static290.method4227(local315);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1098() {
		if (Static297.anInt5339 == 1000) {
			return;
		}
		Static164.anInt3206++;
		if (Static164.anInt3206 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static83.anInt1994 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static411.aRandom1.setSeed((long) Static83.anInt1994);
		}
		if (Static164.anInt3206 % 50 == 0) {
			Static74.anInt1843 = Static300.anInt5373;
			Static300.anInt5373 = 0;
			Static259.anInt4838 = Static170.anInt3279;
			Static170.anInt3279 = 0;
		}
		this.method1116();
		if (Static451.aClass232_2 != null) {
			Static451.aClass232_2.method5334();
		}
		Static453.method6086();
		Static428.aClass52_1.method1349();
		Static304.aClass40_1.method1158();
		if (Static6.aClass170_1 != null) {
			@Pc(81) int local81 = Static6.aClass170_1.method5634();
			Static89.anInt2016 = local81;
		}
		if (Static387.aClass26_9 != null) {
			Static387.aClass26_9.method2250((int) Static208.method3182());
		}
		Static378.method5270();
		Static357.anInt3690 = 0;
		for (@Pc(98) Class42 local98 = Static428.aClass52_1.method1348(); local98 != null && Static357.anInt3690 < 128; local98 = Static428.aClass52_1.method1348()) {
			if (local98.method1203() != 1) {
				@Pc(109) char local109 = local98.method1201();
				if (!Static313.method4434() || local109 != '`' && local109 != '§') {
					Static347.aClass42Array1[Static357.anInt3690] = local98;
					Static357.anInt3690++;
				} else if (Static348.method4894()) {
					Static430.method5793();
				} else {
					Static209.method3226();
				}
			}
		}
		for (@Pc(159) Class2_Sub6 local159 = Static304.aClass40_1.method1160(); local159 != null; local159 = Static304.aClass40_1.method1160()) {
			@Pc(165) int local165 = local159.method774();
			if (local165 == -1) {
				Static384.aClass265_47.method5999(local159);
			} else if (Static48.method941(local165)) {
				Static36.aClass265_2.method5999(local159);
			}
			if (Static36.aClass265_2.method6002() > 10) {
				Static36.aClass265_2.method5995();
			}
		}
		if (Static348.method4894()) {
			Static222.method3418();
		}
		if (Static297.anInt5339 == 0) {
			this.method1114();
			Static236.method3588();
		} else if (Static297.anInt5339 == 5) {
			this.method1114();
			Static236.method3588();
		} else if (Static297.anInt5339 == 25 || Static297.anInt5339 == 28) {
			Static335.method1100();
		}
		if (Static297.anInt5339 == 10) {
			this.method1122();
			Static434.method5875();
			Static36.method655();
			Static240.method3638();
		} else if (Static297.anInt5339 == 30) {
			Static200.method5884();
		} else if (Static297.anInt5339 == 40) {
			Static240.method3638();
			if (Static33.anInt668 != -3 && Static33.anInt668 != 2 && Static33.anInt668 != 15) {
				Static89.method1492();
			}
		}
		Static302.method3959(Static387.aClass26_9);
		Static36.aClass265_2.method5995();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1126(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub20 local10 = new Class2_Sub20(arg0);
		while (true) {
			@Pc(18) int local18;
			@Pc(44) int local44;
			@Pc(39) int local39;
			label45: do {
				while (true) {
					while (true) {
						local18 = local10.method3737();
						if (local18 == 0) {
							return;
						}
						if (local18 == 1) {
							@Pc(110) int[] local110 = Static336.anIntArray384 = new int[6];
							local110[0] = local10.method3711();
							local110[1] = local10.method3711();
							local110[2] = local10.method3711();
							local110[3] = local10.method3711();
							local110[4] = local10.method3711();
							local110[5] = local10.method3711();
						} else {
							if (local18 != 4) {
								continue label45;
							}
							local39 = local10.method3737();
							Static46.anIntArray50 = new int[local39];
							for (local44 = 0; local44 < local39; local44++) {
								Static46.anIntArray50[local44] = local10.method3711();
								if (Static46.anIntArray50[local44] == 65535) {
									Static46.anIntArray50[local44] = -1;
								}
							}
						}
					}
				}
			} while (local18 != 5);
			local39 = local10.method3737();
			Static137.anIntArray147 = new int[local39];
			for (local44 = 0; local44 < local39; local44++) {
				Static137.anIntArray147[local44] = local10.method3711();
				if (Static137.anIntArray147[local44] == 65535) {
					Static137.anIntArray147[local44] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method1127(@OriginalArg(1) int arg0) {
		Static239.aClass179_1.anInt5124++;
		Static391.anInt6865 = 0;
		Static443.aClass128_9 = null;
		Static71.aClass199_3 = null;
		Static239.aClass179_1.anInt5123 = arg0;
	}
}
