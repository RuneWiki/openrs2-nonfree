import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_22 = new Class109(64);

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!sa;")
	public static final Class5_Sub37 aClass5_Sub37_1 = new Class5_Sub37(0, 0);

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_43 = new Class85("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([[[Lclient!r;IIIIZ)Z")
	public static boolean method1780(@OriginalArg(0) Class174[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(12) byte local12 = arg4 ? 1 : (byte) (Static116.anInt2145 & 0xFF);
		if (local12 == Static167.aByteArrayArrayArray8[Static239.anInt4811][arg2][arg1]) {
			return false;
		} else if ((Static255.aByteArrayArrayArray13[Static239.anInt4811][arg2][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(41) byte local41 = 0;
			Static339.anIntArray614[0] = arg2;
			@Pc(47) int local47 = 0;
			@Pc(50) int local50 = local41 + 1;
			Static118.anIntArray209[0] = arg1;
			Static167.aByteArrayArrayArray8[Static239.anInt4811][arg2][arg1] = local12;
			while (local50 != local47) {
				@Pc(67) int local67 = Static339.anIntArray614[local47] & 0xFFFF;
				@Pc(75) int local75 = Static339.anIntArray614[local47] >> 16 & 0xFF;
				@Pc(83) int local83 = Static339.anIntArray614[local47] >> 24 & 0xFF;
				@Pc(89) int local89 = Static118.anIntArray209[local47] & 0xFFFF;
				@Pc(97) int local97 = Static118.anIntArray209[local47] >> 16 & 0xFF;
				local47 = local47 + 1 & 0xFFF;
				@Pc(105) boolean local105 = false;
				if ((Static255.aByteArrayArrayArray13[Static239.anInt4811][local67][local89] & 0x4) == 0) {
					local105 = true;
				}
				@Pc(122) boolean local122 = false;
				@Pc(160) int local160;
				@Pc(202) int local202;
				label231: for (@Pc(126) int local126 = Static239.anInt4811 + 1; local126 <= 3; local126++) {
					if ((Static255.aByteArrayArrayArray13[local126][local67][local89] & 0x8) == 0) {
						@Pc(297) Class4_Sub5 local297;
						@Pc(309) int local309;
						@Pc(287) Class174 local287;
						@Pc(293) Class84 local293;
						if (local105 && arg0[local126][local67][local89] != null) {
							if (arg0[local126][local67][local89].aClass4_Sub3_2 != null) {
								local160 = Static331.method5737(local75);
								if (local160 == arg0[local126][local67][local89].aClass4_Sub3_2.anInt5786 || arg0[local126][local67][local89].aClass4_Sub3_1 != null && arg0[local126][local67][local89].aClass4_Sub3_1.anInt5786 == local160) {
									continue;
								}
								if (local83 != 0) {
									local202 = Static331.method5737(local83);
									if (local202 == arg0[local126][local67][local89].aClass4_Sub3_2.anInt5786 || arg0[local126][local67][local89].aClass4_Sub3_1 != null && local202 == arg0[local126][local67][local89].aClass4_Sub3_1.anInt5786) {
										continue;
									}
								}
								if (local97 != 0) {
									local202 = Static331.method5737(local97);
									if (arg0[local126][local67][local89].aClass4_Sub3_2.anInt5786 == local202 || arg0[local126][local67][local89].aClass4_Sub3_1 != null && local202 == arg0[local126][local67][local89].aClass4_Sub3_1.anInt5786) {
										continue;
									}
								}
							}
							local287 = arg0[local126][local67][local89];
							if (local287.aClass84_3 != null) {
								for (local293 = local287.aClass84_3; local293 != null; local293 = local293.aClass84_2) {
									local297 = local293.aClass4_Sub5_1;
									if (local297 instanceof Interface5) {
										@Pc(303) Interface5 local303 = (Interface5) local297;
										local309 = local303.method5913();
										@Pc(313) int local313 = local303.method5908();
										if (local309 == 21) {
											local309 = 19;
										}
										@Pc(326) int local326 = local309 | local313 << 6;
										if (local326 == local75 || local83 != 0 && local326 == local83 || local97 != 0 && local326 == local97) {
											continue label231;
										}
									}
								}
							}
						}
						local287 = arg0[local126][local67][local89];
						if (local287 != null && local287.aClass84_3 != null) {
							for (local293 = local287.aClass84_3; local293 != null; local293 = local293.aClass84_2) {
								local297 = local293.aClass4_Sub5_1;
								if (local297.aShort91 != local297.aShort92 || local297.aShort90 != local297.aShort93) {
									for (@Pc(392) int local392 = local297.aShort92; local392 <= local297.aShort91; local392++) {
										for (local309 = local297.aShort93; local309 <= local297.aShort90; local309++) {
											Static167.aByteArrayArrayArray8[local126][local392][local309] = local12;
										}
									}
								}
							}
						}
						local122 = true;
						Static167.aByteArrayArrayArray8[local126][local67][local89] = local12;
					}
				}
				if (local122) {
					local160 = Static8.aClass51Array1[Static239.anInt4811 + 1].method1856(local67, local89);
					if (local160 > Static254.anIntArray490[arg3]) {
						Static254.anIntArray490[arg3] = local160;
					}
					local202 = local67 << 7;
					if (Static119.anIntArray372[arg3] > local202) {
						Static119.anIntArray372[arg3] = local202;
					} else if (local202 > Static160.anIntArray327[arg3]) {
						Static160.anIntArray327[arg3] = local202;
					}
					@Pc(495) int local495 = local89 << 7;
					if (local495 < Static85.anIntArray132[arg3]) {
						Static85.anIntArray132[arg3] = local495;
					} else if (local495 > Static50.anIntArray90[arg3]) {
						Static50.anIntArray90[arg3] = local495;
					}
				}
				if (!local105) {
					if (local67 >= 1 && local12 != Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 - 1][local89]) {
						Static339.anIntArray614[local50] = local67 - 1 | 0x120000 | 0xD3000000;
						Static118.anIntArray209[local50] = local89 | 0x130000;
						local50 = local50 + 1 & 0xFFF;
						Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 - 1][local89] = local12;
					}
					local89++;
					if (local89 < Static269.anInt5281) {
						if (local67 - 1 >= 0 && Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 - 1][local89] != local12 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67][local89] & 0x4) == 0 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67 - 1][local89 - 1] & 0x4) == 0) {
							Static339.anIntArray614[local50] = 0x52000000 | 0x120000 | local67 - 1;
							Static118.anIntArray209[local50] = local89 | 0x130000;
							Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 - 1][local89] = local12;
							local50 = local50 + 1 & 0xFFF;
						}
						if (Static167.aByteArrayArrayArray8[Static239.anInt4811][local67][local89] != local12) {
							Static339.anIntArray614[local50] = 0x13000000 | 0x520000 | local67;
							Static118.anIntArray209[local50] = local89 | 0x530000;
							local50 = local50 + 1 & 0xFFF;
							Static167.aByteArrayArrayArray8[Static239.anInt4811][local67][local89] = local12;
						}
						if (Static22.anInt481 > local67 + 1 && Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 + 1][local89] != local12 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67][local89] & 0x4) == 0 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67 + 1][local89 - 1] & 0x4) == 0) {
							Static339.anIntArray614[local50] = local67 + 1 | 0x520000 | 0x92000000;
							Static118.anIntArray209[local50] = local89 | 0x530000;
							local50 = local50 + 1 & 0xFFF;
							Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 + 1][local89] = local12;
						}
					}
					local89--;
					if (local67 + 1 < Static22.anInt481 && local12 != Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 + 1][local89]) {
						Static339.anIntArray614[local50] = 0x53000000 | 0x920000 | local67 + 1;
						Static118.anIntArray209[local50] = local89 | 0x930000;
						Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 + 1][local89] = local12;
						local50 = local50 + 1 & 0xFFF;
					}
					local89--;
					if (local89 >= 0) {
						if (local67 - 1 >= 0 && Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 - 1][local89] != local12 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67][local89] & 0x4) == 0 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67 - 1][local89 + 1] & 0x4) == 0) {
							Static339.anIntArray614[local50] = local67 - 1 | 0xD20000 | 0x12000000;
							Static118.anIntArray209[local50] = local89 | 0xD30000;
							local50 = local50 + 1 & 0xFFF;
							Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 - 1][local89] = local12;
						}
						if (local12 != Static167.aByteArrayArrayArray8[Static239.anInt4811][local67][local89]) {
							Static339.anIntArray614[local50] = local67 | 0xD20000 | 0x93000000;
							Static118.anIntArray209[local50] = local89 | 0xD30000;
							local50 = local50 + 1 & 0xFFF;
							Static167.aByteArrayArrayArray8[Static239.anInt4811][local67][local89] = local12;
						}
						if (Static22.anInt481 > local67 + 1 && Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 + 1][local89] != local12 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67][local89] & 0x4) == 0 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][local67 + 1][local89 + 1] & 0x4) == 0) {
							Static339.anIntArray614[local50] = 0xD2000000 | 0x920000 | local67 + 1;
							Static118.anIntArray209[local50] = local89 | 0x930000;
							local50 = local50 + 1 & 0xFFF;
							Static167.aByteArrayArrayArray8[Static239.anInt4811][local67 + 1][local89] = local12;
						}
					}
				}
			}
			if (Static254.anIntArray490[arg3] != -1000000) {
				Static254.anIntArray490[arg3] += 10;
				Static119.anIntArray372[arg3] -= 50;
				Static160.anIntArray327[arg3] += 50;
				Static50.anIntArray90[arg3] += 50;
				Static85.anIntArray132[arg3] -= 50;
			}
			return true;
		}
	}
}
