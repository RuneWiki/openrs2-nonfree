import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
	public static int anInt2128;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_19 = new Class198(8);

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString75 = " more options";

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
	public static int anInt2129 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!ao;IIIIIIIII)Z")
	public static boolean method1711(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg0;
		@Pc(22) int local22 = arg7 - 64;
		@Pc(27) int local27 = arg0 - 64;
		Static177.anIntArrayArray24[64][64] = 99;
		Static238.anIntArrayArray42[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static238.anIntArray380[0] = arg7;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static227.anIntArray376[0] = arg0;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray1;
		while (true) {
			label282: while (true) {
				@Pc(69) int local69;
				@Pc(79) int local79;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(242) int local242;
				@Pc(287) int local287;
				do {
					do {
						do {
							label259: do {
								if (local50 == local47) {
									Static132.anInt2759 = local7;
									Static45.anInt929 = local9;
									return false;
								}
								local7 = Static238.anIntArray380[local47];
								local9 = Static227.anIntArray376[local47];
								local69 = local7 - local22;
								local47 = local47 + 1 & 0xFFF;
								local79 = local9 - local27;
								local85 = local7 - arg1.anInt340;
								local91 = local9 - arg1.anInt336;
								if (arg8 == -4) {
									if (local7 == arg2 && local9 == arg4) {
										Static45.anInt929 = local9;
										Static132.anInt2759 = local7;
										return true;
									}
								} else if (arg8 == -3) {
									if (Static90.method1438(arg6, arg10, arg4, local7, arg10, arg2, arg5, local9)) {
										Static45.anInt929 = local9;
										Static132.anInt2759 = local7;
										return true;
									}
								} else if (arg8 == -2) {
									if (arg1.method244(arg6, local7, arg9, arg10, local9, arg5, arg2, arg10, arg4)) {
										Static45.anInt929 = local9;
										Static132.anInt2759 = local7;
										return true;
									}
								} else if (arg8 == -1) {
									if (arg1.method232(arg10, arg5, local9, local7, arg6, arg2, arg9, arg4)) {
										Static132.anInt2759 = local7;
										Static45.anInt929 = local9;
										return true;
									}
								} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
									if (arg1.method243(arg4, local7, local9, arg3, arg10, arg8, arg2)) {
										Static45.anInt929 = local9;
										Static132.anInt2759 = local7;
										return true;
									}
								} else if (arg1.method237(arg2, local9, arg10, local7, arg8, arg4, arg3)) {
									Static132.anInt2759 = local7;
									Static45.anInt929 = local9;
									return true;
								}
								local242 = Static238.anIntArrayArray42[local69][local79] + 1;
								if (local69 > 0 && Static177.anIntArrayArray24[local69 - 1][local79] == 0 && (local55[local85 - 1][local91] & 0x43A40000) == 0 && (local55[local85 - 1][arg10 + local91 - 1] & 0x4E240000) == 0) {
									local287 = 1;
									while (true) {
										if (arg10 - 1 <= local287) {
											Static238.anIntArray380[local50] = local7 - 1;
											Static227.anIntArray376[local50] = local9;
											Static177.anIntArrayArray24[local69 - 1][local79] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static238.anIntArrayArray42[local69 - 1][local79] = local242;
											break;
										}
										if ((local55[local85 - 1][local287 + local91] & 0x4FA40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (128 - arg10 > local69 && Static177.anIntArrayArray24[local69 + 1][local79] == 0 && (local55[local85 + arg10][local91] & 0x60E40000) == 0 && (local55[local85 + arg10][local91 + arg10 - 1] & 0x78240000) == 0) {
									local287 = 1;
									while (true) {
										if (arg10 - 1 <= local287) {
											Static238.anIntArray380[local50] = local7 + 1;
											Static227.anIntArray376[local50] = local9;
											Static177.anIntArrayArray24[local69 + 1][local79] = 8;
											local50 = local50 + 1 & 0xFFF;
											Static238.anIntArrayArray42[local69 + 1][local79] = local242;
											break;
										}
										if ((local55[local85 + arg10][local287 + local91] & 0x78E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local79 > 0 && Static177.anIntArrayArray24[local69][local79 - 1] == 0 && (local55[local85][local91 - 1] & 0x43A40000) == 0 && (local55[local85 + arg10 - 1][local91 - 1] & 0x60E40000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg10 - 1) {
											Static238.anIntArray380[local50] = local7;
											Static227.anIntArray376[local50] = local9 - 1;
											Static177.anIntArrayArray24[local69][local79 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static238.anIntArrayArray42[local69][local79 - 1] = local242;
											break;
										}
										if ((local55[local287 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (128 - arg10 > local79 && Static177.anIntArrayArray24[local69][local79 + 1] == 0 && (local55[local85][arg10 + local91] & 0x4E240000) == 0 && (local55[arg10 + local85 - 1][arg10 + local91] & 0x78240000) == 0) {
									local287 = 1;
									while (true) {
										if (arg10 - 1 <= local287) {
											Static238.anIntArray380[local50] = local7;
											Static227.anIntArray376[local50] = local9 + 1;
											Static177.anIntArrayArray24[local69][local79 + 1] = 4;
											local50 = local50 + 1 & 0xFFF;
											Static238.anIntArrayArray42[local69][local79 + 1] = local242;
											break;
										}
										if ((local55[local85 + local287][local91 + arg10] & 0x7E240000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local69 > 0 && local79 > 0 && Static177.anIntArrayArray24[local69 - 1][local79 - 1] == 0 && (local55[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local287 = 1;
									while (true) {
										if (arg10 <= local287) {
											Static238.anIntArray380[local50] = local7 - 1;
											Static227.anIntArray376[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static177.anIntArrayArray24[local69 - 1][local79 - 1] = 3;
											Static238.anIntArrayArray42[local69 - 1][local79 - 1] = local242;
											break;
										}
										if ((local55[local85 - 1][local287 + local91 - 1] & 0x4FA40000) != 0 || (local55[local287 + local85 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local69 < 128 - arg10 && local79 > 0 && Static177.anIntArrayArray24[local69 + 1][local79 - 1] == 0 && (local55[local85 + arg10][local91 - 1] & 0x60E40000) == 0) {
									local287 = 1;
									while (true) {
										if (arg10 <= local287) {
											Static238.anIntArray380[local50] = local7 + 1;
											Static227.anIntArray376[local50] = local9 - 1;
											Static177.anIntArrayArray24[local69 + 1][local79 - 1] = 9;
											local50 = local50 + 1 & 0xFFF;
											Static238.anIntArrayArray42[local69 + 1][local79 - 1] = local242;
											break;
										}
										if ((local55[arg10 + local85][local91 + local287 - 1] & 0x78E40000) != 0 || (local55[local85 + local287][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local69 > 0 && 128 - arg10 > local79 && Static177.anIntArrayArray24[local69 - 1][local79 + 1] == 0 && (local55[local85 - 1][local91 + arg10] & 0x4E240000) == 0) {
									for (local287 = 1; local287 < arg10; local287++) {
										if ((local55[local85 - 1][local91 + local287] & 0x4FA40000) != 0 || (local55[local287 + local85 - 1][arg10 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static238.anIntArray380[local50] = local7 - 1;
									Static227.anIntArray376[local50] = local9 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static177.anIntArrayArray24[local69 - 1][local79 + 1] = 6;
									Static238.anIntArrayArray42[local69 - 1][local79 + 1] = local242;
								}
							} while (128 - arg10 <= local69);
						} while (local79 >= 128 - arg10);
					} while (Static177.anIntArrayArray24[local69 + 1][local79 + 1] != 0);
				} while ((local55[local85 + arg10][local91 + arg10] & 0x78240000) != 0);
				for (local287 = 1; local287 < arg10; local287++) {
					if ((local55[local287 + local85][local91 + arg10] & 0x7E240000) != 0 || (local55[local85 + arg10][local91 + local287] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static238.anIntArray380[local50] = local7 + 1;
				Static227.anIntArray376[local50] = local9 + 1;
				Static177.anIntArrayArray24[local69 + 1][local79 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static238.anIntArrayArray42[local69 + 1][local79 + 1] = local242;
			}
		}
	}
}
