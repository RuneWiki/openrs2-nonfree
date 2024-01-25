import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!wm;")
	public static Class390 aClass390_19;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_17 = new Class305(48, 7);

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt2166 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)I")
	public static int method1950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static574.anIntArray513[arg0 & 0x3] : Static339.anIntArray361[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method1951() {
		if (Static429.aString71.toLowerCase().indexOf("microsoft") != -1) {
			Static596.anIntArray164[223] = 28;
			Static596.anIntArray164[220] = 74;
			Static596.anIntArray164[190] = 72;
			Static596.anIntArray164[222] = 59;
			Static596.anIntArray164[191] = 73;
			Static596.anIntArray164[192] = 58;
			Static596.anIntArray164[219] = 42;
			Static596.anIntArray164[221] = 43;
			Static596.anIntArray164[186] = 57;
			Static596.anIntArray164[187] = 27;
			Static596.anIntArray164[188] = 71;
			Static596.anIntArray164[189] = 26;
			return;
		}
		Static596.anIntArray164[59] = 57;
		Static596.anIntArray164[47] = 73;
		Static596.anIntArray164[91] = 42;
		Static596.anIntArray164[44] = 71;
		Static596.anIntArray164[45] = 26;
		Static596.anIntArray164[46] = 72;
		Static596.anIntArray164[61] = 27;
		if (Static429.aMethod1 == null) {
			Static596.anIntArray164[222] = 59;
			Static596.anIntArray164[192] = 58;
		} else {
			Static596.anIntArray164[520] = 59;
			Static596.anIntArray164[222] = 58;
			Static596.anIntArray164[192] = 28;
		}
		Static596.anIntArray164[92] = 74;
		Static596.anIntArray164[93] = 43;
	}
}
