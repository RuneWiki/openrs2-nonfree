import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Lclient!ek;")
	public static Class42 aClass42_24;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!ek;")
	public static Class42 aClass42_25;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public static int anInt2337 = 0;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "[I")
	public static int[] anIntArray206 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
	public static int anInt2339 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!oe;I)V")
	public static void method1703(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(9) int local9 = Static250.anInt3120 >> 1;
		@Pc(15) int local15 = Static250.anInt3117 >> 2 << 10;
		@Pc(19) byte[][] local19 = new byte[Static250.anInt3121][Static250.anInt3119];
		@Pc(35) int local35;
		@Pc(99) int local99;
		@Pc(112) int local112;
		while (arg0.anInt2789 < arg0.aByteArray17.length) {
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			local35 = 0;
			if (arg0.method2146() == 1) {
				local31 = true;
				local35 = arg0.method2146();
				local33 = arg0.method2146();
			}
			@Pc(54) int local54 = arg0.method2146();
			@Pc(58) int local58 = arg0.method2146();
			@Pc(65) int local65 = local54 * 64 - Static250.anInt3122;
			@Pc(76) int local76 = Static250.anInt3119 + Static250.anInt3118 - local58 * 64 - 1;
			if (local65 >= 0 && local76 - 63 >= 0 && Static250.anInt3121 > local65 + 63 && local76 < Static250.anInt3119) {
				for (local99 = 0; local99 < 64; local99++) {
					@Pc(110) byte[] local110 = local19[local99 + local65];
					for (local112 = 0; local112 < 64; local112++) {
						if (!local31 || local99 >= local35 * 8 && local99 < local35 * 8 + 8 && local33 * 8 <= local112 && local33 * 8 + 8 > local112) {
							local110[local76 - local112] = arg0.method2170();
						}
					}
				}
			} else if (local31) {
				arg0.anInt2789 += 64;
			} else {
				arg0.anInt2789 += 4096;
			}
		}
		@Pc(193) int local193 = Static250.anInt3121;
		local35 = Static250.anInt3119;
		@Pc(198) int[] local198 = new int[local35];
		@Pc(201) int[] local201 = new int[local35];
		@Pc(204) int[] local204 = new int[local35];
		@Pc(207) int[] local207 = new int[local35];
		@Pc(210) int[] local210 = new int[local35];
		for (local99 = -5; local99 < local193; local99++) {
			if ((local99 & 0x1FF) == 0) {
				Static244.method3897(true);
			}
			@Pc(257) int local257;
			@Pc(319) int local319;
			for (@Pc(235) int local235 = 0; local235 < local35; local235++) {
				local112 = local99 + 5;
				@Pc(302) int local302;
				if (local112 < local193) {
					local257 = local19[local112][local235] & 0xFF;
					if (local257 > 0) {
						@Pc(266) Class172 local266 = Static173.method3143(local257 - 1);
						local201[local235] += local266.anInt5468;
						local198[local235] += local266.anInt5466;
						local210[local235] += local266.anInt5461;
						local204[local235] += local266.anInt5465;
						local302 = local207[local235]++;
					}
				}
				local257 = local99 - 5;
				if (local257 >= 0) {
					local319 = local19[local257][local235] & 0xFF;
					if (local319 > 0) {
						@Pc(331) Class172 local331 = Static173.method3143(local319 - 1);
						local201[local235] -= local331.anInt5468;
						local198[local235] -= local331.anInt5466;
						local210[local235] -= local331.anInt5461;
						local204[local235] -= local331.anInt5465;
						local302 = local207[local235]--;
					}
				}
			}
			if (local99 >= 0) {
				local112 = 0;
				@Pc(383) int[][] local383 = Static250.anIntArrayArrayArray11[local99 >> 6];
				local257 = 0;
				local319 = 0;
				@Pc(389) int local389 = 0;
				@Pc(391) int local391 = 0;
				for (@Pc(393) int local393 = -5; local393 < local35; local393++) {
					@Pc(400) int local400 = local393 + 5;
					if (local400 < local35) {
						local391 += local204[local400];
						local389 += local207[local400];
						local257 += local198[local400];
						local112 += local201[local400];
						local319 += local210[local400];
					}
					@Pc(441) int local441 = local393 - 5;
					if (local441 >= 0) {
						local391 -= local204[local441];
						local257 -= local198[local441];
						local319 -= local210[local441];
						local112 -= local201[local441];
						local389 -= local207[local441];
					}
					if (local393 >= 0 && local389 > 0) {
						@Pc(491) int[] local491 = local383[local393 >> 6];
						@Pc(509) int local509 = local391 == 0 ? 0 : Static19.method323(local112 * 256 / local391, local257 / local389, local319 / local389);
						if (local19[local99][local393] != 0) {
							if (local491 == null) {
								local491 = local383[local393 >> 6] = new int[4096];
							}
							@Pc(551) int local551 = (local509 & 0x7F) + local9;
							if (local551 < 0) {
								local551 = 0;
							} else if (local551 > 127) {
								local551 = 127;
							}
							@Pc(578) int local578 = (local509 & 0x380) + ((local509 + local15 & 0xFC00) + local551);
							local491[(local99 & 0x3F) + ((local393 & 0x3F) << 6)] = Static1.anIntArray2[Static74.method1402(96, local578)];
						} else if (local491 != null) {
							local491[(local99 & 0x3F) + ((local393 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
	public static void method1705() {
		Static92.aClass157_21.method4034(5);
		Static108.aClass157_23.method4034(5);
	}
}
