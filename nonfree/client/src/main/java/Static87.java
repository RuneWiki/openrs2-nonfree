import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!hu;")
	public static Class44 aClass44_5;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public static int anInt1434;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_38 = new Class136(122, 0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class5_Sub4_Sub13 local12 = Static506.method2916(arg0, 2);
		local12.method4140();
		local12.aString66 = arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!aea;)I")
	public static int method1368(@OriginalArg(1) Class10 arg0) {
		if (arg0 == Static247.aClass10_4) {
			return 7681;
		} else if (Static101.aClass10_2 == arg0) {
			return 8448;
		} else if (arg0 == Static646.aClass10_5) {
			return 34165;
		} else if (Static140.aClass10_3 == arg0) {
			return 260;
		} else if (arg0 == Static81.aClass10_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
