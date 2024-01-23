import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "Lclient!ag;")
	public static Class7 aClass7_3;

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "[S")
	public static short[] aShortArray21;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "[S")
	public static short[] aShortArray22 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method1463() {
		Static240.aClass169_51.method4018();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1485(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static175.anInt3635; local11++) {
			if (arg0.equalsIgnoreCase(Static279.aStringArray44[local11])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static229.aClass22_Sub3_Sub2_2.aString153)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
	public static void method1487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		for (local3 = arg1; local3 <= arg1 + arg2; local3++) {
			for (local14 = arg3; local14 <= arg4 + arg3; local14++) {
				if (local14 >= 0 && local14 < 104 && local3 >= 0 && local3 < 104) {
					Static301.aByteArrayArrayArray21[arg0][local14][local3] = 127;
				}
			}
		}
		for (local3 = arg1; local3 < arg2 + arg1; local3++) {
			for (local14 = arg3; local14 < arg4 + arg3; local14++) {
				if (local14 >= 0 && local14 < 104 && local3 >= 0 && local3 < 104) {
					Static208.anIntArrayArrayArray11[arg0][local14][local3] = arg0 > 0 ? Static208.anIntArrayArrayArray11[arg0 - 1][local14][local3] : 0;
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local3 = arg1 + 1; local3 < arg1 + arg2; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static208.anIntArrayArrayArray11[arg0][arg3][local3] = Static208.anIntArrayArrayArray11[arg0][arg3 - 1][local3];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local3 = arg3 + 1; local3 < arg3 + arg4; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static208.anIntArrayArrayArray11[arg0][local3][arg1] = Static208.anIntArrayArrayArray11[arg0][local3][arg1 - 1];
				}
			}
		}
		if (arg3 < 0 || arg1 < 0 || arg3 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1] != 0) {
				Static208.anIntArrayArrayArray11[arg0][arg3][arg1] = Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1];
			} else if (arg1 > 0 && Static208.anIntArrayArrayArray11[arg0][arg3][arg1 - 1] != 0) {
				Static208.anIntArrayArrayArray11[arg0][arg3][arg1] = Static208.anIntArrayArrayArray11[arg0][arg3][arg1 - 1];
			} else if (arg3 > 0 && arg1 > 0 && Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1 - 1] != 0) {
				Static208.anIntArrayArrayArray11[arg0][arg3][arg1] = Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1 - 1];
			}
		} else if (arg3 > 0 && Static208.anIntArrayArrayArray11[arg0 - 1][arg3 - 1][arg1] != Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1]) {
			Static208.anIntArrayArrayArray11[arg0][arg3][arg1] = Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1];
		} else if (arg1 > 0 && Static208.anIntArrayArrayArray11[arg0 - 1][arg3][arg1 - 1] != Static208.anIntArrayArrayArray11[arg0][arg3][arg1 - 1]) {
			Static208.anIntArrayArrayArray11[arg0][arg3][arg1] = Static208.anIntArrayArrayArray11[arg0][arg3][arg1 - 1];
		} else if (arg3 > 0 && arg1 > 0 && Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1 - 1] != Static208.anIntArrayArrayArray11[arg0 - 1][arg3 - 1][arg1 - 1]) {
			Static208.anIntArrayArrayArray11[arg0][arg3][arg1] = Static208.anIntArrayArrayArray11[arg0][arg3 - 1][arg1 - 1];
		}
	}
}
