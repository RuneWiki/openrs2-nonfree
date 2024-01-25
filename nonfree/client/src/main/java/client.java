import java.awt.Canvas;
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
				Static536.method7643("Argument count");
			}
			Static511.aClass337_4 = new Class337();
			Static511.aClass337_4.anInt9843 = Integer.parseInt(arg0[0]);
			Static368.aClass337_5 = new Class337();
			Static368.aClass337_5.anInt9843 = Integer.parseInt(arg0[1]);
			Static373.aClass337_6 = new Class337();
			Static373.aClass337_6.anInt9843 = Integer.parseInt(arg0[2]);
			Static513.aClass240_7 = Static12.aClass240_1;
			if (arg0[3].equals("live")) {
				Static668.aClass222_8 = Static370.aClass222_7;
			} else if (arg0[3].equals("rc")) {
				Static668.aClass222_8 = Static105.aClass222_1;
			} else if (arg0[3].equals("wip")) {
				Static668.aClass222_8 = Static276.aClass222_6;
			} else {
				Static536.method7643("modewhat");
			}
			Static232.anInt4258 = Static169.method2764(arg0[4]);
			if (Static232.anInt4258 == -1) {
				if (arg0[4].equals("english")) {
					Static232.anInt4258 = 0;
				} else if (arg0[4].equals("german")) {
					Static232.anInt4258 = 1;
				} else {
					Static536.method7643("language");
				}
			}
			Static116.aBoolean192 = false;
			Static592.aBoolean153 = false;
			if (arg0[5].equals("game0")) {
				Static630.aClass77_8 = Static174.aClass77_11;
			} else if (arg0[5].equals("game1")) {
				Static630.aClass77_8 = Static635.aClass77_9;
			} else if (arg0[5].equals("game2")) {
				Static630.aClass77_8 = Static43.aClass77_1;
			} else if (arg0[5].equals("game3")) {
				Static630.aClass77_8 = Static332.aClass77_5;
			} else {
				Static536.method7643("game");
			}
			Static87.aBoolean164 = false;
			Static472.anInt8235 = 0;
			Static120.aBoolean645 = true;
			Static524.aBoolean638 = true;
			Static289.aBoolean343 = false;
			Static89.aString23 = null;
			Static334.anInt6331 = 0;
			Static557.anInt9476 = Static630.aClass77_8.anInt2295;
			Static273.aString55 = "";
			Static598.aLong266 = 0L;
			Static349.anInt6487 = 0;
			Static436.aByteArray90 = null;
			@Pc(184) client local184 = new client();
			Static243.aClient1 = local184;
			local184.method1463(Static668.aClass222_8.method5299() + 32, Static630.aClass77_8.aString27);
			Static339.aFrame2.setLocation(40, 40);
		} catch (@Pc(207) Exception local207) {
			Static524.method7532((String) null, local207);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1468(@OriginalArg(0) int arg0) {
		Static394.anInt7289 = 0;
		Static204.aClass135_8.anInt3735++;
		Static204.aClass135_8.anInt3734 = arg0;
		Static516.aClass329_2 = null;
		Static135.aClass150_3 = null;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1455() {
		if (Static354.aBoolean460) {
			Static559.method7855();
		}
		Static219.method3421();
		if (Static677.aClass137_47 != null) {
			Static677.aClass137_47.method7935();
		}
		if (Static628.aFrame3 != null) {
			Static100.method1801(Static628.aFrame3, Static234.aClass333_5);
			Static628.aFrame3 = null;
		}
		if (Static258.aClass97_2 != null) {
			Static258.aClass97_2.method2286();
			Static258.aClass97_2 = null;
		}
		Static502.method7352();
		Static204.aClass135_8.method3059();
		Static386.aClass298_2.method7425();
		if (Static7.aClass361_1 != null) {
			Static7.aClass361_1.method8680();
			Static7.aClass361_1 = null;
		}
		try {
			Static388.aClass179_2.method4025();
			for (@Pc(51) int local51 = 0; local51 < 37; local51++) {
				Static438.aClass179Array1[local51].method4025();
			}
			Static52.aClass179_1.method4025();
			Static426.aClass179_3.method4025();
			Static336.method5256();
		} catch (@Pc(72) Exception local72) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1469() {
		if (Static430.anInt7691 == 14) {
			return;
		}
		@Pc(17) long local17 = Static393.method5912() / 1000000L - Static678.aLong304;
		Static678.aLong304 = Static393.method5912() / 1000000L;
		@Pc(25) boolean local25 = Static117.method9148();
		if (local25 && Static275.aBoolean329 && Static113.aClass112_2 != null) {
			Static113.aClass112_2.method5389();
		}
		if (Static550.method7769(Static430.anInt7691)) {
			if (Static559.aLong253 != 0L && Static521.method7499() > Static559.aLong253) {
				Static437.method6438(Static266.anInt4667, Static526.anInt9133, false, Static482.method7137());
			} else if (!Static677.aClass137_47.method7888() && Static68.aBoolean120) {
				Static349.method5325();
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		if (Static628.aFrame3 == null) {
			@Pc(71) Container local71;
			if (Static339.aFrame2 != null) {
				local71 = Static339.aFrame2;
			} else if (Static645.anApplet2 == null) {
				local71 = Static164.anApplet_Sub1_1;
			} else {
				local71 = Static645.anApplet2;
			}
			local83 = local71.getSize().width;
			local87 = local71.getSize().height;
			if (local71 == Static339.aFrame2) {
				@Pc(93) Insets local93 = Static339.aFrame2.getInsets();
				local87 -= local93.bottom + local93.top;
				local83 -= local93.left + local93.right;
			}
			if (Static69.anInt1570 != local83 || local87 != Static572.anInt9840 || Static6.aBoolean3) {
				if (Static677.aClass137_47 == null || Static677.aClass137_47.method7911()) {
					Static230.method3499();
				} else {
					Static69.anInt1570 = local83;
					Static572.anInt9840 = local87;
				}
				Static559.aLong253 = Static521.method7499() + 500L;
				Static6.aBoolean3 = false;
			}
		}
		if (Static628.aFrame3 != null && !Static645.aBoolean743 && Static550.method7769(Static430.anInt7691)) {
			Static437.method6438(-1, -1, false, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081());
		}
		@Pc(159) boolean local159 = false;
		if (Static43.aBoolean92) {
			Static43.aBoolean92 = false;
			local159 = true;
		}
		if (local159) {
			Static357.method5405();
		}
		if (Static677.aClass137_47 != null && Static677.aClass137_47.method7888() || Static482.method7137() != 1) {
			Static31.method720();
		}
		if (Static323.method5092(Static430.anInt7691)) {
			Static378.method5621(local159);
		} else if (Static181.method2291(Static430.anInt7691)) {
			Static486.method7230();
		} else if (Static531.method7619(Static430.anInt7691)) {
			Static486.method7230();
		} else if (Static570.method8182(Static430.anInt7691)) {
			if (Static101.anInt2153 == 1) {
				if (Static314.anInt5979 < Static536.anInt9243) {
					Static314.anInt5979 = Static536.anInt9243;
				}
				local83 = (Static314.anInt5979 - Static536.anInt9243) * 50 / Static314.anInt5979;
				Static88.method8992(Static242.aClass38_5, true, Static677.aClass137_47, Static514.aClass303_14.method7473(Static232.anInt4258) + "<br>(" + local83 + "%)", Static586.aClass158_12);
			} else if (Static101.anInt2153 == 2) {
				if (Static55.anInt1383 > Static193.anInt3595) {
					Static193.anInt3595 = Static55.anInt1383;
				}
				local83 = (Static193.anInt3595 - Static55.anInt1383) * 50 / Static193.anInt3595 + 50;
				Static88.method8992(Static242.aClass38_5, true, Static677.aClass137_47, Static514.aClass303_14.method7473(Static232.anInt4258) + "<br>(" + local83 + "%)", Static586.aClass158_12);
			} else {
				Static88.method8992(Static242.aClass38_5, true, Static677.aClass137_47, Static514.aClass303_14.method7473(Static232.anInt4258), Static586.aClass158_12);
			}
		} else if (Static430.anInt7691 == 10) {
			Static552.method7777(local17);
		} else if (Static430.anInt7691 == 13) {
			Static88.method8992(Static242.aClass38_5, false, Static677.aClass137_47, Static514.aClass303_16.method7473(Static232.anInt4258) + "<br>" + Static514.aClass303_17.method7473(Static232.anInt4258), Static586.aClass158_12);
		}
		if (Static624.anInt10511 == 3) {
			for (local83 = 0; local83 < Static599.anInt6161; local83++) {
				@Pc(377) Rectangle local377 = Class334.aRectangleArray1[local83];
				if (Static50.aBooleanArray4[local83]) {
					Static677.aClass137_47.method7941(local377.height, local377.x, -65281, local377.y, local377.width);
				} else if (Static337.aBooleanArray16[local83]) {
					Static677.aClass137_47.method7941(local377.height, local377.x, -65536, local377.y, local377.width);
				} else {
					Static677.aClass137_47.method7941(local377.height, local377.x, -16711936, local377.y, local377.width);
				}
			}
		}
		if (Static597.method8445()) {
			Static525.method7547(Static677.aClass137_47);
		}
		if (Static234.aClass333_5.aBoolean694 && Static550.method7769(Static430.anInt7691) && Static624.anInt10511 == 0 && Static482.method7137() == 1 && !local159) {
			local83 = 0;
			for (local87 = 0; local87 < Static599.anInt6161; local87++) {
				if (Static337.aBooleanArray16[local87]) {
					Static337.aBooleanArray16[local87] = false;
					Static622.aRectangleArray2[local83++] = Class334.aRectangleArray1[local87];
				}
			}
			try {
				if (Static128.aBoolean202) {
					Static368.method5531(local83, Static622.aRectangleArray2);
				} else {
					Static677.aClass137_47.method7944(Static622.aRectangleArray2, local83);
				}
			} catch (@Pc(551) Exception_Sub1 local551) {
			}
		} else if (!Static323.method5092(Static430.anInt7691)) {
			for (local83 = 0; local83 < Static599.anInt6161; local83++) {
				Static337.aBooleanArray16[local83] = false;
			}
			try {
				if (Static128.aBoolean202) {
					Static678.method9312();
				} else {
					Static677.aClass137_47.method7921();
				}
			} catch (@Pc(489) Exception_Sub1 local489) {
				Static524.method7532(local489.getMessage() + " (Recovered) " + this.method1454(), local489);
				Static155.method2506(0, false);
			}
		}
		Static48.method975();
		local83 = Static56.aClass14_Sub22_5.aClass21_Sub14_1.method4522();
		if (local83 == 0) {
			Static20.method9254(15L);
		} else if (local83 == 1) {
			Static20.method9254(10L);
		} else if (local83 == 2) {
			Static20.method9254(5L);
		} else if (local83 == 3) {
			Static20.method9254(2L);
		}
		if (Static225.aBoolean296) {
			Static674.method9280();
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub7_1.method1947() == 1 && Static430.anInt7691 == 3 && Static563.anInt9769 != -1) {
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub7_1, 0);
			Static169.method2762();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1461() {
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1476() {
		if (Static430.anInt7691 == 14) {
			return;
		}
		Static87.anInt1951++;
		if (Static87.anInt1951 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static511.anInt3032 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static492.aRandom1.setSeed((long) Static511.anInt3032);
		}
		if (Static87.anInt1951 % 50 == 0) {
			Static310.anInt5392 = Static535.anInt9237;
			Static535.anInt9237 = 0;
			Static12.anInt95 = Static458.anInt9690;
			Static458.anInt9690 = 0;
		}
		this.method1478();
		if (Static567.aClass347_1 != null) {
			Static567.aClass347_1.method8434();
		}
		Static650.method9057();
		Static213.method3367();
		Static68.aClass65_1.method1564();
		Static666.aClass79_1.method3355();
		if (Static677.aClass137_47 != null) {
			Static677.aClass137_47.method7882((int) Static521.method7499());
		}
		Static375.method5569();
		Static569.anInt9812 = 0;
		Static189.anInt3564 = 0;
		for (@Pc(103) Interface7 local103 = Static68.aClass65_1.method1567(); local103 != null; local103 = Static68.aClass65_1.method1567()) {
			@Pc(109) int local109 = local103.method3429();
			if (local109 == 2 || local109 == 3) {
				@Pc(123) char local123 = local103.method3428();
				if (Static601.method8469() && (local123 == '`' || local123 == '§' || local123 == '²')) {
					if (Static597.method8445()) {
						Static145.method2319();
					} else {
						Static41.method902();
					}
				} else if (Static569.anInt9812 < 128) {
					Static433.anInterface7Array3[Static569.anInt9812] = local103;
					Static569.anInt9812++;
				}
			} else if (local109 == 0 && Static189.anInt3564 < 75) {
				Static594.anInterface7Array2[Static189.anInt3564] = local103;
				Static189.anInt3564++;
			}
		}
		Static23.anInt426 = 0;
		for (@Pc(194) Class14_Sub30 local194 = Static666.aClass79_1.method3353(); local194 != null; local194 = Static666.aClass79_1.method3353()) {
			@Pc(200) int local200 = local194.method8572();
			if (local200 == -1) {
				Static205.aClass262_17.method6314(local194);
			} else if (local200 == 6) {
				Static23.anInt426 += local194.method8576();
			} else if (Static77.method1440(local200)) {
				Static425.aClass262_44.method6314(local194);
				if (Static425.aClass262_44.method6322() > 10) {
					Static425.aClass262_44.method6323();
				}
			}
		}
		if (Static597.method8445()) {
			Static269.method9163();
		}
		if (Static323.method5092(Static430.anInt7691)) {
			Static568.method8169();
			Static38.method849();
		} else if (Static570.method8182(Static430.anInt7691)) {
			Static137.method2191();
		}
		if (Static469.method9286(Static430.anInt7691) && !Static570.method8182(Static430.anInt7691)) {
			this.method1484();
			Static422.method6248();
			Static377.method5610();
		} else if (Static25.method478(Static430.anInt7691) && !Static570.method8182(Static430.anInt7691)) {
			this.method1484();
			Static377.method5610();
		} else if (Static430.anInt7691 == 12) {
			Static377.method5610();
		} else if (Static177.method2836(Static430.anInt7691) && !Static570.method8182(Static430.anInt7691)) {
			Static293.method6393();
		} else if (Static430.anInt7691 == 13) {
			Static377.method5610();
			if (Static642.anInt10721 != -3 && Static642.anInt10721 != 2 && Static642.anInt10721 != 15) {
				Static128.method2105(false);
			}
		}
		Static654.method9083(Static677.aClass137_47);
		Static425.aClass262_44.method6323();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1454() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static329.anInt6225 + "," + Static202.anInt3755 + "," + Static26.anInt462 + "," + Static445.anInt6140 + "|";
			if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 != null) {
				local7 = local7 + "2)" + Static586.anInt10060 + "," + (Static329.anInt6225 + Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0]) + "," + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] + Static202.anInt3755) + "|";
			}
			local7 = local7 + "3)" + Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() + "|4)" + Static56.aClass14_Sub22_5.aClass21_Sub9_2.method2372() + "|5)" + Static482.method7137() + "|6)" + Static561.anInt9759 + "," + Static639.anInt10685 + "|";
			local7 = local7 + "7)" + Static56.aClass14_Sub22_5.aClass21_Sub18_1.method5561() + "|";
			local7 = local7 + "8)" + Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459() + "|";
			local7 = local7 + "9)" + Static56.aClass14_Sub22_5.aClass21_Sub8_1.method2132() + "|";
			local7 = local7 + "10)" + Static56.aClass14_Sub22_5.aClass21_Sub28_1.method9104() + "|";
			local7 = local7 + "11)" + Static56.aClass14_Sub22_5.aClass21_Sub29_1.method9295() + "|";
			local7 = local7 + "12)" + Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() + "|";
			local7 = local7 + "13)" + Static189.anInt3553 + "|";
			local7 = local7 + "14)" + Static430.anInt7691;
			if (Static58.aClass14_Sub11_1 != null) {
				local7 = local7 + "|15)" + Static58.aClass14_Sub11_1.anInt1980;
			}
			try {
				if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 2) {
					@Pc(256) Class local256 = Class.forName("java.lang.ClassLoader");
					@Pc(260) Field local260 = local256.getDeclaredField("nativeLibraries");
					@Pc(263) Class local263 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(273) Method local273 = local263.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local273.invoke(local260, Boolean.TRUE);
					@Pc(296) Vector local296 = (Vector) local260.get(client.class.getClassLoader());
					for (@Pc(298) int local298 = 0; local298 < local296.size(); local298++) {
						try {
							@Pc(304) Object local304 = local296.elementAt(local298);
							@Pc(309) Field local309 = local304.getClass().getDeclaredField("name");
							local273.invoke(local309, Boolean.TRUE);
							try {
								@Pc(324) String local324 = (String) local309.get(local304);
								if (local324 != null && local324.indexOf("sw3d.dll") != -1) {
									@Pc(337) Field local337 = local304.getClass().getDeclaredField("handle");
									local273.invoke(local337, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local337.getLong(local304));
									local273.invoke(local337, Boolean.FALSE);
								}
							} catch (@Pc(373) Throwable local373) {
							}
							local273.invoke(local309, Boolean.FALSE);
						} catch (@Pc(385) Throwable local385) {
						}
					}
				}
			} catch (@Pc(393) Throwable local393) {
			}
			local7 = local7 + "]";
		} catch (@Pc(404) Throwable local404) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1478() {
		@Pc(7) boolean local7 = Static204.aClass135_8.method3067();
		if (!local7) {
			this.method1482();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	protected void method1464() {
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != 2) {
			this.method1469();
			return;
		}
		try {
			this.method1469();
		} catch (@Pc(25) ThreadDeath local25) {
			throw local25;
		} catch (@Pc(28) Throwable local28) {
			Static524.method7532(local28.getMessage() + " (Recovered) " + this.method1454(), local28);
			Static524.aBoolean637 = true;
			Static155.method2506(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1451() {
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != 2) {
			this.method1476();
			return;
		}
		try {
			this.method1476();
		} catch (@Pc(14) ThreadDeath local14) {
			throw local14;
		} catch (@Pc(17) Throwable local17) {
			Static524.method7532(local17.getMessage() + " (Recovered) " + this.method1454(), local17);
			Static524.aBoolean637 = true;
			Static155.method2506(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1448()) {
			return;
		}
		Static511.aClass337_4 = new Class337();
		Static511.aClass337_4.anInt9843 = Integer.parseInt(this.getParameter("worldid"));
		Static368.aClass337_5 = new Class337();
		Static368.aClass337_5.anInt9843 = Integer.parseInt(this.getParameter("lobbyid"));
		Static368.aClass337_5.aString103 = this.getParameter("lobbyaddress");
		Static373.aClass337_6 = new Class337();
		Static373.aClass337_6.anInt9843 = Integer.parseInt(this.getParameter("demoid"));
		Static373.aClass337_6.aString103 = this.getParameter("demoaddress");
		Static513.aClass240_7 = Static300.method4416(Integer.parseInt(this.getParameter("modewhere")));
		if (Static12.aClass240_1 == Static513.aClass240_7) {
			Static513.aClass240_7 = Static133.aClass240_2;
		} else if (!Static77.method1439(Static513.aClass240_7) && Static513.aClass240_7 != Static420.aClass240_5) {
			Static513.aClass240_7 = Static420.aClass240_5;
		}
		Static668.aClass222_8 = Static452.method6558(Integer.parseInt(this.getParameter("modewhat")));
		if (Static276.aClass222_6 != Static668.aClass222_8 && Static105.aClass222_1 != Static668.aClass222_8 && Static668.aClass222_8 != Static370.aClass222_7) {
			Static668.aClass222_8 = Static370.aClass222_7;
		}
		try {
			Static232.anInt4258 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static232.anInt4258 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static592.aBoolean153 = true;
		} else {
			Static592.aBoolean153 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static116.aBoolean192 = true;
		} else {
			Static116.aBoolean192 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static107.aBoolean186 = true;
		} else {
			Static107.aBoolean186 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static630.aClass77_8 = Static174.aClass77_11;
			} else if (local152.equals("1")) {
				Static630.aClass77_8 = Static635.aClass77_9;
			} else if (local152.equals("2")) {
				Static630.aClass77_8 = Static43.aClass77_1;
			} else if (local152.equals("3")) {
				Static630.aClass77_8 = Static332.aClass77_5;
			}
		}
		try {
			Static349.anInt6487 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static349.anInt6487 = 0;
		}
		Static437.aString78 = this.getParameter("quiturl");
		Static273.aString55 = this.getParameter("settings");
		if (Static273.aString55 == null) {
			Static273.aString55 = "";
		}
		Static141.aBoolean152 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static334.anInt6331 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static334.anInt6331 = 0;
			}
		}
		Static557.anInt9476 = Integer.parseInt(this.getParameter("colourid"));
		if (Static557.anInt9476 < 0 || Static557.anInt9476 >= Static282.aColorArray3.length) {
			Static557.anInt9476 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static120.aBoolean645 = true;
			Static524.aBoolean638 = true;
		}
		@Pc(257) String local257 = this.getParameter("frombilling");
		if (local257 != null && local257.equals("true")) {
			Static87.aBoolean164 = true;
		}
		@Pc(269) String local269 = this.getParameter("sskey");
		if (local269 != null) {
			Static436.aByteArray90 = Static416.method6206(Static419.method6221(local269));
			if (Static436.aByteArray90.length < 16) {
				Static436.aByteArray90 = null;
			}
		}
		@Pc(289) String local289 = this.getParameter("force64mb");
		if (local289 != null && local289.equals("true")) {
			Static289.aBoolean343 = true;
		}
		@Pc(301) String local301 = this.getParameter("worldflags");
		if (local301 != null) {
			try {
				Static472.anInt8235 = Integer.parseInt(local301);
			} catch (@Pc(308) Exception local308) {
			}
		}
		@Pc(313) String local313 = this.getParameter("userFlow");
		if (local313 != null) {
			try {
				Static598.aLong266 = Long.parseLong(local313);
			} catch (@Pc(320) NumberFormatException local320) {
			}
		}
		Static89.aString23 = this.getParameter("additionalInfo");
		if (Static89.aString23 != null && Static89.aString23.length() > 50) {
			Static89.aString23 = null;
		}
		if (Static630.aClass77_8 == Static174.aClass77_11) {
			Static297.anInt5240 = 503;
			Static258.anInt4461 = 765;
		} else if (Static635.aClass77_9 == Static630.aClass77_8) {
			Static258.anInt4461 = 640;
			Static297.anInt5240 = 480;
		}
		Static243.aClient1 = this;
		this.method1456(Static297.anInt5240, Static668.aClass222_8.method5299() + 32, Static258.anInt4461, Static630.aClass77_8.aString27);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1482() {
		if (Static91.anInt2021 < Static204.aClass135_8.anInt3735) {
			Static92.aClass337_1.method8199();
			Static225.anInt4188 = (Static204.aClass135_8.anInt3735 * 50 - 50) * 5;
			if (Static225.anInt4188 > 3000) {
				Static225.anInt4188 = 3000;
			}
			if (Static204.aClass135_8.anInt3735 >= 2 && Static204.aClass135_8.anInt3734 == 6) {
				this.method1449("js5connect_outofdate");
				Static430.anInt7691 = 14;
				return;
			}
			if (Static204.aClass135_8.anInt3735 >= 4 && Static204.aClass135_8.anInt3734 == -1) {
				this.method1449("js5crc");
				Static430.anInt7691 = 14;
				return;
			}
			if (Static204.aClass135_8.anInt3735 >= 4 && Static323.method5092(Static430.anInt7691)) {
				if (Static204.aClass135_8.anInt3734 == 7 || Static204.aClass135_8.anInt3734 == 9) {
					this.method1449("js5connect_full");
				} else if (Static204.aClass135_8.anInt3734 <= 0) {
					this.method1449("js5io");
				} else if (Static666.aString118 == null) {
					this.method1449("js5connect");
				} else {
					this.method1449("js5proxy_" + Static666.aString118.trim());
				}
				Static430.anInt7691 = 14;
				return;
			}
		}
		Static91.anInt2021 = Static204.aClass135_8.anInt3735;
		if (Static225.anInt4188 > 0) {
			Static225.anInt4188--;
			return;
		}
		try {
			if (Static394.anInt7289 == 0) {
				Static135.aClass150_3 = Static92.aClass337_1.method8198(Static234.aClass333_5);
				Static394.anInt7289++;
			}
			if (Static394.anInt7289 == 1) {
				if (Static135.aClass150_3.anInt4247 == 2) {
					if (Static135.aClass150_3.anObject8 != null) {
						Static666.aString118 = (String) Static135.aClass150_3.anObject8;
					}
					this.method1468(1000);
					return;
				}
				if (Static135.aClass150_3.anInt4247 == 1) {
					Static394.anInt7289++;
				}
			}
			if (Static394.anInt7289 == 2) {
				Static516.aClass329_2 = new Class329((Socket) Static135.aClass150_3.anObject8, Static234.aClass333_5, 25000);
				@Pc(195) Class14_Sub29 local195 = new Class14_Sub29(5);
				local195.method5854(Static453.aClass174_2.anInt4603);
				local195.method5861(650);
				Static516.aClass329_2.method7846(local195.aByteArray84, 5);
				Static394.anInt7289++;
				Static201.aLong112 = Static521.method7499();
			}
			if (Static394.anInt7289 == 3) {
				if (Static323.method5092(Static430.anInt7691) || Static516.aClass329_2.method7839() > 0) {
					@Pc(253) int local253 = Static516.aClass329_2.method7840();
					if (local253 != 0) {
						this.method1468(local253);
						return;
					}
					Static394.anInt7289++;
				} else if (Static521.method7499() - Static201.aLong112 > 30000L) {
					this.method1468(1001);
					return;
				}
			}
			if (Static394.anInt7289 == 4) {
				@Pc(285) boolean local285 = Static323.method5092(Static430.anInt7691) || Static469.method9286(Static430.anInt7691) || Static25.method478(Static430.anInt7691);
				@Pc(288) Class392[] local288 = Static672.method9269();
				@Pc(296) Class14_Sub29 local296 = new Class14_Sub29(local288.length * 4);
				Static516.aClass329_2.method7843(0, local296.aByteArray84.length, local296.aByteArray84);
				for (@Pc(311) int local311 = 0; local311 < local288.length; local311++) {
					local288[local311].method9271(local296.method5878());
				}
				Static204.aClass135_8.method3068(!local285, Static516.aClass329_2);
				Static135.aClass150_3 = null;
				Static516.aClass329_2 = null;
				Static394.anInt7289 = 0;
			}
		} catch (@Pc(343) IOException local343) {
			this.method1468(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1452() {
		if (Static289.aBoolean343) {
			Static189.anInt3553 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static230.method3499();
		Static386.aClass298_2 = new Class298(Static234.aClass333_5);
		Static204.aClass135_8 = new Class135();
		Static417.method8850(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static420.aClass240_5 != Static513.aClass240_7) {
			Static24.aByteArrayArray5 = new byte[50][];
		}
		Static56.aClass14_Sub22_5 = Static38.method848();
		if (Static513.aClass240_7 == Static420.aClass240_5) {
			Static511.aClass337_4.aString103 = this.getCodeBase().getHost();
		} else if (Static77.method1439(Static513.aClass240_7)) {
			Static511.aClass337_4.aString103 = this.getCodeBase().getHost();
			Static511.aClass337_4.anInt9846 = Static511.aClass337_4.anInt9843 + 40000;
			Static368.aClass337_5.anInt9846 = Static368.aClass337_5.anInt9843 + 40000;
			Static373.aClass337_6.anInt9846 = Static373.aClass337_6.anInt9843 + 40000;
			Static511.aClass337_4.anInt9845 = Static511.aClass337_4.anInt9843 + 50000;
			Static368.aClass337_5.anInt9845 = Static368.aClass337_5.anInt9843 + 50000;
			Static373.aClass337_6.anInt9845 = Static373.aClass337_6.anInt9843 + 50000;
		} else if (Static513.aClass240_7 == Static12.aClass240_1) {
			Static511.aClass337_4.aString103 = "127.0.0.1";
			Static368.aClass337_5.aString103 = "127.0.0.1";
			Static511.aClass337_4.anInt9846 = Static511.aClass337_4.anInt9843 + 40000;
			Static373.aClass337_6.aString103 = "127.0.0.1";
			Static368.aClass337_5.anInt9846 = Static368.aClass337_5.anInt9843 + 40000;
			Static511.aClass337_4.anInt9845 = Static511.aClass337_4.anInt9843 + 50000;
			Static373.aClass337_6.anInt9846 = Static373.aClass337_6.anInt9843 + 40000;
			Static368.aClass337_5.anInt9845 = Static368.aClass337_5.anInt9843 + 50000;
			Static373.aClass337_6.anInt9845 = Static373.aClass337_6.anInt9843 + 50000;
		}
		Static92.aClass337_1 = Static511.aClass337_4;
		if (Static174.aClass77_11 == Static630.aClass77_8) {
			Static418.aBoolean519 = false;
		}
		Static129.aShortArray105 = Static192.aShortArray56 = Static343.aShortArray98 = Static229.aShortArray72 = new short[256];
		if (Static630.aClass77_8 == Static635.aClass77_9) {
			Static509.aShortArrayArrayArray4 = Static331.aShortArrayArrayArray2;
			Static453.anInt7942 = 16777215;
			Static538.aBoolean652 = true;
			Static582.aShortArrayArray18 = Static409.aShortArrayArray16;
			Static510.anInt8990 = 0;
		} else if (Static332.aClass77_5 == Static630.aClass77_8) {
			Static509.aShortArrayArrayArray4 = Static352.aShortArrayArrayArray3;
			Static582.aShortArrayArray18 = Static231.aShortArrayArray7;
		} else {
			Static582.aShortArrayArray18 = Static154.aShortArrayArray6;
			Static509.aShortArrayArrayArray4 = Static47.aShortArrayArrayArray1;
		}
		try {
			Static518.aClipboard3 = Static243.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(223) Exception local223) {
		}
		Static68.aClass65_1 = Static167.method2683(Static68.aCanvas2);
		Static666.aClass79_1 = Static621.method8713(Static68.aCanvas2);
		try {
			if (Static234.aClass333_5.aClass285_3 != null) {
				Static388.aClass179_2 = new Class179(Static234.aClass333_5.aClass285_3, 5200, 0);
				for (@Pc(245) int local245 = 0; local245 < 37; local245++) {
					Static438.aClass179Array1[local245] = new Class179(Static234.aClass333_5.aClass285Array1[local245], 6000, 0);
				}
				Static52.aClass179_1 = new Class179(Static234.aClass333_5.aClass285_4, 6000, 0);
				Static322.aClass345_3 = new Class345(255, Static388.aClass179_2, Static52.aClass179_1, 500000);
				Static426.aClass179_3 = new Class179(Static234.aClass333_5.aClass285_2, 24, 0);
				Static234.aClass333_5.aClass285_4 = null;
				Static234.aClass333_5.aClass285_2 = null;
				Static234.aClass333_5.aClass285Array1 = null;
				Static234.aClass333_5.aClass285_3 = null;
			}
		} catch (@Pc(301) IOException local301) {
			Static388.aClass179_2 = null;
			Static322.aClass345_3 = null;
			Static52.aClass179_1 = null;
			Static426.aClass179_3 = null;
		}
		if (Static513.aClass240_7 != Static420.aClass240_5) {
			Class12_Sub2_Sub1_Sub2.lb = true;
		}
		Static343.aString67 = Static514.aClass303_14.method7473(Static232.anInt4258);
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1484() {
		@Pc(26) int local26;
		if (Static430.anInt7691 == 7 && !Static232.method3511()) {
			if (Static192.anInt3587 > 1) {
				Static192.anInt3587--;
				Static514.anInt9026 = Static441.anInt7833;
			}
			if (!Static505.aBoolean629) {
				Static229.method3485();
			}
			for (local26 = 0; local26 < 100 && Static54.method1179(); local26++) {
			}
		}
		Static475.anInt8259++;
		Static369.method5533((Class230) null, -1, -1);
		Static320.method5063((Class230) null, -1, -1);
		Static236.method3561();
		Static441.anInt7833++;
		for (local26 = 0; local26 < Static570.anInt9823; local26++) {
			@Pc(68) Class12_Sub2_Sub2_Sub1_Sub1 local68 = Static151.aClass14_Sub44Array1[local26].aClass12_Sub2_Sub2_Sub1_Sub1_2;
			if (local68 != null) {
				@Pc(74) byte local74 = local68.aClass283_1.aByte125;
				if ((local74 & 0x1) != 0) {
					@Pc(85) int local85 = local68.method2422();
					@Pc(109) int local109;
					if ((local74 & 0x2) != 0 && local68.anInt2964 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(131) int local131 = local109 + local68.anIntArray241[0];
							@Pc(138) int local138 = local117 + local68.anIntArray242[0];
							if (local131 < 0) {
								local131 = 0;
							} else if (local131 > Static26.anInt462 - local85 - 1) {
								local131 = Static26.anInt462 - local85 - 1;
							}
							if (local138 < 0) {
								local138 = 0;
							} else if (local138 > Static445.anInt6140 - local85 - 1) {
								local138 = Static445.anInt6140 - local85 - 1;
							}
							@Pc(209) int local209 = Static254.method3732(-1, local85, 0, local131, Static226.aClass226Array3[local68.aByte146], true, local85, Static422.anIntArray562, local68.anIntArray241[0], 0, local85, local68.anIntArray242[0], Static314.anIntArray437, local138);
							if (local209 > 0) {
								if (local209 > 9) {
									local209 = 9;
								}
								for (@Pc(223) int local223 = 0; local223 < local209; local223++) {
									local68.anIntArray241[local223] = Static422.anIntArray562[local209 - local223 - 1];
									local68.anIntArray242[local223] = Static314.anIntArray437[local209 - local223 - 1];
									local68.aByteArray43[local223] = 1;
								}
								local68.anInt2964 = local209;
							}
						}
					}
					Static608.method8558(local68, true);
					local109 = Static519.method7488(local68);
					Static530.method7613(local68);
					Static411.method6079(Static359.anInt6636, Static651.anInt10884, local68, local109);
					Static420.method6224(Static651.anInt10884, local68);
					Static416.method6205(local68);
				}
			}
		}
		if (!Static232.method3511() && Static101.anInt2152 == 0) {
			if (Static378.anInt6935 == 2) {
				Static421.method6234();
			} else {
				Static222.method3454();
			}
			if (Static233.anInt4273 >> 9 < 14 || Static26.anInt462 - 14 <= Static233.anInt4273 >> 9 || Static74.anInt1618 >> 9 < 14 || Static445.anInt6140 - 14 <= Static74.anInt1618 >> 9) {
				Static221.method6305();
			}
		}
		while (true) {
			@Pc(357) Class14_Sub55 local357;
			@Pc(362) Class230 local362;
			@Pc(370) Class230 local370;
			do {
				local357 = (Class14_Sub55) Static158.aClass262_14.method6323();
				if (local357 == null) {
					while (true) {
						do {
							local357 = (Class14_Sub55) Static490.aClass262_58.method6323();
							if (local357 == null) {
								while (true) {
									do {
										local357 = (Class14_Sub55) Static576.aClass262_67.method6323();
										if (local357 == null) {
											if (Static299.aClass230_4 != null) {
												Static258.method3703();
											}
											if (Static87.anInt1951 % 1500 == 0) {
												Static268.method3929();
											}
											if (Static430.anInt7691 == 7 && !Static232.method3511()) {
												Static149.method5516();
											}
											Static181.method2288();
											if (Static354.aBoolean460 && Static38.aLong23 < Static521.method7499() - 60000L) {
												Static559.method7855();
											}
											for (@Pc(528) Class12_Sub7_Sub1 local528 = (Class12_Sub7_Sub1) Static548.aClass376_9.method9008(); local528 != null; local528 = (Class12_Sub7_Sub1) Static548.aClass376_9.method9014()) {
												if (Static521.method7499() / 1000L - 5L > (long) local528.anInt6098) {
													if (local528.aShort69 > 0) {
														Static149.method5512("", "", local528.aString66 + Static514.aClass303_21.method7473(Static232.anInt4258), 5, 0, "");
													}
													if (local528.aShort69 == 0) {
														Static149.method5512("", "", local528.aString66 + Static514.aClass303_22.method7473(Static232.anInt4258), 5, 0, "");
													}
													local528.method9143();
												}
											}
											if (Static430.anInt7691 == 7 && !Static232.method3511()) {
												if (Static258.aClass97_2 == null) {
													Static128.method2105(false);
													return;
												}
												Static287.anInt4907++;
												if (Static287.anInt4907 > 50) {
													@Pc(633) Class14_Sub19 local633 = Static286.method4081(Static205.aClass394_1, Static269.aClass100_143);
													Static576.method8234(local633);
												}
												try {
													Static363.method47();
													return;
												} catch (@Pc(640) IOException local640) {
													Static128.method2105(false);
													return;
												}
											}
											return;
										}
										local362 = local357.aClass230_14;
										if (local362.anInt6679 < 0) {
											break;
										}
										local370 = Static655.method9094(local362.anInt6668);
									} while (local370 == null || local370.aClass230Array2 == null || local362.anInt6679 >= local370.aClass230Array2.length || local370.aClass230Array2[local362.anInt6679] != local362);
									Static632.method8830(local357);
								}
							}
							local362 = local357.aClass230_14;
							if (local362.anInt6679 < 0) {
								break;
							}
							local370 = Static655.method9094(local362.anInt6668);
						} while (local370 == null || local370.aClass230Array2 == null || local362.anInt6679 >= local370.aClass230Array2.length || local370.aClass230Array2[local362.anInt6679] != local362);
						Static632.method8830(local357);
					}
				}
				local362 = local357.aClass230_14;
				if (local362.anInt6679 < 0) {
					break;
				}
				local370 = Static655.method9094(local362.anInt6668);
			} while (local370 == null || local370.aClass230Array2 == null || local362.anInt6679 >= local370.aClass230Array2.length || local370.aClass230Array2[local362.anInt6679] != local362);
			Static632.method8830(local357);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1460() {
		if (Static645.anApplet2 != null && Static68.aCanvas2 == null && !Static234.aClass333_5.aBoolean694) {
			try {
				@Pc(13) Class local13 = Static645.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static68.aCanvas2 = (Canvas) local17.get(Static645.anApplet2);
				local17.set(Static645.anApplet2, (Object) null);
				if (Static68.aCanvas2 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1460();
	}
}
