import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
	public static int anInt2649;

	@OriginalMember(owner = "client!dba", name = "B", descriptor = "Lclient!mi;")
	public static Class46 aClass46_10;

	@OriginalMember(owner = "client!dba", name = "C", descriptor = "Lclient!wh;")
	public static Class78 aClass78_2;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_32 = new Class215(41, 3);

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_13 = new Class169(8);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method2492(@OriginalArg(1) File arg0) {
		return Static93.method2534((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!ha;IIB)V")
	public static void method2494(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static210.anInt4754 == 0 || Static639.anInt11039 == 0) {
			return;
		}
		@Pc(56) Class30 local56;
		@Pc(45) int local45;
		@Pc(41) int local41;
		@Pc(47) int local47;
		@Pc(43) int local43;
		@Pc(71) int local71;
		@Pc(69) int local69;
		if (Static487.aBoolean676) {
			Static353.method6007(false);
			local56 = arg0.method7243();
			@Pc(82) int[] local82 = arg0.Y();
			local45 = local82[0];
			local41 = local82[1];
			local43 = local82[3];
			local47 = local82[2];
			local71 = arg1 + Static369.method6236(false);
			local69 = Static25.method8256(false) + arg2;
		} else {
			arg0.DA(Static111.anInt3012, Static485.anInt8995, Static210.anInt4754, Static639.anInt11039);
			local41 = Static485.anInt8995;
			local43 = Static639.anInt11039;
			local45 = Static111.anInt3012;
			local47 = Static210.anInt4754;
			arg0.KA(Static368.anInt7333, Static178.anInt4288, Static210.anInt4754, Static639.anInt11039);
			local56 = arg0.method7257();
			local56.method4658(Static557.anInt9973, Static100.anInt2830, Static242.anInt5255, Static617.anInt10794, Static596.anInt10492, Static99.anInt2777);
			arg0.method7241(local56);
			local69 = arg2;
			local71 = arg1;
		}
		Static514.method7843(true);
		if (local47 == 0) {
			local47 = 1;
		}
		if (local43 == 0) {
			local43 = 1;
		}
		@Pc(142) int local142;
		@Pc(153) int local153;
		@Pc(171) int local171;
		@Pc(280) int local280;
		@Pc(289) int local289;
		@Pc(300) int local300;
		@Pc(311) int local311;
		@Pc(134) int local134;
		@Pc(357) int local357;
		if (Static40.aClass65Array2 != null && (!Static475.aBoolean695 || (Static237.anInt5148 & 0x40) != 0)) {
			local134 = -1;
			@Pc(136) int local136 = -1;
			@Pc(139) int local139 = arg0.i();
			local142 = arg0.XA();
			@Pc(162) int local162;
			@Pc(179) int local179;
			if (Static639.aBoolean753) {
				local153 = local179 = Static380.anInt7419 * (local71 - local45) / local47;
				local162 = local171 = Static380.anInt7419 * (local69 - local41) / local43;
			} else {
				local153 = local139 * (local71 - local45) / local47;
				local162 = local139 * (local69 - local41) / local43;
				local171 = local142 * (local69 - local41) / local43;
				local179 = (local71 - local45) * local142 / local47;
			}
			@Pc(218) int[] local218 = new int[] { local153, local162, local139 };
			@Pc(233) int[] local233 = new int[] { local179, local171, local142 };
			local56.method4645(local218);
			local56.method4645(local233);
			@Pc(267) float local267 = Static354.method6009((float) local218[1], (float) local233[0], (float) local218[2], (float) local233[2], 4, (float) local218[0], (float) local233[1]);
			if (local267 > 0.0F) {
				local280 = local233[0] - local218[0];
				local289 = local233[2] - local218[2];
				local300 = (int) ((float) local218[0] + (float) local280 * local267);
				local311 = (int) ((float) local218[2] + (float) local289 * local267);
				local134 = (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() - 1 << 8) + local300 >> 9;
				local136 = local311 + (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() - 1 << 8) >> 9;
				@Pc(339) byte local339 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132;
				if (local339 < 3 && (Static476.aByteArrayArrayArray5[1][local300 >> 9][local311 >> 9] & 0x2) != 0) {
					local357 = local339 + 1;
				}
			}
			if (local134 != -1 && local136 != -1) {
				if (Static475.aBoolean695 && (Static237.anInt5148 & 0x40) != 0) {
					@Pc(423) Class24 local423 = Static330.method5694(Static194.anInt4509, Static397.anInt7582);
					if (local423 == null) {
						Static117.method2902();
					} else {
						Static202.method4065(false, " ->", local136, true, local134, -1, true, 15, (long) (local134 << 0 | local136), Static225.aString48, 0L, Static183.anInt4410);
					}
				} else {
					if (Static370.aBoolean536) {
						Static202.method4065(false, "", local136, true, local134, -1, true, 12, (long) (local136 | local134 << 0), Static588.aClass351_29.method8691(Static476.anInt8915), 0L, -1);
					}
					Static202.method4065(false, "", local136, true, local134, -1, true, 19, (long) (local136 | local134 << 0), Static282.aString60, 0L, Static10.anInt160);
				}
			}
		}
		if (Static487.aBoolean676) {
			Static31.method767();
		}
		for (local134 = 0; (Static487.aBoolean676 ? 2 : 1) > local134; local134++) {
			@Pc(462) boolean local462 = local134 == 0;
			@Pc(468) Class182 local468 = local462 ? Static292.aClass182_1 : Static423.aClass182_3;
			local142 = arg1;
			local153 = arg2;
			if (Static487.aBoolean676) {
				Static353.method6007(local462);
				local142 = arg1 + Static369.method6236(local462);
				local153 = arg2 + Static25.method8256(local462);
			}
			@Pc(492) Class325 local492 = local468.aClass325_4;
			for (@Pc(497) Class3_Sub4 local497 = (Class3_Sub4) local492.method8016(); local497 != null; local497 = (Class3_Sub4) local492.method8022()) {
				if ((Static291.aBoolean462 || Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 == local497.aClass3_Sub1_15.aByte132) && local497.method4732(local153, local142, arg0)) {
					@Pc(527) int local527;
					if (local497.aClass3_Sub1_15 instanceof Class3_Sub1_Sub3) {
						local527 = ((Class3_Sub1_Sub3) local497.aClass3_Sub1_15).aShort120;
						local171 = ((Class3_Sub1_Sub3) local497.aClass3_Sub1_15).aShort118;
					} else {
						local527 = local497.aClass3_Sub1_15.anInt10310 >> 9;
						local171 = local497.aClass3_Sub1_15.anInt10303 >> 9;
					}
					@Pc(664) int local664;
					@Pc(676) int local676;
					@Pc(787) int local787;
					@Pc(558) int local558;
					if (local497.aClass3_Sub1_15 instanceof Class3_Sub1_Sub3_Sub3_Sub2) {
						@Pc(554) Class3_Sub1_Sub3_Sub3_Sub2 local554 = (Class3_Sub1_Sub3_Sub3_Sub2) local497.aClass3_Sub1_15;
						local558 = local554.method5214();
						if ((local558 & 0x1) == 0 && (local554.anInt10303 & 0x1FF) == 0 && (local554.anInt10310 & 0x1FF) == 0 || (local558 & 0x1) == 1 && (local554.anInt10303 & 0x1FF) == 256 && (local554.anInt10310 & 0x1FF) == 256) {
							local280 = local554.anInt10303 - (local554.method5214() - 1 << 8);
							local289 = local554.anInt10310 - (local554.method5214() - 1 << 8);
							for (local300 = 0; local300 < Static398.anInt7589; local300++) {
								@Pc(635) Class2_Sub33 local635 = (Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local300]);
								if (local635 != null) {
									@Pc(640) Class3_Sub1_Sub3_Sub3_Sub1 local640 = local635.aClass3_Sub1_Sub3_Sub3_Sub1_2;
									if (local640.anInt6027 != Static407.anInt7704 && local640.aBoolean454) {
										local664 = local640.anInt10303 - (local640.aClass27_1.anInt666 - 1 << 8);
										local676 = local640.anInt10310 - (local640.aClass27_1.anInt666 - 1 << 8);
										if (local280 <= local664 && local640.aClass27_1.anInt666 <= local554.method5214() - (local664 - local280 >> 9) && local289 <= local676 && local640.aClass27_1.anInt666 <= local554.method5214() - (local676 - local289 >> 9)) {
											Static130.method3021(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 != local497.aClass3_Sub1_15.aByte132, local640);
											local640.anInt6027 = Static407.anInt7704;
										}
									}
								}
							}
							local311 = Static71.anInt3990;
							@Pc(751) int[] local751 = Static549.anIntArray643;
							for (local664 = 0; local664 < local311; local664++) {
								@Pc(761) Class3_Sub1_Sub3_Sub3_Sub2 local761 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local751[local664]];
								if (local761 != null && Static407.anInt7704 != local761.anInt6027 && local554 != local761 && local761.aBoolean454) {
									local787 = local761.anInt10303 - (local761.method5214() - 1 << 8);
									@Pc(799) int local799 = local761.anInt10310 - (local761.method5214() - 1 << 8);
									if (local280 <= local787 && local761.method5214() <= local554.method5214() - (local787 - local280 >> 9) && local289 <= local799 && local761.method5214() <= local554.method5214() - (local799 - local289 >> 9)) {
										Static614.method8975(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 != local497.aClass3_Sub1_15.aByte132, local761);
										local761.anInt6027 = Static407.anInt7704;
									}
								}
							}
						}
						if (Static407.anInt7704 == local554.anInt6027) {
							continue;
						}
						Static614.method8975(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 != local497.aClass3_Sub1_15.aByte132, local554);
						local554.anInt6027 = Static407.anInt7704;
					}
					if (local497.aClass3_Sub1_15 instanceof Class3_Sub1_Sub3_Sub3_Sub1) {
						@Pc(902) Class3_Sub1_Sub3_Sub3_Sub1 local902 = (Class3_Sub1_Sub3_Sub3_Sub1) local497.aClass3_Sub1_15;
						if (local902.aClass27_1 != null) {
							if ((local902.aClass27_1.anInt666 & 0x1) == 0 && (local902.anInt10303 & 0x1FF) == 0 && (local902.anInt10310 & 0x1FF) == 0 || (local902.aClass27_1.anInt666 & 0x1) == 1 && (local902.anInt10303 & 0x1FF) == 256 && (local902.anInt10310 & 0x1FF) == 256) {
								local558 = local902.anInt10303 - (local902.aClass27_1.anInt666 - 1 << 8);
								local280 = local902.anInt10310 - (local902.aClass27_1.anInt666 - 1 << 8);
								for (local289 = 0; local289 < Static398.anInt7589; local289++) {
									@Pc(981) Class2_Sub33 local981 = (Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local289]);
									if (local981 != null) {
										@Pc(986) Class3_Sub1_Sub3_Sub3_Sub1 local986 = local981.aClass3_Sub1_Sub3_Sub3_Sub1_2;
										if (Static407.anInt7704 != local986.anInt6027 && local902 != local986 && local986.aBoolean454) {
											local357 = local986.anInt10303 - (local986.aClass27_1.anInt666 - 1 << 8);
											local664 = local986.anInt10310 - (local986.aClass27_1.anInt666 - 1 << 8);
											if (local357 >= local558 && local902.aClass27_1.anInt666 - (local357 - local558 >> 9) >= local986.aClass27_1.anInt666 && local664 >= local280 && local902.aClass27_1.anInt666 - (local664 - local280 >> 9) >= local986.aClass27_1.anInt666) {
												Static130.method3021(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 != local497.aClass3_Sub1_15.aByte132, local986);
												local986.anInt6027 = Static407.anInt7704;
											}
										}
									}
								}
								local300 = Static71.anInt3990;
								@Pc(1100) int[] local1100 = Static549.anIntArray643;
								for (local357 = 0; local357 < local300; local357++) {
									@Pc(1110) Class3_Sub1_Sub3_Sub3_Sub2 local1110 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local1100[local357]];
									if (local1110 != null && local1110.anInt6027 != Static407.anInt7704 && local1110.aBoolean454) {
										local676 = local1110.anInt10303 - (local1110.method5214() - 1 << 8);
										local787 = local1110.anInt10310 - (local1110.method5214() - 1 << 8);
										if (local558 <= local676 && local1110.method5214() <= local902.aClass27_1.anInt666 - (local676 - local558 >> 9) && local280 <= local787 && local1110.method5214() <= local902.aClass27_1.anInt666 - (local787 - local280 >> 9)) {
											Static614.method8975(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 != local497.aClass3_Sub1_15.aByte132, local1110);
											local1110.anInt6027 = Static407.anInt7704;
										}
									}
								}
							}
							if (local902.anInt6027 == Static407.anInt7704) {
								continue;
							}
							Static130.method3021(local497.aClass3_Sub1_15.aByte132 != Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, local902);
							local902.anInt6027 = Static407.anInt7704;
						}
					}
					if (local497.aClass3_Sub1_15 instanceof Class3_Sub1_Sub4_Sub1) {
						@Pc(1253) int local1253 = Static84.anInt2565 + local171;
						local558 = local527 + Static32.anInt723;
						@Pc(1275) Class2_Sub45 local1275 = (Class2_Sub45) Static378.aClass99_26.method3056((long) (local497.aClass3_Sub1_15.aByte132 << 28 | local558 << 14 | local1253));
						if (local1275 != null) {
							local289 = 0;
							@Pc(1285) Class2_Sub7 local1285 = (Class2_Sub7) local1275.aClass341_60.method8522();
							while (local1285 != null) {
								@Pc(1293) Class301 local1293 = Static635.aClass336_2.method8424(local1285.anInt790);
								if (Static475.aBoolean695 && local497.aClass3_Sub1_15.aByte132 == Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132) {
									@Pc(1315) Class335 local1315 = Static58.anInt10722 == -1 ? null : Static229.aClass70_1.method2496(Static58.anInt10722);
									if ((Static237.anInt5148 & 0x1) != 0 && (local1315 == null || local1293.method7713(local1315.anInt10093, Static58.anInt10722) != local1315.anInt10093)) {
										Static202.method4065(false, Static225.aString47 + " -> <col=ff9040>" + local1293.aString97, local527, false, local171, -1, true, 49, (long) local289, Static225.aString48, (long) local1285.anInt790, Static183.anInt4410);
									}
								}
								if (local497.aClass3_Sub1_15.aByte132 == Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132) {
									@Pc(1374) String[] local1374 = local1293.aStringArray40;
									for (local664 = 4; local664 >= 0; local664--) {
										if (local1374 != null && local1374[local664] != null) {
											@Pc(1386) byte local1386 = 0;
											if (local664 == 0) {
												local1386 = 21;
											}
											local787 = Static237.anInt5154;
											if (local664 == 1) {
												local1386 = 10;
											}
											if (local664 == 2) {
												local1386 = 47;
											}
											if (local664 == 3) {
												local1386 = 22;
											}
											if (local1293.anInt9167 == local664) {
												local787 = local1293.anInt9172;
											}
											if (local664 == 4) {
												local1386 = 5;
											}
											if (local664 == local1293.anInt9174) {
												local787 = local1293.anInt9228;
											}
											Static202.method4065(false, "<col=ff9040>" + local1293.aString97, local527, false, local171, -1, true, local1386, (long) local289, local1374[local664], (long) local1285.anInt790, local787);
										}
									}
								}
								Static202.method4065(local497.aClass3_Sub1_15.aByte132 != Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, "<col=ff9040>" + local1293.aString97, local527, false, local171, -1, true, 1010, (long) local289, Static588.aClass351_24.method8691(Static476.anInt8915), (long) local1285.anInt790, Static585.anInt10366);
								local1285 = (Class2_Sub7) local1275.aClass341_60.method8532();
								local289++;
							}
						}
					}
					if (local497.aClass3_Sub1_15 instanceof Interface21) {
						@Pc(1534) Interface21 local1534 = (Interface21) local497.aClass3_Sub1_15;
						@Pc(1541) Class161 local1541 = Static27.aClass342_3.method8534(local1534.method8625());
						if (local1541.anIntArray288 != null) {
							local1541 = local1541.method4606(Static286.aClass263_3);
						}
						if (local1541 != null) {
							if (Static475.aBoolean695 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 == local497.aClass3_Sub1_15.aByte132) {
								@Pc(1569) Class335 local1569 = Static58.anInt10722 == -1 ? null : Static229.aClass70_1.method2496(Static58.anInt10722);
								if ((Static237.anInt5148 & 0x4) != 0 && (local1569 == null || local1541.method4613(Static58.anInt10722, local1569.anInt10093) != local1569.anInt10093)) {
									Static202.method4065(false, Static225.aString47 + " -> <col=00ffff>" + local1541.aString55, local527, false, local171, -1, true, 2, (long) local1534.hashCode(), Static225.aString48, Static496.method7698(local1534, local527, local171), Static183.anInt4410);
								}
							}
							if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 == local497.aClass3_Sub1_15.aByte132) {
								@Pc(1638) String[] local1638 = local1541.aStringArray19;
								if (local1638 != null) {
									for (local289 = 4; local289 >= 0; local289--) {
										if (local1638[local289] != null) {
											@Pc(1650) short local1650 = 0;
											if (local289 == 0) {
												local1650 = 3;
											}
											local311 = Static237.anInt5154;
											if (local289 == 1) {
												local1650 = 4;
											}
											if (local289 == 2) {
												local1650 = 9;
											}
											if (local289 == 3) {
												local1650 = 59;
											}
											if (local289 == 4) {
												local1650 = 1007;
											}
											if (local1541.anInt5402 == local289) {
												local311 = local1541.anInt5359;
											}
											if (local289 == local1541.anInt5403) {
												local311 = local1541.anInt5365;
											}
											Static202.method4065(false, "<col=00ffff>" + local1541.aString55, local527, false, local171, -1, true, local1650, (long) local1534.hashCode(), local1638[local289], Static496.method7698(local1534, local527, local171), local311);
										}
									}
								}
								Static202.method4065(local497.aClass3_Sub1_15.aByte132 != Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, "<col=00ffff>" + local1541.aString55, local527, false, local171, -1, true, 1001, (long) local1534.hashCode(), Static588.aClass351_24.method8691(Static476.anInt8915), (long) local1541.anInt5398, Static585.anInt10366);
							}
						}
					}
				}
			}
			if (Static487.aBoolean676) {
				Static31.method767();
			}
		}
		Static514.method7843(false);
	}
}
