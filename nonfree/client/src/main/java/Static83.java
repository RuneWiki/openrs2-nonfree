import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dc", name = "Lb", descriptor = "Lclient!sb;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!dc", name = "Pb", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1535(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(IB)V")
	public static void method1538() {
		@Pc(1) Class223 local1 = Static9.aClass223_2;
		synchronized (Static9.aClass223_2) {
			Static9.aClass223_2.method5399(5);
		}
	}
}
