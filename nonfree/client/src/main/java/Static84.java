import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "Lclient!kf;")
	public static Class90 aClass90_2;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "[Lclient!cf;")
	public static Class23[] aClass23Array3;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
	public static int anInt1660;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
	public static int anInt1666;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "Lclient!nc;")
	public static Class117 aClass117_1;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12 = new String[1000];

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Lclient!ue;")
	public static Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "[Lclient!ui;")
	public static Class1_Sub2_Sub22[] aClass1_Sub2_Sub22Array3 = new Class1_Sub2_Sub22[14];

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
	public static int anInt1667 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public static void method1578() {
		Static217.aClass1_Sub24_Sub4_3.method4652();
		Static190.anInt3615 = 1;
		Static13.aClass121_11 = null;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!wf;Z)I")
	public static int method1586(@OriginalArg(0) Class15_Sub5_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt5615;
		@Pc(17) Class11 local17 = arg0.method4698();
		if (arg0.anInt5569 == local17.anInt206) {
			local13 = arg0.anInt5630;
		} else if (arg0.anInt5569 == local17.anInt187 || local17.anInt193 == arg0.anInt5569 || local17.anInt212 == arg0.anInt5569 || arg0.anInt5569 == local17.anInt191) {
			local13 = arg0.anInt5611;
		} else if (local17.anInt190 == arg0.anInt5569 || local17.anInt197 == arg0.anInt5569 || arg0.anInt5569 == local17.anInt181 || local17.anInt192 == arg0.anInt5569) {
			local13 = arg0.anInt5608;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1587(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
