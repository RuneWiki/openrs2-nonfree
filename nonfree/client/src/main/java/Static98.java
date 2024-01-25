import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	public static int anInt2002;

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "Lclient!dr;")
	public static Class37 aClass37_5;

	@OriginalMember(owner = "client!fm", name = "R", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_11 = new Class107(32);

	@OriginalMember(owner = "client!fm", name = "T", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_49 = new Class140("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
	public static int anInt2019 = -1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)Lclient!fb;")
	public static Class2_Sub9_Sub4 method1971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class2_Sub9_Sub4 local20 = (Class2_Sub9_Sub4) Static175.aClass41_18.method902((long) arg0 << 32 | (long) arg1);
		if (local20 == null) {
			local20 = new Class2_Sub9_Sub4(arg0, arg1);
			Static175.aClass41_18.method901(local20, local20.aLong219);
		}
		return local20;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!eq;Lclient!dr;)I")
	public static int method1972(@OriginalArg(1) Class63 arg0, @OriginalArg(2) Class37 arg1) {
		if (arg0.anInt1569 != -1) {
			return arg0.anInt1569;
		}
		if (arg0.anInt1559 != -1) {
			@Pc(27) Class89 local27 = Static358.anInterface3_7.method166(arg1.method3738() ? arg0.anInt1559 : arg0.anInt1570);
			if (!local27.aBoolean250) {
				return local27.aShort40;
			}
		}
		return arg0.anInt1560;
	}
}
