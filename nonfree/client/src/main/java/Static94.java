import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "[Lclient!ut;")
	public static final Class1_Sub8_Sub18[] aClass1_Sub8_Sub18Array4 = new Class1_Sub8_Sub18[14];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLjava/io/File;Z)V")
	public static void method5761(@OriginalArg(1) File arg0) {
		if (Static443.anObject19 == null) {
			Static435.method6198();
		}
		try {
			@Pc(16) Class local16 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(37) Method local37 = local16.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local37.invoke(Static443.anObject19, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(57) Exception local57) {
			System.out.println("HeapDump error:");
			local57.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B[Ljava/lang/String;)V")
	public static void method5764(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static366.aString75 = Static366.aString75 + arg0[0];
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			if (arg0[local15].startsWith("pause")) {
				@Pc(34) int local34 = 5;
				try {
					local34 = Integer.parseInt(arg0[local15].substring(6));
				} catch (@Pc(43) Exception local43) {
				}
				Static415.method5896("Pausing for " + local34 + " seconds...");
				Static401.aStringArray25 = arg0;
				Static174.anInt3255 = local15 + 1;
				Static78.aLong46 = (long) (local34 * 1000) + Static480.method6650();
				return;
			}
			Static366.aString75 = arg0[local15];
			Static253.method3715(false);
		}
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)J")
	public static long method5765() {
		return Static406.aClass188_1.method7565();
	}
}
