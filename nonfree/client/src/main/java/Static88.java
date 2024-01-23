import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "[S")
	public static short[] aShortArray62 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
	public static boolean aBoolean140 = true;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!th;B)V")
	public static void method1531(@OriginalArg(0) Class168 arg0) {
		Static61.aClass168_46 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!th;ZII)V")
	public static void method1533(@OriginalArg(2) Class168 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static296.anInt5906 = arg2;
		Static295.anInt5889 = 0;
		Static9.anInt285 = 1;
		Static190.aBoolean261 = false;
		Static309.anInt6195 = 10000;
		Static254.aClass168_172 = arg0;
		Static203.anInt5699 = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)V")
	public static void method1534(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!kc;IIII)V")
	public static void method1535(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class1_Sub16 local18 = (Class1_Sub16) Static80.aClass26_14.method666(); local18 != null; local18 = (Class1_Sub16) Static80.aClass26_14.method672()) {
			if (arg2 == local18.anInt3276 && local18.anInt3277 == arg1 * 128 && local18.anInt3268 == arg3 * 128 && arg0.anInt3230 == local18.aClass92_1.anInt3230) {
				if (local18.aClass1_Sub10_Sub4_2 != null) {
					Static101.aClass1_Sub10_Sub2_2.method1864(local18.aClass1_Sub10_Sub4_2);
					local18.aClass1_Sub10_Sub4_2 = null;
				}
				if (local18.aClass1_Sub10_Sub4_1 != null) {
					Static101.aClass1_Sub10_Sub2_2.method1864(local18.aClass1_Sub10_Sub4_1);
					local18.aClass1_Sub10_Sub4_1 = null;
				}
				local18.method4767();
				return;
			}
		}
	}
}
