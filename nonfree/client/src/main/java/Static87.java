import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg6 < 0 || Static84.anInt1632 - 1 <= arg4 || arg6 >= Static261.anInt4480 - 1) {
			return;
		}
		if (Static30.aClass189ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface10 local46;
		if (arg3 == 0) {
			local46 = (Interface10) Static428.method5836(arg1, arg4, arg6);
			@Pc(52) Interface10 local52 = (Interface10) Static55.method1031(arg1, arg4, arg6);
			if (local46 != null && arg0 != 2) {
				if (local46 instanceof Class3_Sub1_Sub2) {
					((Class3_Sub1_Sub2) local46).aClass42_1.method963(arg5);
				} else {
					Static9.method129(arg6, arg0, arg1, arg2, local46.method5812(), arg3, arg5, arg4);
				}
			}
			if (local52 != null) {
				if (!(local52 instanceof Class3_Sub1_Sub2)) {
					Static9.method129(arg6, arg0, arg1, arg2, local52.method5812(), arg3, arg5, arg4);
					return;
				}
				((Class3_Sub1_Sub2) local52).aClass42_1.method963(arg5);
				return;
			}
			return;
		}
		if (arg3 != 1) {
			if (arg3 == 2) {
				local46 = (Interface10) Static49.method903(arg1, arg4, arg6, tf.class);
				if (local46 != null) {
					if (arg0 == 11) {
						arg0 = 10;
					}
					if (local46 instanceof Class3_Sub3_Sub2) {
						((Class3_Sub3_Sub2) local46).aClass42_2.method963(arg5);
						return;
					}
					Static9.method129(arg6, arg0, arg1, arg2, local46.method5812(), arg3, arg5, arg4);
					return;
				}
			} else if (arg3 == 3) {
				local46 = (Interface10) Static91.method1566(arg1, arg4, arg6);
				if (local46 == null) {
					return;
				}
				if (!(local46 instanceof Class3_Sub5_Sub1)) {
					Static9.method129(arg6, arg0, arg1, arg2, local46.method5812(), arg3, arg5, arg4);
					return;
				}
				((Class3_Sub5_Sub1) local46).aClass42_4.method963(arg5);
			} else {
				return;
			}
			return;
		}
		local46 = (Interface10) Static64.method1227(arg1, arg4, arg6);
		if (local46 == null) {
			return;
		}
		if (local46 instanceof Class3_Sub4_Sub3) {
			((Class3_Sub4_Sub3) local46).aClass42_3.method963(arg5);
			return;
		}
		@Pc(219) int local219 = local46.method5812();
		if (arg0 == 4 || arg0 == 5) {
			Static9.method129(arg6, 4, arg1, arg2, local219, arg3, arg5, arg4);
			return;
		}
		if (arg0 == 6) {
			Static9.method129(arg6, 4, arg1, arg2 + 4, local219, arg3, arg5, arg4);
		} else if (arg0 == 7) {
			Static9.method129(arg6, 4, arg1, (arg2 + 2 & 0x3) + 4, local219, arg3, arg5, arg4);
			return;
		} else if (arg0 == 8) {
			Static9.method129(arg6, 4, arg1, arg2 + 4, local219, arg3, arg5, arg4);
			Static9.method129(arg6, 4, arg1, (arg2 + 2 & 0x3) + 4, local219, arg3, arg5, arg4);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method1531() {
		Static354.method4992(Static332.aClass239_12);
		Static4.anInt33++;
		if (Static178.aBoolean96 && Static6.aBoolean9) {
			@Pc(30) int local30 = Static37.aClass71_26.method1618();
			@Pc(36) int local36 = Static37.aClass71_26.method1624();
			local36 -= Static241.anInt4098;
			local30 -= Static108.anInt1929;
			if (Static407.anInt6817 > local30) {
				local30 = Static407.anInt6817;
			}
			if (Static419.aClass239_16.anInt6435 + Static407.anInt6817 < Static332.aClass239_12.anInt6435 + local30) {
				local30 = Static419.aClass239_16.anInt6435 + Static407.anInt6817 - Static332.aClass239_12.anInt6435;
			}
			if (Static343.anInt5750 > local36) {
				local36 = Static343.anInt5750;
			}
			if (Static419.aClass239_16.anInt6408 + Static343.anInt5750 < Static332.aClass239_12.anInt6408 + local36) {
				local36 = Static419.aClass239_16.anInt6408 + Static343.anInt5750 - Static332.aClass239_12.anInt6408;
			}
			@Pc(105) int local105 = local30 + Static419.aClass239_16.anInt6495 - Static407.anInt6817;
			@Pc(113) int local113 = local36 + Static419.aClass239_16.anInt6438 - Static343.anInt5750;
			@Pc(159) Class6_Sub29 local159;
			if (Static37.aClass71_26.method1619()) {
				if (Static4.anInt33 > Static332.aClass239_12.anInt6471) {
					@Pc(126) int local126 = local30 - Static263.anInt4509;
					@Pc(130) int local130 = local36 - Static374.anInt6201;
					if (local126 > Static332.aClass239_12.anInt6478 || -Static332.aClass239_12.anInt6478 > local126 || local130 > Static332.aClass239_12.anInt6478 || local130 < -Static332.aClass239_12.anInt6478) {
						Static371.aBoolean411 = true;
					}
				}
				if (Static332.aClass239_12.anObjectArray13 != null && Static371.aBoolean411) {
					local159 = new Class6_Sub29();
					local159.anInt5268 = local113;
					local159.anInt5273 = local105;
					local159.aClass239_10 = Static332.aClass239_12;
					local159.anObjectArray4 = Static332.aClass239_12.anObjectArray13;
					Static308.method4424(local159);
					return;
				}
			} else {
				if (Static371.aBoolean411) {
					Static12.method160();
					if (Static332.aClass239_12.anObjectArray22 != null) {
						local159 = new Class6_Sub29();
						local159.anObjectArray4 = Static332.aClass239_12.anObjectArray22;
						local159.aClass239_9 = Static297.aClass239_6;
						local159.anInt5273 = local105;
						local159.aClass239_10 = Static332.aClass239_12;
						local159.anInt5268 = local113;
						Static308.method4424(local159);
					}
					if (Static297.aClass239_6 != null && Static54.method1014(Static332.aClass239_12) != null) {
						Static359.method5051(Static297.aClass239_6, Static332.aClass239_12);
					}
				} else if ((Static112.anInt6364 == 1 || Static208.method3243()) && Static228.anInt3878 > 2) {
					Static255.method3940(Static374.anInt6201 + Static241.anInt4098, Static263.anInt4509 + Static108.anInt1929);
				} else if (Static422.method5699()) {
					Static255.method3940(Static241.anInt4098 + Static374.anInt6201, Static263.anInt4509 + Static108.anInt1929);
				}
				Static332.aClass239_12 = null;
			}
		} else if (Static4.anInt33 > 1) {
			Static332.aClass239_12 = null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!qq;Lclient!tq;)V")
	public static void method1533(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class239 arg1) {
		@Pc(40) boolean local40 = Static354.aClass170_2.method3863(arg1.anInt6481, arg1.anInt6474, arg0, arg1.anInt6466, arg1.anInt6492, arg1.aBoolean429 ? Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1 : null, arg1.anInt6420 | 0xFF000000) == null;
		if (local40) {
			Static251.aClass88_35.method1878(new Class6_Sub40(arg1.anInt6492, arg1.anInt6466, arg1.anInt6481, arg1.anInt6420 | 0xFF000000, arg1.anInt6474, arg1.aBoolean429));
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZII)V")
	public static void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static299.anInt4962; local7++) {
			@Pc(13) Rectangle local13 = Class121.aRectangleArray2[local7];
			if (arg3 < local13.x + local13.width && local13.x < arg3 + arg2 && arg0 < local13.y + local13.height && arg1 + arg0 > local13.y) {
				Static194.aBooleanArray25[local7] = true;
			}
		}
	}
}
