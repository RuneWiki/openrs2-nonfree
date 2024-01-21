import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 aClass4_Sub4_Sub3_Sub1_5;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt2076;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public static int anInt2077;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array8 = new Class4_Sub4_Sub3_Sub2[1000];

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_852 = Static121.method2047("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!qc;")
	private static Class60 aClass60_853 = Static121.method2047("scroll:");

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_854 = aClass60_853;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_855 = aClass60_853;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_856 = Static121.method2047("::noclip");

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_857 = Static121.method2047("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1524() {
		aClass60_856 = null;
		anIntArrayArray19 = null;
		aClass60_852 = null;
		aClass4_Sub4_Sub3_Sub2Array8 = null;
		aClass60_853 = null;
		aClass60_855 = null;
		aClass60_857 = null;
		aClass60_854 = null;
		aClass4_Sub4_Sub3_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)Lclient!gb;")
	public static Class4_Sub4_Sub4 method1525(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub4 local10 = (Class4_Sub4_Sub4) Static99.aClass48_55.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static92.aClass40_65.method1110(arg0, 14);
		local10 = new Class4_Sub4_Sub4();
		if (local25 != null) {
			local10.method697(new Class4_Sub13(local25));
		}
		Static99.aClass48_55.method1392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZBLclient!lc;Lclient!qf;Lclient!lc;)V")
	public static void method1526(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class4_Sub4_Sub3_Sub4 arg2, @OriginalArg(4) Class40 arg3) {
		Static104.aClass40_76 = arg1;
		Static60.aBoolean107 = arg0;
		Static94.aClass40_67 = arg3;
		Static104.aClass40_76.method1114(10);
		Static105.aClass4_Sub4_Sub3_Sub4_6 = arg2;
	}
}
