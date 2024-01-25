import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
	public static int anInt1792;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[Lclient!rc;")
	public static final Class1_Sub18[] aClass1_Sub18Array1 = new Class1_Sub18[8];

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_51 = new Class235(61, 3);

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;CI)I")
	public static int method1474(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)V")
	public static void method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static385.method5299(arg1, arg3, arg4, arg2, arg5, arg0, null, -1);
	}
}
