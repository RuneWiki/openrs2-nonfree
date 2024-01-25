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
				Static320.method5329("Argument count");
			}
			Static609.aClass66_5 = new Class66();
			Static609.aClass66_5.anInt1756 = Integer.parseInt(arg0[0]);
			Static229.aClass66_3 = new Class66();
			Static229.aClass66_3.anInt1756 = Integer.parseInt(arg0[1]);
			Static229.aClass66_2 = new Class66();
			Static229.aClass66_2.anInt1756 = Integer.parseInt(arg0[2]);
			Static235.aClass37_5 = Static466.aClass37_9;
			if (arg0[3].equals("live")) {
				Static91.aClass177_1 = Static487.aClass177_4;
			} else if (arg0[3].equals("rc")) {
				Static91.aClass177_1 = Static264.aClass177_3;
			} else if (arg0[3].equals("wip")) {
				Static91.aClass177_1 = Static250.aClass177_2;
			} else {
				Static320.method5329("modewhat");
			}
			Static204.anInt8130 = Static397.method9440(arg0[4]);
			if (Static204.anInt8130 == -1) {
				if (arg0[4].equals("english")) {
					Static204.anInt8130 = 0;
				} else if (arg0[4].equals("german")) {
					Static204.anInt8130 = 1;
				} else {
					Static320.method5329("language");
				}
			}
			Static280.aBoolean388 = false;
			Static531.aBoolean677 = false;
			if (arg0[5].equals("game0")) {
				Static551.aClass229_15 = Static19.aClass229_3;
			} else if (arg0[5].equals("game1")) {
				Static551.aClass229_15 = Static534.aClass229_16;
			} else if (arg0[5].equals("game2")) {
				Static551.aClass229_15 = Static443.aClass229_12;
			} else if (arg0[5].equals("game3")) {
				Static551.aClass229_15 = Class15_Sub3_Sub4_Sub1.lb;
			} else {
				Static320.method5329("game");
			}
			Static265.anInt5051 = 0;
			Static568.anInt9915 = 0;
			Static616.aString130 = null;
			Static113.aLong66 = 0L;
			Static234.aBoolean363 = false;
			Static185.aString42 = null;
			Static464.aBoolean611 = false;
			Static391.aBoolean553 = true;
			Static64.aBoolean69 = true;
			Static587.anInt10244 = Static551.aClass229_15.anInt6908;
			Static188.aString98 = "";
			Static167.anInt3593 = 0;
			@Pc(186) client local186 = new client();
			Static493.aClient1 = local186;
			local186.method1449(Static91.aClass177_1.method4674() + 32, Static551.aClass229_15.aString84);
			Static46.aFrame1.setLocation(40, 40);
		} catch (@Pc(209) Exception local209) {
			Static165.method3319(local209, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1450()) {
			return;
		}
		Static609.aClass66_5 = new Class66();
		Static609.aClass66_5.anInt1756 = Integer.parseInt(this.getParameter("worldid"));
		Static229.aClass66_3 = new Class66();
		Static229.aClass66_3.anInt1756 = Integer.parseInt(this.getParameter("lobbyid"));
		Static229.aClass66_3.aString22 = this.getParameter("lobbyaddress");
		Static229.aClass66_2 = new Class66();
		Static229.aClass66_2.anInt1756 = Integer.parseInt(this.getParameter("demoid"));
		Static229.aClass66_2.aString22 = this.getParameter("demoaddress");
		Static235.aClass37_5 = Static673.method9443(Integer.parseInt(this.getParameter("modewhere")));
		if (Static466.aClass37_9 == Static235.aClass37_5) {
			Static235.aClass37_5 = Static188.aClass37_8;
		} else if (!Static332.method5478(Static235.aClass37_5) && Static235.aClass37_5 != Static314.aClass37_6) {
			Static235.aClass37_5 = Static314.aClass37_6;
		}
		Static91.aClass177_1 = Static263.method4525(Integer.parseInt(this.getParameter("modewhat")));
		if (Static91.aClass177_1 != Static250.aClass177_2 && Static264.aClass177_3 != Static91.aClass177_1 && Static91.aClass177_1 != Static487.aClass177_4) {
			Static91.aClass177_1 = Static487.aClass177_4;
		}
		try {
			Static204.anInt8130 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static204.anInt8130 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static531.aBoolean677 = true;
		} else {
			Static531.aBoolean677 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static280.aBoolean388 = true;
		} else {
			Static280.aBoolean388 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static422.aBoolean577 = true;
		} else {
			Static422.aBoolean577 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static551.aClass229_15 = Static19.aClass229_3;
			} else if (local152.equals("1")) {
				Static551.aClass229_15 = Static534.aClass229_16;
			} else if (local152.equals("2")) {
				Static551.aClass229_15 = Static443.aClass229_12;
			} else if (local152.equals("3")) {
				Static551.aClass229_15 = Class15_Sub3_Sub4_Sub1.lb;
			}
		}
		try {
			Static568.anInt9915 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static568.anInt9915 = 0;
		}
		Static47.aString8 = this.getParameter("quiturl");
		Static188.aString98 = this.getParameter("settings");
		if (Static188.aString98 == null) {
			Static188.aString98 = "";
		}
		Static425.aBoolean580 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static265.anInt5051 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static265.anInt5051 = 0;
			}
		}
		Static587.anInt10244 = Integer.parseInt(this.getParameter("colourid"));
		if (Static587.anInt10244 < 0 || Static587.anInt10244 >= Static61.aColorArray1.length) {
			Static587.anInt10244 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static391.aBoolean553 = true;
			Static64.aBoolean69 = true;
		}
		@Pc(256) String local256 = this.getParameter("frombilling");
		if (local256 != null && local256.equals("true")) {
			Static234.aBoolean363 = true;
		}
		Static616.aString130 = this.getParameter("sskey");
		if (Static616.aString130 != null && Static616.aString130.length() < 2) {
			Static616.aString130 = null;
		}
		@Pc(282) String local282 = this.getParameter("force64mb");
		if (local282 != null && local282.equals("true")) {
			Static464.aBoolean611 = true;
		}
		@Pc(294) String local294 = this.getParameter("worldflags");
		if (local294 != null) {
			try {
				Static167.anInt3593 = Integer.parseInt(local294);
			} catch (@Pc(301) Exception local301) {
			}
		}
		@Pc(306) String local306 = this.getParameter("userFlow");
		if (local306 != null) {
			try {
				Static113.aLong66 = Long.parseLong(local306);
			} catch (@Pc(313) NumberFormatException local313) {
			}
		}
		Static185.aString42 = this.getParameter("additionalInfo");
		if (Static185.aString42 != null && Static185.aString42.length() > 50) {
			Static185.aString42 = null;
		}
		Static493.aClient1 = this;
		if (Static551.aClass229_15 == Static19.aClass229_3) {
			Static340.anInt6390 = 503;
			Static26.anInt458 = 765;
		} else if (Static534.aClass229_16 == Static551.aClass229_15) {
			Static26.anInt458 = 640;
			Static340.anInt6390 = 480;
		}
		this.method1451(Static340.anInt6390, Static551.aClass229_15.aString84, Static91.aClass177_1.method4674() + 32, Static26.anInt458);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1458() {
		if (Static25.aBoolean24) {
			Static394.method7234();
		}
		Static394.method7231();
		if (Static607.aClass101_15 != null) {
			Static607.aClass101_15.method8148();
		}
		if (Static102.aFrame2 != null) {
			Static536.method4062(Static96.aClass48_5, Static102.aFrame2);
			Static102.aFrame2 = null;
		}
		if (Static395.aClass207_2 != null) {
			Static395.aClass207_2.method5436();
			Static395.aClass207_2 = null;
		}
		Static578.method6241();
		Static396.aClass206_1.method5424();
		Static158.aClass46_1.method1294();
		if (Static40.aClass188_1 != null) {
			Static40.aClass188_1.method4911();
			Static40.aClass188_1 = null;
		}
		try {
			Static329.aClass141_4.method4076();
			for (@Pc(59) int local59 = 0; local59 < 37; local59++) {
				Static192.aClass141Array1[local59].method4076();
			}
			Static589.aClass141_5.method4076();
			Static274.aClass141_3.method4076();
			Static656.method9623();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1467() {
		@Pc(13) boolean local13 = Static396.aClass206_1.method5422();
		if (!local13) {
			this.method1477();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1468(@OriginalArg(1) int arg0) {
		Static396.aClass206_1.anInt6003++;
		Static370.aClass268_6 = null;
		Static145.aClass87_1 = null;
		Static139.anInt2633 = 0;
		Static396.aClass206_1.anInt6002 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method1472() {
		if (Static579.anInt10049 == 14) {
			return;
		}
		@Pc(16) long local16 = Static261.method4516() / 1000000L - Static483.aLong238;
		Static483.aLong238 = Static261.method4516() / 1000000L;
		@Pc(24) boolean local24 = Static208.method8120();
		if (local24 && Static239.aBoolean367 && Static451.aClass34_2 != null) {
			Static451.aClass34_2.method6330();
		}
		if (Static23.method434(Static579.anInt10049)) {
			if (Static258.aLong131 != 0L && Static99.method1701() > Static258.aLong131) {
				Static347.method6004(Static504.anInt8989, Static255.method4444(), Static269.anInt7062, false);
			} else if (!Static607.aClass101_15.method8110() && Static397.aBoolean791) {
				Static235.method4260();
			}
		}
		@Pc(86) int local86;
		@Pc(90) int local90;
		if (Static102.aFrame2 == null) {
			@Pc(72) Container local72;
			if (Static46.aFrame1 != null) {
				local72 = Static46.aFrame1;
			} else if (Static637.anApplet2 == null) {
				local72 = Static172.anApplet_Sub1_1;
			} else {
				local72 = Static637.anApplet2;
			}
			local86 = local72.getSize().width;
			local90 = local72.getSize().height;
			if (local72 == Static46.aFrame1) {
				@Pc(96) Insets local96 = Static46.aFrame1.getInsets();
				local90 -= local96.bottom + local96.top;
				local86 -= local96.left + local96.right;
			}
			if (local86 != Static97.anInt1735 || Static360.anInt6884 != local90 || Static101.aBoolean127) {
				if (Static607.aClass101_15 == null || Static607.aClass101_15.method8117()) {
					Static5.method98();
				} else {
					Static360.anInt6884 = local90;
					Static97.anInt1735 = local86;
				}
				Static258.aLong131 = Static99.method1701() + 500L;
				Static101.aBoolean127 = false;
			}
		}
		if (Static102.aFrame2 != null && !Static494.aBoolean638 && Static23.method434(Static579.anInt10049)) {
			Static347.method6004(-1, Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216(), -1, false);
		}
		@Pc(168) boolean local168 = false;
		if (Static328.aBoolean442) {
			local168 = true;
			Static328.aBoolean442 = false;
		}
		if (local168) {
			Static510.method7943();
		}
		if (Static607.aClass101_15 != null && Static607.aClass101_15.method8110() || Static255.method4444() != 1) {
			Static403.method6620();
		}
		if (Static64.method1178(Static579.anInt10049)) {
			Static447.method7252(local168);
		} else if (Static22.method407(Static579.anInt10049)) {
			Static667.method9094();
		} else if (Static361.method6166(Static579.anInt10049)) {
			Static667.method9094();
		} else if (Static657.method9646(Static579.anInt10049)) {
			if (Static94.anInt1685 == 1) {
				if (Static506.anInt9000 < Static147.anInt2736) {
					Static506.anInt9000 = Static147.anInt2736;
				}
				local86 = (Static506.anInt9000 - Static147.anInt2736) * 50 / Static506.anInt9000;
				Static543.method8319(Static205.aClass134_12.method3906(Static204.anInt8130) + "<br>(" + local86 + "%)", Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, true);
			} else if (Static94.anInt1685 == 2) {
				if (Static351.anInt6781 < Static524.anInt9259) {
					Static351.anInt6781 = Static524.anInt9259;
				}
				local86 = (Static351.anInt6781 - Static524.anInt9259) * 50 / Static351.anInt6781 + 50;
				Static543.method8319(Static205.aClass134_12.method3906(Static204.anInt8130) + "<br>(" + local86 + "%)", Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, true);
			} else {
				Static543.method8319(Static205.aClass134_12.method3906(Static204.anInt8130), Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, true);
			}
		} else if (Static579.anInt10049 == 10) {
			Static596.method8960(local16);
		} else if (Static579.anInt10049 == 13) {
			Static543.method8319(Static205.aClass134_14.method3906(Static204.anInt8130) + "<br>" + Static205.aClass134_15.method3906(Static204.anInt8130), Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, false);
		}
		if (Static286.anInt5256 == 3) {
			for (local86 = 0; local86 < Static254.anInt4901; local86++) {
				@Pc(363) Rectangle local363 = Class33.aRectangleArray1[local86];
				if (Static520.aBooleanArray52[local86]) {
					Static607.aClass101_15.method8103(local363.height, local363.x, -65281, local363.y, local363.width);
				} else if (Static531.aBooleanArray54[local86]) {
					Static607.aClass101_15.method8103(local363.height, local363.x, -65536, local363.y, local363.width);
				} else {
					Static607.aClass101_15.method8103(local363.height, local363.x, -16711936, local363.y, local363.width);
				}
			}
		}
		if (Static62.method1158()) {
			Static139.method2438(Static607.aClass101_15);
		}
		if (Static96.aClass48_5.aBoolean76 && Static23.method434(Static579.anInt10049) && Static286.anInt5256 == 0 && Static255.method4444() == 1 && !local168) {
			local86 = 0;
			for (local90 = 0; local90 < Static254.anInt4901; local90++) {
				if (Static531.aBooleanArray54[local90]) {
					Static531.aBooleanArray54[local90] = false;
					Static482.aRectangleArray2[local86++] = Class33.aRectangleArray1[local90];
				}
			}
			try {
				if (Static450.aBoolean606) {
					Static12.method170(local86, Static482.aRectangleArray2);
				} else {
					Static607.aClass101_15.method8075(Static482.aRectangleArray2, local86);
				}
			} catch (@Pc(479) Exception_Sub1 local479) {
			}
		} else if (!Static64.method1178(Static579.anInt10049)) {
			for (local86 = 0; local86 < Static254.anInt4901; local86++) {
				Static531.aBooleanArray54[local86] = false;
			}
			try {
				if (Static450.aBoolean606) {
					Static215.method9562();
				} else {
					Static607.aClass101_15.method8142();
				}
			} catch (@Pc(508) Exception_Sub1 local508) {
				Static165.method3319(local508, local508.getMessage() + " (Recovered) " + this.method1463());
				Static389.method6560(false, 0);
			}
		}
		Static204.method7271();
		local86 = Static230.aClass2_Sub54_15.aClass4_Sub20_1.method6428();
		if (local86 == 0) {
			Static650.method9565(15L);
		} else if (local86 == 1) {
			Static650.method9565(10L);
		} else if (local86 == 2) {
			Static650.method9565(5L);
		} else if (local86 == 3) {
			Static650.method9565(2L);
		}
		if (Static421.aBoolean575) {
			Static553.method8468();
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub7_1.method2341() == 1 && Static579.anInt10049 == 3 && Static567.anInt9844 != -1) {
			Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub7_1, 0);
			Static482.method7663();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1473() {
		if (Static579.anInt10049 == 14) {
			return;
		}
		Static62.anInt1184++;
		if (Static62.anInt1184 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static97.anInt1732 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static138.aRandom1.setSeed((long) Static97.anInt1732);
		}
		if (Static62.anInt1184 % 50 == 0) {
			Static425.anInt7809 = Static585.anInt10191;
			Static146.anInt11237 = Static599.anInt10392;
			Static585.anInt10191 = 0;
			Static599.anInt10392 = 0;
		}
		this.method1467();
		if (Static173.aClass382_1 != null) {
			Static173.aClass382_1.method9530();
		}
		Static161.method3217();
		Static414.method6776();
		Static202.aClass191_1.method8961();
		Static7.aClass6_1.method7051();
		if (Static607.aClass101_15 != null) {
			Static607.aClass101_15.method8118((int) Static99.method1701());
		}
		Static649.method9558();
		Static499.anInt8894 = 0;
		Static257.anInt4926 = 0;
		for (@Pc(94) Interface21 local94 = Static202.aClass191_1.method8962(); local94 != null; local94 = Static202.aClass191_1.method8962()) {
			@Pc(100) int local100 = local94.method5146();
			if (local100 == 2 || local100 == 3) {
				@Pc(110) char local110 = local94.method5145();
				if (Static284.method4758() && (local110 == '`' || local110 == '§' || local110 == '²')) {
					if (Static62.method1158()) {
						Static119.method2223();
					} else {
						Static358.method6132();
					}
				} else if (Static257.anInt4926 < 128) {
					Static595.anInterface21Array2[Static257.anInt4926] = local94;
					Static257.anInt4926++;
				}
			} else if (local100 == 0 && Static499.anInt8894 < 75) {
				Static190.anInterface21Array1[Static499.anInt8894] = local94;
				Static499.anInt8894++;
			}
		}
		Static511.anInt9099 = 0;
		for (@Pc(182) Class2_Sub35 local182 = Static7.aClass6_1.method7052(); local182 != null; local182 = Static7.aClass6_1.method7052()) {
			@Pc(188) int local188 = local182.method9190();
			if (local188 == -1) {
				Static588.aClass271_62.method7174(local182);
			} else if (local188 == 6) {
				Static511.anInt9099 += local182.method9191();
			} else if (Static37.method626(local188)) {
				Static489.aClass271_50.method7174(local182);
				if (Static489.aClass271_50.method7178() > 10) {
					Static489.aClass271_50.method7172();
				}
			}
		}
		if (Static62.method1158()) {
			Static218.method4045();
		}
		if (Static64.method1178(Static579.anInt10049)) {
			Static581.method8771();
			Static149.method2585();
		} else if (Static657.method9646(Static579.anInt10049)) {
			Static490.method7750();
		}
		if (Static349.method6047(Static579.anInt10049) && !Static657.method9646(Static579.anInt10049)) {
			this.method1481();
			Static557.method8502();
			Static229.method4171();
		} else if (Static43.method7854(Static579.anInt10049) && !Static657.method9646(Static579.anInt10049)) {
			this.method1481();
			Static229.method4171();
		} else if (Static579.anInt10049 == 12) {
			Static229.method4171();
		} else if (Static259.method4507(Static579.anInt10049) && !Static657.method9646(Static579.anInt10049)) {
			Static417.method6898();
		} else if (Static579.anInt10049 == 13) {
			Static229.method4171();
			if (Static434.anInt5752 != -3 && Static434.anInt5752 != 2 && Static434.anInt5752 != 15) {
				Static425.method7012(false);
			}
		}
		Static316.method5238(Static607.aClass101_15);
		Static489.aClass271_50.method7172();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	public synchronized void method1455() {
		if (Static637.anApplet2 != null && Static641.aCanvas13 == null && !Static96.aClass48_5.aBoolean76) {
			try {
				@Pc(13) Class local13 = Static637.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static641.aCanvas13 = (Canvas) local17.get(Static637.anApplet2);
				local17.set(Static637.anApplet2, (Object) null);
				if (Static641.aCanvas13 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1455();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1461() {
		if (Static464.aBoolean611) {
			Static65.anInt1229 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static5.method98();
		Static158.aClass46_1 = new Class46(Static96.aClass48_5);
		Static396.aClass206_1 = new Class206();
		Static430.method7039(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static235.aClass37_5 != Static314.aClass37_6) {
			Static663.aByteArrayArray26 = new byte[50][];
		}
		Static230.aClass2_Sub54_15 = Static617.method9231();
		if (Static235.aClass37_5 == Static314.aClass37_6) {
			Static609.aClass66_5.aString22 = this.getCodeBase().getHost();
		} else if (Static332.method5478(Static235.aClass37_5)) {
			Static609.aClass66_5.aString22 = this.getCodeBase().getHost();
			Static609.aClass66_5.anInt1755 = Static609.aClass66_5.anInt1756 + 40000;
			Static229.aClass66_3.anInt1755 = Static229.aClass66_3.anInt1756 + 40000;
			Static229.aClass66_2.anInt1755 = Static229.aClass66_2.anInt1756 + 40000;
			Static609.aClass66_5.anInt1757 = Static609.aClass66_5.anInt1756 + 50000;
			Static229.aClass66_3.anInt1757 = Static229.aClass66_3.anInt1756 + 50000;
			Static229.aClass66_2.anInt1757 = Static229.aClass66_2.anInt1756 + 50000;
		} else if (Static466.aClass37_9 == Static235.aClass37_5) {
			Static609.aClass66_5.aString22 = "127.0.0.1";
			Static229.aClass66_3.aString22 = "127.0.0.1";
			Static609.aClass66_5.anInt1755 = Static609.aClass66_5.anInt1756 + 40000;
			Static229.aClass66_2.aString22 = "127.0.0.1";
			Static229.aClass66_3.anInt1755 = Static229.aClass66_3.anInt1756 + 40000;
			Static609.aClass66_5.anInt1757 = Static609.aClass66_5.anInt1756 + 50000;
			Static229.aClass66_2.anInt1755 = Static229.aClass66_2.anInt1756 + 40000;
			Static229.aClass66_3.anInt1757 = Static229.aClass66_3.anInt1756 + 50000;
			Static229.aClass66_2.anInt1757 = Static229.aClass66_2.anInt1756 + 50000;
		}
		if (Static551.aClass229_15 == Static534.aClass229_16) {
			Static565.aShortArrayArray19 = Static570.aShortArrayArray20;
			Static440.anInt8006 = 16777215;
			Static109.aShortArrayArrayArray1 = Static122.aShortArrayArrayArray2;
			Static400.aBoolean557 = true;
			Static201.anInt4209 = 0;
		} else if (Class15_Sub3_Sub4_Sub1.lb == Static551.aClass229_15) {
			Static565.aShortArrayArray19 = Static54.aShortArrayArray2;
			Static109.aShortArrayArrayArray1 = Static227.aShortArrayArrayArray3;
		} else {
			Static109.aShortArrayArrayArray1 = Static365.aShortArrayArrayArray4;
			Static565.aShortArrayArray19 = Static667.aShortArrayArray21;
		}
		Static313.aShortArray43 = Static374.aShortArray97 = Static554.aShortArray129 = Static48.aShortArray32 = new short[256];
		Static524.aClass66_4 = Static609.aClass66_5;
		if (Static551.aClass229_15 == Static19.aClass229_3) {
			Static645.aBoolean735 = false;
		}
		try {
			Static673.aClipboard3 = Static493.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(225) Exception local225) {
		}
		Static202.aClass191_1 = Static510.method7942(Static641.aCanvas13);
		Static7.aClass6_1 = Static597.method8972(Static641.aCanvas13);
		try {
			if (Static96.aClass48_5.aClass182_1 != null) {
				Static329.aClass141_4 = new Class141(Static96.aClass48_5.aClass182_1, 5200, 0);
				for (@Pc(247) int local247 = 0; local247 < 37; local247++) {
					Static192.aClass141Array1[local247] = new Class141(Static96.aClass48_5.aClass182Array1[local247], 6000, 0);
				}
				Static589.aClass141_5 = new Class141(Static96.aClass48_5.aClass182_2, 6000, 0);
				Static30.aClass47_1 = new Class47(255, Static329.aClass141_4, Static589.aClass141_5, 500000);
				Static274.aClass141_3 = new Class141(Static96.aClass48_5.aClass182_3, 24, 0);
				Static96.aClass48_5.aClass182_1 = null;
				Static96.aClass48_5.aClass182Array1 = null;
				Static96.aClass48_5.aClass182_3 = null;
				Static96.aClass48_5.aClass182_2 = null;
			}
		} catch (@Pc(303) IOException local303) {
			Static589.aClass141_5 = null;
			Static274.aClass141_3 = null;
			Static30.aClass47_1 = null;
			Static329.aClass141_4 = null;
		}
		if (Static235.aClass37_5 != Static314.aClass37_6) {
			Static586.aBoolean742 = true;
		}
		Static168.aString46 = Static205.aClass134_12.method3906(Static204.anInt8130);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1444() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1477() {
		if (Static50.anInt1029 < Static396.aClass206_1.anInt6003) {
			Static524.aClass66_4.method1681();
			Static619.anInt10809 = (Static396.aClass206_1.anInt6003 * 50 - 50) * 5;
			if (Static619.anInt10809 > 3000) {
				Static619.anInt10809 = 3000;
			}
			if (Static396.aClass206_1.anInt6003 >= 2 && Static396.aClass206_1.anInt6002 == 6) {
				this.method1448("js5connect_outofdate");
				Static579.anInt10049 = 14;
				return;
			}
			if (Static396.aClass206_1.anInt6003 >= 4 && Static396.aClass206_1.anInt6002 == -1) {
				this.method1448("js5crc");
				Static579.anInt10049 = 14;
				return;
			}
			if (Static396.aClass206_1.anInt6003 >= 4 && Static64.method1178(Static579.anInt10049)) {
				if (Static396.aClass206_1.anInt6002 == 7 || Static396.aClass206_1.anInt6002 == 9) {
					this.method1448("js5connect_full");
				} else if (Static396.aClass206_1.anInt6002 <= 0) {
					this.method1448("js5io");
				} else if (Static570.aString116 == null) {
					this.method1448("js5connect");
				} else {
					this.method1448("js5proxy_" + Static570.aString116.trim());
				}
				Static579.anInt10049 = 14;
				return;
			}
		}
		Static50.anInt1029 = Static396.aClass206_1.anInt6003;
		if (Static619.anInt10809 > 0) {
			Static619.anInt10809--;
			return;
		}
		try {
			if (Static139.anInt2633 == 0) {
				Static370.aClass268_6 = Static524.aClass66_4.method1684(Static96.aClass48_5);
				Static139.anInt2633++;
			}
			if (Static139.anInt2633 == 1) {
				if (Static370.aClass268_6.anInt8008 == 2) {
					if (Static370.aClass268_6.anObject19 != null) {
						Static570.aString116 = (String) Static370.aClass268_6.anObject19;
					}
					this.method1468(1000);
					return;
				}
				if (Static370.aClass268_6.anInt8008 == 1) {
					Static139.anInt2633++;
				}
			}
			if (Static139.anInt2633 == 2) {
				Static145.aClass87_1 = new Class87((Socket) Static370.aClass268_6.anObject19, Static96.aClass48_5, 25000);
				@Pc(200) Class2_Sub8 local200 = new Class2_Sub8(5);
				local200.method5170(Static527.aClass361_2.anInt10749);
				local200.method5194(643);
				Static145.aClass87_1.method2259(5, local200.lb);
				Static139.anInt2633++;
				Static409.aLong206 = Static99.method1701();
			}
			if (Static139.anInt2633 == 3) {
				if (Static64.method1178(Static579.anInt10049) || Static145.aClass87_1.method2262() > 0) {
					@Pc(258) int local258 = Static145.aClass87_1.method2258();
					if (local258 != 0) {
						this.method1468(local258);
						return;
					}
					Static139.anInt2633++;
				} else if (Static99.method1701() - Static409.aLong206 > 30000L) {
					this.method1468(1001);
					return;
				}
			}
			if (Static139.anInt2633 == 4) {
				@Pc(291) boolean local291 = Static64.method1178(Static579.anInt10049) || Static349.method6047(Static579.anInt10049) || Static43.method7854(Static579.anInt10049);
				@Pc(294) Class211[] local294 = Static333.method5483();
				@Pc(302) Class2_Sub8 local302 = new Class2_Sub8(local294.length * 4);
				Static145.aClass87_1.method2255(local302.lb.length, local302.lb, 0);
				for (@Pc(313) int local313 = 0; local313 < local294.length; local313++) {
					local294[local313].method5485(local302.method5172());
				}
				Static396.aClass206_1.method5419(Static145.aClass87_1, !local291);
				Static139.anInt2633 = 0;
				Static370.aClass268_6 = null;
				Static145.aClass87_1 = null;
			}
		} catch (@Pc(345) IOException local345) {
			this.method1468(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1452() {
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != 2) {
			this.method1473();
			return;
		}
		try {
			this.method1473();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static165.method3319(local25, local25.getMessage() + " (Recovered) " + this.method1463());
			Static377.aBoolean540 = true;
			Static389.method6560(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1463() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static640.anInt11085 + "," + Static490.anInt8763 + "," + Static222.anInt4533 + "," + Static668.anInt11370 + "|";
			if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 != null) {
				local7 = local7 + "2)" + Static547.anInt9550 + "," + (Static640.anInt11085 + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0]) + "," + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0] + Static490.anInt8763) + "|";
			}
			local7 = local7 + "3)" + Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() + "|4)" + Static230.aClass2_Sub54_15.aClass4_Sub19_2.method6178() + "|5)" + Static255.method4444() + "|6)" + Static406.anInt7570 + "," + Static19.anInt352 + "|";
			local7 = local7 + "7)" + Static230.aClass2_Sub54_15.aClass4_Sub28_1.method8732() + "|";
			local7 = local7 + "8)" + Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164() + "|";
			local7 = local7 + "9)" + Static230.aClass2_Sub54_15.aClass4_Sub24_1.method7684() + "|";
			local7 = local7 + "10)" + Static230.aClass2_Sub54_15.aClass4_Sub21_1.method6610() + "|";
			local7 = local7 + "11)" + Static230.aClass2_Sub54_15.aClass4_Sub15_1.method4882() + "|";
			local7 = local7 + "12)" + Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() + "|";
			local7 = local7 + "13)" + Static65.anInt1229 + "|";
			local7 = local7 + "14)" + Static579.anInt10049;
			if (Static466.aClass2_Sub55_1 != null) {
				local7 = local7 + "|15)" + Static466.aClass2_Sub55_1.anInt11444;
			}
			try {
				if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 2) {
					@Pc(249) Class local249 = Class.forName("java.lang.ClassLoader");
					@Pc(253) Field local253 = local249.getDeclaredField("nativeLibraries");
					@Pc(256) Class local256 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(266) Method local266 = local256.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local266.invoke(local253, Boolean.TRUE);
					@Pc(289) Vector local289 = (Vector) local253.get(client.class.getClassLoader());
					for (@Pc(291) int local291 = 0; local289.size() > local291; local291++) {
						try {
							@Pc(297) Object local297 = local289.elementAt(local291);
							@Pc(302) Field local302 = local297.getClass().getDeclaredField("name");
							local266.invoke(local302, Boolean.TRUE);
							try {
								@Pc(317) String local317 = (String) local302.get(local297);
								if (local317 != null && local317.indexOf("sw3d.dll") != -1) {
									@Pc(329) Field local329 = local297.getClass().getDeclaredField("handle");
									local266.invoke(local329, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local329.getLong(local297));
									local266.invoke(local329, Boolean.FALSE);
								}
							} catch (@Pc(365) Throwable local365) {
							}
							local266.invoke(local302, Boolean.FALSE);
						} catch (@Pc(377) Throwable local377) {
						}
					}
				}
			} catch (@Pc(389) Throwable local389) {
			}
			local7 = local7 + "]";
		} catch (@Pc(400) Throwable local400) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1459() {
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != 2) {
			this.method1472();
			return;
		}
		try {
			this.method1472();
		} catch (@Pc(18) ThreadDeath local18) {
			throw local18;
		} catch (@Pc(21) Throwable local21) {
			Static165.method3319(local21, local21.getMessage() + " (Recovered) " + this.method1463());
			Static377.aBoolean540 = true;
			Static389.method6560(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1481() {
		@Pc(29) int local29;
		if (Static579.anInt10049 == 7 && Static316.anInt5770 == 0) {
			if (Static543.anInt9483 > 1) {
				Static301.anInt5476 = Static397.anInt11030;
				Static543.anInt9483--;
			}
			if (!Static183.aBoolean305) {
				Static332.method5480();
			}
			for (local29 = 0; local29 < 100 && Static95.method1631(); local29++) {
			}
		}
		Static87.anInt1634++;
		Static76.method1365(-1, (Class357) null, -1);
		Static500.method7872(-1, (Class357) null, -1);
		Static579.method8748();
		Static397.anInt11030++;
		for (local29 = 0; local29 < Static487.anInt8726; local29++) {
			@Pc(71) Class15_Sub3_Sub3_Sub1_Sub2 local71 = Static275.aClass2_Sub6Array1[local29].aClass15_Sub3_Sub3_Sub1_Sub2_1;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass312_1.aByte115;
				if ((local77 & 0x1) != 0) {
					@Pc(88) int local88 = local71.method3690();
					@Pc(115) int local115;
					if ((local77 & 0x2) != 0 && local71.anInt4039 == 0 && Math.random() * 1000.0D < 10.0D) {
						local115 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(123) int local123 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local115 != 0 || local123 != 0) {
							@Pc(137) int local137 = local71.anIntArray189[0] + local115;
							if (local137 < 0) {
								local137 = 0;
							} else if (local137 > Static222.anInt4533 - local88 - 1) {
								local137 = Static222.anInt4533 - local88 - 1;
							}
							@Pc(168) int local168 = local71.anIntArray188[0] + local123;
							if (local168 < 0) {
								local168 = 0;
							} else if (Static668.anInt11370 - local88 - 1 < local168) {
								local168 = Static668.anInt11370 - local88 - 1;
							}
							@Pc(218) int local218 = Static93.method9375(Static216.anIntArray200, local168, local137, 0, 0, Static269.anIntArray334, true, local88, local88, local71.anIntArray188[0], local71.anIntArray189[0], local88, Static196.aClass200Array1[local71.aByte142], -1);
							if (local218 > 0) {
								if (local218 > 9) {
									local218 = 9;
								}
								for (@Pc(232) int local232 = 0; local232 < local218; local232++) {
									local71.anIntArray189[local232] = Static269.anIntArray334[local218 - local232 - 1];
									local71.anIntArray188[local232] = Static216.anIntArray200[local218 - local232 - 1];
									local71.aByteArray33[local232] = 1;
								}
								local71.anInt4039 = local218;
							}
						}
					}
					Static129.method2324(true, local71);
					local115 = Static666.method9729(local71);
					Static544.method8345(local71);
					Static140.method7797(Static553.anInt9679, local71, Static670.anInt7886, local115);
					Static629.method9337(local71, Static670.anInt7886);
					Static112.method1976(local71);
				}
			}
		}
		if (Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
			if (Static484.anInt8685 == 2) {
				Static218.method4049();
			} else {
				Static460.method9469();
			}
			if (Static108.anInt1987 >> 9 < 14 || Static108.anInt1987 >> 9 >= Static222.anInt4533 - 14 || Static598.anInt10387 >> 9 < 14 || Static668.anInt11370 - 14 <= Static598.anInt10387 >> 9) {
				Static143.method2484();
			}
		}
		while (true) {
			@Pc(363) Class2_Sub45 local363;
			@Pc(368) Class357 local368;
			@Pc(379) Class357 local379;
			do {
				local363 = (Class2_Sub45) Static280.aClass271_27.method7172();
				if (local363 == null) {
					while (true) {
						do {
							local363 = (Class2_Sub45) Static165.aClass271_22.method7172();
							if (local363 == null) {
								while (true) {
									do {
										local363 = (Class2_Sub45) Static507.aClass271_51.method7172();
										if (local363 == null) {
											if (Static267.aClass357_180 != null) {
												Static136.method2392();
											}
											if (Static62.anInt1184 % 1500 == 0) {
												Static85.method1476();
											}
											if (Static579.anInt10049 == 7 && Static316.anInt5770 == 0) {
												Static584.method4097();
											}
											Static219.method4050();
											if (Static25.aBoolean24 && Static99.method1701() - 60000L > Static339.aLong167) {
												Static394.method7234();
											}
											for (@Pc(542) Class15_Sub2_Sub2 local542 = (Class15_Sub2_Sub2) Static138.aClass60_4.method1547(); local542 != null; local542 = (Class15_Sub2_Sub2) Static138.aClass60_4.method1546()) {
												if (Static99.method1701() / 1000L - 5L > (long) local542.anInt1181) {
													if (local542.aShort19 > 0) {
														Static159.method3207("", local542.aString12 + Static205.aClass134_19.method3906(Static204.anInt8130), 5, "", "", 0);
													}
													if (local542.aShort19 == 0) {
														Static159.method3207("", local542.aString12 + Static205.aClass134_20.method3906(Static204.anInt8130), 5, "", "", 0);
													}
													local542.method9741();
												}
											}
											if (Static579.anInt10049 == 7 && Static316.anInt5770 == 0) {
												if (Static395.aClass207_2 == null) {
													Static425.method7012(false);
													return;
												}
												Static312.anInt5632++;
												if (Static312.anInt5632 > 50) {
													@Pc(643) Class2_Sub52 local643 = Static311.method5098(Static536.aClass341_51, Static125.aClass179_1);
													Static38.method791(local643);
												}
												try {
													Static355.method6354();
													return;
												} catch (@Pc(650) IOException local650) {
													Static425.method7012(false);
													return;
												}
											}
											return;
										}
										local368 = local363.aClass357_131;
										if (local368.anInt10432 < 0) {
											break;
										}
										local379 = Static647.method9532(local368.anInt10449);
									} while (local379 == null || local379.aClass357Array2 == null || local368.anInt10432 >= local379.aClass357Array2.length || local368 != local379.aClass357Array2[local368.anInt10432]);
									Static518.method8031(local363);
								}
							}
							local368 = local363.aClass357_131;
							if (local368.anInt10432 < 0) {
								break;
							}
							local379 = Static647.method9532(local368.anInt10449);
						} while (local379 == null || local379.aClass357Array2 == null || local368.anInt10432 >= local379.aClass357Array2.length || local368 != local379.aClass357Array2[local368.anInt10432]);
						Static518.method8031(local363);
					}
				}
				local368 = local363.aClass357_131;
				if (local368.anInt10432 < 0) {
					break;
				}
				local379 = Static647.method9532(local368.anInt10449);
			} while (local379 == null || local379.aClass357Array2 == null || local379.aClass357Array2.length <= local368.anInt10432 || local368 != local379.aClass357Array2[local368.anInt10432]);
			Static518.method8031(local363);
		}
	}
}
