import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "Z")
	public static boolean aBoolean120;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	public static int anInt1856 = -2;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_990 = Static122.method531("::gc");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!sd;Lclient!f;ZLclient!sd;II)V")
	public static void method1435(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) Class73 arg2) {
		@Pc(12) int local12 = arg1.method359(arg2);
		@Pc(18) int local18 = arg1.method358(local12, arg0);
		Static69.method1224(local18, arg1, local12, 255);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	public static void method1436() {
		aClass73_990 = null;
	}
}
