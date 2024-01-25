import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
	public static int anInt2346 = 16777215;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public static void method2119() {
		@Pc(13) int local13 = (int) ((double) Static460.anInt8640 * 34.46D);
		local13 <<= 0x2;
		if (Static546.aClass15_16.method5327()) {
			local13 += 512;
		}
		Static546.aClass15_16.sa(200, local13);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([IZ[I)V")
	public static void method2121(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static411.anIntArray499 = null;
			Static293.anIntArray368 = null;
			Static135.aByteArrayArrayArray5 = null;
			return;
		}
		Static411.anIntArray499 = arg1;
		Static293.anIntArray368 = new int[arg1.length];
		Static135.aByteArrayArrayArray5 = new byte[arg1.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static411.anIntArray499.length; local33++) {
			Static135.aByteArrayArrayArray5[local33] = new byte[arg0[local33]][];
		}
	}
}
