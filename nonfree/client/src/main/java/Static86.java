import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[5];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!r;Lclient!fo;IIIILclient!da;IIZII)Lclient!da;")
	public static Class65 method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) Class111 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class65 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method2551(-1, arg9, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) (arg1 + (arg5 << 16) + (arg7 << 24)) + ((long) arg10 << 32) + ((long) arg0 << 48);
		@Pc(50) Class167 local50 = Static580.aClass167_36;
		@Pc(58) Class65 local58;
		synchronized (Static580.aClass167_36) {
			local58 = (Class65) Static580.aClass167_36.method3966(local48);
		}
		if (local58 == null || arg2.method7793(local58.PA(), local11) != 0) {
			if (local58 != null) {
				local11 = arg2.method7778(local11, local58.PA());
			}
			@Pc(88) byte local88;
			if (arg1 == 1) {
				local88 = 9;
			} else if (arg1 == 2) {
				local88 = 12;
			} else if (arg1 == 3) {
				local88 = 15;
			} else if (arg1 == 4) {
				local88 = 18;
			} else {
				local88 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class59 local148 = new Class59(local88 * 3 + 1, local88 * 3 * 2 - local88, 0);
			@Pc(155) int local155 = local148.method1592(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local88];
			@Pc(167) int local167;
			@Pc(171) int local171;
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (@Pc(161) int local161 = 0; local161 < 3; local161++) {
				local167 = local130[local161];
				local171 = local130[local161];
				for (local173 = 0; local173 < local88; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local88;
					@Pc(189) int local189 = Class262.anIntArray420[local181] * local167 >> 14;
					local197 = local171 * Class262.anIntArray421[local181] >> 14;
					local159[local161][local173] = local148.method1592(0, local197, local189);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(244) byte local244 = (byte) (local171 * arg7 + local173 * arg5 >> 8);
				@Pc(289) short local289 = (short) (((arg10 & 0x7F) * local173 + (arg0 & 0x7F) * local171 & 0x7F00) + (local171 * (arg0 & 0x380) + (arg10 & 0x380) * local173 & 0x38000) + (local173 * (arg10 & 0xFC00) + (arg0 & 0xFC00) * local171 & 0xFC0000) >> 8);
				for (local197 = 0; local197 < local88; local197++) {
					if (local167 == 0) {
						local148.method1589(local159[0][local197], (byte) 1, local159[0][(local197 + 1) % local88], local289, (byte) -1, local244, (short) -1, local155);
					} else {
						local148.method1589(local159[local167][(local197 + 1) % local88], (byte) 1, local159[local167 - 1][(local197 + 1) % local88], local289, (byte) -1, local244, (short) -1, local159[local167 - 1][local197]);
						local148.method1589(local159[local167][local197], (byte) 1, local159[local167][(local197 + 1) % local88], local289, (byte) -1, local244, (short) -1, local159[local167 - 1][local197]);
					}
				}
			}
			local58 = arg2.method7828(local148, local11, Static496.anInt9330, 64, 768);
			@Pc(416) Class167 local416 = Static580.aClass167_36;
			synchronized (Static580.aClass167_36) {
				Static580.aClass167_36.method3974(local48, local58);
			}
		}
		@Pc(432) int local432 = arg8.KA();
		@Pc(440) int local440 = arg8.l();
		@Pc(443) int local443 = arg8.OA();
		@Pc(446) int local446 = arg8.za();
		@Pc(448) Class4_Sub6_Sub8 local448 = null;
		if (arg3 != null) {
			@Pc(455) int local455 = arg3.anIntArray153[arg9];
			local448 = Static17.aClass254_1.method5940(local455 >> 16);
			arg9 = local455 & 0xFFFF;
		}
		if (local448 == null) {
			local58 = local58.method7682((byte) 3, local11, true);
			local58.R(local440 - local432 >> 1, 128, local446 - local443 >> 1);
			local58.oa(local432 + local440 >> 1, 0, local443 + local446 >> 1);
		} else {
			local58 = local58.method7682((byte) 3, local11, true);
			local58.R(local440 - local432 >> 1, 128, local446 - local443 >> 1);
			local58.oa(local432 + local440 >> 1, 0, local443 + local446 >> 1);
			local58.method7667(local448, arg9);
		}
		if (arg12 != 0) {
			local58.MA(arg12);
		}
		if (arg11 != 0) {
			local58.W(arg11);
		}
		if (arg6 != 0) {
			local58.oa(0, arg6, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ek;)Lclient!nga;")
	public static Class30_Sub3 method1809(@OriginalArg(1) Class4_Sub13 arg0) {
		return new Class30_Sub3(arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7013(), arg0.method7004());
	}
}
