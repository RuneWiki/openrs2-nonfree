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

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public static int anInt2164 = -2;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString70 = null;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "Lclient!qg;")
	public static Class131 aClass131_3 = new Class131();

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
	public static int[] anIntArray220 = new int[2048];

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)Z")
	public static boolean method1636() {
		if (Static130.aBoolean148) {
			try {
				return !((Boolean) Static301.method406("showingVideoAd", Static43.aClass66_1.anApplet1));
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public static void method1637() {
		Static253.anInt5520++;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!kn;IZ)V")
	public static void method1641(@OriginalArg(0) Class1_Sub16_Sub1 arg0) {
		while (true) {
			@Pc(18) Class1_Sub7 local18 = (Class1_Sub7) Static282.aClass131_27.method3791();
			if (local18 == null) {
				return;
			}
			@Pc(25) boolean local25 = false;
			@Pc(27) int local27;
			for (local27 = 0; local27 < local18.anInt1386; local27++) {
				if (local18.aClass43Array1[local27] != null) {
					if (local18.aClass43Array1[local27].anInt1456 == 2) {
						local18.anIntArray143[local27] = -5;
					}
					if (local18.aClass43Array1[local27].anInt1456 == 0) {
						local25 = true;
					}
				}
				if (local18.aClass43Array2[local27] != null) {
					if (local18.aClass43Array2[local27].anInt1456 == 2) {
						local18.anIntArray143[local27] = -6;
					}
					if (local18.aClass43Array2[local27].anInt1456 == 0) {
						local25 = true;
					}
				}
			}
			if (local25) {
				return;
			}
			arg0.method2676(146);
			arg0.method2621(0);
			local27 = arg0.anInt3328;
			arg0.method2606(local18.anInt1387);
			for (@Pc(116) int local116 = 0; local116 < local18.anInt1386; local116++) {
				if (local18.anIntArray143[local116] == 0) {
					try {
						@Pc(146) int local146 = local18.anIntArray144[local116];
						@Pc(158) Field local158;
						@Pc(162) int local162;
						if (local146 == 0) {
							local158 = (Field) local18.aClass43Array1[local116].anObject3;
							local162 = local158.getInt(null);
							arg0.method2621(0);
							arg0.method2606(local162);
						} else if (local146 == 1) {
							local158 = (Field) local18.aClass43Array1[local116].anObject3;
							local158.setInt(null, local18.anIntArray145[local116]);
							arg0.method2621(0);
						} else if (local146 == 2) {
							local158 = (Field) local18.aClass43Array1[local116].anObject3;
							local162 = local158.getModifiers();
							arg0.method2621(0);
							arg0.method2606(local162);
						}
						@Pc(232) Method local232;
						if (local146 == 3) {
							local232 = (Method) local18.aClass43Array2[local116].anObject3;
							@Pc(257) byte[][] local257 = local18.aByteArrayArrayArray8[local116];
							@Pc(261) Object[] local261 = new Object[local257.length];
							for (@Pc(263) int local263 = 0; local263 < local257.length; local263++) {
								@Pc(281) ObjectInputStream local281 = new ObjectInputStream(new ByteArrayInputStream(local257[local263]));
								local261[local263] = local281.readObject();
							}
							@Pc(294) Object local294 = local232.invoke(null, local261);
							if (local294 == null) {
								arg0.method2621(0);
							} else if (local294 instanceof Number) {
								arg0.method2621(1);
								arg0.method2631(((Number) local294).longValue());
							} else if (local294 instanceof String) {
								arg0.method2621(2);
								arg0.method2630((String) local294);
							} else {
								arg0.method2621(4);
							}
						} else if (local146 == 4) {
							local232 = (Method) local18.aClass43Array2[local116].anObject3;
							local162 = local232.getModifiers();
							arg0.method2621(0);
							arg0.method2606(local162);
						}
					} catch (@Pc(338) ClassNotFoundException local338) {
						arg0.method2621(-10);
					} catch (@Pc(344) InvalidClassException local344) {
						arg0.method2621(-11);
					} catch (@Pc(350) StreamCorruptedException local350) {
						arg0.method2621(-12);
					} catch (@Pc(356) OptionalDataException local356) {
						arg0.method2621(-13);
					} catch (@Pc(362) IllegalAccessException local362) {
						arg0.method2621(-14);
					} catch (@Pc(368) IllegalArgumentException local368) {
						arg0.method2621(-15);
					} catch (@Pc(374) InvocationTargetException local374) {
						arg0.method2621(-16);
					} catch (@Pc(380) SecurityException local380) {
						arg0.method2621(-17);
					} catch (@Pc(386) IOException local386) {
						arg0.method2621(-18);
					} catch (@Pc(392) NullPointerException local392) {
						arg0.method2621(-19);
					} catch (@Pc(398) Exception local398) {
						arg0.method2621(-20);
					} catch (@Pc(404) Throwable local404) {
						arg0.method2621(-21);
					}
				} else {
					arg0.method2621(local18.anIntArray143[local116]);
				}
			}
			arg0.method2614(local27);
			arg0.method2627(arg0.anInt3328 - local27);
			local18.method4742();
		}
	}
}
