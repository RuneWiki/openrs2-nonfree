import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static111.method2152("argument count");
			}
			Static337.anInt6352 = Integer.parseInt(arg0[0]);
			Static151.anInt3239 = 2;
			if (arg0[1].equals("live")) {
				Static250.anInt4912 = 0;
			} else if (arg0[1].equals("rc")) {
				Static250.anInt4912 = 1;
			} else if (arg0[1].equals("wip")) {
				Static250.anInt4912 = 2;
			} else {
				Static111.method2152("modewhat");
			}
			Static177.anInt3637 = Static316.method5133(arg0[2]);
			if (Static177.anInt3637 == -1) {
				if (arg0[2].equals("english")) {
					Static177.anInt3637 = 0;
				} else if (arg0[2].equals("german")) {
					Static177.anInt3637 = 1;
				} else {
					Static111.method2152("language");
				}
			}
			Static146.method2933(Static177.anInt3637);
			Static94.aBoolean158 = false;
			Static329.aBoolean456 = false;
			if (arg0[3].equals("game0")) {
				Static345.anInt6530 = 0;
			} else if (arg0[3].equals("game1")) {
				Static345.anInt6530 = 1;
			} else {
				Static111.method2152("game");
			}
			Static249.aString99 = "";
			Static37.anInt1055 = 0;
			Static149.anInt3234 = Static345.anInt6530;
			Static127.anInt2798 = 0;
			@Pc(127) client local127 = new client();
			Static251.aClient4 = local127;
			local127.method1015(Static250.anInt4912 + 32, Static345.anInt6530 == 1 ? "stellardawn" : "runescape");
			Static212.aFrame1.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static46.method1056(null, local154);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1030() {
		@Pc(11) boolean local11 = Static229.aClass160_3.method4116();
		if (!local11) {
			this.method1042();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1017() {
		if (Static85.anInt2215 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static244.method4218() / 1000000L - Static71.aLong55;
		Static71.aLong55 = Static244.method4218() / 1000000L;
		@Pc(34) boolean local34 = Static110.method2134();
		if (local34 && Static85.aBoolean152 && Static213.aClass15_1 != null) {
			Static213.aClass15_1.method4462();
		}
		if (Static85.anInt2215 == 30 || Static85.anInt2215 == 10) {
			if (Static116.aLong91 != 0L && Static335.method5308() > Static116.aLong91) {
				Static216.method3821(false, Static227.anInt6305, Static213.method3775(), Static345.anInt6528);
			} else if (Static128.aClass89_3.method5447() && Static36.aBoolean79) {
				Static229.method4027();
			}
		}
		@Pc(91) int local91;
		@Pc(95) int local95;
		if (Static342.aFrame2 == null) {
			@Pc(82) Container local82;
			if (Static212.aFrame1 == null) {
				local82 = Static116.aClass21_4.anApplet1;
			} else {
				local82 = Static212.aFrame1;
			}
			local91 = local82.getSize().width;
			local95 = local82.getSize().height;
			if (Static212.aFrame1 == local82) {
				@Pc(101) Insets local101 = Static212.aFrame1.getInsets();
				local91 -= local101.right + local101.left;
				local95 -= local101.bottom + local101.top;
			}
			if (local91 != Static200.anInt3944 || Static276.anInt5460 != local95) {
				if (Static128.aClass89_3 == null || Static128.aClass89_3.method5402()) {
					Static97.method1991();
				} else {
					Static276.anInt5460 = local95;
					Static200.anInt3944 = local91;
				}
				Static116.aLong91 = Static335.method5308() + 500L;
			}
		}
		if (Static342.aFrame2 != null && !Static71.aBoolean130 && (Static85.anInt2215 == 30 || Static85.anInt2215 == 10)) {
			Static216.method3821(false, -1, Static6.anInt126, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static33.aBoolean54) {
			local169 = true;
			Static33.aBoolean54 = false;
		}
		if (local169) {
			Static282.method4683();
		}
		if (Static128.aClass89_3 != null && Static128.aClass89_3.method5484() || Static213.method3775() != 1) {
			Static183.method3347();
		}
		if (Static85.anInt2215 == 0) {
			Static341.method5544(Static43.aColorArray1[Static149.anInt3234], Static74.aString136, Static100.anInt2433, local169, Static290.aColorArray3[Static149.anInt3234], Static117.aColorArray2[Static149.anInt3234]);
		} else if (Static85.anInt2215 == 5) {
			Static354.method5702(Static43.aColorArray1[Static149.anInt3234].getRGB(), local169 | Static128.aClass89_3.method5484(), Static149.aClass94_19, Static128.aClass89_3, Static290.aColorArray3[Static149.anInt3234].getRGB(), Static117.aColorArray2[Static149.anInt3234].getRGB());
		} else if (Static85.anInt2215 == 10) {
			Static287.method4745();
		} else if (Static85.anInt2215 == 25 || Static85.anInt2215 == 28) {
			if (Static309.anInt5898 == 1) {
				if (Static153.anInt3265 < Static254.anInt4941) {
					Static153.anInt3265 = Static254.anInt4941;
				}
				local91 = (Static153.anInt3265 - Static254.anInt4941) * 50 / Static153.anInt3265;
				Static227.method5321(Static341.aClass94_32, Static35.aString79 + "<br>(" + local91 + "%)", true);
			} else if (Static309.anInt5898 == 2) {
				if (Static323.anInt6142 > Static288.anInt1245) {
					Static288.anInt1245 = Static323.anInt6142;
				}
				local91 = (Static288.anInt1245 - Static323.anInt6142) * 50 / Static288.anInt1245 + 50;
				Static227.method5321(Static341.aClass94_32, Static35.aString79 + "<br>(" + local91 + "%)", true);
			} else {
				Static227.method5321(Static341.aClass94_32, Static35.aString79, true);
			}
		} else if (Static85.anInt2215 == 30) {
			Static87.method4770(local18);
		} else if (Static85.anInt2215 == 40) {
			Static227.method5321(Static341.aClass94_32, Static253.aString310 + "<br>" + Static350.aString434, true);
		}
		if (Static144.anInt3133 == 3) {
			for (local91 = 0; local91 < Static43.anInt1148; local91++) {
				@Pc(373) Rectangle local373 = Class167.aRectangleArray2[local91];
				if (Static280.aBooleanArray21[local91]) {
					Static128.aClass89_3.method5477(local373.y, local373.x, local373.height, local373.width, -1996553985);
				} else if (Static339.aBooleanArray30[local91]) {
					Static128.aClass89_3.method5477(local373.y, local373.x, local373.height, local373.width, -1996554240);
				}
			}
		}
		if (Static116.method2472()) {
			Static343.method5557(Static128.aClass89_3);
		}
		if ((Static85.anInt2215 == 30 || Static85.anInt2215 == 10) && Static144.anInt3133 == 0 && Static213.method3775() == 1 && !local169 && Static22.aString36.equals("1.1")) {
			local91 = 0;
			for (local95 = 0; local95 < Static43.anInt1148; local95++) {
				if (Static339.aBooleanArray30[local95]) {
					Static339.aBooleanArray30[local95] = false;
					Static197.aRectangleArray1[local91++] = Class167.aRectangleArray2[local95];
				}
			}
			Static128.aClass89_3.method5386(Static197.aRectangleArray1, local91);
		} else if (Static85.anInt2215 != 0) {
			Static128.aClass89_3.method5392();
			for (local91 = 0; local91 < Static43.anInt1148; local91++) {
				Static339.aBooleanArray30[local91] = false;
			}
		}
		if (Static343.aBoolean473) {
			Static330.method5269();
		}
		if (Static294.aBoolean459 && Static85.anInt2215 == 10 && Static161.anInt3337 != -1) {
			Static294.aBoolean459 = false;
			Static244.method4220(Static116.aClass21_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1019()) {
			return;
		}
		Static337.anInt6352 = Integer.parseInt(this.getParameter("worldid"));
		Static151.anInt3239 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static151.anInt3239 < 0 || Static151.anInt3239 > 1) {
			Static151.anInt3239 = 0;
		}
		Static250.anInt4912 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static250.anInt4912 < 0 || Static250.anInt4912 > 2) {
			Static250.anInt4912 = 0;
		}
		try {
			Static177.anInt3637 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(50) Exception local50) {
			Static177.anInt3637 = 0;
		}
		Static146.method2933(Static177.anInt3637);
		@Pc(59) String local59 = this.getParameter("objecttag");
		if (local59 != null && local59.equals("1")) {
			Static329.aBoolean456 = true;
		} else {
			Static329.aBoolean456 = false;
		}
		@Pc(75) String local75 = this.getParameter("js");
		if (local75 != null && local75.equals("1")) {
			Static94.aBoolean158 = true;
		} else {
			Static94.aBoolean158 = false;
		}
		@Pc(91) String local91 = this.getParameter("game");
		if (local91 != null && local91.equals("1")) {
			Static345.anInt6530 = 1;
		} else {
			Static345.anInt6530 = 0;
		}
		try {
			Static37.anInt1055 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(110) Exception local110) {
			Static37.anInt1055 = 0;
		}
		Static273.aString342 = this.getParameter("quiturl");
		Static249.aString99 = this.getParameter("settings");
		if (Static249.aString99 == null) {
			Static249.aString99 = "";
		}
		@Pc(128) String local128 = this.getParameter("country");
		if (local128 != null) {
			try {
				Static127.anInt2798 = Integer.parseInt(local128);
			} catch (@Pc(135) Exception local135) {
				Static127.anInt2798 = 0;
			}
		}
		Static149.anInt3234 = Integer.parseInt(this.getParameter("colourid"));
		if (Static149.anInt3234 < 0 || Static290.aColorArray3.length <= Static149.anInt3234) {
			Static149.anInt3234 = 0;
		}
		Static251.aClient4 = this;
		this.method1013(Static250.anInt4912 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1032() {
		Static126.anInt2794 = 0;
		while (Static294.method5318() && Static126.anInt2794 < 128) {
			if (!Static258.method4342() || Static59.aChar2 != '`' && Static59.aChar2 != '§') {
				Static175.anIntArray492[Static126.anInt2794] = Static113.anInt2572;
				Static286.anIntArray713[Static126.anInt2794] = Static59.aChar2;
				Static126.anInt2794++;
			} else if (Static116.method2472()) {
				Static123.method5685();
			} else {
				Static14.method202();
			}
		}
		if (Static116.method2472()) {
			Static184.method3385();
		}
		Static105.anInt6011++;
		Static296.method5032(-1, -1, null);
		Static153.method2990(-1, -1, null);
		if (Static161.anInt3337 != -1) {
			Static185.method3389(Static214.anInt4266, Static161.anInt3337, 0, 0, 0, 0, Static128.anInt2823);
		}
		Static34.anInt776++;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			@Pc(97) Class22_Sub2_Sub1_Sub2 local97 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local91];
			if (local97 != null) {
				@Pc(103) byte local103 = local97.aClass174_1.aByte54;
				if ((local103 & 0x1) != 0) {
					@Pc(114) int local114 = local97.method4421();
					@Pc(141) int local141;
					if ((local103 & 0x2) != 0 && local97.anInt5151 == 0 && Math.random() * 1000.0D < 10.0D) {
						local141 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(149) int local149 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local141 != 0 || local149 != 0) {
							@Pc(163) int local163 = local141 + local97.anIntArray666[0];
							@Pc(170) int local170 = local149 + local97.anIntArray665[0];
							if (local163 < 0) {
								local163 = 0;
							} else if (local163 > Static15.anInt287 - local114 - 1) {
								local163 = Static15.anInt287 - local114 - 1;
							}
							if (local170 < 0) {
								local170 = 0;
							} else if (Static325.anInt6173 - local114 - 1 < local170) {
								local170 = Static325.anInt6173 - local114 - 1;
							}
							@Pc(240) int local240 = Static155.method2999(0, local97.anIntArray666[0], Static205.anIntArray561, -1, 0, local170, Static327.aClass149Array1[local97.aByte69], true, local114, local114, local97.anIntArray665[0], Static27.anIntArray85, local114, local163);
							if (local240 > 0) {
								if (local240 > 9) {
									local240 = 9;
								}
								for (@Pc(251) int local251 = 0; local251 < local240; local251++) {
									local97.anIntArray666[local251] = Static27.anIntArray85[local240 - local251 - 1];
									local97.anIntArray665[local251] = Static205.anIntArray561[local240 - local251 - 1];
									local97.aByteArray77[local251] = 1;
								}
								local97.anInt5151 = local240;
							}
						}
					}
					Static278.method4676(local97, true);
					local141 = Static275.method4594(local97);
					Static75.method1500(local141, Static143.anInt4069, Static315.anInt6041, local97);
					Static134.method2675(local97);
				}
			}
		}
		if (Static125.anInt2778 == 0 && Static339.anInt6449 == 0) {
			if (Static118.anInt6324 == 2) {
				Static272.method4539();
			} else {
				Static329.method5250();
			}
			if (Static203.anInt4014 >> 7 < 14 || Static203.anInt4014 >> 7 >= Static15.anInt287 - 14 || Static24.anInt478 >> 7 < 14 || Static325.anInt6173 - 14 <= Static24.anInt478 >> 7) {
				Static261.method4377();
			}
		}
		while (true) {
			@Pc(365) Class7_Sub25 local365;
			@Pc(370) Class26 local370;
			@Pc(381) Class26 local381;
			do {
				local365 = (Class7_Sub25) Static129.aClass74_19.method1792();
				if (local365 == null) {
					while (true) {
						do {
							local365 = (Class7_Sub25) Static255.aClass74_28.method1792();
							if (local365 == null) {
								while (true) {
									do {
										local365 = (Class7_Sub25) Static247.aClass74_34.method1792();
										if (local365 == null) {
											if (Static60.aClass26_13 != null) {
												Static206.method3668();
											}
											if (Static212.anInt4234 % 1500 == 0) {
												Static276.method4610();
											}
											Static195.method3490();
											if (Static261.aBoolean372 && Static335.method5308() - 60000L > Static153.aLong112) {
												Static288.method1007();
												return;
											}
											return;
										}
										local370 = local365.aClass26_22;
										if (local370.anInt550 < 0) {
											break;
										}
										local381 = Static245.method4231(local370.anInt530);
									} while (local381 == null || local381.aClass26Array1 == null || local370.anInt550 >= local381.aClass26Array1.length || local381.aClass26Array1[local370.anInt550] != local370);
									Static83.method1766(local365);
								}
							}
							local370 = local365.aClass26_22;
							if (local370.anInt550 < 0) {
								break;
							}
							local381 = Static245.method4231(local370.anInt530);
						} while (local381 == null || local381.aClass26Array1 == null || local381.aClass26Array1.length <= local370.anInt550 || local381.aClass26Array1[local370.anInt550] != local370);
						Static83.method1766(local365);
					}
				}
				local370 = local365.aClass26_22;
				if (local370.anInt550 < 0) {
					break;
				}
				local381 = Static245.method4231(local370.anInt530);
			} while (local381 == null || local381.aClass26Array1 == null || local381.aClass26Array1.length <= local370.anInt550 || local381.aClass26Array1[local370.anInt550] != local370);
			Static83.method1766(local365);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1009() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static97.method1991();
		Static261.aClass167_3 = new Class167(Static116.aClass21_4);
		Static229.aClass160_3 = new Class160();
		if (Static250.anInt4912 != 0) {
			Static345.aByteArrayArray21 = new byte[50][];
		}
		Static247.method4264(Static116.aClass21_4);
		if (Static151.anInt3239 == 0) {
			Static56.aString109 = this.getCodeBase().getHost();
			Static4.anInt75 = 443;
			Static129.anInt2832 = 43594;
		} else if (Static151.anInt3239 == 1) {
			Static56.aString109 = this.getCodeBase().getHost();
			Static4.anInt75 = Static337.anInt6352 + 50000;
			Static129.anInt2832 = Static337.anInt6352 + 40000;
		} else if (Static151.anInt3239 == 2) {
			Static4.anInt75 = Static337.anInt6352 + 50000;
			Static56.aString109 = "127.0.0.1";
			Static129.anInt2832 = Static337.anInt6352 + 40000;
		}
		Static221.anInt4410 = Static129.anInt2832;
		Static64.anInt1615 = Static129.anInt2832;
		Static302.aString423 = Static56.aString109;
		Static342.anInt6490 = Static4.anInt75;
		Static275.aShortArray111 = Static69.aShortArray26 = Static200.aShortArray63 = Static280.aShortArray105 = new short[256];
		if (Static345.anInt6530 == 1) {
			Static221.anInt4406 = 16777215;
			Static200.aShortArrayArray4 = Static212.aShortArrayArray5;
			Static17.aShortArray110 = Static9.aShortArray9;
			Static310.aShortArray112 = Static88.aShortArray64;
			Static314.aShortArrayArray7 = Static81.aShortArrayArray3;
			Static48.anInt5547 = 0;
			Static339.aBoolean467 = true;
		} else {
			Static310.aShortArray112 = Static222.aShortArray85;
			Static314.aShortArrayArray7 = Static42.aShortArrayArray2;
			Static200.aShortArrayArray4 = Static218.aShortArrayArray6;
			Static17.aShortArray110 = Static288.aShortArray25;
		}
		Static206.anInt4119 = Static221.anInt4410;
		if (Static22.anInt448 == 3) {
			Static65.anInt1630 = Static337.anInt6352;
		}
		Static262.method4382();
		Static212.method3768(Static269.aCanvas4);
		Static274.method4567(Static269.aCanvas4);
		Static243.aClass82_1 = Static229.method4025();
		if (Static243.aClass82_1 != null) {
			Static243.aClass82_1.method2003(Static269.aCanvas4);
		}
		Static254.anInt4938 = Static22.anInt448;
		try {
			if (Static116.aClass21_4.aClass207_2 != null) {
				Static251.aClass77_10 = new Class77(Static116.aClass21_4.aClass207_2, 5200, 0);
				for (@Pc(168) int local168 = 0; local168 < 29; local168++) {
					Static195.aClass77Array1[local168] = new Class77(Static116.aClass21_4.aClass207Array1[local168], 6000, 0);
				}
				Static87.aClass77_9 = new Class77(Static116.aClass21_4.aClass207_1, 6000, 0);
				Static245.aClass13_4 = new Class13(255, Static251.aClass77_10, Static87.aClass77_9, 500000);
				Static134.aClass77_6 = new Class77(Static116.aClass21_4.aClass207_3, 24, 0);
				Static116.aClass21_4.aClass207_3 = null;
				Static116.aClass21_4.aClass207_1 = null;
				Static116.aClass21_4.aClass207_2 = null;
				Static116.aClass21_4.aClass207Array1 = null;
			}
		} catch (@Pc(224) IOException local224) {
			Static87.aClass77_9 = null;
			Static245.aClass13_4 = null;
			Static134.aClass77_6 = null;
			Static251.aClass77_10 = null;
		}
		if (Static151.anInt3239 != 0) {
			Static198.aBoolean307 = true;
		}
		if (Static345.anInt6530 == 0) {
			Static286.aString355 = Static140.aString199;
		} else if (Static345.anInt6530 == 1) {
			Static286.aString355 = Static203.aString262;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1018() {
		if (Static261.aBoolean372) {
			Static288.method1007();
		}
		if (Static128.aClass89_3 != null) {
			Static128.aClass89_3.method5387();
		}
		if (Static342.aFrame2 != null) {
			Static234.method4076(Static116.aClass21_4, Static342.aFrame2);
			Static342.aFrame2 = null;
		}
		if (Static339.aClass158_1 != null) {
			Static339.aClass158_1.aBoolean350 = false;
		}
		Static339.aClass158_1 = null;
		if (Static193.aClass61_1 != null) {
			Static193.aClass61_1.method1376();
			Static193.aClass61_1 = null;
		}
		Static199.method3566(Static269.aCanvas4);
		Static119.method2527(Static269.aCanvas4);
		if (Static243.aClass82_1 != null) {
			Static243.aClass82_1.method2011(Static269.aCanvas4);
		}
		Static126.method2609();
		Static88.method3580();
		Static243.aClass82_1 = null;
		if (Static213.aClass15_1 != null) {
			Static213.aClass15_1.method4461();
		}
		if (Static272.aClass15_2 != null) {
			Static272.aClass15_2.method4461();
		}
		Static229.aClass160_3.method4105();
		Static261.aClass167_3.method4277();
		if (Static162.aClass123_4 != null) {
			Static162.aClass123_4.method3243();
			Static162.aClass123_4 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1020() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1038() {
		if (!Static294.aBoolean459) {
			label222: while (true) {
				do {
					if (!Static294.method5318()) {
						break label222;
					}
				} while (Static59.aChar2 != 's' && Static59.aChar2 != 'S');
				Static294.aBoolean459 = true;
			}
		}
		@Pc(42) int local42;
		if (Static78.anInt6337 == 0) {
			@Pc(33) Runtime local33 = Runtime.getRuntime();
			local42 = (int) ((local33.totalMemory() - local33.freeMemory()) / 1024L);
			@Pc(45) long local45 = Static335.method5308();
			if (Static346.aLong226 == 0L) {
				Static346.aLong226 = local45;
			}
			if (local42 > 16384 && local45 - Static346.aLong226 < 5000L) {
				if (local45 - Static127.aLong97 > 1000L) {
					System.gc();
					Static127.aLong97 = local45;
				}
				Static100.anInt2433 = 5;
				Static74.aString136 = Static248.aString307;
			} else {
				Static74.aString136 = Static249.aString100;
				Static78.anInt6337 = 10;
				Static100.anInt2433 = 5;
			}
			return;
		}
		@Pc(90) int local90;
		if (Static78.anInt6337 == 10) {
			for (local90 = 0; local90 < 4; local90++) {
				Static327.aClass149Array1[local90] = Static294.method5315(Static325.anInt6173, Static15.anInt287);
			}
			Static78.anInt6337 = 20;
			Static74.aString136 = Static66.aString121;
			Static100.anInt2433 = 10;
		} else if (Static78.anInt6337 == 20) {
			if (Static141.aClass147_1 == null) {
				Static141.aClass147_1 = new Class147(Static229.aClass160_3, Static261.aClass167_3);
			}
			if (Static141.aClass147_1.method3941()) {
				Static193.aClass180_51 = Static294.method5313(true, 0, false);
				Static251.aClass180_94 = Static294.method5313(true, 1, false);
				Static282.aClass180_75 = Static294.method5313(true, 2, false);
				Static318.aClass180_6 = Static294.method5313(true, 3, false);
				Static284.aClass180_77 = Static294.method5313(true, 4, false);
				Static87.aClass180_80 = Static294.method5313(true, 5, true);
				Static226.aClass180_57 = Static294.method5313(false, 6, true);
				Static247.aClass180_64 = Static294.method5313(true, 7, false);
				Static312.aClass180_89 = Static294.method5313(true, 8, false);
				Static286.aClass180_78 = Static294.method5313(true, 9, false);
				Static159.aClass180_44 = Static294.method5313(true, 10, false);
				Static65.aClass180_18 = Static294.method5313(true, 11, false);
				Static194.aClass180_21 = Static294.method5313(true, 12, false);
				Static139.aClass180_36 = Static294.method5313(true, 13, false);
				Static85.aClass180_23 = Static294.method5313(false, 14, false);
				Static100.aClass180_29 = Static294.method5313(true, 15, false);
				Static36.aClass180_9 = Static294.method5313(true, 16, false);
				Static257.aClass180_67 = Static294.method5313(true, 17, false);
				Static131.aClass180_35 = Static294.method5313(true, 18, false);
				Static284.aClass180_76 = Static294.method5313(true, 19, false);
				Static200.aClass180_53 = Static294.method5313(true, 20, false);
				Static273.aClass180_72 = Static294.method5313(true, 21, false);
				Static334.aClass180_95 = Static294.method5313(true, 22, false);
				Static87.aClass180_81 = Static294.method5313(true, 23, true);
				Static100.aClass180_30 = Static294.method5313(true, 24, false);
				Static304.aClass180_85 = Static294.method5313(true, 25, false);
				Static309.aClass180_87 = Static294.method5313(true, 26, true);
				Static239.aClass180_60 = Static294.method5313(true, 27, false);
				Static42.aClass180_10 = Static294.method5313(true, 28, true);
				Static78.anInt6337 = 30;
				Static100.anInt2433 = 15;
				Static74.aString136 = Static55.aString108;
			} else {
				Static100.anInt2433 = 12;
				Static74.aString136 = Static21.aString32;
			}
		} else if (Static78.anInt6337 == 30) {
			local90 = 0;
			for (local42 = 0; local42 < 29; local42++) {
				local90 += Static269.aClass119_Sub1Array2[local42].method3149() * Static318.anIntArray84[local42] / 100;
			}
			if (local90 == 100) {
				Static74.aString136 = Static329.aString408;
				Static100.anInt2433 = 20;
				Static152.method2977(Static312.aClass180_89);
				Static64.method1302(Static312.aClass180_89);
				Static78.anInt6337 = 40;
			} else {
				if (local90 != 0) {
					Static74.aString136 = Static54.aString104 + local90 + "%";
				}
				Static100.anInt2433 = 20;
			}
		} else if (Static78.anInt6337 == 40) {
			if (Static42.aClass180_10.method4575()) {
				this.method1040(Static42.aClass180_10.method4583(1));
				Static100.anInt2433 = 25;
				Static78.anInt6337 = 50;
				Static74.aString136 = Static66.aString120;
			} else {
				Static74.aString136 = Static70.aString126 + Static42.aClass180_10.method4582() + "%";
				Static100.anInt2433 = 25;
			}
		} else if (Static78.anInt6337 == 50) {
			Static221.method3907(Static108.aBoolean108);
			Static193.aClass7_Sub8_Sub2_2 = new Class7_Sub8_Sub2();
			Static193.aClass7_Sub8_Sub2_2.method3100();
			Static213.aClass15_1 = Static187.method3414(0, Static269.aCanvas4, Static116.aClass21_4, 22050);
			Static213.aClass15_1.method4465(Static193.aClass7_Sub8_Sub2_2);
			Static238.method4096(Static284.aClass180_77, Static193.aClass7_Sub8_Sub2_2, Static100.aClass180_29, Static85.aClass180_23);
			Static272.aClass15_2 = Static187.method3414(1, Static269.aCanvas4, Static116.aClass21_4, 2048);
			Static134.aClass7_Sub8_Sub3_2 = new Class7_Sub8_Sub3();
			Static272.aClass15_2.method4465(Static134.aClass7_Sub8_Sub3_2);
			Static292.aClass76_1 = new Class76(22050, Static172.anInt2667);
			Static229.anInt4562 = Static226.aClass180_57.method4570("scape main");
			Static74.aString136 = Static162.aString158;
			Static78.anInt6337 = 60;
			Static100.anInt2433 = 30;
		} else if (Static78.anInt6337 == 60) {
			local90 = Static334.method5304(Static139.aClass180_36, Static312.aClass180_89);
			local42 = Static107.method1188();
			if (local90 < local42) {
				Static100.anInt2433 = 35;
				Static74.aString136 = Static211.aString273 + local90 * 100 / local42 + "%";
			} else {
				Static78.anInt6337 = 70;
				Static74.aString136 = Static162.aString159;
				Static100.anInt2433 = 35;
			}
		} else if (Static78.anInt6337 == 70) {
			local90 = Static127.method2613(Static312.aClass180_89);
			local42 = Static53.method1119();
			if (local90 < local42) {
				Static100.anInt2433 = 40;
				Static74.aString136 = Static47.aString93 + local90 * 100 / local42 + "%";
			} else {
				Static100.anInt2433 = 40;
				Static74.aString136 = Static323.aString400;
				Static78.anInt6337 = 80;
			}
		} else if (Static78.anInt6337 == 80) {
			if (Static309.aClass180_87.method4575()) {
				Static203.anInterface6_4 = new Class215(Static309.aClass180_87, Static286.aClass180_78, Static312.aClass180_89);
				Static74.aString136 = Static233.aString293;
				Static78.anInt6337 = 90;
				Static100.anInt2433 = 45;
			} else {
				Static74.aString136 = Static118.aString418 + Static309.aClass180_87.method4582() + "%";
				Static100.anInt2433 = 45;
			}
		} else if (Static78.anInt6337 == 90) {
			Static78.anInt6337 = 95;
			Static100.anInt2433 = 50;
			Static74.aString136 = Static348.aString431;
		} else if (Static78.anInt6337 == 95) {
			if (Static294.aBoolean459) {
				Static206.anInt4115 = 0;
				Static27.anInt622 = 0;
				Static244.anInt4807 = 0;
				Static186.anInt3771 = 0;
				Static6.anInt126 = 1;
			}
			Static294.aBoolean459 = true;
			Static244.method4220(Static116.aClass21_4);
			Static20.method310();
			Static119.method2528(false, Static244.anInt4807);
			Static100.anInt2433 = 55;
			Static74.aString136 = Static28.aString60;
			Static78.anInt6337 = 100;
		} else if (Static78.anInt6337 == 100) {
			Static150.method1570(Static139.aClass180_36, Static128.aClass89_3, Static312.aClass180_89);
			Static74.aString136 = Static293.aString366;
			Static100.anInt2433 = 60;
			Static82.method1759(5);
			Static78.anInt6337 = 110;
		} else if (Static78.anInt6337 == 110) {
			Static282.aClass180_75.method4575();
			local90 = Static282.aClass180_75.method4582();
			Static36.aClass180_9.method4575();
			local90 += Static36.aClass180_9.method4582();
			Static257.aClass180_67.method4575();
			local90 += Static257.aClass180_67.method4582();
			Static131.aClass180_35.method4575();
			local90 += Static131.aClass180_35.method4582();
			Static284.aClass180_76.method4575();
			local90 += Static284.aClass180_76.method4582();
			Static200.aClass180_53.method4575();
			local90 += Static200.aClass180_53.method4582();
			Static273.aClass180_72.method4575();
			local90 += Static273.aClass180_72.method4582();
			Static334.aClass180_95.method4575();
			local90 += Static334.aClass180_95.method4582();
			Static100.aClass180_30.method4575();
			local90 += Static100.aClass180_30.method4582();
			Static304.aClass180_85.method4575();
			local90 += Static304.aClass180_85.method4582();
			Static239.aClass180_60.method4575();
			local90 += Static239.aClass180_60.method4582();
			if (local90 < 1100) {
				Static100.anInt2433 = 65;
				Static74.aString136 = Static302.aString424 + local90 / 11 + "%";
			} else {
				Static136.method2693(Static282.aClass180_75);
				Static82.method1753(Static282.aClass180_75);
				Static290.method4753(Static282.aClass180_75);
				Static152.method2972(Static247.aClass180_64, Static282.aClass180_75);
				Static154.method2994(Static247.aClass180_64, Static36.aClass180_9);
				Static238.method4101(Static247.aClass180_64, Static131.aClass180_35);
				Static126.method2608(Static247.aClass180_64, Static284.aClass180_76);
				Static142.method2876(Static282.aClass180_75);
				Static288.method1022(Static193.aClass180_51, Static200.aClass180_53, Static251.aClass180_94);
				Static70.method1375(Static282.aClass180_75);
				Static312.method5042(Static273.aClass180_72, Static247.aClass180_64);
				Static353.method2009(Static334.aClass180_95);
				Static55.method1158(Static282.aClass180_75);
				Static202.method3589(Static312.aClass180_89, Static318.aClass180_6, Static139.aClass180_36, Static247.aClass180_64);
				Static102.method2040(Static282.aClass180_75);
				Static114.method2184(Static257.aClass180_67);
				Static199.method3567(Static304.aClass180_85, new Class69(), Static100.aClass180_30);
				Static125.method2596(Static100.aClass180_30, Static304.aClass180_85);
				Static175.method3278(Static282.aClass180_75);
				Static276.method4611(Static282.aClass180_75);
				Static66.method1339(Static282.aClass180_75);
				Static266.method4453(Static282.aClass180_75, Static312.aClass180_89);
				Static126.method2603(Static282.aClass180_75, Static312.aClass180_89);
				Static226.method4017(Static282.aClass180_75);
				Static101.method2033(Static282.aClass180_75, Static312.aClass180_89);
				Static65.method1320(Static282.aClass180_75);
				Static104.method2058(Static282.aClass180_75);
				Static74.aString136 = Static314.aString386;
				Static100.anInt2433 = 65;
				Static309.method5002();
				Static78.anInt6337 = 120;
			}
		} else if (Static78.anInt6337 == 120) {
			local90 = Static179.method3301(Static312.aClass180_89);
			local42 = Static186.method3411();
			if (local42 > local90) {
				Static100.anInt2433 = 70;
				Static74.aString136 = Static135.aString197 + local90 * 100 / local42 + "%";
			} else {
				Static264.method4437(Static312.aClass180_89, Static128.aClass89_3);
				Static69.method1371(Static160.aClass52Array10);
				Static74.aString136 = Static34.aString70;
				Static100.anInt2433 = 70;
				Static78.anInt6337 = 130;
			}
		} else if (Static78.anInt6337 == 130) {
			Static339.aClass158_1 = new Class158();
			Static116.aClass21_4.method375(10, Static339.aClass158_1);
			Static100.anInt2433 = 75;
			Static74.aString136 = Static125.aString191;
			Static78.anInt6337 = 140;
		} else if (Static78.anInt6337 == 140) {
			if (Static159.aClass180_44.method4578("", "huffman")) {
				@Pc(1043) Class101 local1043 = new Class101(Static159.aClass180_44.method4564("huffman", ""));
				Static187.method3412(local1043);
				Static100.anInt2433 = 80;
				Static74.aString136 = Static279.aString438;
				Static78.anInt6337 = 150;
			} else {
				Static100.anInt2433 = 80;
				Static74.aString136 = Static88.aString260 + "0%";
			}
		} else if (Static78.anInt6337 == 150) {
			if (!Static318.aClass180_6.method4575()) {
				Static74.aString136 = Static283.aString351 + Static318.aClass180_6.method4582() * 3 / 4 + "%";
				Static100.anInt2433 = 85;
			} else if (!Static194.aClass180_21.method4575()) {
				Static74.aString136 = Static283.aString351 + (Static194.aClass180_21.method4582() / 10 + 75) + "%";
				Static100.anInt2433 = 85;
			} else if (!Static139.aClass180_36.method4575()) {
				Static74.aString136 = Static283.aString351 + (Static139.aClass180_36.method4582() / 20 + 85) + "%";
				Static100.anInt2433 = 85;
			} else if (Static87.aClass180_81.method4559("details")) {
				Static306.method3058(Static87.aClass180_81);
				Static130.method2636(Static239.aClass180_60);
				Static74.method1490(Static247.aClass180_64, Static203.anInterface6_4);
				Static74.aString136 = Static10.aString14;
				Static100.anInt2433 = 85;
				Static78.anInt6337 = 160;
			} else {
				Static74.aString136 = Static283.aString351 + (Static87.aClass180_81.method4554("details") / 10 + 90) + "%";
				Static100.anInt2433 = 85;
			}
		} else if (Static78.anInt6337 == 160) {
			local90 = Static191.method3452();
			if (local90 == -1) {
				Static100.anInt2433 = 90;
				Static74.aString136 = Static117.aString185;
			} else if (local90 == 7 || local90 == 9) {
				this.method1024("worldlistfull");
				Static82.method1759(1000);
			} else if (Static316.aBoolean441) {
				Static100.anInt2433 = 90;
				Static78.anInt6337 = 170;
				Static74.aString136 = Static233.aString292;
			} else {
				this.method1024("worldlistio_" + local90);
				Static82.method1759(1000);
			}
		} else if (Static78.anInt6337 == 170) {
			Static210.aStringArray38 = new String[Static266.anInt5230];
			Static165.anIntArray464 = new int[Static28.anInt644];
			Static120.aBooleanArray17 = new boolean[Static28.anInt644];
			for (local90 = 0; local90 < Static28.anInt644; local90++) {
				if (Static147.method2949(local90).anInt1529 == 0) {
					Static120.aBooleanArray17[local90] = true;
					Static20.anInt407++;
				}
				Static165.anIntArray464[local90] = -1;
			}
			Static215.method3800();
			Static274.anInt5408 = Static318.aClass180_6.method4570("loginscreen");
			Static87.aClass180_80.method4573(false);
			Static226.aClass180_57.method4573(true);
			Static312.aClass180_89.method4573(true);
			Static139.aClass180_36.method4573(true);
			Static159.aClass180_44.method4573(true);
			Static318.aClass180_6.method4573(true);
			Static343.aBoolean473 = true;
			Static282.aClass180_75.anInt5411 = 2;
			Static257.aClass180_67.anInt5411 = 2;
			Static36.aClass180_9.anInt5411 = 2;
			Static131.aClass180_35.anInt5411 = 2;
			Static284.aClass180_76.anInt5411 = 2;
			Static200.aClass180_53.anInt5411 = 2;
			Static273.aClass180_72.anInt5411 = 2;
			Static216.method3821(false, -1, Static6.anInt126, -1);
			Static74.aString136 = Static198.aString253;
			Static100.anInt2433 = 95;
			Static78.anInt6337 = 180;
		} else if (Static78.anInt6337 == 180) {
			Static280.method4170(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1006() {
		if (Static85.anInt2215 == 1000) {
			return;
		}
		Static212.anInt4234++;
		if (Static212.anInt4234 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static329.anInt6225 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static102.aRandom1.setSeed((long) Static329.anInt6225);
		}
		this.method1030();
		if (Static141.aClass147_1 != null) {
			Static141.aClass147_1.method3940();
		}
		Static287.method4746();
		Static263.method4429();
		Static318.method472();
		Static259.method4351();
		if (Static128.aClass89_3 != null) {
			Static128.aClass89_3.method5461((int) Static335.method5308());
		}
		if (Static243.aClass82_1 != null) {
			@Pc(84) int local84 = Static243.aClass82_1.method2005();
			Static111.anInt2544 = local84;
		}
		Static14.method205();
		if (Static85.anInt2215 == 0) {
			this.method1038();
			Static57.method1170();
		} else if (Static85.anInt2215 == 5) {
			this.method1038();
			Static57.method1170();
		} else if (Static85.anInt2215 == 25 || Static85.anInt2215 == 28) {
			Static204.method3620();
		}
		if (Static85.anInt2215 == 10) {
			this.method1032();
			Static320.method5180();
			Static8.method142();
			Static316.method5126();
		} else if (Static85.anInt2215 == 30) {
			Static187.method3415();
		} else if (Static85.anInt2215 == 40) {
			Static316.method5126();
			if (Static346.anInt6535 != -3) {
				if (Static346.anInt6535 == 15) {
					Static284.method4698();
				} else if (Static346.anInt6535 != 2) {
					Static258.method4344();
				}
			}
		}
		Static349.method5609(Static128.aClass89_3);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1039(@OriginalArg(0) int arg0) {
		Static229.aClass160_3.anInt4734++;
		Static229.aClass160_3.anInt4735 = arg0;
		Static149.aClass99_6 = null;
		Static133.anInt2883 = 0;
		Static230.aClass61_5 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method1040(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class7_Sub3 local15 = new Class7_Sub3(arg0);
		while (true) {
			@Pc(19) int local19;
			do {
				while (true) {
					local19 = local15.method2772();
					if (local19 == 0) {
						return;
					}
					if (local19 != 1) {
						break;
					}
					@Pc(74) int[] local74 = Static243.anIntArray642 = new int[6];
					local74[0] = local15.method2764();
					local74[1] = local15.method2764();
					local74[2] = local15.method2764();
					local74[3] = local15.method2764();
					local74[4] = local15.method2764();
					local74[5] = local15.method2764();
				}
			} while (local19 != 4);
			@Pc(37) int local37 = local15.method2772();
			Static217.anIntArray841 = new int[local37];
			for (@Pc(42) int local42 = 0; local42 < local37; local42++) {
				Static217.anIntArray841[local42] = local15.method2764();
				if (Static217.anIntArray841[local42] == 65535) {
					Static217.anIntArray841[local42] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1042() {
		if (Static229.aClass160_3.anInt4734 > Static204.anInt4042) {
			Static246.anInt4880 = (Static229.aClass160_3.anInt4734 * 50 - 50) * 5;
			if (Static64.anInt1615 == Static206.anInt4119) {
				Static206.anInt4119 = Static342.anInt6490;
			} else {
				Static206.anInt4119 = Static64.anInt1615;
			}
			if (Static246.anInt4880 > 3000) {
				Static246.anInt4880 = 3000;
			}
			if (Static229.aClass160_3.anInt4734 >= 2 && Static229.aClass160_3.anInt4735 == 6) {
				this.method1024("js5connect_outofdate");
				Static85.anInt2215 = 1000;
				return;
			}
			if (Static229.aClass160_3.anInt4734 >= 4 && Static229.aClass160_3.anInt4735 == -1) {
				this.method1024("js5crc");
				Static85.anInt2215 = 1000;
				return;
			}
			if (Static229.aClass160_3.anInt4734 >= 4 && (Static85.anInt2215 == 0 || Static85.anInt2215 == 5)) {
				if (Static229.aClass160_3.anInt4735 == 7 || Static229.aClass160_3.anInt4735 == 9) {
					this.method1024("js5connect_full");
				} else if (Static229.aClass160_3.anInt4735 > 0) {
					this.method1024("js5connect");
				} else {
					this.method1024("js5io");
				}
				Static85.anInt2215 = 1000;
				return;
			}
		}
		Static204.anInt4042 = Static229.aClass160_3.anInt4734;
		if (Static246.anInt4880 > 0) {
			Static246.anInt4880--;
			return;
		}
		try {
			if (Static133.anInt2883 == 0) {
				Static149.aClass99_6 = Static116.aClass21_4.method380(Static206.anInt4119, Static302.aString423);
				Static133.anInt2883++;
			}
			if (Static133.anInt2883 == 1) {
				if (Static149.aClass99_6.anInt2836 == 2) {
					this.method1039(1000);
					return;
				}
				if (Static149.aClass99_6.anInt2836 == 1) {
					Static133.anInt2883++;
				}
			}
			if (Static133.anInt2883 == 2) {
				Static230.aClass61_5 = new Class61((Socket) Static149.aClass99_6.anObject2, Static116.aClass21_4);
				@Pc(192) Class7_Sub3 local192 = new Class7_Sub3(5);
				local192.method2735(15);
				local192.method2765(555);
				Static230.aClass61_5.method1377(local192.aByteArray33, 5);
				Static133.anInt2883++;
				Static326.aLong208 = Static335.method5308();
			}
			if (Static133.anInt2883 == 3) {
				if (Static85.anInt2215 == 0 || Static85.anInt2215 == 5 || Static230.aClass61_5.method1372() > 0) {
					@Pc(251) int local251 = Static230.aClass61_5.method1382();
					if (local251 != 0) {
						this.method1039(local251);
						return;
					}
					Static133.anInt2883++;
				} else if (Static335.method5308() - Static326.aLong208 > 30000L) {
					this.method1039(1001);
					return;
				}
			}
			if (Static133.anInt2883 == 4) {
				@Pc(282) boolean local282 = Static85.anInt2215 == 5 || Static85.anInt2215 == 10 || Static85.anInt2215 == 28;
				Static229.aClass160_3.method4118(!local282, Static230.aClass61_5);
				Static230.aClass61_5 = null;
				Static133.anInt2883 = 0;
				Static149.aClass99_6 = null;
			}
		} catch (@Pc(299) IOException local299) {
			this.method1039(1002);
		}
	}
}
