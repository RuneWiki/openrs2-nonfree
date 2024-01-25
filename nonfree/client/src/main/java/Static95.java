import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[BZLclient!gi;BIII)Lclient!es;")
	public static Class79_Sub2_Sub1 method2003(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class42_Sub3 arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3) {
		if (arg1.aBoolean288 || Static78.method1703(arg2) && Static78.method1703(arg3)) {
			return new Class79_Sub2_Sub1(arg1, 3553, 6406, arg2, arg3, false, arg0, 6406);
		} else if (arg1.aBoolean291) {
			return new Class79_Sub2_Sub1(arg1, 34037, 6406, arg2, arg3, false, arg0, 6406);
		} else {
			return new Class79_Sub2_Sub1(arg1, 6406, arg2, arg3, Static37.method6277(arg2), Static37.method6277(arg3), arg0, 6406);
		}
	}
}
