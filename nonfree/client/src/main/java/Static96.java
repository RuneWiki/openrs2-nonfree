import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!rn;")
	public static Class18 aClass18_7;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_31 = new Class32("K", "T", "K", "K");

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[100];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIII)I")
	public static int method1915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIZZZI)V")
	public static void method1917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg5) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) Class138_Sub1 local25 = Static380.aClass138_Sub1Array2[local19];
		Static380.aClass138_Sub1Array2[local19] = Static380.aClass138_Sub1Array2[arg5];
		Static380.aClass138_Sub1Array2[arg5] = local25;
		for (@Pc(37) int local37 = arg0; local37 < arg5; local37++) {
			if (Static168.method2961(arg2, arg4, arg1, arg3, local25, Static380.aClass138_Sub1Array2[local37]) <= 0) {
				@Pc(57) Class138_Sub1 local57 = Static380.aClass138_Sub1Array2[local37];
				Static380.aClass138_Sub1Array2[local37] = Static380.aClass138_Sub1Array2[local21];
				Static380.aClass138_Sub1Array2[local21++] = local57;
			}
		}
		Static380.aClass138_Sub1Array2[arg5] = Static380.aClass138_Sub1Array2[local21];
		Static380.aClass138_Sub1Array2[local21] = local25;
		method1917(arg0, arg1, arg2, arg3, arg4, local21 - 1);
		method1917(local21 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V")
	public static void method1918(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static350.aBooleanArray22[arg0]) {
			Static233.aClass171_54.method3753(arg0);
			Static183.aClass4ArrayArray1[arg0] = null;
			Static350.aBooleanArray22[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method1919(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static191.method3271(Static363.method5387(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
