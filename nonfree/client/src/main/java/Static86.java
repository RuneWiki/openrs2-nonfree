import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!ke;")
	public static Class52 aClass52_19;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "[Lclient!jb;")
	public static Class3_Sub13[] aClass3_Sub13Array1;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_897 = Static193.method3027("Die Verbindung konnte");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_898 = Static193.method3027(" has logged in)3");

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_899 = Static193.method3027("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
	public static int anInt1703 = 1;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!oc;")
	public static Class70 aClass70_900 = aClass70_898;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!oc;")
	public static Class70 aClass70_901 = aClass70_899;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	public static int method1231(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
