import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public static int anInt1610;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public static int anInt1614 = 500;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!th;")
	public static Class169 aClass169_57 = new Class169(64);

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString56 = "Loading world list data";

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[112];

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString57 = " ";

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
	public static int[] anIntArray128 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIII)V")
	public static void method1303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg0;
		@Pc(14) int local14 = arg4 - arg3;
		if (local9 == 0) {
			if (local14 != 0) {
				Static1.method29(arg0, arg2, arg4, arg3);
			}
		} else if (local14 == 0) {
			Static285.method4245(arg2, arg0, arg3, arg1);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(65) boolean local65 = local9 < local14;
			@Pc(69) int local69;
			@Pc(71) int local71;
			if (local65) {
				local69 = arg0;
				local71 = arg1;
				arg0 = arg3;
				arg1 = arg4;
				arg4 = local71;
				arg3 = local69;
			}
			if (arg0 > arg1) {
				local69 = arg0;
				arg0 = arg1;
				arg1 = local69;
				local71 = arg3;
				arg3 = arg4;
				arg4 = local71;
			}
			local71 = arg1 - arg0;
			@Pc(105) int local105 = arg4 - arg3;
			if (local105 < 0) {
				local105 = -local105;
			}
			@Pc(116) int local116 = -(local71 >> 1);
			@Pc(127) int local127 = arg3 >= arg4 ? -1 : 1;
			local69 = arg3;
			@Pc(133) int local133;
			if (local65) {
				for (local133 = arg0; local133 <= arg1; local133++) {
					local116 += local105;
					Static51.anIntArrayArray1[local133][local69] = arg2;
					if (local116 > 0) {
						local116 -= local71;
						local69 += local127;
					}
				}
			} else {
				for (local133 = arg0; local133 <= arg1; local133++) {
					local116 += local105;
					Static51.anIntArrayArray1[local69][local133] = arg2;
					if (local116 > 0) {
						local69 += local127;
						local116 -= local71;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	public static void method1304(@OriginalArg(1) int arg0) {
		Static140.anInt2753 = -1;
		Static140.anInt2753 = -1;
		if (arg0 == 37) {
			Static58.aFloat30 = 3.0F;
		} else if (arg0 == 50) {
			Static58.aFloat30 = 4.0F;
		} else if (arg0 == 75) {
			Static58.aFloat30 = 6.0F;
		} else if (arg0 == 100) {
			Static58.aFloat30 = 8.0F;
		} else if (arg0 == 200) {
			Static58.aFloat30 = 16.0F;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	public static int method1305() {
		return Static178.anInt3583;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(15) long local15 = Static27.method481(arg3, arg4 + 0, arg0);
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(42) int local42;
		@Pc(46) Class43 local46;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		@Pc(75) int local75;
		if (local15 != 0L) {
			local28 = (int) local15 >> 20 & 0x3;
			local35 = (int) local15 >> 14 & 0x1F;
			local42 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local46 = Static189.method3080(local42);
			if (local46.anInt1167 == -1) {
				local52 = Static41.anIntArray62;
				local54 = arg1;
				if (local15 > 0L) {
					local54 = arg2;
				}
				local75 = arg4 * 4 + (52736 - arg0 * 512) * 4 + 24624;
				if (local35 == 0 || local35 == 2) {
					if (local28 == 0) {
						local52[local75] = local54;
						local52[local75 + 512] = local54;
						local52[local75 + 1024] = local54;
						local52[local75 + 1536] = local54;
					} else if (local28 == 1) {
						local52[local75] = local54;
						local52[local75 + 1] = local54;
						local52[local75 + 2] = local54;
						local52[local75 + 3] = local54;
					} else if (local28 == 2) {
						local52[local75 + 3] = local54;
						local52[local75 + 515] = local54;
						local52[local75 + 1027] = local54;
						local52[local75 + 3 + 1536] = local54;
					} else if (local28 == 3) {
						local52[local75 + 1536] = local54;
						local52[local75 + 1536 + 1] = local54;
						local52[local75 + 1536 + 2] = local54;
						local52[local75 + 3 + 1536] = local54;
					}
				}
				if (local35 == 3) {
					if (local28 == 0) {
						local52[local75] = local54;
					} else if (local28 == 1) {
						local52[local75 + 3] = local54;
					} else if (local28 == 2) {
						local52[local75 + 3 + 1536] = local54;
					} else if (local28 == 3) {
						local52[local75 + 1536] = local54;
					}
				}
				if (local35 == 2) {
					if (local28 == 3) {
						local52[local75] = local54;
						local52[local75 + 512] = local54;
						local52[local75 + 1024] = local54;
						local52[local75 + 1536] = local54;
					} else if (local28 == 0) {
						local52[local75] = local54;
						local52[local75 + 1] = local54;
						local52[local75 + 2] = local54;
						local52[local75 + 3] = local54;
					} else if (local28 == 1) {
						local52[local75 + 3] = local54;
						local52[local75 + 515] = local54;
						local52[local75 + 1027] = local54;
						local52[local75 + 1539] = local54;
					} else if (local28 == 2) {
						local52[local75 + 1536] = local54;
						local52[local75 + 1537] = local54;
						local52[local75 + 1536 + 2] = local54;
						local52[local75 + 1536 + 3] = local54;
					}
				}
			} else if (!Static296.method4397(local28, arg4, local46, arg0)) {
				return false;
			}
		}
		local15 = Static278.method4120(arg3, arg4 + 0, arg0);
		if (local15 != 0L) {
			local28 = (int) local15 >> 20 & 0x3;
			local35 = (int) local15 >> 14 & 0x1F;
			local42 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local46 = Static189.method3080(local42);
			if (local46.anInt1167 == -1) {
				if (local35 == 9) {
					local54 = 15658734;
					local75 = arg4 * 4 + (-arg0 + 103) * 2048 + 24624;
					if (local15 > 0L) {
						local54 = 15597568;
					}
					local52 = Static41.anIntArray62;
					if (local28 == 0 || local28 == 2) {
						local52[local75 + 1536] = local54;
						local52[local75 + 1025] = local54;
						local52[local75 + 2 + 512] = local54;
						local52[local75 + 3] = local54;
					} else {
						local52[local75] = local54;
						local52[local75 + 513] = local54;
						local52[local75 + 1024 + 2] = local54;
						local52[local75 + 1539] = local54;
					}
				}
			} else if (!Static296.method4397(local28, arg4, local46, arg0)) {
				return false;
			}
		}
		local15 = Static67.method1135(arg3, arg4 + 0, arg0);
		if (local15 != 0L) {
			local35 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local28 = (int) local15 >> 20 & 0x3;
			@Pc(587) Class43 local587 = Static189.method3080(local35);
			if (local587.anInt1167 != -1 && !Static296.method4397(local28, arg4, local587, arg0)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ph;Lclient!ph;Lclient!hf;Lclient!ph;B)Z")
	public static boolean method1307(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class1_Sub4_Sub3 arg2, @OriginalArg(3) Class138 arg3) {
		Static183.aClass1_Sub4_Sub3_3 = arg2;
		Static306.aClass138_82 = arg3;
		Static8.aClass138_3 = arg1;
		Static55.aClass138_12 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)Lclient!gi;")
	public static Class1_Sub1_Sub10 method1309() {
		if (Static58.aClass5_11 == null) {
			return null;
		}
		for (@Pc(14) Class1_Sub1_Sub10 local14 = (Class1_Sub1_Sub10) Static260.aClass48_1.method1146(); local14 != null; local14 = (Class1_Sub1_Sub10) Static260.aClass48_1.method1146()) {
			@Pc(22) Class81 local22 = Static50.method874(local14.anInt1638);
			if (local22 != null && local22.aBoolean167 && local22.method1800()) {
				return local14;
			}
		}
		return null;
	}
}
