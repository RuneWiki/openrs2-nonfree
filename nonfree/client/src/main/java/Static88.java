import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_104 = new Class349(48, 2);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lclient!ij;")
	public static Class179 method6542(@OriginalArg(0) int arg0) {
		@Pc(16) Class179[] local16 = Static129.method1885();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class179 local24 = local16[local18];
			if (arg0 == local24.anInt4220) {
				return local24;
			}
		}
		return null;
	}
}
