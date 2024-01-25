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

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static307.method4615("Argument count");
			}
			Static259.aClass297_4 = new Class297();
			Static259.aClass297_4.anInt8579 = Integer.parseInt(arg0[0]);
			Static133.aClass297_3 = new Class297();
			Static133.aClass297_3.anInt8579 = Integer.parseInt(arg0[1]);
			Static416.aClass297_5 = new Class297();
			Static416.aClass297_5.anInt8579 = Integer.parseInt(arg0[2]);
			Static338.aClass45_6 = Static9.aClass45_1;
			if (arg0[3].equals("live")) {
				Static546.aClass79_4 = Static97.aClass79_2;
			} else if (arg0[3].equals("rc")) {
				Static546.aClass79_4 = Static122.aClass79_3;
			} else if (arg0[3].equals("wip")) {
				Static546.aClass79_4 = Static17.aClass79_1;
			} else {
				Static307.method4615("modewhat");
			}
			Static188.anInt28 = Static114.method1795(arg0[4]);
			if (Static188.anInt28 == -1) {
				if (arg0[4].equals("english")) {
					Static188.anInt28 = 0;
				} else if (arg0[4].equals("german")) {
					Static188.anInt28 = 1;
				} else {
					Static307.method4615("language");
				}
			}
			Static71.aBoolean84 = false;
			Static90.aBoolean359 = false;
			if (arg0[5].equals("game0")) {
				Static172.aClass68_4 = Static126.aClass68_3;
			} else if (arg0[5].equals("game1")) {
				Static172.aClass68_4 = Static14.aClass68_6;
			} else {
				Static307.method4615("game");
			}
			Static204.aBoolean305 = true;
			Static241.aBoolean324 = true;
			Static340.aBoolean452 = false;
			Static184.aLong78 = 0L;
			Static543.anInt9322 = 0;
			Static152.anInt1937 = 0;
			Static315.aString50 = "";
			Static311.anInt5726 = 0;
			Static198.aBoolean301 = false;
			Static299.aString45 = null;
			Static187.anInt3680 = Static172.aClass68_4.anInt1509;
			@Pc(162) client local162 = new client();
			Static536.aClient1 = local162;
			local162.method1022(Static172.aClass68_4.aString6, Static546.aClass79_4.method1705() + 32);
			Static435.aFrame2.setLocation(40, 40);
		} catch (@Pc(185) Exception local185) {
			Static214.method5693(null, local185);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1016() {
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1034() {
		@Pc(12) boolean local12 = Static469.aClass180_3.method4352();
		if (!local12) {
			this.method1047();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1035() {
		if (Static375.anInt9162 == 14) {
			return;
		}
		@Pc(16) long local16 = Static42.method668() / 1000000L - Static297.aLong124;
		Static297.aLong124 = Static42.method668() / 1000000L;
		@Pc(24) boolean local24 = Static131.method2164();
		if (local24 && Static396.aBoolean490 && Static431.aClass189_2 != null) {
			Static431.aClass189_2.method4946();
		}
		if (Static216.method1066(Static375.anInt9162)) {
			if (Static21.aLong14 != 0L && Static21.aLong14 < Static416.method5922()) {
				Static192.method3260(Static278.method4179(), false, Static58.aClass6_Sub17_Sub1_1.anInt9272, Static58.aClass6_Sub17_Sub1_1.anInt9290);
			} else if (!Static554.aClass90_12.method7498() && Static142.aBoolean211) {
				Static86.method7966();
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		if (Static85.aFrame1 == null) {
			@Pc(70) Container local70;
			if (Static435.aFrame2 != null) {
				local70 = Static435.aFrame2;
			} else if (Static198.anApplet1 == null) {
				local70 = Static576.anApplet_Sub1_1;
			} else {
				local70 = Static198.anApplet1;
			}
			local84 = local70.getSize().width;
			local88 = local70.getSize().height;
			if (local70 == Static435.aFrame2) {
				@Pc(94) Insets local94 = Static435.aFrame2.getInsets();
				local84 -= local94.left + local94.right;
				local88 -= local94.bottom + local94.top;
			}
			if (local84 != Static258.anInt4672 || local88 != Static460.anInt8100 || Static258.aBoolean348) {
				if (Static554.aClass90_12 == null || Static554.aClass90_12.method7506()) {
					Static249.method3890();
				} else {
					Static460.anInt8100 = local88;
					Static258.anInt4672 = local84;
				}
				Static21.aLong14 = Static416.method5922() + 500L;
				Static258.aBoolean348 = false;
			}
		}
		if (Static85.aFrame1 != null && !Static162.aBoolean225 && Static216.method1066(Static375.anInt9162)) {
			Static192.method3260(Static58.aClass6_Sub17_Sub1_1.anInt9294, false, -1, -1);
		}
		@Pc(164) boolean local164 = false;
		if (Static485.aBoolean558) {
			Static485.aBoolean558 = false;
			local164 = true;
		}
		if (local164) {
			Static540.method7136();
		}
		if (Static554.aClass90_12 != null && Static554.aClass90_12.method7498() || Static278.method4179() != 1) {
			Static39.method645();
		}
		if (Static111.method1702(Static375.anInt9162)) {
			Static373.method5471(local164);
		} else if (Static25.method353(Static375.anInt9162)) {
			Static285.method4345();
		} else if (Static10.method133(Static375.anInt9162)) {
			Static285.method4345();
		} else if (Static101.method2476(Static375.anInt9162)) {
			if (Static46.anInt864 == 1) {
				if (Static6.anInt93 > Static430.anInt7679) {
					Static430.anInt7679 = Static6.anInt93;
				}
				local84 = (Static430.anInt7679 - Static6.anInt93) * 50 / Static430.anInt7679;
				Static237.method3695(Static146.aClass103_13.method2355(Static188.anInt28) + "<br>(" + local84 + "%)", Static75.aClass82_1, true);
			} else if (Static46.anInt864 == 2) {
				if (Static212.anInt9973 < Static39.anInt748) {
					Static212.anInt9973 = Static39.anInt748;
				}
				local84 = (Static212.anInt9973 - Static39.anInt748) * 50 / Static212.anInt9973 + 50;
				Static237.method3695(Static146.aClass103_13.method2355(Static188.anInt28) + "<br>(" + local84 + "%)", Static75.aClass82_1, true);
			} else {
				Static237.method3695(Static146.aClass103_13.method2355(Static188.anInt28), Static75.aClass82_1, true);
			}
		} else if (Static375.anInt9162 == 10) {
			Static422.method5976(local16);
		} else if (Static375.anInt9162 == 13) {
			Static237.method3695(Static146.aClass103_15.method2355(Static188.anInt28) + "<br>" + Static146.aClass103_16.method2355(Static188.anInt28), Static75.aClass82_1, true);
		}
		if (Static365.anInt6688 == 3) {
			for (local84 = 0; local84 < Static97.anInt1562; local84++) {
				@Pc(367) Rectangle local367 = Class343.aRectangleArray5[local84];
				if (Static100.aBooleanArray7[local84]) {
					Static554.aClass90_12.method7482(local367.y, -1996553985, local367.width, local367.height, local367.x);
				} else if (Static366.aBooleanArray23[local84]) {
					Static554.aClass90_12.method7482(local367.y, -1996554240, local367.width, local367.height, local367.x);
				}
			}
		}
		if (Static234.method3603()) {
			Static500.method6915(Static554.aClass90_12);
		}
		if (Static174.aClass313_24.aBoolean570 && Static216.method1066(Static375.anInt9162) && Static365.anInt6688 == 0 && Static278.method4179() == 1 && !local164) {
			local84 = 0;
			for (local88 = 0; local88 < Static97.anInt1562; local88++) {
				if (Static366.aBooleanArray23[local88]) {
					Static366.aBooleanArray23[local88] = false;
					Static40.aRectangleArray4[local84++] = Class343.aRectangleArray5[local88];
				}
			}
			try {
				Static554.aClass90_12.method7460(Static40.aRectangleArray4, local84);
			} catch (@Pc(506) Exception_Sub1 local506) {
			}
		} else if (Static375.anInt9162 != 0) {
			for (local84 = 0; local84 < Static97.anInt1562; local84++) {
				Static366.aBooleanArray23[local84] = false;
			}
			try {
				Static554.aClass90_12.method7508();
			} catch (@Pc(450) Exception_Sub1 local450) {
				Static214.method5693(local450.getMessage() + " (Recovered) " + this.method1018(), local450);
				Static584.method7942(0);
			}
		}
		if (Static58.aClass6_Sub17_Sub1_1.anInt9271 == 0) {
			Static183.method3079(15L);
		} else if (Static58.aClass6_Sub17_Sub1_1.anInt9271 == 1) {
			Static183.method3079(10L);
		} else if (Static58.aClass6_Sub17_Sub1_1.anInt9271 == 2) {
			Static183.method3079(5L);
		} else if (Static58.aClass6_Sub17_Sub1_1.anInt9271 == 3) {
			Static183.method3079(2L);
		}
		if (Static280.aBoolean361) {
			Static568.method7827();
		}
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean597 && Static375.anInt9162 == 3 && Static152.anInt1936 != -1) {
			Static58.aClass6_Sub17_Sub1_1.aBoolean597 = false;
			Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1023()) {
			return;
		}
		Static259.aClass297_4 = new Class297();
		Static259.aClass297_4.anInt8579 = Integer.parseInt(this.getParameter("worldid"));
		Static133.aClass297_3 = new Class297();
		Static133.aClass297_3.anInt8579 = Integer.parseInt(this.getParameter("lobbyid"));
		Static133.aClass297_3.aString70 = this.getParameter("lobbyaddress");
		Static416.aClass297_5 = new Class297();
		Static416.aClass297_5.anInt8579 = Integer.parseInt(this.getParameter("demoid"));
		Static416.aClass297_5.aString70 = this.getParameter("demoaddress");
		Static338.aClass45_6 = Static38.method637(Integer.parseInt(this.getParameter("modewhere")));
		if (Static9.aClass45_1 == Static338.aClass45_6) {
			Static338.aClass45_6 = Static575.aClass45_8;
		} else if (!Static367.method5426(Static338.aClass45_6) && Static101.aClass45_4 != Static338.aClass45_6) {
			Static338.aClass45_6 = Static101.aClass45_4;
		}
		Static546.aClass79_4 = Static161.method2575(Integer.parseInt(this.getParameter("modewhat")));
		if (Static546.aClass79_4 != Static17.aClass79_1 && Static546.aClass79_4 != Static122.aClass79_3 && Static546.aClass79_4 != Static97.aClass79_2) {
			Static546.aClass79_4 = Static97.aClass79_2;
		}
		try {
			Static188.anInt28 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static188.anInt28 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static90.aBoolean359 = true;
		} else {
			Static90.aBoolean359 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static71.aBoolean84 = true;
		} else {
			Static71.aBoolean84 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static571.aBoolean664 = true;
		} else {
			Static571.aBoolean664 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static172.aClass68_4 = Static126.aClass68_3;
			} else if (local152.equals("1")) {
				Static172.aClass68_4 = Static14.aClass68_6;
			}
		}
		try {
			Static543.anInt9322 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static543.anInt9322 = 0;
		}
		Static451.aString64 = this.getParameter("quiturl");
		Static315.aString50 = this.getParameter("settings");
		if (Static315.aString50 == null) {
			Static315.aString50 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static311.anInt5726 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static311.anInt5726 = 0;
			}
		}
		Static187.anInt3680 = Integer.parseInt(this.getParameter("colourid"));
		if (Static187.anInt3680 < 0 || Static379.aColorArray3.length <= Static187.anInt3680) {
			Static187.anInt3680 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static204.aBoolean305 = true;
			Static241.aBoolean324 = true;
		}
		@Pc(235) String local235 = this.getParameter("frombilling");
		if (local235 != null && local235.equals("true")) {
			Static340.aBoolean452 = true;
		}
		Static299.aString45 = this.getParameter("sskey");
		if (Static299.aString45 != null && Static299.aString45.length() < 2) {
			Static299.aString45 = null;
		}
		@Pc(261) String local261 = this.getParameter("force64mb");
		if (local261 != null && local261.equals("true")) {
			Static198.aBoolean301 = true;
		}
		@Pc(273) String local273 = this.getParameter("worldflags");
		if (local273 != null) {
			try {
				Static152.anInt1937 = Integer.parseInt(local273);
			} catch (@Pc(280) Exception local280) {
			}
		}
		@Pc(285) String local285 = this.getParameter("userFlow");
		if (local285 != null) {
			try {
				Static184.aLong78 = Long.parseLong(local285);
			} catch (@Pc(292) NumberFormatException local292) {
			}
		}
		if (Static126.aClass68_3 == Static172.aClass68_4) {
			Static168.anInt3084 = 765;
			Static112.anInt1892 = 503;
		} else if (Static14.aClass68_6 == Static172.aClass68_4) {
			Static112.anInt1892 = 480;
			Static168.anInt3084 = 640;
		}
		Static536.aClient1 = this;
		this.method1020(Static112.anInt1892, Static168.anInt3084, Static172.aClass68_4.aString6, Static546.aClass79_4.method1705() + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1037() {
		if (Static375.anInt9162 == 14) {
			return;
		}
		Static363.anInt6671++;
		if (Static363.anInt6671 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static344.anInt6510 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static28.aRandom1.setSeed((long) Static344.anInt6510);
		}
		if (Static363.anInt6671 % 50 == 0) {
			Static286.anInt5275 = Static438.anInt7792;
			Static362.anInt6653 = Static203.anInt3864;
			Static438.anInt7792 = 0;
			Static203.anInt3864 = 0;
		}
		this.method1034();
		if (Static452.aClass54_1 != null) {
			Static452.aClass54_1.method982();
		}
		Static193.method3265();
		Static184.aClass262_1.method6382();
		Static9.aClass29_1.method2938();
		if (Static554.aClass90_12 != null) {
			Static554.aClass90_12.method7486((int) Static416.method5922());
		}
		Static447.method6303();
		Static459.anInt8079 = 0;
		Static21.anInt380 = 0;
		for (@Pc(104) Interface5 local104 = Static184.aClass262_1.method6379(); local104 != null; local104 = Static184.aClass262_1.method6379()) {
			@Pc(110) int local110 = local104.method6893();
			if (local110 == 2 || local110 == 3) {
				@Pc(139) char local139 = local104.method6890();
				if (Static38.method636() && (local139 == '`' || local139 == '§')) {
					if (Static234.method3603()) {
						Static40.method7214();
					} else {
						Static356.method5350();
					}
				} else if (Static459.anInt8079 < 128) {
					Static80.anInterface5Array1[Static459.anInt8079] = local104;
					Static459.anInt8079++;
				}
			} else if (local110 == 0 && Static21.anInt380 < 75) {
				Static352.anInterface5Array2[Static21.anInt380] = local104;
				Static21.anInt380++;
			}
		}
		Static502.anInt8744 = 0;
		for (@Pc(184) Class6_Sub41 local184 = Static9.aClass29_1.method2948(); local184 != null; local184 = Static9.aClass29_1.method2948()) {
			@Pc(190) int local190 = local184.method6484();
			if (local190 == -1) {
				Static192.aClass298_81.method6812(local184);
			} else if (local190 == 6) {
				Static502.anInt8744 += local184.method6482();
			} else if (Static115.method1815(local190)) {
				Static43.aClass298_22.method6812(local184);
				if (Static43.aClass298_22.method6815() > 10) {
					Static43.aClass298_22.method6811();
				}
			}
		}
		if (Static234.method3603()) {
			Static57.method830();
		}
		if (Static111.method1702(Static375.anInt9162)) {
			Static251.method3924();
			Static320.method4969();
		} else if (Static101.method2476(Static375.anInt9162)) {
			Static252.method3928();
		}
		if (Static16.method202(Static375.anInt9162) && !Static101.method2476(Static375.anInt9162)) {
			this.method1042();
			Static395.method5733();
			Static305.method1620();
		} else if (Static355.method5330(Static375.anInt9162) && !Static101.method2476(Static375.anInt9162)) {
			this.method1042();
			Static305.method1620();
		} else if (Static375.anInt9162 == 12) {
			Static305.method1620();
		} else if (Static151.method2389(Static375.anInt9162) && !Static101.method2476(Static375.anInt9162)) {
			Static223.method3519();
		} else if (Static375.anInt9162 == 13) {
			Static305.method1620();
			if (Static122.anInt2112 != -3 && Static122.anInt2112 != 2 && Static122.anInt2112 != 15) {
				Static342.method5247(false);
			}
		}
		Static247.method3886(Static554.aClass90_12);
		Static43.aClass298_22.method6811();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1028() {
		if (Static198.aBoolean301) {
			Static355.anInt6598 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static249.method3890();
		Static468.aClass219_3 = new Class219(Static174.aClass313_24);
		Static469.aClass180_3 = new Class180();
		if (Static338.aClass45_6 != Static101.aClass45_4) {
			Static486.aByteArrayArray26 = new byte[50][];
		}
		Static58.aClass6_Sub17_Sub1_1 = new Class6_Sub17_Sub1(Static174.aClass313_24);
		if (Static338.aClass45_6 == Static101.aClass45_4) {
			Static259.aClass297_4.aString70 = this.getCodeBase().getHost();
		} else if (Static367.method5426(Static338.aClass45_6)) {
			Static259.aClass297_4.aString70 = this.getCodeBase().getHost();
			Static259.aClass297_4.anInt8578 = Static259.aClass297_4.anInt8579 + 40000;
			Static133.aClass297_3.anInt8578 = Static133.aClass297_3.anInt8579 + 40000;
			Static416.aClass297_5.anInt8578 = Static416.aClass297_5.anInt8579 + 40000;
			Static259.aClass297_4.anInt8574 = Static259.aClass297_4.anInt8579 + 50000;
			Static133.aClass297_3.anInt8574 = Static133.aClass297_3.anInt8579 + 50000;
			Static416.aClass297_5.anInt8574 = Static416.aClass297_5.anInt8579 + 50000;
		} else if (Static9.aClass45_1 == Static338.aClass45_6) {
			Static259.aClass297_4.aString70 = "127.0.0.1";
			Static133.aClass297_3.aString70 = "127.0.0.1";
			Static259.aClass297_4.anInt8578 = Static259.aClass297_4.anInt8579 + 40000;
			Static416.aClass297_5.aString70 = "127.0.0.1";
			Static133.aClass297_3.anInt8578 = Static133.aClass297_3.anInt8579 + 40000;
			Static259.aClass297_4.anInt8574 = Static259.aClass297_4.anInt8579 + 50000;
			Static416.aClass297_5.anInt8578 = Static416.aClass297_5.anInt8579 + 40000;
			Static133.aClass297_3.anInt8574 = Static133.aClass297_3.anInt8579 + 50000;
			Static416.aClass297_5.anInt8574 = Static416.aClass297_5.anInt8579 + 50000;
		}
		if (Static126.aClass68_3 == Static172.aClass68_4) {
			Static174.aBoolean257 = false;
		}
		if (Static14.aClass68_6 == Static172.aClass68_4) {
			Static252.aShortArrayArray18 = Static359.aShortArrayArray27;
			Static184.aShortArray48 = Static470.aShortArray137;
			Static8.aShortArrayArray1 = Static397.aShortArrayArray23;
			Static547.anInt9362 = 16777215;
			Static122.anInt2114 = 0;
			Static9.aBoolean9 = true;
			Static297.aShortArray82 = Static459.aShortArray136;
		} else {
			Static252.aShortArrayArray18 = Static17.aShortArrayArray2;
			Static184.aShortArray48 = Static83.aShortArray12;
			Static297.aShortArray82 = Static482.aShortArray139;
			Static8.aShortArrayArray1 = Static231.aShortArrayArray28;
		}
		Static527.aShortArray143 = Static444.aShortArray133 = Static513.aShortArray140 = Static412.aShortArray162 = new short[256];
		Static65.aClass297_1 = Static259.aClass297_4;
		Static184.aClass262_1 = Static460.method6445(Static77.aCanvas1);
		Static9.aClass29_1 = Static213.method3452(Static77.aCanvas1);
		try {
			if (Static174.aClass313_24.aClass108_4 != null) {
				Static139.aClass193_1 = new Class193(Static174.aClass313_24.aClass108_4, 5200, 0);
				for (@Pc(213) int local213 = 0; local213 < 34; local213++) {
					Static349.aClass193Array1[local213] = new Class193(Static174.aClass313_24.aClass108Array1[local213], 6000, 0);
				}
				Static580.aClass193_5 = new Class193(Static174.aClass313_24.aClass108_2, 6000, 0);
				Static120.aClass109_3 = new Class109(255, Static139.aClass193_1, Static580.aClass193_5, 500000);
				Static479.aClass193_4 = new Class193(Static174.aClass313_24.aClass108_3, 24, 0);
				Static174.aClass313_24.aClass108_4 = null;
				Static174.aClass313_24.aClass108_3 = null;
				Static174.aClass313_24.aClass108Array1 = null;
				Static174.aClass313_24.aClass108_2 = null;
			}
		} catch (@Pc(275) IOException local275) {
			Static139.aClass193_1 = null;
			Static479.aClass193_4 = null;
			Static120.aClass109_3 = null;
			Static580.aClass193_5 = null;
		}
		if (Static101.aClass45_4 != Static338.aClass45_6) {
			Static32.aBoolean33 = true;
		}
		if (Static126.aClass68_3 == Static172.aClass68_4) {
			Static115.aString10 = Static146.aClass103_3.method2355(Static188.anInt28);
		} else if (Static14.aClass68_6 == Static172.aClass68_4) {
			Static115.aString10 = Static146.aClass103_4.method2355(Static188.anInt28);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1040(@OriginalArg(0) int arg0) {
		Static167.aClass52_1 = null;
		Static467.aClass224_9 = null;
		Static469.aClass180_3.anInt5273 = arg0;
		Static469.aClass180_3.anInt5272++;
		Static399.anInt7228 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1014() {
		if (Static79.anInt2700 != 2) {
			this.method1035();
			return;
		}
		try {
			this.method1035();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static214.method5693(local25.getMessage() + " (Recovered) " + this.method1018(), local25);
			Static584.method7942(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1042() {
		@Pc(23) int local23;
		if (Static375.anInt9162 == 7 && Static252.anInt4624 == 0) {
			if (Static503.anInt8751 > 1) {
				Static390.anInt7115 = Static124.anInt2133;
				Static503.anInt8751--;
			}
			if (!Static266.aBoolean351) {
				Static187.method3214();
			}
			for (local23 = 0; local23 < 100 && Static230.method3593(); local23++) {
			}
		}
		Static415.anInt7409++;
		Static51.method778(-1, null, -1);
		Static138.method2967(-1, -1, null);
		Static439.method6210();
		Static124.anInt2133++;
		for (local23 = 0; local23 < Static192.anInt3744; local23++) {
			@Pc(71) Class15_Sub2_Sub4_Sub1 local71 = Static324.aClass6_Sub49Array1[local23].aClass15_Sub2_Sub4_Sub1_2;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass88_1.lb;
				if ((local77 & 0x1) != 0) {
					@Pc(88) int local88 = local71.method7135();
					@Pc(109) int local109;
					if ((local77 & 0x2) != 0 && local71.anInt8998 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(131) int local131 = local109 + local71.anIntArray638[0];
							@Pc(138) int local138 = local117 + local71.anIntArray637[0];
							if (local131 < 0) {
								local131 = 0;
							} else if (Static18.anInt5706 - local88 - 1 < local131) {
								local131 = Static18.anInt5706 - local88 - 1;
							}
							if (local138 < 0) {
								local138 = 0;
							} else if (Static80.anInt1367 - local88 - 1 < local138) {
								local138 = Static80.anInt1367 - local88 - 1;
							}
							@Pc(213) int local213 = Static415.method5914(-1, local138, Static30.aClass138Array1[local71.aByte98], true, Static384.anIntArray497, local131, local88, local71.anIntArray637[0], local88, Static512.anIntArray627, local71.anIntArray638[0], 0, local88, 0);
							if (local213 > 0) {
								if (local213 > 9) {
									local213 = 9;
								}
								for (@Pc(225) int local225 = 0; local225 < local213; local225++) {
									local71.anIntArray638[local225] = Static512.anIntArray627[local213 - local225 - 1];
									local71.anIntArray637[local225] = Static384.anIntArray497[local213 - local225 - 1];
									local71.aByteArray106[local225] = 1;
								}
								local71.anInt8998 = local213;
							}
						}
					}
					Static487.method6845(true, local71);
					local109 = Static143.method2345(local71);
					Static100.method1446(local71, Static245.anInt4517, local109, Static582.anInt8001);
					Static243.method3795(local71);
				}
			}
		}
		if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
			if (Static60.anInt1008 == 2) {
				Static167.method2650();
			} else {
				Static213.method3439();
			}
			if (Static378.anInt6923 >> 9 < 14 || Static378.anInt6923 >> 9 >= Static18.anInt5706 - 14 || Static208.anInt3949 >> 9 < 14 || Static208.anInt3949 >> 9 >= Static80.anInt1367 - 14) {
				Static371.method6436();
			}
		}
		while (true) {
			@Pc(340) Class6_Sub1 local340;
			@Pc(345) Class97 local345;
			@Pc(356) Class97 local356;
			do {
				local340 = (Class6_Sub1) Static161.aClass298_66.method6811();
				if (local340 == null) {
					while (true) {
						do {
							local340 = (Class6_Sub1) Static346.aClass298_129.method6811();
							if (local340 == null) {
								while (true) {
									do {
										local340 = (Class6_Sub1) Static534.aClass298_190.method6811();
										if (local340 == null) {
											if (Static165.aClass97_8 != null) {
												Static337.method5189();
											}
											if (Static363.anInt6671 % 1500 == 0) {
												Static534.method7061();
											}
											if (Static375.anInt9162 == 7 && Static252.anInt4624 == 0) {
												Static577.method7886();
											}
											Static420.method6486();
											if (Static492.aBoolean562 && Static416.method5922() - 60000L > Static322.aLong150) {
												Static112.method1708();
											}
											for (@Pc(523) Class60_Sub1_Sub2 local523 = (Class60_Sub1_Sub2) Static308.aClass349_10.method7890(); local523 != null; local523 = (Class60_Sub1_Sub2) Static308.aClass349_10.method7896()) {
												if (Static416.method5922() / 1000L - 5L > (long) local523.anInt4490) {
													if (local523.aShort71 > 0) {
														Static170.method2697("", "", "", 5, local523.aString37 + Static146.aClass103_66.method2355(Static188.anInt28), 0);
													}
													if (local523.aShort71 == 0) {
														Static170.method2697("", "", "", 5, local523.aString37 + Static146.aClass103_67.method2355(Static188.anInt28), 0);
													}
													local523.method7802();
												}
											}
											if (Static375.anInt9162 == 7 && Static252.anInt4624 == 0) {
												if (Static354.aClass1_1 == null) {
													Static342.method5247(false);
													return;
												}
												Static75.anInt1265++;
												if (Static75.anInt1265 > 50) {
													Static534.method7063(Static83.aClass316_19);
												}
												try {
													if (Static354.aClass1_1 != null && Static340.aClass6_Sub12_Sub2_1.anInt7556 > 0) {
														Static438.anInt7792 += Static340.aClass6_Sub12_Sub2_1.anInt7556;
														Static354.aClass1_1.method53(Static340.aClass6_Sub12_Sub2_1.aByteArray97, Static340.aClass6_Sub12_Sub2_1.anInt7556);
														Static75.anInt1265 = 0;
														Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
														return;
													}
												} catch (@Pc(652) IOException local652) {
													Static342.method5247(false);
													return;
												}
											}
											return;
										}
										local345 = local340.aClass97_2;
										if (local345.anInt2675 < 0) {
											break;
										}
										local356 = Static495.method7281(local345.anInt2655);
									} while (local356 == null || local356.aClass97Array2 == null || local356.aClass97Array2.length <= local345.anInt2675 || local356.aClass97Array2[local345.anInt2675] != local345);
									Static199.method3316(local340);
								}
							}
							local345 = local340.aClass97_2;
							if (local345.anInt2675 < 0) {
								break;
							}
							local356 = Static495.method7281(local345.anInt2655);
						} while (local356 == null || local356.aClass97Array2 == null || local356.aClass97Array2.length <= local345.anInt2675 || local356.aClass97Array2[local345.anInt2675] != local345);
						Static199.method3316(local340);
					}
				}
				local345 = local340.aClass97_2;
				if (local345.anInt2675 < 0) {
					break;
				}
				local356 = Static495.method7281(local345.anInt2655);
			} while (local356 == null || local356.aClass97Array2 == null || local345.anInt2675 >= local356.aClass97Array2.length || local356.aClass97Array2[local345.anInt2675] != local345);
			Static199.method3316(local340);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1021() {
		if (Static492.aBoolean562) {
			Static112.method1708();
		}
		if (Static554.aClass90_12 != null) {
			Static554.aClass90_12.method7462();
		}
		if (Static85.aFrame1 != null) {
			Static219.method3486(Static85.aFrame1, Static174.aClass313_24);
			Static85.aFrame1 = null;
		}
		if (Static354.aClass1_1 != null) {
			Static354.aClass1_1.method50();
			Static354.aClass1_1 = null;
		}
		Static485.method6816();
		Static469.aClass180_3.method4355();
		Static468.aClass219_3.method5317();
		if (Static201.aClass344_1 != null) {
			Static201.aClass344_1.method7834();
			Static201.aClass344_1 = null;
		}
		try {
			Static139.aClass193_1.method4606();
			for (@Pc(55) int local55 = 0; local55 < 34; local55++) {
				Static349.aClass193Array1[local55].method4606();
			}
			Static580.aClass193_5.method4606();
			Static479.aClass193_4.method4606();
		} catch (@Pc(74) IOException local74) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1018() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static150.anInt2792 + "," + Static154.anInt2878 + "," + Static18.anInt5706 + "," + Static80.anInt1367 + "|";
			if (Static461.aClass15_Sub2_Sub4_Sub2_2 != null) {
				local7 = local7 + "2)" + Static391.anInt7128 + "," + (Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] + Static150.anInt2792) + "," + (Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] + Static154.anInt2878) + "|";
			}
			local7 = local7 + "3)" + Static79.anInt2700 + "|4)" + Static58.aClass6_Sub17_Sub1_1.anInt9282 + "|5)" + Static278.method4179() + "|6)" + Static367.anInt6719 + "," + Static154.anInt2867 + "|";
			local7 = local7 + "7)" + Static58.aClass6_Sub17_Sub1_1.method7351(Static79.anInt2700) + "|";
			local7 = local7 + "8)" + Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700) + "|";
			local7 = local7 + "9)" + Static58.aClass6_Sub17_Sub1_1.aBoolean604 + "|";
			local7 = local7 + "10)" + Static58.aClass6_Sub17_Sub1_1.aBoolean605 + "|";
			local7 = local7 + "11)" + Static58.aClass6_Sub17_Sub1_1.aBoolean603 + "|";
			local7 = local7 + "12)" + Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700) + "|";
			local7 = local7 + "13)" + Static355.anInt6598 + "|";
			local7 = local7 + "14)" + Static375.anInt9162;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(226) Throwable local226) {
			}
			try {
				if (Static79.anInt2700 == 2) {
					@Pc(232) Class local232 = Class.forName("java.lang.ClassLoader");
					@Pc(236) Field local236 = local232.getDeclaredField("nativeLibraries");
					@Pc(239) Class local239 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(249) Method local249 = local239.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local249.invoke(local236, Boolean.TRUE);
					@Pc(272) Vector local272 = (Vector) local236.get(client.class.getClassLoader());
					for (@Pc(274) int local274 = 0; local274 < local272.size(); local274++) {
						try {
							@Pc(280) Object local280 = local272.elementAt(local274);
							@Pc(285) Field local285 = local280.getClass().getDeclaredField("name");
							local249.invoke(local285, Boolean.TRUE);
							try {
								@Pc(300) String local300 = (String) local285.get(local280);
								if (local300 != null && local300.indexOf("sw3d.dll") != -1) {
									@Pc(312) Field local312 = local280.getClass().getDeclaredField("handle");
									local249.invoke(local312, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local312.getLong(local280));
									local249.invoke(local312, Boolean.FALSE);
								}
							} catch (@Pc(348) Throwable local348) {
							}
							local249.invoke(local285, Boolean.FALSE);
						} catch (@Pc(360) Throwable local360) {
						}
					}
				}
			} catch (@Pc(372) Throwable local372) {
			}
			local7 = local7 + "]";
		} catch (@Pc(383) Throwable local383) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1047() {
		if (Static409.anInt7372 < Static469.aClass180_3.anInt5272) {
			Static65.aClass297_1.method6804();
			Static39.anInt749 = (Static469.aClass180_3.anInt5272 * 50 - 50) * 5;
			if (Static39.anInt749 > 3000) {
				Static39.anInt749 = 3000;
			}
			if (Static469.aClass180_3.anInt5272 >= 2 && Static469.aClass180_3.anInt5273 == 6) {
				this.method1029("js5connect_outofdate");
				Static375.anInt9162 = 14;
				return;
			}
			if (Static469.aClass180_3.anInt5272 >= 4 && Static469.aClass180_3.anInt5273 == -1) {
				this.method1029("js5crc");
				Static375.anInt9162 = 14;
				return;
			}
			if (Static469.aClass180_3.anInt5272 >= 4 && Static111.method1702(Static375.anInt9162)) {
				if (Static469.aClass180_3.anInt5273 == 7 || Static469.aClass180_3.anInt5273 == 9) {
					this.method1029("js5connect_full");
				} else if (Static469.aClass180_3.anInt5273 <= 0) {
					this.method1029("js5io");
				} else if (Static147.aString25 == null) {
					this.method1029("js5connect");
				} else {
					this.method1029("js5proxy_" + Static147.aString25.trim());
				}
				Static375.anInt9162 = 14;
				return;
			}
		}
		Static409.anInt7372 = Static469.aClass180_3.anInt5272;
		if (Static39.anInt749 > 0) {
			Static39.anInt749--;
			return;
		}
		try {
			if (Static399.anInt7228 == 0) {
				Static467.aClass224_9 = Static65.aClass297_1.method6800(Static174.aClass313_24);
				Static399.anInt7228++;
			}
			if (Static399.anInt7228 == 1) {
				if (Static467.aClass224_9.anInt6632 == 2) {
					if (Static467.aClass224_9.anObject14 != null) {
						Static147.aString25 = (String) Static467.aClass224_9.anObject14;
					}
					this.method1040(1000);
					return;
				}
				if (Static467.aClass224_9.anInt6632 == 1) {
					Static399.anInt7228++;
				}
			}
			if (Static399.anInt7228 == 2) {
				Static167.aClass52_1 = new Class52((Socket) Static467.aClass224_9.anObject14, Static174.aClass313_24);
				@Pc(195) Class6_Sub12 local195 = new Class6_Sub12(5);
				local195.method6047(Static321.aClass252_2.anInt7316);
				local195.method6042(614);
				Static167.aClass52_1.method973(5, local195.aByteArray97);
				Static399.anInt7228++;
				Static27.aLong15 = Static416.method5922();
			}
			if (Static399.anInt7228 == 3) {
				if (Static111.method1702(Static375.anInt9162) || Static167.aClass52_1.method968() > 0) {
					@Pc(237) int local237 = Static167.aClass52_1.method976();
					if (local237 != 0) {
						this.method1040(local237);
						return;
					}
					Static399.anInt7228++;
				} else if (Static416.method5922() - Static27.aLong15 > 30000L) {
					this.method1040(1001);
					return;
				}
			}
			if (Static399.anInt7228 == 4) {
				@Pc(284) boolean local284 = Static111.method1702(Static375.anInt9162) || Static16.method202(Static375.anInt9162) || Static355.method5330(Static375.anInt9162);
				Static469.aClass180_3.method4350(Static167.aClass52_1, !local284);
				Static467.aClass224_9 = null;
				Static167.aClass52_1 = null;
				Static399.anInt7228 = 0;
			}
		} catch (@Pc(301) IOException local301) {
			this.method1040(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1026() {
		if (Static79.anInt2700 != 2) {
			this.method1037();
			return;
		}
		try {
			this.method1037();
		} catch (@Pc(15) ThreadDeath local15) {
			throw local15;
		} catch (@Pc(18) Throwable local18) {
			Static214.method5693(local18.getMessage() + " (Recovered) " + this.method1018(), local18);
			Static584.method7942(0);
		}
	}
}
