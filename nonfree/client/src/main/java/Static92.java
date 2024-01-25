import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	public static int anInt2048 = 104;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public static int anInt2049 = 0;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "[Lclient!lb;")
	public static final Class116[] aClass116Array1 = new Class116[14];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1638(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Lclient!lf;")
	public static Class119 method1640(@OriginalArg(0) int arg0) {
		@Pc(10) Class119 local10 = (Class119) Static147.aClass154_51.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static59.aClass11_25.method288(arg0, 34);
		local10 = new Class119();
		if (local25 != null) {
			local10.method3211(arg0, new Class4_Sub7(local25));
		}
		Static147.aClass154_51.method4221((long) arg0, local10);
		return local10;
	}
}
