import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[[Lclient!wl;")
	public static Class2_Sub32[][] aClass2_Sub32ArrayArray3;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_7;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "Lclient!dk;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!jj;")
	public static Class87 aClass87_4;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!sf;")
	public static Class157 aClass157_17 = new Class157(16);

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "[I")
	public static int[] anIntArray194 = new int[1024];

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!sf;")
	public static Class157 aClass157_18 = new Class157(8);

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!sf;")
	public static Class157 aClass157_19 = new Class157(16);

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[Lclient!rm;")
	public static Class154[] aClass154Array1 = new Class154[4];

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString77 = "Allocating memory";

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt2131 = -1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
	public static void method1572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static99.anInt2343 == 0 || arg1 == 0 || Static76.anInt1889 >= 50 || arg0 == -1) {
			return;
		}
		Static10.anIntArray26[Static76.anInt1889] = arg0;
		Static193.anIntArray403[Static76.anInt1889] = arg1;
		Static278.anIntArray524[Static76.anInt1889] = arg3;
		Static73.aClass173Array1[Static76.anInt1889] = null;
		Static246.anIntArray478[Static76.anInt1889] = 0;
		Static29.anIntArray64[Static76.anInt1889] = arg2;
		Static76.anInt1889++;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!qk;Lclient!qk;B)V")
	public static void method1574(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_233 != null) {
			arg1.method4743();
		}
		arg1.aClass2_233 = arg0.aClass2_233;
		arg1.aClass2_232 = arg0;
		arg1.aClass2_233.aClass2_232 = arg1;
		arg1.aClass2_232.aClass2_233 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!oe;B)Lclient!uf;")
	public static Class13_Sub4 method1575(@OriginalArg(0) Class2_Sub16 arg0) {
		return new Class13_Sub4(arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2166(), arg0.method2146());
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Lclient!nj;")
	public static Class121 method1576(@OriginalArg(1) int arg0) {
		@Pc(10) Class121 local10 = (Class121) Static57.aClass157_11.method4031((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static229.aClass42_72.method1256(1, arg0);
		local10 = new Class121();
		local10.anInt4016 = arg0;
		if (local21 != null) {
			local10.method3290(new Class2_Sub16(local21));
		}
		local10.method3294();
		if (local10.anInt4001 == 2 && Static270.aClass101_17.method2867((long) arg0) == null) {
			Static270.aClass101_17.method2860(new Class2_Sub25(Static86.anInt2007), (long) arg0);
			Static146.aClass121Array1[Static86.anInt2007++] = local10;
		}
		Static57.aClass157_11.method4026((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static void method1577() {
		aClass157_17.method4034(5);
		Static48.aClass157_10.method4034(5);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method1578() {
		@Pc(15) int local15;
		@Pc(29) int local29;
		@Pc(21) int local21;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (Static259.anInt5137 == 107) {
			local15 = Static91.aClass2_Sub16_Sub1_1.method2175();
			local21 = (local15 & 0x7) + Static215.anInt4395;
			local29 = (local15 >> 4 & 0x7) + Static5.anInt4796;
			local35 = Static91.aClass2_Sub16_Sub1_1.method2195();
			local39 = Static91.aClass2_Sub16_Sub1_1.method2152();
			local43 = Static91.aClass2_Sub16_Sub1_1.method2152();
			if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104 && local39 != Static22.anInt504) {
				@Pc(67) Class15_Sub1 local67 = new Class15_Sub1();
				local67.anInt462 = local35;
				local67.anInt463 = local43;
				if (Static121.aClass44ArrayArrayArray1[Static32.anInt876][local29][local21] == null) {
					Static121.aClass44ArrayArrayArray1[Static32.anInt876][local29][local21] = new Class44();
				}
				Static121.aClass44ArrayArrayArray1[Static32.anInt876][local29][local21].method1358(new Class2_Sub8_Sub19(local67));
				Static99.method1706(local29, local21);
			}
			return;
		}
		@Pc(152) int local152;
		@Pc(162) int local162;
		@Pc(166) int local166;
		@Pc(189) int local189;
		if (Static259.anInt5137 == 124) {
			local15 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local29 = (local15 >> 4 & 0x7) + Static5.anInt4796;
			local21 = Static215.anInt4395 + (local15 & 0x7);
			local35 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local39 = Static91.aClass2_Sub16_Sub1_1.method2146();
			if (local35 == 65535) {
				local35 = -1;
			}
			local152 = local39 & 0x7;
			local43 = local39 >> 4 & 0xF;
			local162 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local166 = Static91.aClass2_Sub16_Sub1_1.method2146();
			if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
				local189 = local43 + 1;
				if (local29 - local189 <= Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] && Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] <= local189 + local29 && Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] >= local21 - local189 && local189 + local21 >= Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] && Static201.anInt4203 != 0 && local152 > 0 && Static76.anInt1889 < 50 && local35 != -1) {
					Static10.anIntArray26[Static76.anInt1889] = local35;
					Static193.anIntArray403[Static76.anInt1889] = local152;
					Static278.anIntArray524[Static76.anInt1889] = local162;
					Static73.aClass173Array1[Static76.anInt1889] = null;
					Static246.anIntArray478[Static76.anInt1889] = (local21 << 8) + ((local29 << 16) + local43);
					Static29.anIntArray64[Static76.anInt1889] = local166;
					Static76.anInt1889++;
				}
			}
		} else if (Static259.anInt5137 == 77) {
			local15 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local29 = Static91.aClass2_Sub16_Sub1_1.method2146();
			Static10.method158(local15).method3813(local29);
		} else if (Static259.anInt5137 == 59) {
			local15 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local21 = (local15 & 0x7) + Static215.anInt4395;
			local29 = (local15 >> 4 & 0x7) + Static5.anInt4796;
			local35 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local39 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local43 = Static91.aClass2_Sub16_Sub1_1.method2130();
			if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
				local21 = local21 * 128 + 64;
				local29 = local29 * 128 + 64;
				@Pc(394) Class15_Sub6 local394 = new Class15_Sub6(local35, Static32.anInt876, local29, local21, Static234.method3798(local21, local29, Static32.anInt876) - local39, local43, Static268.anInt5236);
				Static88.aClass44_8.method1358(new Class2_Sub8_Sub17(local394));
			}
		} else {
			@Pc(468) int local468;
			@Pc(472) int local472;
			@Pc(476) int local476;
			@Pc(568) Class15_Sub3 local568;
			if (Static259.anInt5137 == 228) {
				local15 = Static91.aClass2_Sub16_Sub1_1.method2146();
				local29 = Static5.anInt4796 + (local15 >> 4 & 0x7);
				local21 = Static215.anInt4395 + (local15 & 0x7);
				local35 = Static91.aClass2_Sub16_Sub1_1.method2170() + local29;
				local39 = local21 + Static91.aClass2_Sub16_Sub1_1.method2170();
				local43 = Static91.aClass2_Sub16_Sub1_1.method2191();
				local152 = Static91.aClass2_Sub16_Sub1_1.method2130();
				local162 = Static91.aClass2_Sub16_Sub1_1.method2146() * 4;
				local166 = Static91.aClass2_Sub16_Sub1_1.method2146() * 4;
				local189 = Static91.aClass2_Sub16_Sub1_1.method2130();
				local468 = Static91.aClass2_Sub16_Sub1_1.method2130();
				local472 = Static91.aClass2_Sub16_Sub1_1.method2146();
				local476 = Static91.aClass2_Sub16_Sub1_1.method2146();
				if (local472 == 255) {
					local472 = -1;
				}
				if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local152 != 65535) {
					local21 = local21 * 128 + 64;
					local39 = local39 * 128 + 64;
					local29 = local29 * 128 + 64;
					local35 = local35 * 128 + 64;
					local568 = new Class15_Sub3(local152, Static32.anInt876, local29, local21, Static234.method3798(local21, local29, Static32.anInt876) - local162, local189 - -Static268.anInt5236, Static268.anInt5236 + local468, local472, local476, local43, local166);
					local568.method755(Static268.anInt5236 + local189, local39, Static234.method3798(local39, local35, Static32.anInt876) - local166, local35);
					Static34.aClass44_2.method1358(new Class2_Sub8_Sub11(local568));
				}
			} else if (Static259.anInt5137 == 12) {
				local15 = Static91.aClass2_Sub16_Sub1_1.method2146();
				local29 = Static5.anInt4796 + (local15 >> 4 & 0x7);
				local21 = (local15 & 0x7) + Static215.anInt4395;
				local35 = Static91.aClass2_Sub16_Sub1_1.method2195();
				if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
					@Pc(647) Class44 local647 = Static121.aClass44ArrayArrayArray1[Static32.anInt876][local29][local21];
					if (local647 != null) {
						for (@Pc(658) Class2_Sub8_Sub19 local658 = (Class2_Sub8_Sub19) local647.method1352(); local658 != null; local658 = (Class2_Sub8_Sub19) local647.method1360()) {
							if ((local35 & 0x7FFF) == local658.aClass15_Sub1_1.anInt462) {
								local658.method4743();
								break;
							}
						}
						if (local647.method1352() == null) {
							Static121.aClass44ArrayArrayArray1[Static32.anInt876][local29][local21] = null;
						}
						Static99.method1706(local29, local21);
					}
				}
			} else if (Static259.anInt5137 == 115) {
				local15 = Static91.aClass2_Sub16_Sub1_1.method2175();
				local29 = local15 >> 2;
				local35 = Static61.anIntArray129[local29];
				local39 = Static91.aClass2_Sub16_Sub1_1.method2146();
				local43 = Static5.anInt4796 + (local39 >> 4 & 0x7);
				local152 = (local39 & 0x7) + Static215.anInt4395;
				local21 = local15 & 0x3;
				if (local43 >= 0 && local152 >= 0 && local43 < 104 && local152 < 104) {
					Static143.method2544(local29, local43, Static32.anInt876, local35, -1, local152, -1, local21, 0);
				}
			} else if (Static259.anInt5137 == 19) {
				local15 = Static91.aClass2_Sub16_Sub1_1.method2137();
				local29 = Static91.aClass2_Sub16_Sub1_1.method2152();
				local21 = Static91.aClass2_Sub16_Sub1_1.method2146();
				local39 = (local21 & 0x7) + Static215.anInt4395;
				local35 = (local21 >> 4 & 0x7) + Static5.anInt4796;
				if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104) {
					@Pc(833) Class15_Sub1 local833 = new Class15_Sub1();
					local833.anInt463 = local15;
					local833.anInt462 = local29;
					if (Static121.aClass44ArrayArrayArray1[Static32.anInt876][local35][local39] == null) {
						Static121.aClass44ArrayArrayArray1[Static32.anInt876][local35][local39] = new Class44();
					}
					Static121.aClass44ArrayArrayArray1[Static32.anInt876][local35][local39].method1358(new Class2_Sub8_Sub19(local833));
					Static99.method1706(local35, local39);
				}
			} else {
				if (Static259.anInt5137 == 171) {
					local15 = Static91.aClass2_Sub16_Sub1_1.method2137();
					@Pc(891) byte local891 = Static91.aClass2_Sub16_Sub1_1.method2187();
					@Pc(895) byte local895 = Static91.aClass2_Sub16_Sub1_1.method2187();
					local35 = Static91.aClass2_Sub16_Sub1_1.method2195();
					@Pc(905) byte local905 = Static91.aClass2_Sub16_Sub1_1.method2139();
					local43 = Static91.aClass2_Sub16_Sub1_1.method2162();
					local152 = Static91.aClass2_Sub16_Sub1_1.method2148();
					local162 = local152 >> 2;
					local166 = local152 & 0x3;
					local189 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local468 = Static91.aClass2_Sub16_Sub1_1.method2175();
					local472 = (local468 >> 4 & 0x7) + Static5.anInt4796;
					local476 = Static215.anInt4395 + (local468 & 0x7);
					@Pc(947) byte local947 = Static91.aClass2_Sub16_Sub1_1.method2185();
					if (!Static116.aBoolean184) {
						Static61.method1173(local15, local189, local891, local35, local947, local162, local895, local43, local472, local905, local476, local166);
					}
				}
				if (Static259.anInt5137 == 145) {
					local15 = Static91.aClass2_Sub16_Sub1_1.method2146();
					local29 = Static5.anInt4796 + (local15 >> 4 & 0x7);
					local21 = (local15 & 0x7) + Static215.anInt4395;
					local35 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local39 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local43 = Static91.aClass2_Sub16_Sub1_1.method2130();
					if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
						@Pc(1031) Class44 local1031 = Static121.aClass44ArrayArrayArray1[Static32.anInt876][local29][local21];
						if (local1031 != null) {
							for (@Pc(1038) Class2_Sub8_Sub19 local1038 = (Class2_Sub8_Sub19) local1031.method1352(); local1038 != null; local1038 = (Class2_Sub8_Sub19) local1031.method1360()) {
								@Pc(1043) Class15_Sub1 local1043 = local1038.aClass15_Sub1_1;
								if ((local35 & 0x7FFF) == local1043.anInt462 && local39 == local1043.anInt463) {
									local1043.anInt463 = local43;
									break;
								}
							}
							Static99.method1706(local29, local21);
						}
					}
				} else if (Static259.anInt5137 == 32) {
					local15 = Static91.aClass2_Sub16_Sub1_1.method2146();
					local29 = (local15 >> 4 & 0xF) + Static5.anInt4796 * 2;
					local21 = (local15 & 0xF) + Static215.anInt4395 * 2;
					local35 = Static91.aClass2_Sub16_Sub1_1.method2170() + local29;
					local39 = Static91.aClass2_Sub16_Sub1_1.method2170() + local21;
					local43 = Static91.aClass2_Sub16_Sub1_1.method2191();
					local152 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local162 = Static91.aClass2_Sub16_Sub1_1.method2146() * 4;
					local166 = Static91.aClass2_Sub16_Sub1_1.method2146() * 4;
					local189 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local468 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local472 = Static91.aClass2_Sub16_Sub1_1.method2146();
					local476 = Static91.aClass2_Sub16_Sub1_1.method2146();
					if (local472 == 255) {
						local472 = -1;
					}
					if (local29 >= 0 && local21 >= 0 && local29 < 208 && local21 < 208 && local35 >= 0 && local39 >= 0 && local35 < 208 && local39 < 208 && local152 != 65535) {
						local35 = local35 * 64;
						local21 = local21 * 64;
						local39 = local39 * 64;
						local29 = local29 * 64;
						local568 = new Class15_Sub3(local152, Static32.anInt876, local29, local21, Static234.method3798(local21, local29, Static32.anInt876) - local162, local189 - -Static268.anInt5236, local468 + Static268.anInt5236, local472, local476, local43, local166);
						local568.method755(Static268.anInt5236 + local189, local39, Static234.method3798(local39, local35, Static32.anInt876) - local166, local35);
						Static34.aClass44_2.method1358(new Class2_Sub8_Sub11(local568));
					}
				} else if (Static259.anInt5137 == 109) {
					local15 = Static91.aClass2_Sub16_Sub1_1.method2146();
					local29 = Static5.anInt4796 * 2 + (local15 >> 4 & 0xF);
					local21 = (local15 & 0xF) + Static215.anInt4395 * 2;
					local35 = local29 + Static91.aClass2_Sub16_Sub1_1.method2170();
					local39 = Static91.aClass2_Sub16_Sub1_1.method2170() + local21;
					local43 = Static91.aClass2_Sub16_Sub1_1.method2191();
					local152 = Static91.aClass2_Sub16_Sub1_1.method2191();
					local162 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local166 = Static91.aClass2_Sub16_Sub1_1.method2170();
					local189 = Static91.aClass2_Sub16_Sub1_1.method2146() * 4;
					local468 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local472 = Static91.aClass2_Sub16_Sub1_1.method2130();
					local476 = Static91.aClass2_Sub16_Sub1_1.method2146();
					if (local476 == 255) {
						local476 = -1;
					}
					@Pc(1358) int local1358 = Static91.aClass2_Sub16_Sub1_1.method2146();
					if (local29 >= 0 && local21 >= 0 && local29 < 208 && local21 < 208 && local35 >= 0 && local39 >= 0 && local35 < 208 && local39 < 208 && local162 != 65535) {
						local29 *= 64;
						local35 = local35 * 64;
						local39 *= 64;
						local21 *= 64;
						if (local43 != 0) {
							@Pc(1431) int local1431;
							@Pc(1440) Class15_Sub2 local1440;
							@Pc(1425) int local1425;
							@Pc(1435) int local1435;
							if (local43 < 0) {
								local1425 = -local43 - 1;
								local1431 = local1425 >> 11 & 0xF;
								local1435 = local1425 & 0x7FF;
								if (Static22.anInt504 == local1435) {
									local1440 = Static22.aClass15_Sub2_Sub2_1;
								} else {
									local1440 = Static188.aClass15_Sub2_Sub2Array41[local1435];
								}
							} else {
								local1425 = local43 - 1;
								local1435 = local1425 & 0x7FF;
								local1440 = Static35.aClass15_Sub2_Sub1Array2[local1435];
								local1431 = local1425 >> 11 & 0xF;
							}
							if (local1440 != null) {
								@Pc(1473) Class123 local1473 = local1440.method4297();
								if (local1473.anIntArrayArray28 != null && local1473.anIntArrayArray28[local1431] != null) {
									local1435 = local1473.anIntArrayArray28[local1431][0];
									local166 -= local1473.anIntArrayArray28[local1431][1];
									@Pc(1506) int local1506 = local1473.anIntArrayArray28[local1431][2];
									@Pc(1511) int local1511 = Class1.anIntArray4[local1440.anInt5373];
									@Pc(1516) int local1516 = Class1.anIntArray3[local1440.anInt5373];
									@Pc(1526) int local1526 = local1516 * local1435 + local1511 * local1506 >> 16;
									@Pc(1537) int local1537 = local1506 * local1516 - local1435 * local1511 >> 16;
									local21 += local1537;
									local29 += local1526;
								}
							}
						}
						@Pc(1572) Class15_Sub3 local1572 = new Class15_Sub3(local162, Static32.anInt876, local29, local21, Static234.method3798(local21, local29, Static32.anInt876) - local166, Static268.anInt5236 + local468, Static268.anInt5236 + local472, local476, local1358, local152, local189);
						local1572.method755(Static268.anInt5236 + local468, local39, Static234.method3798(local39, local35, Static32.anInt876) - local189, local35);
						Static34.aClass44_2.method1358(new Class2_Sub8_Sub11(local1572));
					}
				} else if (Static259.anInt5137 == 179) {
					local15 = Static91.aClass2_Sub16_Sub1_1.method2152();
					local29 = Static91.aClass2_Sub16_Sub1_1.method2175();
					local35 = (local29 & 0x7) + Static215.anInt4395;
					local21 = (local29 >> 4 & 0x7) + Static5.anInt4796;
					local39 = Static91.aClass2_Sub16_Sub1_1.method2148();
					local152 = local39 & 0x3;
					local43 = local39 >> 2;
					local162 = Static61.anIntArray129[local43];
					if (local21 >= 0 && local35 >= 0 && local21 < 104 && local35 < 104) {
						Static143.method2544(local43, local21, Static32.anInt876, local162, -1, local35, local15, local152, 0);
					}
				} else if (Static259.anInt5137 == 22) {
					local15 = Static91.aClass2_Sub16_Sub1_1.method2133();
					local21 = (local15 & 0x7) + Static215.anInt4395;
					local29 = Static5.anInt4796 + (local15 >> 4 & 0x7);
					local35 = Static91.aClass2_Sub16_Sub1_1.method2133();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local152 = Static61.anIntArray129[local39];
					local162 = Static91.aClass2_Sub16_Sub1_1.method2137();
					if (local162 == 65535) {
						local162 = -1;
					}
					Static180.method3213(local152, local162, Static32.anInt876, local43, local29, local21, local39);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)J")
	public static long method1579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass147_1 == null ? 0L : local7.aClass147_1.aLong178;
	}
}
