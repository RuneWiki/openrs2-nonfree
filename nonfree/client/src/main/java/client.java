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
				Static559.method7796("Argument count");
			}
			Static550.aClass176_4 = new Class176();
			Static550.aClass176_4.anInt4157 = Integer.parseInt(arg0[0]);
			Static470.aClass176_2 = new Class176();
			Static470.aClass176_2.anInt4157 = Integer.parseInt(arg0[1]);
			Static229.aClass386_6 = Static501.aClass386_8;
			if (arg0[3].equals("live")) {
				Static28.aClass179_1 = Static243.aClass179_3;
			} else if (arg0[3].equals("rc")) {
				Static28.aClass179_1 = Static476.aClass179_4;
			} else if (arg0[3].equals("wip")) {
				Static28.aClass179_1 = Static207.aClass179_2;
			} else {
				Static559.method7796("modewhat");
			}
			Static414.anInt9485 = Static706.method9438(arg0[4]);
			if (Static414.anInt9485 == -1) {
				if (arg0[4].equals("english")) {
					Static414.anInt9485 = 0;
				} else if (arg0[4].equals("german")) {
					Static414.anInt9485 = 1;
				} else {
					Static559.method7796("language");
				}
			}
			Static251.aBoolean349 = false;
			Static396.aBoolean553 = false;
			if (arg0[5].equals("game0")) {
				Static249.aClass150_6 = Static395.aClass150_8;
			} else if (arg0[5].equals("game1")) {
				Static249.aClass150_6 = Static174.aClass150_3;
			} else if (arg0[5].equals("game2")) {
				Static249.aClass150_6 = Static644.aClass150_9;
			} else if (arg0[5].equals("game3")) {
				Static249.aClass150_6 = Static314.aClass150_7;
			} else {
				Static559.method7796("game");
			}
			Static333.aBoolean434 = false;
			Static170.aLong103 = 0L;
			Static174.aBoolean296 = false;
			Static62.aBoolean126 = true;
			Static566.aBoolean755 = true;
			Static29.anInt417 = 0;
			Static425.aString72 = null;
			Static667.anInt10369 = Static249.aClass150_6.anInt3649;
			Static175.anInt10800 = 0;
			Static14.aByteArray1 = null;
			Static64.anInt1107 = 0;
			Static601.aString103 = "";
			@Pc(241) client local241 = new client();
			Static255.aClient1 = local241;
			local241.method1381(Static28.aClass179_1.method3821() + 32, Static249.aClass150_6.aString43);
			Static516.aFrame2.setLocation(40, 40);
		} catch (@Pc(265) Exception local265) {
			Static329.method4572((String) null, local265);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	protected void method1385() {
		if (Static330.aBoolean430) {
			Static404.method5979();
		}
		Static103.method9371();
		if (Static396.aClass145_6 != null) {
			Static396.aClass145_6.method9661();
		}
		if (Static249.aFrame1 != null) {
			Static94.method1458(Static249.aFrame1, Static135.aClass389_2);
			Static249.aFrame1 = null;
		}
		Static487.aClass221_2.method5170();
		Static487.aClass221_1.method5170();
		Static159.method2363();
		Static190.aClass309_1.method7266();
		Static431.aClass92_2.method1898();
		if (Static435.aClass89_1 != null) {
			Static435.aClass89_1.method1856();
			Static435.aClass89_1 = null;
		}
		try {
			Static163.aClass260_2.method6258();
			for (@Pc(67) int local67 = 0; local67 < 37; local67++) {
				Static501.aClass260Array4[local67].method6258();
			}
			Static205.aClass260_3.method6258();
			Static70.aClass260_1.method6258();
			Static24.method305();
		} catch (@Pc(96) Exception local96) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1391()) {
			return;
		}
		Static550.aClass176_4 = new Class176();
		Static550.aClass176_4.anInt4157 = Integer.parseInt(this.getParameter("worldid"));
		Static470.aClass176_2 = new Class176();
		Static470.aClass176_2.anInt4157 = Integer.parseInt(this.getParameter("lobbyid"));
		Static470.aClass176_2.aString48 = this.getParameter("lobbyaddress");
		Static229.aClass386_6 = Static605.method8292(Integer.parseInt(this.getParameter("modewhere")));
		if (Static501.aClass386_8 == Static229.aClass386_6) {
			Static229.aClass386_6 = Static469.aClass386_9;
		} else if (!Static336.method4666(Static229.aClass386_6) && Static661.aClass386_10 != Static229.aClass386_6) {
			Static229.aClass386_6 = Static661.aClass386_10;
		}
		Static28.aClass179_1 = Static88.method6542(Integer.parseInt(this.getParameter("modewhat")));
		if (Static28.aClass179_1 != Static207.aClass179_2 && Static476.aClass179_4 != Static28.aClass179_1 && Static243.aClass179_3 != Static28.aClass179_1) {
			Static28.aClass179_1 = Static243.aClass179_3;
		}
		try {
			Static414.anInt9485 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			Static414.anInt9485 = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static251.aBoolean349 = true;
		} else {
			Static251.aBoolean349 = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static396.aBoolean553 = true;
		} else {
			Static396.aBoolean553 = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static435.aBoolean600 = true;
		} else {
			Static435.aBoolean600 = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static249.aClass150_6 = Static395.aClass150_8;
			} else if (local190.equals("1")) {
				Static249.aClass150_6 = Static174.aClass150_3;
			} else if (local190.equals("2")) {
				Static249.aClass150_6 = Static644.aClass150_9;
			} else if (local190.equals("3")) {
				Static249.aClass150_6 = Static314.aClass150_7;
			}
		}
		try {
			Static175.anInt10800 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static175.anInt10800 = 0;
		}
		Static569.aString102 = this.getParameter("quiturl");
		Static601.aString103 = this.getParameter("settings");
		if (Static601.aString103 == null) {
			Static601.aString103 = "";
		}
		Static80.aBoolean149 = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static64.anInt1107 = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static64.anInt1107 = 0;
			}
		}
		Static667.anInt10369 = Integer.parseInt(this.getParameter("colourid"));
		if (Static667.anInt10369 < 0 || Static333.aColorArray2.length <= Static667.anInt10369) {
			Static667.anInt10369 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static62.aBoolean126 = true;
			Static566.aBoolean755 = true;
		}
		@Pc(336) String local336 = this.getParameter("frombilling");
		if (local336 != null && local336.equals("true")) {
			Static174.aBoolean296 = true;
		}
		@Pc(356) String local356 = this.getParameter("sskey");
		if (local356 != null) {
			Static14.aByteArray1 = Static211.method2957(Static369.method5296(local356));
			if (Static14.aByteArray1.length < 16) {
				Static14.aByteArray1 = null;
			}
		}
		@Pc(380) String local380 = this.getParameter("force64mb");
		if (local380 != null && local380.equals("true")) {
			Static333.aBoolean434 = true;
		}
		@Pc(400) String local400 = this.getParameter("worldflags");
		if (local400 != null) {
			try {
				Static29.anInt417 = Integer.parseInt(local400);
			} catch (@Pc(407) Exception local407) {
			}
		}
		@Pc(414) String local414 = this.getParameter("userFlow");
		if (local414 != null) {
			try {
				Static170.aLong103 = Long.parseLong(local414);
			} catch (@Pc(422) NumberFormatException local422) {
			}
		}
		Static425.aString72 = this.getParameter("additionalInfo");
		if (Static425.aString72 != null && Static425.aString72.length() > 50) {
			Static425.aString72 = null;
		}
		Static255.aClient1 = this;
		if (Static395.aClass150_8 == Static249.aClass150_6) {
			Static277.anInt4340 = 503;
			Static33.anInt443 = 765;
		} else if (Static174.aClass150_3 == Static249.aClass150_6) {
			Static33.anInt443 = 640;
			Static277.anInt4340 = 480;
		}
		this.method1376(Static28.aClass179_1.method3821() + 32, Static277.anInt4340, Static249.aClass150_6.aString43, Static33.anInt443);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1406(@OriginalArg(0) int arg0) {
		Static29.aClass194_1 = null;
		Static10.anInt170 = 0;
		Static190.aClass309_1.anInt8154++;
		Static78.aClass163_1 = null;
		Static190.aClass309_1.anInt8155 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1384() {
		@Pc(13) String local13 = null;
		try {
			local13 = "[1)" + Static243.anInt3820 + "," + Static224.anInt11062 + "," + Static426.anInt6942 + "," + Static280.anInt6752 + "|";
			if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 != null) {
				local13 = local13 + "2)" + Static684.anInt10516 + "," + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] + Static243.anInt3820) + "," + (Static224.anInt11062 + Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0]) + "|";
			}
			local13 = local13 + "3)" + Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() + "|4)" + Static650.aClass2_Sub30_29.aClass11_Sub18_2.method4563() + "|5)" + Static193.method2756() + "|6)" + Static151.anInt7983 + "," + Static295.anInt4558 + "|";
			local13 = local13 + "7)" + Static650.aClass2_Sub30_29.aClass11_Sub29_1.method9323() + "|";
			local13 = local13 + "8)" + Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292() + "|";
			local13 = local13 + "9)" + Static650.aClass2_Sub30_29.aClass11_Sub26_1.method8618() + "|";
			local13 = local13 + "10)" + Static650.aClass2_Sub30_29.aClass11_Sub4_1.method1189() + "|";
			local13 = local13 + "11)" + Static650.aClass2_Sub30_29.aClass11_Sub23_1.method7278() + "|";
			local13 = local13 + "12)" + Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() + "|";
			local13 = local13 + "13)" + Static510.anInt8117 + "|";
			local13 = local13 + "14)" + Static357.anInt5722;
			if (Static604.aClass2_Sub45_1 != null) {
				local13 = local13 + "|15)" + Static604.aClass2_Sub45_1.anInt7311;
			}
			try {
				if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 2) {
					@Pc(282) Class local282 = Class.forName("java.lang.ClassLoader");
					@Pc(288) Field local288 = local282.getDeclaredField("nativeLibraries");
					@Pc(293) Class local293 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(305) Method local305 = local293.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local305.invoke(local288, Boolean.TRUE);
					@Pc(331) Vector local331 = (Vector) local288.get((Static91.aClass14 == null ? (Static91.aClass14 = a("client")) : Static91.aClass14).getClassLoader());
					for (@Pc(333) int local333 = 0; local333 < local331.size(); local333++) {
						try {
							@Pc(339) Object local339 = local331.elementAt(local333);
							@Pc(346) Field local346 = local339.getClass().getDeclaredField("name");
							local305.invoke(local346, Boolean.TRUE);
							try {
								@Pc(361) String local361 = (String) local346.get(local339);
								if (local361 != null && local361.indexOf("sw3d.dll") != -1) {
									@Pc(379) Field local379 = local339.getClass().getDeclaredField("handle");
									local305.invoke(local379, Boolean.TRUE);
									local13 = local13 + "|16)" + Long.toHexString(local379.getLong(local339));
									local305.invoke(local379, Boolean.FALSE);
								}
							} catch (@Pc(417) Throwable local417) {
							}
							local305.invoke(local346, Boolean.FALSE);
						} catch (@Pc(429) Throwable local429) {
						}
					}
				}
			} catch (@Pc(439) Throwable local439) {
			}
			local13 = local13 + "]";
		} catch (@Pc(450) Throwable local450) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1386() {
		if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 2) {
			this.method1411();
			return;
		}
		try {
			this.method1411();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static329.method4572(local19.getMessage() + " (Recovered) " + this.method1384(), local19);
			Static344.aBoolean449 = true;
			Static213.method2982(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1375() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method1382() {
		if (Static214.anApplet1 != null && Static316.aCanvas1 == null && !Static135.aClass389_2.aBoolean912) {
			try {
				@Pc(17) Class local17 = Static214.anApplet1.getClass();
				@Pc(23) Field local23 = local17.getDeclaredField("canvas");
				Static316.aCanvas1 = (Canvas) local23.get(Static214.anApplet1);
				local23.set(Static214.anApplet1, (Object) null);
				if (Static316.aCanvas1 != null) {
					return;
				}
			} catch (@Pc(37) Exception local37) {
			}
		}
		super.method1382();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1387() {
		if (Static333.aBoolean434) {
			Static510.anInt8117 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static14.method216();
		Static431.aClass92_2 = new Class92(Static135.aClass389_2);
		Static190.aClass309_1 = new Class309();
		Static422.method6170(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static229.aClass386_6 != Static661.aClass386_10) {
			Static648.aByteArrayArray25 = new byte[50][];
		}
		Static650.aClass2_Sub30_29 = Static247.method3457();
		if (Static661.aClass386_10 == Static229.aClass386_6) {
			Static550.aClass176_4.aString48 = this.getCodeBase().getHost();
		} else if (Static336.method4666(Static229.aClass386_6)) {
			Static550.aClass176_4.aString48 = this.getCodeBase().getHost();
			Static550.aClass176_4.anInt4154 = Static550.aClass176_4.anInt4157 + 40000;
			Static470.aClass176_2.anInt4154 = Static470.aClass176_2.anInt4157 + 40000;
			Static550.aClass176_4.anInt4161 = Static550.aClass176_4.anInt4157 + 50000;
			Static470.aClass176_2.anInt4161 = Static470.aClass176_2.anInt4157 + 50000;
		} else if (Static229.aClass386_6 == Static501.aClass386_8) {
			Static550.aClass176_4.aString48 = "127.0.0.1";
			Static550.aClass176_4.anInt4154 = Static550.aClass176_4.anInt4157 + 40000;
			Static470.aClass176_2.aString48 = "127.0.0.1";
			Static550.aClass176_4.anInt4161 = Static550.aClass176_4.anInt4157 + 50000;
			Static470.aClass176_2.anInt4154 = Static470.aClass176_2.anInt4157 + 40000;
			Static470.aClass176_2.anInt4161 = Static470.aClass176_2.anInt4157 + 50000;
		}
		Static548.aClass176_3 = Static550.aClass176_4;
		Static718.aShortArray148 = Static270.aShortArray81 = Static192.aShortArray69 = Static580.aShortArray136 = new short[256];
		if (Static249.aClass150_6 == Static395.aClass150_8) {
			Static603.aBoolean801 = false;
		}
		try {
			Static446.aClipboard1 = Static255.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(193) Exception local193) {
		}
		Static102.aClass184_1 = Static31.method7997(Static316.aCanvas1);
		Static402.aClass138_1 = Static125.method1889(Static316.aCanvas1);
		try {
			if (Static135.aClass389_2.aClass268_3 != null) {
				Static163.aClass260_2 = new Class260(Static135.aClass389_2.aClass268_3, 5200, 0);
				for (@Pc(215) int local215 = 0; local215 < 37; local215++) {
					Static501.aClass260Array4[local215] = new Class260(Static135.aClass389_2.aClass268Array1[local215], 6000, 0);
				}
				Static205.aClass260_3 = new Class260(Static135.aClass389_2.aClass268_2, 6000, 0);
				Static633.aClass402_3 = new Class402(255, Static163.aClass260_2, Static205.aClass260_3, 500000);
				Static70.aClass260_1 = new Class260(Static135.aClass389_2.aClass268_4, 24, 0);
				Static135.aClass389_2.aClass268_3 = null;
				Static135.aClass389_2.aClass268Array1 = null;
				Static135.aClass389_2.aClass268_2 = null;
				Static135.aClass389_2.aClass268_4 = null;
			}
		} catch (@Pc(275) IOException local275) {
			Static205.aClass260_3 = null;
			Static163.aClass260_2 = null;
			Static633.aClass402_3 = null;
			Static70.aClass260_1 = null;
		}
		if (Static229.aClass386_6 != Static661.aClass386_10) {
			Static66.aBoolean131 = true;
		}
		Static270.aString49 = Static289.aClass191_12.method4067(Static414.anInt9485);
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method1411() {
		if (Static357.anInt5722 == 16) {
			return;
		}
		Static528.anInt8386++;
		if (Static528.anInt8386 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static102.anInt1785 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static388.aRandom1.setSeed((long) Static102.anInt1785);
		}
		Static487.aClass221_2.method5169();
		Static487.aClass221_1.method5169();
		this.method1413();
		if (Static402.aClass318_1 != null) {
			Static402.aClass318_1.method7561();
		}
		Static601.method8245();
		Static330.method4579();
		Static102.aClass184_1.method6054();
		Static402.aClass138_1.method4768();
		if (Static396.aClass145_6 != null) {
			Static396.aClass145_6.method9643((int) Static567.method7863());
		}
		Static53.method745();
		Static117.anInt1953 = 0;
		Static510.anInt8118 = 0;
		for (@Pc(101) Interface21 local101 = Static102.aClass184_1.method6053(); local101 != null; local101 = Static102.aClass184_1.method6053()) {
			@Pc(109) int local109 = local101.method9554();
			if (local109 == 2 || local109 == 3) {
				@Pc(144) char local144 = local101.method9558();
				if (Static345.method4787() && (local144 == '`' || local144 == '§' || local144 == '²')) {
					if (Static20.method277()) {
						Static717.method9541();
					} else {
						Static66.method993();
					}
				} else if (Static510.anInt8118 < 128) {
					Static176.anInterface21Array2[Static510.anInt8118] = local101;
					Static510.anInt8118++;
				}
			} else if (local109 == 0 && Static117.anInt1953 < 75) {
				Static103.anInterface21Array7[Static117.anInt1953] = local101;
				Static117.anInt1953++;
			}
		}
		Static204.anInt3328 = 0;
		for (@Pc(214) Class2_Sub18 local214 = Static402.aClass138_1.method4772(); local214 != null; local214 = Static402.aClass138_1.method4772()) {
			@Pc(224) int local224 = local214.method7126();
			if (local224 == -1) {
				Static344.aClass60_108.method1233(local214);
			} else if (local224 == 6) {
				Static204.anInt3328 += local214.method7123();
			} else if (Static400.method5897(local224)) {
				Static171.aClass60_55.method1233(local214);
				if (Static171.aClass60_55.method1230() > 10) {
					Static171.aClass60_55.method1225();
				}
			}
		}
		if (Static20.method277()) {
			Static429.method1392();
		}
		if (Static415.method6538(Static357.anInt5722)) {
			Static408.method6016();
			Static534.method7497();
		} else if (Static633.method8621(Static357.anInt5722)) {
			Static714.method9502();
		}
		if (Static243.method3435(Static357.anInt5722) && !Static633.method8621(Static357.anInt5722)) {
			this.method1418();
			Static423.method4551();
			Static426.method6243();
		} else if (Static459.method6651(-870, Static357.anInt5722) && !Static633.method8621(Static357.anInt5722)) {
			this.method1418();
			Static426.method6243();
		} else if (Static357.anInt5722 == 13) {
			Static426.method6243();
		} else if (Static424.method6174(Static357.anInt5722) && !Static633.method8621(Static357.anInt5722)) {
			Static621.method8395();
		} else if (Static357.anInt5722 == 14 || Static357.anInt5722 == 15) {
			Static426.method6243();
			if (Static214.anInt3419 != -3 && Static214.anInt3419 != 2 && Static214.anInt3419 != 15) {
				if (Static357.anInt5722 == 15) {
					Static100.anInt1781 = Static214.anInt3419;
					Static316.anInt4889 = Static78.anInt1361;
					Static208.anInt5310 = Static580.anInt9159;
					if (Static287.aBoolean390) {
						Static296.method4170(Static274.aClass176_1.anInt4157, Static274.aClass176_1.aString48);
						Static487.aClass221_2.aClass5_2 = null;
						Static261.method9374(-99, 14);
					} else {
						Static264.method3744(Static237.aBoolean968);
					}
				} else {
					Static264.method3744(false);
				}
			}
		}
		Static335.method4655(Static396.aClass145_6);
		Static171.aClass60_55.method1225();
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method1413() {
		@Pc(7) boolean local7 = Static190.aClass309_1.method7262();
		if (!local7) {
			this.method1416();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1415() {
		if (Static357.anInt5722 == 16) {
			return;
		}
		@Pc(18) long local18 = Static706.method9437() / 1000000L - Static473.aLong234;
		Static473.aLong234 = Static706.method9437() / 1000000L;
		@Pc(26) boolean local26 = Static20.method276();
		if (local26 && Static366.aBoolean494 && Static479.aClass70_2 != null) {
			Static479.aClass70_2.method9357();
		}
		if (Static455.method6631(Static357.anInt5722)) {
			if (Static506.aLong250 != 0L && Static506.aLong250 < Static567.method7863()) {
				Static309.method4316(false, Static457.anInt7460, Static427.anInt6944, Static193.method2756());
			} else if (!Static396.aClass145_6.method9703() && Static57.aBoolean124) {
				Static50.method740();
			}
		}
		@Pc(108) int local108;
		@Pc(112) int local112;
		if (Static249.aFrame1 == null) {
			@Pc(92) Container local92;
			if (Static516.aFrame2 != null) {
				local92 = Static516.aFrame2;
			} else if (Static214.anApplet1 == null) {
				local92 = Static273.anApplet_Sub1_1;
			} else {
				local92 = Static214.anApplet1;
			}
			local108 = local92.getSize().width;
			local112 = local92.getSize().height;
			if (local92 == Static516.aFrame2) {
				@Pc(118) Insets local118 = Static516.aFrame2.getInsets();
				local108 -= local118.right + local118.left;
				local112 -= local118.bottom + local118.top;
			}
			if (Static34.anInt8577 != local108 || Static121.anInt2049 != local112 || Static30.aBoolean64) {
				if (Static396.aClass145_6 == null || Static396.aClass145_6.method9681()) {
					Static14.method216();
				} else {
					Static34.anInt8577 = local108;
					Static121.anInt2049 = local112;
				}
				Static506.aLong250 = Static567.method7863() + 500L;
				Static30.aBoolean64 = false;
			}
		}
		if (Static249.aFrame1 != null && !Static344.aBoolean451 && Static455.method6631(Static357.anInt5722)) {
			Static309.method4316(false, -1, -1, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623());
		}
		@Pc(207) boolean local207 = false;
		if (Static616.aBoolean813) {
			local207 = true;
			Static616.aBoolean813 = false;
		}
		if (local207) {
			Static475.method6832();
		}
		if (Static396.aClass145_6 != null && Static396.aClass145_6.method9703() || Static193.method2756() != 1) {
			Static668.method9110(-103);
		}
		if (Static415.method6538(Static357.anInt5722)) {
			Static72.method1096(local207);
		} else if (Static714.method9499(Static357.anInt5722)) {
			Static174.method2604();
		} else if (Static468.method6730(Static357.anInt5722)) {
			Static174.method2604();
		} else if (Static633.method8621(Static357.anInt5722)) {
			if (Static367.anInt5880 == 1) {
				if (Static118.anInt1985 < Static458.anInt7470) {
					Static118.anInt1985 = Static458.anInt7470;
				}
				local108 = (Static118.anInt1985 - Static458.anInt7470) * 50 / Static118.anInt1985;
				Static271.method3803(Static289.aClass191_12.method4067(Static414.anInt9485) + "<br>(" + local108 + "%)", true, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
			} else if (Static367.anInt5880 == 2) {
				if (Static512.anInt8137 > Static343.anInt5305) {
					Static343.anInt5305 = Static512.anInt8137;
				}
				local108 = (Static343.anInt5305 - Static512.anInt8137) * 50 / Static343.anInt5305 + 50;
				Static271.method3803(Static289.aClass191_12.method4067(Static414.anInt9485) + "<br>(" + local108 + "%)", true, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
			} else {
				Static271.method3803(Static289.aClass191_12.method4067(Static414.anInt9485), true, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
			}
		} else if (Static357.anInt5722 == 11) {
			Static185.method2662(local18);
		} else if (Static357.anInt5722 == 14) {
			Static271.method3803(Static289.aClass191_14.method4067(Static414.anInt9485) + "<br>" + Static289.aClass191_15.method4067(Static414.anInt9485), false, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
		} else if (Static357.anInt5722 == 15) {
			Static271.method3803(Static289.aClass191_30.method4067(Static414.anInt9485), false, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
		}
		if (Static320.anInt9249 == 3) {
			for (local108 = 0; local108 < Static172.anInt2988; local108++) {
				@Pc(479) Rectangle local479 = Class11_Sub12.aRectangleArray1[local108];
				if (Static279.aBooleanArray21[local108]) {
					Static396.aClass145_6.method9635(-65281, local479.y, local479.height, local479.x, local479.width);
				} else if (Static356.aBooleanArray26[local108]) {
					Static396.aClass145_6.method9635(-65536, local479.y, local479.height, local479.x, local479.width);
				} else {
					Static396.aClass145_6.method9635(-16711936, local479.y, local479.height, local479.x, local479.width);
				}
			}
		}
		if (Static20.method277()) {
			Static206.method2903(Static396.aClass145_6);
		}
		if (Static135.aClass389_2.aBoolean912 && Static455.method6631(Static357.anInt5722) && Static320.anInt9249 == 0 && Static193.method2756() == 1 && !local207) {
			local108 = 0;
			for (local112 = 0; local112 < Static172.anInt2988; local112++) {
				if (Static356.aBooleanArray26[local112]) {
					Static356.aBooleanArray26[local112] = false;
					Static235.aRectangleArray2[local108++] = Class11_Sub12.aRectangleArray1[local112];
				}
			}
			try {
				if (Static392.aBoolean549) {
					Static151.method7127(Static235.aRectangleArray2, local108);
				} else {
					Static396.aClass145_6.method9651(Static235.aRectangleArray2, local108);
				}
			} catch (@Pc(633) Exception_Sub1 local633) {
			}
		} else if (!Static415.method6538(Static357.anInt5722)) {
			for (local108 = 0; local108 < Static172.anInt2988; local108++) {
				Static356.aBooleanArray26[local108] = false;
			}
			try {
				if (Static392.aBoolean549) {
					Static31.method8010();
				} else {
					Static396.aClass145_6.method9647();
				}
			} catch (@Pc(676) Exception_Sub1 local676) {
				Static329.method4572(local676.getMessage() + " (Recovered) " + this.method1384(), local676);
				Static213.method2982(false, 0);
			}
		}
		Static716.method9520();
		local108 = Static650.aClass2_Sub30_29.aClass11_Sub8_1.method2130();
		if (local108 == 0) {
			Static570.method7907(15L);
		} else if (local108 == 1) {
			Static570.method7907(10L);
		} else if (local108 == 2) {
			Static570.method7907(5L);
		} else if (local108 == 3) {
			Static570.method7907(2L);
		}
		if (Static644.aBoolean845) {
			Static416.method6093();
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub28_1.method9314() == 1 && Static357.anInt5722 == 3 && Static542.anInt8552 != -1) {
			Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub28_1);
			Static610.method9380();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1377() {
		if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 2) {
			this.method1415();
			return;
		}
		try {
			this.method1415();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static329.method4572(local19.getMessage() + " (Recovered) " + this.method1384(), local19);
			Static344.aBoolean449 = true;
			Static213.method2982(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method1416() {
		if (Static190.aClass309_1.anInt8154 > Static274.anInt4230) {
			Static548.aClass176_3.method3776();
			Static369.anInt5918 = (Static190.aClass309_1.anInt8154 - 1) * 50 * 5;
			if (Static369.anInt5918 > 3000) {
				Static369.anInt5918 = 3000;
			}
			if (Static190.aClass309_1.anInt8154 >= 2 && Static190.aClass309_1.anInt8155 == 6) {
				this.method1379("js5connect_outofdate");
				Static357.anInt5722 = 16;
				return;
			}
			if (Static190.aClass309_1.anInt8154 >= 4 && Static190.aClass309_1.anInt8155 == -1) {
				this.method1379("js5crc");
				Static357.anInt5722 = 16;
				return;
			}
			if (Static190.aClass309_1.anInt8154 >= 4 && Static415.method6538(Static357.anInt5722)) {
				if (Static190.aClass309_1.anInt8155 == 7 || Static190.aClass309_1.anInt8155 == 9) {
					this.method1379("js5connect_full");
				} else if (Static190.aClass309_1.anInt8155 <= 0) {
					this.method1379("js5io");
				} else if (Static113.aString17 == null) {
					this.method1379("js5connect");
				} else {
					this.method1379("js5proxy_" + Static113.aString17.trim());
				}
				Static357.anInt5722 = 16;
				return;
			}
		}
		Static274.anInt4230 = Static190.aClass309_1.anInt8154;
		if (Static369.anInt5918 > 0) {
			Static369.anInt5918--;
			return;
		}
		try {
			if (Static10.anInt170 == 0) {
				Static78.aClass163_1 = Static548.aClass176_3.method3777(Static135.aClass389_2);
				Static10.anInt170++;
			}
			if (Static10.anInt170 == 1) {
				if (Static78.aClass163_1.anInt3843 == 2) {
					if (Static78.aClass163_1.anObject5 != null) {
						Static113.aString17 = (String) Static78.aClass163_1.anObject5;
					}
					this.method1406(1000);
					return;
				}
				if (Static78.aClass163_1.anInt3843 == 1) {
					Static10.anInt170++;
				}
			}
			if (Static10.anInt170 == 2) {
				Static29.aClass194_1 = new Class194((Socket) Static78.aClass163_1.anObject5, Static135.aClass389_2, 25000);
				@Pc(244) Class2_Sub20 local244 = new Class2_Sub20(5);
				local244.method8584(Static630.aClass396_2.anInt10768);
				local244.method8577(664);
				Static29.aClass194_1.method4173(5, local244.aByteArray111);
				Static10.anInt170++;
				Static152.aLong85 = Static567.method7863();
			}
			if (Static10.anInt170 == 3) {
				if (Static415.method6538(Static357.anInt5722) || Static29.aClass194_1.method4168() > 0) {
					@Pc(313) int local313 = Static29.aClass194_1.method4167();
					if (local313 != 0) {
						this.method1406(local313);
						return;
					}
					Static10.anInt170++;
				} else if (Static567.method7863() - Static152.aLong85 > 30000L) {
					this.method1406(1001);
					return;
				}
			}
			if (Static10.anInt170 == 4) {
				@Pc(353) boolean local353 = Static415.method6538(Static357.anInt5722) || Static243.method3435(Static357.anInt5722) || Static459.method6651(-858 - 12, Static357.anInt5722);
				@Pc(356) Class10[] local356 = Static14.method220();
				@Pc(364) Class2_Sub20 local364 = new Class2_Sub20(local356.length * 4);
				Static29.aClass194_1.method4174(0, local364.aByteArray111, local364.aByteArray111.length);
				for (@Pc(375) int local375 = 0; local375 < local356.length; local375++) {
					local356[local375].method223(local364.method8555(-9372));
				}
				Static190.aClass309_1.method7254(Static29.aClass194_1, !local353);
				Static78.aClass163_1 = null;
				Static10.anInt170 = 0;
				Static29.aClass194_1 = null;
			}
		} catch (@Pc(416) IOException local416) {
			this.method1406(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1418() {
		@Pc(44) int local44;
		if (Static357.anInt5722 == 7 && !Static353.method9774() || Static357.anInt5722 == 9 && Static214.anInt3419 == 42) {
			if (Static283.anInt8842 > 1) {
				Static539.anInt8520 = Static602.anInt10526;
				Static283.anInt8842--;
			}
			if (!Static189.aBoolean301) {
				Static8.method114();
			}
			for (local44 = 0; local44 < 100 && Static575.method7995(Static487.aClass221_1); local44++) {
			}
		}
		Static371.anInt5922++;
		Static633.method8623((Class273) null, -1, -1);
		Static366.method5264((Class273) null, -1, -1);
		Static515.method7307();
		Static602.anInt10526++;
		for (local44 = 0; local44 < Static676.anInt10488; local44++) {
			@Pc(95) Class4_Sub2_Sub1_Sub2_Sub2 local95 = Static459.aClass2_Sub49Array1[local44].aClass4_Sub2_Sub1_Sub2_Sub2_3;
			if (local95 != null) {
				@Pc(101) byte local101 = local95.aClass261_1.aByte87;
				if ((local101 & 0x1) != 0) {
					@Pc(109) int local109 = local95.method2046();
					@Pc(140) int local140;
					if ((local101 & 0x2) != 0 && local95.anInt2371 == 0 && Math.random() * 1000.0D < 10.0D) {
						local140 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(148) int local148 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local140 != 0 || local148 != 0) {
							@Pc(167) int local167 = local95.anIntArray183[0] + local140;
							@Pc(174) int local174 = local95.anIntArray182[0] + local148;
							if (local167 < 0) {
								local167 = 0;
							} else if (Static426.anInt6942 - local109 - 1 < local167) {
								local167 = Static426.anInt6942 - local109 - 1;
							}
							if (local174 < 0) {
								local174 = 0;
							} else if (local174 > Static280.anInt6752 - local109 - 1) {
								local174 = Static280.anInt6752 - local109 - 1;
							}
							@Pc(253) int local253 = Static322.method4462(0, local167, true, local95.anIntArray182[0], local109, Static626.aClass226Array1[local95.aByte133], local174, Static127.anIntArray158, -1, Static405.anIntArray468, local95.anIntArray183[0], local109, local109, 0);
							if (local253 > 0) {
								if (local253 > 9) {
									local253 = 9;
								}
								for (@Pc(267) int local267 = 0; local267 < local253; local267++) {
									local95.anIntArray183[local267] = Static127.anIntArray158[local253 - local267 - 1];
									local95.anIntArray182[local267] = Static405.anIntArray468[local253 - local267 - 1];
									local95.aByteArray27[local267] = 1;
								}
								local95.anInt2371 = local253;
							}
						}
					}
					Static297.method4183(true, local95);
					local140 = Static677.method9183(local95);
					Static344.method4782((byte) 41, local95);
					Static447.method6533(local140, local95, Static668.anInt10394, Static4.anInt42);
					Static296.method4165(Static4.anInt42, local95);
					Static511.method7251(local95);
				}
			}
		}
		if ((Static357.anInt5722 == 3 || Static357.anInt5722 == 9 || Static357.anInt5722 == 7) && (!Static353.method9774() || Static357.anInt5722 == 9 && Static214.anInt3419 == 42) && Static306.anInt4661 == 0) {
			if (Static60.anInt1040 == 2) {
				Static39.method552();
			} else {
				Static578.method8065();
			}
			if (Static430.anInt7002 >> 9 < 14 || Static430.anInt7002 >> 9 >= Static426.anInt6942 - 14 || Static218.anInt3475 >> 9 < 14 || Static218.anInt3475 >> 9 >= Static280.anInt6752 - 14) {
				Static669.method9113();
			}
		}
		while (true) {
			@Pc(444) Class2_Sub36 local444;
			@Pc(449) Class273 local449;
			@Pc(461) Class273 local461;
			do {
				local444 = (Class2_Sub36) Static574.aClass60_184.method1225();
				if (local444 == null) {
					while (true) {
						do {
							local444 = (Class2_Sub36) Static238.aClass60_79.method1225();
							if (local444 == null) {
								while (true) {
									do {
										local444 = (Class2_Sub36) Static592.aClass60_189.method1225();
										if (local444 == null) {
											if (Static650.aClass273_17 != null) {
												Static436.method6341(-95);
											}
											if (Static528.anInt8386 % 1500 == 0) {
												Static64.method959();
											}
											if (Static357.anInt5722 == 7 && !Static353.method9774() || Static357.anInt5722 == 9 && Static214.anInt3419 == 42) {
												Static314.method4376();
											}
											Static55.method810();
											if (Static330.aBoolean430 && Static162.aLong97 < Static567.method7863() - 60000L) {
												Static404.method5979();
											}
											for (@Pc(654) Class4_Sub1_Sub2 local654 = (Class4_Sub1_Sub2) Static434.aClass320_5.method7605(); local654 != null; local654 = (Class4_Sub1_Sub2) Static434.aClass320_5.method7608()) {
												if ((long) local654.anInt5844 < Static567.method7863() / 1000L - 5L) {
													if (local654.aShort69 > 0) {
														Static296.method4163(0, "", local654.aString63 + Static289.aClass191_19.method4067(Static414.anInt9485), 5, "", "");
													}
													if (local654.aShort69 == 0) {
														Static296.method4163(0, "", local654.aString63 + Static289.aClass191_20.method4067(Static414.anInt9485), 5, "", "");
													}
													local654.method9416();
												}
											}
											if (false) {
												Static91.aClass2_Sub6_Sub20_2 = null;
											}
											if (Static357.anInt5722 == 7 && !Static353.method9774() || Static357.anInt5722 == 9 && Static214.anInt3419 == 42) {
												if (Static357.anInt5722 != 9 && Static487.aClass221_1.aClass5_2 == null) {
													Static264.method3744(false);
													return;
												}
												if (Static487.aClass221_1 != null) {
													Static487.aClass221_1.anInt5769++;
													if (Static487.aClass221_1.anInt5769 > 50) {
														@Pc(814) Class2_Sub33 local814 = Static592.method8154(Static402.aClass349_93, Static487.aClass221_1.aClass48_1);
														Static487.aClass221_1.method5173(local814);
													}
													try {
														Static487.aClass221_1.method5171((byte) 115);
														return;
													} catch (@Pc(823) IOException local823) {
														if (Static357.anInt5722 == 9) {
															Static487.aClass221_1.method5170();
															return;
														}
														Static264.method3744(false);
														return;
													}
												}
											}
											return;
										}
										local449 = local444.aClass273_6;
										if (local449.anInt7410 < 0) {
											break;
										}
										local461 = Static417.method6111(local449.anInt7392);
									} while (local461 == null || local461.aClass273Array4 == null || local461.aClass273Array4.length <= local449.anInt7410 || local449 != local461.aClass273Array4[local449.anInt7410]);
									Static484.method6919(local444);
								}
							}
							local449 = local444.aClass273_6;
							if (local449.anInt7410 < 0) {
								break;
							}
							local461 = Static417.method6111(local449.anInt7392);
						} while (local461 == null || local461.aClass273Array4 == null || local449.anInt7410 >= local461.aClass273Array4.length || local449 != local461.aClass273Array4[local449.anInt7410]);
						Static484.method6919(local444);
					}
				}
				local449 = local444.aClass273_6;
				if (local449.anInt7410 < 0) {
					break;
				}
				local461 = Static417.method6111(local449.anInt7392);
			} while (local461 == null || local461.aClass273Array4 == null || local461.aClass273Array4.length <= local449.anInt7410 || local449 != local461.aClass273Array4[local449.anInt7410]);
			Static484.method6919(local444);
		}
	}
}
