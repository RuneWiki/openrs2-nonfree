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

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array3;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_3;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_3;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Lclient!na;")
	private static Class53 aClass53_95 = Static109.method1737("Loaded title screen");

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_94 = aClass53_95;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array2 = new Class53[100];

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	public static int anInt230 = -1;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public static int anInt231 = 0;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!te;")
	public static Class75 aClass75_6 = new Class75(128);

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public static int anInt237 = 0;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
	public static int anInt243 = 2;

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "[I")
	public static int[] anIntArray21 = new int[25];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!gf;I)V")
	public static void method135(@OriginalArg(0) Class3_Sub1_Sub5_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static124.anIntArray417.length; local9++) {
			Static124.anIntArray417[local9] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * 128.0D * Math.random());
			Static124.anIntArray417[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(67) int local67;
		for (local36 = 0; local36 < 20; local36++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local67 = local59 + (local55 << 7);
					Static73.anIntArray233[local67] = (Static124.anIntArray417[local67 + 1] + Static124.anIntArray417[local67 - 1] + Static124.anIntArray417[local67 - 128] + Static124.anIntArray417[local67 + 128]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static124.anIntArray417;
			Static124.anIntArray417 = Static73.anIntArray233;
			Static73.anIntArray233 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt1167; local59++) {
			for (local67 = 0; local67 < arg0.anInt1168; local67++) {
				if (arg0.aByteArray22[local55++] != 0) {
					@Pc(155) int local155 = local67 + arg0.anInt1170 + 16;
					@Pc(162) int local162 = arg0.anInt1172 + local59 + 16;
					@Pc(168) int local168 = local155 + (local162 << 7);
					Static124.anIntArray417[local168] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method138() {
		@Pc(5) Object local5 = Static66.anObject4;
		synchronized (Static66.anObject4) {
			if (Static118.anInt2757 == 0) {
				Static4.aClass6_1.method122(new Class56(), 5);
			}
			Static118.anInt2757 = 600;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZIIBLclient!we;I)V")
	public static void method143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class62 arg3) {
		Static117.anInt2715 = arg2;
		Static62.anInt1638 = 2;
		Static68.aBoolean61 = false;
		Static117.anInt2678 = arg1;
		Static22.aClass62_4 = arg3;
		Static40.anInt1183 = 1;
		Static69.anInt1757 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method145() {
		aClass53Array2 = null;
		anIntArray21 = null;
		aClass62_Sub1_3 = null;
		aClass53_95 = null;
		aClass53_94 = null;
		aClass75_6 = null;
		aClass3_Sub1_Sub5_Sub4Array3 = null;
		aClass3_Sub1_Sub5_Sub3_3 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZLclient!fa;)V")
	public static void method148(@OriginalArg(2) Class3_Sub7_Sub1 arg0) {
		while (true) {
			@Pc(16) Class3_Sub11 local16 = (Class3_Sub11) Static32.aClass11_4.method189();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.anInt1265; local23++) {
				if (local16.aClass22Array1[local23] != null) {
					if (local16.aClass22Array1[local23].anInt864 == 2) {
						local16.anIntArray153[local23] = -5;
					}
					if (local16.aClass22Array1[local23].anInt864 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass22Array2[local23] != null) {
					if (local16.aClass22Array2[local23].anInt864 == 2) {
						local16.anIntArray153[local23] = -6;
					}
					if (local16.aClass22Array2[local23].anInt864 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method662(93);
			arg0.method625(0);
			@Pc(99) int local99 = arg0.anInt964;
			arg0.method642(local16.anInt1261);
			for (@Pc(106) int local106 = 0; local106 < local16.anInt1265; local106++) {
				if (local16.anIntArray153[local106] == 0) {
					try {
						@Pc(127) int local127 = local16.anIntArray151[local106];
						@Pc(136) Field local136;
						@Pc(140) int local140;
						if (local127 == 0) {
							local136 = (Field) local16.aClass22Array1[local106].anObject2;
							local140 = local136.getInt(null);
							arg0.method625(0);
							arg0.method642(local140);
						} else if (local127 == 1) {
							local136 = (Field) local16.aClass22Array1[local106].anObject2;
							local136.setInt(null, local16.anIntArray154[local106]);
							arg0.method625(0);
						} else if (local127 == 2) {
							local136 = (Field) local16.aClass22Array1[local106].anObject2;
							local140 = local136.getModifiers();
							arg0.method625(0);
							arg0.method642(local140);
						}
						@Pc(210) Method local210;
						if (local127 == 3) {
							local210 = (Method) local16.aClass22Array2[local106].anObject2;
							@Pc(215) byte[][] local215 = local16.aByteArrayArrayArray10[local106];
							@Pc(219) Object[] local219 = new Object[local215.length];
							for (@Pc(221) int local221 = 0; local221 < local215.length; local221++) {
								@Pc(233) ObjectInputStream local233 = new ObjectInputStream(new ByteArrayInputStream(local215[local221]));
								local219[local221] = local233.readObject();
							}
							@Pc(252) Object local252 = local210.invoke(null, local219);
							if (local252 == null) {
								arg0.method625(0);
							} else if (local252 instanceof Number) {
								arg0.method625(1);
								arg0.method633(((Number) local252).longValue());
							} else if (local252 instanceof Class53) {
								arg0.method625(2);
								arg0.method598((Class53) local252);
							} else {
								arg0.method625(4);
							}
						} else if (local127 == 4) {
							local210 = (Method) local16.aClass22Array2[local106].anObject2;
							local140 = local210.getModifiers();
							arg0.method625(0);
							arg0.method642(local140);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method625(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method625(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method625(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method625(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method625(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method625(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method625(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method625(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method625(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method625(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method625(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method625(-21);
					}
				} else {
					arg0.method625(local16.anIntArray153[local106]);
				}
			}
			arg0.method654(local99);
			arg0.method648(arg0.anInt964 - local99);
			local16.method1962();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZIIZZ)Lclient!q;")
	public static Class62_Sub1 method151(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class17 local6 = null;
		if (Static27.aClass10_3 != null) {
			local6 = new Class17(arg1, Static27.aClass10_3, Static79.aClass10Array1[arg1], 1000000);
		}
		return new Class62_Sub1(local6, Static109.aClass17_4, arg1, arg3, arg2, arg0);
	}
}
