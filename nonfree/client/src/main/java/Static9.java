import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
	public static int anInt163;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_1 = new Class118(12);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
	public static void method186(@OriginalArg(0) int arg0) {
		if (Static176.aClass2_Sub43_1 == null || (arg0 < 0 || Static176.aClass2_Sub43_1.anInt7160 <= arg0)) {
			return;
		}
		@Pc(29) Class233 local29 = Static176.aClass2_Sub43_1.aClass233Array1[arg0];
		if (local29.aByte80 != -1) {
			return;
		}
		@Pc(38) Class221 local38 = Static87.method1292();
		@Pc(49) Class2_Sub33 local49 = Static592.method8154(Static642.aClass349_145, local38.aClass48_1);
		local49.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(local29.aString65) + 2);
		local49.aClass2_Sub20_Sub2_1.method8551(arg0);
		local49.aClass2_Sub20_Sub2_1.method8541(local29.aString65);
		local38.method5173(local49);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
	public static void method190(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg0.length() > 320 || !Static121.method1814()) {
			return;
		}
		Static617.method8386();
		Static690.anInt10620 = arg1;
		Static376.aString64 = arg0;
		Static489.aString91 = arg2;
		Static261.method9374(-97, 6);
	}
}
