import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_3;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!kh;")
	public static Class1_Sub2_Sub12 aClass1_Sub2_Sub12_2;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Lclient!oe;")
	public static Class125 method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass125_1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)I")
	public static int method1404() {
		return 15;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIIZIILclient!jj;III)V")
	public static void method1405(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub18 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(30) int local30;
		if (arg10 < 0 || arg10 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local30 = arg7.method3122();
				if (local30 == 0) {
					break;
				}
				if (local30 == 1) {
					arg7.method3122();
					break;
				}
				if (local30 <= 49) {
					arg7.method3122();
				}
			}
			return;
		}
		if (!arg0 && !arg5) {
			Static242.aByteArrayArrayArray23[arg3][arg10][arg1] = 0;
		}
		while (true) {
			local30 = arg7.method3122();
			if (local30 == 0) {
				if (arg0) {
					Static163.anIntArrayArrayArray16[0][arg10 + arg2][arg8 + arg1] = Static152.anIntArrayArrayArray11[0][arg2 + arg10][arg1 + arg8];
				} else if (arg3 == 0) {
					Static163.anIntArrayArrayArray16[0][arg2 + arg10][arg8 + arg1] = -Static73.method1192(arg6 + 932731, 556238 - -arg9) * 8;
				} else {
					Static163.anIntArrayArrayArray16[arg3][arg10 + arg2][arg1 + arg8] = Static163.anIntArrayArrayArray16[arg3 - 1][arg2 + arg10][arg1 + arg8] - 240;
				}
				break;
			}
			if (local30 == 1) {
				@Pc(167) int local167 = arg7.method3122();
				if (arg0) {
					Static163.anIntArrayArrayArray16[0][arg2 + arg10][arg8 + arg1] = Static152.anIntArrayArrayArray11[0][arg2 + arg10][arg8 + arg1] + local167 * 8;
				} else {
					if (local167 == 1) {
						local167 = 0;
					}
					if (arg3 == 0) {
						Static163.anIntArrayArrayArray16[0][arg10 + arg2][arg1 + arg8] = -local167 * 8;
					} else {
						Static163.anIntArrayArrayArray16[arg3][arg2 + arg10][arg8 + arg1] = Static163.anIntArrayArrayArray16[arg3 - 1][arg10 + arg2][arg8 + arg1] - local167 * 8;
					}
				}
				break;
			}
			if (local30 > 49) {
				if (local30 > 81) {
					if (!arg5) {
						Static97.aByteArrayArrayArray11[arg3][arg10][arg1] = (byte) (local30 - 81);
					}
				} else if (!arg0 && !arg5) {
					Static242.aByteArrayArrayArray23[arg3][arg10][arg1] = (byte) (local30 - 49);
				}
			} else if (arg5) {
				arg7.method3122();
			} else {
				Static249.aByteArrayArrayArray24[arg3][arg10][arg1] = arg7.method3082();
				aByteArrayArrayArray9[arg3][arg10][arg1] = (byte) ((local30 - 2) / 4);
				Static40.aByteArrayArrayArray6[arg3][arg10][arg1] = (byte) (arg4 + local30 - 2 & 0x3);
			}
		}
	}
}
