import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_51 = new Class88("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_20 = new Class77(82, 4);

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "[Lclient!bea;")
	public static final Class30_Sub1_Sub1_Sub1[] aClass30_Sub1_Sub1_Sub1Array1 = new Class30_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_8 = new Class202(3, 14);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIB)V")
	public static void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static293.aClass138_7 == Static518.aClass138_8) {
			if (!Static9.method274(1, arg0, -2, arg1, 0, false, 0, 1)) {
				Static9.method274(1, arg0, -3, arg1, 0, false, 0, 1);
			}
		} else if (!Static9.method274(1, arg0, -3, arg1, 0, false, 0, 1)) {
			Static9.method274(1, arg0, -2, arg1, 0, false, 0, 1);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZI)V")
	public static void method1969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class12_Sub4_Sub1 local13 = Static389.method6156(15, 0);
		local13.method820();
		local13.anInt808 = arg1;
		local13.anInt806 = arg0;
	}
}
