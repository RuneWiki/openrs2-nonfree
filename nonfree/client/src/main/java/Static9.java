import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	public static int anInt130;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	public static int anInt131;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
	public static int anInt124 = 0;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
	public static int anInt126 = 0;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public static int anInt127 = -1;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public static int anInt134 = -1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ho;I)Z")
	public static boolean method120(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean154) {
			return false;
		} else if (!arg0.method1811()) {
			return false;
		} else if (Static133.aClass85_10.method1845((long) arg0.anInt2292) == null) {
			return Static124.aClass85_9.method1845((long) arg0.anInt2284) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!fh;Lclient!fh;III)Lclient!gl;")
	public static Class4_Sub3_Sub5 method121(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(3) int arg2) {
		return Static12.method197(arg0, arg2, 0) ? Static22.method304(arg1.method1372(arg2, 0)) : null;
	}
}
