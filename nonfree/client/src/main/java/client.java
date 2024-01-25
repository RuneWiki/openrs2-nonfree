import jagex3.jagmisc.jagmisc;
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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "J")
	public static long lb;

	static {
		new Class182("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
		lb = -1L;
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static145.method2445("Argument count");
			}
			Static265.aClass21_3 = new Class21();
			Static265.aClass21_3.anInt407 = Integer.parseInt(arg0[0]);
			Static410.aClass21_5 = new Class21();
			Static410.aClass21_5.anInt407 = Integer.parseInt(arg0[1]);
			Static78.aClass21_1 = new Class21();
			Static78.aClass21_1.anInt407 = Integer.parseInt(arg0[2]);
			Static284.aClass151_8 = Static208.aClass151_6;
			if (arg0[3].equals("live")) {
				Static290.aClass178_11 = Static185.aClass178_14;
			} else if (arg0[3].equals("rc")) {
				Static290.aClass178_11 = Static116.aClass178_6;
			} else if (arg0[3].equals("wip")) {
				Static290.aClass178_11 = Static336.aClass178_15;
			} else {
				Static145.method2445("modewhat");
			}
			Static191.anInt3842 = Static394.method5234(arg0[4]);
			if (Static191.anInt3842 == -1) {
				if (arg0[4].equals("english")) {
					Static191.anInt3842 = 0;
				} else if (arg0[4].equals("german")) {
					Static191.anInt3842 = 1;
				} else {
					Static145.method2445("language");
				}
			}
			Static46.aBoolean50 = false;
			Static414.aBoolean454 = false;
			if (arg0[5].equals("game0")) {
				Static102.aClass147_3 = Static53.aClass147_2;
			} else if (arg0[5].equals("game1")) {
				Static102.aClass147_3 = Static424.aClass147_4;
			} else {
				Static145.method2445("game");
			}
			Static19.aBoolean27 = true;
			Static314.aBoolean360 = true;
			Static397.anInt6720 = Static102.aClass147_3.anInt4151;
			Static176.aBoolean235 = false;
			Static298.anInt5158 = 0;
			Static386.anInt6598 = 0;
			Static407.aString68 = "";
			@Pc(158) client local158 = new client();
			Static232.aClient5 = local158;
			local158.method970(Static290.aClass178_11.method4075() + 32, Static102.aClass147_3.aString34);
			Static451.aFrame2.setLocation(40, 40);
		} catch (@Pc(181) Exception local181) {
			Static432.method5720(null, local181);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method991() {
		if (Static358.anInt6086 == 13) {
			return;
		}
		@Pc(16) long local16 = Static405.method5347() / 1000000L - Static332.aLong195;
		Static332.aLong195 = Static405.method5347() / 1000000L;
		@Pc(29) boolean local29 = Static95.method1724();
		if (local29 && Static290.aBoolean344 && Static333.aClass130_2 != null) {
			Static333.aClass130_2.method3643();
		}
		if (Static296.method4125(Static358.anInt6086)) {
			if (Static93.aLong265 != 0L && Static93.aLong265 < Static220.method3314()) {
				Static215.method3290(Static361.aClass85_Sub1_1.anInt2500, Static211.method3254(), Static361.aClass85_Sub1_1.anInt2480, false);
			} else if (!Static412.aClass50_8.method5808() && Static444.aBoolean492) {
				Static432.method5721();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static95.aFrame1 == null) {
			@Pc(84) Container local84;
			if (Static451.aFrame2 == null) {
				local84 = Static171.aClass159_1.anApplet1;
			} else {
				local84 = Static451.aFrame2;
			}
			local92 = local84.getSize().width;
			local96 = local84.getSize().height;
			if (Static451.aFrame2 == local84) {
				@Pc(102) Insets local102 = Static451.aFrame2.getInsets();
				local96 -= local102.bottom + local102.top;
				local92 -= local102.right + local102.left;
			}
			if (Static370.anInt6388 != local92 || local96 != Static299.anInt4635) {
				if (Static412.aClass50_8 == null || Static412.aClass50_8.method5824()) {
					Static42.method650();
				} else {
					Static370.anInt6388 = local92;
					Static299.anInt4635 = local96;
				}
				Static93.aLong265 = Static220.method3314() + 500L;
			}
		}
		if (Static95.aFrame1 != null && !Static451.aBoolean497 && Static296.method4125(Static358.anInt6086)) {
			Static215.method3290(-1, Static361.aClass85_Sub1_1.anInt2483, -1, false);
		}
		@Pc(163) boolean local163 = false;
		if (Static108.aBoolean137) {
			Static108.aBoolean137 = false;
			local163 = true;
		}
		if (local163) {
			Static130.method2274();
		}
		if (Static412.aClass50_8 != null && Static412.aClass50_8.method5808() || Static211.method3254() != 1) {
			Static448.method5473();
		}
		if (Static358.anInt6086 == 0) {
			Static228.method3403(Static88.aString70, Static164.aColorArray5[Static397.anInt6720], Static344.aColorArray6[Static397.anInt6720], Static245.anInt4434, local163, Static92.aColorArray4[Static397.anInt6720]);
		} else if (Static358.anInt6086 == 1) {
			Static19.method277(Static164.aColorArray5[Static397.anInt6720].getRGB(), Static344.aColorArray6[Static397.anInt6720].getRGB(), Static92.aColorArray4[Static397.anInt6720].getRGB(), Static412.aClass50_8.method5808() | local163, Static412.aClass50_8, Static330.aClass57_3);
		} else if (Static150.method2587(Static358.anInt6086)) {
			Static362.method4863();
		} else if (Static139.method2394(Static358.anInt6086)) {
			Static362.method4863();
		} else if (Static55.method942(Static358.anInt6086)) {
			if (Static66.anInt1197 == 1) {
				if (Static135.anInt6870 > Static102.anInt2079) {
					Static102.anInt2079 = Static135.anInt6870;
				}
				local92 = (Static102.anInt2079 - Static135.anInt6870) * 50 / Static102.anInt2079;
				Static77.method1475(true, Static114.aClass57_4, Static5.aClass182_1.method4155(Static191.anInt3842) + "<br>(" + local92 + "%)");
			} else if (Static66.anInt1197 == 2) {
				if (Static378.anInt6503 > Static389.anInt6604) {
					Static389.anInt6604 = Static378.anInt6503;
				}
				local92 = (Static389.anInt6604 - Static378.anInt6503) * 50 / Static389.anInt6604 + 50;
				Static77.method1475(true, Static114.aClass57_4, Static5.aClass182_1.method4155(Static191.anInt3842) + "<br>(" + local92 + "%)");
			} else {
				Static77.method1475(true, Static114.aClass57_4, Static5.aClass182_1.method4155(Static191.anInt3842));
			}
		} else if (Static358.anInt6086 == 9) {
			Static403.method5323(local16);
		} else if (Static358.anInt6086 == 12) {
			Static77.method1475(true, Static114.aClass57_4, Static422.aClass182_241.method4155(Static191.anInt3842) + "<br>" + Static179.aClass182_125.method4155(Static191.anInt3842));
		}
		if (Static334.anInt5662 == 3) {
			for (local92 = 0; local92 < Static167.anInt3304; local92++) {
				@Pc(407) Rectangle local407 = Class10_Sub1_Sub7.aRectangleArray4[local92];
				if (Static301.aBooleanArray15[local92]) {
					Static412.aClass50_8.method5853(local407.y, local407.x, -1996553985, local407.height, local407.width);
				} else if (Static373.aBooleanArray19[local92]) {
					Static412.aClass50_8.method5853(local407.y, local407.x, -1996554240, local407.height, local407.width);
				}
			}
		}
		if (Static235.method3459()) {
			Static279.method3940(Static412.aClass50_8);
		}
		if (Static296.method4125(Static358.anInt6086) && Static334.anInt5662 == 0 && Static211.method3254() == 1 && !local163 && Static240.aString45.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static167.anInt3304; local96++) {
				if (Static373.aBooleanArray19[local96]) {
					Static373.aBooleanArray19[local96] = false;
					Static104.aRectangleArray1[local92++] = Class10_Sub1_Sub7.aRectangleArray4[local96];
				}
			}
			Static412.aClass50_8.method5865(Static104.aRectangleArray1, local92);
		} else if (Static358.anInt6086 != 0) {
			Static412.aClass50_8.method5821();
			for (local92 = 0; local92 < Static167.anInt3304; local92++) {
				Static373.aBooleanArray19[local92] = false;
			}
		}
		if (Static361.aClass85_Sub1_1.anInt2494 == 0) {
			Static328.method5696(15L);
		} else if (Static361.aClass85_Sub1_1.anInt2494 == 1) {
			Static328.method5696(10L);
		} else if (Static361.aClass85_Sub1_1.anInt2494 == 2) {
			Static328.method5696(5L);
		} else if (Static361.aClass85_Sub1_1.anInt2494 == 3) {
			Static328.method5696(2L);
		}
		if (Static232.aBoolean319) {
			Static263.method5394();
		}
		if (Static361.aClass85_Sub1_1.aBoolean181 && Static358.anInt6086 == 2 && Static189.anInt3826 != -1) {
			Static361.aClass85_Sub1_1.aBoolean181 = false;
			Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method992() {
		@Pc(40) int local40;
		if (Static358.anInt6086 == 6 && Static197.anInt3945 == 0) {
			if (Static146.anInt3027 > 0) {
				Static146.anInt3027--;
			}
			if (Static326.anInt5600 > 1) {
				Static80.anInt1678 = Static193.anInt3856;
				Static326.anInt5600--;
			}
			if (!Static35.aBoolean37) {
				Static35.method482();
			}
			for (local40 = 0; local40 < 100 && Static231.method3444(); local40++) {
			}
		}
		Static68.anInt1469++;
		Static48.method839(-1, -1, null);
		Static58.method1018(-1, null, -1);
		Static404.method5324();
		Static193.anInt3856++;
		for (local40 = 0; local40 < Static134.anInt2764; local40++) {
			@Pc(82) Class24_Sub3_Sub2_Sub1 local82 = Static149.aClass10_Sub26Array1[local40].aClass24_Sub3_Sub2_Sub1_2;
			if (local82 != null) {
				@Pc(88) byte local88 = local82.aClass222_1.aByte82;
				if ((local88 & 0x1) != 0) {
					@Pc(96) int local96 = local82.method4919();
					@Pc(120) int local120;
					if ((local88 & 0x2) != 0 && local82.anInt6288 == 0 && Math.random() * 1000.0D < 10.0D) {
						local120 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(128) int local128 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local120 != 0 || local128 != 0) {
							@Pc(139) int local139 = local82.anIntArray610[0] + local120;
							if (local139 < 0) {
								local139 = 0;
							} else if (Static2.anInt7 - local96 - 1 < local139) {
								local139 = Static2.anInt7 - local96 - 1;
							}
							@Pc(170) int local170 = local82.anIntArray611[0] + local128;
							if (local170 < 0) {
								local170 = 0;
							} else if (local170 > Static17.anInt315 - local96 - 1) {
								local170 = Static17.anInt315 - local96 - 1;
							}
							@Pc(219) int local219 = Static78.method1496(local82.anIntArray611[0], 0, Static11.aClass220Array1[local82.aByte98], -1, local96, local82.anIntArray610[0], local96, true, local139, local170, 0, Static319.anIntArray534, local96, Static268.anIntArray480);
							if (local219 > 0) {
								if (local219 > 9) {
									local219 = 9;
								}
								for (@Pc(230) int local230 = 0; local230 < local219; local230++) {
									local82.anIntArray610[local230] = Static268.anIntArray480[local219 - local230 - 1];
									local82.anIntArray611[local230] = Static319.anIntArray534[local219 - local230 - 1];
									local82.aByteArray80[local230] = 1;
								}
								local82.anInt6288 = local219;
							}
						}
					}
					Static128.method5643(local82, true);
					local120 = Static54.method938(local82);
					Static45.method5778(Static130.anInt2653, Static5.anInt78, local82, local120);
					Static242.method4562(local82);
				}
			}
		}
		if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
			if (Static157.anInt3176 == 2) {
				Static164.method3360();
			} else {
				Static59.method1021();
			}
			if (Static80.anInt1679 >> 7 < 14 || Static2.anInt7 - 14 <= Static80.anInt1679 >> 7 || Static50.anInt906 >> 7 < 14 || Static50.anInt906 >> 7 >= Static17.anInt315 - 14) {
				Static363.method4869();
			}
		}
		while (true) {
			@Pc(353) Class10_Sub40 local353;
			@Pc(358) Class89 local358;
			@Pc(369) Class89 local369;
			do {
				local353 = (Class10_Sub40) Static292.aClass163_34.method3622();
				if (local353 == null) {
					while (true) {
						do {
							local353 = (Class10_Sub40) Static353.aClass163_39.method3622();
							if (local353 == null) {
								while (true) {
									do {
										local353 = (Class10_Sub40) Static72.aClass163_15.method3622();
										if (local353 == null) {
											if (Static458.aClass89_14 != null) {
												Static98.method1774();
											}
											if (Static400.anInt6752 % 1500 == 0) {
												Static127.method2215();
											}
											if (Static358.anInt6086 == 6 && Static197.anInt3945 == 0) {
												Static133.method2300();
											}
											Static217.method3302();
											if (Static5.aBoolean4 && Static220.method3314() - 60000L > Static155.aLong101) {
												Static353.method4776();
											}
											for (@Pc(534) Class40_Sub2_Sub2 local534 = (Class40_Sub2_Sub2) Static392.aClass240_6.method5227(); local534 != null; local534 = (Class40_Sub2_Sub2) Static392.aClass240_6.method5230()) {
												if ((long) local534.anInt4209 < Static220.method3314() / 1000L - 5L) {
													if (local534.aShort68 > 0) {
														Static104.method1823("", 0, local534.aString36 + Static13.aClass182_183.method4155(Static191.anInt3842), "", 5);
													}
													if (local534.aShort68 == 0) {
														Static104.method1823("", 0, local534.aString36 + Static49.aClass182_39.method4155(Static191.anInt3842), "", 5);
													}
													local534.method4364();
												}
											}
											if (Static358.anInt6086 == 6 && Static197.anInt3945 == 0) {
												if (Static160.aClass253_3 == null) {
													Static172.method2923(false);
													return;
												}
												Static370.anInt6389++;
												if (Static370.anInt6389 > 50) {
													Static310.method4308(Static225.aClass27_110);
												}
												try {
													if (Static160.aClass253_3 != null && Static337.aClass10_Sub8_Sub2_2.anInt2989 > 0) {
														Static302.anInt5229 += Static337.aClass10_Sub8_Sub2_2.anInt2989;
														Static160.aClass253_3.method5494(Static337.aClass10_Sub8_Sub2_2.anInt2989, Static337.aClass10_Sub8_Sub2_2.aByteArray44);
														Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
														Static370.anInt6389 = 0;
														return;
													}
												} catch (@Pc(658) IOException local658) {
													Static172.method2923(false);
													return;
												}
											}
											return;
										}
										local358 = local353.aClass89_12;
										if (local358.anInt2720 < 0) {
											break;
										}
										local369 = Static40.method557(local358.anInt2694);
									} while (local369 == null || local369.aClass89Array1 == null || local369.aClass89Array1.length <= local358.anInt2720 || local358 != local369.aClass89Array1[local358.anInt2720]);
									Static79.method1501(local353);
								}
							}
							local358 = local353.aClass89_12;
							if (local358.anInt2720 < 0) {
								break;
							}
							local369 = Static40.method557(local358.anInt2694);
						} while (local369 == null || local369.aClass89Array1 == null || local358.anInt2720 >= local369.aClass89Array1.length || local369.aClass89Array1[local358.anInt2720] != local358);
						Static79.method1501(local353);
					}
				}
				local358 = local353.aClass89_12;
				if (local358.anInt2720 < 0) {
					break;
				}
				local369 = Static40.method557(local358.anInt2694);
			} while (local369 == null || local369.aClass89Array1 == null || local358.anInt2720 >= local369.aClass89Array1.length || local358 != local369.aClass89Array1[local358.anInt2720]);
			Static79.method1501(local353);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method996(@OriginalArg(0) int arg0) {
		Static12.aClass103_1.anInt3120 = arg0;
		Static421.anInt7078 = 0;
		Static357.aClass253_4 = null;
		Static12.aClass103_1.anInt3119++;
		Static62.aClass270_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method997(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class10_Sub8 local15 = new Class10_Sub8(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method2502();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(32) int[] local32 = Static395.anIntArray651 = new int[6];
					local32[0] = local15.method2485();
					local32[1] = local15.method2485();
					local32[2] = local15.method2485();
					local32[3] = local15.method2485();
					local32[4] = local15.method2485();
					local32[5] = local15.method2485();
				} else {
					@Pc(84) int local84;
					@Pc(89) int local89;
					if (local19 == 4) {
						local84 = local15.method2502();
						Static153.anIntArray298 = new int[local84];
						for (local89 = 0; local89 < local84; local89++) {
							Static153.anIntArray298[local89] = local15.method2485();
							if (Static153.anIntArray298[local89] == 65535) {
								Static153.anIntArray298[local89] = -1;
							}
						}
					} else if (local19 == 5) {
						local84 = local15.method2502();
						Static370.anIntArray617 = new int[local84];
						for (local89 = 0; local89 < local84; local89++) {
							Static370.anIntArray617[local89] = local15.method2485();
							if (Static370.anIntArray617[local89] == 65535) {
								Static370.anIntArray617[local89] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method977() {
		if (Static5.aBoolean4) {
			Static353.method4776();
		}
		if (Static412.aClass50_8 != null) {
			Static412.aClass50_8.method5815();
		}
		if (Static95.aFrame1 != null) {
			Static429.method5679(Static171.aClass159_1, Static95.aFrame1);
			Static95.aFrame1 = null;
		}
		if (Static160.aClass253_3 != null) {
			Static160.aClass253_3.method5484();
			Static160.aClass253_3 = null;
		}
		if (Static270.aClass132_1 != null) {
			Static270.aClass132_1.method3236(Static412.aCanvas7);
		}
		Static270.aClass132_1 = null;
		Static116.method2046();
		Static12.aClass103_1.method2602();
		Static369.aClass209_3.method4768();
		if (Static179.aClass31_1 != null) {
			Static179.aClass31_1.method654();
			Static179.aClass31_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method979() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method978() {
		try {
			this.method1001();
		} catch (@Pc(8) OutOfMemoryError local8) {
			if (local8.getMessage() == null || !local8.getMessage().startsWith("native")) {
				throw local8;
			}
			Static178.method2951(0);
			Static432.method5720(local8.getMessage() + " (Recovered) " + this.method980(), local8);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method986() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static42.method650();
		Static369.aClass209_3 = new Class209(Static171.aClass159_1);
		Static12.aClass103_1 = new Class103();
		if (Static284.aClass151_8 != Static110.aClass151_5) {
			Static294.aByteArrayArray50 = new byte[50][];
		}
		Static361.aClass85_Sub1_1 = new Class85_Sub1(Static171.aClass159_1);
		if (Static110.aClass151_5 == Static284.aClass151_8) {
			Static265.aClass21_3.aString5 = this.getCodeBase().getHost();
		} else if (Static376.method5004(Static284.aClass151_8)) {
			Static265.aClass21_3.aString5 = this.getCodeBase().getHost();
			Static265.aClass21_3.anInt411 = Static265.aClass21_3.anInt407 + 40000;
			Static410.aClass21_5.anInt411 = Static410.aClass21_5.anInt407 + 40000;
			Static78.aClass21_1.anInt411 = Static78.aClass21_1.anInt407 + 40000;
			Static265.aClass21_3.anInt404 = Static265.aClass21_3.anInt407 + 50000;
			Static410.aClass21_5.anInt404 = Static410.aClass21_5.anInt407 + 50000;
			Static78.aClass21_1.anInt404 = Static78.aClass21_1.anInt407 + 50000;
		} else if (Static208.aClass151_6 == Static284.aClass151_8) {
			Static265.aClass21_3.aString5 = "127.0.0.1";
			Static410.aClass21_5.aString5 = "127.0.0.1";
			Static78.aClass21_1.aString5 = "127.0.0.1";
			Static265.aClass21_3.anInt411 = Static265.aClass21_3.anInt407 + 40000;
			Static410.aClass21_5.anInt411 = Static410.aClass21_5.anInt407 + 40000;
			Static78.aClass21_1.anInt411 = Static78.aClass21_1.anInt407 + 40000;
			Static265.aClass21_3.anInt404 = Static265.aClass21_3.anInt407 + 50000;
			Static410.aClass21_5.anInt404 = Static410.aClass21_5.anInt407 + 50000;
			Static78.aClass21_1.anInt404 = Static78.aClass21_1.anInt407 + 50000;
		}
		Static451.aShortArray116 = Static247.aShortArray64 = Static460.aShortArray117 = Static192.aShortArray56 = new short[256];
		if (Static102.aClass147_3 == Static53.aClass147_2) {
			Static74.aBoolean106 = false;
		}
		if (Static424.aClass147_4 == Static102.aClass147_3) {
			Static386.aShortArrayArray8 = Static76.aShortArrayArray3;
			Static283.aShortArrayArray5 = Static430.aShortArrayArray9;
			Static18.anInt319 = 16777215;
			Static231.aShortArray59 = Static267.aShortArray73;
			Static456.anInt7587 = 0;
			Static158.aShortArray48 = Static440.aShortArray114;
			Static106.aBoolean134 = true;
		} else {
			Static158.aShortArray48 = Static195.aShortArray57;
			Static283.aShortArrayArray5 = Static349.aShortArrayArray6;
			Static231.aShortArray59 = Static96.aShortArray16;
			Static386.aShortArrayArray8 = Static375.aShortArrayArray7;
		}
		Static87.aClass21_2 = Static265.aClass21_3;
		Static197.aClass245_1 = Static364.method4883(Static412.aCanvas7);
		Static113.aClass13_1 = Static106.method1865(Static412.aCanvas7);
		Static270.aClass132_1 = Static289.method4074();
		if (Static270.aClass132_1 != null) {
			Static270.aClass132_1.method3237(Static412.aCanvas7);
		}
		Static428.anInt7201 = Static240.anInt4376;
		try {
			if (Static171.aClass159_1.aClass108_2 != null) {
				Static53.aClass227_2 = new Class227(Static171.aClass159_1.aClass108_2, 5200, 0);
				for (@Pc(224) int local224 = 0; local224 < 30; local224++) {
					Static422.aClass227Array1[local224] = new Class227(Static171.aClass159_1.aClass108Array1[local224], 6000, 0);
				}
				Static64.aClass227_3 = new Class227(Static171.aClass159_1.aClass108_1, 6000, 0);
				Static371.aClass84_4 = new Class84(255, Static53.aClass227_2, Static64.aClass227_3, 500000);
				Static48.aClass227_1 = new Class227(Static171.aClass159_1.aClass108_3, 24, 0);
				Static171.aClass159_1.aClass108_2 = null;
				Static171.aClass159_1.aClass108_1 = null;
				Static171.aClass159_1.aClass108Array1 = null;
				Static171.aClass159_1.aClass108_3 = null;
			}
		} catch (@Pc(282) IOException local282) {
			Static64.aClass227_3 = null;
			Static53.aClass227_2 = null;
			Static371.aClass84_4 = null;
			Static48.aClass227_1 = null;
		}
		if (Static110.aClass151_5 != Static284.aClass151_8) {
			Static419.aBoolean462 = true;
		}
		if (Static53.aClass147_2 == Static102.aClass147_3) {
			Static346.aString53 = Static185.aClass182_197.method4155(Static191.anInt3842);
		} else if (Static102.aClass147_3 == Static424.aClass147_4) {
			Static346.aString53 = Static406.aClass182_233.method4155(Static191.anInt3842);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method972()) {
			return;
		}
		Static265.aClass21_3 = new Class21();
		Static265.aClass21_3.anInt407 = Integer.parseInt(this.getParameter("worldid"));
		Static410.aClass21_5 = new Class21();
		Static410.aClass21_5.anInt407 = Integer.parseInt(this.getParameter("lobbyid"));
		Static410.aClass21_5.aString5 = this.getParameter("lobbyaddress");
		Static78.aClass21_1 = new Class21();
		Static78.aClass21_1.anInt407 = Integer.parseInt(this.getParameter("demoid"));
		Static78.aClass21_1.aString5 = this.getParameter("demoaddress");
		Static284.aClass151_8 = Static280.method3969(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static376.method5004(Static284.aClass151_8) && Static110.aClass151_5 != Static284.aClass151_8) {
			Static284.aClass151_8 = Static110.aClass151_5;
		}
		Static290.aClass178_11 = Static308.method4265(Integer.parseInt(this.getParameter("modewhat")));
		if (Static290.aClass178_11 != Static336.aClass178_15 && Static116.aClass178_6 != Static290.aClass178_11 && Static185.aClass178_14 != Static290.aClass178_11) {
			Static290.aClass178_11 = Static185.aClass178_14;
		}
		try {
			Static191.anInt3842 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static191.anInt3842 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static46.aBoolean50 = true;
		} else {
			Static46.aBoolean50 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static414.aBoolean454 = true;
		} else {
			Static414.aBoolean454 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static306.aBoolean355 = true;
		} else {
			Static306.aBoolean355 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static102.aClass147_3 = Static53.aClass147_2;
			} else if (local145.equals("1")) {
				Static102.aClass147_3 = Static424.aClass147_4;
			}
		}
		try {
			Static298.anInt5158 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static298.anInt5158 = 0;
		}
		Static217.aString33 = this.getParameter("quiturl");
		Static407.aString68 = this.getParameter("settings");
		if (Static407.aString68 == null) {
			Static407.aString68 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static386.anInt6598 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static386.anInt6598 = 0;
			}
		}
		Static397.anInt6720 = Integer.parseInt(this.getParameter("colourid"));
		if (Static397.anInt6720 < 0 || Static397.anInt6720 >= Static344.aColorArray6.length) {
			Static397.anInt6720 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static19.aBoolean27 = true;
			Static314.aBoolean360 = true;
		}
		@Pc(232) String local232 = this.getParameter("frombilling");
		if (local232 != null && local232.equals("true")) {
			Static176.aBoolean235 = true;
		}
		if (Static102.aClass147_3 == Static53.aClass147_2) {
			Static29.anInt504 = 765;
			Static348.anInt5939 = 503;
		} else if (Static102.aClass147_3 == Static424.aClass147_4) {
			Static29.anInt504 = 640;
			Static348.anInt5939 = 480;
		}
		Static232.aClient5 = this;
		this.method974(Static290.aClass178_11.method4075() + 32, Static29.anInt504, Static348.anInt5939);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1001() {
		if (Static358.anInt6086 == 13) {
			return;
		}
		Static400.anInt6752++;
		if (Static400.anInt6752 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static269.anInt4744 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static377.aRandom2.setSeed((long) Static269.anInt4744);
		}
		if (Static400.anInt6752 % 50 == 0) {
			Static19.anInt343 = Static302.anInt5229;
			Static302.anInt5229 = 0;
			Static337.anInt5683 = Static120.anInt2449;
			Static120.anInt2449 = 0;
		}
		this.method1006();
		if (Static322.aClass138_1 != null) {
			Static322.aClass138_1.method3225();
		}
		Static325.method4454();
		Static197.aClass245_1.method5904();
		Static113.aClass13_1.method4118();
		if (Static270.aClass132_1 != null) {
			@Pc(86) int local86 = Static270.aClass132_1.method3239();
			Static93.anInt7570 = local86;
		}
		if (Static412.aClass50_8 != null) {
			Static412.aClass50_8.method5818((int) Static220.method3314());
		}
		Static346.method4694();
		Static35.anInt574 = 0;
		for (@Pc(112) Class3 local112 = Static197.aClass245_1.method5906(); local112 != null && Static35.anInt574 < 128; local112 = Static197.aClass245_1.method5906()) {
			if (local112.method3433() != 1) {
				@Pc(125) char local125 = local112.method3429();
				if (!Static128.method5644() || local125 != '`' && local125 != '§') {
					Static121.aClass3Array1[Static35.anInt574] = local112;
					Static35.anInt574++;
				} else if (Static235.method3459()) {
					Static399.method5282();
				} else {
					Static374.method4988();
				}
			}
		}
		for (@Pc(166) Class10_Sub16 local166 = Static113.aClass13_1.method4121(); local166 != null; local166 = Static113.aClass13_1.method4121()) {
			@Pc(172) int local172 = local166.method1924();
			if (local172 == -1) {
				Static126.aClass163_24.method3613(local166);
			} else if (Static20.method284(local172)) {
				Static173.aClass163_29.method3613(local166);
			}
			if (Static173.aClass163_29.method3614() > 10) {
				Static173.aClass163_29.method3622();
			}
		}
		if (Static235.method3459()) {
			Static416.method5470();
		}
		if (Static358.anInt6086 == 0) {
			this.method1008();
			Static349.method4739();
		} else if (Static358.anInt6086 == 1) {
			this.method1008();
			Static349.method4739();
		} else if (Static55.method942(Static358.anInt6086)) {
			Static328.method5698();
		}
		if (Static314.method4326(Static358.anInt6086) && !Static55.method942(Static358.anInt6086)) {
			this.method992();
			Static399.method5284();
			Static434.method5744();
		} else if (Static207.method3218(Static358.anInt6086) && !Static55.method942(Static358.anInt6086)) {
			this.method992();
			Static434.method5744();
		} else if (Static358.anInt6086 == 11) {
			Static434.method5744();
		} else if (Static7.method78(Static358.anInt6086) && !Static55.method942(Static358.anInt6086)) {
			Static209.method3245();
		} else if (Static358.anInt6086 == 12) {
			Static434.method5744();
			if (Static217.anInt4145 != -3 && Static217.anInt4145 != 2 && Static217.anInt4145 != 15) {
				Static172.method2923(false);
			}
		}
		Static428.method5677(Static412.aClass50_8);
		Static173.aClass163_29.method3622();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1003() {
		if (Static12.aClass103_1.anInt3119 > Static245.anInt4433) {
			Static87.aClass21_2.aBoolean34 = !Static87.aClass21_2.aBoolean34;
			Static245.anInt4432 = (Static12.aClass103_1.anInt3119 * 50 - 50) * 5;
			if (Static245.anInt4432 > 3000) {
				Static245.anInt4432 = 3000;
			}
			if (Static12.aClass103_1.anInt3119 >= 2 && Static12.aClass103_1.anInt3120 == 6) {
				this.method971("js5connect_outofdate");
				Static358.anInt6086 = 13;
				return;
			}
			if (Static12.aClass103_1.anInt3119 >= 4 && Static12.aClass103_1.anInt3120 == -1) {
				this.method971("js5crc");
				Static358.anInt6086 = 13;
				return;
			}
			if (Static12.aClass103_1.anInt3119 >= 4 && Static405.method5348(Static358.anInt6086)) {
				if (Static12.aClass103_1.anInt3120 == 7 || Static12.aClass103_1.anInt3120 == 9) {
					this.method971("js5connect_full");
				} else if (Static12.aClass103_1.anInt3120 > 0) {
					this.method971("js5connect");
				} else {
					this.method971("js5io");
				}
				Static358.anInt6086 = 13;
				return;
			}
		}
		Static245.anInt4433 = Static12.aClass103_1.anInt3119;
		if (Static245.anInt4432 > 0) {
			Static245.anInt4432--;
			return;
		}
		try {
			if (Static421.anInt7078 == 0) {
				Static62.aClass270_2 = Static171.aClass159_1.method3518(Static87.aClass21_2.method330(), Static87.aClass21_2.aString5);
				Static421.anInt7078++;
			}
			if (Static421.anInt7078 == 1) {
				if (Static62.aClass270_2.anInt7548 == 2) {
					this.method996(1000);
					return;
				}
				if (Static62.aClass270_2.anInt7548 == 1) {
					Static421.anInt7078++;
				}
			}
			if (Static421.anInt7078 == 2) {
				Static357.aClass253_4 = new Class253((Socket) Static62.aClass270_2.anObject9, Static171.aClass159_1);
				@Pc(187) Class10_Sub8 local187 = new Class10_Sub8(5);
				local187.method2458(Static53.aClass216_2.anInt6089);
				local187.method2506(597);
				Static357.aClass253_4.method5494(5, local187.aByteArray44);
				Static421.anInt7078++;
				Static405.aLong234 = Static220.method3314();
			}
			if (Static421.anInt7078 == 3) {
				if (Static405.method5348(Static358.anInt6086) || Static357.aClass253_4.method5486() > 0) {
					@Pc(230) int local230 = Static357.aClass253_4.method5493();
					if (local230 != 0) {
						this.method996(local230);
						return;
					}
					Static421.anInt7078++;
				} else if (Static220.method3314() - Static405.aLong234 > 30000L) {
					this.method996(1001);
					return;
				}
			}
			if (Static421.anInt7078 == 4) {
				@Pc(276) boolean local276 = Static358.anInt6086 == 1 || Static314.method4326(Static358.anInt6086) || Static207.method3218(Static358.anInt6086);
				Static12.aClass103_1.method2597(!local276, Static357.aClass253_4);
				Static421.anInt7078 = 0;
				Static357.aClass253_4 = null;
				Static62.aClass270_2 = null;
			}
		} catch (@Pc(293) IOException local293) {
			this.method996(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	@Override
	protected String method980() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static168.anInt3353 + "," + Static72.anInt1488 + "," + Static2.anInt7 + "," + Static17.anInt315 + "|";
			if (Static263.aClass24_Sub3_Sub2_Sub2_4 != null) {
				local5 = local5 + "2)" + Static96.anInt1983 + "," + (Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0] + Static168.anInt3353) + "," + (Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0] + Static72.anInt1488) + "|";
			}
			local5 = local5 + "3)" + Static423.anInt7114 + "|4)" + Static361.aClass85_Sub1_1.anInt2486 + "|5)" + Static211.method3254() + "|6)" + Static90.anInt1891 + "," + Static340.anInt5756 + "|";
			local5 = local5 + "7)" + Static361.aClass85_Sub1_1.method2105(Static423.anInt7114) + "|";
			local5 = local5 + "8)" + Static361.aClass85_Sub1_1.method2106(Static423.anInt7114) + "|";
			local5 = local5 + "9)" + Static361.aClass85_Sub1_1.aBoolean170 + "|";
			local5 = local5 + "10)" + Static361.aClass85_Sub1_1.aBoolean167 + "|";
			local5 = local5 + "11)" + Static361.aClass85_Sub1_1.aBoolean166 + "|";
			local5 = local5 + "12)" + Static361.aClass85_Sub1_1.method2113(Static423.anInt7114) + "|";
			local5 = local5 + "13)" + Static108.anInt2167 + "|";
			local5 = local5 + "14)" + Static358.anInt6086;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(227) Throwable local227) {
			}
			local5 = local5 + "]";
		} catch (@Pc(238) Throwable local238) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1006() {
		@Pc(13) boolean local13 = Static12.aClass103_1.method2590();
		if (!local13) {
			this.method1003();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1008() {
		@Pc(6) int local6;
		if (!Static361.aClass85_Sub1_1.aBoolean181) {
			for (local6 = 0; local6 < Static35.anInt574; local6++) {
				if (Static121.aClass3Array1[local6].method3429() == 's' || Static121.aClass3Array1[local6].method3429() == 'S') {
					Static361.aClass85_Sub1_1.aBoolean181 = true;
					break;
				}
			}
		}
		@Pc(53) int local53;
		if (Static187.anInt3755 == 0) {
			@Pc(43) Runtime local43 = Runtime.getRuntime();
			local53 = (int) ((local43.totalMemory() - local43.freeMemory()) / 1024L);
			@Pc(56) long local56 = Static220.method3314();
			if (Static276.aLong96 == 0L) {
				Static276.aLong96 = local56;
			}
			if (local53 > 16384 && local56 - Static276.aLong96 < 5000L) {
				if (local56 - Static273.aLong157 > 1000L) {
					System.gc();
					Static273.aLong157 = local56;
				}
				Static88.aString70 = Static130.aClass182_104.method4155(Static191.anInt3842);
				Static245.anInt4434 = 5;
			} else {
				Static88.aString70 = Static314.aClass182_193.method4155(Static191.anInt3842);
				Static187.anInt3755 = 10;
				Static245.anInt4434 = 5;
			}
		} else if (Static187.anInt3755 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static11.aClass220Array1[local6] = Static153.method2609(Static17.anInt315, Static2.anInt7);
			}
			Static88.aString70 = Static126.aClass182_99.method4155(Static191.anInt3842);
			Static245.anInt4434 = 10;
			Static187.anInt3755 = 20;
		} else if (Static187.anInt3755 == 20) {
			if (Static322.aClass138_1 == null) {
				Static322.aClass138_1 = new Class138(Static12.aClass103_1, Static369.aClass209_3);
			}
			if (Static322.aClass138_1.method3223()) {
				Static341.aClass187_103 = Static399.method5285(false, 0, true);
				Static166.aClass187_66 = Static399.method5285(false, 1, true);
				Static255.aClass187_81 = Static399.method5285(false, 2, true);
				Static347.aClass187_106 = Static399.method5285(false, 3, true);
				Static343.aClass187_105 = Static399.method5285(false, 4, true);
				Static77.aClass187_32 = Static399.method5285(true, 5, true);
				Static43.aClass187_11 = Static399.method5285(true, 6, false);
				Static3.aClass187_76 = Static399.method5285(false, 7, true);
				Static21.aClass187_8 = Static399.method5285(false, 8, true);
				Static16.aClass187_6 = Static399.method5285(false, 9, true);
				Static322.aClass187_95 = Static399.method5285(false, 10, true);
				Static265.aClass187_83 = Static399.method5285(false, 11, true);
				Static157.aClass187_63 = Static399.method5285(false, 12, true);
				Static326.aClass187_99 = Static399.method5285(false, 13, true);
				Static203.aClass187_72 = Static399.method5285(false, 14, false);
				Static131.aClass187_53 = Static399.method5285(false, 15, true);
				Static87.aClass187_36 = Static399.method5285(false, 16, true);
				Static85.aClass187_137 = Static399.method5285(false, 17, true);
				Static436.aClass187_126 = Static399.method5285(false, 18, true);
				Static297.aClass187_90 = Static399.method5285(false, 19, true);
				Static63.aClass187_21 = Static399.method5285(false, 20, true);
				Static339.aClass187_102 = Static399.method5285(false, 21, true);
				Static74.aClass187_30 = Static399.method5285(false, 22, true);
				Static251.aClass187_110 = Static399.method5285(true, 23, true);
				Static265.aClass187_82 = Static399.method5285(false, 24, true);
				Static393.aClass187_116 = Static399.method5285(false, 25, true);
				Static105.aClass187_43 = Static399.method5285(true, 26, true);
				Static39.aClass187_10 = Static399.method5285(false, 27, true);
				Static144.aClass187_59 = Static399.method5285(true, 28, true);
				Static127.aClass187_50 = Static399.method5285(false, 29, true);
				Static88.aString70 = Static157.aClass182_113.method4155(Static191.anInt3842);
				Static187.anInt3755 = 30;
				Static245.anInt4434 = 15;
			} else {
				Static88.aString70 = Static439.aClass182_251.method4155(Static191.anInt3842);
				Static245.anInt4434 = 12;
			}
		} else if (Static187.anInt3755 == 30) {
			local6 = 0;
			for (local53 = 0; local53 < 30; local53++) {
				local6 += Static218.aClass131_Sub1Array2[local53].method3137() * Static161.anIntArray309[local53] / 100;
			}
			if (local6 == 100) {
				Static88.aString70 = Static162.aClass182_115.method4155(Static191.anInt3842);
				Static245.anInt4434 = 20;
				Static51.method859(Static21.aClass187_8);
				Static70.method1361(Static21.aClass187_8);
				Static187.anInt3755 = 40;
			} else {
				if (local6 != 0) {
					Static88.aString70 = Static278.aClass182_213.method4155(Static191.anInt3842) + local6 + "%";
				}
				Static245.anInt4434 = 20;
			}
		} else if (Static187.anInt3755 == 40) {
			if (Static144.aClass187_59.method4293()) {
				this.method997(Static144.aClass187_59.method4303(1));
				Static88.aString70 = Static316.aClass182_195.method4155(Static191.anInt3842);
				Static187.anInt3755 = 50;
				Static245.anInt4434 = 25;
			} else {
				Static88.aString70 = Static257.aClass182_154.method4155(Static191.anInt3842) + Static144.aClass187_59.method4286() + "%";
				Static245.anInt4434 = 25;
			}
		} else if (Static187.anInt3755 == 50) {
			Static245.method3579();
			Static88.aString70 = Static379.aClass182_44.method4155(Static191.anInt3842);
			Static245.anInt4434 = 30;
			Static187.anInt3755 = 60;
		} else if (Static187.anInt3755 == 60) {
			local6 = Static429.method5678(Static21.aClass187_8, Static326.aClass187_99);
			local53 = Static290.method4082();
			if (local6 < local53) {
				Static88.aString70 = Static406.aClass182_234.method4155(Static191.anInt3842) + local6 * 100 / local53 + "%";
				Static245.anInt4434 = 35;
			} else {
				Static88.aString70 = Static277.aClass182_161.method4155(Static191.anInt3842);
				Static187.anInt3755 = 70;
				Static245.anInt4434 = 35;
			}
		} else if (Static187.anInt3755 == 70) {
			local6 = Static160.method2699(Static21.aClass187_8);
			local53 = Static88.method5406();
			if (local6 < local53) {
				Static88.aString70 = Static85.aClass182_263.method4155(Static191.anInt3842) + local6 * 100 / local53 + "%";
				Static245.anInt4434 = 40;
			} else {
				Static88.aString70 = Static8.aClass182_5.method4155(Static191.anInt3842);
				Static245.anInt4434 = 40;
				Static187.anInt3755 = 80;
			}
		} else if (Static187.anInt3755 == 80) {
			if (Static105.aClass187_43.method4293()) {
				Static413.anInterface7_7 = new Class199(Static105.aClass187_43, Static16.aClass187_6, Static21.aClass187_8);
				Static88.aString70 = Static69.aClass182_58.method4155(Static191.anInt3842);
				Static245.anInt4434 = 45;
				Static187.anInt3755 = 90;
			} else {
				Static88.aString70 = Static60.aClass182_245.method4155(Static191.anInt3842) + Static105.aClass187_43.method4286() + "%";
				Static245.anInt4434 = 45;
			}
		} else if (Static187.anInt3755 == 90) {
			Static88.aString70 = Static413.aClass182_239.method4155(Static191.anInt3842);
			Static245.anInt4434 = 50;
			Static187.anInt3755 = 95;
		} else if (Static187.anInt3755 == 95) {
			if (Static361.aClass85_Sub1_1.aBoolean181) {
				Static361.aClass85_Sub1_1.anInt2484 = 0;
				Static361.aClass85_Sub1_1.anInt2483 = 1;
				Static361.aClass85_Sub1_1.anInt2488 = 0;
				Static361.aClass85_Sub1_1.anInt2493 = 0;
				Static361.aClass85_Sub1_1.anInt2486 = 0;
			}
			Static361.aClass85_Sub1_1.aBoolean181 = true;
			Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
			Static232.method3818(Static361.aClass85_Sub1_1.anInt2484, false);
			Static88.aString70 = Static32.aClass182_27.method4155(Static191.anInt3842);
			Static187.anInt3755 = 100;
			Static245.anInt4434 = 55;
		} else if (Static187.anInt3755 == 100) {
			Static341.method4588(Static326.aClass187_99, Static412.aClass50_8, Static21.aClass187_8);
			Static88.aString70 = Static111.aClass182_209.method4155(Static191.anInt3842);
			Static245.anInt4434 = 60;
			Static458.method6071(1);
			Static187.anInt3755 = 110;
		} else if (Static187.anInt3755 == 110) {
			Static255.aClass187_81.method4293();
			local6 = Static255.aClass187_81.method4286();
			Static87.aClass187_36.method4293();
			local6 += Static87.aClass187_36.method4286();
			Static85.aClass187_137.method4293();
			local6 += Static85.aClass187_137.method4286();
			Static436.aClass187_126.method4293();
			local6 += Static436.aClass187_126.method4286();
			Static297.aClass187_90.method4293();
			local6 += Static297.aClass187_90.method4286();
			Static63.aClass187_21.method4293();
			local6 += Static63.aClass187_21.method4286();
			Static339.aClass187_102.method4293();
			local6 += Static339.aClass187_102.method4286();
			Static74.aClass187_30.method4293();
			local6 += Static74.aClass187_30.method4286();
			Static265.aClass187_82.method4293();
			local6 += Static265.aClass187_82.method4286();
			Static393.aClass187_116.method4293();
			local6 += Static393.aClass187_116.method4286();
			Static39.aClass187_10.method4293();
			local6 += Static39.aClass187_10.method4286();
			Static127.aClass187_50.method4293();
			local6 += Static127.aClass187_50.method4286();
			if (local6 < 1200) {
				Static88.aString70 = Static306.aClass182_188.method4155(Static191.anInt3842) + local6 / 12 + "%";
				Static245.anInt4434 = 65;
			} else {
				Static376.aClass204_1 = new Class204(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static133.aClass223_1 = new Class223(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static400.aClass165_1 = new Class165(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81, Static21.aClass187_8);
				Static108.aClass263_1 = new Class263(Static102.aClass147_3, Static191.anInt3842, Static85.aClass187_137);
				Static173.aClass43_5 = new Class43(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static297.aClass207_5 = new Class207(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static8.aClass100_1 = new Class100(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81, Static3.aClass187_76);
				Static293.aClass226_1 = new Class226(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static120.aClass128_1 = new Class128(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static342.aClass237_4 = new Class237(Static102.aClass147_3, Static191.anInt3842, true, Static87.aClass187_36, Static3.aClass187_76);
				Static300.aClass88_3 = new Class88(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81, Static21.aClass187_8);
				Static228.aClass2_4 = new Class2(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81, Static21.aClass187_8);
				Static448.aClass38_4 = new Class38(Static102.aClass147_3, Static191.anInt3842, true, Static436.aClass187_126, Static3.aClass187_76);
				Static313.aClass272_2 = new Class272(Static102.aClass147_3, Static191.anInt3842, true, Static376.aClass204_1, Static297.aClass187_90, Static3.aClass187_76);
				Static116.aClass144_1 = new Class144(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static281.aClass98_3 = new Class98(Static102.aClass147_3, Static191.anInt3842, Static63.aClass187_21, Static341.aClass187_103, Static166.aClass187_66);
				Static88.aClass47_2 = new Class47(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static314.aClass158_1 = new Class158(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static147.aClass107_1 = new Class107(Static102.aClass147_3, Static191.anInt3842, Static339.aClass187_102, Static3.aClass187_76);
				Static394.aClass48_1 = new Class48(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static279.aClass41_1 = new Class41(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static334.aClass202_1 = new Class202(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static189.aClass112_1 = new Class112(Static102.aClass147_3, Static191.anInt3842, Static74.aClass187_30);
				Static82.aClass271_1 = new Class271(Static102.aClass147_3, Static191.anInt3842, Static255.aClass187_81);
				Static110.method1930(Static3.aClass187_76, Static347.aClass187_106, Static21.aClass187_8, Static326.aClass187_99);
				Static24.method325(Static127.aClass187_50);
				Static349.aClass42_1 = new Class42(Static191.anInt3842, Static265.aClass187_82, Static393.aClass187_116);
				Static42.aClass248_1 = new Class248(Static191.anInt3842, Static265.aClass187_82, Static393.aClass187_116, new Class22());
				Static88.aString70 = Static378.aClass182_224.method4155(Static191.anInt3842);
				Static245.anInt4434 = 65;
				Static100.method1782();
				Static342.aClass237_4.method5207(!Static361.aClass85_Sub1_1.method2113(Static423.anInt7114));
				Static329.aClass201_9 = new Class201();
				Static33.method5356();
				Static432.method5722(Static39.aClass187_10);
				Static423.method5593(Static3.aClass187_76, Static413.anInterface7_7);
				Static187.anInt3755 = 120;
			}
		} else if (Static187.anInt3755 == 120) {
			local6 = Static305.method4244(Static21.aClass187_8);
			local53 = Static200.method3156();
			if (local53 > local6) {
				Static88.aString70 = Static357.aClass182_219.method4155(Static191.anInt3842) + local6 * 100 / local53 + "%";
				Static245.anInt4434 = 70;
			} else {
				Static99.method1779(Static412.aClass50_8, Static21.aClass187_8);
				Static107.method1887(Static301.aClass80Array16);
				Static88.aString70 = Static153.aClass182_110.method4155(Static191.anInt3842);
				Static245.anInt4434 = 70;
				Static187.anInt3755 = 130;
			}
		} else if (Static187.anInt3755 == 130) {
			if (Static322.aClass187_95.method4276("", "huffman")) {
				@Pc(1239) Class257 local1239 = new Class257(Static322.aClass187_95.method4289("huffman", ""));
				Static172.method2924(local1239);
				Static88.aString70 = Static321.aClass182_199.method4155(Static191.anInt3842);
				Static245.anInt4434 = 75;
				Static187.anInt3755 = 140;
			} else {
				Static88.aString70 = Static182.aClass182_126.method4155(Static191.anInt3842) + "0%";
				Static245.anInt4434 = 75;
			}
		} else if (Static187.anInt3755 == 140) {
			if (Static347.aClass187_106.method4293()) {
				Static88.aString70 = Static452.aClass182_165.method4155(Static191.anInt3842);
				Static187.anInt3755 = 150;
				Static245.anInt4434 = 80;
			} else {
				Static88.aString70 = Static387.aClass182_225.method4155(Static191.anInt3842) + Static347.aClass187_106.method4286() + "%";
				Static245.anInt4434 = 80;
			}
		} else if (Static187.anInt3755 == 150) {
			if (Static157.aClass187_63.method4293()) {
				Static88.aString70 = Static227.aClass182_133.method4155(Static191.anInt3842);
				Static245.anInt4434 = 82;
				Static187.anInt3755 = 160;
			} else {
				Static88.aString70 = Static286.aClass182_179.method4155(Static191.anInt3842) + Static157.aClass187_63.method4286() + "%";
				Static245.anInt4434 = 82;
			}
		} else if (Static187.anInt3755 == 160) {
			if (Static326.aClass187_99.method4293()) {
				Static88.aString70 = Static176.aClass182_124.method4155(Static191.anInt3842);
				Static245.anInt4434 = 85;
				Static187.anInt3755 = 170;
			} else {
				Static88.aString70 = Static176.aClass182_124.method4155(Static191.anInt3842) + Static326.aClass187_99.method4286() + "%";
				Static245.anInt4434 = 85;
			}
		} else if (Static187.anInt3755 == 170) {
			if (Static251.aClass187_110.method4275("details")) {
				Static143.method2373(Static251.aClass187_110, Static173.aClass43_5, Static297.aClass207_5, Static342.aClass237_4, Static300.aClass88_3, Static228.aClass2_4, Static329.aClass201_9);
				Static88.aString70 = Static174.aClass182_123.method4155(Static191.anInt3842);
				Static245.anInt4434 = 89;
				Static187.anInt3755 = 190;
			} else {
				Static88.aString70 = Static251.aClass182_216.method4155(Static191.anInt3842) + Static251.aClass187_110.method4310("details") + "%";
				Static245.anInt4434 = 87;
			}
		} else if (Static187.anInt3755 == 190) {
			Static136.anIntArray282 = new int[Static334.aClass202_1.anInt5669];
			Static156.aBooleanArray7 = new boolean[Static334.aClass202_1.anInt5669];
			Static195.aStringArray29 = new String[Static279.aClass41_1.anInt1108];
			for (local6 = 0; local6 < Static334.aClass202_1.anInt5669; local6++) {
				if (Static334.aClass202_1.method4516(local6).anInt3858 == 0) {
					Static156.aBooleanArray7[local6] = true;
					Static233.anInt4303++;
				}
				Static136.anIntArray282[local6] = -1;
			}
			Static110.method1931();
			Static336.anInt5674 = Static347.aClass187_106.method4278("loginscreen");
			Static39.anInt628 = Static347.aClass187_106.method4278("lobbyscreen");
			Static77.aClass187_32.method4279(false);
			Static43.aClass187_11.method4279(true);
			Static21.aClass187_8.method4279(true);
			Static326.aClass187_99.method4279(true);
			Static322.aClass187_95.method4279(true);
			Static347.aClass187_106.method4279(true);
			Static232.aBoolean319 = true;
			Static255.aClass187_81.anInt5387 = 2;
			Static85.aClass187_137.anInt5387 = 2;
			Static87.aClass187_36.anInt5387 = 2;
			Static436.aClass187_126.anInt5387 = 2;
			Static297.aClass187_90.anInt5387 = 2;
			Static63.aClass187_21.anInt5387 = 2;
			Static339.aClass187_102.anInt5387 = 2;
			Static215.method3290(-1, Static361.aClass85_Sub1_1.anInt2483, -1, false);
			Static88.aString70 = Static78.aClass182_64.method4155(Static191.anInt3842);
			Static245.anInt4434 = 95;
			Static187.anInt3755 = 200;
		} else if (Static187.anInt3755 == 200) {
			Static458.method6071(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method982() {
		try {
			this.method991();
		} catch (@Pc(10) OutOfMemoryError local10) {
			if (local10.getMessage() == null || !local10.getMessage().startsWith("native")) {
				throw local10;
			}
			Static178.method2951(0);
			Static432.method5720(local10.getMessage() + " (Recovered) " + this.method980(), local10);
		}
	}
}
