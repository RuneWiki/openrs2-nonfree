import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!ml;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_75 = new Class103(79, -1);

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public static int anInt1631 = -1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!wq;I)V")
	public static void method1424(@OriginalArg(0) Class269 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		if (arg0 == Static305.aClass269_38) {
			local12 = Static336.aClass1_Sub28_Sub1_2.method5390();
			local20 = (local12 >> 4 & 0x7) + Static158.anInt2209;
			local26 = (local12 & 0x7) + Static295.anInt5146;
			local30 = Static336.aClass1_Sub28_Sub1_2.method5335();
			if (local20 >= 0 && local26 >= 0 && local20 < Static296.anInt5187 && local26 < Static206.anInt3607) {
				@Pc(66) Class1_Sub2 local66 = (Class1_Sub2) Static425.aClass199_179.method4387((long) (local26 << 14 | Static79.anInt1472 << 28 | local20));
				if (local66 != null) {
					for (@Pc(74) Class1_Sub32 local74 = (Class1_Sub32) local66.aClass227_3.method4967(); local74 != null; local74 = (Class1_Sub32) local66.aClass227_3.method4973()) {
						if ((local30 & 0x7FFF) == local74.anInt4852) {
							local74.method5915();
							break;
						}
					}
					if (local66.aClass227_3.method4976()) {
						local66.method5915();
					}
					Static133.method2055(Static79.anInt1472, local26, local20);
				}
			}
			return;
		}
		@Pc(150) int local150;
		@Pc(156) int local156;
		@Pc(160) int local160;
		@Pc(168) int local168;
		@Pc(189) int local189;
		@Pc(164) int local164;
		if (Static396.aClass269_46 == arg0) {
			local12 = Static336.aClass1_Sub28_Sub1_2.method5337();
			local20 = Static158.anInt2209 + (local12 >> 4 & 0x7);
			local26 = Static295.anInt5146 + (local12 & 0x7);
			local30 = Static336.aClass1_Sub28_Sub1_2.method5335();
			if (local30 == 65535) {
				local30 = -1;
			}
			local150 = Static336.aClass1_Sub28_Sub1_2.method5337();
			local156 = local150 >> 4 & 0xF;
			local160 = local150 & 0x7;
			local164 = Static336.aClass1_Sub28_Sub1_2.method5337();
			local168 = Static336.aClass1_Sub28_Sub1_2.method5337();
			if (local20 >= 0 && local26 >= 0 && local20 < Static296.anInt5187 && Static206.anInt3607 > local26) {
				local189 = local156 + 1;
				if (Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0] >= local20 - local189 && local189 + local20 >= Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0] && local26 - local189 <= Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0] && Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0] <= local189 + local26) {
					Static365.method4857(local160, local164, local156 + (Static79.anInt1472 << 24) + (local20 << 16) + (local26 << 8), local168, local30);
				}
			}
		} else if (arg0 == Static166.aClass269_18) {
			local12 = Static336.aClass1_Sub28_Sub1_2.method5337();
			local20 = (local12 >> 4 & 0x7) + Static158.anInt2209;
			local26 = Static295.anInt5146 + (local12 & 0x7);
			local30 = Static336.aClass1_Sub28_Sub1_2.method5335();
			local150 = Static336.aClass1_Sub28_Sub1_2.method5335();
			local156 = Static336.aClass1_Sub28_Sub1_2.method5335();
			if (Static425.aClass199_179 != null && local20 >= 0 && local26 >= 0 && local20 < Static296.anInt5187 && Static206.anInt3607 > local26) {
				@Pc(320) Class1_Sub2 local320 = (Class1_Sub2) Static425.aClass199_179.method4387((long) (local20 | Static79.anInt1472 << 28 | local26 << 14));
				if (local320 != null) {
					for (@Pc(328) Class1_Sub32 local328 = (Class1_Sub32) local320.aClass227_3.method4967(); local328 != null; local328 = (Class1_Sub32) local320.aClass227_3.method4973()) {
						if (local328.anInt4852 == (local30 & 0x7FFF) && local150 == local328.anInt4854) {
							local328.method5915();
							local328.anInt4854 = local156;
							Static410.method4613(Static79.anInt1472, local26, local20, local328);
							break;
						}
					}
					Static133.method2055(Static79.anInt1472, local26, local20);
				}
			}
		} else {
			@Pc(444) int local444;
			@Pc(448) int local448;
			@Pc(452) int local452;
			@Pc(456) int local456;
			@Pc(408) boolean local408;
			if (arg0 == Static251.aClass269_31) {
				local12 = Static336.aClass1_Sub28_Sub1_2.method5337();
				local20 = (local12 >> 4 & 0xF) + Static158.anInt2209 * 2;
				local26 = Static295.anInt5146 * 2 + (local12 & 0xF);
				local408 = Static336.aClass1_Sub28_Sub1_2.method5337() != 0;
				local150 = local20 + Static336.aClass1_Sub28_Sub1_2.method5367();
				local156 = local26 + Static336.aClass1_Sub28_Sub1_2.method5367();
				local160 = Static336.aClass1_Sub28_Sub1_2.method5382();
				local164 = Static336.aClass1_Sub28_Sub1_2.method5382();
				local168 = Static336.aClass1_Sub28_Sub1_2.method5335();
				@Pc(438) byte local438 = Static336.aClass1_Sub28_Sub1_2.method5367();
				local444 = Static336.aClass1_Sub28_Sub1_2.method5337() * 4;
				local448 = Static336.aClass1_Sub28_Sub1_2.method5335();
				local452 = Static336.aClass1_Sub28_Sub1_2.method5335();
				local456 = Static336.aClass1_Sub28_Sub1_2.method5337();
				if (local456 == 255) {
					local456 = -1;
				}
				@Pc(467) int local467 = Static336.aClass1_Sub28_Sub1_2.method5337();
				if (local20 >= 0 && local26 >= 0 && local20 < Static296.anInt5187 * 2 && Static296.anInt5187 * 2 > local26 && local150 >= 0 && local156 >= 0 && Static206.anInt3607 * 2 > local150 && Static206.anInt3607 * 2 > local156 && local168 != 65535) {
					local156 = local156 * 64;
					local20 *= 64;
					local189 = local438 << 0;
					local150 = local150 * 64;
					local444 <<= 0x0;
					local26 *= 64;
					if (local160 != 0) {
						@Pc(569) int local569;
						@Pc(580) Class25_Sub5_Sub1 local580;
						@Pc(563) int local563;
						@Pc(573) int local573;
						if (local160 < 0) {
							local563 = -local160 - 1;
							local569 = local563 >> 11 & 0xF;
							local573 = local563 & 0x7FF;
							if (local573 == Static296.anInt5181) {
								local580 = Static447.aClass25_Sub5_Sub1_Sub2_4;
							} else {
								local580 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local573];
							}
						} else {
							local563 = local160 - 1;
							local569 = local563 >> 11 & 0xF;
							local573 = local563 & 0x7FF;
							local580 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local573];
						}
						if (local580 != null) {
							@Pc(610) Class236 local610 = local580.method3428();
							if (local610.anIntArrayArray60 != null && local610.anIntArrayArray60[local569] != null) {
								local573 = local610.anIntArrayArray60[local569][0];
								@Pc(632) int local632 = local610.anIntArrayArray60[local569][2];
								@Pc(637) int local637 = local580.aClass265_7.method5841();
								@Pc(641) int local641 = Class1_Sub4_Sub8_Sub1.anIntArray50[local637];
								@Pc(645) int local645 = Class1_Sub4_Sub8_Sub1.anIntArray49[local637];
								@Pc(655) int local655 = local632 * local641 + local573 * local645 >> 15;
								@Pc(666) int local666 = local645 * local632 - local573 * local641 >> 15;
								local189 -= local610.anIntArrayArray60[local569][1];
								local26 += local666;
								local20 += local655;
							}
						}
					}
					@Pc(705) Class25_Sub5_Sub3 local705 = new Class25_Sub5_Sub3(local168, Static79.anInt1472, local20, local26, local189, Static236.anInt4213 + local448, local452 + Static236.anInt4213, local456, local467, local164, local444, local408);
					local705.method3335(Static236.anInt4213 + local448, local150, Static335.method4499(Static79.anInt1472, local150, local156) - local444, local156);
					Static226.aClass227_24.method4972(new Class1_Sub5_Sub15(local705));
				}
			} else if (Static328.aClass269_43 == arg0) {
				local12 = Static336.aClass1_Sub28_Sub1_2.method5341();
				local20 = Static336.aClass1_Sub28_Sub1_2.method5390();
				local26 = (local20 >> 4 & 0x7) + Static158.anInt2209;
				local30 = Static295.anInt5146 + (local20 & 0x7);
				local150 = Static336.aClass1_Sub28_Sub1_2.method5335();
				local156 = Static336.aClass1_Sub28_Sub1_2.method5341();
				if (local26 >= 0 && local30 >= 0 && Static296.anInt5187 > local26 && local30 < Static206.anInt3607 && Static296.anInt5181 != local156) {
					Static410.method4613(Static79.anInt1472, local30, local26, new Class1_Sub32(local12, local150));
					Static133.method2055(Static79.anInt1472, local30, local26);
				}
			} else if (Static223.aClass269_44 == arg0) {
				local12 = Static336.aClass1_Sub28_Sub1_2.method5390();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static258.anIntArray470[local20];
				local150 = Static336.aClass1_Sub28_Sub1_2.method5337();
				local156 = (local150 >> 4 & 0x7) + Static158.anInt2209;
				local160 = Static295.anInt5146 + (local150 & 0x7);
				local164 = Static336.aClass1_Sub28_Sub1_2.method5335();
				if (Static13.method204(Static226.anInt4010) || local156 >= 0 && local160 >= 0 && local156 < Static296.anInt5187 && local160 < Static206.anInt3607) {
					Static430.method5679(local156, local164, local160, local30, Static79.anInt1472, local26, local20);
				}
			} else if (Static325.aClass269_42 == arg0) {
				Static336.aClass1_Sub28_Sub1_2.method5337();
				local12 = Static336.aClass1_Sub28_Sub1_2.method5337();
				local20 = (local12 >> 4 & 0x7) + Static158.anInt2209;
				local26 = (local12 & 0x7) + Static295.anInt5146;
				local30 = Static336.aClass1_Sub28_Sub1_2.method5335();
				local150 = Static336.aClass1_Sub28_Sub1_2.method5337();
				local156 = Static336.aClass1_Sub28_Sub1_2.method5345();
				@Pc(913) String local913 = Static336.aClass1_Sub28_Sub1_2.method5381();
				Static433.method5710(local26, Static79.anInt1472, local913, local156, local20, local150, local30);
			} else {
				@Pc(1093) Class25_Sub5_Sub3 local1093;
				if (arg0 == Static415.aClass269_47) {
					local12 = Static336.aClass1_Sub28_Sub1_2.method5337();
					@Pc(938) boolean local938 = (local12 & 0x80) != 0;
					local26 = Static158.anInt2209 + (local12 >> 3 & 0x7);
					local30 = (local12 & 0x7) + Static295.anInt5146;
					local150 = Static336.aClass1_Sub28_Sub1_2.method5367() + local26;
					local156 = Static336.aClass1_Sub28_Sub1_2.method5367() + local30;
					local160 = Static336.aClass1_Sub28_Sub1_2.method5382();
					local164 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local168 = Static336.aClass1_Sub28_Sub1_2.method5337() * 4;
					local189 = Static336.aClass1_Sub28_Sub1_2.method5337() * 4;
					local444 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local448 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local452 = Static336.aClass1_Sub28_Sub1_2.method5337();
					if (local452 == 255) {
						local452 = -1;
					}
					local456 = Static336.aClass1_Sub28_Sub1_2.method5337();
					if (local26 >= 0 && local30 >= 0 && Static296.anInt5187 > local26 && local30 < Static206.anInt3607 && local150 >= 0 && local156 >= 0 && Static296.anInt5187 > local150 && local156 < Static206.anInt3607 && local164 != 65535) {
						local26 = local26 * 128 + 64;
						local168 <<= 0x0;
						local150 = local150 * 128 + 64;
						local30 = local30 * 128 + 64;
						local156 = local156 * 128 + 64;
						local189 <<= 0x0;
						local1093 = new Class25_Sub5_Sub3(local164, Static79.anInt1472, local26, local30, local168, local444 + Static236.anInt4213, Static236.anInt4213 + local448, local452, local456, local160, local189, local938);
						local1093.method3335(Static236.anInt4213 + local444, local150, Static335.method4499(Static79.anInt1472, local150, local156) - local189, local156);
						Static226.aClass227_24.method4972(new Class1_Sub5_Sub15(local1093));
					}
				} else if (Static305.aClass269_39 == arg0) {
					local12 = Static336.aClass1_Sub28_Sub1_2.method5336();
					local20 = Static336.aClass1_Sub28_Sub1_2.method5396();
					local26 = Static158.anInt2209 + (local20 >> 4 & 0x7);
					local30 = (local20 & 0x7) + Static295.anInt5146;
					local150 = Static336.aClass1_Sub28_Sub1_2.method5335();
					if (local26 >= 0 && local30 >= 0 && Static296.anInt5187 > local26 && local30 < Static206.anInt3607) {
						Static410.method4613(Static79.anInt1472, local30, local26, new Class1_Sub32(local12, local150));
						Static133.method2055(Static79.anInt1472, local30, local26);
					}
				} else if (arg0 == Static1.aClass269_1) {
					local12 = Static336.aClass1_Sub28_Sub1_2.method5396();
					local20 = local12 >> 2;
					local26 = local12 & 0x3;
					local30 = Static258.anIntArray470[local20];
					local150 = Static336.aClass1_Sub28_Sub1_2.method5396();
					local156 = (local150 >> 4 & 0x7) + Static158.anInt2209;
					local160 = (local150 & 0x7) + Static295.anInt5146;
					local164 = Static336.aClass1_Sub28_Sub1_2.method5341();
					if (local164 == 65535) {
						local164 = -1;
					}
					Static297.method4608(Static79.anInt1472, local30, local26, local20, local160, local164, local156);
				} else if (Static293.aClass269_37 == arg0) {
					local12 = Static336.aClass1_Sub28_Sub1_2.method5337();
					local20 = (local12 >> 4 & 0xF) + Static158.anInt2209 * 2;
					local26 = Static295.anInt5146 * 2 + (local12 & 0xF);
					local408 = Static336.aClass1_Sub28_Sub1_2.method5337() != 0;
					local150 = Static336.aClass1_Sub28_Sub1_2.method5367() + local20;
					local156 = local26 + Static336.aClass1_Sub28_Sub1_2.method5367();
					local160 = Static336.aClass1_Sub28_Sub1_2.method5382();
					local164 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local168 = Static336.aClass1_Sub28_Sub1_2.method5337() * 4;
					local189 = Static336.aClass1_Sub28_Sub1_2.method5337() * 4;
					local444 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local448 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local452 = Static336.aClass1_Sub28_Sub1_2.method5337();
					local456 = Static336.aClass1_Sub28_Sub1_2.method5337();
					if (local452 == 255) {
						local452 = -1;
					}
					if (local20 >= 0 && local26 >= 0 && Static296.anInt5187 * 2 > local20 && Static296.anInt5187 * 2 > local26 && local150 >= 0 && local156 >= 0 && Static206.anInt3607 * 2 > local150 && local156 < Static206.anInt3607 * 2 && local164 != 65535) {
						local189 <<= 0x0;
						local168 <<= 0x0;
						local150 = local150 * 64;
						local20 *= 64;
						local156 *= 64;
						local26 *= 64;
						local1093 = new Class25_Sub5_Sub3(local164, Static79.anInt1472, local20, local26, local168, Static236.anInt4213 + local444, Static236.anInt4213 + local448, local452, local456, local160, local189, local408);
						local1093.method3335(local444 + Static236.anInt4213, local150, Static335.method4499(Static79.anInt1472, local150, local156) - local189, local156);
						Static226.aClass227_24.method4972(new Class1_Sub5_Sub15(local1093));
					}
				} else if (arg0 == Static56.aClass269_9) {
					local12 = Static336.aClass1_Sub28_Sub1_2.method5396();
					local20 = Static158.anInt2209 + (local12 >> 4 & 0x7);
					local26 = Static295.anInt5146 + (local12 & 0x7);
					local30 = Static336.aClass1_Sub28_Sub1_2.method5396();
					local150 = local30 >> 2;
					local156 = local30 & 0x3;
					local160 = Static258.anIntArray470[local150];
					if (Static13.method204(Static226.anInt4010) || local20 >= 0 && local26 >= 0 && local20 < Static296.anInt5187 && local26 < Static206.anInt3607) {
						Static430.method5679(local20, -1, local26, local160, Static79.anInt1472, local156, local150);
					}
				} else if (Static297.aClass269_45 == arg0) {
					local12 = Static336.aClass1_Sub28_Sub1_2.method5337();
					local20 = (local12 >> 4 & 0x7) + Static158.anInt2209;
					local26 = (local12 & 0x7) + Static295.anInt5146;
					local30 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local150 = Static336.aClass1_Sub28_Sub1_2.method5337();
					local156 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local160 = Static336.aClass1_Sub28_Sub1_2.method5337();
					if (local20 >= 0 && local26 >= 0 && Static296.anInt5187 > local20 && Static206.anInt3607 > local26) {
						local164 = local20 * 128 + 64;
						local168 = local26 * 128 + 64;
						local189 = Static79.anInt1472;
						if (local189 < 3 && Static183.method2654(local26, local20)) {
							local189++;
						}
						@Pc(1610) Class25_Sub5_Sub5 local1610 = new Class25_Sub5_Sub5(local30, local156, Static236.anInt4213, Static79.anInt1472, local189, local164, Static335.method4499(Static79.anInt1472, local164, local168) - local150, local168, local20, local20, local26, local26, local160);
						Static340.aClass227_35.method4972(new Class1_Sub5_Sub6(local1610));
					}
				} else if (arg0 == Static168.aClass269_19) {
					@Pc(1625) byte local1625 = Static336.aClass1_Sub28_Sub1_2.method5377();
					@Pc(1629) byte local1629 = Static336.aClass1_Sub28_Sub1_2.method5377();
					@Pc(1633) byte local1633 = Static336.aClass1_Sub28_Sub1_2.method5367();
					local30 = Static336.aClass1_Sub28_Sub1_2.method5382();
					local150 = Static336.aClass1_Sub28_Sub1_2.method5363();
					local156 = Static158.anInt2209 + (local150 >> 4 & 0x7);
					local160 = (local150 & 0x7) + Static295.anInt5146;
					@Pc(1660) byte local1660 = Static336.aClass1_Sub28_Sub1_2.method5353();
					local168 = Static336.aClass1_Sub28_Sub1_2.method5375();
					local189 = Static336.aClass1_Sub28_Sub1_2.method5336();
					local444 = Static336.aClass1_Sub28_Sub1_2.method5337();
					local448 = local444 >> 2;
					local452 = local444 & 0x3;
					local456 = Static336.aClass1_Sub28_Sub1_2.method5341();
					if (!Static185.aClass34_7.method5772()) {
						Static401.method5216(local1629, local1625, local456, local448, local156, local452, local168, local1633, local1660, local189, Static79.anInt1472, local160, local30);
					}
				} else if (Static438.aClass269_35 == arg0) {
					local12 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local20 = Static336.aClass1_Sub28_Sub1_2.method5337();
					Static341.aClass75_4.method1616(local12).method1536(local20);
				} else {
					Static55.method972(null, "T3 - " + arg0);
					Static368.method4884(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZIII)V")
	public static void method1425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static289.anInt5057 == 1) {
			Static428.aClass6Array15[Static401.anInt6679 / 100].method5894(Static407.anInt6831 - 8, Static181.anInt3167 + -8);
		}
		if (Static289.anInt5057 == 2) {
			Static428.aClass6Array15[Static401.anInt6679 / 100 + 4].method5894(Static407.anInt6831 - 8, Static181.anInt3167 + -8);
		}
		Static455.method5941();
	}
}
