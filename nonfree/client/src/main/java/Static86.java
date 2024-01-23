import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!kh;")
	private static Class60 aClass60_658 = Static200.method3116("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public static int anInt1998 = 2;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_659 = aClass60_658;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_660 = Static200.method3116("");

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
	public static int anInt2000 = 0;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!kh;")
	private static Class60 aClass60_661 = Static200.method3116(" is already on your ignore list)3");

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Lclient!kh;")
	public static Class60 aClass60_662 = aClass60_661;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method1487() {
		@Pc(12) Class42 local12 = Static85.aClass42_1;
		synchronized (Static85.aClass42_1) {
			Static115.anInt2624++;
			Static141.anInt3165 = Static82.anInt1945;
			@Pc(24) int local24;
			if (Static214.anInt4567 < 0) {
				for (local24 = 0; local24 < 112; local24++) {
					Static49.aBooleanArray5[local24] = false;
				}
				Static214.anInt4567 = Static84.anInt1464;
			} else {
				while (Static214.anInt4567 != Static84.anInt1464) {
					local24 = Static11.anIntArray655[Static84.anInt1464];
					Static84.anInt1464 = Static84.anInt1464 + 1 & 0x7F;
					if (local24 < 0) {
						Static49.aBooleanArray5[~local24] = false;
					} else {
						Static49.aBooleanArray5[local24] = true;
					}
				}
			}
			Static82.anInt1945 = Static166.anInt3602;
		}
	}
}
