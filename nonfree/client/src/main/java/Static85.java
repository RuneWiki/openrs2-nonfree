import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!oa;")
	public static Class5_Sub5_Sub4 aClass5_Sub5_Sub4_2;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!na;")
	public static Class5_Sub14_Sub1 aClass5_Sub14_Sub1_3 = new Class5_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!r;")
	private static Class61 aClass61_669 = Static129.method2060("white:");

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_666 = aClass61_669;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_667 = Static129.method2060("(U");

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!r;")
	public static Class61 aClass61_668 = aClass61_669;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public static int anInt2311 = 0;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_670 = null;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_671 = Static129.method2060(":trade:");

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public static int anInt2314 = 0;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_672 = Static129.method2060("Versteckt");

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	public static int anInt2315 = 0;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt2316 = -1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1528() {
		aClass61_668 = null;
		aClass5_Sub5_Sub4_2 = null;
		aClass61_669 = null;
		aClass61_666 = null;
		aFontMetrics1 = null;
		aClass61_671 = null;
		aClass61_670 = null;
		anIntArray293 = null;
		aClass61_672 = null;
		aClass61_667 = null;
		aClass5_Sub14_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Lclient!r;")
	public static Class61 method1529(@OriginalArg(0) int arg0) {
		return Static123.method1929(new Class61[] { Static39.method730(arg0 >> 24 & 0xFF), Static16.aClass61_158, Static39.method730(arg0 >> 16 & 0xFF), Static16.aClass61_158, Static39.method730(arg0 >> 8 & 0xFF), Static16.aClass61_158, Static39.method730(arg0 & 0xFF) });
	}
}
