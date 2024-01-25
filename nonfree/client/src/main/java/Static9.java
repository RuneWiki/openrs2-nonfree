import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "Lclient!le;")
	public static Class202 aClass202_1;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_1 = new Class130(72, 8);

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
	public static int anInt584 = 1;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)Z")
	public static boolean method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static335.method5468(arg1, arg0) & (Static395.method6381(arg0, arg1) | (arg1 & 0x2000) != 0 | Static548.method7971(arg1, arg0));
	}
}
