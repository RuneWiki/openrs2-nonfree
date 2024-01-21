import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array6 = new Class5_Sub2_Sub1_Sub4[1000];

	@OriginalMember(owner = "client!od", name = "L", descriptor = "Lclient!r;")
	private static Class61 aClass61_698 = Static129.method2060("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!od", name = "H", descriptor = "Lclient!r;")
	public static Class61 aClass61_697 = aClass61_698;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "Lclient!r;")
	public static Class61 aClass61_699 = Static129.method2060("scape main");

	@OriginalMember(owner = "client!od", name = "S", descriptor = "Lclient!pa;")
	public static Class5_Sub14 aClass5_Sub14_5 = new Class5_Sub14(new byte[5000]);

	@OriginalMember(owner = "client!od", name = "V", descriptor = "I")
	public static int anInt2397 = 0;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!r;")
	public static Class61 aClass61_700 = Static129.method2060("<col=ff7000>");

	@OriginalMember(owner = "client!od", name = "db", descriptor = "Lclient!r;")
	private static Class61 aClass61_701 = Static129.method2060("Close");

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
	public static int anInt2402 = 0;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "Lclient!r;")
	public static Class61 aClass61_702 = aClass61_701;

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_703 = Static129.method2060("::");

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "Lclient!r;")
	public static Class61 aClass61_704 = Static129.method2060(")2");

	@OriginalMember(owner = "client!od", name = "ib", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_9 = null;

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "Lclient!r;")
	private static Class61 aClass61_707 = Static129.method2060("K");

	@OriginalMember(owner = "client!od", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_705 = aClass61_707;

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "Lclient!r;")
	public static Class61 aClass61_706 = aClass61_707;

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "Z")
	public static final boolean aBoolean83 = false;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method1579() {
		aClass61_701 = null;
		aClass5_Sub11_9 = null;
		aClass61_703 = null;
		aClass61_706 = null;
		aClass61_699 = null;
		aClass5_Sub14_5 = null;
		aClass61_705 = null;
		aClass61_700 = null;
		aClass61_707 = null;
		aClass5_Sub2_Sub1_Sub4Array6 = null;
		aClass61_704 = null;
		aClass61_698 = null;
		aClass61_702 = null;
		aClass61_697 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI)V")
	public static void method1580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class5_Sub2_Sub6 local7 = Static68.method1131(arg1);
		@Pc(10) int local10 = local7.anInt1101;
		@Pc(13) int local13 = local7.anInt1104;
		@Pc(16) int local16 = local7.anInt1109;
		@Pc(23) int local23 = Class44.anIntArray250[local16 - local13];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static83.anIntArray289[local10] = ~local23 & Static83.anIntArray289[local10] | arg0 << local13 & local23;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ea;B)V")
	public static void method1581(@OriginalArg(0) Class5_Sub2_Sub2_Sub3 arg0) {
		if (arg0.anInt2925 == 0) {
			arg0.anInt2909 = 1024;
		}
		arg0.anInt2894 = 0;
		if (arg0.anInt2925 == 1) {
			arg0.anInt2909 = 1536;
		}
		@Pc(25) int local25 = arg0.anInt2911 - Static58.anInt1422;
		if (arg0.anInt2925 == 2) {
			arg0.anInt2909 = 0;
		}
		@Pc(44) int local44 = arg0.anInt2887 * 128 + arg0.anInt2892 * 64;
		@Pc(54) int local54 = arg0.anInt2891 * 128 + arg0.anInt2892 * 64;
		arg0.anInt2912 += (local44 - arg0.anInt2912) / local25;
		if (arg0.anInt2925 == 3) {
			arg0.anInt2909 = 512;
		}
		arg0.anInt2875 += (local54 - arg0.anInt2875) / local25;
	}
}
