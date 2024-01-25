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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static298.method2940("Argument count");
			}
			Static281.aClass247_2 = new Class247();
			Static281.aClass247_2.anInt7426 = Integer.parseInt(arg0[0]);
			Static537.aClass247_5 = new Class247();
			Static537.aClass247_5.anInt7426 = Integer.parseInt(arg0[1]);
			Static488.aClass247_4 = new Class247();
			Static488.aClass247_4.anInt7426 = Integer.parseInt(arg0[2]);
			Static79.aClass285_2 = Static143.aClass285_3;
			if (arg0[3].equals("live")) {
				Static345.aClass269_4 = Static221.aClass269_3;
			} else if (arg0[3].equals("rc")) {
				Static345.aClass269_4 = Static201.aClass269_2;
			} else if (arg0[3].equals("wip")) {
				Static345.aClass269_4 = Static81.aClass269_1;
			} else {
				Static298.method2940("modewhat");
			}
			Static345.anInt6495 = Static187.method3647(arg0[4]);
			if (Static345.anInt6495 == -1) {
				if (arg0[4].equals("english")) {
					Static345.anInt6495 = 0;
				} else if (arg0[4].equals("german")) {
					Static345.anInt6495 = 1;
				} else {
					Static298.method2940("language");
				}
			}
			Static48.aBoolean51 = false;
			Static55.aBoolean100 = false;
			if (arg0[5].equals("game0")) {
				Static293.aClass138_7 = Static468.aClass138_6;
			} else if (arg0[5].equals("game1")) {
				Static293.aClass138_7 = Static518.aClass138_8;
			} else {
				Static298.method2940("game");
			}
			Static252.aBoolean401 = false;
			Static66.anInt1516 = 0;
			Static366.aString103 = "";
			Static278.aBoolean420 = true;
			Static366.aBoolean638 = true;
			Static164.anInt3826 = 0;
			Static423.anInt79 = 0;
			Static258.aString53 = null;
			Static406.anInt7661 = Static293.aClass138_7.anInt4315;
			Static98.aBoolean195 = false;
			@Pc(160) client local160 = new client();
			Static314.aClient1 = local160;
			local160.method1512(Static345.aClass269_4.method6679() + 32, Static293.aClass138_7.aString39);
			Static308.aFrame17.setLocation(40, 40);
		} catch (@Pc(183) Exception local183) {
			Static508.method7541(local183, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1530() {
		if (Static96.anInt2243 == 13) {
			return;
		}
		@Pc(17) long local17 = Static401.method6304() / 1000000L - Static276.aLong149;
		Static276.aLong149 = Static401.method6304() / 1000000L;
		@Pc(25) boolean local25 = Static377.method7985();
		if (local25 && Static542.aBoolean685 && Static152.aClass69_1 != null) {
			Static152.aClass69_1.method6845();
		}
		if (Static337.method5386(Static96.anInt2243)) {
			if (Static114.aLong65 != 0L && Static114.aLong65 < Static76.method1679()) {
				Static428.method6573(Static256.method4386(), false, Static208.aClass12_Sub10_Sub1_1.anInt2223, Static208.aClass12_Sub10_Sub1_1.anInt2236);
			} else if (!Static243.aClass42_4.method5849() && Static288.aBoolean427) {
				Static417.method7771();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static241.aFrame25 == null) {
			@Pc(79) Container local79;
			if (Static308.aFrame17 == null) {
				local79 = Static375.aClass71_3.anApplet1;
			} else {
				local79 = Static308.aFrame17;
			}
			local88 = local79.getSize().width;
			local92 = local79.getSize().height;
			if (Static308.aFrame17 == local79) {
				@Pc(98) Insets local98 = Static308.aFrame17.getInsets();
				local88 -= local98.left + local98.right;
				local92 -= local98.bottom + local98.top;
			}
			if (local88 != Static352.anInt6601 || Static121.anInt2757 != local92) {
				if (Static243.aClass42_4 == null || Static243.aClass42_4.method5798()) {
					Static176.method3494();
				} else {
					Static121.anInt2757 = local92;
					Static352.anInt6601 = local88;
				}
				Static114.aLong65 = Static76.method1679() + 500L;
			}
		}
		if (Static241.aFrame25 != null && !Static38.aBoolean44 && Static337.method5386(Static96.anInt2243)) {
			Static428.method6573(Static208.aClass12_Sub10_Sub1_1.anInt2225, false, -1, -1);
		}
		@Pc(165) boolean local165 = false;
		if (Static117.aBoolean219) {
			local165 = true;
			Static117.aBoolean219 = false;
		}
		if (local165) {
			Static357.method5572();
		}
		if (Static243.aClass42_4 != null && Static243.aClass42_4.method5849() || Static256.method4386() != 1) {
			Static445.method6725();
		}
		if (Static96.anInt2243 == 0) {
			Static381.method6036(Static203.anInt4533, Static352.aString79, Static138.aColorArray1[Static406.anInt7661], Static500.aColorArray3[Static406.anInt7661], local165, Static421.aColorArray2[Static406.anInt7661]);
		} else if (Static96.anInt2243 == 1) {
			Static225.method4065(Static243.aClass42_4, Static12.aClass80_1, local165 | Static243.aClass42_4.method5849(), Static138.aColorArray1[Static406.anInt7661].getRGB(), Static421.aColorArray2[Static406.anInt7661].getRGB(), Static500.aColorArray3[Static406.anInt7661].getRGB());
		} else if (Static355.method5548(Static96.anInt2243)) {
			Static453.method6835();
		} else if (Static418.method6474(Static96.anInt2243)) {
			Static453.method6835();
		} else if (Static335.method5371(Static96.anInt2243)) {
			if (Static419.anInt7798 == 1) {
				if (Static478.anInt8725 > Static420.anInt7814) {
					Static420.anInt7814 = Static478.anInt8725;
				}
				local88 = (Static420.anInt7814 - Static478.anInt8725) * 50 / Static420.anInt7814;
				Static178.method3537(Static53.aClass88_34.method2391(Static345.anInt6495) + "<br>(" + local88 + "%)", true, Static56.aClass80_2);
			} else if (Static419.anInt7798 == 2) {
				if (Static266.anInt5319 < Static377.anInt9639) {
					Static266.anInt5319 = Static377.anInt9639;
				}
				local88 = (Static266.anInt5319 - Static377.anInt9639) * 50 / Static266.anInt5319 + 50;
				Static178.method3537(Static53.aClass88_34.method2391(Static345.anInt6495) + "<br>(" + local88 + "%)", true, Static56.aClass80_2);
			} else {
				Static178.method3537(Static53.aClass88_34.method2391(Static345.anInt6495), true, Static56.aClass80_2);
			}
		} else if (Static96.anInt2243 == 9) {
			Static499.method7414(local17);
		} else if (Static96.anInt2243 == 12) {
			Static178.method3537(Static236.aClass88_134.method2391(Static345.anInt6495) + "<br>" + Static498.aClass88_264.method2391(Static345.anInt6495), true, Static56.aClass80_2);
		}
		if (Static98.anInt2275 == 3) {
			for (local88 = 0; local88 < Static24.anInt388; local88++) {
				@Pc(400) Rectangle local400 = Class101.aRectangleArray1[local88];
				if (Static101.aBooleanArray21[local88]) {
					Static243.aClass42_4.method5866(local400.y, local400.width, local400.height, -1996553985, local400.x);
				} else if (Static49.aBooleanArray8[local88]) {
					Static243.aClass42_4.method5866(local400.y, local400.width, local400.height, -1996554240, local400.x);
				}
			}
		}
		if (Static212.method4977()) {
			Static222.method4061(Static243.aClass42_4);
		}
		if (Static337.method5386(Static96.anInt2243) && Static98.anInt2275 == 0 && Static256.method4386() == 1 && !local165 && Static92.aString20.equals("1.1")) {
			local88 = 0;
			for (local92 = 0; local92 < Static24.anInt388; local92++) {
				if (Static49.aBooleanArray8[local92]) {
					Static49.aBooleanArray8[local92] = false;
					Static214.aRectangleArray2[local88++] = Class101.aRectangleArray1[local92];
				}
			}
			try {
				Static243.aClass42_4.method5835(Static214.aRectangleArray2, local88);
			} catch (@Pc(541) Exception_Sub1 local541) {
			}
		} else if (Static96.anInt2243 != 0) {
			for (local88 = 0; local88 < Static24.anInt388; local88++) {
				Static49.aBooleanArray8[local88] = false;
			}
			try {
				Static243.aClass42_4.method5821();
			} catch (@Pc(487) Exception_Sub1 local487) {
				Static508.method7541(local487, local487.getMessage() + " (Recovered) " + this.method1510());
				Static201.method3814(0);
			}
		}
		if (Static208.aClass12_Sub10_Sub1_1.anInt2233 == 0) {
			Static17.method388(15L);
		} else if (Static208.aClass12_Sub10_Sub1_1.anInt2233 == 1) {
			Static17.method388(10L);
		} else if (Static208.aClass12_Sub10_Sub1_1.anInt2233 == 2) {
			Static17.method388(5L);
		} else if (Static208.aClass12_Sub10_Sub1_1.anInt2233 == 3) {
			Static17.method388(2L);
		}
		if (Static326.aBoolean463) {
			Static100.method2094();
		}
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean189 && Static96.anInt2243 == 2 && Static406.anInt7660 != -1) {
			Static208.aClass12_Sub10_Sub1_1.aBoolean189 = false;
			Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1528() {
		if (Static148.anInt6867 != 2) {
			this.method1530();
			return;
		}
		try {
			this.method1530();
		} catch (@Pc(13) Throwable local13) {
			Static508.method7541(local13, local13.getMessage() + " (Recovered) " + this.method1510());
			Static201.method3814(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1536() {
		if (Static96.anInt2243 == 13) {
			return;
		}
		Static409.anInt7683++;
		if (Static409.anInt7683 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static302.anInt5830 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static279.aRandom1.setSeed((long) Static302.anInt5830);
		}
		if (Static409.anInt7683 % 50 == 0) {
			Static513.anInt9239 = Static238.anInt4931;
			Static410.anInt7708 = Static59.anInt1444;
			Static238.anInt4931 = 0;
			Static59.anInt1444 = 0;
		}
		this.method1548();
		if (Static215.aClass276_1 != null) {
			Static215.aClass276_1.method6862();
		}
		Static533.method7880();
		Static23.aClass5_3.method214();
		Static527.aClass6_1.method3755();
		if (Static243.aClass42_4 != null) {
			Static243.aClass42_4.method5861((int) Static76.method1679());
		}
		Static11.method295();
		Static162.anInt3760 = 0;
		Static234.anInt4900 = 0;
		for (@Pc(99) Interface1 local99 = Static23.aClass5_3.method210(); local99 != null; local99 = Static23.aClass5_3.method210()) {
			@Pc(105) int local105 = local99.method6639();
			if (local105 == 2 || local105 == 3) {
				@Pc(139) char local139 = local99.method6642();
				if (Static8.method260() && (local139 == '`' || local139 == '§')) {
					if (Static212.method4977()) {
						Static135.method2776();
					} else {
						Static86.method1908();
					}
				} else if (Static162.anInt3760 < 128) {
					Static259.anInterface1Array2[Static162.anInt3760] = local99;
					Static162.anInt3760++;
				}
			} else if (local105 == 0 && Static234.anInt4900 < 75) {
				Static146.anInterface1Array1[Static234.anInt4900] = local99;
				Static234.anInt4900++;
			}
		}
		Static157.anInt3415 = 0;
		for (@Pc(190) Class12_Sub3 local190 = Static527.aClass6_1.method3758(); local190 != null; local190 = Static527.aClass6_1.method3758()) {
			@Pc(196) int local196 = local190.method6274();
			if (local196 == -1) {
				Static417.aClass73_75.method2012(local190);
			} else if (local196 == 6) {
				Static157.anInt3415 += local190.method6276();
			} else if (Static79.method1749(local196)) {
				Static55.aClass73_13.method2012(local190);
				if (Static55.aClass73_13.method2013() > 10) {
					Static55.aClass73_13.method2008();
				}
			}
		}
		if (Static212.method4977()) {
			Static503.method7465();
		}
		if (Static96.anInt2243 == 0) {
			this.method1546();
			Static403.method6323();
		} else if (Static96.anInt2243 == 1) {
			this.method1546();
			Static403.method6323();
		} else if (Static335.method5371(Static96.anInt2243)) {
			Static464.method6945();
		}
		if (Static149.method2947(Static96.anInt2243) && !Static335.method5371(Static96.anInt2243)) {
			this.method1541();
			Static338.method2652();
			Static355.method5553();
		} else if (Static109.method2274(Static96.anInt2243) && !Static335.method5371(Static96.anInt2243)) {
			this.method1541();
			Static355.method5553();
		} else if (Static96.anInt2243 == 11) {
			Static355.method5553();
		} else if (Static224.method6975(Static96.anInt2243) && !Static335.method5371(Static96.anInt2243)) {
			Static241.method7905();
		} else if (Static96.anInt2243 == 12) {
			Static355.method5553();
			if (Static440.anInt8079 != -3 && Static440.anInt8079 != 2 && Static440.anInt8079 != 15) {
				Static10.method291(false);
			}
		}
		Static441.method7833(Static243.aClass42_4);
		Static55.aClass73_13.method2008();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method1537(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class12_Sub8 local14 = new Class12_Sub8(arg0);
		while (true) {
			@Pc(18) int local18 = local14.method5216();
			if (local18 == 0) {
				return;
			}
			if (local18 == 2) {
				Static449.anInt8180 = local14.method5199();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1540(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class12_Sub8 local10 = new Class12_Sub8(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method5216();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(29) int[] local29 = Static267.anIntArray376 = new int[6];
					local29[0] = local10.method5199();
					local29[1] = local10.method5199();
					local29[2] = local10.method5199();
					local29[3] = local10.method5199();
					local29[4] = local10.method5199();
					local29[5] = local10.method5199();
				} else {
					@Pc(74) int local74;
					@Pc(79) int local79;
					if (local14 == 4) {
						local74 = local10.method5216();
						Static207.anIntArray337 = new int[local74];
						for (local79 = 0; local79 < local74; local79++) {
							Static207.anIntArray337[local79] = local10.method5199();
							if (Static207.anIntArray337[local79] == 65535) {
								Static207.anIntArray337[local79] = -1;
							}
						}
					} else if (local14 == 5) {
						local74 = local10.method5216();
						Static43.anIntArray121 = new int[local74];
						for (local79 = 0; local79 < local74; local79++) {
							Static43.anIntArray121[local79] = local10.method5199();
							if (Static43.anIntArray121[local79] == 65535) {
								Static43.anIntArray121[local79] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1541() {
		@Pc(36) int local36;
		if (Static96.anInt2243 == 6 && Static145.anInt3193 == 0) {
			if (Static47.anInt889 > 1) {
				Static47.anInt889--;
				Static162.anInt3761 = Static413.anInt7729;
			}
			if (!Static389.aBoolean533) {
				Static278.method4633();
			}
			for (local36 = 0; local36 < 100 && Static494.method7354(); local36++) {
			}
		}
		Static481.anInt8697++;
		Static419.method6485(-1, -1, null);
		Static96.method2048(null, -1, -1);
		Static270.method6585();
		Static413.anInt7729++;
		for (local36 = 0; local36 < Static328.anInt6238; local36++) {
			@Pc(78) Class30_Sub1_Sub1_Sub2 local78 = Static352.aClass12_Sub41Array1[local36].aClass30_Sub1_Sub1_Sub2_2;
			if (local78 != null) {
				@Pc(84) byte local84 = local78.aClass130_1.aByte47;
				if ((local84 & 0x1) != 0) {
					@Pc(92) int local92 = local78.method3591();
					@Pc(116) int local116;
					if ((local84 & 0x2) != 0 && local78.anInt4201 == 0 && Math.random() * 1000.0D < 10.0D) {
						local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(124) int local124 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local116 != 0 || local124 != 0) {
							@Pc(138) int local138 = local116 + local78.anIntArray316[0];
							@Pc(145) int local145 = local124 + local78.anIntArray317[0];
							if (local138 < 0) {
								local138 = 0;
							} else if (Static37.anInt7512 - local92 - 1 < local138) {
								local138 = Static37.anInt7512 - local92 - 1;
							}
							if (local145 < 0) {
								local145 = 0;
							} else if (Static329.anInt6247 - local92 - 1 < local145) {
								local145 = Static329.anInt6247 - local92 - 1;
							}
							@Pc(217) int local217 = Static151.method3020(Static40.anIntArray120, Static510.aClass184Array1[local78.aByte99], local92, local145, local78.anIntArray316[0], 0, local78.anIntArray317[0], local92, -1, 0, Static250.anIntArray370, local138, true, local92);
							if (local217 > 0) {
								if (local217 > 9) {
									local217 = 9;
								}
								for (@Pc(228) int local228 = 0; local228 < local217; local228++) {
									local78.anIntArray316[local228] = Static40.anIntArray120[local217 - local228 - 1];
									local78.anIntArray317[local228] = Static250.anIntArray370[local217 - local228 - 1];
									local78.aByteArray49[local228] = 1;
								}
								local78.anInt4201 = local217;
							}
						}
					}
					Static145.method2869(true, local78);
					local116 = Static482.method7217(local78);
					Static464.method6944(local78, local116, Static77.anInt1792, Static115.anInt2673);
					Static228.method4110(local78);
				}
			}
		}
		if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
			if (Static242.anInt4993 == 2) {
				Static156.method3071();
			} else {
				Static83.method1859();
			}
			if (Static368.anInt6832 >> 7 < 14 || Static37.anInt7512 - 14 <= Static368.anInt6832 >> 7 || Static6.anInt93 >> 7 < 14 || Static6.anInt93 >> 7 >= Static329.anInt6247 - 14) {
				Static98.method2077();
			}
		}
		while (true) {
			@Pc(349) Class12_Sub6 local349;
			@Pc(354) Class198 local354;
			@Pc(365) Class198 local365;
			do {
				local349 = (Class12_Sub6) Static330.aClass73_51.method2008();
				if (local349 == null) {
					while (true) {
						do {
							local349 = (Class12_Sub6) Static239.aClass73_41.method2008();
							if (local349 == null) {
								while (true) {
									do {
										local349 = (Class12_Sub6) Static341.aClass73_54.method2008();
										if (local349 == null) {
											if (Static191.aClass198_6 != null) {
												Static527.method7830();
											}
											if (Static409.anInt7683 % 1500 == 0) {
												Static494.method7349();
											}
											if (Static96.anInt2243 == 6 && Static145.anInt3193 == 0) {
												Static183.method3610();
											}
											Static521.method6311();
											if (Static345.aBoolean479 && Static68.aLong28 < Static76.method1679() - 60000L) {
												Static180.method3559();
											}
											for (@Pc(536) Class7_Sub1_Sub2 local536 = (Class7_Sub1_Sub2) Static430.aClass149_7.method3989(); local536 != null; local536 = (Class7_Sub1_Sub2) Static430.aClass149_7.method3986()) {
												if ((long) local536.anInt8947 < Static76.method1679() / 1000L - 5L) {
													if (local536.aShort110 > 0) {
														Static406.method6373("", 5, 0, "", local536.aString102 + Static406.aClass88_219.method2391(Static345.anInt6495));
													}
													if (local536.aShort110 == 0) {
														Static406.method6373("", 5, 0, "", local536.aString102 + Static381.aClass88_206.method2391(Static345.anInt6495));
													}
													local536.method7760();
												}
											}
											if (Static96.anInt2243 == 6 && Static145.anInt3193 == 0) {
												if (Static491.aClass277_2 == null) {
													Static10.method291(false);
													return;
												}
												Static471.anInt8639++;
												if (Static471.anInt8639 > 50) {
													Static332.method5312(Static538.aClass77_95);
												}
												try {
													if (Static491.aClass277_2 != null && Static383.aClass12_Sub8_Sub2_1.anInt6217 > 0) {
														Static238.anInt4931 += Static383.aClass12_Sub8_Sub2_1.anInt6217;
														Static491.aClass277_2.method7164(Static383.aClass12_Sub8_Sub2_1.aByteArray82, Static383.aClass12_Sub8_Sub2_1.anInt6217);
														Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
														Static471.anInt8639 = 0;
														return;
													}
												} catch (@Pc(662) IOException local662) {
													Static10.method291(false);
													return;
												}
											}
											return;
										}
										local354 = local349.aClass198_2;
										if (local354.anInt5705 < 0) {
											break;
										}
										local365 = Static104.method2137(local354.anInt5787);
									} while (local365 == null || local365.aClass198Array1 == null || local354.anInt5705 >= local365.aClass198Array1.length || local354 != local365.aClass198Array1[local354.anInt5705]);
									Static312.method5029(local349);
								}
							}
							local354 = local349.aClass198_2;
							if (local354.anInt5705 < 0) {
								break;
							}
							local365 = Static104.method2137(local354.anInt5787);
						} while (local365 == null || local365.aClass198Array1 == null || local354.anInt5705 >= local365.aClass198Array1.length || local354 != local365.aClass198Array1[local354.anInt5705]);
						Static312.method5029(local349);
					}
				}
				local354 = local349.aClass198_2;
				if (local354.anInt5705 < 0) {
					break;
				}
				local365 = Static104.method2137(local354.anInt5787);
			} while (local365 == null || local365.aClass198Array1 == null || local354.anInt5705 >= local365.aClass198Array1.length || local354 != local365.aClass198Array1[local354.anInt5705]);
			Static312.method5029(local349);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1516() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1513()) {
			return;
		}
		Static281.aClass247_2 = new Class247();
		Static281.aClass247_2.anInt7426 = Integer.parseInt(this.getParameter("worldid"));
		Static537.aClass247_5 = new Class247();
		Static537.aClass247_5.anInt7426 = Integer.parseInt(this.getParameter("lobbyid"));
		Static537.aClass247_5.aString85 = this.getParameter("lobbyaddress");
		Static488.aClass247_4 = new Class247();
		Static488.aClass247_4.anInt7426 = Integer.parseInt(this.getParameter("demoid"));
		Static488.aClass247_4.aString85 = this.getParameter("demoaddress");
		Static79.aClass285_2 = Static159.method3206(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static376.method7934(Static79.aClass285_2) && Static171.aClass285_4 != Static79.aClass285_2) {
			Static79.aClass285_2 = Static171.aClass285_4;
		}
		Static345.aClass269_4 = Static4.method197(Integer.parseInt(this.getParameter("modewhat")));
		if (Static81.aClass269_1 != Static345.aClass269_4 && Static345.aClass269_4 != Static201.aClass269_2 && Static221.aClass269_3 != Static345.aClass269_4) {
			Static345.aClass269_4 = Static221.aClass269_3;
		}
		try {
			Static345.anInt6495 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static345.anInt6495 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static55.aBoolean100 = true;
		} else {
			Static55.aBoolean100 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static48.aBoolean51 = true;
		} else {
			Static48.aBoolean51 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static433.aBoolean551 = true;
		} else {
			Static433.aBoolean551 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static293.aClass138_7 = Static468.aClass138_6;
			} else if (local145.equals("1")) {
				Static293.aClass138_7 = Static518.aClass138_8;
			}
		}
		try {
			Static423.anInt79 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static423.anInt79 = 0;
		}
		Static258.aString54 = this.getParameter("quiturl");
		Static366.aString103 = this.getParameter("settings");
		if (Static366.aString103 == null) {
			Static366.aString103 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static164.anInt3826 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static164.anInt3826 = 0;
			}
		}
		Static406.anInt7661 = Integer.parseInt(this.getParameter("colourid"));
		if (Static406.anInt7661 < 0 || Static500.aColorArray3.length <= Static406.anInt7661) {
			Static406.anInt7661 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static278.aBoolean420 = true;
			Static366.aBoolean638 = true;
		}
		@Pc(225) String local225 = this.getParameter("frombilling");
		if (local225 != null && local225.equals("true")) {
			Static252.aBoolean401 = true;
		}
		Static258.aString53 = this.getParameter("sskey");
		if (Static258.aString53 != null && Static258.aString53.length() < 2) {
			Static258.aString53 = null;
		}
		@Pc(251) String local251 = this.getParameter("force64mb");
		if (local251 != null && local251.equals("true")) {
			Static98.aBoolean195 = true;
		}
		@Pc(263) String local263 = this.getParameter("worldflags");
		if (local263 != null) {
			try {
				Static66.anInt1516 = Integer.parseInt(local263);
			} catch (@Pc(270) Exception local270) {
			}
		}
		Static314.aClient1 = this;
		if (Static468.aClass138_6 == Static293.aClass138_7) {
			Static152.anInt3345 = 765;
			Static82.anInt1959 = 503;
		} else if (Static293.aClass138_7 == Static518.aClass138_8) {
			Static82.anInt1959 = 480;
			Static152.anInt3345 = 640;
		}
		this.method1519(Static345.aClass269_4.method6679() + 32, Static152.anInt3345, Static82.anInt1959);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1542(@OriginalArg(1) int arg0) {
		Static234.aClass86_2.anInt2607++;
		Static34.anInt728 = 0;
		Static538.aClass55_9 = null;
		Static501.aClass92_2 = null;
		Static234.aClass86_2.anInt2608 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1520() {
		if (Static345.aBoolean479) {
			Static180.method3559();
		}
		if (Static243.aClass42_4 != null) {
			Static243.aClass42_4.method5807();
		}
		if (Static241.aFrame25 != null) {
			Static540.method7945(Static375.aClass71_3, Static241.aFrame25);
			Static241.aFrame25 = null;
		}
		if (Static491.aClass277_2 != null) {
			Static491.aClass277_2.method7170();
			Static491.aClass277_2 = null;
		}
		Static300.method4831();
		Static234.aClass86_2.method2309();
		Static122.aClass217_1.method5153();
		if (Static40.aClass59_1 != null) {
			Static40.aClass59_1.method1596();
			Static40.aClass59_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1510() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static61.anInt1459 + "," + Static203.anInt4534 + "," + Static37.anInt7512 + "," + Static329.anInt6247 + "|";
			if (Static440.aClass30_Sub1_Sub1_Sub1_2 != null) {
				local7 = local7 + "2)" + Static56.anInt1418 + "," + (Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0] + Static61.anInt1459) + "," + (Static203.anInt4534 + Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0]) + "|";
			}
			local7 = local7 + "3)" + Static148.anInt6867 + "|4)" + Static208.aClass12_Sub10_Sub1_1.anInt2226 + "|5)" + Static256.method4386() + "|6)" + Static169.anInt3893 + "," + Static127.anInt2936 + "|";
			local7 = local7 + "7)" + Static208.aClass12_Sub10_Sub1_1.method2038(Static148.anInt6867) + "|";
			local7 = local7 + "8)" + Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867) + "|";
			local7 = local7 + "9)" + Static208.aClass12_Sub10_Sub1_1.aBoolean178 + "|";
			local7 = local7 + "10)" + Static208.aClass12_Sub10_Sub1_1.aBoolean180 + "|";
			local7 = local7 + "11)" + Static208.aClass12_Sub10_Sub1_1.aBoolean177 + "|";
			local7 = local7 + "12)" + Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867) + "|";
			local7 = local7 + "13)" + Static458.anInt8335 + "|";
			local7 = local7 + "14)" + Static96.anInt2243;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(220) Throwable local220) {
			}
			try {
				if (Static148.anInt6867 == 2) {
					@Pc(226) Class local226 = Class.forName("java.lang.ClassLoader");
					@Pc(230) Field local230 = local226.getDeclaredField("nativeLibraries");
					@Pc(233) Class local233 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(243) Method local243 = local233.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local243.invoke(local230, Boolean.TRUE);
					@Pc(266) Vector local266 = (Vector) local230.get(client.class.getClassLoader());
					for (@Pc(268) int local268 = 0; local268 < local266.size(); local268++) {
						try {
							@Pc(274) Object local274 = local266.elementAt(local268);
							@Pc(279) Field local279 = local274.getClass().getDeclaredField("name");
							local243.invoke(local279, Boolean.TRUE);
							try {
								@Pc(294) String local294 = (String) local279.get(local274);
								if (local294 != null && local294.indexOf("sw3d.dll") != -1) {
									@Pc(307) Field local307 = local274.getClass().getDeclaredField("handle");
									local243.invoke(local307, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local307.getLong(local274));
									local243.invoke(local307, Boolean.FALSE);
								}
							} catch (@Pc(343) Throwable local343) {
							}
							local243.invoke(local279, Boolean.FALSE);
						} catch (@Pc(355) Throwable local355) {
						}
					}
				}
			} catch (@Pc(363) Throwable local363) {
			}
			local7 = local7 + "]";
		} catch (@Pc(380) Throwable local380) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1546() {
		@Pc(6) int local6;
		if (!Static208.aClass12_Sub10_Sub1_1.aBoolean189) {
			for (local6 = 0; local6 < Static162.anInt3760; local6++) {
				if (Static259.anInterface1Array2[local6].method6642() == 's' || Static259.anInterface1Array2[local6].method6642() == 'S') {
					Static208.aClass12_Sub10_Sub1_1.aBoolean189 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static275.anInt5464 == 0) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local55 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(58) long local58 = Static76.method1679();
			if (Static78.aLong34 == 0L) {
				Static78.aLong34 = local58;
			}
			if (local55 > 16384 && local58 - Static78.aLong34 < 5000L) {
				if (local58 - Static490.aLong232 > 1000L) {
					System.gc();
					Static490.aLong232 = local58;
				}
				Static352.aString79 = Static458.aClass88_245.method2391(Static345.anInt6495);
				Static203.anInt4533 = 5;
			} else {
				Static352.aString79 = Static414.aClass88_224.method2391(Static345.anInt6495);
				Static275.anInt5464 = 10;
				Static203.anInt4533 = 5;
			}
		} else if (Static275.anInt5464 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static510.aClass184Array1[local6] = Static387.method6124(Static329.anInt6247, Static37.anInt7512);
			}
			Static352.aString79 = Static203.aClass88_123.method2391(Static345.anInt6495);
			Static203.anInt4533 = 10;
			Static275.anInt5464 = 20;
		} else if (Static275.anInt5464 == 20) {
			if (Static215.aClass276_1 == null) {
				Static215.aClass276_1 = new Class276(Static234.aClass86_2, Static122.aClass217_1, Static205.aBigInteger2, Static219.aBigInteger3);
			}
			if (Static215.aClass276_1.method6855()) {
				Static242.aClass16_65 = Static412.method6423(false, true, 0);
				Static252.aClass16_68 = Static412.method6423(false, true, 1);
				Static539.aClass16_120 = Static412.method6423(false, true, 2);
				Static315.aClass16_82 = Static412.method6423(false, true, 3);
				Static85.aClass16_17 = Static412.method6423(false, true, 4);
				Static129.aClass16_119 = Static412.method6423(true, true, 5);
				Static250.aClass16_67 = Static412.method6423(true, false, 6);
				Static103.aClass16_21 = Static412.method6423(false, true, 7);
				Static440.aClass16_103 = Static412.method6423(false, true, 8);
				Static107.aClass16_28 = Static412.method6423(false, true, 9);
				Static369.aClass16_89 = Static412.method6423(false, true, 10);
				Static207.aClass16_53 = Static412.method6423(false, true, 11);
				Static306.aClass16_77 = Static412.method6423(false, true, 12);
				Static466.aClass16_109 = Static412.method6423(false, true, 13);
				Static482.aClass16_112 = Static412.method6423(false, false, 14);
				Static25.aClass16_5 = Static412.method6423(false, true, 15);
				Static362.aClass16_88 = Static412.method6423(false, true, 16);
				Static458.aClass16_106 = Static412.method6423(false, true, 17);
				Static222.aClass16_59 = Static412.method6423(false, true, 18);
				Static115.aClass16_29 = Static412.method6423(false, true, 19);
				Static354.aClass16_87 = Static412.method6423(false, true, 20);
				Static170.aClass16_47 = Static412.method6423(false, true, 21);
				Static395.aClass16_93 = Static412.method6423(false, true, 22);
				Static224.aClass16_108 = Static412.method6423(true, true, 23);
				Static336.aClass16_84 = Static412.method6423(false, true, 24);
				Static55.aClass16_10 = Static412.method6423(false, true, 25);
				Static96.aClass16_20 = Static412.method6423(true, true, 26);
				Static371.aClass16_90 = Static412.method6423(false, true, 27);
				Static81.aClass16_16 = Static412.method6423(true, true, 28);
				Static19.aClass16_4 = Static412.method6423(false, true, 29);
				Static398.aClass16_97 = Static412.method6423(true, true, 30);
				Static7.aClass16_118 = Static412.method6423(true, true, 31);
				Static352.aString79 = Static261.aClass88_145.method2391(Static345.anInt6495);
				Static275.anInt5464 = 30;
				Static203.anInt4533 = 15;
			} else {
				Static352.aString79 = Static8.aClass88_3.method2391(Static345.anInt6495);
				Static203.anInt4533 = 12;
			}
		} else if (Static275.anInt5464 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 32; local55++) {
				local6 += Static426.aClass117_Sub1Array4[local55].method4014() * Static325.anIntArray434[local55] / 100;
			}
			if (local6 == 100) {
				Static352.aString79 = Static84.aClass88_49.method2391(Static345.anInt6495);
				Static203.anInt4533 = 20;
				Static84.method1875(Static440.aClass16_103);
				Static428.method6576(Static440.aClass16_103);
				Static275.anInt5464 = 35;
			} else {
				if (local6 != 0) {
					Static352.aString79 = Static434.aClass88_230.method2391(Static345.anInt6495) + local6 + "%";
				}
				Static203.anInt4533 = 20;
			}
		} else if (Static275.anInt5464 == 35) {
			Static193.method3683(Static398.aClass16_97, Static375.aClass71_3);
			Static352.aString79 = Static294.aClass88_163.method2391(Static345.anInt6495);
			Static275.anInt5464 = 40;
			Static203.anInt4533 = 20;
		} else if (Static275.anInt5464 == 40) {
			if (Static81.aClass16_16.method409()) {
				this.method1540(Static81.aClass16_16.method410(1));
				this.method1537(Static81.aClass16_16.method410(3));
				if (Static449.anInt8180 == -1 || Static103.aClass16_21.method397(Static449.anInt8180, 0)) {
					Static352.aString79 = Static508.aClass88_269.method2391(Static345.anInt6495);
					Static275.anInt5464 = 41;
					Static203.anInt4533 = 25;
				}
			} else {
				Static352.aString79 = Static203.aClass88_124.method2391(Static345.anInt6495) + Static81.aClass16_16.method381() + "%";
				Static203.anInt4533 = 25;
			}
		} else if (Static275.anInt5464 == 41) {
			local6 = Static230.method4119("jaggl");
			if (local6 >= 0 && local6 < 100) {
				Static352.aString79 = Static272.aClass88_151.method2391(Static345.anInt6495) + local6 + "%";
				Static203.anInt4533 = 25;
			} else {
				Static352.aString79 = Static90.aClass88_51.method2391(Static345.anInt6495);
				Static203.anInt4533 = 25;
				Static275.anInt5464 = 42;
			}
		} else if (Static275.anInt5464 == 42) {
			local6 = Static230.method4119("jagdx");
			if (local6 >= 0 && local6 < 100) {
				Static352.aString79 = Static29.aClass88_15.method2391(Static345.anInt6495) + local6 + "%";
				Static203.anInt4533 = 25;
			} else {
				Static352.aString79 = Static221.aClass88_130.method2391(Static345.anInt6495);
				Static275.anInt5464 = 43;
				Static203.anInt4533 = 25;
			}
		} else if (Static275.anInt5464 == 43) {
			local6 = Static230.method4119("jagmisc");
			if (local6 >= 0 && local6 < 100) {
				Static352.aString79 = Static478.aClass88_257.method2391(Static345.anInt6495) + local6 + "%";
				Static203.anInt4533 = 25;
			} else {
				if (local6 == 100) {
					this.method1518();
				}
				Static352.aString79 = Static332.aClass88_183.method2391(Static345.anInt6495);
				Static275.anInt5464 = 44;
				Static203.anInt4533 = 25;
			}
		} else if (Static275.anInt5464 == 44) {
			local6 = Static230.method4119("sw3d");
			if (local6 >= 0 && local6 < 100) {
				Static352.aString79 = Static174.aClass88_103.method2391(Static345.anInt6495) + local6 + "%";
				Static203.anInt4533 = 25;
			} else {
				Static352.aString79 = Static327.aClass88_178.method2391(Static345.anInt6495);
				Static203.anInt4533 = 25;
				Static275.anInt5464 = 45;
			}
		} else if (Static275.anInt5464 == 45) {
			local6 = Static230.method4119("jaclib");
			if (local6 >= 0 && local6 < 100) {
				Static352.aString79 = Static46.aClass88_26.method2391(Static345.anInt6495) + local6 + "%";
				Static203.anInt4533 = 25;
			} else {
				if (local6 == 100) {
					this.method1521();
				}
				Static352.aString79 = Static148.aClass88_200.method2391(Static345.anInt6495);
				Static203.anInt4533 = 25;
				Static275.anInt5464 = 46;
			}
		} else if (Static275.anInt5464 == 46) {
			local6 = Static230.method4119("hw3d");
			if (local6 >= 0 && local6 < 100) {
				Static352.aString79 = Static494.aClass88_263.method2391(Static345.anInt6495) + local6 + "%";
				Static203.anInt4533 = 25;
			} else {
				Static352.aString79 = Static435.aClass88_233.method2391(Static345.anInt6495);
				Static275.anInt5464 = 47;
				Static203.anInt4533 = 25;
			}
		} else if (Static275.anInt5464 == 47) {
			if (Static7.aClass16_118.method409()) {
				Static352.aString79 = Static437.aClass88_236.method2391(Static345.anInt6495);
				Static203.anInt4533 = 25;
				Static275.anInt5464 = 50;
			} else {
				Static352.aString79 = Static307.aClass88_170.method2391(Static345.anInt6495);
				Static203.anInt4533 = 25;
			}
		} else if (Static275.anInt5464 == 50) {
			Static134.method2773();
			Static352.aString79 = Static458.aClass88_244.method2391(Static345.anInt6495);
			Static203.anInt4533 = 30;
			Static275.anInt5464 = 60;
		} else if (Static275.anInt5464 == 60) {
			local6 = Static401.method6307(Static466.aClass16_109, Static440.aClass16_103);
			local55 = Static444.method6720();
			if (local6 < local55) {
				Static352.aString79 = Static166.aClass88_98.method2391(Static345.anInt6495) + local6 * 100 / local55 + "%";
				Static203.anInt4533 = 35;
			} else {
				Static352.aString79 = Static346.aClass88_189.method2391(Static345.anInt6495);
				Static203.anInt4533 = 35;
				Static275.anInt5464 = 70;
			}
		} else if (Static275.anInt5464 == 70) {
			local6 = Static13.method354(Static440.aClass16_103);
			local55 = Static282.method4652();
			if (local55 > local6) {
				Static352.aString79 = Static530.aClass88_278.method2391(Static345.anInt6495) + local6 * 100 / local55 + "%";
				Static203.anInt4533 = 40;
			} else {
				Static352.aString79 = Static223.aClass88_117.method2391(Static345.anInt6495);
				Static203.anInt4533 = 40;
				Static275.anInt5464 = 80;
			}
		} else if (Static275.anInt5464 == 80) {
			if (Static96.aClass16_20.method409()) {
				Static450.anInterface11_12 = new Class249(Static96.aClass16_20, Static107.aClass16_28, Static440.aClass16_103);
				Static352.aString79 = Static336.aClass88_187.method2391(Static345.anInt6495);
				Static275.anInt5464 = 90;
				Static203.anInt4533 = 45;
			} else {
				Static352.aString79 = Static111.aClass88_63.method2391(Static345.anInt6495) + Static96.aClass16_20.method381() + "%";
				Static203.anInt4533 = 45;
			}
		} else if (Static275.anInt5464 == 90) {
			Static352.aString79 = Static372.aClass88_201.method2391(Static345.anInt6495);
			Static275.anInt5464 = 95;
			Static203.anInt4533 = 50;
		} else if (Static275.anInt5464 == 95) {
			if (Static208.aClass12_Sub10_Sub1_1.aBoolean189) {
				Static208.aClass12_Sub10_Sub1_1.anInt2235 = 0;
				Static208.aClass12_Sub10_Sub1_1.anInt2230 = 0;
				Static208.aClass12_Sub10_Sub1_1.anInt2226 = 0;
				Static208.aClass12_Sub10_Sub1_1.anInt2225 = 1;
				Static208.aClass12_Sub10_Sub1_1.anInt2229 = 0;
			}
			Static208.aClass12_Sub10_Sub1_1.aBoolean189 = true;
			Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
			Static349.method5477(false, Static208.aClass12_Sub10_Sub1_1.anInt2230);
			Static352.aString79 = Static435.aClass88_232.method2391(Static345.anInt6495);
			Static203.anInt4533 = 55;
			Static275.anInt5464 = 100;
		} else if (Static275.anInt5464 == 100) {
			Static235.method7346(Static440.aClass16_103, Static466.aClass16_109, Static243.aClass42_4);
			Static352.aString79 = Static460.aClass88_229.method2391(Static345.anInt6495);
			Static203.anInt4533 = 60;
			Static9.method278(1);
			Static275.anInt5464 = 110;
		} else if (Static275.anInt5464 == 110) {
			Static539.aClass16_120.method409();
			local6 = Static539.aClass16_120.method381();
			Static362.aClass16_88.method409();
			local6 += Static362.aClass16_88.method381();
			Static458.aClass16_106.method409();
			local6 += Static458.aClass16_106.method381();
			Static222.aClass16_59.method409();
			local6 += Static222.aClass16_59.method381();
			Static115.aClass16_29.method409();
			local6 += Static115.aClass16_29.method381();
			Static354.aClass16_87.method409();
			local6 += Static354.aClass16_87.method381();
			Static170.aClass16_47.method409();
			local6 += Static170.aClass16_47.method381();
			Static395.aClass16_93.method409();
			local6 += Static395.aClass16_93.method381();
			Static336.aClass16_84.method409();
			local6 += Static336.aClass16_84.method381();
			Static55.aClass16_10.method409();
			local6 += Static55.aClass16_10.method381();
			Static371.aClass16_90.method409();
			local6 += Static371.aClass16_90.method381();
			Static19.aClass16_4.method409();
			local6 += Static19.aClass16_4.method381();
			if (local6 < 1200) {
				Static352.aString79 = Static186.aClass88_111.method2391(Static345.anInt6495) + local6 / 12 + "%";
				Static203.anInt4533 = 65;
			} else {
				Static453.aClass258_2 = new Class258(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static218.aClass160_1 = new Class160(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static317.aClass148_1 = new Class148(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120, Static440.aClass16_103);
				Static461.aClass95_1 = new Class95(Static293.aClass138_7, Static345.anInt6495, Static458.aClass16_106);
				Static464.aClass220_6 = new Class220(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static73.aClass47_2 = new Class47(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static274.aClass78_1 = new Class78(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120, Static103.aClass16_21);
				Static541.aClass223_1 = new Class223(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static367.aClass156_1 = new Class156(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static49.aClass155_2 = new Class155(Static293.aClass138_7, Static345.anInt6495, true, Static362.aClass16_88, Static103.aClass16_21);
				Static293.aClass93_8 = new Class93(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120, Static440.aClass16_103);
				Static149.aClass292_2 = new Class292(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120, Static440.aClass16_103);
				Static161.aClass110_3 = new Class110(Static293.aClass138_7, Static345.anInt6495, true, Static222.aClass16_59, Static103.aClass16_21);
				Static150.aClass254_2 = new Class254(Static293.aClass138_7, Static345.anInt6495, true, Static453.aClass258_2, Static115.aClass16_29, Static103.aClass16_21);
				Static139.aClass106_1 = new Class106(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static47.aClass41_1 = new Class41(Static293.aClass138_7, Static345.anInt6495, Static354.aClass16_87, Static242.aClass16_65, Static252.aClass16_68);
				Static114.aClass252_1 = new Class252(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static496.aClass60_3 = new Class60(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static82.aClass212_2 = new Class212(Static293.aClass138_7, Static345.anInt6495, Static170.aClass16_47, Static103.aClass16_21);
				Static285.aClass172_1 = new Class172(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static272.aClass248_1 = new Class248(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static480.aClass177_1 = new Class177(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static64.aClass296_10 = new Class296(Static293.aClass138_7, Static345.anInt6495, Static395.aClass16_93);
				Static367.aClass146_1 = new Class146(Static293.aClass138_7, Static345.anInt6495, Static539.aClass16_120);
				Static258.method4390(Static440.aClass16_103, Static103.aClass16_21, Static315.aClass16_82, Static466.aClass16_109);
				Static205.method3833(Static19.aClass16_4);
				Static380.aClass49_2 = new Class49(Static345.anInt6495, Static336.aClass16_84, Static55.aClass16_10);
				Static186.aClass122_1 = new Class122(Static345.anInt6495, Static336.aClass16_84, Static55.aClass16_10, new Class96());
				Static352.aString79 = Static188.aClass88_112.method2391(Static345.anInt6495);
				Static203.anInt4533 = 65;
				Static245.method7611();
				Static49.aClass155_2.method4068(!Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867));
				Static393.aClass31_1 = new Class31();
				Static261.method4418();
				Static463.method6934(Static371.aClass16_90);
				Static163.method3346(Static103.aClass16_21, Static450.anInterface11_12);
				Static275.anInt5464 = 120;
			}
		} else if (Static275.anInt5464 == 120) {
			local6 = Static63.method6536(Static440.aClass16_103);
			local55 = Static32.method686();
			if (local6 < local55) {
				Static352.aString79 = Static146.aClass88_88.method2391(Static345.anInt6495) + local6 * 100 / local55 + "%";
				Static203.anInt4533 = 70;
			} else {
				Static155.method3050(Static243.aClass42_4, Static440.aClass16_103);
				Static117.method2450(Static275.aClass84Array9);
				Static352.aString79 = Static177.aClass88_105.method2391(Static345.anInt6495);
				Static275.anInt5464 = 130;
				Static203.anInt4533 = 70;
			}
		} else if (Static275.anInt5464 == 130) {
			if (Static369.aClass16_89.method395("", "huffman")) {
				@Pc(1552) Class317 local1552 = new Class317(Static369.aClass16_89.method396("", "huffman"));
				Static9.method280(local1552);
				Static352.aString79 = Static283.aClass88_277.method2391(Static345.anInt6495);
				Static203.anInt4533 = 75;
				Static275.anInt5464 = 140;
			} else {
				Static352.aString79 = Static68.aClass88_39.method2391(Static345.anInt6495) + "0%";
				Static203.anInt4533 = 75;
			}
		} else if (Static275.anInt5464 == 140) {
			if (Static315.aClass16_82.method409()) {
				Static352.aString79 = Static291.aClass88_161.method2391(Static345.anInt6495);
				Static203.anInt4533 = 80;
				Static275.anInt5464 = 150;
			} else {
				Static352.aString79 = Static408.aClass88_221.method2391(Static345.anInt6495) + Static315.aClass16_82.method381() + "%";
				Static203.anInt4533 = 80;
			}
		} else if (Static275.anInt5464 == 150) {
			if (Static306.aClass16_77.method409()) {
				Static352.aString79 = Static297.aClass88_165.method2391(Static345.anInt6495);
				Static203.anInt4533 = 82;
				Static275.anInt5464 = 160;
			} else {
				Static352.aString79 = Static129.aClass88_279.method2391(Static345.anInt6495) + Static306.aClass16_77.method381() + "%";
				Static203.anInt4533 = 82;
			}
		} else if (Static275.anInt5464 == 160) {
			if (Static466.aClass16_109.method409()) {
				Static352.aString79 = Static65.aClass88_37.method2391(Static345.anInt6495);
				Static203.anInt4533 = 85;
				Static275.anInt5464 = 170;
			} else {
				Static352.aString79 = Static65.aClass88_37.method2391(Static345.anInt6495) + Static466.aClass16_109.method381() + "%";
				Static203.anInt4533 = 85;
			}
		} else if (Static275.anInt5464 == 170) {
			if (Static224.aClass16_108.method419("details")) {
				Static2.method4930(Static224.aClass16_108, Static464.aClass220_6, Static73.aClass47_2, Static49.aClass155_2, Static293.aClass93_8, Static149.aClass292_2, Static393.aClass31_1);
				Static352.aString79 = Static38.aClass88_23.method2391(Static345.anInt6495);
				Static203.anInt4533 = 89;
				Static275.anInt5464 = 190;
			} else {
				Static352.aString79 = Static477.aClass88_256.method2391(Static345.anInt6495) + Static224.aClass16_108.method382("details") + "%";
				Static203.anInt4533 = 87;
			}
		} else if (Static275.anInt5464 == 190) {
			Static534.aStringArray60 = new String[Static272.aClass248_1.anInt7441];
			Static479.anIntArray646 = new int[Static480.aClass177_1.anInt5289];
			Static425.aBooleanArray44 = new boolean[Static480.aClass177_1.anInt5289];
			for (local6 = 0; local6 < Static480.aClass177_1.anInt5289; local6++) {
				if (Static480.aClass177_1.method4424(local6).anInt9505 == 0) {
					Static425.aBooleanArray44[local6] = true;
					Static6.anInt84++;
				}
				Static479.anIntArray646[local6] = -1;
			}
			Static531.method7863();
			Static258.anInt5240 = Static315.aClass16_82.method420("loginscreen");
			Static121.anInt2763 = Static315.aClass16_82.method420("lobbyscreen");
			Static129.aClass16_119.method403(false);
			Static250.aClass16_67.method403(true);
			Static440.aClass16_103.method403(true);
			Static466.aClass16_109.method403(true);
			Static369.aClass16_89.method403(true);
			Static315.aClass16_82.method403(true);
			Static326.aBoolean463 = true;
			Static539.aClass16_120.anInt295 = 2;
			Static458.aClass16_106.anInt295 = 2;
			Static362.aClass16_88.anInt295 = 2;
			Static222.aClass16_59.anInt295 = 2;
			Static115.aClass16_29.anInt295 = 2;
			Static354.aClass16_87.anInt295 = 2;
			Static170.aClass16_47.anInt295 = 2;
			Static428.method6573(Static208.aClass12_Sub10_Sub1_1.anInt2225, false, -1, -1);
			Static352.aString79 = Static181.aClass88_107.method2391(Static345.anInt6495);
			Static275.anInt5464 = 200;
			Static203.anInt4533 = 95;
		} else if (Static275.anInt5464 == 200) {
			Static9.method278(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1548() {
		@Pc(13) boolean local13 = Static234.aClass86_2.method2317();
		if (!local13) {
			this.method1549();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1549() {
		if (Static234.aClass86_2.anInt2607 > Static329.anInt6250) {
			Static416.anInt9653 = (Static234.aClass86_2.anInt2607 * 50 - 50) * 5;
			Static222.aClass247_1.aBoolean535 = !Static222.aClass247_1.aBoolean535;
			if (Static416.anInt9653 > 3000) {
				Static416.anInt9653 = 3000;
			}
			if (Static234.aClass86_2.anInt2607 >= 2 && Static234.aClass86_2.anInt2608 == 6) {
				this.method1526("js5connect_outofdate");
				Static96.anInt2243 = 13;
				return;
			}
			if (Static234.aClass86_2.anInt2607 >= 4 && Static234.aClass86_2.anInt2608 == -1) {
				this.method1526("js5crc");
				Static96.anInt2243 = 13;
				return;
			}
			if (Static234.aClass86_2.anInt2607 >= 4 && Static7.method7758(Static96.anInt2243)) {
				if (Static234.aClass86_2.anInt2608 == 7 || Static234.aClass86_2.anInt2608 == 9) {
					this.method1526("js5connect_full");
				} else if (Static234.aClass86_2.anInt2608 <= 0) {
					this.method1526("js5io");
				} else {
					this.method1526("js5connect");
				}
				Static96.anInt2243 = 13;
				return;
			}
		}
		Static329.anInt6250 = Static234.aClass86_2.anInt2607;
		if (Static416.anInt9653 > 0) {
			Static416.anInt9653--;
			return;
		}
		try {
			if (Static34.anInt728 == 0) {
				Static538.aClass55_9 = Static375.aClass71_3.method1991(Static222.aClass247_1.method6190(), Static222.aClass247_1.aString85);
				Static34.anInt728++;
			}
			if (Static34.anInt728 == 1) {
				if (Static538.aClass55_9.anInt1481 == 2) {
					this.method1542(1000);
					return;
				}
				if (Static538.aClass55_9.anInt1481 == 1) {
					Static34.anInt728++;
				}
			}
			if (Static34.anInt728 == 2) {
				Static501.aClass92_2 = new Class92((Socket) Static538.aClass55_9.anObject5, Static375.aClass71_3);
				@Pc(185) Class12_Sub8 local185 = new Class12_Sub8(5);
				local185.method5214(Static17.aClass137_2.anInt4298);
				local185.method5223(606);
				Static501.aClass92_2.method2468(5, local185.aByteArray82);
				Static34.anInt728++;
				Static480.aLong228 = Static76.method1679();
			}
			if (Static34.anInt728 == 3) {
				if (Static7.method7758(Static96.anInt2243) || Static501.aClass92_2.method2474() > 0) {
					@Pc(248) int local248 = Static501.aClass92_2.method2473();
					if (local248 != 0) {
						this.method1542(local248);
						return;
					}
					Static34.anInt728++;
				} else if (Static76.method1679() - Static480.aLong228 > 30000L) {
					this.method1542(1001);
					return;
				}
			}
			if (Static34.anInt728 == 4) {
				@Pc(283) boolean local283 = Static96.anInt2243 == 1 || Static149.method2947(Static96.anInt2243) || Static109.method2274(Static96.anInt2243);
				Static234.aClass86_2.method2316(!local283, Static501.aClass92_2);
				Static538.aClass55_9 = null;
				Static501.aClass92_2 = null;
				Static34.anInt728 = 0;
			}
		} catch (@Pc(302) IOException local302) {
			this.method1542(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1514() {
		if (Static98.aBoolean195) {
			Static458.anInt8335 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static176.method3494();
		Static122.aClass217_1 = new Class217(Static375.aClass71_3);
		Static234.aClass86_2 = new Class86();
		if (Static79.aClass285_2 != Static171.aClass285_4) {
			Static407.aByteArrayArray25 = new byte[50][];
		}
		Static208.aClass12_Sub10_Sub1_1 = new Class12_Sub10_Sub1(Static375.aClass71_3);
		if (Static171.aClass285_4 == Static79.aClass285_2) {
			Static281.aClass247_2.aString85 = this.getCodeBase().getHost();
		} else if (Static376.method7934(Static79.aClass285_2)) {
			Static281.aClass247_2.aString85 = this.getCodeBase().getHost();
			Static281.aClass247_2.anInt7427 = Static281.aClass247_2.anInt7426 + 40000;
			Static537.aClass247_5.anInt7427 = Static537.aClass247_5.anInt7426 + 40000;
			Static281.aClass247_2.anInt7429 = Static281.aClass247_2.anInt7426 + 50000;
			Static488.aClass247_4.anInt7427 = Static488.aClass247_4.anInt7426 + 40000;
			Static537.aClass247_5.anInt7429 = Static537.aClass247_5.anInt7426 + 50000;
			Static488.aClass247_4.anInt7429 = Static488.aClass247_4.anInt7426 + 50000;
		} else if (Static79.aClass285_2 == Static143.aClass285_3) {
			Static281.aClass247_2.aString85 = "127.0.0.1";
			Static537.aClass247_5.aString85 = "127.0.0.1";
			Static281.aClass247_2.anInt7427 = Static281.aClass247_2.anInt7426 + 40000;
			Static488.aClass247_4.aString85 = "127.0.0.1";
			Static537.aClass247_5.anInt7427 = Static537.aClass247_5.anInt7426 + 40000;
			Static281.aClass247_2.anInt7429 = Static281.aClass247_2.anInt7426 + 50000;
			Static488.aClass247_4.anInt7427 = Static488.aClass247_4.anInt7426 + 40000;
			Static537.aClass247_5.anInt7429 = Static537.aClass247_5.anInt7426 + 50000;
			Static488.aClass247_4.anInt7429 = Static488.aClass247_4.anInt7426 + 50000;
		}
		Static215.aShortArray75 = Static8.aShortArray5 = Static401.aShortArray103 = Static81.aShortArray33 = new short[256];
		Static222.aClass247_1 = Static281.aClass247_2;
		if (Static293.aClass138_7 == Static518.aClass138_8) {
			Static516.aShortArray136 = Static290.aShortArray87;
			Static437.aShortArray106 = Static110.aShortArray39;
			Static435.aBoolean553 = true;
			Static9.anInt120 = 0;
			Static350.aShortArrayArray5 = Static343.aShortArrayArray3;
			Static468.aShortArrayArray10 = Static172.aShortArrayArray9;
			Static114.anInt2634 = 16777215;
		} else {
			Static468.aShortArrayArray10 = Static477.aShortArrayArray11;
			Static516.aShortArray136 = Static274.aShortArray76;
			Static437.aShortArray106 = Static386.aShortArray107;
			Static350.aShortArrayArray5 = Static382.aShortArrayArray6;
		}
		if (Static293.aClass138_7 == Static468.aClass138_6) {
			Static518.aBoolean660 = false;
		}
		Static23.aClass5_3 = Static117.method2452(Static301.aCanvas11);
		Static527.aClass6_1 = Static329.method5247(Static301.aCanvas11);
		Static357.anInt6663 = Static92.anInt2161;
		try {
			if (Static375.aClass71_3.aClass308_3 != null) {
				Static294.aClass38_2 = new Class38(Static375.aClass71_3.aClass308_3, 5200, 0);
				for (@Pc(218) int local218 = 0; local218 < 32; local218++) {
					Static165.aClass38Array1[local218] = new Class38(Static375.aClass71_3.aClass308Array1[local218], 6000, 0);
				}
				Static516.aClass38_5 = new Class38(Static375.aClass71_3.aClass308_2, 6000, 0);
				Static161.aClass224_2 = new Class224(255, Static294.aClass38_2, Static516.aClass38_5, 500000);
				Static243.aClass38_1 = new Class38(Static375.aClass71_3.aClass308_4, 24, 0);
				Static375.aClass71_3.aClass308_3 = null;
				Static375.aClass71_3.aClass308_4 = null;
				Static375.aClass71_3.aClass308_2 = null;
				Static375.aClass71_3.aClass308Array1 = null;
			}
		} catch (@Pc(276) IOException local276) {
			Static161.aClass224_2 = null;
			Static294.aClass38_2 = null;
			Static516.aClass38_5 = null;
			Static243.aClass38_1 = null;
		}
		if (Static79.aClass285_2 != Static171.aClass285_4) {
			Static191.aBoolean341 = true;
		}
		if (Static468.aClass138_6 == Static293.aClass138_7) {
			Static64.aString105 = Static198.aClass88_118.method2391(Static345.anInt6495);
		} else if (Static518.aClass138_8 == Static293.aClass138_7) {
			Static64.aString105 = Static62.aClass88_36.method2391(Static345.anInt6495);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1525() {
		if (Static148.anInt6867 != 2) {
			this.method1536();
			return;
		}
		try {
			this.method1536();
		} catch (@Pc(9) Throwable local9) {
			Static508.method7541(local9, local9.getMessage() + " (Recovered) " + this.method1510());
			Static201.method3814(0);
		}
	}
}
