import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	public static int anInt2385;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	public static int anInt2386;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public static int anInt2387;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_864 = Static177.method3050("Cancel");

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!jd;")
	public static Class46 aClass46_863 = aClass46_864;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_866 = Static177.method3050("Login limit exceeded)3");

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "Lclient!jd;")
	public static Class46 aClass46_865 = aClass46_866;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "[S")
	public static final short[] aShortArray26 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	public static void method1815() {
		Static166.aByteArrayArrayArray8 = new byte[4][104][104];
		Static118.anIntArray265 = new int[104];
		anIntArray225 = new int[104];
		Static27.anIntArrayArrayArray9 = new int[4][105][105];
		Static48.anIntArray120 = new int[104];
		Static2.anIntArray13 = new int[104];
		Static27.aByteArrayArrayArray1 = new byte[4][105][105];
		Static38.anInt1011 = 99;
		Static63.aByteArrayArrayArray4 = new byte[4][104][104];
		Static45.anIntArray96 = new int[104];
		Static130.aByteArrayArrayArray6 = new byte[4][104][104];
		Static125.aByteArrayArrayArray5 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lclient!gd;")
	public static Class4_Sub1_Sub8 method1816(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub1_Sub8 local10 = (Class4_Sub1_Sub8) Static80.aClass66_32.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static108.aClass62_29.method2878(Static76.method3016(arg0), Static87.method1724(arg0));
		local10 = new Class4_Sub1_Sub8();
		local10.anInt1395 = arg0;
		if (local31 != null) {
			local10.method1099(new Class4_Sub11(local31));
		}
		Static80.aClass66_32.method2222(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[Lclient!mb;)V")
	public static void method1817(@OriginalArg(1) Class58[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static53.aByteArrayArrayArray2[local7][local11][local15] & 0x1) == 1) {
						@Pc(30) int local30 = local7;
						if ((Static53.aByteArrayArrayArray2[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method1988(local15, local11);
						}
					}
				}
			}
		}
		Static8.anInt304 += (int) (Math.random() * 5.0D) - 2;
		Static17.anInt480 += (int) (Math.random() * 5.0D) - 2;
		if (Static8.anInt304 < -8) {
			Static8.anInt304 = -8;
		}
		if (Static8.anInt304 > 8) {
			Static8.anInt304 = 8;
		}
		@Pc(105) int[][] local105 = new int[104][104];
		local11 = Static8.anInt304 >> 2 << 10;
		@Pc(115) int[][] local115 = new int[104][104];
		if (Static17.anInt480 < -16) {
			Static17.anInt480 = -16;
		}
		if (Static17.anInt480 > 16) {
			Static17.anInt480 = 16;
		}
		local15 = Static17.anInt480 >> 1;
		@Pc(147) int local147;
		@Pc(153) int local153;
		@Pc(155) int local155;
		@Pc(159) int local159;
		@Pc(251) int local251;
		@Pc(183) int local183;
		@Pc(204) int local204;
		@Pc(218) int local218;
		@Pc(234) int local234;
		@Pc(228) int local228;
		@Pc(224) int local224;
		@Pc(300) int local300;
		@Pc(510) int local510;
		@Pc(549) int local549;
		@Pc(800) int local800;
		for (@Pc(133) int local133 = 0; local133 < 4; local133++) {
			@Pc(139) byte[][] local139 = Static27.aByteArrayArrayArray1[local133];
			local147 = (int) Math.sqrt(5100.0D);
			local153 = local147 * 768 >> 8;
			for (local155 = 1; local155 < 103; local155++) {
				for (local159 = 1; local159 < 103; local159++) {
					local183 = Static112.anIntArrayArrayArray42[local133][local159 + 1][local155] - Static112.anIntArrayArrayArray42[local133][local159 - 1][local155];
					local204 = Static112.anIntArrayArrayArray42[local133][local159][local155 + 1] - Static112.anIntArrayArrayArray42[local133][local159][local155 - 1];
					local218 = (int) Math.sqrt((double) (local183 * local183 + local204 * local204 + 65536));
					local224 = (local204 << 8) / local218;
					local228 = -65536 / local218;
					local234 = (local183 << 8) / local218;
					local251 = (local234 * -50 + local228 * -10 + local224 * -50) / local153 + 74;
					local300 = (local139[local159][local155] >> 1) + (local139[local159][local155 + 1] >> 3) + (local139[local159 - 1][local155] >> 2) + (local139[local159 + 1][local155] >> 3) + (local139[local159][local155 + -1] >> 2);
					local115[local159][local155] = local251 - local300;
				}
			}
			for (local159 = 0; local159 < 104; local159++) {
				Static118.anIntArray265[local159] = 0;
				Static45.anIntArray96[local159] = 0;
				Static2.anIntArray13[local159] = 0;
				Static48.anIntArray120[local159] = 0;
				anIntArray225[local159] = 0;
			}
			for (local251 = -5; local251 < 104; local251++) {
				for (local183 = 0; local183 < 104; local183++) {
					local204 = local251 + 5;
					@Pc(414) int local414;
					if (local204 < 104) {
						local218 = Static130.aByteArrayArrayArray6[local133][local204][local183] & 0xFF;
						if (local218 > 0) {
							@Pc(378) Class4_Sub1_Sub15 local378 = Static188.method3191(local218 - 1);
							Static118.anIntArray265[local183] += local378.anInt3043;
							Static45.anIntArray96[local183] += local378.anInt3045;
							Static2.anIntArray13[local183] += local378.anInt3041;
							Static48.anIntArray120[local183] += local378.anInt3044;
							local414 = anIntArray225[local183]++;
						}
					}
					local218 = local251 - 5;
					if (local218 >= 0) {
						local234 = Static130.aByteArrayArrayArray6[local133][local218][local183] & 0xFF;
						if (local234 > 0) {
							@Pc(444) Class4_Sub1_Sub15 local444 = Static188.method3191(local234 - 1);
							Static118.anIntArray265[local183] -= local444.anInt3043;
							Static45.anIntArray96[local183] -= local444.anInt3045;
							Static2.anIntArray13[local183] -= local444.anInt3041;
							Static48.anIntArray120[local183] -= local444.anInt3044;
							local414 = anIntArray225[local183]--;
						}
					}
				}
				if (local251 >= 0) {
					local204 = 0;
					local218 = 0;
					local234 = 0;
					local228 = 0;
					local224 = 0;
					for (local300 = -5; local300 < 104; local300++) {
						local510 = local300 + 5;
						if (local510 < 104) {
							local224 += anIntArray225[local510];
							local234 += Static2.anIntArray13[local510];
							local218 += Static45.anIntArray96[local510];
							local228 += Static48.anIntArray120[local510];
							local204 += Static118.anIntArray265[local510];
						}
						local549 = local300 - 5;
						if (local549 >= 0) {
							local218 -= Static45.anIntArray96[local549];
							local204 -= Static118.anIntArray265[local549];
							local234 -= Static2.anIntArray13[local549];
							local224 -= anIntArray225[local549];
							local228 -= Static48.anIntArray120[local549];
						}
						if (local300 >= 0 && local224 > 0) {
							local105[local251][local300] = Static176.method3044(local218 / local224, local204 * 256 / local228, local234 / local224);
						}
					}
				}
			}
			for (local183 = 1; local183 < 103; local183++) {
				for (local204 = 1; local204 < 103; local204++) {
					if (!Static103.aBoolean113 || (Static53.aByteArrayArrayArray2[0][local183][local204] & 0x2) != 0 || (Static53.aByteArrayArrayArray2[local133][local183][local204] & 0x10) == 0 && Static8.method163(local133, local204, local183) == Static146.anInt3365) {
						if (local133 < Static38.anInt1011) {
							Static38.anInt1011 = local133;
						}
						local218 = Static130.aByteArrayArrayArray6[local133][local183][local204] & 0xFF;
						local234 = Static125.aByteArrayArrayArray5[local133][local183][local204] & 0xFF;
						if (local218 > 0 || local234 > 0) {
							local224 = Static112.anIntArrayArrayArray42[local133][local183 + 1][local204];
							local300 = Static112.anIntArrayArrayArray42[local133][local183 + 1][local204 + 1];
							local228 = Static112.anIntArrayArrayArray42[local133][local183][local204];
							local510 = Static112.anIntArrayArrayArray42[local133][local183][local204 + 1];
							if (local133 > 0) {
								@Pc(737) boolean local737 = true;
								if (local218 == 0 && Static63.aByteArrayArrayArray4[local133][local183][local204] != 0) {
									local737 = false;
								}
								if (local234 > 0 && !Static162.method2731(local234 - 1).aBoolean90) {
									local737 = false;
								}
								if (local737 && local224 == local228 && local228 == local300 && local228 == local510) {
									Static27.anIntArrayArrayArray9[local133][local183][local204] |= 0x924;
								}
							}
							@Pc(815) int local815;
							@Pc(841) int local841;
							if (local218 <= 0) {
								local549 = -1;
								local800 = 0;
							} else {
								local549 = local105[local183][local204];
								local815 = (local549 & 0x7F) + local15;
								if (local815 < 0) {
									local815 = 0;
								} else if (local815 > 127) {
									local815 = 127;
								}
								local841 = (local11 + local549 & 0xFC00) + (local549 & 0x380) + local815;
								local800 = Static171.anIntArray413[Static187.method3166(local841, 96)];
							}
							local815 = local115[local183][local204];
							local841 = local115[local183 + 1][local204];
							@Pc(870) int local870 = local115[local183][local204 + 1];
							@Pc(880) int local880 = local115[local183 + 1][local204 + 1];
							if (local234 == 0) {
								Static112.method3178(local133, local183, local204, 0, 0, -1, local228, local224, local300, local510, Static187.method3166(local549, local815), Static187.method3166(local549, local841), Static187.method3166(local549, local880), Static187.method3166(local549, local870), 0, 0, 0, 0, local800, 0);
							} else {
								@Pc(892) int local892 = Static63.aByteArrayArrayArray4[local133][local183][local204] + 1;
								@Pc(900) byte local900 = Static166.aByteArrayArrayArray8[local133][local183][local204];
								@Pc(906) Class4_Sub1_Sub9 local906 = Static162.method2731(local234 - 1);
								@Pc(909) int local909 = local906.anInt2004;
								if (local909 >= 0 && !Static171.anInterface1_2.method387(local909)) {
									local909 = -1;
								}
								@Pc(925) int local925;
								@Pc(937) int local937;
								@Pc(958) int local958;
								@Pc(987) int local987;
								if (local909 >= 0) {
									local925 = -1;
									local937 = Static171.anIntArray413[Static177.method3053(96, Static171.anInterface1_2.method381(local909))];
								} else if (local906.anInt2005 == -1) {
									local937 = 0;
									local925 = -2;
								} else {
									local925 = local906.anInt2005;
									local958 = local15 + (local925 & 0x7F);
									if (local958 < 0) {
										local958 = 0;
									} else if (local958 > 127) {
										local958 = 127;
									}
									local987 = (local925 & 0x380) + (local925 + local11 & 0xFC00) + local958;
									local937 = Static171.anIntArray413[Static177.method3053(96, local987)];
								}
								if (local906.anInt2011 >= 0) {
									local958 = local906.anInt2011;
									local987 = local15 + (local958 & 0x7F);
									if (local987 < 0) {
										local987 = 0;
									} else if (local987 > 127) {
										local987 = 127;
									}
									@Pc(1039) int local1039 = local987 + (local958 + local11 & 0xFC00) + (local958 & 0x380);
									local937 = Static171.anIntArray413[Static177.method3053(96, local1039)];
								}
								Static112.method3178(local133, local183, local204, local892, local900, local909, local228, local224, local300, local510, Static187.method3166(local549, local815), Static187.method3166(local549, local841), Static187.method3166(local549, local880), Static187.method3166(local549, local870), Static177.method3053(local815, local925), Static177.method3053(local841, local925), Static177.method3053(local880, local925), Static177.method3053(local870, local925), local800, local937);
							}
						}
					}
				}
			}
			for (local204 = 1; local204 < 103; local204++) {
				for (local218 = 1; local218 < 103; local218++) {
					Static6.method99(local133, local218, local204, Static8.method163(local133, local204, local218));
				}
			}
			Static130.aByteArrayArrayArray6[local133] = null;
			Static125.aByteArrayArrayArray5[local133] = null;
			Static63.aByteArrayArrayArray4[local133] = null;
			Static166.aByteArrayArrayArray8[local133] = null;
			Static27.aByteArrayArrayArray1[local133] = null;
		}
		Static170.method2914();
		@Pc(1201) int local1201;
		for (@Pc(1197) int local1197 = 0; local1197 < 104; local1197++) {
			for (local1201 = 0; local1201 < 104; local1201++) {
				if ((Static53.aByteArrayArrayArray2[1][local1197][local1201] & 0x2) == 2) {
					Static63.method1223(local1197, local1201);
				}
			}
		}
		local1201 = 1;
		local147 = 4;
		@Pc(1235) int local1235 = 2;
		for (local153 = 0; local153 < 4; local153++) {
			if (local153 > 0) {
				local1201 <<= 0x3;
				local1235 <<= 0x3;
				local147 <<= 0x3;
			}
			for (local155 = 0; local155 <= local153; local155++) {
				for (local159 = 0; local159 <= 104; local159++) {
					for (local251 = 0; local251 <= 104; local251++) {
						if ((local1201 & Static27.anIntArrayArrayArray9[local155][local251][local159]) != 0) {
							for (local183 = local159; local183 > 0 && (local1201 & Static27.anIntArrayArrayArray9[local155][local251][local183 - 1]) != 0; local183--) {
							}
							local204 = local159;
							local218 = local155;
							while (local204 < 104 && (local1201 & Static27.anIntArrayArrayArray9[local155][local251][local204 + 1]) != 0) {
								local204++;
							}
							local234 = local155;
							label350: while (local218 > 0) {
								for (local228 = local183; local228 <= local204; local228++) {
									if ((Static27.anIntArrayArrayArray9[local218 - 1][local251][local228] & local1201) == 0) {
										break label350;
									}
								}
								local218--;
							}
							label339: while (local153 > local234) {
								for (local228 = local183; local228 <= local204; local228++) {
									if ((local1201 & Static27.anIntArrayArrayArray9[local234 + 1][local251][local228]) == 0) {
										break label339;
									}
								}
								local234++;
							}
							local228 = (local204 + 1 - local183) * ((local234 - local218) + 1);
							if (local228 >= 8) {
								local300 = Static112.anIntArrayArrayArray42[local234][local251][local183] - 240;
								local510 = Static112.anIntArrayArrayArray42[local218][local251][local183];
								Static10.method211(local153, 1, local251 * 128, local251 * 128, local183 * 128, local204 * 128 + 128, local300, local510);
								for (local549 = local218; local549 <= local234; local549++) {
									for (local800 = local183; local800 <= local204; local800++) {
										Static27.anIntArrayArrayArray9[local549][local251][local800] &= ~local1201;
									}
								}
							}
						}
						if ((Static27.anIntArrayArrayArray9[local155][local251][local159] & local1235) != 0) {
							for (local183 = local251; local183 > 0 && (local1235 & Static27.anIntArrayArrayArray9[local155][local183 - 1][local159]) != 0; local183--) {
							}
							local204 = local251;
							local218 = local155;
							local234 = local155;
							while (local204 < 104 && (Static27.anIntArrayArrayArray9[local155][local204 + 1][local159] & local1235) != 0) {
								local204++;
							}
							label405: while (local218 > 0) {
								for (local228 = local183; local228 <= local204; local228++) {
									if ((local1235 & Static27.anIntArrayArrayArray9[local218 - 1][local228][local159]) == 0) {
										break label405;
									}
								}
								local218--;
							}
							label394: while (local153 > local234) {
								for (local228 = local183; local228 <= local204; local228++) {
									if ((local1235 & Static27.anIntArrayArrayArray9[local234 + 1][local228][local159]) == 0) {
										break label394;
									}
								}
								local234++;
							}
							local228 = (local234 + 1 - local218) * (local204 - (local183 - 1));
							if (local228 >= 8) {
								local300 = Static112.anIntArrayArrayArray42[local234][local183][local159] - 240;
								local510 = Static112.anIntArrayArrayArray42[local218][local183][local159];
								Static10.method211(local153, 2, local183 * 128, local204 * 128 + 128, local159 * 128, local159 * 128, local300, local510);
								for (local549 = local218; local549 <= local234; local549++) {
									for (local800 = local183; local800 <= local204; local800++) {
										Static27.anIntArrayArrayArray9[local549][local800][local159] &= ~local1235;
									}
								}
							}
						}
						if ((Static27.anIntArrayArrayArray9[local155][local251][local159] & local147) != 0) {
							local183 = local251;
							local204 = local251;
							local234 = local159;
							local218 = local159;
							while (local234 < 104 && (local147 & Static27.anIntArrayArrayArray9[local155][local251][local234 + 1]) != 0) {
								local234++;
							}
							while (local218 > 0 && (Static27.anIntArrayArrayArray9[local155][local251][local218 - 1] & local147) != 0) {
								local218--;
							}
							label459: while (local183 > 0) {
								for (local228 = local218; local228 <= local234; local228++) {
									if ((Static27.anIntArrayArrayArray9[local155][local183 - 1][local228] & local147) == 0) {
										break label459;
									}
								}
								local183--;
							}
							label448: while (local204 < 104) {
								for (local228 = local218; local228 <= local234; local228++) {
									if ((local147 & Static27.anIntArrayArrayArray9[local155][local204 + 1][local228]) == 0) {
										break label448;
									}
								}
								local204++;
							}
							if ((local204 + 1 - local183) * (local234 + 1 - local218) >= 4) {
								local228 = Static112.anIntArrayArrayArray42[local155][local183][local218];
								Static10.method211(local153, 4, local183 * 128, local204 * 128 + 128, local218 * 128, local234 * 128 + 128, local228, local228);
								for (local224 = local183; local224 <= local204; local224++) {
									for (local300 = local218; local300 <= local234; local300++) {
										Static27.anIntArrayArrayArray9[local155][local224][local300] &= ~local147;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public static void method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass24_1 = null;
		}
	}
}
