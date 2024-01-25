import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!pi;")
	public static Class258 aClass258_1;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!tf;")
	public static Class322 aClass322_30;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	public static int anInt1907;

	@OriginalMember(owner = "client!df", name = "I", descriptor = "I")
	public static int anInt1912;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "Lclient!tf;")
	public static Class322 aClass322_31;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!df", name = "C", descriptor = "I")
	public static int anInt1908 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!gu;Lclient!gu;IBZ)I")
	public static int method1720(@OriginalArg(0) Class119_Sub1 arg0, @OriginalArg(1) Class119_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg0.anInt3540;
			local14 = arg1.anInt3540;
			if (!arg3) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static317.method4655(arg0.method3168().aString28, Static256.anInt4535, arg1.method3168().aString28);
		} else if (arg2 == 3) {
			if (arg0.aString21.equals("-")) {
				if (arg1.aString21.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString21.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static317.method4655(arg0.aString21, Static256.anInt4535, arg1.aString21);
			}
		} else if (arg2 == 4) {
			if (arg0.method3163()) {
				return arg1.method3163() ? 0 : 1;
			} else if (arg1.method3163()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method3164()) {
				return arg1.method3164() ? 0 : 1;
			} else if (arg1.method3164()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method3161()) {
				return arg1.method3161() ? 0 : 1;
			} else if (arg1.method3161()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method3162()) {
				return arg1.method3162() ? 0 : 1;
			} else if (arg1.method3162()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg0.anInt3547;
			local14 = arg1.anInt3547;
			if (arg3) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg0.anInt3548 - arg1.anInt3548;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
	public static void method1722(@OriginalArg(1) int arg0) {
		Static338.anInt5645 = arg0;
		Static247.aClass6_26.method102();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Z")
	public static boolean method1723(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static361.aCharArray16[local12 - 128] != '\u0000';
		}
	}
}
