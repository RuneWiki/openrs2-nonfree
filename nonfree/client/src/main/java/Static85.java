import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!o", name = "l", descriptor = "I")
	public static int anInt2157 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1497() {
		aBigInteger1 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!of;)Lclient!af;")
	public static Class5 method1499(@OriginalArg(1) Class1_Sub17 arg0) {
		if (Static92.method1586(Static6.method221(arg0)) == 0) {
			return null;
		} else if (arg0.aClass5_1099 == null || arg0.aClass5_1099.method194().method215() == 0) {
			return Static93.aBoolean91 ? Static86.aClass5_1061 : null;
		} else {
			return arg0.aClass5_1099;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!rf;I[Lclient!md;)V")
	public static void method1500(@OriginalArg(0) Class68 arg0, @OriginalArg(2) Class49[] arg1) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(38) int local38;
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			for (local19 = 0; local19 < 104; local19++) {
				for (local23 = 0; local23 < 104; local23++) {
					if ((Static25.aByteArrayArrayArray1[local15][local19][local23] & 0x1) == 1) {
						local38 = local15;
						if ((Static25.aByteArrayArrayArray1[1][local19][local23] & 0x2) == 2) {
							local38 = local15 - 1;
						}
						if (local38 >= 0) {
							arg1[local38].method1322(local19, local23);
						}
					}
				}
			}
		}
		Static10.anInt313 += (int) (Math.random() * 5.0D) - 2;
		Static93.anInt2335 += (int) (Math.random() * 5.0D) - 2;
		if (Static10.anInt313 < -16) {
			Static10.anInt313 = -16;
		}
		if (Static93.anInt2335 < -8) {
			Static93.anInt2335 = -8;
		}
		if (Static10.anInt313 > 16) {
			Static10.anInt313 = 16;
		}
		if (Static93.anInt2335 > 8) {
			Static93.anInt2335 = 8;
		}
		@Pc(138) int local138;
		@Pc(140) int local140;
		@Pc(144) int local144;
		@Pc(167) int local167;
		@Pc(188) int local188;
		@Pc(202) int local202;
		@Pc(208) int local208;
		@Pc(212) int local212;
		@Pc(218) int local218;
		@Pc(283) int local283;
		@Pc(267) int local267;
		@Pc(514) int local514;
		@Pc(555) int local555;
		@Pc(670) int local670;
		@Pc(660) int local660;
		@Pc(682) int local682;
		for (local19 = 0; local19 < 4; local19++) {
			@Pc(128) byte[][] local128 = Static109.aByteArrayArrayArray6[local19];
			local38 = (int) Math.sqrt(5100.0D);
			local138 = local38 * 768 >> 8;
			for (local140 = 1; local140 < 103; local140++) {
				for (local144 = 1; local144 < 103; local144++) {
					local167 = Static95.anIntArrayArrayArray2[local19][local144 + 1][local140] - Static95.anIntArrayArrayArray2[local19][local144 - 1][local140];
					local188 = Static95.anIntArrayArrayArray2[local19][local144][local140 + 1] - Static95.anIntArrayArrayArray2[local19][local144][local140 - 1];
					local202 = (int) Math.sqrt((double) (local167 * local167 + local188 * local188 + 65536));
					local208 = (local167 << 8) / local202;
					local212 = 65536 / local202;
					local218 = (local188 << 8) / local202;
					local267 = (local128[local144][local140] >> 1) + (local128[local144][local140 + 1] >> 3) + (local128[local144 - -1][local140] >> 3) + (local128[local144 + -1][local140] >> 2) + (local128[local144][local140 - 1] >> 2);
					local283 = (local218 * -50 + local212 * -10 + local208 * -50) / local138 + 96;
					Static112.anIntArrayArray80[local144][local140] = local283 - local267;
				}
			}
			for (local144 = 0; local144 < 104; local144++) {
				Static78.anIntArray302[local144] = 0;
				Static12.anIntArray461[local144] = 0;
				Static73.anIntArray280[local144] = 0;
				Static79.anIntArray304[local144] = 0;
				Static51.anIntArray204[local144] = 0;
			}
			for (local167 = -5; local167 < 109; local167++) {
				for (local188 = 0; local188 < 104; local188++) {
					local202 = local167 + 5;
					@Pc(408) int local408;
					if (local202 >= 0 && local202 < 104) {
						local208 = Static95.aByteArrayArrayArray5[local19][local202][local188] & 0xFF;
						if (local208 > 0) {
							@Pc(372) Class1_Sub3_Sub2 local372 = Static56.method1019(local208 - 1);
							Static78.anIntArray302[local188] += local372.anInt252;
							Static12.anIntArray461[local188] += local372.anInt256;
							Static73.anIntArray280[local188] += local372.anInt262;
							Static79.anIntArray304[local188] += local372.anInt250;
							local408 = Static51.anIntArray204[local188]++;
						}
					}
					local208 = local167 - 5;
					if (local208 >= 0 && local208 < 104) {
						local212 = Static95.aByteArrayArrayArray5[local19][local208][local188] & 0xFF;
						if (local212 > 0) {
							@Pc(443) Class1_Sub3_Sub2 local443 = Static56.method1019(local212 - 1);
							Static78.anIntArray302[local188] -= local443.anInt252;
							Static12.anIntArray461[local188] -= local443.anInt256;
							Static73.anIntArray280[local188] -= local443.anInt262;
							Static79.anIntArray304[local188] -= local443.anInt250;
							local408 = Static51.anIntArray204[local188]--;
						}
					}
				}
				if (local167 >= 1 && local167 < 103) {
					local202 = 0;
					local208 = 0;
					local218 = 0;
					local212 = 0;
					local283 = 0;
					for (local267 = -5; local267 < 109; local267++) {
						local514 = local267 + 5;
						if (local514 >= 0 && local514 < 104) {
							local283 += Static51.anIntArray204[local514];
							local218 += Static79.anIntArray304[local514];
							local212 += Static73.anIntArray280[local514];
							local208 += Static12.anIntArray461[local514];
							local202 += Static78.anIntArray302[local514];
						}
						local555 = local267 - 5;
						if (local555 >= 0 && local555 < 104) {
							local212 -= Static73.anIntArray280[local555];
							local283 -= Static51.anIntArray204[local555];
							local208 -= Static12.anIntArray461[local555];
							local202 -= Static78.anIntArray302[local555];
							local218 -= Static79.anIntArray304[local555];
						}
						if (local267 >= 1 && local267 < 103 && (!Static79.aBoolean64 || (Static25.aByteArrayArrayArray1[0][local167][local267] & 0x2) != 0 || (Static25.aByteArrayArrayArray1[local19][local167][local267] & 0x10) == 0 && Static56.method1021(local167, local267, local19) == Static42.anInt1065)) {
							if (Static76.anInt1797 > local19) {
								Static76.anInt1797 = local19;
							}
							local660 = Static50.aByteArrayArrayArray2[local19][local167][local267] & 0xFF;
							local670 = Static95.aByteArrayArrayArray5[local19][local167][local267] & 0xFF;
							if (local670 > 0 || local660 > 0) {
								local682 = Static95.anIntArrayArrayArray2[local19][local167][local267];
								@Pc(692) int local692 = Static95.anIntArrayArrayArray2[local19][local167 + 1][local267];
								@Pc(702) int local702 = Static95.anIntArrayArrayArray2[local19][local167][local267 + 1];
								@Pc(710) int local710 = Static112.anIntArrayArray80[local167 + 1][local267];
								@Pc(722) int local722 = Static95.anIntArrayArrayArray2[local19][local167 + 1][local267 + 1];
								@Pc(728) int local728 = Static112.anIntArrayArray80[local167][local267];
								@Pc(738) int local738 = Static112.anIntArrayArray80[local167 + 1][local267 + 1];
								@Pc(746) int local746 = Static112.anIntArrayArray80[local167][local267 + 1];
								@Pc(748) int local748 = -1;
								@Pc(750) int local750 = -1;
								@Pc(762) int local762;
								@Pc(756) int local756;
								if (local670 > 0) {
									local756 = local208 / local283;
									local762 = local202 * 256 / local218;
									@Pc(766) int local766 = local212 / local283;
									local748 = Static64.method1170(local762, local756, local766);
									@Pc(778) int local778 = Static93.anInt2335 + local762 & 0xFF;
									local766 += Static10.anInt313;
									if (local766 < 0) {
										local766 = 0;
									} else if (local766 > 255) {
										local766 = 255;
									}
									local750 = Static64.method1170(local778, local756, local766);
								}
								if (local19 > 0) {
									@Pc(806) boolean local806 = true;
									if (local670 == 0 && Static79.aByteArrayArrayArray4[local19][local167][local267] != 0) {
										local806 = false;
									}
									if (local660 > 0 && !Static46.method825(local660 - 1).aBoolean14) {
										local806 = false;
									}
									if (local806 && local692 == local682 && local682 == local722 && local682 == local702) {
										Static97.anIntArrayArrayArray3[local19][local167][local267] |= 0x924;
									}
								}
								local762 = 0;
								if (local750 != -1) {
									local762 = Static114.anIntArray427[Static103.method1751(96, local750)];
								}
								if (local660 == 0) {
									arg0.method1861(local19, local167, local267, 0, 0, -1, local682, local692, local722, local702, Static103.method1751(local728, local748), Static103.method1751(local710, local748), Static103.method1751(local738, local748), Static103.method1751(local746, local748), 0, 0, 0, 0, local762, 0);
								} else {
									@Pc(929) byte local929 = Static123.aByteArrayArrayArray7[local19][local167][local267];
									local756 = Static79.aByteArrayArrayArray4[local19][local167][local267] + 1;
									@Pc(945) Class1_Sub3_Sub5 local945 = Static46.method825(local660 - 1);
									@Pc(948) int local948 = local945.anInt513;
									@Pc(955) int local955;
									@Pc(960) int local960;
									@Pc(1006) int local1006;
									@Pc(988) int local988;
									if (local948 >= 0) {
										local955 = -1;
										local960 = Static114.anInterface3_1.method1034(local948);
									} else if (local945.anInt507 == 16711935) {
										local960 = -2;
										local948 = -1;
										local955 = -2;
									} else {
										local955 = Static64.method1170(local945.anInt509, local945.anInt497, local945.anInt499);
										local988 = local945.anInt499 + Static10.anInt313;
										if (local988 < 0) {
											local988 = 0;
										} else if (local988 > 255) {
											local988 = 255;
										}
										local1006 = Static93.anInt2335 + local945.anInt509 & 0xFF;
										local960 = Static64.method1170(local1006, local945.anInt497, local988);
									}
									local1006 = 0;
									if (local960 != -2) {
										local1006 = Static114.anIntArray427[Static41.method785(96, local960)];
									}
									if (local945.anInt501 != -1) {
										local988 = local945.anInt504 + Static93.anInt2335 & 0xFF;
										@Pc(1044) int local1044 = Static10.anInt313 + local945.anInt502;
										if (local1044 < 0) {
											local1044 = 0;
										} else if (local1044 > 255) {
											local1044 = 255;
										}
										local960 = Static64.method1170(local988, local945.anInt506, local1044);
										local1006 = Static114.anIntArray427[Static41.method785(96, local960)];
									}
									arg0.method1861(local19, local167, local267, local756, local929, local948, local682, local692, local722, local702, Static103.method1751(local728, local748), Static103.method1751(local710, local748), Static103.method1751(local738, local748), Static103.method1751(local746, local748), Static41.method785(local728, local955), Static41.method785(local710, local955), Static41.method785(local738, local955), Static41.method785(local746, local955), local762, local1006);
								}
							}
						}
					}
				}
			}
			for (local188 = 1; local188 < 103; local188++) {
				for (local202 = 1; local202 < 103; local202++) {
					arg0.method1832(local19, local202, local188, Static56.method1021(local202, local188, local19));
				}
			}
			Static95.aByteArrayArrayArray5[local19] = null;
			Static50.aByteArrayArrayArray2[local19] = null;
			Static79.aByteArrayArrayArray4[local19] = null;
			Static123.aByteArrayArrayArray7[local19] = null;
			Static109.aByteArrayArrayArray6[local19] = null;
		}
		arg0.method1858();
		for (local23 = 0; local23 < 104; local23++) {
			for (local38 = 0; local38 < 104; local38++) {
				if ((Static25.aByteArrayArrayArray1[1][local23][local38] & 0x2) == 2) {
					arg0.method1868(local23, local38);
				}
			}
		}
		local38 = 1;
		local138 = 2;
		local140 = 4;
		for (local144 = 0; local144 < 4; local144++) {
			if (local144 > 0) {
				local140 <<= 0x3;
				local138 <<= 0x3;
				local38 <<= 0x3;
			}
			for (local167 = 0; local167 <= local144; local167++) {
				for (local188 = 0; local188 <= 104; local188++) {
					for (local202 = 0; local202 <= 104; local202++) {
						if ((Static97.anIntArrayArrayArray3[local167][local202][local188] & local38) != 0) {
							local212 = local188;
							local218 = local167;
							for (local208 = local188; local208 > 0 && (Static97.anIntArrayArrayArray3[local167][local202][local208 - 1] & local38) != 0; local208--) {
							}
							while (local212 < 104 && (Static97.anIntArrayArrayArray3[local167][local202][local212 + 1] & local38) != 0) {
								local212++;
							}
							local283 = local167;
							label347: while (local218 > 0) {
								for (local267 = local208; local267 <= local212; local267++) {
									if ((Static97.anIntArrayArrayArray3[local218 - 1][local202][local267] & local38) == 0) {
										break label347;
									}
								}
								local218--;
							}
							label336: while (local283 < local144) {
								for (local267 = local208; local267 <= local212; local267++) {
									if ((Static97.anIntArrayArrayArray3[local283 + 1][local202][local267] & local38) == 0) {
										break label336;
									}
								}
								local283++;
							}
							local267 = (local212 + 1 - local208) * ((local283 + 1) - local218);
							if (local267 >= 8) {
								local670 = Static95.anIntArrayArrayArray2[local218][local202][local208];
								local555 = Static95.anIntArrayArrayArray2[local283][local202][local208] - 240;
								Static107.method1827(local144, 1, local202 * 128, local202 * 128, local208 * 128, local212 * 128 + 128, local555, local670);
								for (local660 = local218; local660 <= local283; local660++) {
									for (local682 = local208; local682 <= local212; local682++) {
										Static97.anIntArrayArrayArray3[local660][local202][local682] &= ~local38;
									}
								}
							}
						}
						if ((Static97.anIntArrayArrayArray3[local167][local202][local188] & local138) != 0) {
							local208 = local202;
							local218 = local167;
							local283 = local167;
							while (local208 > 0 && (local138 & Static97.anIntArrayArrayArray3[local167][local208 - 1][local188]) != 0) {
								local208--;
							}
							for (local212 = local202; local212 < 104 && (local138 & Static97.anIntArrayArrayArray3[local167][local212 + 1][local188]) != 0; local212++) {
							}
							label401: while (local218 > 0) {
								for (local267 = local208; local267 <= local212; local267++) {
									if ((local138 & Static97.anIntArrayArrayArray3[local218 - 1][local267][local188]) == 0) {
										break label401;
									}
								}
								local218--;
							}
							label390: while (local144 > local283) {
								for (local267 = local208; local267 <= local212; local267++) {
									if ((Static97.anIntArrayArrayArray3[local283 + 1][local267][local188] & local138) == 0) {
										break label390;
									}
								}
								local283++;
							}
							local267 = (local283 + 1 - local218) * ((local212 + 1) - local208);
							if (local267 >= 8) {
								local555 = Static95.anIntArrayArrayArray2[local283][local208][local188] - 240;
								local670 = Static95.anIntArrayArrayArray2[local218][local208][local188];
								Static107.method1827(local144, 2, local208 * 128, local212 * 128 + 128, local188 * 128, local188 * 128, local555, local670);
								for (local660 = local218; local660 <= local283; local660++) {
									for (local682 = local208; local682 <= local212; local682++) {
										Static97.anIntArrayArrayArray3[local660][local682][local188] &= ~local138;
									}
								}
							}
						}
						if ((local140 & Static97.anIntArrayArrayArray3[local167][local202][local188]) != 0) {
							local208 = local202;
							local212 = local202;
							for (local283 = local188; local283 < 104 && (local140 & Static97.anIntArrayArrayArray3[local167][local202][local283 + 1]) != 0; local283++) {
							}
							for (local218 = local188; local218 > 0 && (Static97.anIntArrayArrayArray3[local167][local202][local218 - 1] & local140) != 0; local218--) {
							}
							label455: while (local208 > 0) {
								for (local267 = local218; local267 <= local283; local267++) {
									if ((local140 & Static97.anIntArrayArrayArray3[local167][local208 - 1][local267]) == 0) {
										break label455;
									}
								}
								local208--;
							}
							label444: while (local212 < 104) {
								for (local267 = local218; local267 <= local283; local267++) {
									if ((Static97.anIntArrayArrayArray3[local167][local212 + 1][local267] & local140) == 0) {
										break label444;
									}
								}
								local212++;
							}
							if ((local283 + 1 - local218) * (local212 + 1 - local208) >= 4) {
								local267 = Static95.anIntArrayArrayArray2[local167][local208][local218];
								Static107.method1827(local144, 4, local208 * 128, local212 * 128 + 128, local218 * 128, local283 * 128 + 128, local267, local267);
								for (local514 = local208; local514 <= local212; local514++) {
									for (local555 = local218; local555 <= local283; local555++) {
										Static97.anIntArrayArrayArray3[local167][local514][local555] &= ~local140;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!nb;II)V")
	public static void method1502(@OriginalArg(1) Class1_Sub3_Sub4_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3068 == arg2 && arg2 != -1) {
			@Pc(23) int local23 = Static77.method1316(arg2).anInt2043;
			if (local23 == 1) {
				arg0.anInt3084 = 0;
				arg0.anInt3048 = arg1;
				arg0.anInt3075 = 0;
				arg0.anInt3053 = 0;
			}
			if (local23 == 2) {
				arg0.anInt3084 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt3068 == -1 || Static77.method1316(arg2).anInt2052 >= Static77.method1316(arg0.anInt3068).anInt2052) {
			arg0.anInt3068 = arg2;
			arg0.anInt3053 = 0;
			arg0.anInt3075 = 0;
			arg0.anInt3084 = 0;
			arg0.anInt3061 = arg0.anInt3047;
			arg0.anInt3048 = arg1;
		}
	}
}
