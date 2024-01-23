import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ja", name = "eb", descriptor = "Lclient!pg;")
	public static Class1_Sub17 aClass1_Sub17_1;

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "Lclient!hh;")
	public static Class50 aClass50_613 = Static186.method3527(")4a=");

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "[I")
	public static int[] anIntArray175 = new int[256];

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
	public static int anInt1938 = -1;

	@OriginalMember(owner = "client!ja", name = "gb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_614 = Static186.method3527("(U5");

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Lclient!hh;")
	public static Class50 method1490(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static17.method257(new Class50[] { Static221.aClass50_1352, Static160.method2684(arg0), Static98.aClass50_646 });
		} else if (arg0 < 10000000) {
			return Static17.method257(new Class50[] { Static77.aClass50_516, Static160.method2684(arg0 / 1000), Static153.aClass50_1064, Static98.aClass50_646 });
		} else {
			return Static17.method257(new Class50[] { Static172.aClass50_1149, Static160.method2684(arg0 / 1000000), Static24.aClass50_192, Static98.aClass50_646 });
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)Lclient!j;")
	public static Class1_Sub3 method1493(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub3_Sub9();
		} else if (arg0 == 1) {
			return new Class1_Sub3_Sub39();
		} else if (arg0 == 2) {
			return new Class1_Sub3_Sub6();
		} else if (arg0 == 3) {
			return new Class1_Sub3_Sub16();
		} else if (arg0 == 4) {
			return new Class1_Sub3_Sub4();
		} else if (arg0 == 5) {
			return new Class1_Sub3_Sub31();
		} else if (arg0 == 6) {
			return new Class1_Sub3_Sub23();
		} else if (arg0 == 7) {
			return new Class1_Sub3_Sub20();
		} else if (arg0 == 8) {
			return new Class1_Sub3_Sub21();
		} else if (arg0 == 9) {
			return new Class1_Sub3_Sub24();
		} else if (arg0 == 10) {
			return new Class1_Sub3_Sub32();
		} else if (arg0 == 11) {
			return new Class1_Sub3_Sub10();
		} else if (arg0 == 12) {
			return new Class1_Sub3_Sub11();
		} else if (arg0 == 13) {
			return new Class1_Sub3_Sub27();
		} else if (arg0 == 14) {
			return new Class1_Sub3_Sub12();
		} else if (arg0 == 15) {
			return new Class1_Sub3_Sub2();
		} else if (arg0 == 16) {
			return new Class1_Sub3_Sub28();
		} else if (arg0 == 17) {
			return new Class1_Sub3_Sub5();
		} else if (arg0 == 18) {
			return new Class1_Sub3_Sub34_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub3_Sub25();
		} else if (arg0 == 20) {
			return new Class1_Sub3_Sub37();
		} else if (arg0 == 21) {
			return new Class1_Sub3_Sub13();
		} else if (arg0 == 22) {
			return new Class1_Sub3_Sub3();
		} else if (arg0 == 23) {
			return new Class1_Sub3_Sub19();
		} else if (arg0 == 24) {
			return new Class1_Sub3_Sub29();
		} else if (arg0 == 25) {
			return new Class1_Sub3_Sub22();
		} else if (arg0 == 26) {
			return new Class1_Sub3_Sub7();
		} else if (arg0 == 27) {
			return new Class1_Sub3_Sub33();
		} else if (arg0 == 28) {
			return new Class1_Sub3_Sub8();
		} else if (arg0 == 29) {
			return new Class1_Sub3_Sub18();
		} else if (arg0 == 30) {
			return new Class1_Sub3_Sub36();
		} else if (arg0 == 31) {
			return new Class1_Sub3_Sub35();
		} else if (arg0 == 32) {
			return new Class1_Sub3_Sub14();
		} else if (arg0 == 33) {
			return new Class1_Sub3_Sub15();
		} else if (arg0 == 34) {
			return new Class1_Sub3_Sub17();
		} else if (arg0 == 35) {
			return new Class1_Sub3_Sub26();
		} else if (arg0 == 36) {
			return new Class1_Sub3_Sub1();
		} else if (arg0 == 37) {
			return new Class1_Sub3_Sub30();
		} else if (arg0 == 38) {
			return new Class1_Sub3_Sub38();
		} else if (arg0 == 39) {
			return new Class1_Sub3_Sub34();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg4;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg4 - arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local29 << 1;
		@Pc(41) int local41 = local21 * local21;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local41 << 1;
		@Pc(53) int local53 = arg4 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local37 + (1 - local53) * local25;
		@Pc(79) int local79 = local49 + local33 * (1 - local61);
		@Pc(83) int local83 = local25 << 2;
		@Pc(92) int local92 = local41 - local57 * (local61 - 1);
		@Pc(96) int local96 = local41 << 2;
		@Pc(100) int local100 = local29 << 2;
		@Pc(108) int local108 = local29 - local45 * (local53 - 1);
		@Pc(119) int local119 = (local53 - 3) * local45;
		@Pc(123) int local123 = local37 * 3;
		@Pc(127) int local127 = local33 << 2;
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = (local61 - 3) * local57;
		@Pc(139) int local139 = local96;
		@Pc(145) int local145 = local127 * (local21 - 1);
		@Pc(147) int local147 = local100;
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(187) int local187;
		@Pc(195) int local195;
		if (arg0 >= Static49.anInt1030 && Static177.anInt3701 >= arg0) {
			@Pc(161) int[] local161 = Static139.anIntArrayArray21[arg0];
			local170 = Static92.method1433(Static131.anInt2713, arg5 - arg3, Static135.anInt2790);
			local178 = Static92.method1433(Static131.anInt2713, arg3 + arg5, Static135.anInt2790);
			local187 = Static92.method1433(Static131.anInt2713, arg5 - local16, Static135.anInt2790);
			local195 = Static92.method1433(Static131.anInt2713, arg5 + local16, Static135.anInt2790);
			Static107.method1641(local170, arg6, local161, local187);
			Static107.method1641(local187, arg1, local161, local195);
			Static107.method1641(local195, arg6, local161, local178);
		}
		@Pc(219) int local219 = local83 * (arg4 - 1);
		while (local3 > 0) {
			if (local70 < 0) {
				while (local70 < 0) {
					local108 += local147;
					local9++;
					local70 += local123;
					local123 += local100;
					local147 += local100;
				}
			}
			if (local108 < 0) {
				local70 += local123;
				local9++;
				local123 += local100;
				local108 += local147;
				local147 += local100;
			}
			@Pc(276) boolean local276 = local21 >= local3;
			local108 += -local119;
			local3--;
			local119 -= local83;
			local170 = arg0 - local3;
			local178 = local3 + arg0;
			local70 += -local219;
			if (local276) {
				if (local79 < 0) {
					while (local79 < 0) {
						local11++;
						local79 += local131;
						local92 += local139;
						local139 += local96;
						local131 += local96;
					}
				}
				if (local92 < 0) {
					local11++;
					local79 += local131;
					local131 += local96;
					local92 += local139;
					local139 += local96;
				}
				local79 += -local145;
				local145 -= local127;
				local92 += -local137;
				local137 -= local127;
			}
			local219 -= local83;
			if (local178 >= Static49.anInt1030 && Static177.anInt3701 >= local170) {
				local187 = Static92.method1433(Static131.anInt2713, local9 + arg5, Static135.anInt2790);
				local195 = Static92.method1433(Static131.anInt2713, arg5 - local9, Static135.anInt2790);
				if (local276) {
					@Pc(411) int local411 = Static92.method1433(Static131.anInt2713, arg5 + local11, Static135.anInt2790);
					@Pc(419) int local419 = Static92.method1433(Static131.anInt2713, arg5 - local11, Static135.anInt2790);
					@Pc(430) int[] local430;
					if (Static49.anInt1030 <= local170) {
						local430 = Static139.anIntArrayArray21[local170];
						Static107.method1641(local195, arg6, local430, local419);
						Static107.method1641(local419, arg1, local430, local411);
						Static107.method1641(local411, arg6, local430, local187);
					}
					if (Static177.anInt3701 >= local178) {
						local430 = Static139.anIntArrayArray21[local178];
						Static107.method1641(local195, arg6, local430, local419);
						Static107.method1641(local419, arg1, local430, local411);
						Static107.method1641(local411, arg6, local430, local187);
					}
				} else {
					if (Static49.anInt1030 <= local170) {
						Static107.method1641(local195, arg6, Static139.anIntArrayArray21[local170], local187);
					}
					if (Static177.anInt3701 >= local178) {
						Static107.method1641(local195, arg6, Static139.anIntArrayArray21[local178], local187);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!db;IZLclient!nk;ILclient!gj;I)V")
	public static void method1496(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class20_Sub3_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20_Sub3_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class1_Sub16 local9 = new Class1_Sub16();
		local9.anInt1905 = arg0;
		local9.anInt1901 = arg6 * 128;
		local9.anInt1908 = arg2 * 128;
		if (arg1 != null) {
			local9.anInt1892 = arg1.anInt787;
			local9.anIntArray170 = arg1.anIntArray68;
			local9.anInt1898 = arg1.anInt809;
			local9.aClass18_1 = arg1;
			@Pc(42) int local42 = arg1.anInt822;
			@Pc(45) int local45 = arg1.anInt811;
			if (arg4 == 1 || arg4 == 3) {
				local45 = arg1.anInt822;
				local42 = arg1.anInt811;
			}
			local9.anInt1906 = arg1.anInt823;
			local9.anInt1899 = arg1.anInt791 * 128;
			local9.anInt1903 = (local42 + arg2) * 128;
			local9.anInt1897 = (arg6 + local45) * 128;
			if (arg1.anIntArray66 != null) {
				local9.aBoolean84 = true;
				local9.method1466();
			}
			if (local9.anIntArray170 != null) {
				local9.anInt1895 = local9.anInt1898 + (int) (Math.random() * (double) (local9.anInt1892 - local9.anInt1898));
			}
			Static198.aClass75_20.method2240(local9);
		} else if (arg3 != null) {
			@Pc(123) Class105 local123 = arg3.aClass105_1;
			local9.aClass20_Sub3_Sub2_1 = arg3;
			if (local123.anIntArray443 != null) {
				local9.aBoolean84 = true;
				local123 = local123.method3127();
			}
			if (local123 != null) {
				local9.anInt1903 = (local123.anInt3889 + arg2) * 128;
				local9.anInt1897 = (local123.anInt3889 + arg6) * 128;
				local9.anInt1906 = Static118.method1868(arg3);
				local9.anInt1899 = local123.anInt3910 * 128;
			}
			Static158.aClass75_17.method2240(local9);
		} else if (arg5 != null) {
			local9.aClass20_Sub3_Sub1_1 = arg5;
			local9.anInt1903 = (arg2 + arg5.anInt3034) * 128;
			local9.anInt1897 = (arg5.anInt3034 + arg6) * 128;
			local9.anInt1906 = Static191.method3133(arg5);
			local9.anInt1899 = arg5.anInt1507 * 128;
			Static153.aClass90_16.method2817(local9, arg5.aClass50_493.method1221());
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!hh;)Lclient!ek;")
	public static Class1_Sub1_Sub6 method1497(@OriginalArg(1) Class50 arg0) {
		for (@Pc(17) Class1_Sub1_Sub6 local17 = (Class1_Sub1_Sub6) Static56.aClass75_5.method2239(); local17 != null; local17 = (Class1_Sub1_Sub6) Static56.aClass75_5.method2238()) {
			if (local17.aClass50_396.method1236(arg0)) {
				return local17;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "(I)V")
	public static void method1498() {
		Static32.aClass1_Sub17_Sub1_1.method2182(218);
		for (@Pc(23) Class1_Sub13 local23 = (Class1_Sub13) Static157.aClass90_19.method2823(); local23 != null; local23 = (Class1_Sub13) Static157.aClass90_19.method2821()) {
			if (local23.anInt1587 == 0) {
				Static203.method532(true, local23);
			}
		}
		if (Static199.aClass93_112 != null) {
			Static66.method999(Static199.aClass93_112);
			Static199.aClass93_112 = null;
		}
	}
}
