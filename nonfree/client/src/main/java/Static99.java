import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_54 = new Class209("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1879(@OriginalArg(1) String arg0) {
		if (Static311.aStringArray39 == null) {
			Static325.method4535();
		}
		@Pc(18) String[] local18 = Static455.method4448('\n', arg0);
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			for (@Pc(24) int local24 = Static155.anInt3171; local24 > 0; local24--) {
				Static311.aStringArray39[local24] = Static311.aStringArray39[local24 - 1];
			}
			Static311.aStringArray39[0] = local18[local20];
			if (Static155.anInt3171 < Static311.aStringArray39.length - 1) {
				Static155.anInt3171++;
				if (Static161.anInt6991 > 0) {
					Static161.anInt6991++;
				}
			}
		}
	}
}
