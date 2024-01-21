import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "J")
	public static long aLong71;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public static int anInt2545 = 0;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1214 = Static87.method1648(" has logged out)3");

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1215 = Static87.method1648("Empf-=nger:");

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt2546 = 0;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1216 = Static87.method1648("Fallen lassen");

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1217 = aClass27_1214;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1218 = Static87.method1648(" Millionen");

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1219 = Static87.method1648("redstone2");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!qd;IIBZ)V")
	public static void method1748(@OriginalArg(1) int arg0, @OriginalArg(2) Class54_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) long local10 = (long) ((arg3 << 1444921616) + arg0);
		@Pc(18) Class3_Sub3_Sub16 local18 = (Class3_Sub3_Sub16) Static35.aClass14_3.method317(local10);
		if (local18 != null) {
			return;
		}
		local18 = (Class3_Sub3_Sub16) Static36.aClass14_4.method317(local10);
		if (local18 != null) {
			return;
		}
		local18 = (Class3_Sub3_Sub16) Static8.aClass14_1.method317(local10);
		if (local18 == null) {
			if (!arg5) {
				local18 = (Class3_Sub3_Sub16) Static64.aClass14_5.method317(local10);
				if (local18 != null) {
					return;
				}
			}
			local18 = new Class3_Sub3_Sub16();
			local18.anInt2762 = arg2;
			local18.aByte3 = arg4;
			local18.aClass54_Sub1_51 = arg1;
			if (arg5) {
				Static35.aClass14_3.method321(local10, local18);
				Static48.anInt2393++;
			} else {
				Static61.aClass11_2.method253(local18);
				Static8.aClass14_1.method321(local10, local18);
				Static19.anInt459++;
			}
		} else if (arg5) {
			local18.method1892();
			Static35.aClass14_3.method321(local10, local18);
			Static48.anInt2393++;
			Static19.anInt459--;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
	public static int method1749(@OriginalArg(1) int arg0) {
		@Pc(3) Class3_Sub3_Sub13 local3 = Static86.method1639(arg0);
		@Pc(10) int local10 = local3.anInt2583;
		@Pc(18) int local18 = local3.anInt2573;
		@Pc(21) int local21 = local3.anInt2584;
		@Pc(28) int local28 = Class2.anIntArray7[local21 - local18];
		return Static18.anIntArray60[local10] >> local18 & local28;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method1750() {
		aClass27_1219 = null;
		aClass27_1215 = null;
		aClass27_1217 = null;
		aClass27_1214 = null;
		aClass27_1216 = null;
		aClass27_1218 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1751() {
		@Pc(3) Class53 local3 = Static15.aClass53_1;
		synchronized (Static15.aClass53_1) {
			Static65.anInt1666 = Static3.anInt95;
			@Pc(15) int local15;
			if (Static82.anInt2201 >= 0) {
				while (Static94.anInt2552 != Static82.anInt2201) {
					local15 = Static10.anIntArray50[Static94.anInt2552];
					Static94.anInt2552 = Static94.anInt2552 + 1 & 0x7F;
					if (local15 >= 0) {
						Static10.aBooleanArray3[local15] = true;
					} else {
						Static10.aBooleanArray3[~local15] = false;
					}
				}
			} else {
				for (local15 = 0; local15 < 112; local15++) {
					Static10.aBooleanArray3[local15] = false;
				}
				Static82.anInt2201 = Static94.anInt2552;
			}
			Static3.anInt95 = Static32.anInt810;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!hb;Lclient!m;)Lclient!hb;")
	public static Class27 method1752(@OriginalArg(1) Class27 arg0, @OriginalArg(2) Class3_Sub3_Sub6 arg1) {
		if (arg0.method739(Static65.aClass27_808) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(13) int local13 = arg0.method739(Static37.aClass27_444);
			if (local13 == -1) {
				while (true) {
					local13 = arg0.method739(Static66.aClass27_838);
					if (local13 == -1) {
						while (true) {
							local13 = arg0.method739(Static102.aClass27_1291);
							if (local13 == -1) {
								while (true) {
									local13 = arg0.method739(Static91.aClass27_1180);
									if (local13 == -1) {
										while (true) {
											local13 = arg0.method739(Static97.aClass27_1076);
											if (local13 == -1) {
												while (true) {
													local13 = arg0.method739(Static81.aClass27_1040);
													if (local13 == -1) {
														return arg0;
													}
													@Pc(226) Class27 local226 = Static45.aClass27_182;
													if (Static76.aClass64_7 != null) {
														local226 = Static3.method69(Static76.aClass64_7.anInt2677);
														try {
															if (Static76.aClass64_7.anObject6 != null) {
																@Pc(242) byte[] local242 = ((String) Static76.aClass64_7.anObject6).getBytes("ISO-8859-1");
																local226 = Static8.method180(local242, 0, local242.length);
															}
														} catch (@Pc(251) UnsupportedEncodingException local251) {
														}
													}
													arg0 = Static98.method1779(new Class27[] { arg0.method747(0, local13), local226, arg0.method731(local13 + 4) });
												}
											}
											arg0 = Static98.method1779(new Class27[] { arg0.method747(0, local13), Static17.method308(Static10.method229(4, arg1)), arg0.method731(local13 + 2) });
										}
									}
									arg0 = Static98.method1779(new Class27[] { arg0.method747(0, local13), Static17.method308(Static10.method229(3, arg1)), arg0.method731(local13 + 2) });
								}
							}
							arg0 = Static98.method1779(new Class27[] { arg0.method747(0, local13), Static17.method308(Static10.method229(2, arg1)), arg0.method731(local13 + 2) });
						}
					}
					arg0 = Static98.method1779(new Class27[] { arg0.method747(0, local13), Static17.method308(Static10.method229(1, arg1)), arg0.method731(local13 + 2) });
				}
			}
			arg0 = Static98.method1779(new Class27[] { arg0.method747(0, local13), Static17.method308(Static10.method229(0, arg1)), arg0.method731(local13 + 2) });
		}
	}
}
