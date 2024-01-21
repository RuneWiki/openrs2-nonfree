import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array9;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Lclient!we;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	public static int anInt2424;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public static int anInt2414 = 0;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!mf;")
	public static Class48 aClass48_55 = new Class48(64);

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "Lclient!qc;")
	private static Class60 aClass60_983 = Static121.method2047("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "Lclient!qc;")
	public static Class60 aClass60_984 = aClass60_983;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Lclient!qc;")
	private static Class60 aClass60_985 = Static121.method2047("You can(Wt add yourself to your own friend list");

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "Lclient!qc;")
	public static Class60 aClass60_986 = aClass60_985;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	public static int anInt2423 = 0;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "[I")
	public static int[] anIntArray244 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1758() {
		aString5 = null;
		aClass60_985 = null;
		aClass60_983 = null;
		aClass60_986 = null;
		aClass48_55 = null;
		aClass4_Sub4_Sub3_Sub1Array9 = null;
		aClass81_1 = null;
		aClass60_984 = null;
		anIntArray244 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!q;I)V")
	public static void method1759(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(6) int local6 = arg0.anInt2227;
		if (local6 == 324) {
			if (Static117.anInt2796 == -1) {
				Static126.anInt2947 = arg0.anInt2187;
				Static117.anInt2796 = arg0.anInt2243;
			}
			if (Static112.aClass36_2.aBoolean50) {
				arg0.anInt2243 = Static117.anInt2796;
			} else {
				arg0.anInt2243 = Static126.anInt2947;
			}
		} else if (local6 == 325) {
			if (Static117.anInt2796 == -1) {
				Static117.anInt2796 = arg0.anInt2243;
				Static126.anInt2947 = arg0.anInt2187;
			}
			if (Static112.aClass36_2.aBoolean50) {
				arg0.anInt2243 = Static126.anInt2947;
			} else {
				arg0.anInt2243 = Static117.anInt2796;
			}
		} else if (local6 == 327) {
			arg0.anInt2226 = 150;
			arg0.anInt2232 = (int) (Math.sin((double) Static81.anInt1944 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2208 = 5;
			arg0.anInt2228 = 0;
		} else if (local6 == 328) {
			arg0.anInt2226 = 150;
			arg0.anInt2232 = (int) (Math.sin((double) Static81.anInt1944 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2228 = 1;
			arg0.anInt2208 = 5;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = 0; local11 < 104; local11++) {
			for (local15 = 0; local15 < 104; local15++) {
				Static45.anIntArrayArray8[local11][local15] = 0;
				Static66.anIntArrayArray13[local11][local15] = 99999999;
			}
		}
		Static45.anIntArrayArray8[arg4][arg1] = 99;
		@Pc(47) int local47 = arg1;
		Static66.anIntArrayArray13[arg4][arg1] = 0;
		local15 = arg4;
		@Pc(57) byte local57 = 0;
		Static23.anIntArray45[0] = arg4;
		@Pc(63) int local63 = 0;
		@Pc(70) int local70 = local57 + 1;
		Static115.anIntArray301[0] = arg1;
		@Pc(74) boolean local74 = false;
		@Pc(77) int local77 = Static23.anIntArray45.length;
		@Pc(82) int[][] local82 = Static119.aClass45Array1[Static129.anInt3003].anIntArrayArray15;
		@Pc(201) int local201;
		while (local63 != local70) {
			local15 = Static23.anIntArray45[local63];
			local47 = Static115.anIntArray301[local63];
			local63 = (local63 + 1) % local77;
			if (arg9 == local15 && local47 == arg6) {
				local74 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static119.aClass45Array1[Static129.anInt3003].method1336(local47, arg2 - 1, local15, arg6, arg8, arg9)) {
					local74 = true;
					break;
				}
				if (arg2 < 10 && Static119.aClass45Array1[Static129.anInt3003].method1323(arg9, local47, arg8, arg2 - 1, arg6, local15)) {
					local74 = true;
					break;
				}
			}
			if (arg5 != 0 && arg7 != 0 && Static119.aClass45Array1[Static129.anInt3003].method1332(local47, arg6, arg3, local15, arg7, arg9, arg5)) {
				local74 = true;
				break;
			}
			local201 = Static66.anIntArrayArray13[local15][local47] + 1;
			if (local15 > 0 && Static45.anIntArrayArray8[local15 - 1][local47] == 0 && (local82[local15 - 1][local47] & 0x12C0108) == 0) {
				Static23.anIntArray45[local70] = local15 - 1;
				Static115.anIntArray301[local70] = local47;
				Static45.anIntArrayArray8[local15 - 1][local47] = 2;
				local70 = (local70 + 1) % local77;
				Static66.anIntArrayArray13[local15 - 1][local47] = local201;
			}
			if (local15 < 103 && Static45.anIntArrayArray8[local15 + 1][local47] == 0 && (local82[local15 + 1][local47] & 0x12C0180) == 0) {
				Static23.anIntArray45[local70] = local15 + 1;
				Static115.anIntArray301[local70] = local47;
				local70 = (local70 + 1) % local77;
				Static45.anIntArrayArray8[local15 + 1][local47] = 8;
				Static66.anIntArrayArray13[local15 + 1][local47] = local201;
			}
			if (local47 > 0 && Static45.anIntArrayArray8[local15][local47 - 1] == 0 && (local82[local15][local47 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray45[local70] = local15;
				Static115.anIntArray301[local70] = local47 - 1;
				local70 = (local70 + 1) % local77;
				Static45.anIntArrayArray8[local15][local47 - 1] = 1;
				Static66.anIntArrayArray13[local15][local47 - 1] = local201;
			}
			if (local47 < 103 && Static45.anIntArrayArray8[local15][local47 + 1] == 0 && (local82[local15][local47 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray45[local70] = local15;
				Static115.anIntArray301[local70] = local47 + 1;
				local70 = (local70 + 1) % local77;
				Static45.anIntArrayArray8[local15][local47 + 1] = 4;
				Static66.anIntArrayArray13[local15][local47 + 1] = local201;
			}
			if (local15 > 0 && local47 > 0 && Static45.anIntArrayArray8[local15 - 1][local47 - 1] == 0 && (local82[local15 - 1][local47 - 1] & 0x12C010E) == 0 && (local82[local15 - 1][local47] & 0x12C0108) == 0 && (local82[local15][local47 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray45[local70] = local15 - 1;
				Static115.anIntArray301[local70] = local47 - 1;
				local70 = (local70 + 1) % local77;
				Static45.anIntArrayArray8[local15 - 1][local47 - 1] = 3;
				Static66.anIntArrayArray13[local15 - 1][local47 - 1] = local201;
			}
			if (local15 < 103 && local47 > 0 && Static45.anIntArrayArray8[local15 + 1][local47 - 1] == 0 && (local82[local15 + 1][local47 - 1] & 0x12C0183) == 0 && (local82[local15 + 1][local47] & 0x12C0180) == 0 && (local82[local15][local47 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray45[local70] = local15 + 1;
				Static115.anIntArray301[local70] = local47 - 1;
				Static45.anIntArrayArray8[local15 + 1][local47 - 1] = 9;
				local70 = (local70 + 1) % local77;
				Static66.anIntArrayArray13[local15 + 1][local47 - 1] = local201;
			}
			if (local15 > 0 && local47 < 103 && Static45.anIntArrayArray8[local15 - 1][local47 + 1] == 0 && (local82[local15 - 1][local47 + 1] & 0x12C0138) == 0 && (local82[local15 - 1][local47] & 0x12C0108) == 0 && (local82[local15][local47 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray45[local70] = local15 - 1;
				Static115.anIntArray301[local70] = local47 + 1;
				Static45.anIntArrayArray8[local15 - 1][local47 + 1] = 6;
				local70 = (local70 + 1) % local77;
				Static66.anIntArrayArray13[local15 - 1][local47 + 1] = local201;
			}
			if (local15 < 103 && local47 < 103 && Static45.anIntArrayArray8[local15 + 1][local47 + 1] == 0 && (local82[local15 + 1][local47 + 1] & 0x12C01E0) == 0 && (local82[local15 + 1][local47] & 0x12C0180) == 0 && (local82[local15][local47 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray45[local70] = local15 + 1;
				Static115.anIntArray301[local70] = local47 + 1;
				local70 = (local70 + 1) % local77;
				Static45.anIntArrayArray8[local15 + 1][local47 + 1] = 12;
				Static66.anIntArrayArray13[local15 + 1][local47 + 1] = local201;
			}
		}
		Static105.anInt2514 = 0;
		@Pc(819) int local819;
		@Pc(823) int local823;
		@Pc(830) int local830;
		if (!local74) {
			if (!arg10) {
				return false;
			}
			local201 = 1000;
			local819 = 100;
			for (local823 = arg9 - 10; local823 <= arg9 + 10; local823++) {
				for (local830 = arg6 - 10; local830 <= arg6 + 10; local830++) {
					if (local823 >= 0 && local830 >= 0 && local823 < 104 && local830 < 104 && Static66.anIntArrayArray13[local823][local830] < 100) {
						@Pc(855) int local855 = 0;
						if (local823 < arg9) {
							local855 = arg9 - local823;
						} else if (arg9 + arg5 - 1 < local823) {
							local855 = local823 + 1 - arg5 - arg9;
						}
						@Pc(881) int local881 = 0;
						if (arg6 > local830) {
							local881 = arg6 - local830;
						} else if (arg6 + arg7 - 1 < local830) {
							local881 = local830 + 1 - arg6 - arg7;
						}
						@Pc(924) int local924 = local881 * local881 + local855 * local855;
						if (local201 > local924 || local924 == local201 && Static66.anIntArrayArray13[local823][local830] < local819) {
							local47 = local830;
							local15 = local823;
							local819 = Static66.anIntArrayArray13[local823][local830];
							local201 = local924;
						}
					}
				}
			}
			if (local201 == 1000) {
				return false;
			}
			if (arg4 == local15 && local47 == arg1) {
				return false;
			}
			Static105.anInt2514 = 1;
		}
		@Pc(999) byte local999 = 0;
		Static23.anIntArray45[0] = local15;
		local63 = local999 + 1;
		Static115.anIntArray301[0] = local47;
		local201 = local819 = Static45.anIntArrayArray8[local15][local47];
		while (arg4 != local15 || local47 != arg1) {
			if (local819 != local201) {
				local819 = local201;
				Static23.anIntArray45[local63] = local15;
				Static115.anIntArray301[local63++] = local47;
			}
			if ((local201 & 0x2) != 0) {
				local15++;
			} else if ((local201 & 0x8) != 0) {
				local15--;
			}
			if ((local201 & 0x1) != 0) {
				local47++;
			} else if ((local201 & 0x4) != 0) {
				local47--;
			}
			local201 = Static45.anIntArrayArray8[local15][local47];
		}
		if (local63 > 0) {
			local77 = local63;
			if (local63 > 25) {
				local77 = 25;
			}
			local63--;
			local823 = Static115.anIntArray301[local63];
			@Pc(1098) int local1098 = Static23.anIntArray45[local63];
			if (arg0 == 0) {
				Static56.aClass4_Sub13_Sub1_1.method1265(143);
				Static56.aClass4_Sub13_Sub1_1.method1209(local77 + local77 + 3);
			}
			if (arg0 == 1) {
				Static56.aClass4_Sub13_Sub1_1.method1265(201);
				Static56.aClass4_Sub13_Sub1_1.method1209(local77 + local77 + 17);
			}
			if (arg0 == 2) {
				Static56.aClass4_Sub13_Sub1_1.method1265(147);
				Static56.aClass4_Sub13_Sub1_1.method1209(local77 + local77 + 3);
			}
			Static56.aClass4_Sub13_Sub1_1.method1238(Static10.aBooleanArray1[82] ? 1 : 0);
			Static56.aClass4_Sub13_Sub1_1.method1220(Static106.anInt2518 + local1098);
			Static56.aClass4_Sub13_Sub1_1.method1252(local823 + anInt2424);
			Static123.anInt2922 = Static115.anIntArray301[0];
			Static81.anInt1951 = Static23.anIntArray45[0];
			for (local830 = 1; local830 < local77; local830++) {
				local63--;
				Static56.aClass4_Sub13_Sub1_1.method1228(Static23.anIntArray45[local63] - local1098);
				Static56.aClass4_Sub13_Sub1_1.method1238(Static115.anIntArray301[local63] - local823);
			}
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
