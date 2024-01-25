import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "Lclient!sga;")
	public static Class297 aClass297_1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static449.method7006(arg0, arg1) | (arg1 & 0x800) != 0 || Static141.method2863(arg0, arg1);
	}
}
