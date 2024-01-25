import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	public static int anInt2220;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString22 = "";

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	public static int anInt2223 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZ[[[Lclient!ne;)Z")
	public static boolean method2008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class224[][][] arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static555.anInt9478 & 0xFF);
		if (local14 == Static68.aByteArrayArrayArray4[Static493.anInt8836][arg0][arg1]) {
			return false;
		} else if ((Static356.aByteArrayArrayArray17[Static493.anInt8836][arg0][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			@Pc(48) int local48 = 0;
			Static404.anIntArray533[0] = arg0;
			@Pc(55) int local55 = local46 + 1;
			Static177.anIntArray263[0] = arg1;
			Static68.aByteArrayArrayArray4[Static493.anInt8836][arg0][arg1] = local14;
			while (local55 != local48) {
				@Pc(73) int local73 = Static404.anIntArray533[local48] & 0xFFFF;
				@Pc(81) int local81 = Static404.anIntArray533[local48] >> 16 & 0xFF;
				@Pc(89) int local89 = Static404.anIntArray533[local48] >> 24 & 0xFF;
				@Pc(95) int local95 = Static177.anIntArray263[local48] & 0xFFFF;
				@Pc(103) int local103 = Static177.anIntArray263[local48] >> 16 & 0xFF;
				local48 = local48 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static356.aByteArrayArrayArray17[Static493.anInt8836][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(167) int local167;
				@Pc(214) int local214;
				label231: for (@Pc(129) int local129 = Static493.anInt8836 + 1; local129 <= 3; local129++) {
					if ((Static356.aByteArrayArrayArray17[local129][local73][local95] & 0x8) == 0) {
						@Pc(322) Class11_Sub1 local322;
						@Pc(332) int local332;
						@Pc(311) Class224 local311;
						@Pc(317) Class270 local317;
						if (local111 && arg4[local129][local73][local95] != null) {
							if (arg4[local129][local73][local95].aClass11_Sub4_3 != null) {
								local167 = Static56.method7853(local81);
								if (local167 == arg4[local129][local73][local95].aClass11_Sub4_3.anInt5482 || arg4[local129][local73][local95].aClass11_Sub4_2 != null && local167 == arg4[local129][local73][local95].aClass11_Sub4_2.anInt5482) {
									continue;
								}
								if (local89 != 0) {
									local214 = Static56.method7853(local89);
									if (arg4[local129][local73][local95].aClass11_Sub4_3.anInt5482 == local214 || arg4[local129][local73][local95].aClass11_Sub4_2 != null && local214 == arg4[local129][local73][local95].aClass11_Sub4_2.anInt5482) {
										continue;
									}
								}
								if (local103 != 0) {
									local214 = Static56.method7853(local103);
									if (local214 == arg4[local129][local73][local95].aClass11_Sub4_3.anInt5482 || arg4[local129][local73][local95].aClass11_Sub4_2 != null && local214 == arg4[local129][local73][local95].aClass11_Sub4_2.anInt5482) {
										continue;
									}
								}
							}
							local311 = arg4[local129][local73][local95];
							if (local311.aClass270_1 != null) {
								for (local317 = local311.aClass270_1; local317 != null; local317 = local317.aClass270_2) {
									local322 = local317.aClass11_Sub1_2;
									if (local322 instanceof Interface17) {
										@Pc(328) Interface17 local328 = (Interface17) local322;
										local332 = local328.method8119();
										@Pc(336) int local336 = local328.method8121();
										if (local332 == 21) {
											local332 = 19;
										}
										@Pc(349) int local349 = local332 | local336 << 6;
										if (local81 == local349 || local89 != 0 && local349 == local89 || local103 != 0 && local349 == local103) {
											continue label231;
										}
									}
								}
							}
						}
						local311 = arg4[local129][local73][local95];
						if (local311 != null && local311.aClass270_1 != null) {
							for (local317 = local311.aClass270_1; local317 != null; local317 = local317.aClass270_2) {
								local322 = local317.aClass11_Sub1_2;
								if (local322.aShort79 != local322.aShort78 || local322.aShort77 != local322.aShort80) {
									for (@Pc(422) int local422 = local322.aShort78; local422 <= local322.aShort79; local422++) {
										for (local332 = local322.aShort80; local332 <= local322.aShort77; local332++) {
											Static68.aByteArrayArrayArray4[local129][local422][local332] = local14;
										}
									}
								}
							}
						}
						local125 = true;
						Static68.aByteArrayArrayArray4[local129][local73][local95] = local14;
					}
				}
				if (local125) {
					local167 = Static47.aClass62Array1[Static493.anInt8836 + 1].JA(local73, local95);
					if (Static484.anIntArray773[arg2] < local167) {
						Static484.anIntArray773[arg2] = local167;
					}
					local214 = local73 << 9;
					@Pc(504) int local504 = local95 << 9;
					if (local214 < Static564.anIntArray823[arg2]) {
						Static564.anIntArray823[arg2] = local214;
					} else if (local214 > Static429.anIntArray567[arg2]) {
						Static429.anIntArray567[arg2] = local214;
					}
					if (Static9.anIntArray43[arg2] > local504) {
						Static9.anIntArray43[arg2] = local504;
					} else if (local504 > Static493.anIntArray777[arg2]) {
						Static493.anIntArray777[arg2] = local504;
					}
				}
				if (!local111) {
					if (local73 >= 1 && local14 != Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 - 1][local95]) {
						Static404.anIntArray533[local55] = local73 - 1 | 0xD3000000 | 0x120000;
						Static177.anIntArray263[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 - 1][local95] = local14;
					}
					local95++;
					if (local95 < Static44.anInt1275) {
						if (local73 - 1 >= 0 && Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 - 1][local95] != local14 && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73][local95] & 0x4) == 0 && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static404.anIntArray533[local55] = local73 - 1 | 0x120000 | 0x52000000;
							Static177.anIntArray263[local55] = local95 | 0x130000;
							local55 = local55 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 - 1][local95] = local14;
						}
						if (local14 != Static68.aByteArrayArrayArray4[Static493.anInt8836][local73][local95]) {
							Static404.anIntArray533[local55] = 0x13000000 | 0x520000 | local73;
							Static177.anIntArray263[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray4[Static493.anInt8836][local73][local95] = local14;
						}
						if (local73 + 1 < Static228.anInt4746 && Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 + 1][local95] != local14 && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73][local95] & 0x4) == 0 && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static404.anIntArray533[local55] = local73 + 1 | 0x92000000 | 0x520000;
							Static177.anIntArray263[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (local73 + 1 < Static228.anInt4746 && Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 + 1][local95] != local14) {
						Static404.anIntArray533[local55] = local73 + 1 | 0x920000 | 0x53000000;
						Static177.anIntArray263[local55] = local95 | 0x930000;
						Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 + 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local14 != Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 - 1][local95] && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73][local95] & 0x4) == 0 && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static404.anIntArray533[local55] = local73 - 1 | 0x12000000 | 0xD20000;
							Static177.anIntArray263[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 - 1][local95] = local14;
						}
						if (Static68.aByteArrayArrayArray4[Static493.anInt8836][local73][local95] != local14) {
							Static404.anIntArray533[local55] = local73 | 0xD20000 | 0x93000000;
							Static177.anIntArray263[local55] = local95 | 0xD30000;
							Static68.aByteArrayArrayArray4[Static493.anInt8836][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local73 + 1 < Static228.anInt4746 && local14 != Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 + 1][local95] && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73][local95] & 0x4) == 0 && (Static356.aByteArrayArrayArray17[Static493.anInt8836][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static404.anIntArray533[local55] = local73 + 1 | 0xD2000000 | 0x920000;
							Static177.anIntArray263[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray4[Static493.anInt8836][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static484.anIntArray773[arg2] != -1000000) {
				Static484.anIntArray773[arg2] += 10;
				Static564.anIntArray823[arg2] -= 50;
				Static429.anIntArray567[arg2] += 50;
				Static493.anIntArray777[arg2] += 50;
				Static9.anIntArray43[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!vp;IIIII)V")
	public static void method2009(@OriginalArg(0) Class288 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt8651 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static447.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class342 local35 = Static470.aClass342Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt8651; local37++) {
							if (arg0.aClass6_Sub29Array6[local37] == local35.aClass6_Sub29_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass6_Sub29Array6[arg0.anInt8651++] = local35.aClass6_Sub29_2;
						if (arg0.anInt8651 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt8651; local7 < 4; local7++) {
			arg0.aClass6_Sub29Array6[local7] = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2013(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(31) String local31 = Static495.method7439(arg0);
		if (local31 == null) {
			return;
		}
		for (@Pc(36) int local36 = 0; local36 < Static241.anInt4921; local36++) {
			@Pc(42) String local42 = Static381.aStringArray42[local36];
			if (local42.startsWith("*")) {
				local42 = local42.substring(1);
			}
			local42 = Static495.method7439(local42);
			if (local42 != null && local42.equals(local31)) {
				Static241.anInt4921--;
				for (@Pc(66) int local66 = local36; local66 < Static241.anInt4921; local66++) {
					Static381.aStringArray42[local66] = Static381.aStringArray42[local66 + 1];
					Static87.aStringArray9[local66] = Static87.aStringArray9[local66 + 1];
					Static331.anIntArray846[local66] = Static331.anIntArray846[local66 + 1];
					Static208.aStringArray25[local66] = Static208.aStringArray25[local66 + 1];
					Static578.anIntArray844[local66] = Static578.anIntArray844[local66 + 1];
					Static199.aBooleanArray13[local66] = Static199.aBooleanArray13[local66 + 1];
				}
				Static435.anInt7935 = Static32.anInt1035;
				Static298.method4854(Static428.aClass181_96);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static392.method6180(arg0), -81849);
				Static547.aClass6_Sub26_Sub2_2.method4998(arg0);
				return;
			}
		}
	}
}
