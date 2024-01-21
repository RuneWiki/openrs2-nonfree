import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array8;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "Lclient!qc;")
	public static Class60 aClass60_958 = Static121.method2047("shad");

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "Lclient!qc;")
	public static Class60 aClass60_959 = Static121.method2047("shad=");

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
	public static int anInt2378 = 0;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "Lclient!qc;")
	public static Class60 aClass60_960 = Static121.method2047(")4shad");

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	public static int anInt2379 = 0;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "Lclient!qc;")
	public static Class60 aClass60_961 = Static121.method2047(")4i");

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "Lclient!qc;")
	public static Class60 aClass60_962 = Static121.method2047("str");

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
	public static int anInt2380 = -1;

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
	public static int anInt2381 = -1;

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_963 = Static121.method2047("b");

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_964 = Static121.method2047("gt");

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "I")
	public static int anInt2383 = 256;

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_965 = Static121.method2047(")4b");

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_966 = Static121.method2047("col=");

	@OriginalMember(owner = "client!qf", name = "jb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_967 = Static121.method2047("lt");

	@OriginalMember(owner = "client!qf", name = "kb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_968 = Static121.method2047("br");

	@OriginalMember(owner = "client!qf", name = "lb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_969 = Static121.method2047("img=");

	@OriginalMember(owner = "client!qf", name = "nb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_970 = Static121.method2047(")4str");

	@OriginalMember(owner = "client!qf", name = "ob", descriptor = "Lclient!qc;")
	public static Class60 aClass60_971 = Static121.method2047(")4u");

	@OriginalMember(owner = "client!qf", name = "pb", descriptor = "I")
	public static int anInt2385 = -1;

	@OriginalMember(owner = "client!qf", name = "rb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_972 = Static121.method2047("u");

	@OriginalMember(owner = "client!qf", name = "sb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_973 = Static121.method2047("str=");

	@OriginalMember(owner = "client!qf", name = "tb", descriptor = "I")
	public static int anInt2386 = -1;

	@OriginalMember(owner = "client!qf", name = "ub", descriptor = "Lclient!qc;")
	public static Class60 aClass60_974 = Static121.method2047(")4col");

	@OriginalMember(owner = "client!qf", name = "wb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_975 = Static121.method2047("u=");

	@OriginalMember(owner = "client!qf", name = "xb", descriptor = "I")
	public static int anInt2388 = 0;

	@OriginalMember(owner = "client!qf", name = "yb", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!qf", name = "zb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_976 = Static121.method2047("i");

	@OriginalMember(owner = "client!qf", name = "Ab", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array22 = new Class60[100];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIIIIII)V")
	public static void method1724(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static80.anInt2377;
		@Pc(9) int local9 = Static80.anInt2377 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static80.anInt2373) {
			local20 = Static80.anInt2373 - arg2;
			arg4 -= local20;
			arg2 = Static80.anInt2373;
			local13 = local20 * arg3;
			local5 += local20 * Static80.anInt2377;
		}
		if (arg2 + arg4 > Static80.anInt2375) {
			arg4 -= arg2 + arg4 - Static80.anInt2375;
		}
		if (arg1 < Static80.anInt2374) {
			local20 = Static80.anInt2374 - arg1;
			arg3 -= local20;
			arg1 = Static80.anInt2374;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static80.anInt2376) {
			local20 = arg1 + arg3 - Static80.anInt2376;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1726(Static80.anIntArray236, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method1726(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method1731(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
	public static void method1735() {
		aClass60_967 = null;
		aClass60_964 = null;
		aClass60_969 = null;
		aClass60_968 = null;
		aClass60_966 = null;
		aClass60_974 = null;
		aClass60_963 = null;
		aClass60_965 = null;
		aClass60_976 = null;
		aClass60_961 = null;
		aClass60_975 = null;
		aClass60_972 = null;
		aClass60_971 = null;
		aClass60_959 = null;
		aClass60_958 = null;
		aClass60_960 = null;
		aClass60_973 = null;
		aClass60_962 = null;
		aClass60_970 = null;
		aClass4_Sub4_Sub3_Sub1Array8 = null;
		aRandom1 = null;
		aClass60Array22 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIIIII)V")
	public static void method1737(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static80.anInt2377;
		@Pc(9) int local9 = Static80.anInt2377 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static80.anInt2373) {
			local20 = Static80.anInt2373 - arg2;
			arg4 -= local20;
			arg2 = Static80.anInt2373;
			local13 = local20 * arg3;
			local5 += local20 * Static80.anInt2377;
		}
		if (arg2 + arg4 > Static80.anInt2375) {
			arg4 -= arg2 + arg4 - Static80.anInt2375;
		}
		if (arg1 < Static80.anInt2374) {
			local20 = Static80.anInt2374 - arg1;
			arg3 -= local20;
			arg1 = Static80.anInt2374;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static80.anInt2376) {
			local20 = arg1 + arg3 - Static80.anInt2376;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1731(Static80.anIntArray236, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!qc;)Lclient!qc;")
	public static Class60 method1747(@OriginalArg(0) Class60 arg0) {
		@Pc(3) int local3 = arg0.method1644();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray89[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class60 local28 = new Class60();
		local28.anInt2310 = local3 + local5;
		local28.aByteArray89 = new byte[local28.anInt2310];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray89[local42];
			if (local48 == 60) {
				local28.aByteArray89[local40++] = 60;
				local28.aByteArray89[local40++] = 108;
				local28.aByteArray89[local40++] = 116;
				local28.aByteArray89[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray89[local40++] = 60;
				local28.aByteArray89[local40++] = 103;
				local28.aByteArray89[local40++] = 116;
				local28.aByteArray89[local40++] = 62;
			} else {
				local28.aByteArray89[local40++] = local48;
			}
		}
		return local28;
	}
}
