import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!u", name = "Bb", descriptor = "I")
	public static int anInt2237;

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
	public static int anInt2226 = 0;

	@OriginalMember(owner = "client!u", name = "sb", descriptor = "Lclient!o;")
	private static Class40 aClass40_644 = Static13.method257("Drop");

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_642 = aClass40_644;

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "Lclient!eb;")
	public static Class2_Sub3 aClass2_Sub3_4 = new Class2_Sub3(new byte[5000]);

	@OriginalMember(owner = "client!u", name = "pb", descriptor = "Lclient!o;")
	public static Class40 aClass40_643 = Static13.method257("scrollbar");

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "J")
	public static long aLong132 = 0L;

	@OriginalMember(owner = "client!u", name = "zb", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array9 = new Class2_Sub2_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!u", name = "Db", descriptor = "Lclient!o;")
	public static Class40 aClass40_645 = Static13.method257("Login limit exceeded)3");

	@OriginalMember(owner = "client!u", name = "Eb", descriptor = "Lclient!o;")
	public static Class40 aClass40_646 = Static13.method257("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!u", name = "Fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_647 = Static13.method257("mapedge");

	@OriginalMember(owner = "client!u", name = "Gb", descriptor = "I")
	public static int anInt2239 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZLclient!ud;Lclient!ud;)V")
	public static void method1518(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		Static23.aClass5_8 = arg1;
		Static73.aClass5_23 = arg2;
		Static37.aBoolean65 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V")
	public static void method1520() {
		aClass40_647 = null;
		aClass2_Sub3_4 = null;
		aClass40_643 = null;
		aClass40_642 = null;
		aClass40_644 = null;
		aClass40_646 = null;
		aClass40_645 = null;
		aClass2_Sub2_Sub2_Sub4Array9 = null;
	}
}
