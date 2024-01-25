import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
	public static final int[] anIntArray118 = new int[14];

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	public static int anInt2042 = 999999;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BZ)V")
	public static void method1809(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class1_Sub30 local10 = (Class1_Sub30) Static201.aClass361_70.method7854(); local10 != null; local10 = (Class1_Sub30) Static201.aClass361_70.method7853()) {
			if (local10.aClass1_Sub8_Sub1_4 != null) {
				Static298.aClass1_Sub8_Sub4_2.method6033(local10.aClass1_Sub8_Sub1_4);
				local10.aClass1_Sub8_Sub1_4 = null;
			}
			if (local10.aClass1_Sub8_Sub1_3 != null) {
				Static298.aClass1_Sub8_Sub4_2.method6033(local10.aClass1_Sub8_Sub1_3);
				local10.aClass1_Sub8_Sub1_3 = null;
			}
			local10.method7878();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class1_Sub30 local55 = (Class1_Sub30) Static381.aClass361_69.method7854(); local55 != null; local55 = (Class1_Sub30) Static381.aClass361_69.method7853()) {
			if (local55.aClass1_Sub8_Sub1_4 != null) {
				Static298.aClass1_Sub8_Sub4_2.method6033(local55.aClass1_Sub8_Sub1_4);
				local55.aClass1_Sub8_Sub1_4 = null;
			}
			local55.method7878();
		}
		for (@Pc(82) Class1_Sub30 local82 = (Class1_Sub30) Static332.aClass356_27.method7792(); local82 != null; local82 = (Class1_Sub30) Static332.aClass356_27.method7795()) {
			if (local82.aClass1_Sub8_Sub1_4 != null) {
				Static298.aClass1_Sub8_Sub4_2.method6033(local82.aClass1_Sub8_Sub1_4);
				local82.aClass1_Sub8_Sub1_4 = null;
			}
			local82.method7878();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
	public static boolean method1811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
