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
				Static28.method395("Argument count");
			}
			Static87.aClass314_2 = new Class314();
			Static87.aClass314_2.anInt9072 = Integer.parseInt(arg0[0]);
			Static60.aClass314_1 = new Class314();
			Static60.aClass314_1.anInt9072 = Integer.parseInt(arg0[1]);
			Static487.aClass371_7 = Static533.aClass371_8;
			if (arg0[3].equals("live")) {
				Static593.aClass146_3 = Static624.aClass146_4;
			} else if (arg0[3].equals("rc")) {
				Static593.aClass146_3 = Static25.aClass146_1;
			} else if (arg0[3].equals("wip")) {
				Static593.aClass146_3 = Static432.aClass146_2;
			} else {
				Static28.method395("modewhat");
			}
			Static141.anInt2658 = Static56.method721(arg0[4]);
			if (Static141.anInt2658 == -1) {
				if (arg0[4].equals("english")) {
					Static141.anInt2658 = 0;
				} else if (arg0[4].equals("german")) {
					Static141.anInt2658 = 1;
				} else {
					Static28.method395("language");
				}
			}
			Static408.aBoolean568 = false;
			Static215.aBoolean348 = false;
			if (arg0[5].equals("game0")) {
				Static667.aClass169_8 = Static615.aClass169_7;
			} else if (arg0[5].equals("game1")) {
				Static667.aClass169_8 = Static726.aClass169_12;
			} else if (arg0[5].equals("game2")) {
				Static667.aClass169_8 = Static530.aClass169_5;
			} else if (arg0[5].equals("game3")) {
				Static667.aClass169_8 = Static681.aClass169_10;
			} else {
				Static28.method395("game");
			}
			Static194.anInt3394 = 0;
			Static721.anInt3580 = 0;
			Static391.aBoolean552 = false;
			Static12.aByteArray2 = null;
			Static50.anInt851 = 0;
			Static236.aString77 = "";
			Static48.anInt821 = Static667.aClass169_8.anInt4889;
			Static547.aBoolean675 = false;
			Static252.aString81 = null;
			Static722.aBoolean815 = true;
			Static608.aBoolean714 = true;
			Static184.aLong116 = 0L;
			@Pc(237) client local237 = new client();
			Static556.aClient1 = local237;
			local237.method1160(Static667.aClass169_8.aString83, Static593.aClass146_3.method3648() + 32);
			Static131.aFrame1.setLocation(40, 40);
		} catch (@Pc(260) Exception local260) {
			Static64.method799((String) null, local260);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1162(@OriginalArg(0) int arg0) {
		Static406.aClass153_2.anInt4577 = arg0;
		Static137.aClass375_1 = null;
		Static406.aClass153_2.anInt4578++;
		Static653.anInt10490 = 0;
		Static622.aClass201_7 = null;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1148() {
		if (Static547.aBoolean675) {
			Static719.anInt11246 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static599.method8246();
		Static537.aClass259_2 = new Class259(Static310.aClass47_4);
		Static406.aClass153_2 = new Class153();
		Static643.method8691(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static364.aClass371_4 != Static487.aClass371_7) {
			Static441.aByteArrayArray10 = new byte[50][];
		}
		Static713.aClass3_Sub55_31 = Static639.method8663();
		if (Static487.aClass371_7 == Static364.aClass371_4) {
			Static87.aClass314_2.aString117 = this.getCodeBase().getHost();
		} else if (Static699.method9150(Static487.aClass371_7)) {
			Static87.aClass314_2.aString117 = this.getCodeBase().getHost();
			Static87.aClass314_2.anInt9071 = Static87.aClass314_2.anInt9072 + 40000;
			Static87.aClass314_2.anInt9073 = Static87.aClass314_2.anInt9072 + 50000;
			Static60.aClass314_1.anInt9071 = Static60.aClass314_1.anInt9072 + 40000;
			Static60.aClass314_1.anInt9073 = Static60.aClass314_1.anInt9072 + 50000;
		} else if (Static487.aClass371_7 == Static533.aClass371_8) {
			Static87.aClass314_2.aString117 = "127.0.0.1";
			Static60.aClass314_1.aString117 = "127.0.0.1";
			Static87.aClass314_2.anInt9071 = Static87.aClass314_2.anInt9072 + 40000;
			Static60.aClass314_1.anInt9071 = Static60.aClass314_1.anInt9072 + 40000;
			Static87.aClass314_2.anInt9073 = Static87.aClass314_2.anInt9072 + 50000;
			Static60.aClass314_1.anInt9073 = Static60.aClass314_1.anInt9072 + 50000;
		}
		if (Static615.aClass169_7 == Static667.aClass169_8) {
			Static171.aBoolean258 = false;
		}
		Static272.aClass314_7 = Static87.aClass314_2;
		Static65.aShortArray23 = Static529.aShortArray141 = Static431.aShortArray129 = Static422.aShortArray125 = new short[256];
		try {
			Static118.aClipboard1 = Static556.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(185) Exception local185) {
		}
		Static419.aClass133_1 = Static697.method9140(Static67.aCanvas1);
		Static714.aClass161_1 = Static573.method7946(Static67.aCanvas1);
		try {
			if (Static310.aClass47_4.aClass333_3 != null) {
				Static431.aClass325_6 = new Class325(Static310.aClass47_4.aClass333_3, 5200, 0);
				for (@Pc(207) int local207 = 0; local207 < 37; local207++) {
					Static405.aClass325Array1[local207] = new Class325(Static310.aClass47_4.aClass333Array1[local207], 6000, 0);
				}
				Static539.aClass325_7 = new Class325(Static310.aClass47_4.aClass333_1, 6000, 0);
				Static437.aClass73_4 = new Class73(255, Static431.aClass325_6, Static539.aClass325_7, 500000);
				Static667.aClass325_8 = new Class325(Static310.aClass47_4.aClass333_2, 24, 0);
				Static310.aClass47_4.aClass333Array1 = null;
				Static310.aClass47_4.aClass333_3 = null;
				Static310.aClass47_4.aClass333_1 = null;
				Static310.aClass47_4.aClass333_2 = null;
			}
		} catch (@Pc(267) IOException local267) {
			Static539.aClass325_7 = null;
			Static667.aClass325_8 = null;
			Static437.aClass73_4 = null;
			Static431.aClass325_6 = null;
		}
		if (Static487.aClass371_7 != Static364.aClass371_4) {
			Static226.aBoolean354 = true;
		}
		Static111.aString32 = Static476.aClass279_12.method6992(Static141.anInt2658);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1169(@OriginalArg(0) byte arg0) {
		@Pc(46) int local46;
		if (Static178.anInt3225 == 7 && !Static651.method8741() || Static178.anInt3225 == 9 && Static249.anInt8065 == 42) {
			if (Static49.anInt834 > 1) {
				Static49.anInt834--;
				Static372.anInt6365 = Static210.anInt3647;
			}
			if (!Static555.aBoolean678) {
				Static716.method9348();
			}
			for (local46 = 0; local46 < 100 && Static71.method908(Static532.aClass400_2); local46++) {
			}
		}
		Static387.anInt6950++;
		Static145.method2394(-1, -1, (Class20) null);
		Static69.method855((Class20) null, -1, -1);
		Static96.method1286();
		Static210.anInt3647++;
		local46 = 0;
		if (arg0 <= 93) {
			return;
		}
		while (Static32.anInt518 > local46) {
			@Pc(102) Class19_Sub1_Sub3_Sub2_Sub1 local102 = Static95.aClass3_Sub13Array1[local46].aClass19_Sub1_Sub3_Sub2_Sub1_2;
			if (local102 != null) {
				@Pc(108) byte local108 = local102.aClass18_1.aByte9;
				if ((local108 & 0x1) != 0) {
					@Pc(116) int local116 = local102.method6592();
					@Pc(144) int local144;
					if ((local108 & 0x2) != 0 && local102.anInt7824 == 0 && Math.random() * 1000.0D < 10.0D) {
						local144 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(152) int local152 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local144 != 0 || local152 != 0) {
							@Pc(171) int local171 = local144 + local102.anIntArray430[0];
							@Pc(178) int local178 = local152 + local102.lb[0];
							if (local171 < 0) {
								local171 = 0;
							} else if (local171 > Static362.anInt8653 - local116 - 1) {
								local171 = Static362.anInt8653 - local116 - 1;
							}
							if (local178 < 0) {
								local178 = 0;
							} else if (local178 > Static206.anInt11291 - local116 - 1) {
								local178 = Static206.anInt11291 - local116 - 1;
							}
							@Pc(256) int local256 = Static135.method2225(local116, local116, Static298.anIntArray221, local171, Static678.aClass360Array5[local102.aByte146], local102.lb[0], local116, true, -1, Static104.anIntArray97, 0, local178, 0, local102.anIntArray430[0]);
							if (local256 > 0) {
								if (local256 > 9) {
									local256 = 9;
								}
								for (@Pc(272) int local272 = 0; local272 < local256; local272++) {
									local102.anIntArray430[local272] = Static298.anIntArray221[local256 - local272 - 1];
									local102.lb[local272] = Static104.anIntArray97[local256 - local272 - 1];
									local102.aByteArray69[local272] = 1;
								}
								local102.anInt7824 = local256;
							}
						}
					}
					Static405.method6061(true, local102);
					local144 = Static364.method5201(local102);
					Static605.method8304(local102);
					Static344.method5027(Static258.anInt4778, Static255.anInt4769, local102, local144);
					Static649.method8733(Static258.anInt4778, local102);
					Static460.method6824(local102);
				}
			}
			local46++;
		}
		if ((Static178.anInt3225 == 3 || Static178.anInt3225 == 9 || Static178.anInt3225 == 7) && (!Static651.method8741() || Static178.anInt3225 == 9 && Static249.anInt8065 == 42) && Static556.anInt9262 == 0) {
			if (Static175.anInt10579 == 2) {
				Static681.method8986();
			} else {
				Static460.method6827();
			}
			if (Static173.anInt3144 >> 9 < 14 || Static362.anInt8653 - 14 <= Static173.anInt3144 >> 9 || Static235.anInt4471 >> 9 < 14 || Static235.anInt4471 >> 9 >= Static206.anInt11291 - 14) {
				Static485.method6258();
			}
		}
		while (true) {
			@Pc(444) Class3_Sub7 local444;
			@Pc(449) Class20 local449;
			@Pc(464) Class20 local464;
			do {
				local444 = (Class3_Sub7) Static357.aClass357_32.method8398();
				if (local444 == null) {
					while (true) {
						do {
							local444 = (Class3_Sub7) Static439.aClass357_44.method8398();
							if (local444 == null) {
								while (true) {
									do {
										local444 = (Class3_Sub7) Static102.aClass357_6.method8398();
										if (local444 == null) {
											if (Static509.aClass20_16 != null) {
												Static191.method2898();
											}
											if (Static269.anInt4883 % 1500 == 0) {
												Static470.method6954();
											}
											if (Static178.anInt3225 == 7 && !Static651.method8741() || Static178.anInt3225 == 9 && Static249.anInt8065 == 42) {
												Static623.method8439();
											}
											Static28.method397();
											if (Static171.aBoolean259 && Static298.aLong137 < Static626.method8479() - 60000L) {
												Static423.method6246();
											}
											for (@Pc(657) Class19_Sub4_Sub2 local657 = (Class19_Sub4_Sub2) Static451.aClass66_7.method1381(); local657 != null; local657 = (Class19_Sub4_Sub2) Static451.aClass66_7.method1380()) {
												if (Static626.method8479() / 1000L - 5L > (long) local657.anInt8654) {
													if (local657.aShort117 > 0) {
														Static170.method2681("", 5, 0, local657.aString114 + Static476.aClass279_19.method6992(Static141.anInt2658), "", "");
													}
													if (local657.aShort117 == 0) {
														Static170.method2681("", 5, 0, local657.aString114 + Static476.aClass279_20.method6992(Static141.anInt2658), "", "");
													}
													local657.method9359();
												}
											}
											if (Static178.anInt3225 == 7 && !Static651.method8741() || Static178.anInt3225 == 9 && Static249.anInt8065 == 42) {
												if (Static178.anInt3225 != 9 && Static532.aClass400_2.aClass255_2 == null) {
													Static483.method7049(false);
													return;
												}
												if (Static532.aClass400_2 != null) {
													Static532.aClass400_2.anInt11060++;
													if (Static532.aClass400_2.anInt11060 > 50) {
														@Pc(806) Class3_Sub48 local806 = Static89.method1200(Static262.aClass286_46, Static532.aClass400_2.aClass399_2);
														Static532.aClass400_2.method9223(local806);
													}
													try {
														Static532.aClass400_2.method9227();
														return;
													} catch (@Pc(815) IOException local815) {
														if (Static178.anInt3225 == 9) {
															Static532.aClass400_2.method9229();
															return;
														}
														Static483.method7049(false);
														return;
													}
												}
											}
											return;
										}
										local449 = local444.aClass20_2;
										if (local449.anInt583 < 0) {
											break;
										}
										local464 = Static118.method2045(local449.anInt556);
									} while (local464 == null || local464.aClass20Array1 == null || local449.anInt583 >= local464.aClass20Array1.length || local449 != local464.aClass20Array1[local449.anInt583]);
									Static185.method2811(local444);
								}
							}
							local449 = local444.aClass20_2;
							if (local449.anInt583 < 0) {
								break;
							}
							local464 = Static118.method2045(local449.anInt556);
						} while (local464 == null || local464.aClass20Array1 == null || local449.anInt583 >= local464.aClass20Array1.length || local449 != local464.aClass20Array1[local449.anInt583]);
						Static185.method2811(local444);
					}
				}
				local449 = local444.aClass20_2;
				if (local449.anInt583 < 0) {
					break;
				}
				local464 = Static118.method2045(local449.anInt556);
			} while (local464 == null || local464.aClass20Array1 == null || local464.aClass20Array1.length <= local449.anInt583 || local464.aClass20Array1[local449.anInt583] != local449);
			Static185.method2811(local444);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1155() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1150() {
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != 2) {
			this.method1176();
			return;
		}
		try {
			this.method1176();
		} catch (@Pc(24) ThreadDeath local24) {
			throw local24;
		} catch (@Pc(27) Throwable local27) {
			Static64.method799(local27.getMessage() + " (Recovered) " + this.method1159(), local27);
			Static72.aBoolean91 = true;
			Static718.method9389(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1172() {
		@Pc(7) boolean local7 = Static406.aClass153_2.method3736();
		if (!local7) {
			this.method1175();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1146() {
		if (Static171.aBoolean259) {
			Static423.method6246();
		}
		Static135.method2227();
		if (Static488.aClass67_12 != null) {
			Static488.aClass67_12.method7681();
		}
		if (Static691.aFrame2 != null) {
			Static430.method6332(Static691.aFrame2, Static310.aClass47_4);
			Static691.aFrame2 = null;
		}
		Static532.aClass400_3.method9229();
		Static532.aClass400_2.method9229();
		Static17.method291();
		Static406.aClass153_2.method3733();
		Static537.aClass259_2.method6369();
		if (Static371.aClass383_1 != null) {
			Static371.aClass383_1.method8939();
			Static371.aClass383_1 = null;
		}
		try {
			Static431.aClass325_6.method7816();
			for (@Pc(67) int local67 = 0; local67 < 37; local67++) {
				Static405.aClass325Array1[local67].method7816();
			}
			Static539.aClass325_7.method7816();
			Static667.aClass325_8.method7816();
			Static480.method7024();
		} catch (@Pc(96) Exception local96) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1154()) {
			return;
		}
		Static87.aClass314_2 = new Class314();
		Static87.aClass314_2.anInt9072 = Integer.parseInt(this.getParameter("worldid"));
		Static60.aClass314_1 = new Class314();
		Static60.aClass314_1.anInt9072 = Integer.parseInt(this.getParameter("lobbyid"));
		Static60.aClass314_1.aString117 = this.getParameter("lobbyaddress");
		Static487.aClass371_7 = Static709.method9379(Integer.parseInt(this.getParameter("modewhere")));
		if (Static533.aClass371_8 == Static487.aClass371_7) {
			Static487.aClass371_7 = Static547.aClass371_9;
		} else if (!Static699.method9150(Static487.aClass371_7) && Static487.aClass371_7 != Static364.aClass371_4) {
			Static487.aClass371_7 = Static364.aClass371_4;
		}
		Static593.aClass146_3 = Static313.method4725(Integer.parseInt(this.getParameter("modewhat")));
		if (Static432.aClass146_2 != Static593.aClass146_3 && Static25.aClass146_1 != Static593.aClass146_3 && Static593.aClass146_3 != Static624.aClass146_4) {
			Static593.aClass146_3 = Static624.aClass146_4;
		}
		try {
			Static141.anInt2658 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			Static141.anInt2658 = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static408.aBoolean568 = true;
		} else {
			Static408.aBoolean568 = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static215.aBoolean348 = true;
		} else {
			Static215.aBoolean348 = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static202.aBoolean285 = true;
		} else {
			Static202.aBoolean285 = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static667.aClass169_8 = Static615.aClass169_7;
			} else if (local190.equals("1")) {
				Static667.aClass169_8 = Static726.aClass169_12;
			} else if (local190.equals("2")) {
				Static667.aClass169_8 = Static530.aClass169_5;
			} else if (local190.equals("3")) {
				Static667.aClass169_8 = Static681.aClass169_10;
			}
		}
		try {
			Static721.anInt3580 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static721.anInt3580 = 0;
		}
		Static117.aString33 = this.getParameter("quiturl");
		Static236.aString77 = this.getParameter("settings");
		if (Static236.aString77 == null) {
			Static236.aString77 = "";
		}
		Static47.aBoolean63 = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static194.anInt3394 = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static194.anInt3394 = 0;
			}
		}
		Static48.anInt821 = Integer.parseInt(this.getParameter("colourid"));
		if (Static48.anInt821 < 0 || Static15.aColorArray1.length <= Static48.anInt821) {
			Static48.anInt821 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static722.aBoolean815 = true;
			Static608.aBoolean714 = true;
		}
		@Pc(332) String local332 = this.getParameter("frombilling");
		if (local332 != null && local332.equals("true")) {
			Static391.aBoolean552 = true;
		}
		@Pc(352) String local352 = this.getParameter("sskey");
		if (local352 != null) {
			Static12.aByteArray2 = Static201.method3004(Static673.method8917(local352));
			if (Static12.aByteArray2.length < 16) {
				Static12.aByteArray2 = null;
			}
		}
		@Pc(376) String local376 = this.getParameter("force64mb");
		if (local376 != null && local376.equals("true")) {
			Static547.aBoolean675 = true;
		}
		@Pc(396) String local396 = this.getParameter("worldflags");
		if (local396 != null) {
			try {
				Static50.anInt851 = Integer.parseInt(local396);
			} catch (@Pc(403) Exception local403) {
			}
		}
		@Pc(410) String local410 = this.getParameter("userFlow");
		if (local410 != null) {
			try {
				Static184.aLong116 = Long.parseLong(local410);
			} catch (@Pc(418) NumberFormatException local418) {
			}
		}
		Static252.aString81 = this.getParameter("additionalInfo");
		if (Static252.aString81 != null && Static252.aString81.length() > 50) {
			Static252.aString81 = null;
		}
		Static556.aClient1 = this;
		if (Static615.aClass169_7 == Static667.aClass169_8) {
			Static426.anInt7511 = 503;
			Static347.anInt2639 = 765;
		} else if (Static667.aClass169_8 == Static726.aClass169_12) {
			Static426.anInt7511 = 480;
			Static347.anInt2639 = 640;
		}
		this.method1157(Static426.anInt7511, Static347.anInt2639, Static667.aClass169_8.aString83, Static593.aClass146_3.method3648() + 32);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1175() {
		if (Static406.aClass153_2.anInt4578 > Static151.anInt2813) {
			Static272.aClass314_7.method7592();
			Static248.anInt4611 = (Static406.aClass153_2.anInt4578 * 50 - 50) * 5;
			if (Static248.anInt4611 > 3000) {
				Static248.anInt4611 = 3000;
			}
			if (Static406.aClass153_2.anInt4578 >= 2 && Static406.aClass153_2.anInt4577 == 6) {
				this.method1153("js5connect_outofdate");
				Static178.anInt3225 = 16;
				return;
			}
			if (Static406.aClass153_2.anInt4578 >= 4 && Static406.aClass153_2.anInt4577 == -1) {
				this.method1153("js5crc");
				Static178.anInt3225 = 16;
				return;
			}
			if (Static406.aClass153_2.anInt4578 >= 4 && Static462.method6845(Static178.anInt3225)) {
				if (Static406.aClass153_2.anInt4577 == 7 || Static406.aClass153_2.anInt4577 == 9) {
					this.method1153("js5connect_full");
				} else if (Static406.aClass153_2.anInt4577 <= 0) {
					this.method1153("js5io");
				} else if (Static166.aString56 == null) {
					this.method1153("js5connect");
				} else {
					this.method1153("js5proxy_" + Static166.aString56.trim());
				}
				Static178.anInt3225 = 16;
				return;
			}
		}
		Static151.anInt2813 = Static406.aClass153_2.anInt4578;
		if (Static248.anInt4611 > 0) {
			Static248.anInt4611--;
			return;
		}
		try {
			if (Static653.anInt10490 == 0) {
				Static622.aClass201_7 = Static272.aClass314_7.method7595(Static310.aClass47_4);
				Static653.anInt10490++;
			}
			if (Static653.anInt10490 == 1) {
				if (Static622.aClass201_7.anInt5729 == 2) {
					if (Static622.aClass201_7.anObject16 != null) {
						Static166.aString56 = (String) Static622.aClass201_7.anObject16;
					}
					this.method1162(1000);
					return;
				}
				if (Static622.aClass201_7.anInt5729 == 1) {
					Static653.anInt10490++;
				}
			}
			if (Static653.anInt10490 == 2) {
				Static137.aClass375_1 = new Class375((Socket) Static622.aClass201_7.anObject16, Static310.aClass47_4, 25000);
				@Pc(243) Class3_Sub28 local243 = new Class3_Sub28(5);
				local243.method5329(Static504.aClass309_2.anInt8976);
				local243.method5311(663);
				Static137.aClass375_1.method8813(5, local243.aByteArray50);
				Static653.anInt10490++;
				Static322.aLong191 = Static626.method8479();
			}
			if (Static653.anInt10490 == 3) {
				if (Static462.method6845(Static178.anInt3225) || Static137.aClass375_1.method8814() > 0) {
					@Pc(285) int local285 = Static137.aClass375_1.method8812();
					if (local285 != 0) {
						this.method1162(local285);
						return;
					}
					Static653.anInt10490++;
				} else if (Static626.method8479() - Static322.aLong191 > 30000L) {
					this.method1162(1001);
					return;
				}
			}
			if (Static653.anInt10490 == 4) {
				@Pc(346) boolean local346 = Static462.method6845(Static178.anInt3225) || Static645.method8716(Static178.anInt3225) || Static549.method7771(Static178.anInt3225);
				@Pc(349) Class390[] local349 = Static692.method9082();
				@Pc(357) Class3_Sub28 local357 = new Class3_Sub28(local349.length * 4);
				Static137.aClass375_1.method8817(0, local357.aByteArray50.length, local357.aByteArray50);
				for (@Pc(368) int local368 = 0; local368 < local349.length; local368++) {
					local349[local368].method9081(local357.method5312());
				}
				Static406.aClass153_2.method3741(Static137.aClass375_1, !local346);
				Static653.anInt10490 = 0;
				Static622.aClass201_7 = null;
				Static137.aClass375_1 = null;
			}
		} catch (@Pc(407) IOException local407) {
			this.method1162(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1176() {
		if (Static178.anInt3225 == 16) {
			return;
		}
		@Pc(25) long local25 = Static71.method912() / 1000000L - Static103.aLong79;
		Static103.aLong79 = Static71.method912() / 1000000L;
		@Pc(33) boolean local33 = Static9.method136(0);
		if (local33 && Static578.aBoolean688 && Static164.aClass33_1 != null) {
			Static164.aClass33_1.method8228();
		}
		if (Static424.method6249(Static178.anInt3225)) {
			if (Static92.aLong74 != 0L && Static92.aLong74 < Static626.method8479()) {
				Static354.method5127(Static348.anInt5931, Static546.anInt9179, false, Static502.method7210());
			} else if (!Static488.aClass67_12.method7684() && Static489.aBoolean633) {
				Static646.method8721();
			}
		}
		@Pc(117) int local117;
		@Pc(121) int local121;
		if (Static691.aFrame2 == null) {
			@Pc(101) Container local101;
			if (Static131.aFrame1 != null) {
				local101 = Static131.aFrame1;
			} else if (Static395.anApplet1 == null) {
				local101 = Static31.anApplet_Sub1_3;
			} else {
				local101 = Static395.anApplet1;
			}
			local117 = local101.getSize().width;
			local121 = local101.getSize().height;
			if (local101 == Static131.aFrame1) {
				@Pc(127) Insets local127 = Static131.aFrame1.getInsets();
				local117 -= local127.right + local127.left;
				local121 -= local127.bottom + local127.top;
			}
			if (local117 != Static554.anInt9243 || local121 != Static57.anInt8465 || Static169.aBoolean257) {
				if (Static488.aClass67_12 == null || Static488.aClass67_12.method7637()) {
					Static599.method8246();
				} else {
					Static554.anInt9243 = local117;
					Static57.anInt8465 = local121;
				}
				Static92.aLong74 = Static626.method8479() + 500L;
				Static169.aBoolean257 = false;
			}
		}
		if (Static691.aFrame2 != null && !Static153.aBoolean230 && Static424.method6249(Static178.anInt3225)) {
			Static354.method5127(-1, -1, false, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900());
		}
		@Pc(208) boolean local208 = false;
		if (Static581.aBoolean690) {
			Static581.aBoolean690 = false;
			local208 = true;
		}
		if (local208) {
			Static458.method6794();
		}
		if (Static488.aClass67_12 != null && Static488.aClass67_12.method7684() || Static502.method7210() != 1) {
			Static693.method9085();
		}
		if (Static462.method6845(Static178.anInt3225)) {
			Static505.method7234(local208);
		} else if (Static439.method6394(Static178.anInt3225)) {
			Static429.method6329();
		} else if (Static571.method7928(Static178.anInt3225)) {
			Static429.method6329();
		} else if (Static87.method1179(Static178.anInt3225)) {
			if (Static400.anInt7156 == 1) {
				if (Static234.anInt4458 < Static553.anInt9240) {
					Static234.anInt4458 = Static553.anInt9240;
				}
				local117 = (Static234.anInt4458 - Static553.anInt9240) * 50 / Static234.anInt4458;
				Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_12.method6992(Static141.anInt2658) + "<br>(" + local117 + "%)", true, Static418.aClass44_32);
			} else if (Static400.anInt7156 == 2) {
				if (Static339.anInt5858 > Static260.anInt4804) {
					Static260.anInt4804 = Static339.anInt5858;
				}
				local117 = (Static260.anInt4804 - Static339.anInt5858) * 50 / Static260.anInt4804 + 50;
				Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_12.method6992(Static141.anInt2658) + "<br>(" + local117 + "%)", true, Static418.aClass44_32);
			} else {
				Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_12.method6992(Static141.anInt2658), true, Static418.aClass44_32);
			}
		} else if (Static178.anInt3225 == 11) {
			Static682.method9017(local25);
		} else if (Static178.anInt3225 == 14) {
			Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_14.method6992(Static141.anInt2658) + "<br>" + Static476.aClass279_15.method6992(Static141.anInt2658), false, Static418.aClass44_32);
		} else if (Static178.anInt3225 == 15) {
			Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_31.method6992(Static141.anInt2658), false, Static418.aClass44_32);
		}
		if (Static59.anInt936 == 3) {
			for (local117 = 0; local117 < Static583.anInt9536; local117++) {
				@Pc(470) Rectangle local470 = Class320.aRectangleArray2[local117];
				if (Static589.aBooleanArray26[local117]) {
					Static488.aClass67_12.method7647(-65281, local470.x, local470.y, local470.height, local470.width);
				} else if (Static565.aBooleanArray24[local117]) {
					Static488.aClass67_12.method7647(-65536, local470.x, local470.y, local470.height, local470.width);
				} else {
					Static488.aClass67_12.method7647(-16711936, local470.x, local470.y, local470.height, local470.width);
				}
			}
		}
		if (Static92.method1254()) {
			Static533.method7503(Static488.aClass67_12);
		}
		if (Static310.aClass47_4.aBoolean98 && Static424.method6249(Static178.anInt3225) && Static59.anInt936 == 0 && Static502.method7210() == 1 && !local208) {
			local117 = 0;
			for (local121 = 0; local121 < Static583.anInt9536; local121++) {
				if (Static565.aBooleanArray24[local121]) {
					Static565.aBooleanArray24[local121] = false;
					Static147.aRectangleArray1[local117++] = Class320.aRectangleArray2[local121];
				}
			}
			try {
				if (Static178.aBoolean264) {
					Static520.method7404(Static147.aRectangleArray1, local117);
				} else {
					Static488.aClass67_12.method7674(local117, Static147.aRectangleArray1);
				}
			} catch (@Pc(616) Exception_Sub1 local616) {
			}
		} else if (!Static462.method6845(Static178.anInt3225)) {
			for (local117 = 0; local117 < Static583.anInt9536; local117++) {
				Static565.aBooleanArray24[local117] = false;
			}
			try {
				if (Static178.aBoolean264) {
					Static101.method1319();
				} else {
					Static488.aClass67_12.method7676();
				}
			} catch (@Pc(657) Exception_Sub1 local657) {
				Static64.method799(local657.getMessage() + " (Recovered) " + this.method1159(), local657);
				Static718.method9389(0, false);
			}
		}
		Static268.method4108();
		local117 = Static713.aClass3_Sub55_31.aClass15_Sub6_1.method2392();
		if (local117 == 0) {
			Static564.method7845(15L);
		} else if (local117 == 1) {
			Static564.method7845(10L);
		} else if (local117 == 2) {
			Static564.method7845(5L);
		} else if (local117 == 3) {
			Static564.method7845(2L);
		}
		if (Static498.aBoolean639) {
			Static375.method5418();
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub13_1.method4638() == 1 && Static178.anInt3225 == 3 && Static633.anInt3426 != -1) {
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub13_1, 0);
			Static328.method4885();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1159() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static714.anInt11156 + "," + Static339.anInt5859 + "," + Static362.anInt8653 + "," + Static206.anInt11291 + "|";
			if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 != null) {
				local7 = local7 + "2)" + Static712.anInt11117 + "," + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] + Static714.anInt11156) + "," + (Static339.anInt5859 + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0]) + "|";
			}
			local7 = local7 + "3)" + Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() + "|4)" + Static713.aClass3_Sub55_31.aClass15_Sub20_1.method7387() + "|5)" + Static502.method7210() + "|6)" + Static575.anInt9435 + "," + Static272.anInt5005 + "|";
			local7 = local7 + "7)" + Static713.aClass3_Sub55_31.aClass15_Sub28_1.method9169() + "|";
			local7 = local7 + "8)" + Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987() + "|";
			local7 = local7 + "9)" + Static713.aClass3_Sub55_31.aClass15_Sub30_1.method9427() + "|";
			local7 = local7 + "10)" + Static713.aClass3_Sub55_31.aClass15_Sub26_1.method8908() + "|";
			local7 = local7 + "11)" + Static713.aClass3_Sub55_31.aClass15_Sub12_1.method4585() + "|";
			local7 = local7 + "12)" + Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() + "|";
			local7 = local7 + "13)" + Static719.anInt11246 + "|";
			local7 = local7 + "14)" + Static178.anInt3225;
			if (Static50.aClass3_Sub25_1 != null) {
				local7 = local7 + "|15)" + Static50.aClass3_Sub25_1.anInt4197;
			}
			try {
				if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 2) {
					@Pc(274) Class local274 = Class.forName("java.lang.ClassLoader");
					@Pc(280) Field local280 = local274.getDeclaredField("nativeLibraries");
					@Pc(285) Class local285 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(297) Method local297 = local285.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local297.invoke(local280, Boolean.TRUE);
					@Pc(323) Vector local323 = (Vector) local280.get((Static87.aClass6 == null ? (Static87.aClass6 = a("client")) : Static87.aClass6).getClassLoader());
					for (@Pc(325) int local325 = 0; local325 < local323.size(); local325++) {
						try {
							@Pc(331) Object local331 = local323.elementAt(local325);
							@Pc(338) Field local338 = local331.getClass().getDeclaredField("name");
							local297.invoke(local338, Boolean.TRUE);
							try {
								@Pc(353) String local353 = (String) local338.get(local331);
								if (local353 != null && local353.indexOf("sw3d.dll") != -1) {
									@Pc(371) Field local371 = local331.getClass().getDeclaredField("handle");
									local297.invoke(local371, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local371.getLong(local331));
									local297.invoke(local371, Boolean.FALSE);
								}
							} catch (@Pc(409) Throwable local409) {
							}
							local297.invoke(local338, Boolean.FALSE);
						} catch (@Pc(421) Throwable local421) {
						}
					}
				}
			} catch (@Pc(435) Throwable local435) {
			}
			local7 = local7 + "]";
		} catch (@Pc(450) Throwable local450) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1151() {
		if (Static395.anApplet1 != null && Static67.aCanvas1 == null && !Static310.aClass47_4.aBoolean98) {
			try {
				@Pc(17) Class local17 = Static395.anApplet1.getClass();
				@Pc(23) Field local23 = local17.getDeclaredField("canvas");
				Static67.aCanvas1 = (Canvas) local23.get(Static395.anApplet1);
				local23.set(Static395.anApplet1, (Object) null);
				if (Static67.aCanvas1 != null) {
					return;
				}
			} catch (@Pc(37) Exception local37) {
			}
		}
		super.method1151();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1144() {
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != 2) {
			this.method1181();
			return;
		}
		try {
			this.method1181();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static64.method799(local25.getMessage() + " (Recovered) " + this.method1159(), local25);
			Static72.aBoolean91 = true;
			Static718.method9389(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1181() {
		if (Static178.anInt3225 == 16) {
			return;
		}
		Static269.anInt4883++;
		if (Static269.anInt4883 % 1000 == 1) {
			@Pc(23) GregorianCalendar local23 = new GregorianCalendar();
			Static625.anInt10097 = local23.get(11) * 600 + local23.get(12) * 10 + local23.get(13) / 6;
			Static484.aRandom1.setSeed((long) Static625.anInt10097);
		}
		Static532.aClass400_3.method9225();
		Static532.aClass400_2.method9225();
		this.method1172();
		if (Static30.aClass389_1 != null) {
			Static30.aClass389_1.method9066();
		}
		Static232.method3645();
		Static675.method8937();
		Static419.aClass133_1.method3452();
		Static714.aClass161_1.method8574();
		if (Static488.aClass67_12 != null) {
			Static488.aClass67_12.method7709((int) Static626.method8479());
		}
		Static472.method6963();
		Static225.anInt4285 = 0;
		Static401.anInt7165 = 0;
		for (@Pc(100) Interface3 local100 = Static419.aClass133_1.method3448(); local100 != null; local100 = Static419.aClass133_1.method3448()) {
			@Pc(108) int local108 = local100.method664();
			if (local108 == 2 || local108 == 3) {
				@Pc(122) char local122 = local100.method668();
				if (Static277.method4237() && (local122 == '`' || local122 == '§' || local122 == '²')) {
					if (Static92.method1254()) {
						Static692.method9076();
					} else {
						Static545.method5923();
					}
				} else if (Static225.anInt4285 < 128) {
					Static165.anInterface3Array2[Static225.anInt4285] = local100;
					Static225.anInt4285++;
				}
			} else if (local108 == 0 && Static401.anInt7165 < 75) {
				Static127.anInterface3Array1[Static401.anInt7165] = local100;
				Static401.anInt7165++;
			}
		}
		Static217.anInt4222 = 0;
		for (@Pc(215) Class3_Sub14 local215 = Static714.aClass161_1.method8578(); local215 != null; local215 = Static714.aClass161_1.method8578()) {
			@Pc(223) int local223 = local215.method4295();
			if (local223 == -1) {
				Static314.aClass357_27.method8401(local215);
			} else if (local223 == 6) {
				Static217.anInt4222 += local215.method4298();
			} else if (Static531.method7499(local223)) {
				Static641.aClass357_61.method8401(local215);
				if (Static641.aClass357_61.method8397() > 10) {
					Static641.aClass357_61.method8398();
				}
			}
		}
		if (Static92.method1254()) {
			Static414.method6153();
		}
		if (Static462.method6845(Static178.anInt3225)) {
			Static221.method3512();
			Static588.method8089();
		} else if (Static87.method1179(Static178.anInt3225)) {
			Static646.method8719();
		}
		if (Static645.method8716(Static178.anInt3225) && !Static87.method1179(Static178.anInt3225)) {
			this.method1169((byte) 124);
			Static386.method3992();
			Static168.method8924();
		} else if (Static549.method7771(Static178.anInt3225) && !Static87.method1179(Static178.anInt3225)) {
			this.method1169((byte) 107);
			Static168.method8924();
		} else if (Static178.anInt3225 == 13) {
			Static168.method8924();
		} else if (Static56.method718(Static178.anInt3225) && !Static87.method1179(Static178.anInt3225)) {
			Static402.method6012();
		} else if (Static178.anInt3225 == 14 || Static178.anInt3225 == 15) {
			Static168.method8924();
			if (Static249.anInt8065 != -3 && Static249.anInt8065 != 2 && Static249.anInt8065 != 15) {
				if (Static178.anInt3225 == 15) {
					Static113.anInt2265 = Static249.anInt8065;
					Static718.anInt11220 = Static486.anInt8432;
					Static82.anInt1267 = Static628.anInt10152;
					if (Static703.aBoolean793) {
						Static611.method7556(Static362.aClass314_8.aString117, Static362.aClass314_8.anInt9072);
						Static532.aClass400_3.aClass255_2 = null;
						Static638.method8657(14);
					} else {
						Static483.method7049(Static284.aBoolean447);
					}
				} else {
					Static483.method7049(false);
				}
			}
		}
		Static342.method8692(Static488.aClass67_12);
		Static641.aClass357_61.method8398();
	}
}
