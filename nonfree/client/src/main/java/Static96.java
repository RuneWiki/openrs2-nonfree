import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dca", name = "j", descriptor = "Lclient!fs;")
	public static Class6_Sub22 aClass6_Sub22_7;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "Lclient!o;")
	public static final Class246 aClass246_10 = new Class246(14, 0, 4, 1);

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
	public static int anInt1738 = 0;

	@OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
	public static int anInt1740 = -1;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method1571(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static486.method7062(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static486.method7062(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(66) byte[] local66 = new byte[local26];
		Static298.method4275(local66, 0, arg0);
		return local66;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Lclient!nd;")
	public static Class235_Sub1 method1572() {
		return Static668.aClass235_Sub1Array2.length > Static450.anInt10325 ? Static668.aClass235_Sub1Array2[Static450.anInt10325++] : null;
	}
}
