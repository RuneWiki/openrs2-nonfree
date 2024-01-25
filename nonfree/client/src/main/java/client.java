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

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[J")
	public static final long[] aLongArray1 = new long[11];

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(21) char local21 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local14 / 2);
			@Pc(37) long local37 = (long) ((local14 & 0x1) == 0 ? local21 >>> 8 : local21 & 0xFF);
			@Pc(41) long local41 = local37 << 1;
			if (local41 >= 256L) {
				local41 ^= 0x11DL;
			}
			@Pc(55) long local55 = local41 << 1;
			if (local55 >= 256L) {
				local55 ^= 0x11DL;
			}
			@Pc(67) long local67 = local55 ^ local37;
			@Pc(71) long local71 = local55 << 1;
			if (local71 >= 256L) {
				local71 ^= 0x11DL;
			}
			@Pc(83) long local83 = local71 ^ local37;
			aLongArrayArray1[0][local14] = Static391.method2132(local83, Static391.method2132(local41 << 8, Static391.method2132(local67 << 16, Static391.method2132(local71 << 24, Static391.method2132(local37 << 32, Static391.method2132(Static391.method2132(local37 << 48, local37 << 56), local55 << 40))))));
			for (@Pc(119) int local119 = 1; local119 < 8; local119++) {
				aLongArrayArray1[local119][local14] = Static391.method2132(aLongArrayArray1[local119 - 1][local14] << 56, aLongArrayArray1[local119 - 1][local14] >>> 8);
			}
		}
		aLongArray1[0] = 0L;
		for (@Pc(160) int local160 = 1; local160 <= 10; local160++) {
			@Pc(167) int local167 = local160 * 8 - 8;
			aLongArray1[local160] = Static321.method4978(Static495.method6826(255L, aLongArrayArray1[7][local167 + 7]), Static321.method4978(Static321.method4978(Static321.method4978(Static321.method4978(Static495.method6826(1095216660480L, aLongArrayArray1[3][local167 + 3]), Static321.method4978(Static321.method4978(Static495.method6826(aLongArrayArray1[0][local167], -72057594037927936L), Static495.method6826(71776119061217280L, aLongArrayArray1[1][local167 + 1])), Static495.method6826(280375465082880L, aLongArrayArray1[2][local167 + 2]))), Static495.method6826(4278190080L, aLongArrayArray1[4][local167 + 4])), Static495.method6826(aLongArrayArray1[5][local167 + 5], 16711680L)), Static495.method6826(aLongArrayArray1[6][local167 + 6], 65280L)));
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static469.method6571("Argument count");
			}
			Static95.aClass147_1 = new Class147();
			Static95.aClass147_1.anInt3691 = Integer.parseInt(arg0[0]);
			Static343.aClass147_3 = new Class147();
			Static343.aClass147_3.anInt3691 = Integer.parseInt(arg0[1]);
			Static453.aClass147_5 = new Class147();
			Static453.aClass147_5.anInt3691 = Integer.parseInt(arg0[2]);
			Static376.aClass287_6 = Static130.aClass287_1;
			if (arg0[3].equals("live")) {
				Static166.aClass210_6 = Static67.aClass210_1;
			} else if (arg0[3].equals("rc")) {
				Static166.aClass210_6 = Static278.aClass210_8;
			} else if (arg0[3].equals("wip")) {
				Static166.aClass210_6 = Static80.aClass210_4;
			} else {
				Static469.method6571("modewhat");
			}
			Static470.anInt7957 = Static134.method2000(arg0[4]);
			if (Static470.anInt7957 == -1) {
				if (arg0[4].equals("english")) {
					Static470.anInt7957 = 0;
				} else if (arg0[4].equals("german")) {
					Static470.anInt7957 = 1;
				} else {
					Static469.method6571("language");
				}
			}
			Static263.aBoolean270 = false;
			Static465.aBoolean538 = false;
			if (arg0[5].equals("game0")) {
				Static57.aClass314_1 = Static140.aClass314_2;
			} else if (arg0[5].equals("game1")) {
				Static57.aClass314_1 = Static533.aClass314_4;
			} else {
				Static469.method6571("game");
			}
			Static95.aBoolean102 = false;
			Static492.aString102 = "";
			Static421.aLong191 = 0L;
			Static323.anInt5822 = 0;
			Static222.aBoolean250 = true;
			Static2.aBoolean4 = true;
			Static296.anInt9558 = 0;
			Static86.anInt7215 = Static57.aClass314_1.anInt8647;
			Static89.aString25 = null;
			Static418.aBoolean509 = false;
			Static161.anInt2834 = 0;
			@Pc(160) client local160 = new client();
			Static153.aClient1 = local160;
			local160.method850(Static166.aClass210_6.method5036() + 32, Static57.aClass314_1.aString110);
			Static183.aFrame2.setLocation(40, 40);
		} catch (@Pc(183) Exception local183) {
			Static169.method2641(null, local183);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method854() {
		if (Static146.anInt2581 == 14) {
			return;
		}
		Static358.anInt6263++;
		if (Static358.anInt6263 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static579.anInt9630 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static195.aRandom1.setSeed((long) Static579.anInt9630);
		}
		if (Static358.anInt6263 % 50 == 0) {
			Static36.anInt602 = Static161.anInt2830;
			Static284.anInt4689 = Static337.anInt5990;
			Static161.anInt2830 = 0;
			Static337.anInt5990 = 0;
		}
		this.method856();
		if (Static372.aClass181_3 != null) {
			Static372.aClass181_3.method3999();
		}
		Static568.method7786();
		Static539.aClass88_1.method6346();
		Static427.aClass134_1.method6090();
		if (Static176.aClass121_5 != null) {
			Static176.aClass121_5.method7100((int) Static137.method2058());
		}
		Static129.method1954();
		Static39.anInt679 = 0;
		Static71.anInt1181 = 0;
		for (@Pc(97) Interface16 local97 = Static539.aClass88_1.method6347(); local97 != null; local97 = Static539.aClass88_1.method6347()) {
			@Pc(103) int local103 = local97.method945();
			if (local103 == 2 || local103 == 3) {
				@Pc(117) char local117 = local97.method947();
				if (Static79.method1195() && (local117 == '`' || local117 == '§')) {
					if (Static409.method1601()) {
						Static279.method3988();
					} else {
						Static31.method453();
					}
				} else if (Static71.anInt1181 < 128) {
					Static142.anInterface16Array1[Static71.anInt1181] = local97;
					Static71.anInt1181++;
				}
			} else if (local103 == 0 && Static39.anInt679 < 75) {
				Static339.anInterface16Array2[Static39.anInt679] = local97;
				Static39.anInt679++;
			}
		}
		Static563.anInt9404 = 0;
		for (@Pc(180) Class6_Sub8 local180 = Static427.aClass134_1.method6095(); local180 != null; local180 = Static427.aClass134_1.method6095()) {
			@Pc(186) int local186 = local180.method7651();
			if (local186 == -1) {
				Static537.aClass275_189.method6370(local180);
			} else if (local186 == 6) {
				Static563.anInt9404 += local180.method7649();
			} else if (Static481.method6677(local186)) {
				Static274.aClass275_64.method6370(local180);
				if (Static274.aClass275_64.method6361() > 10) {
					Static274.aClass275_64.method6360();
				}
			}
		}
		if (Static409.method1601()) {
			Static32.method459();
		}
		if (Static569.method7793(Static146.anInt2581)) {
			Static147.method2182();
			Static220.method3227();
		} else if (Static425.method7745(Static146.anInt2581)) {
			Static343.method5179();
		}
		if (Static243.method6089(Static146.anInt2581) && !Static425.method7745(Static146.anInt2581)) {
			this.method866();
			Static281.method4015();
			Static107.method1735();
		} else if (Static21.method291(Static146.anInt2581) && !Static425.method7745(Static146.anInt2581)) {
			this.method866();
			Static107.method1735();
		} else if (Static146.anInt2581 == 12) {
			Static107.method1735();
		} else if (Static179.method2711(Static146.anInt2581) && !Static425.method7745(Static146.anInt2581)) {
			Static549.method7573();
		} else if (Static146.anInt2581 == 13) {
			Static107.method1735();
			if (Static350.anInt6166 != -3 && Static350.anInt6166 != 2 && Static350.anInt6166 != 15) {
				Static155.method2280(false);
			}
		}
		Static119.method6349(Static176.aClass121_5);
		Static274.aClass275_64.method6360();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method846() {
		if (Static567.anInt9503 != 2) {
			this.method867();
			return;
		}
		try {
			this.method867();
		} catch (@Pc(15) ThreadDeath local15) {
			throw local15;
		} catch (@Pc(18) Throwable local18) {
			Static169.method2641(local18.getMessage() + " (Recovered) " + this.method841(), local18);
			Static360.method5340(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method844() {
		if (Static362.aBoolean433) {
			Static480.method6664();
		}
		if (Static176.aClass121_5 != null) {
			Static176.aClass121_5.method7116();
		}
		if (Static147.aFrame1 != null) {
			Static158.method2320(Static152.aClass57_4, Static147.aFrame1);
			Static147.aFrame1 = null;
		}
		if (Static225.aClass71_1 != null) {
			Static225.aClass71_1.method5970();
			Static225.aClass71_1 = null;
		}
		Static487.method6722();
		Static294.aClass175_3.method3745();
		Static34.aClass195_6.method4686();
		if (Static295.aClass317_1 != null) {
			Static295.aClass317_1.method7310();
			Static295.aClass317_1 = null;
		}
		try {
			Static213.aClass320_2.method7341();
			for (@Pc(54) int local54 = 0; local54 < 34; local54++) {
				Static220.aClass320Array1[local54].method7341();
			}
			Static321.aClass320_4.method7341();
			Static225.aClass320_3.method7341();
		} catch (@Pc(75) IOException local75) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method851() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method856() {
		@Pc(11) boolean local11 = Static294.aClass175_3.method3749();
		if (!local11) {
			this.method859();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method859() {
		if (Static79.anInt1332 < Static294.aClass175_3.anInt4360) {
			Static271.aClass147_2.method3179();
			Static458.anInt7796 = (Static294.aClass175_3.anInt4360 - 1) * 5 * 50;
			if (Static458.anInt7796 > 3000) {
				Static458.anInt7796 = 3000;
			}
			if (Static294.aClass175_3.anInt4360 >= 2 && Static294.aClass175_3.anInt4361 == 6) {
				this.method838("js5connect_outofdate");
				Static146.anInt2581 = 14;
				return;
			}
			if (Static294.aClass175_3.anInt4360 >= 4 && Static294.aClass175_3.anInt4361 == -1) {
				this.method838("js5crc");
				Static146.anInt2581 = 14;
				return;
			}
			if (Static294.aClass175_3.anInt4360 >= 4 && Static569.method7793(Static146.anInt2581)) {
				if (Static294.aClass175_3.anInt4361 == 7 || Static294.aClass175_3.anInt4361 == 9) {
					this.method838("js5connect_full");
				} else if (Static294.aClass175_3.anInt4361 > 0) {
					this.method838("js5connect");
				} else {
					this.method838("js5io");
				}
				Static146.anInt2581 = 14;
				return;
			}
		}
		Static79.anInt1332 = Static294.aClass175_3.anInt4360;
		if (Static458.anInt7796 > 0) {
			Static458.anInt7796--;
			return;
		}
		try {
			if (Static430.anInt5651 == 0) {
				Static138.aClass278_6 = Static271.aClass147_2.method3182(Static152.aClass57_4);
				Static430.anInt5651++;
			}
			if (Static430.anInt5651 == 1) {
				if (Static138.aClass278_6.anInt7757 == 2) {
					this.method865(1000);
					return;
				}
				if (Static138.aClass278_6.anInt7757 == 1) {
					Static430.anInt5651++;
				}
			}
			if (Static430.anInt5651 == 2) {
				Static357.aClass73_2 = new Class73((Socket) Static138.aClass278_6.anObject24, Static152.aClass57_4);
				@Pc(175) Class6_Sub14 local175 = new Class6_Sub14(5);
				local175.method6035(Static184.aClass14_2.anInt222);
				local175.method5990(613);
				Static357.aClass73_2.method1489(5, local175.aByteArray88);
				Static430.anInt5651++;
				Static309.aLong145 = Static137.method2058();
			}
			if (Static430.anInt5651 == 3) {
				if (Static569.method7793(Static146.anInt2581) || Static357.aClass73_2.method1490() > 0) {
					@Pc(216) int local216 = Static357.aClass73_2.method1485();
					if (local216 != 0) {
						this.method865(local216);
						return;
					}
					Static430.anInt5651++;
				} else if (Static137.method2058() - Static309.aLong145 > 30000L) {
					this.method865(1001);
					return;
				}
			}
			if (Static430.anInt5651 == 4) {
				@Pc(261) boolean local261 = Static569.method7793(Static146.anInt2581) || Static243.method6089(Static146.anInt2581) || Static21.method291(Static146.anInt2581);
				Static294.aClass175_3.method3737(!local261, Static357.aClass73_2);
				Static430.anInt5651 = 0;
				Static138.aClass278_6 = null;
				Static357.aClass73_2 = null;
			}
		} catch (@Pc(278) IOException local278) {
			this.method865(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method865(@OriginalArg(1) int arg0) {
		Static357.aClass73_2 = null;
		Static294.aClass175_3.anInt4361 = arg0;
		Static430.anInt5651 = 0;
		Static138.aClass278_6 = null;
		Static294.aClass175_3.anInt4360++;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method866() {
		@Pc(21) int local21;
		if (Static146.anInt2581 == 7 && Static141.anInt2537 == 0) {
			if (Static105.anInt1967 > 1) {
				Static555.anInt8692 = Static48.anInt821;
				Static105.anInt1967--;
			}
			if (!Static330.aBoolean415) {
				Static560.method6157();
			}
			for (local21 = 0; local21 < 100 && Static300.method4189(); local21++) {
			}
		}
		Static267.anInt4424++;
		Static508.method7012(null, -1, -1);
		Static465.method6523(-1, null, -1);
		Static137.method2059();
		Static48.anInt821++;
		for (local21 = 0; local21 < Static505.anInt8419; local21++) {
			@Pc(65) Class29_Sub2_Sub1_Sub1 local65 = Static354.aClass6_Sub28Array1[local21].aClass29_Sub2_Sub1_Sub1_2;
			if (local65 != null) {
				@Pc(71) byte local71 = local65.aClass257_1.aByte69;
				if ((local71 & 0x1) != 0) {
					@Pc(81) int local81 = local65.method7008();
					@Pc(108) int local108;
					if ((local71 & 0x2) != 0 && local65.anInt8582 == 0 && Math.random() * 1000.0D < 10.0D) {
						local108 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(116) int local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local108 != 0 || local116 != 0) {
							@Pc(127) int local127 = local108 + local65.anIntArray661[0];
							@Pc(134) int local134 = local116 + local65.anIntArray660[0];
							if (local127 < 0) {
								local127 = 0;
							} else if (local127 > Static301.anInt4912 - local81 - 1) {
								local127 = Static301.anInt4912 - local81 - 1;
							}
							if (local134 < 0) {
								local134 = 0;
							} else if (local134 > Static473.anInt7969 - local81 - 1) {
								local134 = Static473.anInt7969 - local81 - 1;
							}
							@Pc(210) int local210 = Static394.method5824(local127, local65.anIntArray660[0], local81, Static281.anIntArray451, local134, -1, 0, true, 0, Static77.anIntArray94, Static296.aClass295Array3[local65.aByte103], local81, local81, local65.anIntArray661[0]);
							if (local210 > 0) {
								if (local210 > 9) {
									local210 = 9;
								}
								for (@Pc(219) int local219 = 0; local219 < local210; local219++) {
									local65.anIntArray661[local219] = Static281.anIntArray451[local210 - local219 - 1];
									local65.anIntArray660[local219] = Static77.anIntArray94[local210 - local219 - 1];
									local65.aByteArray110[local219] = 1;
								}
								local65.anInt8582 = local210;
							}
						}
					}
					Static96.method1501(true, local65);
					local108 = Static241.method3496(local65);
					Static484.method6712(local108, Static149.anInt2647, Static44.anInt717, local65);
					Static522.method7344(local65);
				}
			}
		}
		if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
			if (Static354.anInt6233 == 2) {
				Static410.method5971();
			} else {
				Static251.method4150();
			}
			if (Static388.anInt6921 >> 9 < 14 || Static388.anInt6921 >> 9 >= Static301.anInt4912 - 14 || Static220.anInt3753 >> 9 < 14 || Static473.anInt7969 - 14 <= Static220.anInt3753 >> 9) {
				Static571.method7814();
			}
		}
		while (true) {
			@Pc(339) Class6_Sub36 local339;
			@Pc(344) Class97 local344;
			@Pc(355) Class97 local355;
			do {
				local339 = (Class6_Sub36) Static80.aClass275_33.method6360();
				if (local339 == null) {
					while (true) {
						do {
							local339 = (Class6_Sub36) Static543.aClass275_192.method6360();
							if (local339 == null) {
								while (true) {
									do {
										local339 = (Class6_Sub36) Static446.aClass275_163.method6360();
										if (local339 == null) {
											if (Static382.aClass97_10 != null) {
												Static484.method6710();
											}
											if (Static358.anInt6263 % 1500 == 0) {
												Static32.method457();
											}
											if (Static146.anInt2581 == 7 && Static141.anInt2537 == 0) {
												Static361.method5345();
											}
											Static549.method7574();
											if (Static362.aBoolean433 && Static137.method2058() - 60000L > Static97.aLong54) {
												Static480.method6664();
											}
											for (@Pc(514) Class102_Sub1_Sub2 local514 = (Class102_Sub1_Sub2) Static468.aClass249_6.method5817(); local514 != null; local514 = (Class102_Sub1_Sub2) Static468.aClass249_6.method5815()) {
												if ((long) local514.anInt8196 < Static137.method2058() / 1000L - 5L) {
													if (local514.aShort111 > 0) {
														Static164.method2396("", 5, "", local514.aString101 + Static141.aClass104_64.method2145(Static470.anInt7957), 0, "");
													}
													if (local514.aShort111 == 0) {
														Static164.method2396("", 5, "", local514.aString101 + Static141.aClass104_65.method2145(Static470.anInt7957), 0, "");
													}
													local514.method7587();
												}
											}
											if (Static146.anInt2581 == 7 && Static141.anInt2537 == 0) {
												if (Static225.aClass71_1 == null) {
													Static155.method2280(false);
													return;
												}
												Static126.anInt2191++;
												if (Static126.anInt2191 > 50) {
													Static136.method2051(Static293.aClass160_65);
												}
												try {
													if (Static225.aClass71_1 != null && Static218.aClass6_Sub14_Sub2_1.anInt7244 > 0) {
														Static161.anInt2830 += Static218.aClass6_Sub14_Sub2_1.anInt7244;
														Static225.aClass71_1.method5968(Static218.aClass6_Sub14_Sub2_1.aByteArray88, Static218.aClass6_Sub14_Sub2_1.anInt7244);
														Static126.anInt2191 = 0;
														Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
														return;
													}
												} catch (@Pc(641) IOException local641) {
													Static155.method2280(false);
													return;
												}
											}
											return;
										}
										local344 = local339.aClass97_7;
										if (local344.lb < 0) {
											break;
										}
										local355 = Static133.method4068(local344.anInt2325);
									} while (local355 == null || local355.aClass97Array1 == null || local355.aClass97Array1.length <= local344.lb || local344 != local355.aClass97Array1[local344.lb]);
									Static100.method1639(local339);
								}
							}
							local344 = local339.aClass97_7;
							if (local344.lb < 0) {
								break;
							}
							local355 = Static133.method4068(local344.anInt2325);
						} while (local355 == null || local355.aClass97Array1 == null || local344.lb >= local355.aClass97Array1.length || local344 != local355.aClass97Array1[local344.lb]);
						Static100.method1639(local339);
					}
				}
				local344 = local339.aClass97_7;
				if (local344.lb < 0) {
					break;
				}
				local355 = Static133.method4068(local344.anInt2325);
			} while (local355 == null || local355.aClass97Array1 == null || local355.aClass97Array1.length <= local344.lb || local344 != local355.aClass97Array1[local344.lb]);
			Static100.method1639(local339);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method867() {
		if (Static146.anInt2581 == 14) {
			return;
		}
		@Pc(17) long local17 = Static138.method2066() / 1000000L - Static477.aLong221;
		Static477.aLong221 = Static138.method2066() / 1000000L;
		@Pc(31) boolean local31 = Static250.method3552();
		if (local31 && Static150.aBoolean182 && Static29.aClass45_1 != null) {
			Static29.aClass45_1.method6504();
		}
		if (Static218.method3201(Static146.anInt2581)) {
			if (Static517.aLong209 != 0L && Static517.aLong209 < Static137.method2058()) {
				Static111.method1753(Static480.aClass6_Sub37_Sub1_1.anInt6066, Static480.aClass6_Sub37_Sub1_1.anInt6057, Static354.method5293(), false);
			} else if (!Static176.aClass121_5.method7097() && Static350.aBoolean422) {
				Static229.method3374();
			}
		}
		@Pc(101) int local101;
		@Pc(105) int local105;
		if (Static147.aFrame1 == null) {
			@Pc(89) Container local89;
			if (Static183.aFrame2 != null) {
				local89 = Static183.aFrame2;
			} else if (Static189.anApplet4 == null) {
				local89 = Static2.anApplet_Sub1_1;
			} else {
				local89 = Static189.anApplet4;
			}
			local101 = local89.getSize().width;
			local105 = local89.getSize().height;
			if (Static183.aFrame2 == local89) {
				@Pc(111) Insets local111 = Static183.aFrame2.getInsets();
				local105 -= local111.top + local111.bottom;
				local101 -= local111.right + local111.left;
			}
			if (Static544.anInt9196 != local101 || local105 != Static371.anInt6408 || Static505.aBoolean576) {
				if (Static176.aClass121_5 == null || Static176.aClass121_5.method7122()) {
					Static194.method2915();
				} else {
					Static544.anInt9196 = local101;
					Static371.anInt6408 = local105;
				}
				Static517.aLong209 = Static137.method2058() + 500L;
				Static505.aBoolean576 = false;
			}
		}
		if (Static147.aFrame1 != null && !Static241.aBoolean259 && Static218.method3201(Static146.anInt2581)) {
			Static111.method1753(-1, -1, Static480.aClass6_Sub37_Sub1_1.anInt6045, false);
		}
		@Pc(179) boolean local179 = false;
		if (Static506.aBoolean578) {
			local179 = true;
			Static506.aBoolean578 = false;
		}
		if (local179) {
			Static149.method2202();
		}
		if (Static176.aClass121_5 != null && Static176.aClass121_5.method7097() || Static354.method5293() != 1) {
			Static260.method3643();
		}
		if (Static569.method7793(Static146.anInt2581)) {
			Static476.method6635(local179);
		} else if (Static257.method3630(Static146.anInt2581)) {
			Static91.method5093();
		} else if (Static346.method5215(Static146.anInt2581)) {
			Static91.method5093();
		} else if (Static425.method7745(Static146.anInt2581)) {
			if (Static274.anInt3318 == 1) {
				if (Static66.anInt1118 > Static79.anInt1330) {
					Static79.anInt1330 = Static66.anInt1118;
				}
				local101 = (Static79.anInt1330 - Static66.anInt1118) * 50 / Static79.anInt1330;
				Static87.method1420(Static141.aClass104_11.method2145(Static470.anInt7957) + "<br>(" + local101 + "%)", Static85.aClass56_2, true);
			} else if (Static274.anInt3318 == 2) {
				if (Static535.anInt6091 < Static235.anInt3967) {
					Static535.anInt6091 = Static235.anInt3967;
				}
				local101 = (Static535.anInt6091 - Static235.anInt3967) * 50 / Static535.anInt6091 + 50;
				Static87.method1420(Static141.aClass104_11.method2145(Static470.anInt7957) + "<br>(" + local101 + "%)", Static85.aClass56_2, true);
			} else {
				Static87.method1420(Static141.aClass104_11.method2145(Static470.anInt7957), Static85.aClass56_2, true);
			}
		} else if (Static146.anInt2581 == 10) {
			Static296.method7812(local17);
		} else if (Static146.anInt2581 == 13) {
			Static87.method1420(Static141.aClass104_13.method2145(Static470.anInt7957) + "<br>" + Static141.aClass104_14.method2145(Static470.anInt7957), Static85.aClass56_2, true);
		}
		if (Static278.anInt6568 == 3) {
			for (local101 = 0; local101 < Static73.anInt1201; local101++) {
				@Pc(378) Rectangle local378 = Class6_Sub1_Sub11.aRectangleArray1[local101];
				if (Static40.aBooleanArray4[local101]) {
					Static176.aClass121_5.method7109(local378.y, local378.width, local378.height, local378.x, -1996553985);
				} else if (Static44.aBooleanArray5[local101]) {
					Static176.aClass121_5.method7109(local378.y, local378.width, local378.height, local378.x, -1996554240);
				}
			}
		}
		if (Static409.method1601()) {
			Static423.method6210(Static176.aClass121_5);
		}
		if (Static152.aClass57_4.aBoolean75 && Static218.method3201(Static146.anInt2581) && Static278.anInt6568 == 0 && Static354.method5293() == 1 && !local179) {
			local101 = 0;
			for (local105 = 0; local105 < Static73.anInt1201; local105++) {
				if (Static44.aBooleanArray5[local105]) {
					Static44.aBooleanArray5[local105] = false;
					Static453.aRectangleArray2[local101++] = Class6_Sub1_Sub11.aRectangleArray1[local105];
				}
			}
			try {
				Static176.aClass121_5.method7133(Static453.aRectangleArray2, local101);
			} catch (@Pc(528) Exception_Sub1 local528) {
			}
		} else if (Static146.anInt2581 != 0) {
			for (local101 = 0; local101 < Static73.anInt1201; local101++) {
				Static44.aBooleanArray5[local101] = false;
			}
			try {
				Static176.aClass121_5.method7128();
			} catch (@Pc(470) Exception_Sub1 local470) {
				Static169.method2641(local470.getMessage() + " (Recovered) " + this.method841(), local470);
				Static360.method5340(0);
			}
		}
		if (Static480.aClass6_Sub37_Sub1_1.anInt6053 == 0) {
			Static149.method2211(15L);
		} else if (Static480.aClass6_Sub37_Sub1_1.anInt6053 == 1) {
			Static149.method2211(10L);
		} else if (Static480.aClass6_Sub37_Sub1_1.anInt6053 == 2) {
			Static149.method2211(5L);
		} else if (Static480.aClass6_Sub37_Sub1_1.anInt6053 == 3) {
			Static149.method2211(2L);
		}
		if (Static217.aBoolean247) {
			Static413.method6058();
		}
		if (Static480.aClass6_Sub37_Sub1_1.aBoolean407 && Static146.anInt2581 == 3 && Static487.anInt8139 != -1) {
			Static480.aClass6_Sub37_Sub1_1.aBoolean407 = false;
			Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method839() {
		if (Static567.anInt9503 != 2) {
			this.method854();
			return;
		}
		try {
			this.method854();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static169.method2641(local22.getMessage() + " (Recovered) " + this.method841(), local22);
			Static360.method5340(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method833()) {
			return;
		}
		Static95.aClass147_1 = new Class147();
		Static95.aClass147_1.anInt3691 = Integer.parseInt(this.getParameter("worldid"));
		Static343.aClass147_3 = new Class147();
		Static343.aClass147_3.anInt3691 = Integer.parseInt(this.getParameter("lobbyid"));
		Static343.aClass147_3.aString55 = this.getParameter("lobbyaddress");
		Static453.aClass147_5 = new Class147();
		Static453.aClass147_5.anInt3691 = Integer.parseInt(this.getParameter("demoid"));
		Static453.aClass147_5.aString55 = this.getParameter("demoaddress");
		Static376.aClass287_6 = Static238.method3460(Integer.parseInt(this.getParameter("modewhere")));
		if (Static130.aClass287_1 == Static376.aClass287_6) {
			Static376.aClass287_6 = Static154.aClass287_2;
		} else if (!Static272.method3834(Static376.aClass287_6) && Static376.aClass287_6 != Static192.aClass287_3) {
			Static376.aClass287_6 = Static192.aClass287_3;
		}
		Static166.aClass210_6 = Static245.method3526(Integer.parseInt(this.getParameter("modewhat")));
		if (Static80.aClass210_4 != Static166.aClass210_6 && Static166.aClass210_6 != Static278.aClass210_8 && Static166.aClass210_6 != Static67.aClass210_1) {
			Static166.aClass210_6 = Static67.aClass210_1;
		}
		try {
			Static470.anInt7957 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static470.anInt7957 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static263.aBoolean270 = true;
		} else {
			Static263.aBoolean270 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static465.aBoolean538 = true;
		} else {
			Static465.aBoolean538 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static54.aBoolean35 = true;
		} else {
			Static54.aBoolean35 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static57.aClass314_1 = Static140.aClass314_2;
			} else if (local152.equals("1")) {
				Static57.aClass314_1 = Static533.aClass314_4;
			}
		}
		try {
			Static323.anInt5822 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static323.anInt5822 = 0;
		}
		Static336.aString75 = this.getParameter("quiturl");
		Static492.aString102 = this.getParameter("settings");
		if (Static492.aString102 == null) {
			Static492.aString102 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static296.anInt9558 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static296.anInt9558 = 0;
			}
		}
		Static86.anInt7215 = Integer.parseInt(this.getParameter("colourid"));
		if (Static86.anInt7215 < 0 || Static92.aColorArray4.length <= Static86.anInt7215) {
			Static86.anInt7215 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static222.aBoolean250 = true;
			Static2.aBoolean4 = true;
		}
		@Pc(233) String local233 = this.getParameter("frombilling");
		if (local233 != null && local233.equals("true")) {
			Static418.aBoolean509 = true;
		}
		Static89.aString25 = this.getParameter("sskey");
		if (Static89.aString25 != null && Static89.aString25.length() < 2) {
			Static89.aString25 = null;
		}
		@Pc(257) String local257 = this.getParameter("force64mb");
		if (local257 != null && local257.equals("true")) {
			Static95.aBoolean102 = true;
		}
		@Pc(269) String local269 = this.getParameter("worldflags");
		if (local269 != null) {
			try {
				Static161.anInt2834 = Integer.parseInt(local269);
			} catch (@Pc(276) Exception local276) {
			}
		}
		@Pc(281) String local281 = this.getParameter("userFlow");
		if (local281 != null) {
			try {
				Static421.aLong191 = Long.parseLong(local281);
			} catch (@Pc(288) NumberFormatException local288) {
			}
		}
		if (Static140.aClass314_2 == Static57.aClass314_1) {
			Static381.anInt6587 = 503;
			Static282.anInt4679 = 765;
		} else if (Static57.aClass314_1 == Static533.aClass314_4) {
			Static381.anInt6587 = 480;
			Static282.anInt4679 = 640;
		}
		Static153.aClient1 = this;
		this.method840(Static166.aClass210_6.method5036() + 32, Static282.anInt4679, Static57.aClass314_1.aString110, Static381.anInt6587);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method836() {
		if (Static95.aBoolean102) {
			Static31.anInt551 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static194.method2915();
		Static34.aClass195_6 = new Class195(Static152.aClass57_4);
		Static294.aClass175_3 = new Class175();
		if (Static192.aClass287_3 != Static376.aClass287_6) {
			Static101.aByteArrayArray5 = new byte[50][];
		}
		Static480.aClass6_Sub37_Sub1_1 = new Class6_Sub37_Sub1(Static152.aClass57_4);
		if (Static192.aClass287_3 == Static376.aClass287_6) {
			Static95.aClass147_1.aString55 = this.getCodeBase().getHost();
		} else if (Static272.method3834(Static376.aClass287_6)) {
			Static95.aClass147_1.aString55 = this.getCodeBase().getHost();
			Static95.aClass147_1.anInt3693 = Static95.aClass147_1.anInt3691 + 40000;
			Static343.aClass147_3.anInt3693 = Static343.aClass147_3.anInt3691 + 40000;
			Static95.aClass147_1.anInt3696 = Static95.aClass147_1.anInt3691 + 50000;
			Static453.aClass147_5.anInt3693 = Static453.aClass147_5.anInt3691 + 40000;
			Static343.aClass147_3.anInt3696 = Static343.aClass147_3.anInt3691 + 50000;
			Static453.aClass147_5.anInt3696 = Static453.aClass147_5.anInt3691 + 50000;
		} else if (Static376.aClass287_6 == Static130.aClass287_1) {
			Static95.aClass147_1.aString55 = "127.0.0.1";
			Static343.aClass147_3.aString55 = "127.0.0.1";
			Static453.aClass147_5.aString55 = "127.0.0.1";
			Static95.aClass147_1.anInt3693 = Static95.aClass147_1.anInt3691 + 40000;
			Static343.aClass147_3.anInt3693 = Static343.aClass147_3.anInt3691 + 40000;
			Static453.aClass147_5.anInt3693 = Static453.aClass147_5.anInt3691 + 40000;
			Static95.aClass147_1.anInt3696 = Static95.aClass147_1.anInt3691 + 50000;
			Static343.aClass147_3.anInt3696 = Static343.aClass147_3.anInt3691 + 50000;
			Static453.aClass147_5.anInt3696 = Static453.aClass147_5.anInt3691 + 50000;
		}
		if (Static57.aClass314_1 == Static140.aClass314_2) {
			Static281.aBoolean287 = false;
		}
		Static271.aClass147_2 = Static95.aClass147_1;
		Static221.aShortArray75 = Static553.aShortArray145 = Static15.aShortArray136 = Static172.aShortArray59 = new short[256];
		if (Static533.aClass314_4 == Static57.aClass314_1) {
			Static33.aShortArrayArray2 = Static543.aShortArrayArray15;
			Static188.aShortArray61 = Static574.aShortArray99;
			Static330.aBoolean414 = true;
			Static62.aShortArray14 = Static284.aShortArray80;
			Static192.aShortArrayArray6 = Static534.aShortArrayArray14;
			Static276.anInt4600 = 16777215;
			Static252.anInt4138 = 0;
		} else {
			Static188.aShortArray61 = Static128.aShortArray42;
			Static192.aShortArrayArray6 = Static216.aShortArrayArray8;
			Static33.aShortArrayArray2 = Static317.aShortArrayArray12;
			Static62.aShortArray14 = Static419.aShortArray144;
		}
		Static539.aClass88_1 = Static126.method1921(Static34.aCanvas15);
		Static427.aClass134_1 = Static33.method469(Static34.aCanvas15);
		try {
			if (Static152.aClass57_4.aClass133_1 != null) {
				Static213.aClass320_2 = new Class320(Static152.aClass57_4.aClass133_1, 5200, 0);
				for (@Pc(210) int local210 = 0; local210 < 34; local210++) {
					Static220.aClass320Array1[local210] = new Class320(Static152.aClass57_4.aClass133Array1[local210], 6000, 0);
				}
				Static321.aClass320_4 = new Class320(Static152.aClass57_4.aClass133_2, 6000, 0);
				Static545.aClass331_4 = new Class331(255, Static213.aClass320_2, Static321.aClass320_4, 500000);
				Static225.aClass320_3 = new Class320(Static152.aClass57_4.aClass133_3, 24, 0);
				Static152.aClass57_4.aClass133_1 = null;
				Static152.aClass57_4.aClass133_3 = null;
				Static152.aClass57_4.aClass133Array1 = null;
				Static152.aClass57_4.aClass133_2 = null;
			}
		} catch (@Pc(268) IOException local268) {
			Static321.aClass320_4 = null;
			Static213.aClass320_2 = null;
			Static225.aClass320_3 = null;
			Static545.aClass331_4 = null;
		}
		if (Static376.aClass287_6 != Static192.aClass287_3) {
			Static386.aBoolean486 = true;
		}
		if (Static140.aClass314_2 == Static57.aClass314_1) {
			Static58.aString8 = Static141.aClass104_1.method2145(Static470.anInt7957);
		} else if (Static57.aClass314_1 == Static533.aClass314_4) {
			Static58.aString8 = Static141.aClass104_2.method2145(Static470.anInt7957);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method841() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static218.anInt3718 + "," + Static167.anInt3048 + "," + Static301.anInt4912 + "," + Static473.anInt7969 + "|";
			if (Static426.aClass29_Sub2_Sub1_Sub2_2 != null) {
				local7 = local7 + "2)" + Static282.anInt4677 + "," + (Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] + Static218.anInt3718) + "," + (Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0] + Static167.anInt3048) + "|";
			}
			local7 = local7 + "3)" + Static567.anInt9503 + "|4)" + Static480.aClass6_Sub37_Sub1_1.anInt6052 + "|5)" + Static354.method5293() + "|6)" + Static502.anInt8364 + "," + Static476.anInt8045 + "|";
			local7 = local7 + "7)" + Static480.aClass6_Sub37_Sub1_1.method5151(Static567.anInt9503) + "|";
			local7 = local7 + "8)" + Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503) + "|";
			local7 = local7 + "9)" + Static480.aClass6_Sub37_Sub1_1.aBoolean396 + "|";
			local7 = local7 + "10)" + Static480.aClass6_Sub37_Sub1_1.aBoolean401 + "|";
			local7 = local7 + "11)" + Static480.aClass6_Sub37_Sub1_1.aBoolean411 + "|";
			local7 = local7 + "12)" + Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503) + "|";
			local7 = local7 + "13)" + Static31.anInt551 + "|";
			local7 = local7 + "14)" + Static146.anInt2581;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(228) Throwable local228) {
			}
			try {
				if (Static567.anInt9503 == 2) {
					@Pc(234) Class local234 = Class.forName("java.lang.ClassLoader");
					@Pc(238) Field local238 = local234.getDeclaredField("nativeLibraries");
					@Pc(241) Class local241 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(251) Method local251 = local241.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local251.invoke(local238, Boolean.TRUE);
					@Pc(274) Vector local274 = (Vector) local238.get(client.class.getClassLoader());
					for (@Pc(276) int local276 = 0; local276 < local274.size(); local276++) {
						try {
							@Pc(282) Object local282 = local274.elementAt(local276);
							@Pc(287) Field local287 = local282.getClass().getDeclaredField("name");
							local251.invoke(local287, Boolean.TRUE);
							try {
								@Pc(302) String local302 = (String) local287.get(local282);
								if (local302 != null && local302.indexOf("sw3d.dll") != -1) {
									@Pc(315) Field local315 = local282.getClass().getDeclaredField("handle");
									local251.invoke(local315, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local315.getLong(local282));
									local251.invoke(local315, Boolean.FALSE);
								}
							} catch (@Pc(351) Throwable local351) {
							}
							local251.invoke(local287, Boolean.FALSE);
						} catch (@Pc(363) Throwable local363) {
						}
					}
				}
			} catch (@Pc(375) Throwable local375) {
			}
			local7 = local7 + "]";
		} catch (@Pc(386) Throwable local386) {
		}
		return local7;
	}
}
