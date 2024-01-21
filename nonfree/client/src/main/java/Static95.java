import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_22;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!na;")
	public static Class56 aClass56_30;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	public static int anInt2161;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "[[Lclient!wa;")
	public static Class2_Sub22[][] aClass2_Sub22ArrayArray1;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_11;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!pe;")
	private static Class65 aClass65_901 = Static119.method1462("M");

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_900 = aClass65_901;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public static int anInt2152 = -1;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!pe;")
	private static Class65 aClass65_903 = Static119.method1462("Welcome to RuneScape");

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_902 = aClass65_903;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!bc;")
	public static Class8 aClass8_46 = new Class8(64);

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
	public static int[] anIntArray284 = new int[100];

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_904 = aClass65_901;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "Lclient!pe;")
	private static Class65 aClass65_906 = Static119.method1462("Too many connections from your address)3");

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "Lclient!pe;")
	public static Class65 aClass65_905 = aClass65_906;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
	public static int anInt2164 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method1567() {
		anIntArray284 = null;
		aClass65_906 = null;
		aClass56_30 = null;
		aClass56_Sub1_22 = null;
		aClass65_904 = null;
		aClass65_901 = null;
		aClass65_903 = null;
		aClass65_900 = null;
		aClass2_Sub22_11 = null;
		aClass2_Sub22ArrayArray1 = null;
		aClass8_46 = null;
		aClass65_902 = null;
		aClass65_905 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!wa;)Lclient!wa;")
	public static Class2_Sub22 method1568(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(11) int local11 = Static36.method651(Static114.method1834(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(17) int local17 = 0; local17 < local11; local17++) {
			arg0 = Static35.method645(arg0.anInt2800);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method1569() {
		Static18.aClass8_10.method171();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
	public static boolean method1570(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ce;)V")
	public static void method1571(@OriginalArg(1) Class14 arg0) {
		Static76.aClass14_1 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BI[Lclient!la;Lclient!le;IIIIII)V")
	public static void method1572(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class46[] arg3, @OriginalArg(4) Class49 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = -1;
		@Pc(8) Class2_Sub4 local8 = new Class2_Sub4(arg1);
		while (true) {
			@Pc(12) int local12 = local8.method938();
			if (local12 == 0) {
				return;
			}
			local3 += local12;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(24) int local24 = local8.method938();
				if (local24 == 0) {
					break;
				}
				local20 += local24 - 1;
				@Pc(39) int local39 = local20 >> 12;
				@Pc(45) int local45 = local20 >> 6 & 0x3F;
				@Pc(49) int local49 = local8.method933();
				@Pc(53) int local53 = local20 & 0x3F;
				@Pc(57) int local57 = local49 >> 2;
				@Pc(61) int local61 = local49 & 0x3;
				if (arg2 == local39 && local45 >= arg5 && arg5 + 8 > local45 && arg0 <= local53 && local53 < arg0 + 8) {
					@Pc(92) Class2_Sub1_Sub15 local92 = Static73.method1248(local3);
					@Pc(109) int local109 = arg9 + Static62.method1116(arg6, local45 & 0x7, local92.anInt2689, local92.anInt2671, local61, local53 & 0x7);
					@Pc(126) int local126 = Static30.method604(local61, arg6, local53 & 0x7, local92.anInt2689, local45 & 0x7, local92.anInt2671) + arg7;
					if (local109 > 0 && local126 > 0 && local109 < 103 && local126 < 103) {
						@Pc(143) Class46 local143 = null;
						@Pc(145) int local145 = arg8;
						if ((Static88.aByteArrayArrayArray3[1][local109][local126] & 0x2) == 2) {
							local145 = arg8 - 1;
						}
						if (local145 >= 0) {
							local143 = arg3[local145];
						}
						Static70.method1237(arg6 + local61 & 0x3, local143, arg4, local126, local3, local109, arg8, local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIILclient!le;IIIILclient!la;)V")
	public static void method1573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class49 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class46 arg8) {
		@Pc(5) Class2_Sub1_Sub15 local5 = Static73.method1248(arg4);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (arg1 == 1 || arg1 == 3) {
			local20 = local5.anInt2689;
			local23 = local5.anInt2671;
		} else {
			local20 = local5.anInt2671;
			local23 = local5.anInt2689;
		}
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (local23 + arg0 > 104) {
			local38 = arg0;
			local42 = arg0 + 1;
		} else {
			local38 = (local23 >> 1) + arg0;
			local42 = (local23 + 1 >> 1) + arg0;
		}
		@Pc(62) int[][] local62 = Static67.anIntArrayArrayArray8[arg6];
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (local20 + arg2 > 104) {
			local71 = arg2;
			local75 = arg2 + 1;
		} else {
			local71 = (local20 >> 1) + arg2;
			local75 = (local20 + 1 >> 1) + arg2;
		}
		@Pc(117) int local117 = local62[local75][local42] + local62[local71][local42] + local62[local75][local38] + local62[local71][local38] >> 2;
		@Pc(125) int local125 = (arg2 << 7) + (local20 << 6);
		@Pc(139) int local139 = arg2 + (arg0 << 7) + (arg4 << 14) + 1073741824;
		@Pc(147) int local147 = (local23 << 6) + (arg0 << 7);
		if (local5.anInt2662 == 0) {
			local139 += Integer.MIN_VALUE;
		}
		@Pc(161) int local161 = (arg1 << 6) + arg7;
		if (local5.anInt2670 == 1) {
			local161 += 256;
		}
		@Pc(193) Class2_Sub1_Sub1 local193;
		if (arg7 == 22) {
			if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
				local193 = local5.method1916(local147, arg1, local125, local62, local117, 22);
			} else {
				local193 = new Class2_Sub1_Sub1_Sub1(arg4, 22, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
			}
			arg3.method1160(arg5, arg2, arg0, local117, local193, local139, local161);
			if (local5.anInt2695 == 1) {
				arg8.method1112(arg2, arg0);
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
				local193 = local5.method1916(local147, arg1, local125, local62, local117, 10);
			} else {
				local193 = new Class2_Sub1_Sub1_Sub1(arg4, 10, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
			}
			if (local193 != null) {
				arg3.method1177(arg5, arg2, arg0, local117, local20, local23, local193, arg7 == 11 ? 256 : 0, local139, local161);
			}
			if (local5.anInt2695 != 0) {
				arg8.method1113(local23, local20, arg2, local5.aBoolean114, arg0);
			}
		} else if (arg7 >= 12) {
			if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
				local193 = local5.method1916(local147, arg1, local125, local62, local117, arg7);
			} else {
				local193 = new Class2_Sub1_Sub1_Sub1(arg4, arg7, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
			}
			arg3.method1177(arg5, arg2, arg0, local117, 1, 1, local193, 0, local139, local161);
			if (local5.anInt2695 != 0) {
				arg8.method1113(local23, local20, arg2, local5.aBoolean114, arg0);
			}
		} else if (arg7 == 0) {
			if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
				local193 = local5.method1916(local147, arg1, local125, local62, local117, 0);
			} else {
				local193 = new Class2_Sub1_Sub1_Sub1(arg4, 0, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
			}
			arg3.method1172(arg5, arg2, arg0, local117, local193, null, Static50.anIntArray154[arg1], 0, local139, local161);
			if (local5.anInt2695 != 0) {
				arg8.method1106(arg7, arg2, arg1, local5.aBoolean114, arg0);
			}
		} else if (arg7 == 1) {
			if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
				local193 = local5.method1916(local147, arg1, local125, local62, local117, 1);
			} else {
				local193 = new Class2_Sub1_Sub1_Sub1(arg4, 1, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
			}
			arg3.method1172(arg5, arg2, arg0, local117, local193, null, Static17.anIntArray35[arg1], 0, local139, local161);
			if (local5.anInt2695 != 0) {
				arg8.method1106(arg7, arg2, arg1, local5.aBoolean114, arg0);
			}
		} else {
			@Pc(544) Class2_Sub1_Sub1 local544;
			@Pc(511) int local511;
			if (arg7 == 2) {
				local511 = arg1 + 1 & 0x3;
				@Pc(532) Class2_Sub1_Sub1 local532;
				if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
					local532 = local5.method1916(local147, arg1 + 4, local125, local62, local117, 2);
					local544 = local5.method1916(local147, local511, local125, local62, local117, 2);
				} else {
					local532 = new Class2_Sub1_Sub1_Sub1(arg4, 2, arg1 + 4, arg6, arg2, arg0, local5.anInt2692, true, null);
					local544 = new Class2_Sub1_Sub1_Sub1(arg4, 2, local511, arg6, arg2, arg0, local5.anInt2692, true, null);
				}
				arg3.method1172(arg5, arg2, arg0, local117, local532, local544, Static50.anIntArray154[arg1], Static50.anIntArray154[local511], local139, local161);
				if (local5.anInt2695 != 0) {
					arg8.method1106(arg7, arg2, arg1, local5.aBoolean114, arg0);
				}
			} else if (arg7 == 3) {
				if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
					local193 = local5.method1916(local147, arg1, local125, local62, local117, 3);
				} else {
					local193 = new Class2_Sub1_Sub1_Sub1(arg4, 3, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
				}
				arg3.method1172(arg5, arg2, arg0, local117, local193, null, Static17.anIntArray35[arg1], 0, local139, local161);
				if (local5.anInt2695 != 0) {
					arg8.method1106(arg7, arg2, arg1, local5.aBoolean114, arg0);
				}
			} else if (arg7 == 9) {
				if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
					local193 = local5.method1916(local147, arg1, local125, local62, local117, arg7);
				} else {
					local193 = new Class2_Sub1_Sub1_Sub1(arg4, arg7, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
				}
				arg3.method1177(arg5, arg2, arg0, local117, 1, 1, local193, 0, local139, local161);
				if (local5.anInt2695 != 0) {
					arg8.method1113(local23, local20, arg2, local5.aBoolean114, arg0);
				}
			} else if (arg7 == 4) {
				if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
					local193 = local5.method1916(local147, arg1, local125, local62, local117, 4);
				} else {
					local193 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
				}
				arg3.method1155(arg5, arg2, arg0, local117, local193, null, Static50.anIntArray154[arg1], 0, 0, 0, local139, local161);
			} else {
				@Pc(795) int local795;
				if (arg7 == 5) {
					local795 = arg3.method1175(arg5, arg2, arg0);
					local511 = 16;
					if (local795 != 0) {
						local511 = Static73.method1248(local795 >> 14 & 0x7FFF).anInt2666;
					}
					if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
						local544 = local5.method1916(local147, arg1, local125, local62, local117, 4);
					} else {
						local544 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg1, arg6, arg2, arg0, local5.anInt2692, true, null);
					}
					arg3.method1155(arg5, arg2, arg0, local117, local544, null, Static50.anIntArray154[arg1], 0, Static77.anIntArray225[arg1] * local511, Static88.anIntArray257[arg1] * local511, local139, local161);
				} else if (arg7 == 6) {
					local511 = 8;
					local795 = arg3.method1175(arg5, arg2, arg0);
					if (local795 != 0) {
						local511 = Static73.method1248(local795 >> 14 & 0x7FFF).anInt2666 / 2;
					}
					if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
						local544 = local5.method1916(local147, arg1 + 4, local125, local62, local117, 4);
					} else {
						local544 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg1 + 4, arg6, arg2, arg0, local5.anInt2692, true, null);
					}
					arg3.method1155(arg5, arg2, arg0, local117, local544, null, 256, arg1, Static134.anIntArray417[arg1] * local511, Static9.anIntArray25[arg1] * local511, local139, local161);
				} else if (arg7 == 7) {
					local795 = arg1 + 2 & 0x3;
					if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
						local193 = local5.method1916(local147, local795 + 4, local125, local62, local117, 4);
					} else {
						local193 = new Class2_Sub1_Sub1_Sub1(arg4, 4, local795 + 4, arg6, arg2, arg0, local5.anInt2692, true, null);
					}
					arg3.method1155(arg5, arg2, arg0, local117, local193, null, 256, local795, 0, 0, local139, local161);
				} else if (arg7 == 8) {
					local795 = arg3.method1175(arg5, arg2, arg0);
					local511 = 8;
					if (local795 != 0) {
						local511 = Static73.method1248(local795 >> 14 & 0x7FFF).anInt2666 / 2;
					}
					@Pc(1055) int local1055 = arg1 + 2 & 0x3;
					@Pc(1095) Class2_Sub1_Sub1 local1095;
					if (local5.anInt2692 == -1 && local5.anIntArray351 == null) {
						local544 = local5.method1916(local147, arg1 + 4, local125, local62, local117, 4);
						local1095 = local5.method1916(local147, local1055 + 4, local125, local62, local117, 4);
					} else {
						local544 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg1 + 4, arg6, arg2, arg0, local5.anInt2692, true, null);
						local1095 = new Class2_Sub1_Sub1_Sub1(arg4, 4, local1055 + 4, arg6, arg2, arg0, local5.anInt2692, true, null);
					}
					arg3.method1155(arg5, arg2, arg0, local117, local544, local1095, 256, arg1, Static134.anIntArray417[arg1] * local511, local511 * Static9.anIntArray25[arg1], local139, local161);
				}
			}
		}
	}
}
