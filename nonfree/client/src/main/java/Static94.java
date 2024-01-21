import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt2401 = 0;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "[I")
	public static int[] anIntArray385 = new int[100];

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_922 = Static146.method2172("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!sg;")
	private static Class77 aClass77_923 = Static146.method2172("Loading wordpack )2 ");

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "Lclient!sg;")
	public static Class77 aClass77_924 = aClass77_923;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "[I")
	public static int[] anIntArray387 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "[I")
	public static int[] anIntArray388 = new int[128];

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	public static int anInt2407 = 0;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Lclient!sg;")
	public static Class77 aClass77_925 = Static146.method2172("null");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Lclient!gb;")
	public static Class2_Sub2_Sub8 method1687() {
		if (Static66.aClass2_Sub2_Sub8_1 == null) {
			Static66.aClass2_Sub2_Sub8_1 = new Class2_Sub2_Sub8();
		}
		return Static66.aClass2_Sub2_Sub8_1;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method1689() {
		anIntArray386 = null;
		aClass77_924 = null;
		aClass77_923 = null;
		anIntArray388 = null;
		anIntArray385 = null;
		aClass77_922 = null;
		aClass77_925 = null;
		anIntArray387 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZLclient!sg;)V")
	public static void method1691(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class77 arg1) {
		@Pc(16) short[] local16 = new short[16];
		@Pc(20) Class77 local20 = arg1.method2529();
		@Pc(22) int local22 = 0;
		@Pc(64) int local64;
		for (@Pc(24) int local24 = 0; local24 < Static105.anInt2572; local24++) {
			@Pc(30) Class2_Sub2_Sub9 local30 = Static158.method2689(local24);
			if ((!arg0 || local30.aBoolean82) && local30.aClass77_717.method2529().method2514(local20) != -1) {
				if (local22 >= 100) {
					Static70.aShortArray69 = null;
					Static18.anInt616 = -1;
					return;
				}
				if (local22 >= local16.length) {
					@Pc(62) short[] local62 = new short[local16.length * 2];
					for (local64 = 0; local64 < local22; local64++) {
						local62[local64] = local16[local64];
					}
					local16 = local62;
				}
				local16[local22++] = (short) local24;
			}
		}
		Static70.aShortArray69 = local16;
		Static18.anInt616 = local22;
		Static14.anInt475 = 0;
		@Pc(100) int local100 = local22;
		@Pc(105) boolean local105;
		do {
			if (local100 <= 0) {
				return;
			}
			local100--;
			local105 = true;
			for (local64 = 0; local64 < local100; local64++) {
				@Pc(115) Class2_Sub2_Sub9 local115 = Static158.method2689(local16[local64]);
				@Pc(123) Class2_Sub2_Sub9 local123 = Static158.method2689(local16[local64 + 1]);
				if (local115.aClass77_717.method2510(local123.aClass77_717) > 0) {
					local105 = false;
					@Pc(136) short local136 = local16[local64];
					local16[local64] = local16[local64 + 1];
					local16[local64 + 1] = local136;
				}
			}
		} while (!local105);
	}
}
