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
				Static316.method4611("argument count");
			}
			Static166.anInt3532 = Integer.parseInt(arg0[0]);
			Static356.aClass238_6 = Static212.aClass238_2;
			if (arg0[1].equals("live")) {
				Static135.aClass247_2 = Static12.aClass247_1;
			} else if (arg0[1].equals("rc")) {
				Static135.aClass247_2 = Static146.aClass247_3;
			} else if (arg0[1].equals("wip")) {
				Static135.aClass247_2 = Static182.aClass247_4;
			} else {
				Static316.method4611("modewhat");
			}
			Static216.anInt4257 = Static239.method3735(arg0[2]);
			if (Static216.anInt4257 == -1) {
				if (arg0[2].equals("english")) {
					Static216.anInt4257 = 0;
				} else if (arg0[2].equals("german")) {
					Static216.anInt4257 = 1;
				} else {
					Static316.method4611("language");
				}
			}
			Static97.aBoolean165 = false;
			Static260.aBoolean490 = false;
			if (arg0[3].equals("game0")) {
				Static114.aClass89_2 = Static436.aClass89_3;
			} else if (arg0[3].equals("game1")) {
				Static114.aClass89_2 = Static69.aClass89_1;
			} else {
				Static316.method4611("game");
			}
			Static368.anInt6561 = 0;
			Static70.aBoolean129 = true;
			Static17.aBoolean22 = true;
			Static448.anInt7558 = 0;
			Static16.aString3 = "";
			Static411.anInt7105 = Static114.aClass89_2.anInt3213;
			@Pc(130) client local130 = new client();
			Static107.aClient1 = local130;
			local130.method1152(Static135.aClass247_2.method5656() + 32, Static114.aClass89_2.aString30);
			Static225.aFrame1.setLocation(40, 40);
		} catch (@Pc(153) Exception local153) {
			Static379.method1671(local153, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1143() {
		if (Static142.anInt3209 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static217.method3474() / 1000000L - Static448.aLong223;
		Static448.aLong223 = Static217.method3474() / 1000000L;
		@Pc(26) boolean local26 = Static317.method4623();
		if (local26 && Static358.aBoolean419 && Static183.aClass33_4 != null) {
			Static183.aClass33_4.method3059();
		}
		if (Static142.anInt3209 == 30 || Static142.anInt3209 == 10) {
			if (Static186.aLong117 != 0L && Static186.aLong117 < Static150.method2672()) {
				Static383.method5254(Static123.aClass21_Sub1_1.anInt874, Static38.method898(), false, Static123.aClass21_Sub1_1.anInt882);
			} else if (!Static266.aClass75_7.method2641() && Static273.aBoolean374) {
				Static267.method4012();
			}
		}
		@Pc(87) int local87;
		@Pc(91) int local91;
		if (Static342.aFrame2 == null) {
			@Pc(78) Container local78;
			if (Static225.aFrame1 == null) {
				local78 = Static295.aClass103_5.anApplet1;
			} else {
				local78 = Static225.aFrame1;
			}
			local87 = local78.getSize().width;
			local91 = local78.getSize().height;
			if (local78 == Static225.aFrame1) {
				@Pc(97) Insets local97 = Static225.aFrame1.getInsets();
				local87 -= local97.right + local97.left;
				local91 -= local97.top + local97.bottom;
			}
			if (Static196.anInt3872 != local87 || local91 != Static251.anInt4721) {
				if (Static266.aClass75_7 == null || Static266.aClass75_7.method2578()) {
					Static420.method5621();
				} else {
					Static196.anInt3872 = local87;
					Static251.anInt4721 = local91;
				}
				Static186.aLong117 = Static150.method2672() + 500L;
			}
		}
		if (Static342.aFrame2 != null && !Static108.aBoolean266 && (Static142.anInt3209 == 30 || Static142.anInt3209 == 10)) {
			Static383.method5254(-1, Static123.aClass21_Sub1_1.anInt878, false, -1);
		}
		@Pc(166) boolean local166 = false;
		if (Static91.aBoolean161) {
			local166 = true;
			Static91.aBoolean161 = false;
		}
		if (local166) {
			Static5.method103();
		}
		if (Static266.aClass75_7 != null && Static266.aClass75_7.method2641() || Static38.method898() != 1) {
			Static357.method5085();
		}
		if (Static142.anInt3209 == 0) {
			Static213.method3439(Static149.aColorArray1[Static411.anInt7105], local166, Static233.aColorArray2[Static411.anInt7105], Static21.aString4, Static433.anInt7360, Static376.aColorArray6[Static411.anInt7105]);
		} else if (Static142.anInt3209 == 5) {
			Static336.method4878(Static233.aColorArray2[Static411.anInt7105].getRGB(), Static266.aClass75_7, Static376.aColorArray6[Static411.anInt7105].getRGB(), local166 | Static266.aClass75_7.method2641(), Static399.aClass65_7, Static149.aColorArray1[Static411.anInt7105].getRGB());
		} else if (Static142.anInt3209 == 10) {
			Static3.method4776();
		} else if (Static142.anInt3209 == 25 || Static142.anInt3209 == 28) {
			if (Static439.anInt7489 == 1) {
				if (Static104.anInt2300 < Static202.anInt4031) {
					Static104.anInt2300 = Static202.anInt4031;
				}
				local87 = (Static104.anInt2300 - Static202.anInt4031) * 50 / Static104.anInt2300;
				Static373.method5170(Static277.aClass65_5, true, Static427.aClass175_237.method4201(Static216.anInt4257) + "<br>(" + local87 + "%)");
			} else if (Static439.anInt7489 == 2) {
				if (Static383.anInt6683 > Static189.anInt3804) {
					Static189.anInt3804 = Static383.anInt6683;
				}
				local87 = (Static189.anInt3804 - Static383.anInt6683) * 50 / Static189.anInt3804 + 50;
				Static373.method5170(Static277.aClass65_5, true, Static427.aClass175_237.method4201(Static216.anInt4257) + "<br>(" + local87 + "%)");
			} else {
				Static373.method5170(Static277.aClass65_5, true, Static427.aClass175_237.method4201(Static216.anInt4257));
			}
		} else if (Static142.anInt3209 == 30) {
			Static414.method5544(local16);
		} else if (Static142.anInt3209 == 40) {
			Static373.method5170(Static277.aClass65_5, true, Static51.aClass175_45.method4201(Static216.anInt4257) + "<br>" + Static405.aClass175_226.method4201(Static216.anInt4257));
		}
		if (Static57.anInt1412 == 3) {
			for (local87 = 0; local87 < Static54.anInt1292; local87++) {
				@Pc(390) Rectangle local390 = Class7_Sub1.aRectangleArray4[local87];
				if (Static406.aBooleanArray24[local87]) {
					Static266.aClass75_7.method2600(local390.height, local390.x, local390.width, local390.y, -1996553985);
				} else if (Static290.aBooleanArray16[local87]) {
					Static266.aClass75_7.method2600(local390.height, local390.x, local390.width, local390.y, -1996554240);
				}
			}
		}
		if (Static186.method3114()) {
			Static190.method3170(Static266.aClass75_7);
		}
		if ((Static142.anInt3209 == 30 || Static142.anInt3209 == 10) && Static57.anInt1412 == 0 && Static38.method898() == 1 && !local166 && Static162.aString35.equals("1.1")) {
			local87 = 0;
			for (local91 = 0; local91 < Static54.anInt1292; local91++) {
				if (Static290.aBooleanArray16[local91]) {
					Static290.aBooleanArray16[local91] = false;
					Static56.aRectangleArray3[local87++] = Class7_Sub1.aRectangleArray4[local91];
				}
			}
			Static266.aClass75_7.method2566(Static56.aRectangleArray3, local87);
		} else if (Static142.anInt3209 != 0) {
			Static266.aClass75_7.method2594();
			for (local87 = 0; local87 < Static54.anInt1292; local87++) {
				Static290.aBooleanArray16[local87] = false;
			}
		}
		if (Static123.aClass21_Sub1_1.anInt881 == 0) {
			Static135.method2458(15L);
		} else if (Static123.aClass21_Sub1_1.anInt881 == 1) {
			Static135.method2458(10L);
		} else if (Static123.aClass21_Sub1_1.anInt881 == 2) {
			Static135.method2458(5L);
		} else if (Static123.aClass21_Sub1_1.anInt881 == 3) {
			Static135.method2458(2L);
		}
		if (Static346.aBoolean441) {
			Static40.method6019();
		}
		if (Static123.aClass21_Sub1_1.aBoolean69 && Static142.anInt3209 == 10 && Static337.anInt6221 != -1) {
			Static123.aClass21_Sub1_1.aBoolean69 = false;
			Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1157() {
		Static429.anInt7317++;
		Static144.method2565(null, -1, -1);
		Static394.method5316(null, -1, -1);
		Static94.method1639();
		Static296.anInt5417++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(37) Class1_Sub3_Sub3_Sub2 local37 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local27];
			if (local37 != null) {
				@Pc(43) byte local43 = local37.aClass47_1.aByte18;
				if ((local43 & 0x1) != 0) {
					@Pc(54) int local54 = local37.method4831();
					@Pc(75) int local75;
					if ((local43 & 0x2) != 0 && local37.anInt6133 == 0 && Math.random() * 1000.0D < 10.0D) {
						local75 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(83) int local83 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local75 != 0 || local83 != 0) {
							@Pc(97) int local97 = local75 + local37.anIntArray453[0];
							if (local97 < 0) {
								local97 = 0;
							} else if (Static399.anInt6923 - local54 - 1 < local97) {
								local97 = Static399.anInt6923 - local54 - 1;
							}
							@Pc(128) int local128 = local37.anIntArray454[0] + local83;
							if (local128 < 0) {
								local128 = 0;
							} else if (local128 > Static127.anInt2696 - local54 - 1) {
								local128 = Static127.anInt2696 - local54 - 1;
							}
							@Pc(178) int local178 = Static183.method3360(local54, Static271.anIntArray429, true, local97, local37.anIntArray453[0], Static222.anIntArray325, Static389.aClass23Array1[local37.aByte77], 0, -1, local37.anIntArray454[0], local54, local54, local128, 0);
							if (local178 > 0) {
								if (local178 > 9) {
									local178 = 9;
								}
								for (@Pc(190) int local190 = 0; local190 < local178; local190++) {
									local37.anIntArray453[local190] = Static271.anIntArray429[local178 - local190 - 1];
									local37.anIntArray454[local190] = Static222.anIntArray325[local178 - local190 - 1];
									local37.aByteArray69[local190] = 1;
								}
								local37.anInt6133 = local178;
							}
						}
					}
					Static247.method3785(true, local37);
					local75 = Static2.method64(local37);
					Static376.method5787(local37, local75, Static419.anInt7240, Static10.anInt269);
					Static302.method4452(local37);
				}
			}
		}
		if (Static108.anInt3455 == 0 && Static284.anInt5211 == 0) {
			if (Static107.anInt2382 == 2) {
				Static138.method2518();
			} else {
				Static238.method3733();
			}
			if (Static398.anInt6901 >> 7 < 14 || Static399.anInt6923 - 14 <= Static398.anInt6901 >> 7 || Static80.anInt1722 >> 7 < 14 || Static80.anInt1722 >> 7 >= Static127.anInt2696 - 14) {
				Static437.method5855();
			}
		}
		while (true) {
			@Pc(305) Class3_Sub20 local305;
			@Pc(310) Class68 local310;
			@Pc(318) Class68 local318;
			do {
				local305 = (Class3_Sub20) Static58.aClass229_8.method5331();
				if (local305 == null) {
					while (true) {
						do {
							local305 = (Class3_Sub20) Class45.lb.method5331();
							if (local305 == null) {
								while (true) {
									do {
										local305 = (Class3_Sub20) Static392.aClass229_44.method5331();
										if (local305 == null) {
											if (Static435.aClass68_14 != null) {
												Static382.method5245();
											}
											if (Static290.anInt5325 % 1500 == 0) {
												Static193.method5123();
											}
											Static264.method3993();
											if (Static184.aBoolean290 && Static331.aLong170 < Static150.method2672() - 60000L) {
												Static364.method5135();
												return;
											}
											return;
										}
										local310 = local305.aClass68_4;
										if (local310.anInt2187 < 0) {
											break;
										}
										local318 = Static321.method4661(local310.anInt2225);
									} while (local318 == null || local318.aClass68Array2 == null || local318.aClass68Array2.length <= local310.anInt2187 || local310 != local318.aClass68Array2[local310.anInt2187]);
									Static272.method4044(local305);
								}
							}
							local310 = local305.aClass68_4;
							if (local310.anInt2187 < 0) {
								break;
							}
							local318 = Static321.method4661(local310.anInt2225);
						} while (local318 == null || local318.aClass68Array2 == null || local310.anInt2187 >= local318.aClass68Array2.length || local318.aClass68Array2[local310.anInt2187] != local310);
						Static272.method4044(local305);
					}
				}
				local310 = local305.aClass68_4;
				if (local310.anInt2187 < 0) {
					break;
				}
				local318 = Static321.method4661(local310.anInt2225);
			} while (local318 == null || local318.aClass68Array2 == null || local310.anInt2187 >= local318.aClass68Array2.length || local310 != local318.aClass68Array2[local310.anInt2187]);
			Static272.method4044(local305);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1158() {
		@Pc(6) int local6;
		if (!Static123.aClass21_Sub1_1.aBoolean69) {
			for (local6 = 0; local6 < Static269.anInt5026; local6++) {
				if (Static389.aClass19Array1[local6].method732() == 's' || Static389.aClass19Array1[local6].method732() == 'S') {
					Static123.aClass21_Sub1_1.aBoolean69 = true;
					break;
				}
			}
		}
		@Pc(49) int local49;
		if (Static72.anInt2369 == 0) {
			@Pc(39) Runtime local39 = Runtime.getRuntime();
			local49 = (int) ((local39.totalMemory() - local39.freeMemory()) / 1024L);
			@Pc(52) long local52 = Static150.method2672();
			if (Static51.aLong46 == 0L) {
				Static51.aLong46 = local52;
			}
			if (local49 > 16384 && local52 - Static51.aLong46 < 5000L) {
				if (local52 - Static398.aLong200 > 1000L) {
					System.gc();
					Static398.aLong200 = local52;
				}
				Static21.aString4 = Static284.aClass175_170.method4201(Static216.anInt4257);
				Static433.anInt7360 = 5;
			} else {
				Static21.aString4 = Static126.aClass175_113.method4201(Static216.anInt4257);
				Static433.anInt7360 = 5;
				Static72.anInt2369 = 10;
			}
		} else if (Static72.anInt2369 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static389.aClass23Array1[local6] = Static178.method3009(Static399.anInt6923, Static127.anInt2696);
			}
			Static21.aString4 = Static304.aClass175_182.method4201(Static216.anInt4257);
			Static433.anInt7360 = 10;
			Static72.anInt2369 = 20;
		} else if (Static72.anInt2369 == 20) {
			if (Static164.aClass164_1 == null) {
				Static164.aClass164_1 = new Class164(Static215.aClass183_2, Static213.aClass15_2);
			}
			if (Static164.aClass164_1.method3970()) {
				Static142.aClass56_35 = Static240.method3749(0, true, false);
				Static7.aClass56_5 = Static240.method3749(1, true, false);
				Static104.aClass56_27 = Static240.method3749(2, true, false);
				Static276.aClass56_67 = Static240.method3749(3, true, false);
				Static95.aClass56_23 = Static240.method3749(4, true, false);
				Static93.aClass56_22 = Static240.method3749(5, true, true);
				Static160.aClass56_39 = Static240.method3749(6, false, true);
				Static341.aClass56_73 = Static240.method3749(7, true, false);
				Static20.aClass56_10 = Static240.method3749(8, true, false);
				Static169.aClass56_41 = Static240.method3749(9, true, false);
				Static6.aClass56_4 = Static240.method3749(10, true, false);
				Static238.aClass56_60 = Static240.method3749(11, true, false);
				Static331.aClass56_71 = Static240.method3749(12, true, false);
				Static420.aClass56_87 = Static240.method3749(13, true, false);
				Static405.aClass56_84 = Static240.method3749(14, false, false);
				Static144.aClass56_36 = Static240.method3749(15, true, false);
				Static270.aClass56_74 = Static240.method3749(16, true, false);
				Static116.aClass56_76 = Static240.method3749(17, true, false);
				Static241.aClass56_62 = Static240.method3749(18, true, false);
				Static212.aClass56_53 = Static240.method3749(19, true, false);
				Static445.aClass56_99 = Static240.method3749(20, true, false);
				Static5.aClass56_3 = Static240.method3749(21, true, false);
				Static168.aClass56_40 = Static240.method3749(22, true, false);
				Static384.aClass56_77 = Static240.method3749(23, true, true);
				Static137.aClass56_34 = Static240.method3749(24, true, false);
				Static4.aClass56_12 = Static240.method3749(25, true, false);
				Static97.aClass56_24 = Static240.method3749(26, true, true);
				Static395.aClass56_81 = Static240.method3749(27, true, false);
				Static114.aClass56_29 = Static240.method3749(28, true, true);
				Static203.aClass56_50 = Static240.method3749(29, true, false);
				Static21.aString4 = Static425.aClass175_236.method4201(Static216.anInt4257);
				Static72.anInt2369 = 30;
				Static433.anInt7360 = 15;
			} else {
				Static21.aString4 = Static202.aClass175_130.method4201(Static216.anInt4257);
				Static433.anInt7360 = 12;
			}
		} else if (Static72.anInt2369 == 30) {
			local6 = 0;
			for (local49 = 0; local49 < 30; local49++) {
				local6 += Static58.aClass50_Sub1Array1[local49].method1836() * Static81.anIntArray153[local49] / 100;
			}
			if (local6 == 100) {
				Static21.aString4 = Static46.aClass175_43.method4201(Static216.anInt4257);
				Static433.anInt7360 = 20;
				Static455.method4739(Static20.aClass56_10);
				Static304.method4493(Static20.aClass56_10);
				Static72.anInt2369 = 40;
			} else {
				if (local6 != 0) {
					Static21.aString4 = Static200.aClass175_127.method4201(Static216.anInt4257) + local6 + "%";
				}
				Static433.anInt7360 = 20;
			}
		} else if (Static72.anInt2369 == 40) {
			if (Static114.aClass56_29.method1382()) {
				this.method1163(Static114.aClass56_29.method1391(1));
				Static21.aString4 = Static153.aClass175_104.method4201(Static216.anInt4257);
				Static72.anInt2369 = 50;
				Static433.anInt7360 = 25;
			} else {
				Static21.aString4 = Static327.aClass175_194.method4201(Static216.anInt4257) + Static114.aClass56_29.method1377() + "%";
				Static433.anInt7360 = 25;
			}
		} else if (Static72.anInt2369 == 50) {
			Static447.method5925();
			Static21.aString4 = Static442.aClass175_246.method4201(Static216.anInt4257);
			Static72.anInt2369 = 60;
			Static433.anInt7360 = 30;
		} else {
			@Pc(519) int local519;
			if (Static72.anInt2369 == 60) {
				local49 = Static15.method457(Static20.aClass56_10, Static420.aClass56_87);
				local519 = Static399.method5381();
				if (local49 < local519) {
					Static21.aString4 = Static236.aClass175_151.method4201(Static216.anInt4257) + local49 * 100 / local519 + "%";
					Static433.anInt7360 = 35;
				} else {
					Static21.aString4 = Static340.aClass175_203.method4201(Static216.anInt4257);
					Static433.anInt7360 = 35;
					Static72.anInt2369 = 70;
				}
			} else if (Static72.anInt2369 == 70) {
				local49 = Static379.method1669(Static20.aClass56_10);
				local519 = Static206.method3377();
				if (local519 > local49) {
					Static21.aString4 = Static258.aClass175_245.method4201(Static216.anInt4257) + local49 * 100 / local519 + "%";
					Static433.anInt7360 = 40;
				} else {
					Static21.aString4 = Static99.aClass175_73.method4201(Static216.anInt4257);
					Static72.anInt2369 = 80;
					Static433.anInt7360 = 40;
				}
			} else if (Static72.anInt2369 == 80) {
				if (Static97.aClass56_24.method1382()) {
					Static239.anInterface7_8 = new Class77(Static97.aClass56_24, Static169.aClass56_41, Static20.aClass56_10);
					Static21.aString4 = Static258.aClass175_243.method4201(Static216.anInt4257);
					Static433.anInt7360 = 45;
					Static72.anInt2369 = 90;
				} else {
					Static21.aString4 = Static197.aClass175_141.method4201(Static216.anInt4257) + Static97.aClass56_24.method1377() + "%";
					Static433.anInt7360 = 45;
				}
			} else if (Static72.anInt2369 == 90) {
				Static21.aString4 = Static384.aClass175_219.method4201(Static216.anInt4257);
				Static433.anInt7360 = 50;
				Static72.anInt2369 = 95;
			} else if (Static72.anInt2369 == 95) {
				if (Static123.aClass21_Sub1_1.aBoolean69) {
					Static123.aClass21_Sub1_1.anInt869 = 0;
					Static123.aClass21_Sub1_1.anInt878 = 1;
					Static123.aClass21_Sub1_1.anInt879 = 0;
					Static123.aClass21_Sub1_1.anInt867 = 0;
					Static123.aClass21_Sub1_1.anInt866 = 0;
				}
				Static123.aClass21_Sub1_1.aBoolean69 = true;
				Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
				Static356.method5052(Static123.aClass21_Sub1_1.anInt867, false);
				Static21.aString4 = Static103.aClass175_74.method4201(Static216.anInt4257);
				Static72.anInt2369 = 100;
				Static433.anInt7360 = 55;
			} else if (Static72.anInt2369 == 100) {
				Static176.method2998(Static266.aClass75_7, Static420.aClass56_87, Static20.aClass56_10);
				Static21.aString4 = Static129.aClass175_91.method4201(Static216.anInt4257);
				Static433.anInt7360 = 60;
				Static293.method2805(5);
				Static72.anInt2369 = 110;
			} else if (Static72.anInt2369 == 110) {
				Static104.aClass56_27.method1382();
				local49 = Static104.aClass56_27.method1377();
				Static270.aClass56_74.method1382();
				local49 += Static270.aClass56_74.method1377();
				Static116.aClass56_76.method1382();
				local49 += Static116.aClass56_76.method1377();
				Static241.aClass56_62.method1382();
				local49 += Static241.aClass56_62.method1377();
				Static212.aClass56_53.method1382();
				local49 += Static212.aClass56_53.method1377();
				Static445.aClass56_99.method1382();
				local49 += Static445.aClass56_99.method1377();
				Static5.aClass56_3.method1382();
				local49 += Static5.aClass56_3.method1377();
				Static168.aClass56_40.method1382();
				local49 += Static168.aClass56_40.method1377();
				Static137.aClass56_34.method1382();
				local49 += Static137.aClass56_34.method1377();
				Static4.aClass56_12.method1382();
				local49 += Static4.aClass56_12.method1377();
				Static395.aClass56_81.method1382();
				local49 += Static395.aClass56_81.method1377();
				Static203.aClass56_50.method1382();
				local49 += Static203.aClass56_50.method1377();
				if (local49 < 1200) {
					Static21.aString4 = Static211.aClass175_137.method4201(Static216.anInt4257) + local49 / 12 + "%";
					Static433.anInt7360 = 65;
				} else {
					Static294.aClass69_2 = new Class69(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static427.aClass237_1 = new Class237(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static199.aClass112_2 = new Class112(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27, Static20.aClass56_10);
					Static58.aClass192_1 = new Class192(Static114.aClass89_2, Static216.anInt4257, Static116.aClass56_76);
					Static149.aClass71_4 = new Class71(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static89.aClass252_3 = new Class252(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static279.aClass109_8 = new Class109(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27, Static341.aClass56_73);
					Static343.aClass150_6 = new Class150(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static85.aClass246_41 = new Class246(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static55.aClass25_1 = new Class25(Static114.aClass89_2, Static216.anInt4257, true, Static270.aClass56_74, Static341.aClass56_73);
					Static408.aClass61_3 = new Class61(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27, Static20.aClass56_10);
					Static404.aClass123_3 = new Class123(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27, Static20.aClass56_10);
					Static154.aClass251_2 = new Class251(Static114.aClass89_2, Static216.anInt4257, true, Static241.aClass56_62, Static341.aClass56_73);
					Static89.aClass157_1 = new Class157(Static114.aClass89_2, Static216.anInt4257, true, Static294.aClass69_2, Static212.aClass56_53, Static341.aClass56_73);
					Static176.aClass120_1 = new Class120(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static196.aClass30_2 = new Class30(Static114.aClass89_2, Static216.anInt4257, Static445.aClass56_99, Static142.aClass56_35, Static7.aClass56_5);
					Static290.aClass2_1 = new Class2(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static430.aClass211_1 = new Class211(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static102.aClass91_2 = new Class91(Static114.aClass89_2, Static216.anInt4257, Static5.aClass56_3, Static341.aClass56_73);
					Static30.aClass254_1 = new Class254(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static332.aClass249_1 = new Class249(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static345.aClass84_1 = new Class84(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static35.aClass227_2 = new Class227(Static114.aClass89_2, Static216.anInt4257, Static168.aClass56_40);
					Static260.aClass169_4 = new Class169(Static114.aClass89_2, Static216.anInt4257, Static104.aClass56_27);
					Static302.method4453(Static420.aClass56_87, Static276.aClass56_67, Static341.aClass56_73, Static20.aClass56_10);
					Static93.method1631(Static203.aClass56_50);
					Static430.aClass59_1 = new Class59(Static216.anInt4257, Static137.aClass56_34, Static4.aClass56_12);
					Static32.aClass259_1 = new Class259(Static216.anInt4257, Static137.aClass56_34, Static4.aClass56_12, new Class143());
					Static21.aString4 = Static103.aClass175_75.method4201(Static216.anInt4257);
					Static433.anInt7360 = 65;
					Static209.method3402();
					Static55.aClass25_1.method859(!Static123.aClass21_Sub1_1.method787(Static347.anInt6318));
					Static369.aClass11_1 = new Class11();
					Static337.method4900();
					Static2.method61(Static395.aClass56_81);
					Static36.method858(Static341.aClass56_73, Static239.anInterface7_8);
					Static72.anInt2369 = 120;
				}
			} else if (Static72.anInt2369 == 120) {
				local49 = Static163.method2865(Static20.aClass56_10);
				local519 = Static249.method3812();
				if (local49 < local519) {
					Static21.aString4 = Static62.aClass175_53.method4201(Static216.anInt4257) + local49 * 100 / local519 + "%";
					Static433.anInt7360 = 70;
				} else {
					Static41.method924(Static266.aClass75_7, Static20.aClass56_10);
					Static198.method3226(Static240.aClass22Array17);
					Static21.aString4 = Static377.aClass175_214.method4201(Static216.anInt4257);
					Static433.anInt7360 = 70;
					Static72.anInt2369 = 130;
				}
			} else if (Static72.anInt2369 == 130) {
				if (Static6.aClass56_4.method1387("", "huffman")) {
					@Pc(1204) Class253 local1204 = new Class253(Static6.aClass56_4.method1371("huffman", ""));
					Static325.method4723(local1204);
					Static21.aString4 = Static388.aClass175_220.method4201(Static216.anInt4257);
					Static72.anInt2369 = 140;
					Static433.anInt7360 = 75;
				} else {
					Static21.aString4 = Static347.aClass175_205.method4201(Static216.anInt4257) + "0%";
					Static433.anInt7360 = 75;
				}
			} else if (Static72.anInt2369 == 140) {
				if (Static276.aClass56_67.method1382()) {
					Static21.aString4 = Static228.aClass175_250.method4201(Static216.anInt4257);
					Static72.anInt2369 = 150;
					Static433.anInt7360 = 80;
				} else {
					Static21.aString4 = Static412.aClass175_232.method4201(Static216.anInt4257) + Static276.aClass56_67.method1377() + "%";
					Static433.anInt7360 = 80;
				}
			} else if (Static72.anInt2369 == 150) {
				if (Static331.aClass56_71.method1382()) {
					Static21.aString4 = Static453.aClass175_251.method4201(Static216.anInt4257);
					Static72.anInt2369 = 160;
					Static433.anInt7360 = 82;
				} else {
					Static21.aString4 = Static117.aClass175_85.method4201(Static216.anInt4257) + Static331.aClass56_71.method1377() + "%";
					Static433.anInt7360 = 82;
				}
			} else if (Static72.anInt2369 == 160) {
				if (Static420.aClass56_87.method1382()) {
					Static21.aString4 = Static235.aClass175_150.method4201(Static216.anInt4257);
					Static72.anInt2369 = 170;
					Static433.anInt7360 = 85;
				} else {
					Static21.aString4 = Static235.aClass175_150.method4201(Static216.anInt4257) + Static420.aClass56_87.method1377() + "%";
					Static433.anInt7360 = 85;
				}
			} else if (Static72.anInt2369 == 170) {
				if (Static384.aClass56_77.method1374("details")) {
					Static210.method5876(Static384.aClass56_77, Static149.aClass71_4, Static89.aClass252_3, Static55.aClass25_1, Static408.aClass61_3, Static404.aClass123_3, Static369.aClass11_1);
					Static21.aString4 = Static148.aClass175_99.method4201(Static216.anInt4257);
					Static433.anInt7360 = 89;
					Static72.anInt2369 = 180;
				} else {
					Static21.aString4 = Static61.aClass175_51.method4201(Static216.anInt4257) + Static384.aClass56_77.method1393("details") + "%";
					Static433.anInt7360 = 87;
				}
			} else if (Static72.anInt2369 == 180) {
				local49 = Static129.method2231();
				if (local49 == -1) {
					Static21.aString4 = Static159.aClass175_107.method4201(Static216.anInt4257);
					Static433.anInt7360 = 90;
				} else if (local49 == 7 || local49 == 9) {
					this.method1141("worldlistfull");
					Static293.method2805(1000);
				} else if (Static24.aBoolean41) {
					Static21.aString4 = Static444.aClass175_247.method4201(Static216.anInt4257);
					Static72.anInt2369 = 190;
					Static433.anInt7360 = 90;
				} else {
					this.method1141("worldlistio_" + local49);
					Static293.method2805(1000);
				}
			} else if (Static72.anInt2369 == 190) {
				Static372.aBooleanArray9 = new boolean[Static345.aClass84_1.anInt2821];
				Static436.anIntArray560 = new int[Static345.aClass84_1.anInt2821];
				Static306.aStringArray130 = new String[Static332.aClass249_1.anInt7293];
				for (local49 = 0; local49 < Static345.aClass84_1.anInt2821; local49++) {
					if (Static345.aClass84_1.method2270(local49).anInt6185 == 0) {
						Static372.aBooleanArray9[local49] = true;
						Static366.anInt6539++;
					}
					Static436.anIntArray560[local49] = -1;
				}
				Static398.method5366();
				Static242.anInt4628 = Static276.aClass56_67.method1368("loginscreen");
				Static93.aClass56_22.method1378(false);
				Static160.aClass56_39.method1378(true);
				Static20.aClass56_10.method1378(true);
				Static420.aClass56_87.method1378(true);
				Static6.aClass56_4.method1378(true);
				Static276.aClass56_67.method1378(true);
				Static104.aClass56_27.anInt1678 = 2;
				Static346.aBoolean441 = true;
				Static116.aClass56_76.anInt1678 = 2;
				Static270.aClass56_74.anInt1678 = 2;
				Static241.aClass56_62.anInt1678 = 2;
				Static212.aClass56_53.anInt1678 = 2;
				Static445.aClass56_99.anInt1678 = 2;
				Static5.aClass56_3.anInt1678 = 2;
				Static383.method5254(-1, Static123.aClass21_Sub1_1.anInt878, false, -1);
				Static21.aString4 = Static181.aClass175_121.method4201(Static216.anInt4257);
				Static433.anInt7360 = 95;
				Static72.anInt2369 = 200;
			} else if (Static72.anInt2369 == 200) {
				Static27.method719(true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1138()) {
			return;
		}
		Static166.anInt3532 = Integer.parseInt(this.getParameter("worldid"));
		Static356.aClass238_6 = Static219.method3496(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static15.method462(Static356.aClass238_6) && Static356.aClass238_6 != Static411.aClass238_7) {
			Static356.aClass238_6 = Static411.aClass238_7;
		}
		Static135.aClass247_2 = Static351.method4989(Integer.parseInt(this.getParameter("modewhat")));
		if (Static182.aClass247_4 != Static135.aClass247_2 && Static146.aClass247_3 != Static135.aClass247_2 && Static135.aClass247_2 != Static12.aClass247_1) {
			Static135.aClass247_2 = Static12.aClass247_1;
		}
		try {
			Static216.anInt4257 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static216.anInt4257 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static97.aBoolean165 = true;
		} else {
			Static97.aBoolean165 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static260.aBoolean490 = true;
		} else {
			Static260.aBoolean490 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static151.aBoolean254 = true;
		} else {
			Static151.aBoolean254 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static114.aClass89_2 = Static69.aClass89_1;
		} else {
			Static114.aClass89_2 = Static436.aClass89_3;
		}
		try {
			Static448.anInt7558 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static448.anInt7558 = 0;
		}
		Static104.aString22 = this.getParameter("quiturl");
		Static16.aString3 = this.getParameter("settings");
		if (Static16.aString3 == null) {
			Static16.aString3 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static368.anInt6561 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static368.anInt6561 = 0;
			}
		}
		Static411.anInt7105 = Integer.parseInt(this.getParameter("colourid"));
		if (Static411.anInt7105 < 0 || Static233.aColorArray2.length <= Static411.anInt7105) {
			Static411.anInt7105 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static70.aBoolean129 = true;
			Static17.aBoolean22 = true;
		}
		if (Static114.aClass89_2 == Static436.aClass89_3) {
			Static124.anInt2689 = 765;
			Static245.anInt4639 = 503;
		} else if (Static114.aClass89_2 == Static69.aClass89_1) {
			Static124.anInt2689 = 640;
			Static245.anInt4639 = 480;
		}
		Static107.aClient1 = this;
		this.method1134(Static245.anInt4639, Static135.aClass247_2.method5656() + 32, Static124.anInt2689);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1142() {
		if (Static142.anInt3209 == 1000) {
			return;
		}
		Static290.anInt5325++;
		if (Static290.anInt5325 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static422.anInt7278 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static218.aRandom1.setSeed((long) Static422.anInt7278);
		}
		if (Static290.anInt5325 % 50 == 0) {
			Static228.anInt7612 = Static408.anInt7067;
			Static107.anInt2380 = Static197.anInt4307;
			Static408.anInt7067 = 0;
			Static197.anInt4307 = 0;
		}
		this.method1168();
		if (Static164.aClass164_1 != null) {
			Static164.aClass164_1.method3971();
		}
		Static228.method5988();
		Static19.aClass16_1.method586();
		Static155.aClass74_1.method1866();
		if (Static166.aClass72_1 != null) {
			@Pc(83) int local83 = Static166.aClass72_1.method2813();
			Static226.anInt4383 = local83;
		}
		if (Static266.aClass75_7 != null) {
			Static266.aClass75_7.method2567((int) Static150.method2672());
		}
		Static152.method2701();
		Static269.anInt5026 = 0;
		for (@Pc(100) Class19 local100 = Static19.aClass16_1.method584(); local100 != null && Static269.anInt5026 < 128; local100 = Static19.aClass16_1.method584()) {
			if (local100.method730() != 1) {
				@Pc(121) char local121 = local100.method732();
				if (!Static167.method5102() || local121 != '`' && local121 != '§') {
					Static389.aClass19Array1[Static269.anInt5026] = local100;
					Static269.anInt5026++;
				} else if (Static186.method3114()) {
					Static34.method827();
				} else {
					Static141.method2535();
				}
			}
		}
		for (@Pc(166) Class3_Sub1 local166 = Static155.aClass74_1.method1864(); local166 != null; local166 = Static155.aClass74_1.method1864()) {
			@Pc(172) int local172 = local166.method4772();
			if (local172 == -1) {
				Static397.aClass229_45.method5321(local166);
			} else if (Static208.method3391(local172)) {
				Static274.aClass229_31.method5321(local166);
			}
			if (Static274.aClass229_31.method5324() > 10) {
				Static274.aClass229_31.method5331();
			}
		}
		if (Static186.method3114()) {
			Static318.method2574();
		}
		if (Static142.anInt3209 == 0) {
			this.method1158();
			Static227.method4681();
		} else if (Static142.anInt3209 == 5) {
			this.method1158();
			Static227.method4681();
		} else if (Static142.anInt3209 == 25 || Static142.anInt3209 == 28) {
			Static451.method5973();
		}
		if (Static142.anInt3209 == 10) {
			this.method1157();
			Static258.method5846();
			Static91.method1567();
			Static322.method4689();
		} else if (Static142.anInt3209 == 30) {
			Static125.method781();
		} else if (Static142.anInt3209 == 40) {
			Static322.method4689();
			if (Static287.anInt5252 != -3 && Static287.anInt5252 != 2 && Static287.anInt5252 != 15) {
				Static378.method5234();
			}
		}
		Static345.method4950(Static266.aClass75_7);
		Static274.aClass229_31.method5331();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method1163(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class3_Sub2 local15 = new Class3_Sub2(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(19) int local19 = local15.method6053();
					if (local19 == 0) {
						return;
					}
					if (local19 == 1) {
						@Pc(116) int[] local116 = Static429.anIntArray516 = new int[6];
						local116[0] = local15.method6004();
						local116[1] = local15.method6004();
						local116[2] = local15.method6004();
						local116[3] = local15.method6004();
						local116[4] = local15.method6004();
						local116[5] = local15.method6004();
					} else {
						@Pc(43) int local43;
						@Pc(38) int local38;
						if (local19 == 4) {
							local38 = local15.method6053();
							Static253.anIntArray366 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static253.anIntArray366[local43] = local15.method6004();
								if (Static253.anIntArray366[local43] == 65535) {
									Static253.anIntArray366[local43] = -1;
								}
							}
						} else if (local19 == 5) {
							local38 = local15.method6053();
							Static222.anIntArray326 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static222.anIntArray326[local43] = local15.method6004();
								if (Static222.anIntArray326[local43] == 65535) {
									Static222.anIntArray326[local43] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1165() {
		if (Static215.aClass183_2.anInt5589 > Static34.anInt927) {
			Static31.anInt834 = (Static215.aClass183_2.anInt5589 - 1) * 250;
			if (Static178.anInt3626 == Static14.anInt470) {
				Static178.anInt3626 = Static324.anInt423;
			} else {
				Static178.anInt3626 = Static14.anInt470;
			}
			if (Static31.anInt834 > 3000) {
				Static31.anInt834 = 3000;
			}
			if (Static215.aClass183_2.anInt5589 >= 2 && Static215.aClass183_2.anInt5590 == 6) {
				this.method1141("js5connect_outofdate");
				Static142.anInt3209 = 1000;
				return;
			}
			if (Static215.aClass183_2.anInt5589 >= 4 && Static215.aClass183_2.anInt5590 == -1) {
				this.method1141("js5crc");
				Static142.anInt3209 = 1000;
				return;
			}
			if (Static215.aClass183_2.anInt5589 >= 4 && (Static142.anInt3209 == 0 || Static142.anInt3209 == 5)) {
				if (Static215.aClass183_2.anInt5590 == 7 || Static215.aClass183_2.anInt5590 == 9) {
					this.method1141("js5connect_full");
				} else if (Static215.aClass183_2.anInt5590 <= 0) {
					this.method1141("js5io");
				} else {
					this.method1141("js5connect");
				}
				Static142.anInt3209 = 1000;
				return;
			}
		}
		Static34.anInt927 = Static215.aClass183_2.anInt5589;
		if (Static31.anInt834 > 0) {
			Static31.anInt834--;
			return;
		}
		try {
			if (Static282.anInt5194 == 0) {
				Static401.aClass190_9 = Static295.aClass103_5.method2834(Static324.aString2, Static178.anInt3626);
				Static282.anInt5194++;
			}
			if (Static282.anInt5194 == 1) {
				if (Static401.aClass190_9.anInt5799 == 2) {
					this.method1169(1000);
					return;
				}
				if (Static401.aClass190_9.anInt5799 == 1) {
					Static282.anInt5194++;
				}
			}
			if (Static282.anInt5194 == 2) {
				Static225.aClass27_2 = new Class27((Socket) Static401.aClass190_9.anObject7, Static295.aClass103_5);
				@Pc(188) Class3_Sub2 local188 = new Class3_Sub2(5);
				local188.method6001(Static410.aClass49_2.anInt1611);
				local188.method6008(583);
				Static225.aClass27_2.method891(local188.aByteArray95, 5);
				Static282.anInt5194++;
				Static358.aLong177 = Static150.method2672();
			}
			if (Static282.anInt5194 == 3) {
				if (Static142.anInt3209 == 0 || Static142.anInt3209 == 5 || Static225.aClass27_2.method894() > 0) {
					@Pc(237) int local237 = Static225.aClass27_2.method890();
					if (local237 != 0) {
						this.method1169(local237);
						return;
					}
					Static282.anInt5194++;
				} else if (Static150.method2672() - Static358.aLong177 > 30000L) {
					this.method1169(1001);
					return;
				}
			}
			if (Static282.anInt5194 == 4) {
				@Pc(287) boolean local287 = Static142.anInt3209 == 5 || Static142.anInt3209 == 10 || Static142.anInt3209 == 28;
				Static215.aClass183_2.method4497(!local287, Static225.aClass27_2);
				Static282.anInt5194 = 0;
				Static225.aClass27_2 = null;
				Static401.aClass190_9 = null;
			}
		} catch (@Pc(304) IOException local304) {
			this.method1169(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1146() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1153() {
		@Pc(15) Frame local15 = new Frame("Jagex");
		local15.pack();
		local15.dispose();
		Static420.method5621();
		Static213.aClass15_2 = new Class15(Static295.aClass103_5);
		Static215.aClass183_2 = new Class183();
		if (Static411.aClass238_7 != Static356.aClass238_6) {
			Static438.aByteArrayArray23 = new byte[50][];
		}
		Static123.aClass21_Sub1_1 = new Class21_Sub1(Static295.aClass103_5);
		if (Static411.aClass238_7 == Static356.aClass238_6) {
			Static266.aString50 = this.getCodeBase().getHost();
			Static301.anInt5507 = 443;
			Static262.anInt4960 = 43594;
		} else if (Static15.method462(Static356.aClass238_6)) {
			Static266.aString50 = this.getCodeBase().getHost();
			Static301.anInt5507 = Static166.anInt3532 + 50000;
			Static262.anInt4960 = Static166.anInt3532 + 40000;
		} else if (Static212.aClass238_2 == Static356.aClass238_6) {
			Static301.anInt5507 = Static166.anInt3532 + 50000;
			Static266.aString50 = "127.0.0.1";
			Static262.anInt4960 = Static166.anInt3532 + 40000;
		}
		Static324.aString2 = Static266.aString50;
		Static14.anInt470 = Static262.anInt4960;
		Static324.anInt423 = Static301.anInt5507;
		Static446.anInt7542 = Static262.anInt4960;
		Static178.anInt3626 = Static446.anInt7542;
		Static368.aShortArray85 = Static442.aShortArray116 = Static294.aShortArray68 = Static306.aShortArray73 = new short[256];
		if (Static69.aClass89_1 == Static114.aClass89_2) {
			Static93.aBoolean163 = true;
			Static97.aShortArray38 = Static233.aShortArray53;
			Static46.anInt1156 = 16777215;
			Static409.aShortArrayArray6 = Static140.aShortArrayArray3;
			Static427.aShortArrayArray7 = Static353.aShortArrayArray4;
			Static33.aShortArray3 = Static405.aShortArray88;
			Static314.anInt5710 = 0;
		} else {
			Static97.aShortArray38 = Static233.aShortArray54;
			Static33.aShortArray3 = Static125.aShortArray2;
			Static409.aShortArrayArray6 = Static34.aShortArrayArray1;
			Static427.aShortArrayArray7 = Static403.aShortArrayArray5;
		}
		if (Static162.anInt3462 == 3) {
			Static379.anInt2076 = Static166.anInt3532;
		}
		Static19.aClass16_1 = Static129.method2235(Static351.aCanvas6);
		Static155.aClass74_1 = Static122.method2162(Static351.aCanvas6);
		Static166.aClass72_1 = Static335.method4864();
		if (Static166.aClass72_1 != null) {
			Static166.aClass72_1.method2812(Static351.aCanvas6);
		}
		Static190.anInt3826 = Static162.anInt3462;
		try {
			if (Static295.aClass103_5.aClass203_2 != null) {
				Static101.aClass240_3 = new Class240(Static295.aClass103_5.aClass203_2, 5200, 0);
				for (@Pc(170) int local170 = 0; local170 < 30; local170++) {
					Static193.aClass240Array5[local170] = new Class240(Static295.aClass103_5.aClass203Array1[local170], 6000, 0);
				}
				Static352.aClass240_8 = new Class240(Static295.aClass103_5.aClass203_3, 6000, 0);
				Static349.aClass117_27 = new Class117(255, Static101.aClass240_3, Static352.aClass240_8, 500000);
				Static139.aClass240_5 = new Class240(Static295.aClass103_5.aClass203_1, 24, 0);
				Static295.aClass103_5.aClass203Array1 = null;
				Static295.aClass103_5.aClass203_2 = null;
				Static295.aClass103_5.aClass203_3 = null;
				Static295.aClass103_5.aClass203_1 = null;
			}
		} catch (@Pc(226) IOException local226) {
			Static349.aClass117_27 = null;
			Static352.aClass240_8 = null;
			Static101.aClass240_3 = null;
			Static139.aClass240_5 = null;
		}
		if (Static411.aClass238_7 != Static356.aClass238_6) {
			Static156.aBoolean259 = true;
		}
		Static407.aString64 = (Static114.aClass89_2 == Static436.aClass89_3 ? Static258.aClass175_244 : Static102.aClass175_23).method4201(Static216.anInt4257);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1168() {
		@Pc(7) boolean local7 = Static215.aClass183_2.method4501();
		if (!local7) {
			this.method1165();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1169(@OriginalArg(0) int arg0) {
		Static282.anInt5194 = 0;
		Static215.aClass183_2.anInt5590 = arg0;
		Static215.aClass183_2.anInt5589++;
		Static225.aClass27_2 = null;
		Static401.aClass190_9 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1139() {
		if (Static184.aBoolean290) {
			Static364.method5135();
		}
		if (Static266.aClass75_7 != null) {
			Static266.aClass75_7.method2608();
		}
		if (Static342.aFrame2 != null) {
			Static180.method3068(Static342.aFrame2, Static295.aClass103_5);
			Static342.aFrame2 = null;
		}
		if (Static122.aClass27_1 != null) {
			Static122.aClass27_1.method893();
			Static122.aClass27_1 = null;
		}
		if (Static166.aClass72_1 != null) {
			Static166.aClass72_1.method2815(Static351.aCanvas6);
		}
		Static166.aClass72_1 = null;
		Static323.method4693();
		Static215.aClass183_2.method4500();
		Static213.aClass15_2.method567();
		if (Static159.aClass66_1 != null) {
			Static159.aClass66_1.method1637();
			Static159.aClass66_1 = null;
		}
	}
}
