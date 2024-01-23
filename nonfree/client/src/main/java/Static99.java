import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_287 = Static231.method3737("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lclient!we;")
	public static Class126[] aClass126Array2 = new Class126[500];

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_288 = Static231.method3737("Mitglieder)2Welt");

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	public static int anInt904 = 2301979;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	public static int anInt915 = 0;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	public static int anInt922 = -1;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "[S")
	public static short[] aShortArray15 = new short[256];

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
	public static int anInt929 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass97_1 != null && local7.aClass97_1.aLong136 == arg3) {
			return true;
		} else if (local7.aClass46_1 != null && local7.aClass46_1.aLong57 == arg3) {
			return true;
		} else if (local7.aClass40_1 != null && local7.aClass40_1.aLong49 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1416; local46++) {
				if (local7.aClass99Array2[local46].aLong140 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(II)Z")
	public static boolean method840(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(II)I")
	public static int method845(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static80.method1381(arg0);
	}
}
