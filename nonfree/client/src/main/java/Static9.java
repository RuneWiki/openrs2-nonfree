import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!cq;")
	private static final Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!cq;)V")
	private static void method86(@OriginalArg(0) Class45 arg0) {
		arg0.anInt1109 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray7[local4]) {
				arg0.aByteArray23[arg0.anInt1109] = (byte) local4;
				arg0.anInt1109++;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([BI[BII)I")
	public static int method87(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class45 local1 = aClass45_1;
		synchronized (aClass45_1) {
			aClass45_1.aByteArray25 = arg2;
			aClass45_1.anInt1102 = 9;
			aClass45_1.aByteArray22 = arg0;
			aClass45_1.anInt1106 = 0;
			aClass45_1.anInt1105 = arg1;
			aClass45_1.anInt1119 = 0;
			aClass45_1.anInt1104 = 0;
			aClass45_1.anInt1103 = 0;
			aClass45_1.anInt1120 = 0;
			method92(aClass45_1);
			@Pc(37) int local37 = arg1 - aClass45_1.anInt1105;
			aClass45_1.aByteArray25 = null;
			aClass45_1.aByteArray22 = null;
			return local37;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lclient!cq;)V")
	private static void method88(@OriginalArg(0) Class45 arg0) {
		@Pc(2) byte local2 = arg0.aByte13;
		@Pc(5) int local5 = arg0.anInt1110;
		@Pc(8) int local8 = arg0.anInt1121;
		@Pc(11) int local11 = arg0.anInt1100;
		@Pc(13) int[] local13 = Static252.anIntArray537;
		@Pc(16) int local16 = arg0.anInt1111;
		@Pc(19) byte[] local19 = arg0.aByteArray22;
		@Pc(22) int local22 = arg0.anInt1106;
		@Pc(25) int local25 = arg0.anInt1105;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt1113 + 1;
		label63: while (true) {
			if (local5 > 0) {
				while (true) {
					if (local25 == 0) {
						break label63;
					}
					if (local5 == 1) {
						if (local25 == 0) {
							local5 = 1;
							break label63;
						}
						local19[local22] = local2;
						local22++;
						local25--;
						break;
					}
					local19[local22] = local2;
					local5--;
					local22++;
					local25--;
				}
			}
			@Pc(60) boolean local60 = true;
			@Pc(81) byte local81;
			while (local60) {
				local60 = false;
				if (local8 == local32) {
					local5 = 0;
					break label63;
				}
				local2 = (byte) local11;
				local16 = local13[local16];
				local81 = (byte) (local16 & 0xFF);
				local16 >>= 0x8;
				local8++;
				if (local81 != local11) {
					local11 = local81;
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				} else if (local8 == local32) {
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				}
			}
			local5 = 2;
			local16 = local13[local16];
			local81 = (byte) (local16 & 0xFF);
			local16 >>= 0x8;
			local8++;
			if (local8 != local32) {
				if (local81 == local11) {
					local5 = 3;
					local16 = local13[local16];
					local81 = (byte) (local16 & 0xFF);
					local16 >>= 0x8;
					local8++;
					if (local8 != local32) {
						if (local81 == local11) {
							local16 = local13[local16];
							local81 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
							local5 = (local81 & 0xFF) + 4;
							local16 = local13[local16];
							local11 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
						} else {
							local11 = local81;
						}
					}
				} else {
					local11 = local81;
				}
			}
		}
		@Pc(212) int local212 = arg0.anInt1120;
		arg0.anInt1120 += local27 - local25;
		arg0.aByte13 = local2;
		arg0.anInt1110 = local5;
		arg0.anInt1121 = local8;
		arg0.anInt1100 = local11;
		Static252.anIntArray537 = local13;
		arg0.anInt1111 = local16;
		arg0.aByteArray22 = local19;
		arg0.anInt1106 = local22;
		arg0.anInt1105 = local25;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!cq;)I")
	private static int method89(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1) {
		while (arg1.anInt1119 < arg0) {
			arg1.anInt1104 = arg1.anInt1104 << 8 | arg1.aByteArray25[arg1.anInt1102] & 0xFF;
			arg1.anInt1119 += 8;
			arg1.anInt1102++;
			arg1.anInt1103++;
		}
		@Pc(17) int local17 = arg1.anInt1104 >> arg1.anInt1119 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt1119 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method90(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(6) int local6 = 0; local6 < arg6; local6++) {
				if (arg3[local6] == local3) {
					arg2[local1] = local6;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lclient!cq;)B")
	private static byte method91(@OriginalArg(0) Class45 arg0) {
		return (byte) method89(8, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(Lclient!cq;)V")
	private static void method92(@OriginalArg(0) Class45 arg0) {
		arg0.anInt1101 = 1;
		if (Static252.anIntArray537 == null) {
			Static252.anIntArray537 = new int[arg0.anInt1101 * 100000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(60) byte local60 = method91(arg0);
				if (local60 == 23) {
					return;
				}
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method91(arg0);
				local60 = method93(arg0);
				arg0.anInt1112 = 0;
				local60 = method91(arg0);
				arg0.anInt1112 = arg0.anInt1112 << 8 | local60 & 0xFF;
				local60 = method91(arg0);
				arg0.anInt1112 = arg0.anInt1112 << 8 | local60 & 0xFF;
				local60 = method91(arg0);
				arg0.anInt1112 = arg0.anInt1112 << 8 | local60 & 0xFF;
				@Pc(138) int local138;
				for (local138 = 0; local138 < 16; local138++) {
					local60 = method93(arg0);
					if (local60 == 1) {
						arg0.aBooleanArray6[local138] = true;
					} else {
						arg0.aBooleanArray6[local138] = false;
					}
				}
				for (local138 = 0; local138 < 256; local138++) {
					arg0.aBooleanArray7[local138] = false;
				}
				@Pc(182) int local182;
				for (local138 = 0; local138 < 16; local138++) {
					if (arg0.aBooleanArray6[local138]) {
						for (local182 = 0; local182 < 16; local182++) {
							local60 = method93(arg0);
							if (local60 == 1) {
								arg0.aBooleanArray7[local138 * 16 + local182] = true;
							}
						}
					}
				}
				method86(arg0);
				@Pc(213) int local213 = arg0.anInt1109 + 2;
				@Pc(217) int local217 = method89(3, arg0);
				@Pc(221) int local221 = method89(15, arg0);
				for (local138 = 0; local138 < local221; local138++) {
					local182 = 0;
					while (true) {
						local60 = method93(arg0);
						if (local60 == 0) {
							arg0.aByteArray24[local138] = (byte) local182;
							break;
						}
						local182++;
					}
				}
				@Pc(246) byte[] local246 = new byte[6];
				@Pc(248) byte local248 = 0;
				while (local248 < local217) {
					local246[local248] = local248++;
				}
				for (local138 = 0; local138 < local221; local138++) {
					local248 = arg0.aByteArray24[local138];
					@Pc(273) byte local273 = local246[local248];
					while (local248 > 0) {
						local246[local248] = local246[local248 - 1];
						local248--;
					}
					local246[0] = local273;
					arg0.aByteArray20[local138] = local273;
				}
				@Pc(304) int local304;
				for (local304 = 0; local304 < local217; local304++) {
					@Pc(309) int local309 = method89(5, arg0);
					for (local138 = 0; local138 < local213; local138++) {
						while (true) {
							local60 = method93(arg0);
							if (local60 == 0) {
								arg0.aByteArrayArray4[local304][local138] = (byte) local309;
								break;
							}
							local60 = method93(arg0);
							if (local60 == 0) {
								local309++;
							} else {
								local309--;
							}
						}
					}
				}
				for (local304 = 0; local304 < local217; local304++) {
					@Pc(347) byte local347 = 32;
					@Pc(349) byte local349 = 0;
					for (local138 = 0; local138 < local213; local138++) {
						if (arg0.aByteArrayArray4[local304][local138] > local349) {
							local349 = arg0.aByteArrayArray4[local304][local138];
						}
						if (arg0.aByteArrayArray4[local304][local138] < local347) {
							local347 = arg0.aByteArrayArray4[local304][local138];
						}
					}
					method90(arg0.anIntArrayArray18[local304], arg0.anIntArrayArray19[local304], arg0.anIntArrayArray17[local304], arg0.aByteArrayArray4[local304], local347, local349, local213);
					arg0.anIntArray138[local304] = local347;
				}
				@Pc(420) int local420 = arg0.anInt1109 + 1;
				@Pc(422) byte local422 = -1;
				for (local138 = 0; local138 <= 255; local138++) {
					arg0.anIntArray139[local138] = 0;
				}
				@Pc(438) int local438 = 4095;
				for (@Pc(440) int local440 = 15; local440 >= 0; local440--) {
					for (@Pc(443) int local443 = 15; local443 >= 0; local443--) {
						arg0.aByteArray21[local438] = (byte) (local440 * 16 + local443);
						local438--;
					}
					arg0.anIntArray140[local440] = local438 + 1;
				}
				@Pc(470) int local470 = 0;
				@Pc(473) int local473 = local422 + 1;
				@Pc(475) byte local475 = 50;
				@Pc(480) byte local480 = arg0.aByteArray20[0];
				@Pc(485) int local485 = arg0.anIntArray138[local480];
				@Pc(490) int[] local490 = arg0.anIntArrayArray18[local480];
				@Pc(495) int[] local495 = arg0.anIntArrayArray17[local480];
				@Pc(500) int[] local500 = arg0.anIntArrayArray19[local480];
				@Pc(501) int local501 = local475 - 1;
				@Pc(503) int local503 = local485;
				@Pc(507) int local507;
				@Pc(516) byte local516;
				for (local507 = method89(local485, arg0); local507 > local490[local503]; local507 = local507 << 1 | local516) {
					local503++;
					local516 = method93(arg0);
				}
				@Pc(531) int local531 = local495[local507 - local500[local503]];
				while (true) {
					while (local531 != local420) {
						if (local531 == 0 || local531 == 1) {
							@Pc(541) int local541 = -1;
							@Pc(543) int local543 = 1;
							do {
								if (local531 == 0) {
									local541 += local543;
								} else if (local531 == 1) {
									local541 += local543 * 2;
								}
								local543 *= 2;
								if (local501 == 0) {
									local473++;
									local501 = 50;
									local480 = arg0.aByteArray20[local473];
									local485 = arg0.anIntArray138[local480];
									local490 = arg0.anIntArrayArray18[local480];
									local495 = arg0.anIntArrayArray17[local480];
									local500 = arg0.anIntArrayArray19[local480];
								}
								local501--;
								local503 = local485;
								for (local507 = method89(local485, arg0); local507 > local490[local503]; local507 = local507 << 1 | local516) {
									local503++;
									local516 = method93(arg0);
								}
								local531 = local495[local507 - local500[local503]];
							} while (local531 == 0 || local531 == 1);
							local541++;
							local60 = arg0.aByteArray23[arg0.aByteArray21[arg0.anIntArray140[0]] & 0xFF];
							arg0.anIntArray139[local60 & 0xFF] += local541;
							while (local541 > 0) {
								Static252.anIntArray537[local470] = local60 & 0xFF;
								local470++;
								local541--;
							}
						} else {
							@Pc(669) int local669 = local531 - 1;
							@Pc(677) int local677;
							if (local669 < 16) {
								local677 = arg0.anIntArray140[0];
								local60 = arg0.aByteArray21[local677 + local669];
								while (local669 > 3) {
									@Pc(689) int local689 = local677 + local669;
									arg0.aByteArray21[local689] = arg0.aByteArray21[local689 - 1];
									arg0.aByteArray21[local689 - 1] = arg0.aByteArray21[local689 - 2];
									arg0.aByteArray21[local689 - 2] = arg0.aByteArray21[local689 - 3];
									arg0.aByteArray21[local689 - 3] = arg0.aByteArray21[local689 - 4];
									local669 -= 4;
								}
								while (local669 > 0) {
									arg0.aByteArray21[local677 + local669] = arg0.aByteArray21[local677 + local669 - 1];
									local669--;
								}
								arg0.aByteArray21[local677] = local60;
							} else {
								@Pc(767) int local767 = local669 / 16;
								@Pc(771) int local771 = local669 % 16;
								local677 = arg0.anIntArray140[local767] + local771;
								local60 = arg0.aByteArray21[local677];
								while (local677 > arg0.anIntArray140[local767]) {
									arg0.aByteArray21[local677] = arg0.aByteArray21[local677 - 1];
									local677--;
								}
								@Pc(806) int local806 = arg0.anIntArray140[local767]++;
								while (local767 > 0) {
									local806 = arg0.anIntArray140[local767]--;
									arg0.aByteArray21[arg0.anIntArray140[local767]] = arg0.aByteArray21[arg0.anIntArray140[local767 - 1] + 16 - 1];
									local767--;
								}
								local806 = arg0.anIntArray140[0]--;
								arg0.aByteArray21[arg0.anIntArray140[0]] = local60;
								if (arg0.anIntArray140[0] == 0) {
									@Pc(864) int local864 = 4095;
									for (@Pc(866) int local866 = 15; local866 >= 0; local866--) {
										for (@Pc(869) int local869 = 15; local869 >= 0; local869--) {
											arg0.aByteArray21[local864] = arg0.aByteArray21[arg0.anIntArray140[local866] + local869];
											local864--;
										}
										arg0.anIntArray140[local866] = local864 + 1;
									}
								}
							}
							arg0.anIntArray139[arg0.aByteArray23[local60 & 0xFF] & 0xFF]++;
							Static252.anIntArray537[local470] = arg0.aByteArray23[local60 & 0xFF] & 0xFF;
							local470++;
							if (local501 == 0) {
								local473++;
								local501 = 50;
								local480 = arg0.aByteArray20[local473];
								local485 = arg0.anIntArray138[local480];
								local490 = arg0.anIntArrayArray18[local480];
								local495 = arg0.anIntArrayArray17[local480];
								local500 = arg0.anIntArrayArray19[local480];
							}
							local501--;
							local503 = local485;
							for (local507 = method89(local485, arg0); local507 > local490[local503]; local507 = local507 << 1 | local516) {
								local503++;
								local516 = method93(arg0);
							}
							local531 = local495[local507 - local500[local503]];
						}
					}
					arg0.anInt1110 = 0;
					arg0.aByte13 = 0;
					arg0.anIntArray141[0] = 0;
					for (local138 = 1; local138 <= 256; local138++) {
						arg0.anIntArray141[local138] = arg0.anIntArray139[local138 - 1];
					}
					for (local138 = 1; local138 <= 256; local138++) {
						arg0.anIntArray141[local138] += arg0.anIntArray141[local138 - 1];
					}
					for (local138 = 0; local138 < local470; local138++) {
						local60 = (byte) (Static252.anIntArray537[local138] & 0xFF);
						Static252.anIntArray537[arg0.anIntArray141[local60 & 0xFF]] |= local138 << 8;
						arg0.anIntArray141[local60 & 0xFF]++;
					}
					arg0.anInt1111 = Static252.anIntArray537[arg0.anInt1112] >> 8;
					arg0.anInt1121 = 0;
					arg0.anInt1111 = Static252.anIntArray537[arg0.anInt1111];
					arg0.anInt1100 = (byte) (arg0.anInt1111 & 0xFF);
					arg0.anInt1111 >>= 0x8;
					arg0.anInt1121++;
					arg0.anInt1113 = local470;
					method88(arg0);
					if (arg0.anInt1121 == arg0.anInt1113 + 1 && arg0.anInt1110 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(Lclient!cq;)B")
	private static byte method93(@OriginalArg(0) Class45 arg0) {
		return (byte) method89(1, arg0);
	}
}
