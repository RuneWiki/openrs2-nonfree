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
				Static111.method2248("argument count");
			}
			Static260.anInt4771 = Integer.parseInt(arg0[0]);
			Static189.anInt3601 = 2;
			if (arg0[1].equals("live")) {
				Static285.anInt5397 = 0;
			} else if (arg0[1].equals("rc")) {
				Static285.anInt5397 = 1;
			} else if (arg0[1].equals("wip")) {
				Static285.anInt5397 = 2;
			} else {
				Static111.method2248("modewhat");
			}
			Static247.anInt4265 = Static158.method5101(arg0[2]);
			if (Static247.anInt4265 == -1) {
				if (arg0[2].equals("english")) {
					Static247.anInt4265 = 0;
				} else if (arg0[2].equals("german")) {
					Static247.anInt4265 = 1;
				} else {
					Static111.method2248("language");
				}
			}
			Static341.method5619(Static247.anInt4265);
			Static148.aBoolean217 = false;
			Static23.aBoolean27 = false;
			if (arg0[3].equals("game0")) {
				Static105.anInt1941 = 0;
			} else if (arg0[3].equals("game1")) {
				Static105.anInt1941 = 1;
			} else {
				Static111.method2248("game");
			}
			Static106.aString74 = "";
			Static328.anInt6057 = Static105.anInt1941;
			Static316.anInt5861 = 0;
			Static41.anInt6384 = 0;
			@Pc(129) client local129 = new client();
			Static16.aClient1 = local129;
			local129.method740(Static105.anInt1941 == 1 ? "stellardawn" : "runescape", Static285.anInt5397 + 32);
			Static95.aFrame2.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static346.method5707(null, local154);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method730() {
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method750() {
		if (Static124.aClass113_1.anInt2953 > Static172.anInt3234) {
			Static96.anInt1772 = (Static124.aClass113_1.anInt2953 * 50 - 50) * 5;
			if (Static253.anInt4714 == Static309.anInt5826) {
				Static253.anInt4714 = Static47.anInt914;
			} else {
				Static253.anInt4714 = Static309.anInt5826;
			}
			if (Static96.anInt1772 > 3000) {
				Static96.anInt1772 = 3000;
			}
			if (Static124.aClass113_1.anInt2953 >= 2 && Static124.aClass113_1.anInt2952 == 6) {
				this.method728("js5connect_outofdate");
				Static129.anInt2374 = 1000;
				return;
			}
			if (Static124.aClass113_1.anInt2953 >= 4 && Static124.aClass113_1.anInt2952 == -1) {
				this.method728("js5crc");
				Static129.anInt2374 = 1000;
				return;
			}
			if (Static124.aClass113_1.anInt2953 >= 4 && (Static129.anInt2374 == 0 || Static129.anInt2374 == 5)) {
				if (Static124.aClass113_1.anInt2952 == 7 || Static124.aClass113_1.anInt2952 == 9) {
					this.method728("js5connect_full");
				} else if (Static124.aClass113_1.anInt2952 <= 0) {
					this.method728("js5io");
				} else {
					this.method728("js5connect");
				}
				Static129.anInt2374 = 1000;
				return;
			}
		}
		Static172.anInt3234 = Static124.aClass113_1.anInt2953;
		if (Static96.anInt1772 > 0) {
			Static96.anInt1772--;
			return;
		}
		try {
			if (Static329.anInt6094 == 0) {
				Static77.aClass196_2 = Static308.aClass206_5.method5525(Static253.anInt4714, Static239.aString304);
				Static329.anInt6094++;
			}
			if (Static329.anInt6094 == 1) {
				if (Static77.aClass196_2.anInt5851 == 2) {
					this.method753(1000);
					return;
				}
				if (Static77.aClass196_2.anInt5851 == 1) {
					Static329.anInt6094++;
				}
			}
			if (Static329.anInt6094 == 2) {
				Static3.aClass11_1 = new Class11((Socket) Static77.aClass196_2.anObject8, Static308.aClass206_5);
				@Pc(189) Class6_Sub10 local189 = new Class6_Sub10(5);
				local189.method3968(15);
				local189.method3976(558);
				Static3.aClass11_1.method158(local189.aByteArray67, 5);
				Static329.anInt6094++;
				Static27.aLong25 = Static245.method4300();
			}
			if (Static329.anInt6094 == 3) {
				if (Static129.anInt2374 == 0 || Static129.anInt2374 == 5 || Static3.aClass11_1.method160() > 0) {
					@Pc(232) int local232 = Static3.aClass11_1.method167();
					if (local232 != 0) {
						this.method753(local232);
						return;
					}
					Static329.anInt6094++;
				} else if (Static245.method4300() - Static27.aLong25 > 30000L) {
					this.method753(1001);
					return;
				}
			}
			if (Static329.anInt6094 == 4) {
				@Pc(282) boolean local282 = Static129.anInt2374 == 5 || Static129.anInt2374 == 10 || Static129.anInt2374 == 28;
				Static124.aClass113_1.method3129(!local282, Static3.aClass11_1);
				Static77.aClass196_2 = null;
				Static329.anInt6094 = 0;
				Static3.aClass11_1 = null;
			}
		} catch (@Pc(299) IOException local299) {
			this.method753(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method744() {
		if (Static129.anInt2374 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static349.method5745() / 1000000L - Static238.aLong169;
		Static238.aLong169 = Static349.method5745() / 1000000L;
		@Pc(24) boolean local24 = Static102.method4772();
		if (local24 && Static40.aBoolean54 && Static292.aClass34_1 != null) {
			Static292.aClass34_1.method5829();
		}
		if (Static129.anInt2374 == 30 || Static129.anInt2374 == 10) {
			if (Static76.aLong100 != 0L && Static76.aLong100 < Static245.method4300()) {
				Static54.method944(false, Static285.anInt5393, Static137.method2629(), Static91.anInt2907);
			} else if (Static289.aClass81_7.method2951() && Static182.aBoolean246) {
				Static3.method44();
			}
		}
		@Pc(87) int local87;
		if (Static90.aFrame1 == null) {
			@Pc(75) Container local75;
			if (Static95.aFrame2 == null) {
				local75 = Static308.aClass206_5.anApplet1;
			} else {
				local75 = Static95.aFrame2;
			}
			@Pc(83) int local83 = local75.getSize().width;
			local87 = local75.getSize().height;
			if (local75 == Static95.aFrame2) {
				@Pc(93) Insets local93 = Static95.aFrame2.getInsets();
				local87 -= local93.top + local93.bottom;
				local83 -= local93.right + local93.left;
			}
			if (Static92.anInt1689 != local83 || local87 != Static99.anInt6127) {
				if (Static289.aClass81_7 == null || Static289.aClass81_7.method2986()) {
					Static230.method4095();
				} else {
					Static92.anInt1689 = local83;
					Static99.anInt6127 = local87;
				}
				Static76.aLong100 = Static245.method4300() + 500L;
			}
		}
		if (Static90.aFrame1 != null && !Static68.aBoolean298 && (Static129.anInt2374 == 30 || Static129.anInt2374 == 10)) {
			Static54.method944(false, -1, Static182.anInt3432, -1);
		}
		@Pc(157) boolean local157 = false;
		if (Static308.aBoolean391) {
			local157 = true;
			Static308.aBoolean391 = false;
		}
		if (local157) {
			Static66.method1126();
		}
		if (Static289.aClass81_7 != null && Static289.aClass81_7.method2981() || Static137.method2629() != 1) {
			Static205.method5709();
		}
		if (Static129.anInt2374 == 0) {
			Static136.method2604(Static94.aColorArray1[Static328.anInt6057], Static341.aColorArray3[Static328.anInt6057], Static143.aString122, Static161.anInt3047, Static189.aColorArray2[Static328.anInt6057], local157);
		} else if (Static129.anInt2374 == 5) {
			Static303.method5212(Static94.aColorArray1[Static328.anInt6057].getRGB(), Static289.aClass81_7, Static189.aColorArray2[Static328.anInt6057].getRGB(), local157 | Static289.aClass81_7.method2981(), Static341.aColorArray3[Static328.anInt6057].getRGB(), Static309.aClass30_5);
		} else if (Static129.anInt2374 == 10) {
			Static156.method5551();
		} else if (Static129.anInt2374 == 25 || Static129.anInt2374 == 28) {
			if (Static22.anInt360 == 1) {
				if (Static67.anInt1246 > Static27.anInt535) {
					Static27.anInt535 = Static67.anInt1246;
				}
				local87 = (Static27.anInt535 - Static67.anInt1246) * 50 / Static27.anInt535;
				Static113.method2274(true, Static171.aString133 + "<br>(" + local87 + "%)", Static298.aClass30_4);
			} else if (Static22.anInt360 == 2) {
				if (Static145.anInt2603 < Static15.anInt290) {
					Static145.anInt2603 = Static15.anInt290;
				}
				local87 = (Static145.anInt2603 - Static15.anInt290) * 50 / Static145.anInt2603 + 50;
				Static113.method2274(true, Static171.aString133 + "<br>(" + local87 + "%)", Static298.aClass30_4);
			} else {
				Static113.method2274(true, Static171.aString133, Static298.aClass30_4);
			}
		} else if (Static129.anInt2374 == 30) {
			Static77.method1336(local16);
		} else if (Static129.anInt2374 == 40) {
			Static113.method2274(true, Static125.aString93 + "<br>" + Static41.aString308, Static298.aClass30_4);
		}
		if (Static239.anInt6343 == 3) {
			for (local87 = 0; local87 < Static25.anInt504; local87++) {
				@Pc(373) Rectangle local373 = Class44.aRectangleArray21[local87];
				if (Static162.aBooleanArray23[local87]) {
					Static289.aClass81_7.method3017(local373.height, -1996553985, local373.width, local373.x, local373.y);
				} else if (Static120.aBooleanArray20[local87]) {
					Static289.aClass81_7.method3017(local373.height, -1996554240, local373.width, local373.x, local373.y);
				}
			}
		}
		if (Static155.method4929()) {
			Static312.method5291(Static289.aClass81_7);
		}
		if ((Static129.anInt2374 == 30 || Static129.anInt2374 == 10) && Static239.anInt6343 == 0 && Static137.method2629() == 1 && !local157 && Static332.aString293.equals("1.1")) {
			local87 = 0;
			for (@Pc(466) int local466 = 0; local466 < Static25.anInt504; local466++) {
				if (Static120.aBooleanArray20[local466]) {
					Static120.aBooleanArray20[local466] = false;
					Static222.aRectangleArray13[local87++] = Class44.aRectangleArray21[local466];
				}
			}
			Static289.aClass81_7.method3009(Static222.aRectangleArray13, local87);
		} else if (Static129.anInt2374 != 0) {
			Static289.aClass81_7.method3030();
			for (local87 = 0; local87 < Static25.anInt504; local87++) {
				Static120.aBooleanArray20[local87] = false;
			}
		}
		if (Static275.aBoolean361) {
			Static165.method5481();
		}
		if (Static276.aBoolean363 && Static129.anInt2374 == 10 && Static62.anInt1131 != -1) {
			Static276.aBoolean363 = false;
			Static71.method1264(Static308.aClass206_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method735() {
		if (Static129.anInt2374 == 1000) {
			return;
		}
		Static76.anInt2853++;
		if (Static76.anInt2853 % 1000 == 1) {
			@Pc(30) GregorianCalendar local30 = new GregorianCalendar();
			Static96.anInt1771 = local30.get(11) * 600 + local30.get(12) * 10 + local30.get(13) / 6;
			Static88.aRandom1.setSeed((long) Static96.anInt1771);
		}
		this.method760();
		if (Static345.aClass124_1 != null) {
			Static345.aClass124_1.method3321();
		}
		Static278.method5285();
		Static24.method359();
		Static150.method2944();
		Static49.method842();
		if (Static289.aClass81_7 != null) {
			Static289.aClass81_7.method3026((int) Static245.method4300());
		}
		if (Static74.aClass94_1 != null) {
			@Pc(82) int local82 = Static74.aClass94_1.method5162();
			Static346.anInt6269 = local82;
		}
		Static295.method5048();
		if (Static129.anInt2374 == 0) {
			this.method758();
			Static303.method5210();
		} else if (Static129.anInt2374 == 5) {
			this.method758();
			Static303.method5210();
		} else if (Static129.anInt2374 == 25 || Static129.anInt2374 == 28) {
			Static191.method3584();
		}
		if (Static129.anInt2374 == 10) {
			this.method756();
			Static236.method2522();
			Static219.method3903();
			Static211.method3764();
		} else if (Static129.anInt2374 == 30) {
			Static111.method2247();
		} else if (Static129.anInt2374 == 40) {
			Static211.method3764();
			if (Static24.anInt400 != -3) {
				if (Static24.anInt400 == 15) {
					Static210.method3754();
				} else if (Static24.anInt400 != 2) {
					Static63.method1030();
				}
			}
		}
		Static151.method3074(Static289.aClass81_7);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method753(@OriginalArg(0) int arg0) {
		Static329.anInt6094 = 0;
		Static77.aClass196_2 = null;
		Static3.aClass11_1 = null;
		Static124.aClass113_1.anInt2952 = arg0;
		Static124.aClass113_1.anInt2953++;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method741()) {
			return;
		}
		Static260.anInt4771 = Integer.parseInt(this.getParameter("worldid"));
		Static189.anInt3601 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static189.anInt3601 < 0 || Static189.anInt3601 > 1) {
			Static189.anInt3601 = 0;
		}
		Static285.anInt5397 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static285.anInt5397 < 0 || Static285.anInt5397 > 2) {
			Static285.anInt5397 = 0;
		}
		try {
			Static247.anInt4265 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(52) Exception local52) {
			Static247.anInt4265 = 0;
		}
		Static341.method5619(Static247.anInt4265);
		@Pc(61) String local61 = this.getParameter("objecttag");
		if (local61 != null && local61.equals("1")) {
			Static148.aBoolean217 = true;
		} else {
			Static148.aBoolean217 = false;
		}
		@Pc(77) String local77 = this.getParameter("js");
		if (local77 != null && local77.equals("1")) {
			Static23.aBoolean27 = true;
		} else {
			Static23.aBoolean27 = false;
		}
		@Pc(93) String local93 = this.getParameter("game");
		if (local93 != null && local93.equals("1")) {
			Static105.anInt1941 = 1;
		} else {
			Static105.anInt1941 = 0;
		}
		try {
			Static41.anInt6384 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(112) Exception local112) {
			Static41.anInt6384 = 0;
		}
		Static298.aString254 = this.getParameter("quiturl");
		Static106.aString74 = this.getParameter("settings");
		if (Static106.aString74 == null) {
			Static106.aString74 = "";
		}
		@Pc(130) String local130 = this.getParameter("country");
		if (local130 != null) {
			try {
				Static316.anInt5861 = Integer.parseInt(local130);
			} catch (@Pc(137) Exception local137) {
				Static316.anInt5861 = 0;
			}
		}
		Static328.anInt6057 = Integer.parseInt(this.getParameter("colourid"));
		if (Static328.anInt6057 < 0 || Static189.aColorArray2.length <= Static328.anInt6057) {
			Static328.anInt6057 = 0;
		}
		Static16.aClient1 = this;
		this.method738(Static285.anInt5397 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method742() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static230.method4095();
		Static176.aClass99_2 = new Class99(Static308.aClass206_5);
		Static124.aClass113_1 = new Class113();
		if (Static285.anInt5397 != 0) {
			Static5.aByteArrayArray1 = new byte[50][];
		}
		Static80.method5171(Static308.aClass206_5);
		if (Static189.anInt3601 == 0) {
			Static133.aString102 = this.getCodeBase().getHost();
			Static203.anInt3732 = 443;
			Static240.anInt4008 = 43594;
		} else if (Static189.anInt3601 == 1) {
			Static133.aString102 = this.getCodeBase().getHost();
			Static240.anInt4008 = Static260.anInt4771 + 40000;
			Static203.anInt3732 = Static260.anInt4771 + 50000;
		} else if (Static189.anInt3601 == 2) {
			Static240.anInt4008 = Static260.anInt4771 + 40000;
			Static133.aString102 = "127.0.0.1";
			Static203.anInt3732 = Static260.anInt4771 + 50000;
		}
		Static239.aString304 = Static133.aString102;
		Static137.anInt2483 = Static240.anInt4008;
		Static47.anInt914 = Static203.anInt3732;
		Static309.anInt5826 = Static240.anInt4008;
		if (Static105.anInt1941 == 1) {
			Static176.aBoolean237 = true;
			Static191.aShortArrayArray32 = Static216.aShortArrayArray41;
			Static57.anInt1095 = 16777215;
			Static158.anInt5619 = 0;
			Static318.aShortArray113 = Static316.aShortArray112;
			Static230.aShortArray76 = Static334.aShortArray114;
			Static263.aShortArrayArray46 = Static185.aShortArrayArray63;
		} else {
			Static230.aShortArray76 = Static187.aShortArray68;
			Static191.aShortArrayArray32 = Static43.aShortArrayArray13;
			Static263.aShortArrayArray46 = Static185.aShortArrayArray62;
			Static318.aShortArray113 = Static295.aShortArray111;
		}
		Static253.anInt4714 = Static137.anInt2483;
		if (Static332.anInt6108 == 3) {
			Static181.anInt3403 = Static260.anInt4771;
		}
		Static73.aShortArray39 = Static287.aShortArray109 = Static212.aShortArray70 = Static289.aShortArray110 = new short[256];
		Static110.method2220();
		Static9.method163(Static354.aCanvas5);
		Static110.method2222(Static354.aCanvas5);
		Static74.aClass94_1 = Static131.method2542();
		if (Static74.aClass94_1 != null) {
			Static74.aClass94_1.method5163(Static354.aCanvas5);
		}
		Static31.anInt585 = Static332.anInt6108;
		try {
			if (Static308.aClass206_5.aClass201_2 != null) {
				Static268.aClass174_3 = new Class174(Static308.aClass206_5.aClass201_2, 5200, 0);
				for (@Pc(166) int local166 = 0; local166 < 29; local166++) {
					Static265.aClass174Array1[local166] = new Class174(Static308.aClass206_5.aClass201Array1[local166], 6000, 0);
				}
				Static7.aClass174_1 = new Class174(Static308.aClass206_5.aClass201_4, 6000, 0);
				Static260.aClass197_3 = new Class197(255, Static268.aClass174_3, Static7.aClass174_1, 500000);
				Static207.aClass174_2 = new Class174(Static308.aClass206_5.aClass201_3, 24, 0);
				Static308.aClass206_5.aClass201_3 = null;
				Static308.aClass206_5.aClass201Array1 = null;
				Static308.aClass206_5.aClass201_4 = null;
				Static308.aClass206_5.aClass201_2 = null;
			}
		} catch (@Pc(224) IOException local224) {
			Static260.aClass197_3 = null;
			Static268.aClass174_3 = null;
			Static207.aClass174_2 = null;
			Static7.aClass174_1 = null;
		}
		if (Static105.anInt1941 == 0) {
			Static51.aString40 = Static334.aString295;
		} else if (Static105.anInt1941 == 1) {
			Static51.aString40 = Static312.aString269;
		}
		if (Static189.anInt3601 != 0) {
			Static28.aBoolean38 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method756() {
		Static210.anInt3833 = 0;
		while (Static237.method4200() && Static210.anInt3833 < 128) {
			if (!Static46.method773() || Static156.aChar10 != '`' && Static156.aChar10 != '§') {
				Static60.anIntArray125[Static210.anInt3833] = Static67.anInt1255;
				Static323.anIntArray680[Static210.anInt3833] = Static156.aChar10;
				Static210.anInt3833++;
			} else if (Static155.method4929()) {
				Static292.method4996();
			} else {
				Static273.method5575();
			}
		}
		if (Static155.method4929()) {
			Static38.method655();
		}
		Static133.anInt2448++;
		Static44.method765(null, -1, -1);
		Static187.method3524(-1, null, -1);
		if (Static62.anInt1131 != -1) {
			Static98.method2028(0, 0, 0, Static209.anInt3815, Static94.anInt1731, 0, Static62.anInt1131);
		}
		Static234.anInt36++;
		for (@Pc(95) int local95 = 0; local95 < 32768; local95++) {
			@Pc(101) Class44_Sub4_Sub4_Sub2 local101 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local95];
			if (local101 != null) {
				@Pc(107) byte local107 = local101.aClass18_1.aByte4;
				if ((local107 & 0x1) != 0) {
					@Pc(118) int local118 = local101.method4714();
					@Pc(142) int local142;
					if ((local107 & 0x2) != 0 && local101.anInt5156 == 0 && Math.random() * 1000.0D < 10.0D) {
						local142 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(150) int local150 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local142 != 0 || local150 != 0) {
							@Pc(164) int local164 = local142 + local101.anIntArray560[0];
							@Pc(171) int local171 = local150 + local101.anIntArray561[0];
							if (local164 < 0) {
								local164 = 0;
							} else if (local164 > Static153.anInt2883 - local118 - 1) {
								local164 = Static153.anInt2883 - local118 - 1;
							}
							if (local171 < 0) {
								local171 = 0;
							} else if (local171 > Static246.anInt4606 - local118 - 1) {
								local171 = Static246.anInt4606 - local118 - 1;
							}
							@Pc(239) int local239 = Static244.method4296(local164, local101.anIntArray561[0], local118, local101.anIntArray560[0], Static334.aClass27Array1[local101.aByte90], 0, -1, true, local118, 0, Static149.anIntArray343, Static126.anIntArray308, local171, local118);
							if (local239 > 0) {
								if (local239 > 9) {
									local239 = 9;
								}
								for (@Pc(250) int local250 = 0; local250 < local239; local250++) {
									local101.anIntArray560[local250] = Static149.anIntArray343[local239 - local250 - 1];
									local101.anIntArray561[local250] = Static126.anIntArray308[local239 - local250 - 1];
									local101.aByteArray83[local250] = 1;
								}
								local101.anInt5156 = local239;
							}
						}
					}
					Static129.method2527(local101, true);
					local142 = Static337.method5579(local101);
					Static326.method5427(Static87.anInt1612, Static289.anInt5439, local101, local142);
					Static40.method687(local101);
				}
			}
		}
		if (Static181.anInt3370 == 0 && Static215.anInt3939 == 0) {
			if (Static334.anInt6112 == 2) {
				Static90.method1535();
			} else {
				Static220.method3911();
			}
			if (Static287.anInt5405 >> 7 < 14 || Static287.anInt5405 >> 7 >= Static153.anInt2883 - 14 || Static11.anInt197 >> 7 < 14 || Static11.anInt197 >> 7 >= Static246.anInt4606 - 14) {
				Static138.method4287();
			}
		}
		while (true) {
			@Pc(368) Class6_Sub15 local368;
			@Pc(373) Class132 local373;
			@Pc(384) Class132 local384;
			do {
				local368 = (Class6_Sub15) Static252.aClass211_28.method5587();
				if (local368 == null) {
					while (true) {
						do {
							local368 = (Class6_Sub15) Static84.aClass211_8.method5587();
							if (local368 == null) {
								while (true) {
									do {
										local368 = (Class6_Sub15) Static116.aClass211_18.method5587();
										if (local368 == null) {
											if (Static350.aClass132_20 != null) {
												Static280.method4828();
											}
											if (Static76.anInt2853 % 1500 == 0) {
												Static213.method3830();
											}
											Static258.method4307();
											if (Static90.aBoolean119 && Static245.method4300() - 60000L > Static152.aLong101) {
												Static95.method1718();
												return;
											}
											return;
										}
										local373 = local368.aClass132_5;
										if (local373.anInt3555 < 0) {
											break;
										}
										local384 = Static249.method4316(local373.anInt3500);
									} while (local384 == null || local384.aClass132Array2 == null || local384.aClass132Array2.length <= local373.anInt3555 || local373 != local384.aClass132Array2[local373.anInt3555]);
									Static140.method2654(local368);
								}
							}
							local373 = local368.aClass132_5;
							if (local373.anInt3555 < 0) {
								break;
							}
							local384 = Static249.method4316(local373.anInt3500);
						} while (local384 == null || local384.aClass132Array2 == null || local384.aClass132Array2.length <= local373.anInt3555 || local384.aClass132Array2[local373.anInt3555] != local373);
						Static140.method2654(local368);
					}
				}
				local373 = local368.aClass132_5;
				if (local373.anInt3555 < 0) {
					break;
				}
				local384 = Static249.method4316(local373.anInt3500);
			} while (local384 == null || local384.aClass132Array2 == null || local384.aClass132Array2.length <= local373.anInt3555 || local384.aClass132Array2[local373.anInt3555] != local373);
			Static140.method2654(local368);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method758() {
		if (!Static276.aBoolean363) {
			label222: while (true) {
				do {
					if (!Static237.method4200()) {
						break label222;
					}
				} while (Static156.aChar10 != 's' && Static156.aChar10 != 'S');
				Static276.aBoolean363 = true;
			}
		}
		@Pc(41) int local41;
		if (Static133.anInt2451 == 0) {
			@Pc(31) Runtime local31 = Runtime.getRuntime();
			local41 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
			@Pc(44) long local44 = Static245.method4300();
			if (Static73.aLong42 == 0L) {
				Static73.aLong42 = local44;
			}
			if (local41 > 16384 && local44 - Static73.aLong42 < 5000L) {
				if (local44 - Static113.aLong78 > 1000L) {
					System.gc();
					Static113.aLong78 = local44;
				}
				Static161.anInt3047 = 5;
				Static143.aString122 = Static209.aString164;
			} else {
				Static143.aString122 = Static47.aString37;
				Static133.anInt2451 = 10;
				Static161.anInt3047 = 5;
			}
			return;
		}
		@Pc(95) int local95;
		if (Static133.anInt2451 == 10) {
			for (local95 = 0; local95 < 4; local95++) {
				Static334.aClass27Array1[local95] = Static203.method3669(Static153.anInt2883, Static246.anInt4606);
			}
			Static143.aString122 = Static256.aString200;
			Static133.anInt2451 = 20;
			Static161.anInt3047 = 10;
		} else if (Static133.anInt2451 == 20) {
			if (Static345.aClass124_1 == null) {
				Static345.aClass124_1 = new Class124(Static124.aClass113_1, Static176.aClass99_2);
			}
			if (Static345.aClass124_1.method3325()) {
				Static127.aClass53_105 = Static275.method4724(0, false, true);
				Static87.aClass53_42 = Static275.method4724(1, false, true);
				Static114.aClass53_62 = Static275.method4724(2, false, true);
				Static129.aClass53_75 = Static275.method4724(3, false, true);
				Static15.aClass53_14 = Static275.method4724(4, false, true);
				Static71.aClass53_36 = Static275.method4724(5, true, true);
				Static244.aClass53_116 = Static275.method4724(6, true, false);
				Static17.aClass53_155 = Static275.method4724(7, false, true);
				Static269.aClass53_124 = Static275.method4724(8, false, true);
				Static244.aClass53_115 = Static275.method4724(9, false, true);
				Static73.aClass53_38 = Static275.method4724(10, false, true);
				Static243.aClass53_113 = Static275.method4724(11, false, true);
				Static109.aClass53_55 = Static275.method4724(12, false, true);
				Static5.aClass53_8 = Static275.method4724(13, false, true);
				Static306.aClass53_142 = Static275.method4724(14, false, false);
				Static350.aClass53_159 = Static275.method4724(15, false, true);
				Static282.aClass53_130 = Static275.method4724(16, false, true);
				Static284.aClass53_131 = Static275.method4724(17, false, true);
				Static128.aClass53_74 = Static275.method4724(18, false, true);
				Static110.aClass53_57 = Static275.method4724(19, false, true);
				Static111.aClass53_59 = Static275.method4724(20, false, true);
				Static291.aClass53_133 = Static275.method4724(21, false, true);
				Static276.aClass53_128 = Static275.method4724(22, false, true);
				Static138.aClass53_114 = Static275.method4724(23, true, true);
				Static238.aClass53_126 = Static275.method4724(24, false, true);
				Static27.aClass53_24 = Static275.method4724(25, false, true);
				Static250.aClass53_22 = Static275.method4724(26, true, true);
				Static160.aClass53_88 = Static275.method4724(27, false, true);
				Static179.aClass53_93 = Static275.method4724(28, true, true);
				Static143.aString122 = Static174.aString138;
				Static161.anInt3047 = 15;
				Static133.anInt2451 = 30;
			} else {
				Static143.aString122 = Static3.aString3;
				Static161.anInt3047 = 12;
			}
		} else if (Static133.anInt2451 == 30) {
			local95 = 0;
			for (local41 = 0; local41 < 29; local41++) {
				local95 += Static121.aClass98_Sub1Array3[local41].method4146() * Static90.anIntArray193[local41] / 100;
			}
			if (local95 == 100) {
				Static161.anInt3047 = 20;
				Static143.aString122 = Static189.aString152;
				Static37.method637(Static269.aClass53_124);
				Static66.method1128(Static269.aClass53_124);
				Static133.anInt2451 = 40;
			} else {
				Static161.anInt3047 = 20;
				if (local95 != 0) {
					Static143.aString122 = Static117.aString89 + local95 + "%";
				}
			}
		} else if (Static133.anInt2451 == 40) {
			if (Static179.aClass53_93.method1023()) {
				this.method761(Static179.aClass53_93.method1014(1));
				Static133.anInt2451 = 50;
				Static161.anInt3047 = 25;
				Static143.aString122 = Static141.aString107;
			} else {
				Static143.aString122 = Static301.aString260 + Static179.aClass53_93.method1025() + "%";
				Static161.anInt3047 = 25;
			}
		} else if (Static133.anInt2451 == 50) {
			Static156.method5550(Static314.aBoolean195);
			Static120.aClass6_Sub12_Sub1_1 = new Class6_Sub12_Sub1();
			Static120.aClass6_Sub12_Sub1_1.method1449();
			Static292.aClass34_1 = Static198.method3624(22050, Static308.aClass206_5, 0, Static354.aCanvas5);
			Static292.aClass34_1.method5823(Static120.aClass6_Sub12_Sub1_1);
			Static292.method4991(Static306.aClass53_142, Static350.aClass53_159, Static120.aClass6_Sub12_Sub1_1, Static15.aClass53_14);
			Static326.aClass34_2 = Static198.method3624(2048, Static308.aClass206_5, 1, Static354.aCanvas5);
			Static241.aClass6_Sub12_Sub3_6 = new Class6_Sub12_Sub3();
			Static326.aClass34_2.method5823(Static241.aClass6_Sub12_Sub3_6);
			Static191.aClass63_1 = new Class63(22050, Static22.anInt358);
			Static132.anInt2415 = Static244.aClass53_116.method1037("scape main");
			Static161.anInt3047 = 30;
			Static143.aString122 = Static120.aString92;
			Static133.anInt2451 = 60;
		} else if (Static133.anInt2451 == 60) {
			local95 = Static49.method845(Static269.aClass53_124, Static5.aClass53_8);
			local41 = Static56.method2573();
			if (local41 > local95) {
				Static161.anInt3047 = 35;
				Static143.aString122 = Static275.aString223 + local95 * 100 / local41 + "%";
			} else {
				Static143.aString122 = Static86.aString57;
				Static161.anInt3047 = 35;
				Static133.anInt2451 = 70;
			}
		} else if (Static133.anInt2451 == 70) {
			local95 = Static223.method3941(Static269.aClass53_124);
			local41 = Static233.method4136();
			if (local41 > local95) {
				Static143.aString122 = Static128.aString97 + local95 * 100 / local41 + "%";
				Static161.anInt3047 = 40;
			} else {
				Static143.aString122 = Static273.aString296;
				Static161.anInt3047 = 40;
				Static133.anInt2451 = 80;
			}
		} else if (Static133.anInt2451 == 80) {
			if (Static250.aClass53_22.method1023()) {
				Static263.anInterface2_5 = new Class17(Static250.aClass53_22, Static244.aClass53_115, Static269.aClass53_124);
				Static143.aString122 = Static292.aString244;
				Static133.anInt2451 = 90;
				Static161.anInt3047 = 45;
			} else {
				Static143.aString122 = Static271.aString214 + Static250.aClass53_22.method1025() + "%";
				Static161.anInt3047 = 45;
			}
		} else if (Static133.anInt2451 == 90) {
			Static143.aString122 = Static142.aString112;
			Static161.anInt3047 = 50;
			Static133.anInt2451 = 95;
		} else if (Static133.anInt2451 == 95) {
			if (Static276.aBoolean363) {
				Static213.anInt3920 = 0;
				Static189.anInt3613 = 0;
				Static182.anInt3432 = 1;
				Static297.anInt5582 = 0;
				Static163.anInt3087 = 0;
			}
			Static276.aBoolean363 = true;
			Static71.method1264(Static308.aClass206_5);
			Static54.method945();
			Static281.method4840(false, Static213.anInt3920);
			Static143.aString122 = Static76.aString123;
			Static161.anInt3047 = 55;
			Static133.anInt2451 = 100;
		} else if (Static133.anInt2451 == 100) {
			Static323.method5377(Static5.aClass53_8, Static289.aClass81_7, Static269.aClass53_124);
			Static161.anInt3047 = 60;
			Static143.aString122 = Static323.aString277;
			Static290.method4952(5);
			Static133.anInt2451 = 110;
		} else if (Static133.anInt2451 == 110) {
			Static114.aClass53_62.method1023();
			local95 = Static114.aClass53_62.method1025();
			Static282.aClass53_130.method1023();
			local95 += Static282.aClass53_130.method1025();
			Static284.aClass53_131.method1023();
			local95 += Static284.aClass53_131.method1025();
			Static128.aClass53_74.method1023();
			local95 += Static128.aClass53_74.method1025();
			Static110.aClass53_57.method1023();
			local95 += Static110.aClass53_57.method1025();
			Static111.aClass53_59.method1023();
			local95 += Static111.aClass53_59.method1025();
			Static291.aClass53_133.method1023();
			local95 += Static291.aClass53_133.method1025();
			Static276.aClass53_128.method1023();
			local95 += Static276.aClass53_128.method1025();
			Static238.aClass53_126.method1023();
			local95 += Static238.aClass53_126.method1025();
			Static27.aClass53_24.method1023();
			local95 += Static27.aClass53_24.method1025();
			Static160.aClass53_88.method1023();
			local95 += Static160.aClass53_88.method1025();
			if (local95 < 1100) {
				Static161.anInt3047 = 65;
				Static143.aString122 = Static283.aString227 + local95 / 11 + "%";
			} else {
				Static258.method4309(Static114.aClass53_62);
				Static91.method3106(Static114.aClass53_62);
				Static153.method3090(Static114.aClass53_62);
				Static333.method5538(Static17.aClass53_155, Static114.aClass53_62);
				Static75.method1312(Static17.aClass53_155, Static282.aClass53_130);
				Static294.method5025(Static128.aClass53_74, Static17.aClass53_155);
				Static52.method871(Static110.aClass53_57, Static17.aClass53_155);
				Static53.method884(Static114.aClass53_62);
				Static52.method869(Static127.aClass53_105, Static87.aClass53_42, Static111.aClass53_59);
				Static263.method4434(Static114.aClass53_62);
				Static337.method5581(Static291.aClass53_133, Static17.aClass53_155);
				Static348.method5739(Static276.aClass53_128);
				Static185.method5762(Static114.aClass53_62);
				Static325.method5424(Static129.aClass53_75, Static17.aClass53_155, Static269.aClass53_124, Static5.aClass53_8);
				Static124.method2456(Static114.aClass53_62);
				Static3.method47(Static284.aClass53_131);
				Static136.method2602(new Class152(), Static238.aClass53_126, Static27.aClass53_24);
				Static299.method5138(Static27.aClass53_24, Static238.aClass53_126);
				Static151.method3075(Static114.aClass53_62);
				Static95.method1716(Static114.aClass53_62);
				Static65.method1113(Static114.aClass53_62);
				Static24.method370(Static269.aClass53_124, Static114.aClass53_62);
				Static92.method1588(Static114.aClass53_62, Static269.aClass53_124);
				Static268.method4558(Static114.aClass53_62);
				Static84.method1394(Static269.aClass53_124, Static114.aClass53_62);
				Static21.method307(Static114.aClass53_62);
				Static252.method4323(Static114.aClass53_62);
				Static161.anInt3047 = 65;
				Static143.aString122 = Static54.aString43;
				Static213.method3831();
				Static133.anInt2451 = 120;
			}
		} else if (Static133.anInt2451 == 120) {
			local95 = Static352.method5770(Static269.aClass53_124);
			local41 = Static217.method3878();
			if (local95 < local41) {
				Static161.anInt3047 = 70;
				Static143.aString122 = Static200.aString157 + local95 * 100 / local41 + "%";
			} else {
				Static63.method1012(Static289.aClass81_7, Static269.aClass53_124);
				Static51.method851(Static312.aClass40Array40);
				Static161.anInt3047 = 70;
				Static143.aString122 = Static141.aString109;
				Static133.anInt2451 = 130;
			}
		} else if (Static133.anInt2451 == 130) {
			Static111.aClass139_1 = new Class139();
			Static308.aClass206_5.method5526(Static111.aClass139_1, 10);
			Static143.aString122 = Static291.aString241;
			Static133.anInt2451 = 140;
			Static161.anInt3047 = 75;
		} else if (Static133.anInt2451 == 140) {
			if (Static73.aClass53_38.method1015("", "huffman")) {
				@Pc(1053) Class190 local1053 = new Class190(Static73.aClass53_38.method1006("", "huffman"));
				Static256.method4373(local1053);
				Static161.anInt3047 = 80;
				Static143.aString122 = Static252.aString198;
				Static133.anInt2451 = 150;
			} else {
				Static161.anInt3047 = 80;
				Static143.aString122 = Static277.aString226 + "0%";
			}
		} else if (Static133.anInt2451 == 150) {
			if (!Static129.aClass53_75.method1023()) {
				Static143.aString122 = Static108.aString78 + Static129.aClass53_75.method1025() * 3 / 4 + "%";
				Static161.anInt3047 = 85;
			} else if (!Static109.aClass53_55.method1023()) {
				Static143.aString122 = Static108.aString78 + (Static109.aClass53_55.method1025() / 10 + 75) + "%";
				Static161.anInt3047 = 85;
			} else if (!Static5.aClass53_8.method1023()) {
				Static143.aString122 = Static108.aString78 + (Static5.aClass53_8.method1025() / 20 + 85) + "%";
				Static161.anInt3047 = 85;
			} else if (Static138.aClass53_114.method1007("details")) {
				Static307.method1098(Static138.aClass53_114);
				Static291.method4972(Static160.aClass53_88);
				Static47.method787(Static263.anInterface2_5, Static17.aClass53_155);
				Static143.aString122 = Static43.aString35;
				Static133.anInt2451 = 160;
				Static161.anInt3047 = 85;
			} else {
				Static143.aString122 = Static108.aString78 + (Static138.aClass53_114.method1016("details") / 10 + 90) + "%";
				Static161.anInt3047 = 85;
			}
		} else if (Static133.anInt2451 == 160) {
			local95 = Static292.method4992();
			if (local95 == -1) {
				Static161.anInt3047 = 90;
				Static143.aString122 = Static354.aString307;
			} else if (local95 == 7 || local95 == 9) {
				this.method728("worldlistfull");
				Static290.method4952(1000);
			} else if (Static350.aBoolean422) {
				Static143.aString122 = Static186.aString143;
				Static133.anInt2451 = 170;
				Static161.anInt3047 = 90;
			} else {
				this.method728("worldlistio_" + local95);
				Static290.method4952(1000);
			}
		} else if (Static133.anInt2451 == 170) {
			Static144.aStringArray17 = new String[Static252.anInt4704];
			Static6.aBooleanArray1 = new boolean[Static206.anInt3783];
			Static295.anIntArray624 = new int[Static206.anInt3783];
			for (local95 = 0; local95 < Static206.anInt3783; local95++) {
				if (Static205.method5713(local95).anInt3232 == 0) {
					Static6.aBooleanArray1[local95] = true;
					Static115.anInt2151++;
				}
				Static295.anIntArray624[local95] = -1;
			}
			Static32.method4363();
			Static200.anInt3707 = Static129.aClass53_75.method1037("loginscreen");
			Static71.aClass53_36.method1018(false);
			Static244.aClass53_116.method1018(true);
			Static269.aClass53_124.method1018(true);
			Static5.aClass53_8.method1018(true);
			Static73.aClass53_38.method1018(true);
			Static129.aClass53_75.method1018(true);
			Static114.aClass53_62.anInt1133 = 2;
			Static275.aBoolean361 = true;
			Static284.aClass53_131.anInt1133 = 2;
			Static282.aClass53_130.anInt1133 = 2;
			Static128.aClass53_74.anInt1133 = 2;
			Static110.aClass53_57.anInt1133 = 2;
			Static111.aClass53_59.anInt1133 = 2;
			Static291.aClass53_133.anInt1133 = 2;
			Static54.method944(false, -1, Static182.anInt3432, -1);
			Static161.anInt3047 = 95;
			Static133.anInt2451 = 180;
			Static143.aString122 = Static294.aString248;
		} else if (Static133.anInt2451 == 180) {
			Static153.method3083(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method760() {
		@Pc(7) boolean local7 = Static124.aClass113_1.method3139();
		if (!local7) {
			this.method750();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method761(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class6_Sub10 local15 = new Class6_Sub10(arg0);
		while (true) {
			@Pc(19) int local19;
			do {
				while (true) {
					local19 = local15.method3972();
					if (local19 == 0) {
						return;
					}
					if (local19 != 1) {
						break;
					}
					@Pc(69) int[] local69 = Static321.anIntArray678 = new int[6];
					local69[0] = local15.method4021();
					local69[1] = local15.method4021();
					local69[2] = local15.method4021();
					local69[3] = local15.method4021();
					local69[4] = local15.method4021();
					local69[5] = local15.method4021();
				}
			} while (local19 != 4);
			@Pc(36) int local36 = local15.method3972();
			Static119.anIntArray301 = new int[local36];
			for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
				Static119.anIntArray301[local41] = local15.method4021();
				if (Static119.anIntArray301[local41] == 65535) {
					Static119.anIntArray301[local41] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method729() {
		if (Static90.aBoolean119) {
			Static95.method1718();
		}
		if (Static289.aClass81_7 != null) {
			Static289.aClass81_7.method2966();
		}
		if (Static90.aFrame1 != null) {
			Static167.method3290(Static90.aFrame1, Static308.aClass206_5);
			Static90.aFrame1 = null;
		}
		if (Static111.aClass139_1 != null) {
			Static111.aClass139_1.aBoolean285 = false;
		}
		Static111.aClass139_1 = null;
		if (Static216.aClass11_5 != null) {
			Static216.aClass11_5.method159();
			Static216.aClass11_5 = null;
		}
		Static10.method193(Static354.aCanvas5);
		Static104.method2112(Static354.aCanvas5);
		if (Static74.aClass94_1 != null) {
			Static74.aClass94_1.method5164(Static354.aCanvas5);
		}
		Static77.method1337();
		Static279.method4826();
		Static74.aClass94_1 = null;
		if (Static292.aClass34_1 != null) {
			Static292.aClass34_1.method5827();
		}
		if (Static326.aClass34_2 != null) {
			Static326.aClass34_2.method5827();
		}
		Static124.aClass113_1.method3138();
		Static176.aClass99_2.method2530();
		if (Static287.aClass101_1 != null) {
			Static287.aClass101_1.method2599();
			Static287.aClass101_1 = null;
		}
	}
}
