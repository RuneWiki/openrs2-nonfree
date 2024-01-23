import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
	public static int[] anIntArray211;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!kb;")
	public static Class83 aClass83_54;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	public static int anInt2029;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "[B")
	public static byte[] aByteArray25 = new byte[520];

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString58 = "Please remove ";

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method1510() {
		@Pc(8) int local8 = Static18.method379();
		if (local8 == 0) {
			Static269.aByteArrayArrayArray51 = null;
			Static196.method3520(0);
		} else if (local8 == 1) {
			Static121.method2061((byte) 0);
			Static196.method3520(512);
			if (Static126.aByteArrayArrayArray24 != null) {
				Static244.method4191();
			}
		} else {
			Static121.method2061((byte) (Static121.anInt2729 - 4 & 0xFF));
			Static196.method3520(2);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
	public static int method1511(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public static void method1512() {
		Static9.aClass155_2.method4362();
	}
}
