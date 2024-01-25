import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)[Lclient!dm;")
	public static Class71[] method1698() {
		if (Static489.aClass71Array1 == null) {
			@Pc(16) Class71[] local16 = Static570.method7638(Static352.aClass272_2);
			@Pc(20) Class71[] local20 = new Class71[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = Static140.aClass6_Sub48_Sub1_1.method7381(Static560.anInt9242);
			@Pc(91) int local91;
			@Pc(97) Class71 local97;
			label69: for (@Pc(31) int local31 = 0; local31 < local16.length; local31++) {
				@Pc(37) Class71 local37 = local16[local31];
				if ((local37.anInt1788 <= 0 || local37.anInt1788 >= 24) && local37.anInt1785 >= 800 && local37.anInt1784 >= 600 && (local29 != 2 || local37.anInt1785 <= 800 && local37.anInt1784 <= 600) && (local29 != 1 || local37.anInt1785 <= 1024 && local37.anInt1784 <= 768)) {
					for (local91 = 0; local91 < local22; local91++) {
						local97 = local20[local91];
						if (local97.anInt1785 == local37.anInt1785 && local97.anInt1784 == local37.anInt1784) {
							if (local37.anInt1788 > local97.anInt1788) {
								local20[local91] = local37;
							}
							continue label69;
						}
					}
					local20[local22] = local37;
					local22++;
				}
			}
			Static489.aClass71Array1 = new Class71[local22];
			Static601.method2934(local20, 0, Static489.aClass71Array1, 0, local22);
			@Pc(153) int[] local153 = new int[Static489.aClass71Array1.length];
			for (local91 = 0; local91 < Static489.aClass71Array1.length; local91++) {
				local97 = Static489.aClass71Array1[local91];
				local153[local91] = local97.anInt1785 * local97.anInt1784;
			}
			Static569.method7616(Static489.aClass71Array1, local153);
		}
		return Static489.aClass71Array1;
	}
}
