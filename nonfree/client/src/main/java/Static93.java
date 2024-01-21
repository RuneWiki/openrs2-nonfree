import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
	public static int[] anIntArray227 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!cd;")
	private static Class10 aClass10_928 = Static51.method932("Take");

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_922 = aClass10_928;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!cd;")
	private static Class10 aClass10_925 = Static51.method932(" has logged out)3");

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_923 = aClass10_925;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!cd;")
	private static Class10 aClass10_926 = Static51.method932("wave2:");

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_924 = aClass10_926;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_927 = aClass10_926;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
	public static int[] anIntArray229 = new int[500];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1563() {
		aClass10_927 = null;
		aClass10_928 = null;
		aClass10_922 = null;
		aClass10_924 = null;
		aClass10_925 = null;
		aClass10_923 = null;
		aClass10_926 = null;
		anIntArray227 = null;
		anIntArray229 = null;
		anIntArray228 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!va;IIIII)V")
	public static void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(28) int local28;
		if (arg1 < 0 || arg1 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local28 = arg2.method1461();
				if (local28 == 0) {
					break;
				}
				if (local28 == 1) {
					arg2.method1461();
					break;
				}
				if (local28 <= 49) {
					arg2.method1461();
				}
			}
			return;
		}
		Static50.aByteArrayArrayArray3[arg0][arg1][arg4] = 0;
		while (true) {
			local28 = arg2.method1461();
			if (local28 == 0) {
				if (arg0 == 0) {
					Static162.anIntArrayArrayArray8[0][arg1][arg4] = -Static91.method1544(arg1 + arg3 + 932731, arg4 + 556238 + arg6) * 8;
				} else {
					Static162.anIntArrayArrayArray8[arg0][arg1][arg4] = Static162.anIntArrayArrayArray8[arg0 - 1][arg1][arg4] - 240;
				}
				break;
			}
			if (local28 == 1) {
				@Pc(88) int local88 = arg2.method1461();
				if (local88 == 1) {
					local88 = 0;
				}
				if (arg0 == 0) {
					Static162.anIntArrayArrayArray8[0][arg1][arg4] = -local88 * 8;
				} else {
					Static162.anIntArrayArrayArray8[arg0][arg1][arg4] = Static162.anIntArrayArrayArray8[arg0 - 1][arg1][arg4] - local88 * 8;
				}
				break;
			}
			if (local28 <= 49) {
				Static145.aByteArrayArrayArray9[arg0][arg1][arg4] = arg2.method1463();
				Static57.aByteArrayArrayArray5[arg0][arg1][arg4] = (byte) ((local28 - 2) / 4);
				Static11.aByteArrayArrayArray11[arg0][arg1][arg4] = (byte) (arg5 + local28 - 2 & 0x3);
			} else if (local28 <= 81) {
				Static50.aByteArrayArrayArray3[arg0][arg1][arg4] = (byte) (local28 - 49);
			} else {
				Static9.aByteArrayArrayArray1[arg0][arg1][arg4] = (byte) (local28 - 81);
			}
		}
	}
}
