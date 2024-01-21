import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public static int anInt2362;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public static int anInt2366;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_852 = Static177.method3050(":duelfriend:");

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public static volatile int anInt2363 = 0;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_853 = Static177.method3050("Loaded input handler");

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt2364 = 10;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!jd;")
	public static Class46 aClass46_854 = aClass46_853;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_856 = Static177.method3050("Please enter your password)3");

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Lclient!jd;")
	public static Class46 aClass46_855 = aClass46_856;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_857 = Static177.method3050("hel");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z")
	public static boolean method1806() {
		@Pc(5) Class88 local5 = Static71.aClass88_1;
		synchronized (Static71.aClass88_1) {
			if (Static19.anInt546 == Static170.anInt3816) {
				return false;
			} else {
				Static31.anInt796 = Static15.anIntArray42[Static170.anInt3816];
				Static108.anInt2665 = Static102.anIntArray241[Static170.anInt3816];
				Static170.anInt3816 = Static170.anInt3816 + 1 & 0x7F;
				return true;
			}
		}
	}
}
