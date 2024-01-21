import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_20;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1216 = Static151.method2243("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array104 = new Class62[100];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(J[III)Lclient!mb;")
	public static Class62 method2379(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			@Pc(11) Class2_Sub1_Sub8 local11 = Static186.method2680(arg1[0]);
			return local11.method746((int) arg0);
		} else if (arg2 == 1) {
			@Pc(25) Class2_Sub1_Sub26 local25 = Static52.method774((int) arg0);
			return local25.aClass62_1540;
		} else if (arg2 == 5) {
			return Static149.method2218(arg0).method1876();
		} else if (arg2 == 6) {
			return Static186.method2680(arg1[0]).method746((int) arg0);
		} else {
			return Static39.method3121(arg0);
		}
	}
}
