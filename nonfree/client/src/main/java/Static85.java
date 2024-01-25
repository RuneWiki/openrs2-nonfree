import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!an;")
	public static Class16 aClass16_17;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_19 = new Class77(25, 8);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!nj;)I")
	public static int method1876(@OriginalArg(1) Class12_Sub8_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method5238(2);
		@Pc(27) int local27;
		if (local15 == 0) {
			local27 = 0;
		} else if (local15 == 1) {
			local27 = arg0.method5238(5);
		} else if (local15 == 2) {
			local27 = arg0.method5238(8);
		} else {
			local27 = arg0.method5238(11);
		}
		return local27;
	}
}
