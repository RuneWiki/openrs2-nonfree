import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "[[[Lclient!lg;")
	public static Class1_Sub17[][][] aClass1_Sub17ArrayArrayArray1;

	@OriginalMember(owner = "client!kb", name = "qb", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!kb", name = "xb", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
	public static int anInt2638 = 0;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
	public static int anInt2640 = -1;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_872 = Static49.method1293("Hidden)2");

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lclient!rf;")
	private static Class70 aClass70_873 = Static49.method1293("Walk here");

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
	public static final int anInt2644 = 3353893;

	@OriginalMember(owner = "client!kb", name = "pb", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!kb", name = "tb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_874 = aClass70_873;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ig;B)Z")
	public static boolean method1961(@OriginalArg(0) Class39 arg0) {
		if (arg0.anIntArray227 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray227.length; local17++) {
			@Pc(24) int local24 = Static147.method2884(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray236[local17];
			if (arg0.anIntArray227[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray227[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray227[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Lclient!re;")
	public static Class1_Sub1_Sub17 method1962(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static48.aClass25_7.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static104.aClass76_86.method3316(arg0, 12);
		local10 = new Class1_Sub1_Sub17();
		if (local20 != null) {
			local10.method2882(new Class1_Sub9(local20));
		}
		local10.method2885();
		Static48.aClass25_7.method1299(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)Lclient!ac;")
	public static Class1_Sub1_Sub2 method1963(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = (Class1_Sub1_Sub2) Static66.aClass25_10.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static174.aClass76_133.method3316(arg0, 10);
		local10 = new Class1_Sub1_Sub2();
		local10.anInt155 = arg0;
		if (local20 != null) {
			local10.method164(new Class1_Sub9(local20));
		}
		local10.method163();
		if (local10.anInt158 != -1) {
			local10.method171(method1963(local10.anInt158), method1963(local10.anInt159));
		}
		if (!Static162.aBoolean163 && local10.aBoolean7) {
			local10.aClass70Array2 = null;
			local10.aBoolean8 = false;
			local10.anInt177 = 0;
			local10.aClass70_49 = Static101.aClass70_931;
			local10.aClass70Array1 = null;
		}
		Static66.aClass25_10.method1299(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	public static void method1964() {
		Static131.aClass1_Sub9_Sub1_3.method1283(192);
		for (@Pc(18) Class1_Sub14 local18 = (Class1_Sub14) Static128.aClass30_14.method1470(); local18 != null; local18 = (Class1_Sub14) Static128.aClass30_14.method1473()) {
			if (local18.anInt2464 == 0) {
				Static32.method819(true, local18);
			}
		}
		if (Static81.aClass39_25 != null) {
			Static171.method3407(Static81.aClass39_25);
			Static81.aClass39_25 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!rf;Lclient!rf;Lclient!u;B)Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 method1965(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class76 arg2) {
		@Pc(8) int local8 = arg2.method3309(arg0);
		@Pc(14) int local14 = arg2.method3312(arg1, local8);
		return Static184.method3511(arg2, local14, local8);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)V")
	public static void method1966() {
		aClass70_873 = null;
		aClass1_Sub17ArrayArrayArray1 = null;
		aClass70_874 = null;
		aClass70_872 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ig;)Z")
	public static boolean method1967(@OriginalArg(1) Class39 arg0) {
		@Pc(9) int local9 = arg0.anInt2381;
		if (local9 == 205) {
			Static179.anInt4501 = 250;
			return true;
		}
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (local9 >= 300 && local9 <= 313) {
			local36 = (local9 - 300) / 2;
			local40 = local9 & 0x1;
			Static101.aClass49_2.method2226(local36, local40 == 1);
		}
		if (local9 >= 314 && local9 <= 323) {
			local36 = (local9 - 314) / 2;
			local40 = local9 & 0x1;
			Static101.aClass49_2.method2222(local40 == 1, local36);
		}
		if (local9 == 324) {
			Static101.aClass49_2.method2224(false);
		}
		if (local9 == 325) {
			Static101.aClass49_2.method2224(true);
		}
		if (local9 == 326) {
			Static131.aClass1_Sub9_Sub1_3.method1283(231);
			Static101.aClass49_2.method2221(Static131.aClass1_Sub9_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
	public static void method1969(@OriginalArg(0) boolean arg0) {
		if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 >> 7 == Static105.anInt2980 && Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 >> 7 == Static144.anInt3806) {
			Static105.anInt2980 = 0;
		}
		@Pc(21) int local21 = Static104.anInt2960;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local21; local31++) {
			@Pc(39) Class1_Sub1_Sub4_Sub2_Sub1 local39;
			@Pc(37) long local37;
			if (arg0) {
				local37 = 8791798054912L;
				local39 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1;
			} else {
				local39 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static26.anIntArray46[local31]];
				local37 = (long) Static26.anIntArray46[local31] << 32;
			}
			if (local39 != null && local39.method1517()) {
				local39.aBoolean52 = false;
				@Pc(68) int local68 = local39.anInt2030 >> 7;
				@Pc(73) int local73 = local39.anInt2001 >> 7;
				if ((Static79.aBoolean91 && Static104.anInt2960 > 50 || Static104.anInt2960 > 200) && !arg0 && local39.anInt2034 == local39.anInt2020) {
					local39.aBoolean52 = true;
				}
				if (local68 >= 0 && local68 < 104 && local73 >= 0 && local73 < 104) {
					if (local39.aClass1_Sub1_Sub4_Sub1_1 == null || Static47.anInt1654 < local39.anInt1299 || Static47.anInt1654 >= local39.anInt1312) {
						if ((local39.anInt2030 & 0x7F) == 64 && (local39.anInt2001 & 0x7F) == 64) {
							if (Static146.anInt3838 == Static93.anIntArrayArray24[local68][local73]) {
								continue;
							}
							Static93.anIntArrayArray24[local68][local73] = Static146.anInt3838;
						}
						local39.anInt2049 = Static156.method3142(local39.anInt2030, Static56.anInt1784, local39.anInt2001);
						Static134.method2577(Static56.anInt1784, local39.anInt2030, local39.anInt2001, local39.anInt2049, 60, local39, local39.anInt2040, local37, local39.aBoolean72);
					} else {
						local39.aBoolean52 = false;
						local39.anInt2049 = Static156.method3142(local39.anInt2030, Static56.anInt1784, local39.anInt2001);
						Static113.method2297(Static56.anInt1784, local39.anInt2030, local39.anInt2001, local39.anInt2049, local39, local39.anInt2040, local37, local39.anInt1296, local39.anInt1295, local39.anInt1311, local39.anInt1303);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[BI)I")
	public static int method1970(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static128.method3228(0, arg1, arg0);
	}
}
