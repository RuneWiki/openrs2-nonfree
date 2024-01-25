import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_59 = new Class211(73, 6);

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_45 = new Class134("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public static int anInt2403 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
	public static int method1991(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
