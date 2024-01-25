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

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_29 = new Class2(22, 7);

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_31 = new Class253(44, 1);

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_30 = new Class2(41, -1);

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[200];

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_40 = new Class55("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method1554() {
		Static121.aFont1 = null;
		Static276.anImage2 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BILclient!dr;)V")
	public static void method1556(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub14_Sub1 arg1) {
		while (true) {
			@Pc(15) Class7_Sub9 local15 = (Class7_Sub9) Static1.aClass85_1.method2010();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt679; local22++) {
				if (local15.aClass236Array2[local22] != null) {
					if (local15.aClass236Array2[local22].anInt6178 == 2) {
						local15.anIntArray63[local22] = -5;
					}
					if (local15.aClass236Array2[local22].anInt6178 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass236Array1[local22] != null) {
					if (local15.aClass236Array1[local22].anInt6178 == 2) {
						local15.anIntArray63[local22] = -6;
					}
					if (local15.aClass236Array1[local22].anInt6178 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method1354(arg0);
			arg1.method3970(0);
			@Pc(100) int local100 = arg1.anInt4989;
			arg1.method3933(local15.anInt680);
			for (@Pc(107) int local107 = 0; local107 < local15.anInt679; local107++) {
				if (local15.anIntArray63[local107] == 0) {
					try {
						@Pc(131) int local131 = local15.anIntArray64[local107];
						@Pc(146) Field local146;
						@Pc(149) int local149;
						if (local131 == 0) {
							local146 = (Field) local15.aClass236Array2[local107].anObject8;
							local149 = local146.getInt(null);
							arg1.method3970(0);
							arg1.method3933(local149);
						} else if (local131 == 1) {
							local146 = (Field) local15.aClass236Array2[local107].anObject8;
							local146.setInt(null, local15.anIntArray62[local107]);
							arg1.method3970(0);
						} else if (local131 == 2) {
							local146 = (Field) local15.aClass236Array2[local107].anObject8;
							local149 = local146.getModifiers();
							arg1.method3970(0);
							arg1.method3933(local149);
						}
						@Pc(210) Method local210;
						if (local131 == 3) {
							local210 = (Method) local15.aClass236Array1[local107].anObject8;
							@Pc(215) byte[][] local215 = local15.aByteArrayArrayArray1[local107];
							@Pc(219) Object[] local219 = new Object[local215.length];
							for (@Pc(221) int local221 = 0; local221 < local215.length; local221++) {
								@Pc(233) ObjectInputStream local233 = new ObjectInputStream(new ByteArrayInputStream(local215[local221]));
								local219[local221] = local233.readObject();
							}
							@Pc(248) Object local248 = local210.invoke(null, local219);
							if (local248 == null) {
								arg1.method3970(0);
							} else if (local248 instanceof Number) {
								arg1.method3970(1);
								arg1.method3934(((Number) local248).longValue());
							} else if (local248 instanceof String) {
								arg1.method3970(2);
								arg1.method3947((String) local248);
							} else {
								arg1.method3970(4);
							}
						} else if (local131 == 4) {
							local210 = (Method) local15.aClass236Array1[local107].anObject8;
							local149 = local210.getModifiers();
							arg1.method3970(0);
							arg1.method3933(local149);
						}
					} catch (@Pc(316) ClassNotFoundException local316) {
						arg1.method3970(-10);
					} catch (@Pc(322) InvalidClassException local322) {
						arg1.method3970(-11);
					} catch (@Pc(328) StreamCorruptedException local328) {
						arg1.method3970(-12);
					} catch (@Pc(334) OptionalDataException local334) {
						arg1.method3970(-13);
					} catch (@Pc(340) IllegalAccessException local340) {
						arg1.method3970(-14);
					} catch (@Pc(346) IllegalArgumentException local346) {
						arg1.method3970(-15);
					} catch (@Pc(352) InvocationTargetException local352) {
						arg1.method3970(-16);
					} catch (@Pc(358) SecurityException local358) {
						arg1.method3970(-17);
					} catch (@Pc(364) IOException local364) {
						arg1.method3970(-18);
					} catch (@Pc(370) NullPointerException local370) {
						arg1.method3970(-19);
					} catch (@Pc(376) Exception local376) {
						arg1.method3970(-20);
					} catch (@Pc(382) Throwable local382) {
						arg1.method3970(-21);
					}
				} else {
					arg1.method3970(local15.anIntArray63[local107]);
				}
			}
			arg1.method3959(local100);
			arg1.method3960(arg1.anInt4989 - local100);
			local15.method5802();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method1557(@OriginalArg(1) Class51 arg0) {
		if (Static425.aBoolean471) {
			Static370.method4736(arg0);
		} else {
			Static293.method3879(arg0);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
	public static int method1559(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local10 += 4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return arg0 + local10;
	}
}
