import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public static int anInt2584;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!ec;")
	private static Class22 aClass22_757 = Static60.method1113("glow3:");

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_753 = aClass22_757;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
	public static int[] anIntArray283 = new int[32];

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_754 = aClass22_757;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_755 = Static60.method1113("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!r", name = "q", descriptor = "[Lclient!vf;")
	public static Class79[] aClass79Array1 = new Class79[16];

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_756 = Static60.method1113("Nehmen");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLclient!f;)Z")
	public static boolean method1667(@OriginalArg(1) Class4_Sub7 arg0) {
		if (Static123.aBoolean278) {
			if (Static124.method1890(arg0) != 0) {
				return false;
			}
			if (arg0.anInt743 == 0) {
				return false;
			}
		}
		return arg0.aBoolean71;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1668() {
		@Pc(7) boolean local7 = true;
		method1670(false);
		Static32.anInt819 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static119.aByteArrayArray8.length; local14++) {
			if (Static99.anIntArray284[local14] != -1 && Static119.aByteArrayArray8[local14] == null) {
				Static119.aByteArrayArray8[local14] = Static112.aClass20_Sub1_70.method597(Static99.anIntArray284[local14], 0);
				if (Static119.aByteArrayArray8[local14] == null) {
					Static32.anInt819++;
					local7 = false;
				}
			}
			if (Static61.anIntArray176[local14] != -1 && Static23.aByteArrayArray1[local14] == null) {
				Static23.aByteArrayArray1[local14] = Static112.aClass20_Sub1_70.method611(Static61.anIntArray176[local14], Static52.anIntArrayArray13[local14], 0);
				if (Static23.aByteArrayArray1[local14] == null) {
					local7 = false;
					Static32.anInt819++;
				}
			}
		}
		if (!local7) {
			Static99.anInt2586 = 1;
			return;
		}
		Static129.anInt3052 = 0;
		local7 = true;
		@Pc(115) int local115;
		@Pc(126) int local126;
		for (@Pc(97) int local97 = 0; local97 < Static119.aByteArrayArray8.length; local97++) {
			@Pc(103) byte[] local103 = Static23.aByteArrayArray1[local97];
			if (local103 != null) {
				local115 = (Static34.anIntArray94[local97] >> 8) * 64 - Static59.anInt1769;
				local126 = (Static34.anIntArray94[local97] & 0xFF) * 64 - anInt2584;
				if (Static48.aBoolean122) {
					local115 = 10;
					local126 = 10;
				}
				local7 &= Static12.method169(local115, local103, local126);
			}
		}
		if (!local7) {
			Static99.anInt2586 = 2;
			return;
		}
		if (Static99.anInt2586 != 0) {
			Static12.method165(Static44.method856(new Class22[] { Static42.aClass22_252, Static91.aClass22_703 }), true);
		}
		Static104.method1724();
		Static84.method1494();
		Static104.method1724();
		Static134.aClass77_1.method1943();
		Static104.method1724();
		System.gc();
		for (@Pc(187) int local187 = 0; local187 < 4; local187++) {
			Static87.aClass60Array1[local187].method1658();
		}
		@Pc(208) int local208;
		for (local115 = 0; local115 < 4; local115++) {
			for (local126 = 0; local126 < 104; local126++) {
				for (local208 = 0; local208 < 104; local208++) {
					Static3.aByteArrayArrayArray1[local115][local126][local208] = 0;
				}
			}
		}
		Static104.method1724();
		Static65.method1152();
		local126 = Static119.aByteArrayArray8.length;
		Static29.method492();
		method1670(true);
		@Pc(278) int local278;
		@Pc(263) int local263;
		@Pc(381) int local381;
		@Pc(326) int local326;
		@Pc(371) int local371;
		if (!Static48.aBoolean122) {
			@Pc(267) byte[] local267;
			for (local208 = 0; local208 < local126; local208++) {
				local263 = (Static34.anIntArray94[local208] & 0xFF) * 64 - anInt2584;
				local267 = Static119.aByteArrayArray8[local208];
				local278 = (Static34.anIntArray94[local208] >> 8) * 64 - Static59.anInt1769;
				if (local267 != null) {
					Static104.method1724();
					Static89.method1568(local267, (Static119.anInt2900 - 6) * 8, local263, Static51.anInt1473 * 8 - 48, Static87.aClass60Array1, local278);
				}
			}
			for (local278 = 0; local278 < local126; local278++) {
				local263 = (Static34.anIntArray94[local278] >> 8) * 64 - Static59.anInt1769;
				local326 = (Static34.anIntArray94[local278] & 0xFF) * 64 - anInt2584;
				@Pc(330) byte[] local330 = Static119.aByteArrayArray8[local278];
				if (local330 == null && Static119.anInt2900 < 800) {
					Static104.method1724();
					Static65.method1150(local326, local263, 64, 64);
				}
			}
			method1670(true);
			for (local263 = 0; local263 < local126; local263++) {
				local267 = Static23.aByteArrayArray1[local263];
				if (local267 != null) {
					local371 = (Static34.anIntArray94[local263] >> 8) * 64 - Static59.anInt1769;
					local381 = (Static34.anIntArray94[local263] & 0xFF) * 64 - anInt2584;
					Static104.method1724();
					Static66.method1159(local371, Static134.aClass77_1, local267, Static87.aClass60Array1, local381);
				}
			}
		}
		@Pc(439) int local439;
		@Pc(445) int local445;
		if (Static48.aBoolean122) {
			@Pc(451) int local451;
			@Pc(461) int local461;
			@Pc(463) int local463;
			for (local208 = 0; local208 < 4; local208++) {
				Static104.method1724();
				for (local278 = 0; local278 < 13; local278++) {
					for (local263 = 0; local263 < 13; local263++) {
						@Pc(416) boolean local416 = false;
						local371 = Static28.anIntArrayArrayArray1[local208][local278][local263];
						if (local371 != -1) {
							local381 = local371 >> 24 & 0x3;
							local439 = local371 >> 1 & 0x3;
							local445 = local371 >> 14 & 0x3FF;
							local451 = local371 >> 3 & 0x7FF;
							local461 = local451 / 8 + (local445 / 8 << 8);
							for (local463 = 0; local463 < Static34.anIntArray94.length; local463++) {
								if (Static34.anIntArray94[local463] == local461 && Static119.aByteArrayArray8[local463] != null) {
									local416 = true;
									Static41.method756((local445 & 0x7) * 8, local263 * 8, local278 * 8, (local451 & 0x7) * 8, local381, Static87.aClass60Array1, Static119.aByteArrayArray8[local463], local439, local208);
									break;
								}
							}
						}
						if (!local416) {
							Static49.method923(local278 * 8, local263 * 8, local208);
						}
					}
				}
			}
			for (local278 = 0; local278 < 13; local278++) {
				for (local263 = 0; local263 < 13; local263++) {
					local326 = Static28.anIntArrayArrayArray1[0][local278][local263];
					if (local326 == -1) {
						Static65.method1150(local263 * 8, local278 * 8, 8, 8);
					}
				}
			}
			method1670(true);
			for (local263 = 0; local263 < 4; local263++) {
				Static104.method1724();
				for (local326 = 0; local326 < 13; local326++) {
					for (local371 = 0; local371 < 13; local371++) {
						local381 = Static28.anIntArrayArrayArray1[local263][local326][local371];
						if (local381 != -1) {
							local439 = local381 >> 24 & 0x3;
							local445 = local381 >> 1 & 0x3;
							local451 = local381 >> 14 & 0x3FF;
							local461 = local381 >> 3 & 0x7FF;
							local463 = local461 / 8 + (local451 / 8 << 8);
							for (@Pc(640) int local640 = 0; local640 < Static34.anIntArray94.length; local640++) {
								if (Static34.anIntArray94[local640] == local463 && Static23.aByteArrayArray1[local640] != null) {
									Static133.method2038(local263, Static23.aByteArrayArray1[local640], local439, (local461 & 0x7) * 8, local371 * 8, local326 * 8, Static134.aClass77_1, local445, Static87.aClass60Array1, (local451 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		method1670(true);
		Static84.method1494();
		Static104.method1724();
		Static54.method1021(Static87.aClass60Array1, Static134.aClass77_1);
		method1670(true);
		local208 = Static128.anInt3046;
		if (Static37.anInt895 < local208) {
			local208 = Static37.anInt895;
		}
		if (local208 < Static37.anInt895 - 1) {
		}
		if (Static130.aBoolean279) {
			Static134.aClass77_1.method1946(Static128.anInt3046);
		} else {
			Static134.aClass77_1.method1946(0);
		}
		for (local278 = 0; local278 < 104; local278++) {
			for (local263 = 0; local263 < 104; local263++) {
				Static132.method2019(local263, local278);
			}
		}
		Static104.method1724();
		Static115.method1826();
		Static96.aClass33_28.method1003();
		if (Static9.aFrame1 != null) {
			Static38.aClass4_Sub11_Sub1_1.method752(153);
			Static38.aClass4_Sub11_Sub1_1.method717(1057001181);
		}
		if (!Static48.aBoolean122) {
			local326 = (Static51.anInt1473 + 6) / 8;
			local381 = (Static119.anInt2900 + 6) / 8;
			local263 = (Static51.anInt1473 - 6) / 8;
			local371 = (Static119.anInt2900 - 6) / 8;
			for (local439 = local263 - 1; local439 <= local326 + 1; local439++) {
				for (local445 = local371 - 1; local445 <= local381 + 1; local445++) {
					if (local439 < local263 || local439 > local326 || local445 < local371 || local381 < local445) {
						Static112.aClass20_Sub1_70.method603(Static44.method856(new Class22[] { Static31.aClass22_202, Static134.method2042(local439), Static15.aClass22_122, Static134.method2042(local445) }));
						Static112.aClass20_Sub1_70.method603(Static44.method856(new Class22[] { Static95.aClass22_541, Static134.method2042(local439), Static15.aClass22_122, Static134.method2042(local445) }));
					}
				}
			}
		}
		Static46.method888(30);
		Static104.method1724();
		Static97.method1662();
		Static38.aClass4_Sub11_Sub1_1.method752(39);
		Static94.method1628();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public static void method1669() {
		aClass22_755 = null;
		aClass22_753 = null;
		aClass22_754 = null;
		aClass79Array1 = null;
		aClass22_756 = null;
		anIntArray283 = null;
		aClass22_757 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZB)V")
	private static void method1670(@OriginalArg(0) boolean arg0) {
		Static104.method1724();
		Static57.anInt1750++;
		if (Static57.anInt1750 < 50 && !arg0) {
			return;
		}
		Static57.anInt1750 = 0;
		if (Static68.aBoolean48 || Static120.aClass6_4 == null) {
			return;
		}
		Static38.aClass4_Sub11_Sub1_1.method752(232);
		try {
			Static120.aClass6_4.method133(Static38.aClass4_Sub11_Sub1_1.aByteArray9, Static38.aClass4_Sub11_Sub1_1.anInt1099);
			Static38.aClass4_Sub11_Sub1_1.anInt1099 = 0;
		} catch (@Pc(45) IOException local45) {
			Static68.aBoolean48 = true;
		}
	}
}
