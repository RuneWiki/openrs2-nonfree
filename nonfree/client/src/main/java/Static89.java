import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!c;")
	public static Class1_Sub3_Sub1 aClass1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!of", name = "F", descriptor = "Lclient!uc;")
	public static Class77 aClass77_2;

	@OriginalMember(owner = "client!of", name = "I", descriptor = "I")
	public static int anInt514;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt493 = 0;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array2 = new Class25[100];

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_234 = Static78.method1313("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_235 = Static78.method1313("::noclip");

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!fc;")
	public static Class25 aClass25_236 = null;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "Lclient!fc;")
	public static Class25 aClass25_237 = Static78.method1313("p11_full");

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lclient!fc;")
	public static Class25 method412(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static74.method1214(arg0) : Static126.aClass25_1413;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public static void method415() {
		aClass25_235 = null;
		aClass25Array2 = null;
		aClass25_236 = null;
		aClass1_Sub3_Sub1_2 = null;
		aClass25_237 = null;
		aClass77_2 = null;
		aClass25_234 = null;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
	public static void method423() {
		for (@Pc(6) Class1_Sub4 local6 = (Class1_Sub4) Static71.aClass2_8.method22(); local6 != null; local6 = (Class1_Sub4) Static71.aClass2_8.method23()) {
			if (local6.aClass1_Sub3_Sub3_2 != null) {
				Static33.aClass1_Sub3_Sub2_1.method924(local6.aClass1_Sub3_Sub3_2);
				local6.aClass1_Sub3_Sub3_2 = null;
			}
			if (local6.aClass1_Sub3_Sub3_1 != null) {
				Static33.aClass1_Sub3_Sub2_1.method924(local6.aClass1_Sub3_Sub3_1);
				local6.aClass1_Sub3_Sub3_1 = null;
			}
		}
		Static71.aClass2_8.method19();
	}
}
