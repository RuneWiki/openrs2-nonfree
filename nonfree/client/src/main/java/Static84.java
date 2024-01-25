import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)Lclient!dea;")
	public static Class2_Sub3 method2069(@OriginalArg(0) int arg0) {
		if (Static476.anInt7308 == Static275.anInt5397) {
			return new Class2_Sub3(arg0);
		} else {
			@Pc(6) Class2_Sub3 local6 = Static202.aClass2_Sub3Array3[Static275.anInt5397];
			Static275.anInt5397 = Static275.anInt5397 + 1 & Static144.anIntArray263[Static309.anInt5935];
			local6.method2070(arg0);
			return local6;
		}
	}
}
