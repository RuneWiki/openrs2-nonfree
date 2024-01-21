import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!od", name = "I", descriptor = "Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 aClass4_Sub4_Sub5_Sub4_5;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "Lclient!v;")
	private static Class76 aClass76_910 = Static134.method2017("Loaded fonts");

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!v;")
	public static Class76 aClass76_905 = aClass76_910;

	@OriginalMember(owner = "client!od", name = "A", descriptor = "I")
	public static int anInt2045 = 0;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "[I")
	public static int[] anIntArray283 = new int[5];

	@OriginalMember(owner = "client!od", name = "D", descriptor = "Lclient!v;")
	public static Class76 aClass76_906 = Static134.method2017("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Lclient!v;")
	public static Class76 aClass76_907 = Static134.method2017("::clientdrop");

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	public static int anInt2051 = 0;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_908 = Static134.method2017("::qa_op_test");

	@OriginalMember(owner = "client!od", name = "O", descriptor = "Lclient!v;")
	public static Class76 aClass76_909 = Static134.method2017("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public static void method1436(@OriginalArg(1) int arg0) {
		if (Static45.method816(arg0)) {
			Static5.method76(-1, Static29.aClass4_Sub8ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII[BIII[Lclient!na;Z)V")
	public static void method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class50[] arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if (arg7 + local3 > 0 && arg7 + local3 < 103 && arg0 + local12 > 0 && local12 + arg0 < 103) {
					arg8[arg3].anIntArrayArray16[arg7 + local3][local12 + arg0] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(86) Class4_Sub10 local86 = new Class4_Sub10(arg4);
		for (@Pc(88) int local88 = 0; local88 < 4; local88++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
					if (local88 == arg6 && local92 >= arg2 && arg2 + 8 > local92 && arg5 <= local96 && arg5 + 8 > local96) {
						Static130.method1945(local86, 0, arg1, Static110.method1671(arg1, local96 & 0x7, local92 & 0x7) + arg0, arg3, 0, arg7 + Static98.method1571(local96 & 0x7, local92 & 0x7, arg1));
					} else {
						Static130.method1945(local86, 0, 0, -1, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	public static void method1438() {
		aClass76_908 = null;
		anIntArray283 = null;
		aClass76_909 = null;
		aClass76_906 = null;
		aClass76_905 = null;
		aClass76_910 = null;
		aClass4_Sub4_Sub5_Sub4_5 = null;
		aClass76_907 = null;
	}
}
