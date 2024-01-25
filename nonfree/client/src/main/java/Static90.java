import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
	public static final int anInt1736 = 2;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public static int anInt1740 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public static void method1475() {
		@Pc(9) int[] local9 = new int[Static196.aClass139_1.anInt3869];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static196.aClass139_1.anInt3869; local13++) {
			@Pc(20) Class268 local20 = Static196.aClass139_1.method3228(local13);
			if (local20.anInt7746 >= 0 || local20.anInt7735 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static176.anIntArray270 = new int[local11];
		for (@Pc(50) int local50 = 0; local50 < local11; local50++) {
			Static176.anIntArray270[local50] = local9[local50];
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method1476() {
		Static167.aClass266_28.method6004();
		for (@Pc(13) Class1_Sub8 local13 = (Class1_Sub8) Static8.aClass266_2.method6000(); local13 != null; local13 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
			if (local13.anInt1758 < 1000) {
				local13.method6071();
				Static167.aClass266_28.method5998(local13);
			}
		}
		Static167.aClass266_28.method5995(Static8.aClass266_2);
		@Pc(41) int local41 = -1;
		@Pc(46) Class1_Sub27 local46 = (Class1_Sub27) Static384.aClass266_45.method6000();
		if (local46 != null) {
			local41 = local46.method4578();
		}
		if (!Static108.aBoolean111) {
			if (local41 == 0 && (Static42.anInt758 == 1 && Static82.anInt1627 > 2 || Static294.method4794())) {
				local41 = 2;
			}
			if (local41 == 2 && Static82.anInt1627 > 0 && local46 != null) {
				if (Static442.aClass219_14 == null && anInt1740 == 0) {
					Static359.method4948(local46.method4581(), local46.method4582());
				} else {
					Static208.anInt3847 = 2;
				}
			}
			if (local41 == 0 && Static82.anInt1627 > 0) {
				Static54.method965();
			}
			if (Static442.aClass219_14 == null && anInt1740 == 0) {
				Static52.aClass1_Sub8_1 = null;
				Static208.anInt3847 = 0;
				return;
			}
			return;
		}
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local41 == -1) {
			local129 = Static16.aClass228_1.method5485();
			local133 = Static16.aClass228_1.method5486();
			if (local129 < Static309.anInt2246 - 10 || Static49.anInt5921 + Static309.anInt2246 + 10 < local129 || Static24.anInt543 - 10 > local133 || local133 > Static24.anInt543 + Static125.anInt2237 + 10) {
				Static108.aBoolean111 = false;
				Static377.method5166(Static49.anInt5921, Static24.anInt543, Static125.anInt2237, Static309.anInt2246);
			}
		}
		if (local41 != 0) {
			return;
		}
		local129 = Static309.anInt2246;
		local133 = Static24.anInt543;
		@Pc(180) int local180 = Static49.anInt5921;
		@Pc(184) int local184 = local46.method4581();
		@Pc(188) int local188 = local46.method4582();
		@Pc(190) int local190 = -1;
		@Pc(209) int local209;
		for (@Pc(192) int local192 = 0; local192 < Static82.anInt1627; local192++) {
			if (Static45.aBoolean35) {
				local209 = (Static82.anInt1627 - local192 - 1) * 16 + local133 + 33;
				if (local184 > local129 && local129 + local180 > local184 && local209 - 13 < local188 && local188 < local209 + 4) {
					local190 = local192;
				}
			} else {
				local209 = (Static82.anInt1627 - local192 - 1) * 16 + local133 + 31;
				if (local184 > local129 && local180 + local129 > local184 && local209 - 13 < local188 && local188 < local209 + 3) {
					local190 = local192;
				}
			}
		}
		if (local190 != -1) {
			local209 = 0;
			@Pc(299) Class93 local299 = new Class93(Static8.aClass266_2);
			for (@Pc(304) Class1_Sub8 local304 = (Class1_Sub8) local299.method1880(); local304 != null; local304 = (Class1_Sub8) local299.method1882()) {
				if (local190 == local209) {
					Static351.method4853(local304, local184, local188);
				}
				local209++;
			}
		}
		Static108.aBoolean111 = false;
		Static377.method5166(Static49.anInt5921, Static24.anInt543, Static125.anInt2237, Static309.anInt2246);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([BIIIIBI)Z")
	public static boolean method1477(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(27) int local27;
		if (local9 == 0) {
			local27 = 0;
		} else {
			local27 = 8 - local9;
		}
		@Pc(41) int local41 = -((arg3 + 7) / 8);
		@Pc(50) int local50 = -((arg2 + 8 - 1) / 8);
		for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
			for (@Pc(56) int local56 = local50; local56 < 0; local56++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local27;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}
}
