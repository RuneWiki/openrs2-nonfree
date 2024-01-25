import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public static int anInt1869;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!de", name = "x", descriptor = "[I")
	public static final int[] anIntArray118 = new int[5];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BB)Z")
	public static boolean method1551(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub22 local8 = new Class5_Sub22(arg0);
		@Pc(12) int local12 = local8.method5966();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method5966() == 1;
		if (local30) {
			Static574.method8329(local8);
		}
		Static178.method2717(local8);
		return true;
	}
}
