import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!hi", name = "P", descriptor = "[Lclient!ag;")
	public static Class7[] aClass7Array4;

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
	public static int anInt2555;

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
	public static int anInt2554 = 0;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "(I)Z")
	public static boolean method1977() throws IOException {
		if (Static34.aClass109_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static34.aClass109_2.method3143();
		if (local13 == 0) {
			return false;
		}
		if (Static117.anInt3040 == -1) {
			Static34.aClass109_2.method3146(1, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
			Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
			local13--;
			Static117.anInt3040 = Static58.aClass1_Sub13_Sub1_1.method1822();
			Static149.anInt3579 = Static214.anIntArray366[Static117.anInt3040];
		}
		if (Static149.anInt3579 == -1) {
			if (local13 <= 0) {
				return false;
			}
			local13--;
			Static34.aClass109_2.method3146(1, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
			Static149.anInt3579 = Static58.aClass1_Sub13_Sub1_1.aByteArray29[0] & 0xFF;
		}
		if (Static149.anInt3579 == -2) {
			if (local13 <= 1) {
				return false;
			}
			local13 -= 2;
			Static34.aClass109_2.method3146(2, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
			Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
			Static149.anInt3579 = Static58.aClass1_Sub13_Sub1_1.method1764();
		}
		if (Static149.anInt3579 > local13) {
			return false;
		}
		Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
		Static34.aClass109_2.method3146(Static149.anInt3579, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
		Static196.anInt1185 = 0;
		Static9.anInt373 = Static221.anInt4829;
		Static221.anInt4829 = Static100.anInt2738;
		Static100.anInt2738 = Static117.anInt3040;
		@Pc(128) int local128;
		@Pc(124) int local124;
		if (Static117.anInt3040 == 79) {
			local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
			local128 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (Static209.method3465(local124)) {
				Static241.anInt5187 = local128;
			}
			Static117.anInt3040 = -1;
			return true;
		}
		@Pc(155) int local155;
		@Pc(166) String local166;
		if (Static117.anInt3040 == 130) {
			local124 = Static58.aClass1_Sub13_Sub1_1.method1811();
			local128 = Static58.aClass1_Sub13_Sub1_1.method1784();
			local155 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (local128 == 65535) {
				local128 = -1;
			}
			local166 = Static58.aClass1_Sub13_Sub1_1.method1774();
			if (local124 >= 1 && local124 <= 8) {
				if (local166.equalsIgnoreCase("null")) {
					local166 = null;
				}
				Static85.aStringArray15[local124 - 1] = local166;
				Static10.anIntArray36[local124 - 1] = local128;
				Static129.aBooleanArray11[local124 - 1] = local155 == 0;
			}
			Static117.anInt3040 = -1;
			return true;
		} else if (Static117.anInt3040 == 22) {
			local124 = Static58.aClass1_Sub13_Sub1_1.method1802();
			Static3.aClass145_1 = Static38.aClass28_1.method715(local124);
			Static117.anInt3040 = -1;
			return true;
		} else if (Static117.anInt3040 == 224) {
			local124 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (Static58.aClass1_Sub13_Sub1_1.method1772() == 0) {
				Static131.aClass105Array2[local124] = new Class105();
			} else {
				Static58.aClass1_Sub13_Sub1_1.anInt2395--;
				Static131.aClass105Array2[local124] = new Class105(Static58.aClass1_Sub13_Sub1_1);
			}
			Static48.anInt1414 = Static243.anInt5249;
			Static117.anInt3040 = -1;
			return true;
		} else {
			@Pc(287) int local287;
			@Pc(291) int local291;
			if (Static117.anInt3040 == 244) {
				local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
				local128 = Static58.aClass1_Sub13_Sub1_1.method1784();
				local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
				local287 = Static58.aClass1_Sub13_Sub1_1.method1786();
				local291 = Static58.aClass1_Sub13_Sub1_1.method1793();
				if (Static209.method3465(local128)) {
					Static154.method3011(local291, local155, local287, local124);
				}
				Static117.anInt3040 = -1;
				return true;
			} else if (Static117.anInt3040 == 174) {
				local124 = Static58.aClass1_Sub13_Sub1_1.method1811();
				local128 = Static58.aClass1_Sub13_Sub1_1.method1784();
				local155 = Static58.aClass1_Sub13_Sub1_1.method1813();
				if (Static209.method3465(local128)) {
					Static109.method2233(local155, local124);
				}
				Static117.anInt3040 = -1;
				return true;
			} else if (Static117.anInt3040 == 227) {
				Static168.anInt3924 = Static58.aClass1_Sub13_Sub1_1.method1814();
				Static183.anInt5173 = Static58.aClass1_Sub13_Sub1_1.method1772();
				while (Static58.aClass1_Sub13_Sub1_1.anInt2395 < Static149.anInt3579) {
					Static117.anInt3040 = Static58.aClass1_Sub13_Sub1_1.method1772();
					Static138.method2531();
				}
				Static117.anInt3040 = -1;
				return true;
			} else if (Static117.anInt3040 == 103) {
				for (local124 = 0; local124 < Static91.anIntArray189.length; local124++) {
					if (Static91.anIntArray189[local124] != Static36.anIntArray57[local124]) {
						Static91.anIntArray189[local124] = Static36.anIntArray57[local124];
						Static84.method1819(local124);
						Static214.anIntArray367[Static17.anInt621++ & 0x1F] = local124;
					}
				}
				Static117.anInt3040 = -1;
				return true;
			} else if (Static117.anInt3040 == 172) {
				Static191.method3227(Static58.aClass1_Sub13_Sub1_1.method1774());
				Static117.anInt3040 = -1;
				return true;
			} else if (Static117.anInt3040 == 195) {
				Static239.anInt5157 = 0;
				Static117.anInt3040 = -1;
				return true;
			} else {
				@Pc(517) int local517;
				@Pc(463) Class122 local463;
				@Pc(506) int local506;
				if (Static117.anInt3040 == 99) {
					local124 = Static58.aClass1_Sub13_Sub1_1.method1802();
					local128 = Static58.aClass1_Sub13_Sub1_1.method1764();
					if (local124 < -70000) {
						local128 += 32768;
					}
					if (local124 >= 0) {
						local463 = Static206.method3444(local124);
					} else {
						local463 = null;
					}
					if (local463 != null) {
						for (local287 = 0; local287 < local463.anIntArray362.length; local287++) {
							local463.anIntArray362[local287] = 0;
							local463.anIntArray360[local287] = 0;
						}
					}
					Static2.method24(local128);
					local287 = Static58.aClass1_Sub13_Sub1_1.method1764();
					for (local291 = 0; local291 < local287; local291++) {
						local506 = Static58.aClass1_Sub13_Sub1_1.method1811();
						if (local506 == 255) {
							local506 = Static58.aClass1_Sub13_Sub1_1.method1813();
						}
						local517 = Static58.aClass1_Sub13_Sub1_1.method1764();
						if (local463 != null && local291 < local463.anIntArray362.length) {
							local463.anIntArray362[local291] = local517;
							local463.anIntArray360[local291] = local506;
						}
						Static193.method3252(local291, local506, local517 - 1, local128);
					}
					if (local463 != null) {
						Static257.method4146(local463);
					}
					Static171.method2967();
					Static232.anIntArray437[Static252.anInt5358++ & 0x1F] = local128 & 0x7FFF;
					Static117.anInt3040 = -1;
					return true;
				}
				@Pc(626) long local626;
				@Pc(641) Class1_Sub27 local641;
				@Pc(632) Class1_Sub27 local632;
				if (Static117.anInt3040 == 71) {
					local124 = Static58.aClass1_Sub13_Sub1_1.method1813();
					local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
					if (local128 == 65535) {
						local128 = -1;
					}
					local155 = Static58.aClass1_Sub13_Sub1_1.method1784();
					local287 = Static58.aClass1_Sub13_Sub1_1.method1764();
					if (local287 == 65535) {
						local287 = -1;
					}
					local291 = Static58.aClass1_Sub13_Sub1_1.method1761();
					if (Static209.method3465(local291)) {
						for (local506 = local287; local506 <= local128; local506++) {
							local626 = ((long) local124 << 32) + (long) local506;
							local632 = (Class1_Sub27) Static54.aClass140_3.method4014(local626);
							if (local632 != null) {
								local641 = new Class1_Sub27(local632.anInt4836, local155);
								local632.method4186();
							} else if (local506 == -1) {
								local641 = new Class1_Sub27(Static206.method3444(local124).aClass1_Sub27_2.anInt4836, local155);
							} else {
								local641 = new Class1_Sub27(0, local155);
							}
							Static54.aClass140_3.method4011(local641, local626);
						}
					}
					Static117.anInt3040 = -1;
					return true;
				} else if (Static117.anInt3040 == 109) {
					local124 = Static58.aClass1_Sub13_Sub1_1.method1798();
					local128 = Static58.aClass1_Sub13_Sub1_1.method1813();
					local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
					if (Static209.method3465(local155)) {
						Static153.method2744(local128, local124);
					}
					Static117.anInt3040 = -1;
					return true;
				} else if (Static117.anInt3040 == 239) {
					@Pc(723) byte local723 = Static58.aClass1_Sub13_Sub1_1.method1792();
					local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
					local155 = Static58.aClass1_Sub13_Sub1_1.method1793();
					if (Static209.method3465(local128)) {
						Static264.method4210(local155, local723);
					}
					Static117.anInt3040 = -1;
					return true;
				} else if (Static117.anInt3040 == 104) {
					local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
					local128 = Static58.aClass1_Sub13_Sub1_1.method1786();
					local155 = Static58.aClass1_Sub13_Sub1_1.method1784();
					if (Static209.method3465(local155)) {
						Static8.method112(local124, local128);
					}
					Static117.anInt3040 = -1;
					return true;
				} else {
					@Pc(783) long local783;
					@Pc(791) long local791;
					@Pc(847) int local847;
					@Pc(796) long local796;
					@Pc(812) int local812;
					@Pc(816) int local816;
					@Pc(895) String local895;
					if (Static117.anInt3040 == 86) {
						local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
						Static58.aClass1_Sub13_Sub1_1.method1756();
						local791 = Static58.aClass1_Sub13_Sub1_1.method1810();
						local796 = Static58.aClass1_Sub13_Sub1_1.method1764();
						local626 = Static58.aClass1_Sub13_Sub1_1.method1773();
						@Pc(808) long local808 = (local796 << 32) + local626;
						local812 = Static58.aClass1_Sub13_Sub1_1.method1772();
						@Pc(814) boolean local814 = false;
						local816 = 0;
						label1225: while (true) {
							if (local816 >= 100) {
								if (local812 <= 1) {
									if (Static123.aBoolean66 && !Static60.aBoolean92 || Static148.aBoolean24) {
										local814 = true;
									} else {
										for (local847 = 0; local847 < Static167.anInt3911; local847++) {
											if (local783 == Static150.aLongArray23[local847]) {
												local814 = true;
												break label1225;
											}
										}
									}
								}
								break;
							}
							if (local808 == Static180.aLongArray26[local816]) {
								local814 = true;
								break;
							}
							local816++;
						}
						if (!local814 && Static238.anInt5142 == 0) {
							Static180.aLongArray26[Static120.anInt3099] = local808;
							Static120.anInt3099 = (Static120.anInt3099 + 1) % 100;
							local895 = Static78.method1939(Static128.method2429(Static218.method3558(Static58.aClass1_Sub13_Sub1_1)));
							if (local812 == 2 || local812 == 3) {
								Static250.method4061("<img=1>" + Static169.method2944(local783), Static169.method2944(local791), local895);
							} else if (local812 == 1) {
								Static250.method4061("<img=0>" + Static169.method2944(local783), Static169.method2944(local791), local895);
							} else {
								Static250.method4061(Static169.method2944(local783), Static169.method2944(local791), local895);
							}
						}
						Static117.anInt3040 = -1;
						return true;
					} else if (Static117.anInt3040 == 94) {
						local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
						local128 = Static58.aClass1_Sub13_Sub1_1.method1761();
						if (local128 == 65535) {
							local128 = -1;
						}
						local155 = Static58.aClass1_Sub13_Sub1_1.method1786();
						if (Static209.method3465(local124)) {
							Static180.method3107(1, -1, local155, local128);
						}
						Static117.anInt3040 = -1;
						return true;
					} else if (Static117.anInt3040 == 44) {
						Static174.method2988();
						Static171.method2967();
						Static17.anInt621 += 32;
						Static117.anInt3040 = -1;
						return true;
					} else if (Static117.anInt3040 == 220) {
						local124 = Static58.aClass1_Sub13_Sub1_1.method1793();
						local128 = Static58.aClass1_Sub13_Sub1_1.method1753();
						Static112.method2259(local128, local124);
						Static117.anInt3040 = -1;
						return true;
					} else if (Static117.anInt3040 == 212) {
						local124 = Static58.aClass1_Sub13_Sub1_1.method1814();
						local128 = Static58.aClass1_Sub13_Sub1_1.method1814();
						local155 = Static58.aClass1_Sub13_Sub1_1.method1814();
						Static137.anInt3321 = local124 >> 1;
						Static83.aClass9_Sub1_Sub1_1.method187(local128, local155, (local124 & 0x1) == 1);
						Static117.anInt3040 = -1;
						return true;
					} else {
						@Pc(1110) Class1_Sub5 local1110;
						if (Static117.anInt3040 == 47) {
							local124 = Static58.aClass1_Sub13_Sub1_1.method1753();
							local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
							local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
							local287 = Static58.aClass1_Sub13_Sub1_1.method1814();
							if (Static209.method3465(local155)) {
								local1110 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local124);
								if (local1110 != null) {
									Static263.method4207(local1110, local1110.anInt1358 != local128);
								}
								Static261.method4159(local287, local124, local128);
							}
							Static117.anInt3040 = -1;
							return true;
						} else if (Static117.anInt3040 == 72) {
							local124 = Static58.aClass1_Sub13_Sub1_1.method1811();
							local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
							local155 = Static58.aClass1_Sub13_Sub1_1.method1761();
							@Pc(1151) Class9_Sub1_Sub2 local1151 = Static36.aClass9_Sub1_Sub2Array2[local128];
							if (local1151 != null) {
								Static167.method2901(local1151, local155, local124);
							}
							Static117.anInt3040 = -1;
							return true;
						} else if (Static117.anInt3040 == 203) {
							local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
							local128 = Static58.aClass1_Sub13_Sub1_1.method1802();
							local155 = Static58.aClass1_Sub13_Sub1_1.method1784();
							if (local155 == 65535) {
								local155 = -1;
							}
							if (Static209.method3465(local124)) {
								Static180.method3107(2, -1, local128, local155);
							}
							Static117.anInt3040 = -1;
							return true;
						} else if (Static117.anInt3040 == 50) {
							local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
							local128 = Static58.aClass1_Sub13_Sub1_1.method1772();
							local155 = Static58.aClass1_Sub13_Sub1_1.method1772();
							local287 = Static58.aClass1_Sub13_Sub1_1.method1764();
							local291 = Static58.aClass1_Sub13_Sub1_1.method1772();
							local506 = Static58.aClass1_Sub13_Sub1_1.method1772();
							if (Static209.method3465(local124)) {
								Static111.method2252(local155, local291, local287, local506, local128);
							}
							Static117.anInt3040 = -1;
							return true;
						} else {
							@Pc(1259) String local1259;
							if (Static117.anInt3040 == 107) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
								local1259 = Static58.aClass1_Sub13_Sub1_1.method1774();
								local155 = Static58.aClass1_Sub13_Sub1_1.method1813();
								if (Static209.method3465(local124)) {
									Static169.method2947(local1259, local155);
								}
								Static117.anInt3040 = -1;
								return true;
							}
							@Pc(1428) int local1428;
							@Pc(1435) int local1435;
							@Pc(1474) int local1474;
							@Pc(1296) boolean local1296;
							@Pc(1320) String local1320;
							@Pc(1322) int local1322;
							@Pc(1298) String local1298;
							@Pc(1512) String local1512;
							if (Static117.anInt3040 == 23) {
								local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
								local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
								local287 = Static58.aClass1_Sub13_Sub1_1.method1772();
								local1296 = true;
								local1298 = "";
								if (local155 > 0) {
									local1298 = Static58.aClass1_Sub13_Sub1_1.method1774();
								}
								if (local783 < 0L) {
									local1296 = false;
									local783 &= Long.MAX_VALUE;
								}
								local1320 = Static169.method2944(local783);
								for (local1322 = 0; local1322 < Static265.anInt5544; local1322++) {
									if (Static139.aLongArray38[local1322] == local783) {
										if (local155 != Static206.anIntArray349[local1322]) {
											Static206.anIntArray349[local1322] = local155;
											if (local155 > 0) {
												Static50.method1013("", local1320 + Static151.aString234, 5);
											}
											if (local155 == 0) {
												Static50.method1013("", local1320 + Static28.aString39, 5);
											}
										}
										local1320 = null;
										Static63.aStringArray10[local1322] = local1298;
										Static208.anIntArray353[local1322] = local287;
										Static168.aBooleanArray15[local1322] = local1296;
										break;
									}
								}
								if (local1320 != null && Static265.anInt5544 < 200) {
									Static139.aLongArray38[Static265.anInt5544] = local783;
									Static48.aStringArray7[Static265.anInt5544] = local1320;
									Static206.anIntArray349[Static265.anInt5544] = local155;
									Static63.aStringArray10[Static265.anInt5544] = local1298;
									Static208.anIntArray353[Static265.anInt5544] = local287;
									Static168.aBooleanArray15[Static265.anInt5544] = local1296;
									Static265.anInt5544++;
								}
								Static52.anInt1461 = Static243.anInt5249;
								local1428 = Static265.anInt5544;
								while (local1428 > 0) {
									@Pc(1432) boolean local1432 = true;
									local1428--;
									for (local1435 = 0; local1435 < local1428; local1435++) {
										if (Static136.anInt3373 != Static206.anIntArray349[local1435] && Static206.anIntArray349[local1435 + 1] == Static136.anInt3373 || Static206.anIntArray349[local1435] == 0 && Static206.anIntArray349[local1435 + 1] != 0) {
											local1474 = Static206.anIntArray349[local1435];
											Static206.anIntArray349[local1435] = Static206.anIntArray349[local1435 + 1];
											local1432 = false;
											Static206.anIntArray349[local1435 + 1] = local1474;
											local895 = Static63.aStringArray10[local1435];
											Static63.aStringArray10[local1435] = Static63.aStringArray10[local1435 + 1];
											Static63.aStringArray10[local1435 + 1] = local895;
											local1512 = Static48.aStringArray7[local1435];
											Static48.aStringArray7[local1435] = Static48.aStringArray7[local1435 + 1];
											Static48.aStringArray7[local1435 + 1] = local1512;
											@Pc(1530) long local1530 = Static139.aLongArray38[local1435];
											Static139.aLongArray38[local1435] = Static139.aLongArray38[local1435 + 1];
											Static139.aLongArray38[local1435 + 1] = local1530;
											@Pc(1548) int local1548 = Static208.anIntArray353[local1435];
											Static208.anIntArray353[local1435] = Static208.anIntArray353[local1435 + 1];
											Static208.anIntArray353[local1435 + 1] = local1548;
											@Pc(1566) boolean local1566 = Static168.aBooleanArray15[local1435];
											Static168.aBooleanArray15[local1435] = Static168.aBooleanArray15[local1435 + 1];
											Static168.aBooleanArray15[local1435 + 1] = local1566;
										}
									}
									if (local1432) {
										break;
									}
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 74) {
								Static168.anInt3924 = Static58.aClass1_Sub13_Sub1_1.method1811();
								Static183.anInt5173 = Static58.aClass1_Sub13_Sub1_1.method1772();
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 58) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1761();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1802();
								local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
								local287 = Static58.aClass1_Sub13_Sub1_1.method1793();
								local291 = Static58.aClass1_Sub13_Sub1_1.method1784();
								if (Static209.method3465(local291)) {
									Static180.method3107(7, local287, local128, local155 << 16 | local124);
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 41) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1764();
								local155 = Static58.aClass1_Sub13_Sub1_1.method1761();
								local287 = Static58.aClass1_Sub13_Sub1_1.method1813();
								if (local287 >> 30 == 0) {
									@Pc(1807) Class14 local1807;
									@Pc(1790) boolean local1790;
									@Pc(1819) Class49 local1819;
									@Pc(1875) Class14 local1875;
									@Pc(1889) Class49 local1889;
									@Pc(1894) Class49 local1894;
									if (local287 >> 29 != 0) {
										local291 = local287 & 0xFFFF;
										@Pc(1779) Class9_Sub1_Sub2 local1779 = Static36.aClass9_Sub1_Sub2Array2[local291];
										if (local1779 != null) {
											if (local128 == 65535) {
												local128 = -1;
											}
											local1790 = true;
											if (local128 != -1 && local1779.anInt448 != -1) {
												if (local128 == local1779.anInt448) {
													local1807 = Static172.method2975(local128);
													if (local1807.aBoolean33 && local1807.anInt634 != -1) {
														local1819 = Static131.method697(local1807.anInt634);
														local1428 = local1819.anInt2190;
														if (local1428 == 1) {
															local1779.anInt472 = 0;
															local1779.anInt461 = 1;
															local1790 = false;
															local1779.anInt412 = 0;
															local1779.anInt444 = local155 + Static156.anInt3722;
															local1779.anInt460 = 0;
															Static232.method3865(local1779.anInt479, local1779.anInt427, false, local1779.anInt472, local1819);
														} else if (local1428 == 2) {
															local1790 = false;
															local1779.anInt415 = 0;
														}
													}
												} else {
													local1807 = Static172.method2975(local128);
													local1875 = Static172.method2975(local1779.anInt448);
													if (local1807.anInt634 != -1 && local1875.anInt634 != -1) {
														local1889 = Static131.method697(local1807.anInt634);
														local1894 = Static131.method697(local1875.anInt634);
														if (local1894.anInt2189 > local1889.anInt2189) {
															local1790 = false;
														}
													}
												}
											}
											if (local1790) {
												local1779.anInt444 = Static156.anInt3722 + local155;
												local1779.anInt461 = 1;
												local1779.anInt460 = 0;
												local1779.anInt448 = local128;
												local1779.anInt472 = 0;
												if (local1779.anInt444 > Static156.anInt3722) {
													local1779.anInt472 = -1;
												}
												local1779.anInt449 = local124;
												if (local1779.anInt448 != -1 && Static156.anInt3722 == local1779.anInt444) {
													local1322 = Static172.method2975(local1779.anInt448).anInt634;
													if (local1322 != -1) {
														local1819 = Static131.method697(local1322);
														if (local1819 != null && local1819.anIntArray168 != null) {
															Static232.method3865(local1779.anInt479, local1779.anInt427, false, 0, local1819);
														}
													}
												}
											}
										}
									} else if (local287 >> 28 != 0) {
										local291 = local287 & 0xFFFF;
										@Pc(1997) Class9_Sub1_Sub1 local1997;
										if (Static243.anInt5251 == local291) {
											local1997 = Static83.aClass9_Sub1_Sub1_1;
										} else {
											local1997 = Static147.aClass9_Sub1_Sub1Array1[local291];
										}
										if (local1997 != null) {
											if (local128 == 65535) {
												local128 = -1;
											}
											local1790 = true;
											if (local128 != -1 && local1997.anInt448 != -1) {
												if (local1997.anInt448 == local128) {
													local1807 = Static172.method2975(local128);
													if (local1807.aBoolean33 && local1807.anInt634 != -1) {
														local1819 = Static131.method697(local1807.anInt634);
														local1428 = local1819.anInt2190;
														if (local1428 == 1) {
															local1997.anInt461 = 1;
															local1997.anInt412 = 0;
															local1790 = false;
															local1997.anInt460 = 0;
															local1997.anInt444 = local155 + Static156.anInt3722;
															local1997.anInt472 = 0;
															Static232.method3865(local1997.anInt479, local1997.anInt427, false, local1997.anInt472, local1819);
														} else if (local1428 == 2) {
															local1790 = false;
															local1997.anInt415 = 0;
														}
													}
												} else {
													local1807 = Static172.method2975(local128);
													local1875 = Static172.method2975(local1997.anInt448);
													if (local1807.anInt634 != -1 && local1875.anInt634 != -1) {
														local1889 = Static131.method697(local1807.anInt634);
														local1894 = Static131.method697(local1875.anInt634);
														if (local1889.anInt2189 < local1894.anInt2189) {
															local1790 = false;
														}
													}
												}
											}
											if (local1790) {
												local1997.anInt448 = local128;
												local1997.anInt460 = 0;
												if (local1997.anInt448 == 65535) {
													local1997.anInt448 = -1;
												}
												local1997.anInt461 = 1;
												local1997.anInt472 = 0;
												local1997.anInt449 = local124;
												local1997.anInt444 = Static156.anInt3722 + local155;
												if (Static156.anInt3722 < local1997.anInt444) {
													local1997.anInt472 = -1;
												}
												if (local1997.anInt448 != -1 && local1997.anInt444 == Static156.anInt3722) {
													local1322 = Static172.method2975(local1997.anInt448).anInt634;
													if (local1322 != -1) {
														local1819 = Static131.method697(local1322);
														if (local1819 != null && local1819.anIntArray168 != null) {
															Static232.method3865(local1997.anInt479, local1997.anInt427, Static83.aClass9_Sub1_Sub1_1 == local1997, 0, local1819);
														}
													}
												}
											}
										}
									}
								} else {
									local291 = local287 >> 28 & 0x3;
									local506 = (local287 >> 14 & 0x3FFF) - Static64.anInt1786;
									local517 = (local287 & 0x3FFF) - Static29.anInt907;
									if (local506 >= 0 && local517 >= 0 && local506 < 104 && local517 < 104) {
										local506 = local506 * 128 + 64;
										local517 = local517 * 128 + 64;
										@Pc(1758) Class9_Sub6 local1758 = new Class9_Sub6(local128, local291, local506, local517, Static200.method3326(local291, local517, local506) - local124, local155, Static156.anInt3722);
										Static213.aClass3_21.method28(new Class1_Sub2_Sub19(local1758));
									}
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 198) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1813();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1784();
								local155 = Static58.aClass1_Sub13_Sub1_1.method1761();
								if (Static209.method3465(local155)) {
									Static243.method3989(local124, local128);
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 181) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1786();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
								if (Static209.method3465(local128)) {
									local155 = 0;
									if (Static83.aClass9_Sub1_Sub1_1.aClass94_1 != null) {
										local155 = Static83.aClass9_Sub1_Sub1_1.aClass94_1.method2822();
									}
									Static180.method3107(3, -1, local124, local155);
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 141) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1802();
								if (Static209.method3465(local124)) {
									@Pc(2312) Class1_Sub5 local2312 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local128);
									if (local2312 != null) {
										Static263.method4207(local2312, true);
									}
									if (Static58.aClass122_6 != null) {
										Static257.method4146(Static58.aClass122_6);
										Static58.aClass122_6 = null;
									}
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 219) {
								local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
								local791 = Static58.aClass1_Sub13_Sub1_1.method1764();
								local796 = Static58.aClass1_Sub13_Sub1_1.method1773();
								local517 = Static58.aClass1_Sub13_Sub1_1.method1772();
								local1322 = Static58.aClass1_Sub13_Sub1_1.method1764();
								@Pc(2362) long local2362 = (local791 << 32) + local796;
								@Pc(2364) boolean local2364 = false;
								local1474 = 0;
								label1272: while (true) {
									if (local1474 >= 100) {
										if (local517 <= 1) {
											for (local816 = 0; local816 < Static167.anInt3911; local816++) {
												if (Static150.aLongArray23[local816] == local783) {
													local2364 = true;
													break label1272;
												}
											}
										}
										break;
									}
									if (local2362 == Static180.aLongArray26[local1474]) {
										local2364 = true;
										break;
									}
									local1474++;
								}
								if (!local2364 && Static238.anInt5142 == 0) {
									Static180.aLongArray26[Static120.anInt3099] = local2362;
									Static120.anInt3099 = (Static120.anInt3099 + 1) % 100;
									@Pc(2440) String local2440 = Static224.method3732(local1322).method2906(Static58.aClass1_Sub13_Sub1_1);
									if (local517 == 2) {
										Static9.method185(null, "<img=1>" + Static169.method2944(local783), 18, local1322, local2440);
									} else if (local517 == 1) {
										Static9.method185(null, "<img=0>" + Static169.method2944(local783), 18, local1322, local2440);
									} else {
										Static9.method185(null, Static169.method2944(local783), 18, local1322, local2440);
									}
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 27) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1753();
								local155 = Static58.aClass1_Sub13_Sub1_1.method1802();
								if (Static209.method3465(local124)) {
									@Pc(2527) Class1_Sub5 local2527 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local155);
									local1110 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local128);
									if (local1110 != null) {
										Static263.method4207(local1110, local2527 == null || local1110.anInt1358 != local2527.anInt1358);
									}
									if (local2527 != null) {
										local2527.method4186();
										Static204.aClass140_13.method4011(local2527, (long) local128);
									}
									@Pc(2570) Class122 local2570 = Static206.method3444(local155);
									if (local2570 != null) {
										Static257.method4146(local2570);
									}
									local2570 = Static206.method3444(local128);
									if (local2570 != null) {
										Static257.method4146(local2570);
										Static147.method2678(true, local2570);
									}
									if (Static140.anInt3388 != -1) {
										Static146.method2662(1, Static140.anInt3388);
									}
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 121) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1813();
								local128 = local124 >> 28 & 0x3;
								local155 = local124 >> 14 & 0x3FFF;
								local291 = Static58.aClass1_Sub13_Sub1_1.method1793();
								if (local291 == 65535) {
									local291 = -1;
								}
								local287 = local124 & 0x3FFF;
								local506 = Static58.aClass1_Sub13_Sub1_1.method1811();
								local287 -= Static29.anInt907;
								local1322 = local506 & 0x3;
								local517 = local506 >> 2;
								local155 -= Static64.anInt1786;
								local812 = Static185.anIntArray313[local517];
								Static160.method2814(local287, local155, local517, local291, local1322, local812, local128);
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 171) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1761();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1764();
								local155 = Static58.aClass1_Sub13_Sub1_1.method1793();
								if (Static209.method3465(local128)) {
									Static123.method886(local124, local155);
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 48) {
								local124 = Static58.aClass1_Sub13_Sub1_1.method1753();
								local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
								if (local128 == 65535) {
									local128 = -1;
								}
								local155 = Static58.aClass1_Sub13_Sub1_1.method1761();
								local287 = Static58.aClass1_Sub13_Sub1_1.method1764();
								if (local287 == 65535) {
									local287 = -1;
								}
								local291 = Static58.aClass1_Sub13_Sub1_1.method1786();
								if (Static209.method3465(local155)) {
									for (local506 = local128; local506 <= local287; local506++) {
										local626 = (long) local506 + ((long) local291 << 32);
										local632 = (Class1_Sub27) Static54.aClass140_3.method4014(local626);
										if (local632 != null) {
											local641 = new Class1_Sub27(local124, local632.anInt4834);
											local632.method4186();
										} else if (local506 == -1) {
											local641 = new Class1_Sub27(local124, Static206.method3444(local291).aClass1_Sub27_2.anInt4834);
										} else {
											local641 = new Class1_Sub27(local124, -1);
										}
										Static54.aClass140_3.method4011(local641, local626);
									}
								}
								Static117.anInt3040 = -1;
								return true;
							} else if (Static117.anInt3040 == 208) {
								local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
								local791 = Static58.aClass1_Sub13_Sub1_1.method1764();
								local796 = Static58.aClass1_Sub13_Sub1_1.method1773();
								local517 = Static58.aClass1_Sub13_Sub1_1.method1772();
								@Pc(2843) long local2843 = (local791 << 32) + local796;
								@Pc(2845) boolean local2845 = false;
								local1435 = 0;
								label1329: while (true) {
									if (local1435 >= 100) {
										if (local517 <= 1) {
											if (Static123.aBoolean66 && !Static60.aBoolean92 || Static148.aBoolean24) {
												local2845 = true;
											} else {
												for (local1474 = 0; local1474 < Static167.anInt3911; local1474++) {
													if (Static150.aLongArray23[local1474] == local783) {
														local2845 = true;
														break label1329;
													}
												}
											}
										}
										break;
									}
									if (Static180.aLongArray26[local1435] == local2843) {
										local2845 = true;
										break;
									}
									local1435++;
								}
								if (!local2845 && Static238.anInt5142 == 0) {
									Static180.aLongArray26[Static120.anInt3099] = local2843;
									Static120.anInt3099 = (Static120.anInt3099 + 1) % 100;
									@Pc(2929) String local2929 = Static78.method1939(Static128.method2429(Static218.method3558(Static58.aClass1_Sub13_Sub1_1)));
									if (local517 == 2 || local517 == 3) {
										Static50.method1013("<img=1>" + Static169.method2944(local783), local2929, 7);
									} else if (local517 == 1) {
										Static50.method1013("<img=0>" + Static169.method2944(local783), local2929, 7);
									} else {
										Static50.method1013(Static169.method2944(local783), local2929, 3);
									}
								}
								Static117.anInt3040 = -1;
								return true;
							} else {
								@Pc(2990) String local2990;
								if (Static117.anInt3040 == 170) {
									local2990 = Static58.aClass1_Sub13_Sub1_1.method1774();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1784();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1784();
									if (Static209.method3465(local155)) {
										Static195.method3284(local2990, local128);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 162) {
									Static167.anInt3911 = Static149.anInt3579 / 8;
									for (local124 = 0; local124 < Static167.anInt3911; local124++) {
										Static150.aLongArray23[local124] = Static58.aClass1_Sub13_Sub1_1.method1810();
										Static226.aStringArray37[local124] = Static42.method790(Static150.aLongArray23[local124]);
										Static181.aBooleanArray16[local124] = false;
									}
									Static52.anInt1461 = Static243.anInt5249;
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 154) {
									Static168.anInt3924 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static183.anInt5173 = Static58.aClass1_Sub13_Sub1_1.method1779();
									for (local124 = Static183.anInt5173; local124 < Static183.anInt5173 + 8; local124++) {
										for (local128 = Static168.anInt3924; local128 < Static168.anInt3924 + 8; local128++) {
											if (Static138.aClass3ArrayArrayArray1[Static137.anInt3321][local124][local128] != null) {
												Static138.aClass3ArrayArrayArray1[Static137.anInt3321][local124][local128] = null;
												Static28.method574(local128, local124);
											}
										}
									}
									for (@Pc(3121) Class1_Sub21 local3121 = (Class1_Sub21) Static174.aClass3_17.method30(); local3121 != null; local3121 = (Class1_Sub21) Static174.aClass3_17.method33()) {
										if (Static183.anInt5173 <= local3121.anInt4014 && local3121.anInt4014 < Static183.anInt5173 + 8 && Static168.anInt3924 <= local3121.anInt4015 && local3121.anInt4015 < Static168.anInt3924 + 8 && Static137.anInt3321 == local3121.anInt4024) {
											local3121.anInt4021 = 0;
										}
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 15) {
									local2990 = Static58.aClass1_Sub13_Sub1_1.method1774();
									if (local2990.endsWith(":tradereq:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":"));
										local791 = Static93.method2008(local1259);
										local1296 = false;
										for (local506 = 0; local506 < Static167.anInt3911; local506++) {
											if (Static150.aLongArray23[local506] == local791) {
												local1296 = true;
												break;
											}
										}
										if (!local1296 && Static238.anInt5142 == 0) {
											Static50.method1013(local1259, Static164.aString248, 4);
										}
									} else if (local2990.endsWith(":chalreq:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":"));
										local791 = Static93.method2008(local1259);
										local1296 = false;
										for (local506 = 0; local506 < Static167.anInt3911; local506++) {
											if (local791 == Static150.aLongArray23[local506]) {
												local1296 = true;
												break;
											}
										}
										if (!local1296 && Static238.anInt5142 == 0) {
											local1320 = local2990.substring(local2990.indexOf(":") + 1, local2990.length() + -9);
											Static50.method1013(local1259, local1320, 8);
										}
									} else if (local2990.endsWith(":assistreq:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":"));
										local791 = Static93.method2008(local1259);
										local1296 = false;
										for (local506 = 0; local506 < Static167.anInt3911; local506++) {
											if (local791 == Static150.aLongArray23[local506]) {
												local1296 = true;
												break;
											}
										}
										if (!local1296 && Static238.anInt5142 == 0) {
											Static50.method1013(local1259, "", 10);
										}
									} else if (local2990.endsWith(":clan:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":clan:"));
										Static50.method1013("", local1259, 11);
									} else if (local2990.endsWith(":trade:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":trade:"));
										if (Static238.anInt5142 == 0) {
											Static50.method1013("", local1259, 12);
										}
									} else if (local2990.endsWith(":assist:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":assist:"));
										if (Static238.anInt5142 == 0) {
											Static50.method1013("", local1259, 13);
										}
									} else if (local2990.endsWith(":duelstake:")) {
										local1296 = false;
										local1259 = local2990.substring(0, local2990.indexOf(":"));
										local791 = Static93.method2008(local1259);
										for (local506 = 0; local506 < Static167.anInt3911; local506++) {
											if (local791 == Static150.aLongArray23[local506]) {
												local1296 = true;
												break;
											}
										}
										if (!local1296 && Static238.anInt5142 == 0) {
											Static50.method1013(local1259, "", 14);
										}
									} else if (local2990.endsWith(":duelfriend:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":"));
										local791 = Static93.method2008(local1259);
										local1296 = false;
										for (local506 = 0; local506 < Static167.anInt3911; local506++) {
											if (Static150.aLongArray23[local506] == local791) {
												local1296 = true;
												break;
											}
										}
										if (!local1296 && Static238.anInt5142 == 0) {
											Static50.method1013(local1259, "", 15);
										}
									} else if (local2990.endsWith(":clanreq:")) {
										local1296 = false;
										local1259 = local2990.substring(0, local2990.indexOf(":"));
										local791 = Static93.method2008(local1259);
										for (local506 = 0; local506 < Static167.anInt3911; local506++) {
											if (local791 == Static150.aLongArray23[local506]) {
												local1296 = true;
												break;
											}
										}
										if (!local1296 && Static238.anInt5142 == 0) {
											Static50.method1013(local1259, "", 16);
										}
									} else if (local2990.endsWith(":allyreq:")) {
										local1259 = local2990.substring(0, local2990.indexOf(":"));
										local1296 = false;
										local791 = Static93.method2008(local1259);
										for (local506 = 0; local506 < Static167.anInt3911; local506++) {
											if (local791 == Static150.aLongArray23[local506]) {
												local1296 = true;
												break;
											}
										}
										if (!local1296 && Static238.anInt5142 == 0) {
											local1320 = local2990.substring(local2990.indexOf(":") + 1, local2990.length() + -9);
											Static50.method1013(local1259, local1320, 21);
										}
									} else {
										Static50.method1013("", local2990, 0);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 243) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									if (Static209.method3465(local124)) {
										Static116.method2307();
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 10) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1802();
									@Pc(3667) Class122 local3667 = Static206.method3444(local124);
									for (local155 = 0; local155 < local3667.anIntArray362.length; local155++) {
										local3667.anIntArray362[local155] = -1;
										local3667.anIntArray362[local155] = 0;
									}
									Static257.method4146(local3667);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 102) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
									if (local124 == 65535) {
										local124 = -1;
									}
									local287 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static3.method40(local128, local155, local124, local287);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 13) {
									if (Static140.anInt3388 != -1) {
										Static146.method2662(0, Static140.anInt3388);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 21) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1802();
									if (Static209.method3465(local124)) {
										Static264.method4210(local128, local155);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 155) {
									@Pc(3783) byte[] local3783 = new byte[Static149.anInt3579];
									Static58.aClass1_Sub13_Sub1_1.method1815(Static149.anInt3579, local3783);
									local1259 = Static47.method967(local3783, Static149.anInt3579, 0);
									if (Static42.aFrame1 == null && (Static40.anInt1103 == 3 || !Static40.aString58.startsWith("win") || Static151.aBoolean187)) {
										Static151.method2719(local1259, true);
									} else {
										Static263.aBoolean281 = true;
										Static59.aString95 = local1259;
										Static99.aClass145_5 = Static38.aClass28_1.method721(local1259);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 87) {
									Static69.anInt1874 = Static58.aClass1_Sub13_Sub1_1.method1793() * 30;
									Static117.anInt3040 = -1;
									Static22.anInt2835 = Static243.anInt5249;
									return true;
								} else if (Static117.anInt3040 == 145) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local1259 = Static58.aClass1_Sub13_Sub1_1.method1774();
									@Pc(3863) Object[] local3863 = new Object[local1259.length() + 1];
									for (local287 = local1259.length() - 1; local287 >= 0; local287--) {
										if (local1259.charAt(local287) == 's') {
											local3863[local287 + 1] = Static58.aClass1_Sub13_Sub1_1.method1774();
										} else {
											local3863[local287 + 1] = Integer.valueOf(Static58.aClass1_Sub13_Sub1_1.method1802());
										}
									}
									local3863[0] = Integer.valueOf(Static58.aClass1_Sub13_Sub1_1.method1802());
									if (Static209.method3465(local124)) {
										@Pc(3916) Class1_Sub30 local3916 = new Class1_Sub30();
										local3916.anObjectArray32 = local3863;
										Static153.method2746(local3916);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 132) {
									Static171.method2967();
									local124 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1786();
									Static195.anIntArray339[local124] = local155;
									Static48.anIntArray106[local124] = local128;
									Static259.anIntArray466[local124] = 1;
									for (local287 = 0; local287 < 98; local287++) {
										if (local155 >= Class125.anIntArray380[local287]) {
											Static259.anIntArray466[local124] = local287 + 2;
										}
									}
									Static213.anIntArray356[Static21.anInt732++ & 0x1F] = local124;
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 221) {
									Static13.anInt509 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static121.anInt3111 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static56.anInt1547 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 24) {
									Static58.aClass1_Sub13_Sub1_1.anInt2395 += 28;
									if (Static58.aClass1_Sub13_Sub1_1.method1794()) {
										Static233.method3886(Static58.aClass1_Sub13_Sub1_1.anInt2395 - 28, Static58.aClass1_Sub13_Sub1_1);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 46) {
									local2990 = Static58.aClass1_Sub13_Sub1_1.method1774();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1784();
									if (Static209.method3465(local155)) {
										Static195.method3284(local2990, local128);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 35) {
									Static98.method2085();
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 189) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									Static111.method2251(local124);
									Static232.anIntArray437[Static252.anInt5358++ & 0x1F] = local124 & 0x7FFF;
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 113) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									@Pc(4124) byte local4124 = Static58.aClass1_Sub13_Sub1_1.method1775();
									Static46.method963(local4124, local124);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 16) {
									Static149.anInt3577 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static52.anInt1461 = Static243.anInt5249;
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 42) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1784();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1753();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1793();
									local287 = Static58.aClass1_Sub13_Sub1_1.method1761();
									if (Static209.method3465(local287)) {
										Static22.method2182((local155 << 16) + local124, local128);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 61) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local128 = local124 >> 5;
									local155 = local124 & 0x1F;
									if (local155 == 0) {
										Static75.aClass116Array1[local128] = null;
										Static117.anInt3040 = -1;
										return true;
									}
									@Pc(4214) Class116 local4214 = new Class116();
									local4214.anInt4410 = local155;
									local4214.anInt4410 = local124 & 0x3F;
									local4214.anInt4404 = Static58.aClass1_Sub13_Sub1_1.method1772();
									if (local4214.anInt4404 >= 0 && local4214.anInt4404 < Static112.aClass1_Sub2_Sub4Array10.length) {
										if (local4214.anInt4410 == 1 || local4214.anInt4410 == 10) {
											local4214.anInt4406 = Static58.aClass1_Sub13_Sub1_1.method1764();
											Static58.aClass1_Sub13_Sub1_1.anInt2395 += 5;
										} else if (local4214.anInt4410 >= 2 && local4214.anInt4410 <= 6) {
											if (local4214.anInt4410 == 2) {
												local4214.anInt4407 = 64;
												local4214.anInt4408 = 64;
											}
											if (local4214.anInt4410 == 3) {
												local4214.anInt4407 = 64;
												local4214.anInt4408 = 0;
											}
											if (local4214.anInt4410 == 4) {
												local4214.anInt4408 = 128;
												local4214.anInt4407 = 64;
											}
											if (local4214.anInt4410 == 5) {
												local4214.anInt4407 = 0;
												local4214.anInt4408 = 64;
											}
											if (local4214.anInt4410 == 6) {
												local4214.anInt4408 = 64;
												local4214.anInt4407 = 128;
											}
											local4214.anInt4410 = 2;
											local4214.anInt4402 = Static58.aClass1_Sub13_Sub1_1.method1764();
											local4214.anInt4405 = Static58.aClass1_Sub13_Sub1_1.method1764();
											local4214.anInt4398 = Static58.aClass1_Sub13_Sub1_1.method1772();
											local4214.anInt4401 = Static58.aClass1_Sub13_Sub1_1.method1764();
										}
										local4214.anInt4409 = Static58.aClass1_Sub13_Sub1_1.method1764();
										if (local4214.anInt4409 == 65535) {
											local4214.anInt4409 = -1;
										}
										Static75.aClass116Array1[local128] = local4214;
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 128) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local287 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local291 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local506 = Static58.aClass1_Sub13_Sub1_1.method1772();
									if (Static209.method3465(local124)) {
										Static149.method2691(local287, true, local291, local128, local155, local506);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 2) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1753();
									Static46.method963(local128, local124);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 167) {
									local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local1296 = false;
									if ((local783 & Long.MIN_VALUE) != 0L) {
										local1296 = true;
									}
									@Pc(4464) byte local4464 = Static58.aClass1_Sub13_Sub1_1.method1756();
									if (local1296) {
										if (Static131.anInt1067 == 0) {
											Static117.anInt3040 = -1;
											return true;
										}
										local783 &= Long.MAX_VALUE;
										for (local506 = 0; local506 < Static131.anInt1067 && (local783 != Static138.aClass1_Sub20Array1[local506].aLong184 || Static138.aClass1_Sub20Array1[local506].anInt3978 != local155); local506++) {
										}
										if (Static131.anInt1067 > local506) {
											while (local506 < Static131.anInt1067 - 1) {
												Static138.aClass1_Sub20Array1[local506] = Static138.aClass1_Sub20Array1[local506 + 1];
												local506++;
											}
											Static131.anInt1067--;
											Static138.aClass1_Sub20Array1[Static131.anInt1067] = null;
										}
									} else {
										local1298 = Static58.aClass1_Sub13_Sub1_1.method1774();
										@Pc(4474) Class1_Sub20 local4474 = new Class1_Sub20();
										local4474.aLong184 = local783;
										local4474.aString264 = Static251.method4070(local4474.aLong184);
										local4474.anInt3978 = local155;
										local4474.aByte12 = local4464;
										local4474.aString263 = local1298;
										for (local1322 = Static131.anInt1067 - 1; local1322 >= 0; local1322--) {
											local812 = Static138.aClass1_Sub20Array1[local1322].aString264.compareTo(local4474.aString264);
											if (local812 == 0) {
												Static138.aClass1_Sub20Array1[local1322].anInt3978 = local155;
												Static138.aClass1_Sub20Array1[local1322].aByte12 = local4464;
												Static138.aClass1_Sub20Array1[local1322].aString263 = local1298;
												if (local783 == Static148.aLong16) {
													Static79.aByte10 = local4464;
												}
												Static117.anInt3040 = -1;
												Static147.anInt3560 = Static243.anInt5249;
												return true;
											}
											if (local812 < 0) {
												break;
											}
										}
										if (Static131.anInt1067 >= Static138.aClass1_Sub20Array1.length) {
											Static117.anInt3040 = -1;
											return true;
										}
										for (local812 = Static131.anInt1067 - 1; local812 > local1322; local812--) {
											Static138.aClass1_Sub20Array1[local812 + 1] = Static138.aClass1_Sub20Array1[local812];
										}
										if (Static131.anInt1067 == 0) {
											Static138.aClass1_Sub20Array1 = new Class1_Sub20[100];
										}
										Static138.aClass1_Sub20Array1[local1322 + 1] = local4474;
										Static131.anInt1067++;
										if (Static148.aLong16 == local783) {
											Static79.aByte10 = local4464;
										}
									}
									Static117.anInt3040 = -1;
									Static147.anInt3560 = Static243.anInt5249;
									return true;
								} else if (Static117.anInt3040 == 54) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1761();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1811();
									if (Static209.method3465(local124)) {
										if (local155 == 2) {
											Static52.method1020();
										}
										Static140.anInt3388 = local128;
										Static53.method1021(local128);
										Static249.method4058(false);
										Static15.method254(Static140.anInt3388);
										for (local287 = 0; local287 < 100; local287++) {
											Static198.aBooleanArray19[local287] = true;
										}
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 116) {
									local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
									@Pc(4757) String local4757 = Static78.method1939(Static128.method2429(Static218.method3558(Static58.aClass1_Sub13_Sub1_1)));
									Static50.method1013(Static169.method2944(local783), local4757, 6);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 83 || Static117.anInt3040 == 38 || Static117.anInt3040 == 199 || Static117.anInt3040 == 31 || Static117.anInt3040 == 95 || Static117.anInt3040 == 118 || Static117.anInt3040 == 112 || Static117.anInt3040 == 106 || Static117.anInt3040 == 123 || Static117.anInt3040 == 18 || Static117.anInt3040 == 89 || Static117.anInt3040 == 101 || Static117.anInt3040 == 151 || Static117.anInt3040 == 222) {
									Static138.method2531();
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 45) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1793();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1814();
									Static112.method2259(local128, local124);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 3) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1802();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1764();
									if (local124 >= 0) {
										local463 = Static206.method3444(local124);
									} else {
										local463 = null;
									}
									if (local124 < -70000) {
										local128 += 32768;
									}
									while (Static149.anInt3579 > Static58.aClass1_Sub13_Sub1_1.anInt2395) {
										local287 = Static58.aClass1_Sub13_Sub1_1.method1780();
										local291 = Static58.aClass1_Sub13_Sub1_1.method1764();
										local506 = 0;
										if (local291 != 0) {
											local506 = Static58.aClass1_Sub13_Sub1_1.method1772();
											if (local506 == 255) {
												local506 = Static58.aClass1_Sub13_Sub1_1.method1802();
											}
										}
										if (local463 != null && local287 >= 0 && local287 < local463.anIntArray362.length) {
											local463.anIntArray362[local287] = local291;
											local463.anIntArray360[local287] = local506;
										}
										Static193.method3252(local287, local506, local291 - 1, local128);
									}
									if (local463 != null) {
										Static257.method4146(local463);
									}
									Static171.method2967();
									Static232.anIntArray437[Static252.anInt5358++ & 0x1F] = local128 & 0x7FFF;
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 34) {
									local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
									Static58.aClass1_Sub13_Sub1_1.method1756();
									@Pc(4988) boolean local4988 = false;
									local791 = Static58.aClass1_Sub13_Sub1_1.method1810();
									local796 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local626 = Static58.aClass1_Sub13_Sub1_1.method1773();
									@Pc(5008) long local5008 = local626 + (local796 << 32);
									local812 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local1428 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local847 = 0;
									label1509: while (true) {
										if (local847 >= 100) {
											if (local812 <= 1) {
												for (@Pc(5043) int local5043 = 0; local5043 < Static167.anInt3911; local5043++) {
													if (Static150.aLongArray23[local5043] == local783) {
														local4988 = true;
														break label1509;
													}
												}
											}
											break;
										}
										if (local5008 == Static180.aLongArray26[local847]) {
											local4988 = true;
											break;
										}
										local847++;
									}
									if (!local4988 && Static238.anInt5142 == 0) {
										Static180.aLongArray26[Static120.anInt3099] = local5008;
										Static120.anInt3099 = (Static120.anInt3099 + 1) % 100;
										local1512 = Static224.method3732(local1428).method2906(Static58.aClass1_Sub13_Sub1_1);
										if (local812 == 2 || local812 == 3) {
											Static9.method185(Static169.method2944(local791), "<img=1>" + Static169.method2944(local783), 20, local1428, local1512);
										} else if (local812 == 1) {
											Static9.method185(Static169.method2944(local791), "<img=0>" + Static169.method2944(local783), 20, local1428, local1512);
										} else {
											Static9.method185(Static169.method2944(local791), Static169.method2944(local783), 20, local1428, local1512);
										}
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 43) {
									Static14.method235(false);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 249) {
									if (Static149.anInt3579 == 0) {
										Static208.aString315 = Static128.aString206;
									} else {
										Static208.aString315 = Static58.aClass1_Sub13_Sub1_1.method1774();
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 215) {
									Static171.method2967();
									Static198.anInt4582 = Static58.aClass1_Sub13_Sub1_1.method1798();
									Static117.anInt3040 = -1;
									Static22.anInt2835 = Static243.anInt5249;
									return true;
								} else if (Static117.anInt3040 == 40) {
									for (local124 = 0; local124 < Static147.aClass9_Sub1_Sub1Array1.length; local124++) {
										if (Static147.aClass9_Sub1_Sub1Array1[local124] != null) {
											Static147.aClass9_Sub1_Sub1Array1[local124].anInt443 = -1;
										}
									}
									for (local128 = 0; local128 < Static36.aClass9_Sub1_Sub2Array2.length; local128++) {
										if (Static36.aClass9_Sub1_Sub2Array2[local128] != null) {
											Static36.aClass9_Sub1_Sub2Array2[local128].anInt443 = -1;
										}
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 53) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1802();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1784();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1753();
									local287 = Static58.aClass1_Sub13_Sub1_1.method1764();
									if (local287 == 65535) {
										local287 = -1;
									}
									if (Static209.method3465(local128)) {
										@Pc(5283) Class122 local5283 = Static206.method3444(local155);
										@Pc(5300) Class89 local5300;
										if (local5283.aBoolean228) {
											Static119.method2348(local124, local287, local155);
											local5300 = Static93.method2006(local287);
											Static154.method3011(local5300.anInt3638, local5300.anInt3667, local155, local5300.anInt3672);
											Static19.method364(local5300.anInt3629, local5300.anInt3683, local155, local5300.anInt3666);
										} else if (local287 == -1) {
											Static117.anInt3040 = -1;
											local5283.anInt4651 = 0;
											return true;
										} else {
											local5300 = Static93.method2006(local287);
											local5283.anInt4644 = local5300.anInt3672 * 100 / local124;
											local5283.anInt4660 = local5300.anInt3667;
											local5283.anInt4676 = local287;
											local5283.anInt4651 = 4;
											local5283.anInt4661 = local5300.anInt3638;
											Static257.method4146(local5283);
										}
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 245) {
									Static203.method3394(Static38.aClass28_1, Static58.aClass1_Sub13_Sub1_1, Static149.anInt3579);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 6) {
									Static179.method3056();
									Static117.anInt3040 = -1;
									return false;
								} else if (Static117.anInt3040 == 236) {
									Static14.method235(true);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 255) {
									Static147.anInt3560 = Static243.anInt5249;
									local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
									if (local783 == 0L) {
										Static138.aClass1_Sub20Array1 = null;
										Static131.anInt1067 = 0;
										Static93.aString166 = null;
										Static202.aString302 = null;
										Static117.anInt3040 = -1;
										return true;
									}
									local791 = Static58.aClass1_Sub13_Sub1_1.method1810();
									Static202.aString302 = Static251.method4070(local791);
									Static93.aString166 = Static251.method4070(local783);
									Static66.aByte5 = Static58.aClass1_Sub13_Sub1_1.method1756();
									local291 = Static58.aClass1_Sub13_Sub1_1.method1772();
									if (local291 == 255) {
										Static117.anInt3040 = -1;
										return true;
									}
									Static131.anInt1067 = local291;
									@Pc(5452) Class1_Sub20[] local5452 = new Class1_Sub20[100];
									for (local517 = 0; local517 < Static131.anInt1067; local517++) {
										local5452[local517] = new Class1_Sub20();
										local5452[local517].aLong184 = Static58.aClass1_Sub13_Sub1_1.method1810();
										local5452[local517].aString264 = Static251.method4070(local5452[local517].aLong184);
										local5452[local517].anInt3978 = Static58.aClass1_Sub13_Sub1_1.method1764();
										local5452[local517].aByte12 = Static58.aClass1_Sub13_Sub1_1.method1756();
										local5452[local517].aString263 = Static58.aClass1_Sub13_Sub1_1.method1774();
										if (Static148.aLong16 == local5452[local517].aLong184) {
											Static79.aByte10 = local5452[local517].aByte12;
										}
									}
									local1428 = Static131.anInt1067;
									while (local1428 > 0) {
										@Pc(5530) boolean local5530 = true;
										local1428--;
										for (local1435 = 0; local1435 < local1428; local1435++) {
											if (local5452[local1435].aString264.compareTo(local5452[local1435 + 1].aString264) > 0) {
												@Pc(5554) Class1_Sub20 local5554 = local5452[local1435];
												local5530 = false;
												local5452[local1435] = local5452[local1435 + 1];
												local5452[local1435 + 1] = local5554;
											}
										}
										if (local5530) {
											break;
										}
									}
									Static117.anInt3040 = -1;
									Static138.aClass1_Sub20Array1 = local5452;
									return true;
								} else if (Static117.anInt3040 == 175) {
									local783 = Static58.aClass1_Sub13_Sub1_1.method1810();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local166 = Static224.method3732(local155).method2906(Static58.aClass1_Sub13_Sub1_1);
									Static9.method185(null, Static169.method2944(local783), 19, local155, local166);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 91) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									if (Static209.method3465(local124)) {
										Static236.method3914();
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 250) {
									Static97.method2672();
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 235) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1814();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1793();
									if (local128 == 65535) {
										local128 = -1;
									}
									Static21.method412(local128, local124);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 126) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1784();
									if (local128 == 65535) {
										local128 = -1;
									}
									local155 = Static58.aClass1_Sub13_Sub1_1.method1773();
									Static248.method4049(local128, local155, local124);
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 117) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1778();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1798();
									local287 = Static58.aClass1_Sub13_Sub1_1.method1813();
									if (Static209.method3465(local128)) {
										Static210.method3477(local124, local155, local287);
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 197) {
									local124 = Static58.aClass1_Sub13_Sub1_1.method1764();
									local128 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local155 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local287 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local291 = Static58.aClass1_Sub13_Sub1_1.method1772();
									local506 = Static58.aClass1_Sub13_Sub1_1.method1764();
									if (Static209.method3465(local124)) {
										Static125.aBooleanArray8[local128] = true;
										Static125.anIntArray243[local128] = local155;
										Static47.anIntArray104[local128] = local287;
										Static102.anIntArray203[local128] = local291;
										Static219.anIntArray384[local128] = local506;
									}
									Static117.anInt3040 = -1;
									return true;
								} else if (Static117.anInt3040 == 178) {
									Static171.method2967();
									Static212.anInt4628 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static117.anInt3040 = -1;
									Static22.anInt2835 = Static243.anInt5249;
									return true;
								} else if (Static117.anInt3040 == 66) {
									Static121.anInt3108 = Static58.aClass1_Sub13_Sub1_1.method1772();
									Static117.anInt3040 = -1;
									return true;
								} else {
									Static57.method1101("T1 - " + Static117.anInt3040 + "," + Static221.anInt4829 + "," + Static9.anInt373 + " - " + Static149.anInt3579, null);
									Static179.method3056();
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
