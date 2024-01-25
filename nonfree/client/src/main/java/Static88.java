import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public static int anInt1187 = 0;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lclient!ld;")
	public static final Class147[] aClass147Array1 = new Class147[4];

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "[Lclient!ie;")
	public static final Class115[] aClass115Array1 = new Class115[30];

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_22 = new Class142("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString13 = "";

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1055(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg2); local14 != -1; local14 = arg0.indexOf(arg2, arg1.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg1 + arg0.substring(local14 + arg2.length());
		}
		return arg0;
	}
}
