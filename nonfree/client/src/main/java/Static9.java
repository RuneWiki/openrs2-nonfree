import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
	public static int anInt175;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_3 = new Class274(6, -2);

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_2 = new Class269(9, 6);

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	public static int anInt176 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V")
	public static void method190() {
		@Pc(1) Class233 local1 = Static42.aClass233_2;
		synchronized (Static42.aClass233_2) {
			Static42.aClass233_2.method5664(5);
		}
		local1 = Static58.aClass233_5;
		synchronized (Static58.aClass233_5) {
			Static58.aClass233_5.method5664(5);
		}
	}
}
