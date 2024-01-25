import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!dj;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "[S")
	public static final short[] aShortArray25 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_89 = new Class305(80, 16);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZII)V")
	public static void method1899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static141.method2638(false, local35, true);
	}
}
