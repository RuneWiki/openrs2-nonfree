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
				Static1.method27("Argument count");
			}
			Static457.aClass263_5 = new Class263();
			Static457.aClass263_5.anInt7387 = Integer.parseInt(arg0[0]);
			Static15.aClass263_1 = new Class263();
			Static15.aClass263_1.anInt7387 = Integer.parseInt(arg0[1]);
			Static287.aClass263_4 = new Class263();
			Static287.aClass263_4.anInt7387 = Integer.parseInt(arg0[2]);
			Static429.aClass129_8 = Static222.aClass129_6;
			if (arg0[3].equals("live")) {
				Static141.aClass127_7 = Static227.aClass127_3;
			} else if (arg0[3].equals("rc")) {
				Static141.aClass127_7 = Static70.aClass127_1;
			} else if (arg0[3].equals("wip")) {
				Static141.aClass127_7 = Static369.aClass127_5;
			} else {
				Static1.method27("modewhat");
			}
			Static80.anInt6195 = Static113.method1870(arg0[4]);
			if (Static80.anInt6195 == -1) {
				if (arg0[4].equals("english")) {
					Static80.anInt6195 = 0;
				} else if (arg0[4].equals("german")) {
					Static80.anInt6195 = 1;
				} else {
					Static1.method27("language");
				}
			}
			Static326.aBoolean409 = false;
			Static303.aBoolean325 = false;
			if (arg0[5].equals("game0")) {
				Static10.aClass200_1 = Static183.aClass200_3;
			} else if (arg0[5].equals("game1")) {
				Static10.aClass200_1 = Static201.aClass200_4;
			} else {
				Static1.method27("game");
			}
			Static297.aBoolean371 = true;
			Static354.aBoolean431 = true;
			Static179.aBoolean201 = false;
			Static293.anInt5251 = 0;
			Static451.anInt7181 = 0;
			Static222.aString34 = "";
			Static297.anInt5330 = Static10.aClass200_1.anInt5771;
			@Pc(156) client local156 = new client();
			Static94.aClient2 = local156;
			local156.method855(Static141.aClass127_7.method2745() + 32, Static10.aClass200_1.aString59);
			Static393.aFrame2.setLocation(40, 40);
		} catch (@Pc(179) Exception local179) {
			Static22.method402(local179, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method858() {
		if (Static404.anInt2752 != 2) {
			this.method872();
			return;
		}
		try {
			this.method872();
		} catch (@Pc(11) Throwable local11) {
			Static357.method5001(0);
			Static22.method402(local11, local11.getMessage() + " (Recovered) " + this.method840());
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method859() {
		if (Static141.anInt7048 < Static29.aClass249_1.anInt7128) {
			Static229.anInt3814 = (Static29.aClass249_1.anInt7128 - 1) * 5 * 50;
			Static163.aClass263_3.aBoolean500 = !Static163.aClass263_3.aBoolean500;
			if (Static229.anInt3814 > 3000) {
				Static229.anInt3814 = 3000;
			}
			if (Static29.aClass249_1.anInt7128 >= 2 && Static29.aClass249_1.anInt7127 == 6) {
				this.method842("js5connect_outofdate");
				Static433.anInt7309 = 13;
				return;
			}
			if (Static29.aClass249_1.anInt7128 >= 4 && Static29.aClass249_1.anInt7127 == -1) {
				this.method842("js5crc");
				Static433.anInt7309 = 13;
				return;
			}
			if (Static29.aClass249_1.anInt7128 >= 4 && Static45.method703(Static433.anInt7309)) {
				if (Static29.aClass249_1.anInt7127 == 7 || Static29.aClass249_1.anInt7127 == 9) {
					this.method842("js5connect_full");
				} else if (Static29.aClass249_1.anInt7127 <= 0) {
					this.method842("js5io");
				} else {
					this.method842("js5connect");
				}
				Static433.anInt7309 = 13;
				return;
			}
		}
		Static141.anInt7048 = Static29.aClass249_1.anInt7128;
		if (Static229.anInt3814 > 0) {
			Static229.anInt3814--;
			return;
		}
		try {
			if (Static284.anInt5121 == 0) {
				Static142.aClass136_2 = Static138.aClass194_2.method4418(Static163.aClass263_3.aString71, Static163.aClass263_3.method5935());
				Static284.anInt5121++;
			}
			if (Static284.anInt5121 == 1) {
				if (Static142.aClass136_2.anInt3418 == 2) {
					this.method874(1000);
					return;
				}
				if (Static142.aClass136_2.anInt3418 == 1) {
					Static284.anInt5121++;
				}
			}
			if (Static284.anInt5121 == 2) {
				Static88.aClass113_6 = new Class113((Socket) Static142.aClass136_2.anObject10, Static138.aClass194_2);
				@Pc(184) Class2_Sub17 local184 = new Class2_Sub17(5);
				local184.method6172(Static173.aClass78_2.anInt1850);
				local184.method6170(600);
				Static88.aClass113_6.method2333(local184.aByteArray94, 5);
				Static284.anInt5121++;
				Static286.aLong243 = Static432.method5870();
			}
			if (Static284.anInt5121 == 3) {
				if (Static45.method703(Static433.anInt7309) || Static88.aClass113_6.method2338() > 0) {
					@Pc(222) int local222 = Static88.aClass113_6.method2340();
					if (local222 != 0) {
						this.method874(local222);
						return;
					}
					Static284.anInt5121++;
				} else if (Static432.method5870() - Static286.aLong243 > 30000L) {
					this.method874(1001);
					return;
				}
			}
			if (Static284.anInt5121 == 4) {
				@Pc(268) boolean local268 = Static433.anInt7309 == 1 || Static126.method1972(Static433.anInt7309) || Static203.method2864(Static433.anInt7309);
				Static29.aClass249_1.method5703(!local268, Static88.aClass113_6);
				Static142.aClass136_2 = null;
				Static284.anInt5121 = 0;
				Static88.aClass113_6 = null;
			}
		} catch (@Pc(285) IOException local285) {
			this.method874(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method861() {
		if (Static433.anInt7309 == 13) {
			return;
		}
		@Pc(16) long local16 = Static98.method4122() / 1000000L - Static444.aLong388;
		Static444.aLong388 = Static98.method4122() / 1000000L;
		@Pc(24) boolean local24 = Static218.method3053();
		if (local24 && Static235.aBoolean262 && Static350.aClass62_2 != null) {
			Static350.aClass62_2.method2407();
		}
		if (Static257.method3599(Static433.anInt7309)) {
			if (Static332.aLong306 != 0L && Static432.method5870() > Static332.aLong306) {
				Static291.method4115(false, Static434.aClass165_Sub1_1.anInt4211, Static434.aClass165_Sub1_1.anInt4212, Static235.method3217());
			} else if (!Static257.aClass75_8.method6015() && Static400.aBoolean463) {
				Static277.method3961();
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		if (Static50.aFrame1 == null) {
			@Pc(73) Container local73;
			if (Static393.aFrame2 == null) {
				local73 = Static138.aClass194_2.anApplet1;
			} else {
				local73 = Static393.aFrame2;
			}
			local81 = local73.getSize().width;
			local85 = local73.getSize().height;
			if (local73 == Static393.aFrame2) {
				@Pc(91) Insets local91 = Static393.aFrame2.getInsets();
				local81 -= local91.right + local91.left;
				local85 -= local91.bottom + local91.top;
			}
			if (local81 != Static119.anInt2042 || local85 != Static268.anInt4657) {
				if (Static257.aClass75_8 == null || Static257.aClass75_8.method6017()) {
					Static372.method5183();
				} else {
					Static119.anInt2042 = local81;
					Static268.anInt4657 = local85;
				}
				Static332.aLong306 = Static432.method5870() + 500L;
			}
		}
		if (Static50.aFrame1 != null && !Static159.aBoolean182 && Static257.method3599(Static433.anInt7309)) {
			Static291.method4115(false, -1, -1, Static434.aClass165_Sub1_1.anInt4206);
		}
		@Pc(148) boolean local148 = false;
		if (Static448.aBoolean509) {
			local148 = true;
			Static448.aBoolean509 = false;
		}
		if (local148) {
			Static298.method4275();
		}
		if (Static257.aClass75_8 != null && Static257.aClass75_8.method6015() || Static235.method3217() != 1) {
			Static323.method4576();
		}
		if (Static433.anInt7309 == 0) {
			Static206.method2910(Static55.aColorArray1[Static297.anInt5330], Static243.aColorArray3[Static297.anInt5330], Static144.aColorArray2[Static297.anInt5330], local148, Static215.anInt3675, Static400.aString68);
		} else if (Static433.anInt7309 == 1) {
			Static235.method3218(Static243.aColorArray3[Static297.anInt5330].getRGB(), Static257.aClass75_8, Static144.aColorArray2[Static297.anInt5330].getRGB(), Static55.aColorArray1[Static297.anInt5330].getRGB(), Static143.aClass14_2, local148 | Static257.aClass75_8.method6015());
		} else if (Static426.method5823(Static433.anInt7309)) {
			Static144.method2217();
		} else if (Static215.method3037(Static433.anInt7309)) {
			Static144.method2217();
		} else if (Static200.method2819(Static433.anInt7309)) {
			if (Static211.anInt3607 == 1) {
				if (Static257.anInt4492 < Static407.anInt7041) {
					Static257.anInt4492 = Static407.anInt7041;
				}
				local81 = (Static257.anInt4492 - Static407.anInt7041) * 50 / Static257.anInt4492;
				Static1.method26(true, Static420.aClass231_118.method5261(Static80.anInt6195) + "<br>(" + local81 + "%)", Static11.aClass14_1);
			} else if (Static211.anInt3607 == 2) {
				if (Static294.anInt5266 < Static191.anInt3353) {
					Static294.anInt5266 = Static191.anInt3353;
				}
				local81 = (Static294.anInt5266 - Static191.anInt3353) * 50 / Static294.anInt5266 + 50;
				Static1.method26(true, Static420.aClass231_118.method5261(Static80.anInt6195) + "<br>(" + local81 + "%)", Static11.aClass14_1);
			} else {
				Static1.method26(true, Static420.aClass231_118.method5261(Static80.anInt6195), Static11.aClass14_1);
			}
		} else if (Static433.anInt7309 == 9) {
			Static377.method5241(local16);
		} else if (Static433.anInt7309 == 12) {
			Static1.method26(true, Static253.aClass231_77.method5261(Static80.anInt6195) + "<br>" + Static87.aClass231_27.method5261(Static80.anInt6195), Static11.aClass14_1);
		}
		if (Static407.anInt7039 == 3) {
			for (local81 = 0; local81 < Static153.anInt2793; local81++) {
				@Pc(381) Rectangle local381 = Class2_Sub2_Sub9.aRectangleArray1[local81];
				if (Static316.aBooleanArray20[local81]) {
					Static257.aClass75_8.method5996(local381.height, local381.y, -1996553985, local381.x, local381.width);
				} else if (Static120.aBooleanArray3[local81]) {
					Static257.aClass75_8.method5996(local381.height, local381.y, -1996554240, local381.x, local381.width);
				}
			}
		}
		if (Static448.method6076()) {
			Static242.method3350(Static257.aClass75_8);
		}
		if (Static257.method3599(Static433.anInt7309) && Static407.anInt7039 == 0 && Static235.method3217() == 1 && !local148 && Static307.aString46.equals("1.1")) {
			local81 = 0;
			for (local85 = 0; local85 < Static153.anInt2793; local85++) {
				if (Static120.aBooleanArray3[local85]) {
					Static120.aBooleanArray3[local85] = false;
					Static96.aRectangleArray2[local81++] = Class2_Sub2_Sub9.aRectangleArray1[local85];
				}
			}
			Static257.aClass75_8.method5956(Static96.aRectangleArray2, local81);
		} else if (Static433.anInt7309 != 0) {
			Static257.aClass75_8.method5983();
			for (local81 = 0; local81 < Static153.anInt2793; local81++) {
				Static120.aBooleanArray3[local81] = false;
			}
		}
		if (Static434.aClass165_Sub1_1.anInt4214 == 0) {
			Static167.method6157(15L);
		} else if (Static434.aClass165_Sub1_1.anInt4214 == 1) {
			Static167.method6157(10L);
		} else if (Static434.aClass165_Sub1_1.anInt4214 == 2) {
			Static167.method6157(5L);
		} else if (Static434.aClass165_Sub1_1.anInt4214 == 3) {
			Static167.method6157(2L);
		}
		if (Static215.aBoolean245) {
			Static9.method5078();
		}
		if (Static434.aClass165_Sub1_1.aBoolean302 && Static433.anInt7309 == 2 && Static103.anInt5365 != -1) {
			Static434.aClass165_Sub1_1.aBoolean302 = false;
			Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method846()) {
			return;
		}
		Static457.aClass263_5 = new Class263();
		Static457.aClass263_5.anInt7387 = Integer.parseInt(this.getParameter("worldid"));
		Static15.aClass263_1 = new Class263();
		Static15.aClass263_1.anInt7387 = Integer.parseInt(this.getParameter("lobbyid"));
		Static15.aClass263_1.aString71 = this.getParameter("lobbyaddress");
		Static287.aClass263_4 = new Class263();
		Static287.aClass263_4.anInt7387 = Integer.parseInt(this.getParameter("demoid"));
		Static287.aClass263_4.aString71 = this.getParameter("demoaddress");
		Static429.aClass129_8 = Static117.method1914(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static18.method360(Static429.aClass129_8) && Static112.aClass129_4 != Static429.aClass129_8) {
			Static429.aClass129_8 = Static112.aClass129_4;
		}
		Static141.aClass127_7 = Static227.method3104(Integer.parseInt(this.getParameter("modewhat")));
		if (Static141.aClass127_7 != Static369.aClass127_5 && Static70.aClass127_1 != Static141.aClass127_7 && Static227.aClass127_3 != Static141.aClass127_7) {
			Static141.aClass127_7 = Static227.aClass127_3;
		}
		try {
			Static80.anInt6195 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static80.anInt6195 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static326.aBoolean409 = true;
		} else {
			Static326.aBoolean409 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static303.aBoolean325 = true;
		} else {
			Static303.aBoolean325 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static388.aBoolean455 = true;
		} else {
			Static388.aBoolean455 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static10.aClass200_1 = Static183.aClass200_3;
			} else if (local145.equals("1")) {
				Static10.aClass200_1 = Static201.aClass200_4;
			}
		}
		try {
			Static451.anInt7181 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static451.anInt7181 = 0;
		}
		Static147.aString26 = this.getParameter("quiturl");
		Static222.aString34 = this.getParameter("settings");
		if (Static222.aString34 == null) {
			Static222.aString34 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static293.anInt5251 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static293.anInt5251 = 0;
			}
		}
		Static297.anInt5330 = Integer.parseInt(this.getParameter("colourid"));
		if (Static297.anInt5330 < 0 || Static297.anInt5330 >= Static243.aColorArray3.length) {
			Static297.anInt5330 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static297.aBoolean371 = true;
			Static354.aBoolean431 = true;
		}
		@Pc(226) String local226 = this.getParameter("frombilling");
		if (local226 != null && local226.equals("true")) {
			Static179.aBoolean201 = true;
		}
		if (Static10.aClass200_1 == Static183.aClass200_3) {
			Static132.anInt2509 = 765;
			Static163.anInt2922 = 503;
		} else if (Static201.aClass200_4 == Static10.aClass200_1) {
			Static163.anInt2922 = 480;
			Static132.anInt2509 = 640;
		}
		Static94.aClient2 = this;
		this.method849(Static132.anInt2509, Static141.aClass127_7.method2745() + 32, Static163.anInt2922);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method840() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static386.anInt7205 + "," + Static153.anInt2798 + "," + Static234.anInt3949 + "," + Static371.anInt6492 + "|";
			if (Static127.aClass11_Sub5_Sub2_Sub1_2 != null) {
				local7 = local7 + "2)" + Static204.anInt3498 + "," + (Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0] + Static386.anInt7205) + "," + (Static153.anInt2798 + Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0]) + "|";
			}
			local7 = local7 + "3)" + Static404.anInt2752 + "|4)" + Static434.aClass165_Sub1_1.anInt4201 + "|5)" + Static235.method3217() + "|6)" + Static49.anInt789 + "," + Static344.anInt6105 + "|";
			local7 = local7 + "7)" + Static434.aClass165_Sub1_1.method3390(Static404.anInt2752) + "|";
			local7 = local7 + "8)" + Static434.aClass165_Sub1_1.method3392(Static404.anInt2752) + "|";
			local7 = local7 + "9)" + Static434.aClass165_Sub1_1.aBoolean307 + "|";
			local7 = local7 + "10)" + Static434.aClass165_Sub1_1.aBoolean297 + "|";
			local7 = local7 + "11)" + Static434.aClass165_Sub1_1.aBoolean296 + "|";
			local7 = local7 + "12)" + Static434.aClass165_Sub1_1.method3397(Static404.anInt2752) + "|";
			local7 = local7 + "13)" + Static170.anInt3068 + "|";
			local7 = local7 + "14)" + Static433.anInt7309;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(226) Throwable local226) {
			}
			try {
				if (Static404.anInt2752 == 2) {
					@Pc(232) Class local232 = Class.forName("java.lang.ClassLoader");
					@Pc(236) Field local236 = local232.getDeclaredField("nativeLibraries");
					@Pc(239) Class local239 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(249) Method local249 = local239.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local249.invoke(local236, Boolean.TRUE);
					@Pc(272) Vector local272 = (Vector) local236.get(client.class.getClassLoader());
					for (@Pc(274) int local274 = 0; local272.size() > local274; local274++) {
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

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method853() {
		if (Static410.aBoolean468) {
			Static331.method4731();
		}
		if (Static257.aClass75_8 != null) {
			Static257.aClass75_8.method5989();
		}
		if (Static50.aFrame1 != null) {
			Static95.method1419(Static138.aClass194_2, Static50.aFrame1);
			Static50.aFrame1 = null;
		}
		if (Static339.aClass66_2 != null) {
			Static339.aClass66_2.method1388();
			Static339.aClass66_2 = null;
		}
		Static354.method4964();
		Static29.aClass249_1.method5695();
		Static463.aClass58_3.method1160();
		if (Static11.aClass233_1 != null) {
			Static11.aClass233_1.method5272();
			Static11.aClass233_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method864() {
		@Pc(11) boolean local11 = Static29.aClass249_1.method5693();
		if (!local11) {
			this.method859();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method865() {
		@Pc(30) int local30;
		if (Static433.anInt7309 == 6 && Static129.anInt2192 == 0) {
			if (Static292.anInt5209 > 1) {
				Static292.anInt5209--;
				Static29.anInt504 = Static144.anInt2663;
			}
			if (!Static45.aBoolean34) {
				Static461.method6252();
			}
			for (local30 = 0; local30 < 100 && Static246.method3417(); local30++) {
			}
		}
		Static417.anInt7158++;
		Static74.method1136(null, -1, -1);
		Static437.method5904(-1, null, -1);
		Static262.method3687();
		Static144.anInt2663++;
		for (local30 = 0; local30 < Static30.anInt548; local30++) {
			@Pc(77) Class11_Sub5_Sub2_Sub2 local77 = Static226.aClass2_Sub34Array1[local30].aClass11_Sub5_Sub2_Sub2_2;
			if (local77 != null) {
				@Pc(83) byte local83 = local77.aClass82_1.aByte14;
				if ((local83 & 0x1) != 0) {
					@Pc(94) int local94 = local77.method6215();
					@Pc(118) int local118;
					if ((local83 & 0x2) != 0 && local77.anInt7707 == 0 && Math.random() * 1000.0D < 10.0D) {
						local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(126) int local126 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local118 != 0 || local126 != 0) {
							@Pc(144) int local144 = local77.anIntArray632[0] + local118;
							if (local144 < 0) {
								local144 = 0;
							} else if (local144 > Static234.anInt3949 - local94 - 1) {
								local144 = Static234.anInt3949 - local94 - 1;
							}
							@Pc(175) int local175 = local126 + local77.anIntArray633[0];
							if (local175 < 0) {
								local175 = 0;
							} else if (Static371.anInt6492 - local94 - 1 < local175) {
								local175 = Static371.anInt6492 - local94 - 1;
							}
							@Pc(226) int local226 = Static396.method5468(-1, Static235.anIntArray356, local144, local94, 0, local77.anIntArray633[0], Static430.anIntArray596, local94, true, local77.anIntArray632[0], local94, Static89.aClass225Array2[local77.aByte101], local175, 0);
							if (local226 > 0) {
								if (local226 > 9) {
									local226 = 9;
								}
								for (@Pc(237) int local237 = 0; local237 < local226; local237++) {
									local77.anIntArray632[local237] = Static430.anIntArray596[local226 - local237 - 1];
									local77.anIntArray633[local237] = Static235.anIntArray356[local226 - local237 - 1];
									local77.aByteArray96[local237] = 1;
								}
								local77.anInt7707 = local226;
							}
						}
					}
					Static425.method5817(local77, true);
					local118 = Static462.method3621(local77);
					Static352.method4956(Static107.anInt1820, Static287.anInt5147, local77, local118);
					Static293.method4161(local77);
				}
			}
		}
		if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
			if (Static25.anInt7273 == 2) {
				Static89.method963();
			} else {
				Static13.method315();
			}
			if (Static263.anInt4619 >> 7 < 14 || Static234.anInt3949 - 14 <= Static263.anInt4619 >> 7 || Static120.anInt2052 >> 7 < 14 || Static120.anInt2052 >> 7 >= Static371.anInt6492 - 14) {
				Static427.method5825();
			}
		}
		while (true) {
			@Pc(352) Class2_Sub18 local352;
			@Pc(357) Class93 local357;
			@Pc(365) Class93 local365;
			do {
				local352 = (Class2_Sub18) Static300.aClass181_29.method3976();
				if (local352 == null) {
					while (true) {
						do {
							local352 = (Class2_Sub18) Static426.aClass181_48.method3976();
							if (local352 == null) {
								while (true) {
									do {
										local352 = (Class2_Sub18) Static406.aClass181_46.method3976();
										if (local352 == null) {
											if (Static125.aClass93_11 != null) {
												Static360.method5071();
											}
											if (Static277.anInt5022 % 1500 == 0) {
												Static280.method3979();
											}
											if (Static433.anInt7309 == 6 && Static129.anInt2192 == 0) {
												Static70.method1095();
											}
											Static35.method577();
											if (Static410.aBoolean468 && Static432.method5870() - 60000L > Static206.aLong172) {
												Static331.method4731();
											}
											for (@Pc(524) Class28_Sub2_Sub2 local524 = (Class28_Sub2_Sub2) Static19.aClass97_1.method2145(); local524 != null; local524 = (Class28_Sub2_Sub2) Static19.aClass97_1.method2148()) {
												if (Static432.method5870() / 1000L - 5L > (long) local524.anInt5211) {
													if (local524.aShort71 > 0) {
														Static94.method4447("", "", local524.aString44 + Static30.aClass231_12.method5261(Static80.anInt6195), 5, 0);
													}
													if (local524.aShort71 == 0) {
														Static94.method4447("", "", local524.aString44 + Static27.aClass231_11.method5261(Static80.anInt6195), 5, 0);
													}
													local524.method5916();
												}
											}
											if (Static433.anInt7309 == 6 && Static129.anInt2192 == 0) {
												if (Static339.aClass66_2 == null) {
													Static360.method5072(false);
													return;
												}
												Static392.anInt6754++;
												if (Static392.anInt6754 > 50) {
													Static164.method2403(Static128.aClass208_28);
												}
												try {
													if (Static339.aClass66_2 != null && Static389.aClass2_Sub17_Sub1_2.anInt7523 > 0) {
														Static241.anInt4070 += Static389.aClass2_Sub17_Sub1_2.anInt7523;
														Static339.aClass66_2.method1392(Static389.aClass2_Sub17_Sub1_2.anInt7523, Static389.aClass2_Sub17_Sub1_2.aByteArray94);
														Static392.anInt6754 = 0;
														Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
														return;
													}
												} catch (@Pc(657) IOException local657) {
													Static360.method5072(false);
													return;
												}
											}
											return;
										}
										local357 = local352.aClass93_10;
										if (local357.anInt2424 < 0) {
											break;
										}
										local365 = Static160.method2380(local357.anInt2426);
									} while (local365 == null || local365.aClass93Array1 == null || local365.aClass93Array1.length <= local357.anInt2424 || local365.aClass93Array1[local357.anInt2424] != local357);
									Static76.method1143(local352);
								}
							}
							local357 = local352.aClass93_10;
							if (local357.anInt2424 < 0) {
								break;
							}
							local365 = Static160.method2380(local357.anInt2426);
						} while (local365 == null || local365.aClass93Array1 == null || local365.aClass93Array1.length <= local357.anInt2424 || local357 != local365.aClass93Array1[local357.anInt2424]);
						Static76.method1143(local352);
					}
				}
				local357 = local352.aClass93_10;
				if (local357.anInt2424 < 0) {
					break;
				}
				local365 = Static160.method2380(local357.anInt2426);
			} while (local365 == null || local365.aClass93Array1 == null || local365.aClass93Array1.length <= local357.anInt2424 || local365.aClass93Array1[local357.anInt2424] != local357);
			Static76.method1143(local352);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method868() {
		@Pc(6) int local6;
		if (!Static434.aClass165_Sub1_1.aBoolean302) {
			for (local6 = 0; local6 < Static210.anInt3599; local6++) {
				if (Static127.anInterface2Array1[local6].method2883() == 's' || Static127.anInterface2Array1[local6].method2883() == 'S') {
					Static434.aClass165_Sub1_1.aBoolean302 = true;
					break;
				}
			}
		}
		@Pc(53) int local53;
		if (Static167.anInt7566 == 0) {
			@Pc(44) Runtime local44 = Runtime.getRuntime();
			local53 = (int) ((local44.totalMemory() - local44.freeMemory()) / 1024L);
			@Pc(56) long local56 = Static432.method5870();
			if (Static88.aLong214 == 0L) {
				Static88.aLong214 = local56;
			}
			if (local53 > 16384 && local56 - Static88.aLong214 < 5000L) {
				if (local56 - Static309.aLong273 > 1000L) {
					System.gc();
					Static309.aLong273 = local56;
				}
				Static400.aString68 = Static35.aClass231_15.method5261(Static80.anInt6195);
				Static215.anInt3675 = 5;
			} else {
				Static400.aString68 = Static118.aClass231_40.method5261(Static80.anInt6195);
				Static215.anInt3675 = 5;
				Static167.anInt7566 = 10;
			}
		} else if (Static167.anInt7566 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static89.aClass225Array2[local6] = Static399.method5600(Static371.anInt6492, Static234.anInt3949);
			}
			Static400.aString68 = Static187.aClass231_64.method5261(Static80.anInt6195);
			Static215.anInt3675 = 10;
			Static167.anInt7566 = 20;
		} else if (Static167.anInt7566 == 20) {
			if (Static108.aClass158_1 == null) {
				Static108.aClass158_1 = new Class158(Static29.aClass249_1, Static463.aClass58_3);
			}
			if (Static108.aClass158_1.method3119()) {
				Static355.aClass171_81 = Static100.method1446(true, 0, false);
				Static274.aClass171_64 = Static100.method1446(true, 1, false);
				Static73.aClass171_16 = Static100.method1446(true, 2, false);
				Static352.aClass171_79 = Static100.method1446(true, 3, false);
				Static199.aClass171_46 = Static100.method1446(true, 4, false);
				Static11.aClass171_2 = Static100.method1446(true, 5, true);
				Static431.aClass171_95 = Static100.method1446(false, 6, true);
				Static323.aClass171_70 = Static100.method1446(true, 7, false);
				Static446.aClass171_101 = Static100.method1446(true, 8, false);
				Static252.aClass171_57 = Static100.method1446(true, 9, false);
				Static413.aClass171_94 = Static100.method1446(true, 10, false);
				Static354.aClass171_80 = Static100.method1446(true, 11, false);
				Static436.aClass171_96 = Static100.method1446(true, 12, false);
				Static336.aClass171_71 = Static100.method1446(true, 13, false);
				Static284.aClass171_67 = Static100.method1446(false, 14, false);
				Static258.aClass171_59 = Static100.method1446(true, 15, false);
				Static233.aClass171_51 = Static100.method1446(true, 16, false);
				Static16.aClass171_68 = Static100.method1446(true, 17, false);
				Static178.aClass171_45 = Static100.method1446(true, 18, false);
				Static112.aClass171_29 = Static100.method1446(true, 19, false);
				Static82.aClass171_50 = Static100.method1446(true, 20, false);
				Static358.aClass171_100 = Static100.method1446(true, 21, false);
				Static363.aClass171_84 = Static100.method1446(true, 22, false);
				Static340.aClass171_73 = Static100.method1446(true, 23, true);
				Static59.aClass171_87 = Static100.method1446(true, 24, false);
				Static67.aClass171_15 = Static100.method1446(true, 25, false);
				Static342.aClass171_74 = Static100.method1446(true, 26, true);
				Static110.aClass171_28 = Static100.method1446(true, 27, false);
				Static47.aClass171_8 = Static100.method1446(true, 28, true);
				Static358.aClass171_99 = Static100.method1446(true, 29, false);
				Static400.aString68 = Static207.aClass231_67.method5261(Static80.anInt6195);
				Static167.anInt7566 = 30;
				Static215.anInt3675 = 15;
			} else {
				Static400.aString68 = Static163.aClass231_60.method5261(Static80.anInt6195);
				Static215.anInt3675 = 12;
			}
		} else if (Static167.anInt7566 == 30) {
			local6 = 0;
			for (local53 = 0; local53 < 30; local53++) {
				local6 += Static156.aClass10_Sub1Array1[local53].method5085() * Static120.anIntArray152[local53] / 100;
			}
			if (local6 == 100) {
				Static400.aString68 = Static228.aClass231_106.method5261(Static80.anInt6195);
				Static215.anInt3675 = 20;
				Static276.method3932(Static446.aClass171_101);
				Static425.method5819(Static446.aClass171_101);
				Static167.anInt7566 = 40;
			} else {
				if (local6 != 0) {
					Static400.aString68 = Static239.aClass231_73.method5261(Static80.anInt6195) + local6 + "%";
				}
				Static215.anInt3675 = 20;
			}
		} else if (Static167.anInt7566 == 40) {
			if (Static47.aClass171_8.method3646()) {
				this.method877(Static47.aClass171_8.method3664(1));
				Static400.aString68 = Static423.aClass231_119.method5261(Static80.anInt6195);
				Static167.anInt7566 = 50;
				Static215.anInt3675 = 25;
			} else {
				Static400.aString68 = Static153.aClass231_54.method5261(Static80.anInt6195) + Static47.aClass171_8.method3672() + "%";
				Static215.anInt3675 = 25;
			}
		} else if (Static167.anInt7566 == 50) {
			Static208.method4867();
			Static400.aString68 = Static440.aClass231_126.method5261(Static80.anInt6195);
			Static167.anInt7566 = 60;
			Static215.anInt3675 = 30;
		} else if (Static167.anInt7566 == 60) {
			local6 = Static146.method2224(Static446.aClass171_101, Static336.aClass171_71);
			local53 = Static161.method2386();
			if (local6 < local53) {
				Static400.aString68 = Static107.aClass231_37.method5261(Static80.anInt6195) + local6 * 100 / local53 + "%";
				Static215.anInt3675 = 35;
			} else {
				Static400.aString68 = Static157.aClass231_56.method5261(Static80.anInt6195);
				Static167.anInt7566 = 70;
				Static215.anInt3675 = 35;
			}
		} else if (Static167.anInt7566 == 70) {
			local6 = Static358.method5942(Static446.aClass171_101);
			local53 = Static235.method3220();
			if (local53 > local6) {
				Static400.aString68 = Static232.aClass231_71.method5261(Static80.anInt6195) + local6 * 100 / local53 + "%";
				Static215.anInt3675 = 40;
			} else {
				Static400.aString68 = Static455.aClass231_130.method5261(Static80.anInt6195);
				Static215.anInt3675 = 40;
				Static167.anInt7566 = 80;
			}
		} else if (Static167.anInt7566 == 80) {
			if (Static342.aClass171_74.method3646()) {
				Static396.anInterface7_6 = new Class59(Static342.aClass171_74, Static252.aClass171_57, Static446.aClass171_101);
				Static400.aString68 = Static448.aClass231_129.method5261(Static80.anInt6195);
				Static215.anInt3675 = 45;
				Static167.anInt7566 = 90;
			} else {
				Static400.aString68 = Static436.aClass231_122.method5261(Static80.anInt6195) + Static342.aClass171_74.method3672() + "%";
				Static215.anInt3675 = 45;
			}
		} else if (Static167.anInt7566 == 90) {
			Static400.aString68 = Static217.aClass231_69.method5261(Static80.anInt6195);
			Static167.anInt7566 = 95;
			Static215.anInt3675 = 50;
		} else if (Static167.anInt7566 == 95) {
			if (Static434.aClass165_Sub1_1.aBoolean302) {
				Static434.aClass165_Sub1_1.anInt4196 = 0;
				Static434.aClass165_Sub1_1.anInt4201 = 0;
				Static434.aClass165_Sub1_1.anInt4200 = 0;
				Static434.aClass165_Sub1_1.anInt4193 = 0;
				Static434.aClass165_Sub1_1.anInt4206 = 1;
			}
			Static434.aClass165_Sub1_1.aBoolean302 = true;
			Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
			Static284.method4034(Static434.aClass165_Sub1_1.anInt4193, false);
			Static400.aString68 = Static358.aClass231_128.method5261(Static80.anInt6195);
			Static215.anInt3675 = 55;
			Static167.anInt7566 = 100;
		} else if (Static167.anInt7566 == 100) {
			Static108.method1791(Static257.aClass75_8, Static336.aClass171_71, Static446.aClass171_101);
			Static400.aString68 = Static253.aClass231_78.method5261(Static80.anInt6195);
			Static215.anInt3675 = 60;
			Static274.method3920(1);
			Static167.anInt7566 = 110;
		} else if (Static167.anInt7566 == 110) {
			Static73.aClass171_16.method3646();
			local53 = Static73.aClass171_16.method3672();
			Static233.aClass171_51.method3646();
			local53 += Static233.aClass171_51.method3672();
			Static16.aClass171_68.method3646();
			local53 += Static16.aClass171_68.method3672();
			Static178.aClass171_45.method3646();
			local53 += Static178.aClass171_45.method3672();
			Static112.aClass171_29.method3646();
			local53 += Static112.aClass171_29.method3672();
			Static82.aClass171_50.method3646();
			local53 += Static82.aClass171_50.method3672();
			Static358.aClass171_100.method3646();
			local53 += Static358.aClass171_100.method3672();
			Static363.aClass171_84.method3646();
			local53 += Static363.aClass171_84.method3672();
			Static59.aClass171_87.method3646();
			local53 += Static59.aClass171_87.method3672();
			Static67.aClass171_15.method3646();
			local53 += Static67.aClass171_15.method3672();
			Static110.aClass171_28.method3646();
			local53 += Static110.aClass171_28.method3672();
			Static358.aClass171_99.method3646();
			local53 += Static358.aClass171_99.method3672();
			if (local53 < 1200) {
				Static400.aString68 = Static22.aClass231_9.method5261(Static80.anInt6195) + local53 / 12 + "%";
				Static215.anInt3675 = 65;
			} else {
				Static275.aClass235_1 = new Class235(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static257.aClass262_1 = new Class262(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static39.aClass73_1 = new Class73(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16, Static446.aClass171_101);
				Static384.aClass162_1 = new Class162(Static10.aClass200_1, Static80.anInt6195, Static16.aClass171_68);
				Static457.aClass227_6 = new Class227(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static171.aClass210_6 = new Class210(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static421.aClass174_2 = new Class174(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16, Static323.aClass171_70);
				Static106.aClass245_1 = new Class245(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static379.aClass152_2 = new Class152(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static249.aClass39_2 = new Class39(Static10.aClass200_1, Static80.anInt6195, true, Static233.aClass171_51, Static323.aClass171_70);
				Static54.aClass84_2 = new Class84(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16, Static446.aClass171_101);
				Static386.aClass230_7 = new Class230(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16, Static446.aClass171_101);
				Static227.aClass54_2 = new Class54(Static10.aClass200_1, Static80.anInt6195, true, Static178.aClass171_45, Static323.aClass171_70);
				Static413.aClass271_2 = new Class271(Static10.aClass200_1, Static80.anInt6195, true, Static275.aClass235_1, Static112.aClass171_29, Static323.aClass171_70);
				Static461.aClass34_1 = new Class34(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static37.aClass80_1 = new Class80(Static10.aClass200_1, Static80.anInt6195, Static82.aClass171_50, Static355.aClass171_81, Static274.aClass171_64);
				Static174.aClass147_1 = new Class147(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static388.aClass35_1 = new Class35(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static399.aClass100_2 = new Class100(Static10.aClass200_1, Static80.anInt6195, Static358.aClass171_100, Static323.aClass171_70);
				Static236.aClass55_1 = new Class55(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static366.aClass116_1 = new Class116(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static73.aClass209_1 = new Class209(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static371.aClass211_1 = new Class211(Static10.aClass200_1, Static80.anInt6195, Static363.aClass171_84);
				Static361.aClass267_1 = new Class267(Static10.aClass200_1, Static80.anInt6195, Static73.aClass171_16);
				Static397.method5501(Static323.aClass171_70, Static352.aClass171_79, Static446.aClass171_101, Static336.aClass171_71);
				Static223.method3081(Static358.aClass171_99);
				Static235.aClass72_1 = new Class72(Static80.anInt6195, Static59.aClass171_87, Static67.aClass171_15);
				Static230.aClass179_2 = new Class179(Static80.anInt6195, Static59.aClass171_87, Static67.aClass171_15, new Class265());
				Static400.aString68 = Static61.aClass231_22.method5261(Static80.anInt6195);
				Static215.anInt3675 = 65;
				Static121.method1957();
				Static249.aClass39_2.method745(!Static434.aClass165_Sub1_1.method3397(Static404.anInt2752));
				Static63.aClass120_2 = new Class120();
				Static465.method5995();
				Static280.method3980(Static110.aClass171_28);
				Static420.method5767(Static323.aClass171_70, Static396.anInterface7_6);
				Static167.anInt7566 = 120;
			}
		} else if (Static167.anInt7566 == 120) {
			local53 = Static461.method6251(Static446.aClass171_101);
			@Pc(1154) int local1154 = Static129.method2036();
			if (local1154 > local53) {
				Static400.aString68 = Static46.aClass231_16.method5261(Static80.anInt6195) + local53 * 100 / local1154 + "%";
				Static215.anInt3675 = 70;
			} else {
				Static267.method3708(Static446.aClass171_101, Static257.aClass75_8);
				Static384.method5269(Static179.aClass41Array3);
				Static400.aString68 = Static347.aClass231_107.method5261(Static80.anInt6195);
				Static215.anInt3675 = 70;
				Static167.anInt7566 = 130;
			}
		} else if (Static167.anInt7566 == 130) {
			if (Static413.aClass171_94.method3648("huffman", "")) {
				@Pc(1228) Class186 local1228 = new Class186(Static413.aClass171_94.method3676("", "huffman"));
				Static230.method3115(local1228);
				Static400.aString68 = Static337.aClass231_104.method5261(Static80.anInt6195);
				Static215.anInt3675 = 75;
				Static167.anInt7566 = 140;
			} else {
				Static400.aString68 = Static266.aClass231_82.method5261(Static80.anInt6195) + "0%";
				Static215.anInt3675 = 75;
			}
		} else if (Static167.anInt7566 == 140) {
			if (Static352.aClass171_79.method3646()) {
				Static400.aString68 = Static224.aClass231_70.method5261(Static80.anInt6195);
				Static167.anInt7566 = 150;
				Static215.anInt3675 = 80;
			} else {
				Static400.aString68 = Static340.aClass231_105.method5261(Static80.anInt6195) + Static352.aClass171_79.method3672() + "%";
				Static215.anInt3675 = 80;
			}
		} else if (Static167.anInt7566 == 150) {
			if (Static436.aClass171_96.method3646()) {
				Static400.aString68 = Static378.aClass231_125.method5261(Static80.anInt6195);
				Static215.anInt3675 = 82;
				Static167.anInt7566 = 160;
			} else {
				Static400.aString68 = Static160.aClass231_58.method5261(Static80.anInt6195) + Static436.aClass171_96.method3672() + "%";
				Static215.anInt3675 = 82;
			}
		} else if (Static167.anInt7566 == 160) {
			if (Static336.aClass171_71.method3646()) {
				Static400.aString68 = Static99.aClass231_34.method5261(Static80.anInt6195);
				Static215.anInt3675 = 85;
				Static167.anInt7566 = 170;
			} else {
				Static400.aString68 = Static99.aClass231_34.method5261(Static80.anInt6195) + Static336.aClass171_71.method3672() + "%";
				Static215.anInt3675 = 85;
			}
		} else if (Static167.anInt7566 == 170) {
			if (Static340.aClass171_73.method3655("details")) {
				Static5.method5402(Static340.aClass171_73, Static457.aClass227_6, Static171.aClass210_6, Static249.aClass39_2, Static54.aClass84_2, Static386.aClass230_7, Static63.aClass120_2);
				Static400.aString68 = Static150.aClass231_123.method5261(Static80.anInt6195);
				Static215.anInt3675 = 89;
				Static167.anInt7566 = 190;
			} else {
				Static400.aString68 = Static136.aClass231_48.method5261(Static80.anInt6195) + Static340.aClass171_73.method3657("details") + "%";
				Static215.anInt3675 = 87;
			}
		} else if (Static167.anInt7566 == 190) {
			Static388.anIntArray542 = new int[Static73.aClass209_1.anInt6109];
			Static308.aStringArray51 = new String[Static366.aClass116_1.anInt2907];
			Static203.aBooleanArray15 = new boolean[Static73.aClass209_1.anInt6109];
			for (local53 = 0; local53 < Static73.aClass209_1.anInt6109; local53++) {
				if (Static73.aClass209_1.method4858(local53).anInt612 == 0) {
					Static203.aBooleanArray15[local53] = true;
					Static429.anInt7277++;
				}
				Static388.anIntArray542[local53] = -1;
			}
			Static103.method4272();
			Static306.anInt5515 = Static352.aClass171_79.method3668("loginscreen");
			Static274.anInt4978 = Static352.aClass171_79.method3668("lobbyscreen");
			Static11.aClass171_2.method3669(false);
			Static431.aClass171_95.method3669(true);
			Static446.aClass171_101.method3669(true);
			Static336.aClass171_71.method3669(true);
			Static413.aClass171_94.method3669(true);
			Static352.aClass171_79.method3669(true);
			Static73.aClass171_16.anInt4582 = 2;
			Static215.aBoolean245 = true;
			Static16.aClass171_68.anInt4582 = 2;
			Static233.aClass171_51.anInt4582 = 2;
			Static178.aClass171_45.anInt4582 = 2;
			Static112.aClass171_29.anInt4582 = 2;
			Static82.aClass171_50.anInt4582 = 2;
			Static358.aClass171_100.anInt4582 = 2;
			Static291.method4115(false, -1, -1, Static434.aClass165_Sub1_1.anInt4206);
			Static400.aString68 = Static298.aClass231_90.method5261(Static80.anInt6195);
			Static167.anInt7566 = 200;
			Static215.anInt3675 = 95;
		} else if (Static167.anInt7566 == 200) {
			Static274.method3920(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method841() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method872() {
		if (Static433.anInt7309 == 13) {
			return;
		}
		Static277.anInt5022++;
		if (Static277.anInt5022 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static134.anInt2522 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static385.aRandom1.setSeed((long) Static134.anInt2522);
		}
		if (Static277.anInt5022 % 50 == 0) {
			Static216.anInt7641 = Static241.anInt4070;
			Static404.anInt2751 = Static124.anInt2078;
			Static241.anInt4070 = 0;
			Static124.anInt2078 = 0;
		}
		this.method864();
		if (Static108.aClass158_1 != null) {
			Static108.aClass158_1.method3120();
		}
		Static462.method3626();
		Static161.aClass115_1.method2372();
		Static196.aClass126_1.method5361();
		if (Static257.aClass75_8 != null) {
			Static257.aClass75_8.method5953((int) Static432.method5870());
		}
		Static202.method2832();
		Static425.anInt7247 = 0;
		Static210.anInt3599 = 0;
		for (@Pc(93) Interface2 local93 = Static161.aClass115_1.method2373(); local93 != null; local93 = Static161.aClass115_1.method2373()) {
			@Pc(99) int local99 = local93.method2882();
			if (local99 == 2 || local99 == 3) {
				@Pc(113) char local113 = local93.method2883();
				if (Static396.method5463() && (local113 == '`' || local113 == '§')) {
					if (Static448.method6076()) {
						Static155.method2317();
					} else {
						Static17.method357();
					}
				} else if (Static210.anInt3599 < 128) {
					Static127.anInterface2Array1[Static210.anInt3599] = local93;
					Static210.anInt3599++;
				}
			} else if (local99 == 0 && Static425.anInt7247 < 75) {
				Static189.anInterface2Array2[Static425.anInt7247] = local93;
				Static425.anInt7247++;
			}
		}
		Static72.anInt1221 = 0;
		for (@Pc(174) Class2_Sub11 local174 = Static196.aClass126_1.method5365(); local174 != null; local174 = Static196.aClass126_1.method5365()) {
			@Pc(180) int local180 = local174.method4364();
			if (local180 == -1) {
				Static361.aClass181_34.method3973(local174);
			} else if (local180 == 6) {
				Static72.anInt1221 += local174.method4366();
			} else if (Static78.method1177(local180)) {
				Static292.aClass181_26.method3973(local174);
				if (Static292.aClass181_26.method3963() > 10) {
					Static292.aClass181_26.method3976();
				}
			}
		}
		if (Static448.method6076()) {
			Static175.method2561();
		}
		if (Static433.anInt7309 == 0) {
			this.method868();
			Static87.method1363();
		} else if (Static433.anInt7309 == 1) {
			this.method868();
			Static87.method1363();
		} else if (Static200.method2819(Static433.anInt7309)) {
			Static414.method5689();
		}
		if (Static126.method1972(Static433.anInt7309) && !Static200.method2819(Static433.anInt7309)) {
			this.method865();
			Static66.method1056();
			Static297.method4245();
		} else if (Static203.method2864(Static433.anInt7309) && !Static200.method2819(Static433.anInt7309)) {
			this.method865();
			Static297.method4245();
		} else if (Static433.anInt7309 == 11) {
			Static297.method4245();
		} else if (Static263.method3698(Static433.anInt7309) && !Static200.method2819(Static433.anInt7309)) {
			Static326.method4639();
		} else if (Static433.anInt7309 == 12) {
			Static297.method4245();
			if (Static20.anInt412 != -3 && Static20.anInt412 != 2 && Static20.anInt412 != 15) {
				Static360.method5072(false);
			}
		}
		Static438.method5919(Static257.aClass75_8);
		Static292.aClass181_26.method3976();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method874(@OriginalArg(1) int arg0) {
		Static142.aClass136_2 = null;
		Static284.anInt5121 = 0;
		Static29.aClass249_1.anInt7127 = arg0;
		Static88.aClass113_6 = null;
		Static29.aClass249_1.anInt7128++;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method848() {
		@Pc(16) Frame local16 = new Frame("Jagex");
		local16.pack();
		local16.dispose();
		Static372.method5183();
		Static463.aClass58_3 = new Class58(Static138.aClass194_2);
		Static29.aClass249_1 = new Class249();
		if (Static112.aClass129_4 != Static429.aClass129_8) {
			Static38.aByteArrayArray5 = new byte[50][];
		}
		Static434.aClass165_Sub1_1 = new Class165_Sub1(Static138.aClass194_2);
		if (Static429.aClass129_8 == Static112.aClass129_4) {
			Static457.aClass263_5.aString71 = this.getCodeBase().getHost();
		} else if (Static18.method360(Static429.aClass129_8)) {
			Static457.aClass263_5.aString71 = this.getCodeBase().getHost();
			Static457.aClass263_5.anInt7388 = Static457.aClass263_5.anInt7387 + 40000;
			Static15.aClass263_1.anInt7388 = Static15.aClass263_1.anInt7387 + 40000;
			Static287.aClass263_4.anInt7388 = Static287.aClass263_4.anInt7387 + 40000;
			Static457.aClass263_5.anInt7390 = Static457.aClass263_5.anInt7387 + 50000;
			Static15.aClass263_1.anInt7390 = Static15.aClass263_1.anInt7387 + 50000;
			Static287.aClass263_4.anInt7390 = Static287.aClass263_4.anInt7387 + 50000;
		} else if (Static429.aClass129_8 == Static222.aClass129_6) {
			Static457.aClass263_5.aString71 = "127.0.0.1";
			Static15.aClass263_1.aString71 = "127.0.0.1";
			Static457.aClass263_5.anInt7388 = Static457.aClass263_5.anInt7387 + 40000;
			Static287.aClass263_4.aString71 = "127.0.0.1";
			Static15.aClass263_1.anInt7388 = Static15.aClass263_1.anInt7387 + 40000;
			Static287.aClass263_4.anInt7388 = Static287.aClass263_4.anInt7387 + 40000;
			Static457.aClass263_5.anInt7390 = Static457.aClass263_5.anInt7387 + 50000;
			Static15.aClass263_1.anInt7390 = Static15.aClass263_1.anInt7387 + 50000;
			Static287.aClass263_4.anInt7390 = Static287.aClass263_4.anInt7387 + 50000;
		}
		if (Static10.aClass200_1 == Static201.aClass200_4) {
			Static111.aBoolean107 = true;
			Static388.aShortArrayArray8 = Static19.aShortArrayArray1;
			Static172.aShortArray46 = Static264.aShortArray78;
			Static164.aShortArray45 = Static281.aShortArray77;
			Static149.anInt7396 = 16777215;
			Static373.aShortArrayArray6 = Static374.aShortArrayArray7;
			Static298.anInt5367 = 0;
		} else {
			Static164.aShortArray45 = Static239.aShortArray76;
			Static172.aShortArray46 = Static361.aShortArray92;
			Static373.aShortArrayArray6 = Static300.aShortArrayArray5;
			Static388.aShortArrayArray8 = Static115.aShortArrayArray2;
		}
		Static163.aClass263_3 = Static457.aClass263_5;
		if (Static10.aClass200_1 == Static183.aClass200_3) {
			Static82.aBoolean260 = false;
		}
		Static63.aShortArray96 = Static331.aShortArray85 = Static89.aShortArray13 = Static81.aShortArray15 = new short[256];
		Static161.aClass115_1 = Static192.method2762(Static291.aCanvas6);
		Static196.aClass126_1 = Static282.method3989(Static291.aCanvas6);
		Static293.anInt5236 = Static307.anInt5537;
		try {
			if (Static138.aClass194_2.aClass213_2 != null) {
				Static222.aClass201_4 = new Class201(Static138.aClass194_2.aClass213_2, 5200, 0);
				for (@Pc(217) int local217 = 0; local217 < 30; local217++) {
					Static174.aClass201Array1[local217] = new Class201(Static138.aClass194_2.aClass213Array1[local217], 6000, 0);
				}
				Static37.aClass201_3 = new Class201(Static138.aClass194_2.aClass213_3, 6000, 0);
				Static385.aClass24_4 = new Class24(255, Static222.aClass201_4, Static37.aClass201_3, 500000);
				Static291.aClass201_5 = new Class201(Static138.aClass194_2.aClass213_1, 24, 0);
				Static138.aClass194_2.aClass213Array1 = null;
				Static138.aClass194_2.aClass213_1 = null;
				Static138.aClass194_2.aClass213_2 = null;
				Static138.aClass194_2.aClass213_3 = null;
			}
		} catch (@Pc(275) IOException local275) {
			Static385.aClass24_4 = null;
			Static291.aClass201_5 = null;
			Static222.aClass201_4 = null;
			Static37.aClass201_3 = null;
		}
		if (Static429.aClass129_8 != Static112.aClass129_4) {
			Static441.aBoolean501 = true;
		}
		if (Static10.aClass200_1 == Static183.aClass200_3) {
			Static460.aString75 = Static411.aClass231_115.method5261(Static80.anInt6195);
		} else if (Static10.aClass200_1 == Static201.aClass200_4) {
			Static460.aString75 = Static13.aClass231_6.method5261(Static80.anInt6195);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method877(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg0);
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method6138();
				if (local16 == 0) {
					return;
				}
				if (local16 == 1) {
					@Pc(28) int[] local28 = Static27.anIntArray45 = new int[6];
					local28[0] = local10.method6148();
					local28[1] = local10.method6148();
					local28[2] = local10.method6148();
					local28[3] = local10.method6148();
					local28[4] = local10.method6148();
					local28[5] = local10.method6148();
				} else {
					@Pc(82) int local82;
					@Pc(87) int local87;
					if (local16 == 4) {
						local82 = local10.method6138();
						Static208.anIntArray513 = new int[local82];
						for (local87 = 0; local87 < local82; local87++) {
							Static208.anIntArray513[local87] = local10.method6148();
							if (Static208.anIntArray513[local87] == 65535) {
								Static208.anIntArray513[local87] = -1;
							}
						}
					} else if (local16 == 5) {
						local82 = local10.method6138();
						Static138.anIntArray214 = new int[local82];
						for (local87 = 0; local87 < local82; local87++) {
							Static138.anIntArray214[local87] = local10.method6148();
							if (Static138.anIntArray214[local87] == 65535) {
								Static138.anIntArray214[local87] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method843() {
		if (Static404.anInt2752 != 2) {
			this.method861();
			return;
		}
		try {
			this.method861();
		} catch (@Pc(18) Throwable local18) {
			Static357.method5001(0);
			Static22.method402(local18, local18.getMessage() + " (Recovered) " + this.method840());
		}
	}
}
