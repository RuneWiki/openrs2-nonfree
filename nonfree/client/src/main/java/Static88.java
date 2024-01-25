import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
	public static int anInt1743;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
	public static int anInt1744;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
	public static int anInt1753;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
	public static int anInt1751 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z[BZIIIILclient!jaa;)Lclient!hq;")
	public static Class51_Sub1_Sub1 method1672(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class14_Sub3 arg3) {
		if (arg3.aBoolean311 || Static404.method5927(arg1) && Static404.method5927(arg2)) {
			return new Class51_Sub1_Sub1(arg3, 3553, 6406, arg1, arg2, false, arg0, 6406);
		} else if (arg3.aBoolean299) {
			return new Class51_Sub1_Sub1(arg3, 34037, 6406, arg1, arg2, false, arg0, 6406);
		} else {
			return new Class51_Sub1_Sub1(arg3, 6406, arg1, arg2, Static253.method4296(arg1), Static253.method4296(arg2), arg0, 6406);
		}
	}
}
