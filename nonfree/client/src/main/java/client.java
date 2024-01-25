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
				Static451.method6793("Argument count");
			}
			Static481.aClass306_4 = new Class306();
			Static481.aClass306_4.anInt8300 = Integer.parseInt(arg0[0]);
			Static104.aClass306_2 = new Class306();
			Static104.aClass306_2.anInt8300 = Integer.parseInt(arg0[1]);
			Static70.aClass306_1 = new Class306();
			Static70.aClass306_1.anInt8300 = Integer.parseInt(arg0[2]);
			Static211.aClass15_2 = Static389.aClass15_7;
			if (arg0[3].equals("live")) {
				Static549.aClass103_4 = Static247.aClass103_2;
			} else if (arg0[3].equals("rc")) {
				Static549.aClass103_4 = Static340.aClass103_3;
			} else if (arg0[3].equals("wip")) {
				Static549.aClass103_4 = Static57.aClass103_1;
			} else {
				Static451.method6793("modewhat");
			}
			Static266.anInt4796 = Static398.method5936(arg0[4]);
			if (Static266.anInt4796 == -1) {
				if (arg0[4].equals("english")) {
					Static266.anInt4796 = 0;
				} else if (arg0[4].equals("german")) {
					Static266.anInt4796 = 1;
				} else {
					Static451.method6793("language");
				}
			}
			Static12.aBoolean9 = false;
			Static483.aBoolean594 = false;
			if (arg0[5].equals("game0")) {
				Static156.aClass63_2 = Static550.aClass63_6;
			} else if (arg0[5].equals("game1")) {
				Static156.aClass63_2 = Static265.aClass63_4;
			} else if (arg0[5].equals("game2")) {
				Static156.aClass63_2 = Static523.aClass63_5;
			} else if (arg0[5].equals("game3")) {
				Static156.aClass63_2 = Static597.aClass63_7;
			} else {
				Static451.method6793("game");
			}
			Static463.aString84 = "";
			Static320.anInt5438 = Static156.aClass63_2.anInt1655;
			Static224.aString44 = null;
			Static635.aLong275 = 0L;
			Static451.anInt7697 = 0;
			Static46.aBoolean57 = true;
			Static409.aBoolean218 = true;
			Static43.aBoolean51 = false;
			Static141.aBoolean189 = false;
			Static363.anInt6076 = 0;
			Static371.anInt6178 = 0;
			Static358.aString61 = null;
			@Pc(186) client local186 = new client();
			Static475.aClient1 = local186;
			local186.method1264(Static156.aClass63_2.aString21, Static549.aClass103_4.method2128() + 32);
			Static190.aFrame1.setLocation(40, 40);
		} catch (@Pc(209) Exception local209) {
			Static524.method7740(local209, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1269() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method1275() {
		if (Static7.anApplet1 != null && Static83.aCanvas14 == null && !Static470.aClass100_14.aBoolean192) {
			try {
				@Pc(13) Class local13 = Static7.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static83.aCanvas14 = (Canvas) local17.get(Static7.anApplet1);
				local17.set(Static7.anApplet1, null);
				if (Static83.aCanvas14 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1275();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1281() {
		@Pc(15) boolean local15 = Static1.aClass309_7.method7421();
		if (!local15) {
			this.method1297();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1278() {
		if (Static141.aBoolean189) {
			Static110.anInt2065 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static521.method7716();
		Static593.aClass161_3 = new Class161(Static470.aClass100_14);
		Static1.aClass309_7 = new Class309();
		Static36.method542(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static211.aClass15_2 != Static517.aClass15_8) {
			Static44.aByteArrayArray1 = new byte[50][];
		}
		Static97.aClass5_Sub25_8 = Static108.method1682();
		if (Static211.aClass15_2 == Static517.aClass15_8) {
			Static481.aClass306_4.aString95 = this.getCodeBase().getHost();
		} else if (Static523.method7736(Static211.aClass15_2)) {
			Static481.aClass306_4.aString95 = this.getCodeBase().getHost();
			Static481.aClass306_4.anInt8296 = Static481.aClass306_4.anInt8300 + 40000;
			Static104.aClass306_2.anInt8296 = Static104.aClass306_2.anInt8300 + 40000;
			Static481.aClass306_4.anInt8294 = Static481.aClass306_4.anInt8300 + 50000;
			Static70.aClass306_1.anInt8296 = Static70.aClass306_1.anInt8300 + 40000;
			Static104.aClass306_2.anInt8294 = Static104.aClass306_2.anInt8300 + 50000;
			Static70.aClass306_1.anInt8294 = Static70.aClass306_1.anInt8300 + 50000;
		} else if (Static389.aClass15_7 == Static211.aClass15_2) {
			Static481.aClass306_4.aString95 = "127.0.0.1";
			Static104.aClass306_2.aString95 = "127.0.0.1";
			Static70.aClass306_1.aString95 = "127.0.0.1";
			Static481.aClass306_4.anInt8296 = Static481.aClass306_4.anInt8300 + 40000;
			Static104.aClass306_2.anInt8296 = Static104.aClass306_2.anInt8300 + 40000;
			Static70.aClass306_1.anInt8296 = Static70.aClass306_1.anInt8300 + 40000;
			Static481.aClass306_4.anInt8294 = Static481.aClass306_4.anInt8300 + 50000;
			Static104.aClass306_2.anInt8294 = Static104.aClass306_2.anInt8300 + 50000;
			Static70.aClass306_1.anInt8294 = Static70.aClass306_1.anInt8300 + 50000;
		}
		if (Static265.aClass63_4 == Static156.aClass63_2) {
			Static375.anInt6228 = 0;
			Static597.aShortArrayArrayArray9 = Static361.aShortArrayArrayArray8;
			Static444.anInt7592 = 16777215;
			Static340.aShortArrayArray24 = Static97.aShortArrayArray6;
			Static59.aBoolean66 = true;
		} else if (Static597.aClass63_7 == Static156.aClass63_2) {
			Static597.aShortArrayArrayArray9 = Static284.aShortArrayArrayArray4;
			Static340.aShortArrayArray24 = Static484.aShortArrayArray25;
		} else {
			Static597.aShortArrayArrayArray9 = Static66.aShortArrayArrayArray1;
			Static340.aShortArrayArray24 = Static60.aShortArrayArray1;
		}
		Static30.aShortArray8 = Static562.aShortArray95 = Static406.aShortArray106 = Static356.aShortArray96 = new short[256];
		Static490.aClass306_5 = Static481.aClass306_4;
		if (Static550.aClass63_6 == Static156.aClass63_2) {
			Static125.aBoolean76 = false;
		}
		try {
			Static166.aClipboard1 = Static475.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(217) Exception local217) {
		}
		Static45.aClass115_1 = Static517.method7654(Static83.aCanvas14);
		Static3.aClass3_3 = Static193.method7294(Static83.aCanvas14);
		try {
			if (Static470.aClass100_14.aClass79_2 != null) {
				Static511.aClass363_7 = new Class363(Static470.aClass100_14.aClass79_2, 5200, 0);
				for (@Pc(239) int local239 = 0; local239 < 37; local239++) {
					Static410.aClass363Array1[local239] = new Class363(Static470.aClass100_14.aClass79Array1[local239], 6000, 0);
				}
				Static460.aClass363_6 = new Class363(Static470.aClass100_14.aClass79_1, 6000, 0);
				Static229.aClass157_1 = new Class157(255, Static511.aClass363_7, Static460.aClass363_6, 500000);
				Static389.aClass363_5 = new Class363(Static470.aClass100_14.aClass79_3, 24, 0);
				Static470.aClass100_14.aClass79_1 = null;
				Static470.aClass100_14.aClass79Array1 = null;
				Static470.aClass100_14.aClass79_3 = null;
				Static470.aClass100_14.aClass79_2 = null;
			}
		} catch (@Pc(295) IOException local295) {
			Static229.aClass157_1 = null;
			Static511.aClass363_7 = null;
			Static460.aClass363_6 = null;
			Static389.aClass363_5 = null;
		}
		if (Static211.aClass15_2 != Static517.aClass15_8) {
			Static471.aBoolean564 = true;
		}
		Static215.aString41 = Static174.aClass120_12.method2690(Static266.anInt4796);
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1274()) {
			return;
		}
		Static481.aClass306_4 = new Class306();
		Static481.aClass306_4.anInt8300 = Integer.parseInt(this.getParameter("worldid"));
		Static104.aClass306_2 = new Class306();
		Static104.aClass306_2.anInt8300 = Integer.parseInt(this.getParameter("lobbyid"));
		Static104.aClass306_2.aString95 = this.getParameter("lobbyaddress");
		Static70.aClass306_1 = new Class306();
		Static70.aClass306_1.anInt8300 = Integer.parseInt(this.getParameter("demoid"));
		Static70.aClass306_1.aString95 = this.getParameter("demoaddress");
		Static211.aClass15_2 = Static528.method7830(Integer.parseInt(this.getParameter("modewhere")));
		if (Static389.aClass15_7 == Static211.aClass15_2) {
			Static211.aClass15_2 = Static288.aClass15_5;
		} else if (!Static523.method7736(Static211.aClass15_2) && Static517.aClass15_8 != Static211.aClass15_2) {
			Static211.aClass15_2 = Static517.aClass15_8;
		}
		Static549.aClass103_4 = Static564.method8211(Integer.parseInt(this.getParameter("modewhat")));
		if (Static549.aClass103_4 != Static57.aClass103_1 && Static340.aClass103_3 != Static549.aClass103_4 && Static549.aClass103_4 != Static247.aClass103_2) {
			Static549.aClass103_4 = Static247.aClass103_2;
		}
		try {
			Static266.anInt4796 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static266.anInt4796 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static483.aBoolean594 = true;
		} else {
			Static483.aBoolean594 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static12.aBoolean9 = true;
		} else {
			Static12.aBoolean9 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static11.aBoolean7 = true;
		} else {
			Static11.aBoolean7 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static156.aClass63_2 = Static550.aClass63_6;
			} else if (local152.equals("1")) {
				Static156.aClass63_2 = Static265.aClass63_4;
			} else if (local152.equals("2")) {
				Static156.aClass63_2 = Static523.aClass63_5;
			} else if (local152.equals("3")) {
				Static156.aClass63_2 = Static597.aClass63_7;
			}
		}
		try {
			Static451.anInt7697 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static451.anInt7697 = 0;
		}
		Static156.aString36 = this.getParameter("quiturl");
		Static463.aString84 = this.getParameter("settings");
		if (Static463.aString84 == null) {
			Static463.aString84 = "";
		}
		Static639.aBoolean760 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static363.anInt6076 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static363.anInt6076 = 0;
			}
		}
		Static320.anInt5438 = Integer.parseInt(this.getParameter("colourid"));
		if (Static320.anInt5438 < 0 || Static320.anInt5438 >= Static187.aColorArray1.length) {
			Static320.anInt5438 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static46.aBoolean57 = true;
			Static409.aBoolean218 = true;
		}
		@Pc(255) String local255 = this.getParameter("frombilling");
		if (local255 != null && local255.equals("true")) {
			Static43.aBoolean51 = true;
		}
		Static358.aString61 = this.getParameter("sskey");
		if (Static358.aString61 != null && Static358.aString61.length() < 2) {
			Static358.aString61 = null;
		}
		@Pc(281) String local281 = this.getParameter("force64mb");
		if (local281 != null && local281.equals("true")) {
			Static141.aBoolean189 = true;
		}
		@Pc(293) String local293 = this.getParameter("worldflags");
		if (local293 != null) {
			try {
				Static371.anInt6178 = Integer.parseInt(local293);
			} catch (@Pc(300) Exception local300) {
			}
		}
		@Pc(305) String local305 = this.getParameter("userFlow");
		if (local305 != null) {
			try {
				Static635.aLong275 = Long.parseLong(local305);
			} catch (@Pc(312) NumberFormatException local312) {
			}
		}
		Static224.aString44 = this.getParameter("additionalInfo");
		if (Static224.aString44 != null && Static224.aString44.length() > 50) {
			Static224.aString44 = null;
		}
		Static475.aClient1 = this;
		if (Static550.aClass63_6 == Static156.aClass63_2) {
			Static79.anInt1667 = 765;
			Static627.anInt10422 = 503;
		} else if (Static265.aClass63_4 == Static156.aClass63_2) {
			Static79.anInt1667 = 640;
			Static627.anInt10422 = 480;
		}
		this.method1272(Static627.anInt10422, Static79.anInt1667, Static156.aClass63_2.aString21, Static549.aClass103_4.method2128() + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1283(@OriginalArg(1) int arg0) {
		Static1.aClass309_7.anInt8593++;
		Static188.anInt9406 = 0;
		Static55.aClass374_1 = null;
		Static1.aClass309_7.anInt8592 = arg0;
		Static400.aClass91_7 = null;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1285() {
		if (Static151.anInt2620 == 14) {
			return;
		}
		Static631.anInt10493++;
		if (Static631.anInt10493 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static497.anInt8629 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static91.aRandom1.setSeed((long) Static497.anInt8629);
		}
		if (Static631.anInt10493 % 50 == 0) {
			Static427.anInt7396 = Static284.anInt5007;
			Static190.anInt3315 = Static307.anInt2869;
			Static284.anInt5007 = 0;
			Static307.anInt2869 = 0;
		}
		this.method1281();
		if (Static562.aClass237_2 != null) {
			Static562.aClass237_2.method5273();
		}
		Static132.method6369();
		Static635.method8976();
		Static45.aClass115_1.method2493();
		Static3.aClass3_3.method8880();
		if (Static213.aClass133_5 != null) {
			Static213.aClass133_5.method7252((int) Static95.method1587());
		}
		Static107.method9052();
		Static130.anInt2337 = 0;
		Static61.anInt9889 = 0;
		for (@Pc(100) Interface1 local100 = Static45.aClass115_1.method2491(); local100 != null; local100 = Static45.aClass115_1.method2491()) {
			@Pc(106) int local106 = local100.method7650();
			if (local106 == 2 || local106 == 3) {
				@Pc(118) char local118 = local100.method7648();
				if (Static305.method3662() && (local118 == '`' || local118 == '§' || local118 == '²')) {
					if (Static123.method4146()) {
						Static129.method1919();
					} else {
						Static242.method4014();
					}
				} else if (Static61.anInt9889 < 128) {
					Static327.anInterface1Array2[Static61.anInt9889] = local100;
					Static61.anInt9889++;
				}
			} else if (local106 == 0 && Static130.anInt2337 < 75) {
				Static208.anInterface1Array1[Static130.anInt2337] = local100;
				Static130.anInt2337++;
			}
		}
		Static236.anInt4330 = 0;
		for (@Pc(184) Class5_Sub13 local184 = Static3.aClass3_3.method8876(); local184 != null; local184 = Static3.aClass3_3.method8876()) {
			@Pc(190) int local190 = local184.method5399();
			if (local190 == -1) {
				Static608.aClass330_61.method7917(local184);
			} else if (local190 == 6) {
				Static236.anInt4330 += local184.method5400();
			} else if (Static362.method5386(local190)) {
				Static75.aClass330_5.method7917(local184);
				if (Static75.aClass330_5.method7912() > 10) {
					Static75.aClass330_5.method7911();
				}
			}
		}
		if (Static123.method4146()) {
			Static133.method1987();
		}
		if (Static67.method1107(Static151.anInt2620)) {
			Static113.method1742();
			Static88.method1488();
		} else if (Static432.method6578(Static151.anInt2620)) {
			Static615.method8780();
		}
		if (Static280.method4485(Static151.anInt2620) && !Static432.method6578(Static151.anInt2620)) {
			this.method1299();
			Static509.method7616();
			Static380.method5560();
		} else if (Static535.method7883(Static151.anInt2620) && !Static432.method6578(Static151.anInt2620)) {
			this.method1299();
			Static380.method5560();
		} else if (Static151.anInt2620 == 12) {
			Static380.method5560();
		} else if (Static75.method1290(Static151.anInt2620) && !Static432.method6578(Static151.anInt2620)) {
			Static89.method1511();
		} else if (Static151.anInt2620 == 13) {
			Static380.method5560();
			if (Static15.anInt244 != -3 && Static15.anInt244 != 2 && Static15.anInt244 != 15) {
				Static583.method8429(false);
			}
		}
		Static61.method8506(Static213.aClass133_5);
		Static75.aClass330_5.method7911();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1268() {
		if (Static78.aBoolean117) {
			Static182.method2792();
		}
		Static248.method4100();
		if (Static213.aClass133_5 != null) {
			Static213.aClass133_5.method7295();
		}
		if (Static323.aFrame2 != null) {
			Static548.method7984(Static323.aFrame2, Static470.aClass100_14);
			Static323.aFrame2 = null;
		}
		if (Static495.aClass170_2 != null) {
			Static495.aClass170_2.method8119();
			Static495.aClass170_2 = null;
		}
		Static273.method4417();
		Static1.aClass309_7.method7418();
		Static593.aClass161_3.method3865();
		if (Static395.aClass196_1 != null) {
			Static395.aClass196_1.method4502();
			Static395.aClass196_1 = null;
		}
		try {
			Static511.aClass363_7.method8573();
			for (@Pc(63) int local63 = 0; local63 < 37; local63++) {
				Static410.aClass363Array1[local63].method8573();
			}
			Static460.aClass363_6.method8573();
			Static389.aClass363_5.method8573();
			Static368.method5445();
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1273() {
		if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != 2) {
			this.method1285();
			return;
		}
		try {
			this.method1285();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static524.method7740(local24, local24.getMessage() + " (Recovered) " + this.method1280());
			Static32.aBoolean18 = true;
			Static638.method9004(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1280() {
		@Pc(11) String local11 = null;
		try {
			local11 = "[1)" + Static565.anInt9560 + "," + Static567.anInt9589 + "," + Static326.anInt5541 + "," + Static448.anInt7637 + "|";
			if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 != null) {
				local11 = local11 + "2)" + Static636.anInt10567 + "," + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] + Static565.anInt9560) + "," + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0] + Static567.anInt9589) + "|";
			}
			local11 = local11 + "3)" + Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() + "|4)" + Static97.aClass5_Sub25_8.aClass6_Sub23_1.method7627() + "|5)" + Static138.method2022() + "|6)" + Static345.anInt5827 + "," + Static408.anInt7118 + "|";
			local11 = local11 + "7)" + Static97.aClass5_Sub25_8.aClass6_Sub17_1.method5097() + "|";
			local11 = local11 + "8)" + Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542() + "|";
			local11 = local11 + "9)" + Static97.aClass5_Sub25_8.aClass6_Sub25_1.method7878() + "|";
			local11 = local11 + "10)" + Static97.aClass5_Sub25_8.aClass6_Sub16_1.method4732() + "|";
			local11 = local11 + "11)" + Static97.aClass5_Sub25_8.aClass6_Sub3_1.method308() + "|";
			local11 = local11 + "12)" + Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() + "|";
			local11 = local11 + "13)" + Static110.anInt2065 + "|";
			local11 = local11 + "14)" + Static151.anInt2620;
			if (Static399.aClass5_Sub28_1 != null) {
				local11 = local11 + "|15)" + Static399.aClass5_Sub28_1.anInt4840;
			}
			try {
				if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 2) {
					@Pc(251) Class local251 = Class.forName("java.lang.ClassLoader");
					@Pc(255) Field local255 = local251.getDeclaredField("nativeLibraries");
					@Pc(258) Class local258 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(268) Method local268 = local258.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local268.invoke(local255, Boolean.TRUE);
					@Pc(291) Vector local291 = (Vector) local255.get(client.class.getClassLoader());
					for (@Pc(293) int local293 = 0; local293 < local291.size(); local293++) {
						try {
							@Pc(299) Object local299 = local291.elementAt(local293);
							@Pc(304) Field local304 = local299.getClass().getDeclaredField("name");
							local268.invoke(local304, Boolean.TRUE);
							try {
								@Pc(319) String local319 = (String) local304.get(local299);
								if (local319 != null && local319.indexOf("sw3d.dll") != -1) {
									@Pc(332) Field local332 = local299.getClass().getDeclaredField("handle");
									local268.invoke(local332, Boolean.TRUE);
									local11 = local11 + "|16)" + Long.toHexString(local332.getLong(local299));
									local268.invoke(local332, Boolean.FALSE);
								}
							} catch (@Pc(368) Throwable local368) {
							}
							local268.invoke(local304, Boolean.FALSE);
						} catch (@Pc(380) Throwable local380) {
						}
					}
				}
			} catch (@Pc(392) Throwable local392) {
			}
			local11 = local11 + "]";
		} catch (@Pc(403) Throwable local403) {
		}
		return local11;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1271() {
		if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != 2) {
			this.method1295();
			return;
		}
		try {
			this.method1295();
		} catch (@Pc(28) ThreadDeath local28) {
			throw local28;
		} catch (@Pc(31) Throwable local31) {
			Static524.method7740(local31, local31.getMessage() + " (Recovered) " + this.method1280());
			Static32.aBoolean18 = true;
			Static638.method9004(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1295() {
		if (Static151.anInt2620 == 14) {
			return;
		}
		@Pc(19) long local19 = Static455.method6809() / 1000000L - Static457.aLong197;
		Static457.aLong197 = Static455.method6809() / 1000000L;
		@Pc(27) boolean local27 = Static437.method6651();
		if (local27 && Static327.aBoolean403 && Static422.aClass93_3 != null) {
			Static422.aClass93_3.method6367();
		}
		if (Static283.method4496(Static151.anInt2620)) {
			if (Static89.aLong42 != 0L && Static95.method1587() > Static89.aLong42) {
				Static400.method5975(false, Static138.method2022(), Static7.anInt156, Static349.anInt5876);
			} else if (!Static213.aClass133_5.method7240() && Static283.aBoolean376) {
				Static46.method798();
			}
		}
		@Pc(87) int local87;
		@Pc(91) int local91;
		if (Static323.aFrame2 == null) {
			@Pc(73) Container local73;
			if (Static190.aFrame1 != null) {
				local73 = Static190.aFrame1;
			} else if (Static7.anApplet1 == null) {
				local73 = Static580.anApplet_Sub1_1;
			} else {
				local73 = Static7.anApplet1;
			}
			local87 = local73.getSize().width;
			local91 = local73.getSize().height;
			if (local73 == Static190.aFrame1) {
				@Pc(97) Insets local97 = Static190.aFrame1.getInsets();
				local91 -= local97.bottom + local97.top;
				local87 -= local97.left + local97.right;
			}
			if (Static312.anInt10525 != local87 || Static28.anInt359 != local91 || Static532.aBoolean663) {
				if (Static213.aClass133_5 == null || Static213.aClass133_5.method7315()) {
					Static521.method7716();
				} else {
					Static312.anInt10525 = local87;
					Static28.anInt359 = local91;
				}
				Static89.aLong42 = Static95.method1587() + 500L;
				Static532.aBoolean663 = false;
			}
		}
		if (Static323.aFrame2 != null && !Static311.aBoolean389 && Static283.method4496(Static151.anInt2620)) {
			Static400.method5975(false, Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208(), -1, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static48.aBoolean60) {
			local169 = true;
			Static48.aBoolean60 = false;
		}
		if (local169) {
			Static181.method2785();
		}
		if (Static213.aClass133_5 != null && Static213.aClass133_5.method7240() || Static138.method2022() != 1) {
			Static472.method6995();
		}
		if (Static67.method1107(Static151.anInt2620)) {
			Static296.method4645(local169);
		} else if (Static107.method9051(Static151.anInt2620)) {
			Static476.method7033();
		} else if (Static280.method4487(Static151.anInt2620)) {
			Static476.method7033();
		} else if (Static432.method6578(Static151.anInt2620)) {
			if (Static607.anInt9468 == 1) {
				if (Static93.anInt1896 < Static226.anInt10417) {
					Static93.anInt1896 = Static226.anInt10417;
				}
				local87 = (Static93.anInt1896 - Static226.anInt10417) * 50 / Static93.anInt1896;
				Static462.method6852(Static199.aClass272_7, Static174.aClass120_12.method2690(Static266.anInt4796) + "<br>(" + local87 + "%)", Static213.aClass133_5, Static281.aClass55_8, true);
			} else if (Static607.anInt9468 == 2) {
				if (Static312.anInt10527 < Static143.anInt2485) {
					Static312.anInt10527 = Static143.anInt2485;
				}
				local87 = (Static312.anInt10527 - Static143.anInt2485) * 50 / Static312.anInt10527 + 50;
				Static462.method6852(Static199.aClass272_7, Static174.aClass120_12.method2690(Static266.anInt4796) + "<br>(" + local87 + "%)", Static213.aClass133_5, Static281.aClass55_8, true);
			} else {
				Static462.method6852(Static199.aClass272_7, Static174.aClass120_12.method2690(Static266.anInt4796), Static213.aClass133_5, Static281.aClass55_8, true);
			}
		} else if (Static151.anInt2620 == 10) {
			Static205.method3554(local19);
		} else if (Static151.anInt2620 == 13) {
			Static462.method6852(Static199.aClass272_7, Static174.aClass120_14.method2690(Static266.anInt4796) + "<br>" + Static174.aClass120_15.method2690(Static266.anInt4796), Static213.aClass133_5, Static281.aClass55_8, false);
		}
		if (Static470.anInt9219 == 3) {
			for (local87 = 0; local87 < Static463.anInt7779; local87++) {
				@Pc(365) Rectangle local365 = Class4_Sub2_Sub3.aRectangleArray4[local87];
				if (Static273.aBooleanArray17[local87]) {
					Static213.aClass133_5.method7243(local365.x, -65281, local365.height, local365.y, local365.width);
				} else if (Static27.aBooleanArray2[local87]) {
					Static213.aClass133_5.method7243(local365.x, -65536, local365.height, local365.y, local365.width);
				} else {
					Static213.aClass133_5.method7243(local365.x, -16711936, local365.height, local365.y, local365.width);
				}
			}
		}
		if (Static123.method4146()) {
			Static9.method200(Static213.aClass133_5);
		}
		if (Static470.aClass100_14.aBoolean192 && Static283.method4496(Static151.anInt2620) && Static470.anInt9219 == 0 && Static138.method2022() == 1 && !local169) {
			local87 = 0;
			for (local91 = 0; local91 < Static463.anInt7779; local91++) {
				if (Static27.aBooleanArray2[local91]) {
					Static27.aBooleanArray2[local91] = false;
					Static101.aRectangleArray1[local87++] = Class4_Sub2_Sub3.aRectangleArray4[local91];
				}
			}
			try {
				if (Static428.aBoolean526) {
					Static78.method1354(local87, Static101.aRectangleArray1);
				} else {
					Static213.aClass133_5.method7246(Static101.aRectangleArray1, local87);
				}
			} catch (@Pc(478) Exception_Sub1 local478) {
			}
		} else if (!Static67.method1107(Static151.anInt2620)) {
			for (local87 = 0; local87 < Static463.anInt7779; local87++) {
				Static27.aBooleanArray2[local87] = false;
			}
			try {
				if (Static428.aBoolean526) {
					Static56.method947();
				} else {
					Static213.aClass133_5.method7316();
				}
			} catch (@Pc(511) Exception_Sub1 local511) {
				Static524.method7740(local511, local511.getMessage() + " (Recovered) " + this.method1280());
				Static638.method9004(0, false);
			}
		}
		Static302.method4723();
		local91 = Static97.aClass5_Sub25_8.aClass6_Sub15_1.method4510();
		if (local91 == 0) {
			Static314.method4821(15L);
		} else if (local91 == 1) {
			Static314.method4821(10L);
		} else if (local91 == 2) {
			Static314.method4821(5L);
		} else if (local91 == 3) {
			Static314.method4821(2L);
		}
		if (Static255.aBoolean329) {
			Static71.method1206();
		}
		if (Static97.aClass5_Sub25_8.aClass6_Sub13_1.method4101() == 1 && Static151.anInt2620 == 3 && Static337.anInt5727 != -1) {
			Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub13_1);
			Static273.method4418();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1297() {
		if (Static1.aClass309_7.anInt8593 > Static362.anInt6062) {
			Static490.aClass306_5.method7223();
			Static371.anInt6180 = (Static1.aClass309_7.anInt8593 - 1) * 50 * 5;
			if (Static371.anInt6180 > 3000) {
				Static371.anInt6180 = 3000;
			}
			if (Static1.aClass309_7.anInt8593 >= 2 && Static1.aClass309_7.anInt8592 == 6) {
				this.method1266("js5connect_outofdate");
				Static151.anInt2620 = 14;
				return;
			}
			if (Static1.aClass309_7.anInt8593 >= 4 && Static1.aClass309_7.anInt8592 == -1) {
				this.method1266("js5crc");
				Static151.anInt2620 = 14;
				return;
			}
			if (Static1.aClass309_7.anInt8593 >= 4 && Static67.method1107(Static151.anInt2620)) {
				if (Static1.aClass309_7.anInt8592 == 7 || Static1.aClass309_7.anInt8592 == 9) {
					this.method1266("js5connect_full");
				} else if (Static1.aClass309_7.anInt8592 <= 0) {
					this.method1266("js5io");
				} else if (Static45.aString18 == null) {
					this.method1266("js5connect");
				} else {
					this.method1266("js5proxy_" + Static45.aString18.trim());
				}
				Static151.anInt2620 = 14;
				return;
			}
		}
		Static362.anInt6062 = Static1.aClass309_7.anInt8593;
		if (Static371.anInt6180 > 0) {
			Static371.anInt6180--;
			return;
		}
		try {
			if (Static188.anInt9406 == 0) {
				Static400.aClass91_7 = Static490.aClass306_5.method7224(Static470.aClass100_14);
				Static188.anInt9406++;
			}
			if (Static188.anInt9406 == 1) {
				if (Static400.aClass91_7.anInt2271 == 2) {
					if (Static400.aClass91_7.anObject2 != null) {
						Static45.aString18 = (String) Static400.aClass91_7.anObject2;
					}
					this.method1283(1000);
					return;
				}
				if (Static400.aClass91_7.anInt2271 == 1) {
					Static188.anInt9406++;
				}
			}
			if (Static188.anInt9406 == 2) {
				Static55.aClass374_1 = new Class374((Socket) Static400.aClass91_7.anObject2, Static470.aClass100_14, 25000);
				@Pc(187) Class5_Sub22 local187 = new Class5_Sub22(5);
				local187.method5905(Static374.aClass293_2.anInt7773);
				local187.method5949(635);
				Static55.aClass374_1.method8911(local187.aByteArray71, 5);
				Static188.anInt9406++;
				Static266.aLong116 = Static95.method1587();
			}
			if (Static188.anInt9406 == 3) {
				if (Static67.method1107(Static151.anInt2620) || Static55.aClass374_1.method8913() > 0) {
					@Pc(230) int local230 = Static55.aClass374_1.method8915();
					if (local230 != 0) {
						this.method1283(local230);
						return;
					}
					Static188.anInt9406++;
				} else if (Static95.method1587() - Static266.aLong116 > 30000L) {
					this.method1283(1001);
					return;
				}
			}
			if (Static188.anInt9406 == 4) {
				@Pc(274) boolean local274 = Static67.method1107(Static151.anInt2620) || Static280.method4485(Static151.anInt2620) || Static535.method7883(Static151.anInt2620);
				@Pc(277) Class355[] local277 = Static584.method8433();
				@Pc(285) Class5_Sub22 local285 = new Class5_Sub22(local277.length * 4);
				Static55.aClass374_1.method8906(local285.aByteArray71.length, 0, local285.aByteArray71);
				for (@Pc(296) int local296 = 0; local296 < local277.length; local296++) {
					local277[local296].method8435(local285.method5913());
				}
				Static1.aClass309_7.method7412(!local274, Static55.aClass374_1);
				Static55.aClass374_1 = null;
				Static188.anInt9406 = 0;
				Static400.aClass91_7 = null;
			}
		} catch (@Pc(328) IOException local328) {
			this.method1283(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1299() {
		@Pc(25) int local25;
		if (Static151.anInt2620 == 7 && Static548.anInt9248 == 0) {
			if (Static456.anInt7726 > 1) {
				Static462.anInt7776 = Static126.anInt2290;
				Static456.anInt7726--;
			}
			if (!Static142.aBoolean190) {
				Static356.method5282();
			}
			for (local25 = 0; local25 < 100 && Static119.method1791(); local25++) {
			}
		}
		Static435.anInt7492++;
		Static377.method5548(null, -1, -1);
		Static138.method2020(null, -1, -1);
		Static422.method1031();
		Static126.anInt2290++;
		for (local25 = 0; local25 < Static235.anInt4322; local25++) {
			@Pc(65) Class4_Sub2_Sub1_Sub1_Sub2 local65 = Static467.aClass5_Sub3Array1[local25].aClass4_Sub2_Sub1_Sub1_Sub2_1;
			if (local65 != null) {
				@Pc(71) byte local71 = local65.aClass225_1.aByte90;
				if ((local71 & 0x1) != 0) {
					@Pc(79) int local79 = local65.method1018();
					@Pc(103) int local103;
					if ((local71 & 0x2) != 0 && local65.anInt1280 == 0 && Math.random() * 1000.0D < 10.0D) {
						local103 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(111) int local111 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local103 != 0 || local111 != 0) {
							@Pc(122) int local122 = local65.anIntArray94[0] + local103;
							if (local122 < 0) {
								local122 = 0;
							} else if (Static326.anInt5541 - local79 - 1 < local122) {
								local122 = Static326.anInt5541 - local79 - 1;
							}
							@Pc(153) int local153 = local111 + local65.anIntArray95[0];
							if (local153 < 0) {
								local153 = 0;
							} else if (local153 > Static448.anInt7637 - local79 - 1) {
								local153 = Static448.anInt7637 - local79 - 1;
							}
							@Pc(207) int local207 = Static426.method6544(local65.anIntArray94[0], local153, local79, local65.anIntArray95[0], true, local79, 0, local122, Static322.aClass352Array1[local65.aByte132], Static535.anIntArray503, -1, Static53.anIntArray72, 0, local79);
							if (local207 > 0) {
								if (local207 > 9) {
									local207 = 9;
								}
								for (@Pc(218) int local218 = 0; local218 < local207; local218++) {
									local65.anIntArray94[local218] = Static535.anIntArray503[local207 - local218 - 1];
									local65.anIntArray95[local218] = Static53.anIntArray72[local207 - local218 - 1];
									local65.aByteArray17[local218] = 1;
								}
								local65.anInt1280 = local207;
							}
						}
					}
					Static192.method2915(local65, true);
					local103 = Static641.method9010(local65);
					Static407.method6300(local65);
					Static132.method6358(local65, Static36.anInt576, Static308.anInt7114, local103);
					Static32.method413(Static36.anInt576, local65);
					Static155.method1874(local65);
				}
			}
		}
		if (Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
			if (Static254.anInt4612 == 2) {
				Static497.method7438();
			} else {
				Static218.method3708();
			}
			if (Static19.anInt277 >> 9 < 14 || Static326.anInt5541 - 14 <= Static19.anInt277 >> 9 || Static117.anInt2170 >> 9 < 14 || Static448.anInt7637 - 14 <= Static117.anInt2170 >> 9) {
				Static194.method3032();
			}
		}
		while (true) {
			@Pc(346) Class5_Sub51 local346;
			@Pc(351) Class295 local351;
			@Pc(362) Class295 local362;
			do {
				local346 = (Class5_Sub51) Static8.aClass330_31.method7911();
				if (local346 == null) {
					while (true) {
						do {
							local346 = (Class5_Sub51) Static191.aClass330_16.method7911();
							if (local346 == null) {
								while (true) {
									do {
										local346 = (Class5_Sub51) Static354.aClass330_10.method7911();
										if (local346 == null) {
											if (Static443.aClass295_14 != null) {
												Static323.method4915();
											}
											if (Static631.anInt10493 % 1500 == 0) {
												Static238.method3975();
											}
											if (Static151.anInt2620 == 7 && Static548.anInt9248 == 0) {
												Static239.method3987();
											}
											Static397.method5887();
											if (Static78.aBoolean117 && Static520.aLong224 < Static95.method1587() - 60000L) {
												Static182.method2792();
											}
											for (@Pc(520) Class4_Sub1_Sub2 local520 = (Class4_Sub1_Sub2) Static403.aClass99_8.method2045(); local520 != null; local520 = (Class4_Sub1_Sub2) Static403.aClass99_8.method2047()) {
												if ((long) local520.anInt5724 < Static95.method1587() / 1000L - 5L) {
													if (local520.aShort86 > 0) {
														Static412.method6340("", 0, local520.aString57 + Static174.aClass120_19.method2690(Static266.anInt4796), "", "", 5);
													}
													if (local520.aShort86 == 0) {
														Static412.method6340("", 0, local520.aString57 + Static174.aClass120_20.method2690(Static266.anInt4796), "", "", 5);
													}
													local520.method8713();
												}
											}
											if (Static151.anInt2620 == 7 && Static548.anInt9248 == 0) {
												if (Static495.aClass170_2 == null) {
													Static583.method8429(false);
													return;
												}
												Static152.anInt2629++;
												if (Static152.anInt2629 > 50) {
													@Pc(623) Class5_Sub48 local623 = Static16.method232(Static96.aClass46_21, Static276.aClass251_2);
													Static277.method4436(local623);
												}
												try {
													Static386.method5642();
													return;
												} catch (@Pc(630) IOException local630) {
													Static583.method8429(false);
													return;
												}
											}
											return;
										}
										local351 = local346.aClass295_19;
										if (local351.anInt8025 < 0) {
											break;
										}
										local362 = Static107.method9049(local351.anInt7944);
									} while (local362 == null || local362.aClass295Array2 == null || local351.anInt8025 >= local362.aClass295Array2.length || local362.aClass295Array2[local351.anInt8025] != local351);
									Static370.method5457(local346);
								}
							}
							local351 = local346.aClass295_19;
							if (local351.anInt8025 < 0) {
								break;
							}
							local362 = Static107.method9049(local351.anInt7944);
						} while (local362 == null || local362.aClass295Array2 == null || local351.anInt8025 >= local362.aClass295Array2.length || local351 != local362.aClass295Array2[local351.anInt8025]);
						Static370.method5457(local346);
					}
				}
				local351 = local346.aClass295_19;
				if (local351.anInt8025 < 0) {
					break;
				}
				local362 = Static107.method9049(local351.anInt7944);
			} while (local362 == null || local362.aClass295Array2 == null || local351.anInt8025 >= local362.aClass295Array2.length || local362.aClass295Array2[local351.anInt8025] != local351);
			Static370.method5457(local346);
		}
	}
}
