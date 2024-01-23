import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public static int anInt2077 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	public static void method1588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg1 > arg2) {
			for (local15 = arg2; local15 < arg1; local15++) {
				Static234.anIntArrayArray40[local15][arg3] = arg0;
			}
		} else {
			for (local15 = arg1; local15 < arg2; local15++) {
				Static234.anIntArrayArray40[local15][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method1589() {
		Static85.aClass33_12.method839();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method1590() {
		if (Static260.aString175.toLowerCase().indexOf("microsoft") != -1) {
			Static134.anIntArray249[219] = 42;
			Static134.anIntArray249[223] = 28;
			Static134.anIntArray249[221] = 43;
			Static134.anIntArray249[187] = 27;
			Static134.anIntArray249[188] = 71;
			Static134.anIntArray249[190] = 72;
			Static134.anIntArray249[192] = 58;
			Static134.anIntArray249[186] = 57;
			Static134.anIntArray249[189] = 26;
			Static134.anIntArray249[222] = 59;
			Static134.anIntArray249[220] = 74;
			Static134.anIntArray249[191] = 73;
			return;
		}
		Static134.anIntArray249[93] = 43;
		if (Static260.aMethod2 == null) {
			Static134.anIntArray249[222] = 59;
			Static134.anIntArray249[192] = 58;
		} else {
			Static134.anIntArray249[222] = 58;
			Static134.anIntArray249[520] = 59;
			Static134.anIntArray249[192] = 28;
		}
		Static134.anIntArray249[91] = 42;
		Static134.anIntArray249[46] = 72;
		Static134.anIntArray249[45] = 26;
		Static134.anIntArray249[59] = 57;
		Static134.anIntArray249[61] = 27;
		Static134.anIntArray249[47] = 73;
		Static134.anIntArray249[44] = 71;
		Static134.anIntArray249[92] = 74;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1591(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = Static286.method4297(arg0);
		return local13 == -1 ? "" : Static83.method3365(Static192.aClass9_2.aStringArray2[local13], "<br>", " ");
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZILjava/lang/String;)I")
	public static int method1592(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg1.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(43) char local43 = arg1.charAt(local36);
			if (local36 == 0) {
				if (local43 == '-') {
					local29 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local43 >= '0' && local43 <= '9') {
				local80 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local80 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local80 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local80) {
				throw new NumberFormatException();
			}
			if (local29) {
				local80 = -local80;
			}
			@Pc(120) int local120 = local80 + local31 * arg0;
			if (local31 != local120 / arg0) {
				throw new NumberFormatException();
			}
			local31 = local120;
			local27 = true;
		}
		if (!local27) {
			throw new NumberFormatException();
		}
		return local31;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)I")
	public static int method1593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 2 << 10) + (arg0 >> 5 << 7) + (arg2 >> 1);
	}
}
