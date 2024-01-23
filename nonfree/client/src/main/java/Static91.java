import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static int anInt2019 = 0;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_447 = Static199.method3560(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_448 = Static199.method3560("");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILclient!aa;)V")
	public static void method1595(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		@Pc(6) Object[] local6 = arg1.anObjectArray1;
		@Pc(12) int local12 = (Integer) local6[0];
		@Pc(16) Class2_Sub3_Sub6 local16 = Static38.method517(local12);
		if (local16 == null) {
			return;
		}
		Static198.anInt4485 = 0;
		@Pc(23) int local23 = 0;
		@Pc(26) int[] local26 = local16.anIntArray166;
		@Pc(29) int[] local29 = local16.anIntArray167;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(35) byte local35 = -1;
		@Pc(49) int local49;
		@Pc(61) int local61;
		try {
			Static101.aClass78Array17 = new Class78[local16.anInt1020];
			@Pc(41) int local41 = 0;
			Static78.anIntArray283 = new int[local16.anInt1019];
			@Pc(47) int local47 = 0;
			for (local49 = 1; local49 < local6.length; local49++) {
				if (local6[local49] instanceof Integer) {
					local61 = (Integer) local6[local49];
					if (local61 == -2147483647) {
						local61 = arg1.anInt41;
					}
					if (local61 == -2147483646) {
						local61 = arg1.anInt43;
					}
					if (local61 == -2147483645) {
						local61 = arg1.aClass64_1 == null ? -1 : arg1.aClass64_1.anInt3044;
					}
					if (local61 == -2147483644) {
						local61 = arg1.anInt48;
					}
					if (local61 == -2147483643) {
						local61 = arg1.aClass64_1 == null ? -1 : arg1.aClass64_1.anInt2993;
					}
					if (local61 == -2147483642) {
						local61 = arg1.aClass64_2 == null ? -1 : arg1.aClass64_2.anInt3044;
					}
					if (local61 == -2147483641) {
						local61 = arg1.aClass64_2 == null ? -1 : arg1.aClass64_2.anInt2993;
					}
					if (local61 == -2147483640) {
						local61 = arg1.anInt45;
					}
					if (local61 == -2147483639) {
						local61 = arg1.anInt47;
					}
					Static78.anIntArray283[local41++] = local61;
				} else if (local6[local49] instanceof Class78) {
					@Pc(163) Class78 local163 = (Class78) local6[local49];
					if (local163.method3043(Static138.aClass78_603)) {
						local163 = arg1.aClass78_7;
					}
					Static101.aClass78Array17[local47++] = local163;
				}
			}
			local61 = 0;
			label3285: while (true) {
				local61++;
				if (local61 > arg0) {
					throw new RuntimeException("slow");
				}
				local31++;
				@Pc(206) int local206 = local29[local31];
				@Pc(758) int local758;
				@Pc(624) int local624;
				@Pc(561) Class78 local561;
				@Pc(753) int local753;
				@Pc(600) int local600;
				if (local206 < 100) {
					if (local206 == 0) {
						Static92.anIntArray362[local23++] = local26[local31];
						continue;
					}
					@Pc(228) int local228;
					if (local206 == 1) {
						local228 = local26[local31];
						Static92.anIntArray362[local23++] = Static198.anIntArray724[local228];
						continue;
					}
					if (local206 == 2) {
						local228 = local26[local31];
						local23--;
						Static57.method463(local228, Static92.anIntArray362[local23]);
						continue;
					}
					if (local206 == 3) {
						Static22.aClass78Array4[local33++] = local16.aClass78Array8[local31];
						continue;
					}
					if (local206 == 6) {
						local31 += local26[local31];
						continue;
					}
					if (local206 == 7) {
						local23 -= 2;
						if (Static92.anIntArray362[local23] != Static92.anIntArray362[local23 + 1]) {
							local31 += local26[local31];
						}
						continue;
					}
					if (local206 == 8) {
						local23 -= 2;
						if (Static92.anIntArray362[local23 + 1] == Static92.anIntArray362[local23]) {
							local31 += local26[local31];
						}
						continue;
					}
					if (local206 == 9) {
						local23 -= 2;
						if (Static92.anIntArray362[local23] < Static92.anIntArray362[local23 + 1]) {
							local31 += local26[local31];
						}
						continue;
					}
					if (local206 == 10) {
						local23 -= 2;
						if (Static92.anIntArray362[local23 + 1] < Static92.anIntArray362[local23]) {
							local31 += local26[local31];
						}
						continue;
					}
					if (local206 == 21) {
						if (Static198.anInt4485 == 0) {
							return;
						}
						@Pc(383) Class86 local383 = Static74.aClass86Array1[--Static198.anInt4485];
						Static78.anIntArray283 = local383.anIntArray701;
						local16 = local383.aClass2_Sub3_Sub6_1;
						local26 = local16.anIntArray166;
						Static101.aClass78Array17 = local383.aClass78Array33;
						local31 = local383.anInt4338;
						local29 = local16.anIntArray167;
						continue;
					}
					if (local206 == 25) {
						local228 = local26[local31];
						Static92.anIntArray362[local23++] = Static103.method1784(local228);
						continue;
					}
					if (local206 == 27) {
						local228 = local26[local31];
						local23--;
						Static64.method1036(local228, Static92.anIntArray362[local23]);
						continue;
					}
					if (local206 == 31) {
						local23 -= 2;
						if (Static92.anIntArray362[local23 + 1] >= Static92.anIntArray362[local23]) {
							local31 += local26[local31];
						}
						continue;
					}
					if (local206 == 32) {
						local23 -= 2;
						if (Static92.anIntArray362[local23 + 1] <= Static92.anIntArray362[local23]) {
							local31 += local26[local31];
						}
						continue;
					}
					if (local206 == 33) {
						Static92.anIntArray362[local23++] = Static78.anIntArray283[local26[local31]];
						continue;
					}
					@Pc(510) int local510;
					if (local206 == 34) {
						local510 = local26[local31];
						local23--;
						Static78.anIntArray283[local510] = Static92.anIntArray362[local23];
						continue;
					}
					if (local206 == 35) {
						Static22.aClass78Array4[local33++] = Static101.aClass78Array17[local26[local31]];
						continue;
					}
					if (local206 == 36) {
						local510 = local26[local31];
						local33--;
						Static101.aClass78Array17[local510] = Static22.aClass78Array4[local33];
						continue;
					}
					if (local206 == 37) {
						local228 = local26[local31];
						local33 -= local228;
						local561 = Static97.method1689(local228, local33, Static22.aClass78Array4);
						Static22.aClass78Array4[local33++] = local561;
						continue;
					}
					if (local206 == 38) {
						local23--;
						continue;
					}
					if (local206 == 39) {
						local33--;
						continue;
					}
					if (local206 == 40) {
						local228 = local26[local31];
						@Pc(590) Class2_Sub3_Sub6 local590 = Static38.method517(local228);
						@Pc(594) int[] local594 = new int[local590.anInt1019];
						@Pc(598) Class78[] local598 = new Class78[local590.anInt1020];
						for (local600 = 0; local600 < local590.anInt1018; local600++) {
							local594[local600] = Static92.anIntArray362[local23 + local600 - local590.anInt1018];
						}
						for (local624 = 0; local624 < local590.anInt1017; local624++) {
							local598[local624] = Static22.aClass78Array4[local624 + local33 - local590.anInt1017];
						}
						local33 -= local590.anInt1017;
						local23 -= local590.anInt1018;
						@Pc(660) Class86 local660 = new Class86();
						local660.aClass2_Sub3_Sub6_1 = local16;
						local660.anInt4338 = local31;
						local660.anIntArray701 = Static78.anIntArray283;
						local660.aClass78Array33 = Static101.aClass78Array17;
						if (Static74.aClass86Array1.length <= Static198.anInt4485) {
							throw new RuntimeException();
						}
						Static74.aClass86Array1[Static198.anInt4485++] = local660;
						local16 = local590;
						Static101.aClass78Array17 = local598;
						local29 = local590.anIntArray167;
						Static78.anIntArray283 = local594;
						local26 = local590.anIntArray166;
						local31 = -1;
						continue;
					}
					if (local206 == 42) {
						Static92.anIntArray362[local23++] = Static171.anIntArray652[local26[local31]];
						continue;
					}
					if (local206 == 43) {
						local228 = local26[local31];
						local23--;
						Static171.anIntArray652[local228] = Static92.anIntArray362[local23];
						Static27.method363(local228);
						continue;
					}
					if (local206 == 44) {
						local228 = local26[local31] >> 16;
						local753 = local26[local31] & 0xFFFF;
						local23--;
						local758 = Static92.anIntArray362[local23];
						if (local758 >= 0 && local758 <= 5000) {
							@Pc(769) byte local769 = -1;
							Static140.anIntArray528[local228] = local758;
							if (local753 == 105) {
								local769 = 0;
							}
							local600 = 0;
							while (true) {
								if (local600 >= local758) {
									continue label3285;
								}
								Static7.anIntArrayArray5[local228][local600] = local769;
								local600++;
							}
						}
						throw new RuntimeException();
					}
					if (local206 == 45) {
						local23--;
						local753 = Static92.anIntArray362[local23];
						local228 = local26[local31];
						if (local753 >= 0 && local753 < Static140.anIntArray528[local228]) {
							Static92.anIntArray362[local23++] = Static7.anIntArrayArray5[local228][local753];
							continue;
						}
						throw new RuntimeException();
					}
					if (local206 == 46) {
						local228 = local26[local31];
						local23 -= 2;
						local753 = Static92.anIntArray362[local23];
						if (local753 >= 0 && Static140.anIntArray528[local228] > local753) {
							Static7.anIntArrayArray5[local228][local753] = Static92.anIntArray362[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local206 == 47) {
						@Pc(880) Class78 local880 = Static164.aClass78Array29[local26[local31]];
						if (local880 == null) {
							local880 = Static130.aClass78_584;
						}
						Static22.aClass78Array4[local33++] = local880;
						continue;
					}
					if (local206 == 48) {
						local228 = local26[local31];
						local33--;
						Static164.aClass78Array29[local228] = Static22.aClass78Array4[local33];
						Static52.method674(local228);
						continue;
					}
					if (local206 == 51) {
						@Pc(920) Class103 local920 = local16.aClass103Array1[local26[local31]];
						local23--;
						@Pc(930) Class2_Sub7 local930 = (Class2_Sub7) local920.method3659((long) Static92.anIntArray362[local23]);
						if (local930 != null) {
							local31 += local930.anInt534;
						}
						continue;
					}
				}
				@Pc(945) boolean local945;
				if (local26[local31] == 1) {
					local945 = true;
				} else {
					local945 = false;
				}
				@Pc(1096) Class64 local1096;
				@Pc(975) int local975;
				@Pc(1006) int local1006;
				@Pc(985) Class64 local985;
				@Pc(1167) Class64 local1167;
				if (local206 < 300) {
					if (local206 == 100) {
						local23 -= 3;
						local758 = Static92.anIntArray362[local23 + 1];
						local753 = Static92.anIntArray362[local23];
						local975 = Static92.anIntArray362[local23 + 2];
						if (local758 == 0) {
							throw new RuntimeException();
						}
						local985 = Static204.method3618(local753);
						if (local985.aClass64Array2 == null) {
							local985.aClass64Array2 = new Class64[local975 + 1];
						}
						if (local975 >= local985.aClass64Array2.length) {
							@Pc(1004) Class64[] local1004 = new Class64[local975 + 1];
							for (local1006 = 0; local1006 < local985.aClass64Array2.length; local1006++) {
								local1004[local1006] = local985.aClass64Array2[local1006];
							}
							local985.aClass64Array2 = local1004;
						}
						if (local975 > 0 && local985.aClass64Array2[local975 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local975 - 1));
						}
						@Pc(1053) Class64 local1053 = new Class64();
						local1053.aBoolean132 = true;
						local1053.anInt3075 = local1053.anInt3044 = local985.anInt3044;
						local1053.anInt3051 = local758;
						local1053.anInt2993 = local975;
						local985.aClass64Array2[local975] = local1053;
						if (local945) {
							Static225.aClass64_15 = local1053;
						} else {
							Static59.aClass64_5 = local1053;
						}
						Static70.method2259(local985);
						continue;
					}
					@Pc(1117) Class64 local1117;
					if (local206 == 101) {
						local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
						if (local1096.anInt2993 == -1) {
							if (local945) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1117 = Static204.method3618(local1096.anInt3044);
						local1117.aClass64Array2[local1096.anInt2993] = null;
						Static70.method2259(local1117);
						continue;
					}
					if (local206 == 102) {
						local23--;
						local1096 = Static204.method3618(Static92.anIntArray362[local23]);
						local1096.aClass64Array2 = null;
						Static70.method2259(local1096);
						continue;
					}
					if (local206 == 200) {
						local23 -= 2;
						local753 = Static92.anIntArray362[local23];
						local758 = Static92.anIntArray362[local23 + 1];
						local1167 = Static3.method79(local758, local753);
						if (local1167 != null && local758 != -1) {
							Static92.anIntArray362[local23++] = 1;
							if (local945) {
								Static225.aClass64_15 = local1167;
							} else {
								Static59.aClass64_5 = local1167;
							}
							continue;
						}
						Static92.anIntArray362[local23++] = 0;
						continue;
					}
					if (local206 == 201) {
						local23--;
						local753 = Static92.anIntArray362[local23];
						local1117 = Static204.method3618(local753);
						if (local1117 == null) {
							Static92.anIntArray362[local23++] = 0;
						} else {
							Static92.anIntArray362[local23++] = 1;
							if (local945) {
								Static225.aClass64_15 = local1117;
							} else {
								Static59.aClass64_5 = local1117;
							}
						}
						continue;
					}
				} else if (local206 < 500) {
					if (local206 == 403) {
						local23 -= 2;
						local753 = Static92.anIntArray362[local23];
						local758 = Static92.anIntArray362[local23 + 1];
						if (local753 >= 7) {
							local753 -= 7;
						}
						Static31.aClass5_Sub2_Sub2_1.aClass112_1.method3931(local753, local758);
						continue;
					}
					if (local206 == 404) {
						local23 -= 2;
						local758 = Static92.anIntArray362[local23 + 1];
						local753 = Static92.anIntArray362[local23];
						Static31.aClass5_Sub2_Sub2_1.aClass112_1.method3938(local758, local753);
						continue;
					}
					if (local206 == 410) {
						local23--;
						@Pc(1287) boolean local1287 = Static92.anIntArray362[local23] != 0;
						Static31.aClass5_Sub2_Sub2_1.aClass112_1.method3936(local1287);
						continue;
					}
				} else {
					@Pc(4983) boolean local4983;
					if (local206 >= 1000 && local206 < 1100 || local206 >= 2000 && local206 < 2100) {
						if (local206 >= 2000) {
							local206 -= 1000;
							local23--;
							local1096 = Static204.method3618(Static92.anIntArray362[local23]);
						} else {
							local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
						}
						if (local206 == 1000) {
							local23 -= 4;
							local1096.anInt3065 = Static92.anIntArray362[local23];
							local1096.anInt3036 = Static92.anIntArray362[local23 + 1];
							local758 = Static92.anIntArray362[local23 + 2];
							if (local758 < 0) {
								local758 = 0;
							} else if (local758 > 5) {
								local758 = 5;
							}
							local975 = Static92.anIntArray362[local23 + 3];
							local1096.aByte15 = (byte) local758;
							if (local975 < 0) {
								local975 = 0;
							} else if (local975 > 5) {
								local975 = 5;
							}
							local1096.aByte12 = (byte) local975;
							Static70.method2259(local1096);
							Static225.method3971(local1096);
							continue;
						}
						if (local206 == 1001) {
							local23 -= 4;
							local1096.anInt3018 = Static92.anIntArray362[local23];
							local1096.anInt3064 = Static92.anIntArray362[local23 + 1];
							local1096.anInt3013 = 0;
							local1096.anInt3068 = 0;
							local758 = Static92.anIntArray362[local23 + 2];
							if (local758 < 0) {
								local758 = 0;
							} else if (local758 > 4) {
								local758 = 4;
							}
							local975 = Static92.anIntArray362[local23 + 3];
							if (local975 < 0) {
								local975 = 0;
							} else if (local975 > 4) {
								local975 = 4;
							}
							local1096.aByte14 = (byte) local975;
							local1096.aByte13 = (byte) local758;
							Static70.method2259(local1096);
							if (local1096.anInt3051 == 0) {
								Static109.method1892(false, local1096);
							}
							Static225.method3971(local1096);
							continue;
						}
						if (local206 == 1003) {
							local23--;
							local4983 = Static92.anIntArray362[local23] == 1;
							if (local1096.aBoolean137 != local4983) {
								local1096.aBoolean137 = local4983;
								Static70.method2259(local1096);
							}
							continue;
						}
						if (local206 == 1004) {
							local23 -= 2;
							local1096.anInt3057 = Static92.anIntArray362[local23];
							local1096.anInt3071 = Static92.anIntArray362[local23 + 1];
							Static70.method2259(local1096);
							if (local1096.anInt3051 == 0) {
								Static109.method1892(false, local1096);
							}
							Static225.method3971(local1096);
							continue;
						}
					} else {
						@Pc(1654) Class78 local1654;
						if (local206 >= 1100 && local206 < 1200 || local206 >= 2100 && local206 < 2200) {
							if (local206 < 2000) {
								local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
							} else {
								local23--;
								local1096 = Static204.method3618(Static92.anIntArray362[local23]);
								local206 -= 1000;
							}
							if (local206 == 1100) {
								local23 -= 2;
								local1096.anInt3037 = Static92.anIntArray362[local23];
								if (local1096.anInt3074 - local1096.anInt3021 < local1096.anInt3037) {
									local1096.anInt3037 = local1096.anInt3074 - local1096.anInt3021;
								}
								if (local1096.anInt3037 < 0) {
									local1096.anInt3037 = 0;
								}
								local1096.anInt3046 = Static92.anIntArray362[local23 + 1];
								if (local1096.anInt3082 - local1096.anInt3040 < local1096.anInt3046) {
									local1096.anInt3046 = local1096.anInt3082 - local1096.anInt3040;
								}
								if (local1096.anInt3046 < 0) {
									local1096.anInt3046 = 0;
								}
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1101) {
								local23--;
								local1096.anInt3003 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1102) {
								local23--;
								local1096.aBoolean124 = Static92.anIntArray362[local23] == 1;
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1103) {
								local23--;
								local1096.anInt3047 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1104) {
								local23--;
								local1096.anInt2997 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1105) {
								local23--;
								local1096.anInt3076 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1106) {
								local23--;
								local1096.anInt3030 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1107) {
								local23--;
								local1096.aBoolean135 = Static92.anIntArray362[local23] == 1;
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1108) {
								local1096.anInt3024 = 1;
								local23--;
								local1096.anInt3067 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1109) {
								local23 -= 6;
								local1096.anInt3062 = Static92.anIntArray362[local23];
								local1096.anInt3015 = Static92.anIntArray362[local23 + 1];
								local1096.anInt2994 = Static92.anIntArray362[local23 + 2];
								local1096.anInt3028 = Static92.anIntArray362[local23 + 3];
								local1096.anInt3017 = Static92.anIntArray362[local23 + 4];
								local1096.anInt3012 = Static92.anIntArray362[local23 + 5];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1110) {
								local23--;
								local758 = Static92.anIntArray362[local23];
								if (local758 != local1096.anInt3058) {
									local1096.anInt3020 = 0;
									local1096.anInt3058 = local758;
									local1096.anInt3050 = 0;
									Static70.method2259(local1096);
								}
								continue;
							}
							if (local206 == 1111) {
								local23--;
								local1096.aBoolean129 = Static92.anIntArray362[local23] == 1;
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1112) {
								local33--;
								local1654 = Static22.aClass78Array4[local33];
								if (!local1654.method3043(local1096.aClass78_589)) {
									local1096.aClass78_589 = local1654;
									Static70.method2259(local1096);
								}
								continue;
							}
							if (local206 == 1113) {
								local23--;
								local1096.anInt3008 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1114) {
								local23 -= 3;
								local1096.anInt3080 = Static92.anIntArray362[local23];
								local1096.anInt3032 = Static92.anIntArray362[local23 + 1];
								local1096.anInt2999 = Static92.anIntArray362[local23 + 2];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1115) {
								local23--;
								local1096.aBoolean136 = Static92.anIntArray362[local23] == 1;
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1116) {
								local23--;
								local1096.anInt3007 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1117) {
								local23--;
								local1096.anInt3059 = Static92.anIntArray362[local23];
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1118) {
								local23--;
								local1096.aBoolean134 = Static92.anIntArray362[local23] == 1;
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1119) {
								local23--;
								local1096.aBoolean133 = Static92.anIntArray362[local23] == 1;
								Static70.method2259(local1096);
								continue;
							}
							if (local206 == 1120) {
								local23 -= 2;
								local1096.anInt3074 = Static92.anIntArray362[local23];
								local1096.anInt3082 = Static92.anIntArray362[local23 + 1];
								Static70.method2259(local1096);
								if (local1096.anInt3051 == 0) {
									Static109.method1892(false, local1096);
								}
								continue;
							}
							if (local206 == 1121) {
								Static70.method2259(local1096);
								local23 -= 2;
								continue;
							}
							if (local206 == 1122) {
								local23--;
								local1096.aBoolean125 = Static92.anIntArray362[local23] == 1;
								Static70.method2259(local1096);
								continue;
							}
						} else if (local206 >= 1200 && local206 < 1300 || !(local206 < 2200 || local206 >= 2300)) {
							if (local206 < 2000) {
								local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
							} else {
								local206 -= 1000;
								local23--;
								local1096 = Static204.method3618(Static92.anIntArray362[local23]);
							}
							Static70.method2259(local1096);
							if (local206 == 1200 || local206 == 1205) {
								local23 -= 2;
								local975 = Static92.anIntArray362[local23 + 1];
								local758 = Static92.anIntArray362[local23];
								if (local758 == -1) {
									local1096.anInt3024 = 1;
									local1096.anInt3029 = -1;
									local1096.anInt3067 = -1;
								} else {
									local1096.anInt3033 = local975;
									local1096.anInt3029 = local758;
									@Pc(1947) Class2_Sub3_Sub23 local1947 = Static32.method3209(local758);
									local1096.anInt3012 = local1947.anInt3518;
									if (local206 == 1205) {
										local1096.aBoolean131 = false;
									} else {
										local1096.aBoolean131 = true;
									}
									local1096.anInt3015 = local1947.anInt3494;
									local1096.anInt3062 = local1947.anInt3511;
									local1096.anInt2994 = local1947.anInt3483;
									local1096.anInt3028 = local1947.anInt3492;
									local1096.anInt3017 = local1947.anInt3514;
									if (local1096.anInt3013 > 0) {
										local1096.anInt3012 = local1096.anInt3012 * 32 / local1096.anInt3013;
									} else if (local1096.anInt3018 > 0) {
										local1096.anInt3012 = local1096.anInt3012 * 32 / local1096.anInt3018;
									}
								}
								continue;
							}
							if (local206 == 1201) {
								local1096.anInt3024 = 2;
								local23--;
								local1096.anInt3067 = Static92.anIntArray362[local23];
								continue;
							}
							if (local206 == 1202) {
								local1096.anInt3024 = 3;
								local1096.anInt3067 = Static31.aClass5_Sub2_Sub2_1.aClass112_1.method3935();
								continue;
							}
							if (local206 == 1203) {
								local1096.anInt3024 = 6;
								local23--;
								local1096.anInt3067 = Static92.anIntArray362[local23];
								continue;
							}
							if (local206 == 1204) {
								local1096.anInt3024 = 5;
								local23--;
								local1096.anInt3067 = Static92.anIntArray362[local23];
								continue;
							}
						} else if (local206 >= 1300 && local206 < 1400 || local206 >= 2300 && local206 < 2400) {
							if (local206 >= 2000) {
								local23--;
								local1096 = Static204.method3618(Static92.anIntArray362[local23]);
								local206 -= 1000;
							} else {
								local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
							}
							if (local206 == 1300) {
								local23--;
								local758 = Static92.anIntArray362[local23] - 1;
								if (local758 >= 0 && local758 <= 9) {
									local33--;
									local1096.method2408(local758, Static22.aClass78Array4[local33]);
									continue;
								}
								local33--;
								continue;
							}
							if (local206 == 1301) {
								local23 -= 2;
								local758 = Static92.anIntArray362[local23];
								local975 = Static92.anIntArray362[local23 + 1];
								local1096.aClass64_11 = Static3.method79(local975, local758);
								continue;
							}
							if (local206 == 1302) {
								local23--;
								local1096.aBoolean122 = Static92.anIntArray362[local23] == 1;
								continue;
							}
							if (local206 == 1303) {
								local23--;
								local1096.anInt3048 = Static92.anIntArray362[local23];
								continue;
							}
							if (local206 == 1304) {
								local23--;
								local1096.anInt3073 = Static92.anIntArray362[local23];
								continue;
							}
							if (local206 == 1305) {
								local33--;
								local1096.aClass78_587 = Static22.aClass78Array4[local33];
								continue;
							}
							if (local206 == 1306) {
								local33--;
								local1096.aClass78_590 = Static22.aClass78Array4[local33];
								continue;
							}
							if (local206 == 1307) {
								local1096.aClass78Array23 = null;
								continue;
							}
						} else {
							if (local206 >= 1400 && local206 < 1500 || local206 >= 2400 && local206 < 2500) {
								if (local206 < 2000) {
									local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
								} else {
									local206 -= 1000;
									local23--;
									local1096 = Static204.method3618(Static92.anIntArray362[local23]);
								}
								@Pc(10434) int[] local10434 = null;
								local33--;
								local1654 = Static22.aClass78Array4[local33];
								if (local1654.method3041() > 0 && local1654.method3042(local1654.method3041() - 1) == 89) {
									local23--;
									local600 = Static92.anIntArray362[local23];
									if (local600 > 0) {
										local10434 = new int[local600];
										while (local600-- > 0) {
											local23--;
											local10434[local600] = Static92.anIntArray362[local23];
										}
									}
									local1654 = local1654.method3010(0, local1654.method3041() - 1);
								}
								@Pc(10497) Object[] local10497 = new Object[local1654.method3041() + 1];
								for (local624 = local10497.length - 1; local624 >= 1; local624--) {
									if (local1654.method3042(local624 - 1) == 115) {
										local33--;
										local10497[local624] = Static22.aClass78Array4[local33];
									} else {
										local23--;
										local10497[local624] = Integer.valueOf(Static92.anIntArray362[local23]);
									}
								}
								local23--;
								local1006 = Static92.anIntArray362[local23];
								if (local1006 == -1) {
									local10497 = null;
								} else {
									local10497[0] = Integer.valueOf(local1006);
								}
								local1096.aBoolean130 = true;
								if (local206 == 1400) {
									local1096.anObjectArray9 = local10497;
								} else if (local206 == 1401) {
									local1096.anObjectArray31 = local10497;
								} else if (local206 == 1402) {
									local1096.anObjectArray8 = local10497;
								} else if (local206 == 1403) {
									local1096.anObjectArray10 = local10497;
								} else if (local206 == 1404) {
									local1096.anObjectArray4 = local10497;
								} else if (local206 == 1405) {
									local1096.anObjectArray3 = local10497;
								} else if (local206 == 1406) {
									local1096.anObjectArray14 = local10497;
								} else if (local206 == 1407) {
									local1096.anIntArray497 = local10434;
									local1096.anObjectArray20 = local10497;
								} else if (local206 == 1408) {
									local1096.anObjectArray30 = local10497;
								} else if (local206 == 1409) {
									local1096.anObjectArray16 = local10497;
								} else if (local206 == 1410) {
									local1096.anObjectArray21 = local10497;
								} else if (local206 == 1411) {
									local1096.anObjectArray29 = local10497;
								} else if (local206 == 1412) {
									local1096.anObjectArray25 = local10497;
								} else if (local206 == 1414) {
									local1096.anObjectArray2 = local10497;
									local1096.anIntArray500 = local10434;
								} else if (local206 == 1415) {
									local1096.anObjectArray23 = local10497;
									local1096.anIntArray499 = local10434;
								} else if (local206 == 1416) {
									local1096.anObjectArray22 = local10497;
								} else if (local206 == 1417) {
									local1096.anObjectArray24 = local10497;
								} else if (local206 == 1418) {
									local1096.anObjectArray17 = local10497;
								} else if (local206 == 1419) {
									local1096.anObjectArray18 = local10497;
								} else if (local206 == 1420) {
									local1096.anObjectArray7 = local10497;
								} else if (local206 == 1421) {
									local1096.anObjectArray5 = local10497;
								} else if (local206 == 1422) {
									local1096.anObjectArray12 = local10497;
								} else if (local206 == 1423) {
									local1096.anObjectArray27 = local10497;
								} else if (local206 == 1424) {
									local1096.anObjectArray11 = local10497;
								} else if (local206 == 1425) {
									local1096.anObjectArray28 = local10497;
								} else if (local206 == 1426) {
									local1096.anObjectArray19 = local10497;
								} else if (local206 == 1427) {
									local1096.anObjectArray6 = local10497;
								} else if (local206 == 1428) {
									local1096.anIntArray503 = local10434;
									local1096.anObjectArray26 = local10497;
								} else if (local206 == 1429) {
									local1096.anIntArray495 = local10434;
									local1096.anObjectArray15 = local10497;
								}
								continue;
							}
							if (local206 < 1600) {
								local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
								if (local206 == 1500) {
									Static92.anIntArray362[local23++] = local1096.anInt3004;
									continue;
								}
								if (local206 == 1501) {
									Static92.anIntArray362[local23++] = local1096.anInt3052;
									continue;
								}
								if (local206 == 1502) {
									Static92.anIntArray362[local23++] = local1096.anInt3021;
									continue;
								}
								if (local206 == 1503) {
									Static92.anIntArray362[local23++] = local1096.anInt3040;
									continue;
								}
								if (local206 == 1504) {
									Static92.anIntArray362[local23++] = local1096.aBoolean137 ? 1 : 0;
									continue;
								}
								if (local206 == 1505) {
									Static92.anIntArray362[local23++] = local1096.anInt3075;
									continue;
								}
							} else if (local206 < 1700) {
								local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
								if (local206 == 1600) {
									Static92.anIntArray362[local23++] = local1096.anInt3037;
									continue;
								}
								if (local206 == 1601) {
									Static92.anIntArray362[local23++] = local1096.anInt3046;
									continue;
								}
								if (local206 == 1602) {
									Static22.aClass78Array4[local33++] = local1096.aClass78_589;
									continue;
								}
								if (local206 == 1603) {
									Static92.anIntArray362[local23++] = local1096.anInt3074;
									continue;
								}
								if (local206 == 1604) {
									Static92.anIntArray362[local23++] = local1096.anInt3082;
									continue;
								}
								if (local206 == 1605) {
									Static92.anIntArray362[local23++] = local1096.anInt3012;
									continue;
								}
								if (local206 == 1606) {
									Static92.anIntArray362[local23++] = local1096.anInt2994;
									continue;
								}
								if (local206 == 1607) {
									Static92.anIntArray362[local23++] = local1096.anInt3017;
									continue;
								}
								if (local206 == 1608) {
									Static92.anIntArray362[local23++] = local1096.anInt3028;
									continue;
								}
								if (local206 == 1609) {
									Static92.anIntArray362[local23++] = local1096.anInt3047;
									continue;
								}
							} else if (local206 < 1800) {
								local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
								if (local206 == 1700) {
									Static92.anIntArray362[local23++] = local1096.anInt3029;
									continue;
								}
								if (local206 == 1701) {
									if (local1096.anInt3029 == -1) {
										Static92.anIntArray362[local23++] = 0;
									} else {
										Static92.anIntArray362[local23++] = local1096.anInt3033;
									}
									continue;
								}
								if (local206 == 1702) {
									Static92.anIntArray362[local23++] = local1096.anInt2993;
									continue;
								}
							} else if (local206 < 1900) {
								local1096 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
								if (local206 == 1800) {
									Static92.anIntArray362[local23++] = Static164.method2978(Static36.method473(local1096));
									continue;
								}
								if (local206 == 1801) {
									local23--;
									local758 = Static92.anIntArray362[local23];
									local758--;
									if (local1096.aClass78Array23 != null && local758 < local1096.aClass78Array23.length && local1096.aClass78Array23[local758] != null) {
										Static22.aClass78Array4[local33++] = local1096.aClass78Array23[local758];
										continue;
									}
									Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									continue;
								}
								if (local206 == 1802) {
									if (local1096.aClass78_587 == null) {
										Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									} else {
										Static22.aClass78Array4[local33++] = local1096.aClass78_587;
									}
									continue;
								}
							} else if (local206 < 2600) {
								local23--;
								local1096 = Static204.method3618(Static92.anIntArray362[local23]);
								if (local206 == 2500) {
									Static92.anIntArray362[local23++] = local1096.anInt3004;
									continue;
								}
								if (local206 == 2501) {
									Static92.anIntArray362[local23++] = local1096.anInt3052;
									continue;
								}
								if (local206 == 2502) {
									Static92.anIntArray362[local23++] = local1096.anInt3021;
									continue;
								}
								if (local206 == 2503) {
									Static92.anIntArray362[local23++] = local1096.anInt3040;
									continue;
								}
								if (local206 == 2504) {
									Static92.anIntArray362[local23++] = local1096.aBoolean137 ? 1 : 0;
									continue;
								}
								if (local206 == 2505) {
									Static92.anIntArray362[local23++] = local1096.anInt3075;
									continue;
								}
							} else if (local206 < 2700) {
								local23--;
								local1096 = Static204.method3618(Static92.anIntArray362[local23]);
								if (local206 == 2600) {
									Static92.anIntArray362[local23++] = local1096.anInt3037;
									continue;
								}
								if (local206 == 2601) {
									Static92.anIntArray362[local23++] = local1096.anInt3046;
									continue;
								}
								if (local206 == 2602) {
									Static22.aClass78Array4[local33++] = local1096.aClass78_589;
									continue;
								}
								if (local206 == 2603) {
									Static92.anIntArray362[local23++] = local1096.anInt3074;
									continue;
								}
								if (local206 == 2604) {
									Static92.anIntArray362[local23++] = local1096.anInt3082;
									continue;
								}
								if (local206 == 2605) {
									Static92.anIntArray362[local23++] = local1096.anInt3012;
									continue;
								}
								if (local206 == 2606) {
									Static92.anIntArray362[local23++] = local1096.anInt2994;
									continue;
								}
								if (local206 == 2607) {
									Static92.anIntArray362[local23++] = local1096.anInt3017;
									continue;
								}
								if (local206 == 2608) {
									Static92.anIntArray362[local23++] = local1096.anInt3028;
									continue;
								}
								if (local206 == 2609) {
									Static92.anIntArray362[local23++] = local1096.anInt3047;
									continue;
								}
							} else if (local206 < 2800) {
								if (local206 == 2700) {
									local23--;
									local1096 = Static204.method3618(Static92.anIntArray362[local23]);
									Static92.anIntArray362[local23++] = local1096.anInt3029;
									continue;
								}
								if (local206 == 2701) {
									local23--;
									local1096 = Static204.method3618(Static92.anIntArray362[local23]);
									if (local1096.anInt3029 == -1) {
										Static92.anIntArray362[local23++] = 0;
									} else {
										Static92.anIntArray362[local23++] = local1096.anInt3033;
									}
									continue;
								}
								if (local206 == 2702) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									@Pc(2537) Class2_Sub11 local2537 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local753);
									if (local2537 == null) {
										Static92.anIntArray362[local23++] = 0;
									} else {
										Static92.anIntArray362[local23++] = 1;
									}
									continue;
								}
								if (local206 == 2703) {
									local23--;
									local1096 = Static204.method3618(Static92.anIntArray362[local23]);
									if (local1096.aClass64Array2 == null) {
										Static92.anIntArray362[local23++] = 0;
										continue;
									}
									local758 = local1096.aClass64Array2.length;
									for (local975 = 0; local975 < local1096.aClass64Array2.length; local975++) {
										if (local1096.aClass64Array2[local975] == null) {
											local758 = local975;
											break;
										}
									}
									Static92.anIntArray362[local23++] = local758;
									continue;
								}
								if (local206 == 2704 || local206 == 2705) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									@Pc(2627) Class2_Sub11 local2627 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local753);
									if (local2627 != null && local758 == local2627.anInt726) {
										Static92.anIntArray362[local23++] = 1;
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
							} else if (local206 < 2900) {
								local23--;
								local1096 = Static204.method3618(Static92.anIntArray362[local23]);
								if (local206 == 2800) {
									Static92.anIntArray362[local23++] = Static164.method2978(Static36.method473(local1096));
									continue;
								}
								if (local206 == 2801) {
									local23--;
									local758 = Static92.anIntArray362[local23];
									local758--;
									if (local1096.aClass78Array23 != null && local1096.aClass78Array23.length > local758 && local1096.aClass78Array23[local758] != null) {
										Static22.aClass78Array4[local33++] = local1096.aClass78Array23[local758];
										continue;
									}
									Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									continue;
								}
								if (local206 == 2802) {
									if (local1096.aClass78_587 == null) {
										Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									} else {
										Static22.aClass78Array4[local33++] = local1096.aClass78_587;
									}
									continue;
								}
							} else if (local206 < 3200) {
								if (local206 == 3100) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static95.method1663(Static42.aClass78_141, local561, 0);
									continue;
								}
								if (local206 == 3101) {
									local23 -= 2;
									Static74.method1233(Static31.aClass5_Sub2_Sub2_1, Static92.anIntArray362[local23 + 1], Static92.anIntArray362[local23]);
									continue;
								}
								if (local206 == 3103) {
									Static12.method229();
									continue;
								}
								if (local206 == 3104) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local758 = 0;
									if (local561.method3007()) {
										local758 = local561.method3017();
									}
									Static161.aClass2_Sub23_Sub1_5.method2155(186);
									Static161.aClass2_Sub23_Sub1_5.method2134(local758);
									continue;
								}
								if (local206 == 3105) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static161.aClass2_Sub23_Sub1_5.method2155(132);
									Static161.aClass2_Sub23_Sub1_5.method2103(local561.method3016());
									continue;
								}
								if (local206 == 3106) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static161.aClass2_Sub23_Sub1_5.method2155(33);
									Static161.aClass2_Sub23_Sub1_5.method2132(local561.method3041() + 1);
									Static161.aClass2_Sub23_Sub1_5.method2085(local561);
									continue;
								}
								if (local206 == 3107) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									local33--;
									local1654 = Static22.aClass78Array4[local33];
									Static93.method1621(local1654, local753);
									continue;
								}
								if (local206 == 3108) {
									local23 -= 3;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									local975 = Static92.anIntArray362[local23 + 2];
									local985 = Static204.method3618(local975);
									Static99.method1694(local753, local758, local985);
									continue;
								}
								if (local206 == 3109) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									local1167 = local945 ? Static225.aClass64_15 : Static59.aClass64_5;
									Static99.method1694(local753, local758, local1167);
									continue;
								}
								if (local206 == 3110) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static161.aClass2_Sub23_Sub1_5.method2155(146);
									Static161.aClass2_Sub23_Sub1_5.method2117(local753);
									continue;
								}
							} else if (local206 < 3300) {
								if (local206 == 3200) {
									local23 -= 3;
									Static39.method531(Static92.anIntArray362[local23 + 1], Static92.anIntArray362[local23 + 2], Static92.anIntArray362[local23]);
									continue;
								}
								if (local206 == 3201) {
									local23--;
									Static124.method2236(Static92.anIntArray362[local23]);
									continue;
								}
								if (local206 == 3202) {
									local23 -= 2;
									Static22.method298(Static92.anIntArray362[local23], Static92.anIntArray362[local23 + 1]);
									continue;
								}
							} else if (local206 < 3400) {
								if (local206 == 3300) {
									Static92.anIntArray362[local23++] = Static123.anInt2808;
									continue;
								}
								if (local206 == 3301) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = Static134.method2445(local758, local753);
									continue;
								}
								if (local206 == 3302) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static212.method3698(local753, local758);
									continue;
								}
								if (local206 == 3303) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = Static164.method2977(local758, local753);
									continue;
								}
								if (local206 == 3304) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static142.method2536(local753).anInt3721;
									continue;
								}
								if (local206 == 3305) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static72.anIntArray745[local753];
									continue;
								}
								if (local206 == 3306) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static41.anIntArray129[local753];
									continue;
								}
								if (local206 == 3307) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static220.anIntArray772[local753];
									continue;
								}
								if (local206 == 3308) {
									local753 = Static137.anInt3136;
									local758 = (Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7) + Static28.anInt497;
									local975 = (Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7) + Static57.anInt628;
									Static92.anIntArray362[local23++] = local975 + (local753 << 28) + (local758 << 14);
									continue;
								}
								if (local206 == 3309) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = local753 >> 14 & 0x3FFF;
									continue;
								}
								if (local206 == 3310) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = local753 >> 28;
									continue;
								}
								if (local206 == 3311) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = local753 & 0x3FFF;
									continue;
								}
								if (local206 == 3312) {
									Static92.anIntArray362[local23++] = Static111.aBoolean104 ? 1 : 0;
									continue;
								}
								if (local206 == 3313) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23] + 32768;
									Static92.anIntArray362[local23++] = Static134.method2445(local758, local753);
									continue;
								}
								if (local206 == 3314) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23] + 32768;
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = Static212.method3698(local753, local758);
									continue;
								}
								if (local206 == 3315) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23] + 32768;
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = Static164.method2977(local758, local753);
									continue;
								}
								if (local206 == 3316) {
									if (Static66.anInt1320 >= 2) {
										Static92.anIntArray362[local23++] = Static66.anInt1320;
									} else {
										Static92.anIntArray362[local23++] = 0;
									}
									continue;
								}
								if (local206 == 3317) {
									Static92.anIntArray362[local23++] = Static2.anInt44;
									continue;
								}
								if (local206 == 3318) {
									Static92.anIntArray362[local23++] = Static77.anInt1691;
									continue;
								}
								if (local206 == 3321) {
									Static92.anIntArray362[local23++] = Static104.anInt2285;
									continue;
								}
								if (local206 == 3322) {
									Static92.anIntArray362[local23++] = Static10.anInt306;
									continue;
								}
								if (local206 == 3323) {
									if (Static9.anInt276 >= 5 && Static9.anInt276 <= 9) {
										Static92.anIntArray362[local23++] = 1;
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3324) {
									if (Static9.anInt276 >= 5 && Static9.anInt276 <= 9) {
										Static92.anIntArray362[local23++] = Static9.anInt276;
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3325) {
									if (Static116.anInt2733 > 0) {
										Static92.anIntArray362[local23++] = 1;
									} else {
										Static92.anIntArray362[local23++] = 0;
									}
									continue;
								}
								if (local206 == 3326) {
									Static92.anIntArray362[local23++] = Static31.aClass5_Sub2_Sub2_1.anInt1898;
									continue;
								}
								if (local206 == 3327) {
									Static92.anIntArray362[local23++] = Static31.aClass5_Sub2_Sub2_1.aClass112_1.aBoolean210 ? 1 : 0;
									continue;
								}
								if (local206 == 3328) {
									Static92.anIntArray362[local23++] = Static214.anInt4672;
									continue;
								}
								if (local206 == 3329) {
									Static92.anIntArray362[local23++] = Static143.anInt3257;
									continue;
								}
							} else if (local206 < 3500) {
								if (local206 == 3400) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									@Pc(9284) Class2_Sub3_Sub26 local9284 = Static13.method231(local753);
									Static22.aClass78Array4[local33++] = local9284.method2995(local758);
									continue;
								}
								if (local206 == 3408) {
									local23 -= 4;
									local753 = Static92.anIntArray362[local23];
									local975 = Static92.anIntArray362[local23 + 2];
									local600 = Static92.anIntArray362[local23 + 3];
									local758 = Static92.anIntArray362[local23 + 1];
									@Pc(9323) Class2_Sub3_Sub26 local9323 = Static13.method231(local975);
									if (local753 == local9323.anInt3813 && local758 == local9323.anInt3811) {
										if (local758 == 115) {
											Static22.aClass78Array4[local33++] = local9323.method2995(local600);
										} else {
											Static92.anIntArray362[local23++] = local9323.method2993(local600);
										}
										continue;
									}
									if (local758 == 115) {
										Static22.aClass78Array4[local33++] = Static130.aClass78_584;
									} else {
										Static92.anIntArray362[local23++] = 0;
									}
									continue;
								}
							} else if (local206 < 3700) {
								if (local206 == 3600) {
									if (Static99.anInt2152 == 0) {
										Static92.anIntArray362[local23++] = -2;
									} else if (Static99.anInt2152 == 1) {
										Static92.anIntArray362[local23++] = -1;
									} else {
										Static92.anIntArray362[local23++] = Static140.anInt3196;
									}
									continue;
								}
								if (local206 == 3601) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static99.anInt2152 == 2 && Static140.anInt3196 > local753) {
										Static22.aClass78Array4[local33++] = Static159.aClass78Array31[local753];
										continue;
									}
									Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									continue;
								}
								if (local206 == 3602) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static99.anInt2152 == 2 && local753 < Static140.anInt3196) {
										Static92.anIntArray362[local23++] = Static87.anIntArray347[local753];
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3603) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static99.anInt2152 == 2 && Static140.anInt3196 > local753) {
										Static92.anIntArray362[local23++] = Static125.anIntArray278[local753];
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3604) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local23--;
									local758 = Static92.anIntArray362[local23];
									Static66.method1078(local758, local561);
									continue;
								}
								if (local206 == 3605) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static221.method3890(local561.method3016());
									continue;
								}
								if (local206 == 3606) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static202.method3586(local561.method3016());
									continue;
								}
								if (local206 == 3607) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static67.method666(local561.method3016());
									continue;
								}
								if (local206 == 3608) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static72.method3702(local561.method3016());
									continue;
								}
								if (local206 == 3609) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									if (local561.method3027(Static155.aClass78_643) || local561.method3027(Static78.aClass78_378)) {
										local561 = local561.method3052(7);
									}
									Static92.anIntArray362[local23++] = Static38.method510(local561) ? 1 : 0;
									continue;
								}
								if (local206 == 3610) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static99.anInt2152 == 2 && local753 < Static140.anInt3196) {
										Static22.aClass78Array4[local33++] = Static193.aClass78Array34[local753];
										continue;
									}
									Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									continue;
								}
								if (local206 == 3611) {
									if (Static130.aClass78_583 == null) {
										Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									} else {
										Static22.aClass78Array4[local33++] = Static130.aClass78_583.method3048();
									}
									continue;
								}
								if (local206 == 3612) {
									if (Static130.aClass78_583 == null) {
										Static92.anIntArray362[local23++] = 0;
									} else {
										Static92.anIntArray362[local23++] = Static77.anInt1688;
									}
									continue;
								}
								if (local206 == 3613) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static130.aClass78_583 != null && local753 < Static77.anInt1688) {
										Static22.aClass78Array4[local33++] = Static146.aClass2_Sub10Array1[local753].aClass78_122.method3048();
										continue;
									}
									Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									continue;
								}
								if (local206 == 3614) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static130.aClass78_583 != null && local753 < Static77.anInt1688) {
										Static92.anIntArray362[local23++] = Static146.aClass2_Sub10Array1[local753].anInt688;
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3615) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static130.aClass78_583 != null && local753 < Static77.anInt1688) {
										Static92.anIntArray362[local23++] = Static146.aClass2_Sub10Array1[local753].aByte2;
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3616) {
									Static92.anIntArray362[local23++] = Static160.aByte16;
									continue;
								}
								if (local206 == 3617) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static35.method430(local561);
									continue;
								}
								if (local206 == 3618) {
									Static92.anIntArray362[local23++] = Static47.aByte3;
									continue;
								}
								if (local206 == 3619) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static21.method296(local561.method3016());
									continue;
								}
								if (local206 == 3620) {
									Static114.method1985();
									continue;
								}
								if (local206 == 3621) {
									if (Static99.anInt2152 == 0) {
										Static92.anIntArray362[local23++] = -1;
									} else {
										Static92.anIntArray362[local23++] = Static72.anInt4686;
									}
									continue;
								}
								if (local206 == 3622) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static99.anInt2152 != 0 && Static72.anInt4686 > local753) {
										Static22.aClass78Array4[local33++] = Static103.method1785(Static100.aLongArray6[local753]).method3048();
										continue;
									}
									Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									continue;
								}
								if (local206 == 3623) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									if (local561.method3027(Static155.aClass78_643) || local561.method3027(Static78.aClass78_378)) {
										local561 = local561.method3052(7);
									}
									Static92.anIntArray362[local23++] = Static102.method1741(local561) ? 1 : 0;
									continue;
								}
								if (local206 == 3624) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static146.aClass2_Sub10Array1 != null && local753 < Static77.anInt1688 && Static146.aClass2_Sub10Array1[local753].aClass78_122.method3038(Static31.aClass5_Sub2_Sub2_1.aClass78_423)) {
										Static92.anIntArray362[local23++] = 1;
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3625) {
									if (Static213.aClass78_449 == null) {
										Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									} else {
										Static22.aClass78Array4[local33++] = Static213.aClass78_449.method3048();
									}
									continue;
								}
								if (local206 == 3626) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static130.aClass78_583 != null && local753 < Static77.anInt1688) {
										Static22.aClass78Array4[local33++] = Static146.aClass2_Sub10Array1[local753].aClass78_123;
										continue;
									}
									Static22.aClass78Array4[local33++] = Static42.aClass78_141;
									continue;
								}
								if (local206 == 3627) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									if (Static99.anInt2152 == 2 && local753 >= 0 && local753 < Static140.anInt3196) {
										Static92.anIntArray362[local23++] = Static43.aBooleanArray25[local753] ? 1 : 0;
										continue;
									}
									Static92.anIntArray362[local23++] = 0;
									continue;
								}
								if (local206 == 3628) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									if (local561.method3027(Static155.aClass78_643) || local561.method3027(Static78.aClass78_378)) {
										local561 = local561.method3052(7);
									}
									Static92.anIntArray362[local23++] = Static158.method2850(local561);
									continue;
								}
							} else if (local206 < 4000) {
								if (local206 == 3903) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static45.aClass29Array1[local753].method632();
									continue;
								}
								if (local206 == 3904) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static45.aClass29Array1[local753].anInt872;
									continue;
								}
								if (local206 == 3905) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static45.aClass29Array1[local753].anInt874;
									continue;
								}
								if (local206 == 3906) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static45.aClass29Array1[local753].anInt863;
									continue;
								}
								if (local206 == 3907) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static45.aClass29Array1[local753].anInt873;
									continue;
								}
								if (local206 == 3908) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static45.aClass29Array1[local753].anInt869;
									continue;
								}
								if (local206 == 3910) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									local758 = Static45.aClass29Array1[local753].method631();
									Static92.anIntArray362[local23++] = local758 == 0 ? 1 : 0;
									continue;
								}
								if (local206 == 3911) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									local758 = Static45.aClass29Array1[local753].method631();
									Static92.anIntArray362[local23++] = local758 == 2 ? 1 : 0;
									continue;
								}
								if (local206 == 3912) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									local758 = Static45.aClass29Array1[local753].method631();
									Static92.anIntArray362[local23++] = local758 == 5 ? 1 : 0;
									continue;
								}
								if (local206 == 3913) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									local758 = Static45.aClass29Array1[local753].method631();
									Static92.anIntArray362[local23++] = local758 == 1 ? 1 : 0;
									continue;
								}
							} else if (local206 < 4100) {
								if (local206 == 4000) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local753 + local758;
									continue;
								}
								if (local206 == 4001) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local753 - local758;
									continue;
								}
								if (local206 == 4002) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local753 * local758;
									continue;
								}
								if (local206 == 4003) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local753 / local758;
									continue;
								}
								if (local206 == 4004) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = (int) (Math.random() * (double) local753);
									continue;
								}
								if (local206 == 4005) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = (int) (Math.random() * (double) (local753 + 1));
									continue;
								}
								if (local206 == 4006) {
									local23 -= 5;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									local600 = Static92.anIntArray362[local23 + 3];
									local975 = Static92.anIntArray362[local23 + 2];
									local624 = Static92.anIntArray362[local23 + 4];
									Static92.anIntArray362[local23++] = local753 + (local624 - local975) * (-local753 + local758) / (local600 - local975);
									continue;
								}
								@Pc(8707) long local8707;
								@Pc(8700) long local8700;
								if (local206 == 4007) {
									local23 -= 2;
									local8700 = Static92.anIntArray362[local23];
									local8707 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = (int) (local8700 * local8707 / 100L + local8700);
									continue;
								}
								if (local206 == 4008) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local753 | 0x1 << local758;
									continue;
								}
								if (local206 == 4009) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = -(0x1 << local758) - 1 & local753;
									continue;
								}
								if (local206 == 4010) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = (local753 & 0x1 << local758) == 0 ? 0 : 1;
									continue;
								}
								if (local206 == 4011) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = local753 % local758;
									continue;
								}
								if (local206 == 4012) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									if (local753 == 0) {
										Static92.anIntArray362[local23++] = 0;
									} else {
										Static92.anIntArray362[local23++] = (int) Math.pow((double) local753, (double) local758);
									}
									continue;
								}
								if (local206 == 4013) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									if (local753 == 0) {
										Static92.anIntArray362[local23++] = 0;
									} else if (local758 == 0) {
										Static92.anIntArray362[local23++] = Integer.MAX_VALUE;
									} else {
										Static92.anIntArray362[local23++] = (int) Math.pow((double) local753, 1.0D / (double) local758);
									}
									continue;
								}
								if (local206 == 4014) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = local758 & local753;
									continue;
								}
								if (local206 == 4015) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local753 | local758;
									continue;
								}
								if (local206 == 4016) {
									local23 -= 2;
									local753 = Static92.anIntArray362[local23];
									local758 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local753 < local758 ? local753 : local758;
									continue;
								}
								if (local206 == 4017) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = local753 > local758 ? local753 : local758;
									continue;
								}
								if (local206 == 4018) {
									local23 -= 3;
									local8707 = Static92.anIntArray362[local23 + 1];
									@Pc(9031) long local9031 = (long) Static92.anIntArray362[local23 + 2];
									local8700 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = (int) (local8700 * local9031 / local8707);
									continue;
								}
							} else if (local206 < 4200) {
								if (local206 == 4100) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local23--;
									local758 = Static92.anIntArray362[local23];
									Static22.aClass78Array4[local33++] = Static94.method1640(new Class78[] { local561, Static19.method268(local758) });
									continue;
								}
								if (local206 == 4101) {
									local33 -= 2;
									local561 = Static22.aClass78Array4[local33];
									local1654 = Static22.aClass78Array4[local33 + 1];
									Static22.aClass78Array4[local33++] = Static94.method1640(new Class78[] { local561, local1654 });
									continue;
								}
								if (local206 == 4102) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local23--;
									local758 = Static92.anIntArray362[local23];
									Static22.aClass78Array4[local33++] = Static94.method1640(new Class78[] { local561, Static161.method2898(local758) });
									continue;
								}
								if (local206 == 4103) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static22.aClass78Array4[local33++] = local561.method3005();
									continue;
								}
								if (local206 == 4104) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									@Pc(3528) long local3528 = ((long) local753 + 11745L) * 86400000L;
									Static114.aCalendar1.setTime(new Date(local3528));
									local600 = Static114.aCalendar1.get(5);
									local624 = Static114.aCalendar1.get(2);
									local1006 = Static114.aCalendar1.get(1);
									Static22.aClass78Array4[local33++] = Static94.method1640(new Class78[] { Static19.method268(local600), Static33.aClass78_103, Static195.aClass78Array35[local624], Static33.aClass78_103, Static19.method268(local1006) });
									continue;
								}
								if (local206 == 4105) {
									local33 -= 2;
									local561 = Static22.aClass78Array4[local33];
									local1654 = Static22.aClass78Array4[local33 + 1];
									if (Static31.aClass5_Sub2_Sub2_1.aClass112_1 != null && Static31.aClass5_Sub2_Sub2_1.aClass112_1.aBoolean210) {
										Static22.aClass78Array4[local33++] = local1654;
										continue;
									}
									Static22.aClass78Array4[local33++] = local561;
									continue;
								}
								if (local206 == 4106) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static22.aClass78Array4[local33++] = Static19.method268(local753);
									continue;
								}
								if (local206 == 4107) {
									local33 -= 2;
									Static92.anIntArray362[local23++] = Static22.aClass78Array4[local33].method3004(Static22.aClass78Array4[local33 + 1]);
									continue;
								}
								@Pc(3680) byte[] local3680;
								@Pc(3685) Class2_Sub3_Sub7_Sub1_Sub1 local3685;
								if (local206 == 4108) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23];
									local975 = Static92.anIntArray362[local23 + 1];
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local3680 = Static170.aClass72_Sub1_29.method3197(0, local975);
									local3685 = new Class2_Sub3_Sub7_Sub1_Sub1(local3680);
									local3685.method880(Static73.aClass79Array5, null);
									Static92.anIntArray362[local23++] = local3685.method893(local561, local758);
									continue;
								}
								if (local206 == 4109) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local23 -= 2;
									local758 = Static92.anIntArray362[local23];
									local975 = Static92.anIntArray362[local23 + 1];
									local3680 = Static170.aClass72_Sub1_29.method3197(0, local975);
									local3685 = new Class2_Sub3_Sub7_Sub1_Sub1(local3680);
									local3685.method880(Static73.aClass79Array5, null);
									Static92.anIntArray362[local23++] = local3685.method887(local561, local758);
									continue;
								}
								if (local206 == 4110) {
									local33 -= 2;
									local1654 = Static22.aClass78Array4[local33 + 1];
									local561 = Static22.aClass78Array4[local33];
									local23--;
									if (Static92.anIntArray362[local23] == 1) {
										Static22.aClass78Array4[local33++] = local561;
									} else {
										Static22.aClass78Array4[local33++] = local1654;
									}
									continue;
								}
								if (local206 == 4111) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									Static22.aClass78Array4[local33++] = Static135.method894(local561);
									continue;
								}
								if (local206 == 4112) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local23--;
									local758 = Static92.anIntArray362[local23];
									if (local758 == -1) {
										throw new RuntimeException("null char");
									}
									Static22.aClass78Array4[local33++] = local561.method3031(local758);
									continue;
								}
								if (local206 == 4113) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static109.method1893(local753) ? 1 : 0;
									continue;
								}
								if (local206 == 4114) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static97.method1686(local753) ? 1 : 0;
									continue;
								}
								if (local206 == 4115) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static44.method587(local753) ? 1 : 0;
									continue;
								}
								if (local206 == 4116) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static65.method1051(local753) ? 1 : 0;
									continue;
								}
								if (local206 == 4117) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									if (local561 == null) {
										Static92.anIntArray362[local23++] = 0;
									} else {
										Static92.anIntArray362[local23++] = local561.method3041();
									}
									continue;
								}
								if (local206 == 4118) {
									local23 -= 2;
									local975 = Static92.anIntArray362[local23 + 1];
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local758 = Static92.anIntArray362[local23];
									Static22.aClass78Array4[local33++] = local561.method3010(local758, local975);
									continue;
								}
								if (local206 == 4119) {
									local33--;
									local561 = Static22.aClass78Array4[local33];
									@Pc(3970) boolean local3970 = false;
									local1654 = Static167.method3037(local561.method3041());
									for (local600 = 0; local600 < local561.method3041(); local600++) {
										local624 = local561.method3042(local600);
										if (local624 == 60) {
											local3970 = true;
										} else if (local624 == 62) {
											local3970 = false;
										} else if (!local3970) {
											local1654.method3008(local624);
										}
									}
									local1654.method3002();
									Static22.aClass78Array4[local33++] = local1654;
									continue;
								}
								if (local206 == 4120) {
									local23 -= 2;
									local33--;
									local561 = Static22.aClass78Array4[local33];
									local758 = Static92.anIntArray362[local23];
									local975 = Static92.anIntArray362[local23 + 1];
									Static92.anIntArray362[local23++] = local561.method3021(local758, local975);
									continue;
								}
								if (local206 == 4121) {
									local33 -= 2;
									local561 = Static22.aClass78Array4[local33];
									local1654 = Static22.aClass78Array4[local33 + 1];
									local23--;
									local975 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = local561.method3006(local1654, local975);
									continue;
								}
								if (local206 == 4122) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static10.method220(local753);
									continue;
								}
								if (local206 == 4123) {
									local23--;
									local753 = Static92.anIntArray362[local23];
									Static92.anIntArray362[local23++] = Static142.method2538(local753);
									continue;
								}
							} else {
								@Pc(4391) Class2_Sub3_Sub10 local4391;
								if (local206 < 4300) {
									if (local206 == 4200) {
										local23--;
										local753 = Static92.anIntArray362[local23];
										Static22.aClass78Array4[local33++] = Static32.method3209(local753).aClass78_640;
										continue;
									}
									@Pc(4155) Class2_Sub3_Sub23 local4155;
									if (local206 == 4201) {
										local23 -= 2;
										local758 = Static92.anIntArray362[local23 + 1];
										local753 = Static92.anIntArray362[local23];
										local4155 = Static32.method3209(local753);
										if (local758 >= 1 && local758 <= 5 && local4155.aClass78Array25[local758 - 1] != null) {
											Static22.aClass78Array4[local33++] = local4155.aClass78Array25[local758 - 1];
											continue;
										}
										Static22.aClass78Array4[local33++] = Static42.aClass78_141;
										continue;
									}
									if (local206 == 4202) {
										local23 -= 2;
										local758 = Static92.anIntArray362[local23 + 1];
										local753 = Static92.anIntArray362[local23];
										local4155 = Static32.method3209(local753);
										if (local758 >= 1 && local758 <= 5 && local4155.aClass78Array24[local758 - 1] != null) {
											Static22.aClass78Array4[local33++] = local4155.aClass78Array24[local758 - 1];
											continue;
										}
										Static22.aClass78Array4[local33++] = Static42.aClass78_141;
										continue;
									}
									if (local206 == 4203) {
										local23--;
										local753 = Static92.anIntArray362[local23];
										Static92.anIntArray362[local23++] = Static32.method3209(local753).anInt3473;
										continue;
									}
									if (local206 == 4204) {
										local23--;
										local753 = Static92.anIntArray362[local23];
										Static92.anIntArray362[local23++] = Static32.method3209(local753).anInt3505 == 1 ? 1 : 0;
										continue;
									}
									@Pc(4292) Class2_Sub3_Sub23 local4292;
									if (local206 == 4205) {
										local23--;
										local753 = Static92.anIntArray362[local23];
										local4292 = Static32.method3209(local753);
										if (local4292.anInt3495 == -1 && local4292.anInt3476 >= 0) {
											Static92.anIntArray362[local23++] = local4292.anInt3476;
											continue;
										}
										Static92.anIntArray362[local23++] = local753;
										continue;
									}
									if (local206 == 4206) {
										local23--;
										local753 = Static92.anIntArray362[local23];
										local4292 = Static32.method3209(local753);
										if (local4292.anInt3495 >= 0 && local4292.anInt3476 >= 0) {
											Static92.anIntArray362[local23++] = local4292.anInt3476;
											continue;
										}
										Static92.anIntArray362[local23++] = local753;
										continue;
									}
									if (local206 == 4207) {
										local23--;
										local753 = Static92.anIntArray362[local23];
										Static92.anIntArray362[local23++] = Static32.method3209(local753).aBoolean154 ? 1 : 0;
										continue;
									}
									if (local206 == 4208) {
										local23 -= 2;
										local753 = Static92.anIntArray362[local23];
										local758 = Static92.anIntArray362[local23 + 1];
										local4391 = Static78.method1324(local758);
										if (local4391.method1081()) {
											Static22.aClass78Array4[local33++] = Static32.method3209(local753).method2726(local4391.aClass78_316, local758);
										} else {
											Static92.anIntArray362[local23++] = Static32.method3209(local753).method2722(local758, local4391.anInt1314);
										}
										continue;
									}
									if (local206 == 4210) {
										local33--;
										local561 = Static22.aClass78Array4[local33];
										local23--;
										local758 = Static92.anIntArray362[local23];
										Static72.method3711(local561, local758 == 1);
										Static92.anIntArray362[local23++] = Static112.anInt2453;
										continue;
									}
									if (local206 == 4211) {
										if (Static42.aShortArray25 != null && Static112.anInt2453 > Static100.anInt2195) {
											Static92.anIntArray362[local23++] = Static42.aShortArray25[Static100.anInt2195++] & 0xFFFF;
											continue;
										}
										Static92.anIntArray362[local23++] = -1;
										continue;
									}
									if (local206 == 4212) {
										Static100.anInt2195 = 0;
										continue;
									}
								} else if (local206 < 4400) {
									if (local206 == 4300) {
										local23 -= 2;
										local753 = Static92.anIntArray362[local23];
										local758 = Static92.anIntArray362[local23 + 1];
										local4391 = Static78.method1324(local758);
										if (local4391.method1081()) {
											Static22.aClass78Array4[local33++] = Static35.method432(local753).method1063(local758, local4391.aClass78_316);
										} else {
											Static92.anIntArray362[local23++] = Static35.method432(local753).method1057(local758, local4391.anInt1314);
										}
										continue;
									}
								} else if (local206 >= 4500) {
									if (local206 < 4600) {
										if (local206 == 4500) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											local4391 = Static78.method1324(local758);
											if (local4391.method1081()) {
												Static22.aClass78Array4[local33++] = Static116.method2150(local753).method1231(local4391.aClass78_316, local758);
											} else {
												Static92.anIntArray362[local23++] = Static116.method2150(local753).method1235(local4391.anInt1314, local758);
											}
											continue;
										}
									} else if (local206 < 5100) {
										if (local206 == 5000) {
											Static92.anIntArray362[local23++] = Static33.anInt568;
											continue;
										}
										if (local206 == 5001) {
											local23 -= 3;
											Static33.anInt568 = Static92.anIntArray362[local23];
											Static181.anInt4197 = Static92.anIntArray362[local23 + 1];
											Static183.anInt4263 = Static92.anIntArray362[local23 + 2];
											Static161.aClass2_Sub23_Sub1_5.method2155(120);
											Static161.aClass2_Sub23_Sub1_5.method2132(Static33.anInt568);
											Static161.aClass2_Sub23_Sub1_5.method2132(Static181.anInt4197);
											Static161.aClass2_Sub23_Sub1_5.method2132(Static183.anInt4263);
											continue;
										}
										if (local206 == 5002) {
											local23 -= 2;
											local758 = Static92.anIntArray362[local23];
											local33--;
											local561 = Static22.aClass78Array4[local33];
											local975 = Static92.anIntArray362[local23 + 1];
											Static161.aClass2_Sub23_Sub1_5.method2155(9);
											Static161.aClass2_Sub23_Sub1_5.method2103(local561.method3016());
											Static161.aClass2_Sub23_Sub1_5.method2132(local758 - 1);
											Static161.aClass2_Sub23_Sub1_5.method2132(local975);
											continue;
										}
										if (local206 == 5003) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											local1654 = null;
											if (local753 < 100) {
												local1654 = Static155.aClass78Array26[local753];
											}
											if (local1654 == null) {
												local1654 = Static42.aClass78_141;
											}
											Static22.aClass78Array4[local33++] = local1654;
											continue;
										}
										if (local206 == 5004) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											local758 = -1;
											if (local753 < 100 && Static155.aClass78Array26[local753] != null) {
												local758 = Static37.anIntArray107[local753];
											}
											Static92.anIntArray362[local23++] = local758;
											continue;
										}
										if (local206 == 5005) {
											Static92.anIntArray362[local23++] = Static181.anInt4197;
											continue;
										}
										if (local206 == 5008) {
											local33--;
											local561 = Static22.aClass78Array4[local33];
											if (local561.method3027(Static180.aClass78_728)) {
												Static104.method1790(local561);
												continue;
											}
											if (Static66.anInt1320 == 0 && (Static214.anInt4672 == 1 || Static143.anInt3257 == 1)) {
												continue;
											}
											@Pc(7051) byte local7051 = 0;
											local1654 = local561.method3005();
											@Pc(7057) byte local7057 = 0;
											if (local1654.method3027(Static200.aClass78_795)) {
												local561 = local561.method3052(Static200.aClass78_795.method3041());
												local7057 = 0;
											} else if (local1654.method3027(Static177.aClass78_714)) {
												local561 = local561.method3052(Static177.aClass78_714.method3041());
												local7057 = 1;
											} else if (local1654.method3027(Static43.aClass78_146)) {
												local561 = local561.method3052(Static43.aClass78_146.method3041());
												local7057 = 2;
											} else if (local1654.method3027(Static1.aClass78_2)) {
												local561 = local561.method3052(Static1.aClass78_2.method3041());
												local7057 = 3;
											} else if (local1654.method3027(Static112.aClass78_522)) {
												local7057 = 4;
												local561 = local561.method3052(Static112.aClass78_522.method3041());
											} else if (local1654.method3027(Static78.aClass78_375)) {
												local561 = local561.method3052(Static78.aClass78_375.method3041());
												local7057 = 5;
											} else if (local1654.method3027(Static89.aClass78_437)) {
												local561 = local561.method3052(Static89.aClass78_437.method3041());
												local7057 = 6;
											} else if (local1654.method3027(Static39.aClass78_133)) {
												local7057 = 7;
												local561 = local561.method3052(Static39.aClass78_133.method3041());
											} else if (local1654.method3027(Static168.aClass78_848)) {
												local7057 = 8;
												local561 = local561.method3052(Static168.aClass78_848.method3041());
											} else if (local1654.method3027(Static188.aClass78_746)) {
												local561 = local561.method3052(Static188.aClass78_746.method3041());
												local7057 = 9;
											} else if (local1654.method3027(Static22.aClass78_81)) {
												local7057 = 10;
												local561 = local561.method3052(Static22.aClass78_81.method3041());
											} else if (local1654.method3027(Static18.aClass78_57)) {
												local561 = local561.method3052(Static18.aClass78_57.method3041());
												local7057 = 11;
											} else if (Static211.anInt4647 != 0) {
												if (local1654.method3027(Static200.aClass78_792)) {
													local7057 = 0;
													local561 = local561.method3052(Static200.aClass78_792.method3041());
												} else if (local1654.method3027(Static177.aClass78_710)) {
													local561 = local561.method3052(Static177.aClass78_710.method3041());
													local7057 = 1;
												} else if (local1654.method3027(Static43.aClass78_144)) {
													local7057 = 2;
													local561 = local561.method3052(Static43.aClass78_144.method3041());
												} else if (local1654.method3027(Static1.aClass78_1)) {
													local561 = local561.method3052(Static1.aClass78_1.method3041());
													local7057 = 3;
												} else if (local1654.method3027(Static112.aClass78_525)) {
													local7057 = 4;
													local561 = local561.method3052(Static112.aClass78_525.method3041());
												} else if (local1654.method3027(Static78.aClass78_376)) {
													local561 = local561.method3052(Static78.aClass78_376.method3041());
													local7057 = 5;
												} else if (local1654.method3027(Static89.aClass78_434)) {
													local561 = local561.method3052(Static89.aClass78_434.method3041());
													local7057 = 6;
												} else if (local1654.method3027(Static39.aClass78_136)) {
													local7057 = 7;
													local561 = local561.method3052(Static39.aClass78_136.method3041());
												} else if (local1654.method3027(Static168.aClass78_851)) {
													local561 = local561.method3052(Static168.aClass78_851.method3041());
													local7057 = 8;
												} else if (local1654.method3027(Static188.aClass78_744)) {
													local7057 = 9;
													local561 = local561.method3052(Static188.aClass78_744.method3041());
												} else if (local1654.method3027(Static22.aClass78_80)) {
													local561 = local561.method3052(Static22.aClass78_80.method3041());
													local7057 = 10;
												} else if (local1654.method3027(Static18.aClass78_58)) {
													local561 = local561.method3052(Static18.aClass78_58.method3041());
													local7057 = 11;
												}
											}
											local1654 = local561.method3005();
											if (local1654.method3027(Static95.aClass78_465)) {
												local561 = local561.method3052(Static95.aClass78_465.method3041());
												local7051 = 1;
											} else if (local1654.method3027(Static189.aClass78_747)) {
												local561 = local561.method3052(Static189.aClass78_747.method3041());
												local7051 = 2;
											} else if (local1654.method3027(Static45.aClass78_157)) {
												local7051 = 3;
												local561 = local561.method3052(Static45.aClass78_157.method3041());
											} else if (local1654.method3027(Static159.aClass78_725)) {
												local561 = local561.method3052(Static159.aClass78_725.method3041());
												local7051 = 4;
											} else if (local1654.method3027(Static190.aClass78_755)) {
												local561 = local561.method3052(Static190.aClass78_755.method3041());
												local7051 = 5;
											} else if (Static211.anInt4647 != 0) {
												if (local1654.method3027(Static95.aClass78_462)) {
													local561 = local561.method3052(Static95.aClass78_462.method3041());
													local7051 = 1;
												} else if (local1654.method3027(Static189.aClass78_751)) {
													local7051 = 2;
													local561 = local561.method3052(Static189.aClass78_751.method3041());
												} else if (local1654.method3027(Static45.aClass78_156)) {
													local7051 = 3;
													local561 = local561.method3052(Static45.aClass78_156.method3041());
												} else if (local1654.method3027(Static159.aClass78_726)) {
													local561 = local561.method3052(Static159.aClass78_726.method3041());
													local7051 = 4;
												} else if (local1654.method3027(Static190.aClass78_756)) {
													local561 = local561.method3052(Static190.aClass78_756.method3041());
													local7051 = 5;
												}
											}
											Static161.aClass2_Sub23_Sub1_5.method2155(76);
											Static161.aClass2_Sub23_Sub1_5.method2132(0);
											local624 = Static161.aClass2_Sub23_Sub1_5.anInt2703;
											Static161.aClass2_Sub23_Sub1_5.method2132(local7057);
											Static161.aClass2_Sub23_Sub1_5.method2132(local7051);
											Static57.method456(Static161.aClass2_Sub23_Sub1_5, local561);
											Static161.aClass2_Sub23_Sub1_5.method2093(Static161.aClass2_Sub23_Sub1_5.anInt2703 - local624);
											continue;
										}
										if (local206 == 5009) {
											local33 -= 2;
											local561 = Static22.aClass78Array4[local33];
											local1654 = Static22.aClass78Array4[local33 + 1];
											if (Static66.anInt1320 != 0 || Static214.anInt4672 != 1 && Static143.anInt3257 != 1) {
												Static161.aClass2_Sub23_Sub1_5.method2155(168);
												Static161.aClass2_Sub23_Sub1_5.method2132(0);
												local975 = Static161.aClass2_Sub23_Sub1_5.anInt2703;
												Static161.aClass2_Sub23_Sub1_5.method2103(local561.method3016());
												Static57.method456(Static161.aClass2_Sub23_Sub1_5, local1654);
												Static161.aClass2_Sub23_Sub1_5.method2093(Static161.aClass2_Sub23_Sub1_5.anInt2703 - local975);
											}
											continue;
										}
										if (local206 == 5010) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											local1654 = null;
											if (local753 < 100) {
												local1654 = Static185.aClass78Array32[local753];
											}
											if (local1654 == null) {
												local1654 = Static42.aClass78_141;
											}
											Static22.aClass78Array4[local33++] = local1654;
											continue;
										}
										if (local206 == 5011) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											local1654 = null;
											if (local753 < 100) {
												local1654 = Static45.aClass78Array7[local753];
											}
											if (local1654 == null) {
												local1654 = Static42.aClass78_141;
											}
											Static22.aClass78Array4[local33++] = local1654;
											continue;
										}
										if (local206 == 5012) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											local758 = -1;
											if (local753 < 100) {
												local758 = Static75.anIntArray276[local753];
											}
											Static92.anIntArray362[local23++] = local758;
											continue;
										}
										if (local206 == 5015) {
											if (Static31.aClass5_Sub2_Sub2_1 == null || Static31.aClass5_Sub2_Sub2_1.aClass78_423 == null) {
												local561 = Static73.aClass78_351;
											} else {
												local561 = Static31.aClass5_Sub2_Sub2_1.aClass78_423;
											}
											Static22.aClass78Array4[local33++] = local561;
											continue;
										}
										if (local206 == 5016) {
											Static92.anIntArray362[local23++] = Static183.anInt4263;
											continue;
										}
										if (local206 == 5017) {
											Static92.anIntArray362[local23++] = Static224.anInt4848;
											continue;
										}
										if (local206 == 5050) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											Static22.aClass78Array4[local33++] = Static5.method94(local753).aClass78_129;
											continue;
										}
										@Pc(7845) Class2_Sub3_Sub4 local7845;
										if (local206 == 5051) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											local7845 = Static5.method94(local753);
											if (local7845.anIntArray118 == null) {
												Static92.anIntArray362[local23++] = 0;
											} else {
												Static92.anIntArray362[local23++] = local7845.anIntArray118.length;
											}
											continue;
										}
										if (local206 == 5052) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											@Pc(7880) Class2_Sub3_Sub4 local7880 = Static5.method94(local753);
											local600 = local7880.anIntArray118[local758];
											Static92.anIntArray362[local23++] = local600;
											continue;
										}
										if (local206 == 5053) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											local7845 = Static5.method94(local753);
											if (local7845.anIntArray115 == null) {
												Static92.anIntArray362[local23++] = 0;
											} else {
												Static92.anIntArray362[local23++] = local7845.anIntArray115.length;
											}
											continue;
										}
										if (local206 == 5054) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											Static92.anIntArray362[local23++] = Static5.method94(local753).anIntArray115[local758];
											continue;
										}
										if (local206 == 5055) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											Static22.aClass78Array4[local33++] = Static5.method98(local753).method2922();
											continue;
										}
										if (local206 == 5056) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											@Pc(7981) Class2_Sub3_Sub25 local7981 = Static5.method98(local753);
											if (local7981.anIntArray626 == null) {
												Static92.anIntArray362[local23++] = 0;
											} else {
												Static92.anIntArray362[local23++] = local7981.anIntArray626.length;
											}
											continue;
										}
										if (local206 == 5057) {
											local23 -= 2;
											local758 = Static92.anIntArray362[local23 + 1];
											local753 = Static92.anIntArray362[local23];
											Static92.anIntArray362[local23++] = Static5.method98(local753).anIntArray626[local758];
											continue;
										}
										if (local206 == 5058) {
											Static44.aClass55_1 = new Class55();
											local23--;
											Static44.aClass55_1.anInt2309 = Static92.anIntArray362[local23];
											Static44.aClass55_1.aClass2_Sub3_Sub25_1 = Static5.method98(Static44.aClass55_1.anInt2309);
											Static44.aClass55_1.anIntArray399 = new int[Static44.aClass55_1.aClass2_Sub3_Sub25_1.method2930()];
											continue;
										}
										if (local206 == 5059) {
											Static161.aClass2_Sub23_Sub1_5.method2155(195);
											Static161.aClass2_Sub23_Sub1_5.method2132(0);
											local753 = Static161.aClass2_Sub23_Sub1_5.anInt2703;
											Static161.aClass2_Sub23_Sub1_5.method2132(0);
											Static161.aClass2_Sub23_Sub1_5.method2117(Static44.aClass55_1.anInt2309);
											Static44.aClass55_1.aClass2_Sub3_Sub25_1.method2931(Static161.aClass2_Sub23_Sub1_5, Static44.aClass55_1.anIntArray399);
											Static161.aClass2_Sub23_Sub1_5.method2093(Static161.aClass2_Sub23_Sub1_5.anInt2703 - local753);
											continue;
										}
										if (local206 == 5060) {
											local33--;
											local561 = Static22.aClass78Array4[local33];
											Static161.aClass2_Sub23_Sub1_5.method2155(101);
											Static161.aClass2_Sub23_Sub1_5.method2132(0);
											local758 = Static161.aClass2_Sub23_Sub1_5.anInt2703;
											Static161.aClass2_Sub23_Sub1_5.method2103(local561.method3016());
											Static161.aClass2_Sub23_Sub1_5.method2117(Static44.aClass55_1.anInt2309);
											Static44.aClass55_1.aClass2_Sub3_Sub25_1.method2931(Static161.aClass2_Sub23_Sub1_5, Static44.aClass55_1.anIntArray399);
											Static161.aClass2_Sub23_Sub1_5.method2093(Static161.aClass2_Sub23_Sub1_5.anInt2703 - local758);
											continue;
										}
										if (local206 == 5061) {
											Static161.aClass2_Sub23_Sub1_5.method2155(195);
											Static161.aClass2_Sub23_Sub1_5.method2132(0);
											local753 = Static161.aClass2_Sub23_Sub1_5.anInt2703;
											Static161.aClass2_Sub23_Sub1_5.method2132(1);
											Static161.aClass2_Sub23_Sub1_5.method2117(Static44.aClass55_1.anInt2309);
											Static44.aClass55_1.aClass2_Sub3_Sub25_1.method2931(Static161.aClass2_Sub23_Sub1_5, Static44.aClass55_1.anIntArray399);
											Static161.aClass2_Sub23_Sub1_5.method2093(Static161.aClass2_Sub23_Sub1_5.anInt2703 - local753);
											continue;
										}
										if (local206 == 5062) {
											local23 -= 2;
											local758 = Static92.anIntArray362[local23 + 1];
											local753 = Static92.anIntArray362[local23];
											Static92.anIntArray362[local23++] = Static5.method94(local753).anIntArray116[local758];
											continue;
										}
										if (local206 == 5063) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											Static92.anIntArray362[local23++] = Static5.method94(local753).anIntArray117[local758];
											continue;
										}
										if (local206 == 5064) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											if (local758 == -1) {
												Static92.anIntArray362[local23++] = -1;
											} else {
												Static92.anIntArray362[local23++] = Static5.method94(local753).method516(local758);
											}
											continue;
										}
										if (local206 == 5065) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											if (local758 == -1) {
												Static92.anIntArray362[local23++] = -1;
											} else {
												Static92.anIntArray362[local23++] = Static5.method94(local753).method509(local758);
											}
											continue;
										}
										if (local206 == 5066) {
											local23--;
											local753 = Static92.anIntArray362[local23];
											Static92.anIntArray362[local23++] = Static5.method98(local753).method2930();
											continue;
										}
										if (local206 == 5067) {
											local23 -= 2;
											local758 = Static92.anIntArray362[local23 + 1];
											local753 = Static92.anIntArray362[local23];
											local975 = Static5.method98(local753).method2924(local758);
											Static92.anIntArray362[local23++] = local975;
											continue;
										}
										if (local206 == 5068) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											Static44.aClass55_1.anIntArray399[local753] = local758;
											continue;
										}
										if (local206 == 5069) {
											local23 -= 2;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											Static44.aClass55_1.anIntArray399[local753] = local758;
											continue;
										}
										if (local206 == 5070) {
											local23 -= 3;
											local753 = Static92.anIntArray362[local23];
											local758 = Static92.anIntArray362[local23 + 1];
											local975 = Static92.anIntArray362[local23 + 2];
											@Pc(8435) Class2_Sub3_Sub25 local8435 = Static5.method98(local753);
											if (local8435.method2924(local758) != 0) {
												throw new RuntimeException("bad command");
											}
											Static92.anIntArray362[local23++] = local8435.method2929(local758, local975);
											continue;
										}
									} else if (local206 < 5200) {
										if (local206 == 5100) {
											if (Static121.aBooleanArray133[86]) {
												Static92.anIntArray362[local23++] = 1;
											} else {
												Static92.anIntArray362[local23++] = 0;
											}
											continue;
										}
										if (local206 == 5101) {
											if (Static121.aBooleanArray133[82]) {
												Static92.anIntArray362[local23++] = 1;
											} else {
												Static92.anIntArray362[local23++] = 0;
											}
											continue;
										}
										if (local206 == 5102) {
											if (Static121.aBooleanArray133[81]) {
												Static92.anIntArray362[local23++] = 1;
											} else {
												Static92.anIntArray362[local23++] = 0;
											}
											continue;
										}
									} else if (local206 < 5300) {
										if (local206 == 5200) {
											local23--;
											Static123.method2217(Static92.anIntArray362[local23]);
											continue;
										}
										if (local206 == 5201) {
											Static92.anIntArray362[local23++] = Static77.method1310();
											continue;
										}
										if (local206 == 5202) {
											local23--;
											Static109.method1896(Static92.anIntArray362[local23]);
											continue;
										}
										if (local206 == 5203) {
											local33--;
											Static114.method1988(Static22.aClass78Array4[local33]);
											continue;
										}
										if (local206 == 5204) {
											Static22.aClass78Array4[local33 - 1] = Static131.method2396(Static22.aClass78Array4[local33 - 1]);
											continue;
										}
										if (local206 == 5205) {
											local33--;
											Static193.method3532(Static22.aClass78Array4[local33]);
											continue;
										}
									} else if (local206 >= 5400) {
										if (local206 < 5500) {
											if (local206 == 5400) {
												local33 -= 2;
												local1654 = Static22.aClass78Array4[local33 + 1];
												local561 = Static22.aClass78Array4[local33];
												local23--;
												local975 = Static92.anIntArray362[local23];
												Static161.aClass2_Sub23_Sub1_5.method2155(113);
												Static161.aClass2_Sub23_Sub1_5.method2132(Static69.method1124(local561) + Static69.method1124(local1654) + 1);
												Static161.aClass2_Sub23_Sub1_5.method2085(local561);
												Static161.aClass2_Sub23_Sub1_5.method2085(local1654);
												Static161.aClass2_Sub23_Sub1_5.method2132(local975);
												continue;
											}
											if (local206 == 5401) {
												local23 -= 2;
												Static111.aShortArray76[Static92.anIntArray362[local23]] = (short) Static120.method2212(Static92.anIntArray362[local23 + 1]);
												Static196.method3544();
												Static207.method3657();
												Static192.method3520();
												Static28.method368();
												Static122.method1344();
												continue;
											}
											if (local206 == 5402) {
												local33 -= 2;
												Static73.aClass78_351 = Static22.aClass78Array4[local33];
												Static73.aClass78_349 = Static22.aClass78Array4[local33 + 1];
												if (Static226.anInt4903 != 10) {
													continue;
												}
												if (!Static73.aClass78_351.method3043(Static42.aClass78_141) && !Static73.aClass78_349.method3043(Static42.aClass78_141)) {
													Static125.method1281(20);
													continue;
												}
												Static158.anInt3655 = 3;
												continue;
											}
											if (local206 == 5403) {
												Static92.anIntArray362[local23++] = Static158.anInt3655;
												continue;
											}
											if (local206 == 5404) {
												Static92.anIntArray362[local23++] = Static125.anInt1645 / 60;
												continue;
											}
											if (local206 == 5405) {
												local23 -= 2;
												local753 = Static92.anIntArray362[local23];
												local758 = Static92.anIntArray362[local23 + 1];
												if (local753 >= 0 && local753 < 2) {
													Static159.anIntArrayArrayArray13[local753] = new int[local758 << 1][4];
												}
												continue;
											}
											if (local206 == 5406) {
												local23 -= 7;
												local753 = Static92.anIntArray362[local23];
												local758 = Static92.anIntArray362[local23 + 1] << 1;
												local975 = Static92.anIntArray362[local23 + 2];
												local600 = Static92.anIntArray362[local23 + 3];
												local624 = Static92.anIntArray362[local23 + 4];
												local1006 = Static92.anIntArray362[local23 + 5];
												@Pc(6372) int local6372 = Static92.anIntArray362[local23 + 6];
												if (local753 >= 0 && local753 < 2 && Static159.anIntArrayArrayArray13[local753] != null && local758 >= 0 && local758 < Static159.anIntArrayArrayArray13[local753].length) {
													Static159.anIntArrayArrayArray13[local753][local758] = new int[] { (local975 >> 14 & 0x3FFF) * 128, local600, (local975 & 0x3FFF) * 128, local6372 };
													Static159.anIntArrayArrayArray13[local753][local758 + 1] = new int[] { (local624 >> 14 & 0x3FFF) * 128, local1006, (local624 & 0x3FFF) * 128 };
												}
												continue;
											}
											if (local206 == 5407) {
												local23--;
												local753 = Static159.anIntArrayArrayArray13[Static92.anIntArray362[local23]].length >> 1;
												Static92.anIntArray362[local23++] = local753;
												continue;
											}
											if (local206 == 5408) {
												Static92.anIntArray362[local23++] = 0;
												continue;
											}
											if (local206 == 5409) {
												Static60.method774();
												continue;
											}
											if (local206 == 5411) {
												if (Static3.aFrame1 == null) {
													Static89.method1575(false, Static130.method2367());
												} else {
													System.exit(0);
												}
												continue;
											}
											if (local206 == 5412) {
												local23 -= 4;
												if (Static97.anInt2140 == 0) {
													Static113.method1928(Static92.anIntArray362[local23], Static92.anIntArray362[local23 + 3], Static92.anIntArray362[local23 + 1], Static92.anIntArray362[local23 + 2]);
												}
												continue;
											}
											if (local206 == 5413) {
												Static92.anIntArray362[local23++] = Static203.anInt4536;
												continue;
											}
											if (local206 == 5414) {
												local33--;
												if (Static97.anInt2140 == 0) {
													Static161.method2900(Static22.aClass78Array4[local33].method3016());
												}
												continue;
											}
											if (local206 == 5415) {
												Static92.anIntArray362[local23++] = Static15.anInt334;
												continue;
											}
											if (local206 == 5416) {
												local23 -= 4;
												local33 -= 2;
												if (Static97.anInt2140 == 0) {
													Static61.method778(Static22.aClass78Array4[local33].method3016(), Static92.anIntArray362[local23 + 3], Static92.anIntArray362[local23 + 1], Static92.anIntArray362[local23], Static22.aClass78Array4[local33 + 1], Static92.anIntArray362[local23 + 2]);
												}
												continue;
											}
											if (local206 == 5417) {
												Static92.anIntArray362[local23++] = Static134.anInt3129;
												continue;
											}
											if (local206 == 5418) {
												for (local753 = 0; local753 < 5; local753++) {
													Static22.aClass78Array4[local33++] = local753 < Static102.aClass78Array19.length ? Static102.aClass78Array19[local753] : Static42.aClass78_141;
												}
												Static102.aClass78Array19 = null;
												continue;
											}
											if (local206 == 5419) {
												local561 = Static42.aClass78_141;
												if (Static201.aClass33_16 != null) {
													local561 = method1598(Static201.aClass33_16.anInt949);
													try {
														if (Static201.aClass33_16.anObject2 != null) {
															@Pc(6683) byte[] local6683 = ((String) Static201.aClass33_16.anObject2).getBytes("ISO-8859-1");
															local561 = Static48.method629(local6683.length, 0, local6683);
														}
													} catch (@Pc(6692) UnsupportedEncodingException local6692) {
													}
												}
												Static22.aClass78Array4[local33++] = local561;
												continue;
											}
											if (local206 == 5420) {
												Static92.anIntArray362[local23++] = Static148.anInt3386 == 2 ? 1 : 0;
												continue;
											}
											if (local206 == 5421) {
												local33--;
												local561 = Static22.aClass78Array4[local33];
												local23--;
												local4983 = Static92.anIntArray362[local23] == 1;
												Static89.method1575(local4983, Static94.method1640(new Class78[] { Static130.method2367(), local561 }));
												continue;
											}
										} else if (local206 < 5600) {
											if (local206 == 5500) {
												local23 -= 4;
												local975 = Static92.anIntArray362[local23 + 2];
												local758 = Static92.anIntArray362[local23 + 1];
												local753 = Static92.anIntArray362[local23];
												local600 = Static92.anIntArray362[local23 + 3];
												Static225.method3967((local753 >> 14 & 0x3FFF) - Static28.anInt497, local975, (local753 & 0x3FFF) - Static57.anInt628, local600, false, local758);
												continue;
											}
											if (local206 == 5501) {
												local23 -= 4;
												local753 = Static92.anIntArray362[local23];
												local758 = Static92.anIntArray362[local23 + 1];
												local600 = Static92.anIntArray362[local23 + 3];
												local975 = Static92.anIntArray362[local23 + 2];
												Static202.method3587(local758, (local753 >> 14 & 0x3FFF) - Static28.anInt497, local975, (local753 & 0x3FFF) - Static57.anInt628, local600);
												continue;
											}
											if (local206 == 5502) {
												local23 -= 6;
												local753 = Static92.anIntArray362[local23];
												if (local753 >= 2) {
													throw new RuntimeException();
												}
												Static167.anInt3840 = local753;
												local758 = Static92.anIntArray362[local23 + 1];
												if (Static159.anIntArrayArrayArray13[Static167.anInt3840].length >> 1 <= local758 + 1) {
													throw new RuntimeException();
												}
												Static32.anInt4050 = 0;
												Static167.anInt3869 = local758;
												Static146.anInt3311 = Static92.anIntArray362[local23 + 2];
												Static45.anInt813 = Static92.anIntArray362[local23 + 3];
												local975 = Static92.anIntArray362[local23 + 4];
												if (local975 >= 2) {
													throw new RuntimeException();
												}
												Static11.anInt314 = local975;
												local600 = Static92.anIntArray362[local23 + 5];
												if (Static159.anIntArrayArrayArray13[Static11.anInt314].length >> 1 <= local600 + 1) {
													throw new RuntimeException();
												}
												Static227.anInt4917 = local600;
												Static145.anInt3290 = 3;
												continue;
											}
											if (local206 == 5503) {
												Static198.method3552();
												continue;
											}
										} else if (local206 < 6100) {
											if (local206 == 6001) {
												local23--;
												local753 = Static92.anIntArray362[local23];
												if (local753 < 1) {
													local753 = 1;
												}
												if (local753 > 4) {
													local753 = 4;
												}
												Static180.anInt4194 = local753;
												if (Static180.anInt4194 == 1) {
													Static163.method2932(0.9F);
												}
												if (Static180.anInt4194 == 2) {
													Static163.method2932(0.8F);
												}
												if (Static180.anInt4194 == 3) {
													Static163.method2932(0.7F);
												}
												if (Static180.anInt4194 == 4) {
													Static163.method2932(0.6F);
												}
												Static207.method3657();
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											@Pc(5378) byte local5378;
											if (local206 == 6002) {
												local23--;
												Static12.method225(Static92.anIntArray362[local23] == 1);
												Static27.method362();
												Static28.method366();
												if (Static48.method633() && Static101.aBoolean84) {
													if (Static205.aByteArrayArrayArray5 == null) {
														Static205.aByteArrayArrayArray5 = new byte[4][104][104];
													}
													local5378 = (byte) (Static25.anInt457 - 4 & 0xFF);
													for (local758 = 0; local758 < 4; local758++) {
														for (local975 = 0; local975 < 104; local975++) {
															for (local600 = 0; local600 < 104; local600++) {
																Static205.aByteArrayArrayArray5[local758][local975][local600] = local5378;
															}
														}
													}
												}
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6003) {
												local23--;
												Static101.aBoolean84 = Static92.anIntArray362[local23] == 1;
												if (Static48.method633() && Static101.aBoolean84) {
													local5378 = (byte) (Static25.anInt457 - 4 & 0xFF);
													if (Static205.aByteArrayArrayArray5 == null) {
														Static205.aByteArrayArrayArray5 = new byte[4][104][104];
													}
													for (local758 = 0; local758 < 4; local758++) {
														for (local975 = 0; local975 < 104; local975++) {
															for (local600 = 0; local600 < 104; local600++) {
																Static205.aByteArrayArrayArray5[local758][local975][local600] = local5378;
															}
														}
													}
												}
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6005) {
												local23--;
												Static112.aBoolean105 = Static92.anIntArray362[local23] == 1;
												Static28.method366();
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6006) {
												local23--;
												Static14.aBoolean151 = Static92.anIntArray362[local23] == 1;
												((Class35) Static163.anInterface4_1).method766(!Static14.aBoolean151);
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6007) {
												local23--;
												Static214.aBoolean200 = Static92.anIntArray362[local23] == 1;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6008) {
												local23--;
												Static102.aBoolean86 = Static92.anIntArray362[local23] == 1;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6009) {
												local23--;
												Static175.aBoolean175 = Static92.anIntArray362[local23] == 1;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6010) {
												local23--;
												Static64.aBoolean42 = Static92.anIntArray362[local23] == 1;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6011) {
												local23--;
												local753 = Static92.anIntArray362[local23];
												if (local753 < 0 || local753 > 2) {
													local753 = 0;
												}
												Static139.anInt2666 = local753;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6012) {
												local23--;
												Static116.aBoolean113 = Static92.anIntArray362[local23] == 1;
												if (Static180.anInt4194 == 1) {
													Static163.method2932(0.9F);
												}
												if (Static180.anInt4194 == 2) {
													Static163.method2932(0.8F);
												}
												if (Static180.anInt4194 == 3) {
													Static163.method2932(0.7F);
												}
												if (Static180.anInt4194 == 4) {
													Static163.method2932(0.6F);
												}
												Static28.method366();
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6014) {
												local23--;
												Static41.aBoolean31 = Static92.anIntArray362[local23] == 1;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6015) {
												local23--;
												Static185.aBoolean187 = Static92.anIntArray362[local23] == 1;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6016) {
												local23--;
												local753 = Static92.anIntArray362[local23];
												if (local753 < 0 || local753 > 2) {
													local753 = 0;
												}
												Static99.anInt2151 = local753;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6017) {
												local23--;
												Static40.aBoolean27 = Static92.anIntArray362[local23] == 1;
												Static81.method1346();
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6018) {
												local23--;
												local753 = Static92.anIntArray362[local23];
												if (local753 < 0) {
													local753 = 0;
												}
												if (local753 > 127) {
													local753 = 127;
												}
												Static11.anInt311 = local753;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6019) {
												local23--;
												local753 = Static92.anIntArray362[local23];
												if (local753 < 0) {
													local753 = 0;
												}
												if (local753 > 255) {
													local753 = 255;
												}
												if (local753 != Static89.anInt1999) {
													if (Static89.anInt1999 == 0 && Static162.anInt3745 != -1) {
														Static93.method1622(Static162.anInt3745, Static90.aClass72_Sub1_17, local753);
														Static2.aBoolean2 = false;
													} else if (local753 == 0) {
														Static177.method3242();
														Static2.aBoolean2 = false;
													} else {
														Static15.method243(local753);
													}
													Static89.anInt1999 = local753;
												}
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6020) {
												local23--;
												local753 = Static92.anIntArray362[local23];
												if (local753 < 0) {
													local753 = 0;
												}
												if (local753 > 127) {
													local753 = 127;
												}
												Static110.anInt2433 = local753;
												Static122.method1343(Static133.aClass41_2);
												Static97.aBoolean78 = false;
												continue;
											}
											if (local206 == 6021) {
												local23--;
												Static139.aBoolean112 = Static92.anIntArray362[local23] == 1;
												continue;
											}
										} else if (local206 < 6200) {
											if (local206 == 6101) {
												Static92.anIntArray362[local23++] = Static180.anInt4194;
												continue;
											}
											if (local206 == 6102) {
												Static92.anIntArray362[local23++] = Static48.method633() ? 1 : 0;
												continue;
											}
											if (local206 == 6103) {
												Static92.anIntArray362[local23++] = Static101.aBoolean84 ? 1 : 0;
												continue;
											}
											if (local206 == 6105) {
												Static92.anIntArray362[local23++] = Static112.aBoolean105 ? 1 : 0;
												continue;
											}
											if (local206 == 6106) {
												Static92.anIntArray362[local23++] = Static14.aBoolean151 ? 1 : 0;
												continue;
											}
											if (local206 == 6107) {
												Static92.anIntArray362[local23++] = Static214.aBoolean200 ? 1 : 0;
												continue;
											}
											if (local206 == 6108) {
												Static92.anIntArray362[local23++] = Static102.aBoolean86 ? 1 : 0;
												continue;
											}
											if (local206 == 6109) {
												Static92.anIntArray362[local23++] = Static175.aBoolean175 ? 1 : 0;
												continue;
											}
											if (local206 == 6110) {
												Static92.anIntArray362[local23++] = Static64.aBoolean42 ? 1 : 0;
												continue;
											}
											if (local206 == 6111) {
												Static92.anIntArray362[local23++] = Static139.anInt2666;
												continue;
											}
											if (local206 == 6112) {
												Static92.anIntArray362[local23++] = Static116.aBoolean113 ? 1 : 0;
												continue;
											}
											if (local206 == 6114) {
												Static92.anIntArray362[local23++] = Static41.aBoolean31 ? 1 : 0;
												continue;
											}
											if (local206 == 6115) {
												Static92.anIntArray362[local23++] = Static185.aBoolean187 ? 1 : 0;
												continue;
											}
											if (local206 == 6116) {
												Static92.anIntArray362[local23++] = Static99.anInt2151;
												continue;
											}
											if (local206 == 6117) {
												Static92.anIntArray362[local23++] = Static40.aBoolean27 ? 1 : 0;
												continue;
											}
											if (local206 == 6118) {
												Static92.anIntArray362[local23++] = Static11.anInt311;
												continue;
											}
											if (local206 == 6119) {
												Static92.anIntArray362[local23++] = Static89.anInt1999;
												continue;
											}
											if (local206 == 6120) {
												Static92.anIntArray362[local23++] = Static110.anInt2433;
												continue;
											}
											if (local206 == 6121) {
												Static92.anIntArray362[local23++] = 0;
												continue;
											}
										} else if (local206 < 6300) {
											if (local206 == 6200) {
												local23 -= 2;
												Static100.aShort17 = (short) Static92.anIntArray362[local23];
												if (Static100.aShort17 <= 0) {
													Static100.aShort17 = 256;
												}
												Static176.aShort24 = (short) Static92.anIntArray362[local23 + 1];
												if (Static176.aShort24 <= 0) {
													Static176.aShort24 = 205;
												}
												continue;
											}
											if (local206 == 6201) {
												local23 -= 2;
												Static143.aShort20 = (short) Static92.anIntArray362[local23];
												if (Static143.aShort20 <= 0) {
													Static143.aShort20 = 256;
												}
												Static108.aShort18 = (short) Static92.anIntArray362[local23 + 1];
												if (Static108.aShort18 <= 0) {
													Static108.aShort18 = 320;
												}
												continue;
											}
											if (local206 == 6202) {
												local23 -= 4;
												Static71.aShort6 = (short) Static92.anIntArray362[local23];
												if (Static71.aShort6 <= 0) {
													Static71.aShort6 = 1;
												}
												Static209.aShort23 = (short) Static92.anIntArray362[local23 + 1];
												if (Static209.aShort23 <= 0) {
													Static209.aShort23 = 32767;
												} else if (Static71.aShort6 > Static209.aShort23) {
													Static209.aShort23 = Static71.aShort6;
												}
												Static23.aShort1 = (short) Static92.anIntArray362[local23 + 2];
												if (Static23.aShort1 <= 0) {
													Static23.aShort1 = 1;
												}
												Static154.aShort21 = (short) Static92.anIntArray362[local23 + 3];
												if (Static154.aShort21 <= 0) {
													Static154.aShort21 = 32767;
												} else if (Static23.aShort1 > Static154.aShort21) {
													Static154.aShort21 = Static23.aShort1;
												}
												continue;
											}
											if (local206 == 6203) {
												Static200.method3568(Static226.aClass64_16.anInt3021, Static226.aClass64_16.anInt3040);
												Static92.anIntArray362[local23++] = Static36.anInt669;
												Static92.anIntArray362[local23++] = Static130.anInt2940;
												continue;
											}
											if (local206 == 6204) {
												Static92.anIntArray362[local23++] = Static143.aShort20;
												Static92.anIntArray362[local23++] = Static108.aShort18;
												continue;
											}
											if (local206 == 6205) {
												Static92.anIntArray362[local23++] = Static100.aShort17;
												Static92.anIntArray362[local23++] = Static176.aShort24;
												continue;
											}
										} else if (local206 < 6400) {
											if (local206 == 6300) {
												Static92.anIntArray362[local23++] = (int) (Static111.method1911() / 60000L);
												continue;
											}
											if (local206 == 6301) {
												Static92.anIntArray362[local23++] = (int) (Static111.method1911() / 86400000L) - 11745;
												continue;
											}
											if (local206 == 6302) {
												local23 -= 3;
												local753 = Static92.anIntArray362[local23];
												local758 = Static92.anIntArray362[local23 + 1];
												local975 = Static92.anIntArray362[local23 + 2];
												Static114.aCalendar1.clear();
												Static114.aCalendar1.set(11, 12);
												Static114.aCalendar1.set(local975, local758, local753);
												Static92.anIntArray362[local23++] = (int) (Static114.aCalendar1.getTime().getTime() / 86400000L) - 11745;
												continue;
											}
											if (local206 == 6303) {
												Static114.aCalendar1.clear();
												Static114.aCalendar1.setTime(new Date(Static111.method1911()));
												Static92.anIntArray362[local23++] = Static114.aCalendar1.get(1);
												continue;
											}
											if (local206 == 6304) {
												local23--;
												local753 = Static92.anIntArray362[local23];
												local4983 = true;
												if (local753 < 0) {
													local4983 = (local753 + 1) % 4 == 0;
												} else if (local753 < 1582) {
													local4983 = local753 % 4 == 0;
												} else if (local753 % 4 != 0) {
													local4983 = false;
												} else if (local753 % 100 != 0) {
													local4983 = true;
												} else if (local753 % 400 != 0) {
													local4983 = false;
												}
												Static92.anIntArray362[local23++] = local4983 ? 1 : 0;
												continue;
											}
										}
									} else if (local206 == 5304) {
										Static92.anIntArray362[local23++] = 0;
										continue;
									}
								} else if (local206 == 4400) {
									local23 -= 2;
									local758 = Static92.anIntArray362[local23 + 1];
									local753 = Static92.anIntArray362[local23];
									local4391 = Static78.method1324(local758);
									if (local4391.method1081()) {
										Static22.aClass78Array4[local33++] = Static121.method3984(local753).method1865(local4391.aClass78_316, local758);
									} else {
										Static92.anIntArray362[local23++] = Static121.method3984(local753).method1866(local4391.anInt1314, local758);
									}
									continue;
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(11194) Exception local11194) {
			if (local16.aClass78_197 == null) {
				if (Static144.anInt3283 != 0) {
					Static95.method1663(Static42.aClass78_141, Static134.aClass78_596, 0);
				}
				Static139.method2127(local11194, "CS2 - scr:" + local16.aLong188 + " op:" + local35);
			} else {
				@Pc(11201) Class78 local11201 = Static167.method3037(30);
				local11201.method3022(Static100.aClass78_480).method3022(local16.aClass78_197);
				for (local49 = Static198.anInt4485 - 1; local49 >= 0; local49--) {
					local11201.method3022(Static79.aClass78_384).method3022(Static74.aClass86Array1[local49].aClass2_Sub3_Sub6_1.aClass78_197);
				}
				if (local35 == 40) {
					local61 = local26[local31];
					local11201.method3022(Static62.aClass78_297).method3022(Static19.method268(local61));
				}
				if (Static144.anInt3283 != 0) {
					Static95.method1663(Static42.aClass78_141, Static94.method1640(new Class78[] { Static162.aClass78_666, local16.aClass78_197 }), 0);
				}
				Static139.method2127(local11194, "CS2 - scr:" + local16.aLong188 + " op:" + local35 + new String(local11201.method3013()));
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lclient!qe;")
	public static Class78 method1598(@OriginalArg(0) int arg0) {
		return Static94.method1640(new Class78[] { Static19.method268(arg0 >> 24 & 0xFF), Static13.aClass78_46, Static19.method268(arg0 >> 16 & 0xFF), Static13.aClass78_46, Static19.method268(arg0 >> 8 & 0xFF), Static13.aClass78_46, Static19.method268(arg0 & 0xFF) });
	}
}
