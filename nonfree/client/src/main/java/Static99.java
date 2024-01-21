import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
	public static int anInt2975;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	public static int anInt2974 = 0;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
	public static int anInt2976 = 0;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
	public static int anInt2977 = 0;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
	public static int anInt2979 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	public static void method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1889(arg0, arg1, arg2, arg4);
		method1889(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1903(arg0, arg1, arg3, arg4);
		method1903(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2974 || arg1 >= anInt2976) {
			return;
		}
		if (arg0 < anInt2977) {
			arg2 -= anInt2977 - arg0;
			arg0 = anInt2977;
		}
		if (arg0 + arg2 > anInt2979) {
			arg2 = anInt2979 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2978;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray388[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([I)V")
	public static void method1890(@OriginalArg(0) int[] arg0) {
		anInt2977 = arg0[0];
		anInt2974 = arg0[1];
		anInt2979 = arg0[2];
		anInt2976 = arg0[3];
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
	public static void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2977) {
			arg2 -= anInt2977 - arg0;
			arg0 = anInt2977;
		}
		if (arg1 < anInt2974) {
			arg3 -= anInt2974 - arg1;
			arg1 = anInt2974;
		}
		if (arg0 + arg2 > anInt2979) {
			arg2 = anInt2979 - arg0;
		}
		if (arg1 + arg3 > anInt2976) {
			arg3 = anInt2976 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt2978 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt2978;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray388[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray388[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray388[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray388[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	public static void method1892() {
		anIntArray388 = null;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
	public static void method1893() {
		anInt2977 = 0;
		anInt2974 = 0;
		anInt2979 = anInt2978;
		anInt2976 = anInt2975;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIII)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2977) {
			arg2 -= anInt2977 - arg0;
			arg0 = anInt2977;
		}
		if (arg1 < anInt2974) {
			arg3 -= anInt2974 - arg1;
			arg1 = anInt2974;
		}
		if (arg0 + arg2 > anInt2979) {
			arg2 = anInt2979 - arg0;
		}
		if (arg1 + arg3 > anInt2976) {
			arg3 = anInt2976 - arg1;
		}
		@Pc(43) int local43 = anInt2978 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2978;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray388[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([I)V")
	public static void method1895(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2977;
		arg0[1] = anInt2974;
		arg0[2] = anInt2979;
		arg0[3] = anInt2976;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIII)V")
	public static void method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2978) {
			arg2 = anInt2978;
		}
		if (arg3 > anInt2975) {
			arg3 = anInt2975;
		}
		anInt2977 = arg0;
		anInt2974 = arg1;
		anInt2979 = arg2;
		anInt2976 = arg3;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIIII)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt2977) {
			arg2 -= anInt2977 - arg0;
			arg0 = anInt2977;
		}
		if (anInt2974 > 0) {
			local1 = anInt2974 * 2849;
			arg3 = 23 - anInt2974;
			arg1 = anInt2974;
		}
		if (arg0 + arg2 > anInt2979) {
			arg2 = anInt2979 - arg0;
		}
		if (arg1 + arg3 > anInt2976) {
			arg3 = anInt2976 - arg1;
		}
		@Pc(57) int local57 = anInt2978 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt2978;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray388[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIII)V")
	private static void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2974 || arg1 >= anInt2976) {
			return;
		}
		if (arg0 < anInt2977) {
			arg2 -= anInt2977 - arg0;
			arg0 = anInt2977;
		}
		if (arg0 + arg2 > anInt2979) {
			arg2 = anInt2979 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2978;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray388[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray388[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray388[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray388[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(IIIII)V")
	public static void method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1889(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1889(arg0 + arg2, arg1, 1 - arg2, arg4);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(96) int local96;
			@Pc(125) int local125;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(86) int local86 = arg3 << 16;
				local96 = (int) Math.floor((double) local86 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < anInt2977) {
					arg1 += local96 * (anInt2977 - arg0);
					arg0 = anInt2977;
				}
				if (arg2 >= anInt2979) {
					arg2 = anInt2979 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt2974 && local125 < anInt2976) {
						anIntArray388[arg0 + local125 * anInt2978] = arg4;
					}
					arg1 += local96;
					arg0++;
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(160) int local160 = arg2 << 16;
				local96 = (int) Math.floor((double) local160 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < anInt2974) {
					arg0 += local96 * (anInt2974 - arg1);
					arg1 = anInt2974;
				}
				if (arg3 >= anInt2976) {
					arg3 = anInt2976 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt2977 && local125 < anInt2979) {
						anIntArray388[local125 + arg1 * anInt2978] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1903(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1903(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()V")
	public static void method1900() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2978 * anInt2975 - 7;
		while (local1 < local7) {
			anIntArray388[local1++] = 0;
			anIntArray388[local1++] = 0;
			anIntArray388[local1++] = 0;
			anIntArray388[local1++] = 0;
			anIntArray388[local1++] = 0;
			anIntArray388[local1++] = 0;
			anIntArray388[local1++] = 0;
			anIntArray388[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray388[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V")
	public static void method1901(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray388 = arg0;
		anInt2978 = arg1;
		anInt2975 = arg2;
		method1896(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(IIIII)V")
	private static void method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2977 || arg0 >= anInt2979) {
			return;
		}
		if (arg1 < anInt2974) {
			arg2 -= anInt2974 - arg1;
			arg1 = anInt2974;
		}
		if (arg1 + arg2 > anInt2976) {
			arg2 = anInt2976 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2978;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray388[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray388[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray388[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray388[local58] = local111;
			local58 += anInt2978;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIII)V")
	public static void method1903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2977 || arg0 >= anInt2979) {
			return;
		}
		if (arg1 < anInt2974) {
			arg2 -= anInt2974 - arg1;
			arg1 = anInt2974;
		}
		if (arg1 + arg2 > anInt2976) {
			arg2 = anInt2976 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2978;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray388[local32 + local34 * anInt2978] = arg3;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIIII)V")
	public static void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1898(arg0, arg1, arg2, arg4, arg5);
		method1898(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1902(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1902(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}
}
