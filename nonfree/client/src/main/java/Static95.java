import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_10;

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array6;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "[B")
	public static byte[] aByteArray18 = new byte[520];

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Lclient!nb;")
	public static Class57 aClass57_18 = new Class57(200);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
	public static boolean method1570(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method1571() {
		aClass57_18 = null;
		aClass3_Sub2_Sub3_Sub3Array6 = null;
		aByteArray18 = null;
		aClass44_Sub1_10 = null;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Z")
	public static boolean method1573() {
		@Pc(10) Class85 local10 = Static178.aClass85_1;
		synchronized (Static178.aClass85_1) {
			if (Static161.anInt3576 == Static96.anInt2352) {
				return false;
			} else {
				Static2.anInt25 = Static143.anIntArray376[Static96.anInt2352];
				Static78.anInt2403 = Static49.anIntArray127[Static96.anInt2352];
				Static96.anInt2352 = Static96.anInt2352 + 1 & 0x7F;
				return true;
			}
		}
	}
}
