import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
	public static int anInt3954;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	public static int anInt3955;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "[S")
	public static final short[] aShortArray64 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Ljava/lang/String;")
	public static final String aString259 = "wave:";

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString260 = "Loading wordpack - ";

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "[I")
	public static int[] anIntArray550 = new int[2];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public static void method3580() {
		if (Static263.aClass202_1 != null) {
			@Pc(3) Class202 local3 = Static263.aClass202_1;
			synchronized (Static263.aClass202_1) {
				Static263.aClass202_1 = null;
			}
		}
	}
}
