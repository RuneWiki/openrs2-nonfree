import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!gb;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!bc;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!oa;")
	private static Class56 aClass56_479 = Static33.method650("Select");

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_477 = aClass56_479;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_478 = Static33.method650(" x ");

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!cc;")
	private static Class3_Sub2_Sub1 aClass3_Sub2_Sub1_2 = new Class3_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!oa;")
	private static Class56 aClass56_480 = Static33.method650("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public static int anInt895 = 0;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_481 = aClass56_480;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method611() {
		try {
			if (Static94.anInt2472 == 0) {
				if (Static117.aClass17_4 != null) {
					Static117.aClass17_4.method498();
					Static117.aClass17_4 = null;
				}
				Static17.aBoolean20 = false;
				Static31.aClass54_2 = null;
				Static94.anInt2472 = 1;
				Static95.anInt2479 = 0;
			}
			if (Static94.anInt2472 == 1) {
				if (Static31.aClass54_2 == null) {
					Static31.aClass54_2 = Static8.aClass43_1.method1090(Static9.anInt220, Static108.aString5);
				}
				if (Static31.aClass54_2.anInt2077 == 2) {
					throw new IOException();
				}
				if (Static31.aClass54_2.anInt2077 == 1) {
					Static117.aClass17_4 = new Class17((Socket) Static31.aClass54_2.anObject2, Static8.aClass43_1);
					Static94.anInt2472 = 2;
					Static31.aClass54_2 = null;
				}
			}
			if (Static94.anInt2472 == 2) {
				@Pc(72) long local72 = Static92.aLong68 = Static66.aClass56_262.method1445();
				Static111.aClass3_Sub2_Sub1_4.anInt413 = 0;
				Static111.aClass3_Sub2_Sub1_4.method303(14);
				@Pc(86) int local86 = (int) (local72 >> 16 & 0x1FL);
				Static111.aClass3_Sub2_Sub1_4.method303(local86);
				Static117.aClass17_4.method493(Static111.aClass3_Sub2_Sub1_4.aByteArray7, 2);
				Static94.anInt2472 = 3;
				Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
			}
			@Pc(119) int local119;
			if (Static94.anInt2472 == 3) {
				if (Static70.aClass18_2 != null) {
					Static70.aClass18_2.method1534();
				}
				if (Static35.aClass18_1 != null) {
					Static35.aClass18_1.method1534();
				}
				local119 = Static117.aClass17_4.method496();
				if (Static70.aClass18_2 != null) {
					Static70.aClass18_2.method1534();
				}
				if (Static35.aClass18_1 != null) {
					Static35.aClass18_1.method1534();
				}
				if (local119 != 0) {
					Static38.method693(local119);
					return;
				}
				Static94.anInt2472 = 4;
				Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
			}
			if (Static94.anInt2472 == 4) {
				if (Static31.aClass3_Sub2_Sub1_3.anInt413 < 8) {
					local119 = Static117.aClass17_4.method499();
					if (8 - Static31.aClass3_Sub2_Sub1_3.anInt413 < local119) {
						local119 = 8 - Static31.aClass3_Sub2_Sub1_3.anInt413;
					}
					if (local119 > 0) {
						Static117.aClass17_4.method500(Static31.aClass3_Sub2_Sub1_3.anInt413, local119, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
						Static31.aClass3_Sub2_Sub1_3.anInt413 += local119;
					}
				}
				if (Static31.aClass3_Sub2_Sub1_3.anInt413 == 8) {
					Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
					Static96.aLong72 = Static31.aClass3_Sub2_Sub1_3.method266();
					Static94.anInt2472 = 5;
				}
			}
			if (Static94.anInt2472 == 5) {
				@Pc(211) int[] local211 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), (int) (Static96.aLong72 >> 32), (int) Static96.aLong72 };
				Static111.aClass3_Sub2_Sub1_4.anInt413 = 0;
				local211[0] = (int) (Math.random() * 9.9999999E7D);
				Static111.aClass3_Sub2_Sub1_4.method303(10);
				Static111.aClass3_Sub2_Sub1_4.method280(local211[0]);
				Static111.aClass3_Sub2_Sub1_4.method280(local211[1]);
				Static111.aClass3_Sub2_Sub1_4.method280(local211[2]);
				Static111.aClass3_Sub2_Sub1_4.method280(local211[3]);
				Static111.aClass3_Sub2_Sub1_4.method280(Static8.aClass43_1.anInt1625);
				Static111.aClass3_Sub2_Sub1_4.method300(Static66.aClass56_262.method1445());
				Static111.aClass3_Sub2_Sub1_4.method293(Static66.aClass56_271);
				Static111.aClass3_Sub2_Sub1_4.method307(Static124.aBigInteger3, Static109.aBigInteger2);
				aClass3_Sub2_Sub1_2.anInt413 = 0;
				if (Static44.anInt1156 == 40) {
					aClass3_Sub2_Sub1_2.method303(18);
				} else {
					aClass3_Sub2_Sub1_2.method303(16);
				}
				aClass3_Sub2_Sub1_2.method303(Static111.aClass3_Sub2_Sub1_4.anInt413 + 69);
				aClass3_Sub2_Sub1_2.method280(455);
				aClass3_Sub2_Sub1_2.method303(Static77.aBoolean169 ? 1 : 0);
				aClass3_Sub2_Sub1_2.method280(Static111.aClass44_Sub1_74.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static106.aClass44_Sub1_67.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static19.aClass44_Sub1_18.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static11.aClass44_Sub1_13.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static12.aClass44_Sub1_15.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static2.aClass44_Sub1_2.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static100.aClass44_Sub1_65.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static21.aClass44_Sub1_20.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static114.aClass44_Sub1_75.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static49.aClass44_Sub1_41.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static111.aClass44_Sub1_73.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static2.aClass44_Sub1_1.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static102.aClass44_Sub1_83.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static12.aClass44_Sub1_14.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static77.aClass44_Sub1_82.anInt1682);
				aClass3_Sub2_Sub1_2.method280(Static81.aClass44_Sub1_53.anInt1682);
				aClass3_Sub2_Sub1_2.method272(Static111.aClass3_Sub2_Sub1_4.anInt413, Static111.aClass3_Sub2_Sub1_4.aByteArray7);
				Static117.aClass17_4.method493(aClass3_Sub2_Sub1_2.aByteArray7, aClass3_Sub2_Sub1_2.anInt413);
				Static111.aClass3_Sub2_Sub1_4.method324(local211);
				for (@Pc(429) int local429 = 0; local429 < 4; local429++) {
					local211[local429] += 50;
				}
				Static31.aClass3_Sub2_Sub1_3.method324(local211);
				Static94.anInt2472 = 6;
			}
			if (Static94.anInt2472 == 6 && Static117.aClass17_4.method499() > 0) {
				local119 = Static117.aClass17_4.method496();
				if (local119 == 21 && Static44.anInt1156 == 20) {
					Static94.anInt2472 = 7;
				} else if (local119 == 2) {
					Static94.anInt2472 = 9;
				} else if (local119 == 15 && Static44.anInt1156 == 40) {
					Static14.method252();
					return;
				} else if (local119 == 23 && Static69.anInt1922 < 1) {
					Static94.anInt2472 = 0;
					Static69.anInt1922++;
				} else {
					Static38.method693(local119);
					return;
				}
			}
			if (Static94.anInt2472 == 7 && Static117.aClass17_4.method499() > 0) {
				Static26.anInt766 = Static117.aClass17_4.method496() * 60 + 180;
				Static94.anInt2472 = 8;
			}
			if (Static94.anInt2472 == 8) {
				Static95.anInt2479 = 0;
				Static59.method1172(Static84.method1524(new Class56[] { Static111.method1851(Static26.anInt766 / 60), Static48.aClass56_767 }), Static8.aClass56_112, Static44.aClass56_693);
				if (--Static26.anInt766 <= 0) {
					Static94.anInt2472 = 0;
				}
			} else {
				if (Static94.anInt2472 == 9 && Static117.aClass17_4.method499() >= 8) {
					Static29.anInt868 = Static117.aClass17_4.method496();
					Static27.aBoolean42 = Static117.aClass17_4.method496() == 1;
					Static7.anInt419 = Static117.aClass17_4.method496();
					Static7.anInt419 <<= 0x8;
					Static7.anInt419 += Static117.aClass17_4.method496();
					Static48.anInt1397 = Static117.aClass17_4.method496();
					Static117.aClass17_4.method500(0, 1, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
					Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
					Static43.anInt1142 = Static31.aClass3_Sub2_Sub1_3.method319();
					Static117.aClass17_4.method500(0, 2, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
					Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
					Static73.anInt2013 = Static31.aClass3_Sub2_Sub1_3.method276();
					Static94.anInt2472 = 10;
				}
				if (Static94.anInt2472 != 10) {
					Static95.anInt2479++;
					if (Static95.anInt2479 > 2000) {
						if (Static69.anInt1922 < 1) {
							if (Static9.anInt220 == Static86.anInt2357) {
								Static9.anInt220 = Static8.anInt207;
							} else {
								Static9.anInt220 = Static86.anInt2357;
							}
							Static94.anInt2472 = 0;
							Static69.anInt1922++;
						} else {
							Static38.method693(-3);
						}
					}
				} else if (Static117.aClass17_4.method499() >= Static73.anInt2013) {
					Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
					Static117.aClass17_4.method500(0, Static73.anInt2013, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
					Static113.method1865();
					Static116.anInt2950 = -1;
					Static18.method353(false);
					Static43.anInt1142 = -1;
				}
			}
		} catch (@Pc(710) IOException local710) {
			if (Static69.anInt1922 < 1) {
				if (Static86.anInt2357 == Static9.anInt220) {
					Static9.anInt220 = Static8.anInt207;
				} else {
					Static9.anInt220 = Static86.anInt2357;
				}
				Static69.anInt1922++;
				Static94.anInt2472 = 0;
			} else {
				Static38.method693(-2);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method613() {
		try {
			@Pc(2) Graphics local2 = Static59.aCanvas1.getGraphics();
			Static105.aClass30_16.method811(357, 17, local2);
		} catch (@Pc(15) Exception local15) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I")
	private static int method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg0;
		return (local8 * (arg1 & 0xFF00FF) + arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local8 * (arg1 & 0xFF00) + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public static void method615() {
		@Pc(11) int local11;
		if (Static4.anInt53 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static4.anInt53 > 768) {
					Static50.anIntArray98[local11] = method614(1024 - Static4.anInt53, Static41.anIntArray75[local11], Static73.anIntArray166[local11]);
				} else if (Static4.anInt53 <= 256) {
					Static50.anIntArray98[local11] = method614(256 - Static4.anInt53, Static73.anIntArray166[local11], Static41.anIntArray75[local11]);
				} else {
					Static50.anIntArray98[local11] = Static73.anIntArray166[local11];
				}
			}
		} else if (Static42.anInt1116 <= 0) {
			for (local11 = 0; local11 < 256; local11++) {
				Static50.anIntArray98[local11] = Static41.anIntArray75[local11];
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static42.anInt1116 > 768) {
					Static50.anIntArray98[local11] = method614(1024 - Static42.anInt1116, Static41.anIntArray75[local11], Static75.anIntArray175[local11]);
				} else if (Static42.anInt1116 <= 256) {
					Static50.anIntArray98[local11] = method614(256 - Static42.anInt1116, Static75.anIntArray175[local11], Static41.anIntArray75[local11]);
				} else {
					Static50.anIntArray98[local11] = Static75.anIntArray175[local11];
				}
			}
		}
		Static6.method1498(0, 9, 128, 263);
		Static97.aClass3_Sub1_Sub1_Sub2_5.method958(0, 0);
		local11 = 0;
		Static6.method1485();
		@Pc(165) int local165 = 6885;
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(197) int local197;
		@Pc(204) int local204;
		@Pc(211) int local211;
		@Pc(216) int local216;
		@Pc(225) int local225;
		for (@Pc(167) int local167 = 1; local167 < 255; local167++) {
			local180 = (256 - local167) * Static81.anIntArray187[local167] / 256;
			local184 = local180 + 22;
			if (local184 < 0) {
				local184 = 0;
			}
			local11 += local184;
			for (local197 = local184; local197 < 128; local197++) {
				local204 = Static49.anIntArray102[local11++];
				if (local204 == 0) {
					local165++;
				} else {
					local211 = local204;
					local216 = 256 - local204;
					local204 = Static50.anIntArray98[local204];
					local225 = Static50.aClass30_8.anIntArray80[local165];
					Static50.aClass30_8.anIntArray80[local165++] = ((local204 & 0xFF00FF) * local211 + (local225 & 0xFF00FF) * local216 & 0xFF00FF00) + ((local204 & 0xFF00) * local211 + local216 * (local225 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local165 += local184 + 765 - 128;
		}
		local165 = 7546;
		Static6.method1498(637, 9, 765, 263);
		local11 = 0;
		Static19.aClass3_Sub1_Sub1_Sub2_2.method958(382, 0);
		Static6.method1485();
		for (local180 = 1; local180 < 255; local180++) {
			local184 = Static81.anIntArray187[local180] * (256 - local180) / 256;
			local165 += local184;
			local197 = 103 - local184;
			for (local204 = 0; local204 < local197; local204++) {
				local211 = Static49.anIntArray102[local11++];
				if (local211 == 0) {
					local165++;
				} else {
					local225 = 256 - local211;
					local216 = local211;
					local211 = Static50.anIntArray98[local211];
					@Pc(351) int local351 = Static50.aClass30_8.anIntArray80[local165];
					Static50.aClass30_8.anIntArray80[local165++] = ((local211 & 0xFF00FF) * local216 + local225 * (local351 & 0xFF00FF) & 0xFF00FF00) + (local216 * (local211 & 0xFF00) + (local351 & 0xFF00) * local225 & 0xFF0000) >> 8;
				}
			}
			local165 += 765 - local197 - local184;
			local11 += 128 - local197;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)I")
	public static int method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static123.method1976(4, arg1 + 45365, arg0 + 91923) + (Static123.method1976(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static123.method1976(1, arg1, arg0) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method617() {
		aClass56_479 = null;
		aClass3_Sub1_Sub1_Sub1_2 = null;
		aClass56_480 = null;
		aClass56_477 = null;
		aClass3_Sub2_Sub1_2 = null;
		aClass7_2 = null;
		aClass56_478 = null;
		aClass56_481 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	public static void method619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static24.anInt703 != 0 && arg1 != -1) {
			Static81.method1430(arg1, 0, Static24.anInt703, Static2.aClass44_Sub1_1);
			Static7.aBoolean18 = true;
		}
	}
}
