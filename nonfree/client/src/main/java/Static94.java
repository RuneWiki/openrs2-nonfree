import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!go", name = "N", descriptor = "I")
	public static int anInt2161;

	@OriginalMember(owner = "client!go", name = "R", descriptor = "Lclient!vi;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!go", name = "S", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V")
	public static void method1602() {
		Static173.aClass89_25.method2266();
		Static271.aClass89_43.method2266();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method1603(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(3, arg1);
		local8.method4468();
		local8.aString417 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	public static void method1605() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(48) int local48;
		@Pc(28) int local28;
		if (Static281.anInt2783 == 244) {
			local12 = Static140.aClass1_Sub14_Sub1_2.method2229();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static66.anIntArray439[local16];
			local28 = Static140.aClass1_Sub14_Sub1_2.method2227();
			local36 = (local28 >> 4 & 0x7) + Static211.anInt4569;
			local42 = (local28 & 0x7) + Static13.anInt358;
			local48 = Static140.aClass1_Sub14_Sub1_2.method2243();
			if (local48 == 65535) {
				local48 = -1;
			}
			Static154.method2506(local36, local20, local24, Static185.anInt4085, local42, local16, local48);
		} else if (Static281.anInt2783 == 88) {
			local12 = Static140.aClass1_Sub14_Sub1_2.method2242();
			local16 = Static140.aClass1_Sub14_Sub1_2.method2243();
			local20 = Static140.aClass1_Sub14_Sub1_2.method2229();
			local28 = Static13.anInt358 + (local20 & 0x7);
			local24 = (local20 >> 4 & 0x7) + Static211.anInt4569;
			if (local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104) {
				@Pc(121) Class2_Sub7 local121 = new Class2_Sub7();
				local121.anInt5219 = local16;
				local121.anInt5216 = local12;
				if (Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local24][local28] == null) {
					Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local24][local28] = new Class26();
				}
				Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local24][local28].method668(new Class1_Sub3_Sub1(local121));
				Static129.method2068(local24, local28);
			}
		} else if (Static281.anInt2783 == 236) {
			local12 = Static140.aClass1_Sub14_Sub1_2.method2199();
			local20 = (local12 & 0x7) + Static13.anInt358;
			local16 = (local12 >> 4 & 0x7) + Static211.anInt4569;
			local24 = Static140.aClass1_Sub14_Sub1_2.method2244();
			local28 = Static140.aClass1_Sub14_Sub1_2.method2244();
			local36 = Static140.aClass1_Sub14_Sub1_2.method2244();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				@Pc(221) Class26 local221 = Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local16][local20];
				if (local221 != null) {
					for (@Pc(230) Class1_Sub3_Sub1 local230 = (Class1_Sub3_Sub1) local221.method666(); local230 != null; local230 = (Class1_Sub3_Sub1) local221.method672()) {
						@Pc(235) Class2_Sub7 local235 = local230.aClass2_Sub7_1;
						if (local235.anInt5219 == (local24 & 0x7FFF) && local28 == local235.anInt5216) {
							local235.anInt5216 = local36;
							break;
						}
					}
					Static129.method2068(local16, local20);
				}
			}
		} else {
			@Pc(317) int local317;
			@Pc(321) int local321;
			@Pc(325) int local325;
			if (Static281.anInt2783 == 168) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2243();
				local16 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local24 = Static13.anInt358 + (local16 & 0x7);
				local20 = Static211.anInt4569 + (local16 >> 4 & 0x7);
				@Pc(301) byte local301 = Static140.aClass1_Sub14_Sub1_2.method2239();
				local36 = Static140.aClass1_Sub14_Sub1_2.method2241();
				local42 = local36 >> 2;
				local48 = local36 & 0x3;
				local317 = Static140.aClass1_Sub14_Sub1_2.method2247();
				local321 = Static140.aClass1_Sub14_Sub1_2.method2242();
				local325 = Static140.aClass1_Sub14_Sub1_2.method2244();
				@Pc(329) byte local329 = Static140.aClass1_Sub14_Sub1_2.method2219();
				@Pc(335) byte local335 = Static140.aClass1_Sub14_Sub1_2.method2219();
				@Pc(339) byte local339 = Static140.aClass1_Sub14_Sub1_2.method2219();
				if (!Static294.aBoolean367) {
					Static189.method3054(local339, local325, local329, local20, local335, local12, local42, local301, local48, local24, local317, local321);
				}
			}
			@Pc(430) int local430;
			@Pc(434) int local434;
			@Pc(530) Class2_Sub2 local530;
			if (Static281.anInt2783 == 7) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local20 = Static13.anInt358 + (local12 & 0x7);
				local16 = Static211.anInt4569 + (local12 >> 4 & 0x7);
				local24 = Static140.aClass1_Sub14_Sub1_2.method2212() + local16;
				local28 = Static140.aClass1_Sub14_Sub1_2.method2212() + local20;
				local36 = Static140.aClass1_Sub14_Sub1_2.method2248();
				local42 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local48 = Static140.aClass1_Sub14_Sub1_2.method2199() * 4;
				local317 = Static140.aClass1_Sub14_Sub1_2.method2199() * 4;
				local321 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local325 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local430 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local434 = Static140.aClass1_Sub14_Sub1_2.method2199();
				if (local430 == 255) {
					local430 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104 && local42 != 65535) {
					local24 = local24 * 128 + 64;
					local16 = local16 * 128 + 64;
					local28 = local28 * 128 + 64;
					local20 = local20 * 128 + 64;
					local530 = new Class2_Sub2(local42, Static185.anInt4085, local16, local20, Static93.method1576(local20, local16, Static185.anInt4085) - local48, Static133.anInt3061 + local321, Static133.anInt3061 + local325, local430, local434, local36, local317);
					local530.method454(local24, Static133.anInt3061 + local321, -local317 + Static93.method1576(local28, local24, Static185.anInt4085), local28);
					Static315.aClass26_61.method668(new Class1_Sub3_Sub19(local530));
				}
			} else if (Static281.anInt2783 == 38) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local16 = (local12 >> 4 & 0x7) + Static211.anInt4569;
				local20 = Static13.anInt358 + (local12 & 0x7);
				local24 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local28 = Static140.aClass1_Sub14_Sub1_2.method2199();
				if (local24 == 65535) {
					local24 = -1;
				}
				local36 = local28 >> 4 & 0xF;
				local42 = local28 & 0x7;
				local48 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local317 = Static140.aClass1_Sub14_Sub1_2.method2199();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local321 = local36 + 1;
					if (Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] >= local16 - local321 && Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] <= local321 + local16 && local20 - local321 <= Static56.aClass2_Sub4_Sub2_1.anIntArray286[0] && Static56.aClass2_Sub4_Sub2_1.anIntArray286[0] <= local20 + local321 && Static286.anInt5742 != 0 && local42 > 0 && Static168.anInt3772 < 50 && local24 != -1) {
						Static270.anIntArray486[Static168.anInt3772] = local24;
						Static277.anIntArray502[Static168.anInt3772] = local42;
						Static23.anIntArray55[Static168.anInt3772] = local48;
						Static150.aClass172Array1[Static168.anInt3772] = null;
						Static39.anIntArray122[Static168.anInt3772] = local36 + (local16 << 16) + (local20 << 8);
						Static256.anIntArray476[Static168.anInt3772] = local317;
						Static168.anInt3772++;
					}
				}
			} else if (Static281.anInt2783 == 208) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local16 = local12 >> 2;
				local20 = local12 & 0x3;
				local24 = Static66.anIntArray439[local16];
				local28 = Static140.aClass1_Sub14_Sub1_2.method2241();
				local36 = (local28 >> 4 & 0x7) + Static211.anInt4569;
				local42 = Static13.anInt358 + (local28 & 0x7);
				if (local36 >= 0 && local42 >= 0 && local36 < 104 && local42 < 104) {
					Static185.method3005(local16, 0, local42, local24, -1, Static185.anInt4085, -1, local36, local20);
				}
			} else if (Static281.anInt2783 == 54) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local16 = Static211.anInt4569 * 2 + (local12 >> 4 & 0xF);
				local20 = (local12 & 0xF) + Static13.anInt358 * 2;
				local24 = local16 + Static140.aClass1_Sub14_Sub1_2.method2212();
				local28 = Static140.aClass1_Sub14_Sub1_2.method2212() + local20;
				local36 = Static140.aClass1_Sub14_Sub1_2.method2248();
				local42 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local48 = Static140.aClass1_Sub14_Sub1_2.method2199() * 4;
				local317 = Static140.aClass1_Sub14_Sub1_2.method2199() * 4;
				local321 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local325 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local430 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local434 = Static140.aClass1_Sub14_Sub1_2.method2199();
				if (local430 == 255) {
					local430 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && local16 < 208 && local20 < 208 && local24 >= 0 && local28 >= 0 && local24 < 208 && local28 < 208 && local42 != 65535) {
					local24 = local24 * 64;
					local16 *= 64;
					local28 = local28 * 64;
					local20 *= 64;
					local530 = new Class2_Sub2(local42, Static185.anInt4085, local16, local20, Static93.method1576(local20, local16, Static185.anInt4085) - local48, Static133.anInt3061 + local321, local325 + Static133.anInt3061, local430, local434, local36, local317);
					local530.method454(local24, Static133.anInt3061 + local321, -local317 + Static93.method1576(local28, local24, Static185.anInt4085), local28);
					Static315.aClass26_61.method668(new Class1_Sub3_Sub19(local530));
				}
			} else if (Static281.anInt2783 == 36) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2243();
				local16 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local20 = (local16 >> 4 & 0x7) + Static211.anInt4569;
				local24 = Static13.anInt358 + (local16 & 0x7);
				local28 = Static140.aClass1_Sub14_Sub1_2.method2242();
				local36 = Static140.aClass1_Sub14_Sub1_2.method2238();
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104 && Static62.anInt1348 != local12) {
					@Pc(1029) Class2_Sub7 local1029 = new Class2_Sub7();
					local1029.anInt5216 = local28;
					local1029.anInt5219 = local36;
					if (Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local20][local24] == null) {
						Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local20][local24] = new Class26();
					}
					Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local20][local24].method668(new Class1_Sub3_Sub1(local1029));
					Static129.method2068(local20, local24);
				}
			} else if (Static281.anInt2783 == 173) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local16 = Static211.anInt4569 * 2 + (local12 >> 4 & 0xF);
				local20 = (local12 & 0xF) + Static13.anInt358 * 2;
				local24 = local16 + Static140.aClass1_Sub14_Sub1_2.method2212();
				local28 = Static140.aClass1_Sub14_Sub1_2.method2212() + local20;
				local36 = Static140.aClass1_Sub14_Sub1_2.method2248();
				local42 = Static140.aClass1_Sub14_Sub1_2.method2248();
				local48 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local317 = Static140.aClass1_Sub14_Sub1_2.method2212();
				local321 = Static140.aClass1_Sub14_Sub1_2.method2199() * 4;
				local325 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local430 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local434 = Static140.aClass1_Sub14_Sub1_2.method2199();
				@Pc(1150) int local1150 = Static140.aClass1_Sub14_Sub1_2.method2199();
				if (local434 == 255) {
					local434 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && local16 < 208 && local20 < 208 && local24 >= 0 && local28 >= 0 && local24 < 208 && local28 < 208 && local48 != 65535) {
					local24 *= 64;
					local20 = local20 * 64;
					local16 = local16 * 64;
					local28 *= 64;
					if (local36 != 0) {
						@Pc(1246) int local1246;
						@Pc(1236) Class2_Sub4 local1236;
						@Pc(1225) int local1225;
						@Pc(1229) int local1229;
						if (local36 < 0) {
							local1225 = -local36 - 1;
							local1229 = local1225 & 0x7FF;
							if (local1229 == Static62.anInt1348) {
								local1236 = Static56.aClass2_Sub4_Sub2_1;
							} else {
								local1236 = Static155.aClass2_Sub4_Sub2Array1[local1229];
							}
							local1246 = local1225 >> 11 & 0xF;
						} else {
							local1225 = local36 - 1;
							local1246 = local1225 >> 11 & 0xF;
							local1229 = local1225 & 0x7FF;
							local1236 = Static105.aClass2_Sub4_Sub1Array1[local1229];
						}
						if (local1236 != null) {
							@Pc(1274) Class91 local1274 = local1236.method2095();
							if (local1274.anIntArrayArray38 != null && local1274.anIntArrayArray38[local1246] != null) {
								local1229 = local1274.anIntArrayArray38[local1246][0];
								local317 -= local1274.anIntArrayArray38[local1246][1];
								@Pc(1304) int local1304 = Class146.anIntArray463[local1236.anInt2766];
								@Pc(1309) int local1309 = Class146.anIntArray461[local1236.anInt2766];
								@Pc(1316) int local1316 = local1274.anIntArrayArray38[local1246][2];
								@Pc(1326) int local1326 = local1309 * local1316 + local1304 * local1229 >> 16;
								@Pc(1337) int local1337 = local1304 * local1316 - local1309 * local1229 >> 16;
								local20 += local1337;
								local16 += local1326;
							}
						}
					}
					@Pc(1375) Class2_Sub2 local1375 = new Class2_Sub2(local48, Static185.anInt4085, local16, local20, Static93.method1576(local20, local16, Static185.anInt4085) - local317, local325 + Static133.anInt3061, Static133.anInt3061 + local430, local434, local1150, local42, local321);
					local1375.method454(local24, Static133.anInt3061 + local325, -local321 + Static93.method1576(local28, local24, Static185.anInt4085), local28);
					Static315.aClass26_61.method668(new Class1_Sub3_Sub19(local1375));
				}
			} else if (Static281.anInt2783 == 81) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2243();
				local16 = Static140.aClass1_Sub14_Sub1_2.method2229();
				local20 = Static211.anInt4569 + (local16 >> 4 & 0x7);
				local24 = (local16 & 0x7) + Static13.anInt358;
				local28 = Static140.aClass1_Sub14_Sub1_2.method2241();
				local42 = local28 & 0x3;
				local36 = local28 >> 2;
				local48 = Static66.anIntArray439[local36];
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
					Static185.method3005(local36, 0, local24, local48, -1, Static185.anInt4085, local12, local20, local42);
				}
			} else if (Static281.anInt2783 == 237) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local16 = Static140.aClass1_Sub14_Sub1_2.method2199();
				Static166.method2725(local12).method2337(local16);
			} else if (Static281.anInt2783 == 209) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local16 = Static211.anInt4569 + (local12 >> 4 & 0x7);
				local20 = Static13.anInt358 + (local12 & 0x7);
				local24 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local28 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local36 = Static140.aClass1_Sub14_Sub1_2.method2244();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local16 = local16 * 128 + 64;
					local20 = local20 * 128 + 64;
					@Pc(1582) Class2_Sub6 local1582 = new Class2_Sub6(local24, Static185.anInt4085, local16, local20, Static93.method1576(local20, local16, Static185.anInt4085) - local28, local36, Static133.anInt3061);
					Static250.aClass26_48.method668(new Class1_Sub3_Sub12(local1582));
				}
			} else if (Static281.anInt2783 == 97) {
				local12 = Static140.aClass1_Sub14_Sub1_2.method2238();
				local16 = Static140.aClass1_Sub14_Sub1_2.method2229();
				local24 = (local16 & 0x7) + Static13.anInt358;
				local20 = Static211.anInt4569 + (local16 >> 4 & 0x7);
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
					@Pc(1641) Class26 local1641 = Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local20][local24];
					if (local1641 != null) {
						for (@Pc(1649) Class1_Sub3_Sub1 local1649 = (Class1_Sub3_Sub1) local1641.method666(); local1649 != null; local1649 = (Class1_Sub3_Sub1) local1641.method672()) {
							if ((local12 & 0x7FFF) == local1649.aClass2_Sub7_1.anInt5219) {
								local1649.method4767();
								break;
							}
						}
						if (local1641.method666() == null) {
							Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local20][local24] = null;
						}
						Static129.method2068(local20, local24);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLjava/lang/String;ZI)Z")
	public static boolean method1606(@OriginalArg(1) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = false;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(49) char local49 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local49 == '-') {
					local28 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(81) int local81;
			if (local49 >= '0' && local49 <= '9') {
				local81 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local81 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local81 = local49 - 'W';
			} else {
				return false;
			}
			if (local81 >= 10) {
				return false;
			}
			if (local28) {
				local81 = -local81;
			}
			@Pc(127) int local127 = local35 * 10 + local81;
			if (local127 / 10 != local35) {
				return false;
			}
			local37 = true;
			local35 = local127;
		}
		return local37;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V")
	public static void method1607() {
		Static293.aClass89_51.method2265();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lclient!mj;")
	public static Class1_Sub3_Sub14 method1608(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub3_Sub14 local6 = (Class1_Sub3_Sub14) Static246.aClass162_8.method4003((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(31) byte[] local31 = Static124.aClass168_94.method4058(Static262.method4001(arg0), Static305.method4636(arg0));
		local6 = new Class1_Sub3_Sub14();
		if (local31 != null) {
			local6.method2809(new Class1_Sub14(local31));
		}
		Static246.aClass162_8.method4005(local6, (long) arg0);
		return local6;
	}
}
