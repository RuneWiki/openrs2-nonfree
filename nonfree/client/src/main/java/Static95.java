import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_6 = new Class207(4);

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "Z")
	public static boolean aBoolean112 = true;

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "Lclient!en;")
	public static final Class84 aClass84_2 = new Class84("", 13);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method1438(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static278.method4025(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIII)V")
	public static void method1439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static231.anInt4302; local7++) {
			@Pc(13) Rectangle local13 = Class295.aRectangleArray2[local7];
			if (local13.width + local13.x > arg2 && local13.x < arg3 + arg2 && arg0 < local13.height + local13.y && local13.y < arg1 + arg0) {
				Static73.aBooleanArray6[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZILclient!sea;ILclient!jba;BI)V")
	public static void method1441(@OriginalArg(1) int arg0, @OriginalArg(2) Class308 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub6_Sub2 arg3) {
		Static33.method637(arg0, arg2, arg1);
		Static144.aClass1_Sub6_Sub2_4 = arg3;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
	public static void method1446() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static511.aClass80Array1.length; local3++) {
				if (Static511.aClass80Array1[local3].method2148()) {
					Static82.aLongArray2[local3] = Static511.aClass80Array1[local3].method2147();
				} else {
					synchronized (Static511.aClass80Array1[local3]) {
						Static511.aClass80Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static511.aClass80Array1[Static511.aClass80Array1.length - 1].method2146();
				Static595.method7988(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static511.aClass80Array1.length - 1; local3++) {
						if (!Static511.aClass80Array1[local3].method2148()) {
							synchronized (Static511.aClass80Array1[local3]) {
								Static511.aClass80Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static511.aClass80Array1.length - 2; local102++) {
							Static511.aClass80Array1[local102].method2146();
						}
						Static595.method7988(2);
						while (!Static511.aClass80Array1[0].method2148()) {
							synchronized (Static511.aClass80Array1[0]) {
								Static511.aClass80Array1[0].notify();
							}
							try {
								Static408.method5841(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static511.aClass80Array1[0].method2146();
						return;
					}
					try {
						Static408.method5841(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static408.method5841(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
