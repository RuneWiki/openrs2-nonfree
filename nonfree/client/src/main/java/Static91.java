import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "Lclient!mk;")
	public static Class70 aClass70_12;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	public static int anInt5965;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "Lclient!bi;")
	public static Class26 aClass26_29 = null;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
	public static int anInt5969 = 0;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
	public static int anInt5971 = -50;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
	public static volatile int anInt5974 = -1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!qf;IIIII)V")
	public static void method5055(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3695 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass7_Sub16_Sub1Array3[local4] != null) {
				arg0.anInt3695++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt3695; local22++) {
			@Pc(31) int local31 = Static142.anIntArrayArrayArray11[arg1][arg2][arg3];
			@Pc(40) Class7_Sub16_Sub1 local40;
			while (local31 != 0) {
				local40 = Static116.aClass7_Sub16_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass7_Sub16_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static142.anIntArrayArrayArray11[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static116.aClass7_Sub16_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass7_Sub16_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt3695 - 1; local85++) {
				arg0.aClass7_Sub16_Sub1Array3[local85] = arg0.aClass7_Sub16_Sub1Array3[local85 + 1];
			}
			arg0.anInt3695--;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!pe;IIIILclient!sj;Lclient!qi;IZIIIII)Lclient!sj;")
	public static Class31 method5056(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class31 arg6, @OriginalArg(7) Class170 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return null;
		}
		@Pc(9) int local9 = 1031;
		if (arg7 != null) {
			local9 = arg7.method4319(arg12, false, -1) | 0x407;
			local9 &= 0xFFFFFDFF;
		}
		@Pc(45) long local45 = (long) ((arg10 << 16) + arg2 + (arg8 << 24)) + ((long) arg0 << 32) + ((long) arg3 << 48);
		@Pc(47) Class103 local47 = Static192.aClass103_35;
		@Pc(55) Class31 local55;
		synchronized (Static192.aClass103_35) {
			local55 = (Class31) Static192.aClass103_35.method2682(local45);
		}
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(163) int local163;
		@Pc(167) int local167;
		if (local55 == null || arg1.method5399(local55.method1912(), local9) != 0) {
			if (local55 != null) {
				local9 = arg1.method5435(local9, local55.method1912());
			}
			@Pc(85) byte local85;
			if (arg2 == 1) {
				local85 = 9;
			} else if (arg2 == 2) {
				local85 = 12;
			} else if (arg2 == 3) {
				local85 = 15;
			} else if (arg2 == 4) {
				local85 = 18;
			} else {
				local85 = 21;
			}
			@Pc(127) int[] local127 = new int[] { 64, 96, 128 };
			@Pc(145) Class140 local145 = new Class140(local85 * 3 + 1, -local85 + local85 * 6, 0);
			local152 = local145.method3671(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local85];
			@Pc(169) int local169;
			@Pc(192) int local192;
			for (local158 = 0; local158 < 3; local158++) {
				local163 = local127[local158];
				local167 = local127[local158];
				for (local169 = 0; local169 < local85; local169++) {
					@Pc(176) int local176 = (local169 << 14) / local85;
					@Pc(184) int local184 = Class147.anIntArray604[local176] * local163 >> 15;
					local192 = local167 * Class147.anIntArray603[local176] >> 15;
					local156[local158][local169] = local145.method3671(0, local192, local184);
				}
			}
			for (local163 = 0; local163 < 3; local163++) {
				local167 = (local163 * 256 + 128) / 3;
				local169 = 256 - local167;
				@Pc(238) byte local238 = (byte) (local167 * arg8 + arg10 * local169 >> 8);
				@Pc(283) short local283 = (short) (((arg0 & 0xFC00) * local169 + local167 * (arg3 & 0xFC00) & 0xFC0000) + (local169 * (arg0 & 0x380) + local167 * (arg3 & 0x380) & 0x38000) + (local167 * (arg3 & 0x7F) + (arg0 & 0x7F) * local169 & 0x7F00) >> 8);
				for (local192 = 0; local192 < local85; local192++) {
					if (local163 == 0) {
						local145.method3680(local283, (byte) 1, local152, local238, local156[0][(local192 + 1) % local85], (byte) -1, (short) -1, local156[0][local192]);
					} else {
						local145.method3680(local283, (byte) 1, local156[local163 - 1][local192], local238, local156[local163 - 1][(local192 + 1) % local85], (byte) -1, (short) -1, local156[local163][(local192 + 1) % local85]);
						local145.method3680(local283, (byte) 1, local156[local163 - 1][local192], local238, local156[local163][(local192 + 1) % local85], (byte) -1, (short) -1, local156[local163][local192]);
					}
				}
			}
			local55 = arg1.method5475(local145, local9, Static169.anInt3517, 64, 768);
			@Pc(404) Class103 local404 = Static192.aClass103_35;
			synchronized (Static192.aClass103_35) {
				Static192.aClass103_35.method2687(local55, local45);
			}
		}
		@Pc(423) int local423 = arg2 * 64 - 1;
		@Pc(426) int local426 = -local423;
		@Pc(429) int local429 = -local423;
		@Pc(431) int local431 = local423;
		local152 = local423;
		if (arg9) {
			if (arg11 > 1024 && arg11 < 7168) {
				local426 -= 128;
			}
			if (arg11 > 5120 && arg11 < 11264) {
				local152 = local423 + 128;
			}
			if (arg11 > 13312 || arg11 < 3072) {
				local429 -= 128;
			}
			if (arg11 > 9216 && arg11 < 15360) {
				local431 = local423 + 128;
			}
		}
		@Pc(478) int local478 = arg6.method1957();
		local158 = arg6.method1935();
		local163 = arg6.method1933();
		if (local429 > local163) {
			local163 = local429;
		}
		local167 = arg6.method1919();
		if (local426 > local478) {
			local478 = local426;
		}
		if (local158 > local431) {
			local158 = local431;
		}
		if (local152 < local167) {
			local167 = local152;
		}
		@Pc(526) Class7_Sub1_Sub14 local526 = null;
		if (arg7 != null) {
			@Pc(533) int local533 = arg7.anIntArray652[arg12];
			local526 = Static85.method1807(local533 >> 16);
			arg12 = local533 & 0xFFFF;
		}
		if (local526 == null) {
			local55 = local55.method1917((byte) 3, local9, true);
			local55.method1926((local158 - local478) / 2, 128, (local167 - local163) / 2);
			local55.method1915((local478 + local158) / 2, 0, (local163 + local167) / 2);
		} else {
			local55 = local55.method1917((byte) 3, local9, true);
			local55.method1926((local158 - local478) / 2, 128, (local167 - local163) / 2);
			local55.method1915((local158 + local478) / 2, 0, (local163 + local167) / 2);
			local55.method1910(arg12, local526);
		}
		if (arg13 != 0) {
			local55.method1913(arg13);
		}
		if (arg4 != 0) {
			local55.method1924(arg4);
		}
		if (arg5 != 0) {
			local55.method1915(0, arg5, 0);
		}
		return local55;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V")
	public static void method5059() {
		@Pc(9) Class103 local9 = Static307.aClass103_63;
		synchronized (Static307.aClass103_63) {
			Static307.aClass103_63.method2679(5);
		}
		local9 = Static294.aClass103_68;
		synchronized (Static294.aClass103_68) {
			Static294.aClass103_68.method2679(5);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!bi;III)V")
	public static void method5060(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static60.aClass26_13 != null || Static169.aBoolean260 || (arg0 == null || Static287.method4744(arg0) == null)) {
			return;
		}
		Static60.aClass26_13 = arg0;
		Static298.aClass26_28 = Static287.method4744(arg0);
		Static46.anInt1319 = arg2;
		Static326.aBoolean455 = false;
		Static168.anInt3512 = arg1;
		Static179.anInt3659 = 0;
	}
}
