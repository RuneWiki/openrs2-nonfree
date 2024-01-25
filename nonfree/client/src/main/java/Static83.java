import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
	public static int anInt1536;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "[I")
	public static final int[] anIntArray74 = new int[200];

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "Lclient!of;")
	public static final Class174 aClass174_55 = new Class174("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(JI)V")
	public static void method1499(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static232.method3383(arg0 - 1L);
			Static232.method3383(1L);
		} else {
			Static232.method3383(arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
	public static int method1500() {
		return 6;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public static void method1501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(14, arg1);
		local8.method1003();
		local8.anInt972 = arg0;
	}
}
