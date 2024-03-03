import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
	public static int anInt6624;

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray4;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "Lclient!qi;")
	public static Class190 aClass190_3;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!hc;Lclient!f;)V", line = 5)
	public static void method5951(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class67 arg1) {
		if (!arg1.aBoolean136) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort23;
		@Pc(9) short local9 = arg1.aShort22;
		@Pc(12) byte local12 = arg1.aByte10;
		@Pc(15) byte local15 = arg1.aByte7;
		@Pc(21) int local21 = (local6 << Static299.anInt6017) + Static233.anInt4684;
		@Pc(27) int local27 = (local9 << Static299.anInt6017) + Static233.anInt4684;
		@Pc(31) Class67[][] local31 = Static307.aClass67ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static174.aClass6Array2 == Static340.aClass6Array4) {
			Static16.aClass19_10.method2868(Static307.aClass6Array3[0].method5729(local21, local27), Static332.method5988(local6, local9), Static157.method6477(local6, local9), Static48.method1550(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static16.aClass19_10.method2825(3000.0F, local53 * 1.5F);
		@Pc(86) Class67 local86;
		@Pc(616) Class12_Sub4 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class12_Sub4 local377;
		@Pc(408) int local408;
		@Pc(411) Class11_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean138) {
			if (Class2_Sub11.aBoolean131) {
				if (local12 > 0) {
					local86 = Static307.aClass67ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean136) {
						return;
					}
				}
				if (local6 <= Static229.anInt4641 && local6 > Static152.anInt2957) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static229.anInt4641 && local6 < Static206.anInt4628 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static197.anInt3776 && local9 > Static207.anInt3944) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static197.anInt3776 && local9 < Static28.anInt722 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Class2_Sub11.aBoolean131 = true;
			}
			arg1.aBoolean138 = false;
			if (arg1.aClass67_1 != null) {
				local86 = arg1.aClass67_1;
				Static16.aClass19_10.method2825(3000.0F, (201.5F - (float) (local86.aByte7 + 1) * 50.0F) * 1.5F);
				if (!Static34.method1106(local86.aByte7, local6, local9)) {
					Static340.aClass6Array4[local86.aByte7].method5721(local6, local9);
				}
				@Pc(249) Class11_Sub1 local249 = local86.aClass11_Sub1_3;
				if (local249 != null) {
					if (Static151.aBoolean208) {
						if ((local249.anInt3478 & arg1.aShort21) == 0) {
							Static147.method2798(arg0, local12, local6, local9);
						} else {
							Static162.method3317(arg0, local249.anInt3478, local15, local6, local9);
						}
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					local249.method6074(Static16.aClass19_10);
				}
				for (@Pc(286) Class22 local286 = local86.aClass22_2; local286 != null; local286 = local286.aClass22_1) {
					@Pc(290) Class11_Sub5 local290 = local286.aClass11_Sub5_1;
					if (local290 != null) {
						if (Static151.aBoolean208) {
							Static147.method2798(arg0, local12, local6, local9);
							Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
						}
						local290.method6074(Static16.aClass19_10);
					}
				}
				Static16.aClass19_10.method2825(3000.0F, local53 * 1.5F);
			}
			local330 = !Static34.method1106(local15, local6, local9);
			if (local330) {
				Static340.aClass6Array4[local15].method5721(local6, local9);
				@Pc(341) Class11_Sub2 local341 = arg1.aClass11_Sub2_2;
				if (local341 != null && local341.aBoolean238) {
					if (local341.aBoolean239) {
						Static16.aClass19_10.method2825(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					local377 = local341.method6074(Static16.aClass19_10);
					if (local377 != null) {
						local377.aClass11_1 = local341;
						local377.anInt4068 = local12;
						local377.anInt4071 = local6;
						local377.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local377);
					}
					if (local341.aBoolean239) {
						Static16.aClass19_10.method2825(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass11_Sub1_3;
			@Pc(414) Class11_Sub3 local414 = arg1.aClass11_Sub3_2;
			if (local411 != null || local414 != null) {
				if (Static229.anInt4641 == local6) {
					local406++;
				} else if (Static229.anInt4641 < local6) {
					local406 += 2;
				}
				if (Static197.anInt3776 == local9) {
					local406 += 3;
				} else if (Static197.anInt3776 > local9) {
					local406 += 6;
				}
				local408 = Class2_Sub24_Sub1.anIntArray387[local406];
				arg1.aShort21 = Class11_Sub5.aShortArray127[local406];
			}
			if (local411 != null) {
				if ((local411.anInt3478 & Class11_Sub1_Sub3.anIntArray206[local406]) == 0) {
					arg1.aByte9 = 0;
				} else if (local411.anInt3478 == 16) {
					arg1.aByte9 = 3;
					arg1.aByte12 = Class229.aByteArray94[local406];
					arg1.aByte11 = (byte) (3 - arg1.aByte12);
				} else if (local411.anInt3478 == 32) {
					arg1.aByte9 = 6;
					arg1.aByte12 = Class2_Sub2_Sub11.aByteArray33[local406];
					arg1.aByte11 = (byte) (6 - arg1.aByte12);
				} else if (local411.anInt3478 == 64) {
					arg1.aByte9 = 12;
					arg1.aByte12 = Class58.aByteArray23[local406];
					arg1.aByte11 = (byte) (12 - arg1.aByte12);
				} else {
					arg1.aByte9 = 9;
					arg1.aByte12 = Class2_Sub3_Sub24.aByteArray60[local406];
					arg1.aByte11 = (byte) (9 - arg1.aByte12);
				}
				if ((local411.anInt3478 & local408) != 0 && !Static42.method1403(local15, local6, local9, local411.anInt3478)) {
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(563) Class12_Sub4 local563 = local411.method6074(Static16.aClass19_10);
					if (local563 != null) {
						local563.aClass11_1 = local411;
						local563.anInt4068 = local12;
						local563.anInt4071 = local6;
						local563.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local563);
					}
				}
				@Pc(584) Class11_Sub1 local584 = arg1.aClass11_Sub1_2;
				if (local584 != null && (local584.anInt3478 & local408) != 0 && !Static42.method1403(local15, local6, local9, local584.anInt3478)) {
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					local616 = local584.method6074(Static16.aClass19_10);
					if (local616 != null) {
						local616.aClass11_1 = local584;
						local616.anInt4068 = local12;
						local616.anInt4071 = local6;
						local616.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local616);
					}
				}
			}
			if (local414 != null && !Static61.method1736(local15, local6, local9, local414.method5749())) {
				@Pc(647) Class11_Sub3 local647 = arg1.aClass11_Sub3_3;
				Static16.aClass19_10.method2825(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6334 & local408) != 0) {
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					local616 = local414.method6074(Static16.aClass19_10);
					if (local616 != null) {
						local616.aClass11_1 = local414;
						local616.anInt4068 = local12;
						local616.anInt4071 = local6;
						local616.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local616);
					}
				} else if (local414.anInt6334 == 256) {
					local706 = local414.anInt6332 - Static328.anInt6520;
					local711 = local414.anInt6330 - Static334.anInt6684;
					local714 = local414.anInt6329;
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
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(759) Class12_Sub4 local759;
					if (local735 < local723) {
						local759 = local414.method6074(Static16.aClass19_10);
						if (local759 != null) {
							local759.aClass11_1 = local414;
							local759.anInt4068 = local12;
							local759.anInt4071 = local6;
							local759.anInt4070 = local9;
							Class2_Sub4.aClass36_6.method1420(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6074(Static16.aClass19_10);
						if (local759 != null) {
							local759.aClass11_1 = local647;
							local759.anInt4068 = local12;
							local759.anInt4071 = local6;
							local759.anInt4070 = local9;
							Class2_Sub4.aClass36_6.method1420(local759);
						}
					}
				}
				Static16.aClass19_10.method2825(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class11_Sub2 local814 = arg1.aClass11_Sub2_2;
				if (local814 != null && !local814.aBoolean238) {
					if (local814.aBoolean239) {
						Static16.aClass19_10.method2825(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					local616 = local814.method6074(Static16.aClass19_10);
					if (local616 != null) {
						local616.aClass11_1 = local814;
						local616.anInt4068 = local12;
						local616.anInt4071 = local6;
						local616.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local616);
					}
					if (local814.aBoolean239) {
						Static16.aClass19_10.method2825(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class11_Sub4 local880 = arg1.aClass11_Sub4_1;
				if (local880 != null && !local880.aBoolean259) {
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(903) Class12_Sub4 local903 = local880.method6074(Static16.aClass19_10);
					if (local903 != null) {
						local903.aClass11_1 = local880;
						local903.anInt4068 = local12;
						local903.anInt4071 = local6;
						local903.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte8;
			if (local924 != 0) {
				@Pc(941) Class67 local941;
				if (local6 < Static229.anInt4641 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean136) {
						Static153.aClass15_1.method1585(local941);
					}
				}
				if (local9 < Static197.anInt3776 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean136) {
						Static153.aClass15_1.method1585(local941);
					}
				}
				if (local6 > Static229.anInt4641 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean136) {
						Static153.aClass15_1.method1585(local941);
					}
				}
				if (local9 > Static197.anInt3776 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean136) {
						Static153.aClass15_1.method1585(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class11_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class22 local1030;
		if (arg1.aByte9 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass22_2; local1030 != null; local1030 = local1030.aClass22_1) {
				if (local1030.aClass11_Sub5_1.anInt6766 != Static180.anInt3552 && (local1030.anInt645 & arg1.aByte9) == arg1.aByte12) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass11_Sub1_3;
				if (!Static42.method1403(local15, local6, local9, local1057.anInt3478)) {
					if (Static151.aBoolean208) {
						label686: {
							if (local1057.anInt3478 >= 16) {
								local1074 = local6 - Static229.anInt4641;
								local1078 = local9 - Static197.anInt3776;
								if (local1057.anInt3478 == 16) {
									local1074 -= Static233.anInt4684;
									local1078 += Static233.anInt4684;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static196.anInt3769) {
										Static147.method2798(arg0, local12, local6 - 1, local9 + 1);
										break label686;
									}
								} else if (local1057.anInt3478 == 32) {
									local1074 += Static233.anInt4684;
									local1078 += Static233.anInt4684;
									if (local1078 < -local1074 && local6 < Static68.anInt1682 && local9 < Static196.anInt3769) {
										Static147.method2798(arg0, local12, local6 + 1, local9 + 1);
										break label686;
									}
								} else if (local1057.anInt3478 == 64) {
									local1074 += Static233.anInt4684;
									local1078 -= Static233.anInt4684;
									if (local1078 > local1074 && local6 < Static68.anInt1682 && local9 > 0) {
										Static147.method2798(arg0, local12, local6 + 1, local9 - 1);
										break label686;
									}
								} else if (local1057.anInt3478 == 128) {
									local1074 -= Static233.anInt4684;
									local1078 -= Static233.anInt4684;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static147.method2798(arg0, local12, local6 - 1, local9 - 1);
										break label686;
									}
								}
							}
							Static147.method2798(arg0, local12, local6, local9);
						}
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(1216) Class12_Sub4 local1216 = local1057.method6074(Static16.aClass19_10);
					if (local1216 != null) {
						local1216.aClass11_1 = local1057;
						local1216.anInt4068 = local12;
						local1216.anInt4071 = local6;
						local1216.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local1216);
					}
				}
				arg1.aByte9 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean137) {
			try {
				arg1.aBoolean137 = false;
				@Pc(1245) int local1245 = 0;
				label629: for (local1030 = arg1.aClass22_2; local1030 != null; local1030 = local1030.aClass22_1) {
					@Pc(1252) Class11_Sub5 local1252 = local1030.aClass11_Sub5_1;
					if (local1252.anInt6766 != Static180.anInt3552) {
						for (local1074 = local1252.aShort103; local1074 <= local1252.aShort104; local1074++) {
							for (local1078 = local1252.aShort101; local1078 <= local1252.aShort102; local1078++) {
								@Pc(1270) Class67 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean138) {
									arg1.aBoolean137 = true;
									continue label629;
								}
								if (local1270.aByte9 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort103) {
										local706++;
									}
									if (local1074 < local1252.aShort104) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort101) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort102) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte9) == arg1.aByte11) {
										arg1.aBoolean137 = true;
										continue label629;
									}
								}
							}
						}
						local1078 = Static229.anInt4641 - local1252.aShort103;
						local1333 = local1252.aShort104 - Static229.anInt4641;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static197.anInt3776 - local1252.aShort101;
						local711 = local1252.aShort102 - Static197.anInt3776;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass11_Sub5Array3[local1245] = local1252;
						arg0.anIntArray486[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class11_Sub5 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass11_Sub5Array3[local1078];
						if (local1384.anInt6766 != Static180.anInt3552) {
							local706 = arg0.anIntArray486[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6768 - Static328.anInt6520;
								local714 = local1384.anInt6770 - Static334.anInt6684;
								local723 = arg0.aClass11_Sub5Array3[local1074].anInt6768 - Static328.anInt6520;
								local735 = arg0.aClass11_Sub5Array3[local1074].anInt6770 - Static334.anInt6684;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass11_Sub5Array3[local1074];
					local1384.anInt6766 = Static180.anInt3552;
					if (!Static282.method5224(local15, local1384.aShort103, local1384.aShort104, local1384.aShort101, local1384.aShort102, local1384.method6081())) {
						if (Static151.aBoolean208) {
							if (local1384.aByte77 == 0) {
								Static301.method5537(arg0, local12, local1384.aShort103, local1384.aShort101, local1384.aShort104, local1384.aShort102);
							} else {
								Static147.method2798(arg0, local12, local6, local9);
								local706 = local6 - Static229.anInt4641;
								local711 = local9 - Static197.anInt3776;
								if (local1384.aByte77 == 2) {
									if (local711 > -local706) {
										Static273.method5104(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static273.method5104(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static273.method5104(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static273.method5104(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
						}
						local616 = local1384.method6074(Static16.aClass19_10);
						if (local616 != null) {
							local616.aClass11_1 = local1384;
							local616.anInt4068 = local12;
							local616.anInt4071 = local1384.aShort103;
							local616.anInt4070 = local1384.aShort101;
							Class2_Sub4.aClass36_6.method1420(local616);
						}
					}
					for (local706 = local1384.aShort103; local706 <= local1384.aShort104; local706++) {
						for (local711 = local1384.aShort101; local711 <= local1384.aShort102; local711++) {
							@Pc(1609) Class67 local1609 = local31[local706][local711];
							if (local1609.aByte9 != 0) {
								Static153.aClass15_1.method1585(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean136) {
								Static153.aClass15_1.method1585(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean137) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean137 = false;
			}
		}
		if (arg1.aClass224_1 != null && arg1.aByte13 == (byte) (Static269.anInt5500 & 0xFF)) {
			@Pc(1664) Class224 local1664 = arg1.aClass224_1;
			local406 = Static340.aClass6Array4[local12].method5720(local6, local9);
			if (local12 < Static86.anInt1912 - 1) {
				local408 = Static340.aClass6Array4[local12].method5720(local6, local9) - Static340.aClass6Array4[local12 + 1].method5720(local6, local9);
			} else {
				local408 = 1024;
			}
			Static48.aClass14_2.method3935(local21, local406, local27, arg0.anIntArray487);
			local1074 = arg0.anIntArray487[2];
			Static48.aClass14_2.method3935(local21, local406 - local408, local27, arg0.anIntArray487);
			local1078 = arg0.anIntArray487[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static290.anInt5864;
			local706 += Static290.anInt5864;
			if (local1333 < local706 - 1597) {
				local1333 = local706 - 1597;
			}
			local1664.anInt6357 = local1333;
			local1664.anInt6359 = local706;
			local1664.aBoolean429 = true;
			Static16.aClass19_10.method2835(local1664);
		}
		if (!arg1.aBoolean136) {
			return;
		}
		if (arg1.aByte9 != 0) {
			return;
		}
		if (local6 <= Static229.anInt4641 && local6 > Static152.anInt2957) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		if (local6 >= Static229.anInt4641 && local6 < Static206.anInt4628 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		if (local9 <= Static197.anInt3776 && local9 > Static207.anInt3944) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		if (local9 >= Static197.anInt3776 && local9 < Static28.anInt722 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		arg1.aBoolean136 = false;
		Class236.anInt6724--;
		@Pc(1862) Class11_Sub4 local1862 = arg1.aClass11_Sub4_1;
		if (local1862 != null && local1862.aBoolean259) {
			if (Static151.aBoolean208) {
				Static147.method2798(arg0, local12, local6, local9);
				Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
			}
			@Pc(1885) Class12_Sub4 local1885 = local1862.method6074(Static16.aClass19_10);
			if (local1885 != null) {
				local1885.aClass11_1 = local1862;
				local1885.anInt4068 = local12;
				local1885.anInt4071 = local6;
				local1885.anInt4070 = local9;
				Class2_Sub4.aClass36_6.method1420(local1885);
			}
		}
		if (arg1.aShort21 != 0) {
			@Pc(1909) Class11_Sub3 local1909 = arg1.aClass11_Sub3_2;
			if (local1909 != null && !Static61.method1736(local15, local6, local9, local1909.method5749())) {
				if ((local1909.anInt6334 & arg1.aShort21) != 0) {
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					local377 = local1909.method6074(Static16.aClass19_10);
					if (local377 != null) {
						local377.aClass11_1 = local1909;
						local377.anInt4068 = local12;
						local377.anInt4071 = local6;
						local377.anInt4070 = local9;
						Class2_Sub4.aClass36_6.method1420(local377);
					}
				} else if (local1909.anInt6334 == 256) {
					local408 = local1909.anInt6332 - Static328.anInt6520;
					local1074 = local1909.anInt6330 - Static334.anInt6684;
					local1078 = local1909.anInt6329;
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
					if (Static151.aBoolean208) {
						Static147.method2798(arg0, local12, local6, local9);
						Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(2019) Class11_Sub3 local2019 = arg1.aClass11_Sub3_3;
					@Pc(2027) Class12_Sub4 local2027;
					if (local706 > local1333) {
						local2027 = local1909.method6074(Static16.aClass19_10);
						if (local2027 != null) {
							local2027.aClass11_1 = local1909;
							local2027.anInt4068 = local12;
							local2027.anInt4071 = local6;
							local2027.anInt4070 = local9;
							Class2_Sub4.aClass36_6.method1420(local2027);
						}
					} else if (local2019 != null) {
						local2027 = local2019.method6074(Static16.aClass19_10);
						if (local2027 != null) {
							local2027.aClass11_1 = local2019;
							local2027.anInt4068 = local12;
							local2027.anInt4071 = local6;
							local2027.anInt4070 = local9;
							Class2_Sub4.aClass36_6.method1420(local2027);
						}
					}
				}
			}
			local1057 = arg1.aClass11_Sub1_3;
			local411 = arg1.aClass11_Sub1_2;
			@Pc(2112) Class12_Sub4 local2112;
			if (local411 != null && (local411.anInt3478 & arg1.aShort21) != 0 && !Static42.method1403(local15, local6, local9, local411.anInt3478)) {
				if (Static151.aBoolean208) {
					Static162.method3317(arg0, local411.anInt3478, local12, local6, local9);
					Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
				}
				local2112 = local411.method6074(Static16.aClass19_10);
				if (local2112 != null) {
					local2112.aClass11_1 = local411;
					local2112.anInt4068 = local12;
					local2112.anInt4071 = local6;
					local2112.anInt4070 = local9;
					Class2_Sub4.aClass36_6.method1420(local2112);
				}
			}
			if (local1057 != null && (local1057.anInt3478 & arg1.aShort21) != 0 && !Static42.method1403(local15, local6, local9, local1057.anInt3478)) {
				if (Static151.aBoolean208) {
					Static162.method3317(arg0, local1057.anInt3478, local12, local6, local9);
					Static16.aClass19_10.method2836(arg0.anInt7100, arg0.aClass2_Sub26_Sub1Array3);
				}
				local2112 = local1057.method6074(Static16.aClass19_10);
				if (local2112 != null) {
					local2112.aClass11_1 = local1057;
					local2112.anInt4068 = local12;
					local2112.anInt4071 = local6;
					local2112.anInt4070 = local9;
					Class2_Sub4.aClass36_6.method1420(local2112);
				}
			}
		}
		@Pc(2198) Class67 local2198;
		if (local12 < Static86.anInt1912 - 1) {
			local2198 = Static307.aClass67ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2198 != null && local2198.aBoolean136) {
				Static153.aClass15_1.method1586(local2198);
			}
		}
		if (local6 < Static229.anInt4641) {
			local2198 = local31[local6 + 1][local9];
			if (local2198 != null && local2198.aBoolean136) {
				Static153.aClass15_1.method1585(local2198);
			}
		}
		if (local9 < Static197.anInt3776) {
			local2198 = local31[local6][local9 + 1];
			if (local2198 != null && local2198.aBoolean136) {
				Static153.aClass15_1.method1585(local2198);
			}
		}
		if (local6 > Static229.anInt4641) {
			local2198 = local31[local6 - 1][local9];
			if (local2198 != null && local2198.aBoolean136) {
				Static153.aClass15_1.method1585(local2198);
			}
		}
		if (local9 > Static197.anInt3776) {
			local2198 = local31[local6][local9 - 1];
			if (local2198 != null && local2198.aBoolean136) {
				Static153.aClass15_1.method1585(local2198);
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(Z)V", line = 1143)
	public static void method5954() {
		Static313.method5706(25);
		Static107.method2364();
		System.gc();
	}
}
