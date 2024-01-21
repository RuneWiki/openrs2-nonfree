import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 aClass3_Sub1_Sub4_Sub2_33;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!sa;")
	public static Class3_Sub1_Sub16 aClass3_Sub1_Sub16_1;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1121 = Static75.method1216("Cancel");

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!bb;")
	public static Class8 aClass8_25 = new Class8(50);

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1122 = aClass4_1121;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray24 = new int[4][13][13];

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1123 = Static75.method1216("To play on this world move to a free area first");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1124 = Static75.method1216("Off");

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1125 = Static75.method1216(" @whi@(X");

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1126 = aClass4_1123;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	public static int anInt2000 = 2;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1127 = aClass4_1124;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1128 = Static75.method1216("Loading interfaces )2 ");

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1129 = aClass4_1128;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1130 = Static75.method1216("titlebox");

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public static int anInt2001 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!ab;)V")
	public static void method1369(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt2337 = 0;
		if (arg0.anInt2316 == 0) {
			arg0.anInt2290 = 1024;
		}
		if (arg0.anInt2316 == 1) {
			arg0.anInt2290 = 1536;
		}
		if (arg0.anInt2316 == 2) {
			arg0.anInt2290 = 0;
		}
		@Pc(38) int local38 = arg0.anInt2304 * 128 + arg0.anInt2319 * 64;
		@Pc(43) int local43 = arg0.anInt2334 - Static60.anInt1489;
		@Pc(53) int local53 = arg0.anInt2319 * 64 + arg0.anInt2336 * 128;
		if (arg0.anInt2316 == 3) {
			arg0.anInt2290 = 512;
		}
		arg0.anInt2342 += (local38 - arg0.anInt2342) / local43;
		arg0.anInt2348 += (local53 - arg0.anInt2348) / local43;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method1370() {
		aClass4_1121 = null;
		aClass4_1125 = null;
		aClass4_1127 = null;
		aClass4_1130 = null;
		aClass4_1129 = null;
		aClass4_1122 = null;
		anIntArrayArrayArray24 = null;
		aClass4_1123 = null;
		aClass8_25 = null;
		aClass4_1124 = null;
		aClass3_Sub1_Sub4_Sub2_33 = null;
		aClass4_1128 = null;
		anIntArray262 = null;
		aClass3_Sub1_Sub16_1 = null;
		aClass4_1126 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII[Lclient!rc;II)V")
	public static void method1371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub1_Sub14[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < arg7.length; local3++) {
			@Pc(9) Class3_Sub1_Sub14 local9 = arg7[local3];
			if (local9 != null && (local9.anInt2128 == 0 || local9.aBoolean167) && local9 != null && local9.anInt2097 == arg2 && (!local9.aBoolean163 || Static13.aBoolean22)) {
				@Pc(42) int local42 = arg4 + local9.anInt2132;
				if (!local9.aBoolean174) {
					local42 -= arg5;
				}
				@Pc(54) int local54 = local9.anInt2077 + arg8;
				if (!local9.aBoolean174) {
					local54 -= arg3;
				}
				@Pc(66) int local66 = local9.anInt2130 + local42;
				@Pc(71) int local71 = local9.anInt2117 + local54;
				@Pc(82) int local82 = arg4 < local42 ? local42 : arg4;
				@Pc(89) int local89 = arg8 >= local54 ? arg8 : local54;
				@Pc(100) int local100 = local66 < arg0 ? local66 : arg0;
				@Pc(107) int local107 = arg6 > local71 ? local71 : arg6;
				if (local9.anInt2128 == 0) {
					method1371(local100, arg1, local3, local9.anInt2082, local82, local9.anInt2113, local107, arg7, local89);
					if (local9.aClass3_Sub1_Sub14Array1 != null) {
						method1371(local100, arg1, local9.anInt2092, local9.anInt2082, local82, local9.anInt2113, local107, local9.aClass3_Sub1_Sub14Array1, local89);
					}
				}
				if (local9.aBoolean167) {
					@Pc(149) boolean local149 = false;
					@Pc(171) boolean local171;
					if (Static22.anInt496 >= local82 && local89 <= Static78.anInt420 && local100 > Static22.anInt496 && local107 > Static78.anInt420) {
						local171 = true;
					} else {
						local171 = false;
					}
					if (Static49.anInt1204 == 1 && local171) {
						local149 = true;
					}
					@Pc(184) boolean local184 = false;
					if (Static77.anInt1842 == 1 && local82 <= Static4.anInt194 && Static91.anInt2055 >= local89 && Static4.anInt194 < local100 && local107 > Static91.anInt2055) {
						local184 = true;
					}
					if (local9.anInt2099 != -1 && local149 && Static77.aClass3_Sub1_Sub14_1 == null) {
						Static77.aClass3_Sub1_Sub14_1 = local9;
						Static23.anInt516 = Static78.anInt420;
						anInt2001 = Static22.anInt496;
					}
					if (Static77.aClass3_Sub1_Sub14_1 != null) {
						local149 = false;
						local171 = false;
						local184 = false;
					}
					if (!local9.aBoolean165 && local184 && (arg1 & 0x1) != 0) {
						local9.aBoolean165 = true;
						if (local9.anObjectArray11 != null) {
							Static46.method1874(Static91.anInt2055 - local54, Static4.anInt194 + -local42, local9, local9.anObjectArray11);
						}
					}
					if (local9.aBoolean165 && local149 && (arg1 & 0x4) != 0 && local9.anObjectArray9 != null) {
						Static46.method1874(Static78.anInt420 - local54, -local42 + Static22.anInt496, local9, local9.anObjectArray9);
					}
					if (local9.aBoolean165 && !local149 && (arg1 & 0x2) != 0) {
						local9.aBoolean165 = false;
						if (local9.anObjectArray7 != null) {
							Static46.method1874(Static78.anInt420 - local54, Static22.anInt496 - local42, local9, local9.anObjectArray7);
						}
					}
					if (local149 && (arg1 & 0x8) != 0 && local9.anObjectArray3 != null) {
						Static46.method1874(Static78.anInt420 - local54, -local42 + Static22.anInt496, local9, local9.anObjectArray3);
					}
					if (!local9.aBoolean164 && local171 && (arg1 & 0x10) != 0) {
						local9.aBoolean164 = true;
						if (local9.anObjectArray12 != null) {
							Static46.method1874(Static78.anInt420 - local54, Static22.anInt496 - local42, local9, local9.anObjectArray12);
						}
					}
					if (local9.aBoolean164 && local171 && (arg1 & 0x40) != 0 && local9.anObjectArray2 != null) {
						Static46.method1874(Static78.anInt420 - local54, Static22.anInt496 - local42, local9, local9.anObjectArray2);
					}
					if (local9.aBoolean164 && !local171 && (arg1 & 0x20) != 0) {
						local9.aBoolean164 = false;
						if (local9.anObjectArray10 != null) {
							Static46.method1874(Static78.anInt420 - local54, Static22.anInt496 - local42, local9, local9.anObjectArray10);
						}
					}
					if (local9.anObjectArray4 != null && (arg1 & 0x80) != 0) {
						Static46.method1874(0, 0, local9, local9.anObjectArray4);
					}
					if (Static13.anInt350 == Static60.anInt1489 && local9.anObjectArray8 != null && (arg1 & 0x100) != 0) {
						Static46.method1874(0, 0, local9, local9.anObjectArray8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!rd;III)Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 method1372(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static5.method161(arg1, arg0, arg2) ? Static54.method900() : null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1373() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (Static4.anInt201 == 114) {
			local14 = Static32.aClass3_Sub4_Sub1_2.method446();
			local22 = (local14 >> 4 & 0x7) + Static10.anInt334;
			local28 = (local14 & 0x7) + Static15.anInt355;
			local32 = Static32.aClass3_Sub4_Sub1_2.method459();
			local36 = Static32.aClass3_Sub4_Sub1_2.method446();
			local40 = Static32.aClass3_Sub4_Sub1_2.method459();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local22 = local22 * 128 + 64;
				local28 = local28 * 128 + 64;
				@Pc(85) Class3_Sub1_Sub1_Sub3 local85 = new Class3_Sub1_Sub1_Sub3(local32, Static49.anInt1203, local22, local28, Static82.method1293(local22, Static49.anInt1203, local28) - local36, local40, Static60.anInt1489);
				Static20.aClass20_2.method304(local85);
			}
			return;
		}
		@Pc(145) Class3_Sub1_Sub1_Sub2 local145;
		if (Static4.anInt201 == 66) {
			local14 = Static32.aClass3_Sub4_Sub1_2.method452();
			local22 = Static32.aClass3_Sub4_Sub1_2.method446();
			local28 = Static10.anInt334 + (local22 >> 4 & 0x7);
			local32 = (local22 & 0x7) + Static15.anInt355;
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
				@Pc(138) Class20 local138 = Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local28][local32];
				if (local138 != null) {
					for (local145 = (Class3_Sub1_Sub1_Sub2) local138.method308(); local145 != null; local145 = (Class3_Sub1_Sub1_Sub2) local138.method309()) {
						if ((local14 & 0x7FFF) == local145.anInt197) {
							local145.method1930();
							break;
						}
					}
					if (local138.method308() == null) {
						Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local28][local32] = null;
					}
					Static39.method728(local28, local32);
				}
			}
			return;
		}
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(253) int local253;
		@Pc(257) int local257;
		@Pc(229) int local229;
		@Pc(235) int local235;
		@Pc(249) int local249;
		if (Static4.anInt201 == 168) {
			local14 = Static32.aClass3_Sub4_Sub1_2.method446();
			local28 = (local14 & 0x7) + Static15.anInt355;
			local22 = Static10.anInt334 + (local14 >> 4 & 0x7);
			local32 = local22 + Static32.aClass3_Sub4_Sub1_2.method434();
			local36 = Static32.aClass3_Sub4_Sub1_2.method434() + local28;
			local40 = Static32.aClass3_Sub4_Sub1_2.method445();
			local229 = Static32.aClass3_Sub4_Sub1_2.method459();
			local235 = Static32.aClass3_Sub4_Sub1_2.method446() * 4;
			local241 = Static32.aClass3_Sub4_Sub1_2.method446() * 4;
			local245 = Static32.aClass3_Sub4_Sub1_2.method459();
			local249 = Static32.aClass3_Sub4_Sub1_2.method459();
			local253 = Static32.aClass3_Sub4_Sub1_2.method446();
			local257 = Static32.aClass3_Sub4_Sub1_2.method446();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local229 != 65535) {
				local36 = local36 * 128 + 64;
				local32 = local32 * 128 + 64;
				local28 = local28 * 128 + 64;
				local22 = local22 * 128 + 64;
				@Pc(344) Class3_Sub1_Sub1_Sub5 local344 = new Class3_Sub1_Sub1_Sub5(local229, Static49.anInt1203, local22, local28, Static82.method1293(local22, Static49.anInt1203, local28) - local235, local245 + Static60.anInt1489, local249 + Static60.anInt1489, local253, local257, local40, local241);
				local344.method1807(local32, Static60.anInt1489 + local245, -local241 + Static82.method1293(local32, Static49.anInt1203, local36), local36);
				Static35.aClass20_4.method304(local344);
			}
			return;
		}
		@Pc(431) int local431;
		if (Static4.anInt201 == 208) {
			local14 = Static32.aClass3_Sub4_Sub1_2.method439();
			local22 = Static32.aClass3_Sub4_Sub1_2.method459();
			local28 = Static32.aClass3_Sub4_Sub1_2.method451();
			local32 = local28 >> 2;
			local40 = Static65.anIntArray228[local32];
			@Pc(392) byte local392 = Static32.aClass3_Sub4_Sub1_2.method412();
			@Pc(396) byte local396 = Static32.aClass3_Sub4_Sub1_2.method412();
			local36 = local28 & 0x3;
			local241 = Static32.aClass3_Sub4_Sub1_2.method452();
			local245 = Static32.aClass3_Sub4_Sub1_2.method452();
			@Pc(412) byte local412 = Static32.aClass3_Sub4_Sub1_2.method412();
			local253 = Static32.aClass3_Sub4_Sub1_2.method446();
			local257 = (local253 >> 4 & 0x7) + Static10.anInt334;
			local431 = Static15.anInt355 + (local253 & 0x7);
			@Pc(435) byte local435 = Static32.aClass3_Sub4_Sub1_2.method434();
			@Pc(446) Class3_Sub1_Sub1_Sub1_Sub2 local446;
			if (local245 == Static110.anInt2775) {
				local446 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1;
			} else {
				local446 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local245];
			}
			if (local446 != null) {
				@Pc(456) Class3_Sub1_Sub5 local456 = Static38.method1911(local14);
				@Pc(464) int local464 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local257][local431];
				@Pc(474) int local474 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local257 + 1][local431];
				@Pc(486) int local486 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local257 + 1][local431 + 1];
				@Pc(496) int local496 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local257][local431 + 1];
				@Pc(506) Class3_Sub1_Sub1_Sub4 local506 = local456.method1028(local474, local464, local496, local32, local486, local36);
				if (local506 != null) {
					@Pc(513) byte local513;
					if (local435 > local392) {
						local513 = local435;
						local435 = local392;
						local392 = local513;
					}
					if (local396 > local412) {
						local513 = local396;
						local396 = local412;
						local412 = local513;
					}
					Static81.method1286(local431, local22 + 1, 0, -1, local241 + 1, Static49.anInt1203, 0, local40, local257);
					local446.anInt2363 = local22 + Static60.anInt1489;
					@Pc(553) int local553 = local456.anInt1543;
					@Pc(556) int local556 = local456.anInt1548;
					local446.aClass3_Sub1_Sub1_Sub4_3 = local506;
					local446.anInt2354 = local241 + Static60.anInt1489;
					if (local36 == 1 || local36 == 3) {
						local553 = local456.anInt1548;
						local556 = local456.anInt1543;
					}
					local446.anInt2352 = local556 * 64 + local257 * 128;
					local446.anInt2360 = local553 * 64 + local431 * 128;
					local446.anInt2370 = Static82.method1293(local446.anInt2352, Static49.anInt1203, local446.anInt2360);
					local446.anInt2349 = local257 + local435;
					local446.anInt2353 = local431 + local412;
					local446.anInt2357 = local396 + local431;
					local446.anInt2356 = local392 + local257;
				}
			}
		}
		if (Static4.anInt201 == 215) {
			local14 = Static32.aClass3_Sub4_Sub1_2.method452();
			local22 = Static32.aClass3_Sub4_Sub1_2.method439();
			local28 = Static32.aClass3_Sub4_Sub1_2.method446();
			local32 = Static10.anInt334 + (local28 >> 4 & 0x7);
			local36 = (local28 & 0x7) + Static15.anInt355;
			if (local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104) {
				local145 = new Class3_Sub1_Sub1_Sub2();
				local145.anInt199 = local14;
				local145.anInt197 = local22;
				if (Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local32][local36] == null) {
					Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local32][local36] = new Class20();
				}
				Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local32][local36].method304(local145);
				Static39.method728(local32, local36);
			}
		} else if (Static4.anInt201 == 56) {
			local14 = Static32.aClass3_Sub4_Sub1_2.method421();
			local22 = local14 >> 2;
			local32 = Static65.anIntArray228[local22];
			local36 = Static32.aClass3_Sub4_Sub1_2.method451();
			local28 = local14 & 0x3;
			local40 = (local36 >> 4 & 0x7) + Static10.anInt334;
			local229 = Static15.anInt355 + (local36 & 0x7);
			local235 = Static32.aClass3_Sub4_Sub1_2.method452();
			if (local40 >= 0 && local229 >= 0 && local40 < 103 && local229 < 103) {
				local241 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local40][local229];
				local245 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local40 + 1][local229];
				local249 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local40 + 1][local229 + 1];
				local253 = Static38.anIntArrayArrayArray36[Static49.anInt1203][local40][local229 + 1];
				if (local32 == 0) {
					@Pc(817) Class6 local817 = Static38.aClass61_30.method1309(Static49.anInt1203, local40, local229);
					if (local817 != null) {
						local431 = local817.anInt274 >> 14 & 0x7FFF;
						if (local22 == 2) {
							local817.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1_Sub6(local431, 2, local28 + 4, local241, local245, local249, local253, local235, false);
							local817.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1_Sub6(local431, 2, local28 + 1 & 0x3, local241, local245, local249, local253, local235, false);
						} else {
							local817.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1_Sub6(local431, local22, local28, local241, local245, local249, local253, local235, false);
						}
					}
				}
				if (local32 == 1) {
					@Pc(891) Class43 local891 = Static38.aClass61_30.method1345(Static49.anInt1203, local40, local229);
					if (local891 != null) {
						local891.aClass3_Sub1_Sub1_5 = new Class3_Sub1_Sub1_Sub6(local891.anInt1401 >> 14 & 0x7FFF, 4, 0, local241, local245, local249, local253, local235, false);
					}
				}
				if (local32 == 2) {
					@Pc(923) Class38 local923 = Static38.aClass61_30.method1341(Static49.anInt1203, local40, local229);
					if (local22 == 11) {
						local22 = 10;
					}
					if (local923 != null) {
						local923.aClass3_Sub1_Sub1_4 = new Class3_Sub1_Sub1_Sub6(local923.anInt1221 >> 14 & 0x7FFF, local22, local28, local241, local245, local249, local253, local235, false);
					}
				}
				if (local32 == 3) {
					@Pc(960) Class26 local960 = Static38.aClass61_30.method1336(Static49.anInt1203, local40, local229);
					if (local960 != null) {
						local960.aClass3_Sub1_Sub1_3 = new Class3_Sub1_Sub1_Sub6(local960.anInt870 >> 14 & 0x7FFF, 22, local28, local241, local245, local249, local253, local235, false);
					}
				}
			}
		} else if (Static4.anInt201 == 92) {
			local22 = Static32.aClass3_Sub4_Sub1_2.method439();
			local28 = Static32.aClass3_Sub4_Sub1_2.method451();
			local32 = local28 >> 2;
			local36 = local28 & 0x3;
			local40 = Static65.anIntArray228[local32];
			local229 = Static32.aClass3_Sub4_Sub1_2.method421();
			local235 = Static10.anInt334 + (local229 >> 4 & 0x7);
			local241 = (local229 & 0x7) + Static15.anInt355;
			if (local235 >= 0 && local241 >= 0 && local235 < 104 && local241 < 104) {
				Static81.method1286(local241, 0, local32, local22, -1, Static49.anInt1203, local36, local40, local235);
			}
		} else if (Static4.anInt201 == 169) {
			local22 = Static32.aClass3_Sub4_Sub1_2.method446();
			local32 = Static15.anInt355 + (local22 & 0x7);
			local28 = Static10.anInt334 + (local22 >> 4 & 0x7);
			local36 = Static32.aClass3_Sub4_Sub1_2.method446();
			local40 = local36 >> 2;
			local229 = local36 & 0x3;
			local235 = Static65.anIntArray228[local40];
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
				Static81.method1286(local32, 0, local40, -1, -1, Static49.anInt1203, local229, local235, local28);
			}
		} else if (Static4.anInt201 == 185) {
			local22 = Static32.aClass3_Sub4_Sub1_2.method446();
			local28 = Static10.anInt334 + (local22 >> 4 & 0x7);
			local32 = Static15.anInt355 + (local22 & 0x7);
			local36 = Static32.aClass3_Sub4_Sub1_2.method459();
			local40 = Static32.aClass3_Sub4_Sub1_2.method459();
			local229 = Static32.aClass3_Sub4_Sub1_2.method459();
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
				@Pc(1181) Class20 local1181 = Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local28][local32];
				if (local1181 != null) {
					for (@Pc(1188) Class3_Sub1_Sub1_Sub2 local1188 = (Class3_Sub1_Sub1_Sub2) local1181.method308(); local1188 != null; local1188 = (Class3_Sub1_Sub1_Sub2) local1181.method309()) {
						if ((local36 & 0x7FFF) == local1188.anInt197 && local40 == local1188.anInt199) {
							local1188.anInt199 = local229;
							break;
						}
					}
					Static39.method728(local28, local32);
				}
			}
		} else {
			if (Static4.anInt201 == 72) {
				local22 = Static32.aClass3_Sub4_Sub1_2.method446();
				local32 = (local22 & 0x7) + Static15.anInt355;
				local28 = Static10.anInt334 + (local22 >> 4 & 0x7);
				local36 = Static32.aClass3_Sub4_Sub1_2.method459();
				local40 = Static32.aClass3_Sub4_Sub1_2.method446();
				local229 = local40 >> 4 & 0xF;
				local235 = local40 & 0x7;
				local241 = Static32.aClass3_Sub4_Sub1_2.method446();
				if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
					local245 = local229 + 1;
					if (local28 - local245 <= Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0] && Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0] <= local245 + local28 && Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0] >= local32 - local245 && Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0] <= local245 + local32 && Static93.anInt2442 != 0 && local235 > 0 && Static28.anInt868 < 50) {
						Static17.anIntArray35[Static28.anInt868] = local36;
						Static5.anIntArray11[Static28.anInt868] = local235;
						Static12.anIntArray14[Static28.anInt868] = local241;
						Static101.aClass9Array1[Static28.anInt868] = null;
						Static94.anIntArray282[Static28.anInt868] = (local32 << 8) + (local28 << 16) + local229;
						Static28.anInt868++;
					}
				}
			}
			if (Static4.anInt201 == 142) {
				local22 = Static32.aClass3_Sub4_Sub1_2.method446();
				local28 = (local22 >> 4 & 0x7) + Static10.anInt334;
				local32 = (local22 & 0x7) + Static15.anInt355;
				local36 = Static32.aClass3_Sub4_Sub1_2.method452();
				local40 = Static32.aClass3_Sub4_Sub1_2.method414();
				local229 = Static32.aClass3_Sub4_Sub1_2.method452();
				if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104 && local229 != Static110.anInt2775) {
					@Pc(1433) Class3_Sub1_Sub1_Sub2 local1433 = new Class3_Sub1_Sub1_Sub2();
					local1433.anInt199 = local40;
					local1433.anInt197 = local36;
					if (Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local28][local32] == null) {
						Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local28][local32] = new Class20();
					}
					Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local28][local32].method304(local1433);
					Static39.method728(local28, local32);
				}
			}
		}
	}
}
