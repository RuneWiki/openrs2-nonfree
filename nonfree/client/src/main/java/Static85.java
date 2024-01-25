import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "Lclient!pj;")
	public static Class248 aClass248_14;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Lclient!bc;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!oa;IZ)Lclient!gg;")
	public static Class118 method1185(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1) {
		if (arg0 == -1) {
			return null;
		}
		if (Static98.anIntArray146 != null) {
			for (@Pc(16) int local16 = 0; local16 < Static98.anIntArray146.length; local16++) {
				if (Static98.anIntArray146[local16] == arg0) {
					return Static564.aClass118Array1[local16];
				}
			}
		}
		@Pc(43) Class118 local43 = (Class118) Static293.aClass330_32.method7677((long) arg0);
		if (local43 != null) {
			if (local43.aClass202_8 == null) {
				@Pc(55) Class202 local55 = Static258.method3974(aClass248_14, arg0);
				if (local55 == null) {
					return null;
				}
				local43.aClass202_8 = local55;
			}
			return local43;
		}
		@Pc(68) Class177[] local68 = Static593.method4141(Static585.aClass248_57, arg0);
		if (local68 == null) {
			return null;
		}
		@Pc(77) Class202 local77 = Static258.method3974(aClass248_14, arg0);
		if (local77 == null) {
			return null;
		} else {
			local43 = new Class118(arg1.method7523(local77, local68), local77);
			Static293.aClass330_32.method7676(local43, (long) arg0);
			return local43;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	public static void method1186() {
		Static342.aClass330_35.method7688();
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)[Lclient!pq;")
	public static Class252[] method1187() {
		return new Class252[] { Static321.aClass252_1, Static321.aClass252_2, Static321.aClass252_3, Static321.aClass252_4, Static321.aClass252_5, Static321.aClass252_6, Static321.aClass252_7, Static321.aClass252_8, Static321.aClass252_9, Static321.aClass252_10, Static321.aClass252_11, Static321.aClass252_12, Static321.aClass252_13, Static321.aClass252_14 };
	}
}
