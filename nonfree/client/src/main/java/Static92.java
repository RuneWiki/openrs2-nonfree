import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!ge;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_46 = new Class36(0, 15);

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[B")
	public static byte[] method1504(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub18 local12 = (Class4_Sub1_Sub18) Static138.aClass24_1.method655((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static346.method4895(local23, local47);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class4_Sub1_Sub18(local17);
			Static138.aClass24_1.method660(local12, (long) arg0);
		}
		return local12.aByteArray86;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!tl;)Ljava/lang/String;")
	public static String method1505(@OriginalArg(1) Class4_Sub30 arg0) {
		return Static257.method3524(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ap;B)V")
	public static void method1506(@OriginalArg(0) Class6_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static175.anInt3261 == arg0.anInt6087 || arg0.anInt6068 == -1 || arg0.anInt6117 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class233 local26 = Static269.aClass10_1.method286(arg0.anInt6068);
			if (local26.aBoolean450 || arg0.anInt6080 + 1 > local26.anIntArray591[arg0.anInt6091]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt6087 - arg0.anInt6105;
			@Pc(60) int local60 = Static175.anInt3261 - arg0.anInt6105;
			@Pc(72) int local72 = arg0.anInt6130 * 128 + arg0.method4763() * 64;
			@Pc(83) int local83 = arg0.anInt6143 * 128 + arg0.method4763() * 64;
			@Pc(95) int local95 = arg0.anInt6086 * 128 + arg0.method4763() * 64;
			@Pc(107) int local107 = arg0.anInt6092 * 128 + arg0.method4763() * 64;
			arg0.anInt6062 = (local60 * local95 + local72 * (local54 - local60)) / local54;
			arg0.anInt6061 = (local60 * local107 + local83 * (local54 - local60)) / local54;
		}
		arg0.anInt6146 = 0;
		if (arg0.anInt6115 == 0) {
			arg0.method4766(8192);
		}
		if (arg0.anInt6115 == 1) {
			arg0.method4766(12288);
		}
		if (arg0.anInt6115 == 2) {
			arg0.method4766(0);
		}
		if (arg0.anInt6115 == 3) {
			arg0.method4766(4096);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!of;)V")
	public static void method1507(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub30_Sub1 arg1) {
		while (true) {
			@Pc(15) Class4_Sub33 local15 = (Class4_Sub33) Static178.aClass258_27.method5538();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt5718; local22++) {
				if (local15.aClass108Array2[local22] != null) {
					if (local15.aClass108Array2[local22].anInt2803 == 2) {
						local15.anIntArray495[local22] = -5;
					}
					if (local15.aClass108Array2[local22].anInt2803 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass108Array1[local22] != null) {
					if (local15.aClass108Array1[local22].anInt2803 == 2) {
						local15.anIntArray495[local22] = -6;
					}
					if (local15.aClass108Array1[local22].anInt2803 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method3922(arg0);
			arg1.method4871(0);
			@Pc(99) int local99 = arg1.anInt6244;
			arg1.method4861(local15.anInt5719);
			for (@Pc(106) int local106 = 0; local106 < local15.anInt5718; local106++) {
				if (local15.anIntArray495[local106] == 0) {
					try {
						@Pc(127) int local127 = local15.anIntArray494[local106];
						@Pc(136) Field local136;
						@Pc(140) int local140;
						if (local127 == 0) {
							local136 = (Field) local15.aClass108Array2[local106].anObject4;
							local140 = local136.getInt(null);
							arg1.method4871(0);
							arg1.method4861(local140);
						} else if (local127 == 1) {
							local136 = (Field) local15.aClass108Array2[local106].anObject4;
							local136.setInt(null, local15.anIntArray496[local106]);
							arg1.method4871(0);
						} else if (local127 == 2) {
							local136 = (Field) local15.aClass108Array2[local106].anObject4;
							local140 = local136.getModifiers();
							arg1.method4871(0);
							arg1.method4861(local140);
						}
						@Pc(210) Method local210;
						if (local127 == 3) {
							local210 = (Method) local15.aClass108Array1[local106].anObject4;
							@Pc(215) byte[][] local215 = local15.aByteArrayArrayArray10[local106];
							@Pc(219) Object[] local219 = new Object[local215.length];
							for (@Pc(221) int local221 = 0; local221 < local215.length; local221++) {
								@Pc(233) ObjectInputStream local233 = new ObjectInputStream(new ByteArrayInputStream(local215[local221]));
								local219[local221] = local233.readObject();
							}
							@Pc(252) Object local252 = local210.invoke(null, local219);
							if (local252 == null) {
								arg1.method4871(0);
							} else if (local252 instanceof Number) {
								arg1.method4871(1);
								arg1.method4860(((Number) local252).longValue());
							} else if (local252 instanceof String) {
								arg1.method4871(2);
								arg1.method4849((String) local252);
							} else {
								arg1.method4871(4);
							}
						} else if (local127 == 4) {
							local210 = (Method) local15.aClass108Array1[local106].anObject4;
							local140 = local210.getModifiers();
							arg1.method4871(0);
							arg1.method4861(local140);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg1.method4871(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg1.method4871(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg1.method4871(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg1.method4871(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg1.method4871(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg1.method4871(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg1.method4871(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg1.method4871(-17);
					} catch (@Pc(368) IOException local368) {
						arg1.method4871(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg1.method4871(-19);
					} catch (@Pc(380) Exception local380) {
						arg1.method4871(-20);
					} catch (@Pc(386) Throwable local386) {
						arg1.method4871(-21);
					}
				} else {
					arg1.method4871(local15.anIntArray495[local106]);
				}
			}
			arg1.method4885(local99);
			arg1.method4842(arg1.anInt6244 - local99);
			local15.method5854();
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)I")
	public static int method1508(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
