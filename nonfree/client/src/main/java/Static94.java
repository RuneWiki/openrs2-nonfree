import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!gf;")
	public static final Class91 aClass91_13 = new Class91("", 17);

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public static int anInt5592 = -1;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "Z")
	public static boolean aBoolean395 = true;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
	public static void method4447(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static264.method3702(-1, arg2, null, arg1, arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)I")
	public static int method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(16) int local16 = 128 - arg0;
		@Pc(30) int local30 = local16 * (arg2 & 0x7F) + arg0 * (arg1 & 0x7F) >> 7;
		@Pc(44) int local44 = arg0 * (arg1 & 0x380) + local16 * (arg2 & 0x380) >> 7;
		@Pc(58) int local58 = local16 * (arg2 & 0xFC00) + arg0 * (arg1 & 0xFC00) >> 7;
		return local58 & 0xFC00 | local44 & 0x380 | local30 & 0x7F;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ICI)C")
	public static char method4450(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
