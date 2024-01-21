import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ld", name = "fb", descriptor = "Z")
	public static boolean aBoolean91;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "Lclient!cd;")
	private static Class10 aClass10_918 = Static51.method932("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	public static int anInt2189 = 0;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "[I")
	public static int[] anIntArray225 = new int[] { 0, 0, 0, 0, 2, 7, 0, 0, 0, 15, 0, 7, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 14, 0, 0, -2, 0, -2, 0, 0, 0, 1, 6, 0, 0, -2, 0, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 4, 0, 0, 0, 0, 0, 8, -1, 6, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 24, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 5, 2, 0, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 6, 0, 12, 11, 1, 3, 0, 0, 0, 6, 0, 0, 3, -2, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 6, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 20, 11, 0, 0, 0, 4, 0, 0, 0, 0, -2, 0, 10, 4, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 10, 0, 0, 0, 0, 1, 4, 0, -1, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 6, 4, 0, 0, -2, 0, 0, -2, 0, 0, 2, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0 };

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_919 = aClass10_918;

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
	public static int anInt2191 = 0;

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_920 = Static51.method932("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ld", name = "eb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_921 = aClass10_920;

	@OriginalMember(owner = "client!ld", name = "gb", descriptor = "I")
	public static int anInt2193 = 2;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method1560(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static168.aBoolean161) {
			try {
				@Pc(25) Class36 local25 = (Class36) Class.forName("Class36_Sub1").getDeclaredConstructor().newInstance();
				local25.method2098(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static168.aBoolean161 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lclient!re;")
	public static Class2_Sub1_Sub15 method1561(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) Static26.aClass72_5.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass29_28.method1030(arg0, 3);
		local10 = new Class2_Sub1_Sub15();
		if (local20 != null) {
			local10.method2195(new Class2_Sub11(local20));
		}
		Static26.aClass72_5.method2254(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
	public static void method1562() {
		aClass10_920 = null;
		aClass10_921 = null;
		anIntArray225 = null;
		aClass10_918 = null;
		aClass10_919 = null;
	}
}
