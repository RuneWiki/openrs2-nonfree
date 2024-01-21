import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!l", name = "z", descriptor = "I")
	public static volatile int anInt2462 = -1;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_896 = Static177.method3050("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!l", name = "jb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_898 = Static177.method3050("Your account has been disabled)3");

	@OriginalMember(owner = "client!l", name = "W", descriptor = "Lclient!jd;")
	public static Class46 aClass46_897 = aClass46_898;

	@OriginalMember(owner = "client!l", name = "ab", descriptor = "[Lclient!nd;")
	public static final Class4_Sub1_Sub1_Sub1_Sub2[] aClass4_Sub1_Sub1_Sub1_Sub2Array1 = new Class4_Sub1_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!l", name = "rb", descriptor = "I")
	public static int anInt2492 = -1;

	@OriginalMember(owner = "client!l", name = "wb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_899 = Static177.method3050("Loading config )2 ");

	@OriginalMember(owner = "client!l", name = "zb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_900 = aClass46_899;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	public static void method1881() {
		if (Static110.aClass27_5 != null) {
			Static110.aClass27_5.method952();
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
	public static void method1889() {
		if (Static49.anIntArray123 != null && Static22.anIntArray59 != null) {
			return;
		}
		Static49.anIntArray123 = new int[256];
		Static22.anIntArray59 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static49.anIntArray123[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static22.anIntArray59[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}
}
