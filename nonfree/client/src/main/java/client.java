import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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
				Static16.method286("argument count");
			}
			Static274.anInt5447 = Integer.parseInt(arg0[0]);
			Static123.anInt2856 = 2;
			if (arg0[1].equals("live")) {
				Static248.anInt2154 = 0;
			} else if (arg0[1].equals("rc")) {
				Static248.anInt2154 = 1;
			} else if (arg0[1].equals("wip")) {
				Static248.anInt2154 = 2;
			} else {
				Static16.method286("modewhat");
			}
			Static115.aBoolean396 = false;
			Static100.anInt2375 = Static270.method3462(arg0[2]);
			if (Static100.anInt2375 == -1) {
				if (arg0[2].equals("english")) {
					Static100.anInt2375 = 0;
				} else if (arg0[2].equals("german")) {
					Static100.anInt2375 = 1;
				} else {
					Static16.method286("language");
				}
			}
			Static255.method4020(Static100.anInt2375);
			Static219.aBoolean300 = false;
			Static154.aBoolean237 = false;
			if (arg0[3].equals("game0")) {
				Static162.anInt3614 = 0;
			} else if (arg0[3].equals("game1")) {
				Static162.anInt3614 = 1;
			} else {
				Static16.method286("game");
			}
			Static6.aString4 = "";
			Static30.anInt648 = 0;
			Static270.aBoolean287 = false;
			Static21.anInt460 = 0;
			@Pc(131) client local131 = new client();
			Static243.aClient1 = local131;
			local131.method791(Static248.anInt2154 + 32, Static162.anInt3614 == 1 ? "mechscape" : "runescape");
			Static72.aFrame1.setLocation(40, 40);
		} catch (@Pc(159) Exception local159) {
			Static183.method3240(local159, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method798() {
		@Pc(7) boolean local7 = Static217.aClass21_3.method552();
		if (!local7) {
			this.method810();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method788() {
		Static234.method3799();
		Static197.aClass80_3 = new Class80();
		Static217.aClass21_3 = new Class21();
		if (Static248.anInt2154 != 0) {
			Static2.aByteArrayArray1 = new byte[50][];
		}
		Static27.method4370(Static164.aClass102_2);
		if (Static123.anInt2856 == 0) {
			Static204.aString146 = this.getCodeBase().getHost();
			Static195.anInt6032 = 43594;
			Static284.anInt5624 = 443;
		} else if (Static123.anInt2856 == 1) {
			Static204.aString146 = this.getCodeBase().getHost();
			Static195.anInt6032 = Static274.anInt5447 + 40000;
			Static284.anInt5624 = Static274.anInt5447 + 50000;
		} else if (Static123.anInt2856 == 2) {
			Static204.aString146 = "127.0.0.1";
			Static284.anInt5624 = Static274.anInt5447 + 50000;
			Static195.anInt6032 = Static274.anInt5447 + 40000;
		}
		if (Static158.anInt3501 == 3 && Static123.anInt2856 != 2) {
			Static74.anInt1836 = Static274.anInt5447;
		}
		if (Static162.anInt3614 == 1) {
			Static293.aShortArray86 = Static33.aShortArray1;
			Static235.anInt4714 = 16777215;
			Static235.anInt4717 = 0;
			Static74.aShortArrayArray2 = Static4.aShortArrayArray1;
			Static249.aShortArrayArray8 = Static190.aShortArrayArray6;
			Static72.aBoolean117 = true;
			Static102.aShortArray16 = Static75.aShortArray11;
		} else {
			Static293.aShortArray86 = Static72.aShortArray10;
			Static102.aShortArray16 = Static239.aShortArray65;
			Static249.aShortArrayArray8 = Static153.aShortArrayArray5;
			Static74.aShortArrayArray2 = Static198.aShortArrayArray7;
		}
		Static259.anInt5136 = Static195.anInt6032;
		Static122.aString96 = Static204.aString146;
		Static276.anInt5458 = Static195.anInt6032;
		Static166.anInt3677 = Static276.anInt5458;
		Static285.anInt5646 = Static284.anInt5624;
		Static252.aShortArray67 = Static67.aShortArray9 = Static241.aShortArray66 = Static128.aShortArray26 = new short[256];
		Static306.method4637();
		Static311.method4692(Static227.aCanvas1);
		Static261.method4095(Static227.aCanvas1);
		Static179.aClass5_1 = Static15.method272();
		if (Static179.aClass5_1 != null) {
			Static179.aClass5_1.method3847(Static227.aCanvas1);
		}
		Static96.anInt2297 = Static158.anInt3501;
		try {
			if (Static164.aClass102_2.aClass110_3 != null) {
				Static271.aClass130_5 = new Class130(Static164.aClass102_2.aClass110_3, 5200, 0);
				for (@Pc(170) int local170 = 0; local170 < 29; local170++) {
					Static48.aClass130Array1[local170] = new Class130(Static164.aClass102_2.aClass110Array1[local170], 6000, 0);
				}
				Static141.aClass130_2 = new Class130(Static164.aClass102_2.aClass110_2, 6000, 0);
				Static201.aClass108_4 = new Class108(255, Static271.aClass130_5, Static141.aClass130_2, 500000);
				Static47.aClass130_1 = new Class130(Static164.aClass102_2.aClass110_1, 24, 0);
				Static164.aClass102_2.aClass110Array1 = null;
				Static164.aClass102_2.aClass110_2 = null;
				Static164.aClass102_2.aClass110_3 = null;
				Static164.aClass102_2.aClass110_1 = null;
			}
		} catch (@Pc(228) IOException local228) {
			Static141.aClass130_2 = null;
			Static271.aClass130_5 = null;
			Static201.aClass108_4 = null;
			Static47.aClass130_1 = null;
		}
		if (Static123.anInt2856 != 0) {
			Static193.aBoolean277 = true;
		}
		if (Static162.anInt3614 == 0) {
			Static35.aString47 = Static189.aString133;
		} else if (Static162.anInt3614 == 1) {
			Static35.aString47 = Static108.aString89;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method782()) {
			return;
		}
		Static274.anInt5447 = Integer.parseInt(this.getParameter("worldid"));
		Static123.anInt2856 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static123.anInt2856 < 0 || Static123.anInt2856 > 1) {
			Static123.anInt2856 = 0;
		}
		Static248.anInt2154 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static248.anInt2154 < 0 || Static248.anInt2154 > 2) {
			Static248.anInt2154 = 0;
		}
		@Pc(49) String local49 = this.getParameter("advertsuppressed");
		if (local49 != null && local49.equals("1")) {
			Static115.aBoolean396 = true;
		} else {
			Static115.aBoolean396 = false;
		}
		try {
			Static100.anInt2375 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(68) Exception local68) {
			Static100.anInt2375 = 0;
		}
		Static255.method4020(Static100.anInt2375);
		@Pc(77) String local77 = this.getParameter("objecttag");
		if (local77 != null && local77.equals("1")) {
			Static154.aBoolean237 = true;
		} else {
			Static154.aBoolean237 = false;
		}
		@Pc(94) String local94 = this.getParameter("js");
		if (local94 != null && local94.equals("1")) {
			Static219.aBoolean300 = true;
		} else {
			Static219.aBoolean300 = false;
		}
		@Pc(111) String local111 = this.getParameter("game");
		if (local111 != null && local111.equals("1")) {
			Static162.anInt3614 = 1;
		} else {
			Static162.anInt3614 = 0;
		}
		try {
			Static21.anInt460 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(130) Exception local130) {
			Static21.anInt460 = 0;
		}
		Static6.aString4 = this.getParameter("settings");
		if (Static6.aString4 == null) {
			Static6.aString4 = "";
		}
		@Pc(146) String local146 = this.getParameter("country");
		if (local146 != null) {
			try {
				Static30.anInt648 = Integer.parseInt(local146);
			} catch (@Pc(154) Exception local154) {
				Static30.anInt648 = 0;
			}
		}
		@Pc(160) String local160 = this.getParameter("haveie6");
		if (local160 != null && local160.equals("1")) {
			Static270.aBoolean287 = true;
		} else {
			Static270.aBoolean287 = false;
		}
		Static243.aClient1 = this;
		this.method785(Static248.anInt2154 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method783() {
		if (Static64.anInt1561 == 1000) {
			return;
		}
		Static268.anInt5236++;
		if (Static268.anInt5236 % 1000 == 1) {
			@Pc(31) GregorianCalendar local31 = new GregorianCalendar();
			Static187.anInt3990 = local31.get(11) * 600 + local31.get(12) * 10 + local31.get(13) / 6;
			Static273.aRandom1.setSeed((long) Static187.anInt3990);
		}
		this.method798();
		if (Static61.aClass41_1 != null) {
			Static61.aClass41_1.method1203();
		}
		Static198.method3394();
		Static220.method3662();
		Static3.method79();
		Static138.method2476();
		if (Static116.aBoolean184) {
			Static124.method2211();
		}
		if (Static179.aClass5_1 != null) {
			@Pc(86) int local86 = Static179.aClass5_1.method3852();
			Static55.anInt1397 = local86;
		}
		if (Static64.anInt1561 == 0) {
			this.method808();
			Static226.method4757();
		} else if (Static64.anInt1561 == 5) {
			this.method808();
			Static226.method4757();
		} else if (Static64.anInt1561 == 25 || Static64.anInt1561 == 28) {
			Static73.method1396();
		}
		if (Static64.anInt1561 == 10) {
			this.method813();
			Static219.method3631();
			Static50.method944();
			Static46.method854();
		} else if (Static64.anInt1561 == 30) {
			Static155.method2847();
		} else if (Static64.anInt1561 == 40) {
			Static46.method854();
			if (Static93.anInt2262 != -3) {
				if (Static93.anInt2262 == 15) {
					Static200.method3397();
				} else if (Static93.anInt2262 != 2) {
					Static11.method197();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method780() {
		if (Static64.anInt1561 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static70.method1356() / 1000000L - Static251.aLong182;
		Static251.aLong182 = Static70.method1356() / 1000000L;
		@Pc(26) boolean local26 = Static195.method4730();
		if (local26 && Static297.aBoolean384 && Static48.aClass43_2 != null) {
			Static48.aClass43_2.method2453();
		}
		if ((Static64.anInt1561 == 30 || Static64.anInt1561 == 10) && (Static269.aBoolean351 || Static72.aLong65 != 0L && Static221.method3670() > Static72.aLong65)) {
			Static260.method4091(Static141.method2503(), Static202.anInt2813, Static248.anInt2151, Static269.aBoolean351);
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static127.aFrame2 == null) {
			@Pc(74) Container local74;
			if (Static127.aFrame2 != null) {
				local74 = Static127.aFrame2;
			} else if (Static72.aFrame1 == null) {
				local74 = Static164.aClass102_2.anApplet1;
			} else {
				local74 = Static72.aFrame1;
			}
			local90 = local74.getSize().width;
			local94 = local74.getSize().height;
			if (Static72.aFrame1 == local74) {
				@Pc(100) Insets local100 = Static72.aFrame1.getInsets();
				local94 -= local100.bottom + local100.top;
				local90 -= local100.right + local100.left;
			}
			if (Static32.anInt875 != local90 || Static237.anInt4775 != local94) {
				if (Static158.aString122.startsWith("mac")) {
					Static32.anInt875 = local90;
					Static237.anInt4775 = local94;
				} else {
					Static234.method3799();
				}
				Static72.aLong65 = Static221.method3670() + 500L;
			}
		}
		if (Static127.aFrame2 != null && !Static72.aBoolean116 && (Static64.anInt1561 == 30 || Static64.anInt1561 == 10)) {
			Static260.method4091(Static119.anInt5242, -1, -1, false);
		}
		@Pc(168) boolean local168 = false;
		if (Static218.aBoolean298) {
			local168 = true;
			Static218.aBoolean298 = false;
		}
		if (local168) {
			Static30.method577();
		}
		if (Static116.aBoolean184) {
			for (local90 = 0; local90 < 100; local90++) {
				Static293.aBooleanArray23[local90] = true;
			}
		}
		if (Static64.anInt1561 == 0) {
			Static315.method4762(Static78.anInt438, Static293.aString201, null, local168);
		} else if (Static64.anInt1561 == 5) {
			Static270.method3459(Static237.aClass2_Sub8_Sub5_5, false);
		} else if (Static64.anInt1561 == 10) {
			Static259.method4086();
		} else if (Static64.anInt1561 == 25 || Static64.anInt1561 == 28) {
			if (Static47.anInt1184 == 1) {
				if (Static37.anInt948 < Static41.anInt1021) {
					Static37.anInt948 = Static41.anInt1021;
				}
				local90 = (Static37.anInt948 - Static41.anInt1021) * 50 / Static37.anInt948;
				Static63.method1183(Static269.aString179 + "<br>(" + local90 + "%)", false);
			} else if (Static47.anInt1184 == 2) {
				if (Static132.anInt3032 < Static287.anInt5650) {
					Static132.anInt3032 = Static287.anInt5650;
				}
				local90 = (Static132.anInt3032 - Static287.anInt5650) * 50 / Static132.anInt3032 + 50;
				Static63.method1183(Static269.aString179 + "<br>(" + local90 + "%)", false);
			} else {
				Static63.method1183(Static269.aString179, false);
			}
		} else if (Static64.anInt1561 == 30) {
			Static188.method4588(local18);
		} else if (Static64.anInt1561 == 40) {
			Static63.method1183(Static225.aString183 + "<br>" + Static251.aString168, false);
		}
		if (Static116.aBoolean184 && Static64.anInt1561 != 0) {
			Static116.method1951();
			for (local90 = 0; local90 < Static148.anInt3247; local90++) {
				Static214.aBooleanArray19[local90] = false;
			}
		} else {
			@Pc(378) Graphics local378;
			if ((Static64.anInt1561 == 30 || Static64.anInt1561 == 10) && Static270.anInt4253 == 0 && !local168) {
				try {
					local378 = Static227.aCanvas1.getGraphics();
					for (local94 = 0; local94 < Static148.anInt3247; local94++) {
						if (Static214.aBooleanArray19[local94]) {
							Static179.aClass3_1.method4444(Static83.anIntArray171[local94], Static153.anIntArray344[local94], local378, Static155.anIntArray352[local94], Static291.anIntArray537[local94]);
							Static214.aBooleanArray19[local94] = false;
						}
					}
				} catch (@Pc(413) Exception local413) {
					Static227.aCanvas1.repaint();
				}
			} else if (Static64.anInt1561 != 0) {
				try {
					local378 = Static227.aCanvas1.getGraphics();
					Static179.aClass3_1.method4440(local378);
					for (local94 = 0; local94 < Static148.anInt3247; local94++) {
						Static214.aBooleanArray19[local94] = false;
					}
				} catch (@Pc(446) Exception local446) {
					Static227.aCanvas1.repaint();
				}
			}
		}
		if (Static206.aBoolean293) {
			Static57.method1112();
		}
		if (Static128.aBoolean205 && Static64.anInt1561 == 10 && Static303.anInt5868 != -1) {
			Static128.aBoolean205 = false;
			Static108.method1847(Static164.aClass102_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method806(@OriginalArg(0) byte[] arg0) {
		@Pc(16) Class2_Sub16 local16 = new Class2_Sub16(arg0);
		while (true) {
			@Pc(20) int local20;
			do {
				while (true) {
					local20 = local16.method2146();
					if (local20 == 0) {
						return;
					}
					if (local20 != 1) {
						break;
					}
					@Pc(73) int[] local73 = Static2.anIntArray13 = new int[6];
					local73[0] = local16.method2130();
					local73[1] = local16.method2130();
					local73[2] = local16.method2130();
					local73[3] = local16.method2130();
					local73[4] = local16.method2130();
					local73[5] = local16.method2130();
				}
			} while (local20 != 4);
			@Pc(35) int local35 = local16.method2146();
			Static34.anIntArray77 = new int[local35];
			for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
				Static34.anIntArray77[local40] = local16.method2130();
				if (Static34.anIntArray77[local40] == 65535) {
					Static34.anIntArray77[local40] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method808() {
		if (!Static128.aBoolean205) {
			label259: while (true) {
				do {
					if (!Static264.method4162()) {
						break label259;
					}
				} while (Static305.aChar3 != 's' && Static305.aChar3 != 'S');
				Static128.aBoolean205 = true;
			}
		}
		@Pc(38) int local38;
		if (Static83.anInt1960 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(41) long local41 = Static221.method3670();
			if (Static43.aLong34 == 0L) {
				Static43.aLong34 = local41;
			}
			if (local38 > 16384 && local41 - Static43.aLong34 < 5000L) {
				if (local41 - Static291.aLong200 > 1000L) {
					System.gc();
					Static291.aLong200 = local41;
				}
				Static78.anInt438 = 5;
				Static293.aString201 = Static89.aString77;
			} else {
				Static83.anInt1960 = 10;
				Static293.aString201 = Static206.aString147;
				Static78.anInt438 = 5;
			}
			return;
		}
		@Pc(89) int local89;
		if (Static83.anInt1960 == 10) {
			for (local89 = 0; local89 < 4; local89++) {
				Static89.aClass154Array1[local89] = new Class154(104, 104);
			}
			Static83.anInt1960 = 30;
			Static78.anInt438 = 10;
			Static293.aString201 = Static174.aString129;
		} else if (Static83.anInt1960 == 30) {
			if (Static61.aClass41_1 == null) {
				Static61.aClass41_1 = new Class41(Static217.aClass21_3, Static197.aClass80_3);
			}
			if (Static61.aClass41_1.method1206()) {
				Static101.aClass42_27 = Static166.method3027(false, true, true, 0);
				Static281.aClass42_102 = Static166.method3027(false, true, true, 1);
				Static161.aClass42_47 = Static166.method3027(true, false, true, 2);
				Static269.aClass42_90 = Static166.method3027(false, true, true, 3);
				Static185.aClass42_101 = Static166.method3027(false, true, true, 4);
				Static200.aClass42_61 = Static166.method3027(true, true, true, 5);
				Static251.aClass42_77 = Static166.method3027(true, true, false, 6);
				Static290.aClass42_105 = Static166.method3027(false, true, true, 7);
				Static121.aClass42_32 = Static166.method3027(false, true, true, 8);
				Static70.aClass42_20 = Static166.method3027(false, true, true, 9);
				Static274.aClass42_93 = Static166.method3027(false, true, true, 10);
				Static277.aClass42_96 = Static166.method3027(false, true, true, 11);
				Static170.aClass42_48 = Static166.method3027(false, true, true, 12);
				Static256.aClass42_79 = Static166.method3027(false, true, true, 13);
				Static19.aClass42_6 = Static166.method3027(false, true, false, 14);
				Static183.aClass42_53 = Static166.method3027(false, true, true, 15);
				Static189.aClass42_58 = Static166.method3027(false, true, true, 16);
				Static285.aClass42_103 = Static166.method3027(false, true, true, 17);
				Static199.aClass42_64 = Static166.method3027(false, true, true, 18);
				Static153.aClass42_43 = Static166.method3027(false, true, true, 19);
				Static151.aClass42_41 = Static166.method3027(false, true, true, 20);
				Static64.aClass42_17 = Static166.method3027(false, true, true, 21);
				Static312.aClass42_81 = Static166.method3027(false, true, true, 22);
				Static278.aClass42_98 = Static166.method3027(true, true, true, 23);
				Static239.aClass42_76 = Static166.method3027(false, true, true, 24);
				Static39.aClass42_12 = Static166.method3027(false, true, true, 25);
				Static195.aClass42_107 = Static166.method3027(true, true, true, 26);
				Static230.aClass42_73 = Static166.method3027(false, true, true, 27);
				Static234.aClass42_74 = Static166.method3027(true, true, true, 28);
				Static83.anInt1960 = 40;
				Static293.aString201 = Static29.aString27;
				Static78.anInt438 = 15;
			} else {
				Static78.anInt438 = 12;
				Static293.aString201 = Static134.aString108;
			}
		} else if (Static83.anInt1960 == 40) {
			local89 = 0;
			for (local38 = 0; local38 < 29; local38++) {
				local89 += Static90.aClass31_Sub1Array2[local38].method1418() * Static26.anIntArray453[local38] / 100;
			}
			if (local89 == 100) {
				Static293.aString201 = Static85.aString68;
				Static78.anInt438 = 20;
				Static284.method4438(Static121.aClass42_32);
				Static61.method1171(Static121.aClass42_32);
				Static161.method2971(Static121.aClass42_32);
				Static83.anInt1960 = 41;
			} else {
				if (local89 != 0) {
					Static293.aString201 = Static257.aString169 + local89 + "%";
				}
				Static78.anInt438 = 20;
			}
		} else if (Static83.anInt1960 == 41) {
			if (Static234.aClass42_74.method1266()) {
				this.method806(Static234.aClass42_74.method1259(1));
				Static78.anInt438 = 25;
				Static293.aString201 = Static131.aString102;
				Static83.anInt1960 = 45;
			} else {
				Static293.aString201 = Static213.aString148 + Static234.aClass42_74.method1260() + "%";
				Static78.anInt438 = 25;
			}
		} else if (Static83.anInt1960 == 45) {
			Static226.method4758(Static49.aBoolean87);
			Static53.aClass2_Sub3_Sub1_4 = new Class2_Sub3_Sub1();
			Static53.aClass2_Sub3_Sub1_4.method196();
			Static48.aClass43_2 = Static294.method4509(Static164.aClass102_2, Static227.aCanvas1, 22050, 0);
			Static48.aClass43_2.method2445(Static53.aClass2_Sub3_Sub1_4);
			Static243.method3872(Static53.aClass2_Sub3_Sub1_4, Static183.aClass42_53, Static19.aClass42_6, Static185.aClass42_101);
			Static22.aClass43_1 = Static294.method4509(Static164.aClass102_2, Static227.aCanvas1, 2048, 1);
			Static173.aClass2_Sub3_Sub4_2 = new Class2_Sub3_Sub4();
			Static22.aClass43_1.method2445(Static173.aClass2_Sub3_Sub4_2);
			Static99.aClass23_1 = new Class23(22050, Static107.anInt2456);
			Static64.anInt1562 = Static251.aClass42_77.method1254("scape main");
			Static78.anInt438 = 30;
			Static83.anInt1960 = 50;
			Static293.aString201 = Static312.aString171;
		} else if (Static83.anInt1960 == 50) {
			local89 = Static45.method1410(Static256.aClass42_79, Static121.aClass42_32);
			local38 = Static306.method4635();
			if (local89 < local38) {
				Static78.anInt438 = 35;
				Static293.aString201 = Static178.aString180 + local89 * 100 / local38 + "%";
			} else {
				Static83.anInt1960 = 60;
				Static78.anInt438 = 35;
				Static293.aString201 = Static107.aString87;
			}
		} else if (Static83.anInt1960 == 60) {
			local89 = Static249.method3918(Static121.aClass42_32);
			local38 = Static19.method321();
			if (local89 >= local38) {
				Static83.anInt1960 = 65;
				Static293.aString201 = Static3.aString1;
				Static78.anInt438 = 40;
			} else {
				Static78.anInt438 = 40;
				Static293.aString201 = Static42.aString46 + local89 * 100 / local38 + "%";
			}
		} else if (Static83.anInt1960 == 65) {
			Static55.method1078(Static121.aClass42_32, Static256.aClass42_79);
			Static78.anInt438 = 45;
			Static293.aString201 = Static64.aString58;
			Static305.method4624(5);
			Static83.anInt1960 = 70;
		} else if (Static83.anInt1960 == 70) {
			Static161.aClass42_47.method1266();
			local89 = Static161.aClass42_47.method1260();
			Static189.aClass42_58.method1266();
			local89 += Static189.aClass42_58.method1260();
			Static285.aClass42_103.method1266();
			local89 += Static285.aClass42_103.method1260();
			Static199.aClass42_64.method1266();
			local89 += Static199.aClass42_64.method1260();
			Static153.aClass42_43.method1266();
			local89 += Static153.aClass42_43.method1260();
			Static151.aClass42_41.method1266();
			local89 += Static151.aClass42_41.method1260();
			Static64.aClass42_17.method1266();
			local89 += Static64.aClass42_17.method1260();
			Static312.aClass42_81.method1266();
			local89 += Static312.aClass42_81.method1260();
			Static239.aClass42_76.method1266();
			local89 += Static239.aClass42_76.method1260();
			Static39.aClass42_12.method1266();
			local89 += Static39.aClass42_12.method1260();
			Static230.aClass42_73.method1266();
			local89 += Static230.aClass42_73.method1260();
			if (local89 < 1100) {
				Static293.aString201 = Static78.aString19 + local89 / 11 + "%";
				Static78.anInt438 = 50;
			} else {
				Static208.method3492(Static161.aClass42_47);
				Static142.method2541(Static161.aClass42_47);
				Static262.method4103(Static161.aClass42_47);
				Static249.method3922(Static161.aClass42_47, Static290.aClass42_105);
				Static87.method1551(Static189.aClass42_58, Static290.aClass42_105);
				Static15.method275(Static290.aClass42_105, Static199.aClass42_64);
				Static275.method4323(Static206.aClass2_Sub8_Sub5_Sub1_1, Static290.aClass42_105, Static153.aClass42_43);
				Static198.method3391(Static161.aClass42_47);
				Static101.method1739(Static101.aClass42_27, Static281.aClass42_102, Static151.aClass42_41);
				Static257.method4040(Static161.aClass42_47);
				Static297.method4544(Static290.aClass42_105, Static64.aClass42_17);
				Static47.method885(Static312.aClass42_81);
				Static10.method159(Static161.aClass42_47);
				Static258.method4050(Static290.aClass42_105, Static269.aClass42_90, Static256.aClass42_79, Static121.aClass42_32);
				Static43.method819(Static161.aClass42_47);
				Static201.method3407(Static285.aClass42_103);
				Static25.method491(new Class153(), Static39.aClass42_12, Static239.aClass42_76);
				Static120.method1998(Static39.aClass42_12, Static239.aClass42_76);
				Static94.method1659(Static161.aClass42_47);
				Static280.method4386(Static161.aClass42_47);
				Static304.method4621(Static161.aClass42_47);
				Static12.method229(Static121.aClass42_32, Static161.aClass42_47);
				Static151.method2698(Static121.aClass42_32, Static161.aClass42_47);
				Static39.method730(Static161.aClass42_47, Static121.aClass42_32);
				Static78.anInt438 = 50;
				Static293.aString201 = Static220.aString154;
				Static197.method3387();
				Static83.anInt1960 = 80;
			}
		} else if (Static83.anInt1960 == 80) {
			local89 = Static159.method2933(Static121.aClass42_32);
			local38 = Static120.method2008();
			if (local38 > local89) {
				Static293.aString201 = Static148.aString112 + local89 * 100 / local38 + "%";
				Static78.anInt438 = 60;
			} else {
				Static253.method3982(Static121.aClass42_32);
				Static78.anInt438 = 60;
				Static293.aString201 = Static268.aString178;
				Static83.anInt1960 = 90;
			}
		} else if (Static83.anInt1960 == 90) {
			if (Static195.aClass42_107.method1266()) {
				@Pc(943) Class104_Sub1 local943 = new Class104_Sub1(Static70.aClass42_20, Static195.aClass42_107, Static121.aClass42_32, 20, !Static19.aBoolean30);
				Static1.method21(local943);
				if (Static178.anInt5291 == 1) {
					Static1.method7(0.9F);
				}
				if (Static178.anInt5291 == 2) {
					Static1.method7(0.8F);
				}
				if (Static178.anInt5291 == 3) {
					Static1.method7(0.7F);
				}
				if (Static178.anInt5291 == 4) {
					Static1.method7(0.6F);
				}
				Static78.anInt438 = 70;
				Static83.anInt1960 = 100;
				Static293.aString201 = Static242.aString164;
			} else {
				Static293.aString201 = Static148.aString111 + Static195.aClass42_107.method1260() + "%";
				Static78.anInt438 = 70;
			}
		} else if (Static83.anInt1960 == 100) {
			if (Static157.method2866(Static121.aClass42_32)) {
				Static83.anInt1960 = 110;
			}
		} else if (Static83.anInt1960 == 110) {
			Static137.aClass88_1 = new Class88();
			Static164.aClass102_2.method2893(10, Static137.aClass88_1);
			Static293.aString201 = Static151.aString113;
			Static78.anInt438 = 75;
			Static83.anInt1960 = 120;
		} else if (Static83.anInt1960 == 120) {
			if (Static274.aClass42_93.method1264("", "huffman")) {
				@Pc(1040) Class159 local1040 = new Class159(Static274.aClass42_93.method1252("huffman", ""));
				Static157.method2861(local1040);
				Static78.anInt438 = 80;
				Static293.aString201 = Static37.aString42;
				Static83.anInt1960 = 130;
			} else {
				Static78.anInt438 = 80;
				Static293.aString201 = Static203.aString144 + "0%";
			}
		} else if (Static83.anInt1960 == 130) {
			if (!Static269.aClass42_90.method1266()) {
				Static293.aString201 = Static30.aString28 + Static269.aClass42_90.method1260() * 3 / 4 + "%";
				Static78.anInt438 = 85;
			} else if (!Static170.aClass42_48.method1266()) {
				Static293.aString201 = Static30.aString28 + (Static170.aClass42_48.method1260() / 10 + 75) + "%";
				Static78.anInt438 = 85;
			} else if (!Static256.aClass42_79.method1266()) {
				Static293.aString201 = Static30.aString28 + (Static256.aClass42_79.method1260() / 20 + 85) + "%";
				Static78.anInt438 = 85;
			} else if (Static278.aClass42_98.method1277("details")) {
				Static250.method2524(Static278.aClass42_98);
				Static97.method1695(Static230.aClass42_73);
				Static289.method4485(Static290.aClass42_105);
				Static83.anInt1960 = 135;
				Static293.aString201 = Static34.aString38;
				Static78.anInt438 = 95;
			} else {
				Static293.aString201 = Static30.aString28 + (Static278.aClass42_98.method1268("details") / 10 + 90) + "%";
				Static78.anInt438 = 85;
			}
		} else if (Static83.anInt1960 == 135) {
			local89 = Static117.method1989();
			if (local89 == -1) {
				Static78.anInt438 = 95;
				Static293.aString201 = Static18.aString17;
			} else if (local89 == 7 || local89 == 9) {
				this.method795("worldlistfull");
				Static305.method4624(1000);
			} else if (Static218.aBoolean299) {
				Static83.anInt1960 = 140;
				Static293.aString201 = Static160.aString173;
				Static78.anInt438 = 96;
			} else {
				this.method795("worldlistio_" + local89);
				Static305.method4624(1000);
			}
		} else if (Static83.anInt1960 == 140) {
			Static11.anInt243 = Static269.aClass42_90.method1254("loginscreen");
			Static200.aClass42_61.method1274(false);
			Static251.aClass42_77.method1274(true);
			Static121.aClass42_32.method1274(true);
			Static256.aClass42_79.method1274(true);
			Static274.aClass42_93.method1274(true);
			Static269.aClass42_90.method1274(true);
			Static293.aString201 = Static151.aString114;
			Static83.anInt1960 = 150;
			Static78.anInt438 = 97;
			Static206.aBoolean293 = true;
		} else if (Static83.anInt1960 == 150) {
			Static286.method4458();
			if (Static128.aBoolean205) {
				Static262.anInt5150 = 0;
				Static119.anInt5242 = 0;
				Static272.anInt5414 = 0;
				Static214.anInt4370 = 0;
			}
			Static128.aBoolean205 = true;
			Static108.method1847(Static164.aClass102_2);
			Static260.method4091(Static119.anInt5242, -1, -1, false);
			Static293.aString201 = Static54.aString50;
			Static78.anInt438 = 100;
			Static83.anInt1960 = 160;
		} else if (Static83.anInt1960 == 160) {
			Static268.method4232(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method778() {
		if (Static116.aBoolean184) {
			Static116.method1937();
		}
		if (Static127.aFrame2 != null) {
			Static249.method3916(Static164.aClass102_2, Static127.aFrame2);
			Static127.aFrame2 = null;
		}
		if (Static137.aClass88_1 != null) {
			Static137.aClass88_1.aBoolean217 = false;
		}
		Static137.aClass88_1 = null;
		if (Static253.aClass34_3 != null) {
			Static253.aClass34_3.method1077();
			Static253.aClass34_3 = null;
		}
		Static142.method2540(Static227.aCanvas1);
		Static184.method3262(Static227.aCanvas1);
		if (Static179.aClass5_1 != null) {
			Static179.aClass5_1.method3848(Static227.aCanvas1);
		}
		Static11.method200();
		Static11.method228();
		Static179.aClass5_1 = null;
		if (Static48.aClass43_2 != null) {
			Static48.aClass43_2.method2439();
		}
		if (Static22.aClass43_1 != null) {
			Static22.aClass43_1.method2439();
		}
		Static217.aClass21_3.method550();
		Static197.aClass80_3.method2004();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method787() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method810() {
		if (Static237.anInt4779 < Static217.aClass21_3.anInt641) {
			Static42.anInt1107 = (Static217.aClass21_3.anInt641 - 1) * 50 * 5;
			if (Static259.anInt5136 == Static166.anInt3677) {
				Static166.anInt3677 = Static285.anInt5646;
			} else {
				Static166.anInt3677 = Static259.anInt5136;
			}
			if (Static42.anInt1107 > 3000) {
				Static42.anInt1107 = 3000;
			}
			if (Static217.aClass21_3.anInt641 >= 2 && Static217.aClass21_3.anInt640 == 6) {
				this.method795("js5connect_outofdate");
				Static64.anInt1561 = 1000;
				return;
			}
			if (Static217.aClass21_3.anInt641 >= 4 && Static217.aClass21_3.anInt640 == -1) {
				this.method795("js5crc");
				Static64.anInt1561 = 1000;
				return;
			}
			if (Static217.aClass21_3.anInt641 >= 4 && (Static64.anInt1561 == 0 || Static64.anInt1561 == 5)) {
				if (Static217.aClass21_3.anInt640 == 7 || Static217.aClass21_3.anInt640 == 9) {
					this.method795("js5connect_full");
				} else if (Static217.aClass21_3.anInt640 <= 0) {
					this.method795("js5io");
				} else {
					this.method795("js5connect");
				}
				Static64.anInt1561 = 1000;
				return;
			}
		}
		Static237.anInt4779 = Static217.aClass21_3.anInt641;
		if (Static42.anInt1107 > 0) {
			Static42.anInt1107--;
			return;
		}
		try {
			if (Static259.anInt5135 == 0) {
				Static166.aClass111_6 = Static164.aClass102_2.method2881(Static166.anInt3677, Static122.aString96);
				Static259.anInt5135++;
			}
			if (Static259.anInt5135 == 1) {
				if (Static166.aClass111_6.anInt3788 == 2) {
					this.method812(1000);
					return;
				}
				if (Static166.aClass111_6.anInt3788 == 1) {
					Static259.anInt5135++;
				}
			}
			if (Static259.anInt5135 == 2) {
				Static89.aClass34_2 = new Class34((Socket) Static166.aClass111_6.anObject4, Static164.aClass102_2);
				@Pc(200) Class2_Sub16 local200 = new Class2_Sub16(5);
				local200.method2168(15);
				local200.method2186(553);
				Static89.aClass34_2.method1076(local200.aByteArray17, 5);
				Static259.anInt5135++;
				Static173.aLong135 = Static221.method3670();
			}
			if (Static259.anInt5135 == 3) {
				if (Static64.anInt1561 == 0 || Static64.anInt1561 == 5 || Static89.aClass34_2.method1073() > 0) {
					@Pc(255) int local255 = Static89.aClass34_2.method1070();
					if (local255 != 0) {
						this.method812(local255);
						return;
					}
					Static259.anInt5135++;
				} else if (Static221.method3670() - Static173.aLong135 > 30000L) {
					this.method812(1001);
					return;
				}
			}
			if (Static259.anInt5135 == 4) {
				@Pc(291) boolean local291 = Static64.anInt1561 == 5 || Static64.anInt1561 == 10 || Static64.anInt1561 == 28;
				Static217.aClass21_3.method557(!local291, Static89.aClass34_2);
				Static89.aClass34_2 = null;
				Static259.anInt5135 = 0;
				Static166.aClass111_6 = null;
			}
		} catch (@Pc(308) IOException local308) {
			this.method812(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method812(@OriginalArg(1) int arg0) {
		Static166.aClass111_6 = null;
		Static217.aClass21_3.anInt640 = arg0;
		Static259.anInt5135 = 0;
		Static217.aClass21_3.anInt641++;
		Static89.aClass34_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method813() {
		for (Static49.anInt1230 = 0; Static264.method4162() && Static49.anInt1230 < 128; Static49.anInt1230++) {
			Static190.anIntArray398[Static49.anInt1230] = Static21.anInt465;
			Static126.anIntArray392[Static49.anInt1230] = Static305.aChar3;
		}
		Static247.anInt1733++;
		if (Static303.anInt5868 != -1) {
			Static180.method3216(0, Static120.anInt2649, Static303.anInt5868, Static60.anInt1510, 0, 0, 0);
		}
		Static291.anInt5632++;
		if (Static116.aBoolean184) {
			label198: for (@Pc(57) int local57 = 0; local57 < 32768; local57++) {
				@Pc(66) Class15_Sub2_Sub1 local66 = Static35.aClass15_Sub2_Sub1Array2[local57];
				if (local66 != null) {
					@Pc(73) byte local73 = local66.aClass188_1.aByte29;
					if ((local73 & 0x2) > 0 && local66.anInt5342 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							local66.anIntArray516[0] = (local66.anInt5358 >> 7) + local98;
							local66.anIntArray518[0] = (local66.anInt5371 >> 7) + local106;
							local66.aByteArray66[0] = 1;
							Static89.aClass154Array1[Static32.anInt876].method3912(local66.method4286(), local66.anInt5371 >> 7, local66.anInt5358 >> 7, false, false, local66.method4286(), 0);
							if (local66.anIntArray516[0] >= 0 && local66.anIntArray516[0] <= 104 - local66.method4286() && local66.anIntArray518[0] >= 0 && local66.anIntArray518[0] <= 104 - local66.method4286() && Static89.aClass154Array1[Static32.anInt876].method3921(local66.anIntArray516[0], local66.anInt5358 >> 7, local66.anIntArray518[0], local66.anInt5371 >> 7)) {
								if (local66.method4286() > 1) {
									for (@Pc(238) int local238 = local66.anIntArray516[0]; local66.anIntArray516[0] + local66.method4286() > local238; local238++) {
										for (@Pc(254) int local254 = local66.anIntArray518[0]; local66.anIntArray518[0] + local66.method4286() > local254; local254++) {
											if ((Static89.aClass154Array1[Static32.anInt876].anIntArrayArray32[local238][local254] & 0x2401FF) != 0) {
												continue label198;
											}
										}
									}
								}
								local66.anInt5342 = 1;
							}
						}
					}
					Static151.method2699(local66);
					Static122.method2049(local66);
					Static255.method4017(local66);
					Static89.aClass154Array1[Static32.anInt876].method3928(false, local66.anInt5358 >> 7, local66.method4286(), local66.method4286(), false, local66.anInt5371 >> 7);
				}
			}
		}
		if (!Static116.aBoolean184 && Static162.anInt3614 == 0) {
			Static6.method115();
		} else if (Static225.anInt5298 == 0 && Static259.anInt5132 == 0) {
			if (Static16.anInt342 == 2) {
				Static248.method1595();
			} else {
				Static31.method634();
			}
			if (Static80.anInt1911 >> 7 < 14 || Static80.anInt1911 >> 7 >= 90 || Static192.anInt4017 >> 7 < 14 || Static192.anInt4017 >> 7 >= 90) {
				Static39.method734();
			}
		}
		while (true) {
			@Pc(378) Class2_Sub12 local378;
			@Pc(384) Class56 local384;
			@Pc(396) Class56 local396;
			do {
				local378 = (Class2_Sub12) Static100.aClass44_11.method1353();
				if (local378 == null) {
					while (true) {
						do {
							local378 = (Class2_Sub12) Static149.aClass44_19.method1353();
							if (local378 == null) {
								while (true) {
									do {
										local378 = (Class2_Sub12) Static145.aClass44_18.method1353();
										if (local378 == null) {
											if (Static199.aClass56_19 != null) {
												Static291.method4446();
											}
											if (Static117.aClass111_2 != null && Static117.aClass111_2.anInt3788 == 1) {
												if (Static117.aClass111_2.anObject4 != null) {
													Static205.method3473(Static230.aString160, Static291.aBoolean371);
												}
												Static230.aString160 = null;
												Static117.aClass111_2 = null;
												Static291.aBoolean371 = false;
											}
											if (Static268.anInt5236 % 1500 == 0) {
												Static195.method4727();
											}
											return;
										}
										local384 = local378.aClass56_6;
										if (local384.anInt2056 < 0) {
											break;
										}
										local396 = Static38.method715(local384.anInt2030);
									} while (local396 == null || local396.aClass56Array1 == null || local384.anInt2056 >= local396.aClass56Array1.length || local384 != local396.aClass56Array1[local384.anInt2056]);
									Static204.method3467(local378);
								}
							}
							local384 = local378.aClass56_6;
							if (local384.anInt2056 < 0) {
								break;
							}
							local396 = Static38.method715(local384.anInt2030);
						} while (local396 == null || local396.aClass56Array1 == null || local384.anInt2056 >= local396.aClass56Array1.length || local396.aClass56Array1[local384.anInt2056] != local384);
						Static204.method3467(local378);
					}
				}
				local384 = local378.aClass56_6;
				if (local384.anInt2056 < 0) {
					break;
				}
				local396 = Static38.method715(local384.anInt2030);
			} while (local396 == null || local396.aClass56Array1 == null || local384.anInt2056 >= local396.aClass56Array1.length || local396.aClass56Array1[local384.anInt2056] != local384);
			Static204.method3467(local378);
		}
	}
}
