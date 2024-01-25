import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)Lclient!dj;")
	public static Class49 method1653(@OriginalArg(1) int arg0) {
		@Pc(10) Class49 local10 = (Class49) Static242.aClass44_33.method1353((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static225.aClass100_44.method2520(arg0, 1);
		local10 = new Class49();
		local10.anInt1834 = arg0;
		if (local20 != null) {
			local10.method1416(new Class6_Sub1(local20));
		}
		local10.method1417();
		if (local10.anInt1828 == 2 && Static81.aClass74_10.method1883((long) arg0) == null) {
			Static81.aClass74_10.method1890((long) arg0, new Class6_Sub39(Static310.anInt5421));
			Static276.aClass49Array1[Static310.anInt5421++] = local10;
		}
		Static242.aClass44_33.method1349(local10, (long) arg0);
		return local10;
	}
}
