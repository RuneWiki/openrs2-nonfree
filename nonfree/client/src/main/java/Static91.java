import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public static int anInt1609;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public static int anInt1611;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public static void method1312(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub2_Sub9 local16 = Static72.method1073(4, arg0);
		local16.method3024();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method1313(@OriginalArg(1) Class5_Sub15 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt7013 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5539();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray93.length - arg0.anInt7013 < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method5598();
		if (arg0.aByteArray93.length - arg0.anInt7013 < local43 * 6) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local43; local62++) {
			@Pc(68) int local68 = arg0.method5598();
			@Pc(72) int local72 = arg0.method5603();
			if (local68 < Static174.anIntArray171.length && Static14.aBooleanArray2[local68] && (Static345.aClass68_1.method1480(local68).aChar1 != '1' || local72 >= -1 && local72 <= 1)) {
				Static174.anIntArray171[local68] = local72;
			}
		}
	}
}
