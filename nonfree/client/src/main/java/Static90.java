import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "[S")
	public static short[] aShortArray12;

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
	public static int anInt1950;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "[Lclient!oc;")
	public static Class70[] aClass70Array1;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
	public static int anInt1945 = 0;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "[S")
	public static final short[] aShortArray13 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_848 = Static187.method3089("<col=ffff00>*V");

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_851 = Static187.method3089("Your account has been disabled)3");

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_849 = aClass92_851;

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_850 = Static187.method3089("<img=1>");

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)Z")
	public static boolean method1342() {
		@Pc(10) Class89 local10 = Static159.aClass89_1;
		synchronized (Static159.aClass89_1) {
			if (Static127.anInt2652 == Static195.anInt4221) {
				return false;
			} else {
				Static190.anInt4139 = Static200.anIntArray355[Static127.anInt2652];
				Static18.anInt493 = Static6.anIntArray15[Static127.anInt2652];
				Static127.anInt2652 = Static127.anInt2652 + 1 & 0x7F;
				return true;
			}
		}
	}
}
