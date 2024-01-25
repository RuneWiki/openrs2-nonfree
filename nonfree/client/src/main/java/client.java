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
				Static171.method3052("Argument count");
			}
			Static318.aClass51_3 = new Class51();
			Static318.aClass51_3.anInt1589 = Integer.parseInt(arg0[0]);
			Static512.aClass51_5 = new Class51();
			Static512.aClass51_5.anInt1589 = Integer.parseInt(arg0[1]);
			Static399.aClass51_4 = new Class51();
			Static399.aClass51_4.anInt1589 = Integer.parseInt(arg0[2]);
			Static516.aClass272_11 = Static27.aClass272_7;
			if (arg0[3].equals("live")) {
				Static180.aClass183_4 = Static63.aClass183_3;
			} else if (arg0[3].equals("rc")) {
				Static180.aClass183_4 = Static346.aClass183_5;
			} else if (arg0[3].equals("wip")) {
				Static180.aClass183_4 = Static355.aClass183_6;
			} else {
				Static171.method3052("modewhat");
			}
			Static256.anInt4535 = Static475.method6538(arg0[4]);
			if (Static256.anInt4535 == -1) {
				if (arg0[4].equals("english")) {
					Static256.anInt4535 = 0;
				} else if (arg0[4].equals("german")) {
					Static256.anInt4535 = 1;
				} else {
					Static171.method3052("language");
				}
			}
			Static436.aBoolean546 = false;
			Static63.aBoolean115 = false;
			if (arg0[5].equals("game0")) {
				Static121.aClass274_1 = Static176.aClass274_2;
			} else if (arg0[5].equals("game1")) {
				Static121.aClass274_1 = Static473.aClass274_4;
			} else {
				Static171.method3052("game");
			}
			Static568.aString87 = "";
			Static345.anInt6051 = 0;
			Static503.anInt8181 = 0;
			Static413.aBoolean529 = false;
			Static400.aBoolean521 = false;
			Static205.aString25 = null;
			Static546.anInt8712 = Static121.aClass274_1.anInt7264;
			Static149.aLong80 = 0L;
			Static535.anInt8570 = 0;
			Static286.aString34 = null;
			Static65.aBoolean117 = true;
			Static65.aBoolean118 = true;
			@Pc(164) client local164 = new client();
			Static308.aClient1 = local164;
			local164.method1513(Static121.aClass274_1.aString69, Static180.aClass183_4.method4225() + 32);
			Static203.aFrame3.setLocation(40, 40);
		} catch (@Pc(187) Exception local187) {
			Static172.method7826(local187, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1516(@OriginalArg(1) int arg0) {
		Static363.anInt6185 = 0;
		Static574.aClass39_8 = null;
		Static391.aClass277_2.anInt7303 = arg0;
		Static73.aClass349_1 = null;
		Static391.aClass277_2.anInt7302++;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1517() {
		if (Static32.anInt602 == 14) {
			return;
		}
		@Pc(19) long local19 = Static242.method3767() / 1000000L - Static550.aLong254;
		Static550.aLong254 = Static242.method3767() / 1000000L;
		@Pc(27) boolean local27 = Static63.method1398();
		if (local27 && Static6.aBoolean1 && Static9.aClass8_3 != null) {
			Static9.aClass8_3.method5528();
		}
		if (Static385.method5693(Static32.anInt602)) {
			if (Static329.aLong225 != 0L && Static329.aLong225 < Static158.method2936()) {
				Static3.method5708(false, Static405.aClass3_Sub3_Sub1_1.anInt7569, Static405.aClass3_Sub3_Sub1_1.anInt7560, Static38.method626());
			} else if (!Static505.aClass45_11.method7417() && Static532.aBoolean661) {
				Static11.method167();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static376.aFrame4 == null) {
			@Pc(77) Container local77;
			if (Static203.aFrame3 != null) {
				local77 = Static203.aFrame3;
			} else if (Static31.anApplet1 == null) {
				local77 = Static150.anApplet_Sub1_1;
			} else {
				local77 = Static31.anApplet1;
			}
			local89 = local77.getSize().width;
			local93 = local77.getSize().height;
			if (local77 == Static203.aFrame3) {
				@Pc(99) Insets local99 = Static203.aFrame3.getInsets();
				local89 -= local99.right + local99.left;
				local93 -= local99.top + local99.bottom;
			}
			if (local89 != Static308.anInt5172 || Static570.anInt9271 != local93 || Static307.aBoolean383) {
				if (Static505.aClass45_11 == null || Static505.aClass45_11.method7391()) {
					Static18.method246();
				} else {
					Static570.anInt9271 = local93;
					Static308.anInt5172 = local89;
				}
				Static329.aLong225 = Static158.method2936() + 500L;
				Static307.aBoolean383 = false;
			}
		}
		if (Static376.aFrame4 != null && !Static301.aBoolean389 && Static385.method5693(Static32.anInt602)) {
			Static3.method5708(false, -1, -1, Static405.aClass3_Sub3_Sub1_1.anInt7570);
		}
		@Pc(165) boolean local165 = false;
		if (Static249.aBoolean332) {
			Static249.aBoolean332 = false;
			local165 = true;
		}
		if (local165) {
			Static189.method3211();
		}
		if (Static505.aClass45_11 != null && Static505.aClass45_11.method7417() || Static38.method626() != 1) {
			Static238.method3668();
		}
		if (Static309.method4507(Static32.anInt602)) {
			Static251.method3881(local165);
		} else if (Static457.method6408(Static32.anInt602)) {
			Static278.method4183();
		} else if (Static2.method43(Static32.anInt602)) {
			Static278.method4183();
		} else if (Static399.method5812(Static32.anInt602)) {
			if (Static398.anInt6933 == 1) {
				if (Static176.anInt3448 < Static122.anInt2803) {
					Static176.anInt3448 = Static122.anInt2803;
				}
				local89 = (Static176.anInt3448 - Static122.anInt2803) * 50 / Static176.anInt3448;
				Static525.method7021(Static544.aClass343_16.method7222(Static256.anInt4535) + "<br>(" + local89 + "%)", Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, true);
			} else if (Static398.anInt6933 == 2) {
				if (Static347.anInt6073 < Static303.anInt5123) {
					Static347.anInt6073 = Static303.anInt5123;
				}
				local89 = (Static347.anInt6073 - Static303.anInt5123) * 50 / Static347.anInt6073 + 50;
				Static525.method7021(Static544.aClass343_16.method7222(Static256.anInt4535) + "<br>(" + local89 + "%)", Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, true);
			} else {
				Static525.method7021(Static544.aClass343_16.method7222(Static256.anInt4535), Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, true);
			}
		} else if (Static32.anInt602 == 10) {
			Static222.method3504(local19);
		} else if (Static32.anInt602 == 13) {
			Static525.method7021(Static544.aClass343_18.method7222(Static256.anInt4535) + "<br>" + Static544.aClass343_19.method7222(Static256.anInt4535), Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, false);
		}
		if (Static475.anInt7861 == 3) {
			for (local89 = 0; local89 < Static488.anInt7959; local89++) {
				@Pc(363) Rectangle local363 = Class72_Sub6.aRectangleArray1[local89];
				if (Static326.aBooleanArray18[local89]) {
					Static505.aClass45_11.method7425(local363.height, local363.x, local363.y, -1996553985, local363.width);
				} else if (Static93.aBooleanArray4[local89]) {
					Static505.aClass45_11.method7425(local363.height, local363.x, local363.y, -1996554240, local363.width);
				}
			}
		}
		if (Static169.method3030()) {
			Static385.method5695(Static505.aClass45_11);
		}
		if (Static237.aClass258_3.aBoolean523 && Static385.method5693(Static32.anInt602) && Static475.anInt7861 == 0 && Static38.method626() == 1 && !local165) {
			local89 = 0;
			for (local93 = 0; local93 < Static488.anInt7959; local93++) {
				if (Static93.aBooleanArray4[local93]) {
					Static93.aBooleanArray4[local93] = false;
					Static501.aRectangleArray2[local89++] = Class72_Sub6.aRectangleArray1[local93];
				}
			}
			try {
				Static505.aClass45_11.method7399(Static501.aRectangleArray2, local89);
			} catch (@Pc(460) Exception_Sub1 local460) {
			}
		} else if (!Static309.method4507(Static32.anInt602)) {
			for (local89 = 0; local89 < Static488.anInt7959; local89++) {
				Static93.aBooleanArray4[local89] = false;
			}
			try {
				Static505.aClass45_11.method7386();
			} catch (@Pc(482) Exception_Sub1 local482) {
				Static172.method7826(local482, local482.getMessage() + " (Recovered) " + this.method1514());
				Static486.method6610(0);
			}
		}
		if (Static405.aClass3_Sub3_Sub1_1.anInt7568 == 0) {
			Static589.method7892(15L);
		} else if (Static405.aClass3_Sub3_Sub1_1.anInt7568 == 1) {
			Static589.method7892(10L);
		} else if (Static405.aClass3_Sub3_Sub1_1.anInt7568 == 2) {
			Static589.method7892(5L);
		} else if (Static405.aClass3_Sub3_Sub1_1.anInt7568 == 3) {
			Static589.method7892(2L);
		}
		if (Static345.aBoolean450) {
			Static29.method7113();
		}
		if (Static405.aClass3_Sub3_Sub1_1.aBoolean594 && Static32.anInt602 == 3 && Static353.anInt6188 != -1) {
			Static405.aClass3_Sub3_Sub1_1.aBoolean594 = false;
			Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1518() {
		@Pc(12) boolean local12 = Static391.aClass277_2.method6112();
		if (!local12) {
			this.method1527();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1502() {
		if (Static11.aBoolean7) {
			Static549.method7294();
		}
		Static194.method3271();
		if (Static505.aClass45_11 != null) {
			Static505.aClass45_11.method7387();
		}
		if (Static376.aFrame4 != null) {
			Static40.method656(Static237.aClass258_3, Static376.aFrame4);
			Static376.aFrame4 = null;
		}
		if (Static324.aClass165_2 != null) {
			Static324.aClass165_2.method3977();
			Static324.aClass165_2 = null;
		}
		Static472.method6508();
		Static391.aClass277_2.method6119();
		Static501.aClass217_2.method5076();
		if (Static194.aClass290_1 != null) {
			Static194.aClass290_1.method6416();
			Static194.aClass290_1 = null;
		}
		try {
			Static334.aClass226_3.method5273();
			for (@Pc(58) int local58 = 0; local58 < 35; local58++) {
				Static386.aClass226Array1[local58].method5273();
			}
			Static354.aClass226_4.method5273();
			Static527.aClass226_5.method5273();
		} catch (@Pc(77) Exception local77) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1509() {
		if (Static60.anInt1312 != 2) {
			this.method1517();
			return;
		}
		try {
			this.method1517();
		} catch (@Pc(25) ThreadDeath local25) {
			throw local25;
		} catch (@Pc(28) Throwable local28) {
			Static172.method7826(local28, local28.getMessage() + " (Recovered) " + this.method1514());
			Static486.method6610(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1504() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1522() {
		@Pc(25) int local25;
		if (Static32.anInt602 == 7 && Static407.anInt7011 == 0) {
			if (Static35.anInt636 > 1) {
				Static330.anInt5543 = Static109.anInt2171;
				Static35.anInt636--;
			}
			if (!Static150.aBoolean254) {
				Static302.method4445();
			}
			for (local25 = 0; local25 < 100 && Static324.method4689(); local25++) {
			}
		}
		Static541.anInt8161++;
		Static274.method4158(-1, null, -1);
		Static86.method5359(-1, null, -1);
		Static214.method3439();
		Static109.anInt2171++;
		for (local25 = 0; local25 < Static137.anInt2977; local25++) {
			@Pc(73) Class41_Sub2_Sub1_Sub4_Sub1 local73 = Static441.aClass3_Sub34Array1[local25].aClass41_Sub2_Sub1_Sub4_Sub1_2;
			if (local73 != null) {
				@Pc(79) byte local79 = local73.aClass264_1.aByte84;
				if ((local79 & 0x1) != 0) {
					@Pc(92) int local92 = local73.method7858();
					@Pc(116) int local116;
					if ((local79 & 0x2) != 0 && local73.anInt9535 == 0 && Math.random() * 1000.0D < 10.0D) {
						local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(124) int local124 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local116 != 0 || local124 != 0) {
							@Pc(141) int local141 = local116 + local73.anIntArray629[0];
							if (local141 < 0) {
								local141 = 0;
							} else if (Static54.anInt1038 - local92 - 1 < local141) {
								local141 = Static54.anInt1038 - local92 - 1;
							}
							@Pc(176) int local176 = local124 + local73.anIntArray628[0];
							if (local176 < 0) {
								local176 = 0;
							} else if (Static140.anInt3026 - local92 - 1 < local176) {
								local176 = Static140.anInt3026 - local92 - 1;
							}
							@Pc(223) int local223 = Static92.method1744(local176, Static252.anIntArray240, 0, 0, Static67.anIntArray66, true, -1, Static460.aClass169Array3[local73.aByte117], local92, local73.anIntArray629[0], local73.anIntArray628[0], local141, local92, local92);
							if (local223 > 0) {
								if (local223 > 9) {
									local223 = 9;
								}
								for (@Pc(232) int local232 = 0; local232 < local223; local232++) {
									local73.anIntArray629[local232] = Static252.anIntArray240[local223 - local232 - 1];
									local73.anIntArray628[local232] = Static67.anIntArray66[local223 - local232 - 1];
									local73.aByteArray102[local232] = 1;
								}
								local73.anInt9535 = local223;
							}
						}
					}
					Static115.method5669(true, local73);
					local116 = Static470.method6500(local73);
					Static524.method7016(local116, Static192.anInt3648, local73, Static467.anInt7772);
					Static423.method6023(Static192.anInt3648, local73);
					Static217.method4644(local73);
				}
			}
		}
		if (Static407.anInt7011 == 0 && Static126.anInt2887 == 0) {
			if (Static379.anInt6482 == 2) {
				Static492.method6663();
			} else {
				Static344.method5091();
			}
			if (Static226.anInt3984 >> 9 < 14 || Static226.anInt3984 >> 9 >= Static54.anInt1038 - 14 || Static350.anInt6080 >> 9 < 14 || Static140.anInt3026 - 14 <= Static350.anInt6080 >> 9) {
				Static555.method7344();
			}
		}
		while (true) {
			@Pc(361) Class3_Sub32 local361;
			@Pc(366) Class361 local366;
			@Pc(374) Class361 local374;
			do {
				local361 = (Class3_Sub32) Static457.aClass112_55.method3094();
				if (local361 == null) {
					while (true) {
						do {
							local361 = (Class3_Sub32) Static460.aClass112_49.method3094();
							if (local361 == null) {
								while (true) {
									do {
										local361 = (Class3_Sub32) Static12.aClass112_54.method3094();
										if (local361 == null) {
											if (Static283.aClass361_8 != null) {
												Static511.method6887();
											}
											if (Static506.anInt8251 % 1500 == 0) {
												Static492.method6665();
											}
											if (Static32.anInt602 == 7 && Static407.anInt7011 == 0) {
												Static39.method652();
											}
											Static556.method7354();
											if (Static11.aBoolean7 && Static158.method2936() - 60000L > Static359.aLong179) {
												Static549.method7294();
											}
											for (@Pc(532) Class41_Sub3_Sub2 local532 = (Class41_Sub3_Sub2) Static549.aClass178_22.method4168(); local532 != null; local532 = (Class41_Sub3_Sub2) Static549.aClass178_22.method4165()) {
												if ((long) local532.anInt6880 < Static158.method2936() / 1000L - 5L) {
													if (local532.aShort113 > 0) {
														Static180.method3112(local532.aString54 + Static544.aClass343_23.method7222(Static256.anInt4535), "", "", 0, 5, "");
													}
													if (local532.aShort113 == 0) {
														Static180.method3112(local532.aString54 + Static544.aClass343_24.method7222(Static256.anInt4535), "", "", 0, 5, "");
													}
													local532.method7833();
												}
											}
											if (Static32.anInt602 == 7 && Static407.anInt7011 == 0) {
												if (Static324.aClass165_2 == null) {
													Static326.method4711(false);
													return;
												}
												Static173.anInt3427++;
												if (Static173.anInt3427 > 50) {
													@Pc(630) Class3_Sub42 local630 = Static591.method7910(Static9.aClass199_3, Static574.aClass303_102);
													Static511.method6885(local630);
												}
												try {
													Static84.method1672();
													return;
												} catch (@Pc(637) IOException local637) {
													Static326.method4711(false);
													return;
												}
											}
											return;
										}
										local366 = local361.aClass361_6;
										if (local366.anInt9608 < 0) {
											break;
										}
										local374 = Static265.method4040(local366.anInt9663);
									} while (local374 == null || local374.aClass361Array2 == null || local374.aClass361Array2.length <= local366.anInt9608 || local366 != local374.aClass361Array2[local366.anInt9608]);
									Static312.method4566(local361);
								}
							}
							local366 = local361.aClass361_6;
							if (local366.anInt9608 < 0) {
								break;
							}
							local374 = Static265.method4040(local366.anInt9663);
						} while (local374 == null || local374.aClass361Array2 == null || local366.anInt9608 >= local374.aClass361Array2.length || local366 != local374.aClass361Array2[local366.anInt9608]);
						Static312.method4566(local361);
					}
				}
				local366 = local361.aClass361_6;
				if (local366.anInt9608 < 0) {
					break;
				}
				local374 = Static265.method4040(local366.anInt9663);
			} while (local374 == null || local374.aClass361Array2 == null || local366.anInt9608 >= local374.aClass361Array2.length || local374.aClass361Array2[local366.anInt9608] != local366);
			Static312.method4566(local361);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1523() {
		if (Static32.anInt602 == 14) {
			return;
		}
		Static506.anInt8251++;
		if (Static506.anInt8251 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static449.anInt7485 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static326.aRandom1.setSeed((long) Static449.anInt7485);
		}
		if (Static506.anInt8251 % 50 == 0) {
			Static130.anInt7192 = Static85.anInt1843;
			Static85.anInt1843 = 0;
			Static559.anInt9106 = Static469.anInt4273;
			Static469.anInt4273 = 0;
		}
		this.method1518();
		if (Static370.aClass357_1 != null) {
			Static370.aClass357_1.method7714();
		}
		Static402.method5823();
		Static140.aClass195_1.method4496();
		Static465.aClass86_1.method7264();
		if (Static505.aClass45_11 != null) {
			Static505.aClass45_11.method7410((int) Static158.method2936());
		}
		Static49.method757();
		Static222.anInt3930 = 0;
		Static158.anInt3266 = 0;
		for (@Pc(101) Interface7 local101 = Static140.aClass195_1.method4498(); local101 != null; local101 = Static140.aClass195_1.method4498()) {
			@Pc(107) int local107 = local101.method3367();
			if (local107 == 2 || local107 == 3) {
				@Pc(134) char local134 = local101.method3370();
				if (Static336.method4786() && (local134 == '`' || local134 == '§' || local134 == '²')) {
					if (Static169.method3030()) {
						Static567.method7624();
					} else {
						Static260.method3990();
					}
				} else if (Static158.anInt3266 < 128) {
					Static11.anInterface7Array1[Static158.anInt3266] = local101;
					Static158.anInt3266++;
				}
			} else if (local107 == 0 && Static222.anInt3930 < 75) {
				Static463.anInterface7Array2[Static222.anInt3930] = local101;
				Static222.anInt3930++;
			}
		}
		Static255.anInt4511 = 0;
		for (@Pc(182) Class3_Sub1 local182 = Static465.aClass86_1.method7268(); local182 != null; local182 = Static465.aClass86_1.method7268()) {
			@Pc(188) int local188 = local182.method5714();
			if (local188 == -1) {
				Static134.aClass112_21.method3079(local182);
			} else if (local188 == 6) {
				Static255.anInt4511 += local182.method5704();
			} else if (Static15.method241(local188)) {
				Static68.aClass112_15.method3079(local182);
				if (Static68.aClass112_15.method3083() > 10) {
					Static68.aClass112_15.method3094();
				}
			}
		}
		if (Static169.method3030()) {
			Static480.method6571();
		}
		if (Static309.method4507(Static32.anInt602)) {
			Static570.method7670();
			Static395.method5770();
		} else if (Static399.method5812(Static32.anInt602)) {
			Static65.method1422();
		}
		if (Static37.method1503(Static32.anInt602) && !Static399.method5812(Static32.anInt602)) {
			this.method1522();
			Static96.method1777();
			Static299.method4429();
		} else if (Static234.method3634(Static32.anInt602) && !Static399.method5812(Static32.anInt602)) {
			this.method1522();
			Static299.method4429();
		} else if (Static32.anInt602 == 12) {
			Static299.method4429();
		} else if (Static184.method3148(Static32.anInt602) && !Static399.method5812(Static32.anInt602)) {
			Static150.method2850();
		} else if (Static32.anInt602 == 13) {
			Static299.method4429();
			if (Static204.anInt3748 != -3 && Static204.anInt3748 != 2 && Static204.anInt3748 != 15) {
				Static326.method4711(false);
			}
		}
		Static68.method1485(Static505.aClass45_11);
		Static68.aClass112_15.method3094();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1527() {
		if (Static391.aClass277_2.anInt7302 > Static339.anInt5957) {
			Static221.aClass51_1.method1489();
			Static563.anInt9197 = (Static391.aClass277_2.anInt7302 - 1) * 5 * 50;
			if (Static563.anInt9197 > 3000) {
				Static563.anInt9197 = 3000;
			}
			if (Static391.aClass277_2.anInt7302 >= 2 && Static391.aClass277_2.anInt7303 == 6) {
				this.method1515("js5connect_outofdate");
				Static32.anInt602 = 14;
				return;
			}
			if (Static391.aClass277_2.anInt7302 >= 4 && Static391.aClass277_2.anInt7303 == -1) {
				this.method1515("js5crc");
				Static32.anInt602 = 14;
				return;
			}
			if (Static391.aClass277_2.anInt7302 >= 4 && Static309.method4507(Static32.anInt602)) {
				if (Static391.aClass277_2.anInt7303 == 7 || Static391.aClass277_2.anInt7303 == 9) {
					this.method1515("js5connect_full");
				} else if (Static391.aClass277_2.anInt7303 <= 0) {
					this.method1515("js5io");
				} else if (Static113.aString11 == null) {
					this.method1515("js5connect");
				} else {
					this.method1515("js5proxy_" + Static113.aString11.trim());
				}
				Static32.anInt602 = 14;
				return;
			}
		}
		Static339.anInt5957 = Static391.aClass277_2.anInt7302;
		if (Static563.anInt9197 > 0) {
			Static563.anInt9197--;
			return;
		}
		try {
			if (Static363.anInt6185 == 0) {
				Static574.aClass39_8 = Static221.aClass51_1.method1491(Static237.aClass258_3);
				Static363.anInt6185++;
			}
			if (Static363.anInt6185 == 1) {
				if (Static574.aClass39_8.anInt894 == 2) {
					if (Static574.aClass39_8.anObject2 != null) {
						Static113.aString11 = (String) Static574.aClass39_8.anObject2;
					}
					this.method1516(1000);
					return;
				}
				if (Static574.aClass39_8.anInt894 == 1) {
					Static363.anInt6185++;
				}
			}
			if (Static363.anInt6185 == 2) {
				Static73.aClass349_1 = new Class349((Socket) Static574.aClass39_8.anObject2, Static237.aClass258_3);
				@Pc(189) Class3_Sub11 local189 = new Class3_Sub11(5);
				local189.method5213(Static546.aClass224_2.anInt6213);
				local189.method5215(622);
				Static73.aClass349_1.method7307(5, local189.aByteArray62);
				Static363.anInt6185++;
				Static511.aLong240 = Static158.method2936();
			}
			if (Static363.anInt6185 == 3) {
				if (Static309.method4507(Static32.anInt602) || Static73.aClass349_1.method7310() > 0) {
					@Pc(247) int local247 = Static73.aClass349_1.method7306();
					if (local247 != 0) {
						this.method1516(local247);
						return;
					}
					Static363.anInt6185++;
				} else if (Static158.method2936() - Static511.aLong240 > 30000L) {
					this.method1516(1001);
					return;
				}
			}
			if (Static363.anInt6185 == 4) {
				@Pc(282) boolean local282 = Static309.method4507(Static32.anInt602) || Static37.method1503(Static32.anInt602) || Static234.method3634(Static32.anInt602);
				@Pc(285) Class263[] local285 = Static418.method5950();
				@Pc(293) Class3_Sub11 local293 = new Class3_Sub11(local285.length * 4);
				Static73.aClass349_1.method7309(0, local293.aByteArray62, local293.aByteArray62.length);
				for (@Pc(306) int local306 = 0; local306 < local285.length; local306++) {
					local285[local306].method5945(local293.method5186());
				}
				Static391.aClass277_2.method6116(!local282, Static73.aClass349_1);
				Static574.aClass39_8 = null;
				Static73.aClass349_1 = null;
				Static363.anInt6185 = 0;
			}
		} catch (@Pc(344) IOException local344) {
			this.method1516(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1501() {
		if (Static60.anInt1312 != 2) {
			this.method1523();
			return;
		}
		try {
			this.method1523();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static172.method7826(local19, local19.getMessage() + " (Recovered) " + this.method1514());
			Static486.method6610(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1499() {
		if (Static413.aBoolean529) {
			Static350.anInt6083 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static18.method246();
		Static501.aClass217_2 = new Class217(Static237.aClass258_3);
		Static391.aClass277_2 = new Class277();
		Static583.method7815(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static516.aClass272_11 != Static478.aClass272_10) {
			Static46.aByteArrayArray3 = new byte[50][];
		}
		Static405.aClass3_Sub3_Sub1_1 = new Class3_Sub3_Sub1(Static237.aClass258_3);
		if (Static516.aClass272_11 == Static478.aClass272_10) {
			Static318.aClass51_3.aString8 = this.getCodeBase().getHost();
		} else if (Static294.method6199(Static516.aClass272_11)) {
			Static318.aClass51_3.aString8 = this.getCodeBase().getHost();
			Static318.aClass51_3.anInt1587 = Static318.aClass51_3.anInt1589 + 40000;
			Static512.aClass51_5.anInt1587 = Static512.aClass51_5.anInt1589 + 40000;
			Static399.aClass51_4.anInt1587 = Static399.aClass51_4.anInt1589 + 40000;
			Static318.aClass51_3.anInt1585 = Static318.aClass51_3.anInt1589 + 50000;
			Static512.aClass51_5.anInt1585 = Static512.aClass51_5.anInt1589 + 50000;
			Static399.aClass51_4.anInt1585 = Static399.aClass51_4.anInt1589 + 50000;
		} else if (Static27.aClass272_7 == Static516.aClass272_11) {
			Static318.aClass51_3.aString8 = "127.0.0.1";
			Static512.aClass51_5.aString8 = "127.0.0.1";
			Static318.aClass51_3.anInt1587 = Static318.aClass51_3.anInt1589 + 40000;
			Static399.aClass51_4.aString8 = "127.0.0.1";
			Static512.aClass51_5.anInt1587 = Static512.aClass51_5.anInt1589 + 40000;
			Static399.aClass51_4.anInt1587 = Static399.aClass51_4.anInt1589 + 40000;
			Static318.aClass51_3.anInt1585 = Static318.aClass51_3.anInt1589 + 50000;
			Static512.aClass51_5.anInt1585 = Static512.aClass51_5.anInt1589 + 50000;
			Static399.aClass51_4.anInt1585 = Static399.aClass51_4.anInt1589 + 50000;
		}
		Static242.aShortArray66 = Static553.aShortArray131 = Static487.aShortArray133 = Static45.aShortArray10 = new short[256];
		if (Static121.aClass274_1 == Static176.aClass274_2) {
			Static392.aBoolean512 = false;
		}
		if (Static121.aClass274_1 == Static473.aClass274_4) {
			Static505.aBoolean625 = true;
			Static443.anInt7208 = 0;
			Static158.aShortArrayArrayArray1 = Static372.aShortArrayArrayArray3;
			Static59.aShortArrayArray5 = Static275.aShortArrayArray15;
			Static525.anInt8428 = 16777215;
		} else {
			Static158.aShortArrayArrayArray1 = Static282.aShortArrayArrayArray2;
			Static59.aShortArrayArray5 = Static592.aShortArrayArray32;
		}
		Static221.aClass51_1 = Static318.aClass51_3;
		try {
			Static377.aClipboard1 = Static308.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(215) Exception local215) {
		}
		Static140.aClass195_1 = Static536.method7153(Static387.aCanvas9);
		Static465.aClass86_1 = Static395.method5775(Static387.aCanvas9);
		try {
			if (Static237.aClass258_3.aClass204_3 != null) {
				Static334.aClass226_3 = new Class226(Static237.aClass258_3.aClass204_3, 5200, 0);
				for (@Pc(241) int local241 = 0; local241 < 35; local241++) {
					Static386.aClass226Array1[local241] = new Class226(Static237.aClass258_3.aClass204Array1[local241], 6000, 0);
				}
				Static354.aClass226_4 = new Class226(Static237.aClass258_3.aClass204_2, 6000, 0);
				Static533.aClass22_4 = new Class22(255, Static334.aClass226_3, Static354.aClass226_4, 500000);
				Static527.aClass226_5 = new Class226(Static237.aClass258_3.aClass204_4, 24, 0);
				Static237.aClass258_3.aClass204_3 = null;
				Static237.aClass258_3.aClass204_4 = null;
				Static237.aClass258_3.aClass204_2 = null;
				Static237.aClass258_3.aClass204Array1 = null;
			}
		} catch (@Pc(299) IOException local299) {
			Static354.aClass226_4 = null;
			Static527.aClass226_5 = null;
			Static334.aClass226_3 = null;
			Static533.aClass22_4 = null;
		}
		if (Static478.aClass272_10 != Static516.aClass272_11) {
			Static25.aBoolean45 = true;
		}
		if (Static176.aClass274_2 == Static121.aClass274_1) {
			Static285.aString33 = Static544.aClass343_3.method7222(Static256.anInt4535);
		} else if (Static473.aClass274_4 == Static121.aClass274_1) {
			Static285.aString33 = Static544.aClass343_4.method7222(Static256.anInt4535);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1507()) {
			return;
		}
		Static318.aClass51_3 = new Class51();
		Static318.aClass51_3.anInt1589 = Integer.parseInt(this.getParameter("worldid"));
		Static512.aClass51_5 = new Class51();
		Static512.aClass51_5.anInt1589 = Integer.parseInt(this.getParameter("lobbyid"));
		Static512.aClass51_5.aString8 = this.getParameter("lobbyaddress");
		Static399.aClass51_4 = new Class51();
		Static399.aClass51_4.anInt1589 = Integer.parseInt(this.getParameter("demoid"));
		Static399.aClass51_4.aString8 = this.getParameter("demoaddress");
		Static516.aClass272_11 = Static561.method2429(Integer.parseInt(this.getParameter("modewhere")));
		if (Static27.aClass272_7 == Static516.aClass272_11) {
			Static516.aClass272_11 = Static434.aClass272_9;
		} else if (!Static294.method6199(Static516.aClass272_11) && Static478.aClass272_10 != Static516.aClass272_11) {
			Static516.aClass272_11 = Static478.aClass272_10;
		}
		Static180.aClass183_4 = Static544.method7220(Integer.parseInt(this.getParameter("modewhat")));
		if (Static355.aClass183_6 != Static180.aClass183_4 && Static180.aClass183_4 != Static346.aClass183_5 && Static63.aClass183_3 != Static180.aClass183_4) {
			Static180.aClass183_4 = Static63.aClass183_3;
		}
		try {
			Static256.anInt4535 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static256.anInt4535 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static436.aBoolean546 = true;
		} else {
			Static436.aBoolean546 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static63.aBoolean115 = true;
		} else {
			Static63.aBoolean115 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static592.aBoolean765 = true;
		} else {
			Static592.aBoolean765 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static121.aClass274_1 = Static176.aClass274_2;
			} else if (local152.equals("1")) {
				Static121.aClass274_1 = Static473.aClass274_4;
			}
		}
		try {
			Static535.anInt8570 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static535.anInt8570 = 0;
		}
		Static297.aString36 = this.getParameter("quiturl");
		Static568.aString87 = this.getParameter("settings");
		if (Static568.aString87 == null) {
			Static568.aString87 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static345.anInt6051 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static345.anInt6051 = 0;
			}
		}
		Static546.anInt8712 = Integer.parseInt(this.getParameter("colourid"));
		if (Static546.anInt8712 < 0 || Static546.anInt8712 >= Static473.aColorArray3.length) {
			Static546.anInt8712 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static65.aBoolean117 = true;
			Static65.aBoolean118 = true;
		}
		@Pc(234) String local234 = this.getParameter("frombilling");
		if (local234 != null && local234.equals("true")) {
			Static400.aBoolean521 = true;
		}
		Static205.aString25 = this.getParameter("sskey");
		if (Static205.aString25 != null && Static205.aString25.length() < 2) {
			Static205.aString25 = null;
		}
		@Pc(260) String local260 = this.getParameter("force64mb");
		if (local260 != null && local260.equals("true")) {
			Static413.aBoolean529 = true;
		}
		@Pc(272) String local272 = this.getParameter("worldflags");
		if (local272 != null) {
			try {
				Static503.anInt8181 = Integer.parseInt(local272);
			} catch (@Pc(279) Exception local279) {
			}
		}
		@Pc(284) String local284 = this.getParameter("userFlow");
		if (local284 != null) {
			try {
				Static149.aLong80 = Long.parseLong(local284);
			} catch (@Pc(291) NumberFormatException local291) {
			}
		}
		Static286.aString34 = this.getParameter("additionalInfo");
		if (Static286.aString34 != null && Static286.aString34.length() > 50) {
			Static286.aString34 = null;
		}
		Static308.aClient1 = this;
		if (Static176.aClass274_2 == Static121.aClass274_1) {
			Static66.anInt1531 = 503;
			Static245.anInt4333 = 765;
		} else if (Static121.aClass274_1 == Static473.aClass274_4) {
			Static245.anInt4333 = 640;
			Static66.anInt1531 = 480;
		}
		this.method1510(Static66.anInt1531, Static245.anInt4333, Static121.aClass274_1.aString69, Static180.aClass183_4.method4225() + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method1505() {
		if (Static31.anApplet1 != null && Static387.aCanvas9 == null && !Static237.aClass258_3.aBoolean523) {
			try {
				@Pc(13) Class local13 = Static31.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static387.aCanvas9 = (Canvas) local17.get(Static31.anApplet1);
				local17.set(Static31.anApplet1, null);
				if (Static387.aCanvas9 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1505();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
	@Override
	public String method1514() {
		@Pc(12) String local12 = null;
		try {
			local12 = "[1)" + Static335.anInt5608 + "," + Static246.anInt4344 + "," + Static54.anInt1038 + "," + Static140.anInt3026 + "|";
			if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 != null) {
				local12 = local12 + "2)" + Static117.anInt2694 + "," + (Static335.anInt5608 + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0]) + "," + (Static246.anInt4344 + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0]) + "|";
			}
			local12 = local12 + "3)" + Static60.anInt1312 + "|4)" + Static405.aClass3_Sub3_Sub1_1.anInt7557 + "|5)" + Static38.method626() + "|6)" + Static40.anInt758 + "," + Static308.anInt5171 + "|";
			local12 = local12 + "7)" + Static405.aClass3_Sub3_Sub1_1.method6297(Static60.anInt1312) + "|";
			local12 = local12 + "8)" + Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312) + "|";
			local12 = local12 + "9)" + Static405.aClass3_Sub3_Sub1_1.aBoolean589 + "|";
			local12 = local12 + "10)" + Static405.aClass3_Sub3_Sub1_1.aBoolean579 + "|";
			local12 = local12 + "11)" + Static405.aClass3_Sub3_Sub1_1.aBoolean580 + "|";
			local12 = local12 + "12)" + Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312) + "|";
			local12 = local12 + "13)" + Static350.anInt6083 + "|";
			local12 = local12 + "14)" + Static32.anInt602;
			try {
				local12 = local12 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static60.anInt1312 == 2) {
					@Pc(233) Class local233 = Class.forName("java.lang.ClassLoader");
					@Pc(237) Field local237 = local233.getDeclaredField("nativeLibraries");
					@Pc(240) Class local240 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(250) Method local250 = local240.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local250.invoke(local237, Boolean.TRUE);
					@Pc(273) Vector local273 = (Vector) local237.get(client.class.getClassLoader());
					for (@Pc(275) int local275 = 0; local275 < local273.size(); local275++) {
						try {
							@Pc(281) Object local281 = local273.elementAt(local275);
							@Pc(286) Field local286 = local281.getClass().getDeclaredField("name");
							local250.invoke(local286, Boolean.TRUE);
							try {
								@Pc(301) String local301 = (String) local286.get(local281);
								if (local301 != null && local301.indexOf("sw3d.dll") != -1) {
									@Pc(314) Field local314 = local281.getClass().getDeclaredField("handle");
									local250.invoke(local314, Boolean.TRUE);
									local12 = local12 + "|16)" + Long.toHexString(local314.getLong(local281));
									local250.invoke(local314, Boolean.FALSE);
								}
							} catch (@Pc(350) Throwable local350) {
							}
							local250.invoke(local286, Boolean.FALSE);
						} catch (@Pc(362) Throwable local362) {
						}
					}
				}
			} catch (@Pc(374) Throwable local374) {
			}
			local12 = local12 + "]";
		} catch (@Pc(385) Throwable local385) {
		}
		return local12;
	}
}
