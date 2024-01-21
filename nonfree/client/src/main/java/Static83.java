import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public static int anInt2043 = 0;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt2044 = 0;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	public static int anInt2045 = 0;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_617 = Static38.method685(":duelstake:");

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_618 = Static38.method685("(U5");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_619 = Static38.method685("headicons_prayer");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1328() {
		aClass6_618 = null;
		anIntArray149 = null;
		aClass6_617 = null;
		aClass6_619 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!wa;ZLclient!ai;)Lclient!ai;")
	public static Class6 method1329(@OriginalArg(0) Class87 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.method120(Static55.aClass6_411) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(18) int local18 = arg1.method120(Static64.aClass6_458);
			if (local18 == -1) {
				while (true) {
					local18 = arg1.method120(Static33.aClass6_251);
					if (local18 == -1) {
						while (true) {
							local18 = arg1.method120(Static62.aClass6_451);
							if (local18 == -1) {
								while (true) {
									local18 = arg1.method120(Static134.aClass6_905);
									if (local18 == -1) {
										while (true) {
											local18 = arg1.method120(aClass6_618);
											if (local18 == -1) {
												while (true) {
													local18 = arg1.method120(Static60.aClass6_393);
													if (local18 == -1) {
														return arg1;
													}
													@Pc(231) Class6 local231 = Static9.aClass6_71;
													if (Static172.aClass11_7 != null) {
														local231 = Static60.method925(Static172.aClass11_7.anInt465);
														try {
															if (Static172.aClass11_7.anObject2 != null) {
																@Pc(247) byte[] local247 = ((String) Static172.aClass11_7.anObject2).getBytes("ISO-8859-1");
																local231 = Static173.method2732(0, local247, local247.length);
															}
														} catch (@Pc(256) UnsupportedEncodingException local256) {
														}
													}
													arg1 = Static58.method956(new Class6[] { arg1.method111(local18, 0), local231, arg1.method119(local18 + 4) });
												}
											}
											arg1 = Static58.method956(new Class6[] { arg1.method111(local18, 0), Static57.method941(Static76.method1167(4, arg0)), arg1.method119(local18 + 2) });
										}
									}
									arg1 = Static58.method956(new Class6[] { arg1.method111(local18, 0), Static57.method941(Static76.method1167(3, arg0)), arg1.method119(local18 + 2) });
								}
							}
							arg1 = Static58.method956(new Class6[] { arg1.method111(local18, 0), Static57.method941(Static76.method1167(2, arg0)), arg1.method119(local18 + 2) });
						}
					}
					arg1 = Static58.method956(new Class6[] { arg1.method111(local18, 0), Static57.method941(Static76.method1167(1, arg0)), arg1.method119(local18 + 2) });
				}
			}
			arg1 = Static58.method956(new Class6[] { arg1.method111(local18, 0), Static57.method941(Static76.method1167(0, arg0)), arg1.method119(local18 + 2) });
		}
	}
}
