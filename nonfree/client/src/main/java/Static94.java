import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!go", name = "X", descriptor = "I")
	public static int anInt1976;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "[S")
	public static short[] aShortArray46 = new short[500];

	@OriginalMember(owner = "client!go", name = "R", descriptor = "Lclient!il;")
	public static Class86 aClass86_12 = new Class86(512);

	@OriginalMember(owner = "client!go", name = "V", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!go", name = "W", descriptor = "Lclient!q;")
	public static Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	public static void method1798() {
		if (Static54.anInt1167 < 0) {
			Static272.anInt5001 = -1;
			Static55.anInt1176 = -1;
			Static54.anInt1167 = 0;
		}
		if (Static54.anInt1167 > Static249.anInt5575) {
			Static272.anInt5001 = -1;
			Static55.anInt1176 = -1;
			Static54.anInt1167 = Static249.anInt5575;
		}
		if (Static175.anInt3415 < 0) {
			Static55.anInt1176 = -1;
			Static175.anInt3415 = 0;
			Static272.anInt5001 = -1;
		}
		if (Static249.anInt5574 < Static175.anInt3415) {
			Static272.anInt5001 = -1;
			Static55.anInt1176 = -1;
			Static175.anInt3415 = Static249.anInt5574;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)Lclient!mn;")
	public static Class1_Sub20 method1799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub20 local9 = new Class1_Sub20();
		local9.anInt3421 = arg1;
		local9.anInt3422 = arg2;
		Static224.aClass86_27.method2144(local9, (long) arg0);
		Static277.method4245(arg2);
		@Pc(34) Class157 local34 = Static206.method3444(arg0);
		if (local34 != null) {
			Static224.method3621(local34);
		}
		if (Static26.aClass157_2 != null) {
			Static224.method3621(Static26.aClass157_2);
			Static26.aClass157_2 = null;
		}
		@Pc(51) int local51 = Static241.anInt4470;
		@Pc(53) int local53;
		for (local53 = 0; local53 < local51; local53++) {
			if (Static160.method2738(aShortArray46[local53])) {
				Static146.method2580(local53);
			}
		}
		if (Static241.anInt4470 == 1) {
			Static91.aBoolean183 = false;
			Static111.method2031(Static48.anInt1073, Static282.anInt5139, Static92.anInt1933, Static229.anInt4962);
		} else {
			Static111.method2031(Static48.anInt1073, Static282.anInt5139, Static92.anInt1933, Static229.anInt4962);
			local53 = Static19.aClass1_Sub5_Sub9_1.method2860(Static252.aString165);
			for (@Pc(96) int local96 = 0; local96 < Static241.anInt4470; local96++) {
				@Pc(109) int local109 = Static19.aClass1_Sub5_Sub9_1.method2860(Static42.method774(local96));
				if (local109 > local53) {
					local53 = local109;
				}
			}
			Static229.anInt4962 = local53 + 8;
			Static282.anInt5139 = (Static284.aBoolean486 ? 26 : 22) + Static241.anInt4470 * 15;
		}
		if (local34 != null) {
			Static39.method676(local34, false);
		}
		Static215.method3496(arg2);
		if (Static315.anInt5636 != -1) {
			Static262.method4043(1, Static315.anInt5636);
		}
		return local9;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!nm;Lclient!nm;BIZ)Lclient!db;")
	public static Class1_Sub5_Sub4 method1801(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(20) int[] local20 = arg1.method3246(arg2);
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(34) byte[] local34 = arg1.method3242(arg2, local20[local22]);
			if (local34 == null) {
				local15 = false;
			} else {
				@Pc(55) int local55 = local34[1] & 0xFF | (local34[0] & 0xFF) << 8;
				@Pc(63) byte[] local63 = arg0.method3242(local55, 0);
				if (local63 == null) {
					local15 = false;
				}
			}
		}
		if (!local15) {
			return null;
		}
		try {
			return new Class1_Sub5_Sub4(arg1, arg0, arg2, false);
		} catch (@Pc(93) Exception local93) {
			return null;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)V")
	public static void method1802(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub5_Sub21 local4 = Static278.method4266(8, arg0);
		local4.method4064();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([IIIIII)V")
	public static void method1803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class171 local13 = local7.aClass171_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt5122;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class131 local58 = local7.aClass131_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3990;
		@Pc(67) int local67 = local58.anInt3987;
		@Pc(70) int local70 = local58.anInt3988;
		@Pc(73) int local73 = local58.anInt3989;
		@Pc(77) int[] local77 = Static176.anIntArrayArray22[local23];
		@Pc(81) int[] local81 = Static315.anIntArrayArray44[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIIIIII)V")
	public static void method1804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static146.anInt3010 = 0;
		@Pc(5) int local5;
		@Pc(633) int local633;
		@Pc(71) int local71;
		@Pc(262) int local262;
		@Pc(304) int local304;
		@Pc(349) int local349;
		@Pc(630) int local630;
		for (local5 = -1; local5 < Static1.anInt48 + Static275.anInt5043; local5++) {
			@Pc(22) Class11_Sub4 local22;
			if (local5 == -1) {
				local22 = Static138.aClass11_Sub4_Sub1_3;
			} else if (local5 < Static275.anInt5043) {
				local22 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local5]];
			} else {
				local22 = Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local5 - Static275.anInt5043]];
			}
			if (local22 != null && local22.method3354()) {
				@Pc(53) Class183 local53;
				if (local22 instanceof Class11_Sub4_Sub2) {
					local53 = ((Class11_Sub4_Sub2) local22).aClass183_1;
					if (local53.anIntArray596 != null) {
						local53 = local53.method4526();
					}
					if (local53 == null) {
						continue;
					}
				}
				@Pc(162) int local162;
				if (Static275.anInt5043 <= local5) {
					local53 = ((Class11_Sub4_Sub2) local22).aClass183_1;
					if (local53.anIntArray596 != null) {
						local53 = local53.method4526();
					}
					if (local53.anInt5427 >= 0 && local53.anInt5427 < Static154.aClass1_Sub5_Sub6Array7.length) {
						if (local53.anInt5422 == -1) {
							local262 = local22.method3356() + 15;
						} else {
							local262 = local53.anInt5422 + 15;
						}
						Static154.method2658(arg4, local262, arg2 >> 1, arg3 >> 1, arg5, local22);
						if (Static165.anInt5548 > -1) {
							Static154.aClass1_Sub5_Sub6Array7[local53.anInt5427].method3195(arg0 + Static165.anInt5548 - 12, arg1 + -30 + Static105.anInt2226);
						}
					}
					local304 = 0;
					@Pc(306) Class80[] local306 = Static160.aClass80Array1;
					while (local304 < local306.length) {
						@Pc(318) Class80 local318 = local306[local304];
						if (local318 != null && local318.anInt2271 == 1 && local318.anInt2276 == Static288.anIntArray572[local5 - Static275.anInt5043] && Static167.anInt637 % 20 < 10) {
							if (local53.anInt5422 == -1) {
								local349 = local22.method3356() + 15;
							} else {
								local349 = local53.anInt5422 + 15;
							}
							Static154.method2658(arg4, local349, arg2 >> 1, arg3 >> 1, arg5, local22);
							if (Static165.anInt5548 > -1) {
								Static288.aClass1_Sub5_Sub6Array14[local318.anInt2268].method3195(arg0 + Static165.anInt5548 - 12, arg1 + (Static105.anInt2226 - 28));
							}
						}
						local304++;
					}
				} else {
					local71 = 30;
					@Pc(74) Class11_Sub4_Sub1 local74 = (Class11_Sub4_Sub1) local22;
					if (local74.anInt3012 != -1 || local74.anInt3018 != -1) {
						Static154.method2658(arg4, local22.method3356() + 15, arg2 >> 1, arg3 >> 1, arg5, local22);
						if (Static165.anInt5548 > -1) {
							if (local74.anInt3012 != -1) {
								Static203.aClass1_Sub5_Sub6Array9[local74.anInt3012].method3195(arg0 + Static165.anInt5548 - 12, arg1 + -30 + Static105.anInt2226);
								local71 += 25;
							}
							if (local74.anInt3018 != -1) {
								Static154.aClass1_Sub5_Sub6Array7[local74.anInt3018].method3195(Static165.anInt5548 + arg0 - 12, -local71 + Static105.anInt2226 + arg1);
								local71 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(160) Class80[] local160 = Static160.aClass80Array1;
						for (local162 = 0; local162 < local160.length; local162++) {
							@Pc(170) Class80 local170 = local160[local162];
							if (local170 != null && local170.anInt2271 == 10 && local170.anInt2276 == Static135.anIntArray210[local5]) {
								Static154.method2658(arg4, local22.method3356() + 15, arg2 >> 1, arg3 >> 1, arg5, local22);
								if (Static165.anInt5548 > -1) {
									Static288.aClass1_Sub5_Sub6Array14[local170.anInt2268].method3195(arg0 + Static165.anInt5548 - 12, arg1 - -Static105.anInt2226 + -local71);
								}
							}
						}
					}
				}
				if (local22.aString130 != null && (Static275.anInt5043 <= local5 || Static259.anInt4811 == 0 || Static259.anInt4811 == 3 || Static259.anInt4811 == 1 && Static294.method943(((Class11_Sub4_Sub1) local22).aString99))) {
					Static154.method2658(arg4, local22.method3356(), arg2 >> 1, arg3 >> 1, arg5, local22);
					if (Static165.anInt5548 > -1 && Static125.anInt2511 > Static146.anInt3010) {
						Static125.anIntArray195[Static146.anInt3010] = Static19.aClass1_Sub5_Sub9_1.method2860(local22.aString130) / 2;
						Static125.anIntArray194[Static146.anInt3010] = Static19.aClass1_Sub5_Sub9_1.anInt3302;
						Static125.anIntArray193[Static146.anInt3010] = Static165.anInt5548;
						Static125.anIntArray191[Static146.anInt3010] = Static105.anInt2226;
						Static125.anIntArray192[Static146.anInt3010] = local22.anInt3818;
						Static125.anIntArray189[Static146.anInt3010] = local22.anInt3786;
						Static125.anIntArray190[Static146.anInt3010] = local22.anInt3809;
						Static125.aStringArray15[Static146.anInt3010] = local22.aString130;
						Static146.anInt3010++;
					}
				}
				if (Static167.anInt637 < local22.anInt3791) {
					@Pc(500) Class1_Sub5_Sub6 local500 = Static25.aClass1_Sub5_Sub6Array12[0];
					@Pc(504) Class1_Sub5_Sub6 local504 = Static25.aClass1_Sub5_Sub6Array12[1];
					if (local22 instanceof Class11_Sub4_Sub2) {
						@Pc(510) Class11_Sub4_Sub2 local510 = (Class11_Sub4_Sub2) local22;
						@Pc(520) Class1_Sub5_Sub6[] local520 = (Class1_Sub5_Sub6[]) Static31.aClass175_6.method4295((long) local510.aClass183_1.anInt5430);
						if (local520 == null) {
							local520 = Static182.method3107(Static45.aClass119_15, local510.aClass183_1.anInt5430);
							if (local520 != null) {
								Static31.aClass175_6.method4285(local520, (long) local510.aClass183_1.anInt5430);
							}
						}
						@Pc(545) Class183 local545 = local510.aClass183_1;
						if (local520 != null && local520.length == 2) {
							local504 = local520[1];
							local500 = local520[0];
						}
						if (local545.anInt5422 == -1) {
							local304 = local22.method3356();
						} else {
							local304 = local545.anInt5422;
						}
					} else {
						local304 = local22.method3356();
					}
					Static154.method2658(arg4, local304 + local500.anInt3625 + 10, arg2 >> 1, arg3 >> 1, arg5, local22);
					if (Static165.anInt5548 > -1) {
						local162 = Static165.anInt5548 + arg0 - (local500.anInt3617 >> 1);
						local349 = arg1 + Static105.anInt2226 - 3;
						local500.method3195(local162, local349);
						local630 = local22.anInt3854 * local500.anInt3617 / 255;
						local633 = local500.anInt3625;
						if (Static71.aBoolean165) {
							Static93.method1767(local162, local349, local630 + local162, local349 + local633);
						} else {
							Static77.method1591(local162, local349, local630 + local162, local633 + local349);
						}
						local504.method3195(local162, local349);
						if (Static71.aBoolean165) {
							Static93.method1772(arg0, arg1, arg0 + arg3, arg2 + arg1);
						} else {
							Static77.method1587(arg0, arg1, arg3 + arg0, arg1 + arg2);
						}
					}
				}
				for (local71 = 0; local71 < 4; local71++) {
					if (Static167.anInt637 < local22.anIntArray404[local71]) {
						if (local22 instanceof Class11_Sub4_Sub2) {
							@Pc(698) Class11_Sub4_Sub2 local698 = (Class11_Sub4_Sub2) local22;
							@Pc(701) Class183 local701 = local698.aClass183_1;
							if (local701.anInt5422 == -1) {
								local262 = local22.method3356() / 2;
							} else {
								local262 = local701.anInt5422 / 2;
							}
						} else {
							local262 = local22.method3356() / 2;
						}
						Static154.method2658(arg4, local262, arg2 >> 1, arg3 >> 1, arg5, local22);
						if (Static165.anInt5548 > -1) {
							if (local71 == 1) {
								Static105.anInt2226 -= 20;
							}
							if (local71 == 2) {
								Static105.anInt2226 -= 10;
								Static165.anInt5548 -= 15;
							}
							if (local71 == 3) {
								Static105.anInt2226 -= 10;
								Static165.anInt5548 += 15;
							}
							Static116.aClass1_Sub5_Sub6Array2[local22.anIntArray403[local71]].method3195(arg0 + Static165.anInt5548 - 12, arg1 + Static105.anInt2226 - 12);
							Static170.aClass1_Sub5_Sub9_4.method2866(Integer.toString(local22.anIntArray405[local71]), arg0 + Static165.anInt5548 - 1, Static105.anInt2226 + (arg1 - -3), 16777215, 0);
						}
					}
				}
			}
		}
		for (local5 = 0; local5 < Static146.anInt3010; local5++) {
			@Pc(833) int local833 = Static125.anIntArray193[local5];
			local262 = Static125.anIntArray195[local5];
			local71 = Static125.anIntArray191[local5];
			local304 = Static125.anIntArray194[local5];
			@Pc(847) boolean local847 = true;
			while (local847) {
				local847 = false;
				for (local349 = 0; local349 < local5; local349++) {
					if (local71 + 2 > Static125.anIntArray191[local349] - Static125.anIntArray194[local349] && Static125.anIntArray191[local349] + 2 > local71 + -local304 && local833 - local262 < Static125.anIntArray193[local349] + Static125.anIntArray195[local349] && local833 + local262 > -Static125.anIntArray195[local349] + Static125.anIntArray193[local349] && local71 > Static125.anIntArray191[local349] - Static125.anIntArray194[local349]) {
						local847 = true;
						local71 = Static125.anIntArray191[local349] - Static125.anIntArray194[local349];
					}
				}
			}
			Static165.anInt5548 = Static125.anIntArray193[local5];
			Static105.anInt2226 = Static125.anIntArray191[local5] = local71;
			@Pc(954) String local954 = Static125.aStringArray15[local5];
			if (Static195.anInt3889 == 0) {
				local630 = 16776960;
				if (Static125.anIntArray192[local5] < 6) {
					local630 = Static135.anIntArray211[Static125.anIntArray192[local5]];
				}
				if (Static125.anIntArray192[local5] == 6) {
					local630 = Static121.anInt2463 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static125.anIntArray192[local5] == 7) {
					local630 = Static121.anInt2463 % 20 < 10 ? 255 : 65535;
				}
				if (Static125.anIntArray192[local5] == 8) {
					local630 = Static121.anInt2463 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static125.anIntArray192[local5] == 9) {
					local633 = 150 - Static125.anIntArray190[local5];
					if (local633 < 50) {
						local630 = local633 * 1280 + 16711680;
					} else if (local633 < 100) {
						local630 = 16776960 - (local633 - 50) * 327680;
					} else if (local633 < 150) {
						local630 = (local633 - 100) * 5 + 65280;
					}
				}
				if (Static125.anIntArray192[local5] == 10) {
					local633 = 150 - Static125.anIntArray190[local5];
					if (local633 < 50) {
						local630 = local633 * 5 + 16711680;
					} else if (local633 < 100) {
						local630 = 33095935 - local633 * 327680;
					} else if (local633 < 150) {
						local630 = local633 * 327680 + 255 - (local633 - 100) * 5 - 32768000;
					}
				}
				if (Static125.anIntArray192[local5] == 11) {
					local633 = 150 - Static125.anIntArray190[local5];
					if (local633 < 50) {
						local630 = 16777215 - local633 * 327685;
					} else if (local633 < 100) {
						local630 = (local633 - 50) * 327685 + 65280;
					} else if (local633 < 150) {
						local630 = 32768000 + 16777215 - local633 * 327680;
					}
				}
				if (Static125.anIntArray189[local5] == 0) {
					Static19.aClass1_Sub5_Sub9_1.method2866(local954, Static165.anInt5548 + arg0, arg1 - -Static105.anInt2226, local630, 0);
				}
				if (Static125.anIntArray189[local5] == 1) {
					Static19.aClass1_Sub5_Sub9_1.method2871(local954, arg0 + Static165.anInt5548, arg1 + Static105.anInt2226, local630, Static121.anInt2463);
				}
				if (Static125.anIntArray189[local5] == 2) {
					Static19.aClass1_Sub5_Sub9_1.method2874(local954, Static165.anInt5548 + arg0, Static105.anInt2226 + arg1, local630, Static121.anInt2463);
				}
				if (Static125.anIntArray189[local5] == 3) {
					Static19.aClass1_Sub5_Sub9_1.method2875(local954, arg0 + Static165.anInt5548, Static105.anInt2226 + arg1, local630, Static121.anInt2463, 150 - Static125.anIntArray190[local5]);
				}
				if (Static125.anIntArray189[local5] == 4) {
					local633 = (150 - Static125.anIntArray190[local5]) * (Static19.aClass1_Sub5_Sub9_1.method2860(local954) + 100) / 150;
					if (Static71.aBoolean165) {
						Static93.method1767(Static165.anInt5548 + arg0 - 50, arg1, Static165.anInt5548 + arg0 + 50, arg2 + arg1);
					} else {
						Static77.method1591(arg0 + Static165.anInt5548 - 50, arg1, Static165.anInt5548 + arg0 + 50, arg1 + arg2);
					}
					Static19.aClass1_Sub5_Sub9_1.method2878(local954, arg0 + Static165.anInt5548 + 50 - local633, arg1 - -Static105.anInt2226, local630, 0);
					if (Static71.aBoolean165) {
						Static93.method1772(arg0, arg1, arg0 + arg3, arg2 + arg1);
					} else {
						Static77.method1587(arg0, arg1, arg0 + arg3, arg1 - -arg2);
					}
				}
				if (Static125.anIntArray189[local5] == 5) {
					local633 = 150 - Static125.anIntArray190[local5];
					if (Static71.aBoolean165) {
						Static93.method1767(arg0, arg1 + Static105.anInt2226 - Static19.aClass1_Sub5_Sub9_1.anInt3302 - 1, arg3 + arg0, Static105.anInt2226 + arg1 + 5);
					} else {
						Static77.method1591(arg0, Static105.anInt2226 + arg1 - Static19.aClass1_Sub5_Sub9_1.anInt3302 - 1, arg0 - -arg3, Static105.anInt2226 + arg1 + 5);
					}
					@Pc(1424) int local1424 = 0;
					if (local633 < 25) {
						local1424 = local633 - 25;
					} else if (local633 > 125) {
						local1424 = local633 - 125;
					}
					Static19.aClass1_Sub5_Sub9_1.method2866(local954, Static165.anInt5548 + arg0, local1424 + arg1 + Static105.anInt2226, local630, 0);
					if (Static71.aBoolean165) {
						Static93.method1772(arg0, arg1, arg3 + arg0, arg1 + arg2);
					} else {
						Static77.method1587(arg0, arg1, arg3 + arg0, arg2 + arg1);
					}
				}
			} else {
				Static19.aClass1_Sub5_Sub9_1.method2866(local954, Static165.anInt5548 + arg0, Static105.anInt2226 + arg1, 16776960, 0);
			}
		}
	}
}
