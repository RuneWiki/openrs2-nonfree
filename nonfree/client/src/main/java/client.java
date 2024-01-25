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

	static {
		new Class114("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static14.method721("Argument count");
			}
			Static476.aClass130_7 = new Class130();
			Static476.aClass130_7.anInt4072 = Integer.parseInt(arg0[0]);
			Static269.aClass130_6 = new Class130();
			Static269.aClass130_6.anInt4072 = Integer.parseInt(arg0[1]);
			Static422.aClass130_8 = new Class130();
			Static422.aClass130_8.anInt4072 = Integer.parseInt(arg0[2]);
			Static363.aClass199_14 = Static544.aClass199_15;
			if (arg0[3].equals("live")) {
				Static519.aClass185_7 = Static30.aClass185_2;
			} else if (arg0[3].equals("rc")) {
				Static519.aClass185_7 = Static97.aClass185_6;
			} else if (arg0[3].equals("wip")) {
				Static519.aClass185_7 = Static21.aClass185_1;
			} else {
				Static14.method721("modewhat");
			}
			Static315.anInt5993 = Static291.method4907(arg0[4]);
			if (Static315.anInt5993 == -1) {
				if (arg0[4].equals("english")) {
					Static315.anInt5993 = 0;
				} else if (arg0[4].equals("german")) {
					Static315.anInt5993 = 1;
				} else {
					Static14.method721("language");
				}
			}
			Static239.aBoolean282 = false;
			Static111.aBoolean184 = false;
			if (arg0[5].equals("game0")) {
				Static538.aClass37_4 = Static152.aClass37_1;
			} else if (arg0[5].equals("game1")) {
				Static538.aClass37_4 = Static452.aClass37_3;
			} else {
				Static14.method721("game");
			}
			Static120.aString18 = "";
			Static226.anInt4529 = Static538.aClass37_4.anInt1407;
			Static143.anInt3316 = 0;
			Static120.aBoolean188 = false;
			Static214.aBoolean270 = true;
			Static341.aBoolean425 = true;
			Static492.anInt8383 = 0;
			Static57.aBoolean115 = false;
			Static150.aString23 = null;
			Static411.anInt7172 = 0;
			@Pc(159) client local159 = new client();
			Static496.aClient1 = local159;
			local159.method1722(Static538.aClass37_4.aString7, Static519.aClass185_7.method4847() + 32);
			Static543.aFrame2.setLocation(40, 40);
		} catch (@Pc(183) Exception local183) {
			Static41.method1359(local183, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1728()) {
			return;
		}
		Static476.aClass130_7 = new Class130();
		Static476.aClass130_7.anInt4072 = Integer.parseInt(this.getParameter("worldid"));
		Static269.aClass130_6 = new Class130();
		Static269.aClass130_6.anInt4072 = Integer.parseInt(this.getParameter("lobbyid"));
		Static269.aClass130_6.aString26 = this.getParameter("lobbyaddress");
		Static422.aClass130_8 = new Class130();
		Static422.aClass130_8.anInt4072 = Integer.parseInt(this.getParameter("demoid"));
		Static422.aClass130_8.aString26 = this.getParameter("demoaddress");
		Static363.aClass199_14 = Static522.method7438(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static496.method7129(Static363.aClass199_14) && Static359.aClass199_13 != Static363.aClass199_14) {
			Static363.aClass199_14 = Static359.aClass199_13;
		}
		Static519.aClass185_7 = Static16.method805(Integer.parseInt(this.getParameter("modewhat")));
		if (Static21.aClass185_1 != Static519.aClass185_7 && Static519.aClass185_7 != Static97.aClass185_6 && Static519.aClass185_7 != Static30.aClass185_2) {
			Static519.aClass185_7 = Static30.aClass185_2;
		}
		try {
			Static315.anInt5993 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static315.anInt5993 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static239.aBoolean282 = true;
		} else {
			Static239.aBoolean282 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static111.aBoolean184 = true;
		} else {
			Static111.aBoolean184 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static290.aBoolean461 = true;
		} else {
			Static290.aBoolean461 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static538.aClass37_4 = Static152.aClass37_1;
			} else if (local145.equals("1")) {
				Static538.aClass37_4 = Static452.aClass37_3;
			}
		}
		try {
			Static143.anInt3316 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static143.anInt3316 = 0;
		}
		Static133.aString20 = this.getParameter("quiturl");
		Static120.aString18 = this.getParameter("settings");
		if (Static120.aString18 == null) {
			Static120.aString18 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static492.anInt8383 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static492.anInt8383 = 0;
			}
		}
		Static226.anInt4529 = Integer.parseInt(this.getParameter("colourid"));
		if (Static226.anInt4529 < 0 || Static226.anInt4529 >= Static6.aColorArray1.length) {
			Static226.anInt4529 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static214.aBoolean270 = true;
			Static341.aBoolean425 = true;
		}
		@Pc(230) String local230 = this.getParameter("frombilling");
		if (local230 != null && local230.equals("true")) {
			Static57.aBoolean115 = true;
		}
		Static150.aString23 = this.getParameter("sskey");
		if (Static150.aString23 != null && Static150.aString23.length() < 2) {
			Static150.aString23 = null;
		}
		@Pc(256) String local256 = this.getParameter("force64mb");
		if (local256 != null && local256.equals("true")) {
			Static120.aBoolean188 = true;
		}
		@Pc(268) String local268 = this.getParameter("worldflags");
		if (local268 != null) {
			try {
				Static411.anInt7172 = Integer.parseInt(local268);
			} catch (@Pc(275) Exception local275) {
			}
		}
		Static496.aClient1 = this;
		if (Static152.aClass37_1 == Static538.aClass37_4) {
			Static347.anInt6402 = 765;
			Static450.anInt7569 = 503;
		} else if (Static452.aClass37_3 == Static538.aClass37_4) {
			Static450.anInt7569 = 480;
			Static347.anInt6402 = 640;
		}
		this.method1721(Static450.anInt7569, Static519.aClass185_7.method4847() + 32, Static347.anInt6402);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1729() {
		if (Static538.aBoolean651) {
			Static466.method6817();
		}
		if (Static478.aClass9_10 != null) {
			Static478.aClass9_10.method7585();
		}
		if (Static478.aFrame1 != null) {
			Static488.method7067(Static478.aFrame1, Static91.aClass182_2);
			Static478.aFrame1 = null;
		}
		if (Static453.aClass154_1 != null) {
			Static453.aClass154_1.method4020();
			Static453.aClass154_1 = null;
		}
		Static120.method2683();
		Static181.aClass115_2.method3364();
		Static147.aClass147_2.method3947();
		if (Static27.aClass54_1 != null) {
			Static27.aClass54_1.method1971();
			Static27.aClass54_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1734() {
		if (Static120.aBoolean188) {
			Static318.anInt6040 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static36.method1333();
		Static147.aClass147_2 = new Class147(Static91.aClass182_2);
		Static181.aClass115_2 = new Class115();
		if (Static363.aClass199_14 != Static359.aClass199_13) {
			Static241.aByteArrayArray11 = new byte[50][];
		}
		Static89.aClass1_Sub28_Sub1_1 = new Class1_Sub28_Sub1(Static91.aClass182_2);
		if (Static363.aClass199_14 == Static359.aClass199_13) {
			Static476.aClass130_7.aString26 = this.getCodeBase().getHost();
		} else if (Static496.method7129(Static363.aClass199_14)) {
			Static476.aClass130_7.aString26 = this.getCodeBase().getHost();
			Static476.aClass130_7.anInt4073 = Static476.aClass130_7.anInt4072 + 40000;
			Static269.aClass130_6.anInt4073 = Static269.aClass130_6.anInt4072 + 40000;
			Static422.aClass130_8.anInt4073 = Static422.aClass130_8.anInt4072 + 40000;
			Static476.aClass130_7.anInt4074 = Static476.aClass130_7.anInt4072 + 50000;
			Static269.aClass130_6.anInt4074 = Static269.aClass130_6.anInt4072 + 50000;
			Static422.aClass130_8.anInt4074 = Static422.aClass130_8.anInt4072 + 50000;
		} else if (Static363.aClass199_14 == Static544.aClass199_15) {
			Static476.aClass130_7.aString26 = "127.0.0.1";
			Static269.aClass130_6.aString26 = "127.0.0.1";
			Static422.aClass130_8.aString26 = "127.0.0.1";
			Static476.aClass130_7.anInt4073 = Static476.aClass130_7.anInt4072 + 40000;
			Static269.aClass130_6.anInt4073 = Static269.aClass130_6.anInt4072 + 40000;
			Static422.aClass130_8.anInt4073 = Static422.aClass130_8.anInt4072 + 40000;
			Static476.aClass130_7.anInt4074 = Static476.aClass130_7.anInt4072 + 50000;
			Static269.aClass130_6.anInt4074 = Static269.aClass130_6.anInt4072 + 50000;
			Static422.aClass130_8.anInt4074 = Static422.aClass130_8.anInt4072 + 50000;
		}
		Static396.aShortArray122 = Static60.aShortArray20 = Static264.aShortArray82 = Static469.aShortArray138 = new short[256];
		Static153.aClass130_5 = Static476.aClass130_7;
		if (Static538.aClass37_4 == Static452.aClass37_3) {
			Static432.aShortArrayArray12 = Static514.aShortArrayArray14;
			Static425.anInt7380 = 16777215;
			Static79.anInt2106 = 0;
			Static179.aBoolean243 = true;
			Static531.aShortArray169 = Static144.aShortArray50;
			Static409.aShortArrayArray9 = Static404.aShortArrayArray16;
			Static65.aShortArray158 = Static528.aShortArray168;
		} else {
			Static531.aShortArray169 = Static158.aShortArray51;
			Static409.aShortArrayArray9 = Static356.aShortArrayArray8;
			Static65.aShortArray158 = Static497.aShortArray157;
			Static432.aShortArrayArray12 = Static436.aShortArrayArray13;
		}
		if (Static152.aClass37_1 == Static538.aClass37_4) {
			Static273.aBoolean371 = false;
		}
		Static126.aClass60_1 = Static129.method2829(Static78.aCanvas7);
		Static42.aClass191_1 = Static420.method6256(Static78.aCanvas7);
		Static197.anInt4107 = Static283.anInt5580;
		try {
			if (Static91.aClass182_2.aClass116_3 != null) {
				Static231.aClass279_10 = new Class279(Static91.aClass182_2.aClass116_3, 5200, 0);
				for (@Pc(217) int local217 = 0; local217 < 32; local217++) {
					Static157.aClass279Array1[local217] = new Class279(Static91.aClass182_2.aClass116Array1[local217], 6000, 0);
				}
				Static23.aClass279_3 = new Class279(Static91.aClass182_2.aClass116_1, 6000, 0);
				Static298.aClass51_4 = new Class51(255, Static231.aClass279_10, Static23.aClass279_3, 500000);
				Static132.aClass279_8 = new Class279(Static91.aClass182_2.aClass116_2, 24, 0);
				Static91.aClass182_2.aClass116_2 = null;
				Static91.aClass182_2.aClass116Array1 = null;
				Static91.aClass182_2.aClass116_1 = null;
				Static91.aClass182_2.aClass116_3 = null;
			}
		} catch (@Pc(275) IOException local275) {
			Static132.aClass279_8 = null;
			Static298.aClass51_4 = null;
			Static231.aClass279_10 = null;
			Static23.aClass279_3 = null;
		}
		if (Static359.aClass199_13 != Static363.aClass199_14) {
			Static184.aBoolean244 = true;
		}
		if (Static152.aClass37_1 == Static538.aClass37_4) {
			Static492.aString75 = Static271.aClass114_33.method3330(Static315.anInt5993);
		} else if (Static452.aClass37_3 == Static538.aClass37_4) {
			Static492.aString75 = Static51.aClass114_150.method3330(Static315.anInt5993);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method1742() {
		@Pc(7) boolean local7 = Static181.aClass115_2.method3363();
		if (!local7) {
			this.method1745();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1743() {
		if (Static51.anInt7926 == 13) {
			return;
		}
		@Pc(16) long local16 = Static88.method2130() / 1000000L - Static158.aLong91;
		Static158.aLong91 = Static88.method2130() / 1000000L;
		@Pc(24) boolean local24 = Static363.method6957();
		if (local24 && Static289.aBoolean391 && Static426.aClass39_7 != null) {
			Static426.aClass39_7.method5060();
		}
		if (Static424.method6300(Static51.anInt7926)) {
			if (Static397.aLong182 != 0L && Static397.aLong182 < Static93.method2172()) {
				Static63.method1764(false, Static155.method3122(), Static89.aClass1_Sub28_Sub1_1.anInt4893, Static89.aClass1_Sub28_Sub1_1.anInt4909);
			} else if (!Static478.aClass9_10.method7614() && Static317.aBoolean412) {
				Static241.method2711();
			}
		}
		@Pc(79) int local79;
		@Pc(83) int local83;
		if (Static478.aFrame1 == null) {
			@Pc(71) Container local71;
			if (Static543.aFrame2 == null) {
				local71 = Static91.aClass182_2.anApplet1;
			} else {
				local71 = Static543.aFrame2;
			}
			local79 = local71.getSize().width;
			local83 = local71.getSize().height;
			if (local71 == Static543.aFrame2) {
				@Pc(89) Insets local89 = Static543.aFrame2.getInsets();
				local79 -= local89.left + local89.right;
				local83 -= local89.bottom + local89.top;
			}
			if (Static60.anInt1681 != local79 || local83 != Static547.anInt9471) {
				if (Static478.aClass9_10 == null || Static478.aClass9_10.method7620()) {
					Static36.method1333();
				} else {
					Static60.anInt1681 = local79;
					Static547.anInt9471 = local83;
				}
				Static397.aLong182 = Static93.method2172() + 500L;
			}
		}
		if (Static478.aFrame1 != null && !Static109.aBoolean177 && Static424.method6300(Static51.anInt7926)) {
			Static63.method1764(false, Static89.aClass1_Sub28_Sub1_1.anInt4904, -1, -1);
		}
		@Pc(151) boolean local151 = false;
		if (Static412.aBoolean476) {
			local151 = true;
			Static412.aBoolean476 = false;
		}
		if (local151) {
			Static153.method3117();
		}
		if (Static478.aClass9_10 != null && Static478.aClass9_10.method7614() || Static155.method3122() != 1) {
			Static278.method4744();
		}
		if (Static51.anInt7926 == 0) {
			Static460.method6780(Static262.anInt5137, Static68.aString10, local151, Static6.aColorArray1[Static226.anInt4529], Static203.aColorArray2[Static226.anInt4529], Static215.aColorArray3[Static226.anInt4529]);
		} else if (Static51.anInt7926 == 1) {
			Static183.method3498(Static478.aClass9_10, local151 | Static478.aClass9_10.method7614(), Static6.aColorArray1[Static226.anInt4529].getRGB(), Static215.aColorArray3[Static226.anInt4529].getRGB(), Static203.aColorArray2[Static226.anInt4529].getRGB(), Static106.aClass27_3);
		} else if (Static199.method3703(Static51.anInt7926)) {
			Static267.method4418();
		} else if (Static59.method1636(Static51.anInt7926)) {
			Static267.method4418();
		} else if (Static329.method5372(Static51.anInt7926)) {
			if (Static140.anInt3290 == 1) {
				if (Static188.anInt3984 > Static156.anInt3475) {
					Static156.anInt3475 = Static188.anInt3984;
				}
				local79 = (Static156.anInt3475 - Static188.anInt3984) * 50 / Static156.anInt3475;
				Static236.method4028(Static33.aClass114_17.method3330(Static315.anInt5993) + "<br>(" + local79 + "%)", true, Static268.aClass27_4);
			} else if (Static140.anInt3290 == 2) {
				if (Static68.anInt1930 < Static541.anInt9379) {
					Static68.anInt1930 = Static541.anInt9379;
				}
				local79 = (Static68.anInt1930 - Static541.anInt9379) * 50 / Static68.anInt1930 + 50;
				Static236.method4028(Static33.aClass114_17.method3330(Static315.anInt5993) + "<br>(" + local79 + "%)", true, Static268.aClass27_4);
			} else {
				Static236.method4028(Static33.aClass114_17.method3330(Static315.anInt5993), true, Static268.aClass27_4);
			}
		} else if (Static51.anInt7926 == 9) {
			Static337.method5473(local16);
		} else if (Static51.anInt7926 == 12) {
			Static236.method4028(Static68.aClass114_40.method3330(Static315.anInt5993) + "<br>" + Static343.aClass114_125.method3330(Static315.anInt5993), true, Static268.aClass27_4);
		}
		if (Static457.anInt7684 == 3) {
			for (local79 = 0; local79 < Static361.anInt6491; local79++) {
				@Pc(371) Rectangle local371 = Class1_Sub1_Sub2.aRectangleArray1[local79];
				if (Static547.aBooleanArray42[local79]) {
					Static478.aClass9_10.method7632(local371.x, -1996553985, local371.width, local371.height, local371.y);
				} else if (Static44.aBooleanArray8[local79]) {
					Static478.aClass9_10.method7632(local371.x, -1996554240, local371.width, local371.height, local371.y);
				}
			}
		}
		if (Static202.method5311()) {
			Static216.method3863(Static478.aClass9_10);
		}
		if (Static424.method6300(Static51.anInt7926) && Static457.anInt7684 == 0 && Static155.method3122() == 1 && !local151 && Static283.aString49.equals("1.1")) {
			local79 = 0;
			for (local83 = 0; local83 < Static361.anInt6491; local83++) {
				if (Static44.aBooleanArray8[local83]) {
					Static44.aBooleanArray8[local83] = false;
					Static353.aRectangleArray2[local79++] = Class1_Sub1_Sub2.aRectangleArray1[local83];
				}
			}
			try {
				Static478.aClass9_10.method7567(Static353.aRectangleArray2, local79);
			} catch (@Pc(513) Exception_Sub1 local513) {
			}
		} else if (Static51.anInt7926 != 0) {
			for (local79 = 0; local79 < Static361.anInt6491; local79++) {
				Static44.aBooleanArray8[local79] = false;
			}
			try {
				Static478.aClass9_10.method7637();
			} catch (@Pc(457) Exception_Sub1 local457) {
				Static41.method1359(local457, local457.getMessage() + " (Recovered) " + this.method1732());
				Static508.method7307(0);
			}
		}
		if (Static89.aClass1_Sub28_Sub1_1.anInt4901 == 0) {
			Static505.method7295(15L);
		} else if (Static89.aClass1_Sub28_Sub1_1.anInt4901 == 1) {
			Static505.method7295(10L);
		} else if (Static89.aClass1_Sub28_Sub1_1.anInt4901 == 2) {
			Static505.method7295(5L);
		} else if (Static89.aClass1_Sub28_Sub1_1.anInt4901 == 3) {
			Static505.method7295(2L);
		}
		if (Static6.aBoolean6) {
			Static493.method7102();
		}
		if (Static89.aClass1_Sub28_Sub1_1.aBoolean326 && Static51.anInt7926 == 2 && Static85.anInt2201 != -1) {
			Static89.aClass1_Sub28_Sub1_1.aBoolean326 = false;
			Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method1744(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg0);
		while (true) {
			while (true) {
				@Pc(17) int local17 = local13.method3043();
				if (local17 == 0) {
					return;
				}
				if (local17 == 1) {
					@Pc(33) int[] local33 = Static527.anIntArray771 = new int[6];
					local33[0] = local13.method3056();
					local33[1] = local13.method3056();
					local33[2] = local13.method3056();
					local33[3] = local13.method3056();
					local33[4] = local13.method3056();
					local33[5] = local13.method3056();
				} else {
					@Pc(79) int local79;
					@Pc(84) int local84;
					if (local17 == 4) {
						local79 = local13.method3043();
						Static360.anIntArray785 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static360.anIntArray785[local84] = local13.method3056();
							if (Static360.anIntArray785[local84] == 65535) {
								Static360.anIntArray785[local84] = -1;
							}
						}
					} else if (local17 == 5) {
						local79 = local13.method3043();
						Static332.anIntArray466 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static332.anIntArray466[local84] = local13.method3056();
							if (Static332.anIntArray466[local84] == 65535) {
								Static332.anIntArray466[local84] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1733() {
		if (Static526.anInt8926 != 2) {
			this.method1743();
			return;
		}
		try {
			this.method1743();
		} catch (@Pc(9) Throwable local9) {
			Static41.method1359(local9, local9.getMessage() + " (Recovered) " + this.method1732());
			Static508.method7307(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1745() {
		if (Static399.anInt6976 < Static181.aClass115_2.anInt3776) {
			Static153.aClass130_5.aBoolean248 = !Static153.aClass130_5.aBoolean248;
			Static80.anInt2113 = (Static181.aClass115_2.anInt3776 - 1) * 50 * 5;
			if (Static80.anInt2113 > 3000) {
				Static80.anInt2113 = 3000;
			}
			if (Static181.aClass115_2.anInt3776 >= 2 && Static181.aClass115_2.anInt3777 == 6) {
				this.method1730("js5connect_outofdate");
				Static51.anInt7926 = 13;
				return;
			}
			if (Static181.aClass115_2.anInt3776 >= 4 && Static181.aClass115_2.anInt3777 == -1) {
				this.method1730("js5crc");
				Static51.anInt7926 = 13;
				return;
			}
			if (Static181.aClass115_2.anInt3776 >= 4 && Static499.method7151(Static51.anInt7926)) {
				if (Static181.aClass115_2.anInt3777 == 7 || Static181.aClass115_2.anInt3777 == 9) {
					this.method1730("js5connect_full");
				} else if (Static181.aClass115_2.anInt3777 <= 0) {
					this.method1730("js5io");
				} else {
					this.method1730("js5connect");
				}
				Static51.anInt7926 = 13;
				return;
			}
		}
		Static399.anInt6976 = Static181.aClass115_2.anInt3776;
		if (Static80.anInt2113 > 0) {
			Static80.anInt2113--;
			return;
		}
		try {
			if (Static422.anInt7365 == 0) {
				Static503.aClass243_8 = Static91.aClass182_2.method4818(Static153.aClass130_5.aString26, Static153.aClass130_5.method3628());
				Static422.anInt7365++;
			}
			if (Static422.anInt7365 == 1) {
				if (Static503.aClass243_8.anInt6905 == 2) {
					this.method1749(1000);
					return;
				}
				if (Static503.aClass243_8.anInt6905 == 1) {
					Static422.anInt7365++;
				}
			}
			if (Static422.anInt7365 == 2) {
				Static271.aClass57_2 = new Class57((Socket) Static503.aClass243_8.anObject12, Static91.aClass182_2);
				@Pc(181) Class1_Sub13 local181 = new Class1_Sub13(5);
				local181.method3060(Static203.aClass143_2.anInt4449);
				local181.method3069(609);
				Static271.aClass57_2.method2055(5, local181.aByteArray45);
				Static422.anInt7365++;
				Static167.aLong94 = Static93.method2172();
			}
			if (Static422.anInt7365 == 3) {
				if (Static499.method7151(Static51.anInt7926) || Static271.aClass57_2.method2052() > 0) {
					@Pc(221) int local221 = Static271.aClass57_2.method2053();
					if (local221 != 0) {
						this.method1749(local221);
						return;
					}
					Static422.anInt7365++;
				} else if (Static93.method2172() - Static167.aLong94 > 30000L) {
					this.method1749(1001);
					return;
				}
			}
			if (Static422.anInt7365 == 4) {
				@Pc(266) boolean local266 = Static51.anInt7926 == 1 || Static197.method3654(Static51.anInt7926) || Static124.method4352(Static51.anInt7926);
				Static181.aClass115_2.method3361(Static271.aClass57_2, !local266);
				Static503.aClass243_8 = null;
				Static422.anInt7365 = 0;
				Static271.aClass57_2 = null;
			}
		} catch (@Pc(283) IOException local283) {
			this.method1749(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1747() {
		if (Static51.anInt7926 == 13) {
			return;
		}
		Static416.anInt7252++;
		if (Static416.anInt7252 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static167.anInt3664 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static102.aRandom1.setSeed((long) Static167.anInt3664);
		}
		if (Static416.anInt7252 % 50 == 0) {
			Static106.anInt2479 = Static178.anInt3816;
			Static178.anInt3816 = 0;
			Static139.anInt3271 = Static543.anInt9404;
			Static543.anInt9404 = 0;
		}
		this.method1742();
		if (Static514.aClass218_1 != null) {
			Static514.aClass218_1.method5555();
		}
		Static199.method3701();
		Static126.aClass60_1.method5385();
		Static42.aClass191_1.method5144();
		if (Static478.aClass9_10 != null) {
			Static478.aClass9_10.method7613((int) Static93.method2172());
		}
		Static368.method5687();
		Static200.anInt4238 = 0;
		Static11.anInt130 = 0;
		for (@Pc(95) Interface2 local95 = Static126.aClass60_1.method5386(); local95 != null; local95 = Static126.aClass60_1.method5386()) {
			@Pc(100) int local100 = local95.method7098();
			if (local100 == 2 || local100 == 3) {
				@Pc(133) char local133 = local95.method7096();
				if (Static25.method1154() && (local133 == '`' || local133 == '§')) {
					if (Static202.method5311()) {
						Static237.method4030();
					} else {
						Static328.method5367();
					}
				} else if (Static11.anInt130 < 128) {
					Static193.anInterface2Array2[Static11.anInt130] = local95;
					Static11.anInt130++;
				}
			} else if (local100 == 0 && Static200.anInt4238 < 75) {
				Static163.anInterface2Array1[Static200.anInt4238] = local95;
				Static200.anInt4238++;
			}
		}
		Static430.anInt7441 = 0;
		for (@Pc(176) Class1_Sub41 local176 = Static42.aClass191_1.method5145(); local176 != null; local176 = Static42.aClass191_1.method5145()) {
			@Pc(181) int local181 = local176.method7875();
			if (local181 == -1) {
				Static507.aClass38_72.method1426(local176);
			} else if (local181 == 6) {
				Static430.anInt7441 += local176.method7873();
			} else if (Static218.method3889(local181)) {
				Static407.aClass38_54.method1426(local176);
				if (Static407.aClass38_54.method1422() > 10) {
					Static407.aClass38_54.method1423();
				}
			}
		}
		if (Static202.method5311()) {
			Static230.method3985();
		}
		if (Static51.anInt7926 == 0) {
			this.method1758();
			Static58.method1891();
		} else if (Static51.anInt7926 == 1) {
			this.method1758();
			Static58.method1891();
		} else if (Static329.method5372(Static51.anInt7926)) {
			Static237.method4033();
		}
		if (Static197.method3654(Static51.anInt7926) && !Static329.method5372(Static51.anInt7926)) {
			this.method1754();
			Static38.method1334();
			Static476.method6227();
		} else if (Static124.method4352(Static51.anInt7926) && !Static329.method5372(Static51.anInt7926)) {
			this.method1754();
			Static476.method6227();
		} else if (Static51.anInt7926 == 11) {
			Static476.method6227();
		} else if (Static442.method6767(Static51.anInt7926) && !Static329.method5372(Static51.anInt7926)) {
			Static60.method1659();
		} else if (Static51.anInt7926 == 12) {
			Static476.method6227();
			if (Static243.anInt4679 != -3 && Static243.anInt4679 != 2 && Static243.anInt4679 != 15) {
				Static140.method2961(false);
			}
		}
		Static372.method5701(Static478.aClass9_10);
		Static407.aClass38_54.method1423();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1749(@OriginalArg(1) int arg0) {
		Static181.aClass115_2.anInt3776++;
		Static422.anInt7365 = 0;
		Static181.aClass115_2.anInt3777 = arg0;
		Static271.aClass57_2 = null;
		Static503.aClass243_8 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1735() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1732() {
		@Pc(11) String local11 = null;
		try {
			local11 = "[1)" + Static324.anInt6132 + "," + Static517.anInt8716 + "," + Static542.anInt9387 + "," + Static36.anInt1324 + "|";
			if (Static16.aClass47_Sub2_Sub3_Sub2_1 != null) {
				local11 = local11 + "2)" + Static245.anInt4747 + "," + (Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0] + Static324.anInt6132) + "," + (Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0] + Static517.anInt8716) + "|";
			}
			local11 = local11 + "3)" + Static526.anInt8926 + "|4)" + Static89.aClass1_Sub28_Sub1_1.anInt4890 + "|5)" + Static155.method3122() + "|6)" + Static290.anInt6867 + "," + Static90.anInt2326 + "|";
			local11 = local11 + "7)" + Static89.aClass1_Sub28_Sub1_1.method4260(Static526.anInt8926) + "|";
			local11 = local11 + "8)" + Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926) + "|";
			local11 = local11 + "9)" + Static89.aClass1_Sub28_Sub1_1.aBoolean315 + "|";
			local11 = local11 + "10)" + Static89.aClass1_Sub28_Sub1_1.aBoolean323 + "|";
			local11 = local11 + "11)" + Static89.aClass1_Sub28_Sub1_1.aBoolean330 + "|";
			local11 = local11 + "12)" + Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926) + "|";
			local11 = local11 + "13)" + Static318.anInt6040 + "|";
			local11 = local11 + "14)" + Static51.anInt7926;
			try {
				local11 = local11 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(226) Throwable local226) {
			}
			try {
				if (Static526.anInt8926 == 2) {
					@Pc(234) Class local234 = Class.forName("java.lang.ClassLoader");
					@Pc(238) Field local238 = local234.getDeclaredField("nativeLibraries");
					@Pc(241) Class local241 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(251) Method local251 = local241.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local251.invoke(local238, Boolean.TRUE);
					@Pc(274) Vector local274 = (Vector) local238.get(client.class.getClassLoader());
					for (@Pc(276) int local276 = 0; local274.size() > local276; local276++) {
						try {
							@Pc(281) Object local281 = local274.elementAt(local276);
							@Pc(286) Field local286 = local281.getClass().getDeclaredField("name");
							local251.invoke(local286, Boolean.TRUE);
							try {
								@Pc(301) String local301 = (String) local286.get(local281);
								if (local301 != null && local301.indexOf("sw3d.dll") != -1) {
									@Pc(313) Field local313 = local281.getClass().getDeclaredField("handle");
									local251.invoke(local313, Boolean.TRUE);
									local11 = local11 + "|16)" + Long.toHexString(local313.getLong(local281));
									local251.invoke(local313, Boolean.FALSE);
								}
							} catch (@Pc(349) Throwable local349) {
							}
							local251.invoke(local286, Boolean.FALSE);
						} catch (@Pc(361) Throwable local361) {
						}
					}
				}
			} catch (@Pc(369) Throwable local369) {
			}
			local11 = local11 + "]";
		} catch (@Pc(380) Throwable local380) {
		}
		return local11;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1720() {
		if (Static526.anInt8926 != 2) {
			this.method1747();
			return;
		}
		try {
			this.method1747();
		} catch (@Pc(20) Throwable local20) {
			Static41.method1359(local20, local20.getMessage() + " (Recovered) " + this.method1732());
			Static508.method7307(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method1753(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg0);
		while (true) {
			@Pc(17) int local17 = local13.method3043();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static58.anInt1960 = local13.method3056();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method1754() {
		@Pc(19) int local19;
		if (Static51.anInt7926 == 6 && Static546.anInt9466 == 0) {
			if (Static228.anInt8958 > 1) {
				Static136.anInt3211 = Static418.anInt7279;
				Static228.anInt8958--;
			}
			if (!Static25.aBoolean94) {
				Static515.method7351();
			}
			for (local19 = 0; local19 < 100 && Static126.method2777(); local19++) {
			}
		}
		Static309.anInt5936++;
		Static21.method868(null, -1, -1);
		Static55.method1546(-1, -1, null);
		Static255.method4302();
		Static418.anInt7279++;
		for (local19 = 0; local19 < Static198.anInt4112; local19++) {
			@Pc(62) Class47_Sub2_Sub3_Sub1 local62 = Static395.aClass1_Sub10Array1[local19].aClass47_Sub2_Sub3_Sub1_2;
			if (local62 != null) {
				@Pc(68) byte local68 = local62.aClass238_1.aByte79;
				if ((local68 & 0x1) != 0) {
					@Pc(79) int local79 = local62.method4350();
					@Pc(103) int local103;
					if ((local68 & 0x2) != 0 && local62.anInt5082 == 0 && Math.random() * 1000.0D < 10.0D) {
						local103 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(111) int local111 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local103 != 0 || local111 != 0) {
							@Pc(126) int local126 = local62.anIntArray362[0] + local103;
							if (local126 < 0) {
								local126 = 0;
							} else if (Static542.anInt9387 - local79 - 1 < local126) {
								local126 = Static542.anInt9387 - local79 - 1;
							}
							@Pc(160) int local160 = local62.anIntArray361[0] + local111;
							if (local160 < 0) {
								local160 = 0;
							} else if (Static36.anInt1324 - local79 - 1 < local160) {
								local160 = Static36.anInt1324 - local79 - 1;
							}
							@Pc(209) int local209 = Static470.method5658(0, local160, 0, local126, local62.anIntArray361[0], Static519.anIntArray760, local79, true, Static70.aClass299Array1[local62.aByte94], -1, local79, local62.anIntArray362[0], Static329.anIntArray457, local79);
							if (local209 > 0) {
								if (local209 > 9) {
									local209 = 9;
								}
								for (@Pc(218) int local218 = 0; local218 < local209; local218++) {
									local62.anIntArray362[local218] = Static519.anIntArray760[local209 - local218 - 1];
									local62.anIntArray361[local218] = Static329.anIntArray457[local209 - local218 - 1];
									local62.aByteArray68[local218] = 1;
								}
								local62.anInt5082 = local209;
							}
						}
					}
					Static195.method3630(true, local62);
					local103 = Static338.method5480(local62);
					Static478.method6930(Static118.anInt2859, local62, Static533.anInt9236, local103);
					Static231.method6235(local62);
				}
			}
		}
		if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
			if (Static464.anInt8003 == 2) {
				Static210.method3823();
			} else {
				Static294.method4944();
			}
			if (Static308.anInt5918 >> 7 < 14 || Static542.anInt9387 - 14 <= Static308.anInt5918 >> 7 || Static347.anInt6404 >> 7 < 14 || Static347.anInt6404 >> 7 >= Static36.anInt1324 - 14) {
				Static146.method2995();
			}
		}
		while (true) {
			@Pc(342) Class1_Sub40 local342;
			@Pc(347) Class309 local347;
			@Pc(355) Class309 local355;
			do {
				local342 = (Class1_Sub40) Static237.aClass38_35.method1423();
				if (local342 == null) {
					while (true) {
						do {
							local342 = (Class1_Sub40) Static111.aClass38_22.method1423();
							if (local342 == null) {
								while (true) {
									do {
										local342 = (Class1_Sub40) Static524.aClass38_75.method1423();
										if (local342 == null) {
											if (Static279.aClass309_6 != null) {
												Static34.method1306();
											}
											if (Static416.anInt7252 % 1500 == 0) {
												Static274.method4671();
											}
											if (Static51.anInt7926 == 6 && Static546.anInt9466 == 0) {
												Static373.method5708();
											}
											Static460.method6783();
											if (Static538.aBoolean651 && Static132.aLong82 < Static93.method2172() - 60000L) {
												Static466.method6817();
											}
											for (@Pc(511) Class2_Sub4_Sub2 local511 = (Class2_Sub4_Sub2) Static201.aClass145_4.method3919(); local511 != null; local511 = (Class2_Sub4_Sub2) Static201.aClass145_4.method3926()) {
												if (Static93.method2172() / 1000L - 5L > (long) local511.anInt6564) {
													if (local511.aShort98 > 0) {
														Static310.method5136("", "", 5, 0, local511.aString60 + Static111.aClass114_54.method3330(Static315.anInt5993));
													}
													if (local511.aShort98 == 0) {
														Static310.method5136("", "", 5, 0, local511.aString60 + Static28.aClass114_16.method3330(Static315.anInt5993));
													}
													local511.method7890();
												}
											}
											if (Static51.anInt7926 == 6 && Static546.anInt9466 == 0) {
												if (Static453.aClass154_1 == null) {
													Static140.method2961(false);
													return;
												}
												Static288.anInt5629++;
												if (Static288.anInt5629 > 50) {
													Static444.method6416(Static438.aClass186_36);
												}
												try {
													if (Static453.aClass154_1 != null && Static192.aClass1_Sub13_Sub2_1.anInt3400 > 0) {
														Static178.anInt3816 += Static192.aClass1_Sub13_Sub2_1.anInt3400;
														Static453.aClass154_1.method4023(Static192.aClass1_Sub13_Sub2_1.anInt3400, Static192.aClass1_Sub13_Sub2_1.aByteArray45);
														Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
														Static288.anInt5629 = 0;
														return;
													}
												} catch (@Pc(633) IOException local633) {
													Static140.method2961(false);
													return;
												}
											}
											return;
										}
										local347 = local342.aClass309_10;
										if (local347.anInt8726 < 0) {
											break;
										}
										local355 = Static80.method2005(local347.anInt8764);
									} while (local355 == null || local355.lb == null || local355.lb.length <= local347.anInt8726 || local355.lb[local347.anInt8726] != local347);
									Static387.method5838(local342);
								}
							}
							local347 = local342.aClass309_10;
							if (local347.anInt8726 < 0) {
								break;
							}
							local355 = Static80.method2005(local347.anInt8764);
						} while (local355 == null || local355.lb == null || local355.lb.length <= local347.anInt8726 || local347 != local355.lb[local347.anInt8726]);
						Static387.method5838(local342);
					}
				}
				local347 = local342.aClass309_10;
				if (local347.anInt8726 < 0) {
					break;
				}
				local355 = Static80.method2005(local347.anInt8764);
			} while (local355 == null || local355.lb == null || local355.lb.length <= local347.anInt8726 || local355.lb[local347.anInt8726] != local347);
			Static387.method5838(local342);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1758() {
		@Pc(8) int local8;
		if (!Static89.aClass1_Sub28_Sub1_1.aBoolean326) {
			for (local8 = 0; local8 < Static11.anInt130; local8++) {
				if (Static193.anInterface2Array2[local8].method7096() == 's' || Static193.anInterface2Array2[local8].method7096() == 'S') {
					Static89.aClass1_Sub28_Sub1_1.aBoolean326 = true;
					break;
				}
			}
		}
		@Pc(54) int local54;
		if (Static37.anInt1330 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local54 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(57) long local57 = Static93.method2172();
			if (Static118.aLong70 == 0L) {
				Static118.aLong70 = local57;
			}
			if (local54 > 16384 && local57 - Static118.aLong70 < 5000L) {
				if (local57 - Static233.aLong118 > 1000L) {
					System.gc();
					Static233.aLong118 = local57;
				}
				Static68.aString10 = Static197.aClass114_86.method3330(Static315.anInt5993);
				Static262.anInt5137 = 5;
			} else {
				Static68.aString10 = Static432.aClass114_145.method3330(Static315.anInt5993);
				Static262.anInt5137 = 5;
				Static37.anInt1330 = 10;
			}
		} else if (Static37.anInt1330 == 10) {
			for (local8 = 0; local8 < 4; local8++) {
				Static70.aClass299Array1[local8] = Static399.method6010(Static542.anInt9387, Static36.anInt1324);
			}
			Static68.aString10 = Static89.aClass114_50.method3330(Static315.anInt5993);
			Static37.anInt1330 = 20;
			Static262.anInt5137 = 10;
		} else if (Static37.anInt1330 == 20) {
			if (Static514.aClass218_1 == null) {
				Static514.aClass218_1 = new Class218(Static181.aClass115_2, Static147.aClass147_2, Static538.aBigInteger7, Static18.aBigInteger1);
			}
			if (Static514.aClass218_1.method5554()) {
				Static149.aClass160_65 = Static337.method5474(true, false, 0);
				Static44.aClass160_9 = Static337.method5474(true, false, 1);
				Static68.aClass160_17 = Static337.method5474(true, false, 2);
				Static336.aClass160_72 = Static337.method5474(true, false, 3);
				Static51.aClass160_93 = Static337.method5474(true, false, 4);
				Static350.aClass160_74 = Static337.method5474(true, true, 5);
				Static45.aClass160_10 = Static337.method5474(false, true, 6);
				Static118.aClass160_26 = Static337.method5474(true, false, 7);
				Static390.aClass160_80 = Static337.method5474(true, false, 8);
				Static105.aClass160_20 = Static337.method5474(true, false, 9);
				Static239.aClass160_52 = Static337.method5474(true, false, 10);
				Static386.aClass160_79 = Static337.method5474(true, false, 11);
				Static214.aClass160_48 = Static337.method5474(true, false, 12);
				Static309.aClass160_69 = Static337.method5474(true, false, 13);
				Static42.aClass160_8 = Static337.method5474(false, false, 14);
				Static517.aClass160_100 = Static337.method5474(true, false, 15);
				Static439.aClass160_71 = Static337.method5474(true, false, 16);
				Static76.aClass160_18 = Static337.method5474(true, false, 17);
				Static154.aClass160_34 = Static337.method5474(true, false, 18);
				Static542.aClass160_105 = Static337.method5474(true, false, 19);
				Static223.aClass160_49 = Static337.method5474(true, false, 20);
				Static153.aClass160_33 = Static337.method5474(true, false, 21);
				Static316.aClass160_103 = Static337.method5474(true, false, 22);
				Static115.aClass160_24 = Static337.method5474(true, true, 23);
				Static513.aClass160_99 = Static337.method5474(true, false, 24);
				Static322.aClass160_28 = Static337.method5474(true, false, 25);
				Static447.aClass160_92 = Static337.method5474(true, true, 26);
				Static62.aClass160_16 = Static337.method5474(true, false, 27);
				Static356.aClass160_77 = Static337.method5474(true, true, 28);
				Static474.aClass160_55 = Static337.method5474(true, false, 29);
				Static261.aClass160_59 = Static337.method5474(true, true, 30);
				Static40.aClass160_5 = Static337.method5474(true, true, 31);
				Static68.aString10 = Static300.aClass114_110.method3330(Static315.anInt5993);
				Static37.anInt1330 = 30;
				Static262.anInt5137 = 15;
			} else {
				Static68.aString10 = Static56.aClass114_28.method3330(Static315.anInt5993);
				Static262.anInt5137 = 12;
			}
		} else if (Static37.anInt1330 == 30) {
			local8 = 0;
			for (local54 = 0; local54 < 32; local54++) {
				local8 += Static224.aClass87_Sub1Array1[local54].method2847() * Static73.anIntArray169[local54] / 100;
			}
			if (local8 == 100) {
				Static68.aString10 = Static536.aClass114_170.method3330(Static315.anInt5993);
				Static262.anInt5137 = 20;
				Static350.method5564(Static390.aClass160_80);
				Static2.method4831(Static390.aClass160_80);
				Static37.anInt1330 = 35;
			} else {
				if (local8 != 0) {
					Static68.aString10 = Static68.aClass114_39.method3330(Static315.anInt5993) + local8 + "%";
				}
				Static262.anInt5137 = 20;
			}
		} else if (Static37.anInt1330 == 35) {
			Static143.method2985(Static261.aClass160_59, Static91.aClass182_2);
			Static68.aString10 = Static487.aClass114_159.method3330(Static315.anInt5993);
			Static37.anInt1330 = 40;
			Static262.anInt5137 = 20;
		} else if (Static37.anInt1330 == 40) {
			if (Static356.aClass160_77.method4200()) {
				this.method1744(Static356.aClass160_77.method4216(1));
				this.method1753(Static356.aClass160_77.method4216(3));
				if (Static58.anInt1960 == -1 || Static118.aClass160_26.method4212(0, Static58.anInt1960)) {
					Static68.aString10 = Static107.aClass114_53.method3330(Static315.anInt5993);
					Static262.anInt5137 = 25;
					Static37.anInt1330 = 41;
				}
			} else {
				Static68.aString10 = Static146.aClass114_65.method3330(Static315.anInt5993) + Static356.aClass160_77.method4192() + "%";
				Static262.anInt5137 = 25;
			}
		} else if (Static37.anInt1330 == 41) {
			local8 = Static432.method6372("jaggl");
			if (local8 >= 0 && local8 < 100) {
				Static68.aString10 = Static377.aClass114_130.method3330(Static315.anInt5993) + local8 + "%";
				Static262.anInt5137 = 25;
			} else {
				Static68.aString10 = Static290.aClass114_135.method3330(Static315.anInt5993);
				Static37.anInt1330 = 42;
				Static262.anInt5137 = 25;
			}
		} else if (Static37.anInt1330 == 42) {
			local8 = Static432.method6372("jagdx");
			if (local8 >= 0 && local8 < 100) {
				Static68.aString10 = Static151.aClass114_66.method3330(Static315.anInt5993) + local8 + "%";
				Static262.anInt5137 = 25;
			} else {
				Static68.aString10 = Static511.aClass114_173.method3330(Static315.anInt5993);
				Static262.anInt5137 = 25;
				Static37.anInt1330 = 43;
			}
		} else if (Static37.anInt1330 == 43) {
			local8 = Static432.method6372("jagmisc");
			if (local8 >= 0 && local8 < 100) {
				Static68.aString10 = Static271.aClass114_34.method3330(Static315.anInt5993) + local8 + "%";
				Static262.anInt5137 = 25;
			} else {
				if (local8 == 100) {
					this.method1731();
				}
				Static68.aString10 = Static293.aClass114_69.method3330(Static315.anInt5993);
				Static262.anInt5137 = 25;
				Static37.anInt1330 = 44;
			}
		} else if (Static37.anInt1330 == 44) {
			local8 = Static432.method6372("sw3d");
			if (local8 >= 0 && local8 < 100) {
				Static68.aString10 = Static28.aClass114_15.method3330(Static315.anInt5993) + local8 + "%";
				Static262.anInt5137 = 25;
			} else {
				Static68.aString10 = Static443.aClass114_147.method3330(Static315.anInt5993);
				Static262.anInt5137 = 25;
				Static37.anInt1330 = 45;
			}
		} else if (Static37.anInt1330 == 45) {
			local8 = Static432.method6372("jaclib");
			if (local8 >= 0 && local8 < 100) {
				Static68.aString10 = Static462.aClass114_152.method3330(Static315.anInt5993) + local8 + "%";
				Static262.anInt5137 = 25;
			} else {
				if (local8 == 100) {
					this.method1738();
				}
				Static68.aString10 = Static413.aClass114_140.method3330(Static315.anInt5993);
				Static37.anInt1330 = 46;
				Static262.anInt5137 = 25;
			}
		} else if (Static37.anInt1330 == 46) {
			local8 = Static432.method6372("hw3d");
			if (local8 >= 0 && local8 < 100) {
				Static68.aString10 = Static14.aClass114_3.method3330(Static315.anInt5993) + local8 + "%";
				Static262.anInt5137 = 25;
			} else {
				Static68.aString10 = Static473.aClass114_154.method3330(Static315.anInt5993);
				Static37.anInt1330 = 47;
				Static262.anInt5137 = 25;
			}
		} else if (Static37.anInt1330 == 47) {
			if (Static40.aClass160_5.method4200()) {
				Static68.aString10 = Static258.aClass114_99.method3330(Static315.anInt5993);
				Static262.anInt5137 = 25;
				Static37.anInt1330 = 50;
			} else {
				Static68.aString10 = Static436.aClass114_146.method3330(Static315.anInt5993);
				Static262.anInt5137 = 25;
			}
		} else if (Static37.anInt1330 == 50) {
			Static135.method2903();
			Static68.aString10 = Static231.aClass114_142.method3330(Static315.anInt5993);
			Static37.anInt1330 = 60;
			Static262.anInt5137 = 30;
		} else if (Static37.anInt1330 == 60) {
			local8 = Static225.method3956(Static309.aClass160_69, Static390.aClass160_80);
			local54 = Static45.method1407();
			if (local8 < local54) {
				Static68.aString10 = Static324.aClass114_116.method3330(Static315.anInt5993) + local8 * 100 / local54 + "%";
				Static262.anInt5137 = 35;
			} else {
				Static68.aString10 = Static127.aClass114_58.method3330(Static315.anInt5993);
				Static37.anInt1330 = 70;
				Static262.anInt5137 = 35;
			}
		} else if (Static37.anInt1330 == 70) {
			local8 = Static537.method7856(Static390.aClass160_80);
			local54 = Static327.method5347();
			if (local54 > local8) {
				Static68.aString10 = Static161.aClass114_74.method3330(Static315.anInt5993) + local8 * 100 / local54 + "%";
				Static262.anInt5137 = 40;
			} else {
				Static68.aString10 = Static287.aClass114_108.method3330(Static315.anInt5993);
				Static37.anInt1330 = 80;
				Static262.anInt5137 = 40;
			}
		} else if (Static37.anInt1330 == 80) {
			if (Static447.aClass160_92.method4200()) {
				Static389.anInterface8_10 = new Class292(Static447.aClass160_92, Static105.aClass160_20, Static390.aClass160_80);
				Static68.aString10 = Static377.aClass114_131.method3330(Static315.anInt5993);
				Static37.anInt1330 = 90;
				Static262.anInt5137 = 45;
			} else {
				Static68.aString10 = Static160.aClass114_73.method3330(Static315.anInt5993) + Static447.aClass160_92.method4192() + "%";
				Static262.anInt5137 = 45;
			}
		} else if (Static37.anInt1330 == 90) {
			Static68.aString10 = Static141.aClass114_61.method3330(Static315.anInt5993);
			Static262.anInt5137 = 50;
			Static37.anInt1330 = 95;
		} else if (Static37.anInt1330 == 95) {
			if (Static89.aClass1_Sub28_Sub1_1.aBoolean326) {
				Static89.aClass1_Sub28_Sub1_1.anInt4912 = 0;
				Static89.aClass1_Sub28_Sub1_1.anInt4907 = 0;
				Static89.aClass1_Sub28_Sub1_1.anInt4890 = 0;
				Static89.aClass1_Sub28_Sub1_1.anInt4905 = 0;
				Static89.aClass1_Sub28_Sub1_1.anInt4904 = 1;
			}
			Static89.aClass1_Sub28_Sub1_1.aBoolean326 = true;
			Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
			Static21.method867(false, Static89.aClass1_Sub28_Sub1_1.anInt4912);
			Static68.aString10 = Static226.aClass114_93.method3330(Static315.anInt5993);
			Static262.anInt5137 = 55;
			Static37.anInt1330 = 100;
		} else if (Static37.anInt1330 == 100) {
			Static304.method5079(Static478.aClass9_10, Static309.aClass160_69, Static390.aClass160_80);
			Static68.aString10 = Static202.aClass114_117.method3330(Static315.anInt5993);
			Static262.anInt5137 = 60;
			Static265.method4401(1);
			Static37.anInt1330 = 110;
		} else if (Static37.anInt1330 == 110) {
			Static68.aClass160_17.method4200();
			local8 = Static68.aClass160_17.method4192();
			Static439.aClass160_71.method4200();
			local8 += Static439.aClass160_71.method4192();
			Static76.aClass160_18.method4200();
			local8 += Static76.aClass160_18.method4192();
			Static154.aClass160_34.method4200();
			local8 += Static154.aClass160_34.method4192();
			Static542.aClass160_105.method4200();
			local8 += Static542.aClass160_105.method4192();
			Static223.aClass160_49.method4200();
			local8 += Static223.aClass160_49.method4192();
			Static153.aClass160_33.method4200();
			local8 += Static153.aClass160_33.method4192();
			Static316.aClass160_103.method4200();
			local8 += Static316.aClass160_103.method4192();
			Static513.aClass160_99.method4200();
			local8 += Static513.aClass160_99.method4192();
			Static322.aClass160_28.method4200();
			local8 += Static322.aClass160_28.method4192();
			Static62.aClass160_16.method4200();
			local8 += Static62.aClass160_16.method4192();
			Static474.aClass160_55.method4200();
			local8 += Static474.aClass160_55.method4192();
			if (local8 < 1200) {
				Static68.aString10 = Static23.aClass114_12.method3330(Static315.anInt5993) + local8 / 12 + "%";
				Static262.anInt5137 = 65;
			} else {
				Static162.aClass98_11 = new Class98(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static109.aClass18_1 = new Class18(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static530.aClass137_2 = new Class137(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17, Static390.aClass160_80);
				Static459.aClass240_1 = new Class240(Static538.aClass37_4, Static315.anInt5993, Static76.aClass160_18);
				Static441.aClass81_6 = new Class81(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static88.aClass40_1 = new Class40(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static489.aClass34_2 = new Class34(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17, Static118.aClass160_26);
				Static325.aClass55_4 = new Class55(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static294.aClass119_1 = new Class119(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static365.aClass194_6 = new Class194(Static538.aClass37_4, Static315.anInt5993, true, Static439.aClass160_71, Static118.aClass160_26);
				Static167.aClass250_4 = new Class250(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17, Static390.aClass160_80);
				Static198.aClass165_3 = new Class165(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17, Static390.aClass160_80);
				Static345.aClass222_1 = new Class222(Static538.aClass37_4, Static315.anInt5993, true, Static154.aClass160_34, Static118.aClass160_26);
				Static454.aClass153_2 = new Class153(Static538.aClass37_4, Static315.anInt5993, true, Static162.aClass98_11, Static542.aClass160_105, Static118.aClass160_26);
				Static182.aClass133_1 = new Class133(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static6.aClass126_1 = new Class126(Static538.aClass37_4, Static315.anInt5993, Static223.aClass160_49, Static149.aClass160_65, Static44.aClass160_9);
				Static27.aClass310_1 = new Class310(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static86.aClass254_1 = new Class254(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static529.aClass90_2 = new Class90(Static538.aClass37_4, Static315.anInt5993, Static153.aClass160_33, Static118.aClass160_26);
				Static90.aClass229_1 = new Class229(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static383.aClass303_9 = new Class303(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static221.aClass263_1 = new Class263(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static483.aClass187_1 = new Class187(Static538.aClass37_4, Static315.anInt5993, Static316.aClass160_103);
				Static133.aClass173_1 = new Class173(Static538.aClass37_4, Static315.anInt5993, Static68.aClass160_17);
				Static416.method6210(Static118.aClass160_26, Static336.aClass160_72, Static309.aClass160_69, Static390.aClass160_80);
				Static481.method6974(Static474.aClass160_55);
				Static459.aClass264_1 = new Class264(Static315.anInt5993, Static513.aClass160_99, Static322.aClass160_28);
				Static111.aClass109_1 = new Class109(Static315.anInt5993, Static513.aClass160_99, Static322.aClass160_28, new Class320());
				Static68.aString10 = Static516.aClass114_165.method3330(Static315.anInt5993);
				Static262.anInt5137 = 65;
				Static461.method6786();
				Static365.aClass194_6.method5077(!Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926));
				Static343.aClass286_1 = new Class286();
				Static418.method6218();
				Static332.method5436(Static62.aClass160_16);
				Static487.method7048(Static118.aClass160_26, Static389.anInterface8_10);
				Static37.anInt1330 = 120;
			}
		} else if (Static37.anInt1330 == 120) {
			local8 = Static13.method713(Static390.aClass160_80);
			local54 = Static379.method5780();
			if (local54 > local8) {
				Static68.aString10 = Static4.aClass114_1.method3330(Static315.anInt5993) + local8 * 100 / local54 + "%";
				Static262.anInt5137 = 70;
			} else {
				Static215.method3858(Static390.aClass160_80, Static478.aClass9_10);
				Static135.method2902(Static107.aClass12Array9);
				Static68.aString10 = Static132.aClass114_59.method3330(Static315.anInt5993);
				Static37.anInt1330 = 130;
				Static262.anInt5137 = 70;
			}
		} else if (Static37.anInt1330 == 130) {
			if (Static239.aClass160_52.method4221("", "huffman")) {
				@Pc(1591) Class283 local1591 = new Class283(Static239.aClass160_52.method4222("", "huffman"));
				Static248.method4220(local1591);
				Static68.aString10 = Static323.aClass114_114.method3330(Static315.anInt5993);
				Static262.anInt5137 = 75;
				Static37.anInt1330 = 140;
			} else {
				Static68.aString10 = Static43.aClass114_20.method3330(Static315.anInt5993) + "0%";
				Static262.anInt5137 = 75;
			}
		} else if (Static37.anInt1330 == 140) {
			if (Static336.aClass160_72.method4200()) {
				Static68.aString10 = Static372.aClass114_128.method3330(Static315.anInt5993);
				Static37.anInt1330 = 150;
				Static262.anInt5137 = 80;
			} else {
				Static68.aString10 = Static442.aClass114_151.method3330(Static315.anInt5993) + Static336.aClass160_72.method4192() + "%";
				Static262.anInt5137 = 80;
			}
		} else if (Static37.anInt1330 == 150) {
			if (Static214.aClass160_48.method4200()) {
				Static68.aString10 = Static49.aClass114_23.method3330(Static315.anInt5993);
				Static262.anInt5137 = 82;
				Static37.anInt1330 = 160;
			} else {
				Static68.aString10 = Static311.aClass114_111.method3330(Static315.anInt5993) + Static214.aClass160_48.method4192() + "%";
				Static262.anInt5137 = 82;
			}
		} else if (Static37.anInt1330 == 160) {
			if (Static309.aClass160_69.method4200()) {
				Static68.aString10 = Static54.aClass114_85.method3330(Static315.anInt5993);
				Static37.anInt1330 = 170;
				Static262.anInt5137 = 85;
			} else {
				Static68.aString10 = Static54.aClass114_85.method3330(Static315.anInt5993) + Static309.aClass160_69.method4192() + "%";
				Static262.anInt5137 = 85;
			}
		} else if (Static37.anInt1330 == 170) {
			if (Static115.aClass160_24.method4219("details")) {
				Static451.method3232(Static115.aClass160_24, Static441.aClass81_6, Static88.aClass40_1, Static365.aClass194_6, Static167.aClass250_4, Static198.aClass165_3, Static343.aClass286_1);
				Static68.aString10 = Static324.aClass114_115.method3330(Static315.anInt5993);
				Static37.anInt1330 = 190;
				Static262.anInt5137 = 89;
			} else {
				Static68.aString10 = Static167.aClass114_76.method3330(Static315.anInt5993) + Static115.aClass160_24.method4194("details") + "%";
				Static262.anInt5137 = 87;
			}
		} else if (Static37.anInt1330 == 190) {
			Static52.anIntArray138 = new int[Static221.aClass263_1.anInt7458];
			Static99.aBooleanArray12 = new boolean[Static221.aClass263_1.anInt7458];
			Static29.aStringArray5 = new String[Static383.aClass303_9.anInt8625];
			for (local8 = 0; local8 < Static221.aClass263_1.anInt7458; local8++) {
				if (Static221.aClass263_1.method6375(local8).anInt5510 == 0) {
					Static99.aBooleanArray12[local8] = true;
					Static360.anInt9308++;
				}
				Static52.anIntArray138[local8] = -1;
			}
			Static519.method7411();
			Static72.anInt2013 = Static336.aClass160_72.method4199("loginscreen");
			Static90.anInt2328 = Static336.aClass160_72.method4199("lobbyscreen");
			Static350.aClass160_74.method4214(false);
			Static45.aClass160_10.method4214(true);
			Static390.aClass160_80.method4214(true);
			Static309.aClass160_69.method4214(true);
			Static239.aClass160_52.method4214(true);
			Static336.aClass160_72.method4214(true);
			Static6.aBoolean6 = true;
			Static68.aClass160_17.anInt4800 = 2;
			Static76.aClass160_18.anInt4800 = 2;
			Static439.aClass160_71.anInt4800 = 2;
			Static154.aClass160_34.anInt4800 = 2;
			Static542.aClass160_105.anInt4800 = 2;
			Static223.aClass160_49.anInt4800 = 2;
			Static153.aClass160_33.anInt4800 = 2;
			Static63.method1764(false, Static89.aClass1_Sub28_Sub1_1.anInt4904, -1, -1);
			Static68.aString10 = Static433.aClass114_157.method3330(Static315.anInt5993);
			Static37.anInt1330 = 200;
			Static262.anInt5137 = 95;
		} else if (Static37.anInt1330 == 200) {
			Static265.method4401(2);
		}
	}
}
