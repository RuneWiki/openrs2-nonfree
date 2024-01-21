import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "jb", descriptor = "Lclient!of;")
	public static Class1_Sub21 aClass1_Sub21_2;

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
	public static int anInt3166 = 0;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1503 = Static187.method3089("Cabbage");

	@OriginalMember(owner = "client!ai", name = "sb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1509 = Static187.method3089("glow2:");

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1504 = aClass92_1509;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1505 = Static187.method3089("Schlie-8en");

	@OriginalMember(owner = "client!ai", name = "ib", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1506 = Static187.method3089("(U0a )2 via: ");

	@OriginalMember(owner = "client!ai", name = "kb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1507 = aClass92_1509;

	@OriginalMember(owner = "client!ai", name = "mb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1508 = Static187.method3089("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ai", name = "rb", descriptor = "[I")
	public static final int[] anIntArray282 = new int[4000];

	@OriginalMember(owner = "client!ai", name = "tb", descriptor = "I")
	public static int anInt3178 = -1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)V")
	public static void method2341(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static24.method463(arg0)) {
			return;
		}
		@Pc(26) Class11[] local26 = Static194.aClass11ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Class11 local34 = local26[local28];
			if (local34.anObjectArray26 != null) {
				@Pc(41) Class1_Sub24 local41 = new Class1_Sub24();
				local41.anObjectArray28 = local34.anObjectArray26;
				local41.aClass11_18 = local34;
				Static27.method497(2000000, local41);
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Lclient!ba;")
	public static Class11 method2342(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = arg0 & 0xFFFF;
		@Pc(12) int local12 = arg0 >> 16;
		if (Static194.aClass11ArrayArray1[local12] == null || Static194.aClass11ArrayArray1[local12][local8] == null) {
			@Pc(30) boolean local30 = Static24.method463(local12);
			if (!local30) {
				return null;
			}
		}
		return Static194.aClass11ArrayArray1[local12][local8];
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZB)V")
	public static void method2343(@OriginalArg(0) boolean arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static153.anInt3186; local9++) {
			@Pc(17) Class8_Sub3_Sub2 local17 = Static177.aClass8_Sub3_Sub2Array1[Static103.anIntArray167[local9]];
			@Pc(26) long local26 = (long) Static103.anIntArray167[local9] << 32 | 0x20000000L;
			if (local17 != null && local17.method2681() && arg0 == local17.aClass1_Sub3_Sub13_1.aBoolean132 && local17.aClass1_Sub3_Sub13_1.method1582()) {
				@Pc(55) int local55 = local17.anInt3600 >> 7;
				@Pc(60) int local60 = local17.anInt3606 >> 7;
				if (local55 >= 0 && local55 < 104 && local60 >= 0 && local60 < 104) {
					if (local17.anInt3583 == 1 && (local17.anInt3600 & 0x7F) == 64 && (local17.anInt3606 & 0x7F) == 64) {
						if (Static201.anIntArrayArray32[local55][local60] == Static202.anInt4411) {
							continue;
						}
						Static201.anIntArrayArray32[local55][local60] = Static202.anInt4411;
					}
					if (!local17.aClass1_Sub3_Sub13_1.aBoolean131) {
						local26 |= Long.MIN_VALUE;
					}
					local17.anInt3563 = Static64.method1027(local17.anInt3606 + (local17.anInt3583 - 1) * 64, local17.anInt3600 + (local17.anInt3583 - 1) * 64, Static192.anInt4180);
					Static5.method99(Static192.anInt4180, local17.anInt3600, local17.anInt3606, local17.anInt3563, (local17.anInt3583 - 1) * 64 + 60, local17, local17.anInt3611, local26, local17.aBoolean200);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([BI)V")
	public static void method2345(@OriginalArg(0) byte[] arg0) {
		@Pc(3) int local3 = 0;
		while (true) {
			while (local3 < arg0.length) {
				@Pc(24) int local24 = arg0[local3++] * 64 - Static150.anInt3065;
				@Pc(33) int local33 = arg0[local3++] * 64 - Static52.anInt1305;
				@Pc(57) int local57;
				@Pc(61) int local61;
				if (local24 > 0 && local33 > 0 && Static90.anInt1950 > local24 + 64 && local33 + 64 < Static35.anInt988) {
					local57 = local24 >> 6;
					local61 = Static35.anInt988 - local33 - 1 >> 6;
					for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
						for (@Pc(128) int local128 = -64; local128 < 0; local128++) {
							@Pc(135) byte local135 = arg0[local3++];
							if (local135 != 0) {
								@Pc(147) byte local147;
								if ((local135 & 0x1) == 1) {
									local147 = arg0[local3++];
									if (Static180.aByteArrayArrayArray52[local57][local61] == null) {
										Static180.aByteArrayArrayArray52[local57][local61] = new byte[4096];
									}
									Static180.aByteArrayArrayArray52[local57][local61][local124 + (-(local128 + 1) << 6)] = (byte) local147;
								}
								if ((local135 & 0x2) == 2) {
									local147 = arg0[local3++];
									if (Static62.aByteArrayArrayArray15[local57][local61] == null) {
										Static62.aByteArrayArrayArray15[local57][local61] = new byte[4096];
									}
									Static62.aByteArrayArrayArray15[local57][local61][local124 + (-(local128 + 1) << 6)] = (byte) (local147 - 28);
								}
								if ((local135 & 0x4) == 4) {
									local3 += 3;
									@Pc(255) int local255 = ((arg0[local3 - 3] & 0xFF) << 16) + ((arg0[local3 - 2] & 0xFF) << 8) + (arg0[local3 + -1] & 0xFF);
									if (Static104.anIntArrayArrayArray4[local57][local61] == null) {
										Static104.anIntArrayArrayArray4[local57][local61] = new int[4096];
									}
									local255--;
									@Pc(273) Class1_Sub3_Sub5 local273 = Static154.method2362(local255);
									if (local273.anIntArray116 != null) {
										local273 = local273.method959();
										if (local273 == null || local273.anInt1412 == -1) {
											continue;
										}
									}
									Static104.anIntArrayArrayArray4[local57][local61][(-(local128 + 1) << 6) + local124] = local273.anInt1389 + 1;
									@Pc(310) Class1_Sub15 local310 = new Class1_Sub15();
									local310.anInt2225 = local24;
									local310.anInt2226 = local273.anInt1412;
									local310.anInt2224 = Static35.anInt988 - local33;
									Static64.aClass20_4.method466(local310);
								}
							}
						}
					}
				} else {
					for (local57 = 0; local57 < 64; local57++) {
						for (local61 = -64; local61 < 0; local61++) {
							@Pc(68) byte local68 = arg0[local3++];
							if (local68 != 0) {
								if ((local68 & 0x1) == 1) {
									local3++;
								}
								if ((local68 & 0x2) == 2) {
									local3++;
								}
								if ((local68 & 0x4) == 4) {
									local3 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
	public static void method2347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass85_1 = null;
		}
	}
}
