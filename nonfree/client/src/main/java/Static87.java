import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!et", name = "db", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!et", name = "fb", descriptor = "I")
	public static int anInt1642;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_37 = new Class140(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!et", name = "R", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_70 = new Class221(25, 5);

	@OriginalMember(owner = "client!et", name = "bb", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_71 = new Class221(83, 20);

	@OriginalMember(owner = "client!et", name = "cb", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_38 = new Class140("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!et", name = "eb", descriptor = "I")
	public static int anInt1641 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!jk;)I")
	public static int method1734(@OriginalArg(1) Class2_Sub12_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method3172(2);
		@Pc(33) int local33;
		if (local15 == 0) {
			local33 = 0;
		} else if (local15 == 1) {
			local33 = arg0.method3172(5);
		} else if (local15 == 2) {
			local33 = arg0.method3172(8);
		} else {
			local33 = arg0.method3172(11);
		}
		return local33;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Lclient!dh;")
	public static Class2_Sub8 method1736() {
		if (Static202.aClass180_34 == null || Static244.aClass91_1 == null) {
			return null;
		}
		Static244.aClass91_1.method2442(Static202.aClass180_34);
		@Pc(23) Class2_Sub8 local23 = (Class2_Sub8) Static244.aClass91_1.method2446();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class66 local32 = Static312.method5209(local23.anInt1039);
			return local32 != null && local32.aBoolean154 && local32.method1811() ? local23 : Static200.method3772();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(JB)V")
	public static void method1737(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}
}
