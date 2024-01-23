import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!jd;")
	public static Class84 aClass84_40;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "Lclient!tk;")
	public static Class2_Sub26_Sub1 aClass2_Sub26_Sub1_1 = new Class2_Sub26_Sub1(5000);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method1825(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static21.method454(Static61.method2447(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method1826(@OriginalArg(1) Class84 arg0) {
		Static87.aClass84_36 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Lclient!nf;")
	public static Class2_Sub3_Sub18 method1828() {
		return Static197.aClass2_Sub3_Sub18_2;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public static void method1829(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static249.method3997(arg0)) {
			return;
		}
		@Pc(22) Class115[] local22 = Static219.aClass115ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(36) Class115 local36 = local22[local24];
			if (local36.anObjectArray3 != null) {
				@Pc(44) Class2_Sub6 local44 = new Class2_Sub6();
				local44.aClass115_4 = local36;
				local44.anObjectArray1 = local36.anObjectArray3;
				Static295.method4894(local44, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
	public static void method1830() {
		Static21.anInt518 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static72.anInt1555; local3++) {
			@Pc(10) Class58 local10 = Static173.aClass58Array2[local3];
			@Pc(14) int local14;
			if (Static32.anIntArray48 != null) {
				for (local14 = 0; local14 < Static32.anIntArray48.length; local14++) {
					if (Static32.anIntArray48[local14] != -1000000 && (local10.anInt1642 <= Static32.anIntArray48[local14] || local10.anInt1633 <= Static32.anIntArray48[local14]) && (local10.anInt1639 <= Static163.anIntArray258[local14] || local10.anInt1635 <= Static163.anIntArray258[local14]) && (local10.anInt1639 >= Static208.anIntArray357[local14] || local10.anInt1635 >= Static208.anIntArray357[local14]) && (local10.anInt1626 <= Static195.anIntArray328[local14] || local10.anInt1637 <= Static195.anIntArray328[local14]) && (local10.anInt1626 >= Static188.anIntArray318[local14] || local10.anInt1637 >= Static188.anIntArray318[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt1629 == 1) {
				local14 = local10.anInt1641 + Static92.anInt2034 - Static53.anInt1215;
				if (local14 >= 0 && local14 <= Static92.anInt2034 + Static92.anInt2034) {
					local115 = local10.anInt1624 + Static92.anInt2034 - Static210.anInt4375;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1640 + Static92.anInt2034 - Static210.anInt4375;
					if (local126 > Static92.anInt2034 + Static92.anInt2034) {
						local126 = Static92.anInt2034 + Static92.anInt2034;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static121.aBooleanArrayArray3[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static77.anInt1648 - local10.anInt1639;
						if (local158 > 32) {
							local10.anInt1643 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1643 = 2;
							local158 = -local158;
						}
						local10.anInt1631 = (local10.anInt1626 - Static173.anInt3690 << 8) / local158;
						local10.anInt1623 = (local10.anInt1637 - Static173.anInt3690 << 8) / local158;
						local10.anInt1634 = (local10.anInt1642 - Static189.anInt3965 << 8) / local158;
						local10.anInt1636 = (local10.anInt1633 - Static189.anInt3965 << 8) / local158;
						Static47.aClass58Array1[Static21.anInt518++] = local10;
					}
				}
			} else if (local10.anInt1629 == 2) {
				local14 = local10.anInt1624 + Static92.anInt2034 - Static210.anInt4375;
				if (local14 >= 0 && local14 <= Static92.anInt2034 + Static92.anInt2034) {
					local115 = local10.anInt1641 + Static92.anInt2034 - Static53.anInt1215;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1645 + Static92.anInt2034 - Static53.anInt1215;
					if (local126 > Static92.anInt2034 + Static92.anInt2034) {
						local126 = Static92.anInt2034 + Static92.anInt2034;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static121.aBooleanArrayArray3[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static173.anInt3690 - local10.anInt1626;
						if (local158 > 32) {
							local10.anInt1643 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1643 = 4;
							local158 = -local158;
						}
						local10.anInt1630 = (local10.anInt1639 - Static77.anInt1648 << 8) / local158;
						local10.anInt1632 = (local10.anInt1635 - Static77.anInt1648 << 8) / local158;
						local10.anInt1634 = (local10.anInt1642 - Static189.anInt3965 << 8) / local158;
						local10.anInt1636 = (local10.anInt1633 - Static189.anInt3965 << 8) / local158;
						Static47.aClass58Array1[Static21.anInt518++] = local10;
					}
				}
			} else if (local10.anInt1629 == 4) {
				local14 = local10.anInt1642 - Static189.anInt3965;
				if (local14 > 128) {
					local115 = local10.anInt1624 + Static92.anInt2034 - Static210.anInt4375;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1640 + Static92.anInt2034 - Static210.anInt4375;
					if (local126 > Static92.anInt2034 + Static92.anInt2034) {
						local126 = Static92.anInt2034 + Static92.anInt2034;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt1641 + Static92.anInt2034 - Static53.anInt1215;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt1645 + Static92.anInt2034 - Static53.anInt1215;
						if (local158 > Static92.anInt2034 + Static92.anInt2034) {
							local158 = Static92.anInt2034 + Static92.anInt2034;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static121.aBooleanArrayArray3[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt1643 = 5;
							local10.anInt1630 = (local10.anInt1639 - Static77.anInt1648 << 8) / local14;
							local10.anInt1632 = (local10.anInt1635 - Static77.anInt1648 << 8) / local14;
							local10.anInt1631 = (local10.anInt1626 - Static173.anInt3690 << 8) / local14;
							local10.anInt1623 = (local10.anInt1637 - Static173.anInt3690 << 8) / local14;
							Static47.aClass58Array1[Static21.anInt518++] = local10;
						}
					}
				}
			}
		}
	}
}
