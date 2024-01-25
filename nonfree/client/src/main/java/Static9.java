import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_7 = new Class103(20, 3);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIIIII)V")
	public static void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg4);
		@Pc(17) int local17 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg1);
		@Pc(23) int local23 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5);
		@Pc(29) int local29 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg3);
		@Pc(37) int local37 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg0 + arg4);
		@Pc(46) int local46 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg1 - arg0);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static2.method38(local29, arg2, Static67.anIntArrayArray13[local48], local23);
		}
		for (@Pc(76) int local76 = local17; local76 > local46; local76--) {
			Static2.method38(local29, arg2, Static67.anIntArrayArray13[local76], local23);
		}
		@Pc(98) int local98 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 + arg0);
		@Pc(106) int local106 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg3 - arg0);
		for (@Pc(108) int local108 = local37; local108 <= local46; local108++) {
			@Pc(114) int[] local114 = Static67.anIntArrayArray13[local108];
			Static2.method38(local98, arg2, local114, local23);
			Static2.method38(local29, arg2, local114, local106);
		}
	}
}
