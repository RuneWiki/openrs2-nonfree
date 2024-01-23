import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!j", name = "H", descriptor = "I")
	public static int anInt2119;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "[[[Lclient!df;")
	private static Class2_Sub12[][][] aClass2_Sub12ArrayArrayArray1;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "Lclient!qe;")
	public static Class78 aClass78_466 = Static199.method3560("k");

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!qe;")
	public static Class78 aClass78_467 = Static199.method3560("Art");

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
	public static void method1679() {
		if (Static114.aBrowsercontrol1 != null) {
			Static114.aBrowsercontrol1.method2448();
		}
		Static100.method1728(Static79.aCanvas2);
		Static25.method327(Static79.aCanvas2);
		if (Static57.aClass23_2 != null) {
			Static57.aClass23_2.method548(Static79.aCanvas2);
		}
		Static161.method2906();
		Static157.method2816(Static79.aCanvas2);
		Static18.method264(Static79.aCanvas2);
		if (Static57.aClass23_2 != null) {
			Static57.aClass23_2.method545(Static79.aCanvas2);
		}
		if (Static114.aBrowsercontrol1 != null && Static23.aCanvas1 != null) {
			Static114.aBrowsercontrol1.method2447(Static23.aCanvas1);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
	public static int method1681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!qe;Lclient!mj;Z)Lclient!qe;")
	public static Class78 method1682(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class64 arg1) {
		if (arg0.method3036(Static70.aClass78_576) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(12) int local12 = arg0.method3036(Static34.aClass78_105);
			if (local12 == -1) {
				while (true) {
					local12 = arg0.method3036(Static109.aClass78_519);
					if (local12 == -1) {
						while (true) {
							local12 = arg0.method3036(Static81.aClass78_392);
							if (local12 == -1) {
								while (true) {
									local12 = arg0.method3036(Static139.aClass78_551);
									if (local12 == -1) {
										while (true) {
											local12 = arg0.method3036(Static176.aClass78_708);
											if (local12 == -1) {
												while (true) {
													local12 = arg0.method3036(Static105.aClass78_503);
													if (local12 == -1) {
														return arg0;
													}
													@Pc(225) Class78 local225 = Static73.aClass78_352;
													if (Static201.aClass33_16 != null) {
														local225 = Static91.method1598(Static201.aClass33_16.anInt949);
														try {
															if (Static201.aClass33_16.anObject2 != null) {
																@Pc(241) byte[] local241 = ((String) Static201.aClass33_16.anObject2).getBytes("ISO-8859-1");
																local225 = Static48.method629(local241.length, 0, local241);
															}
														} catch (@Pc(250) UnsupportedEncodingException local250) {
														}
													}
													arg0 = Static94.method1640(new Class78[] { arg0.method3010(0, local12), local225, arg0.method3052(local12 + 4) });
												}
											}
											arg0 = Static94.method1640(new Class78[] { arg0.method3010(0, local12), Static97.method1687(Static201.method3582(arg1, 4)), arg0.method3052(local12 + 2) });
										}
									}
									arg0 = Static94.method1640(new Class78[] { arg0.method3010(0, local12), Static97.method1687(Static201.method3582(arg1, 3)), arg0.method3052(local12 + 2) });
								}
							}
							arg0 = Static94.method1640(new Class78[] { arg0.method3010(0, local12), Static97.method1687(Static201.method3582(arg1, 2)), arg0.method3052(local12 + 2) });
						}
					}
					arg0 = Static94.method1640(new Class78[] { arg0.method3010(0, local12), Static97.method1687(Static201.method3582(arg1, 1)), arg0.method3052(local12 + 2) });
				}
			}
			arg0 = Static94.method1640(new Class78[] { arg0.method3010(0, local12), Static97.method1687(Static201.method3582(arg1, 0)), arg0.method3052(local12 + 2) });
		}
	}
}
