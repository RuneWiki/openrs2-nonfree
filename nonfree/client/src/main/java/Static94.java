import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public static int anInt2318 = -1;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IFBIIIIIZ)[[I")
	public static int[][] method1900(@OriginalArg(1) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class7_Sub4_Sub13 local11 = new Class7_Sub4_Sub13();
		local11.aBoolean238 = false;
		local11.anInt3160 = 4;
		local11.anInt3165 = 3;
		local11.anInt3167 = (int) (arg0 * 4096.0F);
		local11.anInt3154 = 8;
		local11.method5635();
		Static168.method3214(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local11.method2914(local47, local7[local47]);
		}
		return local7;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public static void method1901(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static57.aBooleanArray11[arg0]) {
			return;
		}
		Static85.aClass180_22.method4569(arg0);
		if (Static298.aClass26ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(24) boolean local24 = true;
		for (@Pc(35) int local35 = 0; local35 < Static298.aClass26ArrayArray1[arg0].length; local35++) {
			if (Static298.aClass26ArrayArray1[arg0][local35] != null) {
				if (Static298.aClass26ArrayArray1[arg0][local35].anInt520 == 2) {
					local24 = false;
				} else {
					Static298.aClass26ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local24) {
			Static298.aClass26ArrayArray1[arg0] = null;
		}
		Static57.aBooleanArray11[arg0] = false;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1902(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static124.anInt2775; local14++) {
			if (arg0.equalsIgnoreCase(Static64.aStringArray15[local14])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIZZI)V")
	public static void method1905(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static165.method3172(arg1, 0, arg0, Static272.aClass187_Sub1Array2.length - 1, arg3, arg2);
		Static62.aClass7_Sub39_1 = null;
		Static179.anInt3651 = 0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	public static void method1907() {
		Static69.aClass103_17.method2684();
	}
}
