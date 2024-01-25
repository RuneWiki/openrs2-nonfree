import jagex3.jagmisc.jagmisc;
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
				Static12.method393("Argument count");
			}
			Static516.aClass329_3 = new Class329();
			Static516.aClass329_3.anInt9698 = Integer.parseInt(arg0[0]);
			Static369.aClass329_4 = new Class329();
			Static369.aClass329_4.anInt9698 = Integer.parseInt(arg0[1]);
			Static460.aClass329_5 = new Class329();
			Static460.aClass329_5.anInt9698 = Integer.parseInt(arg0[2]);
			Static51.aClass109_2 = Static219.aClass109_4;
			if (arg0[3].equals("live")) {
				Static496.aClass320_9 = Static300.aClass320_8;
			} else if (arg0[3].equals("rc")) {
				Static496.aClass320_9 = Static402.aClass320_10;
			} else if (arg0[3].equals("wip")) {
				Static496.aClass320_9 = Static353.aClass320_7;
			} else {
				Static12.method393("modewhat");
			}
			Static126.anInt2904 = Static493.method7479(arg0[4]);
			if (Static126.anInt2904 == -1) {
				if (arg0[4].equals("english")) {
					Static126.anInt2904 = 0;
				} else if (arg0[4].equals("german")) {
					Static126.anInt2904 = 1;
				} else {
					Static12.method393("language");
				}
			}
			Static116.aBoolean210 = false;
			Static376.aBoolean619 = false;
			if (arg0[5].equals("game0")) {
				Static581.aClass335_4 = Static318.aClass335_2;
			} else if (arg0[5].equals("game1")) {
				Static581.aClass335_4 = Static329.aClass335_3;
			} else {
				Static12.method393("game");
			}
			Static4.anInt227 = Static581.aClass335_4.anInt9905;
			Static490.aBoolean759 = true;
			Static10.aBoolean29 = true;
			Static339.aLong179 = 0L;
			Static148.aString35 = null;
			Static566.aBoolean835 = false;
			Static64.aString16 = "";
			Static32.anInt2893 = 0;
			Static104.anInt2512 = 0;
			Static235.anInt4858 = 0;
			Static155.aBoolean262 = false;
			@Pc(166) client local166 = new client();
			Static173.aClient1 = local166;
			local166.method1674(Static581.aClass335_4.aString129, Static496.aClass320_9.method7712() + 32);
			Static531.aFrame1.setLocation(40, 40);
		} catch (@Pc(189) Exception local189) {
			Static468.method7192(null, local189);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1691(@OriginalArg(1) int arg0) {
		Static122.aClass289_2.anInt8680 = arg0;
		Static336.aClass66_5 = null;
		Static295.aClass310_1 = null;
		Static245.anInt5158 = 0;
		Static122.aClass289_2.anInt8681++;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1692() {
		@Pc(15) boolean local15 = Static122.aClass289_2.method7094();
		if (!local15) {
			this.method1695();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1675() {
		if (Static275.anInt5823 != 2) {
			this.method1697();
			return;
		}
		try {
			this.method1697();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static468.method7192(local22.getMessage() + " (Recovered) " + this.method1687(), local22);
			Static63.method1592(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1679() {
		if (Static253.anApplet3 != null && Static545.aCanvas14 == null) {
			try {
				@Pc(10) Class local10 = Static253.anApplet3.getClass();
				@Pc(14) Field local14 = local10.getDeclaredField("canvas");
				Static545.aCanvas14 = (Canvas) local14.get(Static253.anApplet3);
				local14.set(Static253.anApplet3, null);
				if (Static545.aCanvas14 != null) {
					return;
				}
			} catch (@Pc(27) Exception local27) {
			}
		}
		super.method1679();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1682()) {
			return;
		}
		Static516.aClass329_3 = new Class329();
		Static516.aClass329_3.anInt9698 = Integer.parseInt(this.getParameter("worldid"));
		Static369.aClass329_4 = new Class329();
		Static369.aClass329_4.anInt9698 = Integer.parseInt(this.getParameter("lobbyid"));
		Static369.aClass329_4.aString124 = this.getParameter("lobbyaddress");
		Static460.aClass329_5 = new Class329();
		Static460.aClass329_5.anInt9698 = Integer.parseInt(this.getParameter("demoid"));
		Static460.aClass329_5.aString124 = this.getParameter("demoaddress");
		Static51.aClass109_2 = Static154.method2976(Integer.parseInt(this.getParameter("modewhere")));
		if (Static51.aClass109_2 == Static219.aClass109_4) {
			Static51.aClass109_2 = Static478.aClass109_6;
		} else if (!Static173.method3118(Static51.aClass109_2) && Static51.aClass109_2 != Static508.aClass109_7) {
			Static51.aClass109_2 = Static508.aClass109_7;
		}
		Static496.aClass320_9 = Static533.method7863(Integer.parseInt(this.getParameter("modewhat")));
		if (Static353.aClass320_7 != Static496.aClass320_9 && Static496.aClass320_9 != Static402.aClass320_10 && Static300.aClass320_8 != Static496.aClass320_9) {
			Static496.aClass320_9 = Static300.aClass320_8;
		}
		try {
			Static126.anInt2904 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static126.anInt2904 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static376.aBoolean619 = true;
		} else {
			Static376.aBoolean619 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static116.aBoolean210 = true;
		} else {
			Static116.aBoolean210 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static440.aBoolean398 = true;
		} else {
			Static440.aBoolean398 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static581.aClass335_4 = Static318.aClass335_2;
			} else if (local152.equals("1")) {
				Static581.aClass335_4 = Static329.aClass335_3;
			}
		}
		try {
			Static32.anInt2893 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static32.anInt2893 = 0;
		}
		Static589.aString132 = this.getParameter("quiturl");
		Static64.aString16 = this.getParameter("settings");
		if (Static64.aString16 == null) {
			Static64.aString16 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static104.anInt2512 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static104.anInt2512 = 0;
			}
		}
		Static4.anInt227 = Integer.parseInt(this.getParameter("colourid"));
		if (Static4.anInt227 < 0 || Static4.anInt227 >= Static144.aColorArray1.length) {
			Static4.anInt227 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static490.aBoolean759 = true;
			Static10.aBoolean29 = true;
		}
		@Pc(236) String local236 = this.getParameter("frombilling");
		if (local236 != null && local236.equals("true")) {
			Static155.aBoolean262 = true;
		}
		Static148.aString35 = this.getParameter("sskey");
		if (Static148.aString35 != null && Static148.aString35.length() < 2) {
			Static148.aString35 = null;
		}
		@Pc(262) String local262 = this.getParameter("force64mb");
		if (local262 != null && local262.equals("true")) {
			Static566.aBoolean835 = true;
		}
		@Pc(274) String local274 = this.getParameter("worldflags");
		if (local274 != null) {
			try {
				Static235.anInt4858 = Integer.parseInt(local274);
			} catch (@Pc(281) Exception local281) {
			}
		}
		@Pc(286) String local286 = this.getParameter("userFlow");
		if (local286 != null) {
			try {
				Static339.aLong179 = Long.parseLong(local286);
			} catch (@Pc(293) NumberFormatException local293) {
			}
		}
		Static173.aClient1 = this;
		if (Static581.aClass335_4 == Static318.aClass335_2) {
			Static507.anInt9382 = 765;
			Static227.anInt4616 = 503;
		} else if (Static581.aClass335_4 == Static329.aClass335_3) {
			Static507.anInt9382 = 640;
			Static227.anInt4616 = 480;
		}
		this.method1685(Static227.anInt4616, Static581.aClass335_4.aString129, Static496.aClass320_9.method7712() + 32, Static507.anInt9382);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1695() {
		if (Static122.aClass289_2.anInt8681 > Static179.anInt3622) {
			Static461.aClass329_6.method7876();
			Static273.anInt5807 = (Static122.aClass289_2.anInt8681 * 50 - 50) * 5;
			if (Static273.anInt5807 > 3000) {
				Static273.anInt5807 = 3000;
			}
			if (Static122.aClass289_2.anInt8681 >= 2 && Static122.aClass289_2.anInt8680 == 6) {
				this.method1673("js5connect_outofdate");
				Static75.anInt1880 = 14;
				return;
			}
			if (Static122.aClass289_2.anInt8681 >= 4 && Static122.aClass289_2.anInt8680 == -1) {
				this.method1673("js5crc");
				Static75.anInt1880 = 14;
				return;
			}
			if (Static122.aClass289_2.anInt8681 >= 4 && Static194.method3316(Static75.anInt1880)) {
				if (Static122.aClass289_2.anInt8680 == 7 || Static122.aClass289_2.anInt8680 == 9) {
					this.method1673("js5connect_full");
				} else if (Static122.aClass289_2.anInt8680 <= 0) {
					this.method1673("js5io");
				} else if (Static538.aString125 == null) {
					this.method1673("js5connect");
				} else {
					this.method1673("js5proxy_" + Static538.aString125.trim());
				}
				Static75.anInt1880 = 14;
				return;
			}
		}
		Static179.anInt3622 = Static122.aClass289_2.anInt8681;
		if (Static273.anInt5807 > 0) {
			Static273.anInt5807--;
			return;
		}
		try {
			if (Static245.anInt5158 == 0) {
				Static336.aClass66_5 = Static461.aClass329_6.method7877(Static480.aClass326_3);
				Static245.anInt5158++;
			}
			if (Static245.anInt5158 == 1) {
				if (Static336.aClass66_5.anInt2308 == 2) {
					if (Static336.aClass66_5.anObject4 != null) {
						Static538.aString125 = (String) Static336.aClass66_5.anObject4;
					}
					this.method1691(1000);
					return;
				}
				if (Static336.aClass66_5.anInt2308 == 1) {
					Static245.anInt5158++;
				}
			}
			if (Static245.anInt5158 == 2) {
				Static295.aClass310_1 = new Class310((Socket) Static336.aClass66_5.anObject4, Static480.aClass326_3);
				@Pc(203) Class3_Sub7 local203 = new Class3_Sub7(5);
				local203.method6494(Static261.aClass33_30.anInt1080);
				local203.method6495(615);
				Static295.aClass310_1.method7573(5, local203.aByteArray86);
				Static245.anInt5158++;
				Static375.aLong189 = Static376.method6088();
			}
			if (Static245.anInt5158 == 3) {
				if (Static194.method3316(Static75.anInt1880) || Static295.aClass310_1.method7570() > 0) {
					@Pc(256) int local256 = Static295.aClass310_1.method7575();
					if (local256 != 0) {
						this.method1691(local256);
						return;
					}
					Static245.anInt5158++;
				} else if (Static376.method6088() - Static375.aLong189 > 30000L) {
					this.method1691(1001);
					return;
				}
			}
			if (Static245.anInt5158 == 4) {
				@Pc(291) boolean local291 = Static194.method3316(Static75.anInt1880) || Static211.method3722(Static75.anInt1880) || Static159.method3027(Static75.anInt1880);
				@Pc(294) Class208[] local294 = Static316.method5503();
				@Pc(302) Class3_Sub7 local302 = new Class3_Sub7(local294.length * 4);
				Static295.aClass310_1.method7574(local302.aByteArray86.length, local302.aByteArray86, 0);
				for (@Pc(313) int local313 = 0; local313 < local294.length; local313++) {
					local294[local313].method5504(local302.method6497());
				}
				Static122.aClass289_2.method7097(!local291, Static295.aClass310_1);
				Static336.aClass66_5 = null;
				Static295.aClass310_1 = null;
				Static245.anInt5158 = 0;
			}
		} catch (@Pc(349) IOException local349) {
			this.method1691(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1681() {
		if (Static566.aBoolean835) {
			Static188.anInt3749 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static201.method3374();
		Static29.aClass349_1 = new Class349(Static480.aClass326_3);
		Static122.aClass289_2 = new Class289();
		Static97.method2121(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static51.aClass109_2 != Static508.aClass109_7) {
			Static574.aByteArrayArray31 = new byte[50][];
		}
		Static455.aClass3_Sub27_Sub1_1 = new Class3_Sub27_Sub1(Static480.aClass326_3);
		if (Static508.aClass109_7 == Static51.aClass109_2) {
			Static516.aClass329_3.aString124 = this.getCodeBase().getHost();
		} else if (Static173.method3118(Static51.aClass109_2)) {
			Static516.aClass329_3.aString124 = this.getCodeBase().getHost();
			Static516.aClass329_3.anInt9687 = Static516.aClass329_3.anInt9698 + 40000;
			Static369.aClass329_4.anInt9687 = Static369.aClass329_4.anInt9698 + 40000;
			Static516.aClass329_3.anInt9689 = Static516.aClass329_3.anInt9698 + 50000;
			Static460.aClass329_5.anInt9687 = Static460.aClass329_5.anInt9698 + 40000;
			Static369.aClass329_4.anInt9689 = Static369.aClass329_4.anInt9698 + 50000;
			Static460.aClass329_5.anInt9689 = Static460.aClass329_5.anInt9698 + 50000;
		} else if (Static219.aClass109_4 == Static51.aClass109_2) {
			Static516.aClass329_3.aString124 = "127.0.0.1";
			Static369.aClass329_4.aString124 = "127.0.0.1";
			Static516.aClass329_3.anInt9687 = Static516.aClass329_3.anInt9698 + 40000;
			Static460.aClass329_5.aString124 = "127.0.0.1";
			Static369.aClass329_4.anInt9687 = Static369.aClass329_4.anInt9698 + 40000;
			Static460.aClass329_5.anInt9687 = Static460.aClass329_5.anInt9698 + 40000;
			Static516.aClass329_3.anInt9689 = Static516.aClass329_3.anInt9698 + 50000;
			Static369.aClass329_4.anInt9689 = Static369.aClass329_4.anInt9698 + 50000;
			Static460.aClass329_5.anInt9689 = Static460.aClass329_5.anInt9698 + 50000;
		}
		if (Static581.aClass335_4 == Static318.aClass335_2) {
			Static489.aBoolean757 = false;
		}
		Static562.aShortArray154 = Static491.aShortArray117 = Static556.aShortArray153 = Static582.aShortArray155 = new short[256];
		Static461.aClass329_6 = Static516.aClass329_3;
		if (Static329.aClass335_3 == Static581.aClass335_4) {
			Static42.aBoolean85 = true;
			Static542.anInt9777 = 0;
			Static545.aShortArrayArray12 = Static407.aShortArrayArray11;
			Static152.aShortArrayArrayArray1 = Static162.aShortArrayArrayArray2;
			Static97.anInt2346 = 16777215;
		} else {
			Static545.aShortArrayArray12 = Static19.aShortArrayArray1;
			Static152.aShortArrayArrayArray1 = Static199.aShortArrayArrayArray3;
		}
		Static212.aClass193_1 = Static514.method7667(Static545.aCanvas14);
		Static258.aClass116_1 = Static242.method4281(Static545.aCanvas14);
		try {
			if (Static480.aClass326_3.aClass148_3 != null) {
				Static589.aClass9_5 = new Class9(Static480.aClass326_3.aClass148_3, 5200, 0);
				for (@Pc(233) int local233 = 0; local233 < 35; local233++) {
					Static380.aClass9Array1[local233] = new Class9(Static480.aClass326_3.aClass148Array1[local233], 6000, 0);
				}
				Static433.aClass9_1 = new Class9(Static480.aClass326_3.aClass148_2, 6000, 0);
				Static317.aClass294_12 = new Class294(255, Static589.aClass9_5, Static433.aClass9_1, 500000);
				Static574.aClass9_4 = new Class9(Static480.aClass326_3.aClass148_4, 24, 0);
				Static480.aClass326_3.aClass148_3 = null;
				Static480.aClass326_3.aClass148Array1 = null;
				Static480.aClass326_3.aClass148_2 = null;
				Static480.aClass326_3.aClass148_4 = null;
			}
		} catch (@Pc(291) IOException local291) {
			Static589.aClass9_5 = null;
			Static574.aClass9_4 = null;
			Static433.aClass9_1 = null;
			Static317.aClass294_12 = null;
		}
		if (Static51.aClass109_2 != Static508.aClass109_7) {
			Static126.aBoolean224 = true;
		}
		if (Static318.aClass335_2 == Static581.aClass335_4) {
			Static211.aString44 = Static139.aClass101_1.method2841(Static126.anInt2904);
		} else if (Static329.aClass335_3 == Static581.aClass335_4) {
			Static211.aString44 = Static139.aClass101_2.method2841(Static126.anInt2904);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1683() {
		if (Static275.anInt5823 != 2) {
			this.method1704();
			return;
		}
		try {
			this.method1704();
		} catch (@Pc(13) ThreadDeath local13) {
			throw local13;
		} catch (@Pc(16) Throwable local16) {
			Static468.method7192(local16.getMessage() + " (Recovered) " + this.method1687(), local16);
			Static63.method1592(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1697() {
		if (Static75.anInt1880 == 14) {
			return;
		}
		Static129.anInt10429++;
		if (Static129.anInt10429 % 1000 == 1) {
			@Pc(31) GregorianCalendar local31 = new GregorianCalendar();
			Static346.anInt7036 = local31.get(11) * 600 + local31.get(12) * 10 + local31.get(13) / 6;
			Static154.aRandom1.setSeed((long) Static346.anInt7036);
		}
		if (Static129.anInt10429 % 50 == 0) {
			Static441.anInt8404 = Static43.anInt10255;
			Static43.anInt10255 = 0;
			Static508.anInt9392 = Static63.anInt1626;
			Static63.anInt1626 = 0;
		}
		this.method1692();
		if (Static506.aClass343_2 != null) {
			Static506.aClass343_2.method8127();
		}
		Static82.method1137();
		Static212.aClass193_1.method6329();
		Static258.aClass116_1.method8246();
		if (Static546.aClass15_16 != null) {
			Static546.aClass15_16.method5318((int) Static376.method6088());
		}
		Static585.method8315();
		Static280.anInt9834 = 0;
		Static110.anInt2599 = 0;
		for (@Pc(105) Interface23 local105 = Static212.aClass193_1.method6324(); local105 != null; local105 = Static212.aClass193_1.method6324()) {
			@Pc(111) int local111 = local105.method5042();
			if (local111 == 2 || local111 == 3) {
				@Pc(140) char local140 = local105.method5038();
				if (Static305.method5051() && (local140 == '`' || local140 == '§')) {
					if (Static379.method6127()) {
						Static39.method1144();
					} else {
						Static535.method7875();
					}
				} else if (Static110.anInt2599 < 128) {
					Static348.anInterface23Array3[Static110.anInt2599] = local105;
					Static110.anInt2599++;
				}
			} else if (local111 == 0 && Static280.anInt9834 < 75) {
				Static281.anInterface23Array4[Static280.anInt9834] = local105;
				Static280.anInt9834++;
			}
		}
		Static554.anInt9953 = 0;
		for (@Pc(187) Class3_Sub21 local187 = Static258.aClass116_1.method8254(); local187 != null; local187 = Static258.aClass116_1.method8254()) {
			@Pc(193) int local193 = local187.method3914();
			if (local193 == -1) {
				Static44.aClass183_4.method4792(local187);
			} else if (local193 == 6) {
				Static554.anInt9953 += local187.method3912();
			} else if (Static13.method394(local193)) {
				Static283.aClass183_38.method4792(local187);
				if (Static283.aClass183_38.method4799() > 10) {
					Static283.aClass183_38.method4797();
				}
			}
		}
		if (Static379.method6127()) {
			Static101.method2146();
		}
		if (Static194.method3316(Static75.anInt1880)) {
			Static135.method2791();
			Static168.method3106();
		} else if (Static517.method7684(Static75.anInt1880)) {
			Static156.method8245();
		}
		if (Static211.method3722(Static75.anInt1880) && !Static517.method7684(Static75.anInt1880)) {
			this.method1706();
			Static45.method1176();
			Static71.method1746();
		} else if (Static159.method3027(Static75.anInt1880) && !Static517.method7684(Static75.anInt1880)) {
			this.method1706();
			Static71.method1746();
		} else if (Static75.anInt1880 == 12) {
			Static71.method1746();
		} else if (Static16.method466(Static75.anInt1880) && !Static517.method7684(Static75.anInt1880)) {
			Static517.method7681();
		} else if (Static75.anInt1880 == 13) {
			Static71.method1746();
			if (Static573.anInt10095 != -3 && Static573.anInt10095 != 2 && Static573.anInt10095 != 15) {
				Static233.method4046(false);
			}
		}
		Static525.method7768(Static546.aClass15_16);
		Static283.aClass183_38.method4797();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1688() {
		if (Static463.aBoolean709) {
			Static38.method1123();
		}
		Static572.method8181();
		if (Static546.aClass15_16 != null) {
			Static546.aClass15_16.method5337();
		}
		if (Static578.aFrame2 != null) {
			Static281.method4845(Static578.aFrame2, Static480.aClass326_3);
			Static578.aFrame2 = null;
		}
		if (Static393.aClass8_2 != null) {
			Static393.aClass8_2.method362();
			Static393.aClass8_2 = null;
		}
		Static468.method7195();
		Static122.aClass289_2.method7103();
		Static29.aClass349_1.method8179();
		if (Static477.aClass285_1 != null) {
			Static477.aClass285_1.method7063();
			Static477.aClass285_1 = null;
		}
		try {
			Static589.aClass9_5.method374();
			for (@Pc(59) int local59 = 0; local59 < 35; local59++) {
				Static380.aClass9Array1[local59].method374();
			}
			Static433.aClass9_1.method374();
			Static574.aClass9_4.method374();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1690() {
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1704() {
		if (Static75.anInt1880 == 14) {
			return;
		}
		@Pc(16) long local16 = Static117.method2340() / 1000000L - Static236.aLong143;
		Static236.aLong143 = Static117.method2340() / 1000000L;
		@Pc(28) boolean local28 = Static11.method378();
		if (local28 && Static353.aBoolean597 && Static537.aClass24_3 != null) {
			Static537.aClass24_3.method1136();
		}
		if (Static171.method3113(Static75.anInt1880)) {
			if (Static206.aLong218 != 0L && Static206.aLong218 < Static376.method6088()) {
				Static342.method5819(Static216.method3759(), Static455.aClass3_Sub27_Sub1_1.anInt4786, Static455.aClass3_Sub27_Sub1_1.anInt4787, false);
			} else if (!Static546.aClass15_16.method5322() && Static346.aBoolean595) {
				Static493.method7482();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static578.aFrame2 == null) {
			@Pc(76) Container local76;
			if (Static531.aFrame1 != null) {
				local76 = Static531.aFrame1;
			} else if (Static253.anApplet3 == null) {
				local76 = Static329.anApplet_Sub1_1;
			} else {
				local76 = Static253.anApplet3;
			}
			local88 = local76.getSize().width;
			local92 = local76.getSize().height;
			if (Static531.aFrame1 == local76) {
				@Pc(98) Insets local98 = Static531.aFrame1.getInsets();
				local92 -= local98.top + local98.bottom;
				local88 -= local98.left + local98.right;
			}
			if (local88 != Static3.anInt172 || local92 != Static232.anInt4725 || Static159.aBoolean265) {
				if (Static546.aClass15_16 == null || Static546.aClass15_16.method5323()) {
					Static201.method3374();
				} else {
					Static232.anInt4725 = local92;
					Static3.anInt172 = local88;
				}
				Static206.aLong218 = Static376.method6088() + 500L;
				Static159.aBoolean265 = false;
			}
		}
		if (Static578.aFrame2 != null && !Static62.aBoolean115 && Static171.method3113(Static75.anInt1880)) {
			Static342.method5819(Static455.aClass3_Sub27_Sub1_1.anInt4801, -1, -1, false);
		}
		@Pc(161) boolean local161 = false;
		if (Static344.aBoolean590) {
			local161 = true;
			Static344.aBoolean590 = false;
		}
		if (local161) {
			Static251.method4499();
		}
		if (Static546.aClass15_16 != null && Static546.aClass15_16.method5322() || Static216.method3759() != 1) {
			Static210.method3686();
		}
		if (Static194.method3316(Static75.anInt1880)) {
			Static179.method3181(local161);
		} else if (Static441.method6902(Static75.anInt1880)) {
			Static41.method1151();
		} else if (Static134.method6491(Static75.anInt1880)) {
			Static41.method1151();
		} else if (Static517.method7684(Static75.anInt1880)) {
			if (Static432.anInt5801 == 1) {
				if (Static190.anInt3764 < Static427.anInt9469) {
					Static190.anInt3764 = Static427.anInt9469;
				}
				local88 = (Static190.anInt3764 - Static427.anInt9469) * 50 / Static190.anInt3764;
				Static569.method8164(true, Static139.aClass101_11.method2841(Static126.anInt2904) + "<br>(" + local88 + "%)", Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
			} else if (Static432.anInt5801 == 2) {
				if (Static299.anInt6050 < Static37.anInt1043) {
					Static299.anInt6050 = Static37.anInt1043;
				}
				local88 = (Static299.anInt6050 - Static37.anInt1043) * 50 / Static299.anInt6050 + 50;
				Static569.method8164(true, Static139.aClass101_11.method2841(Static126.anInt2904) + "<br>(" + local88 + "%)", Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
			} else {
				Static569.method8164(true, Static139.aClass101_11.method2841(Static126.anInt2904), Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
			}
		} else if (Static75.anInt1880 == 10) {
			Static402.method8392(local16);
		} else if (Static75.anInt1880 == 13) {
			Static569.method8164(true, Static139.aClass101_13.method2841(Static126.anInt2904) + "<br>" + Static139.aClass101_14.method2841(Static126.anInt2904), Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
		}
		if (Static157.anInt3409 == 3) {
			for (local88 = 0; local88 < Static377.anInt7315; local88++) {
				@Pc(357) Rectangle local357 = Class43.aRectangleArray6[local88];
				if (Static296.aBooleanArray20[local88]) {
					Static546.aClass15_16.method5341(-1996553985, local357.x, local357.height, local357.width, local357.y);
				} else if (Static52.aBooleanArray4[local88]) {
					Static546.aClass15_16.method5341(-1996554240, local357.x, local357.height, local357.width, local357.y);
				}
			}
		}
		if (Static379.method6127()) {
			Static373.method6079(Static546.aClass15_16);
		}
		if (Static480.aClass326_3.aBoolean803 && Static171.method3113(Static75.anInt1880) && Static157.anInt3409 == 0 && Static216.method3759() == 1 && !local161) {
			local88 = 0;
			for (local92 = 0; local92 < Static377.anInt7315; local92++) {
				if (Static52.aBooleanArray4[local92]) {
					Static52.aBooleanArray4[local92] = false;
					Static44.aRectangleArray1[local88++] = Class43.aRectangleArray6[local92];
				}
			}
			try {
				Static546.aClass15_16.method5338(Static44.aRectangleArray1, local88);
			} catch (@Pc(453) Exception_Sub1 local453) {
			}
		} else if (!Static194.method3316(Static75.anInt1880)) {
			for (local88 = 0; local88 < Static377.anInt7315; local88++) {
				Static52.aBooleanArray4[local88] = false;
			}
			try {
				Static546.aClass15_16.method5355();
			} catch (@Pc(475) Exception_Sub1 local475) {
				Static468.method7192(local475.getMessage() + " (Recovered) " + this.method1687(), local475);
				Static63.method1592(0);
			}
		}
		if (Static455.aClass3_Sub27_Sub1_1.anInt4809 == 0) {
			Static1.method125(15L);
		} else if (Static455.aClass3_Sub27_Sub1_1.anInt4809 == 1) {
			Static1.method125(10L);
		} else if (Static455.aClass3_Sub27_Sub1_1.anInt4809 == 2) {
			Static1.method125(5L);
		} else if (Static455.aClass3_Sub27_Sub1_1.anInt4809 == 3) {
			Static1.method125(2L);
		}
		if (Static127.aBoolean226) {
			Static5.method274();
		}
		if (Static455.aClass3_Sub27_Sub1_1.aBoolean381 && Static75.anInt1880 == 3 && Static25.anInt779 != -1) {
			Static455.aClass3_Sub27_Sub1_1.aBoolean381 = false;
			Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1687() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static230.anInt4667 + "," + Static563.anInt10006 + "," + Static460.anInt8640 + "," + Static292.anInt7682 + "|";
			if (Static443.aClass2_Sub2_Sub1_Sub1_2 != null) {
				local5 = local5 + "2)" + Static212.anInt4380 + "," + (Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] + Static230.anInt4667) + "," + (Static563.anInt10006 + Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0]) + "|";
			}
			local5 = local5 + "3)" + Static275.anInt5823 + "|4)" + Static455.aClass3_Sub27_Sub1_1.anInt4798 + "|5)" + Static216.method3759() + "|6)" + Static582.anInt10234 + "," + Static294.anInt10217 + "|";
			local5 = local5 + "7)" + Static455.aClass3_Sub27_Sub1_1.method4036(Static275.anInt5823) + "|";
			local5 = local5 + "8)" + Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823) + "|";
			local5 = local5 + "9)" + Static455.aClass3_Sub27_Sub1_1.aBoolean387 + "|";
			local5 = local5 + "10)" + Static455.aClass3_Sub27_Sub1_1.aBoolean391 + "|";
			local5 = local5 + "11)" + Static455.aClass3_Sub27_Sub1_1.aBoolean380 + "|";
			local5 = local5 + "12)" + Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823) + "|";
			local5 = local5 + "13)" + Static188.anInt3749 + "|";
			local5 = local5 + "14)" + Static75.anInt1880;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(219) Throwable local219) {
			}
			try {
				if (Static275.anInt5823 == 2) {
					@Pc(227) Class local227 = Class.forName("java.lang.ClassLoader");
					@Pc(231) Field local231 = local227.getDeclaredField("nativeLibraries");
					@Pc(234) Class local234 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(244) Method local244 = local234.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local244.invoke(local231, Boolean.TRUE);
					@Pc(267) Vector local267 = (Vector) local231.get(client.class.getClassLoader());
					for (@Pc(269) int local269 = 0; local267.size() > local269; local269++) {
						try {
							@Pc(274) Object local274 = local267.elementAt(local269);
							@Pc(279) Field local279 = local274.getClass().getDeclaredField("name");
							local244.invoke(local279, Boolean.TRUE);
							try {
								@Pc(294) String local294 = (String) local279.get(local274);
								if (local294 != null && local294.indexOf("sw3d.dll") != -1) {
									@Pc(306) Field local306 = local274.getClass().getDeclaredField("handle");
									local244.invoke(local306, Boolean.TRUE);
									local5 = local5 + "|16)" + Long.toHexString(local306.getLong(local274));
									local244.invoke(local306, Boolean.FALSE);
								}
							} catch (@Pc(342) Throwable local342) {
							}
							local244.invoke(local279, Boolean.FALSE);
						} catch (@Pc(354) Throwable local354) {
						}
					}
				}
			} catch (@Pc(362) Throwable local362) {
			}
			local5 = local5 + "]";
		} catch (@Pc(378) Throwable local378) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1706() {
		@Pc(25) int local25;
		if (Static75.anInt1880 == 7 && Static353.anInt7069 == 0) {
			if (Static101.anInt2408 > 1) {
				Static596.anInt10437 = Static509.anInt9418;
				Static101.anInt2408--;
			}
			if (!Static256.aBoolean474) {
				Static271.method4718();
			}
			for (local25 = 0; local25 < 100 && Static171.method3110(); local25++) {
			}
		}
		Static377.anInt7320++;
		Static149.method2486(-1, -1, null);
		Static255.method4559(-1, -1, null);
		Static313.method5254();
		Static509.anInt9418++;
		for (local25 = 0; local25 < Static17.anInt6046; local25++) {
			@Pc(73) Class2_Sub2_Sub1_Sub2 local73 = Static60.aClass3_Sub46Array1[local25].aClass2_Sub2_Sub1_Sub2_2;
			if (local73 != null) {
				@Pc(79) byte local79 = local73.aClass169_1.aByte45;
				if ((local79 & 0x1) != 0) {
					@Pc(87) int local87 = local73.method6311();
					@Pc(111) int local111;
					if ((local79 & 0x2) != 0 && local73.anInt7660 == 0 && Math.random() * 1000.0D < 10.0D) {
						local111 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(119) int local119 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local111 != 0 || local119 != 0) {
							@Pc(133) int local133 = local73.anIntArray487[0] + local111;
							if (local133 < 0) {
								local133 = 0;
							} else if (local133 > Static460.anInt8640 - local87 - 1) {
								local133 = Static460.anInt8640 - local87 - 1;
							}
							@Pc(169) int local169 = local73.anIntArray488[0] + local119;
							if (local169 < 0) {
								local169 = 0;
							} else if (Static292.anInt7682 - local87 - 1 < local169) {
								local169 = Static292.anInt7682 - local87 - 1;
							}
							@Pc(223) int local223 = Static515.method7678(local133, 0, local87, Static248.anIntArray320, local169, -1, 0, Static485.anIntArray585, local87, true, Static403.aClass350Array1[local73.aByte103], local73.anIntArray487[0], local73.anIntArray488[0], local87);
							if (local223 > 0) {
								if (local223 > 9) {
									local223 = 9;
								}
								for (@Pc(237) int local237 = 0; local237 < local223; local237++) {
									local73.anIntArray487[local237] = Static248.anIntArray320[local223 - local237 - 1];
									local73.anIntArray488[local237] = Static485.anIntArray585[local223 - local237 - 1];
									local73.aByteArray85[local237] = 1;
								}
								local73.anInt7660 = local223;
							}
						}
					}
					Static311.method5196(true, local73);
					local111 = Static6.method279(local73);
					Static1.method126(Static46.anInt1149, Static89.anInt2254, local73, local111);
					Static512.method7666(local73, Static89.anInt2254);
					Static538.method7909(local73);
				}
			}
		}
		if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
			if (Static267.anInt5668 == 2) {
				Static430.method6821();
			} else {
				Static286.method8370();
			}
			if (Static594.anInt10391 >> 9 < 14 || Static460.anInt8640 - 14 <= Static594.anInt10391 >> 9 || Static496.anInt9269 >> 9 < 14 || Static292.anInt7682 - 14 <= Static496.anInt9269 >> 9) {
				Static587.method8318();
			}
		}
		while (true) {
			@Pc(362) Class3_Sub38 local362;
			@Pc(367) Class305 local367;
			@Pc(375) Class305 local375;
			do {
				local362 = (Class3_Sub38) Static517.aClass183_57.method4797();
				if (local362 == null) {
					while (true) {
						do {
							local362 = (Class3_Sub38) Static171.aClass183_17.method4797();
							if (local362 == null) {
								while (true) {
									do {
										local362 = (Class3_Sub38) Static319.aClass183_40.method4797();
										if (local362 == null) {
											if (Static360.aClass305_3 != null) {
												Static240.method4172();
											}
											if (Static129.anInt10429 % 1500 == 0) {
												Static366.method6021();
											}
											if (Static75.anInt1880 == 7 && Static353.anInt7069 == 0) {
												Static216.method3755();
											}
											Static339.method5809();
											if (Static463.aBoolean709 && Static376.method6088() - 60000L > Static52.aLong52) {
												Static38.method1123();
											}
											for (@Pc(535) Class55_Sub2_Sub2 local535 = (Class55_Sub2_Sub2) Static472.aClass134_11.method3233(); local535 != null; local535 = (Class55_Sub2_Sub2) Static472.aClass134_11.method3230()) {
												if (Static376.method6088() / 1000L - 5L > (long) local535.anInt5535) {
													if (local535.aShort53 > 0) {
														Static348.method2212(0, "", 5, "", local535.aString58 + Static139.aClass101_18.method2841(Static126.anInt2904), "");
													}
													if (local535.aShort53 == 0) {
														Static348.method2212(0, "", 5, "", local535.aString58 + Static139.aClass101_19.method2841(Static126.anInt2904), "");
													}
													local535.method7112();
												}
											}
											if (Static75.anInt1880 == 7 && Static353.anInt7069 == 0) {
												if (Static393.aClass8_2 == null) {
													Static233.method4046(false);
													return;
												}
												Static484.anInt9039++;
												if (Static484.anInt9039 > 50) {
													@Pc(638) Class3_Sub9 local638 = Static587.method8316(Static187.aClass40_2, Static280.aClass230_103);
													Static230.method3933(local638);
												}
												try {
													Static326.method5661();
													return;
												} catch (@Pc(645) IOException local645) {
													Static233.method4046(false);
													return;
												}
											}
											return;
										}
										local367 = local362.aClass305_11;
										if (local367.anInt9159 < 0) {
											break;
										}
										local375 = Static220.method3786(local367.anInt9199);
									} while (local375 == null || local375.aClass305Array2 == null || local375.aClass305Array2.length <= local367.anInt9159 || local375.aClass305Array2[local367.anInt9159] != local367);
									Static597.method8423(local362);
								}
							}
							local367 = local362.aClass305_11;
							if (local367.anInt9159 < 0) {
								break;
							}
							local375 = Static220.method3786(local367.anInt9199);
						} while (local375 == null || local375.aClass305Array2 == null || local367.anInt9159 >= local375.aClass305Array2.length || local367 != local375.aClass305Array2[local367.anInt9159]);
						Static597.method8423(local362);
					}
				}
				local367 = local362.aClass305_11;
				if (local367.anInt9159 < 0) {
					break;
				}
				local375 = Static220.method3786(local367.anInt9199);
			} while (local375 == null || local375.aClass305Array2 == null || local367.anInt9159 >= local375.aClass305Array2.length || local367 != local375.aClass305Array2[local367.anInt9159]);
			Static597.method8423(local362);
		}
	}
}
