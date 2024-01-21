import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[[Lclient!m;")
	public static Class3_Sub3_Sub6[][] aClass3_Sub3_Sub6ArrayArray5;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!hb;")
	public static Class27 aClass27_839 = Static87.method1648("Versteckt");

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!hb;")
	private static Class27 aClass27_840 = Static87.method1648("Connecting to update server");

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!hb;")
	public static Class27 aClass27_841 = aClass27_840;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public static int anInt1720 = 0;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_842 = Static87.method1648("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "[J")
	public static long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[I")
	public static int[] anIntArray299 = new int[4000];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method1227() {
		aLongArray9 = null;
		aClass3_Sub3_Sub2_Sub2Array9 = null;
		aClass27_842 = null;
		aClass27_840 = null;
		aClass27_841 = null;
		aClass3_Sub3_Sub6ArrayArray5 = null;
		aClass27_839 = null;
		anIntArray299 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
	public static boolean method1229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(10) Class3_Sub3_Sub4 local10 = Static108.method1902(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local10.method983(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void method1232() {
		Static54.anIntArray239 = null;
		Static36.anIntArray160 = null;
		Static54.anIntArray238 = null;
		Static98.anIntArray378 = null;
		Static72.aByteArrayArray10 = null;
		Static72.anIntArray316 = null;
	}
}
