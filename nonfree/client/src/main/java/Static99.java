import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!ie;")
	public static Class35 aClass35_26;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!id;")
	private static Class34 aClass34_1248 = Static9.method266("Loading sprites )2 ");

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt2511 = 0;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_1249 = aClass34_1248;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method1658() {
		aClass34_1248 = null;
		aClass34_1249 = null;
		aClass35_26 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!fd;Lclient!id;)Lclient!id;")
	public static Class34 method1661(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) Class34 arg1) {
		if (arg1.method981(Static49.aClass34_712) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(22) int local22 = arg1.method981(Static38.aClass34_529);
			if (local22 == -1) {
				while (true) {
					local22 = arg1.method981(Static9.aClass34_228);
					if (local22 == -1) {
						while (true) {
							local22 = arg1.method981(Static10.aClass34_247);
							if (local22 == -1) {
								while (true) {
									local22 = arg1.method981(Static72.aClass34_919);
									if (local22 == -1) {
										while (true) {
											local22 = arg1.method981(Static34.aClass34_476);
											if (local22 == -1) {
												while (true) {
													local22 = arg1.method981(Static50.aClass34_717);
													if (local22 == -1) {
														return arg1;
													}
													@Pc(236) Class34 local236 = Static81.aClass34_1058;
													if (Static34.aClass73_6 != null) {
														local236 = Static49.method911(Static34.aClass73_6.anInt2812);
														try {
															if (Static34.aClass73_6.anObject4 != null) {
																@Pc(252) byte[] local252 = ((String) Static34.aClass73_6.anObject4).getBytes("ISO-8859-1");
																local236 = Static51.method921(local252.length, local252, 0);
															}
														} catch (@Pc(261) UnsupportedEncodingException local261) {
														}
													}
													arg1 = Static91.method1554(new Class34[] { arg1.method962(local22, 0), local236, arg1.method956(local22 + 4) });
												}
											}
											arg1 = Static91.method1554(new Class34[] { arg1.method962(local22, 0), Static70.method1200(Static88.method1493(4, arg0)), arg1.method956(local22 + 2) });
										}
									}
									arg1 = Static91.method1554(new Class34[] { arg1.method962(local22, 0), Static70.method1200(Static88.method1493(3, arg0)), arg1.method956(local22 + 2) });
								}
							}
							arg1 = Static91.method1554(new Class34[] { arg1.method962(local22, 0), Static70.method1200(Static88.method1493(2, arg0)), arg1.method956(local22 + 2) });
						}
					}
					arg1 = Static91.method1554(new Class34[] { arg1.method962(local22, 0), Static70.method1200(Static88.method1493(1, arg0)), arg1.method956(local22 + 2) });
				}
			}
			arg1 = Static91.method1554(new Class34[] { arg1.method962(local22, 0), Static70.method1200(Static88.method1493(0, arg0)), arg1.method956(local22 + 2) });
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1662() {
		for (@Pc(6) Class1_Sub23 local6 = (Class1_Sub23) Static127.aClass38_16.method1034(); local6 != null; local6 = (Class1_Sub23) Static127.aClass38_16.method1038()) {
			if (local6.aClass1_Sub4_Sub3_2 != null) {
				Static30.aClass1_Sub4_Sub4_2.method1903(local6.aClass1_Sub4_Sub3_2);
				local6.aClass1_Sub4_Sub3_2 = null;
			}
			if (local6.aClass1_Sub4_Sub3_3 != null) {
				Static30.aClass1_Sub4_Sub4_2.method1903(local6.aClass1_Sub4_Sub3_3);
				local6.aClass1_Sub4_Sub3_3 = null;
			}
		}
		Static127.aClass38_16.method1044();
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method1664() {
		Static10.method277(Static129.aClass1_Sub9_15);
		Static66.anInt1751++;
		if (Static114.aBoolean155 && Static112.aBoolean152) {
			@Pc(30) int local30 = Static19.anInt658;
			@Pc(32) int local32 = Static39.anInt1143;
			local30 -= Static6.anInt393;
			local32 -= Static47.anInt1347;
			if (Static76.anInt2064 > local30) {
				local30 = Static76.anInt2064;
			}
			if (Static69.aClass1_Sub9_10.anInt1053 + Static76.anInt2064 < Static129.aClass1_Sub9_15.anInt1053 + local30) {
				local30 = Static69.aClass1_Sub9_10.anInt1053 + Static76.anInt2064 - Static129.aClass1_Sub9_15.anInt1053;
			}
			if (local32 < Static7.anInt425) {
				local32 = Static7.anInt425;
			}
			if (Static7.anInt425 + Static69.aClass1_Sub9_10.anInt1067 < local32 - -Static129.aClass1_Sub9_15.anInt1067) {
				local32 = Static7.anInt425 + Static69.aClass1_Sub9_10.anInt1067 - Static129.aClass1_Sub9_15.anInt1067;
			}
			@Pc(100) int local100 = local32 - Static67.anInt1773;
			@Pc(105) int local105 = local30 - Static126.anInt2995;
			@Pc(108) int local108 = Static129.aClass1_Sub9_15.anInt1078;
			if (Static66.anInt1751 > Static129.aClass1_Sub9_15.anInt1029 && (local108 < local100 || -local108 > local100 || local108 < local105 || local105 < -local108)) {
				Static46.aBoolean77 = true;
			}
			@Pc(144) int local144 = Static69.aClass1_Sub9_10.anInt1064 + local30 - Static76.anInt2064;
			@Pc(153) int local153 = local32 + Static69.aClass1_Sub9_10.anInt1046 - Static7.anInt425;
			@Pc(162) Class1_Sub5 local162;
			if (Static129.aClass1_Sub9_15.anObjectArray21 != null && Static46.aBoolean77) {
				local162 = new Class1_Sub5();
				local162.anObjectArray1 = Static129.aClass1_Sub9_15.anObjectArray21;
				local162.anInt570 = local144;
				local162.anInt571 = local153;
				local162.aClass1_Sub9_3 = Static129.aClass1_Sub9_15;
				Static56.method1567(local162);
			}
			if (Static26.anInt842 == 0) {
				if (Static46.aBoolean77) {
					if (Static129.aClass1_Sub9_15.anObjectArray18 != null) {
						local162 = new Class1_Sub5();
						local162.anInt570 = local144;
						local162.aClass1_Sub9_2 = Static8.aClass1_Sub9_1;
						local162.aClass1_Sub9_3 = Static129.aClass1_Sub9_15;
						local162.anObjectArray1 = Static129.aClass1_Sub9_15.anObjectArray18;
						local162.anInt571 = local153;
						Static56.method1567(local162);
					}
					if (Static8.aClass1_Sub9_1 != null && Static78.method1368(Static129.aClass1_Sub9_15) != null) {
						Static21.aClass1_Sub19_Sub1_1.method2105(119);
						Static21.aClass1_Sub19_Sub1_1.method2080(Static129.aClass1_Sub9_15.anInt1050);
						Static21.aClass1_Sub19_Sub1_1.method2054(Static8.aClass1_Sub9_1.anInt1020);
						Static21.aClass1_Sub19_Sub1_1.method2080(Static8.aClass1_Sub9_1.anInt1050);
						Static21.aClass1_Sub19_Sub1_1.method2054(Static129.aClass1_Sub9_15.anInt1020);
					}
				} else if ((Static56.anInt2386 == 1 || Static90.method2085(Static71.anInt1876 - 1)) && Static71.anInt1876 > 2) {
					Static10.method274();
				} else if (Static71.anInt1876 > 0) {
					Static118.method1878(Static71.anInt1876 - 1);
				}
				Static129.aClass1_Sub9_15 = null;
			}
		} else if (Static66.anInt1751 > 1) {
			Static129.aClass1_Sub9_15 = null;
		}
	}
}
