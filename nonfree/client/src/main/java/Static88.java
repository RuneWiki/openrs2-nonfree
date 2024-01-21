import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt2310;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!he;")
	public static Class11 aClass11_55;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_914 = method1421("hitmarks");

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[B")
	public static byte[] aByteArray14 = new byte[520];

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt2315 = 0;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public static int anInt2318 = 0;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!va;")
	private static Class61 aClass61_915 = method1421("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_916 = aClass61_915;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	public static int anInt2323 = 127;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Lclient!va;")
	public static Class61 aClass61_917 = method1421("@whi@ )4 ");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1417() {
		Static71.aClass15_28.method597();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!pa;II)V")
	public static void method1418(@OriginalArg(0) Class10_Sub10_Sub1 arg0) {
		while (true) {
			@Pc(15) Class10_Sub7 local15 = (Class10_Sub7) Static75.aClass9_7.method72();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt1207; local22++) {
				if (local15.aClass19Array2[local22] != null) {
					if (local15.aClass19Array2[local22].anInt879 == 2) {
						local15.anIntArray132[local22] = -5;
					}
					if (local15.aClass19Array2[local22].anInt879 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass19Array1[local22] != null) {
					if (local15.aClass19Array1[local22].anInt879 == 2) {
						local15.anIntArray132[local22] = -6;
					}
					if (local15.aClass19Array1[local22].anInt879 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1167(186);
			arg0.method1126(0);
			@Pc(102) int local102 = arg0.anInt1957;
			arg0.method1157(local15.anInt1209);
			for (@Pc(109) int local109 = 0; local109 < local15.anInt1207; local109++) {
				if (local15.anIntArray132[local109] == 0) {
					try {
						@Pc(130) int local130 = local15.anIntArray131[local109];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local130 == 0) {
							local142 = (Field) local15.aClass19Array2[local109].anObject2;
							local146 = local142.getInt(null);
							arg0.method1126(0);
							arg0.method1157(local146);
						} else if (local130 == 1) {
							local142 = (Field) local15.aClass19Array2[local109].anObject2;
							local142.setInt(null, local15.anIntArray133[local109]);
							arg0.method1126(0);
						} else if (local130 == 2) {
							local142 = (Field) local15.aClass19Array2[local109].anObject2;
							local146 = local142.getModifiers();
							arg0.method1126(0);
							arg0.method1157(local146);
						}
						@Pc(214) Method local214;
						if (local130 == 3) {
							local214 = (Method) local15.aClass19Array1[local109].anObject2;
							@Pc(219) byte[][] local219 = local15.aByteArrayArrayArray8[local109];
							@Pc(223) Object[] local223 = new Object[local219.length];
							for (@Pc(225) int local225 = 0; local225 < local219.length; local225++) {
								@Pc(237) ObjectInputStream local237 = new ObjectInputStream(new ByteArrayInputStream(local219[local225]));
								local223[local225] = local237.readObject();
							}
							@Pc(252) Object local252 = local214.invoke(null, local223);
							if (local252 == null) {
								arg0.method1126(0);
							} else if (local252 instanceof Number) {
								arg0.method1126(1);
								arg0.method1125(((Number) local252).longValue());
							} else if (local252 instanceof Class61) {
								arg0.method1126(2);
								arg0.method1116((Class61) local252);
							} else {
								arg0.method1126(4);
							}
						} else if (local130 == 4) {
							local214 = (Method) local15.aClass19Array1[local109].anObject2;
							local146 = local214.getModifiers();
							arg0.method1126(0);
							arg0.method1157(local146);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method1126(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method1126(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method1126(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method1126(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method1126(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method1126(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method1126(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method1126(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method1126(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method1126(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method1126(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method1126(-21);
					}
				} else {
					arg0.method1126(local15.anIntArray132[local109]);
				}
			}
			arg0.method1161(local102);
			arg0.method1147(arg0.anInt1957 - local102);
			local15.method1654();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!he;B)V")
	public static void method1419(@OriginalArg(0) Class11 arg0) {
		Static30.aClass11_25 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method1420() {
		aClass61_916 = null;
		aClass61_915 = null;
		aClass11_55 = null;
		aClass61_917 = null;
		anIntArray306 = null;
		aClass61_914 = null;
		aByteArray14 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!va;")
	public static Class61 method1421(@OriginalArg(0) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = local11.length;
		@Pc(20) Class61 local20 = new Class61();
		local20.aByteArray18 = new byte[local16];
		while (local13 < local16) {
			@Pc(32) int local32 = local11[local13++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local16 <= local13) {
					break;
				}
				@Pc(52) int local52 = local11[local13++] & 0xFF;
				local20.aByteArray18[local20.anInt2559++] = (byte) (local52 + local32 * 43 - 48 - 1720);
			} else {
				local20.aByteArray18[local20.anInt2559++] = (byte) local32;
			}
		}
		local20.method1606();
		return local20.method1590();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public static void method1422(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static46.method735(Static15.aClass61_164, Static65.aClass61_723, Static62.aClass61_703);
		} else if (arg0 == -2) {
			Static46.method735(Static15.aClass61_133, Static15.aClass61_167, Static42.aClass61_940);
		} else if (arg0 == -1) {
			Static46.method735(Static15.aClass61_141, Static53.aClass61_607, Static62.aClass61_704);
		} else if (arg0 == 3) {
			Static46.method735(Static15.aClass61_137, Static15.aClass61_149, Static51.aClass61_588);
		} else if (arg0 == 4) {
			Static46.method735(Static15.aClass61_146, Static98.aClass61_1017, Static7.aClass61_22);
		} else if (arg0 == 5) {
			Static46.method735(Static15.aClass61_147, Static30.aClass61_366, Static83.aClass61_895);
		} else if (arg0 == 6) {
			Static46.method735(Static15.aClass61_131, Static89.aClass61_918, Static29.aClass61_342);
		} else if (arg0 == 7) {
			Static46.method735(Static15.aClass61_169, Static5.aClass61_11, Static19.aClass61_224);
		} else if (arg0 == 8) {
			Static46.method735(Static15.aClass61_135, Static83.aClass61_894, Static30.aClass61_367);
		} else if (arg0 == 9) {
			Static46.method735(Static15.aClass61_130, Static104.aClass61_1054, Static79.aClass61_854);
		} else if (arg0 == 10) {
			Static46.method735(Static15.aClass61_153, Static83.aClass61_891, Static7.aClass61_17);
		} else if (arg0 == 11) {
			Static46.method735(Static15.aClass61_136, Static48.aClass61_556, Static20.aClass61_1070);
		} else if (arg0 == 12) {
			Static46.method735(Static15.aClass61_159, Static43.aClass61_499, Static13.aClass61_103);
		} else if (arg0 == 13) {
			Static46.method735(Static15.aClass61_162, Static102.aClass61_1038, Static62.aClass61_706);
		} else if (arg0 == 14) {
			Static46.method735(Static15.aClass61_142, Static93.aClass61_807, Static61.aClass61_675);
		} else if (arg0 == 16) {
			Static46.method735(Static15.aClass61_155, Static56.aClass61_626, Static61.aClass61_677);
		} else if (arg0 == 17) {
			Static46.method735(Static15.aClass61_152, Static94.aClass61_966, Static37.aClass61_430);
		} else if (arg0 == 18) {
			Static46.method735(Static15.aClass61_157, Static55.aClass61_619, Static98.aClass61_1013);
		} else if (arg0 == 20) {
			Static46.method735(Static15.aClass61_165, Static25.aClass61_302, Static62.aClass61_705);
		} else if (arg0 == 22) {
			Static46.method735(Static15.aClass61_138, Static61.aClass61_676, Static80.aClass61_865);
		} else if (arg0 == 23) {
			Static46.method735(Static15.aClass61_126, Static11.aClass61_85, Static61.aClass61_673);
		} else if (arg0 == 24) {
			Static46.method735(Static15.aClass61_122, Static19.aClass61_217, Static71.aClass61_754);
		} else if (arg0 == 25) {
			Static46.method735(Static15.aClass61_128, Static33.aClass61_397, Static62.aClass61_707);
		} else if (arg0 == 26) {
			Static46.method735(Static15.aClass61_121, Static40.aClass61_456, Static104.aClass61_1053);
		} else {
			Static46.method735(Static15.aClass61_161, Static51.aClass61_578, Static62.aClass61_708);
		}
		Static50.method780(10);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!he;Lclient!he;)I")
	public static int method1423(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(1) int local1 = 0;
		if (arg1.method224(Static83.aClass61_893, Static15.aClass61_139)) {
			local1++;
		}
		if (arg0.method224(Static39.aClass61_78, Static15.aClass61_139)) {
			local1++;
		}
		if (arg0.method224(Static12.aClass61_87, Static15.aClass61_139)) {
			local1++;
		}
		if (arg0.method224(Static8.aClass61_73, Static15.aClass61_139)) {
			local1++;
		}
		if (arg0.method224(Static69.aClass61_746, Static15.aClass61_139)) {
			local1++;
		}
		return local1;
	}
}
