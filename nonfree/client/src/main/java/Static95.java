import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public static int anInt2450;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!r;")
	private static Class61 aClass61_727 = Static129.method2060("Your account is already logged in)3");

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_724 = aClass61_727;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!r;")
	private static Class61 aClass61_726 = Static129.method2060("Login limit exceeded)3");

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_725 = aClass61_726;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[S")
	public static short[] aShortArray26 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public static int anInt2441 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public static int anInt2443 = 0;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public static final int anInt2446 = 50;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Z")
	public static boolean aBoolean87 = true;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "Lclient!r;")
	public static Class61 aClass61_728 = Static129.method2060(" ");

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public static int anInt2449 = 0;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "[Lclient!t;")
	public static Class5_Sub2_Sub2_Sub3_Sub2[] aClass5_Sub2_Sub2_Sub3_Sub2Array1 = new Class5_Sub2_Sub2_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "Lclient!r;")
	public static Class61 aClass61_729 = Static129.method2060("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
	public static void method1607(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static114.anInt2962; local14++) {
			if (Static68.aLongArray3[local14] == arg0) {
				Static114.anInt2962--;
				for (@Pc(28) int local28 = local14; local28 < Static114.anInt2962; local28++) {
					Static68.aLongArray3[local28] = Static68.aLongArray3[local28 + 1];
					Static104.aClass61Array18[local28] = Static104.aClass61Array18[local28 + 1];
				}
				anInt2443 = Static66.anInt1592;
				Static1.aClass5_Sub14_Sub1_1.method1489(161);
				Static1.aClass5_Sub14_Sub1_1.method1464(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method1608() {
		aShortArray26 = null;
		aClass61_724 = null;
		aClass61_729 = null;
		aClass61_728 = null;
		aClass61_727 = null;
		aClass5_Sub2_Sub2_Sub3_Sub2Array1 = null;
		aClass61_725 = null;
		aClass61_726 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ff;Lclient!ff;BLclient!ff;)V")
	public static void method1609(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) Class26 arg2) {
		Static126.aClass26_31 = arg1;
		Static11.aClass26_2 = arg0;
		Static77.aClass26_16 = arg2;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
	public static int method1610(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
