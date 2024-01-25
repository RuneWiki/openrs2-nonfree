import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!jn;")
	public static Class176 aClass176_31;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)I")
	public static int method2107(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static24.anInt388 - 1; local3++) {
			if (arg0 < Static113.anIntArray122[local3] + Static339.anIntArray335[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static24.anInt388 - 1;
		}
		return local1;
	}
}
