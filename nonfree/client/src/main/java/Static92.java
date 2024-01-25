import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "Z")
	public static final boolean aBoolean200 = false;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)Z")
	public static boolean method1913() {
		if (Static361.aBoolean581) {
			try {
				Static682.method3657("showVideoAd", Static639.anApplet2);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}
}
