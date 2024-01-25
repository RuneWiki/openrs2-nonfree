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
				Static25.method327("Argument count");
			}
			Static601.aClass165_5 = new Class165();
			Static601.aClass165_5.anInt4607 = Integer.parseInt(arg0[0]);
			Static227.aClass165_4 = new Class165();
			Static227.aClass165_4.anInt4607 = Integer.parseInt(arg0[1]);
			Static520.aClass352_8 = Static92.aClass352_4;
			if (arg0[3].equals("live")) {
				Static348.aClass136_3 = Static608.aClass136_4;
			} else if (arg0[3].equals("rc")) {
				Static348.aClass136_3 = Static91.aClass136_2;
			} else if (arg0[3].equals("wip")) {
				Static348.aClass136_3 = Static71.aClass136_1;
			} else {
				Static25.method327("modewhat");
			}
			Static601.anInt9518 = Static166.method3293(arg0[4]);
			if (Static601.anInt9518 == -1) {
				if (arg0[4].equals("english")) {
					Static601.anInt9518 = 0;
				} else if (arg0[4].equals("german")) {
					Static601.anInt9518 = 1;
				} else {
					Static25.method327("language");
				}
			}
			Static477.aBoolean381 = false;
			Static566.aBoolean646 = false;
			if (arg0[5].equals("game0")) {
				Static129.aClass121_1 = Static517.aClass121_8;
			} else if (arg0[5].equals("game1")) {
				Static129.aClass121_1 = Static567.aClass121_9;
			} else if (arg0[5].equals("game2")) {
				Static129.aClass121_1 = Static158.aClass121_2;
			} else if (arg0[5].equals("game3")) {
				Static129.aClass121_1 = Static473.aClass121_7;
			} else {
				Static25.method327("game");
			}
			Static192.aString43 = null;
			Static24.anInt316 = Static129.aClass121_1.anInt3555;
			Static687.anInt9943 = 0;
			Static111.aBoolean187 = false;
			Static506.aString97 = "";
			Static99.anInt1987 = 0;
			Static470.aBoolean604 = false;
			Static468.aByteArray78 = null;
			Static356.aBoolean441 = true;
			Static200.aBoolean328 = true;
			Static604.anInt9535 = 0;
			Static48.aLong225 = 0L;
			@Pc(242) client local242 = new client();
			Static635.aClient1 = local242;
			local242.method1048(Static129.aClass121_1.aString30, Static348.aClass136_3.method3671() + 32);
			Static637.aFrame3.setLocation(40, 40);
		} catch (@Pc(265) Exception local265) {
			Static550.method7785(local265, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1046() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static50.anInt606 + "," + Static404.anInt7039 + "," + Static29.anInt380 + "," + Static327.anInt5650 + "|";
			if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 != null) {
				local7 = local7 + "2)" + Static504.anInt8428 + "," + (Static50.anInt606 + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0]) + "," + (Static404.anInt7039 + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0]) + "|";
			}
			local7 = local7 + "3)" + Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() + "|4)" + Static687.aClass6_Sub44_33.aClass7_Sub25_1.method7631() + "|5)" + Static368.method5566() + "|6)" + Static535.anInt4128 + "," + Static274.anInt3226 + "|";
			local7 = local7 + "7)" + Static687.aClass6_Sub44_33.aClass7_Sub4_1.method648() + "|";
			local7 = local7 + "8)" + Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591() + "|";
			local7 = local7 + "9)" + Static687.aClass6_Sub44_33.aClass7_Sub28_1.method8314() + "|";
			local7 = local7 + "10)" + Static687.aClass6_Sub44_33.aClass7_Sub2_1.method236() + "|";
			local7 = local7 + "11)" + Static687.aClass6_Sub44_33.aClass7_Sub17_1.method5991() + "|";
			local7 = local7 + "12)" + Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() + "|";
			local7 = local7 + "13)" + Static532.anInt8714 + "|";
			local7 = local7 + "14)" + Static37.anInt498;
			if (Static192.aClass6_Sub1_1 != null) {
				local7 = local7 + "|15)" + Static192.aClass6_Sub1_1.anInt39;
			}
			try {
				if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 2) {
					@Pc(283) Class local283 = Class.forName("java.lang.ClassLoader");
					@Pc(289) Field local289 = local283.getDeclaredField("nativeLibraries");
					@Pc(294) Class local294 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(306) Method local306 = local294.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local306.invoke(local289, Boolean.TRUE);
					@Pc(332) Vector local332 = (Vector) local289.get((Static78.aClass5 == null ? (Static78.aClass5 = a("client")) : Static78.aClass5).getClassLoader());
					for (@Pc(334) int local334 = 0; local334 < local332.size(); local334++) {
						try {
							@Pc(340) Object local340 = local332.elementAt(local334);
							@Pc(347) Field local347 = local340.getClass().getDeclaredField("name");
							local306.invoke(local347, Boolean.TRUE);
							try {
								@Pc(362) String local362 = (String) local347.get(local340);
								if (local362 != null && local362.indexOf("sw3d.dll") != -1) {
									@Pc(381) Field local381 = local340.getClass().getDeclaredField("handle");
									local306.invoke(local381, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local381.getLong(local340));
									local306.invoke(local381, Boolean.FALSE);
								}
							} catch (@Pc(419) Throwable local419) {
							}
							local306.invoke(local347, Boolean.FALSE);
						} catch (@Pc(431) Throwable local431) {
						}
					}
				}
			} catch (@Pc(445) Throwable local445) {
			}
			local7 = local7 + "]";
		} catch (@Pc(456) Throwable local456) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1060(@OriginalArg(1) int arg0) {
		Static116.aClass189_2.anInt5126++;
		Static417.aClass380_5 = null;
		Static162.aClass295_1 = null;
		Static116.aClass189_2.anInt5127 = arg0;
		Static165.anInt3462 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1056() {
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != 2) {
			this.method1068();
			return;
		}
		try {
			this.method1068();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static550.method7785(local19, local19.getMessage() + " (Recovered) " + this.method1046());
			Static211.aBoolean336 = true;
			Static536.method7652(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1040()) {
			return;
		}
		Static601.aClass165_5 = new Class165();
		Static601.aClass165_5.anInt4607 = Integer.parseInt(this.getParameter("worldid"));
		Static227.aClass165_4 = new Class165();
		Static227.aClass165_4.anInt4607 = Integer.parseInt(this.getParameter("lobbyid"));
		Static227.aClass165_4.aString47 = this.getParameter("lobbyaddress");
		Static520.aClass352_8 = Static319.method5019(Integer.parseInt(this.getParameter("modewhere")));
		if (Static520.aClass352_8 == Static92.aClass352_4) {
			Static520.aClass352_8 = Static353.aClass352_6;
		} else if (!Static16.method212(Static520.aClass352_8) && Static41.aClass352_2 != Static520.aClass352_8) {
			Static520.aClass352_8 = Static41.aClass352_2;
		}
		Static348.aClass136_3 = Static74.method1012(Integer.parseInt(this.getParameter("modewhat")));
		if (Static348.aClass136_3 != Static71.aClass136_1 && Static348.aClass136_3 != Static91.aClass136_2 && Static348.aClass136_3 != Static608.aClass136_4) {
			Static348.aClass136_3 = Static608.aClass136_4;
		}
		try {
			Static601.anInt9518 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			Static601.anInt9518 = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static566.aBoolean646 = true;
		} else {
			Static566.aBoolean646 = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static477.aBoolean381 = true;
		} else {
			Static477.aBoolean381 = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static81.aBoolean103 = true;
		} else {
			Static81.aBoolean103 = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static129.aClass121_1 = Static517.aClass121_8;
			} else if (local190.equals("1")) {
				Static129.aClass121_1 = Static567.aClass121_9;
			} else if (local190.equals("2")) {
				Static129.aClass121_1 = Static158.aClass121_2;
			} else if (local190.equals("3")) {
				Static129.aClass121_1 = Static473.aClass121_7;
			}
		}
		try {
			Static99.anInt1987 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static99.anInt1987 = 0;
		}
		Static492.aString29 = this.getParameter("quiturl");
		Static506.aString97 = this.getParameter("settings");
		if (Static506.aString97 == null) {
			Static506.aString97 = "";
		}
		Static444.aBoolean582 = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static604.anInt9535 = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static604.anInt9535 = 0;
			}
		}
		Static24.anInt316 = Integer.parseInt(this.getParameter("colourid"));
		if (Static24.anInt316 < 0 || Static193.aColorArray7.length <= Static24.anInt316) {
			Static24.anInt316 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static356.aBoolean441 = true;
			Static200.aBoolean328 = true;
		}
		@Pc(330) String local330 = this.getParameter("frombilling");
		if (local330 != null && local330.equals("true")) {
			Static470.aBoolean604 = true;
		}
		@Pc(350) String local350 = this.getParameter("sskey");
		if (local350 != null) {
			Static468.aByteArray78 = Static31.method413(Static84.method1235(local350));
			if (Static468.aByteArray78.length < 16) {
				Static468.aByteArray78 = null;
			}
		}
		@Pc(374) String local374 = this.getParameter("force64mb");
		if (local374 != null && local374.equals("true")) {
			Static111.aBoolean187 = true;
		}
		@Pc(394) String local394 = this.getParameter("worldflags");
		if (local394 != null) {
			try {
				Static687.anInt9943 = Integer.parseInt(local394);
			} catch (@Pc(401) Exception local401) {
			}
		}
		@Pc(408) String local408 = this.getParameter("userFlow");
		if (local408 != null) {
			try {
				Static48.aLong225 = Long.parseLong(local408);
			} catch (@Pc(416) NumberFormatException local416) {
			}
		}
		Static192.aString43 = this.getParameter("additionalInfo");
		if (Static192.aString43 != null && Static192.aString43.length() > 50) {
			Static192.aString43 = null;
		}
		Static635.aClient1 = this;
		if (Static129.aClass121_1 == Static517.aClass121_8) {
			Static48.anInt6772 = 503;
			Static339.anInt5789 = 765;
		} else if (Static129.aClass121_1 == Static567.aClass121_9) {
			Static339.anInt5789 = 640;
			Static48.anInt6772 = 480;
		}
		this.method1052(Static129.aClass121_1.aString30, Static48.anInt6772, Static348.aClass136_3.method3671() + 32, Static339.anInt5789);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1068() {
		if (Static37.anInt498 == 16) {
			return;
		}
		@Pc(17) long local17 = Static305.method5430() / 1000000L - Static249.aLong147;
		Static249.aLong147 = Static305.method5430() / 1000000L;
		@Pc(25) boolean local25 = Static484.method7211();
		if (local25 && Static588.aBoolean698 && Static240.aClass150_2 != null) {
			Static240.aClass150_2.method5501();
		}
		if (Static513.method7388(Static37.anInt498)) {
			if (Static75.aLong49 != 0L && Static75.aLong49 < Static549.method7758()) {
				Static137.method2612(Static464.anInt7986, Static536.anInt8744, Static368.method5566(), false);
			} else if (!Static202.aClass75_5.method6703() && Static634.aBoolean730) {
				Static333.method5170();
			}
		}
		@Pc(105) int local105;
		@Pc(109) int local109;
		if (Static221.aFrame1 == null) {
			@Pc(89) Container local89;
			if (Static637.aFrame3 != null) {
				local89 = Static637.aFrame3;
			} else if (Static371.anApplet1 == null) {
				local89 = Static34.anApplet_Sub1_1;
			} else {
				local89 = Static371.anApplet1;
			}
			local105 = local89.getSize().width;
			local109 = local89.getSize().height;
			if (Static637.aFrame3 == local89) {
				@Pc(115) Insets local115 = Static637.aFrame3.getInsets();
				local105 -= local115.right + local115.left;
				local109 -= local115.bottom + local115.top;
			}
			if (Static238.anInt4606 != local105 || Static542.anInt8800 != local109 || Static513.aBoolean649) {
				if (Static202.aClass75_5 == null || Static202.aClass75_5.method6704()) {
					Static552.method7812();
				} else {
					Static542.anInt8800 = local109;
					Static238.anInt4606 = local105;
				}
				Static75.aLong49 = Static549.method7758() + 500L;
				Static513.aBoolean649 = false;
			}
		}
		if (Static221.aFrame1 != null && !Static285.aBoolean390 && Static513.method7388(Static37.anInt498)) {
			Static137.method2612(-1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279(), false);
		}
		@Pc(204) boolean local204 = false;
		if (Static217.aBoolean340) {
			Static217.aBoolean340 = false;
			local204 = true;
		}
		if (local204) {
			Static17.method220();
		}
		if (Static202.aClass75_5 != null && Static202.aClass75_5.method6703() || Static368.method5566() != 1) {
			Static35.method456();
		}
		if (Static270.method4568(Static37.anInt498)) {
			Static637.method8603(local204, (byte) 67);
		} else if (Static585.method8157(Static37.anInt498)) {
			Static327.method5133();
		} else if (Static669.method8874(Static37.anInt498)) {
			Static327.method5133();
		} else if (Static206.method3811(Static37.anInt498)) {
			if (Static551.anInt8913 == 1) {
				if (Static492.anInt3481 > Static655.anInt10163) {
					Static655.anInt10163 = Static492.anInt3481;
				}
				local105 = (Static655.anInt10163 - Static492.anInt3481) * 50 / Static655.anInt10163;
				Static562.method7944(Static507.aClass53_16, Static50.aClass43_12.method596(Static601.anInt9518) + "<br>(" + local105 + "%)", Static180.aClass67_5, Static202.aClass75_5, true);
			} else if (Static551.anInt8913 == 2) {
				if (Static593.anInt9435 > Static225.anInt4394) {
					Static225.anInt4394 = Static593.anInt9435;
				}
				local105 = (Static225.anInt4394 - Static593.anInt9435) * 50 / Static225.anInt4394 + 50;
				Static562.method7944(Static507.aClass53_16, Static50.aClass43_12.method596(Static601.anInt9518) + "<br>(" + local105 + "%)", Static180.aClass67_5, Static202.aClass75_5, true);
			} else {
				Static562.method7944(Static507.aClass53_16, Static50.aClass43_12.method596(Static601.anInt9518), Static180.aClass67_5, Static202.aClass75_5, true);
			}
		} else if (Static37.anInt498 == 11) {
			Static131.method2542(local17);
		} else if (Static37.anInt498 == 14) {
			Static562.method7944(Static507.aClass53_16, Static50.aClass43_14.method596(Static601.anInt9518) + "<br>" + Static50.aClass43_15.method596(Static601.anInt9518), Static180.aClass67_5, Static202.aClass75_5, false);
		} else if (Static37.anInt498 == 15) {
			Static562.method7944(Static507.aClass53_16, Static50.aClass43_30.method596(Static601.anInt9518), Static180.aClass67_5, Static202.aClass75_5, false);
		}
		if (Static47.anInt577 == 3) {
			for (local105 = 0; local105 < Static149.anInt3119; local105++) {
				@Pc(474) Rectangle local474 = Class6_Sub24.aRectangleArray2[local105];
				if (Static400.aBooleanArray21[local105]) {
					Static202.aClass75_5.method6718(local474.height, local474.y, -65281, local474.width, local474.x);
				} else if (Static411.aBooleanArray22[local105]) {
					Static202.aClass75_5.method6718(local474.height, local474.y, -65536, local474.width, local474.x);
				} else {
					Static202.aClass75_5.method6718(local474.height, local474.y, -16711936, local474.width, local474.x);
				}
			}
		}
		if (Static290.method8799()) {
			Static258.method4505(Static202.aClass75_5);
		}
		if (Static651.aClass122_38.aBoolean282 && Static513.method7388(Static37.anInt498) && Static47.anInt577 == 0 && Static368.method5566() == 1 && !local204) {
			local105 = 0;
			for (local109 = 0; local109 < Static149.anInt3119; local109++) {
				if (Static411.aBooleanArray22[local109]) {
					Static411.aBooleanArray22[local109] = false;
					Static16.aRectangleArray1[local105++] = Class6_Sub24.aRectangleArray2[local109];
				}
			}
			try {
				if (Static93.aBoolean113) {
					Static196.method3697(local105, Static16.aRectangleArray1);
				} else {
					Static202.aClass75_5.method6678(local105, Static16.aRectangleArray1);
				}
			} catch (@Pc(685) Exception_Sub1 local685) {
			}
		} else if (!Static270.method4568(Static37.anInt498)) {
			for (local105 = 0; local105 < Static149.anInt3119; local105++) {
				Static411.aBooleanArray22[local105] = false;
			}
			try {
				if (Static93.aBoolean113) {
					Static23.method262();
				} else {
					Static202.aClass75_5.method6638();
				}
			} catch (@Pc(613) Exception_Sub1 local613) {
				Static550.method7785(local613, local613.getMessage() + " (Recovered) " + this.method1046());
				Static536.method7652(false, 0);
			}
		}
		Static638.method8615();
		local105 = Static687.aClass6_Sub44_33.aClass7_Sub26_1.method7643();
		if (local105 == 0) {
			Static255.method4444(15L);
		} else if (local105 == 1) {
			Static255.method4444(10L);
		} else if (local105 == 2) {
			Static255.method4444(5L);
		} else if (local105 == 3) {
			Static255.method4444(2L);
		}
		if (Static110.aBoolean185) {
			Static3.method23();
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub21_1.method6913() == 1 && Static37.anInt498 == 3 && Static635.anInt9910 != -1) {
			Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub21_1);
			Static392.method6007();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1069() {
		@Pc(46) int local46;
		if (Static37.anInt498 == 7 && !Static110.method2079() || Static37.anInt498 == 9 && Static472.anInt8073 == 42) {
			if (Static594.anInt9443 > 1) {
				Static594.anInt9443--;
				Static128.anInt2539 = Static633.anInt8242;
			}
			if (!Static484.aBoolean623) {
				Static67.method816();
			}
			for (local46 = 0; local46 < 100 && Static150.method2926(Static525.aClass260_3); local46++) {
			}
		}
		Static2.anInt3++;
		Static616.method8499((Class381) null, -1, -1);
		Static581.method8106((Class381) null, -1, -1);
		Static509.method7379();
		Static633.anInt8242++;
		for (local46 = 0; local46 < Static251.anInt4781; local46++) {
			@Pc(99) Class60_Sub1_Sub1_Sub3_Sub2 local99 = Static216.aClass6_Sub11Array1[local46].aClass60_Sub1_Sub1_Sub3_Sub2_1;
			if (local99 != null) {
				@Pc(105) byte local105 = local99.aClass294_1.aByte110;
				if ((local105 & 0x1) != 0) {
					@Pc(116) int local116 = local99.method4424((byte) -28);
					@Pc(144) int local144;
					if ((local105 & 0x2) != 0 && local99.anInt4879 == 0 && Math.random() * 1000.0D < 10.0D) {
						local144 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(152) int local152 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local144 != 0 || local152 != 0) {
							@Pc(168) int local168 = local99.anIntArray263[0] + local144;
							if (local168 < 0) {
								local168 = 0;
							} else if (local168 > Static29.anInt380 - local116 - 1) {
								local168 = Static29.anInt380 - local116 - 1;
							}
							@Pc(201) int local201 = local99.anIntArray264[0] + local152;
							if (local201 < 0) {
								local201 = 0;
							} else if (Static327.anInt5650 - local116 - 1 < local201) {
								local201 = Static327.anInt5650 - local116 - 1;
							}
							@Pc(253) int local253 = Static475.method7128(local116, local116, local99.anIntArray264[0], local99.anIntArray263[0], local168, Static381.anIntArray381, Static657.anIntArray685, 0, Static669.aClass356Array1[local99.aByte135], -1, true, 0, local116, local201);
							if (local253 > 0) {
								if (local253 > 9) {
									local253 = 9;
								}
								for (@Pc(266) int local266 = 0; local266 < local253; local266++) {
									local99.anIntArray263[local266] = Static381.anIntArray381[local253 - local266 - 1];
									local99.anIntArray264[local266] = Static657.anIntArray685[local253 - local266 - 1];
									local99.aByteArray36[local266] = 1;
								}
								local99.anInt4879 = local253;
							}
						}
					}
					Static78.method1058(true, local99);
					local144 = Static11.method171(local99);
					Static172.method3339(local99);
					Static319.method5024(local99, local144, Static380.anInt6621, Static245.anInt4707);
					Static182.method3446(local99, Static380.anInt6621);
					Static514.method7394(local99);
				}
			}
		}
		if ((!Static110.method2079() || Static37.anInt498 == 9 && Static472.anInt8073 == 42) && Static557.anInt9014 == 0) {
			if (Static526.anInt8626 == 2) {
				Static372.method8355();
			} else {
				Static231.method4108();
			}
			if (Static475.anInt8090 >> 9 < 14 || Static29.anInt380 - 14 <= Static475.anInt8090 >> 9 || Static365.anInt6155 >> 9 < 14 || Static327.anInt5650 - 14 <= Static365.anInt6155 >> 9) {
				Static395.method6065();
			}
		}
		while (true) {
			@Pc(434) Class6_Sub53 local434;
			@Pc(439) Class381 local439;
			@Pc(451) Class381 local451;
			do {
				local434 = (Class6_Sub53) Static157.aClass340_23.method8127();
				if (local434 == null) {
					while (true) {
						do {
							local434 = (Class6_Sub53) Static471.aClass340_61.method8127();
							if (local434 == null) {
								while (true) {
									do {
										local434 = (Class6_Sub53) Static131.aClass340_20.method8127();
										if (local434 == null) {
											if (Static637.aClass381_13 != null) {
												Static434.method6606();
											}
											if (Static141.anInt8737 % 1500 == 0) {
												Static542.method7712();
											}
											if (Static37.anInt498 == 7 && !Static110.method2079() || Static37.anInt498 == 9 && Static472.anInt8073 == 42) {
												Static600.method8278();
											}
											Static136.method2603();
											if (Static269.aBoolean380 && Static549.method7758() - 60000L > Static478.aLong260) {
												Static287.method4705();
											}
											for (@Pc(651) Class60_Sub2_Sub2 local651 = (Class60_Sub2_Sub2) Static555.aClass385_9.method8778(); local651 != null; local651 = (Class60_Sub2_Sub2) Static555.aClass385_9.method8773()) {
												if ((long) local651.anInt8052 < Static549.method7758() / 1000L - 5L) {
													if (local651.aShort95 > 0) {
														Static14.method193("", "", "", 0, local651.aString90 + Static50.aClass43_19.method596(Static601.anInt9518), 5);
													}
													if (local651.aShort95 == 0) {
														Static14.method193("", "", "", 0, local651.aString90 + Static50.aClass43_20.method596(Static601.anInt9518), 5);
													}
													local651.method8914();
												}
											}
											if (Static37.anInt498 == 7 && !Static110.method2079() || Static37.anInt498 == 9 && Static472.anInt8073 == 42) {
												if (Static37.anInt498 != 9 && Static525.aClass260_3.aClass141_1 == null) {
													Static166.method3296(false);
													return;
												}
												if (Static525.aClass260_3 != null) {
													Static525.aClass260_3.anInt7200++;
													if (Static525.aClass260_3.anInt7200 > 50) {
														@Pc(800) Class6_Sub13 local800 = Static30.method353(Static479.aClass241_99, Static525.aClass260_3.aClass270_2);
														Static525.aClass260_3.method6404(local800);
													}
													try {
														Static525.aClass260_3.method6399();
														return;
													} catch (@Pc(809) IOException local809) {
														if (Static37.anInt498 != 9) {
															Static166.method3296(false);
															return;
														}
														Static525.aClass260_3.method6400();
														return;
													}
												}
											}
											return;
										}
										local439 = local434.aClass381_11;
										if (local439.anInt10112 < 0) {
											break;
										}
										local451 = Static69.method899(local439.anInt10079);
									} while (local451 == null || local451.aClass381Array1 == null || local439.anInt10112 >= local451.aClass381Array1.length || local451.aClass381Array1[local439.anInt10112] != local439);
									Static301.method4842(local434);
								}
							}
							local439 = local434.aClass381_11;
							if (local439.anInt10112 < 0) {
								break;
							}
							local451 = Static69.method899(local439.anInt10079);
						} while (local451 == null || local451.aClass381Array1 == null || local451.aClass381Array1.length <= local439.anInt10112 || local451.aClass381Array1[local439.anInt10112] != local439);
						Static301.method4842(local434);
					}
				}
				local439 = local434.aClass381_11;
				if (local439.anInt10112 < 0) {
					break;
				}
				local451 = Static69.method899(local439.anInt10079);
			} while (local451 == null || local451.aClass381Array1 == null || local439.anInt10112 >= local451.aClass381Array1.length || local439 != local451.aClass381Array1[local439.anInt10112]);
			Static301.method4842(local434);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1051() {
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != 2) {
			this.method1073();
			return;
		}
		try {
			this.method1073();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static550.method7785(local19, local19.getMessage() + " (Recovered) " + this.method1046());
			Static211.aBoolean336 = true;
			Static536.method7652(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method1070() {
		@Pc(14) boolean local14 = Static116.aClass189_2.method4678();
		if (!local14) {
			this.method1074();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1054() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1073() {
		if (Static37.anInt498 == 16) {
			return;
		}
		Static141.anInt8737++;
		if (Static141.anInt8737 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static180.anInt3649 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static192.aRandom1.setSeed((long) Static180.anInt3649);
		}
		Static525.aClass260_4.method6402();
		Static525.aClass260_3.method6402();
		this.method1070();
		if (Static38.aClass72_1 != null) {
			Static38.aClass72_1.method1359((byte) 110);
		}
		Static224.method4042();
		Static199.method3720();
		Static435.aClass148_1.method3950();
		Static331.aClass42_8.method6012();
		if (Static202.aClass75_5 != null) {
			Static202.aClass75_5.method6671((int) Static549.method7758());
		}
		Static109.method2068();
		Static575.anInt9550 = 0;
		Static686.anInt10489 = 0;
		for (@Pc(94) Interface17 local94 = Static435.aClass148_1.method3953(); local94 != null; local94 = Static435.aClass148_1.method3953()) {
			@Pc(102) int local102 = local94.method8952();
			if (local102 == 2 || local102 == 3) {
				@Pc(116) char local116 = local94.method8951();
				if (Static468.method7068() && (local116 == '`' || local116 == '§' || local116 == '²')) {
					if (Static290.method8799()) {
						Static613.method8455();
					} else {
						Static152.method2978();
					}
				} else if (Static686.anInt10489 < 128) {
					Static350.anInterface17Array2[Static686.anInt10489] = local94;
					Static686.anInt10489++;
				}
			} else if (local102 == 0 && Static575.anInt9550 < 75) {
				Static136.anInterface17Array1[Static575.anInt9550] = local94;
				Static575.anInt9550++;
			}
		}
		Static79.anInt1140 = 0;
		for (@Pc(209) Class6_Sub9 local209 = Static331.aClass42_8.method6011(); local209 != null; local209 = Static331.aClass42_8.method6011()) {
			@Pc(217) int local217 = local209.method7140();
			if (local217 == -1) {
				Static150.aClass340_22.method8131(local209);
			} else if (local217 == 6) {
				Static79.anInt1140 += local209.method7136();
			} else if (Static603.method8318(local217)) {
				Static518.aClass340_65.method8131(local209);
				if (Static518.aClass340_65.method8128() > 10) {
					Static518.aClass340_65.method8127();
				}
			}
		}
		if (Static290.method8799()) {
			Static324.method5088();
		}
		if (Static270.method4568(Static37.anInt498)) {
			Static367.method5558();
			Static19.method235();
		} else if (Static206.method3811(Static37.anInt498)) {
			Static641.method8644();
		}
		if (Static233.method4127(Static37.anInt498) && !Static206.method3811(Static37.anInt498)) {
			this.method1069();
			Static480.method8784();
			Static498.method7328();
		} else if (Static188.method3527(Static37.anInt498) && !Static206.method3811(Static37.anInt498)) {
			this.method1069();
			Static498.method7328();
		} else if (Static37.anInt498 == 13) {
			Static498.method7328();
		} else if (Static292.method4772(Static37.anInt498) && !Static206.method3811(Static37.anInt498)) {
			Static332.method5163();
		} else if (Static37.anInt498 == 14 || Static37.anInt498 == 15) {
			Static498.method7328();
			if (Static472.anInt8073 != -3 && Static472.anInt8073 != 2 && Static472.anInt8073 != 15) {
				if (Static37.anInt498 == 15) {
					Static677.anInt9949 = Static562.anInt9091;
					Static171.anInt3540 = Static472.anInt8073;
					Static21.anInt277 = Static584.anInt9324;
					if (Static526.aBoolean666) {
						Static653.method8740(Static27.aClass165_1.anInt4607, Static27.aClass165_1.aString47);
						Static525.aClass260_4.aClass141_1 = null;
						Static307.method4889(14);
					} else {
						Static166.method3296(Static624.aBoolean726);
					}
				} else {
					Static166.method3296(false);
				}
			}
		}
		Static254.method4441(Static202.aClass75_5);
		Static518.aClass340_65.method8127();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1055() {
		if (Static269.aBoolean380) {
			Static287.method4705();
		}
		Static279.method4664();
		if (Static202.aClass75_5 != null) {
			Static202.aClass75_5.method6672();
		}
		if (Static221.aFrame1 != null) {
			Static665.method8842(Static221.aFrame1, Static651.aClass122_38);
			Static221.aFrame1 = null;
		}
		Static525.aClass260_4.method6400();
		Static525.aClass260_3.method6400();
		Static533.method7640();
		Static116.aClass189_2.method4687();
		Static62.aClass188_1.method4669();
		if (Static239.aClass5_1 != null) {
			Static239.aClass5_1.method26();
			Static239.aClass5_1 = null;
		}
		try {
			Static600.aClass130_8.method3458();
			for (@Pc(63) int local63 = 0; local63 < 37; local63++) {
				Static644.aClass130Array1[local63].method3458();
			}
			Static646.aClass130_7.method3458();
			Static370.aClass130_4.method3458();
			Static534.method7990();
		} catch (@Pc(90) Exception local90) {
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1074() {
		if (Static116.aClass189_2.anInt5126 > Static164.anInt3446) {
			Static82.aClass165_2.method4207();
			Static350.anInt5962 = (Static116.aClass189_2.anInt5126 * 50 - 50) * 5;
			if (Static350.anInt5962 > 3000) {
				Static350.anInt5962 = 3000;
			}
			if (Static116.aClass189_2.anInt5126 >= 2 && Static116.aClass189_2.anInt5127 == 6) {
				this.method1047("js5connect_outofdate");
				Static37.anInt498 = 16;
				return;
			}
			if (Static116.aClass189_2.anInt5126 >= 4 && Static116.aClass189_2.anInt5127 == -1) {
				this.method1047("js5crc");
				Static37.anInt498 = 16;
				return;
			}
			if (Static116.aClass189_2.anInt5126 >= 4 && Static270.method4568(Static37.anInt498)) {
				if (Static116.aClass189_2.anInt5127 == 7 || Static116.aClass189_2.anInt5127 == 9) {
					this.method1047("js5connect_full");
				} else if (Static116.aClass189_2.anInt5127 <= 0) {
					this.method1047("js5io");
				} else if (Static322.aString63 == null) {
					this.method1047("js5connect");
				} else {
					this.method1047("js5proxy_" + Static322.aString63.trim());
				}
				Static37.anInt498 = 16;
				return;
			}
		}
		Static164.anInt3446 = Static116.aClass189_2.anInt5126;
		if (Static350.anInt5962 > 0) {
			Static350.anInt5962--;
			return;
		}
		try {
			if (Static165.anInt3462 == 0) {
				Static417.aClass380_5 = Static82.aClass165_2.method4203(Static651.aClass122_38);
				Static165.anInt3462++;
			}
			if (Static165.anInt3462 == 1) {
				if (Static417.aClass380_5.anInt10067 == 2) {
					if (Static417.aClass380_5.anObject25 != null) {
						Static322.aString63 = (String) Static417.aClass380_5.anObject25;
					}
					this.method1060(1000);
					return;
				}
				if (Static417.aClass380_5.anInt10067 == 1) {
					Static165.anInt3462++;
				}
			}
			if (Static165.anInt3462 == 2) {
				Static162.aClass295_1 = new Class295((Socket) Static417.aClass380_5.anObject25, Static651.aClass122_38, 25000);
				@Pc(247) Class6_Sub15 local247 = new Class6_Sub15(5);
				local247.method3016(Static650.aClass162_2.anInt4493);
				local247.method3029(658);
				Static162.aClass295_1.method7198(5, local247.aByteArray20);
				Static165.anInt3462++;
				Static363.aLong213 = Static549.method7758();
			}
			if (Static165.anInt3462 == 3) {
				if (Static270.method4568(Static37.anInt498) || Static162.aClass295_1.method7196() > 0) {
					@Pc(289) int local289 = Static162.aClass295_1.method7195();
					if (local289 != 0) {
						this.method1060(local289);
						return;
					}
					Static165.anInt3462++;
				} else if (Static549.method7758() - Static363.aLong213 > 30000L) {
					this.method1060(1001);
					return;
				}
			}
			if (Static165.anInt3462 == 4) {
				@Pc(354) boolean local354 = Static270.method4568(Static37.anInt498) || Static233.method4127(Static37.anInt498) || Static188.method3527(Static37.anInt498);
				@Pc(359) Class287[] local359 = Static462.method7020();
				@Pc(367) Class6_Sub15 local367 = new Class6_Sub15(local359.length * 4);
				Static162.aClass295_1.method7192(local367.aByteArray20.length, 0, local367.aByteArray20);
				for (@Pc(378) int local378 = 0; local378 < local359.length; local378++) {
					local359[local378].method7025(local367.method3015());
				}
				Static116.aClass189_2.method4680(!local354, Static162.aClass295_1);
				Static162.aClass295_1 = null;
				Static417.aClass380_5 = null;
				Static165.anInt3462 = 0;
			}
		} catch (@Pc(423) IOException local423) {
			this.method1060(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1050() {
		if (Static111.aBoolean187) {
			Static532.anInt8714 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static552.method7812();
		Static62.aClass188_1 = new Class188(Static651.aClass122_38);
		Static116.aClass189_2 = new Class189();
		Static177.method3371(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static520.aClass352_8 != Static41.aClass352_2) {
			Static188.aByteArrayArray63 = new byte[50][];
		}
		Static687.aClass6_Sub44_33 = Static318.method5009();
		if (Static520.aClass352_8 == Static41.aClass352_2) {
			Static601.aClass165_5.aString47 = this.getCodeBase().getHost();
		} else if (Static16.method212(Static520.aClass352_8)) {
			Static601.aClass165_5.aString47 = this.getCodeBase().getHost();
			Static601.aClass165_5.anInt4608 = Static601.aClass165_5.anInt4607 + 40000;
			Static227.aClass165_4.anInt4608 = Static227.aClass165_4.anInt4607 + 40000;
			Static601.aClass165_5.anInt4602 = Static601.aClass165_5.anInt4607 + 50000;
			Static227.aClass165_4.anInt4602 = Static227.aClass165_4.anInt4607 + 50000;
		} else if (Static520.aClass352_8 == Static92.aClass352_4) {
			Static601.aClass165_5.aString47 = "127.0.0.1";
			Static601.aClass165_5.anInt4608 = Static601.aClass165_5.anInt4607 + 40000;
			Static227.aClass165_4.aString47 = "127.0.0.1";
			Static601.aClass165_5.anInt4602 = Static601.aClass165_5.anInt4607 + 50000;
			Static227.aClass165_4.anInt4608 = Static227.aClass165_4.anInt4607 + 40000;
			Static227.aClass165_4.anInt4602 = Static227.aClass165_4.anInt4607 + 50000;
		}
		if (Static129.aClass121_1 == Static517.aClass121_8) {
			Static110.aBoolean186 = false;
		}
		if (Static129.aClass121_1 == Static567.aClass121_9) {
			Static493.anInt8353 = 0;
			Static98.aShortArrayArray4 = Static557.aShortArrayArray14;
			Static28.aBoolean30 = true;
			Static14.anInt194 = 16777215;
			Static299.aShortArrayArrayArray2 = Static680.aShortArrayArrayArray4;
		} else if (Static473.aClass121_7 == Static129.aClass121_1) {
			Static98.aShortArrayArray4 = Static154.aShortArrayArray6;
			Static299.aShortArrayArrayArray2 = Static8.aShortArrayArrayArray1;
		} else {
			Static98.aShortArrayArray4 = Static530.aShortArrayArray13;
			Static299.aShortArrayArrayArray2 = Static417.aShortArrayArrayArray3;
		}
		Static103.aShortArray36 = Static61.aShortArray23 = Static83.aShortArray35 = Static18.aShortArray11 = new short[256];
		Static82.aClass165_2 = Static601.aClass165_5;
		try {
			Static4.aClipboard1 = Static635.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(223) Exception local223) {
		}
		Static435.aClass148_1 = Static551.method7803(Static4.aCanvas1);
		Static331.aClass42_8 = Static359.method5448(Static4.aCanvas1);
		try {
			if (Static651.aClass122_38.aClass320_1 != null) {
				Static600.aClass130_8 = new Class130(Static651.aClass122_38.aClass320_1, 5200, 0);
				for (@Pc(245) int local245 = 0; local245 < 37; local245++) {
					Static644.aClass130Array1[local245] = new Class130(Static651.aClass122_38.aClass320Array1[local245], 6000, 0);
				}
				Static646.aClass130_7 = new Class130(Static651.aClass122_38.aClass320_2, 6000, 0);
				Static309.aClass251_4 = new Class251(255, Static600.aClass130_8, Static646.aClass130_7, 500000);
				Static370.aClass130_4 = new Class130(Static651.aClass122_38.aClass320_3, 24, 0);
				Static651.aClass122_38.aClass320_3 = null;
				Static651.aClass122_38.aClass320Array1 = null;
				Static651.aClass122_38.aClass320_1 = null;
				Static651.aClass122_38.aClass320_2 = null;
			}
		} catch (@Pc(307) IOException local307) {
			Static309.aClass251_4 = null;
			Static600.aClass130_8 = null;
			Static646.aClass130_7 = null;
			Static370.aClass130_4 = null;
		}
		if (Static520.aClass352_8 != Static41.aClass352_2) {
			Static46.aBoolean42 = true;
		}
		Static299.aString59 = Static50.aClass43_12.method596(Static601.anInt9518);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1044() {
		if (Static371.anApplet1 != null && Static4.aCanvas1 == null && !Static651.aClass122_38.aBoolean282) {
			try {
				@Pc(25) Class local25 = Static371.anApplet1.getClass();
				@Pc(31) Field local31 = local25.getDeclaredField("canvas");
				Static4.aCanvas1 = (Canvas) local31.get(Static371.anApplet1);
				local31.set(Static371.anApplet1, (Object) null);
				if (Static4.aCanvas1 != null) {
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		super.method1044();
	}
}
