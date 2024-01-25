import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt2016 = 0;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[Lclient!wp;")
	public static final Class266[] aClass266Array1 = new Class266[4];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method1492() {
		if (Static423.aClass199_11 != null) {
			Static423.aClass199_11.method4490();
			Static423.aClass199_11 = null;
		}
		Static238.method3614();
		Static440.method5948();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static332.aClass37Array1[local19].method1060();
		}
		Static313.method4436(false);
		System.gc();
		Static56.method1115();
		Static378.anInt6716 = -1;
		Static256.aBoolean398 = false;
		Static388.method5360(true);
		Static379.anInt6721 = 0;
		Static173.anInt3340 = 0;
		Static447.anInt4685 = 0;
		Static200.anInt7590 = 0;
		Static190.anInt3756 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static2.aClass233Array1.length; local56++) {
			Static2.aClass233Array1[local56] = null;
		}
		Static24.method343();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static129.aClass4_Sub2_Sub2_Sub1Array27[local75] = null;
		}
		Static391.anInt6867 = 0;
		for (@Pc(94) int local94 = 0; local94 < 32768; local94++) {
			Static4.aClass4_Sub2_Sub2_Sub2Array1[local94] = null;
		}
		Static383.aClass240_34.method5433();
		Static225.method3478();
		Static436.anInt7620 = 0;
		Static215.aClass225_1.method5148();
		Static256.method3903();
		Static117.method1716();
		Static243.method3669(true);
		try {
			Static461.method3590(Static303.aClass131_4.anApplet1, "loggedout");
		} catch (@Pc(133) Throwable local133) {
		}
		Static310.aClass2_Sub29_2 = null;
		Static267.aLong147 = 0L;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
	public static void method1493(@OriginalArg(0) int arg0) {
		Static300.anInt5372 = arg0;
		Static419.aClass129_73.method3025();
	}
}
