import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
	public static int anInt153;

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "Lclient!f;")
	public static Class10 aClass10_4;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "Lclient!fv;")
	public static final Class108 aClass108_2 = new Class108();

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class285 local13 = local7.aClass285_6; local13 != null; local13 = local13.aClass285_5) {
			@Pc(17) Class20_Sub2_Sub4 local17 = local13.aClass20_Sub2_Sub4_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort100 == arg1 && local17.aShort97 == arg2) {
				Static81.method1660(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Z")
	public static boolean method136() {
		@Pc(7) Class1 local7 = Static3.aClass361_1.aClass1_281.aClass1_285;
		if (local7 == null || Static3.aClass361_1.aClass1_281 == local7) {
			return false;
		}
		@Pc(22) Class1_Sub23 local22 = (Class1_Sub23) local7;
		if (local22.anInt5147 >= 2000) {
			local22.anInt5147 -= 2000;
		}
		return local22.anInt5147 == 1001;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljava/io/File;ZB)V")
	public static void method137(@OriginalArg(0) File arg0) {
		if (Static105.anObject3 == null) {
			Static454.method6382();
		}
		try {
			@Pc(16) Class local16 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(37) Method local37 = local16.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local37.invoke(Static105.anObject3, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(57) Exception local57) {
			System.out.println("HeapDump error:");
			local57.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIZIIF)[I")
	public static int[] method138(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(15) Class1_Sub1_Sub32 local15 = new Class1_Sub1_Sub32();
		local15.aBoolean635 = true;
		local15.anInt8699 = 35;
		local15.anInt8703 = 8;
		local15.anInt8704 = 4;
		local15.anInt8701 = (int) (arg0 * 4096.0F);
		local15.anInt8692 = 8;
		local15.method7885();
		Static94.method1795(1, 2048);
		local15.method7177(local6, 0);
		return local6;
	}
}
