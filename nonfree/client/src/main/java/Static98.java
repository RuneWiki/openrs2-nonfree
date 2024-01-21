import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	public static int anInt2160;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_10;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "Lclient!na;")
	public static Class1_Sub2_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
	public static int anInt2164;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "Lclient!tg;")
	private static Class81 aClass81_761 = Static120.method2057("Your account is already logged in)3");

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "Lclient!tg;")
	public static Class81 aClass81_760 = aClass81_761;

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "Lclient!nd;")
	public static Class59 aClass59_18 = new Class59(50);

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
	public static int anInt2162 = 0;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "Lclient!tg;")
	public static Class81 aClass81_762 = Static120.method2057("Nehmen");

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "Lclient!tg;")
	private static Class81 aClass81_763 = Static120.method2057("Your account has been disabled)3");

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
	public static int anInt2163 = 0;

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_764 = Static120.method2057(":chalreq:");

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_765 = aClass81_763;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_766 = Static120.method2057("logo");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)Z")
	public static boolean method1638(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lclient!tg;B)[Lclient!tg;")
	public static Class81[] method1639(@OriginalArg(0) Class81[] arg0) {
		@Pc(8) Class81[] local8 = new Class81[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static127.method2169(new Class81[] { Static149.method2548(local10), Static49.aClass81_421 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static127.method2169(new Class81[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public static void method1641() {
		aClass81_765 = null;
		aClass81_763 = null;
		aClass81_760 = null;
		aClass59_18 = null;
		aClass1_Sub2_Sub2_Sub2_Sub1_1 = null;
		aClass81_764 = null;
		aClass81_766 = null;
		aClass82_Sub1_10 = null;
		aClass81_762 = null;
		aClass81_761 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public static void method1642(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub12 local12 = (Class1_Sub12) Static157.aClass5_11.method134((long) arg0);
		if (local12 != null) {
			local12.method3134();
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public static void method1643() {
		try {
			if (Static112.anInt2523 == 0) {
				if (Static158.aClass41_3 != null) {
					Static158.aClass41_3.method1340();
					Static158.aClass41_3 = null;
				}
				Static94.aBoolean89 = false;
				Static112.anInt2523 = 1;
				Static160.aClass47_8 = null;
				Static121.anInt2702 = 0;
			}
			if (Static112.anInt2523 == 1) {
				if (Static160.aClass47_8 == null) {
					Static160.aClass47_8 = Static86.aClass68_2.method2222(Static141.anInt722, Static99.aString6);
				}
				if (Static160.aClass47_8.anInt1949 == 2) {
					throw new IOException();
				}
				if (Static160.aClass47_8.anInt1949 == 1) {
					Static158.aClass41_3 = new Class41((Socket) Static160.aClass47_8.anObject1, Static86.aClass68_2);
					Static112.anInt2523 = 2;
					Static160.aClass47_8 = null;
				}
			}
			if (Static112.anInt2523 == 2) {
				@Pc(74) long local74 = Static90.aLong73 = Static165.aClass81_1344.method2821();
				Static104.aClass1_Sub8_Sub1_2.anInt446 = 0;
				Static104.aClass1_Sub8_Sub1_2.method331(14);
				@Pc(88) int local88 = (int) (local74 >> 16 & 0x1FL);
				Static104.aClass1_Sub8_Sub1_2.method331(local88);
				Static158.aClass41_3.method1339(2, Static104.aClass1_Sub8_Sub1_2.aByteArray3);
				Static112.anInt2523 = 3;
				Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
			}
			@Pc(123) int local123;
			if (Static112.anInt2523 == 3) {
				if (Static139.aClass31_2 != null) {
					Static139.aClass31_2.method2999();
				}
				if (Static80.aClass31_1 != null) {
					Static80.aClass31_1.method2999();
				}
				local123 = Static158.aClass41_3.method1343();
				if (Static139.aClass31_2 != null) {
					Static139.aClass31_2.method2999();
				}
				if (Static80.aClass31_1 != null) {
					Static80.aClass31_1.method2999();
				}
				if (local123 != 0) {
					Static70.method1240(local123);
					return;
				}
				Static112.anInt2523 = 4;
				Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
			}
			if (Static112.anInt2523 == 4) {
				if (Static21.aClass1_Sub8_Sub1_1.anInt446 < 8) {
					local123 = Static158.aClass41_3.method1344();
					if (8 - Static21.aClass1_Sub8_Sub1_1.anInt446 < local123) {
						local123 = 8 - Static21.aClass1_Sub8_Sub1_1.anInt446;
					}
					if (local123 > 0) {
						Static158.aClass41_3.method1345(local123, Static21.aClass1_Sub8_Sub1_1.anInt446, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
						Static21.aClass1_Sub8_Sub1_1.anInt446 += local123;
					}
				}
				if (Static21.aClass1_Sub8_Sub1_1.anInt446 == 8) {
					Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
					Static133.aLong106 = Static21.aClass1_Sub8_Sub1_1.method363();
					Static112.anInt2523 = 5;
				}
			}
			if (Static112.anInt2523 == 5) {
				Static104.aClass1_Sub8_Sub1_2.anInt446 = 0;
				@Pc(210) int[] local210 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static133.aLong106 >> 32), (int) Static133.aLong106 };
				Static104.aClass1_Sub8_Sub1_2.method331(10);
				Static104.aClass1_Sub8_Sub1_2.method328(local210[0]);
				Static104.aClass1_Sub8_Sub1_2.method328(local210[1]);
				Static104.aClass1_Sub8_Sub1_2.method328(local210[2]);
				Static104.aClass1_Sub8_Sub1_2.method328(local210[3]);
				Static104.aClass1_Sub8_Sub1_2.method355(Static165.aClass81_1344.method2821());
				Static104.aClass1_Sub8_Sub1_2.method348(Static165.aClass81_1340);
				Static104.aClass1_Sub8_Sub1_2.method350(Static101.aBigInteger1, Static179.aBigInteger2);
				Static150.aClass1_Sub8_Sub1_3.anInt446 = 0;
				if (Static112.anInt2525 == 40) {
					Static150.aClass1_Sub8_Sub1_3.method331(18);
				} else {
					Static150.aClass1_Sub8_Sub1_3.method331(16);
				}
				Static150.aClass1_Sub8_Sub1_3.method331(Static104.aClass1_Sub8_Sub1_2.anInt446 + 93);
				Static150.aClass1_Sub8_Sub1_3.method328(485);
				Static150.aClass1_Sub8_Sub1_3.method331(Static50.aBoolean45 ? 1 : 0);
				Static166.method2913(Static150.aClass1_Sub8_Sub1_3);
				Static150.aClass1_Sub8_Sub1_3.method328(Static144.aClass82_Sub1_14.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static176.aClass82_Sub1_18.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static129.aClass82_Sub1_13.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static149.aClass82_Sub1_15.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static7.aClass82_Sub1_2.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static17.aClass82_Sub1_6.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static158.aClass82_Sub1_17.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static3.aClass82_Sub1_1.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static104.aClass82_Sub1_11.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static19.aClass82_Sub1_7.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static111.aClass82_Sub1_12.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static14.aClass82_Sub1_3.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static152.aClass82_Sub1_16.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(aClass82_Sub1_10.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static15.aClass82_Sub1_5.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method328(Static43.aClass82_Sub1_8.anInt3880);
				Static150.aClass1_Sub8_Sub1_3.method352(Static104.aClass1_Sub8_Sub1_2.anInt446, Static104.aClass1_Sub8_Sub1_2.aByteArray3);
				Static158.aClass41_3.method1339(Static150.aClass1_Sub8_Sub1_3.anInt446, Static150.aClass1_Sub8_Sub1_3.aByteArray3);
				Static104.aClass1_Sub8_Sub1_2.method368(local210);
				for (@Pc(421) int local421 = 0; local421 < 4; local421++) {
					local210[local421] += 50;
				}
				Static21.aClass1_Sub8_Sub1_1.method368(local210);
				Static112.anInt2523 = 6;
			}
			if (Static112.anInt2523 == 6 && Static158.aClass41_3.method1344() > 0) {
				local123 = Static158.aClass41_3.method1343();
				if (local123 == 21 && Static112.anInt2525 == 20) {
					Static112.anInt2523 = 7;
				} else if (local123 == 2) {
					Static112.anInt2523 = 9;
				} else if (local123 == 15 && Static112.anInt2525 == 40) {
					Static108.method1801();
					return;
				} else if (local123 == 23 && Static38.anInt1014 < 1) {
					Static38.anInt1014++;
					Static112.anInt2523 = 0;
				} else {
					Static70.method1240(local123);
					return;
				}
			}
			if (Static112.anInt2523 == 7 && Static158.aClass41_3.method1344() > 0) {
				Static44.anInt1083 = (Static158.aClass41_3.method1343() + 3) * 60;
				Static112.anInt2523 = 8;
			}
			if (Static112.anInt2523 == 8) {
				Static121.anInt2702 = 0;
				Static163.method2851(Static54.aClass81_457, Static127.method2169(new Class81[] { Static149.method2548(Static44.anInt1083 / 60), Static87.aClass81_685 }), Static44.aClass81_385);
				if (--Static44.anInt1083 <= 0) {
					Static112.anInt2523 = 0;
				}
			} else {
				if (Static112.anInt2523 == 9 && Static158.aClass41_3.method1344() >= 9) {
					Static51.anInt1221 = Static158.aClass41_3.method1343();
					Static122.anInt2751 = Static158.aClass41_3.method1343();
					Static44.aBoolean41 = Static158.aClass41_3.method1343() == 1;
					Static110.anInt2514 = Static158.aClass41_3.method1343();
					Static110.anInt2514 <<= 0x8;
					Static110.anInt2514 += Static158.aClass41_3.method1343();
					Static133.anInt2871 = Static158.aClass41_3.method1343();
					Static158.aClass41_3.method1345(1, 0, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
					Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
					Static92.anInt2058 = Static21.aClass1_Sub8_Sub1_1.method372();
					Static158.aClass41_3.method1345(2, 0, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
					Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
					anInt2162 = Static21.aClass1_Sub8_Sub1_1.method359();
					Static112.anInt2523 = 10;
				}
				if (Static112.anInt2523 != 10) {
					Static121.anInt2702++;
					if (Static121.anInt2702 > 2000) {
						if (Static38.anInt1014 < 1) {
							Static38.anInt1014++;
							Static112.anInt2523 = 0;
							if (Static141.anInt722 == Static97.anInt2131) {
								Static141.anInt722 = Static187.anInt4144;
							} else {
								Static141.anInt722 = Static97.anInt2131;
							}
						} else {
							Static70.method1240(-3);
						}
					}
				} else if (Static158.aClass41_3.method1344() >= anInt2162) {
					Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
					Static158.aClass41_3.method1345(anInt2162, 0, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
					Static157.method2708();
					Static35.anInt963 = -1;
					Static17.method374(false);
					Static92.anInt2058 = -1;
				}
			}
		} catch (@Pc(713) IOException local713) {
			if (Static38.anInt1014 < 1) {
				if (Static141.anInt722 == Static97.anInt2131) {
					Static141.anInt722 = Static187.anInt4144;
				} else {
					Static141.anInt722 = Static97.anInt2131;
				}
				Static38.anInt1014++;
				Static112.anInt2523 = 0;
			} else {
				Static70.method1240(-2);
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	public static void method1644() {
		for (@Pc(1) int local1 = 0; local1 < Static77.anInt1828; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static8.anInt164; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static141.anInt709; local7++) {
					@Pc(16) Class1_Sub17 local16 = Static167.aClass1_Sub17ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class22 local21 = local16.aClass22_1;
						if (local21 != null && local21.aClass1_Sub2_Sub1_1 instanceof Class1_Sub2_Sub1_Sub6) {
							@Pc(31) Class1_Sub2_Sub1_Sub6 local31 = (Class1_Sub2_Sub1_Sub6) local21.aClass1_Sub2_Sub1_1;
							Static95.method1589(local31, local1, local4, local7, 1, 1);
							if (local21.aClass1_Sub2_Sub1_2 instanceof Class1_Sub2_Sub1_Sub6) {
								@Pc(46) Class1_Sub2_Sub1_Sub6 local46 = (Class1_Sub2_Sub1_Sub6) local21.aClass1_Sub2_Sub1_2;
								Static95.method1589(local46, local1, local4, local7, 1, 1);
								Static159.method2763(local31, local46, 0, 0, 0, false);
								local21.aClass1_Sub2_Sub1_2 = local46.method2745(local46.aShort31, local46.aShort35, -50, -10, -50, false);
							}
							local21.aClass1_Sub2_Sub1_1 = local31.method2745(local31.aShort31, local31.aShort35, -50, -10, -50, false);
						}
						@Pc(104) Class1_Sub2_Sub1_Sub6 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt1851; local88++) {
							@Pc(94) Class75 local94 = local16.aClass75Array2[local88];
							if (local94 != null && local94.aClass1_Sub2_Sub1_7 instanceof Class1_Sub2_Sub1_Sub6) {
								local104 = (Class1_Sub2_Sub1_Sub6) local94.aClass1_Sub2_Sub1_7;
								Static95.method1589(local104, local1, local4, local7, local94.anInt3161 + 1 - local94.anInt3164, local94.anInt3165 - local94.anInt3158 + 1);
								local94.aClass1_Sub2_Sub1_7 = local104.method2745(local104.aShort31, local104.aShort35, -50, -10, -50, false);
							}
						}
						@Pc(144) Class42 local144 = local16.aClass42_1;
						if (local144 != null && local144.aClass1_Sub2_Sub1_3 instanceof Class1_Sub2_Sub1_Sub6) {
							local104 = (Class1_Sub2_Sub1_Sub6) local144.aClass1_Sub2_Sub1_3;
							Static32.method2360(local104, local1, local4, local7);
							local144.aClass1_Sub2_Sub1_3 = local104.method2745(local104.aShort31, local104.aShort35, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}
}
