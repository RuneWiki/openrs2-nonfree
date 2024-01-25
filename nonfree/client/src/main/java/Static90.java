import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
	public static int anInt1698;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "[Lclient!vs;")
	public static Class367[] aClass367Array1;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_15 = new Class32(64);

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString16 = null;

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_22 = new Class179(70, -1);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method1431(@OriginalArg(1) int arg0) {
		Static189.anInt3263 = arg0;
		@Pc(12) Class32 local12 = Static136.aClass32_86;
		synchronized (Static136.aClass32_86) {
			Static136.aClass32_86.method640();
		}
		local12 = Static256.aClass32_44;
		synchronized (Static256.aClass32_44) {
			Static256.aClass32_44.method640();
		}
	}
}
