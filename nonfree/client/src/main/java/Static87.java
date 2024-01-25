import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	public static int anInt1714;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_16 = new Class126(4);

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "[I")
	public static final int[] anIntArray113 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public static void method1508() {
		@Pc(10) Class7_Sub4_Sub14 local10 = Static54.method750(0, 15);
		local10.method4710();
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)Z")
	public static boolean method1510() {
		return Static313.aClass136_7 != Static167.aClass136_5 || Static157.anInt2920 >= 2;
	}
}
