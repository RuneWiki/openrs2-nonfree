import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 aClass3_Sub2_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2 aClass3_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "Lclient!md;")
	public static Class54 aClass54_1 = new Class54(32);

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_79 = Static65.method1172("Okay");

	@OriginalMember(owner = "client!ah", name = "V", descriptor = "Lclient!kb;")
	private static Class46 aClass46_81 = Static65.method1172("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ah", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_80 = aClass46_81;

	@OriginalMember(owner = "client!ah", name = "U", descriptor = "[I")
	public static int[] anIntArray12 = new int[32];

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
	public static int anInt311 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method254(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static178.aClass85_1);
		arg0.removeFocusListener(Static178.aClass85_1);
		Static143.anInt3282 = -1;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method255() {
		aClass46_81 = null;
		aClass3_Sub2_Sub3_Sub2_1 = null;
		aClass46_80 = null;
		aClass54_1 = null;
		anIntArray12 = null;
		aClass46_79 = null;
		aClass3_Sub2_Sub3_Sub1_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	public static void method256() {
		Static28.aClass54_2 = new Class54(32);
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V")
	public static void method257() {
		Static26.aClass57_6.method1715();
		Static134.aClass57_21.method1715();
		Static65.aClass57_15.method1715();
	}
}
