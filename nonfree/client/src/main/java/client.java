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
				Static300.method4621("Argument count");
			}
			Static589.aClass342_4 = new Class342();
			Static589.aClass342_4.anInt9498 = Integer.parseInt(arg0[0]);
			Static35.aClass342_1 = new Class342();
			Static35.aClass342_1.anInt9498 = Integer.parseInt(arg0[1]);
			Static413.aClass342_2 = new Class342();
			Static413.aClass342_2.anInt9498 = Integer.parseInt(arg0[2]);
			Static202.aClass147_5 = Static56.aClass147_1;
			if (arg0[3].equals("live")) {
				Static14.aClass299_1 = Static442.aClass299_2;
			} else if (arg0[3].equals("rc")) {
				Static14.aClass299_1 = Static513.aClass299_3;
			} else if (arg0[3].equals("wip")) {
				Static14.aClass299_1 = Static668.aClass299_4;
			} else {
				Static300.method4621("modewhat");
			}
			Static609.anInt9834 = Static589.method8289(arg0[4]);
			if (Static609.anInt9834 == -1) {
				if (arg0[4].equals("english")) {
					Static609.anInt9834 = 0;
				} else if (arg0[4].equals("german")) {
					Static609.anInt9834 = 1;
				} else {
					Static300.method4621("language");
				}
			}
			Static603.aBoolean744 = false;
			Static663.aBoolean803 = false;
			if (arg0[5].equals("game0")) {
				Static55.aClass118_2 = Static438.aClass118_6;
			} else if (arg0[5].equals("game1")) {
				Static55.aClass118_2 = Static68.aClass118_3;
			} else if (arg0[5].equals("game2")) {
				Static55.aClass118_2 = Static617.aClass118_7;
			} else if (arg0[5].equals("game3")) {
				Static55.aClass118_2 = Static101.aClass118_4;
			} else {
				Static300.method4621("game");
			}
			Static303.aString49 = "";
			Static567.anInt5912 = Static55.aClass118_2.anInt3893;
			Static593.anInt9532 = 0;
			Static294.anInt6319 = 0;
			Static455.aString82 = null;
			Static365.aByteArray63 = null;
			Static76.aBoolean104 = true;
			Static140.aBoolean219 = true;
			Static651.aBoolean779 = false;
			Static196.aBoolean295 = false;
			Static362.anInt5843 = 0;
			Static306.aLong161 = 0L;
			@Pc(183) client local183 = new client();
			Static200.aClient1 = local183;
			local183.method1489(Static14.aClass299_1.method7239() + 32, Static55.aClass118_2.aString33);
			Static380.aFrame2.setLocation(40, 40);
		} catch (@Pc(206) Exception local206) {
			Static503.method7153((String) null, local206);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1511() {
		@Pc(26) int local26;
		if (Static406.anInt6454 == 7 && !Static537.method1805()) {
			if (Static620.anInt9925 > 1) {
				Static126.anInt2583 = Static629.anInt10041;
				Static620.anInt9925--;
			}
			if (!Static43.aBoolean74) {
				Static449.method6568();
			}
			for (local26 = 0; local26 < 100 && Static498.method8890(); local26++) {
			}
		}
		Static619.anInt10674++;
		Static655.method9119(-1, -1, (Class260) null);
		Static208.method3665(-1, (Class260) null, -1);
		Static162.method2938();
		Static629.anInt10041++;
		for (local26 = 0; local26 < Static567.anInt5909; local26++) {
			@Pc(66) Class28_Sub1_Sub1_Sub1_Sub2 local66 = Static84.aClass3_Sub3Array1[local26].aClass28_Sub1_Sub1_Sub1_Sub2_1;
			if (local66 != null) {
				@Pc(72) byte local72 = local66.aClass300_1.aByte124;
				if ((local72 & 0x1) != 0) {
					@Pc(83) int local83 = local66.method9314();
					@Pc(110) int local110;
					if ((local72 & 0x2) != 0 && local66.anInt10812 == 0 && Math.random() * 1000.0D < 10.0D) {
						local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(118) int local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local110 != 0 || local118 != 0) {
							@Pc(132) int local132 = local110 + local66.anIntArray956[0];
							if (local132 < 0) {
								local132 = 0;
							} else if (Static158.anInt927 - local83 - 1 < local132) {
								local132 = Static158.anInt927 - local83 - 1;
							}
							@Pc(163) int local163 = local118 + local66.anIntArray955[0];
							if (local163 < 0) {
								local163 = 0;
							} else if (Static515.anInt8292 - local83 - 1 < local163) {
								local163 = Static515.anInt8292 - local83 - 1;
							}
							@Pc(212) int local212 = Static180.method3220(local163, local83, Static597.anIntArray826, 0, true, local66.anIntArray956[0], Static62.anIntArray112, local66.anIntArray955[0], local83, Static1.aClass252Array5[local66.aByte174], local83, local132, -1, 0);
							if (local212 > 0) {
								if (local212 > 9) {
									local212 = 9;
								}
								for (@Pc(224) int local224 = 0; local224 < local212; local224++) {
									local66.anIntArray956[local224] = Static62.anIntArray112[local212 - local224 - 1];
									local66.anIntArray955[local224] = Static597.anIntArray826[local212 - local224 - 1];
									local66.aByteArray111[local224] = 1;
								}
								local66.anInt10812 = local212;
							}
						}
					}
					Static33.method9312(local66, true);
					local110 = Static395.method5579(local66);
					Static527.method7603(local66);
					Static254.method4156(local110, local66, Static88.anInt1724, Static69.anInt1321);
					Static231.method3913(local66, Static88.anInt1724);
					Static162.method2937(local66);
				}
			}
		}
		if (!Static537.method1805() && Static433.anInt8266 == 0) {
			if (Static428.anInt6834 == 2) {
				Static55.method1207();
			} else {
				Static273.method4432();
			}
			if (Static509.anInt8222 >> 9 < 14 || Static158.anInt927 - 14 <= Static509.anInt8222 >> 9 || Static652.anInt10382 >> 9 < 14 || Static652.anInt10382 >> 9 >= Static515.anInt8292 - 14) {
				Static590.method8290();
			}
		}
		while (true) {
			@Pc(347) Class3_Sub17 local347;
			@Pc(352) Class260 local352;
			@Pc(360) Class260 local360;
			do {
				local347 = (Class3_Sub17) Static65.aClass338_33.method8169();
				if (local347 == null) {
					while (true) {
						do {
							local347 = (Class3_Sub17) Static232.aClass338_110.method8169();
							if (local347 == null) {
								while (true) {
									do {
										local347 = (Class3_Sub17) Static510.aClass338_126.method8169();
										if (local347 == null) {
											if (Static678.aClass260_21 != null) {
												Static42.method1060();
											}
											if (Static588.anInt9467 % 1500 == 0) {
												Static355.method5243();
											}
											if (Static406.anInt6454 == 7 && !Static537.method1805()) {
												Static507.method6859();
											}
											Static513.method7229();
											if (Static430.aBoolean489 && Static524.method7320() - 60000L > Static123.aLong80) {
												Static343.method5153();
											}
											for (@Pc(517) Class28_Sub4_Sub1 local517 = (Class28_Sub4_Sub1) Static225.aClass371_2.method8911(); local517 != null; local517 = (Class28_Sub4_Sub1) Static225.aClass371_2.method8917()) {
												if ((long) local517.anInt8233 < Static524.method7320() / 1000L - 5L) {
													if (local517.aShort87 > 0) {
														Static450.method6577(5, "", "", local517.aString99 + Static601.aClass346_21.method8440(Static609.anInt9834), 0, "");
													}
													if (local517.aShort87 == 0) {
														Static450.method6577(5, "", "", local517.aString99 + Static601.aClass346_22.method8440(Static609.anInt9834), 0, "");
													}
													local517.method9276();
												}
											}
											if (Static406.anInt6454 == 7 && !Static537.method1805()) {
												if (Static559.aClass269_1 == null) {
													Static67.method1352(false);
													return;
												}
												Static213.anInt4078++;
												if (Static213.anInt4078 > 50) {
													@Pc(627) Class3_Sub34 local627 = Static172.method3123(Static163.aClass375_1, Static199.aClass218_53);
													Static441.method6275(local627);
												}
												try {
													Static93.method9381();
													return;
												} catch (@Pc(638) IOException local638) {
													Static67.method1352(false);
													return;
												}
											}
											return;
										}
										local352 = local347.aClass260_6;
										if (local352.anInt6985 < 0) {
											break;
										}
										local360 = Static383.method5492(local352.anInt6993);
									} while (local360 == null || local360.aClass260Array2 == null || local352.anInt6985 >= local360.aClass260Array2.length || local352 != local360.aClass260Array2[local352.anInt6985]);
									Static565.method8015(local347);
								}
							}
							local352 = local347.aClass260_6;
							if (local352.anInt6985 < 0) {
								break;
							}
							local360 = Static383.method5492(local352.anInt6993);
						} while (local360 == null || local360.aClass260Array2 == null || local352.anInt6985 >= local360.aClass260Array2.length || local360.aClass260Array2[local352.anInt6985] != local352);
						Static565.method8015(local347);
					}
				}
				local352 = local347.aClass260_6;
				if (local352.anInt6985 < 0) {
					break;
				}
				local360 = Static383.method5492(local352.anInt6993);
			} while (local360 == null || local360.aClass260Array2 == null || local360.aClass260Array2.length <= local352.anInt6985 || local360.aClass260Array2[local352.anInt6985] != local352);
			Static565.method8015(local347);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1514() {
		if (Static581.aClass341_4.anInt9492 > Static247.anInt4486) {
			Static541.aClass342_3.method8309();
			Static294.anInt6317 = (Static581.aClass341_4.anInt9492 * 50 - 50) * 5;
			if (Static294.anInt6317 > 3000) {
				Static294.anInt6317 = 3000;
			}
			if (Static581.aClass341_4.anInt9492 >= 2 && Static581.aClass341_4.anInt9491 == 6) {
				this.method1508("js5connect_outofdate");
				Static406.anInt6454 = 14;
				return;
			}
			if (Static581.aClass341_4.anInt9492 >= 4 && Static581.aClass341_4.anInt9491 == -1) {
				this.method1508("js5crc");
				Static406.anInt6454 = 14;
				return;
			}
			if (Static581.aClass341_4.anInt9492 >= 4 && Static630.method8802(Static406.anInt6454)) {
				if (Static581.aClass341_4.anInt9491 == 7 || Static581.aClass341_4.anInt9491 == 9) {
					this.method1508("js5connect_full");
				} else if (Static581.aClass341_4.anInt9491 <= 0) {
					this.method1508("js5io");
				} else if (Static576.aString111 == null) {
					this.method1508("js5connect");
				} else {
					this.method1508("js5proxy_" + Static576.aString111.trim());
				}
				Static406.anInt6454 = 14;
				return;
			}
		}
		Static247.anInt4486 = Static581.aClass341_4.anInt9492;
		if (Static294.anInt6317 > 0) {
			Static294.anInt6317--;
			return;
		}
		try {
			if (Static279.anInt4823 == 0) {
				Static543.aClass81_10 = Static541.aClass342_3.method8306(Static247.aClass291_1);
				Static279.anInt4823++;
			}
			if (Static279.anInt4823 == 1) {
				if (Static543.aClass81_10.anInt2532 == 2) {
					if (Static543.aClass81_10.anObject4 != null) {
						Static576.aString111 = (String) Static543.aClass81_10.anObject4;
					}
					this.method1527(1000);
					return;
				}
				if (Static543.aClass81_10.anInt2532 == 1) {
					Static279.anInt4823++;
				}
			}
			if (Static279.anInt4823 == 2) {
				Static138.aClass289_1 = new Class289((Socket) Static543.aClass81_10.anObject4, Static247.aClass291_1, 25000);
				@Pc(201) Class3_Sub25 local201 = new Class3_Sub25(5);
				local201.method8614(Static515.aClass224_2.anInt6057);
				local201.method8588(649);
				Static138.aClass289_1.method7099(5, local201.aByteArray106);
				Static279.anInt4823++;
				Static169.aLong104 = Static524.method7320();
			}
			if (Static279.anInt4823 == 3) {
				if (Static630.method8802(Static406.anInt6454) || Static138.aClass289_1.method7105() > 0) {
					@Pc(244) int local244 = Static138.aClass289_1.method7100();
					if (local244 != 0) {
						this.method1527(local244);
						return;
					}
					Static279.anInt4823++;
				} else if (Static524.method7320() - Static169.aLong104 > 30000L) {
					this.method1527(1001);
					return;
				}
			}
			if (Static279.anInt4823 == 4) {
				@Pc(291) boolean local291 = Static630.method8802(Static406.anInt6454) || Static501.method7146(Static406.anInt6454) || Static661.method9136(Static406.anInt6454);
				@Pc(294) Class100[] local294 = Static155.method2824();
				@Pc(302) Class3_Sub25 local302 = new Class3_Sub25(local294.length * 4);
				Static138.aClass289_1.method7098(0, local302.aByteArray106.length, local302.aByteArray106);
				for (@Pc(313) int local313 = 0; local313 < local294.length; local313++) {
					local294[local313].method2829(local302.method8618());
				}
				Static581.aClass341_4.method8295(Static138.aClass289_1, !local291);
				Static543.aClass81_10 = null;
				Static279.anInt4823 = 0;
				Static138.aClass289_1 = null;
			}
		} catch (@Pc(349) IOException local349) {
			this.method1527(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1502()) {
			return;
		}
		Static589.aClass342_4 = new Class342();
		Static589.aClass342_4.anInt9498 = Integer.parseInt(this.getParameter("worldid"));
		Static35.aClass342_1 = new Class342();
		Static35.aClass342_1.anInt9498 = Integer.parseInt(this.getParameter("lobbyid"));
		Static35.aClass342_1.aString113 = this.getParameter("lobbyaddress");
		Static413.aClass342_2 = new Class342();
		Static413.aClass342_2.anInt9498 = Integer.parseInt(this.getParameter("demoid"));
		Static413.aClass342_2.aString113 = this.getParameter("demoaddress");
		Static202.aClass147_5 = Static654.method9105(Integer.parseInt(this.getParameter("modewhere")));
		if (Static56.aClass147_1 == Static202.aClass147_5) {
			Static202.aClass147_5 = Static152.aClass147_3;
		} else if (!Static410.method5855(Static202.aClass147_5) && Static487.aClass147_8 != Static202.aClass147_5) {
			Static202.aClass147_5 = Static487.aClass147_8;
		}
		Static14.aClass299_1 = Static130.method2442(Integer.parseInt(this.getParameter("modewhat")));
		if (Static668.aClass299_4 != Static14.aClass299_1 && Static14.aClass299_1 != Static513.aClass299_3 && Static14.aClass299_1 != Static442.aClass299_2) {
			Static14.aClass299_1 = Static442.aClass299_2;
		}
		try {
			Static609.anInt9834 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static609.anInt9834 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static603.aBoolean744 = true;
		} else {
			Static603.aBoolean744 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static663.aBoolean803 = true;
		} else {
			Static663.aBoolean803 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static638.aBoolean742 = true;
		} else {
			Static638.aBoolean742 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static55.aClass118_2 = Static438.aClass118_6;
			} else if (local152.equals("1")) {
				Static55.aClass118_2 = Static68.aClass118_3;
			} else if (local152.equals("2")) {
				Static55.aClass118_2 = Static617.aClass118_7;
			} else if (local152.equals("3")) {
				Static55.aClass118_2 = Static101.aClass118_4;
			}
		}
		try {
			Static362.anInt5843 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static362.anInt5843 = 0;
		}
		Static95.aString16 = this.getParameter("quiturl");
		Static303.aString49 = this.getParameter("settings");
		if (Static303.aString49 == null) {
			Static303.aString49 = "";
		}
		Static624.aBoolean697 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static294.anInt6319 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static294.anInt6319 = 0;
			}
		}
		Static567.anInt5912 = Integer.parseInt(this.getParameter("colourid"));
		if (Static567.anInt5912 < 0 || Static567.anInt5912 >= Static13.aColorArray1.length) {
			Static567.anInt5912 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static76.aBoolean104 = true;
			Static140.aBoolean219 = true;
		}
		@Pc(252) String local252 = this.getParameter("frombilling");
		if (local252 != null && local252.equals("true")) {
			Static196.aBoolean295 = true;
		}
		@Pc(264) String local264 = this.getParameter("sskey");
		Static365.aByteArray63 = Static219.method3801(Static152.method2799(local264));
		if (Static365.aByteArray63.length < 16) {
			Static365.aByteArray63 = null;
		}
		@Pc(282) String local282 = this.getParameter("force64mb");
		if (local282 != null && local282.equals("true")) {
			Static651.aBoolean779 = true;
		}
		@Pc(294) String local294 = this.getParameter("worldflags");
		if (local294 != null) {
			try {
				Static593.anInt9532 = Integer.parseInt(local294);
			} catch (@Pc(301) Exception local301) {
			}
		}
		@Pc(306) String local306 = this.getParameter("userFlow");
		if (local306 != null) {
			try {
				Static306.aLong161 = Long.parseLong(local306);
			} catch (@Pc(313) NumberFormatException local313) {
			}
		}
		Static455.aString82 = this.getParameter("additionalInfo");
		if (Static455.aString82 != null && Static455.aString82.length() > 50) {
			Static455.aString82 = null;
		}
		Static200.aClient1 = this;
		if (Static55.aClass118_2 == Static438.aClass118_6) {
			Static602.anInt9666 = 503;
			Static33.anInt10742 = 765;
		} else if (Static55.aClass118_2 == Static68.aClass118_3) {
			Static602.anInt9666 = 480;
			Static33.anInt10742 = 640;
		}
		this.method1497(Static33.anInt10742, Static55.aClass118_2.aString33, Static14.aClass299_1.method7239() + 32, Static602.anInt9666);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1504() {
		if (Static651.aBoolean779) {
			Static387.anInt6096 = 64;
		}
		@Pc(20) Frame local20 = new Frame("Jagex");
		local20.pack();
		local20.dispose();
		Static135.method5711();
		Static197.aClass240_1 = new Class240(Static247.aClass291_1);
		Static581.aClass341_4 = new Class341();
		Static464.method6730(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static202.aClass147_5 != Static487.aClass147_8) {
			Static292.aByteArrayArray20 = new byte[50][];
		}
		Static24.aClass3_Sub22_4 = Static632.method8814();
		if (Static202.aClass147_5 == Static487.aClass147_8) {
			Static589.aClass342_4.aString113 = this.getCodeBase().getHost();
		} else if (Static410.method5855(Static202.aClass147_5)) {
			Static589.aClass342_4.aString113 = this.getCodeBase().getHost();
			Static589.aClass342_4.anInt9493 = Static589.aClass342_4.anInt9498 + 40000;
			Static35.aClass342_1.anInt9493 = Static35.aClass342_1.anInt9498 + 40000;
			Static413.aClass342_2.anInt9493 = Static413.aClass342_2.anInt9498 + 40000;
			Static589.aClass342_4.anInt9494 = Static589.aClass342_4.anInt9498 + 50000;
			Static35.aClass342_1.anInt9494 = Static35.aClass342_1.anInt9498 + 50000;
			Static413.aClass342_2.anInt9494 = Static413.aClass342_2.anInt9498 + 50000;
		} else if (Static202.aClass147_5 == Static56.aClass147_1) {
			Static589.aClass342_4.aString113 = "127.0.0.1";
			Static35.aClass342_1.aString113 = "127.0.0.1";
			Static413.aClass342_2.aString113 = "127.0.0.1";
			Static589.aClass342_4.anInt9493 = Static589.aClass342_4.anInt9498 + 40000;
			Static35.aClass342_1.anInt9493 = Static35.aClass342_1.anInt9498 + 40000;
			Static413.aClass342_2.anInt9493 = Static413.aClass342_2.anInt9498 + 40000;
			Static589.aClass342_4.anInt9494 = Static589.aClass342_4.anInt9498 + 50000;
			Static35.aClass342_1.anInt9494 = Static35.aClass342_1.anInt9498 + 50000;
			Static413.aClass342_2.anInt9494 = Static413.aClass342_2.anInt9498 + 50000;
		}
		Static372.aShortArray87 = Static157.aShortArray39 = Static467.aShortArray110 = Static124.aShortArray30 = new short[256];
		Static541.aClass342_3 = Static589.aClass342_4;
		if (Static68.aClass118_3 == Static55.aClass118_2) {
			Static247.anInt4490 = 0;
			Static332.aBoolean403 = true;
			Static131.anInt2695 = 16777215;
			Static58.aShortArrayArrayArray1 = Static346.aShortArrayArrayArray7;
			Static64.aShortArrayArray2 = Static643.aShortArrayArray30;
		} else if (Static55.aClass118_2 == Static101.aClass118_4) {
			Static58.aShortArrayArrayArray1 = Static109.aShortArrayArrayArray2;
			Static64.aShortArrayArray2 = Static529.aShortArrayArray29;
		} else {
			Static64.aShortArrayArray2 = Static42.aShortArrayArray1;
			Static58.aShortArrayArrayArray1 = Static294.aShortArrayArrayArray8;
		}
		if (Static438.aClass118_6 == Static55.aClass118_2) {
			Static630.aBoolean763 = false;
		}
		try {
			Static611.aClipboard1 = Static200.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(224) Exception local224) {
		}
		Static440.aClass19_1 = Static67.method1351(Static126.aCanvas6);
		Static22.aClass16_2 = Static71.method1373(Static126.aCanvas6);
		try {
			if (Static247.aClass291_1.aClass214_1 != null) {
				Static340.aClass344_7 = new Class344(Static247.aClass291_1.aClass214_1, 5200, 0);
				for (@Pc(248) int local248 = 0; local248 < 37; local248++) {
					Static538.aClass344Array1[local248] = new Class344(Static247.aClass291_1.aClass214Array1[local248], 6000, 0);
				}
				Static311.aClass344_5 = new Class344(Static247.aClass291_1.aClass214_2, 6000, 0);
				Static148.aClass337_4 = new Class337(255, Static340.aClass344_7, Static311.aClass344_5, 500000);
				Static10.aClass344_1 = new Class344(Static247.aClass291_1.aClass214_3, 24, 0);
				Static247.aClass291_1.aClass214Array1 = null;
				Static247.aClass291_1.aClass214_3 = null;
				Static247.aClass291_1.aClass214_1 = null;
				Static247.aClass291_1.aClass214_2 = null;
			}
		} catch (@Pc(304) IOException local304) {
			Static148.aClass337_4 = null;
			Static340.aClass344_7 = null;
			Static10.aClass344_1 = null;
			Static311.aClass344_5 = null;
		}
		if (Static202.aClass147_5 != Static487.aClass147_8) {
			Static261.aBoolean343 = true;
		}
		Static424.aString69 = Static601.aClass346_14.method8440(Static609.anInt9834);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1490() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static287.anInt4910 + "," + Static72.anInt1361 + "," + Static158.anInt927 + "," + Static515.anInt8292 + "|";
			if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 != null) {
				local7 = local7 + "2)" + Static309.anInt5138 + "," + (Static287.anInt4910 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0]) + "," + (Static72.anInt1361 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0]) + "|";
			}
			local7 = local7 + "3)" + Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() + "|4)" + Static24.aClass3_Sub22_4.aClass6_Sub17_2.method5285() + "|5)" + Static673.method9353() + "|6)" + Static312.anInt5191 + "," + Static222.anInt4196 + "|";
			local7 = local7 + "7)" + Static24.aClass3_Sub22_4.aClass6_Sub12_1.method4157() + "|";
			local7 = local7 + "8)" + Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374() + "|";
			local7 = local7 + "9)" + Static24.aClass3_Sub22_4.aClass6_Sub29_1.method8967() + "|";
			local7 = local7 + "10)" + Static24.aClass3_Sub22_4.aClass6_Sub15_1.method4448() + "|";
			local7 = local7 + "11)" + Static24.aClass3_Sub22_4.aClass6_Sub10_1.method4135() + "|";
			local7 = local7 + "12)" + Static24.aClass3_Sub22_4.lb.method7116() + "|";
			local7 = local7 + "13)" + Static387.anInt6096 + "|";
			local7 = local7 + "14)" + Static406.anInt6454;
			if (Static241.aClass3_Sub10_1 != null) {
				local7 = local7 + "|15)" + Static241.aClass3_Sub10_1.anInt1059;
			}
			try {
				if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 2) {
					@Pc(248) Class local248 = Class.forName("java.lang.ClassLoader");
					@Pc(252) Field local252 = local248.getDeclaredField("nativeLibraries");
					@Pc(255) Class local255 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(265) Method local265 = local255.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local265.invoke(local252, Boolean.TRUE);
					@Pc(288) Vector local288 = (Vector) local252.get(client.class.getClassLoader());
					for (@Pc(290) int local290 = 0; local290 < local288.size(); local290++) {
						try {
							@Pc(296) Object local296 = local288.elementAt(local290);
							@Pc(301) Field local301 = local296.getClass().getDeclaredField("name");
							local265.invoke(local301, Boolean.TRUE);
							try {
								@Pc(316) String local316 = (String) local301.get(local296);
								if (local316 != null && local316.indexOf("sw3d.dll") != -1) {
									@Pc(328) Field local328 = local296.getClass().getDeclaredField("handle");
									local265.invoke(local328, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local328.getLong(local296));
									local265.invoke(local328, Boolean.FALSE);
								}
							} catch (@Pc(364) Throwable local364) {
							}
							local265.invoke(local301, Boolean.FALSE);
						} catch (@Pc(376) Throwable local376) {
						}
					}
				}
			} catch (@Pc(388) Throwable local388) {
			}
			local7 = local7 + "]";
		} catch (@Pc(399) Throwable local399) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1517() {
		if (Static406.anInt6454 == 14) {
			return;
		}
		@Pc(16) long local16 = Static11.method182() / 1000000L - Static294.aLong205;
		Static294.aLong205 = Static11.method182() / 1000000L;
		@Pc(28) boolean local28 = Static548.method7846();
		if (local28 && Static278.aBoolean253 && Static98.aClass127_3 != null) {
			Static98.aClass127_3.method7563();
		}
		if (Static116.method2198(Static406.anInt6454)) {
			if (Static94.aLong53 != 0L && Static524.method7320() > Static94.aLong53) {
				Static235.method3936(Static362.anInt5846, Static673.method9353(), Static379.anInt6059, false);
			} else if (!Static674.aClass13_22.method8508() && Static619.aBoolean814) {
				Static402.method5685();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static442.aFrame3 == null) {
			@Pc(78) Container local78;
			if (Static380.aFrame2 != null) {
				local78 = Static380.aFrame2;
			} else if (Static124.anApplet1 == null) {
				local78 = Static95.anApplet_Sub1_1;
			} else {
				local78 = Static124.anApplet1;
			}
			local90 = local78.getSize().width;
			local94 = local78.getSize().height;
			if (Static380.aFrame2 == local78) {
				@Pc(100) Insets local100 = Static380.aFrame2.getInsets();
				local90 -= local100.left + local100.right;
				local94 -= local100.top + local100.bottom;
			}
			if (Static512.anInt8242 != local90 || Static203.anInt3986 != local94 || Static156.aBoolean235) {
				if (Static674.aClass13_22 == null || Static674.aClass13_22.method8481()) {
					Static135.method5711();
				} else {
					Static512.anInt8242 = local90;
					Static203.anInt3986 = local94;
				}
				Static94.aLong53 = Static524.method7320() + 500L;
				Static156.aBoolean235 = false;
			}
		}
		if (Static442.aFrame3 != null && !Static633.aBoolean766 && Static116.method2198(Static406.anInt6454)) {
			Static235.method3936(-1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1, false);
		}
		@Pc(172) boolean local172 = false;
		if (Static476.aBoolean599) {
			Static476.aBoolean599 = false;
			local172 = true;
		}
		if (local172) {
			Static633.method8836();
		}
		if (Static674.aClass13_22 != null && Static674.aClass13_22.method8508() || Static673.method9353() != 1) {
			Static540.method7765();
		}
		if (Static630.method8802(Static406.anInt6454)) {
			Static395.method5581(local172);
		} else if (Static185.method3447(Static406.anInt6454)) {
			Static132.method2500();
		} else if (Static374.method5407(Static406.anInt6454)) {
			Static132.method2500();
		} else if (Static284.method4528(Static406.anInt6454)) {
			if (Static44.anInt1037 == 1) {
				if (Static146.anInt2956 < Static219.anInt4162) {
					Static146.anInt2956 = Static219.anInt4162;
				}
				local90 = (Static146.anInt2956 - Static219.anInt4162) * 50 / Static146.anInt2956;
				Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, true, Static601.aClass346_14.method8440(Static609.anInt9834) + "<br>(" + local90 + "%)");
			} else if (Static44.anInt1037 == 2) {
				if (Static651.anInt10354 < Static290.anInt4940) {
					Static651.anInt10354 = Static290.anInt4940;
				}
				local90 = (Static651.anInt10354 - Static290.anInt4940) * 50 / Static651.anInt10354 + 50;
				Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, true, Static601.aClass346_14.method8440(Static609.anInt9834) + "<br>(" + local90 + "%)");
			} else {
				Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, true, Static601.aClass346_14.method8440(Static609.anInt9834));
			}
		} else if (Static406.anInt6454 == 10) {
			Static596.method8386(local16);
		} else if (Static406.anInt6454 == 13) {
			Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, false, Static601.aClass346_16.method8440(Static609.anInt9834) + "<br>" + Static601.aClass346_17.method8440(Static609.anInt9834));
		}
		if (Static649.anInt10340 == 3) {
			for (local90 = 0; local90 < Static329.anInt5472; local90++) {
				@Pc(370) Rectangle local370 = Class21.aRectangleArray9[local90];
				if (Static157.aBooleanArray15[local90]) {
					Static674.aClass13_22.method8460(local370.y, local370.height, -65281, local370.x, local370.width);
				} else if (Static454.aBooleanArray31[local90]) {
					Static674.aClass13_22.method8460(local370.y, local370.height, -65536, local370.x, local370.width);
				} else {
					Static674.aClass13_22.method8460(local370.y, local370.height, -16711936, local370.x, local370.width);
				}
			}
		}
		if (Static316.method4828()) {
			Static240.method4034(Static674.aClass13_22);
		}
		if (Static247.aClass291_1.aBoolean618 && Static116.method2198(Static406.anInt6454) && Static649.anInt10340 == 0 && Static673.method9353() == 1 && !local172) {
			local90 = 0;
			for (local94 = 0; local94 < Static329.anInt5472; local94++) {
				if (Static454.aBooleanArray31[local94]) {
					Static454.aBooleanArray31[local94] = false;
					Static619.aRectangleArray10[local90++] = Class21.aRectangleArray9[local94];
				}
			}
			try {
				if (Static82.aBoolean134) {
					Static511.method7218(local90, Static619.aRectangleArray10);
				} else {
					Static674.aClass13_22.method8488(Static619.aRectangleArray10, local90);
				}
			} catch (@Pc(496) Exception_Sub1 local496) {
			}
		} else if (!Static630.method8802(Static406.anInt6454)) {
			for (local90 = 0; local90 < Static329.anInt5472; local90++) {
				Static454.aBooleanArray31[local90] = false;
			}
			try {
				if (Static82.aBoolean134) {
					Static567.method5369();
				} else {
					Static674.aClass13_22.method8518();
				}
			} catch (@Pc(529) Exception_Sub1 local529) {
				Static503.method7153(local529.getMessage() + " (Recovered) " + this.method1490(), local529);
				Static382.method5480(false, 0);
			}
		}
		Static156.method2848();
		local90 = Static24.aClass3_Sub22_4.aClass6_Sub14_1.method4383();
		if (local90 == 0) {
			Static373.method5403(15L);
		} else if (local90 == 1) {
			Static373.method5403(10L);
		} else if (local90 == 2) {
			Static373.method5403(5L);
		} else if (local90 == 3) {
			Static373.method5403(2L);
		}
		if (Static598.aBoolean738) {
			Static119.method2272();
		}
		if (Static24.aClass3_Sub22_4.aClass6_Sub11_1.method4145() == 1 && Static406.anInt6454 == 3 && Static110.anInt2265 != -1) {
			Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub11_1);
			Static441.method6272();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1518() {
		@Pc(11) boolean local11 = Static581.aClass341_4.method8301();
		if (!local11) {
			this.method1514();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1522() {
		if (Static406.anInt6454 == 14) {
			return;
		}
		Static588.anInt9467++;
		if (Static588.anInt9467 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static584.anInt9404 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static394.aRandom1.setSeed((long) Static584.anInt9404);
		}
		if (Static588.anInt9467 % 50 == 0) {
			Static616.anInt9884 = Static214.anInt4083;
			Static214.anInt4083 = 0;
			Static285.anInt9771 = Static328.anInt5448;
			Static328.anInt5448 = 0;
		}
		this.method1518();
		if (Static180.aClass259_1 != null) {
			Static180.aClass259_1.method6241();
		}
		Static604.method8549();
		Static630.method8804();
		Static440.aClass19_1.method2351();
		Static22.aClass16_2.method5889();
		if (Static674.aClass13_22 != null) {
			Static674.aClass13_22.method8516((int) Static524.method7320());
		}
		Static316.method4830();
		Static434.anInt6889 = 0;
		Static664.anInt10591 = 0;
		for (@Pc(99) Interface22 local99 = Static440.aClass19_1.method2357(); local99 != null; local99 = Static440.aClass19_1.method2357()) {
			@Pc(105) int local105 = local99.method7004();
			if (local105 == 2 || local105 == 3) {
				@Pc(117) char local117 = local99.method7006();
				if (Static218.method3770() && (local117 == '`' || local117 == '§' || local117 == '²')) {
					if (Static316.method4828()) {
						Static631.method8809();
					} else {
						Static185.method3449();
					}
				} else if (Static434.anInt6889 < 128) {
					Static198.anInterface22Array34[Static434.anInt6889] = local99;
					Static434.anInt6889++;
				}
			} else if (local105 == 0 && Static664.anInt10591 < 75) {
				Static32.anInterface22Array1[Static664.anInt10591] = local99;
				Static664.anInt10591++;
			}
		}
		Static71.anInt1338 = 0;
		for (@Pc(185) Class3_Sub43 local185 = Static22.aClass16_2.method5891(); local185 != null; local185 = Static22.aClass16_2.method5891()) {
			@Pc(191) int local191 = local185.method7778();
			if (local191 == -1) {
				Static457.aClass338_185.method8171(local185);
			} else if (local191 == 6) {
				Static71.anInt1338 += local185.method7776();
			} else if (Static102.method1811(local191)) {
				Static655.aClass338_233.method8171(local185);
				if (Static655.aClass338_233.method8164() > 10) {
					Static655.aClass338_233.method8169();
				}
			}
		}
		if (Static316.method4828()) {
			Static567.method5367();
		}
		if (Static630.method8802(Static406.anInt6454)) {
			Static234.method3928();
			Static225.method3836();
		} else if (Static284.method4528(Static406.anInt6454)) {
			Static310.method4734();
		}
		if (Static501.method7146(Static406.anInt6454) && !Static284.method4528(Static406.anInt6454)) {
			this.method1511();
			Static3.method7850();
			Static504.method7168();
		} else if (Static661.method9136(Static406.anInt6454) && !Static284.method4528(Static406.anInt6454)) {
			this.method1511();
			Static504.method7168();
		} else if (Static406.anInt6454 == 12) {
			Static504.method7168();
		} else if (Static409.method5810(Static406.anInt6454) && !Static284.method4528(Static406.anInt6454)) {
			Static589.method8286();
		} else if (Static406.anInt6454 == 13) {
			Static504.method7168();
			if (Static498.anInt10141 != -3 && Static498.anInt10141 != 2 && Static498.anInt10141 != 15) {
				Static67.method1352(false);
			}
		}
		Static8.method156(Static674.aClass13_22);
		Static655.aClass338_233.method8169();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1491() {
		if (Static430.aBoolean489) {
			Static343.method5153();
		}
		Static601.method8442();
		if (Static674.aClass13_22 != null) {
			Static674.aClass13_22.method8459();
		}
		if (Static442.aFrame3 != null) {
			Static439.method6242(Static247.aClass291_1, Static442.aFrame3);
			Static442.aFrame3 = null;
		}
		if (Static559.aClass269_1 != null) {
			Static559.aClass269_1.method6697();
			Static559.aClass269_1 = null;
		}
		Static278.method3036();
		Static581.aClass341_4.method8299();
		Static197.aClass240_1.method5741();
		if (Static352.aClass42_1 != null) {
			Static352.aClass42_1.method1155();
			Static352.aClass42_1 = null;
		}
		try {
			Static340.aClass344_7.method8358();
			for (@Pc(59) int local59 = 0; local59 < 37; local59++) {
				Static538.aClass344Array1[local59].method8358();
			}
			Static311.aClass344_5.method8358();
			Static10.aClass344_1.method8358();
			Static399.method5645();
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1509() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1498() {
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 2) {
			this.method1517();
			return;
		}
		try {
			this.method1517();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static503.method7153(local19.getMessage() + " (Recovered) " + this.method1490(), local19);
			Static311.aBoolean377 = true;
			Static382.method5480(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1496() {
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 2) {
			this.method1522();
			return;
		}
		try {
			this.method1522();
		} catch (@Pc(14) ThreadDeath local14) {
			throw local14;
		} catch (@Pc(17) Throwable local17) {
			Static503.method7153(local17.getMessage() + " (Recovered) " + this.method1490(), local17);
			Static311.aBoolean377 = true;
			Static382.method5480(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1527(@OriginalArg(0) int arg0) {
		Static138.aClass289_1 = null;
		Static581.aClass341_4.anInt9491 = arg0;
		Static581.aClass341_4.anInt9492++;
		Static279.anInt4823 = 0;
		Static543.aClass81_10 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1499() {
		if (Static124.anApplet1 != null && Static126.aCanvas6 == null && !Static247.aClass291_1.aBoolean618) {
			try {
				@Pc(13) Class local13 = Static124.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static126.aCanvas6 = (Canvas) local17.get(Static124.anApplet1);
				local17.set(Static124.anApplet1, (Object) null);
				if (Static126.aCanvas6 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1499();
	}
}
