import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public static int anInt1915;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_546 = Static231.method3737("k");

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
	public static int[] anIntArray198 = new int[2000];

	@OriginalMember(owner = "client!i", name = "k", descriptor = "[Lclient!gf;")
	public static Class43[] aClass43Array1 = new Class43[50];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BZ)V")
	public static void method1497(@OriginalArg(1) boolean arg0) {
		if (Static137.aClass82_2 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub26 local16 = new Class1_Sub26(4);
			local16.method2967(arg0 ? 2 : 3);
			local16.method2976(0);
			Static137.aClass82_2.method2399(4, local16.aByteArray52);
		} catch (@Pc(37) IOException local37) {
			try {
				Static137.aClass82_2.method2395();
			} catch (@Pc(42) Exception local42) {
			}
			Static137.aClass82_2 = null;
			Static171.anInt3714++;
		}
	}
}
