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
				Static74.method1624("Argument count");
			}
			Static110.aClass161_1 = new Class161();
			Static110.aClass161_1.anInt4423 = Integer.parseInt(arg0[0]);
			Static368.aClass161_4 = new Class161();
			Static368.aClass161_4.anInt4423 = Integer.parseInt(arg0[1]);
			Static336.aClass161_6 = new Class161();
			Static336.aClass161_6.anInt4423 = Integer.parseInt(arg0[2]);
			Static229.aClass309_8 = Static312.aClass309_7;
			if (arg0[3].equals("live")) {
				Static587.aClass295_5 = Static562.aClass295_4;
			} else if (arg0[3].equals("rc")) {
				Static587.aClass295_5 = Static344.aClass295_3;
			} else if (arg0[3].equals("wip")) {
				Static587.aClass295_5 = Static365.aClass295_2;
			} else {
				Static74.method1624("modewhat");
			}
			Static319.anInt5939 = Static121.method2184(arg0[4]);
			if (Static319.anInt5939 == -1) {
				if (arg0[4].equals("english")) {
					Static319.anInt5939 = 0;
				} else if (arg0[4].equals("german")) {
					Static319.anInt5939 = 1;
				} else {
					Static74.method1624("language");
				}
			}
			Static133.aBoolean207 = false;
			Static206.aBoolean295 = false;
			if (arg0[5].equals("game0")) {
				Static102.aClass181_38 = Static341.aClass181_93;
			} else if (arg0[5].equals("game1")) {
				Static102.aClass181_38 = Static14.aClass181_5;
			} else if (arg0[5].equals("game2")) {
				Static102.aClass181_38 = Static670.aClass181_172;
			} else if (arg0[5].equals("game3")) {
				Static102.aClass181_38 = Static641.aClass181_164;
			} else {
				Static74.method1624("game");
			}
			Static637.aString125 = null;
			Static573.aString114 = null;
			Static450.aLong222 = 0L;
			Static500.aBoolean631 = true;
			Static127.aBoolean203 = true;
			Static203.anInt3734 = 0;
			Static606.aBoolean710 = false;
			Static415.aBoolean533 = false;
			Static88.anInt1933 = 0;
			Static605.aString120 = "";
			Static149.anInt2811 = 0;
			Static659.anInt10093 = Static102.aClass181_38.anInt4848;
			@Pc(183) client local183 = new client();
			Static487.aClient1 = local183;
			local183.method1739(Static587.aClass295_5.method7032() + 32, Static102.aClass181_38.aString62);
			Static90.aFrame2.setLocation(40, 40);
		} catch (@Pc(207) Exception local207) {
			Static81.method1711((String) null, local207);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1737() {
		@Pc(15) String local15 = null;
		try {
			local15 = "[1)" + Static417.anInt7047 + "," + Static347.anInt7851 + "," + Static251.anInt4680 + "," + Static406.anInt6924 + "|";
			if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 != null) {
				local15 = local15 + "2)" + Static576.anInt9136 + "," + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0] + Static417.anInt7047) + "," + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0] + Static347.anInt7851) + "|";
			}
			local15 = local15 + "3)" + Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() + "|4)" + Static227.aClass3_Sub15_11.aClass17_Sub17_1.method5808() + "|5)" + Static545.method7549() + "|6)" + Static654.anInt10064 + "," + Static483.anInt8181 + "|";
			local15 = local15 + "7)" + Static227.aClass3_Sub15_11.aClass17_Sub2_1.method725() + "|";
			local15 = local15 + "8)" + Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502() + "|";
			local15 = local15 + "9)" + Static227.aClass3_Sub15_11.aClass17_Sub5_1.method2068() + "|";
			local15 = local15 + "10)" + Static227.aClass3_Sub15_11.aClass17_Sub12_1.method4577() + "|";
			local15 = local15 + "11)" + Static227.aClass3_Sub15_11.aClass17_Sub28_1.method8661() + "|";
			local15 = local15 + "12)" + Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() + "|";
			local15 = local15 + "13)" + Static595.anInt9375 + "|";
			local15 = local15 + "14)" + Static520.anInt6836;
			if (Static447.aClass3_Sub34_1 != null) {
				local15 = local15 + "|15)" + Static447.aClass3_Sub34_1.anInt6531;
			}
			try {
				if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 2) {
					@Pc(250) Class local250 = Class.forName("java.lang.ClassLoader");
					@Pc(254) Field local254 = local250.getDeclaredField("nativeLibraries");
					@Pc(257) Class local257 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(267) Method local267 = local257.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local267.invoke(local254, Boolean.TRUE);
					@Pc(290) Vector local290 = (Vector) local254.get(client.class.getClassLoader());
					for (@Pc(292) int local292 = 0; local290.size() > local292; local292++) {
						try {
							@Pc(298) Object local298 = local290.elementAt(local292);
							@Pc(303) Field local303 = local298.getClass().getDeclaredField("name");
							local267.invoke(local303, Boolean.TRUE);
							try {
								@Pc(318) String local318 = (String) local303.get(local298);
								if (local318 != null && local318.indexOf("sw3d.dll") != -1) {
									@Pc(330) Field local330 = local298.getClass().getDeclaredField("handle");
									local267.invoke(local330, Boolean.TRUE);
									local15 = local15 + "|16)" + Long.toHexString(local330.getLong(local298));
									local267.invoke(local330, Boolean.FALSE);
								}
							} catch (@Pc(366) Throwable local366) {
							}
							local267.invoke(local303, Boolean.FALSE);
						} catch (@Pc(378) Throwable local378) {
						}
					}
				}
			} catch (@Pc(386) Throwable local386) {
			}
			local15 = local15 + "]";
		} catch (@Pc(397) Throwable local397) {
		}
		return local15;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1756() {
		if (Static342.anInt6166 < Static600.aClass366_3.anInt9591) {
			Static605.aClass161_7.method3709();
			Static263.anInt4942 = (Static600.aClass366_3.anInt9591 - 1) * 50 * 5;
			if (Static263.anInt4942 > 3000) {
				Static263.anInt4942 = 3000;
			}
			if (Static600.aClass366_3.anInt9591 >= 2 && Static600.aClass366_3.anInt9592 == 6) {
				this.method1734("js5connect_outofdate");
				Static520.anInt6836 = 14;
				return;
			}
			if (Static600.aClass366_3.anInt9591 >= 4 && Static600.aClass366_3.anInt9592 == -1) {
				this.method1734("js5crc");
				Static520.anInt6836 = 14;
				return;
			}
			if (Static600.aClass366_3.anInt9591 >= 4 && Static101.method1996(Static520.anInt6836)) {
				if (Static600.aClass366_3.anInt9592 == 7 || Static600.aClass366_3.anInt9592 == 9) {
					this.method1734("js5connect_full");
				} else if (Static600.aClass366_3.anInt9592 <= 0) {
					this.method1734("js5io");
				} else if (Static558.aString111 == null) {
					this.method1734("js5connect");
				} else {
					this.method1734("js5proxy_" + Static558.aString111.trim());
				}
				Static520.anInt6836 = 14;
				return;
			}
		}
		Static342.anInt6166 = Static600.aClass366_3.anInt9591;
		if (Static263.anInt4942 > 0) {
			Static263.anInt4942--;
			return;
		}
		try {
			if (Static28.anInt861 == 0) {
				Static549.aClass129_9 = Static605.aClass161_7.method3706(Static499.aClass231_4);
				Static28.anInt861++;
			}
			if (Static28.anInt861 == 1) {
				if (Static549.aClass129_9.anInt3299 == 2) {
					if (Static549.aClass129_9.anObject7 != null) {
						Static558.aString111 = (String) Static549.aClass129_9.anObject7;
					}
					this.method1760(1000);
					return;
				}
				if (Static549.aClass129_9.anInt3299 == 1) {
					Static28.anInt861++;
				}
			}
			if (Static28.anInt861 == 2) {
				Static395.aClass147_1 = new Class147((Socket) Static549.aClass129_9.anObject7, Static499.aClass231_4, 25000);
				@Pc(198) Class3_Sub17 local198 = new Class3_Sub17(5);
				local198.method4849(Static97.aClass326_2.anInt8904);
				local198.method4854(642);
				Static395.aClass147_1.method3212(local198.aByteArray59, 5);
				Static28.anInt861++;
				Static161.aLong81 = Static131.method2268();
			}
			if (Static28.anInt861 == 3) {
				if (Static101.method1996(Static520.anInt6836) || Static395.aClass147_1.method3213() > 0) {
					@Pc(239) int local239 = Static395.aClass147_1.method3214();
					if (local239 != 0) {
						this.method1760(local239);
						return;
					}
					Static28.anInt861++;
				} else if (Static131.method2268() - Static161.aLong81 > 30000L) {
					this.method1760(1001);
					return;
				}
			}
			if (Static28.anInt861 == 4) {
				@Pc(284) boolean local284 = Static101.method1996(Static520.anInt6836) || Static649.method8507(Static520.anInt6836) || Static473.method6805(Static520.anInt6836);
				@Pc(287) Class273[] local287 = Static446.method6456();
				@Pc(295) Class3_Sub17 local295 = new Class3_Sub17(local287.length * 4);
				Static395.aClass147_1.method3215(local295.aByteArray59.length, local295.aByteArray59, 0);
				for (@Pc(306) int local306 = 0; local306 < local287.length; local306++) {
					local287[local306].method6449(local295.method4868());
				}
				Static600.aClass366_3.method8100(Static395.aClass147_1, !local284);
				Static28.anInt861 = 0;
				Static549.aClass129_9 = null;
				Static395.aClass147_1 = null;
			}
		} catch (@Pc(338) IOException local338) {
			this.method1760(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1750()) {
			return;
		}
		Static110.aClass161_1 = new Class161();
		Static110.aClass161_1.anInt4423 = Integer.parseInt(this.getParameter("worldid"));
		Static368.aClass161_4 = new Class161();
		Static368.aClass161_4.anInt4423 = Integer.parseInt(this.getParameter("lobbyid"));
		Static368.aClass161_4.aString54 = this.getParameter("lobbyaddress");
		Static336.aClass161_6 = new Class161();
		Static336.aClass161_6.anInt4423 = Integer.parseInt(this.getParameter("demoid"));
		Static336.aClass161_6.aString54 = this.getParameter("demoaddress");
		Static229.aClass309_8 = Static565.method7220(Integer.parseInt(this.getParameter("modewhere")));
		if (Static312.aClass309_7 == Static229.aClass309_8) {
			Static229.aClass309_8 = Static17.aClass309_1;
		} else if (!Static443.method6431(Static229.aClass309_8) && Static216.aClass309_6 != Static229.aClass309_8) {
			Static229.aClass309_8 = Static216.aClass309_6;
		}
		Static587.aClass295_5 = Static46.method1245(Integer.parseInt(this.getParameter("modewhat")));
		if (Static365.aClass295_2 != Static587.aClass295_5 && Static587.aClass295_5 != Static344.aClass295_3 && Static587.aClass295_5 != Static562.aClass295_4) {
			Static587.aClass295_5 = Static562.aClass295_4;
		}
		try {
			Static319.anInt5939 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static319.anInt5939 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static206.aBoolean295 = true;
		} else {
			Static206.aBoolean295 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static133.aBoolean207 = true;
		} else {
			Static133.aBoolean207 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static458.aBoolean593 = true;
		} else {
			Static458.aBoolean593 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static102.aClass181_38 = Static341.aClass181_93;
			} else if (local152.equals("1")) {
				Static102.aClass181_38 = Static14.aClass181_5;
			} else if (local152.equals("2")) {
				Static102.aClass181_38 = Static670.aClass181_172;
			} else if (local152.equals("3")) {
				Static102.aClass181_38 = Static641.aClass181_164;
			}
		}
		try {
			Static88.anInt1933 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static88.anInt1933 = 0;
		}
		Static467.aString103 = this.getParameter("quiturl");
		Static605.aString120 = this.getParameter("settings");
		if (Static605.aString120 == null) {
			Static605.aString120 = "";
		}
		Static515.aBoolean648 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static149.anInt2811 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static149.anInt2811 = 0;
			}
		}
		Static659.anInt10093 = Integer.parseInt(this.getParameter("colourid"));
		if (Static659.anInt10093 < 0 || Static659.anInt10093 >= Static408.aColorArray7.length) {
			Static659.anInt10093 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static500.aBoolean631 = true;
			Static127.aBoolean203 = true;
		}
		@Pc(255) String local255 = this.getParameter("frombilling");
		if (local255 != null && local255.equals("true")) {
			Static606.aBoolean710 = true;
		}
		Static573.aString114 = this.getParameter("sskey");
		if (Static573.aString114 != null && Static573.aString114.length() < 2) {
			Static573.aString114 = null;
		}
		@Pc(281) String local281 = this.getParameter("force64mb");
		if (local281 != null && local281.equals("true")) {
			Static415.aBoolean533 = true;
		}
		@Pc(293) String local293 = this.getParameter("worldflags");
		if (local293 != null) {
			try {
				Static203.anInt3734 = Integer.parseInt(local293);
			} catch (@Pc(300) Exception local300) {
			}
		}
		@Pc(305) String local305 = this.getParameter("userFlow");
		if (local305 != null) {
			try {
				Static450.aLong222 = Long.parseLong(local305);
			} catch (@Pc(312) NumberFormatException local312) {
			}
		}
		Static637.aString125 = this.getParameter("additionalInfo");
		if (Static637.aString125 != null && Static637.aString125.length() > 50) {
			Static637.aString125 = null;
		}
		if (Static102.aClass181_38 == Static341.aClass181_93) {
			Static581.anInt9218 = 503;
			Static507.anInt8484 = 765;
		} else if (Static102.aClass181_38 == Static14.aClass181_5) {
			Static507.anInt8484 = 640;
			Static581.anInt9218 = 480;
		}
		Static487.aClient1 = this;
		this.method1748(Static587.aClass295_5.method7032() + 32, Static507.anInt8484, Static581.anInt9218, Static102.aClass181_38.aString62);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1757() {
		@Pc(7) boolean local7 = Static600.aClass366_3.method8110();
		if (!local7) {
			this.method1756();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1760(@OriginalArg(0) int arg0) {
		Static28.anInt861 = 0;
		Static549.aClass129_9 = null;
		Static600.aClass366_3.anInt9592 = arg0;
		Static600.aClass366_3.anInt9591++;
		Static395.aClass147_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1736() {
		if (Static287.anApplet2 != null && Static469.aCanvas11 == null && !Static499.aClass231_4.aBoolean484) {
			try {
				@Pc(13) Class local13 = Static287.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static469.aCanvas11 = (Canvas) local17.get(Static287.anApplet2);
				local17.set(Static287.anApplet2, (Object) null);
				if (Static469.aCanvas11 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1736();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1761() {
		if (Static520.anInt6836 == 14) {
			return;
		}
		@Pc(24) long local24 = Static182.method2992() / 1000000L - Static385.aLong182;
		Static385.aLong182 = Static182.method2992() / 1000000L;
		@Pc(32) boolean local32 = Static308.method4736();
		if (local32 && Static666.aBoolean755 && Static212.aClass232_2 != null) {
			Static212.aClass232_2.method8511();
		}
		if (Static480.method6836(Static520.anInt6836)) {
			if (Static614.aLong283 != 0L && Static614.aLong283 < Static131.method2268()) {
				Static211.method8142(Static330.anInt6092, Static545.method7549(), Static597.anInt9392, false);
			} else if (!Static582.aClass16_12.method8187() && Static492.aBoolean629) {
				Static435.method6375();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static153.aFrame3 == null) {
			@Pc(78) Container local78;
			if (Static90.aFrame2 != null) {
				local78 = Static90.aFrame2;
			} else if (Static287.anApplet2 == null) {
				local78 = Static287.anApplet_Sub1_1;
			} else {
				local78 = Static287.anApplet2;
			}
			local90 = local78.getSize().width;
			local94 = local78.getSize().height;
			if (local78 == Static90.aFrame2) {
				@Pc(100) Insets local100 = Static90.aFrame2.getInsets();
				local94 -= local100.top + local100.bottom;
				local90 -= local100.left + local100.right;
			}
			if (Static83.anInt1901 != local90 || local94 != Static597.anInt9407 || Static515.aBoolean646) {
				if (Static582.aClass16_12 == null || Static582.aClass16_12.method8191()) {
					Static502.method7148();
				} else {
					Static83.anInt1901 = local90;
					Static597.anInt9407 = local94;
				}
				Static614.aLong283 = Static131.method2268() + 500L;
				Static515.aBoolean646 = false;
			}
		}
		if (Static153.aFrame3 != null && !Static474.aBoolean613 && Static480.method6836(Static520.anInt6836)) {
			Static211.method8142(-1, Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400(), -1, false);
		}
		@Pc(169) boolean local169 = false;
		if (Static27.aBoolean72) {
			local169 = true;
			Static27.aBoolean72 = false;
		}
		if (local169) {
			Static468.method7635();
		}
		if (Static582.aClass16_12 != null && Static582.aClass16_12.method8187() || Static545.method7549() != 1) {
			Static517.method7334();
		}
		if (Static101.method1996(Static520.anInt6836)) {
			Static274.method4354(local169);
		} else if (Static559.method7640(Static520.anInt6836)) {
			Static336.method7822();
		} else if (Static213.method3379(Static520.anInt6836)) {
			Static336.method7822();
		} else if (Static305.method4700(Static520.anInt6836)) {
			if (Static493.anInt7679 == 1) {
				if (Static647.anInt9954 < Static587.anInt9293) {
					Static647.anInt9954 = Static587.anInt9293;
				}
				local90 = (Static647.anInt9954 - Static587.anInt9293) * 50 / Static647.anInt9954;
				Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_13.method7694(Static319.anInt5939) + "<br>(" + local90 + "%)", true);
			} else if (Static493.anInt7679 == 2) {
				if (Static251.anInt4681 < Static8.anInt100) {
					Static251.anInt4681 = Static8.anInt100;
				}
				local90 = (Static251.anInt4681 - Static8.anInt100) * 50 / Static251.anInt4681 + 50;
				Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_13.method7694(Static319.anInt5939) + "<br>(" + local90 + "%)", true);
			} else {
				Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_13.method7694(Static319.anInt5939), true);
			}
		} else if (Static520.anInt6836 == 10) {
			Static469.method6727(local24);
		} else if (Static520.anInt6836 == 13) {
			Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_15.method7694(Static319.anInt5939) + "<br>" + Static569.aClass335_16.method7694(Static319.anInt5939), false);
		}
		if (Static339.anInt6143 == 3) {
			for (local90 = 0; local90 < Static47.anInt1250; local90++) {
				@Pc(366) Rectangle local366 = Class84_Sub2.aRectangleArray2[local90];
				if (Static389.aBooleanArray18[local90]) {
					Static582.aClass16_12.method8180(-65281, local366.x, local366.width, local366.height, local366.y);
				} else if (Static496.aBooleanArray23[local90]) {
					Static582.aClass16_12.method8180(-65536, local366.x, local366.width, local366.height, local366.y);
				} else {
					Static582.aClass16_12.method8180(-16711936, local366.x, local366.width, local366.height, local366.y);
				}
			}
		}
		if (Static255.method4048()) {
			Static149.method2576(Static582.aClass16_12);
		}
		if (Static499.aClass231_4.aBoolean484 && Static480.method6836(Static520.anInt6836) && Static339.anInt6143 == 0 && Static545.method7549() == 1 && !local169) {
			local90 = 0;
			for (local94 = 0; local94 < Static47.anInt1250; local94++) {
				if (Static496.aBooleanArray23[local94]) {
					Static496.aBooleanArray23[local94] = false;
					Static35.aRectangleArray1[local90++] = Class84_Sub2.aRectangleArray2[local94];
				}
			}
			try {
				if (Static649.aBoolean735) {
					Static447.method6463(Static35.aRectangleArray1, local90);
				} else {
					Static582.aClass16_12.method8182(Static35.aRectangleArray1, local90);
				}
			} catch (@Pc(490) Exception_Sub1 local490) {
			}
		} else if (!Static101.method1996(Static520.anInt6836)) {
			for (local90 = 0; local90 < Static47.anInt1250; local90++) {
				Static496.aBooleanArray23[local90] = false;
			}
			try {
				if (Static649.aBoolean735) {
					Static13.method134();
				} else {
					Static582.aClass16_12.method8123();
				}
			} catch (@Pc(523) Exception_Sub1 local523) {
				Static81.method1711(local523.getMessage() + " (Recovered) " + this.method1737(), local523);
				Static422.method6016(false, 0);
			}
		}
		Static414.method5935();
		local90 = Static227.aClass3_Sub15_11.aClass17_Sub6_1.method2225();
		if (local90 == 0) {
			Static365.method3472(15L);
		} else if (local90 == 1) {
			Static365.method3472(10L);
		} else if (local90 == 2) {
			Static365.method3472(5L);
		} else if (local90 == 3) {
			Static365.method3472(2L);
		}
		if (Static381.aBoolean508) {
			Static59.method1455();
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub15_1.method5148() == 1 && Static520.anInt6836 == 3 && Static277.anInt5201 != -1) {
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub15_1, 0);
			Static57.method6341();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1732() {
		if (Static415.aBoolean533) {
			Static595.anInt9375 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static502.method7148();
		Static296.aClass233_6 = new Class233(Static499.aClass231_4);
		Static600.aClass366_3 = new Class366();
		Static88.method1800(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static229.aClass309_8 != Static216.aClass309_6) {
			Static237.aByteArrayArray8 = new byte[50][];
		}
		Static227.aClass3_Sub15_11 = Static276.method4386();
		if (Static229.aClass309_8 == Static216.aClass309_6) {
			Static110.aClass161_1.aString54 = this.getCodeBase().getHost();
		} else if (Static443.method6431(Static229.aClass309_8)) {
			Static110.aClass161_1.aString54 = this.getCodeBase().getHost();
			Static110.aClass161_1.anInt4421 = Static110.aClass161_1.anInt4423 + 40000;
			Static368.aClass161_4.anInt4421 = Static368.aClass161_4.anInt4423 + 40000;
			Static336.aClass161_6.anInt4421 = Static336.aClass161_6.anInt4423 + 40000;
			Static110.aClass161_1.anInt4422 = Static110.aClass161_1.anInt4423 + 50000;
			Static368.aClass161_4.anInt4422 = Static368.aClass161_4.anInt4423 + 50000;
			Static336.aClass161_6.anInt4422 = Static336.aClass161_6.anInt4423 + 50000;
		} else if (Static312.aClass309_7 == Static229.aClass309_8) {
			Static110.aClass161_1.aString54 = "127.0.0.1";
			Static368.aClass161_4.aString54 = "127.0.0.1";
			Static110.aClass161_1.anInt4421 = Static110.aClass161_1.anInt4423 + 40000;
			Static336.aClass161_6.aString54 = "127.0.0.1";
			Static368.aClass161_4.anInt4421 = Static368.aClass161_4.anInt4423 + 40000;
			Static336.aClass161_6.anInt4421 = Static336.aClass161_6.anInt4423 + 40000;
			Static110.aClass161_1.anInt4422 = Static110.aClass161_1.anInt4423 + 50000;
			Static368.aClass161_4.anInt4422 = Static368.aClass161_4.anInt4423 + 50000;
			Static336.aClass161_6.anInt4422 = Static336.aClass161_6.anInt4423 + 50000;
		}
		Static605.aClass161_7 = Static110.aClass161_1;
		Static119.aShortArray48 = Static212.aShortArray85 = Static648.aShortArray178 = Static432.aShortArray145 = new short[256];
		if (Static14.aClass181_5 == Static102.aClass181_38) {
			Static82.anInt1887 = 16777215;
			Static398.aShortArrayArray16 = Static425.aShortArrayArray17;
			Static580.aShortArrayArrayArray3 = Static648.aShortArrayArrayArray4;
			Static381.aBoolean509 = true;
			Static301.anInt5502 = 0;
		} else if (Static641.aClass181_164 == Static102.aClass181_38) {
			Static398.aShortArrayArray16 = Static80.aShortArrayArray28;
			Static580.aShortArrayArrayArray3 = Static358.aShortArrayArrayArray1;
		} else {
			Static398.aShortArrayArray16 = Static228.aShortArrayArray6;
			Static580.aShortArrayArrayArray3 = Static579.aShortArrayArrayArray2;
		}
		if (Static102.aClass181_38 == Static341.aClass181_93) {
			Static630.aBoolean720 = false;
		}
		try {
			Static60.aClipboard1 = Static487.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(229) Exception local229) {
		}
		Static530.aClass284_1 = Static2.method25(Static469.aCanvas11);
		Static542.aClass75_1 = Static538.method7479(Static469.aCanvas11);
		try {
			if (Static499.aClass231_4.aClass123_1 != null) {
				Static670.aClass251_170 = new Class251(Static499.aClass231_4.aClass123_1, 5200, 0);
				for (@Pc(251) int local251 = 0; local251 < 37; local251++) {
					Static19.aClass251Array1[local251] = new Class251(Static499.aClass231_4.aClass123Array1[local251], 6000, 0);
				}
				Static377.aClass251_104 = new Class251(Static499.aClass231_4.aClass123_2, 6000, 0);
				Static584.aClass313_4 = new Class313(255, Static670.aClass251_170, Static377.aClass251_104, 500000);
				Static30.aClass251_7 = new Class251(Static499.aClass231_4.aClass123_3, 24, 0);
				Static499.aClass231_4.aClass123_1 = null;
				Static499.aClass231_4.aClass123_2 = null;
				Static499.aClass231_4.aClass123_3 = null;
				Static499.aClass231_4.aClass123Array1 = null;
			}
		} catch (@Pc(307) IOException local307) {
			Static584.aClass313_4 = null;
			Static377.aClass251_104 = null;
			Static30.aClass251_7 = null;
			Static670.aClass251_170 = null;
		}
		if (Static229.aClass309_8 != Static216.aClass309_6) {
			Static408.aBoolean526 = true;
		}
		Static471.aString127 = Static569.aClass335_13.method7694(Static319.anInt5939);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1747() {
		if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() != 2) {
			this.method1761();
			return;
		}
		try {
			this.method1761();
		} catch (@Pc(14) ThreadDeath local14) {
			throw local14;
		} catch (@Pc(17) Throwable local17) {
			Static81.method1711(local17.getMessage() + " (Recovered) " + this.method1737(), local17);
			Static321.aBoolean466 = true;
			Static422.method6016(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1735() {
		if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() != 2) {
			this.method1767();
			return;
		}
		try {
			this.method1767();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static81.method1711(local25.getMessage() + " (Recovered) " + this.method1737(), local25);
			Static321.aBoolean466 = true;
			Static422.method6016(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1763() {
		@Pc(30) int local30;
		if (Static520.anInt6836 == 7 && Static216.anInt3999 == 0) {
			if (Static253.anInt4769 > 1) {
				Static431.anInt7596 = Static373.anInt6615;
				Static253.anInt4769--;
			}
			if (!Static463.aBoolean600) {
				Static551.method7575();
			}
			for (local30 = 0; local30 < 100 && Static123.method2197(); local30++) {
			}
		}
		Static527.anInt8716++;
		Static250.method3961(-1, (Class208) null, -1);
		Static488.method7009(-1, (Class208) null, -1);
		Static110.method2095();
		Static373.anInt6615++;
		for (local30 = 0; local30 < Static609.anInt6433; local30++) {
			@Pc(70) Class23_Sub2_Sub1_Sub2_Sub2 local70 = Static43.aClass3_Sub11Array1[local30].aClass23_Sub2_Sub1_Sub2_Sub2_1;
			if (local70 != null) {
				@Pc(76) byte local76 = local70.aClass5_1.aByte4;
				if ((local76 & 0x1) != 0) {
					@Pc(84) int local84 = local70.method8625();
					@Pc(108) int local108;
					if ((local76 & 0x2) != 0 && local70.anInt10190 == 0 && Math.random() * 1000.0D < 10.0D) {
						local108 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(116) int local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local108 != 0 || local116 != 0) {
							@Pc(127) int local127 = local108 + local70.anIntArray659[0];
							@Pc(134) int local134 = local116 + local70.anIntArray660[0];
							if (local127 < 0) {
								local127 = 0;
							} else if (Static251.anInt4680 - local84 - 1 < local127) {
								local127 = Static251.anInt4680 - local84 - 1;
							}
							if (local134 < 0) {
								local134 = 0;
							} else if (Static406.anInt6924 - local84 - 1 < local134) {
								local134 = Static406.anInt6924 - local84 - 1;
							}
							@Pc(209) int local209 = Static398.method5728(0, local84, -1, local134, local70.anIntArray660[0], Static27.aClass198Array1[local70.aByte142], true, local127, Static437.anIntArray458, 0, Static207.anIntArray259, local84, local70.anIntArray659[0], local84);
							if (local209 > 0) {
								if (local209 > 9) {
									local209 = 9;
								}
								for (@Pc(220) int local220 = 0; local220 < local209; local220++) {
									local70.anIntArray659[local220] = Static207.anIntArray259[local209 - local220 - 1];
									local70.anIntArray660[local220] = Static437.anIntArray458[local209 - local220 - 1];
									local70.aByteArray109[local220] = 1;
								}
								local70.anInt10190 = local209;
							}
						}
					}
					Static549.method4290(true, local70);
					local108 = Static127.method2230(local70);
					Static431.method6360(local70);
					Static51.method1370(Static156.anInt5829, Static82.anInt1891, local70, local108);
					Static350.method5261(local70, Static82.anInt1891);
					Static508.method7190(local70);
				}
			}
		}
		if (Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
			if (Static378.anInt6662 == 2) {
				Static309.method4749();
			} else {
				Static25.method793();
			}
			if (Static97.anInt2082 >> 9 < 14 || Static97.anInt2082 >> 9 >= Static251.anInt4680 - 14 || Static663.anInt10236 >> 9 < 14 || Static663.anInt10236 >> 9 >= Static406.anInt6924 - 14) {
				Static80.method8701();
			}
		}
		while (true) {
			@Pc(340) Class3_Sub13 local340;
			@Pc(345) Class208 local345;
			@Pc(353) Class208 local353;
			do {
				local340 = (Class3_Sub13) Static68.aClass193_9.method4452();
				if (local340 == null) {
					while (true) {
						do {
							local340 = (Class3_Sub13) Static459.aClass193_47.method4452();
							if (local340 == null) {
								while (true) {
									do {
										local340 = (Class3_Sub13) Static257.aClass193_27.method4452();
										if (local340 == null) {
											if (Static503.aClass208_9 != null) {
												Static642.method8429();
											}
											if (Static621.anInt9665 % 1500 == 0) {
												Static48.method1278();
											}
											if (Static520.anInt6836 == 7 && Static216.anInt3999 == 0) {
												Static624.method8252();
											}
											Static165.method2760();
											if (Static538.aBoolean660 && Static491.aLong294 < Static131.method2268() - 60000L) {
												Static540.method6275();
											}
											for (@Pc(507) Class23_Sub1_Sub1 local507 = (Class23_Sub1_Sub1) Static190.aClass105_6.method2444(); local507 != null; local507 = (Class23_Sub1_Sub1) Static190.aClass105_6.method2448()) {
												if ((long) local507.anInt754 < Static131.method2268() / 1000L - 5L) {
													if (local507.aShort5 > 0) {
														Static310.method4784(5, local507.aString7 + Static569.aClass335_20.method7694(Static319.anInt5939), "", "", 0, "");
													}
													if (local507.aShort5 == 0) {
														Static310.method4784(5, local507.aString7 + Static569.aClass335_21.method7694(Static319.anInt5939), "", "", 0, "");
													}
													local507.method8588();
												}
											}
											if (Static520.anInt6836 == 7 && Static216.anInt3999 == 0) {
												if (Static673.aClass160_3 == null) {
													Static431.method6362(false);
													return;
												}
												Static607.anInt9516++;
												if (Static607.anInt9516 > 50) {
													@Pc(612) Class3_Sub44 local612 = Static275.method5689(Static63.aClass376_116, Static540.aClass282_4);
													Static616.method8089(local612);
												}
												try {
													Static73.method1618();
												} catch (@Pc(619) IOException local619) {
													Static431.method6362(false);
												}
											}
											return;
										}
										local345 = local340.aClass208_2;
										if (local345.anInt5608 < 0) {
											break;
										}
										local353 = Static676.method8728(local345.anInt5634);
									} while (local353 == null || local353.aClass208Array20 == null || local345.anInt5608 >= local353.aClass208Array20.length || local353.aClass208Array20[local345.anInt5608] != local345);
									Static543.method7498(local340);
								}
							}
							local345 = local340.aClass208_2;
							if (local345.anInt5608 < 0) {
								break;
							}
							local353 = Static676.method8728(local345.anInt5634);
						} while (local353 == null || local353.aClass208Array20 == null || local345.anInt5608 >= local353.aClass208Array20.length || local353.aClass208Array20[local345.anInt5608] != local345);
						Static543.method7498(local340);
					}
				}
				local345 = local340.aClass208_2;
				if (local345.anInt5608 < 0) {
					break;
				}
				local353 = Static676.method8728(local345.anInt5634);
			} while (local353 == null || local353.aClass208Array20 == null || local345.anInt5608 >= local353.aClass208Array20.length || local353.aClass208Array20[local345.anInt5608] != local345);
			Static543.method7498(local340);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1744() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1749() {
		if (Static538.aBoolean660) {
			Static540.method6275();
		}
		Static2.method24();
		if (Static582.aClass16_12 != null) {
			Static582.aClass16_12.method8199();
		}
		if (Static153.aFrame3 != null) {
			Static185.method3000(Static153.aFrame3, Static499.aClass231_4);
			Static153.aFrame3 = null;
		}
		if (Static673.aClass160_3 != null) {
			Static673.aClass160_3.method3506();
			Static673.aClass160_3 = null;
		}
		Static616.method8090();
		Static600.aClass366_3.method8104();
		Static296.aClass233_6.method5373();
		if (Static227.aClass358_1 != null) {
			Static227.aClass358_1.method8043();
			Static227.aClass358_1 = null;
		}
		try {
			Static670.aClass251_170.method5747();
			for (@Pc(55) int local55 = 0; local55 < 37; local55++) {
				Static19.aClass251Array1[local55].method5747();
			}
			Static377.aClass251_104.method5747();
			Static30.aClass251_7.method5747();
			Static41.method1180();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1767() {
		if (Static520.anInt6836 == 14) {
			return;
		}
		Static621.anInt9665++;
		if (Static621.anInt9665 % 1000 == 1) {
			@Pc(28) GregorianCalendar local28 = new GregorianCalendar();
			Static9.anInt101 = local28.get(11) * 600 + local28.get(12) * 10 + local28.get(13) / 6;
			Static611.aRandom1.setSeed((long) Static9.anInt101);
		}
		if (Static621.anInt9665 % 50 == 0) {
			Static67.anInt9107 = Static78.anInt1752;
			Static369.anInt1973 = Static458.anInt7838;
			Static78.anInt1752 = 0;
			Static458.anInt7838 = 0;
		}
		this.method1757();
		if (Static448.aClass317_1 != null) {
			Static448.aClass317_1.method7439();
		}
		Static400.method5733();
		Static266.method3507();
		Static530.aClass284_1.method7633();
		Static542.aClass75_1.method8404();
		if (Static582.aClass16_12 != null) {
			Static582.aClass16_12.method8121((int) Static131.method2268());
		}
		Static223.method3474();
		Static29.anInt896 = 0;
		Static406.anInt6932 = 0;
		for (@Pc(100) Interface18 local100 = Static530.aClass284_1.method7632(); local100 != null; local100 = Static530.aClass284_1.method7632()) {
			@Pc(106) int local106 = local100.method5674();
			if (local106 == 2 || local106 == 3) {
				@Pc(120) char local120 = local100.method5676();
				if (Static254.method4039() && (local120 == '`' || local120 == '§' || local120 == '²')) {
					if (Static255.method4048()) {
						Static561.method7662();
					} else {
						Static121.method2182();
					}
				} else if (Static29.anInt896 < 128) {
					Static48.anInterface18Array1[Static29.anInt896] = local100;
					Static29.anInt896++;
				}
			} else if (local106 == 0 && Static406.anInt6932 < 75) {
				Static85.anInterface18Array2[Static406.anInt6932] = local100;
				Static406.anInt6932++;
			}
		}
		Static480.anInt8123 = 0;
		for (@Pc(185) Class3_Sub21 local185 = Static542.aClass75_1.method8411(); local185 != null; local185 = Static542.aClass75_1.method8411()) {
			@Pc(191) int local191 = local185.method7983();
			if (local191 == -1) {
				Static624.aClass193_66.method4462(local185);
			} else if (local191 == 6) {
				Static480.anInt8123 += local185.method7982();
			} else if (Static613.method8081(local191)) {
				Static565.aClass193_55.method4462(local185);
				if (Static565.aClass193_55.method4463() > 10) {
					Static565.aClass193_55.method4452();
				}
			}
		}
		if (Static255.method4048()) {
			Static223.method3475();
		}
		if (Static101.method1996(Static520.anInt6836)) {
			Static338.method5147();
			Static368.method5462();
		} else if (Static305.method4700(Static520.anInt6836)) {
			Static230.method3701();
		}
		if (Static649.method8507(Static520.anInt6836) && !Static305.method4700(Static520.anInt6836)) {
			this.method1763();
			Static305.method4699();
			Static161.method2739();
		} else if (Static473.method6805(Static520.anInt6836) && !Static305.method4700(Static520.anInt6836)) {
			this.method1763();
			Static161.method2739();
		} else if (Static520.anInt6836 == 12) {
			Static161.method2739();
		} else if (Static561.method7660(Static520.anInt6836) && !Static305.method4700(Static520.anInt6836)) {
			Static155.method2646();
		} else if (Static520.anInt6836 == 13) {
			Static161.method2739();
			if (Static39.anInt1160 != -3 && Static39.anInt1160 != 2 && Static39.anInt1160 != 15) {
				Static431.method6362(false);
			}
		}
		Static383.method5599(Static582.aClass16_12);
		Static565.aClass193_55.method4452();
	}
}
