import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 12);
		local8.method2303();
		local8.anInt2865 = arg1;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
	public static void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 > arg0) {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static442.anIntArrayArray48[local10][arg3] = arg2;
			}
		} else {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static442.anIntArrayArray48[local10][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	public static synchronized void method1899() {
		if (Static450.anObject119 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(23) Object local23 = local14.invoke(null, (Object[]) null);
			@Pc(56) Method local56 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static450.anObject119 = local56.invoke(null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!sw;II)J")
	public static long method1900(@OriginalArg(1) Interface21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class233 local14 = Static103.aClass298_1.method6822(arg0.method7281());
		@Pc(35) long local35 = (long) (arg2 << 7 | arg1 | arg0.method7280() << 14 | arg0.method7283() << 20 | 0x40000000);
		if (local14.anInt6681 == 0) {
			local35 |= local7;
		}
		if (local14.anInt6715 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg0.method7281() << 32;
	}
}
