import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
	public static int anInt1979;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "Lclient!md;")
	public static Class1_Sub17_Sub1 aClass1_Sub17_Sub1_2 = new Class1_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "Lclient!tj;")
	public static Class113 aClass113_1 = new Class113();

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_630 = Static186.method3527("Select");

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_629 = aClass50_630;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
	public static int anInt1980 = 0;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	public static void method1523() {
		for (@Pc(1) int local1 = 0; local1 < Static179.anInt3725; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static12.anInt236; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static232.anInt4450; local7++) {
					@Pc(16) Class1_Sub11 local16 = Static56.aClass1_Sub11ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class29 local21 = local16.aClass29_1;
						if (local21 != null && local21.aClass20_1.method3487()) {
							Static16.method228(local21.aClass20_1, local1, local4, local7, 1, 1);
							if (local21.aClass20_2 != null && local21.aClass20_2.method3487()) {
								Static16.method228(local21.aClass20_2, local1, local4, local7, 1, 1);
								local21.aClass20_1.method3490(local21.aClass20_2, 0, 0, 0, false);
								local21.aClass20_2 = local21.aClass20_2.method3497();
							}
							local21.aClass20_1 = local21.aClass20_1.method3497();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt1072; local77++) {
							@Pc(83) Class94 local83 = local16.aClass94Array1[local77];
							if (local83 != null && local83.aClass20_5.method3487()) {
								Static16.method228(local83.aClass20_5, local1, local4, local7, local83.anInt3692 + 1 - local83.anInt3686, local83.anInt3684 - local83.anInt3683 + 1);
								local83.aClass20_5 = local83.aClass20_5.method3497();
							}
						}
						@Pc(125) Class128 local125 = local16.aClass128_1;
						if (local125 != null && local125.aClass20_10.method3487()) {
							Static128.method2042(local125.aClass20_10, local1, local4, local7);
							local125.aClass20_10 = local125.aClass20_10.method3497();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	public static int method1524() {
		return Static93.anInt1907;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)V")
	public static void method1525() {
		@Pc(5) int local5 = Static187.aClass1_Sub1_Sub10_3.method1810(Static163.aClass50_1099);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static193.anInt3035; local11++) {
			local19 = Static187.aClass1_Sub1_Sub10_3.method1810(Static98.method1549(local11));
			if (local5 < local19) {
				local5 = local19;
			}
		}
		Static233.anInt4463 = Static193.anInt3035 * 15 + 22;
		Static40.aBoolean44 = true;
		local19 = Static193.anInt3035 * 15 + 21;
		local5 += 8;
		@Pc(53) int local53 = Static163.anInt3374;
		@Pc(60) int local60 = Static70.anInt1323 - local5 / 2;
		if (local5 + local60 > Static185.anInt3844) {
			local60 = Static185.anInt3844 - local5;
		}
		if (local53 + local19 > Static48.anInt1023) {
			local53 = Static48.anInt1023 - local19;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		Static126.anInt2534 = local5;
		Static15.anInt284 = local53;
		if (local60 < 0) {
			local60 = 0;
		}
		Static143.anInt2913 = local60;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!hh;)V")
	public static void method1526(@OriginalArg(1) Class50 arg0) {
		@Pc(7) int local7 = Static192.method3139(arg0);
		if (local7 == -1) {
			return;
		}
		Static44.anInt939 = Static131.aClass62_2.aShortArray32[local7] - Static121.anInt2393;
		Static95.anInt1938 = Static12.anInt239 + Static195.anInt3969 - Static131.aClass62_2.aShortArray31[local7] - 1;
		@Pc(39) int local39 = Static44.anInt939 - (int) ((float) Static124.aClass93_73.anInt3600 / Static198.aFloat6);
		@Pc(48) int local48 = (int) ((float) Static124.aClass93_73.anInt3600 / Static198.aFloat6) + Static44.anInt939;
		if (local39 < 0) {
			Static44.anInt939 = (int) ((float) Static124.aClass93_73.anInt3600 / Static198.aFloat6);
		}
		@Pc(72) int local72 = Static95.anInt1938 - (int) ((float) Static124.aClass93_73.anInt3620 / Static198.aFloat6);
		@Pc(81) int local81 = (int) ((float) Static124.aClass93_73.anInt3620 / Static198.aFloat6) + Static95.anInt1938;
		if (local72 < 0) {
			Static95.anInt1938 = (int) ((float) Static124.aClass93_73.anInt3620 / Static198.aFloat6);
		}
		if (Static164.anInt3383 < local48) {
			Static44.anInt939 = Static164.anInt3383 - (int) ((float) Static124.aClass93_73.anInt3600 / Static198.aFloat6);
		}
		if (Static12.anInt239 < local81) {
			Static95.anInt1938 = Static12.anInt239 - (int) ((float) Static124.aClass93_73.anInt3620 / Static198.aFloat6);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public static void method1527(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static201.aBooleanArray22[arg0]) {
			return;
		}
		Static145.aClass86_53.method3337(arg0);
		if (Static54.aClass93ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static54.aClass93ArrayArray1[arg0].length; local27++) {
			if (Static54.aClass93ArrayArray1[arg0][local27] != null) {
				if (Static54.aClass93ArrayArray1[arg0][local27].anInt3656 == 2) {
					local25 = false;
				} else {
					Static54.aClass93ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static54.aClass93ArrayArray1[arg0] = null;
		}
		Static201.aBooleanArray22[arg0] = false;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(III)I")
	public static int method1528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray142.length) {
			return local10.anIntArray142[arg1];
		} else {
			return -1;
		}
	}
}
