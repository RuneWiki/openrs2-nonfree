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
				Static117.method5581("Argument count");
			}
			Static12.aClass165_1 = new Class165();
			Static12.aClass165_1.anInt4240 = Integer.parseInt(arg0[0]);
			Static263.aClass165_5 = new Class165();
			Static263.aClass165_5.anInt4240 = Integer.parseInt(arg0[1]);
			Static104.aClass165_2 = new Class165();
			Static104.aClass165_2.anInt4240 = Integer.parseInt(arg0[2]);
			Static350.aClass170_10 = Static346.aClass170_9;
			if (arg0[3].equals("live")) {
				Static414.aClass172_4 = Static293.aClass172_3;
			} else if (arg0[3].equals("rc")) {
				Static414.aClass172_4 = Static229.aClass172_1;
			} else if (arg0[3].equals("wip")) {
				Static414.aClass172_4 = Static257.aClass172_2;
			} else {
				Static117.method5581("modewhat");
			}
			Static38.anInt4834 = Static325.method4000(arg0[4]);
			if (Static38.anInt4834 == -1) {
				if (arg0[4].equals("english")) {
					Static38.anInt4834 = 0;
				} else if (arg0[4].equals("german")) {
					Static38.anInt4834 = 1;
				} else {
					Static117.method5581("language");
				}
			}
			Static192.aBoolean206 = false;
			Static348.aBoolean387 = false;
			if (arg0[5].equals("game0")) {
				Static217.aClass197_2 = Static60.aClass197_1;
			} else if (arg0[5].equals("game1")) {
				Static217.aClass197_2 = Static369.aClass197_4;
			} else {
				Static117.method5581("game");
			}
			Static250.anInt4070 = 0;
			Static194.anInt3229 = 0;
			Static457.anInt7468 = Static217.aClass197_2.anInt5079;
			Static390.aBoolean424 = true;
			Static282.aBoolean288 = true;
			Static452.aString74 = "";
			Static78.aBoolean329 = false;
			@Pc(153) client local153 = new client();
			Static440.aClient1 = local153;
			local153.method872(Static217.aClass197_2.aString57, Static414.aClass172_4.method3470() + 32);
			Static34.aFrame1.setLocation(40, 40);
		} catch (@Pc(176) Exception local176) {
			Static206.method2769(null, local176);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method869() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static422.method5616();
		Static239.aClass216_5 = new Class216(Static7.aClass93_1);
		Static247.aClass87_2 = new Class87();
		if (Static289.aClass170_8 != Static350.aClass170_10) {
			Static165.aByteArrayArray8 = new byte[50][];
		}
		Static216.aClass1_Sub1_1 = new Class1_Sub1(Static7.aClass93_1);
		if (Static350.aClass170_10 == Static289.aClass170_8) {
			Static12.aClass165_1.aString50 = this.getCodeBase().getHost();
		} else if (Static396.method5144(Static350.aClass170_10)) {
			Static12.aClass165_1.aString50 = this.getCodeBase().getHost();
			Static12.aClass165_1.anInt4244 = Static12.aClass165_1.anInt4240 + 40000;
			Static263.aClass165_5.anInt4244 = Static263.aClass165_5.anInt4240 + 40000;
			Static104.aClass165_2.anInt4244 = Static104.aClass165_2.anInt4240 + 40000;
			Static12.aClass165_1.anInt4241 = Static12.aClass165_1.anInt4240 + 50000;
			Static263.aClass165_5.anInt4241 = Static263.aClass165_5.anInt4240 + 50000;
			Static104.aClass165_2.anInt4241 = Static104.aClass165_2.anInt4240 + 50000;
		} else if (Static350.aClass170_10 == Static346.aClass170_9) {
			Static12.aClass165_1.aString50 = "127.0.0.1";
			Static263.aClass165_5.aString50 = "127.0.0.1";
			Static104.aClass165_2.aString50 = "127.0.0.1";
			Static12.aClass165_1.anInt4244 = Static12.aClass165_1.anInt4240 + 40000;
			Static263.aClass165_5.anInt4244 = Static263.aClass165_5.anInt4240 + 40000;
			Static104.aClass165_2.anInt4244 = Static104.aClass165_2.anInt4240 + 40000;
			Static12.aClass165_1.anInt4241 = Static12.aClass165_1.anInt4240 + 50000;
			Static263.aClass165_5.anInt4241 = Static263.aClass165_5.anInt4240 + 50000;
			Static104.aClass165_2.anInt4241 = Static104.aClass165_2.anInt4240 + 50000;
		}
		Static239.aClass165_7 = Static12.aClass165_1;
		if (Static369.aClass197_4 == Static217.aClass197_2) {
			Static226.anInt3766 = 0;
			Static2.aBoolean506 = true;
			Static262.aShortArray72 = Static450.aShortArray114;
			Static89.aShortArray6 = Static414.aShortArray112;
			Static391.aShortArrayArray14 = Static324.aShortArrayArray11;
			Static331.anInt5294 = 16777215;
			Static227.aShortArrayArray9 = Static101.aShortArrayArray15;
		} else {
			Static89.aShortArray6 = Static53.aShortArray1;
			Static391.aShortArrayArray14 = Static379.aShortArrayArray10;
			Static262.aShortArray72 = Static247.aShortArray64;
			Static227.aShortArrayArray9 = Static436.aShortArrayArray13;
		}
		Static109.aShortArray15 = Static395.aShortArray110 = Static194.aShortArray38 = Static378.aShortArray101 = new short[256];
		if (Static60.aClass197_1 == Static217.aClass197_2) {
			Static275.aBoolean286 = false;
		}
		Static188.aClass80_1 = Static127.method1777(Static246.aCanvas2);
		Static290.aClass66_1 = Static194.method2595(Static246.aCanvas2);
		Static448.anInt7362 = Static144.anInt2596;
		try {
			if (Static7.aClass93_1.aClass139_4 != null) {
				Static253.aClass10_4 = new Class10(Static7.aClass93_1.aClass139_4, 5200, 0);
				for (@Pc(215) int local215 = 0; local215 < 30; local215++) {
					Static109.aClass10Array1[local215] = new Class10(Static7.aClass93_1.aClass139Array1[local215], 6000, 0);
				}
				Static243.aClass10_3 = new Class10(Static7.aClass93_1.aClass139_3, 6000, 0);
				Static274.aClass35_4 = new Class35(255, Static253.aClass10_4, Static243.aClass10_3, 500000);
				Static296.aClass10_5 = new Class10(Static7.aClass93_1.aClass139_2, 24, 0);
				Static7.aClass93_1.aClass139_4 = null;
				Static7.aClass93_1.aClass139_3 = null;
				Static7.aClass93_1.aClass139Array1 = null;
				Static7.aClass93_1.aClass139_2 = null;
			}
		} catch (@Pc(271) IOException local271) {
			Static296.aClass10_5 = null;
			Static253.aClass10_4 = null;
			Static243.aClass10_3 = null;
			Static274.aClass35_4 = null;
		}
		if (Static350.aClass170_10 != Static289.aClass170_8) {
			Static9.aBoolean30 = true;
		}
		if (Static217.aClass197_2 == Static60.aClass197_1) {
			Static218.aString55 = Static163.aClass198_50.method4012(Static38.anInt4834);
		} else if (Static217.aClass197_2 == Static369.aClass197_4) {
			Static218.aString55 = Static418.aClass198_114.method4012(Static38.anInt4834);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method882() {
		if (Static376.anInt6324 == 13) {
			return;
		}
		@Pc(16) long local16 = Static299.method3708() / 1000000L - Static143.aLong81;
		Static143.aLong81 = Static299.method3708() / 1000000L;
		@Pc(24) boolean local24 = Static95.method1334();
		if (local24 && Static180.aBoolean201 && Static80.aClass191_1 != null) {
			Static80.aClass191_1.method5010();
		}
		if (Static124.method1757(Static376.anInt6324)) {
			if (Static418.aLong219 != 0L && Static418.aLong219 < Static446.method5903()) {
				Static449.method5909(Static213.method2819(), false, Static216.aClass1_Sub1_1.anInt4506, Static216.aClass1_Sub1_1.anInt4508);
			} else if (!Static407.aClass200_9.method5825() && Static53.aBoolean76) {
				Static64.method998();
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		if (Static317.aFrame2 == null) {
			@Pc(74) Container local74;
			if (Static34.aFrame1 == null) {
				local74 = Static7.aClass93_1.anApplet1;
			} else {
				local74 = Static34.aFrame1;
			}
			local83 = local74.getSize().width;
			local87 = local74.getSize().height;
			if (Static34.aFrame1 == local74) {
				@Pc(93) Insets local93 = Static34.aFrame1.getInsets();
				local87 -= local93.top + local93.bottom;
				local83 -= local93.right + local93.left;
			}
			if (local83 != Static236.anInt3873 || local87 != Static273.anInt4301) {
				if (Static407.aClass200_9 == null || Static407.aClass200_9.method5853()) {
					Static422.method5616();
				} else {
					Static273.anInt4301 = local87;
					Static236.anInt3873 = local83;
				}
				Static418.aLong219 = Static446.method5903() + 500L;
			}
		}
		if (Static317.aFrame2 != null && !Static68.aBoolean96 && Static124.method1757(Static376.anInt6324)) {
			Static449.method5909(Static216.aClass1_Sub1_1.anInt4516, false, -1, -1);
		}
		@Pc(154) boolean local154 = false;
		if (Static448.aBoolean495) {
			local154 = true;
			Static448.aBoolean495 = false;
		}
		if (local154) {
			Static260.method3340();
		}
		if (Static407.aClass200_9 != null && Static407.aClass200_9.method5825() || Static213.method2819() != 1) {
			Static251.method3223();
		}
		if (Static376.anInt6324 == 0) {
			Static165.method2316(Static312.aColorArray2[Static457.anInt7468], Static422.anInt7074, Static94.aString12, Static453.aColorArray5[Static457.anInt7468], Static300.aColorArray1[Static457.anInt7468], local154);
		} else if (Static376.anInt6324 == 1) {
			Static45.method33(Static407.aClass200_9.method5825() | local154, Static453.aColorArray5[Static457.anInt7468].getRGB(), Static407.aClass200_9, Static300.aColorArray1[Static457.anInt7468].getRGB(), Static312.aColorArray2[Static457.anInt7468].getRGB(), Static56.aClass23_1);
		} else if (Static173.method2389(Static376.anInt6324)) {
			Static97.method1368();
		} else if (Static50.method795(Static376.anInt6324)) {
			Static97.method1368();
		} else if (Static175.method1913(Static376.anInt6324)) {
			if (Static192.anInt3195 == 1) {
				if (Static323.anInt5039 < Static168.anInt4861) {
					Static323.anInt5039 = Static168.anInt4861;
				}
				local83 = (Static323.anInt5039 - Static168.anInt4861) * 50 / Static323.anInt5039;
				Static255.method3305(Static428.aClass23_4, Static427.aClass198_118.method4012(Static38.anInt4834) + "<br>(" + local83 + "%)", true);
			} else if (Static192.anInt3195 == 2) {
				if (Static273.anInt4302 < Static198.anInt3281) {
					Static273.anInt4302 = Static198.anInt3281;
				}
				local83 = (Static273.anInt4302 - Static198.anInt3281) * 50 / Static273.anInt4302 + 50;
				Static255.method3305(Static428.aClass23_4, Static427.aClass198_118.method4012(Static38.anInt4834) + "<br>(" + local83 + "%)", true);
			} else {
				Static255.method3305(Static428.aClass23_4, Static427.aClass198_118.method4012(Static38.anInt4834), true);
			}
		} else if (Static376.anInt6324 == 9) {
			Static75.method1132(local16);
		} else if (Static376.anInt6324 == 12) {
			Static255.method3305(Static428.aClass23_4, Static205.aClass198_56.method4012(Static38.anInt4834) + "<br>" + Static173.aClass198_53.method4012(Static38.anInt4834), true);
		}
		if (Static342.anInt5602 == 3) {
			for (local83 = 0; local83 < Static343.anInt5618; local83++) {
				@Pc(385) Rectangle local385 = Class121.aRectangleArray1[local83];
				if (Static39.aBooleanArray3[local83]) {
					Static407.aClass200_9.method5856(local385.y, -1996553985, local385.width, local385.height, local385.x);
				} else if (Static371.aBooleanArray21[local83]) {
					Static407.aClass200_9.method5856(local385.y, -1996554240, local385.width, local385.height, local385.x);
				}
			}
		}
		if (Static382.method4965()) {
			Static258.method3327(Static407.aClass200_9);
		}
		if (Static124.method1757(Static376.anInt6324) && Static342.anInt5602 == 0 && Static213.method2819() == 1 && !local154 && Static144.aString25.equals("1.1")) {
			local83 = 0;
			for (local87 = 0; local87 < Static343.anInt5618; local87++) {
				if (Static371.aBooleanArray21[local87]) {
					Static371.aBooleanArray21[local87] = false;
					Static202.aRectangleArray2[local83++] = Class121.aRectangleArray1[local87];
				}
			}
			Static407.aClass200_9.method5877(Static202.aRectangleArray2, local83);
		} else if (Static376.anInt6324 != 0) {
			Static407.aClass200_9.method5813();
			for (local83 = 0; local83 < Static343.anInt5618; local83++) {
				Static371.aBooleanArray21[local83] = false;
			}
		}
		if (Static216.aClass1_Sub1_1.anInt4502 == 0) {
			Static140.method2004(15L);
		} else if (Static216.aClass1_Sub1_1.anInt4502 == 1) {
			Static140.method2004(10L);
		} else if (Static216.aClass1_Sub1_1.anInt4502 == 2) {
			Static140.method2004(5L);
		} else if (Static216.aClass1_Sub1_1.anInt4502 == 3) {
			Static140.method2004(2L);
		}
		if (Static234.aBoolean247) {
			Static460.method6042();
		}
		if (Static216.aClass1_Sub1_1.aBoolean309 && Static376.anInt6324 == 2 && Static199.anInt3319 != -1) {
			Static216.aClass1_Sub1_1.aBoolean309 = false;
			Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method865()) {
			return;
		}
		Static12.aClass165_1 = new Class165();
		Static12.aClass165_1.anInt4240 = Integer.parseInt(this.getParameter("worldid"));
		Static263.aClass165_5 = new Class165();
		Static263.aClass165_5.anInt4240 = Integer.parseInt(this.getParameter("lobbyid"));
		Static263.aClass165_5.aString50 = this.getParameter("lobbyaddress");
		Static104.aClass165_2 = new Class165();
		Static104.aClass165_2.anInt4240 = Integer.parseInt(this.getParameter("demoid"));
		Static104.aClass165_2.aString50 = this.getParameter("demoaddress");
		Static350.aClass170_10 = Static430.method5694(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static396.method5144(Static350.aClass170_10) && Static289.aClass170_8 != Static350.aClass170_10) {
			Static350.aClass170_10 = Static289.aClass170_8;
		}
		Static414.aClass172_4 = Static168.method3852(Integer.parseInt(this.getParameter("modewhat")));
		if (Static414.aClass172_4 != Static257.aClass172_2 && Static414.aClass172_4 != Static229.aClass172_1 && Static293.aClass172_3 != Static414.aClass172_4) {
			Static414.aClass172_4 = Static293.aClass172_3;
		}
		try {
			Static38.anInt4834 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static38.anInt4834 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static192.aBoolean206 = true;
		} else {
			Static192.aBoolean206 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static348.aBoolean387 = true;
		} else {
			Static348.aBoolean387 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static313.aBoolean402 = true;
		} else {
			Static313.aBoolean402 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static217.aClass197_2 = Static60.aClass197_1;
			} else if (local145.equals("1")) {
				Static217.aClass197_2 = Static369.aClass197_4;
			}
		}
		try {
			Static250.anInt4070 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static250.anInt4070 = 0;
		}
		Static139.aString22 = this.getParameter("quiturl");
		Static452.aString74 = this.getParameter("settings");
		if (Static452.aString74 == null) {
			Static452.aString74 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static194.anInt3229 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static194.anInt3229 = 0;
			}
		}
		Static457.anInt7468 = Integer.parseInt(this.getParameter("colourid"));
		if (Static457.anInt7468 < 0 || Static312.aColorArray2.length <= Static457.anInt7468) {
			Static457.anInt7468 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static390.aBoolean424 = true;
			Static282.aBoolean288 = true;
		}
		@Pc(226) String local226 = this.getParameter("frombilling");
		if (local226 != null && local226.equals("true")) {
			Static78.aBoolean329 = true;
		}
		if (Static217.aClass197_2 == Static60.aClass197_1) {
			Static243.anInt3934 = 503;
			Static36.anInt724 = 765;
		} else if (Static369.aClass197_4 == Static217.aClass197_2) {
			Static36.anInt724 = 640;
			Static243.anInt3934 = 480;
		}
		Static440.aClient1 = this;
		this.method871(Static414.aClass172_4.method3470() + 32, Static36.anInt724, Static243.anInt3934);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method863() {
		if (Static264.aBoolean278) {
			Static299.method3711();
		}
		if (Static407.aClass200_9 != null) {
			Static407.aClass200_9.method5827();
		}
		if (Static317.aFrame2 != null) {
			Static218.method3704(Static7.aClass93_1, Static317.aFrame2);
			Static317.aFrame2 = null;
		}
		if (Static14.aClass99_2 != null) {
			Static14.aClass99_2.method4963();
			Static14.aClass99_2 = null;
		}
		Static72.method1076();
		Static247.aClass87_2.method1864();
		Static239.aClass216_5.method4707();
		if (Static175.aClass140_2 != null) {
			Static175.aClass140_2.method2904();
			Static175.aClass140_2 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method887() {
		@Pc(12) boolean local12 = Static247.aClass87_2.method1871();
		if (!local12) {
			this.method892();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method888(@OriginalArg(1) int arg0) {
		Static247.aClass87_2.anInt2327 = arg0;
		Static138.aClass268_4 = null;
		Static268.anInt4246 = 0;
		Static329.aClass73_2 = null;
		Static247.aClass87_2.anInt2328++;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method889(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class5_Sub15 local10 = new Class5_Sub15(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(14) int local14 = local10.method5539();
					if (local14 == 0) {
						return;
					}
					if (local14 == 1) {
						@Pc(106) int[] local106 = Static456.anIntArray507 = new int[6];
						local106[0] = local10.method5598();
						local106[1] = local10.method5598();
						local106[2] = local10.method5598();
						local106[3] = local10.method5598();
						local106[4] = local10.method5598();
						local106[5] = local10.method5598();
					} else {
						@Pc(35) int local35;
						@Pc(30) int local30;
						if (local14 == 4) {
							local30 = local10.method5539();
							Static415.anIntArray471 = new int[local30];
							for (local35 = 0; local35 < local30; local35++) {
								Static415.anIntArray471[local35] = local10.method5598();
								if (Static415.anIntArray471[local35] == 65535) {
									Static415.anIntArray471[local35] = -1;
								}
							}
						} else if (local14 == 5) {
							local30 = local10.method5539();
							Static368.anIntArray426 = new int[local30];
							for (local35 = 0; local35 < local30; local35++) {
								Static368.anIntArray426[local35] = local10.method5598();
								if (Static368.anIntArray426[local35] == 65535) {
									Static368.anIntArray426[local35] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method867() {
		if (Static146.anInt2644 != 2) {
			this.method897();
			return;
		}
		try {
			this.method897();
		} catch (@Pc(12) Throwable local12) {
			Static206.method2769(local12.getMessage() + " (Recovered) " + this.method878(), local12);
			Static243.method3143(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method892() {
		if (Static43.anInt5301 < Static247.aClass87_2.anInt2328) {
			Static29.anInt561 = (Static247.aClass87_2.anInt2328 * 50 - 50) * 5;
			Static239.aClass165_7.aBoolean279 = !Static239.aClass165_7.aBoolean279;
			if (Static29.anInt561 > 3000) {
				Static29.anInt561 = 3000;
			}
			if (Static247.aClass87_2.anInt2328 >= 2 && Static247.aClass87_2.anInt2327 == 6) {
				this.method868("js5connect_outofdate");
				Static376.anInt6324 = 13;
				return;
			}
			if (Static247.aClass87_2.anInt2328 >= 4 && Static247.aClass87_2.anInt2327 == -1) {
				this.method868("js5crc");
				Static376.anInt6324 = 13;
				return;
			}
			if (Static247.aClass87_2.anInt2328 >= 4 && Static302.method3768(Static376.anInt6324)) {
				if (Static247.aClass87_2.anInt2327 == 7 || Static247.aClass87_2.anInt2327 == 9) {
					this.method868("js5connect_full");
				} else if (Static247.aClass87_2.anInt2327 <= 0) {
					this.method868("js5io");
				} else {
					this.method868("js5connect");
				}
				Static376.anInt6324 = 13;
				return;
			}
		}
		Static43.anInt5301 = Static247.aClass87_2.anInt2328;
		if (Static29.anInt561 > 0) {
			Static29.anInt561--;
			return;
		}
		try {
			if (Static268.anInt4246 == 0) {
				Static138.aClass268_4 = Static7.aClass93_1.method2088(Static239.aClass165_7.method3381(), Static239.aClass165_7.aString50);
				Static268.anInt4246++;
			}
			if (Static268.anInt4246 == 1) {
				if (Static138.aClass268_4.anInt7420 == 2) {
					this.method888(1000);
					return;
				}
				if (Static138.aClass268_4.anInt7420 == 1) {
					Static268.anInt4246++;
				}
			}
			if (Static268.anInt4246 == 2) {
				Static329.aClass73_2 = new Class73((Socket) Static138.aClass268_4.anObject10, Static7.aClass93_1);
				@Pc(185) Class5_Sub15 local185 = new Class5_Sub15(5);
				local185.method5583(Static316.aClass210_2.anInt5855);
				local185.method5550(602);
				Static329.aClass73_2.method1555(5, local185.aByteArray93);
				Static268.anInt4246++;
				Static343.aLong170 = Static446.method5903();
			}
			if (Static268.anInt4246 == 3) {
				if (Static302.method3768(Static376.anInt6324) || Static329.aClass73_2.method1564() > 0) {
					@Pc(223) int local223 = Static329.aClass73_2.method1561();
					if (local223 != 0) {
						this.method888(local223);
						return;
					}
					Static268.anInt4246++;
				} else if (Static446.method5903() - Static343.aLong170 > 30000L) {
					this.method888(1001);
					return;
				}
			}
			if (Static268.anInt4246 == 4) {
				@Pc(279) boolean local279 = Static376.anInt6324 == 1 || Static112.method1554(Static376.anInt6324) || Static67.method1032(Static376.anInt6324);
				Static247.aClass87_2.method1870(Static329.aClass73_2, !local279);
				Static268.anInt4246 = 0;
				Static138.aClass268_4 = null;
				Static329.aClass73_2 = null;
			}
		} catch (@Pc(296) IOException local296) {
			this.method888(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method866() {
		if (Static146.anInt2644 != 2) {
			this.method882();
			return;
		}
		try {
			this.method882();
		} catch (@Pc(28) Throwable local28) {
			Static206.method2769(local28.getMessage() + " (Recovered) " + this.method878(), local28);
			Static243.method3143(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method879() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method878() {
		@Pc(13) String local13 = null;
		try {
			local13 = "[1)" + Static31.anInt618 + "," + Static226.anInt3768 + "," + Static433.anInt7210 + "," + Static418.anInt6969 + "|";
			if (Static220.aClass2_Sub1_Sub3_Sub2_1 != null) {
				local13 = local13 + "2)" + Static6.anInt131 + "," + (Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] + Static31.anInt618) + "," + (Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0] + Static226.anInt3768) + "|";
			}
			local13 = local13 + "3)" + Static146.anInt2644 + "|4)" + Static216.aClass1_Sub1_1.anInt4518 + "|5)" + Static213.method2819() + "|6)" + Static178.anInt5792 + "," + Static102.anInt1723 + "|";
			local13 = local13 + "7)" + Static216.aClass1_Sub1_1.method3579(Static146.anInt2644) + "|";
			local13 = local13 + "8)" + Static216.aClass1_Sub1_1.method3580(Static146.anInt2644) + "|";
			local13 = local13 + "9)" + Static216.aClass1_Sub1_1.aBoolean306 + "|";
			local13 = local13 + "10)" + Static216.aClass1_Sub1_1.aBoolean312 + "|";
			local13 = local13 + "11)" + Static216.aClass1_Sub1_1.aBoolean304 + "|";
			local13 = local13 + "12)" + Static216.aClass1_Sub1_1.method3587(Static146.anInt2644) + "|";
			local13 = local13 + "13)" + Static102.anInt1724 + "|";
			local13 = local13 + "14)" + Static376.anInt6324;
			try {
				local13 = local13 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(228) Throwable local228) {
			}
			try {
				if (Static146.anInt2644 == 2) {
					@Pc(236) Class local236 = Class.forName("java.lang.ClassLoader");
					@Pc(240) Field local240 = local236.getDeclaredField("nativeLibraries");
					@Pc(243) Class local243 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(253) Method local253 = local243.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local253.invoke(local240, Boolean.TRUE);
					@Pc(276) Vector local276 = (Vector) local240.get(client.class.getClassLoader());
					for (@Pc(278) int local278 = 0; local276.size() > local278; local278++) {
						try {
							@Pc(284) Object local284 = local276.elementAt(local278);
							@Pc(289) Field local289 = local284.getClass().getDeclaredField("name");
							local253.invoke(local289, Boolean.TRUE);
							try {
								@Pc(304) String local304 = (String) local289.get(local284);
								if (local304 != null && local304.indexOf("sw3d.dll") != -1) {
									@Pc(316) Field local316 = local284.getClass().getDeclaredField("handle");
									local253.invoke(local316, Boolean.TRUE);
									local13 = local13 + "|16)" + Long.toHexString(local316.getLong(local284));
									local253.invoke(local316, Boolean.FALSE);
								}
							} catch (@Pc(352) Throwable local352) {
							}
							local253.invoke(local289, Boolean.FALSE);
						} catch (@Pc(364) Throwable local364) {
						}
					}
				}
			} catch (@Pc(376) Throwable local376) {
			}
			local13 = local13 + "]";
		} catch (@Pc(387) Throwable local387) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method896() {
		@Pc(10) int local10;
		if (!Static216.aClass1_Sub1_1.aBoolean309) {
			for (local10 = 0; local10 < Static323.anInt5038; local10++) {
				if (Static162.anInterface10Array2[local10].method1253() == 's' || Static162.anInterface10Array2[local10].method1253() == 'S') {
					Static216.aClass1_Sub1_1.aBoolean309 = true;
					break;
				}
			}
		}
		@Pc(59) int local59;
		if (Static11.anInt233 == 0) {
			@Pc(50) Runtime local50 = Runtime.getRuntime();
			local59 = (int) ((local50.totalMemory() - local50.freeMemory()) / 1024L);
			@Pc(62) long local62 = Static446.method5903();
			if (Static402.aLong208 == 0L) {
				Static402.aLong208 = local62;
			}
			if (local59 > 16384 && local62 - Static402.aLong208 < 5000L) {
				if (local62 - Static266.aLong146 > 1000L) {
					System.gc();
					Static266.aLong146 = local62;
				}
				Static94.aString12 = Static34.aClass198_8.method4012(Static38.anInt4834);
				Static422.anInt7074 = 5;
			} else {
				Static94.aString12 = Static167.aClass198_51.method4012(Static38.anInt4834);
				Static11.anInt233 = 10;
				Static422.anInt7074 = 5;
			}
		} else if (Static11.anInt233 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static163.aClass240Array1[local10] = Static121.method1715(Static433.anInt7210, Static418.anInt6969);
			}
			Static94.aString12 = Static340.aClass198_100.method4012(Static38.anInt4834);
			Static422.anInt7074 = 10;
			Static11.anInt233 = 20;
		} else if (Static11.anInt233 == 20) {
			if (Static19.aClass160_1 == null) {
				Static19.aClass160_1 = new Class160(Static247.aClass87_2, Static239.aClass216_5);
			}
			if (Static19.aClass160_1.method3317()) {
				Static242.aClass243_133 = Static299.method3709(false, 0, true);
				Static297.aClass243_162 = Static299.method3709(false, 1, true);
				Static322.aClass243_181 = Static299.method3709(false, 2, true);
				Static324.aClass243_183 = Static299.method3709(false, 3, true);
				Static318.aClass243_176 = Static299.method3709(false, 4, true);
				Static71.aClass243_255 = Static299.method3709(true, 5, true);
				Static451.aClass243_252 = Static299.method3709(true, 6, false);
				Static265.aClass243_145 = Static299.method3709(false, 7, true);
				Static344.aClass243_196 = Static299.method3709(false, 8, true);
				Static191.aClass243_108 = Static299.method3709(false, 9, true);
				Static110.aClass243_64 = Static299.method3709(false, 10, true);
				Static183.aClass243_101 = Static299.method3709(false, 11, true);
				Static29.aClass243_24 = Static299.method3709(false, 12, true);
				Static281.aClass243_250 = Static299.method3709(false, 13, true);
				Static448.aClass243_248 = Static299.method3709(false, 14, false);
				Static107.aClass243_62 = Static299.method3709(false, 15, true);
				Static136.aClass243_256 = Static299.method3709(false, 16, true);
				Static373.aClass243_217 = Static299.method3709(false, 17, true);
				Static415.aClass243_237 = Static299.method3709(false, 18, true);
				Static125.aClass243_70 = Static299.method3709(false, 19, true);
				Static204.aClass243_115 = Static299.method3709(false, 20, true);
				Static5.aClass243_4 = Static299.method3709(false, 21, true);
				Static183.aClass243_102 = Static299.method3709(false, 22, true);
				Static129.aClass243_72 = Static299.method3709(true, 23, true);
				Static366.aClass243_209 = Static299.method3709(false, 24, true);
				Static353.aClass243_201 = Static299.method3709(false, 25, true);
				Static228.aClass243_124 = Static299.method3709(true, 26, true);
				Static291.aClass243_159 = Static299.method3709(false, 27, true);
				Static125.aClass243_69 = Static299.method3709(true, 28, true);
				Static73.aClass243_45 = Static299.method3709(false, 29, true);
				Static94.aString12 = Static304.aClass198_89.method4012(Static38.anInt4834);
				Static11.anInt233 = 30;
				Static422.anInt7074 = 15;
			} else {
				Static94.aString12 = Static371.aClass198_105.method4012(Static38.anInt4834);
				Static422.anInt7074 = 12;
			}
		} else if (Static11.anInt233 == 30) {
			local10 = 0;
			for (local59 = 0; local59 < 30; local59++) {
				local10 += Static198.aClass104_Sub1Array1[local59].method2265() * Static34.anIntArray26[local59] / 100;
			}
			if (local10 == 100) {
				Static94.aString12 = Static410.aClass198_113.method4012(Static38.anInt4834);
				Static422.anInt7074 = 20;
				Static119.method2855(Static344.aClass243_196);
				Static93.method1323(Static344.aClass243_196);
				Static11.anInt233 = 40;
			} else {
				if (local10 != 0) {
					Static94.aString12 = Static426.aClass198_117.method4012(Static38.anInt4834) + local10 + "%";
				}
				Static422.anInt7074 = 20;
			}
		} else if (Static11.anInt233 == 40) {
			if (Static125.aClass243_69.method5466()) {
				this.method889(Static125.aClass243_69.method5459(1));
				Static94.aString12 = Static248.aClass198_68.method4012(Static38.anInt4834);
				Static11.anInt233 = 50;
				Static422.anInt7074 = 25;
			} else {
				Static94.aString12 = Static114.aClass198_29.method4012(Static38.anInt4834) + Static125.aClass243_69.method5480() + "%";
				Static422.anInt7074 = 25;
			}
		} else if (Static11.anInt233 == 50) {
			Static299.method3710();
			Static94.aString12 = Static445.aClass198_45.method4012(Static38.anInt4834);
			Static11.anInt233 = 60;
			Static422.anInt7074 = 30;
		} else if (Static11.anInt233 == 60) {
			local10 = Static184.method2513(Static281.aClass243_250, Static344.aClass243_196);
			local59 = Static30.method476();
			if (local59 > local10) {
				Static94.aString12 = Static128.aClass198_32.method4012(Static38.anInt4834) + local10 * 100 / local59 + "%";
				Static422.anInt7074 = 35;
			} else {
				Static94.aString12 = Static49.aClass198_15.method4012(Static38.anInt4834);
				Static11.anInt233 = 70;
				Static422.anInt7074 = 35;
			}
		} else if (Static11.anInt233 == 70) {
			local10 = Static110.method1504(Static344.aClass243_196);
			local59 = Static62.method989();
			if (local59 > local10) {
				Static94.aString12 = Static266.aClass198_87.method4012(Static38.anInt4834) + local10 * 100 / local59 + "%";
				Static422.anInt7074 = 40;
			} else {
				Static94.aString12 = Static331.aClass198_95.method4012(Static38.anInt4834);
				Static11.anInt233 = 80;
				Static422.anInt7074 = 40;
			}
		} else if (Static11.anInt233 == 80) {
			if (Static228.aClass243_124.method5466()) {
				Static71.anInterface8_138 = new Class199(Static228.aClass243_124, Static191.aClass243_108, Static344.aClass243_196);
				Static94.aString12 = Static15.aClass198_4.method4012(Static38.anInt4834);
				Static11.anInt233 = 90;
				Static422.anInt7074 = 45;
			} else {
				Static94.aString12 = Static246.aClass198_67.method4012(Static38.anInt4834) + Static228.aClass243_124.method5480() + "%";
				Static422.anInt7074 = 45;
			}
		} else if (Static11.anInt233 == 90) {
			Static94.aString12 = Static429.aClass198_122.method4012(Static38.anInt4834);
			Static422.anInt7074 = 50;
			Static11.anInt233 = 95;
		} else if (Static11.anInt233 == 95) {
			if (Static216.aClass1_Sub1_1.aBoolean309) {
				Static216.aClass1_Sub1_1.anInt4503 = 0;
				Static216.aClass1_Sub1_1.anInt4516 = 1;
				Static216.aClass1_Sub1_1.anInt4510 = 0;
				Static216.aClass1_Sub1_1.anInt4518 = 0;
				Static216.aClass1_Sub1_1.anInt4514 = 0;
			}
			Static216.aClass1_Sub1_1.aBoolean309 = true;
			Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
			Static136.method6010(Static216.aClass1_Sub1_1.anInt4514, false);
			Static94.aString12 = Static49.aClass198_14.method4012(Static38.anInt4834);
			Static11.anInt233 = 100;
			Static422.anInt7074 = 55;
		} else if (Static11.anInt233 == 100) {
			Static338.method4371(Static407.aClass200_9, Static344.aClass243_196, Static281.aClass243_250);
			Static94.aString12 = Static142.aClass198_40.method4012(Static38.anInt4834);
			Static422.anInt7074 = 60;
			Static407.method5394(1);
			Static11.anInt233 = 110;
		} else if (Static11.anInt233 == 110) {
			Static322.aClass243_181.method5466();
			local10 = Static322.aClass243_181.method5480();
			Static136.aClass243_256.method5466();
			local10 += Static136.aClass243_256.method5480();
			Static373.aClass243_217.method5466();
			local10 += Static373.aClass243_217.method5480();
			Static415.aClass243_237.method5466();
			local10 += Static415.aClass243_237.method5480();
			Static125.aClass243_70.method5466();
			local10 += Static125.aClass243_70.method5480();
			Static204.aClass243_115.method5466();
			local10 += Static204.aClass243_115.method5480();
			Static5.aClass243_4.method5466();
			local10 += Static5.aClass243_4.method5480();
			Static183.aClass243_102.method5466();
			local10 += Static183.aClass243_102.method5480();
			Static366.aClass243_209.method5466();
			local10 += Static366.aClass243_209.method5480();
			Static353.aClass243_201.method5466();
			local10 += Static353.aClass243_201.method5480();
			Static291.aClass243_159.method5466();
			local10 += Static291.aClass243_159.method5480();
			Static73.aClass243_45.method5466();
			local10 += Static73.aClass243_45.method5480();
			if (local10 < 1200) {
				Static94.aString12 = Static106.aClass198_123.method4012(Static38.anInt4834) + local10 / 12 + "%";
				Static422.anInt7074 = 65;
			} else {
				Static1.aClass33_3 = new Class33(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static27.aClass149_1 = new Class149(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static272.aClass171_2 = new Class171(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181, Static344.aClass243_196);
				Static418.aClass189_1 = new Class189(Static217.aClass197_2, Static38.anInt4834, Static373.aClass243_217);
				Static104.aClass117_2 = new Class117(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static179.aClass116_3 = new Class116(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static391.aClass120_2 = new Class120(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181, Static265.aClass243_145);
				Static430.aClass232_1 = new Class232(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static227.aClass265_1 = new Class265(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static398.aClass256_4 = new Class256(Static217.aClass197_2, Static38.anInt4834, true, Static136.aClass243_256, Static265.aClass243_145);
				Static404.aClass28_4 = new Class28(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181, Static344.aClass243_196);
				Static203.aClass51_4 = new Class51(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181, Static344.aClass243_196);
				Static196.aClass180_1 = new Class180(Static217.aClass197_2, Static38.anInt4834, true, Static415.aClass243_237, Static265.aClass243_145);
				Static306.aClass67_3 = new Class67(Static217.aClass197_2, Static38.anInt4834, true, Static1.aClass33_3, Static125.aClass243_70, Static265.aClass243_145);
				Static237.aClass249_4 = new Class249(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static271.aClass219_4 = new Class219(Static217.aClass197_2, Static38.anInt4834, Static204.aClass243_115, Static242.aClass243_133, Static297.aClass243_162);
				Static42.aClass235_1 = new Class235(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static420.aClass175_2 = new Class175(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static3.aClass203_1 = new Class203(Static217.aClass197_2, Static38.anInt4834, Static5.aClass243_4, Static265.aClass243_145);
				Static294.aClass58_1 = new Class58(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static379.aClass82_4 = new Class82(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static345.aClass68_1 = new Class68(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static275.aClass254_1 = new Class254(Static217.aClass197_2, Static38.anInt4834, Static183.aClass243_102);
				Static309.aClass46_1 = new Class46(Static217.aClass197_2, Static38.anInt4834, Static322.aClass243_181);
				Static255.method3308(Static324.aClass243_183, Static265.aClass243_145, Static344.aClass243_196, Static281.aClass243_250);
				Static124.method1756(Static73.aClass243_45);
				Static414.aClass223_1 = new Class223(Static38.anInt4834, Static366.aClass243_209, Static353.aClass243_201);
				Static407.aClass20_2 = new Class20(Static38.anInt4834, Static366.aClass243_209, Static353.aClass243_201, new Class41());
				Static94.aString12 = Static429.aClass198_121.method4012(Static38.anInt4834);
				Static422.anInt7074 = 65;
				Static301.method3743();
				Static398.aClass256_4.method5779(!Static216.aClass1_Sub1_1.method3587(Static146.anInt2644));
				Static408.aClass39_1 = new Class39();
				Static287.method3551();
				Static62.method973(Static291.aClass243_159);
				Static359.method4643(Static265.aClass243_145, Static71.anInterface8_138);
				Static11.anInt233 = 120;
			}
		} else if (Static11.anInt233 == 120) {
			local10 = Static294.method3669(Static344.aClass243_196);
			local59 = Static55.method884();
			if (local10 < local59) {
				Static94.aString12 = Static133.aClass198_34.method4012(Static38.anInt4834) + local10 * 100 / local59 + "%";
				Static422.anInt7074 = 70;
			} else {
				Static257.method3314(Static407.aClass200_9, Static344.aClass243_196);
				Static9.method160(Static107.aClass49Array5);
				Static94.aString12 = Static279.aClass198_75.method4012(Static38.anInt4834);
				Static422.anInt7074 = 70;
				Static11.anInt233 = 130;
			}
		} else if (Static11.anInt233 == 130) {
			if (Static110.aClass243_64.method5469("huffman", "")) {
				@Pc(1249) Class71 local1249 = new Class71(Static110.aClass243_64.method5462("", "huffman"));
				Static422.method5607(local1249);
				Static94.aString12 = Static289.aClass198_78.method4012(Static38.anInt4834);
				Static422.anInt7074 = 75;
				Static11.anInt233 = 140;
			} else {
				Static94.aString12 = Static147.aClass198_47.method4012(Static38.anInt4834) + "0%";
				Static422.anInt7074 = 75;
			}
		} else if (Static11.anInt233 == 140) {
			if (Static324.aClass243_183.method5466()) {
				Static94.aString12 = Static400.aClass198_110.method4012(Static38.anInt4834);
				Static11.anInt233 = 150;
				Static422.anInt7074 = 80;
			} else {
				Static94.aString12 = Static314.aClass198_91.method4012(Static38.anInt4834) + Static324.aClass243_183.method5480() + "%";
				Static422.anInt7074 = 80;
			}
		} else if (Static11.anInt233 == 150) {
			if (Static29.aClass243_24.method5466()) {
				Static94.aString12 = Static23.aClass198_7.method4012(Static38.anInt4834);
				Static422.anInt7074 = 82;
				Static11.anInt233 = 160;
			} else {
				Static94.aString12 = Static459.aClass198_88.method4012(Static38.anInt4834) + Static29.aClass243_24.method5480() + "%";
				Static422.anInt7074 = 82;
			}
		} else if (Static11.anInt233 == 160) {
			if (Static281.aClass243_250.method5466()) {
				Static94.aString12 = Static371.aClass198_106.method4012(Static38.anInt4834);
				Static422.anInt7074 = 85;
				Static11.anInt233 = 170;
			} else {
				Static94.aString12 = Static371.aClass198_106.method4012(Static38.anInt4834) + Static281.aClass243_250.method5480() + "%";
				Static422.anInt7074 = 85;
			}
		} else if (Static11.anInt233 == 170) {
			if (Static129.aClass243_72.method5474("details")) {
				Static98.method2673(Static129.aClass243_72, Static104.aClass117_2, Static179.aClass116_3, Static398.aClass256_4, Static404.aClass28_4, Static203.aClass51_4, Static408.aClass39_1);
				Static94.aString12 = Static120.aClass198_31.method4012(Static38.anInt4834);
				Static422.anInt7074 = 89;
				Static11.anInt233 = 190;
			} else {
				Static94.aString12 = Static343.aClass198_101.method4012(Static38.anInt4834) + Static129.aClass243_72.method5453("details") + "%";
				Static422.anInt7074 = 87;
			}
		} else if (Static11.anInt233 == 190) {
			Static174.anIntArray171 = new int[Static345.aClass68_1.anInt1804];
			Static14.aBooleanArray2 = new boolean[Static345.aClass68_1.anInt1804];
			Static124.aStringArray15 = new String[Static379.aClass82_4.anInt2203];
			for (local10 = 0; local10 < Static345.aClass68_1.anInt1804; local10++) {
				if (Static345.aClass68_1.method1480(local10).anInt345 == 0) {
					Static14.aBooleanArray2[local10] = true;
					Static238.anInt3883++;
				}
				Static174.anIntArray171[local10] = -1;
			}
			Static3.method37();
			Static433.anInt7212 = Static324.aClass243_183.method5461("loginscreen");
			Static121.anInt2155 = Static324.aClass243_183.method5461("lobbyscreen");
			Static71.aClass243_255.method5450(false);
			Static451.aClass243_252.method5450(true);
			Static344.aClass243_196.method5450(true);
			Static281.aClass243_250.method5450(true);
			Static110.aClass243_64.method5450(true);
			Static324.aClass243_183.method5450(true);
			Static234.aBoolean247 = true;
			Static322.aClass243_181.anInt6915 = 2;
			Static373.aClass243_217.anInt6915 = 2;
			Static136.aClass243_256.anInt6915 = 2;
			Static415.aClass243_237.anInt6915 = 2;
			Static125.aClass243_70.anInt6915 = 2;
			Static204.aClass243_115.anInt6915 = 2;
			Static5.aClass243_4.anInt6915 = 2;
			Static449.method5909(Static216.aClass1_Sub1_1.anInt4516, false, -1, -1);
			Static94.aString12 = Static387.aClass198_108.method4012(Static38.anInt4834);
			Static11.anInt233 = 200;
			Static422.anInt7074 = 95;
		} else if (Static11.anInt233 == 200) {
			Static407.method5394(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method897() {
		if (Static376.anInt6324 == 13) {
			return;
		}
		Static85.anInt1536++;
		if (Static85.anInt1536 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static209.anInt3495 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static393.aRandom3.setSeed((long) Static209.anInt3495);
		}
		if (Static85.anInt1536 % 50 == 0) {
			Static256.anInt4160 = Static95.anInt1636;
			Static451.anInt7414 = Static237.anInt6789;
			Static95.anInt1636 = 0;
			Static237.anInt6789 = 0;
		}
		this.method887();
		if (Static19.aClass160_1 != null) {
			Static19.aClass160_1.method3316();
		}
		Static457.method6000();
		Static188.aClass80_1.method1729();
		Static290.aClass66_1.method5973();
		if (Static407.aClass200_9 != null) {
			Static407.aClass200_9.method5854((int) Static446.method5903());
		}
		Static194.method2596();
		Static323.anInt5038 = 0;
		Static409.anInt6824 = 0;
		for (@Pc(96) Interface10 local96 = Static188.aClass80_1.method1725(); local96 != null; local96 = Static188.aClass80_1.method1725()) {
			@Pc(102) int local102 = local96.method1252();
			if (local102 == 2 || local102 == 3) {
				@Pc(112) char local112 = local96.method1253();
				if (Static113.method1560() && (local112 == '`' || local112 == '§')) {
					if (Static382.method4965()) {
						Static357.method4636();
					} else {
						Static378.method4939();
					}
				} else if (Static323.anInt5038 < 128) {
					Static162.anInterface10Array2[Static323.anInt5038] = local96;
					Static323.anInt5038++;
				}
			} else if (local102 == 0 && Static409.anInt6824 < 75) {
				Static122.anInterface10Array1[Static409.anInt6824] = local96;
				Static409.anInt6824++;
			}
		}
		Static104.anInt1776 = 0;
		for (@Pc(176) Class5_Sub4 local176 = Static290.aClass66_1.method5963(); local176 != null; local176 = Static290.aClass66_1.method5963()) {
			@Pc(182) int local182 = local176.method3834();
			if (local182 == -1) {
				Static444.aClass177_49.method3615(local176);
			} else if (local182 == 6) {
				Static104.anInt1776 += local176.method3832();
			} else if (Static343.method4461(local182)) {
				Static362.aClass177_33.method3615(local176);
				if (Static362.aClass177_33.method3620() > 10) {
					Static362.aClass177_33.method3621();
				}
			}
		}
		if (Static382.method4965()) {
			Static382.method4967();
		}
		if (Static376.anInt6324 == 0) {
			this.method896();
			Static262.method3350();
		} else if (Static376.anInt6324 == 1) {
			this.method896();
			Static262.method3350();
		} else if (Static175.method1913(Static376.anInt6324)) {
			Static219.method2890();
		}
		if (Static112.method1554(Static376.anInt6324) && !Static175.method1913(Static376.anInt6324)) {
			this.method898();
			Static227.method2988();
			Static76.method1135();
		} else if (Static67.method1032(Static376.anInt6324) && !Static175.method1913(Static376.anInt6324)) {
			this.method898();
			Static76.method1135();
		} else if (Static376.anInt6324 == 11) {
			Static76.method1135();
		} else if (Static99.method1399(Static376.anInt6324) && !Static175.method1913(Static376.anInt6324)) {
			Static257.method3318();
		} else if (Static376.anInt6324 == 12) {
			Static76.method1135();
			if (Static80.anInt1417 != -3 && Static80.anInt1417 != 2 && Static80.anInt1417 != 15) {
				Static165.method2317(false);
			}
		}
		Static12.method190(Static407.aClass200_9);
		Static362.aClass177_33.method3621();
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method898() {
		@Pc(25) int local25;
		if (Static376.anInt6324 == 6 && Static51.anInt913 == 0) {
			if (Static227.anInt3788 > 1) {
				Static460.anInt7523 = Static319.anInt4969;
				Static227.anInt3788--;
			}
			if (!Static272.aBoolean283) {
				Static2.method6028();
			}
			for (local25 = 0; local25 < 100 && Static280.method3471(); local25++) {
			}
		}
		Static173.anInt2946++;
		Static348.method4520(-1, -1, null);
		Static277.method3449(-1, -1, null);
		Static233.method3037();
		Static319.anInt4969++;
		for (local25 = 0; local25 < Static111.anInt1879; local25++) {
			@Pc(67) Class2_Sub1_Sub3_Sub1 local67 = Static277.aClass5_Sub7Array1[local25].aClass2_Sub1_Sub3_Sub1_1;
			if (local67 != null) {
				@Pc(73) byte local73 = local67.aClass131_1.aByte41;
				if ((local73 & 0x1) != 0) {
					@Pc(81) int local81 = local67.method4913();
					@Pc(105) int local105;
					if ((local73 & 0x2) != 0 && local67.anInt6199 == 0 && Math.random() * 1000.0D < 10.0D) {
						local105 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(113) int local113 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local105 != 0 || local113 != 0) {
							@Pc(127) int local127 = local105 + local67.anIntArray434[0];
							@Pc(134) int local134 = local67.anIntArray433[0] + local113;
							if (local127 < 0) {
								local127 = 0;
							} else if (local127 > Static433.anInt7210 - local81 - 1) {
								local127 = Static433.anInt7210 - local81 - 1;
							}
							if (local134 < 0) {
								local134 = 0;
							} else if (local134 > Static418.anInt6969 - local81 - 1) {
								local134 = Static418.anInt6969 - local81 - 1;
							}
							@Pc(212) int local212 = Static351.method4563(-1, local67.anIntArray433[0], local127, local134, Static41.anIntArray36, local67.anIntArray434[0], 0, local81, true, 0, local81, Static163.aClass240Array1[local67.aByte105], Static433.anIntArray487, local81);
							if (local212 > 0) {
								if (local212 > 9) {
									local212 = 9;
								}
								for (@Pc(221) int local221 = 0; local221 < local212; local221++) {
									local67.anIntArray434[local221] = Static433.anIntArray487[local212 - local221 - 1];
									local67.anIntArray433[local221] = Static41.anIntArray36[local212 - local221 - 1];
									local67.aByteArray78[local221] = 1;
								}
								local67.anInt6199 = local212;
							}
						}
					}
					Static154.method5156(local67, true);
					local105 = Static70.method1070(local67);
					Static271.method3664(Static307.anInt4787, Static56.anInt1079, local105, local67);
					Static379.method3484(local67);
				}
			}
		}
		if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
			if (Static449.anInt7379 == 2) {
				Static313.method4881();
			} else {
				Static143.method2067();
			}
			if (Static116.anInt1977 >> 7 < 14 || Static433.anInt7210 - 14 <= Static116.anInt1977 >> 7 || Static393.anInt4184 >> 7 < 14 || Static393.anInt4184 >> 7 >= Static418.anInt6969 - 14) {
				Static295.method3677();
			}
		}
		while (true) {
			@Pc(339) Class5_Sub33 local339;
			@Pc(344) Class76 local344;
			@Pc(352) Class76 local352;
			do {
				local339 = (Class5_Sub33) Static374.aClass177_34.method3621();
				if (local339 == null) {
					while (true) {
						do {
							local339 = (Class5_Sub33) Static293.aClass177_29.method3621();
							if (local339 == null) {
								while (true) {
									do {
										local339 = (Class5_Sub33) Static250.aClass177_26.method3621();
										if (local339 == null) {
											if (Static387.aClass76_14 != null) {
												Static452.method5945();
											}
											if (Static85.anInt1536 % 1500 == 0) {
												Static462.method6055();
											}
											if (Static376.anInt6324 == 6 && Static51.anInt913 == 0) {
												Static459.method3789();
											}
											Static294.method3671();
											if (Static264.aBoolean278 && Static458.aLong236 < Static446.method5903() - 60000L) {
												Static299.method3711();
											}
											for (@Pc(516) Class88_Sub1_Sub2 local516 = (Class88_Sub1_Sub2) Static27.aClass107_3.method2326(); local516 != null; local516 = (Class88_Sub1_Sub2) Static27.aClass107_3.method2327()) {
												if (Static446.method5903() / 1000L - 5L > (long) local516.anInt3884) {
													if (local516.aShort42 > 0) {
														Static44.method702("", local516.aString44 + Static46.aClass198_27.method4012(Static38.anInt4834), 5, 0, "");
													}
													if (local516.aShort42 == 0) {
														Static44.method702("", local516.aString44 + Static451.aClass198_126.method4012(Static38.anInt4834), 5, 0, "");
													}
													local516.method5917();
												}
											}
											if (Static376.anInt6324 == 6 && Static51.anInt913 == 0) {
												if (Static14.aClass99_2 == null) {
													Static165.method2317(false);
													return;
												}
												Static324.anInt5058++;
												if (Static324.anInt5058 > 50) {
													Static288.method3576(Static393.aClass194_73);
												}
												try {
													if (Static14.aClass99_2 != null && Static281.aClass5_Sub15_Sub2_13.anInt7013 > 0) {
														Static95.anInt1636 += Static281.aClass5_Sub15_Sub2_13.anInt7013;
														Static14.aClass99_2.method4964(Static281.aClass5_Sub15_Sub2_13.anInt7013, Static281.aClass5_Sub15_Sub2_13.aByteArray93);
														Static324.anInt5058 = 0;
														Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
														return;
													}
												} catch (@Pc(644) IOException local644) {
													Static165.method2317(false);
													return;
												}
											}
											return;
										}
										local344 = local339.aClass76_12;
										if (local344.anInt2115 < 0) {
											break;
										}
										local352 = Static213.method2817(local344.anInt2112);
									} while (local352 == null || local352.aClass76Array2 == null || local352.aClass76Array2.length <= local344.anInt2115 || local344 != local352.aClass76Array2[local344.anInt2115]);
									Static181.method2470(local339);
								}
							}
							local344 = local339.aClass76_12;
							if (local344.anInt2115 < 0) {
								break;
							}
							local352 = Static213.method2817(local344.anInt2112);
						} while (local352 == null || local352.aClass76Array2 == null || local352.aClass76Array2.length <= local344.anInt2115 || local344 != local352.aClass76Array2[local344.anInt2115]);
						Static181.method2470(local339);
					}
				}
				local344 = local339.aClass76_12;
				if (local344.anInt2115 < 0) {
					break;
				}
				local352 = Static213.method2817(local344.anInt2112);
			} while (local352 == null || local352.aClass76Array2 == null || local352.aClass76Array2.length <= local344.anInt2115 || local344 != local352.aClass76Array2[local344.anInt2115]);
			Static181.method2470(local339);
		}
	}
}
