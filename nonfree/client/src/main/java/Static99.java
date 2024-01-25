import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
	public static int anInt2445 = -1;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "S")
	public static short aShort34 = 205;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
	public static int anInt2448 = -1;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBII)I")
	public static int method2251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = 255 - arg2;
		@Pc(35) int local35 = (arg2 * (arg1 & 0xFF00) & 0xFF0000 | arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00FF) * local17 & 0xFF00FF00 | local17 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local35;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
	public static void method2253(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(12, arg0);
		local8.method4925();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIII)Z")
	public static boolean method2254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static32.method1277(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static246.anInt4759;
		@Pc(14) int local14 = arg2 << Static246.anInt4759;
		@Pc(23) int local23 = Static290.aClass10Array7[arg0].ba(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static246.anInt4759 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static246.anInt4759 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static246.anInt4759 - 7);
		if (arg3 == 1) {
			if (local10 > Static267.anInt5170) {
				if (!Static237.method4032(local10, local23, local14)) {
					return false;
				}
				if (!Static237.method4032(local10, local23, local14 + Static444.anInt7507)) {
					return false;
				}
				if (!Static237.method4032(local10, local23, local14 + Static40.anInt1354)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static237.method4032(local10, local31, local14)) {
					return false;
				}
				if (!Static237.method4032(local10, local31, local14 + Static444.anInt7507)) {
					return false;
				}
				if (!Static237.method4032(local10, local31, local14 + Static40.anInt1354)) {
					return false;
				}
			}
			if (!Static237.method4032(local10, local39, local14)) {
				return false;
			} else if (Static237.method4032(local10, local39, local14 + Static444.anInt7507)) {
				return Static237.method4032(local10, local39, local14 + Static40.anInt1354);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static360.anInt9309) {
				if (!Static237.method4032(local10, local23, local14 + Static40.anInt1354)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static444.anInt7507, local23, local14 + Static40.anInt1354)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local23, local14 + Static40.anInt1354)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static237.method4032(local10, local31, local14 + Static40.anInt1354)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static444.anInt7507, local31, local14 + Static40.anInt1354)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local31, local14 + Static40.anInt1354)) {
					return false;
				}
			}
			if (!Static237.method4032(local10, local39, local14 + Static40.anInt1354)) {
				return false;
			} else if (Static237.method4032(local10 + Static444.anInt7507, local39, local14 + Static40.anInt1354)) {
				return Static237.method4032(local10 + Static40.anInt1354, local39, local14 + Static40.anInt1354);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static267.anInt5170) {
				if (!Static237.method4032(local10 + Static40.anInt1354, local23, local14)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local23, local14 + Static444.anInt7507)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local23, local14 + Static40.anInt1354)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static237.method4032(local10 + Static40.anInt1354, local31, local14)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local31, local14 + Static444.anInt7507)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local31, local14 + Static40.anInt1354)) {
					return false;
				}
			}
			if (!Static237.method4032(local10 + Static40.anInt1354, local39, local14)) {
				return false;
			} else if (Static237.method4032(local10 + Static40.anInt1354, local39, local14 + Static444.anInt7507)) {
				return Static237.method4032(local10 + Static40.anInt1354, local39, local14 + Static40.anInt1354);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static360.anInt9309) {
				if (!Static237.method4032(local10, local23, local14)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static444.anInt7507, local23, local14)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static237.method4032(local10, local31, local14)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static444.anInt7507, local31, local14)) {
					return false;
				}
				if (!Static237.method4032(local10 + Static40.anInt1354, local31, local14)) {
					return false;
				}
			}
			if (!Static237.method4032(local10, local39, local14)) {
				return false;
			} else if (Static237.method4032(local10 + Static444.anInt7507, local39, local14)) {
				return Static237.method4032(local10 + Static40.anInt1354, local39, local14);
			} else {
				return false;
			}
		} else if (!Static237.method4032(local10 + Static444.anInt7507, local47, local14 + Static444.anInt7507)) {
			return false;
		} else if (arg3 == 16) {
			return Static237.method4032(local10, local39, local14 + Static40.anInt1354);
		} else if (arg3 == 32) {
			return Static237.method4032(local10 + Static40.anInt1354, local39, local14 + Static40.anInt1354);
		} else if (arg3 == 64) {
			return Static237.method4032(local10 + Static40.anInt1354, local39, local14);
		} else if (arg3 == 128) {
			return Static237.method4032(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	public static void method2255() {
		Static19.anIntArray38 = null;
		Static393.aBoolean458 = false;
		Static509.anIntArray735 = null;
		Static164.anIntArray283 = null;
		Static216.anIntArray330 = null;
		Static487.anIntArray648 = null;
	}
}
