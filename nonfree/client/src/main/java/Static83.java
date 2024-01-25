import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public static int anInt1418;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_58 = new Class196(28, 3);

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Lclient!ofa;")
	public static final Class255 aClass255_1 = new Class255(1);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZ)I")
	public static int method1293(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub48 local12 = Static386.method5663(false, arg0);
		if (local12 == null) {
			return Static347.aClass268_1.method6614(arg0).anInt6224;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local12.anIntArray497.length; local24++) {
			if (local12.anIntArray497[local24] == -1) {
				local22++;
			}
		}
		return local22 + Static347.aClass268_1.method6614(arg0).anInt6224 - local12.anIntArray497.length;
	}
}
