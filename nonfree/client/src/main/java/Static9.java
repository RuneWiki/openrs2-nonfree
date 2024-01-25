import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_85 = new Class15(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_86 = new Class15("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!hd;I)Lclient!hd;")
	public static Class110 method3940(@OriginalArg(0) Class110 arg0) {
		if (arg0.anInt2649 != -1) {
			return Static235.method3185(arg0.anInt2649);
		}
		@Pc(25) int local25 = arg0.anInt2675 >>> 16;
		@Pc(30) Class106 local30 = new Class106(Static449.aClass67_37);
		for (@Pc(35) Class4_Sub8 local35 = (Class4_Sub8) local30.method1989(); local35 != null; local35 = (Class4_Sub8) local30.method1990()) {
			if (local25 == local35.anInt861) {
				return Static235.method3185((int) local35.aLong227);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
	public static void method3941(@OriginalArg(1) int arg0) {
		if (!Static131.method1881(arg0)) {
			return;
		}
		@Pc(19) Class110[] local19 = Static412.aClass110ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class110 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt2664 = 0;
				local27.anInt2624 = 0;
				local27.anInt2660 = 1;
			}
		}
	}
}
