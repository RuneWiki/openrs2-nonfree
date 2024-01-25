import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[8];

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[32];

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(IZ)Lclient!cv;")
	public static Class12_Sub4 method1612(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static606.anInt10225 == Static213.anInt4036) {
			return new Class12_Sub4(arg0, arg1);
		} else {
			@Pc(6) Class12_Sub4 local6 = Static128.aClass12_Sub4Array1[Static213.anInt4036];
			Static213.anInt4036 = Static213.anInt4036 + 1 & Static158.anIntArray254[Class12_Sub2_Sub3_Sub1.lb];
			local6.method1610(arg0, arg1);
			return local6;
		}
	}
}
