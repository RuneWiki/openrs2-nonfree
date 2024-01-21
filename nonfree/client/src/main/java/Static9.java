import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public static int anInt294;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public static int anInt299;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!u;")
	private static Class74 aClass74_228 = Static72.method1077("Enter amount:");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_220 = aClass74_228;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!u;")
	private static Class74 aClass74_221 = Static72.method1077("Loading title screen )2 ");

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public static volatile int anInt292 = -1;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_226 = Static72.method1077("Your account is already logged in)3");

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_222 = aClass74_226;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_223 = Static72.method1077("nav");

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!u;")
	private static Class74 aClass74_224 = Static72.method1077("glow3:");

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_225 = Static72.method1077("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!u;")
	private static Class74 aClass74_230 = Static72.method1077("Loaded interfaces");

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_227 = aClass74_230;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_229 = aClass74_224;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_231 = aClass74_221;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public static int anInt300 = 0;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_232 = aClass74_224;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_233 = Static72.method1077("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public static int anInt301 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method225() {
		@Pc(9) int local9 = Static85.anInt1838 * 128 + 64;
		@Pc(15) int local15 = Static69.anInt1517 * 128 + 64;
		@Pc(29) int local29 = Static15.method348(local9, local15, Static117.anInt2529) - Static127.anInt2881;
		if (Static12.anInt362 < local29) {
			Static12.anInt362 += Static17.anInt543 + Static40.anInt953 * (local29 - Static12.anInt362) / 1000;
			if (local29 < Static12.anInt362) {
				Static12.anInt362 = local29;
			}
		}
		if (Static40.anInt958 < local15) {
			Static40.anInt958 += Static40.anInt953 * (local15 - Static40.anInt958) / 1000 + Static17.anInt543;
			if (local15 < Static40.anInt958) {
				Static40.anInt958 = local15;
			}
		}
		if (Static113.anInt2444 < local9) {
			Static113.anInt2444 += Static17.anInt543 + (local9 - Static113.anInt2444) * Static40.anInt953 / 1000;
			if (local9 < Static113.anInt2444) {
				Static113.anInt2444 = local9;
			}
		}
		if (Static113.anInt2444 > local9) {
			Static113.anInt2444 -= Static40.anInt953 * (Static113.anInt2444 - local9) / 1000 + Static17.anInt543;
			if (Static113.anInt2444 < local9) {
				Static113.anInt2444 = local9;
			}
		}
		if (Static40.anInt958 > local15) {
			Static40.anInt958 -= Static17.anInt543 + (Static40.anInt958 - local15) * Static40.anInt953 / 1000;
			if (Static40.anInt958 < local15) {
				Static40.anInt958 = local15;
			}
		}
		if (Static12.anInt362 > local29) {
			Static12.anInt362 -= Static17.anInt543 + Static40.anInt953 * (Static12.anInt362 - local29) / 1000;
			if (local29 > Static12.anInt362) {
				Static12.anInt362 = local29;
			}
		}
		local9 = Static23.anInt648 * 128 + 64;
		local15 = Static126.anInt2858 * 128 + 64;
		local29 = Static15.method348(local9, local15, Static117.anInt2529) - Static79.anInt1771;
		@Pc(200) int local200 = local15 - Static40.anInt958;
		@Pc(205) int local205 = local9 - Static113.anInt2444;
		@Pc(210) int local210 = local29 - Static12.anInt362;
		@Pc(222) int local222 = (int) Math.sqrt((double) (local205 * local205 + local200 * local200));
		@Pc(233) int local233 = (int) (Math.atan2((double) local210, (double) local222) * 325.949D) & 0x7FF;
		if (local233 < 128) {
			local233 = 128;
		}
		if (local233 > 383) {
			local233 = 383;
		}
		@Pc(256) int local256 = (int) (-325.949D * Math.atan2((double) local205, (double) local200)) & 0x7FF;
		if (local233 > Static53.anInt1290) {
			Static53.anInt1290 += Static21.anInt611 + (local233 - Static53.anInt1290) * Static45.anInt1025 / 1000;
			if (Static53.anInt1290 > local233) {
				Static53.anInt1290 = local233;
			}
		}
		@Pc(285) int local285 = local256 - Static100.anInt2211;
		if (local285 > 1024) {
			local285 -= 2048;
		}
		if (local285 < -1024) {
			local285 += 2048;
		}
		if (Static53.anInt1290 > local233) {
			Static53.anInt1290 -= (Static53.anInt1290 - local233) * Static45.anInt1025 / 1000 + Static21.anInt611;
			if (Static53.anInt1290 < local233) {
				Static53.anInt1290 = local233;
			}
		}
		if (local285 > 0) {
			Static100.anInt2211 += local285 * Static45.anInt1025 / 1000 + Static21.anInt611;
			Static100.anInt2211 &= 0x7FF;
		}
		if (local285 < 0) {
			Static100.anInt2211 -= -local285 * Static45.anInt1025 / 1000 + Static21.anInt611;
			Static100.anInt2211 &= 0x7FF;
		}
		@Pc(358) int local358 = local256 - Static100.anInt2211;
		if (local358 > 1024) {
			local358 -= 2048;
		}
		if (local358 < -1024) {
			local358 += 2048;
		}
		if (local358 < 0 && local285 > 0 || local358 > 0 && local285 < 0) {
			Static100.anInt2211 = local256;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!u;ILclient!u;Z)V")
	public static void method226(@OriginalArg(0) Class74 arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) boolean arg2) {
		if (Static46.aBoolean43) {
			Static31.method574();
			Static46.aBoolean43 = false;
			Static40.method664();
			Static51.method1479();
			Static68.method1035();
			Static15.method352();
			Static25.method496(Static77.aClass2_Sub2_Sub1_Sub3_9, Static107.anInt2345, Static41.anInt964, Static65.anInt1443);
			Static114.method1693(Static16.anIntArray49, Static42.anInt980, -1, Static66.anInt1458 == -1);
			Static79.aBoolean71 = true;
			Static107.aBoolean100 = true;
			Static109.aBoolean104 = true;
		}
		Static71.method1071();
		@Pc(56) short local56 = 151;
		@Pc(57) int local57 = local56 - 3;
		Static77.aClass2_Sub2_Sub1_Sub3_9.method314(arg0, 257, 148, 0);
		Static77.aClass2_Sub2_Sub1_Sub3_9.method314(arg0, 256, 147, 16777215);
		if (arg1 != null) {
			local57 += 15;
			if (arg2) {
				@Pc(82) int local82 = Static77.aClass2_Sub2_Sub1_Sub3_9.method302(arg1) + 4;
				Static58.method702(257 - local82 / 2, 152, local82, 11, 0);
			}
			Static77.aClass2_Sub2_Sub1_Sub3_9.method314(arg1, 257, 163, 0);
			Static77.aClass2_Sub2_Sub1_Sub3_9.method314(arg1, 256, 162, 16777215);
		}
		Static68.method1034();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method227() {
		aClass74_222 = null;
		aClass74_231 = null;
		aClass74_229 = null;
		aClass74_228 = null;
		aClass74_226 = null;
		aClass74_224 = null;
		aClass74_230 = null;
		aClass74_233 = null;
		aClass74_221 = null;
		aClass74_225 = null;
		aClass74_227 = null;
		aClass74_232 = null;
		aClass74_220 = null;
		aClass74_223 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ve;B)Lclient!ve;")
	public static Class2_Sub2_Sub17 method228(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		@Pc(22) int local22 = Static50.method806(Static19.method429(arg0));
		if (local22 == 0) {
			return null;
		}
		for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
			arg0 = Static41.method668(arg0.anInt2803);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZII)I")
	public static int method229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg2;
		return (arg2 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * local13 & 0xFF00FF00) + (local13 * (arg0 & 0xFF00) + ((arg1 & 0xFF00) * arg2) & 0xFF0000) >> 8;
	}
}
