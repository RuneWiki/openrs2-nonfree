import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[5];

	@OriginalMember(owner = "client!g", name = "F", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1978(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static366.method4202(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lclient!f;")
	public static Class22_Sub5 method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass22_Sub5_2;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public static void method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8;
		if (arg0 > arg1) {
			for (local8 = arg1; local8 < arg0; local8++) {
				Static323.anIntArrayArray55[local8][arg3] = arg2;
			}
		} else {
			for (local8 = arg0; local8 < arg1; local8++) {
				Static323.anIntArrayArray55[local8][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
	public static void method1987(@OriginalArg(1) int arg0) {
		@Pc(1) Class7_Sub1_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class8 local8 = Static136.aClass8Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static174.anInt3604; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static346.anInt6536; local15++) {
						local1 = local8.method4165(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class8 local41 = Static136.aClass8Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4173(local15, local12) - local41.method4173(local15, local12);
									@Pc(67) int local67 = local8.method4173(local15 + 1, local12) - local41.method4173(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4173(local15 + 1, local12 + 1) - local41.method4173(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4173(local15, local12 + 1) - local41.method4173(local15, local12 + 1);
									local41.method4164(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}
}
