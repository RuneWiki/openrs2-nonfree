import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!dha", name = "J", descriptor = "I")
	public static int anInt1605;

	@OriginalMember(owner = "client!dha", name = "G", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!dha", name = "O", descriptor = "I")
	public static int anInt1610;

	@OriginalMember(owner = "client!dha", name = "L", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_17 = new Class168(4);

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLclient!rfa;)Z")
	public static boolean method1507(@OriginalArg(1) Class313 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean546) {
			return false;
		} else if (!arg0.method7057(Static491.anInterface1_2)) {
			return false;
		} else if (Static582.aClass306_42.method6943((long) arg0.anInt8168) == null) {
			return Static555.aClass306_40.method6943((long) arg0.anInt8176) == null;
		} else {
			return false;
		}
	}
}
