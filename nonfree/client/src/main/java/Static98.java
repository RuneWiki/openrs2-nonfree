import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!g", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Lclient!wn;")
	public static Class95 aClass95_7;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)I")
	public static int method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static223.anIntArray401[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	public static void method1775() {
		Static212.aClass190_23.method5472();
		Static252.aClass190_28.method5472();
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
	public static void method1776() {
		Static99.aClass109_22.method2850();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)I")
	public static int method1777(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
