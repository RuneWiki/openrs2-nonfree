import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public static int anInt2047;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_452 = Static199.method3560(")1j");

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_453 = Static199.method3560(")3)3)3");

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public static int anInt2053 = -1;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public static int anInt2055 = -1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!hh;I)I")
	public static int method1619(@OriginalArg(0) Class5_Sub2_Sub2 arg0) {
		@Pc(2) int local2 = arg0.anInt1887;
		if (arg0.anInt1878 == arg0.anInt1879) {
			local2 = arg0.anInt1899;
		} else if (arg0.anInt1878 == arg0.anInt1824) {
			local2 = arg0.anInt1906;
		}
		return local2;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!qe;IB)V")
	public static void method1621(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		@Pc(7) Class78 local7 = arg0.method3025().method3048();
		for (@Pc(13) int local13 = 0; local13 < Static180.anInt4193; local13++) {
			@Pc(20) Class5_Sub2_Sub2 local20 = Static213.aClass5_Sub2_Sub2Array3[Static16.anIntArray792[local13]];
			if (local20 != null && local20.aClass78_423 != null && local20.aClass78_423.method3038(local7)) {
				Static107.method1849(2, 0, local20.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local20.anIntArray334[0], 1);
				local1 = true;
				if (arg1 == 1) {
					Static161.aClass2_Sub23_Sub1_5.method2155(127);
					Static161.aClass2_Sub23_Sub1_5.method2119(Static16.anIntArray792[local13]);
				} else if (arg1 == 4) {
					Static161.aClass2_Sub23_Sub1_5.method2155(239);
					Static161.aClass2_Sub23_Sub1_5.method2117(Static16.anIntArray792[local13]);
				} else if (arg1 == 6) {
					Static161.aClass2_Sub23_Sub1_5.method2155(10);
					Static161.aClass2_Sub23_Sub1_5.method2119(Static16.anIntArray792[local13]);
				} else if (arg1 == 7) {
					Static161.aClass2_Sub23_Sub1_5.method2155(148);
					Static161.aClass2_Sub23_Sub1_5.method2090(Static16.anIntArray792[local13]);
				}
				break;
			}
		}
		if (!local1) {
			Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { Static102.aClass78_492, local7 }), 0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!oe;BIIZ)V")
	public static void method1622(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2) {
		Static81.anInt1743 = arg2;
		Static41.aClass72_52 = arg1;
		Static170.anInt3939 = 10000;
		Static126.anInt2869 = 0;
		Static9.anInt274 = 1;
		Static129.anInt2911 = arg0;
		Static142.aBoolean143 = false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z")
	public static boolean method1624() throws IOException {
		if (Static202.aClass105_4 == null) {
			return false;
		}
		@Pc(13) int local13 = Static202.aClass105_4.method3690();
		if (local13 == 0) {
			return false;
		}
		if (Static181.anInt4200 == -1) {
			local13--;
			Static202.aClass105_4.method3694(1, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
			Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
			Static181.anInt4200 = Static139.aClass2_Sub23_Sub1_4.method2152();
			Static145.anInt3288 = Static118.anIntArray455[Static181.anInt4200];
		}
		if (Static145.anInt3288 == -1) {
			if (local13 <= 0) {
				return false;
			}
			local13--;
			Static202.aClass105_4.method3694(1, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
			Static145.anInt3288 = Static139.aClass2_Sub23_Sub1_4.aByteArray41[0] & 0xFF;
		}
		if (Static145.anInt3288 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static202.aClass105_4.method3694(2, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
			Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
			local13 -= 2;
			Static145.anInt3288 = Static139.aClass2_Sub23_Sub1_4.method2095();
		}
		if (Static145.anInt3288 > local13) {
			return false;
		}
		Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
		Static202.aClass105_4.method3694(Static145.anInt3288, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
		Static216.anInt4727 = 0;
		Static21.anInt401 = Static189.anInt4412;
		Static189.anInt4412 = Static200.anInt4496;
		Static200.anInt4496 = Static181.anInt4200;
		@Pc(131) int local131;
		if (Static181.anInt4200 == 155) {
			Static72.anInt4686 = Static145.anInt3288 / 8;
			for (local131 = 0; local131 < Static72.anInt4686; local131++) {
				Static100.aLongArray6[local131] = Static139.aClass2_Sub23_Sub1_4.method2123();
				Static15.aClass78Array1[local131] = Static103.method1785(Static100.aLongArray6[local131]);
			}
			Static140.anInt3198 = Static133.anInt3087;
			Static181.anInt4200 = -1;
			return true;
		} else if (Static181.anInt4200 == 220) {
			Static2.anInt44 = Static139.aClass2_Sub23_Sub1_4.method2136() * 30;
			Static155.anInt3569 = Static133.anInt3087;
			Static181.anInt4200 = -1;
			return true;
		} else {
			@Pc(181) long local181;
			@Pc(189) int local189;
			@Pc(221) int local221;
			@Pc(185) int local185;
			@Pc(191) boolean local191;
			@Pc(205) Class78 local205;
			@Pc(344) int local344;
			@Pc(351) int local351;
			@Pc(219) Class78 local219;
			@Pc(387) int local387;
			@Pc(405) Class78 local405;
			@Pc(423) Class78 local423;
			if (Static181.anInt4200 == 169) {
				local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
				local185 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local189 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local191 = true;
				if (local181 < 0L) {
					local191 = false;
					local181 &= Long.MAX_VALUE;
				}
				local205 = Static73.aClass78_352;
				if (local185 > 0) {
					local205 = Static139.aClass2_Sub23_Sub1_4.method2115();
				}
				local219 = Static103.method1785(local181).method3048();
				for (local221 = 0; local221 < Static140.anInt3196; local221++) {
					if (local181 == Static200.aLongArray12[local221]) {
						if (Static87.anIntArray347[local221] != local185) {
							Static87.anIntArray347[local221] = local185;
							if (local185 > 0) {
								Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { local219, Static120.aClass78_563 }), 5);
							}
							if (local185 == 0) {
								Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { local219, Static55.aClass78_186 }), 5);
							}
						}
						Static193.aClass78Array34[local221] = local205;
						Static125.anIntArray278[local221] = local189;
						Static43.aBooleanArray25[local221] = local191;
						local219 = null;
						break;
					}
				}
				if (local219 != null && Static140.anInt3196 < 200) {
					Static200.aLongArray12[Static140.anInt3196] = local181;
					Static159.aClass78Array31[Static140.anInt3196] = local219;
					Static87.anIntArray347[Static140.anInt3196] = local185;
					Static193.aClass78Array34[Static140.anInt3196] = local205;
					Static125.anIntArray278[Static140.anInt3196] = local189;
					Static43.aBooleanArray25[Static140.anInt3196] = local191;
					Static140.anInt3196++;
				}
				Static140.anInt3198 = Static133.anInt3087;
				local344 = Static140.anInt3196;
				while (local344 > 0) {
					@Pc(348) boolean local348 = true;
					local344--;
					for (local351 = 0; local351 < local344; local351++) {
						if (Static77.anInt1691 != Static87.anIntArray347[local351] && Static87.anIntArray347[local351 + 1] == Static77.anInt1691 || Static87.anIntArray347[local351] == 0 && Static87.anIntArray347[local351 + 1] != 0) {
							local348 = false;
							local387 = Static87.anIntArray347[local351];
							Static87.anIntArray347[local351] = Static87.anIntArray347[local351 + 1];
							Static87.anIntArray347[local351 + 1] = local387;
							local405 = Static193.aClass78Array34[local351];
							Static193.aClass78Array34[local351] = Static193.aClass78Array34[local351 + 1];
							Static193.aClass78Array34[local351 + 1] = local405;
							local423 = Static159.aClass78Array31[local351];
							Static159.aClass78Array31[local351] = Static159.aClass78Array31[local351 + 1];
							Static159.aClass78Array31[local351 + 1] = local423;
							@Pc(441) long local441 = Static200.aLongArray12[local351];
							Static200.aLongArray12[local351] = Static200.aLongArray12[local351 + 1];
							Static200.aLongArray12[local351 + 1] = local441;
							@Pc(459) int local459 = Static125.anIntArray278[local351];
							Static125.anIntArray278[local351] = Static125.anIntArray278[local351 + 1];
							Static125.anIntArray278[local351 + 1] = local459;
							@Pc(477) boolean local477 = Static43.aBooleanArray25[local351];
							Static43.aBooleanArray25[local351] = Static43.aBooleanArray25[local351 + 1];
							Static43.aBooleanArray25[local351 + 1] = local477;
						}
					}
					if (local348) {
						break;
					}
				}
				Static181.anInt4200 = -1;
				return true;
			}
			@Pc(517) Class78 local517;
			if (Static181.anInt4200 == 16) {
				local517 = Static139.aClass2_Sub23_Sub1_4.method2115();
				@Pc(524) Object[] local524 = new Object[local517.method3041() + 1];
				for (local185 = local517.method3041() - 1; local185 >= 0; local185--) {
					if (local517.method3042(local185) == 115) {
						local524[local185 + 1] = Static139.aClass2_Sub23_Sub1_4.method2115();
					} else {
						local524[local185 + 1] = Integer.valueOf(Static139.aClass2_Sub23_Sub1_4.method2133());
					}
				}
				local524[0] = Integer.valueOf(Static139.aClass2_Sub23_Sub1_4.method2133());
				@Pc(578) Class2_Sub1 local578 = new Class2_Sub1();
				local578.anObjectArray1 = local524;
				Static50.method649(local578);
				Static181.anInt4200 = -1;
				return true;
			}
			@Pc(601) int local601;
			@Pc(614) Class64 local614;
			if (Static181.anInt4200 == 134) {
				local131 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local601 = Static139.aClass2_Sub23_Sub1_4.method2129();
				if (local131 == 65535) {
					local131 = -1;
				}
				local185 = Static139.aClass2_Sub23_Sub1_4.method2131();
				local614 = Static204.method3618(local185);
				@Pc(627) Class2_Sub3_Sub23 local627;
				if (local614.aBoolean132) {
					local614.anInt3033 = local601;
					local614.anInt3029 = local131;
					local627 = Static32.method3209(local131);
					local614.anInt3028 = local627.anInt3492;
					local614.anInt3062 = local627.anInt3511;
					local614.anInt3012 = local627.anInt3518;
					local614.anInt3015 = local627.anInt3494;
					local614.anInt2994 = local627.anInt3483;
					if (local614.anInt3013 > 0) {
						local614.anInt3012 = local614.anInt3012 * 32 / local614.anInt3013;
					} else if (local614.anInt3018 > 0) {
						local614.anInt3012 = local614.anInt3012 * 32 / local614.anInt3018;
					}
					local614.anInt3017 = local627.anInt3514;
					Static70.method2259(local614);
				} else if (local131 == -1) {
					local614.anInt3024 = 0;
					Static181.anInt4200 = -1;
					return true;
				} else {
					local627 = Static32.method3209(local131);
					local614.anInt3028 = local627.anInt3492;
					local614.anInt3024 = 4;
					local614.anInt2994 = local627.anInt3483;
					local614.anInt3067 = local131;
					local614.anInt3012 = local627.anInt3518 * 100 / local601;
					Static70.method2259(local614);
				}
				Static181.anInt4200 = -1;
				return true;
			}
			@Pc(745) Class78 local745;
			if (Static181.anInt4200 == 163) {
				local131 = Static139.aClass2_Sub23_Sub1_4.method2130();
				local601 = Static139.aClass2_Sub23_Sub1_4.method2136();
				local745 = Static139.aClass2_Sub23_Sub1_4.method2115();
				Static216.method3746(local601);
				Static17.method261(local131, local745);
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 247) {
				Static99.anInt2152 = Static139.aClass2_Sub23_Sub1_4.method2122();
				Static181.anInt4200 = -1;
				Static140.anInt3198 = Static133.anInt3087;
				return true;
			} else if (Static181.anInt4200 == 42 || Static181.anInt4200 == 43 || Static181.anInt4200 == 21 || Static181.anInt4200 == 62 || Static181.anInt4200 == 118 || Static181.anInt4200 == 154 || Static181.anInt4200 == 160 || Static181.anInt4200 == 193 || Static181.anInt4200 == 0 || Static181.anInt4200 == 187 || Static181.anInt4200 == 44 || Static181.anInt4200 == 153) {
				Static182.method3334();
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 82) {
				Static100.anInt2191 = Static139.aClass2_Sub23_Sub1_4.method2126();
				Static49.anInt896 = Static139.aClass2_Sub23_Sub1_4.method2142();
				while (Static139.aClass2_Sub23_Sub1_4.anInt2703 < Static145.anInt3288) {
					Static181.anInt4200 = Static139.aClass2_Sub23_Sub1_4.method2122();
					Static182.method3334();
				}
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 58) {
				if (Static145.anInt3288 == 0) {
					Static85.aClass78_427 = Static97.aClass78_468;
				} else {
					Static85.aClass78_427 = Static139.aClass2_Sub23_Sub1_4.method2115();
				}
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 137) {
				Static8.anInt268 = 0;
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 142) {
				local131 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local601 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local185 = Static139.aClass2_Sub23_Sub1_4.method2136();
				@Pc(906) Class5_Sub2_Sub1 local906 = Static95.aClass5_Sub2_Sub1Array1[local131];
				if (local906 != null) {
					Static79.method1336(local601, local906, local185);
				}
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 65) {
				local131 = Static139.aClass2_Sub23_Sub1_4.method2130();
				local601 = Static139.aClass2_Sub23_Sub1_4.method2129();
				Static212.method3689(local131, local601);
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 117) {
				@Pc(946) byte[] local946 = new byte[Static145.anInt3288];
				Static139.aClass2_Sub23_Sub1_4.method2153(Static145.anInt3288, local946);
				Static89.method1575(true, Static48.method629(Static145.anInt3288, 0, local946));
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 195) {
				Static212.method3696();
				Static10.anInt306 = Static139.aClass2_Sub23_Sub1_4.method2104();
				Static155.anInt3569 = Static133.anInt3087;
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 107) {
				local131 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local601 = local131 >> 6;
				@Pc(996) Class19 local996 = new Class19();
				local996.anInt504 = local131 & 0x3F;
				local996.anInt495 = Static139.aClass2_Sub23_Sub1_4.method2122();
				if (local996.anInt495 >= 0 && local996.anInt495 < Static161.aClass2_Sub3_Sub8Array8.length) {
					if (local996.anInt504 == 1 || local996.anInt504 == 10) {
						local996.anInt496 = Static139.aClass2_Sub23_Sub1_4.method2095();
						Static139.aClass2_Sub23_Sub1_4.anInt2703 += 3;
					} else if (local996.anInt504 >= 2 && local996.anInt504 <= 6) {
						if (local996.anInt504 == 2) {
							local996.anInt493 = 64;
							local996.anInt506 = 64;
						}
						if (local996.anInt504 == 3) {
							local996.anInt493 = 0;
							local996.anInt506 = 64;
						}
						if (local996.anInt504 == 4) {
							local996.anInt493 = 128;
							local996.anInt506 = 64;
						}
						if (local996.anInt504 == 5) {
							local996.anInt493 = 64;
							local996.anInt506 = 0;
						}
						if (local996.anInt504 == 6) {
							local996.anInt493 = 64;
							local996.anInt506 = 128;
						}
						local996.anInt504 = 2;
						local996.anInt500 = Static139.aClass2_Sub23_Sub1_4.method2095();
						local996.anInt498 = Static139.aClass2_Sub23_Sub1_4.method2095();
						local996.anInt505 = Static139.aClass2_Sub23_Sub1_4.method2122();
					}
					local996.anInt507 = Static139.aClass2_Sub23_Sub1_4.method2095();
					if (local996.anInt507 == 65535) {
						local996.anInt507 = -1;
					}
					Static216.aClass19Array1[local601] = local996;
				}
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 218) {
				local131 = Static139.aClass2_Sub23_Sub1_4.method2092();
				local601 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local185 = Static139.aClass2_Sub23_Sub1_4.method2129();
				Static216.method3746(local131);
				Static113.method1935(local185, local601);
				Static181.anInt4200 = -1;
				return true;
			} else if (Static181.anInt4200 == 224) {
				Static100.anInt2191 = Static139.aClass2_Sub23_Sub1_4.method2142();
				Static49.anInt896 = Static139.aClass2_Sub23_Sub1_4.method2107();
				Static181.anInt4200 = -1;
				return true;
			} else {
				@Pc(1216) int local1216;
				if (Static181.anInt4200 == 3) {
					local131 = Static139.aClass2_Sub23_Sub1_4.method2122();
					local601 = Static139.aClass2_Sub23_Sub1_4.method2122();
					local185 = Static139.aClass2_Sub23_Sub1_4.method2122();
					local189 = Static139.aClass2_Sub23_Sub1_4.method2122();
					local1216 = Static139.aClass2_Sub23_Sub1_4.method2095();
					Static87.aBooleanArray61[local131] = true;
					Static34.anIntArray103[local131] = local601;
					Static103.anIntArray391[local131] = local185;
					Static142.anIntArray534[local131] = local189;
					Static160.anIntArray615[local131] = local1216;
					Static181.anInt4200 = -1;
					return true;
				} else if (Static181.anInt4200 == 55) {
					Static183.method3364(Static139.aClass2_Sub23_Sub1_4);
					Static181.anInt4200 = -1;
					return true;
				} else {
					@Pc(1275) long local1275;
					@Pc(1279) int local1279;
					@Pc(1271) Class78 local1271;
					if (Static181.anInt4200 == 204) {
						local517 = Static139.aClass2_Sub23_Sub1_4.method2115();
						if (local517.method3009(Static38.aClass78_130)) {
							local1271 = local517.method3010(0, local517.method3036(Static35.aClass78_110));
							local1275 = local1271.method3016();
							local191 = false;
							for (local1279 = 0; local1279 < Static72.anInt4686; local1279++) {
								if (local1275 == Static100.aLongArray6[local1279]) {
									local191 = true;
									break;
								}
							}
							if (!local191 && Static132.anInt3014 == 0) {
								Static95.method1663(local1271, Static147.aClass78_702, 4);
							}
						} else if (local517.method3009(Static36.aClass78_120)) {
							local1271 = local517.method3010(0, local517.method3036(Static35.aClass78_110));
							local1275 = local1271.method3016();
							local191 = false;
							for (local1279 = 0; local1279 < Static72.anInt4686; local1279++) {
								if (local1275 == Static100.aLongArray6[local1279]) {
									local191 = true;
									break;
								}
							}
							if (!local191 && Static132.anInt3014 == 0) {
								local219 = local517.method3010(local517.method3036(Static35.aClass78_110) + 1, local517.method3041() + -9);
								Static95.method1663(local1271, local219, 8);
							}
						} else if (local517.method3009(Static122.aClass78_391)) {
							local1271 = local517.method3010(0, local517.method3036(Static35.aClass78_110));
							local1275 = local1271.method3016();
							local191 = false;
							for (local1279 = 0; local1279 < Static72.anInt4686; local1279++) {
								if (Static100.aLongArray6[local1279] == local1275) {
									local191 = true;
									break;
								}
							}
							if (!local191 && Static132.anInt3014 == 0) {
								Static95.method1663(local1271, Static73.aClass78_352, 10);
							}
						} else if (local517.method3009(Static202.aClass78_806)) {
							local1271 = local517.method3010(0, local517.method3036(Static202.aClass78_806));
							Static95.method1663(Static73.aClass78_352, local1271, 11);
						} else if (local517.method3009(Static158.aClass78_647)) {
							local1271 = local517.method3010(0, local517.method3036(Static158.aClass78_647));
							if (Static132.anInt3014 == 0) {
								Static95.method1663(Static73.aClass78_352, local1271, 12);
							}
						} else if (local517.method3009(Static140.aClass78_606)) {
							local1271 = local517.method3010(0, local517.method3036(Static140.aClass78_606));
							if (Static132.anInt3014 == 0) {
								Static95.method1663(Static73.aClass78_352, local1271, 13);
							}
						} else if (local517.method3009(Static122.aClass78_390)) {
							local1271 = local517.method3010(0, local517.method3036(Static35.aClass78_110));
							local1275 = local1271.method3016();
							local191 = false;
							for (local1279 = 0; local1279 < Static72.anInt4686; local1279++) {
								if (local1275 == Static100.aLongArray6[local1279]) {
									local191 = true;
									break;
								}
							}
							if (!local191 && Static132.anInt3014 == 0) {
								Static95.method1663(local1271, Static73.aClass78_352, 14);
							}
						} else if (local517.method3009(Static129.aClass78_580)) {
							local191 = false;
							local1271 = local517.method3010(0, local517.method3036(Static35.aClass78_110));
							local1275 = local1271.method3016();
							for (local1279 = 0; local1279 < Static72.anInt4686; local1279++) {
								if (Static100.aLongArray6[local1279] == local1275) {
									local191 = true;
									break;
								}
							}
							if (!local191 && Static132.anInt3014 == 0) {
								Static95.method1663(local1271, Static73.aClass78_352, 15);
							}
						} else if (local517.method3009(Static196.aClass78_778)) {
							local1271 = local517.method3010(0, local517.method3036(Static35.aClass78_110));
							local1275 = local1271.method3016();
							local191 = false;
							for (local1279 = 0; local1279 < Static72.anInt4686; local1279++) {
								if (Static100.aLongArray6[local1279] == local1275) {
									local191 = true;
									break;
								}
							}
							if (!local191 && Static132.anInt3014 == 0) {
								Static95.method1663(local1271, Static73.aClass78_352, 16);
							}
						} else {
							Static95.method1663(Static73.aClass78_352, local517, 0);
						}
						Static181.anInt4200 = -1;
						return true;
					} else if (Static181.anInt4200 == 157) {
						Static105.method1813();
						Static181.anInt4200 = -1;
						return true;
					} else if (Static181.anInt4200 == 226) {
						for (local131 = 0; local131 < Static213.aClass5_Sub2_Sub2Array3.length; local131++) {
							if (Static213.aClass5_Sub2_Sub2Array3[local131] != null) {
								Static213.aClass5_Sub2_Sub2Array3[local131].anInt1873 = -1;
							}
						}
						for (local601 = 0; local601 < Static95.aClass5_Sub2_Sub1Array1.length; local601++) {
							if (Static95.aClass5_Sub2_Sub1Array1[local601] != null) {
								Static95.aClass5_Sub2_Sub1Array1[local601].anInt1873 = -1;
							}
						}
						Static181.anInt4200 = -1;
						return true;
					} else {
						@Pc(1770) Class64 local1770;
						if (Static181.anInt4200 == 188) {
							local131 = Static139.aClass2_Sub23_Sub1_4.method2129();
							local1770 = Static204.method3618(local131);
							for (local185 = 0; local185 < local1770.anIntArray493.length; local185++) {
								local1770.anIntArray493[local185] = -1;
								local1770.anIntArray493[local185] = 0;
							}
							Static70.method2259(local1770);
							Static181.anInt4200 = -1;
							return true;
						} else if (Static181.anInt4200 == 177) {
							local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
							local601 = Static139.aClass2_Sub23_Sub1_4.method2136();
							Static119.method2207(local601, local131);
							Static181.anInt4200 = -1;
							return true;
						} else if (Static181.anInt4200 == 97) {
							Static212.method3696();
							Static104.anInt2285 = Static139.aClass2_Sub23_Sub1_4.method2122();
							Static155.anInt3569 = Static133.anInt3087;
							Static181.anInt4200 = -1;
							return true;
						} else if (Static181.anInt4200 == 52) {
							local131 = Static139.aClass2_Sub23_Sub1_4.method2095();
							if (local131 == 65535) {
								local131 = -1;
							}
							local601 = Static139.aClass2_Sub23_Sub1_4.method2122();
							local185 = Static139.aClass2_Sub23_Sub1_4.method2095();
							Static39.method531(local601, local185, local131);
							Static181.anInt4200 = -1;
							return true;
						} else if (Static181.anInt4200 == 179) {
							local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
							local601 = Static139.aClass2_Sub23_Sub1_4.method2125();
							local185 = Static139.aClass2_Sub23_Sub1_4.method2087();
							local614 = Static204.method3618(local131);
							local614.aByte15 = 0;
							local614.aByte12 = 0;
							local614.anInt3052 = local614.anInt3036 = local185;
							local614.anInt3004 = local614.anInt3065 = local601;
							Static70.method2259(local614);
							Static181.anInt4200 = -1;
							return true;
						} else if (Static181.anInt4200 == 25) {
							Static137.method2465(Static145.anInt3288, Static133.aClass41_2, Static139.aClass2_Sub23_Sub1_4);
							Static181.anInt4200 = -1;
							return true;
						} else {
							@Pc(1948) Class2_Sub11 local1948;
							if (Static181.anInt4200 == 17) {
								local131 = Static139.aClass2_Sub23_Sub1_4.method2126();
								local601 = Static139.aClass2_Sub23_Sub1_4.method2130();
								local185 = Static139.aClass2_Sub23_Sub1_4.method2131();
								local1948 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local185);
								if (local1948 != null) {
									Static209.method3065(local1948, local1948.anInt726 != local601);
								}
								Static85.method1491(local601, local185, local131);
								Static181.anInt4200 = -1;
								return true;
							} else if (Static181.anInt4200 == 102) {
								local131 = Static139.aClass2_Sub23_Sub1_4.method2095();
								if (local131 == 65535) {
									local131 = -1;
								}
								Static124.method2236(local131);
								Static181.anInt4200 = -1;
								return true;
							} else if (Static181.anInt4200 == 156) {
								local131 = Static139.aClass2_Sub23_Sub1_4.method2138();
								local601 = Static139.aClass2_Sub23_Sub1_4.method2130();
								if (local601 == 65535) {
									local601 = -1;
								}
								Static22.method298(local601, local131);
								Static181.anInt4200 = -1;
								return true;
							} else if (Static181.anInt4200 == 151) {
								local131 = Static139.aClass2_Sub23_Sub1_4.method2092();
								if (local131 == 65535) {
									local131 = -1;
								}
								local601 = Static139.aClass2_Sub23_Sub1_4.method2133();
								local185 = Static139.aClass2_Sub23_Sub1_4.method2092();
								if (local185 == 65535) {
									local185 = -1;
								}
								local189 = Static139.aClass2_Sub23_Sub1_4.method2131();
								for (local1216 = local131; local1216 <= local185; local1216++) {
									@Pc(2066) long local2066 = (long) local1216 + ((long) local601 << 32);
									@Pc(2071) Class2 local2071 = Static108.aClass103_13.method3659(local2066);
									if (local2071 != null) {
										local2071.method3986();
									}
									Static108.aClass103_13.method3665(local2066, new Class2_Sub7(local189));
								}
								Static181.anInt4200 = -1;
								return true;
							} else if (Static181.anInt4200 == 77) {
								Static103.method1783(false);
								Static181.anInt4200 = -1;
								return true;
							} else {
								@Pc(2127) Class64 local2127;
								if (Static181.anInt4200 == 71) {
									local131 = Static139.aClass2_Sub23_Sub1_4.method2095();
									local601 = Static139.aClass2_Sub23_Sub1_4.method2094();
									local2127 = Static204.method3618(local601);
									if (local131 == 65535) {
										local131 = -1;
									}
									if (local2127.anInt3024 != 2 || local131 != local2127.anInt3067) {
										local2127.anInt3067 = local131;
										local2127.anInt3024 = 2;
										Static70.method2259(local2127);
									}
									Static181.anInt4200 = -1;
									return true;
								}
								@Pc(2176) long local2176;
								@Pc(2217) int local2217;
								@Pc(2188) int local2188;
								if (Static181.anInt4200 == 60) {
									local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
									local1275 = Static139.aClass2_Sub23_Sub1_4.method2095();
									local2176 = Static139.aClass2_Sub23_Sub1_4.method2091();
									@Pc(2178) boolean local2178 = false;
									@Pc(2184) long local2184 = (local1275 << 32) + local2176;
									local2188 = Static139.aClass2_Sub23_Sub1_4.method2122();
									local221 = Static139.aClass2_Sub23_Sub1_4.method2095();
									local387 = 0;
									label1126: while (true) {
										if (local387 >= 100) {
											if (local2188 <= 1) {
												for (local2217 = 0; local2217 < Static72.anInt4686; local2217++) {
													if (Static100.aLongArray6[local2217] == local181) {
														local2178 = true;
														break label1126;
													}
												}
											}
											break;
										}
										if (Static155.aLongArray9[local387] == local2184) {
											local2178 = true;
											break;
										}
										local387++;
									}
									if (!local2178 && Static132.anInt3014 == 0) {
										Static155.aLongArray9[Static204.anInt4564] = local2184;
										Static204.anInt4564 = (Static204.anInt4564 + 1) % 100;
										@Pc(2257) Class78 local2257 = Static5.method98(local221).method2920(Static139.aClass2_Sub23_Sub1_4);
										if (local2188 == 2) {
											Static188.method3489(Static94.method1640(new Class78[] { Static8.aClass78_27, Static103.method1785(local181).method3048() }), null, 18, local221, local2257);
										} else if (local2188 == 1) {
											Static188.method3489(Static94.method1640(new Class78[] { Static43.aClass78_147, Static103.method1785(local181).method3048() }), null, 18, local221, local2257);
										} else {
											Static188.method3489(Static103.method1785(local181).method3048(), null, 18, local221, local2257);
										}
									}
									Static181.anInt4200 = -1;
									return true;
								} else if (Static181.anInt4200 == 241) {
									local131 = Static139.aClass2_Sub23_Sub1_4.method2136();
									local601 = Static139.aClass2_Sub23_Sub1_4.method2142();
									if (local601 == 2) {
										Static56.method732();
									}
									Static166.anInt1143 = local131;
									Static148.method2648(local131);
									Static219.method3823();
									Static86.method1522(Static166.anInt1143);
									for (local185 = 0; local185 < 100; local185++) {
										Static165.aBooleanArray111[local185] = true;
									}
									Static181.anInt4200 = -1;
									return true;
								} else if (Static181.anInt4200 == 181) {
									local131 = Static139.aClass2_Sub23_Sub1_4.method2129();
									local601 = Static139.aClass2_Sub23_Sub1_4.method2095();
									local185 = local601 >> 10 & 0x1F;
									local189 = local601 >> 5 & 0x1F;
									local1216 = local601 & 0x1F;
									@Pc(2408) Class64 local2408 = Static204.method3618(local131);
									local1279 = (local185 << 19) + (local189 << 11) + (local1216 << 3);
									if (local2408.anInt3003 != local1279) {
										local2408.anInt3003 = local1279;
										Static70.method2259(local2408);
									}
									Static181.anInt4200 = -1;
									return true;
								} else if (Static181.anInt4200 == 250) {
									local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
									@Pc(2455) Class2_Sub11 local2455 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local131);
									if (local2455 != null) {
										Static209.method3065(local2455, true);
									}
									if (Static119.aClass64_9 != null) {
										Static70.method2259(Static119.aClass64_9);
										Static119.aClass64_9 = null;
									}
									Static181.anInt4200 = -1;
									return true;
								} else {
									@Pc(2535) Class64 local2535;
									if (Static181.anInt4200 == 243) {
										local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
										local601 = Static139.aClass2_Sub23_Sub1_4.method2133();
										@Pc(2494) Class2_Sub11 local2494 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local131);
										local1948 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local601);
										if (local1948 != null) {
											Static209.method3065(local1948, local2494 == null || local1948.anInt726 != local2494.anInt726);
										}
										if (local2494 != null) {
											local2494.method3986();
											Static12.aClass103_4.method3665((long) local601, local2494);
										}
										local2535 = Static204.method3618(local131);
										if (local2535 != null) {
											Static70.method2259(local2535);
										}
										local2535 = Static204.method3618(local601);
										if (local2535 != null) {
											Static70.method2259(local2535);
											Static109.method1892(true, local2535);
										}
										if (Static166.anInt1143 != -1) {
											Static161.method2899(Static166.anInt1143, 1);
										}
										Static181.anInt4200 = -1;
										return true;
									} else if (Static181.anInt4200 == 185) {
										local131 = Static139.aClass2_Sub23_Sub1_4.method2122();
										if (Static139.aClass2_Sub23_Sub1_4.method2122() == 0) {
											Static45.aClass29Array1[local131] = new Class29();
										} else {
											Static139.aClass2_Sub23_Sub1_4.anInt2703--;
											Static45.aClass29Array1[local131] = new Class29(Static139.aClass2_Sub23_Sub1_4);
										}
										Static181.anInt4200 = -1;
										Static170.anInt3943 = Static133.anInt3087;
										return true;
									} else if (Static181.anInt4200 == 100) {
										local131 = Static139.aClass2_Sub23_Sub1_4.method2092();
										local601 = Static139.aClass2_Sub23_Sub1_4.method2092();
										local185 = Static139.aClass2_Sub23_Sub1_4.method2129();
										local189 = Static139.aClass2_Sub23_Sub1_4.method2136();
										if (local185 >> 30 != 0) {
											local1216 = local185 >> 28 & 0x3;
											local1279 = (local185 >> 14 & 0x3FFF) - Static28.anInt497;
											local2188 = (local185 & 0x3FFF) - Static57.anInt628;
											if (local1279 >= 0 && local2188 >= 0 && local1279 < 104 && local2188 < 104) {
												local1279 = local1279 * 128 + 64;
												local2188 = local2188 * 128 + 64;
												@Pc(2704) Class5_Sub5 local2704 = new Class5_Sub5(local189, local1216, local1279, local2188, Static208.method3667(local1279, local1216, local2188) - local131, local601, Static123.anInt2808);
												Static95.aClass44_21.method1355(new Class2_Sub3_Sub5(local2704));
											}
										} else if (local185 >> 29 != 0) {
											local1216 = local185 & 0xFFFF;
											@Pc(2728) Class5_Sub2_Sub1 local2728 = Static95.aClass5_Sub2_Sub1Array1[local1216];
											if (local2728 != null) {
												local2728.anInt1857 = local189;
												local2728.anInt1843 = 0;
												local2728.anInt1874 = 0;
												local2728.anInt1875 = local131;
												local2728.anInt1819 = local601 + Static123.anInt2808;
												if (local2728.anInt1857 == 65535) {
													local2728.anInt1857 = -1;
												}
												if (local2728.anInt1819 > Static123.anInt2808) {
													local2728.anInt1843 = -1;
												}
											}
										} else if (local185 >> 28 != 0) {
											local1216 = local185 & 0xFFFF;
											@Pc(2783) Class5_Sub2_Sub2 local2783;
											if (Static195.anInt4463 == local1216) {
												local2783 = Static31.aClass5_Sub2_Sub2_1;
											} else {
												local2783 = Static213.aClass5_Sub2_Sub2Array3[local1216];
											}
											if (local2783 != null) {
												local2783.anInt1875 = local131;
												local2783.anInt1843 = 0;
												local2783.anInt1874 = 0;
												local2783.anInt1857 = local189;
												local2783.anInt1819 = Static123.anInt2808 + local601;
												if (Static123.anInt2808 < local2783.anInt1819) {
													local2783.anInt1843 = -1;
												}
												if (local2783.anInt1857 == 65535) {
													local2783.anInt1857 = -1;
												}
											}
										}
										Static181.anInt4200 = -1;
										return true;
									} else if (Static181.anInt4200 == 95) {
										local131 = Static139.aClass2_Sub23_Sub1_4.method2130();
										local601 = Static139.aClass2_Sub23_Sub1_4.method2136();
										local185 = Static139.aClass2_Sub23_Sub1_4.method2136();
										local189 = Static139.aClass2_Sub23_Sub1_4.method2133();
										local2535 = Static204.method3618(local189);
										if (local2535.anInt2994 != local185 || local601 != local2535.anInt3028 || local131 != local2535.anInt3012) {
											local2535.anInt3012 = local131;
											local2535.anInt3028 = local601;
											local2535.anInt2994 = local185;
											Static70.method2259(local2535);
										}
										Static181.anInt4200 = -1;
										return true;
									} else if (Static181.anInt4200 == 144) {
										local131 = Static139.aClass2_Sub23_Sub1_4.method2122();
										local1271 = Static139.aClass2_Sub23_Sub1_4.method2115();
										local185 = Static139.aClass2_Sub23_Sub1_4.method2126();
										if (local131 >= 1 && local131 <= 8) {
											if (local1271.method3038(Static100.aClass78_482)) {
												local1271 = null;
											}
											Static80.aClass78Array16[local131 - 1] = local1271;
											Static15.aBooleanArray11[local131 - 1] = local185 == 0;
										}
										Static181.anInt4200 = -1;
										return true;
									} else if (Static181.anInt4200 == 242) {
										local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
										local1275 = Static139.aClass2_Sub23_Sub1_4.method2095();
										local2176 = Static139.aClass2_Sub23_Sub1_4.method2091();
										local2188 = Static139.aClass2_Sub23_Sub1_4.method2122();
										@Pc(2974) long local2974 = (local1275 << 32) + local2176;
										@Pc(2976) boolean local2976 = false;
										local351 = 0;
										label1178: while (true) {
											if (local351 >= 100) {
												if (local2188 <= 1) {
													if (Static214.anInt4672 == 1 || Static143.anInt3257 == 1) {
														local2976 = true;
													} else {
														for (local387 = 0; local387 < Static72.anInt4686; local387++) {
															if (Static100.aLongArray6[local387] == local181) {
																local2976 = true;
																break label1178;
															}
														}
													}
												}
												break;
											}
											if (Static155.aLongArray9[local351] == local2974) {
												local2976 = true;
												break;
											}
											local351++;
										}
										if (!local2976 && Static132.anInt3014 == 0) {
											Static155.aLongArray9[Static204.anInt4564] = local2974;
											Static204.anInt4564 = (Static204.anInt4564 + 1) % 100;
											@Pc(3055) Class78 local3055 = Static135.method894(Static82.method1363(Static139.aClass2_Sub23_Sub1_4).method3035());
											if (local2188 == 2 || local2188 == 3) {
												Static95.method1663(Static94.method1640(new Class78[] { Static8.aClass78_27, Static103.method1785(local181).method3048() }), local3055, 7);
											} else if (local2188 == 1) {
												Static95.method1663(Static94.method1640(new Class78[] { Static43.aClass78_147, Static103.method1785(local181).method3048() }), local3055, 7);
											} else {
												Static95.method1663(Static103.method1785(local181).method3048(), local3055, 3);
											}
										}
										Static181.anInt4200 = -1;
										return true;
									} else if (Static181.anInt4200 == 200) {
										local131 = Static139.aClass2_Sub23_Sub1_4.method2126();
										local601 = Static139.aClass2_Sub23_Sub1_4.method2126();
										local185 = Static139.aClass2_Sub23_Sub1_4.method2107();
										Static137.anInt3136 = local601 >> 1;
										Static31.aClass5_Sub2_Sub2_1.method1483(local131, local185, (local601 & 0x1) == 1);
										Static181.anInt4200 = -1;
										return true;
									} else {
										@Pc(3317) int local3317;
										@Pc(3327) long local3327;
										if (Static181.anInt4200 == 248) {
											local131 = Static139.aClass2_Sub23_Sub1_4.anInt2703 + Static145.anInt3288;
											local601 = Static139.aClass2_Sub23_Sub1_4.method2095();
											local185 = Static139.aClass2_Sub23_Sub1_4.method2095();
											if (local601 != Static166.anInt1143) {
												Static166.anInt1143 = local601;
												Static148.method2648(Static166.anInt1143);
												Static219.method3823();
												Static86.method1522(Static166.anInt1143);
												for (local189 = 0; local189 < 100; local189++) {
													Static165.aBooleanArray111[local189] = true;
												}
											}
											while (local185-- > 0) {
												local189 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local1216 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local1279 = Static139.aClass2_Sub23_Sub1_4.method2122();
												@Pc(3235) Class2_Sub11 local3235 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local189);
												if (local3235 != null && local1216 != local3235.anInt726) {
													Static209.method3065(local3235, true);
													local3235 = null;
												}
												if (local3235 == null) {
													local3235 = Static85.method1491(local1216, local189, local1279);
												}
												local3235.aBoolean23 = true;
											}
											for (local1948 = (Class2_Sub11) Static12.aClass103_4.method3668(); local1948 != null; local1948 = (Class2_Sub11) Static12.aClass103_4.method3666()) {
												if (local1948.aBoolean23) {
													local1948.aBoolean23 = false;
												} else {
													Static209.method3065(local1948, true);
												}
											}
											Static108.aClass103_13.method3662();
											while (local131 > Static139.aClass2_Sub23_Sub1_4.anInt2703) {
												local1216 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local1279 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local2188 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local221 = Static139.aClass2_Sub23_Sub1_4.method2133();
												for (local3317 = local1279; local3317 <= local2188; local3317++) {
													local3327 = (long) local3317 + ((long) local1216 << 32);
													Static108.aClass103_13.method3665(local3327, new Class2_Sub7(local221));
												}
											}
											Static181.anInt4200 = -1;
											return true;
										} else if (Static181.anInt4200 == 147) {
											local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
											local185 = Static139.aClass2_Sub23_Sub1_4.method2095();
											@Pc(3367) Class78 local3367 = Static5.method98(local185).method2920(Static139.aClass2_Sub23_Sub1_4);
											Static188.method3489(Static103.method1785(local181).method3048(), null, 19, local185, local3367);
											Static181.anInt4200 = -1;
											return true;
										} else if (Static181.anInt4200 == 119) {
											for (local131 = 0; local131 < Static198.anIntArray724.length; local131++) {
												if (Static198.anIntArray724[local131] != Static94.anIntArray369[local131]) {
													Static198.anIntArray724[local131] = Static94.anIntArray369[local131];
													Static69.method1122(local131);
													Static138.anIntArray527[Static151.anInt3458++ & 0x1F] = local131;
												}
											}
											Static181.anInt4200 = -1;
											return true;
										} else if (Static181.anInt4200 == 15) {
											Static159.anInt4179 = Static133.anInt3087;
											local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
											if (local181 == 0L) {
												Static181.anInt4200 = -1;
												Static146.aClass2_Sub10Array1 = null;
												Static213.aClass78_449 = null;
												Static130.aClass78_583 = null;
												Static77.anInt1688 = 0;
												return true;
											}
											local1275 = Static139.aClass2_Sub23_Sub1_4.method2123();
											Static130.aClass78_583 = Static103.method1785(local1275);
											Static213.aClass78_449 = Static103.method1785(local181);
											Static160.aByte16 = Static139.aClass2_Sub23_Sub1_4.method2114();
											local1216 = Static139.aClass2_Sub23_Sub1_4.method2122();
											if (local1216 == 255) {
												Static181.anInt4200 = -1;
												return true;
											}
											Static77.anInt1688 = local1216;
											@Pc(3489) Class2_Sub10[] local3489 = new Class2_Sub10[100];
											for (local2188 = 0; local2188 < Static77.anInt1688; local2188++) {
												local3489[local2188] = new Class2_Sub10();
												local3489[local2188].aLong188 = Static139.aClass2_Sub23_Sub1_4.method2123();
												local3489[local2188].aClass78_122 = Static103.method1785(local3489[local2188].aLong188);
												local3489[local2188].anInt688 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local3489[local2188].aByte2 = Static139.aClass2_Sub23_Sub1_4.method2114();
												local3489[local2188].aClass78_123 = Static139.aClass2_Sub23_Sub1_4.method2115();
												if (local3489[local2188].aLong188 == Static160.aLong139) {
													Static47.aByte3 = local3489[local2188].aByte2;
												}
											}
											local344 = Static77.anInt1688;
											while (local344 > 0) {
												local344--;
												@Pc(3564) boolean local3564 = true;
												for (local351 = 0; local351 < local344; local351++) {
													if (local3489[local351].aClass78_122.method3047(local3489[local351 + 1].aClass78_122) > 0) {
														local3564 = false;
														@Pc(3587) Class2_Sub10 local3587 = local3489[local351];
														local3489[local351] = local3489[local351 + 1];
														local3489[local351 + 1] = local3587;
													}
												}
												if (local3564) {
													break;
												}
											}
											Static146.aClass2_Sub10Array1 = local3489;
											Static181.anInt4200 = -1;
											return true;
										} else {
											@Pc(3651) long local3651;
											@Pc(3669) int local3669;
											if (Static181.anInt4200 == 30) {
												local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
												Static139.aClass2_Sub23_Sub1_4.method2114();
												local1275 = Static139.aClass2_Sub23_Sub1_4.method2123();
												local2176 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local3651 = Static139.aClass2_Sub23_Sub1_4.method2091();
												@Pc(3657) long local3657 = local3651 + (local2176 << 32);
												local3317 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local344 = Static139.aClass2_Sub23_Sub1_4.method2095();
												@Pc(3667) boolean local3667 = false;
												local3669 = 0;
												label1249: while (true) {
													if (local3669 >= 100) {
														if (local3317 <= 1) {
															for (@Pc(3696) int local3696 = 0; local3696 < Static72.anInt4686; local3696++) {
																if (local181 == Static100.aLongArray6[local3696]) {
																	local3667 = true;
																	break label1249;
																}
															}
														}
														break;
													}
													if (Static155.aLongArray9[local3669] == local3657) {
														local3667 = true;
														break;
													}
													local3669++;
												}
												if (!local3667 && Static132.anInt3014 == 0) {
													Static155.aLongArray9[Static204.anInt4564] = local3657;
													Static204.anInt4564 = (Static204.anInt4564 + 1) % 100;
													local423 = Static5.method98(local344).method2920(Static139.aClass2_Sub23_Sub1_4);
													if (local3317 == 2 || local3317 == 3) {
														Static188.method3489(Static94.method1640(new Class78[] { Static8.aClass78_27, Static103.method1785(local181).method3048() }), Static103.method1785(local1275).method3048(), 20, local344, local423);
													} else if (local3317 == 1) {
														Static188.method3489(Static94.method1640(new Class78[] { Static43.aClass78_147, Static103.method1785(local181).method3048() }), Static103.method1785(local1275).method3048(), 20, local344, local423);
													} else {
														Static188.method3489(Static103.method1785(local181).method3048(), Static103.method1785(local1275).method3048(), 20, local344, local423);
													}
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 19) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2136();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local185 = Static139.aClass2_Sub23_Sub1_4.method2126();
												Static216.method3746(local131);
												Static113.method1935(local185, local601);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 122) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2092();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2136();
												Static140.anInt3197 = local131;
												Static114.anInt2557 = local601;
												Static13.method232();
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 31) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2129();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2104();
												local2127 = Static204.method3618(local131);
												if (local2127.anInt3058 != local601 || local601 == -1) {
													local2127.anInt3020 = 0;
													local2127.anInt3058 = local601;
													local2127.anInt3050 = 0;
													Static70.method2259(local2127);
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 123) {
												local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
												local745 = Static135.method894(Static82.method1363(Static139.aClass2_Sub23_Sub1_4).method3035());
												Static95.method1663(Static103.method1785(local181).method3048(), local745, 6);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 88) {
												Static192.method3513();
												Static181.anInt4200 = -1;
												return false;
											} else if (Static181.anInt4200 == 83) {
												Static64.method1034(Static139.aClass2_Sub23_Sub1_4.method2115());
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 175) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local185 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local189 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local1216 = Static139.aClass2_Sub23_Sub1_4.method2122();
												Static202.method3587(local185, local131, local189, local601, local1216);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 73) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2095();
												if (local131 < -70000) {
													local601 += 32768;
												}
												if (local131 < 0) {
													local2127 = null;
												} else {
													local2127 = Static204.method3618(local131);
												}
												if (local2127 != null) {
													for (local189 = 0; local189 < local2127.anIntArray493.length; local189++) {
														local2127.anIntArray493[local189] = 0;
														local2127.anIntArray496[local189] = 0;
													}
												}
												Static111.method1912(local601);
												local189 = Static139.aClass2_Sub23_Sub1_4.method2095();
												for (local1216 = 0; local1216 < local189; local1216++) {
													local1279 = Static139.aClass2_Sub23_Sub1_4.method2107();
													if (local1279 == 255) {
														local1279 = Static139.aClass2_Sub23_Sub1_4.method2094();
													}
													local2188 = Static139.aClass2_Sub23_Sub1_4.method2130();
													if (local2127 != null && local1216 < local2127.anIntArray493.length) {
														local2127.anIntArray493[local1216] = local2188;
														local2127.anIntArray496[local1216] = local1279;
													}
													Static55.method716(local1216, local1279, local601, local2188 - 1);
												}
												if (local2127 != null) {
													Static70.method2259(local2127);
												}
												Static212.method3696();
												Static212.anIntArray743[Static116.anInt2732++ & 0x1F] = local601 & 0x7FFF;
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 225) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
												Static201.aClass33_16 = Static133.aClass41_2.method1263(local131);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 161) {
												Static103.method1783(true);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 162) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local185 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local189 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local1216 = Static139.aClass2_Sub23_Sub1_4.method2122();
												Static225.method3967(local131, local189, local601, local1216, true, local185);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 138) {
												Static178.method3272();
												Static212.method3696();
												Static151.anInt3458 += 32;
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 145) {
												Static138.method2504();
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 244) {
												local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
												local185 = Static139.aClass2_Sub23_Sub1_4.method2095();
												@Pc(4262) byte local4262 = Static139.aClass2_Sub23_Sub1_4.method2114();
												local191 = false;
												if ((local181 & Long.MIN_VALUE) != 0L) {
													local191 = true;
												}
												if (local191) {
													if (Static77.anInt1688 == 0) {
														Static181.anInt4200 = -1;
														return true;
													}
													local181 &= Long.MAX_VALUE;
													for (local1279 = 0; local1279 < Static77.anInt1688 && (Static146.aClass2_Sub10Array1[local1279].aLong188 != local181 || Static146.aClass2_Sub10Array1[local1279].anInt688 != local185); local1279++) {
													}
													if (local1279 < Static77.anInt1688) {
														while (local1279 < Static77.anInt1688 - 1) {
															Static146.aClass2_Sub10Array1[local1279] = Static146.aClass2_Sub10Array1[local1279 + 1];
															local1279++;
														}
														Static77.anInt1688--;
														Static146.aClass2_Sub10Array1[Static77.anInt1688] = null;
													}
												} else {
													local205 = Static139.aClass2_Sub23_Sub1_4.method2115();
													@Pc(4354) Class2_Sub10 local4354 = new Class2_Sub10();
													local4354.aLong188 = local181;
													local4354.aClass78_122 = Static103.method1785(local4354.aLong188);
													local4354.aByte2 = local4262;
													local4354.anInt688 = local185;
													local4354.aClass78_123 = local205;
													for (local221 = Static77.anInt1688 - 1; local221 >= 0; local221--) {
														local3317 = Static146.aClass2_Sub10Array1[local221].aClass78_122.method3047(local4354.aClass78_122);
														if (local3317 == 0) {
															Static146.aClass2_Sub10Array1[local221].anInt688 = local185;
															Static146.aClass2_Sub10Array1[local221].aByte2 = local4262;
															Static146.aClass2_Sub10Array1[local221].aClass78_123 = local205;
															Static181.anInt4200 = -1;
															Static159.anInt4179 = Static133.anInt3087;
															if (local181 == Static160.aLong139) {
																Static47.aByte3 = local4262;
															}
															return true;
														}
														if (local3317 < 0) {
															break;
														}
													}
													if (Static77.anInt1688 >= Static146.aClass2_Sub10Array1.length) {
														Static181.anInt4200 = -1;
														return true;
													}
													for (local3317 = Static77.anInt1688 - 1; local3317 > local221; local3317--) {
														Static146.aClass2_Sub10Array1[local3317 + 1] = Static146.aClass2_Sub10Array1[local3317];
													}
													if (Static77.anInt1688 == 0) {
														Static146.aClass2_Sub10Array1 = new Class2_Sub10[100];
													}
													Static146.aClass2_Sub10Array1[local221 + 1] = local4354;
													if (Static160.aLong139 == local181) {
														Static47.aByte3 = local4262;
													}
													Static77.anInt1688++;
												}
												Static181.anInt4200 = -1;
												Static159.anInt4179 = Static133.anInt3087;
												return true;
											} else if (Static181.anInt4200 == 249) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2095();
												if (local131 < -70000) {
													local601 += 32768;
												}
												if (local131 >= 0) {
													local2127 = Static204.method3618(local131);
												} else {
													local2127 = null;
												}
												while (Static145.anInt3288 > Static139.aClass2_Sub23_Sub1_4.anInt2703) {
													local189 = Static139.aClass2_Sub23_Sub1_4.method2111();
													local1216 = Static139.aClass2_Sub23_Sub1_4.method2095();
													local1279 = 0;
													if (local1216 != 0) {
														local1279 = Static139.aClass2_Sub23_Sub1_4.method2122();
														if (local1279 == 255) {
															local1279 = Static139.aClass2_Sub23_Sub1_4.method2133();
														}
													}
													if (local2127 != null && local189 >= 0 && local189 < local2127.anIntArray493.length) {
														local2127.anIntArray493[local189] = local1216;
														local2127.anIntArray496[local189] = local1279;
													}
													Static55.method716(local189, local1279, local601, local1216 - 1);
												}
												if (local2127 != null) {
													Static70.method2259(local2127);
												}
												Static212.method3696();
												Static212.anIntArray743[Static116.anInt2732++ & 0x1F] = local601 & 0x7FFF;
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 143) {
												if (Static166.anInt1143 != -1) {
													Static161.method2899(Static166.anInt1143, 0);
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 216) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2126();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2136();
												Static119.method2207(local601, local131);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 69) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2129();
												local1770 = Static204.method3618(local131);
												local1770.anInt3024 = 3;
												local1770.anInt3067 = Static31.aClass5_Sub2_Sub2_1.aClass112_1.method3935();
												Static70.method2259(local1770);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 98) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2136();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2094();
												local185 = Static139.aClass2_Sub23_Sub1_4.method2092();
												local614 = Static204.method3618(local601);
												Static181.anInt4200 = -1;
												local614.anInt3025 = (local185 << 16) + local131;
												return true;
											} else if (Static181.anInt4200 == 91) {
												@Pc(4724) boolean local4724 = Static139.aClass2_Sub23_Sub1_4.method2107() == 1;
												local601 = Static139.aClass2_Sub23_Sub1_4.method2131();
												local2127 = Static204.method3618(local601);
												if (local2127.aBoolean137 != local4724) {
													local2127.aBoolean137 = local4724;
													Static70.method2259(local2127);
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 150) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local1271 = Static139.aClass2_Sub23_Sub1_4.method2115();
												local2127 = Static204.method3618(local131);
												if (!local1271.method3043(local2127.aClass78_589)) {
													local2127.aClass78_589 = local1271;
													Static70.method2259(local2127);
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 29) {
												Static152.anInt3520 = Static139.aClass2_Sub23_Sub1_4.method2122();
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 84) {
												Static198.method3552();
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 45) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2130();
												local1271 = Static139.aClass2_Sub23_Sub1_4.method2115();
												local185 = Static139.aClass2_Sub23_Sub1_4.method2130();
												Static216.method3746(local185);
												Static17.method261(local131, local1271);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 191) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2136();
												if (local131 == 65535) {
													local131 = -1;
												}
												local601 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local2127 = Static204.method3618(local601);
												if (local2127.anInt3024 != 1 || local131 != local2127.anInt3067) {
													local2127.anInt3024 = 1;
													local2127.anInt3067 = local131;
													Static70.method2259(local2127);
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 228) {
												Static212.method3696();
												local131 = Static139.aClass2_Sub23_Sub1_4.method2122();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local185 = Static139.aClass2_Sub23_Sub1_4.method2126();
												Static220.anIntArray772[local185] = local601;
												Static72.anIntArray745[local185] = local131;
												Static41.anIntArray129[local185] = 1;
												for (local189 = 0; local189 < 98; local189++) {
													if (local601 >= Class2_Sub2_Sub22.anIntArray533[local189]) {
														Static41.anIntArray129[local185] = local189 + 2;
													}
												}
												Static155.anIntArray589[Static165.anInt3815++ & 0x1F] = local185;
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 76) {
												Static33.anInt568 = Static139.aClass2_Sub23_Sub1_4.method2122();
												Static181.anInt4197 = Static139.aClass2_Sub23_Sub1_4.method2122();
												Static183.anInt4263 = Static139.aClass2_Sub23_Sub1_4.method2122();
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 231) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2092();
												Static177.method3243(local131);
												Static212.anIntArray743[Static116.anInt2732++ & 0x1F] = local131 & 0x7FFF;
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 165) {
												@Pc(5000) byte local5000 = Static139.aClass2_Sub23_Sub1_4.method2110();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2136();
												Static212.method3689(local601, local5000);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 174) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2133();
												local601 = local131 >> 28 & 0x3;
												local185 = local131 >> 14 & 0x3FFF;
												local189 = local131 & 0x3FFF;
												local1216 = Static139.aClass2_Sub23_Sub1_4.method2107();
												local1279 = local1216 >> 2;
												local2188 = local1216 & 0x3;
												local221 = Static166.anIntArray200[local1279];
												local3317 = Static139.aClass2_Sub23_Sub1_4.method2092();
												if (local3317 == 65535) {
													local3317 = -1;
												}
												local189 -= Static57.anInt628;
												local185 -= Static28.anInt497;
												Static168.method3780(local3317, local221, local2188, local189, local601, local185, local1279);
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 116) {
												local131 = Static139.aClass2_Sub23_Sub1_4.method2136();
												local601 = Static139.aClass2_Sub23_Sub1_4.method2129();
												local2127 = Static204.method3618(local601);
												if (local2127 != null && local2127.anInt3051 == 0) {
													if (local2127.anInt3082 - local2127.anInt3040 < local131) {
														local131 = local2127.anInt3082 - local2127.anInt3040;
													}
													if (local131 < 0) {
														local131 = 0;
													}
													if (local2127.anInt3046 != local131) {
														local2127.anInt3046 = local131;
														Static70.method2259(local2127);
													}
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 7) {
												Static49.anInt896 = Static139.aClass2_Sub23_Sub1_4.method2122();
												Static100.anInt2191 = Static139.aClass2_Sub23_Sub1_4.method2142();
												for (local131 = Static100.anInt2191; local131 < Static100.anInt2191 + 8; local131++) {
													for (local601 = Static49.anInt896; local601 < Static49.anInt896 + 8; local601++) {
														if (Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local131][local601] != null) {
															Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local131][local601] = null;
															Static209.method3070(local601, local131);
														}
													}
												}
												for (@Pc(5205) Class2_Sub25 local5205 = (Class2_Sub25) Static165.aClass44_44.method1359(); local5205 != null; local5205 = (Class2_Sub25) Static165.aClass44_44.method1356()) {
													if (Static100.anInt2191 <= local5205.anInt3279 && local5205.anInt3279 < Static100.anInt2191 + 8 && local5205.anInt3270 >= Static49.anInt896 && Static49.anInt896 + 8 > local5205.anInt3270 && local5205.anInt3269 == Static137.anInt3136) {
														local5205.anInt3271 = 0;
													}
												}
												Static181.anInt4200 = -1;
												return true;
											} else if (Static181.anInt4200 == 246) {
												local181 = Static139.aClass2_Sub23_Sub1_4.method2123();
												Static139.aClass2_Sub23_Sub1_4.method2114();
												local1275 = Static139.aClass2_Sub23_Sub1_4.method2123();
												local2176 = Static139.aClass2_Sub23_Sub1_4.method2095();
												local3651 = Static139.aClass2_Sub23_Sub1_4.method2091();
												local3327 = local3651 + (local2176 << 32);
												local3317 = Static139.aClass2_Sub23_Sub1_4.method2122();
												@Pc(5294) boolean local5294 = false;
												local2217 = 0;
												label1441: while (true) {
													if (local2217 >= 100) {
														if (local3317 <= 1) {
															if (Static214.anInt4672 == 1 || Static143.anInt3257 == 1) {
																local5294 = true;
															} else {
																for (local3669 = 0; local3669 < Static72.anInt4686; local3669++) {
																	if (Static100.aLongArray6[local3669] == local181) {
																		local5294 = true;
																		break label1441;
																	}
																}
															}
														}
														break;
													}
													if (Static155.aLongArray9[local2217] == local3327) {
														local5294 = true;
														break;
													}
													local2217++;
												}
												if (!local5294 && Static132.anInt3014 == 0) {
													Static155.aLongArray9[Static204.anInt4564] = local3327;
													Static204.anInt4564 = (Static204.anInt4564 + 1) % 100;
													local405 = Static135.method894(Static82.method1363(Static139.aClass2_Sub23_Sub1_4).method3035());
													if (local3317 == 2 || local3317 == 3) {
														Static209.method3064(local405, Static103.method1785(local1275).method3048(), Static94.method1640(new Class78[] { Static8.aClass78_27, Static103.method1785(local181).method3048() }));
													} else if (local3317 == 1) {
														Static209.method3064(local405, Static103.method1785(local1275).method3048(), Static94.method1640(new Class78[] { Static43.aClass78_147, Static103.method1785(local181).method3048() }));
													} else {
														Static209.method3064(local405, Static103.method1785(local1275).method3048(), Static103.method1785(local181).method3048());
													}
												}
												Static181.anInt4200 = -1;
												return true;
											} else {
												Static139.method2127(null, "T1 - " + Static181.anInt4200 + "," + Static189.anInt4412 + "," + Static21.anInt401 + " - " + Static145.anInt3288);
												Static192.method3513();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
