import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!al", name = "K", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!al", name = "O", descriptor = "Lclient!wr;")
	public static Class109 aClass109_3;

	@OriginalMember(owner = "client!al", name = "v", descriptor = "[I")
	public static final int[] anIntArray32 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!al", name = "I", descriptor = "[I")
	public static final int[] anIntArray33 = new int[50];

	@OriginalMember(owner = "client!al", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Lclient!aq;")
	public static Class12 method319(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static348.aClass12ArrayArray1[local12] == null || Static348.aClass12ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static279.method4856(local12);
			if (!local30) {
				return null;
			}
		}
		return Static348.aClass12ArrayArray1[local12][local16];
	}
}
