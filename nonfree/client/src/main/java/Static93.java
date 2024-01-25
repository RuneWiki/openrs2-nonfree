import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_50 = new Class56(48, 12);

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIII)V")
	public static void method1747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static469.anInt4270 && Static325.anInt5516 >= arg2) {
			@Pc(15) int local15 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg0);
			@Pc(21) int local21 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg3);
			Static484.method6595(arg2, local15, local21, arg1);
		}
	}
}
