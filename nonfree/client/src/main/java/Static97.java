import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 aClass4_Sub3_Sub6_Sub3_4;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "[Lclient!de;")
	public static Class4_Sub4[] aClass4_Sub4Array1;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 aClass4_Sub3_Sub6_Sub2_4;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!ud;")
	public static Class75 aClass75_13 = new Class75(4096);

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public static int anInt2278 = 0;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public static int anInt2283 = 10;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_920 = Static41.method597("welle:");

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_921 = Static41.method597("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_922 = Static41.method597(" (X");

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	public static int anInt2284 = 0;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_923 = Static41.method597("scrollen:");

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!od;")
	private static Class60 aClass60_924 = Static41.method597("Loading fonts )2 ");

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_925 = aClass60_924;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public static void method1574(@OriginalArg(1) int arg0) {
		if (!Static118.method1894(arg0)) {
			return;
		}
		@Pc(22) Class4_Sub14[] local22 = Static82.aClass4_Sub14ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class4_Sub14 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt2434 = 0;
				local30.anInt2424 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!c;IIB)[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] method1575(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static110.method1825(arg2, arg1, arg0) ? Static115.method1867() : null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBII)V")
	public static void method1576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static132.anInt2950; local7++) {
			if (Static102.anIntArray309[local7] + Static107.anIntArray324[local7] > arg3 && arg3 + arg2 > Static102.anIntArray309[local7] && Static68.anIntArray193[local7] + Static78.anIntArray219[local7] > arg0 && arg1 + arg0 > Static78.anIntArray219[local7]) {
				Static105.aBooleanArray15[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	public static void method1577() {
		anIntArray294 = null;
		aClass60_924 = null;
		aClass4_Sub3_Sub6_Sub2_4 = null;
		aClass60_923 = null;
		aClass4_Sub3_Sub6_Sub3_4 = null;
		aClass60_921 = null;
		aClass60_920 = null;
		aClass75_13 = null;
		aClass4_Sub4Array1 = null;
		aClass60_925 = null;
		aClass60_922 = null;
	}
}
