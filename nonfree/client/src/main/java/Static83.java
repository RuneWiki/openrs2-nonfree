import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Lclient!uf;")
	public static Class119 aClass119_2;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_520 = Static231.method3737(" <col=ffffff>");

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_521 = Static231.method3737(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!hd;")
	public static Class50 aClass50_12 = new Class50(4096);

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_522 = Static231.method3737("<col=c0ff00>");

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_523 = Static231.method3737("<col=ff3000>");

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
	public static int[] anIntArray180 = new int[25];

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "[J")
	public static long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	public static int anInt1786 = 0;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "Lclient!o;")
	public static Class86 aClass86_5 = null;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!sc;")
	public static Class107 aClass107_524 = Static231.method3737("::fpsoff");

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method1390() {
		Static2.aClass61_5.method1697();
		Static98.aClass61_37.method1697();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public static void method1392() {
		if (Static178.anInt3884 == 30) {
			Static52.method1046(25);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLclient!jb;I)Z")
	public static boolean method1393(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(14) byte[] local14 = arg1.method819(0, arg0);
		if (local14 == null) {
			return false;
		} else {
			Static16.method356(local14);
			return true;
		}
	}
}
