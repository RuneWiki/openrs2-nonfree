import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "[I")
	public static int[] anIntArray7;

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
	public static int anInt302;

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
	public static int anInt307;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
	public static int anInt309;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
	public static int anInt297 = 0;

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
	public static int anInt305 = 1;

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!en;)V")
	public static void method273(@OriginalArg(1) Class59 arg0) {
		if (Static270.anInt5171 < 0 || Static274.anInt5378 < 0 || Static282.anInt5473 == 0 || Static8.anInt261 == 0) {
			return;
		}
		arg0.method4869(Static93.anInt2158, Static61.anInt1424, Static282.anInt5473, Static8.anInt261);
		arg0.method4795(Static30.anInt820, Static200.anInt5713, Static282.anInt5473, Static8.anInt261);
		@Pc(29) Class112 local29 = arg0.method4789();
		local29.method3586(Static140.anInt2793, Static148.anInt3013, Static256.anInt4991, Static151.anInt3086, Static122.anInt2591, Static230.anInt4510);
		arg0.method4787(local29);
		@Pc(63) int local63;
		@Pc(72) int local72;
		@Pc(75) int local75;
		@Pc(84) int local84;
		@Pc(93) int local93;
		if (Static100.anInt2199 == 0 && Static262.aClass3Array3 != null) {
			@Pc(49) int local49 = -1;
			@Pc(51) int local51 = -1;
			@Pc(54) int local54 = arg0.method4839();
			local63 = (Static270.anInt5171 - Static93.anInt2158) * local54 / Static282.anInt5473;
			local72 = (Static274.anInt5378 - Static61.anInt1424) * local54 / Static8.anInt261;
			local75 = arg0.method4878();
			local84 = local75 * (Static270.anInt5171 - Static93.anInt2158) / Static282.anInt5473;
			local93 = local75 * (Static274.anInt5378 - Static61.anInt1424) / Static8.anInt261;
			@Pc(108) int[] local108 = new int[] { local63, local72, local54 };
			local29.method3599(local108);
			@Pc(126) int[] local126 = new int[] { local84, local93, local75 };
			local29.method3599(local126);
			@Pc(131) float local131 = 0.0F;
			@Pc(140) int local140 = local126[0] - local108[0];
			@Pc(149) int local149 = local126[1] - local108[1];
			@Pc(157) int local157 = local126[2] - local108[2];
			while (local131 < 1.0F) {
				@Pc(170) int local170 = (int) ((float) local108[0] + (float) local140 * local131);
				@Pc(174) int local174 = local170 >> 7;
				@Pc(185) int local185 = (int) ((float) local108[2] + local131 * (float) local157);
				@Pc(189) int local189 = local185 >> 7;
				if (local174 > 0 && local189 > 0 && Static266.anInt5101 > local174 && Static339.anInt6352 > local189) {
					@Pc(211) int local211 = Static156.anInt3123;
					if (local211 < 3 && (Static32.aByteArrayArrayArray4[1][local174][local189] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static262.aClass3Array3[local211].method5639(local170, local185) < (float) local108[1] + (float) local149 * local131) {
						local49 = Static85.aClass25_Sub1_Sub1_Sub1_1.method4646() * 64 + local170 - 64 >> 7;
						local51 = local185 + Static85.aClass25_Sub1_Sub1_Sub1_1.method4646() * 64 - 64 >> 7;
						break;
					}
				}
				local131 = (float) ((double) local131 + 0.01D);
			}
			if (local49 != -1 && local51 != -1) {
				if (Static20.aBoolean40 && (Static240.anInt4648 & 0x40) != 0) {
					@Pc(329) Class96 local329 = Static305.method5232(Static21.anInt6209, Static151.anInt3085);
					if (local329 == null) {
						Static279.method4734();
					} else {
						Static345.method5684(1, Static221.aString254, " ->", Static258.anInt5020, local49, local51, 0L);
					}
				} else {
					if (Static298.anInt5725 == 1) {
						Static345.method5684(21, Static261.aString296, "", -1, local49, local51, 0L);
					}
					Static345.method5684(59, Static27.aString305, "", -1, local49, local51, 0L);
				}
			}
		}
		@Pc(348) Class24 local348 = Static161.aClass24_1;
		for (@Pc(357) Class63_Sub3 local357 = (Class63_Sub3) local348.method619(); local357 != null; local357 = (Class63_Sub3) local348.method627()) {
			if (local357.method2592(Static270.anInt5171, Static274.anInt5378, arg0) && Static156.anInt3123 == local357.anInt2771) {
				@Pc(479) int local479;
				@Pc(491) int local491;
				if (local357.aClass25_1 instanceof Class25_Sub1_Sub1_Sub1) {
					@Pc(382) Class25_Sub1_Sub1_Sub1 local382 = (Class25_Sub1_Sub1_Sub1) local357.aClass25_1;
					local63 = local382.method4646();
					if ((local63 & 0x1) == 0 && (local382.anInt5769 & 0x7F) == 0 && (local382.anInt5773 & 0x7F) == 0 || (local63 & 0x1) == 1 && (local382.anInt5769 & 0x7F) == 64 && (local382.anInt5773 & 0x7F) == 64) {
						local72 = local382.anInt5769 - (local382.method4646() - 1) * 64;
						local75 = local382.anInt5773 - (local382.method4646() - 1) * 64;
						for (local84 = 0; local84 < Static63.anInt1486; local84++) {
							@Pc(456) Class25_Sub1_Sub1_Sub2 local456 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local84]];
							if (local456 != null && local456.anInt5282 != Static180.anInt3606 && local456.aBoolean403) {
								local479 = local456.anInt5769 + 64 - local456.aClass216_1.anInt6566 * 64;
								local491 = local456.anInt5773 + 64 - local456.aClass216_1.anInt6566 * 64;
								if (local479 >= local72 && local456.aClass216_1.anInt6566 <= local382.method4646() - (local479 - local72 >> 7) && local75 <= local491 && local456.aClass216_1.anInt6566 <= local382.method4646() - (local491 - local75 >> 7)) {
									Static283.method4780(local456);
									local456.anInt5282 = Static180.anInt3606;
								}
							}
						}
						for (local93 = 0; local93 < Static161.anInt3258; local93++) {
							@Pc(563) Class25_Sub1_Sub1_Sub1 local563 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local93]];
							if (local563 != null && Static180.anInt3606 != local563.anInt5282 && local382 != local563 && local563.aBoolean403) {
								local491 = local563.anInt5769 + 64 - local563.method4646() * 64;
								@Pc(599) int local599 = local563.anInt5773 + 64 - local563.method4646() * 64;
								if (local72 <= local491 && local563.method4646() <= local382.method4646() - (local491 - local72 >> 7) && local599 >= local75 && local563.method4646() <= local382.method4646() - (local599 - local75 >> 7)) {
									Static191.method5167(local563);
									local563.anInt5282 = Static180.anInt3606;
								}
							}
						}
					}
					if (Static180.anInt3606 == local382.anInt5282) {
						continue;
					}
					Static191.method5167(local382);
					local382.anInt5282 = Static180.anInt3606;
				}
				if (local357.aClass25_1 instanceof Class25_Sub1_Sub1_Sub2) {
					@Pc(669) Class25_Sub1_Sub1_Sub2 local669 = (Class25_Sub1_Sub1_Sub2) local357.aClass25_1;
					if (local669.aClass216_1 != null) {
						if ((local669.aClass216_1.anInt6566 & 0x1) == 0 && (local669.anInt5769 & 0x7F) == 0 && (local669.anInt5773 & 0x7F) == 0 || (local669.aClass216_1.anInt6566 & 0x1) == 1 && (local669.anInt5769 & 0x7F) == 64 && (local669.anInt5773 & 0x7F) == 64) {
							local63 = local669.anInt5769 + 64 - local669.aClass216_1.anInt6566 * 64;
							local72 = local669.anInt5773 + 64 - local669.aClass216_1.anInt6566 * 64;
							for (local75 = 0; local75 < Static63.anInt1486; local75++) {
								@Pc(753) Class25_Sub1_Sub1_Sub2 local753 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local75]];
								if (local753 != null && local753.anInt5282 != Static180.anInt3606 && local753 != local669 && local753.aBoolean403) {
									local93 = local753.anInt5769 - (local753.aClass216_1.anInt6566 - 1) * 64;
									local479 = local753.anInt5773 + 64 - local753.aClass216_1.anInt6566 * 64;
									if (local93 >= local63 && local753.aClass216_1.anInt6566 <= local669.aClass216_1.anInt6566 - (local93 - local63 >> 7) && local72 <= local479 && local669.aClass216_1.anInt6566 - (local479 - local72 >> 7) >= local753.aClass216_1.anInt6566) {
										Static283.method4780(local753);
										local753.anInt5282 = Static180.anInt3606;
									}
								}
							}
							for (local84 = 0; local84 < Static161.anInt3258; local84++) {
								@Pc(857) Class25_Sub1_Sub1_Sub1 local857 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local84]];
								if (local857 != null && Static180.anInt3606 != local857.anInt5282 && local857.aBoolean403) {
									local479 = local857.anInt5769 - (local857.method4646() - 1) * 64;
									local491 = local857.anInt5773 - (local857.method4646() - 1) * 64;
									if (local479 >= local63 && local857.method4646() <= local669.aClass216_1.anInt6566 - (local479 - local63 >> 7) && local72 <= local491 && local857.method4646() <= local669.aClass216_1.anInt6566 - (local491 - local72 >> 7)) {
										Static191.method5167(local857);
										local857.anInt5282 = Static180.anInt3606;
									}
								}
							}
						}
						if (Static180.anInt3606 == local669.anInt5282) {
							continue;
						}
						Static283.method4780(local669);
						local669.anInt5282 = Static180.anInt3606;
					}
				}
				if (local357.aClass25_1 instanceof Class25_Sub5_Sub1) {
					@Pc(981) Class5_Sub16 local981 = (Class5_Sub16) Static3.aClass42_56.method1052((long) (local357.anInt2771 << 28 | local357.anInt2772 << 14 | local357.anInt2768));
					if (local981 != null) {
						for (@Pc(989) Class5_Sub36 local989 = (Class5_Sub36) local981.aClass211_7.method5601(); local989 != null; local989 = (Class5_Sub36) local981.aClass211_7.method5604()) {
							@Pc(998) Class165 local998 = Static88.method1382(local989.anInt5029);
							if (Static100.anInt2199 == 1) {
								Static345.method5684(43, Static121.aString166, Static332.aString362 + " -> <col=ff9040>" + local998.aString291, Static100.anInt2198, local357.anInt2768, local357.anInt2772, (long) local989.anInt5029);
							} else if (Static20.aBoolean40) {
								@Pc(1159) Class5_Sub9_Sub1 local1159 = Static257.anInt5013 == -1 ? null : Static129.method2470(Static257.anInt5013);
								if ((Static240.anInt4648 & 0x1) != 0 && (local1159 == null || local998.method4413(Static257.anInt5013, local1159.anInt1273) != local1159.anInt1273)) {
									Static345.method5684(18, Static221.aString254, Static111.aString151 + " -> <col=ff9040>" + local998.aString291, Static258.anInt5020, local357.anInt2768, local357.anInt2772, (long) local989.anInt5029);
								}
							} else {
								@Pc(1035) String[] local1035 = local998.aStringArray37;
								for (local84 = 4; local84 >= 0; local84--) {
									if (local1035 != null && local1035[local84] != null) {
										@Pc(1047) byte local1047 = 0;
										if (local84 == 0) {
											local1047 = 50;
										}
										local479 = Static333.anInt4630;
										if (local84 == 1) {
											local1047 = 10;
										}
										if (local84 == 2) {
											local1047 = 16;
										}
										if (local84 == 3) {
											local1047 = 35;
										}
										if (local84 == 4) {
											local1047 = 14;
										}
										if (local84 == local998.anInt4924) {
											local479 = local998.anInt4933;
										}
										if (local998.anInt4936 == local84) {
											local479 = local998.anInt4932;
										}
										Static345.method5684(local1047, local1035[local84], "<col=ff9040>" + local998.aString291, local479, local357.anInt2768, local357.anInt2772, (long) local989.anInt5029);
									}
								}
								Static345.method5684(1007, Static139.aString354, "<col=ff9040>" + local998.aString291, Static218.anInt4348, local357.anInt2768, local357.anInt2772, (long) local989.anInt5029);
							}
						}
					}
				}
				if (local357.aClass25_1 instanceof Interface8) {
					@Pc(1226) Interface8 local1226 = (Interface8) local357.aClass25_1;
					@Pc(1232) Class137 local1232 = Static228.method3923(local1226.method5549());
					if (local1232.anIntArray296 != null) {
						local1232 = local1232.method3720();
					}
					if (local1232 != null) {
						if (Static100.anInt2199 == 1) {
							Static345.method5684(4, Static121.aString166, Static332.aString362 + " -> <col=00ffff>" + local1232.aString241, Static100.anInt2198, local357.anInt2768, local357.anInt2772, Static108.method2170(local357.anInt2768, local1226, local357.anInt2772));
						} else if (Static20.aBoolean40) {
							@Pc(1415) Class5_Sub9_Sub1 local1415 = Static257.anInt5013 == -1 ? null : Static129.method2470(Static257.anInt5013);
							if ((Static240.anInt4648 & 0x4) != 0 && (local1415 == null || local1232.method3711(local1415.anInt1273, Static257.anInt5013) != local1415.anInt1273)) {
								Static345.method5684(33, Static221.aString254, Static111.aString151 + " -> <col=00ffff>" + local1232.aString241, Static258.anInt5020, local357.anInt2768, local357.anInt2772, Static108.method2170(local357.anInt2768, local1226, local357.anInt2772));
							}
						} else {
							@Pc(1284) String[] local1284 = local1232.aStringArray29;
							if (local1284 != null) {
								for (local75 = 4; local75 >= 0; local75--) {
									if (local1284[local75] != null) {
										@Pc(1296) short local1296 = 0;
										if (local75 == 0) {
											local1296 = 7;
										}
										local93 = Static333.anInt4630;
										if (local75 == 1) {
											local1296 = 42;
										}
										if (local75 == 2) {
											local1296 = 32;
										}
										if (local75 == 3) {
											local1296 = 24;
										}
										if (local75 == 4) {
											local1296 = 1005;
										}
										if (local75 == local1232.anInt4160) {
											local93 = local1232.anInt4115;
										}
										if (local1232.anInt4129 == local75) {
											local93 = local1232.anInt4138;
										}
										Static345.method5684(local1296, local1284[local75], "<col=00ffff>" + local1232.aString241, local93, local357.anInt2768, local357.anInt2772, Static108.method2170(local357.anInt2768, local1226, local357.anInt2772));
									}
								}
							}
							Static345.method5684(1002, Static139.aString354, "<col=00ffff>" + local1232.aString241, Static218.anInt4348, local357.anInt2768, local357.anInt2772, (long) local1232.anInt4114);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BII)I")
	public static int method274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub19 local12 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(32) int local32 = 0; local32 < local12.anIntArray134.length; local32++) {
				if (arg1 == local12.anIntArray135[local32]) {
					local24 += local12.anIntArray134[local32];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
	public static void method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class25_Sub3 local13 = local7.aClass25_Sub3_2;
		@Pc(16) Class25_Sub3 local16 = local7.aClass25_Sub3_1;
		if (local13 != null) {
			local13.anInt6251 = local13.anInt6251 * arg3 / 16;
			local13.anInt6248 = local13.anInt6248 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6251 = local16.anInt6251 * arg3 / 16;
			local16.anInt6248 = local16.anInt6248 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V")
	public static void method276() {
		Static184.aClass211_40.method5600();
		for (@Pc(21) Class5_Sub4 local21 = (Class5_Sub4) Static60.aClass211_4.method5608(); local21 != null; local21 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
			if (local21.anInt785 < 1000) {
				local21.method5803();
				Static184.aClass211_40.method5609(local21);
			}
		}
		Static184.aClass211_40.method5599(Static60.aClass211_4);
		if (Static47.aClass96_2 != null || (Static287.aClass96_16 != null || Static302.anInt5825 > 0)) {
			return;
		}
		@Pc(59) int local59 = Static278.anInt5427;
		@Pc(74) int local74;
		if (!Static188.aBoolean264) {
			if (local59 == 1 && Static27.anInt5324 > 0) {
				local74 = ((Class5_Sub4) Static60.aClass211_4.aClass5_235.aClass5_248).anInt785;
				if (local74 == 23 || local74 == 2 || local74 == 19 || local74 == 11 || local74 == 57 || local74 == 26 || local74 == 34 || local74 == 22 || local74 == 49 || local74 == 44 || local74 == 41 || local74 == 1012) {
					@Pc(129) Class5_Sub4 local129 = (Class5_Sub4) Static60.aClass211_4.aClass5_235.aClass5_248;
					@Pc(134) Class96 local134 = Static121.method2396(local129.anInt781);
					@Pc(137) Class5_Sub10 local137 = Static43.method975(local134);
					if (local137.method1143()) {
						Static244.anInt4736 = 0;
						Static272.aBoolean399 = false;
						if (Static47.aClass96_2 != null) {
							Static336.method4719(Static47.aClass96_2);
						}
						Static47.aClass96_2 = Static121.method2396(local129.anInt781);
						Static353.anInt6602 = Static61.anInt1429;
						Static28.anInt774 = local129.anInt790;
						Static246.anInt4800 = Static318.anInt5916;
						Static336.method4719(Static47.aClass96_2);
						return;
					}
				}
			}
			if (local59 <= 0 && Static222.anInt4411 > 0) {
				local59 = Static222.anInt4411;
			}
			Static222.anInt4411 = 0;
			if (local59 == 1 && (Static305.anInt5879 == 1 && Static27.anInt5324 > 2 || Static175.method3300())) {
				local59 = 2;
			}
			if (local59 == 2 && Static27.anInt5324 > 0) {
				Static5.method170();
			}
			if (local59 == 1 && Static27.anInt5324 > 0) {
				Static249.method4372();
				return;
			}
			return;
		}
		@Pc(222) int local222;
		if (local59 != 1) {
			local74 = Static270.anInt5171;
			local222 = Static274.anInt5378;
			if (Static303.anInt5839 - 10 > local74 || local74 > Static144.anInt2967 + Static303.anInt5839 + 10 || local222 < Static279.anInt5429 - 10 || Static279.anInt5429 + Static343.anInt6411 + 10 < local222) {
				Static188.aBoolean264 = false;
				Static316.method5375(Static279.anInt5429, Static303.anInt5839, Static343.anInt6411, Static144.anInt2967);
			}
		}
		if (local59 != 1) {
			return;
		}
		local74 = Static303.anInt5839;
		local222 = Static279.anInt5429;
		@Pc(269) int local269 = Static144.anInt2967;
		@Pc(271) int local271 = Static61.anInt1429;
		@Pc(273) int local273 = Static318.anInt5916;
		@Pc(275) int local275 = -1;
		@Pc(295) int local295;
		for (@Pc(277) int local277 = 0; local277 < Static27.anInt5324; local277++) {
			if (Static171.aBoolean254) {
				local295 = local222 + (Static27.anInt5324 + -1 + -local277) * 16 + 33;
				if (local74 < local271 && local271 < local269 + local74 && local295 - 13 < local273 && local273 < local295 + 3) {
					local275 = local277;
				}
			} else {
				local295 = local222 + (Static27.anInt5324 + -1 + -local277) * 16 + 31;
				if (local271 > local74 && local271 < local74 + local269 && local273 > local295 - 13 && local295 + 3 > local273) {
					local275 = local277;
				}
			}
		}
		if (local275 != -1) {
			local295 = 0;
			@Pc(399) Class191 local399 = new Class191(Static60.aClass211_4);
			for (@Pc(404) Class5_Sub4 local404 = (Class5_Sub4) local399.method5238(); local404 != null; local404 = (Class5_Sub4) local399.method5235()) {
				if (local295 == local275) {
					Static247.method3554(local404);
				}
				local295++;
			}
		}
		Static188.aBoolean264 = false;
		Static316.method5375(Static279.anInt5429, Static303.anInt5839, Static343.anInt6411, Static144.anInt2967);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ra;)I")
	public static int method277(@OriginalArg(1) Class170 arg0) {
		@Pc(13) int local13 = 0;
		if (arg0.method4568(Static61.anInt1428)) {
			local13++;
		}
		if (arg0.method4568(Static232.anInt4543)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I")
	public static int method278(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static184.anInt6250 && Static80.anInt4809 >= arg1 && Static184.anInt6250 <= arg5 && Static80.anInt4809 >= arg5 && arg2 >= Static184.anInt6250 && arg2 <= Static80.anInt4809 && Static184.anInt6250 <= arg7 && arg7 <= Static80.anInt4809 && Static314.anInt6018 <= arg6 && Static334.anInt6315 >= arg6 && arg8 >= Static314.anInt6018 && arg8 <= Static334.anInt6315 && arg0 >= Static314.anInt6018 && Static334.anInt6315 >= arg0 && arg4 >= Static314.anInt6018 && arg4 <= Static334.anInt6315) {
			Static172.method3267(arg1, arg5, arg3, arg8, arg6, arg4, arg7, arg0, arg2);
		} else {
			Static173.method3936(arg6, arg7, arg1, arg8, arg3, arg4, arg2, arg0, arg5);
		}
	}
}
