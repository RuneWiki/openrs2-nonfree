import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dea", name = "D", descriptor = "Lclient!vp;")
	public static Class302 aClass302_1;

	@OriginalMember(owner = "client!dea", name = "H", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_21 = new Class243(15, 3);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII)I")
	public static int method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 <= arg1) {
			return arg1 > arg2 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!fo;)V")
	public static void method1652(@OriginalArg(1) Class91 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(48) int local48;
		if (arg0 == Static394.aClass91_23) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static525.anIntArray700[local16];
			local28 = Static70.aClass2_Sub29_Sub2_1.method5183();
			local36 = (local28 >> 4 & 0x7) + Static353.anInt5257;
			local42 = (local28 & 0x7) + Static18.anInt429;
			local48 = Static70.aClass2_Sub29_Sub2_1.method5229();
			if (local48 == 65535) {
				local48 = -1;
			}
			Static288.method5995(local42, local48, local24, local36, local16, local20, Static170.anInt3119);
			return;
		}
		@Pc(123) int local123;
		@Pc(129) int local129;
		@Pc(135) int local135;
		@Pc(139) int local139;
		@Pc(143) int local143;
		@Pc(149) int local149;
		@Pc(246) Class1_Sub1_Sub4 local246;
		@Pc(97) boolean local97;
		if (Static288.aClass91_22 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local16 = Static353.anInt5257 * 2 + (local12 >> 4 & 0xF);
			local20 = (local12 & 0xF) + Static18.anInt429 * 2;
			local97 = Static70.aClass2_Sub29_Sub2_1.method5170() != 0;
			local28 = local16 + Static70.aClass2_Sub29_Sub2_1.method5179();
			local36 = Static70.aClass2_Sub29_Sub2_1.method5179() + local20;
			local42 = Static70.aClass2_Sub29_Sub2_1.method5231();
			local48 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local123 = Static70.aClass2_Sub29_Sub2_1.method5170() * 4;
			local129 = Static70.aClass2_Sub29_Sub2_1.method5170() * 4;
			local135 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local139 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local143 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local149 = Static70.aClass2_Sub29_Sub2_1.method5229();
			if (local143 == 255) {
				local143 = -1;
			}
			if (local16 >= 0 && local20 >= 0 && Static363.anInt1158 * 2 > local16 && Static363.anInt1158 * 2 > local20 && local28 >= 0 && local36 >= 0 && local28 < Static511.anInt8889 * 2 && local36 < Static511.anInt8889 * 2 && local48 != 65535) {
				local129 <<= 0x0;
				local123 <<= 0x0;
				local16 = local16 * 64;
				local149 <<= 0x0;
				local28 *= 64;
				local36 = local36 * 64;
				local20 = local20 * 64;
				local246 = new Class1_Sub1_Sub4(local48, Static170.anInt3119, local16, local20, local123, local135 + Static115.anInt2326, Static115.anInt2326 + local139, local143, local149, local42, local129, local97);
				local246.method3610(local28, local36, Static200.method3233(Static170.anInt3119, local28, local36) - local129, local135 + Static115.anInt2326);
				Static316.aClass249_33.method6523(new Class2_Sub13_Sub10(local246));
			}
		} else if (Static245.aClass91_12 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local16 = (local12 >> 4 & 0xF) + Static353.anInt5257 * 2;
			local20 = Static18.anInt429 * 2 + (local12 & 0xF);
			local97 = Static70.aClass2_Sub29_Sub2_1.method5170() != 0;
			local28 = local16 + Static70.aClass2_Sub29_Sub2_1.method5179();
			local36 = Static70.aClass2_Sub29_Sub2_1.method5179() + local20;
			local42 = Static70.aClass2_Sub29_Sub2_1.method5231();
			local48 = Static70.aClass2_Sub29_Sub2_1.method5231();
			local123 = Static70.aClass2_Sub29_Sub2_1.method5229();
			@Pc(332) byte local332 = Static70.aClass2_Sub29_Sub2_1.method5179();
			local135 = Static70.aClass2_Sub29_Sub2_1.method5170() * 4;
			local139 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local143 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local149 = Static70.aClass2_Sub29_Sub2_1.method5170();
			@Pc(354) int local354 = Static70.aClass2_Sub29_Sub2_1.method5229();
			if (local149 == 255) {
				local149 = -1;
			}
			if (local16 >= 0 && local20 >= 0 && local16 < Static363.anInt1158 * 2 && Static363.anInt1158 * 2 > local20 && local28 >= 0 && local36 >= 0 && Static511.anInt8889 * 2 > local28 && Static511.anInt8889 * 2 > local36 && local123 != 65535) {
				local129 = local332 << 0;
				local20 *= 64;
				local28 = local28 * 64;
				local36 *= 64;
				local354 <<= 0x0;
				local135 <<= 0x0;
				local16 *= 64;
				if (local42 != 0) {
					@Pc(436) Class1_Sub1_Sub2 local436 = null;
					@Pc(452) int local452;
					@Pc(446) int local446;
					@Pc(456) int local456;
					if (local42 < 0) {
						local446 = -local42 - 1;
						local452 = local446 >> 11 & 0xF;
						local456 = local446 & 0x7FF;
						if (local456 == Static174.anInt3154) {
							local436 = Static266.aClass1_Sub1_Sub2_Sub1_1;
						} else {
							local436 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local456];
						}
					} else {
						local446 = local42 - 1;
						local456 = local446 & 0x7FF;
						local452 = local446 >> 11 & 0xF;
						@Pc(488) Class2_Sub11 local488 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local456);
						if (local488 != null) {
							local436 = local488.aClass1_Sub1_Sub2_Sub2_1;
						}
					}
					if (local436 != null) {
						@Pc(499) Class24 local499 = local436.method4393();
						if (local499.anIntArrayArray4 != null && local499.anIntArrayArray4[local452] != null) {
							local456 = local499.anIntArrayArray4[local452][0];
							@Pc(521) int local521 = local499.anIntArrayArray4[local452][2];
							@Pc(526) int local526 = local436.aClass151_7.method3664();
							@Pc(530) int local530 = Class125.anIntArray381[local526];
							@Pc(534) int local534 = Class125.anIntArray382[local526];
							@Pc(544) int local544 = local530 * local521 + local456 * local534 >> 15;
							@Pc(555) int local555 = local534 * local521 - local456 * local530 >> 15;
							local16 += local544;
							local129 -= local499.anIntArrayArray4[local452][1];
							local20 += local555;
						}
					}
				}
				@Pc(594) Class1_Sub1_Sub4 local594 = new Class1_Sub1_Sub4(local123, Static170.anInt3119, local16, local20, local129, Static115.anInt2326 + local139, local143 + Static115.anInt2326, local149, local354, local48, local135, local97);
				local594.method3610(local28, local36, Static200.method3233(Static170.anInt3119, local28, local36) - local135, local139 + Static115.anInt2326);
				Static316.aClass249_33.method6523(new Class2_Sub13_Sub10(local594));
			}
		} else if (Static106.aClass91_7 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local16 = (local12 >> 4 & 0x7) + Static353.anInt5257;
			local20 = Static18.anInt429 + (local12 & 0x7);
			local24 = Static70.aClass2_Sub29_Sub2_1.method5229();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local36 = local28 >> 4 & 0xF;
			local42 = local28 & 0x7;
			local48 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local123 = Static70.aClass2_Sub29_Sub2_1.method5170();
			if (local16 >= 0 && local20 >= 0 && local16 < Static363.anInt1158 && Static511.anInt8889 > local20) {
				local129 = local36 + 1;
				if (Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0] >= local16 - local129 && local16 + local129 >= Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0] && local20 - local129 <= Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0] && local20 + local129 >= Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0]) {
					Static147.method2578(local48, local123, local42, local24, (local20 << 8) + ((Static170.anInt3119 << 24) + (local16 << 16)) + local36);
				}
			}
		} else if (Static427.aClass91_24 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5209();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static525.anIntArray700[local16];
			local28 = Static70.aClass2_Sub29_Sub2_1.method5183();
			local36 = (local28 >> 4 & 0x7) + Static353.anInt5257;
			local42 = Static18.anInt429 + (local28 & 0x7);
			if (Static168.method2836(Static425.anInt6885) || local36 >= 0 && local42 >= 0 && Static363.anInt1158 > local36 && Static511.anInt8889 > local42) {
				Static535.method6656(Static170.anInt3119, local24, -1, local16, local42, local36, local20);
			}
		} else if (arg0 == Static108.aClass91_8) {
			Static70.aClass2_Sub29_Sub2_1.method5170();
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local16 = (local12 >> 4 & 0x7) + Static353.anInt5257;
			local20 = Static18.anInt429 + (local12 & 0x7);
			local24 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local28 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local36 = Static70.aClass2_Sub29_Sub2_1.method5210();
			@Pc(866) String local866 = Static70.aClass2_Sub29_Sub2_1.method5194();
			Static178.method2968(local28, local24, Static170.anInt3119, local20, local36, local16, local866);
		} else if (Static159.aClass91_27 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5224();
			local16 = (local12 >> 4 & 0x7) + Static353.anInt5257;
			local20 = Static18.anInt429 + (local12 & 0x7);
			local24 = Static70.aClass2_Sub29_Sub2_1.method5224();
			local28 = local24 >> 2;
			local36 = local24 & 0x3;
			local42 = Static525.anIntArray700[local28];
			local48 = Static70.aClass2_Sub29_Sub2_1.method5196();
			if (Static168.method2836(Static425.anInt6885) || local16 >= 0 && local20 >= 0 && Static363.anInt1158 > local16 && Static511.anInt8889 > local20) {
				Static535.method6656(Static170.anInt3119, local42, local48, local28, local20, local16, local36);
			}
		} else if (Static261.aClass91_14 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5230();
			local16 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local20 = Static70.aClass2_Sub29_Sub2_1.method5224();
			local24 = (local20 & 0x7) + Static18.anInt429;
			local28 = local24 + Static371.anInt6936;
			local36 = Static353.anInt5257 + (local20 >> 4 & 0x7);
			local42 = Static238.anInt4280 + local36;
			local48 = Static70.aClass2_Sub29_Sub2_1.method5229();
			if (Static174.anInt3154 != local16) {
				@Pc(1023) boolean local1023 = local36 >= 0 && local24 >= 0 && local36 < Static363.anInt1158 && local24 < Static511.anInt8889;
				if (local1023 || Static168.method2836(Static425.anInt6885)) {
					Static152.method6814(new Class2_Sub27(local48, local12), local28, Static170.anInt3119, local42);
					if (local1023) {
						Static37.method712(local36, Static170.anInt3119, local24);
					}
				}
			}
		} else if (arg0 == Static8.aClass91_1) {
			@Pc(1060) byte local1060 = Static70.aClass2_Sub29_Sub2_1.method5213();
			local16 = Static70.aClass2_Sub29_Sub2_1.method5183();
			local20 = (local16 >> 4 & 0x7) + Static353.anInt5257;
			local24 = (local16 & 0x7) + Static18.anInt429;
			local28 = Static70.aClass2_Sub29_Sub2_1.method5231();
			local36 = Static70.aClass2_Sub29_Sub2_1.method5225();
			@Pc(1090) byte local1090 = Static70.aClass2_Sub29_Sub2_1.method5207();
			local48 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local123 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local129 = local123 >> 2;
			local135 = local123 & 0x3;
			local139 = Static70.aClass2_Sub29_Sub2_1.method5230();
			@Pc(1114) byte local1114 = Static70.aClass2_Sub29_Sub2_1.method5207();
			@Pc(1120) byte local1120 = Static70.aClass2_Sub29_Sub2_1.method5213();
			if (!Static103.aClass39_3.method6036()) {
				Static193.method3152(local20, local48, local1120, local135, local1060, local28, local129, Static170.anInt3119, local36, local1090, local139, local1114, local24);
			}
		} else if (arg0 == Static465.aClass91_26) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5183();
			local16 = (local12 & 0x7) + Static18.anInt429;
			local20 = local16 + Static371.anInt6936;
			local24 = Static353.anInt5257 + (local12 >> 4 & 0x7);
			local28 = Static238.anInt4280 + local24;
			local36 = Static70.aClass2_Sub29_Sub2_1.method5229();
			@Pc(1189) Class2_Sub40 local1189 = (Class2_Sub40) Static357.aClass127_36.method3205((long) (local20 << 14 | Static170.anInt3119 << 28 | local28));
			if (local1189 != null) {
				for (@Pc(1197) Class2_Sub27 local1197 = (Class2_Sub27) local1189.aClass249_57.method6527(); local1197 != null; local1197 = (Class2_Sub27) local1189.aClass249_57.method6525()) {
					if ((local36 & 0x7FFF) == local1197.anInt3463) {
						local1197.method7802();
						break;
					}
				}
				if (local1189.aClass249_57.method6519()) {
					local1189.method7802();
				}
				if (local24 >= 0 && local16 >= 0 && local24 < Static363.anInt1158 && Static511.anInt8889 > local16) {
					Static37.method712(local24, Static170.anInt3119, local16);
				}
			}
		} else if (arg0 == Static245.aClass91_13) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local16 = Static353.anInt5257 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static18.anInt429;
			local24 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local28 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local36 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local42 = Static70.aClass2_Sub29_Sub2_1.method5170();
			if (local16 >= 0 && local20 >= 0 && local16 < Static363.anInt1158 && local20 < Static511.anInt8889) {
				local48 = local16 * 128 + 64;
				local123 = local20 * 128 + 64;
				local129 = Static170.anInt3119;
				if (local129 < 3 && Static169.method2839(local16, local20)) {
					local129++;
				}
				@Pc(1349) Class1_Sub1_Sub3 local1349 = new Class1_Sub1_Sub3(local24, local36, Static115.anInt2326, Static170.anInt3119, local129, local48, Static200.method3233(Static170.anInt3119, local48, local123) - local28, local123, local16, local16, local20, local20, local42);
				Static354.aClass249_38.method6523(new Class2_Sub13_Sub4(local1349));
			}
		} else if (Static517.aClass91_28 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local16 = Static18.anInt429 + (local12 & 0x7);
			local20 = local16 + Static371.anInt6936;
			local24 = Static353.anInt5257 + (local12 >> 4 & 0x7);
			local28 = Static238.anInt4280 + local24;
			local36 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local42 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local48 = Static70.aClass2_Sub29_Sub2_1.method5229();
			if (Static357.aClass127_36 != null) {
				@Pc(1416) Class2_Sub40 local1416 = (Class2_Sub40) Static357.aClass127_36.method3205((long) (local20 << 14 | Static170.anInt3119 << 28 | local28));
				if (local1416 != null) {
					for (@Pc(1424) Class2_Sub27 local1424 = (Class2_Sub27) local1416.aClass249_57.method6527(); local1424 != null; local1424 = (Class2_Sub27) local1416.aClass249_57.method6525()) {
						if (local1424.anInt3463 == (local36 & 0x7FFF) && local42 == local1424.anInt3461) {
							local1424.method7802();
							local1424.anInt3461 = local48;
							Static152.method6814(local1424, local20, Static170.anInt3119, local28);
							break;
						}
					}
					if (local24 >= 0 && local16 >= 0 && Static363.anInt1158 > local24 && local16 < Static511.anInt8889) {
						Static37.method712(local24, Static170.anInt3119, local16);
					}
				}
			}
		} else if (arg0 == Static425.aClass91_21) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5170();
			@Pc(1494) boolean local1494 = (local12 & 0x80) != 0;
			local20 = (local12 >> 3 & 0x7) + Static353.anInt5257;
			local24 = Static18.anInt429 + (local12 & 0x7);
			local28 = local20 + Static70.aClass2_Sub29_Sub2_1.method5179();
			local36 = Static70.aClass2_Sub29_Sub2_1.method5179() + local24;
			local42 = Static70.aClass2_Sub29_Sub2_1.method5231();
			local48 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local123 = Static70.aClass2_Sub29_Sub2_1.method5170() * 4;
			local129 = Static70.aClass2_Sub29_Sub2_1.method5170() * 4;
			local135 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local139 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local143 = Static70.aClass2_Sub29_Sub2_1.method5170();
			local149 = Static70.aClass2_Sub29_Sub2_1.method5229();
			if (local143 == 255) {
				local143 = -1;
			}
			if (local20 >= 0 && local24 >= 0 && local20 < Static363.anInt1158 && Static511.anInt8889 > local24 && local28 >= 0 && local36 >= 0 && local28 < Static363.anInt1158 && Static511.anInt8889 > local36 && local48 != 65535) {
				local129 <<= 0x0;
				local149 <<= 0x0;
				local36 = local36 * 128 + 64;
				local123 <<= 0x0;
				local28 = local28 * 128 + 64;
				local24 = local24 * 128 + 64;
				local20 = local20 * 128 + 64;
				local246 = new Class1_Sub1_Sub4(local48, Static170.anInt3119, local20, local24, local123, local135 + Static115.anInt2326, local139 + Static115.anInt2326, local143, local149, local42, local129, local1494);
				local246.method3610(local28, local36, Static200.method3233(Static170.anInt3119, local28, local36) - local129, Static115.anInt2326 + local135);
				Static316.aClass249_33.method6523(new Class2_Sub13_Sub10(local246));
			}
		} else if (Static69.aClass91_5 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local16 = Static70.aClass2_Sub29_Sub2_1.method5224();
			local20 = Static18.anInt429 + (local16 & 0x7);
			local24 = local20 + Static371.anInt6936;
			local28 = Static353.anInt5257 + (local16 >> 4 & 0x7);
			local36 = local28 + Static238.anInt4280;
			local42 = Static70.aClass2_Sub29_Sub2_1.method5229();
			@Pc(1745) boolean local1745 = local28 >= 0 && local20 >= 0 && Static363.anInt1158 > local28 && local20 < Static511.anInt8889;
			if (local1745 || Static168.method2836(Static425.anInt6885)) {
				Static152.method6814(new Class2_Sub27(local12, local42), local24, Static170.anInt3119, local36);
				if (local1745) {
					Static37.method712(local28, Static170.anInt3119, local20);
				}
			}
		} else if (Static490.aClass91_25 == arg0) {
			local12 = Static70.aClass2_Sub29_Sub2_1.method5229();
			local16 = Static70.aClass2_Sub29_Sub2_1.method5170();
			Static505.aClass206_4.method5326(local12).method3274(local16);
		} else {
			Static459.method6984("T3 - " + arg0, null);
			Static346.method6463(false);
		}
	}
}
