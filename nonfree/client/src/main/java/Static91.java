import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	public static void method1633() {
		Static17.anInt360 = 0;
		Static40.anInt912 = 0;
		Static68.anInt1533 = -3;
		Static355.aBoolean596 = false;
		Static148.anInt4857 = -1;
		Static287.anInt5821 = 0;
		Static279.anInt5648 = 1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZII)I")
	public static int method1634(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class4_Sub41 local12 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg2);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray538.length; local20++) {
			if (local12.anIntArray538[local20] >= 0 && Static94.anInt2090 > local12.anIntArray538[local20]) {
				@Pc(43) Class142 local43 = Static247.method4270(local12.anIntArray538[local20]);
				@Pc(54) int local54 = local43.method3729(Static98.method5502(arg0).anInt6695, arg0);
				if (arg1) {
					local18 += local54 * local12.anIntArray537[local20];
				} else {
					local18 += local54;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BJ)V")
	public static void method1635(@OriginalArg(1) long arg0) {
		Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
		Static320.aClass4_Sub7_Sub1_3.method2416(21);
		Static320.aClass4_Sub7_Sub1_3.method2385(arg0);
		Static352.anInt6601 = 0;
		Static52.anInt1173 = -3;
		Static45.anInt5671 = 1;
		Static335.anInt6657 = 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)I")
	public static int method1636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	public static void method1637(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local11 = 1;
			local9 = Static247.aByteArrayArray19;
		} else {
			local9 = Static235.aByteArrayArray25;
			local11 = 4;
		}
		@Pc(20) int local20 = local9.length;
		@Pc(36) int local36;
		@Pc(49) int local49;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local9[local22];
			local36 = Static313.anIntArray505[local22] >> 8;
			@Pc(42) int local42 = Static313.anIntArray505[local22] & 0xFF;
			local49 = local36 * 64 - Static10.anInt231;
			@Pc(55) int local55 = local42 * 64 - Static81.anInt1732;
			if (local30 != null) {
				Static294.method3383();
				local26 = Static77.method1404(local55, Static164.aClass92_7, local11, Static81.anInt1732, local49, local30, arg0, Static10.anInt231, Static345.aClass174Array1);
			}
			if (!arg0 && Static182.anInt4006 / 8 == local36 && Static252.anInt5225 / 8 == local42) {
				if (local26 == null) {
					Static93.aClass155_1 = null;
				} else {
					Static93.aClass155_1 = Static187.method3427(local26[1], local26[0], local26[2], local26[3]);
					Static313.anInt6288 = local26[4];
				}
			}
		}
		for (@Pc(114) int local114 = 0; local114 < local20; local114++) {
			@Pc(127) int local127 = (Static313.anIntArray505[local114] >> 8) * 64 - Static10.anInt231;
			local36 = (Static313.anIntArray505[local114] & 0xFF) * 64 - Static81.anInt1732;
			@Pc(142) byte[] local142 = local9[local114];
			if (local142 == null && Static252.anInt5225 < 800) {
				Static294.method3383();
				for (local49 = 0; local49 < local11; local49++) {
					Static183.method3401(local36, 64, local127, 64, local49);
				}
			}
		}
	}
}
