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

	static {
		new Class34("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
		new Class34("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static200.method3815("argument count");
			}
			Static311.anInt6073 = Integer.parseInt(arg0[0]);
			Static63.anInt5669 = 2;
			if (arg0[1].equals("live")) {
				Static120.anInt2757 = 0;
			} else if (arg0[1].equals("rc")) {
				Static120.anInt2757 = 1;
			} else if (arg0[1].equals("wip")) {
				Static120.anInt2757 = 2;
			} else {
				Static200.method3815("modewhat");
			}
			Static259.anInt2907 = Static58.method1502(arg0[2]);
			if (Static259.anInt2907 == -1) {
				if (arg0[2].equals("english")) {
					Static259.anInt2907 = 0;
				} else if (arg0[2].equals("german")) {
					Static259.anInt2907 = 1;
				} else {
					Static200.method3815("language");
				}
			}
			Static141.aBoolean617 = false;
			Static148.aBoolean313 = false;
			if (arg0[3].equals("game0")) {
				Static8.anInt5875 = 0;
			} else if (arg0[3].equals("game1")) {
				Static8.anInt5875 = 1;
			} else {
				Static200.method3815("game");
			}
			Static170.anInt3644 = Static8.anInt5875;
			Static163.anInt3550 = 0;
			Static91.anInt2289 = 0;
			Static158.aString33 = "";
			@Pc(123) client local123 = new client();
			Static93.aClient1 = local123;
			local123.method996(Static120.anInt2757 + 32, Static8.anInt5875 == 1 ? "stellardawn" : "runescape");
			Static84.aFrame1.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static109.method2355(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1015() {
		if (Static75.anInt1967 < Static283.aClass186_3.anInt5720) {
			Static153.anInt3377 = (Static283.aClass186_3.anInt5720 - 1) * 5 * 50;
			if (Static266.anInt5404 == Static274.anInt5608) {
				Static274.anInt5608 = Static286.anInt5727;
			} else {
				Static274.anInt5608 = Static266.anInt5404;
			}
			if (Static153.anInt3377 > 3000) {
				Static153.anInt3377 = 3000;
			}
			if (Static283.aClass186_3.anInt5720 >= 2 && Static283.aClass186_3.anInt5721 == 6) {
				this.method995("js5connect_outofdate");
				Static295.anInt5811 = 1000;
				return;
			}
			if (Static283.aClass186_3.anInt5720 >= 4 && Static283.aClass186_3.anInt5721 == -1) {
				this.method995("js5crc");
				Static295.anInt5811 = 1000;
				return;
			}
			if (Static283.aClass186_3.anInt5720 >= 4 && (Static295.anInt5811 == 0 || Static295.anInt5811 == 5)) {
				if (Static283.aClass186_3.anInt5721 == 7 || Static283.aClass186_3.anInt5721 == 9) {
					this.method995("js5connect_full");
				} else if (Static283.aClass186_3.anInt5721 > 0) {
					this.method995("js5connect");
				} else {
					this.method995("js5io");
				}
				Static295.anInt5811 = 1000;
				return;
			}
		}
		Static75.anInt1967 = Static283.aClass186_3.anInt5720;
		if (Static153.anInt3377 > 0) {
			Static153.anInt3377--;
			return;
		}
		try {
			if (Static332.anInt6393 == 0) {
				Static86.aClass162_3 = Static15.aClass143_1.method3889(Static274.anInt5608, Static114.aString46);
				Static332.anInt6393++;
			}
			if (Static332.anInt6393 == 1) {
				if (Static86.aClass162_3.anInt4801 == 2) {
					this.method1021(1000);
					return;
				}
				if (Static86.aClass162_3.anInt4801 == 1) {
					Static332.anInt6393++;
				}
			}
			if (Static332.anInt6393 == 2) {
				Static314.aClass148_4 = new Class148((Socket) Static86.aClass162_3.anObject5, Static15.aClass143_1);
				@Pc(184) Class1_Sub8 local184 = new Class1_Sub8(5);
				local184.method4562(15);
				local184.method4529(568);
				Static314.aClass148_4.method4122(5, local184.aByteArray81);
				Static332.anInt6393++;
				Static149.aLong107 = Static162.method3252();
			}
			if (Static332.anInt6393 == 3) {
				if (Static295.anInt5811 == 0 || Static295.anInt5811 == 5 || Static314.aClass148_4.method4125() > 0) {
					@Pc(240) int local240 = Static314.aClass148_4.method4127();
					if (local240 != 0) {
						this.method1021(local240);
						return;
					}
					Static332.anInt6393++;
				} else if (Static162.method3252() - Static149.aLong107 > 30000L) {
					this.method1021(1001);
					return;
				}
			}
			if (Static332.anInt6393 == 4) {
				@Pc(269) boolean local269 = Static295.anInt5811 == 5 || Static295.anInt5811 == 10 || Static295.anInt5811 == 28;
				Static283.aClass186_3.method4887(Static314.aClass148_4, !local269);
				Static86.aClass162_3 = null;
				Static332.anInt6393 = 0;
				Static314.aClass148_4 = null;
			}
		} catch (@Pc(286) IOException local286) {
			this.method1021(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1007() {
		if (Static7.aBoolean29) {
			Static119.method2550();
		}
		if (Static208.aClass32_11 != null) {
			Static208.aClass32_11.method2197();
		}
		if (Static197.aFrame2 != null) {
			Static197.method3801(Static15.aClass143_1, Static197.aFrame2);
			Static197.aFrame2 = null;
		}
		if (Static7.aClass148_1 != null) {
			Static7.aClass148_1.method4123();
			Static7.aClass148_1 = null;
		}
		if (Static188.aClass155_1 != null) {
			Static188.aClass155_1.method5337(Static349.aCanvas5);
		}
		Static188.aClass155_1 = null;
		if (Static129.aClass7_2 != null) {
			Static129.aClass7_2.method5548();
		}
		if (Static88.aClass7_1 != null) {
			Static88.aClass7_1.method5548();
		}
		Static283.aClass186_3.method4886();
		Static31.aClass211_1.method5433();
		if (Static254.aClass131_1 != null) {
			Static254.aClass131_1.method3602();
			Static254.aClass131_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1017() {
		Static303.anInt2311++;
		Static163.method3262(null, -1, -1);
		Static13.method382(null, -1, -1);
		Static216.method4128();
		Static314.anInt6116++;
		for (@Pc(33) int local33 = 0; local33 < 32768; local33++) {
			@Pc(39) Class17_Sub1_Sub1_Sub2 local39 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local33];
			if (local39 != null) {
				@Pc(45) byte local45 = local39.aClass213_1.aByte75;
				if ((local45 & 0x1) != 0) {
					@Pc(53) int local53 = local39.method4318();
					@Pc(77) int local77;
					if ((local45 & 0x2) != 0 && local39.anInt4893 == 0 && Math.random() * 1000.0D < 10.0D) {
						local77 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(85) int local85 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local77 != 0 || local85 != 0) {
							@Pc(102) int local102 = local77 + local39.anIntArray438[0];
							if (local102 < 0) {
								local102 = 0;
							} else if (local102 > Static233.anInt5573 - local53 - 1) {
								local102 = Static233.anInt5573 - local53 - 1;
							}
							@Pc(133) int local133 = local85 + local39.anIntArray439[0];
							if (local133 < 0) {
								local133 = 0;
							} else if (Static134.anInt2971 - local53 - 1 < local133) {
								local133 = Static134.anInt2971 - local53 - 1;
							}
							@Pc(184) int local184 = Static182.method3600(local53, Static218.anIntArray413, 0, true, local39.anIntArray438[0], local53, Static166.anIntArray328, -1, Static29.aClass71Array1[local39.aByte51], local39.anIntArray439[0], local53, local133, local102, 0);
							if (local184 > 0) {
								if (local184 > 9) {
									local184 = 9;
								}
								for (@Pc(196) int local196 = 0; local196 < local184; local196++) {
									local39.anIntArray438[local196] = Static218.anIntArray413[local184 - local196 - 1];
									local39.anIntArray439[local196] = Static166.anIntArray328[local184 - local196 - 1];
									local39.aByteArray78[local196] = 1;
								}
								local39.anInt4893 = local184;
							}
						}
					}
					Static6.method248(local39, true);
					local77 = Static313.method5182(local39);
					Static1.method59(Static126.anInt2822, Static318.anInt6132, local39, local77);
					Static143.method2868(local39);
				}
			}
		}
		if (Static64.anInt1792 == 0 && Static130.anInt2868 == 0) {
			if (Static147.anInt3204 == 2) {
				Static213.method4102();
			} else {
				Static340.method5487();
			}
			if (Static320.anInt5326 >> 7 < 14 || Static320.anInt5326 >> 7 >= Static233.anInt5573 - 14 || Static64.anInt1797 >> 7 < 14 || Static134.anInt2971 - 14 <= Static64.anInt1797 >> 7) {
				Static305.method5134();
			}
		}
		while (true) {
			@Pc(307) Class1_Sub16 local307;
			@Pc(312) Class12 local312;
			@Pc(320) Class12 local320;
			do {
				local307 = (Class1_Sub16) Static230.aClass16_27.method408();
				if (local307 == null) {
					while (true) {
						do {
							local307 = (Class1_Sub16) Static197.aClass16_25.method408();
							if (local307 == null) {
								while (true) {
									do {
										local307 = (Class1_Sub16) Static247.aClass16_28.method408();
										if (local307 == null) {
											if (Static28.aClass12_3 != null) {
												Static23.method661();
											}
											if (Static5.anInt208 % 1500 == 0) {
												Static53.method1370();
											}
											Static39.method915();
											if (Static7.aBoolean29 && Static162.method3252() - 60000L > Static264.aLong202) {
												Static119.method2550();
												return;
											}
											return;
										}
										local312 = local307.aClass12_5;
										if (local312.anInt410 < 0) {
											break;
										}
										local320 = Static9.method319(local312.anInt459);
									} while (local320 == null || local320.aClass12Array3 == null || local320.aClass12Array3.length <= local312.anInt410 || local320.aClass12Array3[local312.anInt410] != local312);
									Static196.method3777(local307);
								}
							}
							local312 = local307.aClass12_5;
							if (local312.anInt410 < 0) {
								break;
							}
							local320 = Static9.method319(local312.anInt459);
						} while (local320 == null || local320.aClass12Array3 == null || local312.anInt410 >= local320.aClass12Array3.length || local320.aClass12Array3[local312.anInt410] != local312);
						Static196.method3777(local307);
					}
				}
				local312 = local307.aClass12_5;
				if (local312.anInt410 < 0) {
					break;
				}
				local320 = Static9.method319(local312.anInt459);
			} while (local320 == null || local320.aClass12Array3 == null || local312.anInt410 >= local320.aClass12Array3.length || local312 != local320.aClass12Array3[local312.anInt410]);
			Static196.method3777(local307);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1018() {
		@Pc(5) int local5;
		if (!Static45.aBoolean140) {
			for (local5 = 0; local5 < Static111.anInt2598; local5++) {
				if (Static256.aClass85Array1[local5].method2443() == 's' || Static256.aClass85Array1[local5].method2443() == 'S') {
					Static45.aBoolean140 = true;
					break;
				}
			}
		}
		@Pc(53) int local53;
		if (Static170.anInt3653 == 0) {
			@Pc(43) Runtime local43 = Runtime.getRuntime();
			local53 = (int) ((local43.totalMemory() - local43.freeMemory()) / 1024L);
			@Pc(56) long local56 = Static162.method3252();
			if (Static191.aLong129 == 0L) {
				Static191.aLong129 = local56;
			}
			if (local53 > 16384 && local56 - Static191.aLong129 < 5000L) {
				if (local56 - Static241.aLong147 > 1000L) {
					System.gc();
					Static241.aLong147 = local56;
				}
				Static307.aString59 = Static2.aClass34_1.method1285(Static259.anInt2907);
				Static237.anInt4904 = 5;
			} else {
				Static307.aString59 = Static3.aClass34_2.method1285(Static259.anInt2907);
				Static170.anInt3653 = 10;
				Static237.anInt4904 = 5;
			}
		} else if (Static170.anInt3653 == 10) {
			for (local5 = 0; local5 < 4; local5++) {
				Static29.aClass71Array1[local5] = Static193.method3722(Static134.anInt2971, Static233.anInt5573);
			}
			Static307.aString59 = Static353.aClass34_195.method1285(Static259.anInt2907);
			Static170.anInt3653 = 20;
			Static237.anInt4904 = 10;
		} else if (Static170.anInt3653 == 20) {
			if (Static125.aClass163_1 == null) {
				Static125.aClass163_1 = new Class163(Static283.aClass186_3, Static31.aClass211_1);
			}
			if (Static125.aClass163_1.method4341()) {
				Static344.aClass216_96 = Static253.method4594(false, 0, true);
				Static203.aClass216_67 = Static253.method4594(false, 1, true);
				Static191.aClass216_62 = Static253.method4594(false, 2, true);
				Static14.aClass216_1 = Static253.method4594(false, 3, true);
				Static309.aClass216_93 = Static253.method4594(false, 4, true);
				Static24.aClass216_6 = Static253.method4594(true, 5, true);
				Static228.aClass216_78 = Static253.method4594(true, 6, false);
				Static56.aClass216_17 = Static253.method4594(false, 7, true);
				Static193.aClass216_64 = Static253.method4594(false, 8, true);
				Static47.aClass216_12 = Static253.method4594(false, 9, true);
				Static260.aClass216_88 = Static253.method4594(false, 10, true);
				Static44.aClass216_10 = Static253.method4594(false, 11, true);
				Static124.aClass216_43 = Static253.method4594(false, 12, true);
				Static34.aClass216_8 = Static253.method4594(false, 13, true);
				Static31.aClass216_7 = Static253.method4594(false, 14, false);
				Static75.aClass216_29 = Static253.method4594(false, 15, true);
				Static99.aClass216_33 = Static253.method4594(false, 16, true);
				Static121.aClass216_41 = Static253.method4594(false, 17, true);
				Static53.aClass216_14 = Static253.method4594(false, 18, true);
				Static208.aClass216_69 = Static253.method4594(false, 19, true);
				Static261.aClass216_19 = Static253.method4594(false, 20, true);
				Static88.aClass216_32 = Static253.method4594(false, 21, true);
				Static16.aClass216_4 = Static253.method4594(false, 22, true);
				Static312.aClass216_74 = Static253.method4594(true, 23, true);
				Static271.aClass216_86 = Static253.method4594(false, 24, true);
				Static211.aClass216_70 = Static253.method4594(false, 25, true);
				Static351.aClass216_98 = Static253.method4594(true, 26, true);
				Static297.aClass216_91 = Static253.method4594(false, 27, true);
				Static232.aClass216_81 = Static253.method4594(true, 28, true);
				Static307.aString59 = Static339.aClass34_187.method1285(Static259.anInt2907);
				Static170.anInt3653 = 30;
				Static237.anInt4904 = 15;
			} else {
				Static307.aString59 = Static47.aClass34_35.method1285(Static259.anInt2907);
				Static237.anInt4904 = 12;
			}
		} else if (Static170.anInt3653 == 30) {
			local5 = 0;
			for (local53 = 0; local53 < 29; local53++) {
				local5 += Static114.aClass51_Sub1Array4[local53].method4881() * Static279.anIntArray475[local53] / 100;
			}
			if (local5 == 100) {
				Static307.aString59 = Static39.aClass34_27.method1285(Static259.anInt2907);
				Static237.anInt4904 = 20;
				Static212.method4087(Static193.aClass216_64);
				Static348.method5580(Static193.aClass216_64);
				Static170.anInt3653 = 40;
			} else {
				if (local5 != 0) {
					Static307.aString59 = Static247.aClass34_146.method1285(Static259.anInt2907) + local5 + "%";
				}
				Static237.anInt4904 = 20;
			}
		} else if (Static170.anInt3653 == 40) {
			if (Static232.aClass216_81.method5658()) {
				this.method1031(Static232.aClass216_81.method5659(1));
				Static307.aString59 = Static299.aClass34_31.method1285(Static259.anInt2907);
				Static170.anInt3653 = 50;
				Static237.anInt4904 = 25;
			} else {
				Static307.aString59 = Static133.aClass34_95.method1285(Static259.anInt2907) + Static232.aClass216_81.method5677() + "%";
				Static237.anInt4904 = 25;
			}
		} else if (Static170.anInt3653 == 50) {
			Static12.method359(Static259.aBoolean281);
			Static328.aClass1_Sub1_Sub1_3 = new Class1_Sub1_Sub1();
			Static328.aClass1_Sub1_Sub1_3.method58();
			Static129.aClass7_2 = Static244.method4381(Static349.aCanvas5, 22050, Static15.aClass143_1, 0);
			Static129.aClass7_2.method5555(Static328.aClass1_Sub1_Sub1_3);
			Static167.method3362(Static328.aClass1_Sub1_Sub1_3, Static31.aClass216_7, Static75.aClass216_29, Static309.aClass216_93);
			Static88.aClass7_1 = Static244.method4381(Static349.aCanvas5, 2048, Static15.aClass143_1, 1);
			Static145.aClass1_Sub1_Sub4_1 = new Class1_Sub1_Sub4();
			Static88.aClass7_1.method5555(Static145.aClass1_Sub1_Sub4_1);
			Static278.aClass95_1 = new Class95(22050, Static38.anInt1250);
			Static211.anInt4525 = Static228.aClass216_78.method5660("scape main");
			Static307.aString59 = Static352.aClass34_194.method1285(Static259.anInt2907);
			Static237.anInt4904 = 30;
			Static170.anInt3653 = 60;
		} else if (Static170.anInt3653 == 60) {
			local5 = Static113.method2450(Static34.aClass216_8, Static193.aClass216_64);
			local53 = Static252.method4572();
			if (local53 > local5) {
				Static307.aString59 = Static38.aClass34_26.method1285(Static259.anInt2907) + local5 * 100 / local53 + "%";
				Static237.anInt4904 = 35;
			} else {
				Static307.aString59 = Static113.aClass34_83.method1285(Static259.anInt2907);
				Static170.anInt3653 = 70;
				Static237.anInt4904 = 35;
			}
		} else if (Static170.anInt3653 == 70) {
			local5 = Static83.method1817(Static193.aClass216_64);
			local53 = Static31.method800();
			if (local53 > local5) {
				Static307.aString59 = Static100.aClass34_133.method1285(Static259.anInt2907) + local5 * 100 / local53 + "%";
				Static237.anInt4904 = 40;
			} else {
				Static307.aString59 = Static290.aClass34_160.method1285(Static259.anInt2907);
				Static170.anInt3653 = 80;
				Static237.anInt4904 = 40;
			}
		} else if (Static170.anInt3653 == 80) {
			if (Static351.aClass216_98.method5658()) {
				Static357.anInterface2_7 = new Class158(Static351.aClass216_98, Static47.aClass216_12, Static193.aClass216_64);
				Static307.aString59 = Static178.aClass34_112.method1285(Static259.anInt2907);
				Static237.anInt4904 = 45;
				Static170.anInt3653 = 90;
			} else {
				Static307.aString59 = Static301.aClass34_168.method1285(Static259.anInt2907) + Static351.aClass216_98.method5677() + "%";
				Static237.anInt4904 = 45;
			}
		} else if (Static170.anInt3653 == 90) {
			Static307.aString59 = Static175.aClass34_111.method1285(Static259.anInt2907);
			Static170.anInt3653 = 95;
			Static237.anInt4904 = 50;
		} else if (Static170.anInt3653 == 95) {
			if (Static45.aBoolean140) {
				Static324.anInt6232 = 0;
				Static204.anInt4306 = 0;
				Static322.anInt6180 = 0;
				Static279.anInt5666 = 0;
				Static168.anInt3612 = 1;
			}
			Static45.aBoolean140 = true;
			Static348.method5579(Static15.aClass143_1);
			Static146.method2932();
			Static173.method3437(Static204.anInt4306, false);
			Static307.aString59 = Static123.aClass34_87.method1285(Static259.anInt2907);
			Static237.anInt4904 = 55;
			Static170.anInt3653 = 100;
		} else if (Static170.anInt3653 == 100) {
			Static133.method2751(Static208.aClass32_11, Static193.aClass216_64, Static34.aClass216_8);
			Static307.aString59 = Static154.aClass34_107.method1285(Static259.anInt2907);
			Static237.anInt4904 = 60;
			Static232.method4269(5);
			Static170.anInt3653 = 110;
		} else if (Static170.anInt3653 == 110) {
			Static191.aClass216_62.method5658();
			local5 = Static191.aClass216_62.method5677();
			Static99.aClass216_33.method5658();
			local5 += Static99.aClass216_33.method5677();
			Static121.aClass216_41.method5658();
			local5 += Static121.aClass216_41.method5677();
			Static53.aClass216_14.method5658();
			local5 += Static53.aClass216_14.method5677();
			Static208.aClass216_69.method5658();
			local5 += Static208.aClass216_69.method5677();
			Static261.aClass216_19.method5658();
			local5 += Static261.aClass216_19.method5677();
			Static88.aClass216_32.method5658();
			local5 += Static88.aClass216_32.method5677();
			Static16.aClass216_4.method5658();
			local5 += Static16.aClass216_4.method5677();
			Static271.aClass216_86.method5658();
			local5 += Static271.aClass216_86.method5677();
			Static211.aClass216_70.method5658();
			local5 += Static211.aClass216_70.method5677();
			Static297.aClass216_91.method5658();
			local5 += Static297.aClass216_91.method5677();
			if (local5 < 1100) {
				Static307.aString59 = Static111.aClass34_79.method1285(Static259.anInt2907) + local5 / 11 + "%";
				Static237.anInt4904 = 65;
			} else {
				Static354.method5640(Static191.aClass216_62);
				Static96.method5291(Static191.aClass216_62);
				Static237.method4339(Static191.aClass216_62);
				Static312.method4115(Static56.aClass216_17, Static191.aClass216_62);
				Static262.method4654(Static56.aClass216_17, Static99.aClass216_33, Static259.anInt2907);
				Static309.method5162(Static53.aClass216_14, Static56.aClass216_17, Static259.anInt2907);
				Static59.method1511(Static208.aClass216_69, Static259.anInt2907, Static56.aClass216_17);
				Static255.method4602(Static191.aClass216_62);
				Static149.method2985(Static203.aClass216_67, Static344.aClass216_96, Static261.aClass216_19);
				Static95.method2045(Static191.aClass216_62);
				Static219.method4142(Static56.aClass216_17, Static88.aClass216_32);
				Static314.method5203(Static16.aClass216_4);
				Static18.method434(Static191.aClass216_62);
				Static290.method4931(Static14.aClass216_1, Static56.aClass216_17, Static34.aClass216_8, Static193.aClass216_64);
				Static150.method2996(Static191.aClass216_62);
				Static176.method3474(Static121.aClass216_41);
				Static253.method4589(Static211.aClass216_70, new Class27(), Static271.aClass216_86);
				Static123.method2594(Static271.aClass216_86, Static211.aClass216_70);
				Static78.method1762(Static191.aClass216_62);
				Static294.method4963(Static191.aClass216_62);
				Static75.method1714(Static191.aClass216_62);
				Static17.method422(Static191.aClass216_62, Static193.aClass216_64);
				Static335.method5430(Static191.aClass216_62, Static193.aClass216_64);
				Static266.method4685(Static191.aClass216_62);
				Static213.method4104(Static193.aClass216_64, Static191.aClass216_62);
				Static120.method2554(Static191.aClass216_62);
				Static271.method4753(Static191.aClass216_62);
				Static307.aString59 = Static96.aClass34_179.method1285(Static259.anInt2907);
				Static237.anInt4904 = 65;
				Static2.method63();
				Static170.anInt3653 = 120;
			}
		} else if (Static170.anInt3653 == 120) {
			local5 = Static236.method2131(Static193.aClass216_64);
			local53 = Static355.method5662();
			if (local53 > local5) {
				Static307.aString59 = Static287.aClass34_159.method1285(Static259.anInt2907) + local5 * 100 / local53 + "%";
				Static237.anInt4904 = 70;
			} else {
				Static327.method5309(Static193.aClass216_64, Static208.aClass32_11);
				Static26.method722(Static163.aClass5Array13);
				Static307.aString59 = Static266.aClass34_151.method1285(Static259.anInt2907);
				Static237.anInt4904 = 70;
				Static170.anInt3653 = 130;
			}
		} else if (Static170.anInt3653 == 130) {
			Static307.aString59 = Static111.aClass34_78.method1285(Static259.anInt2907);
			Static170.anInt3653 = 140;
			Static237.anInt4904 = 75;
		} else if (Static170.anInt3653 == 140) {
			if (Static260.aClass216_88.method5652("huffman", "")) {
				@Pc(1168) Class55 local1168 = new Class55(Static260.aClass216_88.method5654("huffman", ""));
				Static39.method916(local1168);
				Static307.aString59 = Static292.aClass34_136.method1285(Static259.anInt2907);
				Static170.anInt3653 = 150;
				Static237.anInt4904 = 80;
			} else {
				Static307.aString59 = Static281.aClass34_158.method1285(Static259.anInt2907) + "0%";
				Static237.anInt4904 = 80;
			}
		} else if (Static170.anInt3653 == 150) {
			if (!Static14.aClass216_1.method5658()) {
				Static307.aString59 = Static291.aClass34_161.method1285(Static259.anInt2907) + Static14.aClass216_1.method5677() * 3 / 4 + "%";
				Static237.anInt4904 = 85;
			} else if (!Static124.aClass216_43.method5658()) {
				Static307.aString59 = Static291.aClass34_161.method1285(Static259.anInt2907) + (Static124.aClass216_43.method5677() / 10 + 75) + "%";
				Static237.anInt4904 = 85;
			} else if (!Static34.aClass216_8.method5658()) {
				Static307.aString59 = Static291.aClass34_161.method1285(Static259.anInt2907) + (Static34.aClass216_8.method5677() / 20 + 85) + "%";
				Static237.anInt4904 = 85;
			} else if (Static312.aClass216_74.method5672("details")) {
				Static79.method3764(Static312.aClass216_74);
				Static176.method3475(Static297.aClass216_91);
				Static353.method5622(Static56.aClass216_17, Static357.anInterface2_7);
				Static307.aString59 = Static113.aClass34_84.method1285(Static259.anInt2907);
				Static170.anInt3653 = 160;
				Static237.anInt4904 = 85;
			} else {
				Static307.aString59 = Static291.aClass34_161.method1285(Static259.anInt2907) + (Static312.aClass216_74.method5644("details") / 10 + 90) + "%";
				Static237.anInt4904 = 85;
			}
		} else if (Static170.anInt3653 == 160) {
			local5 = Static298.method4994();
			if (local5 == -1) {
				Static307.aString59 = Static70.aClass34_54.method1285(Static259.anInt2907);
				Static237.anInt4904 = 90;
			} else if (local5 == 7 || local5 == 9) {
				this.method995("worldlistfull");
				Static232.method4269(1000);
			} else if (Static195.aBoolean384) {
				Static307.aString59 = Static67.aClass34_53.method1285(Static259.anInt2907);
				Static170.anInt3653 = 170;
				Static237.anInt4904 = 90;
			} else {
				this.method995("worldlistio_" + local5);
				Static232.method4269(1000);
			}
		} else if (Static170.anInt3653 == 170) {
			Static95.aStringArray21 = new String[Static125.anInt2817];
			Static197.aBooleanArray20 = new boolean[Static279.anInt5665];
			Static183.anIntArray351 = new int[Static279.anInt5665];
			for (local5 = 0; local5 < Static279.anInt5665; local5++) {
				if (Static267.method4698(local5).anInt572 == 0) {
					Static197.aBooleanArray20[local5] = true;
					Static293.anInt5772++;
				}
				Static183.anIntArray351[local5] = -1;
			}
			Static282.method5525();
			Static46.anInt1502 = Static14.aClass216_1.method5660("loginscreen");
			Static24.aClass216_6.method5653(false);
			Static228.aClass216_78.method5653(true);
			Static193.aClass216_64.method5653(true);
			Static34.aClass216_8.method5653(true);
			Static260.aClass216_88.method5653(true);
			Static14.aClass216_1.method5653(true);
			Static211.aBoolean429 = true;
			Static191.aClass216_62.anInt6797 = 2;
			Static121.aClass216_41.anInt6797 = 2;
			Static99.aClass216_33.anInt6797 = 2;
			Static53.aClass216_14.anInt6797 = 2;
			Static208.aClass216_69.anInt6797 = 2;
			Static261.aClass216_19.anInt6797 = 2;
			Static88.aClass216_32.anInt6797 = 2;
			Static30.method888(-1, -1, Static168.anInt3612, false);
			Static307.aString59 = Static266.aClass34_152.method1285(Static259.anInt2907);
			Static170.anInt3653 = 180;
			Static237.anInt4904 = 95;
		} else if (Static170.anInt3653 == 180) {
			Static112.method2422(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1011() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static244.method4382();
		Static31.aClass211_1 = new Class211(Static15.aClass143_1);
		Static283.aClass186_3 = new Class186();
		if (Static120.anInt2757 != 0) {
			Static264.aByteArrayArray24 = new byte[50][];
		}
		Static351.method5605(Static15.aClass143_1);
		if (Static63.anInt5669 == 0) {
			Static31.aString16 = this.getCodeBase().getHost();
			Static41.anInt1308 = 43594;
			Static233.anInt5576 = 443;
		} else if (Static63.anInt5669 == 1) {
			Static31.aString16 = this.getCodeBase().getHost();
			Static233.anInt5576 = Static311.anInt6073 + 50000;
			Static41.anInt1308 = Static311.anInt6073 + 40000;
		} else if (Static63.anInt5669 == 2) {
			Static41.anInt1308 = Static311.anInt6073 + 40000;
			Static233.anInt5576 = Static311.anInt6073 + 50000;
			Static31.aString16 = "127.0.0.1";
		}
		Static286.anInt5727 = Static233.anInt5576;
		Static266.anInt5404 = Static41.anInt1308;
		Static154.anInt3393 = Static41.anInt1308;
		Static114.aString46 = Static31.aString16;
		if (Static207.anInt4332 == 3) {
			Static292.anInt4638 = Static311.anInt6073;
		}
		Static53.aShortArray11 = Static274.aShortArray112 = Static54.aShortArray12 = Static15.aShortArray2 = new short[256];
		Static274.anInt5608 = Static154.anInt3393;
		if (Static8.anInt5875 == 1) {
			Static71.aShortArray70 = Static209.aShortArray95;
			Static39.aBoolean120 = true;
			Static47.anInt1511 = 0;
			Static144.aShortArray58 = Static72.aShortArray33;
			Static156.aShortArrayArray3 = Static325.aShortArrayArray6;
			Static148.anInt3242 = 16777215;
			Static331.aShortArrayArray7 = Static119.aShortArrayArray2;
		} else {
			Static331.aShortArrayArray7 = Static319.aShortArrayArray5;
			Static71.aShortArray70 = Static171.aShortArray83;
			Static156.aShortArrayArray3 = Static210.aShortArrayArray4;
			Static144.aShortArray58 = Static71.aShortArray71;
		}
		Static57.aClass171_1 = Static33.method812(Static349.aCanvas5);
		Static222.aClass84_1 = Static51.method1315(Static349.aCanvas5);
		Static188.aClass155_1 = Static108.method2335();
		if (Static188.aClass155_1 != null) {
			Static188.aClass155_1.method5334(Static349.aCanvas5);
		}
		Static321.anInt6172 = Static207.anInt4332;
		try {
			if (Static15.aClass143_1.aClass90_3 != null) {
				Static167.aClass190_1 = new Class190(Static15.aClass143_1.aClass90_3, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Static231.aClass190Array1[local171] = new Class190(Static15.aClass143_1.aClass90Array1[local171], 6000, 0);
				}
				Static328.aClass190_4 = new Class190(Static15.aClass143_1.aClass90_2, 6000, 0);
				Static216.aClass166_2 = new Class166(255, Static167.aClass190_1, Static328.aClass190_4, 500000);
				Static349.aClass190_5 = new Class190(Static15.aClass143_1.aClass90_1, 24, 0);
				Static15.aClass143_1.aClass90_3 = null;
				Static15.aClass143_1.aClass90Array1 = null;
				Static15.aClass143_1.aClass90_1 = null;
				Static15.aClass143_1.aClass90_2 = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static349.aClass190_5 = null;
			Static328.aClass190_4 = null;
			Static167.aClass190_1 = null;
			Static216.aClass166_2 = null;
		}
		if (Static63.anInt5669 != 0) {
			Static33.aBoolean105 = true;
		}
		if (Static8.anInt5875 == 0) {
			Static267.aString54 = Static202.aClass34_129.method1285(Static259.anInt2907);
		} else if (Static8.anInt5875 == 1) {
			Static267.aString54 = Static27.aClass34_21.method1285(Static259.anInt2907);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method993() {
		if (Static295.anInt5811 == 1000) {
			return;
		}
		Static5.anInt208++;
		if (Static5.anInt208 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static148.anInt3246 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static329.aRandom1.setSeed((long) Static148.anInt3246);
		}
		this.method1025();
		if (Static125.aClass163_1 != null) {
			Static125.aClass163_1.method4344();
		}
		Static202.method3826();
		Static63.method4863();
		Static57.aClass171_1.method4640();
		Static222.aClass84_1.method5415();
		if (Static188.aClass155_1 != null) {
			@Pc(76) int local76 = Static188.aClass155_1.method5339();
			Static195.anInt4169 = local76;
		}
		if (Static208.aClass32_11 != null) {
			Static208.aClass32_11.method2158((int) Static162.method3252());
		}
		Static46.method1282();
		Static111.anInt2598 = 0;
		for (@Pc(100) Class85 local100 = Static57.aClass171_1.method4633(); local100 != null && Static111.anInt2598 < 128; local100 = Static57.aClass171_1.method4633()) {
			if (local100.method2441() != 1) {
				@Pc(111) char local111 = local100.method2443();
				if (!Static271.method4748() || local111 != '`' && local111 != '§') {
					Static256.aClass85Array1[Static111.anInt2598] = local100;
					Static111.anInt2598++;
				} else if (Static58.method1505()) {
					Static83.method1819();
				} else {
					Static64.method1568();
				}
			}
		}
		Static305.aClass1_Sub21_1 = null;
		for (@Pc(160) Class1_Sub21 local160 = Static222.aClass84_1.method5419(); local160 != null; local160 = Static222.aClass84_1.method5419()) {
			@Pc(166) int local166 = local160.method2701();
			if (local166 == -1) {
				Static185.aClass16_21.method416(local160);
			} else if (Static301.method5088(local166)) {
				Static305.aClass1_Sub21_1 = local160;
			}
		}
		if (Static58.method1505()) {
			Static241.method4371();
		}
		if (Static295.anInt5811 == 0) {
			this.method1018();
			Static214.method4111();
		} else if (Static295.anInt5811 == 5) {
			this.method1018();
			Static214.method4111();
		} else if (Static295.anInt5811 == 25 || Static295.anInt5811 == 28) {
			Static324.method5277();
		}
		if (Static295.anInt5811 == 10) {
			this.method1017();
			Static222.method4158();
			Static52.method1339();
			Static182.method3598();
		} else if (Static295.anInt5811 == 30) {
			Static130.method2652();
		} else if (Static295.anInt5811 == 40) {
			Static182.method3598();
			if (Static353.anInt6727 != -3) {
				if (Static353.anInt6727 == 15) {
					Static113.method2454();
				} else if (Static353.anInt6727 != 2) {
					Static24.method667();
				}
			}
		}
		Static227.method4238(Static208.aClass32_11);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1021(@OriginalArg(0) int arg0) {
		Static332.anInt6393 = 0;
		Static314.aClass148_4 = null;
		Static283.aClass186_3.anInt5720++;
		Static86.aClass162_3 = null;
		Static283.aClass186_3.anInt5721 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1006()) {
			return;
		}
		Static311.anInt6073 = Integer.parseInt(this.getParameter("worldid"));
		Static63.anInt5669 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static63.anInt5669 < 0 || Static63.anInt5669 > 1) {
			Static63.anInt5669 = 0;
		}
		Static120.anInt2757 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static120.anInt2757 < 0 || Static120.anInt2757 > 2) {
			Static120.anInt2757 = 0;
		}
		try {
			Static259.anInt2907 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(53) Exception local53) {
			Static259.anInt2907 = 0;
		}
		@Pc(59) String local59 = this.getParameter("objecttag");
		if (local59 != null && local59.equals("1")) {
			Static141.aBoolean617 = true;
		} else {
			Static141.aBoolean617 = false;
		}
		@Pc(75) String local75 = this.getParameter("js");
		if (local75 != null && local75.equals("1")) {
			Static148.aBoolean313 = true;
		} else {
			Static148.aBoolean313 = false;
		}
		@Pc(91) String local91 = this.getParameter("game");
		if (local91 != null && local91.equals("1")) {
			Static8.anInt5875 = 1;
		} else {
			Static8.anInt5875 = 0;
		}
		try {
			Static163.anInt3550 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(110) Exception local110) {
			Static163.anInt3550 = 0;
		}
		Static140.aString28 = this.getParameter("quiturl");
		Static158.aString33 = this.getParameter("settings");
		if (Static158.aString33 == null) {
			Static158.aString33 = "";
		}
		@Pc(128) String local128 = this.getParameter("country");
		if (local128 != null) {
			try {
				Static91.anInt2289 = Integer.parseInt(local128);
			} catch (@Pc(135) Exception local135) {
				Static91.anInt2289 = 0;
			}
		}
		Static170.anInt3644 = Integer.parseInt(this.getParameter("colourid"));
		if (Static170.anInt3644 < 0 || Static170.anInt3644 >= Static268.aColorArray3.length) {
			Static170.anInt3644 = 0;
		}
		Static93.aClient1 = this;
		this.method1002(Static120.anInt2757 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method997() {
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1025() {
		@Pc(14) boolean local14 = Static283.aClass186_3.method4895();
		if (!local14) {
			this.method1015();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method1031(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub8 local10 = new Class1_Sub8(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(22) int local22 = local10.method4532();
					if (local22 == 0) {
						return;
					}
					if (local22 == 1) {
						@Pc(113) int[] local113 = Static97.anIntArray466 = new int[6];
						local113[0] = local10.method4556();
						local113[1] = local10.method4556();
						local113[2] = local10.method4556();
						local113[3] = local10.method4556();
						local113[4] = local10.method4556();
						local113[5] = local10.method4556();
					} else {
						@Pc(42) int local42;
						@Pc(37) int local37;
						if (local22 == 4) {
							local37 = local10.method4532();
							Static325.anIntArray508 = new int[local37];
							for (local42 = 0; local42 < local37; local42++) {
								Static325.anIntArray508[local42] = local10.method4556();
								if (Static325.anIntArray508[local42] == 65535) {
									Static325.anIntArray508[local42] = -1;
								}
							}
						} else if (local22 == 5) {
							local37 = local10.method4532();
							Static172.anIntArray345 = new int[local37];
							for (local42 = 0; local42 < local37; local42++) {
								Static172.anIntArray345[local42] = local10.method4556();
								if (Static172.anIntArray345[local42] == 65535) {
									Static172.anIntArray345[local42] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1005() {
		if (Static295.anInt5811 == 1000) {
			return;
		}
		@Pc(19) long local19 = Static130.method2651() / 1000000L - Static59.aLong54;
		Static59.aLong54 = Static130.method2651() / 1000000L;
		@Pc(31) boolean local31 = Static189.method3686();
		if (local31 && Static82.aBoolean192 && Static129.aClass7_2 != null) {
			Static129.aClass7_2.method5558();
		}
		if (Static295.anInt5811 == 30 || Static295.anInt5811 == 10) {
			if (Static334.aLong200 != 0L && Static334.aLong200 < Static162.method3252()) {
				Static30.method888(Static327.anInt6283, Static252.anInt5211, Static44.method1024(), false);
			} else if (Static208.aClass32_11.method2213() && Static183.aBoolean367) {
				Static256.method4619();
			}
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static197.aFrame2 == null) {
			@Pc(85) Container local85;
			if (Static84.aFrame1 == null) {
				local85 = Static15.aClass143_1.anApplet1;
			} else {
				local85 = Static84.aFrame1;
			}
			local94 = local85.getSize().width;
			local98 = local85.getSize().height;
			if (local85 == Static84.aFrame1) {
				@Pc(104) Insets local104 = Static84.aFrame1.getInsets();
				local94 -= local104.left + local104.right;
				local98 -= local104.top + local104.bottom;
			}
			if (local94 != Static170.anInt3645 || Static357.anInt4330 != local98) {
				if (Static208.aClass32_11 == null || Static208.aClass32_11.method2222()) {
					Static244.method4382();
				} else {
					Static170.anInt3645 = local94;
					Static357.anInt4330 = local98;
				}
				Static334.aLong200 = Static162.method3252() + 500L;
			}
		}
		if (Static197.aFrame2 != null && !Static179.aBoolean359 && (Static295.anInt5811 == 30 || Static295.anInt5811 == 10)) {
			Static30.method888(-1, -1, Static168.anInt3612, false);
		}
		@Pc(175) boolean local175 = false;
		if (Static262.aBoolean515) {
			Static262.aBoolean515 = false;
			local175 = true;
		}
		if (local175) {
			Static231.method4265();
		}
		if (Static208.aClass32_11 != null && Static208.aClass32_11.method2214() || Static44.method1024() != 1) {
			Static45.method1050();
		}
		if (Static295.anInt5811 == 0) {
			Static78.method1766(Static237.anInt4904, Static143.aColorArray2[Static170.anInt3644], Static268.aColorArray3[Static170.anInt3644], Static20.aColorArray1[Static170.anInt3644], Static307.aString59, local175);
		} else if (Static295.anInt5811 == 5) {
			Static56.method1459(Static268.aColorArray3[Static170.anInt3644].getRGB(), Static143.aColorArray2[Static170.anInt3644].getRGB(), Static20.aColorArray1[Static170.anInt3644].getRGB(), local175 | Static208.aClass32_11.method2214(), Static49.aClass9_1, Static208.aClass32_11);
		} else if (Static295.anInt5811 == 10) {
			Static244.method4389();
		} else if (Static295.anInt5811 == 25 || Static295.anInt5811 == 28) {
			if (Static6.anInt274 == 1) {
				if (Static96.anInt6251 < Static76.anInt1981) {
					Static96.anInt6251 = Static76.anInt1981;
				}
				local94 = (Static96.anInt6251 - Static76.anInt1981) * 50 / Static96.anInt6251;
				Static176.method3473(Static46.aClass34_34.method1285(Static259.anInt2907) + "<br>(" + local94 + "%)", true, Static212.aClass9_3);
			} else if (Static6.anInt274 == 2) {
				if (Static87.anInt2181 > Static114.anInt4337) {
					Static114.anInt4337 = Static87.anInt2181;
				}
				local94 = (Static114.anInt4337 - Static87.anInt2181) * 50 / Static114.anInt4337 + 50;
				Static176.method3473(Static46.aClass34_34.method1285(Static259.anInt2907) + "<br>(" + local94 + "%)", true, Static212.aClass9_3);
			} else {
				Static176.method3473(Static46.aClass34_34.method1285(Static259.anInt2907), true, Static212.aClass9_3);
			}
		} else if (Static295.anInt5811 == 30) {
			Static353.method5625(local19);
		} else if (Static295.anInt5811 == 40) {
			Static176.method3473(Static22.aClass34_150.method1285(Static259.anInt2907) + "<br>" + Static55.aClass34_39.method1285(Static259.anInt2907), true, Static212.aClass9_3);
		}
		if (Static262.anInt5352 == 3) {
			for (local94 = 0; local94 < Static47.anInt1510; local94++) {
				@Pc(396) Rectangle local396 = Class1_Sub4_Sub13.aRectangleArray5[local94];
				if (Static320.aBooleanArray24[local94]) {
					Static208.aClass32_11.method2191(-1996553985, local396.x, local396.width, local396.y, local396.height);
				} else if (Static161.aBooleanArray16[local94]) {
					Static208.aClass32_11.method2191(-1996554240, local396.x, local396.width, local396.y, local396.height);
				}
			}
		}
		if (Static58.method1505()) {
			Static245.method4391(Static208.aClass32_11);
		}
		if ((Static295.anInt5811 == 30 || Static295.anInt5811 == 10) && Static262.anInt5352 == 0 && Static44.method1024() == 1 && !local175 && Static207.aString40.equals("1.1")) {
			local94 = 0;
			for (local98 = 0; local98 < Static47.anInt1510; local98++) {
				if (Static161.aBooleanArray16[local98]) {
					Static161.aBooleanArray16[local98] = false;
					Static308.aRectangleArray2[local94++] = Class1_Sub4_Sub13.aRectangleArray5[local98];
				}
			}
			Static208.aClass32_11.method2165(Static308.aRectangleArray2, local94);
		} else if (Static295.anInt5811 != 0) {
			Static208.aClass32_11.method2209();
			for (local94 = 0; local94 < Static47.anInt1510; local94++) {
				Static161.aBooleanArray16[local94] = false;
			}
		}
		if (Static218.anInt4605 == 0) {
			Static190.method3690(15L);
		} else if (Static218.anInt4605 == 1) {
			Static190.method3690(10L);
		} else if (Static218.anInt4605 == 2) {
			Static190.method3690(5L);
		} else if (Static218.anInt4605 == 3) {
			Static190.method3690(2L);
		}
		if (Static211.aBoolean429) {
			Static242.method5626();
		}
		if (Static45.aBoolean140 && Static295.anInt5811 == 10 && Static89.anInt2231 != -1) {
			Static45.aBoolean140 = false;
			Static348.method5579(Static15.aClass143_1);
		}
	}
}
