import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ra", name = "ad", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array12;

	@OriginalMember(owner = "client!ra", name = "ld", descriptor = "Lclient!jb;")
	public static Class32 aClass32_4;

	@OriginalMember(owner = "client!ra", name = "qd", descriptor = "Lclient!ee;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ra", name = "ud", descriptor = "Lclient!ta;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!ra", name = "fd", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1145 = Static87.method1648("redstone1");

	@OriginalMember(owner = "client!ra", name = "jd", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1146 = Static87.method1648("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ra", name = "od", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1147 = Static87.method1648("blinken1:");

	@OriginalMember(owner = "client!ra", name = "pd", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1148 = Static87.method1648("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ra", name = "Bd", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1149 = Static87.method1648("leuchten3:");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILclient!ra;I)V")
	public static void method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub3_Sub1_Sub4_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1 || Static61.anInt1553 >= 400) {
			return;
		}
		@Pc(53) Class27 local53;
		if (arg2.anInt2443 == 0) {
			local53 = Static98.method1779(new Class27[] { arg2.aClass27_1150, Static42.method898(Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2438, arg2.anInt2438), Static109.aClass27_962, Static31.aClass27_389, Static97.method1616(arg2.anInt2438), Static71.aClass27_909 });
		} else {
			local53 = Static98.method1779(new Class27[] { arg2.aClass27_1150, Static109.aClass27_962, Static76.aClass27_1001, Static97.method1616(arg2.anInt2443), Static71.aClass27_909 });
		}
		@Pc(172) int local172;
		if (Static42.anInt1235 == 1) {
			Static46.method925(arg3, 3, arg1, arg0, Static98.method1779(new Class27[] { Static81.aClass27_1046, Static48.aClass27_1135, local53 }), Static8.aClass27_115);
		} else if (Static39.anInt964 != 1) {
			for (local172 = 4; local172 >= 0; local172--) {
				if (Static55.aClass27Array7[local172] != null) {
					@Pc(184) short local184 = 0;
					if (Static55.aClass27Array7[local172].method763(Static108.aClass27_1345)) {
						if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2438 < arg2.anInt2438) {
							local184 = 2000;
						}
						if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2448 != 0 && arg2.anInt2448 != 0) {
							if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2448 == arg2.anInt2448) {
								local184 = 2000;
							} else {
								local184 = 0;
							}
						}
					} else if (Static24.aBooleanArray6[local172]) {
						local184 = 2000;
					}
					@Pc(233) int local233 = 0;
					if (local172 == 0) {
						local233 = local184 + 30;
					}
					if (local172 == 1) {
						local233 = local184 + 51;
					}
					if (local172 == 2) {
						local233 = local184 + 7;
					}
					if (local172 == 3) {
						local233 = local184 + 8;
					}
					if (local172 == 4) {
						local233 = local184 + 33;
					}
					Static46.method925(arg3, local233, arg1, arg0, Static98.method1779(new Class27[] { Static22.aClass27_296, local53 }), Static55.aClass27Array7[local172]);
				}
			}
		} else if ((Static68.anInt1748 & 0x8) == 8) {
			Static46.method925(arg3, 37, arg1, arg0, Static98.method1779(new Class27[] { Static16.aClass27_189, Static48.aClass27_1135, local53 }), Static10.aClass27_130);
		}
		for (local172 = 0; local172 < Static61.anInt1553; local172++) {
			if (Static53.anIntArray234[local172] == 26) {
				Static55.aClass27Array9[local172] = Static98.method1779(new Class27[] { Static42.aClass27_601, Static13.aClass27_380, Static22.aClass27_296, local53 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "(I)V")
	public static void method1685() {
		@Pc(10) int local10 = Static107.anInt2771 + Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399;
		@Pc(15) int local15 = Static12.anInt281 + Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408;
		if (Static7.anInt179 - local15 < -500 || Static7.anInt179 - local15 > 500 || Static50.anInt1340 - local10 < -500 || Static50.anInt1340 - local10 > 500) {
			Static50.anInt1340 = local10;
			Static7.anInt179 = local15;
		}
		if (local15 != Static7.anInt179) {
			Static7.anInt179 += (local15 - Static7.anInt179) / 16;
		}
		@Pc(64) int local64 = Static7.anInt179 >> 7;
		if (Static50.anInt1340 != local10) {
			Static50.anInt1340 += (local10 - Static50.anInt1340) / 16;
		}
		if (Static10.aBooleanArray3[96]) {
			Static40.anInt1200 += (-Static40.anInt1200 - 24) / 2;
		} else if (Static10.aBooleanArray3[97]) {
			Static40.anInt1200 += (24 - Static40.anInt1200) / 2;
		} else {
			Static40.anInt1200 /= 2;
		}
		if (Static10.aBooleanArray3[98]) {
			Static80.anInt2190 += (12 - Static80.anInt2190) / 2;
		} else if (Static10.aBooleanArray3[99]) {
			Static80.anInt2190 += (-Static80.anInt2190 - 12) / 2;
		} else {
			Static80.anInt2190 /= 2;
		}
		Static73.anInt1924 = Static40.anInt1200 / 2 + Static73.anInt1924 & 0x7FF;
		Static97.anInt2292 += Static80.anInt2190 / 2;
		@Pc(161) int local161 = Static50.anInt1340 >> 7;
		@Pc(163) int local163 = 0;
		if (Static97.anInt2292 < 128) {
			Static97.anInt2292 = 128;
		}
		if (Static97.anInt2292 > 383) {
			Static97.anInt2292 = 383;
		}
		@Pc(179) int local179 = Static48.method1675(Static50.anInt1340, Static68.anInt1747, Static7.anInt179);
		@Pc(201) int local201;
		if (local64 > 3 && local161 > 3 && local64 < 100 && local161 < 100) {
			for (local201 = local64 - 4; local201 <= local64 + 4; local201++) {
				for (@Pc(207) int local207 = local161 - 4; local207 <= local161 + 4; local207++) {
					@Pc(211) int local211 = Static68.anInt1747;
					if (local211 < 3 && (Static89.aByteArrayArrayArray11[1][local201][local207] & 0x2) == 2) {
						local211++;
					}
					@Pc(241) int local241 = local179 - Static55.anIntArrayArrayArray4[local211][local201][local207];
					if (local241 > local163) {
						local163 = local241;
					}
				}
			}
		}
		local201 = local163 * 192;
		if (local201 > 98048) {
			local201 = 98048;
		}
		if (local201 < 32768) {
			local201 = 32768;
		}
		if (local201 > Static12.anInt286) {
			Static12.anInt286 += (local201 - Static12.anInt286) / 24;
		} else if (Static12.anInt286 > local201) {
			Static12.anInt286 += (local201 - Static12.anInt286) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZIII)I")
	public static int method1686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg5;
			arg5 = local12;
		}
		@Pc(20) int local20 = arg1 & 0x3;
		if (local20 == 0) {
			return arg2;
		} else if (local20 == 1) {
			return arg0;
		} else if (local20 == 2) {
			return 7 + 1 - arg2 - arg3;
		} else {
			return 1 + 7 - arg5 - arg0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!hb;Ljava/awt/Color;)V")
	public static void method1687(@OriginalArg(0) int arg0, @OriginalArg(2) Class27 arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static19.aCanvas1.getGraphics();
			if (Static103.aFont1 == null) {
				Static103.aFont1 = new Font("Helvetica", 1, 13);
				Static16.aFontMetrics1 = Static19.aCanvas1.getFontMetrics(Static103.aFont1);
			}
			if (Static89.aBoolean121) {
				Static89.aBoolean121 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static24.anInt629, Static16.anInt390);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static3.anImage1 == null) {
					Static3.anImage1 = Static19.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static3.anImage1.getGraphics();
				local51.setColor(arg2);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static103.aFont1);
				local51.setColor(Color.white);
				arg1.method729(22, local51, (304 - arg1.method764(Static16.aFontMetrics1)) / 2);
				local6.drawImage(Static3.anImage1, Static24.anInt629 / 2 - 152, Static16.anInt390 / 2 + -18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static16.anInt390 / 2 - 18;
				@Pc(145) int local145 = Static24.anInt629 / 2 - 152;
				local6.setColor(arg2);
				local6.drawRect(local145, local139, 303, 33);
				local6.fillRect(local145 + 2, local139 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local145 + 1, local139 + 1, 301, 31);
				local6.fillRect(local145 + arg0 * 3 + 2, local139 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static103.aFont1);
				local6.setColor(Color.white);
				arg1.method729(local139 + 22, local6, (304 - arg1.method764(Static16.aFontMetrics1)) / 2 + local145);
			}
		} catch (@Pc(224) Exception local224) {
			Static19.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!td;IZLclient!td;)V")
	public static void method1688(@OriginalArg(0) Class54 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class54 arg2) {
		Static1.aBoolean1 = arg1;
		Static65.aClass54_22 = arg2;
		Static38.aClass54_17 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V")
	public static void method1689() {
		aClass27_1147 = null;
		aClass27_1146 = null;
		aClass27_1148 = null;
		aClass3_Sub3_Sub2_Sub2Array12 = null;
		aClass5_1 = null;
		aClass32_4 = null;
		aClass27_1149 = null;
		aClass3_Sub3_Sub2_Sub1_2 = null;
		aClass27_1145 = null;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
	public static void method1690() {
		for (@Pc(10) Class3_Sub9 local10 = (Class3_Sub9) Static40.aClass28_9.method884(); local10 != null; local10 = (Class3_Sub9) Static40.aClass28_9.method875()) {
			if (local10.aClass3_Sub3_Sub4_1 != null) {
				local10.method1054();
			}
		}
	}
}
