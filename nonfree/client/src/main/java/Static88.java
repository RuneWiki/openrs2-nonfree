import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	public static int anInt1938;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
	public static int anInt1933 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
	public static int method1799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([I[II)V")
	public static void method1800(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static418.aByteArrayArrayArray15 = null;
			Static339.anIntArray393 = null;
			Static552.anIntArray582 = null;
			return;
		}
		Static339.anIntArray393 = arg0;
		Static552.anIntArray582 = new int[arg0.length];
		Static418.aByteArrayArrayArray15 = new byte[arg0.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static339.anIntArray393.length; local28++) {
			Static418.aByteArrayArrayArray15[local28] = new byte[arg1[local28]][];
		}
	}
}
