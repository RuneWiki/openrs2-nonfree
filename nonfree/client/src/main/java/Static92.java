import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_9;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!ii;")
	public static Class47 aClass47_9;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[[[Lclient!pf;")
	public static Class2_Sub18[][][] aClass2_Sub18ArrayArrayArray1;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_9 = new Class53(64);

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_727 = Static151.method2243("Loading interfaces )2 ");

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!mb;")
	public static Class62 aClass62_726 = aClass62_727;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!lc;")
	public static final Class58 aClass58_10 = new Class58(4096);

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array65 = new Class62[1000];

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_728 = Static151.method2243("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	public static int anInt2047 = -1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Z")
	public static boolean method1393(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static26.aShortArray134[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1003;
	}
}
