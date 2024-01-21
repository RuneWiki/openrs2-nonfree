import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 aClass2_Sub1_Sub7_Sub4_6;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public static int anInt2858;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_12;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	public static int anInt2864;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "Lclient!pe;")
	public static Class13 aClass13_20;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_790 = Static158.method3034("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_36 = new Class89(64);

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_791 = Static158.method3034("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "[I")
	public static final int[] anIntArray326 = new int[100];

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_793 = Static158.method3034(" from your friend list first)3");

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Lclient!ob;")
	public static Class60 aClass60_792 = aClass60_793;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public static int anInt2865 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIILclient!aa;IJZ)Z")
	public static boolean method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static87.method2043(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V")
	public static void method2269(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lclient!ob;[SZ)V")
	public static void method2270(@OriginalArg(0) Class60[] arg0, @OriginalArg(1) short[] arg1) {
		Static16.method402(0, arg0, arg0.length - 1, arg1);
	}
}
