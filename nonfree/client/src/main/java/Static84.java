import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Z")
	public static boolean aBoolean59;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
	public static int anInt820;

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
	public static int anInt827;

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
	private static int anInt833;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	public static int anInt805 = 0;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "[I")
	public static int[] anIntArray53 = new int[1000];

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "[Lclient!bd;")
	public static Class15[] aClass15Array2 = new Class15[14];

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
	public static int anInt825 = 0;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method683() {
		if (Static111.aClass36_Sub3_Sub2_1 != null && Static111.aClass36_Sub3_Sub2_1.anInt5093 + 64 - Static111.aClass36_Sub3_Sub2_1.method4097() * 64 >> 7 == Static197.anInt4129 && Static111.aClass36_Sub3_Sub2_1.anInt5109 - (Static111.aClass36_Sub3_Sub2_1.method4097() - 1) * 64 >> 7 == Static110.anInt2372) {
			Static197.anInt4129 = 0;
		}
		@Pc(51) int local51;
		for (local51 = 0; local51 < 104; local51++) {
			for (@Pc(58) int local58 = 0; local58 < 104; local58++) {
				Static156.anIntArrayArray49[local51][local58] = 0;
			}
		}
		for (local51 = 0; local51 < Static68.anInt1507; local51++) {
			@Pc(84) Class36_Sub3_Sub2 local84 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local51]];
			if (local84 != null) {
				local84.aBoolean425 = false;
			}
		}
		for (local51 = 0; local51 < Static71.anInt1550; local51++) {
			@Pc(109) Class36_Sub3_Sub1 local109 = Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local51]];
			if (local109 != null) {
				local109.aBoolean425 = false;
			}
		}
	}
}
