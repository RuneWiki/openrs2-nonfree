import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
	public static int anInt823;

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
	private static int anInt825;

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
	private static int anInt826;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
	private static int anInt827;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_17 = new Class117("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Lclient!ec;")
	public static final Class58 aClass58_9 = new Class58(16);

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
	public static int anInt820 = 0;

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
	public static int anInt821 = 0;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "[I")
	public static final int[] anIntArray61 = new int[13];

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	public static final int anInt822 = -1;

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "Lclient!ms;")
	public static Class137 aClass137_2 = null;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
	public static void method613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		@Pc(7) Class10_Sub7 local7 = new Class10_Sub7();
		local7.aString63 = arg5;
		local7.anInt6372 = arg3 + Static293.anInt5807;
		local7.anInt6370 = arg0;
		local7.anInt6375 = arg4;
		local7.anInt6371 = arg2;
		local7.anInt6374 = arg1;
		Static44.aClass210_3.method5612(local7);
	}

	@OriginalMember(owner = "client!gd", name = "providesignlink", descriptor = "(Lclient!ko;)V")
	private static void method615(@OriginalArg(0) Class118 arg0) {
		Static77.aClass118_7 = arg0;
		Static142.aClass118_3 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
