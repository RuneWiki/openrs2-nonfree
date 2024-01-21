import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt2286;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int anInt2287 = 0;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!od;")
	private static Class60 aClass60_931 = Static41.method597("purple:");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_926 = aClass60_931;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_927 = Static41.method597("m");

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!od;")
	private static Class60 aClass60_928 = Static41.method597("Hidden");

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_929 = aClass60_928;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_930 = aClass60_931;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
	public static final boolean aBoolean84 = false;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "[I")
	public static int[] anIntArray295 = new int[50];

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_932 = Static41.method597("cross");

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray66 = new int[104][104];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ac;I)V")
	public static void method1578(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.aBoolean114 = false;
		if (arg0.aClass4_Sub6_5 != null) {
			arg0.aClass4_Sub6_5.anInt2324 = 0;
		}
		for (@Pc(26) Class4_Sub1 local26 = arg0.method1814(); local26 != null; local26 = arg0.method1811()) {
			method1578(local26);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method1579() {
		aClass60_932 = null;
		aClass60_928 = null;
		aClass60_931 = null;
		aClass60_930 = null;
		aClass60_929 = null;
		anIntArrayArray66 = null;
		aClass60_927 = null;
		aClass60_926 = null;
		anIntArray295 = null;
	}
}
