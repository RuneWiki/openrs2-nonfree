import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array15;

	@OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
	public static int anInt1937;

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "J")
	public static long aLong66;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Lclient!cd;")
	public static Class10 aClass10_845 = Static51.method932("Angreifen");

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "[I")
	public static int[] anIntArray212 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lclient!cd;")
	private static Class10 aClass10_846 = Static51.method932("Prepared sound engine");

	@OriginalMember(owner = "client!ke", name = "bb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_847 = Static51.method932("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_848 = aClass10_846;

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array6 = new Class2_Sub1_Sub4_Sub2[1000];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZIZZ)Lclient!gd;")
	public static Class29_Sub1 method1358(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class83 local1 = null;
		if (Static120.aClass26_3 != null) {
			local1 = new Class83(arg2, Static120.aClass26_3, Static68.aClass26Array1[arg2], 1000000);
		}
		return new Class29_Sub1(local1, Static161.aClass83_4, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	public static void method1363() {
		Static175.aClass72_27.method2261();
		Static53.aClass72_13.method2261();
		Static141.aClass72_23.method2261();
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
	public static void method1364() {
		aClass2_Sub1_Sub4_Sub2Array6 = null;
		anIntArray212 = null;
		aClass2_Sub1_Sub4_Sub3Array15 = null;
		aClass10_846 = null;
		aClass10_848 = null;
		aClass10_847 = null;
		aClass10_845 = null;
	}
}
