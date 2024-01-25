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

public final class Static95 {

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "Lclient!im;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public static int anInt1576;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!qe;)V")
	public static void method1488(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14_Sub2 arg1) {
		while (true) {
			@Pc(15) Class6_Sub49 local15 = (Class6_Sub49) Static280.aClass275_93.method6366();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt8987; local22++) {
				if (local15.aClass278Array1[local22] != null) {
					if (local15.aClass278Array1[local22].anInt7757 == 2) {
						local15.anIntArray671[local22] = -5;
					}
					if (local15.aClass278Array1[local22].anInt7757 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass278Array2[local22] != null) {
					if (local15.aClass278Array2[local22].anInt7757 == 2) {
						local15.anIntArray671[local22] = -6;
					}
					if (local15.aClass278Array2[local22].anInt7757 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method6049(arg0);
			arg1.method6035(0);
			@Pc(103) int local103 = arg1.anInt7244;
			arg1.method5990(local15.anInt8989);
			for (@Pc(110) int local110 = 0; local110 < local15.anInt8987; local110++) {
				if (local15.anIntArray671[local110] == 0) {
					try {
						@Pc(134) int local134 = local15.anIntArray672[local110];
						@Pc(151) Field local151;
						@Pc(154) int local154;
						if (local134 == 0) {
							local151 = (Field) local15.aClass278Array1[local110].anObject24;
							local154 = local151.getInt(null);
							arg1.method6035(0);
							arg1.method5990(local154);
						} else if (local134 == 1) {
							local151 = (Field) local15.aClass278Array1[local110].anObject24;
							local151.setInt(null, local15.anIntArray673[local110]);
							arg1.method6035(0);
						} else if (local134 == 2) {
							local151 = (Field) local15.aClass278Array1[local110].anObject24;
							local154 = local151.getModifiers();
							arg1.method6035(0);
							arg1.method5990(local154);
						}
						@Pc(213) Method local213;
						if (local134 == 3) {
							local213 = (Method) local15.aClass278Array2[local110].anObject24;
							@Pc(218) byte[][] local218 = local15.aByteArrayArrayArray18[local110];
							@Pc(222) Object[] local222 = new Object[local218.length];
							for (@Pc(224) int local224 = 0; local224 < local218.length; local224++) {
								@Pc(236) ObjectInputStream local236 = new ObjectInputStream(new ByteArrayInputStream(local218[local224]));
								local222[local224] = local236.readObject();
							}
							@Pc(255) Object local255 = local213.invoke(null, local222);
							if (local255 == null) {
								arg1.method6035(0);
							} else if (local255 instanceof Number) {
								arg1.method6035(1);
								arg1.method6007(((Number) local255).longValue());
							} else if (local255 instanceof String) {
								arg1.method6035(2);
								arg1.method5989((String) local255);
							} else {
								arg1.method6035(4);
							}
						} else if (local134 == 4) {
							local213 = (Method) local15.aClass278Array2[local110].anObject24;
							local154 = local213.getModifiers();
							arg1.method6035(0);
							arg1.method5990(local154);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg1.method6035(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg1.method6035(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg1.method6035(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg1.method6035(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg1.method6035(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg1.method6035(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg1.method6035(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg1.method6035(-17);
					} catch (@Pc(369) IOException local369) {
						arg1.method6035(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg1.method6035(-19);
					} catch (@Pc(381) Exception local381) {
						arg1.method6035(-20);
					} catch (@Pc(387) Throwable local387) {
						arg1.method6035(-21);
					}
				} else {
					arg1.method6035(local15.anIntArray671[local110]);
				}
			}
			arg1.method6005(local103);
			arg1.method5985(arg1.anInt7244 - local103);
			local15.method7849();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([[IB)V")
	public static void method1492(@OriginalArg(0) int[][] arg0) {
		Static503.anIntArrayArray12 = arg0;
	}
}
