import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_35 = new Class45("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_92 = new Class305(55, -1);

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public static int anInt2056 = 0;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	public static int anInt2057 = 0;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZII)I")
	public static int method1973(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class1_Sub8 local10 = Static271.method4828(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray119.length; local24++) {
				if (local10.anIntArray118[local24] == arg2) {
					local22 += local10.anIntArray119[local24];
				}
			}
			return local22;
		}
	}
}
