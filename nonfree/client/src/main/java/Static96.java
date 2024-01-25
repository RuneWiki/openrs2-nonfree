import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	public static int anInt1757;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_37 = new Class117("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	public static int anInt1755 = 0;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
	public static int anInt1756 = 0;

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "[B")
	public static final byte[] aByteArray27 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	public static void method1449() {
		for (@Pc(10) Class11_Sub1 local10 = (Class11_Sub1) Static108.aClass16_19.method193(); local10 != null; local10 = (Class11_Sub1) Static108.aClass16_19.method188()) {
			if (local10.aBoolean7) {
				local10.method78();
			}
		}
		for (@Pc(34) Class11_Sub1 local34 = (Class11_Sub1) Static169.aClass16_52.method193(); local34 != null; local34 = (Class11_Sub1) Static169.aClass16_52.method188()) {
			if (local34.aBoolean7) {
				local34.method78();
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!nq;Lclient!nq;Lclient!uo;I)V")
	public static void method1451(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class129 arg2) {
		Static275.aClass114_7 = Static22.method310(arg1, Static82.anInt1505);
		Static283.aClass9_3 = arg2.method4933(Static275.aClass114_7, Static368.method2868(arg0, Static82.anInt1505));
		Static332.aClass114_8 = Static22.method310(arg1, Static229.anInt4581);
		Static30.aClass9_1 = arg2.method4933(Static332.aClass114_8, Static368.method2868(arg0, Static229.anInt4581));
		Static102.aClass114_3 = Static22.method310(arg1, Static82.anInt1502);
		Static106.aClass9_2 = arg2.method4933(Static102.aClass114_3, Static368.method2868(arg0, Static82.anInt1502));
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)I")
	public static int method1452(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
