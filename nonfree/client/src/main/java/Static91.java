import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_27 = new Class267("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!ei", name = "V", descriptor = "[I")
	public static final int[] anIntArray119 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_10 = new Class238(1, 15);

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "Lclient!qj;")
	public static Class6_Sub30 aClass6_Sub30_2 = null;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "S")
	public static short aShort32 = 256;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BZ)V")
	public static void method1637(@OriginalArg(1) boolean arg0) {
		Static329.anInt5679 = 0;
		Static263.anInt4750 = 0;
		Static93.method1660();
		Static264.method4048(arg0);
		Static222.method3349();
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static329.anInt5679; local20++) {
			local26 = Static385.anIntArray470[local20];
			if (Static66.anInt1741 != Static308.aClass3_Sub2_Sub1_Sub1Array1[local26].anInt6586) {
				if (Static308.aClass3_Sub2_Sub1_Sub1Array1[local26].aClass48_1.method1384()) {
					Static5.method202(Static308.aClass3_Sub2_Sub1_Sub1Array1[local26]);
				}
				Static308.aClass3_Sub2_Sub1_Sub1Array1[local26].method1318(null);
				Static308.aClass3_Sub2_Sub1_Sub1Array1[local26] = null;
			}
		}
		if (Static232.aClass6_Sub1_Sub1_4.anInt7898 != Static334.anInt5833) {
			throw new RuntimeException("gnp1 pos:" + Static232.aClass6_Sub1_Sub1_4.anInt7898 + " psize:" + Static334.anInt5833);
		}
		for (local26 = 0; local26 < Static136.anInt2887; local26++) {
			if (Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local26]] == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static136.anInt2887);
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)Z")
	public static boolean method1639() {
		return Static170.aClass193_5 != Static136.aClass193_3 || Static291.anInt5199 >= 2;
	}
}
