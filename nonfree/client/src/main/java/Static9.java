import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!al", name = "y", descriptor = "I")
	public static int anInt252;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_5 = new Class32(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
	public static int[] anIntArray76 = new int[2];

	@OriginalMember(owner = "client!al", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString6 = null;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IC)C")
	public static char method193(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
	public static void method194(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static138.anInt932 <= arg2 && arg2 <= Static40.anInt818) {
			@Pc(23) int local23 = Static93.method1862(arg3, Static235.anInt4193, Static243.anInt4326);
			@Pc(29) int local29 = Static93.method1862(arg0, Static235.anInt4193, Static243.anInt4326);
			Static339.method4975(local29, arg1, arg2, local23);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZII)V")
	public static void method195(@OriginalArg(1) boolean arg0) {
		Static42.anInt4820 = 22050;
		Static44.aBoolean66 = arg0;
		Static208.anInt3821 = 2;
	}
}
