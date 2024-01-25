import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public static int anInt2372;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	public static int anInt2379;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public static int anInt2373 = 0;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[200];

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
	public static void method1889() {
		if (Static575.anInt10384 == 0 || Static575.anInt10384 == 6) {
			return;
		}
		try {
			if (++Static124.anInt2828 > 2000) {
				if (Static528.aClass36_2 != null) {
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
				}
				if (Static533.anInt9770 >= 2) {
					Static575.anInt10384 = 0;
					Static582.method8145(-5);
					return;
				}
				if (Static274.anInt5755 == 2 || Static274.anInt5755 == 3) {
					Static326.aClass271_2.method6250();
				} else {
					Static134.aClass271_3.method6250();
				}
				Static575.anInt10384 = 1;
				Static124.anInt2828 = 0;
				Static533.anInt9770++;
			}
			if (Static575.anInt10384 == 1) {
				if (Static274.anInt5755 == 2 || Static274.anInt5755 == 3) {
					Static364.aClass316_5 = Static326.aClass271_2.method6248(Static372.aClass366_5);
				} else {
					Static364.aClass316_5 = Static134.aClass271_3.method6248(Static372.aClass366_5);
				}
				Static575.anInt10384 = 2;
			}
			if (Static575.anInt10384 == 2) {
				if (Static364.aClass316_5.anInt9478 == 2) {
					throw new IOException();
				}
				if (Static364.aClass316_5.anInt9478 != 1) {
					return;
				}
				Static528.aClass36_2 = Static177.method2946((Socket) Static364.aClass316_5.anObject136);
				Static364.aClass316_5 = null;
				@Pc(134) long local134 = Static344.aLong177 = Static587.method8191(Static544.aString215);
				Static566.method8002();
				@Pc(143) int local143 = (int) (local134 >> 16 & 0x1FL);
				@Pc(146) Class4_Sub39 local146 = Static504.method7252();
				local146.aClass4_Sub13_Sub2_1.method7052(Static58.aClass195_1.anInt5991);
				local146.aClass4_Sub13_Sub2_1.method7052(local143);
				Static50.method1166(local146);
				Static446.method6581();
				Static575.anInt10384 = 3;
			}
			@Pc(190) int local190;
			if (Static575.anInt10384 == 3) {
				if (!Static528.aClass36_2.method1994(1)) {
					return;
				}
				Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				local190 = Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF;
				if (local190 != 0) {
					Static575.anInt10384 = 0;
					Static582.method8145(local190);
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
					Static317.method4985();
					return;
				}
				Static575.anInt10384 = 4;
			}
			if (Static575.anInt10384 == 4) {
				if (!Static528.aClass36_2.method1994(8)) {
					return;
				}
				Static528.aClass36_2.method1995(0, 8, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
				Static540.aLong277 = Static549.aClass4_Sub13_Sub2_2.method7026();
				@Pc(242) Class4_Sub13 local242 = new Class4_Sub13(518);
				@Pc(245) int[] local245 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static540.aLong277 >> 32), (int) Static540.aLong277 };
				local242.method7052(10);
				local242.method7032(local245[0]);
				local242.method7032(local245[1]);
				local242.method7032(local245[2]);
				local242.method7032(local245[3]);
				local242.method7020(Static587.method8191(Static544.aString215));
				local242.method7002(Static422.aString169);
				local242.method7020(Static26.aLong18);
				local242.method7020(Static506.aLong265);
				local242.method7024(Static325.aBigInteger4, Static496.aBigInteger6);
				Static566.method8002();
				@Pc(329) Class4_Sub39 local329 = Static504.method7252();
				@Pc(332) Class4_Sub13_Sub2 local332 = local329.aClass4_Sub13_Sub2_1;
				@Pc(354) int local354;
				if (Static274.anInt5755 == 2 || Static274.anInt5755 == 3) {
					if (Static9.anInt758 == 13) {
						local332.method7052(Static58.aClass195_5.anInt5991);
					} else {
						local332.method7052(Static58.aClass195_3.anInt5991);
					}
					local332.method7038(0);
					local354 = local332.anInt9170;
					local332.method7032(624);
					local332.method7052(Static313.anInt6277);
					local332.method7052(Static578.method8122());
					local332.method7038(Static123.anInt9150);
					local332.method7038(Static71.anInt1872);
					local332.method7052(Static455.aClass4_Sub35_Sub1_1.anInt9914);
					Static194.method3191(local332);
					local332.method7002(Static146.aString56);
					local332.method7032(Static446.anInt8497);
					@Pc(468) Class4_Sub13 local468 = new Class4_Sub13(Static239.method3894());
					Static455.aClass4_Sub35_Sub1_1.method7612(local468);
					local332.method7052(local468.anInt9170);
					local332.method7030(local468.anInt9170, local468.aByteArray88);
					Static556.aBoolean698 = true;
					@Pc(494) Class4_Sub13 local494 = new Class4_Sub13(Static535.aClass4_Sub15_1.method2446());
					Static535.aClass4_Sub15_1.method2445(local494);
					local332.method7030(local494.aByteArray88.length, local494.aByteArray88);
					local332.method7038(Static11.anInt816);
					local332.method7020(Static452.aLong234);
					local332.method7052(Static172.aString67 == null ? 0 : 1);
					if (Static172.aString67 != null) {
						local332.method7002(Static172.aString67);
					}
					Static6.method634(local332);
					local332.method7030(local242.anInt9170, local242.aByteArray88);
					local332.method7042(local332.anInt9170 - local354);
				} else {
					local332.method7052(Static58.aClass195_6.anInt5991);
					local332.method7038(0);
					local354 = local332.anInt9170;
					local332.method7032(624);
					local332.method7052(Static162.aClass128_1.anInt3622);
					local332.method7052(Static142.anInt3088);
					Static194.method3191(local332);
					local332.method7002(Static146.aString56);
					local332.method7032(Static446.anInt8497);
					Static6.method634(local332);
					local332.method7030(local242.anInt9170, local242.aByteArray88);
					local332.method7042(local332.anInt9170 - local354);
				}
				Static50.method1166(local329);
				Static446.method6581();
				Static402.aClass356_1 = new Class356(local245);
				for (local354 = 0; local354 < 4; local354++) {
					local245[local354] += 50;
				}
				Static549.aClass4_Sub13_Sub2_2.method7055(local245);
				Static575.anInt10384 = 5;
			}
			if (Static575.anInt10384 == 5) {
				if (!Static528.aClass36_2.method1994(1)) {
					return;
				}
				Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				local190 = Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF;
				if (local190 == 21) {
					Static575.anInt10384 = 8;
				} else if (local190 == 29) {
					Static575.anInt10384 = 14;
				} else if (local190 == 1) {
					Static575.anInt10384 = 6;
					Static582.method8145(local190);
					return;
				} else if (local190 == 2) {
					Static575.anInt10384 = 9;
				} else if (local190 == 15) {
					Static488.anInt9250 = -2;
					Static575.anInt10384 = 15;
				} else if (local190 == 23 && Static533.anInt9770 < 2) {
					Static533.anInt9770++;
					Static124.anInt2828 = 0;
					Static575.anInt10384 = 1;
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
					return;
				} else {
					Static575.anInt10384 = 0;
					Static582.method8145(local190);
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
					Static317.method4985();
					return;
				}
			}
			if (Static575.anInt10384 == 7) {
				Static566.method8002();
				@Pc(698) Class4_Sub39 local698 = Static504.method7252();
				@Pc(701) Class4_Sub13_Sub2 local701 = local698.aClass4_Sub13_Sub2_1;
				local701.method7058(Static402.aClass356_1);
				local701.method7060(Static58.aClass195_13.anInt5991);
				Static50.method1166(local698);
				Static446.method6581();
				Static575.anInt10384 = 5;
			} else if (Static575.anInt10384 == 8) {
				if (Static528.aClass36_2.method1994(1)) {
					Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
					local190 = Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF;
					Static575.anInt10384 = 0;
					Static452.anInt8608 = local190 * 60 + 180;
					Static582.method8145(21);
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
					Static317.method4985();
				}
			} else if (Static575.anInt10384 == 14) {
				if (Static528.aClass36_2.method1994(1)) {
					Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
					Static473.anInt8998 = Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF;
					Static575.anInt10384 = 0;
					Static582.method8145(29);
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
					Static317.method4985();
				}
			} else if (Static575.anInt10384 != 9) {
				@Pc(834) Class4_Sub13_Sub2 local834;
				if (Static575.anInt10384 == 10) {
					local834 = Static549.aClass4_Sub13_Sub2_2;
					if (Static274.anInt5755 == 3) {
						Static510.aBoolean488 = true;
					} else {
						Static510.aBoolean488 = false;
					}
					if (Static274.anInt5755 == 2 || Static274.anInt5755 == 3) {
						if (!Static528.aClass36_2.method1994(Static352.anInt6769)) {
							return;
						}
						Static528.aClass36_2.method1995(0, Static352.anInt6769, local834.aByteArray88);
						local834.anInt9170 = 0;
						Static100.anInt2432 = local834.method7004();
						Static312.anInt6272 = local834.method7004();
						Static337.aBoolean442 = local834.method7004() == 1;
						Static477.aBoolean628 = local834.method7004() == 1;
						Static445.aBoolean600 = local834.method7004() == 1;
						Static16.aBoolean432 = local834.method7004() == 1;
						Static1.anInt5011 = local834.method7054();
						Static56.aBoolean120 = local834.method7004() == 1;
						Static168.anInt3486 = local834.method7000();
						Static258.aBoolean367 = local834.method7004() == 1;
						if (Static274.anInt5755 == 3) {
							@Pc(962) boolean local962 = local834.method7004() == 1;
							if (local962) {
								@Pc(968) long local968 = local834.method7026();
								@Pc(972) String local972 = Static244.method7176(local968);
								@Pc(976) int local976 = local834.method7004();
								@Pc(979) byte[] local979 = new byte[local976];
								local834.method7059(local979, local976);
								@Pc(989) String local989 = Static390.method6003(local979);
								@Pc(991) Class354 local991 = null;
								try {
									@Pc(997) Class316 local997 = Static372.aClass366_5.method8266("3", false);
									while (local997.anInt9478 == 0) {
										Static214.method3478(1L);
									}
									if (local997.anInt9478 == 1) {
										local991 = (Class354) local997.anObject136;
										@Pc(1030) int local1030 = local972.length() + local989.length() + 8 + 2 + 3 + 2 + 5;
										if (Static172.aString67 != null) {
											local1030 += Static172.aString67.length() + 2;
										}
										if (local1030 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1054) Class4_Sub13 local1054 = new Class4_Sub13(local1030 + 1);
										local1054.method7052(local1030);
										local1054.method7052(3);
										local1054.method7027(local972);
										local1054.method7027(local989);
										local1054.method7038(Static446.anInt8497);
										local1054.method7020(Static452.aLong234);
										local1054.method7052(Static172.aString67 == null ? 0 : 1);
										if (Static172.aString67 != null) {
											local1054.method7027(Static172.aString67);
										}
										local1054.method7048();
										local991.method8086(local1054.aByteArray88, local1054.anInt9170, 0);
									}
								} catch (@Pc(1112) Exception local1112) {
								}
								try {
									if (local991 != null) {
										local991.method8089();
									}
								} catch (@Pc(1119) Exception local1119) {
								}
								try {
									Static597.method1279(Static589.anApplet2, "demoaccountcreated");
								} catch (@Pc(1126) Throwable local1126) {
								}
							}
						}
						Static103.aClass298_1.method6814(Static258.aBoolean367);
						Static338.aClass29_1.method978(Static258.aBoolean367);
						Class21_Sub1_Sub2_Sub1.lb.method4993(Static258.aBoolean367);
					} else if (Static528.aClass36_2.method1994(Static352.anInt6769)) {
						Static528.aClass36_2.method1995(0, Static352.anInt6769, local834.aByteArray88);
						local834.anInt9170 = 0;
						Static100.anInt2432 = local834.method7004();
						Static312.anInt6272 = local834.method7004();
						Static337.aBoolean442 = local834.method7004() == 1;
						Static477.aBoolean628 = local834.method7004() == 1;
						Static445.aBoolean600 = local834.method7004() == 1;
						Static502.anInt9377 = local834.method7043();
						Static56.aBoolean120 = Static502.anInt9377 > 0;
						Static143.anInt3093 = local834.method7054();
						Static215.anInt4513 = local834.method7054();
						Static570.anInt10304 = local834.method7054();
						Static2.anInt10 = local834.method6990();
						Static412.aClass316_6 = Static372.aClass366_5.method8282(Static2.anInt10);
						Static361.anInt6988 = local834.method7004();
						Static346.anInt6643 = local834.method7054();
						Static381.anInt7498 = local834.method7054();
						Static4.aBoolean141 = local834.method7004() == 1;
						Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString88 = local834.method7006();
						Static568.anInt10301 = local834.method7004();
						Static76.anInt1925 = local834.method6990();
						Static476.aClass271_5 = new Class271();
						Static476.aClass271_5.anInt7991 = local834.method7054();
						if (Static476.aClass271_5.anInt7991 == 65535) {
							Static476.aClass271_5.anInt7991 = -1;
						}
						Static476.aClass271_5.aString164 = local834.method7006();
						if (Static342.aClass326_6 != Static383.aClass326_7) {
							Static476.aClass271_5.anInt7987 = Static476.aClass271_5.anInt7991 + 50000;
							Static476.aClass271_5.anInt7994 = Static476.aClass271_5.anInt7991 + 40000;
						}
						if (Static342.aClass326_6 != Static480.aClass326_9 && (Static326.aClass271_2.method6252(Static454.aClass271_4) || Static326.aClass271_2.method6252(Static518.aClass271_6))) {
							Static34.method3923();
						}
					} else {
						return;
					}
					if (Static337.aBoolean442 && !Static445.aBoolean600 || Static56.aBoolean120) {
						try {
							Static597.method1279(Static589.anApplet2, "zap");
						} catch (@Pc(1354) Throwable local1354) {
							if (Static203.aBoolean291) {
								try {
									Static589.anApplet2.getAppletContext().showDocument(new URL(Static589.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1368) Exception local1368) {
								}
							}
						}
					} else {
						try {
							Static597.method1279(Static589.anApplet2, "unzap");
						} catch (@Pc(1345) Throwable local1345) {
						}
					}
					if (Static383.aClass326_7 == Static342.aClass326_6) {
						try {
							Static597.method1279(Static589.anApplet2, "loggedin");
						} catch (@Pc(1379) Throwable local1379) {
						}
					}
					if (Static274.anInt5755 != 2 && Static274.anInt5755 != 3) {
						Static575.anInt10384 = 0;
						Static582.method8145(2);
						Static441.method6509();
						Static231.method3759(7);
						Static100.aClass90_34 = null;
						return;
					}
					Static575.anInt10384 = 12;
				}
				if (Static575.anInt10384 == 12) {
					if (!Static528.aClass36_2.method1994(3)) {
						return;
					}
					Static528.aClass36_2.method1995(0, 3, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
					Static575.anInt10384 = 13;
				}
				if (Static575.anInt10384 == 13) {
					local834 = Static549.aClass4_Sub13_Sub2_2;
					local834.anInt9170 = 0;
					if (local834.method7064()) {
						if (!Static528.aClass36_2.method1994(1)) {
							return;
						}
						Static528.aClass36_2.method1995(3, 1, local834.aByteArray88);
					}
					Static100.aClass90_34 = Static160.method2664()[local834.method7056()];
					Static488.anInt9250 = local834.method7054();
					Static575.anInt10384 = 11;
				}
				if (Static575.anInt10384 == 11) {
					if (Static528.aClass36_2.method1994(Static488.anInt9250)) {
						Static528.aClass36_2.method1995(0, Static488.anInt9250, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
						Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
						local190 = Static488.anInt9250;
						Static575.anInt10384 = 0;
						Static582.method8145(2);
						Static95.method1895();
						Static236.method3841(Static549.aClass4_Sub13_Sub2_2);
						Static173.anInt3656 = -1;
						if (Static491.aClass90_127 == Static100.aClass90_34) {
							Static157.method2656();
						} else {
							Static188.method3089();
						}
						if (local190 != Static549.aClass4_Sub13_Sub2_2.anInt9170) {
							throw new RuntimeException("lswp pos:" + Static549.aClass4_Sub13_Sub2_2.anInt9170 + " psize:" + local190);
						}
						Static100.aClass90_34 = null;
					}
				} else if (Static575.anInt10384 == 15) {
					if (Static488.anInt9250 == -2) {
						if (!Static528.aClass36_2.method1994(2)) {
							return;
						}
						Static528.aClass36_2.method1995(0, 2, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
						Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
						Static488.anInt9250 = Static549.aClass4_Sub13_Sub2_2.method7054();
					}
					if (Static528.aClass36_2.method1994(Static488.anInt9250)) {
						Static528.aClass36_2.method1995(0, Static488.anInt9250, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
						Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
						Static575.anInt10384 = 0;
						local190 = Static488.anInt9250;
						Static582.method8145(15);
						Static335.method5119();
						Static236.method3841(Static549.aClass4_Sub13_Sub2_2);
						if (local190 != Static549.aClass4_Sub13_Sub2_2.anInt9170) {
							throw new RuntimeException("lswpr pos:" + Static549.aClass4_Sub13_Sub2_2.anInt9170 + " psize:" + local190);
						}
						Static100.aClass90_34 = null;
					}
				}
			} else if (Static528.aClass36_2.method1994(1)) {
				Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				Static352.anInt6769 = Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF;
				Static575.anInt10384 = 10;
			}
		} catch (@Pc(1629) IOException local1629) {
			if (Static528.aClass36_2 != null) {
				Static528.aClass36_2.method1992();
				Static528.aClass36_2 = null;
			}
			if (Static533.anInt9770 >= 2) {
				Static575.anInt10384 = 0;
				Static582.method8145(-4);
				Static317.method4985();
			} else {
				if (Static274.anInt5755 == 2 || Static274.anInt5755 == 3) {
					Static326.aClass271_2.method6250();
				} else {
					Static134.aClass271_3.method6250();
				}
				Static533.anInt9770++;
				Static124.anInt2828 = 0;
				Static575.anInt10384 = 1;
			}
		}
	}
}
