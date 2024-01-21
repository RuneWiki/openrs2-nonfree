import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!mc", name = "bc", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_5 = new CRC32();

	@OriginalMember(owner = "client!mc", name = "cc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_591 = Static65.method1172(" )2> ");

	@OriginalMember(owner = "client!mc", name = "dc", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_6 = new CRC32();

	@OriginalMember(owner = "client!mc", name = "ec", descriptor = "[Lclient!oe;")
	public static Class3_Sub2_Sub1_Sub6[] aClass3_Sub2_Sub1_Sub6Array3 = new Class3_Sub2_Sub1_Sub6[4];

	@OriginalMember(owner = "client!mc", name = "fc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_592 = Static65.method1172("<img=0>");

	@OriginalMember(owner = "client!mc", name = "gc", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!mc", name = "hc", descriptor = "[I")
	public static int[] anIntArray164 = new int[500];

	@OriginalMember(owner = "client!mc", name = "ic", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!mc", name = "jc", descriptor = "Lclient!nb;")
	public static Class57 aClass57_14 = new Class57(30);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIII)V")
	public static void method1165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = -1;
		if (Static127.anInt3014 == 0 && !Static90.aBoolean94) {
			Static120.method2041(Static123.aClass46_1009, 17, arg0 - arg1, Static38.aClass46_298, 0, arg3 - arg2);
		}
		for (@Pc(38) int local38 = 0; local38 < Static45.anInt2605; local38++) {
			@Pc(44) int local44 = Static45.anIntArray255[local38];
			@Pc(50) int local50 = local44 >> 7 & 0x7F;
			@Pc(54) int local54 = local44 & 0x7F;
			@Pc(60) int local60 = local44 >> 14 & 0x7FFF;
			@Pc(66) int local66 = local44 >> 29 & 0x3;
			if (local44 != local3) {
				local3 = local44;
				@Pc(152) int local152;
				if (local66 == 2 && Static154.aClass62_1.method1967(Static99.anInt2422, local54, local50, local44) >= 0) {
					@Pc(91) Class3_Sub2_Sub9 local91 = Static136.method2319(local60);
					if (local91.anIntArray171 != null) {
						local91 = local91.method1199();
					}
					if (local91 == null) {
						continue;
					}
					if (Static127.anInt3014 == 1) {
						Static120.method2041(Static136.aClass46_1096, 37, local54, Static178.method2860(new Class46[] { Static94.aClass46_772, Static162.aClass46_1302, local91.aClass46_625 }), local44, local50);
					} else if (!Static90.aBoolean94) {
						@Pc(142) Class46[] local142 = local91.aClass46Array11;
						if (Static128.aBoolean125) {
							local142 = Static40.method841(local142);
						}
						if (local142 != null) {
							for (local152 = 4; local152 >= 0; local152--) {
								if (local142[local152] != null) {
									@Pc(160) short local160 = 0;
									if (local152 == 0) {
										local160 = 43;
									}
									if (local152 == 1) {
										local160 = 45;
									}
									if (local152 == 2) {
										local160 = 15;
									}
									if (local152 == 3) {
										local160 = 11;
									}
									if (local152 == 4) {
										local160 = 1002;
									}
									Static120.method2041(local142[local152], local160, local54, Static178.method2860(new Class46[] { Static77.aClass46_656, local91.aClass46_625 }), local44, local50);
								}
							}
						}
						Static120.method2041(Static60.aClass46_549, 1007, local54, Static178.method2860(new Class46[] { Static77.aClass46_656, local91.aClass46_625 }), local91.anInt1826 << 14, local50);
					} else if ((Static64.anInt1664 & 0x4) == 4) {
						Static120.method2041(Static182.aClass46_1452, 21, local54, Static178.method2860(new Class46[] { Static106.aClass46_837, Static162.aClass46_1302, local91.aClass46_625 }), local44, local50);
					}
				}
				@Pc(313) int local313;
				@Pc(321) Class3_Sub2_Sub1_Sub1_Sub2 local321;
				@Pc(370) Class3_Sub2_Sub1_Sub1_Sub1 local370;
				if (local66 == 1) {
					@Pc(288) Class3_Sub2_Sub1_Sub1_Sub2 local288 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local60];
					if (local288.aClass3_Sub2_Sub16_1.anInt3814 == 1 && (local288.anInt1700 & 0x7F) == 64 && (local288.anInt1711 & 0x7F) == 64) {
						for (local313 = 0; local313 < Static174.anInt3804; local313++) {
							local321 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[Static42.anIntArray106[local313]];
							if (local321 != null && local288 != local321 && local321.aClass3_Sub2_Sub16_1.anInt3814 == 1 && local288.anInt1700 == local321.anInt1700 && local288.anInt1711 == local321.anInt1711) {
								Static152.method2512(local321.aClass3_Sub2_Sub16_1, Static42.anIntArray106[local313], local54, local50);
							}
						}
						for (local152 = 0; local152 < Static180.anInt3971; local152++) {
							local370 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static127.anIntArray338[local152]];
							if (local370 != null && local288.anInt1700 == local370.anInt1700 && local370.anInt1711 == local288.anInt1711) {
								Static68.method1185(local50, Static127.anIntArray338[local152], local54, local370);
							}
						}
					}
					Static152.method2512(local288.aClass3_Sub2_Sub16_1, local60, local54, local50);
				}
				if (local66 == 0) {
					@Pc(418) Class3_Sub2_Sub1_Sub1_Sub1 local418 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local60];
					if ((local418.anInt1700 & 0x7F) == 64 && (local418.anInt1711 & 0x7F) == 64) {
						for (local313 = 0; local313 < Static174.anInt3804; local313++) {
							local321 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[Static42.anIntArray106[local313]];
							if (local321 != null && local321.aClass3_Sub2_Sub16_1.anInt3814 == 1 && local321.anInt1700 == local418.anInt1700 && local321.anInt1711 == local418.anInt1711) {
								Static152.method2512(local321.aClass3_Sub2_Sub16_1, Static42.anIntArray106[local313], local54, local50);
							}
						}
						for (local152 = 0; local152 < Static180.anInt3971; local152++) {
							local370 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static127.anIntArray338[local152]];
							if (local370 != null && local418 != local370 && local418.anInt1700 == local370.anInt1700 && local370.anInt1711 == local418.anInt1711) {
								Static68.method1185(local50, Static127.anIntArray338[local152], local54, local370);
							}
						}
					}
					Static68.method1185(local50, local60, local54, local418);
				}
				if (local66 == 3) {
					@Pc(532) Class59 local532 = Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local54][local50];
					if (local532 != null) {
						for (@Pc(539) Class3_Sub2_Sub1_Sub7 local539 = (Class3_Sub2_Sub1_Sub7) local532.method1737(); local539 != null; local539 = (Class3_Sub2_Sub1_Sub7) local532.method1732()) {
							@Pc(546) Class3_Sub2_Sub14 local546 = Static146.method2432(local539.anInt3721);
							if (Static127.anInt3014 == 1) {
								Static120.method2041(Static136.aClass46_1096, 51, local54, Static178.method2860(new Class46[] { Static94.aClass46_772, Static84.aClass46_710, local546.aClass46_1163 }), local539.anInt3721, local50);
							} else if (!Static90.aBoolean94) {
								@Pc(596) Class46[] local596 = local546.aClass46Array21;
								if (Static128.aBoolean125) {
									local596 = Static40.method841(local596);
								}
								for (@Pc(604) int local604 = 4; local604 >= 0; local604--) {
									if (local596 != null && local596[local604] != null) {
										@Pc(618) byte local618 = 0;
										if (local604 == 0) {
											local618 = 5;
										}
										if (local604 == 1) {
											local618 = 3;
										}
										if (local604 == 2) {
											local618 = 9;
										}
										if (local604 == 3) {
											local618 = 24;
										}
										if (local604 == 4) {
											local618 = 32;
										}
										Static120.method2041(local596[local604], local618, local54, Static178.method2860(new Class46[] { Static54.aClass46_475, local546.aClass46_1163 }), local539.anInt3721, local50);
									} else if (local604 == 2) {
										Static120.method2041(Static178.aClass46_1410, 9, local54, Static178.method2860(new Class46[] { Static54.aClass46_475, local546.aClass46_1163 }), local539.anInt3721, local50);
									}
								}
								Static120.method2041(Static60.aClass46_549, 1004, local54, Static178.method2860(new Class46[] { Static54.aClass46_475, local546.aClass46_1163 }), local539.anInt3721, local50);
							} else if ((Static64.anInt1664 & 0x1) == 1) {
								Static120.method2041(Static182.aClass46_1452, 28, local54, Static178.method2860(new Class46[] { Static106.aClass46_837, Static84.aClass46_710, local546.aClass46_1163 }), local539.anInt3721, local50);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lclient!wf;")
	public static Class3_Sub2_Sub18 method1169(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub2_Sub18 local10 = (Class3_Sub2_Sub18) Static135.aClass57_22.method1719((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static145.aClass44_28.method1624(5, arg0);
		local10 = new Class3_Sub2_Sub18();
		if (local25 != null) {
			local10.method2891(new Class3_Sub4(local25));
		}
		Static135.aClass57_22.method1717(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	public static void method1170() {
		aBooleanArray9 = null;
		aClass57_14 = null;
		aClass3_Sub2_Sub1_Sub6Array3 = null;
		aCRC32_5 = null;
		aClass46_592 = null;
		aClass46_591 = null;
		aCRC32_6 = null;
		anIntArray164 = null;
	}
}
