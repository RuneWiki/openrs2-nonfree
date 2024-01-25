import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	public static int anInt1849;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Lclient!uq;")
	public static Class362 aClass362_21;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	public static int anInt1853;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public static void method1511() {
		@Pc(5) Class295 local5 = Static324.aClass295_30;
		synchronized (Static324.aClass295_30) {
			Static324.aClass295_30.method6464();
		}
		local5 = Static641.aClass295_68;
		synchronized (Static641.aClass295_68) {
			Static641.aClass295_68.method6464();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z")
	public static boolean method1514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
