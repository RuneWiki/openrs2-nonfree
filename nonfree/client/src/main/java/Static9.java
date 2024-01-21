import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_72 = Static81.method1507(":assist:");

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_73 = Static81.method1507("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_5 = new Class86(64);

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_74 = Static81.method1507("No response from server)3");

	@OriginalMember(owner = "client!ah", name = "X", descriptor = "Lclient!dj;")
	public static Class24 aClass24_75 = aClass24_74;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
	public static void method229(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static138.anInt3107; local12++) {
			@Pc(20) Class5_Sub2_Sub2 local20 = Static148.aClass5_Sub2_Sub2Array1[Static138.anIntArray254[local12]];
			@Pc(29) long local29 = (long) Static138.anIntArray254[local12] << 32 | 0x20000000L;
			if (local20 != null && local20.method1894() && arg0 == local20.aClass1_Sub2_Sub21_1.aBoolean182 && local20.aClass1_Sub2_Sub21_1.method3044()) {
				@Pc(50) int local50 = local20.anInt2501 >> 7;
				@Pc(55) int local55 = local20.anInt2448 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local20.anInt2480 == 1 && (local20.anInt2501 & 0x7F) == 64 && (local20.anInt2448 & 0x7F) == 64) {
						if (Static39.anInt1032 == Static53.anIntArrayArray10[local50][local55]) {
							continue;
						}
						Static53.anIntArrayArray10[local50][local55] = Static39.anInt1032;
					}
					if (!local20.aClass1_Sub2_Sub21_1.aBoolean184) {
						local29 |= Long.MIN_VALUE;
					}
					local20.anInt2459 = Static37.method699(local20.anInt2448 + local20.anInt2480 * 64 - 64, Static170.anInt3799, local20.anInt2480 * 64 + local20.anInt2501 - 64);
					Static160.method3564(Static170.anInt3799, local20.anInt2501, local20.anInt2448, local20.anInt2459, local20.anInt2480 * 64 + 60 - 64, local20, local20.anInt2474, local29, local20.aBoolean116);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[Lclient!vc;IBI)V")
	public static void method230(@OriginalArg(0) int arg0, @OriginalArg(1) Class98[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			@Pc(18) Class98 local18 = arg1[local13];
			if (local18 != null && local18.anInt4424 == arg2) {
				if (local18.aByte10 == 0) {
					local18.anInt4400 = local18.anInt4405;
				} else if (local18.aByte10 == 1) {
					local18.anInt4400 = arg3 - local18.anInt4405;
				} else if (local18.aByte10 == 2) {
					local18.anInt4400 = arg3 * local18.anInt4405 >> 14;
				} else if (local18.aByte10 == 3) {
					if (local18.anInt4373 == 2) {
						local18.anInt4400 = local18.anInt4410 * (local18.anInt4405 - 1) + local18.anInt4405 * 32;
					} else if (local18.anInt4373 == 7) {
						local18.anInt4400 = (local18.anInt4405 - 1) * local18.anInt4410 + local18.anInt4405 * 115;
					}
				}
				if (local18.anInt4401 > local18.anInt4367 - local18.anInt4400) {
					local18.anInt4401 = local18.anInt4367 - local18.anInt4400;
				}
				if (local18.aByte8 == 0) {
					local18.anInt4403 = local18.anInt4417;
				} else if (local18.aByte8 == 1) {
					local18.anInt4403 = arg0 - local18.anInt4417;
				} else if (local18.aByte8 == 2) {
					local18.anInt4403 = arg0 * local18.anInt4417 >> 14;
				} else if (local18.aByte8 == 3) {
					if (local18.anInt4373 == 2) {
						local18.anInt4403 = local18.anInt4417 * 32 + (local18.anInt4417 - 1) * local18.anInt4392;
					} else if (local18.anInt4373 == 7) {
						local18.anInt4403 = local18.anInt4417 * 12 + local18.anInt4392 * (local18.anInt4417 - 1);
					}
				}
				if (local18.aByte9 == 0) {
					local18.anInt4358 = local18.anInt4421;
				} else if (local18.aByte9 == 1) {
					local18.anInt4358 = local18.anInt4421 + (arg0 - local18.anInt4403) / 2;
				} else if (local18.aByte9 == 2) {
					local18.anInt4358 = arg0 - local18.anInt4421 - local18.anInt4403;
				} else if (local18.aByte9 == 3) {
					local18.anInt4358 = local18.anInt4421 * arg0 >> 14;
				} else if (local18.aByte9 == 4) {
					local18.anInt4358 = (arg0 - local18.anInt4403) / 2 + (arg0 * local18.anInt4421 >> 14);
				} else {
					local18.anInt4358 = arg0 - (arg0 * local18.anInt4421 >> 14) - local18.anInt4403;
				}
				if (local18.anInt4347 - local18.anInt4403 < local18.anInt4348) {
					local18.anInt4348 = local18.anInt4347 - local18.anInt4403;
				}
				if (local18.anInt4401 < 0) {
					local18.anInt4401 = 0;
				}
				if (local18.aByte11 == 0) {
					local18.anInt4356 = local18.anInt4364;
				} else if (local18.aByte11 == 1) {
					local18.anInt4356 = local18.anInt4364 + (arg3 - local18.anInt4400) / 2;
				} else if (local18.aByte11 == 2) {
					local18.anInt4356 = arg3 - local18.anInt4400 - local18.anInt4364;
				} else if (local18.aByte11 == 3) {
					local18.anInt4356 = local18.anInt4364 * arg3 >> 14;
				} else if (local18.aByte11 == 4) {
					local18.anInt4356 = (arg3 * local18.anInt4364 >> 14) + (arg3 - local18.anInt4400) / 2;
				} else {
					local18.anInt4356 = arg3 - (local18.anInt4364 * arg3 >> 14) - local18.anInt4400;
				}
				if (local18.anInt4348 < 0) {
					local18.anInt4348 = 0;
				}
				if (local18.anInt4373 == 0) {
					Static104.method1814(local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!dj;ILclient!dj;Lclient!ve;)[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] method234(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class69 arg2) {
		@Pc(4) int local4 = arg2.method2205(arg0);
		@Pc(15) int local15 = arg2.method2203(local4, arg1);
		return Static103.method1785(local4, local15, arg2);
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)V")
	public static void method235(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static49.aClass57_12.method1872((long) arg0);
		if (local12 != null) {
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray170.length; local25++) {
				local12.anIntArray170[local25] = -1;
				local12.anIntArray171[local25] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method236() {
		Static161.aBoolean168 = true;
		Static169.aLong122 = 0L;
		Static26.aBoolean30 = true;
		Static147.aClass85_1.anInt3582 = 0;
		Static211.anInt4670 = 0;
		Static80.method1483();
		Static143.anInt3204 = -1;
		Static150.anInt3361 = 0;
		Static178.anInt3968 = -1;
		Static176.aClass1_Sub7_Sub1_34.anInt3592 = 0;
		Static39.anInt1027 = -1;
		Static192.anInt4303 = 0;
		Static48.anInt1203 = 0;
		Static8.anInt202 = -1;
		Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
		for (@Pc(2602) int local2602 = 0; local2602 < Static56.aClass48Array1.length; local2602++) {
			Static56.aClass48Array1[local2602] = null;
		}
		Static53.aBoolean73 = false;
		Static156.anInt3437 = 0;
		Static135.method2294(0);
		for (@Pc(2628) int local2628 = 0; local2628 < 100; local2628++) {
			Static103.aClass24Array15[local2628] = null;
		}
		Static125.anInt2738 = 0;
		Static192.anInt4308 = (int) (Math.random() * 30.0D) - 20;
		Static179.anInt3975 = -1;
		Static35.anInt4154 = 0;
		Static66.anInt1660 = 0;
		Static115.anInt2586 = (int) (Math.random() * 120.0D) - 60;
		Static66.anInt1655 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static178.aBoolean185 = false;
		Static174.anInt3879 = 0;
		Static103.anInt2308 = 0;
		Static198.anInt4435 = (int) (Math.random() * 100.0D) - 50;
		Static138.anInt3107 = 0;
		Static28.anInt732 = (int) (Math.random() * 80.0D) - 40;
		Static82.anInt1956 = 0;
		Static29.anInt759 = (int) (Math.random() * 110.0D) - 55;
		Static36.anInt973 = 0;
		for (@Pc(2704) int local2704 = 0; local2704 < 2048; local2704++) {
			Static110.aClass5_Sub2_Sub1Array1[local2704] = null;
			Static114.aClass1_Sub7Array1[local2704] = null;
		}
		for (@Pc(2720) int local2720 = 0; local2720 < 32768; local2720++) {
			Static148.aClass5_Sub2_Sub2Array1[local2720] = null;
		}
		Static87.aClass5_Sub2_Sub1_1 = Static110.aClass5_Sub2_Sub1Array1[2047] = new Class5_Sub2_Sub1();
		Static201.aClass87_29.method2831();
		Static207.aClass87_27.method2831();
		@Pc(2752) int local2752;
		@Pc(2756) int local2756;
		for (@Pc(2748) int local2748 = 0; local2748 < 4; local2748++) {
			for (local2752 = 0; local2752 < 104; local2752++) {
				for (local2756 = 0; local2756 < 104; local2756++) {
					Static31.aClass87ArrayArrayArray1[local2748][local2752][local2756] = null;
				}
			}
		}
		Static185.aClass87_28 = new Class87();
		Static192.anInt4307 = 0;
		Static105.anInt2367 = 0;
		for (local2752 = 0; local2752 < Static84.anInt2011; local2752++) {
			@Pc(2796) Class1_Sub2_Sub2 local2796 = Static50.method908(local2752);
			if (local2796 != null && local2796.anInt237 == 0) {
				Static10.anIntArray129[local2752] = 0;
				Static122.anIntArray213[local2752] = 0;
			}
		}
		for (local2756 = 0; local2756 < Static24.anIntArray69.length; local2756++) {
			Static24.anIntArray69[local2756] = -1;
		}
		if (Static177.anInt3924 != -1) {
			Static53.method1055(Static177.anInt3924);
		}
		for (@Pc(2845) Class1_Sub11 local2845 = (Class1_Sub11) Static115.aClass57_25.method1876(); local2845 != null; local2845 = (Class1_Sub11) Static115.aClass57_25.method1873()) {
			Static66.method1316(local2845, true);
		}
		Static177.anInt3924 = -1;
		Static115.aClass57_25 = new Class57(8);
		Static10.aClass98_10 = null;
		Static53.aBoolean73 = false;
		Static156.anInt3437 = 0;
		Static69.aClass21_2.method631(null, new int[5], false, -1);
		for (@Pc(2881) int local2881 = 0; local2881 < 8; local2881++) {
			Static13.aClass24Array3[local2881] = null;
			Static82.aBooleanArray8[local2881] = false;
		}
		Static10.method1183();
		Static156.aBoolean160 = true;
		for (@Pc(2901) int local2901 = 0; local2901 < 100; local2901++) {
			Static62.aBooleanArray7[local2901] = true;
		}
		Static25.aClass1_Sub27Array1 = null;
		Static132.anInt2948 = 0;
		Static16.aClass24_115 = null;
		for (@Pc(2921) int local2921 = 0; local2921 < 6; local2921++) {
			Static77.aClass88Array1[local2921] = new Class88();
		}
		for (@Pc(2935) int local2935 = 0; local2935 < 25; local2935++) {
			Static122.anIntArray212[local2935] = 0;
			Static30.anIntArray75[local2935] = 0;
			Static136.anIntArray251[local2935] = 0;
		}
		Static193.aBoolean202 = true;
		Static107.aClass24_725 = Static86.aClass24_614;
		Static3.aShortArray2 = Static166.aShortArray41 = Static133.aShortArray37 = new short[256];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method237(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
