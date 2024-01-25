import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt2234;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!wn;I)V")
	public static void method2211(@OriginalArg(0) Class218 arg0) {
		Static56.aClass218_1 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIZIZ)V")
	public static void method2212(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 <= arg0) {
			return;
		}
		@Pc(20) int local20 = (arg4 + arg0) / 2;
		@Pc(22) int local22 = arg0;
		@Pc(26) Class6_Sub1 local26 = Static337.aClass6_Sub1Array1[local20];
		Static337.aClass6_Sub1Array1[local20] = Static337.aClass6_Sub1Array1[arg4];
		Static337.aClass6_Sub1Array1[arg4] = local26;
		for (@Pc(38) int local38 = arg0; local38 < arg4; local38++) {
			if (Static194.method3668(arg1, arg3, arg5, Static337.aClass6_Sub1Array1[local38], arg2, local26) <= 0) {
				@Pc(55) Class6_Sub1 local55 = Static337.aClass6_Sub1Array1[local38];
				Static337.aClass6_Sub1Array1[local38] = Static337.aClass6_Sub1Array1[local22];
				Static337.aClass6_Sub1Array1[local22++] = local55;
			}
		}
		Static337.aClass6_Sub1Array1[arg4] = Static337.aClass6_Sub1Array1[local22];
		Static337.aClass6_Sub1Array1[local22] = local26;
		method2212(arg0, arg1, arg2, arg3, local22 - 1, arg5);
		method2212(local22 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!no;)V")
	public static void method2213(@OriginalArg(1) Class14_Sub23 arg0) {
		if (arg0 == null || Static95.aClass18_9.aClass14_17 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt4351;
		@Pc(18) int local18 = arg0.anInt4350;
		@Pc(21) int local21 = arg0.anInt4355;
		@Pc(25) int local25 = (int) arg0.aLong128;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong128;
		if (local21 == 3) {
			Static244.anInt4754 = Static272.anInt5167;
			Static327.anInt6304 = 2;
			Static349.anInt6630 = Static321.anInt6195;
			Static27.anInt614 = 0;
			Static164.aClass14_Sub4_Sub2_3.method2557(144);
			Static164.aClass14_Sub4_Sub2_3.method2535(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2535(local25);
			Static164.aClass14_Sub4_Sub2_3.method2504(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2494(Static151.anInt3234 + local15);
			Static250.method4353(local15, local18);
		}
		@Pc(102) Class146 local102;
		@Pc(122) int local122;
		if (local21 == 20) {
			Static164.aClass14_Sub4_Sub2_3.method2557(202);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			local102 = Static273.method4632(local18);
			if (local102.anIntArrayArray69 != null && local102.anIntArrayArray69[0][0] == 5) {
				local122 = local102.anIntArrayArray69[0][1];
				Static102.anIntArray211[local122] = 1 - Static102.anIntArray211[local122];
				Static245.method3550(local122);
			}
		}
		@Pc(143) Class10_Sub3_Sub3_Sub1 local143;
		if (local21 == 1) {
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				Static244.anInt4754 = Static272.anInt5167;
				Static349.anInt6630 = Static321.anInt6195;
				Static327.anInt6304 = 2;
				Static27.anInt614 = 0;
				Static164.aClass14_Sub4_Sub2_3.method2557(79);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2535(local25);
				Static229.method4046(-2, local143.method5353(), local143.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local143.method5353(), local143.anIntArray536[0]);
			}
		}
		if (local21 == 23) {
			Static164.aClass14_Sub4_Sub2_3.method2557(200);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15);
			Static164.aClass14_Sub4_Sub2_3.method2535(Static188.anInt3867);
			Static164.aClass14_Sub4_Sub2_3.method2512(Static88.anInt2109);
			Static164.aClass14_Sub4_Sub2_3.method2535(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 15) {
			Static164.aClass14_Sub4_Sub2_3.method2557(184);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2535(local25);
			Static164.aClass14_Sub4_Sub2_3.method2509(local15);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 6) {
			Static349.anInt6630 = Static321.anInt6195;
			Static327.anInt6304 = 2;
			Static244.anInt4754 = Static272.anInt5167;
			Static27.anInt614 = 0;
			Static164.aClass14_Sub4_Sub2_3.method2557(82);
			Static164.aClass14_Sub4_Sub2_3.method2494(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2494(local25);
			Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15 + Static151.anInt3234);
			Static250.method4353(local15, local18);
		}
		if (local21 == 37 || local21 == 1004) {
			Static174.method3390(arg0.aString155, local18, local25, local15);
		}
		if (local21 == 8) {
			Static164.aClass14_Sub4_Sub2_3.method2557(100);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2535(local15);
			Static164.aClass14_Sub4_Sub2_3.method2524(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 24) {
			Static164.aClass14_Sub4_Sub2_3.method2557(202);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			local102 = Static273.method4632(local18);
			if (local102.anIntArrayArray69 != null && local102.anIntArrayArray69[0][0] == 5) {
				local122 = local102.anIntArrayArray69[0][1];
				if (Static102.anIntArray211[local122] != local102.anIntArray362[0]) {
					Static102.anIntArray211[local122] = local102.anIntArray362[0];
					Static245.method3550(local122);
				}
			}
		}
		if (local21 == 1001) {
			Static244.anInt4754 = Static272.anInt5167;
			Static27.anInt614 = 0;
			Static327.anInt6304 = 2;
			Static349.anInt6630 = Static321.anInt6195;
			Static164.aClass14_Sub4_Sub2_3.method2557(54);
			Static164.aClass14_Sub4_Sub2_3.method2509(local25);
		}
		if (local21 == 22) {
			local102 = Static273.method4632(local18);
			@Pc(467) boolean local467 = true;
			if (local102.anInt4198 > 0) {
				local467 = Static3.method107(local102);
			}
			if (local467) {
				Static164.aClass14_Sub4_Sub2_3.method2557(202);
				Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			}
		}
		if (local21 == 34) {
			if (Static40.anInt979 > 0 && Static345.aBooleanArray30[82] && Static345.aBooleanArray30[81]) {
				Static319.method5485(Static219.anInt4400, local15 + Static151.anInt3234, Static251.anInt3170 + local18);
			} else {
				Static296.method5064(local25, local15, local18);
				if (local25 == 1) {
					Static164.aClass14_Sub4_Sub2_3.method2538(-1);
					Static164.aClass14_Sub4_Sub2_3.method2538(-1);
					Static164.aClass14_Sub4_Sub2_3.method2509((int) Static94.aFloat42);
					Static164.aClass14_Sub4_Sub2_3.method2538(57);
					Static164.aClass14_Sub4_Sub2_3.method2538(Static8.anInt205);
					Static164.aClass14_Sub4_Sub2_3.method2538(Static309.anInt5886);
					Static164.aClass14_Sub4_Sub2_3.method2538(89);
					Static164.aClass14_Sub4_Sub2_3.method2509(Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910);
					Static164.aClass14_Sub4_Sub2_3.method2509(Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908);
					Static164.aClass14_Sub4_Sub2_3.method2538(63);
				} else {
					Static27.anInt614 = 0;
					Static327.anInt6304 = 1;
					Static349.anInt6630 = Static321.anInt6195;
					Static244.anInt4754 = Static272.anInt5167;
				}
				Static229.method4046(-4, 1, local15, 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], 1, local18);
			}
		}
		if (local21 == 38) {
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				Static349.anInt6630 = Static321.anInt6195;
				Static27.anInt614 = 0;
				Static327.anInt6304 = 2;
				Static244.anInt4754 = Static272.anInt5167;
				Static164.aClass14_Sub4_Sub2_3.method2557(239);
				Static164.aClass14_Sub4_Sub2_3.method2537(Static88.anInt2109);
				Static164.aClass14_Sub4_Sub2_3.method2524(Static188.anInt3867);
				Static164.aClass14_Sub4_Sub2_3.method2524(local25);
				Static164.aClass14_Sub4_Sub2_3.method2543(Static345.aBooleanArray30[82] ? 1 : 0);
				Static229.method4046(-2, local143.method5353(), local143.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local143.method5353(), local143.anIntArray536[0]);
			}
		}
		if (local21 == 21) {
			if (Static40.anInt979 > 0 && Static345.aBooleanArray30[82] && Static345.aBooleanArray30[81]) {
				Static319.method5485(Static219.anInt4400, Static151.anInt3234 + local15, local18 + Static251.anInt3170);
			} else {
				Static244.anInt4754 = Static272.anInt5167;
				Static27.anInt614 = 0;
				Static349.anInt6630 = Static321.anInt6195;
				Static327.anInt6304 = 1;
				Static164.aClass14_Sub4_Sub2_3.method2557(123);
				Static164.aClass14_Sub4_Sub2_3.method2509(Static251.anInt3170 + local18);
				Static164.aClass14_Sub4_Sub2_3.method2509(Static151.anInt3234 + local15);
			}
		}
		if (local21 == 45) {
			Static164.aClass14_Sub4_Sub2_3.method2557(146);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2535(local15);
			Static164.aClass14_Sub4_Sub2_3.method2535(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 1011) {
			Static327.anInt6304 = 2;
			Static244.anInt4754 = Static272.anInt5167;
			Static27.anInt614 = 0;
			Static349.anInt6630 = Static321.anInt6195;
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				@Pc(789) Class192 local789 = local143.aClass192_1;
				if (local789.anIntArray525 != null) {
					local789 = local789.method5281();
				}
				if (local789 != null) {
					Static164.aClass14_Sub4_Sub2_3.method2557(56);
					Static164.aClass14_Sub4_Sub2_3.method2494(local789.anInt5817);
				}
			}
		}
		if (local21 == 58) {
			Static164.aClass14_Sub4_Sub2_3.method2557(245);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2535(local15);
			Static164.aClass14_Sub4_Sub2_3.method2509(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		@Pc(851) Class10_Sub3_Sub3_Sub2 local851;
		if (local21 == 59) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static27.anInt614 = 0;
				Static244.anInt4754 = Static272.anInt5167;
				Static327.anInt6304 = 2;
				Static349.anInt6630 = Static321.anInt6195;
				Static164.aClass14_Sub4_Sub2_3.method2557(102);
				Static164.aClass14_Sub4_Sub2_3.method2509(local25);
				Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 5) {
			Static244.anInt4754 = Static272.anInt5167;
			Static27.anInt614 = 0;
			Static349.anInt6630 = Static321.anInt6195;
			Static327.anInt6304 = 2;
			Static164.aClass14_Sub4_Sub2_3.method2557(115);
			Static164.aClass14_Sub4_Sub2_3.method2535(local25);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15 + Static151.anInt3234);
			Static164.aClass14_Sub4_Sub2_3.method2535(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2509(Static188.anInt3867);
			Static164.aClass14_Sub4_Sub2_3.method2543(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2512(Static88.anInt2109);
			Static250.method4353(local15, local18);
		}
		if (local21 == 1012) {
			Static27.anInt614 = 0;
			Static244.anInt4754 = Static272.anInt5167;
			Static327.anInt6304 = 2;
			Static349.anInt6630 = Static321.anInt6195;
			Static164.aClass14_Sub4_Sub2_3.method2557(45);
			Static164.aClass14_Sub4_Sub2_3.method2509(local25);
		}
		if (local21 == 18) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static349.anInt6630 = Static321.anInt6195;
				Static327.anInt6304 = 2;
				Static27.anInt614 = 0;
				Static244.anInt4754 = Static272.anInt5167;
				Static164.aClass14_Sub4_Sub2_3.method2557(62);
				Static164.aClass14_Sub4_Sub2_3.method2524(local25);
				Static164.aClass14_Sub4_Sub2_3.method2504(Static345.aBooleanArray30[82] ? 1 : 0);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 13) {
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				Static27.anInt614 = 0;
				Static327.anInt6304 = 2;
				Static349.anInt6630 = Static321.anInt6195;
				Static244.anInt4754 = Static272.anInt5167;
				Static164.aClass14_Sub4_Sub2_3.method2557(64);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2494(local25);
				Static229.method4046(-2, local143.method5353(), local143.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local143.method5353(), local143.anIntArray536[0]);
			}
		}
		if (local21 == 49) {
			Static244.anInt4754 = Static272.anInt5167;
			Static327.anInt6304 = 2;
			Static27.anInt614 = 0;
			Static349.anInt6630 = Static321.anInt6195;
			Static164.aClass14_Sub4_Sub2_3.method2557(212);
			Static164.aClass14_Sub4_Sub2_3.method2494(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static164.aClass14_Sub4_Sub2_3.method2535(local15 + Static151.anInt3234);
			Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2524(local18 + Static251.anInt3170);
			Static171.method3334(local34, local15, local18);
		}
		if (local21 == 60) {
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				Static327.anInt6304 = 2;
				Static244.anInt4754 = Static272.anInt5167;
				Static349.anInt6630 = Static321.anInt6195;
				Static27.anInt614 = 0;
				Static164.aClass14_Sub4_Sub2_3.method2557(143);
				Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2494(local25);
				Static229.method4046(-2, local143.method5353(), local143.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local143.method5353(), local143.anIntArray536[0]);
			}
		}
		if (local21 == 29) {
			Static154.method3022(local18, local15);
		}
		if (local21 == 42) {
			Static349.anInt6630 = Static321.anInt6195;
			Static327.anInt6304 = 1;
			Static27.anInt614 = 0;
			Static244.anInt4754 = Static272.anInt5167;
			Static164.aClass14_Sub4_Sub2_3.method2557(242);
			Static164.aClass14_Sub4_Sub2_3.method2541(Static88.anInt2109);
			Static164.aClass14_Sub4_Sub2_3.method2494(Static251.anInt3170 + local18);
			Static164.aClass14_Sub4_Sub2_3.method2524(Static188.anInt3867);
			Static164.aClass14_Sub4_Sub2_3.method2535(local15 + Static151.anInt3234);
			Static229.method4046(-4, 1, local15, 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], 1, local18);
		}
		if (local21 == 39) {
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				Static27.anInt614 = 0;
				Static244.anInt4754 = Static272.anInt5167;
				Static349.anInt6630 = Static321.anInt6195;
				Static327.anInt6304 = 2;
				Static164.aClass14_Sub4_Sub2_3.method2557(222);
				Static164.aClass14_Sub4_Sub2_3.method2541(Static247.anInt4790);
				Static164.aClass14_Sub4_Sub2_3.method2494(Static228.anInt4500);
				Static164.aClass14_Sub4_Sub2_3.method2504(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2509(local25);
				Static164.aClass14_Sub4_Sub2_3.method2509(Static31.anInt733);
				Static229.method4046(-2, local143.method5353(), local143.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local143.method5353(), local143.anIntArray536[0]);
			}
		}
		if (local21 == 31) {
			Static164.aClass14_Sub4_Sub2_3.method2557(162);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2509(local15);
			Static164.aClass14_Sub4_Sub2_3.method2535(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 14) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static327.anInt6304 = 2;
				Static349.anInt6630 = Static321.anInt6195;
				Static244.anInt4754 = Static272.anInt5167;
				Static27.anInt614 = 0;
				Static164.aClass14_Sub4_Sub2_3.method2557(55);
				Static164.aClass14_Sub4_Sub2_3.method2509(local25);
				Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 35) {
			Static164.aClass14_Sub4_Sub2_3.method2557(152);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15);
			Static164.aClass14_Sub4_Sub2_3.method2524(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 19) {
			Static244.anInt4754 = Static272.anInt5167;
			Static327.anInt6304 = 2;
			Static349.anInt6630 = Static321.anInt6195;
			Static27.anInt614 = 0;
			Static164.aClass14_Sub4_Sub2_3.method2557(232);
			Static164.aClass14_Sub4_Sub2_3.method2494(Static151.anInt3234 + local15);
			Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2509((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static164.aClass14_Sub4_Sub2_3.method2509(local18 + Static251.anInt3170);
			Static171.method3334(local34, local15, local18);
		}
		if (local21 == 48) {
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				Static244.anInt4754 = Static272.anInt5167;
				Static327.anInt6304 = 2;
				Static349.anInt6630 = Static321.anInt6195;
				Static27.anInt614 = 0;
				Static164.aClass14_Sub4_Sub2_3.method2557(2);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2494(local25);
				Static229.method4046(-2, local143.method5353(), local143.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local143.method5353(), local143.anIntArray536[0]);
			}
		}
		if (local21 == 41) {
			Static244.anInt4754 = Static272.anInt5167;
			Static327.anInt6304 = 2;
			Static27.anInt614 = 0;
			Static349.anInt6630 = Static321.anInt6195;
			Static164.aClass14_Sub4_Sub2_3.method2557(84);
			Static164.aClass14_Sub4_Sub2_3.method2509(Static251.anInt3170 + local18);
			Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2494(local15 + Static151.anInt3234);
			Static164.aClass14_Sub4_Sub2_3.method2509((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static171.method3334(local34, local15, local18);
		}
		if (local21 == 7) {
			Static164.method3270();
			local102 = Static273.method4632(local18);
			Static31.anInt733 = local25;
			Static312.anInt6025 = 1;
			Static247.anInt4790 = local18;
			Static228.anInt4500 = local15;
			Static166.method3295(local102);
			Static328.aString237 = "<col=ff9040>" + Static296.method5066(local25).aString251 + "<col=ffffff>";
			if (Static328.aString237 == null) {
				Static328.aString237 = "null";
			}
			return;
		}
		if (local21 == 11) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static27.anInt614 = 0;
				Static327.anInt6304 = 2;
				Static349.anInt6630 = Static321.anInt6195;
				Static244.anInt4754 = Static272.anInt5167;
				Static164.aClass14_Sub4_Sub2_3.method2557(104);
				Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2524(local25);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 30) {
			Static27.anInt614 = 0;
			Static349.anInt6630 = Static321.anInt6195;
			Static244.anInt4754 = Static272.anInt5167;
			Static327.anInt6304 = 2;
			Static164.aClass14_Sub4_Sub2_3.method2557(167);
			Static164.aClass14_Sub4_Sub2_3.method2535(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2494(local15 + Static151.anInt3234);
			Static164.aClass14_Sub4_Sub2_3.method2535(local25);
			Static164.aClass14_Sub4_Sub2_3.method2543(Static345.aBooleanArray30[82] ? 1 : 0);
			Static250.method4353(local15, local18);
		}
		if (local21 == 4) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static327.anInt6304 = 2;
				Static244.anInt4754 = Static272.anInt5167;
				Static27.anInt614 = 0;
				Static349.anInt6630 = Static321.anInt6195;
				Static164.aClass14_Sub4_Sub2_3.method2557(68);
				Static164.aClass14_Sub4_Sub2_3.method2535(local25);
				Static164.aClass14_Sub4_Sub2_3.method2504(Static345.aBooleanArray30[82] ? 1 : 0);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 1003) {
			local102 = Static273.method4632(local18);
			if (local102 == null || local102.anIntArray361[local15] < 100000) {
				Static164.aClass14_Sub4_Sub2_3.method2557(45);
				Static164.aClass14_Sub4_Sub2_3.method2509(local25);
			} else {
				Static276.method4684(local102.anIntArray361[local15] + " x " + Static296.method5066(local25).aString251);
			}
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 43) {
			Static164.aClass14_Sub4_Sub2_3.method2557(193);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15);
			Static164.aClass14_Sub4_Sub2_3.method2524(Static31.anInt733);
			Static164.aClass14_Sub4_Sub2_3.method2535(Static228.anInt4500);
			Static164.aClass14_Sub4_Sub2_3.method2541(Static247.anInt4790);
			Static164.aClass14_Sub4_Sub2_3.method2494(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 36) {
			local143 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local25];
			if (local143 != null) {
				Static244.anInt4754 = Static272.anInt5167;
				Static27.anInt614 = 0;
				Static327.anInt6304 = 2;
				Static349.anInt6630 = Static321.anInt6195;
				Static164.aClass14_Sub4_Sub2_3.method2557(132);
				Static164.aClass14_Sub4_Sub2_3.method2543(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2494(local25);
				Static229.method4046(-2, local143.method5353(), local143.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local143.method5353(), local143.anIntArray536[0]);
			}
		}
		if (local21 == 12) {
			Static164.aClass14_Sub4_Sub2_3.method2557(105);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2535(local15);
			Static164.aClass14_Sub4_Sub2_3.method2524(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 32) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static244.anInt4754 = Static272.anInt5167;
				Static327.anInt6304 = 2;
				Static27.anInt614 = 0;
				Static349.anInt6630 = Static321.anInt6195;
				Static164.aClass14_Sub4_Sub2_3.method2557(50);
				Static164.aClass14_Sub4_Sub2_3.method2537(Static247.anInt4790);
				Static164.aClass14_Sub4_Sub2_3.method2524(Static31.anInt733);
				Static164.aClass14_Sub4_Sub2_3.method2494(Static228.anInt4500);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2524(local25);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 26) {
			Static349.anInt6630 = Static321.anInt6195;
			Static27.anInt614 = 0;
			Static327.anInt6304 = 2;
			Static244.anInt4754 = Static272.anInt5167;
			Static164.aClass14_Sub4_Sub2_3.method2557(157);
			Static164.aClass14_Sub4_Sub2_3.method2541(Static247.anInt4790);
			Static164.aClass14_Sub4_Sub2_3.method2535(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2509(Static31.anInt733);
			Static164.aClass14_Sub4_Sub2_3.method2535(Static228.anInt4500);
			Static164.aClass14_Sub4_Sub2_3.method2509(Static151.anInt3234 + local15);
			Static164.aClass14_Sub4_Sub2_3.method2524(local25);
			Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
			Static250.method4353(local15, local18);
		}
		if (local21 == 40) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static27.anInt614 = 0;
				Static244.anInt4754 = Static272.anInt5167;
				Static349.anInt6630 = Static321.anInt6195;
				Static327.anInt6304 = 2;
				Static164.aClass14_Sub4_Sub2_3.method2557(147);
				Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2535(local25);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 17) {
			Static164.aClass14_Sub4_Sub2_3.method2557(12);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2524(local25);
			Static164.aClass14_Sub4_Sub2_3.method2509(local15);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 33) {
			Static327.anInt6304 = 2;
			Static244.anInt4754 = Static272.anInt5167;
			Static27.anInt614 = 0;
			Static349.anInt6630 = Static321.anInt6195;
			Static164.aClass14_Sub4_Sub2_3.method2557(219);
			Static164.aClass14_Sub4_Sub2_3.method2494(Static228.anInt4500);
			Static164.aClass14_Sub4_Sub2_3.method2532(Static247.anInt4790);
			Static164.aClass14_Sub4_Sub2_3.method2524(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static164.aClass14_Sub4_Sub2_3.method2509(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2504(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2524(Static31.anInt733);
			Static164.aClass14_Sub4_Sub2_3.method2535(Static151.anInt3234 + local15);
			Static171.method3334(local34, local15, local18);
		}
		if (local21 == 46) {
			local102 = Static70.method1717(local18, local15);
			if (local102 != null) {
				Static164.method3270();
				@Pc(2488) Class14_Sub17 local2488 = Static42.method1040(local102);
				Static79.method1952(local102.anInt4200, local18, local102.anInt4168, local15, local2488.method2584(), local2488.anInt2691);
				Static312.anInt6025 = 0;
				Static324.aString230 = Static196.method3696(local102);
				if (local102.aBoolean260) {
					Static78.aString73 = local102.aString146 + "<col=ffffff>";
				} else {
					Static78.aString73 = "<col=00ff00>" + local102.aString142 + "<col=ffffff>";
				}
				if (Static324.aString230 == null) {
					Static324.aString230 = "Null";
				}
			}
			return;
		}
		if (local21 == 28) {
			Static164.aClass14_Sub4_Sub2_3.method2557(112);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2509(local15);
			Static164.aClass14_Sub4_Sub2_3.method2494(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 47) {
			Static244.anInt4754 = Static272.anInt5167;
			Static27.anInt614 = 0;
			Static349.anInt6630 = Static321.anInt6195;
			Static327.anInt6304 = 2;
			Static164.aClass14_Sub4_Sub2_3.method2557(108);
			Static164.aClass14_Sub4_Sub2_3.method2524(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15 + Static151.anInt3234);
			Static164.aClass14_Sub4_Sub2_3.method2509(local25);
			Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
			Static250.method4353(local15, local18);
		}
		if (local21 == 50) {
			Static27.anInt614 = 0;
			Static244.anInt4754 = Static272.anInt5167;
			Static327.anInt6304 = 2;
			Static349.anInt6630 = Static321.anInt6195;
			Static164.aClass14_Sub4_Sub2_3.method2557(161);
			Static164.aClass14_Sub4_Sub2_3.method2535(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2504(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2494(local15 + Static151.anInt3234);
			Static164.aClass14_Sub4_Sub2_3.method2509((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static171.method3334(local34, local15, local18);
		}
		if (local21 == 2) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static244.anInt4754 = Static272.anInt5167;
				Static349.anInt6630 = Static321.anInt6195;
				Static27.anInt614 = 0;
				Static327.anInt6304 = 2;
				Static164.aClass14_Sub4_Sub2_3.method2557(187);
				Static164.aClass14_Sub4_Sub2_3.method2494(local25);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 16) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static327.anInt6304 = 2;
				Static27.anInt614 = 0;
				Static244.anInt4754 = Static272.anInt5167;
				Static349.anInt6630 = Static321.anInt6195;
				Static164.aClass14_Sub4_Sub2_3.method2557(42);
				Static164.aClass14_Sub4_Sub2_3.method2509(local25);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 10) {
			Static296.method5069(false);
		}
		if (local21 == 1008) {
			Static327.anInt6304 = 2;
			Static244.anInt4754 = Static272.anInt5167;
			Static349.anInt6630 = Static321.anInt6195;
			Static27.anInt614 = 0;
			Static164.aClass14_Sub4_Sub2_3.method2557(234);
			Static164.aClass14_Sub4_Sub2_3.method2509(Static251.anInt3170 + local18);
			Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2535(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static164.aClass14_Sub4_Sub2_3.method2509(Static151.anInt3234 + local15);
			Static171.method3334(local34, local15, local18);
		}
		if (local21 == 51) {
			Static164.aClass14_Sub4_Sub2_3.method2557(76);
			Static164.aClass14_Sub4_Sub2_3.method2541(local18);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15);
			Static164.aClass14_Sub4_Sub2_3.method2524(local25);
			Static38.anInt911 = 0;
			Static72.aClass146_17 = Static273.method4632(local18);
			Static109.anInt2426 = local15;
		}
		if (local21 == 1010 || local21 == 1005 || local21 == 1007 || local21 == 1009 || local21 == 1006) {
			Static117.method4687(local15, local21, local25);
		}
		if (local21 == 44) {
			local851 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local25];
			if (local851 != null) {
				Static327.anInt6304 = 2;
				Static244.anInt4754 = Static272.anInt5167;
				Static349.anInt6630 = Static321.anInt6195;
				Static27.anInt614 = 0;
				Static164.aClass14_Sub4_Sub2_3.method2557(43);
				Static164.aClass14_Sub4_Sub2_3.method2504(Static345.aBooleanArray30[82] ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2512(Static88.anInt2109);
				Static164.aClass14_Sub4_Sub2_3.method2524(local25);
				Static164.aClass14_Sub4_Sub2_3.method2509(Static188.anInt3867);
				Static229.method4046(-2, local851.method5353(), local851.anIntArray535[0], 0, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local851.method5353(), local851.anIntArray536[0]);
			}
		}
		if (local21 == 57) {
			Static327.anInt6304 = 2;
			Static27.anInt614 = 0;
			Static244.anInt4754 = Static272.anInt5167;
			Static349.anInt6630 = Static321.anInt6195;
			Static164.aClass14_Sub4_Sub2_3.method2557(163);
			Static164.aClass14_Sub4_Sub2_3.method2509(Static151.anInt3234 + local15);
			Static164.aClass14_Sub4_Sub2_3.method2551(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2494(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2509(local25);
			Static250.method4353(local15, local18);
		}
		if (local21 == 25 && Static278.aClass146_51 == null) {
			Static260.method4482(local18, local15);
			Static278.aClass146_51 = Static70.method1717(local18, local15);
			Static166.method3295(Static278.aClass146_51);
		}
		if (local21 == 9) {
			Static244.anInt4754 = Static272.anInt5167;
			Static349.anInt6630 = Static321.anInt6195;
			Static327.anInt6304 = 2;
			Static27.anInt614 = 0;
			Static164.aClass14_Sub4_Sub2_3.method2557(78);
			Static164.aClass14_Sub4_Sub2_3.method2524(local15 + Static151.anInt3234);
			Static164.aClass14_Sub4_Sub2_3.method2543(Static345.aBooleanArray30[82] ? 1 : 0);
			Static164.aClass14_Sub4_Sub2_3.method2537(Static88.anInt2109);
			Static164.aClass14_Sub4_Sub2_3.method2494(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static164.aClass14_Sub4_Sub2_3.method2535(local18 + Static251.anInt3170);
			Static164.aClass14_Sub4_Sub2_3.method2509(Static188.anInt3867);
			Static171.method3334(local34, local15, local18);
		}
		if (Static312.anInt6025 != 0) {
			Static312.anInt6025 = 0;
			Static166.method3295(Static273.method4632(Static247.anInt4790));
		}
		if (Static184.aBoolean241) {
			Static164.method3270();
		}
		if (Static72.aClass146_17 != null && Static38.anInt911 == 0) {
			Static166.method3295(Static72.aClass146_17);
		}
	}
}
