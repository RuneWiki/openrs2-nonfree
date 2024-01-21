import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!od", name = "K", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	public static int anInt1933;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	public static int anInt1934;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	public static int anInt1932 = 0;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "I")
	public static int anInt1935 = 0;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "I")
	public static int anInt1936 = 0;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	public static int anInt1937 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public static void method1309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1322(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1322(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt1935) {
					arg1 += local96 * (anInt1935 - arg0);
					arg0 = anInt1935;
				}
				if (arg2 >= anInt1937) {
					arg2 = anInt1937 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt1936 && local125 < anInt1932) {
						anIntArray256[arg0 + local125 * anInt1934] = arg4;
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
				if (arg1 < anInt1936) {
					arg0 += local96 * (anInt1936 - arg1);
					arg1 = anInt1936;
				}
				if (arg3 >= anInt1932) {
					arg3 = anInt1932 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt1935 && local125 < anInt1937) {
						anIntArray256[local125 + arg1 * anInt1934] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1311(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1311(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIII)V")
	private static void method1310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt1936 || arg1 >= anInt1932) {
			return;
		}
		if (arg0 < anInt1935) {
			arg2 -= anInt1935 - arg0;
			arg0 = anInt1935;
		}
		if (arg0 + arg2 > anInt1937) {
			arg2 = anInt1937 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt1934;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray256[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray256[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray256[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray256[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	public static void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt1935 || arg0 >= anInt1937) {
			return;
		}
		if (arg1 < anInt1936) {
			arg2 -= anInt1936 - arg1;
			arg1 = anInt1936;
		}
		if (arg1 + arg2 > anInt1932) {
			arg2 = anInt1932 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt1934;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray256[local32 + local34 * anInt1934] = arg3;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([III)V")
	public static void method1312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray256 = arg0;
		anInt1934 = arg1;
		anInt1933 = arg2;
		method1317(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	public static void method1313() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt1934 * anInt1933 - 7;
		while (local1 < local7) {
			anIntArray256[local1++] = 0;
			anIntArray256[local1++] = 0;
			anIntArray256[local1++] = 0;
			anIntArray256[local1++] = 0;
			anIntArray256[local1++] = 0;
			anIntArray256[local1++] = 0;
			anIntArray256[local1++] = 0;
			anIntArray256[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray256[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
	public static void method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt1935) {
			arg2 -= anInt1935 - arg0;
			arg0 = anInt1935;
		}
		if (anInt1936 > 0) {
			local1 = anInt1936 * 2849;
			arg3 = 23 - anInt1936;
			arg1 = anInt1936;
		}
		if (arg0 + arg2 > anInt1937) {
			arg2 = anInt1937 - arg0;
		}
		if (arg1 + arg3 > anInt1932) {
			arg3 = anInt1932 - arg1;
		}
		@Pc(57) int local57 = anInt1934 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt1934;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray256[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([I)V")
	public static void method1315(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt1935;
		arg0[1] = anInt1936;
		arg0[2] = anInt1937;
		arg0[3] = anInt1932;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IIIII)V")
	public static void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt1935) {
			arg2 -= anInt1935 - arg0;
			arg0 = anInt1935;
		}
		if (arg1 < anInt1936) {
			arg3 -= anInt1936 - arg1;
			arg1 = anInt1936;
		}
		if (arg0 + arg2 > anInt1937) {
			arg2 = anInt1937 - arg0;
		}
		if (arg1 + arg3 > anInt1932) {
			arg3 = anInt1932 - arg1;
		}
		@Pc(43) int local43 = anInt1934 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt1934;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray256[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIII)V")
	public static void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt1934) {
			arg2 = anInt1934;
		}
		if (arg3 > anInt1933) {
			arg3 = anInt1933;
		}
		anInt1935 = arg0;
		anInt1936 = arg1;
		anInt1937 = arg2;
		anInt1932 = arg3;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(IIIII)V")
	private static void method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt1935 || arg0 >= anInt1937) {
			return;
		}
		if (arg1 < anInt1936) {
			arg2 -= anInt1936 - arg1;
			arg1 = anInt1936;
		}
		if (arg1 + arg2 > anInt1932) {
			arg2 = anInt1932 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt1934;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray256[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray256[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray256[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray256[local58] = local111;
			local58 += anInt1934;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "([I)V")
	public static void method1319(@OriginalArg(0) int[] arg0) {
		anInt1935 = arg0[0];
		anInt1936 = arg0[1];
		anInt1937 = arg0[2];
		anInt1932 = arg0[3];
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	public static void method1320() {
		anIntArray256 = null;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	public static void method1321() {
		anInt1935 = 0;
		anInt1936 = 0;
		anInt1937 = anInt1934;
		anInt1932 = anInt1933;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IIII)V")
	public static void method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt1936 || arg1 >= anInt1932) {
			return;
		}
		if (arg0 < anInt1935) {
			arg2 -= anInt1935 - arg0;
			arg0 = anInt1935;
		}
		if (arg0 + arg2 > anInt1937) {
			arg2 = anInt1937 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt1934;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray256[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIIII)V")
	public static void method1323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt1935) {
			arg2 -= anInt1935 - arg0;
			arg0 = anInt1935;
		}
		if (arg1 < anInt1936) {
			arg3 -= anInt1936 - arg1;
			arg1 = anInt1936;
		}
		if (arg0 + arg2 > anInt1937) {
			arg2 = anInt1937 - arg0;
		}
		if (arg1 + arg3 > anInt1932) {
			arg3 = anInt1932 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt1934 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt1934;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray256[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray256[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray256[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray256[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(IIIII)V")
	public static void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1322(arg0, arg1, arg2, arg4);
		method1322(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1311(arg0, arg1, arg3, arg4);
		method1311(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IIIIII)V")
	public static void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1310(arg0, arg1, arg2, arg4, arg5);
		method1310(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1318(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1318(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}
}
