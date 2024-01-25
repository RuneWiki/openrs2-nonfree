import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public static int anInt7891 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method6297(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static223.anInt4110;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class80 local27 = Static497.aClass309_1.method6959(arg0[local18]);
			if (local27.anInt1890 != -1) {
				@Pc(39) Class71 local39 = (Class71) Static342.aClass330_34.method7677((long) local27.anInt1890);
				if (local39 == null) {
					@Pc(47) Class177 local47 = Static593.method4148(Static114.aClass248_20, local27.anInt1890, 0);
					if (local47 != null) {
						local39 = Static554.aClass90_12.method7522(local47);
						Static342.aClass330_34.method7676(local39, (long) local27.anInt1890);
					}
				}
				if (local39 != null) {
					Static241.aClass71Array29[local11] = local39;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
