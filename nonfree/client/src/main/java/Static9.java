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

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "[S")
	public static final short[] aShortArray9 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!io;II)V")
	public static void method150(@OriginalArg(0) Class7_Sub3_Sub2 arg0) {
		while (true) {
			@Pc(13) Class7_Sub19 local13 = (Class7_Sub19) Static157.aClass74_21.method1793();
			if (local13 == null) {
				return;
			}
			@Pc(18) boolean local18 = false;
			for (@Pc(20) int local20 = 0; local20 < local13.anInt3297; local20++) {
				if (local13.aClass99Array1[local20] != null) {
					if (local13.aClass99Array1[local20].anInt2836 == 2) {
						local13.anIntArray437[local20] = -5;
					}
					if (local13.aClass99Array1[local20].anInt2836 == 0) {
						local18 = true;
					}
				}
				if (local13.aClass99Array2[local20] != null) {
					if (local13.aClass99Array2[local20].anInt2836 == 2) {
						local13.anIntArray437[local20] = -6;
					}
					if (local13.aClass99Array2[local20].anInt2836 == 0) {
						local18 = true;
					}
				}
			}
			if (local18) {
				return;
			}
			arg0.method2799(87);
			arg0.method2735(0);
			@Pc(95) int local95 = arg0.anInt3005;
			arg0.method2765(local13.anInt3300);
			for (@Pc(102) int local102 = 0; local102 < local13.anInt3297; local102++) {
				if (local13.anIntArray437[local102] == 0) {
					try {
						@Pc(126) int local126 = local13.anIntArray438[local102];
						@Pc(138) Field local138;
						@Pc(142) int local142;
						if (local126 == 0) {
							local138 = (Field) local13.aClass99Array1[local102].anObject2;
							local142 = local138.getInt(null);
							arg0.method2735(0);
							arg0.method2765(local142);
						} else if (local126 == 1) {
							local138 = (Field) local13.aClass99Array1[local102].anObject2;
							local138.setInt(null, local13.anIntArray439[local102]);
							arg0.method2735(0);
						} else if (local126 == 2) {
							local138 = (Field) local13.aClass99Array1[local102].anObject2;
							local142 = local138.getModifiers();
							arg0.method2735(0);
							arg0.method2765(local142);
						}
						@Pc(208) Method local208;
						if (local126 == 3) {
							local208 = (Method) local13.aClass99Array2[local102].anObject2;
							@Pc(213) byte[][] local213 = local13.aByteArrayArrayArray6[local102];
							@Pc(217) Object[] local217 = new Object[local213.length];
							for (@Pc(219) int local219 = 0; local219 < local213.length; local219++) {
								@Pc(231) ObjectInputStream local231 = new ObjectInputStream(new ByteArrayInputStream(local213[local219]));
								local217[local219] = local231.readObject();
							}
							@Pc(246) Object local246 = local208.invoke(null, local217);
							if (local246 == null) {
								arg0.method2735(0);
							} else if (local246 instanceof Number) {
								arg0.method2735(1);
								arg0.method2777(((Number) local246).longValue());
							} else if (local246 instanceof String) {
								arg0.method2735(2);
								arg0.method2738((String) local246);
							} else {
								arg0.method2735(4);
							}
						} else if (local126 == 4) {
							local208 = (Method) local13.aClass99Array2[local102].anObject2;
							local142 = local208.getModifiers();
							arg0.method2735(0);
							arg0.method2765(local142);
						}
					} catch (@Pc(314) ClassNotFoundException local314) {
						arg0.method2735(-10);
					} catch (@Pc(322) InvalidClassException local322) {
						arg0.method2735(-11);
					} catch (@Pc(328) StreamCorruptedException local328) {
						arg0.method2735(-12);
					} catch (@Pc(336) OptionalDataException local336) {
						arg0.method2735(-13);
					} catch (@Pc(342) IllegalAccessException local342) {
						arg0.method2735(-14);
					} catch (@Pc(348) IllegalArgumentException local348) {
						arg0.method2735(-15);
					} catch (@Pc(354) InvocationTargetException local354) {
						arg0.method2735(-16);
					} catch (@Pc(360) SecurityException local360) {
						arg0.method2735(-17);
					} catch (@Pc(366) IOException local366) {
						arg0.method2735(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method2735(-19);
					} catch (@Pc(382) Exception local382) {
						arg0.method2735(-20);
					} catch (@Pc(388) Throwable local388) {
						arg0.method2735(-21);
					}
				} else {
					arg0.method2735(local13.anIntArray437[local102]);
				}
			}
			arg0.method2760(local95);
			arg0.method2768(arg0.anInt3005 - local95);
			local13.method5648();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIII)Lclient!ji;")
	public static Class7_Sub17 method151(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class7_Sub17 local7 = new Class7_Sub17();
		local7.anInt3249 = arg1;
		local7.anInt3252 = arg3;
		Static247.aClass10_40.method161((long) arg2, local7);
		Static173.method3247(arg3);
		@Pc(26) Class26 local26 = Static245.method4231(arg2);
		if (local26 != null) {
			Static245.method4226(local26);
		}
		if (Static165.aClass26_19 != null) {
			Static245.method4226(Static165.aClass26_19);
			Static165.aClass26_19 = null;
		}
		Static212.method3767();
		if (local26 != null) {
			Static70.method1378(local26, !arg0);
		}
		if (!arg0) {
			Static83.method1762(arg3);
		}
		if (!arg0 && Static161.anInt3337 != -1) {
			Static325.method5214(1, Static161.anInt3337);
		}
		return local7;
	}
}
