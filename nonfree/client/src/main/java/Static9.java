import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	public static int anInt212;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!qs;I[[B)V")
	public static void method178(@OriginalArg(0) Class71_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt6060; local11++) {
			Static442.method5918();
			for (@Pc(17) int local17 = 0; local17 < Static80.anInt6558 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static104.anInt2048 >> 3; local21++) {
					@Pc(31) int local31 = Static16.anIntArrayArrayArray9[local11][local17][local21];
					if (local31 != -1) {
						@Pc(41) int local41 = local31 >> 24 & 0x3;
						if (!arg0.aBoolean488 || local41 == 0) {
							@Pc(55) int local55 = local31 >> 1 & 0x3;
							@Pc(61) int local61 = local31 >> 14 & 0x3FF;
							@Pc(67) int local67 = local31 >> 3 & 0x7FF;
							@Pc(77) int local77 = (local61 / 8 << 8) + local67 / 8;
							for (@Pc(79) int local79 = 0; local79 < Static68.anIntArray59.length; local79++) {
								if (local77 == Static68.anIntArray59[local79] && arg1[local79] != null) {
									arg0.method4806(local41, local11, local17 * 8, (local61 & 0x7) * 8, Static20.aClass181Array2, Static447.aClass121_11, arg1[local79], local21 * 8, local55, (local67 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BC)Z")
	public static boolean method179(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
