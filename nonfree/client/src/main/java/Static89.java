import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static89 {

	@OriginalMember(owner = "client!dga", name = "P", descriptor = "I")
	public static int anInt2254;

	@OriginalMember(owner = "client!dga", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6;

	@OriginalMember(owner = "client!dga", name = "G", descriptor = "Lclient!cda;")
	public static final Class3_Sub7_Sub1 aClass3_Sub7_Sub1_2 = new Class3_Sub7_Sub1(7500);

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(I)V")
	public static void method2056() {
		Static562.aClass211_63.method5537();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)V")
	public static void method2058() {
		Static155.aClass211_17.method5535();
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(BII)Z")
	public static boolean method2060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
