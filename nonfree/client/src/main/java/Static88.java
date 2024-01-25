import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "[Lclient!sf;")
	public static Class308[] aClass308Array1;

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
	public static int anInt1884 = 0;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)Lclient!wl;")
	public static Class3_Sub51 method1707() {
		if (Static44.aClass112_72 == null || Static390.aClass202_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub51 local21 = (Class3_Sub51) Static390.aClass202_1.method4670(); local21 != null; local21 = (Class3_Sub51) Static390.aClass202_1.method4670()) {
			@Pc(31) Class174 local31 = Static44.aClass102_4.method2925(local21.anInt9426);
			if (local31 != null && local31.aBoolean352 && local31.method4116(Static44.anInterface9_2)) {
				return local21;
			}
		}
		return null;
	}
}
