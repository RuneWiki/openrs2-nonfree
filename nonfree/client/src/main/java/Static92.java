import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!fh;")
	public static Class58 aClass58_44;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 aClass4_Sub3_Sub14_Sub1_2;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Z")
	public static boolean aBoolean124;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Drop";

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public static void method1576() {
		for (@Pc(7) int local7 = -1; local7 < Static129.anInt2510; local7++) {
			@Pc(20) int local20;
			if (local7 == -1) {
				local20 = 2047;
			} else {
				local20 = Static172.anIntArray317[local7];
			}
			@Pc(30) Class53_Sub1_Sub1 local30 = Static182.aClass53_Sub1_Sub1Array1[local20];
			if (local30 != null) {
				Static81.method1428(local30.method3324(), local30);
			}
		}
	}
}
