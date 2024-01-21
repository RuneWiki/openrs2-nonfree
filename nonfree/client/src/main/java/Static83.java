import org.openrs2.deob.annotation.OriginalMember;

public final class Static83 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt2004 = 2;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1001 = Static38.method736("Prepared sound engine");

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_998 = aClass71_1001;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!vc;")
	private static Class71 aClass71_999 = Static38.method736("New User");

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1000 = aClass71_999;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
	public static int[] anIntArray248 = new int[1000];

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	public static void method1359() {
		if (Static66.anInt1652 != 1) {
			return;
		}
		if (Static30.anInt800 >= 6 && Static30.anInt800 <= 106 && Static32.anInt847 >= 467 && Static32.anInt847 <= 499) {
			Static99.aBoolean103 = true;
			Static16.anInt518 = (Static16.anInt518 + 1) % 4;
			Static68.aBoolean72 = true;
			Static61.aClass5_Sub11_Sub1_8.method1553(13);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static16.anInt518);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static60.anInt1551);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static93.anInt2252);
		}
		if (Static30.anInt800 >= 135 && Static30.anInt800 <= 235 && Static32.anInt847 >= 467 && Static32.anInt847 <= 499) {
			Static68.aBoolean72 = true;
			Static60.anInt1551 = (Static60.anInt1551 + 1) % 3;
			Static99.aBoolean103 = true;
			Static61.aClass5_Sub11_Sub1_8.method1553(13);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static16.anInt518);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static60.anInt1551);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static93.anInt2252);
		}
		if (Static30.anInt800 >= 273 && Static30.anInt800 <= 373 && Static32.anInt847 >= 467 && Static32.anInt847 <= 499) {
			Static93.anInt2252 = (Static93.anInt2252 + 1) % 3;
			Static68.aBoolean72 = true;
			Static99.aBoolean103 = true;
			Static61.aClass5_Sub11_Sub1_8.method1553(13);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static16.anInt518);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static60.anInt1551);
			Static61.aClass5_Sub11_Sub1_8.method1545(Static93.anInt2252);
		}
		if (Static30.anInt800 < 412 || Static30.anInt800 > 512 || Static32.anInt847 < 467 || Static32.anInt847 > 499) {
			return;
		}
		if (Static47.anInt1298 != -1) {
			Static92.method1500(0, Static81.aClass71_984, Static38.aClass71_568);
			if (Static78.aClass71_521 != null) {
				Static92.method1500(0, Static78.aClass71_521, Static38.aClass71_568);
			}
			return;
		}
		Static2.method1237();
		if (Static14.anInt496 != -1) {
			Static38.aBoolean44 = false;
			Static38.aClass71_571 = Static38.aClass71_568;
			Static117.anInt2911 = Static47.anInt1298 = Static14.anInt496;
		}
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
	public static void method1361() {
		aClass71_1000 = null;
		anIntArray248 = null;
		aByteArrayArray8 = null;
		aClass71_999 = null;
		aClass71_1001 = null;
		aClass71_998 = null;
	}
}
