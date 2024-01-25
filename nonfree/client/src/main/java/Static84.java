import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
	public static int anInt1838;

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_57 = new Class62(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "[I")
	public static final int[] anIntArray147 = new int[13];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method1453(@OriginalArg(1) String arg0) {
		return Static125.method2194(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!rs;Lclient!qa;)V")
	public static void method1454(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class188 arg1) {
		if (!arg1.aBoolean380) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort63;
		@Pc(9) short local9 = arg1.aShort64;
		@Pc(12) byte local12 = arg1.aByte44;
		@Pc(15) byte local15 = arg1.aByte43;
		@Pc(21) int local21 = (local6 << Static162.anInt3362) + Static291.anInt5453;
		@Pc(27) int local27 = (local9 << Static162.anInt3362) + Static291.anInt5453;
		@Pc(31) Class188[][] local31 = Static45.aClass188ArrayArrayArray5[local12];
		@Pc(53) float local53;
		if (Static248.aClass149Array3 == Static128.aClass149Array1) {
			Static59.aClass48_2.method2485(Static210.aClass149Array5[0].method5839(local21, local27), Static32.method364(local6, local9), Static195.method3549(local6, local9), Static256.method4418(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static59.aClass48_2.method2460(3000.0F, local53 * 1.5F);
		@Pc(86) Class188 local86;
		@Pc(616) Class7_Sub5 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class7_Sub5 local377;
		@Pc(408) int local408;
		@Pc(411) Class1_Sub5 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean378) {
			if (Static305.aBoolean490) {
				if (local12 > 0) {
					local86 = Static45.aClass188ArrayArrayArray5[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean380) {
						return;
					}
				}
				if (local6 <= Static284.anInt5626 && local6 > Static94.anInt2021) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean380 && (local86.aBoolean378 || (arg1.aByte47 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static284.anInt5626 && local6 < Static310.anInt5683 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean380 && (local86.aBoolean378 || (arg1.aByte47 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static373.anInt6861 && local9 > Static287.anInt5307) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean380 && (local86.aBoolean378 || (arg1.aByte47 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static373.anInt6861 && local9 < Static286.anInt5279 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean380 && (local86.aBoolean378 || (arg1.aByte47 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static305.aBoolean490 = true;
			}
			arg1.aBoolean378 = false;
			if (arg1.aClass188_1 != null) {
				local86 = arg1.aClass188_1;
				Static59.aClass48_2.method2460(3000.0F, (201.5F - (float) (local86.aByte43 + 1) * 50.0F) * 1.5F);
				if (!Static69.method1256(local86.aByte43, local6, local9)) {
					Static128.aClass149Array1[local86.aByte43].method5844(local6, local9);
				}
				@Pc(249) Class1_Sub5 local249 = local86.aClass1_Sub5_2;
				if (local249 != null) {
					if (Static305.aBoolean491) {
						if ((local249.anInt6722 & arg1.aShort65) == 0) {
							Static212.method3828(arg0, local12, local6, local9);
						} else {
							Static17.method378(arg0, local249.anInt6722, local15, local6, local9);
						}
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					local249.method6013(Static59.aClass48_2);
				}
				for (@Pc(286) Class168 local286 = local86.aClass168_2; local286 != null; local286 = local286.aClass168_1) {
					@Pc(290) Class1_Sub2 local290 = local286.aClass1_Sub2_1;
					if (local290 != null) {
						if (Static305.aBoolean491) {
							Static212.method3828(arg0, local12, local6, local9);
							Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
						}
						local290.method6013(Static59.aClass48_2);
					}
				}
				Static59.aClass48_2.method2460(3000.0F, local53 * 1.5F);
			}
			local330 = !Static69.method1256(local15, local6, local9);
			if (local330) {
				Static128.aClass149Array1[local15].method5844(local6, local9);
				@Pc(341) Class1_Sub1 local341 = arg1.aClass1_Sub1_2;
				if (local341 != null && local341.aBoolean291) {
					if (local341.aBoolean292) {
						Static59.aClass48_2.method2460(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					local377 = local341.method6013(Static59.aClass48_2);
					if (local377 != null) {
						local377.aClass1_1 = local341;
						local377.anInt4257 = local12;
						local377.anInt4258 = local6;
						local377.anInt4260 = local9;
						Static349.aClass199_7.method4898(local377);
					}
					if (local341.aBoolean292) {
						Static59.aClass48_2.method2460(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass1_Sub5_2;
			@Pc(414) Class1_Sub3 local414 = arg1.aClass1_Sub3_3;
			if (local411 != null || local414 != null) {
				if (Static284.anInt5626 == local6) {
					local406++;
				} else if (Static284.anInt5626 < local6) {
					local406 += 2;
				}
				if (Static373.anInt6861 == local9) {
					local406 += 3;
				} else if (Static373.anInt6861 > local9) {
					local406 += 6;
				}
				local408 = Static70.anIntArray115[local406];
				arg1.aShort65 = Static202.aShortArray54[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6722 & Static257.anIntArray402[local406]) == 0) {
					arg1.aByte42 = 0;
				} else if (local411.anInt6722 == 16) {
					arg1.aByte42 = 3;
					arg1.aByte45 = Static38.aByteArray20[local406];
					arg1.aByte48 = (byte) (3 - arg1.aByte45);
				} else if (local411.anInt6722 == 32) {
					arg1.aByte42 = 6;
					arg1.aByte45 = Static271.aByteArray77[local406];
					arg1.aByte48 = (byte) (6 - arg1.aByte45);
				} else if (local411.anInt6722 == 64) {
					arg1.aByte42 = 12;
					arg1.aByte45 = Static361.aByteArray57[local406];
					arg1.aByte48 = (byte) (12 - arg1.aByte45);
				} else {
					arg1.aByte42 = 9;
					arg1.aByte45 = Static120.aByteArray32[local406];
					arg1.aByte48 = (byte) (9 - arg1.aByte45);
				}
				if ((local411.anInt6722 & local408) != 0 && !Static194.method3542(local15, local6, local9, local411.anInt6722)) {
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					@Pc(563) Class7_Sub5 local563 = local411.method6013(Static59.aClass48_2);
					if (local563 != null) {
						local563.aClass1_1 = local411;
						local563.anInt4257 = local12;
						local563.anInt4258 = local6;
						local563.anInt4260 = local9;
						Static349.aClass199_7.method4898(local563);
					}
				}
				@Pc(584) Class1_Sub5 local584 = arg1.aClass1_Sub5_1;
				if (local584 != null && (local584.anInt6722 & local408) != 0 && !Static194.method3542(local15, local6, local9, local584.anInt6722)) {
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					local616 = local584.method6013(Static59.aClass48_2);
					if (local616 != null) {
						local616.aClass1_1 = local584;
						local616.anInt4257 = local12;
						local616.anInt4258 = local6;
						local616.anInt4260 = local9;
						Static349.aClass199_7.method4898(local616);
					}
				}
			}
			if (local414 != null && !Static332.method5367(local15, local6, local9, local414.method6024())) {
				@Pc(647) Class1_Sub3 local647 = arg1.aClass1_Sub3_2;
				Static59.aClass48_2.method2460(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6982 & local408) != 0) {
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					local616 = local414.method6013(Static59.aClass48_2);
					if (local616 != null) {
						local616.aClass1_1 = local414;
						local616.anInt4257 = local12;
						local616.anInt4258 = local6;
						local616.anInt4260 = local9;
						Static349.aClass199_7.method4898(local616);
					}
				} else if (local414.anInt6982 == 256) {
					local706 = local414.anInt6984 - Static181.anInt3807;
					local711 = local414.anInt6988 - Static200.anInt4146;
					local714 = local414.anInt6990;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					@Pc(759) Class7_Sub5 local759;
					if (local735 < local723) {
						local759 = local414.method6013(Static59.aClass48_2);
						if (local759 != null) {
							local759.aClass1_1 = local414;
							local759.anInt4257 = local12;
							local759.anInt4258 = local6;
							local759.anInt4260 = local9;
							Static349.aClass199_7.method4898(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6013(Static59.aClass48_2);
						if (local759 != null) {
							local759.aClass1_1 = local647;
							local759.anInt4257 = local12;
							local759.anInt4258 = local6;
							local759.anInt4260 = local9;
							Static349.aClass199_7.method4898(local759);
						}
					}
				}
				Static59.aClass48_2.method2460(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class1_Sub1 local814 = arg1.aClass1_Sub1_2;
				if (local814 != null && !local814.aBoolean291) {
					if (local814.aBoolean292) {
						Static59.aClass48_2.method2460(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					local616 = local814.method6013(Static59.aClass48_2);
					if (local616 != null) {
						local616.aClass1_1 = local814;
						local616.anInt4257 = local12;
						local616.anInt4258 = local6;
						local616.anInt4260 = local9;
						Static349.aClass199_7.method4898(local616);
					}
					if (local814.aBoolean292) {
						Static59.aClass48_2.method2460(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class1_Sub4 local880 = arg1.aClass1_Sub4_1;
				if (local880 != null && !local880.aBoolean314) {
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					@Pc(903) Class7_Sub5 local903 = local880.method6013(Static59.aClass48_2);
					if (local903 != null) {
						local903.aClass1_1 = local880;
						local903.anInt4257 = local12;
						local903.anInt4258 = local6;
						local903.anInt4260 = local9;
						Static349.aClass199_7.method4898(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte47;
			if (local924 != 0) {
				@Pc(941) Class188 local941;
				if (local6 < Static284.anInt5626 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean380) {
						Static185.aClass19_1.method5307(local941);
					}
				}
				if (local9 < Static373.anInt6861 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean380) {
						Static185.aClass19_1.method5307(local941);
					}
				}
				if (local6 > Static284.anInt5626 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean380) {
						Static185.aClass19_1.method5307(local941);
					}
				}
				if (local9 > Static373.anInt6861 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean380) {
						Static185.aClass19_1.method5307(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class1_Sub5 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class168 local1030;
		if (arg1.aByte42 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass168_2; local1030 != null; local1030 = local1030.aClass168_1) {
				if (local1030.aClass1_Sub2_1.anInt6796 != Static301.anInt5604 && (local1030.anInt4777 & arg1.aByte42) == arg1.aByte45) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass1_Sub5_2;
				if (!Static194.method3542(local15, local6, local9, local1057.anInt6722)) {
					if (Static305.aBoolean491) {
						label687: {
							if (local1057.anInt6722 >= 16) {
								local1074 = local6 - Static284.anInt5626;
								local1078 = local9 - Static373.anInt6861;
								if (local1057.anInt6722 == 16) {
									local1074 -= Static291.anInt5453;
									local1078 += Static291.anInt5453;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static285.anInt5263) {
										Static212.method3828(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt6722 == 32) {
									local1074 += Static291.anInt5453;
									local1078 += Static291.anInt5453;
									if (local1078 < -local1074 && local6 < Static176.anInt3742 && local9 < Static285.anInt5263) {
										Static212.method3828(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt6722 == 64) {
									local1074 += Static291.anInt5453;
									local1078 -= Static291.anInt5453;
									if (local1078 > local1074 && local6 < Static176.anInt3742 && local9 > 0) {
										Static212.method3828(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1057.anInt6722 == 128) {
									local1074 -= Static291.anInt5453;
									local1078 -= Static291.anInt5453;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static212.method3828(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static212.method3828(arg0, local12, local6, local9);
						}
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					@Pc(1216) Class7_Sub5 local1216 = local1057.method6013(Static59.aClass48_2);
					if (local1216 != null) {
						local1216.aClass1_1 = local1057;
						local1216.anInt4257 = local12;
						local1216.anInt4258 = local6;
						local1216.anInt4260 = local9;
						Static349.aClass199_7.method4898(local1216);
					}
				}
				arg1.aByte42 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean379) {
			try {
				arg1.aBoolean379 = false;
				@Pc(1245) int local1245 = 0;
				label630: for (local1030 = arg1.aClass168_2; local1030 != null; local1030 = local1030.aClass168_1) {
					@Pc(1252) Class1_Sub2 local1252 = local1030.aClass1_Sub2_1;
					if (local1252.anInt6796 != Static301.anInt5604) {
						for (local1074 = local1252.aShort95; local1074 <= local1252.aShort97; local1074++) {
							for (local1078 = local1252.aShort96; local1078 <= local1252.aShort94; local1078++) {
								@Pc(1270) Class188 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean378) {
									arg1.aBoolean379 = true;
									continue label630;
								}
								if (local1270.aByte42 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort95) {
										local706++;
									}
									if (local1074 < local1252.aShort97) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort96) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort94) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte42) == arg1.aByte48) {
										arg1.aBoolean379 = true;
										continue label630;
									}
								}
							}
						}
						local1078 = Static284.anInt5626 - local1252.aShort95;
						local1333 = local1252.aShort97 - Static284.anInt5626;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static373.anInt6861 - local1252.aShort96;
						local711 = local1252.aShort94 - Static373.anInt6861;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass1_Sub2Array2[local1245] = local1252;
						arg0.anIntArray236[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class1_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass1_Sub2Array2[local1078];
						if (local1384.anInt6796 != Static301.anInt5604) {
							local706 = arg0.anIntArray236[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6800 - Static181.anInt3807;
								local714 = local1384.anInt6798 - Static200.anInt4146;
								local723 = arg0.aClass1_Sub2Array2[local1074].anInt6800 - Static181.anInt3807;
								local735 = arg0.aClass1_Sub2Array2[local1074].anInt6798 - Static200.anInt4146;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass1_Sub2Array2[local1074];
					local1384.anInt6796 = Static301.anInt5604;
					if (!Static257.method4422(local15, local1384.aShort95, local1384.aShort97, local1384.aShort96, local1384.aShort94, local1384.method5894())) {
						if (Static305.aBoolean491) {
							if (local1384.aByte74 == 0) {
								Static353.method5599(arg0, local12, local1384.aShort95, local1384.aShort96, local1384.aShort97, local1384.aShort94);
							} else {
								Static212.method3828(arg0, local12, local6, local9);
								local706 = local6 - Static284.anInt5626;
								local711 = local9 - Static373.anInt6861;
								if (local1384.aByte74 == 2) {
									if (local711 > -local706) {
										Static169.method5038(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static169.method5038(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static169.method5038(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static169.method5038(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
						}
						local616 = local1384.method6013(Static59.aClass48_2);
						if (local616 != null) {
							local616.aClass1_1 = local1384;
							local616.anInt4257 = local12;
							local616.anInt4258 = local1384.aShort95;
							local616.anInt4260 = local1384.aShort96;
							Static349.aClass199_7.method4898(local616);
						}
					}
					for (local706 = local1384.aShort95; local706 <= local1384.aShort97; local706++) {
						for (local711 = local1384.aShort96; local711 <= local1384.aShort94; local711++) {
							@Pc(1609) Class188 local1609 = local31[local706][local711];
							if (local1609.aByte42 != 0) {
								Static185.aClass19_1.method5307(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean380) {
								Static185.aClass19_1.method5307(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean379) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean379 = false;
			}
		}
		if (arg1.aClass34_2 != null) {
			if (arg1.aByte46 == (byte) (Static112.anInt2126 & 0xFF)) {
				@Pc(1664) Class34 local1664 = arg1.aClass34_2;
				local406 = Static128.aClass149Array1[local12].method5837(local6, local9);
				if (local12 < Static73.anInt1624 - 1) {
					local408 = Static128.aClass149Array1[local12].method5837(local6, local9) - Static128.aClass149Array1[local12 + 1].method5837(local6, local9);
				} else {
					local408 = 1024;
				}
				Static221.aClass21_13.method3710(local21, local406, local27, arg0.anIntArray235);
				local1074 = arg0.anIntArray235[2];
				Static221.aClass21_13.method3710(local21, local406 - local408, local27, arg0.anIntArray235);
				local1078 = arg0.anIntArray235[2];
				local1333 = local1074;
				local706 = local1078;
				if (local1074 > local1078) {
					local1333 = local1078;
					local706 = local1074;
				}
				local1333 -= Static279.anInt5195;
				local706 += Static279.anInt5195;
				if (local1333 < local706 - 1597) {
					local1333 = local706 - 1597;
				}
				local1664.anInt736 = local1333;
				local1664.anInt737 = local706;
				local1664.aBoolean53 = true;
				Static59.aClass48_2.method2516(local1664);
			} else {
				arg1.aClass34_2 = null;
			}
		}
		if (!arg1.aBoolean380) {
			return;
		}
		if (arg1.aByte42 != 0) {
			return;
		}
		if (local6 <= Static284.anInt5626 && local6 > Static94.anInt2021) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean380) {
				return;
			}
		}
		if (local6 >= Static284.anInt5626 && local6 < Static310.anInt5683 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean380) {
				return;
			}
		}
		if (local9 <= Static373.anInt6861 && local9 > Static287.anInt5307) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean380) {
				return;
			}
		}
		if (local9 >= Static373.anInt6861 && local9 < Static286.anInt5279 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean380) {
				return;
			}
		}
		arg1.aBoolean380 = false;
		Static132.anInt2870--;
		@Pc(1866) Class1_Sub4 local1866 = arg1.aClass1_Sub4_1;
		if (local1866 != null && local1866.aBoolean314) {
			if (Static305.aBoolean491) {
				Static212.method3828(arg0, local12, local6, local9);
				Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
			}
			@Pc(1889) Class7_Sub5 local1889 = local1866.method6013(Static59.aClass48_2);
			if (local1889 != null) {
				local1889.aClass1_1 = local1866;
				local1889.anInt4257 = local12;
				local1889.anInt4258 = local6;
				local1889.anInt4260 = local9;
				Static349.aClass199_7.method4898(local1889);
			}
		}
		if (arg1.aShort65 != 0) {
			@Pc(1913) Class1_Sub3 local1913 = arg1.aClass1_Sub3_3;
			if (local1913 != null && !Static332.method5367(local15, local6, local9, local1913.method6024())) {
				if ((local1913.anInt6982 & arg1.aShort65) != 0) {
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					local377 = local1913.method6013(Static59.aClass48_2);
					if (local377 != null) {
						local377.aClass1_1 = local1913;
						local377.anInt4257 = local12;
						local377.anInt4258 = local6;
						local377.anInt4260 = local9;
						Static349.aClass199_7.method4898(local377);
					}
				} else if (local1913.anInt6982 == 256) {
					local408 = local1913.anInt6984 - Static181.anInt3807;
					local1074 = local1913.anInt6988 - Static200.anInt4146;
					local1078 = local1913.anInt6990;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static305.aBoolean491) {
						Static212.method3828(arg0, local12, local6, local9);
						Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
					}
					@Pc(2023) Class1_Sub3 local2023 = arg1.aClass1_Sub3_2;
					@Pc(2031) Class7_Sub5 local2031;
					if (local706 > local1333) {
						local2031 = local1913.method6013(Static59.aClass48_2);
						if (local2031 != null) {
							local2031.aClass1_1 = local1913;
							local2031.anInt4257 = local12;
							local2031.anInt4258 = local6;
							local2031.anInt4260 = local9;
							Static349.aClass199_7.method4898(local2031);
						}
					} else if (local2023 != null) {
						local2031 = local2023.method6013(Static59.aClass48_2);
						if (local2031 != null) {
							local2031.aClass1_1 = local2023;
							local2031.anInt4257 = local12;
							local2031.anInt4258 = local6;
							local2031.anInt4260 = local9;
							Static349.aClass199_7.method4898(local2031);
						}
					}
				}
			}
			local1057 = arg1.aClass1_Sub5_2;
			local411 = arg1.aClass1_Sub5_1;
			@Pc(2116) Class7_Sub5 local2116;
			if (local411 != null && (local411.anInt6722 & arg1.aShort65) != 0 && !Static194.method3542(local15, local6, local9, local411.anInt6722)) {
				if (Static305.aBoolean491) {
					Static17.method378(arg0, local411.anInt6722, local12, local6, local9);
					Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
				}
				local2116 = local411.method6013(Static59.aClass48_2);
				if (local2116 != null) {
					local2116.aClass1_1 = local411;
					local2116.anInt4257 = local12;
					local2116.anInt4258 = local6;
					local2116.anInt4260 = local9;
					Static349.aClass199_7.method4898(local2116);
				}
			}
			if (local1057 != null && (local1057.anInt6722 & arg1.aShort65) != 0 && !Static194.method3542(local15, local6, local9, local1057.anInt6722)) {
				if (Static305.aBoolean491) {
					Static17.method378(arg0, local1057.anInt6722, local12, local6, local9);
					Static59.aClass48_2.method2474(arg0.anInt3024, arg0.aClass2_Sub8_Sub1Array3);
				}
				local2116 = local1057.method6013(Static59.aClass48_2);
				if (local2116 != null) {
					local2116.aClass1_1 = local1057;
					local2116.anInt4257 = local12;
					local2116.anInt4258 = local6;
					local2116.anInt4260 = local9;
					Static349.aClass199_7.method4898(local2116);
				}
			}
		}
		@Pc(2202) Class188 local2202;
		if (local12 < Static73.anInt1624 - 1) {
			local2202 = Static45.aClass188ArrayArrayArray5[local12 + 1][local6][local9];
			if (local2202 != null && local2202.aBoolean380) {
				Static185.aClass19_1.method5305(local2202);
			}
		}
		if (local6 < Static284.anInt5626) {
			local2202 = local31[local6 + 1][local9];
			if (local2202 != null && local2202.aBoolean380) {
				Static185.aClass19_1.method5307(local2202);
			}
		}
		if (local9 < Static373.anInt6861) {
			local2202 = local31[local6][local9 + 1];
			if (local2202 != null && local2202.aBoolean380) {
				Static185.aClass19_1.method5307(local2202);
			}
		}
		if (local6 > Static284.anInt5626) {
			local2202 = local31[local6 - 1][local9];
			if (local2202 != null && local2202.aBoolean380) {
				Static185.aClass19_1.method5307(local2202);
			}
		}
		if (local9 > Static373.anInt6861) {
			local2202 = local31[local6][local9 - 1];
			if (local2202 != null && local2202.aBoolean380) {
				Static185.aClass19_1.method5307(local2202);
			}
		}
	}
}
