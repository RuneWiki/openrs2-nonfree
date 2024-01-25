import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	public static int anInt1896;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public static int anInt1898;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!kr;")
	public static Class171 aClass171_38;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public static final int anInt1901 = 1339;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIBI)Z")
	public static boolean method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Interface18 local20 = (Interface18) Static453.method6441(arg0, arg2, arg1);
		@Pc(22) boolean local22 = true;
		if (local20 != null) {
			local22 = Static237.method4133(local20) & true;
		}
		local20 = (Interface18) Static156.method2467(arg0, arg2, arg1, vaa.class);
		if (local20 != null) {
			local22 &= Static237.method4133(local20);
		}
		local20 = (Interface18) Static117.method1983(arg0, arg2, arg1);
		if (local20 != null) {
			local22 &= Static237.method4133(local20);
		}
		return local22;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
	public static void method1640(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static541.method7520(4, arg0);
		local12.method4945();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZIIII)V")
	public static void method1642(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(14) Class268[] local14 = Static384.aClass268Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class268 local22 = local14[local16];
			if (local22 != null && local22.anInt7597 == 2) {
				Static381.method5836(arg3 >> 1, local22.anInt7598 * 2, local22.anInt7593, local22.anInt7596, arg0 >> 1, local22.anInt7591);
				if (Static393.anIntArray684[0] > -1 && Static436.anInt6850 % 20 < 10) {
					Static374.aClass2Array10[local22.anInt7594].method7364(Static393.anIntArray684[0] + arg2 - 12, arg1 + (Static393.anIntArray684[1] - 28));
				}
			}
		}
	}
}
