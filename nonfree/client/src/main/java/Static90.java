import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1093 = Static2.method66(":  ");

	@OriginalMember(owner = "client!s", name = "X", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1094 = Static2.method66("(Z");

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "Lclient!ie;")
	public static Class34 aClass34_46 = new Class34();

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	public static int anInt2384 = 0;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "I")
	public static int anInt2387 = 0;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1095 = Static2.method66("(U4");

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Z")
	public static boolean method1702(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)Lclient!ke;")
	public static Class39 method1703(@OriginalArg(0) int arg0) {
		@Pc(9) Class39 local9 = Static31.method1267(arg0);
		for (@Pc(20) int local20 = local9.method1088() - 3; local20 > 0; local20 -= 3) {
			local9 = Static20.method431(new Class39[] { local9.method1115(0, local20), Static38.aClass39_492, local9.method1099(local20) });
		}
		if (local9.method1088() > 8) {
			local9 = Static20.method431(new Class39[] { Static42.aClass39_536, local9.method1115(0, local9.method1088() - 8), Static58.aClass39_723, Static12.aClass39_164, local9, Static38.aClass39_497 });
		} else if (local9.method1088() > 4) {
			local9 = Static20.method431(new Class39[] { Static99.aClass39_1229, local9.method1115(0, local9.method1088() - 4), Static48.aClass39_603, Static12.aClass39_164, local9, Static38.aClass39_497 });
		}
		return Static20.method431(new Class39[] { Static92.aClass39_1104, local9 });
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BI)I")
	public static int method1704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg1; local7++) {
			local5 = Class2.anIntArray361[(local5 ^ arg2[local7]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(II)Lclient!ec;")
	public static Class2_Sub1_Sub6 method1705(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static76.aClass2_Sub1_Sub6ArrayArray1[local7] == null || Static76.aClass2_Sub1_Sub6ArrayArray1[local7][local11] == null) {
			@Pc(30) boolean local30 = Static23.method442(local7);
			if (!local30) {
				return null;
			}
		}
		return Static76.aClass2_Sub1_Sub6ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method1706() {
		aClass34_46 = null;
		aClass39_1093 = null;
		aClass39_1095 = null;
		aClass39_1094 = null;
		anIntArray304 = null;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)I")
	public static int method1707() {
		@Pc(7) int local7 = 3;
		if (Static64.anInt1897 < 310) {
			@Pc(14) int local14 = Static88.anInt1136 >> 7;
			@Pc(18) int local18 = Static41.anInt1188 >> 7;
			@Pc(23) int local23 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 >> 7;
			@Pc(28) int local28 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 >> 7;
			if ((Static96.aByteArrayArrayArray8[Static18.anInt560][local14][local18] & 0x4) != 0) {
				local7 = Static18.anInt560;
			}
			@Pc(52) int local52;
			if (local23 > local14) {
				local52 = local23 - local14;
			} else {
				local52 = local14 - local23;
			}
			@Pc(66) int local66;
			if (local28 <= local18) {
				local66 = local18 - local28;
			} else {
				local66 = local28 - local18;
			}
			@Pc(82) int local82;
			@Pc(84) int local84;
			if (local52 <= local66) {
				local82 = local52 * 65536 / local66;
				local84 = 32768;
				while (local28 != local18) {
					local84 += local82;
					if (local18 < local28) {
						local18++;
					} else if (local18 > local28) {
						local18--;
					}
					if ((Static96.aByteArrayArrayArray8[Static18.anInt560][local14][local18] & 0x4) != 0) {
						local7 = Static18.anInt560;
					}
					if (local84 >= 65536) {
						local84 -= 65536;
						if (local23 > local14) {
							local14++;
						} else if (local14 > local23) {
							local14--;
						}
						if ((Static96.aByteArrayArrayArray8[Static18.anInt560][local14][local18] & 0x4) != 0) {
							local7 = Static18.anInt560;
						}
					}
				}
			} else {
				local84 = 32768;
				local82 = local66 * 65536 / local52;
				while (local14 != local23) {
					local84 += local82;
					if (local14 < local23) {
						local14++;
					} else if (local14 > local23) {
						local14--;
					}
					if ((Static96.aByteArrayArrayArray8[Static18.anInt560][local14][local18] & 0x4) != 0) {
						local7 = Static18.anInt560;
					}
					if (local84 >= 65536) {
						local84 -= 65536;
						if (local18 < local28) {
							local18++;
						} else if (local18 > local28) {
							local18--;
						}
						if ((Static96.aByteArrayArrayArray8[Static18.anInt560][local14][local18] & 0x4) != 0) {
							local7 = Static18.anInt560;
						}
					}
				}
			}
		}
		if ((Static96.aByteArrayArrayArray8[Static18.anInt560][Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 >> 7][Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 >> 7] & 0x4) != 0) {
			local7 = Static18.anInt560;
		}
		return local7;
	}
}
