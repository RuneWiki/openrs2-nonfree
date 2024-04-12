import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!wc", name = "Zb", descriptor = "Lclient!ib;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ud;I)[B", line = 27)
	public static byte[] method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) (arg3 << 16) + ((long) arg0 << 1442185824) + (long) (arg1 + arg3 * 37 & 0xFFFF);
		if (Static35.aClass47_9 != null) {
			@Pc(31) Class2_Sub2_Sub3 local31 = (Class2_Sub2_Sub3) Static35.aClass47_9.method1325(local23);
			if (local31 != null) {
				return local31.aByteArray3;
			}
		}
		@Pc(42) byte[] local42 = arg2.method68(arg1, arg3);
		if (local42 == null) {
			return null;
		} else {
			if (Static35.aClass47_9 != null) {
				Static35.aClass47_9.method1332(local23, new Class2_Sub2_Sub3(local42));
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)V", line = 105)
	public static void method1738() {
		Class2_Sub3_Sub1.aClass40_742 = null;
		aClass12_1 = null;
		Class2_Sub3_Sub1.aClass40_740 = null;
		Class2_Sub3_Sub1.aClass40_739 = null;
		Class2_Sub3_Sub1.aClass40Array40 = null;
		Class2_Sub3_Sub1.aClass40_741 = null;
	}

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "(I)V", line = 148)
	public static void method1740() {
		while (Static89.method1561()) {
			if (Class2_Sub3.anInt2585 != -1 && Class44.anInt1826 == Class2_Sub3.anInt2585) {
				if (Static35.anInt935 == 85 && Class34.aClass40_448.method1169() > 0) {
					Class34.aClass40_448 = Class34.aClass40_448.method1180(Class34.aClass40_448.method1169() - 1, 0);
				}
				if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && Class34.aClass40_448.method1169() < 12) {
					Class34.aClass40_448 = Class34.aClass40_448.method1192(Static4.anInt135);
				}
			} else {
				@Pc(162) int local162;
				if (Class42.aBoolean146) {
					if (Static35.anInt935 == 85 && Class34.aClass40_447.method1169() > 0) {
						Class34.aClass40_447 = Class34.aClass40_447.method1180(Class34.aClass40_447.method1169() - 1, 0);
						Class41.aBoolean144 = true;
					}
					if (Static69.method1228(Static4.anInt135) && Class34.aClass40_447.method1169() < 80) {
						Class34.aClass40_447 = Class34.aClass40_447.method1192(Static4.anInt135);
						Class41.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84) {
						Class41.aBoolean144 = true;
						Class42.aBoolean146 = false;
						@Pc(117) long local117;
						if (Class58.anInt2180 == 1) {
							local117 = Class34.aClass40_447.method1179();
							Static58.method1062(local117);
						}
						if (Class58.anInt2180 == 2 && Class2_Sub3.anInt2594 > 0) {
							local117 = Class34.aClass40_447.method1179();
							Static64.method1115(local117);
						}
						if (Class58.anInt2180 == 3 && Class34.aClass40_447.method1169() > 0) {
							Class47.aClass2_Sub3_Sub1_4.method1736(22);
							Class47.aClass2_Sub3_Sub1_4.method1703(0);
							local162 = Class47.aClass2_Sub3_Sub1_4.anInt2546;
							Class47.aClass2_Sub3_Sub1_4.method1680(Class2_Sub2_Sub12_Sub1.aLong136);
							Static32.method624(Class34.aClass40_447, Class47.aClass2_Sub3_Sub1_4);
							Class47.aClass2_Sub3_Sub1_4.method1731(Class47.aClass2_Sub3_Sub1_4.anInt2546 - local162);
							if (Class63.anInt2515 == 2) {
								Class63.anInt2515 = 1;
								Class30.aBoolean95 = true;
								Class47.aClass2_Sub3_Sub1_4.method1736(132);
								Class47.aClass2_Sub3_Sub1_4.method1703(Class2_Sub2_Sub4.anInt583);
								Class47.aClass2_Sub3_Sub1_4.method1703(Class63.anInt2515);
								Class47.aClass2_Sub3_Sub1_4.method1703(Class62.anInt2491);
							}
						}
						if (Class58.anInt2180 == 4 && Class5.anInt121 < 100) {
							local117 = Class34.aClass40_447.method1179();
							Static14.method1254(local117);
						}
						if (Class58.anInt2180 == 5 && Class5.anInt121 > 0) {
							local117 = Class34.aClass40_447.method1179();
							Static74.method1345(local117);
						}
					}
				} else if (Class61.anInt2399 == 1) {
					if (Static35.anInt935 == 85 && Class34.aClass40_444.method1169() > 0) {
						Class34.aClass40_444 = Class34.aClass40_444.method1180(Class34.aClass40_444.method1169() - 1, 0);
						Class41.aBoolean144 = true;
					}
					if (Static61.method1094(Static4.anInt135) && Class34.aClass40_444.method1169() < 10) {
						Class34.aClass40_444 = Class34.aClass40_444.method1192(Static4.anInt135);
						Class41.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84) {
						if (Class34.aClass40_444.method1169() > 0) {
							local162 = 0;
							if (Class34.aClass40_444.method1176()) {
								local162 = Class34.aClass40_444.method1198();
							}
							Class47.aClass2_Sub3_Sub1_4.method1736(122);
							Class47.aClass2_Sub3_Sub1_4.method1725(local162);
						}
						Class41.aBoolean144 = true;
						Class61.anInt2399 = 0;
					}
				} else if (Class61.anInt2399 == 2) {
					if (Static35.anInt935 == 85 && Class34.aClass40_444.method1169() > 0) {
						Class34.aClass40_444 = Class34.aClass40_444.method1180(Class34.aClass40_444.method1169() - 1, 0);
						Class41.aBoolean144 = true;
					}
					if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && Class34.aClass40_444.method1169() < 12) {
						Class34.aClass40_444 = Class34.aClass40_444.method1192(Static4.anInt135);
						Class41.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84) {
						if (Class34.aClass40_444.method1169() > 0) {
							Class47.aClass2_Sub3_Sub1_4.method1736(51);
							Class47.aClass2_Sub3_Sub1_4.method1680(Class34.aClass40_444.method1179());
						}
						Class41.aBoolean144 = true;
						Class61.anInt2399 = 0;
					}
				} else if (Class61.anInt2399 == 3) {
					if (Static35.anInt935 == 85 && Class34.aClass40_444.method1169() > 0) {
						Class34.aClass40_444 = Class34.aClass40_444.method1180(Class34.aClass40_444.method1169() - 1, 0);
						Class41.aBoolean144 = true;
					}
					if (Static69.method1228(Static4.anInt135) && Class34.aClass40_444.method1169() < 40) {
						Class34.aClass40_444 = Class34.aClass40_444.method1192(Static4.anInt135);
						Class41.aBoolean144 = true;
					}
				} else if (Class53.anInt1994 == -1 && Class52.anInt1971 == -1) {
					if (Static35.anInt935 == 85 && Class34.aClass40_451.method1169() > 0) {
						Class34.aClass40_451 = Class34.aClass40_451.method1180(Class34.aClass40_451.method1169() - 1, 0);
						Class41.aBoolean144 = true;
					}
					if (Static69.method1228(Static4.anInt135) && Class34.aClass40_451.method1169() < 80) {
						Class34.aClass40_451 = Class34.aClass40_451.method1192(Static4.anInt135);
						Class41.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84 && Class34.aClass40_451.method1169() > 0) {
						if (Class34.anInt1550 == 2) {
							if (Class34.aClass40_451.method1184(Class2_Sub11.aClass40_494)) {
								Static32.method626();
							}
							if (Class34.aClass40_451.method1184(Class49.aClass40_560)) {
								Class2_Sub2_Sub12_Sub1_Sub2.aBoolean173 = true;
							}
							if (Class34.aClass40_451.method1184(Class2_Sub2_Sub5.aClass40_182)) {
								Class2_Sub2_Sub12_Sub1_Sub2.aBoolean173 = false;
							}
							if (Class34.aClass40_451.method1184(Class37.aClass40_480)) {
								for (local162 = 0; local162 < 4; local162++) {
									for (@Pc(435) int local435 = 1; local435 < 103; local435++) {
										for (@Pc(439) int local439 = 1; local439 < 103; local439++) {
											Class18.aClass20Array3[local162].anIntArrayArray9[local435][local439] = 0;
										}
									}
								}
							}
							if (Class34.aClass40_451.method1184(Class9.aClass40_62) && Class56.anInt2132 == 2) {
								throw new RuntimeException();
							}
							if (Class34.aClass40_451.method1184(Class30.aClass40_360)) {
								Class40.aBoolean143 = true;
							}
						}
						if (Class34.aClass40_451.method1168(Class2_Sub2_Sub4.aClass40_164)) {
							Class47.aClass2_Sub3_Sub1_4.method1736(92);
							Class47.aClass2_Sub3_Sub1_4.method1703(Class34.aClass40_451.method1169() - 1);
							Class47.aClass2_Sub3_Sub1_4.method1683(Class34.aClass40_451.method1185(2));
						} else {
							@Pc(525) Class40 local525 = Class34.aClass40_451.method1196();
							@Pc(527) byte local527 = 0;
							@Pc(529) byte local529 = 0;
							if (local525.method1168(Class27.aClass40_342)) {
								local527 = 0;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(7);
							} else if (local525.method1168(Class2_Sub5.aClass40_230)) {
								Class34.aClass40_451 = Class34.aClass40_451.method1185(4);
								local527 = 1;
							} else if (local525.method1168(client.aClass40_109)) {
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
								local527 = 2;
							} else if (local525.method1168(Class21.aClass40_218)) {
								local527 = 3;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(5);
							} else if (local525.method1168(Class50.aClass40_566)) {
								local527 = 4;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(7);
							} else if (local525.method1168(Class12_Sub1.aClass40_538)) {
								local527 = 5;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
							} else if (local525.method1168(Class18_Sub1.aClass40_132)) {
								Class34.aClass40_451 = Class34.aClass40_451.method1185(7);
								local527 = 6;
							} else if (local525.method1168(Canvas_Sub1.aClass40_355)) {
								local527 = 7;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(7);
							} else if (local525.method1168(Class50.aClass40_565)) {
								local527 = 8;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(7);
							} else if (local525.method1168(Class56.aClass40_610)) {
								local527 = 9;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
							} else if (local525.method1168(Class34.aClass40_450)) {
								local527 = 10;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
							} else if (local525.method1168(Class51.aClass40_568)) {
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
								local527 = 11;
							}
							local525 = Class34.aClass40_451.method1196();
							if (local525.method1168(Class2_Sub2_Sub13.aClass40_472)) {
								Class34.aClass40_451 = Class34.aClass40_451.method1185(5);
								local529 = 1;
							} else if (local525.method1168(Class9.aClass40_67)) {
								local529 = 2;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
							} else if (local525.method1168(Class2_Sub2_Sub11.aClass40_334)) {
								local529 = 3;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
							} else if (local525.method1168(Class58.aClass40_627)) {
								local529 = 4;
								Class34.aClass40_451 = Class34.aClass40_451.method1185(7);
							} else if (local525.method1168(Class41.aClass40_519)) {
								Class34.aClass40_451 = Class34.aClass40_451.method1185(6);
								local529 = 5;
							}
							Class47.aClass2_Sub3_Sub1_4.method1736(40);
							Class47.aClass2_Sub3_Sub1_4.method1703(0);
							@Pc(794) int local794 = Class47.aClass2_Sub3_Sub1_4.anInt2546;
							Class47.aClass2_Sub3_Sub1_4.method1703(local527);
							Class47.aClass2_Sub3_Sub1_4.method1703(local529);
							Static32.method624(Class34.aClass40_451, Class47.aClass2_Sub3_Sub1_4);
							Class47.aClass2_Sub3_Sub1_4.method1731(Class47.aClass2_Sub3_Sub1_4.anInt2546 - local794);
							if (Class2_Sub2_Sub4.anInt583 == 2) {
								Class2_Sub2_Sub4.anInt583 = 3;
								Class30.aBoolean95 = true;
								Class47.aClass2_Sub3_Sub1_4.method1736(132);
								Class47.aClass2_Sub3_Sub1_4.method1703(Class2_Sub2_Sub4.anInt583);
								Class47.aClass2_Sub3_Sub1_4.method1703(Class63.anInt2515);
								Class47.aClass2_Sub3_Sub1_4.method1703(Class62.anInt2491);
							}
						}
						Class34.aClass40_451 = Class34.aClass40_445;
						Class41.aBoolean144 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BZ)V", line = 640)
	public static void method1741(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) boolean arg2) {
		Static51.aClass5_29 = arg0;
		Static40.aBoolean150 = arg2;
		Static38.aClass5_13 = arg1;
		Static36.anInt971 = Static38.aClass5_13.method76(10);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLclient!ud;ILclient!ud;I)Lclient!sb;", line = 702)
	public static Class2_Sub2_Sub14 method1744(@OriginalArg(1) Class5 arg0, @OriginalArg(3) Class5 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.method81(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(27) byte[] local27 = arg0.method60(arg2, local12[local14]);
			if (local27 == null) {
				local7 = false;
			} else {
				@Pc(47) int local47 = (local27[0] & 0xFF) << 8 | local27[1] & 0xFF;
				@Pc(55) byte[] local55 = arg1.method60(local47, 0);
				if (local55 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub2_Sub14(arg0, arg1, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}
