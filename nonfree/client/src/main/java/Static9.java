import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!aga", name = "J", descriptor = "Lclient!dga;")
	public static Class6_Sub14 aClass6_Sub14_1;

	@OriginalMember(owner = "client!aga", name = "L", descriptor = "Lclient!pq;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!aga", name = "M", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!aga", name = "H", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_9 = new Class160(68, 2);

	@OriginalMember(owner = "client!aga", name = "K", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_1 = new Class216(9, 17);

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILclient!ba;III)Lclient!vg;")
	public static Class330 method170(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class330(arg1, arg2, arg3, arg0.ZA(), arg0.ha(), arg0.M(), arg0.DA(), arg0.EA(), arg0.LA(), arg0.K());
	}
}
