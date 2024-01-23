import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt2211;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "F")
	public static float aFloat30 = 0.0F;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt2210 = -1;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt2212 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
	public static int method1627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static245.method3801(arg0 - 1, arg1 + -1) + Static245.method3801(arg0 - 1, arg1 - -1) + Static245.method3801(arg0 + 1, arg1 + -1) + Static245.method3801(arg0 + 1, arg1 + 1);
		@Pc(76) int local76 = Static245.method3801(arg0, arg1 - 1) + Static245.method3801(arg0, arg1 + 1) + Static245.method3801(arg0 - 1, arg1) + Static245.method3801(arg0 - -1, arg1);
		@Pc(83) int local83 = Static245.method3801(arg0, arg1);
		return local83 / 4 + local76 / 8 + local44 / 16;
	}
}
