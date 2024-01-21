import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 aClass3_Sub2_Sub3_Sub3_7;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_168 = Static65.method1172("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Lclient!nc;")
	public static Class58 aClass58_2 = new Class58();

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
	public static int anInt674 = -1;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
	public static int anInt676 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method468(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static182.method2924(local13) : local13;
		} else if (arg1 instanceof Class15) {
			@Pc(27) Class15 local27 = (Class15) arg1;
			return local27.method2165();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(Z)V")
	public static void method478() {
		aClass58_2 = null;
		aClass3_Sub2_Sub3_Sub3_7 = null;
		anIntArray48 = null;
		anIntArray47 = null;
		aClass46_168 = null;
	}
}
