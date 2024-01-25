import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
	public static int anInt7739;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "[I")
	public static final int[] anIntArray464 = new int[2048];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method6670(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < Static463.anInt7895; local24++) {
			if (arg0.equalsIgnoreCase(Static444.aStringArray54[local24])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIBI)I")
	public static int method6672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class5_Sub12.anIntArray543[arg1 * 8192 / arg0] >> 1;
		return (arg3 * local21 >> 16) + (arg2 * (65536 - local21) >> 16);
	}
}
