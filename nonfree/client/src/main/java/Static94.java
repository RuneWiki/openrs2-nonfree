import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!di", name = "C", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_54 = new Class81(57, 5);

	@OriginalMember(owner = "client!di", name = "G", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_41 = new Class319(46, -1);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z[I[I)V")
	public static void method1794(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static445.aByteArrayArrayArray2 = null;
			Static484.anIntArray540 = null;
			Static193.anIntArray220 = null;
			return;
		}
		Static484.anIntArray540 = arg1;
		Static193.anIntArray220 = new int[arg1.length];
		Static445.aByteArrayArrayArray2 = new byte[arg1.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static484.anIntArray540.length; local32++) {
			Static445.aByteArrayArrayArray2[local32] = new byte[arg0[local32]][];
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method1795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg1 != Static87.anInt1964) {
			Static436.anIntArray506 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static436.anIntArray506[local9] = (local9 << 12) / arg1;
			}
			Static87.anInt1964 = arg1;
			Static451.anInt8721 = arg1 - 1;
			Static500.anInt6889 = arg1 * 32;
		}
		if (arg0 == Static4.anInt81) {
			return;
		}
		if (arg0 == Static87.anInt1964) {
			Static337.anIntArray406 = Static436.anIntArray506;
		} else {
			Static337.anIntArray406 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static337.anIntArray406[local9] = (local9 << 12) / arg0;
			}
		}
		Static4.anInt81 = arg0;
		Static561.anInt6003 = arg0 - 1;
	}
}
