import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public static int anInt1848;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public static int anInt1845 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BII)Lclient!paa;")
	public static Class261 method1508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class261 local7 = Static357.method4826(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass261Array2 == null || arg1 >= local7.aClass261Array2.length) {
			return null;
		} else {
			return local7.aClass261Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method1509() {
		for (@Pc(3) int local3 = 0; local3 < Static174.anInt3080; local3++) {
			@Pc(16) int local16 = Static236.method3208(Static233.anInt3794 + local3, Static174.anInt3080) * Static176.anInt3100;
			for (@Pc(18) int local18 = 0; local18 < Static176.anInt3100; local18++) {
				@Pc(30) int local30 = local16 + Static236.method3208(Static472.anInt7535 + local18, Static176.anInt3100);
				if (Static70.anIntArray93[local30] == Static613.anInt9883) {
					Static319.anInterface4Array1[local30].method8302(0, 0, Static281.anInt4510, Static598.anInt9689, Static281.anInt4510 * local18, local3 * Static598.anInt9689);
				}
			}
		}
	}
}
