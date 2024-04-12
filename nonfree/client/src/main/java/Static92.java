import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static92 {

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 56)
	public static void method1580() {
		Class2_Sub2_Sub15.aClass40_688 = null;
		Class2_Sub2_Sub15.aClass40_690 = null;
		Class2_Sub2_Sub15.aClass40_689 = null;
		Class2_Sub2_Sub15.aBooleanArray37 = null;
		Class2_Sub2_Sub15.aClass40_691 = null;
		Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lclient!o;", line = 71)
	public static Class40 method1581(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static48.method859(arg0) : Class14.aClass40_116;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 121)
	public static Class method1583(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 161)
	public static void method1584() {
		Class63.aClass44_9 = new Class44();
	}
}
