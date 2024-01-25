import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dfa", name = "F", descriptor = "[I")
	public static final int[] anIntArray90 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dfa", name = "U", descriptor = "Lclient!qc;")
	public static final Class272 aClass272_1 = new Class272();

	@OriginalMember(owner = "client!dfa", name = "V", descriptor = "I")
	public static int anInt2770 = 0;

	@OriginalMember(owner = "client!dfa", name = "W", descriptor = "I")
	public static int anInt2771 = -1;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2352(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}
}
