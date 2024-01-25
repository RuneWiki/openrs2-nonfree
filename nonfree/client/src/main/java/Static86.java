import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIII)V")
	public static void method1253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) String local37 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local37);
		Static654.method8744(true, local37, false);
	}
}
