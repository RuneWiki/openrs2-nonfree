import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dp", name = "kb", descriptor = "[I")
	public static final int[] anIntArray160 = new int[6];

	@OriginalMember(owner = "client!dp", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray165 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	public static void method2125() {
		@Pc(1) Class10 local1 = Static529.aClass10_60;
		synchronized (Static529.aClass10_60) {
			Static529.aClass10_60.method262();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!as;Lclient!r;IIIIIIIIIBLclient!da;I)Lclient!da;")
	public static Class57 method2144(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) Class57 arg11, @OriginalArg(13) int arg12) {
		if (arg11 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg0 != null) {
			local11 = arg0.method451(-1, arg10, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg5 << 32) + (long) (arg7 + (arg3 << 16) + (arg6 << 24)) + ((long) arg4 << 48);
		@Pc(50) Class10 local50 = Static529.aClass10_60;
		@Pc(69) Class57 local69;
		synchronized (Static529.aClass10_60) {
			local69 = (Class57) Static529.aClass10_60.method250(local48);
		}
		if (local69 == null || arg1.method7169(local69.PA(), local11) != 0) {
			if (local69 != null) {
				local11 = arg1.method7203(local11, local69.PA());
			}
			@Pc(101) byte local101;
			if (arg7 == 1) {
				local101 = 9;
			} else if (arg7 == 2) {
				local101 = 12;
			} else if (arg7 == 3) {
				local101 = 15;
			} else if (arg7 == 4) {
				local101 = 18;
			} else {
				local101 = 21;
			}
			@Pc(144) int[] local144 = new int[] { 64, 96, 128 };
			@Pc(161) Class226 local161 = new Class226(local101 * 3 + 1, local101 * 6 - local101, 0);
			@Pc(168) int local168 = local161.method5293(0, 0, 0);
			@Pc(172) int[][] local172 = new int[3][local101];
			@Pc(180) int local180;
			@Pc(184) int local184;
			@Pc(186) int local186;
			@Pc(210) int local210;
			for (@Pc(174) int local174 = 0; local174 < 3; local174++) {
				local180 = local144[local174];
				local184 = local144[local174];
				for (local186 = 0; local186 < local101; local186++) {
					@Pc(194) int local194 = (local186 << 14) / local101;
					@Pc(202) int local202 = local180 * Class3_Sub17.anIntArray175[local194] >> 14;
					local210 = local184 * Class3_Sub17.anIntArray177[local194] >> 14;
					local172[local174][local186] = local161.method5293(local210, local202, 0);
				}
			}
			for (local180 = 0; local180 < 3; local180++) {
				local184 = (local180 * 256 + 128) / 3;
				local186 = 256 - local184;
				@Pc(261) byte local261 = (byte) (arg3 * local186 + arg6 * local184 >> 8);
				@Pc(306) short local306 = (short) (((arg5 & 0x7F) * local186 + (arg4 & 0x7F) * local184 & 0x7F00) + (local184 * (arg4 & 0xFC00) + (arg5 & 0xFC00) * local186 & 0xFC0000) + (local184 * (arg4 & 0x380) + (arg5 & 0x380) * local186 & 0x38000) >> 8);
				for (local210 = 0; local210 < local101; local210++) {
					if (local180 == 0) {
						local161.method5286(local172[0][(local210 + 1) % local101], (byte) 1, local261, local306, local168, (short) -1, local172[0][local210], (byte) -1);
					} else {
						local161.method5286(local172[local180 - 1][(local210 + 1) % local101], (byte) 1, local261, local306, local172[local180 - 1][local210], (short) -1, local172[local180][(local210 + 1) % local101], (byte) -1);
						local161.method5286(local172[local180][(local210 + 1) % local101], (byte) 1, local261, local306, local172[local180 - 1][local210], (short) -1, local172[local180][local210], (byte) -1);
					}
				}
			}
			local69 = arg1.method7178(local161, local11, Static128.anInt2812, 64, 768);
			@Pc(428) Class10 local428 = Static529.aClass10_60;
			synchronized (Static529.aClass10_60) {
				Static529.aClass10_60.method254(local69, local48);
			}
		}
		@Pc(444) int local444 = arg11.KA();
		@Pc(447) int local447 = arg11.l();
		@Pc(450) int local450 = arg11.OA();
		@Pc(453) int local453 = arg11.za();
		@Pc(455) Class3_Sub3_Sub15 local455 = null;
		if (arg0 != null) {
			@Pc(462) int local462 = arg0.anIntArray55[arg10];
			local455 = Static330.aClass279_2.method6220(local462 >> 16);
			arg10 = local462 & 0xFFFF;
		}
		if (local455 == null) {
			local69 = local69.method7522((byte) 3, local11, true);
			local69.R(local447 - local444 >> 1, 128, local453 - local450 >> 1);
			local69.oa(local447 + local444 >> 1, 0, local450 + local453 >> 1);
		} else {
			local69 = local69.method7522((byte) 3, local11, true);
			local69.R(local447 - local444 >> 1, 128, local453 - local450 >> 1);
			local69.oa(local447 + local444 >> 1, 0, local453 + local450 >> 1);
			local69.method7510(local455, arg10);
		}
		if (arg12 != 0) {
			local69.MA(arg12);
		}
		if (arg9 != 0) {
			local69.W(arg9);
		}
		if (arg8 != 0) {
			local69.oa(0, arg8, 0);
		}
		return local69;
	}
}
