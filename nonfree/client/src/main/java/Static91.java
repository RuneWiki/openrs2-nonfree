import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Lclient!fc;")
	public static Class69 aClass69_2;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[200];

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_16 = new Class26(64);

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public static int anInt1786 = -1;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	public static int anInt1787 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V")
	public static void method1485(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static280.anInt212 = 0;
		Static346.anInt6607 = arg1;
		Static240.anInt4829 = 0;
		Static166.anInt3315 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
	public static void method1487() {
		Static296.aClass26_53.method329(5);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public static void method1488() {
		@Pc(1) Class26 local1 = Static114.aClass26_18;
		synchronized (Static114.aClass26_18) {
			Static114.aClass26_18.method329(5);
		}
	}
}
