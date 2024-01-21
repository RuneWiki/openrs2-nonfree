import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
	public static int anInt285;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lclient!ac;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!bd;")
	public static Class7 aClass7_1 = new Class7(32);

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "Lclient!af;")
	public static Class5 aClass5_147 = Static45.method1937("");

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "[I")
	public static int[] anIntArray38 = new int[1000];

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "Lclient!af;")
	public static Class5 aClass5_148 = Static45.method1937("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	public static int anInt280 = 0;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lclient!af;")
	public static Class5 aClass5_149 = Static45.method1937("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!af;")
	public static Class5 aClass5_150 = Static45.method1937("");

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	public static int anInt284 = 0;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array2 = new Class5[200];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)Lclient!af;")
	public static Class5 method257(@OriginalArg(0) int arg0) {
		@Pc(8) Class5 local8 = new Class5();
		local8.anInt178 = 0;
		local8.aByteArray2 = new byte[arg0];
		return local8;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!af;Lclient!rd;B)I")
	public static int method259(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		@Pc(7) int local7 = arg1.anInt2951;
		arg1.method2066(arg0.anInt178);
		arg1.anInt2951 += aClass3_1.method60(0, arg1.anInt2951, arg0.anInt178, arg1.aByteArray36, arg0.aByteArray2);
		return arg1.anInt2951 - local7;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	public static void method261() {
		aClass5Array2 = null;
		aClass5_149 = null;
		aClass3_1 = null;
		aClass5_148 = null;
		aClass5_147 = null;
		aClass7_1 = null;
		aClass5_150 = null;
		anIntArray38 = null;
	}
}
