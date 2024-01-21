import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qa", name = "hb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!qa", name = "lb", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array8;

	@OriginalMember(owner = "client!qa", name = "ub", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!qa", name = "vb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1085 = Static78.method1313("Private chat");

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1078 = aClass25_1085;

	@OriginalMember(owner = "client!qa", name = "sb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1084 = Static78.method1313("Classic");

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1079 = aClass25_1084;

	@OriginalMember(owner = "client!qa", name = "ib", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1080 = Static78.method1313("Free world");

	@OriginalMember(owner = "client!qa", name = "jb", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array20 = new Class25[100];

	@OriginalMember(owner = "client!qa", name = "kb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1081 = Static78.method1313("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!qa", name = "mb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1082 = aClass25_1080;

	@OriginalMember(owner = "client!qa", name = "Bb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1086 = Static78.method1313("Members only world");

	@OriginalMember(owner = "client!qa", name = "nb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1083 = aClass25_1086;

	@OriginalMember(owner = "client!qa", name = "ob", descriptor = "[I")
	public static int[] anIntArray398 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!qa", name = "Db", descriptor = "I")
	public static int anInt2300 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!qa", name = "Fb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1087 = aClass25_1081;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public static void method1640() {
		aClass25_1084 = null;
		aClass1_Sub2_Sub2_Sub1Array8 = null;
		aClass25_1085 = null;
		anIntArray398 = null;
		aClass25_1078 = null;
		aClass25_1086 = null;
		aClass25_1079 = null;
		aClass25_1082 = null;
		aClass25_1083 = null;
		anIntArrayArrayArray7 = null;
		aClass25Array20 = null;
		aClass25_1087 = null;
		aClass25_1081 = null;
		anIntArray399 = null;
		aClass25_1080 = null;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(B)V")
	public static void method1641() {
		Static111.aClass63_22.method1513();
		Static68.aClass63_10.method1513();
		Static78.aClass63_14.method1513();
		Static85.aClass63_16.method1513();
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Z")
	public static boolean method1642() {
		return Static88.anInt1984 == 0 ? Static89.aClass1_Sub3_Sub1_2.method336() : true;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public static void method1643() {
		for (@Pc(12) int local12 = -1; local12 < Static96.anInt2797; local12++) {
			@Pc(20) int local20;
			if (local12 == -1) {
				local20 = 2047;
			} else {
				local20 = Static28.anIntArray150[local12];
			}
			@Pc(30) Class1_Sub2_Sub3_Sub4_Sub2 local30 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local20];
			if (local30 != null) {
				Static35.method785(local30, 1);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(B)V")
	public static void method1644() {
		while (Static25.method585()) {
			if (Static108.anInt2497 != -1 && Static52.anInt1260 == Static108.anInt2497) {
				if (Static15.anInt410 == 85 && Static92.aClass25_979.method762() > 0) {
					Static92.aClass25_979 = Static92.aClass25_979.method781(0, Static92.aClass25_979.method762() - 1);
				}
				if ((Static48.method982(Static94.anInt2164) || Static94.anInt2164 == 32) && Static92.aClass25_979.method762() < 12) {
					Static92.aClass25_979 = Static92.aClass25_979.method778(Static94.anInt2164);
				}
			} else {
				@Pc(159) int local159;
				if (Static110.aBoolean115) {
					if (Static15.anInt410 == 85 && Static92.aClass25_982.method762() > 0) {
						Static92.aClass25_982 = Static92.aClass25_982.method781(0, Static92.aClass25_982.method762() - 1);
						Static110.aBoolean113 = true;
					}
					if (Static94.method1591(Static94.anInt2164) && Static92.aClass25_982.method762() < 80) {
						Static92.aClass25_982 = Static92.aClass25_982.method778(Static94.anInt2164);
						Static110.aBoolean113 = true;
					}
					if (Static15.anInt410 == 84) {
						Static110.aBoolean115 = false;
						Static110.aBoolean113 = true;
						@Pc(117) long local117;
						if (Static54.anInt1288 == 1) {
							local117 = Static92.aClass25_982.method770();
							Static101.method1681(local117);
						}
						if (Static54.anInt1288 == 2 && Static80.anInt1786 > 0) {
							local117 = Static92.aClass25_982.method770();
							Static129.method2046(local117);
						}
						if (Static54.anInt1288 == 3 && Static92.aClass25_982.method762() > 0) {
							Static68.aClass1_Sub5_Sub1_2.method688(251);
							Static68.aClass1_Sub5_Sub1_2.method676(0);
							local159 = Static68.aClass1_Sub5_Sub1_2.anInt792;
							Static68.aClass1_Sub5_Sub1_2.method640(Static116.aLong166);
							Static54.method1024(Static68.aClass1_Sub5_Sub1_2, Static92.aClass25_982);
							Static68.aClass1_Sub5_Sub1_2.method638(Static68.aClass1_Sub5_Sub1_2.anInt792 - local159);
							if (Static80.anInt1785 == 2) {
								Static80.anInt1785 = 1;
								Static18.aBoolean18 = true;
								Static68.aClass1_Sub5_Sub1_2.method688(11);
								Static68.aClass1_Sub5_Sub1_2.method676(Static82.anInt1811);
								Static68.aClass1_Sub5_Sub1_2.method676(Static80.anInt1785);
								Static68.aClass1_Sub5_Sub1_2.method676(Static11.anInt279);
							}
						}
						if (Static54.anInt1288 == 4 && Static49.anInt1230 < 100) {
							local117 = Static92.aClass25_982.method770();
							Static94.method1590(local117);
						}
						if (Static54.anInt1288 == 5 && Static49.anInt1230 > 0) {
							local117 = Static92.aClass25_982.method770();
							Static92.method1556(local117);
						}
					}
				} else if (Static104.anInt2372 == 1) {
					if (Static15.anInt410 == 85 && Static92.aClass25_989.method762() > 0) {
						Static92.aClass25_989 = Static92.aClass25_989.method781(0, Static92.aClass25_989.method762() - 1);
						Static110.aBoolean113 = true;
					}
					if (Static78.method1314(Static94.anInt2164) && Static92.aClass25_989.method762() < 10) {
						Static92.aClass25_989 = Static92.aClass25_989.method778(Static94.anInt2164);
						Static110.aBoolean113 = true;
					}
					if (Static15.anInt410 == 84) {
						if (Static92.aClass25_989.method762() > 0) {
							local159 = 0;
							if (Static92.aClass25_989.method784()) {
								local159 = Static92.aClass25_989.method782();
							}
							Static68.aClass1_Sub5_Sub1_2.method688(73);
							Static68.aClass1_Sub5_Sub1_2.method633(local159);
						}
						Static104.anInt2372 = 0;
						Static110.aBoolean113 = true;
					}
				} else if (Static104.anInt2372 == 2) {
					if (Static15.anInt410 == 85 && Static92.aClass25_989.method762() > 0) {
						Static92.aClass25_989 = Static92.aClass25_989.method781(0, Static92.aClass25_989.method762() - 1);
						Static110.aBoolean113 = true;
					}
					if ((Static48.method982(Static94.anInt2164) || Static94.anInt2164 == 32) && Static92.aClass25_989.method762() < 12) {
						Static92.aClass25_989 = Static92.aClass25_989.method778(Static94.anInt2164);
						Static110.aBoolean113 = true;
					}
					if (Static15.anInt410 == 84) {
						if (Static92.aClass25_989.method762() > 0) {
							Static68.aClass1_Sub5_Sub1_2.method688(253);
							Static68.aClass1_Sub5_Sub1_2.method640(Static92.aClass25_989.method770());
						}
						Static110.aBoolean113 = true;
						Static104.anInt2372 = 0;
					}
				} else if (Static104.anInt2372 == 3) {
					if (Static15.anInt410 == 85 && Static92.aClass25_989.method762() > 0) {
						Static92.aClass25_989 = Static92.aClass25_989.method781(0, Static92.aClass25_989.method762() - 1);
						Static110.aBoolean113 = true;
					}
					if (Static94.method1591(Static94.anInt2164) && Static92.aClass25_989.method762() < 40) {
						Static92.aClass25_989 = Static92.aClass25_989.method778(Static94.anInt2164);
						Static110.aBoolean113 = true;
					}
				} else if (Static104.anInt2372 == 4) {
					if (Static15.anInt410 == 85 && Static92.aClass25_989.method762() > 0) {
						Static92.aClass25_989 = Static92.aClass25_989.method781(0, Static92.aClass25_989.method762() - 1);
						Static110.aBoolean113 = true;
					}
					if ((Static94.method1591(Static94.anInt2164) || Static94.anInt2164 == 32) && Static92.aClass25_989.method762() < 80) {
						Static92.aClass25_989 = Static92.aClass25_989.method778(Static94.anInt2164);
						Static110.aBoolean113 = true;
					}
					if (Static15.anInt410 == 84) {
						if (Static92.aClass25_989.method762() > 0) {
							Static68.aClass1_Sub5_Sub1_2.method688(221);
							Static68.aClass1_Sub5_Sub1_2.method676(Static92.aClass25_989.method762() + 1);
							Static68.aClass1_Sub5_Sub1_2.method637(Static92.aClass25_989);
						}
						Static104.anInt2372 = 0;
						Static110.aBoolean113 = true;
					}
				} else if (Static33.anInt916 == -1 && Static67.anInt1470 == -1) {
					if (Static32.anInt898 != 0 || Static5.anInt108 > 1) {
						Static82.method1381();
					}
					if (Static15.anInt410 == 85 && Static92.aClass25_984.method762() > 0) {
						Static92.aClass25_984 = Static92.aClass25_984.method781(0, Static92.aClass25_984.method762() - 1);
						Static110.aBoolean113 = true;
					}
					if (Static94.method1591(Static94.anInt2164) && Static92.aClass25_984.method762() < 80) {
						Static92.aClass25_984 = Static92.aClass25_984.method778(Static94.anInt2164);
						Static110.aBoolean113 = true;
					}
					if (Static15.anInt410 == 84 && Static92.aClass25_984.method762() > 0) {
						if (Static32.anInt898 != 0 || Static5.anInt108 > 1) {
							Static124.aClass25Array24[Static87.anInt1653++] = Static92.aClass25_984;
							Static123.anInt2891 = -1;
							if (Static87.anInt1653 >= 20) {
								Static87.anInt1653 = 0;
							}
						}
						if (Static5.anInt108 == 2) {
							if (Static92.aClass25_984.method786(Static126.aClass25_1416)) {
								System.gc();
							}
							if (Static92.aClass25_984.method786(Static99.aClass25_1091)) {
								Static52.method1008();
							}
							if (Static92.aClass25_984.method786(Static125.aClass25_1193)) {
								Static87.aBoolean63 = true;
							}
							if (Static92.aClass25_984.method786(Static40.aClass25_462)) {
								Static87.aBoolean63 = false;
							}
							if (Static92.aClass25_984.method786(Static89.aClass25_235)) {
								for (local159 = 0; local159 < 4; local159++) {
									for (@Pc(663) int local663 = 1; local663 < 103; local663++) {
										for (@Pc(667) int local667 = 1; local667 < 103; local667++) {
											Static102.aClass62Array1[local159].anIntArrayArray22[local663][local667] = 0;
										}
									}
								}
							}
							if (Static92.aClass25_984.method786(Static87.aClass25_796) && Static32.anInt898 == 2) {
								throw new RuntimeException();
							}
							if (Static92.aClass25_984.method786(Static74.aClass25_730)) {
								Static34.aBoolean37 = true;
							}
						}
						if (Static92.aClass25_984.method797(Static95.aClass25_1035)) {
							Static68.aClass1_Sub5_Sub1_2.method688(56);
							Static68.aClass1_Sub5_Sub1_2.method676(Static92.aClass25_984.method762() - 1);
							Static68.aClass1_Sub5_Sub1_2.method637(Static92.aClass25_984.method794(2));
						} else {
							@Pc(753) byte local753 = 0;
							@Pc(757) Class25 local757 = Static92.aClass25_984.method777();
							@Pc(759) byte local759 = 0;
							if (local757.method797(Static18.aClass25_244)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static18.aClass25_244.method762());
								local753 = 0;
							} else if (local757.method797(Static67.aClass25_683)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static67.aClass25_683.method762());
								local753 = 1;
							} else if (local757.method797(Static71.aClass25_698)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static71.aClass25_698.method762());
								local753 = 2;
							} else if (local757.method797(Static50.aClass25_524)) {
								local753 = 3;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static50.aClass25_524.method762());
							} else if (local757.method797(Static8.aClass25_123)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static8.aClass25_123.method762());
								local753 = 4;
							} else if (local757.method797(Static38.aClass25_452)) {
								local753 = 5;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static38.aClass25_452.method762());
							} else if (local757.method797(Static109.aClass25_1201)) {
								local753 = 6;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static109.aClass25_1201.method762());
							} else if (local757.method797(Static7.aClass25_84)) {
								local753 = 7;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static7.aClass25_84.method762());
							} else if (local757.method797(Static94.aClass25_1031)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static94.aClass25_1031.method762());
								local753 = 8;
							} else if (local757.method797(Static8.aClass25_122)) {
								local753 = 9;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static8.aClass25_122.method762());
							} else if (local757.method797(Static118.aClass25_1330)) {
								local753 = 10;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static118.aClass25_1330.method762());
							} else if (local757.method797(Static42.aClass25_480)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static42.aClass25_480.method762());
								local753 = 11;
							} else if (Static34.anInt947 != 0) {
								if (local757.method797(Static18.aClass25_241)) {
									local753 = 0;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static18.aClass25_241.method762());
								} else if (local757.method797(Static67.aClass25_682)) {
									local753 = 1;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static67.aClass25_682.method762());
								} else if (local757.method797(Static71.aClass25_697)) {
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static71.aClass25_697.method762());
									local753 = 2;
								} else if (local757.method797(Static50.aClass25_525)) {
									local753 = 3;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static50.aClass25_525.method762());
								} else if (local757.method797(Static8.aClass25_127)) {
									local753 = 4;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static8.aClass25_127.method762());
								} else if (local757.method797(Static38.aClass25_451)) {
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static38.aClass25_451.method762());
									local753 = 5;
								} else if (local757.method797(Static109.aClass25_1208)) {
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static109.aClass25_1208.method762());
									local753 = 6;
								} else if (local757.method797(Static7.aClass25_80)) {
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static7.aClass25_80.method762());
									local753 = 7;
								} else if (local757.method797(Static94.aClass25_1022)) {
									local753 = 8;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static94.aClass25_1022.method762());
								} else if (local757.method797(Static8.aClass25_126)) {
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static8.aClass25_126.method762());
									local753 = 9;
								} else if (local757.method797(Static118.aClass25_1331)) {
									local753 = 10;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static118.aClass25_1331.method762());
								} else if (local757.method797(Static42.aClass25_468)) {
									local753 = 11;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static42.aClass25_468.method762());
								}
							}
							local757 = Static92.aClass25_984.method777();
							if (local757.method797(Static106.aClass25_1174)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static106.aClass25_1174.method762());
								local759 = 1;
							} else if (local757.method797(Static112.aClass25_1273)) {
								local759 = 2;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static112.aClass25_1273.method762());
							} else if (local757.method797(Static77.aClass25_808)) {
								local759 = 3;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static77.aClass25_808.method762());
							} else if (local757.method797(Static123.aClass25_1399)) {
								local759 = 4;
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static123.aClass25_1399.method762());
							} else if (local757.method797(Static105.aClass25_1137)) {
								Static92.aClass25_984 = Static92.aClass25_984.method794(Static105.aClass25_1137.method762());
								local759 = 5;
							} else if (Static34.anInt947 != 0) {
								if (local757.method797(Static106.aClass25_1177)) {
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static106.aClass25_1177.method762());
									local759 = 1;
								} else if (local757.method797(Static112.aClass25_1271)) {
									local759 = 2;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static112.aClass25_1271.method762());
								} else if (local757.method797(Static77.aClass25_807)) {
									local759 = 3;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static77.aClass25_807.method762());
								} else if (local757.method797(Static123.aClass25_1400)) {
									local759 = 4;
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static123.aClass25_1400.method762());
								} else if (local757.method797(Static105.aClass25_1141)) {
									Static92.aClass25_984 = Static92.aClass25_984.method794(Static105.aClass25_1141.method762());
									local759 = 5;
								}
							}
							Static68.aClass1_Sub5_Sub1_2.method688(3);
							Static68.aClass1_Sub5_Sub1_2.method676(0);
							@Pc(1360) int local1360 = Static68.aClass1_Sub5_Sub1_2.anInt792;
							Static68.aClass1_Sub5_Sub1_2.method676(local753);
							Static68.aClass1_Sub5_Sub1_2.method676(local759);
							Static54.method1024(Static68.aClass1_Sub5_Sub1_2, Static92.aClass25_984);
							Static68.aClass1_Sub5_Sub1_2.method638(Static68.aClass1_Sub5_Sub1_2.anInt792 - local1360);
							if (Static82.anInt1811 == 2) {
								Static82.anInt1811 = 3;
								Static18.aBoolean18 = true;
								Static68.aClass1_Sub5_Sub1_2.method688(11);
								Static68.aClass1_Sub5_Sub1_2.method676(Static82.anInt1811);
								Static68.aClass1_Sub5_Sub1_2.method676(Static80.anInt1785);
								Static68.aClass1_Sub5_Sub1_2.method676(Static11.anInt279);
							}
						}
						Static92.aClass25_984 = Static92.aClass25_985;
						Static110.aBoolean113 = true;
					}
				}
			}
		}
	}
}
