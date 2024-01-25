import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "[Lclient!oo;")
	public static Class104_Sub1[] aClass104_Sub1Array4;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
	public static int anInt5391 = 0;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	public static int anInt5393 = 0;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)V")
	public static void method4675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg1, 1);
		local8.method1869();
		local8.anInt2142 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4676(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static191.anInt4095; local16++) {
			if (arg0.equalsIgnoreCase(Static235.aStringArray49[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V")
	public static void method4678() {
		@Pc(5) Class87 local5 = Static248.aClass87_43;
		synchronized (Static248.aClass87_43) {
			Static248.aClass87_43.method2473(5);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4681(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg0.indexOf(arg2); local9 != -1; local9 = arg0.indexOf(arg2, arg1.length() + local9)) {
			arg0 = arg0.substring(0, local9) + arg1 + arg0.substring(arg2.length() + local9);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4682(@OriginalArg(1) String arg0) {
		Static114.method3916("", "", 0, 0, arg0);
	}
}
