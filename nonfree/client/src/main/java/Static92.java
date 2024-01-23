import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static92 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!od;")
	public static Class4_Sub2_Sub15 aClass4_Sub2_Sub15_1;

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
	public static int anInt1912;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "Lclient!ue;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public static int anInt1908 = 0;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
	public static int[] anIntArray204 = new int[64];

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "[I")
	public static int[] anIntArray205 = new int[50];

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	public static int anInt1911 = -1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!lc;Lclient!lc;I)V")
	public static void method1488(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1) {
		Static53.aClass98_33 = arg1;
		Static49.aClass98_31 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IJ)V")
	public static void method1489(@OriginalArg(1) long arg0) {
		Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
		Static142.aClass4_Sub17_Sub1_3.method1861(21);
		Static142.aClass4_Sub17_Sub1_3.method1891(arg0);
		Static171.anInt3391 = -3;
		Static81.anInt4026 = 1;
		Static101.anInt4751 = 0;
		Static227.anInt3978 = 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method1490() {
		aClass4_Sub2_Sub15_1 = null;
		aClass3_1 = null;
		aStringArray15 = null;
		anIntArray205 = null;
		anIntArray204 = null;
	}
}
