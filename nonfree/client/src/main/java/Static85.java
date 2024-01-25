import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard4;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt3260;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt3261;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_45 = new Class44(36, 3);

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt3262 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Lclient!cr;")
	public static Class41 method2627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class41 local7 = Static160.method2564(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass41Array1 == null || local7.aClass41Array1.length <= arg1) {
			return null;
		} else {
			return local7.aClass41Array1[arg1];
		}
	}
}
