import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!em", name = "K", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array5;

	@OriginalMember(owner = "client!em", name = "T", descriptor = "[Lclient!ya;")
	public static Class157[] aClass157Array1;

	@OriginalMember(owner = "client!em", name = "P", descriptor = "Lclient!qh;")
	public static Class199 aClass199_54 = new Class199(8);

	@OriginalMember(owner = "client!em", name = "Q", descriptor = "[I")
	public static final int[] anIntArray119 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!em", name = "R", descriptor = "[Lclient!jv;")
	public static final Class128[] aClass128Array1 = new Class128[128];

	@OriginalMember(owner = "client!em", name = "S", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_52 = new Class12(22, 18);

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(II)I")
	public static int method1484(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
