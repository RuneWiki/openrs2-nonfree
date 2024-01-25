import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!pn;")
	public static final Class249 aClass249_2 = new Class249();

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_28 = new Class160(65, 3);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public static void method1430() {
		Static502.aClass97Array2 = null;
		Static154.method2267(0, Static487.anInt8139, 0, Static476.anInt8045, Static502.anInt8364, 0, 0, -1);
		if (Static502.aClass97Array2 != null) {
			Static436.method6279(Static340.aClass97_9.anInt2353, 0, Static50.anInt846, Static502.aClass97Array2, -1412584499, 0, Static502.anInt8364, Static476.anInt8045, Static109.anInt9293);
			Static502.aClass97Array2 = null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BIII)I")
	public static int method1432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(27) int local27 = local13 * (arg1 & 0x7F) + (arg0 & 0x7F) * arg2 >> 7;
		@Pc(47) int local47 = (arg1 & 0x380) * local13 + (arg0 & 0x380) * arg2 >> 7;
		@Pc(61) int local61 = (arg1 & 0xFC00) * local13 + (arg0 & 0xFC00) * arg2 >> 7;
		return local61 & 0xFC00 | local47 & 0x380 | local27 & 0x7F;
	}
}
