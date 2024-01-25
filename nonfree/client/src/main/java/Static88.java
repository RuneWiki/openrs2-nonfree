import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "Lclient!daa;")
	public static final Class69 aClass69_1 = new Class69(0, 3, Static29.aClass26_8);

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "Lclient!daa;")
	public static final Class69 aClass69_2 = new Class69(1, 3, Static29.aClass26_8);

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "Lclient!daa;")
	public static final Class69 aClass69_3 = new Class69(2, 4, Static29.aClass26_4);

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "Lclient!daa;")
	public static final Class69 aClass69_4 = new Class69(3, 1, Static29.aClass26_8);

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "Lclient!daa;")
	public static final Class69 aClass69_5 = new Class69(4, 2, Static29.aClass26_8);

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "Lclient!daa;")
	public static final Class69 aClass69_6 = new Class69(5, 3, Static29.aClass26_8);

	@OriginalMember(owner = "client!daa", name = "o", descriptor = "Lclient!daa;")
	public static final Class69 aClass69_7 = new Class69(6, 4, Static29.aClass26_8);

	@OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
	public static final int anInt2610 = Static627.method7088(16);

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_7 = new Class234(8, 0, 4, 1);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method2462(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(77) int local77;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local77 = 0; local77 < arg0; local77++) {
				if (local77 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(117) int local117;
		for (local77 = 0; local77 < arg0; local77++) {
			for (local117 = 0; local117 < arg0; local117++) {
				if (local77 <= local117) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(165) int local165;
		for (local117 = arg0 - 1; local117 >= 0; local117--) {
			for (local165 = 0; local165 < arg0; local165++) {
				if (local165 >= local117) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(206) int local206;
		for (local165 = arg0 - 1; local165 >= 0; local165--) {
			for (local206 = 0; local206 < arg0; local206++) {
				if (local165 >> 1 >= local206) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(251) int local251;
		for (local206 = 0; local206 < arg0; local206++) {
			for (local251 = 0; local251 < arg0; local251++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local251 >= local206 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(305) int local305;
		for (local251 = 0; local251 < arg0; local251++) {
			for (local305 = arg0 - 1; local305 >= 0; local305--) {
				if (local305 <= local251 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(347) int local347;
		for (local305 = arg0 - 1; local305 >= 0; local305--) {
			for (local347 = arg0 - 1; local347 >= 0; local347--) {
				if (local305 << 1 <= local347) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(394) int local394;
		for (local347 = arg0 - 1; local347 >= 0; local347--) {
			for (local394 = arg0 - 1; local394 >= 0; local394--) {
				if (local347 >> 1 >= local394) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(436) int local436;
		for (local394 = arg0 - 1; local394 >= 0; local394--) {
			for (local436 = 0; local436 < arg0; local436++) {
				if (local436 >= local394 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(482) int local482;
		for (local436 = 0; local436 < arg0; local436++) {
			for (local482 = 0; local482 < arg0; local482++) {
				if (local482 <= local436 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(531) int local531;
		for (local482 = 0; local482 < arg0; local482++) {
			for (local531 = arg0 - 1; local531 >= 0; local531--) {
				if (local531 >= local482 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(575) int local575;
		for (local531 = arg0 - 1; local531 >= 0; local531--) {
			for (local575 = 0; local575 < arg0; local575++) {
				if (local575 >= local531 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(624) int local624;
		for (local575 = 0; local575 < arg0; local575++) {
			for (local624 = 0; local624 < arg0; local624++) {
				if (local624 <= local575 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(673) int local673;
		for (local624 = 0; local624 < arg0; local624++) {
			for (local673 = arg0 - 1; local673 >= 0; local673--) {
				if (local673 >= local624 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(719) int local719;
		for (local673 = arg0 - 1; local673 >= 0; local673--) {
			for (local719 = arg0 - 1; local719 >= 0; local719--) {
				if (local719 <= local673 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(766) int local766;
		for (local719 = arg0 - 1; local719 >= 0; local719--) {
			for (local766 = arg0 - 1; local766 >= 0; local766--) {
				if (local719 >> 1 <= local766) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(808) int local808;
		for (local766 = arg0 - 1; local766 >= 0; local766--) {
			for (local808 = 0; local808 < arg0; local808++) {
				if (local766 << 1 >= local808) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(854) int local854;
		for (local808 = 0; local808 < arg0; local808++) {
			for (local854 = 0; local854 < arg0; local854++) {
				if (local808 >> 1 <= local854) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(895) int local895;
		for (local854 = 0; local854 < arg0; local854++) {
			for (local895 = arg0 - 1; local895 >= 0; local895--) {
				if (local854 << 1 >= local895) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(940) int local940;
		for (local895 = 0; local895 < arg0; local895++) {
			for (local940 = 0; local940 < arg0; local940++) {
				if (arg0 / 2 >= local940) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(979) int local979;
		for (local940 = 0; local940 < arg0; local940++) {
			for (local979 = 0; local979 < arg0; local979++) {
				if (local940 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1022) int local1022;
		for (local979 = 0; local979 < arg0; local979++) {
			for (local1022 = 0; local1022 < arg0; local1022++) {
				if (local1022 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1065) int local1065;
		for (local1022 = 0; local1022 < arg0; local1022++) {
			for (local1065 = 0; local1065 < arg0; local1065++) {
				if (local1022 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1108) int local1108;
		for (local1065 = 0; local1065 < arg0; local1065++) {
			for (local1108 = 0; local1108 < arg0; local1108++) {
				if (local1065 - arg0 / 2 >= local1108) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1155) int local1155;
		for (local1108 = arg0 - 1; local1108 >= 0; local1108--) {
			for (local1155 = 0; local1155 < arg0; local1155++) {
				if (local1155 <= local1108 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1203) int local1203;
		for (local1155 = arg0 - 1; local1155 >= 0; local1155--) {
			for (local1203 = arg0 - 1; local1203 >= 0; local1203--) {
				if (local1155 - arg0 / 2 >= local1203) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1249) int local1249;
		for (local1203 = 0; local1203 < arg0; local1203++) {
			for (local1249 = arg0 - 1; local1249 >= 0; local1249--) {
				if (local1203 - arg0 / 2 >= local1249) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1297) int local1297;
		for (local1249 = 0; local1249 < arg0; local1249++) {
			for (local1297 = 0; local1297 < arg0; local1297++) {
				if (local1297 >= local1249 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1349) int local1349;
		for (local1297 = arg0 - 1; local1297 >= 0; local1297--) {
			for (local1349 = 0; local1349 < arg0; local1349++) {
				if (local1297 - arg0 / 2 <= local1349) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1401) int local1401;
		for (local1349 = arg0 - 1; local1349 >= 0; local1349--) {
			for (local1401 = arg0 - 1; local1401 >= 0; local1401--) {
				if (local1401 >= local1349 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1401 = 0; local1401 < arg0; local1401++) {
			for (@Pc(1450) int local1450 = arg0 - 1; local1450 >= 0; local1450--) {
				if (local1450 >= local1401 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)Lclient!daa;")
	public static Class69 method2464(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass69_1;
		} else if (arg0 == 1) {
			return aClass69_2;
		} else if (arg0 == 2) {
			return aClass69_3;
		} else if (arg0 == 3) {
			return aClass69_4;
		} else if (arg0 == 4) {
			return aClass69_5;
		} else if (arg0 == 5) {
			return aClass69_6;
		} else if (arg0 == 6) {
			return aClass69_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLclient!db;II)V")
	public static void method2465(@OriginalArg(1) Class2_Sub6_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static216.aClass341_39.aClass2_271) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt2627;
		@Pc(18) int local18 = arg0.anInt2630;
		@Pc(21) int local21 = arg0.anInt2631;
		@Pc(25) int local25 = (int) arg0.aLong61;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong61;
		@Pc(53) Class2_Sub52 local53;
		if (local21 == 19) {
			if (Static468.anInt8823 > 0 && Static449.aClass90_1.method8781(82) && Static449.aClass90_1.method8781(81)) {
				Static147.method3257(local18 + Static32.anInt723, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, local15 + Static84.anInt2565);
			} else {
				local53 = Static243.method4514(local18, local15, local25);
				if (local25 == 1) {
					local53.aClass2_Sub11_Sub2_7.method8374(-1);
					local53.aClass2_Sub11_Sub2_7.method8374(-1);
					local53.aClass2_Sub11_Sub2_7.method8333((int) Static72.aFloat68);
					local53.aClass2_Sub11_Sub2_7.method8374(57);
					local53.aClass2_Sub11_Sub2_7.method8374(Static563.anInt10146);
					local53.aClass2_Sub11_Sub2_7.method8374(Static183.anInt4411);
					local53.aClass2_Sub11_Sub2_7.method8374(89);
					local53.aClass2_Sub11_Sub2_7.method8333(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303);
					local53.aClass2_Sub11_Sub2_7.method8333(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310);
					local53.aClass2_Sub11_Sub2_7.method8374(63);
				} else {
					Static334.anInt6734 = arg1;
					Static223.anInt4978 = arg2;
					Static124.anInt11090 = 0;
					Static592.anInt10450 = 1;
				}
				Static96.method2563(local53);
				Static624.method9086(true, local15, local18, 1, 0, 1, -4, 0);
			}
		}
		if (local21 == 4) {
			Static334.anInt6734 = arg1;
			Static592.anInt10450 = 2;
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			local53 = Static130.method3019(Static461.aClass94_82, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8345(Static32.anInt723 + local18);
			local53.aClass2_Sub11_Sub2_7.method8331(local15 + Static84.anInt2565);
			local53.aClass2_Sub11_Sub2_7.method8366(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8345(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static96.method2563(local53);
			Static67.method2075(local18, local32, local15);
		}
		@Pc(236) Class3_Sub1_Sub3_Sub3_Sub1 local236;
		@Pc(231) Class2_Sub33 local231;
		if (local21 == 1008) {
			Static592.anInt10450 = 2;
			Static334.anInt6734 = arg1;
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			local231 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local25);
			if (local231 != null) {
				local236 = local231.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				@Pc(239) Class27 local239 = local236.aClass27_1;
				if (local239.anIntArray43 != null) {
					local239 = local239.method727(Static286.aClass263_3);
				}
				if (local239 != null) {
					@Pc(258) Class2_Sub52 local258 = Static130.method3019(Static477.aClass94_90, Static361.aClass183_1);
					local258.aClass2_Sub11_Sub2_7.method8333(local239.anInt638);
					Static96.method2563(local258);
				}
			}
		}
		@Pc(276) Class3_Sub1_Sub3_Sub3_Sub2 local276;
		@Pc(295) Class2_Sub52 local295;
		if (local21 == 48) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static124.anInt11090 = 0;
				Static334.anInt6734 = arg1;
				Static223.anInt4978 = arg2;
				Static592.anInt10450 = 2;
				local295 = Static130.method3019(Static263.aClass94_55, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8331(local25);
				local295.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 49) {
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			Static592.anInt10450 = 2;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static11.aClass94_64, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8349(local15 + Static84.anInt2565);
			local53.aClass2_Sub11_Sub2_7.method8331(local25);
			local53.aClass2_Sub11_Sub2_7.method8349(Static194.anInt4509);
			local53.aClass2_Sub11_Sub2_7.method8333(Static32.anInt723 + local18);
			local53.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8331(Static64.anInt2065);
			local53.aClass2_Sub11_Sub2_7.method8332(Static397.anInt7582);
			Static96.method2563(local53);
			Static263.method4859(local18, local15);
		}
		@Pc(419) Class24 local419;
		if (local21 == 6) {
			local419 = Static330.method5694(local15, local18);
			if (local419 != null) {
				Static406.method6596(local419);
			}
		}
		if (local21 == 5) {
			Static124.anInt11090 = 0;
			Static223.anInt4978 = arg2;
			Static592.anInt10450 = 2;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static52.aClass94_16, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8333(Static32.anInt723 + local18);
			local53.aClass2_Sub11_Sub2_7.method8331(local15 + Static84.anInt2565);
			local53.aClass2_Sub11_Sub2_7.method8370(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8331(local25);
			Static96.method2563(local53);
			Static263.method4859(local18, local15);
		}
		@Pc(516) Class2_Sub52 local516;
		if (local21 == 46) {
			local231 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local25);
			if (local231 != null) {
				Static124.anInt11090 = 0;
				Static223.anInt4978 = arg2;
				Static592.anInt10450 = 2;
				Static334.anInt6734 = arg1;
				local236 = local231.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				local516 = Static130.method3019(Static79.aClass94_22, Static361.aClass183_1);
				local516.aClass2_Sub11_Sub2_7.method8349(local25);
				local516.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local516);
				Static624.method9086(true, local236.anIntArray358[0], local236.anIntArray357[0], local236.method5214(), 0, local236.method5214(), -2, 0);
			}
		}
		if (local21 == 11) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static124.anInt11090 = 0;
				Static334.anInt6734 = arg1;
				Static592.anInt10450 = 2;
				Static223.anInt4978 = arg2;
				local295 = Static130.method3019(Static352.aClass94_69, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8345(local25);
				local295.aClass2_Sub11_Sub2_7.method8370(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 59) {
			Static223.anInt4978 = arg2;
			Static334.anInt6734 = arg1;
			Static124.anInt11090 = 0;
			Static592.anInt10450 = 2;
			local53 = Static130.method3019(Static192.aClass94_39, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8331((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local53.aClass2_Sub11_Sub2_7.method8331(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8349(Static32.anInt723 + local18);
			Static96.method2563(local53);
			Static67.method2075(local18, local32, local15);
		}
		if (local21 == 30) {
			local231 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local25);
			if (local231 != null) {
				Static124.anInt11090 = 0;
				Static334.anInt6734 = arg1;
				Static223.anInt4978 = arg2;
				local236 = local231.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				Static592.anInt10450 = 2;
				local516 = Static130.method3019(Static379.aClass94_75, Static361.aClass183_1);
				local516.aClass2_Sub11_Sub2_7.method8345(Static194.anInt4509);
				local516.aClass2_Sub11_Sub2_7.method8387(Static397.anInt7582);
				local516.aClass2_Sub11_Sub2_7.method8349(local25);
				local516.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
				local516.aClass2_Sub11_Sub2_7.method8331(Static64.anInt2065);
				Static96.method2563(local516);
				Static624.method9086(true, local236.anIntArray358[0], local236.anIntArray357[0], local236.method5214(), 0, local236.method5214(), -2, 0);
			}
		}
		if (local21 == 12) {
			if (Static468.anInt8823 > 0 && Static449.aClass90_1.method8781(82) && Static449.aClass90_1.method8781(81)) {
				Static147.method3257(local18 + Static32.anInt723, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, Static84.anInt2565 + local15);
			} else {
				Static334.anInt6734 = arg1;
				Static223.anInt4978 = arg2;
				Static124.anInt11090 = 0;
				Static592.anInt10450 = 1;
				local53 = Static130.method3019(Static471.aClass94_89, Static361.aClass183_1);
				local53.aClass2_Sub11_Sub2_7.method8331(Static84.anInt2565 + local15);
				local53.aClass2_Sub11_Sub2_7.method8333(Static32.anInt723 + local18);
				Static96.method2563(local53);
			}
		}
		if (local21 == 1001) {
			Static334.anInt6734 = arg1;
			Static592.anInt10450 = 2;
			Static124.anInt11090 = 0;
			Static223.anInt4978 = arg2;
			local53 = Static130.method3019(Static485.aClass94_94, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8333(local25);
			Static96.method2563(local53);
		}
		if (local21 == 51) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static223.anInt4978 = arg2;
				Static592.anInt10450 = 2;
				Static124.anInt11090 = 0;
				Static334.anInt6734 = arg1;
				local295 = Static130.method3019(Static255.aClass94_53, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8345(Static194.anInt4509);
				local295.aClass2_Sub11_Sub2_7.method8349(local25);
				local295.aClass2_Sub11_Sub2_7.method8349(Static64.anInt2065);
				local295.aClass2_Sub11_Sub2_7.method8352(Static397.anInt7582);
				local295.aClass2_Sub11_Sub2_7.method8370(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 45) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static124.anInt11090 = 0;
				Static334.anInt6734 = arg1;
				Static592.anInt10450 = 2;
				Static223.anInt4978 = arg2;
				local295 = Static130.method3019(Static451.aClass94_84, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8366(Static449.aClass90_1.method8781(82) ? 1 : 0);
				local295.aClass2_Sub11_Sub2_7.method8349(local25);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 1007) {
			Static592.anInt10450 = 2;
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static469.aClass94_88, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8349(Static32.anInt723 + local18);
			local53.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8345(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8331(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static96.method2563(local53);
			Static67.method2075(local18, local32, local15);
		}
		if (local21 == 23) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static592.anInt10450 = 2;
				Static124.anInt11090 = 0;
				Static223.anInt4978 = arg2;
				Static334.anInt6734 = arg1;
				local295 = Static130.method3019(Static255.aClass94_52, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8333(local25);
				local295.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 16 && Static249.aClass24_10 == null) {
			Static264.method4889(local18, local15);
			Static249.aClass24_10 = Static330.method5694(local15, local18);
			Static553.method8248(Static249.aClass24_10);
		}
		if (local21 == 8) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static334.anInt6734 = arg1;
				Static223.anInt4978 = arg2;
				Static592.anInt10450 = 2;
				Static124.anInt11090 = 0;
				local295 = Static130.method3019(Static553.aClass94_100, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
				local295.aClass2_Sub11_Sub2_7.method8331(local25);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 21) {
			Static334.anInt6734 = arg1;
			Static124.anInt11090 = 0;
			Static592.anInt10450 = 2;
			Static223.anInt4978 = arg2;
			local53 = Static130.method3019(Static144.aClass94_34, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8333(local25);
			local53.aClass2_Sub11_Sub2_7.method8333(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8333(local18 + Static32.anInt723);
			local53.aClass2_Sub11_Sub2_7.method8366(Static449.aClass90_1.method8781(82) ? 1 : 0);
			Static96.method2563(local53);
			Static263.method4859(local18, local15);
		}
		if (local21 == 15) {
			Static592.anInt10450 = 1;
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static11.aClass94_65, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8349(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8331(Static64.anInt2065);
			local53.aClass2_Sub11_Sub2_7.method8349(Static194.anInt4509);
			local53.aClass2_Sub11_Sub2_7.method8387(Static397.anInt7582);
			local53.aClass2_Sub11_Sub2_7.method8331(Static32.anInt723 + local18);
			Static96.method2563(local53);
			Static624.method9086(true, local15, local18, 1, 0, 1, -4, 0);
		}
		if (local21 == 60) {
			local231 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local25);
			if (local231 != null) {
				Static124.anInt11090 = 0;
				Static223.anInt4978 = arg2;
				Static334.anInt6734 = arg1;
				local236 = local231.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				Static592.anInt10450 = 2;
				local516 = Static130.method3019(Static291.aClass94_61, Static361.aClass183_1);
				local516.aClass2_Sub11_Sub2_7.method8333(local25);
				local516.aClass2_Sub11_Sub2_7.method8370(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local516);
				Static624.method9086(true, local236.anIntArray358[0], local236.anIntArray357[0], local236.method5214(), 0, local236.method5214(), -2, 0);
			}
		}
		if (local21 == 2) {
			Static124.anInt11090 = 0;
			Static592.anInt10450 = 2;
			Static223.anInt4978 = arg2;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static37.aClass94_11, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8333(Static64.anInt2065);
			local53.aClass2_Sub11_Sub2_7.method8345(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8344(Static397.anInt7582);
			local53.aClass2_Sub11_Sub2_7.method8331(Static32.anInt723 + local18);
			local53.aClass2_Sub11_Sub2_7.method8366(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8349(Static194.anInt4509);
			local53.aClass2_Sub11_Sub2_7.method8349((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static96.method2563(local53);
			Static67.method2075(local18, local32, local15);
		}
		if (local21 == 58) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static124.anInt11090 = 0;
				Static334.anInt6734 = arg1;
				Static223.anInt4978 = arg2;
				Static592.anInt10450 = 2;
				local295 = Static130.method3019(Static437.aClass94_83, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
				local295.aClass2_Sub11_Sub2_7.method8331(local25);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 17) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static592.anInt10450 = 2;
				Static334.anInt6734 = arg1;
				Static223.anInt4978 = arg2;
				Static124.anInt11090 = 0;
				local295 = Static130.method3019(Static221.aClass94_45, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
				local295.aClass2_Sub11_Sub2_7.method8333(local25);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 47) {
			Static223.anInt4978 = arg2;
			Static592.anInt10450 = 2;
			Static124.anInt11090 = 0;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static183.aClass94_38, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8333(local25);
			local53.aClass2_Sub11_Sub2_7.method8331(local15 + Static84.anInt2565);
			local53.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8345(local18 + Static32.anInt723);
			Static96.method2563(local53);
			Static263.method4859(local18, local15);
		}
		if (local21 == 3) {
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			Static592.anInt10450 = 2;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static198.aClass94_40, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8366(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8345(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8349(local18 + Static32.anInt723);
			local53.aClass2_Sub11_Sub2_7.method8333(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static96.method2563(local53);
			Static67.method2075(local18, local32, local15);
		}
		if (local21 == 20) {
			local231 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local25);
			if (local231 != null) {
				Static592.anInt10450 = 2;
				Static223.anInt4978 = arg2;
				Static334.anInt6734 = arg1;
				local236 = local231.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				Static124.anInt11090 = 0;
				local516 = Static130.method3019(Static114.aClass94_24, Static361.aClass183_1);
				local516.aClass2_Sub11_Sub2_7.method8345(local25);
				local516.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local516);
				Static624.method9086(true, local236.anIntArray358[0], local236.anIntArray357[0], local236.method5214(), 0, local236.method5214(), -2, 0);
			}
		}
		if (local21 == 1010) {
			Static592.anInt10450 = 2;
			Static334.anInt6734 = arg1;
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			local53 = Static130.method3019(Static281.aClass94_59, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8333(local25);
			Static96.method2563(local53);
		}
		if (local21 == 22) {
			Static592.anInt10450 = 2;
			Static124.anInt11090 = 0;
			Static334.anInt6734 = arg1;
			Static223.anInt4978 = arg2;
			local53 = Static130.method3019(Static482.aClass94_92, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8366(Static449.aClass90_1.method8781(82) ? 1 : 0);
			local53.aClass2_Sub11_Sub2_7.method8331(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8349(Static32.anInt723 + local18);
			local53.aClass2_Sub11_Sub2_7.method8333(local25);
			Static96.method2563(local53);
			Static263.method4859(local18, local15);
		}
		if (local21 == 50) {
			Static223.anInt4978 = arg2;
			Static592.anInt10450 = 2;
			Static124.anInt11090 = 0;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static255.aClass94_53, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8345(Static194.anInt4509);
			local53.aClass2_Sub11_Sub2_7.method8349(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6083);
			local53.aClass2_Sub11_Sub2_7.method8349(Static64.anInt2065);
			local53.aClass2_Sub11_Sub2_7.method8352(Static397.anInt7582);
			local53.aClass2_Sub11_Sub2_7.method8370(Static449.aClass90_1.method8781(82) ? 1 : 0);
			Static96.method2563(local53);
		}
		if (local21 == 18 || local21 == 1011) {
			Static206.method4084(local15, arg0.aString21, local25, local18);
		}
		if (local21 == 13) {
			local419 = Static330.method5694(local15, local18);
			if (local419 != null) {
				Static117.method2902();
				@Pc(2049) Class2_Sub50 local2049 = Static76.method2235(local419);
				Static114.method2845(local2049.anInt10795, local2049.method9008(), local419);
				Static225.aString48 = Static345.method5921(local419);
				Static225.aString47 = local419.aString3 + "<col=ffffff>";
				if (Static225.aString48 == null) {
					Static225.aString48 = "Null";
				}
			}
			return;
		}
		if (local21 == 1009 || local21 == 1012 || local21 == 1002 || local21 == 1003 || local21 == 1006) {
			Static281.method5113(local21, local15, local25);
		}
		if (local21 == 25) {
			local231 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local25);
			if (local231 != null) {
				Static592.anInt10450 = 2;
				Static334.anInt6734 = arg1;
				local236 = local231.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				Static223.anInt4978 = arg2;
				Static124.anInt11090 = 0;
				local516 = Static130.method3019(Static261.aClass94_54, Static361.aClass183_1);
				local516.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
				local516.aClass2_Sub11_Sub2_7.method8349(local25);
				Static96.method2563(local516);
				Static624.method9086(true, local236.anIntArray358[0], local236.anIntArray357[0], local236.method5214(), 0, local236.method5214(), -2, 0);
			}
		}
		if (local21 == 57) {
			local276 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local25];
			if (local276 != null) {
				Static592.anInt10450 = 2;
				Static334.anInt6734 = arg1;
				Static124.anInt11090 = 0;
				Static223.anInt4978 = arg2;
				local295 = Static130.method3019(Static332.aClass94_67, Static361.aClass183_1);
				local295.aClass2_Sub11_Sub2_7.method8331(local25);
				local295.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local295);
				Static624.method9086(true, local276.anIntArray358[0], local276.anIntArray357[0], local276.method5214(), 0, local276.method5214(), -2, 0);
			}
		}
		if (local21 == 9) {
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			Static592.anInt10450 = 2;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static556.aClass94_101, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8331(Static32.anInt723 + local18);
			local53.aClass2_Sub11_Sub2_7.method8345(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local53.aClass2_Sub11_Sub2_7.method8349(local15 + Static84.anInt2565);
			local53.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
			Static96.method2563(local53);
			Static67.method2075(local18, local32, local15);
		}
		if (local21 == 44) {
			local231 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local25);
			if (local231 != null) {
				local236 = local231.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				Static334.anInt6734 = arg1;
				Static124.anInt11090 = 0;
				Static223.anInt4978 = arg2;
				Static592.anInt10450 = 2;
				local516 = Static130.method3019(Static242.aClass94_48, Static361.aClass183_1);
				local516.aClass2_Sub11_Sub2_7.method8333(local25);
				local516.aClass2_Sub11_Sub2_7.method8374(Static449.aClass90_1.method8781(82) ? 1 : 0);
				Static96.method2563(local516);
				Static624.method9086(true, local236.anIntArray358[0], local236.anIntArray357[0], local236.method5214(), 0, local236.method5214(), -2, 0);
			}
		}
		if (local21 == 10) {
			Static592.anInt10450 = 2;
			Static223.anInt4978 = arg2;
			Static124.anInt11090 = 0;
			Static334.anInt6734 = arg1;
			local53 = Static130.method3019(Static460.aClass94_85, Static361.aClass183_1);
			local53.aClass2_Sub11_Sub2_7.method8331(local18 + Static32.anInt723);
			local53.aClass2_Sub11_Sub2_7.method8331(local25);
			local53.aClass2_Sub11_Sub2_7.method8349(Static84.anInt2565 + local15);
			local53.aClass2_Sub11_Sub2_7.method8370(Static449.aClass90_1.method8781(82) ? 1 : 0);
			Static96.method2563(local53);
			Static263.method4859(local18, local15);
		}
		if (Static475.aBoolean695) {
			Static117.method2902();
		}
		if (Static7.aClass24_2 != null && Static354.anInt7035 == 0) {
			Static553.method8248(Static7.aClass24_2);
		}
	}
}
