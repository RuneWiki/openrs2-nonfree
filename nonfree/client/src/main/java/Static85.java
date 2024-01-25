import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
	public static int anInt6282;

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
	public static int anInt6285 = -1;

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_104 = new Class242(76, -1);

	@OriginalMember(owner = "client!dw", name = "C", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_98 = new Class142("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_239 = new Class67(3, 8);

	@OriginalMember(owner = "client!dw", name = "E", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_52 = new Class77(32);

	@OriginalMember(owner = "client!dw", name = "F", descriptor = "Lclient!nh;")
	public static final Class170 aClass170_9 = new Class170("WTRC", 1);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(CIZ)C")
	public static char method5069(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)I")
	public static int method5073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static425.aShortArrayArray9 == null ? 0 : Static425.aShortArrayArray9[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "(I)I")
	public static int method5074() {
		@Pc(12) Class117 local12 = Static186.aClass117_3;
		@Pc(14) boolean local14 = false;
		if (Static214.anInt3968 != 0) {
			@Pc(23) Canvas local23 = new Canvas();
			local23.setSize(100, 100);
			local14 = true;
			local12 = Static465.method5715(0, local23, 0, null, null);
		}
		@Pc(40) long local40 = Static183.method2674();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local12.method5727();
		}
		@Pc(69) int local69 = (int) (Static183.method2674() - local40);
		local12.method5664(100, 0, -16777216, 100, 0);
		if (local14) {
			local12.method5701();
		}
		return local69;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!sq;IIII)V")
	public static void method5075(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static127.method1578(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static174.anInt2873) {
			Static127.method1578(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static127.method1578(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static325.anInt5351) {
			Static127.method1578(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static325.anInt5351) {
			Static127.method1578(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static174.anInt2873 && arg4 <= Static325.anInt5351) {
			Static127.method1578(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static127.method1578(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static174.anInt2873 && arg4 > 0) {
			Static127.method1578(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
