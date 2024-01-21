import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!t", name = "T", descriptor = "I")
	public static int anInt1894;

	@OriginalMember(owner = "client!t", name = "W", descriptor = "I")
	public static int anInt1897;

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!t", name = "U", descriptor = "I")
	public static int anInt1895 = 0;

	@OriginalMember(owner = "client!t", name = "V", descriptor = "I")
	public static int anInt1896 = 0;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "I")
	public static int anInt1898 = 0;

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
	public static int anInt1899 = 0;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)V")
	public static void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt1896 || arg0 >= anInt1898) {
			return;
		}
		if (arg1 < anInt1899) {
			arg2 -= anInt1899 - arg1;
			arg1 = anInt1899;
		}
		if (arg1 + arg2 > anInt1895) {
			arg2 = anInt1895 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt1897;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray314[local32 + local34 * anInt1897] = arg3;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIII)V")
	public static void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1319(arg0, arg1, arg2, arg4, arg5);
		method1319(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1321(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1321(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public static void method1318() {
		anIntArray314 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
	private static void method1319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt1899 || arg1 >= anInt1895) {
			return;
		}
		if (arg0 < anInt1896) {
			arg2 -= anInt1896 - arg0;
			arg0 = anInt1896;
		}
		if (arg0 + arg2 > anInt1898) {
			arg2 = anInt1898 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt1897;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray314[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray314[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray314[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray314[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
	public static void method1320() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt1897 * anInt1894 - 7;
		while (local1 < local7) {
			anIntArray314[local1++] = 0;
			anIntArray314[local1++] = 0;
			anIntArray314[local1++] = 0;
			anIntArray314[local1++] = 0;
			anIntArray314[local1++] = 0;
			anIntArray314[local1++] = 0;
			anIntArray314[local1++] = 0;
			anIntArray314[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray314[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIII)V")
	private static void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt1896 || arg0 >= anInt1898) {
			return;
		}
		if (arg1 < anInt1899) {
			arg2 -= anInt1899 - arg1;
			arg1 = anInt1899;
		}
		if (arg1 + arg2 > anInt1895) {
			arg2 = anInt1895 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt1897;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray314[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray314[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray314[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray314[local58] = local111;
			local58 += anInt1897;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(IIIII)V")
	public static void method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt1896) {
			arg2 -= anInt1896 - arg0;
			arg0 = anInt1896;
		}
		if (arg1 < anInt1899) {
			arg3 -= anInt1899 - arg1;
			arg1 = anInt1899;
		}
		if (arg0 + arg2 > anInt1898) {
			arg2 = anInt1898 - arg0;
		}
		if (arg1 + arg3 > anInt1895) {
			arg3 = anInt1895 - arg1;
		}
		@Pc(43) int local43 = anInt1897 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt1897;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray314[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
	public static void method1323(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray314 = arg0;
		anInt1897 = arg1;
		anInt1894 = arg2;
		method1325(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIIII)V")
	public static void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt1896) {
			arg2 -= anInt1896 - arg0;
			arg0 = anInt1896;
		}
		if (arg1 < anInt1899) {
			arg3 -= anInt1899 - arg1;
			arg1 = anInt1899;
		}
		if (arg0 + arg2 > anInt1898) {
			arg2 = anInt1898 - arg0;
		}
		if (arg1 + arg3 > anInt1895) {
			arg3 = anInt1895 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt1897 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt1897;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray314[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray314[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray314[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray314[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(IIII)V")
	public static void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt1897) {
			arg2 = anInt1897;
		}
		if (arg3 > anInt1894) {
			arg3 = anInt1894;
		}
		anInt1896 = arg0;
		anInt1899 = arg1;
		anInt1898 = arg2;
		anInt1895 = arg3;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(IIII)V")
	public static void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt1899 || arg1 >= anInt1895) {
			return;
		}
		if (arg0 < anInt1896) {
			arg2 -= anInt1896 - arg0;
			arg0 = anInt1896;
		}
		if (arg0 + arg2 > anInt1898) {
			arg2 = anInt1898 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt1897;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray314[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()V")
	public static void method1327() {
		anInt1896 = 0;
		anInt1899 = 0;
		anInt1898 = anInt1897;
		anInt1895 = anInt1894;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(IIIII)V")
	public static void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1326(arg0, arg1, arg2, arg4);
		method1326(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1316(arg0, arg1, arg3, arg4);
		method1316(arg0 + arg2 - 1, arg1, arg3, arg4);
	}
}
