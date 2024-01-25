import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public static int anInt5161;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_69 = new Class146(47, 8);

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_70 = new Class146(74, -1);

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	public static int anInt5160 = 0;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!qn;Lclient!qn;)I")
	public static int method4129(@OriginalArg(1) Class211 arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method4382(Static186.anInt3435)) {
			local5++;
		}
		if (arg1.method4382(Static433.anInt7157)) {
			local5++;
		}
		if (arg1.method4382(Static278.anInt4621)) {
			local5++;
		}
		if (arg0.method4382(Static186.anInt3435)) {
			local5++;
		}
		if (arg0.method4382(Static433.anInt7157)) {
			local5++;
		}
		if (arg0.method4382(Static278.anInt4621)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method4130() {
		if (Static8.anInt119 == 2) {
			Static119.method4569(3);
		} else if (Static8.anInt119 == 6) {
			Static119.method4569(7);
		} else if (Static8.anInt119 == 9) {
			Static119.method4569(10);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)I")
	public static int method4131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static64.anIntArray101[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLclient!bf;Z)V")
	public static void method4132(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub3_Sub1 arg1) {
		@Pc(9) Class42 local9 = arg1.method5892();
		if (arg1.anInt7427 == 0) {
			Static206.anInt4094 = -1;
			arg1.anInt7426 = 0;
			Static325.anInt5266 = 0;
			return;
		}
		if (arg1.anInt7365 != -1 && arg1.anInt7359 == 0) {
			@Pc(36) Class119 local36 = Static170.aClass125_3.method2389(arg1.anInt7365);
			if (arg1.anInt7428 > 0 && local36.anInt3010 == 0) {
				arg1.anInt7426++;
				Static206.anInt4094 = -1;
				Static325.anInt5266 = 0;
				return;
			}
			if (arg1.anInt7428 <= 0 && local36.anInt3007 == 0) {
				arg1.anInt7426++;
				Static206.anInt4094 = -1;
				Static325.anInt5266 = 0;
				return;
			}
		}
		@Pc(115) Class119 local115;
		@Pc(101) Class172 local101;
		if (arg1.anInt7387 != -1 && Static265.anInt4371 >= arg1.anInt7407) {
			local101 = Static452.aClass246_2.method5323(arg1.anInt7387);
			if (local101.aBoolean302 && local101.anInt4088 != -1) {
				local115 = Static170.aClass125_3.method2389(local101.anInt4088);
				if (arg1.anInt7428 > 0 && local115.anInt3010 == 0) {
					arg1.anInt7426++;
					Static325.anInt5266 = 0;
					Static206.anInt4094 = -1;
					return;
				}
				if (arg1.anInt7428 <= 0 && local115.anInt3007 == 0) {
					Static325.anInt5266 = 0;
					arg1.anInt7426++;
					Static206.anInt4094 = -1;
					return;
				}
			}
		}
		if (arg1.anInt7387 != -1 && arg1.anInt7407 <= Static265.anInt4371) {
			local101 = Static452.aClass246_2.method5323(arg1.anInt7387);
			if (local101.aBoolean302 && local101.anInt4088 != -1) {
				local115 = Static170.aClass125_3.method2389(local101.anInt4088);
				if (arg1.anInt7428 > 0 && local115.anInt3010 == 0) {
					arg1.anInt7426++;
					Static206.anInt4094 = -1;
					Static325.anInt5266 = 0;
					return;
				}
				if (arg1.anInt7428 <= 0 && local115.anInt3007 == 0) {
					arg1.anInt7426++;
					Static325.anInt5266 = 0;
					Static206.anInt4094 = -1;
					return;
				}
			}
		}
		@Pc(223) int local223 = arg1.anInt7339;
		@Pc(226) int local226 = arg1.anInt7343;
		@Pc(243) int local243 = arg1.anIntArray560[arg1.anInt7427 - 1] * 128 + arg1.method5894() * 64;
		@Pc(260) int local260 = arg1.anIntArray559[arg1.anInt7427 - 1] * 128 + arg1.method5894() * 64;
		if (local243 <= local223) {
			if (local243 < local223) {
				if (local226 < local260) {
					arg1.method5887(6144);
				} else if (local260 >= local226) {
					arg1.method5887(4096);
				} else {
					arg1.method5887(2048);
				}
			} else if (local260 > local226) {
				arg1.method5887(8192);
			} else if (local226 > local260) {
				arg1.method5887(0);
			}
		} else if (local260 > local226) {
			arg1.method5887(10240);
		} else if (local260 >= local226) {
			arg1.method5887(12288);
		} else {
			arg1.method5887(14336);
		}
		@Pc(362) byte local362 = arg1.aByteArray88[arg1.anInt7427 - 1];
		if (!arg0 && (local243 - local223 > 256 || local243 - local223 < -256 || local260 - local226 > 256 || local260 - local226 < -256)) {
			arg1.anInt7339 = local243;
			arg1.anInt7343 = local260;
			arg1.method5889(arg1.anInt7378);
			Static325.anInt5266 = 0;
			Static206.anInt4094 = -1;
			if (arg1.anInt7428 > 0) {
				arg1.anInt7428--;
			}
			arg1.anInt7427--;
			return;
		}
		@Pc(430) int local430 = 4;
		@Pc(432) boolean local432 = true;
		if (arg1 instanceof Class8_Sub3_Sub1_Sub2) {
			local432 = ((Class8_Sub3_Sub1_Sub2) arg1).aClass78_1.aBoolean137;
		}
		@Pc(468) int local468;
		if (local432) {
			local468 = arg1.anInt7378 - arg1.aClass120_7.anInt3014;
			if (local468 != 0 && arg1.anInt7394 == -1 && arg1.anInt7406 != 0) {
				local430 = 2;
			}
			if (!arg0 && arg1.anInt7427 > 2) {
				local430 = 6;
			}
			if (!arg0 && arg1.anInt7427 > 3) {
				local430 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt7427 > 1) {
				local430 = 6;
			}
			if (!arg0 && arg1.anInt7427 > 2) {
				local430 = 8;
			}
		}
		if (arg1.anInt7426 > 0 && arg1.anInt7427 > 1) {
			arg1.anInt7426--;
			local430 = 8;
		}
		if (local362 == 2) {
			local430 <<= 0x1;
		} else if (local362 == 0) {
			local430 >>= 0x1;
		}
		Static325.anInt5266 = 0;
		if (local9.anInt1013 != -1) {
			local430 <<= 0x7;
			if (arg1.anInt7427 == 1) {
				local468 = arg1.anInt7425 * arg1.anInt7425;
				@Pc(574) int local574 = (local243 >= arg1.anInt7339 ? local243 - arg1.anInt7339 : arg1.anInt7339 + -local243) << 7;
				@Pc(592) int local592 = (arg1.anInt7343 > local260 ? arg1.anInt7343 - local260 : -arg1.anInt7343 + local260) << 7;
				@Pc(599) int local599 = local592 < local574 ? local574 : local592;
				@Pc(606) int local606 = local9.anInt1013 * 2 * local599;
				if (local606 < local468) {
					arg1.anInt7425 /= 2;
				} else if (local599 < local468 / 2) {
					arg1.anInt7425 -= local9.anInt1013;
					if (arg1.anInt7425 < 0) {
						arg1.anInt7425 = 0;
					}
				} else if (arg1.anInt7425 < local430) {
					arg1.anInt7425 += local9.anInt1013;
					if (local430 < arg1.anInt7425) {
						arg1.anInt7425 = local430;
					}
				}
			} else if (local430 > arg1.anInt7425) {
				arg1.anInt7425 += local9.anInt1013;
				if (arg1.anInt7425 > local430) {
					arg1.anInt7425 = local430;
				}
			} else if (arg1.anInt7425 > 0) {
				arg1.anInt7425 -= local9.anInt1013;
				if (arg1.anInt7425 < 0) {
					arg1.anInt7425 = 0;
				}
			}
			local430 = arg1.anInt7425 >> 7;
			if (local430 < 1) {
				local430 = 1;
			}
		}
		if (local243 > local223) {
			Static325.anInt5266 |= 0x4;
			arg1.anInt7339 += local430;
			if (arg1.anInt7339 > local243) {
				arg1.anInt7339 = local243;
			}
		} else if (local223 > local243) {
			arg1.anInt7339 -= local430;
			Static325.anInt5266 |= 0x8;
			if (arg1.anInt7339 < local243) {
				arg1.anInt7339 = local243;
			}
		}
		if (local260 > local226) {
			arg1.anInt7343 += local430;
			Static325.anInt5266 |= 0x1;
			if (local260 < arg1.anInt7343) {
				arg1.anInt7343 = local260;
			}
		} else if (local260 < local226) {
			Static325.anInt5266 |= 0x2;
			arg1.anInt7343 -= local430;
			if (arg1.anInt7343 < local260) {
				arg1.anInt7343 = local260;
			}
		}
		if (arg1.anInt7339 == local243 && arg1.anInt7343 == local260) {
			if (arg1.anInt7428 > 0) {
				arg1.anInt7428--;
			}
			arg1.anInt7427--;
		}
		if (local430 < 8) {
			Static206.anInt4094 = local362;
		} else {
			Static206.anInt4094 = 2;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method4134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static131.method1881(arg2)) {
			if (Static185.aClass110ArrayArray1[arg2] == null) {
				Static334.method4422(arg6, arg3, arg1, -1, arg7, arg4, arg5, Static412.aClass110ArrayArray2[arg2], arg0);
			} else {
				Static334.method4422(arg6, arg3, arg1, -1, arg7, arg4, arg5, Static185.aClass110ArrayArray1[arg2], arg0);
			}
		} else if (arg5 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static72.aBooleanArray7[local20] = true;
			}
		} else {
			Static72.aBooleanArray7[arg5] = true;
		}
	}
}
