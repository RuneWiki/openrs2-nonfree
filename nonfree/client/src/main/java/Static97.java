import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!wc;")
	public static Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	public static int anInt2770 = 0;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
	public static int anInt2774 = 0;

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
	public static int anInt2778 = -1;

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
	public static int anInt2779 = 2;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method1818() {
		Static127.anInt2664 = 0;
		@Pc(8) int local8 = (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 >> 7) + Static13.anInt410;
		@Pc(27) int local27 = Static112.anInt3118 + (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 >> 7);
		if (local27 >= 3053 && local27 <= 3156 && local8 >= 3056 && local8 <= 3136) {
			Static127.anInt2664 = 1;
		}
		if (local27 >= 3072 && local27 <= 3118 && local8 >= 9492 && local8 <= 9535) {
			Static127.anInt2664 = 1;
		}
		if (Static127.anInt2664 == 1 && local27 >= 3139 && local27 <= 3199 && local8 >= 3008 && local8 <= 3062) {
			Static127.anInt2664 = 0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
	public static void method1819(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static20.anInt829; local12++) {
			@Pc(20) Class3_Sub1_Sub1_Sub3_Sub2 local20 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[Static128.anIntArray390[local12]];
			@Pc(28) int local28 = (Static128.anIntArray390[local12] << 14) + 536870912;
			if (local20 != null && local20.method1023() && local20.aClass3_Sub1_Sub16_1.aBoolean111 == arg0 && local20.aClass3_Sub1_Sub16_1.method2096()) {
				@Pc(55) int local55 = local20.anInt1524 >> 7;
				@Pc(60) int local60 = local20.anInt1494 >> 7;
				if (local55 >= 0 && local55 < 104 && local60 >= 0 && local60 < 104) {
					if (local20.anInt1532 == 1 && (local20.anInt1524 & 0x7F) == 64 && (local20.anInt1494 & 0x7F) == 64) {
						if (Static83.anIntArrayArray63[local55][local60] == Static130.anInt3484) {
							continue;
						}
						Static83.anIntArrayArray63[local55][local60] = Static130.anInt3484;
					}
					if (!local20.aClass3_Sub1_Sub16_1.aBoolean109) {
						local28 += Integer.MIN_VALUE;
					}
					Static13.aClass58_1.method1767(Static119.anInt3243, local20.anInt1524, local20.anInt1494, Static66.method1353((local20.anInt1532 - 1) * 64 + local20.anInt1524, Static119.anInt3243, local20.anInt1532 * 64 + local20.anInt1494 - 64), local20.anInt1532 * 64 - 4, local20, local20.anInt1525, local28, local20.aBoolean48);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public static void method1820() {
		aClass3_Sub1_Sub2_Sub3_5 = null;
		anIntArray302 = null;
		aClass81_1 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(JI)Lclient!qf;")
	public static Class60 method1821(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) long local29 = arg0;
			@Pc(31) int local31 = 0;
			while (local29 != 0L) {
				local29 /= 37L;
				local31++;
			}
			@Pc(45) byte[] local45 = new byte[local31];
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local31--;
				local45[local31] = Static57.aByteArray96[(int) (local49 - arg0 * 37L)];
			}
			@Pc(79) Class60 local79 = new Class60();
			local79.aByteArray73 = local45;
			local79.anInt2817 = local45.length;
			return local79;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	public static void method1822() {
		try {
			if (Static52.aClass40_1 == null) {
				Static52.aClass40_1 = new Class40(Static35.aClass74_1, Static60.method1211(new Class60[] { Static61.aClass60_853, Static120.aClass60_1378, Static74.aClass60_1012 }).method1837());
			} else {
				@Pc(38) byte[] local38 = Static52.aClass40_1.method1253();
				if (local38 != null) {
					@Pc(45) Class3_Sub12 local45 = new Class3_Sub12(local38);
					Static38.anInt1287 = local45.method1963();
					Static14.aClass18Array1 = new Class18[Static38.anInt1287];
					for (@Pc(54) int local54 = 0; local54 < Static38.anInt1287; local54++) {
						@Pc(64) Class18 local64 = Static14.aClass18Array1[local54] = new Class18();
						@Pc(70) int local70 = local45.method1963();
						local64.aBoolean31 = (local70 & 0x8000) != 0;
						local64.anInt998 = local70 & 0x7FFF;
						local64.aClass60_379 = local45.method1943();
						local64.anInt996 = local45.method1969();
						local64.anInt994 = local54;
						local64.anInt991 = Static108.method2037(local64.aClass60_379);
					}
					Static73.method1521(0, Static69.anIntArray219, Static129.anIntArray391, Static14.aClass18Array1.length - 1, Static14.aClass18Array1);
					Static52.aClass40_1 = null;
					Static21.aBoolean27 = true;
				}
			}
		} catch (@Pc(127) Exception local127) {
			Static52.aClass40_1 = null;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z")
	public static boolean method1823(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)Lclient!na;")
	public static Class3_Sub1_Sub13 method1824(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub13 local6 = (Class3_Sub1_Sub13) Static126.aClass17_55.method643((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static23.aClass25_25.method931(arg0, 16);
		local6 = new Class3_Sub1_Sub13();
		if (local20 != null) {
			local6.method1548(new Class3_Sub12(local20));
		}
		Static126.aClass17_55.method644((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == anInt2778) {
			return true;
		} else if (arg0 == 1 && arg1 == Static73.anInt2370) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static89.anInt2619;
		}
	}
}
