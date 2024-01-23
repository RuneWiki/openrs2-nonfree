import org.openrs2.deob.annotation.OriginalMember;

public final class Static99 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!vj;")
	public static Class145 aClass145_5;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString174 = "flash1:";

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	public static int anInt2713 = -1;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public static int anInt2714 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method2088() {
		if (Static39.anInt1086 < 0) {
			Static206.anInt4549 = -1;
			Static39.anInt1086 = 0;
			Static249.anInt5332 = -1;
		}
		if (Static124.anInt3160 < Static39.anInt1086) {
			Static249.anInt5332 = -1;
			Static39.anInt1086 = Static124.anInt3160;
			Static206.anInt4549 = -1;
		}
		if (Static239.anInt5151 < 0) {
			Static206.anInt4549 = -1;
			Static249.anInt5332 = -1;
			Static239.anInt5151 = 0;
		}
		if (Static239.anInt5151 > Static174.anInt3997) {
			Static206.anInt4549 = -1;
			Static239.anInt5151 = Static174.anInt3997;
			Static249.anInt5332 = -1;
		}
	}
}
