import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "I")
	public static int anInt2021 = 0;

	@OriginalMember(owner = "client!dba", name = "H", descriptor = "Lclient!ti;")
	public static final Class339 aClass339_3 = new Class339();

	@OriginalMember(owner = "client!dba", name = "J", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIZII)V")
	public static void method1715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static220.method3432(arg1)) {
			Static138.method2198(Static559.aClass230ArrayArray2[arg1], arg3, -1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V")
	public static void method1716(@OriginalArg(0) int arg0) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg0, 4);
		local14.method2822();
	}
}
