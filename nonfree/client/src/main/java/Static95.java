import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
	public static int anInt2225;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_14 = new Class223(8);

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
	public static int anInt2223 = -2;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	public static boolean method2110() {
		try {
			return Static217.method8378();
		} catch (@Pc(15) IOException local15) {
			Static501.method5640();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(78) String local78 = "T2 - " + (Static257.aClass362_105 == null ? -1 : Static257.aClass362_105.method8310()) + "," + (Static401.aClass362_169 == null ? -1 : Static401.aClass362_169.method8310()) + "," + (Static400.aClass362_168 == null ? -1 : Static400.aClass362_168.method8310()) + " - " + Static186.anInt3680 + "," + (Static552.anInt9805 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0]) + "," + (Static254.anInt4667 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0]) + " - ";
			for (@Pc(80) int local80 = 0; Static186.anInt3680 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static319.aClass4_Sub11_Sub1_2.aByteArray68[local80] + ",";
			}
			Static205.method3450(local78, local20);
			Static135.method2684(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[Lclient!f;)V")
	public static void method2111(@OriginalArg(1) Class78[] arg0) {
		Static231.anInt4192 = arg0.length;
		Static12.anIntArray10 = new int[Static231.anInt4192 + 10];
		Static500.aClass78Array18 = new Class78[Static231.anInt4192 + 10];
		Static597.method3725(arg0, 0, Static500.aClass78Array18, 0, Static231.anInt4192);
		for (@Pc(26) int local26 = 0; local26 < Static231.anInt4192; local26++) {
			Static12.anIntArray10[local26] = Static500.aClass78Array18[local26].ca();
		}
		for (@Pc(45) int local45 = Static231.anInt4192; local45 < Static500.aClass78Array18.length; local45++) {
			Static12.anIntArray10[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static synchronized void method2112() {
		if (Static9.anObject1 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(19) Object local19 = local14.invoke(null, (Object[]) null);
			@Pc(52) Method local52 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static9.anObject1 = local52.invoke(null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(81) Exception local81) {
			System.out.println("HeapDump setup error:");
			local81.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I")
	public static int method2113() {
		return Static113.aClass282_1.method6820();
	}
}
