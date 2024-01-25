import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Z")
	public static boolean aBoolean128;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "Lclient!lm;")
	public static Class134 aClass134_41;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
	public static int anInt1786 = 0;

	@OriginalMember(owner = "client!fs", name = "J", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIZLclient!ui;)V")
	public static void method1468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub43 arg4) {
		if (arg4.anInt6222 == -1 && arg4.anIntArray625 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(27) int local27 = Static142.anInt2788 * arg4.anInt6220 >> 8;
		if (arg4.anInt6221 < arg0) {
			local16 = arg0 - arg4.anInt6221;
		} else if (arg0 < arg4.anInt6217) {
			local16 = arg4.anInt6217 - arg0;
		}
		if (arg4.anInt6229 < arg2) {
			local16 += arg2 - arg4.anInt6229;
		} else if (arg4.anInt6234 > arg2) {
			local16 += arg4.anInt6234 - arg2;
		}
		if (arg4.anInt6228 == 0 || arg4.anInt6228 < local16 - 64 || Static142.anInt2788 == 0 || arg4.anInt6225 != arg1) {
			if (arg4.aClass1_Sub31_Sub1_3 != null) {
				Static142.aClass1_Sub31_Sub2_1.method4444(arg4.aClass1_Sub31_Sub1_3);
				arg4.aClass1_Sub31_Sub1_3 = null;
			}
			if (arg4.aClass1_Sub31_Sub1_2 != null) {
				Static142.aClass1_Sub31_Sub2_1.method4444(arg4.aClass1_Sub31_Sub1_2);
				arg4.aClass1_Sub31_Sub1_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(150) int local150 = local27 * (arg4.anInt6228 - local16) / arg4.anInt6228;
		if (arg4.aClass1_Sub31_Sub1_3 != null) {
			arg4.aClass1_Sub31_Sub1_3.method3896(local150);
		} else if (arg4.anInt6222 >= 0) {
			@Pc(171) Class110 local171 = Static362.method2217(Static330.aClass134_144, arg4.anInt6222, 0);
			if (local171 != null) {
				@Pc(178) Class1_Sub20_Sub1 local178 = local171.method2216().method2073(Static49.aClass194_3);
				@Pc(183) Class1_Sub31_Sub1 local183 = Static366.method3889(local178, local150);
				local183.method3919(-1);
				Static142.aClass1_Sub31_Sub2_1.method4448(local183);
				arg4.aClass1_Sub31_Sub1_3 = local183;
			}
		}
		if (arg4.aClass1_Sub31_Sub1_2 != null) {
			arg4.aClass1_Sub31_Sub1_2.method3896(local150);
			if (!arg4.aClass1_Sub31_Sub1_2.method5797()) {
				arg4.aClass1_Sub31_Sub1_2 = null;
			}
		} else if (arg4.anIntArray625 != null && (arg4.anInt6227 -= arg3) <= 0) {
			@Pc(227) int local227 = (int) ((double) arg4.anIntArray625.length * Math.random());
			@Pc(235) Class110 local235 = Static362.method2217(Static330.aClass134_144, arg4.anIntArray625[local227], 0);
			if (local235 != null) {
				@Pc(242) Class1_Sub20_Sub1 local242 = local235.method2216().method2073(Static49.aClass194_3);
				@Pc(247) Class1_Sub31_Sub1 local247 = Static366.method3889(local242, local150);
				local247.method3919(0);
				Static142.aClass1_Sub31_Sub2_1.method4448(local247);
				arg4.aClass1_Sub31_Sub1_2 = local247;
				arg4.anInt6227 = (int) ((double) (arg4.anInt6231 - arg4.anInt6218) * Math.random()) + arg4.anInt6218;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZLclient!n;)I")
	public static int method1470(@OriginalArg(1) Class10_Sub1_Sub2_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt4097;
		@Pc(17) Class118 local17 = arg0.method3408();
		if (arg0.aBoolean307) {
			local13 = arg0.anInt4118;
		} else if (arg0.anInt4034 == local17.anInt2967 || local17.anInt2970 == arg0.anInt4034 || arg0.anInt4034 == local17.anInt2969 || local17.anInt2968 == arg0.anInt4034) {
			local13 = arg0.anInt4112;
		} else if (local17.anInt2974 == arg0.anInt4034 || local17.anInt2984 == arg0.anInt4034 || local17.anInt2991 == arg0.anInt4034 || local17.anInt2957 == arg0.anInt4034) {
			local13 = arg0.anInt4092;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)I")
	public static int method1477() {
		@Pc(13) Class37 local13 = Static50.aClass37_24;
		synchronized (Static50.aClass37_24) {
			return Static50.aClass37_24.method921();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!mp;IIIII)V")
	public static void method1480(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6107 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub19_Sub1Array5[local4] != null) {
				arg0.anInt6107++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6107; local22++) {
			@Pc(31) int local31 = Static87.anIntArrayArrayArray4[arg1][arg2][arg3];
			@Pc(40) Class1_Sub19_Sub1 local40;
			while (local31 != 0) {
				local40 = Static174.aClass1_Sub19_Sub1Array4[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub19_Sub1Array5[local22]) {
					continue label51;
				}
			}
			local31 = Static87.anIntArrayArrayArray4[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static174.aClass1_Sub19_Sub1Array4[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub19_Sub1Array5[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt6107 - 1; local85++) {
				arg0.aClass1_Sub19_Sub1Array5[local85] = arg0.aClass1_Sub19_Sub1Array5[local85 + 1];
			}
			arg0.anInt6107--;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(ILclient!ii;)V")
	public static void method1481(@OriginalArg(1) Class105 arg0) {
		if (Static206.anInt4322 != Static127.anInt2487 && (Static347.aClass83ArrayArrayArray3 != null && Static111.method1799(Static127.anInt2487, arg0))) {
			Static206.anInt4322 = Static127.anInt2487;
		}
	}
}
