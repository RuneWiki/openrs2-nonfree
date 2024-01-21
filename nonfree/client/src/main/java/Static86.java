import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_23;

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
	public static final int anInt2287 = 50;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "[I")
	public static int[] anIntArray384 = new int[4000];

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1255 = Static106.method1849("<col=ff7000>");

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
	public static int anInt2293 = 0;

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1256 = Static106.method1849("title_mute");

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1257 = Static106.method1849("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!pd", name = "mb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1258 = Static106.method1849("http:)4)4");

	@OriginalMember(owner = "client!pd", name = "nb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1259 = Static106.method1849("Titelbild geladen)3");

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1260 = Static106.method1849("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!pd", name = "sb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1261 = Static106.method1849("au");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIILclient!mc;I)V")
	public static void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub12 arg6) {
		@Pc(25) int local25;
		if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local25 = arg6.method1190();
				if (local25 == 0) {
					break;
				}
				if (local25 == 1) {
					arg6.method1190();
					break;
				}
				if (local25 <= 49) {
					arg6.method1190();
				}
			}
			return;
		}
		Static87.aByteArrayArrayArray15[arg5][arg1][arg2] = 0;
		while (true) {
			local25 = arg6.method1190();
			if (local25 == 0) {
				if (arg5 == 0) {
					Static44.anIntArrayArrayArray3[0][arg1][arg2] = -Static127.method2026(arg1 + arg4 + 932731, arg2 + (556238 - -arg0)) * 8;
				} else {
					Static44.anIntArrayArrayArray3[arg5][arg1][arg2] = Static44.anIntArrayArrayArray3[arg5 - 1][arg1][arg2] - 240;
				}
				break;
			}
			if (local25 == 1) {
				@Pc(88) int local88 = arg6.method1190();
				if (local88 == 1) {
					local88 = 0;
				}
				if (arg5 == 0) {
					Static44.anIntArrayArrayArray3[0][arg1][arg2] = -local88 * 8;
				} else {
					Static44.anIntArrayArrayArray3[arg5][arg1][arg2] = Static44.anIntArrayArrayArray3[arg5 - 1][arg1][arg2] - local88 * 8;
				}
				break;
			}
			if (local25 <= 49) {
				Static12.aByteArrayArrayArray5[arg5][arg1][arg2] = arg6.method1211();
				Static85.aByteArrayArrayArray14[arg5][arg1][arg2] = (byte) ((local25 - 2) / 4);
				Static131.aByteArrayArrayArray16[arg5][arg1][arg2] = (byte) (local25 + arg3 - 2 & 0x3);
			} else if (local25 <= 81) {
				Static87.aByteArrayArrayArray15[arg5][arg1][arg2] = (byte) (local25 - 49);
			} else {
				Static6.aByteArrayArrayArray4[arg5][arg1][arg2] = (byte) (local25 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	public static void method1606(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class1_Sub19 local10 = (Class1_Sub19) Static127.aClass65_44.method1803(); local10 != null; local10 = (Class1_Sub19) Static127.aClass65_44.method1801()) {
			if ((local10.aLong130 >> 48 & 0xFFFFL) == (long) arg0) {
				local10.method2050();
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!he;ILclient!sc;)Lclient!sc;")
	public static Class66 method1607(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(2) Class66 arg1) {
		if (arg1.method1819(Static101.aClass66_1395) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(18) int local18 = arg1.method1819(Static33.aClass66_497);
			if (local18 == -1) {
				while (true) {
					local18 = arg1.method1819(Static38.aClass66_1676);
					if (local18 == -1) {
						while (true) {
							local18 = arg1.method1819(Static94.aClass66_1338);
							if (local18 == -1) {
								while (true) {
									local18 = arg1.method1819(Static34.aClass66_105);
									if (local18 == -1) {
										while (true) {
											local18 = arg1.method1819(Static126.aClass66_1684);
											if (local18 == -1) {
												while (true) {
													local18 = arg1.method1819(Static58.aClass66_955);
													if (local18 == -1) {
														return arg1;
													}
													@Pc(240) Class66 local240 = Static13.aClass66_284;
													if (Static2.aClass32_1 != null) {
														local240 = Static45.method1022(Static2.aClass32_1.anInt1493);
														try {
															if (Static2.aClass32_1.anObject4 != null) {
																@Pc(256) byte[] local256 = ((String) Static2.aClass32_1.anObject4).getBytes("ISO-8859-1");
																local240 = Static38.method2001(0, local256.length, local256);
															}
														} catch (@Pc(267) UnsupportedEncodingException local267) {
														}
													}
													arg1 = Static41.method897(new Class66[] { arg1.method1807(0, local18), local240, arg1.method1831(local18 + 4) });
												}
											}
											arg1 = Static41.method897(new Class66[] { arg1.method1807(0, local18), Static74.method1425(Static122.method1993(arg0, 4)), arg1.method1831(local18 + 2) });
										}
									}
									arg1 = Static41.method897(new Class66[] { arg1.method1807(0, local18), Static74.method1425(Static122.method1993(arg0, 3)), arg1.method1831(local18 + 2) });
								}
							}
							arg1 = Static41.method897(new Class66[] { arg1.method1807(0, local18), Static74.method1425(Static122.method1993(arg0, 2)), arg1.method1831(local18 + 2) });
						}
					}
					arg1 = Static41.method897(new Class66[] { arg1.method1807(0, local18), Static74.method1425(Static122.method1993(arg0, 1)), arg1.method1831(local18 + 2) });
				}
			}
			arg1 = Static41.method897(new Class66[] { arg1.method1807(0, local18), Static74.method1425(Static122.method1993(arg0, 0)), arg1.method1831(local18 + 2) });
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public static void method1608() {
		aClass66_1259 = null;
		aByteArrayArray7 = null;
		aClass66_1260 = null;
		aClass1_Sub1_Sub2_Sub3_1 = null;
		aClass66_1261 = null;
		anIntArray384 = null;
		aClass66_1255 = null;
		aClass66_1256 = null;
		aClass5_Sub1_23 = null;
		aClass66_1257 = null;
		aClass66_1258 = null;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
	public static void method1610() {
		Static92.aClass60_74.method1747();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method1611(@OriginalArg(0) Class1_Sub1_Sub1_Sub5 arg0) {
		if (Static22.anInt636 == arg0.anInt1292 || arg0.anInt1266 == -1 || arg0.anInt1257 != 0 || arg0.anInt1246 + 1 > Static56.method1247(arg0.anInt1266).anIntArray452[arg0.anInt1259]) {
			@Pc(33) int local33 = arg0.anInt1292 - arg0.anInt1239;
			@Pc(39) int local39 = Static22.anInt636 - arg0.anInt1239;
			@Pc(50) int local50 = arg0.anInt1258 * 128 + arg0.anInt1248 * 64;
			@Pc(60) int local60 = arg0.anInt1248 * 64 + arg0.anInt1267 * 128;
			@Pc(71) int local71 = arg0.anInt1260 * 128 + arg0.anInt1248 * 64;
			arg0.anInt1261 = (local60 * local39 + (local33 - local39) * local50) / local33;
			@Pc(95) int local95 = arg0.anInt1248 * 64 + arg0.anInt1256 * 128;
			arg0.anInt1271 = (local39 * local71 + (local33 - local39) * local95) / local33;
		}
		arg0.anInt1277 = 0;
		if (arg0.anInt1272 == 0) {
			arg0.anInt1269 = 1024;
		}
		if (arg0.anInt1272 == 1) {
			arg0.anInt1269 = 1536;
		}
		if (arg0.anInt1272 == 2) {
			arg0.anInt1269 = 0;
		}
		if (arg0.anInt1272 == 3) {
			arg0.anInt1269 = 512;
		}
		arg0.anInt1290 = arg0.anInt1269;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!sc;Lclient!sc;ILclient!sf;)Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1 method1612(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(13) int local13 = arg2.method122(arg1);
		@Pc(19) int local19 = arg2.method116(local13, arg0);
		return Static40.method925(arg2, local13, local19);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(ZI)V")
	public static void method1613(@OriginalArg(0) boolean arg0) {
		if (Static73.aClass34_4 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub12 local16 = new Class1_Sub12(4);
			local16.method1197(arg0 ? 2 : 3);
			local16.method1170(0);
			Static73.aClass34_4.method1098(local16.aByteArray12, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static73.aClass34_4.method1104();
			} catch (@Pc(42) Exception local42) {
			}
			Static20.anInt618++;
			Static73.aClass34_4 = null;
		}
	}
}
