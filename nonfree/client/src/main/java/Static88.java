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

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "[Lclient!hi;")
	public static Class59[] aClass59Array2;

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)I")
	public static int method1413(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
	public static void method1416() {
		aClass59Array2 = null;
		aStringArray14 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V")
	public static void method1417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static284.method4277(arg2);
		@Pc(16) int local16 = arg2 - arg4;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(30) int local30 = -arg2;
		@Pc(32) int local32 = arg2;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = -local16;
		@Pc(39) int local39 = local16;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = -1;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(88) int local88;
		if (Static171.anInt3392 <= arg0 && arg0 <= Static141.anInt2889) {
			@Pc(53) int[] local53 = Static234.anIntArrayArray40[arg0];
			local62 = Static142.method2311(arg5 - arg2, Static154.anInt3126, Static211.anInt4200);
			local71 = Static142.method2311(arg5 + arg2, Static154.anInt3126, Static211.anInt4200);
			local80 = Static142.method2311(arg5 - local16, Static154.anInt3126, Static211.anInt4200);
			local88 = Static142.method2311(arg5 + local16, Static154.anInt3126, Static211.anInt4200);
			Static129.method2127(local80, local62, arg1, local53);
			Static129.method2127(local88, local80, arg3, local53);
			Static129.method2127(local71, local88, arg1, local53);
		}
		while (local32 > local34) {
			local41 += 2;
			local43 += 2;
			local37 += local43;
			local30 += local41;
			if (local37 >= 0 && local39 >= 1) {
				local39--;
				local37 -= local39 << 1;
				Static281.anIntArray476[local39] = local34;
			}
			local34++;
			@Pc(214) int local214;
			@Pc(222) int local222;
			@Pc(230) int[] local230;
			@Pc(160) int local160;
			if (local30 >= 0) {
				local32--;
				local30 -= local32 << 1;
				local160 = arg0 - local32;
				local62 = arg0 + local32;
				if (Static171.anInt3392 <= local62 && Static141.anInt2889 >= local160) {
					if (local16 > local32) {
						local71 = Static281.anIntArray476[local32];
						local80 = Static142.method2311(local34 + arg5, Static154.anInt3126, Static211.anInt4200);
						local88 = Static142.method2311(arg5 - local34, Static154.anInt3126, Static211.anInt4200);
						local214 = Static142.method2311(local71 + arg5, Static154.anInt3126, Static211.anInt4200);
						local222 = Static142.method2311(arg5 - local71, Static154.anInt3126, Static211.anInt4200);
						if (Static141.anInt2889 >= local62) {
							local230 = Static234.anIntArrayArray40[local62];
							Static129.method2127(local222, local88, arg1, local230);
							Static129.method2127(local214, local222, arg3, local230);
							Static129.method2127(local80, local214, arg1, local230);
						}
						if (Static171.anInt3392 <= local160) {
							local230 = Static234.anIntArrayArray40[local160];
							Static129.method2127(local222, local88, arg1, local230);
							Static129.method2127(local214, local222, arg3, local230);
							Static129.method2127(local80, local214, arg1, local230);
						}
					} else {
						local71 = Static142.method2311(local34 + arg5, Static154.anInt3126, Static211.anInt4200);
						local80 = Static142.method2311(arg5 - local34, Static154.anInt3126, Static211.anInt4200);
						if (local62 <= Static141.anInt2889) {
							Static129.method2127(local71, local80, arg1, Static234.anIntArrayArray40[local62]);
						}
						if (Static171.anInt3392 <= local160) {
							Static129.method2127(local71, local80, arg1, Static234.anIntArrayArray40[local160]);
						}
					}
				}
			}
			local160 = arg0 - local34;
			local62 = arg0 + local34;
			if (local62 >= Static171.anInt3392 && Static141.anInt2889 >= local160) {
				local80 = arg5 - local32;
				local71 = arg5 + local32;
				if (local71 >= Static211.anInt4200 && Static154.anInt3126 >= local80) {
					local71 = Static142.method2311(local71, Static154.anInt3126, Static211.anInt4200);
					local80 = Static142.method2311(local80, Static154.anInt3126, Static211.anInt4200);
					if (local16 > local34) {
						local88 = local39 >= local34 ? local39 : Static281.anIntArray476[local34];
						local214 = Static142.method2311(arg5 + local88, Static154.anInt3126, Static211.anInt4200);
						local222 = Static142.method2311(arg5 - local88, Static154.anInt3126, Static211.anInt4200);
						if (local62 <= Static141.anInt2889) {
							local230 = Static234.anIntArrayArray40[local62];
							Static129.method2127(local222, local80, arg1, local230);
							Static129.method2127(local214, local222, arg3, local230);
							Static129.method2127(local71, local214, arg1, local230);
						}
						if (local160 >= Static171.anInt3392) {
							local230 = Static234.anIntArrayArray40[local160];
							Static129.method2127(local222, local80, arg1, local230);
							Static129.method2127(local214, local222, arg3, local230);
							Static129.method2127(local71, local214, arg1, local230);
						}
					} else {
						if (Static141.anInt2889 >= local62) {
							Static129.method2127(local71, local80, arg1, Static234.anIntArrayArray40[local62]);
						}
						if (Static171.anInt3392 <= local160) {
							Static129.method2127(local71, local80, arg1, Static234.anIntArrayArray40[local160]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZI)V")
	public static void method1421(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub2_Sub21 local14 = Static39.method4121(arg0, 9);
		local14.method4361();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLclient!ie;)V")
	public static void method1422(@OriginalArg(2) Class4_Sub17_Sub1 arg0) {
		while (true) {
			@Pc(15) Class4_Sub29 local15 = (Class4_Sub29) Static233.aClass10_48.method190();
			if (local15 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			@Pc(23) int local23;
			for (local23 = 0; local23 < local15.anInt5173; local23++) {
				if (local15.aClass123Array2[local23] != null) {
					if (local15.aClass123Array2[local23].anInt3791 == 2) {
						local15.anIntArray456[local23] = -5;
					}
					if (local15.aClass123Array2[local23].anInt3791 == 0) {
						local21 = true;
					}
				}
				if (local15.aClass123Array1[local23] != null) {
					if (local15.aClass123Array1[local23].anInt3791 == 2) {
						local15.anIntArray456[local23] = -6;
					}
					if (local15.aClass123Array1[local23].anInt3791 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method1905(167);
			arg0.method1861(0);
			local23 = arg0.anInt2400;
			arg0.method1854(local15.anInt5181);
			for (@Pc(114) int local114 = 0; local114 < local15.anInt5173; local114++) {
				if (local15.anIntArray456[local114] == 0) {
					try {
						@Pc(140) int local140 = local15.anIntArray457[local114];
						@Pc(155) Field local155;
						@Pc(181) int local181;
						if (local140 == 0) {
							local155 = (Field) local15.aClass123Array2[local114].anObject4;
							local181 = local155.getInt(null);
							arg0.method1861(0);
							arg0.method1854(local181);
						} else if (local140 == 1) {
							local155 = (Field) local15.aClass123Array2[local114].anObject4;
							local155.setInt(null, local15.anIntArray458[local114]);
							arg0.method1861(0);
						} else if (local140 == 2) {
							local155 = (Field) local15.aClass123Array2[local114].anObject4;
							local181 = local155.getModifiers();
							arg0.method1861(0);
							arg0.method1854(local181);
						}
						@Pc(222) Method local222;
						if (local140 == 3) {
							local222 = (Method) local15.aClass123Array1[local114].anObject4;
							@Pc(227) byte[][] local227 = local15.aByteArrayArrayArray19[local114];
							@Pc(231) Object[] local231 = new Object[local227.length];
							for (@Pc(233) int local233 = 0; local233 < local227.length; local233++) {
								@Pc(247) ObjectInputStream local247 = new ObjectInputStream(new ByteArrayInputStream(local227[local233]));
								local231[local233] = local247.readObject();
							}
							@Pc(260) Object local260 = local222.invoke(null, local231);
							if (local260 == null) {
								arg0.method1861(0);
							} else if (local260 instanceof Number) {
								arg0.method1861(1);
								arg0.method1891(((Number) local260).longValue());
							} else if (local260 instanceof String) {
								arg0.method1861(2);
								arg0.method1849((String) local260);
							} else {
								arg0.method1861(4);
							}
						} else if (local140 == 4) {
							local222 = (Method) local15.aClass123Array1[local114].anObject4;
							local181 = local222.getModifiers();
							arg0.method1861(0);
							arg0.method1854(local181);
						}
					} catch (@Pc(330) ClassNotFoundException local330) {
						arg0.method1861(-10);
					} catch (@Pc(336) InvalidClassException local336) {
						arg0.method1861(-11);
					} catch (@Pc(342) StreamCorruptedException local342) {
						arg0.method1861(-12);
					} catch (@Pc(348) OptionalDataException local348) {
						arg0.method1861(-13);
					} catch (@Pc(354) IllegalAccessException local354) {
						arg0.method1861(-14);
					} catch (@Pc(360) IllegalArgumentException local360) {
						arg0.method1861(-15);
					} catch (@Pc(366) InvocationTargetException local366) {
						arg0.method1861(-16);
					} catch (@Pc(372) SecurityException local372) {
						arg0.method1861(-17);
					} catch (@Pc(378) IOException local378) {
						arg0.method1861(-18);
					} catch (@Pc(384) NullPointerException local384) {
						arg0.method1861(-19);
					} catch (@Pc(390) Exception local390) {
						arg0.method1861(-20);
					} catch (@Pc(396) Throwable local396) {
						arg0.method1861(-21);
					}
				} else {
					arg0.method1861(local15.anIntArray456[local114]);
				}
			}
			arg0.method1888(local23);
			arg0.method1867(arg0.anInt2400 - local23);
			local15.method4391();
		}
	}
}
